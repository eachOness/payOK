package com.aliyun.pay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102300745180";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCIckOQA8MjUsin68OdpJ5C+B1uVrr7TLLw1O2S064AEdHbKrWE6bcOAXHta6dD8G2vYizCZAk26ToOQTTJBygi7FxTu92Sq/blPjfYgW/GQC+jHR8QI5QIxZySqQ0tRl4QP/naJBUsLLwSj9lnofWLIX9RANX2PgpaFZoLBK2dOCL1a4JQsimT36P/s+wkJMy6Oc4dgteaZEHfvI92y3e6coLQNDB0sE68vN+J7p6KXxBnvQvT9N5UhCuCoXQpga0cysfe8OwtCjDa0MgVSyV/39caPGzHqpHXypjtDsTgUpDMq/B+c/uCeKe/y2efwrHPqCzmNs32xW3HWgtZy66pAgMBAAECggEAYVv+/4TfuZW5XbBp3VN4Jdr6zR+Pvf6ldBjLCEiI0L3mWxdnfFZz6sd3LmzxZhXpfgp0W6SbupXCeidm7cZwijLTUmAroxuXSU4S9SauxexI0X/XCWIJoBS5OyDrKRIbzkaIFnJGtUWaUThZbYvwM/2L5hXNli4AnvTo/NGyvAolsO3JNZKNlyPYn/wPFs689q8aRUks/s4o8FfWybr+OcDv3CIKKSyAwQ6+SmEN12umqF8yJ8PGD0CnkENh9bmKHHNCILEYr1+pwqNnWRsKu+EiHAIKb1V7YlE8dR6fQBXotOW0BCpBzxsrBimqpPThgoQCLZnyQbk46KtfpePrAQKBgQDK6EzKuwdre4OG2ijunsx1yOq5YSsivQXqRou07yEh8L/a9kAB0sIEszlnc0sSnvzpCV1kM19/vaLW9gAOFDaJtc/zUPzYxdiX3/4eDtXvFn0sNKIxYj/7HXzmRZzhszeCi9SJK6QqM8otu6NY5Pt7X5N0+5MokIShOHW0EI4DiQKBgQCsJhYPsubRYLJCsOxYzU6j5OXmvjfHNw4T5igmCnd7yB1oqlJOv/Aba2Hkgi6L0uTHQRYaaNaBSTuQ57sAWgAJJD08u51BSBYSTVUWL5cpBvNiPVyqEgDQTwjR7W3pNIL+eLuh47UCcZYnMShosVT5utj+hxYbHLDYjDgJm7LqIQKBgDQBN/VZ3Dv7Cynb7lPCVYr2tNpQgjrEEakK7bGw/F/zkWiwZpVRDDMiMFtIXHxoTU/4+3u8AwT9eKf5ouf43EWNWL/3COcSRkIewcW4bbJ6pBhZYRyhHt7gnutx+hSK13ZZGl8R1WCPp4jzJ5mYDrB/PY7lD8F80NF1ZA2DlLJpAoGAHxZlp4IcMrVum6KNm9+/ktNUPR4evogPr8JBf9UmDKFvxiXz5Sq+NoVm0Tg9JZz5GY6EalKCYiiSbDGc0IxwMzZrJJuQ42gcLEPw2KfReWQ68YO5RzEnGncbVaW10oZcHY45/Bs95eoTPpKfBID5ont+kkBc2pqMyR5RRFLstWECgYBj77TZSdVMZeCZIpWJeZb7eSt3wAortncOUEGV6DB0emvL3QGOoEz8yD/TU6E0Bj4Vtxs1Vb8Juobls78MuPVxprbLm+eEs5P9zTaecjURQaOUNXQTVA5f+40mMFd9D2ri4VoSfXDPdWDn5ea4qp19dWs9UO4+xD3uvgcGXHVkKA==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAp+OW/iW7gDqp0k7GdAsOs/UWcHg/jrmHJOh5bZ1WUvOMGOn8PN32tOQUd/6ptLueHino2dyCbYJfMMqU8/7mVOOhaw8oVr1TFOtzvBT5f577Ngybiv4CkypU8wt/nqGjI9bH+NuzlttyKNRuWTkjSD96XEYdRvbzUGkxig3t06gNaBpU8aj8fqrrzzzxcjuqGjjRz4ZR9AI2qey3QAA040OeNqwrmHwEBq7Maxis/ekh/OjiGvmgFmVL2NZ80I8ifdyavpzPGQyUIY+BrilPMae5x832Ozr/tL2YBjXer0MQgVChYRT1cKhI08y2mUhve6B6xb+NsEqGK+5XNteE1QIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://eyqk3w.natappfree.cc/pay/notify_url";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://eyqk3w.natappfree.cc/pay/return_url";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

