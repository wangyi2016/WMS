<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mode</title>


<link rel="stylesheet" href="css/source/icon.css">
<link rel="stylesheet" href="css/source/easyui.css">
<link rel="stylesheet" href="css/source/demo.css">
<link rel="stylesheet" href="css/header/style.css">

</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height: 80px; background: #CAE1FF; padding: 10px ;padding:0px;margin:0px;"> 
		<div class="header"><img alt="" src="image/logo.png"></div>
		
		<div class="_user">当前用户:${user.name }   | <a href="out">退出</a></div>
      </div>
		
	<div data-options="region:'west',split:true,title:'功能菜单'"
		style="width: 180px; padding-left: 0px; margin-top:15px;"> 

<ul id="tt"  style="margin-left:15px;margin-top:5px;">   
    <li>   
        <span>AGV</span>   
        <ul>   
            <li>   
                <span>正常AGV</span>   
                <ul> 
                    <li>   
                        <span>AGV实时监控</span>   
                    </li>  
                    <li>   
                        <span>AGV管理</span>   
                    </li>  
                </ul>   
            </li>   
            <li>   
                 <span>残损AGV</span>   
                <ul>   
                    <li>   
                        <span>待修复</span>   
                    </li>   
                </ul>     
            </li>  
        </ul>   
    </li>   
    <li>   
        <span>Node</span>
				<ul>
					<li><span>地图查看</span></li>
				</ul>
   </li>   
    <li>   
        <span>Task</span>
				<ul>
					<li><span>任务管理</span></li>
				</ul>
   </li>   
   
     <li>   
        <span>其他设置</span>
				<ul>
					<li><span><a href="#" style="colo:black;"  onclick="password_tool.add()">修改密码</a></span></li>
					
				</ul>
   </li>
   
</ul>  


<form id="xiugai" style="margin:0 ; padding:5px 0 0 25px;color:#333">
  <div style="font-size:12px;">请正确填写下列信息！</div>
  <div style="text-align:center;margin-top:15px">
  <table style=" margin:0 auto; margin-bottom:15px;">
        <tr style="padding:7px;">
            <td style="text-align:right;">输入原密码：</td><td><input type="password" name="oldpd" class="textbox" style="width:160px;" id="oldpd"> </td><td id="eroldpd"></td>
        </tr>
        <tr style="padding:7px;">
            <td style="text-align:right;">输入新密码：</td><td><input type="password" name="newpd" class="textbox" style="width:160px;" id="newpd"> </td><td id="ernewpd"></td>
        </tr>
        <tr>
            <td style="text-align:right;">请再次输入：</td><td><input type="password" name="newpd2" class="textbox" style="width:160px;" id="newpd2"> </td><td id="ernewpd2"></td>
        </tr>
         <tr>
            <td style="text-align:center;"><p id="msg" style=" color:red;"></p></td>
        </tr>
  </table>

  </div>  
</form>

</div>
	<div data-options="region:'south',border:false"
		style="height: 30px; line-height:25px; text-align:center;font-size:10px;">@CopyRight 名匠中科 2016.1.7 版权所有,违者必究</div>
	<div data-options="region:'center'" style="overflow:hidden;">
       <div id="_tabs" >
		
			
		</div>
	</div>
	
<script type="text/javascript" src="js/source/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/source/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/menu/menu.js"></script>
<script type="text/javascript" src="js/wms/changepd.js"></script>
</body>
</html>