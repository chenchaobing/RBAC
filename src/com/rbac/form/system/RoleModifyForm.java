/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.rbac.form.system;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.rbac.common.BaseForm;
import com.rbac.entity.SysRole;
import com.rbac.service.RoleService;
import com.rbac.util.CommonUtils;

/** 
 * MyEclipse Struts
 * Creation date: 04-25-2014
 * 
 * XDoclet definition:
 * @struts.form name="roleModifyForm"
 */
public class RoleModifyForm extends BaseForm {

	private String submit;
	
	private String roleName;
	
	private String roleDesc;
	
	private String id;
	
	private String menuIds;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMenuIds() {
		return menuIds;
	}

	public void setMenuIds(String menuIds) {
		this.menuIds = menuIds;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.submit = null;
		if(CommonUtils.isNotBlank(request.getParameter("id"))){
			this.setId(request.getParameter("id"));
			RoleService roleService = (RoleService) super
				.getBean("roleService");
			Long id = Long.parseLong(this.getId());
			SysRole role = roleService.getRoleById(id);
			if(role!=null){
				this.setRoleDesc(role.getRoleDesc());
				this.setRoleName(role.getRoleName());
				
			}
		}
	}
}