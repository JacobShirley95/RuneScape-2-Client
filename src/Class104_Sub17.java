import java.awt.Container;
import java.awt.Insets;

public class Class104_Sub17 extends CharTask {

   final int anInt_10707;
   final int anInt_10708;


   public void execute() {
      Class102 var2 = Class95.aClass102Array_1889[this.anInt_10707 * -96370533];
      CacheNodeArrayList.method6681(-626942963 * var2.anInt_1964, var2.anInt_1965 * 207628681, var2.anInt_1961 * -1933821595, var2.aClass495_1962.anInt_9041 * -2144718709, var2.aClass495_1962.anInt_9062 * -1965975883, var2.anInt_1966 * -506297589, this.anInt_10708 * -1296578593, 0, (short)15626);
   }

   boolean method1344(int var1) {
      Animation var2 = Class88.animeUnpacker.loadAnimation(this.anInt_10708 * -1296578593);
      return var2.method6725(290323426);
   }

   Class104_Sub17(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_10707 = var1.readShort(1440202777) * 2035443091;
      this.anInt_10708 = var1.method4493(-157074556) * 998945823;
   }

   static void method7375(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      if(Class506.aBoolean_9125 && null != Class102.aFrame_1967 && (var1 != 3 || var2 != Class270.anInt_4682 * -1726369439 || -959293549 * Class104_Sub7.anInt_4433 != var3)) {
         Class39.method320(MapPoint.graphicsDataHolder, Class102.aFrame_1967, -1028508698);
         Class102.aFrame_1967 = null;
      }

      if(Class506.aBoolean_9125 && 3 == var1 && Class102.aFrame_1967 == null) {
         Class102.aFrame_1967 = Class574.method6289(MapPoint.graphicsDataHolder, var2, var3, 0, 0, -1389922777);
         if(null != Class102.aFrame_1967) {
            Class270.anInt_4682 = var2 * 784511649;
            Class104_Sub7.anInt_4433 = -2018550117 * var3;
            Class83.method1089(-1052676720);
         }
      }

      if(3 == var1 && (!Class506.aBoolean_9125 || null == Class102.aFrame_1967)) {
         method7375(var0, Class104_Sub21.renderSettings.aClass540_Sub13_7311.method1694(783234315), -1, -1, true, -142768981);
      } else {
         Container var6 = DrawingTarget.getGameContainer(-882169322);
         Insets var7;
         if(Class102.aFrame_1967 != null) {
            Class221.clientWidth = -92323255 * var2;
            client.clientHeight = var3 * 1202332841;
         } else if(ConnectionUpdate.clientFrame != null) {
            var7 = ConnectionUpdate.clientFrame.getInsets();
            int var10001 = var7.right + var7.left;
            Class221.clientWidth = (ConnectionUpdate.clientFrame.getSize().width - var10001) * -92323255;
            var10001 = var7.top + var7.bottom;
            client.clientHeight = (ConnectionUpdate.clientFrame.getSize().height - var10001) * 1202332841;
         } else {
            Class221.clientWidth = var6.getSize().width * -92323255;
            client.clientHeight = var6.getSize().height * 1202332841;
         }

         if(Class221.clientWidth * -1364963335 <= 0) {
            Class221.clientWidth = -92323255;
         }

         if(client.clientHeight * 772194201 <= 0) {
            client.clientHeight = 1202332841;
         }

         if(var1 != 1) {
            Class243.method3120(-497125241);
         } else {
            Class29.canvasWidth = client.anInt_343 * 21467411;
            client.canvasX = -428522091 * ((-1364963335 * Class221.clientWidth - client.anInt_343 * 688709465) / 2);
            Class597.canvasHeight = 2037150235 * client.anInt_435;
            client.canvasY = 0;
         }

         if(Class554.aClass554_9529 != Class209.currentGameMode && 1111410531 * Class29.canvasWidth < 1024 && -75607525 * Class597.canvasHeight < 768) {
            ;
         }

         if(!var4) {
            Class51.clientCanvas.setSize(Class29.canvasWidth * 1111410531, Class597.canvasHeight * -75607525);
            Class286.gameRenderer.method1976(Class51.clientCanvas, Class29.canvasWidth * 1111410531, -75607525 * Class597.canvasHeight, -681405326);
            if(var6 == ConnectionUpdate.clientFrame) {
               var7 = ConnectionUpdate.clientFrame.getInsets();
               Class51.clientCanvas.setLocation(-1703748163 * client.canvasX + var7.left, var7.top + -1448718273 * client.canvasY);
            } else {
               Class51.clientCanvas.setLocation(client.canvasX * -1703748163, client.canvasY * -1448718273);
            }
         } else {
            Class66_Sub1.method2794(-325923044);
         }

         if(var1 >= 2) {
            client.aBoolean_431 = true;
         } else {
            client.aBoolean_431 = false;
         }

         Class172.method2173(1226254424);
         if(client.anInt_468 * 1854782309 != -1) {
            Class211.method2659(true, -190910309);
         }

         if(client.gameConnectionHandler.getServerConnection() != null && Class547.method6103(-243034353 * client.loginStage, 977498490)) {
            Class271.method3559(239300538);
         }

         for(int var8 = 0; var8 < 112; ++var8) {
            client.aBooleanArray_525[var8] = true;
         }

         client.aBoolean_3906 = true;
      }
   }

   static final void method7376(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      CacheNodeArrayList.method6678(var3, var4, var0, -264649417);
   }
}
