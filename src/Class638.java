
public class Class638 {

   public byte aByte_10129;
   short aShort_10130;
   public Class563_Sub1_Sub5 aClass563_Sub1_Sub5_10131;
   public Class563_Sub1_Sub5 aClass563_Sub1_Sub5_10132;
   public Class563_Sub1_Sub3 aClass563_Sub1_Sub3_10133;
   public Class563_Sub1_Sub3 aClass563_Sub1_Sub3_10134;
   public Class638 aClass638_10135;
   Class563_Sub1_Sub2 aClass563_Sub1_Sub2_10136;
   public Class629 aClass629_10137;
   public Class563_Sub1_Sub1 aClass563_Sub1_Sub1_10138;
   short aShort_10139;
   short aShort_10140;
   short aShort_10141;
   static int optionsBoxHeight;


   public Class638(int var1) {
      this.aByte_10129 = (byte)var1;
   }

   static final void method6729(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.anInt_2495 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 601001841;
      Class110_Sub1.method3149(var0, 1777191531);
      if(var0.anInt_2428 * -1001687885 == -1 && !var1.aBoolean_2054) {
         Class212_Sub1_Sub1.method1138(var0.cacheID * 1278853609, 1824106335);
      }

   }

   static void method6730(long[] var0, int[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         long var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var9 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var9;
         int var10 = var7 == Long.MAX_VALUE?0:1;

         for(int var11 = var2; var11 < var3; ++var11) {
            if(var0[var11] < var7 + (long)(var11 & var10)) {
               long var12 = var0[var11];
               var0[var11] = var0[var6];
               var0[var6] = var12;
               int var14 = var1[var11];
               var1[var11] = var1[var6];
               var1[var6++] = var14;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var9;
         method6730(var0, var1, var2, var6 - 1, 1993218098);
         method6730(var0, var1, 1 + var6, var3, 150849766);
      }

   }

   static final void method6731(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class3.method17(var3, var4, var0, (byte)0);
   }
}
