package com.learning.spring.boot.filter;

import com.alibaba.fastjson.JSON;
import com.learning.spring.boot.domain.response.ResponseBo;
import com.learning.spring.boot.util.HttpUtils;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomUserFilter extends UserFilter {

	/**
	 * 判断是否是 ajax 请求
	 * 如果是，则返回 403 状态码
	 */
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		if (HttpUtils.isAjaxRequest((HttpServletRequest) request)) {
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;
			httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
			httpServletResponse.setContentType("application/json; charset=utf-8");
			httpServletResponse.getWriter().print(JSON.toJSON(ResponseBo.error()));
			return false;
		} else {
			saveRequestAndRedirectToLogin(request, response);
			return false;
		}
	}
}
