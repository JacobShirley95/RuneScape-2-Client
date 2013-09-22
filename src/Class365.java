
public class Class365 {

   float[] aFloatArray_6898;
   float aFloat_6899;
   final GameCoord[] aClass347Array_6900 = new GameCoord[4];


   void method4655(int var1, GameCoord var2) {
      this.aClass347Array_6900[var1].setPos(var2);
      this.method4659();
   }

   GameCoord method4656(int var1) {
      return this.aClass347Array_6900[var1];
   }

   GameCoord method4657(float var1) {
      GameCoord var2 = new GameCoord();
      float var3 = var1 * var1;
      float var4 = var3 * var1;
      float var5 = 3.0F * (this.aClass347Array_6900[1].floatX - this.aClass347Array_6900[0].floatX);
      float var6 = 3.0F * (this.aClass347Array_6900[2].floatX - this.aClass347Array_6900[1].floatX) - var5;
      float var7 = this.aClass347Array_6900[3].floatX - this.aClass347Array_6900[0].floatX - var5 - var6;
      var2.floatX = var7 * var4 + var6 * var3 + var5 * var1 + this.aClass347Array_6900[0].floatX;
      var5 = 3.0F * (this.aClass347Array_6900[1].floatY - this.aClass347Array_6900[0].floatY);
      var6 = 3.0F * (this.aClass347Array_6900[2].floatY - this.aClass347Array_6900[1].floatY) - var5;
      var7 = this.aClass347Array_6900[3].floatY - this.aClass347Array_6900[0].floatY - var5 - var6;
      var2.floatY = var7 * var4 + var6 * var3 + var5 * var1 + this.aClass347Array_6900[0].floatY;
      var5 = 3.0F * (this.aClass347Array_6900[1].floatZ - this.aClass347Array_6900[0].floatZ);
      var6 = 3.0F * (this.aClass347Array_6900[2].floatZ - this.aClass347Array_6900[1].floatZ) - var5;
      var7 = this.aClass347Array_6900[3].floatZ - this.aClass347Array_6900[0].floatZ - var5 - var6;
      var2.floatZ = var7 * var4 + var6 * var3 + var5 * var1 + this.aClass347Array_6900[0].floatZ;
      return var2;
   }

   float method4658() {
      if(this.aFloat_6899 == -1.0F) {
         this.method4660();
      }

      return this.aFloat_6899;
   }

   void method4659() {
      this.aFloat_6899 = -1.0F;
      this.aFloatArray_6898 = null;
   }

   void method4660() {
      byte var1 = 20;
      GameCoord var2 = this.method4657(0.0F);
      float var3 = 0.0F;

      int var4;
      GameCoord var5;
      for(var4 = 1; var4 <= var1; ++var4) {
         var5 = this.method4657((float)var4 / (float)var1);
         var3 += GameCoord.distBetween(var5, var2).getHyp();
         var2 = var5;
      }

      var4 = (int)(var3 / 20.0F);
      if(var4 < var1) {
         var4 = var1;
      }

      this.aFloatArray_6898 = new float[var4];
      var2 = this.method4657(0.0F);
      float var6 = 0.0F;

      for(int var7 = 1; var7 <= var4; ++var7) {
         var5 = this.method4657((float)var7 / (float)var4);
         float var8 = GameCoord.distBetween(var5, var2).getHyp();
         var6 += var8;
         this.aFloatArray_6898[var7 - 1] = var8;
         var2 = var5;
      }

      this.aFloat_6899 = var6;
   }

   float method4661(float var1) {
      if(this.aFloat_6899 == -1.0F) {
         this.method4660();
      }

      if(var1 <= 0.0F) {
         return 0.0F;
      } else if(var1 >= this.aFloat_6899) {
         return 1.0F;
      } else {
         float var2 = 0.0F;
         float var3 = this.aFloatArray_6898[0];

         float var5;
         for(int var4 = 1; var4 < this.aFloatArray_6898.length; ++var4) {
            if(var1 < var3) {
               var5 = (var1 - var2) / (var3 - var2);
               float var6 = (float)(var4 - 1) / (float)this.aFloatArray_6898.length;
               float var7 = (float)var4 / (float)this.aFloatArray_6898.length;
               return var6 + (var7 - var6) * var5;
            }

            var2 = var3;
            var3 += this.aFloatArray_6898[var4];
         }

         float var8 = (var1 - var2) / (var3 - var2);
         var5 = (float)(this.aFloatArray_6898.length - 1) / (float)this.aFloatArray_6898.length;
         return var5 + (1.0F - var5) * var8;
      }
   }

   Class365() {
      for(int var1 = 0; var1 < 4; ++var1) {
         this.aClass347Array_6900[var1] = new GameCoord();
      }

      this.method4659();
   }
}
