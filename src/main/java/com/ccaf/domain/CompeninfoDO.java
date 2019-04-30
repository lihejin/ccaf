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
public class CompeninfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//txn_cde
	private String txnCde;
	//lst_upd_ttp
	private Date lstUpdTtp;
	//msg_key
	private String msgKey;
	//sys_tme
	private String sysTme;
	//txn_ttp
	private String txnTtp;
	//msg_dta_txt
	private String msgDtaTxt;

	/**
	 * 设置：txn_cde
	 */
	public void setTxnCde(String txnCde) {
		this.txnCde = txnCde;
	}
	/**
	 * 获取：txn_cde
	 */
	public String getTxnCde() {
		return txnCde;
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
	 * 设置：msg_key
	 */
	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}
	/**
	 * 获取：msg_key
	 */
	public String getMsgKey() {
		return msgKey;
	}
	/**
	 * 设置：sys_tme
	 */
	public void setSysTme(String sysTme) {
		this.sysTme = sysTme;
	}
	/**
	 * 获取：sys_tme
	 */
	public String getSysTme() {
		return sysTme;
	}
	/**
	 * 设置：txn_ttp
	 */
	public void setTxnTtp(String txnTtp) {
		this.txnTtp = txnTtp;
	}
	/**
	 * 获取：txn_ttp
	 */
	public String getTxnTtp() {
		return txnTtp;
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
