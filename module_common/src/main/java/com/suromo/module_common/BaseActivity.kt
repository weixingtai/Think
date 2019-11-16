package com.suromo.module_common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.module_common_activity_base.*
/**
 *     author : weixingtai
 *     e-mail : xingtai.wei@icloud.com
 *     time   : 2019/11/17
 *     desc   :
 *     version: 1.0
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_common_activity_base)
        setSupportActionBar(tb_common_head)
    }

}