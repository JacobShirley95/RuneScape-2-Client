
final class Class5 implements Class264 {

   public static CacheDataUnpacker aCacheUnpacker_31;


   public boolean method3511(PositionEntity var1, byte var2) {
      return var1 instanceof Class218;
   }

   static final void method26(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 > var3?var2:var3;
   }

   static boolean method27(CharSequence var0, int var1, boolean var2, int var3) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if(var8 == 0) {
               if(45 == var9) {
                  var4 = true;
                  continue;
               }

               if(var9 == 43 && var2) {
                  continue;
               }
            }

            int var11;
            if(var9 >= 48 && var9 <= 57) {
               var11 = var9 - 48;
            } else if(var9 >= 65 && var9 <= 90) {
               var11 = var9 - 55;
            } else {
               if(var9 < 97 || var9 > 122) {
                  return false;
               }

               var11 = var9 - 87;
            }

            if(var11 >= var1) {
               return false;
            }

            if(var4) {
               var11 = -var11;
            }

            int var10 = var1 * var6 + var11;
            if(var6 != var10 / var1) {
               return false;
            }

            var6 = var10;
            var5 = true;
         }

         return var5;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static String method28(int[] var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      int var3 = -632402179 * Class374.nameIconsCount;

      for(int var4 = 0; var4 < var0.length; ++var4) {
         Class559 var5 = HintMarker.aClass583_3709.method6327(var0[var4], 37663893);
         if(-1 != var5.anInt_9564 * -674679857) {
            Sprite var6 = (Sprite)Class18.aClass627_176.getObject((long)(-674679857 * var5.anInt_9564));
            if(var6 == null) {
               AbstractImageData var7 = ImageUtils.getImageData(Class301.mmUnpacker, var5.anInt_9564 * -674679857, 0);
               if(null != var7) {
                  var6 = Class286.gameRenderer.loadSprite(var7, true);
                  Class18.aClass627_176.insert(var6, (long)(-674679857 * var5.anInt_9564));
               }
            }

            if(var6 != null) {
               Class20.imgNameIcons[var3] = var6;
               var2.append(" <img=").append(var3).append(">");
               ++var3;
            }
         }
      }

      return var2.toString();
   }

   public static int method29(CacheDataUnpacker var0, int var1) {
      int var2 = 0;
      if(var0.hasData(-1848916943 * Class1.headIconsPK, -883205750)) {
         ++var2;
      }

      if(var0.hasData(Class1.headIconsPrayer * 71618371, -519840136)) {
         ++var2;
      }

      if(var0.hasData(Class212_Sub1_Sub1.hintHeadicons * -1537474119, -128668802)) {
         ++var2;
      }

      if(var0.hasData(-2012069383 * Class1.hintMarkersOffset, -86402721)) {
         ++var2;
      }

      if(var0.hasData(Class1.flagCacheOffset * -34066357, 123458509)) {
         ++var2;
      }

      if(var0.hasData(537518605 * ChatMessageCache.crossOffset, 1029645529)) {
         ++var2;
      }

      if(var0.hasData(Class1.mapDotsOffset * 1394677195, -1620592305)) {
         ++var2;
      }

      if(var0.hasData(745788973 * Class1.nameIconsOffset, 1404284868)) {
         ++var2;
      }

      if(var0.hasData(IndexNode.floorShadowsOffset * -1618573767, 1977429223)) {
         ++var2;
      }

      if(var0.hasData(Class278.compassCacheOffset * -1167234361, 915390637)) {
         ++var2;
      }

      if(var0.hasData(Class602.otherLevelOffset * 1205360691, 1741873425)) {
         ++var2;
      }

      if(var0.hasData(-2088428725 * AbstractServerConnection.mapEdgeHintOffset, 1188126691)) {
         ++var2;
      }

      return var2;
   }

   static final void method30(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub19_7300.method6082(var2, 742284712);
   }

   static final void method31(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class630.method6690(var3, var4, var0, 1492612708);
   }
}
