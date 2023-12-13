package com.basalt.toy.user.service.impl;

import com.basalt.toy.user.UserVo;
import com.basalt.toy.user.service.UserDAO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {
    private final SqlSession sqlSession;

    public UserDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public void create(UserVo user) throws Exception {
        sqlSession.insert("user.register", user);
    }

    @Override
    public UserVo read(Long uId) throws Exception {
        return sqlSession.selectOne("user.findById", uId);
    }

    @Override
    public UserVo findByEmail(String email) throws Exception {
        return sqlSession.selectOne("user.findByEmail", email);
    }

    @Override
    public void update(UserVo user) throws Exception {
        sqlSession.update("user.updateUser", user);
    }

    @Override
    public void delete(UserVo user) throws Exception {
        sqlSession.delete("user.deleteUser", user);
    }

    @Override
    public List<UserVo> findAll() throws Exception {
        return sqlSession.selectList("findAll");
    }
}
