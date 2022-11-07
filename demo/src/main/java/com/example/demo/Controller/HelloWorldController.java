package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloWorldController {
    @GetMapping("/login")   // URL
    public String getLogin() // Methode
    {
        return "login"; // HTML Template für Antwort
    }
    // NEU:  Besprechen : @PostMapping
    // Besprechen: @RequestParam
    @PostMapping("/login")
    public String postLogin(@RequestParam("username") String uname, @RequestParam("password") String password, Model model){
        if(uname == "" || password == ""){
            return "login?error=1";
        }
        model.addAttribute("usereingabe", uname);
        return "helloWorldResponse";
    }
    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }
    @PostMapping("/register")
    public String postRegister(@RequestParam("username") String uname, @RequestParam("password") String password, 
            @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, @RequestParam("age") int age, Model model){
        
        model.addAttribute("usereingabe", uname);
        return "helloWorldResponse";
    }
    @PostMapping("/helloWorld")
    public String postRequest(
        @RequestParam("text1") String str, Model model) {
        // Besprechen : model.addAttribute
        model.addAttribute("usereingabe", str);
        // Auswahl des View Templates
        return "helloWorldResponse";
    }
    

}

