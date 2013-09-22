
public class Class520 implements Class551 {

   public static final Class520 aClass520_9236 = new Class520(-2);
   public static final Class520 aClass520_9237 = new Class520(-3);
   static final Class520 aClass520_9238 = new Class520(20);
   public static final Class520 aClass520_9239 = new Class520(3);
   static final Class520 aClass520_9240 = new Class520(21);
   static final Class520 aClass520_9241 = new Class520(2);
   final int anInt_9242;
   public static Class445 aClass445_9243;
   public static boolean aBoolean_9244;


   public int getLanguageID(int var1) {
      return this.anInt_9242 * -367849759;
   }

   Class520(int var1) {
      this.anInt_9242 = var1 * -658066143;
   }

   static boolean method5967(byte var0) {
      Class11.anInt_58 = -1222210952;
      Class11.clientServerHandler = client.gameConnectionHandler;
      if(null != client.aByteArray_595) {
         ByteArrayDataNode var1 = new ByteArrayDataNode(client.aByteArray_595);
         Class11.aLong_99 = var1.method4538(1385013726) * -3016473431628976607L;
         Class11.aLong_91 = var1.method4538(1385013726) * 4480658858361632081L;
      }

      if(Class11.aLong_99 * -6939556774457567775L < 0L) {
         Class606.method6520(35, '\uff00');
         return false;
      } else {
         return Class240_Sub44.method4969(false, true, "", "", Class11.aLong_99 * -6939556774457567775L);
      }
   }

   static final void method5968(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3986(1357405277) == 1?1:0;
   }

   static void method5969(int var0) {
      if(client.anInt_544 * -1985343409 < 0) {
         RSFont var1 = DamageSprite.method6530((byte)-112);
         if(!Class18.optionsClosed) {
            Class18.aBoolean_148 = Class18.anInt_175 * 1197071853 != -1 && -740020991 * Class18.optionCount >= 1197071853 * Class18.anInt_175 || (Class18.aBoolean_172?26:22) + -740020991 * Class18.optionCount * 32251295 * Class18.anInt_144 > -75607525 * Class597.canvasHeight;
         }

         Class18.aNodeList_159.clear(684066277);
         Class18.aNodeList_160.clear(-1947877847);

         int index = 0;
         for(OptionListNode var2 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)25); var2 != null; var2 = (OptionListNode)Class18.optionNodeList.getNext(-1067788615)) {
            index = -533194375 * var2.action;
            if(index < 1000) {
               var2.shiftNext();
               if(index != 59 && 2 != index && index != 8 && index != 17 && index != 15 && 16 != index && 58 != index) {
                  Class18.aNodeList_159.addNode(var2, (short)865);
               } else {
                  Class18.aNodeList_160.addNode(var2, (short)-559);
               }
            }
         }

         Class18.aNodeList_159.insert(Class18.optionNodeList);
         Class18.aNodeList_160.insert(Class18.optionNodeList);
         if(-740020991 * Class18.optionCount > 1) {
            if(GamePack.method5982((byte)-27) && -740020991 * Class18.optionCount > 2) {
               Class465.firstOptionNode = (OptionListNode)Class18.optionNodeList.rootNode.nextNode.nextNode;
            } else {
               Class465.firstOptionNode = (OptionListNode)Class18.optionNodeList.rootNode.nextNode;
            }

            Class625.aClass240_Sub22_Sub3_10047 = (OptionListNode)Class18.optionNodeList.rootNode.nextNode;
            if(Class18.optionCount * -740020991 > 2) {
               Class283_Sub2.aClass240_Sub22_Sub3_7729 = (OptionListNode)Class625.aClass240_Sub22_Sub3_10047.nextNode;
            } else {
               Class283_Sub2.aClass240_Sub22_Sub3_7729 = null;
            }
         } else {
            Class465.firstOptionNode = null;
            Class625.aClass240_Sub22_Sub3_10047 = null;
            Class283_Sub2.aClass240_Sub22_Sub3_7729 = null;
         }

         int mouseX;
         AbstractMouseNode mouseNode = (AbstractMouseNode)client.mouseNodeList.getBaseNode_2((byte)28);
         int mouseY;
         if(null != mouseNode) {
            mouseX = mouseNode.getMouseX((byte)-77);
            mouseY = mouseNode.getMouseY(527843953);
         } else {
            mouseX = Class53.captureMouseList.getCaptureMouseX();
            mouseY = Class53.captureMouseList.getCaptureMouseY();
         }

