//회원가입이 가능한지 체크하는 클래스

package com.example.test3;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ValidateRequest extends StringRequest {

    final static private String URL = "http://bestknow98.cafe24.com/UserValidate2.php";
    private Map<String, String> parameters;

    public ValidateRequest(String userID, Response.Listener<String> linstener){
        super(Method.POST, URL, linstener, null);       // URL에 POST 방식으로 숨겨서 보냄
        parameters = new HashMap<>();
        parameters.put("userID", userID);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }

}