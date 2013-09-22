
public class Class563_Sub1_Sub4_Sub6 extends PositionEntity implements Class218 {

   boolean aBoolean_8272 = true;
   boolean aBoolean_8273;
   Class256 aClass256_8274;
   public Class319 aClass319_8275;


   boolean method4721(int var1) {
      return false;
   }

   public Class563_Sub1_Sub4_Sub6(WorldObjects var1, Renderer var2, Class529 var3, Class534 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
      super(var1, var5, var6, var7, var8, var9, var11, var12, var13, var14, 1 == -1248943027 * var4.anInt_9413, Class558.method6167(var15, var16, 1511227546));
      this.aClass319_8275 = new Class319(var2, var3, var4, var15, var16, var6, this, var10, var17, var18);
      this.aBoolean_8273 = 0 != 166485479 * var4.anInt_9380 && !var10;
      this.method4727(1, -1703293038);
   }

   public Class256 method4735(Renderer var1, int var2) {
      return this.aClass256_8274;
   }

   public int getHeight() {
      return this.aClass319_8275.method3939(2076059630);
   }

   Class268 method4719(Renderer var1, int var2) {
      Model var3 = this.aClass319_8275.method3940(var1, 2048, false, true, (short)731);
      if(var3 == null) {
         return null;
      } else {
         Viewport var4 = this.getTransform();
         Class268 var5 = Class104_Sub5.method3286(this.aBoolean_8273, 1948456964);
         this.aClass319_8275.method3941(var1, var3, var4, this.locX, this.locX2, this.locY, this.locY2, true, 1991128452);
         var3.method2069(var4, this.aClass92Array_6938[0], 0);
         if(null != this.aClass319_8275.aClass594_6183) {
            Class167 var6 = this.aClass319_8275.aClass594_6183.method6434();
            var1.method1944(var6);
         }

         this.aBoolean_8272 = var3.method2058() || this.aClass319_8275.aClass594_6183 != null;
         Class348 var7 = this.method6203();
         if(null == this.aClass256_8274) {
            this.aClass256_8274 = Class240_Sub16.method4654((int)var7.gameCoord.floatX, (int)var7.gameCoord.floatY, (int)var7.gameCoord.floatZ, var3, 1161118937);
         } else {
            Class187.method2298(this.aClass256_8274, (int)var7.gameCoord.floatX, (int)var7.gameCoord.floatY, (int)var7.gameCoord.floatZ, var3, (byte)-11);
         }

         return var5;
      }
   }

   public int method4732(int var1) {
      return this.aClass319_8275.method3938((short)13426);
   }

   public void method5334(Class532 var1, int var2) {
      this.aClass319_8275.method3936(var1, (byte)84);
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Model var5 = this.aClass319_8275.method3940(var1, 131072, false, false, (short)731);
      return var5 == null?false:var5.method2050(var2, var3, this.getTransform(), false, 0);
   }

   final boolean method4731(int var1) {
      return false;
   }

   final void method4723(int var1) {
      throw new IllegalStateException();
   }

   public int method2730(int var1) {
      return 1006390171 * this.aClass319_8275.anInt_6177;
   }

   public int method2718(int var1) {
      return -1198382895 * this.aClass319_8275.anInt_6178;
   }

   public void method2726(int var1) {}

   public void method2722(Renderer var1, int var2) {
      this.aClass319_8275.method3945(var1, (byte)-12);
   }

   public int method2723(byte var1) {
      return this.aClass319_8275.anInt_6176 * -1587807461;
   }

   public void method2721(Renderer var1, int var2) {
      this.aClass319_8275.method3946(var1, -2055311399);
   }

   public boolean method2735(byte var1) {
      return this.aClass319_8275.method3942((byte)-117);
   }

   boolean method4722(byte var1) {
      return this.aBoolean_8272;
   }

   final void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   void method4724(Renderer var1) {
      Model var3 = this.aClass319_8275.method3940(var1, 262144, true, true, (short)731);
      if(null != var3) {
         this.aClass319_8275.method3941(var1, var3, this.getTransform(), this.locX, this.locX2, this.locY, this.locY2, false, 1991128452);
      }

   }

