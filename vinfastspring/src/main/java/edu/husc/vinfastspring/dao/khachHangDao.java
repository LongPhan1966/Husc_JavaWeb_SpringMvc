package edu.husc.vinfastspring.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.husc.vinfastspring.bean.khachHangBean;
import edu.husc.vinfastspring.bean.loaiBean;

public class khachHangDao {
	DungChung dc= new DungChung();
	public khachHangBean ktdn(String un, String pass) throws Exception
	{
		//b1: ket noi vao csdl
		dc.KetNoi();
		//b2: Lay du lieu ve
		String sql="Select * from KhachHang where tendn=? and pass=?";
		PreparedStatement cmd= dc.cn.prepareStatement(sql);
		//b3: Truyen tham so vao cau lenh sql
		cmd.setString(1,un);
		cmd.setString(2,pass);
		//b4: Thuc hien cau lieu
		ResultSet rs= cmd.executeQuery();
		//kiem tra xem nguoi dung dang nhap dung hay khong
		//neu rs.next==false return null;
		//Nguoc lai: tao ra 01 kh, return kh
		khachHangBean kh = null;
		if (rs.next())
		{
			Long MaKH=rs.getLong("makh");
			String HoTenKH=rs.getString("hoten");
			String DiaChi=rs.getString("diachi");
		    String SDT=rs.getString("sodt");
		    String Email=rs.getString("email");
			String TenDN=rs.getString("tendn");
			String MatKhau=rs.getString("pass");
			kh = new khachHangBean(MaKH, HoTenKH, DiaChi, SDT, Email, TenDN, MatKhau);
		}
		//b6: Dong all 
		rs.close();
		dc.cn.close();
		return kh;
	}
	
	public int insertKhachHang(String hoten, String diachi, String email, String sdt, String tendn,String matkhau) throws Exception{
		dc.KetNoi();
		String sql = "insert into KhachHang (hoten,diachi,sdt,email,tendn,pass) values(?,?,?,?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, hoten);
		cmd.setString(2, diachi);
		cmd.setString(3, email);
		cmd.setString(4, sdt);
		cmd.setString(5, tendn);
		cmd.setString(6, matkhau);
		cmd.executeUpdate();
		dc.cn.close();
		return 1;
	}
	
	public boolean checkMaKhachHang(String maKh) throws Exception{
		dc.KetNoi();
		boolean result = true;
		String sql = "SELECT * FROM KhachHang WHERE makh = ?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maKh);
		ResultSet rs = cmd.executeQuery();
		if(rs.next()) {
			result = false;
		}
		rs.close();
		dc.cn.close();
		return result;
	}
	
//	public int ktdk( String hoten, String diachi, String email, String sdt, String tendn,String matkhau) throws Exception {
//		dc.KetNoi();
//		String sqlktdk = "select * from KhachHang where tendn =?";
//		PreparedStatement ktra = dc.cn.prepareStatement(sqlktdk);
//		ktra.setString(1, tendn);
//		ResultSet ktrars = ktra.executeQuery();
//		int rs;
//		if(ktrars.next() == false) {
//			String sql = "insert into KhachHang (hoten,diachi,sdt,email,tendn,pass) values(?,?,?,?,?,?)";
//			PreparedStatement cmd = dc.cn.prepareStatement(sql);
//			cmd.setString(1,hoten);
//			cmd.setString(2,diachi);
//			cmd.setString(3,email);
//			cmd.setString(4,sdt);
//			cmd.setString(5,tendn);
//			cmd.setString(6,matkhau);
//			
//			rs = cmd.executeUpdate();
//		}
//		else return 0;
//		ktrars.close();
//		dc.cn.close();
//		return rs;
//	}
	
	public ArrayList<khachHangBean> getKh() throws Exception{
		dc.KetNoi();
		ArrayList<khachHangBean> kh = new ArrayList<khachHangBean>();
		String sql = "SELECT * FROM KhachHang";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			Long MaKH=rs.getLong("makh");
			String HoTenKH=rs.getString("hoten");
			String DiaChi=rs.getString("diachi");
		    String SDT=rs.getString("sodt");
		    String Email=rs.getString("email");
			String TenDN=rs.getString("tendn");
			String MatKhau=rs.getString("pass");
			kh.add(new khachHangBean(MaKH,HoTenKH,DiaChi, SDT, Email, TenDN,MatKhau));
		}
		rs.close();
		dc.cn.close();
		return kh;
	}

//	public static void main(String[] args) throws Exception{
//		khachHangDao khdao = new khachHangDao();
//		ArrayList<khachHangBean> list = khdao.getKh();
//		for( khachHangBean i : list) {
//			System.out.println(i.getTendn());
//		}
//	}
}
