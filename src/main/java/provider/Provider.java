package provider;

import framework.URL;
import protocol.http.HttpServer;
import provider.api.HelloService;
import provider.impl.HelloServiceImpl;
import register.Register;

/**
 * Created by Yuk on 2018/12/31.
 */
public class Provider {

    public static void main(String[] args) {

        // 注册服务
        URL url = new URL("localhost",8080);
        Register.regist(url, HelloService.class.getName(), HelloServiceImpl.class);

        // 启动tomcat
        HttpServer httpServer = new HttpServer();
        httpServer.start(url.getHostname(),url.getPort());
    }
}
