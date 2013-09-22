
public abstract class Class110 {

   abstract void method1410(int var1);

   public static Class411 method1411(int var0, int var1) {
      Class411 var2 = (Class411)Class411.aClass627_7812.getObject((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class411.aCacheUnpacker_7786.getDataBytes(0, var0, 104535751);
         var2 = new Class411();
         if(null != var3) {
            var2.method5067(new ByteArrayDataNode(var3), 443363536);
         }

         var2.method5068(-817848747);
         Class411.aClass627_7812.insert(var2, (long)var0);
         return var2;
      }
   }

   static void method1412(Class262 var0, int var1) {
      while(Class267.aLinkedList_4640.size() > 10) {
         Class267.aLinkedList_4640.remove();
      }

      Class267.aLinkedList_4640.add(var0);
   }

   static final void method1413(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class545.method6096(var3, var4, var0, (short)27042);
   }

   static void method1414(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111 - 3];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 - 2];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex - 1];
      var0.intTypeIndex -= -2124084621;
      if(var2 > var0.anIntArray_9495[var3]) {
         throw new RuntimeException();
      } else if(var2 > var0.anIntArray_9495[var4]) {
         throw new RuntimeException();
      } else if(var3 == var4) {
         throw new RuntimeException();
      } else {
         Exception_Sub3.method1361(var0.anIntArrayArray_9496[var3], var0.anIntArrayArray_9496[var4], 0, var2 - 1, (byte)83);
      }
   }

   static final void method1415(Renderer var0, int var1, int var2, int var3, int var4, byte var5) {
      var0.method1965(var1, var2, var3 + var1, var4 + var2);
      var0.method1915(var1, var2, var3, var4, -16777216, (byte)54);
      if(Class248_Sub1.worldMapLoadPercent * -1761614089 >= 100) {
         float var6 = (float)Class248_Sub1.maxMapTilesY / (float)Class248_Sub1.maxMapTilesX;
         int var7 = var3;
         int var8 = var4;
         if(var6 < 1.0F) {
            var8 = (int)(var6 * (float)var3);
         } else {
            var7 = (int)((float)var4 / var6);
         }

         var1 += (var3 - var7) / 2;
         var2 += (var4 - var8) / 2;
         if(Class621.aClass170_10032 == null || Class621.aClass170_10032.getWidth() != var3 || Class621.aClass170_10032.getHeight() != var4) {
            Class248_Sub1.method3176(Class248_Sub1.anInt_4120, Class248_Sub1.anInt_4124 + Class248_Sub1.maxMapTilesY, Class248_Sub1.anInt_4120 + Class248_Sub1.maxMapTilesX, Class248_Sub1.anInt_4124, var1, var2, var1 + var7, var2 + var8);
            Class248_Sub1.method3174(var0);
            Class621.aClass170_10032 = var0.method1932(var1, var2, var7, var8, false);
         }

         Class621.aClass170_10032.drawAt(var1, var2);
         int var9 = 617015539 * Class240_Sub47.visibleTilesX * var7 / Class248_Sub1.maxMapTilesX;
         int var10 = var8 * -341755025 * Class129.visibleTilesY / Class248_Sub1.maxMapTilesY;
         int var11 = var1 + var7 * 277108499 * Class522.viewOfMapX / Class248_Sub1.maxMapTilesX;
         int var12 = var2 + var8 - var8 * 1687790351 * Class206.viewOfMapY / Class248_Sub1.maxMapTilesY - var10;
         int var13 = -1996554240;
         if(GamePack.stellardawnPack == client.currentGamePack) {
            var13 = -1996488705;
         }

         var0.drawOutline(var11, var12, var9, var10, var13, 1);
         var0.method1920(var11, var12, var9, var10, var13, 0);
         if(Class533.anInt_9358 * -325125283 > 0) {
            int var14;
            if(Class467.anInt_8690 * -2092984369 > 50) {
               var14 = 500 - Class467.anInt_8690 * -1874987253;
            } else {
               var14 = -1874987253 * Class467.anInt_8690;
            }

            for(Class240_Sub12 var15 = (Class240_Sub12)Class248_Sub1.aNodeList_4122.getBaseNode_2((byte)47); null != var15; var15 = (Class240_Sub12)Class248_Sub1.aNodeList_4122.getNext(-465237293)) {
               MapIcon var16 = Class248_Sub1.mapIconUnpacker.loadIcon(781228131 * var15.anInt_6801);
               if(Class540_Sub16.method1784(var16, -1530230030)) {
                  int var17;
                  int var18;
                  if(Class248_Sub1.anInt_6453 * 1615039673 == var15.anInt_6801 * 781228131) {
                     var17 = var1 + var7 * var15.anInt_6802 * -1889789653 / Class248_Sub1.maxMapTilesX;
                     var18 = var8 * (Class248_Sub1.maxMapTilesY - -526841819 * var15.anInt_6803) / Class248_Sub1.maxMapTilesY + var2;
                     var0.method1915(var17 - 2, var18 - 2, 4, 4, var14 << 24 | 16776960, (byte)-56);
                  } else if(-1536384619 * Class248_Sub1.anInt_6454 != -1 && var16.anInt_10004 * 1297612527 == Class248_Sub1.anInt_6454 * -1536384619) {
                     var17 = var15.anInt_6802 * -1889789653 * var7 / Class248_Sub1.maxMapTilesX + var1;
                     var18 = var8 * (Class248_Sub1.maxMapTilesY - -526841819 * var15.anInt_6803) / Class248_Sub1.maxMapTilesY + var2;
                     var0.method1915(var17 - 2, var18 - 2, 4, 4, var14 << 24 | 16776960, (byte)21);
                  }
               }
            }
         }

      }
   }

   public static void method1416(byte var0) {
      Class109.aMap_2042.clear();
      Class109.aNodeArrayList_2041.method5938(1581984770);
      Class109.anInt_2043 = 0;
   }
}
