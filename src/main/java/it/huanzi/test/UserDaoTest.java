package it.huanzi.test;


import it.huanzi.dao.UserDao;
import it.huanzi.entity.User;
import it.huanzi.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-7-19 下午10:02
 */

public class UserDaoTest {

    @Test
    public void getUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUser(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> list = new ArrayList<User>();
        list.add(new User(null, "www", "123", "gmail"));
        list.add(new User(null, "www", "123", "gmail"));
        mapper.addUser(list);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delete() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.delete(2);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.update(new User(1, "wuqih6666uan", "123456", null));
        sqlSession.commit();
        sqlSession.close();
    }
}
