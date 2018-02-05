package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    @Autowired
    CosmeticsRepository cosmeticsRepository;
    @Autowired
    CleaningItemsRepository cleaningItemsRepository;
    @Autowired
    SnacksRepository snacksRepository;


    @RequestMapping("/")
    public String listJbc(Model model){
        model.addAttribute("cosmetics", cosmeticsRepository.findAll());
        model.addAttribute("cleaningitems", cleaningItemsRepository.findAll());
        model.addAttribute("snacks",snacksRepository.findAll());
        return "list";
    }

    @GetMapping("/addcosmetics")
    public String cosmeticsForm(Model model){
        model.addAttribute("cosmetic", new Cosmetics());
        return "cosmeticsform";
     }

    @PostMapping("/processcosmetics")
    public String processcosmeticForm(@Valid @ModelAttribute("cosmetic") Cosmetics cosmetics, BindingResult result) {
        if (result.hasErrors()) {
            return "cosmeticsform";
        }
        cosmeticsRepository.save(cosmetics);
        return "redirect:/";
    }


    @GetMapping("/addcleaningitems")
    public String cleaningitemsForm(Model model){
        model.addAttribute("cleaningitem", new CleaningItems());
        return "cleaningitemsform";
    }

    @PostMapping("/processcleaningitems")
    public String processcleaningitemForm(@Valid @ModelAttribute("cleaningitem") CleaningItems cleaningitems,BindingResult result){
        if(result.hasErrors()){
            return "cleaningitemsform";
        }
        cleaningItemsRepository.save(cleaningitems);
        System.out.println(cleaningitems.getCleaningprice());
        System.out.println(cleaningitems.getCleaningquantity());
        return "redirect:/";

    }



    @GetMapping("/addsnacks")
    public String snacksForm(Model model){
        model.addAttribute("snack", new Snacks());
        return "snacksform";
    }



    @PostMapping("/processsnacks")
    public String processsnackForm(@Valid @ModelAttribute("snack") Snacks snacks,BindingResult result){
        if(result.hasErrors()){
            return "snacksform";
        }
        snacksRepository.save(snacks);
        return "redirect:/";
    }

}
