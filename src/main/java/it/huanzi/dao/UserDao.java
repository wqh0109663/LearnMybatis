package it.huanzi.dao;

import it.huanzi.entity.User;

/**
 * Created by wqh on 2018/2/19.
 */
public interface UserDao {
    User getUser(Integer id);
    void addUser(User user);
    void delete(Integer id);
    void update(User user);


}
