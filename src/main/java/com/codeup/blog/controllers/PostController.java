package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping(path = "/posts")
    @ResponseBody
    public String posts(){
        return "posts index page";
    }

    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    public String postsIndex(@PathVariable Long id){
        return "view an individual post";
    }

    @GetMapping(path = "/posts/create")
    @ResponseBody
    public String viewCreateForm(){
        return "view the form for creating a post";
    }

    @PostMapping(path = "/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }

}
