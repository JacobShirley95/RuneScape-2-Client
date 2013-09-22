import java.util.Stack;

public class FontRenderer_Sub1 extends FontRenderer {

   int[] anIntArray_10470;
   byte[][] aByteArrayArray_10471;
   int[] anIntArray_10472;
   SoftwareRenderer aRenderer_Sub1_10473;
   int[] anIntArray_10474;
   int[] anIntArray_10475;
   int[] anIntArray_10476;


   void method1074(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aRenderer_Sub1_10473.renderArray) {
         var2 += this.anIntArray_10470[var1];
         var3 += this.anIntArray_10476[var1];
         int var6 = this.anIntArray_10472[var1];
         int var7 = this.anIntArray_10474[var1];
         int var8 = 1176497263 * this.aRenderer_Sub1_10473.renderWidth;
         int var9 = var2 + var8 * var3;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < this.aRenderer_Sub1_10473.targetWidth * 759884099) {
            var13 = this.aRenderer_Sub1_10473.targetWidth * 759884099 - var3;
            var7 -= var13;
            var3 = this.aRenderer_Sub1_10473.targetWidth * 759884099;
            var12 += var13 * var6;
            var9 += var8 * var13;
         }

         if(var7 + var3 > 108427145 * this.aRenderer_Sub1_10473.targetHeight) {
            var7 -= var7 + var3 - 108427145 * this.aRenderer_Sub1_10473.targetHeight;
         }

