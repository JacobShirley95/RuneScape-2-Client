import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ConnectionDesc {

   public String hostIP;
   public int id;
   public int index = -2066411186;
   public int anInt_8747 = -500632311;
   boolean aBoolean_8748 = true;
   boolean aBoolean_8749 = false;


   public void method5689(int var1) {
      if(!this.aBoolean_8748) {
         this.aBoolean_8748 = true;
         this.aBoolean_8749 = true;
      } else if(this.aBoolean_8749) {
         this.aBoolean_8749 = false;
      } else {
         this.aBoolean_8748 = false;
      }

   }

   public Socket createSocketConnection(int var1) throws IOException {
      return !this.aBoolean_8749?new Socket(InetAddress.getByName(this.hostIP), this.aBoolean_8748?this.anInt_8747 * -435137117:1475584339 * this.index):Class604.createProxyConnection(this.hostIP, this.aBoolean_8748?this.anInt_8747 * -435137117:this.index * 1475584339, (short)-15094).openSocket(-2138548512);
   }

   public boolean method5691(ConnectionDesc var1, int var2) {
      return var1 == null?false:var1.id * -1543224839 == -1543224839 * this.id && this.hostIP.equals(var1.hostIP);
   }

   static final void method5692(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      int var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSFont var4 = Class410.method5063(Class5.aCacheUnpacker_31, var3, 0, -59669222);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4.getStringWidth(var2, Class481.nameIconsSprites, -235466263);
   }

   public static void method5693(CacheDataUnpacker var0, short var1) {
      Class401.aCacheUnpacker_7623 = var0;
   }
}
