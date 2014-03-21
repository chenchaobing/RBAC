package com.rbac.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SysRole generated by MyEclipse Persistence Tools
 */

public class SysRole implements java.io.Serializable {

	// Fields

	private Long id;

	private String roleName;

	private String roleDesc;

	private Integer isDeleted;

	private Long creatorId;

	private Date createTime;

	private Long modifierId;

	private Date modifyTime;

	private Set sysAccountRoles = new HashSet(0);

	private Set sysRoleMenus = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysRole() {
	}

	/** minimal constructor */
	public SysRole(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	/** full constructor */
	public SysRole(String roleName, String roleDesc, Integer isDeleted,
			Long creatorId, Date createTime, Long modifierId, Date modifyTime,
			Set sysAccountRoles, Set sysRoleMenus) {
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.isDeleted = isDeleted;
		this.creatorId = creatorId;
		this.createTime = createTime;
		this.modifierId = modifierId;
		this.modifyTime = modifyTime;
		this.sysAccountRoles = sysAccountRoles;
		this.sysRoleMenus = sysRoleMenus;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public Integer getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Long getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifierId() {
		return this.modifierId;
	}

	public void setModifierId(Long modifierId) {
		this.modifierId = modifierId;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Set getSysAccountRoles() {
		return this.sysAccountRoles;
	}

	public void setSysAccountRoles(Set sysAccountRoles) {
		this.sysAccountRoles = sysAccountRoles;
	}

	public Set getSysRoleMenus() {
		return this.sysRoleMenus;
	}

	public void setSysRoleMenus(Set sysRoleMenus) {
		this.sysRoleMenus = sysRoleMenus;
	}

}