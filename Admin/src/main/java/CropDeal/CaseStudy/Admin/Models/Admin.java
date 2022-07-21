package CropDeal.CaseStudy.Admin.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int adminid;
	private String emaild;
	
	private String password;

	
	
	public Admin() {
		super();
	}

	public Admin(int adminid, String emaild, String password) {
		super();
		this.adminid = adminid;
		this.emaild = emaild;
		this.password = password;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getEmaild() {
		return emaild;
	}

	public void setEmaild(String emaild) {
		this.emaild = emaild;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
}