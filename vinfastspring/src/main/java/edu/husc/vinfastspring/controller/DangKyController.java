package edu.husc.vinfastspring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.husc.vinfastspring.bo.khachHangBo;

@Controller
public class DangKyController {
//	@RequestMapping(value = "/dangky")
//	public ModelAndView dangky(Model model, HttpServletRequest request, HttpSession session) {
//		try {
//			//String userName = request.getParameter("user");
//			String hoTen = request.getParameter("fullname");
//			String diaChi= request.getParameter("diachi");
//			String email = request.getParameter("email");
//			String soDT = request.getParameter("sodt");
//			String matKhau = request.getParameter("pass");
//			khachHangBo khbo = new khachHangBo();
//			int kh = khbo.ktdk(hoTen, diaChi, email, soDT, hoTen, matKhau);
//			if(kh == 1) {
//				model.addAttribute("tb","Đăng kí thành công");
//				return new ModelAndView("/dangnhapus");
//			}else {
//				model.addAttribute("tb","Đăng kí thất bại");
//				return new ModelAndView("/dangkyus");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			return null;
//		}
//	}
}
