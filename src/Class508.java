
public abstract class Class508 {

   final Class43 aClass43_9142;
   static int anInt_9143;


   public abstract boolean method5901(int var1);

   public abstract void method5902(Class115 var1, Viewport var2, int var3, int var4, float var5, int var6);

   public abstract GameCoord method5903(int var1);

   public abstract GameCoord method5904(int var1);

   public Class342 method5905(byte var1) {
      Viewport var2 = new Viewport();
      GameCoord var3 = GameCoord.method4308(this.method5903(2078899593));
      var3.dist(this.aClass43_9142.method371(-1219127035));
      var3.floatY *= -1.0F;
      var2.method4636(0.0F, 0.0F, 0.0F, var3.floatX, var3.floatY, var3.floatZ, 0.0F, 1.0F, 0.0F);
      Class354 var4 = new Class354();
      var2.method4639(var4.aFloatArray_6752);
      Class342 var5 = var4.method4440();
      var5.method4222();
      return var5;
   }

   public abstract void method5906(ByteArrayDataNode var1, int var2);

   Class508(Class43 var1) {
      this.aClass43_9142 = var1;
   }

   public abstract void method5907(float var1, int var2);

   static void method5908(int var0, int var1, byte var2) {
      if(!Class571.aClass587_9651.aBoolean_9757) {
         if(Class18.optionCount * -740020991 == 1) {
            return;
         }

         if(Class349.aBoolean_6618 && -740020991 * Class18.optionCount == 2 && Class625.aClass240_Sub22_Sub3_10047.optionName.equals(ServerString.faceHereStr.getText(Class599.clientLanguage, 693550601))) {
            return;
         }
      }

      RSFont var3 = DamageSprite.method6530((byte)-121);
      int var4 = var3.method5566(ServerString.chooseOptionStr.getText(Class599.clientLanguage, 961373474), 1241285453);
      int var6;
      int var7;
      if(!Class18.aBoolean_148) {
         for(OptionListNode var5 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)71); var5 != null; var5 = (OptionListNode)Class18.optionNodeList.getNext(-443859993)) {
            var6 = DamageSprite.method6534(var5, var3, (byte)16);
            if(var6 > var4) {
               var4 = var6;
            }
         }

         var4 += 8;
         var7 = -740020991 * Class18.optionCount * Class18.anInt_144 * 32251295 + 21;
         Class638.optionsBoxHeight = (-740020991 * Class18.optionCount * Class18.anInt_144 * 32251295 + (Class18.aBoolean_172?26:22)) * 565396087;
      } else {
         for(Class240_Sub22_Sub1 var8 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5772(1674910692); var8 != null; var8 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5771(-2120801105)) {
            if(1 == var8.anInt_799 * -1686791407) {
               var6 = DamageSprite.method6534((OptionListNode)var8.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277, var3, (byte)16);
            } else {
               var6 = Class330.method4094(var8, var3, -1963682981);
            }

            if(var6 > var4) {
               var4 = var6;
            }
         }

         var4 += 8;
         var7 = -917762761 * Class18.anInt_155 * Class18.anInt_144 * 32251295 + 21;
         Class638.optionsBoxHeight = 565396087 * (32251295 * Class18.anInt_144 * -917762761 * Class18.anInt_155 + (Class18.aBoolean_172?26:22));
      }

      var4 += 10;
      int var9 = var0 - var4 / 2;
      if(var4 + var9 > 1111410531 * Class29.canvasWidth) {
         var9 = Class29.canvasWidth * 1111410531 - var4;
      }

      if(var9 < 0) {
         var9 = 0;
      }

      var6 = var1;
      if(var1 + var7 > -75607525 * Class597.canvasHeight) {
         var6 = Class597.canvasHeight * -75607525 - var7;
      }

      if(var6 < 0) {
         var6 = 0;
      }

      WeakReference_Sub1.optionBoxX = -1436574699 * var9;
      Class258.optionBoxY = var6 * -851784349;
      Class558.optionsBoxWidth = var4 * 712909547;
      Class18.anInt_152 = (int)(Math.random() * 24.0D) * -9615257;
      Class18.optionsClosed = true;
   }

   static final void method5909(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class599.clientLanguage.getLanguageID(1377931133);
   }

   static final void method5910(int var0) {
      Class505.aClass132Array_9124 = null;
      Class84.method1100(1854782309 * client.anInt_468, 0, 0, 1111410531 * Class29.canvasWidth, Class597.canvasHeight * -75607525, 0, 0, -1, (byte)54);
      if(Class505.aClass132Array_9124 != null) {
         Class619.method6623(Class505.aClass132Array_9124, -1412584499, 0, 0, 1111410531 * Class29.canvasWidth, Class597.canvasHeight * -75607525, -2124439755 * Class104_Sub3.anInt_4145, Class282.anInt_4779 * 1196688953, Class107.aClass132_1992 == client.aClass132_426?-1:-1927071795 * client.aClass132_426.anInt_2590, true, 267690209);
         Class505.aClass132Array_9124 = null;
      }

   }

   static final void method5911(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aBoolean_463?1:0;
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = null == client.aString_467?"":client.aString_467;
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = null == client.selectedOption?"":client.selectedOption;
   }
}
