package com.suromo.module_main

import android.os.Bundle
import com.suromo.module_common.BaseActivity

/**
 *     author : weixingtai
 *     e-mail : xingtai.wei@icloud.com
 *     time   : 2019/11/17
 *     desc   : 项目入口模块
 *     version: 1.0
 */
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_main_activity_main)
    }
}
