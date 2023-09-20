package br.com.cwi.tech.controller;

import br.com.cwi.tech.domain.User;
import br.com.cwi.tech.mapper.UserMapper;
import br.com.cwi.tech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/list")
    public List<User> list() {
        return service.getUser();
    }

    @PostMapping("/save")
    public int insert(@RequestBody User user) {
       return service.insertUser(user);
    }

    @PutMapping("/update")
    public int update(@RequestBody User user) {
        return service.updateUser(user);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public int delete(@PathVariable Integer id) {
        return service.deleteUser(id);
    }
}
