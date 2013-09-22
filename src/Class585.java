import java.util.Iterator;

public abstract class Class585 {

   int anInt_9723 = -1247897355;
   int anInt_9724 = 1676224727;
   long aLong_9725 = 8786173127327005375L;
   final NodeList iterableCollection = new NodeList();
   long aLong_9727 = -8454498564592324243L;
   public static FontRenderer aTextRenderer_9728;
   public static CacheDataUnpacker aCacheUnpacker_9729;
   public static CacheDataUnpacker aCacheUnpacker_9730;
   public static Class236 aClass236_9731;


   void method6346(int var1) {
      this.iterableCollection.clear(1094196724);
      this.aLong_9727 = -8454498564592324243L;
      this.aLong_9725 = 8786173127327005375L;
      this.anInt_9724 = 1676224727;
      this.anInt_9723 = -1247897355;
   }

   void method6347(AbstractMouseNode var1, byte var2) {
      this.iterableCollection.addNode(var1, (short)-14251);
   }

   int method6348(AbstractMouseNode var1, int var2, int var3) {
      long var4;
      if(this.aLong_9727 * -4419167352048189541L == -1L) {
         var4 = (long)var2;
      } else {
         var4 = var1.method4940((byte)-12) - this.aLong_9727 * -4419167352048189541L;
         if(var4 > (long)var2) {
            var4 = (long)var2;
         }
      }

      this.aLong_9727 = var1.method4940((byte)-83) * 8454498564592324243L;
      return (int)var4;
   }

   abstract int method6349(byte var1);

   abstract void method6350(ByteArrayDataNode var1, AbstractMouseNode var2, int var3);

   abstract void method6351(byte var1);

