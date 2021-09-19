package br.edu.ifce.lp2.ecommercerbook.model.services;

import br.edu.ifce.lp2.ecommercerbook.model.entities.Publisher;
import br.edu.ifce.lp2.ecommercerbook.model.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class PublisherService {
    @Autowired
    private PublisherRepository repository;

    public Publisher create(Publisher publisher){
        var allPublishers = repository.findAll();
        if(repository.existsByName(publisher.getName())){
              throw new RuntimeException("Nome ja existe");
        }
        return repository.save(publisher);
    }


    public Publisher update(String id, Publisher publisher){
        var publisherDatabase  = this.getById(id);
        var p = repository.findByName(publisher.getName());
        if(p != null && !p.getId().equals(id)){
            throw new RuntimeException("Nome ja existe");
        }
        publisherDatabase.setName(publisher.getName());
        publisherDatabase.setPhone(publisher.getPhone());
        return repository.save(publisherDatabase);
    }

    public Page<Publisher> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Publisher getById(String id) {return repository.findById(id).
            orElseThrow(() -> new RuntimeException("Publisher nao existe"));}

    public void delete(String id) {
        repository.delete(getById(id));}
}
