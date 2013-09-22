
public final class Class100 {

   Player aPlayer = null;
   final int anInt_1950;
   int[] anIntArray_1951;
   public boolean aBoolean_1952 = false;
   NPC anNPC = null;
   static final int anInt_1954 = 25;
   public final int anInt_1955;
   public static CacheDataUnpacker aCacheUnpacker_1956;


   void method1285(int var1, int var2, int var3, int var4, byte var5) {
      if(!this.aBoolean_1952) {
         this.aBoolean_1952 = true;
         if(this.anInt_1955 * -2057490183 >= 0) {
            this.anNPC = new NPC(client.aClass296_348.getWorldObjects(), 25);
            this.anNPC.index = this.anInt_1950 * -1203356149;
            this.anNPC.anInt_4290 = client.timer * 926176209;
            this.anNPC.method1151(Class104_Sub6.characterUnpacker.method5670(-2057490183 * this.anInt_1955, -1312778652), -1889301896);
            this.anNPC.method3256(-1792142631 * this.anNPC.npcComposite.anInt_8665, 59220262);
            this.anNPC.anInt_4340 = (this.anNPC.npcComposite.anInt_8660 * -1526252727 << 3) * 258100611;
            this.anNPC.anInt_4299 = ((Class95.anInt_1893 += 388635129) * 685332553 - 1) * 51746669;
         } else {
            this.aPlayer = new Player(client.aClass296_348.getWorldObjects(), 25);
            this.aPlayer.method991(Animator.aClass240_Sub8_9141, 1109306271);
            this.aPlayer.index = this.anInt_1950 * -1203356149;
            this.aPlayer.anInt_4290 = 926176209 * client.timer;
            this.aPlayer.anInt_4299 = ((Class95.anInt_1893 += 388635129) * 685332553 - 1) * 51746669;
         }
      }

      if(-2057490183 * this.anInt_1955 >= 0) {
         this.anNPC.method1157(var3, var1, var2, true, this.anNPC.method3257(), 758383490);
         this.anNPC.turnTo(var4, true, 1529036266);
      } else {
         this.aPlayer.plane = this.aPlayer.aByte_6942 = (byte)var3;
         this.aPlayer.method1011(var1, var2, 1822096713);
         this.aPlayer.turnTo(var4, true, 1129928663);
      }

   }

   void method1286(int var1) {
      this.anNPC = null;
      this.aPlayer = null;
      this.aBoolean_1952 = false;
   }

   void method1287(int var1, int var2, int var3, int var4) {
      if(null != this.anNPC) {
         this.anNPC.method1157(var1, var2, var3, true, this.anNPC.method3257(), -616754996);
      } else {
         this.aPlayer.plane = this.aPlayer.aByte_6942 = (byte)var1;
         this.aPlayer.method1011(var2, var3, 1067207425);
      }

   }

   boolean method1288(byte var1) {
      if(this.anInt_1955 * -2057490183 < 0) {
         return true;
      } else {
         NPCComposite var2 = Class104_Sub6.characterUnpacker.method5670(this.anInt_1955 * -2057490183, 530992004);
         boolean var3 = var2.method5597(1043560052);
         if(this.anIntArray_1951 == null) {
            Class263 var4 = RandomAccessFileNode.aClass255_9018.method3343(var2.anInt_8608 * -164370277, 1516291115);
            this.anIntArray_1951 = var4.method3501(-771900396);
         }

         int[] var7 = this.anIntArray_1951;

         for(int var5 = 0; var5 < var7.length; ++var5) {
            int var6 = var7[var5];
            var3 &= Class88.animeUnpacker.loadAnimation(var6).method6725(-779674554);
         }

         return var3;
      }
   }

   Class100(ByteArrayDataNode var1, int var2) {
      this.anInt_1950 = 807836973 * var2;
      int var3 = var1.readByte(193760824);
      switch(var3) {
      case 0:
         this.anInt_1955 = var1.method4493(-157074556) * 1227919689;
         break;
      case 1:
         this.anInt_1955 = -1227919689;
         break;
      default:
         this.anInt_1955 = -1227919689;
      }

      var1.method4485(-165917832);
   }

   public RSCharacter getTarget(byte var1) {
      return (RSCharacter)(null != this.anNPC?this.anNPC:this.aPlayer);
   }

   static Class266[] method1290(int var0) {
      return new Class266[]{Class266.aClass266_4637, Class266.aClass266_4638};
   }

   static final void method1291(boolean var0, RSInterfaceData var1, short var2) {
      Class552 var3 = var1.aBoolean_9522?var1.aClass552_9506:var1.aClass552_9492;
      RSInterface var4 = var3.aClass132_9524;
      RSInterfaceGroup var5 = var3.aClass112_9523;
      if(var0) {
         Class420.method5235(var5, var4, (byte)81);
      } else {
         Class84.method1096(var5, var4, 959884402);
      }

   }

   static final void method1292(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass240_Sub47_9501.aClass37Array_7661[var2].aByte_855;
   }

