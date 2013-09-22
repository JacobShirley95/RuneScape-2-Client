import java.util.ArrayList;
import java.util.Iterator;

public class Class248 {

   static int[] anIntArray_4103;
   static Class530 aClass530_4104;
   protected static Class529 aClass529_4105;
   protected static int anInt_4106;
   protected static Class445 aClass445_4107;
   protected static Class184 aClass184_4108;
   static Class565 aClass565_4109;
   protected static int anInt_4110;
   protected static CacheDataUnpacker aCacheUnpacker_4111;
   static NodeArrayList aNodeArrayList_4112 = new NodeArrayList(16);
   public static MapOverviewNode currentWorldArea;
   protected static int maxMapTilesX;
   protected static byte[][][] aByteArrayArrayArray_4115;
   protected static int anInt_4116;
   static int[] anIntArray_4117 = new int[1];
   static byte[] aByteArray_4118 = new byte[1];
   public static float mapZoomScaleX;
   public static int anInt_4120;
   protected static MapElements staticElements;
   protected static NodeList aNodeList_4122 = new NodeList();
   protected static int anInt_4123;
   public static int anInt_4124;
   static byte[] aByteArray_4125;
   protected static int maxMapTilesY;
   protected static int anInt_4127;
   static byte[] aByteArray_4128;
   protected static int anInt_4129 = (int)(Math.random() * 17.0D) - 8;
   static short[] aShortArray_4130;
   static byte[] aByteArray_4131;
   static byte[] aByteArray_4132;
   static Object[] anObjectArray_4133;
   protected static int anInt_4134;
   static ArrayList[][][] anArrayListArrayArrayArray_4135;
   static byte[] aByteArray_4136;
   protected static int anInt_4137;
   public static float mapZoomScaleY;
   protected static int anInt_4139 = (int)(Math.random() * 11.0D) - 5;
   protected static Class185 aClass185_4140;
   protected static int anInt_4141;
   protected static int anInt_4142;
   protected static MapIconUnpacker mapIconUnpacker;


   public static void method3154(CacheDataUnpacker var0, Class565 var1, Class530 var2, Class529 var3, MapIconUnpacker var4, Class445 var5, Class185 var6, Class184 var7) {
      aCacheUnpacker_4111 = var0;
      aClass565_4109 = var1;
      aClass530_4104 = var2;
      aClass529_4105 = var3;
      mapIconUnpacker = var4;
      aClass445_4107 = var5;
      aClass185_4140 = var6;
      aClass184_4108 = var7;
      aNodeArrayList_4112.method5938(1400737595);
      int detailsOffset = aCacheUnpacker_4111.getCacheOffset("details");
      int[] var9 = aCacheUnpacker_4111.getSubOffsets(detailsOffset);
      if(var9 != null) {
         for(int var10 = 0; var10 < var9.length; ++var10) {
            MapOverviewNode var11 = GamePack.method5983(aCacheUnpacker_4111, detailsOffset, var9[var10], (short)18851);
            aNodeArrayList_4112.insert(var11, (long)(var11.anInt_3514 * 1587104365));
         }
      }

      Class86.method1127(true, false, (byte)-36);
   }

   static void method3155() {
      aByteArray_4125 = new byte[maxMapTilesX * maxMapTilesY];
      aByteArray_4131 = new byte[maxMapTilesX * maxMapTilesY];
      aByteArray_4132 = new byte[maxMapTilesX * maxMapTilesY];
      anObjectArray_4133 = new Object[maxMapTilesX * maxMapTilesY];
      aByteArray_4136 = new byte[maxMapTilesX * maxMapTilesY];
      anArrayListArrayArrayArray_4135 = new ArrayList[3][maxMapTilesX >> 6][maxMapTilesY >> 6];
      anIntArray_4103 = new int[aClass565_4109.anInt_9607 * -724245299 + 1];
   }

