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
public class Tgen597DO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id_code
	private String idCode;
	//lst_upd_ttp
	private Date lstUpdTtp;
	//cert_type_code
	private String certTypeCode;
	//pty_country_code
	private String ptyCountryCode;

	/**
	 * 设置：id_code
	 */
	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}
	/**
	 * 获取：id_code
	 */
	public String getIdCode() {
		return idCode;
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
	 * 设置：cert_type_code
	 */
	public void setCertTypeCode(String certTypeCode) {
		this.certTypeCode = certTypeCode;
	}
	/**
	 * 获取：cert_type_code
	 */
	public String getCertTypeCode() {
		return certTypeCode;
	}
	/**
	 * 设置：pty_country_code
	 */
	public void setPtyCountryCode(String ptyCountryCode) {
		this.ptyCountryCode = ptyCountryCode;
	}
	/**
	 * 获取：pty_country_code
	 */
	public String getPtyCountryCode() {
		return ptyCountryCode;
	}
}
