package com.code.entity.project;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 项目素材列表
 * @createtime 2016年5月11日下午4:54:08
 */
@Entity
@Table(name="web_project_materials")
@Comment("项目素材列表")
public class WebProjectMaterials extends CommenEntity {
	
	private static final long serialVersionUID = -1060666215005813687L;
	/**
	 * 对应素材仓库id
	 */
	@Comment("素材仓库ID")
	private long materialsId;
	/**
	 * 素材名称
	 */
	@Comment("素材名称")
	private String name;
	/**
	 * 素材内容
	 */
	@Comment("素材内容")
	private String content;
	/**
	 * 可用状态
	 * 0:不可用
	 * 1:可用
	 */
	@Comment("可用状态 0:不可用1:可用")
	private int status;
	/**
	 * 对应项目
	 */
	@Comment("项目ID")
	private long projectId;
	/**
	 * 跳转链接
	 */
	@Comment("跳转链接")
	private String link;


	public long getMaterialsId() {
		return materialsId;
	}
	public void setMaterialsId(long materialsId) {
		this.materialsId = materialsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
}
