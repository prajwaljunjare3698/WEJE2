package com.jspider.netflixservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class temp
 */
@WebServlet("/temp")
public class temp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public temp() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n"
				+ "    <title>Netflix</title>\r\n"
				+ "    \r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"mediaquery.css\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css\">\r\n"
				+ "    <script src=\"https://kit.fontawesome.com/bc3a1796c2.js\" crossorigin=\"anonymous\"></script>\r\n"
				+ "    <link rel=\"shortcut icon\" href=\"https://image.flaticon.com/icons/png/512/870/870910.ico'/> \r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.css\" />\r\n"
			
				//internal css
				
				+"<style>"
				
					+ "@import url(\"https://fonts.googleapis.com/css?family=IBM+Plex+Sans&display=swap\");\r\n"
					+ "@import url(\"https://fonts.googleapis.com/css?family=Martel+Sans&display=swap\");\r\n"
					+ "@import url(\"https://fonts.googleapis.com/css?family=Roboto&display=swap\");\r\n"
					+ "\r\n"
					+ "body {\r\n"
					+ "  margin: 0;\r\n"
					+ "  padding: 0;\r\n"
					+ "  flex-wrap: wrap;\r\n"
					+ "  display: flex;\r\n"
					+ "  font-family: \"Roboto\", sans-serif;\r\n"
					+ "\r\n"
					+ "  background-color: rgba(8, 8, 8, 0.89);\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".navbar {\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  position: relative;\r\n"
					+ "  align-items: center;\r\n"
					+ "  width: 100%;\r\n"
					+ "  height: 50px;\r\n"
					+ "  min-height: 100px;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: space-between;\r\n"
					+ "  background-color: transparent;\r\n"
					+ "  align-self: center;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".navbar li {\r\n"
					+ "  margin: 0 50px;\r\n"
					+ "  list-style-type: none;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "}\r\n"
					+ ".navbar li:nth-child(2) {\r\n"
					+ "  margin-top: -10px;\r\n"
					+ "  margin-right: 70px;\r\n"
					+ "}\r\n"
					+ ".logo img {\r\n"
					+ "  width: 180px;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  align-self: center;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".logo {\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  align-self: center;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".buttons {\r\n"
					+ "  background-color: #e50914;\r\n"
					+ "  padding: 7px 17px;\r\n"
					+ "  color: white;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  border-radius: 3px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".main {\r\n"
					+ "  width: 100%;\r\n"
					+ "  margin-top: -100px;\r\n"
					+ "  background-size: cover;\r\n"
					+ "  align-items: center;\r\n"
					+ "  overflow-x: hidden;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  display: flex;\r\n"
					+ "  background-position: center;\r\n"
					+ "  min-height: 710px;\r\n"
					+ "  background-image: linear-gradient(rgba(0, 0, 0, 0.8), rgba(0, 0, 0, 0.8)),\r\n"
					+ "    url(https://assets.nflxext.com/ffe/siteui/vlv3/a1dc92ca-091d-4ca9-a05b-8cd44bbfce6a/f9368347-e982-4856-a5a4-396796381f28/RS-en-20191230-popsignuptwoweeks-perspective_alpha_website_large.jpg);\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".area {\r\n"
					+ "  color: white;\r\n"
					+ "  display: inline-flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  text-align: center;\r\n"
					+ "  margin-top: 70px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".area h1 {\r\n"
					+ "  font-size: 60px;\r\n"
					+ "  word-spacing: 15px;\r\n"
					+ "  line-height: 75px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".area h3 {\r\n"
					+ "  margin-top: -30px;\r\n"
					+ "  font-size: 27px;\r\n"
					+ "  font-weight: normal;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".search {\r\n"
					+ "  width: 150%;\r\n"
					+ "  background-color: none;\r\n"
					+ "  min-height: 80px;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  text-align: left;\r\n"
					+ "  margin-top: 10px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".box {\r\n"
					+ "  width: 100%;\r\n"
					+ "  min-height: 65px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".try {\r\n"
					+ "  display: inline-flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  background-color: #e50914;\r\n"
					+ "  min-height: 70px;\r\n"
					+ "  width: 70%;\r\n"
					+ "  font-size: 30px;\r\n"
					+ "  text-transform: uppercase;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".area h4 {\r\n"
					+ "  margin-top: 10px;\r\n"
					+ "  font-weight: normal;\r\n"
					+ "}\r\n"
					+ ".container1 {\r\n"
					+ "  width: 100%;\r\n"
					+ "  min-height: 460px;\r\n"
					+ "  background-color: black;\r\n"
					+ "  margin-top: 10px;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: space-evenly;\r\n"
					+ "  text-align: left;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".container1 img {\r\n"
					+ "  display: flex;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  object-fit: contain;\r\n"
					+ "  object-position: center;\r\n"
					+ "  align-self: center;\r\n"
					+ "\r\n"
					+ "  max-width: 100%;\r\n"
					+ "  height: 350px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".container1 .image {\r\n"
					+ "  display: flex;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  align-items: center;\r\n"
					+ "  align-self: center;\r\n"
					+ "  object-fit: contain;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".text {\r\n"
					+ "  color: white;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  align-items: flex-start;\r\n"
					+ "  justify-content: flex-start;\r\n"
					+ "  align-self: center;\r\n"
					+ "  align-content: center;\r\n"
					+ "}\r\n"
					+ ".text p {\r\n"
					+ "  font-size: 1.5rem;\r\n"
					+ "  margin-top: 5px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".text h1 {\r\n"
					+ "  font-size: 3.125rem;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".question {\r\n"
					+ "  width: 100%;\r\n"
					+ "  min-height: 950px;\r\n"
					+ "  background-color: #000;\r\n"
					+ "  margin-top: 10px;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: flex-end;\r\n"
					+ "  text-align: center;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".question h1 {\r\n"
					+ "  text-align: center;\r\n"
					+ "  color: white;\r\n"
					+ "  margin-bottom: 50px;\r\n"
					+ "  text-align: center;\r\n"
					+ "  font-size: 40px;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".quest {\r\n"
					+ "  width: 51%;\r\n"
					+ "  min-height: 75px;\r\n"
					+ "  background-color: #303030;\r\n"
					+ "  color: white;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: space-between;\r\n"
					+ "  display: flex;\r\n"
					+ "  text-align: left;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  margin: 5px 0;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".quest .textbox {\r\n"
					+ "  display: flex;\r\n"
					+ "  text-align: left;\r\n"
					+ "\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  justify-items: center;\r\n"
					+ "  align-self: center;\r\n"
					+ "  font-size: 25px;\r\n"
					+ "  margin: 0 30px;\r\n"
					+ "  word-spacing: 5px;\r\n"
					+ "  text-align: left;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".quest i {\r\n"
					+ "  margin: 0 30px;\r\n"
					+ "  font-size: 40px;\r\n"
					+ "  color: rgb(255, 255, 255);\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".quest:focus {\r\n"
					+ "  background-color: red;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".search1 {\r\n"
					+ "  width: 50%;\r\n"
					+ "  background-color: none;\r\n"
					+ "  min-height: 80px;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  text-align: left;\r\n"
					+ "  margin-top: 10px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".box1 {\r\n"
					+ "  width: 100%;\r\n"
					+ "  min-height: 65px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".try1 {\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  align-items: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  background-color: #e50914;\r\n"
					+ "  min-height: 70px;\r\n"
					+ "  width: 70%;\r\n"
					+ "  color: white;\r\n"
					+ "  font-size: 30px;\r\n"
					+ "  margin: 50px 0;\r\n"
					+ "  text-transform: uppercase;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".question h4 {\r\n"
					+ "  color: white;\r\n"
					+ "  margin-top: -20px;\r\n"
					+ "  padding-bottom: 40px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".footer {\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  width: 100%;\r\n"
					+ "  min-height: 375px;\r\n"
					+ "  background-color: black;\r\n"
					+ "  margin-top: 10px;\r\n"
					+ "  flex-wrap: wrap;\r\n"
					+ "  align-items:center;\r\n"
					+ "  justify-content:space-around;\r\n"
					+ "\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".footercon {\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "  width: 100%;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  align-items: center;\r\n"
					+ "  flex-wrap: wrap;\r\n"
					+ "  min-height: 50px;\r\n"
					+ "  background-color: transparent;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".footer .flex1 {\r\n"
					+ "  color:#999;;\r\n"
					+ "  justify-content:space-around;\r\n"
					+ "  align-items:flex-start;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction:row;\r\n"
					+ "  flex-wrap:wrap;\r\n"
					+ "  width:100%;\r\n"
					+ "  font-size: 17px;\r\n"
					+ "  min-height: 30px;\r\n"
					+ "\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".footer .flex1 h5 {\r\n"
					+ "  align-self:flex-start;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".list1 {\r\n"
					+ "  color: white;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  flex-wrap: wrap;\r\n"
					+ "  align-items: flex-start;\r\n"
					+ "  justify-items: flex-start;\r\n"
					+ "  align-self: center;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  min-height:50px;\r\n"
					+ "  font-size: 13px;\r\n"
					+ "  padding: 0px 70px;\r\n"
					+ "  text-align: left;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".list1 li {\r\n"
					+ "  font-size: 13px;\r\n"
					+ "  margin: 7px -10px;\r\n"
					+ "  list-style-type: none;\r\n"
					+ "  text-align: left;\r\n"
					+ "  display: flex;\r\n"
					+ "  flex-direction: column;\r\n"
					+ "  flex-wrap: wrap;\r\n"
					+ "  align-items: flex-start;\r\n"
					+ "  justify-items: center;\r\n"
					+ "  align-self: flex-start;\r\n"
					+ "  justify-content: center;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".list1 li a {\r\n"
					+ "  color: #999;\r\n"
					+ "  text-decoration: none;\r\n"
					+ "  font-size: 14px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "li a {\r\n"
					+ "  font-size: 13px;\r\n"
					+ "  text-align: center;\r\n"
					+ "  color: #999;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "\r\n"
					+ ".footertxt {\r\n"
					+ "  color:white;\r\n"
					+ "  display:flex;\r\n"
					+ "  flex-direction:row;\r\n"
					+ "  align-items:flex-end;\r\n"
					+ "  justify-content: flex-end;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".end {\r\n"
					+ "  width:100%;\r\n"
					+ "  min-height:50px;\r\n"
					+ "background-color: black;\r\n"
					+ "justify-content:space-around;\r\n"
					+ "align-items:flex-start;\r\n"
					+ "display: flex;\r\n"
					+ "flex-direction:row;\r\n"
					+ "flex-wrap:wrap;\r\n"
					+ "color:#999;\r\n"
					+ "margin-top:-60px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".end h2 {\r\n"
					+ "  display:flex;\r\n"
					+ "  flex-direction: row;\r\n"
					+ "font-size:16px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "@media (min-width: 250px) and (max-width: 980px) {\r\n"
					+ "  body {\r\n"
					+ "    display: flex;\r\n"
					+ "    flex-direction: column;\r\n"
					+ "    flex-wrap: wrap;\r\n"
					+ "  }\r\n"
					+ "  .container1 {\r\n"
					+ "    display: flex;\r\n"
					+ "    flex-direction: column;\r\n"
					+ "    justify-content: space-evenly;\r\n"
					+ "    align-items: center;\r\n"
					+ "    align-self: center;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .area h1 {\r\n"
					+ "    font-size: 40px;\r\n"
					+ "    line-height:60px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .area h3 {\r\n"
					+ "    margin-top: 10px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .container1 img {\r\n"
					+ "    width: 60%;\r\n"
					+ "  }\r\n"
					+ "  .navbar {\r\n"
					+ "    display: flex;\r\n"
					+ "    flex-direction: column;\r\n"
					+ "    background-color: black;\r\n"
					+ "    align-items: center;\r\n"
					+ "    justify-content: center;\r\n"
					+ "    padding: 0;\r\n"
					+ "    min-height: 250px;\r\n"
					+ "    margin-bottom: 30px;\r\n"
					+ "\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "  .search {\r\n"
					+ "    display: flex;\r\n"
					+ "    flex-direction: column;\r\n"
					+ "    margin: 30px;\r\n"
					+ "    width: 50%;\r\n"
					+ "    margin: 0 10px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .box {\r\n"
					+ "    width: 100%;\r\n"
					+ "    margin-bottom: 20px;\r\n"
					+ "    margin:30px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .try {\r\n"
					+ "    width: 200px;\r\n"
					+ "    margin: 0 10px;\r\n"
					+ "    font-size:17px;\r\n"
					+ "    min-height:50px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .search1 {\r\n"
					+ "    display: flex;\r\n"
					+ "    flex-direction: column;\r\n"
					+ "    margin: 30px;\r\n"
					+ "    width: 50%;\r\n"
					+ "    margin: 0 10px;\r\n"
					+ "    margin-bottom: 40px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "h4 {\r\n"
					+ "  color:white;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "  .box1 {\r\n"
					+ "    width: 100%;\r\n"
					+ "    margin-bottom: 20px;\r\n"
					+ "    margin:30px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .try1 {\r\n"
					+ "    width: 200px;\r\n"
					+ "    margin: 0 10px;\r\n"
					+ "    font-size:17px;\r\n"
					+ "    min-height:50px;\r\n"
					+ "  }\r\n"
					+ "  .text {\r\n"
					+ "    display: flex;\r\n"
					+ "    flex-direction: column;\r\n"
					+ "    justify-content: center;\r\n"
					+ "    align-items: center;\r\n"
					+ "    align-self: center;\r\n"
					+ "    text-align: center;\r\n"
					+ "    margin-left: 10px;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .text h1 {\r\n"
					+ "    font-size: 2rem;\r\n"
					+ "    margin-left: 10px;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .text p {\r\n"
					+ "    font-size: 1.2rem;\r\n"
					+ "    margin-left: 10px;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .quest .textbox {\r\n"
					+ "    font-size: 20px;\r\n"
					+ "    margin-left: 10px;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .quest {\r\n"
					+ "    width: 80%;\r\n"
					+ "    min-height: 75px;\r\n"
					+ "    margin-left: 10px;\r\n"
					+ "    margin-right: 10px;\r\n"
					+ "  }\r\n"
					
					
				+ "} </style>"
				
				
				+ "  </head>\r\n"
				+ "  <body>\r\n"
				+ "\r\n"
				+ "    <div class=\"navbar\">\r\n"
				+ "<li class=\"logo\"><img src=\"https://www.searchpng.com/wp-content/uploads/2019/02/Netflix-Logo-PNG-image-200x200.png\"></li>\r\n"
				+ "<li class=\"buttons\">Sign In</a>\r\n"
				+ "\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"main\">\r\n"
				+ "<div class=\"area\">\r\n"
				+ "  <h1>Unlimited movies, TV <br>shows, and more.</h1>\r\n"
				+ "  <h3>Watch anywhere. Cancel anytime.\r\n"
				+ "    </h3>\r\n"
				+ "\r\n"
				+ "    <div class=\"search\">\r\n"
				+ "      <input type=\"text\" class=\"box\" placeholder=\"Email\">\r\n"
				+ "      <span class=\"try\">\r\n"
				+ "Try 30 days free <i class=\"fas fa-chevron-right\"></i>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "      </span>\r\n"
				+ "</div>\r\n"
				+ "<h4>Ready to watch? Enter your email to create or access your account\r\n"
				+ "  </h4>\r\n"
				+ "    </div>\r\n"
				+ "   \r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"container1\">\r\n"
				+ "        <div class=\"text\">\r\n"
				+ "          <h1>Enjoy on your TV.\r\n"
				+ "            </h1>\r\n"
				+ "            <p>\r\n"
				+ "                Watchx on Smart TVs, Playstation, Xbox, <br>\r\n"
				+ "                Chromecast, Apple TV, Blu-ray players, and<br>\r\n"
				+ "                 more.\r\n"
				+ "            </p>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"image\">\r\n"
				+ "  <img src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/tv.png\">\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <div class=\"container1\">\r\n"
				+ "          \r\n"
				+ "          <div class=\"image\">\r\n"
				+ "    <img src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/mobile.png\">\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"text\">\r\n"
				+ "              <h1>Download your shows to watch on the go.\r\n"
				+ "                </h1>\r\n"
				+ "                <p>\r\n"
				+ "                    Save your data and watch all your favorites offline.\r\n"
				+ "                </p>\r\n"
				+ "            </div>\r\n"
				+ "            \r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"container1\">\r\n"
				+ "            <div class=\"text\">\r\n"
				+ "              <h1>Watch everywhere.\r\n"
				+ "\r\n"
				+ "                </h1>\r\n"
				+ "                <p>\r\n"
				+ "                    Stream unlimited movies and TV shows on <br>your phone, tablet, laptop, and TV without paying more.\r\n"
				+ "\r\n"
				+ "                </p>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"image\">\r\n"
				+ "      <img src=\"https://assets.nflxext.com/ffe/siteui/acquisition/ourStory/fuji/desktop/device-pile.png\">\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"question\">\r\n"
				+ "            <h1>Frequently Asked Questions\r\n"
				+ "              </h1>\r\n"
				+ "              <div class=\"quest\">\r\n"
				+ "                <div class=\"textbox\">What is Netflix?</div>\r\n"
				+ "                <i class=\"las la-plus\"></i>\r\n"
				+ "              </div>\r\n"
				+ "              <div class=\"quest\">\r\n"
				+ "                  <div class=\"textbox\">How much does Netflix cost?</div>\r\n"
				+ "                  <i class=\"las la-plus\"></i>\r\n"
				+ "                </div>             \r\n"
				+ "                <div class=\"quest\">\r\n"
				+ "                    <div class=\"textbox\">Where can I watch?</div>\r\n"
				+ "                    <i class=\"las la-plus\"></i>\r\n"
				+ "                  </div>                 <div class=\"quest\">\r\n"
				+ "                    <div class=\"textbox\">How do I cancel?</div>\r\n"
				+ "                    <i class=\"las la-plus\"></i>\r\n"
				+ "                  </div>               \r\n"
				+ "                  <div class=\"quest\">\r\n"
				+ "                      <div class=\"textbox\">What can I watch on Netflix??</div>\r\n"
				+ "                      <i class=\"las la-plus\"></i>\r\n"
				+ "                    </div>\r\n"
				+ "                    <div class=\"quest\">\r\n"
				+ "                        <div class=\"textbox\">What is Netflix?</div>\r\n"
				+ "                        <i class=\"las la-plus\"></i>                   \r\n"
				+ "                      </div>    \r\n"
				+ "                      <div class=\"search1\">\r\n"
				+ "                          <input type=\"text\" class=\"box1\" placeholder=\"Email\">\r\n"
				+ "                          <span class=\"try1\">\r\n"
				+ "                    Try 30 days free <i class=\"fas fa-chevron-right\"></i>\r\n"
				+ "                    \r\n"
				+ "                    \r\n"
				+ "                          </span>\r\n"
				+ "                          \r\n"
				+ "                    </div>      \r\n"
				+ "                    <h4>Ready to watch? Enter your email to create or access your account\r\n"
				+ "                      </h4>\r\n"
				+ "                    </div>\r\n"
				+ "                    <div class=\"footer\">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "                        <div class=\"footercon\">\r\n"
				+ "                          <div class=\"flex1\">\r\n"
				+ "                                                    <h5>Questions? Call 1-866-579-7172\r\n"
				+ "                            </h5>\r\n"
				+ "                            <h5>\r\n"
				+ "    </h5>\r\n"
				+ "                          </div>\r\n"
				+ "                          \r\n"
				+ "               <ul class=\"list1\">\r\n"
				+ "                 \r\n"
				+ "                        <li><a href=\"\">FAQ</a></li>\r\n"
				+ "                        <li><a href=\"\">Investor Relation</a></li>\r\n"
				+ "                        <li><a href=\"\">Ways to Watch</a></li>\r\n"
				+ "\r\n"
				+ "                        <li><a href=\"\">Corporate Information</a></li>\r\n"
				+ "                        <li><a href=\"\">Netflix Originals</a></li>\r\n"
				+ "                        </ul>\r\n"
				+ "                        <ul class=\"list1\">\r\n"
				+ "                        <li><a href=\"\">Home</a></li>\r\n"
				+ "                            <li><a href=\"\">Jobs</a></li>\r\n"
				+ "                            <li><a href=\"\">Terms of Use</a></li>\r\n"
				+ "                            <li><a href=\"\">Contact Us</a></li>\r\n"
				+ "                            <li><a href=\"\">#</a></li>\r\n"
				+ "                            </ul>\r\n"
				+ "                            <ul class=\"list1\">\r\n"
				+ "                                <li><a href=\"\">Account</a></li>\r\n"
				+ "                                <li><a href=\"\">Redeem Gift Cards</a></li>\r\n"
				+ "                                <li><a href=\"\">Privacy</a></li>\r\n"
				+ "                                <li><a href=\"\">Speed Test</a></li>\r\n"
				+ "                                <li><a href=\"\">#</a></li>\r\n"
				+ "\r\n"
				+ "                                </ul>\r\n"
				+ "                                <ul class=\"list1\">\r\n"
				+ "                                    <li><a href=\"\">Media Center<</a></li>\r\n"
				+ "                                    <li><a href=\"\">Buy Gift Cards</a></li>\r\n"
				+ "                                    <li><a href=\"\">Cookie Preferences</a></li>\r\n"
				+ "                                    <li><a href=\"\">Legal Notices</a></li>\r\n"
				+ "                                    <li><a href=\"\">#</a></li>\r\n"
				+ "\r\n"
				+ "                                    </ul>\r\n"
				+ "                                 \r\n"
				+ "                    </div>\r\n"
				+ "\r\n"
				+ "                  </div>\r\n"
				+ "                  <div class=\"end\">\r\n"
				+ "<h2>\r\n"
				+ "Netflix US\r\n"
				+ "</h2> \r\n"
				+ "<h2>\r\n"
				+ "  </h2>                    </div>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
