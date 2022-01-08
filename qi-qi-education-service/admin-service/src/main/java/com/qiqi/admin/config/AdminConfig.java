package com.qiqi.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 金川
 * @Description:
 * @Date:Created in 2022/1/8 22:12
 * @Modified By:
 */
@Configuration
@MapperScan("com.qiqi.admin.mapper")
public class AdminConfig {
}
