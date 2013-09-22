
public class Class45 {

   int[] anIntArray_959;
   public static Class432 aClass432_960;


   public int method414(int var1, byte var2) {
      int var3 = (this.anIntArray_959.length >> 1) - 1;
      int var4 = var1 & var3;

      while(true) {
         int var5 = this.anIntArray_959[1 + var4 + var4];
         if(var5 == -1) {
            return -1;
         }

         if(var1 == this.anIntArray_959[var4 + var4]) {
            return var5;
         }

         var4 = var4 + 1 & var3;
      }
   }

   public Class45(int[] var1) {
      int var2;
      for(var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
         ;
      }

      this.anIntArray_959 = new int[var2 + var2];

      int var3;
      for(var3 = 0; var3 < var2 + var2; ++var3) {
         this.anIntArray_959[var3] = -1;
      }

      int var4;
      for(var3 = 0; var3 < var1.length; this.anIntArray_959[1 + var4 + var4] = var3++) {
         for(var4 = var1[var3] & var2 - 1; this.anIntArray_959[var4 + var4 + 1] != -1; var4 = 1 + var4 & var2 - 1) {
            ;
         }

         this.anIntArray_959[var4 + var4] = var1[var3];
      }

   }

   static final void method415(RSInterfaceData var0, int var1) {
      var0.aLongArray_9494[var0.anIntArray_9518[-1756266293 * var0.anInt_9510]] = var0.aLongArray_9519[(var0.longTypeIndex -= -1088659337) * 973044039];
   }

   static final void method416(RSInterfaceData var0, int var1) {
      String var2;
      if(null != Class521.myPlayer && null != Class521.myPlayer.aString_1467) {
         var2 = Class521.myPlayer.getName(true, -1393009527);
      } else {
         var2 = "";
      }

      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2;
   }
}
