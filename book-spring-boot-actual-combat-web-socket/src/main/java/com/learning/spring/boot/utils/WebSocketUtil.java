package com.learning.spring.boot.utils;

import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Package: com.learning.spring.boot.utils
 * @ClassName: WebSocketUtil
 * @Author: beibei.huang
 * @Description: web socket 工具类
 * @Date: 2019/6/4 9:34
 */
public class WebSocketUtil {

    /**
     * 简单使用map进行存储在线的session
     *
     */
    private static final Map<String, Session> ONLINE_SESSION = new ConcurrentHashMap<>();

    public static void addSession(String userNick,Session session) {
        //putIfAbsent 添加键—值对的时候，先判断该键值对是否已经存在
        //不存在：新增，并返回null
        //存在：覆盖，直接返回新值
        ONLINE_SESSION.put(userNick, session);
    }

    public static void remoteSession(String userNick) {
        ONLINE_SESSION.remove(userNick);
    }

    /**
     * 向某个用户发送消息
     * @param session 某一用户的session对象
     * @param message
     */
    public static void sendMessage(Session session, String message) {
        if(session == null) {
            return;
        }
        // getAsyncRemote()和getBasicRemote()异步与同步
        RemoteEndpoint.Async async = session.getAsyncRemote();
        //发送消息
        async.sendText(message);
    }

    /**
     * 向所有在线人发送消息
     * @param message
     */
    public static void sendMessageForAll(String message) {
        ONLINE_SESSION.forEach((sessionId, session) -> sendMessage(session, message));
    }

}
