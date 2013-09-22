
public class Class105 {

   public int anInt_1979;
   int anInt_1980;
   public int anInt_1981;
   public int anInt_1982;
   public int anInt_1983;
   public int anInt_1984;
   public int anInt_1985;


   public Class105(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.anInt_1982 = var1 * -2086445537;
      this.anInt_1981 = var2 * 313684481;
      this.anInt_1985 = var3 * -389863671;
      this.anInt_1980 = var4 * -1124323667;
      this.anInt_1983 = 656375255 * var5;
      this.anInt_1984 = 1726833909 * var6;
      this.anInt_1979 = 1882640509 * var7;
   }

   public boolean method1352(Class105 var1, byte var2) {
      return var1.anInt_1982 * 1829281247 == this.anInt_1982 * 1829281247 && var1.anInt_1981 * 1611763201 == 1611763201 * this.anInt_1981 && -1210673351 * this.anInt_1985 == var1.anInt_1985 * -1210673351 && -384867035 * var1.anInt_1980 == -384867035 * this.anInt_1980 && this.anInt_1983 * 559531495 == 559531495 * var1.anInt_1983 && this.anInt_1984 * -146987171 == -146987171 * var1.anInt_1984 && 2061838549 * var1.anInt_1979 == 2061838549 * this.anInt_1979;
   }

   public Class105() {}

   static final void method1353(RSInterfaceData var0, byte var1) {
      Class240_Sub6 var2 = (Class240_Sub6)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(Class542.aClass43_Sub1_9475.method370(1051744738) != Class116.aClass116_2086) {
         throw new RuntimeException();
      } else {
         Class66_Sub2 var3 = (Class66_Sub2)Class542.aClass43_Sub1_9475.method398(1804588384);
         var3.method2812(var2, (byte)38);
      }
   }

