package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Item;
import com.example.Ecommerce.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repo;

    public ItemService(ItemRepository repo) {
        this.repo = repo;
    }

    public Item addItem(Item item) {
        return repo.save(item);
    }

    public Item getItem(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public List<Item> getAll(){
        return repo.findAll();
    }
}
