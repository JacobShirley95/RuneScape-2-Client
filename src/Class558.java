
public class Class558 {

   final CacheNodeArrayList aClass627_9553 = new CacheNodeArrayList(60);
   final CacheDataUnpacker aCacheUnpacker_9554;
   final CacheNodeArrayList aClass627_9555 = new CacheNodeArrayList(64);
   final CacheDataUnpacker aCacheUnpacker_9556;
   int anInt_9557;
   static int optionsBoxWidth;


   public void method6160(int var1, byte var2) {
      this.anInt_9557 = var1 * -1559055301;
      CacheNodeArrayList var3 = this.aClass627_9553;
      synchronized(this.aClass627_9553) {
         this.aClass627_9553.method6669(-1992229463);
      }
   }

   public void method6161(int var1) {
      CacheNodeArrayList var2 = this.aClass627_9555;
      synchronized(this.aClass627_9555) {
         this.aClass627_9555.method6669(1728049488);
      }

      var2 = this.aClass627_9553;
      synchronized(this.aClass627_9553) {
         this.aClass627_9553.method6669(-777629142);
      }
   }

   public void method6162(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_9555;
      synchronized(this.aClass627_9555) {
         this.aClass627_9555.method6677(var1, -1053062575);
      }

      var3 = this.aClass627_9553;
      synchronized(this.aClass627_9553) {
         this.aClass627_9553.method6677(var1, -1216177360);
      }
   }

   public void method6163(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_9555;
      synchronized(this.aClass627_9555) {
         this.aClass627_9555.method6665((byte)5);
      }

      var2 = this.aClass627_9553;
      synchronized(this.aClass627_9553) {
         this.aClass627_9553.method6665((byte)5);
      }
   }

   public Class558(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, CacheDataUnpacker var4) {
      this.aCacheUnpacker_9556 = var3;
      this.aCacheUnpacker_9554 = var4;
      int var5 = this.aCacheUnpacker_9556.method3581((short)-16719) - 1;
      Class124.aClass124_2289.method1574(447296872);
      this.aCacheUnpacker_9556.method3575(var5, -2100463286);
   }

