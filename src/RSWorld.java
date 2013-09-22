
public class RSWorld extends Class621 {

   public String worldAddress;
   public int serverIndex;
   public String locAcc;
   public int ping = -295372387;


   public Class625 method4392(int var1) {
      return Class508_Sub5.aClass625Array_6573[-750949451 * this.anInt_10030];
   }

   static final void method4393(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1941058232) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2449 = Class133.extractInterfaceData(var4, var2, (byte)11);
      var0.aBoolean_2524 = true;
   }

   static void method4394(Renderer var0, int var1, int var2, RSInterface var3, byte var4) {
      byte var5 = 63;
      byte var6 = 7;

      for(int var7 = 63; var7 >= 0; --var7) {
         int var8 = (var7 & 63) << 10 | (var6 & 7) << 7 | var5 & 127;
         Class86.method1127(false, true, (byte)-106);
         int var9 = Class541.anIntArray_9470[var8];
         Class19.method103(false, true, (byte)1);
         var0.drawOutline(var1, (var3.height * 1833812087 * (63 - var7) >> 6) + var2, -533669195 * var3.width, (var3.height * 1833812087 >> 6) + 1, -16777216 | var9, 0);
      }

   }

   static final void method4395(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class100.method1297(var3, var4, var0, 1343056150);
   }
}
