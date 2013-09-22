import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class59 {

   int anInt_1109;
   Class56 aClass56_1110;
   Class56 aClass56_1111;
   int anInt_1112;
   int anInt_1113;
   int[] anIntArray_1114;
   final Renderer_Sub3 aRenderer_Sub3_1115;
   int[] anIntArray_1116;
   float[] aFloatArray_1117;
   Class76 aClass76_1118;
   Class379 aClass379_1119;
   Class414 aClass414_1120;
   Class384[] aClass384Array_1121;


   void method573(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, Class384 var9, int var10) {
      if((var10 & -16777216) != 0) {
         this.aRenderer_Sub3_1115.method1913(this.anIntArray_1114);
         int var11 = this.anIntArray_1114[0];
         int var12 = this.anIntArray_1114[1];
         int var13 = this.anIntArray_1114[2];
         int var14 = this.anIntArray_1114[3];
         if(var1 <= (float)var13) {
            if(var2 <= (float)var14) {
               if(var3 >= (float)var11) {
                  if(var4 >= (float)var12) {
                     float var15 = var3 - var1;
                     float var16 = var4 - var2;
                     float var17 = var7 - var5;
                     float var18 = var8 - var6;
                     if(var1 < (float)var11) {
                        var5 += ((float)var11 - var1) / var15 * var17;
                        var1 = (float)var11;
                     }

                     if(var2 < (float)var12) {
                        var6 += ((float)var12 - var2) / var16 * var18;
                        var2 = (float)var12;
                     }

                     if(var3 > (float)var13) {
                        var7 -= (var3 - (float)var13) / var15 * var17;
                        var3 = (float)var13;
                     }

                     if(var4 > (float)var14) {
                        var8 -= (var4 - (float)var14) / var16 * var18;
                        var4 = (float)var14;
                     }

                     this.method581();
                     var1 = this.method575(var1);
                     var2 = this.method576(var2);
                     var3 = this.method575(var3);
                     var4 = this.method576(var4);
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 0] = var1;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 1] = var2;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 2] = var5;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 3] = var6;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 4] = var3;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 5] = var2;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 6] = var7;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 7] = var6;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 8] = var1;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 9] = var4;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 10] = var5;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 11] = var8;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 12] = var3;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 13] = var4;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 14] = var7;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 15] = var8;
                     this.aClass384Array_1121[this.anInt_1113] = var9;
                     this.anIntArray_1116[this.anInt_1113] = var10;
                     ++this.anInt_1113;
                     if(this.aClass56_1110 == Class56.aClass56_1088) {
                        this.method574();
                     }

                  }
               }
            }
         }
      }
   }

   void method574() {
      if(this.anInt_1113 != 0) {
         this.aRenderer_Sub3_1115.method7271();
         this.aRenderer_Sub3_1115.method7279(1);
         this.aRenderer_Sub3_1115.method7307(this.aClass414_1120);
         this.aRenderer_Sub3_1115.method7251(0, this.aClass76_1118);
         this.aRenderer_Sub3_1115.method7190(this.aClass379_1119);
         Class47 var1 = this.aRenderer_Sub3_1115.aClass47_10610;
         Unsafe var2 = this.aRenderer_Sub3_1115.anUnsafe_10510;
         ByteBuffer var3 = this.aRenderer_Sub3_1115.aByteBuffer_10646;
         var3.clear();
         int var4 = (this.anInt_1113 + this.anInt_1109 - 1) / this.anInt_1109;
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = Math.min(this.anInt_1109, this.anInt_1113 - var5);
            long var9 = this.aClass76_1118.method4851(0, var8 * 96);
            int var11 = var7 * this.anInt_1109 + var8;

            int var13;
            for(int var12 = var5; var12 < var11; ++var12) {
               for(var13 = 0; var13 < 4; ++var13) {
                  var2.putFloat(var9, this.aFloatArray_1117[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray_1117[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, 0.0F);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray_1117[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray_1117[var6++]);
                  var9 += 4L;
                  var2.putInt(var9, this.anIntArray_1116[var12]);
                  var9 += 4L;
               }
            }

            this.aClass76_1118.method4852();
            Class384 var16 = this.aClass384Array_1121[var5];
            var13 = 1;
            int var14 = 0;

            for(int var15 = var5 + 1; var15 < var11; ++var15) {
               if(var16 == this.aClass384Array_1121[var15]) {
                  ++var13;
               } else {
                  var1.aClass384_1009 = var16;
                  var1.method484();
                  this.aRenderer_Sub3_1115.method7269(this.aClass414_1120, Class396.aClass396_7573, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
                  var16 = this.aClass384Array_1121[var15];
                  var13 = 1;
                  var14 = var15 - var5;
               }
            }

            var1.aClass384_1009 = var16;
            var1.method484();
            this.aRenderer_Sub3_1115.method7269(this.aClass414_1120, Class396.aClass396_7573, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
            var5 += this.anInt_1109;
         }

         this.anInt_1113 = 0;
      }
   }

   float method575(float var1) {
      int var2 = this.aRenderer_Sub3_1115.method1896(-55677424).method2194();
      float var3 = (var1 + this.aRenderer_Sub3_1115.method7146()) / (float)var2 * 2.0F - 1.0F;
      return var3;
   }

   float method576(float var1) {
      int var2 = this.aRenderer_Sub3_1115.method1896(1476776981).method2198();
      float var3 = (1.0F - (var1 + this.aRenderer_Sub3_1115.method7146()) / (float)var2) * 2.0F - 1.0F;
      return var3;
   }

   void method577() {
      this.aClass56_1111 = this.aClass56_1110;
      this.aClass56_1110 = Class56.aClass56_1089;
   }

   void method578() {
      if(this.aClass56_1111 != null) {
         this.aClass56_1110 = this.aClass56_1111;
         this.aClass56_1111 = null;
      }

   }

   Class56 method579() {
      return this.aClass56_1110;
   }

   void method580() {
      this.aClass76_1118.method824();
      this.aClass414_1120.method824();
      this.aClass76_1118 = null;
      this.aClass414_1120 = null;
      this.aClass379_1119 = null;
      this.anInt_1113 = 0;
   }

   void method581() {
      if(this.anInt_1113 == this.anInt_1112) {
         this.anInt_1112 *= 2;
         float[] var1 = new float[this.anInt_1112 * 16];

         for(int var2 = 0; var2 < this.anInt_1113 * 16; ++var2) {
            var1[var2] = this.aFloatArray_1117[var2];
         }

         this.aFloatArray_1117 = var1;
         Class384[] var5 = new Class384[this.anInt_1112];
         int[] var3 = new int[this.anInt_1112];

         for(int var4 = 0; var4 < this.anInt_1113; ++var4) {
            var5[var4] = this.aClass384Array_1121[var4];
            var3[var4] = this.anIntArray_1116[var4];
         }

         this.aClass384Array_1121 = var5;
         this.anIntArray_1116 = var3;
      }

   }

   void method582(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, Class384 var17, int var18) {
      if((var18 & -16777216) != 0) {
         this.aRenderer_Sub3_1115.method1913(this.anIntArray_1114);
         int var19 = this.anIntArray_1114[0];
         int var20 = this.anIntArray_1114[1];
         int var21 = this.anIntArray_1114[2];
         int var22 = this.anIntArray_1114[3];
         byte var23 = 0;
         int var24 = (var1 < (float)var19?1:0) + (var3 < (float)var19?1:0) + (var5 < (float)var19?1:0) + (var7 < (float)var19?1:0);
         if(var24 != 4) {
            int var25 = var23 | var24;
            var24 = (var1 > (float)var21?1:0) + (var3 > (float)var21?1:0) + (var5 > (float)var21?1:0) + (var7 > (float)var21?1:0);
            if(var24 != 4) {
               var25 |= var24;
               var24 = (var2 < (float)var20?1:0) + (var4 < (float)var20?1:0) + (var6 < (float)var20?1:0) + (var8 < (float)var20?1:0);
               if(var24 != 4) {
                  var25 |= var24;
                  var24 = (var2 > (float)var22?1:0) + (var4 > (float)var22?1:0) + (var6 > (float)var22?1:0) + (var8 > (float)var22?1:0);
                  if(var24 != 4) {
                     var25 |= var24;
                     if(var25 != 0) {
                        this.method574();
                        this.aRenderer_Sub3_1115.method1912(true);
                        this.aRenderer_Sub3_1115.method1965(var19, var20, var21, var22);
                     }

                     this.method581();
                     var1 = this.method575(var1);
                     var2 = this.method576(var2);
                     var3 = this.method575(var3);
                     var4 = this.method576(var4);
                     var5 = this.method575(var5);
                     var6 = this.method576(var6);
                     var7 = this.method575(var7);
                     var8 = this.method576(var8);
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 0] = var1;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 1] = var2;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 2] = var9;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 3] = var10;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 4] = var3;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 5] = var4;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 6] = var11;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 7] = var12;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 8] = var5;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 9] = var6;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 10] = var13;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 11] = var14;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 12] = var7;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 13] = var8;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 14] = var15;
                     this.aFloatArray_1117[this.anInt_1113 * 16 + 15] = var16;
                     this.aClass384Array_1121[this.anInt_1113] = var17;
                     this.anIntArray_1116[this.anInt_1113] = var18;
                     ++this.anInt_1113;
                     if(this.aClass56_1110 == Class56.aClass56_1088 || var25 > 0) {
                        this.method574();
                     }

                     if(var25 != 0) {
                        this.aRenderer_Sub3_1115.method1912(false);
                        this.aRenderer_Sub3_1115.method1967();
                        this.aRenderer_Sub3_1115.method1965(var19, var20, var21, var22);
                     }

                  }
               }
            }
         }
      }
   }

   Class59(Renderer_Sub3 var1, int var2) {
      this.aClass56_1110 = Class56.aClass56_1090;
      this.anInt_1112 = 128;
      this.anInt_1113 = 0;
      this.aFloatArray_1117 = new float[this.anInt_1112 * 16];
      this.aClass384Array_1121 = new Class384[this.anInt_1112];
      this.anIntArray_1116 = new int[this.anInt_1112];
      this.anIntArray_1114 = new int[4];
      this.aRenderer_Sub3_1115 = var1;
      this.aClass76_1118 = this.aRenderer_Sub3_1115.method7320(true);
      this.aClass76_1118.method981(var2 * 96, 24);
      this.aClass379_1119 = this.aRenderer_Sub3_1115.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7355, Class380.aClass380_7353})});
      this.aClass414_1120 = this.aRenderer_Sub3_1115.method7249(false);
      int var3 = var2 * 6;
      this.aClass414_1120.method5136(var3);
      ByteBuffer var4 = this.aRenderer_Sub3_1115.aByteBuffer_10646;
      var4.clear();

      for(int var5 = 0; var5 < var2; ++var5) {
         var4.putShort((short)(var5 * 4));
         var4.putShort((short)(var5 * 4 + 2));
         var4.putShort((short)(var5 * 4 + 1));
         var4.putShort((short)(var5 * 4 + 2));
         var4.putShort((short)(var5 * 4 + 3));
         var4.putShort((short)(var5 * 4 + 1));
      }

      this.aClass414_1120.method4853(0, var3 * this.aClass414_1120.method5138().anInt_1764 * -151363651, this.aRenderer_Sub3_1115.aLong_10629);
      this.anInt_1109 = var2;
      this.anInt_1113 = 0;
   }
}
