
public class Class484 {

   public static final int anInt_8965 = 1700;
   public static final int anInt_8966 = 125000;


   Class484() throws Throwable {
      throw new Error();
   }

   static final void method5724(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      int var3 = var2 >> 14 & 16383;
      int var4 = var2 & 16383;
      MapPoint var5 = client.aClass296_348.getMapArea();
      var3 -= 1265321541 * var5.loadedMapX;
      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= client.aClass296_348.getMaxX((byte)-41)) {
         var3 = client.aClass296_348.getMaxX((byte)-108);
      }

      var4 -= -1996781083 * var5.loadedMapY;
      if(var4 < 0) {
         var4 = 0;
      } else if(var4 >= client.aClass296_348.getMaxY(453253926)) {
         var4 = client.aClass296_348.getMaxY(1792873165);
      }

      client.anInt_385 = ((var3 << 9) + 256) * 1266622599;
      client.anInt_534 = 388366099 * ((var4 << 9) + 256);
      Class509.anInt_9182 = 1906884524;
      Class102.anInt_1968 = -1061791373;
      Class571.anInt_9652 = -1694464327;
   }

   public static void method5725(int var0) {
      if(Class15.aClass316_133 != null) {
         Class15.aClass316_133.method3911();
      }

      if(null != Class306.aClass316_6036) {
         Class306.aClass316_6036.method3911();
      }

   }

   static final void method5726(RSInterfaceData var0, int var1) {
      if(client.aByteArray_595 != null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static void method5727(int var0, int var1, int var2, int var3) {
      if(var0 == 1008) {
         Class203.method2587(Class434.aClass434_8357, var1, var2, 1587357292);
      } else if(var0 == 1009) {
         Class203.method2587(Class434.aClass434_8354, var1, var2, 395184752);
      } else if(1010 == var0) {
         Class203.method2587(Class434.aClass434_8348, var1, var2, -1337318443);
      } else if(1011 == var0) {
         Class203.method2587(Class434.aClass434_8346, var1, var2, -1423084365);
      } else if(var0 == 1012) {
         Class203.method2587(Class434.aClass434_8350, var1, var2, -106925677);
      }

   }
}
