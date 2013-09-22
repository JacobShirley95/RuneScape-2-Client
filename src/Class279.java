import java.io.File;

public class Class279 {

   public static final int anInt_4738 = 0;
   public static final int anInt_4739 = 3;
   public static final int anInt_4740 = 1;
   public static final int anInt_4741 = 4;
   public static final int anInt_4742 = 2;
   static int mouseNodeIndex;


   Class279() throws Throwable {
      throw new Error();
   }

   static final void method3623(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class535.method6065(var3, var4, var0, (byte)-98);
   }

   static String method3624(long var0, int var2, int var3) {
      Class544.method6092(var0);
      int var4 = Class461.aCalendar_8600.get(5);
      int var5 = Class461.aCalendar_8600.get(2) + 1;
      int var6 = Class461.aCalendar_8600.get(1);
      return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
   }

   static final void method3625(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class234.method3013(var3, var4, false, 0, var0, 1406054070);
   }

   static final void method3626(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      boolean var3 = DamageAnimeLoader.gameClient.method2855(new File(var2), 1742333137);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3?1:0;
   }

   static final void method3627(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3 + var2;
   }

   static void method3628(RSInterfaceData var0, int var1) {
      Class559 var2 = HintMarker.aClass583_3709.method6327(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], -982588955);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = null == var2.anIntArray_9576?0:var2.anIntArray_9576.length;
   }
}
