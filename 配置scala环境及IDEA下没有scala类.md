# 配置scala环境及IDEA下没有scala类
本文借鉴内容：
1. https://www.runoob.com/scala/scala-install.html   
2. https://blog.csdn.net/zuochang_liu/article/details/81515167

## 总结
用IDEA社区版来学习scala是最合适的环境。

## （一）背景
因为spark、flink等都涉及scala编程，会比Java更方便，在spark里用scala又比python写的pyspark更稳定实用高效，所以需要铺垫学习一点scala基础。
***

## （二）环境搭建简叙述
建议参考借鉴内容1。现阶段scala的环境搭建分如下几步   
1. 在windows系统环境下安装jdk并配置环境变量（java 8以上）。   

2. (a)在scala官网下载并部署安装scala，类似于jdk配置环境变量，scala安装完成后必须手动配置环境变量和scala解释编译环境。   
(b)2024年5月10日在官网下载的scala有一键部署包，安装过程中需要有几个环境变量依赖，依据流程安装即可。但是，本版本scala(Scala code runner version 3.4.2 -- Copyright 2002-2024, LAMP/EPFL)在windows安装完成后默认安装位置在C盘的"Programs Files X86"下，但是在windows目录下找不到安装目录，但是依此配置PATH是可行的，原因未查到。   

3. 目前推荐使用IDEA来学习scala（和java），IDEA正式版是收费的，但是如果有一个经营超过1年的开源github项目可以申请免费使用，申请一次1年有效。推翻的方式是IDEA社区版，即免费学习版，https://www.jetbrains.com/zh-cn/idea/download/download-thanks.html?platform=windows&code=IIC。
***

## （三）IDEA中新建scala工程没有scala类
IDEA首先要下载scala插件，依借鉴文档搭建环境。   

在IDEA中练习Scala有两种工程建立方式，一种是新建一个maven的工程，然后导入scala，可同时支持java和scala编程，方便管理。第二种方法是可以直接新建一个scala工程，二者效果都是一样的。   

但是遇到一个问题，工程建立后，新建程序文件的时候，没有“新建scala类”这个选项。
1. 确保正确安装scala插件，即重启IDEA后新建工程可以直接选scala。   

2. 确保windows的scala安装成功，环境测试成功，可以以命令方式运行scala。   

3. 确保新建工程时，加载了scala的sdk，如果没有自动加载，点后面的创建就可以了。   

4. 以上都确保了，还是没有“新建Scala类”的话就需要配置新建工程的设置，因为他没有在全局库设置里添加scalaDK,可以右键新建工程修改设置，也可以按“ctrl+alt+shift+s”，在Global Libraries里记得添加上scalaDK。   

重启IDEA之后，应该就可以添加scala类的下拉中新建scala object来编写了。   
***

## （四）在IDEA中其他scala设置
Ctrl+Alt + s  进入到settings配置页面。可以修改字体大小，以及编码字符集。
