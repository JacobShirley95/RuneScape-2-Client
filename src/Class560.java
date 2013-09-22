
final class Class560 implements Runnable {

   public static Class599 aClass599_9582;


   public void run() {
      try {
         IcmpService_Sub1.anIcmpService_Sub1_7119.run();
      } catch (Throwable var2) {
         ;
      }

      IcmpService_Sub1.anIcmpService_Sub1_7119 = null;
   }

   static final void method6186(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class220.method2772(var3, var4, var0, -1291527306);
   }

   static final void method6187(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      int var4 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      --var4;
      if(var3.options != null && var4 < var3.options.length && null != var3.options[var4]) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.options[var4];
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }
}
