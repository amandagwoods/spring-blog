package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.ThreadLocalRandom;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String rollDice(){
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{num}")
    public String guess(@PathVariable int num, Model model){
        int dice = ThreadLocalRandom.current().nextInt(1, 6+1);
        model.addAttribute("num", num);
        model.addAttribute("dice", dice);
        return "roll-dice";
    }
}
