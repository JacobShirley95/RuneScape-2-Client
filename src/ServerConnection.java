import java.io.IOException;
import java.net.Socket;

public class ServerConnection extends AbstractServerConnection {

   ServerInputStream serverInputStream;
   ServerOutputStream serverOutputStream;
   Socket serverConnectionSock;


   public boolean method3065(int var1, int var2) throws IOException {
      return this.serverInputStream.method3298(var1, (byte)1);
   }

   public int method3066(byte var1) throws IOException {
      return this.serverInputStream.method3301(-783080926);
   }

   public int method3064(byte[] var1, int var2, int var3, short var4) throws IOException {
      return this.serverInputStream.method3299(var1, var2, var3, -1566638362);
   }

   public void method3067(byte var1) {
      this.serverOutputStream.method3130(2103762180);

      try {
         this.serverConnectionSock.close();
      } catch (IOException var3) {
         ;
      }

      this.serverInputStream.method3302(-1176582906);
   }

   public void close() {
      this.serverInputStream.method3300(-664014114);
      this.serverOutputStream.method3133(-635170600);
   }

   public void finalize() {
      this.method3067((byte)16);
   }

   ServerConnection(Socket var1, int var2) throws IOException {
      this.serverConnectionSock = var1;
      this.serverConnectionSock.setSoTimeout(30000);
      this.serverConnectionSock.setTcpNoDelay(true);
      this.serverInputStream = new ServerInputStream(this.serverConnectionSock.getInputStream(), var2);
      this.serverOutputStream = new ServerOutputStream(this.serverConnectionSock.getOutputStream(), var2);
   }

   public void method3068(byte[] var1, int var2, int var3, byte var4) throws IOException {
      this.serverOutputStream.method3132(var1, var2, var3, -1774503131);
   }

   static final void method4358(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypeIndex -= 1509652522;
      byte[] var4 = null;
      byte[] var5 = null;

      int var6;
      for(var6 = 0; var6 < 10 && var0.intTypes[var0.intTypeIndex * -831324111 + var6] >= 0; var6 += 2) {
         ;
      }

      if(var6 > 0) {
         var4 = new byte[var6 / 2];
         var5 = new byte[var6 / 2];

         for(var6 -= 2; var6 >= 0; var6 -= 2) {
            var4[var6 / 2] = (byte)var0.intTypes[var6 + -831324111 * var0.intTypeIndex];
            var5[var6 / 2] = (byte)var0.intTypes[1 + var6 + var0.intTypeIndex * -831324111];
         }
      }

      Class1024_Sub3.method7587(var3, var4, var5, var0, 1143114502);
   }
}