   static final void method1354(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      boolean var3 = true;
      if(var2 < 0) {
         var3 = 0 == (var2 + 1) % 4;
      } else if(var2 < 1582) {
         var3 = 0 == var2 % 4;
      } else if(var2 % 4 != 0) {
         var3 = false;
      } else if(var2 % 100 != 0) {
         var3 = true;
      } else if(0 != var2 % 400) {
         var3 = false;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3?1:0;
   }

   public static Class495[] method1355(int var0) {
      return new Class495[]{Class495.aClass495_9051, Class495.aClass495_9039, Class495.aClass495_9049, Class495.aClass495_9063, Class495.aClass495_9045, Class495.aClass495_9048, Class495.aClass495_9047, Class495.aClass495_9052, Class495.aClass495_9055, Class495.aClass495_9044, Class495.aClass495_9059, Class495.aClass495_9058, Class495.aClass495_9061, Class495.aClass495_9042, Class495.aClass495_9054, Class495.aClass495_9050, Class495.aClass495_9053, Class495.aClass495_9056, Class495.aClass495_9046, Class495.aClass495_9060, Class495.aClass495_9043, Class495.aClass495_9040, Class495.aClass495_9057};
   }

   public static RSFont method1356(CacheDataUnpacker var0, int var1, int var2) {
      byte[] var3 = var0.method3566(var1, 475108815);
      return var3 == null?null:new RSFont(var3);
   }

   static final void method1357(Class563_Sub1 var0, int var1, boolean var2, byte var3) {
      int var7;
      int var8;
      if(var0 instanceof PositionEntity && var0 instanceof Class218) {
         PositionEntity var9 = (PositionEntity)var0;
         int var5 = 1 + (var9.locX2 - var9.locX) << 9;
         int var6 = var9.locY2 - var9.locY + 1 << 9;
         var7 = (var9.locX << 9) + var5 / 2;
         var8 = var6 / 2 + (var9.locY << 9);
      } else {
         GameCoord var4 = var0.method6203().gameCoord;
         var7 = (int)var4.floatX;
         var8 = (int)var4.floatZ;
      }

      Class488.setScreenMarkerPos(var0.plane, var7, var8, 0, var1, var2, -1419668923);
   }

   public static void method1358(int var0, int var1, int var2, int var3, int var4) {
      Class240_Sub19 var5;
      for(var5 = (Class240_Sub19)Class240_Sub19.aNodeList_7144.getBaseNode_2((byte)44); var5 != null; var5 = (Class240_Sub19)Class240_Sub19.aNodeList_7144.getNext(-2042156172)) {
         Class578.method6312(var5, var0, var1, var2, var3, 2106377984);
      }

      byte var6;
      Class263 var7;
      int var8;
      int var9;
      GameCoord var12;
      for(var5 = (Class240_Sub19)Class240_Sub19.aNodeList_7178.getBaseNode_2((byte)45); null != var5; var5 = (Class240_Sub19)Class240_Sub19.aNodeList_7178.getNext(-1946331591)) {
         var6 = 1;
         var7 = var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173.method3261((short)-23244);
         var8 = var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173.stance.getAnimationID(-43383838);
         if(-1 != var8 && !var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173.stance.isStationary) {
            if(var8 != var7.anInt_4564 * -424471161 && var8 != var7.anInt_4576 * -1174724853 && var8 != var7.anInt_4561 * -1278757251 && var8 != var7.anInt_4553 * 1034825445) {
               if(var7.anInt_4568 * 69768581 == var8 || 9421325 * var7.anInt_4563 == var8 || 1655148515 * var7.anInt_4569 == var8 || var7.anInt_4595 * 613044169 == var8) {
                  var6 = 3;
               }
            } else {
               var6 = 2;
            }
         } else {
            var6 = 0;
         }

         if(var6 != var5.anInt_7162 * -1353145527) {
            var9 = Class321.method3964(var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173, -1268675441);
            NPCComposite var10 = var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173.npcComposite;
            if(var10.anIntArray_8642 != null) {
               var10 = var10.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-42);
            }

            if(null != var10 && var9 != -1) {
               if(1828702211 * var5.anInt_7166 == var9 && var5.aBoolean_7167 == var10.aBoolean_8662) {
                  var5.anInt_7162 = -2083406087 * var6;
                  var5.anInt_7154 = var10.anInt_8661 * 1004078415;
               } else {
                  boolean var11 = false;
                  if(var5.aClass240_Sub41_Sub5_7170 != null) {
                     var5.anInt_7154 -= -723271168;
                     if(var5.anInt_7154 * 1282773537 <= 0) {
                        Class217.aClass240_Sub41_Sub4_3757.method531(var5.aClass240_Sub41_Sub5_7170);
                        var5.aClass240_Sub41_Sub5_7170 = null;
                        var11 = true;
                     }
                  } else {
                     var11 = true;
                  }

                  if(var11) {
                     var5.anInt_7154 = var10.anInt_8661 * 1004078415;
                     var5.aClass240_Sub7_Sub1_Sub2_7169 = null;
                     var5.aClass240_Sub2_7168 = null;
                     var5.anInt_7166 = -1786305877 * var9;
                     var5.aBoolean_7167 = var10.aBoolean_8662;
                     var5.anInt_7162 = var6 * -2083406087;
                  }
               }
            } else {
               var5.anInt_7166 = 1786305877;
               var5.aBoolean_7167 = false;
               var5.anInt_7162 = -2083406087 * var6;
            }
         }

         var12 = var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173.method6203().gameCoord;
         var5.anInt_7148 = 1828374563 * (int)var12.floatX;
         var5.anInt_7176 = ((int)var12.floatX + (var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173.method3257() << 8)) * -1690930069;
         var5.anInt_7149 = (int)var12.floatZ * -694677133;
         var5.anInt_7174 = ((int)var12.floatZ + (var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173.method3257() << 8)) * 492108747;
         var5.anInt_7147 = var5.aClass563_Sub1_Sub4_Sub4_Sub2_7173.plane * -1550687659;
         Class578.method6312(var5, var0, var1, var2, var3, 2104182880);
      }

      for(var5 = (Class240_Sub19)Class240_Sub19.aNodeArrayList_7146.start(); null != var5; var5 = (Class240_Sub19)Class240_Sub19.aNodeArrayList_7146.next()) {
         var6 = 1;
         var7 = var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.method3261((short)-2546);
         var8 = var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.stance.getAnimationID(-22876533);
         if(var8 != -1 && !var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.stance.isStationary) {
            if(var7.anInt_4564 * -424471161 != var8 && var7.anInt_4576 * -1174724853 != var8 && var8 != -1278757251 * var7.anInt_4561 && 1034825445 * var7.anInt_4553 != var8) {
               if(var8 == var7.anInt_4568 * 69768581 || var7.anInt_4563 * 9421325 == var8 || var8 == 1655148515 * var7.anInt_4569 || var8 == 613044169 * var7.anInt_4595) {
                  var6 = 3;
               }
            } else {
               var6 = 2;
            }
         } else {
            var6 = 0;
         }

         if(var6 != var5.anInt_7162 * -1353145527) {
            var9 = Class457.method5552(var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161, (byte)80);
            if(var9 == var5.anInt_7166 * 1828702211 && var5.aBoolean_7167 == var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.aBoolean_1477) {
               var5.anInt_7154 = var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.anInt_1479 * 2102157735;
               var5.anInt_7162 = var6 * -2083406087;
            } else {
               boolean var13 = false;
               if(null != var5.aClass240_Sub41_Sub5_7170) {
                  var5.anInt_7154 -= -723271168;
                  if(1282773537 * var5.anInt_7154 <= 0) {
                     Class217.aClass240_Sub41_Sub4_3757.method531(var5.aClass240_Sub41_Sub5_7170);
                     var5.aClass240_Sub41_Sub5_7170 = null;
                     var13 = true;
                  }
               } else {
                  var13 = true;
               }

               if(var13) {
                  var5.anInt_7154 = 2102157735 * var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.anInt_1479;
                  var5.aClass240_Sub7_Sub1_Sub2_7169 = null;
                  var5.aClass240_Sub2_7168 = null;
                  var5.anInt_7166 = -1786305877 * var9;
                  var5.aBoolean_7167 = var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.aBoolean_1477;
                  var5.anInt_7162 = var6 * -2083406087;
               }
            }
         }

         var12 = var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.method6203().gameCoord;
         var5.anInt_7148 = (int)var12.floatX * 1828374563;
         var5.anInt_7176 = ((int)var12.floatX + (var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.method3257() << 8)) * -1690930069;
         var5.anInt_7149 = (int)var12.floatZ * -694677133;
         var5.anInt_7174 = ((int)var12.floatZ + (var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.method3257() << 8)) * 492108747;
         var5.anInt_7147 = -1550687659 * var5.aClass563_Sub1_Sub4_Sub4_Sub1_7161.plane;
         Class578.method6312(var5, var0, var1, var2, var3, 2140061851);
      }

   }

   public static int method1359(int var0, byte var1) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return 1 + var0;
   }

   static final void method1360(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class371.method4711(var3, var4, var0, (byte)-109);
   }
}
