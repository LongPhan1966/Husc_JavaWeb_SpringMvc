package edu.husc.vinfastspring.bo;

import java.util.ArrayList;
import java.util.List;

import edu.husc.vinfastspring.bean.loaiBean;
import edu.husc.vinfastspring.dao.loaiDao;

public class loaiBo {
	loaiDao ldao = new loaiDao();
	public ArrayList<loaiBean> getLoai() throws Exception{
		return ldao.getLoai();
	}
	
	public List<loaiBean> getChiTietLoai(String maLoai) throws Exception
	{
		return ldao.getChiTietLoai(maLoai);
	}
	public int insertLoai(String maLoai, String tenLoai) throws Exception
	{
		return ldao.insertLoai(maLoai, tenLoai);
	}
	public int removeLoai(String maLoai) throws Exception
	{
		return ldao.removeLoai(maLoai);
	}
	public boolean chechMaLoai(String maLoai) throws Exception
	{
		return ldao.chechMaLoai(maLoai);
	}
}
