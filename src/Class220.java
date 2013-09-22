import java.applet.Applet;

public class Class220 {

   static final int anInt_3777 = 3;
   static Applet anApplet_3778 = null;
   static final int anInt_3779 = 0;
   public static final int anInt_3780 = 1;
   static String aString_3781 = null;
   static final int anInt_3782 = 2;


   Class220() throws Throwable {
      throw new Error();
   }

   static final void method2764(boolean var0, RSInterfaceData var1, int var2) {
      int var3 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      RSInterface var4 = RSServerQueue.getInterface(var3, (byte)105);
      RSInterfaceGroup var5 = RSInterface.interfaceGroups[var3 >> 16];
      if(var0) {
         Class420.method5235(var5, var4, (byte)21);
      } else {
         Class84.method1096(var5, var4, 959884402);
      }

   }

   static final void method2765(RSInterfaceData var0, int var1) {
      if(Class223.captureKeyboardList.method3208(86, 1953407658)) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method2766(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var2 >= 1) {
         ;
      }

      Class522.method5974(var2, -1, -1, false, -837356144);
   }

   static final void method2767(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class552 var3;
      if(var0.aBoolean_9522) {
         var3 = var0.aClass552_9506;
      } else {
         var3 = var0.aClass552_9492;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.method6121(var0.animeTarget.headInterfaces, var2, -1, -432010064)?1:0;
   }

   static final void method2768(RSInterfaceData var0, int var1) {
      Class240_Sub12 var2 = ClientSuper.method2894(-882247514);
      if(null == var2) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 781228131 * var2.anInt_6801;
         int var3 = 196197751 * var2.anInt_6804 << 28 | Class248.anInt_4120 + -1889789653 * var2.anInt_6802 << 14 | Class248.anInt_4124 + var2.anInt_6803 * -526841819;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3;
      }

   }

   public static boolean method2769(byte var0) {
      return 1919337139 * Class134.anInt_2617 != 0?true:Class134.aClass240_Sub41_Sub2_2616.method450(1146453189);
   }

   static int method2770(byte[][] var0, byte[][] var1, int[] var2, byte[] var3, int[] var4, int var5, int var6, int var7) {
      int var8 = var2[var5];
      int var9 = var4[var5] + var8;
      int var10 = var2[var6];
      int var11 = var4[var6] + var10;
      int var12 = var8;
      if(var10 > var8) {
         var12 = var10;
      }

      int var13 = var9;
      if(var11 < var9) {
         var13 = var11;
      }

      int var14 = var3[var5] & 255;
      if((var3[var6] & 255) < var14) {
         var14 = var3[var6] & 255;
      }

      byte[] var15 = var1[var5];
      byte[] var16 = var0[var6];
      int var17 = var12 - var8;
      int var18 = var12 - var10;

      for(int var19 = var12; var19 < var13; ++var19) {
         int var20 = var15[var17++] + var16[var18++];
         if(var20 < var14) {
            var14 = var20;
         }
      }

      return -var14;
   }

   static void method2771(int var0, int var1) {
      CacheNodeArrayList var2 = Class4.aClass627_29;
      synchronized(Class4.aClass627_29) {
         Class4.aClass627_29.method6677(var0, -2009197947);
      }
   }

   static final void method2772(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 2142383934) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2530 = Class133.extractInterfaceData(var4, var2, (byte)4);
      var0.aBoolean_2524 = true;
   }
}
