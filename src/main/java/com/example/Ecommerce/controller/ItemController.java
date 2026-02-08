package com.example.Ecommerce.controller;


import com.example.Ecommerce.model.Item;
import com.example.Ecommerce.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return service.addItem(item);
    }

    @GetMapping("/{id}")
    public Item getItem(@PathVariable Long id) {
        return service.getItem(id);
    }

    @GetMapping
    public List<Item> getAll(){
        return service.getAll();
    }
}