   void method6352(int var1) {
      if(this.method6354(1947564709)) {
         Class240_Sub27 var2 = null;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         Iterator var6 = this.iterableCollection.iterator();

         while(var6.hasNext()) {
            AbstractMouseNode var7 = (AbstractMouseNode)var6.next();
            if(null != var2 && 964952859 * var2.aClass240_Sub8_Sub1_7370.index - var3 >= 252 - (6 + this.method6349((byte)0))) {
               break;
            }

            var7.shiftNext();
            int var8 = var7.getMouseY(-1364478889);
            if(var8 < -1) {
               var8 = -1;
            } else if(var8 > '\ufffe') {
               var8 = '\ufffe';
            }

            int var9 = var7.getMouseX((byte)38);
            if(var9 < -1) {
               var9 = -1;
            } else if(var9 > '\ufffe') {
               var9 = '\ufffe';
            }

            if(var9 == -602032871 * this.anInt_9724 && this.anInt_9723 * 1346415779 == var8) {
               var7.addThisNode((short)16383);
            } else {
               if(var2 == null) {
                  var2 = this.method6353((byte)-59);
                  var2.aClass240_Sub8_Sub1_7370.putByte(0, 1506960001);
                  var3 = 964952859 * var2.aClass240_Sub8_Sub1_7370.index;
                  var2.aClass240_Sub8_Sub1_7370.index += 207961638;
                  var4 = 0;
                  var5 = 0;
               }

               int var10;
               int var11;
               int var12;
               if(-7013156493177369919L * this.aLong_9725 != -1L) {
                  var10 = var9 - -602032871 * this.anInt_9724;
                  var11 = var8 - this.anInt_9723 * 1346415779;
                  var12 = (int)((var7.method4940((byte)37) - -7013156493177369919L * this.aLong_9725) / 20L);
                  var4 = (int)((long)var4 + (var7.method4940((byte)82) - -7013156493177369919L * this.aLong_9725) % 20L);
               } else {
                  var10 = var9;
                  var11 = var8;
                  var12 = Integer.MAX_VALUE;
               }

               this.anInt_9724 = -1676224727 * var9;
               this.anInt_9723 = 1247897355 * var8;
               if(var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                  var10 += 32;
                  var11 += 32;
                  var2.aClass240_Sub8_Sub1_7370.method4463(var11 + (var10 << 6) + (var12 << 12), 917213489);
               } else if(var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                  var10 += 128;
                  var11 += 128;
                  var2.aClass240_Sub8_Sub1_7370.putByte(128 + var12, -970195633);
                  var2.aClass240_Sub8_Sub1_7370.method4463((var10 << 8) + var11, -152816095);
               } else if(var12 < 32) {
                  var2.aClass240_Sub8_Sub1_7370.putByte(192 + var12, 1113002900);
                  if(var9 != -1 && var8 != -1) {
                     var2.aClass240_Sub8_Sub1_7370.putIntBE(var9 | var8 << 16, 2062892803);
                  } else {
                     var2.aClass240_Sub8_Sub1_7370.putIntBE(Integer.MIN_VALUE, 2062892803);
                  }
               } else {
                  var2.aClass240_Sub8_Sub1_7370.method4463((var12 & 8191) + '\ue000', 838430664);
                  if(var9 != -1 && var8 != -1) {
                     var2.aClass240_Sub8_Sub1_7370.putIntBE(var9 | var8 << 16, 2062892803);
                  } else {
                     var2.aClass240_Sub8_Sub1_7370.putIntBE(Integer.MIN_VALUE, 2062892803);
                  }
               }

               ++var5;
               this.method6350(var2.aClass240_Sub8_Sub1_7370, var7, -983264785);
               this.aLong_9725 = var7.method4940((byte)15) * -8786173127327005375L;
               var7.addThisNode((short)16383);
            }
         }

         if(null != var2) {
            var2.aClass240_Sub8_Sub1_7370.method4521(964952859 * var2.aClass240_Sub8_Sub1_7370.index - var3, -907432342);
            int var13 = var2.aClass240_Sub8_Sub1_7370.index * 964952859;
            var2.aClass240_Sub8_Sub1_7370.index = var3 * -2043502829;
            var2.aClass240_Sub8_Sub1_7370.putByte(var4 / var5, 304288056);
            var2.aClass240_Sub8_Sub1_7370.putByte(var4 % var5, 1457531556);
            var2.aClass240_Sub8_Sub1_7370.index = -2043502829 * var13;
            client.gameConnectionHandler.addPacket(var2, 203263489);
         }
      }

      this.method6351((byte)126);
   }

   abstract Class240_Sub27 method6353(byte var1);

   abstract boolean method6354(int var1);

   static int method6355(int var0, int var1, int var2) {
      int var3 = var0 >> 31 & var1 - 1;
      return (var0 + (var0 >>> 31)) % var1 + var3;
   }

