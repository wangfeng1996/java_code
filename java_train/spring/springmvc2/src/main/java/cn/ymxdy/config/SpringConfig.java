package cn.ymxdy.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wf
 * @date 2021/12/30 14:15
 * @description spring核心配置类
 */

@Configuration
@ComponentScan({"cn.ymxdy.dao", "cn.ymxdy.service"})
@MapperScan("cn.ymxdy.dao")
@Import({JdbcConfig.class, MybatisConfig.class})
@PropertySource("classpath:jdbc-Config.properties")
@EnableTransactionManagement

public class SpringConfig {


    /**
     * 1、包扫描（dao\service）
     * 2、jdbc：
     *          datasource
     *          tx
     * 3、mybatis
     *          sqlsessionfactorybean
     *          mapperScannerConfiger
     * 4、jdbc
     *          数据源  url  username password
     *
     *
     *
     *
     */
}
