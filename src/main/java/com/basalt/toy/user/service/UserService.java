package com.basalt.toy.user.service;

import com.basalt.toy.user.UserVo;

import java.util.List;

public interface UserService {
    public void regist(UserVo user) throws Exception;
    public UserVo read(Long uId) throws Exception;
    public UserVo findByEmail(String email) throws Exception;
    public void modify(UserVo user) throws Exception;
    public void remove(UserVo user) throws Exception;
    public List<UserVo> findAll() throws Exception;
}
