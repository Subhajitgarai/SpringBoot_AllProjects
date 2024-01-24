package com.student.main.entites;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class Certification {

	//	@Id
	private int certificateId;
	private String certificateName;
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
}
