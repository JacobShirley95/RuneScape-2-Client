
public class Class535 {

   static final char[] aCharArray_9440 = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
   public static Class529 aClass529_9441;


   Class535() throws Throwable {
      throw new Error();
   }

   static final void method6060(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass240_Sub47_9501.aByte_7663;
   }

   public static boolean method6061(char var0, int var1) {
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(var0 != 0) {
            char[] var2 = aCharArray_9440;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               char var4 = var2[var3];
               if(var4 == var0) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   static void method6062(int var0) {
      Class240_Sub22_Sub5 var1 = Class65_Sub1_Sub2.method866(14, 0L);
      var1.method597((byte)0);
   }

   static void method6063(int var0, int var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(14, 0L);
      var3.method596((byte)104);
      var3.anInt_1175 = var0 * 134353971;
      var3.anInt_1165 = var1 * -771972147;
   }

   static final void method6064(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      if(var4 != var0.anInt_2482 * -1190550869) {
         var0.anInt_2482 = var4 * 896092163;
         Class110_Sub1.method3149(var0, -139634918);
      }

      if(-1 == var0.anInt_2428 * -1001687885 && !var1.aBoolean_2054) {
         Class240_Sub52_Sub9.method571(var0.cacheID * 1278853609, -128431234);
      }

   }

   static final void method6065(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.aBoolean_2503 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      Class110_Sub1.method3149(var0, 958440553);
      if(-1001687885 * var0.anInt_2428 == -1 && !var1.aBoolean_2054) {
         Class502_Sub1.method4703(1278853609 * var0.cacheID, (byte)0);
      }

   }
}
