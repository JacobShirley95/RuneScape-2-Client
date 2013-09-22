
public class Class219 {

   float[][] aFloatArrayArray_3771;
   int anInt_3772;
   int[] anIntArray_3773;
   int[] anIntArray_3774;
   int[] anIntArray_3775;
   int anInt_3776;


   static int method2760(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; Class163.method1999(var2, var1, -814538355) > var0; --var2) {
         ;
      }

      return var2;
   }

   Class219() {
      Class240_Sub2.method4405(24);
      this.anInt_3776 = Class240_Sub2.method4405(16);
      this.anInt_3772 = Class240_Sub2.method4405(24);
      this.anIntArray_3773 = new int[this.anInt_3772];
      boolean var1 = Class240_Sub2.method4420() != 0;
      int var2;
      int var3;
      int var5;
      if(var1) {
         var2 = 0;

         for(var3 = Class240_Sub2.method4405(5) + 1; var2 < this.anInt_3772; ++var3) {
            int var4 = Class240_Sub2.method4405(Class125.method1607(this.anInt_3772 - var2, 497600492));

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_3773[var2++] = var3;
            }
         }
      } else {
         boolean var14 = Class240_Sub2.method4420() != 0;

         for(var3 = 0; var3 < this.anInt_3772; ++var3) {
            if(var14 && Class240_Sub2.method4420() == 0) {
               this.anIntArray_3773[var3] = 0;
            } else {
               this.anIntArray_3773[var3] = Class240_Sub2.method4405(5) + 1;
            }
         }
      }

      this.method2762();
      var2 = Class240_Sub2.method4405(4);
      if(var2 > 0) {
         float var16 = Class240_Sub2.method4419(Class240_Sub2.method4405(32));
         float var15 = Class240_Sub2.method4419(Class240_Sub2.method4405(32));
         var5 = Class240_Sub2.method4405(4) + 1;
         boolean var6 = Class240_Sub2.method4420() != 0;
         int var7;
         if(var2 == 1) {
            var7 = method2760(this.anInt_3772, this.anInt_3776);
         } else {
            var7 = this.anInt_3772 * this.anInt_3776;
         }

         this.anIntArray_3774 = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.anIntArray_3774[var8] = Class240_Sub2.method4405(var5);
         }

         this.aFloatArrayArray_3771 = new float[this.anInt_3772][this.anInt_3776];
         float var9;
         int var10;
         int var11;
         if(var2 == 1) {
            for(var8 = 0; var8 < this.anInt_3772; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.anInt_3776; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.anIntArray_3774[var12] * var15 + var16 + var9;
                  this.aFloatArrayArray_3771[var8][var11] = var13;
                  if(var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.anInt_3772; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.anInt_3776;

               for(var11 = 0; var11 < this.anInt_3776; ++var11) {
                  float var17 = (float)this.anIntArray_3774[var10] * var15 + var16 + var9;
                  this.aFloatArrayArray_3771[var8][var11] = var17;
                  if(var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   float[] method2761() {
      return this.aFloatArrayArray_3771[this.method2763()];
   }

   void method2762() {
      int[] var1 = new int[this.anInt_3772];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.anInt_3772; ++var3) {
         var4 = this.anIntArray_3773[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.anIntArray_3775 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.anInt_3772; ++var3) {
         var4 = this.anIntArray_3773[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.anIntArray_3775[var6] == 0) {
                     this.anIntArray_3775[var6] = var11;
                  }

                  var6 = this.anIntArray_3775[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.anIntArray_3775.length) {
                  int[] var12 = new int[this.anIntArray_3775.length * 2];

                  for(var10 = 0; var10 < this.anIntArray_3775.length; ++var10) {
                     var12[var10] = this.anIntArray_3775[var10];
                  }

                  this.anIntArray_3775 = var12;
               }

               var8 >>>= 1;
            }

            this.anIntArray_3775[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   int method2763() {
      int var1;
      for(var1 = 0; this.anIntArray_3775[var1] >= 0; var1 = Class240_Sub2.method4420() != 0?this.anIntArray_3775[var1]:var1 + 1) {
         ;
      }

      return ~this.anIntArray_3775[var1];
   }
}
