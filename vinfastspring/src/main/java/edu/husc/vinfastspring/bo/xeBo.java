package edu.husc.vinfastspring.bo;

import java.sql.Date;
import java.util.ArrayList;

import edu.husc.vinfastspring.bean.xeBean;
import edu.husc.vinfastspring.dao.xeDao;

public class xeBo {
	xeDao xdao = new xeDao();
	
	public ArrayList<xeBean> getXe() throws Exception{
		return xdao.getXe();
	}
	
	public ArrayList<xeBean> getChiTietXe(String maXe) throws Exception{
		return xdao.getChiTietXe(maXe);
	}
	
	public int insertXe(String maXe, String tenXe, Long soLuong, Long gia, String maLoai,String anh, Date ngayNhap, String xuatSu) throws Exception{
		return xdao.insertXe(maXe, tenXe, soLuong, gia, maLoai, anh, ngayNhap, xuatSu);
	}
	
	public int removeXe(String maXe) throws Exception{
		return xdao.removeXe(maXe);
	}
	
	public int updateXe(String maXe, String tenXe, Long soLuong, Long gia, String maLoai,String anh, Date ngayNhap, String xuatSu) throws Exception{
		return xdao.updateXe(maXe, tenXe, soLuong, gia, maLoai, anh, ngayNhap, xuatSu);
	}
	
	public boolean checkMaXe(String maXe) throws Exception{
		return xdao.checkMaXe(maXe);
	}
	
	public Long getSoLuong(String maXe) throws Exception{
		return xdao.getSoLuong(maXe);
	}
	
}
