// 회원가입 정보를 받아 회원가입 요청을 보냄
package com.example.test3;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    final static private String URL = "http://bestknow98.cafe24.com/UserRegister.php";
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userName, String userPhone, Response.Listener<String> linstener){
        super(Method.POST, URL, linstener, null);       // URL에 POST 방식으로 숨겨서 보냄
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userPhone", userPhone);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }

}