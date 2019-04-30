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
public class SltactbkDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//act_idn_sky
	private String actIdnSky;
	//lst_upd_ttp
	private Date lstUpdTtp;
	//act_sts_cde
	private String actStsCde;
	//rmb_slt_cdt_lmt_amt
	private Long rmbSltCdtLmtAmt;
	//rmb_slt_used_amt
	private Long rmbSltUsedAmt;
	//usd_slt_cdt_lmt_amt
	private Long usdSltCdtLmtAmt;
	//usd_slt_used_amt
	private Long usdSltUsedAmt;
	//ttps
	private String ttps;
	//lst_upd_nbr
	private Integer lstUpdNbr;
	//olt_ind
	private String oltInd;

	/**
	 * 设置：act_idn_sky
	 */
	public void setActIdnSky(String actIdnSky) {
		this.actIdnSky = actIdnSky;
	}
	/**
	 * 获取：act_idn_sky
	 */
	public String getActIdnSky() {
		return actIdnSky;
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
	 * 设置：act_sts_cde
	 */
	public void setActStsCde(String actStsCde) {
		this.actStsCde = actStsCde;
	}
	/**
	 * 获取：act_sts_cde
	 */
	public String getActStsCde() {
		return actStsCde;
	}
	/**
	 * 设置：rmb_slt_cdt_lmt_amt
	 */
	public void setRmbSltCdtLmtAmt(Long rmbSltCdtLmtAmt) {
		this.rmbSltCdtLmtAmt = rmbSltCdtLmtAmt;
	}
	/**
	 * 获取：rmb_slt_cdt_lmt_amt
	 */
	public Long getRmbSltCdtLmtAmt() {
		return rmbSltCdtLmtAmt;
	}
	/**
	 * 设置：rmb_slt_used_amt
	 */
	public void setRmbSltUsedAmt(Long rmbSltUsedAmt) {
		this.rmbSltUsedAmt = rmbSltUsedAmt;
	}
	/**
	 * 获取：rmb_slt_used_amt
	 */
	public Long getRmbSltUsedAmt() {
		return rmbSltUsedAmt;
	}
	/**
	 * 设置：usd_slt_cdt_lmt_amt
	 */
	public void setUsdSltCdtLmtAmt(Long usdSltCdtLmtAmt) {
		this.usdSltCdtLmtAmt = usdSltCdtLmtAmt;
	}
	/**
	 * 获取：usd_slt_cdt_lmt_amt
	 */
	public Long getUsdSltCdtLmtAmt() {
		return usdSltCdtLmtAmt;
	}
	/**
	 * 设置：usd_slt_used_amt
	 */
	public void setUsdSltUsedAmt(Long usdSltUsedAmt) {
		this.usdSltUsedAmt = usdSltUsedAmt;
	}
	/**
	 * 获取：usd_slt_used_amt
	 */
	public Long getUsdSltUsedAmt() {
		return usdSltUsedAmt;
	}
	/**
	 * 设置：ttps
	 */
	public void setTtps(String ttps) {
		this.ttps = ttps;
	}
	/**
	 * 获取：ttps
	 */
	public String getTtps() {
		return ttps;
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
	/**
	 * 设置：olt_ind
	 */
	public void setOltInd(String oltInd) {
		this.oltInd = oltInd;
	}
	/**
	 * 获取：olt_ind
	 */
	public String getOltInd() {
		return oltInd;
	}
}
