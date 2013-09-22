
public class Class104_Sub16 extends CharTask {

   int anInt_10703;
   final int anInt_10704;
   final String aString_10705;
   final int anInt_10706;


   Class104_Sub16(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_10703 = var1.readShort(1858938943) * 217402945;
      this.aString_10705 = var1.method4485(3148164);
      this.anInt_10704 = var1.method4480(1260717178) * -21057493;
      this.anInt_10706 = var1.readShort(-1033242005) * -480225233;
   }

   public void execute() {
      Class95.aClass100Array_1894[1758577089 * this.anInt_10703].getTarget((byte)37).showChatMessage(this.aString_10705, -836989309 * this.anInt_10704, 0, this.anInt_10706 * -361500977, (byte)-37);
   }

   static void addPlayerToOptionsList(Player var0, boolean var1, byte var2) {
      if(Class18.optionCount * -740020991 < 412) {
         if(Class521.myPlayer == var0) {
            if(client.aBoolean_463 && 0 != (1458447745 * Class286.anInt_4823 & 16)) {
               Class343.genAndAddOption(client.selectedOption, client.aString_467 + " " + Class8.optionPointer + " " + Class133.addTextColour(16777215, (byte)6) + ServerString.aClass482_8775.getText(Class599.clientLanguage, -1942286855), CacheFileID.anInt_2037 * -1863856065, 16, -1, 0L, 0, 0, true, false, (long)(var0.index * 50743311), false, (byte)28);
            }

         } else {
            String var6;
            if(0 == 699185009 * var0.skillLevel) {
               boolean var3 = true;
               if(-1 != 1519274779 * Class521.myPlayer.anInt_1468 && -1 != 1519274779 * var0.anInt_1468) {
                  int var4 = Class521.myPlayer.anInt_1468 * 1519274779 < var0.anInt_1468 * 1519274779?1519274779 * Class521.myPlayer.anInt_1468:1519274779 * var0.anInt_1468;
                  int var5 = -1767024385 * Class521.myPlayer.combatLevel - -1767024385 * var0.combatLevel;
                  if(var5 < 0) {
                     var5 = -var5;
                  }

                  if(var5 > var4) {
                     var3 = false;
                  }
               }

               String levelOrRating = GamePack.stellardawnPack == client.currentGamePack?ServerString.ratingStr.getText(Class599.clientLanguage, 1029755566):ServerString.levelStr.getText(Class599.clientLanguage, 1554395070);
               if(-1767024385 * var0.combatLevel >= -1807828043 * var0.anInt_1464) {
                  var6 = var0.getName(true, 1448819444) + (var3?Class416.genRelativeColours(var0.combatLevel * -1767024385, Class521.myPlayer.combatLevel * -1767024385, 762006356):Class133.addTextColour(16777215, (byte)6)) + Class8.braceStr + levelOrRating + var0.combatLevel * -1767024385 + Class8.closeBraceStr;
               } else {
                  var6 = var0.getName(true, 1013884979) + (var3?Class416.genRelativeColours(-1767024385 * var0.combatLevel, -1767024385 * Class521.myPlayer.combatLevel, 762006356):Class133.addTextColour(16777215, (byte)6)) + Class8.braceStr + levelOrRating + -1767024385 * var0.combatLevel + "+" + (-1807828043 * var0.anInt_1464 - var0.combatLevel * -1767024385) + Class8.closeBraceStr;
               }
            } else if(-1 == var0.skillLevel * 699185009) {
               var6 = var0.getName(true, -178164232);
            } else {
               var6 = var0.getName(true, 816312985) + Class8.braceStr + ServerString.skillStr.getText(Class599.clientLanguage, 1397603010) + var0.skillLevel * 699185009 + Class8.closeBraceStr;
            }

            if(client.aBoolean_463 && !var1 && 0 != (Class286.anInt_4823 * 1458447745 & 8)) {
               Class343.genAndAddOption(client.selectedOption, client.aString_467 + " " + Class8.optionPointer + " " + Class133.addTextColour(16777215, (byte)6) + var6, -1863856065 * CacheFileID.anInt_2037, 15, -1, (long)(50743311 * var0.index), 0, 0, true, false, (long)(var0.index * 50743311), false, (byte)104);
            }

            if(!var1) {
               for(int var9 = 7; var9 >= 0; --var9) {
                  if(client.playerOptions[var9] != null) {
                     short higherLevelAction = 0;
                     if(GamePack.runescapePack == client.currentGamePack && client.playerOptions[var9].equalsIgnoreCase(ServerString.attackStr.getText(Class599.clientLanguage, -1328643634))) {
                        if(client.aBoolean_436 && -1767024385 * var0.combatLevel > Class521.myPlayer.combatLevel * -1767024385) {
                           higherLevelAction = 2000;
                        }

                        if(584394699 * Class521.myPlayer.anInt_1482 != 0 && var0.anInt_1482 * 584394699 != 0) {
                           if(584394699 * Class521.myPlayer.anInt_1482 == 584394699 * var0.anInt_1482) {
                              higherLevelAction = 2000;
                           } else {
                              higherLevelAction = 0;
                           }
                        } else if(var0.aBoolean_1486) {
                           higherLevelAction = 2000;
                        }
                     } else if(client.aBooleanArray_588[var9]) {
                        higherLevelAction = 2000;
                     }

                     //46 == follow
                     short var12 = (short)(higherLevelAction + client.playerActions[var9]);
                     int var7 = client.anIntArray_398[var9] != -1?client.anIntArray_398[var9]:client.anInt_461 * 609801685;
                     Class343.genAndAddOption(client.playerOptions[var9], Class133.addTextColour(16777215, (byte)6) + var6, var7, var12, -1, (long)(var0.index * 50743311), 0, 0, true, false, (long)(50743311 * var0.index), false, (byte)37);
                  }
               }
            } else {
               Class343.genAndAddOption(Class133.addTextColour(13421772, (byte)6) + var6, "", -1, -1, 0, 0L, 0, 0, false, true, (long)(var0.index * 50743311), false, (byte)23);
            }

            if(!var1) {
               for(OptionListNode var11 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)20); null != var11; var11 = (OptionListNode)Class18.optionNodeList.getNext(-1000586484)) {
                  if(23 == -533194375 * var11.action) { //walk here
                     var11.aString_956 = Class133.addTextColour(16777215, (byte)6) + var6;
                     break;
                  }
               }
            }

         }
      }
   }

   static final void method7371(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class192.method2513(var3, var4, var0, -1095419075);
   }

   static final void method7372(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class374.method4758(var3, var4, var0, 335741482);
   }
}
