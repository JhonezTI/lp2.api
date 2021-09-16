package br.edu.ifce.lp2.ecommercerbook.model.repository;

import br.edu.ifce.lp2.ecommercerbook.model.entities.Publisher;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PublisherRepository {
    private static Long ids = 1l;
    private static Map<Long, Publisher> data;

    public PublisherRepository(){
        data = new HashMap<>();
    }

    public void create(Publisher publisher){
        publisher.setId(ids);
        data.put(ids, publisher);
        ids++;
    }

    public void update(Long id, Publisher publisher){
        data.put(id, publisher);
    }

    public Collection<Publisher> getAll(){
        return data.values();
    }

    public void delete(Long id){
        data.remove(id);
    }

    public Publisher getById(Long id){
        return data.get(id);
    }
}
