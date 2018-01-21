package com.dream.universal.domain;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable{
	
    /**
	 * 用redis  需要序列化
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String email;

    private Boolean enabled;

    private String password;

    private String phone;

    private String realName;

    private Date lastLoginTime;

    private Date createTime;

    private Date updateTime;

    private String username;

    private Long orgId;

    private Date modifyPasswordTime;

    private String passwordSugar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Date getModifyPasswordTime() {
        return modifyPasswordTime;
    }

    public void setModifyPasswordTime(Date modifyPasswordTime) {
        this.modifyPasswordTime = modifyPasswordTime;
    }

    public String getPasswordSugar() {
        return passwordSugar;
    }

    public void setPasswordSugar(String passwordSugar) {
        this.passwordSugar = passwordSugar == null ? null : passwordSugar.trim();
    }

	@Override
	public String toString() {
		return "SysUser [id=" + id + ", email=" + email + ", enabled=" + enabled + ", password=" + password + ", phone="
				+ phone + ", realName=" + realName + ", lastLoginTime=" + lastLoginTime + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", username=" + username + ", orgId=" + orgId + ", modifyPasswordTime="
				+ modifyPasswordTime + ", passwordSugar=" + passwordSugar + "]";
	}
    
}