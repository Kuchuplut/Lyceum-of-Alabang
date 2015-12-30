<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <!--Import Google Icon Font-->
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--Import materialize.css-->
  <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

	<nav>
		<div class="nav-wrapper white">
		  <a href="#!" class="brand-logo left"><img src="./pictures/icon.png"> </a>
		  <ul class="right hide-on-med-and-down">
		    <li><a href="about.html" class="yellow-text text-darken-2"><i class="material-icons left">info</i>About</a></li>
		  </ul>
		</div>
	</nav>

</head>

<body>
<div id="pad">
	
</div>
	<div class="row white center" id="FormBg">
	<br>
		<div class="container">
			<div class="row">
			<h4 class="col s12 yellow-text text-darken-2">Student Sign Up</h4>
				<form class="col s12 ">
					<div class="row">

						<div class="input-field col s12">
						<input disabled value="2013-03554-MN-0" ="" id="studentNo" type="text" class="validate">
						<label for="studentNo">Student Number</label>
						</div>

						<h6 class="col s12">Name</h6>
						<div class="input-field col s4">
						<input id="firstName" type="text" class="validate">
						<label for="firstName">First Name</label>
						</div>

						<div class="input-field col s4">
						<input id="middleName" type="text" class="validate">
						<label for="middleNmame">Middle Name</label>
						</div>

						<div class="input-field col s4">
						<input id="lastName" type="text" class="validate">
						<label for="lastName">Last Name</label>
						</div>

						<h6 class="col s6">Birthday</h6>
						<h6 class="col s6">Gender</h6>

						<div class="col s6">
							<input type="date" class="datepicker" id="bday">
						</div>

						<div class="col s6">
							<p>
								<input name="group1" type="radio" id="male" />
								<label for="male">Male</label>
							
								<input name="group1" type="radio" id="female" />
								<label for="female">Female</label>
							</p>
						</div>

						<h6 class="col s12">Address</h6>

						<div class="input-field col s3">
						<input id="houseNO" type="text" class="validate">
						<label for="houseNO">Number</label>
						</div>

						<div class="input-field col s3">
						<input id="street" type="text" class="validate">
						<label for="street">Street</label>
						</div>

						<div class="input-field col s3">
						<input id="brgy" type="text" class="validate">
						<label for="brgy">Barangay</label>
						</div>

						<div class="input-field col s3">
						<input placeholder="(optional)"id="subd" type="text" class="validate">
						<label for="subd">Subdivision</label>
						</div>


						<div class="input-field col s6">
						<input id="city" type="text" class="validate">
						<label for="city">City</label>
						</div>

						<div class="input-field col s6">
						<input placeholder="(optional)"id="province" type="text" class="validate">
						<label for="province">Province</label>
						</div>

						<h6 class="col s12">Contact Information</h6>

						<div class="input-field col s6">
						<input id="email" type="email" class="validate">
						<label for="email">E-mail Address</label>
						</div>

						<div class="input-field col s6">
						<input id="contanctNo" type="text" class="validate">
						<label for="contanctNo">Contanct No.</label>
						</div>

						<h6 class="col s12">Account Information</h6>

						<div class="input-field col s4">
						<input id="username" type="text" class="validate">
						<label for="username">Username</label>
						</div>

						<div class="input-field col s4">
						<input id="password" type="password" class="validate">
						<label for="password">Password</label>
						</div>

						<div class="input-field col s4">
						<input id="password" type="password" class="validate">
						<label for="password">Re-type Password</label>
						</div>
				
						<div class="col s12">
							<p>
								
							</p>
						</div>
						<div class="col s12">
							<p>
								
							</p>
						</div>
						<div class="col s4 offset-s5">
							<button class="btn-large waves-effect waves-light" type="submit" name="action">SUBMIT
							<i class="material-icons right">send</i>
							</button>
						</div>
						
					</div>
				</form>
			</div>
		</div>
		
	</div>

	<style type="text/css">
		 body {
		 	background-size: cover;
		    background-image:url('./pictures/Login2.jpg');
		    background-repeat: no-repeat;
		    background-attachment: fixed;
		}

		#FormBg{
		width: 80%;
		height: 1000px;
		position: absolute;
		left: 10%;
		right: 10%; 	
		top: 20%;
		box-shadow: 10px 10px 40px black;
		}

		#pad{
			height: 1200px;
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
        