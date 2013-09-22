
public class Class397 {

   public int anInt_7586 = -1030772672;
   static CacheDataUnpacker aCacheUnpacker_7587;
   static CacheNodeArrayList aClass627_7588 = new CacheNodeArrayList(64);
   public int anInt_7589 = -476462837;
   public int anInt_7590 = -1974659520;
   static final int anInt_7591 = 0;
   public int anInt_7592 = 105605482;
   public int anInt_7593 = 852508857;
   public boolean aBoolean_7594 = false;
   public boolean aBoolean_7595 = false;


   void method4945(ByteArrayDataNode var1, int var2, int var3, int var4) {
      if(var2 == 1) {
         this.anInt_7589 = var1.readShort(-1219615909) * 476462837;
         if('\uffff' == 741866845 * this.anInt_7589) {
            this.anInt_7589 = -476462837;
         }
      } else if(2 == var2) {
         this.anInt_7590 = (var1.readShort(-342515515) + 1) * -769051559;
         this.anInt_7586 = (var1.readShort(664396396) + 1) * 1997160097;
      } else if(var2 == 3) {
         var1.getByte((byte)40);
      } else if(4 == var2) {
         this.anInt_7592 = var1.readByte(-848493746) * 52802741;
      } else if(5 == var2) {
         this.anInt_7593 = var1.readByte(233453742) * 852508857;
      } else if(var2 == 6) {
         this.aBoolean_7594 = true;
      } else if(var2 == 7) {
         this.aBoolean_7595 = true;
      }

   }

   void method4946(ByteArrayDataNode var1, int var2, byte var3) {
      while(true) {
         int var4 = var1.readByte(-1079896716);
         if(0 == var4) {
            return;
         }

         this.method4945(var1, var4, var2, -1691941529);
      }
   }

   static void addToOptionList(NPC var0, boolean var1, byte var2) {
      if(Class18.optionCount * -740020991 < 412) {
         NPCComposite var3 = var0.npcComposite;
         String var4 = var0.name;
         if(var3.anIntArray_8642 != null) {
            var3 = var3.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)17);
            if(null == var3) {
               return;
            }

            var4 = var3.name;
         }