   static void renderOptionsList(Renderer var0, short var1) {
      int var2 = -10660793;
      ServerInputStream.drawOptionBox(var0, WeakReference_Sub1.optionBoxX * -1754705091, -702210997 * Class258.optionBoxY, Class558.optionsBoxWidth * 1516402115, 860305223 * Class638.optionsBoxHeight, var2, -16777216, (byte)8);
      MouseHandler.aTextRenderer_6379.renderText(ServerString.chooseOptionStr.getText(Class599.clientLanguage, -1595099246), -1754705091 * WeakReference_Sub1.optionBoxX + 3, 14 + Class258.optionBoxY * -702210997, var2, -1, 590942099);
      int mouseX = Class53.captureMouseList.getCaptureMouseX();
      int mouseY = Class53.captureMouseList.getCaptureMouseY();
      int var5;
      OptionListNode var6;
      int var7;
      if(!Class18.aBoolean_148) {
         var5 = 0;

         for(var6 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)113); null != var6; var6 = (OptionListNode)Class18.optionNodeList.getNext(-772346169)) {
            var7 = (Class18.optionCount * -740020991 - 1 - var5) * 32251295 * Class18.anInt_144 + -702210997 * Class258.optionBoxY + 31;
            Class178_Sub1.method7719(mouseX, mouseY, WeakReference_Sub1.optionBoxX * -1754705091, -702210997 * Class258.optionBoxY, 1516402115 * Class558.optionsBoxWidth, Class638.optionsBoxHeight * 860305223, var7, var6, MouseHandler.aTextRenderer_6379, Class1.aRSFont_11, -1, -256, 1780757924);
            ++var5;
         }
      } else {
         var5 = 0;

         for(Class240_Sub22_Sub1 var8 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5772(1515259189); null != var8; var8 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5771(-301877802)) {
            var7 = 32251295 * Class18.anInt_144 * var5 + Class258.optionBoxY * -702210997 + 31;
            if(1 == -1686791407 * var8.anInt_799) {
               Class178_Sub1.method7719(mouseX, mouseY, WeakReference_Sub1.optionBoxX * -1754705091, Class258.optionBoxY * -702210997, Class558.optionsBoxWidth * 1516402115, Class638.optionsBoxHeight * 860305223, var7, (OptionListNode)var8.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277, MouseHandler.aTextRenderer_6379, Class1.aRSFont_11, -1, -256, -417836577);
            } else {
               Class21.method124(mouseX, mouseY, -1754705091 * WeakReference_Sub1.optionBoxX, Class258.optionBoxY * -702210997, 1516402115 * Class558.optionsBoxWidth, 860305223 * Class638.optionsBoxHeight, var7, var8, MouseHandler.aTextRenderer_6379, Class1.aRSFont_11, -1, -256, (byte)1);
            }

            ++var5;
         }

         if(Class18.aClass240_Sub22_Sub1_166 != null) {
            ServerInputStream.drawOptionBox(var0, Class474.anInt_8725 * -899275041, -1827679021 * Class43.anInt_939, Class113.anInt_2072 * -1723475363, ScreenCharText.anInt_6172 * -1190617749, var2, -16777216, (byte)8);
            MouseHandler.aTextRenderer_6379.renderText(Class18.aClass240_Sub22_Sub1_166.optionTargetString, Class474.anInt_8725 * -899275041 + 3, 14 + -1827679021 * Class43.anInt_939, var2, -1, -1259290888);
            var5 = 0;

            for(var6 = (OptionListNode)Class18.aClass240_Sub22_Sub1_166.aClass494_798.method5772(-533248782); var6 != null; var6 = (OptionListNode)Class18.aClass240_Sub22_Sub1_166.aClass494_798.method5771(-1030617316)) {
               var7 = -1827679021 * Class43.anInt_939 + 31 + var5 * Class18.anInt_144 * 32251295;
               Class178_Sub1.method7719(mouseX, mouseY, Class474.anInt_8725 * -899275041, -1827679021 * Class43.anInt_939, -1723475363 * Class113.anInt_2072, -1190617749 * ScreenCharText.anInt_6172, var7, var6, MouseHandler.aTextRenderer_6379, Class1.aRSFont_11, -1, -256, 663305502);
               ++var5;
            }
         }
      }

   }

   static final void method1294(int var0) {
      client.anInt_544 = -93521583;
      client.anInt_356 = -563825124;
      Animator.aClass240_Sub8_9141 = null;
      Class212.method2662(-383348825);
   }

   static final void method1295(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1751392358) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2529 = Class133.extractInterfaceData(var4, var2, (byte)103);
      var0.aBoolean_2524 = true;
   }

   static void method1296(RSInterfaceData var0, int var1) {
      var0.intTypes[-831324111 * var0.intTypeIndex - 2] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 2], 2010108639).method6178(Class240_Sub41_Sub3.aClass23_1024, var0.intTypes[-831324111 * var0.intTypeIndex - 1], 877797007)?1:0;
      var0.intTypeIndex -= -708028207;
   }

   static final void method1297(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      var0.aBoolean_2459 = var4 == 1;
      Class110_Sub1.method3149(var0, -1617433391);
   }

   static final void method1298(RSInterface var0, RSInterfaceData var1, byte var2) {
      if(client.method174(var0).method4997((byte)113) && null == client.aClass132_335) {
         Class37.method314(var0.cacheID * 1278853609, -1001687885 * var0.anInt_2428, 1687568363);
         client.aClass132_335 = DrawingTarget.method2201(1278853609 * var0.cacheID, var0.anInt_2428 * -1001687885, (byte)93);
         Class110_Sub1.method3149(client.aClass132_335, -456218958);
      }

   }

   static final void method1299(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      ObjectDescriptor var3 = Class592.cacheObjectLoader.getObjectDescriptor(var2);
      int var4;
      if(var3.aBoolean_8509) {
         var4 = var3.textColour * -758091811;
      } else if(var3.inBank) {
         var4 = Class268.aClass586_4646.bankItemColour * 1315363165;
      } else {
         var4 = Class268.aClass586_4646.dropItemTextColour * 543830729;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4;
   }
}