   static void method3156(Renderer var0, ByteArrayDataNode var1, int var2, int var3, int var4, int var5, int[] var6, int[] var7) {
      int var8 = var1.readByte(1523669874);
      if((var8 & 1) == 0) {
         boolean var9 = (var8 & 2) == 0;
         int var10 = var8 >> 2 & 63;
         if(var10 == 62) {
            return;
         }

         if(var10 == 63) {
            var10 = var1.readByte(1736440789);
         } else if(var9) {
            var10 = var6[var10];
         } else {
            var10 = var7[var10];
         }

         if(var9) {
            aByteArray_4125[var4 + var5 * maxMapTilesX] = (byte)var10;
            aByteArray_4131[var4 + var5 * maxMapTilesX] = 0;
         } else {
            aByteArray_4131[var4 + var5 * maxMapTilesX] = (byte)var10;
            aByteArray_4132[var4 + var5 * maxMapTilesX] = 0;
            aByteArray_4125[var4 + var5 * maxMapTilesX] = var1.getByte((byte)101);
         }
      } else {
         int var20 = (var8 >> 1 & 3) + 1;
         boolean var21 = (var8 & 8) != 0;
         boolean var11 = (var8 & 16) != 0;

         for(int var12 = 0; var12 < var20; ++var12) {
            int var13 = var1.readByte(1301242705);
            int var14 = 0;
            int var15 = 0;
            if(var21) {
               var14 = var1.readByte(-158419010);
               var15 = var1.readByte(1487795425);
            }

            int var16 = 0;
            if(var11) {
               var16 = var1.readByte(2112572089);
            }

            int[] var17;
            int var19;
            byte[] var18;
            if(var12 == 0) {
               aByteArray_4125[var4 + var5 * maxMapTilesX] = (byte)var13;
               aByteArray_4131[var4 + var5 * maxMapTilesX] = (byte)var14;
               aByteArray_4132[var4 + var5 * maxMapTilesX] = (byte)var15;
               if(var16 == 1) {
                  anObjectArray_4133[var4 + var5 * maxMapTilesX] = new Integer(var1.method4493(-157074556));
                  aByteArray_4136[var4 + var5 * maxMapTilesX] = var1.getByte((byte)68);
               } else if(var16 > 1) {
                  var17 = new int[var16];
                  var18 = new byte[var16];

                  for(var19 = 0; var19 < var16; ++var19) {
                     var17[var19] = var1.method4493(-157074556);
                     var18[var19] = var1.getByte((byte)107);
                  }

                  anObjectArray_4133[var4 + var5 * maxMapTilesX] = new Class240_Sub42(var17, var18);
               }
            } else {
               var17 = null;
               var18 = null;
               if(var16 > 0) {
                  var17 = new int[var16];
                  var18 = new byte[var16];

                  for(var19 = 0; var19 < var16; ++var19) {
                     var17[var19] = var1.method4493(-157074556);
                     var18[var19] = var1.getByte((byte)102);
                  }
               }

               if(anArrayListArrayArrayArray_4135[var12 - 1][var2 - (anInt_4120 >> 6)][var3 - (anInt_4124 >> 6)] == null) {
                  anArrayListArrayArrayArray_4135[var12 - 1][var2 - (anInt_4120 >> 6)][var3 - (anInt_4124 >> 6)] = new ArrayList();
               }

               Class230 var22 = new Class230(var4 & 63, var5 & 63, var13, var14, var15, var17, var18);
               anArrayListArrayArrayArray_4135[var12 - 1][var2 - (anInt_4120 >> 6)][var3 - (anInt_4124 >> 6)].add(var22);
            }
         }
      }

   }

   public static MapOverviewNode method3157(int var0) {
      return (MapOverviewNode)aNodeArrayList_4112.getNode((long)var0);
   }

   static void method3158(Class163 var0, int var1, int var2) {
      for(int var3 = 0; var3 < aClass565_4109.anInt_9607 * -724245299; ++var3) {
         anIntArray_4103[var3 + 1] = method3159(var0, var3, var1, var2);
      }

   }

   static int method3159(Class163 var0, int var1, int var2, int var3) {
      Class571 var4 = aClass565_4109.method6222(var1, -1792597648);
      if(var4 == null) {
         return 0;
      } else {
         int var5 = var4.anInt_9638 * -533682665;
         if(var5 >= 0 && var0.method1996(var5, (byte)2).aBoolean_3174) {
            var5 = -1;
         }

         int var6;
         int var7;
         int var8;
         int var9;
         if(var4.anInt_9640 * 2098723055 >= 0) {
            var6 = var4.anInt_9640 * 2098723055;
            var7 = (var6 & 127) + var3;
            if(var7 < 0) {
               var7 = 0;
            } else if(var7 > 127) {
               var7 = 127;
            }

            var8 = (var6 + var2 & '\ufc00') + (var6 & 896) + var7;
            var9 = -16777216 | Class561.colourMap[CacheFileID.method1398(Class580.method6315(var8, 96, (byte)78), 345684984) & '\uffff'];
         } else if(var5 >= 0) {
            var9 = -16777216 | Class561.colourMap[CacheFileID.method1398(Class580.method6315(var0.method1996(var5, (byte)2).aShort_3118, 96, (byte)13), 92617487) & '\uffff'];
         } else if(var4.anInt_9634 * 768249075 == -1) {
            var9 = 0;
         } else {
            var6 = var4.anInt_9634 * 768249075;
            var7 = (var6 & 127) + var3;
            if(var7 < 0) {
               var7 = 0;
            } else if(var7 > 127) {
               var7 = 127;
            }

            var8 = (var6 + var2 & '\ufc00') + (var6 & 896) + var7;
            var9 = -16777216 | Class561.colourMap[CacheFileID.method1398(Class580.method6315(var8, 96, (byte)23), -855844569) & '\uffff'];
         }

         return var9;
      }
   }

