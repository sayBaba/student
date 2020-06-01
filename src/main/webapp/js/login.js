function login() {

    //ajax异步提交

    var userName = $("#ope_name").val();
    var password = $("#ope_pwd").val();


    $.ajax(
        {
            type:"get",   //提交方式
            url:"/student_war/login?ope_name="+userName +"&ope_pwd="+password,  //提交的地址
            // data:                      //请求数据
            dataType: "json", //后端返回的数据格式
            success:function(rs){    //请求发送成功，执行success rs后台返回的数据
                    alert(rs);
                    if(rs.code == 0){
                        //跳到登录页面
                        alert("登录成功");
                    }else{
                        var errMsg = rs.msg;
                        $("#div1").html(errMsg);

                    }

            },
            error:function (er) {
                alert(er)
            }
        }
    )




	// var url = "/Student/LoginServlet?type=login&ope_name=";
	// url += $("#ope_name").val() + "&ope_pwd=" + $("#ope_pwd").val();
	// $.post(url, null, function(rs)
	// {
	// 	if (rs == "success")
	// 		window.open("/Student/pages/index.jsp", "_self");
	// 	else
	// 		alert(rs);
	// });
}

function logout()
{
	$.post("/Student/LoginServlet?type=logout");
	alert("注销成功！");
	window.parent.location.reload();
}

document.onkeydown = function(event)
{
	var e = event || window.event || arguments.callee.caller.arguments[0];
	if (e && e.keyCode == 13)
		login();
};

$(function()
{
	$("#ope_name").focus();
	$("#dou").click(function()
	{
		alert("(⊙o⊙)好神奇啊啊啊啊啊！");//此功能未完善
	});
});