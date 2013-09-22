
public class Class625 {

   public int anInt_10045;
   public String aString_10046;
   static OptionListNode aClass240_Sub22_Sub3_10047;


   static final void method6651(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class542.aClass43_Sub1_9475.method369(-831324111).anInt_813 * 1428504707;
   }

   public static boolean method6652(int var0, int var1) {
      if(var0 != -172816177 * Class95.anInt_1900 || null == Class540_Sub3.aClass83_2053) {
         Class212.method2662(-383348825);
         Class540_Sub3.aClass83_2053 = Class83.aClass83_1626;
         Class95.anInt_1900 = 962395695 * var0;
      }

      int var4;
      if(Class83.aClass83_1626 == Class540_Sub3.aClass83_2053) {
         byte[] var2 = Class80.aCacheUnpacker_1532.method3566(var0, 2098408037);
         if(var2 == null) {
            return false;
         }

         ByteArrayDataNode var3 = new ByteArrayDataNode(var2);
         Class439.method5450(var3, 1672427867);
         var4 = var3.readByte(1930876352);

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            Class95.aNodeList_1888.addNode(new Class240_Sub28(var3), (short)-4157);
         }

         var5 = var3.method4490((byte)0);
         Class95.aClass97Array_1887 = new Class97[var5];

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            Class95.aClass97Array_1887[var6] = new Class97(var3);
         }

         var6 = var3.method4490((byte)0);
         Class95.aClass100Array_1894 = new Class100[var6];

         int var7;
         for(var7 = 0; var7 < var6; ++var7) {
            Class95.aClass100Array_1894[var7] = new Class100(var3, var7);
         }

         var7 = var3.method4490((byte)0);
         Class95.aClass102Array_1889 = new Class102[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            Class95.aClass102Array_1889[var8] = new Class102(var3);
         }

