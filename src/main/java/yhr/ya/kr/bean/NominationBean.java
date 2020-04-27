package yhr.ya.kr.bean;

public class NominationBean {
	
	private int no;
	private int Ms_no;
	private int Us_no;
	private String N_delYN;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getMs_no() {
		return Ms_no;
	}
	public void setMs_no(int ms_no) {
		Ms_no = ms_no;
	}
	public int getUs_no() {
		return Us_no;
	}
	public void setUs_no(int us_no) {
		Us_no = us_no;
	}
	public String getN_delYN() {
		return N_delYN;
	}
	public void setN_delYN(String n_delYN) {
		N_delYN = n_delYN;
	}
	
	@Override
	public String toString() {
		return "NominationBean [no=" + no + ", Ms_no=" + Ms_no + ", Us_no=" + Us_no + ", N_delYN=" + N_delYN + "]";
	}
	
	

}
