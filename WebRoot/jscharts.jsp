<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/common/common.jspf" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

  
    <title>My JSP 'json.jsp' starting page</title>
  	<script type="text/javascript">
  	$(function(){
  		  	//定义显示数据
		  	var myData = new Array([ "商品1", 20 ], [  "商品2", 10 ], [  "商品3", 30 ], [  "商品4", 10 ],
						[  "商品5", 5 ]);
						//line表示显示 线形报表，
				var myChart = new JSChart('chartcontainer', 'line');
				//关联显示的数据
				//myChart.setDataArray(myData);//使用js的数组显示数据
				//通过json格式显示数据
				//myChart.setDataJSON("data.json");
				//使用xml格式显示数据
				myChart.setDataXML("data.xml");
				//画报表
				myChart.draw();
		  	
		  	});

  	</script>
  
  </head>  
  <body>
 	<div id="chartcontainer">这里将用来显示图形报表</div>
  </body>
</html>