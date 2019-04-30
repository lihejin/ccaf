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
public class Tgen025DO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//itn_idn_cde
	private String itnIdnCde;
	//lst_upd_ttp
	private Date lstUpdTtp;
	//txn_src_cde
	private String txnSrcCde;
	//cry_cde
	private String cryCde;
	//cvt_rte_pct
	private Double cvtRtePct;
	//lst_upd_usr
	private String lstUpdUsr;

	/**
	 * 设置：itn_idn_cde
	 */
	public void setItnIdnCde(String itnIdnCde) {
		this.itnIdnCde = itnIdnCde;
	}
	/**
	 * 获取：itn_idn_cde
	 */
	public String getItnIdnCde() {
		return itnIdnCde;
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
	 * 设置：txn_src_cde
	 */
	public void setTxnSrcCde(String txnSrcCde) {
		this.txnSrcCde = txnSrcCde;
	}
	/**
	 * 获取：txn_src_cde
	 */
	public String getTxnSrcCde() {
		return txnSrcCde;
	}
	/**
	 * 设置：cry_cde
	 */
	public void setCryCde(String cryCde) {
		this.cryCde = cryCde;
	}
	/**
	 * 获取：cry_cde
	 */
	public String getCryCde() {
		return cryCde;
	}
	/**
	 * 设置：cvt_rte_pct
	 */
	public void setCvtRtePct(Double cvtRtePct) {
		this.cvtRtePct = cvtRtePct;
	}
	/**
	 * 获取：cvt_rte_pct
	 */
	public Double getCvtRtePct() {
		return cvtRtePct;
	}
	/**
	 * 设置：lst_upd_usr
	 */
	public void setLstUpdUsr(String lstUpdUsr) {
		this.lstUpdUsr = lstUpdUsr;
	}
	/**
	 * 获取：lst_upd_usr
	 */
	public String getLstUpdUsr() {
		return lstUpdUsr;
	}
}
