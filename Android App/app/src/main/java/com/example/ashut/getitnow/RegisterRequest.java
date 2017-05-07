package com.example.ashut.getitnow;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashut on 07-05-2017.
 */

public class RegisterRequest extends StringRequest {
private static final String rrurl="https://ashutoshsinghtomarashu.000webhostapp.com/Register2.php";
    private Map<String,String >params;



    public RegisterRequest(String sname, String semail, String spswd, String sphn, Response.Listener<String>responseListener){
        super(Method.POST,rrurl,responseListener,null);
        params=new HashMap<>();
        params.put("Name",sname);
        params.put("Email",semail);
        params.put("Password",spswd);params.put("phn",sphn);

    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }

}
