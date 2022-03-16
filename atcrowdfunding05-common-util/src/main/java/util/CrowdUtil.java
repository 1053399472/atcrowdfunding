package util;

import javax.servlet.http.HttpServletRequest;
public class CrowdUtil {
    public static boolean judgeRequestType(HttpServletRequest request){
        String accept = request.getHeader("Accept");
        String XRequestedWith = request.getHeader("X-Requested-With");
        if((accept!=null&&accept.contains("application/json"))||(XRequestedWith!=null)&&(XRequestedWith.equals("XMLHttpRequest"))){
            return true;
        }else {
            return false;
        }
    }
}
