package com.ccaf.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-28 16:00:10
 */
public class Tgen599DO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//app_idn_sky
	private String appIdnSky;
	//dly_txn_amt
	private Long dlyTxnAmt;
	//avn_ind
	private String avnInd;
	//lst_upd_dte
	private Date lstUpdDte;
	//lst_upd_tme
	private Date lstUpdTme;
	//lst_upd_uid
	private String lstUpdUid;
	//lst_upd_nbr
	private Integer lstUpdNbr;

	/**
	 * 设置：app_idn_sky
	 */
	public void setAppIdnSky(String appIdnSky) {
		this.appIdnSky = appIdnSky;
	}
	/**
	 * 获取：app_idn_sky
	 */
	public String getAppIdnSky() {
		return appIdnSky;
	}
	/**
	 * 设置：dly_txn_amt
	 */
	public void setDlyTxnAmt(Long dlyTxnAmt) {
		this.dlyTxnAmt = dlyTxnAmt;
	}
	/**
	 * 获取：dly_txn_amt
	 */
	public Long getDlyTxnAmt() {
		return dlyTxnAmt;
	}
	/**
	 * 设置：avn_ind
	 */
	public void setAvnInd(String avnInd) {
		this.avnInd = avnInd;
	}
	/**
	 * 获取：avn_ind
	 */
	public String getAvnInd() {
		return avnInd;
	}
	/**
	 * 设置：lst_upd_dte
	 */
	public void setLstUpdDte(Date lstUpdDte) {
		this.lstUpdDte = lstUpdDte;
	}
	/**
	 * 获取：lst_upd_dte
	 */
	public Date getLstUpdDte() {
		return lstUpdDte;
	}
	/**
	 * 设置：lst_upd_tme
	 */
	public void setLstUpdTme(Date lstUpdTme) {
		this.lstUpdTme = lstUpdTme;
	}
	/**
	 * 获取：lst_upd_tme
	 */
	public Date getLstUpdTme() {
		return lstUpdTme;
	}
	/**
	 * 设置：lst_upd_uid
	 */
	public void setLstUpdUid(String lstUpdUid) {
		this.lstUpdUid = lstUpdUid;
	}
	/**
	 * 获取：lst_upd_uid
	 */
	public String getLstUpdUid() {
		return lstUpdUid;
	}
	/**
	 * 设置：lst_upd_nbr
	 */
	public void setLstUpdNbr(Integer lstUpdNbr) {
		this.lstUpdNbr = lstUpdNbr;
	}
	/**
	 * 获取：lst_upd_nbr
	 */
	public Integer getLstUpdNbr() {
		return lstUpdNbr;
	}
}
