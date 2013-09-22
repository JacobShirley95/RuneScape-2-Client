
public class Class165_Sub3 extends Model {

   static final int anInt_10992 = 618648;
   boolean aBoolean_10993 = false;
   boolean aBoolean_10994 = false;
   Class210 aClass210_10995;
   Class202 aClass202_10996;
   static int anInt_10997 = 4096;
   int anInt_10998;
   static final int anInt_10999 = -1;
   static final int anInt_11000 = -2;
   static final int anInt_11001 = 4;
   static final int anInt_11002 = 7;
   static final int anInt_11003 = 618520;
   Class86[] aClass86Array_11004;
   boolean aBoolean_11005 = false;
   boolean aBoolean_11006 = false;
   int anInt_11007;
   boolean aBoolean_11008;
   int anInt_11009 = 0;
   short[] aShortArray_11010;
   static int anInt_11011 = 4096;
   int[] anIntArray_11012;
   short aShort_11013;
   float[] screenX;
   Class210 aClass210_11015;
   int anInt_11016 = 0;
   int anInt_11017 = 0;
   Class193[] aClass193Array_11018;
   short[] aShortArray_11019;
   int[] xpoints;
   float[][] aFloatArrayArray_11021;
   float[][] aFloatArrayArray_11022;
   int[][] anIntArrayArray_11023;
   int[] anIntArray_11024;
   int anInt_11025;
   static final int anInt_11026 = 0;
   static final int anInt_11027 = 1;
   int[] anIntArray_11028;
   int anInt_11029 = 0;
   Class201[] aClass201Array_11030;
   byte[] aByteArray_11031;
   int[] anIntArray_11032;
   byte[] aByteArray_11033;
   short aShort_11034;
   short[] aShortArray_11035;
   short[] aShortArray_11036;
   short[] aShortArray_11037;
   int[][] anIntArrayArray_11038;
   int[] anIntArray_11039;
   int[] anIntArray_11040;
   boolean aBoolean_11041 = false;
   Class193[] aClass193Array_11042;
   int vertexCount = 0;
   int anInt_11044;
   short[] aShortArray_11045;
   short[] aShortArray_11046;
   Class172[] aClass172Array_11047;
   int anInt_11048;
   Class215[] aClass215Array_11049;
   Class195[] aClass195Array_11050;
   int[][] anIntArrayArray_11051;
   int anInt_11052;
   short aShort_11053;
   short aShort_11054;
   int[] anIntArray_11055;
   Class165_Sub3[] aClass165_Sub3Array_11056;
   short aShort_11057;
   short aShort_11058;
   int[] anIntArray_11059;
   short aShort_11060;
   boolean aBoolean_11061 = false;
   float[] aFloatArray_11062;
   static int anInt_11063 = 0;
   byte[] aByteArray_11064;
   SoftwareRenderer softwareRenderer;
   float[] screenY;
   float[] aFloatArray_11067;
   short[] aShortArray_11068;
   int anInt_11069;
   int[] anIntArray_11070;
   int[] anIntArray_11071;
   int[] anIntArray_11072;
   short aShort_11073;
   int[] anIntArray_11074;
   Class165_Sub3[] aClass165_Sub3Array_11075;
   static final int anInt_11076 = 2;


   void method7593() {
      synchronized(this) {
         int var2;
         int var3;
         for(var2 = 0; var2 < this.anInt_11009; ++var2) {
            var3 = this.anIntArray_11012[var2];
            this.anIntArray_11012[var2] = this.xpoints[var2];
            this.xpoints[var2] = -var3;
            if(this.aClass193Array_11042[var2] != null) {
               var3 = this.aClass193Array_11042[var2].anInt_3355;
               this.aClass193Array_11042[var2].anInt_3355 = this.aClass193Array_11042[var2].anInt_3354;
               this.aClass193Array_11042[var2].anInt_3354 = -var3;
            }
         }

         if(this.aClass201Array_11030 != null) {
            for(var2 = 0; var2 < this.anInt_11016; ++var2) {
               if(this.aClass201Array_11030[var2] != null) {
                  var3 = this.aClass201Array_11030[var2].anInt_3465;
                  this.aClass201Array_11030[var2].anInt_3465 = this.aClass201Array_11030[var2].anInt_3463;
                  this.aClass201Array_11030[var2].anInt_3463 = -var3;
               }
            }
         }

         for(var2 = this.anInt_11009; var2 < this.vertexCount; ++var2) {
            var3 = this.anIntArray_11012[var2];
            this.anIntArray_11012[var2] = this.xpoints[var2];
            this.xpoints[var2] = -var3;
         }

         this.anInt_11029 = 0;
         this.aBoolean_11005 = false;
      }
   }

   Class165_Sub3(SoftwareRenderer var1, ModelData var2, int var3, int var4, int var5, int var6) {
      this.softwareRenderer = var1;
      this.anInt_10998 = var3;
      this.anInt_11025 = var4;
      this.anInt_11007 = var5;
      Class163 var7 = this.softwareRenderer.aClass163_2802;
      this.vertexCount = var2.anInt_1849;
      this.anInt_11009 = var2.anInt_1850;
      this.xpoints = var2.anIntArray_1858;
      this.anIntArray_11039 = var2.anIntArray_1880;
      this.anIntArray_11012 = var2.anIntArray_1853;
      this.anInt_11016 = var2.anInt_1856;
      this.aShortArray_11046 = var2.aShortArray_1857;
      this.aShortArray_11019 = var2.aShortArray_1845;
      this.aShortArray_11068 = var2.aShortArray_1869;
      this.aByteArray_11064 = var2.aByteArray_1861;
      this.aShortArray_11035 = var2.aShortArray_1876;
      this.aByteArray_11033 = var2.aByteArray_1864;
      this.aShortArray_11036 = var2.aShortArray_1868;
      this.aByteArray_11031 = var2.aByteArray_1860;
      this.aClass86Array_11004 = var2.aClass86Array_1854;
      this.aClass172Array_11047 = var2.aClass172Array_1883;
      this.aShortArray_11045 = var2.aShortArray_1862;
      this.anInt_11017 = this.anInt_11016;
      int[] var8 = new int[this.anInt_11016];

      for(int var9 = 0; var9 < this.anInt_11016; var8[var9] = var9++) {
         ;
      }

      long[] var54 = new long[this.anInt_11016];
      boolean var10 = (this.anInt_10998 & 256) != 0;

      int var11;
      int var14;
      int var59;
      short var65;
      for(var11 = 0; var11 < this.anInt_11016; ++var11) {
         int var12 = var8[var11];
         Class183 var13 = null;
         var14 = 0;
         byte var15 = 0;
         byte var16 = 0;
         byte var17 = 0;
         int var19;
         boolean var18;
         if(var2.aClass107Array_1884 != null) {
            var18 = false;

            for(var19 = 0; var19 < var2.aClass107Array_1884.length; ++var19) {
               Class107 var20 = var2.aClass107Array_1884[var19];
               if(var12 == var20.anInt_1989 * 1921905305) {
                  Class397 var21 = Class366.method4667(var20.anInt_1991 * 2120936855, (byte)33);
                  if(var21.aBoolean_7595) {
                     var18 = true;
                  }

                  if(var21.anInt_7589 * 741866845 != -1) {
                     Class183 var22 = var7.method1996(var21.anInt_7589 * 741866845, (byte)2);
                     if(var22.aClass620_3153 == Class620.aClass620_10022) {
                        this.aBoolean_11061 = true;
                     }
                  }
               }
            }

            if(var18) {
               var54[var11] = Long.MAX_VALUE;
               --this.anInt_11017;
               continue;
            }
         }

         if(var2.aClass86Array_1854 != null) {
            var18 = false;

            for(var19 = 0; var19 < var2.aClass86Array_1854.length; ++var19) {
               Class86 var70 = var2.aClass86Array_1854[var19];
               if(var12 == var70.anInt_1754 * -1827055815) {
                  Class411 var72 = Class110.method1411(var70.anInt_1746 * 87629913, -1001302100);
                  if(var72.aBoolean_7825) {
                     var18 = true;
                  }
               }
            }

            if(var18) {
               var54[var11] = Long.MAX_VALUE;
               --this.anInt_11017;
               continue;
            }
         }

         var65 = -1;
         if(var2.aShortArray_1859 != null) {
            var65 = var2.aShortArray_1859[var12];
            if(var65 != -1) {
               var13 = var7.method1996(var65 & '\uffff', (byte)2);
               if((var6 & 64) != 0 && var13.aBoolean_3174) {
                  var65 = -1;
               } else {
                  var16 = var13.aByte_3169;
                  var17 = var13.aByte_3170;
               }
            }
         }

         boolean var69 = this.aByteArray_11033 != null && this.aByteArray_11033[var12] != 0 || var13 != null && var13.aClass620_3153 == Class620.aClass620_10022;
         if((var10 || var69) && this.aByteArray_11064 != null) {
            var14 += this.aByteArray_11064[var12] << 17;
         }

         if(var69) {
            var14 += 65536;
         }

         var14 += (var16 & 255) << 8;
         var14 += var17 & 255;
         var59 = var15 + ((var65 & '\uffff') << 16);
         var59 += var11 & '\uffff';
         var54[var11] = ((long)var14 << 32) + (long)var59;
         this.aBoolean_11061 |= var69;
      }

      Class131.method1686(var54, var8, 1024843173);
      if(var2.aClass107Array_1884 != null) {
         this.anInt_11048 = var2.aClass107Array_1884.length;
         this.aClass215Array_11049 = new Class215[this.anInt_11048];
         this.aClass195Array_11050 = new Class195[this.anInt_11048];

         for(var11 = 0; var11 < var2.aClass107Array_1884.length; ++var11) {
            Class107 var55 = var2.aClass107Array_1884[var11];
            Class397 var58 = Class366.method4667(var55.anInt_1991 * 2120936855, (byte)-111);
            var14 = Class561.colourMap[var2.aShortArray_1876[var55.anInt_1989 * 1921905305] & '\uffff'] & 16777215;
            var14 |= 255 - (var2.aByteArray_1864 != null?var2.aByteArray_1864[var55.anInt_1989 * 1921905305] & 255:0) << 24;
            this.aClass215Array_11049[var11] = new Class215(var55.anInt_1989 * 1921905305, var2.aShortArray_1857[var55.anInt_1989 * 1921905305], var2.aShortArray_1845[var55.anInt_1989 * 1921905305], var2.aShortArray_1869[var55.anInt_1989 * 1921905305], var58.anInt_7590 * 300602345, var58.anInt_7586 * -1519311519, var58.anInt_7589 * 741866845, var58.anInt_7593 * 1295500681, var58.anInt_7592 * -782198371, var58.aBoolean_7595, var55.anInt_1988 * 514945959);
            this.aClass195Array_11050[var11] = new Class195(var14);
         }
      }

      this.aFloatArrayArray_11021 = new float[this.anInt_11016][];
      this.aFloatArrayArray_11022 = new float[this.anInt_11016][];
      Class93 var56 = this.method2063(var2, var8, this.anInt_11016);
      Class210 var57 = this.softwareRenderer.method6787(Thread.currentThread());
      float[] var60 = var57.aFloatArray_3647;
      boolean var64 = false;

      int var63;
      short var62;
      for(var59 = 0; var59 < this.anInt_11016; ++var59) {
         var63 = var8[var59];
         if(var2.aShortArray_1863 == null) {
            var62 = -1;
         } else {
            var62 = var2.aShortArray_1863[var63];
         }

         var65 = var2.aShortArray_1859 == null?-1:var2.aShortArray_1859[var63];
         if(var65 != -1 && (var6 & 64) != 0 && var7.method1996(var65 & '\uffff', (byte)2).aBoolean_3174) {
            var65 = -1;
         }

         if(var65 != -1) {
            var64 = true;
            float[] var67 = this.aFloatArrayArray_11021[var63] = new float[3];
            float[] var68 = this.aFloatArrayArray_11022[var63] = new float[3];
            boolean var74 = false;
            if(var62 == -1) {
               var67[0] = 0.0F;
               var68[0] = 1.0F;
               var67[1] = 1.0F;
               var68[1] = 1.0F;
               var67[2] = 0.0F;
               var68[2] = 0.0F;
            } else {
               int var66 = var62 & '\uffff';
               byte var71 = var2.aByteArray_1870[var66];
               short var23;
               short var25;
               short var24;
               float var31;
               float var32;
               float var33;
               float var43;
               float var46;
               float var47;
               float var44;
               float var45;
               float var48;
               if(var71 == 0) {
                  var23 = this.aShortArray_11046[var63];
                  var24 = this.aShortArray_11019[var63];
                  var25 = this.aShortArray_11068[var63];
                  short var26 = var2.aShortArray_1871[var66];
                  short var27 = var2.aShortArray_1872[var66];
                  short var28 = var2.aShortArray_1852[var66];
                  float var29 = (float)this.xpoints[var26];
                  float var30 = (float)this.anIntArray_11039[var26];
                  var31 = (float)this.anIntArray_11012[var26];
                  var32 = (float)this.xpoints[var27] - var29;
                  var33 = (float)this.anIntArray_11039[var27] - var30;
                  float var34 = (float)this.anIntArray_11012[var27] - var31;
                  float var35 = (float)this.xpoints[var28] - var29;
                  float var36 = (float)this.anIntArray_11039[var28] - var30;
                  float var37 = (float)this.anIntArray_11012[var28] - var31;
                  float var38 = (float)this.xpoints[var23] - var29;
                  float var39 = (float)this.anIntArray_11039[var23] - var30;
                  float var40 = (float)this.anIntArray_11012[var23] - var31;
                  float var41 = (float)this.xpoints[var24] - var29;
                  float var42 = (float)this.anIntArray_11039[var24] - var30;
                  var43 = (float)this.anIntArray_11012[var24] - var31;
                  var44 = (float)this.xpoints[var25] - var29;
                  var45 = (float)this.anIntArray_11039[var25] - var30;
                  var46 = (float)this.anIntArray_11012[var25] - var31;
                  var47 = var33 * var37 - var34 * var36;
                  var48 = var34 * var35 - var32 * var37;
                  float var49 = var32 * var36 - var33 * var35;
                  float var50 = var36 * var49 - var37 * var48;
                  float var51 = var37 * var47 - var35 * var49;
                  float var52 = var35 * var48 - var36 * var47;
                  float var53 = 1.0F / (var50 * var32 + var51 * var33 + var52 * var34);
                  var67[0] = (var50 * var38 + var51 * var39 + var52 * var40) * var53;
                  var67[1] = (var50 * var41 + var51 * var42 + var52 * var43) * var53;
                  var67[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                  var50 = var33 * var49 - var34 * var48;
                  var51 = var34 * var47 - var32 * var49;
                  var52 = var32 * var48 - var33 * var47;
                  var53 = 1.0F / (var50 * var35 + var51 * var36 + var52 * var37);
                  var68[0] = (var50 * var38 + var51 * var39 + var52 * var40) * var53;
                  var68[1] = (var50 * var41 + var51 * var42 + var52 * var43) * var53;
                  var68[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
               } else {
                  var23 = this.aShortArray_11046[var63];
                  var24 = this.aShortArray_11019[var63];
                  var25 = this.aShortArray_11068[var63];
                  int var77 = var56.anIntArray_1836[var66];
                  int var78 = var56.anIntArray_1832[var66];
                  int var76 = var56.anIntArray_1834[var66];
                  float[] var80 = var56.aFloatArrayArray_1835[var66];
                  byte var79 = var2.aByteArray_1881[var66];
                  var31 = (float)var2.anIntArray_1877[var66] / 256.0F;
                  if(var71 == 1) {
                     var32 = (float)var2.anIntArray_1865[var66] / 1024.0F;
                     this.method2062(this.xpoints[var23], this.anIntArray_11039[var23], this.anIntArray_11012[var23], var77, var78, var76, var80, var32, var79, var31, var60);
                     var67[0] = var60[0];
                     var68[0] = var60[1];
                     this.method2062(this.xpoints[var24], this.anIntArray_11039[var24], this.anIntArray_11012[var24], var77, var78, var76, var80, var32, var79, var31, var60);
                     var67[1] = var60[0];
                     var68[1] = var60[1];
                     this.method2062(this.xpoints[var25], this.anIntArray_11039[var25], this.anIntArray_11012[var25], var77, var78, var76, var80, var32, var79, var31, var60);
                     var67[2] = var60[0];
                     var68[2] = var60[1];
                     var33 = var32 / 2.0F;
                     if((var79 & 1) == 0) {
                        if(var67[1] - var67[0] > var33) {
                           var67[1] -= var32;
                        } else if(var67[0] - var67[1] > var33) {
                           var67[1] += var32;
                        }

                        if(var67[2] - var67[0] > var33) {
                           var67[2] -= var32;
                        } else if(var67[0] - var67[2] > var33) {
                           var67[2] += var32;
                        }
                     } else {
                        if(var68[1] - var68[0] > var33) {
                           var68[1] -= var32;
                        } else if(var68[0] - var68[1] > var33) {
                           var68[1] += var32;
                        }

                        if(var68[2] - var68[0] > var33) {
                           var68[2] -= var32;
                        } else if(var68[0] - var68[2] > var33) {
                           var68[2] += var32;
                        }
                     }
                  } else if(var71 == 2) {
                     var32 = (float)var2.anIntArray_1873[var66] / 256.0F;
                     var33 = (float)var2.anIntArray_1879[var66] / 256.0F;
                     int var83 = this.xpoints[var24] - this.xpoints[var23];
                     int var82 = this.anIntArray_11039[var24] - this.anIntArray_11039[var23];
                     int var81 = this.anIntArray_11012[var24] - this.anIntArray_11012[var23];
                     int var86 = this.xpoints[var25] - this.xpoints[var23];
                     int var85 = this.anIntArray_11039[var25] - this.anIntArray_11039[var23];
                     int var84 = this.anIntArray_11012[var25] - this.anIntArray_11012[var23];
                     int var88 = var82 * var84 - var85 * var81;
                     int var87 = var81 * var86 - var84 * var83;
                     int var89 = var83 * var85 - var86 * var82;
                     var43 = 64.0F / (float)var2.anIntArray_1874[var66];
                     var44 = 64.0F / (float)var2.anIntArray_1875[var66];
                     var45 = 64.0F / (float)var2.anIntArray_1865[var66];
                     var46 = ((float)var88 * var80[0] + (float)var87 * var80[1] + (float)var89 * var80[2]) / var43;
                     var47 = ((float)var88 * var80[3] + (float)var87 * var80[4] + (float)var89 * var80[5]) / var44;
                     var48 = ((float)var88 * var80[6] + (float)var87 * var80[7] + (float)var89 * var80[8]) / var45;
                     int var75 = this.method2045(var46, var47, var48);
                     this.method2011(this.xpoints[var23], this.anIntArray_11039[var23], this.anIntArray_11012[var23], var77, var78, var76, var75, var80, var79, var31, var32, var33, var60);
                     var67[0] = var60[0];
                     var68[0] = var60[1];
                     this.method2011(this.xpoints[var24], this.anIntArray_11039[var24], this.anIntArray_11012[var24], var77, var78, var76, var75, var80, var79, var31, var32, var33, var60);
                     var67[1] = var60[0];
                     var68[1] = var60[1];
                     this.method2011(this.xpoints[var25], this.anIntArray_11039[var25], this.anIntArray_11012[var25], var77, var78, var76, var75, var80, var79, var31, var32, var33, var60);
                     var67[2] = var60[0];
                     var68[2] = var60[1];
                  } else if(var71 == 3) {
                     this.method2010(this.xpoints[var23], this.anIntArray_11039[var23], this.anIntArray_11012[var23], var77, var78, var76, var80, var79, var31, var60);
                     var67[0] = var60[0];
                     var68[0] = var60[1];
                     this.method2010(this.xpoints[var24], this.anIntArray_11039[var24], this.anIntArray_11012[var24], var77, var78, var76, var80, var79, var31, var60);
                     var67[1] = var60[0];
                     var68[1] = var60[1];
                     this.method2010(this.xpoints[var25], this.anIntArray_11039[var25], this.anIntArray_11012[var25], var77, var78, var76, var80, var79, var31, var60);
                     var67[2] = var60[0];
                     var68[2] = var60[1];
                     if((var79 & 1) == 0) {
                        if(var67[1] - var67[0] > 0.5F) {
                           --var67[1];
                        } else if(var67[0] - var67[1] > 0.5F) {
                           ++var67[1];
                        }

                        if(var67[2] - var67[0] > 0.5F) {
                           --var67[2];
                        } else if(var67[0] - var67[2] > 0.5F) {
                           ++var67[2];
                        }
                     } else {
                        if(var68[1] - var68[0] > 0.5F) {
                           --var68[1];
                        } else if(var68[0] - var68[1] > 0.5F) {
                           ++var68[1];
                        }

                        if(var68[2] - var68[0] > 0.5F) {
                           --var68[2];
                        } else if(var68[0] - var68[2] > 0.5F) {
                           ++var68[2];
                        }
                     }
                  }
               }
            }
         }
      }

      if(!var64) {
         this.aFloatArrayArray_11022 = (float[][])null;
         this.aFloatArrayArray_11021 = (float[][])null;
      }

      if(var2.anIntArray_1844 != null && (this.anInt_10998 & 32) != 0) {
         this.anIntArrayArray_11038 = var2.method1233(true);
      }

      if(var2.anIntArray_1866 != null && (this.anInt_10998 & 384) != 0) {
         this.anIntArrayArray_11023 = var2.method1232();
      }

      if(var2.aClass107Array_1884 != null && (this.anInt_10998 & 1024) != 0) {
         this.anIntArrayArray_11051 = var2.method1225();
      }

      if(var2.aShortArray_1859 != null) {
         this.aShortArray_11010 = new short[this.anInt_11016];
         boolean var61 = false;

         for(var63 = 0; var63 < this.anInt_11016; ++var63) {
            var62 = var2.aShortArray_1859[var63];
            if(var62 != -1) {
               Class183 var73 = this.softwareRenderer.aClass163_2802.method1996(var62 & '\uffff', (byte)2);
               if((var6 & 64) != 0 && var73.aBoolean_3174) {
                  this.aShortArray_11010[var63] = -1;
               } else {
                  this.aShortArray_11010[var63] = var62;
                  var61 = true;
                  if(var73.aClass620_3153 == Class620.aClass620_10022) {
                     this.aBoolean_11061 = true;
                  }

                  if(var73.aByte_3145 != 0 || var73.aByte_3157 != 0) {
                     this.aBoolean_10994 = true;
                  }
               }
            } else {
               this.aShortArray_11010[var63] = -1;
            }
         }

         if(!var61) {
            this.aShortArray_11010 = null;
         }
      } else {
         this.aShortArray_11010 = null;
      }

      if(this.aBoolean_11061 || this.aClass215Array_11049 != null) {
         this.aShortArray_11037 = new short[this.anInt_11016];

         for(var59 = 0; var59 < this.anInt_11016; ++var59) {
            this.aShortArray_11037[var59] = (short)var8[var59];
         }
      }

   }

   void method7594(Thread var1) {
      Class210 var2 = this.softwareRenderer.method6787(var1);
      if(var2 != this.aClass210_10995) {
         this.aClass210_10995 = var2;
         this.aClass165_Sub3Array_11075 = this.aClass210_10995.aClass165_Sub3Array_3648;
         this.aClass165_Sub3Array_11056 = this.aClass210_10995.aClass165_Sub3Array_3649;
      }
   }

   int method7595(int var1, int var2) {
      var2 = var2 * (var1 & 127) >> 7;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 126) {
         var2 = 126;
      }

      return (var1 & '\uff80') + var2;
   }

   void method7596() {
      this.aClass193Array_11042 = new Class193[this.anInt_11009];

      int var1;
      for(var1 = 0; var1 < this.anInt_11009; ++var1) {
         this.aClass193Array_11042[var1] = new Class193();
      }

      for(var1 = 0; var1 < this.anInt_11016; ++var1) {
         short var2 = this.aShortArray_11046[var1];
         short var3 = this.aShortArray_11019[var1];
         short var4 = this.aShortArray_11068[var1];
         int var5 = this.xpoints[var3] - this.xpoints[var2];
         int var6 = this.anIntArray_11039[var3] - this.anIntArray_11039[var2];
         int var7 = this.anIntArray_11012[var3] - this.anIntArray_11012[var2];
         int var8 = this.xpoints[var4] - this.xpoints[var2];
         int var9 = this.anIntArray_11039[var4] - this.anIntArray_11039[var2];
         int var10 = this.anIntArray_11012[var4] - this.anIntArray_11012[var2];
         int var11 = var6 * var10 - var9 * var7;
         int var12 = var7 * var8 - var10 * var5;

         int var13;
         for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
            var11 >>= 1;
            var12 >>= 1;
         }

         int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
         if(var14 <= 0) {
            var14 = 1;
         }

         var11 = var11 * 256 / var14;
         var12 = var12 * 256 / var14;
         var13 = var13 * 256 / var14;
         byte var15;
         if(this.aByteArray_11031 == null) {
            var15 = 0;
         } else {
            var15 = this.aByteArray_11031[var1];
         }

         if(var15 == 0) {
            Class193 var16 = this.aClass193Array_11042[var2];
            var16.anInt_3354 += var11;
            var16.anInt_3353 += var12;
            var16.anInt_3355 += var13;
            ++var16.anInt_3352;
            var16 = this.aClass193Array_11042[var3];
            var16.anInt_3354 += var11;
            var16.anInt_3353 += var12;
            var16.anInt_3355 += var13;
            ++var16.anInt_3352;
            var16 = this.aClass193Array_11042[var4];
            var16.anInt_3354 += var11;
            var16.anInt_3353 += var12;
            var16.anInt_3355 += var13;
            ++var16.anInt_3352;
         } else if(var15 == 1) {
            if(this.aClass201Array_11030 == null) {
               this.aClass201Array_11030 = new Class201[this.anInt_11016];
            }

            Class201 var17 = this.aClass201Array_11030[var1] = new Class201();
            var17.anInt_3463 = var11;
            var17.anInt_3464 = var12;
            var17.anInt_3465 = var13;
         }
      }

   }

