package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

public class RollDiceController {

    @GetMapping ("/roll-dice"){
        public String viewRollDice(){
            return "/roll-dice";
        }
    }
    @GetMapping("/roll-dice/{guess}"){
        public String rollDice(@PathVariable int guess, Model model){
            Random random = new Random();

            int randomRoll = random.nextInt(6-1) + 1;

            model.addAttribute("isCorrectGuess", randomRoll == guess);
            model.addAttribute("userGuess", guess);
            model.addAttribute("randomNumber", randomRoll);

            return "/roll-dice";
        }
    }

}
