package com.code.entity.project;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 项目领头人申请列表
 * @createtime 2016年5月11日下午4:59:45
 */
@Entity
@Table(name="web_project_leader")
@Comment("项目领头人申请列表")
public class WebProjectLeader extends CommenEntity {
	
	private static final long serialVersionUID = -6381660448463221386L;
	/**
	 * 项目id
	 */
	@Comment("项目ID")
	private long projectId;
	/**
	 * 申请人id
	 */
	@Comment("申请人ID")
	private long userId;
	/**
	 * 申请人个人简介
	 */
	@Comment("申请人个人简介")
	private String info;
	/**
	 * 领投理由
	 */
	@Comment("领投理由")
	private String reason;
	/**
	 * 申请状态
	 * 0:等待审核
	 * 1:审核通过
	 * -1:审核驳回
	 */
	@Comment("申请状态 0:等待审核 1:审核通过 -1:审核驳回")
	private int status;


	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
