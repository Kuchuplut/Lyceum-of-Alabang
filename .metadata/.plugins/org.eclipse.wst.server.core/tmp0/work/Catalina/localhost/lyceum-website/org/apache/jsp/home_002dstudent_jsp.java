/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2016-01-08 00:45:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_002dstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<li><a href=\"profile-student.jsp\">Profile</a></li>\r\n");
      out.write("\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout\">Log out</a></li>\r\n");
      out.write("\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t<li><a href=\"#!\">Anything</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<div class=\"nav-wrapper white\">\r\n");
      out.write("\t\t  <a href=\"#!\" class=\"brand-logo left\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pictures/icon.png\" class=\"banner\"> </a>\r\n");
      out.write("\t\t  <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("\t\t\t<li class=\"yellow darken-2\"><a href=\"home.jsp\" class=\"white-text text-darken-2\">BOARD<i class=\"material-icons left\">list</i></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"grades.jsp\" class=\"yellow-text text-darken-2\">GRADES<i class=\"material-icons left\">grade</i></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"quiz.jsp\" class=\"yellow-text text-darken-2\">QUIZZES<i class=\"material-icons left\">assignment</i></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"message.jsp\" class=\"yellow-text text-darken-2\">MESSAGES<i class=\"material-icons left\">email</i></a></li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a href=\"about.jsp\" class=\"yellow-text text-darken-2 small dropdown-button\" data-activates=\"dropdown1\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/display_photos/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.strDisplayPhoto}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"circle\" alt=\"picture\" height=\"42\" width=\"42\" align=\"middle\"></a>\r\n");
      out.write("\t\t\t</li>\r\n");
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
      out.write("\t\t\t<h3 class=\"white-text light\" align=\"center\">CORK BOARD</h3>\r\n");
      out.write("\t\t</header>  \r\n");
      out.write("\t\t<article class=\"main\">    \r\n");
      out.write("\t\t\t<div class=\"col s12\" style=\"margin: 10px;\">\r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\t\t  <div class=\"row white\">\r\n");
      out.write("\t\t\t<form class=\"col s12\">\r\n");
      out.write("\t\t\t  <div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"input-field col s12\">\r\n");
      out.write("\t\t\t\t  <textarea id=\"icon_prefix2\" class=\"materialize-textarea\" length=\"160\"></textarea>\r\n");
      out.write("\t\t\t\t  <label for=\"icon_prefix2\">Post something...</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col s8\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"file-field input-field\">\r\n");
      out.write("\t\t\t\t\t\t <div class=\"btn green\">\r\n");
      out.write("\t\t\t\t\t\t   <i class=\"material-icons\">attach_file</i>\r\n");
      out.write("\t\t\t\t\t\t   <input type=\"file\" multiple>\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t <div class=\"file-path-wrapper\">\r\n");
      out.write("\t\t\t\t\t\t   <input class=\"file-path validate\" type=\"text\" placeholder=\"Upload one or more files\">\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col s4\">\r\n");
      out.write("\t\t\t\t\t<button class=\"waves-effect waves-dark btn-large\" type=\"submit\" name=\"action\" align=\"bottom\">Submit\r\n");
      out.write("\t\t\t\t\t  <i class=\"material-icons right\">send</i>\r\n");
      out.write("\t\t\t\t\t</button>            \t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<ul class=\"collection\">\r\n");
      out.write("\t\t   <li class=\"collection-item avatar\">\r\n");
      out.write("\t\t\t <img src=\"");
      out.print(request.getContextPath());
      out.write("/pictures/pictureSample.jpg\" alt=\"\" class=\"circle\" width=\"42\" height=\"42\">\r\n");
      out.write("\t\t\t <span class=\"title\"><strong>Juan D. Makakamot</strong></span>\r\n");
      out.write("\t\t\t <p>Ang kati kati na! Di ko na kaya! Urgh!<br>\r\n");
      out.write("\t\t\t\t11:11pm, Jan 2, 2016\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t <div class=\"fixed-action-btn horizontal secondary-content\">\r\n");
      out.write("\t\t\t\t <a class=\"btn-floating btn-large red\">\r\n");
      out.write("\t\t\t\t   <i class=\"material-icons large\">mode_edit</i>\r\n");
      out.write("\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating red\"><i class=\"material-icons\">insert_chart</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating yellow darken-1\"><i class=\"material-icons\">format_quote</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating green\"><i class=\"material-icons\">publish</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating blue\"><i class=\"material-icons\">attach_file</i></a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t   </li>\r\n");
      out.write("\t\t   <li class=\"collection-item avatar\">\r\n");
      out.write("\t\t\t <i class=\"material-icons circle\">account_circle</i>\r\n");
      out.write("\t\t\t <span class=\"title\"><strong>Mariang Palad</strong></span>\r\n");
      out.write("\t\t\t <p>Eto na oh <br>\r\n");
      out.write("\t\t\t\t10:16pm, Jan 1, 2016\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t <img src=\"");
      out.print(request.getContextPath());
      out.write("/pictures/background1.jpg\" height=\"50%\" width=\"50%\">\r\n");
      out.write("\t\t\t  <div class=\"fixed-action-btn horizontal secondary-content\">\r\n");
      out.write("\t\t\t\t <a class=\"btn-floating btn-large red\">\r\n");
      out.write("\t\t\t\t   <i class=\"large material-icons\">mode_edit</i>\r\n");
      out.write("\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating red\"><i class=\"material-icons\">insert_chart</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating yellow darken-1\"><i class=\"material-icons\">format_quote</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating green\"><i class=\"material-icons\">publish</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating blue\"><i class=\"material-icons\">attach_file</i></a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t   </li>\r\n");
      out.write("\t\t   <li class=\"collection-item avatar\">\r\n");
      out.write("\t\t\t <i class=\"material-icons circle\">account_circle</i>\r\n");
      out.write("\t\t\t <span class=\"title\">Title</span>\r\n");
      out.write("\t\t\t <p>First Line <br>\r\n");
      out.write("\t\t\t\tSecond Line\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t  <div class=\"fixed-action-btn horizontal secondary-content\">\r\n");
      out.write("\t\t\t\t <a class=\"btn-floating btn-large red\">\r\n");
      out.write("\t\t\t\t   <i class=\"large material-icons\">mode_edit</i>\r\n");
      out.write("\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating red\"><i class=\"material-icons\">insert_chart</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating yellow darken-1\"><i class=\"material-icons\">format_quote</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating green\"><i class=\"material-icons\">publish</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating blue\"><i class=\"material-icons\">attach_file</i></a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t   </li>\r\n");
      out.write("\t\t   <li class=\"collection-item avatar\">\r\n");
      out.write("\t\t\t <i class=\"material-icons circle\">account_circle</i>\r\n");
      out.write("\t\t\t <span class=\"title\">Title</span>\r\n");
      out.write("\t\t\t <p>First Line <br>\r\n");
      out.write("\t\t\t\tSecond Line\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t  <div class=\"fixed-action-btn horizontal secondary-content\">\r\n");
      out.write("\t\t\t\t <a class=\"btn-floating btn-large red\">\r\n");
      out.write("\t\t\t\t   <i class=\"large material-icons\">mode_edit</i>\r\n");
      out.write("\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating red\"><i class=\"material-icons\">insert_chart</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating yellow darken-1\"><i class=\"material-icons\">format_quote</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating green\"><i class=\"material-icons\">publish</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating blue\"><i class=\"material-icons\">attach_file</i></a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t   </li>\r\n");
      out.write("\t\t   <li class=\"collection-item avatar\">\r\n");
      out.write("\t\t\t <i class=\"material-icons circle\">account_circle</i>\r\n");
      out.write("\t\t\t <span class=\"title\">Title</span>\r\n");
      out.write("\t\t\t <p>First Line <br>\r\n");
      out.write("\t\t\t\tSecond Line\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t  <div class=\"fixed-action-btn horizontal secondary-content\">\r\n");
      out.write("\t\t\t\t <a class=\"btn-floating btn-large red\">\r\n");
      out.write("\t\t\t\t   <i class=\"large material-icons\">mode_edit</i>\r\n");
      out.write("\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating red\"><i class=\"material-icons\">insert_chart</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating yellow darken-1\"><i class=\"material-icons\">format_quote</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating green\"><i class=\"material-icons\">publish</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating blue\"><i class=\"material-icons\">attach_file</i></a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t   </li>\r\n");
      out.write("\t\t   <li class=\"collection-item avatar\">\r\n");
      out.write("\t\t\t <i class=\"material-icons circle\">account_circle</i>\r\n");
      out.write("\t\t\t <span class=\"title\">Title</span>\r\n");
      out.write("\t\t\t <p>First Line <br>\r\n");
      out.write("\t\t\t\tSecond Line\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t  <div class=\"fixed-action-btn horizontal secondary-content\">\r\n");
      out.write("\t\t\t\t <a class=\"btn-floating btn-large red\">\r\n");
      out.write("\t\t\t\t   <i class=\"large material-icons\">mode_edit</i>\r\n");
      out.write("\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating red\"><i class=\"material-icons\">insert_chart</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating yellow darken-1\"><i class=\"material-icons\">format_quote</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating green\"><i class=\"material-icons\">publish</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating blue\"><i class=\"material-icons\">attach_file</i></a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t   </li>\r\n");
      out.write("\t\t   <li class=\"collection-item avatar\">\r\n");
      out.write("\t\t\t <i class=\"material-icons circle\">account_circle</i>\r\n");
      out.write("\t\t\t <span class=\"title\">Title</span>\r\n");
      out.write("\t\t\t <p>First Line <br>\r\n");
      out.write("\t\t\t\tSecond Line\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t  <div class=\"fixed-action-btn horizontal secondary-content\">\r\n");
      out.write("\t\t\t\t <a class=\"btn-floating btn-large red\">\r\n");
      out.write("\t\t\t\t   <i class=\"large material-icons\">mode_edit</i>\r\n");
      out.write("\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t <ul>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating red\"><i class=\"material-icons\">insert_chart</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating yellow darken-1\"><i class=\"material-icons\">format_quote</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating green\"><i class=\"material-icons\">publish</i></a></li>\r\n");
      out.write("\t\t\t\t   <li><a class=\"btn-floating blue\"><i class=\"material-icons\">attach_file</i></a></li>\r\n");
      out.write("\t\t\t\t </ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t   </li>\r\n");
      out.write("\t\t </ul>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t</article>  \r\n");
      out.write("\t\t<aside class=\"aside aside-1 white\">\r\n");
      out.write("\t\t\t<div class=\"col s12 row\">\r\n");
      out.write("\t\t\t  <p>\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/display_photos/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.strDisplayPhoto}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"circle center-align\" width=\"150\" height=\"150\" style=\"display: block; margin-left: auto; margin-right: auto;\">\r\n");
      out.write("\t\t\t  </p>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t  <h5 class=\"col s12 yellow-text text-darken-4 light\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("\t\t\t  <h6 class=\"col s12 light\">Student No: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.strStudentCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h6>\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <h6 class=\"col s12 light\"><strong>About</strong></h6>\r\n");
      out.write("\t\t\t  <p class=\"col s12 light\">\r\n");
      out.write("\t\t\t\tWala lang, nagiisip pa ko ng ilalagay dito blah blash kahit ano basta\r\n");
      out.write("\t\t\t  </p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t\t<aside class=\"aside aside-2\">\r\n");
      out.write("\t\t\t<h3 class=\"yellow-text text-darken-2 col s12 light\">Tutorials</h3>\r\n");
      out.write("\t\t\t<a class=\"col s12\" href=\"#\">\r\n");
      out.write("\t\t\t  <i class=\"material-icons large center-align yellow-text text-darken-2 \" style=\"display: block; margin-left: auto; margin-rght: auto;\">live_tv</i>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<h5 class=\"col s12 light\">Watch Video Tuorials Online!</h5>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("\t@import \"compass/css3\";\r\n");
      out.write("\r\n");
      out.write("\t.wrapper {\r\n");
      out.write("\t  display: -webkit-box;\r\n");
      out.write("\t  display: -moz-box;\r\n");
      out.write("\t  display: -ms-flexbox;\r\n");
      out.write("\t  display: -webkit-flex;\r\n");
      out.write("\t  display: flex;  \r\n");
      out.write("\t\r\n");
      out.write("\t  -webkit-flex-flow: row wrap;\r\n");
      out.write("\t  flex-flow: row wrap;\r\n");
      out.write("\t}\r\n");
      out.write("\t.banner{\r\n");
      out.write("\t\twidth: 91%;\r\n");
      out.write("\t\theight: 91%;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.wrapper > * {\r\n");
      out.write("\t  padding: 10px;\r\n");
      out.write("\t  flex: 1 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("  .header{\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\t.main {\r\n");
      out.write("\t  text-align: left;\r\n");
      out.write("\t  background: transparent;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.aside-1 {\r\n");
      out.write("\t  background: green;\r\n");
      out.write("\t  width: 30px;\r\n");
      out.write("\t  margin: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.aside-2 {\r\n");
      out.write("\t  background: white;\r\n");
      out.write("\t  width: 70px;\r\n");
      out.write("\t  margin: 10px;\r\n");
      out.write("\t  text-align: center;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t@media all and (min-width: 600px) {\r\n");
      out.write("\t  .aside { flex: 1 auto; }\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t@media all and (min-width: 800px) {\r\n");
      out.write("\t  .main    { flex: 3 0px; }\r\n");
      out.write("\t  .aside-1 { order: 1; } \r\n");
      out.write("\t  .main    { order: 2; }\r\n");
      out.write("\t  .aside-2 { order: 3; }\r\n");
      out.write("\t  .footer  { order: 4; }\r\n");
      out.write("\t}\r\n");
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
      out.write("\t\t  <div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t  <div class=\"col l6 s12 yellow darken-2\">\r\n");
      out.write("\t\t\t\t<h5 class=\"white-text\">Follow us!</h5>\r\n");
      out.write("\t\t\t\t<p class=\"grey-text text-lighten-4\">Like, share, learn!</p>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"col l4 offset-l2 s12 yellow darken-2\">\r\n");
      out.write("\t\t\t\t<h5 class=\"white-text\">Links</h5>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.facebook.com/LyceumOfAlabang</a></li>\r\n");
      out.write("\t\t\t\t  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.twitter.com/@lyceumOfAlabang</a></li>\r\n");
      out.write("\t\t\t\t  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.LyceumofAlabang.edu</a></li>\r\n");
      out.write("\t\t\t\t  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.instagram.com/@LyceumOfAlabang</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"footer-copyright\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t(c) 2015 Copyright\r\n");
      out.write("\t\t\t<a class=\"grey-text text-lighten-4 right\" href=\"#!\">More Links</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("</html>\r\n");
      out.write("\t\t");
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
