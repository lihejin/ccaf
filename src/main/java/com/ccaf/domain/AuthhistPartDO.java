package com.ccaf.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:09
 */
public class AuthhistPartDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//pan_txt
	private String panTxt;
	//lst_upd_ttp
	private Date lstUpdTtp;
	//txt_ttp
	private String txtTtp;
	//seq
	private String seq;
	//sys_mde_ind
	private String sysMdeInd;
	//pcs_sys_ind
	private String pcsSysInd;
	//msg_dta_txt
	private String msgDtaTxt;

	/**
	 * 设置：pan_txt
	 */
	public void setPanTxt(String panTxt) {
		this.panTxt = panTxt;
	}
	/**
	 * 获取：pan_txt
	 */
	public String getPanTxt() {
		return panTxt;
	}
	/**
	 * 设置：lst_upd_ttp
	 */
	public void setLstUpdTtp(Date lstUpdTtp) {
		this.lstUpdTtp = lstUpdTtp;
	}
	/**
	 * 获取：lst_upd_ttp
	 */
	public Date getLstUpdTtp() {
		return lstUpdTtp;
	}
	/**
	 * 设置：txt_ttp
	 */
	public void setTxtTtp(String txtTtp) {
		this.txtTtp = txtTtp;
	}
	/**
	 * 获取：txt_ttp
	 */
	public String getTxtTtp() {
		return txtTtp;
	}
	/**
	 * 设置：seq
	 */
	public void setSeq(String seq) {
		this.seq = seq;
	}
	/**
	 * 获取：seq
	 */
	public String getSeq() {
		return seq;
	}
	/**
	 * 设置：sys_mde_ind
	 */
	public void setSysMdeInd(String sysMdeInd) {
		this.sysMdeInd = sysMdeInd;
	}
	/**
	 * 获取：sys_mde_ind
	 */
	public String getSysMdeInd() {
		return sysMdeInd;
	}
	/**
	 * 设置：pcs_sys_ind
	 */
	public void setPcsSysInd(String pcsSysInd) {
		this.pcsSysInd = pcsSysInd;
	}
	/**
	 * 获取：pcs_sys_ind
	 */
	public String getPcsSysInd() {
		return pcsSysInd;
	}
	/**
	 * 设置：msg_dta_txt
	 */
	public void setMsgDtaTxt(String msgDtaTxt) {
		this.msgDtaTxt = msgDtaTxt;
	}
	/**
	 * 获取：msg_dta_txt
	 */
	public String getMsgDtaTxt() {
		return msgDtaTxt;
	}
}
