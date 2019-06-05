package com.learning.spring.boot.controler;

import com.learning.spring.boot.utils.WebSocketUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * @Package: com.learning.spring.boot.controler
 * @ClassName: WebSocketController
 * @Author: beibei.huang
 * @Description: web socket 服务端点
 * @Date: 2019/6/4 9:31
 */
@Component
@Slf4j
@ServerEndpoint(value = "/websocket/chat/{username}")
public class WebSocketController {

    /**
     * 连接事件 加入注解
     * @param session
     */
    @OnOpen
    public void onOpen(@PathParam(value = "username") String username, Session session) {
        String message = "有新游客[" + username + "]加入聊天室!";
        log.info(message);
        WebSocketUtil.addSession(username, session);
        //此时可向所有的在线通知 某某某登录了聊天室
        WebSocketUtil.sendMessageForAll(message);
    }

    @OnClose
    public void onClose(@PathParam(value = "username") String username,Session session) {
        String message = "游客[" + username + "]退出聊天室!";
        log.info(message);
        WebSocketUtil.remoteSession(username);
        //此时可向所有的在线通知 某某某退出了聊天室
        WebSocketUtil.sendMessageForAll(message);
    }

    @OnMessage
    public void OnMessage(@PathParam(value = "username") String username, String message) {
        //类似群发
        String info = "游客[" + username + "]：" + message;
        log.info(info);
        WebSocketUtil.sendMessageForAll(message);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        log.error("异常:", throwable);
        try {
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throwable.printStackTrace();
    }

}
