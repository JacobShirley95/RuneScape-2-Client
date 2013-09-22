
public class Class333_Sub1_Sub1 extends Class333_Sub1 {

   byte[] aByteArray_1404;


   void method2811(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.aByteArray_1404[var3++] = -1;
      this.aByteArray_1404[var3] = (byte)(3 * var4 >> 5);
   }

   Class333_Sub1_Sub1() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   byte[] method878(int var1, int var2, int var3) {
      this.aByteArray_1404 = new byte[var1 * var2 * var3 * 2];
      this.method4117(var1, var2, var3);
      return this.aByteArray_1404;
   }
}
