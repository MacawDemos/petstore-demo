package io.macaw.demo.petstore.userservice.mysql.db.dto;

import io.macaw.db.mysql.utils.BaseDTO;

public class Profile extends BaseDTO {
	public Profile() {
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLangpref() {
		return langpref;
	}

	public void setLangpref(String langpref) {
		this.langref = langref;
	}

	public String getFavcategory() {
		return favcategory;
	}

	public void setFavcategory(String favcategory) {
		this.favcategory = favcategory;
	}

	public Boolean getOptedfor() {
		return optedfor;
	}

	public void setOptedfor(Boolean optedfor) {
		this.optedfor = optedfor;
	}

	public Boolean getBanneropt() {
		return banneropt;
	}

	public void setBanneropt(Boolean banneropt) {
		this.banneropt = banneropt;
	}

	private String userid;
	private String langpref;
	private String favcategory;
	private Boolean optedfor;
	private Boolean banneropt;
}
