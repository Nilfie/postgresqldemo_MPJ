package com.nxy.postgresqldemo;

import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.nxy.postgresqldemo.dto.EmploymentInfoDto;
import com.nxy.postgresqldemo.entity.EmploymentInfo;
import com.nxy.postgresqldemo.entity.User;
import com.nxy.postgresqldemo.mapper.EmploymentInfoMapper;
import com.nxy.postgresqldemo.service.EmploymentInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class PostgresqldemoApplicationTests {

    @Resource
    private EmploymentInfoMapper employmentInfoMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testLeftJoin() {
        MPJLambdaWrapper<EmploymentInfo> wrapper = new MPJLambdaWrapper<>();
        wrapper.selectAll(EmploymentInfo.class)
                .selectAll(User.class)
                .selectAs(EmploymentInfo::getStudentClass, User::getClassid)
                .leftJoin(User.class, User::getClassid, EmploymentInfo::getStudentClass);

        List<EmploymentInfoDto> list = employmentInfoMapper.selectJoinList(EmploymentInfoDto.class, wrapper);
        list.forEach(System.out::println);

    }

}
