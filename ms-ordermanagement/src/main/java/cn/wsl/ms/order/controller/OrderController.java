package cn.wsl.ms.order.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/query")
public class OrderController {

    @RequestMapping("/get/{orderId}")
    public String get(@PathVariable(value = "orderId") String orderId) {
        return orderId;
    }

}
