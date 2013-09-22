
public class Class584 {

   Class286 aClass286_9711;
   float aFloat_9712;
   float aFloat_9713;
   int anInt_9714;
   float aFloat_9715;
   Class177 aClass177_9716;
   int anInt_9717;
   float aFloat_9718;
   int anInt_9719;
   float aFloat_9720;
   float aFloat_9721;
   GameCoord aClass347_9722;


   public void method6332(ByteArrayDataNode var1, Class588 var2, byte var3) {
      int var4 = var1.readShort(-934058485);
      int var5 = var1.method4478((byte)1);
      int var6 = var1.method4478((byte)1);
      int var7 = var1.method4478((byte)1);
      int var8 = var1.readShort(762843952);
      Class494.anInt_9038 = -257448885 * var8;
      this.aClass286_9711 = var2.method6387(var4, var5, var6, var7, 1020767141);
   }

   public Class584(ByteArrayDataNode var1, Class588 var2) {
      this.method6336(var1, var2, (byte)23);
   }

   void method6333(byte var1) {
      this.anInt_9714 = -1212201731;
      this.aClass347_9722 = GameCoord.createCoord(-50.0F, -60.0F, -50.0F);
      this.aFloat_9712 = 1.1523438F;
      this.aFloat_9718 = 0.69921875F;
      this.aFloat_9713 = 1.2F;
      this.anInt_9719 = 1585304040;
      this.anInt_9717 = 0;
      this.aClass177_9716 = Class588.aClass177_9768;
      this.aFloat_9715 = 1.0F;
      this.aFloat_9720 = 0.25F;
      this.aFloat_9721 = 1.0F;
      this.aClass286_9711 = Class631.aClass286_10081;
   }

   void method6334(Class584 var1, byte var2) {
      this.anInt_9714 = 1 * var1.anInt_9714;
      this.aFloat_9712 = var1.aFloat_9712;
      this.aFloat_9718 = var1.aFloat_9718;
      this.aFloat_9713 = var1.aFloat_9713;
      this.aClass347_9722.setPos(var1.aClass347_9722);
      this.anInt_9719 = var1.anInt_9719 * 1;
      this.anInt_9717 = 1 * var1.anInt_9717;
      this.aClass177_9716 = var1.aClass177_9716;
      this.aFloat_9715 = var1.aFloat_9715;
      this.aFloat_9720 = var1.aFloat_9720;
      this.aFloat_9721 = var1.aFloat_9721;
      this.aClass286_9711 = var1.aClass286_9711;
   }

   void method6335(Renderer var1, Class584 var2, Class584 var3, float var4, int var5) {
      this.anInt_9714 = Class104_Sub20.method7394(1256327083 * var2.anInt_9714, 1256327083 * var3.anInt_9714, 255.0F * var4, -557575609) * 1262533379;
      this.aFloat_9718 = var4 * (var3.aFloat_9718 - var2.aFloat_9718) + var2.aFloat_9718;
      this.aFloat_9713 = var4 * (var3.aFloat_9713 - var2.aFloat_9713) + var2.aFloat_9713;
      this.aFloat_9712 = var2.aFloat_9712 + var4 * (var3.aFloat_9712 - var2.aFloat_9712);
      this.aFloat_9721 = var2.aFloat_9721 + var4 * (var3.aFloat_9721 - var2.aFloat_9721);
      this.aFloat_9715 = var4 * (var3.aFloat_9715 - var2.aFloat_9715) + var2.aFloat_9715;
      this.aFloat_9720 = var2.aFloat_9720 + (var3.aFloat_9720 - var2.aFloat_9720) * var4;
      this.anInt_9719 = Class104_Sub20.method7394(var2.anInt_9719 * -226776391, -226776391 * var3.anInt_9719, 255.0F * var4, -291782973) * 918633353;
      this.anInt_9717 = -1510877511 * (int)((float)(978931593 * var2.anInt_9717) + (float)(978931593 * var3.anInt_9717 - 978931593 * var2.anInt_9717) * var4);
      if(var3.aClass177_9716 != var2.aClass177_9716) {
         this.aClass177_9716 = var1.method1985(var2.aClass177_9716, var3.aClass177_9716, var4, this.aClass177_9716);
      }

      if(var3.aClass286_9711 != var2.aClass286_9711) {
         if(var2.aClass286_9711 == null) {
            this.aClass286_9711 = var3.aClass286_9711;
            if(null != this.aClass286_9711) {
               this.aClass286_9711.method3684((int)(255.0F * var4), 0, (byte)27);
            }
         } else {
            this.aClass286_9711 = var2.aClass286_9711;
            if(null != this.aClass286_9711) {
               this.aClass286_9711.method3684((int)(255.0F * var4), 255, (byte)50);
            }
         }
      }

   }

