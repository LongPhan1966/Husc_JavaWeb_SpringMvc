<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Đăng ký khách hàng</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
		        <form action="dangky" method="post" style="width: 500px;height: 500px; margin-left: 200px">
		        
			        <div style="width: 740px; height: 30px;margin-top: 50px">
						<input name="user" type="text" style="padding: 3px;float: left;width: 295px;color: #000;font-size: 15px;margin-right: 10px;height: 30px;" placeholder="Nhập Username" aria-label="Nhập Username">
					</div>
					
					<div style="width: 740px; height: 30px;margin-top: 10px">
						<input name="fullname" type="text" style="padding: 3px;float: left;width: 295px;color: #000;font-size: 15px;margin-right: 10px;height: 30px;" placeholder="Nhập họ tên" aria-label="Nhập họ tên">
					</div>
					
					<div style="width: 740px; height: 30px;margin-top: 10px">
						<input name="pass" type="password" style="padding: 3px;float: left;width: 295px;color: #000;font-size: 15px;margin-right: 10px;height: 30px;" placeholder="Nhập mật khẩu" aria-label="Nhập mật khẩu">
					</div>
					
					<div style="width: 740px; height: 30px;margin-top: 10px">
						<input name="diachi" type="text" style="padding: 3px;float: left;width: 295px;color: #000;font-size: 15px;margin-right: 10px;height: 30px;" placeholder="Nhập địa chỉ" aria-label="Nhập địa chỉ">
					</div>
					
					<div style="width: 740px; height: 30px;margin-top: 10px">
						<input name="email" type="email" style="padding: 3px;float: left;width: 295px;color: #000;font-size: 15px;margin-right: 10px;height: 30px;"  placeholder="Nhập địa chỉ Email" aria-label="Nhập địa chỉ Email">
					</div>
					
					<div style="width: 740px; height: 30px;margin-top: 10px">
						<input name="sodt" type="text" style="padding: 3px;float: left;width: 295px;color: #000;font-size: 15px;margin-right: 10px;height: 30px;" placeholder="Nhập số điện thoại" aria-label="Nhập số điện thoại">
					</div>
					
					<div style="width: 740px; height: 30px;margin-top: 10px">
						<button type="submit" style="background-color: #1a83d2;height: 33px;width: 100px;float: left;text-align: center;font-weight: bold;color: #FFF;cursor: pointer; border: 1px">Đăng ký</button>
					</div>
		        </form>

		   		
</body>
</html>