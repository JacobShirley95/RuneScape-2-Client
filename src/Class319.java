
public class Class319 {

   boolean aBoolean_6173;
   byte aByte_6174;
   Class563_Sub1 aClass563_Sub1_6175;
   int anInt_6176;
   int anInt_6177;
   int anInt_6178;
   boolean aBoolean_6179 = false;
   Model aClass165_6180;
   Class529 aClass529_6181;
   Animator aClass507_6182;
   Class594 aClass594_6183;
   Animator aClass507_6184;
   int anInt_6185 = 0;
   int anInt_6186 = -1963091467;
   boolean aBoolean_6187 = false;
   Class240_Sub22_Sub7 aClass240_Sub22_Sub7_6188;
   boolean aBoolean_6189 = false;
   boolean[] aBooleanArray_6190;
   int anInt_6191;
   Class532 aClass532_6192;


   void method3936(Class532 var1, byte var2) {
      this.aClass532_6192 = var1;
      this.aClass165_6180 = null;
   }

   public void method3937(int var1, int var2, byte var3) {
      this.aClass507_6182 = null;
      if(var2 > 0) {
         this.aClass507_6182 = new Class507_Sub1(this.aClass563_Sub1_6175, false);
         this.aClass507_6182.animate(var1, var2, 1, false, (byte)-84);
      } else {
         this.aBoolean_6189 = true;
         this.method3944(false, var1, 1, 0, 642060534);
      }

   }

   int method3938(short var1) {
      return this.anInt_6185 * 1281929325;
   }

   int method3939(int var1) {
      return -this.method3938((short)18273);
   }

