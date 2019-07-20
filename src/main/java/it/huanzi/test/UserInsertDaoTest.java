package it.huanzi.test;

import it.huanzi.dao.UserInsertDao;
import it.huanzi.entity.User;
import it.huanzi.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-7-19 下午10:25
 */
public class UserInsertDaoTest {
    @Test
    public void insertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserInsertDao mapper = sqlSession.getMapper(UserInsertDao.class);
        mapper.insertUser(new User(null,"wqh","123","337069691@qq.com"));
        sqlSession.commit();
        sqlSession.close();

    }
}
