
public class Class583 {

   int anInt_9708;
   Class559[] aClass559Array_9709;
   final CacheDataUnpacker aCacheUnpacker_9710;


   public Class559 method6327(int var1, int var2) {
      return this.aClass559Array_9709[var1];
   }

   int method6328(Class184 var1, int var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < -1799717069 * this.anInt_9708; ++var4) {
         Class559 var5 = this.method6327(var4, -919061434);
         if(var5.method6170(var1, (short)-530)) {
            var3 += var5.anInt_9566 * -1684904799;
         }
      }

      return var3;
   }

   public Class583(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, boolean var4) {
      this.aCacheUnpacker_9710 = var3;
      if(null != this.aCacheUnpacker_9710) {
         this.anInt_9708 = this.aCacheUnpacker_9710.method3575(-851327023 * Class124.aClass124_2284.anInt_2347, -1483394225) * 762942459;
      } else {
         this.anInt_9708 = 0;
      }

      if(var4) {
         this.aClass559Array_9709 = new Class559[this.anInt_9708 * -1799717069];

         for(int var5 = 0; var5 < this.anInt_9708 * -1799717069; ++var5) {
            CacheDataUnpacker var6 = this.aCacheUnpacker_9710;
            byte[] var7;
            synchronized(this.aCacheUnpacker_9710) {
               var7 = this.aCacheUnpacker_9710.getDataBytes(-851327023 * Class124.aClass124_2284.anInt_2347, var5, -1942407402);
            }

            Class559 var10 = new Class559();
            if(null != var7) {
               var10.method6173(new ByteArrayDataNode(var7), (short)13700);
            }

            var10.method6179((byte)0);
            this.aClass559Array_9709[var5] = var10;
            this.aClass559Array_9709[var5].aClass583_9559 = this;
         }
      }

   }

   static final void method6329(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class306.method3857(var3, var4, var0, 1569650044);
   }

   static void showFPSInfo(int var0, int var1, RSInterface rsInterface, byte var3) {
      int var4 = var0 + rsInterface.width * -533669195;
      int var5 = 15 + var1;
      if(client.fpsToggle) {
         int var6 = -256;
         if(2143956159 * client.fps < 20) {
            var6 = -65536;
         }

         CacheDataNode.aTextRenderer_3243.renderColourText("Fps:" + 2143956159 * client.fps, var4, var5, var6, -1, (byte)123);
         var5 += 15;
         Runtime var7 = Runtime.getRuntime();
         long var8 = var7.totalMemory() / 1024L;
         long var10 = var8 - var7.freeMemory() / 1024L;
         int var12 = -256;
         if(var10 > 262144L) {
            var12 = -65536;
         }

         CacheDataNode.aTextRenderer_3243.renderColourText("Mem:" + var10 + "/" + var8 + "k", var4, var5, var12, -1, (byte)33);
         var5 += 15;
         long var13 = client.gameConnectionHandler.connectionUpdate.getPing();
         String var15 = "N/A";
         if(-1L != var13) {
            var15 = var13 + "ms";
            if(var13 > 500L) {
               var15 = Class133.addTextColour(16711680, (byte)6) + var15 + Class133.addTextColour(16776960, (byte)6);
            }
         }

         CacheDataNode.aTextRenderer_3243.renderColourText("Game: In:" + client.gameConnectionHandler.bytesIn * 510494723 + "B/s " + "Out:" + -1080549959 * client.gameConnectionHandler.bytesOut + "B/s " + "Ping:" + var15, var4, var5, -256, -1, (byte)38);
         var5 += 15;
         long var16 = client.lobbyConnectionHandler.connectionUpdate.getPing();
         String var18 = "N/A";
         if(-1L != var16) {
            var18 = var16 + "ms";
            if(var16 > 500L) {
               var18 = Class133.addTextColour(16711680, (byte)6) + var18 + Class133.addTextColour(16776960, (byte)6);
            }
         }

         CacheDataNode.aTextRenderer_3243.renderColourText("Lobby: In:" + 510494723 * client.lobbyConnectionHandler.bytesIn + "B/s " + "Out:" + -1080549959 * client.lobbyConnectionHandler.bytesOut + "B/s " + "Ping:" + var18, var4, var5, -256, -1, (byte)11);
         var5 += 15;
         int var19 = Class286.gameRenderer.getHeap() / 1024;
         CacheDataNode.aTextRenderer_3243.renderColourText("Offheap:" + var19 + "k", var4, var5, var19 > 65536?-65536:-256, -1, (byte)59);
         var5 += 15;
         int var20 = 0;
         int var21 = 0;
         int var22 = 0;

         int var23;
         for(var23 = 0; var23 < Class300.cacheDataArray.length; ++var23) {
            if(Class300.cacheDataArray[var23] != null && Class300.cacheDataArray[var23].isInit()) {
               var20 += Class300.cacheDataArray[var23].getTotalSize((short)17166);
               var21 += Class300.cacheDataArray[var23].method5386(1126609778);
               var22 += Class300.cacheDataArray[var23].method5382(173652328);
            }
         }

         var23 = 0 == var20?0:var22 * 100 / var20;
         int var24 = var20 == 0?0:10000 * var21 / var20;
         String var25 = "Cache:" + Class91.method1202((long)var24, 2, true, LanguagePack.aClass526_9276, -746535945) + "% (" + var23 + "%)";
         Class585.aTextRenderer_9728.renderColourText(var25, var4, var5, -256, -1, (byte)86);
         var5 += 12;
      }

   }

   static final void method6331(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      client.aShort_414 = (short)var0.intTypes[var0.intTypeIndex * -831324111];
      if(client.aShort_414 <= 0) {
         client.aShort_414 = 256;
      }

      client.aShort_554 = (short)var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      if(client.aShort_554 <= 0) {
         client.aShort_554 = 205;
      }

   }
}
