package org.hzz.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@Tag(name = "管理界面用户管理",description = "用户管理登录等等")
@Slf4j
public class AccountController extends BaseController{

    @Operation(summary = "保存用户信息", description = "保存用户信息到数据库")

    @PostMapping("/save")
    public void save() {
        throw new NotImplementedException("接口未实现");
    }
}
