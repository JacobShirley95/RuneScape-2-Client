import java.io.IOException;

public abstract class Class125 implements Class72 {

   protected String aString_2350;
   protected String aString_2351 = null;
   protected String aString_2352;


   abstract void method1587(Class240_Sub50_Sub1 var1, ArrayViewport var2);

   public abstract boolean method1588();

   abstract void method1589(Class240_Sub50_Sub1 var1, float var2);

   abstract void method1590(Class240_Sub50_Sub1 var1, float var2, float var3);

   abstract void method1591(Class240_Sub50_Sub1 var1, float var2, float var3, float var4);

   abstract void method1592(Class240_Sub50_Sub1 var1, float var2, float var3, float var4, float var5);

   abstract void method1593(Class240_Sub50_Sub1 var1, float[] var2, int var3);

   abstract void method1594(int var1, float[] var2, int var3);

   abstract void method1595(Class240_Sub50_Sub1 var1, int var2, Class403 var3);

   abstract void method1596(int var1, float var2, float var3, float var4, float var5);

   abstract void method1597(int var1, ArrayViewport var2);

   abstract void method1598(int var1, ArrayViewport var2);

   abstract void method1599(int var1, int var2, Class403 var3);

   abstract void method1600(int var1, float var2, float var3, float var4);

   String method1601(int var1) {
      return this.aString_2351;
   }

   abstract void method1602(Class240_Sub50_Sub1 var1, ArrayViewport var2);

   abstract void method1603(int var1, ArrayViewport var2);

   static final void method1604(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class192.method2510(var3, var4, var0, (byte)7);
   }

   static final void method1605(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1111653847 * var3.anInt_2437;
   }

   static final void method1606(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub18_7280.method6082(var2, -1757209990);
   }

   public static int method1607(int var0, int var1) {
      int var2 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var0 + var2;
   }

   public static final void method1608(boolean var0, byte var1) {
      ConnectionHandler[] var2 = client.openConnections;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         ConnectionHandler var4 = var2[var3];

         try {
            var4.method2541((byte)-61);
         } catch (IOException var7) {
            ;
         }

         var4.method2545((byte)79);
      }

