package edu.husc.vinfastspring.bean;

public class khachHangBean {
	private Long makh;
	private String hoten;
	private String diachi;
	private String email;
	private String sdt;
	private String tendn;
	private String matkhau;
	public khachHangBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public khachHangBean(Long makh, String hoten, String diachi, String email, String sdt, String tendn,
			String matkhau) {
		super();
		this.makh = makh;
		this.hoten = hoten;
		this.diachi = diachi;
		this.email = email;
		this.sdt = sdt;
		this.tendn = tendn;
		this.matkhau = matkhau;
	}
	@Override
	public String toString() {
		return "khachHangBean [makh=" + makh + ", hoten=" + hoten + ", diachi=" + diachi + ", email=" + email + ", sdt="
				+ sdt + ", tendn=" + tendn + ", matkhau=" + matkhau + "]";
	}
	public Long getMakh() {
		return makh;
	}
	public void setMakh(Long makh) {
		this.makh = makh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getTendn() {
		return tendn;
	}
	public void setTendn(String tendn) {
		this.tendn = tendn;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	
	
}