         if(var3.aBoolean_8651) {
            if(var0.anInt_1779 * -850211617 != 0) {
               String var5 = client.currentGamePack == GamePack.stellardawnPack?ServerString.ratingStr.getText(Class599.clientLanguage, -1114462732):ServerString.levelStr.getText(Class599.clientLanguage, -1409567528);
               var4 = var4 + Class416.genRelativeColours(var0.anInt_1779 * -850211617, Class521.myPlayer.combatLevel * -1767024385, 762006356) + Class8.braceStr + var5 + var0.anInt_1779 * -850211617 + Class8.closeBraceStr;
            }

            if(client.aBoolean_463 && !var1) {
               Class476 var11 = -1 != Class508.anInt_9143 * 323906445?Class240_Sub1.aClass465_6506.method5610(Class508.anInt_9143 * 323906445, -1872915044):null;
               if((Class286.anInt_4823 * 1458447745 & 2) != 0 && (null == var11 || var3.method5598(Class508.anInt_9143 * 323906445, -80630797 * var11.anInt_8739, 155613144) != var11.anInt_8739 * -80630797)) {
                  Class343.genAndAddOption(client.selectedOption, client.aString_467 + " " + Class8.optionPointer + " " + Class133.addTextColour(16776960, (byte)6) + var4, -1863856065 * CacheFileID.anInt_2037, 8, -1, (long)(var0.index * 50743311), 0, 0, true, false, (long)(50743311 * var0.index), false, (byte)104);
               }
            }

            if(!var1) {
               String[] var12 = var3.optionsArray;
               if(client.aBoolean_475) {
                  var12 = Class572.method6278(var12, 1180273640);
               }

               if(null != var12) {
                  int var6;
                  short var7;
                  int var9;
                  for(var6 = var12.length - 1; var6 >= 0; --var6) {
                     if(var12[var6] != null && (var3.aByte_8619 == 0 || !var12[var6].equalsIgnoreCase(ServerString.attackStr.getText(Class599.clientLanguage, -1816561883)) && !var12[var6].equalsIgnoreCase(ServerString.examineStr.getText(Class599.clientLanguage, 431208492)))) {
                        var7 = 0;
                        int var8 = client.anInt_461 * 609801685;
                        if(0 == var6) {
                           var7 = 9;
                        }

                        if(var6 == 1) {
                           var7 = 10;
                        }

                        if(2 == var6) {
                           var7 = 11;
                        }

                        if(var6 == 3) {
                           var7 = 12;
                        }

                        if(var6 == 4) {
                           var7 = 13;
                        }

                        if(var6 == 5) {
                           var7 = 1003;
                        }

                        var9 = var3.method5606(var6, (byte)123);
                        if(-1 != var9) {
                           var8 = var9;
                        }

                        Class343.genAndAddOption(var12[var6], Class133.addTextColour(16776960, (byte)6) + var4, var12[var6].equalsIgnoreCase(ServerString.attackStr.getText(Class599.clientLanguage, -1395892893))?var3.attackOption * -380457647:var8, var7, -1, (long)(var0.index * 50743311), 0, 0, true, false, (long)(var0.index * 50743311), false, (byte)48);
                     }
                  }

                  if(1 == var3.aByte_8619) {
                     for(var6 = 0; var6 < var12.length; ++var6) {
                        if(var12[var6] != null && (var12[var6].equalsIgnoreCase(ServerString.attackStr.getText(Class599.clientLanguage, -940247828)) || var12[var6].equalsIgnoreCase(ServerString.examineStr.getText(Class599.clientLanguage, -233951215)))) {
                           var7 = 0;
                           if(var0.anInt_1779 * -850211617 > -1767024385 * Class521.myPlayer.combatLevel) {
                              var7 = 2000;
                           }

                           short var13 = 0;
                           var9 = 609801685 * client.anInt_461;
                           if(0 == var6) {
                              var13 = 9;
                           }

                           if(1 == var6) {
                              var13 = 10;
                           }

                           if(var6 == 2) {
                              var13 = 11;
                           }

                           if(3 == var6) {
                              var13 = 12;
                           }

                           if(var6 == 4) {
                              var13 = 13;
                           }

                           if(var6 == 5) {
                              var13 = 1003;
                           }

                           if(var13 != 0) {
                              var13 += var7;
                           }

                           int var10 = var3.method5606(var6, (byte)111);
                           if(var10 != -1) {
                              var9 = var10;
                           }

                           Class343.genAndAddOption(var12[var6], Class133.addTextColour(16776960, (byte)6) + var4, var12[var6].equalsIgnoreCase(ServerString.attackStr.getText(Class599.clientLanguage, 938707004))?var3.attackOption * -380457647:var9, var13, -1, (long)(50743311 * var0.index), 0, 0, true, false, (long)(50743311 * var0.index), false, (byte)47);
                        }
                     }
                  }
               }
            }

         }
      }
   }

   static final void method4948(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1767024385 * Class521.myPlayer.combatLevel;
   }

   static final void method4949(RSInterfaceData var0, int var1) {
      OptionListNode var2 = Class240_Sub33.method4885(1333827485);
      if(Class104_Sub7.getOptionAction(var2, (byte)-48) == 7) {
         int pIndex = (int)var2.getOptionData((short)-14500);
         if(pIndex >= 0 && pIndex <= -688404505 * Class15.availablePlayers) {
            Player player = client.aPlayerArray[pIndex];
            if(null != player) {
               var0.animeTarget = player;
               var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
               return;
            }
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
   }

   static final void method4950(RSInterfaceData var0, int var1) {
      var0.animeTarget.method3267(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], (byte)64);
   }
}
