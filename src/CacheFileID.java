import java.io.DataInputStream;
import java.net.URL;

public class CacheFileID {

   public static final CacheFileID aClass108_1994 = new CacheFileID(0, "", false, false);
   public static final CacheFileID aClass108_1995 = new CacheFileID(1, "", false, false);
   public static final CacheFileID aClass108_1996 = new CacheFileID(31, "", false, false);
   public static final CacheFileID aClass108_1997 = new CacheFileID(4, "", false, false);
   public static final CacheFileID aClass108_1998 = new CacheFileID(26, "", false, false);
   public static final CacheFileID cache23ID = new CacheFileID(23, "", true, false);
   public static final CacheFileID aClass108_2000 = new CacheFileID(6, "", false, false);
   public static final CacheFileID aClass108_2001 = new CacheFileID(7, "", false, false);
   public static final CacheFileID aClass108_2002 = new CacheFileID(17, "", true, false);
   public static final CacheFileID aClass108_2003 = new CacheFileID(9, "", false, false);
   public static final CacheFileID aClass108_2004 = new CacheFileID(25, "", true, false);
   public static final CacheFileID aClass108_2005 = new CacheFileID(11, "", false, false);
   public static final CacheFileID aClass108_2006 = new CacheFileID(12, "", true, false);
   public static final CacheFileID aClass108_2007 = new CacheFileID(13, "", false, false);
   public static final CacheFileID aClass108_2008 = new CacheFileID(14, "", false, false);
   public static final CacheFileID aClass108_2009 = new CacheFileID(15, "", false, false);
   public static final CacheFileID aClass108_2010 = new CacheFileID(5, "", false, false);
   public static final CacheFileID aClass108_2011 = new CacheFileID(24, "", true, false);
   public static final CacheFileID aClass108_2012 = new CacheFileID(18, "", true, false);
   public static final CacheFileID aClass108_2013 = new CacheFileID(19, "", true, false);
   public static final CacheFileID aClass108_2014 = new CacheFileID(20, "", true, false);
   public static final CacheFileID aClass108_2015 = new CacheFileID(21, "", true, false);
   public static final CacheFileID aClass108_2016 = new CacheFileID(2, "", true, false);
   public static final CacheFileID aClass108_2017 = new CacheFileID(22, "", true, false);
   static final CacheFileID aClass108_2018 = new CacheFileID(39, "", false, false);
   public static final CacheFileID aClass108_2019 = new CacheFileID(30, "", false, false);
   public static final CacheFileID aClass108_2020 = new CacheFileID(27, "", false, false);
   public static final CacheFileID aClass108_2021 = new CacheFileID(10, "", false, false);
   public static final CacheFileID aClass108_2022 = new CacheFileID(28, "", false, false);
   public static final CacheFileID aClass108_2023 = new CacheFileID(3, "", true, false);
   static int cacheFileCount = -1628159231;
   public static final CacheFileID aClass108_2025 = new CacheFileID(29, "", false, false);
   public static final CacheFileID aClass108_2026 = new CacheFileID(32, "", false, false);
   public static final CacheFileID aClass108_2027 = new CacheFileID(33, "", true, false);
   public static final CacheFileID aClass108_2028 = new CacheFileID(34, "", false, false);
   public static final CacheFileID aClass108_2029 = new CacheFileID(35, "", true, false);
   public static final CacheFileID aClass108_2030 = new CacheFileID(36, "", false, false);
   public static final CacheFileID aClass108_2031 = new CacheFileID(37, "", false, false);
   static final CacheFileID aClass108_2032 = new CacheFileID(38, "", false, false);
   public static final CacheFileID aClass108_2033 = new CacheFileID(16, "", true, false);
   final int id;
   public static final CacheFileID cacheFileId8 = new CacheFileID(8, "", false, false);
   public static int anInt_2036;
   static int anInt_2037;
   static int anInt_2038;


   CacheFileID(int var1, String var2, boolean var3, boolean var4) {
      this.id = var1 * 660713493;
   }

   public int getID() {
      return -1494442179 * this.id;
   }

   public static final void method1393(int var0) {
      if(0 != Class11.anInt_66 * 1622160533) {
         Class11.clientServerHandler.method2545((byte)94);
         Class206.method2615(-410223110);
         Class206.method2616(1294486771);
      }

   }

   static final void method1394(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class100.method1295(var3, var4, var0, (byte)8);
   }

