import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public abstract class Class66 {

   final Class43 aClass43_1256;
   public static CacheDataUnpacker aCacheUnpacker_1257;


   public abstract void method666(float var1, int[][][] var2, Class281 var3, int var4, int var5, int var6);

   public abstract GameCoord method667(int var1);

   public abstract Class240_Sub6 method668(int var1);

   public abstract float method669(int var1);

   public abstract void method670(Class115 var1, int var2, int var3, int var4);

   public abstract void method671(ByteArrayDataNode var1, byte var2);

   public abstract boolean method672(byte var1);

   Class66(Class43 var1) {
      this.aClass43_1256 = var1;
   }

   static final void method673(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(!Class286.gameRenderer.supportsTexture()) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 3;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub16_7301.method6082(var2, 1806898683);
      }

   }

   static int method674(char var0, LanguagePack var1, byte var2) {
      int var3 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = 1 + (var0 << 4);
      }

      if(241 == var0 && LanguagePack.aClass526_9283 == var1) {
         var3 = 1762;
      }

      return var3;
   }

   static void method675(RSInterfaceData var0, byte var1) {
      var0.intTypes[-831324111 * var0.intTypeIndex - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 1], 127970359).method6174(Class240_Sub41_Sub3.aClass23_1024, (byte)7)?1:0;
   }

   static final void method676(RSInterfaceData var0, int var1) {
      if(1422532379 * client.anInt_472 >= 5 && 1422532379 * client.anInt_472 <= 9) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1422532379 * client.anInt_472;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static void acceptCommand(String var0, boolean var1, boolean var2, int var3) {
      try {
         if(var0.equalsIgnoreCase("commands") || var0.equalsIgnoreCase("help")) {
            Class19.addStringToConsole("commands - This command", -33541217);
            Class19.addStringToConsole("cls - Clear console", 566971109);
            Class19.addStringToConsole("displayfps - Toggle FPS and other information", 1709719840);
            Class19.addStringToConsole("renderer - Print graphics renderer information", -1723576000);
            Class19.addStringToConsole("heap - Print java memory information", 1711001080);
            Class19.addStringToConsole("getViewportpos - Print location and direction of Viewport for use in bug reports", -375430550);
            return;
         }

         if(var0.equalsIgnoreCase("cls")) {
            Class194.anInt_3370 = 0;
            Class194.anInt_3360 = 0;
            return;
         }

         if(var0.equalsIgnoreCase("displayfps")) {
            client.fpsToggle = !client.fpsToggle;
            if(client.fpsToggle) {
               Class19.addStringToConsole("FPS on", 1196303);
            } else {
               Class19.addStringToConsole("FPS off", -235883372);
            }

            return;
         }

         if(var0.equals("renderer")) {
            RendererInfo var22 = Class286.gameRenderer.getRendererInfo();
            Class19.addStringToConsole("Toolkit ID: " + Class104_Sub21.renderSettings.currentToolkit.getToolkitID(), 1329184549);
            Class19.addStringToConsole("Vendor: " + 413942303 * var22.vendor, -779430415);
            Class19.addStringToConsole("Name: " + var22.rendererName, -337473696);
            Class19.addStringToConsole("Version: " + 458409777 * var22.renderVersion, -1514632254);
            Class19.addStringToConsole("Device: " + var22.renderDevice, -439207707);
            Class19.addStringToConsole("Driver Version: " + 5162517997575409563L * var22.deviceVersion, -476343700);
            return;
         }

         if(var0.equals("heap")) {
            Class19.addStringToConsole("Heap: " + ClientSuper.maxMemory * -222937899 + "MB", -1711216292);
            return;
         }

         if(var0.equalsIgnoreCase("getcamerapos")) {
            MapPoint var23 = client.aClass296_348.getMapArea();
            Class19.addStringToConsole("Pos: " + Class521.myPlayer.plane + "," + ((Class330.anInt_6406 * 1199090811 >> 9) + var23.loadedMapX * 1265321541 >> 6) + "," + ((1527060537 * Class373.anInt_7118 >> 9) + -1996781083 * var23.loadedMapY >> 6) + "," + ((1199090811 * Class330.anInt_6406 >> 9) + 1265321541 * var23.loadedMapX & 63) + "," + (var23.loadedMapY * -1996781083 + (Class373.anInt_7118 * 1527060537 >> 9) & 63) + " Height: " + (CompProfile.getHeight(Class330.anInt_6406 * 1199090811, 1527060537 * Class373.anInt_7118, Class521.myPlayer.plane) - Class1.anInt_17 * 1386321257), 1811762822);
            Class19.addStringToConsole("Look: " + Class521.myPlayer.plane + "," + (ParameterNode.anInt_8078 * 139048979 + 1265321541 * var23.loadedMapX >> 6) + "," + (Class34_Sub1.anInt_3742 * -1086740031 + -1996781083 * var23.loadedMapY >> 6) + "," + (var23.loadedMapX * 1265321541 + 139048979 * ParameterNode.anInt_8078 & 63) + "," + (-1086740031 * Class34_Sub1.anInt_3742 + var23.loadedMapY * -1996781083 & 63) + " Height: " + (CompProfile.getHeight(139048979 * ParameterNode.anInt_8078, Class34_Sub1.anInt_3742 * -1086740031, Class521.myPlayer.plane) - Class167.anInt_3026 * 1701621171), -1608731511);
            return;
         }
      } catch (Exception var12) {
         Class19.addStringToConsole(ServerString.errorCommandStr.getText(Class599.clientLanguage, -248188227), 748650212);
         return;
      }

      if(Class209.currentGameMode != Class554.aClass554_9529 || client.anInt_507 * -268988889 >= 2) {
         try {
            if(var0.equalsIgnoreCase("wm1")) {
               Class522.method5974(1, -1, -1, false, -1175626326);
               if(Class445.method5491(1917504476) == 1) {
                  Class19.addStringToConsole("Success", 563559641);
               } else {
                  Class19.addStringToConsole("Failure", -747896914);
               }

               return;
            }

            if(var0.equalsIgnoreCase("wm2")) {
               Class522.method5974(2, -1, -1, false, -788768928);
               if(Class445.method5491(1917504476) == 2) {
                  Class19.addStringToConsole("Success", -1680124686);
               } else {
                  Class19.addStringToConsole("Failure", 1690545771);
               }

               return;
            }

            if(Class506.aBoolean_9125 && var0.equalsIgnoreCase("wm3")) {
               Class522.method5974(3, 1024, 768, false, -531762968);
               if(Class445.method5491(1917504476) == 3) {
                  Class19.addStringToConsole("Success", 1636903490);
               } else {
                  Class19.addStringToConsole("Failure", 538803989);
               }

               return;
            }

            Class240_Sub27 var14;
            int var20;
            if(var0.startsWith("setlobby ")) {
               var20 = -1;
               var14 = null;
               var0 = var0.substring(9);
               int lobbyID = var0.indexOf(32);
               if(lobbyID == -1) {
                  Class19.addStringToConsole("Failure", -1129281392);
                  return;
               }

               try {
                  var20 = Integer.parseInt(var0.substring(0, lobbyID));
               } catch (NumberFormatException var8) {
                  ;
               }

               if(var20 == -1) {
                  Class19.addStringToConsole("Failure", -970468827);
                  return;
               }

               String var19 = var0.substring(lobbyID + 1).trim() + ".runescape.com";
               Class430.method5322(var19, var20, 1526807161);
               Class19.addStringToConsole("Success", -2054568306);
               return;
            }

            if(var0.equalsIgnoreCase("tk0")) {
               Class462.setRenderToolkit(0, false, -2110673113);
               if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() == 0) {
                  Class19.addStringToConsole("Success", -626058328);
                  Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, 0, 366520565);
                  Class83.method1089(-1414086305);
                  client.aBoolean_568 = false;
               } else {
                  Class19.addStringToConsole("Failure", 317123427);
               }

               return;
            }

            if(var0.equalsIgnoreCase("tk1")) {
               Class462.setRenderToolkit(1, false, -1945051965);
               if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() == 1) {
                  Class19.addStringToConsole("Success", -1012012216);
                  Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, 1, 2082401831);
                  Class83.method1089(-874119396);
                  client.aBoolean_568 = false;
               } else {
                  Class19.addStringToConsole("Failure", -571499195);
               }

               return;
            }

            if(var0.equalsIgnoreCase("tk3")) {
               Class462.setRenderToolkit(3, false, -2121288141);
               if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() == 3) {
                  Class19.addStringToConsole("Success", -1625594524);
                  Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, 3, -626021080);
                  Class83.method1089(-1247787964);
                  client.aBoolean_568 = false;
               } else {
                  Class19.addStringToConsole("Failure", -359438083);
               }

               return;
            }

            if(var0.equalsIgnoreCase("tk5")) {
               Class462.setRenderToolkit(5, false, -2072945114);
               if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() == 5) {
                  Class19.addStringToConsole("Success", 1397636376);
                  Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, 5, 817351610);
                  Class83.method1089(-1790804537);
                  client.aBoolean_568 = false;
               } else {
                  Class19.addStringToConsole("Failure", 1676079746);
               }

               return;
            }

            if(var0.equalsIgnoreCase("clientdrop")) {
               if(6 == -243034353 * client.loginStage) {
                  Class221.method2781(717935809);
               } else if(10 == -243034353 * client.loginStage) {
                  client.gameConnectionHandler.aBoolean_3453 = true;
               }

               return;
            }

            int var15;
            if(var0.equalsIgnoreCase("breakcon")) {
               ConnectionHandler[] var21 = client.openConnections;

               for(var15 = 0; var15 < var21.length; ++var15) {
                  ConnectionHandler var17 = var21[var15];
                  if(var17.getServerConnection() != null) {
                     var17.getServerConnection().close();
                  }
               }

               Class91.updateServerConnection.closeConnection();
               return;
            }

            if(var0.startsWith("getclientvarpbit")) {
               var20 = Integer.parseInt(var0.substring(17));
               Class19.addStringToConsole("varpbit=" + Class240_Sub41_Sub3.aClass23_1024.method2268(Class240_Sub41_Sub3.aClass23_1024.method2280(var20, (byte)-110), 1067245265), -887406764);
               return;
            }

            if(var0.startsWith("getclientvarp")) {
               var20 = Integer.parseInt(var0.substring(14));
               Class19.addStringToConsole("varp=" + Class240_Sub41_Sub3.aClass23_1024.method2269(Class240_Sub41_Sub3.aClass23_1024.method2281(Class283.aClass283_4785, var20, -1767541004), -390483690), -602300803);
               return;
            }

            String[] var18;
            if(var0.startsWith("directlogin")) {
               var18 = Class136.method1799(var0.substring(12), ' ', (byte)15);
               if(2 == var18.length) {
                  Class631.method6698(var18[0], var18[1], -1319449520);
               }

               return;
            }

            if(var0.startsWith("snlogin ")) {
               var18 = Class136.method1799(var0.substring(8), ' ', (byte)93);
               var15 = Integer.parseInt(var18[0]);
               Class240_Sub46.method4981(var15, -170876795);
               return;
            }

            File var4;
            if(var0.startsWith("setoutput ")) {
               var4 = new File(var0.substring(10));
               if(var4.exists()) {
                  var4 = new File(var0.substring(10) + "." + Class373.getCurrentTime((short)15620) + ".log");
                  if(var4.exists()) {
                     Class19.addStringToConsole("file already exists!", -1606975768);
                     return;
                  }
               }

               if(NodeList.aFileOutputStream_9066 != null) {
                  NodeList.aFileOutputStream_9066.close();
                  NodeList.aFileOutputStream_9066 = null;
               }

               try {
                  NodeList.aFileOutputStream_9066 = new FileOutputStream(var4);
                  return;
               } catch (FileNotFoundException var9) {
                  Class19.addStringToConsole("Could not create " + var4.getName(), -898480918);
                  return;
               } catch (SecurityException var10) {
                  Class19.addStringToConsole("Cannot write to " + var4.getName(), -589876842);
                  return;
               }
            }

            if(var0.equals("closeoutput")) {
               if(NodeList.aFileOutputStream_9066 != null) {
                  NodeList.aFileOutputStream_9066.close();
               }

               NodeList.aFileOutputStream_9066 = null;
               return;
            }

            if(var0.startsWith("runscript ")) {
               var4 = new File(var0.substring(10));
               if(!var4.exists()) {
                  Class19.addStringToConsole("No such file", 1343913110);
                  return;
               }

               byte[] var5 = Class278.method3619(var4, -2121668316);
               if(var5 == null) {
                  Class19.addStringToConsole("Failed to read file", 973295135);
                  return;
               }

               String[] var6 = Class136.method1799(Class91.method1204(Class410.method5062(var5, -1000813822), '\r', "", -831324111), '\n', (byte)45);
               Class503.method5854(var6, (byte)-46);
            }

            if(6 == -243034353 * client.loginStage || client.loginStage * -243034353 == 4) {
               ConnectionHandler var13 = Class32.method230(-920493722);
               var14 = Class47_Sub1.method3496(Class326.aClass326_6255, var13.aClass528_3433, 1917447504);
               var14.aClass240_Sub8_Sub1_7370.putByte(var0.length() + 3, 1975644301);
               var14.aClass240_Sub8_Sub1_7370.putByte(var1?1:0, 192124683);
               var14.aClass240_Sub8_Sub1_7370.putByte(var2?1:0, -1091177709);
               var14.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-125);
               var13.addPacket(var14, 1672453843);
            }
         } catch (Exception var11) {
            Class19.addStringToConsole(ServerString.errorCommandStr.getText(Class599.clientLanguage, -130718016), -1486286920);
            return;
         }
      }

      if(6 != client.loginStage * -243034353 && client.loginStage * -243034353 != 4) {
         Class19.addStringToConsole(ServerString.aClass482_8767.getText(Class599.clientLanguage, -173092983) + var0, -1548682410);
      }

   }

   public static int method678(int var0, int var1, int var2, int var3) {
      if(-1761614089 * Class248_Sub1.worldMapLoadPercent < 100) {
         return -2;
      } else {
         int var4 = -2;
         int var5 = Integer.MAX_VALUE;
         int var6 = var1 - Class248_Sub1.anInt_4120;
         int var7 = var2 - Class248_Sub1.anInt_4124;

         for(Class240_Sub12 var8 = (Class240_Sub12)Class248_Sub1.aNodeList_4122.getBaseNode_2((byte)96); var8 != null; var8 = (Class240_Sub12)Class248_Sub1.aNodeList_4122.getNext(-629279423)) {
            if(781228131 * var8.anInt_6801 == var0) {
               int var9 = -1889789653 * var8.anInt_6802;
               int var10 = var8.anInt_6803 * -526841819;
               int var11 = var9 + Class248_Sub1.anInt_4120 << 14 | Class248_Sub1.anInt_4124 + var10;
               int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
               if(var4 < 0 || var12 < var5) {
                  var4 = var11;
                  var5 = var12;
               }
            }
         }

         return var4;
      }
   }

   static void method679(int var0) {
      Class240_Sub46.aClass627_7648.method6669(-2120301597);
   }

   public static final boolean method680(int var0) {
      return 0 != Class11.anInt_66 * 1622160533;
   }

   static final void method681(RSInterfaceData var0, byte var1) {
      if(null != Class104_Sub11.aClass240_Sub47_10199) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
         var0.aClass240_Sub47_9501 = Class104_Sub11.aClass240_Sub47_10199;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }
}
