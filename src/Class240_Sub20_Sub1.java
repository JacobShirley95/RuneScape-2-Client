
public class Class240_Sub20_Sub1 extends Class240_Sub20 {

   int anInt_3716 = 1163357930;
   int anInt_3717 = 1859778628;
   static final int anInt_3718 = 4;
   static final int anInt_3719 = 1638;
   byte[] aByteArray_3720 = new byte[512];
   short[] aShortArray_3721;
   short[] aShortArray_3722;
   static final int anInt_3723 = 0;
   int anInt_3724 = 0;
   int anInt_3725 = -482299428;
   static final int anInt_3726 = 4;
   int anInt_3727 = 135105732;
   static final boolean aBoolean_3728 = true;
   boolean aBoolean_3729 = true;
   static final int anInt_3730 = 8;


   void method2689(int var1, int[] var2, int var3) {
      int var4 = -145476879 * this.anInt_3717 * Class479.anIntArray_8750[var1];
      short var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var17;
      int var16;
      if(896079313 * this.anInt_3727 == 1) {
         var5 = this.aShortArray_3721[0];
         var6 = this.aShortArray_3722[0] << 12;
         var7 = -145476879 * this.anInt_3717 * var6 >> 12;
         var8 = -980193977 * this.anInt_3725 * var6 >> 12;
         var9 = var4 * var6 >> 12;
         var10 = var9 >> 12;
         var11 = 1 + var10;
         if(var11 >= var7) {
            var11 = 0;
         }

         var9 &= 4095;
         var12 = Class333.anIntArray_6434[var9];
         var13 = this.aByteArray_3720[var10 & 255] & 255;
         var14 = this.aByteArray_3720[var11 & 255] & 255;
         if(this.aBoolean_3729) {
            for(var15 = 0; var15 < -1021356107 * Class479.anInt_8754; ++var15) {
               var16 = Class479.anIntArray_8751[var15] * this.anInt_3725 * -980193977;
               var17 = this.method2690(var6 * var16 >> 12, var9, var13, var14, var12, var8, 1538011316);
               var17 = var5 * var17 >> 12;
               var2[var15] = (var17 >> 1) + 2048;
            }
         } else {
            for(var15 = 0; var15 < Class479.anInt_8754 * -1021356107; ++var15) {
               var16 = Class479.anIntArray_8751[var15] * this.anInt_3725 * -980193977;
               var17 = this.method2690(var16 * var6 >> 12, var9, var13, var14, var12, var8, -1029015385);
               var2[var15] = var17 * var5 >> 12;
            }
         }
      } else {
         var5 = this.aShortArray_3721[0];
         if(var5 > 8 || var5 < -8) {
            var6 = this.aShortArray_3722[0] << 12;
            var7 = var6 * -145476879 * this.anInt_3717 >> 12;
            var8 = var6 * this.anInt_3725 * -980193977 >> 12;
            var9 = var4 * var6 >> 12;
            var10 = var9 >> 12;
            var11 = var10 + 1;
            if(var11 >= var7) {
               var11 = 0;
            }

            var9 &= 4095;
            var12 = Class333.anIntArray_6434[var9];
            var13 = this.aByteArray_3720[var10 & 255] & 255;
            var14 = this.aByteArray_3720[var11 & 255] & 255;

            for(var15 = 0; var15 < -1021356107 * Class479.anInt_8754; ++var15) {
               var16 = Class479.anIntArray_8751[var15] * -980193977 * this.anInt_3725;
               var17 = this.method2690(var16 * var6 >> 12, var9, var13, var14, var12, var8, 1551505815);
               var2[var15] = var17 * var5 >> 12;
            }
         }

         for(int var18 = 1; var18 < 896079313 * this.anInt_3727; ++var18) {
            var5 = this.aShortArray_3721[var18];
            if(var5 > 8 || var5 < -8) {
               var6 = this.aShortArray_3722[var18] << 12;
               var7 = var6 * -145476879 * this.anInt_3717 >> 12;
               var8 = var6 * -980193977 * this.anInt_3725 >> 12;
               var9 = var4 * var6 >> 12;
               var10 = var9 >> 12;
               var11 = var10 + 1;
               if(var11 >= var7) {
                  var11 = 0;
               }

               var9 &= 4095;
               var12 = Class333.anIntArray_6434[var9];
               var13 = this.aByteArray_3720[var10 & 255] & 255;
               var14 = this.aByteArray_3720[var11 & 255] & 255;
               if(this.aBoolean_3729 && var18 == 896079313 * this.anInt_3727 - 1) {
                  for(var15 = 0; var15 < -1021356107 * Class479.anInt_8754; ++var15) {
                     var16 = Class479.anIntArray_8751[var15] * -980193977 * this.anInt_3725;
                     var17 = this.method2690(var16 * var6 >> 12, var9, var13, var14, var12, var8, -756783555);
                     var17 = (var17 * var5 >> 12) + var2[var15];
                     var2[var15] = 2048 + (var17 >> 1);
                  }
               } else {
                  for(var15 = 0; var15 < Class479.anInt_8754 * -1021356107; ++var15) {
                     var16 = Class479.anIntArray_8751[var15] * -980193977 * this.anInt_3725;
                     var17 = this.method2690(var16 * var6 >> 12, var9, var13, var14, var12, var8, -1149021879);
                     var2[var15] += var17 * var5 >> 12;
                  }
               }
            }
         }
      }

   }