   int method7597(int var1, short var2, int var3) {
      int var4 = Class541.anIntArray_9470[this.method7595(var1, var3)];
      Class183 var5 = this.softwareRenderer.aClass163_2802.method1996(var2 & '\uffff', (byte)2);
      int var6 = var5.aByte_3165 & 255;
      int var7;
      int var9;
      if(var6 != 0) {
         var7 = 131586 * var3;
         if(var6 == 256) {
            var4 = var7;
         } else {
            var9 = 256 - var6;
            var4 = ((var7 & 16711935) * var6 + (var4 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var4 & '\uff00') * var9 & 16711680) >> 8;
         }
      }

      var7 = var5.aByte_3176 & 255;
      if(var7 != 0) {
         var7 += 256;
         int var8 = ((var4 & 16711680) >> 16) * var7;
         if(var8 > '\uffff') {
            var8 = '\uffff';
         }

         var9 = ((var4 & '\uff00') >> 8) * var7;
         if(var9 > '\uffff') {
            var9 = '\uffff';
         }

         int var10 = (var4 & 255) * var7;
         if(var10 > '\uffff') {
            var10 = '\uffff';
         }

         var4 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
      }

      return var4;
   }

   int method7598(int var1) {
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return var1;
   }

   void method7599() {
      if(this.anInt_11029 == 0) {
         this.method7651(false);
      } else {
         if(this.softwareRenderer.anInt_10187 * 367589431 > 1) {
            synchronized(this) {
               this.method7600();
            }
         } else {
            this.method7600();
         }

      }
   }

   void method7600() {
      for(int var1 = 0; var1 < this.anInt_11016; ++var1) {
         short var2 = this.aShortArray_11010 != null?this.aShortArray_11010[var1]:-1;
         if(var2 == -1) {
            int var3 = this.aShortArray_11035[var1] & '\uffff';
            int var4 = (var3 & 127) * this.anInt_11025 >> 7;
            short var6 = CacheFileID.method1398(var3 & -128 | var4, -2081629462);
            int var5;
            if(this.anIntArray_11032[var1] == -1) {
               var5 = this.anIntArray_11059[var1] & -131072;
               this.anIntArray_11059[var1] = var5 | Class476.method5683(var6, var5 >> 17, -745486040);
            } else if(this.anIntArray_11032[var1] != -2) {
               var5 = this.anIntArray_11059[var1] & -131072;
               this.anIntArray_11059[var1] = var5 | Class476.method5683(var6, var5 >> 17, -1780562095);
               var5 = this.anIntArray_11024[var1] & -131072;
               this.anIntArray_11024[var1] = var5 | Class476.method5683(var6, var5 >> 17, -1633870935);
               var5 = this.anIntArray_11032[var1] & -131072;
               this.anIntArray_11032[var1] = var5 | Class476.method5683(var6, var5 >> 17, -938884092);
            }
         }
      }

      this.anInt_11029 = 2;
   }

   public int method2037() {
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      return this.aShort_11053;
   }

   public int method2015() {
      return this.anInt_10998;
   }

   public void method2042(int var1) {
      if(this.softwareRenderer.anInt_10187 * 367589431 > 1) {
         synchronized(this) {
            if((this.anInt_10998 & 65536) == 65536 && (var1 & 65536) == 0) {
               this.method7651(true);
            }

            this.anInt_10998 = var1;
         }
      } else {
         if((this.anInt_10998 & 65536) == 65536 && (var1 & 65536) == 0) {
            this.method7651(true);
         }

         this.anInt_10998 = var1;
      }

   }

