import java.util.Arrays;

public final class ArrayViewport {

   public float[] data = new float[16];
   public static final ArrayViewport anArrayViewport_6782 = new ArrayViewport();


   public ArrayViewport(ArrayViewport var1) {
      this.replaceWith(var1);
   }

   public void reset() {
      this.data[0] = 1.0F;
      this.data[1] = 0.0F;
      this.data[2] = 0.0F;
      this.data[3] = 0.0F;
      this.data[4] = 0.0F;
      this.data[5] = 1.0F;
      this.data[6] = 0.0F;
      this.data[7] = 0.0F;
      this.data[8] = 0.0F;
      this.data[9] = 0.0F;
      this.data[10] = 1.0F;
      this.data[11] = 0.0F;
      this.data[12] = 0.0F;
      this.data[13] = 0.0F;
      this.data[14] = 0.0F;
      this.data[15] = 1.0F;
   }

   public void replaceWith(ArrayViewport var1) {
      System.arraycopy(var1.data, 0, this.data, 0, 16);
   }

   public void method4552(ArrayViewport var1) {
      System.arraycopy(var1.data, 0, this.data, 0, 11);
      this.data[3] = 0.0F;
      this.data[7] = 0.0F;
      this.data[11] = 0.0F;
      this.data[12] = 0.0F;
      this.data[13] = 0.0F;
      this.data[14] = 0.0F;
      this.data[15] = 1.0F;
   }

