
public class Class209 {

   static boolean aBoolean_3605 = false;
   public static Class554 currentGameMode;


   Class209() throws Throwable {
      throw new Error();
   }

   static void method2639(byte var0) {
      if(9775703 * ClientSuper.availableProcessors > 1) {
         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub11_7286, 4, -489167523);
      } else {
         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub11_7286, 2, 2059605358);
      }

   }

   public static final void method2640(byte var0) {
      Class130.method1674(-412311079);

      for(int var1 = 0; var1 < Class217.anInt_3759 * 1967345345; ++var1) {
         Class225 var2 = Class217.aClass225Array_3760[var1];
         boolean var3 = false;
         int var14;
         if(null == var2.aClass240_Sub41_Sub5_3867) {
            var2.anInt_3871 -= -615522975;
            if(839222945 * var2.anInt_3871 >= (var2.method2842(-1475510927)?-1500:-10)) {
               if(1 == var2.aByte_3875 && null == var2.aClass302_3879) {
                  var2.aClass302_3879 = Class302.method3827(Class431.aCacheUnpacker_8325, var2.anInt_3869 * -1953302391, 0);
                  if(var2.aClass302_3879 == null) {
                     continue;
                  }

                  var2.anInt_3871 += var2.aClass302_3879.method3824() * -615522975;
               } else if(var2.method2842(-1921830302) && (var2.aClass240_Sub2_3878 == null || null == var2.aClass240_Sub7_Sub1_Sub2_3877)) {
                  if(null == var2.aClass240_Sub2_3878) {
                     var2.aClass240_Sub2_3878 = Class240_Sub2.method4418(Class437.aCacheUnpacker_8384, -1953302391 * var2.anInt_3869);
                  }

                  if(null == var2.aClass240_Sub2_3878) {
                     continue;
                  }

                  if(var2.aClass240_Sub7_Sub1_Sub2_3877 == null) {
                     var2.aClass240_Sub7_Sub1_Sub2_3877 = var2.aClass240_Sub2_3878.method4414();
                     if(null == var2.aClass240_Sub7_Sub1_Sub2_3877) {
                        continue;
                     }
                  }
               }

               if(839222945 * var2.anInt_3871 < 0) {
                  int var4 = 8192;
                  if(0 != var2.anInt_3872 * 682812199) {
                     int var5 = 682812199 * var2.anInt_3872 >> 24 & 3;
                     if(var5 == Class521.myPlayer.plane) {
                        int var6 = (var2.anInt_3872 * 682812199 & 255) << 9;
                        int var7 = Class521.myPlayer.method3257() << 8;
                        GameCoord var8 = Class521.myPlayer.method6203().gameCoord;
                        int var9 = 682812199 * var2.anInt_3872 >> 16 & 255;
                        int var10 = (var9 << 9) + 256 - (int)var8.floatX + var7;
                        int var11 = var2.anInt_3872 * 682812199 >> 8 & 255;
                        int var12 = var7 + (256 + (var11 << 9) - (int)var8.floatZ);
                        int var13 = Math.abs(var10) + Math.abs(var12) - 512;
                        if(var13 > var6) {
                           var2.anInt_3871 = 505658049;
                           continue;
                        }

                        if(var13 < 0) {
                           var13 = 0;
                        }

                        var14 = (var6 - var13) * Class104_Sub21.renderSettings.aClass540_Sub14_7324.method1701(-1626949959) * -1367849727 * var2.anInt_3873 / var6 >> 2;
                        if(-1 != var2.anInt_3868 * 356979173) {
                           var9 = 356979173 * var2.anInt_3868;
                           var11 = var2.anInt_3876 * -990703577;
                        }

                        if(var10 != 0 || 0 != var12) {
                           int var15 = -(Class474.anInt_8724 * 553328859) - (int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D) - 4096 & 16383;
                           if(var15 > 8192) {
                              var15 = 16384 - var15;
                           }

                           int var16;
                           if(var13 <= 0) {
                              var16 = 8192;
                           } else if(var13 >= 4096) {
                              var16 = 16384;
                           } else {
                              var16 = (8192 - var13) / 4096 + 8192;
                           }

                           var4 = var15 * var16 / 8192 + (16384 - var16 >> 1);
                        }
                     } else {
                        var14 = 0;
                     }
                  } else {
                     var14 = var2.anInt_3873 * -1367849727 * (var2.aByte_3875 == 3?Class104_Sub21.renderSettings.aClass540_Sub14_7322.method1701(-997495069):Class104_Sub21.renderSettings.aClass540_Sub14_7320.method1701(-1757117709)) >> 2;
                  }

                  if(var14 > 0) {
                     if(1 == var2.aByte_3875) {
                        Class240_Sub7_Sub1_Sub1 var18 = null;
                        var18 = var2.aClass302_3879.method3825().method2214(Class541.aClass221_9471);
                        var2.aClass240_Sub41_Sub5_3867 = var18.method509(-426009193 * var2.anInt_3874, var14, var4);
                     } else if(var2.method2842(-1575971783)) {
                        var2.aClass240_Sub41_Sub5_3867 = var2.aClass240_Sub7_Sub1_Sub2_3877.method509(-426009193 * var2.anInt_3874, var14, var4);
                     }

                     var2.aClass240_Sub41_Sub5_3867.method603(var2.anInt_3870 * -1059530161 - 1, 1884987856);
                     Class217.aClass240_Sub41_Sub4_3757.method521(var2.aClass240_Sub41_Sub5_3867);
                  }
               }
            } else {
               var3 = true;
            }
         } else if(!var2.aClass240_Sub41_Sub5_3867.hasNext()) {
            var3 = true;
         }

         if(var3) {
            Class217.anInt_3759 -= 1198145857;

            for(var14 = var1; var14 < 1967345345 * Class217.anInt_3759; ++var14) {
               Class217.aClass225Array_3760[var14] = Class217.aClass225Array_3760[1 + var14];
            }

            --var1;
         }
      }

      if(Class217.aBoolean_3748 && !Class220.method2769((byte)20)) {
         if(Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-847344417) != 0 && -528571831 * Class217.anInt_3752 != -1) {
            if(Class217.aClass240_Sub41_Sub2_3755 != null) {
               Class228.method2904(GraphicsDataHolder.aCacheUnpacker_9212, -528571831 * Class217.anInt_3752, 0, Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-1626526543), false, Class217.aClass240_Sub41_Sub2_3755, (byte)0);
            } else {
               Class243.method3122(GraphicsDataHolder.aCacheUnpacker_9212, -528571831 * Class217.anInt_3752, 0, Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-1272190607), false, (byte)-21);
            }
         }

         Class217.aBoolean_3748 = false;
         Class217.aClass240_Sub41_Sub2_3755 = null;
      } else if(Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-1299601157) != 0 && -1 != Class217.anInt_3752 * -528571831 && !Class220.method2769((byte)20)) {
         Class240_Sub27 var17 = Class47_Sub1.method3496(Class326.aClass326_6267, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var17.aClass240_Sub8_Sub1_7370.putIntBE(-528571831 * Class217.anInt_3752, 2062892803);
         client.gameConnectionHandler.addPacket(var17, 547938678);
         Class217.anInt_3752 = 255660039;
      }

   }

   static final void method2641(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class240_Sub22_Sub9.method2581(var3, var4, var0, 2070216160);
   }

   static final void method2642(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class6.method37(var3, var4, var0, 378004698);
   }

   static final void method2643(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -531811127 * client.anInt_460;
   }

   static final void method2644(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aBoolean_499 && !client.aBoolean_444?1:0;
   }

   static void method2645(int var0, String var1, String var2, byte var3) {
      if(null != client.gameConnectionHandler) {
         Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6272, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var4.aClass240_Sub8_Sub1_7370.method4463(1 + Class433.method5416(var1, 401482751) + Class433.method5416(var2, 761854743), 1624701351);
         var4.aClass240_Sub8_Sub1_7370.method4500(var0, (byte)-127);
         var4.aClass240_Sub8_Sub1_7370.method4535(var1, -942544861);
         var4.aClass240_Sub8_Sub1_7370.method4535(var2, -1075228340);
         client.gameConnectionHandler.addPacket(var4, 685705152);
      }

   }
}