      Class206.method2615(-410223110);
      Class416.method5154(false, (byte)26);
      client.aClass296_348.method3787((short)13025);
      client.aClass296_348.method3761(-1603116076);
      Class494.method5780(false, -1626899059);
      Class344.method4268((byte)8);
      Class240_Sub22_Sub10.method2609(2, -1490543891);
      Class217.anInt_3752 = 255660039;
      Class217.aBoolean_3748 = false;
      Class134.method1792(-283598210);
      Class357.method4549(true, (byte)82);
      Class522.method5977(-2087712102);
      Class599.method6486((short)-6710);
      Class79.method1045(-1039661286);
      client.anInt_438 = -1563670163;
      if(var0) {
         Class418.method5190(8, (byte)-117);
      } else {
         Class418.method5190(5, (byte)-111);

         try {
            Class480.method5701(Class481.clientApplet, "loggedout", 497131694);
         } catch (Throwable var6) {
            ;
         }
      }

   }

   public static void method1609(String var0, short var1) {
      if(3 == -243034353 * client.loginStage) {
         Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6271, client.lobbyConnectionHandler.aClass528_3433, 1917447504);
         var2.aClass240_Sub8_Sub1_7370.method4463(0, 469462072);
         int var3 = 964952859 * var2.aClass240_Sub8_Sub1_7370.index;
         var2.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-7);
         var2.aClass240_Sub8_Sub1_7370.index += -1419617915;
         var2.aClass240_Sub8_Sub1_7370.method4496(Class3.anIntArray_27, var3, 964952859 * var2.aClass240_Sub8_Sub1_7370.index, -763494346);
         var2.aClass240_Sub8_Sub1_7370.method4472(964952859 * var2.aClass240_Sub8_Sub1_7370.index - var3, -452127763);
         client.lobbyConnectionHandler.addPacket(var2, 25642081);
         Class3.aClass520_21 = Class520.aClass520_9237;
      }
   }

   static void putHintMarkersOnMM(int var0, int var1, RSInterface var2, Class126 var3, int var4, int var5, int var6) {
      HintMarker[] var7 = client.hintMarkers;

      for(int var8 = 0; var8 < var7.length; ++var8) {
         HintMarker var9 = var7[var8];
         if(null != var9 && -2076198275 * var9.anInt_3702 != 0 && client.timer * -1025618511 % 20 < 10) {
            int mmX;
            if(var9.anInt_3702 * -2076198275 == 1) {
               Class240_Sub9 var10 = (Class240_Sub9)client.npcNodeList.getNode((long)(-1369728825 * var9.markerTarget));
               if(null != var10) {
                  NPC var11 = (NPC)var10.anObject_6783;
                  GameCoord var12 = var11.method6203().gameCoord;
                  mmX = (int)var12.floatX / 128 - var0 / 128;
                  int mmY = (int)var12.floatZ / 128 - var1 / 128;
                  IteratorNodeList.showMMHintMarker(var2, var3, var4, var5, mmX, mmY, -611466427 * var9.spriteIndex, 360000L);
               }
            }

            if(-2076198275 * var9.anInt_3702 == 2) {
               int var18 = var9.markerX * 1139126719 / 128 - var0 / 128;
               int var17 = 1450308353 * var9.markerZ / 128 - var1 / 128;
               long var15 = (long)(-77486569 * var9.anInt_3705 << 7);
               var15 *= var15;
               IteratorNodeList.showMMHintMarker(var2, var3, var4, var5, var18, var17, var9.spriteIndex * -611466427, var15);
            }

            if(var9.anInt_3702 * -2076198275 == 10 && -1369728825 * var9.markerTarget >= 0 && -1369728825 * var9.markerTarget < client.aPlayerArray.length) {
               Player var19 = client.aPlayerArray[var9.markerTarget * -1369728825];
               if(var19 != null) {
                  GameCoord var21 = var19.method6203().gameCoord;
                  int var20 = (int)var21.floatX / 128 - var0 / 128;
                  mmX = (int)var21.floatZ / 128 - var1 / 128;
                  IteratorNodeList.showMMHintMarker(var2, var3, var4, var5, var20, mmX, -611466427 * var9.spriteIndex, 360000L);
               }
            }
         }
      }

   }

   static void method1611(RSInterface[] var0, RSInterface var1, boolean var2, byte var3) {
      int var4 = 0 != var1.anInt_2453 * -1912683305?-1912683305 * var1.anInt_2453:var1.width * -533669195;
      int var5 = 0 != 972244665 * var1.anInt_2454?var1.anInt_2454 * 972244665:var1.height * 1833812087;
      Class104_Sub7.method3379(var0, var1.cacheID * 1278853609, var4, var5, var2, -603580365);
      if(var1.children != null) {
         Class104_Sub7.method3379(var1.children, var1.cacheID * 1278853609, var4, var5, var2, -603580365);
      }

      Class240_Sub16 var6 = (Class240_Sub16)client.widgets.getNode((long)(1278853609 * var1.cacheID));
      if(var6 != null) {
         ServerOutputStream.method3134(var6.widgetID * 1320796941, var4, var5, var2, -1944090822);
      }

      if(client.aClass132_476 == var1) {
         int var7 = Class15.availablePlayers * -688404505;
         int[] var8 = Class15.playersIndices;

         int var9;
         for(var9 = 0; var9 < var7; ++var9) {
            Player var10 = client.aPlayerArray[var8[var9]];
            if(var10 != null) {
               var10.method3272(var4, var5, var2, (byte)3);
            }
         }

         for(var9 = 0; var9 < client.availableNPCS * 1636714459; ++var9) {
            int var12 = client.npcIndices[var9];
            Class240_Sub9 var11 = (Class240_Sub9)client.npcNodeList.getNode((long)var12);
            if(null != var11) {
               ((RSCharacter)var11.anObject_6783).method3272(var4, var5, var2, (byte)3);
            }
         }
      }

   }
}
