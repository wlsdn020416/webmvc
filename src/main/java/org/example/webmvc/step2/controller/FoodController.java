package org.example.webmvc.step2.controller;

import org.example.webmvc.step2.dto.FoodDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class FoodController {
    @GetMapping
    public String index(Model model) {
        System.out.println("FoodController.index");
        model.addAttribute("food", new FoodDTO("미소라멘", 12000));
        return "index";
    }
}
