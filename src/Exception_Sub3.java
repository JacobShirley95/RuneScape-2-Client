
public final class Exception_Sub3 extends Exception {

   Exception_Sub3(String var1, int var2, int var3) {
      super("");
   }

   public static void method1361(int[] var0, int[] var1, int var2, int var3, byte var4) {
      if(var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         int var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;
         int var9 = var7 == Integer.MAX_VALUE?0:1;

         for(int var10 = var2; var10 < var3; ++var10) {
            if(var0[var10] < (var10 & var9) + var7) {
               int var11 = var0[var10];
               var0[var10] = var0[var6];
               var0[var6] = var11;
               int var12 = var1[var10];
               var1[var10] = var1[var6];
               var1[var6++] = var12;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method1361(var0, var1, var2, var6 - 1, (byte)42);
         method1361(var0, var1, var6 + 1, var3, (byte)116);
      }

   }

   static void method1362(int var0, int var1) {
      HintMarker.modelNodeArrayList.method6677(var0, -2064733055);
   }
}
