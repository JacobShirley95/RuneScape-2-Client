
public class GamePack {

   public static final GamePack stellardawnPack = new GamePack("stellardawn", "Stellar Dawn", 1, Class436.aClass436_8375);
   public final String gameName;
   static final GamePack aClass523_9263 = new GamePack("game3", "Game 3", 2, Class436.aClass436_8380);
   public static final GamePack runescapePack = new GamePack("runescape", "RuneScape", 0, Class436.aClass436_8380);
   static final GamePack aClass523_9265 = new GamePack("game5", "Game 5", 4, Class436.aClass436_8372);
   static final GamePack aClass523_9266 = new GamePack("oldscape", "RuneScape 2007", 5, Class436.aClass436_8380);
   public final String gameID;
   static final GamePack aClass523_9268 = new GamePack("game4", "Game 4", 3, Class436.aClass436_8377);
   public final int anInt_9269;
   public static Class9 aClass9_9270;


   GamePack(String var1, String var2, int var3, Class436 var4) {
      this.gameID = var1;
      this.gameName = var2;
      this.anInt_9269 = var3 * -960834863;
   }

   public static void method5979(float var0, GameCoord var1, GameCoord var2, GameCoord var3, GameCoord var4, GameCoord var5, float var6, float var7, short var8) {
      if(!var2.method4312(var1)) {
         GameCoord var9 = GameCoord.distBetween(var2, var1);
         float var10 = var9.getHyp();
         if(var6 > 0.0F) {
            var4 = GameCoord.method4308(var4);
            var4.method4331(var7 * (var10 / var6));
         }

         if(var4.floatX != Float.POSITIVE_INFINITY && !Float.isNaN(var1.floatX) && var10 <= 5120.0F) {
            GameCoord var11 = GameCoord.method4308(var3);
            var11.method4322();
            GameCoord var12 = GameCoord.method4325(var11, var4);
            GameCoord var13 = GameCoord.method4324(var11, var12);
            var13.method4331(0.5F);
            GameCoord var14 = GameCoord.method4308(var3);
            GameCoord var15 = GameCoord.method4308(var9);
            var15.method4322();
            if(var13.floatX > var15.floatX) {
               if(var9.floatX < 0.0F) {
                  var14.floatX += var4.floatX * var0;
                  if(var14.floatX > 0.0F) {
                     var14.floatX = 0.0F;
                  }
               } else {
                  var14.floatX -= var4.floatX * var0;
                  if(var14.floatX < 0.0F) {
                     var14.floatX = 0.0F;
                  }
               }
            } else if(var11.floatX < var5.floatX) {
               if(var9.floatX < 0.0F) {
                  var14.floatX -= var4.floatX * var0;
                  if(var14.floatX < -var5.floatX) {
                     var14.floatX = -var5.floatX;
                  }
               } else {
                  var14.floatX += var0 * var4.floatX;
                  if(var14.floatX > var5.floatX) {
                     var14.floatX = var5.floatX;
                  }
               }
            }

            if(var13.floatY > var15.floatY) {
               if(var9.floatY < 0.0F) {
                  var14.floatY += var0 * var4.floatY;
                  if(var14.floatY > 0.0F) {
                     var14.floatY = 0.0F;
                  }
               } else {
                  var14.floatY -= var4.floatY * var0;
                  if(var14.floatY < 0.0F) {
                     var14.floatY = 0.0F;
                  }
               }
            } else if(var11.floatY < var5.floatY) {
               if(var9.floatY < 0.0F) {
                  var14.floatY -= var0 * var4.floatY;
                  if(var14.floatY < -var5.floatY) {
                     var14.floatY = -var5.floatY;
                  }
               } else {
                  var14.floatY += var4.floatY * var0;
                  if(var14.floatY > var5.floatY) {
                     var14.floatY = var5.floatY;
                  }
               }
            }

            if(var13.floatZ > var15.floatZ) {
               if(var9.floatZ < 0.0F) {
                  var14.floatZ += var4.floatZ * var0;
                  if(var14.floatZ > 0.0F) {
                     var14.floatZ = 0.0F;
                  }
               } else {
                  var14.floatZ -= var4.floatZ * var0;
                  if(var14.floatZ < 0.0F) {
                     var14.floatZ = 0.0F;
                  }
               }
            } else if(var11.floatZ < var5.floatZ) {
               if(var9.floatZ < 0.0F) {
                  var14.floatZ -= var4.floatZ * var0;
                  if(var14.floatZ < -var5.floatZ) {
                     var14.floatZ = -var5.floatZ;
                  }
               } else {
                  var14.floatZ += var0 * var4.floatZ;
                  if(var14.floatZ > var5.floatZ) {
                     var14.floatZ = var5.floatZ;
                  }
               }
            }

            var3.method4330(var14, 0.8F);
            if(var10 < 10.0F && var3.getHyp() < 10.0F) {
               var1.setPos(var2);
               var3.method4311();
            } else {
               var1.method4314(GameCoord.method4327(var3, var0));
            }

            var11.store();
            var14.store();
            var15.store();
         } else {
            var1.setPos(var2);
            var3.method4311();
         }

      }
   }

   static final void method5980(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= 754826261;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[2 + -831324111 * var0.intTypeIndex];
      int var5 = var0.intTypes[3 + -831324111 * var0.intTypeIndex];
      int var6 = var0.intTypes[var0.intTypeIndex * -831324111 + 4];
      if(var4 == -1) {
         throw new RuntimeException();
      } else {
         Class470 var7 = Class493.aClass466_9034.method5614(var4, (byte)47);
         if(var3 != var7.aChar_8697) {
            throw new RuntimeException();
         } else if(var2 != var7.aChar_8694) {
            throw new RuntimeException();
         } else {
            int[] var8 = var7.method5652(Integer.valueOf(var5), (byte)-101);
            if(var6 >= 0 && null != var8 && var8.length > var6) {
               var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var8[var6];
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   public static Class412[] method5981(int var0) {
      return new Class412[]{Class412.aClass412_7874, Class412.aClass412_7872, Class412.aClass412_7873};
   }

   static boolean method5982(byte var0) {
      return Class419.method5217(Class268.aClass586_4646.aClass619_9736, -289507134);
   }

   static MapOverviewNode method5983(CacheDataUnpacker var0, int var1, int var2, short var3) {
      ByteArrayDataNode var4 = new ByteArrayDataNode(var0.getDataBytes(var1, var2, -551436788));
      MapOverviewNode var5 = new MapOverviewNode(var2, var4.method4485(2008214683), var4.method4485(912927749), var4.method4480(1260717178), var4.method4480(1260717178), var4.readByte(471101826) == 1, var4.readByte(-567541541), var4.readByte(150038976));
      int var6 = var4.readByte(334497659);

      for(int var7 = 0; var7 < var6; ++var7) {
         var5.aNodeList_3523.addNode(new Class240_Sub10(var4.readByte(1236740858), var4.readShort(634744694), var4.readShort(1068325218), var4.readShort(1050195685), var4.readShort(1381076347), var4.readShort(252877715), var4.readShort(-583963791), var4.readShort(-1340316959), var4.readShort(1956410015)), (short)5099);
      }

      var5.method2575(1005877373);
      return var5;
   }

   static final boolean method5984(int[][] var0, int[][] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = var3; var8 <= var5; ++var8) {
         for(int var9 = var4; var9 <= var6; ++var9) {
            if(var2 == var0[var8][var9] && var1[var8][var9] <= 1) {
               return true;
            }
         }
      }

      return false;
   }
}
