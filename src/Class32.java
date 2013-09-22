import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;

public class Class32 implements Class70 {

   final CacheDataUnpacker aCacheUnpacker_815;
   final Class430 aClass430_816;
   Sprite aClass170_817;


   public void method812(short var1) {
      this.aClass170_817 = FontRenderer.method1079(this.aCacheUnpacker_815, this.aClass430_816.anInt_8264 * -962773505, -1406969653);
   }

   Class32(CacheDataUnpacker var1, Class430 var2) {
      this.aCacheUnpacker_815 = var1;
      this.aClass430_816 = var2;
   }

   public void method813(boolean var1, int var2) {
      if(var1) {
         int var3 = this.aClass430_816.aClass419_8262.method5215(this.aClass170_817.getFurthestX(), client.anInt_343 * 688709465, (byte)-84) + -1666406649 * this.aClass430_816.anInt_8261;
         int var4 = this.aClass430_816.aClass412_8263.method5106(this.aClass170_817.getFurthestY(), client.anInt_435 * 759607001, 967393387) + this.aClass430_816.anInt_8265 * 355910967;
         this.aClass170_817.drawAt(var3, var4);
      }

   }

   public boolean method811(byte var1) {
      return this.aCacheUnpacker_815.hasData(-962773505 * this.aClass430_816.anInt_8264, 829779234);
   }

   public static void method228(Class240_Sub22 var0, Class240_Sub22 var1, int var2) {
      if(null != var0.aClass240_Sub22_7279) {
         var0.shiftNext();
      }

      var0.aClass240_Sub22_7279 = var1;
      var0.aClass240_Sub22_7277 = var1.aClass240_Sub22_7277;
      var0.aClass240_Sub22_7279.aClass240_Sub22_7277 = var0;
      var0.aClass240_Sub22_7277.aClass240_Sub22_7279 = var0;
   }

   public static void method229(CacheDataUnpacker var0, int var1) {
      Class597.anInt_9861 = 0;
      Class597.anInt_9862 = 0;
      Class597.aList_9869 = new LinkedList();
      Class597.aClass231_Sub2_Sub1_Sub1Array_9866 = new Class231_Sub2_Sub1_Sub1[1024];
      Class293.aClass594Array_5921 = new Class594[Class84.anIntArray_1709[-80546315 * Class597.anInt_9865] + 1];
      Class597.anInt_9863 = 0;
      Class597.anInt_9867 = 0;
      Class41.method345(var0, (byte)103);
      ConnectionDesc.method5693(var0, (short)28091);
   }

   public static ConnectionHandler method230(int var0) {
      return !Class636.method6720(-243034353 * client.loginStage, 1228439470) && -243034353 * client.loginStage != 3?client.gameConnectionHandler:client.lobbyConnectionHandler;
   }

