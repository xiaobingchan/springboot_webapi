# jenkinsdemo
用于测试jenkins持续构建服务


写一个个人钱包系统的微服务，通过api接口可以充值到自己账户，转账给别人，查询和记录每一笔交易走向,要求：1，common文件夹里放httpstatus、timestamp、UUID的interface;2，config文件夹里放UTC Clock、flywayconfig类、JacksonConfig;3，controller里面放每个微服务的api路径定义;4，dto里面放数据表bean的对象定义;5，entity放每个column列名定义，用uuid定义id;6，entity/enums放表列属性定义;7，exception放可能出现的异常;8，factory放factory response;9，integration放FeignClient注入;10，messaging放kafka topic的anync broadcast;11，repository放interface extends JpaRepository;12, service里面放interface;13，strategies里面放void的interface;14，util里面放UtilityClass

GET /api/v1/wallets/{userId} - 查询钱包
POST /api/v1/wallets/{userId}/deposit - 充值
POST /api/v1/wallets/{userId}/withdraw - 提现
POST /api/v1/wallets/{userId}/transfer/{targetUserId} - 转账


```
Nodejs 微服务API moleculer：https://moleculer.services/zh/docs/0.14/usage.html
Python 微服务API fastapi：https://fastapi.tiangolo.com/zh/tutorial/sql-databases/
Zing Springboot JAVA微服务：https://github.com/xiaobingchan/springboot_webapi，集成参考：https://carger.tips/%E5%BE%AE%E6%9C%8D%E5%8B%99%E6%9E%B6%E6%A7%8B%E8%88%87-spring-boot-%E9%9B%86%E6%88%90%E6%96%B9%E6%B3%95
Ray Go 微服务：https://github.com/raychongtk/wallet
.net 微服务：https://www.rh86.com/3736.html    https://github.com/axzxs2001/HisMicroserviceSample

figma 生成代码插件：
https://www.figma.com/community/plugin/1248187540929489451/f2c-figma-to-code-react-rn-vue-html-yy-d2c
https://www.figma.com/community/plugin/1443774571835235184（https://platform.openai.com/settings/organization/projects）


```
