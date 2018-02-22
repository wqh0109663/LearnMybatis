package it.huanzi.dao;

import it.huanzi.entity.User;

import java.util.List;

/**
 * Created by wqh on 2018/2/19.
 */
public interface UserDao {
    User getUser(Integer id);
    void addUser(List<User> users);
    void delete(Integer id);
    void update(User user);


}
