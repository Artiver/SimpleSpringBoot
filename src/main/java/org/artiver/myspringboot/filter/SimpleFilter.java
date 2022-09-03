package org.artiver.myspringboot.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Order(1)
// 数字越小 优先级越高
@WebFilter(filterName = "SimpleFilter", value = "/user/*")
// 限定作用的url
public class SimpleFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(SimpleFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        logger.info("[SimpleFilter] 过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("[SimpleFilter] 过滤器执行中");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("[SimpleFilter] 过滤器销毁");
        Filter.super.destroy();
    }
}
