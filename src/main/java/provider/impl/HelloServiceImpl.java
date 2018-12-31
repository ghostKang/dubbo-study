package provider.impl;

import provider.api.HelloService;

/**
 * Created by Yuk on 2018/12/
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello(String username) {
        System.out.println("hello");
        return "Hello:"+username;
    }
}
