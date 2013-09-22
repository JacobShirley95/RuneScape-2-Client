import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Class240_Sub4 extends NodeListNode {

   int anInt_6750;
   final OggStreamState anOggStreamState_6751;


   void method4433(OggPacket var1, int var2) {
      this.method4434(var1, -1784847597);
      this.anInt_6750 += -153790131;
   }

   abstract void method4434(OggPacket var1, int var2);

   abstract void method4435(int var1);

   Class240_Sub4(OggStreamState var1) {
      this.anOggStreamState_6751 = var1;
   }

   static final void method4436(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class275.method3607(var3, var4, var0, 1665822240);
   }

   static final void method4437(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class100.method1297(var3, var4, var0, 1321000950);
   }
}
