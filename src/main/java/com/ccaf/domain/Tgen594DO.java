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
public class Tgen594DO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//pay_typ_cde
	private String payTypCde;
	//pay_chl_cde
	private String payChlCde;
	//app_idn_sky
	private String appIdnSky;
	//dly_txn_1_amt
	private Long dlyTxn1Amt;
	//mth_txn_1_amt
	private Long mthTxn1Amt;
	//dly_txn_2_amt
	private Long dlyTxn2Amt;
	//mth_txn_2_amt
	private Long mthTxn2Amt;
	//lst_txn_dte
	private Date lstTxnDte;
	//lst_upd_dte
	private Date lstUpdDte;
	//lst_upd_tme
	private Date lstUpdTme;
	//lst_upd_uid
	private String lstUpdUid;
	//lst_upd_nbr
	private Integer lstUpdNbr;

	/**
	 * 设置：pay_typ_cde
	 */
	public void setPayTypCde(String payTypCde) {
		this.payTypCde = payTypCde;
	}
	/**
	 * 获取：pay_typ_cde
	 */
	public String getPayTypCde() {
		return payTypCde;
	}
	/**
	 * 设置：pay_chl_cde
	 */
	public void setPayChlCde(String payChlCde) {
		this.payChlCde = payChlCde;
	}
	/**
	 * 获取：pay_chl_cde
	 */
	public String getPayChlCde() {
		return payChlCde;
	}
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
	 * 设置：dly_txn_1_amt
	 */
	public void setDlyTxn1Amt(Long dlyTxn1Amt) {
		this.dlyTxn1Amt = dlyTxn1Amt;
	}
	/**
	 * 获取：dly_txn_1_amt
	 */
	public Long getDlyTxn1Amt() {
		return dlyTxn1Amt;
	}
	/**
	 * 设置：mth_txn_1_amt
	 */
	public void setMthTxn1Amt(Long mthTxn1Amt) {
		this.mthTxn1Amt = mthTxn1Amt;
	}
	/**
	 * 获取：mth_txn_1_amt
	 */
	public Long getMthTxn1Amt() {
		return mthTxn1Amt;
	}
	/**
	 * 设置：dly_txn_2_amt
	 */
	public void setDlyTxn2Amt(Long dlyTxn2Amt) {
		this.dlyTxn2Amt = dlyTxn2Amt;
	}
	/**
	 * 获取：dly_txn_2_amt
	 */
	public Long getDlyTxn2Amt() {
		return dlyTxn2Amt;
	}
	/**
	 * 设置：mth_txn_2_amt
	 */
	public void setMthTxn2Amt(Long mthTxn2Amt) {
		this.mthTxn2Amt = mthTxn2Amt;
	}
	/**
	 * 获取：mth_txn_2_amt
	 */
	public Long getMthTxn2Amt() {
		return mthTxn2Amt;
	}
	/**
	 * 设置：lst_txn_dte
	 */
	public void setLstTxnDte(Date lstTxnDte) {
		this.lstTxnDte = lstTxnDte;
	}
	/**
	 * 获取：lst_txn_dte
	 */
	public Date getLstTxnDte() {
		return lstTxnDte;
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