   static final void method6356(int var0, int var1, int var2, int var3, boolean var4, byte var5) {
      if(client.aClass296_348.getWorldObjects() == null) {
         Class286.gameRenderer.method1915(var0, var1, var2, var3, -16777216, (byte)6);
      } else {
         GameCoord myPlayerCoord = Class521.myPlayer.method6203().gameCoord;
         boolean hidden = false;
         if(4 != 415041591 * client.anInt_356) {
            if(!client.aBoolean_357) {
               hidden = true;
            }
         } else {
            if((int)myPlayerCoord.floatX < 0 || (int)myPlayerCoord.floatX >= client.aClass296_348.getMaxX((byte)-89) * 512 || (int)myPlayerCoord.floatZ < 0 || (int)myPlayerCoord.floatZ >= client.aClass296_348.getMaxY(227891129) * 512) {
               hidden = true;
            }

            if(2 == 1735950531 * Class509.anInt_9182 && !Class542.aClass43_Sub1_9475.method367((byte)0)) {
               hidden = true;
            }
         }

         if(hidden) {
            Class286.gameRenderer.method1915(var0, var1, var2, var3, -16777216, (byte)51);
         } else {
            client.anInt_409 += 1174136661;
            if(null != Class521.myPlayer && (int)myPlayerCoord.floatX - (Class521.myPlayer.method3257() - 1) * 256 >> 9 == Class192.flagX * -516904107 && (int)myPlayerCoord.floatZ - (Class521.myPlayer.method3257() - 1) * 256 >> 9 == 776400831 * Class192.flagY) {
               Class192.flagX = -624818685;
               Class192.flagY = 2043346881;
               Class535.method6062(1471462747);
            }

            Class479.method5699(2072470912);
            if(!var4) {
               Class430_Sub1.method3046(1607148796);
            }

            GameType.method5916((byte)-79);
            Class32.method231(var0, var1, var2, var3, true, 1844434806);
            var0 = client.anInt_561 * -1558966173;
            var1 = client.anInt_562 * 1888634749;
            var2 = -195430259 * client.anInt_563;
            var3 = client.anInt_564 * -914495911;
            Class500.method5837(var0, var1, -15114799);
            int var8;
            int var9;
            if(3 == 1735950531 * Class509.anInt_9182) {
               var8 = (int)client.aFloat_387;
               if(456824667 * client.anInt_396 >> 8 > var8) {
                  var8 = 456824667 * client.anInt_396 >> 8;
               }

               if(client.aBooleanArray_548[4] && client.anIntArray_550[4] + 128 > var8) {
                  var8 = 128 + client.anIntArray_550[4];
               }

               var9 = client.anInt_375 * -610013693 + (int)client.aFloat_501 & 16383;
               Class572.method6276(Class326.anInt_6334 * 1890624197, CompProfile.getHeight((int)myPlayerCoord.floatX, (int)myPlayerCoord.floatZ, CacheFileID.anInt_2036 * -763239015) - client.anInt_394 * -1912427407, Class349.anInt_6617 * -1205230297, var8, var9, 600 + (var8 >> 3) * 3 << 2, var3, -1803872006);
            } else if(Class509.anInt_9182 * 1735950531 == 4) {
               var8 = (int)client.aFloat_387;
               if(client.anInt_396 * 456824667 >> 8 > var8) {
                  var8 = 456824667 * client.anInt_396 >> 8;
               }

               if(client.aBooleanArray_548[4] && client.anIntArray_550[4] + 128 > var8) {
                  var8 = client.anIntArray_550[4] + 128;
               }

               var9 = (int)client.aFloat_501 & 16383;
               Class572.method6276(1890624197 * Class326.anInt_6334, CompProfile.getHeight(-1782602441 * client.anInt_385, client.anInt_534 * -1112038629, CacheFileID.anInt_2036 * -763239015) - -1912427407 * client.anInt_394, -1205230297 * Class349.anInt_6617, var8, var9, 600 + 3 * (var8 >> 3) << 2, var3, -2004849659);
            } else if(Class509.anInt_9182 * 1735950531 == 6) {
               Class301.method3821(var3, (byte)-57);
            }

            var8 = Class330.anInt_6406 * 1199090811;
            var9 = 1386321257 * Class1.anInt_17;
            int var10 = Class373.anInt_7118 * 1527060537;
            int var11 = 1728048089 * Class631.anInt_10082;
            int var12 = 553328859 * Class474.anInt_8724;

            int var14;
            for(int var13 = 0; var13 < 5; ++var13) {
               if(client.aBooleanArray_548[var13]) {
                  var14 = (int)(Math.random() * (double)(1 + client.anIntArray_417[var13] * 2) - (double)client.anIntArray_417[var13] + Math.sin((double)client.anIntArray_355[var13] / 100.0D * (double)client.anIntArray_464[var13]) * (double)client.anIntArray_550[var13]);
                  if(0 == var13) {
                     Class330.anInt_6406 += 1881166515 * (var14 << 2);
                  }

                  if(1 == var13) {
                     Class1.anInt_17 += -1911010599 * (var14 << 2);
                  }

                  if(2 == var13) {
                     Class373.anInt_7118 += (var14 << 2) * -1775806967;
                  }

                  if(var13 == 3) {
                     Class474.anInt_8724 = (Class474.anInt_8724 * 553328859 + var14 & 16383) * -449062061;
                  }

                  if(var13 == 4) {
                     Class631.anInt_10082 += 351528041 * var14;
                     if(Class631.anInt_10082 * 1728048089 < 1024) {
                        Class631.anInt_10082 = -812538880;
                     } else if(1728048089 * Class631.anInt_10082 > 3072) {
                        Class631.anInt_10082 = 1857350656;
                     }
                  }
               }
            }

            if(Class330.anInt_6406 * 1199090811 < 0) {
               Class330.anInt_6406 = 0;
            }

            if(1199090811 * Class330.anInt_6406 > (client.aClass296_348.getWorldObjects().anInt_4481 * 1346434785 << 9) - 1) {
               Class330.anInt_6406 = ((client.aClass296_348.getWorldObjects().anInt_4481 * 1346434785 << 9) - 1) * 1881166515;
            }

            if(1527060537 * Class373.anInt_7118 < 0) {
               Class373.anInt_7118 = 0;
            }

            if(1527060537 * Class373.anInt_7118 > (client.aClass296_348.getWorldObjects().anInt_4479 * -1775771909 << 9) - 1) {
               Class373.anInt_7118 = ((client.aClass296_348.getWorldObjects().anInt_4479 * -1775771909 << 9) - 1) * -1775806967;
            }

            CacheFileID.method1395((byte)-47);
            Class286.gameRenderer.method1909(var0, var1, var2, var3);
            Class286.gameRenderer.method1965(var0, var1, var0 + var2, var1 + var3);
            Class584 var18 = client.aClass296_348.method3754(-1910597534).method6388(-1530211847);
            var14 = var18.method6339(16711935);
            Class115 var15 = new Class115();
            MapPoint var16 = client.aClass296_348.getMapArea();
            if(HintMarker.method2686(1929154679)) {
               Class22.aClass43_Sub1_198.method396(var15, client.gameViewport, client.anArrayViewport_293, var16.loadedMapX * 1265321541 << 9, var16.loadedMapY * -1996781083 << 9, 648050319);
            } else if(Class509.anInt_9182 * 1735950531 == 2) {
               Class542.aClass43_Sub1_9475.method396(var15, client.gameViewport, client.anArrayViewport_293, 1265321541 * var16.loadedMapX << 9, var16.loadedMapY * -1996781083 << 9, 673216750);
            } else {
               client.gameViewport.setPos((float)(-(Class330.anInt_6406 * 1199090811)), (float)(-(Class1.anInt_17 * 1386321257)), (float)(-(1527060537 * Class373.anInt_7118)));
               client.gameViewport.method4630(0.0F, -1.0F, 0.0F, Class362.toRadians(-(Class474.anInt_8724 * 553328859) & 16383));
               client.gameViewport.method4630(-1.0F, 0.0F, 0.0F, Class362.toRadians(-(Class631.anInt_10082 * 1728048089) & 16383));
               client.gameViewport.method4630(0.0F, 0.0F, -1.0F, Class362.toRadians(-(Class283_Sub5.anInt_8259 * 268025187) & 16383));
               Class459.method5570(client.anArrayViewport_293, true, (float)(var2 / 2), (float)(var3 / 2), (float)(client.anInt_565 * -288730661 << 1), (float)(client.anInt_565 * -288730661 << 1), var2, var3, (byte)67);
            }

            Class286.gameRenderer.setViewport(client.gameViewport);
            Class286.gameRenderer.method1946(client.anArrayViewport_293);
            if(var18.method6338(-831324111) != null) {
               Class286.gameRenderer.method1947(1.0F);
               Class286.gameRenderer.method1945(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
               var18.method6338(-831324111).method3691(Class286.gameRenderer, 622986595 * Class494.anInt_9038 << 3, var0, var1, var2, var3, Class631.anInt_10082 * 1728048089, Class474.anInt_8724 * 553328859, Class283_Sub5.anInt_8259 * 268025187, var14, true, false, 876581491);
            } else {
               Class286.gameRenderer.method1977(3, var14);
            }

            Class79.method1048(client.gameViewport, client.anArrayViewport_293, var2, var3, (byte)-106);
            client.aClass296_348.method3754(-110361930).method6373(client.aClass296_348, -1348534751);
            byte var17 = Class104_Sub21.renderSettings.aClass540_Sub24_7297.method4126(57476810) == 2?(byte)(838393341 * client.anInt_409):1;
            if(!HintMarker.method2686(1929154679) && 1735950531 * Class509.anInt_9182 != 2) {
               client.aClass296_348.getWorldObjects().method3431(client.timer * -1025618511, Class330.anInt_6406 * 1199090811, 1386321257 * Class1.anInt_17, Class373.anInt_7118 * 1527060537, client.aClass296_348.method3758(1169005009), client.anIntArray_425, client.anIntArray_304, client.anIntArray_427, client.anIntArray_428, client.anIntArray_429, Class521.myPlayer.plane + 1, var17, (int)myPlayerCoord.floatX >> 9, (int)myPlayerCoord.floatZ >> 9, Class104_Sub21.renderSettings.aClass540_Sub23_7293.method4100(-1654885576) == 0, true, 0, true);
            } else {
               client.aClass296_348.getWorldObjects().method3431(client.timer * -1025618511, -627265399 * var15.anInt_2084, var15.anInt_2083 * 2107386637, var15.anInt_2082 * 1668451679, client.aClass296_348.method3758(-1831113953), client.anIntArray_425, client.anIntArray_304, client.anIntArray_427, client.anIntArray_428, client.anIntArray_429, 1 + Class521.myPlayer.plane, var17, (int)myPlayerCoord.floatX >> 9, (int)myPlayerCoord.floatZ >> 9, Class104_Sub21.renderSettings.aClass540_Sub23_7293.method4100(-1867167364) == 0, true, 0, true);
            }

            client.anInt_459 += 2113294485;
            Class417.method5179((byte)24);
            if(6 == -243034353 * client.loginStage) {
               Class53.method547(var0, var1, var2, var3, 256, 256, 1205483828);
               Class29.drawPlayerHeadData(var0, var1, var2, var3, 256, 256, (byte)16);
               Class554.drawHintMarkers(var0, var1, var2, var3, 256, 256, (short)-22700);
               Class540_Sub19.drawCross(var0, var1, var2, var3, (byte)-23);
            }

            client.aClass296_348.getWorldObjects().method3417((byte)72);
            Class330.anInt_6406 = var8 * 1881166515;
            Class1.anInt_17 = -1911010599 * var9;
            Class373.anInt_7118 = -1775806967 * var10;
            Class631.anInt_10082 = 351528041 * var11;
            Class474.anInt_8724 = -449062061 * var12;
            if(client.aBoolean_298 && Class91.updateServerConnection.method3640((byte)43) == 0) {
               client.aBoolean_298 = false;
            }

            if(client.aBoolean_298) {
               Class286.gameRenderer.method1915(var0, var1, var2, var3, -16777216, (byte)-54);
               Class599.method6484(ServerString.loadingStr.getText(Class599.clientLanguage, 1001644268), false, Class286.gameRenderer, CacheDataNode.aTextRenderer_3243, Class1.aRSFont_10, 491263893);
            }

            Class459.method5570(client.anArrayViewport_293, false, (float)(var0 + var2 / 2), (float)(var3 / 2 + var1), (float)(-288730661 * client.anInt_565 << 1), (float)(-288730661 * client.anInt_565 << 1), var2, var3, (byte)123);
            Class286.gameRenderer.method1946(client.anArrayViewport_293);
            Class104_Sub19.method7392(client.anArrayViewport_293, 863838783);
         }
      }
   }

   static final void method6357(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(var2 != null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.length();
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }
}
