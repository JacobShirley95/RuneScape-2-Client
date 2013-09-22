
public class Class240_Sub53 extends NodeListNode {

   public GameCoord aClass347_8018 = new GameCoord();
   float aFloat_8019;
   int anInt_8020;
   int anInt_8021;


   public final int method5274(byte var1) {
      return (int)this.aClass347_8018.floatX;
   }

   public final int method5275(byte var1) {
      return (int)this.aClass347_8018.floatY;
   }

   public final int method5276(byte var1) {
      return (int)this.aClass347_8018.floatZ;
   }

   public final int method5277(int var1) {
      return this.anInt_8021 * -1006310637;
   }

   public final int method5278(byte var1) {
      return -1840565291 * this.anInt_8020;
   }

   public final float method5279(int var1) {
      return this.aFloat_8019;
   }

   public void method5280(float var1, int var2) {
      this.aFloat_8019 = var1;
   }

   public void method5281(int var1, int var2, int var3, int var4) {
      this.aClass347_8018.setPos((float)var1, (float)var2, (float)var3);
   }

   Class240_Sub53(int var1, int var2, int var3, int var4, int var5, float var6) {
      this.aClass347_8018.setPos((float)var1, (float)var2, (float)var3);
      this.anInt_8021 = -280914149 * var4;
      this.anInt_8020 = 1952345469 * var5;
      this.aFloat_8019 = var6;
   }

   static final void method5282(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class285.method3679(var3, var4, var0, (byte)0);
   }
}
