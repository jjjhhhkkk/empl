package model;

import java.sql.Date;

public class MemberDTO {
	String email;
	String pwd;
	String mname;
	Date cre_date;
	Date mod_date;
	int mno;
	
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public MemberDTO(String email, String pwd, String mname, Date cre_date, Date mod_date, int mno) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.mname = mname;
		this.cre_date = cre_date;
		this.mod_date = mod_date;
		this.mno = mno;
	}

	public MemberDTO(){
		
	}
	
	public MemberDTO(String email, String pwd, String mname, Date cre_date, Date mod_date) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.mname = mname;
		this.cre_date = cre_date;
		this.mod_date = mod_date;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Date getCre_date() {
		return cre_date;
	}
	public void setCre_date(Date cre_date) {
		this.cre_date = cre_date;
	}
	public Date getMod_date() {
		return mod_date;
	}
	public void setMod_date(Date mod_date) {
		this.mod_date = mod_date;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberDTO [email=").append(email).append(", pwd=").append(pwd).append(", mname=").append(mname)
				.append(", cre_date=").append(cre_date).append(", mod_date=").append(mod_date).append(", mno=")
				.append(mno).append("]");
		return builder.toString();
	}
	
	
}
