package cn.ymxdy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author wf
 * @date 2021/12/30 14:23
 * @description springmvc的核心配置类
 */
@Configuration
@ComponentScan("cn.ymxdy")
@EnableWebMvc
public class SpringMvcConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private AccessInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/passenger/*");
    }

}
