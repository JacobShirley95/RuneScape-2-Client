
public class Class491 implements Class551 {

   public static final Class491 aClass491_9012 = new Class491(0);
   public static final Class491 aClass491_9013 = new Class491(1);
   final int anInt_9014;


   public int getLanguageID(int var1) {
      return this.anInt_9014 * -1040173265;
   }

   Class491(int var1) {
      this.anInt_9014 = -1157992497 * var1;
   }

   static void method5753(OptionListNode var0, int x, int var2, byte var3) {
      if(var0 != null && Class18.optionNodeList.rootNode != var0) {
         int targetX = -1502165601 * var0.targetX;
         int targetY = var0.targetY * 1513669415;
         int action = -533194375 * var0.action;
         int target = (int)(var0.target * -4549875760079461447L);
         long var8 = var0.target * -4549875760079461447L;
         if(action >= 2000) {
            action -= 2000;
         }

         MapPoint var10 = client.aClass296_348.getMapArea();
         Class326 playerAction = null;
         if(action == 44) {
            playerAction = Class326.aClass326_6223;
         } else if(45 == action) {
            playerAction = Class326.aClass326_6316;
         } else if(action == 46) {
            playerAction = Class326.aClass326_6300;
         } else if(action == 47) {
            playerAction = Class326.aClass326_6264;
         } else if(48 == action) {
            playerAction = Class326.aClass326_6251;
         } else if(action == 49) {
            playerAction = Class326.aClass326_6292;
         } else if(action == 50) {
            playerAction = Class326.aClass326_6228;
         } else if(51 == action) {
            playerAction = Class326.aClass326_6259;
         } else if(action == 52) {
            playerAction = Class326.aClass326_6324;
         } else if(action == 53) {
            playerAction = Class326.aClass326_6297;
         }

         Player var12;
         Class240_Sub27 var13;
         if(playerAction != null) {
            var12 = client.aPlayerArray[target];
            if(null != var12) {
               client.targetX = -26667599 * x;
               client.targetY = -571401895 * var2;
               client.interactionType = -2080240254;
               client.crossSprite = 0;
               var13 = Class47_Sub1.method3496(playerAction, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var13.aClass240_Sub8_Sub1_7370.method4507(target, -1828074049);
               var13.aClass240_Sub8_Sub1_7370.putByte(Class338.method4190(892321123)?1:0, -378880311);
               client.gameConnectionHandler.addPacket(var13, 1901416139);
               Class9.putFlag(var12.tilePosArrayX[0], var12.tilePosArrayY[0], 1175025470);
            }
         }

         if(action == 25) {
            RSInterface var25 = DrawingTarget.method2201(targetY, targetX, (byte)82);
            if(null != var25) {
               Class537.method6073(-905817101);
               Class240_Sub49 var24 = client.method174(var25);
               Class210.method2656(var25, var24.method4993((byte)-94), var24.anInt_7701 * -13045859, (byte)-58);
               client.selectedOption = Class21.method131(var25, -1470829897);
               if(null == client.selectedOption) {
                  client.selectedOption = "Null";
               }

               client.aString_467 = var25.aString_2514 + Class133.addTextColour(16777215, (byte)6);
            }

         } else {
            Class240_Sub27 var18;
            if(action == 59) {
               client.targetX = x * -26667599;
               client.targetY = -571401895 * var2;
               client.interactionType = 1107363521;
               client.crossSprite = 0;
               var18 = Class47_Sub1.method3496(Class326.aClass326_6227, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var18.aClass240_Sub8_Sub1_7370.method4528(targetY + var10.loadedMapY * -1996781083, 1088978881);
               var18.aClass240_Sub8_Sub1_7370.method4507(client.anInt_279 * 1440987389, -1828074049);
               var18.aClass240_Sub8_Sub1_7370.method4514(Class283_Sub3.anInt_7897 * 2036107931, 2139383171);
               var18.aClass240_Sub8_Sub1_7370.method4528(client.anInt_543 * -315969483, -596534551);
               var18.aClass240_Sub8_Sub1_7370.method4507(targetX + 1265321541 * var10.loadedMapX, -1828074049);
               client.gameConnectionHandler.addPacket(var18, 727278074);
               Class9.putFlag(targetX, targetY, 1175025470);
            }

            if(action == 16) {
               client.targetX = -26667599 * x;
               client.targetY = -571401895 * var2;
               client.interactionType = -2080240254;
               client.crossSprite = 0;
               var18 = Class47_Sub1.method3496(Class326.aClass326_6243, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var18.aClass240_Sub8_Sub1_7370.method4507(client.anInt_543 * -315969483, -1828074049);
               var18.aClass240_Sub8_Sub1_7370.method4507(1440987389 * client.anInt_279, -1828074049);
               var18.aClass240_Sub8_Sub1_7370.method4463(50743311 * Class521.myPlayer.index, -468193431);
               var18.aClass240_Sub8_Sub1_7370.putByte(Class338.method4190(2077963551)?1:0, -40591353);
               var18.aClass240_Sub8_Sub1_7370.method4514(2036107931 * Class283_Sub3.anInt_7897, 331469750);
               client.gameConnectionHandler.addPacket(var18, 776416497);
            }

            if(action == 57 || 1007 == action) {
               Class598.method6476(target, targetY, targetX, var0.optionString, -1898494081);
            }

            if(action == 15) {
               var12 = client.aPlayerArray[target];
               if(null != var12) {
                  client.targetX = x * -26667599;
                  client.targetY = var2 * -571401895;
                  client.interactionType = -2080240254;
                  client.crossSprite = 0;
                  var13 = Class47_Sub1.method3496(Class326.aClass326_6243, client.gameConnectionHandler.aClass528_3433, 1917447504);
                  var13.aClass240_Sub8_Sub1_7370.method4507(client.anInt_543 * -315969483, -1828074049);
                  var13.aClass240_Sub8_Sub1_7370.method4507(client.anInt_279 * 1440987389, -1828074049);
                  var13.aClass240_Sub8_Sub1_7370.method4463(target, 1163151079);
                  var13.aClass240_Sub8_Sub1_7370.putByte(Class338.method4190(371198269)?1:0, -1923743336);
                  var13.aClass240_Sub8_Sub1_7370.method4514(Class283_Sub3.anInt_7897 * 2036107931, 205969884);
                  client.gameConnectionHandler.addPacket(var13, 1162349008);
                  Class9.putFlag(var12.tilePosArrayX[0], var12.tilePosArrayY[0], 1175025470);
               }
            }

            if(60 == action) {
               if(-268988889 * client.anInt_507 > 0 && Class231_Sub5.method5327(-453928678)) {
                  Class636.method6721(Class521.myPlayer.plane, var10.loadedMapX * 1265321541 + targetX, targetY + var10.loadedMapY * -1996781083, (byte)72);
               } else {
                  client.targetX = x * -26667599;
                  client.targetY = -571401895 * var2;
                  client.interactionType = 1107363521;
                  client.crossSprite = 0;
                  var18 = Class47_Sub1.method3496(Class326.aClass326_6280, client.gameConnectionHandler.aClass528_3433, 1917447504);
                  var18.aClass240_Sub8_Sub1_7370.method4463(var10.loadedMapY * -1996781083 + targetY, -256342744);
                  var18.aClass240_Sub8_Sub1_7370.method4463(var10.loadedMapX * 1265321541 + targetX, 992551591);
                  client.gameConnectionHandler.addPacket(var18, 96367954);
               }
            }

            if(action == 17) {
               client.targetX = x * -26667599;
               client.targetY = var2 * -571401895;
               client.interactionType = -2080240254;
               client.crossSprite = 0;
               var18 = Class47_Sub1.method3496(Class326.aClass326_6275, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var18.aClass240_Sub8_Sub1_7370.method4499(Class338.method4190(1424456266)?1:0, (byte)-36);
               var18.aClass240_Sub8_Sub1_7370.method4528(var10.loadedMapX * 1265321541 + targetX, 1759503790);
               var18.aClass240_Sub8_Sub1_7370.method4528(-315969483 * client.anInt_543, -455046204);
               var18.aClass240_Sub8_Sub1_7370.method4507(targetY + -1996781083 * var10.loadedMapY, -1828074049);
               var18.aClass240_Sub8_Sub1_7370.method4528(target, 58939520);
               var18.aClass240_Sub8_Sub1_7370.method4515(Class283_Sub3.anInt_7897 * 2036107931, 863075549);
               var18.aClass240_Sub8_Sub1_7370.method4463(1440987389 * client.anInt_279, -545122072);
               client.gameConnectionHandler.addPacket(var18, 886377469);
               Class9.putFlag(targetX, targetY, 1175025470);
            }

            Class326 var20 = null;
            if(action == 3) {
               var20 = Class326.aClass326_6302;
            } else if(action == 4) {
               var20 = Class326.aClass326_6304;
            } else if(5 == action) {
               var20 = Class326.aClass326_6298;
            } else if(6 == action) {
               var20 = Class326.aClass326_6257;
            } else if(action == 1001) {
               var20 = Class326.aClass326_6278;
            } else if(action == 1002) {
               var20 = Class326.aClass326_6239;
            }

            if(var20 != null) {
               client.targetX = -26667599 * x;
               client.targetY = -571401895 * var2;
               client.interactionType = -2080240254;
               client.crossSprite = 0;
               var13 = Class47_Sub1.method3496(var20, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var13.aClass240_Sub8_Sub1_7370.method4507(targetX + var10.loadedMapX * 1265321541, -1828074049);
               var13.aClass240_Sub8_Sub1_7370.method4528(targetY + -1996781083 * var10.loadedMapY, 809722836);
               var13.aClass240_Sub8_Sub1_7370.method4516((int)(var8 >>> 32) & Integer.MAX_VALUE, -350677284);
               var13.aClass240_Sub8_Sub1_7370.method4499(Class338.method4190(1513766392)?1:0, (byte)-55);
               client.gameConnectionHandler.addPacket(var13, 2042172543);
               Class9.putFlag(targetX, targetY, 1175025470);
            }

            Class326 var19 = null;
            if(action == 18) {
               var19 = Class326.aClass326_6279;
            } else if(19 == action) {
               var19 = Class326.aClass326_6287;
            } else if(20 == action) {
               var19 = Class326.aClass326_6246;
            } else if(21 == action) {
               var19 = Class326.aClass326_6258;
            } else if(action == 22) {
               var19 = Class326.aClass326_6296;
            } else if(action == 1004) {
               var19 = Class326.aClass326_6293;
            }

            Class240_Sub27 var14;
            if(null != var19) {
               client.targetX = -26667599 * x;
               client.targetY = var2 * -571401895;
               client.interactionType = -2080240254;
               client.crossSprite = 0;
               var14 = Class47_Sub1.method3496(var19, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var14.aClass240_Sub8_Sub1_7370.method4528(targetX + var10.loadedMapX * 1265321541, -2094242924);
               var14.aClass240_Sub8_Sub1_7370.method4463(var10.loadedMapY * -1996781083 + targetY, 367234746);
               var14.aClass240_Sub8_Sub1_7370.method4499(Class338.method4190(878830934)?1:0, (byte)21);
               var14.aClass240_Sub8_Sub1_7370.putShort(target, -1468437839);
               client.gameConnectionHandler.addPacket(var14, 233241767);
               Class9.putFlag(targetX, targetY, 1175025470);
            }

            if(8 == action) {
               Class240_Sub9 var23 = (Class240_Sub9)client.npcNodeList.getNode((long)target);
               if(null != var23) {
                  NPC var15 = (NPC)var23.anObject_6783;
                  client.targetX = x * -26667599;
                  client.targetY = -571401895 * var2;
                  client.interactionType = -2080240254;
                  client.crossSprite = 0;
                  Class240_Sub27 var16 = Class47_Sub1.method3496(Class326.aClass326_6226, client.gameConnectionHandler.aClass528_3433, 1917447504);
                  var16.aClass240_Sub8_Sub1_7370.method4463(target, 516910034);
                  var16.aClass240_Sub8_Sub1_7370.method4516(Class283_Sub3.anInt_7897 * 2036107931, -350677284);
                  var16.aClass240_Sub8_Sub1_7370.method4463(1440987389 * client.anInt_279, 25063220);
                  var16.aClass240_Sub8_Sub1_7370.method4477(Class338.method4190(787286158)?1:0, (byte)112);
                  var16.aClass240_Sub8_Sub1_7370.method4528(-315969483 * client.anInt_543, -2102379070);
                  client.gameConnectionHandler.addPacket(var16, 1917104598);
                  Class9.putFlag(var15.tilePosArrayX[0], var15.tilePosArrayY[0], 1175025470);
               }
            }

            if(30 == action && client.aClass132_335 == null) {
               Class37.method314(targetY, targetX, 2000550243);
               client.aClass132_335 = DrawingTarget.method2201(targetY, targetX, (byte)118);
               if(null != client.aClass132_335) {
                  Class110_Sub1.method3149(client.aClass132_335, -360168449);
               }
            }

            if(23 == action) { //walk here
               if(-268988889 * client.anInt_507 > 0 && Class231_Sub5.method5327(-453928678)) {
                  Class636.method6721(Class521.myPlayer.plane, targetX + 1265321541 * var10.loadedMapX, -1996781083 * var10.loadedMapY + targetY, (byte)19);
               } else {
                  var14 = Class163.method2000(targetX, targetY, target, -836396059);
                  if(1 == target) {
                     var14.aClass240_Sub8_Sub1_7370.putByte(-1, -488596432);
                     var14.aClass240_Sub8_Sub1_7370.putByte(-1, 2072132242);
                     var14.aClass240_Sub8_Sub1_7370.method4463((int)client.aFloat_501, -594092758);
                     var14.aClass240_Sub8_Sub1_7370.putByte(57, 501370353);
                     var14.aClass240_Sub8_Sub1_7370.putByte(-517467801 * client.anInt_378, -1642876426);
                     var14.aClass240_Sub8_Sub1_7370.putByte(client.anInt_380 * 1121098075, -1432109442);
                     var14.aClass240_Sub8_Sub1_7370.putByte(89, -590262256);
                     GameCoord var22 = Class521.myPlayer.method6203().gameCoord;
                     var14.aClass240_Sub8_Sub1_7370.method4463((int)var22.floatX, -1303020951);
                     var14.aClass240_Sub8_Sub1_7370.method4463((int)var22.floatZ, -1961127202);
                     var14.aClass240_Sub8_Sub1_7370.putByte(63, -1935723340);
                  } else {
                     client.targetX = x * -26667599;
                     client.targetY = var2 * -571401895;
                     client.interactionType = 1107363521;
                     client.crossSprite = 0;
                  }

                  client.gameConnectionHandler.addPacket(var14, 1635273392);
                  Class9.putFlag(targetX, targetY, 1175025470);
               }
            }

            Class326 var21 = null;
            if(9 == action) {
               var21 = Class326.aClass326_6282;
            } else if(10 == action) {
               var21 = Class326.attackNPC;
            } else if(action == 11) {
               var21 = Class326.aClass326_6330;
            } else if(action == 12) {
               var21 = Class326.aClass326_6250;
            } else if(action == 13) {
               var21 = Class326.aClass326_6312;
            } else if(1003 == action) {
               var21 = Class326.aClass326_6252;
            }

            if(var21 != null) {
               Class240_Sub9 var29 = (Class240_Sub9)client.npcNodeList.getNode((long)target);
               if(var29 != null) {
                  NPC targetNPC = (NPC)var29.anObject_6783;
                  client.targetX = -26667599 * x;
                  client.targetY = -571401895 * var2;
                  client.interactionType = -2080240254;
                  client.crossSprite = 0;
                  Class240_Sub27 var17 = Class47_Sub1.method3496(var21, client.gameConnectionHandler.aClass528_3433, 1917447504);
                  var17.aClass240_Sub8_Sub1_7370.method4499(Class338.method4190(2059207320)?1:0, (byte)13);
                  var17.aClass240_Sub8_Sub1_7370.method4528(target, -146291510);
                  client.gameConnectionHandler.addPacket(var17, 75115172);
                  Class9.putFlag(targetNPC.tilePosArrayX[0], targetNPC.tilePosArrayY[0], 1175025470);
               }
            }

            if(58 == action) {
               RSInterface var28 = DrawingTarget.method2201(targetY, targetX, (byte)93);
               if(null != var28) {
                  Class109.method1409(var28, -623068644);
               }
            }

            if(action == 1008 || 1009 == action || 1010 == action || action == 1011 || 1012 == action) {
               Class484.method5727(action, target, targetX, 1214668735);
            }

            if(action == 2) {
               client.targetX = -26667599 * x;
               client.targetY = var2 * -571401895;
               client.interactionType = -2080240254;
               client.crossSprite = 0;
               Class240_Sub27 var27 = Class47_Sub1.method3496(Class326.aClass326_6236, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var27.aClass240_Sub8_Sub1_7370.method4514((int)(var8 >>> 32) & Integer.MAX_VALUE, 713697370);
               var27.aClass240_Sub8_Sub1_7370.method4507(-315969483 * client.anInt_543, -1828074049);
               var27.aClass240_Sub8_Sub1_7370.putShort(targetX + var10.loadedMapX * 1265321541, -1363688647);
               var27.aClass240_Sub8_Sub1_7370.method4514(2036107931 * Class283_Sub3.anInt_7897, 266742947);
               var27.aClass240_Sub8_Sub1_7370.method4477(Class338.method4190(869368816)?1:0, (byte)12);
               var27.aClass240_Sub8_Sub1_7370.putShort(client.anInt_279 * 1440987389, -1181402403);
               var27.aClass240_Sub8_Sub1_7370.method4507(targetY + var10.loadedMapY * -1996781083, -1828074049);
               client.gameConnectionHandler.addPacket(var27, 1533843374);
               Class9.putFlag(targetX, targetY, 1175025470);
            }

            if(client.aBoolean_463) {
               Class537.method6073(1823253432);
            }

            if(Class240_Sub51.aClass132_7705 != null && -752576121 * client.anInt_420 == 0) {
               Class110_Sub1.method3149(Class240_Sub51.aClass132_7705, 251228432);
            }

         }
      }
   }

   static final void method5754(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 | var3;
   }

   static final void method5755(OptionListNode var0, RSInterfaceData var1, int var2) {
      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub7.getOptionAction(var0, (byte)-109);
      var1.stringData[(var1.stringDataIndex += -1828074049) * 863838783 - 1] = Class545.method6099(var0, -276809313);
      var1.stringData[(var1.stringDataIndex += -1828074049) * 863838783 - 1] = Class104_Sub21.method7396(var0, (byte)-60);
      var1.stringData[(var1.stringDataIndex += -1828074049) * 863838783 - 1] = NodeList.method5816(var0, -346770183);
   }
}
