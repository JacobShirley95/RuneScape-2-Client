import java.util.Iterator;
import java.util.List;

public class Class31 {

   public static final Class31 aClass31_807 = new Class31(0, false);
   public static final Class31 aClass31_808 = new Class31(1, false);
   static final Class31 aClass31_809 = new Class31(2, true);
   public static final Class31 aClass31_810 = new Class31(3, false);
   static final Class31 aClass31_811 = new Class31(4, true);
   static final Class31 aClass31_812 = new Class31(5, true);
   public final int anInt_813;
   final boolean aBoolean_814;


   public boolean method218(int var1) {
      return this.aBoolean_814;
   }

   Class31(int var1, boolean var2) {
      this.anInt_813 = var1 * 1849495083;
      this.aBoolean_814 = var2;
   }

   static void method219(int var0) {
      RandomAccessFileNode var1 = Class240_Sub22_Sub17.getPreferencesFile("2", client.currentGamePack.gameID, false, (byte)50);
      Class267.preferenceFileList.method7717(var1, (byte)2);
   }

   static final void method220(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class542.aClass43_Sub1_9475.method352(Class563_Sub1_Sub5_Sub1.method5099(var2, 891208972), true, (byte)-40);
   }

   static long method221(CharSequence var0, byte var1) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if(var6 >= 65 && var6 <= 90) {
            var2 += (long)(var6 + 1 - 65);
         } else if(var6 >= 97 && var6 <= 122) {
            var2 += (long)(1 + var6 - 97);
         } else if(var6 >= 48 && var6 <= 57) {
            var2 += (long)(var6 + 27 - 48);
         }

         if(var2 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var2 % 37L && var2 != 0L) {
         var2 /= 37L;
      }

