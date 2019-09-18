# dubbo_demo

首先，安装zookeeper，下载地址：https://mirrors.cnnic.cn/apache/zookeeper/zookeeper-3.4.14/
解压到指定目录下，修改zookeeper-3.4.14/conf/zoo_sample.cfg 文件名为 zoo.cfg，修改内容如下：

dataDir=D:\DevelopmenteTools\zookeeper-3.4.14\data
dataLogDir=D:\DevelopmenteTools\zookeeper-3.4.14\log

启动zookeeper-3.4.14\bin\zkServer.cmd，安装成功。

启动项目dubbo-admin，dubbo的管理控制台，浏览器地址输入http://localhost:7001/   用户密码root

启动dubbo-providers-demo生产者

启动dubbo-consumers-demo消费者

开始测试。
