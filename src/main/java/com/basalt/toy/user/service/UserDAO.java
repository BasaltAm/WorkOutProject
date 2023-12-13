package com.basalt.toy.user.service;

import java.util.List;

import com.basalt.toy.user.UserVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
	public void create(UserVo user) throws Exception;
	public UserVo read(Long uId) throws Exception;
	public UserVo findByEmail(String email) throws Exception;
	public void update(UserVo user) throws Exception;
	public void delete(UserVo user) throws Exception;
	public List<UserVo> findAll() throws Exception;
}
