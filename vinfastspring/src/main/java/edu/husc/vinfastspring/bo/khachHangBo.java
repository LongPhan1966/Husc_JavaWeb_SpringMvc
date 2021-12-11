package edu.husc.vinfastspring.bo;

import edu.husc.vinfastspring.bean.khachHangBean;
import edu.husc.vinfastspring.dao.khachHangDao;

public class khachHangBo {
	khachHangDao khdao = new khachHangDao();
	
	public khachHangBean ktdn(String un, String pass) throws Exception{
		return khdao.ktdn(un, pass);
	}
	
//	public int ktdk( String hoten, String diachi, String email, String sdt, String tendn,String matkhau) throws Exception {
//		return khdao.ktdk(hoten, diachi, email, sdt, tendn, matkhau);
//	}
	
	public int insertKhachHang(String hoten, String diachi, String email, String sdt, String tendn,String matkhau) throws Exception{
		return khdao.insertKhachHang(hoten, diachi, email, sdt, tendn, matkhau);
	}
	
	public boolean checkMaKhachHang(String maKh) throws Exception{
		return khdao.checkMaKhachHang(maKh);
	}
}