   public static final void method231(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      if(var2 < 1) {
         var2 = 1;
      }

      if(var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      if(var6 < 0) {
         var6 = 0;
      } else if(var6 > 100) {
         var6 = 100;
      }

      int var7 = client.aShort_414 + (client.aShort_554 - client.aShort_414) * var6 / 100;
      int var8 = var7 * var3 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var11;
      if(var8 < client.aShort_462) {
         var11 = client.aShort_462;
         var7 = var11 * var2 * 334 / (512 * var3);
         if(var7 > client.aShort_558) {
            var7 = client.aShort_558;
            var9 = var3 * var7 * 512 / (var11 * 334);
            var10 = (var2 - var9) / 2;
            if(var4) {
               Class286.gameRenderer.method1967();
               Class286.gameRenderer.method1915(var0, var1, var10, var3, -16777216, (byte)-6);
               Class286.gameRenderer.method1915(var2 + var0 - var10, var1, var10, var3, -16777216, (byte)27);
            }

            var0 += var10;
            var2 -= 2 * var10;
         }
      } else if(var8 > client.aShort_560) {
         var11 = client.aShort_560;
         var7 = 334 * var11 * var2 / (var3 * 512);
         if(var7 < client.aShort_557) {
            var7 = client.aShort_557;
            var9 = var2 * var11 * 334 / (512 * var7);
            var10 = (var3 - var9) / 2;
            if(var4) {
               Class286.gameRenderer.method1967();
               Class286.gameRenderer.method1915(var0, var1, var2, var10, -16777216, (byte)112);
               Class286.gameRenderer.method1915(var0, var1 + var3 - var10, var2, var10, -16777216, (byte)-21);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      client.anInt_565 = var3 * var7 / 334 * -1544076717;
      client.anInt_561 = -1389956789 * var0;
      client.anInt_562 = var1 * 2127407573;
      client.anInt_563 = (short)var2 * -875263419;
      client.anInt_564 = (short)var3 * 1211826665;
   }

   static final void method232(int var0) {
      if(Class11.anInt_66 * 1622160533 != 0 && 100 != 1622160533 * Class11.anInt_66) {
         try {
            short var1;
            if(Class11.anInt_95 * 937539147 == 0 && Class11.anInt_66 * 1622160533 < 92) {
               var1 = 500;
            } else {
               var1 = 2000;
            }

            if(Class11.aBoolean_61 && 1622160533 * Class11.anInt_66 >= 64) {
               var1 = 6000;
            }

            if(565730191 * Class11.anInt_58 == 264 && 205 != 1622160533 * Class11.anInt_66 && 42 != 1374043613 * Class11.anInt_71 || 166 == 565730191 * Class11.anInt_58 && -1023105689 * Class11.anInt_62 != 49 && Class11.anInt_62 * -1023105689 != 52) {
               Class11.anInt_94 += 1480873815;
            }

            if(Class11.anInt_94 * 1766360167 > var1) {
               Class11.clientServerHandler.method2545((byte)74);
               if(Class11.anInt_95 * 937539147 >= 3) {
                  Class11.anInt_66 = 0;
                  Class606.method6520(-5, '\uff00');
                  Class206.method2616(1294486771);
                  return;
               }

               if(565730191 * Class11.anInt_58 == 264) {
                  Class503.aConnectionDesc_9108.method5689(-35110734);
               } else {
                  Class503.lobbyConnectionDesc.method5689(-35110734);
               }

               Class11.anInt_94 = 0;
               Class11.anInt_95 += 1509352291;
               Class11.anInt_66 = 1649702163;
            }

            Class240_Sub27 var2;
            int var3;
            int var5;
            if(15 == Class11.anInt_66 * 1622160533) {
               if(264 == 565730191 * Class11.anInt_58) {
                  Class11.clientServerHandler.setServerConnection(Class606.createServerConnection(Class503.aConnectionDesc_9108.createSocketConnection(-1112450799), 15000, -1841285723), Class503.aConnectionDesc_9108.hostIP, (byte)-3);
               } else {
                  Class11.clientServerHandler.setServerConnection(Class606.createServerConnection(Class503.lobbyConnectionDesc.createSocketConnection(356862345), 15000, -2098881266), Class503.lobbyConnectionDesc.hostIP, (byte)-87);
               }

               Class11.clientServerHandler.init((byte)-124);
               var2 = Class586.method6363((byte)-8);
               if(Class11.aBoolean_61) {
                  var2.aClass240_Sub8_Sub1_7370.putByte(311892347 * Class335.aClass335_6479.anInt_6478, 1940383356);
                  var2.aClass240_Sub8_Sub1_7370.method4463(0, 2022585968);
                  var3 = var2.aClass240_Sub8_Sub1_7370.index * 964952859;
                  var2.aClass240_Sub8_Sub1_7370.putIntBE(768, 2062892803);
                  var2.aClass240_Sub8_Sub1_7370.putIntBE(1, 2062892803);
                  if(565730191 * Class11.anInt_58 == 264) {
                     var2.aClass240_Sub8_Sub1_7370.putByte(-243034353 * client.loginStage == 17?1:0, -749028093);
                  }

                  ByteArrayDataNode var4 = Class104_Sub19.method7391(1199961867);
                  var4.putByte(Class11.anInt_105 * 1674910981, -1914958991);
                  var4.method4463((int)(Math.random() * 9.9999999E7D), -146542310);
                  var4.putByte(Class599.clientLanguage.getLanguageID(-1368267231), 373120794);
                  var4.putIntBE(client.anInt_275 * 1020203353, 2062892803);

                  for(var5 = 0; var5 < 6; ++var5) {
                     var4.putIntBE((int)(Math.random() * 9.9999999E7D), 2062892803);
                  }

                  var4.putLong(5592818059484599311L * client.aLong_310);
                  var4.putByte(-265238991 * client.currentGamePack.anInt_9269, -983501541);
                  var4.putByte((int)(Math.random() * 9.9999999E7D), -336011740);
                  var4.method4504(Class16.aBigInteger_137, Class16.aBigInteger_135, (byte)-20);
                  var2.aClass240_Sub8_Sub1_7370.putBytes(var4.data, 0, var4.index * 964952859, -144707030);
                  var2.aClass240_Sub8_Sub1_7370.method4472(964952859 * var2.aClass240_Sub8_Sub1_7370.index - var3, -1907821579);
               } else {
                  var2.aClass240_Sub8_Sub1_7370.putByte(Class335.aClass335_6470.anInt_6478 * 311892347, 1346434697);
               }

               Class11.clientServerHandler.addPacket(var2, 581904132);
               Class11.clientServerHandler.method2541((byte)-118);
               Class11.anInt_66 = -1744576285;
            }

            int var13;
            if(31 == Class11.anInt_66 * 1622160533) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(1, -2063945239)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 1, (short)-19955);
               Class11.clientServerHandler.serverDataNode.index = 0;
               var13 = Class11.clientServerHandler.serverDataNode.readByte(-274691548);
               if(var13 != 0) {
                  Class11.anInt_66 = 0;
                  Class89.method1185(var13, 2048224622);
                  Class606.method6520(var13, '\uff00');
                  Class11.clientServerHandler.method2545((byte)92);
                  Class206.method2616(1294486771);
                  return;
               }

               Class11.clientServerHandler.serverDataNode.index = 0;
               if(Class11.aBoolean_61) {
                  Class11.anInt_66 = -94874122;
               } else {
                  Class11.anInt_66 = 758377665;
               }
            }

            if(1622160533 * Class11.anInt_66 == 46) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(2, -2085220668)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 2, (short)-31749);
               Class11.clientServerHandler.serverDataNode.index = 0;
               Class11.clientServerHandler.serverDataNode.index = Class11.clientServerHandler.serverDataNode.readShort(-1116363059) * -2043502829;
               Class11.anInt_66 = 1753940635;
            }

            if(Class11.anInt_66 * 1622160533 == 55) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(Class11.clientServerHandler.serverDataNode.index * 964952859, -2007819728)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, Class11.clientServerHandler.serverDataNode.index * 964952859, (short)-17466);
               Class11.clientServerHandler.serverDataNode.method4495(Class114.anIntArray_2080, (byte)127);
               Class11.clientServerHandler.serverDataNode.index = 0;
               String var14 = Class11.clientServerHandler.serverDataNode.readString(1841936278);
               Class11.clientServerHandler.serverDataNode.index = 0;
               String var15 = Class332.aClass332_6420.method4106((byte)-90);
               if(!client.aBoolean_452 || !Class194.method2521(var14, 1, var15, -246496738)) {
                  Class303.method3832(var14, true, var15, client.aBoolean_285, 1610140316);
               }

               Class11.anInt_66 = -692211904;
            }

            if(Class11.anInt_66 * 1622160533 == 64) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(1, -2050150937)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 1, (short)-11169);
               if((Class11.clientServerHandler.serverDataNode.data[0] & 255) == 1) {
                  Class11.anInt_66 = -1090437092;
               }
            }

            if(76 == 1622160533 * Class11.anInt_66) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(16, -1948079123)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 16, (short)-2790);
               Class11.clientServerHandler.serverDataNode.index = 1663693104;
               Class11.clientServerHandler.serverDataNode.method4495(Class114.anIntArray_2080, (byte)38);
               Class11.clientServerHandler.serverDataNode.index = 0;
               Class11.aLong_99 = Class11.clientServerHandler.serverDataNode.method4538(1385013726) * -3016473431628976607L;
               Class11.aLong_91 = Class11.clientServerHandler.serverDataNode.method4538(1385013726) * 4480658858361632081L;
               Class11.anInt_66 = 758377665;
            }

            if(85 == Class11.anInt_66 * 1622160533) {
               Class11.clientServerHandler.serverDataNode.index = 0;
               Class11.clientServerHandler.init((byte)-10);
               var2 = Class586.method6363((byte)-113);
               ByteArrayDataNode_Sub1 var17 = var2.aClass240_Sub8_Sub1_7370;
               int var6;
               ByteArrayDataNode var7;
               ByteArrayDataNode var8;
               Class335 var21;
               if(264 == Class11.anInt_58 * 565730191) {
                  if(Class11.aBoolean_61) {
                     var21 = Class335.aClass335_6477;
                  } else {
                     var21 = Class335.aClass335_6469;
                  }

                  var17.putByte(311892347 * var21.anInt_6478, -1704507821);
                  var17.method4463(0, 153586929);
                  var5 = 964952859 * var17.index;
                  var6 = 964952859 * var17.index;
                  if(!Class11.aBoolean_61) {
                     var17.putIntBE(768, 2062892803);
                     var17.putIntBE(1, 2062892803);
                     var17.putByte(17 == -243034353 * client.loginStage?1:0, 727857518);
                     var6 = var17.index * 964952859;
                     var7 = Class503.method5857(-910335949);
                     var17.putBytes(var7.data, 0, 964952859 * var7.index, -144707030);
                     var6 = 964952859 * var17.index;
                     var17.putByte(-1L == -6939556774457567775L * Class11.aLong_99?1:0, -1543896116);
                     if(-1L == Class11.aLong_99 * -6939556774457567775L) {
                        var17.putString(Class11.aString_92, (byte)-53);
                     } else {
                        var17.putLong(Class11.aLong_99 * -6939556774457567775L);
                     }
                  }

                  var17.putByte(Class445.method5491(1917504476), 1165948239);
                  var17.method4463(1111410531 * Class29.canvasWidth, -2081415095);
                  var17.method4463(-75607525 * Class597.canvasHeight, 573886535);
                  var17.putByte(Class104_Sub21.renderSettings.aClass540_Sub27_7288.method4256(-2029088456), 271562862);
                  ParameterNode.method5290(var17, (byte)104);
                  var17.putString(client.aString_273, (byte)-24);
                  var17.putIntBE(1020203353 * client.anInt_275, 2062892803);
                  var7 = Class104_Sub21.renderSettings.compileRenderSettings(2027265151);
                  var17.putByte(964952859 * var7.index, -1995042867);
                  var17.putBytes(var7.data, 0, 964952859 * var7.index, -144707030);
                  client.aBoolean_568 = true;
                  var8 = new ByteArrayDataNode(Class494.aClass240_Sub15_9037.method4650((byte)-84));
                  Class494.aClass240_Sub15_9037.method4649(var8, (byte)12);
                  var17.putBytes(var8.data, 0, var8.data.length, -144707030);
                  var17.putIntBE(client.anInt_526 * -1425350471, 2062892803);
                  var17.putIntBE(client.anInt_280 * -56315749, 2062892803);
                  var17.putIntBE(client.anInt_326 * 1966576173, 2062892803);
                  var17.putString(Class50.aString_1052, (byte)-110);
                  var17.putByte(null == client.aString_283?0:1, 83714415);
                  if(null != client.aString_283) {
                     var17.putString(client.aString_283, (byte)-74);
                  }

                  var17.putByte(Class635.clientLibExtractor.isLibLoaded("jagtheora", -383038834)?1:0, -1628017811);
                  var17.putByte(client.aBoolean_452?1:0, 886810649);
                  var17.putByte(client.aBoolean_319?1:0, -448657600);
                  var17.putByte(559113153 * Class174_Sub2.anInt_10979, -1231386298);
                  var17.putIntBE(client.anInt_289 * -1684489387, 2062892803);
                  var17.putString(client.aString_290, (byte)-78);
                  var17.putByte(Class266.aConnectionDesc_4639 != null && -1543224839 * Class266.aConnectionDesc_4639.id == Class503.aConnectionDesc_9108.id * -1543224839?0:1, -1535605957);
                  Class90.method1194(var17, '\uff00');
                  var17.method4496(Class114.anIntArray_2080, var6, 964952859 * var17.index, -763494346);
                  var17.method4472(var17.index * 964952859 - var5, -1339021738);
               } else {
                  if(Class11.aBoolean_61) {
                     var21 = Class335.aClass335_6477;
                  } else {
                     var21 = Class335.aClass335_6476;
                  }

                  var17.putByte(311892347 * var21.anInt_6478, 2119878255);
                  var17.method4463(0, 896341313);
                  var5 = var17.index * 964952859;
                  var6 = var17.index * 964952859;
                  if(!Class11.aBoolean_61) {
                     var17.putIntBE(768, 2062892803);
                     var17.putIntBE(1, 2062892803);
                     var7 = Class503.method5857(-910335949);
                     var17.putBytes(var7.data, 0, var7.index * 964952859, -144707030);
                     var6 = var17.index * 964952859;
                     var17.putByte(-1L == Class11.aLong_99 * -6939556774457567775L?1:0, -769665352);
                     if(-6939556774457567775L * Class11.aLong_99 == -1L) {
                        var17.putString(Class11.aString_92, (byte)-105);
                     } else {
                        var17.putLong(Class11.aLong_99 * -6939556774457567775L);
                     }
                  }

                  var17.putByte(-265238991 * client.currentGamePack.anInt_9269, -1302136324);
                  var17.putByte(Class599.clientLanguage.getLanguageID(-916036786), 1503336425);
                  ParameterNode.method5290(var17, (byte)14);
                  var17.putString(client.aString_273, (byte)-46);
                  var7 = Class104_Sub21.renderSettings.compileRenderSettings(851986896);
                  var17.putByte(var7.index * 964952859, 780286102);
                  var17.putBytes(var7.data, 0, 964952859 * var7.index, -144707030);
                  var8 = new ByteArrayDataNode(Class494.aClass240_Sub15_9037.method4650((byte)-48));
                  Class494.aClass240_Sub15_9037.method4649(var8, (byte)12);
                  var17.putBytes(var8.data, 0, var8.data.length, -144707030);
                  var17.putIntBE(-1425350471 * client.anInt_526, 2062892803);
                  var17.putString(Class50.aString_1052, (byte)-10);
                  var17.putIntBE(client.anInt_275 * 1020203353, 2062892803);
                  var17.putIntBE(client.anInt_289 * -1684489387, 2062892803);
                  var17.putString(client.aString_290, (byte)-8);
                  Class90.method1194(var17, '\uff00');
                  var17.method4496(Class114.anIntArray_2080, var6, 964952859 * var17.index, -763494346);
                  var17.method4472(964952859 * var17.index - var5, -1770857515);
               }

               Class11.clientServerHandler.addPacket(var2, 382650367);
               Class11.clientServerHandler.method2541((byte)-87);
               Class11.clientServerHandler.aClass528_3433 = new Class528(Class114.anIntArray_2080);

               for(int var24 = 0; var24 < 4; ++var24) {
                  Class114.anIntArray_2080[var24] += 50;
               }

               Class11.clientServerHandler.aClass528_3440 = new Class528(Class114.anIntArray_2080);
               new Class528(Class114.anIntArray_2080);
               Class11.clientServerHandler.serverDataNode.method287(Class11.clientServerHandler.aClass528_3440, -1349491838);
               Class114.anIntArray_2080 = null;
               Class11.anInt_66 = -189748244;
            }

            if(Class11.anInt_66 * 1622160533 == 92) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(1, -2081589731)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 1, (short)-24173);
               var13 = Class11.clientServerHandler.serverDataNode.readByte(107534779);
               Class11.clientServerHandler.serverDataNode.index = 0;
               if(21 == var13) {
                  Class11.anInt_66 = 1611629452;
               } else if(29 != var13 && 45 != var13) {
                  if(1 == var13) {
                     Class11.anInt_66 = -1886887468;
                     Class606.method6520(var13, '\uff00');
                     return;
                  }

                  if(var13 == 52) {
                     Class104_Sub5.anInt_4359 = var13 * 1394374615;
                     Class11.anInt_66 = 871980487;
                  } else if(2 == var13) {
                     if(Class11.aBoolean_107) {
                        Class11.aBoolean_107 = false;
                        Class11.anInt_66 = 1649702163;
                        return;
                     }

                     if(264 == 565730191 * Class11.anInt_58) {
                        Class267.preferenceFileList.method7711(-1725560130);
                        Class11.anInt_66 = -872595798;
                     } else {
                        Class11.anInt_66 = 1962417579;
                     }
                  } else if(var13 == 15) {
                     Class11.clientServerHandler.anInt_3450 = -526616226;
                     Class11.anInt_66 = -777721676;
                  } else {
                     if(23 == var13 && 937539147 * Class11.anInt_95 < 3) {
                        Class11.anInt_94 = 0;
                        Class11.anInt_95 += 1509352291;
                        Class11.anInt_66 = 1649702163;
                        Class11.clientServerHandler.method2545((byte)88);
                        return;
                     }

                     if(var13 == 42) {
                        Class11.anInt_66 = 1071093081;
                        Class606.method6520(var13, '\uff00');
                        return;
                     }

                     if(166 == Class11.anInt_58 * 565730191 && 49 == var13 && 8 != client.loginStage * -243034353) {
                        if(52 != -1023105689 * Class11.anInt_62) {
                           Class606.method6520(var13, '\uff00');
                        }

                        return;
                     }

                     if(Class11.aBoolean_56 && !Class11.aBoolean_61 && Class11.anInt_105 * 1674910981 != -1 && var13 == 35) {
                        Class11.aBoolean_61 = true;
                        Class11.anInt_94 = 0;
                        Class11.anInt_66 = 1649702163;
                        Class11.clientServerHandler.method2545((byte)122);
                        return;
                     }

                     if(var13 != 53) {
                        Class11.anInt_66 = 0;
                        Class606.method6520(var13, '\uff00');
                        Class11.clientServerHandler.method2545((byte)85);
                        Class206.method2616(1294486771);
                        return;
                     }

                     Class11.anInt_66 = -1972397240;
                  }
               } else {
                  Class104_Sub5.anInt_4359 = 1394374615 * var13;
                  Class11.anInt_66 = 1118530142;
               }
            }

            if(1622160533 * Class11.anInt_66 == 124) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(1, -1929484370)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 1, (short)-28804);
               var13 = Class11.clientServerHandler.serverDataNode.data[0] & 255;
               Class11.anInt_101 = var13 * -294402302;
               Class11.anInt_66 = 0;
               Class606.method6520(21, '\uff00');
               Class11.clientServerHandler.method2545((byte)61);
               Class206.method2616(1294486771);
               return;
            }

            if(1622160533 * Class11.anInt_66 == 205) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(2, -2022209766)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 2, (short)-3639);
               Class11.anInt_96 = (((Class11.clientServerHandler.serverDataNode.data[0] & 255) << 8) + (Class11.clientServerHandler.serverDataNode.data[1] & 255)) * -439584169;
               Class11.anInt_66 = -189748244;
               return;
            }

            if(Class11.anInt_66 * 1622160533 == 232) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(4, -2086052459)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 4, (short)-16021);
               Class11.anInt_106 = Class11.clientServerHandler.serverDataNode.method4480(1260717178) * 523428173;
               Class11.clientServerHandler.serverDataNode.index = 0;
               Class11.anInt_66 = 0;
               Class606.method6520(53, '\uff00');
               Class11.clientServerHandler.method2545((byte)97);
               Class206.method2616(1294486771);
               return;
            }

            if(182 == 1622160533 * Class11.anInt_66) {
               if(29 == 1668246503 * Class104_Sub5.anInt_4359) {
                  if(!Class11.clientServerHandler.getServerConnection().method3065(1, -1910082296)) {
                     return;
                  }

                  Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 1, (short)-19047);
                  Class11.anInt_103 = (Class11.clientServerHandler.serverDataNode.data[0] & 255) * 792691153;
               } else {
                  if(Class104_Sub5.anInt_4359 * 1668246503 != 45) {
                     throw new IllegalStateException();
                  }

                  if(!Class11.clientServerHandler.getServerConnection().method3065(3, -2121184480)) {
                     return;
                  }

                  Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 3, (short)-7448);
                  Class11.anInt_103 = 792691153 * (Class11.clientServerHandler.serverDataNode.data[0] & 255);
                  Class11.anInt_102 = 1284113735 * ((Class11.clientServerHandler.serverDataNode.data[2] & 255) + ((Class11.clientServerHandler.serverDataNode.data[1] & 255) << 8));
               }

               Class11.anInt_66 = 0;
               Class606.method6520(Class104_Sub5.anInt_4359 * 1668246503, '\uff00');
               Class11.clientServerHandler.method2545((byte)31);
               Class206.method2616(1294486771);
               return;
            }

            if(1622160533 * Class11.anInt_66 == 211) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(2, -2062812046)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 2, (short)-11688);
               Class11.clientServerHandler.serverDataNode.index = 0;
               LoadProgress.anInt_6745 = Class11.clientServerHandler.serverDataNode.readShort(-1246069852) * 1732546569;
               Class11.clientServerHandler.serverDataNode.index = 0;
               Class11.anInt_66 = -1773284646;
               return;
            }

            if(1622160533 * Class11.anInt_66 == 226) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(855375417 * LoadProgress.anInt_6745, -2008863949)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 855375417 * LoadProgress.anInt_6745, (short)-26867);
               Class11.clientServerHandler.serverDataNode.index = 0;
               byte[] var23 = new byte[LoadProgress.anInt_6745 * 855375417 + 1];
               Class11.clientServerHandler.serverDataNode.method295(var23, 0, 855375417 * LoadProgress.anInt_6745, 423063671);
               Class11.clientServerHandler.serverDataNode.index = 0;
               ByteArrayDataNode var22 = new ByteArrayDataNode(var23);
               String var26 = var22.method4485(-1782508006);
               Class167.method2082(var26, true, client.aBoolean_285, (byte)-36);
               Class606.method6520(1668246503 * Class104_Sub5.anInt_4359, '\uff00');
               if(Class11.anInt_58 * 565730191 == 166 && client.loginStage * -243034353 != 8) {
                  Class11.anInt_66 = -189748244;
               } else {
                  Class11.anInt_66 = 0;
                  Class11.clientServerHandler.method2545((byte)126);
                  Class206.method2616(1294486771);
               }

               return;
            }

            if(Class11.anInt_66 * 1622160533 == 242) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(2, -2011423864)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 2, (short)-18745);
               Class11.clientServerHandler.serverDataNode.index = 0;
               Class11.clientServerHandler.anInt_3450 = Class11.clientServerHandler.serverDataNode.readShort(-998177597) * 263308113;
               Class11.anInt_66 = 227205644;
            }

            ByteArrayDataNode_Sub1 var25;
            if(252 == Class11.anInt_66 * 1622160533) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(Class11.clientServerHandler.anInt_3450 * 1463379377, -1972364688)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, Class11.clientServerHandler.anInt_3450 * 1463379377, (short)-4852);
               Class11.clientServerHandler.serverDataNode.index = 0;
               boolean var16 = Class11.clientServerHandler.serverDataNode.readByte(1531519414) == 1;

               while(Class11.clientServerHandler.serverDataNode.index * 964952859 < 1463379377 * Class11.clientServerHandler.anInt_3450) {
                  Class340 var18 = NodeArrayList.aClass212_Sub1_Sub2_9205.method5501(Class11.clientServerHandler.serverDataNode, -1423452749);
                  Class267.preferenceFileList.aClass468_3082.method5622(-488503965 * var18.anInt_6534, var18.anObject_6535, (byte)21);
               }

               if(var16) {
                  Class240_Sub27 var20 = Class586.method6363((byte)-49);
                  var25 = var20.aClass240_Sub8_Sub1_7370;
                  var25.putByte(311892347 * Class335.aClass335_6473.anInt_6478, -1919053696);
                  Class11.clientServerHandler.addPacket(var20, 994388536);
                  Class11.clientServerHandler.method2541((byte)-8);
                  Class11.anInt_66 = 1962417579;
               } else {
                  Class11.anInt_66 = -872595798;
               }
            }

            if(135 == Class11.anInt_66 * 1622160533) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(1, -2144876028)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 1, (short)-8563);
               IndexNode.anInt_7329 = (Class11.clientServerHandler.serverDataNode.data[0] & 255) * -1051152359;
               Class11.anInt_66 = 1763304985;
            }

            ByteArrayDataNode_Sub1 var19;
            if(141 == 1622160533 * Class11.anInt_66) {
               var19 = Class11.clientServerHandler.serverDataNode;
               if(264 == Class11.anInt_58 * 565730191) {
                  if(!Class11.clientServerHandler.getServerConnection().method3065(-105665495 * IndexNode.anInt_7329, -2078798228)) {
                     return;
                  }

                  Class11.clientServerHandler.getServerConnection().method3064(var19.data, 0, IndexNode.anInt_7329 * -105665495, (short)-12369);
                  var19.index = 0;
                  client.anInt_507 = var19.readByte(730356995) * 1749746071;
                  client.anInt_472 = var19.readByte(192015907) * -2127748333;
                  client.aBoolean_499 = var19.readByte(-546582407) == 1;
                  client.aBoolean_444 = var19.readByte(-827548756) == 1;
                  client.aBoolean_445 = var19.readByte(-123126313) == 1;
                  client.aBoolean_447 = var19.readByte(981200655) == 1;
                  client.anInt_438 = var19.readShort(1296695936) * 1563670163;
                  client.aBoolean_439 = var19.readByte(606822220) == 1;
                  Class36.anInt_851 = var19.method4484((byte)45) * 1444246357;
                  client.aBoolean_270 = var19.readByte(315871729) == 1;
                  Class8.aString_42 = var19.method4485(503106508);
                  client.aClass296_348.method3755(-408331123).method6016(client.aBoolean_270, (byte)24);
                  Class476.aClass306_8741.method3851((byte)76).method3755(1391040841).method6016(client.aBoolean_270, (byte)90);
                  Class592.cacheObjectLoader.method5582(client.aBoolean_270, (byte)-33);
                  Class104_Sub6.characterUnpacker.method5675(client.aBoolean_270, (byte)84);
               } else {
                  if(!Class11.clientServerHandler.getServerConnection().method3065(-105665495 * IndexNode.anInt_7329, -1939829698)) {
                     return;
                  }

                  Class11.clientServerHandler.getServerConnection().method3064(var19.data, 0, -105665495 * IndexNode.anInt_7329, (short)-21640);
                  var19.index = 0;
                  client.anInt_507 = var19.readByte(824592787) * 1749746071;
                  client.anInt_472 = var19.readByte(1141810480) * -2127748333;
                  client.aBoolean_499 = var19.readByte(-286990514) == 1;
                  Class36.anInt_851 = var19.method4484((byte)62) * 1444246357;
                  Class521.myPlayer.aByte_1462 = (byte)var19.readByte(1424805786);
                  client.aBoolean_444 = var19.readByte(-416640370) == 1;
                  client.aBoolean_445 = var19.readByte(-509451464) == 1;
                  Class276.aLong_4726 = var19.method4538(1385013726) * 1998956415294400483L;
                  ParameterNode.aLong_8077 = (-4167777861970946613L * Class276.aLong_4726 - Class373.getCurrentTime((short)27569) - var19.method4482(2086558782)) * -9193335705227406835L;
                  var3 = var19.readByte(1241495906);
                  client.aBoolean_439 = (var3 & 1) != 0;
                  Class582.aBoolean_9707 = (var3 & 2) != 0;
                  Class224.anInt_3846 = var19.method4480(1260717178) * -216587479;
                  Class305.aBoolean_6032 = var19.readByte(-302830631) == 1;
                  FontUnpacker.anInt_6465 = var19.method4480(1260717178) * -1800797279;
                  Class4.anInt_30 = var19.readShort(-1219391162) * -931296403;
                  Class109.anInt_2044 = var19.readShort(1428963684) * -1950408729;
                  Class271.anInt_4693 = var19.readShort(1735007381) * -2060127653;
                  Class167.anInt_3027 = var19.method4480(1260717178) * -1829667377;
                  GamePack.aClass9_9270 = new Class9(1240492335 * Class167.anInt_3027);
                  (new Thread(GamePack.aClass9_9270)).start();
                  Class232.anInt_3986 = var19.readByte(1919572925) * -407345391;
                  Class576.anInt_9664 = var19.readShort(1628878299) * -279257043;
                  Class273.anInt_4712 = var19.readShort(261143781) * -233129831;
                  Class520.aBoolean_9244 = var19.readByte(1532383800) == 1;
                  Class521.myPlayer.playerName = Class521.myPlayer.aString_1467 = Class537.aString_9452 = var19.readString(1841936278);
                  Class231_Sub4.anInt_8095 = var19.readByte(737305267) * 1944724965;
                  Class619.anInt_10019 = var19.method4480(1260717178) * -557343565;
                  Class266.aConnectionDesc_4639 = new ConnectionDesc();
                  Class266.aConnectionDesc_4639.id = var19.readShort(674296908) * -1268862903;
                  if(-1543224839 * Class266.aConnectionDesc_4639.id == '\uffff') {
                     Class266.aConnectionDesc_4639.id = 1268862903;
                  }

                  Class266.aConnectionDesc_4639.hostIP = var19.readString(1841936278);
                  if(Class554.aClass554_9529 != Class209.currentGameMode) {
                     Class266.aConnectionDesc_4639.index = Class266.aConnectionDesc_4639.id * 714041859 + -2114966848;
                     Class266.aConnectionDesc_4639.anInt_8747 = -1087093648 + -1638782029 * Class266.aConnectionDesc_4639.id;
                  }

                  if(Class209.currentGameMode != Class554.aClass554_9533 && (Class554.aClass554_9534 != Class209.currentGameMode || -268988889 * client.anInt_507 < 2) && Class503.aConnectionDesc_9108.method5691(Class503.aConnectionDesc_9109, -1635269060)) {
                     Class340.method4207(-1453436189);
                  }
               }

               if((!client.aBoolean_499 || client.aBoolean_445) && !client.aBoolean_439) {
                  try {
                     Class480.method5701(Class481.clientApplet, "unzap", -162489489);
                  } catch (Throwable var9) {
                     ;
                  }
               } else {
                  try {
                     Class480.method5701(Class481.clientApplet, "zap", 1205201410);
                  } catch (Throwable var11) {
                     if(client.aBoolean_318) {
                        try {
                           Class481.clientApplet.getAppletContext().showDocument(new URL(Class481.clientApplet.getCodeBase(), "blank.ws"), "tbi");
                        } catch (Exception var10) {
                           ;
                        }
                     }
                  }
               }

               if(Class554.aClass554_9529 == Class209.currentGameMode) {
                  Class332.aClass332_6412.method4108((byte)-99);
               }

               if(264 != 565730191 * Class11.anInt_58) {
                  Class11.anInt_66 = 0;
                  Class606.method6520(2, '\uff00');
                  Class552.method6124((byte)14);
                  Class418.method5190(4, (byte)-123);
                  Class11.clientServerHandler.aClass428_3448 = null;
                  return;
               }

               Class11.anInt_66 = 1715867924;
            }

            if(1622160533 * Class11.anInt_66 == 164) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(3, -2071190872)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 3, (short)-1978);
               Class11.anInt_66 = 1317642736;
            }

            if(1622160533 * Class11.anInt_66 == 176) {
               var19 = Class11.clientServerHandler.serverDataNode;
               var19.index = 0;
               if(var19.method290(-1474535215)) {
                  if(!Class11.clientServerHandler.getServerConnection().method3065(1, -2059128201)) {
                     return;
                  }

                  Class11.clientServerHandler.getServerConnection().method3064(var19.data, 3, 1, (short)-6258);
               }

               Class11.clientServerHandler.aClass428_3448 = Class104_Sub3.method3181(1365759455)[var19.method289(-799077507)];
               Class11.clientServerHandler.anInt_3450 = var19.readShort(283628743) * 263308113;
               Class11.anInt_66 = -1431860869;
            }

            if(Class11.anInt_66 * 1622160533 == 151) {
               if(!Class11.clientServerHandler.getServerConnection().method3065(Class11.clientServerHandler.anInt_3450 * 1463379377, -1936034744)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, Class11.clientServerHandler.anInt_3450 * 1463379377, (short)-17927);
               Class11.clientServerHandler.serverDataNode.index = 0;
               var13 = 1463379377 * Class11.clientServerHandler.anInt_3450;
               Class11.anInt_66 = 0;
               Class606.method6520(2, '\uff00');
               Class462.method5589(-531819751);
               Class1024.method2090(Class11.clientServerHandler.serverDataNode, -1569980778);
               var3 = var13 - 964952859 * Class11.clientServerHandler.serverDataNode.index;
               var25 = new ByteArrayDataNode_Sub1(var3);
               System.arraycopy(Class11.clientServerHandler.serverDataNode.data, 964952859 * Class11.clientServerHandler.serverDataNode.index, var25.data, 0, var3);
               Class11.clientServerHandler.serverDataNode.index += var3 * -2043502829;
               if(Class428.aClass428_8254 == Class11.clientServerHandler.aClass428_3448) {
                  client.aClass296_348.method3764(new Class297(Class305.aClass305_6027, var25), 1485556484);
               } else {
                  client.aClass296_348.method3764(new Class297(Class305.aClass305_6024, var25), -1117990776);
               }

               if(Class11.clientServerHandler.serverDataNode.index * 964952859 != var13) {
                  throw new RuntimeException(Class11.clientServerHandler.serverDataNode.index * 964952859 + " " + var13);
               }

               Class11.clientServerHandler.aClass428_3448 = null;
               return;
            }

            if(Class11.anInt_66 * 1622160533 == 196) {
               if(-2 == 1463379377 * Class11.clientServerHandler.anInt_3450) {
                  if(!Class11.clientServerHandler.getServerConnection().method3065(2, -2072379785)) {
                     return;
                  }

                  Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, 2, (short)-15958);
                  Class11.clientServerHandler.serverDataNode.index = 0;
                  Class11.clientServerHandler.anInt_3450 = Class11.clientServerHandler.serverDataNode.readShort(-363932161) * 263308113;
               }

               if(!Class11.clientServerHandler.getServerConnection().method3065(Class11.clientServerHandler.anInt_3450 * 1463379377, -2103038464)) {
                  return;
               }

               Class11.clientServerHandler.getServerConnection().method3064(Class11.clientServerHandler.serverDataNode.data, 0, Class11.clientServerHandler.anInt_3450 * 1463379377, (short)-21559);
               Class11.clientServerHandler.serverDataNode.index = 0;
               var13 = 1463379377 * Class11.clientServerHandler.anInt_3450;
               Class11.anInt_66 = 0;
               Class606.method6520(15, '\uff00');
               Class540_Sub27.method4262(-2108278549);
               Class1024.method2090(Class11.clientServerHandler.serverDataNode, -789434434);
               if(var13 != Class11.clientServerHandler.serverDataNode.index * 964952859) {
                  throw new RuntimeException(964952859 * Class11.clientServerHandler.serverDataNode.index + " " + var13);
               }

               Class11.clientServerHandler.aClass428_3448 = null;
               return;
            }
         } catch (IOException var12) {
            Class11.clientServerHandler.method2545((byte)111);
            if(937539147 * Class11.anInt_95 < 3) {
               if(Class11.anInt_58 * 565730191 == 264) {
                  Class503.aConnectionDesc_9108.method5689(-35110734);
               } else {
                  Class503.lobbyConnectionDesc.method5689(-35110734);
               }

               Class11.anInt_94 = 0;
               Class11.anInt_95 += 1509352291;
               Class11.anInt_66 = 1649702163;
            } else {
               Class11.anInt_66 = 0;
               Class606.method6520(-4, '\uff00');
               Class206.method2616(1294486771);
            }
         }

      }
   }

   static final void method233(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(var2.startsWith(Class3.method12(0, -1553609774)) || var2.startsWith(Class3.method12(1, -1553609774))) {
         var2 = var2.substring(7);
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class548.method6109(var2, 1683891307);
   }
}
