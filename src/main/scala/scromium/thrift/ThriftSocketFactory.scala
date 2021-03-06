package scromium.thrift

import org.apache.thrift.transport.{TSocket, TTransportException}
import java.net.InetAddress
import java.net.Socket

class ThriftSocketFactory {
  @throws(classOf[TTransportException])
  def make(host : String, port : Int) : TSocket = {
    val addy = InetAddress.getByName(host)
    val socket = new Socket(addy, port)
    new TSocket(socket)
  }
}
