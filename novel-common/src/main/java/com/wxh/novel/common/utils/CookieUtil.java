package com.wxh.novel.common.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Cookie操作工具类
 * @author:wxh
 * @date:2022/8/10
 **/
public class CookieUtil {

    public static String getCookie(HttpServletRequest request, String key){
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(key)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
    public static void setCookie(HttpServletResponse response, String key, String value){
        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

}
