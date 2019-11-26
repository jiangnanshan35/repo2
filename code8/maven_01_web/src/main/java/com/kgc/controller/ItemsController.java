package com.kgc.controller;

import com.kgc.domain.Items;
import com.kgc.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService service;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items items=service.findById(1);
        System.out.println(items);
        System.out.println("设计费代理商");
        model.addAttribute("item",items);
        return "itemDetail";
    }
    @RequestMapping("/add")
    public String addDetail(Items items){

        service.addItem(items);
        return null;
    }
}
