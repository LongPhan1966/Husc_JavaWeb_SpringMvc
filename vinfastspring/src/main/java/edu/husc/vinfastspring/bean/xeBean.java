package edu.husc.vinfastspring.bean;

import java.util.Date;

public class xeBean {
	public String maxe;
	public String tenxe;
	public long soluong;
	public long gia;
	public String maloai;
	public String anh;
	public Date ngaynhap;
	public String xuatsu;
	public xeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public xeBean(String maxe, String tenxe, long soluong, long gia, String maloai, String anh, Date ngaynhap,
			String xuatsu) {
		super();
		this.maxe = maxe;
		this.tenxe = tenxe;
		this.soluong = soluong;
		this.gia = gia;
		this.maloai = maloai;
		this.anh = anh;
		this.ngaynhap = ngaynhap;
		this.xuatsu = xuatsu;
	}
	public xeBean(String tenxe, long gia, String maloai, String anh, String xuatsu) {
		super();
		
		this.tenxe = tenxe;
		this.gia = gia;
		this.maloai = maloai;
		this.anh = anh;
		this.xuatsu = xuatsu;
	}
	public String getMaxe() {
		return maxe;
	}
	public void setMaxe(String maxe) {
		this.maxe = maxe;
	}
	public String getTenxe() {
		return tenxe;
	}
	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public Date getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public String getXuatsu() {
		return xuatsu;
	}
	public void setXuatsu(String xuatsu) {
		this.xuatsu = xuatsu;
	}
	
	
}
