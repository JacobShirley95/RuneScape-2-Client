
public class Class333_Sub1_Sub2 extends Class333_Sub1 {

   byte[] aByteArray_1777;


   Class333_Sub1_Sub2() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   void method2811(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.aByteArray_1777[var3++] = (byte)(3 * var4 >> 5);
      this.aByteArray_1777[var3] = (byte)(3 * var4 >> 5);
   }

   byte[] method1150(int var1, int var2, int var3) {
      this.aByteArray_1777 = new byte[var1 * var2 * var3 * 2];
      this.method4117(var1, var2, var3);
      return this.aByteArray_1777;
   }
}
