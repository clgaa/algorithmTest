package javates;

import java.net.InetSocketAddress;

import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class minaservice {
    
    private static final int PORT=5469;
    
    public static void main(String[] args) throws Exception{
      IoAcceptor acceptor=new NioSocketAcceptor();
      IoFilter filter=new ProtocolCodecFilter(new TextLineCodecFactory());
      acceptor.getFilterChain().addLast("vestigge", filter);
      acceptor.setHandler(new ServerHandler());
      acceptor.bind(new InetSocketAddress(PORT));
      
      System.out.println( "服务器正在监听端口" + PORT +"...");
    }

}
