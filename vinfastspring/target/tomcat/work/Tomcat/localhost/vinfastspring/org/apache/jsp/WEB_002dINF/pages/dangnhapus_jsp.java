/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-12-05 17:35:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangnhapus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Đăng nhập</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    <div class=\"login h-100\">\r\n");
      out.write("        <div style=\"margin-top: 70px\" class=\"container h-100\">\r\n");
      out.write("            <!-- <div class=\"col-md-8 col-12\">\r\n");
      out.write("                <div class=\"background-login h-100 \">\r\n");
      out.write("                    <img class=\"background-login-img\" width=\"100%\" src=\"./img/login-bg.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> -->\r\n");
      out.write("            <div style=\"margin: 0 !important;\" class=\"col-md-4\">\r\n");
      out.write("                <div class=\"mt-50\">\r\n");
      out.write("                    <div class=\"col-lg-11\">\r\n");
      out.write("                        <div class=\"text-center\">\r\n");
      out.write("                             <!-- <img src=\"/img/logo-vinfast.png\" style=\"width: 185px;\" alt=\"logo\">-->\r\n");
      out.write("                             <h3>Login Users</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("        \r\n");
      out.write("                        <form method='post' action='dangnhap' class=\"mt-50\">\r\n");
      out.write("                            <div class=\"form-outline mb-4\">\r\n");
      out.write("                                <input name=\"txtun\" type=\"text\" name=\"Email\" id=\"form2Example11\" class=\"form-control\" placeholder=\"user name\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("            \r\n");
      out.write("                            <div class=\"form-outline mb-4\">\r\n");
      out.write("                                <input name=\"txtpass\" type=\"password\" id=\"form2Example22\" class=\"form-control\" placeholder=\"password\"/>\r\n");
      out.write("                            \r\n");
      out.write("                            </div>\r\n");
      out.write("            \r\n");
      out.write("                            <div class=\"text-center pt-1 mb-5 pb-1\">\r\n");
      out.write("                                <button class=\"btn btn-primary btn-block fa-lg gradient-custom-2 mb-3\" type='submit' value='Login'>Log in</button>\r\n");
      out.write("                                <a class=\"text-muted\" href=\"#!\">Forgot password?</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("            \r\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-center pb-4\">\r\n");
      out.write("                                <p class=\"mb-0 me-2 mr-20\">Don't have an account?</p>\r\n");
      out.write("                                <button type=\"button\" class=\"btn btn-outline-danger\">Create new</button>\r\n");
      out.write("                            </div>    \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>  \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
