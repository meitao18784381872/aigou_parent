package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.common.AjaxResult;
import cn.itsource.plat.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class UserController {
    /**
     *  模拟用户登陆
     *  使用路由器登陆：http://localhost:9527/mt/aigou/plat/user?name=mt&password=mt
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(User user){

        if(user!=null&& !StringUtils.isEmpty(user.getName())&&!StringUtils.isEmpty(user.getPassword())){
            if("mt".equals(user.getName())&&"mt".equals(user.getPassword())){
                return AjaxResult.me().setMsg("恭喜你！！！登录成功");
            } else {
                return AjaxResult.me().setSuccess(false).setMsg("登录失败");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }
    @RequestMapping(value = "/user1",method = RequestMethod.POST)
    public String login1(){
        return "adsfasof";
    }
}
