package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping ("/roll-dice")
        public String viewRollDice(){
            return "/roll-dice";
        }

    @PostMapping("/roll-dice")
    public String rollDice(@RequestParam(name = "num") int num, Model model){
        int rolledNumber = (int) (Math.random() * 6 + 1);
        if(num == rolledNumber){
            model.addAttribute("rolledNumber", rolledNumber);
            model.addAttribute("message1", "You selected: " + num + ". The roll showed: " + rolledNumber +" .");
            model.addAttribute("message2", "You win! You guessed the right number!");
        }else if (num != rolledNumber){
            model.addAttribute("rolledNumber", rolledNumber);
            model.addAttribute("num", num);
            model.addAttribute("message1", "You selected: " + num + ". The roll showed: " + rolledNumber +" .");
            model.addAttribute("message2", "Sorry you lose, your guessed the wrong number.");

        }
            return "/roll-dice";
        }


}
