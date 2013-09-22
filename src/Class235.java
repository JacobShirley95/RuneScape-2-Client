import java.util.Iterator;
import java.util.LinkedList;

public class Class235 {

   final int[] anIntArray_4025;
   static int anInt_4026 = 0;
   final int anInt_4027;
   final int anInt_4028;
   final int[] anIntArray_4029;
   LinkedList aLinkedList_4030;


   public void method3047(WorldObjects var1, byte var2) {
      if(var1 != null && this.aLinkedList_4030 != null) {
         Iterator var3 = this.aLinkedList_4030.iterator();

         while(var3.hasNext()) {
            Class563_Sub1_Sub4_Sub1 var4 = (Class563_Sub1_Sub4_Sub1)var3.next();
            var1.method3421(var4.plane, var4.locX, var4.locY, new Class246(var4), 78454380);
         }
      }

   }

   Model method3048(Renderer var1, int var2) {
      ModelData var3 = ModelData.createModelUnpacker(Class240_Sub22_Sub1.aCacheUnpacker_801, 1128138965 * this.anInt_4028, 0);
      if(null == var3) {
         return null;
      } else {
         if(var3.anInt_1848 < 13) {
            var3.method1229(2);
         }

         return var1.createModel(var3, 2048, 1888873239 * anInt_4026, 64, 768);
      }
   }

   public void method3049(WorldObjects var1, int var2) {
      if(var1 != null && this.anInt_4027 * -94354469 > 0) {
         this.method3050(var1, 873782984);
         Iterator var3 = this.aLinkedList_4030.iterator();

         while(var3.hasNext()) {
            Class563_Sub1_Sub4_Sub1 var4 = (Class563_Sub1_Sub4_Sub1)var3.next();
            var1.method3455(var4, false, 1791006483);
         }
      }

   }

   void method3050(WorldObjects var1, int var2) {
      this.aLinkedList_4030 = new LinkedList();
      Class281 var3 = client.aClass296_348.method3753();
      MapPoint var4 = client.aClass296_348.getMapArea();
      MapPoint var5 = new MapPoint(-763239015 * CacheFileID.anInt_2036, this.anIntArray_4025[0], this.anIntArray_4029[0]);

      for(int var6 = 1; var6 < -94354469 * this.anInt_4027; ++var6) {
         MapPoint var7 = new MapPoint(CacheFileID.anInt_2036 * -763239015, this.anIntArray_4025[var6], this.anIntArray_4029[var6]);

         while(1265321541 * var7.loadedMapX != var5.loadedMapX * 1265321541 || var7.loadedMapY * -1996781083 != var5.loadedMapY * -1996781083) {
            if(var5.loadedMapX * 1265321541 < 1265321541 * var7.loadedMapX) {
               var5.loadedMapX += 1331420301;
            } else if(1265321541 * var5.loadedMapX > var7.loadedMapX * 1265321541) {
               var5.loadedMapX -= 1331420301;
            }

            if(var5.loadedMapY * -1996781083 < var7.loadedMapY * -1996781083) {
               var5.loadedMapY += -1843754003;
            } else if(var5.loadedMapY * -1996781083 > -1996781083 * var7.loadedMapY) {
               var5.loadedMapY -= -1843754003;
            }

            int var8 = -763239015 * CacheFileID.anInt_2036;
            int var9 = var5.loadedMapX * 1265321541 - 1265321541 * var4.loadedMapX;
            int var10 = var5.loadedMapY * -1996781083 - var4.loadedMapY * -1996781083;
            if(var9 >= 0 && var9 < 1346434785 * var1.anInt_4481 && var10 >= 0 && var10 < var1.anInt_4479 * -1775771909) {
               int var11 = 256 + (var9 << 9);
               int var12 = (var10 << 9) + 256;
               if(var3.method3646(var9, var10, (byte)0)) {
                  ++var8;
               }

               this.aLinkedList_4030.add(new Class563_Sub1_Sub4_Sub1(var1, this, -763239015 * CacheFileID.anInt_2036, var8, var11, CompProfile.getHeight(var11, var12, -763239015 * CacheFileID.anInt_2036), var12));
            }
         }

         var5 = var7;
      }

   }

