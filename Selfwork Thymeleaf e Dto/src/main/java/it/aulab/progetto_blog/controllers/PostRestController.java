package it.aulab.progetto_blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.progetto_blog.models.Post;
import it.aulab.progetto_blog.repositories.PostRepository;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@RestController
@Controller
@RequestMapping("/api/posts")
public class PostRestController {

    @Autowired
    PostRepository  postRepository;

    @RequestMapping(method=RequestMethod.GET)
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

}
