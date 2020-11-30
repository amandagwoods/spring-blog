package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index() {
        return "posts/index";
    }

    @GetMapping("/posts/index")
    public String index(Model model){
        List<String> posts = new ArrayList<>();
        posts.add("This is the first post");
        posts.add("This is the second post");
        model.addAttribute("posts", posts);
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String show(@PathVariable long id) {
        return "posts/post";
    }

    @GetMapping("/posts/show/{id}")
    public String showIndividualPost(@PathVariable long id, Model model) {
        Post post = new Post();
        String title = "This is a title";
        String body = "This is the body of post";
        model.addAttribute("id", "Post id#: " + id);
        model.addAttribute("title", title);
        model.addAttribute("body", body);
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreateForm() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String submitPost() {
        return "create a new post";
    }
}