   public void method6336(ByteArrayDataNode var1, Class588 var2, byte var3) {
      int var4 = var1.readByte(207605494);
      if(Class104_Sub21.renderSettings.aClass540_Sub26_7308.method4199(-1898280639) == 1 && Class286.gameRenderer.method1994() > 0) {
         if(0 != (var4 & 1)) {
            this.anInt_9714 = var1.method4480(1260717178) * 1262533379;
         } else {
            this.anInt_9714 = -1212201731;
         }

         if((var4 & 2) != 0) {
            this.aFloat_9712 = (float)var1.readShort(1627689847) / 256.0F;
         } else {
            this.aFloat_9712 = 1.1523438F;
         }

         if((var4 & 4) != 0) {
            this.aFloat_9718 = (float)var1.readShort(-277803848) / 256.0F;
         } else {
            this.aFloat_9718 = 0.69921875F;
         }

         if(0 != (var4 & 8)) {
            this.aFloat_9713 = (float)var1.readShort(2050719433) / 256.0F;
         } else {
            this.aFloat_9713 = 1.2F;
         }
      } else {
         if(0 != (var4 & 1)) {
            var1.method4480(1260717178);
         }

         if((var4 & 2) != 0) {
            var1.readShort(170925157);
         }

         if((var4 & 4) != 0) {
            var1.readShort(2051755712);
         }

         if((var4 & 8) != 0) {
            var1.readShort(-704727386);
         }

         this.anInt_9714 = -1212201731;
         this.aFloat_9713 = 1.2F;
         this.aFloat_9718 = 0.69921875F;
         this.aFloat_9712 = 1.1523438F;
      }

      if((var4 & 16) != 0) {
         this.aClass347_9722 = GameCoord.createCoord((float)var1.method4478((byte)1), (float)var1.method4478((byte)1), (float)var1.method4478((byte)1));
      } else {
         this.aClass347_9722 = GameCoord.createCoord(-50.0F, -60.0F, -50.0F);
      }

      if(0 != (var4 & 32)) {
         this.anInt_9719 = var1.method4480(1260717178) * 918633353;
      } else {
         this.anInt_9719 = 1585304040;
      }

      if(0 != (var4 & 64)) {
         this.anInt_9717 = var1.readShort(1874182331) * -1510877511;
      } else {
         this.anInt_9717 = 0;
      }

      if(0 != (var4 & 128)) {
         int var5 = var1.readShort(1075265300);
         this.aClass177_9716 = var2.method6377(var5, -53434041);
      } else {
         this.aClass177_9716 = Class588.aClass177_9768;
      }

   }

   public void method6337(ByteArrayDataNode var1, int var2) {
      this.aFloat_9715 = (float)(var1.readByte(-759872046) * 8) / 255.0F;
      this.aFloat_9720 = (float)(var1.readByte(324157336) * 8) / 255.0F;
      this.aFloat_9721 = (float)(var1.readByte(1250892370) * 8) / 255.0F;
   }

   public Class286 method6338(int var1) {
      return this.aClass286_9711;
   }

   public int method6339(int var1) {
      return -226776391 * this.anInt_9719;
   }

   boolean method6340(Class584 var1, int var2) {
      return 1256327083 * this.anInt_9714 == var1.anInt_9714 * 1256327083 && this.aFloat_9712 == var1.aFloat_9712 && this.aFloat_9718 == var1.aFloat_9718 && this.aFloat_9713 == var1.aFloat_9713 && this.aFloat_9720 == var1.aFloat_9720 && this.aFloat_9715 == var1.aFloat_9715 && this.aFloat_9721 == var1.aFloat_9721 && this.anInt_9719 * -226776391 == var1.anInt_9719 * -226776391 && var1.anInt_9717 * 978931593 == 978931593 * this.anInt_9717 && var1.aClass177_9716 == this.aClass177_9716 && this.aClass286_9711 == var1.aClass286_9711;
   }

   public Class584() {
      this.method6333((byte)-101);
   }

   static final void method6341(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapPoint var3;
      if(var2 < Class521.myPlayer.anInt_4331 * -74820059 && var2 >= 0) {
         byte var4 = Class521.myPlayer.plane;
         MapPoint var5 = client.aClass296_348.getMapArea();
         int var6 = var5.loadedMapX * 1265321541 + Class521.myPlayer.tilePosArrayX[var2];
         int var7 = var5.loadedMapY * -1996781083 + Class521.myPlayer.tilePosArrayY[var2];
         var3 = new MapPoint(var4, var6, var7);
      } else {
         var3 = Class521.myPlayer.getMapCoord(-1993327796);
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.method6658((byte)89);
   }

   static final void method6342(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class509.anInt_9182 * 1735950531 == 2?1:0;
   }

   public static void method6343(int var0, CacheDataUnpacker var1, int var2, int var3, int var4, boolean var5, Class110 var6, int var7) {
      if(var0 > 0) {
         Class134.anInt_2617 = 642235515;
         ConnectionUpdate.aCacheUnpacker_119 = var1;
         Class134.anInt_2611 = -981507397 * var2;
         Class489.anInt_9003 = -2057939165 * var3;
         Class123.aClass240_Sub41_Sub2_2276 = null;
         Class586.anInt_9739 = var4 * -101527585;
         Class134.aBoolean_2612 = var5;
         Class134.anInt_2620 = Class134.aClass240_Sub41_Sub2_2616.method482(1632504441) / var0 * 639547177;
         if(-31206119 * Class134.anInt_2620 < 1) {
            Class134.anInt_2620 = 639547177;
         }

         Class586.aClass110_9743 = var6;
      } else {
         if(null != var6) {
            var6.method1410('\uff00');
         }

         Class243.method3122(var1, var2, var3, var4, var5, (byte)36);
      }

   }

   static final void method6344(RSInterfaceData var0, short var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1330397373 * var3.anInt_2522;
   }

   static int method6345(byte[] var0, int var1, int var2, int var3) {
      int var4 = -1;

      for(int var5 = var1; var5 < var2; ++var5) {
         var4 = var4 >>> 8 ^ ByteArrayDataNode.anIntArray_6774[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }
}
