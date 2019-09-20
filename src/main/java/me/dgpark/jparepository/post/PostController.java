package me.dgpark.jparepository.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/post/{id}")
    public void jpaHoneyTip(@PathVariable("id") Post post) {




    }

}
