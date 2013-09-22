
public class Class335 {

   static final Class335 aClass335_6467 = new Class335(27, 0);
   public static final Class335 aClass335_6468 = new Class335(15, -1);
   public static final Class335 aClass335_6469 = new Class335(16, -2);
   public static final Class335 aClass335_6470 = new Class335(14, 0);
   static final Class335 aClass335_6471 = new Class335(23, 4);
   static final Class335 aClass335_6472 = new Class335(24, -1);
   public static final Class335 aClass335_6473 = new Class335(26, 0);
   static final Class335[] aClass335Array_6474 = new Class335[32];
   public static final Class335 aClass335_6475 = new Class335(28, -2);
   public static final Class335 aClass335_6476 = new Class335(19, -2);
   public static final Class335 aClass335_6477 = new Class335(30, -2);
   public final int anInt_6478;
   public static final Class335 aClass335_6479 = new Class335(29, -2);


   static {
      Class335[] var0 = Class588.method6393((byte)1);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         aClass335Array_6474[311892347 * var0[var1].anInt_6478] = var0[var1];
      }

   }

   Class335(int var1, int var2) {
      this.anInt_6478 = var1 * -303112781;
   }

   static final void method4155(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aBoolean_270?1:0;
   }

   static final void method4156(RSInterfaceData var0, int var1) {
      Plane.method2165(AbstractCacheData.method4679(647514803), (byte)126);
   }

   static final void method4157(RSInterfaceData var0, byte var1) throws Exception_Sub1 {
      Class542.aClass43_Sub1_9475.method354((float)var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] / 1000.0F, 1036849418);
   }

   static final boolean method4158(Class638[][][] var0, int var1, int var2, int var3, boolean var4, int var5) {
      byte[][][] var6 = client.aClass296_348.method3758(-1078418514);
      byte var7 = var4?1:(byte)(client.anInt_409 * 838393341 & 255);
      if(var7 == var6[-763239015 * CacheFileID.anInt_2036][var2][var3]) {
         return false;
      } else {
         Class281 var8 = client.aClass296_348.method3753();
         if((var8.aByteArrayArrayArray_4768[-763239015 * CacheFileID.anInt_2036][var2][var3] & 4) == 0) {
            return false;
         } else {
            byte var9 = 0;
            int var10 = 0;
            client.anIntArray_368[var9] = var2;
            int var26 = var9 + 1;
            client.anIntArray_338[var9] = var3;
            var6[-763239015 * CacheFileID.anInt_2036][var2][var3] = var7;

            while(var10 != var26) {
               int var11 = client.anIntArray_368[var10] & '\uffff';
               int var12 = client.anIntArray_368[var10] >> 16 & 255;
               int var13 = client.anIntArray_368[var10] >> 24 & 255;
               int var14 = client.anIntArray_338[var10] & '\uffff';
               int var15 = client.anIntArray_338[var10] >> 16 & 255;
               var10 = 1 + var10 & 4095;
               boolean var16 = false;
               if((var8.aByteArrayArrayArray_4768[CacheFileID.anInt_2036 * -763239015][var11][var14] & 4) == 0) {
                  var16 = true;
               }

               boolean var17 = false;
               int var19;
               int var18;
               int var20;
               if(null != var0) {
                  label238:
                  for(var18 = 1 + CacheFileID.anInt_2036 * -763239015; var18 <= 3; ++var18) {
                     if(null != var0[var18] && (var8.aByteArrayArrayArray_4768[var18][var11][var14] & 8) == 0) {
                        PositionEntity var21;
                        int var23;
                        Class638 var27;
                        Class629 var28;
                        if(var16 && var0[var18][var11][var14] != null) {
                           if(null != var0[var18][var11][var14].aClass563_Sub1_Sub5_10131) {
                              var19 = Class407.method5026(var12, -49775086);
                              if(var19 == var0[var18][var11][var14].aClass563_Sub1_Sub5_10131.aShort_3323 || var0[var18][var11][var14].aClass563_Sub1_Sub5_10132 != null && var0[var18][var11][var14].aClass563_Sub1_Sub5_10132.aShort_3323 == var19) {
                                 continue;
                              }

                              if(var13 != 0) {
                                 var20 = Class407.method5026(var13, 1457114034);
                                 if(var0[var18][var11][var14].aClass563_Sub1_Sub5_10131.aShort_3323 == var20 || null != var0[var18][var11][var14].aClass563_Sub1_Sub5_10132 && var20 == var0[var18][var11][var14].aClass563_Sub1_Sub5_10132.aShort_3323) {
                                    continue;
                                 }
                              }

                              if(var15 != 0) {
                                 var20 = Class407.method5026(var15, -1507511306);
                                 if(var0[var18][var11][var14].aClass563_Sub1_Sub5_10131.aShort_3323 == var20 || var0[var18][var11][var14].aClass563_Sub1_Sub5_10132 != null && var20 == var0[var18][var11][var14].aClass563_Sub1_Sub5_10132.aShort_3323) {
                                    continue;
                                 }
                              }
                           }

                           var27 = var0[var18][var11][var14];
                           if(null != var27.aClass629_10137) {
                              for(var28 = var27.aClass629_10137; null != var28; var28 = var28.aClass629_10073) {
                                 var21 = var28.aClass563_Sub1_Sub4_10075;
                                 if(var21 instanceof Class218) {
                                    Class218 var22 = (Class218)var21;
                                    var23 = var22.method2730(-434194821);
                                    int var24 = var22.method2718(612116716);
                                    if(21 == var23) {
                                       var23 = 19;
                                    }

                                    int var25 = var23 | var24 << 6;
                                    if(var12 == var25 || var13 != 0 && var25 == var13 || var15 != 0 && var15 == var25) {
                                       continue label238;
                                    }
                                 }
                              }
                           }
                        }

                        var27 = var0[var18][var11][var14];
                        if(null != var27 && var27.aClass629_10137 != null) {
                           for(var28 = var27.aClass629_10137; var28 != null; var28 = var28.aClass629_10073) {
                              var21 = var28.aClass563_Sub1_Sub4_10075;
                              if(var21.locX2 != var21.locX || var21.locY2 != var21.locY) {
                                 for(int var29 = var21.locX; var29 <= var21.locX2; ++var29) {
                                    for(var23 = var21.locY; var23 <= var21.locY2; ++var23) {
                                       var6[var18][var29][var23] = var7;
                                    }
                                 }
                              }
                           }
                        }

                        var6[var18][var11][var14] = var7;
                        var17 = true;
                     }
                  }
               }

               if(var17) {
                  int var30 = CacheFileID.anInt_2036 * -763239015;
                  var18 = client.aClass296_348.getWorldObjects().planes[var30 + 1].method2155(var11, var14, (short)-21595);
                  if(client.anIntArray_425[var1] < var18) {
                     client.anIntArray_425[var1] = var18;
                  }

                  var19 = var11 << 9;
                  var20 = var14 << 9;
                  if(client.anIntArray_304[var1] > var19) {
                     client.anIntArray_304[var1] = var19;
                  } else if(client.anIntArray_427[var1] < var19) {
                     client.anIntArray_427[var1] = var19;
                  }

                  if(client.anIntArray_429[var1] > var20) {
                     client.anIntArray_429[var1] = var20;
                  } else if(client.anIntArray_428[var1] < var20) {
                     client.anIntArray_428[var1] = var20;
                  }
               }

               if(!var16) {
                  if(var11 >= 1 && var7 != var6[-763239015 * CacheFileID.anInt_2036][var11 - 1][var14]) {
                     client.anIntArray_368[var26] = var11 - 1 | 1179648 | -754974720;
                     client.anIntArray_338[var26] = var14 | 1245184;
                     var26 = var26 + 1 & 4095;
                     var6[-763239015 * CacheFileID.anInt_2036][var11 - 1][var14] = var7;
                  }

                  ++var14;
                  if(var14 < client.aClass296_348.getMaxY(-2010616975)) {
                     if(var11 - 1 >= 0 && var6[CacheFileID.anInt_2036 * -763239015][var11 - 1][var14] != var7 && (var8.aByteArrayArrayArray_4768[CacheFileID.anInt_2036 * -763239015][var11][var14] & 4) == 0 && 0 == (var8.aByteArrayArrayArray_4768[CacheFileID.anInt_2036 * -763239015][var11 - 1][var14 - 1] & 4)) {
                        client.anIntArray_368[var26] = var11 - 1 | 1179648 | 1375731712;
                        client.anIntArray_338[var26] = var14 | 1245184;
                        var26 = 1 + var26 & 4095;
                        var6[CacheFileID.anInt_2036 * -763239015][var11 - 1][var14] = var7;
                     }

                     if(var7 != var6[-763239015 * CacheFileID.anInt_2036][var11][var14]) {
                        client.anIntArray_368[var26] = var11 | 5373952 | 318767104;
                        client.anIntArray_338[var26] = var14 | 5439488;
                        var26 = 1 + var26 & 4095;
                        var6[-763239015 * CacheFileID.anInt_2036][var11][var14] = var7;
                     }

                     if(1 + var11 < client.aClass296_348.getMaxX((byte)-110) && var6[CacheFileID.anInt_2036 * -763239015][1 + var11][var14] != var7 && 0 == (var8.aByteArrayArrayArray_4768[CacheFileID.anInt_2036 * -763239015][var11][var14] & 4) && (var8.aByteArrayArrayArray_4768[-763239015 * CacheFileID.anInt_2036][1 + var11][var14 - 1] & 4) == 0) {
                        client.anIntArray_368[var26] = 1 + var11 | 5373952 | -1845493760;
                        client.anIntArray_338[var26] = var14 | 5439488;
                        var26 = var26 + 1 & 4095;
                        var6[-763239015 * CacheFileID.anInt_2036][1 + var11][var14] = var7;
                     }
                  }

                  --var14;
                  if(1 + var11 < client.aClass296_348.getMaxX((byte)-27) && var7 != var6[-763239015 * CacheFileID.anInt_2036][1 + var11][var14]) {
                     client.anIntArray_368[var26] = 1 + var11 | 9568256 | 1392508928;
                     client.anIntArray_338[var26] = var14 | 9633792;
                     var26 = var26 + 1 & 4095;
                     var6[-763239015 * CacheFileID.anInt_2036][var11 + 1][var14] = var7;
                  }

                  --var14;
                  if(var14 >= 0) {
                     if(var11 - 1 >= 0 && var6[CacheFileID.anInt_2036 * -763239015][var11 - 1][var14] != var7 && (var8.aByteArrayArrayArray_4768[CacheFileID.anInt_2036 * -763239015][var11][var14] & 4) == 0 && (var8.aByteArrayArrayArray_4768[-763239015 * CacheFileID.anInt_2036][var11 - 1][1 + var14] & 4) == 0) {
                        client.anIntArray_368[var26] = var11 - 1 | 13762560 | 301989888;
                        client.anIntArray_338[var26] = var14 | 13828096;
                        var26 = 1 + var26 & 4095;
                        var6[CacheFileID.anInt_2036 * -763239015][var11 - 1][var14] = var7;
                     }

                     if(var6[-763239015 * CacheFileID.anInt_2036][var11][var14] != var7) {
                        client.anIntArray_368[var26] = var11 | 13762560 | -1828716544;
                        client.anIntArray_338[var26] = var14 | 13828096;
                        var26 = 1 + var26 & 4095;
                        var6[CacheFileID.anInt_2036 * -763239015][var11][var14] = var7;
                     }

                     if(var11 + 1 < client.aClass296_348.getMaxX((byte)-126) && var7 != var6[-763239015 * CacheFileID.anInt_2036][var11 + 1][var14] && 0 == (var8.aByteArrayArrayArray_4768[CacheFileID.anInt_2036 * -763239015][var11][var14] & 4) && 0 == (var8.aByteArrayArrayArray_4768[CacheFileID.anInt_2036 * -763239015][var11 + 1][1 + var14] & 4)) {
                        client.anIntArray_368[var26] = var11 + 1 | 9568256 | -771751936;
                        client.anIntArray_338[var26] = var14 | 9633792;
                        var26 = 1 + var26 & 4095;
                        var6[CacheFileID.anInt_2036 * -763239015][1 + var11][var14] = var7;
                     }
                  }
               }
            }

            if(client.anIntArray_425[var1] != -1000000) {
               client.anIntArray_425[var1] += 40;
               client.anIntArray_304[var1] -= 512;
               client.anIntArray_427[var1] += 512;
               client.anIntArray_428[var1] += 512;
               client.anIntArray_429[var1] -= 512;
            }

            return true;
         }
      }
   }

   public static void method4159(int var0, CacheDataUnpacker var1, int var2, int var3, int var4, boolean var5, int var6) {
      Class134.anInt_2617 = 642235515;
      ConnectionUpdate.aCacheUnpacker_119 = var1;
      Class134.anInt_2611 = var2 * -981507397;
      Class489.anInt_9003 = -2057939165 * var3;
      Class123.aClass240_Sub41_Sub2_2276 = null;
      Class586.anInt_9739 = var4 * -101527585;
      Class134.aBoolean_2612 = var5;
      Class134.anInt_2620 = var0 * 639547177;
      Class586.aClass110_9743 = null;
   }
}
