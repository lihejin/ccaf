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
public class TopactDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//act_idn_sky
	private String actIdnSky;
	//lst_upd_ttp
	private Date lstUpdTtp;
	//csh_in_ind
	private String cshInInd;
	//ave_bal_amt
	private Long aveBalAmt;
	//ttps
	private String ttps;
	//lst_upd_nbr
	private Integer lstUpdNbr;
	//risk_stop_flg
	private String riskStopFlg;

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
	 * 设置：csh_in_ind
	 */
	public void setCshInInd(String cshInInd) {
		this.cshInInd = cshInInd;
	}
	/**
	 * 获取：csh_in_ind
	 */
	public String getCshInInd() {
		return cshInInd;
	}
	/**
	 * 设置：ave_bal_amt
	 */
	public void setAveBalAmt(Long aveBalAmt) {
		this.aveBalAmt = aveBalAmt;
	}
	/**
	 * 获取：ave_bal_amt
	 */
	public Long getAveBalAmt() {
		return aveBalAmt;
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
	 * 设置：risk_stop_flg
	 */
	public void setRiskStopFlg(String riskStopFlg) {
		this.riskStopFlg = riskStopFlg;
	}
	/**
	 * 获取：risk_stop_flg
	 */
	public String getRiskStopFlg() {
		return riskStopFlg;
	}
}
