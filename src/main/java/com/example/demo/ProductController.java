package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/test")
public class ProductController {

    @Autowired
    private IProductRepo repo;

    @GetMapping("")
    public String view(Model model){
        List<Product> list = repo.findAll();
        model.addAttribute("list", list);
        return "test";
    }

}
