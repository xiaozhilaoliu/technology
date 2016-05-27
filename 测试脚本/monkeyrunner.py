#coding:utf-8 
import time
import sys  
from com.android.monkeyrunner import MonkeyRunner as mr  
from com.android.monkeyrunner import MonkeyDevice as md  
from com.android.monkeyrunner import MonkeyImage as mi  
#connect device 连接设备   
device = mr.waitForConnection()
if not device:  
    print >> sys.stderr,"fail"  
    sys.exit(1)  

client=sys.argv[1] 
package=''
activity=''
logfile='log_'
if client=='0':
    # 家长端
    package='com.cmcc.hbb.android.phone.parents'
    activity='com.ikbtc.hbb.android.parents.splash.view.activity.LoadingActivity'
    print '测试家长端'
    logfile=logfile+'parents.txt'
if client=='1':
    # 教师端
    package='com.cmcc.hbb.android.phone.teachers'
    activity=' com.ikbtc.hbb.android.teachers.loading.view.activity.LoadingActivity'
    print '测试教师端'
    logfile=logfile+'teachers.txt'
if client=='2':
    #园长端
    package='com.cmcc.hbb.android.phone.principal'
    activity='com.cmcc.hbb.android.phone.principal.splash.activity.LoadingActivity'
    print '测试园长端'
    logfile=logfile+'principal.txt'


if (''==package.strip()) or (''==activity.strip()):  
    print >> sys.stderr,"没有指定的客户端：家长端：1，教师端：2，园长端：3  example :monkeyrunner monkeyrunner.py 0"  
    sys.exit(1) 
componentName=package+'/'+activity
event='monkey -p '+package+' -vvv 1000'


def timeCount(begin_time):   
    while True:
        now_time=time.time()
        writelog(str(now_time))
        msg=device.shell(event)
        writelog(msg)
        mr.sleep(1200.0)
        if now_time-begin_time > 172800: #将48小时换算成秒172800
            return True
        
def writelog(msg):
    if ''!=msg.strip():
        output=open(logfile,'a')
        output.write(msg)


timeCount(time.time())
