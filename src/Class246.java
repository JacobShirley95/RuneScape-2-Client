
public class Class246 implements Class264 {

   final Class563_Sub1_Sub4_Sub1 aClass563_Sub1_Sub4_Sub1_4100;


   public boolean method3511(PositionEntity var1, byte var2) {
      return this.aClass563_Sub1_Sub4_Sub1_4100 == var1;
   }

   Class246(Class563_Sub1_Sub4_Sub1 var1) {
      this.aClass563_Sub1_Sub4_Sub1_4100 = var1;
   }

   static Class409 method3140(ByteArrayDataNode var0, short var1) {
      Class419 var2 = Class130.method1672(-586655931)[var0.readByte(1700139757)];
      Class412 var3 = GamePack.method5981(1868822425)[var0.readByte(191711015)];
      int var4 = var0.method4478((byte)1);
      int var5 = var0.method4478((byte)1);
      int var6 = var0.readShort(1246654141);
      int var7 = var0.readShort(-757124039);
      int var8 = var0.method4478((byte)1);
      int var9 = var0.method4493(-157074556);
      int var10 = var0.method4480(1260717178);
      return new Class409(var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   static final void method3141(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class228.method2905(var3, var4, var0, 1653546313);
   }

   static final void method3142(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      client.method183(var3, var4, var0, 100237523);
   }

   static final void method3143(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 980798721 * var3.Y1;
   }

   static final void method3144(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.aByte_1285;
   }
}
