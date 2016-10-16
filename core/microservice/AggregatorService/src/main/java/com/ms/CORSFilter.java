//package com.ms;
//
//import java.io.IOException;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//@Component
//public class CORSFilter extends OncePerRequestFilter{
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest arg0,
//			HttpServletResponse arg1, FilterChain arg2)
//					throws ServletException, IOException {
//
//		HttpServletResponse response = (HttpServletResponse) arg1;
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//		response.setHeader("Access-Control-Max-Age", "3600");
//		response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type, Accept, Authorization");
//		arg2.doFilter(arg0, arg1);
//
//	}
//
//}
