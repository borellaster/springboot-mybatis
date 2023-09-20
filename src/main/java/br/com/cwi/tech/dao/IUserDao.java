package br.com.cwi.tech.dao;

import br.com.cwi.tech.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IUserDao {

    @Select("SELECT * FROM users")
    List<User> getUser();

    @Insert("INSERT INTO users (name, mail) VALUES (#{name}, #{mail})")
    int insertUser(User user);

    @Update("UPDATE users SET name = #{name}, mail = #{mail} WHERE id = #{id}")
    int updateUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    int deleteUser(Integer id);

}
