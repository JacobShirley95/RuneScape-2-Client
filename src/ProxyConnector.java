import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;

public class ProxyConnector extends Class469 {

   final ProxySelector aProxySelector_1738 = ProxySelector.getDefault();
   static final String aString_1739 = "java.net.useSystemProxies";


   public Socket openSocket(int var1) throws IOException {
      boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
      if(!var2) {
         System.setProperty("java.net.useSystemProxies", "true");
      }

      boolean var3 = 443 == 1196365031 * this.anInt_8692;

      List var4;
      List var5;
      try {
         var4 = this.aProxySelector_1738.select(new URI((var3?"https":"http") + "://" + this.proxyHost));
         var5 = this.aProxySelector_1738.select(new URI((var3?"http":"https") + "://" + this.proxyHost));
      } catch (URISyntaxException var15) {
         return this.method5641((byte)66);
      }

      var4.addAll(var5);
      Object[] var6 = var4.toArray();
      IOException_Sub1 var7 = null;
      Object[] var8 = var6;

      for(int var9 = 0; var9 < var8.length; ++var9) {
         Object var10 = var8[var9];
         Proxy var11 = (Proxy)var10;

         try {
            Socket var12 = this.connectToProxy(var11, 531652737);
            if(null != var12) {
               return var12;
            }
         } catch (IOException_Sub1 var13) {
            var7 = var13;
         } catch (IOException var14) {
            ;
         }
      }

      if(var7 != null) {
         throw var7;
      } else {
         return this.method5641((byte)18);
      }
   }

   Socket connectToProxy(Proxy var1, int var2) throws IOException {
      if(var1.type() == Type.DIRECT) {
         return this.method5641((byte)29);
      } else {
         SocketAddress var3 = var1.address();
         if(!(var3 instanceof InetSocketAddress)) {
            return null;
         } else {
            InetSocketAddress var4 = (InetSocketAddress)var3;
            if(var1.type() == Type.HTTP) {
               String var15 = null;

               try {
                  Class var6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                  Method var7 = var6.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                  var7.setAccessible(true);
                  Object var8 = var7.invoke((Object)null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                  if(var8 != null) {
                     Method var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                     var9.setAccessible(true);
                     if(((Boolean)var9.invoke(var8, new Object[0])).booleanValue()) {
                        Method var10 = var6.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        Method var11 = var6.getDeclaredMethod("getHeaderValue", new Class[]{URL.class, String.class});
                        var11.setAccessible(true);
                        String var12 = (String)var10.invoke(var8, new Object[0]);
                        String var13 = (String)var11.invoke(var8, new Object[]{new URL("https://" + this.proxyHost + "/"), "https"});
                        var15 = var12 + ": " + var13;
                     }
                  }
               } catch (Exception var14) {
                  ;
               }

               return this.method1123(var4.getHostName(), var4.getPort(), var15, -77709271);
            } else if(var1.type() == Type.SOCKS) {
               Socket var5 = new Socket(var1);
               var5.connect(new InetSocketAddress(this.proxyHost, this.anInt_8692 * 1196365031));
               return var5;
            } else {
               return null;
            }
         }
      }
   }

   Socket method1123(String var1, int var2, String var3, int var4) throws IOException {
      Socket var5 = new Socket(var1, var2);
      var5.setSoTimeout(10000);
      OutputStream var6 = var5.getOutputStream();
      if(var3 == null) {
         var6.write(("CONNECT " + this.proxyHost + ":" + 1196365031 * this.anInt_8692 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
      } else {
         var6.write(("CONNECT " + this.proxyHost + ":" + this.anInt_8692 * 1196365031 + " HTTP/1.0\n" + var3 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
      }

      var6.flush();
      BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
      String var8 = var7.readLine();
      if(var8 != null) {
         if(var8.startsWith("HTTP/1.0 200") || var8.startsWith("HTTP/1.1 200")) {
            return var5;
         }

         if(var8.startsWith("HTTP/1.0 407") || var8.startsWith("HTTP/1.1 407")) {
            int var9 = 0;
            String var10 = "proxy-authenticate: ";

            for(var8 = var7.readLine(); var8 != null && var9 < 50; ++var9) {
               if(var8.toLowerCase().startsWith(var10)) {
                  var8 = var8.substring(var10.length()).trim();
                  int var11 = var8.indexOf(32);
                  if(var11 != -1) {
                     var8 = var8.substring(0, var11);
                  }

                  throw new IOException_Sub1(var8);
               }

               var8 = var7.readLine();
            }

            throw new IOException_Sub1("");
         }
      }

      var6.close();
      var7.close();
      var5.close();
      return null;
   }

}
