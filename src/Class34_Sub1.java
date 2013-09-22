
public class Class34_Sub1 extends Class34 {

   Sprite aClass170_3741;
   public static int anInt_3742;


   public void method812(short var1) {
      super.method812((short)8195);
      this.aClass170_3741 = FontRenderer.method1079(this.aCacheUnpacker_825, -733617721 * ((Class409_Sub2)this.aClass409_827).anInt_3823, -1260739609);
   }

   void method256(boolean var1, int var2, int var3, int var4) {
      int var5 = this.method253((byte)-127) * 1912610703 * this.aClass409_827.anInt_7764 / 10000;
      int[] var6 = new int[4];
      Class286.gameRenderer.method1913(var6);
      Class286.gameRenderer.method1965(var2, var3 + 2, var5 + var2, this.aClass409_827.anInt_7765 * 1854937727 + var3);
      this.aClass170_3741.method2131(var2, var3 + 2, this.aClass409_827.anInt_7764 * 1912610703, 1854937727 * this.aClass409_827.anInt_7765);
      Class286.gameRenderer.method1965(var6[0], var6[1], var6[2], var6[3]);
   }

   public boolean method811(byte var1) {
      return !super.method811((byte)56)?false:this.aCacheUnpacker_825.hasData(((Class409_Sub2)this.aClass409_827).anInt_3823 * -733617721, 33124285);
   }

   void method257(boolean var1, int var2, int var3, int var4) {
      Class286.gameRenderer.method1920(var2 - 2, var3, 4 + this.aClass409_827.anInt_7764 * 1912610703, this.aClass409_827.anInt_7765 * 1854937727 + 2, 1920046485 * ((Class409_Sub2)this.aClass409_827).anInt_3822, 0);
      Class286.gameRenderer.method1920(var2 - 1, var3 + 1, 2 + this.aClass409_827.anInt_7764 * 1912610703, 1854937727 * this.aClass409_827.anInt_7765, 0, 0);
   }

   Class34_Sub1(CacheDataUnpacker var1, CacheDataUnpacker var2, Class409_Sub2 var3) {
      super(var1, var2, var3);
   }

   static final void method2708(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class3.method17(var3, var4, var0, (byte)0);
   }

