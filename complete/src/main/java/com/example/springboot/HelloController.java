package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
    }
    
    @GetMapping("/contact")
    public String contact(Model model){
        return "contact";
    }

    @PostMapping("/contact")
    public String postContact(Model model, @RequestBody Contact contact){
        //Contact create object
        System.out.println(contact.getEmail());
        System.out.println(contact.getMessage());
        return "contact";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }

}
