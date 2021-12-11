package edu.husc.vinfastspring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.husc.vinfastspring.bean.khachHangBean;
import edu.husc.vinfastspring.bo.khachHangBo;

@Controller
public class DangNhapController {
	@RequestMapping("/dangnhap")
	public ModelAndView dangnhap(Model model, HttpServletRequest request, HttpSession session) {
		try {
			String un = request.getParameter("txtun");
			String pass = request.getParameter("txtpass");
			
			khachHangBo khbo = new khachHangBo();
			
			if(un == null) {
				return new ModelAndView("dangnhapus");
			}
			else {
				khachHangBean kh=khbo.ktdn(un, pass);
				if(kh != null) {
					session.setAttribute("kh", kh);
					return new ModelAndView("homeus");
				}
				else {
					model.addAttribute("tb", "Dang nhap sai");
					return new ModelAndView("dangnhapus");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}