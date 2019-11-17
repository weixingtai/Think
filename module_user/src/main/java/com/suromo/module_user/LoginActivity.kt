package com.suromo.module_user

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.suromo.module_common.BaseActivity

/**
 *     author : weixingtai
 *     e-mail : xingtai.wei@icloud.com
 *     time   : 2019/11/17
 *     desc   : 登录模块
 *     version: 1.0
 */
@Route(path = "/module_user/activity/login")
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_user_activity_login)
    }
}