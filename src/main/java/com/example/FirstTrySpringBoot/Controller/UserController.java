package com.example.FirstTrySpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository repo;

    @PostMapping("/users")
    public String create(@RequestBody User user) {
//        {
//            "name":"Sindy",
//            "email": "s123@gmail.com",
//            "password": "sindy123"
//        }
        repo.save(user);
        return "Run CREATE in DB";
    }

    @GetMapping("/users/{userMail}")
    public String read(@PathVariable String userMail) {
        List<User> users = repo.findByEmail(userMail);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
            System.out.println(users.get(i).getEmail());
        }
        return userMail;
    }

    @PutMapping("/users/{email}")
    public String update(@PathVariable String email,
                         @RequestBody User user) {

        // 查詢要更新的紀錄
        User modifyUser = repo.findByEmail(email).get(0);

        System.out.println(modifyUser.getName());
        System.out.println(modifyUser.getEmail());

        // 更新紀錄的屬性
        modifyUser.setEmail(user.getEmail());
        // 保存更新後的紀錄
        repo.save(modifyUser);

        return "Run UPDATE in DB";
    }

    @PutMapping("/usersID/{id}")
    public String updateByID(@PathVariable int id,
                         @RequestBody User user) {

        User modifyUser = repo.findById((long) id).get();

        System.out.println(modifyUser.getName());
        System.out.println(modifyUser.getEmail());

//        modifyUser.setEmail(user.getEmail());
//        repo.save(modifyUser);

        return "Run UPDATE in DB";
    }

    @DeleteMapping("/users/{userId}")
    public String delete(@PathVariable Integer userId) {
        User userToDelete = repo.findById((long) userId).get();
        repo.delete(userToDelete);

        return "Run DELETE in DB";
    }




//
}
