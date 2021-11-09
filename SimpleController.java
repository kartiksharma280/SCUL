package com.kartik.Spring9Nov;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SimpleController {
    DBUser db = new DBUser();

    //GET API- get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return db.getAllUsers();
    }

    //GET API- get specific user by name
    @GetMapping("/user")
    public User getAUser(@RequestParam String q){
        return db.getAUserByName(q);
    }

    //POST API- create a new user

    //DELETE API- delete user with specific id
    @DeleteMapping("/users/{id}")
    public boolean deleteUser(@PathVariable int id){
        return db.deleteAUser(id);
    }


}
