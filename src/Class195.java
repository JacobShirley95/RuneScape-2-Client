
public class Class195 {

   int anInt_3377;
   float aFloat_3378 = 1.0F;
   float aFloat_3379 = 1.0F;
   int anInt_3380;
   int anInt_3381;
   int anInt_3382;
   int anInt_3383;
   int anInt_3384;
   int anInt_3385;
   int anInt_3386;
   float aFloat_3387;


   Class195(int var1, float var2, float var3, int var4, int var5, int var6) {
      this.anInt_3383 = var1 * -1817246033;
      this.aFloat_3378 = var2;
      this.aFloat_3379 = var3;
      this.anInt_3380 = var4 * 18457649;
      this.anInt_3381 = var5 * 950273417;
      this.anInt_3382 = var6 * 943779647;
   }

   Class195 method2524(int var1) {
      return new Class195(this.anInt_3383 * -1861349297, this.aFloat_3378, this.aFloat_3379, this.anInt_3380 * -446221103, -1615331143 * this.anInt_3381, this.anInt_3382 * 1653768383);
   }

   void method2525(Class195 var1, byte var2) {
      this.aFloat_3378 = var1.aFloat_3378;
      this.aFloat_3379 = var1.aFloat_3379;
      this.anInt_3380 = var1.anInt_3380 * 1;
      this.anInt_3381 = var1.anInt_3381 * 1;
      this.anInt_3383 = 1 * var1.anInt_3383;
      this.anInt_3382 = 1 * var1.anInt_3382;
   }

   Class195(int var1) {
      this.anInt_3383 = var1 * -1817246033;
   }

   static final void method2526(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.mouseData[var0.anIntArray_9518[var0.anInt_9510 * -1756266293]];
   }

   static final void method2527(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      DamageAnimeLoader.method6650(var3, var4, var0, -1398294791);
   }

   static final void method2528(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class215.method2697(var3, var4, var0, -81910443);
   }

   static final void method2529(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class240_Sub22_Sub10 var3 = Class534.aClass275_9439.method3606(var2, -1628869231);
      if(var3.anIntArray_3540 == null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anIntArray_3540.length;
      }

   }

   static String method2530(String var0, boolean var1, byte var2) {
      String var3 = var1?"https://":"http://";
      if(Class554.aClass554_9536 == Class209.currentGameMode) {
         var0 = var0 + "-wtrc";
      } else if(Class209.currentGameMode == Class554.aClass554_9534) {
         var0 = var0 + "-wtqa";
      } else if(Class209.currentGameMode == Class554.aClass554_9530) {
         var0 = var0 + "-wtwip";
      } else if(Class554.aClass554_9532 == Class209.currentGameMode) {
         var0 = var0 + "-wti";
      } else if(Class209.currentGameMode == Class554.aClass554_9539) {
         var0 = var0 + "-demo";
      } else if(Class209.currentGameMode == Class554.aClass554_9533) {
         var0 = "local";
      }

      String var4 = "";
      if(client.aString_273 != null) {
         var4 = "/p=" + client.aString_273;
      }

      String var5 = client.currentGamePack.gameID + ".com";
      return var3 + var0 + "." + var5 + "/l=" + -1663699585 * Class599.clientLanguage.languageID + "/a=" + 1020203353 * client.anInt_275 + var4 + "/";
   }

   public static boolean method2531(int var0, int var1, int var2) {
      if(!Class18.optionsClosed) {
         return false;
      } else {
         int var3 = var0 >> 16;
         int var4 = var0 & '\uffff';
         if(RSInterface.interfaceGroups[var3] != null && RSInterface.interfaceGroups[var3].interfaceArray[var4] != null) {
            RSInterface var5 = RSInterface.interfaceGroups[var3].interfaceArray[var4];
            OptionListNode var6;
            if(-1 == var1 && 0 == 1916189739 * var5.index) {
               for(var6 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)20); null != var6; var6 = (OptionListNode)Class18.optionNodeList.getNext(66401722)) {
                  if(58 == -533194375 * var6.action || -533194375 * var6.action == 1007 || -533194375 * var6.action == 25 || 57 == -533194375 * var6.action || 30 == var6.action * -533194375) {
                     for(RSInterface var7 = RSServerQueue.getInterface(1513669415 * var6.targetY, (byte)105); null != var7; var7 = Class322.method3967(RSInterface.interfaceGroups[var7.cacheID * 1278853609 >> 16], var7, 309051117)) {
                        if(1278853609 * var5.cacheID == 1278853609 * var7.cacheID) {
                           return true;
                        }
                     }
                  }
               }
            } else {
               for(var6 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)93); null != var6; var6 = (OptionListNode)Class18.optionNodeList.getNext(-2047841829)) {
                  if(-1502165601 * var6.targetX == var1 && 1278853609 * var5.cacheID == 1513669415 * var6.targetY && (-533194375 * var6.action == 58 || -533194375 * var6.action == 1007 || 25 == var6.action * -533194375 || 57 == -533194375 * var6.action || var6.action * -533194375 == 30)) {
                     return true;
                  }
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }
}
