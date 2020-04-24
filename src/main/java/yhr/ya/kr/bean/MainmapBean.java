package yhr.ya.kr.bean;

public class MainmapBean {
	
	private int no;
	private String city_name;
	private String Mm_latitude;
	private String Mm_longitude;
	private String Mm_date;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getMm_latitude() {
		return Mm_latitude;
	}
	public void setMm_latitude(String mm_latitude) {
		Mm_latitude = mm_latitude;
	}
	public String getMm_longitude() {
		return Mm_longitude;
	}
	public void setMm_longitude(String mm_longitude) {
		Mm_longitude = mm_longitude;
	}
	public String getMm_date() {
		return Mm_date;
	}
	public void setMm_date(String mm_date) {
		Mm_date = mm_date;
	}
	
	@Override
	public String toString() {
		return "MainmapBean [no=" + no + ", city_name=" + city_name + ", Mm_latitude=" + Mm_latitude + ", Mm_longitude="
				+ Mm_longitude + ", Mm_date=" + Mm_date + "]";
	}

}
