package com.Kent.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // 1. 放行前，對 request 資料進行處理
        System.out.println("1. FilterDemo...");

        // 放行
        filterChain.doFilter(servletRequest, servletResponse);

        // 2.放行後，對 response 資料進行處理
        System.out.println("3. FilterDemo...");
    }

    @Override
    public void destroy() {

    }
}
