
public class Class555 {

   Class555() throws Throwable {
      throw new Error();
   }

   static final void method6144(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.aBoolean_2501 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      Class110_Sub1.method3149(var0, 740292999);
   }

   static final void method6145(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.aString_2540 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
   }

   static final void method6146(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapOverviewNode var3 = Class605.method6516(-754810725);
      if(null != var3) {
         boolean var4 = var3.method2573(var2 >> 14 & 16383, var2 & 16383, Class556.anIntArray_9545, (byte)-76);
         if(var4) {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class556.anIntArray_9545[1];
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class556.anIntArray_9545[2];
         } else {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         }
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      }

   }

   static final void method6147(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapIcon var3 = Class126.mapIconUnpacker.loadIcon(var2);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_9969 * 1517017943;
   }

   static final void method6148(RSInterfaceData var0, byte var1) {
      Class276.method3609(var0.aClass563_Sub1_Sub2_Sub1_9512, var0, (byte)-78);
   }

   static void method6149(int var0) {}
}
