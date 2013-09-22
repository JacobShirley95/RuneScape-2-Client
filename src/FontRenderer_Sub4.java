
public class FontRenderer_Sub4 extends FontRenderer {

   byte[][] aByteArrayArray_10712;
   int[] anIntArray_10713;
   int[] anIntArray_10714;
   SoftwareRenderer aRenderer_Sub1_10715;
   int[] anIntArray_10716;
   int[] anIntArray_10717;


   void method7380(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method7381(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var3 >>> 24;
      int var11 = 255 - var10;

      for(int var12 = -var7; var12 < 0; ++var12) {
         for(int var13 = -var6; var13 < 0; ++var13) {
            if(var1[var4++] != 0) {
               int var14 = ((var3 & '\uff00') * var10 & 16711680) + ((var3 & 16711935) * var10 & -16711936) >> 8;
               int var15 = var2[var5];
               var2[var5++] = var14 + (((var15 & 16711935) * var11 & -16711936) + (var11 * (var15 & '\uff00') & 16711680) >> 8);
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method1074(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aRenderer_Sub1_10715.renderArray) {
         var2 += this.anIntArray_10717[var1];
         var3 += this.anIntArray_10716[var1];
         int var6 = this.anIntArray_10714[var1];
         int var7 = this.anIntArray_10713[var1];
         int var8 = 1176497263 * this.aRenderer_Sub1_10715.renderWidth;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 759884099 * this.aRenderer_Sub1_10715.targetWidth) {
            var13 = this.aRenderer_Sub1_10715.targetWidth * 759884099 - var3;
            var7 -= var13;
            var3 = 759884099 * this.aRenderer_Sub1_10715.targetWidth;
            var12 += var13 * var6;
            var9 += var8 * var13;
         }

         if(var7 + var3 > this.aRenderer_Sub1_10715.targetHeight * 108427145) {
            var7 -= var3 + var7 - this.aRenderer_Sub1_10715.targetHeight * 108427145;
         }

         if(var2 < this.aRenderer_Sub1_10715.targetX * -346770183) {
            var13 = this.aRenderer_Sub1_10715.targetX * -346770183 - var2;
            var6 -= var13;
            var2 = this.aRenderer_Sub1_10715.targetX * -346770183;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > 1163141991 * this.aRenderer_Sub1_10715.targetY) {
            var13 = var2 + var6 - 1163141991 * this.aRenderer_Sub1_10715.targetY;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if((var4 & -16777216) == -16777216) {
               this.method7380(this.aByteArrayArray_10712[var1], this.aRenderer_Sub1_10715.renderArray, var4, var12, var9, var6, var7, var10, var11);
            } else if(0 != (var4 & -16777216)) {
               this.method7381(this.aByteArrayArray_10712[var1], this.aRenderer_Sub1_10715.renderArray, var4, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   void method7383(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class1024 var13, int var14, int var15) {
      Class1024_Sub3 var16 = (Class1024_Sub3)var13;
      int[] var17 = var16.anIntArray_10982;
      int[] var18 = var16.anIntArray_10981;
      int var19 = var10 - this.aRenderer_Sub1_10715.targetX * -346770183;
      int var20 = var11;
      if(var15 > var11) {
         var20 = var15;
         var5 += this.aRenderer_Sub1_10715.renderWidth * 1176497263 * (var15 - var11);
         var4 += var12 * (var15 - var11);
      }

      int var21 = var17.length + var15 < var7 + var11?var15 + var17.length:var7 + var11;
      int var22 = var3 >>> 24;
      int var23 = 255 - var22;

      for(int var24 = var20; var24 < var21; ++var24) {
         int var25 = var17[var24 - var15] + var14;
         int var26 = var18[var24 - var15];
         int var27 = var6;
         int var28;
         if(var19 > var25) {
            var28 = var19 - var25;
            if(var28 >= var26) {
               var4 += var9 + var6;
               var5 += var6 + var8;
               continue;
            }

            var26 -= var28;
         } else {
            var28 = var25 - var19;
            if(var28 >= var6) {
               var4 += var9 + var6;
               var5 += var6 + var8;
               continue;
            }

            var4 += var28;
            var27 = var6 - var28;
            var5 += var28;
         }

         var28 = 0;
         if(var27 < var26) {
            var26 = var27;
         } else {
            var28 = var27 - var26;
         }

         for(int var29 = -var26; var29 < 0; ++var29) {
            if(var1[var4++] != 0) {
               int var30 = ((var3 & '\uff00') * var22 & 16711680) + (var22 * (var3 & 16711935) & -16711936) >> 8;
               int var31 = var2[var5];
               var2[var5++] = (((var31 & 16711935) * var23 & -16711936) + (var23 * (var31 & '\uff00') & 16711680) >> 8) + var30;
            } else {
               ++var5;
            }
         }

         var4 += var28 + var9;
         var5 += var28 + var8;
      }

   }

   void method7384(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class1024 var13, int var14, int var15) {
      Class1024_Sub3 var16 = (Class1024_Sub3)var13;
      int[] var17 = var16.anIntArray_10982;
      int[] var18 = var16.anIntArray_10981;
      int var19 = var11;
      if(var15 > var11) {
         var19 = var15;
         var5 += (var15 - var11) * this.aRenderer_Sub1_10715.renderWidth * 1176497263;
         var4 += (var15 - var11) * var12;
      }

      int var20 = var15 + var17.length < var11 + var7?var15 + var17.length:var11 + var7;

      for(int var21 = var19; var21 < var20; ++var21) {
         int var22 = var17[var21 - var15] + var14;
         int var23 = var18[var21 - var15];
         int var24 = var6;
         int var25;
         if(var10 > var22) {
            var25 = var10 - var22;
            if(var25 >= var23) {
               var4 += var9 + var6;
               var5 += var8 + var6;
               continue;
            }

            var23 -= var25;
         } else {
            var25 = var22 - var10;
            if(var25 >= var6) {
               var4 += var9 + var6;
               var5 += var6 + var8;
               continue;
            }

            var4 += var25;
            var24 = var6 - var25;
            var5 += var25;
         }

         var25 = 0;
         if(var24 < var23) {
            var23 = var24;
         } else {
            var25 = var24 - var23;
         }

         for(int var26 = 0; var26 < var23; ++var26) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var4 += var9 + var25;
         var5 += var8 + var25;
      }

   }

   void method1071(char var1, int var2, int var3, int var4, boolean var5, Class1024 var6, int var7, int var8) {
      if(this.aRenderer_Sub1_10715.renderArray != null) {
         if(var6 == null) {
            this.method1074(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray_10717[var1];
            var3 += this.anIntArray_10716[var1];
            int var9 = this.anIntArray_10714[var1];
            int var10 = this.anIntArray_10713[var1];
            int var11 = this.aRenderer_Sub1_10715.renderWidth * 1176497263;
            int var12 = var11 * var3 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 759884099 * this.aRenderer_Sub1_10715.targetWidth) {
               var16 = 759884099 * this.aRenderer_Sub1_10715.targetWidth - var3;
               var10 -= var16;
               var3 = 759884099 * this.aRenderer_Sub1_10715.targetWidth;
               var15 += var16 * var9;
               var12 += var16 * var11;
            }

            if(var10 + var3 > 108427145 * this.aRenderer_Sub1_10715.targetHeight) {
               var10 -= var3 + var10 - this.aRenderer_Sub1_10715.targetHeight * 108427145;
            }

            if(var2 < this.aRenderer_Sub1_10715.targetX * -346770183) {
               var16 = -346770183 * this.aRenderer_Sub1_10715.targetX - var2;
               var9 -= var16;
               var2 = this.aRenderer_Sub1_10715.targetX * -346770183;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 + var2 > 1163141991 * this.aRenderer_Sub1_10715.targetY) {
               var16 = var9 + var2 - this.aRenderer_Sub1_10715.targetY * 1163141991;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if((var4 & -16777216) == -16777216) {
                  this.method7384(this.aByteArrayArray_10712[var1], this.aRenderer_Sub1_10715.renderArray, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray_10714[var1], var6, var7, var8);
               } else {
                  this.method7383(this.aByteArrayArray_10712[var1], this.aRenderer_Sub1_10715.renderArray, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray_10714[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   FontRenderer_Sub4(SoftwareRenderer var1, RSFont var2, ImageData[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.aRenderer_Sub1_10715 = var1;
      this.anIntArray_10714 = var4;
      this.anIntArray_10713 = var5;
      this.aByteArrayArray_10712 = new byte[var3.length][];
      this.anIntArray_10716 = new int[var3.length];
      this.anIntArray_10717 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         this.aByteArrayArray_10712[var6] = var3[var6].data;
         this.anIntArray_10716[var6] = var3[var6].y;
         this.anIntArray_10717[var6] = var3[var6].x;
      }

   }

   static final void method7386(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class187.method2295(var3, var4, var0, -1254971293);
   }
}
