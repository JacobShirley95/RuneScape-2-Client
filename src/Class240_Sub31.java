
public class Class240_Sub31 extends NodeListNode {

   float[][] aFloatArrayArray_7424;
   final Class171_Sub1 aClass171_Sub1_7425;
   int anInt_7426;
   int anInt_7427;
   int anInt_7428;
   int anInt_7429;
   int anInt_7430;
   final OGLBufferPointer vertexPointer;
   int anInt_7432;
   final OGLBufferPointer colourPointer;
   final OGLBuffer renderBuffer;
   final OpenGLRenderer aRenderer_Sub2_7435;
   BufferDataNode vertexData;
   final Class166 aClass166_7437;
   float[][] aFloatArrayArray_7438;
   NodeArrayList aNodeArrayList_7439;
   ByteArrayDataNode aClass240_Sub8_7440;
   final Class240_Sub53 aClass240_Sub53_7441;
   float[][] aFloatArrayArray_7442;


   void method4874(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = -1L;
      int var9 = var5 + (var3 << this.aClass171_Sub1_7425.shiftAmount * 1694172417);
      int var10 = var6 + (var4 << this.aClass171_Sub1_7425.shiftAmount * 1694172417);
      int var11 = this.aClass171_Sub1_7425.getHeight(var9, var10);
      if((var5 & 127) == 0 || (var6 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         Class240_Sub21 var12 = (Class240_Sub21)this.aNodeArrayList_7439.getNode(var7);
         if(var12 != null) {
            this.method4875(var12.aShort_7275);
            return;
         }
      }

      short var29 = (short)(this.anInt_7426++);
      if(var7 != -1L) {
         this.aNodeArrayList_7439.insert(new Class240_Sub21(var29), var7);
      }

      float var13;
      float var14;
      float var15;
      float var17;
      float var16;
      float var19;
      float var18;
      float var21;
      float var20;
      float var23;
      float var22;
      if(var5 == 0 && var6 == 0) {
         var13 = this.aFloatArrayArray_7442[var1][var2];
         var14 = this.aFloatArrayArray_7438[var1][var2];
         var15 = this.aFloatArrayArray_7424[var1][var2];
      } else if(var5 == this.aClass171_Sub1_7425.anInt_3031 * 69671577 && var6 == 0) {
         var13 = this.aFloatArrayArray_7442[var1 + 1][var2];
         var14 = this.aFloatArrayArray_7438[var1 + 1][var2];
         var15 = this.aFloatArrayArray_7424[var1 + 1][var2];
      } else if(var5 == this.aClass171_Sub1_7425.anInt_3031 * 69671577 && var6 == this.aClass171_Sub1_7425.anInt_3031 * 69671577) {
         var13 = this.aFloatArrayArray_7442[var1 + 1][var2 + 1];
         var14 = this.aFloatArrayArray_7438[var1 + 1][var2 + 1];
         var15 = this.aFloatArrayArray_7424[var1 + 1][var2 + 1];
      } else if(var5 == 0 && var6 == this.aClass171_Sub1_7425.anInt_3031 * 69671577) {
         var13 = this.aFloatArrayArray_7442[var1][var2 + 1];
         var14 = this.aFloatArrayArray_7438[var1][var2 + 1];
         var15 = this.aFloatArrayArray_7424[var1][var2 + 1];
      } else {
         var16 = (float)var5 / (float)(this.aClass171_Sub1_7425.anInt_3031 * 69671577);
         var17 = (float)var6 / (float)(this.aClass171_Sub1_7425.anInt_3031 * 69671577);
         var18 = this.aFloatArrayArray_7442[var1][var2];
         var19 = this.aFloatArrayArray_7438[var1][var2];
         var20 = this.aFloatArrayArray_7424[var1][var2];
         var21 = this.aFloatArrayArray_7442[var1 + 1][var2];
         var22 = this.aFloatArrayArray_7438[var1 + 1][var2];
         var23 = this.aFloatArrayArray_7424[var1 + 1][var2];
         var18 += (this.aFloatArrayArray_7442[var1][var2 + 1] - var18) * var16;
         var19 += (this.aFloatArrayArray_7438[var1][var2 + 1] - var19) * var16;
         var20 += (this.aFloatArrayArray_7424[var1][var2 + 1] - var20) * var16;
         var21 += (this.aFloatArrayArray_7442[var1 + 1][var2 + 1] - var21) * var16;
         var22 += (this.aFloatArrayArray_7438[var1 + 1][var2 + 1] - var22) * var16;
         var23 += (this.aFloatArrayArray_7424[var1 + 1][var2 + 1] - var23) * var16;
         var13 = var18 + (var21 - var18) * var17;
         var14 = var19 + (var22 - var19) * var17;
         var15 = var20 + (var23 - var20) * var17;
      }

      var16 = (float)(this.aClass240_Sub53_7441.method5274((byte)33) - var9);
      var17 = (float)(this.aClass240_Sub53_7441.method5275((byte)45) - var11);
      var18 = (float)(this.aClass240_Sub53_7441.method5276((byte)48) - var10);
      var19 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      var20 = 1.0F / var19;
      var16 *= var20;
      var17 *= var20;
      var18 *= var20;
      var21 = var19 / (float)this.aClass240_Sub53_7441.method5277(-1932051005);
      var22 = 1.0F - var21 * var21;
      if(var22 < 0.0F) {
         var22 = 0.0F;
      }

      var23 = var16 * var13 + var17 * var14 + var18 * var15;
      if(var23 < 0.0F) {
         var23 = 0.0F;
      }

      float var24 = var23 * var22 * 2.0F;
      if(var24 > 1.0F) {
         var24 = 1.0F;
      }

      int var25 = this.aClass240_Sub53_7441.method5278((byte)-124);
      int var26 = (int)(var24 * (float)(var25 >> 16 & 255));
      if(var26 > 255) {
         var26 = 255;
      }

      int var27 = (int)(var24 * (float)(var25 >> 8 & 255));
      if(var27 > 255) {
         var27 = 255;
      }

      int var28 = (int)(var24 * (float)(var25 & 255));
      if(var28 > 255) {
         var28 = 255;
      }

      if(this.aRenderer_Sub2_7435.isBigEndian) {
         this.vertexData.putFloatBE((float)var9);
         this.vertexData.putFloatBE((float)var11);
         this.vertexData.putFloatBE((float)var10);
      } else {
         this.vertexData.putFloatLE((float)var9);
         this.vertexData.putFloatLE((float)var11);
         this.vertexData.putFloatLE((float)var10);
      }

      this.vertexData.putByte(var26, 2009132600);
      this.vertexData.putByte(var27, 1178667715);
      this.vertexData.putByte(var28, -561784869);
      this.vertexData.putByte(255, 1995976429);
      this.method4875(var29);
   }

   void method4875(short var1) {
      if(this.aRenderer_Sub2_7435.isBigEndian) {
         this.aClass240_Sub8_7440.method4463(var1, -197841745);
      } else {
         this.aClass240_Sub8_7440.method4464(var1, (byte)1);
      }

   }

   void method4876(int var1, int var2, int var3, boolean[][] var4) {
      if(this.aClass166_7437 != null) {
         if(this.anInt_7427 <= var1 + var3) {
            if(this.anInt_7428 >= var1 - var3) {
               if(this.anInt_7429 <= var2 + var3) {
                  if(this.anInt_7430 >= var2 - var3) {
                     for(int var5 = this.anInt_7429; var5 <= this.anInt_7430; ++var5) {
                        for(int var6 = this.anInt_7427; var6 <= this.anInt_7428; ++var6) {
                           int var7 = var6 - var1;
                           int var8 = var5 - var2;
                           if(var7 > -var3 && var7 < var3 && var8 > -var3 && var8 < var3 && var4[var7 + var3][var8 + var3]) {
                              this.aRenderer_Sub2_7435.method7022((int)(this.aClass240_Sub53_7441.method5279(-2048596654) * 255.0F) << 24);
                              this.aRenderer_Sub2_7435.setPointers(this.vertexPointer, (OGLBufferPointer)null, this.colourPointer, (OGLBufferPointer)null);
                              this.aRenderer_Sub2_7435.method7009(this.aClass166_7437, 4, 0, this.anInt_7432);
                              return;
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   Class240_Sub31(OpenGLRenderer var1, Class171_Sub1 var2, Class240_Sub53 var3, int[] var4) {
      this.aRenderer_Sub2_7435 = var1;
      this.aClass240_Sub53_7441 = var3;
      this.aClass171_Sub1_7425 = var2;
      int var5 = this.aClass240_Sub53_7441.method5277(-1932051005) - (var2.anInt_3031 * 69671577 >> 1);
      this.anInt_7427 = this.aClass240_Sub53_7441.method5274((byte)84) - var5 >> var2.shiftAmount * 1694172417;
      this.anInt_7428 = this.aClass240_Sub53_7441.method5274((byte)29) + var5 >> var2.shiftAmount * 1694172417;
      this.anInt_7429 = this.aClass240_Sub53_7441.method5276((byte)10) - var5 >> var2.shiftAmount * 1694172417;
      this.anInt_7430 = this.aClass240_Sub53_7441.method5276((byte)118) + var5 >> var2.shiftAmount * 1694172417;
      int var6 = this.anInt_7428 - this.anInt_7427 + 1;
      int var7 = this.anInt_7430 - this.anInt_7429 + 1;
      this.aFloatArrayArray_7442 = new float[var6 + 1][var7 + 1];
      this.aFloatArrayArray_7438 = new float[var6 + 1][var7 + 1];
      this.aFloatArrayArray_7424 = new float[var6 + 1][var7 + 1];

      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var8 = 0; var8 <= var7; ++var8) {
         var9 = var8 + this.anInt_7429;
         if(var9 > 0 && var9 < this.aClass171_Sub1_7425.maxHeight * 445373459 - 1) {
            for(var10 = 0; var10 <= var6; ++var10) {
               var11 = var10 + this.anInt_7427;
               if(var11 > 0 && var11 < this.aClass171_Sub1_7425.maxWidth * 1658489349 - 1) {
                  var12 = var2.method2155(var11 + 1, var9, (short)2291) - var2.method2155(var11 - 1, var9, (short)28440);
                  var13 = var2.method2155(var11, var9 + 1, (short)-2373) - var2.method2155(var11, var9 - 1, (short)29518);
                  float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 65536 + var13 * var13)));
                  this.aFloatArrayArray_7442[var10][var8] = (float)var12 * var14;
                  this.aFloatArrayArray_7438[var10][var8] = -256.0F * var14;
                  this.aFloatArrayArray_7424[var10][var8] = (float)var13 * var14;
               }
            }
         }
      }

      var8 = 0;

      for(var9 = this.anInt_7429; var9 <= this.anInt_7430; ++var9) {
         if(var9 >= 0 && var9 < var2.maxHeight * 445373459) {
            for(var10 = this.anInt_7427; var10 <= this.anInt_7428; ++var10) {
               if(var10 >= 0 && var10 < var2.maxWidth * 1658489349) {
                  var11 = var4[var8];
                  int[] var18 = var2.anIntArrayArrayArray_10863[var10][var9];
                  if(var18 != null && var11 != 0) {
                     if(var11 == 1) {
                        for(var13 = 0; var13 < var18.length; var13 += 3) {
                           if(var18[var13] != -1 && var18[var13 + 1] != -1 && var18[var13 + 2] != -1) {
                              this.anInt_7432 += 3;
                           }
                        }
                     } else {
                        this.anInt_7432 += 3;
                     }
                  }
               }

               ++var8;
            }
         } else {
            var8 += this.anInt_7428 - this.anInt_7427;
         }
      }

      if(this.anInt_7432 > 0) {
         this.aClass240_Sub8_7440 = new ByteArrayDataNode(this.anInt_7432 * 2);
         this.vertexData = new BufferDataNode(this.anInt_7432 * 16);
         this.aNodeArrayList_7439 = new NodeArrayList(Class105.method1359(this.anInt_7432, (byte)127));
         var9 = 0;
         var8 = 0;

         for(var10 = this.anInt_7429; var10 <= this.anInt_7430; ++var10) {
            if(var10 >= 0 && var10 < var2.maxHeight * 445373459) {
               var11 = 0;

               for(var12 = this.anInt_7427; var12 <= this.anInt_7428; ++var12) {
                  if(var12 >= 0 && var12 < var2.maxWidth * 1658489349) {
                     var13 = var4[var8];
                     int[] var19 = var2.anIntArrayArrayArray_10863[var12][var10];
                     if(var19 != null && var13 != 0) {
                        if(var13 == 1) {
                           int[] var15 = var2.anIntArrayArrayArray_10865[var12][var10];
                           int[] var16 = var2.anIntArrayArrayArray_10878[var12][var10];
                           int var17 = 0;

                           while(var17 < var19.length) {
                              if(var19[var17] != -1 && var19[var17 + 1] != -1 && var19[var17 + 2] != -1) {
                                 this.method4874(var11, var9, var12, var10, var15[var17], var16[var17]);
                                 ++var17;
                                 this.method4874(var11, var9, var12, var10, var15[var17], var16[var17]);
                                 ++var17;
                                 this.method4874(var11, var9, var12, var10, var15[var17], var16[var17]);
                                 ++var17;
                              } else {
                                 var17 += 3;
                              }
                           }
                        } else if(var13 == 3) {
                           this.method4874(var11, var9, var12, var10, 0, 0);
                           this.method4874(var11, var9, var12, var10, var2.anInt_3031 * 69671577, 0);
                           this.method4874(var11, var9, var12, var10, 0, var2.anInt_3031 * 69671577);
                        } else if(var13 == 2) {
                           this.method4874(var11, var9, var12, var10, var2.anInt_3031 * 69671577, 0);
                           this.method4874(var11, var9, var12, var10, var2.anInt_3031 * 69671577, var2.anInt_3031 * 69671577);
                           this.method4874(var11, var9, var12, var10, 0, 0);
                        } else if(var13 == 5) {
                           this.method4874(var11, var9, var12, var10, var2.anInt_3031 * 69671577, var2.anInt_3031 * 69671577);
                           this.method4874(var11, var9, var12, var10, 0, var2.anInt_3031 * 69671577);
                           this.method4874(var11, var9, var12, var10, var2.anInt_3031 * 69671577, 0);
                        } else if(var13 == 4) {
                           this.method4874(var11, var9, var12, var10, 0, var2.anInt_3031 * 69671577);
                           this.method4874(var11, var9, var12, var10, 0, 0);
                           this.method4874(var11, var9, var12, var10, var2.anInt_3031 * 69671577, var2.anInt_3031 * 69671577);
                        }
                     }
                  }

                  ++var8;
                  ++var11;
               }
            } else {
               var8 += this.anInt_7428 - this.anInt_7427;
            }

            ++var9;
         }

         this.aClass166_7437 = this.aRenderer_Sub2_7435.method7003(5123, this.aClass240_Sub8_7440.data, this.aClass240_Sub8_7440.index * 964952859, false);
         this.renderBuffer = this.aRenderer_Sub2_7435.createOGLBuffer(16, this.vertexData.data, this.vertexData.index * 964952859, false);
         this.vertexPointer = new OGLBufferPointer(this.renderBuffer, 5126, 3, 0);
         this.colourPointer = new OGLBufferPointer(this.renderBuffer, 5121, 4, 12);
      } else {
         this.aClass166_7437 = null;
         this.renderBuffer = null;
         this.vertexPointer = null;
         this.colourPointer = null;
      }

      this.vertexData = null;
      this.aClass240_Sub8_7440 = null;
      this.aNodeArrayList_7439 = null;
      this.aFloatArrayArray_7424 = (float[][])null;
      this.aFloatArrayArray_7438 = (float[][])null;
      this.aFloatArrayArray_7442 = (float[][])null;
   }
}
