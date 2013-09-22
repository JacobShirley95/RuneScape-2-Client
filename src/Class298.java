
public class Class298 {

   public static final Class298 aClass298_5992 = new Class298();
   static final Class298 aClass298_5993 = new Class298();
   public static final Class298 aClass298_5994 = new Class298();
   static final Class298 aClass298_5995 = new Class298();
   public static int anInt_5996;


   static void method3800(String[] var0, short[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         short var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if(var7 == null || null != var0[var9] && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method3800(var0, var1, var2, var6 - 1, 2052910722);
         method3800(var0, var1, 1 + var6, var3, 1428681983);
      }

   }

   static final void method3801(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class26.method158(var3, var4, var0, -1792176986);
   }

   static final void method3802(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class206.method2618(var3, var4, var0, -575114156);
   }

   static final void method3803(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      int var4 = var0.intTypes[2 + -831324111 * var0.intTypeIndex];
      Class598.method6476(7, var2 << 16 | var3, var4, "", -1898494081);
   }

   public static String method3804(int var0, boolean var1, byte var2) {
      return var1 && var0 >= 0?Class533.method6037(var0, 10, var1, 2046556133):Integer.toString(var0);
   }
}
