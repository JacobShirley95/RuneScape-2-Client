
public class Class206 {

   static AbstractImageData aClass106_3557;
   static Class412 aClass412_3558;
   static int anInt_3559;
   static int anInt_3560;
   static int anInt_3561;
   static Class419 aClass419_3562;
   static int anInt_3563;
   static int anInt_3564;
   static int anInt_3565;
   static int viewOfMapY;


   Class206() throws Throwable {
      throw new Error();
   }

   public static ChatMessage method2614(int var0, int var1, int var2) {
      ChatMessageCache var3 = (ChatMessageCache)Class109.aMap_2042.get(Integer.valueOf(var0));
      return var3.method1647(var1, -158662145);
   }

   public static final void method2615(int var0) {
      Class11.anInt_66 = 0;
      Class11.anInt_71 = -2107901162;
      Class11.anInt_62 = 1791275858;
   }

   static void method2616(int var0) {
      if(Class187_Sub1.method7537(client.loginStage * -243034353, 1083069960)) {
         if(client.lobbyConnectionHandler.getServerConnection() == null) {
            Class418.method5190(18, (byte)-34);
         } else {
            Class418.method5190(4, (byte)-45);
         }
      } else if(client.loginStage * -243034353 != 18 && client.loginStage * -243034353 != 9) {
         if(-243034353 * client.loginStage == 8) {
            Class418.method5190(5, (byte)-25);
         }
      } else {
         Class418.method5190(5, (byte)-8);
      }

   }

   static final void method2617(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      LoadProgress.method4426(var3, var4, var0, 1211058878);
   }

   static final void method2618(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1936475764) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2502 = Class133.extractInterfaceData(var4, var2, (byte)125);
      var0.aBoolean_2524 = true;
   }

   static final void method2619(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -74820059 * Class521.myPlayer.anInt_4331;
   }

   static void method2620(RSInterface var0, int var1, int var2, int var3) {
      if(client.aBoolean_463) {
         Class476 var4 = -1 != 323906445 * Class508.anInt_9143?Class240_Sub1.aClass465_6506.method5610(Class508.anInt_9143 * 323906445, 388506367):null;
         if(client.method174(var0).method4992(1885061931) && 0 != (1458447745 * Class286.anInt_4823 & 32) && (var4 == null || var0.method1713(Class508.anInt_9143 * 323906445, var4.anInt_8739 * -80630797, 640663562) != -80630797 * var4.anInt_8739)) {
            Class343.genAndAddOption(client.selectedOption, client.aString_467 + " " + Class8.optionPointer + " " + var0.aString_2514, CacheFileID.anInt_2037 * -1863856065, 58, var0.itemID * 2142376247, 0L, -1001687885 * var0.anInt_2428, 1278853609 * var0.cacheID, true, false, (long)(var0.anInt_2428 * -1001687885 << 32 | 1278853609 * var0.cacheID), false, (byte)72);
         }
      }

      for(int var7 = 9; var7 >= 5; --var7) {
         String var5 = Class300.getOptionString(var0, var7, -902051016);
         if(null != var5) {
            Class343.genAndAddOption(var5, var0.aString_2514, Class212_Sub2.method7531(var0, var7, (byte)23), 1007, 2142376247 * var0.itemID, (long)(var7 + 1), -1001687885 * var0.anInt_2428, var0.cacheID * 1278853609, true, false, (long)(-1001687885 * var0.anInt_2428 << 32 | 1278853609 * var0.cacheID), false, (byte)25);
         }
      }

      String var9 = Class21.method131(var0, -1470829897);
      if(null != var9) {
         Class343.genAndAddOption(var9, var0.aString_2514, -174970993 * var0.anInt_2518, 25, 2142376247 * var0.itemID, 0L, -1001687885 * var0.anInt_2428, var0.cacheID * 1278853609, true, false, (long)(var0.anInt_2428 * -1001687885 << 32 | 1278853609 * var0.cacheID), false, (byte)109);
      }

      for(int var8 = 4; var8 >= 0; --var8) {
         String var6 = Class300.getOptionString(var0, var8, -865568821);
         if(null != var6) {
            Class343.genAndAddOption(var6, var0.aString_2514, Class212_Sub2.method7531(var0, var8, (byte)58), 57, var0.itemID * 2142376247, (long)(var8 + 1), var0.anInt_2428 * -1001687885, var0.cacheID * 1278853609, true, false, (long)(-1001687885 * var0.anInt_2428 << 32 | 1278853609 * var0.cacheID), false, (byte)48);
         }
      }

      if(client.method174(var0).method4997((byte)33)) {
         if(var0.actionName != null) {
            Class343.genAndAddOption(var0.actionName, "", -1, 30, 2142376247 * var0.itemID, 0L, var0.anInt_2428 * -1001687885, 1278853609 * var0.cacheID, true, false, (long)(var0.anInt_2428 * -1001687885 << 32 | var0.cacheID * 1278853609), false, (byte)97);
         } else {
            Class343.genAndAddOption(ServerString.continueStr.getText(Class599.clientLanguage, 1576293379), "", -1, 30, 2142376247 * var0.itemID, 0L, -1001687885 * var0.anInt_2428, var0.cacheID * 1278853609, true, false, (long)(var0.anInt_2428 * -1001687885 << 32 | var0.cacheID * 1278853609), false, (byte)59);
         }
      }

   }

   static void method2621(int var0, byte var1) {
      Class240_Sub46.anInt_7649 = var0 * 1590521119;
      Class240_Sub46.aClass627_7648.method6669(335921918);
   }

   static void method2622(int var0, boolean var1, byte var2) {
      Class240_Sub46 var3 = Class416.method5153(var0, var1, (byte)-13);
      if(var3 != null) {
         var3.shiftNext();
      }
   }
}
