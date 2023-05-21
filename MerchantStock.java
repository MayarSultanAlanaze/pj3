package com.example.demo.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MerchantStock {
    @NotNull
    @Size(min = 3,message = "the id should be 3 character long")
    private int id;

    @NotEmpty
    @Size(min = 3,message = "the id productid be 3 character long")
    private String productID;

    @NotEmpty
    @Size(min =3,message = "the merchantID should be 3 length long ")
    private String merchantID;

    @NotNull
    @Size(min = 11,message = "the stock should be more 10 at start")
    private int stock;

}
