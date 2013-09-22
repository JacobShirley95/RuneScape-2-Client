
public class Class356 {

   public float aFloat_6765;
   public float aFloat_6766;
   public float aFloat_6767;
   public float aFloat_6768;


   public final void method4454() {
      this.aFloat_6767 = -this.aFloat_6767;
      this.aFloat_6766 = -this.aFloat_6766;
      this.aFloat_6768 = -this.aFloat_6768;
      this.aFloat_6765 = -this.aFloat_6765;
   }

   public Class356(float var1, float var2, float var3, float var4) {
      this.method4455(var1, var2, var3, var4);
   }

   public void method4455(float var1, float var2, float var3, float var4) {
      this.aFloat_6767 = var1;
      this.aFloat_6766 = var2;
      this.aFloat_6768 = var3;
      this.aFloat_6765 = var4;
   }

   public void method4456(Class356 var1) {
      this.method4455(var1.aFloat_6767, var1.aFloat_6766, var1.aFloat_6768, var1.aFloat_6765);
   }

   public void method4457(int var1) {
      this.method4455((float)(var1 >> 16 & 255) * 0.003921569F, (float)(var1 >> 8 & 255) * 0.003921569F, (float)(var1 >> 0 & 255) * 0.003921569F, (float)(var1 >> 24 & 255) * 0.003921569F);
   }

   final void method4458() {
      this.aFloat_6765 = 0.0F;
      this.aFloat_6768 = 0.0F;
      this.aFloat_6766 = 0.0F;
      this.aFloat_6767 = 0.0F;
   }

   public String toString() {
      return this.aFloat_6767 + "," + this.aFloat_6766 + "," + this.aFloat_6768 + "," + this.aFloat_6765;
   }

   public final void method4460(float var1) {
      this.aFloat_6767 *= var1;
      this.aFloat_6766 *= var1;
      this.aFloat_6768 *= var1;
      this.aFloat_6765 *= var1;
   }

   public final void method4461(ArrayViewport var1) {
      float var2 = this.aFloat_6767;
      float var3 = this.aFloat_6766;
      float var4 = this.aFloat_6768;
      float var5 = this.aFloat_6765;
      this.aFloat_6767 = var1.data[0] * var2 + var1.data[4] * var3 + var1.data[8] * var4 + var1.data[12] * var5;
      this.aFloat_6766 = var1.data[1] * var2 + var1.data[5] * var3 + var1.data[9] * var4 + var1.data[13] * var5;
      this.aFloat_6768 = var1.data[2] * var2 + var1.data[6] * var3 + var1.data[10] * var4 + var1.data[14] * var5;
      this.aFloat_6765 = var1.data[3] * var2 + var1.data[7] * var3 + var1.data[11] * var4 + var1.data[15] * var5;
   }

   public Class356() {
      this.method4458();
   }
}
