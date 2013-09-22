import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class171_Sub1 extends Plane {

   short[][] aShortArrayArray_10852;
   static final int anInt_10853 = 74;
   final OpenGLRenderer aRenderer_Sub2_10854;
   int anInt_10855;
   Class137 aClass137_10856;
   int anInt_10857;
   float[][] aFloatArrayArray_10858;
   int anInt_10859;
   int anInt_10860;
   Class240_Sub38[][][] aClass240_Sub38ArrayArrayArray_10861;
   int[][][] anIntArrayArrayArray_10862;
   int[][][] anIntArrayArrayArray_10863;
   NodeArrayList aNodeArrayList_10864;
   int[][][] anIntArrayArrayArray_10865;
   static final int anInt_10866 = 1;
   int[][][] anIntArrayArrayArray_10867;
   int[][][] anIntArrayArrayArray_10868;
   byte[][] aByteArrayArray_10869;
   OGLBuffer anOGLBuffer_10870;
   NodeList aNodeList_10871 = new NodeList();
   NodeListNode[] aClass240Array_10872;
   int anInt_10873;
   OGLBufferPointer vertexPointer;
   OGLBufferPointer anOGLBufferPointer_10875;
   OGLBufferPointer normalPointer;
   OGLBufferPointer anOGLBufferPointer_10877;
   int[][][] anIntArrayArrayArray_10878;
   int anInt_10879;
   byte[][] aByteArrayArray_10880;
   float[][] aFloatArrayArray_10881;
   final int anInt_10882;
   int anInt_10883;
   float[][] aFloatArrayArray_10884;
   static final float[] aFloatArray_10885 = new float[16];


   public void method2157(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass137_10856 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aRenderer_Sub2_10854.anInt_10403 >> 8) >> this.aRenderer_Sub2_10854.anInt_10407;
         int var8 = var4 - (var3 * this.aRenderer_Sub2_10854.anInt_10435 >> 8) >> this.aRenderer_Sub2_10854.anInt_10407;
         this.aClass137_10856.method1803(var1, var7, var8);
      }
   }

   public void method2149(int var1, int var2, int var3) {
      if((this.aByteArrayArray_10880[var1][var2] & 255) < var3) {
         this.aByteArrayArray_10880[var1][var2] = (byte)var3;
      }

   }

   public void method2151(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class105 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null?new int[var16 * 3]:null;
      int[] var21 = new int[var16 * 3];
      int[] var22 = new int[var16 * 3];
      int[] var23 = var4 != null?new int[var16 * 3]:null;
      int[] var24 = var6 != null?new int[var16 * 3]:null;
      int var25 = 0;

      for(int var26 = 0; var26 < var16; ++var26) {
         int var27 = var7[var26];
         int var28 = var8[var26];
         int var29 = var9[var26];
         var17[var25] = var3[var27];
         var18[var25] = var5[var27];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

         if(var4 != null) {
            var23[var25] = var4[var27];
         }

         if(var6 != null) {
            var24[var25] = var6[var27];
         }

         ++var25;
         var17[var25] = var3[var28];
         var18[var25] = var5[var28];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

         if(var4 != null) {
            var23[var25] = var4[var28];
         }

         if(var6 != null) {
            var24[var25] = var6[var28];
         }

         ++var25;
         var17[var25] = var3[var29];
         var18[var25] = var5[var29];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

         if(var4 != null) {
            var23[var25] = var4[var29];
         }

         if(var6 != null) {
            var24[var25] = var6[var29];
         }

         ++var25;
      }

      this.define(var1, var2, var17, var23, var18, var24, var19, var20, var21, var22, var14, var15);
   }

   public void method2153() {
      if(this.anInt_10883 > 0) {
         byte[][] var1 = new byte[this.maxWidth * 1658489349 + 1][this.maxHeight * 445373459 + 1];

         int var2;
         for(var2 = 1; var2 < this.maxWidth * 1658489349; ++var2) {
            for(int var3 = 1; var3 < this.maxHeight * 445373459; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray_10880[var2 - 1][var3] >> 2) + (this.aByteArrayArray_10880[var2 + 1][var3] >> 3) + (this.aByteArrayArray_10880[var2][var3 - 1] >> 2) + (this.aByteArrayArray_10880[var2][var3 + 1] >> 3) + (this.aByteArrayArray_10880[var2][var3] >> 1));
            }
         }

         this.aClass240Array_10872 = new NodeListNode[this.aNodeArrayList_10864.size()];
         this.aNodeArrayList_10864.size(this.aClass240Array_10872);

         for(var2 = 0; var2 < this.aClass240Array_10872.length; ++var2) {
            ((Class240_Sub38)this.aClass240Array_10872[var2]).method4906(this.anInt_10883);
         }

         var2 = 24;
         if(this.anIntArrayArrayArray_10868 != null) {
            var2 += 4;
         }

         if((this.anInt_10882 & 7) != 0) {
            var2 += 12;
         }

         NativeHeapBuffer vertexBuffer = this.aRenderer_Sub2_10854.aNativeHeap_10333.createNativeHeapBuffer(this.anInt_10883 * var2, false);
         Stream vertexStream = new Stream(vertexBuffer);
         Class240_Sub38[] var5 = new Class240_Sub38[this.anInt_10883];
         int var6 = Class234.method3016(this.anInt_10883 / 4, (byte)25);
         if(var6 < 1) {
            var6 = 1;
         }

         NodeArrayList var7 = new NodeArrayList(var6);
         Class240_Sub38[] var8 = new Class240_Sub38[this.anInt_10879];

         int var9;
         int var10;
         for(var9 = 0; var9 < this.maxWidth * 1658489349; ++var9) {
            for(var10 = 0; var10 < this.maxHeight * 445373459; ++var10) {
               if(this.anIntArrayArrayArray_10863[var9][var10] != null) {
                  Class240_Sub38[] var11 = this.aClass240_Sub38ArrayArrayArray_10861[var9][var10];
                  int[] var12 = this.anIntArrayArrayArray_10865[var9][var10];
                  int[] var13 = this.anIntArrayArrayArray_10878[var9][var10];
                  int[] var14 = this.anIntArrayArrayArray_10862[var9][var10];
                  int[] var15 = this.anIntArrayArrayArray_10863[var9][var10];
                  int[] var16 = this.anIntArrayArrayArray_10867 != null?this.anIntArrayArrayArray_10867[var9][var10]:null;
                  int[] var17 = this.anIntArrayArrayArray_10868 != null?this.anIntArrayArrayArray_10868[var9][var10]:null;
                  if(var14 == null) {
                     var14 = var15;
                  }

                  float x1 = this.aFloatArrayArray_10881[var9][var10];
                  float var19 = this.aFloatArrayArray_10884[var9][var10];
                  float var20 = this.aFloatArrayArray_10858[var9][var10];
                  float var21 = this.aFloatArrayArray_10881[var9][var10 + 1];
                  float var22 = this.aFloatArrayArray_10884[var9][var10 + 1];
                  float var23 = this.aFloatArrayArray_10858[var9][var10 + 1];
                  float var24 = this.aFloatArrayArray_10881[var9 + 1][var10 + 1];
                  float var25 = this.aFloatArrayArray_10884[var9 + 1][var10 + 1];
                  float var26 = this.aFloatArrayArray_10858[var9 + 1][var10 + 1];
                  float var27 = this.aFloatArrayArray_10881[var9 + 1][var10];
                  float var28 = this.aFloatArrayArray_10884[var9 + 1][var10];
                  float var29 = this.aFloatArrayArray_10858[var9 + 1][var10];
                  int var30 = var1[var9][var10] & 255;
                  int var31 = var1[var9][var10 + 1] & 255;
                  int var32 = var1[var9 + 1][var10 + 1] & 255;
                  int var33 = var1[var9 + 1][var10] & 255;
                  int var34 = 0;
                  int var35 = 0;

                  int var37;
                  while(var35 < var15.length) {
                     Class240_Sub38 var36 = var11[var35];
                     var37 = 0;

                     while(true) {
                        if(var37 < var34) {
                           if(var8[var37] != var36) {
                              ++var37;
                              continue;
                           }
                        } else {
                           var8[var34++] = var36;
                        }

                        ++var35;
                        break;
                     }
                  }

                  short[] var82 = this.aShortArrayArray_10852[var10 * this.maxWidth * 1658489349 + var9] = new short[var15.length];

                  for(int var81 = 0; var81 < var15.length; ++var81) {
                     int var38 = (var9 << this.shiftAmount * 1694172417) + var12[var81];
                     int var39 = (var10 << this.shiftAmount * 1694172417) + var13[var81];
                     int var40 = var38 >> this.anInt_10855;
                     int var41 = var39 >> this.anInt_10855;
                     int var42 = var15[var81];
                     int var43 = var14[var81];
                     int var44 = var16 != null?var16[var81]:0;
                     long var45 = (long)var43 << 48 | (long)var42 << 32 | (long)(var40 << 16) | (long)var41;
                     int var47 = var12[var81];
                     int var48 = var13[var81];
                     byte var49 = 74;
                     int var50 = 0;
                     float var51 = 1.0F;
                     float var54;
                     float var53;
                     float var52;
                     float var58;
                     int var83;
                     if(var47 == 0 && var48 == 0) {
                        var52 = x1;
                        var53 = var19;
                        var54 = var20;
                        var83 = var49 - var30;
                     } else if(var47 == 0 && var48 == this.anInt_3031 * 69671577) {
                        var52 = var21;
                        var53 = var22;
                        var54 = var23;
                        var83 = var49 - var31;
                     } else if(var47 == this.anInt_3031 * 69671577 && var48 == this.anInt_3031 * 69671577) {
                        var52 = var24;
                        var53 = var25;
                        var54 = var26;
                        var83 = var49 - var32;
                     } else if(var47 == this.anInt_3031 * 69671577 && var48 == 0) {
                        var52 = var27;
                        var53 = var28;
                        var54 = var29;
                        var83 = var49 - var33;
                     } else {
                        float var55 = (float)var47 / (float)(this.anInt_3031 * 69671577);
                        float var56 = (float)var48 / (float)(this.anInt_3031 * 69671577);
                        float var57 = x1 + (var27 - x1) * var55;
                        var58 = var19 + (var28 - var19) * var55;
                        float var59 = var20 + (var29 - var20) * var55;
                        float var60 = var21 + (var24 - var21) * var55;
                        float var61 = var22 + (var25 - var22) * var55;
                        float var62 = var23 + (var26 - var23) * var55;
                        var52 = var57 + (var60 - var57) * var56;
                        var53 = var58 + (var61 - var58) * var56;
                        var54 = var59 + (var62 - var59) * var56;
                        int var63 = var30 + ((var33 - var30) * var47 >> this.shiftAmount * 1694172417);
                        int var64 = var31 + ((var32 - var31) * var47 >> this.shiftAmount * 1694172417);
                        var83 = var49 - (var63 + ((var64 - var63) * var48 >> this.shiftAmount * 1694172417));
                     }

                     if(var42 != -1) {
                        int var87 = (var42 & 127) * var83 >> 7;
                        if(var87 < 2) {
                           var87 = 2;
                        } else if(var87 > 126) {
                           var87 = 126;
                        }

                        var50 = Class541.anIntArray_9470[var42 & '\uff80' | var87];
                        if((this.anInt_10882 & 7) == 0) {
                           var51 = this.aRenderer_Sub2_10854.aFloatArray_10391[0] * var52 + this.aRenderer_Sub2_10854.aFloatArray_10391[1] * var53 + this.aRenderer_Sub2_10854.aFloatArray_10391[2] * var54;
                           var51 = this.aRenderer_Sub2_10854.aFloat_10421 + var51 * (var51 > 0.0F?this.aRenderer_Sub2_10854.aFloat_10357:this.aRenderer_Sub2_10854.aFloat_10294);
                        }
                     }

                     NodeListNode var84 = null;
                     if((var38 & this.anInt_10860 - 1) == 0 && (var39 & this.anInt_10860 - 1) == 0) {
                        var84 = var7.getNode(var45);
                     }

                     int var85;
                     if(var84 == null) {
                        if(var43 != var42) {
                           int var86 = (var43 & 127) * var83 >> 7;
                           if(var86 < 2) {
                              var86 = 2;
                           } else if(var86 > 126) {
                              var86 = 126;
                           }

                           var85 = Class541.anIntArray_9470[var43 & '\uff80' | var86];
                           if((this.anInt_10882 & 7) == 0) {
                              float var10000 = this.aRenderer_Sub2_10854.aFloatArray_10391[0] * var52 + this.aRenderer_Sub2_10854.aFloatArray_10391[1] * var53 + this.aRenderer_Sub2_10854.aFloatArray_10391[2] * var54;
                              var58 = this.aRenderer_Sub2_10854.aFloat_10421 + var51 * (var51 > 0.0F?this.aRenderer_Sub2_10854.aFloat_10357:this.aRenderer_Sub2_10854.aFloat_10294);
                              int var89 = var85 >> 16 & 255;
                              int var90 = var85 >> 8 & 255;
                              int var88 = var85 & 255;
                              var89 = (int)((float)var89 * var58);
                              if(var89 < 0) {
                                 var89 = 0;
                              } else if(var89 > 255) {
                                 var89 = 255;
                              }

                              var90 = (int)((float)var90 * var58);
                              if(var90 < 0) {
                                 var90 = 0;
                              } else if(var90 > 255) {
                                 var90 = 255;
                              }

                              var88 = (int)((float)var88 * var58);
                              if(var88 < 0) {
                                 var88 = 0;
                              } else if(var88 > 255) {
                                 var88 = 255;
                              }

                              var85 = var89 << 16 | var90 << 8 | var88;
                           }
                        } else {
                           var85 = var50;
                        }

                        if(this.aRenderer_Sub2_10854.isBigEndian) {
                           vertexStream.putFloatBigEndian((float)var38);
                           vertexStream.putFloatBigEndian((float)(this.getHeight(var38, var39) + var44));
                           vertexStream.putFloatBigEndian((float)var39);
                           vertexStream.putByte((byte)(var85 >> 16));
                           vertexStream.putByte((byte)(var85 >> 8));
                           vertexStream.putByte((byte)var85);
                           vertexStream.putByte(-1);
                           vertexStream.putFloatBigEndian((float)var38);
                           vertexStream.putFloatBigEndian((float)var39);
                           if(this.anIntArrayArrayArray_10868 != null) {
                              vertexStream.putFloatBigEndian(var17 != null?(float)(var17[var81] - 1):0.0F);
                           }

                           if((this.anInt_10882 & 7) != 0) {
                              vertexStream.putFloatBigEndian(var52);
                              vertexStream.putFloatBigEndian(var53);
                              vertexStream.putFloatBigEndian(var54);
                           }
                        } else {
                           vertexStream.putFloatLittleEndian((float)var38);
                           vertexStream.putFloatLittleEndian((float)(this.getHeight(var38, var39) + var44));
                           vertexStream.putFloatLittleEndian((float)var39);
                           vertexStream.putByte((byte)(var85 >> 16));
                           vertexStream.putByte((byte)(var85 >> 8));
                           vertexStream.putByte((byte)var85);
                           vertexStream.putByte(-1);
                           vertexStream.putFloatLittleEndian((float)var38);
                           vertexStream.putFloatLittleEndian((float)var39);
                           if(this.anIntArrayArrayArray_10868 != null) {
                              vertexStream.putFloatLittleEndian(var17 != null?(float)(var17[var81] - 1):0.0F);
                           }

                           if((this.anInt_10882 & 7) != 0) {
                              vertexStream.putFloatLittleEndian(var52);
                              vertexStream.putFloatLittleEndian(var53);
                              vertexStream.putFloatLittleEndian(var54);
                           }
                        }

                        var37 = this.anInt_10859++;
                        var82[var81] = (short)var37;
                        if(var42 != -1) {
                           var5[var37] = var11[var81];
                        }

                        var7.insert(new Class240_Sub21(var82[var81]), var45);
                     } else {
                        var82[var81] = ((Class240_Sub21)var84).aShort_7275;
                        var37 = var82[var81] & '\uffff';
                        if(var42 != -1 && var11[var81].id * 4058728944299054175L < var5[var37].id * 4058728944299054175L) {
                           var5[var37] = var11[var81];
                        }
                     }

                     for(var85 = 0; var85 < var34; ++var85) {
                        var8[var85].method4911(var37, var50, var83, var51);
                     }

                     ++this.anInt_10873;
                  }
               }
            }
         }

         for(var9 = 0; var9 < this.anInt_10859; ++var9) {
            Class240_Sub38 var68 = var5[var9];
            if(var68 != null) {
               var68.method4908(var9);
            }
         }

         for(var9 = 0; var9 < this.maxWidth * 1658489349; ++var9) {
            for(var10 = 0; var10 < this.maxHeight * 445373459; ++var10) {
               short[] var67 = this.aShortArrayArray_10852[var10 * this.maxWidth * 1658489349 + var9];
               if(var67 != null) {
                  int var69 = 0;

                  for(int var73 = 0; var73 < var67.length; ++var69) {
                     int var74 = var67[var73++] & '\uffff';
                     int var75 = var67[var73++] & '\uffff';
                     int var76 = var67[var73++] & '\uffff';
                     Class240_Sub38 var77 = var5[var74];
                     Class240_Sub38 var79 = var5[var75];
                     Class240_Sub38 var78 = var5[var76];
                     Class240_Sub38 var80 = null;
                     if(var77 != null) {
                        var77.method4907(var9, var10, var69);
                        var80 = var77;
                     }

                     if(var79 != null) {
                        var79.method4907(var9, var10, var69);
                        if(var80 == null || var79.id * 4058728944299054175L < var80.id * 4058728944299054175L) {
                           var80 = var79;
                        }
                     }

                     if(var78 != null) {
                        var78.method4907(var9, var10, var69);
                        if(var80 == null || var78.id * 4058728944299054175L < var80.id * 4058728944299054175L) {
                           var80 = var78;
                        }
                     }

                     if(var80 != null) {
                        if(var77 != null) {
                           var80.method4908(var74);
                        }

                        if(var79 != null) {
                           var80.method4908(var75);
                        }

                        if(var78 != null) {
                           var80.method4908(var76);
                        }

                        var80.method4907(var9, var10, var69);
                     }
                  }
               }
            }
         }

         vertexStream.flush();
         this.anOGLBuffer_10870 = this.aRenderer_Sub2_10854.createOGLBuffer(var2, vertexBuffer, vertexStream.method2383(), false);
         if(this.anOGLBuffer_10870 instanceof OGLVBuffer) {
            vertexBuffer.delete();
         }

         this.vertexPointer = new OGLBufferPointer(this.anOGLBuffer_10870, 5126, 3, 0);
         this.anOGLBufferPointer_10875 = new OGLBufferPointer(this.anOGLBuffer_10870, 5121, 4, 12);
         byte var66;
         if(this.anIntArrayArrayArray_10868 != null) {
            this.anOGLBufferPointer_10877 = new OGLBufferPointer(this.anOGLBuffer_10870, 5126, 3, 16);
            var66 = 28;
         } else {
            this.anOGLBufferPointer_10877 = new OGLBufferPointer(this.anOGLBuffer_10870, 5126, 2, 16);
            var66 = 24;
         }

         if((this.anInt_10882 & 7) != 0) {
            this.normalPointer = new OGLBufferPointer(this.anOGLBuffer_10870, 5126, 3, var66);
         }

         long[] var71 = new long[this.aClass240Array_10872.length];

         for(int var70 = 0; var70 < this.aClass240Array_10872.length; ++var70) {
            Class240_Sub38 var72 = (Class240_Sub38)this.aClass240Array_10872[var70];
            var71[var70] = var72.id * 4058728944299054175L;
            var72.method4909(this.anInt_10859);
         }

         Class610.method6560(var71, this.aClass240Array_10872, 1956149270);
         if(this.aClass137_10856 != null) {
            this.aClass137_10856.method1810();
         }
      } else {
         this.aClass137_10856 = null;
      }

      if((this.anInt_10857 & 2) == 0) {
         this.anIntArrayArrayArray_10878 = (int[][][])null;
         this.anIntArrayArrayArray_10865 = (int[][][])null;
         this.anIntArrayArrayArray_10863 = (int[][][])null;
      }

      this.anIntArrayArrayArray_10868 = (int[][][])null;
      this.anIntArrayArrayArray_10862 = (int[][][])null;
      this.anIntArrayArrayArray_10867 = (int[][][])null;
      this.aClass240_Sub38ArrayArrayArray_10861 = (Class240_Sub38[][][])null;
      this.aByteArrayArray_10880 = (byte[][])null;
      this.aNodeArrayList_10864 = null;
      this.aFloatArrayArray_10858 = (float[][])null;
      this.aFloatArrayArray_10884 = (float[][])null;
      this.aFloatArrayArray_10881 = (float[][])null;
   }

   public void method2161(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method7491(var1, var2, var3, var4, var5, var6);
   }

   void method7491(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass240Array_10872 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.aRenderer_Sub2_10854.anIntArray_10362.length < var7) {
            this.aRenderer_Sub2_10854.anIntArray_10362 = new int[var7];
         }

         if(this.aRenderer_Sub2_10854.aClass240_Sub8_Sub2_10359.data.length < this.anInt_10873 * 2) {
            this.aRenderer_Sub2_10854.aClass240_Sub8_Sub2_10359 = new BufferDataNode(this.anInt_10873 * 2);
         }

         int var8 = var1 - var3;
         int var9 = var8;
         if(var8 < 0) {
            var8 = 0;
         }

         int var10 = var2 - var3;
         int var11 = var10;
         if(var10 < 0) {
            var10 = 0;
         }

         int var12 = var1 + var3;
         if(var12 > this.maxWidth * 1658489349 - 1) {
            var12 = this.maxWidth * 1658489349 - 1;
         }

         int var13 = var2 + var3;
         if(var13 > this.maxHeight * 445373459 - 1) {
            var13 = this.maxHeight * 445373459 - 1;
         }

         int var14 = 0;
         int[] var15 = this.aRenderer_Sub2_10854.anIntArray_10362;

         int var16;
         for(var16 = var8; var16 <= var12; ++var16) {
            boolean[] var17 = var4[var16 - var9];

            for(int var18 = var10; var18 <= var13; ++var18) {
               if(var17[var18 - var11]) {
                  var15[var14++] = var18 * this.maxWidth * 1658489349 + var16;
               }
            }
         }

         this.aRenderer_Sub2_10854.method7013();
         this.aRenderer_Sub2_10854.method7066((this.anInt_10882 & 7) != 0);

         for(var16 = 0; var16 < this.aClass240Array_10872.length - 0; ++var16) {
            ((Class240_Sub38)this.aClass240Array_10872[var16]).method4910(var15, var14);
         }

         if(!this.aNodeList_10871.isEmpty(1483906013)) {
            var16 = this.aRenderer_Sub2_10854.anInt_10291;
            int var20 = this.aRenderer_Sub2_10854.anInt_10457;
            this.aRenderer_Sub2_10854.method1949(0, var20, this.aRenderer_Sub2_10854.anInt_10408);
            this.aRenderer_Sub2_10854.method7066(false);
            this.aRenderer_Sub2_10854.method7029(false);
            this.aRenderer_Sub2_10854.setBlendFunc(128);
            this.aRenderer_Sub2_10854.method6957(-2);
            this.aRenderer_Sub2_10854.setTextureRenderer(this.aRenderer_Sub2_10854.anOGLTexture_Sub3_10425);
            this.aRenderer_Sub2_10854.setTexEnv(8448, 7681);
            this.aRenderer_Sub2_10854.method7020(0, '\u8576', 770);
            this.aRenderer_Sub2_10854.method7055(0, '\u8577', 770);

            for(NodeListNode var21 = this.aNodeList_10871.getBaseNode_2((byte)51); var21 != null; var21 = this.aNodeList_10871.getNext(-1625383044)) {
               Class240_Sub31 var19 = (Class240_Sub31)var21;
               var19.method4876(var1, var2, var3, var4);
            }

            this.aRenderer_Sub2_10854.method7020(0, 5890, 768);
            this.aRenderer_Sub2_10854.method7055(0, 5890, 770);
            this.aRenderer_Sub2_10854.setTextureRenderer((OGLTexture)null);
            this.aRenderer_Sub2_10854.method1949(var16, var20, this.aRenderer_Sub2_10854.anInt_10408);
         }

         if(this.aClass137_10856 != null) {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
            this.aRenderer_Sub2_10854.setPointers(this.vertexPointer, (OGLBufferPointer)null, (OGLBufferPointer)null, this.anOGLBufferPointer_10877);
            this.aClass137_10856.method1802(var1, var2, var3, var4, var5);
            OpenGL.glPopMatrix();
         }
      }

   }

   public Class240_Sub22_Sub7 method2156(int var1, int var2, Class240_Sub22_Sub7 var3) {
      if((this.aByteArrayArray_10869[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.anInt_3031 * 69671577 >> this.aRenderer_Sub2_10854.anInt_10407;
         Class240_Sub22_Sub7_Sub1 var5 = (Class240_Sub22_Sub7_Sub1)var3;
         Class240_Sub22_Sub7_Sub1 var6;
         if(var5 != null && var5.method2209(var4, var4)) {
            var6 = var5;
            var5.method2206();
         } else {
            var6 = new Class240_Sub22_Sub7_Sub1(this.aRenderer_Sub2_10854, var4, var4);
         }

         var6.method2210(0, 0, var4, var4);
         this.method7498(var6, var1, var2);
         return var6;
      }
   }

   public void method2158(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass137_10856 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aRenderer_Sub2_10854.anInt_10403 >> 8) >> this.aRenderer_Sub2_10854.anInt_10407;
         int var8 = var4 - (var3 * this.aRenderer_Sub2_10854.anInt_10435 >> 8) >> this.aRenderer_Sub2_10854.anInt_10407;
         this.aClass137_10856.method1804(var1, var7, var8);
      }
   }

   public void method2160(Class240_Sub53 var1, int[] var2) {
      this.aNodeList_10871.addNode(new Class240_Sub31(this.aRenderer_Sub2_10854, this, var1, var2), (short)-11678);
   }

   public boolean method2159(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass137_10856 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aRenderer_Sub2_10854.anInt_10403 >> 8) >> this.aRenderer_Sub2_10854.anInt_10407;
         int var8 = var4 - (var3 * this.aRenderer_Sub2_10854.anInt_10435 >> 8) >> this.aRenderer_Sub2_10854.anInt_10407;
         return this.aClass137_10856.method1805(var1, var7, var8);
      } else {
         return false;
      }
   }

   public void method2152(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      DrawingTarget var9 = this.aRenderer_Sub2_10854.method1896(-1954541655);
      if(this.anInt_10883 > 0 && var9 != null) {
         this.aRenderer_Sub2_10854.method7011();
         this.aRenderer_Sub2_10854.method7026(false);
         this.aRenderer_Sub2_10854.method7066(false);
         this.aRenderer_Sub2_10854.method7028(false);
         this.aRenderer_Sub2_10854.method7029(false);
         this.aRenderer_Sub2_10854.setBlendFunc(0);
         this.aRenderer_Sub2_10854.method6957(-2);
         this.aRenderer_Sub2_10854.setTextureRenderer((OGLTexture)null);
         aFloatArray_10885[0] = (float)var3 / (128.0F * (float)(this.anInt_3031 * 69671577) * (float)var9.method2194());
         aFloatArray_10885[1] = 0.0F;
         aFloatArray_10885[2] = 0.0F;
         aFloatArray_10885[3] = 0.0F;
         aFloatArray_10885[4] = 0.0F;
         aFloatArray_10885[5] = (float)var3 / (128.0F * (float)(this.anInt_3031 * 69671577) * (float)var9.method2198());
         aFloatArray_10885[6] = 0.0F;
         aFloatArray_10885[7] = 0.0F;
         aFloatArray_10885[8] = 0.0F;
         aFloatArray_10885[9] = 0.0F;
         aFloatArray_10885[10] = 0.0F;
         aFloatArray_10885[11] = 0.0F;
         aFloatArray_10885[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2194();
         aFloatArray_10885[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2198();
         aFloatArray_10885[14] = 0.0F;
         aFloatArray_10885[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(aFloatArray_10885, 0);
         aFloatArray_10885[0] = 1.0F;
         aFloatArray_10885[1] = 0.0F;
         aFloatArray_10885[2] = 0.0F;
         aFloatArray_10885[3] = 0.0F;
         aFloatArray_10885[4] = 0.0F;
         aFloatArray_10885[5] = 0.0F;
         aFloatArray_10885[6] = 1.0F;
         aFloatArray_10885[7] = 0.0F;
         aFloatArray_10885[8] = 0.0F;
         aFloatArray_10885[9] = 1.0F;
         aFloatArray_10885[10] = 0.0F;
         aFloatArray_10885[11] = 0.0F;
         aFloatArray_10885[12] = 0.0F;
         aFloatArray_10885[13] = 0.0F;
         aFloatArray_10885[14] = 0.0F;
         aFloatArray_10885[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(aFloatArray_10885, 0);
         if((this.anInt_10882 & 7) != 0) {
            this.aRenderer_Sub2_10854.method7066(true);
            this.aRenderer_Sub2_10854.method6988();
         } else {
            this.aRenderer_Sub2_10854.method7066(false);
         }

         this.aRenderer_Sub2_10854.setPointers(this.vertexPointer, this.normalPointer, this.anOGLBufferPointer_10875, this.anOGLBufferPointer_10877);
         if(this.aRenderer_Sub2_10854.aClass240_Sub8_Sub2_10359.data.length < this.anInt_10873 * 2) {
            this.aRenderer_Sub2_10854.aClass240_Sub8_Sub2_10359 = new BufferDataNode(this.anInt_10873 * 2);
         } else {
            this.aRenderer_Sub2_10854.aClass240_Sub8_Sub2_10359.index = 0;
         }

         int var10 = 0;
         BufferDataNode var11 = this.aRenderer_Sub2_10854.aClass240_Sub8_Sub2_10359;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if(this.aRenderer_Sub2_10854.isBigEndian) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.maxWidth * 1658489349 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if(var8[var14 - var4][var12 - var5]) {
                     var15 = this.aShortArrayArray_10852[var13];
                     if(var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method4463(var15[var16] & '\uffff', -291262158);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.maxWidth * 1658489349 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if(var8[var14 - var4][var12 - var5]) {
                     var15 = this.aShortArrayArray_10852[var13];
                     if(var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method4464(var15[var16] & '\uffff', (byte)1);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if(var10 > 0) {
            Class157_Sub1 var17 = new Class157_Sub1(this.aRenderer_Sub2_10854, 5123, var11.data, var11.index * 964952859);
            this.aRenderer_Sub2_10854.method7009(var17, 4, 0, var10);
         }

      }
   }

   Class171_Sub1(OpenGLRenderer var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.aRenderer_Sub2_10854 = var1;
      this.anInt_10855 = this.shiftAmount * 1694172417 - 2;
      this.anInt_10860 = 1 << this.anInt_10855;
      this.anInt_10857 = var2;
      this.anInt_10882 = var3;
      this.anIntArrayArrayArray_10867 = new int[var4][var5][];
      this.aClass240_Sub38ArrayArrayArray_10861 = new Class240_Sub38[var4][var5][];
      this.anIntArrayArrayArray_10865 = new int[var4][var5][];
      this.anIntArrayArrayArray_10878 = new int[var4][var5][];
      this.anIntArrayArrayArray_10863 = new int[var4][var5][];
      this.anIntArrayArrayArray_10862 = new int[var4][var5][];
      this.aShortArrayArray_10852 = new short[var4 * var5][];
      this.aByteArrayArray_10869 = new byte[var4][var5];
      this.aByteArrayArray_10880 = new byte[var4 + 1][var5 + 1];
      this.aFloatArrayArray_10881 = new float[this.maxWidth * 1658489349 + 1][this.maxHeight * 445373459 + 1];
      this.aFloatArrayArray_10884 = new float[this.maxWidth * 1658489349 + 1][this.maxHeight * 445373459 + 1];
      this.aFloatArrayArray_10858 = new float[this.maxWidth * 1658489349 + 1][this.maxHeight * 445373459 + 1];

      for(int var9 = 1; var9 < this.maxHeight * 445373459; ++var9) {
         for(int var10 = 1; var10 < this.maxWidth * 1658489349; ++var10) {
            int var11 = var7[var10 + 1][var9] - var7[var10 - 1][var9];
            int var12 = var7[var10][var9 + 1] - var7[var10][var9 - 1];
            float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + 4 * var8 * var8 + var12 * var12)));
            this.aFloatArrayArray_10881[var10][var9] = (float)var11 * var13;
            this.aFloatArrayArray_10884[var10][var9] = (float)(-var8 * 2) * var13;
            this.aFloatArrayArray_10858[var10][var9] = (float)var12 * var13;
         }
      }

      this.aNodeArrayList_10864 = new NodeArrayList(128);
      if((this.anInt_10882 & 16) != 0) {
         this.aClass137_10856 = new Class137(this.aRenderer_Sub2_10854, this);
      }

   }

   public void define(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class105 var11, boolean var12) {
      Class163 var13 = this.aRenderer_Sub2_10854.aClass163_2802;
      if(var6 != null && this.anIntArrayArrayArray_10868 == null) {
         this.anIntArrayArrayArray_10868 = new int[this.maxWidth * 1658489349][this.maxHeight * 445373459][];
      }

      if(var4 != null && this.anIntArrayArrayArray_10867 == null) {
         this.anIntArrayArrayArray_10867 = new int[this.maxWidth * 1658489349][this.maxHeight * 445373459][];
      }

      this.anIntArrayArrayArray_10865[var1][var2] = var3;
      this.anIntArrayArrayArray_10878[var1][var2] = var5;
      this.anIntArrayArrayArray_10863[var1][var2] = var7;
      this.anIntArrayArrayArray_10862[var1][var2] = var8;
      if(this.anIntArrayArrayArray_10868 != null) {
         this.anIntArrayArrayArray_10868[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray_10867 != null) {
         this.anIntArrayArrayArray_10867[var1][var2] = var4;
      }

      Class240_Sub38[] var14 = this.aClass240_Sub38ArrayArrayArray_10861[var1][var2] = new Class240_Sub38[var7.length];
      int var15 = 0;

      while(var15 < var7.length) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt_10882 & 32) != 0 && var16 != -1 && var13.method1996(var16, (byte)2).aBoolean_3174) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt_1985 * -1210673351) << 48 | (long)(var11.anInt_1981 * 1611763201) << 42 | (long)(var11.anInt_1982 * 1829281247) << 28 | (long)(var17 << 14) | (long)var16;
         NodeListNode var20 = this.aNodeArrayList_10864.getNode(var18);

         while(true) {
            if(var20 != null) {
               Class240_Sub38 var21 = (Class240_Sub38)var20;
               if(var21.anInt_7522 != var16 || var21.aFloat_7524 != (float)var17 || !var21.aClass105_7529.method1352(var11, (byte)-49)) {
                  var20 = this.aNodeArrayList_10864.method5939(-1135136201);
                  continue;
               }
            }

            if(var20 == null) {
               var14[var15] = new Class240_Sub38(this, var16, var17, var11);
               this.aNodeArrayList_10864.insert(var14[var15], var18);
            } else {
               var14[var15] = (Class240_Sub38)var20;
            }

            ++var15;
            break;
         }
      }

      if(var12) {
         this.aByteArrayArray_10869[var1][var2] = (byte)(this.aByteArrayArray_10869[var1][var2] | 1);
      }

      if(var7.length > this.anInt_10879) {
         this.anInt_10879 = var7.length;
      }

      this.anInt_10883 += var7.length;
   }

   void method7498(Class240_Sub22_Sub7_Sub1 var1, int var2, int var3) {
      int[] var4 = this.anIntArrayArrayArray_10865[var2][var3];
      int[] var5 = this.anIntArrayArrayArray_10878[var2][var3];
      int var6 = var4.length;
      if(this.aRenderer_Sub2_10854.anIntArray_10466.length < var6) {
         this.aRenderer_Sub2_10854.anIntArray_10466 = new int[var6];
         this.aRenderer_Sub2_10854.anIntArray_10467 = new int[var6];
      }

      int[] var7 = this.aRenderer_Sub2_10854.anIntArray_10466;
      int[] var8 = this.aRenderer_Sub2_10854.anIntArray_10467;

      int var9;
      for(var9 = 0; var9 < var6; ++var9) {
         var7[var9] = var4[var9] >> this.aRenderer_Sub2_10854.anInt_10407;
         var8[var9] = var5[var9] >> this.aRenderer_Sub2_10854.anInt_10407;
      }

      var9 = 0;

      while(var9 < var6) {
         int var10 = var7[var9];
         int var11 = var8[var9++];
         int var12 = var7[var9];
         int var13 = var8[var9++];
         int var14 = var7[var9];
         int var15 = var8[var9++];
         if((var10 - var12) * (var13 - var15) - (var13 - var11) * (var14 - var12) > 0) {
            var1.method2207(var11, var13, var15, var10, var12, var14);
         }
      }

   }
}