   final Model method3940(Renderer var1, int var2, boolean var3, boolean var4, short var5) {
      Class534 var6 = this.aClass529_6181.method6015(this.anInt_6176 * -1587807461, (byte)1);
      if(null != var6.anIntArray_9415) {
         var6 = var6.method6048(Class240_Sub41_Sub3.aClass23_1024, (Class184)(415041591 * client.anInt_356 == 1?Class95.aClass184_1901:Class240_Sub41_Sub3.aClass23_1024), 1162979012);
      }

      if(null == var6) {
         this.method3945(var1, (byte)77);
         this.anInt_6186 = -1963091467;
         return null;
      } else {
         if(!this.aBoolean_6189 && var6.anInt_9367 * 2043792579 != 1212315043 * this.anInt_6186) {
            this.method3944(true, -1, 0, 0, 1229393524);
            this.aBoolean_6187 = false;
            this.aClass165_6180 = null;
         }

         this.method3943(this.aClass563_Sub1_6175, (byte)-77);
         if(var4) {
            var4 &= this.aBoolean_6173 & !this.aBoolean_6187 & Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4388(1993597583) != 0;
         }

         if(var3 && !var4) {
            this.anInt_6186 = -1944093087 * var6.anInt_9367;
            return null;
         } else {
            GameCoord var7 = this.aClass563_Sub1_6175.method6203().gameCoord;
            WorldObjects var8 = client.aClass296_348.getWorldObjects();
            if(var4) {
               var8.method3415(this.aClass240_Sub22_Sub7_6188, this.aByte_6174, (int)var7.floatX, (int)var7.floatZ, this.aBooleanArray_6190, (byte)-85);
               this.aBoolean_6187 = false;
            }

            Plane var9 = var8.planes[this.aByte_6174];
            Plane var10;
            if(this.aBoolean_6179) {
               var10 = var8.aClass171Array_4486[0];
            } else {
               var10 = this.aByte_6174 < 3?var8.planes[this.aByte_6174 + 1]:null;
            }

            Model var11 = null;
            if(this.aClass507_6184.isAnimating(2108314481)) {
               if(var4) {
                  var2 |= 262144;
               }

               var11 = var6.method6046(var1, var2, this.anInt_6177 * 1006390171 != 11?this.anInt_6177 * 1006390171:10, 11 == this.anInt_6177 * 1006390171?this.anInt_6178 * -1198382895 + 4:this.anInt_6178 * -1198382895, var9, var10, (int)var7.floatX, var9.getHeight((int)var7.floatX, (int)var7.floatZ), (int)var7.floatZ, this.aClass507_6184, this.aClass532_6192, (byte)120);
               if(null != var11) {
                  if(var4) {
                     if(this.aBooleanArray_6190 == null) {
                        this.aBooleanArray_6190 = new boolean[4];
                     }

                     this.aClass240_Sub22_Sub7_6188 = var11.method2054(this.aClass240_Sub22_Sub7_6188);
                     var8.method3436(this.aClass240_Sub22_Sub7_6188, this.aByte_6174, (int)var7.floatX, (int)var7.floatZ, this.aBooleanArray_6190, 901821875);
                     this.aBoolean_6187 = true;
                  }

                  this.anInt_6185 = var11.method2041() * -1241589403;
                  var11.method2038();
               } else {
                  this.aBooleanArray_6190 = null;
                  this.aClass240_Sub22_Sub7_6188 = null;
                  this.anInt_6185 = 0;
               }

               this.aClass165_6180 = null;
            } else if(null != this.aClass165_6180 && (this.aClass165_6180.method2015() & var2) == var2 && 1212315043 * this.anInt_6186 == 2043792579 * var6.anInt_9367) {
               var11 = this.aClass165_6180;
            } else {
               if(null != this.aClass165_6180) {
                  var2 |= this.aClass165_6180.method2015();
               }

               Class477 var12 = var6.method6045(var1, var2, 11 != this.anInt_6177 * 1006390171?this.anInt_6177 * 1006390171:10, this.anInt_6177 * 1006390171 == 11?4 + -1198382895 * this.anInt_6178:this.anInt_6178 * -1198382895, var9, var10, (int)var7.floatX, var9.getHeight((int)var7.floatX, (int)var7.floatZ), (int)var7.floatZ, var4, this.aClass532_6192, -455972723);
               if(null != var12) {
                  this.aClass165_6180 = var11 = (Model)var12.anObject_8743;
                  if(var4) {
                     this.aClass240_Sub22_Sub7_6188 = (Class240_Sub22_Sub7)var12.anObject_8742;
                     this.aBooleanArray_6190 = null;
                     var8.method3436(this.aClass240_Sub22_Sub7_6188, this.aByte_6174, (int)var7.floatX, (int)var7.floatZ, (boolean[])null, 901821875);
                     this.aBoolean_6187 = true;
                  }

                  this.anInt_6185 = var11.method2041() * -1241589403;
                  var11.method2038();
               } else {
                  this.aBooleanArray_6190 = null;
                  this.aClass240_Sub22_Sub7_6188 = null;
                  this.aClass165_6180 = null;
                  this.anInt_6185 = 0;
               }
            }

            this.anInt_6186 = -1944093087 * var6.anInt_9367;
            return var11;
         }
      }
   }

   void method3941(Renderer var1, Model var2, Viewport var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      Class86[] var10 = var2.method2059();
      Class172[] var11 = var2.method2040();
      if((null == this.aClass594_6183 || this.aClass594_6183.aBoolean_9817) && (null != var10 || null != var11)) {
         Class534 var12 = this.aClass529_6181.method6015(this.anInt_6176 * -1587807461, (byte)1);
         if(var12.anIntArray_9415 != null) {
            var12 = var12.method6048(Class240_Sub41_Sub3.aClass23_1024, (Class184)(client.anInt_356 * 415041591 == 1?Class95.aClass184_1901:Class240_Sub41_Sub3.aClass23_1024), 1162979012);
         }

         if(var12 != null) {
            this.aClass594_6183 = Class594.method6440(-1025618511 * client.timer, true);
         }
      }

      if(null != this.aClass594_6183) {
         var2.method2052(var3);
         if(var8) {
            this.aClass594_6183.method6438(var1, (long)(client.timer * -1025618511), var10, var11, false);
         } else {
            this.aClass594_6183.method6433((long)(client.timer * -1025618511));
         }

         this.aClass594_6183.method6441(this.aByte_6174, var4, var5, var6, var7);
      }

   }

