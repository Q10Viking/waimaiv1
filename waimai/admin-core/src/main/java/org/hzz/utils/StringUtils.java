package org.hzz.utils;

/**
 * 字符串工具类
 */
public class StringUtils {
    /**
     * 判断是否为null或空字符
     */
    public static boolean isNullOrEmpty(Object o) {
        if (o == null) {
            return true;
        }
        if (String.valueOf(o).replace((char) 12288, ' ').trim().length() == 0) {
            return true;
        }
        if ("null".equals(o)) {
            return true;
        }
        return false;
    }
}