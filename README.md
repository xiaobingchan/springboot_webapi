# jenkinsdemo
用于测试jenkins持续构建服务


写一个个人钱包系统的微服务，通过api接口可以充值到自己账户，转账给别人，查询和记录每一笔交易走向,要求：1，common文件夹里放httpstatus、timestamp、UUID的interface;2，config文件夹里放UTC Clock、flywayconfig类、JacksonConfig;3，controller里面放每个微服务的api路径定义;4，dto里面放数据表bean的对象定义;5，entity放每个column列名定义，用uuid定义id;6，entity/enums放表列属性定义;7，exception放可能出现的异常;8，factory放factory response;9，integration放FeignClient注入;10，messaging放kafka topic的anync broadcast;11，repository放interface extends JpaRepository;12, service里面放interface;13，strategies里面放void的interface;14，util里面放UtilityClass

GET /api/v1/wallets/{userId} - 查询钱包
POST /api/v1/wallets/{userId}/deposit - 充值
POST /api/v1/wallets/{userId}/withdraw - 提现
POST /api/v1/wallets/{userId}/transfer/{targetUserId} - 转账