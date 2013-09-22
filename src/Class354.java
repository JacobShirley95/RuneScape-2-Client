
public final class Class354 {

   public float[] aFloatArray_6752 = new float[9];


   void method4439() {
      this.aFloatArray_6752[0] = 1.0F;
      this.aFloatArray_6752[1] = 0.0F;
      this.aFloatArray_6752[2] = 0.0F;
      this.aFloatArray_6752[3] = 0.0F;
      this.aFloatArray_6752[4] = 1.0F;
      this.aFloatArray_6752[5] = 0.0F;
      this.aFloatArray_6752[6] = 0.0F;
      this.aFloatArray_6752[7] = 0.0F;
      this.aFloatArray_6752[8] = 1.0F;
   }

   public Class342 method4440() {
      Class342 var1 = new Class342();
      double var2 = (double)(1.0F + this.aFloatArray_6752[0] + this.aFloatArray_6752[4] + this.aFloatArray_6752[8]);
      float var4;
      if(var2 > 1.0E-8D) {
         var4 = (float)(Math.sqrt(var2) * 2.0D);
         var1.aFloat_6541 = (this.aFloatArray_6752[7] - this.aFloatArray_6752[5]) / var4;
         var1.aFloat_6542 = (this.aFloatArray_6752[2] - this.aFloatArray_6752[6]) / var4;
         var1.aFloat_6543 = (this.aFloatArray_6752[3] - this.aFloatArray_6752[1]) / var4;
         var1.aFloat_6538 = 0.25F * var4;
      } else if(this.aFloatArray_6752[0] > this.aFloatArray_6752[4] && this.aFloatArray_6752[0] > this.aFloatArray_6752[8]) {
         var4 = (float)(Math.sqrt((double)(1.0F + this.aFloatArray_6752[0] - this.aFloatArray_6752[4] - this.aFloatArray_6752[8])) * 2.0D);
         var1.aFloat_6541 = 0.25F * var4;
         var1.aFloat_6542 = (this.aFloatArray_6752[3] + this.aFloatArray_6752[1]) / var4;
         var1.aFloat_6543 = (this.aFloatArray_6752[2] + this.aFloatArray_6752[6]) / var4;
         var1.aFloat_6538 = (this.aFloatArray_6752[7] - this.aFloatArray_6752[5]) / var4;
      } else if(this.aFloatArray_6752[4] > this.aFloatArray_6752[8]) {
         var4 = (float)(Math.sqrt((double)(1.0F + this.aFloatArray_6752[4] - this.aFloatArray_6752[0] - this.aFloatArray_6752[8])) * 2.0D);
         var1.aFloat_6541 = (this.aFloatArray_6752[3] + this.aFloatArray_6752[1]) / var4;
         var1.aFloat_6542 = 0.25F * var4;
         var1.aFloat_6543 = (this.aFloatArray_6752[7] + this.aFloatArray_6752[5]) / var4;
         var1.aFloat_6538 = (this.aFloatArray_6752[2] - this.aFloatArray_6752[6]) / var4;
      } else {
         var4 = (float)(Math.sqrt((double)(1.0F + this.aFloatArray_6752[8] - this.aFloatArray_6752[0] - this.aFloatArray_6752[4])) * 2.0D);
         var1.aFloat_6541 = (this.aFloatArray_6752[2] + this.aFloatArray_6752[6]) / var4;
         var1.aFloat_6542 = (this.aFloatArray_6752[7] + this.aFloatArray_6752[5]) / var4;
         var1.aFloat_6543 = 0.25F * var4;
         var1.aFloat_6538 = (this.aFloatArray_6752[3] - this.aFloatArray_6752[1]) / var4;
      }

      return var1;
   }

   public Class354() {
      this.method4439();
   }
}
