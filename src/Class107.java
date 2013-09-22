
public class Class107 {

   public final int anInt_1988;
   public final int anInt_1989;
   final int anInt_1990;
   public final int anInt_1991;
   static RSInterface aClass132_1992;
   public static int viewOfMapImageX;


   Class107 method1383(int var1, int var2) {
      return new Class107(this.anInt_1991 * 2120936855, var1, 3797535 * this.anInt_1990, 514945959 * this.anInt_1988);
   }

   Class107(int var1, int var2, int var3, int var4) {
      this.anInt_1991 = -1014078937 * var1;
      this.anInt_1989 = var2 * -998096471;
      this.anInt_1990 = var3 * -644019745;
      this.anInt_1988 = -843054057 * var4;
   }

   static final void method1384(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      var0.intTypeIndex -= -1416056414;
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2.substring(var3, var4);
   }

   static final void method1385(int var0) {
      if(1854782309 * client.anInt_468 != -1) {
         int mouseX = Class53.captureMouseList.getCaptureMouseX();
         int mouseY = Class53.captureMouseList.getCaptureMouseY();
         AbstractMouseNode var3 = (AbstractMouseNode)client.mouseNodeList.getBaseNode_2((byte)91);
         if(var3 != null) {
            mouseX = var3.getMouseX((byte)15);
            mouseY = var3.getMouseY(-1440314650);
         }

         if(null != client.aClass132_523 && client.aClass132_426 == aClass132_1992) {
            client.aBoolean_484 = true;
            client.anInt_485 = 0;
            client.anInt_486 = 0;
            client.anInt_487 = Class29.canvasWidth * -911881177;
            client.anInt_456 = 1249493715 * Class597.canvasHeight;
         }

         AbstractCacheData.method4676((Class240_Sub16)null, 1854782309 * client.anInt_468, 0, 0, Class29.canvasWidth * 1111410531, -75607525 * Class597.canvasHeight, 0, 0, mouseX, mouseY, (byte)16);
         if(null != Class203.aClass132_3532) {
            Class283.method3672(mouseX, mouseY, -95918056);
         }

      }
   }

   static final void method1386(byte var0) {
      Class240_Sub30 var1;
      for(var1 = (Class240_Sub30)Class240_Sub30.aNodeList_7421.getBaseNode_2((byte)63); null != var1; var1 = (Class240_Sub30)Class240_Sub30.aNodeList_7421.getNext(-944598350)) {
         Class231_Sub3.method5143(var1, false, -17885383);
      }

      for(var1 = (Class240_Sub30)Class240_Sub30.aNodeList_7408.getBaseNode_2((byte)127); var1 != null; var1 = (Class240_Sub30)Class240_Sub30.aNodeList_7408.getNext(-320678183)) {
         Class231_Sub3.method5143(var1, true, -1225555504);
      }

   }

   static final void method1387(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(ScreenCharText.aClass214Array_6170 != null && var2 < 1282766579 * Class298.anInt_5996 && ScreenCharText.aClass214Array_6170[var2].aString_3710.equalsIgnoreCase(Class521.myPlayer.playerName)) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static void method1388(int var0) {
      Class254.aSprite_4403 = null;
      Class630.aSprite_10078 = null;
      Class221.aSprite_3790 = null;
      Class255.aClass170_4408 = null;
      Exception_Sub1.aClass170_1772 = null;
      Class77.aClass170_1457 = null;
      Class571.aClass170_9653 = null;
      Class225.aClass170_3881 = null;
      Class18.aTextRenderer_173 = null;
      Class433.aRSFont_8344 = null;
   }

   static final void method1389(RSInterfaceData var0, int var1) {
      if(4 == client.loginStage * -243034353 && !Class66.method680(1324945679)) {
         if(Class503.aBoolean_9111) {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         } else if(Class104_Sub19.aLong_10724 * -5383825984965562871L > Class373.getCurrentTime((short)25210) - 1000L) {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
         } else {
            Class503.aBoolean_9111 = true;
            Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6232, client.lobbyConnectionHandler.aClass528_3433, 1917447504);
            var2.aClass240_Sub8_Sub1_7370.putIntBE(Class240_Sub22_Sub6.anInt_1236 * 1399980207, 2062892803);
            client.lobbyConnectionHandler.addPacket(var2, 1915458463);
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         }

      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      }
   }

   static void method1390(Class533 var0, byte var1) {
      Class479.aClass533_8756 = var0;
   }

   static final void method1391(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class371.method4717(Class104_Sub21.renderSettings.currentToolkit.getToolkitID(), 200, -1675328918);
   }
}
