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
 * Created by wqh on 2018/2/18.
 */
public class UserTest {
   /* @Test
    public void test() throws IOException {
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user =  session.selectOne("it.huanzi.User.selectUser", 1);
            System.out.println(user);
        } finally {
            session.close();
        }

    }*/
    @Test
    public void test01() throws IOException {
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            //        System.out.println(mapper);
            //        User user = mapper.getUser(1);
            //        System.out.println(user);
            User user = new User(null,"matin2","wqh666","huanshuai@qq.com");
            User user1 = new User(null,"matin1","wqh666","huanshuai@qq.com");
            List<User> list = new ArrayList<User>();
            list.add(user);
            list.add(user1);
            mapper.addUser(list);
            System.out.println(user1.getId());
//            mapper.update(user);
            //mapper.delete(2);
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
