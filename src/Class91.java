import java.awt.Point;
import java.util.Queue;

public final class Class91 {

   static long aLong_1824;
   public static AbstractUpdateServerConnector updateServerConnection;


   Class91() throws Throwable {
      throw new Error();
   }

   static void method1199(int var0, int var1) {
      if(21 == var0) {
         throw new Error();
      } else if(16 == var0) {
         throw new OutOfMemoryError();
      } else {
         try {
            if(var0 == 17) {
               Class283_Sub3.method5141(1752282580);
            } else if(var0 == 20) {
               Class19.addStringToConsole("" + ClientSuper.fps * 2143956159, 567617924);
            } else if(var0 == 26) {
               Class269 var2 = client.aClass296_348.getWorldObjects().aClass269_4485;
               var2.aBoolean_4671 = !var2.aBoolean_4671;
            } else if(14 == var0) {
               client.fpsToggle = true;
            } else if(5 == var0) {
               client.fpsToggle = false;
            } else if(19 == var0) {
               client.aClass512_457.method5928(-2106791349);
            } else {
               int var3;
               int var6;
               Runtime var7;
               if(var0 == 29) {
                  Class503.method5855((byte)1);

                  for(var6 = 0; var6 < 10; ++var6) {
                     System.gc();
                  }

                  var7 = Runtime.getRuntime();
                  var3 = (int)((var7.totalMemory() - var7.freeMemory()) / 1024L);
                  Class19.addStringToConsole("" + var3, 927391792);
               } else if(28 == var0) {
                  Class503.method5855((byte)1);

                  for(var6 = 0; var6 < 10; ++var6) {
                     System.gc();
                  }

                  var7 = Runtime.getRuntime();
                  var3 = (int)((var7.totalMemory() - var7.freeMemory()) / 1024L);
                  Class19.addStringToConsole("" + var3, 130337973);
                  Class481.method5708((byte)111);
                  Class503.method5855((byte)1);

                  for(int var4 = 0; var4 < 10; ++var4) {
                     System.gc();
                  }

                  var3 = (int)((var7.totalMemory() - var7.freeMemory()) / 1024L);
                  Class19.addStringToConsole("" + var3, -705862447);
               } else if(27 == var0) {
                  Class19.addStringToConsole(Class635.clientLibExtractor.method3806(-239607938)?"Success":"Failure", 1677861659);
               } else if(var0 == 13) {
                  Class503.aConnectionDesc_9108.method5689(-35110734);
               } else if(24 == var0) {
                  updateServerConnection.method3636(1988537455);
               } else if(25 == var0) {
                  updateServerConnection.method3635((byte)38);
               } else if(22 == var0) {
                  Class51.clientCanvas.setLocation(50, 50);
               } else if(var0 == 11) {
                  Class51.clientCanvas.setLocation(ClientSuper.canvasX * -1703748163, ClientSuper.canvasY * -1448718273);
               } else if(6 == var0) {
                  MapPoint.method6664(-266026447);
               } else if(10 == var0) {
                  client.aClass296_348.aLong_5963 = Class373.getCurrentTime((short)27074) * -4629615485171967789L;
                  client.aClass296_348.aBoolean_5988 = true;
                  MapPoint.method6664(-1317906351);
               } else {
                  GameCoord var8;
                  if(var0 == 1) {
                     var8 = Class521.myPlayer.method6203().gameCoord;
                     Class19.addStringToConsole(((int)var8.floatX >> 9) + " " + ((int)var8.floatZ >> 9), 1120400543);
                  } else if(23 == var0) {
                     var8 = Class521.myPlayer.method6203().gameCoord;
                     Class19.addStringToConsole("" + client.aClass296_348.getWorldObjects().planes[Class521.myPlayer.plane].method2155((int)var8.floatX >> 9, (int)var8.floatZ >> 9, (short)-17582), -1412680137);
                  } else if(2 == var0) {
                     Class19.addStringToConsole(RSInterface.spriteCache.method6671(2100594446) + " " + RSInterface.spriteCache.method6670(-187939051), 788943186);
                     Class19.addStringToConsole(RSInterface.aClass627_2423.method6671(288931469) + " " + RSInterface.aClass627_2423.method6670(-1396233580), -986668868);
                     Class19.addStringToConsole(Class592.cacheObjectLoader.inventoryCache.method6588() + " " + Class592.cacheObjectLoader.inventoryCache.method6587(), 731776770);
                  } else if(var0 == 4) {
                     Class416.method5154(false, (byte)-88);
                  } else {
                     if(3 == var0) {
                        client.aBoolean_303 = !client.aBoolean_303;
                        Class286.gameRenderer.method1961(client.aBoolean_303);
                        Class555.method6149(2055990249);
                        return;
                     }

                     if(var0 == 8) {
                        client.anInt_312 = 0;
                        client.aClass296_348.method3789((byte)2);
                     } else if(var0 == 15) {
                        client.anInt_312 = -287007925;
                        client.aClass296_348.method3789((byte)66);
                     } else if(7 == var0) {
                        client.anInt_312 = -574015850;
                        client.aClass296_348.method3789((byte)92);
                     }
                  }
               }
            }

         } catch (Exception var5) {
            Class19.addStringToConsole(ServerString.errorCommandStr.getText(Class599.clientLanguage, -1352758672), 816105769);
         }
      }
   }

