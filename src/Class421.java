import java.util.Date;

public class Class421 {

   public static final int anInt_7976 = 15;
   public static final int anInt_7977 = 12;
   public static final int anInt_7978 = 36;
   public static final int anInt_7979 = 26;
   public static final int anInt_7980 = 2;
   public static final int anInt_7981 = 34;
   public static final int anInt_7982 = 8;
   public static final int anInt_7983 = 7;
   public static final int anInt_7984 = 6;
   public static final int anInt_7985 = 14;
   public static final int anInt_7986 = 28;
   public static final int anInt_7987 = 9;
   public static final int anInt_7988 = 21;
   public static final int anInt_7989 = 1;
   public static final int anInt_7990 = 18;
   public static final int anInt_7991 = 27;
   public static final int anInt_7992 = 29;
   public static final int anInt_7993 = 38;
   public static final int anInt_7994 = 20;
   public static final int anInt_7995 = 3;
   public static final int anInt_7996 = 4;
   public static final int anInt_7997 = 32;
   public static final int anInt_7998 = 22;
   public static final int anInt_7999 = 35;
   public static final int anInt_8000 = 37;
   public static final int anInt_8001 = 5;
   public static final int anInt_8002 = 30;
   public static final int anInt_8003 = 16;
   public static final int anInt_8004 = 11;
   public static final int anInt_8005 = 23;
   public static final int anInt_8006 = 13;
   public static final int anInt_8007 = 24;
   public static final int anInt_8008 = 31;
   public static final int anInt_8009 = 10;
   public static final int anInt_8010 = 25;
   public static final int anInt_8011 = 17;
   public static final int anInt_8012 = 33;


   Class421() throws Throwable {
      throw new Error();
   }

   static final void method5263(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1532220411) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2541 = Class133.extractInterfaceData(var4, var2, (byte)10);
      var0.aBoolean_2524 = true;
   }

   static final void method5264(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class35.method275(var3, var0, 1546393031);
   }

   static final void method5265(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub14_7322, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 1903378314);
      Class83.method1089(-1127614331);
      client.aBoolean_568 = false;
   }

   static void method5266(long var0) {
      Class461.aCalendar_8602.setTime(new Date(var0));
   }

   static int[] method5267(OptionListNode var0, byte var1) {
      int[] var2 = null;
      if(Class240_Sub41_Sub1.method431(var0.action * -533194375, (byte)-13)) {
         var2 = Class592.cacheObjectLoader.getObjectDescriptor((int)(var0.target * -4549875760079461447L)).anIntArray_8481;
      } else if(-969456527 * var0.anInt_950 != -1) {
         var2 = Class592.cacheObjectLoader.getObjectDescriptor(var0.anInt_950 * -969456527).anIntArray_8481;
      } else if(Class75.method886(-533194375 * var0.action, (byte)-22)) {
         Class240_Sub9 var3 = (Class240_Sub9)client.npcNodeList.getNode((long)((int)(var0.target * -4549875760079461447L)));
         if(var3 != null) {
            NPC var4 = (NPC)var3.anObject_6783;
            NPCComposite var5 = var4.npcComposite;
            if(var5.anIntArray_8642 != null) {
               var5 = var5.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-13);
            }

            if(null != var5) {
               var2 = var5.anIntArray_8667;
            }
         }
      } else if(Class481.method5709(var0.action * -533194375, -519755284)) {
         Class534 var6 = client.aClass296_348.method3755(1913969094).method6015((int)(var0.target * -4549875760079461447L >>> 32 & 2147483647L), (byte)1);
         if(null != var6.anIntArray_9415) {
            var6 = var6.method6048(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, 1162979012);
         }

         if(var6 != null) {
            var2 = var6.anIntArray_9387;
         }
      }

      return var2;
   }

   static void method5268(int var0) {
      Class66_Sub2 var1 = (Class66_Sub2)Class22.aClass43_Sub1_198.method398(1951854427);
      Class508_Sub1 var2 = (Class508_Sub1)Class22.aClass43_Sub1_198.method397((byte)-109);
      GameCoord var3 = var1.method667(1418583792);
      Class342 var4 = var2.method5905((byte)89);
      if(null != client.aClass132_476) {
         int var5 = -533669195 * client.aClass132_476.width;
         int var6 = 1833812087 * client.aClass132_476.height;
         float var7 = 1000.0F;
         float var8 = (float)(2.0D * Math.atan((double)((float)var5 / 2.0F / var7)));
         float var9 = (float)(2.0D * Math.atan((double)((float)var6 / 2.0F / var7)));

         try {
            Class22.aClass43_Sub1_198.method361(var8, var9, (byte)-26);
         } catch (Exception_Sub1 var11) {
            ;
         }
      }

      if(Class53.captureMouseList.method3106(138328107)) {
         Class342 var12 = Class342.method4218();
         var12.method4242(1.0F, 0.0F, 0.0F, (float)(Class53.captureMouseList.getCaptureMouseY() - 980202957 * Class38.anInt_858) / 200.0F);
         var4.method4231(var12);
         GameCoord var15 = GameCoord.createCoord(0.0F, 1.0F, 0.0F);
         var15.method4328(var4);
         Class342 var16 = Class342.method4218();
         var16.method4225(var15, (float)(Class22.anInt_200 * -1844553781 - Class53.captureMouseList.getCaptureMouseX()) / 200.0F);
         var4.method4231(var16);
         var2.method1441(var4, (byte)93);
      }

      Class22.anInt_200 = Class53.captureMouseList.getCaptureMouseX() * 1890424291;
      Class38.anInt_858 = Class53.captureMouseList.getCaptureMouseY() * 615464709;
      var4.method4222();
      GameCoord var13;
      if(Class223.captureKeyboardList.method3208(98, 1953407658)) {
         var13 = GameCoord.createCoord(0.0F, 0.0F, 25.0F);
         var13.method4328(var4);
         var13.floatY *= -1.0F;
         var3.method4314(var13);
      }

      if(Class223.captureKeyboardList.method3208(99, 1953407658)) {
         var13 = GameCoord.createCoord(0.0F, 0.0F, -25.0F);
         var13.method4328(var4);
         var13.floatY *= -1.0F;
         var3.method4314(var13);
      }

      if(Class223.captureKeyboardList.method3208(96, 1953407658)) {
         var13 = GameCoord.createCoord(-25.0F, 0.0F, 0.0F);
         var13.method4328(var4);
         var13.floatY *= -1.0F;
         var3.method4314(var13);
      }

      if(Class223.captureKeyboardList.method3208(97, 1953407658)) {
         var13 = GameCoord.createCoord(25.0F, 0.0F, 0.0F);
         var13.method4328(var4);
         var13.floatY *= -1.0F;
         var3.method4314(var13);
      }

      Class240_Sub6 var17 = new Class240_Sub6(0, (int)var3.floatX, (int)var3.floatY, (int)var3.floatZ);
      var1.method2812(var17, (byte)49);
      MapPoint var14 = client.aClass296_348.getMapArea();
      int var18 = var14.loadedMapX * 1265321541 << 9;
      int var19 = var14.loadedMapY * -1996781083 << 9;
      Class22.aClass43_Sub1_198.method393(0.02F, client.aClass296_348.method3760(-2013698005).anIntArrayArrayArray_7263, client.aClass296_348.method3753(), var18, var19, (byte)88);
   }
}
