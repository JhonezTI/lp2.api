package br.edu.ifce.lp2.ecommercerbook.controller.response;

import br.edu.ifce.lp2.ecommercerbook.model.entities.Publisher;
import lombok.Getter;

@Getter
public class PublisherResponse {

    private String id;
    private String name;
    private String phone;

    public PublisherResponse fromPublisher(Publisher publisher){
        this.id = publisher.getId();
        this.name = publisher.getName();
        this.phone = publisher.getPhone();
        return this;
    }
}
