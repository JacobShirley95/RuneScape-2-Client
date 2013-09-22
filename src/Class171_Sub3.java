import java.nio.ByteBuffer;
import java.util.Iterator;
import sun.misc.Unsafe;

public class Class171_Sub3 extends Plane {

   NodeList aNodeList_11077 = new NodeList();
   int anInt_11078;
   static final int anInt_11079 = 1;
   int anInt_11080;
   int anInt_11081;
   final Renderer_Sub3 aRenderer_Sub3_11082;
   Class379 aClass379_11083;
   int anInt_11084;
   int anInt_11085;
   short[][] aShortArrayArray_11086;
   float aFloat_11087 = Float.MAX_VALUE;
   float aFloat_11088 = -3.4028235E38F;
   Class240_Sub37[][][] aClass240_Sub37ArrayArrayArray_11089;
   int[][][] anIntArrayArrayArray_11090;
   int[][][] anIntArrayArrayArray_11091;
   final int anInt_11092;
   int[][][] anIntArrayArrayArray_11093;
   int[][][] anIntArrayArrayArray_11094;
   int[][][] anIntArrayArrayArray_11095;
   byte[][] aByteArrayArray_11096;
   Class64 aClass64_11097;
   long aLong_11098;
   NodeListNode[] aClass240Array_11099;
   int anInt_11100;
   Class76 aClass76_11101;
   int anInt_11102;
   int[] anIntArray_11103 = new int[1];
   Class76 aClass76_11104;
   byte[][] aByteArrayArray_11105;
   float[][] aFloatArrayArray_11106;
   float[][] aFloatArrayArray_11107;
   float[][] aFloatArrayArray_11108;
   NodeArrayList aNodeArrayList_11109;
   NodeListNode[] aClass240Array_11110;
   static final int anInt_11111 = 74;
   int anInt_11112;
   long aLong_11113;
   long aLong_11114;
   int anInt_11115;
   int[][][] anIntArrayArrayArray_11116;
   int[] anIntArray_11117 = new int[1];
   int anInt_11118;
   int[] anIntArray_11119 = new int[1];


   void method7668() {
      if((this.anInt_11078 & 2) == 0) {
         this.anIntArrayArrayArray_11116 = (int[][][])null;
         this.anIntArrayArrayArray_11093 = (int[][][])null;
         this.anIntArrayArrayArray_11090 = (int[][][])null;
      }

      this.anIntArrayArrayArray_11095 = (int[][][])null;
      this.anIntArrayArrayArray_11091 = (int[][][])null;
      this.anIntArrayArrayArray_11094 = (int[][][])null;
      this.aClass240_Sub37ArrayArrayArray_11089 = (Class240_Sub37[][][])null;
      this.aByteArrayArray_11105 = (byte[][])null;
      this.aNodeArrayList_11109 = null;
      this.aClass240Array_11110 = null;
      this.aFloatArrayArray_11108 = (float[][])null;
      this.aFloatArrayArray_11107 = (float[][])null;
      this.aFloatArrayArray_11106 = (float[][])null;
   }

