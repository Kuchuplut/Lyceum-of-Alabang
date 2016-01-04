<!DOCTYPE html>
<html>
<head>
  <!--Import Google Icon Font-->
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--Import materialize.css-->
  <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/materialize.min.css"  media="screen,projection"/>

  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <ul id="dropdown1" class="dropdown-content">
		<li><a href="#!">Settings</a></li>
		<li class="divider"></li>
		<li><a href="#!">Log out</a></li>
		<li class="divider"></li>
		<li><a href="#!">Anything</a></li>
	</ul>
	<nav>
		<div class="nav-wrapper white">
		  <a href="#!" class="brand-logo left"><img src="<%=request.getContextPath()%>/pictures/icon.png"> </a>
		  <ul class="right hide-on-med-and-down">
		    <li><a href="home.jsp" class="yellow-text text-darken-2"><i class="material-icons">list</i></a></li>
		    <li><a href="grades.jsp" class="yellow-text text-darken-2"><i class="material-icons">grade</i></a></li>
		    <li class="yellow darken-2"><a href="quiz.jsp" class="white-text text-darken-2"><i class="material-icons">assignment</i></a></li>
		    <li><a href="message.jsp" class="yellow-text text-darken-2"><i class="material-icons">email</i></a></li>
		    <li>
			     <a href="about.jsp" class="yellow-text text-darken-2 small dropdown-button" data-activates="dropdown1">
			    <img src="<%=request.getContextPath()%>/pictures/pictureSample.jpg" class="circle" alt="picture" height="42" width="42" align="middle"></a>
		    </li>
		  </ul>
		</div>
		<script type="text/javascript">
		$( document ).ready(function){
			$(".dropdown-button").dropdown();        
		}
		</script>
	</nav>
 
</head>

<body>

	<div class="flex-container">
		<div id="infoTab" class="flexItemInfoTab lime darken-3 z-depth-3">
			<div class="col s12 row">
				<p>
					<img src="<%=request.getContextPath()%>/pictures/pictureSample.jpg" class="circle center-align" width="150" height="150" style="display: block; margin-left: auto; margin-right: auto;">
				</p>
				
				<h5 class="col s12 white-text">Juan D. Makakamot</h5>
				<h6 class="col s12 white-text">Student No: 2013-03554-MN-0</h6>
				<h6 class="col s12 white-text"><strong>About</strong></h6>
				<p class="col s12 white-text">
					Wala lang, nagiisip pa ko ng ilalagay dito blah blash kahit ano basta
				</p>
			</div>
		</div>
 
		<div id="mainTab" class="flexItemMainTab white z-depth-3">
			<h2 class="yellow-text text-darken-2">Quizzes</h2>
		</div>

		<div id="sideTab" class="flexItemSideTab white z-depth-3">
			<h3 class="yellow-text text-darken-2 col s12">Tutorials</h3>
			<a class="col s12" href="#">
				<i class="material-icons large center-align yellow-text text-darken-2 " style="display: block; margin-left: auto; margin-rght: auto;">live_tv</i>
			</a>
			<h5 class="col s12 ">Watch Video Tuorials Online!</h5>
		</div>
	</div>

	

	<style type="text/css">
	 body {
	 	background-size: cover;
	    background-image:url('<%=request.getContextPath()%>/pictures/Login2.jpg');
	    background-repeat: no-repeat;
	    background-attachment: fixed;
	}

	.flex-container {
    display: -webkit-flex;
    display: flex;
    width: 100%;
    height: 1000px;
	}

	.flexItemInfoTab{
		border-radius: 10px;
	    width: 20%;
	    height: 900px;
	    margin: 10px;
	}

	.flexItemMainTab{
		border-radius: 10px;
	    background-color: white;
	    width: 60%;
	    height: 900px;
	    margin: 10px;
	}

	.flexItemSideTab{
		border-radius: 10px;
	    background-color: white;
	    width: 20%;
	    height: 900px;
	    margin: 10px;
	}


	</style>
  <!--Import jQuery before materialize.js-->
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="js/materialize.min.js"></script>
</body>
<footer class="page-footer yellow darken-2">
          <div class="container">
            <div class="row">
              <div class="col l6 s12 yellow darken-2">
                <h5 class="white-text">Follow us!</h5>
                <p class="grey-text text-lighten-4">Like, share, learn!</p>
              </div>
              <div class="col l4 offset-l2 s12 yellow darken-2">
                <h5 class="white-text">Links</h5>
                <ul>
                  <li><a class="grey-text text-lighten-3" href="#!">www.facebook.com/LyceumOfAlabang</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">www.twitter.com/@lyceumOfAlabang</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">www.LyceumofAlabang.edu</a></li>
                  <li><a class="grey-text text-lighten-3" href="#!">www.instagram.com/@LyceumOfAlabang</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="footer-copyright">
            <div class="container">
            (c) 2015 Copyright
            <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
            </div>
          </div>
  </footer>
</html>
        