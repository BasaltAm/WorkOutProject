package com.basalt.toy.workOutMethod.service;

import com.basalt.toy.diary.DiaryVo;
import com.basalt.toy.workOutMethod.WorkOutMethodVo;
import java.util.List;

public interface WorkOutMethodDAO {
    public void register(WorkOutMethodVo work) throws Exception;
    public DiaryVo findById(Long WId) throws Exception;
    public void updateWorkOut(WorkOutMethodVo work) throws Exception;
    public void deleteWorkOut(Long WId) throws Exception;
    public List<WorkOutMethodVo> findAll() throws Exception;
}
