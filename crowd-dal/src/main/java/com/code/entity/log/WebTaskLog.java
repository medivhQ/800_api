package com.code.entity.log;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 系统定时任务日志表
 * @createtime 2016年5月11日下午5:33:08
 */
@Entity
@Table(name="web_task_log")
@Comment("系统定时任务日志表")
public class WebTaskLog extends CommenEntity {
	/**
	 * 日志模板id
	 */
	@Comment("日志模板ID")
	private long templateId;
	/**
	 * 日志内容
	 */
	@Comment("日志内容")
	private String content;


	public long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
