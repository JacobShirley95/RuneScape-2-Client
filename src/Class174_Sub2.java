
public abstract class Class174_Sub2 extends DrawingTarget {

   static int anInt_10979;


   public abstract int method7574(int var1, int var2);

   abstract void method7575(int var1, int var2);

   public abstract int method7576();

   public static void method7577(RSInterfaceGroup var0, RSInterface var1, int var2) {
      RSInterface var3 = Class322.method3967(var0, var1, -552434301);
      int var4;
      int var5;
      if(null == var3) {
         var4 = Class29.canvasWidth * 1111410531;
         var5 = -75607525 * Class597.canvasHeight;
      } else {
         var4 = var3.width * -533669195;
         var5 = 1833812087 * var3.height;
      }

      Class37.method313(var1, var4, var5, false, (byte)45);
      Class240_Sub41_Sub1.method434(var1, var4, var5, -1870939377);
   }

   static final void method7578(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 / var3;
   }

   static final void method7579(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      boolean var3 = 1 == var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      if(null != Class248_Sub1.aNodeArrayList_6444) {
         NodeListNode var4 = Class248_Sub1.aNodeArrayList_6444.getNode((long)var2);
         if(var4 != null && !var3) {
            var4.shiftNext();
         } else if(null == var4 && var3) {
            var4 = new NodeListNode();
            Class248_Sub1.aNodeArrayList_6444.insert(var4, (long)var2);
         }
      }

   }