   static void method1200(int var0) {
      Queue var1 = Class593.aQueue_9813;
      synchronized(Class593.aQueue_9813) {
         Point var2;
         if(Class51.clientCanvas.isShowing()) {
            var2 = Class51.clientCanvas.getLocationOnScreen();
         } else {
            var2 = null;
         }

         while(true) {
            Class240_Sub43_Sub2 var3 = (Class240_Sub43_Sub2)Class593.aQueue_9813.poll();
            if(null == var3) {
               return;
            }

            if(null != var2 && Class51.clientCanvas.isShowing() && AbstractCacheData.aBoolean_6915) {
               var3.method2631(var2, -829594368);
               if(!var3.method2625(-492132601) && var3.getMouseX((byte)-50) < Class29.canvasWidth * 1111410531 && var3.getMouseY(-1860579985) < Class597.canvasHeight * -75607525 && var3.getMouseX((byte)-9) >= 0 && var3.getMouseY(-1666406978) >= 0) {
                  int var4 = var3.getClickType(745814269);
                  if(var3.getClickType(745814269) == -1) {
                     Class593.aClass585_Sub2_9808.method6347(var3, (byte)-110);
                  } else if(Class572.method6279(var4, -368558190)) {
                     Class593.aClass585_Sub2_9808.method4767(var3, (byte)-26);
                  }
               }
            } else {
               var3.addThisNode((short)16383);
            }
         }
      }
   }

   static final void method1201(RSInterfaceData var0, byte var1) {
      var0.longTypeIndex -= 2117648622;
      if(var0.aLongArray_9519[var0.longTypeIndex * 973044039] > var0.aLongArray_9519[1 + var0.longTypeIndex * 973044039]) {
         var0.anInt_9510 += -1856838429 * var0.anIntArray_9518[-1756266293 * var0.anInt_9510];
      }

   }

   public static String method1202(long var0, int var2, boolean var3, LanguagePack var4, int var5) {
      char var6 = 44;
      char var7 = 46;
      if(var4 == LanguagePack.aClass526_9276) {
         var6 = 46;
         var7 = 44;
      }

      if(var4 == LanguagePack.aClass526_9278) {
         var7 = 160;
      }

      boolean var8 = false;
      if(var0 < 0L) {
         var8 = true;
         var0 = -var0;
      }

      StringBuilder var9 = new StringBuilder(26);
      int var10;
      int var11;
      if(var2 > 0) {
         for(var10 = 0; var10 < var2; ++var10) {
            var11 = (int)var0;
            var0 /= 10L;
            var9.append((char)(48 + var11 - 10 * (int)var0));
         }

         var9.append(var6);
      }

      var10 = 0;

      while(true) {
         var11 = (int)var0;
         var0 /= 10L;
         var9.append((char)(48 + var11 - 10 * (int)var0));
         if(0L == var0) {
            if(var8) {
               var9.append('-');
            }

            return var9.reverse().toString();
         }

         if(var3) {
            ++var10;
            if(var10 % 3 == 0) {
               var9.append(var7);
            }
         }
      }
   }

   static final void method1203(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class195.method2531(var2, var3, -1236730222)?1:0;
   }

   public static String method1204(String var0, char var1, String var2, int var3) {
      int var4 = var0.length();
      int var5 = var2.length();
      int var6 = var4;
      int var7 = var5 - 1;
      if(var7 != 0) {
         int var8 = 0;

         while(true) {
            var8 = var0.indexOf(var1, var8);
            if(var8 < 0) {
               break;
            }

            ++var8;
            var6 += var7;
         }
      }

      StringBuilder var11 = new StringBuilder(var6);
      int var9 = 0;

      while(true) {
         int var10 = var0.indexOf(var1, var9);
         if(var10 < 0) {
            var11.append(var0.substring(var9));
            return var11.toString();
         }

         var11.append(var0.substring(var9, var10));
         var11.append(var2);
         var9 = var10 + 1;
      }
   }

   public static void method1205(Animation var0, int var1, byte var2) {
      if(1967345345 * Class217.anInt_3759 < 50) {
         if(var0 != null && null != var0.anIntArrayArray_10111 && var1 < var0.anIntArrayArray_10111.length && var0.anIntArrayArray_10111[var1] != null) {
            int var3 = var0.anIntArrayArray_10111[var1][0];
            int var4 = var3 >> 8;
            int var5 = var3 >> 5 & 7;
            int var6;
            if(var0.anIntArrayArray_10111[var1].length > 1) {
               var6 = (int)(Math.random() * (double)var0.anIntArrayArray_10111[var1].length);
               if(var6 > 0) {
                  var4 = var0.anIntArrayArray_10111[var1][var6];
               }
            }

            var6 = 256;
            if(var0.anIntArray_10124 != null && null != var0.anIntArray_10125) {
               var6 = Class344.method4263(var0.anIntArray_10124[var1], var0.anIntArray_10125[var1], 958176660);
            }

            int var7 = null == var0.anIntArray_10122?255:var0.anIntArray_10122[var1];
            if(var0.aBoolean_10114) {
               Class271.method3556(var4, var5, 0, var7, false, var6, -708028207);
            } else {
               Class374.method4755(var4, var5, 0, var7, var6, -952603512);
            }

         }
      }
   }

   static final void method1206(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class120.method1513(var3, var4, var0, 1946605036);
   }
}
