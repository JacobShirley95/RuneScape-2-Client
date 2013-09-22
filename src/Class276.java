
public class Class276 {

   public static long aLong_4726;


   Class276() throws Throwable {
      throw new Error();
   }

   static final void method3608(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class625.method6654(var3, var4, var0, (byte)-78);
   }

   static final void method3609(Class563_Sub1 var0, RSInterfaceData var1, byte var2) {
      boolean var3 = false;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      if(var0.aClass92Array_6938 != null) {
         for(int var8 = 0; var8 < var0.aClass92Array_6938.length; ++var8) {
            Class92 var9 = var0.aClass92Array_6938[var8];
            if(var9.aBoolean_1828) {
               int var10;
               int var11;
               if(var9.anInt_1827 < var9.anInt_1829) {
                  var10 = var9.anInt_1827 - var9.anInt_1831;
                  var11 = var9.anInt_1831 + var9.anInt_1829;
               } else {
                  var10 = var9.anInt_1829 - var9.anInt_1831;
                  var11 = var9.anInt_1827 + var9.anInt_1831;
               }

               int var12;
               int var13;
               if(var9.anInt_1830 < var9.anInt_1826) {
                  var12 = var9.anInt_1830 - var9.anInt_1831;
                  var13 = var9.anInt_1826 + var9.anInt_1831;
               } else {
                  var12 = var9.anInt_1826 - var9.anInt_1831;
                  var13 = var9.anInt_1831 + var9.anInt_1830;
               }

               if(!var3 || var10 < var4) {
                  var4 = var10;
               }

               if(!var3 || var12 < var5) {
                  var5 = var12;
               }

               if(!var3 || var11 > var6) {
                  var6 = var11;
               }

               if(!var3 || var13 > var7) {
                  var7 = var13;
               }

               var3 = true;
            }
         }
      }

      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = var3?1:0;
      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = var4;
      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = var5;
      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = var6;
      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = var7;
   }

   public static Class536[] method3610(int var0) {
      return new Class536[]{Class536.aClass536_9445, Class536.aClass536_9444, Class536.aClass536_9446, Class536.aClass536_9447, Class536.aClass536_9448, Class536.aClass536_9450, Class536.aClass536_9442, Class536.aClass536_9443};
   }

   static final void method3611(RSInterfaceData var0, byte var1) {
      NPC var2 = (NPC)var0.animeTarget;
      NPCComposite var3 = var2.npcComposite;
      if(var3.anIntArray_8642 != null) {
         var3 = var3.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-70);
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3 != null?1:0;
   }

   static void method3612(int var0) {
      HintMarker.modelNodeArrayList.method6665((byte)5);
   }

   static final void method3613(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub27_7288, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 1639693209);
      Class462.setRenderToolkit(Class104_Sub21.renderSettings.currentToolkit.getToolkitID(), false, -2053086169);
      Class83.method1089(-1974828889);
   }
}