   static final void loadWorldMap(Renderer var0, Class163 var1, int var2) {
      if(null != Class248_Sub1.currentWorldArea) {
         Class373.getCurrentTime((short)23569);
         Class373.getCurrentTime((short)11140);
         if(-1761614089 * Class248_Sub1.worldMapLoadPercent < 10) {
            if(!Class248_Sub1.aCacheUnpacker_4111.loadDataEntry(Class248_Sub1.currentWorldArea.identifier, 2074234502)) {
               Class248_Sub1.worldMapLoadPercent = CacheDownload.cache23Unpacker.getPercentLoaded(Class248_Sub1.currentWorldArea.identifier, (byte)38) / 10 * 870103751;
               return;
            }

            Class608.method6554(-1264658422);
            Class248_Sub1.worldMapLoadPercent = 111102918;
         }

         if(Class248_Sub1.worldMapLoadPercent * -1761614089 == 10) {
            Class248_Sub1.anInt_4120 = Class248_Sub1.currentWorldArea.anInt_3515 * 424964861 >> 6 << 6;
            Class248_Sub1.anInt_4124 = Class248_Sub1.currentWorldArea.anInt_3520 * 1212870597 >> 6 << 6;
            Class248_Sub1.maxMapTilesX = (62427907 * Class248_Sub1.currentWorldArea.anInt_3512 >> 6 << 6) - Class248_Sub1.anInt_4120 + 64;
            Class248_Sub1.maxMapTilesY = 64 + ((525149733 * Class248_Sub1.currentWorldArea.anInt_3522 >> 6 << 6) - Class248_Sub1.anInt_4124);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            GameCoord var6 = Class521.myPlayer.method6203().gameCoord;
            MapPoint var7 = client.aClass296_348.getMapArea();
            if(Class248_Sub1.currentWorldArea.method2574(Class521.myPlayer.plane, 1265321541 * var7.loadedMapX + ((int)var6.floatX >> 9), -1996781083 * var7.loadedMapY + ((int)var6.floatZ >> 9), var3, 3418348)) {
               var4 = var3[1] - Class248_Sub1.anInt_4120;
               var5 = var3[2] - Class248_Sub1.anInt_4124;
            }

            if(!Class248_Sub1.aBoolean_6452 && var4 >= 0 && var4 < Class248_Sub1.maxMapTilesX && var5 >= 0 && var5 < Class248_Sub1.maxMapTilesY) {
               var4 += (int)(Math.random() * 10.0D) - 5;
               var5 += (int)(Math.random() * 10.0D) - 5;
               Class107.viewOfMapImageX = var4 * 745782645;
               AbstractUpdateServerConnector.viewOfMapImageY = -394363757 * var5;
            } else if(1343811915 * Class248_Sub1.anInt_6449 != -1 && -1 != -651520625 * Class248_Sub1.anInt_6445) {
               Class248_Sub1.currentWorldArea.method2572(Class248_Sub1.anInt_6449 * 1343811915, -651520625 * Class248_Sub1.anInt_6445, var3, (byte)-48);
               if(null != var3) {
                  Class107.viewOfMapImageX = (var3[1] - Class248_Sub1.anInt_4120) * 745782645;
                  AbstractUpdateServerConnector.viewOfMapImageY = -394363757 * (var3[2] - Class248_Sub1.anInt_4124);
               }

               Class248_Sub1.anInt_6445 = -1408690543;
               Class248_Sub1.anInt_6449 = 2146299805;
               Class248_Sub1.aBoolean_6452 = false;
            } else {
               Class248_Sub1.currentWorldArea.method2572(Class248_Sub1.currentWorldArea.mapArea * 1801996141 >> 14 & 16383, 1801996141 * Class248_Sub1.currentWorldArea.mapArea & 16383, var3, (byte)21);
               Class107.viewOfMapImageX = (var3[1] - Class248_Sub1.anInt_4120) * 745782645;
               AbstractUpdateServerConnector.viewOfMapImageY = -394363757 * (var3[2] - Class248_Sub1.anInt_4124);
            }

            if(37 == -1998615479 * Class248_Sub1.currentWorldArea.zoomPercent) {
               Class248_Sub1.mapZoomScaleX = 3.0F;
               Class248_Sub1.mapZoomScaleY = 3.0F;
            } else if(-1998615479 * Class248_Sub1.currentWorldArea.zoomPercent == 50) {
               Class248_Sub1.mapZoomScaleX = 4.0F;
               Class248_Sub1.mapZoomScaleY = 4.0F;
            } else if(75 == -1998615479 * Class248_Sub1.currentWorldArea.zoomPercent) {
               Class248_Sub1.mapZoomScaleX = 6.0F;
               Class248_Sub1.mapZoomScaleY = 6.0F;
            } else if(-1998615479 * Class248_Sub1.currentWorldArea.zoomPercent == 100) {
               Class248_Sub1.mapZoomScaleX = 8.0F;
               Class248_Sub1.mapZoomScaleY = 8.0F;
            } else if(200 == Class248_Sub1.currentWorldArea.zoomPercent * -1998615479) {
               Class248_Sub1.mapZoomScaleX = 16.0F;
               Class248_Sub1.mapZoomScaleY = 16.0F;
            } else {
               Class248_Sub1.mapZoomScaleX = 8.0F;
               Class248_Sub1.mapZoomScaleY = 8.0F;
            }

            Class248_Sub1.anInt_4116 = (int)Class248_Sub1.mapZoomScaleX >> 1;
            Class248_Sub1.aByteArrayArrayArray_4115 = Class240_Sub4_Sub2.method284(Class248_Sub1.anInt_4116, -47351612);
            RenderSettings.method4829(828320707);
            Class248_Sub1.method3155();
            IgnoredPlayer.aNodeList_114 = new NodeList();
            Class248_Sub1.anInt_4139 += (int)(Math.random() * 5.0D) - 2;
            if(Class248_Sub1.anInt_4139 < -8) {
               Class248_Sub1.anInt_4139 = -8;
            }

            if(Class248_Sub1.anInt_4139 > 8) {
               Class248_Sub1.anInt_4139 = 8;
            }

            Class248_Sub1.anInt_4129 += (int)(Math.random() * 5.0D) - 2;
            if(Class248_Sub1.anInt_4129 < -16) {
               Class248_Sub1.anInt_4129 = -16;
            }

            if(Class248_Sub1.anInt_4129 > 16) {
               Class248_Sub1.anInt_4129 = 16;
            }

            Class248_Sub1.method3158(var1, Class248_Sub1.anInt_4139 >> 2 << 10, Class248_Sub1.anInt_4129 >> 1);
            Class248_Sub1.mapIconUnpacker.init(1024, 256);
            Class248_Sub1.aClass445_4107.method5490(256, 256, -1855873730);
            Class248_Sub1.aClass529_4105.method6018(4096, 1494744909);
            Class603.aClass212_Sub2_9897.method7530(256, (short)-4997);
            Class248_Sub1.worldMapLoadPercent = 222205836;
         } else if(Class248_Sub1.worldMapLoadPercent * -1761614089 == 20) {
            Class18.method99(true, 393324248);
            Class248_Sub1.method3168(var0, Class248_Sub1.anInt_4139, Class248_Sub1.anInt_4129);
            Class248_Sub1.worldMapLoadPercent = 666617508;
            Class18.method99(true, 2065868443);
            Class77.method983(2141511356);
         } else if(Class248_Sub1.worldMapLoadPercent * -1761614089 == 60) {
            if(Class248_Sub1.aCacheUnpacker_4111.entryExists(Class248_Sub1.currentWorldArea.identifier + "_staticelements", (byte)-59)) {
               if(!Class248_Sub1.aCacheUnpacker_4111.loadDataEntry(Class248_Sub1.currentWorldArea.identifier + "_staticelements", 2118873738)) {
                  return;
               }

               Class248_Sub1.staticElements = Class486.method5740(Class248_Sub1.aCacheUnpacker_4111, Class248_Sub1.currentWorldArea.identifier + "_staticelements", client.aBoolean_270, -1225838433);
            } else {
               Class248_Sub1.staticElements = new MapElements(0);
            }

            Class248_Sub1.method3161();
            Class248_Sub1.worldMapLoadPercent = 777720426;
            Class18.method99(true, -1940111404);
            Class77.method983(2143402114);
         } else if(-1761614089 * Class248_Sub1.worldMapLoadPercent == 70) {
            Class204.aClass198_3538 = new WorldMapText(var0, 11, true, Class51.clientCanvas);
            Class248_Sub1.worldMapLoadPercent = -906935617;
            Class18.method99(true, 429464445);
            Class77.method983(2065348926);
         } else if(73 == -1761614089 * Class248_Sub1.worldMapLoadPercent) {
            Class346.aClass198_6569 = new WorldMapText(var0, 12, true, Class51.clientCanvas);
            Class248_Sub1.worldMapLoadPercent = 1703375636;
            Class18.method99(true, -1375398407);
            Class77.method983(2091359760);
         } else if(Class248_Sub1.worldMapLoadPercent * -1761614089 == 76) {
            Class240_Sub22_Sub17.aClass198_8437 = new WorldMapText(var0, 14, true, Class51.clientCanvas);
            Class248_Sub1.worldMapLoadPercent = 18719593;
            Class18.method99(true, 1545215934);
            Class77.method983(2145133889);
         } else if(79 == Class248_Sub1.worldMapLoadPercent * -1761614089) {
            Class254.aClass198_4402 = new WorldMapText(var0, 17, true, Class51.clientCanvas);
            Class248_Sub1.worldMapLoadPercent = -1665936450;
            Class18.method99(true, 1424968386);
            Class77.method983(2093639818);
         } else if(82 == Class248_Sub1.worldMapLoadPercent * -1761614089) {
            Class445.aClass198_8521 = new WorldMapText(var0, 19, true, Class51.clientCanvas);
            Class248_Sub1.worldMapLoadPercent = 944374803;
            Class18.method99(true, -1109707351);
            Class77.method983(2140460756);
         } else if(-1761614089 * Class248_Sub1.worldMapLoadPercent == 85) {
            Class240_Sub19.aClass198_7179 = new WorldMapText(var0, 22, true, Class51.clientCanvas);
            Class248_Sub1.worldMapLoadPercent = -740281240;
            Class18.method99(true, -1754121476);
            Class77.method983(2092990110);
         } else if(88 == Class248_Sub1.worldMapLoadPercent * -1761614089) {
            Class509.aClass198_9183 = new WorldMapText(var0, 26, true, Class51.clientCanvas);
            Class248_Sub1.worldMapLoadPercent = 1870030013;
            Class18.method99(true, 1682933604);
            Class77.method983(2062342521);
         } else {
            Class240_Sub28.aClass198_7385 = new WorldMapText(var0, 30, true, Class51.clientCanvas);
            Class248_Sub1.worldMapLoadPercent = 1111029180;
            Class18.method99(true, 513654558);
            Class77.method983(2047549313);
            System.gc();
         }
      }
   }
}
