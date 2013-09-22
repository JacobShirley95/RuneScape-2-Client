
public class Class37 {

   public String aString_853;
   public int anInt_854;
   public byte aByte_855;


   static void method307(Class638[][][] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Class638[][] var3 = var0[var2];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            for(int var5 = 0; var5 < var3[var4].length; ++var5) {
               Class638 var6 = var3[var4][var5];
               if(null != var6) {
                  if(var6.aClass563_Sub1_Sub1_10138 instanceof Class218) {
                     ((Class218)var6.aClass563_Sub1_Sub1_10138).method2726(671336720);
                  }

                  if(var6.aClass563_Sub1_Sub3_10133 instanceof Class218) {
                     ((Class218)var6.aClass563_Sub1_Sub3_10133).method2726(671336720);
                  }

                  if(var6.aClass563_Sub1_Sub3_10134 instanceof Class218) {
                     ((Class218)var6.aClass563_Sub1_Sub3_10134).method2726(671336720);
                  }

                  if(var6.aClass563_Sub1_Sub5_10131 instanceof Class218) {
                     ((Class218)var6.aClass563_Sub1_Sub5_10131).method2726(671336720);
                  }

                  if(var6.aClass563_Sub1_Sub5_10132 instanceof Class218) {
                     ((Class218)var6.aClass563_Sub1_Sub5_10132).method2726(671336720);
                  }

                  for(Class629 var7 = var6.aClass629_10137; var7 != null; var7 = var7.aClass629_10073) {
                     PositionEntity var8 = var7.aClass563_Sub1_Sub4_10075;
                     if(var8 instanceof Class218) {
                        ((Class218)var8).method2726(671336720);
                     }
                  }
               }
            }
         }
      }

   }

   static final void method308(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class296.method3792(var3, var4, var0, 1323437062);
   }

   static final void method309(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub25_7290, var2, 1437013565);
      client.aClass296_348.method3789((byte)14);
      Class83.method1089(-1049896285);
      client.aBoolean_568 = false;
   }

   static final void method310(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub31_7321, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1?1:0, 85577799);
      client.aClass296_348.method3789((byte)105);
      Class83.method1089(-1467246270);
      client.aBoolean_568 = false;
   }

   static final void method311(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var2 != -1) {
         Class321.method3965(var2, (byte)1);
      }

   }

   static void method312(RSInterfaceData var0, int var1) {
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 2119239506).aString_9561;
   }

   static void method313(RSInterface var0, int var1, int var2, boolean var3, byte var4) {
      int var5 = var0.width * -533669195;
      int var6 = 1833812087 * var0.height;
      if(var0.aByte_2433 == 0) {
         var0.width = var0.anInt_2436 * -403761701;
      } else if(1 == var0.aByte_2433) {
         var0.width = 451593117 * (var1 - var0.anInt_2436 * 1303835095);
      } else if(2 == var0.aByte_2433) {
         var0.width = 451593117 * (var1 * 1303835095 * var0.anInt_2436 >> 14);
      }

      if(var0.aByte_2498 == 0) {
         var0.height = 403445519 * var0.anInt_2438;
      } else if(var0.aByte_2498 == 1) {
         var0.height = -1837360825 * (var2 - var0.anInt_2438 * -1855129607);
      } else if(var0.aByte_2498 == 2) {
         var0.height = -1837360825 * (var2 * -1855129607 * var0.anInt_2438 >> 14);
      }

      if(4 == var0.aByte_2433) {
         var0.width = 451593117 * (var0.height * 1833812087 * var0.anInt_2443 * -1469736533 / (var0.anInt_2444 * -382542393));
      }

      if(4 == var0.aByte_2498) {
         var0.height = -1837360825 * (var0.anInt_2444 * -382542393 * -533669195 * var0.width / (var0.anInt_2443 * -1469736533));
      }

      if(client.aBoolean_365 && (client.method174(var0).anInt_7693 * -1992444447 != 0 || 0 == var0.index * 1916189739)) {
         if(var0.height * 1833812087 < 5 && -533669195 * var0.width < 5) {
            var0.height = -596869533;
            var0.width = -2037001711;
         } else {
            if(var0.height * 1833812087 <= 0) {
               var0.height = -596869533;
            }

            if(var0.width * -533669195 <= 0) {
               var0.width = -2037001711;
            }
         }
      }

      if(691513007 * var0.type == RSInterface.anInt_2536 * 221269325) {
         client.aClass132_476 = var0;
      }

      if(var3 && null != var0.anObjectArray_2502 && (var0.width * -533669195 != var5 || 1833812087 * var0.height != var6)) {
         Class240_Sub17 var7 = new Class240_Sub17();
         var7.aClass132_6903 = var0;
         var7.anObjectArray_6907 = var0.anObjectArray_2502;
         client.aNodeList_518.addNode(var7, (short)-19016);
      }

   }

   public static void method314(int var0, int var1, int var2) {
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6263, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.putIntBE(var0, 2062892803);
      var3.aClass240_Sub8_Sub1_7370.method4507(var1, -1828074049);
      client.gameConnectionHandler.addPacket(var3, 1778354925);
   }
}
