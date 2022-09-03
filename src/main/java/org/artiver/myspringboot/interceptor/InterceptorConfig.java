package org.artiver.myspringboot.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    Logger logger = LoggerFactory.getLogger(InterceptorConfig.class);
    @Autowired
    private SimpleInterceptor simpleInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("/").setViewName("forward:index");
        registry.addViewController("/index.html").setViewName("index");
        logger.info("[addViewControllers] 拦截器添加主页视图");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        logger.info("[SimpleInterceptor] 自定义拦截器注册");
        registry.addInterceptor(simpleInterceptor).addPathPatterns("/user/*");
    }
}
