package com.NullPointer.configuration.Filter;

import com.NullPointer.Utils.RedisUtil;
import org.hibernate.annotations.Filter;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Aaron on 11/20/16.
 *
 * Email: aaronyang.memory@gmail.com
 * =======================================================
 */
@WebFilter(filterName="/SessionFilter",urlPatterns="*.do"
        ,initParams={@WebInitParam(name ="EXCLUDED_PAGES" , value = "login.do")})
public class SessionFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // 执行过滤
        // 从session中获取登录者实体
        String token = request.getHeader("token");

        Object obj = RedisUtil.get(token);

        if (null == obj) {
            // 如果session中不存在登录者实体，则弹出框提示重新登录
            // 设置request和response的字符集，防止乱码
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            response.sendRedirect("html/login.html");

        } else {
            // 如果session中存在登录者实体，则继续
            filterChain.doFilter(request, response);
        }
    }

}