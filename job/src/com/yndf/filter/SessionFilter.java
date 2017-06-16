package com.yndf.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class SessionFilter extends OncePerRequestFilter {
   
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // �����˵�uri
        String[] notFilter = new String[] { "/job/Htlogin.jsp"};
        // �����uri
        String uri = request.getRequestURI();
        // uri�а���backgroundʱ�Ž��й���
        if (uri.indexOf("/job/Htshouye") != -1) {
            // �Ƿ����
            boolean doFilter = true;
            for (String s : notFilter) {
                if (uri.indexOf(s) != -1) {
                    // ���uri�а��������˵�uri���򲻽��й���
                    doFilter = false;
                    break;
                }
            }
            if (doFilter) {
                // ִ�й���
                // ��session�л�ȡ��¼��ʵ��
                Object obj = request.getSession().getAttribute("bc");
                if (null == obj) {
                    // ���session�в����ڵ�¼��ʵ�壬�򵯳�����ʾ���µ�¼
                    // ����request��response���ַ�������ֹ����
                    request.setCharacterEncoding("UTF-8");
                    response.setCharacterEncoding("UTF-8");
                   
                    request.getRequestDispatcher("/Htlogin.jsp").forward(request,response);
                } else {
                    // ���session�д��ڵ�¼��ʵ�壬�����
                    filterChain.doFilter(request, response);
                }
            } else {
                // �����ִ�й��ˣ������
                filterChain.doFilter(request, response);
            }
        } else {
            // ���uri�в�����do�������
            filterChain.doFilter(request, response);
        }
    }
}