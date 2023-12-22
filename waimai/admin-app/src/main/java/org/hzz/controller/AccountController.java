package org.hzz.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.hzz.bean.entity.system.User;
import org.hzz.bean.vo.front.Ret;
import org.hzz.bean.vo.front.Rets;
import org.hzz.service.system.UserService;
import org.hzz.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/account")
@Tag(name = "管理界面用户管理",description = "用户管理登录等等")
@Slf4j
public class AccountController extends BaseController{


    @Autowired
    private UserService userService;

    /**
     * 用户登录<br>
     * 1，验证没有注册<br>
     * 2，验证密码错误<br>
     * 3，登录成功
     *
     * @param userName
     * @param password
     * @return
     */
    @Operation(summary = "用户登录", description = "用户登录")
    public Ret login(
            @Parameter(description = "用户登录类型",required = true,example = "1或者2")
            @RequestParam("userType") String userType,
            @Parameter(description = "用户名",required = true,example = "admin")
            @RequestParam("username") String userName,
            @Parameter(description = "用户密码",required = true,example = "admin")
            @RequestParam("password") String password,
                        HttpServletRequest request){

        log.info("用户登录:" + userName + ",密码:" + password);
        String token = null;

        if(Constants.USER_TYPE_MGR.equals(userType)){
            // 管理员
            User user = userService.findByAccount(userName);
            if(user == null){
                return Rets.failure("该用户不存在");
            }


        }else if (Constants.USER_TYPE_SHOP.equals(userType)){
            // 商户
        }else{

        }
        return null;
    }
}
