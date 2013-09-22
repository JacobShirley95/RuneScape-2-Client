
public class Class344 {

   static boolean aBoolean_6556 = false;
   static final int[] anIntArray_6557 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 3, 2, 2, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0};
   static Class345[] aClass345Array_6558;
   static LoadProgress[] aClass351Array_6559;
   static int anInt_6560;
   static int anInt_6561 = -1681196715;
   static int anInt_6562 = -586371665;


   Class344() throws Throwable {
      throw new Error();
   }

   static int method4263(int var0, int var1, int var2) {
      double var3 = Math.log((double)var1) / Math.log(2.0D);
      double var5 = Math.log((double)var0) / Math.log(2.0D);
      double var7 = Math.random() * (var3 - var5) + var5;
      return (int)(Math.pow(2.0D, var7) + 0.5D);
   }

   static final void method4264(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class374.method4757(var3, var4, var0, -755265615);
   }

   static final void method4265(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= 1462854468;
      client.aShort_557 = (short)var0.intTypes[-831324111 * var0.intTypeIndex];
      if(client.aShort_557 <= 0) {
         client.aShort_557 = 1;
      }

      client.aShort_558 = (short)var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      if(client.aShort_558 <= 0) {
         client.aShort_558 = 32767;
      } else if(client.aShort_558 < client.aShort_557) {
         client.aShort_558 = client.aShort_557;
      }

      client.aShort_462 = (short)var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      if(client.aShort_462 <= 0) {
         client.aShort_462 = 1;
      }

      client.aShort_560 = (short)var0.intTypes[var0.intTypeIndex * -831324111 + 3];
      if(client.aShort_560 <= 0) {
         client.aShort_560 = 32767;
      } else if(client.aShort_560 < client.aShort_462) {
         client.aShort_560 = client.aShort_462;
      }

   }

   static final void method4266(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      Class598.method6476(2, var2 << 16 | var3, var4, "", -1898494081);
   }

   static final int method4267(int var0, int var1) {
      return var0 >> 11 & 127;
   }

   static void method4268(byte var0) {
      Class22.aClass43_Sub1_198 = null;
      Class22.aBoolean_199 = false;
   }
}
