package br.com.cwi.tech.service;

import br.com.cwi.tech.domain.User;
import br.com.cwi.tech.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserDao dao;

    public List<User> getUser(){
        return this.dao.getUser();
    }

    public int insertUser(User user) {
        return this.dao.insertUser(user);
    }

    public int updateUser(User user) {
        return this.dao.updateUser(user);
    }

    public int deleteUser(Integer id) {
        return this.dao.deleteUser(id);
    }
}
