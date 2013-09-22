
public class Class260 {

   Class260() throws Throwable {
      throw new Error();
   }

   static final void method3465(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub24_7302.method4126(-914902767) == 2?1:0;
   }

   static final void method3466(RSInterfaceData var0, byte var1) {
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < Class300.cacheDataArray.length; ++var4) {
         if(null != Class300.cacheDataArray[var4] && Class300.cacheDataArray[var4].isInit()) {
            var2 += Class300.cacheDataArray[var4].getTotalSize((short)17936);
            var3 += Class300.cacheDataArray[var4].method5382(-1294293451);
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 == 0?0:var3 * 100 / var2;
   }

   static String method3467(ByteArrayDataNode var0, int var1, int var2) {
      try {
         int var3 = var0.method4490((byte)0);
         if(var3 > var1) {
            var3 = var1;
         }

         byte[] var4 = new byte[var3];
         var0.index += Class53.aClass48_1073.method488(var0.data, 964952859 * var0.index, var4, 0, var3, 1451118407) * -2043502829;
         String var5 = Class537.bytesToString(var4, 0, var3, -1773198807);
         return var5;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }
}
