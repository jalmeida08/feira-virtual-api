package br.com.jsa.feiravirtual;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.SignatureException;

@Component
@Order(2)
public class JWTFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) servletRequest;
	    HttpServletResponse res = (HttpServletResponse) servletResponse;

	    if(req.getRequestURI().startsWith("/usuario/login")){
	        filterChain.doFilter(servletRequest, servletResponse);
	        return;
	    }
//	    if(req.getRequestURI().startsWith("/pessoa/salvarP")){
//	        filterChain.doFilter(servletRequest, servletResponse);
//	        return;
//	    }
	    if(req.getRequestURI().startsWith("/usuario/salvar")){
	        filterChain.doFilter(servletRequest, servletResponse);
	        return;
	    }
	    if(req.getMethod().equals("OPTIONS")){
	        filterChain.doFilter(servletRequest, servletResponse);
	        return;
	    }

	    String token = req.getHeader(JWTUtil.TOKEN_HEADER);
	    if(token == null || token.trim().isEmpty()){
	        res.setStatus(401);
	        return;
	    }

	    try {
	        /*Jws<Claims> parser = */JWTUtil.decode(token);
	        filterChain.doFilter(servletRequest, servletResponse);
	    } catch (SignatureException e) {
	        res.setStatus(401);
	    }

	}
	
	@Override
	public void init(FilterConfig filterConfig) {
	}

	@Override
	public void destroy() {
	}
}