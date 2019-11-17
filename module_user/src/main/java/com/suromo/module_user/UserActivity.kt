package com.suromo.module_user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

/**
 *     author : weixingtai
 *     e-mail : xingtai.wei@icloud.com
 *     time   : 2019/11/17
 *     desc   : 用户中心界面
 *     version: 1.0
 */
@Route(path = "/module_user/activity/user")
class UserActivity : AppCompatActivity() {

    internal var btnLogin: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_user_activity_user)
        btnLogin = findViewById(R.id.btn_arouter)
        btnLogin!!.setOnClickListener {
            ARouter.getInstance().build("/module_user/activity/user")
                .navigation()//跨模块跳转：测试ARouter
        }
    }
}
