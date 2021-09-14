package br.edu.ifce.lp2.ecommercerbook.controller;

import br.edu.ifce.lp2.ecommercerbook.model.entities.Publisher;
import br.edu.ifce.lp2.ecommercerbook.model.repository.PublisherRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("publishers")
public class PublisherController {
    private PublisherRepository repository = new PublisherRepository();

    @PostMapping
    public void post(@RequestBody Publisher publisher){
        repository.create(publisher);
    }
    @PutMapping("{id}")
    public void put(@PathVariable Long id, @RequestBody Publisher publisher){
        publisher.setId(id);
        repository.update(id, publisher);
    }
    @GetMapping
    public Collection<Publisher> get(){
        return repository.getAll();
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        repository.delete(id);

    }



}
