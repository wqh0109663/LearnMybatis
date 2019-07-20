package it.huanzi.dao;

import it.huanzi.entity.User;

import java.util.List;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-7-19 下午9:30
 */
public interface UserDao {
    /**
     * 根据id获得user
     *
     * @param id UserId
     * @return User
     */
    User getUser(Integer id);

    /**
     * 批量添加user
     *
     * @param users users集合
     */
    void addUser(List<User> users);

    /**
     * 删除用户
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 更新user
     *
     * @param user
     */
    void update(User user);


}
