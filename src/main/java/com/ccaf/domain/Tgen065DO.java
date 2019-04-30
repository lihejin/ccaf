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
public class Tgen065DO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//rfe_typ_idn_cde
	private String rfeTypIdnCde;
	//lst_upd_ttp
	private Date lstUpdTtp;
	//rfe_val_idn_cde
	private String rfeValIdnCde;
	//dft_ind
	private String dftInd;
	//tln_val_cde
	private String tlnValCde;
	//atv_ind
	private String atvInd;
	//lst_upd_usr
	private String lstUpdUsr;

	/**
	 * 设置：rfe_typ_idn_cde
	 */
	public void setRfeTypIdnCde(String rfeTypIdnCde) {
		this.rfeTypIdnCde = rfeTypIdnCde;
	}
	/**
	 * 获取：rfe_typ_idn_cde
	 */
	public String getRfeTypIdnCde() {
		return rfeTypIdnCde;
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
	 * 设置：rfe_val_idn_cde
	 */
	public void setRfeValIdnCde(String rfeValIdnCde) {
		this.rfeValIdnCde = rfeValIdnCde;
	}
	/**
	 * 获取：rfe_val_idn_cde
	 */
	public String getRfeValIdnCde() {
		return rfeValIdnCde;
	}
	/**
	 * 设置：dft_ind
	 */
	public void setDftInd(String dftInd) {
		this.dftInd = dftInd;
	}
	/**
	 * 获取：dft_ind
	 */
	public String getDftInd() {
		return dftInd;
	}
	/**
	 * 设置：tln_val_cde
	 */
	public void setTlnValCde(String tlnValCde) {
		this.tlnValCde = tlnValCde;
	}
	/**
	 * 获取：tln_val_cde
	 */
	public String getTlnValCde() {
		return tlnValCde;
	}
	/**
	 * 设置：atv_ind
	 */
	public void setAtvInd(String atvInd) {
		this.atvInd = atvInd;
	}
	/**
	 * 获取：atv_ind
	 */
	public String getAtvInd() {
		return atvInd;
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
