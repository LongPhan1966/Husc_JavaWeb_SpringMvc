package edu.husc.vinfastspring.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.husc.vinfastspring.bean.xeBean;
import edu.husc.vinfastspring.bo.xeBo;

public class xeDao {
	DungChung dc = new DungChung();
	
	//SHOW XE
	public ArrayList<xeBean> getXe() throws Exception{
		dc.KetNoi();
		ArrayList<xeBean> ds = new ArrayList<xeBean>();
		String sql = "SELECT * FROM XE";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String tenXe = rs.getString("tenxe");
			Long gia = rs.getLong("gia");
			String maLoai = rs.getString("maloai");
			String anh = rs.getString("anh");
			String xuatsu = rs.getString("xuatsu");
			
			ds.add(new xeBean(tenXe,gia,maLoai,anh, xuatsu));
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	//get chi tiet tung xe
	public ArrayList<xeBean> getChiTietXe(String maXe) throws Exception{
		dc.KetNoi();
		ArrayList<xeBean> ds = new ArrayList<xeBean>();
		String sql = "select * from Xe where maxe = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maXe);
		ResultSet rs = cmd.executeQuery();
		if(rs.next()) {
			String MaXe = rs.getString("maxe");
			String TenXe = rs.getString("tenxe");
			Long SoLuong = rs.getLong("soluong");
			Long Gia =  rs.getLong("gia");
			String MaLoai = rs.getString("maloai");
			String Anh = rs.getString("anh");
			Date NgayNhap = rs.getDate("ngaynhap");
			String XuatSu = rs.getString("xuatsu");
			ds.add(new xeBean(MaXe, TenXe, SoLuong, Gia, MaLoai, Anh, NgayNhap, XuatSu));
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
	
	//THEM XE
	public int insertXe(String maXe, String tenXe, Long soLuong, Long gia, String maLoai,String anh, Date ngayNhap, String xuatSu) throws Exception{
		dc.KetNoi();
		String sql = "INSERT into dbo.Xe (maxe, tenxe, soluong, gia, maloai, anh, NgayNhap, xuatsu) VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		
		cmd.setString(1, maXe);
		cmd.setString(2, tenXe);
		cmd.setLong(3, soLuong);
		cmd.setLong(4, gia);
		cmd.setString(5, maLoai);
		cmd.setString(6, anh);
		cmd.setDate(7, new Date(ngayNhap.getTime()));
		cmd.setString(8, xuatSu);
		cmd.executeUpdate();
		dc.cn.close();
		return 1;
	}
	
	//XOA XE
	public int removeXe(String maXe) throws Exception{
		dc.KetNoi();
		String sql = "DELETE FROM dbo.Xe WHERE maxe = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maXe);
		cmd.executeUpdate();
		dc.cn.close();
		return 1;
	}
	
	
	//CHINH SUA XE
	public int updateXe(String maXe, String tenXe, Long soLuong, Long gia, String maLoai,String anh, Date ngayNhap, String xuatSu) throws Exception{
		
		dc.KetNoi();
		String sql = "update dbo.Xe set maxe = ?, tenxe = ?, soluong = ?, gia = ?, maloai = ?, anh = ?, NgayNhap = ?, xuatsu= ? where maxe = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maXe);
		cmd.setString(2, tenXe);
		cmd.setLong(3, soLuong);
		cmd.setLong(4, gia);
		cmd.setString(5, maLoai);
		cmd.setString(6, anh);
		cmd.setDate(7, new Date(ngayNhap.getTime()));
		cmd.setString(8, xuatSu);
		cmd.setString(9, maXe);
		
		cmd.executeUpdate();
		dc.cn.close();
		return 1;
	}
	
	
	//Check mã Xe
	public boolean checkMaXe(String maXe) throws Exception{
		dc.KetNoi();
		boolean result = true ;
		String sql = "select * from dbo.Xe where maxe = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		cmd.setString(1, maXe);
		if(rs.next()) {
			result = false;
		}
		rs.close();
		dc.cn.close();
		return result;
	}
	
	//hiển thị sô ???
	public Long getSoLuong(String maXe) throws Exception{
		dc.KetNoi();
		Long soLuong = (long)0;
		String sql = "SELECT * FROM dbo.Xe WHERE maxe = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maXe);
		ResultSet rs = cmd.executeQuery();
		if(rs.next()) {
			soLuong = rs.getLong("soluong");
		}
		rs.close();
		dc.cn.close();
		return soLuong;
	}
	
	
//	public static void main(String[] args) {
//		try {
//			xeDao xdao = new xeDao();
//			ArrayList<xeBean> list = xdao.getChiTietXe("feliz");
//			for(xeBean i: list) {
//				System.out.println(i.getGia());
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
}





