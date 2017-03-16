package io.pivotal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by pivotal on 3/15/17.
 */

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer quantity;

    public Item(){ //JPA
    }

    public Item(String name, Integer quantity){
        this.name=name;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}

