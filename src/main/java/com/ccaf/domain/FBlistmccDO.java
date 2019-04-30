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
public class FBlistmccDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//mcc
	private String mcc;
	//lst_upd_ttp
	private Date lstUpdTtp;
	//mcc_nme
	private String mccNme;
	//sts
	private String sts;

	/**
	 * 设置：mcc
	 */
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}
	/**
	 * 获取：mcc
	 */
	public String getMcc() {
		return mcc;
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
	 * 设置：mcc_nme
	 */
	public void setMccNme(String mccNme) {
		this.mccNme = mccNme;
	}
	/**
	 * 获取：mcc_nme
	 */
	public String getMccNme() {
		return mccNme;
	}
	/**
	 * 设置：sts
	 */
	public void setSts(String sts) {
		this.sts = sts;
	}
	/**
	 * 获取：sts
	 */
	public String getSts() {
		return sts;
	}
}
