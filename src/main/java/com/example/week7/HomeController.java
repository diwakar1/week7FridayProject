package com.example.week7;

import ch.qos.logback.core.net.AutoFlushingObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    FruitRepository fruitRepository;

    @Autowired
    WeekdayRepository weekdayRepository;

    @GetMapping("/")
    public String Home(Model model) {
        return "base";
    }

    @RequestMapping ("/weeklist")
    public String home(Model model){
        model.addAttribute("weeklist",weekdayRepository.findAll());
        return "index";






    }

}
