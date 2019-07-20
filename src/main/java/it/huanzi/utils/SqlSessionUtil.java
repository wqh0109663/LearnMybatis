package it.huanzi.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-7-19 下午9:30
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = getSqlSession();
        System.out.println(sqlSession);
    }
}
