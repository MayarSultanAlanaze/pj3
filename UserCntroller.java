package com.example.demo.Cntroller;


import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import com.example.demo.Service.ProductService;
import com.example.demo.Service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/User")
public class UserCntroller {
    ArrayList<User>users= new ArrayList<>();

    private final UserService userService;

    @GetMapping("/get")
    public ArrayList get(){
        return users;

    }

    @PostMapping("/add")
    public ResponseEntity getUser(@Valid @RequestBody User user, Errors errors) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new AipResponse(message));
        }
        users.add(user);
        return ResponseEntity.status(200).body(new AipResponse("User add"));

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable int id) {
        users.remove(id);
        return ResponseEntity.status(200).body(new AipResponse("User delete it"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateUser(@Valid @RequestBody User user,int id,Errors errors){
        if (errors.hasErrors()) {

            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new AipResponse(message));
        }
        users.set(id, user);
        return ResponseEntity.status(200).body(new AipResponse("message"));
}
}


