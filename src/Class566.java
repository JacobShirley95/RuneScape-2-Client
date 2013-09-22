import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Class566 {

   long[] aLongArray_9610;
   int anInt_9611 = -864145203;
   InterfaceDataComposite interfaceComp;
   Object[] anObjectArray_9613;
   int[] anIntArray_9614;


   static final void method6232(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class563_Sub1_Sub5_Sub2.method5259(var3, var4, var0, -707542849);
   }

   static final void method6233(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub1_7295.method6082(var2, -1016089549);
   }

   public static byte[] encodeStr(CharSequence var0, byte var1) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char ch = var0.charAt(var4);
         if((ch <= 0 || ch >= 128) && (ch < 160 || ch > 255)) {
            if(ch == 8364) {
               var3[var4] = -128;
            } else if(ch == 8218) {
               var3[var4] = -126;
            } else if(ch == 402) {
               var3[var4] = -125;
            } else if(ch == 8222) {
               var3[var4] = -124;
            } else if(8230 == ch) {
               var3[var4] = -123;
            } else if(8224 == ch) {
               var3[var4] = -122;
            } else if(ch == 8225) {
               var3[var4] = -121;
            } else if(ch == 710) {
               var3[var4] = -120;
            } else if(ch == 8240) {
               var3[var4] = -119;
            } else if(352 == ch) {
               var3[var4] = -118;
            } else if(8249 == ch) {
               var3[var4] = -117;
            } else if(ch == 338) {
               var3[var4] = -116;
            } else if(ch == 381) {
               var3[var4] = -114;
            } else if(ch == 8216) {
               var3[var4] = -111;
            } else if(ch == 8217) {
               var3[var4] = -110;
            } else if(ch == 8220) {
               var3[var4] = -109;
            } else if(ch == 8221) {
               var3[var4] = -108;
            } else if(ch == 8226) {
               var3[var4] = -107;
            } else if(ch == 8211) {
               var3[var4] = -106;
            } else if(ch == 8212) {
               var3[var4] = -105;
            } else if(732 == ch) {
               var3[var4] = -104;
            } else if(8482 == ch) {
               var3[var4] = -103;
            } else if(353 == ch) {
               var3[var4] = -102;
            } else if(ch == 8250) {
               var3[var4] = -101;
            } else if(339 == ch) {
               var3[var4] = -100;
            } else if(382 == ch) {
               var3[var4] = -98;
            } else if(ch == 376) {
               var3[var4] = -97;
            } else {
               var3[var4] = 63;
            }
         } else {
            var3[var4] = (byte)ch;
         }
      }

      return var3;
   }

   static final void method6235(int var0) {
      if(1821492367 * client.anInt_450 > 1) {
         client.anInt_450 -= 1995889263;
         client.anInt_517 = -1424263917 * client.anInt_413;
      }

      if(client.gameConnectionHandler.aBoolean_3453) {
         client.gameConnectionHandler.aBoolean_3453 = false;
         Class221.method2781(1174109915);
      } else {
         if(!Class18.optionsClosed) {
            ByteArrayDataNode.method4543((byte)50);
         }

         for(int var1 = 0; var1 < 100 && Class290_Sub1.method7524(client.gameConnectionHandler, (byte)-54); ++var1) {
            ;
         }

         if(client.loginStage * -243034353 == 6) {
            int var2;
            Class240_Sub27 var18;
            while(Class71.method820((short)16383)) {
               var18 = Class47_Sub1.method3496(Class326.aClass326_6315, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var18.aClass240_Sub8_Sub1_7370.putByte(0, -501270236);
               var2 = var18.aClass240_Sub8_Sub1_7370.index * 964952859;
               Class26.method160(var18.aClass240_Sub8_Sub1_7370, 361527677);
               var18.aClass240_Sub8_Sub1_7370.method4521(964952859 * var18.aClass240_Sub8_Sub1_7370.index - var2, -907432342);
               client.gameConnectionHandler.addPacket(var18, 1853794971);
            }

            int var6;
            if(null != Class113.currentServer) {
               if(-1 != Class113.currentServer.serverPing * 1790330371) {
                  var18 = Class47_Sub1.method3496(Class326.aClass326_6286, client.gameConnectionHandler.aClass528_3433, 1917447504);
                  if(Class236.aGarbageCollectorMXBean_4036 == null || !Class236.aGarbageCollectorMXBean_4036.isValid()) {
                     try {
                        Iterator var20 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                        while(var20.hasNext()) {
                           GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var20.next();
                           if(var3.isValid()) {
                              Class236.aGarbageCollectorMXBean_4036 = var3;
                              client.aLong_471 = -7359738182693077975L;
                              client.aLong_585 = -5460585108702965381L;
                           }
                        }
                     } catch (Throwable var17) {
                        ;
                     }
                  }

                  long var4 = Class373.getCurrentTime((short)6311);
                  var6 = -1;
                  if(null != Class236.aGarbageCollectorMXBean_4036) {
                     long var7 = Class236.aGarbageCollectorMXBean_4036.getCollectionTime();
                     if(7211431846169516621L * client.aLong_585 != -1L) {
                        long var9 = var7 - client.aLong_585 * 7211431846169516621L;
                        long var11 = var4 - 7329496851593682919L * client.aLong_471;
                        if(var11 != 0L) {
                           var6 = (int)(var9 * 100L / var11);
                        }
                     }

                     client.aLong_585 = 5460585108702965381L * var7;
                     client.aLong_471 = var4 * 7359738182693077975L;
                  }

                  var18.aClass240_Sub8_Sub1_7370.method4507(Class113.currentServer.serverPing * 1790330371, -1828074049);
                  var18.aClass240_Sub8_Sub1_7370.method4477(client.fps * 2143956159, (byte)106);
                  var18.aClass240_Sub8_Sub1_7370.method4500(var6, (byte)-52);
                  client.gameConnectionHandler.addPacket(var18, 1182616944);
                  Class113.currentServer = null;
                  Class568.aLong_9632 = (30000L + var4) * -322079645401701243L;
               }
            } else if(Class373.getCurrentTime((short)8641) >= Class568.aLong_9632 * -2605453665457425331L) {
               Class113.currentServer = client.serverQueue.getServer(Class503.aConnectionDesc_9108.hostIP, (short)15794);
            }

            client.method182(1387856637);
            Class18.method94(-2012283529);
            AbstractMouseNode mouseNode = (AbstractMouseNode)client.mouseNodeList.getBaseNode_2((byte)74);
            if(client.aClass296_348.getWorldObjects() != null) {
               if(1735950531 * Class509.anInt_9182 == 5) {
                  Exception_Sub2.method1279(-101679105);
               } else if(Class509.anInt_9182 * 1735950531 == 1) {
                  Class187_Sub2.method7582((short)14629);
               }
            }

            if(client.aBoolean_391) {
               client.aBoolean_391 = false;
            } else {
               client.aFloat_390 /= 2.0F;
            }

            if(client.aBoolean_442) {
               client.aBoolean_442 = false;
            } else {
               client.aFloat_389 /= 2.0F;
            }

            int var23;
            if(HintMarker.method2686(1929154679)) {
               Class421.method5268(2126319729);
            } else if(2 == Class509.anInt_9182 * 1735950531) {
               MapPoint var21 = client.aClass296_348.getMapArea();
               var23 = var21.loadedMapX * 1265321541 << 9;
               var6 = -1996781083 * var21.loadedMapY << 9;
               if(Class293.aLong_5923 * 8556631036699615287L <= 0L) {
                  Class293.aLong_5923 = Class373.getCurrentTime((short)15330) * 8584750629744383367L;
               }

               float var13 = (float)(Class373.getCurrentTime((short)5734) - Class293.aLong_5923 * 8556631036699615287L);
               int var14 = 1000 / Class340.method4204((byte)5);

               for(var14 = (int)((double)var14 * 1.25D); var13 > 0.0F; var13 -= (float)var14) {
                  float var15 = Math.min(var13, (float)var14);
                  Class542.aClass43_Sub1_9475.method393(var15 / 1000.0F, client.aClass296_348.method3760(-1624077508).anIntArrayArrayArray_7263, client.aClass296_348.method3753(), var23, var6, (byte)36);
               }

               Class293.aLong_5923 = Class373.getCurrentTime((short)29100) * 8584750629744383367L;
            }

            Class181.method2261(-1932876771);
            if(6 == client.loginStage * -243034353) {
               client.aClass296_348.method3754(-1713858855).method6373(client.aClass296_348, -1348534751);
               Class107.method1386((byte)81);
               Class209.method2640((byte)-88);
               if(-1235092803 * client.anInt_459 > 10) {
                  client.gameConnectionHandler.anInt_3444 += -1476602597;
               }

               if(-177570541 * client.gameConnectionHandler.anInt_3444 > 2250) {
                  Class221.method2781(970516128);
               } else {
                  if(4 == client.anInt_356 * 415041591) {
                     InterfaceDataComposite.method2613(1351803217);
                     Class442.method5461(-637973134);
                  } else if(Class560.aClass599_9582.aClass617_9879.method6609(mouseNode, client.aClass233Array_322, client.anInt_321 * 572469979, Class223.captureKeyboardList, 361523341)) {
                     Class258.method3382(false, (byte)-120);
                  } else {
                     if(415041591 * client.anInt_356 == 3 && Class625.method6652(-1985343409 * client.anInt_544, -1022948688)) {
                        client.aClass296_348.method3764(new Class297(Class305.aClass305_6023, (ByteArrayDataNode_Sub1)null), -1449774262);
                        client.anInt_356 = 0;
                     }

                     if(0 == 415041591 * client.anInt_356 && 10 != client.loginStage * -243034353) {
                        Class95.aNodeArrayList_1886.method5938(2118750651);
                        client.anInt_356 = 932785543;
                        client.anInt_358 = client.timer * 1541140171;
                        client.anInt_552 = 0;
                        client.aBoolean_357 = false;
                        Class368.method4681((byte)-102);
                     }

                     if(client.anInt_356 * 415041591 == 1) {
                        var2 = -1025618511 * client.timer - client.anInt_358 * 15763955;
                        if(1247476837 * client.anInt_552 < Class95.aClass104Array_1892.length) {
                           do {
                              CharTask var24 = Class95.aClass104Array_1892[1247476837 * client.anInt_552];
                              if(-1795715773 * var24.anInt_1975 > var2) {
                                 break;
                              }

                              var24.execute();
                           } while(415041591 * client.anInt_356 == 1 && (client.anInt_552 += 399594861) * 1247476837 < Class95.aClass104Array_1892.length);
                        }

                        if(415041591 * client.anInt_356 == 1) {
                           for(var23 = 0; var23 < Class95.aClass100Array_1894.length; ++var23) {
                              Class100 var29 = Class95.aClass100Array_1894[var23];
                              if(var29.aBoolean_1952) {
                                 RSCharacter var31 = var29.getTarget((byte)4);
                                 Class572.method6275(var31, true, 1834898295);
                              }
                           }
                        }
                     }
                  }

                  Class240_Sub52_Sub8.method553(1740808178);
                  Class32_Sub1.method3355(-1240483375);
                  Class343.method4252(-78009534);
                  client.anInt_384 += 1043346163;
                  if(0 != client.interactionType * 421562689) {
                     client.crossSprite += -14326660;
                     if(client.crossSprite * -1298239909 >= 400) {
                        client.interactionType = 0;
                     }
                  }

                  if(null != Class240_Sub51.aClass132_7705) {
                     client.anInt_420 += -134882249;
                     if(client.anInt_420 * -752576121 >= 15) {
                        Class110_Sub1.method3149(Class240_Sub51.aClass132_7705, -725093906);
                        Class240_Sub51.aClass132_7705 = null;
                     }
                  }

                  client.aClass132_455 = null;
                  client.aBoolean_582 = false;
                  client.aBoolean_484 = false;
                  Class203.aClass132_3532 = null;
                  Class71.method821((RSInterface)null, -1, -1, -887641519);
                  if(!client.aBoolean_463) {
                     client.anInt_373 = 1449477201;
                  }

                  Class107.method1385(-661248056);
                  client.anInt_413 += -1152014243;
                  Class240_Sub27 var22;
                  if(client.aBoolean_495) {
                     var22 = Class47_Sub1.method3496(Class326.aClass326_6231, client.gameConnectionHandler.aClass528_3433, 1917447504);
                     var22.aClass240_Sub8_Sub1_7370.method4514(-1637754397 * Class55.anInt_1087 << 28 | 47325585 * Class104_Sub21.anInt_10737 << 14 | 938061315 * Class239.anInt_4044, 1853724192);
                     client.gameConnectionHandler.addPacket(var22, 2006975722);
                     client.aBoolean_495 = false;
                  }

                  while(true) {
                     Class240_Sub17 var25 = (Class240_Sub17)client.aNodeList_369.returnShift((byte)73);
                     RSInterface var26;
                     RSInterface var30;
                     if(var25 == null) {
                        while(true) {
                           var25 = (Class240_Sub17)client.aNodeList_520.returnShift((byte)46);
                           if(var25 == null) {
                              while(true) {
                                 var25 = (Class240_Sub17)client.aNodeList_518.returnShift((byte)23);
                                 if(var25 == null) {
                                    if(null == Class203.aClass132_3532) {
                                       client.anInt_493 = 0;
                                    }

                                    if(null != client.aClass132_523) {
                                       DamageSprite.method6531(-2111614869);
                                    }

                                    Class520.method5969(1220718599);
                                    if(-268988889 * client.anInt_507 > 0 && Class223.captureKeyboardList.method3208(82, 1953407658) && Class223.captureKeyboardList.method3208(81, 1953407658) && -236083147 * client.scrollClickCount != 0) {
                                       var2 = Class521.myPlayer.plane - client.scrollClickCount * -236083147;
                                       if(var2 < 0) {
                                          var2 = 0;
                                       } else if(var2 > 3) {
                                          var2 = 3;
                                       }

                                       MapPoint var27 = client.aClass296_348.getMapArea();
                                       Class636.method6721(var2, Class521.myPlayer.tilePosArrayX[0] + 1265321541 * var27.loadedMapX, var27.loadedMapY * -1996781083 + Class521.myPlayer.tilePosArrayY[0], (byte)6);
                                    }

                                    for(var2 = 0; var2 < 5; ++var2) {
                                       ++client.anIntArray_464[var2];
                                    }

                                    if(Class267.preferenceFileList.aBoolean_11139 && Class267.preferenceFileList.aLong_11140 * -7910477920617393723L < Class373.getCurrentTime((short)26570) - 60000L) {
                                       Class34_Sub2.method2742((byte)66);
                                    }

                                    Class267.preferenceFileList.method7710((byte)28);

                                    for(Class231_Sub3 var28 = (Class231_Sub3)client.aClass512_496.method5930((byte)-1); var28 != null; var28 = (Class231_Sub3)client.aClass512_496.method5933(-1706904905)) {
                                       if((long)(var28.anInt_7900 * -761601043) < Class373.getCurrentTime((short)17086) / 1000L - 5L) {
                                          if(var28.aShort_7898 > 0) {
                                             Class634.method6708(5, 0, "", "", "", var28.aString_7899 + ServerString.aClass482_8908.getText(Class599.clientLanguage, -2095563690), (byte)100);
                                          }

                                          if(var28.aShort_7898 == 0) {
                                             Class634.method6708(5, 0, "", "", "", var28.aString_7899 + ServerString.aClass482_8886.getText(Class599.clientLanguage, -1706225207), (byte)103);
                                          }

                                          var28.method2931(-1239157996);
                                       }
                                    }

                                    client.anInt_377 += 2107129671;
                                    if(client.anInt_377 * 1480047223 > 504) {
                                       client.anInt_377 = 0;
                                       var2 = (int)(Math.random() * 8.0D);
                                       if(1 == (var2 & 1)) {
                                          client.anInt_469 += 2037762169 * client.anInt_372;
                                       }

                                       if((var2 & 2) == 2) {
                                          client.anInt_569 += client.anInt_374 * -1969668027;
                                       }

                                       if((var2 & 4) == 4) {
                                          client.anInt_375 += 1091313027 * client.anInt_434;
                                       }
                                    }

                                    if(client.anInt_469 * 1052057935 < -55) {
                                       client.anInt_372 = -879514930;
                                    }

                                    if(1052057935 * client.anInt_469 > 53) {
                                       client.anInt_372 = 879514930;
                                    }

                                    if(1635662145 * client.anInt_569 < -55) {
                                       client.anInt_374 = 1041773722;
                                    }

                                    if(1635662145 * client.anInt_569 > 58) {
                                       client.anInt_374 = -1041773722;
                                    }

                                    if(-610013693 * client.anInt_375 < -41) {
                                       client.anInt_434 = -1686441031;
                                    }

                                    if(-610013693 * client.anInt_375 > 44) {
                                       client.anInt_434 = 1686441031;
                                    }

                                    client.anInt_382 += 1093489055;
                                    if(client.anInt_382 * -982414753 > 501) {
                                       client.anInt_382 = 0;
                                       var2 = (int)(Math.random() * 8.0D);
                                       if(1 == (var2 & 1)) {
                                          client.anInt_378 += 2063252875 * client.anInt_401;
                                       }

                                       if(2 == (var2 & 2)) {
                                          client.anInt_380 += -719993891 * client.anInt_381;
                                       }
                                    }

                                    if(client.anInt_378 * -517467801 < -67) {
                                       client.anInt_401 = 307417034;
                                    }

                                    if(-517467801 * client.anInt_378 > 66) {
                                       client.anInt_401 = -307417034;
                                    }

                                    if(1121098075 * client.anInt_380 < -22) {
                                       client.anInt_381 = 2142562927;
                                    }

                                    if(client.anInt_380 * 1121098075 > 10) {
                                       client.anInt_381 = -2142562927;
                                    }

                                    client.gameConnectionHandler.anInt_3447 += -92815543;
                                    if(client.gameConnectionHandler.anInt_3447 * -18521351 > 50) {
                                       var22 = Class47_Sub1.method3496(Class326.aClass326_6217, client.gameConnectionHandler.aClass528_3433, 1917447504);
                                       client.gameConnectionHandler.addPacket(var22, 1525721389);
                                    }

                                    if(client.aBoolean_346) {
                                       Class44.method411((byte)-25);
                                       client.aBoolean_346 = false;
                                    }

                                    try {
                                       client.gameConnectionHandler.method2541((byte)-25);
                                    } catch (IOException var16) {
                                       Class221.method2781(1861382181);
                                    }

                                    return;
                                 }

                                 var26 = var25.aClass132_6903;
                                 if(-1001687885 * var26.anInt_2428 >= 0) {
                                    var30 = RSServerQueue.getInterface(var26.parentID * -671235497, (byte)105);
                                    if(null == var30 || var30.aClass132Array_2579 == null || -1001687885 * var26.anInt_2428 >= var30.aClass132Array_2579.length || var30.aClass132Array_2579[-1001687885 * var26.anInt_2428] != var26) {
                                       continue;
                                    }
                                 }

                                 Class411.method5074(var25, (byte)1);
                              }
                           }

                           var26 = var25.aClass132_6903;
                           if(-1001687885 * var26.anInt_2428 >= 0) {
                              var30 = RSServerQueue.getInterface(-671235497 * var26.parentID, (byte)105);
                              if(var30 == null || null == var30.aClass132Array_2579 || -1001687885 * var26.anInt_2428 >= var30.aClass132Array_2579.length || var30.aClass132Array_2579[-1001687885 * var26.anInt_2428] != var26) {
                                 continue;
                              }
                           }

                           Class411.method5074(var25, (byte)1);
                        }
                     }

                     var26 = var25.aClass132_6903;
                     if(var26.anInt_2428 * -1001687885 >= 0) {
                        var30 = RSServerQueue.getInterface(var26.parentID * -671235497, (byte)105);
                        if(var30 == null || var30.aClass132Array_2579 == null || -1001687885 * var26.anInt_2428 >= var30.aClass132Array_2579.length || var30.aClass132Array_2579[var26.anInt_2428 * -1001687885] != var26) {
                           continue;
                        }
                     }

                     Class411.method5074(var25, (byte)1);
                  }
               }
            }
         }
      }
   }

   public static final void method6236(int var0) {
      if(!client.aBoolean_391) {
         client.aFloat_390 += (12.0F - client.aFloat_390) / 2.0F;
         client.aBoolean_395 = true;
         client.aBoolean_391 = true;
      }
   }

   static void method6237(Renderer var0, int var1, int var2, RSInterface var3, int var4, int var5) {
      for(int var6 = 7; var6 >= 0; --var6) {
         for(int var7 = 127; var7 >= 0; --var7) {
            int var8 = (var4 & 63) << 10 | (var6 & 7) << 7 | var7 & 127;
            Class86.method1127(false, true, (byte)-67);
            int var9 = Class541.anIntArray_9470[var8];
            Class19.method103(false, true, (byte)1);
            var0.drawOutline(var1 + (var7 * var3.width * -533669195 >> 7), (var3.height * 1833812087 * (7 - var6) >> 3) + var2, 1 + (-533669195 * var3.width >> 7), (var3.height * 1833812087 >> 3) + 1, -16777216 | var9, 0);
         }
      }

   }
}
