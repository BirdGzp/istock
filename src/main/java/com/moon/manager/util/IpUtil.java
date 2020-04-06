package com.moon.manager.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.util
 * @Description: TODO
 * @date Date : 2020年03月30日 16:48
 */
public class IpUtil {
    /**
     * 获取远程用户IP地址
     *
     * @param request
     * @return
     */
    public static final String getRemoteAddr(HttpServletRequest request)
    {
        String rip = request.getRemoteAddr();
        String xff = request.getHeader("X-Forwarded-For");
        String ip;
        if (xff != null && xff.length() != 0)
        {
            int px = xff.indexOf(',');
            if (px != -1)
            {
                ip = xff.substring(0, px);
            }
            else
            {
                ip = xff;
            }
        }
        else
        {
            ip = rip;
        }
        return ip.trim();
    }
}