   public float[] method4553(float[] var1) {
      float var2 = this.data[3] - this.data[1];
      float var3 = this.data[7] - this.data[5];
      float var4 = this.data[11] - this.data[9];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.data[15] - this.data[13]) / var5);
      return var1;
   }

   public void setViewport(Viewport var1) {
      this.data[0] = var1.maxX;
      this.data[1] = var1.aFloat_6838;
      this.data[2] = var1.aFloat_6836;
      this.data[3] = 0.0F;
      this.data[4] = var1.aFloat_6834;
      this.data[5] = var1.maxY;
      this.data[6] = var1.aFloat_6840;
      this.data[7] = 0.0F;
      this.data[8] = var1.aFloat_6837;
      this.data[9] = var1.aFloat_6842;
      this.data[10] = var1.maxZ;
      this.data[11] = 0.0F;
      this.data[12] = var1.offsetX;
      this.data[13] = var1.offsetY;
      this.data[14] = var1.offsetZ;
      this.data[15] = 1.0F;
   }

   float method4555() {
      return this.data[0] * this.data[5] * this.data[10] * this.data[15] - this.data[0] * this.data[5] * this.data[11] * this.data[14] - this.data[0] * this.data[6] * this.data[9] * this.data[15] + this.data[0] * this.data[6] * this.data[11] * this.data[13] + this.data[0] * this.data[7] * this.data[9] * this.data[14] - this.data[0] * this.data[7] * this.data[10] * this.data[13] - this.data[1] * this.data[4] * this.data[10] * this.data[15] + this.data[1] * this.data[4] * this.data[11] * this.data[14] + this.data[1] * this.data[6] * this.data[8] * this.data[15] - this.data[1] * this.data[6] * this.data[11] * this.data[12] - this.data[1] * this.data[7] * this.data[8] * this.data[14] + this.data[1] * this.data[7] * this.data[10] * this.data[12] + this.data[2] * this.data[4] * this.data[9] * this.data[15] - this.data[2] * this.data[4] * this.data[11] * this.data[13] - this.data[2] * this.data[5] * this.data[8] * this.data[15] + this.data[2] * this.data[5] * this.data[11] * this.data[12] + this.data[2] * this.data[7] * this.data[8] * this.data[13] - this.data[2] * this.data[7] * this.data[9] * this.data[12] - this.data[3] * this.data[4] * this.data[9] * this.data[14] + this.data[3] * this.data[4] * this.data[10] * this.data[13] + this.data[3] * this.data[5] * this.data[8] * this.data[14] - this.data[3] * this.data[5] * this.data[10] * this.data[12] - this.data[3] * this.data[6] * this.data[8] * this.data[13] + this.data[3] * this.data[6] * this.data[9] * this.data[12];
   }

   public void method4556() {
      float var1 = 1.0F / this.method4555();
      float var2 = (this.data[5] * this.data[10] * this.data[15] - this.data[5] * this.data[11] * this.data[14] - this.data[6] * this.data[9] * this.data[15] + this.data[6] * this.data[11] * this.data[13] + this.data[7] * this.data[9] * this.data[14] - this.data[7] * this.data[10] * this.data[13]) * var1;
      float var3 = (-this.data[1] * this.data[10] * this.data[15] + this.data[1] * this.data[11] * this.data[14] + this.data[2] * this.data[9] * this.data[15] - this.data[2] * this.data[11] * this.data[13] - this.data[3] * this.data[9] * this.data[14] + this.data[3] * this.data[10] * this.data[13]) * var1;
      float var4 = (this.data[1] * this.data[6] * this.data[15] - this.data[1] * this.data[7] * this.data[14] - this.data[2] * this.data[5] * this.data[15] + this.data[2] * this.data[7] * this.data[13] + this.data[3] * this.data[5] * this.data[14] - this.data[3] * this.data[6] * this.data[13]) * var1;
      float var5 = (-this.data[1] * this.data[6] * this.data[11] + this.data[1] * this.data[7] * this.data[10] + this.data[2] * this.data[5] * this.data[11] - this.data[2] * this.data[7] * this.data[9] - this.data[3] * this.data[5] * this.data[10] + this.data[3] * this.data[6] * this.data[9]) * var1;
      float var6 = (-this.data[4] * this.data[10] * this.data[15] + this.data[4] * this.data[11] * this.data[14] + this.data[6] * this.data[8] * this.data[15] - this.data[6] * this.data[11] * this.data[12] - this.data[7] * this.data[8] * this.data[14] + this.data[7] * this.data[10] * this.data[12]) * var1;
      float var7 = (this.data[0] * this.data[10] * this.data[15] - this.data[0] * this.data[11] * this.data[14] - this.data[2] * this.data[8] * this.data[15] + this.data[2] * this.data[11] * this.data[12] + this.data[3] * this.data[8] * this.data[14] - this.data[3] * this.data[10] * this.data[12]) * var1;
      float var8 = (-this.data[0] * this.data[6] * this.data[15] + this.data[0] * this.data[7] * this.data[14] + this.data[2] * this.data[4] * this.data[15] - this.data[2] * this.data[7] * this.data[12] - this.data[3] * this.data[4] * this.data[14] + this.data[3] * this.data[6] * this.data[12]) * var1;
      float var9 = (this.data[0] * this.data[6] * this.data[11] - this.data[0] * this.data[7] * this.data[10] - this.data[2] * this.data[4] * this.data[11] + this.data[2] * this.data[7] * this.data[8] + this.data[3] * this.data[4] * this.data[10] - this.data[3] * this.data[6] * this.data[8]) * var1;
      float var10 = (this.data[4] * this.data[9] * this.data[15] - this.data[4] * this.data[11] * this.data[13] - this.data[5] * this.data[8] * this.data[15] + this.data[5] * this.data[11] * this.data[12] + this.data[7] * this.data[8] * this.data[13] - this.data[7] * this.data[9] * this.data[12]) * var1;
      float var11 = (-this.data[0] * this.data[9] * this.data[15] + this.data[0] * this.data[11] * this.data[13] + this.data[1] * this.data[8] * this.data[15] - this.data[1] * this.data[11] * this.data[12] - this.data[3] * this.data[8] * this.data[13] + this.data[3] * this.data[9] * this.data[12]) * var1;
      float var12 = (this.data[0] * this.data[5] * this.data[15] - this.data[0] * this.data[7] * this.data[13] - this.data[1] * this.data[4] * this.data[15] + this.data[1] * this.data[7] * this.data[12] + this.data[3] * this.data[4] * this.data[13] - this.data[3] * this.data[5] * this.data[12]) * var1;
      float var13 = (-this.data[0] * this.data[5] * this.data[11] + this.data[0] * this.data[7] * this.data[9] + this.data[1] * this.data[4] * this.data[11] - this.data[1] * this.data[7] * this.data[8] - this.data[3] * this.data[4] * this.data[9] + this.data[3] * this.data[5] * this.data[8]) * var1;
      float var14 = (-this.data[4] * this.data[9] * this.data[14] + this.data[4] * this.data[10] * this.data[13] + this.data[5] * this.data[8] * this.data[14] - this.data[5] * this.data[10] * this.data[12] - this.data[6] * this.data[8] * this.data[13] + this.data[6] * this.data[9] * this.data[12]) * var1;
      float var15 = (this.data[0] * this.data[9] * this.data[14] - this.data[0] * this.data[10] * this.data[13] - this.data[1] * this.data[8] * this.data[14] + this.data[1] * this.data[10] * this.data[12] + this.data[2] * this.data[8] * this.data[13] - this.data[2] * this.data[9] * this.data[12]) * var1;
      float var16 = (-this.data[0] * this.data[5] * this.data[14] + this.data[0] * this.data[6] * this.data[13] + this.data[1] * this.data[4] * this.data[14] - this.data[1] * this.data[6] * this.data[12] - this.data[2] * this.data[4] * this.data[13] + this.data[2] * this.data[5] * this.data[12]) * var1;
      float var17 = (this.data[0] * this.data[5] * this.data[10] - this.data[0] * this.data[6] * this.data[9] - this.data[1] * this.data[4] * this.data[10] + this.data[1] * this.data[6] * this.data[8] + this.data[2] * this.data[4] * this.data[9] - this.data[2] * this.data[5] * this.data[8]) * var1;
      this.data[0] = var2;
      this.data[1] = var3;
      this.data[2] = var4;
      this.data[3] = var5;
      this.data[4] = var6;
      this.data[5] = var7;
      this.data[6] = var8;
      this.data[7] = var9;
      this.data[8] = var10;
      this.data[9] = var11;
      this.data[10] = var12;
      this.data[11] = var13;
      this.data[12] = var14;
      this.data[13] = var15;
      this.data[14] = var16;
      this.data[15] = var17;
   }

   public void method4557(float var1, float var2, float var3, float var4) {
      this.data[0] = var1;
      this.data[1] = 0.0F;
      this.data[2] = 0.0F;
      this.data[3] = 0.0F;
      this.data[4] = 0.0F;
      this.data[5] = var2;
      this.data[6] = 0.0F;
      this.data[7] = 0.0F;
      this.data[8] = 0.0F;
      this.data[9] = 0.0F;
      this.data[10] = var3;
      this.data[11] = 0.0F;
      this.data[12] = 0.0F;
      this.data[13] = 0.0F;
      this.data[14] = 0.0F;
      this.data[15] = var4;
   }

   public void method4558(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.data[0] * var1 + this.data[4] * var2 + this.data[8] * var3 + this.data[12];
      var4[1] = this.data[1] * var1 + this.data[5] * var2 + this.data[9] * var3 + this.data[13];
      var4[2] = this.data[2] * var1 + this.data[6] * var2 + this.data[10] * var3 + this.data[14];
      if(var4.length > 3) {
         var4[3] = this.data[3] * var1 + this.data[7] * var2 + this.data[11] * var3 + this.data[15];
      }

   }

   public void method4559(float[] var1) {
      float var2 = var1[0];
      float var3 = var1[1];
      float var4 = var1[2];
      var1[0] = this.data[0] * var2 + this.data[4] * var3 + this.data[8] * var4 + this.data[12];
      var1[1] = this.data[1] * var2 + this.data[5] * var3 + this.data[9] * var4 + this.data[13];
      var1[2] = this.data[2] * var2 + this.data[6] * var3 + this.data[10] * var4 + this.data[14];
   }

   public ArrayViewport() {
      this.reset();
   }

   public void method4560(float var1, float var2, float var3, float var4) {
      float var5 = (float)(Math.tan((double)(var3 / 2.0F)) * (double)var1);
      float var6 = (float)(Math.tan((double)(var4 / 2.0F)) * (double)var1);
      this.method4562(-var5, var5, -var6, var6, var1, var2);
   }

   public float[] method4561(float[] var1) {
      System.arraycopy(this.data, 0, var1, 0, 16);
      var1[3] = 0.0F;
      var1[7] = 0.0F;
      var1[11] = 0.0F;
      var1[12] = 0.0F;
      var1[13] = 0.0F;
      var1[14] = 0.0F;
      var1[15] = 1.0F;
      return var1;
   }

   void method4562(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.data[0] = 2.0F * var5 / (var2 - var1);
      this.data[1] = 0.0F;
      this.data[2] = 0.0F;
      this.data[3] = 0.0F;
      this.data[4] = 0.0F;
      this.data[5] = 2.0F * var5 / (var4 - var3);
      this.data[6] = 0.0F;
      this.data[7] = 0.0F;
      this.data[8] = (var2 + var1) / (var2 - var1);
      this.data[9] = (var4 + var3) / (var4 - var3);
      this.data[10] = (var6 + var5) / (var6 - var5);
      this.data[11] = 1.0F;
      this.data[12] = 0.0F;
      this.data[13] = 0.0F;
      this.data[14] = -(2.0F * var6 * var5) / (var6 - var5);
      this.data[15] = 0.0F;
   }

   public void method4563(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.data[0] = var3 * 2.0F / var7;
      this.data[1] = 0.0F;
      this.data[2] = 0.0F;
      this.data[3] = 0.0F;
      this.data[4] = 0.0F;
      this.data[5] = var4 * 2.0F / var8;
      this.data[6] = 0.0F;
      this.data[7] = 0.0F;
      this.data[8] = 2.0F * var1 / var7 - 1.0F;
      this.data[9] = 2.0F * var2 / var8 - 1.0F;
      this.data[10] = (var6 + var5) / (var6 - var5);
      this.data[11] = 1.0F;
      this.data[12] = 0.0F;
      this.data[13] = 0.0F;
      this.data[14] = 2.0F * var6 * var5 / (var5 - var6);
      this.data[15] = 0.0F;
   }

   public float method4564() {
      return -(this.data[15] + this.data[14]) / (this.data[11] + this.data[10]);
   }

   public float method4565() {
      return (this.data[14] - this.data[15]) / (this.data[11] - this.data[10]);
   }

   public float[] method4566(float[] var1) {
      var1[0] = this.data[0];
      var1[1] = this.data[1];
      var1[2] = 0.0F;
      var1[3] = 0.0F;
      var1[4] = this.data[4];
      var1[5] = this.data[5];
      var1[6] = 0.0F;
      var1[7] = 0.0F;
      var1[8] = this.data[12];
      var1[9] = this.data[13];
      var1[10] = this.data[14];
      var1[11] = 0.0F;
      var1[12] = 0.0F;
      var1[13] = 0.0F;
      var1[14] = 0.0F;
      var1[15] = 1.0F;
      return var1;
   }

   public float[] method4567(float[] var1) {
      float var2 = this.data[3] - this.data[0];
      float var3 = this.data[7] - this.data[4];
      float var4 = this.data[11] - this.data[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.data[15] - this.data[12]) / var5);
      return var1;
   }

   public float[] method4568(float[] var1) {
      float var2 = this.data[3] + this.data[1];
      float var3 = this.data[7] + this.data[5];
      float var4 = this.data[11] + this.data[9];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.data[15] + this.data[13]) / var5);
      return var1;
   }

   public void method4569() {
      float var1 = this.data[0];
      float var2 = this.data[4];
      float var3 = this.data[8];
      float var4 = this.data[12];
      float var5 = this.data[1];
      float var6 = this.data[5];
      float var7 = this.data[9];
      float var8 = this.data[13];
      float var9 = this.data[2];
      float var10 = this.data[6];
      float var11 = this.data[10];
      float var12 = this.data[14];
      float var13 = this.data[3];
      float var14 = this.data[7];
      float var15 = this.data[11];
      float var16 = this.data[15];
      this.data[0] = var1;
      this.data[1] = var2;
      this.data[2] = var3;
      this.data[3] = var4;
      this.data[4] = var5;
      this.data[5] = var6;
      this.data[6] = var7;
      this.data[7] = var8;
      this.data[8] = var9;
      this.data[9] = var10;
      this.data[10] = var11;
      this.data[11] = var12;
      this.data[12] = var13;
      this.data[13] = var14;
      this.data[14] = var15;
      this.data[15] = var16;
   }

   public float[] method4570(float[] var1) {
      System.arraycopy(this.data, 0, var1, 0, 16);
      return var1;
   }

   public float[] method4571(float[] var1) {
      var1[0] = this.data[0];
      var1[1] = this.data[4];
      var1[2] = this.data[8];
      var1[3] = this.data[12];
      var1[4] = this.data[1];
      var1[5] = this.data[5];
      var1[6] = this.data[9];
      var1[7] = this.data[13];
      var1[8] = this.data[2];
      var1[9] = this.data[6];
      var1[10] = this.data[10];
      var1[11] = this.data[14];
      var1[12] = this.data[3];
      var1[13] = this.data[7];
      var1[14] = this.data[11];
      var1[15] = this.data[15];
      return var1;
   }

   public float[] method4572(float[] var1) {
      var1[0] = this.data[0];
      var1[1] = this.data[1];
      var1[2] = this.data[2];
      var1[3] = this.data[4];
      var1[4] = this.data[5];
      var1[5] = this.data[6];
      var1[6] = this.data[8];
      var1[7] = this.data[9];
      var1[8] = this.data[10];
      return var1;
   }

   public int hashCode() {
      byte var1 = 1;
      int var2 = 31 * var1 + Arrays.hashCode(this.data);
      return var2;
   }

   public float[] method4574(float[] var1) {
      var1[0] = this.data[0];
      var1[1] = this.data[1];
      var1[2] = this.data[4];
      var1[3] = this.data[5];
      var1[4] = this.data[8];
      var1[5] = this.data[9];
      var1[6] = this.data[12];
      var1[7] = this.data[13];
      return var1;
   }

   public float[] method4575(float[] var1) {
      var1[0] = this.data[0];
      var1[1] = this.data[4];
      var1[2] = this.data[8];
      var1[3] = this.data[12];
      var1[4] = this.data[1];
      var1[5] = this.data[5];
      var1[6] = this.data[9];
      var1[7] = this.data[13];
      return var1;
   }

   public void method4576(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.data[0] * var1 + this.data[4] * var2 + this.data[8] * var3;
      var4[1] = this.data[1] * var1 + this.data[5] * var2 + this.data[9] * var3;
      var4[2] = this.data[2] * var1 + this.data[6] * var2 + this.data[10] * var3;
      if(var4.length > 3) {
         var4[3] = this.data[3] * var1 + this.data[7] * var2 + this.data[11] * var3;
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if(var3 > 0) {
               var1.append("\t");
            }

            var1.append(this.data[var2 * 4 + var3]);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public void method4578(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.method4587(-(var1 * var9) / var3, var9 * (var7 - var1) / var3, -(var2 * var9) / var4, var9 * (var8 - var2) / var4, var5, var6);
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof ArrayViewport)) {
         return false;
      } else {
         ArrayViewport var2 = (ArrayViewport)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if(this.data[var3] != var2.data[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public void method4580(ArrayViewport var1) {
      float var2 = this.data[0] * var1.data[0] + this.data[1] * var1.data[4] + this.data[2] * var1.data[8] + this.data[3] * var1.data[12];
      float var3 = this.data[0] * var1.data[1] + this.data[1] * var1.data[5] + this.data[2] * var1.data[9] + this.data[3] * var1.data[13];
      float var4 = this.data[0] * var1.data[2] + this.data[1] * var1.data[6] + this.data[2] * var1.data[10] + this.data[3] * var1.data[14];
      float var5 = this.data[0] * var1.data[3] + this.data[1] * var1.data[7] + this.data[2] * var1.data[11] + this.data[3] * var1.data[15];
      float var6 = this.data[4] * var1.data[0] + this.data[5] * var1.data[4] + this.data[6] * var1.data[8] + this.data[7] * var1.data[12];
      float var7 = this.data[4] * var1.data[1] + this.data[5] * var1.data[5] + this.data[6] * var1.data[9] + this.data[7] * var1.data[13];
      float var8 = this.data[4] * var1.data[2] + this.data[5] * var1.data[6] + this.data[6] * var1.data[10] + this.data[7] * var1.data[14];
      float var9 = this.data[4] * var1.data[3] + this.data[5] * var1.data[7] + this.data[6] * var1.data[11] + this.data[7] * var1.data[15];
      float var10 = this.data[8] * var1.data[0] + this.data[9] * var1.data[4] + this.data[10] * var1.data[8] + this.data[11] * var1.data[12];
      float var11 = this.data[8] * var1.data[1] + this.data[9] * var1.data[5] + this.data[10] * var1.data[9] + this.data[11] * var1.data[13];
      float var12 = this.data[8] * var1.data[2] + this.data[9] * var1.data[6] + this.data[10] * var1.data[10] + this.data[11] * var1.data[14];
      float var13 = this.data[8] * var1.data[3] + this.data[9] * var1.data[7] + this.data[10] * var1.data[11] + this.data[11] * var1.data[15];
      float var14 = this.data[12] * var1.data[0] + this.data[13] * var1.data[4] + this.data[14] * var1.data[8] + this.data[15] * var1.data[12];
      float var15 = this.data[12] * var1.data[1] + this.data[13] * var1.data[5] + this.data[14] * var1.data[9] + this.data[15] * var1.data[13];
      float var16 = this.data[12] * var1.data[2] + this.data[13] * var1.data[6] + this.data[14] * var1.data[10] + this.data[15] * var1.data[14];
      float var17 = this.data[12] * var1.data[3] + this.data[13] * var1.data[7] + this.data[14] * var1.data[11] + this.data[15] * var1.data[15];
      this.data[0] = var2;
      this.data[1] = var3;
      this.data[2] = var4;
      this.data[3] = var5;
      this.data[4] = var6;
      this.data[5] = var7;
      this.data[6] = var8;
      this.data[7] = var9;
      this.data[8] = var10;
      this.data[9] = var11;
      this.data[10] = var12;
      this.data[11] = var13;
      this.data[12] = var14;
      this.data[13] = var15;
      this.data[14] = var16;
      this.data[15] = var17;
   }

   public void method4581(int var1, int var2, int var3, float var4, float var5, float var6) {
      float[] var9;
      float[] var10;
      float[] var11;
      float[] var12;
      float[] var13;
      if(var1 != 0) {
         float var7 = Class360.aFloatArray_6795[var1 & 16383];
         float var8 = Class360.aFloatArray_6796[var1 & 16383];
         this.data[0] = var7 * (float)var2;
         this.data[5] = var7 * (float)var3;
         this.data[1] = var8 * (float)var2;
         this.data[4] = -var8 * (float)var3;
         this.data[10] = 1.0F;
         var9 = this.data;
         var10 = this.data;
         var11 = this.data;
         this.data[9] = 0.0F;
         var11[8] = 0.0F;
         var10[6] = 0.0F;
         var9[2] = 0.0F;
      } else {
         this.data[0] = (float)var2;
         this.data[5] = (float)var3;
         this.data[10] = 1.0F;
         var12 = this.data;
         var13 = this.data;
         var9 = this.data;
         var10 = this.data;
         var11 = this.data;
         this.data[9] = 0.0F;
         var11[8] = 0.0F;
         var10[6] = 0.0F;
         var9[4] = 0.0F;
         var13[2] = 0.0F;
         var12[1] = 0.0F;
      }

      var12 = this.data;
      var13 = this.data;
      this.data[11] = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.data[15] = 1.0F;
      this.data[12] = var4;
      this.data[13] = var5;
      this.data[14] = var6;
   }

   public float[] method4582(float[] var1) {
      float var2 = this.data[3] - this.data[2];
      float var3 = this.data[7] - this.data[6];
      float var4 = this.data[11] - this.data[10];
      double dist = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / dist);
      var1[1] = (float)((double)var3 / dist);
      var1[2] = (float)((double)var4 / dist);
      var1[3] = (float)((double)(this.data[15] - this.data[14]) / dist);
      return var1;
   }

   public float[] method4583(float[] var1) {
      float var2 = this.data[3] + this.data[0];
      float var3 = this.data[7] + this.data[4];
      float var4 = this.data[11] + this.data[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.data[15] + this.data[12]) / var5);
      return var1;
   }

   public float[] method4584(float[] var1) {
      float var2 = this.data[3] + this.data[2];
      float var3 = this.data[7] + this.data[6];
      float var4 = this.data[11] + this.data[10];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.data[15] + this.data[14]) / var5);
      return var1;
   }

   public void method4585(float var1, float var2, float var3) {
      this.method4587(-10000.0F / var3, 10000.0F / var3, -10000.0F / var3, 10000.0F / var3, var1, var2);
   }

   public void method4586(ArrayViewport var1, ArrayViewport var2) {
      float var3 = var1.data[0] * var2.data[0] + var1.data[1] * var2.data[4] + var1.data[2] * var2.data[8] + var1.data[3] * var2.data[12];
      float var4 = var1.data[0] * var2.data[1] + var1.data[1] * var2.data[5] + var1.data[2] * var2.data[9] + var1.data[3] * var2.data[13];
      float var5 = var1.data[0] * var2.data[2] + var1.data[1] * var2.data[6] + var1.data[2] * var2.data[10] + var1.data[3] * var2.data[14];
      float var6 = var1.data[0] * var2.data[3] + var1.data[1] * var2.data[7] + var1.data[2] * var2.data[11] + var1.data[3] * var2.data[15];
      float var7 = var1.data[4] * var2.data[0] + var1.data[5] * var2.data[4] + var1.data[6] * var2.data[8] + var1.data[7] * var2.data[12];
      float var8 = var1.data[4] * var2.data[1] + var1.data[5] * var2.data[5] + var1.data[6] * var2.data[9] + var1.data[7] * var2.data[13];
      float var9 = var1.data[4] * var2.data[2] + var1.data[5] * var2.data[6] + var1.data[6] * var2.data[10] + var1.data[7] * var2.data[14];
      float var10 = var1.data[4] * var2.data[3] + var1.data[5] * var2.data[7] + var1.data[6] * var2.data[11] + var1.data[7] * var2.data[15];
      float var11 = var1.data[8] * var2.data[0] + var1.data[9] * var2.data[4] + var1.data[10] * var2.data[8] + var1.data[11] * var2.data[12];
      float var12 = var1.data[8] * var2.data[1] + var1.data[9] * var2.data[5] + var1.data[10] * var2.data[9] + var1.data[11] * var2.data[13];
      float var13 = var1.data[8] * var2.data[2] + var1.data[9] * var2.data[6] + var1.data[10] * var2.data[10] + var1.data[11] * var2.data[14];
      float var14 = var1.data[8] * var2.data[3] + var1.data[9] * var2.data[7] + var1.data[10] * var2.data[11] + var1.data[11] * var2.data[15];
      float var15 = var1.data[12] * var2.data[0] + var1.data[13] * var2.data[4] + var1.data[14] * var2.data[8] + var1.data[15] * var2.data[12];
      float var16 = var1.data[12] * var2.data[1] + var1.data[13] * var2.data[5] + var1.data[14] * var2.data[9] + var1.data[15] * var2.data[13];
      float var17 = var1.data[12] * var2.data[2] + var1.data[13] * var2.data[6] + var1.data[14] * var2.data[10] + var1.data[15] * var2.data[14];
      float var18 = var1.data[12] * var2.data[3] + var1.data[13] * var2.data[7] + var1.data[14] * var2.data[11] + var1.data[15] * var2.data[15];
      this.data[0] = var3;
      this.data[1] = var4;
      this.data[2] = var5;
      this.data[3] = var6;
      this.data[4] = var7;
      this.data[5] = var8;
      this.data[6] = var9;
      this.data[7] = var10;
      this.data[8] = var11;
      this.data[9] = var12;
      this.data[10] = var13;
      this.data[11] = var14;
      this.data[12] = var15;
      this.data[13] = var16;
      this.data[14] = var17;
      this.data[15] = var18;
   }

   public void method4587(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.data[0] = 2.0F / (var2 - var1);
      this.data[1] = 0.0F;
      this.data[2] = 0.0F;
      this.data[3] = 0.0F;
      this.data[4] = 0.0F;
      this.data[5] = 2.0F / (var4 - var3);
      this.data[6] = 0.0F;
      this.data[7] = 0.0F;
      this.data[8] = 0.0F;
      this.data[9] = 0.0F;
      this.data[10] = 2.0F / (var6 - var5);
      this.data[11] = 0.0F;
      this.data[12] = -(var2 + var1) / (var2 - var1);
      this.data[13] = -(var4 + var3) / (var4 - var3);
      this.data[14] = -(var6 + var5) / (var6 - var5);
      this.data[15] = 1.0F;
   }

   public boolean method4588() {
      return this.data[0] == 1.0F && this.data[1] == 0.0F && this.data[2] == 0.0F && this.data[3] == 0.0F && this.data[4] == 0.0F && this.data[5] == 1.0F && this.data[6] == 0.0F && this.data[7] == 0.0F && this.data[8] == 0.0F && this.data[9] == 0.0F && this.data[10] == 1.0F && this.data[11] == 0.0F && this.data[12] == 0.0F && this.data[13] == 0.0F && this.data[14] == 0.0F && this.data[15] == 1.0F;
   }
}
