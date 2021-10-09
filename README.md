<div align="center">
<br/>

  <h1 align="center">
    自动备份文件到网盘
  </h1>
  <h4 align="center">
    一款可以定时备份本地目录到阿里云盘的小工具
  </h4> 

<div align="center">
  <img  width="92%" style="border-radius:10px;margin-top:20px;margin-bottom:20px;box-shadow: 2px 0 6px gray;" src="https://images.gitee.com/uploads/images/2021/0524/152244_1b5520ce_4873209.png" />
</div>
</div>


#### 介绍

Java Swing + Hutool + Okhttp3 自动备份文件到【阿里云盘】的小工具


觉得不错请点点Star,您的Star就是我的动力，感谢！
#### 由来

工作中会经常接收到各个客户发来的种种文件，这些文件又比较重要，搞丢了就会很麻烦。

而且公司电脑的文件回家后要改就很麻烦，不能同步，苦于网上没有找到类似的备份软件，咱自己动手写一个！

哪我为什么不用百度云盘？？？因为穷！！！因为限速。。。

#### 登录方式【阿里云盘升级，仅剩二维码登录】

|  |  |  |
|---------------------|---------------------|---------------------|
| ![输入图片说明](https://images.gitee.com/uploads/images/2021/0524/152531_4b2a9fa5_4873209.png "屏幕截图.png")  | ![输入图片说明](https://images.gitee.com/uploads/images/2021/0524/152435_7c4a1340_4873209.png "屏幕截图.png")  |![输入图片说明](https://images.gitee.com/uploads/images/2021/0603/101943_e74e8ba2_9173799.png "屏幕截图.png")  |

#### 下载安装
1.  windows系统 **含** JDK安装包，适合没有JDK环境的使用：[点击下载](http://yunpan.xingk.xin/%E5%A4%87%E4%BB%BD%E5%8A%A9%E6%89%8B/%E5%A4%87%E4%BB%BD%E5%8A%A9%E6%89%8B-0.2-win-%E5%90%ABJDK.exe)
2.  windows系统 **不含** JDK安装包，适合有JDK环境的可以直接运行：[点击下载](https://gitee.com/xingk-code/AliYunPan/attach_files/846544/download/%E5%A4%87%E4%BB%BD%E5%8A%A9%E6%89%8B-0.2-win-%E4%B8%8D%E5%90%ABJDK.exe)
2.  windows、macos、等系统有JDK的可以直接下载jar运行：[点击下载](https://gitee.com/xingk-code/AliYunPan/attach_files/846545/download/%E5%A4%87%E4%BB%BD%E5%8A%A9%E6%89%8B-0.2-mac-liunx-win.jar)

#### 更新日志
##### 2021-09-20


- 自定义设置自动备份时间
- 优化文件监控
- 修复偶尔发生的排版错乱
- 优化代码结构，修复N个BUG
- 去掉账号密码登录和短信验证码登录


##### 2021-06-03


- 新增二维码登录
- 修复阿里云盘更新导致无法登录
- 优化代码结构


#### 内置功能
1.  刷新Token：每小时刷新一次Token，避免token失效。
2.  文件分类：支持按文件类型分类上传，按【文档、图片、视频、音乐等】
3.  上传记忆：记录已经上传的文件，下次执行进行增量上传。
4.  目录监控：软件启动后自动监听当前需要备份的目录，产生新文件或文件修改时自动上传新文件。
5.  定时同步：开启程序后，每晚20:30 自动上传本地目录到【阿里云盘】<br>
PS：如需修改执行时间请到back_config.setting文件中修改backupTime参数，注意格式不要写错哦~如【20:30:00】
6.  登录状态：自动保存登录状态，减少登录次数，提升用户体验
#### 开发中....
1.  自定义设置自动备份时间。
2.  按关键字、按类型上传。
#### 使用说明

1.  双击打开程序，登录阿里云盘账号
2.  选择要备份的目录
3.  **备份目录则填写想要上传到【阿里云盘】的目录名称**
4.  **备份模式：**
    1. 普通备份：会按本地目录结构上传文件
    2. 分类备份：会将本地文件按文档、压缩包、软件、音乐、图片、视频等分类上传
5.  点击开始备份，即可全量备份所选目录。

#### 常见问题
![输入图片说明](https://images.gitee.com/uploads/images/2021/0524/153117_ebbff9ea_4873209.png "屏幕截图.png")

出现【请您先在电脑网页登录成功后，再登录本软件。】是因为第一次在本设备登录需要进行二次认证。。。暂未兼容

**注意：程序初次运行会在同级目录生成：** 

**back_config.setting（程序配置文件，存放目录，token，备份模式等信息）、**

**uploadLog.json（则存放上传过的文件信息，此文件删除后会重新扫描目录下文件是否已上传）** 
