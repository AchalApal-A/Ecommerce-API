package com.example.Ecommerce.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message="Description is required")
    private String description;

    private double price;


}