      return var2;
   }

   static void method222(Renderer var0, int var1, int var2, int var3, int var4, int var5, FontRenderer var6, RSFont var7, String var8, int var9) {
      int var10 = 255 - -624672153 * Class182.anInt_3109 - Class18.anInt_152 * 2141541207;
      if(var10 < 0) {
         var10 = 0;
      }

      if(Class221.aSprite_3790 == null || Class254.aSprite_4403 == null) {
         if(Class301.mmUnpacker.hasData(Class21.anInt_197 * -632923933, -993115869) && Class301.mmUnpacker.hasData(ScreenCharText.anInt_6171 * 979235677, -1037188039)) {
            Class221.aSprite_3790 = var0.loadSprite(ImageUtils.getImageData(Class301.mmUnpacker, Class21.anInt_197 * -632923933, 0), true);
            AbstractImageData var11 = ImageUtils.getImageData(Class301.mmUnpacker, 979235677 * ScreenCharText.anInt_6171, 0);
            Class254.aSprite_4403 = var0.loadSprite(var11, true);
            var11.method1378();
            Class630.aSprite_10078 = var0.loadSprite(var11, true);
         } else {
            var0.drawOutline(var1, var2, var3, var5, var10 << 24 | 465145769 * IteratorNodeList.anInt_9196, 1);
         }
      }

      if(Class221.aSprite_3790 != null && null != Class254.aSprite_4403) {
         int var13 = (var3 - Class254.aSprite_4403.getWidth() * 2) / Class221.aSprite_3790.getWidth();

         for(int var12 = 0; var12 < var13; ++var12) {
            Class221.aSprite_3790.drawAt(var1 + Class254.aSprite_4403.getWidth() + var12 * Class221.aSprite_3790.getWidth(), var2);
         }

         Class254.aSprite_4403.drawAt(var1, var2);
         Class630.aSprite_10078.drawAt(var1 + var3 - Class630.aSprite_10078.getWidth(), var2);
      }

      var6.renderText(var8, 3 + var1, (20 - 915612327 * var7.anInt_8573) / 2 + var2 + 915612327 * var7.anInt_8573, Class187_Sub2.anInt_10980 * -1151519113 | -16777216, -1, -1706897683);
      var0.drawOutline(var1, var5 + var2, var3, var4 - var5, var10 << 24 | IteratorNodeList.anInt_9196 * 465145769, 1);
   }

   static void method223(Renderer var0, int var1, int var2, byte var3) {
      if(var1 >= 0 && var2 >= 0 && null != Class18.anArrayViewport_169) {
         MapPoint var4 = client.aClass296_348.getMapArea();
         ArrayViewport var5 = var0.method1936();
         var0.method1946(Class18.anArrayViewport_169);
         var0.setViewport(Class18.aViewport_180);
         var0.method1965(-1597722007 * Class18.anInt_165, 641429699 * Class18.anInt_182, Class18.anInt_165 * -1597722007 + Class18.anInt_167 * -566853143, -141378483 * Class18.anInt_141 + 641429699 * Class18.anInt_182);
         var0.method1909(-1597722007 * Class18.anInt_165, Class18.anInt_182 * 641429699, -566853143 * Class18.anInt_167, Class18.anInt_141 * -141378483);
         var5.setViewport(Class18.aViewport_180);
         var5.method4580(Class18.anArrayViewport_169);
         var5.method4556();
         int var6 = var1 - -1597722007 * Class18.anInt_165;
         int var7 = var2 - 641429699 * Class18.anInt_182;
         int boundY;
         int var21;
         int textColour;
         int var60;
         if(client.aClass296_348.getWorldObjects() != null && (!client.aBoolean_463 || 0 != (Class286.anInt_4823 * 1458447745 & 64))) {
            int boundX = -1;
            boundY = -1;
            float var10 = (float)var6 * 2.0F / (float)(-566853143 * Class18.anInt_167) - 1.0F;
            float var11 = (float)var7 * 2.0F / (float)(Class18.anInt_141 * -141378483) - 1.0F;
            var5.method4558(var10, var11, -1.0F, Class18.aFloatArray_177);
            float var12 = Class18.aFloatArray_177[0] / Class18.aFloatArray_177[3];
            float var13 = Class18.aFloatArray_177[1] / Class18.aFloatArray_177[3];
            float var14 = Class18.aFloatArray_177[2] / Class18.aFloatArray_177[3];
            var5.method4558(var10, var11, 1.0F, Class18.aFloatArray_177);
            float var15 = Class18.aFloatArray_177[0] / Class18.aFloatArray_177[3];
            float var16 = Class18.aFloatArray_177[1] / Class18.aFloatArray_177[3];
            float var17 = Class18.aFloatArray_177[2] / Class18.aFloatArray_177[3];
            float var18 = Class288.method3698(var12, var13, var14, var15, var16, var17, 4, (byte)31);
            if(var18 > 0.0F) {
               float var19 = var15 - var12;
               float var20 = var17 - var14;
               var21 = (int)(var12 + var19 * var18);
               textColour = (int)(var18 * var20 + var14);
               boundX = var21 + (Class521.myPlayer.method3257() - 1 << 8) >> 9;
               boundY = textColour + (Class521.myPlayer.method3257() - 1 << 8) >> 9;
               byte var23 = Class521.myPlayer.plane;
               if(var23 < 3 && (client.aClass296_348.method3753().aByteArrayArrayArray_4768[1][var21 >> 9][textColour >> 9] & 2) != 0) {
                  var60 = var23 + 1;
               }
            }

            if(boundX != -1 && -1 != boundY) {
               if(client.aBoolean_463 && (1458447745 * Class286.anInt_4823 & 64) != 0) {
                  RSInterface var46 = DrawingTarget.method2201(2036107931 * Class283_Sub3.anInt_7897, -315969483 * client.anInt_543, (byte)70);
                  if(null != var46) {
                     Class343.genAndAddOption(client.selectedOption, " " + Class8.optionPointer + " ", CacheFileID.anInt_2037 * -1863856065, 59, -1, 0L, boundX, boundY, true, false, (long)(boundX << 32 | boundY), true, (byte)98);
                  } else {
                     Class537.method6073(-967343347);
                  }
               } else {
                  if(Class349.aBoolean_6618) {
                     Class343.genAndAddOption(ServerString.faceHereStr.getText(Class599.clientLanguage, 1295150653), "", -1, 60, -1, 0L, boundX, boundY, true, false, (long)(boundX << 32 | boundY), true, (byte)42);
                  }

                  Class343.genAndAddOption(Class343.walkHereString, "", 277013513 * client.anInt_453, 23, -1, 0L, boundX, boundY, true, false, (long)(boundX << 32 | boundY), true, (byte)80);
               }
            }
         }

         Class636 var28 = client.aClass296_348.getWorldObjects().aClass636_4518;
         boundY = var1;
         int var35 = var2;
         List var38 = var28.aList_10102;
         Iterator var40 = var38.iterator();

         while(var40.hasNext()) {
            Class268 var39 = (Class268)var40.next();
            if((client.aBoolean_309 || var39.aClass563_Sub1_4643.plane == Class521.myPlayer.plane) && var39.method3529(var0, boundY, var35, (byte)16)) {
               boolean var42 = false;
               boolean var44 = false;
               int y;
               int x;
               if(var39.aClass563_Sub1_4643 instanceof PositionEntity) {
                  x = ((PositionEntity)var39.aClass563_Sub1_4643).locX;
                  y = ((PositionEntity)var39.aClass563_Sub1_4643).locY;
               } else {
                  GameCoord var32 = var39.aClass563_Sub1_4643.method6203().gameCoord;
                  x = (int)var32.floatX >> 9;
                  y = (int)var32.floatZ >> 9;
               }

               int var25;
               GameCoord var24;
               int var27;
               int var26;
               int var30;
               int py;
               int px;
               if(var39.aClass563_Sub1_4643 instanceof Player) {
                  Player player = (Player)var39.aClass563_Sub1_4643;
                  var30 = player.method3257();
                  GameCoord var49 = player.method6203().gameCoord;
                  if(0 == (var30 & 1) && 0 == ((int)var49.floatX & 511) && ((int)var49.floatZ & 511) == 0 || 1 == (var30 & 1) && ((int)var49.floatX & 511) == 256 && ((int)var49.floatZ & 511) == 256) {
                     px = (int)var49.floatX - (player.method3257() - 1 << 8);
                     py = (int)var49.floatZ - (player.method3257() - 1 << 8);

                     for(var21 = 0; var21 < client.availableNPCS * 1636714459; ++var21) {
                        Class240_Sub9 var54 = (Class240_Sub9)client.npcNodeList.getNode((long)client.npcIndices[var21]);
                        if(var54 != null) {
                           NPC var66 = (NPC)var54.anObject_6783;
                           if(742390115 * var66.anInt_4298 != -1025618511 * client.timer && var66.aBoolean_4296) {
                              var24 = var66.method6203().gameCoord;
                              var25 = (int)var24.floatX - (-1792142631 * var66.npcComposite.anInt_8665 - 1 << 8);
                              var26 = (int)var24.floatZ - (var66.npcComposite.anInt_8665 * -1792142631 - 1 << 8);
                              if(var25 >= px && var66.npcComposite.anInt_8665 * -1792142631 <= player.method3257() - (var25 - px >> 9) && var26 >= py && var66.npcComposite.anInt_8665 * -1792142631 <= player.method3257() - (var26 - py >> 9)) {
                                 Class397.addToOptionList(var66, var39.aClass563_Sub1_4643.plane != Class521.myPlayer.plane, (byte)127);
                                 var66.anInt_4298 = client.timer * 359207643;
                              }
                           }
                        }
                     }

                     var21 = -688404505 * Class15.availablePlayers;
                     int[] var57 = Class15.playersIndices;

                     for(var60 = 0; var60 < var21; ++var60) {
                        Player var67 = client.aPlayerArray[var57[var60]];
                        if(null != var67 && 742390115 * var67.anInt_4298 != client.timer * -1025618511 && player != var67 && var67.aBoolean_4296) {
                           GameCoord var64 = var67.method6203().gameCoord;
                           var26 = (int)var64.floatX - (var67.method3257() - 1 << 8);
                           var27 = (int)var64.floatZ - (var67.method3257() - 1 << 8);
                           if(var26 >= px && var67.method3257() <= player.method3257() - (var26 - px >> 9) && var27 >= py && var67.method3257() <= player.method3257() - (var27 - py >> 9)) {
                              Class104_Sub16.addPlayerToOptionsList(var67, Class521.myPlayer.plane != var39.aClass563_Sub1_4643.plane, (byte)-119);
                              var67.anInt_4298 = client.timer * 359207643;
                           }
                        }
                     }
                  }

                  if(742390115 * player.anInt_4298 == -1025618511 * client.timer) {
                     continue;
                  }

                  Class104_Sub16.addPlayerToOptionsList(player, Class521.myPlayer.plane != var39.aClass563_Sub1_4643.plane, (byte)-72);
                  player.anInt_4298 = 359207643 * client.timer;
               }

               int var68;
               if(var39.aClass563_Sub1_4643 instanceof NPC) {
                  NPC var29 = (NPC)var39.aClass563_Sub1_4643;
                  if(var29.npcComposite != null) {
                     GameCoord var37 = var29.method6203().gameCoord;
                     if((var29.npcComposite.anInt_8665 * -1792142631 & 1) == 0 && ((int)var37.floatX & 511) == 0 && 0 == ((int)var37.floatZ & 511) || (-1792142631 * var29.npcComposite.anInt_8665 & 1) == 1 && ((int)var37.floatX & 511) == 256 && ((int)var37.floatZ & 511) == 256) {
                        int var48 = (int)var37.floatX - (var29.npcComposite.anInt_8665 * -1792142631 - 1 << 8);
                        px = (int)var37.floatZ - (-1792142631 * var29.npcComposite.anInt_8665 - 1 << 8);

                        for(py = 0; py < 1636714459 * client.availableNPCS; ++py) {
                           Class240_Sub9 var53 = (Class240_Sub9)client.npcNodeList.getNode((long)client.npcIndices[py]);
                           if(var53 != null) {
                              NPC npc = (NPC)var53.anObject_6783;
                              if(client.timer * -1025618511 != 742390115 * npc.anInt_4298 && npc != var29 && npc.aBoolean_4296) {
                                 GameCoord var69 = npc.method6203().gameCoord;
                                 var68 = (int)var69.floatX - (npc.npcComposite.anInt_8665 * -1792142631 - 1 << 8);
                                 var25 = (int)var69.floatZ - (npc.npcComposite.anInt_8665 * -1792142631 - 1 << 8);
                                 if(var68 >= var48 && npc.npcComposite.anInt_8665 * -1792142631 <= -1792142631 * var29.npcComposite.anInt_8665 - (var68 - var48 >> 9) && var25 >= px && -1792142631 * npc.npcComposite.anInt_8665 <= -1792142631 * var29.npcComposite.anInt_8665 - (var25 - px >> 9)) {
                                    Class397.addToOptionList(npc, Class521.myPlayer.plane != var39.aClass563_Sub1_4643.plane, (byte)94);
                                    npc.anInt_4298 = client.timer * 359207643;
                                 }
                              }
                           }
                        }

                        py = Class15.availablePlayers * -688404505;
                        int[] var56 = Class15.playersIndices;

                        for(textColour = 0; textColour < py; ++textColour) {
                           Player var62 = client.aPlayerArray[var56[textColour]];
                           if(null != var62 && var62.anInt_4298 * 742390115 != client.timer * -1025618511 && var62.aBoolean_4296) {
                              var24 = var62.method6203().gameCoord;
                              var25 = (int)var24.floatX - (var62.method3257() - 1 << 8);
                              var26 = (int)var24.floatZ - (var62.method3257() - 1 << 8);
                              if(var25 >= var48 && var62.method3257() <= var29.npcComposite.anInt_8665 * -1792142631 - (var25 - var48 >> 9) && var26 >= px && var62.method3257() <= var29.npcComposite.anInt_8665 * -1792142631 - (var26 - px >> 9)) {
                                 Class104_Sub16.addPlayerToOptionsList(var62, var39.aClass563_Sub1_4643.plane != Class521.myPlayer.plane, (byte)-10);
                                 var62.anInt_4298 = client.timer * 359207643;
                              }
                           }
                        }
                     }

                     if(-1025618511 * client.timer == var29.anInt_4298 * 742390115) {
                        continue;
                     }

                     Class397.addToOptionList(var29, var39.aClass563_Sub1_4643.plane != Class521.myPlayer.plane, (byte)85);
                     var29.anInt_4298 = client.timer * 359207643;
                  }
               }

               if(var39.aClass563_Sub1_4643 instanceof Class563_Sub1_Sub2_Sub1) {
                  int var31 = var4.loadedMapX * 1265321541 + x;
                  var30 = y + var4.loadedMapY * -1996781083;
                  Class240_Sub25 var47 = (Class240_Sub25)client.groundItems.getNode((long)(var39.aClass563_Sub1_4643.plane << 28 | var30 << 14 | var31));
                  if(var47 != null) {
                     px = 0;

                     for(Class240_Sub36 var61 = (Class240_Sub36)var47.itemList.method5788(1650788872); null != var61; ++px) {
                        ObjectDescriptor var59 = Class592.cacheObjectLoader.getObjectDescriptor(var61.id * 1665912711);
                        if(var59.aBoolean_8509) {
                           textColour = -758091811 * var59.textColour;
                        } else if(var59.inBank) {
                           textColour = Class268.aClass586_4646.bankItemColour * 1315363165;
                        } else {
                           textColour = 543830729 * Class268.aClass586_4646.dropItemTextColour;
                        }

                        if(client.aBoolean_463 && Class521.myPlayer.plane == var39.aClass563_Sub1_4643.plane) {
                           Class476 var63 = 323906445 * Class508.anInt_9143 != -1?Class240_Sub1.aClass465_6506.method5610(323906445 * Class508.anInt_9143, 478549010):null;
                           if(0 != (1458447745 * Class286.anInt_4823 & 1) && (var63 == null || var59.method5476(Class508.anInt_9143 * 323906445, -80630797 * var63.anInt_8739, (byte)-109) != -80630797 * var63.anInt_8739)) {
                              Class343.genAndAddOption(client.selectedOption, client.aString_467 + " " + Class8.optionPointer + " " + Class133.addTextColour(textColour, (byte)6) + var59.name, CacheFileID.anInt_2037 * -1863856065, 17, -1, (long)(var61.id * 1665912711), x, y, true, false, (long)px, false, (byte)121);
                           }
                        }

                        if(var39.aClass563_Sub1_4643.plane == Class521.myPlayer.plane) {
                           String[] options = var59.screenOptions;

                           for(var68 = options.length - 1; var68 >= 0; --var68) {
                              if(null != options[var68]) {
                                 short var70 = 0;
                                 var26 = client.anInt_461 * 609801685;
                                 if(var68 == 0) {
                                    var70 = 18;
                                 }

                                 if(var68 == 1) {
                                    var70 = 19;
                                 }

                                 if(var68 == 2) {
                                    var70 = 20;
                                 }

                                 if(var68 == 3) {
                                    var70 = 21;
                                 }

                                 if(var68 == 4) {
                                    var70 = 22;
                                 }

                                 if(5 == var68) {
                                    var70 = 1004;
                                 }

                                 var27 = var59.method5477(var68, 519845263);
                                 if(-1 != var27) {
                                    var26 = var27;
                                 }

                                 Class343.genAndAddOption(options[var68], Class133.addTextColour(textColour, (byte)6) + var59.name, var26, var70, -1, (long)(1665912711 * var61.id), x, y, true, false, (long)px, false, (byte)73);
                              }
                           }
                        }

                        var61 = (Class240_Sub36)var47.itemList.method5790((byte)-121);
                     }
                  }
               }

               if(var39.aClass563_Sub1_4643 instanceof Class218) {
                  Class218 var36 = (Class218)var39.aClass563_Sub1_4643;
                  Class534 var34 = client.aClass296_348.method3755(-526563769).method6015(var36.method2723((byte)-71), (byte)1);
                  if(var34.anIntArray_9415 != null) {
                     var34 = var34.method6048(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, 1162979012);
                  }

                  if(var34 != null) {
                     if(client.aBoolean_463 && var39.aClass563_Sub1_4643.plane == Class521.myPlayer.plane) {
                        Class476 var45 = 323906445 * Class508.anInt_9143 != -1?Class240_Sub1.aClass465_6506.method5610(Class508.anInt_9143 * 323906445, -1599046124):null;
                        if(0 != (1458447745 * Class286.anInt_4823 & 4) && (null == var45 || var34.method6054(323906445 * Class508.anInt_9143, -80630797 * var45.anInt_8739, -1588198307) != var45.anInt_8739 * -80630797)) {
                           Class343.genAndAddOption(client.selectedOption, client.aString_467 + " " + Class8.optionPointer + " " + Class133.addTextColour('\uffff', (byte)6) + var34.name, CacheFileID.anInt_2037 * -1863856065, 2, -1, Class459.method5569(var36, x, y, -1467016176), x, y, true, false, (long)var36.hashCode(), false, (byte)41);
                        }
                     }

                     if(var39.aClass563_Sub1_4643.plane == Class521.myPlayer.plane) {
                        String[] var51 = var34.screenOptions;
                        if(var51 != null) {
                           for(px = var51.length - 1; px >= 0; --px) {
                              if(var51[px] != null) {
                                 short var55 = 0;
                                 var21 = client.anInt_461 * 609801685;
                                 if(0 == px) {
                                    var55 = 3;
                                 }

                                 if(px == 1) {
                                    var55 = 4;
                                 }

                                 if(px == 2) {
                                    var55 = 5;
                                 }

                                 if(px == 3) {
                                    var55 = 6;
                                 }

                                 if(px == 4) {
                                    var55 = 1001;
                                 }

                                 if(px == 5) {
                                    var55 = 1002;
                                 }

                                 textColour = var34.method6055(px, (byte)-126);
                                 if(-1 != textColour) {
                                    var21 = textColour;
                                 }

                                 Class343.genAndAddOption(var51[px], Class133.addTextColour('\uffff', (byte)6) + var34.name, var21, var55, -1, Class459.method5569(var36, x, y, -1335017538), x, y, true, false, (long)var36.hashCode(), false, (byte)72);
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

   static final void method224(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 551013685 * var3.anInt_2475;
   }
}
