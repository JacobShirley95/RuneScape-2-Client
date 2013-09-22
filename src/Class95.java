
public class Class95 {

   public static NodeArrayList aNodeArrayList_1886 = new NodeArrayList(32);
   static Class97[] aClass97Array_1887;
   public static NodeList aNodeList_1888 = new NodeList();
   static Class102[] aClass102Array_1889;
   static Class130[] aClass130Array_1890;
   static int anInt_1891 = 0;
   public static CharTask[] aClass104Array_1892;
   static int anInt_1893 = 388635129;
   public static Class100[] aClass100Array_1894;
   static int anInt_1895 = 0;
   static boolean aBoolean_1896 = false;
   static short aShort_1897;
   static short aShort_1898;
   static int anInt_1899 = -1591719459;
   static int anInt_1900 = -962395695;
   public static final Class184 aClass184_1901 = new Class103();


   Class95() throws Throwable {
      throw new Error();
   }

   static final void method1236(RSInterfaceData var0, byte var1) {
      long var2 = var0.aLongArray_9519[(var0.longTypeIndex -= -1088659337) * 973044039];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2 == -1L?"":Long.toString(var2, 36).toUpperCase();
   }

   static void method1237(int var0, int var1, int[] var2, int[] var3, float[] var4, float[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = var6 + var7 * var0;
      int var14 = var1 * var9 + var8;
      int var15 = var0 - var10;
      int var16 = var1 - var10;
      int var17;
      int var18;
      if(null == var2) {
         for(var17 = 0; var17 < var11; ++var17) {
            for(var18 = var13 + var10; var13 < var18; var5[var14++] = var4[var13++]) {
               ;
            }

            var13 += var15;
            var14 += var16;
         }
      } else if(var4 == null) {
         for(var17 = 0; var17 < var11; ++var17) {
            for(var18 = var10 + var13; var13 < var18; var3[var14++] = var2[var13++]) {
               ;
            }

            var13 += var15;
            var14 += var16;
         }
      } else {
         for(var17 = 0; var17 < var11; ++var17) {
            for(var18 = var13 + var10; var13 < var18; var5[var14++] = var4[var13++]) {
               var3[var14] = var2[var13];
            }

            var13 += var15;
            var14 += var16;
         }
      }

   }
}