   public Class235(Renderer var1, ByteArrayDataNode var2, int var3) {
      this.anInt_4028 = var3 * 1337389181;
      this.anInt_4027 = var2.method4489(1158549501) * 1467875411;
      this.anIntArray_4025 = new int[-94354469 * this.anInt_4027];
      this.anIntArray_4029 = new int[this.anInt_4027 * -94354469];
      int var4 = var2.readShort(-406471859);
      int var5 = var2.readShort(248088685);

      for(int var6 = 0; var6 < -94354469 * this.anInt_4027; ++var6) {
         this.anIntArray_4025[var6] = var4 + var2.getByte((byte)108);
         this.anIntArray_4029[var6] = var5 + var2.getByte((byte)68);
      }

      this.method3048(var1, -350848338);
   }

   public static int method3051(byte[] var0, int var1, CharSequence var2, byte var3) {
      int var4 = var2.length();
      int var5 = var1;

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var2.charAt(var6);
         if(var7 <= 127) {
            var0[var5++] = (byte)var7;
         } else if(var7 <= 2047) {
            var0[var5++] = (byte)(192 | var7 >> 6);
            var0[var5++] = (byte)(128 | var7 & 63);
         } else {
            var0[var5++] = (byte)(224 | var7 >> 12);
            var0[var5++] = (byte)(128 | var7 >> 6 & 63);
            var0[var5++] = (byte)(128 | var7 & 63);
         }
      }

