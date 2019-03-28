package cn.itsource.aigou.common;

/**
 *  返回操作结果
 *  将要返回的数据封装到Object对象中
 */
public class AjaxResult {
    private boolean success = true;
    private String msg = "操作成功";

    private Object object;//对象值:供我们在返回前台的时候，可以返回一个对象


    public static AjaxResult me() {
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }

    /**
     * 返回AjaxResult 可实现链式操作，一次性对所有参数进行设置
     */
    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
    //测试
    public static void main(String[] args) {
        //链式编程
        AjaxResult ajaxResult = AjaxResult.me().setSuccess(true).setMsg("mt").setObject("mt");
        System.out.println(ajaxResult);
    }
}