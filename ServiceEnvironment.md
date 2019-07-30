# 服务器环境搭建

## 一、系统安装

1. 服务器系统一般使用的是centos系统，[下载](http://isoredirect.centos.org/centos/7/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso) 页面，进入到下载页面中，选择一个合适的系统进行下载。这些下载只是下载源不同，影响的是下载速度。一般情况下，使用阿里云地址下载速度较快。

2. 制作U盘安装系统工具，需要准备一个16G及以上的空U盘，[下载](https://www.balena.io/etcher/) 制作工具，有Windows版本和Max版本的，下载完直接安装，启动软件，插上U盘，按照要求操作，flash完成之后，这个U盘装系统就完成了。

3. 安装系统，第一步，插上U盘，重启电脑，选择U盘启动，直接可以安装，选择安装的盘符，一般就选择第一个盘符就行了。直接就安装了，安装完成之后重启，然后拔掉U盘，系统安装完成。

## 二、网络连接

  一般情况下，新安装的系统不一定是直接可以使用网络的，此时就需要配置一下。

  1.查看网络命令

      ip addr

  这个命令可以看到当前电脑连接的是哪个网口，ip地址是多少，日过没有连接则没有IP地址。此时需要打开配置文件

  2.查看网络配置文件命令

    vi /etc/sysconfig/network-scripts/ifcfg-em1

  后面ifcfg-em1这个文件不一定是这个名字，如果不知道怎么看，这样操作：vi /etc/sysconfig/network-scripts/ 此时在连续按两下Tab键，就可以看到这个文件目录列表，在里面找到相应的文件即可。

  将ONBOOT=no改为ONBOOT=yes，退出保存即可。

  3.查看网络连接状态命令

    ping www.baidu.com

  查看是否能够ping通，如果能ping通，表示网络通了，如果还是没有通，就百度。

## 三、vim、ifconfig等工具安装

  1.查看是否已经安装vim命令

    rpm -qa | grep vim

  2.安装vim命令

    yum -y install vim*

  3.安装ifconfig命令

    yum install net-tools.x86_64

## 四、安装ftp服务

  1.查看是否安装ftp命令

    rpm -q vsftpd

  如果已经安装，则会显示版本号。日过没有安装则显示未安装。

  2.安装命令

    yum install -y vsftpd

  建议在root用户下安装，切换到root用户下，使用命令：

    su root

  只要网络不卡，基本上就能安装好。

  3.查看vsftpd服务状态、开启vsftpd服务、停止vsftpd服务命令：

    systemctl status vsftpd.service

    systemctl start vsftpd.service

    systemctl stop vsftpd.service

  4.防火墙添加FTP服务命令

    systemctl enable firewalld
    systemctl restart firewalld
    firewall-cmd --permanent --zone=public --add-service=ftp
    firewall-cmd --reload
    firewall-cmd --reload

  5.设置SELinux

    getsebool -a | grep ftp
    setsebool -P ftpd_full_access on

  6.查看SELinux设置

    vi /etc/selinux/config

  将SELINUX=enforcing修改为SELINUX=disabled

## 配置vsftp.conf文件

  vim /etc/vsftpd/vsftpd.conf
