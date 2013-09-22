
public abstract class Class104_Sub18 extends CharTask {

   final int anInt_10709;
   final int anInt_10710;
   final int anInt_10711;


   Class104_Sub18(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_10711 = var1.readShort(-1157877713) * 1921805431;
      this.anInt_10710 = var1.readShort(906690793) * 460269909;
      this.anInt_10709 = var1.readByte(-978752809) * 457383315;
   }

   boolean method1344(int var1) {
      Class567 var2 = Class75.aClass558_1422.method6164(1277898055 * this.anInt_10711, (byte)111);
      boolean var3 = var2.method6238((short)256);
      Animation var4 = Class88.animeUnpacker.loadAnimation(var2.animationID * -1632377741);
      var3 &= var4.method6725(1439967008);
      return var3;
   }

   static final void method7378(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2533 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 915723855;
   }

   static final void method7379(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.title;
   }
}
