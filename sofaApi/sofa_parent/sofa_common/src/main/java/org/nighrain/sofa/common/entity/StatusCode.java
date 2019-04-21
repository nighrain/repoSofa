package org.nighrain.sofa.common.entity;

import java.io.Serializable;

/**
 *    
 * Title         [返回状态码]
 * Author:       [nighrain]
 * CreateDate:   [2019-04-21--20:27]  @_@ ~~
 * Version:      [v1.0]
 * Description:  [返回状态码]
 * <p></p>
 *  
 */
public class StatusCode implements Serializable {
    private static final long serialVersionUID = 100901010100L;

    public static final int OK_CODE=2000;//成功
    public static final String OK_MESSAG="成功";

    public static final int ERROR_CODE=2001;//失败
    public static final String ERROR_MESSAG="失败";

    public static final int LOGINERROR_CODE=2002;//用户名或密码错误
    public static final String LOGINERROR_MESSAG="用户名或密码错误";

    public static final int ACCESSERROR_CODE=2003;//权限不足
    public static final String ACCESSERROR_MESSAG="权限不足";

    public static final int REMOTEERROR_CODE=2004;//远程调用失败
    public static final String REMOTEERROR_MESSAG="远程调用失败";

    public static final int REPERROR_CODE=2005;//请勿重复操作
    public static final String REPERROR_MESSAG="请勿重复操作";

}