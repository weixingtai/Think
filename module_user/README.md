# User模块

业务组件就是根据业务逻辑的不同拆分出来的组件，业务组件的特征如下：

1、业务组件中要有两张AndroidManifest.xml，分别对应组件开发模式和集成开发模式，这两张表的区别请查看 组件之间AndroidManifest合并问题 小节。

2、业务组件在集成模式下是不能有自己的Application的，但在组件开发模式下又必须实现自己的Application并且要继承自Common组件的BaseApplication，
并且这个Application不能被业务组件中的代码引用，因为它的功能就是为了使业务组件从BaseApplication中获取的全局Context生效，还有初始化数据之用。

3、业务组件有debug文件夹，这个文件夹在集成模式下会从业务组件的代码中排除掉，所以debug文件夹中的类不能被业务组件强引用，例如组件模式下的
 Application 就是置于这个文件夹中，还有组件模式下开发给目标 Activity 传递参数的用的 launch Activity 也应该置于 debug 文件夹中；

4、业务组件必须在自己的 Java文件夹中创建业务组件声明类，以使 app壳工程 中的 应用Application能够引用，实现组件跳转，具体请查看 组件之间调用和通信 小节；

5、业务组件必须在自己的 build.gradle 中根据 isModule 值的不同改变自己的属性，在组件模式下是：com.android.application，而在集成模式下com.android.library；
同时还需要在build.gradle配置资源文件，如 指定不同开发模式下的AndroidManifest.xml文件路径，排除debug文件夹等；业务组件还必须在dependencies中依赖Common组件，
并且引入ActivityRouter的注解处理器annotationProcessor，以及依赖其他用到的功能组件。