   public void method2017(int var1) {
      if((this.anInt_10998 & 5) != 5) {
         throw new IllegalStateException();
      } else if(var1 == 4096) {
         this.method7606();
      } else if(var1 == 8192) {
         this.method7629();
      } else if(var1 == 12288) {
         this.method7607();
      } else {
         int var2 = Class362.cosArray[var1];
         int var3 = Class362.sinArray[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.vertexCount; ++var5) {
               int var6 = this.anIntArray_11012[var5] * var2 + this.xpoints[var5] * var3 >> 14;
               this.anIntArray_11012[var5] = this.anIntArray_11012[var5] * var3 - this.xpoints[var5] * var2 >> 14;
               this.xpoints[var5] = var6;
            }

            this.method7650();
         }
      }
   }

   public void method2055(int var1) {
      if((this.anInt_10998 & 13) != 13) {
         throw new IllegalStateException();
      } else {
         if(this.aClass193Array_11042 != null) {
            if(var1 == 4096) {
               this.method7646();
               return;
            }

            if(var1 == 8192) {
               this.method7608();
               return;
            }

            if(var1 == 12288) {
               this.method7593();
               return;
            }

            int var2 = Class362.cosArray[var1];
            int var3 = Class362.sinArray[var1];
            synchronized(this) {
               int var5;
               int var6;
               for(var5 = 0; var5 < this.anInt_11009; ++var5) {
                  var6 = this.anIntArray_11012[var5] * var2 + this.xpoints[var5] * var3 >> 14;
                  this.anIntArray_11012[var5] = this.anIntArray_11012[var5] * var3 - this.xpoints[var5] * var2 >> 14;
                  this.xpoints[var5] = var6;
                  if(this.aClass193Array_11042[var5] != null) {
                     var6 = this.aClass193Array_11042[var5].anInt_3355 * var2 + this.aClass193Array_11042[var5].anInt_3354 * var3 >> 14;
                     this.aClass193Array_11042[var5].anInt_3355 = this.aClass193Array_11042[var5].anInt_3355 * var3 - this.aClass193Array_11042[var5].anInt_3354 * var2 >> 14;
                     this.aClass193Array_11042[var5].anInt_3354 = var6;
                  }
               }

               if(this.aClass201Array_11030 != null) {
                  for(var5 = 0; var5 < this.anInt_11016; ++var5) {
                     if(this.aClass201Array_11030[var5] != null) {
                        var6 = this.aClass201Array_11030[var5].anInt_3465 * var2 + this.aClass201Array_11030[var5].anInt_3463 * var3 >> 14;
                        this.aClass201Array_11030[var5].anInt_3465 = this.aClass201Array_11030[var5].anInt_3465 * var3 - this.aClass201Array_11030[var5].anInt_3463 * var2 >> 14;
                        this.aClass201Array_11030[var5].anInt_3463 = var6;
                     }
                  }
               }

               for(var5 = this.anInt_11009; var5 < this.vertexCount; ++var5) {
                  var6 = this.anIntArray_11012[var5] * var2 + this.xpoints[var5] * var3 >> 14;
                  this.anIntArray_11012[var5] = this.anIntArray_11012[var5] * var3 - this.xpoints[var5] * var2 >> 14;
                  this.xpoints[var5] = var6;
               }

               this.anInt_11029 = 0;
               this.aBoolean_11005 = false;
            }
         } else {
            this.method2017(var1);
         }

      }
   }

   void method7606() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.vertexCount; ++var2) {
            int var3 = this.xpoints[var2];
            this.xpoints[var2] = this.anIntArray_11012[var2];
            this.anIntArray_11012[var2] = -var3;
         }

         this.method7650();
      }
   }

   void method7607() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.vertexCount; ++var2) {
            int var3 = this.anIntArray_11012[var2];
            this.anIntArray_11012[var2] = this.xpoints[var2];
            this.xpoints[var2] = -var3;
         }

         this.method7650();
      }
   }

   void method7608() {
      synchronized(this) {
         int var2;
         for(var2 = 0; var2 < this.anInt_11009; ++var2) {
            this.xpoints[var2] = -this.xpoints[var2];
            this.anIntArray_11012[var2] = -this.anIntArray_11012[var2];
            if(this.aClass193Array_11042[var2] != null) {
               this.aClass193Array_11042[var2].anInt_3354 = -this.aClass193Array_11042[var2].anInt_3354;
               this.aClass193Array_11042[var2].anInt_3355 = -this.aClass193Array_11042[var2].anInt_3355;
            }
         }

         if(this.aClass201Array_11030 != null) {
            for(var2 = 0; var2 < this.anInt_11016; ++var2) {
               if(this.aClass201Array_11030[var2] != null) {
                  this.aClass201Array_11030[var2].anInt_3463 = -this.aClass201Array_11030[var2].anInt_3463;
                  this.aClass201Array_11030[var2].anInt_3465 = -this.aClass201Array_11030[var2].anInt_3465;
               }
            }
         }

         for(var2 = this.anInt_11009; var2 < this.vertexCount; ++var2) {
            this.xpoints[var2] = -this.xpoints[var2];
            this.anIntArray_11012[var2] = -this.anIntArray_11012[var2];
         }

         this.anInt_11029 = 0;
         this.aBoolean_11005 = false;
      }
   }

   public void method2016() {}

   public void rotateY(int var1) {
      if((this.anInt_10998 & 6) != 6) {
         throw new IllegalStateException();
      } else {
         int var2 = Class362.cosArray[var1];
         int var3 = Class362.sinArray[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.vertexCount; ++var5) {
               int var6 = this.anIntArray_11039[var5] * var3 - this.anIntArray_11012[var5] * var2 >> 14;
               this.anIntArray_11012[var5] = this.anIntArray_11039[var5] * var2 + this.anIntArray_11012[var5] * var3 >> 14;
               this.anIntArray_11039[var5] = var6;
            }

            this.method7650();
         }
      }
   }

   public void method2021() {
      if((this.anInt_10998 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.vertexCount; ++var2) {
               this.anIntArray_11012[var2] = -this.anIntArray_11012[var2];
            }

            if(this.aClass193Array_11042 != null) {
               for(var2 = 0; var2 < this.anInt_11009; ++var2) {
                  if(this.aClass193Array_11042[var2] != null) {
                     this.aClass193Array_11042[var2].anInt_3355 = -this.aClass193Array_11042[var2].anInt_3355;
                  }
               }
            }

            if(this.aClass193Array_11018 != null) {
               for(var2 = 0; var2 < this.anInt_11009; ++var2) {
                  if(this.aClass193Array_11018[var2] != null) {
                     this.aClass193Array_11018[var2].anInt_3355 = -this.aClass193Array_11018[var2].anInt_3355;
                  }
               }
            }

            if(this.aClass201Array_11030 != null) {
               for(var2 = 0; var2 < this.anInt_11016; ++var2) {
                  if(this.aClass201Array_11030[var2] != null) {
                     this.aClass201Array_11030[var2].anInt_3465 = -this.aClass201Array_11030[var2].anInt_3465;
                  }
               }
            }

            short[] var7 = this.aShortArray_11046;
            this.aShortArray_11046 = this.aShortArray_11068;
            this.aShortArray_11068 = var7;
            if(this.aFloatArrayArray_11021 != null) {
               for(int var3 = 0; var3 < this.anInt_11016; ++var3) {
                  float var4;
                  if(this.aFloatArrayArray_11021[var3] != null) {
                     var4 = this.aFloatArrayArray_11021[var3][0];
                     this.aFloatArrayArray_11021[var3][0] = this.aFloatArrayArray_11021[var3][2];
                     this.aFloatArrayArray_11021[var3][2] = var4;
                  }

                  if(this.aFloatArrayArray_11022[var3] != null) {
                     var4 = this.aFloatArrayArray_11022[var3][0];
                     this.aFloatArrayArray_11022[var3][0] = this.aFloatArrayArray_11022[var3][2];
                     this.aFloatArrayArray_11022[var3][2] = var4;
                  }
               }
            }

            this.aBoolean_11005 = false;
            this.anInt_11029 = 0;
         }
      }
   }

   public void offset(int var1, int var2, int var3) {
      if(var1 != 0 && (this.anInt_10998 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 0 && (this.anInt_10998 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 0 && (this.anInt_10998 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.vertexCount; ++var5) {
               this.xpoints[var5] += var1;
               this.anIntArray_11039[var5] += var2;
               this.anIntArray_11012[var5] += var3;
            }

         }
      }
   }

   public int method2047() {
      return this.anInt_11007;
   }

   public void method2023(int var1, int var2, Plane var3, Plane var4, int var5, int var6, int var7) {
      if(var1 == 3) {
         if((this.anInt_10998 & 7) != 7) {
            throw new IllegalStateException();
         }
      } else if((this.anInt_10998 & 2) != 2) {
         throw new IllegalStateException();
      }

      if(!this.aBoolean_11005) {
         this.method7628();
      }

      int var8 = var5 + this.aShort_11057;
      int var9 = var5 + this.aShort_11058;
      int var10 = var7 + this.aShort_11034;
      int var11 = var7 + this.aShort_11060;
      if(var1 == 4 || var8 >= 0 && var9 + var3.anInt_3031 * 69671577 >> var3.shiftAmount * 1694172417 < var3.maxWidth * 1658489349 && var10 >= 0 && var11 + var3.anInt_3031 * 69671577 >> var3.shiftAmount * 1694172417 < var3.maxHeight * 445373459) {
         int[][] var12 = var3.anIntArrayArray_3029;
         int[][] var13 = (int[][])null;
         if(var4 != null) {
            var13 = var4.anIntArrayArray_3029;
         }

         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.shiftAmount * 1694172417;
            var9 = var9 + (var3.anInt_3031 * 69671577 - 1) >> var3.shiftAmount * 1694172417;
            var10 >>= var3.shiftAmount * 1694172417;
            var11 = var11 + (var3.anInt_3031 * 69671577 - 1) >> var3.shiftAmount * 1694172417;
            if(var12[var8][var10] == var6 && var12[var9][var10] == var6 && var12[var8][var11] == var6 && var12[var9][var11] == var6) {
               return;
            }
         } else {
            if(var4 == null) {
               return;
            }

            if(var8 < 0 || var9 + var4.anInt_3031 * 69671577 >> var4.shiftAmount * 1694172417 >= var4.maxWidth * 1658489349 || var10 < 0 || var11 + var4.anInt_3031 * 69671577 >> var4.shiftAmount * 1694172417 >= var4.maxHeight * 445373459) {
               return;
            }
         }

         synchronized(this) {
            int var15;
            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var23;
            int var22;
            int var25;
            int var24;
            if(var1 == 1) {
               var15 = var3.anInt_3031 * 69671577 - 1;

               for(var16 = 0; var16 < this.anInt_11009; ++var16) {
                  var17 = this.xpoints[var16] + var5;
                  var18 = this.anIntArray_11012[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.shiftAmount * 1694172417;
                  var22 = var18 >> var3.shiftAmount * 1694172417;
                  var23 = var12[var21][var22] * (var3.anInt_3031 * 69671577 - var19) + var12[var21 + 1][var22] * var19 >> var3.shiftAmount * 1694172417;
                  var24 = var12[var21][var22 + 1] * (var3.anInt_3031 * 69671577 - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.shiftAmount * 1694172417;
                  var25 = var23 * (var3.anInt_3031 * 69671577 - var20) + var24 * var20 >> var3.shiftAmount * 1694172417;
                  this.anIntArray_11039[var16] = this.anIntArray_11039[var16] + var25 - var6;
               }

               for(var16 = this.anInt_11009; var16 < this.vertexCount; ++var16) {
                  var17 = this.xpoints[var16] + var5;
                  var18 = this.anIntArray_11012[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.shiftAmount * 1694172417;
                  var22 = var18 >> var3.shiftAmount * 1694172417;
                  if(var21 >= 0 && var21 < var12.length - 1 && var22 >= 0 && var22 < var12[0].length - 1) {
                     var23 = var12[var21][var22] * (var3.anInt_3031 * 69671577 - var19) + var12[var21 + 1][var22] * var19 >> var3.shiftAmount * 1694172417;
                     var24 = var12[var21][var22 + 1] * (var3.anInt_3031 * 69671577 - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.shiftAmount * 1694172417;
                     var25 = var23 * (var3.anInt_3031 * 69671577 - var20) + var24 * var20 >> var3.shiftAmount * 1694172417;
                     this.anIntArray_11039[var16] = this.anIntArray_11039[var16] + var25 - var6;
                  }
               }
            } else {
               int var26;
               if(var1 == 2) {
                  if(this.aShort_11073 == 0) {
                     return;
                  }

                  var15 = var3.anInt_3031 * 69671577 - 1;

                  for(var16 = 0; var16 < this.anInt_11009; ++var16) {
                     var17 = (this.anIntArray_11039[var16] << 16) / this.aShort_11073;
                     if(var17 < var2) {
                        var18 = this.xpoints[var16] + var5;
                        var19 = this.anIntArray_11012[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.shiftAmount * 1694172417;
                        var23 = var19 >> var3.shiftAmount * 1694172417;
                        var24 = var12[var22][var23] * (var3.anInt_3031 * 69671577 - var20) + var12[var22 + 1][var23] * var20 >> var3.shiftAmount * 1694172417;
                        var25 = var12[var22][var23 + 1] * (var3.anInt_3031 * 69671577 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.shiftAmount * 1694172417;
                        var26 = var24 * (var3.anInt_3031 * 69671577 - var21) + var25 * var21 >> var3.shiftAmount * 1694172417;
                        this.anIntArray_11039[var16] += (var26 - var6) * (var2 - var17) / var2;
                     } else {
                        this.anIntArray_11039[var16] = this.anIntArray_11039[var16];
                     }
                  }

                  for(var16 = this.anInt_11009; var16 < this.vertexCount; ++var16) {
                     var17 = (this.anIntArray_11039[var16] << 16) / this.aShort_11073;
                     if(var17 < var2) {
                        var18 = this.xpoints[var16] + var5;
                        var19 = this.anIntArray_11012[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.shiftAmount * 1694172417;
                        var23 = var19 >> var3.shiftAmount * 1694172417;
                        if(var22 >= 0 && var22 < var3.maxWidth * 1658489349 - 1 && var23 >= 0 && var23 < var3.maxHeight * 445373459 - 1) {
                           var24 = var12[var22][var23] * (var3.anInt_3031 * 69671577 - var20) + var12[var22 + 1][var23] * var20 >> var3.shiftAmount * 1694172417;
                           var25 = var12[var22][var23 + 1] * (var3.anInt_3031 * 69671577 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.shiftAmount * 1694172417;
                           var26 = var24 * (var3.anInt_3031 * 69671577 - var21) + var25 * var21 >> var3.shiftAmount * 1694172417;
                           this.anIntArray_11039[var16] += (var26 - var6) * (var2 - var17) / var2;
                        }
                     } else {
                        this.anIntArray_11039[var16] = this.anIntArray_11039[var16];
                     }
                  }
               } else if(var1 == 3) {
                  var15 = (var2 & 255) * 4;
                  var16 = (var2 >> 8 & 255) * 4;
                  var17 = (var2 >> 16 & 255) << 6;
                  var18 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var15 >> 1) < 0 || var5 + (var15 >> 1) + var3.anInt_3031 * 69671577 >= var3.maxWidth * 1658489349 << var3.shiftAmount * 1694172417 || var7 - (var16 >> 1) < 0 || var7 + (var16 >> 1) + var3.anInt_3031 * 69671577 >= var3.maxHeight * 445373459 << var3.shiftAmount * 1694172417) {
                     return;
                  }

                  this.method2061(var3, var5, var6, var7, var15, var16, var17, var18);
               } else if(var1 == 4) {
                  var15 = var4.anInt_3031 * 69671577 - 1;
                  var16 = this.aShort_11013 - this.aShort_11073;

                  for(var17 = 0; var17 < this.anInt_11009; ++var17) {
                     var18 = this.xpoints[var17] + var5;
                     var19 = this.anIntArray_11012[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.shiftAmount * 1694172417;
                     var23 = var19 >> var4.shiftAmount * 1694172417;
                     var24 = var13[var22][var23] * (var4.anInt_3031 * 69671577 - var20) + var13[var22 + 1][var23] * var20 >> var4.shiftAmount * 1694172417;
                     var25 = var13[var22][var23 + 1] * (var4.anInt_3031 * 69671577 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.shiftAmount * 1694172417;
                     var26 = var24 * (var4.anInt_3031 * 69671577 - var21) + var25 * var21 >> var4.shiftAmount * 1694172417;
                     this.anIntArray_11039[var17] = this.anIntArray_11039[var17] + (var26 - var6) + var16;
                  }

                  for(var17 = this.anInt_11009; var17 < this.vertexCount; ++var17) {
                     var18 = this.xpoints[var17] + var5;
                     var19 = this.anIntArray_11012[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.shiftAmount * 1694172417;
                     var23 = var19 >> var4.shiftAmount * 1694172417;
                     if(var22 >= 0 && var22 < var4.maxWidth * 1658489349 - 1 && var23 >= 0 && var23 < var4.maxHeight * 445373459 - 1) {
                        var24 = var13[var22][var23] * (var4.anInt_3031 * 69671577 - var20) + var13[var22 + 1][var23] * var20 >> var4.shiftAmount * 1694172417;
                        var25 = var13[var22][var23 + 1] * (var4.anInt_3031 * 69671577 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.shiftAmount * 1694172417;
                        var26 = var24 * (var4.anInt_3031 * 69671577 - var21) + var25 * var21 >> var4.shiftAmount * 1694172417;
                        this.anIntArray_11039[var17] = this.anIntArray_11039[var17] + (var26 - var6) + var16;
                     }
                  }
               } else if(var1 == 5) {
                  var15 = var4.anInt_3031 * 69671577 - 1;
                  var16 = this.aShort_11013 - this.aShort_11073;

                  int var27;
                  int var28;
                  for(var17 = 0; var17 < this.anInt_11009; ++var17) {
                     var18 = this.xpoints[var17] + var5;
                     var19 = this.anIntArray_11012[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.shiftAmount * 1694172417;
                     var23 = var19 >> var3.shiftAmount * 1694172417;
                     var24 = var12[var22][var23] * (var3.anInt_3031 * 69671577 - var20) + var12[var22 + 1][var23] * var20 >> var3.shiftAmount * 1694172417;
                     var25 = var12[var22][var23 + 1] * (var3.anInt_3031 * 69671577 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.shiftAmount * 1694172417;
                     var26 = var24 * (var3.anInt_3031 * 69671577 - var21) + var25 * var21 >> var3.shiftAmount * 1694172417;
                     var24 = var13[var22][var23] * (var4.anInt_3031 * 69671577 - var20) + var13[var22 + 1][var23] * var20 >> var4.shiftAmount * 1694172417;
                     var25 = var13[var22][var23 + 1] * (var4.anInt_3031 * 69671577 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.shiftAmount * 1694172417;
                     var27 = var24 * (var4.anInt_3031 * 69671577 - var21) + var25 * var21 >> var4.shiftAmount * 1694172417;
                     var28 = var26 - var27 - var2;
                     this.anIntArray_11039[var17] = ((this.anIntArray_11039[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                  }

                  for(var17 = this.anInt_11009; var17 < this.vertexCount; ++var17) {
                     var18 = this.xpoints[var17] + var5;
                     var19 = this.anIntArray_11012[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.shiftAmount * 1694172417;
                     var23 = var19 >> var3.shiftAmount * 1694172417;
                     if(var22 >= 0 && var22 < var3.maxWidth * 1658489349 - 1 && var22 < var4.maxWidth * 1658489349 - 1 && var23 >= 0 && var23 < var3.maxHeight * 445373459 - 1 && var23 < var4.maxHeight * 445373459 - 1) {
                        var24 = var12[var22][var23] * (var3.anInt_3031 * 69671577 - var20) + var12[var22 + 1][var23] * var20 >> var3.shiftAmount * 1694172417;
                        var25 = var12[var22][var23 + 1] * (var3.anInt_3031 * 69671577 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.shiftAmount * 1694172417;
                        var26 = var24 * (var3.anInt_3031 * 69671577 - var21) + var25 * var21 >> var3.shiftAmount * 1694172417;
                        var24 = var13[var22][var23] * (var4.anInt_3031 * 69671577 - var20) + var13[var22 + 1][var23] * var20 >> var4.shiftAmount * 1694172417;
                        var25 = var13[var22][var23 + 1] * (var4.anInt_3031 * 69671577 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.shiftAmount * 1694172417;
                        var27 = var24 * (var4.anInt_3031 * 69671577 - var21) + var25 * var21 >> var4.shiftAmount * 1694172417;
                        var28 = var26 - var27 - var2;
                        this.anIntArray_11039[var17] = ((this.anIntArray_11039[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                     }
                  }
               }
            }

            this.aBoolean_11005 = false;
         }
      }
   }

   void method2064() {
      if(this.softwareRenderer.anInt_10187 * 367589431 > 1) {
         synchronized(this) {
            while(this.aBoolean_3022) {
               try {
                  this.wait();
               } catch (InterruptedException var4) {
                  ;
               }
            }

            this.aBoolean_3022 = true;
         }
      }

   }

   void method2025() {
      if(this.softwareRenderer.anInt_10187 * 367589431 > 1) {
         synchronized(this) {
            this.aBoolean_3022 = false;
            this.notifyAll();
         }
      }

   }

   boolean method2031() {
      if(this.anIntArrayArray_11038 == null) {
         return false;
      } else {
         this.anInt_11069 = 0;
         this.anInt_11052 = 0;
         this.anInt_11044 = 0;
         return true;
      }
   }

   void method2024() {
      if(this.aBoolean_11041) {
         for(int var1 = 0; var1 < this.vertexCount; ++var1) {
            this.xpoints[var1] = this.xpoints[var1] + 7 >> 4;
            this.anIntArray_11039[var1] = this.anIntArray_11039[var1] + 7 >> 4;
            this.anIntArray_11012[var1] = this.anIntArray_11012[var1] + 7 >> 4;
         }

         this.aBoolean_11041 = false;
      }

      if(this.aBoolean_11008) {
         this.method7599();
         this.aBoolean_11008 = false;
      }

      this.aBoolean_11005 = false;
   }

   void method2033(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var50;
      int var49;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBoolean_11041) {
            for(var10 = 0; var10 < this.vertexCount; ++var10) {
               this.xpoints[var10] <<= 4;
               this.anIntArray_11039[var10] <<= 4;
               this.anIntArray_11012[var10] <<= 4;
            }

            this.aBoolean_11041 = true;
         }

         var10 = 0;
         this.anInt_11069 = 0;
         this.anInt_11052 = 0;
         this.anInt_11044 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var50 = var2[var11];
            if(var50 < this.anIntArrayArray_11038.length) {
               int[] var51 = this.anIntArrayArray_11038[var50];

               for(var49 = 0; var49 < var51.length; ++var49) {
                  var15 = var51[var49];
                  if(this.aShortArray_11045 == null || (var7 & this.aShortArray_11045[var15]) != 0) {
                     this.anInt_11069 += this.xpoints[var15];
                     this.anInt_11052 += this.anIntArray_11039[var15];
                     this.anInt_11044 += this.anIntArray_11012[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.anInt_11069 = this.anInt_11069 / var10 + var3;
            this.anInt_11052 = this.anInt_11052 / var10 + var4;
            this.anInt_11044 = this.anInt_11044 / var10 + var5;
            this.aBoolean_11006 = true;
         } else {
            this.anInt_11069 = var3;
            this.anInt_11052 = var4;
            this.anInt_11044 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var50 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var50;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBoolean_11041) {
               for(var10 = 0; var10 < this.vertexCount; ++var10) {
                  this.xpoints[var10] <<= 4;
                  this.anIntArray_11039[var10] <<= 4;
                  this.anIntArray_11012[var10] <<= 4;
               }

               this.aBoolean_11041 = true;
            }

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray_11038.length) {
                  var12 = this.anIntArrayArray_11038[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var49 = var12[var13];
                     if(this.aShortArray_11045 == null || (var7 & this.aShortArray_11045[var49]) != 0) {
                        this.xpoints[var49] += var3;
                        this.anIntArray_11039[var49] += var4;
                        this.anIntArray_11012[var49] += var5;
                     }
                  }
               }
            }

         } else {
            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var23;
            int var22;
            int var24;
            int var27;
            int var26;
            int var28;
            int var30;
            int var34;
            int[] var35;
            int var32;
            int var33;
            int var38;
            int var39;
            int var36;
            int var37;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  if(!this.aBoolean_11041) {
                     for(var10 = 0; var10 < this.vertexCount; ++var10) {
                        this.xpoints[var10] <<= 4;
                        this.anIntArray_11039[var10] <<= 4;
                        this.anIntArray_11012[var10] <<= 4;
                     }

                     this.aBoolean_11041 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var50 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var49 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBoolean_11006) {
                     var16 = var8[0] * this.anInt_11069 + var8[3] * this.anInt_11052 + var8[6] * this.anInt_11044 + 8192 >> 14;
                     var17 = var8[1] * this.anInt_11069 + var8[4] * this.anInt_11052 + var8[7] * this.anInt_11044 + 8192 >> 14;
                     var18 = var8[2] * this.anInt_11069 + var8[5] * this.anInt_11052 + var8[8] * this.anInt_11044 + 8192 >> 14;
                     var16 += var13;
                     var17 += var49;
                     var18 += var15;
                     this.anInt_11069 = var16;
                     this.anInt_11052 = var17;
                     this.anInt_11044 = var18;
                     this.aBoolean_11006 = false;
                  }

                  int[] var52 = new int[9];
                  var17 = Class362.sinArray[var3];
                  var18 = Class362.cosArray[var3];
                  var19 = Class362.sinArray[var4];
                  var20 = Class362.cosArray[var4];
                  var21 = Class362.sinArray[var5];
                  var22 = Class362.cosArray[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var52[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var52[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var52[2] = var20 * var17 + 8192 >> 14;
                  var52[3] = var17 * var22 + 8192 >> 14;
                  var52[4] = var17 * var21 + 8192 >> 14;
                  var52[5] = -var18;
                  var52[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var52[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var52[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var52[0] * -this.anInt_11069 + var52[1] * -this.anInt_11052 + var52[2] * -this.anInt_11044 + 8192 >> 14;
                  var26 = var52[3] * -this.anInt_11069 + var52[4] * -this.anInt_11052 + var52[5] * -this.anInt_11044 + 8192 >> 14;
                  var27 = var52[6] * -this.anInt_11069 + var52[7] * -this.anInt_11052 + var52[8] * -this.anInt_11044 + 8192 >> 14;
                  var28 = var53 + this.anInt_11069;
                  int var54 = var26 + this.anInt_11052;
                  var30 = var27 + this.anInt_11044;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var52[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var52[0] * var13 + var52[1] * var49 + var52[2] * var15 + 8192 >> 14;
                  var33 = var52[3] * var13 + var52[4] * var49 + var52[5] * var15 + 8192 >> 14;
                  var34 = var52[6] * var13 + var52[7] * var49 + var52[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var50;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray_11038.length) {
                        int[] var41 = this.anIntArrayArray_11038[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray_11045 == null || (var7 & this.aShortArray_11045[var43]) != 0) {
                              int var44 = var35[0] * this.xpoints[var43] + var35[1] * this.anIntArray_11039[var43] + var35[2] * this.anIntArray_11012[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.xpoints[var43] + var35[4] * this.anIntArray_11039[var43] + var35[5] * this.anIntArray_11012[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.xpoints[var43] + var35[7] * this.anIntArray_11039[var43] + var35[8] * this.anIntArray_11012[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.xpoints[var43] = var44;
                              this.anIntArray_11039[var43] = var45;
                              this.anIntArray_11012[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray_11038.length) {
                        var12 = this.anIntArrayArray_11038[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var49 = var12[var13];
                           if(this.aShortArray_11045 == null || (var7 & this.aShortArray_11045[var49]) != 0) {
                              this.xpoints[var49] -= this.anInt_11069;
                              this.anIntArray_11039[var49] -= this.anInt_11052;
                              this.anIntArray_11012[var49] -= this.anInt_11044;
                              if(var5 != 0) {
                                 var15 = Class362.cosArray[var5];
                                 var16 = Class362.sinArray[var5];
                                 var17 = this.anIntArray_11039[var49] * var15 + this.xpoints[var49] * var16 + 16383 >> 14;
                                 this.anIntArray_11039[var49] = this.anIntArray_11039[var49] * var16 - this.xpoints[var49] * var15 + 16383 >> 14;
                                 this.xpoints[var49] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class362.cosArray[var3];
                                 var16 = Class362.sinArray[var3];
                                 var17 = this.anIntArray_11039[var49] * var16 - this.anIntArray_11012[var49] * var15 + 16383 >> 14;
                                 this.anIntArray_11012[var49] = this.anIntArray_11039[var49] * var15 + this.anIntArray_11012[var49] * var16 + 16383 >> 14;
                                 this.anIntArray_11039[var49] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class362.cosArray[var4];
                                 var16 = Class362.sinArray[var4];
                                 var17 = this.anIntArray_11012[var49] * var15 + this.xpoints[var49] * var16 + 16383 >> 14;
                                 this.anIntArray_11012[var49] = this.anIntArray_11012[var49] * var16 - this.xpoints[var49] * var15 + 16383 >> 14;
                                 this.xpoints[var49] = var17;
                              }

                              this.xpoints[var49] += this.anInt_11069;
                              this.anIntArray_11039[var49] += this.anInt_11052;
                              this.anIntArray_11012[var49] += this.anInt_11044;
                           }
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  if(!this.aBoolean_11041) {
                     for(var10 = 0; var10 < this.vertexCount; ++var10) {
                        this.xpoints[var10] <<= 4;
                        this.anIntArray_11039[var10] <<= 4;
                        this.anIntArray_11012[var10] <<= 4;
                     }

                     this.aBoolean_11041 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var50 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var49 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBoolean_11006) {
                     var16 = var8[0] * this.anInt_11069 + var8[3] * this.anInt_11052 + var8[6] * this.anInt_11044 + 8192 >> 14;
                     var17 = var8[1] * this.anInt_11069 + var8[4] * this.anInt_11052 + var8[7] * this.anInt_11044 + 8192 >> 14;
                     var18 = var8[2] * this.anInt_11069 + var8[5] * this.anInt_11052 + var8[8] * this.anInt_11044 + 8192 >> 14;
                     var16 += var13;
                     var17 += var49;
                     var18 += var15;
                     this.anInt_11069 = var16;
                     this.anInt_11052 = var17;
                     this.anInt_11044 = var18;
                     this.aBoolean_11006 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.anInt_11069 + 8192 >> 14;
                  var20 = var17 * -this.anInt_11052 + 8192 >> 14;
                  var21 = var18 * -this.anInt_11044 + 8192 >> 14;
                  var22 = var19 + this.anInt_11069;
                  var23 = var20 + this.anInt_11052;
                  var24 = var21 + this.anInt_11044;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var49 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var50;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray_11038.length) {
                        var35 = this.anIntArrayArray_11038[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray_11045 == null || (var7 & this.aShortArray_11045[var37]) != 0) {
                              var38 = var29[0] * this.xpoints[var37] + var29[1] * this.anIntArray_11039[var37] + var29[2] * this.anIntArray_11012[var37] + 8192 >> 14;
                              var39 = var29[3] * this.xpoints[var37] + var29[4] * this.anIntArray_11039[var37] + var29[5] * this.anIntArray_11012[var37] + 8192 >> 14;
                              var40 = var29[6] * this.xpoints[var37] + var29[7] * this.anIntArray_11039[var37] + var29[8] * this.anIntArray_11012[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.xpoints[var37] = var38;
                              this.anIntArray_11039[var37] = var39;
                              this.anIntArray_11012[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray_11038.length) {
                        var12 = this.anIntArrayArray_11038[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var49 = var12[var13];
                           if(this.aShortArray_11045 == null || (var7 & this.aShortArray_11045[var49]) != 0) {
                              this.xpoints[var49] -= this.anInt_11069;
                              this.anIntArray_11039[var49] -= this.anInt_11052;
                              this.anIntArray_11012[var49] -= this.anInt_11044;
                              this.xpoints[var49] = this.xpoints[var49] * var3 / 128;
                              this.anIntArray_11039[var49] = this.anIntArray_11039[var49] * var4 / 128;
                              this.anIntArray_11012[var49] = this.anIntArray_11012[var49] * var5 / 128;
                              this.xpoints[var49] += this.anInt_11069;
                              this.anIntArray_11039[var49] += this.anInt_11052;
                              this.anIntArray_11012[var49] += this.anInt_11044;
                           }
                        }
                     }
                  }
               }

            } else {
               Class215 var47;
               Class195 var48;
               if(var1 == 5) {
                  if(this.anIntArrayArray_11023 != null && this.aByteArray_11033 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray_11023.length) {
                           var12 = this.anIntArrayArray_11023[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.aShortArray_11036 == null || (var7 & this.aShortArray_11036[var49]) != 0) {
                                 var15 = (this.aByteArray_11033[var49] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.aByteArray_11033[var49] = (byte)var15;
                              }
                           }
                        }
                     }

                     if(this.aClass215Array_11049 != null) {
                        for(var10 = 0; var10 < this.anInt_11048; ++var10) {
                           var47 = this.aClass215Array_11049[var10];
                           var48 = this.aClass195Array_11050[var10];
                           var48.anInt_3383 = (var48.anInt_3383 * -1861349297 & 16777215 | 255 - (this.aByteArray_11033[var47.anInt_3736 * -1304911815] & 255) << 24) * -1817246033;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray_11023 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray_11023.length) {
                           var12 = this.anIntArrayArray_11023[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.aShortArray_11036 == null || (var7 & this.aShortArray_11036[var49]) != 0) {
                                 var15 = this.aShortArray_11035[var49] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4;
                                 if(var17 < 0) {
                                    var17 = 0;
                                 } else if(var17 > 7) {
                                    var17 = 7;
                                 }

                                 var18 += var5;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 127) {
                                    var18 = 127;
                                 }

                                 this.aShortArray_11035[var49] = (short)(var16 << 10 | var17 << 7 | var18);
                              }
                           }

                           this.aBoolean_11008 = true;
                        }
                     }

                     if(this.aClass215Array_11049 != null) {
                        for(var10 = 0; var10 < this.anInt_11048; ++var10) {
                           var47 = this.aClass215Array_11049[var10];
                           var48 = this.aClass195Array_11050[var10];
                           var48.anInt_3383 = (var48.anInt_3383 * -1861349297 & -16777216 | Class561.colourMap[CacheFileID.method1398(this.aShortArray_11035[var47.anInt_3736 * -1304911815] & '\uffff', -1758853145) & '\uffff'] & 16777215) * -1817246033;
                        }
                     }
                  }

               } else {
                  Class195 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray_11051 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_11051.length) {
                              var12 = this.anIntArrayArray_11051[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass195Array_11050[var12[var13]];
                                 var14.anInt_3380 += var3 * 18457649;
                                 var14.anInt_3381 += var4 * 950273417;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray_11051 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_11051.length) {
                              var12 = this.anIntArrayArray_11051[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass195Array_11050[var12[var13]];
                                 var14.aFloat_3378 = var14.aFloat_3378 * (float)var3 / 128.0F;
                                 var14.aFloat_3379 = var14.aFloat_3379 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray_11051 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_11051.length) {
                              var12 = this.anIntArrayArray_11051[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass195Array_11050[var12[var13]];
                                 var14.anInt_3382 = (var14.anInt_3382 * 1653768383 + var3 & 16383) * 943779647;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2034(int var1, int var2, int var3, int var4) {
      int var5;
      int var11;
      if(var1 == 0) {
         var5 = 0;
         this.anInt_11069 = 0;
         this.anInt_11052 = 0;
         this.anInt_11044 = 0;

         for(var11 = 0; var11 < this.vertexCount; ++var11) {
            this.anInt_11069 += this.xpoints[var11];
            this.anInt_11052 += this.anIntArray_11039[var11];
            this.anInt_11044 += this.anIntArray_11012[var11];
            ++var5;
         }

         if(var5 > 0) {
            this.anInt_11069 = this.anInt_11069 / var5 + var2;
            this.anInt_11052 = this.anInt_11052 / var5 + var3;
            this.anInt_11044 = this.anInt_11044 / var5 + var4;
         } else {
            this.anInt_11069 = var2;
            this.anInt_11052 = var3;
            this.anInt_11044 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.vertexCount; ++var5) {
            this.xpoints[var5] += var2;
            this.anIntArray_11039[var5] += var3;
            this.anIntArray_11012[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.vertexCount; ++var5) {
               this.xpoints[var5] -= this.anInt_11069;
               this.anIntArray_11039[var5] -= this.anInt_11052;
               this.anIntArray_11012[var5] -= this.anInt_11044;
               if(var4 != 0) {
                  var11 = Class362.cosArray[var4];
                  var7 = Class362.sinArray[var4];
                  var8 = this.anIntArray_11039[var5] * var11 + this.xpoints[var5] * var7 + 16383 >> 14;
                  this.anIntArray_11039[var5] = this.anIntArray_11039[var5] * var7 - this.xpoints[var5] * var11 + 16383 >> 14;
                  this.xpoints[var5] = var8;
               }

               if(var2 != 0) {
                  var11 = Class362.cosArray[var2];
                  var7 = Class362.sinArray[var2];
                  var8 = this.anIntArray_11039[var5] * var7 - this.anIntArray_11012[var5] * var11 + 16383 >> 14;
                  this.anIntArray_11012[var5] = this.anIntArray_11039[var5] * var11 + this.anIntArray_11012[var5] * var7 + 16383 >> 14;
                  this.anIntArray_11039[var5] = var8;
               }

               if(var3 != 0) {
                  var11 = Class362.cosArray[var3];
                  var7 = Class362.sinArray[var3];
                  var8 = this.anIntArray_11012[var5] * var11 + this.xpoints[var5] * var7 + 16383 >> 14;
                  this.anIntArray_11012[var5] = this.anIntArray_11012[var5] * var7 - this.xpoints[var5] * var11 + 16383 >> 14;
                  this.xpoints[var5] = var8;
               }

               this.xpoints[var5] += this.anInt_11069;
               this.anIntArray_11039[var5] += this.anInt_11052;
               this.anIntArray_11012[var5] += this.anInt_11044;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.vertexCount; ++var5) {
               this.xpoints[var5] -= this.anInt_11069;
               this.anIntArray_11039[var5] -= this.anInt_11052;
               this.anIntArray_11012[var5] -= this.anInt_11044;
               this.xpoints[var5] = this.xpoints[var5] * var2 / 128;
               this.anIntArray_11039[var5] = this.anIntArray_11039[var5] * var3 / 128;
               this.anIntArray_11012[var5] = this.anIntArray_11012[var5] * var4 / 128;
               this.xpoints[var5] += this.anInt_11069;
               this.anIntArray_11039[var5] += this.anInt_11052;
               this.anIntArray_11012[var5] += this.anInt_11044;
            }

         } else {
            Class215 var10;
            Class195 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt_11016; ++var5) {
                  var11 = (this.aByteArray_11033[var5] & 255) + var2 * 8;
                  if(var11 < 0) {
                     var11 = 0;
                  } else if(var11 > 255) {
                     var11 = 255;
                  }

                  this.aByteArray_11033[var5] = (byte)var11;
               }

               if(this.aClass215Array_11049 != null) {
                  for(var5 = 0; var5 < this.anInt_11048; ++var5) {
                     var10 = this.aClass215Array_11049[var5];
                     var12 = this.aClass195Array_11050[var5];
                     var12.anInt_3383 = (var12.anInt_3383 * -1861349297 & 16777215 | 255 - (this.aByteArray_11033[var10.anInt_3736 * -1304911815] & 255) << 24) * -1817246033;
                  }
               }

            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt_11016; ++var5) {
                  var11 = this.aShortArray_11035[var5] & '\uffff';
                  var7 = var11 >> 10 & 63;
                  var8 = var11 >> 7 & 7;
                  int var9 = var11 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.aShortArray_11035[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               this.aBoolean_11008 = true;
               if(this.aClass215Array_11049 != null) {
                  for(var5 = 0; var5 < this.anInt_11048; ++var5) {
                     var10 = this.aClass215Array_11049[var5];
                     var12 = this.aClass195Array_11050[var5];
                     var12.anInt_3383 = (var12.anInt_3383 * -1861349297 & -16777216 | Class561.colourMap[CacheFileID.method1398(this.aShortArray_11035[var10.anInt_3736 * -1304911815] & '\uffff', 345513318) & '\uffff'] & 16777215) * -1817246033;
                  }
               }

            } else {
               Class195 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt_11048; ++var5) {
                     var6 = this.aClass195Array_11050[var5];
                     var6.anInt_3380 += var2 * 18457649;
                     var6.anInt_3381 += var3 * 950273417;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt_11048; ++var5) {
                     var6 = this.aClass195Array_11050[var5];
                     var6.aFloat_3378 = var6.aFloat_3378 * (float)var2 / 128.0F;
                     var6.aFloat_3379 = var6.aFloat_3379 * (float)var3 / 128.0F;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt_11048; ++var5) {
                     var6 = this.aClass195Array_11050[var5];
                     var6.anInt_3382 = (var6.anInt_3382 * 1653768383 + var2 & 16383) * 943779647;
                  }

               }
            }
         }
      }
   }

   public void applyViewport(Viewport var1, int var2, boolean var3) {
      if(this.aShortArray_11045 != null) {
         Class210 var4 = this.softwareRenderer.method6787(Thread.currentThread());
         Viewport var5 = var4.aViewport_3632;
         var5.setAs(var1);
         if(var3) {
            var5.method4642();
         }

         ArrayViewport var6 = var4.anArrayViewport_3626;
         var6.setViewport(var5);
         float[] var7 = new float[3];

         for(int var8 = 0; var8 < this.anInt_11009; ++var8) {
            if((var2 & this.aShortArray_11045[var8]) != 0) {
               var6.method4558((float)this.xpoints[var8], (float)this.anIntArray_11039[var8], (float)this.anIntArray_11012[var8], var7);
               this.xpoints[var8] = (int)var7[0];
               this.anIntArray_11039[var8] = (int)var7[1];
               this.anIntArray_11012[var8] = (int)var7[2];
            }
         }

      }
   }

   public void method2069(Viewport var1, Class92 var2, int var3) {
      this.method7623(var1, var2, var3);
   }

   void method7623(Viewport var1, Class92 var2, int var3) {
      if(this.anInt_11009 >= 1) {
         Class210 var4 = this.softwareRenderer.method6787(Thread.currentThread());
         ArrayViewport var5 = var4.anArrayViewport_3626;
         var5.setViewport(var1);
         ArrayViewport var6 = this.softwareRenderer.anArrayViewport_10173;
         ArrayViewport var7 = this.softwareRenderer.anArrayViewport_10184;
         if(!this.aBoolean_11005) {
            this.method7628();
         }

         boolean var8 = var5.method4588();
         float[] var9 = var4.aFloatArray_3655;
         var5.method4558(0.0F, (float)this.aShort_11073, 0.0F, var9);
         float var10 = var9[0];
         float var11 = var9[1];
         float var12 = var9[2];
         var5.method4558(0.0F, (float)this.aShort_11013, 0.0F, var9);
         float var13 = var9[0];
         float var14 = var9[1];
         float var15 = var9[2];

         float var19;
         float var18;
         for(int var16 = 0; var16 < 6; ++var16) {
            float[] var17 = this.softwareRenderer.aFloatArrayArray_10176[var16];
            var18 = var17[0] * var10 + var17[1] * var11 + var17[2] * var12 + var17[3] + (float)this.aShort_11053;
            var19 = var17[0] * var13 + var17[1] * var14 + var17[2] * var15 + var17[3] + (float)this.aShort_11053;
            if(var18 < 0.0F && var19 < 0.0F) {
               return;
            }
         }

         float var51;
         float var52;
         if(var8) {
            var51 = var6.data[14];
            var52 = var6.data[6];
         } else {
            var51 = var5.data[12] * var6.data[2] + var5.data[13] * var6.data[6] + var5.data[14] * var6.data[10] + var6.data[14];
            var52 = var5.data[4] * var6.data[2] + var5.data[5] * var6.data[6] + var5.data[6] * var6.data[10];
         }

         var18 = var51 + (float)this.aShort_11073 * var52;
         var19 = var51 + (float)this.aShort_11013 * var52;
         float var20 = var18 > var19?var18 + (float)this.aShort_11053:var19 + (float)this.aShort_11053;
         float var21 = var7.data[10] * var20 + var7.data[14];
         if(this.softwareRenderer.anInt_10187 * 367589431 > 1) {
            synchronized(this) {
               while(this.aBoolean_10993) {
                  try {
                     this.wait();
                  } catch (InterruptedException var48) {
                     ;
                  }
               }

               this.aBoolean_10993 = true;
            }
         }

         this.method7667(var4);
         ArrayViewport var22 = this.aClass210_11015.anArrayViewport_3627;
         var22.replaceWith(var5);
         var22.method4580(this.softwareRenderer.renderData);
         if((var3 & 2) != 0) {
            this.aClass202_10996.method2560(true);
         } else {
            this.aClass202_10996.method2560(false);
         }

         boolean var23 = false;
         this.aClass210_11015.aFloat_3644 = this.aClass202_10996.aFloat_3490;
         this.aClass210_11015.aFloat_3641 = this.aClass202_10996.aFloat_3484;
         this.aClass210_11015.aFloat_3643 = this.aClass202_10996.aFloat_3489;
         this.aClass210_11015.aFloat_3645 = 1.0F / this.aClass202_10996.aFloat_3489;
         this.aClass210_11015.aFloat_3640 = this.aClass202_10996.aFloat_3495;
         this.aClass210_11015.aFloat_3642 = this.aClass202_10996.aFloat_3483;
         this.aClass210_11015.aFloat_3620 = this.aClass202_10996.aFloat_3485;
         this.aClass210_11015.anInt_3646 = this.aClass202_10996.anInt_3487 * 859252201;

         int i;
         float var24;
         int var27;
         int var26;
         float var29;
         int var28;
         float w;
         float var30;
         for(i = 0; i < this.vertexCount; ++i) {
            var26 = this.xpoints[i];
            var27 = this.anIntArray_11039[i];
            var28 = this.anIntArray_11012[i];
            var24 = var22.data[0] * (float)var26 + var22.data[4] * (float)var27 + var22.data[8] * (float)var28 + var22.data[12];
            var29 = var22.data[1] * (float)var26 + var22.data[5] * (float)var27 + var22.data[9] * (float)var28 + var22.data[13];
            var30 = var22.data[2] * (float)var26 + var22.data[6] * (float)var27 + var22.data[10] * (float)var28 + var22.data[14];
            w = var22.data[3] * (float)var26 + var22.data[7] * (float)var27 + var22.data[11] * (float)var28 + var22.data[15];
            this.aFloatArray_11067[i] = this.aClass210_11015.aFloat_3620 + this.aClass210_11015.aFloat_3643 * var30 / w;
            this.aFloatArray_11062[i] = w;
            if(var30 >= -w) {
               this.screenX[i] = (float)((int)(this.aClass210_11015.aFloat_3640 + this.aClass210_11015.aFloat_3644 * var24 / w));
               this.screenY[i] = (float)((int)(this.aClass210_11015.aFloat_3642 + this.aClass210_11015.aFloat_3641 * var29 / w));
            } else {
               this.screenX[i] = -5000.0F;
               var23 = true;
            }

            if(this.aClass210_11015.aBoolean_3618) {
               this.anIntArray_11055[i] = (int)(var5.data[13] + var5.data[1] * (float)var26 + var5.data[5] * (float)var27 + var5.data[9] * (float)var28);
            }
         }

         float var38;
         float var39;
         float var37;
         float var42;
         float var40;
         float var41;
         if(this.aClass215Array_11049 != null) {
            for(i = 0; i < this.anInt_11048; ++i) {
               Class215 var32 = this.aClass215Array_11049[i];
               Class195 var33 = this.aClass195Array_11050[i];
               short var34 = this.aShortArray_11046[var32.anInt_3736 * -1304911815];
               short var35 = this.aShortArray_11019[var32.anInt_3736 * -1304911815];
               short var36 = this.aShortArray_11068[var32.anInt_3736 * -1304911815];
               var26 = (this.xpoints[var34] + this.xpoints[var35] + this.xpoints[var36]) / 3;
               var27 = (this.anIntArray_11039[var34] + this.anIntArray_11039[var35] + this.anIntArray_11039[var36]) / 3;
               var28 = (this.anIntArray_11012[var34] + this.anIntArray_11012[var35] + this.anIntArray_11012[var36]) / 3;
               var24 = var22.data[0] * (float)var26 + var22.data[4] * (float)var27 + var22.data[8] * (float)var28 + var22.data[12];
               var29 = var22.data[1] * (float)var26 + var22.data[5] * (float)var27 + var22.data[9] * (float)var28 + var22.data[13];
               var30 = var22.data[2] * (float)var26 + var22.data[6] * (float)var27 + var22.data[10] * (float)var28 + var22.data[14];
               w = var22.data[3] * (float)var26 + var22.data[7] * (float)var27 + var22.data[11] * (float)var28 + var22.data[15];
               var30 += var7.data[2] * (float)(var33.anInt_3380 * -446221103) + var7.data[6] * (float)(var33.anInt_3381 * -1615331143);
               w += var7.data[3] * (float)(var33.anInt_3380 * -446221103) + var7.data[7] * (float)(var33.anInt_3381 * -1615331143);
               if(var30 > -w) {
                  var24 += var7.data[0] * (float)(var33.anInt_3380 * -446221103) + var7.data[4] * (float)(var33.anInt_3381 * -1615331143);
                  var29 += var7.data[1] * (float)(var33.anInt_3380 * -446221103) + var7.data[5] * (float)(var33.anInt_3381 * -1615331143);
                  var37 = this.softwareRenderer.renderX + this.softwareRenderer.scaleX * var24 / w;
                  var38 = this.softwareRenderer.renderY + this.softwareRenderer.scaleY * var29 / w;
                  var39 = var33.aFloat_3378 * (float)var32.aShort_3734;
                  var40 = var33.aFloat_3379 * (float)var32.aShort_3731;
                  var41 = var24 + var7.data[0] * var39 + var7.data[4] * var40;
                  var42 = var29 + var7.data[1] * var39 + var7.data[5] * var40;
                  float var43 = w + var7.data[3] * var39 + var7.data[7] * var40;
                  float var44 = this.softwareRenderer.renderX + this.softwareRenderer.scaleX * var41 / var43;
                  float var45 = this.softwareRenderer.renderY + this.softwareRenderer.scaleY * var42 / var43;
                  var33.anInt_3384 = (int)var37 * 908712367;
                  var33.anInt_3377 = (int)var38 * 1280543935;
                  var33.aFloat_3387 = this.softwareRenderer.aFloat_10186 + this.softwareRenderer.aFloat_10185 * (var30 - var7.data[10] * (float)(var32.anInt_3738 * 2118142325)) / w;
                  var33.anInt_3385 = (int)(var44 < var37?var37 - var44:var44 - var37) * 840140841;
                  var33.anInt_3386 = (int)(var45 < var38?var38 - var45:var45 - var38) * 338056863;
               } else {
                  var33.anInt_3386 = 0;
                  var33.anInt_3385 = 0;
               }
            }
         }

         if(var2 != null) {
            boolean var54 = false;
            boolean var56 = true;
            int var55 = this.aShort_11057 + this.aShort_11058 >> 1;
            int var59 = this.aShort_11034 + this.aShort_11060 >> 1;
            short var53 = this.aShort_11073;
            var24 = var22.data[0] * (float)var55 + var22.data[4] * (float)var53 + var22.data[8] * (float)var59 + var22.data[12];
            var29 = var22.data[1] * (float)var55 + var22.data[5] * (float)var53 + var22.data[9] * (float)var59 + var22.data[13];
            var30 = var22.data[2] * (float)var55 + var22.data[6] * (float)var53 + var22.data[10] * (float)var59 + var22.data[14];
            w = var22.data[3] * (float)var55 + var22.data[7] * (float)var53 + var22.data[11] * (float)var59 + var22.data[15];
            if(var30 >= -w) {
               var2.anInt_1829 = (int)(this.softwareRenderer.renderX + this.softwareRenderer.scaleX * var24 / w);
               var2.anInt_1826 = (int)(this.softwareRenderer.renderY + this.softwareRenderer.scaleY * var29 / w);
            } else {
               var54 = true;
            }

            var53 = this.aShort_11013;
            float var58 = var22.data[0] * (float)var55 + var22.data[4] * (float)var53 + var22.data[8] * (float)var59 + var22.data[12];
            float var57 = var22.data[1] * (float)var55 + var22.data[5] * (float)var53 + var22.data[9] * (float)var59 + var22.data[13];
            var37 = var22.data[2] * (float)var55 + var22.data[6] * (float)var53 + var22.data[10] * (float)var59 + var22.data[14];
            var38 = var22.data[3] * (float)var55 + var22.data[7] * (float)var53 + var22.data[11] * (float)var59 + var22.data[15];
            if(var37 >= -var38) {
               var2.anInt_1827 = (int)(this.softwareRenderer.renderX + this.softwareRenderer.scaleX * var58 / var38);
               var2.anInt_1830 = (int)(this.softwareRenderer.renderY + this.softwareRenderer.scaleY * var57 / var38);
            } else {
               var54 = true;
            }

            if(var54) {
               if(var30 < -w && var37 < -var38) {
                  var56 = false;
               } else if(var30 < -w) {
                  var39 = (var30 + w) / (var37 + var38) - 1.0F;
                  var40 = var24 + var39 * (var58 - var24);
                  var41 = var29 + var39 * (var57 - var29);
                  var42 = w + var39 * (var38 - w);
                  var2.anInt_1829 = (int)(this.softwareRenderer.renderX + this.softwareRenderer.scaleX * var40 / var42);
                  var2.anInt_1826 = (int)(this.softwareRenderer.renderY + this.softwareRenderer.scaleY * var41 / var42);
               } else if(var37 < -var38) {
                  var39 = (var37 + var38) / (var30 + w) - 1.0F;
                  var40 = var58 + var39 * (var24 - var58);
                  var41 = var57 + var39 * (var29 - var57);
                  var42 = var38 + var39 * (w - var38);
                  var2.anInt_1827 = (int)(this.softwareRenderer.renderX + this.softwareRenderer.scaleX * var40 / var42);
                  var2.anInt_1830 = (int)(this.softwareRenderer.renderY + this.softwareRenderer.scaleY * var41 / var42);
               }
            }

            if(var56) {
               if(var30 / w > var37 / var38) {
                  var39 = var24 + var7.data[0] * (float)this.aShort_11053 + var7.data[12];
                  var40 = w + var7.data[3] * (float)this.aShort_11053 + var7.data[15];
                  var2.anInt_1831 = (int)(this.softwareRenderer.renderX - (float)var2.anInt_1829 + this.softwareRenderer.scaleX * var39 / var40);
               } else {
                  var39 = var58 + var7.data[0] * (float)this.aShort_11053 + var7.data[12];
                  var40 = var38 + var7.data[3] * (float)this.aShort_11053 + var7.data[15];
                  var2.anInt_1831 = (int)(this.softwareRenderer.renderX - (float)var2.anInt_1827 + this.softwareRenderer.scaleX * var39 / var40);
               }

               var2.aBoolean_1828 = true;
            }
         }

         this.method7651(true);
         this.aClass202_10996.aBoolean_3475 = (var3 & 1) == 0;
         this.aClass202_10996.aBoolean_3476 = false;

         try {
            this.method7663(this.softwareRenderer.renderArray != null, this.softwareRenderer.aFloatArray_10159 != null, (var3 & 4) != 0, var23, this.aClass210_11015.aBoolean_3613 && var21 > this.aClass210_11015.aFloat_3614 || this.aClass210_11015.aBoolean_3618);
         } catch (Exception var49) {
            ;
         }

         if(this.aClass215Array_11049 != null) {
            for(i = 0; i < this.anInt_11016; ++i) {
               this.anIntArray_11074[i] = -1;
            }
         }

         this.aClass202_10996 = null;
         if(this.softwareRenderer.anInt_10187 * 367589431 > 1) {
            synchronized(this) {
               this.aBoolean_10993 = false;
               this.notifyAll();
            }
         }

      }
   }

   final boolean method7624(int var1) {
      return this.aByteArray_11033 == null?false:this.aByteArray_11033[var1] != 0;
   }

   final void method7625(boolean var1, boolean var2, boolean var3, int var4, boolean var5, boolean var6) {
      if(this.anIntArray_11032[var4] != -2) {
         short var7 = this.aShortArray_11046[var4];
         short var8 = this.aShortArray_11019[var4];
         short var9 = this.aShortArray_11068[var4];
         float xes = this.screenX[var7];
         float var11 = this.screenX[var8];
         float var12 = this.screenX[var9];
         if(!var5 || xes != -5000.0F && var11 != -5000.0F && var12 != -5000.0F) {
            float var13 = this.screenY[var7];
            float var14 = this.screenY[var8];
            float var15 = this.screenY[var9];
            if(this.anIntArray_11074[var4] != -1 || (xes - var11) * (var15 - var14) - (var13 - var14) * (var12 - var11) > 0.0F) {
               if(xes >= 0.0F && var11 >= 0.0F && var12 >= 0.0F && xes <= (float)(this.aClass210_11015.anInt_3646 * 172491353) && var11 <= (float)(this.aClass210_11015.anInt_3646 * 172491353) && var12 <= (float)(this.aClass210_11015.anInt_3646 * 172491353)) {
                  this.aClass202_10996.aBoolean_3481 = false;
               } else {
                  this.aClass202_10996.aBoolean_3481 = true;
               }

               int var16;
               if(var6) {
                  var16 = this.anIntArray_11074[var4];
                  if(var16 == -1 || !this.aClass215Array_11049[var16].aBoolean_3737) {
                     this.method7626(var1, var2, var3, var4);
                  }
               } else {
                  var16 = this.anIntArray_11074[var4];
                  if(var16 != -1) {
                     Class215 var17 = this.aClass215Array_11049[var16];
                     Class195 var18 = this.aClass195Array_11050[var16];
                     if(!var17.aBoolean_3737) {
                        this.method7658(var1, var2, var3, var4);
                     }

                     this.softwareRenderer.method6740(var1, var2, var3, var18.anInt_3384 * 1604525391, var18.anInt_3377 * -803347649, var18.aFloat_3387, var18.anInt_3385 * -228551655, var18.anInt_3386 * 1500726623, var17.aShort_3733, var18.anInt_3383 * -1861349297, var17.aByte_3732, var17.aByte_3735);
                  } else {
                     this.method7658(var1, var2, var3, var4);
                  }
               }
            }

         }
      }
   }

   final void method7626(boolean var1, boolean var2, boolean var3, int var4) {
      int var5 = -1;
      if(this.aShortArray_11010 != null && this.aShortArray_11010[var4] != -1) {
         var5 = this.softwareRenderer.aClass163_2802.method1996(this.aShortArray_11010[var4] & '\uffff', (byte)2).anInt_3146 * -534969509;
      }

      short var6;
      short var7;
      short var8;
      float var10;
      float var11;
      if(!this.aClass210_11015.aBoolean_3618) {
         var6 = this.aShortArray_11046[var4];
         var7 = this.aShortArray_11019[var4];
         var8 = this.aShortArray_11068[var4];
         ArrayViewport var9 = this.softwareRenderer.anArrayViewport_10184;
         var10 = var9.data[10];
         var11 = var9.data[14];
         float var12 = var9.data[11];
         float var13 = var9.data[15];
         float var14 = var11 * var12 - var10 * var13;
         float var15 = (this.aFloatArray_11067[var6] - this.aClass210_11015.aFloat_3620) * this.aClass210_11015.aFloat_3645;
         float var16 = (this.aFloatArray_11067[var7] - this.aClass210_11015.aFloat_3620) * this.aClass210_11015.aFloat_3645;
         float var17 = (this.aFloatArray_11067[var8] - this.aClass210_11015.aFloat_3620) * this.aClass210_11015.aFloat_3645;
         float var18 = var15 * var14 / (var15 * var12 - var10);
         float var19 = var16 * var14 / (var16 * var12 - var10);
         float var20 = var17 * var14 / (var17 * var12 - var10);
         float var21 = (var18 - this.aClass210_11015.aFloat_3614) / this.aClass210_11015.aFloat_3624;
         if(var21 > 1.0F) {
            var21 = 1.0F;
         } else if(var21 < 0.0F) {
            var21 = 0.0F;
         }

         float var22 = (var19 - this.aClass210_11015.aFloat_3614) / this.aClass210_11015.aFloat_3624;
         if(var22 > 1.0F) {
            var22 = 1.0F;
         } else if(var22 < 0.0F) {
            var22 = 0.0F;
         }

         float var23 = (var20 - this.aClass210_11015.aFloat_3614) / this.aClass210_11015.aFloat_3624;
         if(var23 > 1.0F) {
            var23 = 1.0F;
         } else if(var23 < 0.0F) {
            var23 = 0.0F;
         }

         float var24 = var21 + var22 + var23;
         if(var24 >= 3.0F) {
            return;
         }

         if(var24 <= 0.0F) {
            this.method7658(var1, var2, var3, var4);
            return;
         }

         if(this.aByteArray_11033 == null) {
            this.aClass202_10996.anInt_3509 = 0;
         } else {
            this.aClass202_10996.anInt_3509 = this.aByteArray_11033[var4] & 255;
         }

         if(var5 == -1) {
            if(this.anIntArray_11032[var4] == -1) {
               this.aClass202_10996.method2567(var1, var2, var3, this.screenY[var6], this.screenY[var7], this.screenY[var8], this.screenX[var6], this.screenX[var7], this.screenX[var8], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11067[var8], Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11059[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var21 * 255.0F, -919306229), Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11059[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var22 * 255.0F, -704884074), Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11059[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var23 * 255.0F, -303719322));
            } else {
               this.aClass202_10996.method2567(var1, var2, var3, this.screenY[var6], this.screenY[var7], this.screenY[var8], this.screenX[var6], this.screenX[var7], this.screenX[var8], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11067[var8], Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11059[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var21 * 255.0F, -400451327), Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11024[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var22 * 255.0F, -1207299408), Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11032[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var23 * 255.0F, -72309890));
            }
         } else {
            int var25 = -16777216;
            if(this.aByteArray_11033 != null) {
               var25 = 255 - (this.aByteArray_11033[var4] & 255) << 24;
            }

            if(this.anIntArray_11032[var4] == -1) {
               int var26 = var25 | this.anIntArray_11059[var4] & 16777215;
               this.aClass202_10996.method2568(var1, var2, var3, this.screenY[var6], this.screenY[var7], this.screenY[var8], this.screenX[var6], this.screenX[var7], this.screenX[var8], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11067[var8], this.aFloatArray_11062[var6], this.aFloatArray_11062[var7], this.aFloatArray_11062[var8], this.aFloatArrayArray_11021[var4][0], this.aFloatArrayArray_11021[var4][1], this.aFloatArrayArray_11021[var4][2], this.aFloatArrayArray_11022[var4][0], this.aFloatArrayArray_11022[var4][1], this.aFloatArrayArray_11022[var4][2], var26, var26, var26, this.aClass210_11015.anInt_3616 * -2058706033, var21 * 255.0F, var22 * 255.0F, var23 * 255.0F, this.aShortArray_11010[var4] & '\uffff', var5);
            } else {
               this.aClass202_10996.method2568(var1, var2, var3, this.screenY[var6], this.screenY[var7], this.screenY[var8], this.screenX[var6], this.screenX[var7], this.screenX[var8], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11067[var8], this.aFloatArray_11062[var6], this.aFloatArray_11062[var7], this.aFloatArray_11062[var8], this.aFloatArrayArray_11021[var4][0], this.aFloatArrayArray_11021[var4][1], this.aFloatArrayArray_11021[var4][2], this.aFloatArrayArray_11022[var4][0], this.aFloatArrayArray_11022[var4][1], this.aFloatArrayArray_11022[var4][2], var25 | this.anIntArray_11059[var4] & 16777215, var25 | this.anIntArray_11024[var4] & 16777215, var25 | this.anIntArray_11032[var4] & 16777215, this.aClass210_11015.anInt_3616 * -2058706033, var21 * 255.0F, var22 * 255.0F, var23 * 255.0F, this.aShortArray_11010[var4] & '\uffff', var5);
            }
         }
      } else {
         var6 = this.aShortArray_11046[var4];
         var7 = this.aShortArray_11019[var4];
         var8 = this.aShortArray_11068[var4];
         float var27 = 0.0F;
         var10 = 0.0F;
         var11 = 0.0F;
         if(this.anIntArray_11055[var6] > this.aClass210_11015.anInt_3651 * 1410296965) {
            var27 = 1.0F;
         } else if(this.anIntArray_11055[var6] > this.aClass210_11015.anInt_3611 * 1025812225) {
            var27 = (float)(this.aClass210_11015.anInt_3611 * 1025812225 - this.anIntArray_11055[var6]) * 1.0F / (float)(this.aClass210_11015.anInt_3611 * 1025812225 - this.aClass210_11015.anInt_3651 * 1410296965);
         }

         if(this.anIntArray_11055[var7] > this.aClass210_11015.anInt_3651 * 1410296965) {
            var10 = 1.0F;
         } else if(this.anIntArray_11055[var7] > this.aClass210_11015.anInt_3611 * 1025812225) {
            var10 = (float)(this.aClass210_11015.anInt_3611 * 1025812225 - this.anIntArray_11055[var7]) * 1.0F / (float)(this.aClass210_11015.anInt_3611 * 1025812225 - this.aClass210_11015.anInt_3651 * 1410296965);
         }

         if(this.anIntArray_11055[var8] > this.aClass210_11015.anInt_3651 * 1410296965) {
            var11 = 1.0F;
         } else if(this.anIntArray_11055[var8] > this.aClass210_11015.anInt_3611 * 1025812225) {
            var11 = (float)(this.aClass210_11015.anInt_3611 * 1025812225 - this.anIntArray_11055[var8]) * 1.0F / (float)(this.aClass210_11015.anInt_3611 * 1025812225 - this.aClass210_11015.anInt_3651 * 1410296965);
         }

         if(this.aByteArray_11033 == null) {
            this.aClass202_10996.anInt_3509 = 0;
         } else {
            this.aClass202_10996.anInt_3509 = this.aByteArray_11033[var4] & 255;
         }

         if(var5 == -1) {
            if(this.anIntArray_11032[var4] == -1) {
               this.aClass202_10996.method2567(var1, var2, var3, this.screenY[var6], this.screenY[var7], this.screenY[var8], this.screenX[var6], this.screenX[var7], this.screenX[var8], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11067[var8], Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11059[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var27 * 255.0F, -1762395590), Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11059[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var10 * 255.0F, 131098774), Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11059[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var11 * 255.0F, -1498572600));
            } else {
               this.aClass202_10996.method2567(var1, var2, var3, this.screenY[var6], this.screenY[var7], this.screenY[var8], this.screenX[var6], this.screenX[var7], this.screenX[var8], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11067[var8], Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11059[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var27 * 255.0F, -2021180509), Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11024[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var10 * 255.0F, -247452480), Class104_Sub20.method7394(Class561.colourMap[this.anIntArray_11032[var4] & '\uffff'], this.aClass210_11015.anInt_3616 * -2058706033, var11 * 255.0F, 50242001));
            }
         } else {
            int var28 = -16777216;
            if(this.aByteArray_11033 != null) {
               var28 = 255 - (this.aByteArray_11033[var4] & 255) << 24;
            }

            if(this.anIntArray_11032[var4] == -1) {
               int var29 = var28 | this.anIntArray_11059[var4] & 16777215;
               this.aClass202_10996.method2568(var1, var2, var3, this.screenY[var6], this.screenY[var7], this.screenY[var8], this.screenX[var6], this.screenX[var7], this.screenX[var8], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11067[var8], this.aFloatArray_11062[var6], this.aFloatArray_11062[var7], this.aFloatArray_11062[var8], this.aFloatArrayArray_11021[var4][0], this.aFloatArrayArray_11021[var4][1], this.aFloatArrayArray_11021[var4][2], this.aFloatArrayArray_11022[var4][0], this.aFloatArrayArray_11022[var4][1], this.aFloatArrayArray_11022[var4][2], var29, var29, var29, this.aClass210_11015.anInt_3616 * -2058706033, var27 * 255.0F, var10 * 255.0F, var11 * 255.0F, this.aShortArray_11010[var4] & '\uffff', var5);
            } else {
               this.aClass202_10996.method2568(var1, var2, var3, this.screenY[var6], this.screenY[var7], this.screenY[var8], this.screenX[var6], this.screenX[var7], this.screenX[var8], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11067[var8], this.aFloatArray_11062[var6], this.aFloatArray_11062[var7], this.aFloatArray_11062[var8], this.aFloatArrayArray_11021[var4][0], this.aFloatArrayArray_11021[var4][1], this.aFloatArrayArray_11021[var4][2], this.aFloatArrayArray_11022[var4][0], this.aFloatArrayArray_11022[var4][1], this.aFloatArrayArray_11022[var4][2], var28 | this.anIntArray_11059[var4] & 16777215, var28 | this.anIntArray_11024[var4] & 16777215, var28 | this.anIntArray_11032[var4] & 16777215, this.aClass210_11015.anInt_3616 * -2058706033, var27 * 255.0F, var10 * 255.0F, var11 * 255.0F, this.aShortArray_11010[var4] & '\uffff', var5);
            }
         }
      }

   }

   boolean method7627(int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      return (float)var2 < var3 && (float)var2 < var4 && (float)var2 < var5?false:((float)var2 > var3 && (float)var2 > var4 && (float)var2 > var5?false:((float)var1 < var6 && (float)var1 < var7 && (float)var1 < var8?false:(float)var1 <= var6 || (float)var1 <= var7 || (float)var1 <= var8));
   }

   void method7628() {
      if(!this.aBoolean_11005) {
         int var1 = 0;
         int var2 = 0;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = -32768;

         for(int var9 = 0; var9 < this.anInt_11009; ++var9) {
            int var10 = this.xpoints[var9];
            int var11 = this.anIntArray_11039[var9];
            int var12 = this.anIntArray_11012[var9];
            if(var10 < var3) {
               var3 = var10;
            }

            if(var10 > var6) {
               var6 = var10;
            }

            if(var11 < var4) {
               var4 = var11;
            }

            if(var11 > var7) {
               var7 = var11;
            }

            if(var12 < var5) {
               var5 = var12;
            }

            if(var12 > var8) {
               var8 = var12;
            }

            int var13 = var10 * var10 + var12 * var12;
            if(var13 > var1) {
               var1 = var13;
            }

            var13 += var11 * var11;
            if(var13 > var2) {
               var2 = var13;
            }
         }

         this.aShort_11057 = (short)var3;
         this.aShort_11058 = (short)var6;
         this.aShort_11073 = (short)var4;
         this.aShort_11013 = (short)var7;
         this.aShort_11034 = (short)var5;
         this.aShort_11060 = (short)var8;
         this.aShort_11053 = (short)((int)(Math.sqrt((double)var1) + 0.99D));
         this.aShort_11054 = (short)((int)(Math.sqrt((double)var2) + 0.99D));
         this.aBoolean_11005 = true;
      }
   }

   void method7629() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.vertexCount; ++var2) {
            this.xpoints[var2] = -this.xpoints[var2];
            this.anIntArray_11012[var2] = -this.anIntArray_11012[var2];
         }

         this.method7650();
      }
   }

   public int method2039() {
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      return this.aShort_11057;
   }

   public int method2022() {
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      return this.aShort_11058;
   }

   public int method2056() {
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      return this.aShort_11013;
   }

   public int method2065() {
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      return this.aShort_11034;
   }

   public void method2044(int var1) {
      if((this.anInt_10998 & 4096) != 4096) {
         throw new IllegalStateException();
      } else {
         this.anInt_11025 = var1;
         this.anInt_11029 = 0;
      }
   }

   public void method2028(int var1) {
      if((this.anInt_10998 & 8192) != 8192) {
         throw new IllegalStateException();
      } else {
         this.anInt_11007 = var1;
         this.anInt_11029 = 0;
      }
   }

   void method7636(boolean var1) {
      if(this.anInt_11029 == 1) {
         this.method7599();
      } else if(this.anInt_11029 == 2) {
         if((this.anInt_10998 & 618648) == 0 && this.aFloatArrayArray_11021 == null) {
            this.aShortArray_11035 = null;
         }

         if(var1) {
            this.aByteArray_11031 = null;
         }

      } else {
         this.method7645();
         int var2 = this.softwareRenderer.anInt_10192 * 351046469;
         int var3 = this.softwareRenderer.anInt_10167 * 991895723;
         int var4 = this.softwareRenderer.anInt_10188 * 547386025;
         int var5 = this.softwareRenderer.anInt_10171 * -414455413 >> 8;
         int var6 = 0;
         int var7 = 0;
         if(this.anInt_11007 != 0) {
            var6 = this.softwareRenderer.anInt_10169 * -336478464 / this.anInt_11007;
            var7 = this.softwareRenderer.anInt_10170 * 911052032 / this.anInt_11007;
         }

         if(this.anIntArray_11059 == null) {
            this.anIntArray_11059 = new int[this.anInt_11016];
            this.anIntArray_11024 = new int[this.anInt_11016];
            this.anIntArray_11032 = new int[this.anInt_11016];
         }

         for(int var8 = 0; var8 < this.anInt_11016; ++var8) {
            byte var9;
            if(this.aByteArray_11031 == null) {
               var9 = 0;
            } else {
               var9 = this.aByteArray_11031[var8];
            }

            byte var10;
            if(this.aByteArray_11033 == null) {
               var10 = 0;
            } else {
               var10 = this.aByteArray_11033[var8];
            }

            short var11;
            if(this.aShortArray_11010 == null) {
               var11 = -1;
            } else {
               var11 = this.aShortArray_11010[var8];
            }

            if(var10 == -2) {
               var9 = 3;
            }

            if(var10 == -1) {
               var9 = 2;
            }

            int var12;
            int var18;
            if(var11 == -1) {
               int var13;
               short var14;
               int var17;
               int var16;
               if(var9 == 0) {
                  var12 = this.aShortArray_11035[var8] & '\uffff';
                  var13 = (var12 & 127) * this.anInt_11025 >> 7;
                  var14 = CacheFileID.method1398(var12 & -128 | var13, 491215307);
                  Class193 var15;
                  if(this.aClass193Array_11018 != null && this.aClass193Array_11018[this.aShortArray_11046[var8]] != null) {
                     var15 = this.aClass193Array_11018[this.aShortArray_11046[var8]];
                  } else {
                     var15 = this.aClass193Array_11042[this.aShortArray_11046[var8]];
                  }

                  var16 = (var2 * var15.anInt_3354 + var3 * var15.anInt_3353 + var4 * var15.anInt_3355) / var15.anInt_3352 >> 16;
                  var17 = var16 > 256?var6:var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.anIntArray_11059[var8] = var18 << 17 | Class476.method5683(var14, var18, -1817170625);
                  if(this.aClass193Array_11018 != null && this.aClass193Array_11018[this.aShortArray_11019[var8]] != null) {
                     var15 = this.aClass193Array_11018[this.aShortArray_11019[var8]];
                  } else {
                     var15 = this.aClass193Array_11042[this.aShortArray_11019[var8]];
                  }

                  var16 = (var2 * var15.anInt_3354 + var3 * var15.anInt_3353 + var4 * var15.anInt_3355) / var15.anInt_3352 >> 16;
                  var17 = var16 > 256?var6:var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.anIntArray_11024[var8] = var18 << 17 | Class476.method5683(var14, var18, -774032941);
                  if(this.aClass193Array_11018 != null && this.aClass193Array_11018[this.aShortArray_11068[var8]] != null) {
                     var15 = this.aClass193Array_11018[this.aShortArray_11068[var8]];
                  } else {
                     var15 = this.aClass193Array_11042[this.aShortArray_11068[var8]];
                  }

                  var16 = (var2 * var15.anInt_3354 + var3 * var15.anInt_3353 + var4 * var15.anInt_3355) / var15.anInt_3352 >> 16;
                  var17 = var16 > 256?var6:var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.anIntArray_11032[var8] = var18 << 17 | Class476.method5683(var14, var18, -1388312925);
               } else if(var9 == 1) {
                  var12 = this.aShortArray_11035[var8] & '\uffff';
                  var13 = (var12 & 127) * this.anInt_11025 >> 7;
                  var14 = CacheFileID.method1398(var12 & -128 | var13, 1894655401);
                  Class201 var22 = this.aClass201Array_11030[var8];
                  var18 = var2 * var22.anInt_3463 + var3 * var22.anInt_3464 + var4 * var22.anInt_3465 >> 16;
                  var16 = var18 > 256?var6:var7;
                  var17 = (var5 >> 1) + (var16 * var18 >> 17);
                  this.anIntArray_11059[var8] = var17 << 17 | Class476.method5683(var14, var17, -1534246859);
                  this.anIntArray_11032[var8] = -1;
               } else if(var9 == 3) {
                  this.anIntArray_11059[var8] = 128;
                  this.anIntArray_11032[var8] = -1;
               } else {
                  this.anIntArray_11032[var8] = -2;
               }
            } else {
               var12 = this.aShortArray_11035[var8] & '\uffff';
               int var20;
               int var23;
               if(var9 == 0) {
                  Class193 var19;
                  if(this.aClass193Array_11018 != null && this.aClass193Array_11018[this.aShortArray_11046[var8]] != null) {
                     var19 = this.aClass193Array_11018[this.aShortArray_11046[var8]];
                  } else {
                     var19 = this.aClass193Array_11042[this.aShortArray_11046[var8]];
                  }

                  var23 = (var2 * var19.anInt_3354 + var3 * var19.anInt_3353 + var4 * var19.anInt_3355) / var19.anInt_3352 >> 16;
                  var18 = var23 > 256?var6:var7;
                  var20 = this.method7598((var5 >> 2) + (var18 * var23 >> 18));
                  this.anIntArray_11059[var8] = var20 << 24 | this.method7597(var12, var11, var20);
                  if(this.aClass193Array_11018 != null && this.aClass193Array_11018[this.aShortArray_11019[var8]] != null) {
                     var19 = this.aClass193Array_11018[this.aShortArray_11019[var8]];
                  } else {
                     var19 = this.aClass193Array_11042[this.aShortArray_11019[var8]];
                  }

                  var23 = (var2 * var19.anInt_3354 + var3 * var19.anInt_3353 + var4 * var19.anInt_3355) / var19.anInt_3352 >> 16;
                  var18 = var23 > 256?var6:var7;
                  var20 = this.method7598((var5 >> 2) + (var18 * var23 >> 18));
                  this.anIntArray_11024[var8] = var20 << 24 | this.method7597(var12, var11, var20);
                  if(this.aClass193Array_11018 != null && this.aClass193Array_11018[this.aShortArray_11068[var8]] != null) {
                     var19 = this.aClass193Array_11018[this.aShortArray_11068[var8]];
                  } else {
                     var19 = this.aClass193Array_11042[this.aShortArray_11068[var8]];
                  }

                  var23 = (var2 * var19.anInt_3354 + var3 * var19.anInt_3353 + var4 * var19.anInt_3355) / var19.anInt_3352 >> 16;
                  var18 = var23 > 256?var6:var7;
                  var20 = this.method7598((var5 >> 2) + (var18 * var23 >> 18));
                  this.anIntArray_11032[var8] = var20 << 24 | this.method7597(var12, var11, var20);
               } else if(var9 == 1) {
                  Class201 var21 = this.aClass201Array_11030[var8];
                  var20 = var2 * var21.anInt_3463 + var3 * var21.anInt_3464 + var4 * var21.anInt_3465 >> 16;
                  var23 = var20 > 256?var6:var7;
                  var18 = this.method7598((var5 >> 2) + (var23 * var20 >> 18));
                  this.anIntArray_11059[var8] = var18 << 24 | this.method7597(var12, var11, var18);
                  this.anIntArray_11032[var8] = -1;
               } else {
                  this.anIntArray_11032[var8] = -2;
               }
            }
         }

         this.aClass193Array_11042 = null;
         this.aClass193Array_11018 = null;
         this.aClass201Array_11030 = null;
         if((this.anInt_10998 & 618648) == 0 && this.aFloatArrayArray_11021 == null) {
            this.aShortArray_11035 = null;
         }

         if(var1) {
            this.aByteArray_11031 = null;
         }

         this.anInt_11029 = 2;
      }
   }

   public byte[] method2048() {
      return this.aByteArray_11033;
   }

   public void rotateX(int var1) {
      if((this.anInt_10998 & 3) != 3) {
         throw new IllegalStateException();
      } else {
         int var2 = Class362.cosArray[var1];
         int var3 = Class362.sinArray[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.vertexCount; ++var5) {
               int var6 = this.anIntArray_11039[var5] * var2 + this.xpoints[var5] * var3 >> 14;
               this.anIntArray_11039[var5] = this.anIntArray_11039[var5] * var3 - this.xpoints[var5] * var2 >> 14;
               this.xpoints[var5] = var6;
            }

            this.method7650();
         }
      }
   }

   public void method2035(short var1, short var2) {
      if(this.aShortArray_11010 != null) {
         if(!this.aBoolean_10994 && var2 >= 0) {
            Class183 var3 = this.softwareRenderer.aClass163_2802.method1996(var2 & '\uffff', (byte)2);
            if(var3.aByte_3145 != 0 || var3.aByte_3157 != 0) {
               this.aBoolean_10994 = true;
            }
         }

         for(int var4 = 0; var4 < this.anInt_11016; ++var4) {
            if(this.aShortArray_11010[var4] == var1) {
               this.aShortArray_11010[var4] = var2;
            }
         }

      }
   }

   public void method2049(int var1, int var2, int var3, int var4) {
      if((this.anInt_10998 & 524288) != 524288) {
         throw new IllegalStateException();
      } else {
         int var5;
         for(var5 = 0; var5 < this.anInt_11016; ++var5) {
            int var6 = this.aShortArray_11035[var5] & '\uffff';
            int var7 = var6 >> 10 & 63;
            int var8 = var6 >> 7 & 7;
            int var9 = var6 & 127;
            if(var1 != -1) {
               var7 += (var1 - var7) * var4 >> 7;
            }

            if(var2 != -1) {
               var8 += (var2 - var8) * var4 >> 7;
            }

            if(var3 != -1) {
               var9 += (var3 - var9) * var4 >> 7;
            }

            this.aShortArray_11035[var5] = (short)(var7 << 10 | var8 << 7 | var9);
         }

         if(this.aClass215Array_11049 != null) {
            for(var5 = 0; var5 < this.anInt_11048; ++var5) {
               Class215 var10 = this.aClass215Array_11049[var5];
               Class195 var11 = this.aClass195Array_11050[var5];
               var11.anInt_3383 = (var11.anInt_3383 * -1861349297 & -16777216 | Class561.colourMap[CacheFileID.method1398(this.aShortArray_11035[var10.anInt_3736 * -1304911815] & '\uffff', 109372135) & '\uffff'] & 16777215) * -1817246033;
            }
         }

         if(this.anInt_11029 == 2) {
            this.anInt_11029 = 1;
         }

      }
   }

   public Class86[] method2059() {
      return this.aClass86Array_11004;
   }

   public int method2046() {
      return this.anInt_11025;
   }

   public boolean method2058() {
      return this.aBoolean_11061;
   }

   public boolean method2051() {
      return this.aBoolean_10994;
   }

   void method7645() {
      if(this.anInt_11029 == 0 && this.aClass193Array_11042 == null) {
         if(this.softwareRenderer.anInt_10187 * 367589431 > 1) {
            synchronized(this) {
               this.method7596();
            }
         } else {
            this.method7596();
         }

      }
   }

   Class165_Sub3(SoftwareRenderer var1) {
      this.softwareRenderer = var1;
   }

   void method7646() {
      synchronized(this) {
         int var2;
         int var3;
         for(var2 = 0; var2 < this.anInt_11009; ++var2) {
            var3 = this.xpoints[var2];
            this.xpoints[var2] = this.anIntArray_11012[var2];
            this.anIntArray_11012[var2] = -var3;
            if(this.aClass193Array_11042[var2] != null) {
               var3 = this.aClass193Array_11042[var2].anInt_3354;
               this.aClass193Array_11042[var2].anInt_3354 = this.aClass193Array_11042[var2].anInt_3355;
               this.aClass193Array_11042[var2].anInt_3355 = -var3;
            }
         }

         if(this.aClass201Array_11030 != null) {
            for(var2 = 0; var2 < this.anInt_11016; ++var2) {
               if(this.aClass201Array_11030[var2] != null) {
                  var3 = this.aClass201Array_11030[var2].anInt_3463;
                  this.aClass201Array_11030[var2].anInt_3463 = this.aClass201Array_11030[var2].anInt_3465;
                  this.aClass201Array_11030[var2].anInt_3465 = -var3;
               }
            }
         }

         for(var2 = this.anInt_11009; var2 < this.vertexCount; ++var2) {
            var3 = this.xpoints[var2];
            this.xpoints[var2] = this.anIntArray_11012[var2];
            this.anIntArray_11012[var2] = -var3;
         }

         this.anInt_11029 = 0;
         this.aBoolean_11005 = false;
      }
   }

   public Class240_Sub22_Sub7 method2054(Class240_Sub22_Sub7 var1) {
      return null;
   }

   public Class172[] method2040() {
      return this.aClass172Array_11047;
   }

   public boolean method2050(int var1, int var2, Viewport var3, boolean var4, int var5) {
      this.method7667(this.softwareRenderer.method6787(Thread.currentThread()));
      ArrayViewport var6 = this.aClass210_11015.anArrayViewport_3626;
      var6.setViewport(var3);
      ArrayViewport var7 = this.aClass210_11015.anArrayViewport_3627;
      var7.replaceWith(var6);
      var7.method4580(this.softwareRenderer.renderData);
      boolean var8 = false;
      int var9 = Integer.MAX_VALUE;
      int var10 = Integer.MIN_VALUE;
      int var11 = Integer.MAX_VALUE;
      int var12 = Integer.MIN_VALUE;
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      int var13 = this.aShort_11058 - this.aShort_11057 >> 1;
      int var14 = this.aShort_11013 - this.aShort_11073 >> 1;
      int var15 = this.aShort_11060 - this.aShort_11034 >> 1;
      int var16 = this.aShort_11057 + var13;
      int var17 = this.aShort_11073 + var14;
      int var18 = this.aShort_11034 + var15;
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var18 - (var15 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      int var24 = var18 + (var15 << var5);
      this.anIntArray_11028[0] = var19;
      this.anIntArray_11070[0] = var20;
      this.anIntArray_11071[0] = var21;
      this.anIntArray_11028[1] = var22;
      this.anIntArray_11070[1] = var20;
      this.anIntArray_11071[1] = var21;
      this.anIntArray_11028[2] = var19;
      this.anIntArray_11070[2] = var23;
      this.anIntArray_11071[2] = var21;
      this.anIntArray_11028[3] = var22;
      this.anIntArray_11070[3] = var23;
      this.anIntArray_11071[3] = var21;
      this.anIntArray_11028[4] = var19;
      this.anIntArray_11070[4] = var20;
      this.anIntArray_11071[4] = var24;
      this.anIntArray_11028[5] = var22;
      this.anIntArray_11070[5] = var20;
      this.anIntArray_11071[5] = var24;
      this.anIntArray_11028[6] = var19;
      this.anIntArray_11070[6] = var23;
      this.anIntArray_11071[6] = var24;
      this.anIntArray_11028[7] = var22;
      this.anIntArray_11070[7] = var23;
      this.anIntArray_11071[7] = var24;

      int var25;
      int var27;
      int var26;
      float var29;
      int var28;
      float var31;
      float var30;
      float var32;
      for(var25 = 0; var25 < 8; ++var25) {
         var26 = this.anIntArray_11028[var25];
         var27 = this.anIntArray_11070[var25];
         var28 = this.anIntArray_11071[var25];
         var29 = var7.data[2] * (float)var26 + var7.data[6] * (float)var27 + var7.data[10] * (float)var28 + var7.data[14];
         var30 = var7.data[3] * (float)var26 + var7.data[7] * (float)var27 + var7.data[11] * (float)var28 + var7.data[15];
         if(var29 >= -var30) {
            var31 = var7.data[0] * (float)var26 + var7.data[4] * (float)var27 + var7.data[8] * (float)var28 + var7.data[12];
            var32 = var7.data[1] * (float)var26 + var7.data[5] * (float)var27 + var7.data[9] * (float)var28 + var7.data[13];
            int var33 = (int)(this.softwareRenderer.renderX + this.softwareRenderer.scaleX * var31 / var30);
            int var34 = (int)(this.softwareRenderer.renderY + this.softwareRenderer.scaleY * var32 / var30);
            if(var33 < var9) {
               var9 = var33;
            }

            if(var33 > var10) {
               var10 = var33;
            }

            if(var34 < var11) {
               var11 = var34;
            }

            if(var34 > var12) {
               var12 = var34;
            }

            var8 = true;
         }
      }

      if(var8 && var1 > var9 && var1 < var10 && var2 > var11 && var2 < var12) {
         if(var4) {
            return true;
         }

         for(var25 = 0; var25 < this.vertexCount; ++var25) {
            var26 = this.xpoints[var25];
            var27 = this.anIntArray_11039[var25];
            var28 = this.anIntArray_11012[var25];
            var29 = var7.data[2] * (float)var26 + var7.data[6] * (float)var27 + var7.data[10] * (float)var28 + var7.data[14];
            var30 = var7.data[3] * (float)var26 + var7.data[7] * (float)var27 + var7.data[11] * (float)var28 + var7.data[15];
            if(var29 >= -var30) {
               var31 = var7.data[0] * (float)var26 + var7.data[4] * (float)var27 + var7.data[8] * (float)var28 + var7.data[12];
               var32 = var7.data[1] * (float)var26 + var7.data[5] * (float)var27 + var7.data[9] * (float)var28 + var7.data[13];
           
               this.screenX[var25] = (float)((int)(this.softwareRenderer.renderX + this.softwareRenderer.scaleX * var31 / var30));
               this.screenY[var25] = (float)((int)(this.softwareRenderer.renderY + this.softwareRenderer.scaleY * var32 / var30));
            } else {
               this.screenX[var25] = -999999.0F;
            }
         }

         for(var25 = 0; var25 < this.anInt_11017; ++var25) {
            if(this.screenX[this.aShortArray_11046[var25]] != -999999.0F && this.screenX[this.aShortArray_11019[var25]] != -999999.0F && this.screenX[this.aShortArray_11068[var25]] != -999999.0F && this.method7627(var1, var2, this.screenY[this.aShortArray_11046[var25]], this.screenY[this.aShortArray_11019[var25]], this.screenY[this.aShortArray_11068[var25]], this.screenX[this.aShortArray_11046[var25]], this.screenX[this.aShortArray_11019[var25]], this.screenX[this.aShortArray_11068[var25]])) {
               return true;
            }
         }
      }

      return false;
   }

   void method7650() {
      this.aClass193Array_11042 = null;
      this.aClass193Array_11018 = null;
      this.aClass201Array_11030 = null;
      this.aBoolean_11005 = false;
   }

   void method7651(boolean var1) {
      if(this.softwareRenderer.anInt_10187 * 367589431 > 1) {
         synchronized(this) {
            this.method7636(var1);
         }
      } else {
         this.method7636(var1);
      }

   }

   public void method2012(int var1, int var2, int var3) {
      if(var1 != 128 && (this.anInt_10998 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 128 && (this.anInt_10998 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 128 && (this.anInt_10998 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.vertexCount; ++var5) {
               this.xpoints[var5] = this.xpoints[var5] * var1 >> 7;
               this.anIntArray_11039[var5] = this.anIntArray_11039[var5] * var2 >> 7;
               this.anIntArray_11012[var5] = this.anIntArray_11012[var5] * var3 >> 7;
            }

            this.aBoolean_11005 = false;
         }
      }
   }

   public void method2052(Viewport var1) {
      this.method7667(this.softwareRenderer.method6787(Thread.currentThread()));
      ArrayViewport var2 = this.aClass210_11015.anArrayViewport_3626;
      var2.setViewport(var1);
      int var3;
      if(this.aClass86Array_11004 != null) {
         for(var3 = 0; var3 < this.aClass86Array_11004.length; ++var3) {
            Class86 var4 = this.aClass86Array_11004[var3];
            Class86 var5 = var4;
            if(var4.aClass86_1742 != null) {
               var5 = var4.aClass86_1742;
            }

            var5.anInt_1747 = (int)(var2.data[12] + var2.data[0] * (float)this.xpoints[var4.anInt_1740 * -146104779] + var2.data[4] * (float)this.anIntArray_11039[var4.anInt_1740 * -146104779] + var2.data[8] * (float)this.anIntArray_11012[var4.anInt_1740 * -146104779]) * 346431023;
            var5.anInt_1741 = (int)(var2.data[13] + var2.data[1] * (float)this.xpoints[var4.anInt_1740 * -146104779] + var2.data[5] * (float)this.anIntArray_11039[var4.anInt_1740 * -146104779] + var2.data[9] * (float)this.anIntArray_11012[var4.anInt_1740 * -146104779]) * -1274764179;
            var5.anInt_1749 = (int)(var2.data[14] + var2.data[2] * (float)this.xpoints[var4.anInt_1740 * -146104779] + var2.data[6] * (float)this.anIntArray_11039[var4.anInt_1740 * -146104779] + var2.data[10] * (float)this.anIntArray_11012[var4.anInt_1740 * -146104779]) * 1829222211;
            var5.anInt_1750 = (int)(var2.data[12] + var2.data[0] * (float)this.xpoints[var4.anInt_1744 * -1747600183] + var2.data[4] * (float)this.anIntArray_11039[var4.anInt_1744 * -1747600183] + var2.data[8] * (float)this.anIntArray_11012[var4.anInt_1744 * -1747600183]) * 203218289;
            var5.anInt_1751 = (int)(var2.data[13] + var2.data[1] * (float)this.xpoints[var4.anInt_1744 * -1747600183] + var2.data[5] * (float)this.anIntArray_11039[var4.anInt_1744 * -1747600183] + var2.data[9] * (float)this.anIntArray_11012[var4.anInt_1744 * -1747600183]) * -91675159;
            var5.anInt_1752 = (int)(var2.data[14] + var2.data[2] * (float)this.xpoints[var4.anInt_1744 * -1747600183] + var2.data[6] * (float)this.anIntArray_11039[var4.anInt_1744 * -1747600183] + var2.data[10] * (float)this.anIntArray_11012[var4.anInt_1744 * -1747600183]) * -396351427;
            var5.anInt_1753 = (int)(var2.data[12] + var2.data[0] * (float)this.xpoints[var4.anInt_1745 * -2092357753] + var2.data[4] * (float)this.anIntArray_11039[var4.anInt_1745 * -2092357753] + var2.data[8] * (float)this.anIntArray_11012[var4.anInt_1745 * -2092357753]) * -527219251;
            var5.anInt_1743 = (int)(var2.data[13] + var2.data[1] * (float)this.xpoints[var4.anInt_1745 * -2092357753] + var2.data[5] * (float)this.anIntArray_11039[var4.anInt_1745 * -2092357753] + var2.data[9] * (float)this.anIntArray_11012[var4.anInt_1745 * -2092357753]) * -807730159;
            var5.anInt_1748 = (int)(var2.data[14] + var2.data[2] * (float)this.xpoints[var4.anInt_1745 * -2092357753] + var2.data[6] * (float)this.anIntArray_11039[var4.anInt_1745 * -2092357753] + var2.data[10] * (float)this.anIntArray_11012[var4.anInt_1745 * -2092357753]) * -277851451;
         }
      }

      if(this.aClass172Array_11047 != null) {
         for(var3 = 0; var3 < this.aClass172Array_11047.length; ++var3) {
            Class172 var6 = this.aClass172Array_11047[var3];
            Class172 var7 = var6;
            if(var6.aClass172_3035 != null) {
               var7 = var6.aClass172_3035;
            }

            if(var6.anArrayViewport_3038 != null) {
               var6.anArrayViewport_3038.replaceWith(var2);
            } else {
               var6.anArrayViewport_3038 = new ArrayViewport(var2);
            }

            var7.anInt_3034 = (int)(var2.data[12] + var2.data[0] * (float)this.xpoints[var6.anInt_3036 * 1218049443] + var2.data[4] * (float)this.anIntArray_11039[var6.anInt_3036 * 1218049443] + var2.data[8] * (float)this.anIntArray_11012[var6.anInt_3036 * 1218049443]) * -2049585273;
            var7.anInt_3039 = (int)(var2.data[13] + var2.data[1] * (float)this.xpoints[var6.anInt_3036 * 1218049443] + var2.data[5] * (float)this.anIntArray_11039[var6.anInt_3036 * 1218049443] + var2.data[9] * (float)this.anIntArray_11012[var6.anInt_3036 * 1218049443]) * -701126557;
            var7.anInt_3037 = (int)(var2.data[14] + var2.data[2] * (float)this.xpoints[var6.anInt_3036 * 1218049443] + var2.data[6] * (float)this.anIntArray_11039[var6.anInt_3036 * 1218049443] + var2.data[10] * (float)this.anIntArray_11012[var6.anInt_3036 * 1218049443]) * 93477565;
         }
      }

   }

   final boolean method7654(int var1) {
      return this.anIntArray_11074 == null?false:this.anIntArray_11074[var1] != -1;
   }

   public int method2041() {
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      return this.aShort_11073;
   }

   void method2032(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var20;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBoolean_11041) {
            for(var9 = 0; var9 < this.vertexCount; ++var9) {
               this.xpoints[var9] <<= 4;
               this.anIntArray_11039[var9] <<= 4;
               this.anIntArray_11012[var9] <<= 4;
            }

            this.aBoolean_11041 = true;
         }

         var9 = 0;
         this.anInt_11069 = 0;
         this.anInt_11052 = 0;
         this.anInt_11044 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var21 = var2[var10];
            if(var21 < this.anIntArrayArray_11038.length) {
               int[] var22 = this.anIntArrayArray_11038[var21];

               for(var20 = 0; var20 < var22.length; ++var20) {
                  var14 = var22[var20];
                  this.anInt_11069 += this.xpoints[var14];
                  this.anInt_11052 += this.anIntArray_11039[var14];
                  this.anInt_11044 += this.anIntArray_11012[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt_11069 = this.anInt_11069 / var9 + var3;
            this.anInt_11052 = this.anInt_11052 / var9 + var4;
            this.anInt_11044 = this.anInt_11044 / var9 + var5;
         } else {
            this.anInt_11069 = var3;
            this.anInt_11052 = var4;
            this.anInt_11044 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBoolean_11041) {
               for(var9 = 0; var9 < this.vertexCount; ++var9) {
                  this.xpoints[var9] <<= 4;
                  this.anIntArray_11039[var9] <<= 4;
                  this.anIntArray_11012[var9] <<= 4;
               }

               this.aBoolean_11041 = true;
            }

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray_11038.length) {
                  var11 = this.anIntArrayArray_11038[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var20 = var11[var12];
                     this.xpoints[var20] += var3;
                     this.anIntArray_11039[var20] += var4;
                     this.anIntArray_11012[var20] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray_11038.length) {
                     var11 = this.anIntArrayArray_11038[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.xpoints[var20] -= this.anInt_11069;
                           this.anIntArray_11039[var20] -= this.anInt_11052;
                           this.anIntArray_11012[var20] -= this.anInt_11044;
                           if(var5 != 0) {
                              var14 = Class362.cosArray[var5];
                              var15 = Class362.sinArray[var5];
                              var16 = this.anIntArray_11039[var20] * var14 + this.xpoints[var20] * var15 + 16383 >> 14;
                              this.anIntArray_11039[var20] = this.anIntArray_11039[var20] * var15 - this.xpoints[var20] * var14 + 16383 >> 14;
                              this.xpoints[var20] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class362.cosArray[var3];
                              var15 = Class362.sinArray[var3];
                              var16 = this.anIntArray_11039[var20] * var15 - this.anIntArray_11012[var20] * var14 + 16383 >> 14;
                              this.anIntArray_11012[var20] = this.anIntArray_11039[var20] * var14 + this.anIntArray_11012[var20] * var15 + 16383 >> 14;
                              this.anIntArray_11039[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class362.cosArray[var4];
                              var15 = Class362.sinArray[var4];
                              var16 = this.anIntArray_11012[var20] * var14 + this.xpoints[var20] * var15 + 16383 >> 14;
                              this.anIntArray_11012[var20] = this.anIntArray_11012[var20] * var15 - this.xpoints[var20] * var14 + 16383 >> 14;
                              this.xpoints[var20] = var16;
                           }

                           this.xpoints[var20] += this.anInt_11069;
                           this.anIntArray_11039[var20] += this.anInt_11052;
                           this.anIntArray_11012[var20] += this.anInt_11044;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.xpoints[var20] -= this.anInt_11069;
                           this.anIntArray_11039[var20] -= this.anInt_11052;
                           this.anIntArray_11012[var20] -= this.anInt_11044;
                           if(var3 != 0) {
                              var14 = Class362.cosArray[var3];
                              var15 = Class362.sinArray[var3];
                              var16 = this.anIntArray_11039[var20] * var15 - this.anIntArray_11012[var20] * var14 + 16383 >> 14;
                              this.anIntArray_11012[var20] = this.anIntArray_11039[var20] * var14 + this.anIntArray_11012[var20] * var15 + 16383 >> 14;
                              this.anIntArray_11039[var20] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class362.cosArray[var5];
                              var15 = Class362.sinArray[var5];
                              var16 = this.anIntArray_11039[var20] * var14 + this.xpoints[var20] * var15 + 16383 >> 14;
                              this.anIntArray_11039[var20] = this.anIntArray_11039[var20] * var15 - this.xpoints[var20] * var14 + 16383 >> 14;
                              this.xpoints[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class362.cosArray[var4];
                              var15 = Class362.sinArray[var4];
                              var16 = this.anIntArray_11012[var20] * var14 + this.xpoints[var20] * var15 + 16383 >> 14;
                              this.anIntArray_11012[var20] = this.anIntArray_11012[var20] * var15 - this.xpoints[var20] * var14 + 16383 >> 14;
                              this.xpoints[var20] = var16;
                           }

                           this.xpoints[var20] += this.anInt_11069;
                           this.anIntArray_11039[var20] += this.anInt_11052;
                           this.anIntArray_11012[var20] += this.anInt_11044;
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray_11038.length) {
                     var11 = this.anIntArrayArray_11038[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var20 = var11[var12];
                        this.xpoints[var20] -= this.anInt_11069;
                        this.anIntArray_11039[var20] -= this.anInt_11052;
                        this.anIntArray_11012[var20] -= this.anInt_11044;
                        this.xpoints[var20] = this.xpoints[var20] * var3 / 128;
                        this.anIntArray_11039[var20] = this.anIntArray_11039[var20] * var4 / 128;
                        this.anIntArray_11012[var20] = this.anIntArray_11012[var20] * var5 / 128;
                        this.xpoints[var20] += this.anInt_11069;
                        this.anIntArray_11039[var20] += this.anInt_11052;
                        this.anIntArray_11012[var20] += this.anInt_11044;
                     }
                  }
               }

            } else {
               Class195 var19;
               Class215 var18;
               if(var1 == 5) {
                  if(this.anIntArrayArray_11023 != null && this.aByteArray_11033 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray_11023.length) {
                           var11 = this.anIntArrayArray_11023[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = (this.aByteArray_11033[var20] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray_11033[var20] = (byte)var14;
                           }
                        }
                     }

                     if(this.aClass215Array_11049 != null) {
                        for(var9 = 0; var9 < this.anInt_11048; ++var9) {
                           var18 = this.aClass215Array_11049[var9];
                           var19 = this.aClass195Array_11050[var9];
                           var19.anInt_3383 = (var19.anInt_3383 * -1861349297 & 16777215 | 255 - (this.aByteArray_11033[var18.anInt_3736 * -1304911815] & 255) << 24) * -1817246033;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray_11023 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray_11023.length) {
                           var11 = this.anIntArrayArray_11023[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = this.aShortArray_11035[var20] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              int var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray_11035[var20] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           this.aBoolean_11008 = true;
                        }
                     }

                     if(this.aClass215Array_11049 != null) {
                        for(var9 = 0; var9 < this.anInt_11048; ++var9) {
                           var18 = this.aClass215Array_11049[var9];
                           var19 = this.aClass195Array_11050[var9];
                           var19.anInt_3383 = (var19.anInt_3383 * -1861349297 & -16777216 | Class561.colourMap[CacheFileID.method1398(this.aShortArray_11035[var18.anInt_3736 * -1304911815] & '\uffff', -1449028914) & '\uffff'] & 16777215) * -1817246033;
                        }
                     }
                  }

               } else {
                  Class195 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray_11051 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_11051.length) {
                              var11 = this.anIntArrayArray_11051[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass195Array_11050[var11[var12]];
                                 var13.anInt_3380 += var3 * 18457649;
                                 var13.anInt_3381 += var4 * 950273417;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray_11051 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_11051.length) {
                              var11 = this.anIntArrayArray_11051[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass195Array_11050[var11[var12]];
                                 var13.aFloat_3378 = var13.aFloat_3378 * (float)var3 / 128.0F;
                                 var13.aFloat_3379 = var13.aFloat_3379 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray_11051 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_11051.length) {
                              var11 = this.anIntArrayArray_11051[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass195Array_11050[var11[var12]];
                                 var13.anInt_3382 = (var13.anInt_3382 * 1653768383 + var3 & 16383) * 943779647;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   public void method2030(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt_11016; ++var3) {
         if(this.aShortArray_11035[var3] == var1) {
            this.aShortArray_11035[var3] = var2;
         }
      }

      if(this.aClass215Array_11049 != null) {
         for(var3 = 0; var3 < this.anInt_11048; ++var3) {
            Class215 var4 = this.aClass215Array_11049[var3];
            Class195 var5 = this.aClass195Array_11050[var3];
            var5.anInt_3383 = (var5.anInt_3383 * -1861349297 & -16777216 | Class561.colourMap[CacheFileID.method1398(this.aShortArray_11035[var4.anInt_3736 * -1304911815], -495538746) & '\uffff'] & 16777215) * -1817246033;
         }
      }

      if(this.anInt_11029 == 2) {
         this.anInt_11029 = 1;
      }

   }

   final void method7658(boolean var1, boolean var2, boolean var3, int var4) {
      short var5 = this.aShortArray_11046[var4];
      short var6 = this.aShortArray_11019[var4];
      short var7 = this.aShortArray_11068[var4];
      int var8 = -1;
      if(this.aShortArray_11010 != null && this.aShortArray_11010[var4] != -1) {
         var8 = this.softwareRenderer.aClass163_2802.method1996(this.aShortArray_11010[var4] & '\uffff', (byte)2).anInt_3146 * -534969509;
      }

      if(var8 == -1) {
         if(this.aByteArray_11033 == null) {
            this.aClass202_10996.anInt_3509 = 0;
         } else {
            this.aClass202_10996.anInt_3509 = this.aByteArray_11033[var4] & 255;
         }

         if(this.anIntArray_11032[var4] == -1) {
            this.aClass202_10996.method2562(var1, var2, var3, this.screenY[var5], this.screenY[var6], this.screenY[var7], this.screenX[var5], this.screenX[var6], this.screenX[var7], this.aFloatArray_11067[var5], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], Class561.colourMap[this.anIntArray_11059[var4] & '\uffff']);
         } else {
            this.aClass202_10996.method2561(var1, var2, var3, this.screenY[var5], this.screenY[var6], this.screenY[var7], this.screenX[var5], this.screenX[var6], this.screenX[var7], this.aFloatArray_11067[var5], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], (float)(this.anIntArray_11059[var4] & '\uffff'), (float)(this.anIntArray_11024[var4] & '\uffff'), (float)(this.anIntArray_11032[var4] & '\uffff'));
         }
      } else {
         int var9 = -16777216;
         if(this.aByteArray_11033 != null) {
            var9 = 255 - (this.aByteArray_11033[var4] & 255) << 24;
         }

         if(this.anIntArray_11032[var4] == -1) {
            int var10 = var9 | this.anIntArray_11059[var4] & 16777215;
            this.aClass202_10996.method2568(var1, var2, var3, this.screenY[var5], this.screenY[var6], this.screenY[var7], this.screenX[var5], this.screenX[var6], this.screenX[var7], this.aFloatArray_11067[var5], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11062[var5], this.aFloatArray_11062[var6], this.aFloatArray_11062[var7], this.aFloatArrayArray_11021[var4][0], this.aFloatArrayArray_11021[var4][1], this.aFloatArrayArray_11021[var4][2], this.aFloatArrayArray_11022[var4][0], this.aFloatArrayArray_11022[var4][1], this.aFloatArrayArray_11022[var4][2], var10, var10, var10, this.aClass210_11015.anInt_3616 * -2058706033, 0.0F, 0.0F, 0.0F, this.aShortArray_11010[var4] & '\uffff', var8);
         } else {
            this.aClass202_10996.method2568(var1, var2, var3, this.screenY[var5], this.screenY[var6], this.screenY[var7], this.screenX[var5], this.screenX[var6], this.screenX[var7], this.aFloatArray_11067[var5], this.aFloatArray_11067[var6], this.aFloatArray_11067[var7], this.aFloatArray_11062[var5], this.aFloatArray_11062[var6], this.aFloatArray_11062[var7], this.aFloatArrayArray_11021[var4][0], this.aFloatArrayArray_11021[var4][1], this.aFloatArrayArray_11021[var4][2], this.aFloatArrayArray_11022[var4][0], this.aFloatArrayArray_11022[var4][1], this.aFloatArrayArray_11022[var4][2], var9 | this.anIntArray_11059[var4] & 16777215, var9 | this.anIntArray_11024[var4] & 16777215, var9 | this.anIntArray_11032[var4] & 16777215, this.aClass210_11015.anInt_3616 * -2058706033, 0.0F, 0.0F, 0.0F, this.aShortArray_11010[var4] & '\uffff', var8);
         }
      }

   }

   public int method2043() {
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      return this.aShort_11060;
   }

   public Model copy(byte var1, int var2, boolean var3) {
      this.method7594(Thread.currentThread());
      boolean var4 = false;
      Class165_Sub3 var5;
      Class165_Sub3 var6;
      if(var1 > 0 && var1 <= 7) {
         var5 = this.aClass165_Sub3Array_11056[var1 - 1];
         var6 = this.aClass165_Sub3Array_11075[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class165_Sub3(this.softwareRenderer);
      }

      return this.method7662(var6, var5, var2, var4, var3);
   }

   public int method2038() {
      if(!this.aBoolean_11005) {
         this.method7628();
      }

      return this.aShort_11054;
   }

   Model method7662(Class165_Sub3 var1, Class165_Sub3 var2, int var3, boolean var4, boolean var5) {
      var1.aBoolean_11005 = this.aBoolean_11005;
      if(this.aBoolean_11005) {
         var1.aShort_11058 = this.aShort_11058;
         var1.aShort_11013 = this.aShort_11013;
         var1.aShort_11060 = this.aShort_11060;
         var1.aShort_11057 = this.aShort_11057;
         var1.aShort_11073 = this.aShort_11073;
         var1.aShort_11034 = this.aShort_11034;
         var1.aShort_11053 = this.aShort_11053;
         var1.aShort_11054 = this.aShort_11054;
      }

      var1.anInt_11025 = this.anInt_11025;
      var1.anInt_11007 = this.anInt_11007;
      var1.vertexCount = this.vertexCount;
      var1.anInt_11009 = this.anInt_11009;
      var1.anInt_11016 = this.anInt_11016;
      var1.anInt_11048 = this.anInt_11048;
      var1.anInt_11017 = this.anInt_11017;
      if((var3 & 256) != 0) {
         var1.aBoolean_11061 = true;
      } else {
         var1.aBoolean_11061 = this.aBoolean_11061;
      }

      var1.aBoolean_10994 = this.aBoolean_10994;
      boolean var6 = (var3 & 7) == 7 | (var3 & 32) != 0;
      boolean var7 = var6 || (var3 & 1) != 0;
      boolean var8 = var6 || (var3 & 2) != 0;
      boolean var9 = var6 || (var3 & 4) != 0 || (var3 & 16) != 0;
      int var10;
      if(!var7 && !var8 && !var9) {
         var1.xpoints = this.xpoints;
         var1.anIntArray_11039 = this.anIntArray_11039;
         var1.anIntArray_11012 = this.anIntArray_11012;
      } else {
         if(var7) {
            if(var2.xpoints != null && var2.xpoints.length >= this.vertexCount) {
               var1.xpoints = var2.xpoints;
            } else {
               var1.xpoints = var2.xpoints = new int[this.vertexCount];
            }

            for(var10 = 0; var10 < this.vertexCount; ++var10) {
               var1.xpoints[var10] = this.xpoints[var10];
            }
         } else {
            var1.xpoints = this.xpoints;
         }

         if(var8) {
            if(var2.anIntArray_11039 != null && var2.anIntArray_11039.length >= this.vertexCount) {
               var1.anIntArray_11039 = var2.anIntArray_11039;
            } else {
               var1.anIntArray_11039 = var2.anIntArray_11039 = new int[this.vertexCount];
            }

            for(var10 = 0; var10 < this.vertexCount; ++var10) {
               var1.anIntArray_11039[var10] = this.anIntArray_11039[var10];
            }
         } else {
            var1.anIntArray_11039 = this.anIntArray_11039;
         }

         if(var9) {
            if(var2.anIntArray_11012 != null && var2.anIntArray_11012.length >= this.vertexCount) {
               var1.anIntArray_11012 = var2.anIntArray_11012;
            } else {
               var1.anIntArray_11012 = var2.anIntArray_11012 = new int[this.vertexCount];
            }

            for(var10 = 0; var10 < this.vertexCount; ++var10) {
               var1.anIntArray_11012[var10] = this.anIntArray_11012[var10];
            }
         } else {
            var1.anIntArray_11012 = this.anIntArray_11012;
         }
      }

      if((var3 & 540800) != 0) {
         if(var2.aShortArray_11035 != null && var2.aShortArray_11035.length >= this.anInt_11016) {
            var1.aShortArray_11035 = var2.aShortArray_11035;
         } else {
            var10 = this.anInt_11016;
            var1.aShortArray_11035 = var2.aShortArray_11035 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt_11016; ++var10) {
            var1.aShortArray_11035[var10] = this.aShortArray_11035[var10];
         }
      } else {
         var1.aShortArray_11035 = this.aShortArray_11035;
      }

      if((var3 & 618520) != 0) {
         var1.anInt_11029 = 0;
         var1.anIntArray_11032 = null;
         var1.anIntArray_11024 = null;
         var1.anIntArray_11059 = null;
      } else if((var3 & 128) != 0) {
         if(var5) {
            this.method7651(false);
         }

         if(this.anIntArray_11059 != null) {
            if(var2.anIntArray_11059 != null && var2.anIntArray_11059.length >= this.anInt_11016) {
               var1.anIntArray_11059 = var2.anIntArray_11059;
               var1.anIntArray_11024 = var2.anIntArray_11024;
               var1.anIntArray_11032 = var2.anIntArray_11032;
            } else {
               var10 = this.anInt_11016;
               var1.anIntArray_11059 = var2.anIntArray_11059 = new int[var10];
               var1.anIntArray_11024 = var2.anIntArray_11024 = new int[var10];
               var1.anIntArray_11032 = var2.anIntArray_11032 = new int[var10];
            }

            for(var10 = 0; var10 < this.anInt_11016; ++var10) {
               var1.anIntArray_11059[var10] = this.anIntArray_11059[var10];
               var1.anIntArray_11024[var10] = this.anIntArray_11024[var10];
               var1.anIntArray_11032[var10] = this.anIntArray_11032[var10];
            }
         }

         var1.anInt_11029 = this.anInt_11029;
      } else {
         if(var5) {
            this.method7651(false);
         }

         var1.anIntArray_11059 = this.anIntArray_11059;
         var1.anIntArray_11024 = this.anIntArray_11024;
         var1.anIntArray_11032 = this.anIntArray_11032;
         var1.anInt_11029 = this.anInt_11029;
      }

      if((var3 & 256) != 0) {
         if(var2.aByteArray_11033 != null && var2.aByteArray_11033.length >= this.anInt_11016) {
            var1.aByteArray_11033 = var2.aByteArray_11033;
         } else {
            var10 = this.anInt_11016;
            var1.aByteArray_11033 = var2.aByteArray_11033 = new byte[var10];
         }

         if(this.aByteArray_11033 != null) {
            for(var10 = 0; var10 < this.anInt_11016; ++var10) {
               var1.aByteArray_11033[var10] = this.aByteArray_11033[var10];
            }
         } else {
            for(var10 = 0; var10 < this.anInt_11016; ++var10) {
               var1.aByteArray_11033[var10] = 0;
            }
         }
      } else {
         var1.aByteArray_11033 = this.aByteArray_11033;
      }

      if((var3 & 8) == 0 && (var3 & 16) == 0) {
         if(var5) {
            this.method7645();
         }

         var1.aClass193Array_11042 = this.aClass193Array_11042;
         var1.aClass201Array_11030 = this.aClass201Array_11030;
      } else {
         if(var2.aClass193Array_11042 != null && var2.aClass193Array_11042.length >= this.anInt_11009) {
            var1.aClass193Array_11042 = var2.aClass193Array_11042;
         } else {
            var10 = this.anInt_11009;
            var1.aClass193Array_11042 = var2.aClass193Array_11042 = new Class193[var10];
         }

         if(this.aClass193Array_11042 != null) {
            for(var10 = 0; var10 < this.anInt_11009; ++var10) {
               var1.aClass193Array_11042[var10] = new Class193(this.aClass193Array_11042[var10]);
            }
         } else {
            var1.aClass193Array_11042 = null;
         }

         if(this.aClass201Array_11030 != null) {
            if(var2.aClass201Array_11030 != null && var2.aClass201Array_11030.length >= this.anInt_11016) {
               var1.aClass201Array_11030 = var2.aClass201Array_11030;
            } else {
               var10 = this.anInt_11016;
               var1.aClass201Array_11030 = var2.aClass201Array_11030 = new Class201[var10];
            }

            for(var10 = 0; var10 < this.anInt_11016; ++var10) {
               var1.aClass201Array_11030[var10] = this.aClass201Array_11030[var10] != null?new Class201(this.aClass201Array_11030[var10]):null;
            }
         } else {
            var1.aClass201Array_11030 = null;
         }
      }

      if((var3 & '\u8000') != 0) {
         if(this.aShortArray_11010 == null) {
            var1.aShortArray_11010 = null;
         } else {
            if(var2.aShortArray_11010 != null && var2.aShortArray_11010.length >= this.anInt_11016) {
               var1.aShortArray_11010 = var2.aShortArray_11010;
            } else {
               var10 = this.anInt_11016;
               var1.aShortArray_11010 = var2.aShortArray_11010 = new short[var10];
            }

            for(var10 = 0; var10 < this.anInt_11016; ++var10) {
               var1.aShortArray_11010[var10] = this.aShortArray_11010[var10];
            }
         }
      } else {
         var1.aShortArray_11010 = this.aShortArray_11010;
      }

      if((var3 & 65536) != 0) {
         if(this.aByteArray_11031 == null) {
            var1.aByteArray_11031 = null;
         } else {
            if(var2.aByteArray_11031 != null && var2.aByteArray_11031.length >= this.anInt_11016) {
               var1.aByteArray_11031 = var2.aByteArray_11031;
            } else {
               var10 = var4?this.anInt_11016 + 100:this.anInt_11016;
               var1.aByteArray_11031 = var2.aByteArray_11031 = new byte[var10];
            }

            for(var10 = 0; var10 < this.anInt_11016; ++var10) {
               var1.aByteArray_11031[var10] = this.aByteArray_11031[var10];
            }
         }
      } else {
         var1.aByteArray_11031 = this.aByteArray_11031;
      }

      if((var3 & '\uc580') != 0) {
         if(var2.aClass195Array_11050 != null && var2.aClass195Array_11050.length >= this.anInt_11048) {
            var1.aClass195Array_11050 = var2.aClass195Array_11050;

            for(var10 = 0; var10 < this.anInt_11048; ++var10) {
               var1.aClass195Array_11050[var10].method2525(this.aClass195Array_11050[var10], (byte)112);
            }
         } else {
            var10 = this.anInt_11048;
            var1.aClass195Array_11050 = var2.aClass195Array_11050 = new Class195[var10];

            for(int var11 = 0; var11 < this.anInt_11048; ++var11) {
               var1.aClass195Array_11050[var11] = this.aClass195Array_11050[var11].method2524(1266736271);
            }
         }
      } else {
         var1.aClass195Array_11050 = this.aClass195Array_11050;
      }

      if(this.aFloatArrayArray_11021 != null && (var3 & 16) != 0) {
         if(var2.aFloatArrayArray_11021 != null && var2.aFloatArrayArray_11021.length >= this.anInt_11016) {
            var1.aFloatArrayArray_11021 = var2.aFloatArrayArray_11021;
         } else {
            var10 = var4?this.anInt_11016 + 100:this.anInt_11016;
            var1.aFloatArrayArray_11021 = var2.aFloatArrayArray_11021 = new float[var10][3];
         }

         for(var10 = 0; var10 < this.anInt_11016; ++var10) {
            if(this.aFloatArrayArray_11021[var10] != null) {
               var1.aFloatArrayArray_11021[var10][0] = this.aFloatArrayArray_11021[var10][0];
               var1.aFloatArrayArray_11021[var10][1] = this.aFloatArrayArray_11021[var10][1];
               var1.aFloatArrayArray_11021[var10][2] = this.aFloatArrayArray_11021[var10][2];
            }
         }

         if(var2.aFloatArrayArray_11022 != null && var2.aFloatArrayArray_11022.length >= this.anInt_11016) {
            var1.aFloatArrayArray_11022 = var2.aFloatArrayArray_11022;
         } else {
            var10 = var4?this.anInt_11016 + 100:this.anInt_11016;
            var1.aFloatArrayArray_11022 = var2.aFloatArrayArray_11022 = new float[var10][3];
         }

         for(var10 = 0; var10 < this.anInt_11016; ++var10) {
            if(this.aFloatArrayArray_11022[var10] != null) {
               var1.aFloatArrayArray_11022[var10][0] = this.aFloatArrayArray_11022[var10][0];
               var1.aFloatArrayArray_11022[var10][1] = this.aFloatArrayArray_11022[var10][1];
               var1.aFloatArrayArray_11022[var10][2] = this.aFloatArrayArray_11022[var10][2];
            }
         }
      } else {
         var1.aFloatArrayArray_11021 = this.aFloatArrayArray_11021;
         var1.aFloatArrayArray_11022 = this.aFloatArrayArray_11022;
      }

      var1.anIntArrayArray_11038 = this.anIntArrayArray_11038;
      var1.anIntArrayArray_11023 = this.anIntArrayArray_11023;
      var1.anIntArrayArray_11051 = this.anIntArrayArray_11051;
      var1.aShortArray_11045 = this.aShortArray_11045;
      var1.aShortArray_11036 = this.aShortArray_11036;
      var1.aByteArray_11064 = this.aByteArray_11064;
      var1.aShortArray_11046 = this.aShortArray_11046;
      var1.aShortArray_11019 = this.aShortArray_11019;
      var1.aShortArray_11068 = this.aShortArray_11068;
      var1.aClass86Array_11004 = this.aClass86Array_11004;
      var1.aClass172Array_11047 = this.aClass172Array_11047;
      var1.aClass215Array_11049 = this.aClass215Array_11049;
      var1.aShortArray_11037 = this.aShortArray_11037;
      var1.anInt_10998 = var3;
      return var1;
   }

   final void method7663(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      int var6;
      Class215 var7;
      if(this.aClass215Array_11049 != null) {
         for(var6 = 0; var6 < this.anInt_11048; this.anIntArray_11074[var7.anInt_3736 * -1304911815] = var6++) {
            var7 = this.aClass215Array_11049[var6];
         }
      }

      if(!this.aBoolean_11061 && this.aClass215Array_11049 == null) {
         for(var6 = 0; var6 < this.anInt_11017; ++var6) {
            this.method7625(var1, var2, var3, var6, var4, var5);
         }
      } else if((this.anInt_10998 & 256) == 0 && this.aShortArray_11037 != null) {
         for(var6 = 0; var6 < this.anInt_11017; ++var6) {
            short var9 = this.aShortArray_11037[var6];
            this.method7625(var1, var2, var3, var9, var4, var5);
         }
      } else {
         for(var6 = 0; var6 < this.anInt_11017; ++var6) {
            if(!this.method7624(var6) && !this.method7654(var6)) {
               this.method7625(var1, var2, var3, var6, var4, var5);
            }
         }

         if(this.aByteArray_11064 == null) {
            for(var6 = 0; var6 < this.anInt_11017; ++var6) {
               if(this.method7624(var6) || this.method7654(var6)) {
                  this.method7625(var1, var2, var3, var6, var4, var5);
               }
            }
         } else {
            for(var6 = 0; var6 < 12; ++var6) {
               for(int var8 = 0; var8 < this.anInt_11017; ++var8) {
                  if(this.aByteArray_11064[var8] == var6 && (this.method7624(var8) || this.method7654(var8))) {
                     this.method7625(var1, var2, var3, var8, var4, var5);
                  }
               }
            }
         }
      }

   }

   public boolean method2066() {
      if(this.aShortArray_11010 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray_11010.length; ++var1) {
            if(this.aShortArray_11010[var1] != -1 && !this.softwareRenderer.method6841(this.aShortArray_11010[var1])) {
               return false;
            }
         }

         return true;
      }
   }

   public void method2060(byte var1, byte[] var2) {
      if((this.anInt_10998 & 1048576) == 0) {
         throw new RuntimeException();
      } else {
         if(this.aByteArray_11033 == null) {
            this.aByteArray_11033 = new byte[this.anInt_11016];
         }

         int var3;
         if(var2 == null) {
            for(var3 = 0; var3 < this.anInt_11016; ++var3) {
               this.aByteArray_11033[var3] = var1;
            }
         } else {
            for(var3 = 0; var3 < this.anInt_11016; ++var3) {
               int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
               this.aByteArray_11033[var3] = (byte)var4;
            }
         }

         if(this.anInt_11029 == 2) {
            this.anInt_11029 = 1;
         }

      }
   }

   public void method2053(Model var1, int var2, int var3, int var4, boolean var5) {
      Class165_Sub3 var6 = (Class165_Sub3)var1;
      if((this.anInt_10998 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else if((var6.anInt_10998 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else {
         this.method7667(this.softwareRenderer.method6787(Thread.currentThread()));
         this.method7628();
         this.method7645();
         var6.method7628();
         var6.method7645();
         ++anInt_11063;
         int var7 = 0;
         int[] var8 = var6.xpoints;
         int var9 = var6.anInt_11009;

         int var10;
         for(var10 = 0; var10 < this.anInt_11009; ++var10) {
            Class193 var11 = this.aClass193Array_11042[var10];
            if(var11.anInt_3352 != 0) {
               int var12 = this.anIntArray_11039[var10] - var3;
               if(var12 >= var6.aShort_11073 && var12 <= var6.aShort_11013) {
                  int var13 = this.xpoints[var10] - var2;
                  if(var13 >= var6.aShort_11057 && var13 <= var6.aShort_11058) {
                     int var14 = this.anIntArray_11012[var10] - var4;
                     if(var14 >= var6.aShort_11034 && var14 <= var6.aShort_11060) {
                        for(int var15 = 0; var15 < var9; ++var15) {
                           Class193 var16 = var6.aClass193Array_11042[var15];
                           if(var13 == var8[var15] && var14 == var6.anIntArray_11012[var15] && var12 == var6.anIntArray_11039[var15] && var16.anInt_3352 != 0) {
                              if(this.aClass193Array_11018 == null) {
                                 this.aClass193Array_11018 = new Class193[this.anInt_11009];
                              }

                              if(var6.aClass193Array_11018 == null) {
                                 var6.aClass193Array_11018 = new Class193[var9];
                              }

                              Class193 var17 = this.aClass193Array_11018[var10];
                              if(var17 == null) {
                                 var17 = this.aClass193Array_11018[var10] = new Class193(var11);
                              }

                              Class193 var18 = var6.aClass193Array_11018[var15];
                              if(var18 == null) {
                                 var18 = var6.aClass193Array_11018[var15] = new Class193(var16);
                              }

                              var17.anInt_3354 += var16.anInt_3354;
                              var17.anInt_3353 += var16.anInt_3353;
                              var17.anInt_3355 += var16.anInt_3355;
                              var17.anInt_3352 += var16.anInt_3352;
                              var18.anInt_3354 += var11.anInt_3354;
                              var18.anInt_3353 += var11.anInt_3353;
                              var18.anInt_3355 += var11.anInt_3355;
                              var18.anInt_3352 += var11.anInt_3352;
                              ++var7;
                              this.anIntArray_11072[var10] = anInt_11063;
                              this.anIntArray_11040[var15] = anInt_11063;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var7 >= 3 && var5) {
            for(var10 = 0; var10 < this.anInt_11016; ++var10) {
               if(this.anIntArray_11072[this.aShortArray_11046[var10]] == anInt_11063 && this.anIntArray_11072[this.aShortArray_11019[var10]] == anInt_11063 && this.anIntArray_11072[this.aShortArray_11068[var10]] == anInt_11063) {
                  if(this.aByteArray_11031 == null) {
                     this.aByteArray_11031 = new byte[this.anInt_11016];
                  }

                  this.aByteArray_11031[var10] = 2;
               }
            }

            for(var10 = 0; var10 < var6.anInt_11016; ++var10) {
               if(this.anIntArray_11040[var6.aShortArray_11046[var10]] == anInt_11063 && this.anIntArray_11040[var6.aShortArray_11019[var10]] == anInt_11063 && this.anIntArray_11040[var6.aShortArray_11068[var10]] == anInt_11063) {
                  if(var6.aByteArray_11031 == null) {
                     var6.aByteArray_11031 = new byte[var6.anInt_11016];
                  }

                  var6.aByteArray_11031[var10] = 2;
               }
            }

         }
      }
   }

   void method7667(Class210 var1) {
      this.aClass202_10996 = var1.aClass202_3630;
      if(var1 != this.aClass210_11015) {
         this.aClass210_11015 = var1;
         this.anIntArray_11055 = this.aClass210_11015.anIntArray_3628;
         this.screenX = this.aClass210_11015.aFloatArray_3623;
         this.screenY = this.aClass210_11015.aFloatArray_3619;
         this.aFloatArray_11067 = this.aClass210_11015.aFloatArray_3612;
         this.aFloatArray_11062 = this.aClass210_11015.aFloatArray_3629;
         this.anIntArray_11028 = this.aClass210_11015.anIntArray_3633;
         this.anIntArray_11070 = this.aClass210_11015.anIntArray_3610;
         this.anIntArray_11071 = this.aClass210_11015.anIntArray_3634;
         this.anIntArray_11072 = this.aClass210_11015.anIntArray_3636;
         this.anIntArray_11040 = this.aClass210_11015.anIntArray_3637;
         this.anIntArray_11074 = this.aClass210_11015.anIntArray_3638;
      }
   }
}
