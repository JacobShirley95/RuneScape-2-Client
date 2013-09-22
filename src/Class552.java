import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class552 {

   RSInterfaceGroup aClass112_9523;
   RSInterface aClass132_9524;


   void method6120(int var1) {
      this.aClass112_9523 = null;
      this.aClass132_9524 = null;
   }

   boolean method6121(RSInterfaceGroup var1, int var2, int var3, int var4) {
      if(null != var1) {
         RSInterface var5 = var1.getChildInterface(var2, -1967432466);
         if(null != var5) {
            this.aClass112_9523 = var1;
            this.aClass132_9524 = var5;
            return true;
         }
      }

      this.method6120(-1895531906);
      return false;
   }

   boolean method6122(int var1, int var2, int var3) {
      RSInterface var4 = DrawingTarget.method2201(var1, var2, (byte)113);
      if(null != var4) {
         this.aClass112_9523 = RSInterface.interfaceGroups[var1 >> 16];
         this.aClass132_9524 = var4;
         return true;
      } else {
         this.method6120(-901773783);
         return false;
      }
   }

   RSInterface method6123(byte var1) {
      return this.aClass112_9523.getChildInterface(this.aClass132_9524.cacheID * 1278853609, 670363829);
   }

   static void method6124(byte var0) {
      Class293.method3722(-685096519);
   }

   static final void method6125(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class83.method1092(var3, var4, var0, (byte)4);
   }

   public static long method6126(byte var0) {
      try {
         URL var1 = new URL(Class195.method2530("services", false, (byte)0) + "m=accountappeal/login.ws");
         URLConnection var2 = var1.openConnection();
         var2.setRequestProperty("connection", "close");
         var2.setDoInput(true);
         var2.setDoOutput(true);
         var2.setConnectTimeout(5000);
         OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
         var3.write("data1=req");
         var3.flush();
         InputStream var4 = var2.getInputStream();
         ByteArrayDataNode var5 = new ByteArrayDataNode(new byte[1000]);

         do {
            int var6 = var4.read(var5.data, 964952859 * var5.index, 1000 - 964952859 * var5.index);
            if(-1 == var6) {
               var5.index = 0;
               long var7 = var5.method4538(1385013726);
               return var7;
            }

            var5.index += -2043502829 * var6;
         } while(964952859 * var5.index < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }
}
