    package com.guighost.filter;


    import javax.servlet.*;
    import java.io.IOException;

    /**
     * @author GuiGhost
     * @date 2021/02/28
     * @className EncodingFilter()
     * 描述：
     */
    public class EncodingFilter implements Filter {
        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            servletRequest.setCharacterEncoding("UTF-8");//设置请求编码
            servletResponse.setCharacterEncoding("UTF-8");//设置响应编码


            //继续执行过滤器之后的代码
            filterChain.doFilter(servletRequest, servletResponse);
        }

        @Override
        public void destroy() {

        }
    }
