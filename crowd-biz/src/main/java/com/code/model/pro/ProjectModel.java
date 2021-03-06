package com.code.model.pro;

import java.util.List;

import com.code.entity.project.WebProject;

/**
 * 项目数据模型
 * @author Jinx
 *
 */
public class ProjectModel {

	//项目基本信息
	private WebProject webProject;
	//关注者人数
	private int attentions;
	//状态
	private String statusName;
	//项目类型
	private String typeName;
	//头图
	private String indexPic;
	//项目进度
	private double step;
	//领投状态 -1 不需要 0 已申请 1有了 2可以申请
	private int leaderStatus;
	//领投人信息
	private ProjectLeaderModel projectLeaderModel;
	//支持列表
	private List<ProjectOrderModel> orders;
	//项目素材
	private List<ProjectMaterialsModel> materials;
	//估值类型
	private String companyMoneyName;
	//出让股权
	private double sell;
	//关注情况
	private int attentionStatus;
	
	
	
	
	
	
	
	public WebProject getWebProject() {
		return webProject;
	}
	public void setWebProject(WebProject webProject) {
		this.webProject = webProject;
	}
	public int getAttentions() {
		return attentions;
	}
	public void setAttentions(int attentions) {
		this.attentions = attentions;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getIndexPic() {
		return indexPic;
	}
	public void setIndexPic(String indexPic) {
		this.indexPic = indexPic;
	}
	public double getStep() {
		return step;
	}
	public void setStep(double step) {
		this.step = step;
	}
	public int getLeaderStatus() {
		return leaderStatus;
	}
	public void setLeaderStatus(int leaderStatus) {
		this.leaderStatus = leaderStatus;
	}
	public ProjectLeaderModel getProjectLeaderModel() {
		return projectLeaderModel;
	}
	public void setProjectLeaderModel(ProjectLeaderModel projectLeaderModel) {
		this.projectLeaderModel = projectLeaderModel;
	}
	public List<ProjectOrderModel> getOrders() {
		return orders;
	}
	public void setOrders(List<ProjectOrderModel> orders) {
		this.orders = orders;
	}
	public List<ProjectMaterialsModel> getMaterials() {
		return materials;
	}
	public void setMaterials(List<ProjectMaterialsModel> materials) {
		this.materials = materials;
	}
	public String getCompanyMoneyName() {
		return companyMoneyName;
	}
	public void setCompanyMoneyName(String companyMoneyName) {
		this.companyMoneyName = companyMoneyName;
	}
	public double getSell() {
		return sell;
	}
	public void setSell(double sell) {
		this.sell = sell;
	}
	public int getAttentionStatus() {
		return attentionStatus;
	}
	public void setAttentionStatus(int attentionStatus) {
		this.attentionStatus = attentionStatus;
	}
	
}
