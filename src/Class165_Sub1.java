import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class165_Sub1 extends Model {

   long[] aLongArray_10200;
   static final int anInt_10201 = 4;
   final Renderer_Sub3 aRenderer_Sub3_10202;
   short[] aShortArray_10203;
   int anInt_10204;
   short aShort_10205;
   int anInt_10206;
   Class390 aClass390_10207;
   int anInt_10208;
   int[] anIntArray_10209;
   int[] anIntArray_10210;
   int[] anIntArray_10211;
   int anInt_10212;
   short[] aShortArray_10213;
   int anInt_10214;
   int[][] anIntArrayArray_10215;
   short[] aShortArray_10216;
   short[] aShortArray_10217;
   int anInt_10218;
   short[] aShortArray_10219;
   byte[] aByteArray_10220;
   short[] aShortArray_10221;
   float[] aFloatArray_10222;
   Class395 aClass395_10223;
   int anInt_10224;
   static final int anInt_10225 = 7;
   short[] aShortArray_10226;
   byte[] aByteArray_10227;
   short[] aShortArray_10228;
   short[] aShortArray_10229;
   short[] aShortArray_10230;
   short[] aShortArray_10231;
   int anInt_10232;
   int anInt_10233;
   final int[] anIntArray_10234;
   int[] anIntArray_10235;
   Class390 aClass390_10236;
   short[] aShortArray_10237;
   Class390 aClass390_10238;
   boolean aBoolean_10239;
   int[][] anIntArrayArray_10240;
   boolean aBoolean_10241;
   boolean aBoolean_10242;
   final int[] anIntArray_10243;
   Class391[] aClass391Array_10244;
   boolean aBoolean_10245;
   int anInt_10246;
   int anInt_10247;
   int anInt_10248;
   Class172[] aClass172Array_10249;
   float[] aFloatArray_10250;
   Class74 aClass74_10251;
   int[] anIntArray_10252;
   int[] anIntArray_10253;
   int[] anIntArray_10254;
   int[] anIntArray_10255;
   short[] aShortArray_10256;
   Class86[] aClass86Array_10257;
   short aShort_10258;
   int anInt_10259;
   Class382[] aClass382Array_10260;
   int anInt_10261;
   boolean aBoolean_10262;
   int[][] anIntArrayArray_10263;
   int anInt_10264;
   int[] anIntArray_10265;
   int anInt_10266;
   float[] aFloatArray_10267;
   Class390 aClass390_10268;
   final int[] anIntArray_10269;
   int anInt_10270;
   int anInt_10271;
   int anInt_10272;
   boolean aBoolean_10273;
   static Class62 aClass62_10274;


   Class165_Sub1(Renderer_Sub3 var1, ModelData var2, int var3, int var4, int var5, int var6) {
      this(var1, var3, var6, true, false);
      Class163 var7 = var1.aClass163_2802;
      int[] var8 = new int[var2.anInt_1856];
      this.anIntArray_10255 = new int[var2.anInt_1850 + 1];

      for(int var9 = 0; var9 < var2.anInt_1856; ++var9) {
         if(var2.aByteArray_1860 == null || var2.aByteArray_1860[var9] != 2) {
            if(var2.aShortArray_1859 != null && var2.aShortArray_1859[var9] != -1) {
               Class183 var10 = var7.method1996(var2.aShortArray_1859[var9] & '\uffff', (byte)2);
               if(((this.anInt_10204 & 64) == 0 || !var10.aBoolean_3174) && var10.aBoolean_3152) {
                  continue;
               }
            }

            var8[this.anInt_10224++] = var9;
            ++this.anIntArray_10255[var2.aShortArray_1857[var9]];
            ++this.anIntArray_10255[var2.aShortArray_1845[var9]];
            ++this.anIntArray_10255[var2.aShortArray_1869[var9]];
         }
      }

      this.anInt_10212 = this.anInt_10224;
      long[] var67 = new long[this.anInt_10224];
      boolean var68 = (this.anInt_10261 & 256) != 0;

      int var12;
      int var14;
      int var19;
      int var71;
      short var78;
      for(int var11 = 0; var11 < this.anInt_10224; ++var11) {
         var12 = var8[var11];
         Class183 var13 = null;
         var14 = 0;
         byte var15 = 0;
         byte var16 = 0;
         byte var17 = 0;
         boolean var18;
         if(var2.aClass107Array_1884 != null) {
            var18 = false;

            for(var19 = 0; var19 < var2.aClass107Array_1884.length; ++var19) {
               Class107 var20 = var2.aClass107Array_1884[var19];
               if(var12 == var20.anInt_1989 * 1921905305) {
                  Class397 var21 = Class366.method4667(var20.anInt_1991 * 2120936855, (byte)34);
                  if(var21.aBoolean_7595) {
                     var18 = true;
                  }

                  if(var21.anInt_7589 * 741866845 != -1) {
                     Class183 var22 = var7.method1996(var21.anInt_7589 * 741866845, (byte)2);
                     if(var22.aClass620_3153 == Class620.aClass620_10022) {
                        this.aBoolean_10241 = true;
                     }
                  }
               }
            }

            if(var18) {
               var67[var11] = Long.MAX_VALUE;
               --this.anInt_10212;
               continue;
            }
         }

         if(var2.aClass86Array_1854 != null) {
            var18 = false;

            for(var19 = 0; var19 < var2.aClass86Array_1854.length; ++var19) {
               Class86 var82 = var2.aClass86Array_1854[var19];
               if(var12 == var82.anInt_1754 * -1827055815) {
                  Class411 var89 = Class110.method1411(var82.anInt_1746 * 87629913, 1660954236);
                  if(var89.aBoolean_7825) {
                     var18 = true;
                  }
               }
            }

            if(var18) {
               var67[var11] = Long.MAX_VALUE;
               --this.anInt_10212;
               continue;
            }
         }

         var78 = -1;
         if(var2.aShortArray_1859 != null) {
            var78 = var2.aShortArray_1859[var12];
            if(var78 != -1) {
               var13 = var7.method1996(var78 & '\uffff', (byte)2);
               if((this.anInt_10204 & 64) != 0 && var13.aBoolean_3174) {
                  var78 = -1;
                  var13 = null;
               } else {
                  var16 = var13.aByte_3169;
                  var17 = var13.aByte_3170;
               }
            }
         }

         boolean var83 = var2.aByteArray_1864 != null && var2.aByteArray_1864[var12] != 0 || var13 != null && var13.aClass620_3153 != Class620.aClass620_10020;
         if((var68 || var83) && var2.aByteArray_1861 != null) {
            var14 += var2.aByteArray_1861[var12] << 17;
         }

         if(var83) {
            var14 += 65536;
         }

         var14 += (var16 & 255) << 8;
         var14 += var17 & 255;
         var71 = var15 + ((var78 & '\uffff') << 16);
         var71 += var11 & '\uffff';
         var67[var11] = ((long)var14 << 32) + (long)var71;
         this.aBoolean_10241 |= var83;
         this.aBoolean_10242 |= var13 != null && (var13.aByte_3145 != 0 || var13.aByte_3157 != 0);
      }

      Class131.method1686(var67, var8, 1883031860);
      this.anInt_10218 = var2.anInt_1849;
      this.anInt_10208 = var2.anInt_1850;
      this.anIntArray_10209 = var2.anIntArray_1858;
      this.anIntArray_10235 = var2.anIntArray_1880;
      this.anIntArray_10211 = var2.anIntArray_1853;
      this.aShortArray_10213 = var2.aShortArray_1862;
      Class386[] var69 = new Class386[this.anInt_10208];
      this.aClass86Array_10257 = var2.aClass86Array_1854;
      this.aClass172Array_10249 = var2.aClass172Array_1883;
      int var77;
      if(var2.aClass107Array_1884 != null) {
         this.anInt_10259 = var2.aClass107Array_1884.length;
         this.aClass382Array_10260 = new Class382[this.anInt_10259];
         this.aClass391Array_10244 = new Class391[this.anInt_10259];

         for(var12 = 0; var12 < this.anInt_10259; ++var12) {
            Class107 var72 = var2.aClass107Array_1884[var12];
            Class397 var73 = Class366.method4667(var72.anInt_1991 * 2120936855, (byte)19);
            var71 = -1;

            for(var77 = 0; var77 < this.anInt_10224; ++var77) {
               if(var8[var77] == var72.anInt_1989 * 1921905305) {
                  var71 = var77;
                  break;
               }
            }

            if(var71 == -1) {
               throw new RuntimeException();
            }

            var77 = Class541.anIntArray_9470[var2.aShortArray_1876[var72.anInt_1989 * 1921905305] & '\uffff'] & 16777215;
            var77 |= 255 - (var2.aByteArray_1864 != null?var2.aByteArray_1864[var72.anInt_1989 * 1921905305]:0) << 24;
            this.aClass382Array_10260[var12] = new Class382(var71, var2.aShortArray_1857[var72.anInt_1989 * 1921905305], var2.aShortArray_1845[var72.anInt_1989 * 1921905305], var2.aShortArray_1869[var72.anInt_1989 * 1921905305], var73.anInt_7590 * 300602345, var73.anInt_7586 * -1519311519, var73.anInt_7589 * 741866845, var73.anInt_7593 * 1295500681, var73.anInt_7592 * -782198371, var73.aBoolean_7595, var73.aBoolean_7594, var72.anInt_1988 * 514945959);
            this.aClass391Array_10244[var12] = new Class391(var77);
         }
      }

      var12 = this.anInt_10224 * 3;
      this.aShortArray_10221 = new short[var12];
      this.aShortArray_10216 = new short[var12];
      this.aShortArray_10217 = new short[var12];
      this.aShortArray_10203 = new short[var12];
      this.aShortArray_10219 = new short[var12];
      this.aByteArray_10220 = new byte[var12];
      this.aFloatArray_10250 = new float[var12];
      this.aFloatArray_10222 = new float[var12];
      this.aShortArray_10226 = new short[this.anInt_10224];
      this.aByteArray_10227 = new byte[this.anInt_10224];
      this.aShortArray_10228 = new short[this.anInt_10224];
      this.aShortArray_10229 = new short[this.anInt_10224];
      this.aShortArray_10230 = new short[this.anInt_10224];
      this.aShortArray_10231 = new short[this.anInt_10224];
      if(var2.aShortArray_1868 != null) {
         this.aShortArray_10237 = new short[this.anInt_10224];
      }

      this.aShort_10205 = (short)var4;
      this.aShort_10258 = (short)var5;
      this.aShortArray_10256 = new short[var12];
      this.aLongArray_10200 = new long[var12];
      int var70 = 0;

      for(var14 = 0; var14 < var2.anInt_1850; ++var14) {
         var71 = this.anIntArray_10255[var14];
         this.anIntArray_10255[var14] = var70;
         var70 += var71;
         var69[var14] = new Class386();
      }

      this.anIntArray_10255[var2.anInt_1850] = var70;
      Class93 var76 = this.method2063(var2, var8, this.anInt_10224);
      Class383[] var75 = new Class383[var2.anInt_1856];

      short var74;
      int var81;
      short var80;
      for(var77 = 0; var77 < var2.anInt_1856; ++var77) {
         var74 = var2.aShortArray_1857[var77];
         var78 = var2.aShortArray_1845[var77];
         var80 = var2.aShortArray_1869[var77];
         var81 = this.anIntArray_10209[var78] - this.anIntArray_10209[var74];
         int var90 = this.anIntArray_10235[var78] - this.anIntArray_10235[var74];
         int var85 = this.anIntArray_10211[var78] - this.anIntArray_10211[var74];
         int var23 = this.anIntArray_10209[var80] - this.anIntArray_10209[var74];
         int var24 = this.anIntArray_10235[var80] - this.anIntArray_10235[var74];
         int var25 = this.anIntArray_10211[var80] - this.anIntArray_10211[var74];
         int var26 = var90 * var25 - var24 * var85;
         int var27 = var85 * var23 - var25 * var81;

         int var28;
         for(var28 = var81 * var24 - var23 * var90; var26 > 8192 || var27 > 8192 || var28 > 8192 || var26 < -8192 || var27 < -8192 || var28 < -8192; var28 >>= 1) {
            var26 >>= 1;
            var27 >>= 1;
         }

         int var29 = (int)Math.sqrt((double)(var26 * var26 + var27 * var27 + var28 * var28));
         if(var29 <= 0) {
            var29 = 1;
         }

         var26 = var26 * 256 / var29;
         var27 = var27 * 256 / var29;
         var28 = var28 * 256 / var29;
         byte var30 = var2.aByteArray_1860 == null?0:var2.aByteArray_1860[var77];
         if(var30 == 0) {
            Class386 var31 = var69[var74];
            var31.anInt_7469 += var26;
            var31.anInt_7466 += var27;
            var31.anInt_7468 += var28;
            ++var31.anInt_7467;
            var31 = var69[var78];
            var31.anInt_7469 += var26;
            var31.anInt_7466 += var27;
            var31.anInt_7468 += var28;
            ++var31.anInt_7467;
            var31 = var69[var80];
            var31.anInt_7469 += var26;
            var31.anInt_7466 += var27;
            var31.anInt_7468 += var28;
            ++var31.anInt_7467;
         } else if(var30 == 1) {
            Class383 var102 = var75[var77] = new Class383();
            var102.anInt_7405 = var26;
            var102.anInt_7406 = var27;
            var102.anInt_7407 = var28;
         }
      }

      int var88;
      short var91;
      for(var77 = 0; var77 < this.anInt_10224; ++var77) {
         int var79 = var8[var77];
         var88 = var2.aShortArray_1876[var79] & '\uffff';
         if(var2.aShortArray_1863 == null) {
            var19 = -1;
         } else {
            var19 = var2.aShortArray_1863[var79];
         }

         if(var2.aByteArray_1864 == null) {
            var81 = 0;
         } else {
            var81 = var2.aByteArray_1864[var79] & 255;
         }

         var91 = var2.aShortArray_1859 == null?-1:var2.aShortArray_1859[var79];
         if(var91 != -1 && (this.anInt_10204 & 64) != 0 && var7.method1996(var91, (byte)2).aBoolean_3174) {
            var91 = -1;
         }

         float var86 = 0.0F;
         float var87 = 0.0F;
         float var94 = 0.0F;
         float var93 = 0.0F;
         float var96 = 0.0F;
         float var95 = 0.0F;
         byte var98 = 0;
         byte var99 = 0;
         int var97 = 0;
         short var34;
         short var35;
         short var36;
         byte var100;
         if(var91 != -1) {
            if(var19 == -1) {
               var86 = 0.0F;
               var87 = 1.0F;
               var94 = 1.0F;
               var93 = 1.0F;
               var98 = 1;
               var96 = 0.0F;
               var95 = 0.0F;
               var99 = 2;
            } else {
               var19 &= '\uffff';
               var100 = var2.aByteArray_1870[var19];
               short var32;
               short var33;
               float var42;
               float var40;
               float var41;
               float var55;
               float var54;
               float var53;
               float var52;
               float var57;
               float var56;
               if(var100 == 0) {
                  var32 = var2.aShortArray_1857[var79];
                  var33 = var2.aShortArray_1845[var79];
                  var34 = var2.aShortArray_1869[var79];
                  var35 = var2.aShortArray_1871[var19];
                  var36 = var2.aShortArray_1872[var19];
                  short var37 = var2.aShortArray_1852[var19];
                  float var38 = (float)var2.anIntArray_1858[var35];
                  float var39 = (float)var2.anIntArray_1880[var35];
                  var40 = (float)var2.anIntArray_1853[var35];
                  var41 = (float)var2.anIntArray_1858[var36] - var38;
                  var42 = (float)var2.anIntArray_1880[var36] - var39;
                  float var43 = (float)var2.anIntArray_1853[var36] - var40;
                  float var44 = (float)var2.anIntArray_1858[var37] - var38;
                  float var45 = (float)var2.anIntArray_1880[var37] - var39;
                  float var46 = (float)var2.anIntArray_1853[var37] - var40;
                  float var47 = (float)var2.anIntArray_1858[var32] - var38;
                  float var48 = (float)var2.anIntArray_1880[var32] - var39;
                  float var49 = (float)var2.anIntArray_1853[var32] - var40;
                  float var50 = (float)var2.anIntArray_1858[var33] - var38;
                  float var51 = (float)var2.anIntArray_1880[var33] - var39;
                  var52 = (float)var2.anIntArray_1853[var33] - var40;
                  var53 = (float)var2.anIntArray_1858[var34] - var38;
                  var54 = (float)var2.anIntArray_1880[var34] - var39;
                  var55 = (float)var2.anIntArray_1853[var34] - var40;
                  var56 = var42 * var46 - var43 * var45;
                  var57 = var43 * var44 - var41 * var46;
                  float var58 = var41 * var45 - var42 * var44;
                  float var59 = var45 * var58 - var46 * var57;
                  float var60 = var46 * var56 - var44 * var58;
                  float var61 = var44 * var57 - var45 * var56;
                  float var62 = 1.0F / (var59 * var41 + var60 * var42 + var61 * var43);
                  var86 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
                  var94 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
                  var96 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
                  var59 = var42 * var58 - var43 * var57;
                  var60 = var43 * var56 - var41 * var58;
                  var61 = var41 * var57 - var42 * var56;
                  var62 = 1.0F / (var59 * var44 + var60 * var45 + var61 * var46);
                  var87 = (var59 * var47 + var60 * var48 + var61 * var49) * var62;
                  var93 = (var59 * var50 + var60 * var51 + var61 * var52) * var62;
                  var95 = (var59 * var53 + var60 * var54 + var61 * var55) * var62;
               } else {
                  var32 = var2.aShortArray_1857[var79];
                  var33 = var2.aShortArray_1845[var79];
                  var34 = var2.aShortArray_1869[var79];
                  int var104 = var76.anIntArray_1836[var19];
                  int var103 = var76.anIntArray_1832[var19];
                  int var108 = var76.anIntArray_1834[var19];
                  float[] var106 = var76.aFloatArrayArray_1835[var19];
                  byte var105 = var2.aByteArray_1881[var19];
                  var40 = (float)var2.anIntArray_1877[var19] / 256.0F;
                  if(var100 == 1) {
                     var41 = (float)var2.anIntArray_1865[var19] / 1024.0F;
                     this.method2062(var2.anIntArray_1858[var32], var2.anIntArray_1880[var32], var2.anIntArray_1853[var32], var104, var103, var108, var106, var41, var105, var40, this.aFloatArray_10267);
                     var86 = this.aFloatArray_10267[0];
                     var87 = this.aFloatArray_10267[1];
                     this.method2062(var2.anIntArray_1858[var33], var2.anIntArray_1880[var33], var2.anIntArray_1853[var33], var104, var103, var108, var106, var41, var105, var40, this.aFloatArray_10267);
                     var94 = this.aFloatArray_10267[0];
                     var93 = this.aFloatArray_10267[1];
                     this.method2062(var2.anIntArray_1858[var34], var2.anIntArray_1880[var34], var2.anIntArray_1853[var34], var104, var103, var108, var106, var41, var105, var40, this.aFloatArray_10267);
                     var96 = this.aFloatArray_10267[0];
                     var95 = this.aFloatArray_10267[1];
                     var42 = var41 / 2.0F;
                     if((var105 & 1) == 0) {
                        if(var94 - var86 > var42) {
                           var94 -= var41;
                           var98 = 1;
                        } else if(var86 - var94 > var42) {
                           var94 += var41;
                           var98 = 2;
                        }

                        if(var96 - var86 > var42) {
                           var96 -= var41;
                           var99 = 1;
                        } else if(var86 - var96 > var42) {
                           var96 += var41;
                           var99 = 2;
                        }
                     } else {
                        if(var93 - var87 > var42) {
                           var93 -= var41;
                           var98 = 1;
                        } else if(var87 - var93 > var42) {
                           var93 += var41;
                           var98 = 2;
                        }

                        if(var95 - var87 > var42) {
                           var95 -= var41;
                           var99 = 1;
                        } else if(var87 - var95 > var42) {
                           var95 += var41;
                           var99 = 2;
                        }
                     }
                  } else if(var100 == 2) {
                     var41 = (float)var2.anIntArray_1873[var19] / 256.0F;
                     var42 = (float)var2.anIntArray_1879[var19] / 256.0F;
                     int var112 = var2.anIntArray_1858[var33] - var2.anIntArray_1858[var32];
                     int var113 = var2.anIntArray_1880[var33] - var2.anIntArray_1880[var32];
                     int var109 = var2.anIntArray_1853[var33] - var2.anIntArray_1853[var32];
                     int var110 = var2.anIntArray_1858[var34] - var2.anIntArray_1858[var32];
                     int var111 = var2.anIntArray_1880[var34] - var2.anIntArray_1880[var32];
                     int var116 = var2.anIntArray_1853[var34] - var2.anIntArray_1853[var32];
                     int var117 = var113 * var116 - var111 * var109;
                     int var114 = var109 * var110 - var116 * var112;
                     int var115 = var112 * var111 - var110 * var113;
                     var52 = 64.0F / (float)var2.anIntArray_1874[var19];
                     var53 = 64.0F / (float)var2.anIntArray_1875[var19];
                     var54 = 64.0F / (float)var2.anIntArray_1865[var19];
                     var55 = ((float)var117 * var106[0] + (float)var114 * var106[1] + (float)var115 * var106[2]) / var52;
                     var56 = ((float)var117 * var106[3] + (float)var114 * var106[4] + (float)var115 * var106[5]) / var53;
                     var57 = ((float)var117 * var106[6] + (float)var114 * var106[7] + (float)var115 * var106[8]) / var54;
                     var97 = this.method2045(var55, var56, var57);
                     this.method2011(var2.anIntArray_1858[var32], var2.anIntArray_1880[var32], var2.anIntArray_1853[var32], var104, var103, var108, var97, var106, var105, var40, var41, var42, this.aFloatArray_10267);
                     var86 = this.aFloatArray_10267[0];
                     var87 = this.aFloatArray_10267[1];
                     this.method2011(var2.anIntArray_1858[var33], var2.anIntArray_1880[var33], var2.anIntArray_1853[var33], var104, var103, var108, var97, var106, var105, var40, var41, var42, this.aFloatArray_10267);
                     var94 = this.aFloatArray_10267[0];
                     var93 = this.aFloatArray_10267[1];
                     this.method2011(var2.anIntArray_1858[var34], var2.anIntArray_1880[var34], var2.anIntArray_1853[var34], var104, var103, var108, var97, var106, var105, var40, var41, var42, this.aFloatArray_10267);
                     var96 = this.aFloatArray_10267[0];
                     var95 = this.aFloatArray_10267[1];
                  } else if(var100 == 3) {
                     this.method2010(var2.anIntArray_1858[var32], var2.anIntArray_1880[var32], var2.anIntArray_1853[var32], var104, var103, var108, var106, var105, var40, this.aFloatArray_10267);
                     var86 = this.aFloatArray_10267[0];
                     var87 = this.aFloatArray_10267[1];
                     this.method2010(var2.anIntArray_1858[var33], var2.anIntArray_1880[var33], var2.anIntArray_1853[var33], var104, var103, var108, var106, var105, var40, this.aFloatArray_10267);
                     var94 = this.aFloatArray_10267[0];
                     var93 = this.aFloatArray_10267[1];
                     this.method2010(var2.anIntArray_1858[var34], var2.anIntArray_1880[var34], var2.anIntArray_1853[var34], var104, var103, var108, var106, var105, var40, this.aFloatArray_10267);
                     var96 = this.aFloatArray_10267[0];
                     var95 = this.aFloatArray_10267[1];
                     if((var105 & 1) == 0) {
                        if(var94 - var86 > 0.5F) {
                           --var94;
                           var98 = 1;
                        } else if(var86 - var94 > 0.5F) {
                           ++var94;
                           var98 = 2;
                        }

                        if(var96 - var86 > 0.5F) {
                           --var96;
                           var99 = 1;
                        } else if(var86 - var96 > 0.5F) {
                           ++var96;
                           var99 = 2;
                        }
                     } else {
                        if(var93 - var87 > 0.5F) {
                           --var93;
                           var98 = 1;
                        } else if(var87 - var93 > 0.5F) {
                           ++var93;
                           var98 = 2;
                        }

                        if(var95 - var87 > 0.5F) {
                           --var95;
                           var99 = 1;
                        } else if(var87 - var95 > 0.5F) {
                           ++var95;
                           var99 = 2;
                        }
                     }
                  }
               }
            }
         }

         if(var2.aByteArray_1860 == null) {
            var100 = 0;
         } else {
            var100 = var2.aByteArray_1860[var79];
         }

         if(var100 == 0) {
            long var63 = (long)(var19 << 2) + ((long)(var97 << 24) + (long)(var88 << 8) + (long)var81 << 32);
            var34 = var2.aShortArray_1857[var79];
            var35 = var2.aShortArray_1845[var79];
            var36 = var2.aShortArray_1869[var79];
            Class386 var107 = var69[var34];
            this.aShortArray_10228[var77] = this.method6896(var2, var34, var77, var63, var107.anInt_7469, var107.anInt_7466, var107.anInt_7468, var107.anInt_7467, var86, var87);
            var107 = var69[var35];
            this.aShortArray_10229[var77] = this.method6896(var2, var35, var77, var63 + (long)var98, var107.anInt_7469, var107.anInt_7466, var107.anInt_7468, var107.anInt_7467, var94, var93);
            var107 = var69[var36];
            this.aShortArray_10230[var77] = this.method6896(var2, var36, var77, var63 + (long)var99, var107.anInt_7469, var107.anInt_7466, var107.anInt_7468, var107.anInt_7467, var96, var95);
         } else if(var100 == 1) {
            Class383 var101 = var75[var79];
            long var65 = (long)((var19 << 2) + (var101.anInt_7405 > 0?1024:2048) + (var101.anInt_7406 + 256 << 12) + (var101.anInt_7407 + 256 << 22)) + ((long)(var97 << 24) + (long)(var88 << 8) + (long)var81 << 32);
            this.aShortArray_10228[var77] = this.method6896(var2, var2.aShortArray_1857[var79], var77, var65, var101.anInt_7405, var101.anInt_7406, var101.anInt_7407, 0, var86, var87);
            this.aShortArray_10229[var77] = this.method6896(var2, var2.aShortArray_1845[var79], var77, var65 + (long)var98, var101.anInt_7405, var101.anInt_7406, var101.anInt_7407, 0, var94, var93);
            this.aShortArray_10230[var77] = this.method6896(var2, var2.aShortArray_1869[var79], var77, var65 + (long)var99, var101.anInt_7405, var101.anInt_7406, var101.anInt_7407, 0, var96, var95);
         }

         if(var2.aByteArray_1864 != null) {
            this.aByteArray_10227[var77] = var2.aByteArray_1864[var79];
         }

         if(var2.aShortArray_1868 != null) {
            this.aShortArray_10237[var77] = var2.aShortArray_1868[var79];
         }

         this.aShortArray_10226[var77] = var2.aShortArray_1876[var79];
         this.aShortArray_10231[var77] = var91;
      }

      if(this.anInt_10212 > 0) {
         var77 = 1;
         var74 = this.aShortArray_10231[0];

         for(var88 = 0; var88 < this.anInt_10212; ++var88) {
            var80 = this.aShortArray_10231[var88];
            if(var80 != var74) {
               ++var77;
               var74 = var80;
            }
         }

         this.anIntArray_10253 = new int[var77];
         this.anIntArray_10254 = new int[var77];
         this.anIntArray_10252 = new int[var77 + 1];
         this.anIntArray_10252[0] = 0;
         var88 = this.anInt_10214;
         var80 = 0;
         var77 = 0;
         var74 = this.aShortArray_10231[0];

         for(var81 = 0; var81 < this.anInt_10212; ++var81) {
            var91 = this.aShortArray_10231[var81];
            if(var91 != var74) {
               this.anIntArray_10253[var77] = var88;
               this.anIntArray_10254[var77] = var80 - var88 + 1;
               ++var77;
               this.anIntArray_10252[var77] = var81;
               var88 = this.anInt_10214;
               var80 = 0;
               var74 = var91;
            }

            short var92 = this.aShortArray_10228[var81];
            if(var92 < var88) {
               var88 = var92;
            }

            if(var92 > var80) {
               var80 = var92;
            }

            var92 = this.aShortArray_10229[var81];
            if(var92 < var88) {
               var88 = var92;
            }

            if(var92 > var80) {
               var80 = var92;
            }

            var92 = this.aShortArray_10230[var81];
            if(var92 < var88) {
               var88 = var92;
            }

            if(var92 > var80) {
               var80 = var92;
            }
         }

         this.anIntArray_10253[var77] = var88;
         this.anIntArray_10254[var77] = var80 - var88 + 1;
         ++var77;
         this.anIntArray_10252[var77] = this.anInt_10212;
      }

      this.aLongArray_10200 = null;
      this.aShortArray_10221 = method6890(this.aShortArray_10221, this.anInt_10214);
      this.aShortArray_10216 = method6890(this.aShortArray_10216, this.anInt_10214);
      this.aShortArray_10217 = method6890(this.aShortArray_10217, this.anInt_10214);
      this.aShortArray_10203 = method6890(this.aShortArray_10203, this.anInt_10214);
      this.aShortArray_10219 = method6890(this.aShortArray_10219, this.anInt_10214);
      this.aByteArray_10220 = method6897(this.aByteArray_10220, this.anInt_10214);
      this.aFloatArray_10250 = method6901(this.aFloatArray_10250, this.anInt_10214);
      this.aFloatArray_10222 = method6901(this.aFloatArray_10222, this.anInt_10214);
      if(var2.anIntArray_1844 != null && Class73.method847(var3, this.anInt_10204)) {
         this.anIntArrayArray_10240 = var2.method1233(false);
      }

      if(var2.aClass107Array_1884 != null && Class73.method848(var3, this.anInt_10204)) {
         this.anIntArrayArray_10215 = var2.method1225();
      }

      if(var2.anIntArray_1866 != null && Class73.method846(var3, this.anInt_10204)) {
         var77 = 0;
         int[] var84 = new int[256];

         for(var88 = 0; var88 < this.anInt_10224; ++var88) {
            var19 = var2.anIntArray_1866[var8[var88]];
            if(var19 >= 0) {
               ++var84[var19];
               if(var19 > var77) {
                  var77 = var19;
               }
            }
         }

         this.anIntArrayArray_10263 = new int[var77 + 1][];

         for(var88 = 0; var88 <= var77; ++var88) {
            this.anIntArrayArray_10263[var88] = new int[var84[var88]];
            var84[var88] = 0;
         }

         for(var88 = 0; var88 < this.anInt_10224; ++var88) {
            var19 = var2.anIntArray_1866[var8[var88]];
            if(var19 >= 0) {
               this.anIntArrayArray_10263[var19][var84[var19]++] = var88;
            }
         }
      }

   }

   public byte[] method2048() {
      return this.aByteArray_10227;
   }

   public int method2015() {
      return this.anInt_10261;
   }

   public void method2017(int var1) {
      int var2 = Class362.cosArray[var1];
      int var3 = Class362.sinArray[var1];

      for(int var4 = 0; var4 < this.anInt_10208; ++var4) {
         int var5 = this.anIntArray_10211[var4] * var2 + this.anIntArray_10209[var4] * var3 >> 14;
         this.anIntArray_10211[var4] = this.anIntArray_10211[var4] * var3 - this.anIntArray_10209[var4] * var2 >> 14;
         this.anIntArray_10209[var4] = var5;
      }

      this.method6854();
      this.aBoolean_10245 = false;
   }

   public void method2016() {
      if(this.anInt_10214 > 0 && this.anInt_10212 > 0) {
         this.method6893();
         this.method6892();
         this.method6853();
      }
   }

   boolean method6851(int var1, int var2, int var3, int var4, Viewport var5, boolean var6, int var7) {
      ArrayViewport var8 = this.aRenderer_Sub3_10202.anArrayViewport_10527;
      var8.setViewport(var5);
      var8.method4580(this.aRenderer_Sub3_10202.anArrayViewport_10541);
      boolean var9 = false;
      float var10 = Float.MAX_VALUE;
      float var11 = -3.4028235E38F;
      float var12 = Float.MAX_VALUE;
      float var13 = -3.4028235E38F;
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      int var14 = this.anInt_10266 - this.anInt_10248 >> 1;
      int var15 = this.anInt_10233 - this.anInt_10206 >> 1;
      int var16 = this.anInt_10246 - this.anInt_10264 >> 1;
      int var17 = this.anInt_10248 + var14;
      int var18 = this.anInt_10206 + var15;
      int var19 = this.anInt_10264 + var16;
      int var20 = var17 - (var14 << var7);
      int var21 = var18 - (var15 << var7);
      int var22 = var19 - (var16 << var7);
      int var23 = var17 + (var14 << var7);
      int var24 = var18 + (var15 << var7);
      int var25 = var19 + (var16 << var7);
      this.anIntArray_10243[0] = var20;
      this.anIntArray_10234[0] = var21;
      this.anIntArray_10269[0] = var22;
      this.anIntArray_10243[1] = var23;
      this.anIntArray_10234[1] = var21;
      this.anIntArray_10269[1] = var22;
      this.anIntArray_10243[2] = var20;
      this.anIntArray_10234[2] = var24;
      this.anIntArray_10269[2] = var22;
      this.anIntArray_10243[3] = var23;
      this.anIntArray_10234[3] = var24;
      this.anIntArray_10269[3] = var22;
      this.anIntArray_10243[4] = var20;
      this.anIntArray_10234[4] = var21;
      this.anIntArray_10269[4] = var25;
      this.anIntArray_10243[5] = var23;
      this.anIntArray_10234[5] = var21;
      this.anIntArray_10269[5] = var25;
      this.anIntArray_10243[6] = var20;
      this.anIntArray_10234[6] = var24;
      this.anIntArray_10269[6] = var25;
      this.anIntArray_10243[7] = var23;
      this.anIntArray_10234[7] = var24;
      this.anIntArray_10269[7] = var25;

      float var27;
      int var26;
      float var29;
      float var28;
      float var31;
      float var30;
      float var32;
      float var33;
      for(var26 = 0; var26 < 8; ++var26) {
         var27 = (float)this.anIntArray_10243[var26];
         var28 = (float)this.anIntArray_10234[var26];
         var29 = (float)this.anIntArray_10269[var26];
         var30 = var8.data[2] * var27 + var8.data[6] * var28 + var8.data[10] * var29 + var8.data[14];
         var31 = var8.data[3] * var27 + var8.data[7] * var28 + var8.data[11] * var29 + var8.data[15];
         if(var30 >= -var31) {
            var32 = var8.data[0] * var27 + var8.data[4] * var28 + var8.data[8] * var29 + var8.data[12];
            var33 = var8.data[1] * var27 + var8.data[5] * var28 + var8.data[9] * var29 + var8.data[13];
            float var34 = this.aRenderer_Sub3_10202.aFloat_10544 + this.aRenderer_Sub3_10202.aFloat_10545 * var32 / var31;
            float var35 = this.aRenderer_Sub3_10202.aFloat_10546 + this.aRenderer_Sub3_10202.aFloat_10547 * var33 / var31;
            if(var34 < var10) {
               var10 = var34;
            }

            if(var34 > var11) {
               var11 = var34;
            }

            if(var35 < var12) {
               var12 = var35;
            }

            if(var35 > var13) {
               var13 = var35;
            }

            var9 = true;
         }
      }

      var26 = var1 + var3;
      int var41 = var2 + var4;
      if(var9 && (float)var26 > var10 && (float)var1 < var11 && (float)var41 > var12 && (float)var2 < var13) {
         if(var6) {
            return true;
         }

         if(this.anIntArray_10265.length < this.anInt_10214) {
            this.anIntArray_10265 = new int[this.anInt_10214];
            this.anIntArray_10210 = new int[this.anInt_10214];
         }

         int var40;
         for(var40 = 0; var40 < this.anInt_10208; ++var40) {
            var27 = (float)this.anIntArray_10209[var40];
            var28 = (float)this.anIntArray_10235[var40];
            var29 = (float)this.anIntArray_10211[var40];
            var30 = var8.data[2] * var27 + var8.data[6] * var28 + var8.data[10] * var29 + var8.data[14];
            var31 = var8.data[3] * var27 + var8.data[7] * var28 + var8.data[11] * var29 + var8.data[15];
            int var38;
            int var39;
            int var36;
            int var37;
            if(var30 >= -var31) {
               var32 = var8.data[0] * var27 + var8.data[4] * var28 + var8.data[8] * var29 + var8.data[12];
               var33 = var8.data[1] * var27 + var8.data[5] * var28 + var8.data[9] * var29 + var8.data[13];
               var36 = this.anIntArray_10255[var40];
               var37 = this.anIntArray_10255[var40 + 1];

               for(var38 = var36; var38 < var37; ++var38) {
                  var39 = this.aShortArray_10256[var38] - 1;
                  if(var39 == -1) {
                     break;
                  }

                  this.anIntArray_10265[var39] = (int)(this.aRenderer_Sub3_10202.aFloat_10544 + this.aRenderer_Sub3_10202.aFloat_10545 * var32 / var31);
                  this.anIntArray_10210[var39] = (int)(this.aRenderer_Sub3_10202.aFloat_10546 + this.aRenderer_Sub3_10202.aFloat_10547 * var33 / var31);
               }
            } else {
               var36 = this.anIntArray_10255[var40];
               var37 = this.anIntArray_10255[var40 + 1];

               for(var38 = var36; var38 < var37; ++var38) {
                  var39 = this.aShortArray_10256[var38] - 1;
                  if(var39 == -1) {
                     break;
                  }

                  this.anIntArray_10265[this.aShortArray_10256[var38] - 1] = -999999;
               }
            }
         }

         for(var40 = 0; var40 < this.anInt_10224; ++var40) {
            if(this.anIntArray_10265[this.aShortArray_10228[var40]] != -999999 && this.anIntArray_10265[this.aShortArray_10229[var40]] != -999999 && this.anIntArray_10265[this.aShortArray_10230[var40]] != -999999 && this.method6913(var1, var2, var26, var41, this.anIntArray_10210[this.aShortArray_10228[var40]], this.anIntArray_10210[this.aShortArray_10229[var40]], this.anIntArray_10210[this.aShortArray_10230[var40]], this.anIntArray_10265[this.aShortArray_10228[var40]], this.anIntArray_10265[this.aShortArray_10229[var40]], this.anIntArray_10265[this.aShortArray_10230[var40]])) {
               return true;
            }
         }
      }

      return false;
   }

   void method2025() {}

   void method6853() {
      if(this.aBoolean_10262) {
         this.aBoolean_10262 = false;
         if(this.aClass86Array_10257 == null && this.aClass172Array_10249 == null && this.aClass382Array_10260 == null && !Class73.method831(this.anInt_10261, this.anInt_10204)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if(this.anIntArray_10209 != null && !Class73.method852(this.anInt_10261, this.anInt_10204)) {
               if(this.aClass390_10207 != null && !this.aClass390_10207.method4902()) {
                  this.aBoolean_10262 = true;
               } else {
                  if(!this.aBoolean_10245) {
                     this.method6863();
                  }

                  var1 = true;
               }
            }

            if(this.anIntArray_10235 != null && !Class73.method843(this.anInt_10261, this.anInt_10204)) {
               if(this.aClass390_10207 != null && !this.aClass390_10207.method4902()) {
                  this.aBoolean_10262 = true;
               } else {
                  if(!this.aBoolean_10245) {
                     this.method6863();
                  }

                  var2 = true;
               }
            }

            if(this.anIntArray_10211 != null && !Class73.method830(this.anInt_10261, this.anInt_10204)) {
               if(this.aClass390_10207 != null && !this.aClass390_10207.method4902()) {
                  this.aBoolean_10262 = true;
               } else {
                  if(!this.aBoolean_10245) {
                     this.method6863();
                  }

                  var3 = true;
               }
            }

            if(var1) {
               this.anIntArray_10209 = null;
            }

            if(var2) {
               this.anIntArray_10235 = null;
            }

            if(var3) {
               this.anIntArray_10211 = null;
            }
         }

         if(this.aShortArray_10256 != null && this.anIntArray_10209 == null && this.anIntArray_10235 == null && this.anIntArray_10211 == null) {
            this.aShortArray_10256 = null;
            this.anIntArray_10255 = null;
         }

         if(this.aByteArray_10220 != null && !Class73.method853(this.anInt_10261, this.anInt_10204)) {
            label201: {
               label200: {
                  if((this.anInt_10204 & 55) != 0) {
                     if(this.aClass390_10238 != null && !this.aClass390_10238.method4902()) {
                        break label200;
                     }
                  } else if(this.aClass390_10236 != null && !this.aClass390_10236.method4902()) {
                     break label200;
                  }

                  this.aShortArray_10219 = null;
                  this.aShortArray_10203 = null;
                  this.aShortArray_10217 = null;
                  this.aByteArray_10220 = null;
                  break label201;
               }

               this.aBoolean_10262 = true;
            }
         }

         if(this.aShortArray_10226 != null && !Class73.method844(this.anInt_10261, this.anInt_10204)) {
            if(this.aClass390_10236 != null && !this.aClass390_10236.method4902()) {
               this.aBoolean_10262 = true;
            } else {
               this.aShortArray_10226 = null;
            }
         }

         if(this.aByteArray_10227 != null && !Class73.method855(this.anInt_10261, this.anInt_10204)) {
            if(this.aClass390_10236 != null && !this.aClass390_10236.method4902()) {
               this.aBoolean_10262 = true;
            } else {
               this.aByteArray_10227 = null;
            }
         }

         if(this.aFloatArray_10250 != null && !Class73.method845(this.anInt_10261, this.anInt_10204)) {
            if(this.aClass390_10268 != null && !this.aClass390_10268.method4902()) {
               this.aBoolean_10262 = true;
            } else {
               this.aFloatArray_10222 = null;
               this.aFloatArray_10250 = null;
            }
         }

         if(this.aShortArray_10231 != null && !Class73.method849(this.anInt_10261, this.anInt_10204)) {
            if(this.aClass390_10236 != null && !this.aClass390_10236.method4902()) {
               this.aBoolean_10262 = true;
            } else {
               this.aShortArray_10231 = null;
            }
         }

         if(this.aShortArray_10228 != null && !Class73.method858(this.anInt_10261, this.anInt_10204)) {
            if((this.aClass74_10251 == null || this.aClass74_10251.method868()) && (this.aClass390_10236 == null || this.aClass390_10236.method4902())) {
               this.aShortArray_10230 = null;
               this.aShortArray_10229 = null;
               this.aShortArray_10228 = null;
            } else {
               this.aBoolean_10262 = true;
            }
         }

         if(this.aShortArray_10221 != null) {
            if(this.aClass390_10207 != null && !this.aClass390_10207.method4902()) {
               this.aBoolean_10262 = true;
            } else {
               this.aShortArray_10221 = null;
            }
         }

         if(this.aShortArray_10216 != null) {
            if(this.aClass390_10236 != null && !this.aClass390_10236.method4902()) {
               this.aBoolean_10262 = true;
            } else {
               this.aShortArray_10216 = null;
            }
         }

         if(this.anIntArrayArray_10263 != null && !Class73.method846(this.anInt_10261, this.anInt_10204)) {
            this.anIntArrayArray_10263 = (int[][])null;
            this.aShortArray_10237 = null;
         }

         if(this.anIntArrayArray_10240 != null && !Class73.method847(this.anInt_10261, this.anInt_10204)) {
            this.anIntArrayArray_10240 = (int[][])null;
            this.aShortArray_10213 = null;
         }

         if(this.anIntArrayArray_10215 != null && !Class73.method848(this.anInt_10261, this.anInt_10204)) {
            this.anIntArrayArray_10215 = (int[][])null;
         }

         if(this.anIntArray_10252 != null && (this.anInt_10261 & 2048) == 0 && (this.anInt_10261 & 262144) == 0) {
            this.anIntArray_10252 = null;
            this.anIntArray_10254 = null;
            this.anIntArray_10253 = null;
         }

      }
   }

   void method6854() {
      if(this.aClass390_10207 != null) {
         this.aClass390_10207.aBoolean_7512 = false;
      }

   }

   public int method2038() {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      return this.anInt_10247;
   }

   void method6856() {
      if((this.anInt_10204 & 55) != 0) {
         if(this.aClass390_10238 != null) {
            this.aClass390_10238.aBoolean_7512 = false;
         }
      } else if(this.aClass390_10236 != null) {
         this.aClass390_10236.aBoolean_7512 = false;
      }

   }

   void method6857() {
      if(this.aClass74_10251 != null) {
         this.aClass74_10251.aBoolean_1395 = false;
      }

   }

   public Class172[] method2040() {
      return this.aClass172Array_10249;
   }

   public void offset(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt_10208; ++var4) {
         if(var1 != 0) {
            this.anIntArray_10209[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray_10235[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray_10211[var4] += var3;
         }
      }

      this.method6854();
      this.aBoolean_10245 = false;
   }

   public void rotateY(int var1) {
      int var2 = Class362.cosArray[var1];
      int var3 = Class362.sinArray[var1];

      for(int var4 = 0; var4 < this.anInt_10208; ++var4) {
         int var5 = this.anIntArray_10235[var4] * var3 - this.anIntArray_10211[var4] * var2 >> 14;
         this.anIntArray_10211[var4] = this.anIntArray_10235[var4] * var2 + this.anIntArray_10211[var4] * var3 >> 14;
         this.anIntArray_10235[var4] = var5;
      }

      this.method6854();
      this.aBoolean_10245 = false;
   }

   public void rotateX(int var1) {
      int var2 = Class362.cosArray[var1];
      int var3 = Class362.sinArray[var1];

      for(int var4 = 0; var4 < this.anInt_10208; ++var4) {
         int var5 = this.anIntArray_10235[var4] * var2 + this.anIntArray_10209[var4] * var3 >> 14;
         this.anIntArray_10235[var4] = this.anIntArray_10235[var4] * var3 - this.anIntArray_10209[var4] * var2 >> 14;
         this.anIntArray_10209[var4] = var5;
      }

      this.method6854();
      this.aBoolean_10245 = false;
   }

   public void method2021() {
      int var1;
      for(var1 = 0; var1 < this.anInt_10208; ++var1) {
         this.anIntArray_10211[var1] = -this.anIntArray_10211[var1];
      }

      for(var1 = 0; var1 < this.anInt_10214; ++var1) {
         this.aShortArray_10219[var1] = (short)(-this.aShortArray_10219[var1]);
      }

      for(var1 = 0; var1 < this.anInt_10224; ++var1) {
         short var2 = this.aShortArray_10228[var1];
         this.aShortArray_10228[var1] = this.aShortArray_10230[var1];
         this.aShortArray_10230[var1] = var2;
      }

      this.method6854();
      this.method6856();
      this.method6857();
      this.aBoolean_10245 = false;
   }

   void method6863() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.anInt_10208; ++var9) {
         int var10 = this.anIntArray_10209[var9];
         int var11 = this.anIntArray_10235[var9];
         int var12 = this.anIntArray_10211[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.anInt_10248 = var1;
      this.anInt_10266 = var4;
      this.anInt_10206 = var2;
      this.anInt_10233 = var5;
      this.anInt_10264 = var3;
      this.anInt_10246 = var6;
      this.anInt_10232 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.anInt_10247 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.aBoolean_10245 = true;
   }

   public int method2037() {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      return this.anInt_10232;
   }

   public int method2039() {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      return this.anInt_10248;
   }

   public int method2022() {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      return this.anInt_10266;
   }

   public int method2041() {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      return this.anInt_10206;
   }

   public Model copy(byte var1, int var2, boolean var3) {
      boolean var4 = false;
      Class165_Sub1 var5;
      Class165_Sub1 var6;
      if(var1 > 0 && var1 <= 7) {
         var5 = this.aRenderer_Sub3_10202.aClass165_Sub1Array_10659[var1 - 1];
         var6 = this.aRenderer_Sub3_10202.aClass165_Sub1Array_10658[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class165_Sub1(this.aRenderer_Sub3_10202, 0, 0, true, false);
      }

      return this.method6904(var6, var5, var2, var4, var3);
   }

   public int method2065() {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      return this.anInt_10264;
   }

   public int method2043() {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      return this.anInt_10246;
   }

   public void method2044(int var1) {
      this.aShort_10205 = (short)var1;
      this.method6898();
   }

   public void method2028(int var1) {
      this.aShort_10258 = (short)var1;
      this.method6854();
      this.method6856();
   }

   public int method2046() {
      return this.aShort_10205;
   }

   public int method2047() {
      return this.aShort_10258;
   }

   public void method2060(byte var1, byte[] var2) {
      int var3;
      if(var2 == null) {
         for(var3 = 0; var3 < this.anInt_10224; ++var3) {
            this.aByteArray_10227[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.anInt_10224; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.aByteArray_10227[var3] = (byte)var4;
         }
      }

      this.method6898();
   }

   public void method2049(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.anInt_10224; ++var5) {
         int var6 = this.aShortArray_10226[var5] & '\uffff';
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

         this.aShortArray_10226[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if(this.aClass382Array_10260 != null) {
         for(var5 = 0; var5 < this.anInt_10259; ++var5) {
            Class382 var10 = this.aClass382Array_10260[var5];
            Class391 var11 = this.aClass391Array_10244[var5];
            var11.anInt_7518 = var11.anInt_7518 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10226[var10.anInt_7386] & '\uffff'] & 16777215;
         }
      }

      this.method6898();
   }

   public boolean method2066() {
      if(this.aShortArray_10231 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray_10231.length; ++var1) {
            if(this.aShortArray_10231[var1] != -1 && !this.aRenderer_Sub3_10202.aClass58_10599.method566(this.aRenderer_Sub3_10202.aClass163_2802.method1996(this.aShortArray_10231[var1], (byte)2), -1)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method2058() {
      return this.aBoolean_10241;
   }

   public boolean method2051() {
      return this.aBoolean_10242;
   }

   void method2064() {}

   boolean method2031() {
      if(this.anIntArrayArray_10240 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt_10218; ++var1) {
            this.anIntArray_10209[var1] <<= 4;
            this.anIntArray_10235[var1] <<= 4;
            this.anIntArray_10211[var1] <<= 4;
         }

         this.anInt_10270 = 0;
         this.anInt_10271 = 0;
         this.anInt_10272 = 0;
         return true;
      }
   }

   void method2033(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var51;
      int[] var50;
      int var48;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         this.anInt_10270 = 0;
         this.anInt_10271 = 0;
         this.anInt_10272 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var48 = var2[var11];
            if(var48 < this.anIntArrayArray_10240.length) {
               var50 = this.anIntArrayArray_10240[var48];

               for(var51 = 0; var51 < var50.length; ++var51) {
                  var15 = var50[var51];
                  if(this.aShortArray_10213 == null || (var7 & this.aShortArray_10213[var15]) != 0) {
                     this.anInt_10270 += this.anIntArray_10209[var15];
                     this.anInt_10271 += this.anIntArray_10235[var15];
                     this.anInt_10272 += this.anIntArray_10211[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.anInt_10270 = this.anInt_10270 / var10 + var3;
            this.anInt_10271 = this.anInt_10271 / var10 + var4;
            this.anInt_10272 = this.anInt_10272 / var10 + var5;
            this.aBoolean_10273 = true;
         } else {
            this.anInt_10270 = var3;
            this.anInt_10271 = var4;
            this.anInt_10272 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var48 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var48;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray_10240.length) {
                  var12 = this.anIntArrayArray_10240[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var51 = var12[var13];
                     if(this.aShortArray_10213 == null || (var7 & this.aShortArray_10213[var51]) != 0) {
                        this.anIntArray_10209[var51] += var3;
                        this.anIntArray_10235[var51] += var4;
                        this.anIntArray_10211[var51] += var5;
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
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBoolean_10273) {
                     var16 = var8[0] * this.anInt_10270 + var8[3] * this.anInt_10271 + var8[6] * this.anInt_10272 + 8192 >> 14;
                     var17 = var8[1] * this.anInt_10270 + var8[4] * this.anInt_10271 + var8[7] * this.anInt_10272 + 8192 >> 14;
                     var18 = var8[2] * this.anInt_10270 + var8[5] * this.anInt_10271 + var8[8] * this.anInt_10272 + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     this.anInt_10270 = var16;
                     this.anInt_10271 = var17;
                     this.anInt_10272 = var18;
                     this.aBoolean_10273 = false;
                  }

                  int[] var53 = new int[9];
                  var17 = Class362.sinArray[var3];
                  var18 = Class362.cosArray[var3];
                  var19 = Class362.sinArray[var4];
                  var20 = Class362.cosArray[var4];
                  var21 = Class362.sinArray[var5];
                  var22 = Class362.cosArray[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var53[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var53[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var53[2] = var20 * var17 + 8192 >> 14;
                  var53[3] = var17 * var22 + 8192 >> 14;
                  var53[4] = var17 * var21 + 8192 >> 14;
                  var53[5] = -var18;
                  var53[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var53[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var53[8] = var19 * var17 + 8192 >> 14;
                  int var54 = var53[0] * -this.anInt_10270 + var53[1] * -this.anInt_10271 + var53[2] * -this.anInt_10272 + 8192 >> 14;
                  var26 = var53[3] * -this.anInt_10270 + var53[4] * -this.anInt_10271 + var53[5] * -this.anInt_10272 + 8192 >> 14;
                  var27 = var53[6] * -this.anInt_10270 + var53[7] * -this.anInt_10271 + var53[8] * -this.anInt_10272 + 8192 >> 14;
                  var28 = var54 + this.anInt_10270;
                  int var55 = var26 + this.anInt_10271;
                  var30 = var27 + this.anInt_10272;
                  int[] var56 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var57 = 0; var57 < 3; ++var57) {
                           var34 += var53[var32 * 3 + var57] * var8[var33 * 3 + var57];
                        }

                        var56[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var53[0] * var13 + var53[1] * var51 + var53[2] * var15 + 8192 >> 14;
                  var33 = var53[3] * var13 + var53[4] * var51 + var53[5] * var15 + 8192 >> 14;
                  var34 = var53[6] * var13 + var53[7] * var51 + var53[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var55;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var56[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var48;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray_10240.length) {
                        int[] var41 = this.anIntArrayArray_10240[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray_10213 == null || (var7 & this.aShortArray_10213[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray_10209[var43] + var35[1] * this.anIntArray_10235[var43] + var35[2] * this.anIntArray_10211[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray_10209[var43] + var35[4] * this.anIntArray_10235[var43] + var35[5] * this.anIntArray_10211[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray_10209[var43] + var35[7] * this.anIntArray_10235[var43] + var35[8] * this.anIntArray_10211[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray_10209[var43] = var44;
                              this.anIntArray_10235[var43] = var45;
                              this.anIntArray_10211[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray_10240.length) {
                        var12 = this.anIntArrayArray_10240[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.aShortArray_10213 == null || (var7 & this.aShortArray_10213[var51]) != 0) {
                              this.anIntArray_10209[var51] -= this.anInt_10270;
                              this.anIntArray_10235[var51] -= this.anInt_10271;
                              this.anIntArray_10211[var51] -= this.anInt_10272;
                              if(var5 != 0) {
                                 var15 = Class362.cosArray[var5];
                                 var16 = Class362.sinArray[var5];
                                 var17 = this.anIntArray_10235[var51] * var15 + this.anIntArray_10209[var51] * var16 + 16383 >> 14;
                                 this.anIntArray_10235[var51] = this.anIntArray_10235[var51] * var16 - this.anIntArray_10209[var51] * var15 + 16383 >> 14;
                                 this.anIntArray_10209[var51] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class362.cosArray[var3];
                                 var16 = Class362.sinArray[var3];
                                 var17 = this.anIntArray_10235[var51] * var16 - this.anIntArray_10211[var51] * var15 + 16383 >> 14;
                                 this.anIntArray_10211[var51] = this.anIntArray_10235[var51] * var15 + this.anIntArray_10211[var51] * var16 + 16383 >> 14;
                                 this.anIntArray_10235[var51] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class362.cosArray[var4];
                                 var16 = Class362.sinArray[var4];
                                 var17 = this.anIntArray_10211[var51] * var15 + this.anIntArray_10209[var51] * var16 + 16383 >> 14;
                                 this.anIntArray_10211[var51] = this.anIntArray_10211[var51] * var16 - this.anIntArray_10209[var51] * var15 + 16383 >> 14;
                                 this.anIntArray_10209[var51] = var17;
                              }

                              this.anIntArray_10209[var51] += this.anInt_10270;
                              this.anIntArray_10235[var51] += this.anInt_10271;
                              this.anIntArray_10211[var51] += this.anInt_10272;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray_10240.length) {
                           var12 = this.anIntArrayArray_10240[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var51 = var12[var13];
                              if(this.aShortArray_10213 == null || (var7 & this.aShortArray_10213[var51]) != 0) {
                                 var15 = this.anIntArray_10255[var51];
                                 var16 = this.anIntArray_10255[var51 + 1];

                                 for(var17 = var15; var17 < var16; ++var17) {
                                    var18 = this.aShortArray_10256[var17] - 1;
                                    if(var18 == -1) {
                                       break;
                                    }

                                    if(var5 != 0) {
                                       var19 = Class362.cosArray[var5];
                                       var20 = Class362.sinArray[var5];
                                       var21 = this.aShortArray_10203[var18] * var19 + this.aShortArray_10217[var18] * var20 + 16383 >> 14;
                                       this.aShortArray_10203[var18] = (short)(this.aShortArray_10203[var18] * var20 - this.aShortArray_10217[var18] * var19 + 16383 >> 14);
                                       this.aShortArray_10217[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Class362.cosArray[var3];
                                       var20 = Class362.sinArray[var3];
                                       var21 = this.aShortArray_10203[var18] * var20 - this.aShortArray_10219[var18] * var19 + 16383 >> 14;
                                       this.aShortArray_10219[var18] = (short)(this.aShortArray_10203[var18] * var19 + this.aShortArray_10219[var18] * var20 + 16383 >> 14);
                                       this.aShortArray_10203[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Class362.cosArray[var4];
                                       var20 = Class362.sinArray[var4];
                                       var21 = this.aShortArray_10219[var18] * var19 + this.aShortArray_10217[var18] * var20 + 16383 >> 14;
                                       this.aShortArray_10219[var18] = (short)(this.aShortArray_10219[var18] * var20 - this.aShortArray_10217[var18] * var19 + 16383 >> 14);
                                       this.aShortArray_10217[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     this.method6856();
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBoolean_10273) {
                     var16 = var8[0] * this.anInt_10270 + var8[3] * this.anInt_10271 + var8[6] * this.anInt_10272 + 8192 >> 14;
                     var17 = var8[1] * this.anInt_10270 + var8[4] * this.anInt_10271 + var8[7] * this.anInt_10272 + 8192 >> 14;
                     var18 = var8[2] * this.anInt_10270 + var8[5] * this.anInt_10271 + var8[8] * this.anInt_10272 + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     this.anInt_10270 = var16;
                     this.anInt_10271 = var17;
                     this.anInt_10272 = var18;
                     this.aBoolean_10273 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.anInt_10270 + 8192 >> 14;
                  var20 = var17 * -this.anInt_10271 + 8192 >> 14;
                  var21 = var18 * -this.anInt_10272 + 8192 >> 14;
                  var22 = var19 + this.anInt_10270;
                  var23 = var20 + this.anInt_10271;
                  var24 = var21 + this.anInt_10272;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var51 + 8192 >> 14;
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
                  var32 += var48;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray_10240.length) {
                        var35 = this.anIntArrayArray_10240[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray_10213 == null || (var7 & this.aShortArray_10213[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray_10209[var37] + var29[1] * this.anIntArray_10235[var37] + var29[2] * this.anIntArray_10211[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray_10209[var37] + var29[4] * this.anIntArray_10235[var37] + var29[5] * this.anIntArray_10211[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray_10209[var37] + var29[7] * this.anIntArray_10235[var37] + var29[8] * this.anIntArray_10211[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray_10209[var37] = var38;
                              this.anIntArray_10235[var37] = var39;
                              this.anIntArray_10211[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray_10240.length) {
                        var12 = this.anIntArrayArray_10240[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.aShortArray_10213 == null || (var7 & this.aShortArray_10213[var51]) != 0) {
                              this.anIntArray_10209[var51] -= this.anInt_10270;
                              this.anIntArray_10235[var51] -= this.anInt_10271;
                              this.anIntArray_10211[var51] -= this.anInt_10272;
                              this.anIntArray_10209[var51] = this.anIntArray_10209[var51] * var3 >> 7;
                              this.anIntArray_10235[var51] = this.anIntArray_10235[var51] * var4 >> 7;
                              this.anIntArray_10211[var51] = this.anIntArray_10211[var51] * var5 >> 7;
                              this.anIntArray_10209[var51] += this.anInt_10270;
                              this.anIntArray_10235[var51] += this.anInt_10271;
                              this.anIntArray_10211[var51] += this.anInt_10272;
                           }
                        }
                     }
                  }
               }

            } else {
               boolean var47;
               Class382 var49;
               Class391 var52;
               if(var1 == 5) {
                  if(this.anIntArrayArray_10263 != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.anIntArrayArray_10263.length) {
                           var50 = this.anIntArrayArray_10263[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.aShortArray_10237 == null || (var7 & this.aShortArray_10237[var15]) != 0) {
                                 var16 = (this.aByteArray_10227[var15] & 255) + var3 * 8;
                                 if(var16 < 0) {
                                    var16 = 0;
                                 } else if(var16 > 255) {
                                    var16 = 255;
                                 }

                                 this.aByteArray_10227[var15] = (byte)var16;
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.aClass382Array_10260 != null) {
                           for(var11 = 0; var11 < this.anInt_10259; ++var11) {
                              var49 = this.aClass382Array_10260[var11];
                              var52 = this.aClass391Array_10244[var11];
                              var52.anInt_7518 = var52.anInt_7518 & 16777215 | 255 - (this.aByteArray_10227[var49.anInt_7386] & 255) << 24;
                           }
                        }

                        this.method6898();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray_10263 != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.anIntArrayArray_10263.length) {
                           var50 = this.anIntArrayArray_10263[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.aShortArray_10237 == null || (var7 & this.aShortArray_10237[var15]) != 0) {
                                 var16 = this.aShortArray_10226[var15] & '\uffff';
                                 var17 = var16 >> 10 & 63;
                                 var18 = var16 >> 7 & 7;
                                 var19 = var16 & 127;
                                 var17 = var17 + var3 & 63;
                                 var18 += var4 / 4;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 7) {
                                    var18 = 7;
                                 }

                                 var19 += var5;
                                 if(var19 < 0) {
                                    var19 = 0;
                                 } else if(var19 > 127) {
                                    var19 = 127;
                                 }

                                 this.aShortArray_10226[var15] = (short)(var17 << 10 | var18 << 7 | var19);
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.aClass382Array_10260 != null) {
                           for(var11 = 0; var11 < this.anInt_10259; ++var11) {
                              var49 = this.aClass382Array_10260[var11];
                              var52 = this.aClass391Array_10244[var11];
                              var52.anInt_7518 = var52.anInt_7518 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10226[var49.anInt_7386] & '\uffff'] & 16777215;
                           }
                        }

                        this.method6898();
                     }
                  }

               } else {
                  Class391 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray_10215 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_10215.length) {
                              var12 = this.anIntArrayArray_10215[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass391Array_10244[var12[var13]];
                                 var14.anInt_7514 += var3;
                                 var14.anInt_7515 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray_10215 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_10215.length) {
                              var12 = this.anIntArrayArray_10215[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass391Array_10244[var12[var13]];
                                 var14.anInt_7517 = var14.anInt_7517 * var3 >> 7;
                                 var14.anInt_7516 = var14.anInt_7516 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray_10215 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray_10215.length) {
                              var12 = this.anIntArrayArray_10215[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass391Array_10244[var12[var13]];
                                 var14.anInt_7519 = var14.anInt_7519 + var3 & 16383;
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

   void method2032(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var23;
      int[] var25;
      int var24;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         this.anInt_10270 = 0;
         this.anInt_10271 = 0;
         this.anInt_10272 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            var23 = var2[var10];
            if(var23 < this.anIntArrayArray_10240.length) {
               var25 = this.anIntArrayArray_10240[var23];

               for(var24 = 0; var24 < var25.length; ++var24) {
                  var14 = var25[var24];
                  this.anInt_10270 += this.anIntArray_10209[var14];
                  this.anInt_10271 += this.anIntArray_10235[var14];
                  this.anInt_10272 += this.anIntArray_10211[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt_10270 = this.anInt_10270 / var9 + var3;
            this.anInt_10271 = this.anInt_10271 / var9 + var4;
            this.anInt_10272 = this.anInt_10272 / var9 + var5;
         } else {
            this.anInt_10270 = var3;
            this.anInt_10271 = var4;
            this.anInt_10272 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray_10240.length) {
                  var11 = this.anIntArrayArray_10240[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var24 = var11[var12];
                     this.anIntArray_10209[var24] += var3;
                     this.anIntArray_10235[var24] += var4;
                     this.anIntArray_10211[var24] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var17;
            int var16;
            int var18;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray_10240.length) {
                     var11 = this.anIntArrayArray_10240[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var24 = var11[var12];
                           this.anIntArray_10209[var24] -= this.anInt_10270;
                           this.anIntArray_10235[var24] -= this.anInt_10271;
                           this.anIntArray_10211[var24] -= this.anInt_10272;
                           if(var5 != 0) {
                              var14 = Class362.cosArray[var5];
                              var15 = Class362.sinArray[var5];
                              var16 = this.anIntArray_10235[var24] * var14 + this.anIntArray_10209[var24] * var15 + 16383 >> 14;
                              this.anIntArray_10235[var24] = this.anIntArray_10235[var24] * var15 - this.anIntArray_10209[var24] * var14 + 16383 >> 14;
                              this.anIntArray_10209[var24] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class362.cosArray[var3];
                              var15 = Class362.sinArray[var3];
                              var16 = this.anIntArray_10235[var24] * var15 - this.anIntArray_10211[var24] * var14 + 16383 >> 14;
                              this.anIntArray_10211[var24] = this.anIntArray_10235[var24] * var14 + this.anIntArray_10211[var24] * var15 + 16383 >> 14;
                              this.anIntArray_10235[var24] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class362.cosArray[var4];
                              var15 = Class362.sinArray[var4];
                              var16 = this.anIntArray_10211[var24] * var14 + this.anIntArray_10209[var24] * var15 + 16383 >> 14;
                              this.anIntArray_10211[var24] = this.anIntArray_10211[var24] * var15 - this.anIntArray_10209[var24] * var14 + 16383 >> 14;
                              this.anIntArray_10209[var24] = var16;
                           }

                           this.anIntArray_10209[var24] += this.anInt_10270;
                           this.anIntArray_10235[var24] += this.anInt_10271;
                           this.anIntArray_10211[var24] += this.anInt_10272;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var24 = var11[var12];
                           this.anIntArray_10209[var24] -= this.anInt_10270;
                           this.anIntArray_10235[var24] -= this.anInt_10271;
                           this.anIntArray_10211[var24] -= this.anInt_10272;
                           if(var3 != 0) {
                              var14 = Class362.cosArray[var3];
                              var15 = Class362.sinArray[var3];
                              var16 = this.anIntArray_10235[var24] * var15 - this.anIntArray_10211[var24] * var14 + 16383 >> 14;
                              this.anIntArray_10211[var24] = this.anIntArray_10235[var24] * var14 + this.anIntArray_10211[var24] * var15 + 16383 >> 14;
                              this.anIntArray_10235[var24] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class362.cosArray[var5];
                              var15 = Class362.sinArray[var5];
                              var16 = this.anIntArray_10235[var24] * var14 + this.anIntArray_10209[var24] * var15 + 16383 >> 14;
                              this.anIntArray_10235[var24] = this.anIntArray_10235[var24] * var15 - this.anIntArray_10209[var24] * var14 + 16383 >> 14;
                              this.anIntArray_10209[var24] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class362.cosArray[var4];
                              var15 = Class362.sinArray[var4];
                              var16 = this.anIntArray_10211[var24] * var14 + this.anIntArray_10209[var24] * var15 + 16383 >> 14;
                              this.anIntArray_10211[var24] = this.anIntArray_10211[var24] * var15 - this.anIntArray_10209[var24] * var14 + 16383 >> 14;
                              this.anIntArray_10209[var24] = var16;
                           }

                           this.anIntArray_10209[var24] += this.anInt_10270;
                           this.anIntArray_10235[var24] += this.anInt_10271;
                           this.anIntArray_10211[var24] += this.anInt_10272;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray_10240.length) {
                        var11 = this.anIntArrayArray_10240[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var24 = var11[var12];
                           var14 = this.anIntArray_10255[var24];
                           var15 = this.anIntArray_10255[var24 + 1];

                           for(var16 = var14; var16 < var15; ++var16) {
                              var17 = this.aShortArray_10256[var16] - 1;
                              if(var17 == -1) {
                                 break;
                              }

                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class362.cosArray[var5];
                                 var19 = Class362.sinArray[var5];
                                 var20 = this.aShortArray_10203[var17] * var18 + this.aShortArray_10217[var17] * var19 + 16383 >> 14;
                                 this.aShortArray_10203[var17] = (short)(this.aShortArray_10203[var17] * var19 - this.aShortArray_10217[var17] * var18 + 16383 >> 14);
                                 this.aShortArray_10217[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class362.cosArray[var3];
                                 var19 = Class362.sinArray[var3];
                                 var20 = this.aShortArray_10203[var17] * var19 - this.aShortArray_10219[var17] * var18 + 16383 >> 14;
                                 this.aShortArray_10219[var17] = (short)(this.aShortArray_10203[var17] * var18 + this.aShortArray_10219[var17] * var19 + 16383 >> 14);
                                 this.aShortArray_10203[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class362.cosArray[var4];
                                 var19 = Class362.sinArray[var4];
                                 var20 = this.aShortArray_10219[var17] * var18 + this.aShortArray_10217[var17] * var19 + 16383 >> 14;
                                 this.aShortArray_10219[var17] = (short)(this.aShortArray_10219[var17] * var19 - this.aShortArray_10217[var17] * var18 + 16383 >> 14);
                                 this.aShortArray_10217[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  this.method6856();
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray_10240.length) {
                     var11 = this.anIntArrayArray_10240[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var24 = var11[var12];
                        this.anIntArray_10209[var24] -= this.anInt_10270;
                        this.anIntArray_10235[var24] -= this.anInt_10271;
                        this.anIntArray_10211[var24] -= this.anInt_10272;
                        this.anIntArray_10209[var24] = this.anIntArray_10209[var24] * var3 >> 7;
                        this.anIntArray_10235[var24] = this.anIntArray_10235[var24] * var4 >> 7;
                        this.anIntArray_10211[var24] = this.anIntArray_10211[var24] * var5 >> 7;
                        this.anIntArray_10209[var24] += this.anInt_10270;
                        this.anIntArray_10235[var24] += this.anInt_10271;
                        this.anIntArray_10211[var24] += this.anInt_10272;
                     }
                  }
               }

            } else {
               boolean var21;
               Class382 var22;
               Class391 var26;
               if(var1 == 5) {
                  if(this.anIntArrayArray_10263 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var23 = var2[var10];
                        if(var23 < this.anIntArrayArray_10263.length) {
                           var25 = this.anIntArrayArray_10263[var23];

                           for(var24 = 0; var24 < var25.length; ++var24) {
                              var14 = var25[var24];
                              var15 = (this.aByteArray_10227[var14] & 255) + var3 * 8;
                              if(var15 < 0) {
                                 var15 = 0;
                              } else if(var15 > 255) {
                                 var15 = 255;
                              }

                              this.aByteArray_10227[var14] = (byte)var15;
                           }

                           var21 |= var25.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass382Array_10260 != null) {
                           for(var10 = 0; var10 < this.anInt_10259; ++var10) {
                              var22 = this.aClass382Array_10260[var10];
                              var26 = this.aClass391Array_10244[var10];
                              var26.anInt_7518 = var26.anInt_7518 & 16777215 | 255 - (this.aByteArray_10227[var22.anInt_7386] & 255) << 24;
                           }
                        }

                        this.method6898();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray_10263 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var23 = var2[var10];
                        if(var23 < this.anIntArrayArray_10263.length) {
                           var25 = this.anIntArrayArray_10263[var23];

                           for(var24 = 0; var24 < var25.length; ++var24) {
                              var14 = var25[var24];
                              var15 = this.aShortArray_10226[var14] & '\uffff';
                              var16 = var15 >> 10 & 63;
                              var17 = var15 >> 7 & 7;
                              var18 = var15 & 127;
                              var16 = var16 + var3 & 63;
                              var17 += var4 / 4;
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

                              this.aShortArray_10226[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                           }

                           var21 |= var25.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass382Array_10260 != null) {
                           for(var10 = 0; var10 < this.anInt_10259; ++var10) {
                              var22 = this.aClass382Array_10260[var10];
                              var26 = this.aClass391Array_10244[var10];
                              var26.anInt_7518 = var26.anInt_7518 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10226[var22.anInt_7386] & '\uffff'] & 16777215;
                           }
                        }

                        this.method6898();
                     }
                  }

               } else {
                  Class391 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray_10215 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_10215.length) {
                              var11 = this.anIntArrayArray_10215[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass391Array_10244[var11[var12]];
                                 var13.anInt_7514 += var3;
                                 var13.anInt_7515 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray_10215 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_10215.length) {
                              var11 = this.anIntArrayArray_10215[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass391Array_10244[var11[var12]];
                                 var13.anInt_7517 = var13.anInt_7517 * var3 >> 7;
                                 var13.anInt_7516 = var13.anInt_7516 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray_10215 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray_10215.length) {
                              var11 = this.anIntArrayArray_10215[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass391Array_10244[var11[var12]];
                                 var13.anInt_7519 = var13.anInt_7519 + var3 & 16383;
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

   public void applyViewport(Viewport var1, int var2, boolean var3) {
      if(this.aShortArray_10213 != null) {
         Viewport var4 = var1;
         if(var3) {
            var4 = this.aRenderer_Sub3_10202.aViewport_10526;
            var4.method4643(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt_10208; ++var6) {
            if((var2 & this.aShortArray_10213[var6]) != 0) {
               var4.method4635((float)this.anIntArray_10209[var6], (float)this.anIntArray_10235[var6], (float)this.anIntArray_10211[var6], var5);
               this.anIntArray_10209[var6] = (int)var5[0];
               this.anIntArray_10235[var6] = (int)var5[1];
               this.anIntArray_10211[var6] = (int)var5[2];
            }
         }

      }
   }

   public void method2023(int var1, int var2, Plane var3, Plane var4, int var5, int var6, int var7) {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      int var8 = var5 + this.anInt_10248;
      int var9 = var5 + this.anInt_10266;
      int var10 = var7 + this.anInt_10264;
      int var11 = var7 + this.anInt_10246;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.anInt_3031 * 69671577 >> var3.shiftAmount * 1694172417 < var3.maxWidth * 1658489349 && var10 >= 0 && var11 + var3.anInt_3031 * 69671577 >> var3.shiftAmount * 1694172417 < var3.maxHeight * 445373459) {
         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.shiftAmount * 1694172417;
            var9 = var9 + (var3.anInt_3031 * 69671577 - 1) >> var3.shiftAmount * 1694172417;
            var10 >>= var3.shiftAmount * 1694172417;
            var11 = var11 + (var3.anInt_3031 * 69671577 - 1) >> var3.shiftAmount * 1694172417;
            if(var3.method2155(var8, var10, (short)-8175) == var6 && var3.method2155(var9, var10, (short)-14359) == var6 && var3.method2155(var8, var11, (short)-5130) == var6 && var3.method2155(var9, var11, (short)-9214) == var6) {
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

         int var12;
         if(var1 == 1) {
            for(var12 = 0; var12 < this.anInt_10208; ++var12) {
               this.anIntArray_10235[var12] = this.anIntArray_10235[var12] + var3.getHeight(this.anIntArray_10209[var12] + var5, this.anIntArray_10211[var12] + var7) - var6;
            }
         } else {
            int var13;
            int var14;
            if(var1 == 2) {
               var12 = this.anInt_10206;
               if(var12 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.anInt_10208; ++var13) {
                  var14 = (this.anIntArray_10235[var13] << 16) / var12;
                  if(var14 < var2) {
                     this.anIntArray_10235[var13] += (var3.getHeight(this.anIntArray_10209[var13] + var5, this.anIntArray_10211[var13] + var7) - var6) * (var2 - var14) / var2;
                  }
               }
            } else {
               int var15;
               if(var1 == 3) {
                  var12 = (var2 & 255) * 4;
                  var13 = (var2 >> 8 & 255) * 4;
                  var14 = (var2 >> 16 & 255) << 6;
                  var15 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var12 >> 1) < 0 || var5 + (var12 >> 1) + var3.anInt_3031 * 69671577 >= var3.maxWidth * 1658489349 << var3.shiftAmount * 1694172417 || var7 - (var13 >> 1) < 0 || var7 + (var13 >> 1) + var3.anInt_3031 * 69671577 >= var3.maxHeight * 445373459 << var3.shiftAmount * 1694172417) {
                     return;
                  }

                  this.method2061(var3, var5, var6, var7, var12, var13, var14, var15);
               } else if(var1 == 4) {
                  var12 = this.anInt_10233 - this.anInt_10206;

                  for(var13 = 0; var13 < this.anInt_10208; ++var13) {
                     this.anIntArray_10235[var13] = this.anIntArray_10235[var13] + (var4.getHeight(this.anIntArray_10209[var13] + var5, this.anIntArray_10211[var13] + var7) - var6) + var12;
                  }
               } else if(var1 == 5) {
                  var12 = this.anInt_10233 - this.anInt_10206;

                  for(var13 = 0; var13 < this.anInt_10208; ++var13) {
                     var14 = this.anIntArray_10209[var13] + var5;
                     var15 = this.anIntArray_10211[var13] + var7;
                     int var16 = var3.getHeight(var14, var15);
                     int var17 = var4.getHeight(var14, var15);
                     int var18 = var16 - var17 - var2;
                     this.anIntArray_10235[var13] = ((this.anIntArray_10235[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         this.method6854();
         this.aBoolean_10245 = false;
      }
   }

   public void method2052(Viewport var1) {
      ArrayViewport var2 = this.aRenderer_Sub3_10202.anArrayViewport_10527;
      var2.setViewport(var1);
      int var3;
      if(this.aClass86Array_10257 != null) {
         for(var3 = 0; var3 < this.aClass86Array_10257.length; ++var3) {
            Class86 var4 = this.aClass86Array_10257[var3];
            Class86 var5 = var4;
            if(var4.aClass86_1742 != null) {
               var5 = var4.aClass86_1742;
            }

            var5.anInt_1747 = (int)(var2.data[12] + var2.data[0] * (float)this.anIntArray_10209[var4.anInt_1740 * -146104779] + var2.data[4] * (float)this.anIntArray_10235[var4.anInt_1740 * -146104779] + var2.data[8] * (float)this.anIntArray_10211[var4.anInt_1740 * -146104779]) * 346431023;
            var5.anInt_1741 = (int)(var2.data[13] + var2.data[1] * (float)this.anIntArray_10209[var4.anInt_1740 * -146104779] + var2.data[5] * (float)this.anIntArray_10235[var4.anInt_1740 * -146104779] + var2.data[9] * (float)this.anIntArray_10211[var4.anInt_1740 * -146104779]) * -1274764179;
            var5.anInt_1749 = (int)(var2.data[14] + var2.data[2] * (float)this.anIntArray_10209[var4.anInt_1740 * -146104779] + var2.data[6] * (float)this.anIntArray_10235[var4.anInt_1740 * -146104779] + var2.data[10] * (float)this.anIntArray_10211[var4.anInt_1740 * -146104779]) * 1829222211;
            var5.anInt_1750 = (int)(var2.data[12] + var2.data[0] * (float)this.anIntArray_10209[var4.anInt_1744 * -1747600183] + var2.data[4] * (float)this.anIntArray_10235[var4.anInt_1744 * -1747600183] + var2.data[8] * (float)this.anIntArray_10211[var4.anInt_1744 * -1747600183]) * 203218289;
            var5.anInt_1751 = (int)(var2.data[13] + var2.data[1] * (float)this.anIntArray_10209[var4.anInt_1744 * -1747600183] + var2.data[5] * (float)this.anIntArray_10235[var4.anInt_1744 * -1747600183] + var2.data[9] * (float)this.anIntArray_10211[var4.anInt_1744 * -1747600183]) * -91675159;
            var5.anInt_1752 = (int)(var2.data[14] + var2.data[2] * (float)this.anIntArray_10209[var4.anInt_1744 * -1747600183] + var2.data[6] * (float)this.anIntArray_10235[var4.anInt_1744 * -1747600183] + var2.data[10] * (float)this.anIntArray_10211[var4.anInt_1744 * -1747600183]) * -396351427;
            var5.anInt_1753 = (int)(var2.data[12] + var2.data[0] * (float)this.anIntArray_10209[var4.anInt_1745 * -2092357753] + var2.data[4] * (float)this.anIntArray_10235[var4.anInt_1745 * -2092357753] + var2.data[8] * (float)this.anIntArray_10211[var4.anInt_1745 * -2092357753]) * -527219251;
            var5.anInt_1743 = (int)(var2.data[13] + var2.data[1] * (float)this.anIntArray_10209[var4.anInt_1745 * -2092357753] + var2.data[5] * (float)this.anIntArray_10235[var4.anInt_1745 * -2092357753] + var2.data[9] * (float)this.anIntArray_10211[var4.anInt_1745 * -2092357753]) * -807730159;
            var5.anInt_1748 = (int)(var2.data[14] + var2.data[2] * (float)this.anIntArray_10209[var4.anInt_1745 * -2092357753] + var2.data[6] * (float)this.anIntArray_10235[var4.anInt_1745 * -2092357753] + var2.data[10] * (float)this.anIntArray_10211[var4.anInt_1745 * -2092357753]) * -277851451;
         }
      }

      if(this.aClass172Array_10249 != null) {
         for(var3 = 0; var3 < this.aClass172Array_10249.length; ++var3) {
            Class172 var6 = this.aClass172Array_10249[var3];
            Class172 var7 = var6;
            if(var6.aClass172_3035 != null) {
               var7 = var6.aClass172_3035;
            }

            if(var6.anArrayViewport_3038 != null) {
               var6.anArrayViewport_3038.replaceWith(var2);
            } else {
               var6.anArrayViewport_3038 = new ArrayViewport(var2);
            }

            var7.anInt_3034 = (int)(var2.data[12] + var2.data[0] * (float)this.anIntArray_10209[var6.anInt_3036 * 1218049443] + var2.data[4] * (float)this.anIntArray_10235[var6.anInt_3036 * 1218049443] + var2.data[8] * (float)this.anIntArray_10211[var6.anInt_3036 * 1218049443]) * -2049585273;
            var7.anInt_3039 = (int)(var2.data[13] + var2.data[1] * (float)this.anIntArray_10209[var6.anInt_3036 * 1218049443] + var2.data[5] * (float)this.anIntArray_10235[var6.anInt_3036 * 1218049443] + var2.data[9] * (float)this.anIntArray_10211[var6.anInt_3036 * 1218049443]) * -701126557;
            var7.anInt_3037 = (int)(var2.data[14] + var2.data[2] * (float)this.anIntArray_10209[var6.anInt_3036 * 1218049443] + var2.data[6] * (float)this.anIntArray_10235[var6.anInt_3036 * 1218049443] + var2.data[10] * (float)this.anIntArray_10211[var6.anInt_3036 * 1218049443]) * 93477565;
         }
      }

   }

   public Class240_Sub22_Sub7 method2054(Class240_Sub22_Sub7 var1) {
      if(this.anInt_10214 == 0) {
         return null;
      } else {
         if(!this.aBoolean_10245) {
            this.method6863();
         }

         int var2;
         int var3;
         if(this.aRenderer_Sub3_10202.anInt_10507 > 0) {
            var2 = this.anInt_10248 - (this.anInt_10233 * this.aRenderer_Sub3_10202.anInt_10507 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589;
            var3 = this.anInt_10266 - (this.anInt_10206 * this.aRenderer_Sub3_10202.anInt_10507 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589;
         } else {
            var2 = this.anInt_10248 - (this.anInt_10206 * this.aRenderer_Sub3_10202.anInt_10507 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589;
            var3 = this.anInt_10266 - (this.anInt_10233 * this.aRenderer_Sub3_10202.anInt_10507 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589;
         }

         int var4;
         int var5;
         if(this.aRenderer_Sub3_10202.anInt_10591 > 0) {
            var4 = this.anInt_10264 - (this.anInt_10233 * this.aRenderer_Sub3_10202.anInt_10591 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589;
            var5 = this.anInt_10246 - (this.anInt_10206 * this.aRenderer_Sub3_10202.anInt_10591 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589;
         } else {
            var4 = this.anInt_10264 - (this.anInt_10206 * this.aRenderer_Sub3_10202.anInt_10591 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589;
            var5 = this.anInt_10246 - (this.anInt_10233 * this.aRenderer_Sub3_10202.anInt_10591 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         Class240_Sub22_Sub7_Sub2 var8 = (Class240_Sub22_Sub7_Sub2)var1;
         Class240_Sub22_Sub7_Sub2 var9;
         if(var8 != null && var8.method2336(var6, var7)) {
            var9 = var8;
            var8.method2337();
         } else {
            var9 = new Class240_Sub22_Sub7_Sub2(this.aRenderer_Sub3_10202, var6, var7);
         }

         var9.method2335(var2, var4, var3, var5);
         this.method6888(var9);
         return var9;
      }
   }

   void method6888(Class240_Sub22_Sub7_Sub2 var1) {
      if(this.anIntArray_10265.length < this.anInt_10214) {
         this.anIntArray_10265 = new int[this.anInt_10214];
         this.anIntArray_10210 = new int[this.anInt_10214];
      }

      int var2 = 0;

      int var6;
      int var7;
      int var8;
      while(var2 < this.anInt_10208) {
         int var3 = (this.anIntArray_10209[var2] - (this.anIntArray_10235[var2] * this.aRenderer_Sub3_10202.anInt_10507 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589) - var1.anInt_3230;
         int var4 = (this.anIntArray_10211[var2] - (this.anIntArray_10235[var2] * this.aRenderer_Sub3_10202.anInt_10591 >> 8) >> this.aRenderer_Sub3_10202.anInt_10589) - var1.anInt_3228;
         int var5 = this.anIntArray_10255[var2];
         var6 = this.anIntArray_10255[var2 + 1];
         var7 = var5;

         while(true) {
            if(var7 < var6) {
               var8 = this.aShortArray_10256[var7] - 1;
               if(var8 != -1) {
                  this.anIntArray_10265[var8] = var3;
                  this.anIntArray_10210[var8] = var4;
                  ++var7;
                  continue;
               }
            }

            ++var2;
            break;
         }
      }

      for(var2 = 0; var2 < this.anInt_10212; ++var2) {
         if(this.aByteArray_10227 == null || this.aByteArray_10227[var2] <= 128) {
            short var12 = this.aShortArray_10228[var2];
            short var13 = this.aShortArray_10229[var2];
            short var14 = this.aShortArray_10230[var2];
            var6 = this.anIntArray_10265[var12];
            var7 = this.anIntArray_10265[var13];
            var8 = this.anIntArray_10265[var14];
            int var9 = this.anIntArray_10210[var12];
            int var10 = this.anIntArray_10210[var13];
            int var11 = this.anIntArray_10210[var14];
            if((var6 - var7) * (var10 - var11) - (var10 - var9) * (var8 - var7) > 0) {
               var1.method2334(var9, var10, var11, var6, var7, var8);
            }
         }
      }

   }

   public void method2030(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt_10224; ++var3) {
         if(this.aShortArray_10226[var3] == var1) {
            this.aShortArray_10226[var3] = var2;
         }
      }

      if(this.aClass382Array_10260 != null) {
         for(var3 = 0; var3 < this.anInt_10259; ++var3) {
            Class382 var4 = this.aClass382Array_10260[var3];
            Class391 var5 = this.aClass391Array_10244[var3];
            var5.anInt_7518 = var5.anInt_7518 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10226[var4.anInt_7386] & '\uffff'] & 16777215;
         }
      }

      this.method6898();
   }

   static short[] method6890(short[] var0, int var1) {
      short[] var2 = new short[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   void method6891(ArrayViewport var1) {
      if(this.aClass382Array_10260 != null) {
         this.aRenderer_Sub3_10202.enableZBuffering(!this.aBoolean_10241);
         Viewport var2 = this.aRenderer_Sub3_10202.aViewport_10526;
         Class28 var3 = this.aRenderer_Sub3_10202.aClass28_10611;

         for(int var4 = 0; var4 < this.anInt_10259; ++var4) {
            Class382 var5 = this.aClass382Array_10260[var4];
            Class391 var6 = this.aClass391Array_10244[var4];
            if(!var5.aBoolean_7393 || !this.aRenderer_Sub3_10202.method1989()) {
               float var7 = (float)(this.anIntArray_10209[var5.anInt_7391] + this.anIntArray_10209[var5.anInt_7387] + this.anIntArray_10209[var5.anInt_7388]) * 0.3333333F;
               float var8 = (float)(this.anIntArray_10235[var5.anInt_7391] + this.anIntArray_10235[var5.anInt_7387] + this.anIntArray_10235[var5.anInt_7388]) * 0.3333333F;
               float var9 = (float)(this.anIntArray_10211[var5.anInt_7391] + this.anIntArray_10211[var5.anInt_7387] + this.anIntArray_10211[var5.anInt_7388]) * 0.3333333F;
               float var10 = var1.data[0] * var7 + var1.data[4] * var8 + var1.data[8] * var9 + var1.data[12];
               float var11 = var1.data[1] * var7 + var1.data[5] * var8 + var1.data[9] * var9 + var1.data[13];
               float var12 = var1.data[2] * var7 + var1.data[6] * var8 + var1.data[10] * var9 + var1.data[14];
               float var13 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + var12 * var12))) * (float)var5.anInt_7389;
               var2.method4632(var6.anInt_7519, var6.anInt_7517 * var5.aShort_7390 >> 7, var6.anInt_7516 * var5.aShort_7392 >> 7, var10 + (float)var6.anInt_7514 - var10 * var13, var11 + (float)var6.anInt_7515 - var11 * var13, var12 - var12 * var13);
               var2.method4641(this.aRenderer_Sub3_10202.aViewport_10520);
               this.aRenderer_Sub3_10202.anArrayViewport_10578.setViewport(var2);
               var3.method206(this.aRenderer_Sub3_10202.anArrayViewport_10578);
               var3.anArrayViewport_795.reset();
               var3.anInt_796 = var6.anInt_7518;
               var3.aClass384_793 = null;
               if(var5.aShort_7394 != -1) {
                  var3.aClass384_793 = this.aRenderer_Sub3_10202.aClass58_10599.method565(this.aRenderer_Sub3_10202.aClass163_2802.method1996(var5.aShort_7394 & '\uffff', (byte)2));
               }

               var3.method205();
            }
         }

         this.aRenderer_Sub3_10202.enableZBuffering(true);
      }
   }

   boolean method6892() {
      if(this.aClass74_10251.aBoolean_1395) {
         return true;
      } else {
         if(this.aClass74_10251.aClass414_1398 == null) {
            this.aClass74_10251.aClass414_1398 = this.aRenderer_Sub3_10202.method7249(false);
         }

         Class414 var1 = this.aClass74_10251.aClass414_1398;
         var1.method5136(this.anInt_10212 * 6);
         Unsafe var2 = this.aRenderer_Sub3_10202.anUnsafe_10510;
         if(var2 != null) {
            int var8 = this.anInt_10212 * 6;
            long var4 = var1.method4851(0, var8);
            if(var4 == 0L) {
               return false;
            } else {
               for(int var6 = 0; var6 < this.anInt_10212; ++var6) {
                  var2.putShort(var4, this.aShortArray_10228[var6]);
                  var4 += 2L;
                  var2.putShort(var4, this.aShortArray_10229[var6]);
                  var4 += 2L;
                  var2.putShort(var4, this.aShortArray_10230[var6]);
                  var4 += 2L;
               }

               var1.method4852();
               this.aClass74_10251.aClass414_1397 = var1;
               this.aClass74_10251.aBoolean_1395 = true;
               this.aBoolean_10262 = true;
               return true;
            }
         } else {
            ByteBuffer var3 = this.aRenderer_Sub3_10202.aByteBuffer_10646;
            var3.clear();

            for(int var7 = 0; var7 < this.anInt_10212; ++var7) {
               var3.putShort(this.aShortArray_10228[var7]);
               var3.putShort(this.aShortArray_10229[var7]);
               var3.putShort(this.aShortArray_10230[var7]);
            }

            if(var1.method4853(0, var3.position(), this.aRenderer_Sub3_10202.aLong_10629)) {
               this.aClass74_10251.aClass414_1397 = var1;
               this.aClass74_10251.aBoolean_1395 = true;
               this.aBoolean_10262 = true;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   boolean method6893() {
      boolean var1 = !this.aClass390_10236.aBoolean_7512;
      boolean var2 = (this.anInt_10204 & 55) != 0 && !this.aClass390_10238.aBoolean_7512;
      boolean var3 = !this.aClass390_10207.aBoolean_7512;
      boolean var4 = !this.aClass390_10268.aBoolean_7512;
      if(!var3 && !var1 && !var2 && !var4) {
         return true;
      } else {
         boolean var5 = true;
         Class76 var6;
         Unsafe var7;
         int var8;
         long var9;
         int var11;
         short var12;
         int var13;
         ByteBuffer var34;
         if(var3 && this.aShortArray_10221 != null) {
            if(this.aClass390_10207.aClass76_7513 == null) {
               this.aClass390_10207.aClass76_7513 = this.aRenderer_Sub3_10202.method7320(this.aBoolean_10239);
            }

            var6 = this.aClass390_10207.aClass76_7513;
            var6.method981(this.anInt_10214 * 12, 12);
            var7 = this.aRenderer_Sub3_10202.anUnsafe_10510;
            if(var7 != null) {
               var8 = this.anInt_10214 * 12;
               var9 = var6.method4851(0, var8);

               for(var11 = 0; var11 < this.anInt_10214; ++var11) {
                  var12 = this.aShortArray_10221[var11];
                  var7.putFloat(var9, (float)this.anIntArray_10209[var12]);
                  var9 += 4L;
                  var7.putFloat(var9, (float)this.anIntArray_10235[var12]);
                  var9 += 4L;
                  var7.putFloat(var9, (float)this.anIntArray_10211[var12]);
                  var9 += 4L;
               }

               var6.method4852();
            } else {
               var34 = this.aRenderer_Sub3_10202.aByteBuffer_10646;
               var34.clear();

               for(var13 = 0; var13 < this.anInt_10214; ++var13) {
                  var34.putFloat((float)this.anIntArray_10209[this.aShortArray_10221[var13]]);
                  var34.putFloat((float)this.anIntArray_10235[this.aShortArray_10221[var13]]);
                  var34.putFloat((float)this.anIntArray_10211[this.aShortArray_10221[var13]]);
               }

               var6.method4853(0, var34.position(), this.aRenderer_Sub3_10202.aLong_10629);
            }

            this.aClass390_10207.aClass76_7510 = var6;
            this.aClass390_10207.aBoolean_7512 = true;
         }

         short[] var38;
         int var42;
         int var45;
         if(var1) {
            if(this.aClass390_10236.aClass76_7513 == null) {
               this.aClass390_10236.aClass76_7513 = this.aRenderer_Sub3_10202.method7320(this.aBoolean_10239);
            }

            var6 = this.aClass390_10236.aClass76_7513;
            var6.method981(this.anInt_10214 * 4, 4);
            var7 = this.aRenderer_Sub3_10202.anUnsafe_10510;
            int var18;
            float var21;
            float var23;
            int var27;
            short[] var37;
            if(var7 != null) {
               var8 = this.anInt_10214 * 4;
               var9 = var6.method4851(0, var8);
               if((this.anInt_10204 & 55) == 0) {
                  short[] var14;
                  byte[] var15;
                  short[] var36;
                  if(this.aClass395_10223 != null) {
                     var37 = this.aClass395_10223.aShortArray_7564;
                     var36 = this.aClass395_10223.aShortArray_7562;
                     var14 = this.aClass395_10223.aShortArray_7563;
                     var15 = this.aClass395_10223.aByteArray_7561;
                  } else {
                     var37 = this.aShortArray_10217;
                     var36 = this.aShortArray_10203;
                     var14 = this.aShortArray_10219;
                     var15 = this.aByteArray_10220;
                  }

                  float var16 = this.aRenderer_Sub3_10202.aFloat_10561 * 768.0F / (float)this.aShort_10258;
                  float var17 = this.aRenderer_Sub3_10202.aFloat_10584 * 768.0F / (float)this.aShort_10258;

                  for(var18 = 0; var18 < this.anInt_10214; ++var18) {
                     short var19 = this.aShortArray_10216[var18];
                     int var20 = this.method6895(this.aShortArray_10226[var19] & '\uffff', this.aShortArray_10231[var19], this.aShort_10205);
                     var21 = (float)(var20 >> 16 & 255) * this.aRenderer_Sub3_10202.aFloat_10579;
                     float var22 = (float)(var20 >> 8 & 255) * this.aRenderer_Sub3_10202.aFloat_10580;
                     var23 = (float)(var20 & 255) * this.aRenderer_Sub3_10202.aFloat_10651;
                     byte var24 = var15[var18];
                     float var25;
                     if(var24 == 0) {
                        var25 = (this.aRenderer_Sub3_10202.aFloatArray_10574[0] * (float)var37[var18] + this.aRenderer_Sub3_10202.aFloatArray_10574[1] * (float)var36[var18] + this.aRenderer_Sub3_10202.aFloatArray_10574[2] * (float)var14[var18]) * 0.0026041667F;
                     } else {
                        var25 = (this.aRenderer_Sub3_10202.aFloatArray_10574[0] * (float)var37[var18] + this.aRenderer_Sub3_10202.aFloatArray_10574[1] * (float)var36[var18] + this.aRenderer_Sub3_10202.aFloatArray_10574[2] * (float)var14[var18]) / ((float)var24 * 256.0F);
                     }

                     float var26 = this.aRenderer_Sub3_10202.aFloat_10582 + var25 * (var25 < 0.0F?var17:var16);
                     var27 = (int)(var21 * var26);
                     if(var27 < 0) {
                        var27 = 0;
                     } else if(var27 > 255) {
                        var27 = 255;
                     }

                     int var28 = (int)(var22 * var26);
                     if(var28 < 0) {
                        var28 = 0;
                     } else if(var28 > 255) {
                        var28 = 255;
                     }

                     int var29 = (int)(var23 * var26);
                     if(var29 < 0) {
                        var29 = 0;
                     } else if(var29 > 255) {
                        var29 = 255;
                     }

                     var7.putInt(var9, 255 - this.aByteArray_10227[var19] << 24 | var27 << 16 | var28 << 8 | var29);
                     var9 += 4L;
                  }
               } else {
                  for(var11 = 0; var11 < this.anInt_10214; ++var11) {
                     var12 = this.aShortArray_10216[var11];
                     var42 = 255 - this.aByteArray_10227[var12] << 24 | this.method6895(this.aShortArray_10226[var12] & '\uffff', this.aShortArray_10231[var12], this.aShort_10205);
                     var7.putInt(var9, var42);
                     var9 += 4L;
                  }
               }

               var6.method4852();
            } else {
               var34 = this.aRenderer_Sub3_10202.aByteBuffer_10646;
               var34.clear();
               if((this.anInt_10204 & 55) == 0) {
                  short[] var30;
                  byte[] var39;
                  if(this.aClass395_10223 != null) {
                     var38 = this.aClass395_10223.aShortArray_7564;
                     var30 = this.aClass395_10223.aShortArray_7562;
                     var37 = this.aClass395_10223.aShortArray_7563;
                     var39 = this.aClass395_10223.aByteArray_7561;
                  } else {
                     var38 = this.aShortArray_10217;
                     var30 = this.aShortArray_10203;
                     var37 = this.aShortArray_10219;
                     var39 = this.aByteArray_10220;
                  }

                  float var47 = this.aRenderer_Sub3_10202.aFloat_10561 * 768.0F / (float)this.aShort_10258;
                  float var46 = this.aRenderer_Sub3_10202.aFloat_10584 * 768.0F / (float)this.aShort_10258;

                  for(var45 = 0; var45 < this.anInt_10214; ++var45) {
                     short var49 = this.aShortArray_10216[var45];
                     var18 = this.method6895(this.aShortArray_10226[var49] & '\uffff', this.aShortArray_10231[var49], this.aShort_10205);
                     float var50 = (float)(var18 >> 16 & 255) * this.aRenderer_Sub3_10202.aFloat_10579;
                     float var51 = (float)(var18 >> 8 & 255) * this.aRenderer_Sub3_10202.aFloat_10580;
                     var21 = (float)(var18 & 255) * this.aRenderer_Sub3_10202.aFloat_10651;
                     byte var52 = var39[var45];
                     if(var52 == 0) {
                        var23 = (this.aRenderer_Sub3_10202.aFloatArray_10574[0] * (float)var38[var45] + this.aRenderer_Sub3_10202.aFloatArray_10574[1] * (float)var30[var45] + this.aRenderer_Sub3_10202.aFloatArray_10574[2] * (float)var37[var45]) * 0.0026041667F;
                     } else {
                        var23 = (this.aRenderer_Sub3_10202.aFloatArray_10574[0] * (float)var38[var45] + this.aRenderer_Sub3_10202.aFloatArray_10574[1] * (float)var30[var45] + this.aRenderer_Sub3_10202.aFloatArray_10574[2] * (float)var37[var45]) / ((float)var52 * 256.0F);
                     }

                     float var54 = this.aRenderer_Sub3_10202.aFloat_10582 + var23 * (var23 < 0.0F?var46:var47);
                     int var53 = (int)(var50 * var54);
                     if(var53 < 0) {
                        var53 = 0;
                     } else if(var53 > 255) {
                        var53 = 255;
                     }

                     int var55 = (int)(var51 * var54);
                     if(var55 < 0) {
                        var55 = 0;
                     } else if(var55 > 255) {
                        var55 = 255;
                     }

                     var27 = (int)(var21 * var54);
                     if(var27 < 0) {
                        var27 = 0;
                     } else if(var27 > 255) {
                        var27 = 255;
                     }

                     var34.putInt(255 - this.aByteArray_10227[var49] << 24 | var53 << 16 | var55 << 8 | var27);
                  }
               } else {
                  for(var13 = 0; var13 < this.anInt_10214; ++var13) {
                     short var56 = this.aShortArray_10216[var13];
                     var11 = 255 - this.aByteArray_10227[var56] << 24 | this.method6895(this.aShortArray_10226[var56] & '\uffff', this.aShortArray_10231[var56], this.aShort_10205);
                     var34.putInt(var11);
                  }
               }

               var6.method4853(0, var34.position(), this.aRenderer_Sub3_10202.aLong_10629);
            }

            this.aClass390_10236.aClass76_7510 = var6;
            this.aClass390_10236.aBoolean_7512 = true;
         }

         if(var2) {
            if(this.aClass390_10238.aClass76_7513 == null) {
               this.aClass390_10238.aClass76_7513 = this.aRenderer_Sub3_10202.method7320(this.aBoolean_10239);
            }

            var6 = this.aClass390_10238.aClass76_7513;
            var6.method981(this.anInt_10214 * 12, 12);
            short[] var35;
            short[] var33;
            byte[] var57;
            if(this.aClass395_10223 != null) {
               var33 = this.aClass395_10223.aShortArray_7564;
               var35 = this.aClass395_10223.aShortArray_7562;
               var38 = this.aClass395_10223.aShortArray_7563;
               var57 = this.aClass395_10223.aByteArray_7561;
            } else {
               var33 = this.aShortArray_10217;
               var35 = this.aShortArray_10203;
               var38 = this.aShortArray_10219;
               var57 = this.aByteArray_10220;
            }

            Unsafe var43 = this.aRenderer_Sub3_10202.anUnsafe_10510;
            if(var43 != null) {
               int var40 = this.anInt_10214 * 12;
               long var31 = var6.method4851(0, var40);

               for(var45 = 0; var45 < this.anInt_10214; ++var45) {
                  GameCoord var48 = new GameCoord((float)var33[var45], (float)var35[var45], (float)var38[var45]);
                  if(var57[var45] > 1) {
                     var48.method4332((float)var57[var45]);
                  }

                  var48.method4313();
                  var43.putFloat(var31, var48.floatX);
                  var31 += 4L;
                  var43.putFloat(var31, var48.floatY);
                  var31 += 4L;
                  var43.putFloat(var31, var48.floatZ);
                  var31 += 4L;
               }

               var6.method4852();
            } else {
               ByteBuffer var41 = this.aRenderer_Sub3_10202.aByteBuffer_10646;
               var41.clear();

               for(var42 = 0; var42 < this.anInt_10214; ++var42) {
                  GameCoord var44 = new GameCoord((float)var33[var42], (float)var35[var42], (float)var38[var42]);
                  if(var57[var42] > 1) {
                     var44.method4332((float)var57[var42]);
                  }

                  var44.method4313();
                  var41.putFloat(var44.floatX);
                  var41.putFloat(var44.floatY);
                  var41.putFloat(var44.floatZ);
               }

               var6.method4853(0, var41.position(), this.aRenderer_Sub3_10202.aLong_10629);
            }

            this.aClass390_10238.aClass76_7510 = var6;
            this.aClass390_10238.aBoolean_7512 = true;
         }

         if(var4) {
            if(this.aClass390_10268.aClass76_7513 == null) {
               this.aClass390_10268.aClass76_7513 = this.aRenderer_Sub3_10202.method7320(this.aBoolean_10239);
            }

            var6 = this.aClass390_10268.aClass76_7513;
            var6.method981(this.anInt_10214 * 8, 8);
            var7 = this.aRenderer_Sub3_10202.anUnsafe_10510;
            if(var7 != null) {
               var8 = this.anInt_10214 * 8;
               var9 = var6.method4851(0, var8);

               for(var11 = 0; var11 < this.anInt_10214; ++var11) {
                  var7.putFloat(var9, this.aFloatArray_10250[var11]);
                  var9 += 4L;
                  var7.putFloat(var9, this.aFloatArray_10222[var11]);
                  var9 += 4L;
               }

               var6.method4852();
            } else {
               var34 = this.aRenderer_Sub3_10202.aByteBuffer_10646;
               var34.clear();

               for(var13 = 0; var13 < this.anInt_10214; ++var13) {
                  var34.putFloat(this.aFloatArray_10250[var13]);
                  var34.putFloat(this.aFloatArray_10222[var13]);
               }

               var6.method4853(0, var34.position(), this.aRenderer_Sub3_10202.aLong_10629);
            }

            this.aClass390_10268.aClass76_7510 = var6;
            this.aClass390_10268.aBoolean_7512 = true;
         }

         return var5;
      }
   }

   int method6894(int var1, int var2) {
      var2 = var2 * (var1 & 127) >> 7;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 126) {
         var2 = 126;
      }

      return (var1 & '\uff80') + var2;
   }

   int method6895(int var1, short var2, int var3) {
      int var4 = this.aRenderer_Sub3_10202.anIntArray_10506[this.method6894(var1, var3)];
      if(var2 != -1) {
         Class183 var5 = this.aRenderer_Sub3_10202.aClass163_2802.method1996(var2 & '\uffff', (byte)2);
         int var6 = var5.aByte_3165 & 255;
         int var7;
         int var9;
         if(var6 != 0) {
            var7 = 131586 * var3;
            if(var3 < 0) {
               var7 = 0;
            } else if(var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

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
      }

      return var4 & 16777215;
   }

   short method6896(ModelData var1, int var2, int var3, long var4, int var6, int var7, int var8, int var9, float var10, float var11) {
      int var12 = this.anIntArray_10255[var2];
      int var13 = this.anIntArray_10255[var2 + 1];
      int var14 = 0;

      for(int var15 = var12; var15 < var13; ++var15) {
         short var16 = this.aShortArray_10256[var15];
         if(var16 == 0) {
            var14 = var15;
            break;
         }

         if(this.aLongArray_10200[var15] == var4) {
            return (short)(var16 - 1);
         }
      }

      this.aShortArray_10256[var14] = (short)(this.anInt_10214 + 1);
      this.aLongArray_10200[var14] = var4;
      this.aShortArray_10216[this.anInt_10214] = (short)var3;
      this.aShortArray_10221[this.anInt_10214] = (short)var2;
      this.aShortArray_10217[this.anInt_10214] = (short)var6;
      this.aShortArray_10203[this.anInt_10214] = (short)var7;
      this.aShortArray_10219[this.anInt_10214] = (short)var8;
      this.aByteArray_10220[this.anInt_10214] = (byte)var9;
      this.aFloatArray_10250[this.anInt_10214] = var10;
      this.aFloatArray_10222[this.anInt_10214] = var11;
      return (short)(this.anInt_10214++);
   }

   static byte[] method6897(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   void method6898() {
      if(this.aClass390_10236 != null) {
         this.aClass390_10236.aBoolean_7512 = false;
      }

   }

   Class165_Sub1(Renderer_Sub3 var1, int var2, int var3, boolean var4, boolean var5) {
      this.anInt_10218 = 0;
      this.anInt_10208 = 0;
      this.anInt_10214 = 0;
      this.anInt_10224 = 0;
      this.anInt_10212 = 0;
      this.aBoolean_10239 = false;
      this.aBoolean_10262 = true;
      this.aBoolean_10241 = false;
      this.aBoolean_10242 = false;
      this.aBoolean_10245 = false;
      this.aFloatArray_10267 = new float[2];
      this.anIntArray_10265 = new int[1];
      this.anIntArray_10210 = new int[1];
      this.anIntArray_10243 = new int[8];
      this.anIntArray_10234 = new int[8];
      this.anIntArray_10269 = new int[8];
      this.aRenderer_Sub3_10202 = var1;
      this.anInt_10261 = var2;
      this.anInt_10204 = var3;
      this.aBoolean_10239 = var5;
      if(var4 || Class73.method837(this.anInt_10261, this.anInt_10204)) {
         this.aClass390_10207 = new Class390(Class73.method839(this.anInt_10261, this.anInt_10204));
      }

      if(var4 || Class73.method837(this.anInt_10261, this.anInt_10204)) {
         this.aClass390_10268 = new Class390(Class73.method850(this.anInt_10261, this.anInt_10204));
      }

      if(var4 || Class73.method837(this.anInt_10261, this.anInt_10204)) {
         this.aClass390_10236 = new Class390(Class73.method841(this.anInt_10261, this.anInt_10204));
      }

      if(var4 || Class73.method838(this.anInt_10261, this.anInt_10204)) {
         this.aClass390_10238 = new Class390(Class73.method840(this.anInt_10261, this.anInt_10204));
      }

      if(var4 || Class73.method837(this.anInt_10261, this.anInt_10204)) {
         this.aClass74_10251 = new Class74(Class73.method842(this.anInt_10261, this.anInt_10204));
      }

      if(var4 && var5) {
         this.aClass390_10207.aClass76_7513 = this.aClass390_10207.aClass76_7510 = this.aRenderer_Sub3_10202.method7320(this.aBoolean_10239);
         this.aClass390_10268.aClass76_7513 = this.aClass390_10268.aClass76_7510 = this.aRenderer_Sub3_10202.method7320(this.aBoolean_10239);
         this.aClass390_10236.aClass76_7513 = this.aClass390_10236.aClass76_7510 = this.aRenderer_Sub3_10202.method7320(this.aBoolean_10239);
         this.aClass390_10238.aClass76_7513 = this.aClass390_10238.aClass76_7510 = this.aRenderer_Sub3_10202.method7320(this.aBoolean_10239);
      }

   }

   void method6899() {
      if(this.aClass390_10207 != null) {
         this.aClass390_10207.method4903();
      }

      if(this.aClass390_10268 != null) {
         this.aClass390_10268.method4903();
      }

      if(this.aClass390_10236 != null) {
         this.aClass390_10236.method4903();
      }

      if(this.aClass390_10238 != null) {
         this.aClass390_10238.method4903();
      }

      if(this.aClass74_10251 != null) {
         this.aClass74_10251.method867();
      }

   }

   public int method2056() {
      if(!this.aBoolean_10245) {
         this.method6863();
      }

      return this.anInt_10233;
   }

   static float[] method6901(float[] var0, int var1) {
      float[] var2 = new float[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   void method2034(int var1, int var2, int var3, int var4) {
      int var5;
      int var11;
      if(var1 == 0) {
         var5 = 0;
         this.anInt_10270 = 0;
         this.anInt_10271 = 0;
         this.anInt_10272 = 0;

         for(var11 = 0; var11 < this.anInt_10208; ++var11) {
            this.anInt_10270 += this.anIntArray_10209[var11];
            this.anInt_10271 += this.anIntArray_10235[var11];
            this.anInt_10272 += this.anIntArray_10211[var11];
            ++var5;
         }

         if(var5 > 0) {
            this.anInt_10270 = this.anInt_10270 / var5 + var2;
            this.anInt_10271 = this.anInt_10271 / var5 + var3;
            this.anInt_10272 = this.anInt_10272 / var5 + var4;
         } else {
            this.anInt_10270 = var2;
            this.anInt_10271 = var3;
            this.anInt_10272 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.anInt_10208; ++var5) {
            this.anIntArray_10209[var5] += var2;
            this.anIntArray_10235[var5] += var3;
            this.anIntArray_10211[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.anInt_10208; ++var5) {
               this.anIntArray_10209[var5] -= this.anInt_10270;
               this.anIntArray_10235[var5] -= this.anInt_10271;
               this.anIntArray_10211[var5] -= this.anInt_10272;
               if(var4 != 0) {
                  var11 = Class362.cosArray[var4];
                  var7 = Class362.sinArray[var4];
                  var8 = this.anIntArray_10235[var5] * var11 + this.anIntArray_10209[var5] * var7 + 16383 >> 14;
                  this.anIntArray_10235[var5] = this.anIntArray_10235[var5] * var7 - this.anIntArray_10209[var5] * var11 + 16383 >> 14;
                  this.anIntArray_10209[var5] = var8;
               }

               if(var2 != 0) {
                  var11 = Class362.cosArray[var2];
                  var7 = Class362.sinArray[var2];
                  var8 = this.anIntArray_10235[var5] * var7 - this.anIntArray_10211[var5] * var11 + 16383 >> 14;
                  this.anIntArray_10211[var5] = this.anIntArray_10235[var5] * var11 + this.anIntArray_10211[var5] * var7 + 16383 >> 14;
                  this.anIntArray_10235[var5] = var8;
               }

               if(var3 != 0) {
                  var11 = Class362.cosArray[var3];
                  var7 = Class362.sinArray[var3];
                  var8 = this.anIntArray_10211[var5] * var11 + this.anIntArray_10209[var5] * var7 + 16383 >> 14;
                  this.anIntArray_10211[var5] = this.anIntArray_10211[var5] * var7 - this.anIntArray_10209[var5] * var11 + 16383 >> 14;
                  this.anIntArray_10209[var5] = var8;
               }

               this.anIntArray_10209[var5] += this.anInt_10270;
               this.anIntArray_10235[var5] += this.anInt_10271;
               this.anIntArray_10211[var5] += this.anInt_10272;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.anInt_10208; ++var5) {
               this.anIntArray_10209[var5] -= this.anInt_10270;
               this.anIntArray_10235[var5] -= this.anInt_10271;
               this.anIntArray_10211[var5] -= this.anInt_10272;
               this.anIntArray_10209[var5] = this.anIntArray_10209[var5] * var2 / 128;
               this.anIntArray_10235[var5] = this.anIntArray_10235[var5] * var3 / 128;
               this.anIntArray_10211[var5] = this.anIntArray_10211[var5] * var4 / 128;
               this.anIntArray_10209[var5] += this.anInt_10270;
               this.anIntArray_10235[var5] += this.anInt_10271;
               this.anIntArray_10211[var5] += this.anInt_10272;
            }

         } else {
            Class382 var10;
            Class391 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt_10224; ++var5) {
                  var11 = (this.aByteArray_10227[var5] & 255) + var2 * 8;
                  if(var11 < 0) {
                     var11 = 0;
                  } else if(var11 > 255) {
                     var11 = 255;
                  }

                  this.aByteArray_10227[var5] = (byte)var11;
               }

               if(this.aClass382Array_10260 != null) {
                  for(var5 = 0; var5 < this.anInt_10259; ++var5) {
                     var10 = this.aClass382Array_10260[var5];
                     var12 = this.aClass391Array_10244[var5];
                     var12.anInt_7518 = var12.anInt_7518 & 16777215 | 255 - (this.aByteArray_10227[var10.anInt_7386] & 255) << 24;
                  }
               }

               this.method6898();
            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt_10224; ++var5) {
                  var11 = this.aShortArray_10226[var5] & '\uffff';
                  var7 = var11 >> 10 & 63;
                  var8 = var11 >> 7 & 7;
                  int var9 = var11 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
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

                  this.aShortArray_10226[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if(this.aClass382Array_10260 != null) {
                  for(var5 = 0; var5 < this.anInt_10259; ++var5) {
                     var10 = this.aClass382Array_10260[var5];
                     var12 = this.aClass391Array_10244[var5];
                     var12.anInt_7518 = var12.anInt_7518 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10226[var10.anInt_7386] & '\uffff'] & 16777215;
                  }
               }

               this.method6898();
            } else {
               Class391 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt_10259; ++var5) {
                     var6 = this.aClass391Array_10244[var5];
                     var6.anInt_7514 += var2;
                     var6.anInt_7515 += var3;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt_10259; ++var5) {
                     var6 = this.aClass391Array_10244[var5];
                     var6.anInt_7517 = var6.anInt_7517 * var2 >> 7;
                     var6.anInt_7516 = var6.anInt_7516 * var3 >> 7;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt_10259; ++var5) {
                     var6 = this.aClass391Array_10244[var5];
                     var6.anInt_7519 = var6.anInt_7519 + var2 & 16383;
                  }

               }
            }
         }
      }
   }

   public Class86[] method2059() {
      return this.aClass86Array_10257;
   }

   Model method6904(Class165_Sub1 var1, Class165_Sub1 var2, int var3, boolean var4, boolean var5) {
      var1.anInt_10261 = var3;
      var1.anInt_10204 = this.anInt_10204;
      var1.aShort_10205 = this.aShort_10205;
      var1.aShort_10258 = this.aShort_10258;
      var1.anInt_10218 = this.anInt_10218;
      var1.anInt_10208 = this.anInt_10208;
      var1.anInt_10214 = this.anInt_10214;
      var1.anInt_10224 = this.anInt_10224;
      var1.anInt_10212 = this.anInt_10212;
      var1.anInt_10259 = this.anInt_10259;
      if((var3 & 256) != 0) {
         var1.aBoolean_10241 = true;
      } else {
         var1.aBoolean_10241 = this.aBoolean_10241;
      }

      var1.aBoolean_10242 = this.aBoolean_10242;
      boolean var6 = Class73.method829(var3, this.anInt_10204);
      boolean var7 = Class73.method854(var3, this.anInt_10204);
      boolean var8 = Class73.method851(var3, this.anInt_10204);
      boolean var9 = var6 | var7 | var8;
      int var10;
      if(var9) {
         if(var6) {
            if(var2.anIntArray_10209 != null && var2.anIntArray_10209.length >= this.anInt_10218) {
               var1.anIntArray_10209 = var2.anIntArray_10209;
            } else {
               var1.anIntArray_10209 = var2.anIntArray_10209 = new int[this.anInt_10218];
            }
         } else {
            var1.anIntArray_10209 = this.anIntArray_10209;
         }

         if(var7) {
            if(var2.anIntArray_10235 != null && var2.anIntArray_10235.length >= this.anInt_10218) {
               var1.anIntArray_10235 = var2.anIntArray_10235;
            } else {
               var1.anIntArray_10235 = var2.anIntArray_10235 = new int[this.anInt_10218];
            }
         } else {
            var1.anIntArray_10235 = this.anIntArray_10235;
         }

         if(var8) {
            if(var2.anIntArray_10211 != null && var2.anIntArray_10211.length >= this.anInt_10218) {
               var1.anIntArray_10211 = var2.anIntArray_10211;
            } else {
               var1.anIntArray_10211 = var2.anIntArray_10211 = new int[this.anInt_10218];
            }
         } else {
            var1.anIntArray_10211 = this.anIntArray_10211;
         }

         for(var10 = 0; var10 < this.anInt_10218; ++var10) {
            if(var6) {
               var1.anIntArray_10209[var10] = this.anIntArray_10209[var10];
            }

            if(var7) {
               var1.anIntArray_10235[var10] = this.anIntArray_10235[var10];
            }

            if(var8) {
               var1.anIntArray_10211[var10] = this.anIntArray_10211[var10];
            }
         }
      } else {
         var1.anIntArray_10209 = this.anIntArray_10209;
         var1.anIntArray_10235 = this.anIntArray_10235;
         var1.anIntArray_10211 = this.anIntArray_10211;
      }

      if(Class73.method839(var3, this.anInt_10204)) {
         var1.aClass390_10207 = var2.aClass390_10207;
         var1.aClass390_10207.aClass76_7510 = this.aClass390_10207.aClass76_7510;
         var1.aClass390_10207.aBoolean_7512 = this.aClass390_10207.aBoolean_7512;
         var1.aClass390_10207.aBoolean_7511 = true;
      } else if(Class73.method837(var3, this.anInt_10204)) {
         var1.aClass390_10207 = this.aClass390_10207;
      } else {
         var1.aClass390_10207 = null;
      }

      if(Class73.method859(var3, this.anInt_10204)) {
         if(var2.aShortArray_10226 != null && var2.aShortArray_10226.length >= this.anInt_10224) {
            var1.aShortArray_10226 = var2.aShortArray_10226;
         } else {
            var1.aShortArray_10226 = var2.aShortArray_10226 = new short[this.anInt_10224];
         }

         for(var10 = 0; var10 < this.anInt_10224; ++var10) {
            var1.aShortArray_10226[var10] = this.aShortArray_10226[var10];
         }
      } else {
         var1.aShortArray_10226 = this.aShortArray_10226;
      }

      if(Class73.method832(var3, this.anInt_10204)) {
         if(var2.aByteArray_10227 != null && var2.aByteArray_10227.length >= this.anInt_10224) {
            var1.aByteArray_10227 = var2.aByteArray_10227;
         } else {
            var1.aByteArray_10227 = var2.aByteArray_10227 = new byte[this.anInt_10224];
         }

         for(var10 = 0; var10 < this.anInt_10224; ++var10) {
            var1.aByteArray_10227[var10] = this.aByteArray_10227[var10];
         }
      } else {
         var1.aByteArray_10227 = this.aByteArray_10227;
      }

      if(Class73.method841(var3, this.anInt_10204)) {
         var1.aClass390_10236 = var2.aClass390_10236;
         var1.aClass390_10236.aClass76_7510 = this.aClass390_10236.aClass76_7510;
         var1.aClass390_10236.aBoolean_7512 = this.aClass390_10236.aBoolean_7512;
         var1.aClass390_10236.aBoolean_7511 = true;
      } else if(Class73.method837(var3, this.anInt_10204)) {
         var1.aClass390_10236 = this.aClass390_10236;
      } else {
         var1.aClass390_10236 = null;
      }

      int var11;
      if(Class73.method856(var3, this.anInt_10204)) {
         if(var2.aShortArray_10217 != null && var2.aShortArray_10217.length >= this.anInt_10214) {
            var1.aShortArray_10217 = var2.aShortArray_10217;
            var1.aShortArray_10203 = var2.aShortArray_10203;
            var1.aShortArray_10219 = var2.aShortArray_10219;
         } else {
            var10 = this.anInt_10214;
            var1.aShortArray_10217 = var2.aShortArray_10217 = new short[var10];
            var1.aShortArray_10203 = var2.aShortArray_10203 = new short[var10];
            var1.aShortArray_10219 = var2.aShortArray_10219 = new short[var10];
         }

         if(this.aClass395_10223 != null) {
            if(var2.aClass395_10223 == null) {
               var2.aClass395_10223 = new Class395();
            }

            Class395 var12 = var1.aClass395_10223 = var2.aClass395_10223;
            if(var12.aShortArray_7564 == null || var12.aShortArray_7564.length < this.anInt_10214) {
               var11 = this.anInt_10214;
               var12.aShortArray_7564 = new short[var11];
               var12.aShortArray_7562 = new short[var11];
               var12.aShortArray_7563 = new short[var11];
               var12.aByteArray_7561 = new byte[var11];
            }

            for(var11 = 0; var11 < this.anInt_10214; ++var11) {
               var1.aShortArray_10217[var11] = this.aShortArray_10217[var11];
               var1.aShortArray_10203[var11] = this.aShortArray_10203[var11];
               var1.aShortArray_10219[var11] = this.aShortArray_10219[var11];
               var12.aShortArray_7564[var11] = this.aClass395_10223.aShortArray_7564[var11];
               var12.aShortArray_7562[var11] = this.aClass395_10223.aShortArray_7562[var11];
               var12.aShortArray_7563[var11] = this.aClass395_10223.aShortArray_7563[var11];
               var12.aByteArray_7561[var11] = this.aClass395_10223.aByteArray_7561[var11];
            }
         } else {
            var1.aClass395_10223 = null;

            for(var10 = 0; var10 < this.anInt_10214; ++var10) {
               var1.aShortArray_10217[var10] = this.aShortArray_10217[var10];
               var1.aShortArray_10203[var10] = this.aShortArray_10203[var10];
               var1.aShortArray_10219[var10] = this.aShortArray_10219[var10];
            }
         }

         var1.aByteArray_10220 = this.aByteArray_10220;
      } else {
         var1.aClass395_10223 = this.aClass395_10223;
         var1.aShortArray_10217 = this.aShortArray_10217;
         var1.aShortArray_10203 = this.aShortArray_10203;
         var1.aShortArray_10219 = this.aShortArray_10219;
         var1.aByteArray_10220 = this.aByteArray_10220;
      }

      if(Class73.method840(var3, this.anInt_10204)) {
         var1.aClass390_10238 = var2.aClass390_10238;
         var1.aClass390_10238.aClass76_7510 = this.aClass390_10238.aClass76_7510;
         var1.aClass390_10238.aBoolean_7512 = this.aClass390_10238.aBoolean_7512;
         var1.aClass390_10238.aBoolean_7511 = true;
      } else if(Class73.method838(var3, this.anInt_10204)) {
         var1.aClass390_10238 = this.aClass390_10238;
      } else {
         var1.aClass390_10238 = null;
      }

      if(Class73.method833(var3, this.anInt_10204)) {
         if(var2.aFloatArray_10250 != null && var2.aFloatArray_10250.length >= this.anInt_10224) {
            var1.aFloatArray_10250 = var2.aFloatArray_10250;
            var1.aFloatArray_10222 = var2.aFloatArray_10222;
         } else {
            var10 = this.anInt_10214;
            var1.aFloatArray_10250 = var2.aFloatArray_10250 = new float[var10];
            var1.aFloatArray_10222 = var2.aFloatArray_10222 = new float[var10];
         }

         for(var10 = 0; var10 < this.anInt_10214; ++var10) {
            var1.aFloatArray_10250[var10] = this.aFloatArray_10250[var10];
            var1.aFloatArray_10222[var10] = this.aFloatArray_10222[var10];
         }
      } else {
         var1.aFloatArray_10250 = this.aFloatArray_10250;
         var1.aFloatArray_10222 = this.aFloatArray_10222;
      }

      if(Class73.method850(var3, this.anInt_10204)) {
         var1.aClass390_10268 = var2.aClass390_10268;
         var1.aClass390_10268.aClass76_7510 = this.aClass390_10268.aClass76_7510;
         var1.aClass390_10268.aBoolean_7512 = this.aClass390_10268.aBoolean_7512;
         var1.aClass390_10268.aBoolean_7511 = true;
      } else if(Class73.method837(var3, this.anInt_10204)) {
         var1.aClass390_10268 = this.aClass390_10268;
      } else {
         var1.aClass390_10268 = null;
      }

      if(Class73.method834(var3, this.anInt_10204)) {
         if(var2.aShortArray_10228 != null && var2.aShortArray_10228.length >= this.anInt_10224) {
            var1.aShortArray_10228 = var2.aShortArray_10228;
            var1.aShortArray_10229 = var2.aShortArray_10229;
            var1.aShortArray_10230 = var2.aShortArray_10230;
         } else {
            var10 = this.anInt_10224;
            var1.aShortArray_10228 = var2.aShortArray_10228 = new short[var10];
            var1.aShortArray_10229 = var2.aShortArray_10229 = new short[var10];
            var1.aShortArray_10230 = var2.aShortArray_10230 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt_10224; ++var10) {
            var1.aShortArray_10228[var10] = this.aShortArray_10228[var10];
            var1.aShortArray_10229[var10] = this.aShortArray_10229[var10];
            var1.aShortArray_10230[var10] = this.aShortArray_10230[var10];
         }
      } else {
         var1.aShortArray_10228 = this.aShortArray_10228;
         var1.aShortArray_10229 = this.aShortArray_10229;
         var1.aShortArray_10230 = this.aShortArray_10230;
      }

      if(Class73.method842(var3, this.anInt_10204)) {
         var1.aClass74_10251 = var2.aClass74_10251;
         var1.aClass74_10251.aClass414_1397 = this.aClass74_10251.aClass414_1397;
         var1.aClass74_10251.aBoolean_1395 = this.aClass74_10251.aBoolean_1395;
         var1.aClass74_10251.aBoolean_1396 = true;
      } else if(Class73.method837(var3, this.anInt_10204)) {
         var1.aClass74_10251 = this.aClass74_10251;
      } else {
         var1.aClass74_10251 = null;
      }

      if(Class73.method835(var3, this.anInt_10204)) {
         if(var2.aShortArray_10231 != null && var2.aShortArray_10231.length >= this.anInt_10224) {
            var1.aShortArray_10231 = var2.aShortArray_10231;
         } else {
            var10 = this.anInt_10224;
            var1.aShortArray_10231 = var2.aShortArray_10231 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt_10224; ++var10) {
            var1.aShortArray_10231[var10] = this.aShortArray_10231[var10];
         }
      } else {
         var1.aShortArray_10231 = this.aShortArray_10231;
      }

      if(Class73.method836(var3, this.anInt_10204)) {
         if(var2.aClass391Array_10244 != null && var2.aClass391Array_10244.length >= this.anInt_10259) {
            var1.aClass391Array_10244 = var2.aClass391Array_10244;

            for(var10 = 0; var10 < this.anInt_10259; ++var10) {
               var1.aClass391Array_10244[var10].method4905(this.aClass391Array_10244[var10]);
            }
         } else {
            var10 = this.anInt_10259;
            var1.aClass391Array_10244 = var2.aClass391Array_10244 = new Class391[var10];

            for(var11 = 0; var11 < this.anInt_10259; ++var11) {
               var1.aClass391Array_10244[var11] = this.aClass391Array_10244[var11].method4904();
            }
         }
      } else {
         var1.aClass391Array_10244 = this.aClass391Array_10244;
      }

      var1.aClass382Array_10260 = this.aClass382Array_10260;
      if(this.aBoolean_10245) {
         var1.anInt_10247 = this.anInt_10247;
         var1.anInt_10232 = this.anInt_10232;
         var1.anInt_10248 = this.anInt_10248;
         var1.anInt_10266 = this.anInt_10266;
         var1.anInt_10206 = this.anInt_10206;
         var1.anInt_10233 = this.anInt_10233;
         var1.anInt_10264 = this.anInt_10264;
         var1.anInt_10246 = this.anInt_10246;
         var1.aBoolean_10245 = true;
      } else {
         var1.aBoolean_10245 = false;
      }

      var1.anIntArrayArray_10240 = this.anIntArrayArray_10240;
      var1.anIntArrayArray_10263 = this.anIntArrayArray_10263;
      var1.anIntArrayArray_10215 = this.anIntArrayArray_10215;
      var1.aShortArray_10256 = this.aShortArray_10256;
      var1.anIntArray_10255 = this.anIntArray_10255;
      var1.aShortArray_10221 = this.aShortArray_10221;
      var1.aShortArray_10216 = this.aShortArray_10216;
      var1.aShortArray_10213 = this.aShortArray_10213;
      var1.aShortArray_10237 = this.aShortArray_10237;
      var1.anIntArray_10252 = this.anIntArray_10252;
      var1.anIntArray_10254 = this.anIntArray_10254;
      var1.anIntArray_10253 = this.anIntArray_10253;
      var1.aClass86Array_10257 = this.aClass86Array_10257;
      var1.aClass172Array_10249 = this.aClass172Array_10249;
      return var1;
   }

   void method6905(Viewport var1) {
      if(this.anInt_10212 != 0) {
         if(this.method6893() && this.method6892()) {
            if(aClass62_10274 != null) {
               ;
            }

            this.aRenderer_Sub3_10202.method7272();
            this.aRenderer_Sub3_10202.method7210();
            Class27 var2 = this.aRenderer_Sub3_10202.aClass27_10638;
            this.aRenderer_Sub3_10202.method7251(0, this.aClass390_10207.aClass76_7510);
            this.aRenderer_Sub3_10202.method7251(1, this.aClass390_10236.aClass76_7510);
            this.aRenderer_Sub3_10202.method7251(2, this.aClass390_10268.aClass76_7510);
            this.aRenderer_Sub3_10202.method7307(this.aClass74_10251.aClass414_1397);
            this.aRenderer_Sub3_10202.anArrayViewport_10527.setViewport(var1);
            var2.method192(this.aRenderer_Sub3_10202.anArrayViewport_10527);
            var2.anArrayViewport_773.reset();
            if(this.aRenderer_Sub3_10202.aBoolean_10620) {
               Class105 var3 = this.aRenderer_Sub3_10202.method7293();
               var2.aClass356_772.method4455(0.0F, 1.0F, 0.0F, (float)(-this.aRenderer_Sub3_10202.anInt_10622));
               var2.aClass356_772.method4460(3.0F / (float)(var3.anInt_1981 * 1611763201));
               var2.aClass347_781.setPos((float)(var3.anInt_1982 * 1829281247 >> 16 & 255) / 255.0F, (float)(var3.anInt_1982 * 1829281247 >> 8 & 255) / 255.0F, (float)(var3.anInt_1982 * 1829281247 >> 0 & 255) / 255.0F);
            } else {
               var2.aClass356_772.method4455(0.0F, 0.0F, 0.0F, 0.0F);
               var2.aClass347_781.setPos(0.0F, 0.0F, 0.0F);
            }

            if(this.aRenderer_Sub3_10202.anInt_10627 > 0) {
               var2.aClass356_774.method4455(0.0F, 0.0F, 1.0F, -this.aRenderer_Sub3_10202.aFloat_10614);
               var2.aClass347_775.setPos((float)(this.aRenderer_Sub3_10202.anInt_10626 >> 16 & 255) / 255.0F, (float)(this.aRenderer_Sub3_10202.anInt_10626 >> 8 & 255) / 255.0F, (float)(this.aRenderer_Sub3_10202.anInt_10626 >> 0 & 255) / 255.0F);
               this.aRenderer_Sub3_10202.anArrayViewport_10527.setViewport(var1);
               this.aRenderer_Sub3_10202.anArrayViewport_10527.method4569();
               var2.aClass356_772.method4461(this.aRenderer_Sub3_10202.anArrayViewport_10527);
               this.aRenderer_Sub3_10202.anArrayViewport_10527.setViewport(var1);
               this.aRenderer_Sub3_10202.anArrayViewport_10527.method4580(this.aRenderer_Sub3_10202.anArrayViewport_10521);
               this.aRenderer_Sub3_10202.anArrayViewport_10527.method4569();
               var2.aClass356_774.method4461(this.aRenderer_Sub3_10202.anArrayViewport_10527);
               var2.aClass356_774.method4460(1.0F / (this.aRenderer_Sub3_10202.aFloat_10494 - this.aRenderer_Sub3_10202.aFloat_10614));
            } else {
               var2.aClass356_774.method4455(0.0F, 0.0F, 0.0F, 0.0F);
               var2.aClass347_775.setPos(0.0F, 0.0F, 0.0F);
            }

            int var4;
            int var5;
            if((this.anInt_10204 & 55) == 0) {
               this.aRenderer_Sub3_10202.method7190(this.aRenderer_Sub3_10202.aClass379_10500);
               if(this.aRenderer_Sub3_10202.aBoolean_10505) {
                  this.aRenderer_Sub3_10202.method7205(false);
               }

               for(int var12 = 0; var12 < this.anIntArray_10253.length; ++var12) {
                  var4 = this.anIntArray_10252[var12];
                  var5 = this.anIntArray_10252[var12 + 1];
                  short var6 = this.aShortArray_10231[var4];
                  boolean var7 = false;
                  if(var6 != -1) {
                     Class183 var8 = this.aRenderer_Sub3_10202.aClass163_2802.method1996(var6 & '\uffff', (byte)2);
                     var2.aClass384_762 = this.aRenderer_Sub3_10202.aClass58_10599.method565(var8);
                     var7 = !Class21.method126(var8.aByte_3169, (byte)69);
                     var2.anArrayViewport_773.data[12] = (float)(this.aRenderer_Sub3_10202.anInt_10636 % 128000) / 1000.0F * (float)var8.aByte_3145 / 64.0F % 1.0F;
                     var2.anArrayViewport_773.data[13] = (float)(this.aRenderer_Sub3_10202.anInt_10636 % 128000) / 1000.0F * (float)var8.aByte_3157 / 64.0F % 1.0F;
                  } else {
                     var2.aClass384_762 = this.aRenderer_Sub3_10202.aClass384_10563;
                     float[] var18 = var2.anArrayViewport_773.data;
                     var2.anArrayViewport_773.data[13] = 0.0F;
                     var18[12] = 0.0F;
                  }

                  var2.anInt_768 = this.anIntArray_10253[var12];
                  var2.anInt_782 = this.anIntArray_10254[var12];
                  var2.anInt_779 = var4 * 3;
                  var2.anInt_784 = var5 - var4;
                  var2.method191(var7);
               }
            } else {
               this.aRenderer_Sub3_10202.method7251(3, this.aClass390_10238.aClass76_7510);
               this.aRenderer_Sub3_10202.method7190(this.aRenderer_Sub3_10202.aClass379_10654);
               Viewport var13 = this.aRenderer_Sub3_10202.aViewport_10526;
               var13.setAs(var1);
               var13.method4642();
               var4 = 0;
               int var15;
               if(this.aRenderer_Sub3_10202.aBoolean_10505) {
                  this.aRenderer_Sub3_10202.method7205(true);
               } else {
                  var2.aClass347_766.setPos(this.aRenderer_Sub3_10202.aFloatArray_10574[0], this.aRenderer_Sub3_10202.aFloatArray_10574[1], this.aRenderer_Sub3_10202.aFloatArray_10574[2]);
                  var2.aClass347_766.method4341(var13);
                  var2.aClass347_777.setPos(this.aRenderer_Sub3_10202.aFloat_10561 * this.aRenderer_Sub3_10202.aFloat_10579, this.aRenderer_Sub3_10202.aFloat_10561 * this.aRenderer_Sub3_10202.aFloat_10580, this.aRenderer_Sub3_10202.aFloat_10561 * this.aRenderer_Sub3_10202.aFloat_10651);
                  var2.aClass347_778.setPos(-this.aRenderer_Sub3_10202.aFloat_10584 * this.aRenderer_Sub3_10202.aFloat_10579, -this.aRenderer_Sub3_10202.aFloat_10584 * this.aRenderer_Sub3_10202.aFloat_10580, -this.aRenderer_Sub3_10202.aFloat_10584 * this.aRenderer_Sub3_10202.aFloat_10651);
                  var2.aClass347_776.setPos(this.aRenderer_Sub3_10202.aFloat_10582 * this.aRenderer_Sub3_10202.aFloat_10579, this.aRenderer_Sub3_10202.aFloat_10582 * this.aRenderer_Sub3_10202.aFloat_10580, this.aRenderer_Sub3_10202.aFloat_10582 * this.aRenderer_Sub3_10202.aFloat_10651);
                  if(this.aRenderer_Sub3_10202.anInt_10586 > 0) {
                     var4 = this.aRenderer_Sub3_10202.anInt_10586;
                     GameCoord var14 = this.aRenderer_Sub3_10202.aClass347_10529;

                     for(var15 = 0; var15 < var4; ++var15) {
                        Class240_Sub53 var16 = this.aRenderer_Sub3_10202.aClass240_Sub53Array_10504[var15];
                        int var17 = var16.method5278((byte)-111);
                        var14.setPos(var16.aClass347_8018);
                        var14.method4329(var13);
                        var2.aFloatArray_765[var15 * 4 + 0] = var14.floatX;
                        var2.aFloatArray_765[var15 * 4 + 1] = var14.floatY;
                        var2.aFloatArray_765[var15 * 4 + 2] = var14.floatZ;
                        var2.aFloatArray_765[var15 * 4 + 3] = 1.0F / ((float)var16.method5277(-1932051005) * 2.5F);
                        float var9 = var16.method5279(-1780847144) / 255.0F;
                        var2.aFloatArray_764[var15 * 4 + 0] = (float)(var17 >> 16 & 255) * var9;
                        var2.aFloatArray_764[var15 * 4 + 1] = (float)(var17 >> 8 & 255) * var9;
                        var2.aFloatArray_764[var15 * 4 + 2] = (float)(var17 & 255) * var9;
                        var2.aFloatArray_764[var15 * 4 + 3] = 1.0F;
                     }
                  }
               }

               for(var5 = 0; var5 < this.anIntArray_10253.length; ++var5) {
                  var15 = this.anIntArray_10252[var5];
                  int var19 = this.anIntArray_10252[var5 + 1];
                  short var21 = this.aShortArray_10231[var15];
                  byte var20 = 11;
                  Class183 var10 = null;
                  if(var21 != -1) {
                     var10 = this.aRenderer_Sub3_10202.aClass163_2802.method1996(var21 & '\uffff', (byte)2);
                     var2.aClass384_762 = this.aRenderer_Sub3_10202.aClass58_10599.method565(var10);
                     var20 = var10.aByte_3169;
                     var2.method197(var10.aByte_3170);
                     var2.anArrayViewport_773.data[12] = (float)(this.aRenderer_Sub3_10202.anInt_10636 % 128000) / 1000.0F * (float)var10.aByte_3145 / 64.0F % 1.0F;
                     var2.anArrayViewport_773.data[13] = (float)(this.aRenderer_Sub3_10202.anInt_10636 % 128000) / 1000.0F * (float)var10.aByte_3157 / 64.0F % 1.0F;
                  } else {
                     var2.aClass384_762 = this.aRenderer_Sub3_10202.aClass384_10563;
                     float[] var11 = var2.anArrayViewport_773.data;
                     var2.anArrayViewport_773.data[13] = 0.0F;
                     var11[12] = 0.0F;
                  }

                  var2.anInt_768 = this.anIntArray_10253[var5];
                  var2.anInt_782 = this.anIntArray_10254[var5];
                  var2.anInt_779 = var15 * 3;
                  var2.anInt_784 = var19 - var15;
                  switch(var20) {
                  case 1:
                     var2.aClass347_769.setPos(this.aRenderer_Sub3_10202.anArrayViewport_10522.data[12], this.aRenderer_Sub3_10202.anArrayViewport_10522.data[13], this.aRenderer_Sub3_10202.anArrayViewport_10522.data[14]);
                     var2.aClass347_769.method4329(var13);
                     var2.method194(var4);
                     break;
                  case 2:
                  case 3:
                  case 4:
                  default:
                     var2.method193(var4);
                     break;
                  case 5:
                     if(!this.aRenderer_Sub3_10202.aBoolean_10505) {
                        Class65_Sub1_Sub1 var22 = this.aRenderer_Sub3_10202.aClass65_Sub1_Sub1_10559;
                        var22.method718(var10.aByte_3170, var10.anInt_3171 * -1145434627, 753060027);
                        var22.anArrayViewport_1314.setViewport(var1);
                        var22.anArrayViewport_1310.setViewport(var1);
                        var22.anArrayViewport_1310.method4580(this.aRenderer_Sub3_10202.anArrayViewport_10542);
                        var22.anInt_1320 = this.anIntArray_10253[var5] * 1740040549;
                        var22.anInt_1319 = this.anIntArray_10254[var5] * -1791156391;
                        var22.anInt_1322 = var15 * 499763233;
                        var22.anInt_1323 = (var19 - var15) * -1533419471;
                        var22.method719(621378563);
                     } else {
                        var2.method193(var4);
                     }
                     break;
                  case 6:
                     var2.method191(!Class21.method126(var20, (byte)104));
                     break;
                  case 7:
                     var2.aClass347_769.setPos(this.aRenderer_Sub3_10202.anArrayViewport_10522.data[12], this.aRenderer_Sub3_10202.anArrayViewport_10522.data[13], this.aRenderer_Sub3_10202.anArrayViewport_10522.data[14]);
                     var2.aClass347_769.method4329(var13);
                     var2.anArrayViewport_780.setViewport(var1);
                     var2.aClass398_767 = this.aRenderer_Sub3_10202.method7172();
                     var2.method195(var4);
                  }
               }
            }

            this.method6853();
         }
      }
   }

   public void method2069(Viewport var1, Class92 var2, int var3) {
      if(aClass62_10274 != null) {
         aClass62_10274.method599();
      }

      if(var2 != null) {
         var2.aBoolean_1828 = false;
      }

      if(this.anInt_10214 != 0) {
         ArrayViewport var4 = this.aRenderer_Sub3_10202.anArrayViewport_10499;
         ArrayViewport var5 = this.aRenderer_Sub3_10202.anArrayViewport_10527;
         ArrayViewport var6 = this.aRenderer_Sub3_10202.anArrayViewport_10578;
         var5.setViewport(var1);
         var6.replaceWith(var5);
         var6.method4580(this.aRenderer_Sub3_10202.anArrayViewport_10541);
         if(!this.aBoolean_10245) {
            this.method6863();
         }

         float[] var7 = this.aRenderer_Sub3_10202.aFloatArray_10530;
         var5.method4558(0.0F, (float)this.anInt_10206, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method4558(0.0F, (float)this.anInt_10233, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var17;
         float var16;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.aRenderer_Sub3_10202.aFloatArrayArray_10543[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.anInt_10232;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.anInt_10232;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.anInt_10248 + this.anInt_10266 >> 1;
            int var21 = this.anInt_10264 + this.anInt_10246 >> 1;
            int var23 = this.anInt_10206;
            float var34 = var6.data[0] * (float)var20 + var6.data[4] * (float)var23 + var6.data[8] * (float)var21 + var6.data[12];
            float var33 = var6.data[1] * (float)var20 + var6.data[5] * (float)var23 + var6.data[9] * (float)var21 + var6.data[13];
            var16 = var6.data[2] * (float)var20 + var6.data[6] * (float)var23 + var6.data[10] * (float)var21 + var6.data[14];
            var17 = var6.data[3] * (float)var20 + var6.data[7] * (float)var23 + var6.data[11] * (float)var21 + var6.data[15];
            if(var16 >= -var17) {
               var2.anInt_1829 = (int)(this.aRenderer_Sub3_10202.aFloat_10544 + this.aRenderer_Sub3_10202.aFloat_10545 * var34 / var17);
               var2.anInt_1826 = (int)(this.aRenderer_Sub3_10202.aFloat_10546 + this.aRenderer_Sub3_10202.aFloat_10547 * var33 / var17);
            } else {
               var18 = true;
            }

            var23 = this.anInt_10233;
            float var25 = var6.data[0] * (float)var20 + var6.data[4] * (float)var23 + var6.data[8] * (float)var21 + var6.data[12];
            float var26 = var6.data[1] * (float)var20 + var6.data[5] * (float)var23 + var6.data[9] * (float)var21 + var6.data[13];
            float var27 = var6.data[2] * (float)var20 + var6.data[6] * (float)var23 + var6.data[10] * (float)var21 + var6.data[14];
            float var28 = var6.data[3] * (float)var20 + var6.data[7] * (float)var23 + var6.data[11] * (float)var21 + var6.data[15];
            if(var27 >= -var28) {
               var2.anInt_1827 = (int)(this.aRenderer_Sub3_10202.aFloat_10544 + this.aRenderer_Sub3_10202.aFloat_10545 * var25 / var28);
               var2.anInt_1830 = (int)(this.aRenderer_Sub3_10202.aFloat_10546 + this.aRenderer_Sub3_10202.aFloat_10547 * var26 / var28);
            } else {
               var18 = true;
            }

            float var29;
            float var30;
            if(var18) {
               if(var16 < -var17 && var27 < -var28) {
                  var19 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var34 + var29 * (var25 - var34);
                     var31 = var33 + var29 * (var26 - var33);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.anInt_1829 = (int)(this.aRenderer_Sub3_10202.aFloat_10544 + this.aRenderer_Sub3_10202.aFloat_10545 * var30 / var32);
                     var2.anInt_1826 = (int)(this.aRenderer_Sub3_10202.aFloat_10546 + this.aRenderer_Sub3_10202.aFloat_10547 * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var34 - var25);
                     var31 = var26 + var29 * (var33 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.anInt_1827 = (int)(this.aRenderer_Sub3_10202.aFloat_10544 + this.aRenderer_Sub3_10202.aFloat_10545 * var30 / var32);
                     var2.anInt_1830 = (int)(this.aRenderer_Sub3_10202.aFloat_10546 + this.aRenderer_Sub3_10202.aFloat_10547 * var31 / var32);
                  }
               }
            }

            if(var19) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var34 + var4.data[0] * (float)this.anInt_10232 + var4.data[12];
                  var30 = var17 + var4.data[3] * (float)this.anInt_10232 + var4.data[15];
                  var2.anInt_1831 = (int)(this.aRenderer_Sub3_10202.aFloat_10544 - (float)var2.anInt_1829 + this.aRenderer_Sub3_10202.aFloat_10545 * var29 / var30);
               } else {
                  var29 = var25 + var4.data[0] * (float)this.anInt_10232 + var4.data[12];
                  var30 = var28 + var4.data[3] * (float)this.anInt_10232 + var4.data[15];
                  var2.anInt_1831 = (int)(this.aRenderer_Sub3_10202.aFloat_10544 - (float)var2.anInt_1827 + this.aRenderer_Sub3_10202.aFloat_10545 * var29 / var30);
               }

               var2.aBoolean_1828 = true;
            }
         }

         this.aRenderer_Sub3_10202.method7306(var3);
         this.method6905(var1);
         this.aRenderer_Sub3_10202.method7306(0);
         var5.setViewport(var1);
         var5.method4580(this.aRenderer_Sub3_10202.anArrayViewport_10521);
         this.method6891(var5);
      }
   }

   void method2024() {
      for(int var1 = 0; var1 < this.anInt_10218; ++var1) {
         this.anIntArray_10209[var1] = this.anIntArray_10209[var1] + 7 >> 4;
         this.anIntArray_10235[var1] = this.anIntArray_10235[var1] + 7 >> 4;
         this.anIntArray_10211[var1] = this.anIntArray_10211[var1] + 7 >> 4;
      }

      this.method6854();
      this.aBoolean_10245 = false;
   }

   public void method2042(int var1) {
      if(this.aClass390_10207 != null) {
         this.aClass390_10207.aBoolean_7511 = Class73.method839(var1, this.anInt_10204);
      }

      if(this.aClass390_10268 != null) {
         this.aClass390_10268.aBoolean_7511 = Class73.method850(var1, this.anInt_10204);
      }

      if(this.aClass390_10236 != null) {
         this.aClass390_10236.aBoolean_7511 = Class73.method841(var1, this.anInt_10204);
      }

      if(this.aClass390_10238 != null) {
         this.aClass390_10238.aBoolean_7511 = Class73.method840(var1, this.anInt_10204);
      }

      this.anInt_10261 = var1;
      if(this.aClass395_10223 != null && (this.anInt_10261 & 65536) == 0) {
         this.aShortArray_10217 = this.aClass395_10223.aShortArray_7564;
         this.aShortArray_10203 = this.aClass395_10223.aShortArray_7562;
         this.aShortArray_10219 = this.aClass395_10223.aShortArray_7563;
         this.aByteArray_10220 = this.aClass395_10223.aByteArray_7561;
         this.aClass395_10223 = null;
      }

      this.aBoolean_10262 = true;
      this.method6853();
   }

   public boolean method2050(int var1, int var2, Viewport var3, boolean var4, int var5) {
      return this.method6851(var1, var2, 0, 0, var3, var4, var5);
   }

   public void method2055(int var1) {
      int var2 = Class362.cosArray[var1];
      int var3 = Class362.sinArray[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.anInt_10208; ++var4) {
         var5 = this.anIntArray_10211[var4] * var2 + this.anIntArray_10209[var4] * var3 >> 14;
         this.anIntArray_10211[var4] = this.anIntArray_10211[var4] * var3 - this.anIntArray_10209[var4] * var2 >> 14;
         this.anIntArray_10209[var4] = var5;
      }

      for(var4 = 0; var4 < this.anInt_10214; ++var4) {
         var5 = this.aShortArray_10219[var4] * var2 + this.aShortArray_10217[var4] * var3 >> 14;
         this.aShortArray_10219[var4] = (short)(this.aShortArray_10219[var4] * var3 - this.aShortArray_10217[var4] * var2 >> 14);
         this.aShortArray_10217[var4] = (short)var5;
      }

      this.method6854();
      this.method6856();
      this.aBoolean_10245 = false;
   }

   public void method2053(Model var1, int var2, int var3, int var4, boolean var5) {
      Class165_Sub1 var6 = (Class165_Sub1)var1;
      if(this.anInt_10224 != 0 && var6.anInt_10224 != 0) {
         int var7 = var6.anInt_10208;
         int[] var8 = var6.anIntArray_10209;
         int[] var9 = var6.anIntArray_10235;
         int[] var10 = var6.anIntArray_10211;
         short[] var11 = var6.aShortArray_10217;
         short[] var12 = var6.aShortArray_10203;
         short[] var13 = var6.aShortArray_10219;
         byte[] var14 = var6.aByteArray_10220;
         short[] var15;
         short[] var17;
         short[] var16;
         byte[] var18;
         if(this.aClass395_10223 != null) {
            var15 = this.aClass395_10223.aShortArray_7564;
            var16 = this.aClass395_10223.aShortArray_7562;
            var17 = this.aClass395_10223.aShortArray_7563;
            var18 = this.aClass395_10223.aByteArray_7561;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var21;
         short[] var20;
         byte[] var22;
         if(var6.aClass395_10223 != null) {
            var19 = var6.aClass395_10223.aShortArray_7564;
            var20 = var6.aClass395_10223.aShortArray_7562;
            var21 = var6.aClass395_10223.aShortArray_7563;
            var22 = var6.aClass395_10223.aByteArray_7561;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray_10255;
         short[] var24 = var6.aShortArray_10256;
         if(!var6.aBoolean_10245) {
            var6.method6863();
         }

         int var25 = var6.anInt_10206;
         int var26 = var6.anInt_10233;
         int var27 = var6.anInt_10248;
         int var28 = var6.anInt_10266;
         int var29 = var6.anInt_10264;
         int var30 = var6.anInt_10246;

         for(int var31 = 0; var31 < this.anInt_10208; ++var31) {
            int var32 = this.anIntArray_10235[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.anIntArray_10209[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.anIntArray_10211[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray_10255[var31];
                     int var37 = this.anIntArray_10255[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37; ++var38) {
                        var35 = this.aShortArray_10256[var38] - 1;
                        if(var35 == -1 || this.aByteArray_10220[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37; ++var40) {
                                 var39 = var24[var40] - 1;
                                 if(var39 == -1 || var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass395_10223 = new Class395();
                                    var15 = this.aClass395_10223.aShortArray_7564 = Class104_Sub15.method7368(this.aShortArray_10217, 2019559725);
                                    var16 = this.aClass395_10223.aShortArray_7562 = Class104_Sub15.method7368(this.aShortArray_10203, 2086239804);
                                    var17 = this.aClass395_10223.aShortArray_7563 = Class104_Sub15.method7368(this.aShortArray_10219, 2082258794);
                                    var18 = this.aClass395_10223.aByteArray_7561 = Class570.method6262(this.aByteArray_10220, -708028207);
                                 }

                                 if(var19 == null) {
                                    Class395 var47 = var6.aClass395_10223 = new Class395();
                                    var19 = var47.aShortArray_7564 = Class104_Sub15.method7368(var11, 2143120461);
                                    var20 = var47.aShortArray_7562 = Class104_Sub15.method7368(var12, 2043210238);
                                    var21 = var47.aShortArray_7563 = Class104_Sub15.method7368(var13, 2067280361);
                                    var22 = var47.aByteArray_7561 = Class570.method6262(var14, -708028207);
                                 }

                                 short var46 = this.aShortArray_10217[var35];
                                 short var41 = this.aShortArray_10203[var35];
                                 short var42 = this.aShortArray_10219[var35];
                                 byte var43 = this.aByteArray_10220[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var46;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var46 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray_10255[var31];
                                 var37 = this.anIntArray_10255[var31 + 1];

                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = this.aShortArray_10256[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var18[var45] != 0) {
                                       var15[var45] += var46;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 var6.method6856();
                                 this.method6856();
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

   public void method2012(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt_10208; ++var4) {
         if(var1 != 128) {
            this.anIntArray_10209[var4] = this.anIntArray_10209[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray_10235[var4] = this.anIntArray_10235[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray_10211[var4] = this.anIntArray_10211[var4] * var3 >> 7;
         }
      }

      this.method6854();
      this.aBoolean_10245 = false;
   }

   boolean method6913(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return var4 < var5 && var4 < var6 && var4 < var7?false:(var2 > var5 && var2 > var6 && var2 > var7?false:(var3 < var8 && var3 < var9 && var3 < var10?false:var1 <= var8 || var1 <= var9 || var1 <= var10));
   }

   public void method2035(short var1, short var2) {
      Class163 var3 = this.aRenderer_Sub3_10202.aClass163_2802;

      for(int var4 = 0; var4 < this.anInt_10224; ++var4) {
         if(this.aShortArray_10231[var4] == var1) {
            this.aShortArray_10231[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if(var1 != -1) {
         Class183 var6 = var3.method1996(var1 & '\uffff', (byte)2);
         var11 = var6.aByte_3165;
         var5 = var6.aByte_3176;
      }

      byte var12 = 0;
      byte var7 = 0;
      if(var2 != -1) {
         Class183 var8 = var3.method1996(var2 & '\uffff', (byte)2);
         var12 = var8.aByte_3165;
         var7 = var8.aByte_3176;
         if(var8.aByte_3145 != 0 || var8.aByte_3157 != 0) {
            this.aBoolean_10242 = true;
         }
      }

      if(var11 != var12 | var5 != var7) {
         if(this.aClass382Array_10260 != null) {
            for(int var13 = 0; var13 < this.anInt_10259; ++var13) {
               Class382 var9 = this.aClass382Array_10260[var13];
               Class391 var10 = this.aClass391Array_10244[var13];
               var10.anInt_7518 = var10.anInt_7518 & -16777216 | Class541.anIntArray_9470[this.aShortArray_10226[var9.anInt_7386] & '\uffff'] & 16777215;
            }
         }

         this.method6898();
      }

   }
}
