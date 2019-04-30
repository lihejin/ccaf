package com.ccaf.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-04-25 15:59:16
 */
public class CardDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//lst_upd_ttp
	private Date lstUpdTtp;
	//pan_txt
	private String panTxt;
	//app_ise_nbr
	private String appIseNbr;
	//pdt_idn_cde
	private String pdtIdnCde;
	//pla_sts_cde
	private String plaStsCde;
	//end_ttp
	private Date endTtp;
	//cvv
	private String cvv;
	//cvv2
	private String cvv2;
	//pin_oft
	private String pinOft;
	//app_typ
	private String appTyp;
	//pin_ver_pos_txn
	private String pinVerPosTxn;
	//cv2_rts_nbr
	private Integer cv2RtsNbr;
	//pin_rts_nbr
	private Integer pinRtsNbr;
	//rts_nbr_dte
	private Date rtsNbrDte;
	//end_dte_rts_nbr
	private Integer endDteRtsNbr;
	//csr_rts_nbr
	private Integer csrRtsNbr;
	//slt_act_idn_sky
	private String sltActIdnSky;
	//top_act_idn_sky
	private String topActIdnSky;
	//csr_idn_sky
	private String csrIdnSky;
	//p_dly_vty_nbr_upl
	private Integer pDlyVtyNbrUpl;
	//p_dly_vty_amt_upl
	private Long pDlyVtyAmtUpl;
	//p_dly_vty_tot_nbr
	private Integer pDlyVtyTotNbr;
	//p_dly_vty_tot_amt
	private Long pDlyVtyTotAmt;
	//p_vty_upd_ttp
	private Date pVtyUpdTtp;
	//f_dly_vty_tot_nbr
	private Integer fDlyVtyTotNbr;
	//f_dly_vty_tot_amt
	private Long fDlyVtyTotAmt;
	//f_vty_upd_ttp
	private Date fVtyUpdTtp;
	//ttps
	private String ttps;
	//lst_upd_nbr
	private Integer lstUpdNbr;
	//app_idn_sky
	private String appIdnSky;
	//man_act_ind
	private String manActInd;
	//man_csr_idn_sky
	private String manCsrIdnSky;

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
	 * 设置：app_ise_nbr
	 */
	public void setAppIseNbr(String appIseNbr) {
		this.appIseNbr = appIseNbr;
	}
	/**
	 * 获取：app_ise_nbr
	 */
	public String getAppIseNbr() {
		return appIseNbr;
	}
	/**
	 * 设置：pdt_idn_cde
	 */
	public void setPdtIdnCde(String pdtIdnCde) {
		this.pdtIdnCde = pdtIdnCde;
	}
	/**
	 * 获取：pdt_idn_cde
	 */
	public String getPdtIdnCde() {
		return pdtIdnCde;
	}
	/**
	 * 设置：pla_sts_cde
	 */
	public void setPlaStsCde(String plaStsCde) {
		this.plaStsCde = plaStsCde;
	}
	/**
	 * 获取：pla_sts_cde
	 */
	public String getPlaStsCde() {
		return plaStsCde;
	}
	/**
	 * 设置：end_ttp
	 */
	public void setEndTtp(Date endTtp) {
		this.endTtp = endTtp;
	}
	/**
	 * 获取：end_ttp
	 */
	public Date getEndTtp() {
		return endTtp;
	}
	/**
	 * 设置：cvv
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	/**
	 * 获取：cvv
	 */
	public String getCvv() {
		return cvv;
	}
	/**
	 * 设置：cvv2
	 */
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	/**
	 * 获取：cvv2
	 */
	public String getCvv2() {
		return cvv2;
	}
	/**
	 * 设置：pin_oft
	 */
	public void setPinOft(String pinOft) {
		this.pinOft = pinOft;
	}
	/**
	 * 获取：pin_oft
	 */
	public String getPinOft() {
		return pinOft;
	}
	/**
	 * 设置：app_typ
	 */
	public void setAppTyp(String appTyp) {
		this.appTyp = appTyp;
	}
	/**
	 * 获取：app_typ
	 */
	public String getAppTyp() {
		return appTyp;
	}
	/**
	 * 设置：pin_ver_pos_txn
	 */
	public void setPinVerPosTxn(String pinVerPosTxn) {
		this.pinVerPosTxn = pinVerPosTxn;
	}
	/**
	 * 获取：pin_ver_pos_txn
	 */
	public String getPinVerPosTxn() {
		return pinVerPosTxn;
	}
	/**
	 * 设置：cv2_rts_nbr
	 */
	public void setCv2RtsNbr(Integer cv2RtsNbr) {
		this.cv2RtsNbr = cv2RtsNbr;
	}
	/**
	 * 获取：cv2_rts_nbr
	 */
	public Integer getCv2RtsNbr() {
		return cv2RtsNbr;
	}
	/**
	 * 设置：pin_rts_nbr
	 */
	public void setPinRtsNbr(Integer pinRtsNbr) {
		this.pinRtsNbr = pinRtsNbr;
	}
	/**
	 * 获取：pin_rts_nbr
	 */
	public Integer getPinRtsNbr() {
		return pinRtsNbr;
	}
	/**
	 * 设置：rts_nbr_dte
	 */
	public void setRtsNbrDte(Date rtsNbrDte) {
		this.rtsNbrDte = rtsNbrDte;
	}
	/**
	 * 获取：rts_nbr_dte
	 */
	public Date getRtsNbrDte() {
		return rtsNbrDte;
	}
	/**
	 * 设置：end_dte_rts_nbr
	 */
	public void setEndDteRtsNbr(Integer endDteRtsNbr) {
		this.endDteRtsNbr = endDteRtsNbr;
	}
	/**
	 * 获取：end_dte_rts_nbr
	 */
	public Integer getEndDteRtsNbr() {
		return endDteRtsNbr;
	}
	/**
	 * 设置：csr_rts_nbr
	 */
	public void setCsrRtsNbr(Integer csrRtsNbr) {
		this.csrRtsNbr = csrRtsNbr;
	}
	/**
	 * 获取：csr_rts_nbr
	 */
	public Integer getCsrRtsNbr() {
		return csrRtsNbr;
	}
	/**
	 * 设置：slt_act_idn_sky
	 */
	public void setSltActIdnSky(String sltActIdnSky) {
		this.sltActIdnSky = sltActIdnSky;
	}
	/**
	 * 获取：slt_act_idn_sky
	 */
	public String getSltActIdnSky() {
		return sltActIdnSky;
	}
	/**
	 * 设置：top_act_idn_sky
	 */
	public void setTopActIdnSky(String topActIdnSky) {
		this.topActIdnSky = topActIdnSky;
	}
	/**
	 * 获取：top_act_idn_sky
	 */
	public String getTopActIdnSky() {
		return topActIdnSky;
	}
	/**
	 * 设置：csr_idn_sky
	 */
	public void setCsrIdnSky(String csrIdnSky) {
		this.csrIdnSky = csrIdnSky;
	}
	/**
	 * 获取：csr_idn_sky
	 */
	public String getCsrIdnSky() {
		return csrIdnSky;
	}
	/**
	 * 设置：p_dly_vty_nbr_upl
	 */
	public void setPDlyVtyNbrUpl(Integer pDlyVtyNbrUpl) {
		this.pDlyVtyNbrUpl = pDlyVtyNbrUpl;
	}
	/**
	 * 获取：p_dly_vty_nbr_upl
	 */
	public Integer getPDlyVtyNbrUpl() {
		return pDlyVtyNbrUpl;
	}
	/**
	 * 设置：p_dly_vty_amt_upl
	 */
	public void setPDlyVtyAmtUpl(Long pDlyVtyAmtUpl) {
		this.pDlyVtyAmtUpl = pDlyVtyAmtUpl;
	}
	/**
	 * 获取：p_dly_vty_amt_upl
	 */
	public Long getPDlyVtyAmtUpl() {
		return pDlyVtyAmtUpl;
	}
	/**
	 * 设置：p_dly_vty_tot_nbr
	 */
	public void setPDlyVtyTotNbr(Integer pDlyVtyTotNbr) {
		this.pDlyVtyTotNbr = pDlyVtyTotNbr;
	}
	/**
	 * 获取：p_dly_vty_tot_nbr
	 */
	public Integer getPDlyVtyTotNbr() {
		return pDlyVtyTotNbr;
	}
	/**
	 * 设置：p_dly_vty_tot_amt
	 */
	public void setPDlyVtyTotAmt(Long pDlyVtyTotAmt) {
		this.pDlyVtyTotAmt = pDlyVtyTotAmt;
	}
	/**
	 * 获取：p_dly_vty_tot_amt
	 */
	public Long getPDlyVtyTotAmt() {
		return pDlyVtyTotAmt;
	}
	/**
	 * 设置：p_vty_upd_ttp
	 */
	public void setPVtyUpdTtp(Date pVtyUpdTtp) {
		this.pVtyUpdTtp = pVtyUpdTtp;
	}
	/**
	 * 获取：p_vty_upd_ttp
	 */
	public Date getPVtyUpdTtp() {
		return pVtyUpdTtp;
	}
	/**
	 * 设置：f_dly_vty_tot_nbr
	 */
	public void setFDlyVtyTotNbr(Integer fDlyVtyTotNbr) {
		this.fDlyVtyTotNbr = fDlyVtyTotNbr;
	}
	/**
	 * 获取：f_dly_vty_tot_nbr
	 */
	public Integer getFDlyVtyTotNbr() {
		return fDlyVtyTotNbr;
	}
	/**
	 * 设置：f_dly_vty_tot_amt
	 */
	public void setFDlyVtyTotAmt(Long fDlyVtyTotAmt) {
		this.fDlyVtyTotAmt = fDlyVtyTotAmt;
	}
	/**
	 * 获取：f_dly_vty_tot_amt
	 */
	public Long getFDlyVtyTotAmt() {
		return fDlyVtyTotAmt;
	}
	/**
	 * 设置：f_vty_upd_ttp
	 */
	public void setFVtyUpdTtp(Date fVtyUpdTtp) {
		this.fVtyUpdTtp = fVtyUpdTtp;
	}
	/**
	 * 获取：f_vty_upd_ttp
	 */
	public Date getFVtyUpdTtp() {
		return fVtyUpdTtp;
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
	 * 设置：man_act_ind
	 */
	public void setManActInd(String manActInd) {
		this.manActInd = manActInd;
	}
	/**
	 * 获取：man_act_ind
	 */
	public String getManActInd() {
		return manActInd;
	}
	/**
	 * 设置：man_csr_idn_sky
	 */
	public void setManCsrIdnSky(String manCsrIdnSky) {
		this.manCsrIdnSky = manCsrIdnSky;
	}
	/**
	 * 获取：man_csr_idn_sky
	 */
	public String getManCsrIdnSky() {
		return manCsrIdnSky;
	}
}