   static final void method1395(byte var0) {
      if(Class104_Sub21.renderSettings.aClass540_Sub24_7297.method4126(2055196504) == 2) {
         byte[][][] var1 = client.aClass296_348.method3758(-947715545);
         byte var2 = (byte)(client.anInt_409 * 838393341 - 4 & 255);
         int var3 = 838393341 * client.anInt_409 % client.aClass296_348.getMaxX((byte)1);

         int var4;
         for(var4 = 0; var4 < 4; ++var4) {
            for(int var5 = 0; var5 < client.aClass296_348.getMaxY(2013879381); ++var5) {
               var1[var4][var3][var5] = var2;
            }
         }

         if(anInt_2036 * -763239015 != 3) {
            for(var4 = 0; var4 < 2; ++var4) {
               client.anIntArray_425[var4] = -1000000;
               client.anIntArray_304[var4] = 1000000;
               client.anIntArray_427[var4] = 0;
               client.anIntArray_429[var4] = 1000000;
               client.anIntArray_428[var4] = 0;
            }

            GameCoord var18 = Class521.myPlayer.method6203().gameCoord;
            Class281 var19 = client.aClass296_348.method3753();
            WorldObjects var6 = client.aClass296_348.getWorldObjects();
            int var9;
            if(3 != 1735950531 * Class509.anInt_9182 && Class509.anInt_9182 * 1735950531 != 2 && -1 == Class571.anInt_9652 * 605839479) {
               var9 = CompProfile.getHeight(1199090811 * Class330.anInt_6406, 1527060537 * Class373.anInt_7118, anInt_2036 * -763239015);
               if(var9 - 1386321257 * Class1.anInt_17 < 3200 && (var19.aByteArrayArrayArray_4768[anInt_2036 * -763239015][1199090811 * Class330.anInt_6406 >> 9][1527060537 * Class373.anInt_7118 >> 9] & 4) != 0) {
                  Class335.method4158(var6.tiles, 1, 1199090811 * Class330.anInt_6406 >> 9, 1527060537 * Class373.anInt_7118 >> 9, false, 53334501);
               }
            } else {
               MapPoint var7 = client.aClass296_348.getMapArea();
               int var10;
               if(2 == Class509.anInt_9182 * 1735950531) {
                  GameCoord var8 = Class542.aClass43_Sub1_9475.method397((byte)-91).method5904(590166973);
                  if(Float.isNaN(var8.floatX)) {
                     return;
                  }

                  var9 = (int)var8.floatX - (var7.loadedMapX * 1265321541 << 9);
                  var10 = (int)var8.floatZ - (var7.loadedMapY * -1996781083 << 9);
                  if(var9 < 0 || var10 < 0 || var9 >> 9 >= var19.aByteArrayArrayArray_4768[anInt_2036 * -763239015].length || var10 >> 9 >= var19.aByteArrayArrayArray_4768[-763239015 * anInt_2036][var9 >> 9].length) {
                     return;
                  }
               } else if(1735950531 * Class509.anInt_9182 == 3) {
                  var9 = (int)var18.floatX;
                  var10 = (int)var18.floatZ;
               } else {
                  var9 = 605839479 * Class571.anInt_9652;
                  var10 = 580226117 * Class102.anInt_1968;
               }

               if(0 != (var19.aByteArrayArrayArray_4768[-763239015 * anInt_2036][var9 >> 9][var10 >> 9] & 4)) {
                  Class335.method4158(var6.tiles, 0, var9 >> 9, var10 >> 9, false, 53334501);
                  return;
               }

               int var12;
               int var20;
               if(1735950531 * Class509.anInt_9182 == 2) {
                  GameCoord var11 = Class542.aClass43_Sub1_9475.method398(632276831).method667(-993762567);
                  var20 = ((int)var11.floatX >> 9) - 1265321541 * var7.loadedMapX;
                  var12 = ((int)var11.floatZ >> 9) - -1996781083 * var7.loadedMapY;
                  if(var20 < 0 || var12 < 0 || var20 >= var19.aByteArrayArrayArray_4768[-763239015 * anInt_2036].length || var12 >= var19.aByteArrayArrayArray_4768[-763239015 * anInt_2036][var20].length) {
                     return;
                  }
               } else {
                  var20 = 1199090811 * Class330.anInt_6406 >> 9;
                  var12 = 1527060537 * Class373.anInt_7118 >> 9;
               }

               int var21 = var9 >> 9;
               int var13 = var10 >> 9;
               int var14;
               if(var19.method3647(var20, var12, -462188568)) {
                  var14 = CompProfile.getHeight(1199090811 * Class330.anInt_6406, Class373.anInt_7118 * 1527060537, 3);
                  if(1386321257 * Class1.anInt_17 >= var14) {
                     Class335.method4158(var6.tiles, 1, var20, var12, false, 53334501);
                  }

                  return;
               }

               if(1728048089 * Class631.anInt_10082 < 2560) {
                  if(var21 > var20) {
                     var14 = var21 - var20;
                  } else {
                     var14 = var20 - var21;
                  }

                  int var15;
                  if(var13 > var12) {
                     var15 = var13 - var12;
                  } else {
                     var15 = var12 - var13;
                  }

                  if(0 == var14 && 0 == var15 || var14 <= -client.aClass296_348.getMaxX((byte)-41) || var14 >= client.aClass296_348.getMaxX((byte)-84) || var15 <= -client.aClass296_348.getMaxY(-307126349) || var15 >= client.aClass296_348.getMaxY(711351891)) {
                     if(2 != Class509.anInt_9182 * 1735950531) {
                        method1397(var20 + Class8.commaStr + var12 + " " + var21 + Class8.commaStr + var13 + " " + 1265321541 * var7.loadedMapX + Class8.commaStr + -1996781083 * var7.loadedMapY, new RuntimeException(), 1601847473);
                     }

                     return;
                  }

                  int var17;
                  int var16;
                  if(var14 > var15) {
                     var16 = var15 * 65536 / var14;
                     var17 = '\u8000';

                     while(var21 != var20) {
                        if(var20 < var21) {
                           ++var20;
                        } else if(var20 > var21) {
                           --var20;
                        }

                        if((var19.aByteArrayArrayArray_4768[-763239015 * anInt_2036][var20][var12] & 4) != 0) {
                           Class335.method4158(var6.tiles, 1, var20, var12, false, 53334501);
                           break;
                        }

                        var17 += var16;
                        if(var17 >= 65536) {
                           var17 -= 65536;
                           if(var12 < var13) {
                              ++var12;
                           } else if(var12 > var13) {
                              --var12;
                           }

                           if((var19.aByteArrayArrayArray_4768[anInt_2036 * -763239015][var20][var12] & 4) != 0) {
                              Class335.method4158(var6.tiles, 1, var20, var12, false, 53334501);
                              break;
                           }
                        }
                     }
                  } else {
                     var16 = 65536 * var14 / var15;
                     var17 = '\u8000';

                     while(var12 != var13) {
                        if(var12 < var13) {
                           ++var12;
                        } else if(var12 > var13) {
                           --var12;
                        }

                        if((var19.aByteArrayArrayArray_4768[-763239015 * anInt_2036][var20][var12] & 4) != 0) {
                           Class335.method4158(var6.tiles, 1, var20, var12, false, 53334501);
                           break;
                        }

                        var17 += var16;
                        if(var17 >= 65536) {
                           var17 -= 65536;
                           if(var20 < var21) {
                              ++var20;
                           } else if(var20 > var21) {
                              --var20;
                           }

                           if(0 != (var19.aByteArrayArrayArray_4768[anInt_2036 * -763239015][var20][var12] & 4)) {
                              Class335.method4158(var6.tiles, 1, var20, var12, false, 53334501);
                              break;
                           }
                        }
                     }
                  }
               }
            }

         }
      }
   }