   static void method3160(byte[] var0, byte[] var1, short[] var2, int var3, int var4) {
      int[] var5 = new int[maxMapTilesY];
      int[] var6 = new int[maxMapTilesY];
      int[] var7 = new int[maxMapTilesY];
      int[] var8 = new int[maxMapTilesY];
      int[] var9 = new int[maxMapTilesY];

      for(int var10 = -5; var10 < maxMapTilesX; ++var10) {
         int var11 = var10 + 5;
         int var12 = var10 - 5;

         int var13;
         int var14;
         for(var13 = 0; var13 < maxMapTilesY; ++var13) {
            Class497 var15;
            if(var11 < maxMapTilesX) {
               var14 = var0[var11 + var13 * maxMapTilesX] & 255;
               if(var14 > 0) {
                  var15 = aClass530_4104.method6025(var14 - 1, 962555388);
                  var5[var13] += var15.anInt_9074 * -1280337771;
                  var6[var13] += var15.anInt_9075 * 1874682839;
                  var7[var13] += var15.anInt_9072 * 320724809;
                  var8[var13] += var15.anInt_9069 * 608064785;
                  ++var9[var13];
               }
            }

            if(var12 >= 0) {
               var14 = var0[var12 + var13 * maxMapTilesX] & 255;
               if(var14 > 0) {
                  var15 = aClass530_4104.method6025(var14 - 1, -143834143);
                  var5[var13] -= var15.anInt_9074 * -1280337771;
                  var6[var13] -= var15.anInt_9075 * 1874682839;
                  var7[var13] -= var15.anInt_9072 * 320724809;
                  var8[var13] -= var15.anInt_9069 * 608064785;
                  --var9[var13];
               }
            }
         }

         if(var10 >= 0) {
            var13 = 0;
            var14 = 0;
            int var26 = 0;
            int var16 = 0;
            int var17 = 0;

            for(int var18 = -5; var18 < maxMapTilesY; ++var18) {
               int var19 = var18 + 5;
               if(var19 < maxMapTilesY) {
                  var13 += var5[var19];
                  var14 += var6[var19];
                  var26 += var7[var19];
                  var16 += var8[var19];
                  var17 += var9[var19];
               }

               int var20 = var18 - 5;
               if(var20 >= 0) {
                  var13 -= var5[var20];
                  var14 -= var6[var20];
                  var26 -= var7[var20];
                  var16 -= var8[var20];
                  var17 -= var9[var20];
               }

               if(var18 >= 0 && var17 > 0) {
                  int var21;
                  if((var0[var10 + var18 * maxMapTilesX] & 255) == 0) {
                     var21 = var10 + var18 * maxMapTilesX;
                     var1[var21] = 0;
                     var2[var21] = 0;
                  } else {
                     var21 = var16 == 0?0:Class228.method2903(var13 * 256 / var16, var14 / var17, var26 / var17, (byte)0);
                     int var22 = (var21 & 127) + var4;
                     if(var22 < 0) {
                        var22 = 0;
                     } else if(var22 > 127) {
                        var22 = 127;
                     }

                     int var23 = (var21 + var3 & '\ufc00') + (var21 & 896) + var22;
                     int var24 = var10 + var18 * maxMapTilesX;
                     int var25 = Class561.colourMap[CacheFileID.method1398(Class25.method156(var23, 96, 630193419), 1121313942) & '\uffff'];
                     var1[var24] = (byte)(var25 >> 16 & 255);
                     var2[var24] = (short)(var25 & '\uffff');
                  }
               }
            }
         }
      }

   }

   static void method3161() {
      int[] var0 = new int[3];

      for(int var1 = 0; var1 < staticElements.size * 655819939; ++var1) {
         boolean var2 = currentWorldArea.method2574(staticElements.positionData[var1] >> 28 & 3, staticElements.positionData[var1] >> 14 & 16383, staticElements.positionData[var1] & 16383, var0, 1844251466);
         if(var2) {
            Class240_Sub12 var3 = new Class240_Sub12(staticElements.cacheIDs[var1]);
            var3.anInt_6802 = (var0[1] - anInt_4120) * 1777327491;
            var3.anInt_6803 = (var0[2] - anInt_4124) * 1102304173;
            aNodeList_4122.addNode(var3, (short)-31698);
         }
      }

   }