   int method2690(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 >> 12;
      int var9 = var8 + 1;
      if(var9 >= var6) {
         var9 = 0;
      }

      var1 &= 4095;
      var8 &= 255;
      var9 &= 255;
      int var10 = var1 - 4096;
      int var11 = var2 - 4096;
      int var12 = Class333.anIntArray_6434[var1];
      int var13 = this.aByteArray_3720[var8 + var3] & 3;
      int var14;
      if(var13 <= 1) {
         var14 = 0 == var13?var1 + var2:var2 - var1;
      } else {
         var14 = 2 == var13?var1 - var2:-var1 - var2;
      }

      var13 = this.aByteArray_3720[var9 + var3] & 3;
      int var15;
      if(var13 <= 1) {
         var15 = 0 == var13?var10 + var2:var2 - var10;
      } else {
         var15 = 2 == var13?var10 - var2:-var10 - var2;
      }

      int var16 = var14 + (var12 * (var15 - var14) >> 12);
      var13 = this.aByteArray_3720[var8 + var4] & 3;
      if(var13 <= 1) {
         var14 = 0 == var13?var11 + var1:var11 - var1;
      } else {
         var14 = var13 == 2?var1 - var11:-var1 - var11;
      }

      var13 = this.aByteArray_3720[var4 + var9] & 3;
      if(var13 <= 1) {
         var15 = var13 == 0?var10 + var11:var11 - var10;
      } else {
         var15 = var13 == 2?var10 - var11:-var10 - var11;
      }

      int var17 = var14 + ((var15 - var14) * var12 >> 12);
      return ((var17 - var16) * var5 >> 12) + var16;
   }

   void method2691(int var1) {
      this.aByteArray_3720 = Class479.method5696(-459971445 * this.anInt_3724, 784459742);
      this.method2692((byte)24);

      for(int var2 = 896079313 * this.anInt_3727 - 1; var2 >= 1; --var2) {
         short var3 = this.aShortArray_3721[var2];
         if(var3 > 8 || var3 < -8) {
            break;
         }

         this.anInt_3727 -= 1107518257;
      }

   }

   void method2692(byte var1) {
      int var2;
      if(-1204477177 * this.anInt_3716 > 0) {
         this.aShortArray_3721 = new short[this.anInt_3727 * 896079313];
         this.aShortArray_3722 = new short[this.anInt_3727 * 896079313];

         for(var2 = 0; var2 < this.anInt_3727 * 896079313; ++var2) {
            this.aShortArray_3721[var2] = (short)((int)(Math.pow((double)((float)(this.anInt_3716 * -1204477177) / 4096.0F), (double)var2) * 4096.0D));
            this.aShortArray_3722[var2] = (short)((int)Math.pow(2.0D, (double)var2));
         }
      } else if(null != this.aShortArray_3721 && 896079313 * this.anInt_3727 == this.aShortArray_3721.length) {
         this.aShortArray_3722 = new short[896079313 * this.anInt_3727];

         for(var2 = 0; var2 < 896079313 * this.anInt_3727; ++var2) {
            this.aShortArray_3722[var2] = (short)((int)Math.pow(2.0D, (double)var2));
         }
      }

   }

   Class240_Sub20_Sub1() {
      super(0, true);
   }
}
