package com.me.dataentry.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class StudentsFilter implements Filter {
  @Override
  public void doFilter(
      ServletRequest servletRequest,
      ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {

    HttpServletResponse response = (HttpServletResponse) servletResponse;
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.addHeader("Access-Control-Request-Method", "*");
    

    filterChain
      .doFilter(servletRequest, servletResponse);
  }
}