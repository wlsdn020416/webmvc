package org.example.webmvc.step3.controller;

import jakarta.servlet.http.HttpSession;
import org.example.webmvc.step3.dto.DressDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dress")
public class DressController {
    @GetMapping
    public String page(){
     return "dress";
    }
    @PostMapping("")
    public String form(
//            @RequestParam("name") String name,
//            @RequestParam("price") int price
            @ModelAttribute DressDTO dressDTO,
            HttpSession session
            ){
//        System.out.println("name = " + name);
//        System.out.println("price = " + price);
        System.out.println("dressDTO = " + dressDTO);
        System.out.println("dressDTO.getName() = " + dressDTO.getName());
        System.out.println("dressDTO.getPrice() = " + dressDTO.getPrice());
        session.setAttribute("dress", dressDTO);
        return "redirect:/dress";
    }
}
