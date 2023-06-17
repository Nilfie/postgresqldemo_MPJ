package com.nxy.postgresqldemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/5/29 10:32
 */
@Configuration
@MapperScan("com/nxy/postgresqldemo/mapper")
public class MapperConfig {
}
