
public class Class50 {

   static final Class50 aClass50_1045 = new Class50(2, 6);
   static final Class50 aClass50_1046 = new Class50(0, 4);
   static final Class50 aClass50_1047 = new Class50(1, 5);
   final int anInt_1048;
   public final int anInt_1049;
   public static String aString_1050;
   static int anInt_1051;
   static String aString_1052;


   Class50(int var1, int var2) {
      this.anInt_1048 = 391020195 * var1;
      this.anInt_1049 = var2 * 472342965;
   }

   static final void method503(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class210.method2653(var3, var4, var0, 176947277);
   }

   static final void method504(RSInterfaceData var0, int var1) {
      String var2 = null;
      if(GamePack.aClass9_9270 != null) {
         var2 = GamePack.aClass9_9270.method49((byte)0);
      }

      if(null == var2) {
         var2 = "";
      }

      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2;
   }

   static final void method505(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class542.aClass43_Sub1_9475.method368(1759291999).anInt_973 * 677005635;
   }

   static final void method506(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4385(-543580019)?1:0;
   }

   static final void method507(RSInterfaceData var0, int var1) {
      client.aBoolean_572 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1;
   }
}
