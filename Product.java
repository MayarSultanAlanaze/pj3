package com.example.demo.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    @NotNull
    @Size(min = 3,message = "the id should be 3 character long")
    private int id;

    @NotEmpty
    @Size(min = 3,message = "the name should be 3 length long ")
    private String name;

    @NotNull
    @Positive(message = "the price should be positive number")
    private int price;

    @NotEmpty
    @Size(min = 3,message = "the categoryID should be 3 character long ")
    private String categoryID;

}
