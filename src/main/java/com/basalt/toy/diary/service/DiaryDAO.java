package com.basalt.toy.diary.service;

import com.basalt.toy.diary.DiaryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiaryDAO {

    public void register(DiaryVo diary) throws Exception;
    public DiaryVo findById(Long dId) throws Exception;
    public void updateDiary(DiaryVo diary) throws Exception;
    public void deleteDiary (Long dId) throws Exception;
    public List<DiaryVo> findAll() throws Exception;
}
