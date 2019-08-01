# 服务器环境搭建
###### v1.0.0
#### 检测网络环境
一、 进行入系统根目录

  1.命令

    ping ww.baidu.com

  出现如下，表示网络正常，可以进行下一步

    正在 Ping 169.254.70.25 具有 32 字节的数据:
    来自 169.254.70.25 的回复: 字节=32 时间<1ms TTL=128
    来自 169.254.70.25 的回复: 字节=32 时间<1ms TTL=128
    来自 169.254.70.25 的回复: 字节=32 时间<1ms TTL=128

  2.命令

    ifconfig / ip addr

  查看网络ip信息，获取本机的ip地址。

    [root@localhost ~]# ifconfig
    eth0      Link encap:Ethernet  HWaddr 00:50:56:BF:26:20  
        inet addr:192.168.120.204  Bcast:192.168.120.255  Mask:255.255.255.0
        UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
        RX packets:8700857 errors:0 dropped:0 overruns:0 frame:0
        TX packets:31533 errors:0 dropped:0 overruns:0 carrier:0
        collisions:0 txqueuelen:1000
        RX bytes:596390239 (568.7 MiB)  TX bytes:2886956 (2.7 MiB)

    lo        Link encap:Local Loopback  
        inet addr:127.0.0.1  Mask:255.0.0.0
        UP LOOPBACK RUNNING  MTU:16436  Metric:1
        RX packets:68 errors:0 dropped:0 overruns:0 frame:0
        TX packets:68 errors:0 dropped:0 overruns:0 carrier:0
        collisions:0 txqueuelen:0
        RX bytes:2856 (2.7 KiB)  TX bytes:2856 (2.7 KiB)

    说明：eth0 表示第一块网卡， 其中 HWaddr 表示网卡的物理地址，可以看到目前这个网卡的物理地址(MAC地址）是 00:50:56:BF:26:20

      inet addr 用来表示网卡的IP地址，此网卡的 IP地址是 192.168.120.204，广播地址， Bcast:192.168.120.255，掩码地址Mask:255.255.255.0

      lo 是表示主机的回坏地址，这个一般是用来测试一个网络程序，但又不想让局域网或外网的用户能够查看，只能在此台主机上运行和查看所用的网络接口。比如把 HTTPD服务器的指定到回坏地址，在浏览器输入 127.0.0.1 就能看到你所架WEB网站了。但只是您能看得到，局域网的其它主机或用户无从知道。

      第一行：连接类型：Ethernet（以太网）HWaddr（硬件mac地址）

      第二行：网卡的IP地址、子网、掩码

      第三行：UP（代表网卡开启状态）RUNNING（代表网卡的网线被接上）MULTICAST（支持组播）MTU:1500（最大传输单元）：1500字节

      第四、五行：接收、发送数据包情况统计

      第七行：接收、发送数据字节数统计信息。

#### 查看文件系统目录
  3.命令

    cd /opt/
    ls

  显示如下文件夹

    lost+found mysql_db sohu_app

  4.命令

    cd sohu_app
    ls

  显示如下 6 个文件夹

    cas_2.0.0 content-client_2.0.0 content-server_2.0.0 content-web_2.0.0 ossportal_2.0.0 permissions_interface_2.0.0

#### cas_2.0.0系统配置文件配置

  5.命令

    cd cas_2.0.0/cas/conf/
    vim cas.properties

  按i进入修改模式，修改配置文件中所有ip地址为命令2中获取的ip。修改完成全后，保存退出，退出方法是：

    1.按Esc键，退出insert模式
    2.按Shift + ： 进入文件操作模式
    3.按w + q + Enter，保存退出。
    完成此文件修改

  6.命令

    cd ../../
    tail cas/conf/cas.properties

  科普：tail命令用途是依照要求将指定的文件的最后部分输出到标准设备，通常是终端，通俗讲来，就是把某个档案文件的最后几行显示到终端上，假设该档案有更新，tail会自己主动刷新，确保你看到最新的档案内容。

  7.命令[cas_2.0.0]#

    cat cas/conf/cas.properties
    ./start.sh

  主要输出是

    JAVA_HOME path /opt/sohu_app/cas_2.0.0/jdk1.7.0_79
    RESIN_HOME path /opt/sohu_app/cas_2.0.0
    Resin/4.0.44 launching watchdog at 127.0.0.1:7013
    Resin/4.0.44 started -server 'app' with watchdog at 127.0.0.1:7013

  此时cas这个文件中的服务已经启动成功。

  8.命令

    cd ../
    ls

  退出到soho_app目录下，能够看到这 6 个文件夹

    cas_2.0.0 content-client_2.0.0 content-server_2.0.0 content-web_2.0.0 ossportal_2.0.0 permissions_interface_2.0.0

  9.命令

    cd ossportal_2.0.0/conf/
    ls

  显示文件application.properties conf.properties

  10.命令

    vim conf.properties

  进入到配置文件中，修改配置文件中所有的ip地址为命令2中查看的本地ip地址。

  11.命令

    vim application.properties

  进入到配置文件中，修改配置文件中所有的ip地址为命令2中查看的本地ip地址。

  12.命令

    cd ../../
    ./start.sh

  退出到ossportal_2.0.0目录下，启动脚本，主要输出为：

    JAVA_HOME path /opt/sohu_app/ossportal_2.0.0/jdk1.7.0_79
    RESIN_HOME path /opt/sohu_app/ossportal_2.0.0
    Resin/4.0.44 launching watchdog at 127.0.0.1:7014
    Resin/4.0.44 started -server 'app' with watchdog at 127.0.0.1:7014

 此时ossportal系统服务启动完成。

 13.命令

    cd ../permissions_interface_2.0.0/permissions_interface/conf/

  进入到配置文件夹中，

  14.命令

    vim dbconn.properties

  修改配置文件中所有的ip地址为命令2中查看的本地ip地址，修改完成后保存退出。

  15.命令

    cat dbconn.properties

  查看文件是否修改完成。退出到permission_interface_2.0.0目录下。

  16.命令

    ./start.sh

  退出到ossportal_2.0.0目录下，启动脚本，主要输出为：

    JAVA_HOME path /opt/sohu_app/permissions_interface2.0.0/jdk1.7.0_79
    RESIN_HOME path /opt/sohu_app/permissions_interface2.0.0
    Resin/4.0.44 launching watchdog at 127.0.0.1:7011
    Resin/4.0.44 started -server 'app' with watchdog at 127.0.0.1:7011

 此时permissions_interface系统服务启动完成。

 17.命令

    cd ../content-web_2.0.0/
    ls

显示content-web2.0.0文件下的所有文件和文件夹

    app-inf
    conf
    doc
    jdk1.8.0_181
    libexec64
    resin.exe
    start.sh
    watchdog-data
    webapps
    win64
    bin
    content_manager_souhu_conf
    endoresd
    lib
    log
    resin-data
    setup.exe
    stop.sh
    webapp-jars
    win32

  18.命令

    cd content_manager_souhu_conf/
    ls

  显示文件目录

    conf.properties
    jdbc.properties
    log
    log4j.properties

  19.命令

    vim jdbc.properties
    vim conf.properties

  分别修改配置文件中的ip地址为命令2中查看的本地ip地址，修改完成后保存退出。

  20.命令

    ./start.sh

  退出到ossportal_2.0.0目录下，启动脚本，主要输出为：

    JAVA_HOME path /opt/sohu_app/content-web_2.0.0/jdk1.8.8_181
    RESIN_HOME path /opt/sohu_app/content-web_2.0.0
    Resin/4.0.44 launching watchdog at 127.0.0.1:7011
    Resin/4.0.44 started -server 'app' with watchdog at 127.0.0.1:7011

  此时permissions_interface系统服务启动完成。

  21.命令

    tail -100f log/app-access.log

  此时可以在浏览器中查看，打开Chrome浏览器，地址栏输入

    192.168.1.6:9013

  就可以进入到全媒体播控平台的登录页面。用户登录不成功，是因为配置文件没有修改完成导致，部分服务还没有开启，接下来的操作是，停止web服务，完成其他配置。



  22.命令[content-web_2.0.0]#

    ./stop.sh

  停止服务，输出如下信息：

    JAVA_HOME path /opt/sohu_app/content-web_2.0.0/jdk1.8.8_181
    RESIN_HOME path /opt/sohu_app/content-web_2.0.0
    Resin/4.0.44 stopped for watchdog at 127.0.0.1:7011

  表示服务停止了。

  23.命令

    cd ../cas_2.0.0/
    ls

  查看文件夹下，所有文件夹和文件，显示输出如下：

    app-inf
    cas
    cas.log.1
    cas.log.3
    doc
    jdk1.7.0.79
    libexec64
    perfStats.log
    resin-data
    setup.exe
    stop.sh
    webapp-jars
    win32
    bin
    cas.log
    cas.log.2
    conf
    endorsed
    lib
    log
    project-jars
    resin.exe
    start.sh
    watchdog-data
    webapps
    win64

  24.命令

    tail -100f cas.log

 查看一下日志，重新启动content-web服务

 25.命令

    ./start.sh

  等系统需要管理员的用户名和密码，这个需要联系开发者，获取。
  登入系统中，在管理权限地方，查看当前配置。发现还有部分配置没有修改。站点管理中
  服务端地址修改

    修改分平台地址ip，服务短地址ip为服务器的ip地址。

  26.命令

    cd /opt/sohu_app/content-client_2.0.0/content_manager_souhu_conf
    ls

  进入到客户端服务系统的配置文件夹中，查看文件夹和文件，显示如下：

    conf.properties jdbc.properties log log4j.properties

  27.命令

    vim conf.properties
    vim jdbc.properties

  修改配置文件中所有的ip地址为命令2中查看的本地ip地址,保存退出

  28.命令

    cd ../
    ./start.sh

  启动客户端服务，

    JAVA_HOME path /opt/sohu_app/content-client_2.0.0/jdk1.8.0_181
    RESIN_HOME path /opt/sohu_app/content-client_2.0.0
    Resin/4.0.44 launching watchdog at 127.0.0.1:7013
    Resin/4.0.44 started -server 'app' with watchdog at 127.0.0.1:7013

  至此，所有服务配置全部完成，

  # 总结

  此服务器环境搭建，进入到/opt/sohu_app目录下一共有6个文件夹，每个文件夹下面的配置文件中，修改一个或者两个配置文件，分别是conf.properties和jdbc.properties只需要修改文件中的ip地址，保存退出，然后启动每个文件的start.sh脚本。待得所有脚本启动成功之后整个服务器环境搭建完成。
