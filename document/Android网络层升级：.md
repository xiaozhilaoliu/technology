**说明**
### Android网络层升级：
#### 注：
**属于网络框架的升级，升级之后提升了开发效率，并且减少了依赖包
	的大小。需要与业务功能一起持续测试，稳定后才可上线！此功能不上线，也不影响现在功能的正常使用**
#### [jira的issue地址](http://jira.hxkid.com:8080/browse/HBB-1856)
#### 内容：
##### 1、网络库升级
	retrofit：1.9.0->2.0.2
	okhttp:2.7.5->2.7.5
	stetho:1.2.0->1.3.1
	stethoOkhttp:1.2.0->1.3.1
##### 2、升级日志
   [Retrofit升级日志](https://github.com/square/retrofit/blob/master/CHANGELOG.md)

   [Okhttp升级日志](https://github.com/square/okhttp/blob/master/CHANGELOG.md)

   [stetho升级日志](https://github.com/facebook/stetho/blob/master/CHANGELOG.md)
   
	
#### 涉及的客户端
	Android ：家长端、园长端、教师端

#### 完成目标
	1、现有代码使用最小方案改造
	2、升级retrofit、okhttp、stetho以及stethoOkhttp到最新版本
	3、规范Android团队网络请求模块使用方式（请求和返回全部使用实体类，
	并且使用retrofit的gson转换器）
#### 收益
	1、规范网络请求模块的代码。
	2、新版本库中的特性。详细请参照升级日志
#### 重要时间节点
	1、ToDo:4月25日
	2、研发完成时间：4月29日完成
	3、测试环境完成时间：5月18日完成
	4、准生产环境完成时间：5月24日
	5、生产物料测试并且上线时间：5月27日

#### 参与人员
	1、VPO－贺志强
	2、Dev－贺志强
	3、QA－邹梅苹、朴健
	4、OPS－玄高武
	5、项目经理－史云峰

#### 资源估算
	1、安卓 1人5天（4月29日）
	2、测试环境  （5月18号完成）
	3、网络请求测试：1人4天
	4、兼容性测试：与业务功能一起持续测试（对应分支retrofit分支打出测试环境的包测试）
	5、准生产环境 5月24日（与考勤一起上线）
	6、生产环境 5月27日