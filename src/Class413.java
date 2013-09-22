
public class Class413 implements Class415 {

   public final int anInt_7885;
   public final Class412 aClass412_7886;
   public final int anInt_7887;
   public final int anInt_7888;
   public final int anInt_7889;
   public final int anInt_7890;
   public final int anInt_7891;
   public final int anInt_7892;
   public final int anInt_7893;
   public final Class419 aClass419_7894;
   public final boolean aBoolean_7895;


   public Class408 method5142(int var1) {
      return Class408.aClass408_7750;
   }

   Class413(int var1, Class419 var2, Class412 var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      this.anInt_7885 = var1 * 1497478627;
      this.aClass419_7894 = var2;
      this.aClass412_7886 = var3;
      this.anInt_7887 = var4 * -1775878453;
      this.anInt_7892 = var5 * -1459674127;
      this.anInt_7888 = 11392245 * var6;
      this.anInt_7893 = var7 * -1130547685;
      this.anInt_7889 = 486106967 * var8;
      this.anInt_7890 = -859787283 * var9;
      this.anInt_7891 = var10 * 905850619;
      this.aBoolean_7895 = var11;
   }

   public static Class50 method5130(int var0, int var1) {
      Class50[] var2 = Class253.method3314(1066401155);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class50 var4 = var2[var3];
         if(var0 == 798041355 * var4.anInt_1048) {
            return var4;
         }
      }

      return null;
   }

   static final void method5131(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1900159845 * var3.imageID;
   }

   static final void method5132(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.method693(var2, var3, var4, -326756941);
   }

   static final void method5133(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      Class34_Sub2_Sub1.method555(var0.animeTarget.headInterfaces, var2 & '\uffff', var3, var4, var0.aBoolean_9522, var0, 2106608673);
   }

   public static void sortWorlds(int var0, boolean var1, int var2, boolean var3, byte var4) {
      Class577.sortWorlds(0, Class503.rsWorldList.length - 1, var0, var1, var2, var3, (byte)0);
      Class503.loadedServersCount = 0;
      Class503.aClass575_9116 = null;
   }

   static final void method5135(long var0) {
      if(client.aClass296_348.getWorldObjects() != null) {
         if(3 != Class509.anInt_9182 * 1735950531 && 6 != 1735950531 * Class509.anInt_9182) {
            if(4 == Class509.anInt_9182 * 1735950531) {
               Class534.method6059(var0);
            }
         } else {
            Class239.method3087(var0);
         }
      }

      ClientSuper.method2888(Class286.gameRenderer, (long)(-1025618511 * client.timer));
      if(client.anInt_468 * 1854782309 != -1) {
         Class371.method4718(client.anInt_468 * 1854782309, -254735201);
      }

      int var2;
      for(var2 = 0; var2 < -396228463 * client.anInt_386; ++var2) {
         client.aBooleanArray_362[var2] = client.aBooleanArray_525[var2];
         client.aBooleanArray_525[var2] = false;
      }

      client.anInt_555 = 1816986437 * client.timer;
      Class500.method5837(-1, -1, -168364561);
      if(-1 != 1854782309 * client.anInt_468) {
         client.anInt_386 = 0;
         Class508.method5910(-1629282516);
      }

      Class286.gameRenderer.method1967();
      LoadProgress.method4424(Class286.gameRenderer, -902563269);
      var2 = Class618.method6616(-511537087);
      if(var2 == -1) {
         var2 = 635272015 * client.anInt_373;
      }

      if(-1 == var2) {
         var2 = -381640343 * client.anInt_371;
      }

      Class608.method6553(var2, -933538768);
      int var3 = Class521.myPlayer.method3257() << 8;
      GameCoord var4 = Class521.myPlayer.method6203().gameCoord;
      Class105.method1358(Class521.myPlayer.plane, (int)var4.floatX + var3, var3 + (int)var4.floatZ, client.anInt_384 * 1451701819, 1499129752);
      client.anInt_384 = 0;
   }
}
