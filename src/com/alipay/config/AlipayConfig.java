package com.alipay.config;

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
	public static String app_id = "2016092900626935";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDeH33MhjxuySwl+Ym5WCxQ0QuaOaJFYdj5gNUKCJGba/6tM4BCOWJuJRG4TvOaiuoeqPy0+rRQeqCyvAPlCyDPkNy3fVzZIST4RbRPZ6tN333T7bk5xlQTO6MZEPz6V+SZ3O3Kab/XF+htPBcShtEoR7AFH2He/cvWzDGhGCyUhlckQjrpKRzWHsd4/if/tD1CRhdb5HYfVxuo2jJl3xwGn5v37IGZXIkbI/5KbeSQ18dLtx4t42lVaU79EIMeR2+fikVmbTFscoNYoi1X9o11+qRcze+YP787k2WIHlTOsSUAvwgLjyvHO8fBOkZi6ZqM2B00w6ADw/Bn+aonEH/pAgMBAAECggEAJJ8CiZbUHdvTCIvEticgX06n4AyCgXfpYvFnrljNUNeUTJACJGj7nndEHaP+q8sdYGKyD1CKK/6bwfwXlEqqZS5YBXSIu0+onbo4SSMpbhRb1XYLJMhbEjSx5i8T1l5pVSjEl6upslfBvUi78RUDJOX00lNjOnWTht1xjULEDtRsmOq/eFztsVHC54z51G8TPYKMnqt7TTgbM0p5Iv5/4lp8/r25/iRnp3IGuWaLIMxRzoNpYOza5Z0OQxj3kGiB4sdJDc7TwczwI/VcumNu8q+0SLcp8/tikDZUyMFOQBE47RaxkILRHOJyC07q5B6iIgMr87umw4wvRnNTW4IuFQKBgQD3QlvaEPDL7bwHAQCWCXYnHbggWVDs0SP4qiAC60NvnyhPgEq9LVqEBOE6869FBylK7Nvshnb71lFCPDsFQnescY8ha9LhrpQGFFpk/hrlqfHsDJ5xwQY7+U7SPSMD56pxytI3ONTQNZza1XBKAH0mjR9OdSXJY421a6lD7sTnUwKBgQDl+afR/5yPBjRC6dxR+1a2Aeu2xhwsS302xOCa3fXZ051ROV+97uacuVhwGJ2tgikOxZs/9NiKuOGznhhQK49DikKaD7EvbwDSTWn0eQip5x+DWZrHthINKP1/S0+vi8xGHzZ2AQnI3tiMQrHiuW9EPiUhsvNJS0A7okqHLjCAUwKBgEmrBb7U6Ul5DVpw3AHX09IXsrJAqjHEphkCZwM3oSHyo4n8SUhP6PYIliqATCoe1hiytVulPHIQCqnXVCZfBVTliKWGgJAo+YVOLxiD9POUTLXtlI+D2R2pS+irunEBZvD8YuF9FzrpnlA843XI64C+7yLrGFUGSkRRTV8mFphtAoGBALOHTowwKC664CdwWw8gz1Mscq9vPmUR1UDhNpmPNrKCcSgMSwKBskOcqT5w6P6fQqAGgSjPYhABPiiy/TXwm1lVYKLWJzLpS9Hgnxs7NRk1lTM7ywmmx7bATgyGZUGcN65yBVjffJzz4ka0dhuRORwkC2agRS3tccpb6iRXWYODAoGAOFNhP2E1itoxlo8mJN8LVOlzJGmXWNVPZBPOMRWf0TVIS90nPpE5huGN9RVx1+mWmcxZyjiRvnRzNUQYGqntO/SA0z/jrAjeGTdBIU2KdgizWrib7wdxP1xUL2dXbyVz4Ss9h4tLn3ws8ePmXXRHuHvdAtFo3wEdrHcwDeaKh64=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhYWSDHD4V1lnchDxeCwyoyQg0R0EyML9qjSA0+J0egmSYXObtq3dJnm/NseuN1PQr2oTOaS4zgI/as+iwkPUIWk2bQ7/zF1cXfb1gF0mYC9SnrUkH2k00YNEtBSTrs4LMC9tyCVkMz1F6cCHW1skmO3UNIW7LeXFc9T5/V5iYCnfZBy9d61ztcNplJOzX91e16LDtwRnv/w1o2+TkRrBbP/pX07TF7wiOz/b2mSbN6LiDHbS4TGdIJxZZrYzlBQY4LOLD8/0adiiFAZVitAR2/wr/186B0TQCDWLJFfj+Mm39C3Rr8smOBc4gD+5M7NpSDNKtGmYrKCulrTwTO/umwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp

	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

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

