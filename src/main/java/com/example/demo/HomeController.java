package com.example.demo;

import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.*;
import java.util.ArrayList;

@Controller
public class HomeController {
    ArrayList<Sach> ls = new ArrayList<>();


    public HomeController() {
        ls.add(new Sach("1", "Sach1", "Loai1","TacGia1","Gia1"));
    }

    @GetMapping("/index")
    public String index(Model model) {

        model.addAttribute("listSach", ls);
        return "index";
    }

        @GetMapping("/xoa")
        public String xoa(Model model, @RequestParam("idXoa") String id) {
            Sach sToRemove = null;
            for (Sach s : ls) {
                if (s.getID().equals(id)) {
                    sToRemove = s;
                    break;
                }
            }
        if (sToRemove != null) {
            ls.remove(sToRemove);
        }
        model.addAttribute("listSach", ls);
        return "redirect:index";
    }
//
//
    @PostMapping("/them")
    public String them(Model model,@RequestParam("action") String action , @RequestParam("id") String id, @RequestParam("ten") String ten, @RequestParam("loaisach") String loaisach, @RequestParam("tg") String tacgia, @RequestParam("Gia") String gia) {
        if (action.equals("add")) {
            ls.add(new Sach(id, ten, loaisach,tacgia, gia));
        } else if (action.equals("update")) {
            for (Sach sv : ls) {
                if (sv.getID().equals(id)) {
                    sv.setTen(ten);
                    sv.setLoaiSach(loaisach);
                    sv.setTacGia(tacgia);
                    sv.setGia(gia);
                    break;
                }
            }
        }
        model.addAttribute("listSach", ls);
        return "redirect:index";
    }
    @PostMapping("/sua")
    public String sua(Model model, @RequestParam("id") String id, @RequestParam("ten") String ten , @RequestParam("tacgia") String tacgia, @RequestParam("Gia") String gia) {
        model.addAttribute("id", id);
        model.addAttribute("ten", ten);
        model.addAttribute("tacgia", tacgia);
        model.addAttribute("Gia", gia);
        model.addAttribute("listSach", ls);
        return "index";
    }
//



}
