
public class Class210 {

   int[] anIntArray_3610;
   int anInt_3611;
   float[] aFloatArray_3612;
   boolean aBoolean_3613;
   float aFloat_3614 = 0.85F;
   Viewport aViewport_3615;
   int anInt_3616;
   int anInt_3617;
   boolean aBoolean_3618;
   float[] aFloatArray_3619;
   float aFloat_3620;
   static final float aFloat_3621 = 255.0F;
   ArrayViewport anArrayViewport_3622;
   float[] aFloatArray_3623;
   float aFloat_3624;
   SoftwareRenderer aRenderer_Sub1_3625;
   ArrayViewport anArrayViewport_3626;
   ArrayViewport anArrayViewport_3627;
   int[] anIntArray_3628;
   float[] aFloatArray_3629;
   Class202 aClass202_3630;
   Runnable aRunnable_3631;
   Viewport aViewport_3632;
   int[] anIntArray_3633;
   int[] anIntArray_3634;
   float[] aFloatArray_3635;
   int[] anIntArray_3636;
   int[] anIntArray_3637;
   int[] anIntArray_3638;
   boolean aBoolean_3639;
   float aFloat_3640;
   float aFloat_3641;
   float aFloat_3642;
   float aFloat_3643;
   float aFloat_3644;
   float aFloat_3645;
   int anInt_3646;
   float[] aFloatArray_3647;
   Class165_Sub3[] aClass165_Sub3Array_3648;
   Class165_Sub3[] aClass165_Sub3Array_3649;
   float[] aFloatArray_3650;
   int anInt_3651;
   float[] aFloatArray_3652;
   float[] aFloatArray_3653;
   float[] aFloatArray_3654;
   float[] aFloatArray_3655;
   public static byte aByte_3656;


   void update(int var1) {
      this.aClass202_3630 = new Class202(this.aRenderer_Sub1_3625, this);
   }

   Class210(SoftwareRenderer var1) {
      this.aFloat_3624 = 1.0F - this.aFloat_3614;
      this.anInt_3616 = 0;
      this.anInt_3617 = 0;
      this.aBoolean_3618 = false;
      this.anInt_3611 = 0;
      this.anInt_3651 = 0;
      this.aBoolean_3639 = true;
      this.anArrayViewport_3622 = new ArrayViewport();
      this.aViewport_3615 = new Viewport();
      this.aViewport_3632 = new Viewport();
      this.anArrayViewport_3626 = new ArrayViewport();
      this.anArrayViewport_3627 = new ArrayViewport();
      this.anIntArray_3628 = new int[Class165_Sub3.anInt_10997];
      this.aFloatArray_3623 = new float[Class165_Sub3.anInt_10997];
      this.aFloatArray_3619 = new float[Class165_Sub3.anInt_10997];
      this.aFloatArray_3612 = new float[Class165_Sub3.anInt_10997];
      this.aFloatArray_3629 = new float[Class165_Sub3.anInt_10997];
      this.anIntArray_3633 = new int[8];
      this.anIntArray_3610 = new int[8];
      this.anIntArray_3634 = new int[8];
      this.anIntArray_3636 = new int[10000];
      this.anIntArray_3637 = new int[10000];
      this.aFloat_3643 = 1.0F;
      this.aFloat_3620 = 0.0F;
      this.aFloat_3645 = 1.0F;
      this.aFloatArray_3647 = new float[2];
      this.aClass165_Sub3Array_3648 = new Class165_Sub3[7];
      this.aClass165_Sub3Array_3649 = new Class165_Sub3[7];
      this.aFloatArray_3650 = new float[64];
      this.aFloatArray_3635 = new float[64];
      this.aFloatArray_3652 = new float[64];
      this.aFloatArray_3653 = new float[64];
      this.aFloatArray_3654 = new float[64];
      this.aFloatArray_3655 = new float[3];
      this.aRenderer_Sub1_3625 = var1;
      this.aClass202_3630 = new Class202(var1, this);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         this.aClass165_Sub3Array_3648[var2] = new Class165_Sub3(this.aRenderer_Sub1_3625);
         this.aClass165_Sub3Array_3649[var2] = new Class165_Sub3(this.aRenderer_Sub1_3625);
      }

