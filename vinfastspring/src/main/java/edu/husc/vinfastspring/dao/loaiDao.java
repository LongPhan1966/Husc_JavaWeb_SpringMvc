package edu.husc.vinfastspring.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.husc.vinfastspring.bean.loaiBean;

public class loaiDao {
	DungChung dc = new DungChung();
	
	public ArrayList<loaiBean> getLoai() throws Exception{
		dc.KetNoi();
		ArrayList<loaiBean> ds = new ArrayList<loaiBean>();
		String sql = "SELECT * FROM Loai";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String maLoai = rs.getString("maloai");
			String tenLoai = rs.getString("tenloai");
			
			ds.add(new loaiBean(maLoai,tenLoai));
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	public List<loaiBean> getChiTietLoai(String maLoai) throws Exception{
		dc.KetNoi();
		List<loaiBean> ds = new ArrayList<loaiBean>();
		String sql = "select * from Loai where maloai = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maLoai);
		ResultSet rs = cmd.executeQuery();
		if(rs.next()) {
			String MaLoai = rs.getString("maloai");
			String TenLoai = rs.getString("tenloai");
			ds.add(new loaiBean(MaLoai, TenLoai));
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	public int insertLoai(String maLoai, String tenLoai) throws Exception{
		dc.KetNoi();
		String sql = "Insert into Loai (maloai, tenloai) values(?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maLoai);
		cmd.setString(2, tenLoai);
		cmd.executeUpdate();
		dc.cn.close();
		return 1;
	}
	
	public int removeLoai(String maLoai) throws Exception{
		dc.KetNoi();
		String sql = "Delete from Loai where maloai = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maLoai);
		cmd.executeUpdate();
		dc.cn.close();
		return 1;
	}
	
	public boolean chechMaLoai(String maLoai) throws Exception{
		dc.KetNoi();
		boolean result = true;
		String sql = "Select * from Loai where maloai = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maLoai);
		ResultSet rs = cmd.executeQuery();
		if(rs.next()) {
			result = false;
		}
		dc.cn.close();
		return result;
	}
	
//	public static void main(String[] args) throws Exception{
//		loaiDao ldao = new loaiDao();
//		List<loaiBean> list = ldao.getChiTietLoai("caocap");
//		for( loaiBean i : list) {
//			System.out.println(i.getTenloai());
//		}
//	}
}