   static void method3162(Renderer var0, int var1, int var2, int var3, int var4) {
      int var5 = anInt_4123 - anInt_4127;
      int var6 = anInt_4137 - anInt_4106;
      if(anInt_4123 < maxMapTilesX) {
         ++var5;
      }

      if(anInt_4137 < maxMapTilesY) {
         ++var6;
      }

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var19;
      for(var7 = 0; var7 < var5; ++var7) {
         var8 = (var3 + var1 * var7 >> 16) + anInt_4110;
         var9 = (var3 + var1 * (var7 + 1) >> 16) + anInt_4110;
         var10 = var9 - var8;
         if(var10 > 0) {
            var11 = anInt_4127 + var7;
            if(var11 >= 0 && var11 < maxMapTilesX) {
               for(var12 = 0; var12 < var6; ++var12) {
                  var13 = anInt_4134 - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = anInt_4134 - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if(var15 > 0) {
                     var16 = var12 + anInt_4106;
                     int var17 = var11 + var16 * maxMapTilesX;
                     int var18 = 0;
                     var19 = 0;
                     Object var20 = null;
                     if(var16 >= 0 && var16 < maxMapTilesY) {
                        var18 = (aByteArray_4128[var17] & 255) << 16 | aShortArray_4130[var17] & '\uffff';
                        if(var18 != 0) {
                           var18 |= -16777216;
                        }

                        var19 = aByteArray_4131[var17] & 255;
                        var20 = anObjectArray_4133[var17];
                     }

                     if(var18 == 0 && var19 == 0 && var20 == null) {
                        if(currentWorldArea.anInt_3517 * 198744177 != -1) {
                           var18 = -16777216 | currentWorldArea.anInt_3517 * 198744177;
                        } else if((var7 + anInt_4127 & 4) != (var12 + anInt_4137 & 4)) {
                           var18 = -11840664;
                        } else {
                           var18 = anIntArray_4103[aClass565_4109.anInt_9606 * 1439003147 + 1];
                        }

                        if(var18 == 0) {
                           var18 = -16777216;
                        }

                        var0.drawOutline(var8, var13, var10, var15, var18, 0);
                     } else if(var20 != null) {
                        if(var20 instanceof Class240_Sub42) {
                           Class240_Sub42 var21 = (Class240_Sub42)var20;
                           if(var21 != null) {
                              method3163(var0, var8, var13, var10, var15, var18, var19, aByteArray_4132[var17], var21.anIntArray_7577, var21.aByteArray_7576, true);
                           }
                        } else {
                           Integer var30 = (Integer)var20;
                           anIntArray_4117[0] = var30.intValue();
                           aByteArray_4118[0] = aByteArray_4136[var17];
                           method3163(var0, var8, var13, var10, var15, var18, var19, aByteArray_4132[var17], anIntArray_4117, aByteArray_4118, true);
                        }
                     } else {
                        method3163(var0, var8, var13, var10, var15, var18, var19, aByteArray_4132[var17], (int[])null, (byte[])null, true);
                     }
                  }
               }
            } else {
               for(var12 = 0; var12 < var6; ++var12) {
                  var13 = anInt_4134 - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = anInt_4134 - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if(currentWorldArea.anInt_3517 * 198744177 != -1) {
                     var16 = -16777216 | currentWorldArea.anInt_3517 * 198744177;
                  } else if((var7 + anInt_4127 & 4) != (var12 + anInt_4137 & 4)) {
                     var16 = -11840664;
                  } else {
                     var16 = anIntArray_4103[aClass565_4109.anInt_9606 * 1439003147 + 1];
                  }

                  if(var16 == 0) {
                     var16 = -16777216;
                  }

                  var0.drawOutline(var8, var13, var10, var15, var16, 0);
               }
            }
         }
      }

      for(var7 = -16; var7 < var5 + 16; ++var7) {
         var8 = (var3 + var1 * var7 >> 16) + anInt_4110;
         var9 = (var3 + var1 * (var7 + 1) >> 16) + anInt_4110;
         var10 = var9 - var8;
         if(var10 > 0) {
            var11 = var7 + anInt_4127;
            if(var11 >= 0 && var11 < maxMapTilesX) {
               for(var12 = -16; var12 < var6 + 16; ++var12) {
                  var13 = anInt_4134 - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = anInt_4134 - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if(var15 > 0) {
                     var16 = var12 + anInt_4106;
                     if(var16 >= 0 && var16 < maxMapTilesY) {
                        Object var27 = anObjectArray_4133[var11 + var16 * maxMapTilesX];
                        if(var27 != null) {
                           if(var27 instanceof Class240_Sub42) {
                              Class240_Sub42 var29 = (Class240_Sub42)var27;
                              if(var29 != null) {
                                 method3164(var0, var8, var13, var10, var15, var29.anIntArray_7577, var29.aByteArray_7576);
                              }
                           } else {
                              Integer var32 = (Integer)var27;
                              anIntArray_4117[0] = var32.intValue();
                              aByteArray_4118[0] = aByteArray_4136[var11 + var16 * maxMapTilesX];
                              method3164(var0, var8, var13, var10, var15, anIntArray_4117, aByteArray_4118);
                           }
                        } else {
                           method3164(var0, var8, var13, var10, var15, (int[])null, (byte[])null);
                        }
                     }
                  }
               }
            }
         }
      }

      var7 = anInt_4127 >> 6;
      var8 = anInt_4106 >> 6;
      if(var7 < 0) {
         var7 = 0;
      }

      if(var8 < 0) {
         var8 = 0;
      }

      var9 = anInt_4123 >> 6;
      var10 = anInt_4137 >> 6;
      if(var9 >= anArrayListArrayArrayArray_4135[0].length) {
         var9 = anArrayListArrayArrayArray_4135[0].length - 1;
      }

      if(var10 >= anArrayListArrayArrayArray_4135[0][0].length) {
         var10 = anArrayListArrayArrayArray_4135[0][0].length - 1;
      }

      for(var11 = 0; var11 < 3; ++var11) {
         int var23;
         int var22;
         ArrayList var25;
         int var24;
         Iterator var26;
         int var28;
         int var31;
         Class230 var33;
         for(var12 = var7; var12 <= var9; ++var12) {
            for(var13 = var8; var13 <= var10; ++var13) {
               var25 = anArrayListArrayArrayArray_4135[var11][var12][var13];
               if(var25 != null) {
                  var15 = (var12 + (anInt_4120 >> 6)) * 64;
                  var16 = (var13 + (anInt_4124 >> 6)) * 64;
                  var26 = var25.iterator();

                  while(var26.hasNext()) {
                     var33 = (Class230)var26.next();
                     var19 = var15 + var33.aByte_3948 - anInt_4120 - anInt_4127;
                     var28 = var16 + var33.aByte_3951 - anInt_4124 - anInt_4106;
                     var31 = (var3 + var1 * var19 >> 16) + anInt_4110;
                     var22 = (var3 + var1 * (var19 + 1) >> 16) + anInt_4110;
                     var23 = anInt_4134 - (var4 + var2 * (var28 + 1) >> 16);
                     var24 = anInt_4134 - (var4 + var2 * var28 >> 16);
                     method3163(var0, var31, var23, var22 - var31, var24 - var23, var33.anInt_3949, var33.aByte_3950 & 255, var33.aByte_3947, var33.anIntArray_3952, var33.aByteArray_3953, false);
                  }
               }
            }
         }

         for(var12 = var7; var12 <= var9; ++var12) {
            for(var13 = var8; var13 <= var10; ++var13) {
               var25 = anArrayListArrayArrayArray_4135[var11][var12][var13];
               if(var25 != null) {
                  var15 = (var12 + (anInt_4120 >> 6)) * 64;
                  var16 = (var13 + (anInt_4124 >> 6)) * 64;
                  var26 = var25.iterator();

                  while(var26.hasNext()) {
                     var33 = (Class230)var26.next();
                     var19 = var15 + var33.aByte_3948 - anInt_4120 - anInt_4127;
                     var28 = var16 + var33.aByte_3951 - anInt_4124 - anInt_4106;
                     var31 = (var3 + var1 * var19 >> 16) + anInt_4110;
                     var22 = (var3 + var1 * (var19 + 1) >> 16) + anInt_4110;
                     var23 = anInt_4134 - (var4 + var2 * (var28 + 1) >> 16);
                     var24 = anInt_4134 - (var4 + var2 * var28 >> 16);
                     method3164(var0, var31, var23, var22 - var31, var24 - var23, var33.anIntArray_3952, var33.aByteArray_3953);
                  }
               }
            }
         }
      }

   }

