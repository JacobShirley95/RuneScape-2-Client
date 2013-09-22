import java.util.Arrays;

public class Class618 implements Class617 {

   final int anInt_10014;
   final int[] anIntArray_10015;
   final int anInt_10016;


   public boolean method6609(AbstractMouseNode var1, Class233[] var2, int var3, AbstractKeyboardHandler var4, int var5) {
      if(null == var1) {
         if(-1 != 2136319863 * this.anInt_10016) {
            return false;
         }
      } else {
         if(this.anInt_10016 * 2136319863 != var1.getClickType(745814269)) {
            return false;
         }

         if(this.anInt_10014 * 1854260679 > var1.getMouseInfo()) {
            return false;
         }

         int[] var6 = this.anIntArray_10015;

         for(int var7 = 0; var7 < var6.length; ++var7) {
            int var8 = var6[var7];
            if(!var4.method3208(var8, 1953407658)) {
               return false;
            }
         }
      }

      return true;
   }

   Class618(int var1, int var2, int[] var3) {
      this.anInt_10016 = -222993849 * var1;
      this.anInt_10014 = var2 * -1566807049;
      this.anIntArray_10015 = var3;
   }

   static final void method6611(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var2.intTypeIndex -= -1416056414;
      var0.anInt_2453 = var2.intTypes[var2.intTypeIndex * -831324111] * -189239577;
      var0.anInt_2454 = var2.intTypes[1 + -831324111 * var2.intTypeIndex] * 164945801;
      Class110_Sub1.method3149(var0, 930732295);
      if(0 == var0.index * 1916189739) {
         Class20.method120(var1, var0, false, -402842726);
      }

   }

   static final void method6612(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      if(var3.aString_2514 == null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_2514;
      }

   }

   static final void method6613(RSInterfaceData var0, int var1) {
      var0.intTypes[var0.intTypeIndex * -831324111 - 1] = var0.aClass240_Sub47_9501.method4982(-1317057430)[var0.intTypes[var0.intTypeIndex * -831324111 - 1]];
   }

   public static void method6614(Player var0, int var1, int var2, int var3) {
      int[] var4 = new int[Class12.method70((byte)16).length];
      Arrays.fill(var4, 0, var4.length, var1);
      Class532.method6035(var0, var4, var2, false, 48063579);
   }

   public static Class418[] method6615(int var0) {
      return new Class418[]{Class418.aClass418_7937, Class418.aClass418_7935, Class418.aClass418_7936, Class418.aClass418_7938, Class418.aClass418_7940, Class418.aClass418_7939, Class418.aClass418_7942, Class418.aClass418_7941, Class418.aClass418_7946, Class418.aClass418_7943, Class418.aClass418_7944, Class418.aClass418_7945, Class418.aClass418_7934, Class418.aClass418_7947, Class418.aClass418_7948};
   }

