package com.code.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 系统支持银行清单表
 * @createtime 2016年5月11日下午5:13:31
 */
@Entity
@Table(name="web_bank")
@Comment("系统支持银行清单")
public class WebBank extends CommenEntity {
	
	/**
	 * 银行名称
	 */
	@Comment("银行名称")
	private String name;
	/**
	 * 银行编码
	 */
	@Comment("银行编码")
	private String code;
	/**
	 * 银行logo路径
	 */
	@Comment("银行LOGO路径")
	private String picPath;
	/**
	 * 小logo路径
	 */
	@Comment("小LOGO路径")
	private String minLogoPath;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public String getMinLogoPath() {
		return minLogoPath;
	}
	public void setMinLogoPath(String minLogoPath) {
		this.minLogoPath = minLogoPath;
	}
	
	
}
