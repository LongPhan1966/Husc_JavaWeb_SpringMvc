package edu.husc.vinfastspring.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class hoaDonDao {
	DungChung dc = new DungChung();
	
	public int insertHoaDon(String maKH) throws Exception{
		dc.KetNoi();
		String sql = "insert into dbo.HoaDon(makh,NgayMua,damua) values(?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, maKH);
		long millis = System.currentTimeMillis();
        java.sql.Date ngaymua = new java.sql.Date(millis);
        cmd.setDate(2, ngaymua);
		cmd.setBoolean(3, false);
		cmd.executeUpdate();
		dc.cn.close();
		return 1;
	}
	
	public Long getLastHoaDon() throws Exception{
		dc.KetNoi();
		Long hoadon;
		String sql = "SELECT TOP(1) * FROM HoaDon ORDER BY makh desc";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		if(rs.next()) {
			hoadon = rs.getLong("MaHoaDon");
		}else {
			hoadon = null;
		}
		rs.close();
		dc.cn.close();
		return hoadon;
	}
}
