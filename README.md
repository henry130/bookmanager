# 图书管理系统

参考项目：https://github.com/withstars/Books-Management-System


#### 主要功能
1.  登录、注销、修改密码
2.  管理员对图书信息的增删改查、查看读者、查看借阅记录
3.  读者对图书信息的查看查询、修改个人信息、查看借阅记录


#### 使用技术
数据库：mysql5.7 <br>
后端框架: SpringBoot <br>
HTML模板: ThymeLeaf <br>
持久层: Mybatis <br>
UI: Bootstrap <br>
登录验证和用户权限: SpringSecurity

#### 使用说明
本项目使用maven进行管理，详细安装教程自行百度
1.  需下载mysql图形化管理工具(例如Navicat)，新建数据库library，右键数据库-->运行项目中的library.sql脚本
2.  用IDE打开项目(建议使用idea)，打开src/main/resources/application.yml，将数据库的username和password修改成你自己的mysql的用户名和密码
3.  直接idea中找到BookmanagerApplication类运行main方法 或者 项目目录下打开cmd，输入mvn clean package，在target目录下用java -jar命令运行对应的jar包

#### 运行截图
登录 <br>
![输入图片说明](https://images.gitee.com/uploads/images/2021/0125/105210_eb5fa048_7781721.png "屏幕截图.png")

图书界面 <br>
![输入图片说明](https://images.gitee.com/uploads/images/2021/0125/105235_03839fc4_7781721.png "屏幕截图.png")

编辑图书信息 <br>
![输入图片说明](https://images.gitee.com/uploads/images/2021/0125/143210_d6e37075_7781721.png "屏幕截图.png")

图书详情 <br>
![输入图片说明](https://images.gitee.com/uploads/images/2021/0125/143235_4d65e388_7781721.png "屏幕截图.png")

读者信息 <br>
![输入图片说明](https://images.gitee.com/uploads/images/2021/0125/143318_0c721f22_7781721.png "屏幕截图.png")

借阅记录 <br>
![输入图片说明](https://images.gitee.com/uploads/images/2021/0125/143338_62fd12e8_7781721.png "屏幕截图.png")

读者界面 <br>
![输入图片说明](https://images.gitee.com/uploads/images/2021/0125/143450_1698361f_7781721.png "屏幕截图.png")

修改密码 <br>
![输入图片说明](https://images.gitee.com/uploads/images/2021/0125/143608_7ac17c5a_7781721.png "屏幕截图.png")

#### 联系方式

henry12138@163.com
