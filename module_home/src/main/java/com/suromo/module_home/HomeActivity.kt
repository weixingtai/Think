package com.suromo.module_home

import android.os.Bundle
import com.suromo.module_common.BaseActivity

/**
 *     author : weixingtai
 *     e-mail : xingtai.wei@icloud.com
 *     time   : 2019/11/17
 *     desc   : 首页模块入口
 *     version: 1.0
 */
class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_home_activity_home)
    }
}