      return var5 - var1;
   }

   static final void method3052(RSInterfaceData var0, int var1) {
      String textEffect = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(client.anInt_507 * -268988889 != 0 || (!client.aBoolean_499 || client.aBoolean_444) && !client.aBoolean_447) {
         String var3 = textEffect.toLowerCase();
         byte textEffectType = 0;
         if(var3.startsWith(ServerString.aClass482_8917.getText(LanguagePack.aClass526_9276, -766036099))) {
            textEffectType = 0;
            textEffect = textEffect.substring(ServerString.aClass482_8917.getText(LanguagePack.aClass526_9276, -1627772510).length());
         } else if(var3.startsWith(ServerString.aClass482_8918.getText(LanguagePack.aClass526_9276, 1403018369))) {
            textEffectType = 1;
            textEffect = textEffect.substring(ServerString.aClass482_8918.getText(LanguagePack.aClass526_9276, -731398611).length());
         } else if(var3.startsWith(ServerString.aClass482_8919.getText(LanguagePack.aClass526_9276, 1060386743))) {
            textEffectType = 2;
            textEffect = textEffect.substring(ServerString.aClass482_8919.getText(LanguagePack.aClass526_9276, 579229538).length());
         } else if(var3.startsWith(ServerString.aClass482_8920.getText(LanguagePack.aClass526_9276, 159889347))) {
            textEffectType = 3;
            textEffect = textEffect.substring(ServerString.aClass482_8920.getText(LanguagePack.aClass526_9276, -951752676).length());
         } else if(var3.startsWith(ServerString.aClass482_8814.getText(LanguagePack.aClass526_9276, 1238515095))) {
            textEffectType = 4;
            textEffect = textEffect.substring(ServerString.aClass482_8814.getText(LanguagePack.aClass526_9276, -348158734).length());
         } else if(var3.startsWith(ServerString.aClass482_8778.getText(LanguagePack.aClass526_9276, 1245945503))) {
            textEffectType = 5;
            textEffect = textEffect.substring(ServerString.aClass482_8778.getText(LanguagePack.aClass526_9276, -1456170103).length());
         } else if(var3.startsWith(ServerString.aClass482_8848.getText(LanguagePack.aClass526_9276, -115322859))) {
            textEffectType = 6;
            textEffect = textEffect.substring(ServerString.aClass482_8848.getText(LanguagePack.aClass526_9276, 1137519699).length());
         } else if(var3.startsWith(ServerString.aClass482_8924.getText(LanguagePack.aClass526_9276, 1052225714))) {
            textEffectType = 7;
            textEffect = textEffect.substring(ServerString.aClass482_8924.getText(LanguagePack.aClass526_9276, 1280968814).length());
         } else if(var3.startsWith(ServerString.aClass482_8799.getText(LanguagePack.aClass526_9276, -1435462120))) {
            textEffectType = 8;
            textEffect = textEffect.substring(ServerString.aClass482_8799.getText(LanguagePack.aClass526_9276, -670037057).length());
         } else if(var3.startsWith(ServerString.aClass482_8926.getText(LanguagePack.aClass526_9276, -220343622))) {
            textEffectType = 9;
            textEffect = textEffect.substring(ServerString.aClass482_8926.getText(LanguagePack.aClass526_9276, -316599221).length());
         } else if(var3.startsWith(ServerString.aClass482_8927.getText(LanguagePack.aClass526_9276, -194084525))) {
            textEffectType = 10;
            textEffect = textEffect.substring(ServerString.aClass482_8927.getText(LanguagePack.aClass526_9276, 1620027095).length());
         } else if(var3.startsWith(ServerString.aClass482_8860.getText(LanguagePack.aClass526_9276, 1637311670))) {
            textEffectType = 11;
            textEffect = textEffect.substring(ServerString.aClass482_8860.getText(LanguagePack.aClass526_9276, -1859732216).length());
         } else if(LanguagePack.aClass526_9276 != Class599.clientLanguage) {
            if(var3.startsWith(ServerString.aClass482_8917.getText(Class599.clientLanguage, -794790081))) {
               textEffectType = 0;
               textEffect = textEffect.substring(ServerString.aClass482_8917.getText(Class599.clientLanguage, -901664232).length());
            } else if(var3.startsWith(ServerString.aClass482_8918.getText(Class599.clientLanguage, -1300500197))) {
               textEffectType = 1;
               textEffect = textEffect.substring(ServerString.aClass482_8918.getText(Class599.clientLanguage, 1717593995).length());
            } else if(var3.startsWith(ServerString.aClass482_8919.getText(Class599.clientLanguage, -584102047))) {
               textEffectType = 2;
               textEffect = textEffect.substring(ServerString.aClass482_8919.getText(Class599.clientLanguage, 282431050).length());
            } else if(var3.startsWith(ServerString.aClass482_8920.getText(Class599.clientLanguage, -1580315189))) {
               textEffectType = 3;
               textEffect = textEffect.substring(ServerString.aClass482_8920.getText(Class599.clientLanguage, -1838133133).length());
            } else if(var3.startsWith(ServerString.aClass482_8814.getText(Class599.clientLanguage, -47995430))) {
               textEffectType = 4;
               textEffect = textEffect.substring(ServerString.aClass482_8814.getText(Class599.clientLanguage, -509533087).length());
            } else if(var3.startsWith(ServerString.aClass482_8778.getText(Class599.clientLanguage, -1401357520))) {
               textEffectType = 5;
               textEffect = textEffect.substring(ServerString.aClass482_8778.getText(Class599.clientLanguage, -2009154697).length());
            } else if(var3.startsWith(ServerString.aClass482_8848.getText(Class599.clientLanguage, -1584188000))) {
               textEffectType = 6;
               textEffect = textEffect.substring(ServerString.aClass482_8848.getText(Class599.clientLanguage, 1400201181).length());
            } else if(var3.startsWith(ServerString.aClass482_8924.getText(Class599.clientLanguage, 765334643))) {
               textEffectType = 7;
               textEffect = textEffect.substring(ServerString.aClass482_8924.getText(Class599.clientLanguage, -1608140714).length());
            } else if(var3.startsWith(ServerString.aClass482_8799.getText(Class599.clientLanguage, -1046706283))) {
               textEffectType = 8;
               textEffect = textEffect.substring(ServerString.aClass482_8799.getText(Class599.clientLanguage, -198606056).length());
            } else if(var3.startsWith(ServerString.aClass482_8926.getText(Class599.clientLanguage, 896278532))) {
               textEffectType = 9;
               textEffect = textEffect.substring(ServerString.aClass482_8926.getText(Class599.clientLanguage, -402621203).length());
            } else if(var3.startsWith(ServerString.aClass482_8927.getText(Class599.clientLanguage, -251504334))) {
               textEffectType = 10;
               textEffect = textEffect.substring(ServerString.aClass482_8927.getText(Class599.clientLanguage, -1990710612).length());
            } else if(var3.startsWith(ServerString.aClass482_8860.getText(Class599.clientLanguage, 1428057773))) {
               textEffectType = 11;
               textEffect = textEffect.substring(ServerString.aClass482_8860.getText(Class599.clientLanguage, 1616575051).length());
            }
         }

         var3 = textEffect.toLowerCase();
         byte var5 = 0;
         if(var3.startsWith(ServerString.aClass482_8774.getText(LanguagePack.aClass526_9276, 1644000880))) {
            var5 = 1;
            textEffect = textEffect.substring(ServerString.aClass482_8774.getText(LanguagePack.aClass526_9276, -153528012).length());
         } else if(var3.startsWith(ServerString.aClass482_8930.getText(LanguagePack.aClass526_9276, -506194393))) {
            var5 = 2;
            textEffect = textEffect.substring(ServerString.aClass482_8930.getText(LanguagePack.aClass526_9276, 1757406122).length());
         } else if(var3.startsWith(ServerString.aClass482_8931.getText(LanguagePack.aClass526_9276, 1309262511))) {
            var5 = 3;
            textEffect = textEffect.substring(ServerString.aClass482_8931.getText(LanguagePack.aClass526_9276, 1543637820).length());
         } else if(var3.startsWith(ServerString.aClass482_8932.getText(LanguagePack.aClass526_9276, -179662716))) {
            var5 = 4;
            textEffect = textEffect.substring(ServerString.aClass482_8932.getText(LanguagePack.aClass526_9276, -842318093).length());
         } else if(var3.startsWith(ServerString.aClass482_8933.getText(LanguagePack.aClass526_9276, -1023059693))) {
            var5 = 5;
            textEffect = textEffect.substring(ServerString.aClass482_8933.getText(LanguagePack.aClass526_9276, -225643397).length());
         } else if(LanguagePack.aClass526_9276 != Class599.clientLanguage) {
            if(var3.startsWith(ServerString.aClass482_8774.getText(Class599.clientLanguage, 175763581))) {
               var5 = 1;
               textEffect = textEffect.substring(ServerString.aClass482_8774.getText(Class599.clientLanguage, 1392123654).length());
            } else if(var3.startsWith(ServerString.aClass482_8930.getText(Class599.clientLanguage, -193672694))) {
               var5 = 2;
               textEffect = textEffect.substring(ServerString.aClass482_8930.getText(Class599.clientLanguage, 1315769550).length());
            } else if(var3.startsWith(ServerString.aClass482_8931.getText(Class599.clientLanguage, -1146101555))) {
               var5 = 3;
               textEffect = textEffect.substring(ServerString.aClass482_8931.getText(Class599.clientLanguage, 521964193).length());
            } else if(var3.startsWith(ServerString.aClass482_8932.getText(Class599.clientLanguage, -141789114))) {
               var5 = 4;
               textEffect = textEffect.substring(ServerString.aClass482_8932.getText(Class599.clientLanguage, -947224709).length());
            } else if(var3.startsWith(ServerString.aClass482_8933.getText(Class599.clientLanguage, 839231713))) {
               var5 = 5;
               textEffect = textEffect.substring(ServerString.aClass482_8933.getText(Class599.clientLanguage, -1386553848).length());
            }
         }

         ConnectionHandler var6 = Class32.method230(-718545775);
         Class240_Sub27 var7 = Class47_Sub1.method3496(Class326.aClass326_6260, var6.aClass528_3433, 1917447504);
         var7.aClass240_Sub8_Sub1_7370.putByte(0, -1419831541);
         int var8 = 964952859 * var7.aClass240_Sub8_Sub1_7370.index;
         var7.aClass240_Sub8_Sub1_7370.putByte(textEffectType, -792811291);
         var7.aClass240_Sub8_Sub1_7370.putByte(var5, 1806226219);
         Class134.method1785(var7.aClass240_Sub8_Sub1_7370, textEffect, 1785668603);
         var7.aClass240_Sub8_Sub1_7370.method4521(964952859 * var7.aClass240_Sub8_Sub1_7370.index - var8, -907432342);
         var6.addPacket(var7, 511286519);
      }
   }

   static final void method3053(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class568.method6249(var3, var4, var0, (short)-354);
   }
}
