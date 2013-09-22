
public class Class431 {

   public static final int anInt_8323 = 768;
   public static final int anInt_8324 = 1;
   public static CacheDataUnpacker aCacheUnpacker_8325;


   Class431() throws Throwable {
      throw new Error();
   }

   public static void method5393(int var0, int var1) {
      Class110.method1412(new Class634(var0), 1537146665);
   }

   static void method5394(RSInterfaceData var0, int var1) {
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 571474761).aString_9560;
   }

   static final void method5395(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class563_Sub1_Sub5_Sub2.method5259(var3, var4, var0, -707542849);
   }

   static final void method5396(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1658488197) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2562 = Class133.extractInterfaceData(var4, var2, (byte)108);
      var0.aBoolean_2524 = true;
   }

   static final void method5397(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class479.method5697(var3, var4, var0, 207961638);
   }
}
