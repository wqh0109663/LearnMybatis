package it.huanzi.dao;

import it.huanzi.entity.User;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by wqh on 2018/2/25.
 */
public interface UserInsertDao {
    @Insert("insert into user(user_name, password, email) VALUES (#{userName},#{password},#{email})")
    int insertUser(User user);


}
