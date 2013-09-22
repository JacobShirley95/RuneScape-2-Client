
public class Class577 {

   public int anInt_9665;
   static final Class577 aClass577_9666 = new Class577(13, 0, 1, 0);
   static final Class577 aClass577_9667 = new Class577(2, 4, 4, 0);
   static final Class577 aClass577_9668 = new Class577(4, 1, 1, 1);
   public int anInt_9669;
   public static final Class577 aClass577_9670 = new Class577(1, 2, 2, 0);
   static final Class577 aClass577_9671 = new Class577(8, 0, 4, 1);
   static final Class577 aClass577_9672 = new Class577(9, 0, 4, 1);
   static final Class577 aClass577_9673 = new Class577(14, 0, 4, 1);
   public static final Class577 aClass577_9674 = new Class577(11, 0, 1, 2);
   static final Class577 aClass577_9675 = new Class577(12, 0, 1, 0);
   public static final Class577 aClass577_9676 = new Class577(6, 0, 4, 2);
   public int anInt_9677;
   static final Class577 aClass577_9678 = new Class577(15, 0, 1, 0);
   public static final Class577 aClass577_9679 = new Class577(10, 2, 2, 0);
   public static final Class577 aClass577_9680 = new Class577(0, 2, 2, 1);
   public int anInt_9681;
   public static final Class577 aClass577_9682 = new Class577(7, 0, 1, 1);


   Class577(int var1, int var2, int var3, int var4) {
      this.anInt_9665 = 1936845767 * var1;
      this.anInt_9677 = 257411475 * var2;
      this.anInt_9681 = var3 * 620737633;
      this.anInt_9669 = 1975729613 * var4;
   }

   static final void method6297(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class19.method105(var3, var4, var0, 1237100869);
   }

   static final void method6298(RSInterfaceData var0, byte var1) {
      if(client.anInt_507 * -268988889 >= 2) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.anInt_507 * -268988889;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method6299(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class592.cacheObjectLoader.getObjectDescriptor(var2).anInt_8468 * -199915097;
   }

   static final void method6300(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      ConnectionHandler var3 = Class32.method230(-2115149925);
      Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6249, var3.aClass528_3433, 1917447504);
      var4.aClass240_Sub8_Sub1_7370.putByte(0, -411761467);
      int var5 = var4.aClass240_Sub8_Sub1_7370.index * 964952859;
      var4.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-22);
      var4.aClass240_Sub8_Sub1_7370.method4463(-405493655 * var0.aClass420_9507.anInt_7968, -510314852);
      var0.aClass420_9507.aClass240_Sub22_Sub16_7967.method2676(var4.aClass240_Sub8_Sub1_7370, var0.aClass420_9507.anIntArray_7966, 1137701797);
      var4.aClass240_Sub8_Sub1_7370.method4521(var4.aClass240_Sub8_Sub1_7370.index * 964952859 - var5, -907432342);
      var3.addPacket(var4, 71107735);
   }

   public static void method6301(int var0) {
      RSInterface.spriteCache.method6665((byte)5);
      RSInterface.aClass627_2423.method6665((byte)5);
      RSInterface.aClass627_2412.method6665((byte)5);
      RSInterface.aClass627_2422.method6665((byte)5);
   }

   public static Class516[] method6302(GraphicsDataHolder var0, int var1) {
      int[] var2 = var0.method5950((byte)67);
      Class516[] var3 = new Class516[var2.length >> 2];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Class516 var5 = new Class516();
         var3[var4] = var5;
         var5.anInt_9214 = var2[var4 << 2] * -852277481;
         var5.anInt_9215 = 1886267239 * var2[(var4 << 2) + 1];
         var5.anInt_9213 = 885156979 * var2[2 + (var4 << 2)];
         var5.anInt_9216 = 1837502699 * var2[3 + (var4 << 2)];
      }

      return var3;
   }

   static final void method6303(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(!Class286.gameRenderer.method1963()) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 3;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub27_7315.method6082(var2, 566080008);
      }

   }

   static final void method6304(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.aByte_1283;
   }

   static final void method6305(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class46.method440(var3, var0, 1487210935);
   }

   static void sortWorlds(int startIndex, int var1, int var2, boolean var3, int var4, boolean var5, byte var6) {
      if(startIndex < var1) {
         int var7 = (startIndex + var1) / 2;
         int var8 = startIndex;
         RSWorld var9 = Class503.rsWorldList[var7];
         Class503.rsWorldList[var7] = Class503.rsWorldList[var1];
         Class503.rsWorldList[var1] = var9;

         for(int var10 = startIndex; var10 < var1; ++var10) {
            if(Class82.compareWorld(Class503.rsWorldList[var10], var9, var2, var3, var4, var5, 1880989142) <= 0) {
               RSWorld var11 = Class503.rsWorldList[var10];
               Class503.rsWorldList[var10] = Class503.rsWorldList[var8];
               Class503.rsWorldList[var8++] = var11;
            }
         }

         Class503.rsWorldList[var1] = Class503.rsWorldList[var8];
         Class503.rsWorldList[var8] = var9;
         sortWorlds(startIndex, var8 - 1, var2, var3, var4, var5, (byte)0);
         sortWorlds(var8 + 1, var1, var2, var3, var4, var5, (byte)0);
      }

   }
}
