
public class Class281 {

   static final int anInt_4765 = 2;
   static final int anInt_4766 = 2;
   public static final int anInt_4767 = 4;
   public byte[][][] aByteArrayArrayArray_4768;
   public static final int anInt_4769 = 8;
   static final int anInt_4770 = 16;
   public static final int anInt_4771 = 2;


   public void method3643(byte var1) {
      for(int var2 = 0; var2 < this.aByteArrayArrayArray_4768.length; ++var2) {
         for(int var3 = 0; var3 < this.aByteArrayArrayArray_4768[0].length; ++var3) {
            for(int var4 = 0; var4 < this.aByteArrayArrayArray_4768[0][0].length; ++var4) {
               this.aByteArrayArrayArray_4768[var2][var3][var4] = 0;
            }
         }
      }

   }

   int method3644(int var1, int var2, int var3, int var4) {
      return (this.aByteArrayArrayArray_4768[var1][var2][var3] & 8) != 0?0:(var1 > 0 && 0 != (this.aByteArrayArrayArray_4768[1][var2][var3] & 2)?var1 - 1:var1);
   }

   public boolean method3645(int var1, int var2, int var3, int var4, byte var5) {
      return (this.aByteArrayArrayArray_4768[0][var3][var4] & 2) != 0?true:((this.aByteArrayArrayArray_4768[var2][var3][var4] & 16) != 0?false:this.method3644(var2, var3, var4, 2111022316) == var1);
   }

   public Class281(int var1, int var2, int var3) {
      this.aByteArrayArrayArray_4768 = new byte[var1][var2][var3];
   }

   public boolean method3646(int var1, int var2, byte var3) {
      return var1 >= 0 && var2 >= 0 && var1 < this.aByteArrayArrayArray_4768[1].length && var2 < this.aByteArrayArrayArray_4768[1][var1].length?0 != (this.aByteArrayArrayArray_4768[1][var1][var2] & 2):false;
   }

   public boolean method3647(int var1, int var2, int var3) {
      return var1 >= 0 && var2 >= 0 && var1 < this.aByteArrayArrayArray_4768[3].length && var2 < this.aByteArrayArrayArray_4768[3][var1].length?(this.aByteArrayArrayArray_4768[3][var1][var2] & 2) != 0:false;
   }

   static final void method3648(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class447.method5494(var3, var4, var0, -1339637204);
   }

   static final void method3649(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[863838783 * var0.stringDataIndex];
      String var3 = (String)var0.stringData[1 + var0.stringDataIndex * 863838783];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2 + var3;
   }

   static final void method3650(RSInterfaceData var0, byte var1) {
      Class462.anInt_8604 = 0;
   }