   static void method7580(Renderer var0, int var1) {
      int var2 = WeakReference_Sub1.optionBoxX * -1754705091;
      int var3 = Class258.optionBoxY * -702210997;
      int var4 = 1516402115 * Class558.optionsBoxWidth;
      int var5 = Class638.optionsBoxHeight * 860305223 - 3;
      byte var6 = 20;
      if(null == Class18.aTextRenderer_173 || Class433.aRSFont_8344 == null) {
         Class18.aTextRenderer_173 = (FontRenderer)Class368.aFontUnpacker_6922.method4139(client.aClass339_284, -107395107 * Class240_Sub44_Sub5.anInt_1251, true, true, -1107105838);
         Class433.aRSFont_8344 = Class368.aFontUnpacker_6922.method4135(client.aClass339_284, Class240_Sub44_Sub5.anInt_1251 * -107395107, -1931699501);
         if(null != Class18.aTextRenderer_173 && Class433.aRSFont_8344 != null) {
            Class602.method6502(-1194383738);
            int var15 = var2 + var4 / 2;
            if(var15 + var4 > Class29.canvasWidth * 1111410531) {
               var15 = Class29.canvasWidth * 1111410531 - var4;
            }

            if(var15 < 0) {
               var15 = 0;
            }

            Class508.method5908(var15, Class258.optionBoxY * -702210997, (byte)19);
            return;
         }
      }

      FontRenderer var7;
      if(null != Class18.aTextRenderer_173 && Class433.aRSFont_8344 != null) {
         var7 = Class18.aTextRenderer_173;
      } else {
         var7 = MouseHandler.aTextRenderer_6379;
      }

      RSFont var8 = DamageSprite.method6530((byte)-109);
      Class31.method222(var0, WeakReference_Sub1.optionBoxX * -1754705091, -702210997 * Class258.optionBoxY, Class558.optionsBoxWidth * 1516402115, Class638.optionsBoxHeight * 860305223, var6, var7, var8, ServerString.chooseOptionStr.getText(Class599.clientLanguage, 573012913), 1451628688);
      int var9 = 255 - Class542.anInt_9476 * -1166441377 - 2141541207 * Class18.anInt_152;
      if(var9 < 0) {
         var9 = 0;
      }

      int var10 = Class53.captureMouseList.getCaptureMouseX();
      int var11 = Class53.captureMouseList.getCaptureMouseY();
      Class240_Sub22_Sub1 var16;
      int var12;
      OptionListNode var13;
      int var14; 
      if(!Class18.aBoolean_148) {
         var12 = 0;

         for(var13 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)105); var13 != null; var13 = (OptionListNode)Class18.optionNodeList.getNext(-308322153)) {
            var14 = (Class18.optionCount * -740020991 - 1 - var12) * Class18.anInt_144 * 32251295 + var6 + var3 + var8.anInt_8573 * 915612327 + 1;
            if(var10 > WeakReference_Sub1.optionBoxX * -1754705091 && var10 < 1516402115 * Class558.optionsBoxWidth + -1754705091 * WeakReference_Sub1.optionBoxX && var11 > var14 - var8.anInt_8573 * 915612327 - 1 && var11 < var8.anInt_8571 * 2080531379 + var14 && var13.aBoolean_951) {
               var0.drawOutline(-1754705091 * WeakReference_Sub1.optionBoxX, var14 - 915612327 * var8.anInt_8573, 1516402115 * Class558.optionsBoxWidth, 32251295 * Class18.anInt_144, var9 << 24 | Class2.anInt_18 * 863214637, 1);
            }

            ++var12;
         }
      } else {
         var12 = 0;

         for(var16 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5772(-521203167); var16 != null; var16 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5771(-1784437455)) {
            var14 = Class18.anInt_144 * 32251295 * var12 + 915612327 * var8.anInt_8573 + var6 + var3 + 1;
            if(var10 > WeakReference_Sub1.optionBoxX * -1754705091 && var10 < -1754705091 * WeakReference_Sub1.optionBoxX + Class558.optionsBoxWidth * 1516402115 && var11 > var14 - 915612327 * var8.anInt_8573 - 1 && var11 < 2080531379 * var8.anInt_8571 + var14 && (-1686791407 * var16.anInt_799 > 1 || ((OptionListNode)var16.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277).aBoolean_951)) {
               var0.drawOutline(WeakReference_Sub1.optionBoxX * -1754705091, var14 - var8.anInt_8573 * 915612327, 1516402115 * Class558.optionsBoxWidth, Class18.anInt_144 * 32251295, var9 << 24 | Class2.anInt_18 * 863214637, 1);
            }

            ++var12;
         }

         if(Class18.aClass240_Sub22_Sub1_166 != null) {
            Class31.method222(var0, -899275041 * Class474.anInt_8725, Class43.anInt_939 * -1827679021, Class113.anInt_2072 * -1723475363, ScreenCharText.anInt_6172 * -1190617749, var6, var7, var8, Class18.aClass240_Sub22_Sub1_166.optionTargetString, 1686879264);
            var12 = 0;

            for(var13 = (OptionListNode)Class18.aClass240_Sub22_Sub1_166.aClass494_798.method5772(1244090389); null != var13; var13 = (OptionListNode)Class18.aClass240_Sub22_Sub1_166.aClass494_798.method5771(688470725)) {
               var14 = 1 + var8.anInt_8573 * 915612327 + var6 + Class43.anInt_939 * -1827679021 + var12 * 32251295 * Class18.anInt_144;
               if(var10 > -899275041 * Class474.anInt_8725 && var10 < -1723475363 * Class113.anInt_2072 + Class474.anInt_8725 * -899275041 && var11 > var14 - var8.anInt_8573 * 915612327 - 1 && var11 < 2080531379 * var8.anInt_8571 + var14 && var13.aBoolean_951) {
                  var0.drawOutline(-899275041 * Class474.anInt_8725, var14 - 915612327 * var8.anInt_8573, -1723475363 * Class113.anInt_2072, Class18.anInt_144 * 32251295, var9 << 24 | Class2.anInt_18 * 863214637, 1);
               }

               ++var12;
            }

            Class12.method68(var0, -899275041 * Class474.anInt_8725, -1827679021 * Class43.anInt_939, Class113.anInt_2072 * -1723475363, ScreenCharText.anInt_6172 * -1190617749, var6, 1528704140);
         }
      }

      Class12.method68(var0, -1754705091 * WeakReference_Sub1.optionBoxX, Class258.optionBoxY * -702210997, 1516402115 * Class558.optionsBoxWidth, Class638.optionsBoxHeight * 860305223, var6, -586020403);
      if(!Class18.aBoolean_148) {
         var12 = 0;

         for(var13 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)41); null != var13; var13 = (OptionListNode)Class18.optionNodeList.getNext(-1724609135)) {
            var14 = 32251295 * Class18.anInt_144 * (-740020991 * Class18.optionCount - 1 - var12) + 1 + var3 + var6 + var8.anInt_8573 * 915612327;
            Class178_Sub1.method7719(var10, var11, var2, var3, var4, var5, var14, var13, var7, var8, Class187_Sub2.anInt_10980 * -1151519113 | -16777216, Class603.anInt_9896 * -295609849 | -16777216, -814209104);
            ++var12;
         }
      } else {
         var12 = 0;

         for(var16 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5772(244159228); var16 != null; var16 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5771(528731347)) {
            var14 = 1 + 915612327 * var8.anInt_8573 + Class258.optionBoxY * -702210997 + var6 + Class18.anInt_144 * 32251295 * var12;
            if(1 == var16.anInt_799 * -1686791407) {
               Class178_Sub1.method7719(var10, var11, -1754705091 * WeakReference_Sub1.optionBoxX, Class258.optionBoxY * -702210997, 1516402115 * Class558.optionsBoxWidth, 860305223 * Class638.optionsBoxHeight, var14, (OptionListNode)var16.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277, var7, var8, -1151519113 * Class187_Sub2.anInt_10980 | -16777216, -295609849 * Class603.anInt_9896 | -16777216, -532467351);
            } else {
               Class21.method124(var10, var11, -1754705091 * WeakReference_Sub1.optionBoxX, -702210997 * Class258.optionBoxY, 1516402115 * Class558.optionsBoxWidth, 860305223 * Class638.optionsBoxHeight, var14, var16, var7, var8, Class187_Sub2.anInt_10980 * -1151519113 | -16777216, Class603.anInt_9896 * -295609849 | -16777216, (byte)1);
            }

            ++var12;
         }

         if(null != Class18.aClass240_Sub22_Sub1_166) {
            var12 = 0;

            for(var13 = (OptionListNode)Class18.aClass240_Sub22_Sub1_166.aClass494_798.method5772(1419539522); null != var13; var13 = (OptionListNode)Class18.aClass240_Sub22_Sub1_166.aClass494_798.method5771(505541763)) {
               var14 = 915612327 * var8.anInt_8573 + Class43.anInt_939 * -1827679021 + var6 + 1 + 32251295 * Class18.anInt_144 * var12;
               Class178_Sub1.method7719(var10, var11, -899275041 * Class474.anInt_8725, -1827679021 * Class43.anInt_939, Class113.anInt_2072 * -1723475363, -1190617749 * ScreenCharText.anInt_6172, var14, var13, var7, var8, Class187_Sub2.anInt_10980 * -1151519113 | -16777216, Class603.anInt_9896 * -295609849 | -16777216, -218027954);
               ++var12;
            }
         }
      }

   }
}