         if(var2 < -346770183 * this.aRenderer_Sub1_10473.targetX) {
            var13 = -346770183 * this.aRenderer_Sub1_10473.targetX - var2;
            var6 -= var13;
            var2 = -346770183 * this.aRenderer_Sub1_10473.targetX;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > this.aRenderer_Sub1_10473.targetY * 1163141991) {
            var13 = var2 + var6 - 1163141991 * this.aRenderer_Sub1_10473.targetY;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(var5) {
               this.method7079(this.aByteArrayArray_10471[var1], this.aRenderer_Sub1_10473.renderArray, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method7075(this.aByteArrayArray_10471[var1], this.aRenderer_Sub1_10473.renderArray, this.anIntArray_10475, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   void method7075(byte[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);
      boolean var11 = false;

      for(int var12 = -var7; var12 < 0; ++var12) {
         int var13;
         byte var14;
         for(var13 = var10; var13 < 0; ++var13) {
            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }
         }

         for(var13 = var6; var13 < 0; ++var13) {
            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method7076(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class1024 var13, int var14, int var15) {
      Class1024_Sub3 var16 = (Class1024_Sub3)var13;
      int[] var17 = var16.anIntArray_10982;
      int[] var18 = var16.anIntArray_10981;
      int var19 = var10 - this.aRenderer_Sub1_10473.targetX * -346770183;
      int var20 = var11;
      if(var15 > var11) {
         var20 = var15;
         var5 += this.aRenderer_Sub1_10473.renderWidth * 1176497263 * (var15 - var11);
         var4 += var12 * (var15 - var11);
      }

      int var21 = var15 + var17.length < var7 + var11?var15 + var17.length:var7 + var11;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var17[var22 - var15] + var14;
         int var24 = var18[var22 - var15];
         int var25 = var6;
         int var26;
         if(var19 > var23) {
            var26 = var19 - var23;
            if(var26 >= var24) {
               var4 += var6 + var9;
               var5 += var8 + var6;
               continue;
            }

            var24 -= var26;
         } else {
            var26 = var23 - var19;
            if(var26 >= var6) {
               var4 += var9 + var6;
               var5 += var8 + var6;
               continue;
            }

            var4 += var26;
            var25 = var6 - var26;
            var5 += var26;
         }

         var26 = 0;
         if(var25 < var24) {
            var24 = var25;
         } else {
            var26 = var25 - var24;
         }

         for(int var27 = -var24; var27 < 0; ++var27) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var4 += var4 + var26;
         var5 += var26 + var8;
      }

   }

   void method1071(char var1, int var2, int var3, int var4, boolean var5, Class1024 var6, int var7, int var8) {
      if(this.aRenderer_Sub1_10473.renderArray != null) {
         if(null == var6) {
            this.method1074(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray_10470[var1];
            var3 += this.anIntArray_10476[var1];
            int var9 = this.anIntArray_10472[var1];
            int var10 = this.anIntArray_10474[var1];
            int var11 = this.aRenderer_Sub1_10473.renderWidth * 1176497263;
            int var12 = var2 + var3 * var11;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < this.aRenderer_Sub1_10473.targetWidth * 759884099) {
               var16 = 759884099 * this.aRenderer_Sub1_10473.targetWidth - var3;
               var10 -= var16;
               var3 = 759884099 * this.aRenderer_Sub1_10473.targetWidth;
               var15 += var16 * var9;
               var12 += var11 * var16;
            }

            if(var3 + var10 > 108427145 * this.aRenderer_Sub1_10473.targetHeight) {
               var10 -= var10 + var3 - this.aRenderer_Sub1_10473.targetHeight * 108427145;
            }

            if(var2 < this.aRenderer_Sub1_10473.targetX * -346770183) {
               var16 = -346770183 * this.aRenderer_Sub1_10473.targetX - var2;
               var9 -= var16;
               var2 = -346770183 * this.aRenderer_Sub1_10473.targetX;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > 1163141991 * this.aRenderer_Sub1_10473.targetY) {
               var16 = var9 + var2 - this.aRenderer_Sub1_10473.targetY * 1163141991;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if(var5) {
                  this.method7076(this.aByteArrayArray_10471[var1], this.aRenderer_Sub1_10473.renderArray, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray_10472[var1], var6, var7, var8);
               } else {
                  this.method7078(this.aByteArrayArray_10471[var1], this.aRenderer_Sub1_10473.renderArray, this.anIntArray_10475, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray_10472[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   FontRenderer_Sub1(SoftwareRenderer var1, RSFont var2, ImageData[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.aRenderer_Sub1_10473 = var1;
      this.aRenderer_Sub1_10473 = var1;
      this.anIntArray_10472 = var4;
      this.anIntArray_10474 = var5;
      this.aByteArrayArray_10471 = new byte[var3.length][];
      this.anIntArray_10476 = new int[var3.length];
      this.anIntArray_10470 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         this.aByteArrayArray_10471[var6] = var3[var6].data;
         this.anIntArray_10476[var6] = var3[var6].y;
         this.anIntArray_10470[var6] = var3[var6].x;
      }

      this.anIntArray_10475 = var3[0].anIntArray_10491;
   }

   void method7078(byte[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, Class1024 var14, int var15, int var16) {
      Class1024_Sub3 var17 = (Class1024_Sub3)var14;
      int[] var18 = var17.anIntArray_10982;
      int[] var19 = var17.anIntArray_10981;
      int var20 = var11 - -346770183 * this.aRenderer_Sub1_10473.targetX;
      int var21 = var12;
      if(var16 > var12) {
         var21 = var16;
         var6 += this.aRenderer_Sub1_10473.renderWidth * 1176497263 * (var16 - var12);
         var5 += var13 * (var16 - var12);
      }

      int var22 = var18.length + var16 < var12 + var8?var18.length + var16:var12 + var8;
      boolean var23 = false;

      for(int var24 = var21; var24 < var22; ++var24) {
         int var25 = var18[var24 - var16] + var15;
         int var26 = var19[var24 - var16];
         int var27 = var7;
         int var28;
         if(var20 > var25) {
            var28 = var20 - var25;
            if(var28 >= var26) {
               var5 += var7 + var10;
               var6 += var7 + var9;
               continue;
            }

            var26 -= var28;
         } else {
            var28 = var25 - var20;
            if(var28 >= var7) {
               var5 += var7 + var10;
               var6 += var9 + var7;
               continue;
            }

            var5 += var28;
            var27 = var7 - var28;
            var6 += var28;
         }

         var28 = 0;
         if(var27 < var26) {
            var26 = var27;
         } else {
            var28 = var27 - var26;
         }

         for(int var29 = -var26; var29 < 0; ++var29) {
            byte var30;
            if((var30 = var1[var5++]) != 0) {
               var2[var6++] = var3[var30 & 255];
            } else {
               ++var6;
            }
         }

         var5 += var10 + var28;
         var6 += var9 + var28;
      }

   }

   void method7079(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

   public static void method7080(int var0) {
      Stack var1 = Class268.aStack_4644;
      synchronized(Class268.aStack_4644) {
         Class268.aStack_4644 = new Stack();
      }
   }

   static final void method7081(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class215.method2697(var3, var4, var0, 1776472057);
   }

   static final void method7082(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class470 var4 = Class493.aClass466_9034.method5614(var2, (byte)-44);
      if(115 != var4.aChar_8694) {
         ;
      }

      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var4.method5656(var3, 867910051);
   }
}
