package com.basalt.toy.user.service.impl;

import com.basalt.toy.user.UserVo;
import com.basalt.toy.user.service.UserDAO;
import com.basalt.toy.user.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(SqlSession sqlSession) {
        this.userDAO = sqlSession.getMapper(UserDAO.class);
    }

    @Override
    public void regist(UserVo user) throws Exception {
        userDAO.create(user);
    }

    @Override
    public UserVo read(Long uId) throws Exception {
        return userDAO.read(uId);
    }

    @Override
    public UserVo findByEmail(String email) throws Exception {
        return userDAO.findByEmail(email);
    }

    @Override
    public void modify(UserVo user) throws Exception {
        userDAO.update(user);
    }

    @Override
    public void remove(UserVo user) throws Exception {
        userDAO.delete(user);
    }

    @Override
    public List<UserVo> findAll() throws Exception {
        return userDAO.findAll();
    }
}
