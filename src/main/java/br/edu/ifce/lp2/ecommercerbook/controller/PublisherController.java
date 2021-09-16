package br.edu.ifce.lp2.ecommercerbook.controller;

import br.edu.ifce.lp2.ecommercerbook.model.entities.Publisher;
import br.edu.ifce.lp2.ecommercerbook.model.services.PublisherService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("publishers")
public class PublisherController {

    private PublisherService service = new PublisherService();

    @PostMapping
    public void post(@RequestBody Publisher publisher){
        service.create(publisher);
    }
    @PutMapping("{id}")
    public void put(@PathVariable Long id, @RequestBody Publisher publisher){
        publisher.setId(id);
        service.update(id, publisher);
    }
    @GetMapping
    public Collection<Publisher> get(){
        return service.getAll();
    }

    @GetMapping("{id}")
    public Publisher getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);

    }



}
