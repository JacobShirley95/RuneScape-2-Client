
public class Class346 implements Class487 {

   final String aString_6566;
   final CacheDataUnpacker aCacheUnpacker_6567;
   static Class516[] aClass516Array_6568;
   static WorldMapText aClass198_6569;


   Class346(CacheDataUnpacker var1, String var2) {
      this.aCacheUnpacker_6567 = var1;
      this.aString_6566 = var2;
   }

   public Class500 method5742(int var1) {
      return Class500.aClass500_9083;
   }

   public int method5743(int var1) {
      return this.aCacheUnpacker_6567.method3585(this.aString_6566, 1162035002)?100:0;
   }

   static final void method4294(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class595.method6444(var3, var4, var0, 1217498153);
   }

   static final void method4295(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      int var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(-1 == var3) {
         throw new RuntimeException("");
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2 + (char)var3;
      }
   }

   static final void method4296(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub11_7286.method1661(145340804);
   }
}
