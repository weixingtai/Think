#Think框架

框架中的所有apk需要以 **application_(应用名)** 的形式命名
框架中的所有模块需要以 **module_(模块名)** 的形式命名
框架中的所有自定义库需要以 **library_(自定义库名)** 的形式命名




##简介
一个集成Rxjava2+Retorfit2+OKHttp3的MVP框架，并整合一些主流的开源库

技术栈：
kotlin语言
模块化及组件化开发
clean Architecture
Android日志打印框架--Logger
阿里路由框架ARouter
Espresso UI自动化测试框架


模块化及组件化开发：http://www.imooc.com/article/76101
https://www.cnblogs.com/ldq2016/p/9073105.html

module_oak:壳工程
module_user:用户模块
module_message:信息模块
module_common:基础模块
module_base:业务组件，指定用户的启动界面，主界面

全局管理引入项目版本号及依赖库：version.gradle

资源重名：resource Prefix：user_layout
strings、 colors、dimens 等资源放到 common 去，可以防止不同的资源名字却对应了同一资源值。

组件单独调试：
application 与 library 切换：isAssembled=false
组件添加applicationId
组件添加入口类：AndroidManifest 设置入口类

library 重复依赖：合并自动去掉重复依赖


The Clean Architecture 架构
每个子项目分为三层：data+domain+presentation
presentation:采用mvp开发模式：view+presenter+view

