/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import net.codejava.MedChart.Service.MedStaff_Service;
import net.codejava.MedChart.Service.MedStaff_ServiceImpl;
import net.codejava.MedChart.User.MedStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author amaya
 */
@Controller
public class MedStaff_Controller {

    @Autowired
    private MedStaff_Service MedService;

    //display list of MedStaff
    @GetMapping("/admin/MedStaff")
    public String viewHomePage(Model model) {
        model.addAttribute("listMedStaff", MedService.getAllMedStaffs());
        return "MedStaff";
    }

    @GetMapping("/admin/newMedStaffForm")
    public String MedStaffForm(Model model) {
        MedStaff medStaff = new MedStaff();

        model.addAttribute("medStaff", medStaff);

        return "new_MedStaff";
    }

    @PostMapping("/admin/saveMedStaff")
    public String saveMedStaff(@ModelAttribute("medStaff") MedStaff medstaff) {

        //save to database
        MedService.saveMedStaff(medstaff);

        return "redirect:/admin/MedStaff?success";
    }
    
    @PostMapping("/admin/updateMedStaff")
    public String updateMedStaff(@ModelAttribute("medStaff") MedStaff medstaff) {

        //save to database
        MedService.saveMedStaff(medstaff);

        return "redirect:/admin/MedStaff?update";
    }

    @GetMapping("/formUpdate/{id}")
    public String FormUpdate(@PathVariable(value = "id") long id, Model model) {

        MedStaff medStaff = MedService.getMedStaffById(id);

        model.addAttribute("medStaff", medStaff);

        return "update_MedStaff";
    }

    @GetMapping("/deleteMedStaff/{id}")
    public String deleteMedStaff(@PathVariable(value = "id") long id) {
        //call delete mthd
        this.MedService.deleteMedStaff(id);
        return ("redirect:/admin/MedStaff?delete");
    }
}

