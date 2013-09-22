import java.util.Random;

public abstract class Class333 {

   short[] aShortArray_6430;
   static final int anInt_6431 = 4096;
   static final int anInt_6432 = 4095;
   short[] aShortArray_6433 = new short[512];
   public static final int[] anIntArray_6434 = new int[4096];
   int anInt_6435 = 4;
   int anInt_6436 = 4;
   static final int anInt_6437 = 12;
   int anInt_6438 = 4;
   int anInt_6439 = 4;
   int anInt_6440 = 0;


   static final int method4116(int var0) {
      int var1 = var0 * (var0 * var0 >> 12) >> 12;
      int var2 = var0 * 6 - '\uf000';
      int var3 = '\ua000' + (var2 * var0 >> 12);
      return var3 * var1 >> 12;
   }

   void method4117(int var1, int var2, int var3) {
      int[] var4 = new int[var1];
      int[] var5 = new int[var2];
      int[] var6 = new int[var3];

      int var7;
      for(var7 = 0; var7 < var1; ++var7) {
         var4[var7] = (var7 << 12) / var1;
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var5[var7] = (var7 << 12) / var2;
      }

      for(var7 = 0; var7 < var3; ++var7) {
         var6[var7] = (var7 << 12) / var3;
      }

      this.method4118();

      for(int var8 = 0; var8 < var3; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            for(int var10 = 0; var10 < var1; ++var10) {
               for(int var11 = 0; var11 < this.anInt_6439; ++var11) {
                  var7 = this.aShortArray_6430[var11] << 12;
                  int var12 = this.anInt_6436 * var7 >> 12;
                  int var13 = this.anInt_6435 * var7 >> 12;
                  int var14 = this.anInt_6438 * var7 >> 12;
                  int var15 = var4[var10] * var7 >> 12;
                  int var16 = var5[var9] * var7 >> 12;
                  int var17 = var6[var8] * var7 >> 12;
                  var15 *= this.anInt_6436;
                  var16 *= this.anInt_6435;
                  var17 *= this.anInt_6438;
                  int var18 = var15 >> 12;
                  int var19 = var18 + 1;
                  var18 &= 255;
                  int var20 = var16 >> 12;
                  int var21 = var20 + 1;
                  var20 &= 255;
                  int var22 = var17 >> 12;
                  int var23 = var22 + 1;
                  var22 &= 255;
                  if(var19 >= var12) {
                     var19 = 0;
                  } else {
                     var19 &= 255;
                  }

                  if(var21 >= var13) {
                     var21 = 0;
                  } else {
                     var21 &= 255;
                  }

                  if(var23 >= var14) {
                     var23 = 0;
                  } else {
                     var23 &= 255;
                  }

                  var15 &= 4095;
                  var16 &= 4095;
                  var17 &= 4095;
                  int var24 = anIntArray_6434[var15];
                  int var25 = anIntArray_6434[var16];
                  int var26 = anIntArray_6434[var17];
                  int var27 = var15 - 4096;
                  int var28 = var16 - 4096;
                  int var29 = var17 - 4096;
                  short var30 = this.aShortArray_6433[var22];
                  short var31 = this.aShortArray_6433[var23];
                  short var32 = this.aShortArray_6433[var20 + var30];
                  short var33 = this.aShortArray_6433[var21 + var30];
                  short var34 = this.aShortArray_6433[var20 + var31];
                  short var35 = this.aShortArray_6433[var21 + var31];
                  int var36 = method4121(this.aShortArray_6433[var18 + var32], var15, var16, var17);
                  int var37 = method4121(this.aShortArray_6433[var19 + var32], var27, var16, var17);
                  int var38 = var36 + (var24 * (var37 - var36) >> 12);
                  var36 = method4121(this.aShortArray_6433[var18 + var33], var15, var28, var17);
                  var37 = method4121(this.aShortArray_6433[var19 + var33], var27, var28, var17);
                  int var39 = var36 + (var24 * (var37 - var36) >> 12);
                  int var40 = var38 + (var25 * (var39 - var38) >> 12);
                  var36 = method4121(this.aShortArray_6433[var18 + var34], var15, var16, var29);
                  var37 = method4121(this.aShortArray_6433[var19 + var34], var27, var16, var29);
                  var38 = var36 + (var24 * (var37 - var36) >> 12);
                  var36 = method4121(this.aShortArray_6433[var18 + var35], var15, var28, var29);
                  var37 = method4121(this.aShortArray_6433[var19 + var35], var27, var28, var29);
                  var39 = var36 + (var24 * (var37 - var36) >> 12);
                  int var41 = var38 + (var25 * (var39 - var38) >> 12);
                  this.method4123(var11, var40 + (var26 * (var41 - var40) >> 12));
               }

               this.method4122();
            }
         }
      }

   }

   abstract void method4118();

   void method4119() {
      this.aShortArray_6430 = new short[this.anInt_6439];

      for(int var1 = 0; var1 < this.anInt_6439; ++var1) {
         this.aShortArray_6430[var1] = (short)((int)Math.pow(2.0D, (double)var1));
      }

   }

   void method4120() {
      Random var1 = new Random((long)this.anInt_6440);

      int var2;
      for(var2 = 0; var2 < 255; ++var2) {
         this.aShortArray_6433[var2] = (short)var2;
      }

      for(var2 = 0; var2 < 255; ++var2) {
         int var3 = 255 - var2;
         int var4 = Class417.method5182(var1, var3, 1895929598);
         short var5 = this.aShortArray_6433[var4];
         this.aShortArray_6433[var4] = this.aShortArray_6433[var3];
         this.aShortArray_6433[var3] = this.aShortArray_6433[var3 + 256] = var5;
      }

   }

   static int method4121(int var0, int var1, int var2, int var3) {
      int var4 = var0 & 15;
      int var5 = var4 < 8?var1:var2;
      int var6 = var4 < 4?var2:(var4 != 12 && var4 != 14?var3:var1);
      return ((var4 & 1) == 0?var5:-var5) + ((var4 & 2) == 0?var6:-var6);
   }

   static {
      for(int var0 = 0; var0 < 4096; ++var0) {
         anIntArray_6434[var0] = method4116(var0);
      }

   }

   Class333(int var1, int var2, int var3, int var4, int var5) {
      this.anInt_6440 = var1;
      this.anInt_6436 = var3;
      this.anInt_6435 = var4;
      this.anInt_6438 = var5;
      this.anInt_6439 = var2;
      this.method4119();
      this.method4120();
   }

   abstract void method4122();

   abstract void method4123(int var1, int var2);
}
