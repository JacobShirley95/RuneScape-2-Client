import java.io.File;
import java.io.IOException;

public class Class240_Sub22_Sub17 extends Class240_Sub22 implements Class205 {

   public int[] anIntArray_8433;
   public int[] anIntArray_8434;
   public int anInt_8435 = 0;
   public int anInt_8436 = 0;
   static WorldMapText aClass198_8437;


   void method5452(ByteArrayDataNode var1, int var2, byte var3) {
      if(var2 == 2) {
         this.anInt_8436 = var1.readShort(581171583) * -1345696165;
      } else if(4 == var2) {
         this.anInt_8435 = var1.readByte(-1087458358) * -877297445;
         this.anIntArray_8434 = new int[this.anInt_8435 * -887456941];
         this.anIntArray_8433 = new int[this.anInt_8435 * -887456941];

         for(int var4 = 0; var4 < -887456941 * this.anInt_8435; ++var4) {
            this.anIntArray_8434[var4] = var1.readShort(378487115);
            this.anIntArray_8433[var4] = var1.readShort(104845275);
         }
      }

   }

   void method5453(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(-503445947);
         if(var3 == 0) {
            return;
         }

         this.method5452(var1, var3, (byte)-11);
      }
   }

   static void putPlayerOnMM(int startX, int startY, RSInterface var2, Class1024 var3, int var4, int var5, int var6) {
      int var7 = -688404505 * Class15.availablePlayers;
      int[] var8 = Class15.playersIndices;

      for(int var9 = 0; var9 < var7; ++var9) {
         Player var10 = client.aPlayerArray[var8[var9]];
         if(var10 != null && var10.method1001((byte)56) && !var10.aBoolean_1476 && Class521.myPlayer != var10 && var10.plane == Class521.myPlayer.plane) {
            GameCoord var11 = var10.method6203().gameCoord;
            int x = (int)var11.floatX / 128 - startX / 128;
            int y = (int)var11.floatZ / 128 - startY / 128;
            boolean var14 = false;

            for(int var15 = 0; var15 < client.friendsCount * -1301826725; ++var15) {
               FriendPlayer var16 = client.friendsList[var15];
               if(var10.playerName.equals(var16.aString_51) && 0 != var16.anInt_50 * -761711707) {
                  var14 = true;
                  break;
               }
            }

            boolean var18 = false;

            for(int var17 = 0; var17 < 1282766579 * Class298.anInt_5996; ++var17) {
               if(var10.playerName.equals(ScreenCharText.aClass214Array_6170[var17].aString_3710)) {
                  var18 = true;
                  break;
               }
            }

            boolean var19 = false;
            if(584394699 * Class521.myPlayer.anInt_1482 != 0 && 0 != 584394699 * var10.anInt_1482 && Class521.myPlayer.anInt_1482 * 584394699 == var10.anInt_1482 * 584394699) {
               var19 = true;
            }

            if(var10.aBoolean_1458) {
               FontRenderer_Sub3.putOnMM(var2, var3, var4, var5, x, y, Class438.mapDotSprites[6]);
            } else if(var19) {
               FontRenderer_Sub3.putOnMM(var2, var3, var4, var5, x, y, Class438.mapDotSprites[4]);
            } else if(var10.aBoolean_1486) {
               FontRenderer_Sub3.putOnMM(var2, var3, var4, var5, x, y, Class438.mapDotSprites[7]);
            } else if(var14) { //friend
               FontRenderer_Sub3.putOnMM(var2, var3, var4, var5, x, y, Class438.mapDotSprites[3]);
            } else if(var18) {
               FontRenderer_Sub3.putOnMM(var2, var3, var4, var5, x, y, Class438.mapDotSprites[5]);
            } else {
               FontRenderer_Sub3.putOnMM(var2, var3, var4, var5, x, y, Class438.mapDotSprites[2]);
            }
         }
      }

   }

   public static RandomAccessFileNode getPreferencesFile(String var0, String var1, boolean var2, byte var3) {
      File var4 = new File(Class240_Sub22_Sub1.rootCacheDir, "preferences" + var0 + ".dat");
      if(var4.exists()) {
         try {
            RandomAccessFileNode var11 = new RandomAccessFileNode(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
            ;
         }
      }

      String var5 = "";
      if(Class608.anInt_9942 * 2109879227 == 33) {
         var5 = "_rc";
      } else if(34 == Class608.anInt_9942 * 2109879227) {
         var5 = "_wip";
      }

      File var6 = new File(Class405.userDirectory, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      RandomAccessFileNode var7;
      if(!var2 && var6.exists()) {
         try {
            var7 = new RandomAccessFileNode(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
            ;
         }
      }

      try {
         var7 = new RandomAccessFileNode(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }

   public static void method5456(int var0, int var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(8, (long)var0);
      var2.method597((byte)0);
   }
}
