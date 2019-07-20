package it.huanzi.dao;

import it.huanzi.entity.User;
import org.apache.ibatis.annotations.Insert;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-7-19 下午9:30
 */
public interface UserInsertDao {
    /**
     * 新增用户，注解方式
     *
     * @param user user
     */
    @Insert("insert into user(username, password, email) VALUES (#{userName},#{password},#{email})")
    void insertUser(User user);


}
