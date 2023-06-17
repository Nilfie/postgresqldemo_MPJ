package com.nxy.postgresqldemo.service;

import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.nxy.postgresqldemo.dto.EmploymentInfoDto;
import com.nxy.postgresqldemo.entity.EmploymentInfo;
import com.nxy.postgresqldemo.entity.User;
import com.nxy.postgresqldemo.mapper.EmploymentInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/6/17 10:35
 * @description
 **/
@Service
public class EmploymentInfoService {
    @Resource
    private EmploymentInfoMapper employmentInfoMapper;


    public List<EmploymentInfoDto> getInfo() {
        MPJLambdaWrapper<EmploymentInfo> wrapper = new MPJLambdaWrapper<>();
        wrapper.selectAll(EmploymentInfo.class)
                .selectAll(User.class)
                .selectAs(EmploymentInfo::getStudentClass, User::getClassid)
                .leftJoin(User.class, User::getClassid, EmploymentInfo::getStudentClass);
        return employmentInfoMapper.selectJoinList(EmploymentInfoDto.class, wrapper);
    }
}