      this.anIntArray_3638 = new int[Class165_Sub3.anInt_11011];

      for(var2 = 0; var2 < Class165_Sub3.anInt_11011; ++var2) {
         this.anIntArray_3638[var2] = -1;
      }

   }

   void method2651(Runnable var1, byte var2) {
      this.aRunnable_3631 = var1;
   }

   public static void method2652(int var0, int var1, int var2, int var3) {
      var2 = var2 * Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-1918232844) >> 8;
      if(var2 != 0 && -1 != var0) {
         if(!Class217.aBoolean_3748 && -528571831 * Class217.anInt_3752 != -1 && Class220.method2769((byte)20) && !Class1024.method2086((byte)-71)) {
            Class217.aClass240_Sub41_Sub2_3755 = Class188.method2310(-1273487762);
            Class286.method3696(-1855509234);
            Class240_Sub41_Sub2 var4 = Class297.method3795(Class217.aClass240_Sub41_Sub2_3755, 2042235355);
            ByteArrayDataNode.method4544(true, var4, (byte)-41);
         }

         Class243.method3122(Class66.aCacheUnpacker_1257, var0, 0, var2, false, (byte)-56);
         Class35.method273(-1, 255, 1897591023);
         Class217.aBoolean_3748 = true;
      }

   }

   static final void method2653(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2469 = -313436523;
      var0.anInt_2416 = client.anInt_438 * 318893009;
      var0.anInt_2426 = 0;
      if(-1 == -1001687885 * var0.anInt_2428 && !var1.aBoolean_2054) {
         Class86.method1132(1278853609 * var0.cacheID, (byte)38);
      }

   }

   static final void method2654(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.method174(var3).method4993((byte)89);
   }

   public static final void method2655(int var0) {
      for(int var1 = 0; var1 < 5; ++var1) {
         client.aBooleanArray_548[var1] = false;
      }

      client.anInt_400 = 1150192039;
      client.anInt_408 = 1040489835;
      Class304.anInt_6021 = 0;
      FontUnpacker.anInt_6466 = 0;
      Class509.anInt_9182 = 712843138;
      Class102.anInt_1968 = -1061791373;
      Class571.anInt_9652 = -1694464327;
      client.anInt_441 = client.timer * 1558165183;
      Class561.anInt_9587 = 583178961 * Class330.anInt_6406;
      Class377.anInt_7274 = 627678707 * Class1.anInt_17;
      Class28_Sub1.anInt_4269 = Class373.anInt_7118 * -227217781;
      Class495.anInt_9064 = 1299549387 * Class631.anInt_10082;
      CacheFileID.anInt_2038 = Class474.anInt_8724 * 1315695871;
      Class240_Sub49.anInt_7702 = -1979113317 * client.anInt_565;
   }

   public static void method2656(RSInterface var0, int var1, int var2, byte var3) {
      if(null != var0) {
         if(null != var0.anObjectArray_2461) {
            Class240_Sub17 var4 = new Class240_Sub17();
            var4.aClass132_6903 = var0;
            var4.anObjectArray_6907 = var0.anObjectArray_2461;
            Class411.method5074(var4, (byte)1);
         }

         client.aBoolean_463 = true;
         Class283_Sub3.anInt_7897 = -1333486645 * var0.cacheID;
         client.anInt_543 = -1407123897 * var0.anInt_2428;
         Class286.anInt_4823 = var1 * -97510783;
         Class508.anInt_9143 = var2 * -1577136315;
         client.anInt_279 = var0.itemID * 1219195715;
         CacheFileID.anInt_2037 = var0.anInt_2447 * -301119037;
         client.anInt_373 = var0.anInt_2448 * 612931359;
         Class110_Sub1.method3149(var0, 1240542320);
      }
   }

   static final void method2657(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      NPC var3 = (NPC)var0.animeTarget;
      int var4 = var3.method1166(var2, (byte)12);
      int var5 = var3.method1174(var2, -1193713688);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var5;
   }
}
