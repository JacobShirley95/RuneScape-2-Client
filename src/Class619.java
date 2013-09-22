import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class619 implements Class617 {

   final int[] anIntArray_10017;
   static short aShort_10018;
   public static int anInt_10019;


   public boolean method6609(AbstractMouseNode var1, Class233[] var2, int var3, AbstractKeyboardHandler var4, int var5) {
      int[] var6 = this.anIntArray_10017;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         int var8 = var6[var7];
         if(!var4.method3208(var8, 1953407658)) {
            return false;
         }
      }

      return true;
   }

   Class619(int[] var1) {
      this.anIntArray_10017 = var1;
   }

   static final void method6621(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.hoverOutline * -213540263;
   }

   static final void method6622(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -297012993 * var0.aClass68_9508.anInt_1286;
   }

   public static final void method6623(RSInterface[] var0, int id, int var2, int var3, int var4, int var5, int offsetX, int offsetY, int var8, boolean var9, int var10) {
      Class286.gameRenderer.method1965(var2, var3, var4, var5);

      for(int var11 = 0; var11 < var0.length; ++var11) {
         RSInterface rsInterface = var0[var11];
         if(rsInterface != null && (id == -671235497 * rsInterface.parentID || id == -1412584499 && rsInterface == client.aClass132_523)) {
            int var13;
            if(var8 == -1) {
               client.aRectangleArray_527[client.anInt_386 * -396228463].setBounds(-1500060803 * rsInterface.X1 + offsetX, offsetY + rsInterface.Y1 * 980798721, rsInterface.width * -533669195, rsInterface.height * 1833812087);
               var13 = (client.anInt_386 += -965560207) * -396228463 - 1;
            } else {
               var13 = var8;
            }

            rsInterface.anInt_2590 = -1092317947 * var13;
            rsInterface.anInt_2591 = client.timer * 303649929;
            if(!client.method179(rsInterface)) {
               if(rsInterface.type * 691513007 != 0) {
                  Class212_Sub1.method5504(rsInterface, 1472701669);
               }

               int x = offsetX + rsInterface.X1 * -1500060803;
               int y = rsInterface.Y1 * 980798721 + offsetY;
               int outline = rsInterface.hoverOutline * -213540263;
               if(client.aBoolean_365 && (client.method174(rsInterface).anInt_7693 * -1992444447 != 0 || 0 == rsInterface.index * 1916189739) && outline > 127) {
                  outline = 127;
               }

               int globalOffsetX;
               int globalOffsetY;
               if(client.aClass132_523 == rsInterface) {
                  if(id != -1412584499 && (RSInterface.anInt_2547 * 1428164041 == rsInterface.anInt_2429 * -1050043351 || rsInterface.anInt_2429 * -1050043351 == -300174805 * RSInterface.anInt_2588 || client.method174(rsInterface).method4996((byte)58) && rsInterface.anInt_2429 * -1050043351 != RSInterface.anInt_2404 * 143732427)) {
                     Class505.aClass132Array_9124 = var0;
                     Class104_Sub3.anInt_4145 = offsetX * -1022690531;
                     Class282.anInt_4779 = -1666578423 * offsetY;
                     continue;
                  }

                  if(client.aBoolean_553 && client.aBoolean_484) {
                     globalOffsetX = Class53.captureMouseList.getCaptureMouseX();
                     globalOffsetY = Class53.captureMouseList.getCaptureMouseY();
                     globalOffsetX -= 2142788233 * client.anInt_481;
                     globalOffsetY -= client.anInt_287 * -1094686129;
                     if(globalOffsetX < client.anInt_485 * 1573328167) {
                        globalOffsetX = 1573328167 * client.anInt_485;
                     }

                     if(rsInterface.width * -533669195 + globalOffsetX > client.anInt_487 * 519726181 + 1573328167 * client.anInt_485) {
                        globalOffsetX = 519726181 * client.anInt_487 + client.anInt_485 * 1573328167 - rsInterface.width * -533669195;
                     }

                     if(globalOffsetY < -794559981 * client.anInt_486) {
                        globalOffsetY = client.anInt_486 * -794559981;
                     }

                     if(rsInterface.height * 1833812087 + globalOffsetY > client.anInt_456 * 1105352345 + client.anInt_486 * -794559981) {
                        globalOffsetY = client.anInt_486 * -794559981 + 1105352345 * client.anInt_456 - rsInterface.height * 1833812087;
                     }

                     if(client.method174(rsInterface).method4996((byte)102)) {
                        Class172.method2175(globalOffsetX, globalOffsetY, -533669195 * rsInterface.width, 1833812087 * rsInterface.height, (byte)-71);
                     }

                     if(RSInterface.anInt_2404 * 143732427 != rsInterface.anInt_2429 * -1050043351) {
                        x = globalOffsetX;
                        y = globalOffsetY;
                     }
                  }

                  if(-300174805 * RSInterface.anInt_2588 == rsInterface.anInt_2429 * -1050043351) {
                     outline = 128;
                  }
               }

               int var19;
               int var21;
               int var20;
               int var22;
               if(rsInterface.index * 1916189739 == 2) {
                  globalOffsetX = var2;
                  globalOffsetY = var3;
                  var19 = var4;
                  var20 = var5;
               } else {
                  var21 = -533669195 * rsInterface.width + x;
                  var22 = y + rsInterface.height * 1833812087;
                  if(9 == rsInterface.index * 1916189739) {
                     ++var21;
                     ++var22;
                  }

                  globalOffsetX = x > var2?x:var2;
                  globalOffsetY = y > var3?y:var3;
                  var19 = var21 < var4?var21:var4;
                  var20 = var22 < var5?var22:var5;
               }

               if(globalOffsetX < var19 && globalOffsetY < var20) {
                  if(rsInterface.type * 691513007 != 0) {
                     if(RSInterface.anInt_2536 * 221269325 == rsInterface.type * 691513007 || 691513007 * rsInterface.type == -5877375 * RSInterface.anInt_2407) {
                        if(client.aBoolean_572) {
                           Class286.gameRenderer.method1933();
                           Class585.method6356(x, y, -533669195 * rsInterface.width, 1833812087 * rsInterface.height, 691513007 * rsInterface.type == -5877375 * RSInterface.anInt_2407, (byte)-30);
                           Class548.method6108(var13, globalOffsetX, globalOffsetY, var19, var20, x, y, (byte)0);
                           Class286.gameRenderer.method1908();
                           Class286.gameRenderer.method1965(var2, var3, var4, var5);
                           client.aBooleanArray_525[var13] = true;
                        }
                        continue;
                     }

                     if(1592443827 * RSInterface.anInt_2576 == rsInterface.type * 691513007 && 415041591 * client.anInt_356 == 4) {
                        if(5 != rsInterface.index * 1916189739 || rsInterface.method1712(Class286.gameRenderer, 1272478299) != null) {
                           Class417.method5179((byte)24);
                           Class563_Sub1_Sub4_Sub6.method5348(Class286.gameRenderer, rsInterface, x, y, 954121087);
                           Class286.gameRenderer.method1965(var2, var3, var4, var5);
                        }
                        continue;
                     }

                     if(-1353186863 * RSInterface.anInt_2408 == rsInterface.type * 691513007) {
                        RSWorld.method4394(Class286.gameRenderer, x, y, rsInterface, (byte)1);
                        continue;
                     }

                     if(RSInterface.anInt_2551 * -140214135 == rsInterface.type * 691513007) {
                        Class566.method6237(Class286.gameRenderer, x, y, rsInterface, 1975898755 * rsInterface.outlineColour % 64, 1299549387);
                        continue;
                     }

                     if(691513007 * rsInterface.type == 316794669 * RSInterface.anInt_2409) {
                        if(rsInterface.method1712(Class286.gameRenderer, 1272478299) != null) {
                           Class286.gameRenderer.method1933();
                           Class601.method6498(rsInterface, x, y, -1662974521);
                           Class286.gameRenderer.method1965(var2, var3, var4, var5);
                        }
                        continue;
                     }

                     if(-942072551 * RSInterface.worldMapInterface == 691513007 * rsInterface.type) {
                        Class558.loadWorldMap(Class286.gameRenderer, FontRenderer_Sub3.aClass163_10701, x, y, rsInterface.width * -533669195, 1833812087 * rsInterface.height, (byte)-104);
                        client.aBooleanArray_525[var13] = true;
                        Class286.gameRenderer.method1965(var2, var3, var4, var5);
                        continue;
                     }

                     if(691513007 * rsInterface.type == -2058031703 * RSInterface.anInt_2411) {
                        Class110.method1415(Class286.gameRenderer, x, y, -533669195 * rsInterface.width, 1833812087 * rsInterface.height, (byte)86);
                        client.aBooleanArray_525[var13] = true;
                        Class286.gameRenderer.method1965(var2, var3, var4, var5);
                        continue;
                     }

                     if(857672251 * RSInterface.anInt_2550 == 691513007 * rsInterface.type) {
                        if(client.fpsToggle || client.aBoolean_303) {
                           Class583.showFPSInfo(x, y, rsInterface, (byte)1);
                           client.aBooleanArray_525[var13] = true;
                        }
                        continue;
                     }
                  }

                  int var23;
                  int colour;
                  int var24;
                  if(0 == 1916189739 * rsInterface.index) {
                     if(691513007 * rsInterface.type == RSInterface.anInt_2557 * 244050241 && Class286.gameRenderer.method1989()) {
                        Class286.gameRenderer.method1887(0, 0, Class29.canvasWidth * 1111410531, -75607525 * Class597.canvasHeight);
                     }

                     method6623(var0, rsInterface.cacheID * 1278853609, globalOffsetX, globalOffsetY, var19, var20, x - rsInterface.scrollX * -340277309, y - -978526293 * rsInterface.scrollY, var13, var9, -199054677);
                     if(null != rsInterface.children) {
                        method6623(rsInterface.children, rsInterface.cacheID * 1278853609, globalOffsetX, globalOffsetY, var19, var20, x - rsInterface.scrollX * -340277309, y - -978526293 * rsInterface.scrollY, var13, var9, -2144685157);
                     }

                     Class240_Sub16 var33 = (Class240_Sub16)client.widgets.getNode((long)(1278853609 * rsInterface.cacheID));
                     if(var33 != null) {
                        Class84.method1100(1320796941 * var33.widgetID, globalOffsetX, globalOffsetY, var19, var20, x - -340277309 * rsInterface.scrollX, y - -978526293 * rsInterface.scrollY, var13, (byte)11);
                     }

                     if(RSInterface.anInt_2557 * 244050241 == rsInterface.type * 691513007) {
                        if(Class286.gameRenderer.method1989()) {
                           Class286.gameRenderer.method1973();
                        }

                        if(client.anInt_356 * 415041591 == 1) {
                           var22 = -1404876287 * client.anInt_272;
                           var23 = client.anInt_364 * 814931909;
                           var24 = 639909579 * client.anInt_545;
                           colour = -412469715 * client.anInt_366;
                           if(-1025618511 * client.timer < client.anInt_575 * 1997131775) {
                              float var26 = 1.0F * (float)(-1025618511 * client.timer - client.anInt_331 * 1808115297) / (float)(1997131775 * client.anInt_575 - client.anInt_331 * 1808115297);
                              var22 = (int)((float)(-1404876287 * client.anInt_272) * var26 + (1.0F - var26) * (float)(710866535 * Class172.anInt_3041));
                              var23 = (int)((1.0F - var26) * (float)(RendererInfo.anInt_3079 * -398137979) + (float)(client.anInt_364 * 814931909) * var26);
                              var24 = (int)(var26 * (float)(client.anInt_545 * 639909579) + (float)(1989390049 * RSCharacter.anInt_4356) * (1.0F - var26));
                              colour = (int)((1.0F - var26) * (float)(Class540_Sub11.anInt_2385 * -1965238379) + var26 * (float)(client.anInt_366 * -412469715));
                           }

                           if(var22 > 0) {
                              Class286.gameRenderer.method1915(globalOffsetX, globalOffsetY, var19 - globalOffsetX, var20 - globalOffsetY, var22 << 24 | var23 << 16 | var24 << 8 | colour, (byte)-48);
                           }
                        }
                     }

                     Class286.gameRenderer.method1965(var2, var3, var4, var5);
                  }

                  if(client.aBooleanArray_362[var13] || -83453209 * client.anInt_528 > 1) {
                     if(3 == rsInterface.index * 1916189739) {
                        if(outline == 0) {
                           if(rsInterface.aBoolean) {
                              Class286.gameRenderer.drawOutline(x, y, rsInterface.width * -533669195, 1833812087 * rsInterface.height, -16777216 | rsInterface.outlineColour * 1975898755, 0);
                           } else {
                              Class286.gameRenderer.method1920(x, y, -533669195 * rsInterface.width, 1833812087 * rsInterface.height, -16777216 | 1975898755 * rsInterface.outlineColour, 0);
                           }
                        } else if(rsInterface.aBoolean) {
                           Class286.gameRenderer.drawOutline(x, y, -533669195 * rsInterface.width, rsInterface.height * 1833812087, 255 - (outline & 255) << 24 | 1975898755 * rsInterface.outlineColour & 16777215, 1);
                        } else {
                           Class286.gameRenderer.method1920(x, y, rsInterface.width * -533669195, 1833812087 * rsInterface.height, 255 - (outline & 255) << 24 | rsInterface.outlineColour * 1975898755 & 16777215, 1);
                        }
                     } else if(1916189739 * rsInterface.index == 4) {
                        var21 = 255 - (outline & 255);
                        if(0 != var21) {
                           FontRenderer fontRenderer = rsInterface.method1706(Class368.aFontUnpacker_6922, client.aClass339_284, 2097698676);
                           if(null == fontRenderer) {
                              if(RSInterface.aBoolean_2424) {
                                 Class110_Sub1.method3149(rsInterface, 319301752);
                              }
                           } else {
                              var23 = rsInterface.outlineColour * 1975898755;
                              String title = rsInterface.title;
                              if(2142376247 * rsInterface.itemID != -1) {
                                 ObjectDescriptor item = Class592.cacheObjectLoader.getObjectDescriptor(rsInterface.itemID * 2142376247);
                                 title = item.name;
                                 if(title == null) {
                                    title = "null";
                                 }

                                 if((1279665793 * item.anInt_8467 == 1 || 1 != 736448653 * rsInterface.itemAmount) && -1 != rsInterface.itemAmount * 736448653) {
                                    title = Class133.addTextColour(16748608, (byte)6) + title + Class8.colCloser + " x" + AbstractMouseHandler.method3110(736448653 * rsInterface.itemAmount, 1658175575);
                                 }
                              }

                              if(-1 != rsInterface.anInt_2482 * -1190550869) {
                                 title = Class612.method6574(rsInterface.anInt_2482 * -1190550869, 345671962);
                                 if(title == null) {
                                    title = "";
                                 }
                              }

                              if(client.aClass132_335 == rsInterface) {
                                 title = ServerString.pleaseWaitStr.getText(Class599.clientLanguage, 1159472653);
                                 var23 = rsInterface.outlineColour * 1975898755;
                              }

                              if(client.aBoolean_478) {
                                 Class286.gameRenderer.method1911(x, y, x + rsInterface.width * -533669195, rsInterface.height * 1833812087 + y);
                              }

                              var21 <<= 24;
                              if(rsInterface.aBoolean_2503) {
                                 fontRenderer.method1072(title, x, y, rsInterface.width * -533669195, rsInterface.height * 1833812087, var21 | var23, rsInterface.aBoolean_2501?var21:-1, rsInterface.anInt_2499 * -483687327, rsInterface.anInt_2500 * 233250407, client.aRandom_383, -324359965 * ServerInputStream.anInt_4375, client.anIntArray_529, Class481.nameIconsSprites, (int[])null, -1786305877);
                              } else {
                                 fontRenderer.method1064(title, x, y, -533669195 * rsInterface.width, rsInterface.height * 1833812087, var21 | var23, rsInterface.aBoolean_2501?var21:-1, rsInterface.anInt_2499 * -483687327, rsInterface.anInt_2500 * 233250407, 956409315 * rsInterface.anInt_2435, rsInterface.anInt_2525 * 1962525011, Class481.nameIconsSprites, (int[])null, (Class1024)null, 0, 0, 426169958);
                              }

                              if(client.aBoolean_478) {
                                 Class286.gameRenderer.method1965(var2, var3, var4, var5);
                              }
                           }
                        }
                     } else {
                        int var27;
                        int var29;
                        int var30;
                        if(5 == 1916189739 * rsInterface.index) {
                           if(rsInterface.anInt_2513 * 1948781599 >= 0) {
                              rsInterface.method1709(Class585.aClass236_9731, Class598.aClass44_9877, 677573914).method3690(Class286.gameRenderer, 0, x, y, -533669195 * rsInterface.width, rsInterface.height * 1833812087, rsInterface.anInt_2401 * 2005608829 << 3, 876131391 * rsInterface.anInt_2512 << 3, 0, 0, -524177841);
                           } else {
                              Sprite sprite;
                              if(-1 != rsInterface.itemID * 2142376247) {
                                 PlayerComposite var36 = rsInterface.isWorn?Class521.myPlayer.composite:null;
                                 sprite = Class592.cacheObjectLoader.getInvSprite(Class286.gameRenderer, rsInterface.itemID * 2142376247, 736448653 * rsInterface.itemAmount, rsInterface.anInt_2463 * 83469535, -16777216 | -61088611 * rsInterface.anInt_2464, rsInterface.anInt_2564 * -353582865, var36, 126504330);
                              } else if(rsInterface.anInt_2482 * -1190550869 != -1) {
                                 sprite = Class4.method20(Class286.gameRenderer, -1190550869 * rsInterface.anInt_2482, (byte)-7);
                              } else {
                                 sprite = rsInterface.getSprite(Class286.gameRenderer, '\u8078');
                              }

                              if(null != sprite) {
                                 var22 = sprite.getFurthestX();
                                 var23 = sprite.getFurthestY();
                                 var24 = 255 - (outline & 255);
                                 if(var24 != 0) {
                                    if(-1 == 1975898755 * rsInterface.outlineColour) {
                                       colour = 16777215;
                                    } else {
                                       colour = rsInterface.outlineColour * 1975898755 & 16777215;
                                       if(colour == 0) {
                                          colour = 16777215;
                                       }
                                    }

                                    colour |= var24 << 24;
                                    boolean var44 = colour != -1;
                                    if(!rsInterface.aBoolean_2472) {
                                       if(var44) {
                                          if(-1111653847 * rsInterface.anInt_2437 != 0) {
                                             sprite.drawWithOutline((float)(rsInterface.width * -533669195) / 2.0F + (float)x, (float)y + (float)(1833812087 * rsInterface.height) / 2.0F, 229330944 * rsInterface.width / var22, rsInterface.anInt_2437 * -1111653847, 0, colour, 1);
                                          } else if(-533669195 * rsInterface.width == var22 && rsInterface.height * 1833812087 == var23) {
                                             sprite.drawAt(x, y, 0, colour, 1);
                                          } else {
                                             sprite.method2130(x, y, -533669195 * rsInterface.width, rsInterface.height * 1833812087, 0, colour, 1);
                                          }
                                       } else if(0 != rsInterface.anInt_2437 * -1111653847) {
                                          sprite.method2148((float)x + (float)(-533669195 * rsInterface.width) / 2.0F, (float)y + (float)(rsInterface.height * 1833812087) / 2.0F, (float)var22 / 2.0F, (float)var23 / 2.0F, 229330944 * rsInterface.width / var22, rsInterface.height * -603492352 / var23, rsInterface.anInt_2437 * -1111653847, 1, -1, 1);
                                       } else if(rsInterface.width * -533669195 == var22 && 1833812087 * rsInterface.height == var23) {
                                          sprite.drawAt(x, y);
                                       } else {
                                          sprite.method2145(x, y, -533669195 * rsInterface.width, 1833812087 * rsInterface.height);
                                       }
                                    } else {
                                       Class286.gameRenderer.method1911(x, y, -533669195 * rsInterface.width + x, 1833812087 * rsInterface.height + y);
                                       if(-1111653847 * rsInterface.anInt_2437 != 0) {
                                          var27 = (rsInterface.width * -533669195 + (var22 - 1)) / var22;
                                          int var39 = (1833812087 * rsInterface.height + (var23 - 1)) / var23;

                                          for(var29 = 0; var29 < var27; ++var29) {
                                             for(var30 = 0; var30 < var39; ++var30) {
                                                if(var44) {
                                                   sprite.drawWithOutline((float)var22 / 2.0F + (float)(x + var22 * var29), (float)var23 / 2.0F + (float)(var23 * var30 + y), 4096, -1111653847 * rsInterface.anInt_2437, 0, colour, 1);
                                                } else {
                                                   sprite.rotateDraw((float)(var22 * var29 + x) + (float)var22 / 2.0F, (float)var23 / 2.0F + (float)(y + var23 * var30), 4096, rsInterface.anInt_2437 * -1111653847);
                                                }
                                             }
                                          }
                                       } else if(var44) {
                                          sprite.method2147(x, y, -533669195 * rsInterface.width, rsInterface.height * 1833812087, 0, colour, 1);
                                       } else {
                                          sprite.method2131(x, y, rsInterface.width * -533669195, 1833812087 * rsInterface.height);
                                       }

                                       Class286.gameRenderer.method1965(var2, var3, var4, var5);
                                    }
                                 }
                              } else if(RSInterface.aBoolean_2424) {
                                 Class110_Sub1.method3149(rsInterface, 336542259);
                              }
                           }
                        } else if(rsInterface.index * 1916189739 == 6) {
                           Class286.gameRenderer.method1933();
                           client.aClass296_348.method3754(-520750275).method6385(-1442271036);
                           Model model = null;
                           var22 = 2048;
                           if(rsInterface.anInt_2537 * 410107133 != 0) {
                              var22 |= 524288;
                           }

                           var23 = 0;
                           if(rsInterface.itemID * 2142376247 != -1) {
                              ObjectDescriptor var40 = Class592.cacheObjectLoader.getObjectDescriptor(2142376247 * rsInterface.itemID);
                              if(var40 != null) {
                                 var40 = var40.method5469(736448653 * rsInterface.itemAmount, 949077867);
                                 model = var40.method5468(Class286.gameRenderer, var22, 1, rsInterface.isWorn?Class521.myPlayer.composite:null, rsInterface.aClass507_2578, 0, 0, 0, 0, 720436822);
                                 if(model != null) {
                                    var23 = -model.method2041() >> 1;
                                 } else {
                                    Class110_Sub1.method3149(rsInterface, 1292003479);
                                 }
                              }
                           } else {
                              Player player;
                              if(rsInterface.anInt_2469 * -28225993 == 3) {
                                 var24 = 1007149995 * rsInterface.anInt_2416;
                                 if(var24 >= 0 && var24 < 2048) {
                                    player = client.aPlayerArray[var24];
                                    if(null != player && (var24 == -719726693 * client.anInt_438 || Class370.method4696(player.playerName, (byte)-51) == 1068245823 * rsInterface.anInt_2426)) {
                                       model = rsInterface.method1708(Class286.gameRenderer, var22, RandomAccessFileNode.aClass255_9018, Class598.aClass71_9878, Class104_Sub6.characterUnpacker, Class592.cacheObjectLoader, Class88.animeUnpacker, Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, rsInterface.aClass507_2578, player.composite, 2122658583);
                                       if(model == null && RSInterface.aBoolean_2424) {
                                          Class110_Sub1.method3149(rsInterface, 38909596);
                                       }
                                    }
                                 }
                              } else if(5 == -28225993 * rsInterface.anInt_2469) {
                                 var24 = 1007149995 * rsInterface.anInt_2416;
                                 player = null;
                                 if(var24 >= 0 && var24 < 2048) {
                                    player = client.aPlayerArray[var24];
                                 } else if(var24 == -1) {
                                    player = Class521.myPlayer;
                                 }

                                 if(player != null && null != player.composite && (var24 == -1 || var24 == -719726693 * client.anInt_438 || Class370.method4696(player.playerName, (byte)77) == rsInterface.anInt_2426 * 1068245823)) {
                                    model = player.composite.getModel(Class286.gameRenderer, var22, RandomAccessFileNode.aClass255_9018, Class598.aClass71_9878, Class104_Sub6.characterUnpacker, Class592.cacheObjectLoader, Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, rsInterface.aClass507_2578, (Animator)null, (Animator[])null, (int[])null, 0, true, Class286.aClass592_4822, -87982456);
                                 }
                              } else if(8 != rsInterface.anInt_2469 * -28225993 && -28225993 * rsInterface.anInt_2469 != 9) {
                                 if(rsInterface.aClass507_2578 != null && rsInterface.aClass507_2578.isAnimating(1673796646)) {
                                    model = rsInterface.method1708(Class286.gameRenderer, var22, RandomAccessFileNode.aClass255_9018, Class598.aClass71_9878, Class104_Sub6.characterUnpacker, Class592.cacheObjectLoader, Class88.animeUnpacker, Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, rsInterface.aClass507_2578, Class521.myPlayer.composite, 1503026719);
                                    if(null == model && RSInterface.aBoolean_2424) {
                                       Class110_Sub1.method3149(rsInterface, -690290723);
                                    }
                                 } else {
                                    model = rsInterface.method1708(Class286.gameRenderer, var22, RandomAccessFileNode.aClass255_9018, Class598.aClass71_9878, Class104_Sub6.characterUnpacker, Class592.cacheObjectLoader, Class88.animeUnpacker, Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (Animator)null, Class521.myPlayer.composite, 1444525499);
                                    if(model == null && RSInterface.aBoolean_2424) {
                                       Class110_Sub1.method3149(rsInterface, 434379537);
                                    }
                                 }
                              } else {
                                 Class240_Sub46 var37 = Class416.method5153(rsInterface.anInt_2416 * 1007149995, false, (byte)-89);
                                 if(null != var37) {
                                    model = var37.method4980(Class286.gameRenderer, var22, rsInterface.aClass507_2578, rsInterface.anInt_2426 * 1068245823, rsInterface.anInt_2469 * -28225993 == 9, rsInterface.isWorn?Class521.myPlayer.composite:null, 1200777610);
                                 }
                              }
                           }

                           if(model != null) {
                              if(rsInterface.anInt_2537 * 410107133 != 0) {
                                 model.method2049(998193285 * rsInterface.anInt_2491, rsInterface.anInt_2480 * -809808773, rsInterface.anInt_2493 * -132515953, rsInterface.anInt_2537 * 410107133);
                              }

                              if(rsInterface.anInt_2415 * -1386908629 > 0) {
                                 var24 = (-533669195 * rsInterface.width << 9) / (rsInterface.anInt_2415 * -1386908629);
                              } else {
                                 var24 = 512;
                              }

                              if(rsInterface.anInt_2483 * 1456666029 > 0) {
                                 colour = (rsInterface.height * 1833812087 << 9) / (rsInterface.anInt_2483 * 1456666029);
                              } else {
                                 colour = 512;
                              }

                              int midX = x + rsInterface.width * -533669195 / 2;
                              var27 = rsInterface.height * 1833812087 / 2 + y;
                              if(!rsInterface.aBoolean_2559) {
                                 midX += var24 * 551752181 * rsInterface.anInt_2478 >> 9;
                                 var27 += rsInterface.anInt_2479 * 1274405631 * colour >> 9;
                              }

                              client.gameViewport.init();
                              Class286.gameRenderer.setViewport(client.gameViewport);
                              ArrayViewport var28 = Class286.gameRenderer.method1936();
                              var29 = client.aClass296_348.method3778(-1345717429);
                              var30 = client.aClass296_348.method3780(709161939);
                              var30 += -1760962491 * rsInterface.anInt_2486;
                              if(rsInterface.aBoolean_2484) {
                                 if(2 == 1735950531 * Class509.anInt_9182) {
                                    if(rsInterface.aBoolean_2559) {
                                       var28.method4578((float)midX, (float)var27, (float)var24, (float)colour, Class542.aClass43_Sub1_9475.method381((byte)-27), Class542.aClass43_Sub1_9475.method382((short)-27383), (float)(1111410531 * Class29.canvasWidth), (float)(Class597.canvasHeight * -75607525), (float)(rsInterface.anInt_2486 * -1760962491));
                                    } else {
                                       var28.method4578((float)midX, (float)var27, (float)var24, (float)colour, Class542.aClass43_Sub1_9475.method381((byte)-59), Class542.aClass43_Sub1_9475.method382((short)-3398), (float)(1111410531 * Class29.canvasWidth), (float)(Class597.canvasHeight * -75607525), (float)(rsInterface.anInt_2486 * -1760962491 << 2));
                                    }
                                 } else if(rsInterface.aBoolean_2559) {
                                    var28.method4578((float)midX, (float)var27, (float)var24, (float)colour, (float)var29, (float)var30, (float)(Class29.canvasWidth * 1111410531), (float)(Class597.canvasHeight * -75607525), (float)(rsInterface.anInt_2486 * -1760962491));
                                 } else {
                                    var28.method4578((float)midX, (float)var27, (float)var24, (float)colour, (float)var29, (float)var30, (float)(Class29.canvasWidth * 1111410531), (float)(-75607525 * Class597.canvasHeight), (float)(-1760962491 * rsInterface.anInt_2486 << 2));
                                 }
                              } else if(2 == 1735950531 * Class509.anInt_9182) {
                                 var28.method4563((float)midX, (float)var27, (float)var24, (float)colour, Class542.aClass43_Sub1_9475.method381((byte)-16), Class542.aClass43_Sub1_9475.method382((short)-5337), (float)(Class29.canvasWidth * 1111410531), (float)(Class597.canvasHeight * -75607525));
                              } else {
                                 var28.method4563((float)midX, (float)var27, (float)var24, (float)colour, (float)var29, (float)var30, (float)(Class29.canvasWidth * 1111410531), (float)(Class597.canvasHeight * -75607525));
                              }

                              Class286.gameRenderer.method1946(var28);
                              Class286.gameRenderer.method1977(2, 0);
                              if(rsInterface.aBoolean_2485) {
                                 Class286.gameRenderer.enableZBuffering(false);
                              }

                              if(rsInterface.aBoolean_2559) {
                                 client.aViewport_580.rotate(1.0F, 0.0F, 0.0F, Class362.toRadians(551013685 * rsInterface.anInt_2475));
                                 client.aViewport_580.method4630(0.0F, 1.0F, 0.0F, Class362.toRadians(-894621809 * rsInterface.anInt_2476));
                                 client.aViewport_580.method4630(0.0F, 0.0F, 1.0F, Class362.toRadians(rsInterface.anInt_2522 * -1330397373));
                                 client.aViewport_580.setOffset((float)(rsInterface.anInt_2478 * 551752181), (float)(rsInterface.anInt_2479 * 1274405631), (float)(rsInterface.anInt_2494 * 1505487409));
                              } else {
                                 int var31 = Class362.cosArray[551013685 * rsInterface.anInt_2475 << 3] * (rsInterface.anInt_2486 * -1760962491 << 2) >> 14;
                                 int var32 = Class362.sinArray[551013685 * rsInterface.anInt_2475 << 3] * (-1760962491 * rsInterface.anInt_2486 << 2) >> 14;
                                 client.aViewport_580.rotate(0.0F, 0.0F, 1.0F, Class362.toRadians(-(rsInterface.anInt_2522 * -1330397373) << 3));
                                 client.aViewport_580.method4630(0.0F, 1.0F, 0.0F, Class362.toRadians(rsInterface.anInt_2476 * -894621809 << 3));
                                 client.aViewport_580.setOffset((float)(rsInterface.anInt_2473 * 1074478051 << 2), (float)(var23 + (1062321687 * rsInterface.anInt_2569 << 2) + var31), (float)(var32 + (rsInterface.anInt_2569 * 1062321687 << 2)));
                                 client.aViewport_580.method4630(1.0F, 0.0F, 0.0F, Class362.toRadians(551013685 * rsInterface.anInt_2475 << 3));
                              }

                              rsInterface.method1720(Class286.gameRenderer, model, client.aViewport_580, client.timer * -1025618511, -1759776062);
                              Class286.gameRenderer.method1912(true);
                              Class286.gameRenderer.method1965(var2, var3, var4, var5);
                              if(client.aBoolean_478) {
                                 Class286.gameRenderer.method1911(x, y, x + rsInterface.width * -533669195, y + 1833812087 * rsInterface.height);
                              }

                              model.method2069(client.aViewport_580, (Class92)null, 1);
                              if(!rsInterface.aBoolean_2484 && null != rsInterface.aClass594_2471) {
                                 Class286.gameRenderer.method1944(rsInterface.aClass594_2471.method6437());
                              }

                              if(client.aBoolean_478) {
                                 Class286.gameRenderer.method1965(var2, var3, var4, var5);
                              }

                              Class286.gameRenderer.method1912(false);
                              Class286.gameRenderer.method1967();
                              Class286.gameRenderer.method1965(var2, var3, var4, var5);
                              if(rsInterface.aBoolean_2485) {
                                 Class286.gameRenderer.enableZBuffering(true);
                              }
                           }
                        } else if(9 == 1916189739 * rsInterface.index) {
                           if(rsInterface.aBoolean_2459) {
                              var21 = x;
                              var22 = y + 1833812087 * rsInterface.height;
                              var23 = x + rsInterface.width * -533669195;
                              var24 = y;
                           } else {
                              var21 = x;
                              var22 = y;
                              var23 = x + -533669195 * rsInterface.width;
                              var24 = y + rsInterface.height * 1833812087;
                           }

                           if(709084421 * rsInterface.anInt_2458 == 1) {
                              Class286.gameRenderer.method1968(var21, var22, var23, var24, -16777216 | 1975898755 * rsInterface.outlineColour, 0);
                           } else {
                              Class286.gameRenderer.method1956(var21, var22, var23, var24, -16777216 | rsInterface.outlineColour * 1975898755, rsInterface.anInt_2458 * 709084421, 0);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public static void setIgnoreRepaint(Canvas var0, int var1) {
      try {
         Class var2 = Class.forName("java.awt.Canvas");
         Method var3 = var2.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
         var3.invoke(var0, new Object[]{Boolean.TRUE});
      } catch (Exception var4) {
         ;
      }

   }

   static final void method6625(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class369.method4687(var3, var4, var0, -277954363);
   }
}
