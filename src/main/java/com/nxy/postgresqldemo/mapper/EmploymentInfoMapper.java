package com.nxy.postgresqldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yulichang.base.MPJBaseMapper;
import com.nxy.postgresqldemo.entity.EmploymentInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/6/17 10:34
 * @description
 **/
@Mapper
public interface EmploymentInfoMapper extends MPJBaseMapper<EmploymentInfo> {
}
