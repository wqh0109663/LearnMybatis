package it.huanzi.test;

import it.huanzi.dao.UserDao;
import it.huanzi.dao.UserInsertDao;
import it.huanzi.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-7-19 下午9:30
 */
public class UserTest {

    @Test
    public void test01() throws IOException {
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);

            User user = new User(1,"matin2","wqh666","huanshuai@qq.com");
            User user1 = new User(null,"matin1","wqh666","huanshuai@qq.com");
            List<User> list = new ArrayList<User>();
            list.add(user);
            list.add(user1);
            mapper.addUser(list);
            System.out.println(user1.getId());
            sqlSession.commit();

        } finally {
            sqlSession.close();
        }

    }
    @Test
    public void test03() throws IOException {
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserInsertDao mapper = sqlSession.getMapper(UserInsertDao.class);
            User user = new User(15,"heima","wqh666","huanshuai@qq.com");
            mapper.insertUser(user);
            sqlSession.commit();

        } finally {
            sqlSession.close();
        }


    }
}
