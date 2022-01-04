package cn.ymxdy.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author wf
 * @date 2021/12/30 14:12
 * @description mybatis 的核心配置类
 */
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setTypeAliasesPackage("cn.ymxdy.pojo");
        factoryBean.setDataSource(dataSource);
        return factoryBean;
    }
}
