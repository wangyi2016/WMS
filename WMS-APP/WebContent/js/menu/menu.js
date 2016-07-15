$(function(){
	
	$("#tt").tree({
		lines:true,
		cascadeCheck:false,
		onClick: function(node){
			console.log(node);
			if($("#_tabs").tabs('exists',node.text)){
				$("#_tabs").tabs('select',node.text);
			}else{
				var url ;
				if(node.text == 'AGV实时监控'){
					url="agv.jsp" ;
					addTabs(node,url) ;
				}
				if(node.text == 'AGV管理'){
					url="addagv.jsp" ;
					addTabs(node,url) ;
				}
				if(node.text == '任务管理'){
					url="task.jsp";
					addTabs(node,url) ;
				}
				if(node.text=='节点管理'){
				    url = "node.jsp" ;
				    addTabs(node,url) ;
				}
			}
		}
	})

	$("#_tabs").tabs({
		fit:true,
		border:false
	})
})

function addTabs(node,url){
	$("#_tabs").tabs('add',{
		title:node.text,
		iconCls:"icon-default",
		closable:true,
		href:url
	})
}