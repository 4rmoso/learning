<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Learning Management | Dashboard</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <!-- global css -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css" />
    <!-- font Awesome -->
    <link href="<c:url value="/resources/vendors/font-awesome-4.2.0/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/resources/css/styles/black.css"/>" rel="stylesheet" type="text/css" id="colorscheme" />
    <link href="<c:url value="/resources/css/panel.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/resources/css/metisMenu.css"/>" rel="stylesheet" type="text/css"/>    
    <!-- end of global css -->    
	 <!--page level css -->
    <link href="<c:url value="/resources/vendors/datatables/css/dataTables.bootstrap.css" />" rel="stylesheet" type="text/css" />
    <link href="<c:url value="/resources/css/pages/tables.css"/>" rel="stylesheet" type="text/css" />
    <!-- end of page level css -->
    <!--page level css -->
    <link href="<c:url value="/resources/css/pages/flot.css" />" type="text/css" rel="stylesheet"/>
    <!--end of page level css-->
</head>

<body class="skin-josh">
    <header class="header">
        <a href="index.html" class="logo">
            <img src="<c:url value="/resources/img/logo.png"/>" alt="Logo">
			
        </a>	
		<nav class="navbar navbar-static-top" role="navigation">
		
		    <!-- Sidebar toggle button-->
		   <!--   <div>
                <a href="#" class="navbar-btn sidebar-toggle" data-toggle="offcanvas" role="button">
                    <div class="responsive_nav"></div>
                </a>
            </div> -->
			
            <div class="navbar-right">
                <ul class="nav navbar-nav">
					
					
					<li>
						<a href="index.html">
							<i class="livicon" data-name="home" data-size="28" data-c="#418bca" data-hc="#418bca" data-loop="true"></i>
							<span class="title"></span>
						</a>
					</li>
					<li class="dropdown-messages-menu">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i class="livicon" data-name="doc-portrait" data-loop="true" data-color="#00bc8c" data-hovercolor="#00bc8c" data-size="28"></i>
                        </a>
						<ul class="dropdown-menu dropdown-messages pull-right">
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu1</strong>
                                </a>
                            </li>
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu2</strong>
                                </a>
                            </li>
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu3</strong>
                                </a>
                            </li>							
						</ul>
					</li>
					<li class="dropdown-messages-menu">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i class="livicon" data-name="table" data-loop="true" data-color="#67c5df" data-hovercolor="#67c5df" data-size="28"></i>
                        </a>
						<ul class="dropdown-menu dropdown-messages pull-right">
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu1</strong>
                                </a>
                            </li>
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu2</strong>
                                </a>
                            </li>
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu3</strong>
                                </a>
                            </li>							
						</ul>
					</li>
					<li class="dropdown-messages-menu">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i class="livicon" data-name="barchart" data-loop="true" data-color="#f79a14" data-hovercolor="#f79a14" data-size="28"></i>
                        </a>
						<ul class="dropdown-menu dropdown-messages pull-right">
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu1</strong>
                                </a>
                            </li>
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu2</strong>
                                </a>
                            </li>
							<li class="unread message">
                                <a href="javascript:;" class="message">
									<i class="fa fa-angle-double-right"></i>
                                    <strong>SubMenu3</strong>
                                </a>
                            </li>							
						</ul>
					</li>
					<li>
						<a href="index.html">
							<i class="livicon" data-name="settings" data-size="28" data-c="#ee6f6c" data-hc="#ee6f6c" data-loop="true"></i>
							<span class="title"></span>
						</a>
					</li>					
                    <li class="dropdown messages-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i class="livicon" data-name="message-flag" data-loop="true" data-color="#42aaca" data-hovercolor="#42aaca" data-size="28"></i>
                            <span class="label label-success">4</span>
                        </a>
                        <ul class="dropdown-menu dropdown-messages pull-right">
                            <li class="unread message">
                                <a href="javascript:;" class="message">
                                    <img data-src="holder.js/45x45/#000:#fff" class="img-responsive message-image" alt="icon">
                                    <div class="message-body">
                                        <strong>Riot Zeast</strong>
                                        <br>Hello, You there?
                                        <br>
                                        <small>8 minutes ago</small>
                                    </div>
                                </a>
                            </li>
                            <li class="unread message">
                                <a href="javascript:;" class="message">
                                    <i class="pull-right" data-toggle="tooltip" data-placement="top" title="Mark as Read"><span class="pull-right ol livicon" data-n="adjust" data-s="10" data-c="#287b0b"></span></i> 
                                    <img data-src="holder.js/45x45/#000:#fff" class="img-responsive message-image" alt="icon">
                                    <div class="message-body">
                                        <strong>John Kerry</strong>
                                        <br>Can we Meet ?
                                        <br>
                                        <small>45 minutes ago</small>
                                    </div>
                                </a>
                            </li>
                            <li class="unread message">
                                <a href="javascript:;" class="message">
                                    <i class="pull-right" data-toggle="tooltip" data-placement="top" title="Mark as Read">
                                        <span class="pull-right ol livicon" data-n="adjust" data-s="10" data-c="#287b0b"></span>
                                    </i>
                                    <img data-src="holder.js/45x45/#000:#fff" class="img-responsive message-image" alt="icon">
                                    <div class="message-body">
                                        <strong>Jenny Kerry</strong>
                                        <br>Dont forgot to call...
                                        <br>
                                        <small>An hour ago</small>
                                    </div>
                                </a>
                            </li>
                            <li class="unread message">
                                <a href="javascript:;" class="message">
                                    <i class="pull-right" data-toggle="tooltip" data-placement="top" title="Mark as Read">
                                        <span class="pull-right ol livicon" data-n="adjust" data-s="10" data-c="#287b0b"></span>
                                    </i>
                                    <img data-src="holder.js/45x45/#000:#fff" class="img-responsive message-image" alt="icon">
                                    <div class="message-body">
                                        <strong>Ronny</strong>
                                        <br>Hey! sup Dude?
                                        <br>
                                        <small>3 Hours ago</small>
                                    </div>
                                </a>
                            </li>
                            <li class="footer">
                                <a href="#">View all</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown notifications-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="livicon" data-name="bell" data-loop="true" data-color="#e9573f" data-hovercolor="#e9573f" data-size="28"></i>
                            <span class="label label-warning">7</span>
                        </a>
                        <ul class=" notifications dropdown-menu">
                            <li class="dropdown-title">You have 7 notifications</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <i class="livicon danger" data-n="timer" data-s="20" data-c="white" data-hc="white"></i>
                                        <a href="#">after a long time</a>
                                        <small class="pull-right">
                                            <span class="livicon paddingright_10" data-n="timer" data-s="10"></span>
                                            Just Now
                                        </small>
                                    </li>
                                    <li>
                                        <i class="livicon success" data-n="gift" data-s="20" data-c="white" data-hc="white"></i>
                                        <a href="#">Jef's Birthday today</a>
                                        <small class="pull-right">
                                            <span class="livicon paddingright_10" data-n="timer" data-s="10"></span>
                                            Few seconds ago
                                        </small>
                                    </li>
                                    <li>
                                        <i class="livicon warning" data-n="dashboard" data-s="20" data-c="white" data-hc="white"></i>
                                        <a href="#">out of space</a>
                                        <small class="pull-right">
                                            <span class="livicon paddingright_10" data-n="timer" data-s="10"></span>
                                            8 minutes ago
                                        </small>
                                    </li>
                                    <li>
                                        <i class="livicon bg-aqua" data-n="hand-right" data-s="20" data-c="white" data-hc="white"></i>
                                        <a href="#">New friend request</a>
                                        <small class="pull-right">
                                            <span class="livicon paddingright_10" data-n="timer" data-s="10"></span>
                                            An hour ago
                                        </small>
                                    </li>
                                    <li>
                                        <i class="livicon danger" data-n="shopping-cart-in" data-s="20" data-c="white" data-hc="white"></i>
                                        <a href="#">On sale 2 products</a>
                                        <small class="pull-right">
                                            <span class="livicon paddingright_10" data-n="timer" data-s="10"></span>
                                            3 Hours ago
                                        </small>
                                    </li>
                                    <li>
                                        <i class="livicon success" data-n="image" data-s="20" data-c="white" data-hc="white"></i>
                                        <a href="#">Lee Shared your photo</a>
                                        <small class="pull-right">
                                            <span class="livicon paddingright_10" data-n="timer" data-s="10"></span>
                                            Yesterday
                                        </small>
                                    </li>
                                    <li>
                                        <i class="livicon warning" data-n="thumbs-up" data-s="20" data-c="white" data-hc="white"></i>
                                        <a href="#">David liked your photo</a>
                                        <small class="pull-right">
                                            <span class="livicon paddingright_10" data-n="timer" data-s="10"></span>
                                            2 July 2014
                                        </small>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer">
                                <a href="#">View all</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img data-src="holder.js/35x35/#fff:#000" width="35" class="img-circle img-responsive pull-left" height="35" alt="riot">
                            <div class="riot">
                                <div>
                                    Riot
                                    <span>
                                        <i class="caret"></i>
                                    </span>
                                </div>
                            </div>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header bg-light-blue">
                                <img data-src="holder.js/90x90/#fff:#000" class="img-responsive img-circle" alt="User Image">
                                <p class="topprofiletext">Riot Zeast</p>
                            </li>
                            <!-- Menu Body -->
                            <li>
                                <a href="#">
                                    <i class="livicon" data-name="user" data-s="18"></i>
                                    My Profile
                                </a>
                            </li>
                            <li role="presentation"></li>
                            <li>
                                <a href="#">
                                    <i class="livicon" data-name="gears" data-s="18"></i>
                                    Account Settings
                                </a>
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="lockscreen.html">
                                        <i class="livicon" data-name="lock" data-s="18"></i>
                                        Lock
                                    </a>
                                </div>
                                <div class="pull-right">
                                    <a href="login.html">
                                        <i class="livicon" data-name="sign-out" data-s="18"></i>
                                        Logout
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
     <div class="wrapper row-offcanvas row-offcanvas-left">
        <!-- Left side column. contains the logo and sidebar -->
       <aside class="left-side sidebar-offcanvas offcanvas-left" style="background-color:#515763;">
   <section class="sidebar">
      <div class="page-sidebar  sidebar-nav">
         <div class="clearfix">
         </div>
         &nbsp;
         <div style="padding-left:75px">
          <img src="<c:url value="/resources/img/pic1.png"/>"  class="img-responsive img-circle" width="100px" height="100px" alt="logo">
            
            <h5 class="topprofiletext" style="color:white; padding-left:45px;">Jose Mari</h5>
            <p>
               <span class="topprofiletext" style="color:white; font-size:11px; padding-left:35px;">Super Admin</span>
         </div>
         &nbsp;
         <!-- BEGIN SIDEBAR MENU -->
         <ul id="menu" class="page-sidebar-menu">
            <li class="active">
               <a href="">
               <i  class="livicon"  data-name="gears" data-size="18" data-c="#ffffff" data-hc="#ffffff" data-loop="true"></i>
               <span class="title">System Configuration</span>
               <span class="fa arrow"></span>
               </a>
               <ul class="sub-menu">
                  <li class="active">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Human Resource</span>
                     </a>
                     <ul class="sub-menu">
                        <li>
                           <a href="http://localhost:8080/learning/courses">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Course</span>
                           </a>
                        </li>
                        <li>
                           <a href="http://localhost:8080/learning/courses category">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Course Category</span>
                           </a>
                        </li>
                        <li>
                           <a href="http://localhost:8080/learning/list course">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">List of Course</span>
                           </a>
                        </li>
                        <li>
                           <a href="http://localhost:8080/learning/list courses category">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">List of Course Category</span>
                           </a>
                        </li>
                        <li class="">
                           <a href="http://localhost:8080/learning/list user">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">List of Users</span>
                           </a>
                        </li>
                        <li class="">
                           <a href="http://localhost:8080/learning/enrollment">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Enrollment</span>
                           </a>
                        </li>
                        <li>
                           <a href="http://localhost:8080/learning/user management">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">User Management</span>
                           </a>
                        </li>
                     </ul>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li>
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Logistics</span>
                     </a>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li>
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Financials</span>
                     </a>
                  </li>
               </ul>
            </li>
            <li>
               <a href="">
               <i class="livicon"  data-name="settings" data-size="18" data-c="#ffffff" data-hc="#ffffff" data-loop="true"></i>
               <span class="title">User Management</span>
               </a>
            </li>
            <li>
               <a href="">
               <i class="livicon" data-name="printer" data-size="18" data-c="#ffffff" data-hc="#ffffff" data-loop="true"></i>
               <span class="title">Reports</span>
               </a>
            </li>
            <br>

            <li>
               <a>
               <i class="livicon" data-name="truck" data-size="18"  data-c="#ffffff" data-hc="#ffffff" data-loop="true"></i>
               <span class="title">Logistics</span>
               <span class="fa arrow"></span>
               </a>
               <ul class="sub-menu">
                  <li class="">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Procurement</span>
                     </a>
                     <ul class = "sub-menu">
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Purchase Request Form</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Purchase Order Form</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Approved Purchase Request</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Request Form Quotation</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Bids</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Notice of Awards</span>
                           </a>
                        </li>
                     </ul>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li class="">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Warehouse Management</span>
                     </a>
                     <ul class = "sub-menu">
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Items</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Delivery</span>
                           </a>
                        </li>
                     </ul>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li class="">
                     <a href="ss_users.html">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Asset Management</span>
                     </a>
                     <ul class = "sub-menu">
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Acquisition</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Maintenance Work Order</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Transfer</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Disposal</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Retirement</span>
                           </a>
                        </li>
                     </ul>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li class="">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Queries</span>
                     </a>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li class="">
                     <a href="ss_users.html">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Reports</span>
                     </a>
                     <ul class = "sub-menu">
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Purchase Request</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Purchase Order</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Fast-Moving Items</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Slowing-Moving Items</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Item History</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Acquisition Summary</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Work Order Summary</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Transfer Summary</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Disposal Summary</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Retirement Summary</span>
                           </a>
                        </li>
                     </ul>
                  </li>
               </ul>
            </li>
            <li>
               <a href="">
               <i class="livicon" data-name="money" data-size="18"  data-c="#ffffff" data-hc="#ffffff" data-loop="true"></i>
               <span class="title">Financials</span>
               <span class="fa arrow"></span>
               </a>
               <ul class="sub-menu">
                  <li class="">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Journal Entry Voucher</span>
                     </a>
                     <ul class = "sub-menu">
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Create JEV</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Review JEV</span>
                           </a>
                        </li>
                     </ul>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li class="">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Collections</span>
                     </a>
                     <ul class = "sub-menu">
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Accounts Receivable</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Collection</span>
                           </a>
                        </li>
                     </ul>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li class="">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Disbursement</span>
                     </a>
                     <ul class = "sub-menu">
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Accounts Payable</span>
                           </a>
                        </li>
                        <li>
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Disbursement</span>
                           </a>
                        </li>
                     </ul>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li class="">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Queries</span>
                     </a>
                  </li>
               </ul>
               <ul class="sub-menu">
                  <li class="">
                     <a href="">
                     <i class="fa fa-angle-double-right"></i>
                     <span class="title">Reports</span>
                     </a>
                     <ul class="sub-menu">
                        <li class="">
                           <a href="">
                           <i class="fa fa-angle-double-right"></i>
                           <span class="title">Trial Balance</span>
                           </a>
                           <ul class = "sub-menu">
                              <li>
                                 <a href="">
                                 <i class="fa fa-angle-double-right"></i>
                                 <span class="title">Unadjasted Trial Balance</span>
                                 </a>
                              </li>
                              <li>
                                 <a href="">
                                 <i class="fa fa-angle-double-right"></i>
                                 <span class="title">Pre-Closing Trial Balance</span>
                                 </a>
                              </li>
                              <li>
                                 <a href="">
                                 <i class="fa fa-angle-double-right"></i>
                                 <span class="title">Post-Closing Trial Balance</span>
                                 </a>
                              </li>
                           </ul>
                        </li>
                     </ul>
                  </li>
               </ul>
            </li>
         </ul>
         <!-- END SIDEBAR MENU -->
      </div>
   </section>
