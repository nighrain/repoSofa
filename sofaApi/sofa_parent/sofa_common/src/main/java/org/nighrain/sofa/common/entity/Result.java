package org.nighrain.sofa.common.entity;

/**
 *    
 * Title         [title]
 * Author:       [..]
 * CreateDate:   [2019-04-21--20:46]  @_@ ~~
 * Version:      [v1.0]
 * Description:  [一句话描述该类的功能]
 * <p></p>
 *  
 */
public class Result {
    private boolean flag;
    private int code;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(boolean flag, int code, String message) {
        this(flag,code,message,null);
    }

    public Result(boolean flag, int code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
