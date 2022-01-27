package com.example.foodShop.controller;

import com.example.foodShop.model.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String getPage(){
        return "admin---page";
    }

    @GetMapping("/getFoodBase")
    public String getFoodBase(){
        return "food---base";
    }

    @GetMapping("/getOrdersPage")
    public String getOrdersPage(){
        return "";
    }

    @GetMapping("/addNewAdmin")
    public String addNewAdmin(){
        return "";
    }

    @GetMapping("/getNewFoodPage")
    public String getNewFoodPage(Model model){
        model.addAttribute("food",new Food());
        return "new---food";
    }

    @PostMapping("/addNewFood")
    public String addNewFood(
            @ModelAttribute("food") Food theFood,
            @RequestParam("foodImage")MultipartFile multipartFile
            ){



        return "redirect:/admin/getFoodBase";
    }
}