   public Class567 method6164(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_9555;
      Class567 var4;
      synchronized(this.aClass627_9555) {
         var4 = (Class567)this.aClass627_9555.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_9556;
         byte[] var11;
         synchronized(this.aCacheUnpacker_9556) {
            var11 = this.aCacheUnpacker_9556.getDataBytes(Class124.aClass124_2289.method1575(var1, 557552797), Class124.aClass124_2289.method1573(var1, (byte)96), -1300808212);
         }

         var4 = new Class567();
         var4.aClass558_9618 = this;
         var4.id = 1417824327 * var1;
         if(null != var11) {
            var4.method6239(new ByteArrayDataNode(var11), 257445846);
         }

         CacheNodeArrayList var12 = this.aClass627_9555;
         synchronized(this.aClass627_9555) {
            this.aClass627_9555.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public static int method6165(CharSequence var0, CharSequence var1, int var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      if(0 == var3) {
         return var4;
      } else if(0 == var4) {
         return var3;
      } else {
         int[] var5 = new int[1 + var3];
         int[] var6 = new int[1 + var3];

         int var7;
         for(var7 = 0; var7 <= var3; var5[var7] = var7++) {
            ;
         }

         for(var7 = 1; var7 <= var4; ++var7) {
            var6[0] = var7;
            char var8 = var1.charAt(var7 - 1);

            for(int var9 = 1; var9 <= var3; ++var9) {
               var6[var9] = Math.min(Math.min(1 + var6[var9 - 1], var5[var9] + 1), var5[var9 - 1] + (var0.charAt(var9 - 1) == var8?0:1));
            }

            int[] var10 = var5;
            var5 = var6;
            var6 = var10;
         }

         return var5[var3];
      }
   }

   static final void method6166(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[863838783 * var0.stringDataIndex];
      String var3 = (String)var0.stringData[1 + var0.stringDataIndex * 863838783];
      if(null != Class521.myPlayer.composite && Class521.myPlayer.composite.aBoolean_9852) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2;
      }

   }

   static byte method6167(int var0, int var1, int var2) {
      return (byte)(var0 != -1965975883 * Class495.aClass495_9043.anInt_9062?0:(0 == (var1 & 1)?1:2));
   }

   static void loadWorldMap(Renderer renderer, Class163 var1, int var2, int var3, int var4, int var5, byte var6) {
      if(-1761614089 * Class248_Sub1.worldMapLoadPercent < 100) {
         Class34_Sub1.loadWorldMap(renderer, var1, 293455236);
      }

      renderer.method1965(var2, var3, var4 + var2, var5 + var3);
      int var8;
      int var9;
      if(-1761614089 * Class248_Sub1.worldMapLoadPercent < 100) {
         byte var17 = 20;
         var8 = var4 / 2 + var2;
         var9 = var3 + var5 / 2 - 18 - var17;
         renderer.drawOutline(var2, var3, var4, var5, -16777216, 0);
         renderer.method1920(var8 - 152, var9, 304, 34, client.loadingColours[435081651 * client.anInt_276].getRGB(), 0);
         renderer.drawOutline(var8 - 150, var9 + 2, -989874971 * Class248_Sub1.worldMapLoadPercent, 30, client.aColorArray_323[client.anInt_276 * 435081651].getRGB(), 0);
         MouseHandler.aTextRenderer_6379.method1063(ServerString.loadingStr2.getText(Class599.clientLanguage, -28427541), var8, var17 + var9, client.aColorArray_325[client.anInt_276 * 435081651].getRGB(), -1, (short)-12406);
      } else {
         int var7 = -1850250531 * Class107.viewOfMapImageX - (int)((float)var4 / Class248_Sub1.mapZoomScaleX);
         var8 = 1377436059 * AbstractUpdateServerConnector.viewOfMapImageY + (int)((float)var5 / Class248_Sub1.mapZoomScaleX);
         var9 = Class107.viewOfMapImageX * -1850250531 + (int)((float)var4 / Class248_Sub1.mapZoomScaleX);
         int var10 = AbstractUpdateServerConnector.viewOfMapImageY * 1377436059 - (int)((float)var5 / Class248_Sub1.mapZoomScaleX);
         Class522.viewOfMapX = (-1850250531 * Class107.viewOfMapImageX - (int)((float)var4 / Class248_Sub1.mapZoomScaleX)) * -1122039013;
         Class206.viewOfMapY = (1377436059 * AbstractUpdateServerConnector.viewOfMapImageY - (int)((float)var5 / Class248_Sub1.mapZoomScaleX)) * -1912673297;
         Class240_Sub47.visibleTilesX = (int)((float)(2 * var4) / Class248_Sub1.mapZoomScaleX) * -1370853317;
         Class129.visibleTilesY = (int)((float)(2 * var5) / Class248_Sub1.mapZoomScaleX) * 1843037071;
         Class248_Sub1.method3176(var7 + Class248_Sub1.anInt_4120, Class248_Sub1.anInt_4124 + var8, var9 + Class248_Sub1.anInt_4120, var10 + Class248_Sub1.anInt_4124, var2, var3, var2 + var4, 1 + var3 + var5);
         Class248_Sub1.method3174(renderer);
         NodeList var11 = Class248_Sub1.method3165(renderer);
         Class80.drawMapIcons(renderer, var11, 0, 0, (byte)-50);
         if(-325125283 * Class533.anInt_9358 > 0) {
            Class467.anInt_8690 -= -919466193;
            if(0 == Class467.anInt_8690 * -2092984369) {
               Class533.anInt_9358 -= 471347445;
               Class467.anInt_8690 = -1209454676;
            }
         }

         if(client.fpsToggle) {
            int var12 = var2 + var4 - 5;
            int var13 = var5 + var3 - 8;
            CacheDataNode.aTextRenderer_3243.renderColourText("Fps:" + 2143956159 * ClientSuper.fps, var12, var13, 16776960, -1, (byte)26);
            var13 -= 15;
            Runtime var14 = Runtime.getRuntime();
            int var15 = (int)((var14.totalMemory() - var14.freeMemory()) / 1024L);
            int var16 = 16776960;
            if(var15 > 65536) {
               var16 = 16711680;
            }

            CacheDataNode.aTextRenderer_3243.renderColourText("Mem:" + var15 + "k", var12, var13, var16, -1, (byte)59);
            var13 -= 15;
         }

      }
   }

   static final void method6169(RSInterfaceData var0, short var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -2091052697 * Class11.anInt_96;
   }
}