   boolean method3942(byte var1) {
      return this.aBoolean_6173;
   }

   void method3943(Class563_Sub1 var1, byte var2) {
      if(null != this.aClass507_6182 && this.aClass507_6182.isAnimating(1306374802)) {
         this.aClass507_6182.method5883(-1025618511 * client.timer - this.anInt_6191 * 999152839, -981992437);
         if(!this.aClass507_6182.method5877((short)16011)) {
            this.aClass507_6184 = this.aClass507_6182;
            this.aBoolean_6189 = true;
            this.anInt_6191 = client.timer * -1409951289;
            return;
         }
      }

      if(this.aClass507_6184.isAnimating(1448821595)) {
         if(this.aClass507_6184.method5883(client.timer * -1025618511 - this.anInt_6191 * 999152839, 587987490)) {
            if(Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4388(-969750720) == 2) {
               this.aBoolean_6187 = false;
            }

            if(this.aClass507_6184.method5887(-1710912483)) {
               this.aClass507_6184.animate(-1, 1593151072);
               this.aBoolean_6189 = false;
               this.method3944(false, -1, 0, 0, 1553018911);
            }
         }
      } else {
         this.method3944(false, -1, 0, 0, -1008243784);
      }

      this.anInt_6191 = client.timer * -1409951289;
   }

   void method3944(boolean var1, int var2, int var3, int var4, int var5) {
      int var6 = var2;
      boolean var7 = false;
      if(-1 == var2) {
         Class534 var8 = this.aClass529_6181.method6015(-1587807461 * this.anInt_6176, (byte)1);
         Class534 var9 = var8;
         if(null != var8.anIntArray_9415) {
            var8 = var8.method6048(Class240_Sub41_Sub3.aClass23_1024, (Class184)(1 == client.anInt_356 * 415041591?Class95.aClass184_1901:Class240_Sub41_Sub3.aClass23_1024), 1162979012);
         }

         if(null == var8) {
            return;
         }

         if(var9 == var8) {
            var9 = null;
         }

         if(var8.method6053((short)16517)) {
            if(!var8.aBoolean_9426 || Class104_Sub21.renderSettings.aClass540_Sub10_7292.method1653(-594341511) == 1) {
               if(var1 && this.aClass507_6184.isAnimating(1979466837) && var8.method6052(this.aClass507_6184.getAnimationID(-1753946490), (short)1217)) {
                  return;
               }

               if(2043792579 * var8.anInt_9367 != this.anInt_6186 * 1212315043) {
                  var7 = var8.aBoolean_9427;
               }

               var6 = var8.method6050(742325090);
               if(var8.method6049(68627887)) {
                  var3 = 0;
               } else {
                  var3 = 1;
               }
            }
         } else if(var9 != null && var9.method6053((short)18914) && (!var9.aBoolean_9426 || Class104_Sub21.renderSettings.aClass540_Sub10_7292.method1653(-594341511) == 1)) {
            if(var1 && this.aClass507_6184.isAnimating(1146279798) && var9.method6052(this.aClass507_6184.getAnimationID(-67133563), (short)17377)) {
               return;
            }

            if(2043792579 * var8.anInt_9367 != 1212315043 * this.anInt_6186) {
               var7 = var9.aBoolean_9427;
            }

            var6 = var9.method6050(1463402236);
            if(var9.method6049(1616787397)) {
               var3 = 0;
            } else {
               var3 = 1;
            }
         }
      }

      if(-1 == var6) {
         this.aClass507_6184.method5875(-1, false, (short)700);
      } else {
         this.aClass507_6184.animate(var6, var4, var3, var7, (byte)-125);
         this.anInt_6191 = -1409951289 * client.timer;
         this.aBoolean_6187 = false;
         this.aClass165_6180 = null;
      }
   }