   static final void method3651(RSInterfaceData var0, short var1) {
      var0.intTypeIndex -= 46798054;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      if(var2 >= 2) {
         throw new RuntimeException();
      } else {
         client.anInt_400 = var2 * -1150192039;
         int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
         if(var3 + 1 >= client.anIntArrayArrayArray_399[-525438487 * client.anInt_400].length >> 1) {
            throw new RuntimeException();
         } else {
            client.anInt_392 = var3 * -174656261;
            client.anInt_474 = 0;
            client.anInt_405 = var0.intTypes[var0.intTypeIndex * -831324111 + 2] * -647432935;
            client.anInt_406 = var0.intTypes[-831324111 * var0.intTypeIndex + 3] * -1596493993;
            int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 4];
            if(var4 >= 2) {
               throw new RuntimeException();
            } else {
               client.anInt_408 = -1040489835 * var4;
               int var5 = var0.intTypes[5 + -831324111 * var0.intTypeIndex];
               if(1 + var5 >= client.anIntArrayArrayArray_399[1026644157 * client.anInt_408].length >> 1) {
                  throw new RuntimeException();
               } else {
                  client.anInt_403 = var5 * 1406464059;
                  Class509.anInt_9182 = -597020693;
                  Class102.anInt_1968 = -1061791373;
                  Class571.anInt_9652 = -1694464327;
               }
            }
         }
      }
   }

   static void method3652(ByteArrayDataNode_Sub1 var0, int var1, byte var2) {
      MapPoint var3 = client.aClass296_348.getMapArea();
      boolean var4 = var0.method291(1, 1832157798) == 1;
      if(var4) {
         Class15.anIntArray_132[(Class15.anInt_131 += -1309255717) * 1796066387 - 1] = var1;
      }

      int var5 = var0.method291(2, 1832157798);
      Player var6 = client.aPlayerArray[var1];
      if(var5 == 0) {
         if(var4) {
            var6.aBoolean_1481 = false;
         } else if(client.anInt_438 * -719726693 == var1) {
            throw new RuntimeException();
         } else {
            Class21 var14 = Class15.aClass21Array_130[var1] = new Class21();
            var14.anInt_194 = ((var6.plane << 28) + (var3.loadedMapX * 1265321541 + var6.tilePosArrayX[0] >> 6 << 14) + (var6.tilePosArrayY[0] + -1996781083 * var3.loadedMapY >> 6)) * -1789120471;
            if(var6.anInt_1480 * 1917456969 != -1) {
               var14.rotation = var6.anInt_1480 * -618409239;
            } else {
               var14.rotation = var6.aClass6_4337.getRotation((byte)37) * 1704704929;
            }

            var14.anInt_192 = var6.anInt_4312 * -1008955793;
            var14.aBoolean_195 = var6.aBoolean_1458;
            var14.aBoolean_196 = var6.aBoolean_1486;
            if(-790407235 * var6.anInt_1478 > 0) {
               Class377.method4813(var6, (byte)48);
            }

            client.aPlayerArray[var1] = null;
            if(var0.method291(1, 1832157798) != 0) {
               Class533.method6040(var0, var1, (short)4096);
            }

         }
      } else {
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         if(var5 == 1) {
            var7 = var0.method291(3, 1832157798);
            var8 = var0.method291(1, 1832157798);
            var9 = var6.tilePosArrayX[0];
            var10 = var6.tilePosArrayY[0];
            if(1 == var8) {
               var11 = var0.method291(2, 1832157798);
               switch(var11) {
               case 0:
                  var6.method998(var9, var10 + 1, Class15.aByteArray_124[var1], (byte)34);
                  break;
               case 1:
                  var6.method998(var9 - 1, var10, Class15.aByteArray_124[var1], (byte)30);
                  break;
               case 2:
                  var6.method998(var9 + 1, var10, Class15.aByteArray_124[var1], (byte)51);
                  break;
               case 3:
                  var6.method998(var9, var10 - 1, Class15.aByteArray_124[var1], (byte)-67);
               }
            }

            if(0 == var7) {
               --var9;
               --var10;
            } else if(var7 == 1) {
               --var10;
            } else if(2 == var7) {
               ++var9;
               --var10;
            } else if(3 == var7) {
               --var9;
            } else if(var7 == 4) {
               ++var9;
            } else if(var7 == 5) {
               --var9;
               ++var10;
            } else if(var7 == 6) {
               ++var10;
            } else if(var7 == 7) {
               ++var9;
               ++var10;
            }

            if(var4) {
               var6.anInt_1483 = 1990809503 * var9;
               var6.anInt_1472 = 1513280259 * var10;
               var6.aBoolean_1481 = true;
            } else {
               var6.method998(var9, var10, Class15.aByteArray_124[var1], (byte)83);
            }

         } else if(2 == var5) {
            var7 = var0.method291(4, 1832157798);
            var8 = var6.tilePosArrayX[0];
            var9 = var6.tilePosArrayY[0];
            if(0 == var7) {
               var8 -= 2;
               var9 -= 2;
            } else if(var7 == 1) {
               --var8;
               var9 -= 2;
            } else if(var7 == 2) {
               var9 -= 2;
            } else if(3 == var7) {
               ++var8;
               var9 -= 2;
            } else if(var7 == 4) {
               var8 += 2;
               var9 -= 2;
            } else if(5 == var7) {
               var8 -= 2;
               --var9;
            } else if(var7 == 6) {
               var8 += 2;
               --var9;
            } else if(7 == var7) {
               var8 -= 2;
            } else if(8 == var7) {
               var8 += 2;
            } else if(var7 == 9) {
               var8 -= 2;
               ++var9;
            } else if(var7 == 10) {
               var8 += 2;
               ++var9;
            } else if(11 == var7) {
               var8 -= 2;
               var9 += 2;
            } else if(12 == var7) {
               --var8;
               var9 += 2;
            } else if(var7 == 13) {
               var9 += 2;
            } else if(14 == var7) {
               ++var8;
               var9 += 2;
            } else if(15 == var7) {
               var8 += 2;
               var9 += 2;
            }

            if(var4) {
               var6.anInt_1483 = var8 * 1990809503;
               var6.anInt_1472 = 1513280259 * var9;
               var6.aBoolean_1481 = true;
            } else {
               var6.method998(var8, var9, Class15.aByteArray_124[var1], (byte)-10);
            }

         } else {
            var7 = var0.method291(1, 1832157798);
            int var12;
            int var13;
            if(var7 == 0) {
               var8 = var0.method291(12, 1832157798);
               var9 = var8 >> 10;
               var10 = var8 >> 5 & 31;
               if(var10 > 15) {
                  var10 -= 32;
               }

               var11 = var8 & 31;
               if(var11 > 15) {
                  var11 -= 32;
               }

               var12 = var10 + var6.tilePosArrayX[0];
               var13 = var11 + var6.tilePosArrayY[0];
               if(var4) {
                  var6.anInt_1483 = 1990809503 * var12;
                  var6.anInt_1472 = var13 * 1513280259;
                  var6.aBoolean_1481 = true;
               } else {
                  var6.method998(var12, var13, Class15.aByteArray_124[var1], (byte)-11);
               }

               var6.plane = var6.aByte_6942 = (byte)(var9 + var6.plane & 3);
               if(client.aClass296_348.method3753().method3646(var12, var13, (byte)0)) {
                  ++var6.aByte_6942;
               }

               if(var1 == client.anInt_438 * -719726693 && var6.plane != CacheFileID.anInt_2036 * -763239015) {
                  CacheFileID.anInt_2036 = var6.plane * 1640210089;
               }

            } else {
               var8 = var0.method291(30, 1832157798);
               var9 = var8 >> 28;
               var10 = var8 >> 14 & 16383;
               var11 = var8 & 16383;
               var12 = (1265321541 * var3.loadedMapX + var6.tilePosArrayX[0] + var10 & 16383) - 1265321541 * var3.loadedMapX;
               var13 = (var11 + var6.tilePosArrayY[0] + var3.loadedMapY * -1996781083 & 16383) - var3.loadedMapY * -1996781083;
               if(var4) {
                  var6.anInt_1483 = 1990809503 * var12;
                  var6.anInt_1472 = 1513280259 * var13;
                  var6.aBoolean_1481 = true;
               } else {
                  var6.method998(var12, var13, Class15.aByteArray_124[var1], (byte)17);
               }

               var6.plane = var6.aByte_6942 = (byte)(var9 + var6.plane & 3);
               if(client.aClass296_348.method3753().method3646(var12, var13, (byte)0)) {
                  ++var6.aByte_6942;
               }

               if(var1 == client.anInt_438 * -719726693) {
                  CacheFileID.anInt_2036 = var6.plane * 1640210089;
               }

            }
         }
      }
   }

   public static void method3653(Animation var0, int var1, Class563_Sub1 var2, int var3) {
      if(Class217.anInt_3759 * 1967345345 < 50) {
         if(null != var0 && null != var0.anIntArrayArray_10111 && var1 < var0.anIntArrayArray_10111.length && null != var0.anIntArrayArray_10111[var1]) {
            if(Class521.myPlayer.plane == var2.plane) {
               int var4 = var0.anIntArrayArray_10111[var1][0];
               int var5 = var4 >> 8;
               int var6 = var4 >> 5 & 7;
               int var7 = var4 & 31;
               int var8;
               if(var0.anIntArrayArray_10111[var1].length > 1) {
                  var8 = (int)(Math.random() * (double)var0.anIntArrayArray_10111[var1].length);
                  if(var8 > 0) {
                     var5 = var0.anIntArrayArray_10111[var1][var8];
                  }
               }

               var8 = 256;
               if(var0.anIntArray_10124 != null && var0.anIntArray_10125 != null) {
                  var8 = (int)(Math.random() * (double)(var0.anIntArray_10125[var1] - var0.anIntArray_10124[var1])) + var0.anIntArray_10124[var1];
               }

               int var9 = null == var0.anIntArray_10122?255:var0.anIntArray_10122[var1];
               if(var7 == 0) {
                  if(var2 == Class521.myPlayer) {
                     if(var0.aBoolean_10114) {
                        Class271.method3556(var5, var6, 0, var9, false, var8, -708028207);
                     } else {
                        Class374.method4755(var5, var6, 0, var9, var8, -952603512);
                     }
                  }

               } else {
                  if(var2 == Class521.myPlayer) {
                     if(Class104_Sub21.renderSettings.aClass540_Sub14_7320.method1701(-1996288052) == 0) {
                        return;
                     }
                  } else if(Class104_Sub21.renderSettings.aClass540_Sub14_7324.method1701(-1345324392) == 0) {
                     return;
                  }

                  if(-1758105989 * var0.anInt_10127 != -1) {
                     int index = 0;
                     if(var2 instanceof RSCharacter) {
                        index = ((RSCharacter)var2).getIndex(-831324111);
                     } else if(var2 instanceof Class563_Sub1_Sub4_Sub2) {
                        index = ((Class563_Sub1_Sub4_Sub2)var2).method2238((byte)-50);
                     } else if(var2 instanceof Class563_Sub1_Sub4_Sub3) {
                        index = ((Class563_Sub1_Sub4_Sub3)var2).method2320(610489601);
                     }

                     if(0 != index && index != Class521.myPlayer.getIndex(-831324111) && client.anInt_288 * -1950055551 != index) {
                        var9 = var9 * var0.anInt_10127 * -1758105989 / 100;
                        if(var9 < 0) {
                           var9 = 0;
                        } else if(var9 > 255) {
                           var9 = 255;
                        }
                     }
                  }

                  GameCoord var14 = var2.method6203().gameCoord;
                  int var11 = (int)var14.floatX - 256 >> 9;
                  int var12 = (int)var14.floatZ - 256 >> 9;
                  int var13 = Class521.myPlayer == var2?0:var7 + (var12 << 8) + (var11 << 16) + (var2.plane << 24);
                  Class217.aClass225Array_3760[(Class217.anInt_3759 += 1198145857) * 1967345345 - 1] = new Class225((byte)2, var5, var6, 0, var9, var13, var8, var2);
               }
            }
         }
      }
   }

   public static void method3654(int var0, int var1, byte var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(20, (long)var1 << 32 | (long)var0);
      var3.method597((byte)0);
   }
}
