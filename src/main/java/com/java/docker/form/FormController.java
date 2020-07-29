package com.java.docker.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/product")
    public String productForm(Model model){
        model.addAttribute("product",new Product());
        return "product";
    }

    @PostMapping("/product")
    public String productSubmit(@ModelAttribute Product product) {
        return "result";
    }
}

