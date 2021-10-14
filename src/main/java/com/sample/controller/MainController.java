package com.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

import com.sample.services.OperationsService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    public static String template = "welcome";
    public static String template_sample = "welcome_sample";
    
    @Value("${welcome.message}")
    private String message;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e");

    @GetMapping("/")
    public String mainSalute(Model model) {
 
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);

        return template_sample; //view
    }

    @GetMapping("/hello")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "anonimo")
                    String name, Model model) {
        
        String value  = OperationsService.concatenarDatos(name);
        System.out.println("value is: " + value);
        model.addAttribute("message", value);
       
        return template;
    }

    @RequestMapping(value = "/ex/foos", method = RequestMethod.POST)
    @ResponseBody
    public String getFoosBySimplePath( @RequestParam(name = "user", required = false, defaultValue = "anonimo")
                                                   String name) {
        return OperationsService.concatenarDatos(name) + "\n";
    }
}