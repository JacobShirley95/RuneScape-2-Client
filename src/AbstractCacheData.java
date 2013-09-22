
public abstract class AbstractCacheData {

   public static boolean aBoolean_6915;


   abstract byte[] method4669(int var1, int var2);

   abstract int getPercentLoaded(int var1, int var2);

   abstract void method4671(int var1, byte var2);

   abstract Class372 method4672(int var1);

   public static OptionListNode method4673(int var0) {
      return Class283_Sub2.aClass240_Sub22_Sub3_7729;
   }

   static final void method4674(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      int var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2 + Class298.method3804(var3, true, (byte)102);
   }

   static void renderUptext(Renderer var0, int var1) {
      if((Class18.optionCount * -740020991 >= 2 || client.aBoolean_463) && client.aClass132_523 == null) {
         String uptext;
         if(client.aBoolean_463 && -740020991 * Class18.optionCount < 2) {
            uptext = client.selectedOption + ServerString.spacingStr.getText(Class599.clientLanguage, 1163640662) + client.aString_467 + " " + Class8.optionPointer;
         } else if(GamePack.method5982((byte)-106) && -740020991 * Class18.optionCount > 2) {
            uptext = Class481.getOptionString(Class465.firstOptionNode, 1077822996);
         } else {
            OptionListNode var3 = Class465.firstOptionNode;
            if(var3 == null) {
               return;
            }

            uptext = Class481.getOptionString(var3, 1319351877);
            int[] var4 = Class421.method5267(var3, (byte)51);
            if(null != var4) {
               uptext = uptext + Class5.method28(var4, -2004811299);
            }
         }

         if(Class18.optionCount * -740020991 > 2) {
            uptext = uptext + Class133.addTextColour(16777215, (byte)6) + " / " + (-740020991 * Class18.optionCount - 2) + ServerString.moreOptionsStr.getText(Class599.clientLanguage, 550818062);
         }

         if(Class18.aClass132_185 != null) {
            FontRenderer var5 = Class18.aClass132_185.method1706(Class368.aFontUnpacker_6922, client.aClass339_284, 2147041505);
            if(var5 == null) {
               var5 = MouseHandler.aTextRenderer_6379;
            }

            var5.method1072(uptext, 1842723319 * Class18.anInt_163, Class18.anInt_174 * 1442410537, Class18.aClass132_185.width * -533669195, 1833812087 * Class18.aClass132_185.height, 1975898755 * Class18.aClass132_185.outlineColour, -61088611 * Class18.aClass132_185.anInt_2464, Class18.aClass132_185.anInt_2499 * -483687327, Class18.aClass132_185.anInt_2500 * 233250407, client.aRandom_383, -324359965 * ServerInputStream.anInt_4375, client.anIntArray_529, Class20.imgNameIcons, Class90.furthestPositions, -1786305877);
            Class172.method2175(client.anIntArray_529[0], client.anIntArray_529[1], client.anIntArray_529[2], client.anIntArray_529[3], (byte)-25);
         }

      }
   }

   static final void method4676(Class240_Sub16 var0, int var1, int var2, int var3, int canvasWidth, int canvasHeight, int var6, int var7, int mouseX, int mouseY, byte var10) {
      if(Class24.method149(var1, (int[])null, 865203743)) {
         if(null != var0 && !var0.method4653((byte)-23)) {
            Class104_Sub8.method3387(var0, true, false, (byte)-1);
         } else {
            RSInterfaceGroup var11 = RSInterface.interfaceGroups[var1];
            client.method173(var11, var11.method1435(-11840664), -1, var2, var3, canvasWidth, canvasHeight, var6, var7, mouseX, mouseY);
         }
      }
   }

   static final void method4677(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aBoolean_282?1:0;
   }

   static void method4678(RSInterfaceData var0, byte var1) {
      var0.intTypes[-831324111 * var0.intTypeIndex - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[-831324111 * var0.intTypeIndex - 1], -824701639).method6175(Class240_Sub41_Sub3.aClass23_1024, -1480710630)?1:0;
   }

   public static int method4679(int var0) {
      return Class571.aClass587_9651.aBoolean_9766?2:3;
   }
}
