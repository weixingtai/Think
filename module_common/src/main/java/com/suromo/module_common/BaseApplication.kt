package com.suromo.module_common

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 *     author : weixingtai
 *     e-mail : xingtai.wei@icloud.com
 *     time   : 2019/11/17
 *     desc   : BaseApplication 主要用于各个业务组件和app壳工程中声明的 Application 类继承用的，
 *     只要各个业务组件和app壳工程中声明的Application类继承了 BaseApplication，当应用启动时
 *     BaseApplication 就会被动实例化，这样即可让各个组件获取全局 Context
 *     version: 1.0
 */
abstract class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            //            一定要在ARouter.init之前调用openDebug
            ARouter.openDebug()
            ARouter.openLog()
        }
        ARouter.init(this)
    }
}