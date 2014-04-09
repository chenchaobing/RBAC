/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.rbac.action.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.rbac.common.BaseAction;
import com.rbac.common.MvcConstant;
import com.rbac.common.UserDetail;
import com.rbac.form.system.LoginForm;
import com.rbac.service.LoginService;

/**
 * MyEclipse Struts Creation date: 12-20-2013
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/login" name="LoginForm" input="/login.jsp"
 *                scope="request" validate="true"
 * @struts.action-forward name="success" path="/index.jsp"
 */
public class LoginAction extends BaseAction {

	
	private static final Log logger = LogFactory.getLog(LoginAction.class);
	
	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		LoginForm loginForm = (LoginForm) form;
		LoginService loginService = (LoginService) super
				.getBean("loginService");
		if (StringUtils.isNotBlank(loginForm.getPassword())) {
			UserDetail userDetail = loginService.login(loginForm.getUsername(),
					loginForm.getPassword());
			if (userDetail != null) {
				request.getSession(true).setAttribute(MvcConstant.USER, userDetail);
				return mapping.findForward("success");
			}
		}
		request.setAttribute(MvcConstant.ERROR_MSG, "用户名或密码不正确");
		loginForm.setPassword("");
					
		return mapping.getInputForward();
	}
	
	
}