package com.huang.access.controller;

import com.huang.base.controller.BaseController;
import com.huang.base.gorups.GetOne;
import com.huang.commons.form.UserForm;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登录 controllrt
 * @author jia
 * @date 2023-11-09
 */
@RefreshScope
@RestController
@RequestMapping("/login")
public class LoginController extends BaseController {

    @RequestMapping("/login")
    public String login(@Validated(GetOne.class) UserForm userForm, BindingResult bindingResult) {
        return "";
    }
}