   static final void method1396(RSInterfaceData var0, int var1) {
      int var2 = -1726369439 * Class270.anInt_4682;
      int var3 = Class104_Sub7.anInt_4433 * -959293549;
      int var4 = -1;
      if(Class506.aBoolean_9125) {
         Class516[] var5 = Class326.method4017(-376718181);

         for(int var6 = 0; var6 < var5.length; ++var6) {
            Class516 var7 = var5[var6];
            if(var2 == var7.anInt_9214 * 1824284839 && var7.anInt_9215 * -443218857 == var3) {
               var4 = var6;
               break;
            }
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4;
   }

   public static void method1397(String var0, Throwable var1, int var2) {
      try {
         String var3 = "";
         if(var1 != null) {
            var3 = Class80.method1061(var1, 45515716);
         }

         if(null != var0) {
            if(null != var1) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         Class585_Sub1.method4154(var3, 1642411132);
         var3 = Class370.method4697(var3, 2107770021);
         if(null == RuntimeException_Sub3.anApplet_3274) {
            return;
         }

         String var4 = "Unknown";
         String var5 = "1.1";

         try {
            var4 = System.getProperty("java.vendor");
            var5 = System.getProperty("java.version");
         } catch (Exception var8) {
            ;
         }

         URL var6 = new URL(RuntimeException_Sub3.anApplet_3274.getCodeBase(), "clienterror.ws?c=" + -1105477679 * RuntimeException_Sub3.anInt_3272 + "&cs=" + RuntimeException_Sub3.anInt_3271 * 1526196785 + "&u=" + (Class537.aString_9452 != null?Class370.method4697(Class537.aString_9452, -1238579048):"" + 6798162041305851685L * RuntimeException_Sub3.aLong_3275) + "&v1=" + Class370.method4697(var4, -1767249285) + "&v2=" + Class370.method4697(var5, -1178637267) + "&e=" + var3);
         DataInputStream var7 = new DataInputStream(var6.openStream());
         var7.read();
         var7.close();
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public static short method1398(int var0, int var1) {
      int var2 = var0 >> 10 & 63;
      int var3 = var0 >> 3 & 112;
      int var4 = var0 & 127;
      var3 = var4 <= 64?var4 * var3 >> 7:var3 * (127 - var4) >> 7;
      int var5 = var3 + var4;
      int var6;
      if(var5 != 0) {
         var6 = (var3 << 8) / var5;
      } else {
         var6 = var3 << 1;
      }

      return (short)(var2 << 10 | var6 >> 4 << 7 | var5);
   }
}
