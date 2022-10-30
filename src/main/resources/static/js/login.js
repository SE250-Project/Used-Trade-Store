function validate_idcard(idcard) {
    //var idcardReg = /^[1-9]\d{5}(18|19|20|(3\d))\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
    var reg='^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-9])|(18[0-9])|166|198|199|191|(147))\\d{8}$';
    var regExp=new RegExp(reg);
    if (idcard != "" && regExp.test(idcard) != -1) {
        //document.getElementById("info").innerHTML = "<font color='green' size='3px'>手机号格式正确</font>";
        document.getElementById("info").innerHTML = "请输入您的信息";

    }else {
        document.getElementById("info").innerHTML = "<font color='red' size='3px'>手机号不能为空</font>";
    }

}
//函数1：验证用户名格式
function validate_username(username) {

    if (username != "") {
        document.getElementById("info").innerHTML = "请输入您的信息";

    } else {
        document.getElementById("info").innerHTML = "<font color='red' size='3px'>用户名错误</font>";
    }
}

//函数2：验证密码是否符合要求
function validate_password(password) {
    //^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6-10}$
    var passwordReg = /^[a-zA-Z]\w{5,17}$/;
    if (password != "" && password.search(passwordReg) != -1) {
        document.getElementById("info").innerHTML = "请输入您的信息";
    } else if(password == ""){
        document.getElementById("info").innerHTML = "<font color='red' size='3px'>密码不为空</font>";
    } else {
        document.getElementById("info").innerHTML = "<font color='red' size='3px'>密码以字母开头只能包含字母、数字和下划线，5至17位!</font>";
        // alert("密码由数字和字母组成!");
    }
}

//函数3：验证两次输入的密码是否一样
function validate_password2(password2) {
    var password = document.getElementById("regpass").value;
    //测试：console.log(password);
    //测试：console.log(password2);
    if (password == "") {
        document.getElementById("info").innerHTML = "<font color='red' size='3px'>密码不为空</font>";
    } else if (password == password2) {
        document.getElementById("info").innerHTML = "请输入您的信息";
    } else {
        document.getElementById("info").innerHTML = "<font color='red' size='3px'>两次输入的密码不相同</font>";
        // console.log("密码由数字和字母组成!");
    }
}

$("#btn-login").click(function() {
    $.ajax({
        url: "/users/login",
        type: "POST",
        data: $("#form-login").serialize(),
        dataType: "json",
        success: function(json) {
            if (json.state == 200) {
                alert("登录成功！");
                $.cookie("avatar", json.data.avatar, {expires: 7});
                console.log("cookie中的avatar=" + $.cookie("avatar"));
                location.href = "../index.html";
            } else {
                alert("登录失败！" + json.message);
            }
        }
    });
});

$("#btn-reg").click(function() {
    // console.log('req===>')
    // console.log('data', $("#form-reg").serialize())
    $.ajax({
        url: "/users/reg",
        type: "POST",
        data: $("#form-reg").serialize(),
        dataType: "json",
        success: function(json) {
            console.log('reqRes===>', json)
            if (json.state == 200) {
                alert("注册成功！");
                // location.href = "login.html";
            } else {
                alert("注册失败！" + json.message);
            }
        }
    });
});
