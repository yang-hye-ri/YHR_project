package yhr.ya.kr.bean;

public class MessageBean {
	
	
	private int no;
	private int m_user;
	private String m_date;
	private String m_delYN;
	private String m_title;
	private String m_contents;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getM_user() {
		return m_user;
	}
	public void setM_user(int m_user) {
		this.m_user = m_user;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getM_delYN() {
		return m_delYN;
	}
	public void setM_delYN(String m_delYN) {
		this.m_delYN = m_delYN;
	}
	public String getM_title() {
		return m_title;
	}
	public void setM_title(String m_title) {
		this.m_title = m_title;
	}
	public String getM_contents() {
		return m_contents;
	}
	public void setM_contents(String m_contents) {
		this.m_contents = m_contents;
	}
	
	@Override
	public String toString() {
		return "MessageBean [no=" + no + ", m_user=" + m_user + ", m_date=" + m_date + ", m_delYN=" + m_delYN
				+ ", m_title=" + m_title + ", m_contents=" + m_contents + "]";
	}
	
	
	

}