   static void method3163(Renderer var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, byte[] var9, boolean var10) {
      int var11;
      int var12;
      if(var10 || var5 != 0 || var6 > 0) {
         if(var6 == 0) {
            var0.drawOutline(var1, var2, var3, var4, var5, 0);
         } else {
            var11 = var7 & 63;
            if(var11 != 0 && var3 > 1 && var4 > 1) {
               var12 = var10?0:1;
               DrawingTarget.method2202(var0, aByteArrayArrayArray_4115, anInt_4116, var1, var2, var5, anIntArray_4103[var6], var3, var4, var11, var7 >> 6 & 3, var12, -712466035);
            } else {
               var12 = anIntArray_4103[var6];
               if(var10 || var12 != 0) {
                  var0.drawOutline(var1, var2, var3, var4, var12, 0);
               }
            }
         }
      }

      if(var8 != null) {
         if(var3 == 1) {
            var11 = var1;
         } else {
            var11 = var1 + var3 - 1;
         }

         if(var4 == 1) {
            var12 = var2;
         } else {
            var12 = var2 + var4 - 1;
         }

         for(int var13 = 0; var13 < var8.length; ++var13) {
            int var14 = var9[var13] & 63;
            if(var14 == Class495.aClass495_9053.anInt_9062 * -1965975883 || var14 == Class495.aClass495_9058.anInt_9062 * -1965975883 || var14 == Class495.aClass495_9042.anInt_9062 * -1965975883 || var14 == Class495.aClass495_9043.anInt_9062 * -1965975883) {
               Class534 var15 = aClass529_4105.method6015(var8[var13], (byte)1);
               if(var15.anInt_9396 * -156591195 == -1) {
                  int var16 = -3355444;
                  if(var15.anInt_9380 * 166485479 == 1) {
                     var16 = -3407872;
                  }

                  int var17 = var9[var13] >> 6 & 3;
                  if(var14 == Class495.aClass495_9053.anInt_9062 * -1965975883) {
                     if(var17 == 0) {
                        var0.method1951(var1, var2, var4, var16, 0);
                     } else if(var17 == 1) {
                        var0.method1922(var1, var2, var3, var16, 0);
                     } else if(var17 == 2) {
                        var0.method1951(var11, var2, var4, var16, 0);
                     } else {
                        var0.method1922(var1, var12, var3, var16, 0);
                     }
                  } else if(var14 == Class495.aClass495_9058.anInt_9062 * -1965975883) {
                     if(var17 == 0) {
                        var0.method1951(var1, var2, var4, -1, 0);
                        var0.method1922(var1, var2, var3, var16, 0);
                     } else if(var17 == 1) {
                        var0.method1951(var11, var2, var4, -1, 0);
                        var0.method1922(var1, var2, var3, var16, 0);
                     } else if(var17 == 2) {
                        var0.method1951(var11, var2, var4, -1, 0);
                        var0.method1922(var1, var12, var3, var16, 0);
                     } else {
                        var0.method1951(var1, var2, var4, -1, 0);
                        var0.method1922(var1, var12, var3, var16, 0);
                     }
                  } else if(var14 == Class495.aClass495_9042.anInt_9062 * -1965975883) {
                     if(var17 == 0) {
                        var0.method1922(var1, var2, 1, var16, 0);
                     } else if(var17 == 1) {
                        var0.method1922(var11, var2, 1, var16, 0);
                     } else if(var17 == 2) {
                        var0.method1922(var11, var12, 1, var16, 0);
                     } else {
                        var0.method1922(var1, var12, 1, var16, 0);
                     }
                  } else if(var14 == Class495.aClass495_9043.anInt_9062 * -1965975883) {
                     int var18;
                     if(var17 != 0 && var17 != 2) {
                        for(var18 = 0; var18 < var4; ++var18) {
                           var0.method1922(var1 + var18, var2 + var18, 1, var16, 0);
                        }
                     } else {
                        for(var18 = 0; var18 < var4; ++var18) {
                           var0.method1922(var1 + var18, var12 - var18, 1, var16, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static void method3164(Renderer var0, int var1, int var2, int var3, int var4, int[] var5, byte[] var6) {
      if(var5 != null) {
         for(int var7 = 0; var7 < var5.length; ++var7) {
            Class534 var8 = aClass529_4105.method6015(var5[var7], (byte)1);
            int var9 = var8.anInt_9396 * -156591195;
            if(var9 != -1) {
               Class474 var10 = aClass445_4107.method5489(var9, -1031753889);
               Sprite var11 = var10.method5667(var0, var8.aBoolean_9397?var6[var7] >> 6 & 3:0, var8.aBoolean_9430?var8.aBoolean_9400:false, (byte)0);
               if(var11 != null) {
                  int var12 = var3 * var11.getFurthestX() >> 2;
                  int var13 = var4 * var11.getFurthestY() >> 2;
                  if(var10.aBoolean_8723) {
                     int var14 = var8.anInt_9377 * -215704445;
                     int var15 = var8.anInt_9423 * -220503463;
                     if((var6[var7] >> 6 & 1) == 1) {
                        int var16 = var14;
                        var14 = var15;
                        var15 = var16;
                     }

                     var12 = var14 * var3;
                     var13 = var15 * var4;
                  }

                  if(var12 != 0 && var13 != 0) {
                     if(var10.anInt_8722 * -797464157 != 0) {
                        var11.method2130(var1, var2 - var13 + var4, var12, var13, 0, -16777216 | var10.anInt_8722 * -797464157, 1);
                     } else {
                        var11.method2145(var1, var2 - var13 + var4, var12, var13);
                     }
                  }
               }
            }
         }

      }
   }

   static NodeList method3165(Renderer var0) {
      int var1 = anInt_4123 - anInt_4127;
      int var2 = anInt_4137 - anInt_4106;
      int var3 = (anInt_4142 - anInt_4110 << 16) / var1;
      int var4 = (anInt_4134 - anInt_4141 << 16) / var2;
      return method3166(var0, var3, var4, 0, 0);
   }

   static NodeList method3166(Renderer var0, int var1, int var2, int var3, int var4) {
      for(Class240_Sub12 var5 = (Class240_Sub12)aNodeList_4122.getBaseNode_2((byte)44); var5 != null; var5 = (Class240_Sub12)aNodeList_4122.getNext(-641579181)) {
         method3169(var0, var5, var1, var2, var3, var4);
      }

      return aNodeList_4122;
   }

   Class248() throws Throwable {
      throw new Error();
   }

   static void method3167(Renderer var0, Class240_Sub12 var1, MapIcon var2) {
      if(var2.anIntArray_9989 != null) {
         int[] var3 = new int[var2.anIntArray_9989.length];

         int var4;
         int var5;
         int var6;
         for(var4 = 0; var4 < var3.length / 2; ++var4) {
            var5 = var2.anIntArray_9989[var4 * 2] + var1.anInt_6802 * -1889789653;
            var6 = var2.anIntArray_9989[var4 * 2 + 1] + var1.anInt_6803 * -526841819;
            var3[var4 * 2] = anInt_4110 + (anInt_4142 - anInt_4110) * (var5 - anInt_4127) / (anInt_4123 - anInt_4127);
            var3[var4 * 2 + 1] = anInt_4134 - (anInt_4134 - anInt_4141) * (var6 - anInt_4106) / (anInt_4137 - anInt_4106);
         }

         Class85.method1113(var0, var3, var2.anInt_9995 * -1137199051);
         if(var2.anInt_9996 * 2032405277 > 0) {
            int var7;
            int var8;
            int var9;
            for(var4 = 0; var4 < var3.length / 2 - 1; ++var4) {
               var5 = var3[var4 * 2];
               var6 = var3[var4 * 2 + 1];
               var7 = var3[(var4 + 1) * 2];
               var8 = var3[(var4 + 1) * 2 + 1];
               if(var7 < var5) {
                  var9 = var5;
                  int var10 = var6;
                  var5 = var7;
                  var6 = var8;
                  var7 = var9;
                  var8 = var10;
               } else if(var7 == var5 && var8 < var6) {
                  var9 = var6;
                  var6 = var8;
                  var8 = var9;
               }

               var0.method1923(var5, var6, var7, var8, var2.anIntArray_10001[var2.aByteArray_9971[var4] & 255], 1, var2.anInt_9996 * 2032405277, var2.anInt_9997 * 1734596345, var2.anInt_9998 * 1537693067);
            }

            var4 = var3[var3.length - 2];
            var5 = var3[var3.length - 1];
            var6 = var3[0];
            var7 = var3[1];
            if(var6 < var4) {
               var8 = var4;
               var9 = var5;
               var4 = var6;
               var5 = var7;
               var6 = var8;
               var7 = var9;
            } else if(var6 == var4 && var7 < var5) {
               var8 = var5;
               var5 = var7;
               var7 = var8;
            }

            var0.method1923(var4, var5, var6, var7, var2.anIntArray_10001[var2.aByteArray_9971[var2.aByteArray_9971.length - 1] & 255], 1, var2.anInt_9996 * 2032405277, var2.anInt_9997 * 1734596345, var2.anInt_9998 * 1537693067);
         } else {
            for(var4 = 0; var4 < var3.length / 2 - 1; ++var4) {
               var0.method1919(var3[var4 * 2], var3[var4 * 2 + 1], var3[(var4 + 1) * 2], var3[(var4 + 1) * 2 + 1], var2.anIntArray_10001[var2.aByteArray_9971[var4] & 255], 1149080069);
            }

            var0.method1919(var3[var3.length - 2], var3[var3.length - 1], var3[0], var3[1], var2.anIntArray_10001[var2.aByteArray_9971[var2.aByteArray_9971.length - 1] & 255], -868848270);
         }
      }

   }

   static void method3168(Renderer var0, int var1, int var2) {
      ByteArrayDataNode var3 = new ByteArrayDataNode(aCacheUnpacker_4111.method3583(currentWorldArea.identifier, "area", (byte)-19));
      int var4 = var3.readByte(-106947209);
      int[] var5 = new int[var4];

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5[var6] = var3.readByte(151919281);
      }

      var6 = var3.readByte(-518865214);
      int[] var7 = new int[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var3.readByte(-634530495);
      }

      int var10;
      int var11;
      int var15;
      while(var3.index * 964952859 < var3.data.length) {
         int var9;
         int var12;
         int var13;
         if(var3.readByte(982394548) == 0) {
            var8 = var3.readByte(1535687296);
            var9 = var3.readByte(1256337248);

            for(var10 = 0; var10 < 64; ++var10) {
               for(var11 = 0; var11 < 64; ++var11) {
                  var12 = var8 * 64 + var10 - anInt_4120;
                  var13 = var9 * 64 + var11 - anInt_4124;
                  method3156(var0, var3, var8, var9, var12, var13, var5, var7);
               }
            }
         } else {
            var8 = var3.readByte(60289760);
            var9 = var3.readByte(540132575);
            var10 = var3.readByte(-491487430);
            var11 = var3.readByte(1310418451);

            for(var12 = 0; var12 < 8; ++var12) {
               for(var13 = 0; var13 < 8; ++var13) {
                  int var14 = var8 * 64 + var10 * 8 + var12 - anInt_4120;
                  var15 = var9 * 64 + var11 * 8 + var13 - anInt_4124;
                  method3156(var0, var3, var8, var9, var14, var15, var5, var7);
               }
            }
         }
      }

      var3 = null;
      aByteArray_4128 = new byte[maxMapTilesX * maxMapTilesY];
      aShortArray_4130 = new short[maxMapTilesX * maxMapTilesY];

      for(var8 = 0; var8 < 3; ++var8) {
         byte[] var16 = new byte[maxMapTilesX * maxMapTilesY];

         Iterator var17;
         Class230 var19;
         ArrayList var18;
         for(var10 = 0; var10 < anArrayListArrayArrayArray_4135[var8].length; ++var10) {
            for(var11 = 0; var11 < anArrayListArrayArrayArray_4135[var8][0].length; ++var11) {
               var18 = anArrayListArrayArrayArray_4135[var8][var10][var11];
               if(var18 != null) {
                  for(var17 = var18.iterator(); var17.hasNext(); var16[var10 * 64 + var19.aByte_3948 + (var11 * 64 + var19.aByte_3951) * maxMapTilesX] = (byte)var19.anInt_3949) {
                     var19 = (Class230)var17.next();
                  }
               }
            }
         }

         method3160(var16, aByteArray_4128, aShortArray_4130, var1, var2);

         for(var10 = 0; var10 < anArrayListArrayArrayArray_4135[var8].length; ++var10) {
            for(var11 = 0; var11 < anArrayListArrayArrayArray_4135[var8][0].length; ++var11) {
               var18 = anArrayListArrayArrayArray_4135[var8][var10][var11];
               if(var18 != null) {
                  var17 = var18.iterator();

                  while(var17.hasNext()) {
                     var19 = (Class230)var17.next();
                     var15 = var10 * 64 + var19.aByte_3948 + (var11 * 64 + var19.aByte_3951) * maxMapTilesX;
                     var19.anInt_3949 = (aByteArray_4128[var15] & 255) << 16 | aShortArray_4130[var15] & '\uffff';
                     if(var19.anInt_3949 != 0) {
                        var19.anInt_3949 |= -16777216;
                     }
                  }
               }
            }
         }
      }

      method3160(aByteArray_4125, aByteArray_4128, aShortArray_4130, var1, var2);
      aByteArray_4125 = null;
      method3170();
   }

   static void method3169(Renderer var0, Class240_Sub12 var1, int var2, int var3, int var4, int var5) {
      var1.anInt_6805 = (anInt_4110 + (var4 + var2 * (var1.anInt_6802 * -1889789653 - anInt_4127) >> 16)) * -1225098301;
      var1.anInt_6800 = (anInt_4134 - (var5 + var3 * (var1.anInt_6803 * -526841819 - anInt_4106) >> 16)) * 1919845455;
   }

   static void method3170() {
      int var0;
      int var1;
      int var6;
      for(var0 = 0; var0 < maxMapTilesX; ++var0) {
         for(var1 = 0; var1 < maxMapTilesY; ++var1) {
            Object var2 = anObjectArray_4133[var0 + var1 * maxMapTilesX];
            if(var2 != null) {
               if(var2 instanceof Class240_Sub42) {
                  Class240_Sub42 var3 = (Class240_Sub42)var2;
                  if(var3 != null) {
                     for(int var4 = 0; var4 < var3.anIntArray_7577.length; ++var4) {
                        Class534 var5 = aClass529_4105.method6015(var3.anIntArray_7577[var4], (byte)1);
                        var6 = var5.anInt_9395 * 182214421;
                        if(var5.anIntArray_9415 != null) {
                           var5 = var5.method6048(aClass185_4140, aClass184_4108, 1162979012);
                           if(var5 != null) {
                              var6 = var5.anInt_9395 * 182214421;
                           }
                        }

                        if(var6 != -1) {
                           Class240_Sub12 var7 = new Class240_Sub12(var6);
                           var7.anInt_6802 = var0 * 1777327491;
                           var7.anInt_6803 = var1 * 1102304173;
                           aNodeList_4122.addNode(var7, (short)2395);
                        }
                     }
                  }
               } else {
                  Integer var11 = (Integer)var2;
                  Class534 var13 = aClass529_4105.method6015(var11.intValue(), (byte)1);
                  int var15 = var13.anInt_9395 * 182214421;
                  if(var13.anIntArray_9415 != null) {
                     var13 = var13.method6048(aClass185_4140, aClass184_4108, 1162979012);
                     if(var13 != null) {
                        var15 = var13.anInt_9395 * 182214421;
                     }
                  }

                  if(var15 != -1) {
                     Class240_Sub12 var18 = new Class240_Sub12(var15);
                     var18.anInt_6802 = var0 * 1777327491;
                     var18.anInt_6803 = var1 * 1102304173;
                     aNodeList_4122.addNode(var18, (short)-7454);
                  }
               }
            }
         }
      }

      for(var0 = 0; var0 < 3; ++var0) {
         for(var1 = 0; var1 < anArrayListArrayArrayArray_4135[0].length; ++var1) {
            for(int var10 = 0; var10 < anArrayListArrayArrayArray_4135[0][0].length; ++var10) {
               ArrayList var12 = anArrayListArrayArrayArray_4135[var0][var1][var10];
               if(var12 != null) {
                  Iterator var14 = var12.iterator();

                  while(var14.hasNext()) {
                     Class230 var16 = (Class230)var14.next();
                     if(var16.anIntArray_3952 != null) {
                        for(var6 = 0; var6 < var16.anIntArray_3952.length; ++var6) {
                           Class534 var17 = aClass529_4105.method6015(var16.anIntArray_3952[var6], (byte)1);
                           int var8 = var17.anInt_9395 * 182214421;
                           if(var17.anIntArray_9415 != null) {
                              var17 = var17.method6048(aClass185_4140, aClass184_4108, 1162979012);
                              if(var17 != null) {
                                 var8 = var17.anInt_9395 * 182214421;
                              }
                           }

                           if(var8 != -1) {
                              Class240_Sub12 var9 = new Class240_Sub12(var8);
                              var9.anInt_6802 = ((var1 + (anInt_4120 >> 6)) * 64 + var16.aByte_3948 - anInt_4120) * 1777327491;
                              var9.anInt_6803 = ((var10 + (anInt_4124 >> 6)) * 64 + var16.aByte_3951 - anInt_4124) * 1102304173;
                              aNodeList_4122.addNode(var9, (short)-27162);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method3171(int var0) {
      currentWorldArea = (MapOverviewNode)aNodeArrayList_4112.getNode((long)var0);
   }

   static void method3172() {
      aByteArray_4125 = null;
      aByteArray_4128 = null;
      aShortArray_4130 = null;
      aByteArray_4131 = null;
      aByteArray_4132 = null;
      anObjectArray_4133 = null;
      aByteArray_4136 = null;
      anArrayListArrayArrayArray_4135 = (ArrayList[][][])null;
      anIntArray_4103 = null;
   }

   public static Class494 method3173(int var0, int var1) {
      Class494 var2 = new Class494();

      for(MapOverviewNode var3 = (MapOverviewNode)aNodeArrayList_4112.start(); var3 != null; var3 = (MapOverviewNode)aNodeArrayList_4112.next()) {
         if(var3.aBoolean_3519 && var3.method2576(var0, var1, (byte)-27)) {
            var2.insert(var3, 1575088695);
         }
      }

      return var2;
   }

   static void method3174(Renderer var0) {
      int var1 = anInt_4123 - anInt_4127;
      int var2 = anInt_4137 - anInt_4106;
      int var3 = (anInt_4142 - anInt_4110 << 16) / var1;
      int var4 = (anInt_4134 - anInt_4141 << 16) / var2;
      method3162(var0, var3, var4, 0, 0);
   }

   public static MapOverviewNode method3175(int var0, int var1) {
      for(MapOverviewNode var2 = (MapOverviewNode)aNodeArrayList_4112.start(); var2 != null; var2 = (MapOverviewNode)aNodeArrayList_4112.next()) {
         if(var2.aBoolean_3519 && var2.method2576(var0, var1, (byte)88)) {
            return var2;
         }
      }

      return null;
   }

   static void method3176(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      anInt_4127 = var0 - anInt_4120;
      anInt_4137 = var1 - anInt_4124;
      anInt_4123 = var2 - anInt_4120;
      anInt_4106 = var3 - anInt_4124;
      anInt_4110 = var4;
      anInt_4141 = var5;
      anInt_4142 = var6;
      anInt_4134 = var7;
   }
}