</aside>    
        <!-- Right side column. Contains the navbar and content of the page -->
        <aside class="right-side">
            <!-- Content Header (Page header) -->
            <section class="content-header">
                <!--section starts-->
                <h1>Dashboard</h1>
            </section>
            <!--section ends-->
			<!--/row-->
			     <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6 margin_10 animated fadeInLeftBig">
                        <!-- Trans label pie charts strats here-->
                        <div class="lightbluebg no-radius">
                            <div class="panel-body squarebox square_boxs">
                                <div class="col-xs-12 pull-left nopadmar">
                                    <div class="row">
                                        <div class="square_box col-xs-7 text-right">
                                            <span>Course</span>
                                            <div class="number" id="myTargetElement1"></div>
                                        </div>
                                        <i class="livicon  pull-right" data-name="notebook" data-l="true" data-c="#fff" data-hc="#fff" data-s="70"></i>
                                    </div>
                                    <div class="row">
                                       
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 margin_10 animated fadeInUpBig">
                        <!-- Trans label pie charts strats here-->
                        <div class="redbg no-radius">
                            <div class="panel-body squarebox square_boxs">
                                <div class="col-xs-12 pull-left nopadmar">
                                    <div class="row">
                                        <div class="square_box col-xs-7 pull-left">
                                            <span>Categories</span>
                                            <div class="number" id="myTargetElement2"></div>
                                        </div>
                                        <i class="livicon pull-right" data-name="inbox" data-l="true" data-c="#fff" data-hc="#fff" data-s="70"></i>
                                    </div>
                                    <div class="row">
                                       
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6 col-md-6 margin_10 animated fadeInDownBig">
                        <!-- Trans label pie charts strats here-->
                        <div class="goldbg no-radius">
                            <div class="panel-body squarebox square_boxs">
                                <div class="col-xs-12 pull-left nopadmar">
                                    <div class="row">
                                        <div class="square_box col-xs-7 pull-left">
                                            <span>Employees</span>
                                            <div class="number" id="myTargetElement3"></div>
                                        </div>
                                        <i class="livicon pull-right" data-name="users-add" data-l="true" data-c="#fff" data-hc="#fff" data-s="70"></i>
                                    </div>
                                    <div class="row">
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 margin_10 animated fadeInRightBig">
                        <!-- Trans label pie charts strats here-->
                        <div class="palebluecolorbg no-radius">
                            <div class="panel-body squarebox square_boxs">
                                <div class="col-xs-12 pull-left nopadmar">
                                    <div class="row">
                                        <div class="square_box col-xs-7 pull-left">
                                            <span>Users</span>
                                            <div class="number" id="myTargetElement4"></div>
                                        </div>
                                        <i class="livicon pull-right" data-name="users" data-l="true" data-c="#fff" data-hc="#fff" data-s="70"></i>
                                    </div>
                                    <div class="row">
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--/row-->
            <section class="content">
			<!-- Bar chart -->
			<div class="col-md-6">
                        <!-- toggling series charts strats here-->
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">
                                    <i class="livicon" data-name="linechart" data-size="16" data-loop="true" data-c="#000" data-hc="#000"></i>
                               <!--  Bar Charts -->
                                </h3>
                               <!--  <span class="pull-right">
                                    <i class="glyphicon glyphicon-chevron-up showhide clickable"></i>
                                    <i class="glyphicon glyphicon-remove removepanel clickable"></i>
                                </span> -->
                            </div>
                            <div class="panel-body">
                              <div id="basicFlotLegend" class="flotLegend"></div>
                                <div id="bar-chart" class="flotChart"></div>
                            </div>
                        </div>
            </div>
			 <!-- Bar chart -->
			 <!-- Recent Login -->
                <div class="row">
				    <div class="col-lg-6">
                        <div class="portlet box danger">
                            <div class="portlet-title">
                                <div class="caption">
                                    <i class="livicon" data-name="timer" data-size="16" data-loop="true" data-c="#fff" data-hc="white"></i>
                                    Recent Login
                                </div>
                            </div>
                            <div class="portlet-body">
                                <div class="table-scrollable">
                                    <table class="table table-bordered table-hover">
                                        <thead>
                                            <tr>
                                                <th>Username
                                                <th>Employee</th>
												
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>ENC@123</td>
                                                <td>Eduardo Newton Costa</td>
												
                                            </tr>
                                        </tbody>
										 <tbody>
                                            <tr>
                                                <td>Ruby88</td>
                                                <td>Ruby Byru Dela Rosa</td>
												
                                            </tr>
                                        </tbody>
										 <tbody>
                                            <tr>
                                                <td>4rmoso</td>
                                                <td>password</td>
												
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
					</div>
					
					<div class="col-lg-6">
                        <div class="portlet box danger">
                            <div class="portlet-title">
                                <div class="caption">
                                    <i class="livicon" data-name="notebook" data-size="16" data-loop="true" data-c="#fff" data-hc="white"></i>
                                    Recent Course Added
                                </div>
                            </div>
                            <div class="portlet-body">
                                <div class="table-scrollable">
                                    <table class="table table-bordered table-hover">
                                        <thead>
                                       
                                            <tr>
                                                <th>Course Name</th>
                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <c:forEach var="g" items="${list}">
                                           <tr>
                                                <td>${g.course_name }</td>
                                           </tr>
                                           </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
					</div>
					
                </div>
			<!-- 	 Recent Login -->
		   
				<div class="row">
                     <div class="col-lg-6">
                        <div class="portlet box danger">
                            <div class="portlet-title">
                                <div class="caption">
                                    <i class="livicon" data-name="inbox" data-size="16" data-loop="true" data-c="#fff" data-hc="white"></i>
                                     Recent Course Category Added
                                </div>
                            </div>
                            <div class="portlet-body">
                                <div class="table-scrollable">
                                     <table class="table table-bordered table-hover">
                                        <thead>
                                       
                                            <tr>
                                                <th>Course Category Name</th>
                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <c:forEach var="x" items="${list2}">
                                           <tr>
                                                <td>${x.coursecategory_name }</td>
                                           </tr>
                                           </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
					</div>
					
					<div class="col-lg-6">
                        <div class="portlet box danger">
                            <div class="portlet-title">
                                <div class="caption">
                                    <i class="livicon" data-name="users-add" data-size="16" data-loop="true" data-c="#fff" data-hc="white"></i>
                                    Newest Employee
                                </div>
                            </div>
                            <div class="portlet-body">
                                <div class="table-scrollable">
                                    <table class="table table-bordered table-hover">
                                        <thead>
                                       
                                            <tr>
                                                <th>Course Category Name</th>
                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <c:forEach var="e" items="${list3}">
                                           <tr>
                                                <td>${e.emp_fname} ${e.emp_mname} ${e.emp_lname}</td>
                                           </tr>
                                           </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
					</div>
                </div>
				 <!-- Recent course category added -->
				 
				 
            </section>
            <!-- content -->
        </aside>
        <!-- right-side -->
	</div>
    <a id="back-to-top" href="#" class="btn btn-primary btn-lg back-to-top" role="button" title="" data-toggle="tooltip" data-placement="left">
        <i class="livicon" data-name="plane-up" data-size="18" data-loop="true" data-c="#fff" data-hc="white"></i>
    </a>
    <!-- global js -->
    <script src="<c:url value="/resources/js/jquery-1.11.1.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>" type="text/javascript"> </script>
    <!--livicons-->
    <script src="<c:url value="/resources/vendors/livicons/minified/raphael-min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/vendors/livicons/minified/livicons-1.4.min.js"/>" type="text/javascript"></script>
   <script src="<c:url value="/resources/js/josh.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/metisMenu.js"/>" type="text/javascript"> </script>
    <script src="<c:url value="/resources/vendors/holder-master/holder.js"/>" type="text/javascript"></script>
    <!-- end of global js -->
	
    <!-- begining of page level js -->
    <!--  todolist-->
    <script src="<c:url value="/resources/js/todolist.js"/>" type="text/javascript"></script>
    <!-- EASY PIE CHART JS -->
    <script src="<c:url value="/resources/vendors/charts/easypiechart.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/vendors/charts/jquery.easypiechart.min.js"/>" type="text/javascript"></script>
    <!--for calendar-->
    <script src="<c:url value="/resources/vendors/fullcalendar/fullcalendar.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/vendors/fullcalendar/calendarcustom.min.js"/>" type="text/javascript"></script>
    <!--   Realtime Server Load  -->
    <script src="<c:url value="/resources/vendors/charts/jquery.flot.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/vendors/charts/jquery.flot.resize.min.js"/>" type="text/javascript"></script>
    <!--Sparkline Chart-->
    <script src="<c:url value="/resources/vendors/charts/jquery.sparkline.js"/>" type="text/javascript"></script>
    <!-- Back to Top-->
    <script src="<c:url value="/resources/vendors/countUp/countUp.js"/>" type="text/javascript"></script>
    <!--   maps -->
    <script src="<c:url value="/resources/vendors/jvectormap/jquery-jvectormap-1.2.2.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/vendors/jvectormap/jquery-jvectormap-world-mill-en.js"/>" type="text/javascript"></script>
     <script src="<c:url value="/resources/vendors/jscharts/Chart.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/resources/js/dashboard.js"/>" type="text/javascript"></script>
    <script type="text/javascript"></script>
	
	    <!-- begining of page level js -->
	    
	    
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.min.js"/>"> </script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.stack.js"/>"> </script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.crosshair.js"/>"> </script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.time.js"/>"> </script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.selection.js"/>"> </script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.symbol.js"/>"> </script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.resize.js"/>"> </script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.categories.js"/>"> </script>
    <script  language="javascript" type="text/javascript" src="<c:url value="/resources/vendors/charts/jquery.flot.spline.js"/>"> </script>
    <script language="javascript" type="text/javascript"src="<c:url value="/resources/vendors/charts/jquery.flot.tooltip.js"/>"> </script>
    <script language="javascript" type="text/javascript" src="<c:url value="/resources/js/pages/customcharts.js"/>"> </script>
<!-- begining of page level js -->
    <script type="text/javascript" src="<c:url value="/resources/vendors/datatables/jquery.dataTables.min.js"/>"> </script>
    <script type="text/javascript" src="<c:url value="/resources/vendors/datatables/dataTables.bootstrap.js"/>"> </script>
    <script>
    $(document).ready(function() {
        $('#table').dataTable();
    });
    </script>
    <!-- end of page level js -->
  
</body>
</html>