         boolean var15;
         if(Class18.optionsClosed) {
            int var6;
            int var7;
            if(Class319.method3952(Class268.aClass586_4646.aClass617_9733, mouseNode, -1143262274)) {
               int var5;
               OptionListNode var8;
               IteratorNodeList var14;
               if(null != Class18.aClass240_Sub22_Sub1_166 && mouseX >= -899275041 * Class474.anInt_8725 && mouseX <= Class474.anInt_8725 * -899275041 + Class113.anInt_2072 * -1723475363 && mouseY >= -1827679021 * Class43.anInt_939 && mouseY <= Class43.anInt_939 * -1827679021 + ScreenCharText.anInt_6172 * -1190617749) {
                  var5 = -1;

                  for(var6 = 0; var6 < -1686791407 * Class18.aClass240_Sub22_Sub1_166.anInt_799; ++var6) {
                     if(Class18.aBoolean_172) {
                        var7 = 915612327 * var1.anInt_8573 + 20 + Class43.anInt_939 * -1827679021 + 1 + 32251295 * Class18.anInt_144 * var6;
                        if(mouseY > var7 - var1.anInt_8573 * 915612327 - 1 && mouseY < var7 + var1.anInt_8571 * 2080531379) {
                           var5 = var6;
                        }
                     } else {
                        var7 = 32251295 * Class18.anInt_144 * var6 + 31 + -1827679021 * Class43.anInt_939;
                        if(mouseY > var7 - 13 && mouseY < 3 + var7) {
                           var5 = var6;
                        }
                     }
                  }

                  if(-1 != var5) {
                     var6 = 0;
                     var14 = new IteratorNodeList(Class18.aClass240_Sub22_Sub1_166.aClass494_798);

                     for(var8 = (OptionListNode)var14.method5923(-1870095433); null != var8; var8 = (OptionListNode)var14.next()) {
                        if(var5 == var6) {
                           Class491.method5753(var8, mouseX, mouseY, (byte)3);
                           break;
                        }

                        ++var6;
                     }
                  }

                  Class602.method6502(-1194383738);
               } else if(mouseX >= -1754705091 * WeakReference_Sub1.optionBoxX && mouseX <= WeakReference_Sub1.optionBoxX * -1754705091 + 1516402115 * Class558.optionsBoxWidth && mouseY >= -702210997 * Class258.optionBoxY && mouseY <= 860305223 * Class638.optionsBoxHeight + -702210997 * Class258.optionBoxY) {
                  if(!Class18.aBoolean_148) {
                     var5 = -1;

                     for(var6 = 0; var6 < Class18.optionCount * -740020991; ++var6) {
                        if(Class18.aBoolean_172) {
                           var7 = (Class18.optionCount * -740020991 - 1 - var6) * 32251295 * Class18.anInt_144 + -702210997 * Class258.optionBoxY + 20 + 915612327 * var1.anInt_8573 + 1;
                           if(mouseY > var7 - 915612327 * var1.anInt_8573 - 1 && mouseY < var7 + 2080531379 * var1.anInt_8571) {
                              var5 = var6;
                           }
                        } else {
                           var7 = 32251295 * Class18.anInt_144 * (Class18.optionCount * -740020991 - 1 - var6) + 31 + Class258.optionBoxY * -702210997;
                           if(mouseY > var7 - 13 && mouseY < 3 + var7) {
                              var5 = var6;
                           }
                        }
                     }

                     if(var5 != -1) {
                        var6 = 0;
                        Class527 var12 = new Class527(Class18.optionNodeList);

                        for(var8 = (OptionListNode)var12.method6005(-1389164266); null != var8; var8 = (OptionListNode)var12.next()) {
                           if(var5 == var6) {
                              Class491.method5753(var8, mouseX, mouseY, (byte)3);
                              break;
                           }

                           ++var6;
                        }
                     }

                     Class602.method6502(-1194383738);
                  } else {
                     var5 = -1;

                     for(var6 = 0; var6 < Class18.anInt_155 * -917762761; ++var6) {
                        if(Class18.aBoolean_172) {
                           var7 = 32251295 * Class18.anInt_144 * var6 + 1 + var1.anInt_8573 * 915612327 + Class258.optionBoxY * -702210997 + 20;
                           if(mouseY > var7 - var1.anInt_8573 * 915612327 - 1 && mouseY < 2080531379 * var1.anInt_8571 + var7) {
                              var5 = var6;
                              break;
                           }
                        } else {
                           var7 = Class18.anInt_144 * 32251295 * var6 + 31 + -702210997 * Class258.optionBoxY;
                           if(mouseY > var7 - 13 && mouseY < 3 + var7) {
                              var5 = var6;
                              break;
                           }
                        }
                     }

                     if(-1 != var5) {
                        var6 = 0;
                        var14 = new IteratorNodeList(Class18.aClass494_158);

                        for(Class240_Sub22_Sub1 var13 = (Class240_Sub22_Sub1)var14.method5923(-1904372485); var13 != null; var13 = (Class240_Sub22_Sub1)var14.next()) {
                           if(var5 == var6) {
                              Class491.method5753((OptionListNode)var13.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277, mouseX, mouseY, (byte)3);
                              Class602.method6502(-1194383738);
                              break;
                           }

                           ++var6;
                        }
                     }
                  }
               }
            } else {
               var15 = false;
               if(null != Class18.aClass240_Sub22_Sub1_166) {
                  if(mouseX >= -899275041 * Class474.anInt_8725 - 10 && mouseX <= -1723475363 * Class113.anInt_2072 + Class474.anInt_8725 * -899275041 + 10 && mouseY >= -1827679021 * Class43.anInt_939 - 10 && mouseY <= -1190617749 * ScreenCharText.anInt_6172 + Class43.anInt_939 * -1827679021 + 10) {
                     var15 = true;
                  } else {
                     WorldObjects.method3460(1715174009);
                  }
               }

               if(!var15) {
                  if(mouseX >= WeakReference_Sub1.optionBoxX * -1754705091 - 10 && mouseX <= 1516402115 * Class558.optionsBoxWidth + -1754705091 * WeakReference_Sub1.optionBoxX + 10 && mouseY >= -702210997 * Class258.optionBoxY - 10 && mouseY <= Class638.optionsBoxHeight * 860305223 + Class258.optionBoxY * -702210997 + 10) {
                     if(Class18.aBoolean_148) {
                        var6 = -1;
                        var7 = -1;

                        int var16;
                        for(var16 = 0; var16 < -917762761 * Class18.anInt_155; ++var16) {
                           int var9;
                           if(Class18.aBoolean_172) {
                              var9 = 32251295 * Class18.anInt_144 * var16 + 1 + var1.anInt_8573 * 915612327 + Class258.optionBoxY * -702210997 + 20;
                              if(mouseY > var9 - var1.anInt_8573 * 915612327 - 1 && mouseY < var9 + var1.anInt_8571 * 2080531379) {
                                 var6 = var16;
                                 var7 = var9 - var1.anInt_8573 * 915612327 - 1;
                                 break;
                              }
                           } else {
                              var9 = 31 + -702210997 * Class258.optionBoxY + var16 * 32251295 * Class18.anInt_144;
                              if(mouseY > var9 - 13 && mouseY < 3 + var9) {
                                 var6 = var16;
                                 var7 = var9 - 13;
                                 break;
                              }
                           }
                        }

                        if(-1 != var6) {
                           var16 = 0;
                           IteratorNodeList var17 = new IteratorNodeList(Class18.aClass494_158);

                           for(Class240_Sub22_Sub1 var10 = (Class240_Sub22_Sub1)var17.method5923(-1876927475); var10 != null; var10 = (Class240_Sub22_Sub1)var17.next()) {
                              if(var16 == var6) {
                                 if(var10.anInt_799 * -1686791407 > 1) {
                                    Class533.method6039(var10, var7, -550713303);
                                 }
                                 break;
                              }

                              ++var16;
                           }
                        }
                     }
                  } else {
                     Class602.method6502(-1194383738);
                  }
               }
            }
         } else {
            var15 = Class319.method3952(Class268.aClass586_4646.aClass617_9734, mouseNode, -164537724);
            boolean var19 = Class319.method3952(Class268.aClass586_4646.aClass617_9742, mouseNode, -1564373977);
            boolean var20 = Class319.method3952(Class268.aClass586_4646.aClass617_9738, mouseNode, -663273500);
            if((var15 || var19) && (555842189 * client.anInt_458 == 1 && Class18.optionCount * -740020991 > 2 || Class48.method490((byte)-127))) {
               var20 = true;
            }

            if(var20 && Class18.optionCount * -740020991 > 0) {
               if(client.aClass132_523 == null && client.anInt_493 * -836263273 == 0) {
                  Class508.method5908(mouseX, mouseY, (byte)61);
               } else {
                  Class18.anInt_179 = -1292327442;
               }
            } else if(var19) {
               if(Class283_Sub2.aClass240_Sub22_Sub3_7729 != null) {
                  Class491.method5753(Class283_Sub2.aClass240_Sub22_Sub3_7729, mouseX, mouseY, (byte)3);
               }
            } else if(var15) {
               if(Class465.firstOptionNode != null) {
                  boolean var18 = client.aClass132_523 != null || client.anInt_493 * -836263273 > 0;
                  if(var18) {
                     Class18.anInt_179 = -646163721;
                     Class39.aClass240_Sub22_Sub3_866 = Class465.firstOptionNode;
                  } else {
                     Class491.method5753(Class465.firstOptionNode, mouseX, mouseY, (byte)3);
                  }
               } else if(client.aBoolean_463) {
                  Class537.method6073(915068988);
               }
            }

            if(null == client.aClass132_523 && client.anInt_493 * -836263273 == 0) {
               Class18.anInt_179 = 0;
               Class39.aClass240_Sub22_Sub3_866 = null;
            }
         }

      }
   }
}
