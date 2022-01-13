package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;     // 자기 자신을 객체로 가지고 있어야 한다.

    private SocketClient() {                             // 생성자를 생성할 수 없도록 기본 생성자를 프라이빗으로 막아야한다.

    }

    public static SocketClient getInstance() {           // static 메소드를 통해서 get 인스턴스라는 메소드를 제공해야 한다.

        if(socketClient == null) {                       // 자신의 객체가 null 인 경우에는 생성을 해준다.
            socketClient = new SocketClient();
        }
        return socketClient;
    }

}
