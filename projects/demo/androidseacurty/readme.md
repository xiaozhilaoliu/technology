### 加密总结
#### 一. 加密方式
	1、单向加密（MD5）
	2、对称加密（AES，DES）
	3、非对称加密（RSA）
#### 二、加密方式详解
##### 1、对称加密（DES／AES）
	1、Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
	cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
	CBC是工作模式：
		DES一共有电子密码本模式（ECB）；
		加密分组链接模式（CBC）；
		加密反馈模式（CFB）；
		输出反馈模式（OFB）四种模式。
	
	2、PKCS5Padding是填充模式，还有其它的填充模式：
	然后，cipher.init（）一共有三个参数：
	Cipher.ENCRYPT_MODE, key, zeroIv，zeroIv就是初始化向量，一个8为字符数
	组。
	
	3、工作模式、填充模式、初始化向量这三种因素一个都不能少。否则，如果你不指定的
	话，那么就要程序就要调用默认实现，就会导致个平台不一致
