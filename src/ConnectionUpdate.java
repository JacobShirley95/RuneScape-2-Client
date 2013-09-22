import jaclib.ping.Ping;
import java.awt.Frame;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ConnectionUpdate implements Runnable {

   volatile long ping = 6098102584113017005L;
   InetAddress anInetAddress_116;
   String aString_117;
   volatile boolean stopFlag = true;
   static CacheDataUnpacker aCacheUnpacker_119;
   public static Frame clientFrame;


   void init(String var1, short var2) {
      this.aString_117 = var1;
      this.anInetAddress_116 = null;
      this.ping = 6098102584113017005L;
      if(null != this.aString_117) {
         try {
            this.anInetAddress_116 = InetAddress.getByName(this.aString_117);
         } catch (UnknownHostException var4) {
            ;
         }
      }

   }

   long getPing() {
      return -7366844796970873637L * this.ping;
   }

   public void run() {
      while(this.stopFlag) {
         this.checkConnection();
      }

   }

   void checkConnection() {
      if(this.anInetAddress_116 != null) {
         try {
            byte[] var2 = this.anInetAddress_116.getAddress();
            this.ping = (long)Ping.ping(var2[0], var2[1], var2[2], var2[3], 10000L) * -6098102584113017005L;
         } catch (Throwable var3) {
            ;
         }
      }

      RSInterface.method1724(1000L);
   }

   void stop() {
      this.stopFlag = false;
   }

   static void method79(String var0, byte var1) {
      Class500.aClass522_9086 = Class522.aClass522_9255;
      IllegalArgumentException_Sub1.aString_3234 = var0;
   }

   static final void method80(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class268.method3532(var2, false, -2127813107);
   }

   public static void method81(int var0, byte var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(10, (long)var0);
      var2.method597((byte)0);
   }
}
