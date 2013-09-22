
public class Class29 {

   int anInt_802;
   static final Class29 aClass29_803 = new Class29(1);
   static final Class29 aClass29_804 = new Class29(2);
   static final Class29 aClass29_805 = new Class29(0);
   public static int canvasWidth;


   Class29(int var1) {
      this.anInt_802 = -1506561493 * var1;
   }

   static void method212(int var0) {
      if(Class17.aRenderer_139 != null) {
         Class17.aRenderer_139.method1939(-1500363801);
         Class17.aRenderer_139 = null;
         Class17.aTextRenderer_140 = null;
      }

   }

   static final boolean method213(char var0, int var1) {
      if(Character.isISOControl(var0)) {
         return false;
      } else if(Class111.method1423(var0, 2038449495)) {
         return true;
      } else {
         char[] var2 = Class435.aCharArray_8369;

         int var3;
         char var4;
         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if(var0 == var4) {
               return true;
            }
         }

         var2 = Class435.aCharArray_8371;

         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if(var4 == var0) {
               return true;
            }
         }

         return false;
      }
   }

   static final void drawPlayerHeadData(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      int availablePlayers = Class15.availablePlayers * -688404505;
      int[] playerIndices = Class15.playersIndices;
      client.chatMessagesCount = 0;
      int totalCharacters;
      if(1 == client.anInt_356 * 415041591) {
         totalCharacters = Class95.aClass100Array_1894.length;
      } else {
         totalCharacters = availablePlayers + client.availableNPCS * 1636714459;
      }

      int var10;
      int var21;
      int var23;
      int var82;
      int var93;
      int var92;
      int var95;
      int midHeight;
      int var103;
      for(var10 = 0; var10 < totalCharacters; ++var10) {
         NPCComposite var11 = null;
         Object target;
         if(client.anInt_356 * 415041591 == 1) {
            Class100 var12 = Class95.aClass100Array_1894[var10];
            if(!var12.aBoolean_1952) {
               continue;
            }

            target = var12.getTarget((byte)78);
            if(838393341 * client.anInt_409 != -1211843651 * ((RSCharacter)target).anInt_4294) {
               continue;
            }

            if(-2057490183 * var12.anInt_1955 >= 0) {
               var11 = ((NPC)target).npcComposite;
               if(var11.anIntArray_8642 != null) {
                  var11 = var11.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-115);
                  if(var11 == null) {
                     continue;
                  }
               }
            }
         } else {
            if(var10 < availablePlayers) {
               target = client.aPlayerArray[playerIndices[var10]];
            } else {
               target = (RSCharacter)((Class240_Sub9)client.npcNodeList.getNode((long)client.npcIndices[var10 - availablePlayers])).anObject_6783;
               var11 = ((NPC)target).npcComposite;
               if(var11.anIntArray_8642 != null) {
                  var11 = var11.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)0);
                  if(null == var11) {
                     continue;
                  }
               }
            }

            if(-1825240475 * ((RSCharacter)target).anInt_4299 < 0 || ((RSCharacter)target).anInt_4294 * -1211843651 != client.anInt_409 * 838393341 && Class521.myPlayer.plane != ((RSCharacter)target).plane) {
               continue;
            }
         }

         RSInterfaceGroup.method1438((Class563_Sub1)target, ((RSCharacter)target).getHeight(), -429863735);
         if(client.calculatedPosition[0] >= 0.0F) {
            if(((RSCharacter)target).method3279((short)3226)) {
               ScreenCharText var81 = ((RSCharacter)target).getRecentChatMessage((short)-331);
               if(var81 != null && client.chatMessagesCount * 1614327463 < client.maxChatMessagesVisible * 1119990587) {
                  client.anIntArray_440[1614327463 * client.chatMessagesCount] = Class1.aRSFont_11.method5566(var81.method3924((byte)-45), 108616681) / 2;
                  client.chatMessagesX[client.chatMessagesCount * 1614327463] = (int)client.calculatedPosition[0];
                  client.chatMessagesY[1614327463 * client.chatMessagesCount] = (int)client.calculatedPosition[1];
                  client.screenChatArray[1614327463 * client.chatMessagesCount] = var81;
                  client.chatMessagesCount += 613816599;
               }
            }

            var82 = (int)((float)var1 + client.calculatedPosition[1]);
            var82 -= 915612327 * Class1.aRSFont_11.anInt_8573;
            boolean var14 = false;
            Sprite var20;
            int var28;
            if(!((RSCharacter)target).aBoolean_4296 && !((RSCharacter)target).aClass512_4311.method5932(-2006114617)) {
               for(Class231_Sub5 var15 = (Class231_Sub5)((RSCharacter)target).aClass512_4311.method5930((byte)-1); var15 != null; var15 = (Class231_Sub5)((RSCharacter)target).aClass512_4311.method5933(-1870171547)) {
                  Class231_Sub1 var16 = var15.method5325(client.timer * -1025618511, -1479551);
                  if(var16 != null) {
                     Class234 var17 = var15.aClass234_8268;
                     Player player = client.aPlayerArray[playerIndices[var10]];
                     Sprite sprite;
                     if(player != null && player.aBoolean_1458) {
                        sprite = var17.method3007(Class286.gameRenderer, 1369061384);
                        var20 = var17.method3006(Class286.gameRenderer, (byte)-4);
                     } else {
                        sprite = var17.method3009(Class286.gameRenderer, 2120221956);
                        var20 = var17.method3010(Class286.gameRenderer, (byte)40);
                     }

                     if(null != sprite && null != var20) {
                        var21 = 255;
                        boolean var22 = true;
                        var23 = client.timer * -1025618511 - var16.anInt_4050 * 217841173;
                        int var24 = var20.getWidth() * -321621809 * var16.anInt_4049 / 255;
                        int var25;
                        int var26;
                        if(-1342399607 * var16.anInt_4051 > var23) {
                           var25 = 1142041425 * var17.anInt_4012 == 0?0:var23 / (1142041425 * var17.anInt_4012) * 1142041425 * var17.anInt_4012;
                           var26 = var20.getWidth() * 429829407 * var16.anInt_4048 / 255;
                           midHeight = (var24 - var26) * var25 / (-1342399607 * var16.anInt_4051) + var26;
                        } else {
                           midHeight = var24;
                           var25 = var17.anInt_4010 * 1118610621 + var16.anInt_4051 * -1342399607 - var23;
                           if(var17.anInt_4014 * 597452477 >= 0) {
                              var21 = (var25 << 8) / (var17.anInt_4010 * 1118610621 - var17.anInt_4014 * 597452477);
                           }
                        }

                        if(var16.anInt_4049 * -321621809 > 0 && midHeight < 2) {
                           midHeight = 2;
                        }

                        var25 = sprite.getHeight();
                        var26 = (int)(client.calculatedPosition[0] + (float)var0 - (float)(sprite.getWidth() >> 1));
                        var82 -= var25;
                        if(var21 >= 0 && var21 < 255) {
                           int var27 = var21 << 24;
                           var28 = var27 | 16777215;
                           sprite.drawAt(var26, var82, 0, var28, 1);
                           Class286.gameRenderer.method1911(var26, var82, var26 + midHeight, var25 + var82);
                           var20.drawAt(var26, var82, 0, var28, 1);
                        } else {
                           sprite.drawAt(var26, var82);
                           Class286.gameRenderer.method1911(var26, var82, midHeight + var26, var82 + var25);
                           var20.drawAt(var26, var82);
                        }

                        Class286.gameRenderer.method1965(var0, var1, var2 + var0, var3 + var1);
                        var82 -= 2;
                        var14 = true;
                     }
                  } else if(var15.method5326(1982635261)) {
                     var15.method2931(-1097355623);
                  }
               }
            }

            if(!var14) {
               var82 -= 2 + -2059976549 * Class571.aClass587_9651.anInt_9749;
            }

            if(!((RSCharacter)target).aBoolean_4296) {
               if(null == var11) {
                  Player var91 = (Player)target;
                  Sprite var87;
                  if(var91.pkIconIndex * 387341897 != -1) {
                     var87 = Class1.headPKIcons[387341897 * var91.pkIconIndex];
                     var82 -= var87.getHeight();
                     var87.drawAt((int)(client.calculatedPosition[0] + (float)var0 - 12.0F), var82);
                     var82 -= 2;
                  }

                  if(-1517122695 * var91.currentPrayer != -1) {
                     var87 = Class540_Sub13.prayIconSprites[var91.currentPrayer * -1517122695];
                     var82 -= var87.getHeight();
                     var87.drawAt((int)((float)var0 + client.calculatedPosition[0] - 12.0F), var82);
                     var82 -= 2;
                  }
               } else if(1150744933 * var11.anInt_8639 >= 0 && 1150744933 * var11.anInt_8639 < Class540_Sub13.prayIconSprites.length) {
                  Sprite var89 = Class540_Sub13.prayIconSprites[var11.anInt_8639 * 1150744933];
                  var82 -= var89.getHeight();
                  var89.drawAt((int)((float)var0 + client.calculatedPosition[0] - (float)(var89.getWidth() >> 1)), var82);
                  var82 -= 2;
               }
            }

            int var10000;
            HintMarker[] var94;
            int heighest;
            HintMarker var100;
            if(target instanceof Player) {
               if(var10 >= 0) {
                  heighest = 0;
                  var94 = client.hintMarkers;

                  for(var93 = 0; var93 < var94.length; ++var93) {
                     var100 = var94[var93];
                     if(null != var100 && 10 == var100.anInt_3702 * -2076198275 && playerIndices[var10] == var100.markerTarget * -1369728825) {
                        var20 = Class240_Sub22_Sub16.hintHeadIconsSprites[var100.spriteIndex * -611466427];
                        if(var20.getHeight() > heighest) {
                           heighest = var20.getHeight();
                        }

                        var20.drawAt((int)((float)var0 + client.calculatedPosition[0] - 12.0F), var82 - var20.getHeight());
                     }
                  }

                  if(heighest > 0) {
                     var10000 = var82 - (heighest + 2);
                  }
               }
            } else {
               heighest = 0;
               var94 = client.hintMarkers;

               for(var93 = 0; var93 < var94.length; ++var93) {
                  var100 = var94[var93];
                  if(var100 != null && var100.anInt_3702 * -2076198275 == 1 && client.npcIndices[var10 - availablePlayers] == -1369728825 * var100.markerTarget) {
                     var20 = Class240_Sub22_Sub16.hintHeadIconsSprites[-611466427 * var100.spriteIndex];
                     if(var20.getHeight() > heighest) {
                        heighest = var20.getHeight();
                     }

                     boolean var97;
                     if(0 == 594759329 * var100.anInt_3706) {
                        var97 = true;
                     } else {
                        var21 = Class340.method4204((byte)20) * 1000 / (594759329 * var100.anInt_3706) / 2;
                        var97 = client.timer * -1025618511 % (2 * var21) < var21;
                     }

                     if(var97) {
                        var20.drawAt((int)((float)var0 + client.calculatedPosition[0] - 12.0F), var82 - var20.getHeight());
                     }
                  }
               }

               if(heighest > 0) {
                  var10000 = var82 - (heighest + 2);
               }
            }

            for(heighest = 0; heighest < 1658638923 * Class571.aClass587_9651.anInt_9762; ++heighest) {
               var92 = ((RSCharacter)target).damageTimeStamps[heighest];
               var93 = ((RSCharacter)target).damageTypeIDs[heighest];
               DamageSprite damage = null;
               var103 = 0;
               if(var93 >= 0) {
                  if(var92 <= client.timer * -1025618511) {
                     continue;
                  }

                  damage = Class578.damageAnimeLoader.loadSprite(((RSCharacter)target).damageTypeIDs[heighest], -1882400681);
                  var103 = damage.duration * 1582752667;
               } else if(var92 < 0) {
                  continue;
               }

               var95 = ((RSCharacter)target).anIntArray_4309[heighest];
               DamageSprite damageSprite = null;
               if(var95 >= 0) {
                  damageSprite = Class578.damageAnimeLoader.loadSprite(var95, -1136249153);
               }

               if(var92 - var103 <= client.timer * -1025618511) {
                  if(null == damage) {
                     ((RSCharacter)target).damageTimeStamps[heighest] = -1;
                  } else {
                     midHeight = ((RSCharacter)target).getHeight() / 2;
                     RSInterfaceGroup.method1438((Class563_Sub1)target, midHeight, 80049590);
                     if(client.calculatedPosition[0] > -1.0F) {
                        client.calculatedPosition[0] += (float)Class571.aClass587_9651.damageX[heighest];
                        client.calculatedPosition[1] += (float)Class571.aClass587_9651.damageY[heighest];
                        Sprite var106 = null;
                        Sprite var105 = null;
                        Sprite var107 = null;
                        Sprite var108 = null;
                        var28 = 0;
                        int var29 = 0;
                        int var30 = 0;
                        int var31 = 0;
                        int var32 = 0;
                        int var33 = 0;
                        int var34 = 0;
                        int var35 = 0;
                        Sprite var36 = null;
                        Sprite var37 = null;
                        Sprite var38 = null;
                        Sprite var39 = null;
                        int var40 = 0;
                        int var41 = 0;
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        var106 = damage.method6521(Class286.gameRenderer, (byte)-49);
                        if(var106 != null) {
                           var28 = var106.getWidth();
                           var106.exportDimensions(client.anIntArray_594);
                           var32 = client.anIntArray_594[0];
                        }

                        var105 = damage.method6524(Class286.gameRenderer, (byte)-35);
                        if(var105 != null) {
                           var29 = var105.getWidth();
                           var105.exportDimensions(client.anIntArray_594);
                           var33 = client.anIntArray_594[0];
                        }

                        var107 = damage.method6523(Class286.gameRenderer, (byte)119);
                        if(null != var107) {
                           var30 = var107.getWidth();
                           var107.exportDimensions(client.anIntArray_594);
                           var34 = client.anIntArray_594[0];
                        }

                        var108 = damage.method6528(Class286.gameRenderer, (byte)7);
                        if(null != var108) {
                           var31 = var108.getWidth();
                           var108.exportDimensions(client.anIntArray_594);
                           var35 = client.anIntArray_594[0];
                        }

                        if(damageSprite != null) {
                           var36 = damageSprite.method6521(Class286.gameRenderer, (byte)28);
                           if(null != var36) {
                              var40 = var36.getWidth();
                              var36.exportDimensions(client.anIntArray_594);
                              var44 = client.anIntArray_594[0];
                           }

                           var37 = damageSprite.method6524(Class286.gameRenderer, (byte)-91);
                           if(null != var37) {
                              var41 = var37.getWidth();
                              var37.exportDimensions(client.anIntArray_594);
                              var45 = client.anIntArray_594[0];
                           }

                           var38 = damageSprite.method6523(Class286.gameRenderer, (byte)97);
                           if(null != var38) {
                              var42 = var38.getWidth();
                              var38.exportDimensions(client.anIntArray_594);
                              var46 = client.anIntArray_594[0];
                           }

                           var39 = damageSprite.method6528(Class286.gameRenderer, (byte)7);
                           if(null != var39) {
                              var43 = var39.getWidth();
                              var39.exportDimensions(client.anIntArray_594);
                              var47 = client.anIntArray_594[0];
                           }
                        }

                        FontRenderer var48 = Class585.aTextRenderer_9728;
                        FontRenderer var49 = Class585.aTextRenderer_9728;
                        RSFont var50 = FriendPlayer.aRSFont_55;
                        RSFont var51 = FriendPlayer.aRSFont_55;
                        int var52 = 606786109 * damage.anInt_9931;
                        RSFont var54;
                        FontRenderer fontRenderer;
                        if(var52 >= 0) {
                           fontRenderer = (FontRenderer)Class368.aFontUnpacker_6922.method4139(client.aClass339_284, var52, true, damage.aBoolean_9921, -220205365);
                           var54 = Class368.aFontUnpacker_6922.method4135(client.aClass339_284, var52, -1770659824);
                           if(null != fontRenderer && var54 != null) {
                              var48 = fontRenderer;
                              var50 = var54;
                           }
                        }

                        if(damageSprite != null) {
                           var52 = damageSprite.anInt_9931 * 606786109;
                           if(var52 >= 0) {
                              fontRenderer = (FontRenderer)Class368.aFontUnpacker_6922.method4139(client.aClass339_284, var52, true, damageSprite.aBoolean_9921, -1717376741);
                              var54 = Class368.aFontUnpacker_6922.method4135(client.aClass339_284, var52, -1764196465);
                              if(fontRenderer != null && var54 != null) {
                                 var49 = fontRenderer;
                                 var51 = var54;
                              }
                           }
                        }

                        fontRenderer = null;
                        String var111 = null;
                        boolean var55 = false;
                        int var56 = 0;
                        String damageStr = damage.method6526(((RSCharacter)target).damageArray[heighest], -1545547153);
                        int damageWidth = var50.method5566(damageStr, 525407940);
                        if(damageSprite != null) {
                           var111 = damageSprite.method6526(((RSCharacter)target).anIntArray_4310[heighest], -513331375);
                           var56 = var51.method5566(var111, -730167609);
                        }

                        int var57 = 0;
                        int var58 = 0;
                        if(var29 > 0) {
                           var57 = 1 + damageWidth / var29;
                        }

                        if(damageSprite != null && var41 > 0) {
                           var58 = var56 / var41 + 1;
                        }

                        int var59 = 0;
                        int var60 = var59;
                        if(var28 > 0) {
                           var59 += var28;
                        }

                        var59 += 2;
                        int var61 = var59;
                        if(var30 > 0) {
                           var59 += var30;
                        }

                        int var62 = var59;
                        int var63 = var59;
                        int var64;
                        if(var29 > 0) {
                           var64 = var29 * var57;
                           var59 += var64;
                           var63 += (var64 - damageWidth) / 2;
                        } else {
                           var59 += damageWidth;
                        }

                        var64 = var59;
                        if(var31 > 0) {
                           var59 += var31;
                        }

                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70;
                        if(null != damageSprite) {
                           var59 += 2;
                           var65 = var59;
                           if(var40 > 0) {
                              var59 += var40;
                           }

                           var59 += 2;
                           var66 = var59;
                           if(var42 > 0) {
                              var59 += var42;
                           }

                           var67 = var59;
                           var69 = var59;
                           if(var41 > 0) {
                              var70 = var58 * var41;
                              var59 += var70;
                              var69 += (var70 - var56) / 2;
                           } else {
                              var59 += var56;
                           }

                           var68 = var59;
                           if(var43 > 0) {
                              var59 += var43;
                           }
                        }

                        var70 = ((RSCharacter)target).damageTimeStamps[heighest] - -1025618511 * client.timer;
                        int var71 = 290528907 * damage.anInt_9922 - 290528907 * damage.anInt_9922 * var70 / (1582752667 * damage.duration);
                        int var72 = var70 * damage.anInt_9930 * 1861885361 / (1582752667 * damage.duration) + -(1861885361 * damage.anInt_9930);
                        int var73 = (int)(client.calculatedPosition[0] + (float)var0 - (float)(var59 >> 1) + (float)var71);
                        int var74 = (int)((float)var1 + client.calculatedPosition[1] - 12.0F + (float)var72);
                        int var75 = damage.anInt_9920 * -553897525 + 15 + var74;
                        int var76 = 0;
                        if(null != damageSprite) {
                           var76 = 15 + var74 + damageSprite.anInt_9920 * -553897525;
                        }

                        int var77 = 255;
                        if(damage.anInt_9927 * 1296158273 >= 0) {
                           var77 = (var70 << 8) / (1582752667 * damage.duration - 1296158273 * damage.anInt_9927);
                        }

                        int var78;
                        if(var77 >= 0 && var77 < 255) {
                           var78 = var77 << 24;
                           int var79 = var78 | 16777215;
                           if(var106 != null) {
                              var106.drawAt(var73 + var60 - var32, var74, 0, var79, 1);
                           }

                           if(null != var107) {
                              var107.drawAt(var73 + var61 - var34, var74, 0, var79, 1);
                           }

                           int var80;
                           if(var105 != null) {
                              for(var80 = 0; var80 < var57; ++var80) {
                                 var105.drawAt(var62 + var73 - var33 + var80 * var29, var74, 0, var79, 1);
                              }
                           }

                           if(null != var108) {
                              var108.drawAt(var64 + var73 - var35, var74, 0, var79, 1);
                           }

                           var48.renderText(damageStr, var63 + var73, var75, damage.anInt_9923 * 2062910863 | var78, 0, -790912102);
                           if(damageSprite != null) {
                              if(var36 != null) {
                                 var36.drawAt(var73 + var65 - var44, var74, 0, var79, 1);
                              }

                              if(var38 != null) {
                                 var38.drawAt(var73 + var66 - var46, var74, 0, var79, 1);
                              }

                              if(null != var37) {
                                 for(var80 = 0; var80 < var58; ++var80) {
                                    var37.drawAt(var73 + var67 - var45 + var80 * var41, var74, 0, var79, 1);
                                 }
                              }

                              if(var39 != null) {
                                 var39.drawAt(var73 + var68 - var47, var74, 0, var79, 1);
                              }

                              var49.renderText(var111, var69 + var73, var76, damageSprite.anInt_9923 * 2062910863 | var78, 0, 1370230230);
                           }
                        } else {
                           if(var106 != null) {
                              var106.drawAt(var60 + var73 - var32, var74);
                           }

                           if(null != var107) {
                              var107.drawAt(var61 + var73 - var34, var74);
                           }

                           if(var105 != null) {
                              for(var78 = 0; var78 < var57; ++var78) {
                                 var105.drawAt(var29 * var78 + (var62 + var73 - var33), var74);
                              }
                           }

                           if(var108 != null) {
                              var108.drawAt(var73 + var64 - var35, var74);
                           }

                           var48.renderText(damageStr, var73 + var63, var75, 2062910863 * damage.anInt_9923 | -16777216, 0, -1097982826);
                           if(null != damageSprite) {
                              if(var36 != null) {
                                 var36.drawAt(var73 + var65 - var44, var74);
                              }

                              if(null != var38) {
                                 var38.drawAt(var66 + var73 - var46, var74);
                              }

                              if(null != var37) {
                                 for(var78 = 0; var78 < var58; ++var78) {
                                    var37.drawAt(var73 + var67 - var45 + var41 * var78, var74);
                                 }
                              }

                              if(null != var39) {
                                 var39.drawAt(var73 + var68 - var47, var74);
                              }

                              var49.renderText(var111, var69 + var73, var76, damageSprite.anInt_9923 * 2062910863 | -16777216, 0, 579207771);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      int var86;
      for(var10 = 0; var10 < -1311811361 * client.anInt_412; ++var10) {
         var86 = client.anIntArray_410[var10];
         Object var84;
         if(var86 < 2048) {
            var84 = client.aPlayerArray[var86];
         } else {
            var84 = (RSCharacter)((Class240_Sub9)client.npcNodeList.getNode((long)(var86 - 2048))).anObject_6783;
         }

         var82 = client.anIntArray_411[var10];
         Object var85;
         if(var82 < 2048) {
            var85 = client.aPlayerArray[var82];
         } else {
            var85 = (RSCharacter)((Class240_Sub9)client.npcNodeList.getNode((long)(var82 - 2048))).anObject_6783;
         }

         Class23.method148((RSCharacter)var84, (RSCharacter)var85, (((RSCharacter)var84).anInt_4344 -= 2089708377) * 313863401, var0, var1, var2, var3, var4, var5, (byte)70);
      }

      var10 = Class1.aRSFont_11.anInt_8573 * 915612327 + Class1.aRSFont_11.anInt_8571 * 2080531379 + 2;

      for(var86 = 0; var86 < client.chatMessagesCount * 1614327463; ++var86) {
         int var83 = client.chatMessagesX[var86];
         var82 = client.chatMessagesY[var86];
         int var90 = client.anIntArray_440[var86];
         boolean var98 = true;

         while(var98) {
            var98 = false;

            for(var92 = 0; var92 < var86; ++var92) {
               if(2 + var82 > client.chatMessagesY[var92] - var10 && var82 - var10 < 2 + client.chatMessagesY[var92] && var83 - var90 < client.anIntArray_440[var92] + client.chatMessagesX[var92] && var83 + var90 > client.chatMessagesX[var92] - client.anIntArray_440[var92] && client.chatMessagesY[var92] - var10 < var82) {
                  var82 = client.chatMessagesY[var92] - var10;
                  var98 = true;
               }
            }
         }

         client.chatMessagesY[var86] = var82;
         String var96 = client.screenChatArray[var86].method3924((byte)-25);
         if(0 == client.anInt_470 * 1659306691) {
            var93 = 16776960;
            int var104 = client.screenChatArray[var86].method3925(-941419065);
            if(var104 < 6) {
               var93 = client.anIntArray_536[var104];
            }

            if(6 == var104) {
               var93 = 838393341 * client.anInt_409 % 20 < 10?16711680:16776960;
            }

            if(var104 == 7) {
               var93 = 838393341 * client.anInt_409 % 20 < 10?255:'\uffff';
            }

            if(8 == var104) {
               var93 = client.anInt_409 * 838393341 % 20 < 10?'\ub000':8454016;
            }

            if(9 == var104) {
               var103 = 150 - client.screenChatArray[var86].method3928(558071152) * 150 / client.screenChatArray[var86].method3927(884292779);
               if(var103 < 50) {
                  var93 = var103 * 1280 + 16711680;
               } else if(var103 < 100) {
                  var93 = 16776960 - (var103 - 50) * 327680;
               } else if(var103 < 150) {
                  var93 = (var103 - 100) * 5 + '\uff00';
               }
            }

            if(10 == var104) {
               var103 = 150 - client.screenChatArray[var86].method3928(494022901) * 150 / client.screenChatArray[var86].method3927(884292779);
               if(var103 < 50) {
                  var93 = 16711680 + 5 * var103;
               } else if(var103 < 100) {
                  var93 = 16711935 - (var103 - 50) * 327680;
               } else if(var103 < 150) {
                  var93 = (var103 - 100) * 327680 + 255 - (var103 - 100) * 5;
               }
            }

            if(var104 == 11) {
               var103 = 150 - client.screenChatArray[var86].method3928(1185675629) * 150 / client.screenChatArray[var86].method3927(884292779);
               if(var103 < 50) {
                  var93 = 16777215 - 327685 * var103;
               } else if(var103 < 100) {
                  var93 = '\uff00' + 327685 * (var103 - 50);
               } else if(var103 < 150) {
                  var93 = 16777215 - (var103 - 100) * 327680;
               }
            }

            var103 = var93 | -16777216;
            var95 = client.screenChatArray[var86].method3926((byte)8);
            if(var95 == 0) {
               MouseHandler.aTextRenderer_6379.method1063(var96, var83 + var0, var1 + var82, var103, -16777216, (short)14822);
            }

            if(var95 == 1) {
               MouseHandler.aTextRenderer_6379.method1065(var96, var83 + var0, var1 + var82, var103, -16777216, 838393341 * client.anInt_409, 697308715);
            }

            if(2 == var95) {
               MouseHandler.aTextRenderer_6379.method1066(var96, var0 + var83, var1 + var82, var103, -16777216, client.anInt_409 * 838393341, -2043586037);
            }

            if(3 == var95) {
               var21 = 150 - client.screenChatArray[var86].method3928(1726492003) * 150 / client.screenChatArray[var86].method3927(884292779);
               MouseHandler.aTextRenderer_6379.method1067(var96, var83 + var0, var1 + var82, var103, -16777216, client.anInt_409 * 838393341, var21, (short)20654);
            }

            if(4 == var95) {
               var21 = 150 - client.screenChatArray[var86].method3928(961284371) * 150 / client.screenChatArray[var86].method3927(884292779);
               midHeight = var21 * (Class1.aRSFont_11.method5566(var96, 1291096622) + 100) / 150;
               Class286.gameRenderer.method1911(var0 + var83 - 50, var1, var0 + var83 + 50, var3 + var1);
               MouseHandler.aTextRenderer_6379.renderText(var96, var0 + var83 + 50 - midHeight, var1 + var82, var103, -16777216, 1248609123);
               Class286.gameRenderer.method1965(var0, var1, var2 + var0, var1 + var3);
            }

            if(5 == var95) {
               var21 = 150 - client.screenChatArray[var86].method3928(757661590) * 150 / client.screenChatArray[var86].method3927(884292779);
               midHeight = 0;
               if(var21 < 25) {
                  midHeight = var21 - 25;
               } else if(var21 > 125) {
                  midHeight = var21 - 125;
               }

               var23 = 915612327 * Class1.aRSFont_11.anInt_8573 + Class1.aRSFont_11.anInt_8571 * 2080531379;
               Class286.gameRenderer.method1911(var0, var82 + var1 - var23 - 1, var0 + var2, 5 + var82 + var1);
               MouseHandler.aTextRenderer_6379.method1063(var96, var83 + var0, midHeight + var1 + var82, var103, -16777216, (short)3844);
               Class286.gameRenderer.method1965(var0, var1, var2 + var0, var1 + var3);
            }
         } else {
            MouseHandler.aTextRenderer_6379.method1063(var96, var0 + var83, var82 + var1, -256, -16777216, (short)-9234);
         }
      }

   }

   public static final int method215(String var0, int var1) {
      if(null == var0) {
         return -1;
      } else {
         for(int var2 = 0; var2 < client.friendsCount * -1301826725; ++var2) {
            if(var0.equalsIgnoreCase(client.friendsList[var2].aString_51)) {
               return var2;
            }
         }

         return -1;
      }
   }

   static final void method216(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class220.method2772(var3, var4, var0, -2020255976);
   }
}
