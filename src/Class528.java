
public final class Class528 {

   static final int anInt_9296 = 1020;
   int[] anIntArray_9297 = new int[256];
   int anInt_9298;
   int anInt_9299;
   static final int anInt_9300 = 8;
   int[] anIntArray_9301 = new int[256];
   static final int anInt_9302 = 256;
   int anInt_9303;
   int anInt_9304;
   public static Class370 aClass370_9305;


   public final int method6007(byte var1) {
      if(-1667414665 * this.anInt_9299 == 0) {
         this.method6009((short)-12417);
         this.anInt_9299 = -1960556800;
      }

      return this.anIntArray_9297[(this.anInt_9299 -= -578083769) * -1667414665];
   }

   public final int method6008(int var1) {
      if(this.anInt_9299 * -1667414665 == 0) {
         this.method6009((short)-17522);
         this.anInt_9299 = -1960556800;
      }

      return this.anIntArray_9297[this.anInt_9299 * -1667414665 - 1];
   }

   final void method6009(short var1) {
      this.anInt_9303 += (this.anInt_9304 += 1115255185) * 756711579;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.anIntArray_9301[var2];
         if((var2 & 2) == 0) {
            if(0 == (var2 & 1)) {
               this.anInt_9298 = 1466725863 * (this.anInt_9298 * 2091503063 ^ this.anInt_9298 * 2091503063 << 13);
            } else {
               this.anInt_9298 = 1466725863 * (this.anInt_9298 * 2091503063 ^ this.anInt_9298 * 2091503063 >>> 6);
            }
         } else if((var2 & 1) == 0) {
            this.anInt_9298 = 1466725863 * (this.anInt_9298 * 2091503063 ^ this.anInt_9298 * 2091503063 << 2);
         } else {
            this.anInt_9298 = 1466725863 * (this.anInt_9298 * 2091503063 ^ this.anInt_9298 * 2091503063 >>> 16);
         }

         this.anInt_9298 += 1466725863 * this.anIntArray_9301[var2 + 128 & 255];
         int var4;
         this.anIntArray_9301[var2] = var4 = this.anIntArray_9301[(var3 & 1020) >> 2] + this.anInt_9298 * 2091503063 + this.anInt_9303 * 730698467;
         this.anIntArray_9297[var2] = (this.anInt_9303 = (this.anIntArray_9301[(var4 >> 8 & 1020) >> 2] + var3) * -32881973) * 730698467;
      }

   }

   final void method6010(int var1) {
      int var2 = -1640531527;
      int var3 = -1640531527;
      int var4 = -1640531527;
      int var5 = -1640531527;
      int var6 = -1640531527;
      int var7 = -1640531527;
      int var8 = -1640531527;
      int var9 = -1640531527;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
      }

      for(var10 = 0; var10 < 256; var10 += 8) {
         var9 += this.anIntArray_9297[var10];
         var8 += this.anIntArray_9297[1 + var10];
         var7 += this.anIntArray_9297[2 + var10];
         var6 += this.anIntArray_9297[var10 + 3];
         var5 += this.anIntArray_9297[4 + var10];
         var4 += this.anIntArray_9297[5 + var10];
         var3 += this.anIntArray_9297[var10 + 6];
         var2 += this.anIntArray_9297[7 + var10];
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
         this.anIntArray_9301[var10] = var9;
         this.anIntArray_9301[1 + var10] = var8;
         this.anIntArray_9301[var10 + 2] = var7;
         this.anIntArray_9301[var10 + 3] = var6;
         this.anIntArray_9301[var10 + 4] = var5;
         this.anIntArray_9301[var10 + 5] = var4;
         this.anIntArray_9301[6 + var10] = var3;
         this.anIntArray_9301[var10 + 7] = var2;
      }

      for(var10 = 0; var10 < 256; var10 += 8) {
         var9 += this.anIntArray_9301[var10];
         var8 += this.anIntArray_9301[1 + var10];
         var7 += this.anIntArray_9301[2 + var10];
         var6 += this.anIntArray_9301[3 + var10];
         var5 += this.anIntArray_9301[var10 + 4];
         var4 += this.anIntArray_9301[var10 + 5];
         var3 += this.anIntArray_9301[var10 + 6];
         var2 += this.anIntArray_9301[var10 + 7];
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
         this.anIntArray_9301[var10] = var9;
         this.anIntArray_9301[var10 + 1] = var8;
         this.anIntArray_9301[var10 + 2] = var7;
         this.anIntArray_9301[var10 + 3] = var6;
         this.anIntArray_9301[4 + var10] = var5;
         this.anIntArray_9301[var10 + 5] = var4;
         this.anIntArray_9301[6 + var10] = var3;
         this.anIntArray_9301[var10 + 7] = var2;
      }

      this.method6009((short)-16635);
      this.anInt_9299 = -1960556800;
   }

   public Class528(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.anIntArray_9297[var2] = var1[var2];
      }

      this.method6010(-1156103270);
   }

   static final void method6011(int var0) {
      Class133.aClass565_2603.method6223(5, (byte)1);
      PlayerComposite.aClass530_9858.method6027(5, 23137035);
      Class598.aClass71_9878.method815(5, 1268310574);
      client.aClass296_348.method3755(1602108921).method6019(5, 1782571561);
      Class104_Sub6.characterUnpacker.method5673(5, -2119566917);
      Class592.cacheObjectLoader.method5579(5, 673462029);
      Class88.animeUnpacker.method3366(5, 1512105130);
      Class75.aClass558_1422.method6162(5, -2141428840);
      Class603.aClass212_Sub2_9897.method7529(5, -797147652);
      Class104_Sub14.aClass212_Sub1_Sub1_10688.method1134(5, (byte)-42);
      AbstractServerConnection.aClass212_Sub1_Sub2_4038.method1308(5, (short)27342);
      Class522.aClass212_Sub1_Sub2_9259.method1308(5, (short)13584);
      Class124.aClass212_Sub1_Sub2_2349.method1308(5, (short)13528);
      RandomAccessFileNode.aClass255_9018.method3344(5, -1668997719);
      Class126.mapIconUnpacker.method6602(5, -2012069383);
      Class520.aClass445_9243.method5487(5, (byte)0);
      Class240_Sub1.aClass465_6506.method5612(5, (byte)8);
      Class585.aClass236_9731.method3059(5, (byte)-4);
      Class598.aClass44_9877.method410(5, 60318063);
      Class181.aClass450_3106.method5520(5, 1712913633);
      AbstractKeyboardHandler.aClass457_4262.method5549(5, -900570848);
      Class578.damageAnimeLoader.method6648(5, 2063651686);
      Class301.aClass251_6005.method3290(5, (short)-28762);
      Class411.method5075(5, -1827119379);
      Class263.method3509(50, -1290864987);
      Class368.aFontUnpacker_6922.method4136(50, 1443686582);
      Exception_Sub3.method1362(5, 16711935);
      Class220.method2771(5, -157224262);
      client.aClass627_329.method6677(5, -1301387302);
      Class18.aClass627_176.method6677(5, -1874750647);
      Class556.aClass627_9546.method6677(5, -1193160640);
   }

   static final void method6012(boolean var0, int var1) {
      ByteArrayDataNode_Sub1 var2 = client.gameConnectionHandler.serverDataNode;

      while(var2.method293(1463379377 * client.gameConnectionHandler.anInt_3450, 1865413348) >= 15) {
         int var3 = var2.method291(15, 1832157798);
         if(var3 == 32767) {
            break;
         }

         boolean var4 = false;
         Class240_Sub9 var5 = (Class240_Sub9)client.npcNodeList.getNode((long)var3);
         NPC var6;
         if(null == var5) {
            var6 = new NPC(client.aClass296_348.getWorldObjects());
            var6.index = -1106794769 * var3;
            var5 = new Class240_Sub9(var6);
            client.npcNodeList.insert(var5, (long)var3);
            client.aClass240_Sub9Array_271[(client.anInt_334 += -471050069) * 1910301187 - 1] = var5;
            var4 = true;
         }

         var6 = (NPC)var5.anObject_6783;
         client.npcIndices[(client.availableNPCS += 451173459) * 1636714459 - 1] = var3;
         var6.anInt_4290 = client.anInt_339 * -1468030531;
         if(var6.npcComposite != null && var6.npcComposite.method5601(-154379223)) {
            Class338.method4194(var6, 605128712);
         }

         int var7 = var2.method291(3, 1832157798) + 4 << 11 & 16383;
         int var8;
         if(var0) {
            var8 = var2.method291(8, 1832157798);
            if(var8 > 127) {
               var8 -= 256;
            }
         } else {
            var8 = var2.method291(5, 1832157798);
            if(var8 > 15) {
               var8 -= 32;
            }
         }

         int var9 = var2.method291(1, 1832157798);
         if(var9 == 1) {
            client.anIntArray_540[(client.anInt_337 += -1148561355) * -554157539 - 1] = var3;
         }

         int var10 = var2.method291(1, 1832157798);
         int var11;
         if(var0) {
            var11 = var2.method291(8, 1832157798);
            if(var11 > 127) {
               var11 -= 256;
            }
         } else {
            var11 = var2.method291(5, 1832157798);
            if(var11 > 15) {
               var11 -= 32;
            }
         }

         var6.method1151(Class104_Sub6.characterUnpacker.method5670(var2.method291(15, 1832157798), -708715545), -306793916);
         int var12 = var2.method291(2, 1832157798);
         var6.method3256(var6.npcComposite.anInt_8665 * -1792142631, 59220262);
         var6.anInt_4340 = (-1526252727 * var6.npcComposite.anInt_8660 << 3) * 258100611;
         if(var4) {
            var6.turnTo(var7, true, -878578616);
         }

         var6.method1157(var12, var8 + Class521.myPlayer.tilePosArrayX[0], var11 + Class521.myPlayer.tilePosArrayY[0], 1 == var10, var6.method3257(), 1569120749);
         if(var6.npcComposite.method5601(-82928028)) {
            Class34_Sub3.method2775(var6.plane, var6.tilePosArrayX[0], var6.tilePosArrayY[0], 0, (Class534)null, var6, (Player)null, 353263914);
         }
      }

      var2.method292(917040182);
   }

   static final void method6013(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 & 16383;
   }
}
