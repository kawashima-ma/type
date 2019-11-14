package jp.co.type.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.type.dto.UserDto;


@WebFilter(urlPatterns= {"/*"}, filterName="loginFilter")
public class LoginFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {


	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//ログインしてるか確認
		String path = ((HttpServletRequest) request).getServletPath();
		UserDto loginUser = (UserDto) ((HttpServletRequest) request).getSession().getAttribute("loginUser");
		if(!(path.equals("/login")||path.equals("/signup"))&& !(path.contains("/css"))) {
		 	if(loginUser == null) {
		 		HttpSession session = ((HttpServletRequest) request).getSession();
		 		session.setAttribute("errorMessage", "ログインしてください");
		 		((HttpServletResponse) response).sendRedirect(((HttpServletRequest)request).getContextPath() +"/login");
		 		return;
		 	}
		}
		chain.doFilter(request, response);

	}

	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
