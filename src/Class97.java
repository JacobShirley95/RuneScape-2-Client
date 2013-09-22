
public class Class97 {

   final int[] anIntArray_1918;
   final int[] anIntArray_1919;
   final int[] anIntArray_1920;
   final int[] anIntArray_1921;
   final int[] anIntArray_1922;
   final int[] anIntArray_1923;
   final int[] anIntArray_1924;
   public static CacheDataUnpacker aCacheUnpacker_1925;
   public static Class178 aClass178_1926;


   void method1271(int var1, int var2) {
      int[][] var3 = new int[this.anIntArray_1921.length << 1][4];

      for(int var4 = 0; var4 < this.anIntArray_1921.length; ++var4) {
         var3[2 * var4][0] = this.anIntArray_1921[var4];
         var3[var4 * 2][1] = this.anIntArray_1919[var4];
         var3[var4 * 2][2] = this.anIntArray_1920[var4];
         var3[2 * var4][3] = this.anIntArray_1918[var4];
         var3[1 + 2 * var4][0] = this.anIntArray_1922[var4];
         var3[1 + var4 * 2][1] = this.anIntArray_1923[var4];
         var3[var4 * 2 + 1][2] = this.anIntArray_1924[var4];
         var3[1 + var4 * 2][3] = this.anIntArray_1918[var4];
      }

      client.anIntArrayArrayArray_399[var1] = var3;
   }

   Class97(ByteArrayDataNode var1) {
      int var2 = var1.method4490((byte)0);
      this.anIntArray_1921 = new int[var2];
      this.anIntArray_1919 = new int[var2];
      this.anIntArray_1920 = new int[var2];
      this.anIntArray_1918 = new int[var2];
      this.anIntArray_1922 = new int[var2];
      this.anIntArray_1923 = new int[var2];
      this.anIntArray_1924 = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.anIntArray_1921[var3] = var1.readShort(-932875090) - 5120;
         this.anIntArray_1920[var3] = var1.readShort(2008477643) - 5120;
         this.anIntArray_1919[var3] = var1.method4478((byte)1);
         this.anIntArray_1922[var3] = var1.readShort(1651958447) - 5120;
         this.anIntArray_1924[var3] = var1.readShort(-40652812) - 5120;
         this.anIntArray_1923[var3] = var1.method4478((byte)1);
         this.anIntArray_1918[var3] = var1.method4478((byte)1);
      }

   }

   static final void method1272(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
   }

   static final void method1273(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      Class598.method6476(1, var2 << 16 | var3, var4, "", -1898494081);
   }

   public static char method1274(byte var0, int var1) {
      int var2 = var0 & 255;
      if(var2 == 0) {
         throw new IllegalArgumentException("" + Integer.toString(var2, 16));
      } else {
         if(var2 >= 128 && var2 < 160) {
            char var3 = Class535.aCharArray_9440[var2 - 128];
            if(var3 == 0) {
               var3 = 63;
            }

            var2 = var3;
         }

         return (char)var2;
      }
   }

   static final void method1275(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      ObjectDescriptor var4 = Class592.cacheObjectLoader.getObjectDescriptor(var2);
      if(var3 >= 1 && var3 <= 5 && null != var4.invenOptions[var3 - 1]) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var4.invenOptions[var3 - 1];
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   static final void method1276(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var2 > 255 || var2 < 0) {
         var2 = 0;
      }

      if(var2 != Class104_Sub21.renderSettings.aClass540_Sub5_7316.method1554(-1265053372)) {
         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub5_7316, var2, 931562515);
         Class83.method1089(-892832036);
         client.aBoolean_568 = false;
      }

   }

   static final void method1277(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class394.method4928(var3, var0, 1288039871);
   }
}