   static int method6616(int var0) {
      if(null == client.aClass132_523) {
         if(!Class18.optionsClosed) {
            if(Class268.aClass586_4646.aBoolean_9732) {
               if(null != Class283_Sub2.aClass240_Sub22_Sub3_7729) {
                  return -380489113 * Class283_Sub2.aClass240_Sub22_Sub3_7729.anInt_946;
               }
            } else if(null != Class465.firstOptionNode) {
               return -380489113 * Class465.firstOptionNode.anInt_946;
            }
         } else {
            RSFont var1 = DamageSprite.method6530((byte)-14);
            int var2 = Class53.captureMouseList.getCaptureMouseX();
            int var3 = Class53.captureMouseList.getCaptureMouseY();
            int var4;
            int var5;
            int var6;
            OptionListNode var7;
            if(!Class18.aBoolean_148) {
               if(var2 > -1754705091 * WeakReference_Sub1.optionBoxX && var2 < 1516402115 * Class558.optionsBoxWidth + -1754705091 * WeakReference_Sub1.optionBoxX) {
                  var4 = -1;

                  for(var5 = 0; var5 < Class18.optionCount * -740020991; ++var5) {
                     if(Class18.aBoolean_172) {
                        var6 = var1.anInt_8573 * 915612327 + -702210997 * Class258.optionBoxY + 20 + 1 + (Class18.optionCount * -740020991 - 1 - var5) * 32251295 * Class18.anInt_144;
                        if(var3 > var6 - 915612327 * var1.anInt_8573 - 1 && var3 < var6 + 2080531379 * var1.anInt_8571) {
                           var4 = var5;
                        }
                     } else {
                        var6 = -702210997 * Class258.optionBoxY + 31 + 32251295 * Class18.anInt_144 * (Class18.optionCount * -740020991 - 1 - var5);
                        if(var3 > var6 - var1.anInt_8573 * 915612327 - 1 && var3 < var1.anInt_8571 * 2080531379 + var6) {
                           var4 = var5;
                        }
                     }
                  }

                  if(-1 != var4) {
                     var5 = 0;
                     Class527 var8 = new Class527(Class18.optionNodeList);

                     for(var7 = (OptionListNode)var8.method6005(-1148351858); var7 != null; var7 = (OptionListNode)var8.next()) {
                        if(var5++ == var4) {
                           return var7.anInt_946 * -380489113;
                        }
                     }
                  }
               }
            } else {
               IteratorNodeList var9;
               if(var2 > -1754705091 * WeakReference_Sub1.optionBoxX && var2 < Class558.optionsBoxWidth * 1516402115 + WeakReference_Sub1.optionBoxX * -1754705091) {
                  var4 = -1;

                  for(var5 = 0; var5 < Class18.anInt_155 * -917762761; ++var5) {
                     if(Class18.aBoolean_172) {
                        var6 = 1 + 915612327 * var1.anInt_8573 + 20 + Class258.optionBoxY * -702210997 + var5 * Class18.anInt_144 * 32251295;
                        if(var3 > var6 - 915612327 * var1.anInt_8573 - 1 && var3 < var6 + 2080531379 * var1.anInt_8571) {
                           var4 = var5;
                        }
                     } else {
                        var6 = 31 + Class258.optionBoxY * -702210997 + 32251295 * Class18.anInt_144 * var5;
                        if(var3 > var6 - var1.anInt_8573 * 915612327 - 1 && var3 < 2080531379 * var1.anInt_8571 + var6) {
                           var4 = var5;
                        }
                     }
                  }

                  if(var4 != -1) {
                     var5 = 0;
                     var9 = new IteratorNodeList(Class18.aClass494_158);

                     for(Class240_Sub22_Sub1 var10 = (Class240_Sub22_Sub1)var9.method5923(-1925734065); var10 != null; var10 = (Class240_Sub22_Sub1)var9.next()) {
                        if(var5++ == var4) {
                           return ((OptionListNode)var10.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277).anInt_946 * -380489113;
                        }
                     }
                  }
               } else if(Class18.aClass240_Sub22_Sub1_166 != null && var2 > Class474.anInt_8725 * -899275041 && var2 < -899275041 * Class474.anInt_8725 + Class113.anInt_2072 * -1723475363) {
                  var4 = -1;

                  for(var5 = 0; var5 < -1686791407 * Class18.aClass240_Sub22_Sub1_166.anInt_799; ++var5) {
                     if(Class18.aBoolean_172) {
                        var6 = 1 + 915612327 * var1.anInt_8573 + 20 + -1827679021 * Class43.anInt_939 + 32251295 * Class18.anInt_144 * var5;
                        if(var3 > var6 - 915612327 * var1.anInt_8573 - 1 && var3 < var6 + var1.anInt_8571 * 2080531379) {
                           var4 = var5;
                        }
                     } else {
                        var6 = 32251295 * Class18.anInt_144 * var5 + Class43.anInt_939 * -1827679021 + 31;
                        if(var3 > var6 - 915612327 * var1.anInt_8573 - 1 && var3 < var6 + var1.anInt_8571 * 2080531379) {
                           var4 = var5;
                        }
                     }
                  }

                  if(var4 != -1) {
                     var5 = 0;
                     var9 = new IteratorNodeList(Class18.aClass240_Sub22_Sub1_166.aClass494_798);

                     for(var7 = (OptionListNode)var9.method5923(-1310837729); null != var7; var7 = (OptionListNode)var9.next()) {
                        if(var5++ == var4) {
                           return var7.anInt_946 * -380489113;
                        }
                     }
                  }
               }
            }
         }
      }

      return -1;
   }

   public static int method6617(int var0, int var1, boolean var2, boolean var3, int var4) {
      Class240_Sub46 var5 = Class416.method5153(var0, var3, (byte)-24);
      if(var5 == null) {
         return 0;
      } else {
         int var6 = 0;

         for(int var7 = 0; var7 < var5.anIntArray_7650.length; ++var7) {
            if(var5.anIntArray_7650[var7] >= 0 && var5.anIntArray_7650[var7] < -161459533 * Class592.cacheObjectLoader.anInt_8588) {
               ObjectDescriptor var8 = Class592.cacheObjectLoader.getObjectDescriptor(var5.anIntArray_7650[var7]);
               int var9 = var8.method5476(var1, Class240_Sub1.aClass465_6506.method5610(var1, 1467961653).anInt_8739 * -80630797, (byte)-82);
               if(var2) {
                  var6 += var5.anIntArray_7647[var7] * var9;
               } else {
                  var6 += var9;
               }
            }
         }

         return var6;
      }
   }

   static final void method6618(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      if(-1 != 2142376247 * var3.itemID) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 736448653 * var3.itemAmount;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method6619(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub9_7325, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1?1:0, 63330642);
      Class23.method144(-1778933662);
      Class83.method1089(-1325971444);
      client.aBoolean_568 = false;
   }
}
