package com.example.java_to_json;

import com.google.gson.Gson;

public class JavaObj2 {
    public static void main(String[] args) {
        JavaObj javaObj = new JavaObj("varun",21,"vinukonda");
        Gson gson = new Gson();
        String json = gson.toJson(javaObj);
        System.out.println(json);
    }
}
