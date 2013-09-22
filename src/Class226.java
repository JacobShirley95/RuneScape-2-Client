
public class Class226 {

   static final int anInt_3882 = 4;
   int[][][] anIntArrayArrayArray_3883 = new int[2][2][4];
   int[][][] anIntArrayArrayArray_3884 = new int[2][2][4];
   static final float aFloat_3885 = 32.703197F;
   int[] anIntArray_3886 = new int[2];
   static float[][] aFloatArrayArray_3887 = new float[2][8];
   int[] anIntArray_3888 = new int[2];
   static float aFloat_3889;
   static int anInt_3890;
   static int[][] anIntArrayArray_3891 = new int[2][8];
   static final float aFloat_3892 = 8.0F;
   static final float aFloat_3893 = 100.0F;


   float method2846(int var1, int var2, float var3) {
      float var4 = (float)this.anIntArrayArrayArray_3883[var1][0][var2] + var3 * (float)(this.anIntArrayArrayArray_3883[var1][1][var2] - this.anIntArrayArrayArray_3883[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   static float method2847(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   final void method2848(ByteArrayDataNode var1, Class309 var2) {
      int var3 = var1.readByte(1036192034);
      this.anIntArray_3888[0] = var3 >> 4;
      this.anIntArray_3888[1] = var3 & 15;
      if(var3 != 0) {
         this.anIntArray_3886[0] = var1.readShort(721316927);
         this.anIntArray_3886[1] = var1.readShort(-1088031083);
         int var4 = var1.readByte(-136984645);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.anIntArray_3888[var5]; ++var6) {
               this.anIntArrayArrayArray_3884[var5][0][var6] = var1.readShort(-1088069313);
               this.anIntArrayArrayArray_3883[var5][0][var6] = var1.readShort(1992684549);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.anIntArray_3888[var5]; ++var6) {
               if((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.anIntArrayArrayArray_3884[var5][1][var6] = var1.readShort(-303834874);
                  this.anIntArrayArrayArray_3883[var5][1][var6] = var1.readShort(1098799999);
               } else {
                  this.anIntArrayArrayArray_3884[var5][1][var6] = this.anIntArrayArrayArray_3884[var5][0][var6];
                  this.anIntArrayArrayArray_3883[var5][1][var6] = this.anIntArrayArrayArray_3883[var5][0][var6];
               }
            }
         }

         if(var4 != 0 || this.anIntArray_3886[1] != this.anIntArray_3886[0]) {
            var2.method3869(var1);
         }
      } else {
         int[] var7 = this.anIntArray_3886;
         this.anIntArray_3886[1] = 0;
         var7[0] = 0;
      }

   }

   float method2849(int var1, int var2, float var3) {
      float var4 = (float)this.anIntArrayArrayArray_3884[var1][0][var2] + var3 * (float)(this.anIntArrayArrayArray_3884[var1][1][var2] - this.anIntArrayArrayArray_3884[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method2847(var4);
   }

   int method2850(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.anIntArray_3886[0] + (float)(this.anIntArray_3886[1] - this.anIntArray_3886[0]) * var2;
         var3 *= 0.0030517578F;
         aFloat_3889 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         anInt_3890 = (int)(aFloat_3889 * 65536.0F);
      }

      if(this.anIntArray_3888[var1] == 0) {
         return 0;
      } else {
         var3 = this.method2846(var1, 0, var2);
         aFloatArrayArray_3887[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method2849(var1, 0, var2));
         aFloatArrayArray_3887[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.anIntArray_3888[var1]; ++var4) {
            var3 = this.method2846(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method2849(var1, var4, var2));
            float var6 = var3 * var3;
            aFloatArrayArray_3887[var1][var4 * 2 + 1] = aFloatArrayArray_3887[var1][var4 * 2 - 1] * var6;
            aFloatArrayArray_3887[var1][var4 * 2] = aFloatArrayArray_3887[var1][var4 * 2 - 1] * var5 + aFloatArrayArray_3887[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               aFloatArrayArray_3887[var1][var7] += aFloatArrayArray_3887[var1][var7 - 1] * var5 + aFloatArrayArray_3887[var1][var7 - 2] * var6;
            }

            aFloatArrayArray_3887[var1][1] += aFloatArrayArray_3887[var1][0] * var5 + var6;
            aFloatArrayArray_3887[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.anIntArray_3888[0] * 2; ++var4) {
               aFloatArrayArray_3887[0][var4] *= aFloat_3889;
            }
         }

         for(var4 = 0; var4 < this.anIntArray_3888[var1] * 2; ++var4) {
            anIntArrayArray_3891[var1][var4] = (int)(aFloatArrayArray_3887[var1][var4] * 65536.0F);
         }

         return this.anIntArray_3888[var1] * 2;
      }
   }
}
