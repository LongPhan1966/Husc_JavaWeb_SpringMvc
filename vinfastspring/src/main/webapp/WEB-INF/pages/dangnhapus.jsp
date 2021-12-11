<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Đăng nhập</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<%-- <form method='post' action='dangnhap'>
      <input name='txtun' type='text'><br>
      <input name='txtpass' type='password'><br>
      <input name='but1' type='submit' value='Login'><br>
      <c:if test="${tb == 'dns'}">
    <b> tb:<c:out value="Dang nhap sai"></c:out>  </b>
   </c:if> 
   </form>--%>
    <div class="login h-100">
        <div style="margin-top: 70px" class="container h-100">
            <!-- <div class="col-md-8 col-12">
                <div class="background-login h-100 ">
                    <img class="background-login-img" width="100%" src="./img/login-bg.png" alt="">
                </div>
            </div> -->
            <div style="margin: 0 !important;" class="col-md-4">
                <div class="mt-50">
                    <div class="col-lg-11">
                        <div class="text-center">
                             <!-- <img src="/img/logo-vinfast.png" style="width: 185px;" alt="logo">-->
                             <h3>Login Users</h3>
                        </div>
        
                        <form method='post' action='dangnhap' class="mt-50">
                            <div class="form-outline mb-4">
                                <input name="txtun" type="text" name="Email" id="form2Example11" class="form-control" placeholder="user name"/>
                            </div>
            
                            <div class="form-outline mb-4">
                                <input name="txtpass" type="password" id="form2Example22" class="form-control" placeholder="password"/>
                            
                            </div>
            
                            <div class="text-center pt-1 mb-5 pb-1">
                                <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3" type='submit' value='Login'>Log in</button>
                                <a class="text-muted" href="#!">Forgot password?</a>
                            </div>
            
                            <div class="d-flex align-items-center justify-content-center pb-4">
                                <p class="mb-0 me-2 mr-20">Don't have an account?</p>
                                <button type="button" class="btn btn-outline-danger">Create new</button>
                            </div>    
                        </form>
                    </div>  
                </div>
            </div>
        </div>
    </div>
</body>
</html>