package org.acme.rest.json;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Link extends PanacheEntityBase {
    private Long id;
    private String destination;
    private String source;

    @Id
    @SequenceGenerator(name = "linkSeq", sequenceName = "link_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "linkSeq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