         var8 = var3.method4490((byte)0);
         Class95.aClass130Array_1890 = new Class130[var8];

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            Class95.aClass130Array_1890[var9] = new Class130(var3);
         }

         var9 = var3.method4490((byte)0);
         Class95.aClass104Array_1892 = new CharTask[var9];

         for(int var10 = 0; var10 < var9; ++var10) {
            Class95.aClass104Array_1892[var10] = Class231_Sub1.method3097(var3, 18246964);
         }

         Class540_Sub3.aClass83_2053 = Class83.aClass83_1627;
      }

      if(Class83.aClass83_1627 == Class540_Sub3.aClass83_2053) {
         boolean var11 = true;
         Class100[] var12 = Class95.aClass100Array_1894;

         for(var4 = 0; var4 < var12.length; ++var4) {
            Class100 var15 = var12[var4];
            if(!var15.method1288((byte)21)) {
               var11 = false;
            }
         }

         CharTask[] var13 = Class95.aClass104Array_1892;

         for(var4 = 0; var4 < var13.length; ++var4) {
            CharTask var17 = var13[var4];
            if(!var17.method1344(825292542)) {
               var11 = false;
            }
         }

         Class102[] var14 = Class95.aClass102Array_1889;

         for(var4 = 0; var4 < var14.length; ++var4) {
            Class102 var16 = var14[var4];
            if(!var16.method1311(-2046254616)) {
               var11 = false;
            }
         }

         if(!var11) {
            return false;
         }

         Class540_Sub3.aClass83_2053 = Class83.aClass83_1628;
      }

      return true;
   }

   static final void method6653(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class319.method3948(var3, var4, var0, (byte)8);
   }

   static final void method6654(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var2.intTypeIndex -= 1462854468;
      var0.anInt_2513 = var2.intTypes[-831324111 * var2.intTypeIndex] * 1352953823;
      var0.invBoxX = -1392433613 * var2.intTypes[1 + -831324111 * var2.intTypeIndex];
      var0.anInt_2523 = var2.intTypes[2 + -831324111 * var2.intTypeIndex] * 1498305503;
      var0.anInt_2575 = var2.intTypes[3 + -831324111 * var2.intTypeIndex] * -1377249691;
      Class110_Sub1.method3149(var0, -1162801822);
   }

   static boolean method6655(Renderer var0, int var1, int var2) {
      var0.method1933();
      Class373.getCurrentTime((short)17733);
      if(!var0.method1943(-1397855722)) {
         return false;
      } else {
         int maxX = client.aClass296_348.getMaxX((byte)5);
         int maxY = client.aClass296_348.getMaxY(1109807821);
         Class281 var5 = client.aClass296_348.method3753();
         WorldObjects var6 = client.aClass296_348.getWorldObjects();
         int var7 = maxX / 2;
         byte offsetX = 0;
         byte offsetY = 0;
         boolean var10 = true;

         int var11;
         int var13;
         for(var11 = offsetX; var11 < maxX + offsetX; ++var11) {
            for(int var12 = offsetY; var12 < maxY + offsetY; ++var12) {
               for(var13 = var1; var13 <= 3; ++var13) {
                  if(var5.method3645(var1, var13, var11, var12, (byte)-21)) {
                     int var14 = var13;
                     if(var5.method3646(var11, var12, (byte)0)) {
                        var14 = var13 - 1;
                     }

                     if(var14 >= 0) {
                        var10 &= Class167.method2084(var14, var11, var12, (byte)33);
                     }
                  }
               }
            }
         }

         if(!var10) {
            return false;
         } else {
            var11 = 48 + 4 * maxX + 48;
            int[] var37 = new int[var11 * var11];

            for(var13 = 0; var13 < var37.length; ++var13) {
               var37[var13] = 0;
            }

            Class174_Sub1 var39 = null;
            byte var38 = 0;
            byte var15 = 0;
            if(Class192.aBoolean_3339) {
               Class620.aClass170_10024 = var0.method1929(var11, var11, false, true);
               var39 = var0.method1890();
               var39.method7327(0, Class620.aClass170_10024.method2126());
               Class99 var16 = var0.method1918(var11, var11);
               var39.method7328(var16);
               var0.method1901(var39, -640670267);
               var7 = maxX;
               var38 = 48;
               var15 = 48;
               var0.method1977(1, 0);
            } else {
               Class620.aClass170_10024 = var0.defineSprite(var37, 0, var11, var11, var11);
            }

            client.aClass296_348.method3754(-432345321).method6385(-1442271036);
            int var40 = -16777216 | (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
            int var17 = -16777216 | 238 + (int)(Math.random() * 20.0D) - 10 << 16;
            int var18 = (int)(Math.random() * 8.0D) << 16 | (int)(Math.random() * 8.0D) << 8 | (int)(Math.random() * 8.0D);
            boolean[][] var19 = new boolean[2 + var7 + 1][1 + var7 + 2];

            int var21;
            int var23;
            int var22;
            int var25;
            int var24;
            int var27;
            int var26;
            for(int var20 = offsetX; var20 < offsetX + maxX; var20 += var7) {
               for(var21 = offsetY; var21 < offsetY + maxY; var21 += var7) {
                  var22 = var38;
                  var23 = var15;
                  var24 = var20;
                  if(var20 > 0) {
                     var24 = var20 - 1;
                     var22 = var38 + 4;
                  }

                  var25 = var21;
                  if(var21 > 0) {
                     var25 = var21 - 1;
                  }

                  var26 = var7 + var20;
                  if(var26 < maxX) {
                     ++var26;
                  }

                  var27 = var7 + var21;
                  if(var27 < maxY) {
                     ++var27;
                     var23 = var15 + 4;
                  }

                  if(Class192.aBoolean_3346) {
                     var0.method1967();
                  } else {
                     var0.method1965(0, 0, var22 + var7 * 4, 4 * var7 + var23);
                  }

                  var0.method1977(3, -16777216);
                  int var28 = var7;
                  if(var7 > maxX - 1) {
                     var28 = maxX - 1;
                  }

                  for(int var29 = var1; var29 <= 3; ++var29) {
                     int var31;
                     int var30;
                     for(var30 = 0; var30 <= var28; ++var30) {
                        for(var31 = 0; var31 <= var28; ++var31) {
                           var19[var30][var31] = var5.method3645(var1, var29, var24 + var30, var31 + var25, (byte)-54);
                        }
                     }

                     var6.aClass171Array_4486[var29].method2152(var38, var15, 1024, var24, var25, var26, var27, var19);

                     for(var30 = -4; var30 < var7; ++var30) {
                        for(var31 = -4; var31 < var7; ++var31) {
                           int var32 = var20 + var30;
                           int var33 = var21 + var31;
                           if(var32 >= offsetX && var33 >= offsetY && var5.method3645(var1, var29, var32, var33, (byte)-56)) {
                              int var34 = var29;
                              if(var5.method3646(var32, var33, (byte)0)) {
                                 var34 = var29 - 1;
                              }

                              if(var34 >= 0) {
                                 Class11.method62(var0, var34, var32, var33, var22 + 4 * var30, var23 + (var7 - var31) * 4 - 4, var40, var17, -2020442520);
                              }
                           }
                        }
                     }
                  }

                  var0.drawOutline(var22, var23, 4 * var7, 4 * var7, var18, 2);
                  var0.method1933();
                  if(!Class192.aBoolean_3339) {
                     Class620.aClass170_10024.method2127(48 + 4 * (var20 - offsetX), 48 + 4 * maxY - (var21 - offsetY) * 4 - 4 * var7, 4 * var7, var7 * 4, var22, var23);
                     if(Class192.aBoolean_3346) {
                        Class620.aClass170_10024.drawAt(256, 0);

                        try {
                           var0.method1885((byte)-9);
                           RSInterface.method1724(2000L);
                        } catch (Exception var36) {
                           ;
                        }
                     }
                  }
               }
            }

            if(Class192.aBoolean_3339) {
               var0.method1902(var39, 556963789);
               if(Class192.aBoolean_3346) {
                  Class620.aClass170_10024.drawAt(256, 0);

                  try {
                     var0.method1885((byte)-12);
                     RSInterface.method1724(2000L);
                  } catch (Exception var35) {
                     ;
                  }
               }
            }

            var0.method1967();
            var0.method1977(1, 1);
            Class104_Sub3.method3180(2105623373);
            Class529 var41 = client.aClass296_348.method3755(2083689026);
            Class192.anInt_3338 = 0;
            Class192.mapIconList.clear(1230023653);
            if(!Class192.aBoolean_3349) {
               for(var21 = offsetX; var21 < offsetX + maxX; ++var21) {
                  for(var22 = offsetY; var22 < offsetY + maxY; ++var22) {
                     for(var23 = var1; var23 <= 1 + var1 && var23 <= 3; ++var23) {
                        if(var5.method3645(var1, var23, var21, var22, (byte)109)) {
                           Class218 var43 = (Class218)var6.method3428(var23, var21, var22, -566125983);
                           if(null == var43) {
                              var43 = (Class218)var6.method3416(var23, var21, var22, client.aClass264_482, 390114878);
                           }

                           if(var43 == null) {
                              var43 = (Class218)var6.method3423(var23, var21, var22, (byte)-82);
                           }

                           if(var43 == null) {
                              var43 = (Class218)var6.method3425(var23, var21, var22, -51947157);
                           }

                           if(null != var43) {
                              Class534 var46 = var41.method6015(var43.method2723((byte)-55), (byte)1);
                              if(!var46.aBoolean_9364 || client.aBoolean_270) {
                                 var26 = var46.anInt_9395 * 182214421;
                                 if(null != var46.anIntArray_9415) {
                                    for(var27 = 0; var27 < var46.anIntArray_9415.length; ++var27) {
                                       if(var46.anIntArray_9415[var27] != -1) {
                                          Class534 var47 = var41.method6015(var46.anIntArray_9415[var27], (byte)1);
                                          if(182214421 * var47.anInt_9395 >= 0) {
                                             var26 = var47.anInt_9395 * 182214421;
                                          }
                                       }
                                    }
                                 }

                                 if(var26 >= 0) {
                                    Class192.anIntArray_3344[-1040838521 * Class192.anInt_3338] = 2043792579 * var46.anInt_9367;
                                    Class192.anIntArray_3343[Class192.anInt_3338 * -1040838521] = var21;
                                    Class192.anIntArray_3341[Class192.anInt_3338 * -1040838521] = var22;
                                    Class192.anInt_3338 += -1112165065;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               MapElements var42 = client.aClass296_348.getMMElements();
               if(null != var42) {
                  Class126.mapIconUnpacker.init(1024, 64);
                  MapPoint var44 = client.aClass296_348.getMapArea();

                  for(var23 = 0; var23 < var42.size * 655819939; ++var23) {
                     var24 = var42.positionData[var23];
                     if(Class521.myPlayer.plane == var24 >> 28) {
                        var25 = (var24 >> 14 & 16383) - 1265321541 * var44.loadedMapX;
                        var26 = (var24 & 16383) - var44.loadedMapY * -1996781083;
                        if(var25 >= 0 && var25 < maxX && var26 >= 0 && var26 < maxY) {
                           Class192.mapIconList.addNode(new IndexNode(var23), (short)-13645);
                        } else {
                           MapIcon var45 = Class126.mapIconUnpacker.loadIcon(var42.cacheIDs[var23]);
                           if(var45.anIntArray_9989 != null && var45.anInt_9993 * 189282879 + var25 >= 0 && -1001950925 * var45.anInt_9991 + var25 < maxX && var45.anInt_9994 * -250973399 + var26 >= 0 && var45.anInt_9992 * -12505347 + var26 < maxY) {
                              Class192.mapIconList.addNode(new IndexNode(var23), (short)-22549);
                           }
                        }
                     }
                  }

                  Class126.mapIconUnpacker.init(128, 64);
               }
            }

            return true;
         }
      }
   }

   static final void method6656(RSInterfaceData var0, int var1) {
      if(18 == -243034353 * client.loginStage) {
         Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6306, client.lobbyConnectionHandler.aClass528_3433, 1917447504);
         client.lobbyConnectionHandler.addPacket(var2, 376996014);
      }
   }
}
