package yhr.ya.kr.bean;

public class UserBean {
	
	
	private int no;
	private String id;
	private String pwd;
	private String email;
	private String u_delYN;
	private String u_manager;
	private String u_date;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getU_delYN() {
		return u_delYN;
	}
	public void setU_delYN(String u_delYN) {
		this.u_delYN = u_delYN;
	}
	public String getU_manager() {
		return u_manager;
	}
	public void setU_manager(String u_manager) {
		this.u_manager = u_manager;
	}
	public String getU_date() {
		return u_date;
	}
	public void setU_date(String u_date) {
		this.u_date = u_date;
	}
	
	@Override
	public String toString() {
		return "UserBean [no=" + no + ", id=" + id + ", pwd=" + pwd + ", email=" + email + ", u_delYN=" + u_delYN
				+ ", u_manager=" + u_manager + ", u_date=" + u_date + "]";
	}
	
	
	
	

	
}
