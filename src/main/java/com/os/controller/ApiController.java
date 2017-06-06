package com.os.controller;

/**
 * Created by dqin on 05/03/2017.
 */
public class ApiController {
    public static final String BASE_URL = "/api";
    public static final String USER_URL = BASE_URL + "/user";

    public static String[] getNoAuthGetUrls() {
        return new String[]{
        };
    }

    public static String[] getNoAuthPostUrls() {
        return new String[]{
            USER_URL
        };
    }
}
