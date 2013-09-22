
public class Class599 {

   public Class617 aClass617_9879;
   public static LanguagePack clientLanguage;


   void method6479(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(175394458);
         if(var3 == 0) {
            return;
         }

         if(var3 == 1) {
            this.aClass617_9879 = Class126.method1627(var1, -2023706582);
         }
      }
   }

   public Class599(CacheDataUnpacker var1) {
      byte[] var2 = var1.method3566(631638583 * Class590.aClass590_9790.anInt_9792, 1188624001);
      this.method6479(new ByteArrayDataNode(var2), 93730111);
   }

   static final void method6480(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var2.intTypeIndex -= 46798054;
      var0.anInt_2473 = 784851403 * var2.intTypes[var2.intTypeIndex * -831324111];
      var0.anInt_2569 = var2.intTypes[1 + var2.intTypeIndex * -831324111] * -1954457177;
      var0.anInt_2475 = var2.intTypes[2 + var2.intTypeIndex * -831324111] * 1705762077;
      var0.anInt_2476 = var2.intTypes[3 + -831324111 * var2.intTypeIndex] * 180492143;
      var0.anInt_2522 = -1572453013 * var2.intTypes[4 + -831324111 * var2.intTypeIndex];
      var0.anInt_2486 = var2.intTypes[-831324111 * var2.intTypeIndex + 5] * 1009220237;
      Class110_Sub1.method3149(var0, 132370085);
      if(-1 == -1001687885 * var0.anInt_2428 && !var1.aBoolean_2054) {
         Class240_Sub22_Sub17.method5456(var0.cacheID * 1278853609, 394994397);
         ConnectionUpdate.method81(var0.cacheID * 1278853609, (byte)-4);
      }

   }

   static final void method6481(RSInterface var0, RSInterfaceData var1, int var2) {
      byte var3 = 10;
      RSServerQueue.method6200(var0, var3, var1, (byte)2);
   }

   static final void method6482(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub10_7292.method6082(var2, 677248621);
   }

   static final void method6483(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      int var3 = client.aClass301Array_286[var2].method3816(-383664882);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3 == 5?1:0;
   }

   public static void method6484(String var0, boolean var1, Renderer var2, FontRenderer var3, RSFont var4, int var5) {
      boolean var6 = !Class240_Sub1.aBoolean_6505 || Class255.method3349((short)16383);
      if(var6) {
         int var7;
         int var8;
         int var10;
         int var11;
         if(Class240_Sub1.aBoolean_6505 && var6) {
            var4 = Class207.aRSFont_3603;
            var3 = var2.method1935(var4, Class1.aClass106_Sub2Array_15, true);
            var7 = var4.method5560(var0, 250, (TextObjects[])null, 475708878);
            var8 = var4.method5561(var0, 250, -63684197 * var4.fontHeight, (TextObjects[])null, (byte)3);
            int var14 = Class87.aClass106_1770.getWidth();
            var10 = 4 + var14;
            var7 += var10 * 2;
            var8 += var10 * 2;
            if(var7 < -1505043941 * Class206.anInt_3560) {
               var7 = -1505043941 * Class206.anInt_3560;
            }

            if(var8 < -1362132725 * Class206.anInt_3561) {
               var8 = -1362132725 * Class206.anInt_3561;
            }

            var11 = Class206.aClass419_3562.method5215(var7, client.anInt_343 * 688709465, (byte)-70) + Class206.anInt_3559 * 1700917099;
            int var12 = Class206.aClass412_3558.method5106(var8, client.anInt_435 * 759607001, -36601981) + Class634.anInt_10097 * -1533257581;
            var2.loadSprite(Class206.aClass106_3557, false).method2147(var11 + Class481.aClass106_8763.getWidth(), var12 + Class481.aClass106_8763.getHeight(), var7 - Class481.aClass106_8763.getWidth() * 2, var8 - Class481.aClass106_8763.getHeight() * 2, 1, -1, 0);
            var2.loadSprite(Class481.aClass106_8763, true).drawAt(var11, var12);
            Class481.aClass106_8763.method1378();
            var2.loadSprite(Class481.aClass106_8763, true).drawAt(var11 + var7 - var14, var12);
            Class481.aClass106_8763.method1381();
            var2.loadSprite(Class481.aClass106_8763, true).drawAt(var11 + var7 - var14, var12 + var8 - var14);
            Class481.aClass106_8763.method1378();
            var2.loadSprite(Class481.aClass106_8763, true).drawAt(var11, var12 + var8 - var14);
            Class481.aClass106_8763.method1381();
            var2.loadSprite(Class87.aClass106_1770, true).method2131(var11, var12 + Class481.aClass106_8763.getHeight(), var14, var8 - Class481.aClass106_8763.getHeight() * 2);
            Class87.aClass106_1770.method1374();
            var2.loadSprite(Class87.aClass106_1770, true).method2131(var11 + Class481.aClass106_8763.getWidth(), var12, var7 - Class481.aClass106_8763.getWidth() * 2, var14);
            Class87.aClass106_1770.method1374();
            var2.loadSprite(Class87.aClass106_1770, true).method2131(var7 + var11 - var14, var12 + Class481.aClass106_8763.getHeight(), var14, var8 - Class481.aClass106_8763.getHeight() * 2);
            Class87.aClass106_1770.method1374();
            var2.loadSprite(Class87.aClass106_1770, true).method2131(var11 + Class481.aClass106_8763.getWidth(), var12 + var8 - var14, var7 - Class481.aClass106_8763.getWidth() * 2, var14);
            Class87.aClass106_1770.method1374();
            var3.method1078(var0, var10 + var11, var10 + var12, var7 - 2 * var10, var8 - var10 * 2, 509208891 * Class504.anInt_9118 | -16777216, -1, 1, 1, 0, (Sprite[])null, (int[])null, (Class1024)null, 0, 0, 1210070174);
            Class172.method2175(var11, var12, var7, var8, (byte)-121);
         } else {
            var7 = var4.method5560(var0, 250, (TextObjects[])null, 475708878);
            var8 = var4.method5555(var0, 250, (TextObjects[])null, (byte)117) * 13;
            byte var9 = 4;
            var10 = 6 + var9;
            var11 = var9 + 6;
            var2.drawOutline(var10 - var9, var11 - var9, var7 + var9 + var9, var9 + var8 + var9, -16777216, 0);
            var2.method1920(var10 - var9, var11 - var9, var9 + var9 + var7, var9 + var9 + var8, -1, 0);
            var3.method1078(var0, var10, var11, var7, var8, -1, -1, 1, 1, 0, (Sprite[])null, (int[])null, (Class1024)null, 0, 0, 441950879);
            Class172.method2175(var10 - var9, var11 - var9, var9 + var7 + var9, var9 + var8 + var9, (byte)-33);
         }

         if(var1) {
            try {
               var2.method1933();
               var2.method1885((byte)-93);
            } catch (Exception_Sub7 var13) {
               ;
            }
         }

      }
   }

   static void method6485(int var0, boolean var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(23, (long)var0);
      var3.method596((byte)71);
      var3.anInt_1175 = 134353971 * (var1?1:0);
   }

   static void method6486(short var0) {
      Class248_Sub1.aNodeArrayList_6444.method5938(1970190707);
      Class248_Sub1.aNodeArrayList_6457.method5938(984643251);
   }
}