   Class319(Renderer var1, Class529 var2, Class534 var3, int var4, int var5, int var6, Class563_Sub1 var7, boolean var8, int var9, int var10) {
      this.aClass529_6181 = var2;
      this.anInt_6176 = var3.anInt_9367 * 2025138041;
      this.anInt_6177 = var4 * -593354093;
      this.anInt_6178 = var5 * 1304049713;
      this.aClass563_Sub1_6175 = var7;
      this.aBoolean_6189 = -1 != var9;
      this.aByte_6174 = (byte)var6;
      this.aBoolean_6179 = var8;
      this.aBoolean_6173 = var1.method1964() && var3.aBoolean_9429 && !this.aBoolean_6179;
      this.aClass507_6184 = new Class507_Sub1(var7, false);
      this.method3944(false, var9, 1, this.aBoolean_6189?var10:0, 678955978);
   }

   void method3945(Renderer var1, byte var2) {
      if(null != this.aClass240_Sub22_Sub7_6188) {
         GameCoord var3 = this.aClass563_Sub1_6175.method6203().gameCoord;
         client.aClass296_348.getWorldObjects().method3415(this.aClass240_Sub22_Sub7_6188, this.aByte_6174, (int)var3.floatX, (int)var3.floatZ, this.aBooleanArray_6190, (byte)-30);
         this.aBooleanArray_6190 = null;
         this.aClass240_Sub22_Sub7_6188 = null;
      }

   }

   void method3946(Renderer var1, int var2) {
      this.method3940(var1, 262144, true, true, (short)731);
   }

   static final void method3947(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class127.method1634(var3, var4, var0, -1386845000);
   }

   static final void method3948(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.options = null;
   }

   static final void method3949(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub22_7310, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1?2:0, 265841741);
      client.aClass296_348.method3789((byte)43);
      Class83.method1089(-1703699834);
      client.aBoolean_568 = false;
   }

   static final void method3950(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub31_7321.method4379(-831324111) == 1?1:0;
   }

   static final void method3951(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      var0.intTypeIndex -= -1416056414;
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      RSFont var5 = Class410.method5063(Class5.aCacheUnpacker_31, var4, 0, -595149059);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var5.method5560(var2, var3, Class481.nameIconsSprites, 475708878);
   }

   static boolean method3952(Class617 var0, AbstractMouseNode var1, int var2) {
      return var0 != null && var0.method6609(var1, client.aClass233Array_322, client.anInt_321 * 572469979, Class223.captureKeyboardList, 2113881923);
   }

   public static void method3953(AnimationUnpacker var0, int var1) {
      Class178.animationUnpacker = var0;
   }

   public static Class533 method3954(int var0) {
      return null == Class479.aClass533_8756?Class533.aClass533_9345:Class479.aClass533_8756;
   }

   static final void method3955(RSInterface var0, RSInterfaceData var1, int var2) {
      byte var3 = 10;
      int var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      Class370.method4695(var0, var3, var4, var1, -192529713);
   }

   static final void method3956(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      if(Class521.myPlayer.composite != null) {
         Class521.myPlayer.composite.method6449(var2, var3, (byte)71);
      }
   }

   static final void method3957(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      Class598.method6476(8, var2 << 16 | var3, var4, "", -1898494081);
   }

   static void method3958(Class231_Sub4 var0, byte var1) {
      var0.aClass563_Sub1_Sub4_Sub4_8093 = null;
      if(1504713657 * Class231_Sub4.anInt_8089 < 20) {
         Class231_Sub4.aClass512_8090.method5931(var0, 1862707010);
         Class231_Sub4.anInt_8089 += -1285326199;
      }

   }
}
