package com.example.java_to_json;

import com.google.gson.Gson;

public class JavaObj3 {
    public static void main(String[] args) {
        String json = "{ \"name\": \"Varun\", \"age\": 21, \"city\": \"Hyderabad\" }";
        Gson gson = new Gson();
        JavaObj obj = gson.fromJson(json, JavaObj.class);
        System.out.println(obj.getName()+"::"+obj.getAge()+"::"+obj.getCity());
    }
}
