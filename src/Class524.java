
public class Class524 {

   static final Class547 aClass547_9271 = new Class547();
   static final int anInt_9272 = 4096;
   static NodeArrayList aNodeArrayList_9273 = new NodeArrayList(4);


   Class524() throws Throwable {
      throw new Error();
   }

   public static int method5985(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var1 + var7);
         if((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if(var8 == 8364) {
               var3[var7 + var4] = -128;
            } else if(var8 == 8218) {
               var3[var4 + var7] = -126;
            } else if(var8 == 402) {
               var3[var4 + var7] = -125;
            } else if(var8 == 8222) {
               var3[var4 + var7] = -124;
            } else if(8230 == var8) {
               var3[var7 + var4] = -123;
            } else if(8224 == var8) {
               var3[var7 + var4] = -122;
            } else if(8225 == var8) {
               var3[var4 + var7] = -121;
            } else if(710 == var8) {
               var3[var7 + var4] = -120;
            } else if(8240 == var8) {
               var3[var7 + var4] = -119;
            } else if(352 == var8) {
               var3[var4 + var7] = -118;
            } else if(8249 == var8) {
               var3[var7 + var4] = -117;
            } else if(var8 == 338) {
               var3[var4 + var7] = -116;
            } else if(var8 == 381) {
               var3[var4 + var7] = -114;
            } else if(var8 == 8216) {
               var3[var4 + var7] = -111;
            } else if(var8 == 8217) {
               var3[var4 + var7] = -110;
            } else if(var8 == 8220) {
               var3[var4 + var7] = -109;
            } else if(var8 == 8221) {
               var3[var4 + var7] = -108;
            } else if(8226 == var8) {
               var3[var7 + var4] = -107;
            } else if(8211 == var8) {
               var3[var4 + var7] = -106;
            } else if(var8 == 8212) {
               var3[var4 + var7] = -105;
            } else if(732 == var8) {
               var3[var4 + var7] = -104;
            } else if(8482 == var8) {
               var3[var7 + var4] = -103;
            } else if(353 == var8) {
               var3[var7 + var4] = -102;
            } else if(var8 == 8250) {
               var3[var7 + var4] = -101;
            } else if(var8 == 339) {
               var3[var7 + var4] = -100;
            } else if(var8 == 382) {
               var3[var7 + var4] = -98;
            } else if(376 == var8) {
               var3[var7 + var4] = -97;
            } else {
               var3[var4 + var7] = 63;
            }
         } else {
            var3[var4 + var7] = (byte)var8;
         }
      }

