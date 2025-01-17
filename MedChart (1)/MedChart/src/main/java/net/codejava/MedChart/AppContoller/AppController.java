/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.MedChart.AppContoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author amaya
 */
@Controller
public class AppController {
    @GetMapping("/Home")
    public ModelAndView HomePage() {
        return new ModelAndView("Home");
    }
    
    @GetMapping("/SignUp")
    public ModelAndView SignupPage() {
        return new ModelAndView("SignUp");
    }
    
    
    @GetMapping("/Login")
    public String LoginPage() {
        return "Login";
    }
    
  
    
     @GetMapping("/admin/Home") 
    public String home() {
        return "index";
    }
    
    
    @GetMapping("/Account_Settings")
    public ModelAndView Account_SettingsPage() {
        return new ModelAndView("Account_Settings");
    }
    
    
    @GetMapping("/Assistance")
    public ModelAndView AssistancePage() {
        return new ModelAndView("Assistance");
    }
    
    @GetMapping("/Check_In")
    public ModelAndView Check_InPage() {
        return new ModelAndView("Check_In");
    }
    
    @GetMapping("/Medical_Status")
    public ModelAndView Medical_StatusPage() {
        return new ModelAndView("Medical_Status");
    }
    
    @GetMapping("/Messages")
    public ModelAndView MessagesPage() {
        return new ModelAndView("Messages");
    }
    
    @GetMapping("/New_Message")
    public ModelAndView New_MessagePage() {
        return new ModelAndView("New_Message");
    }
    
    @GetMapping("/Room_Management")
    public ModelAndView Room_ManagementPage() {
        return new ModelAndView("Room_Management");
    }
    
    @GetMapping("/Test_Results")
    public ModelAndView Test_ResultsPage() {
        return new ModelAndView("Test_Results");
    }
   
    
}
