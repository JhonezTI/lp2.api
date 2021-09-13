package br.edu.ifce.lp2.ecommercerbook.controller;

import br.edu.ifce.lp2.ecommercerbook.model.entities.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PublisherController {

    @GetMapping
    public Publisher get(){

        var publisher = new Publisher();
        publisher.setId(1);
        publisher.setName("Joao");
        publisher.setPhone("(88) 4002-8922");

        return publisher;
    }
}
