package br.com.cwi.tech.service;

import br.com.cwi.tech.domain.User;
import br.com.cwi.tech.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public List<User> getUser(){
        return this.mapper.getUser();
    }

    public int insertUser(User user) {
        return this.mapper.insertUser(user);
    }

    public int updateUser(User user) {
        return this.mapper.updateUser(user);
    }

    public int deleteUser(Integer id) {
        return this.mapper.deleteUser(id);
    }
}
