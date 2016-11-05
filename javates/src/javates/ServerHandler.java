package javates;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ServerHandler extends IoHandlerAdapter{
    @Override
    public void messageReceived(IoSession session, Object message)
        throws Exception {
      System.out.println("收到客户端消息：" + message.toString());
    }
    
    @Override
    public void exceptionCaught(IoSession session, Throwable cause)
        throws Exception {
      System.out.println("服务器出现异常：" +cause);
    }
}
