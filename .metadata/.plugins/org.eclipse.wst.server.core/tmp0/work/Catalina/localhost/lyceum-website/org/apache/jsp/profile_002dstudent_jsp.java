/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2016-01-09 12:16:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_002dstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <!--Import Google Icon Font-->\r\n");
      out.write("  <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("  <!--Import materialize.css-->\r\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("  <!--Let browser know website is optimized for mobile-->\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("\r\n");
      out.write("\t<ul id=\"dropdown1\" class=\"dropdown-content\">\r\n");
      out.write("\t\t<li><a href=\"#!\">Settings</a></li>\r\n");
      out.write("\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t<li><a href=\"#!\">Log out</a></li>\r\n");
      out.write("\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t<li><a href=\"#!\">Anything</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<div class=\"nav-wrapper white\">\r\n");
      out.write("\t\t  <a href=\"#!\" class=\"brand-logo left\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pictures/icon.png\" class=\"banner\"> </a>\r\n");
      out.write("\t\t  <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("\t\t    <li><a href=\"home-student.jsp\" class=\"yellow-text text-darken-2\">BOARD<i class=\"material-icons left\">list</i></a></li>\r\n");
      out.write("\t\t    <li><a href=\"grades.jsp\" class=\"yellow-text text-darken-2\">GRADES<i class=\"material-icons left\">grade</i></a></li>\r\n");
      out.write("\t\t    <li><a href=\"quiz.jsp\" class=\"yellow-text text-darken-2\">QUIZZES<i class=\"material-icons left\">assignment</i></a></li>\r\n");
      out.write("\t\t    <li><a href=\"message.jsp\" class=\"yellow-text text-darken-2\">MESSAGES<i class=\"material-icons left\">email</i></a></li>\r\n");
      out.write("\t\t    <li>\r\n");
      out.write("\t\t\t    <a href=\"about.jsp\" class=\"yellow-text text-darken-2 small dropdown-button\" data-activates=\"dropdown1\">\r\n");
      out.write("\t\t\t    <img src=\"");
      out.print(request.getContextPath());
      out.write("/pictures/pictureSample.jpg\" class=\"circle\" alt=\"picture\" height=\"42\" width=\"42\" align=\"middle\"></a>\r\n");
      out.write("\t\t    </li>\r\n");
      out.write("\t\t  </ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$( document ).ready(function){\r\n");
      out.write("\t\t\t$(\".dropdown-button\").dropdown();        \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"blue-grey lighten-5\">\r\n");
      out.write("\t<div class=\"wrapper\">  \r\n");
      out.write("\t\t<header class=\"header yellow darken-2\">\r\n");
      out.write("\t\t\t<h3 class=\"white-text light\" align=\"center\">PROFILE</h3>\r\n");
      out.write("\t\t</header>  \r\n");
      out.write("\t\t<article class=\"main\">    \r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <form action=\"");
      out.print(request.getContextPath());
      out.write("/home-student/change-profile-action\" class=\"col s12\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                  <div class=\"col s12\" align=\"center\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/pictures/pictureSample.jpg\" class=\"circle\" width=\"300\" height=\"300\">\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col s8\" align=\"center\">\r\n");
      out.write("                      <div class=\"file-field input-field\">\r\n");
      out.write("                        <div class=\"btn\">\r\n");
      out.write("                          <span>File</span>\r\n");
      out.write("                          <input type=\"file\" name=\"userImage\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"file-path-wrapper\">\r\n");
      out.write("                          <input class=\"file-path validate\" type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <h3 class=\"light col s12\">About</h3>\r\n");
      out.write("                <div class=\"input-field col s12\">\r\n");
      out.write("                         <textarea id=\"textarea1\" class=\"materialize-textarea\"></textarea>\r\n");
      out.write("                         <label for=\"textarea1\">Textarea</label>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <h3 class=\"light col s12\">Hobbies</h3>\r\n");
      out.write("                <div class=\"input-field col s12\">\r\n");
      out.write("                         <textarea id=\"textarea1\" class=\"materialize-textarea\"></textarea>\r\n");
      out.write("                         <label for=\"textarea1\">Textarea</label>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <input type=\"submit\" value=\"Change Profile\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>   \r\n");
      out.write("      </div>\r\n");
      out.write("\t\t</article>  \r\n");
      out.write("\r\n");
      out.write("\t\t<aside class=\"aside aside-2\">\r\n");
      out.write("\t\t\t<h3 class=\"yellow-text text-darken-2 col s12 light\">Tutorials</h3>\r\n");
      out.write("\t\t\t<a class=\"col s12\" href=\"#\">\r\n");
      out.write("\t\t\t  <i class=\"material-icons large center-align yellow-text text-darken-2 \" style=\"display: block; margin-left: auto; margin-rght: auto;\">live_tv</i>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h5 class=\"col s12 light\">Watch Video Tutorials Online!</h5>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  \t@import \"compass/css3\";\r\n");
      out.write("\r\n");
      out.write("  \t.wrapper {\r\n");
      out.write("  \t  display: -webkit-box;\r\n");
      out.write("  \t  display: -moz-box;\r\n");
      out.write("  \t  display: -ms-flexbox;\r\n");
      out.write("  \t  display: -webkit-flex;\r\n");
      out.write("  \t  display: flex;  \r\n");
      out.write("  \t\r\n");
      out.write("  \t  -webkit-flex-flow: row wrap;\r\n");
      out.write("  \t  flex-flow: row wrap;\r\n");
      out.write("  \t}\r\n");
      out.write("\r\n");
      out.write("  \t.wrapper > * {\r\n");
      out.write("  \t  padding: 10px;\r\n");
      out.write("  \t  flex: 1 100%;\r\n");
      out.write("  \t}\r\n");
      out.write("    .banner{\r\n");
      out.write("      width: 91%;\r\n");
      out.write("      height: 91%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("  \t.header{\r\n");
      out.write("      background-color: white;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("  \t.main {\r\n");
      out.write("  \t  text-align: left;\r\n");
      out.write("  \t  background: white;\r\n");
      out.write("      margin: 10px;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("  \t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t.aside-2 {\r\n");
      out.write("  \t  background: white;\r\n");
      out.write("  \t  width: 70px;\r\n");
      out.write("  \t  margin: 10px;\r\n");
      out.write("  \t  text-align: center;\r\n");
      out.write("\r\n");
      out.write("  \t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t@media all and (min-width: 600px) {\r\n");
      out.write("  \t  .aside { flex: 1 auto; }\r\n");
      out.write("  \t}\r\n");
      out.write("\r\n");
      out.write("  \t@media all and (min-width: 800px) {\r\n");
      out.write("  \t  .main    { flex: 3 0px; }\r\n");
      out.write("  \t  .main    { order: 1; }\r\n");
      out.write("  \t  .aside-2 { order: 2; }\r\n");
      out.write("  \t  .footer  { order: 3; }\r\n");
      out.write("  \t}\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </style>\r\n");
      out.write("  <!--Import jQuery before materialize.js-->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/materialize.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("<footer class=\"footer page-footer yellow darken-2\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col l6 s12 yellow darken-2\">\r\n");
      out.write("                <h5 class=\"white-text\">Follow us!</h5>\r\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Like, share, learn!</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col l4 offset-l2 s12 yellow darken-2\">\r\n");
      out.write("                <h5 class=\"white-text\">Links</h5>\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.facebook.com/LyceumOfAlabang</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.twitter.com/@lyceumOfAlabang</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.LyceumofAlabang.edu</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.instagram.com/@LyceumOfAlabang</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"footer-copyright\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("            (c) 2015 Copyright\r\n");
      out.write("            <a class=\"grey-text text-lighten-4 right\" href=\"#!\">More Links</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("</html>\r\n");
      out.write("        ");
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
