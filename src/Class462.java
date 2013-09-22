
public class Class462 {

   static NodeList aNodeList_8603 = new NodeList();
   public static int anInt_8604;


   Class462() throws Throwable {
      throw new Error();
   }

   static void method5589(int var0) {
      if(client.loginStage * -243034353 == 7) {
         Class79.method1045(-876311201);
      }

      Class293.method3722(1436652694);
      client.lobbyConnectionHandler.method2545((byte)66);
      AbstractCacheData.aBoolean_6915 = true;
      Class430.method5323((byte)20);

      int var1;
      for(var1 = 0; var1 < client.hintMarkers.length; ++var1) {
         client.hintMarkers[var1] = null;
      }

      client.aBoolean_463 = false;
      Class131.method1684(715706377);
      client.anInt_469 = ((int)(Math.random() * 100.0D) - 50) * 36787631;
      client.anInt_569 = ((int)(Math.random() * 110.0D) - 55) * -1629792575;
      client.anInt_375 = ((int)(Math.random() * 80.0D) - 40) * -483218261;
      client.anInt_378 = ((int)(Math.random() * 120.0D) - 60) * -1563329961;
      client.anInt_380 = ((int)(Math.random() * 30.0D) - 20) * -1545867565;
      client.aFloat_501 = (float)((int)(Math.random() * 160.0D) - 80 & 16383);
      DrawingTarget.method2204(-943878440);

      for(var1 = 0; var1 < 2048; ++var1) {
         client.aPlayerArray[var1] = null;
      }

      Class521.myPlayer = null;
      client.availableNPCS = 0;
      client.anInt_334 = 0;
      client.npcNodeList.method5938(2036905318);
      client.aNodeList_570.clear(1383699939);
      client.aNodeArrayList_277.method5938(1627304117);
      client.aClass512_457.method5928(-2097041684);
      client.groundItems.method5938(1010384830);
      Class240_Sub30.aNodeList_7421 = new NodeList();
      Class240_Sub30.aNodeList_7408 = new NodeList();
      Class183.anInt_3179 = 0;
      Class326.anInt_6335 = 0;
      Class332.anInt_6429 = 0;
      Class49.anInt_1040 = 0;
      Class204.anInt_3537 = 0;
      ParameterNode.anInt_8078 = 0;
      Class34_Sub1.anInt_3742 = 0;
      Class167.anInt_3026 = 0;
      Class304.anInt_6021 = 0;
      FontUnpacker.anInt_6466 = 0;
      if(-1 != 1854782309 * client.anInt_468) {
         Class188.method2308(client.anInt_468 * 1854782309, 1148469640);
      }

      for(Class240_Sub16 var2 = (Class240_Sub16)client.widgets.start(); null != var2; var2 = (Class240_Sub16)client.widgets.next()) {
         if(!var2.hasNext()) {
            var2 = (Class240_Sub16)client.widgets.start();
            if(var2 == null) {
               break;
            }
         }

         Class104_Sub8.method3387(var2, true, false, (byte)-1);
      }

      client.anInt_468 = 1513750931;
      client.widgets = new NodeArrayList(8);
      Class86.method1133(402408283);
      client.aClass132_335 = null;

      for(var1 = 0; var1 < 8; ++var1) {
         client.playerOptions[var1] = null;
         client.aBooleanArray_588[var1] = false;
         client.anIntArray_398[var1] = -1;
      }

      Class440.method5459((byte)-22);
      client.aBoolean_298 = true;

      for(var1 = 0; var1 < 112; ++var1) {
         client.aBooleanArray_525[var1] = true;
      }

      for(var1 = 0; var1 < 6; ++var1) {
         client.aClass301Array_286[var1] = new Class301();
      }

      client.aClass296_348.method3754(-218332504).method6383((byte)-86);
      client.aBoolean_395 = true;
      RSServer.aShortArray_9662 = Class534.aShortArray_9419 = NPCComposite.aShortArray_8607 = ObjectDescriptor.aShortArray_8448 = new short[256];
      Class343.walkHereString = ServerString.walkHereStr.getText(Class599.clientLanguage, -189974251);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7297, Class104_Sub21.renderSettings.aClass540_Sub24_7302.method4126(-728964458), 460402772);
      client.anInt_526 = 0;
      Class297.method3799(-832722248);
      Class271.method3559(239300538);
      Class113.currentServer = null;
      Class568.aLong_9632 = 0L;
   }

   public static void setRenderToolkit(int var0, boolean var1, int var2) {
      Class604.method6513(var0, ServerString.loadingStr.getText(Class599.clientLanguage, 1215703852), var1, 319031336);
   }

   static final void method5591(int var0, int var1, int var2) {
      if(Class24.method149(var0, (int[])null, 973366800)) {
         CacheNodeArrayList.method6682(RSInterface.interfaceGroups[var0].interfaceArray, var1, (byte)-83);
      }
   }

   static final void method5592(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class134.method1786(var3, var4, var0, (byte)70);
   }
}
