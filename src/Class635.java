
public class Class635 {

   static int anInt_10098;
   public static LibraryUnpacker clientLibExtractor;


   Class635() throws Throwable {
      throw new Error();
   }

   static final void method6712(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class483.method5720(var3, var0, -1388956949);
   }

   static final void method6713(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      if(-1 == var3) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class534.aClass275_9439.method3606(var2, -1036186782).method2605((char)var3, (byte)1);
      }

   }

   static void method6714(Renderer var0, Class240_Sub12 var1, MapIcon var2, int var3, int var4, int var5, int var6, WorldMapText var7, byte var8) {
      int var9 = var4 - var6 / 2 - 5;
      int var10 = var5 + 2;
      if(var2.anInt_9975 * 139785021 != 0) {
         var0.method1915(var9, var10, var6 + 10, var5 + var3 * var7.method2534() - var10 + 1, var2.anInt_9975 * 139785021, (byte)-58);
      }

      if(0 != var2.anInt_9976 * 1764932847) {
         var0.method1972(var9, var10, var6 + 10, var5 + var3 * var7.method2534() - var10 + 1, var2.anInt_9976 * 1764932847, 950750238);
      }

      int var11 = -1932225859 * var2.anInt_9968;
      if(var1.aBoolean_6806 && var2.anInt_10005 * 1818435707 != -1) {
         var11 = 1818435707 * var2.anInt_10005;
      }

      for(int var12 = 0; var12 < var3; ++var12) {
         String var13 = Class248_Sub1.aStringArray_6451[var12];
         if(var12 < var3 - 1) {
            var13 = var13.substring(0, var13.length() - 4);
         }

         var7.method2536(var0, var13, var4, var5, var11, true);
         var5 += var7.method2534();
      }

   }
}
