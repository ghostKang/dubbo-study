package consumer;

import framework.Invocation;
import framework.ProxyFactory;
import protocol.http.HttpClient;
import provider.api.HelloService;

/**
 * Created by Yuk on 2018/12/31.
 */
public class consumer {

    public static void main(String[] args) {

        // 此处模拟spring容器
        HelloService service = ProxyFactory.getProxy(HelloService.class);
        String result = service.sayHello("yukang");
        System.out.println(result);

    }
}
