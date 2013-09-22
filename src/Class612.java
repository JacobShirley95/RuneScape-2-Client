
public class Class612 implements Class617 {

   final int anInt_9951;
   final int anInt_9952;


   public boolean method6609(AbstractMouseNode var1, Class233[] var2, int var3, AbstractKeyboardHandler var4, int var5) {
      for(int var6 = 0; var6 < var3 && var6 < var2.length; ++var6) {
         Class233 var7 = var2[var6];
         if(var7 != null && var7.method2971(-16711936) == this.anInt_9951 * 546993851 && var7.method2973(-1980154346) == this.anInt_9952 * -1043526927) {
            return true;
         }
      }

      return false;
   }

   Class612(int var1, int var2) {
      this.anInt_9951 = var1 * -1295229325;
      this.anInt_9952 = var2 * -320166383;
   }

   static final void method6570(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.outlineColour = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 1004702763;
      Class110_Sub1.method3149(var0, -1592070536);
      if(-1001687885 * var0.anInt_2428 == -1 && !var1.aBoolean_2054) {
         Class212_Sub1.method5505(1278853609 * var0.cacheID, 1785090741);
      }

   }

   static final void method6571(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      MapIcon.method6600(var2, 1267520360);
   }

   static final void method6572(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      ObjectDescriptor var3 = Class592.cacheObjectLoader.getObjectDescriptor(var2);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_8466 * 1407986865;
   }

   static final void method6573(RSInterfaceData var0, int var1) {
      long var2 = Class373.getCurrentTime((short)4262);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(var2 / 60000L);
   }

   public static String method6574(int var0, int var1) {
      Class240_Sub5 var2 = (Class240_Sub5)Class524.aNodeArrayList_9273.getNode((long)var0);
      if(var2 != null) {
         Class240_Sub4_Sub1 var3 = var2.aClass254_Sub1_6754.method3328(246284869);
         if(var3 != null) {
            double var4 = var2.aClass254_Sub1_6754.method3331(972312096);
            if((double)var3.method277(-873144726) <= var4 && (double)var3.method281((byte)-28) >= var4) {
               return var3.method278(2036493692);
            }
         }
      }

      return null;
   }

   static final void method6575(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub1_7295.method1399(-47727753)?1:0;
   }

   static final void method6576(byte var0, int var1) {
      byte[][][] var2 = client.aClass296_348.method3758(1836858845);
      if(var2 == null) {
         var2 = new byte[4][client.aClass296_348.getMaxX((byte)-100)][client.aClass296_348.getMaxY(839995941)];
         client.aClass296_348.method3759(var2, -1818731300);
      }

      for(int var3 = 0; var3 < 4; ++var3) {
         for(int var4 = 0; var4 < client.aClass296_348.getMaxX((byte)-3); ++var4) {
            for(int var5 = 0; var5 < client.aClass296_348.getMaxY(1269119916); ++var5) {
               var2[var3][var4][var5] = var0;
            }
         }
      }

   }

   static final void method6577(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub2_7313.method1427(-146104779) == 1?1:0;
   }
}
