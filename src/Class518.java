
public final class Class518 {

   static final int anInt_9222 = 1;
   static final int anInt_9223 = 16;
   static final int anInt_9224 = 23;
   static final int anInt_9225 = 0;
   static final int anInt_9226 = 4096;
   static Class509 aClass509_9227 = new Class509();
   static final int anInt_9228 = 6;
   static final int anInt_9229 = 50;


   public static int method5955(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Class509 var5 = aClass509_9227;
      synchronized(aClass509_9227) {
         aClass509_9227.aByteArray_9150 = var2;
         aClass509_9227.anInt_9157 = var4 * 839818541;
         aClass509_9227.aByteArray_9156 = var0;
         aClass509_9227.anInt_9154 = 0;
         aClass509_9227.anInt_9155 = var1 * 1419438391;
         aClass509_9227.anInt_9153 = 0;
         aClass509_9227.anInt_9159 = 0;
         aClass509_9227.anInt_9152 = 0;
         aClass509_9227.anInt_9170 = 0;
         method5961(aClass509_9227);
         var1 -= aClass509_9227.anInt_9155 * -400876409;
         aClass509_9227.aByteArray_9150 = null;
         aClass509_9227.aByteArray_9156 = null;
         return var1;
      }
   }

   static void method5956(Class509 var0) {
      byte var1 = var0.aByte_9160;
      int var2 = var0.anInt_9172 * -858280059;
      int var3 = var0.anInt_9166 * -1046518349;
      int var4 = var0.anInt_9164 * 1506494723;
      int[] var5 = Class240_Sub52_Sub2.anIntArray_871;
      int var6 = var0.anInt_9163 * -1277219847;
      byte[] var7 = var0.aByteArray_9156;
      int var8 = var0.anInt_9154 * 1732753247;
      int var9 = var0.anInt_9155 * -400876409;
      int var11 = var0.anInt_9181 * -466277399 + 1;

      label63:
      while(true) {
         if(var2 > 0) {
            while(true) {
               if(var9 == 0) {
                  break label63;
               }

               if(var2 == 1) {
                  if(var9 == 0) {
                     var2 = 1;
                     break label63;
                  }

                  var7[var8] = var1;
                  ++var8;
                  --var9;
                  break;
               }

               var7[var8] = var1;
               --var2;
               ++var8;
               --var9;
            }
         }

         while(var3 != var11) {
            var1 = (byte)var4;
            var6 = var5[var6];
            byte var12 = (byte)var6;
            var6 >>= 8;
            ++var3;
            if(var12 != var4) {
               var4 = var12;
               if(var9 == 0) {
                  var2 = 1;
                  break label63;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
            } else {
               if(var3 != var11) {
                  var2 = 2;
                  var6 = var5[var6];
                  var12 = (byte)var6;
                  var6 >>= 8;
                  ++var3;
                  if(var3 != var11) {
                     if(var12 != var4) {
                        var4 = var12;
                     } else {
                        var2 = 3;
                        var6 = var5[var6];
                        var12 = (byte)var6;
                        var6 >>= 8;
                        ++var3;
                        if(var3 != var11) {
                           if(var12 != var4) {
                              var4 = var12;
                           } else {
                              var6 = var5[var6];
                              var12 = (byte)var6;
                              var6 >>= 8;
                              ++var3;
                              var2 = (var12 & 255) + 4;
                              var6 = var5[var6];
                              var4 = (byte)var6;
                              var6 >>= 8;
                              ++var3;
                           }
                        }
                     }
                  }
                  continue label63;
               }

               if(var9 == 0) {
                  var2 = 1;
                  break label63;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
            }
         }

         var2 = 0;
         break;
      }

      int var13 = var0.anInt_9170 * 840938325;
      var0.anInt_9170 += (var9 - var9) * 1492562429;
      if(var0.anInt_9170 * 840938325 < var13) {
         ;
      }

      var0.aByte_9160 = var1;
      var0.anInt_9172 = var2 * -963317427;
      var0.anInt_9166 = var3 * -728641157;
      var0.anInt_9164 = var4 * -1653839445;
      Class240_Sub52_Sub2.anIntArray_871 = var5;
      var0.anInt_9163 = var6 * 1642178121;
      var0.aByteArray_9156 = var7;
      var0.anInt_9154 = var8 * 1034708127;
      var0.anInt_9155 = var9 * 1419438391;
   }

   static byte method5957(Class509 var0) {
      return (byte)method5959(8, var0);
   }

   static byte method5958(Class509 var0) {
      return (byte)method5959(1, var0);
   }

   static int method5959(int var0, Class509 var1) {
      while(var1.anInt_9153 * -1321167309 < var0) {
         var1.anInt_9159 = (var1.anInt_9159 * -676896195 << 8 | var1.aByteArray_9150[var1.anInt_9157 * -919946587] & 255) * -367213291;
         var1.anInt_9153 += -261969960;
         var1.anInt_9157 += 839818541;
         var1.anInt_9152 += 653105639;
         if(var1.anInt_9152 * -796104233 == 0) {
            ;
         }
      }

      int var2 = var1.anInt_9159 * -676896195 >> var1.anInt_9153 * -1321167309 - var0 & (1 << var0) - 1;
      var1.anInt_9153 -= var0 * 504124667;
      return var2;
   }

   static void method5960(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   static void method5961(Class509 var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      int var19 = 0;
      int[] var20 = null;
      int[] var21 = null;
      int[] var22 = null;
      var0.anInt_9161 = -1143259157;
      if(Class240_Sub52_Sub2.anIntArray_871 == null) {
         Class240_Sub52_Sub2.anIntArray_871 = new int[var0.anInt_9161 * -987788320];
      }

      boolean var23 = true;

      while(var23) {
         byte var24 = method5957(var0);
         if(var24 == 23) {
            return;
         }

         var24 = method5957(var0);
         var24 = method5957(var0);
         var24 = method5957(var0);
         var24 = method5957(var0);
         var24 = method5957(var0);
         var24 = method5957(var0);
         var24 = method5957(var0);
         var24 = method5957(var0);
         var24 = method5957(var0);
         var24 = method5958(var0);
         if(var24 != 0) {
            ;
         }

         var0.anInt_9162 = 0;
         var24 = method5957(var0);
         var0.anInt_9162 = (var0.anInt_9162 * 1586576517 << 8 | var24 & 255) * -207791027;
         var24 = method5957(var0);
         var0.anInt_9162 = (var0.anInt_9162 * 1586576517 << 8 | var24 & 255) * -207791027;
         var24 = method5957(var0);
         var0.anInt_9162 = (var0.anInt_9162 * 1586576517 << 8 | var24 & 255) * -207791027;

         int var35;
         for(var35 = 0; var35 < 16; ++var35) {
            var24 = method5958(var0);
            if(var24 == 1) {
               var0.aBooleanArray_9171[var35] = true;
            } else {
               var0.aBooleanArray_9171[var35] = false;
            }
         }

         for(var35 = 0; var35 < 256; ++var35) {
            var0.aBooleanArray_9169[var35] = false;
         }

         int var36;
         for(var35 = 0; var35 < 16; ++var35) {
            if(var0.aBooleanArray_9171[var35]) {
               for(var36 = 0; var36 < 16; ++var36) {
                  var24 = method5958(var0);
                  if(var24 == 1) {
                     var0.aBooleanArray_9169[var35 * 16 + var36] = true;
                  }
               }
            }
         }

         method5962(var0);
         int var38 = var0.anInt_9168 * -778390541 + 2;
         int var39 = method5959(3, var0);
         int var40 = method5959(15, var0);
         var35 = 0;

         while(var35 < var40) {
            var36 = 0;

            while(true) {
               var24 = method5958(var0);
               if(var24 == 0) {
                  var0.aByteArray_9144[var35] = (byte)var36;
                  ++var35;
                  break;
               }

               ++var36;
            }
         }

         byte[] var25 = new byte[6];

         byte var26;
         for(var26 = 0; var26 < var39; var25[var26] = var26++) {
            ;
         }

         for(var35 = 0; var35 < var40; ++var35) {
            var26 = var0.aByteArray_9144[var35];

            byte var27;
            for(var27 = var25[var26]; var26 > 0; --var26) {
               var25[var26] = var25[var26 - 1];
            }

            var25[0] = var27;
            var0.aByteArray_9174[var35] = var27;
         }

         int var37;
         for(var37 = 0; var37 < var39; ++var37) {
            int var50 = method5959(5, var0);
            var35 = 0;

            while(var35 < var38) {
               while(true) {
                  var24 = method5958(var0);
                  if(var24 == 0) {
                     var0.aByteArrayArray_9176[var37][var35] = (byte)var50;
                     ++var35;
                     break;
                  }

                  var24 = method5958(var0);
                  if(var24 == 0) {
                     ++var50;
                  } else {
                     --var50;
                  }
               }
            }
         }

         for(var37 = 0; var37 < var39; ++var37) {
            byte var28 = 32;
            byte var29 = 0;

            for(var35 = 0; var35 < var38; ++var35) {
               if(var0.aByteArrayArray_9176[var37][var35] > var29) {
                  var29 = var0.aByteArrayArray_9176[var37][var35];
               }

               if(var0.aByteArrayArray_9176[var37][var35] < var28) {
                  var28 = var0.aByteArrayArray_9176[var37][var35];
               }
            }

            method5960(var0.anIntArrayArray_9177[var37], var0.anIntArrayArray_9178[var37], var0.anIntArrayArray_9173[var37], var0.aByteArrayArray_9176[var37], var28, var29, var38);
            var0.anIntArray_9179[var37] = var28;
         }

         int var41 = var0.anInt_9168 * -778390541 + 1;
         int var42 = -1;
         byte var43 = 0;

         for(var35 = 0; var35 <= 255; ++var35) {
            var0.anIntArray_9165[var35] = 0;
         }

         int var56 = 4095;

         int var55;
         int var54;
         for(var54 = 15; var54 >= 0; --var54) {
            for(var55 = 15; var55 >= 0; --var55) {
               var0.aByteArray_9180[var56] = (byte)(var54 * 16 + var55);
               --var56;
            }

            var0.anIntArray_9151[var54] = var56 + 1;
         }

         int var44 = 0;
         byte var53;
         if(var43 == 0) {
            ++var42;
            var43 = 50;
            var53 = var0.aByteArray_9174[var42];
            var19 = var0.anIntArray_9179[var53];
            var20 = var0.anIntArrayArray_9177[var53];
            var22 = var0.anIntArrayArray_9173[var53];
            var21 = var0.anIntArrayArray_9178[var53];
         }

         int var46 = var43 - 1;
         int var49 = var19;

         int var51;
         byte var52;
         for(var51 = method5959(var19, var0); var51 > var20[var49]; var51 = var51 << 1 | var52) {
            ++var49;
            var52 = method5958(var0);
         }

         int var45 = var22[var51 - var21[var49]];

         while(var45 != var41) {
            if(var45 != 0 && var45 != 1) {
               int var30 = var45 - 1;
               int var31;
               if(var30 < 16) {
                  var31 = var0.anIntArray_9151[0];

                  for(var24 = var0.aByteArray_9180[var31 + var30]; var30 > 3; var30 -= 4) {
                     int var32 = var31 + var30;
                     var0.aByteArray_9180[var32] = var0.aByteArray_9180[var32 - 1];
                     var0.aByteArray_9180[var32 - 1] = var0.aByteArray_9180[var32 - 2];
                     var0.aByteArray_9180[var32 - 2] = var0.aByteArray_9180[var32 - 3];
                     var0.aByteArray_9180[var32 - 3] = var0.aByteArray_9180[var32 - 4];
                  }

                  while(var30 > 0) {
                     var0.aByteArray_9180[var31 + var30] = var0.aByteArray_9180[var31 + var30 - 1];
                     --var30;
                  }

                  var0.aByteArray_9180[var31] = var24;
               } else {
                  int var33 = var30 / 16;
                  int var34 = var30 % 16;
                  var31 = var0.anIntArray_9151[var33] + var34;

                  for(var24 = var0.aByteArray_9180[var31]; var31 > var0.anIntArray_9151[var33]; --var31) {
                     var0.aByteArray_9180[var31] = var0.aByteArray_9180[var31 - 1];
                  }

                  ++var0.anIntArray_9151[var33];

                  while(var33 > 0) {
                     --var0.anIntArray_9151[var33];
                     var0.aByteArray_9180[var0.anIntArray_9151[var33]] = var0.aByteArray_9180[var0.anIntArray_9151[var33 - 1] + 16 - 1];
                     --var33;
                  }

                  --var0.anIntArray_9151[0];
                  var0.aByteArray_9180[var0.anIntArray_9151[0]] = var24;
                  if(var0.anIntArray_9151[0] == 0) {
                     var56 = 4095;

                     for(var54 = 15; var54 >= 0; --var54) {
                        for(var55 = 15; var55 >= 0; --var55) {
                           var0.aByteArray_9180[var56] = var0.aByteArray_9180[var0.anIntArray_9151[var54] + var55];
                           --var56;
                        }

                        var0.anIntArray_9151[var54] = var56 + 1;
                     }
                  }
               }

               ++var0.anIntArray_9165[var0.aByteArray_9175[var24 & 255] & 255];
               Class240_Sub52_Sub2.anIntArray_871[var44] = var0.aByteArray_9175[var24 & 255] & 255;
               ++var44;
               if(var46 == 0) {
                  ++var42;
                  var46 = 50;
                  var53 = var0.aByteArray_9174[var42];
                  var19 = var0.anIntArray_9179[var53];
                  var20 = var0.anIntArrayArray_9177[var53];
                  var22 = var0.anIntArrayArray_9173[var53];
                  var21 = var0.anIntArrayArray_9178[var53];
               }

               --var46;
               var49 = var19;

               for(var51 = method5959(var19, var0); var51 > var20[var49]; var51 = var51 << 1 | var52) {
                  ++var49;
                  var52 = method5958(var0);
               }

               var45 = var22[var51 - var21[var49]];
            } else {
               int var47 = -1;
               int var48 = 1;

               do {
                  if(var45 == 0) {
                     var47 += 1 * var48;
                  } else if(var45 == 1) {
                     var47 += 2 * var48;
                  }

                  var48 *= 2;
                  if(var46 == 0) {
                     ++var42;
                     var46 = 50;
                     var53 = var0.aByteArray_9174[var42];
                     var19 = var0.anIntArray_9179[var53];
                     var20 = var0.anIntArrayArray_9177[var53];
                     var22 = var0.anIntArrayArray_9173[var53];
                     var21 = var0.anIntArrayArray_9178[var53];
                  }

                  --var46;
                  var49 = var19;

                  for(var51 = method5959(var19, var0); var51 > var20[var49]; var51 = var51 << 1 | var52) {
                     ++var49;
                     var52 = method5958(var0);
                  }

                  var45 = var22[var51 - var21[var49]];
               } while(var45 == 0 || var45 == 1);

               ++var47;
               var24 = var0.aByteArray_9175[var0.aByteArray_9180[var0.anIntArray_9151[0]] & 255];

               for(var0.anIntArray_9165[var24 & 255] += var47; var47 > 0; --var47) {
                  Class240_Sub52_Sub2.anIntArray_871[var44] = var24 & 255;
                  ++var44;
               }
            }
         }

         var0.anInt_9172 = 0;
         var0.aByte_9160 = 0;
         var0.anIntArray_9167[0] = 0;

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.anIntArray_9167[var35] = var0.anIntArray_9165[var35 - 1];
         }

         for(var35 = 1; var35 <= 256; ++var35) {
            var0.anIntArray_9167[var35] += var0.anIntArray_9167[var35 - 1];
         }

         for(var35 = 0; var35 < var44; ++var35) {
            var24 = (byte)(Class240_Sub52_Sub2.anIntArray_871[var35] & 255);
            Class240_Sub52_Sub2.anIntArray_871[var0.anIntArray_9167[var24 & 255]] |= var35 << 8;
            ++var0.anIntArray_9167[var24 & 255];
         }

         var0.anInt_9163 = (Class240_Sub52_Sub2.anIntArray_871[var0.anInt_9162 * 1586576517] >> 8) * 1642178121;
         var0.anInt_9166 = 0;
         var0.anInt_9163 = Class240_Sub52_Sub2.anIntArray_871[var0.anInt_9163 * -1277219847] * 1642178121;
         var0.anInt_9164 = (byte)(var0.anInt_9163 * -1277219847 & 255) * -1653839445;
         var0.anInt_9163 = (var0.anInt_9163 * -1277219847 >> 8) * 1642178121;
         var0.anInt_9166 += -728641157;
         var0.anInt_9181 = var44 * -698590119;
         method5956(var0);
         if(var0.anInt_9166 * -1046518349 == var0.anInt_9181 * -466277399 + 1 && var0.anInt_9172 * -858280059 == 0) {
            var23 = true;
         } else {
            var23 = false;
         }
      }

   }

   static void method5962(Class509 var0) {
      var0.anInt_9168 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.aBooleanArray_9169[var1]) {
            var0.aByteArray_9175[var0.anInt_9168 * -778390541] = (byte)var1;
            var0.anInt_9168 += -994960069;
         }
      }

   }

   Class518() throws Throwable {
      throw new Error();
   }
}
