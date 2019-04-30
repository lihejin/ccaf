package com.ccaf.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UploadConfig {
	@Value("${upload.path}")
	private String uploadPath;

	@Value("${upload.question}")
	private String questionPath;

	@Value("${upload.extendFile}")
	private String extendFilePath;

	@Value("${upload.menuscrip}")
	private String menuscripPath;

	@Value("${upload.contract}")
	private String contractPath;

	public String getMenuscripPath() {
		return menuscripPath;
	}

	public void setMenuscripPath(String menuscripPath) {
		this.menuscripPath = menuscripPath;
	}

	public String getQuestionPath() {
		return questionPath;
	}

	public void setQuestionPath(String questionPath) {
		this.questionPath = questionPath;
	}

	public String getUploadPath() {
		return uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	public String getExtendFilePath() {
		return extendFilePath;
	}

	public void setExtendFilePath(String extendFilePath) {
		this.extendFilePath = extendFilePath;
	}

	public String getContractPath() {
		return contractPath;
	}

	public void setContractPath(String contractPath) {
		this.contractPath = contractPath;
	}
}
