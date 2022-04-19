# java项目文件说明

## 1-文件目录项目说明

### java代码目录说明
```
com.documentationManagement  #包名

--controller #前端交互

--model      #建模对象
    --user      #用户建模
    --file      #文献建模
    
--service    #解析前端请求, 求取后端数据
    --service               #数据库管理功能
        --userServive       #用户接口定义
            --loginService         #登陆功能
            --registerService      #注册功能
    --serviceImpl
        --userImpl          #用户接口实现

    
--config     #项目配置

--utils      #常用工具
    --SQL                #mysql操作
        --ConntectToSQL      #远程连接mysql数据库
        --SqlOption   # 建议此文件拆分成多个功能(注册登陆放一起,各种操作分类等)
    --dataTransmission   #数据流构造
    
--Test    #细节功能测试区域



```
### resource资源目录说明
