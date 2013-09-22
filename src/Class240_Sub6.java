
public class Class240_Sub6 extends NodeListNode implements Class444 {

   public int anInt_6760;
   public int anInt_6761;
   static Class240_Sub6[] aClass240_Sub6Array_6762 = new Class240_Sub6[0];
   public int anInt_6763;
   public int anInt_6764;


   public Class240_Sub6(int var1, int var2, int var3, int var4) {
      this.anInt_6760 = 2136076663 * var1;
      this.anInt_6764 = -193391415 * var2;
      this.anInt_6763 = 33361917 * var3;
      this.anInt_6761 = var4 * -600670377;
   }

   void method4441(ByteArrayDataNode var1, int var2) {
      var1.putByte(-1792264121 * this.anInt_6760, -249029103);
      var1.putIntBE(this.anInt_6764 * -78428807, 2062892803);
      var1.putIntBE(this.anInt_6763 * 1646052693, 2062892803);
      var1.putIntBE(this.anInt_6761 * -406791065, 2062892803);
   }

   public int method5485(int var1) {
      return Class104_Sub13.method7351(1780996180);
   }

   public void method5484(ByteArrayDataNode var1, int var2) {
      this.method4441(var1, -2049894551);
   }

   public void method5483(ByteArrayDataNode var1, byte var2) {
      this.anInt_6760 = var1.readByte(1976908845) * 2136076663;
      this.anInt_6764 = var1.method4480(1260717178) * -193391415;
      this.anInt_6763 = var1.method4480(1260717178) * 33361917;
      this.anInt_6761 = var1.method4480(1260717178) * -600670377;
   }

   void method4445(int var1, int var2, int var3, int var4, int var5) {
      this.anInt_6760 = var1 * 2136076663;
      this.anInt_6764 = -193391415 * var2;
      this.anInt_6763 = var3 * 33361917;
      this.anInt_6761 = -600670377 * var4;
   }

   public String toString() {
      return "Level: " + -1792264121 * this.anInt_6760 + " Coord: " + -78428807 * this.anInt_6764 + "," + this.anInt_6763 * 1646052693 + "," + this.anInt_6761 * -406791065 + " Coord Split: " + (-78428807 * this.anInt_6764 >> 15) + "," + (-406791065 * this.anInt_6761 >> 15) + "," + (-78428807 * this.anInt_6764 >> 9 & 63) + "," + (this.anInt_6761 * -406791065 >> 9 & 63) + "," + (-78428807 * this.anInt_6764 & 511) + "," + (this.anInt_6761 * -406791065 & 511);
   }

   public GameCoord method4447(int var1) {
      return new GameCoord((float)(this.anInt_6764 * -78428807), (float)(1646052693 * this.anInt_6763), (float)(-406791065 * this.anInt_6761));
   }

   public Class240_Sub6() {
      this.anInt_6760 = -2136076663;
   }

   static int[] method4448(Class240_Sub27 var0, int var1) {
      ByteArrayDataNode var2 = new ByteArrayDataNode(518);
      int[] var3 = new int[4];

      int var4;
      for(var4 = 0; var4 < 4; ++var4) {
         var3[var4] = (int)(Math.random() * 9.9999999E7D);
      }

      var2.putByte(10, 1243767092);
      var2.putIntBE(var3[0], 2062892803);
      var2.putIntBE(var3[1], 2062892803);
      var2.putIntBE(var3[2], 2062892803);
      var2.putIntBE(var3[3], 2062892803);

      for(var4 = 0; var4 < 10; ++var4) {
         var2.putIntBE((int)(Math.random() * 9.9999999E7D), 2062892803);
      }

      var2.method4463((int)(Math.random() * 9.9999999E7D), -2052990899);
      var2.method4504(Class16.aBigInteger_137, Class16.aBigInteger_135, (byte)-68);
      var0.aClass240_Sub8_Sub1_7370.putBytes(var2.data, 0, 964952859 * var2.index, -144707030);
      return var3;
   }

   static final void method4449(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class540_Sub32.method4391(var3, var4, var0, 2027280423);
   }

   static final void method4450(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -414146463 * FontUnpacker.anInt_6465;
   }
}