      return var6;
   }

   static final void method5986(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(2 == client.anInt_567 * -826987519 && var2 < -1301826725 * client.friendsCount) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = client.friendsList[var2].aString_47;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   static final void method5987(Class418 var0, byte var1) {
      ByteArrayDataNode_Sub1 var2 = client.gameConnectionHandler.serverDataNode;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var12;
      int var13;
      int var14;
      int var15;
      int var22;
      int var27;
      if(var0 == Class418.aClass418_7948) {
         var3 = var2.method4462((byte)22);
         var22 = (var3 >> 4 & 7) + RendererInfo.anInt_3080 * 1568180067;
         var5 = (var3 & 7) + Class240_Sub51.anInt_7706 * -1538989907;
         var6 = var2.method4462((byte)32);
         var7 = var6 >> 2;
         var8 = client.anIntArray_354[var7];
         var9 = var2.method4501(-1965975883);
         var27 = var2.method4480(1260717178);
         if(var7 == -1965975883 * Class495.aClass495_9060.anInt_9062) {
            var7 = Class495.aClass495_9054.anInt_9062 * -1965975883;
         }

         if(1 == (var9 & 1)) {
            Class536.method6069(Class104_Sub1.anInt_4068 * 808166107, var22, var5, var8, var27, var7, (Class532)null, -1174052265);
         } else {
            int[] var39 = null;
            if(2 == (var9 & 2)) {
               var12 = var2.readByte(1025816308);
               var39 = new int[var12];

               for(var13 = 0; var13 < var12; ++var13) {
                  var39[var13] = var2.method4480(1260717178);
               }
            }

            short[] var34 = null;
            if((var9 & 4) == 4) {
               var13 = var2.readByte(-143917153);
               var34 = new short[var13];

               for(var14 = 0; var14 < var13; ++var14) {
                  var34[var14] = (short)var2.readShort(-805049537);
               }
            }

            short[] var40 = null;
            if(8 == (var9 & 8)) {
               var14 = var2.readByte(625698523);
               var40 = new short[var14];

               for(var15 = 0; var15 < var14; ++var15) {
                  var40[var15] = (short)var2.readShort(1078144929);
               }
            }

            Class536.method6069(Class104_Sub1.anInt_4068 * 808166107, var22, var5, var8, var27, var7, new Class532(8907106292348869423L * Class240_Sub30.aLong_7418, var39, var34, var40), -1969127759);
            Class240_Sub30.aLong_7418 += 1115554122342288335L;
         }

      } else {
         MapPoint var4;
         int var28;
         if(var0 == Class418.aClass418_7935) {
            var3 = var2.readByte(110041283);
            var4 = client.aClass296_348.getMapArea();
            var5 = (var3 & 7) + Class240_Sub51.anInt_7706 * -1538989907;
            var6 = var5 + var4.loadedMapY * -1996781083;
            var7 = RendererInfo.anInt_3080 * 1568180067 + (var3 >> 4 & 7);
            var8 = 1265321541 * var4.loadedMapX + var7;
            var9 = var2.readShort(-1191282379);
            var27 = var2.readShort(-243692220);
            var28 = var2.readShort(-1066053643);
            if(null != client.groundItems) {
               Class240_Sub25 var36 = (Class240_Sub25)client.groundItems.getNode((long)(Class104_Sub1.anInt_4068 * 808166107 << 28 | var6 << 14 | var8));
               if(null != var36) {
                  for(Class240_Sub36 var35 = (Class240_Sub36)var36.itemList.getBaseNode_2((byte)83); null != var35; var35 = (Class240_Sub36)var36.itemList.getNext(-2138860865)) {
                     if(1665912711 * var35.id == (var9 & 32767) && var35.anInt_7496 * -557533247 == var27) {
                        var35.shiftNext();
                        var35.anInt_7496 = 295917633 * var28;
                        Class374.method4761(808166107 * Class104_Sub1.anInt_4068, var8, var6, var35, (byte)8);
                        break;
                     }
                  }

                  if(var7 >= 0 && var5 >= 0 && var7 < client.aClass296_348.getMaxX((byte)-33) && var5 < client.aClass296_348.getMaxY(-1810998194)) {
                     Class377_Sub1.method5409(Class104_Sub1.anInt_4068 * 808166107, var7, var5, (byte)98);
                  }
               }
            }

         } else {
            int var17;
            int var16;
            if(var0 == Class418.aClass418_7934) {
               var3 = var2.readByte(1005249361);
               var22 = (var3 >> 4 & 15) + RendererInfo.anInt_3080 * -1158607162;
               var5 = Class240_Sub51.anInt_7706 * 1216987482 + (var3 & 15);
               var6 = var2.readByte(1848467892);
               boolean var25 = 0 != (var6 & 1);
               boolean var29 = (var6 & 2) != 0;
               var9 = var29?var6 >> 2:-1;
               var27 = var22 + var2.getByte((byte)24);
               var28 = var5 + var2.getByte((byte)70);
               var12 = var2.method4478((byte)1);
               var13 = var2.method4478((byte)1);
               var14 = var2.readShort(138841922);
               var15 = var2.readByte(2042373147);
               if(var29) {
                  var15 = (byte)var15;
               } else {
                  var15 *= 4;
               }

               var16 = var2.readByte(1522699706) * 4;
               var17 = var2.readShort(-960906420);
               int var41 = var2.readShort(1744509883);
               int var19 = var2.readByte(823209489);
               int var20 = var2.readShort(-388465453);
               if(var19 == 255) {
                  var19 = -1;
               }

               int var21 = var2.method4478((byte)1);
               if(client.aClass296_348.method3742(-1831086814) != Class305.aClass305_6023) {
                  if(var22 >= 0 && var5 >= 0 && var22 < client.aClass296_348.getMaxX((byte)-39) * 2 && var5 < client.aClass296_348.getMaxX((byte)-24) * 2 && var27 >= 0 && var28 >= 0 && var27 < client.aClass296_348.getMaxY(-132862887) * 2 && var28 < client.aClass296_348.getMaxY(937572686) * 2 && '\uffff' != var14) {
                     var22 = 256 * var22;
                     var5 = 256 * var5;
                     var27 = 256 * var27;
                     var28 *= 256;
                     var15 <<= 2;
                     var16 <<= 2;
                     var20 <<= 2;
                     Class11.method67(var14, var12, var13, var9, var15, var16, var22, var5, var27, var28, var17, var41, var19, var20, var25, var21, (byte)15);
                  }

               }
            } else if(var0 == Class418.aClass418_7940) {
               var3 = var2.readByte(-144314372);
               var22 = (var3 >> 4 & 7) + 1568180067 * RendererInfo.anInt_3080;
               var5 = Class240_Sub51.anInt_7706 * -1538989907 + (var3 & 7);
               var6 = var2.readShort(-1161812059);
               if('\uffff' == var6) {
                  var6 = -1;
               }

               var7 = var2.readByte(101388780);
               var8 = var7 >> 4 & 15;
               var9 = var7 & 7;
               var27 = var2.readByte(1434239432);
               var28 = var2.readByte(172123235);
               var12 = var2.readShort(1182925098);
               boolean var38 = var2.readByte(739112283) == 1;
               if(client.aClass296_348.method3742(-2098036172) != Class305.aClass305_6023) {
                  if(var22 >= 0 && var5 >= 0 && var22 < client.aClass296_348.getMaxX((byte)-100) && var5 < client.aClass296_348.getMaxY(-59633567)) {
                     var14 = var8 + 1;
                     if(Class521.myPlayer.tilePosArrayX[0] >= var22 - var14 && Class521.myPlayer.tilePosArrayX[0] <= var14 + var22 && Class521.myPlayer.tilePosArrayY[0] >= var5 - var14 && Class521.myPlayer.tilePosArrayY[0] <= var14 + var5) {
                        Class19.method109(var6, var9, var27, var28, var8 + (Class104_Sub1.anInt_4068 * 808166107 << 24) + (var22 << 16) + (var5 << 8), var38, var12, (byte)-61);
                     }
                  }

               }
            } else if(var0 == Class418.aClass418_7936) {
               var2.readByte(-307437463);
               var3 = var2.readByte(1535910255);
               var22 = 1568180067 * RendererInfo.anInt_3080 + (var3 >> 4 & 7);
               var5 = (var3 & 7) + -1538989907 * Class240_Sub51.anInt_7706;
               var6 = var2.readShort(1910915540);
               var7 = var2.readByte(-1130292315);
               var8 = var2.method4479(738776218);
               String var30 = var2.method4485(-1265336931);
               if(client.aClass296_348.method3742(-2024474488) != Class305.aClass305_6023) {
                  Class207.method2634(Class104_Sub1.anInt_4068 * 808166107, var22, var5, var7, var6, var8, var30, (byte)0);
               }
            } else if(var0 == Class418.aClass418_7937) {
               var3 = var2.method4531(862298251);
               var22 = var2.readShort(1259421480);
               var5 = var2.method4502((short)-12688);
               MapPoint var26 = client.aClass296_348.getMapArea();
               var7 = (var5 & 7) + Class240_Sub51.anInt_7706 * -1538989907;
               var8 = var7 + -1996781083 * var26.loadedMapY;
               var9 = (var5 >> 4 & 7) + 1568180067 * RendererInfo.anInt_3080;
               var27 = var9 + var26.loadedMapX * 1265321541;
               boolean var31 = var9 >= 0 && var7 >= 0 && var9 < client.aClass296_348.getMaxX((byte)-4) && var7 < client.aClass296_348.getMaxY(-1674610315);
               if(var31 || client.aClass296_348.method3742(-1893199401).method3840(1396762998)) {
                  Class374.method4761(808166107 * Class104_Sub1.anInt_4068, var27, var8, new Class240_Sub36(var22, var3), (byte)8);
                  if(var31) {
                     Class377_Sub1.method5409(Class104_Sub1.anInt_4068 * 808166107, var9, var7, (byte)1);
                  }
               }

            } else if(var0 == Class418.aClass418_7947) {
               var3 = var2.method4501(-1965975883);
               var22 = var3 >> 2;
               var5 = var3 & 3;
               var6 = client.anIntArray_354[var22];
               var7 = var2.method4462((byte)116);
               var8 = RendererInfo.anInt_3080 * 1568180067 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + Class240_Sub51.anInt_7706 * -1538989907;
               var27 = var2.method4480(1260717178);
               if(client.aClass296_348.method3742(-1810588440).method3840(883581115) || var8 >= 0 && var9 >= 0 && var8 < client.aClass296_348.getMaxX((byte)-105) && var9 < client.aClass296_348.getMaxY(1733721549)) {
                  Class581.method6322(Class104_Sub1.anInt_4068 * 808166107, var8, var9, var6, var27, var22, var5, (byte)-86);
               }

            } else if(Class418.aClass418_7941 == var0) {
               var3 = var2.readByte(888230270);
               var22 = RendererInfo.anInt_3080 * 1568180067 + (var3 >> 4 & 7);
               var5 = (var3 & 7) + Class240_Sub51.anInt_7706 * -1538989907;
               var6 = var2.readShort(664693156);
               if('\uffff' == var6) {
                  var6 = -1;
               }

               var7 = var2.readShort(210970892);
               var8 = var2.readShort(1787005243);
               var9 = var2.readByte(1119737819);
               var27 = var2.method4478((byte)1);
               if(client.aClass296_348.method3742(-1962001856) != Class305.aClass305_6023) {
                  if(var22 >= 0 && var5 >= 0 && var22 < client.aClass296_348.getMaxX((byte)-70) && var5 < client.aClass296_348.getMaxY(-106816)) {
                     if(-1 == var6) {
                        Class240_Sub22_Sub6 var33 = (Class240_Sub22_Sub6)client.aNodeArrayList_277.getNode((long)(var22 << 16 | var5));
                        if(var33 != null) {
                           var33.aClass563_Sub1_Sub4_Sub2_1237.method2244(-1405759408);
                           var33.shiftNext();
                        }
                     } else {
                        var28 = 256 + 512 * var22;
                        var12 = 256 + var5 * 512;
                        var13 = 808166107 * Class104_Sub1.anInt_4068;
                        if(var13 < 3 && client.aClass296_348.method3753().method3646(var22, var5, (byte)0)) {
                           ++var13;
                        }

                        Class563_Sub1_Sub4_Sub2 var37 = new Class563_Sub1_Sub4_Sub2(client.aClass296_348.getWorldObjects(), var6, var8, Class104_Sub1.anInt_4068 * 808166107, var13, var28, CompProfile.getHeight(var28, var12, 808166107 * Class104_Sub1.anInt_4068) - var7, var12, var22, var22, var5, var5, var9, false, var27);
                        client.aNodeArrayList_277.insert(new Class240_Sub22_Sub6(var37), (long)(var22 << 16 | var5));
                     }
                  }

               }
            } else if(Class418.aClass418_7938 == var0) {
               var3 = var2.method4480(1260717178);
               var22 = var2.readByte(1649114880);
               client.aClass296_348.method3755(-398025728).method6015(var3, (byte)1).method6044(var22, (byte)15);
            } else if(Class418.aClass418_7942 == var0) {
               var3 = var2.method4531(-635755533);
               var22 = var2.readShort(-1056652845);
               var5 = var2.method4529(1494848906);
               var6 = var2.method4462((byte)33);
               MapPoint var24 = client.aClass296_348.getMapArea();
               var8 = Class240_Sub51.anInt_7706 * -1538989907 + (var6 & 7);
               var9 = var8 + var24.loadedMapY * -1996781083;
               var27 = (var6 >> 4 & 7) + 1568180067 * RendererInfo.anInt_3080;
               var28 = var27 + 1265321541 * var24.loadedMapX;
               if(-719726693 * client.anInt_438 != var3) {
                  boolean var32 = var27 >= 0 && var8 >= 0 && var27 < client.aClass296_348.getMaxX((byte)-59) && var8 < client.aClass296_348.getMaxY(-1447624843);
                  if(var32 || client.aClass296_348.method3742(-1989098795).method3840(1259392666)) {
                     Class374.method4761(808166107 * Class104_Sub1.anInt_4068, var28, var9, new Class240_Sub36(var22, var5), (byte)8);
                     if(var32) {
                        Class377_Sub1.method5409(808166107 * Class104_Sub1.anInt_4068, var27, var8, (byte)111);
                     }
                  }
               }

            } else if(Class418.aClass418_7945 == var0) {
               var3 = var2.readByte(1724314038);
               boolean var23 = (var3 & 128) != 0;
               var5 = 1568180067 * RendererInfo.anInt_3080 + (var3 >> 3 & 7);
               var6 = (var3 & 7) + -1538989907 * Class240_Sub51.anInt_7706;
               var7 = var5 + var2.getByte((byte)101);
               var8 = var6 + var2.getByte((byte)32);
               var9 = var2.method4478((byte)1);
               var27 = var2.readShort(836251731);
               var28 = var2.readByte(144731760) * 4;
               var12 = var2.readByte(-890597084) * 4;
               var13 = var2.readShort(1834647731);
               var14 = var2.readShort(1813315238);
               var15 = var2.readByte(-626235561);
               var16 = var2.readShort(697815188);
               var17 = var2.method4478((byte)1);
               if(255 == var15) {
                  var15 = -1;
               }

               if(client.aClass296_348.method3742(-1567794680) != Class305.aClass305_6023) {
                  if(var5 >= 0 && var6 >= 0 && var5 < client.aClass296_348.getMaxX((byte)-17) && var6 < client.aClass296_348.getMaxY(426428886) && var7 >= 0 && var8 >= 0 && var7 < client.aClass296_348.getMaxX((byte)-118) && var8 < client.aClass296_348.getMaxY(1369908190) && '\uffff' != var27) {
                     var5 = var5 * 512 + 256;
                     var6 = 256 + 512 * var6;
                     var7 = 256 + 512 * var7;
                     var8 = 256 + var8 * 512;
                     var28 <<= 2;
                     var12 <<= 2;
                     var16 <<= 2;
                     Class563_Sub1_Sub4_Sub3 var18 = new Class563_Sub1_Sub4_Sub3(client.aClass296_348.getWorldObjects(), var27, Class104_Sub1.anInt_4068 * 808166107, Class104_Sub1.anInt_4068 * 808166107, var5, var6, var28, -1025618511 * client.timer + var13, client.timer * -1025618511 + var14, var15, var16, 0, var9, var12, var23, -1, var17);
                     var18.method2332(var7, var8, CompProfile.getHeight(var7, var8, 808166107 * Class104_Sub1.anInt_4068) - var12, -1025618511 * client.timer + var13, -1431969932);
                     client.aNodeList_570.addNode(new Class240_Sub22_Sub4(var18), (short)-8496);
                  }

               }
            } else if(var0 == Class418.aClass418_7944) {
               var3 = var2.method4519((byte)60);
               var22 = var2.method4462((byte)123);
               var5 = 1568180067 * RendererInfo.anInt_3080 + (var22 >> 4 & 7);
               var6 = (var22 & 7) + -1538989907 * Class240_Sub51.anInt_7706;
               var7 = var2.method4501(-1965975883);
               var8 = var7 >> 2;
               var9 = var7 & 3;
               var27 = client.anIntArray_354[var8];
               var28 = var2.readByte(1976818551);
               if(client.aClass296_348.method3742(-1888454864) != Class305.aClass305_6023) {
                  CacheNodeArrayList.method6681(Class104_Sub1.anInt_4068 * 808166107, var5, var6, var27, var8, var9, var3, var28, (short)-11557);
               }
            } else if(Class418.aClass418_7946 == var0) {
               var3 = var2.readByte(836507528);
               var22 = RendererInfo.anInt_3080 * 1568180067 + (var3 >> 4 & 7);
               var5 = (var3 & 7) + -1538989907 * Class240_Sub51.anInt_7706;
               var6 = var2.readShort(323015611);
               if('\uffff' == var6) {
                  var6 = -1;
               }

               var7 = var2.readByte(-1083255194);
               var8 = var7 >> 4 & 15;
               var9 = var7 & 7;
               var27 = var2.readByte(424462067);
               var28 = var2.readByte(-738976400);
               var12 = var2.readShort(1172822913);
               if(client.aClass296_348.method3742(-1512862879) != Class305.aClass305_6023) {
                  if(var22 >= 0 && var5 >= 0 && var22 < client.aClass296_348.getMaxX((byte)-31) && var5 < client.aClass296_348.getMaxY(-971415729)) {
                     var13 = 1 + var8;
                     if(Class521.myPlayer.tilePosArrayX[0] >= var22 - var13 && Class521.myPlayer.tilePosArrayX[0] <= var22 + var13 && Class521.myPlayer.tilePosArrayY[0] >= var5 - var13 && Class521.myPlayer.tilePosArrayY[0] <= var5 + var13) {
                        Class338.method4192(var6, var9, var27, var28, var8 + (var5 << 8) + (808166107 * Class104_Sub1.anInt_4068 << 24) + (var22 << 16), var12, 1449012673);
                     }
                  }

               }
            } else if(var0 == Class418.aClass418_7943) {
               var3 = var2.readByte(-396086578);
               var22 = var3 >> 2;
               var5 = var3 & 3;
               var6 = client.anIntArray_354[var22];
               var7 = var2.method4502((short)-20387);
               var8 = 1568180067 * RendererInfo.anInt_3080 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + -1538989907 * Class240_Sub51.anInt_7706;
               if(client.aClass296_348.method3742(-2097913238).method3840(-544225703) || var8 >= 0 && var9 >= 0 && var8 < client.aClass296_348.getMaxX((byte)8) && var9 < client.aClass296_348.getMaxY(1004169994)) {
                  Class581.method6322(808166107 * Class104_Sub1.anInt_4068, var8, var9, var6, -1, var22, var5, (byte)-28);
               }

            } else if(Class418.aClass418_7939 != var0) {
               CacheFileID.method1397("" + var0, new RuntimeException(), 2016933334);
               Class125.method1608(false, (byte)-41);
            } else {
               var3 = var2.method4462((byte)15);
               var4 = client.aClass296_348.getMapArea();
               var5 = (var3 & 7) + -1538989907 * Class240_Sub51.anInt_7706;
               var6 = var4.loadedMapY * -1996781083 + var5;
               var7 = 1568180067 * RendererInfo.anInt_3080 + (var3 >> 4 & 7);
               var8 = var4.loadedMapX * 1265321541 + var7;
               var9 = var2.method4531(-1703852875);
               Class240_Sub25 var10 = (Class240_Sub25)client.groundItems.getNode((long)(Class104_Sub1.anInt_4068 * 808166107 << 28 | var6 << 14 | var8));
               if(null != var10) {
                  for(Class240_Sub36 var11 = (Class240_Sub36)var10.itemList.getBaseNode_2((byte)74); var11 != null; var11 = (Class240_Sub36)var10.itemList.getNext(-1371120541)) {
                     if(var11.id * 1665912711 == (var9 & 32767)) {
                        var11.shiftNext();
                        break;
                     }
                  }

                  if(var10.itemList.isEmpty(2052616680)) {
                     var10.shiftNext();
                  }

                  if(var7 >= 0 && var5 >= 0 && var7 < client.aClass296_348.getMaxX((byte)-46) && var5 < client.aClass296_348.getMaxY(-711478774)) {
                     Class377_Sub1.method5409(Class104_Sub1.anInt_4068 * 808166107, var7, var5, (byte)13);
                  }
               }

            }
         }
      }
   }

   public static final void method5988(String var0, int var1) {
      if(var0 != null) {
         String var2 = Class606.method6518(var0, Class123.aClass436_2275, -1215862968);
         if(null != var2) {
            for(int var3 = 0; var3 < client.friendsCount * -1301826725; ++var3) {
               FriendPlayer var4 = client.friendsList[var3];
               String var5 = var4.aString_51;
               String var6 = Class606.method6518(var5, Class123.aClass436_2275, -1215862968);
               if(Class194.method2516(var0, var2, var5, var6, -1880633663)) {
                  client.friendsCount -= -1088863021;

                  for(int var7 = var3; var7 < -1301826725 * client.friendsCount; ++var7) {
                     client.friendsList[var7] = client.friendsList[var7 + 1];
                  }

                  client.anInt_512 = -490132939 * client.anInt_413;
                  ConnectionHandler var9 = Class32.method230(-156917195);
                  Class240_Sub27 var8 = Class47_Sub1.method3496(Class326.aClass326_6219, var9.aClass528_3433, 1917447504);
                  var8.aClass240_Sub8_Sub1_7370.putByte(Class258.method3383(var0, -1392939408), -2065693982);
                  var8.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-84);
                  var9.addPacket(var8, 346313854);
                  break;
               }
            }

         }
      }
   }

   static final void method5989(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.particlesSetting.method6082(var2, 1108790255);
   }
}
