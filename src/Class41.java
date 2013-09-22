import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class41 {

   static final Class41 aClass41_891 = new Class41(2);
   static final Class41 aClass41_892 = new Class41(1);
   final int anInt_893;
   static final Class41 aClass41_894 = new Class41(3);
   static final Class41 aClass41_895 = new Class41(4);
   static final Class41 aClass41_896 = new Class41(5);
   static final Class41 aClass41_897 = new Class41(7);
   static final Class41 aClass41_898 = new Class41(6);
   static final Class41 aClass41_899 = new Class41(8);
   static final Class41 aClass41_900 = new Class41(9);
   static final Class41 aClass41_901 = new Class41(10);
   static final Class41 aClass41_902 = new Class41(11);
   static final Class41 aClass41_903 = new Class41(0);
   static final Class41 aClass41_904 = new Class41(13);
   static final Class41 aClass41_905 = new Class41(14);
   static final Class41 aClass41_906 = new Class41(12);


   Class41(int var1) {
      this.anInt_893 = var1 * -1124559109;
   }

   static Class577[] method335(int var0) {
      return new Class577[]{Class577.aClass577_9668, Class577.aClass577_9675, Class577.aClass577_9671, Class577.aClass577_9676, Class577.aClass577_9670, Class577.aClass577_9673, Class577.aClass577_9680, Class577.aClass577_9674, Class577.aClass577_9667, Class577.aClass577_9666, Class577.aClass577_9672, Class577.aClass577_9678, Class577.aClass577_9682, Class577.aClass577_9679};
   }

   static final void method336(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class26.method158(var3, var4, var0, -1521651078);
   }

   static final void method337(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class554.method6142(var3, var0, (byte)-90);
   }

   static final void method338(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub5_7316.method1554(-2144930563);
   }

   static final void method339(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
   }

   public static byte[] method340(Object var0, boolean var1, byte var2) {
      if(null == var0) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var5 = (byte[])((byte[])var0);
         return var1?Arrays.copyOf(var5, var5.length):var5;
      } else if(var0 instanceof ByteBuffer) {
         ByteBuffer var3 = (ByteBuffer)var0;
         byte[] var4 = new byte[var3.capacity()];
         var3.position(0);
         var3.get(var4);
         return var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static int method341(long var0) {
      return (int)(var0 / 86400000L) - 11745;
   }

   static final void method342(RSCharacter character, boolean var1, byte var2) {
      Class263 var3 = character.method3261((short)14337);
      if(character.anInt_4331 * -74820059 == 0) {
         character.anInt_4304 = 0;
         Class411.anInt_7851 = -1452751827 * Class539.aClass539_9457.aByte_9460;
         Class525.anInt_9275 = 0;
      } else {
         if(character.animation.isAnimating(1804316040) && !character.animation.method5877((short)4545)) {
            Animation var4 = character.animation.getAnimation(-1962335359);
            if(992560711 * character.anInt_4345 > 0 && var4.anInt_10115 * -2073113599 == 0) {
               character.anInt_4304 += 377591477;
               Class411.anInt_7851 = Class539.aClass539_9457.aByte_9460 * -1452751827;
               Class525.anInt_9275 = 0;
               return;
            }

            if(character.anInt_4345 * 992560711 <= 0 && 771893093 * var4.anInt_10118 == 0) {
               character.anInt_4304 += 377591477;
               Class411.anInt_7851 = -1452751827 * Class539.aClass539_9457.aByte_9460;
               Class525.anInt_9275 = 0;
               return;
            }
         }

         for(int var18 = 0; var18 < character.aClass322Array_4319.length; ++var18) {
            if(-1 != character.aClass322Array_4319[var18].animationID * -1769281411 && character.aClass322Array_4319[var18].anime.method5877((short)15072)) {
               Class567 var5 = Class75.aClass558_1422.method6164(character.aClass322Array_4319[var18].animationID * -1769281411, (byte)-74);
               if(var5.aBoolean_9630 && -1 != var5.animationID * -1632377741) {
                  Animation var6 = Class88.animeUnpacker.loadAnimation(var5.animationID * -1632377741);
                  if(character.anInt_4345 * 992560711 > 0 && 0 == -2073113599 * var6.anInt_10115) {
                     character.anInt_4304 += 377591477;
                     Class411.anInt_7851 = -1452751827 * Class539.aClass539_9457.aByte_9460;
                     Class525.anInt_9275 = 0;
                     return;
                  }

                  if(character.anInt_4345 * 992560711 <= 0 && 771893093 * var6.anInt_10118 == 0) {
                     character.anInt_4304 += 377591477;
                     Class411.anInt_7851 = Class539.aClass539_9457.aByte_9460 * -1452751827;
                     Class525.anInt_9275 = 0;
                     return;
                  }
               }
            }
         }

         GameCoord var20 = GameCoord.method4308(character.method6203().gameCoord);
         int var19 = (int)var20.floatX;
         int var21 = (int)var20.floatZ;
         int var7 = 512 * character.tilePosArrayX[character.anInt_4331 * -74820059 - 1] + character.method3257() * 256;
         int var8 = 512 * character.tilePosArrayY[character.anInt_4331 * -74820059 - 1] + character.method3257() * 256;
         if(var19 < var7) {
            if(var21 < var8) {
               character.method3249(10240, -1144561297);
            } else if(var21 > var8) {
               character.method3249(14336, -1144561297);
            } else {
               character.method3249(12288, -1144561297);
            }
         } else if(var19 > var7) {
            if(var21 < var8) {
               character.method3249(6144, -1144561297);
            } else if(var21 > var8) {
               character.method3249(2048, -1144561297);
            } else {
               character.method3249(4096, -1144561297);
            }
         } else if(var21 < var8) {
            character.method3249(8192, -1144561297);
         } else if(var21 > var8) {
            character.method3249(0, -1144561297);
         }

         byte var9 = character.aByteArray_4303[-74820059 * character.anInt_4331 - 1];
         if(!var1 && (var7 - var19 > 1024 || var7 - var19 < -1024 || var8 - var21 > 1024 || var8 - var21 < -1024)) {
            character.setPosition((float)var7, var20.floatY, (float)var8);
            character.turnTo(1788884777 * character.rotation, false, -1365932935);
            character.anInt_4331 -= -380906067;
            if(992560711 * character.anInt_4345 > 0) {
               character.anInt_4345 -= -1823046793;
            }

            Class411.anInt_7851 = -1452751827 * Class539.aClass539_9457.aByte_9460;
            Class525.anInt_9275 = 0;
            var20.store();
         } else {
            int var10 = 16;
            boolean var11 = true;
            if(character instanceof NPC) {
               var11 = ((NPC)character).npcComposite.aBoolean_8646;
            }

            int var12;
            if(var11) {
               var12 = 1788884777 * character.rotation - 208910329 * character.aClass6_4337.angle;
               if(0 != var12 && -1 == character.anInt_4312 * 1994913315 && 0 != -231659221 * character.anInt_4340) {
                  var10 = 8;
               }

               if(!var1 && -74820059 * character.anInt_4331 > 2) {
                  var10 = 24;
               }

               if(!var1 && -74820059 * character.anInt_4331 > 3) {
                  var10 = 32;
               }
            } else {
               if(!var1 && -74820059 * character.anInt_4331 > 1) {
                  var10 = 24;
               }

               if(!var1 && -74820059 * character.anInt_4331 > 2) {
                  var10 = 32;
               }
            }

            if(-1813174371 * character.anInt_4304 > 0 && character.anInt_4331 * -74820059 > 1) {
               var10 = 32;
               character.anInt_4304 -= 377591477;
            }

            if(var9 == Class539.aClass539_9458.aByte_9460) {
               var10 <<= 1;
            } else if(var9 == Class539.aClass539_9456.aByte_9460) {
               var10 >>= 1;
            }

            if(var3.anInt_4593 * -603533047 != -1) {
               var10 <<= 9;
               if(-74820059 * character.anInt_4331 == 1) {
                  var12 = character.anInt_4346 * -881241851 * character.anInt_4346 * -881241851;
                  int var13 = ((int)var20.floatX > var7?(int)var20.floatX - var7:var7 - (int)var20.floatX) << 9;
                  int var14 = ((int)var20.floatZ > var8?(int)var20.floatZ - var8:var8 - (int)var20.floatZ) << 9;
                  int var15 = var13 > var14?var13:var14;
                  int var16 = var15 * var3.anInt_4593 * -1207066094;
                  if(var12 > var16) {
                     character.anInt_4346 = character.anInt_4346 * -881241851 / 2 * 574084045;
                  } else if(var12 / 2 > var15) {
                     character.anInt_4346 -= -357642443 * var3.anInt_4593;
                     if(character.anInt_4346 * -881241851 < 0) {
                        character.anInt_4346 = 0;
                     }
                  } else if(character.anInt_4346 * -881241851 < var10) {
                     character.anInt_4346 += -357642443 * var3.anInt_4593;
                     if(-881241851 * character.anInt_4346 > var10) {
                        character.anInt_4346 = 574084045 * var10;
                     }
                  }
               } else if(character.anInt_4346 * -881241851 < var10) {
                  character.anInt_4346 += var3.anInt_4593 * -357642443;
                  if(character.anInt_4346 * -881241851 > var10) {
                     character.anInt_4346 = 574084045 * var10;
                  }
               } else if(character.anInt_4346 * -881241851 > 0) {
                  character.anInt_4346 -= var3.anInt_4593 * -357642443;
                  if(-881241851 * character.anInt_4346 < 0) {
                     character.anInt_4346 = 0;
                  }
               }

               var10 = character.anInt_4346 * -881241851 >> 9;
               if(var10 < 1) {
                  var10 = 1;
               }
            }

            Class525.anInt_9275 = 0;
            if(var19 == var7 && var8 == var21) {
               Class411.anInt_7851 = -1452751827 * Class539.aClass539_9457.aByte_9460;
            } else {
               if(var19 < var7) {
                  var20.floatX += (float)var10;
                  Class525.anInt_9275 = (1279861479 * Class525.anInt_9275 | 4) * -586624809;
                  if(var20.floatX > (float)var7) {
                     var20.floatX = (float)var7;
                  }
               } else if(var19 > var7) {
                  var20.floatX -= (float)var10;
                  Class525.anInt_9275 = (Class525.anInt_9275 * 1279861479 | 8) * -586624809;
                  if(var20.floatX < (float)var7) {
                     var20.floatX = (float)var7;
                  }
               }

               if(var21 < var8) {
                  var20.floatZ += (float)var10;
                  Class525.anInt_9275 = -586624809 * (Class525.anInt_9275 * 1279861479 | 1);
                  if(var20.floatZ > (float)var8) {
                     var20.floatZ = (float)var8;
                  }
               } else if(var21 > var8) {
                  var20.floatZ -= (float)var10;
                  Class525.anInt_9275 = -586624809 * (Class525.anInt_9275 * 1279861479 | 2);
                  if(var20.floatZ < (float)var8) {
                     var20.floatZ = (float)var8;
                  }
               }

               character.setPos(var20);
               if(var10 >= 32) {
                  Class411.anInt_7851 = Class539.aClass539_9458.aByte_9460 * -1452751827;
               } else {
                  Class411.anInt_7851 = -1452751827 * var9;
               }
            }

            if((int)var20.floatX == var7 && (int)var20.floatZ == var8) {
               character.anInt_4331 -= -380906067;
               if(992560711 * character.anInt_4345 > 0) {
                  character.anInt_4345 -= -1823046793;
               }
            }

            var20.store();
         }
      }
   }

   static void method343(long[] var0, Object[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         long var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         Object var9 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var9;
         int var10 = var7 == Long.MAX_VALUE?0:1;

         for(int var11 = var2; var11 < var3; ++var11) {
            if(var0[var11] < var7 + (long)(var11 & var10)) {
               long var12 = var0[var11];
               var0[var11] = var0[var6];
               var0[var6] = var12;
               Object var14 = var1[var11];
               var1[var11] = var1[var6];
               var1[var6++] = var14;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var9;
         method343(var0, var1, var2, var6 - 1, -1946338449);
         method343(var0, var1, var6 + 1, var3, -1152425982);
      }

   }

   static final void method344(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 100;
   }

   public static void method345(CacheDataUnpacker var0, byte var1) {
      Class411.aCacheUnpacker_7786 = var0;
   }
}
