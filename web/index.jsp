<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.barangModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link href="css_index.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan Spareparts</title>
        <style>
        #header ul {padding:0;margin:0;list-style:none;float:left;}
	#header ul li{float:left;font-size:12px;}
	#header li a{;float:left;color:#c5c5c5;padding:12px 20px;text-decoration:none;}
	#header ul li a:hover {color:white;}
        
        </style>
    <body>
        <div id="bok">    
            </div>
            <div id="header">
                <ul>
                    <h1><li><a href="barangController?proses=menuutama">B A R A N G</a></li></h1>
                    <h1><li><a href="penjualanController?proses=menupenjualan">P E N J U A L A N</a></li></h1>
                </ul>	
            </div>

            <div id="main"></div>
        <div id="footer"></div>
</body>
</head>
</html>