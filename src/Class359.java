
public class Class359 implements Class487 {

   final String aString_6793;
   final CacheDataUnpacker aCacheUnpacker_6794;


   public int method5743(int var1) {
      return this.aCacheUnpacker_6794.loadDataEntry(this.aString_6793, 1886586692)?100:this.aCacheUnpacker_6794.getPercentLoaded(this.aString_6793, (byte)51);
   }

   public Class500 method5742(int var1) {
      return Class500.aClass500_9082;
   }

   Class359(CacheDataUnpacker var1, String var2) {
      this.aCacheUnpacker_6794 = var1;
      this.aString_6793 = var2;
   }

   static final void method4597(RSInterfaceData var0, int var1) {
      ConnectionHandler var2 = Class32.method230(1017926923);
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6285, var2.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.putByte(0, -408814605);
      int var4 = var3.aClass240_Sub8_Sub1_7370.index * 964952859;
      var3.aClass240_Sub8_Sub1_7370.putByte(2, 630979828);
      var3.aClass240_Sub8_Sub1_7370.method4463(-405493655 * var0.aClass420_9507.anInt_7968, 857933206);
      var0.aClass420_9507.aClass240_Sub22_Sub16_7967.method2676(var3.aClass240_Sub8_Sub1_7370, var0.aClass420_9507.anIntArray_7966, 804039793);
      var3.aClass240_Sub8_Sub1_7370.method4521(var3.aClass240_Sub8_Sub1_7370.index * 964952859 - var4, -907432342);
      var2.addPacket(var3, 1620124922);
   }

   static final void method4598(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.anInt_465 * 854632627;
   }

   static final void method4599(RSInterfaceData var0, byte var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[863838783 * var0.stringDataIndex];
      String var3 = (String)var0.stringData[var0.stringDataIndex * 863838783 + 1];
      int var4 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.indexOf(var3, var4);
   }
}
