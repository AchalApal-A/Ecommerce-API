package com.example.Ecommerce.repository;

import com.example.Ecommerce.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemRepository {

    private final List<Item> items = new ArrayList<>();
    private Long idCounter = 1L;

    public Item save(Item item){
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    public Optional<Item> findById(Long id){
        return items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst();
    }

    public List<Item> findAll(){
        return items;
    }

}
