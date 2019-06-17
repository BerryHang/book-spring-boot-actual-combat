package com.learning.spring.boot.handler;

import com.learning.spring.boot.domain.response.ResponseBo;
import com.learning.spring.boot.exception.FileDownloadException;
import com.learning.spring.boot.exception.LimitAccessException;
import com.learning.spring.boot.util.HttpUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.session.ExpiredSessionException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler {

	@ExceptionHandler(value = AuthorizationException.class)
	public Object handleAuthorizationException(HttpServletRequest request) {
		if (HttpUtils.isAjaxRequest(request)) {
			return ResponseBo.error("暂无权限，请联系管理员！");
		} else {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("error/403");
			return mav;
		}
	}

	@ExceptionHandler(value = ExpiredSessionException.class)
	public String handleExpiredSessionException() {
		return "login";
	}

	@ExceptionHandler(value = LimitAccessException.class)
	public ResponseBo handleLimitAccessException(LimitAccessException e) {
		return ResponseBo.error(e.getMessage());
	}

	@ExceptionHandler(value = FileDownloadException.class)
	public ResponseBo handleFileDownloadException(FileDownloadException e) {
		return ResponseBo.error(e.getMessage());
	}
}
