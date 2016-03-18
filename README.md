# technology
## 技术积累
1. 不要在异步任务重引用view活着activity对象，会引起内存无法释放以及crash的的问题。
2. diaog的显示是要依赖一个window的token对象的，否则就无法显示。
3. PopWindow实质就是弹出式菜单，它与Dialag不同的地方是不会使依赖的Activity组件失去焦点（PopupWindow弹出后可以继续与依赖的Activity进行交互），Dialog却不能这样。同时PopupWindow与Dialog另一个不同点是PopupWindow是一个阻塞的对话框，如果你直接在Activity的onCreate等方法中显示它则会报错，所以PopupWindow必须在某个事件中显示地或者是开启一个新线程去调用。
4. 关于web view的使用，需要在生命周期里面调webview.resumeTimers();
 webview.pauseTimers();否责会产生白屏现象！或者是返回后刷新资源加载不完整。
 
## 文档
1. [好的资料](https://github.com/xiaozhilaoliu/technology/blob/master/document/好的资料.md)
2. [ios&swift学习](https://github.com/xiaozhilaoliu/technology/blob/master/document/ios%26%20swift%20学习笔记.md)

## 工具

1. [反编译工具](https://github.com/xiaozhilaoliu/technology/tree/master/tools/apktool-install-macosx-r05-ibot)
