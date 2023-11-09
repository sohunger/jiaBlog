package com.huang.commons.form;

import com.huang.base.annotation.NotBlank;
import com.huang.base.form.BaseForm;
import com.huang.base.gorups.GetOne;
import com.huang.base.gorups.Insert;
import com.huang.base.gorups.Update;

public class UserForm extends BaseForm {

    @NotBlank(groups = {GetOne.class})
    private String userName;

    @NotBlank(groups = {GetOne.class, Insert.class, Update.class})
    private String passWord;

}