   Class171_Sub3(Renderer_Sub3 var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.aRenderer_Sub3_11082 = var1;
      this.anInt_11080 = this.shiftAmount * 1694172417 - 2;
      this.anInt_11081 = 1 << this.anInt_11080;
      this.anInt_11078 = var2;
      this.anInt_11092 = var3;
      this.anIntArrayArrayArray_11094 = new int[var4][var5][];
      this.aClass240_Sub37ArrayArrayArray_11089 = new Class240_Sub37[var4][var5][];
      this.anIntArrayArrayArray_11093 = new int[var4][var5][];
      this.anIntArrayArrayArray_11116 = new int[var4][var5][];
      this.anIntArrayArrayArray_11090 = new int[var4][var5][];
      this.anIntArrayArrayArray_11091 = new int[var4][var5][];
      this.aShortArrayArray_11086 = new short[var4 * var5][];
      this.aByteArrayArray_11096 = new byte[var4][var5];
      this.aByteArrayArray_11105 = new byte[var4 + 1][var5 + 1];
      this.aFloatArrayArray_11106 = new float[this.maxWidth * 1658489349 + 1][this.maxHeight * 445373459 + 1];
      this.aFloatArrayArray_11107 = new float[this.maxWidth * 1658489349 + 1][this.maxHeight * 445373459 + 1];
      this.aFloatArrayArray_11108 = new float[this.maxWidth * 1658489349 + 1][this.maxHeight * 445373459 + 1];

      for(int var9 = 0; var9 <= this.maxHeight * 445373459; ++var9) {
         for(int var10 = 0; var10 <= this.maxWidth * 1658489349; ++var10) {
            int var11 = this.anIntArrayArray_3029[var10][var9];
            if((float)var11 < this.aFloat_11087) {
               this.aFloat_11087 = (float)var11;
            }

            if((float)var11 > this.aFloat_11088) {
               this.aFloat_11088 = (float)var11;
            }

            if(var10 > 0 && var9 > 0 && var10 < this.maxWidth * 1658489349 && var9 < this.maxHeight * 445373459) {
               int var12 = var7[var10 + 1][var9] - var7[var10 - 1][var9];
               int var13 = var7[var10][var9 + 1] - var7[var10][var9 - 1];
               float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 4 * var8 * var8 + var13 * var13)));
               this.aFloatArrayArray_11106[var10][var9] = (float)var12 * var14;
               this.aFloatArrayArray_11107[var10][var9] = (float)(-var8 * 2) * var14;
               this.aFloatArrayArray_11108[var10][var9] = (float)var13 * var14;
            }
         }
      }

      --this.aFloat_11087;
      ++this.aFloat_11088;
      this.aNodeArrayList_11109 = new NodeArrayList(128);
      if((this.anInt_11092 & 16) != 0) {
         this.aClass64_11097 = new Class64(this.aRenderer_Sub3_11082, this);
      }

   }

   public void method2151(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class105 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = new int[var16 * 3];
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
         var20[var25] = var11 != null?var11[var26]:var10[var26];
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
         var20[var25] = var11 != null?var11[var26]:var10[var26];
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
         var20[var25] = var11 != null?var11[var26]:var10[var26];
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

   public void define(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class105 var11, boolean var12) {
      Class163 var13 = this.aRenderer_Sub3_11082.aClass163_2802;
      if(var6 != null && this.anIntArrayArrayArray_11095 == null) {
         this.anIntArrayArrayArray_11095 = new int[this.maxWidth * 1658489349][this.maxHeight * 445373459][];
      }

      if(var4 != null && this.anIntArrayArrayArray_11094 == null) {
         this.anIntArrayArrayArray_11094 = new int[this.maxWidth * 1658489349][this.maxHeight * 445373459][];
      }

      this.anIntArrayArrayArray_11093[var1][var2] = var3;
      this.anIntArrayArrayArray_11116[var1][var2] = var5;
      this.anIntArrayArrayArray_11090[var1][var2] = var7;
      this.anIntArrayArrayArray_11091[var1][var2] = var8;
      if(this.anIntArrayArrayArray_11095 != null) {
         this.anIntArrayArrayArray_11095[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray_11094 != null) {
         this.anIntArrayArrayArray_11094[var1][var2] = var4;
      }

      Class240_Sub37[] var14 = this.aClass240_Sub37ArrayArrayArray_11089[var1][var2] = new Class240_Sub37[var7.length];
      int var15 = 0;

      while(var15 < var7.length) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt_11092 & 32) != 0 && var16 != -1 && var13.method1996(var16, (byte)2).aBoolean_3174) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt_1985 * -1210673351) << 48 | (long)(var11.anInt_1981 * 1611763201) << 42 | (long)(var11.anInt_1982 * 1829281247) << 28 | (long)(var17 << 14) | (long)var16;
         NodeListNode var20 = this.aNodeArrayList_11109.getNode(var18);

         while(true) {
            if(var20 != null) {
               Class240_Sub37 var21 = (Class240_Sub37)var20;
               if(var21.anInt_7500 != var16 || var21.aFloat_7501 != (float)var17 || !var21.aClass105_7502.method1352(var11, (byte)69)) {
                  var20 = this.aNodeArrayList_11109.method5939(-1135136201);
                  continue;
               }
            }

            if(var20 == null) {
               var14[var15] = new Class240_Sub37(this, var16, var17, var11);
               this.aNodeArrayList_11109.insert(var14[var15], var18);
            } else {
               var14[var15] = (Class240_Sub37)var20;
            }

            ++var15;
            break;
         }
      }

      if(var12) {
         this.aByteArrayArray_11096[var1][var2] = (byte)(this.aByteArrayArray_11096[var1][var2] | 1);
      }

      if(var7.length > this.anInt_11102) {
         this.anInt_11102 = var7.length;
      }

      this.anInt_11084 += var7.length;
   }

   void method7671(int var1, int var2, byte[][] var3, Class240_Sub37[] var4, NodeArrayList var5, Class240_Sub37[] var6) {
      if(this.anIntArrayArrayArray_11090[var1][var2] != null) {
         Class240_Sub37[] var7 = this.aClass240_Sub37ArrayArrayArray_11089[var1][var2];
         int[] var8 = this.anIntArrayArrayArray_11093[var1][var2];
         int[] var9 = this.anIntArrayArrayArray_11116[var1][var2];
         int[] var10 = this.anIntArrayArrayArray_11091[var1][var2];
         int[] var11 = this.anIntArrayArrayArray_11090[var1][var2];
         int[] var12 = this.anIntArrayArrayArray_11094 != null?this.anIntArrayArrayArray_11094[var1][var2]:null;
         int[] var13 = this.anIntArrayArrayArray_11095 != null?this.anIntArrayArrayArray_11095[var1][var2]:null;
         if(var10 == null) {
            var10 = var11;
         }

         float var14 = this.aFloatArrayArray_11106[var1][var2];
         float var15 = this.aFloatArrayArray_11107[var1][var2];
         float var16 = this.aFloatArrayArray_11108[var1][var2];
         float var17 = this.aFloatArrayArray_11106[var1][var2 + 1];
         float var18 = this.aFloatArrayArray_11107[var1][var2 + 1];
         float var19 = this.aFloatArrayArray_11108[var1][var2 + 1];
         float var20 = this.aFloatArrayArray_11106[var1 + 1][var2 + 1];
         float var21 = this.aFloatArrayArray_11107[var1 + 1][var2 + 1];
         float var22 = this.aFloatArrayArray_11108[var1 + 1][var2 + 1];
         float var23 = this.aFloatArrayArray_11106[var1 + 1][var2];
         float var24 = this.aFloatArrayArray_11107[var1 + 1][var2];
         float var25 = this.aFloatArrayArray_11108[var1 + 1][var2];
         int var26 = var3[var1][var2] & 255;
         int var27 = var3[var1][var2 + 1] & 255;
         int var28 = var3[var1 + 1][var2 + 1] & 255;
         int var29 = var3[var1 + 1][var2] & 255;
         int var30 = 0;
         int var31 = 0;

         int var33;
         while(var31 < var11.length) {
            Class240_Sub37 var32 = var7[var31];
            var33 = 0;

            while(true) {
               if(var33 < var30) {
                  if(var4[var33] != var32) {
                     ++var33;
                     continue;
                  }
               } else {
                  var4[var30++] = var32;
               }

               ++var31;
               break;
            }
         }

         short[] var62 = this.aShortArrayArray_11086[var2 * this.maxWidth * 1658489349 + var1] = new short[var11.length];

         for(int var61 = 0; var61 < var11.length; ++var61) {
            int var34 = (var1 << this.shiftAmount * 1694172417) + var8[var61];
            int var35 = (var2 << this.shiftAmount * 1694172417) + var9[var61];
            int var36 = var34 >> this.anInt_11080;
            int var37 = var35 >> this.anInt_11080;
            int var38 = var11[var61];
            int var39 = var10[var61];
            int var40 = var12 != null?var12[var61]:0;
            long var41 = (long)var39 << 48 | (long)var38 << 32 | (long)(var36 << 16) | (long)var37;
            int var43 = var8[var61];
            int var44 = var9[var61];
            byte var45 = 74;
            int var46 = 0;
            float var47 = 1.0F;
            float var50;
            float var49;
            float var48;
            float var54;
            int var63;
            if(var43 == 0 && var44 == 0) {
               var48 = var14;
               var49 = var15;
               var50 = var16;
               var63 = var45 - var26;
            } else if(var43 == 0 && var44 == this.anInt_3031 * 69671577) {
               var48 = var17;
               var49 = var18;
               var50 = var19;
               var63 = var45 - var27;
            } else if(var43 == this.anInt_3031 * 69671577 && var44 == this.anInt_3031 * 69671577) {
               var48 = var20;
               var49 = var21;
               var50 = var22;
               var63 = var45 - var28;
            } else if(var43 == this.anInt_3031 * 69671577 && var44 == 0) {
               var48 = var23;
               var49 = var24;
               var50 = var25;
               var63 = var45 - var29;
            } else {
               float var51 = (float)var43 / (float)(this.anInt_3031 * 69671577);
               float var52 = (float)var44 / (float)(this.anInt_3031 * 69671577);
               float var53 = var14 + (var23 - var14) * var51;
               var54 = var15 + (var24 - var15) * var51;
               float var55 = var16 + (var25 - var16) * var51;
               float var56 = var17 + (var20 - var17) * var51;
               float var57 = var18 + (var21 - var18) * var51;
               float var58 = var19 + (var22 - var19) * var51;
               var48 = var53 + (var56 - var53) * var52;
               var49 = var54 + (var57 - var54) * var52;
               var50 = var55 + (var58 - var55) * var52;
               int var59 = var26 + ((var29 - var26) * var43 >> this.shiftAmount * 1694172417);
               int var60 = var27 + ((var28 - var27) * var43 >> this.shiftAmount * 1694172417);
               var63 = var45 - (var59 + ((var60 - var59) * var44 >> this.shiftAmount * 1694172417));
            }

            if(var38 != -1) {
               int var64 = (var38 & 127) * var63 >> 7;
               if(var64 < 2) {
                  var64 = 2;
               } else if(var64 > 126) {
                  var64 = 126;
               }

               var46 = Class561.anIntArray_9583[var38 & '\uff80' | var64];
               if((this.anInt_11092 & 7) == 0) {
                  var47 = this.aRenderer_Sub3_11082.aFloatArray_10574[0] * var48 + this.aRenderer_Sub3_11082.aFloatArray_10574[1] * var49 + this.aRenderer_Sub3_11082.aFloatArray_10574[2] * var50;
                  var47 = this.aRenderer_Sub3_11082.aFloat_10582 + var47 * (var47 > 0.0F?this.aRenderer_Sub3_11082.aFloat_10561:this.aRenderer_Sub3_11082.aFloat_10584);
               }
            }

            NodeListNode var66 = null;
            if((var34 & this.anInt_11081 - 1) == 0 && (var35 & this.anInt_11081 - 1) == 0) {
               var66 = var5.getNode(var41);
            }

            int var65;
            if(var66 == null) {
               if(var39 != var38) {
                  int var69 = (var39 & 127) * var63 >> 7;
                  if(var69 < 2) {
                     var69 = 2;
                  } else if(var69 > 126) {
                     var69 = 126;
                  }

                  var65 = Class561.anIntArray_9583[var39 & '\uff80' | var69];
                  if((this.anInt_11092 & 7) == 0) {
                     float var10000 = this.aRenderer_Sub3_11082.aFloatArray_10574[0] * var48 + this.aRenderer_Sub3_11082.aFloatArray_10574[1] * var49 + this.aRenderer_Sub3_11082.aFloatArray_10574[2] * var50;
                     var54 = this.aRenderer_Sub3_11082.aFloat_10582 + var47 * (var47 > 0.0F?this.aRenderer_Sub3_11082.aFloat_10561:this.aRenderer_Sub3_11082.aFloat_10584);
                     int var70 = var65 >> 16 & 255;
                     int var67 = var65 >> 8 & 255;
                     int var68 = var65 & 255;
                     var70 = (int)((float)var70 * var54);
                     if(var70 < 0) {
                        var70 = 0;
                     } else if(var70 > 255) {
                        var70 = 255;
                     }

                     var67 = (int)((float)var67 * var54);
                     if(var67 < 0) {
                        var67 = 0;
                     } else if(var67 > 255) {
                        var67 = 255;
                     }

                     var68 = (int)((float)var68 * var54);
                     if(var68 < 0) {
                        var68 = 0;
                     } else if(var68 > 255) {
                        var68 = 255;
                     }

                     var65 = var70 << 16 | var67 << 8 | var68;
                  }
               } else {
                  var65 = var46;
               }

               Unsafe var72 = this.aRenderer_Sub3_11082.anUnsafe_10510;
               var72.putFloat(this.aLong_11113, (float)var34);
               this.aLong_11113 += 4L;
               var72.putFloat(this.aLong_11113, (float)(this.getHeight(var34, var35) + var40));
               this.aLong_11113 += 4L;
               var72.putFloat(this.aLong_11113, (float)var35);
               this.aLong_11113 += 4L;
               var72.putFloat(this.aLong_11113, (float)var34);
               this.aLong_11113 += 4L;
               var72.putFloat(this.aLong_11113, (float)var35);
               this.aLong_11113 += 4L;
               if(this.anIntArrayArrayArray_11095 != null) {
                  var72.putFloat(this.aLong_11113, var13 != null?(float)(var13[var61] - 1):0.0F);
                  this.aLong_11113 += 4L;
               }

               if((this.anInt_11092 & 7) != 0) {
                  var72.putFloat(this.aLong_11113, var48);
                  this.aLong_11113 += 4L;
                  var72.putFloat(this.aLong_11113, var49);
                  this.aLong_11113 += 4L;
                  var72.putFloat(this.aLong_11113, var50);
                  this.aLong_11113 += 4L;
               }

               if(this.aRenderer_Sub3_11082.anInt_10640 == 0) {
                  int var71 = var65 & -16711936;
                  var71 |= (var65 & 16711680) >> 16;
                  var71 |= (var65 & 255) << 16;
                  var65 = var71;
               }

               var72.putInt(this.aLong_11098, -16777216 | var65);
               this.aLong_11098 += 4L;
               var33 = this.anInt_11112++;
               var62[var61] = (short)var33;
               if(var38 != -1) {
                  var6[var33] = var7[var61];
               }

               var5.insert(new Class240_Sub21(var62[var61]), var41);
            } else {
               var62[var61] = ((Class240_Sub21)var66).aShort_7275;
               var33 = var62[var61] & '\uffff';
               if(var38 != -1 && var7[var61].id * 4058728944299054175L < var6[var33].id * 4058728944299054175L) {
                  var6[var33] = var7[var61];
               }
            }

            for(var65 = 0; var65 < var30; ++var65) {
               var4[var65].method4898(var33, var46, var63, var47);
            }

            ++this.anInt_11085;
         }

      }
   }

   public void method2161(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass240Array_11099 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.anIntArray_11119.length < var7) {
            this.anIntArray_11119 = new int[var7];
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

         this.anInt_11118 = 0;

         for(int var14 = var8; var14 <= var12; ++var14) {
            boolean[] var15 = var4[var14 - var9];

            for(int var16 = var10; var16 <= var13; ++var16) {
               if(var15[var16 - var11]) {
                  this.anIntArray_11119[this.anInt_11118++] = var16 * this.maxWidth * 1658489349 + var14;
               }
            }
         }

         ByteBuffer var25 = this.aRenderer_Sub3_11082.aByteBuffer_10646;
         var25.clear();

         int var24;
         for(var24 = 0; var24 < this.aClass240Array_11099.length; ++var24) {
            Class240_Sub37 var26 = (Class240_Sub37)this.aClass240Array_11099[var24];
            var26.method4896(this.anIntArray_11119, this.anInt_11118);
         }

         var24 = var25.position();
         Class27 var29 = this.aRenderer_Sub3_11082.aClass27_10638;
         if(var24 != 0) {
            Class414 var17 = this.aRenderer_Sub3_11082.method7286(var24 / 2);
            var17.method4853(0, var24, this.aRenderer_Sub3_11082.aLong_10629);
            this.aRenderer_Sub3_11082.method7272();
            this.aRenderer_Sub3_11082.method7251(0, this.aClass76_11104);
            this.aRenderer_Sub3_11082.method7307(var17);
            var29.method192(ArrayViewport.anArrayViewport_6782);
            if(this.aRenderer_Sub3_11082.anInt_10627 > 0) {
               var29.aClass356_774.method4455(0.0F, 0.0F, 1.0F, -this.aRenderer_Sub3_11082.aFloat_10614);
               var29.aClass347_775.setPos((float)(this.aRenderer_Sub3_11082.anInt_10626 >> 16 & 255) / 255.0F, (float)(this.aRenderer_Sub3_11082.anInt_10626 >> 8 & 255) / 255.0F, (float)(this.aRenderer_Sub3_11082.anInt_10626 >> 0 & 255) / 255.0F);
               this.aRenderer_Sub3_11082.anArrayViewport_10527.replaceWith(this.aRenderer_Sub3_11082.anArrayViewport_10521);
               this.aRenderer_Sub3_11082.anArrayViewport_10527.method4569();
               var29.aClass356_774.method4461(this.aRenderer_Sub3_11082.anArrayViewport_10527);
               var29.aClass356_774.method4460(1.0F / (this.aRenderer_Sub3_11082.aFloat_10494 - this.aRenderer_Sub3_11082.aFloat_10614));
            } else {
               var29.aClass356_774.method4455(0.0F, 0.0F, 0.0F, 0.0F);
               var29.aClass347_775.setPos(0.0F, 0.0F, 0.0F);
            }

            int var19;
            int var18;
            Class240_Sub37 var20;
            Class183 var22;
            if((this.anInt_11092 & 7) == 0) {
               var18 = 0;

               for(var19 = 0; var19 < this.aClass240Array_11099.length; ++var19) {
                  var20 = (Class240_Sub37)this.aClass240Array_11099[var19];
                  if(var20.anInt_7507 != 0) {
                     if(this.aRenderer_Sub3_11082.aBoolean_10620) {
                        this.aRenderer_Sub3_11082.method1958(0, var20.aClass105_7502);
                        var29.aClass356_772.method4455(0.0F, 1.0F, 0.0F, (float)this.aRenderer_Sub3_11082.anInt_10622 + (float)(var20.aClass105_7502.anInt_1985 * -1210673351) / 255.0F * (float)(var20.aClass105_7502.anInt_1981 * 1611763201));
                        var29.aClass356_772.method4460(1.0F / (float)(var20.aClass105_7502.anInt_1981 * 1611763201));
                        var29.aClass347_781.setPos((float)(var20.aClass105_7502.anInt_1982 * 1829281247 >> 16 & 255) / 255.0F, (float)(var20.aClass105_7502.anInt_1982 * 1829281247 >> 8 & 255) / 255.0F, (float)(var20.aClass105_7502.anInt_1982 * 1829281247 >> 0 & 255) / 255.0F);
                     } else {
                        var29.aClass356_772.method4455(0.0F, 0.0F, 0.0F, 0.0F);
                        var29.aClass347_781.setPos(0.0F, 0.0F, 0.0F);
                     }

                     boolean var21 = false;
                     if(var20.anInt_7500 != -1) {
                        var22 = this.aRenderer_Sub3_11082.aClass163_2802.method1996(var20.anInt_7500, (byte)2);
                        var29.aClass384_762 = this.aRenderer_Sub3_11082.aClass58_10599.method565(var22);
                        var21 = !Class21.method126(var22.aByte_3169, (byte)122);
                     } else {
                        var29.aClass384_762 = this.aRenderer_Sub3_11082.aClass384_10563;
                     }

                     this.aRenderer_Sub3_11082.method7251(1, var20.aClass76_7503);
                     this.aRenderer_Sub3_11082.method7190(this.aClass379_11083);
                     var29.anArrayViewport_773.method4557(1.0F / var20.aFloat_7501, 1.0F / var20.aFloat_7501, 1.0F, 1.0F);
                     var29.anInt_768 = var20.anInt_7498;
                     var29.anInt_782 = var20.anInt_7506 - var20.anInt_7498 + 1;
                     var29.anInt_779 = var18;
                     var29.anInt_784 = var20.anInt_7507 / 3;
                     var29.method191(var21);
                     var18 += var20.anInt_7507;
                  }
               }
            } else {
               var29.aClass347_766.setPos(this.aRenderer_Sub3_11082.aFloatArray_10574[0], this.aRenderer_Sub3_11082.aFloatArray_10574[1], this.aRenderer_Sub3_11082.aFloatArray_10574[2]);
               var29.aClass347_777.setPos(this.aRenderer_Sub3_11082.aFloat_10561 * this.aRenderer_Sub3_11082.aFloat_10579, this.aRenderer_Sub3_11082.aFloat_10561 * this.aRenderer_Sub3_11082.aFloat_10580, this.aRenderer_Sub3_11082.aFloat_10561 * this.aRenderer_Sub3_11082.aFloat_10651);
               var29.aClass347_778.setPos(-this.aRenderer_Sub3_11082.aFloat_10584 * this.aRenderer_Sub3_11082.aFloat_10579, -this.aRenderer_Sub3_11082.aFloat_10584 * this.aRenderer_Sub3_11082.aFloat_10580, -this.aRenderer_Sub3_11082.aFloat_10584 * this.aRenderer_Sub3_11082.aFloat_10651);
               var29.aClass347_776.setPos(this.aRenderer_Sub3_11082.aFloat_10582 * this.aRenderer_Sub3_11082.aFloat_10579, this.aRenderer_Sub3_11082.aFloat_10582 * this.aRenderer_Sub3_11082.aFloat_10580, this.aRenderer_Sub3_11082.aFloat_10582 * this.aRenderer_Sub3_11082.aFloat_10651);
               var18 = 0;

               for(var19 = 0; var19 < this.aClass240Array_11099.length; ++var19) {
                  var20 = (Class240_Sub37)this.aClass240Array_11099[var19];
                  if(var20.anInt_7507 > 0) {
                     if(this.aRenderer_Sub3_11082.aBoolean_10620) {
                        this.aRenderer_Sub3_11082.method1958(0, var20.aClass105_7502);
                        float var34 = 0.15F;
                        var29.aClass356_772.method4455(0.0F, 1.0F / ((float)(var20.aClass105_7502.anInt_1981 * 1611763201) * var34), 0.0F, 256.0F / ((float)(var20.aClass105_7502.anInt_1981 * 1611763201) * var34));
                        var29.aClass347_781.setPos((float)(var20.aClass105_7502.anInt_1982 * 1829281247 >> 16 & 255) / 255.0F, (float)(var20.aClass105_7502.anInt_1982 * 1829281247 >> 8 & 255) / 255.0F, (float)(var20.aClass105_7502.anInt_1982 * 1829281247 >> 0 & 255) / 255.0F);
                     } else {
                        var29.aClass356_772.method4455(0.0F, 0.0F, 0.0F, 0.0F);
                        var29.aClass347_781.setPos(0.0F, 0.0F, 0.0F);
                     }

                     byte var32 = 11;
                     if(var20.anInt_7500 != -1) {
                        var22 = this.aRenderer_Sub3_11082.aClass163_2802.method1996(var20.anInt_7500, (byte)2);
                        var32 = var22.aByte_3169;
                        var29.aClass384_762 = this.aRenderer_Sub3_11082.aClass58_10599.method565(var22);
                        var29.method197(var22.aByte_3170);
                     } else {
                        var29.aClass384_762 = this.aRenderer_Sub3_11082.aClass384_10563;
                     }

                     this.aRenderer_Sub3_11082.method7251(1, var20.aClass76_7503);
                     this.aRenderer_Sub3_11082.method7190(this.aClass379_11083);
                     var29.anArrayViewport_773.method4557(1.0F / var20.aFloat_7501, 1.0F / var20.aFloat_7501, 1.0F, 1.0F);
                     var29.anInt_768 = var20.anInt_7498;
                     var29.anInt_782 = var20.anInt_7506 - var20.anInt_7498 + 1;
                     var29.anInt_779 = var18;
                     var29.anInt_784 = var20.anInt_7507 / 3;
                     switch(var32) {
                     case 1:
                        var29.aClass347_769.setPos(this.aRenderer_Sub3_11082.anArrayViewport_10522.data[12], this.aRenderer_Sub3_11082.anArrayViewport_10522.data[13], this.aRenderer_Sub3_11082.anArrayViewport_10522.data[14]);
                        if(this.aRenderer_Sub3_11082.aBoolean_10620) {
                           var29.method196();
                        } else {
                           var29.method194(0);
                        }
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if(!this.aRenderer_Sub3_11082.aBoolean_10505 && (this.anInt_11092 & 8) != 0 && this.aRenderer_Sub3_11082.aClass65_Sub1_Sub2_10523.method865(586576667)) {
                           Class65_Sub1_Sub2 var33 = this.aRenderer_Sub3_11082.aClass65_Sub1_Sub2_10523;
                           if(var32 == 2) {
                              var33 = this.aRenderer_Sub3_11082.aClass65_Sub1_Sub2_10612;
                           }

                           var33.anArrayViewport_1368.replaceWith(this.aRenderer_Sub3_11082.anArrayViewport_10542);
                           var33.anArrayViewport_1370.method4557(1.0F / (var20.aFloat_7501 * (float)(var20.aClass105_7502.anInt_1983 * 559531495)), 1.0F / (var20.aFloat_7501 * (float)(var20.aClass105_7502.anInt_1983 * 559531495)), 1.0F, 1.0F);
                           var33.aClass347_1372.setPos(this.aRenderer_Sub3_11082.anArrayViewport_10522.data[12], this.aRenderer_Sub3_11082.anArrayViewport_10522.data[13], this.aRenderer_Sub3_11082.anArrayViewport_10522.data[14]);
                           Class183 var23 = this.aRenderer_Sub3_11082.aClass163_2802.method1996(var20.anInt_7500, (byte)2);
                           var33.anInt_1392 = var23.aByte_3170 * 1298092581;
                           var33.anInt_1388 = var20.anInt_7498 * -592647117;
                           var33.anInt_1385 = (var20.anInt_7506 - var20.anInt_7498 + 1) * -1839052803;
                           var33.anInt_1390 = var18 * -437508653;
                           var33.anInt_1373 = var20.anInt_7507 / 3 * -1013636341;
                           var33.aClass356_1381.method4456(var29.aClass356_772);
                           var33.aClass347_1383.setPos(var29.aClass347_781);
                           var33.aClass356_1378.method4456(var29.aClass356_774);
                           var33.aClass347_1369.setPos(var29.aClass347_775);
                           var33.method862((byte)-51);
                        } else {
                           var29.method193(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if(this.aRenderer_Sub3_11082.aBoolean_10620) {
                           var29.method198();
                        } else {
                           var29.method193(0);
                        }
                        break;
                     case 6:
                        var29.method191(!Class21.method126(var32, (byte)60));
                        break;
                     case 7:
                        var29.aClass347_769.setPos(this.aRenderer_Sub3_11082.anArrayViewport_10522.data[12], this.aRenderer_Sub3_11082.anArrayViewport_10522.data[13], this.aRenderer_Sub3_11082.anArrayViewport_10522.data[14]);
                        var29.anArrayViewport_780.reset();
                        var29.aClass398_767 = this.aRenderer_Sub3_11082.method7172();
                        var29.method195(0);
                     }

                     var18 += var20.anInt_7507;
                  }
               }
            }
         }

         if(!this.aNodeList_11077.isEmpty(2116340443)) {
            this.aRenderer_Sub3_11082.method7279(128);
            this.aRenderer_Sub3_11082.method7200(false);
            GameCoord var28 = new GameCoord(var29.aClass347_775);
            var29.aClass347_775.setPos(0.0F, 0.0F, 0.0F);
            Iterator var30 = this.aNodeList_11077.iterator();

            while(var30.hasNext()) {
               Class240_Sub39 var31 = (Class240_Sub39)var30.next();
               var31.method4914(var29, var1, var2, var3, var4, var5);
            }

            var29.aClass347_775.setPos(var28);
         }

         if(this.aClass64_11097 != null) {
            this.aRenderer_Sub3_11082.method7279(1);
            this.aRenderer_Sub3_11082.method7251(0, this.aClass76_11104);
            this.aRenderer_Sub3_11082.method7251(1, this.aClass76_11101);
            this.aRenderer_Sub3_11082.method7190(this.aClass379_11083);
            ArrayViewport var27 = this.aRenderer_Sub3_11082.anArrayViewport_10527;
            var27.reset();
            var27.data[13] = -1.0F;
            var29.method192(var27);
            this.aClass64_11097.method651(var29, var1, var2, var3, var4, var5);
         }
      }

   }

   public void method2152(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      if(this.anInt_11084 > 0) {
         Class414 var9 = this.aRenderer_Sub3_11082.method7286(this.anInt_11085);
         int var10 = 0;
         int var11 = 32767;
         int var12 = -32768;
         ByteBuffer var13 = this.aRenderer_Sub3_11082.aByteBuffer_10646;
         var13.clear();

         for(int var14 = var5; var14 < var7; ++var14) {
            int var15 = var14 * this.maxWidth * 1658489349 + var4;

            for(int var16 = var4; var16 < var6; ++var16) {
               if(var8[var16 - var4][var14 - var5]) {
                  short[] var17 = this.aShortArrayArray_11086[var15];
                  if(var17 != null) {
                     for(int var18 = 0; var18 < var17.length; ++var18) {
                        int var19 = var17[var18] & '\uffff';
                        if(var19 > var12) {
                           var12 = var19;
                        }

                        if(var19 < var11) {
                           var11 = var19;
                        }

                        var13.putShort((short)var19);
                        ++var10;
                     }
                  }
               }

               ++var15;
            }
         }

         var9.method4853(0, var13.position(), this.aRenderer_Sub3_11082.aLong_10629);
         if(var10 > 0) {
            this.aRenderer_Sub3_11082.method7272();
            Class27 var20 = this.aRenderer_Sub3_11082.aClass27_10638;
            this.aRenderer_Sub3_11082.method7251(0, this.aClass76_11104);
            this.aRenderer_Sub3_11082.method7251(1, this.aClass76_11101);
            this.aRenderer_Sub3_11082.method7190(this.aClass379_11083);
            this.aRenderer_Sub3_11082.method7307(var9);
            this.aRenderer_Sub3_11082.setViewport(Viewport.aViewport_6845);
            float var22 = (float)this.aRenderer_Sub3_11082.method1896(968861434).method2194();
            float var21 = (float)this.aRenderer_Sub3_11082.method1896(-1581621996).method2198();
            Viewport var23 = new Viewport();
            Viewport var24 = new Viewport();
            var23.method4624(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
            var24.method4647((float)var3 / (256.0F * (float)(this.anInt_3031 * 69671577)), (float)(-var3) / (256.0F * (float)(this.anInt_3031 * 69671577)), 1.0F / (this.aFloat_11088 - this.aFloat_11087));
            var24.setOffset((float)var1 - (float)(var4 * var3) / 256.0F, (float)var2 + (float)(var7 * var3) / 256.0F, -this.aFloat_11087 / (this.aFloat_11088 - this.aFloat_11087));
            var24.method4631(2.0F / var22, 2.0F / var21, 1.0F);
            var24.setOffset(-1.0F, -1.0F, 0.0F);
            this.aRenderer_Sub3_11082.aViewport_10526.method4634(var23, var24);
            this.aRenderer_Sub3_11082.anArrayViewport_10527.setViewport(this.aRenderer_Sub3_11082.aViewport_10526);
            this.aRenderer_Sub3_11082.method1946(this.aRenderer_Sub3_11082.anArrayViewport_10527);
            var20.method192(ArrayViewport.anArrayViewport_6782);
            var20.aClass356_774.method4455(0.0F, 0.0F, 0.0F, 0.0F);
            var20.aClass347_775.setPos(0.0F, 0.0F, 0.0F);
            var20.aClass356_772.method4455(0.0F, 0.0F, 0.0F, 0.0F);
            var20.aClass347_781.setPos(0.0F, 0.0F, 0.0F);
            var20.aClass384_762 = this.aRenderer_Sub3_11082.aClass384_10563;
            var20.anArrayViewport_773.reset();
            var20.anInt_768 = var11;
            var20.anInt_782 = var12 - var11 + 1;
            var20.anInt_779 = 0;
            var20.anInt_784 = var10 / 3;
            if(this.aRenderer_Sub3_11082.aBoolean_10566) {
               this.aRenderer_Sub3_11082.enableZBuffering(false);
               var20.method191(false);
               this.aRenderer_Sub3_11082.enableZBuffering(true);
            } else {
               var20.method191(false);
            }
         }

      }
   }

   public Class240_Sub22_Sub7 method2156(int var1, int var2, Class240_Sub22_Sub7 var3) {
      if((this.aByteArrayArray_11096[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.anInt_3031 * 69671577 >> this.aRenderer_Sub3_11082.anInt_10589;
         Class240_Sub22_Sub7_Sub2 var5 = (Class240_Sub22_Sub7_Sub2)var3;
         Class240_Sub22_Sub7_Sub2 var6;
         if(var5 != null && var5.method2336(var4, var4)) {
            var6 = var5;
            var5.method2337();
         } else {
            var6 = new Class240_Sub22_Sub7_Sub2(this.aRenderer_Sub3_11082, var4, var4);
         }

         var6.method2335(0, 0, var4, var4);
         this.method7680(var6, var1, var2);
         return var6;
      }
   }

   public void method2153() {
      if(this.anInt_11084 <= 0) {
         this.aClass64_11097 = null;
         this.method7668();
      } else {
         byte[][] var1 = new byte[this.maxWidth * 1658489349 + 1][this.maxHeight * 445373459 + 1];

         int var2;
         int var3;
         for(var2 = 1; var2 < this.maxWidth * 1658489349; ++var2) {
            for(var3 = 1; var3 < this.maxHeight * 445373459; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray_11105[var2 - 1][var3] >> 2) + (this.aByteArrayArray_11105[var2 + 1][var3] >> 3) + (this.aByteArrayArray_11105[var2][var3 - 1] >> 2) + (this.aByteArrayArray_11105[var2][var3 + 1] >> 3) + (this.aByteArrayArray_11105[var2][var3] >> 1));
            }
         }

         this.aClass240Array_11110 = new NodeListNode[this.aNodeArrayList_11109.size()];
         this.aNodeArrayList_11109.size(this.aClass240Array_11110);

         for(var2 = 0; var2 < this.aClass240Array_11110.length; ++var2) {
            ((Class240_Sub37)this.aClass240Array_11110[var2]).method4897(this.anInt_11084);
         }

         this.anInt_11115 = 20;
         if(this.anIntArrayArrayArray_11095 != null) {
            this.anInt_11115 += 4;
         }

         if((this.anInt_11092 & 7) != 0) {
            this.anInt_11115 += 12;
         }

         this.aLong_11114 = this.aRenderer_Sub3_11082.anUnsafe_10510.allocateMemory((long)(this.anInt_11084 * 4 + this.anInt_11084 * this.anInt_11115));
         this.aLong_11098 = this.aLong_11114;
         this.aLong_11113 = this.aLong_11114 + (long)(this.anInt_11084 * 4);
         Class240_Sub37[] var18 = new Class240_Sub37[this.anInt_11084];
         var3 = Class234.method3016(this.anInt_11084 / 4, (byte)74);
         if(var3 < 1) {
            var3 = 1;
         }

         NodeArrayList var4 = new NodeArrayList(var3);
         Class240_Sub37[] var5 = new Class240_Sub37[this.anInt_11102];

         int var6;
         int var7;
         for(var6 = 0; var6 < this.maxWidth * 1658489349; ++var6) {
            for(var7 = 0; var7 < this.maxHeight * 445373459; ++var7) {
               this.method7671(var6, var7, var1, var5, var4, var18);
            }
         }

         Class240_Sub37 var19;
         for(var6 = 0; var6 < this.anInt_11112; ++var6) {
            var19 = var18[var6];
            if(var19 != null) {
               var19.method4900(var6);
            }
         }

         for(var6 = 0; var6 < this.maxWidth * 1658489349; ++var6) {
            for(var7 = 0; var7 < this.maxHeight * 445373459; ++var7) {
               short[] var8 = this.aShortArrayArray_11086[var7 * this.maxWidth * 1658489349 + var6];
               if(var8 != null) {
                  int var9 = 0;

                  for(int var10 = 0; var10 < var8.length; ++var9) {
                     int var11 = var8[var10++] & '\uffff';
                     int var12 = var8[var10++] & '\uffff';
                     int var13 = var8[var10++] & '\uffff';
                     Class240_Sub37 var14 = var18[var11];
                     Class240_Sub37 var15 = var18[var12];
                     Class240_Sub37 var16 = var18[var13];
                     Class240_Sub37 var17 = null;
                     if(var14 != null) {
                        var14.method4901(var6, var7, var9);
                        var17 = var14;
                     }

                     if(var15 != null) {
                        var15.method4901(var6, var7, var9);
                        if(var17 == null || var15.id * 4058728944299054175L < var17.id * 4058728944299054175L) {
                           var17 = var15;
                        }
                     }

                     if(var16 != null) {
                        var16.method4901(var6, var7, var9);
                        if(var17 == null || var16.id * 4058728944299054175L < var17.id * 4058728944299054175L) {
                           var17 = var16;
                        }
                     }

                     if(var17 != null) {
                        if(var14 != null) {
                           var17.method4900(var11);
                        }

                        if(var15 != null) {
                           var17.method4900(var12);
                        }

                        if(var16 != null) {
                           var17.method4900(var13);
                        }

                        var17.method4901(var6, var7, var9);
                     }
                  }
               }
            }
         }

         this.anInt_11100 = 0;

         for(var6 = 0; var6 < this.aClass240Array_11110.length; ++var6) {
            var19 = (Class240_Sub37)this.aClass240Array_11110[var6];
            if(var19.anInt_7505 > 0) {
               this.aClass240Array_11110[this.anInt_11100++] = var19;
            }
         }

         this.aClass240Array_11099 = new NodeListNode[this.anInt_11100];
         long[] var20 = new long[this.anInt_11100];

         for(var7 = 0; var7 < this.anInt_11100; ++var7) {
            Class240_Sub37 var21 = (Class240_Sub37)this.aClass240Array_11110[var7];
            var20[var7] = var21.id * 4058728944299054175L;
            this.aClass240Array_11099[var7] = var21;
         }

         Class610.method6560(var20, this.aClass240Array_11099, 1956149270);
         this.method7682();
      }
   }

   public boolean method2159(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass64_11097 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aRenderer_Sub3_11082.anInt_10507 >> 8) >> this.aRenderer_Sub3_11082.anInt_10589;
         int var8 = var4 - (var3 * this.aRenderer_Sub3_11082.anInt_10591 >> 8) >> this.aRenderer_Sub3_11082.anInt_10589;
         return this.aClass64_11097.method648(var1, var7, var8);
      } else {
         return false;
      }
   }

   public void method2157(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass64_11097 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aRenderer_Sub3_11082.anInt_10507 >> 8) >> this.aRenderer_Sub3_11082.anInt_10589;
         int var8 = var4 - (var3 * this.aRenderer_Sub3_11082.anInt_10591 >> 8) >> this.aRenderer_Sub3_11082.anInt_10589;
         this.aClass64_11097.method646(var1, var7, var8);
      }
   }

   public void method2158(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass64_11097 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aRenderer_Sub3_11082.anInt_10507 >> 8) >> this.aRenderer_Sub3_11082.anInt_10589;
         int var8 = var4 - (var3 * this.aRenderer_Sub3_11082.anInt_10591 >> 8) >> this.aRenderer_Sub3_11082.anInt_10589;
         this.aClass64_11097.method647(var1, var7, var8);
      }
   }

   public void method2160(Class240_Sub53 var1, int[] var2) {
      this.aNodeList_11077.addNode(new Class240_Sub39(this.aRenderer_Sub3_11082, this, var1, var2), (short)-2234);
   }

   void method7680(Class240_Sub22_Sub7_Sub2 var1, int var2, int var3) {
      int[] var4 = this.anIntArrayArrayArray_11093[var2][var3];
      int[] var5 = this.anIntArrayArrayArray_11116[var2][var3];
      int var6 = var4.length;
      if(this.anIntArray_11103.length < var6) {
         this.anIntArray_11103 = new int[var6];
         this.anIntArray_11117 = new int[var6];
      }

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         this.anIntArray_11103[var7] = var4[var7] >> this.aRenderer_Sub3_11082.anInt_10589;
         this.anIntArray_11117[var7] = var5[var7] >> this.aRenderer_Sub3_11082.anInt_10589;
      }

      var7 = 0;

      while(var7 < var6) {
         int var8 = this.anIntArray_11103[var7];
         int var9 = this.anIntArray_11117[var7++];
         int var10 = this.anIntArray_11103[var7];
         int var11 = this.anIntArray_11117[var7++];
         int var12 = this.anIntArray_11103[var7];
         int var13 = this.anIntArray_11117[var7++];
         if((var8 - var10) * (var11 - var13) - (var11 - var9) * (var12 - var10) > 0) {
            var1.method2334(var9, var11, var13, var8, var10, var12);
         }
      }

   }

   public void method2149(int var1, int var2, int var3) {
      if((this.aByteArrayArray_11105[var1][var2] & 255) < var3) {
         this.aByteArrayArray_11105[var1][var2] = (byte)var3;
      }

   }

   void method7682() {
      this.aClass76_11101 = this.aRenderer_Sub3_11082.method7320(false);
      this.aClass76_11101.method981(this.anInt_11112 * 4, 4);
      this.aClass76_11101.method4853(0, this.anInt_11112 * 4, this.aLong_11114);
      this.aClass76_11104 = this.aRenderer_Sub3_11082.method7320(false);
      this.aClass76_11104.method981(this.anInt_11112 * this.anInt_11115, this.anInt_11115);
      this.aClass76_11104.method4853(0, this.anInt_11112 * this.anInt_11115, this.aLong_11114 + (long)(this.anInt_11084 * 4));
      this.aRenderer_Sub3_11082.anUnsafe_10510.freeMemory(this.aLong_11114);
      if((this.anInt_11092 & 7) != 0) {
         if(this.anIntArrayArrayArray_11095 != null) {
            this.aClass379_11083 = this.aRenderer_Sub3_11082.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7355, Class380.aClass380_7354, Class380.aClass380_7352}), new Class402(Class380.aClass380_7353)});
         } else {
            this.aClass379_11083 = this.aRenderer_Sub3_11082.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7355, Class380.aClass380_7352}), new Class402(Class380.aClass380_7353)});
         }
      } else if(this.anIntArrayArrayArray_11095 != null) {
         this.aClass379_11083 = this.aRenderer_Sub3_11082.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7355, Class380.aClass380_7354}), new Class402(Class380.aClass380_7353)});
      } else {
         this.aClass379_11083 = this.aRenderer_Sub3_11082.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7355}), new Class402(Class380.aClass380_7353)});
      }

      for(int var1 = 0; var1 < this.anInt_11100; ++var1) {
         Class240_Sub37 var2 = (Class240_Sub37)this.aClass240Array_11110[var1];
         var2.method4899(this.anInt_11112);
      }

      if(this.aClass64_11097 != null) {
         this.aClass64_11097.method645();
      }

      this.method7668();
   }
}
