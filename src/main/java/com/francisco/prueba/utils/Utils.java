package com.francisco.prueba.utils;

public class Utils {
    
    public static boolean isNumber(String param) {
        return param != null && param.matches("[+-]?\\d*(\\.\\d+)?");
    }

    public static boolean isNullOrEmpty(String param) {
        return param == null || param.trim() == "";
    }
}
