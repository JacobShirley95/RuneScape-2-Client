
public class Class203 implements Class99 {

   int anInt_3527;
   int anInt_3528;
   float[] aFloatArray_3529;
   static Class449 aClass449_3530;
   static String[] cacheDirectories;
   public static RSInterface aClass132_3532;


   public int method2006() {
      return -185716297 * this.anInt_3527;
   }

   public int method2005() {
      return this.anInt_3528 * 1458984769;
   }

   public void method824() {}

   Class203(int var1, int var2) {
      this.anInt_3527 = -573015033 * var1;
      this.anInt_3528 = var2 * 1655847105;
      this.aFloatArray_3529 = new float[this.anInt_3527 * -185716297 * this.anInt_3528 * 1458984769];
   }

   public static Class606[] method2585(int var0) {
      return new Class606[]{Class606.aClass606_9912, Class606.aClass606_9914, Class606.aClass606_9913};
   }

   static void method2586(RSInterfaceData var0, int var1) {
      var0.intTypes[-831324111 * var0.intTypeIndex - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 1], -342032346).method6182(Class240_Sub41_Sub3.aClass23_1024, (byte)1)?1:0;
   }

   public static void method2587(Class434 var0, int var1, int var2, int var3) {
      RSInterfaceData var4 = Class261.getInterfaceData();
      Class240_Sub52_Sub10.method585(var0, var1, var2, var4, 1958435055);
   }

   static final void method2588(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class535.method6065(var3, var4, var0, (byte)-65);
   }

   static final void method2589(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class234.method3013(var3, var4, false, 0, var0, 2003864219);
   }

   static final void method2590(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub26_7308.method4199(-254053177) == 1?1:0;
   }

   static final void method2591(RSInterfaceData var0, byte var1) {
      NPC var2 = (NPC)var0.animeTarget;
      boolean var3 = false;
      NPCComposite var4 = var2.npcComposite;
      if(var4.anIntArray_8642 != null) {
         var4 = var4.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-49);
      }

      if(null != var4) {
         var3 = var4.aBoolean_8651;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3?1:0;
   }

   static final void method2592(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      String var3 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(-1 == var2) {
         throw new RuntimeException();
      } else {
         Class470 var4 = Class493.aClass466_9034.method5614(var2, (byte)53);
         if(var4.aChar_8694 != 115) {
            throw new RuntimeException();
         } else {
            int[] var5 = var4.method5652(var3, (byte)51);
            int var6 = 0;
            if(null != var5) {
               var6 = var5.length;
            }

            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var6;
         }
      }
   }

   static final void method2593(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      var0.intTypeIndex -= -1416056414;
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.indexOf(var3, var4);
   }
}