   static void method5348(Renderer var0, RSInterface var1, int var2, int var3, int var4) {
      if(null != Class521.myPlayer) {
         var0.method1933();
         Class126 var5 = null;
         Class1024 var6 = null;
         if(5 == var1.index * 1916189739) {
            var5 = var1.method1712(var0, 1272478299);
            if(var5 == null) {
               return;
            }

            var6 = var5.aClass168_2369;
            if(-533669195 * var1.width != var5.anInt_2367 * -1598600089 || var1.height * 1833812087 != 860389213 * var5.anInt_2365) {
               throw new IllegalStateException("");
            }
         }

         var0.method1965(var2, var3, -533669195 * var1.width + var2, var3 + var1.height * 1833812087);
         if(2 != 1049318505 * Class192.anInt_3351 && 5 != 1049318505 * Class192.anInt_3351 && Class620.aClass170_10024 != null) {
            MapPoint var7 = client.aClass296_348.getMapArea();
            int var8;
            int var9;
            int var10;
            int var11;
            if(Class509.anInt_9182 * 1735950531 == 4) {
               var8 = client.anInt_385 * -1782602441;
               var9 = -1112038629 * client.anInt_534;
               var10 = (int)(-client.aFloat_501) & 16383;
               var11 = 4096;
            } else {
               GameCoord var12 = Class521.myPlayer.method6203().gameCoord;
               var8 = (int)var12.floatX;
               var9 = (int)var12.floatZ;
               if(2 == 1735950531 * Class509.anInt_9182) {
                  var10 = (int)(-((double)Class542.aClass43_Sub1_9475.method394(-1962301117) * 2607.5945876176133D)) + -517467801 * client.anInt_378 & 16383;
               } else {
                  var10 = -517467801 * client.anInt_378 + (int)(-client.aFloat_501) & 16383;
               }

               var11 = 4096 - client.anInt_380 * 757700016;
            }

            int var22 = var8 / 128 + 48;
            int var13 = 48 + client.aClass296_348.getMaxY(-819253416) * 4 - var9 / 128;
            if(var6 != null) {
               Class620.aClass170_10024.method2135((float)var2 + (float)(var1.width * -533669195) / 2.0F, (float)(var1.height * 1833812087) / 2.0F + (float)var3, (float)var22, (float)var13, var11, var10 << 2, var6, var2, var3);
            } else {
               Class620.aClass170_10024.method2140((float)var2 + (float)(-533669195 * var1.width) / 2.0F, (float)var3 + (float)(var1.height * 1833812087) / 2.0F, (float)var22, (float)var13, var11, var10 << 2, 1, -1, 1);
            }

            MapElements var14 = client.aClass296_348.getMMElements();

            int y;
            int x;
            int var19;
            int var18;
            int var20;
            for(IndexNode var15 = (IndexNode)Class192.mapIconList.getBaseNode_2((byte)71); null != var15; var15 = (IndexNode)Class192.mapIconList.getNext(-728217228)) {
               x = 523939595 * var15.cacheID;
               y = (var14.positionData[x] >> 14 & 16383) - 1265321541 * var7.loadedMapX;
               var18 = (var14.positionData[x] & 16383) - var7.loadedMapY * -1996781083;
               var19 = y * 4 + 2 - var8 / 128;
               var20 = 4 * var18 + 2 - var9 / 128;
               Class373.method4752(var0, var6, var1, var2, var3, var19, var20, var14.cacheIDs[x], -1866362030);
            }

            for(x = 0; x < -1040838521 * Class192.anInt_3338; ++x) {
               y = 2 + 4 * Class192.anIntArray_3343[x] - var8 / 128;
               var18 = 4 * Class192.anIntArray_3341[x] + 2 - var9 / 128;
               Class534 var23 = client.aClass296_348.method3755(-1118339810).method6015(Class192.anIntArray_3344[x], (byte)1);
               if(var23.anIntArray_9415 != null) {
                  var23 = var23.method6048(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, 1162979012);
                  if(var23 == null || var23.anInt_9395 * 182214421 == -1) {
                     continue;
                  }
               }

               Class373.method4752(var0, var6, var1, var2, var3, y, var18, 182214421 * var23.anInt_9395, -1170051809);
            }

            for(Class240_Sub25 var24 = (Class240_Sub25)client.groundItems.start(); null != var24; var24 = (Class240_Sub25)client.groundItems.next()) {
               y = (int)(4058728944299054175L * var24.id >> 28 & 3L);
               if(y == 1695274141 * Class192.anInt_3345) {
                  var18 = (int)(4058728944299054175L * var24.id & 16383L) - var7.loadedMapX * 1265321541;
                  var19 = (int)(4058728944299054175L * var24.id >> 14 & 16383L) - -1996781083 * var7.loadedMapY;
                  var20 = 2 + var18 * 4 - var8 / 128;
                  int var21 = 2 + 4 * var19 - var9 / 128;
                  FontRenderer_Sub3.putOnMM(var1, var6, var2, var3, var20, var21, Class438.mapDotSprites[0]);
               }
            }

            Class240_Sub4_Sub2.putNPCSOnMM(var0, var8, var9, var1, var6, var2, var3, 1320796941);
            Class240_Sub22_Sub17.putPlayerOnMM(var8, var9, var1, var6, var2, var3, 789123708);
            Class125.putHintMarkersOnMM(var8, var9, var1, var5, var2, var3, 1855601267);
            if(Class509.anInt_9182 * 1735950531 != 4) {
               if(Class192.flagX * -516904107 != -1) {
                  x = -2067616428 * Class192.flagX + 2 - var8 / 128 + (Class521.myPlayer.method3257() - 1) * 2;
                  y = Class192.flagY * -1189363972 + 2 - var9 / 128 + (Class521.myPlayer.method3257() - 1) * 2;
                  FontRenderer_Sub3.putOnMM(var1, var6, var2, var3, x, y, Class609.flagSprites[Class192.flagNotPresent?1:0]);
               }

               if(!Class521.myPlayer.aBoolean_1476) {
                  var0.method1915(var2 + -533669195 * var1.width / 2 - 1, 1833812087 * var1.height / 2 + var3 - 1, 3, 3, -1, (byte)13);
               }
            }
         } else {
            if(null == var6) {
               return;
            }

            var0.method1934(-16777216, var6, var2, var3);
         }

      }
   }

   public static void method5349(boolean var0, byte var1) {
      if(Class52.aClass327_1072 == null) {
         Class126.method1631(141450277);
      }

      if(var0) {
         Class52.aClass327_1072.method4034(1579905561);
      }

   }
}
