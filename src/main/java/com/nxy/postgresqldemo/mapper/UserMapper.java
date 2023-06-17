package com.nxy.postgresqldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yulichang.base.MPJBaseMapper;
import com.nxy.postgresqldemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/5/29 10:32
 */
@Mapper
public interface UserMapper extends MPJBaseMapper<User> {
}
