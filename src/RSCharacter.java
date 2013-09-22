
public abstract class RSCharacter extends PositionEntity implements Class118 {

   public int anInt_4290;
   static final int anInt_4291 = 5;
   public int index;
   int anInt_4293;
   public int anInt_4294;
   int anInt_4295;
   public boolean aBoolean_4296;
   ScreenCharText recentChatMessage;
   public int anInt_4298;
   public int anInt_4299;
   int anInt_4300;
   int newHeadInterface;
   public int anInt_4302;
   public byte[] aByteArray_4303;
   public int anInt_4304;
   byte aByte_4305;
   public int[] damageTypeIDs;
   public int[] damageArray;
   public int[] damageTimeStamps;
   public int[] anIntArray_4309;
   public int[] anIntArray_4310;
   public Class512 aClass512_4311;
   public int anInt_4312;
   public int[] anIntArray_4313;
   public int[] animationQueue;
   public final Class468 aClass468_4315;
   static final int anInt_4316 = 20;
   public int anInt_4317;
   public int anInt_4318;
   public Class322[] aClass322Array_4319;
   public int anInt_4320;
   public int anInt_4321;
   public int anInt_4322;
   public StanceAnimation stance;
   public int anInt_4324;
   public int anInt_4325;
   public int anInt_4326;
   public byte aByte_4327;
   public byte aByte_4328;
   public byte aByte_4329;
   public int anInt_4330;
   public int anInt_4331;
   public final Class507_Sub1_Sub1[] emotesPossible;
   int anInt_4333;
   int anInt_4334;
   public Class6 yRotation;
   public int rotation;
   public Class6 aClass6_4337;
   public Class6 xRotation;
   public Animator animation;
   public int anInt_4340;
   public int[] tilePosArrayX;
   public int[] tilePosArrayY;
   public int[] anIntArray_4343;
   public int anInt_4344;
   public int anInt_4345;
   public int anInt_4346;
   Class594 aClass594_4347;
   boolean aBoolean_4348;
   boolean aBoolean_4349;
   public Model[] aClass165Array_4350;
   public byte aByte_4351;
   public RSInterfaceGroup headInterfaces;
   public int interfaceOpen;
   int anInt_4354;
   public Class169 aClass169_4355;
   public static int anInt_4356;


   RSCharacter(WorldObjects var1, Class212_Sub1 var2) {
      this(var1, 10, var2);
   }

   public boolean method3246(int var1, int var2, byte var3) {
      if(this.anIntArray_4343 == null) {
         if(var2 == -1) {
            return true;
         }

         this.anIntArray_4343 = new int[Class286.aClass592_4822.anIntArray_9802.length];

         for(int var4 = 0; var4 < Class286.aClass592_4822.anIntArray_9802.length; ++var4) {
            this.anIntArray_4343[var4] = -1;
         }
      }

      Class263 var10 = this.method3261((short)10846);
      int var5 = 256;
      if(null != var10.anIntArray_4585 && var10.anIntArray_4585[var1] > 0) {
         var5 = var10.anIntArray_4585[var1];
      }

      int var6;
      int var7;
      if(-1 == var2) {
         if(-1 == this.anIntArray_4343[var1]) {
            return true;
         } else {
            var6 = this.aClass6_4337.getRotation((byte)10);
            var7 = this.anIntArray_4343[var1];
            int var8 = var6 - var7;
            if(var8 >= -var5 && var8 <= var5) {
               this.anIntArray_4343[var1] = -1;

               for(int var9 = 0; var9 < Class286.aClass592_4822.anIntArray_9802.length; ++var9) {
                  if(this.anIntArray_4343[var9] != -1) {
                     return true;
                  }
               }

               this.anIntArray_4343 = null;
               return true;
            } else {
               if((var8 <= 0 || var8 > 8192) && var8 > -8192) {
                  this.anIntArray_4343[var1] = var7 - var5 & 16383;
               } else {
                  this.anIntArray_4343[var1] = var7 + var5 & 16383;
               }

               return false;
            }
         }
      } else {
         if(-1 == this.anIntArray_4343[var1]) {
            this.anIntArray_4343[var1] = this.aClass6_4337.getRotation((byte)56);
         }

         var6 = this.anIntArray_4343[var1];
         var7 = var2 - var6;
         if(var7 >= -var5 && var7 <= var5) {
            this.anIntArray_4343[var1] = var2;
            return true;
         } else {
            if((var7 <= 0 || var7 > 8192) && var7 > -8192) {
               this.anIntArray_4343[var1] = var6 - var5 & 16383;
            } else {
               this.anIntArray_4343[var1] = var5 + var6 & 16383;
            }

            return false;
         }
      }
   }

   public int method4732(int var1) {
      return -32768 == this.anInt_4295 * 1784526389?0:1784526389 * this.anInt_4295;
   }

   boolean method4722(byte var1) {
      return this.aBoolean_4349;
   }

   public void method3249(int var1, int var2) {
      Class263 var3 = this.method3261((short)21999);
      if(1617467667 * var3.anInt_4587 != 0 || 0 != this.anInt_4340 * -231659221) {
         this.aClass6_4337.fixAngle(-1367981311);
         int var4 = var1 - this.aClass6_4337.angle * 208910329 & 16383;
         if(var4 > 8192) {
            this.rotation = 385504537 * (this.aClass6_4337.angle * 208910329 - (16384 - var4));
         } else {
            this.rotation = 385504537 * (var4 + 208910329 * this.aClass6_4337.angle);
         }

      }
   }

   public void turnTo(int var1, boolean var2, int var3) {
      Class263 var4 = this.method3261((short)-525);
      if(var2 || 1617467667 * var4.anInt_4587 != 0 || 0 != -231659221 * this.anInt_4340) {
         this.rotation = 385504537 * (var1 & 16383);
         this.aClass6_4337.setAngle(1788884777 * this.rotation, (byte)0);
      }
   }

   public int method3251(byte var1) {
      Class263 var2 = this.method3261((short)-18245);
      int var3 = 208910329 * this.aClass6_4337.angle;
      boolean var4;
      if(0 != var2.anInt_4587 * 1617467667) {
         var4 = this.aClass6_4337.method32(1788884777 * this.rotation, 1617467667 * var2.anInt_4587, -2128577617 * var2.anInt_4588, -1736742878);
      } else {
         var4 = this.aClass6_4337.method32(this.rotation * 1788884777, -231659221 * this.anInt_4340, this.anInt_4340 * -231659221, -1936557540);
      }

      int var5 = this.aClass6_4337.angle * 208910329 - var3;
      if(0 != var5) {
         this.anInt_4302 += 1312599335;
      } else {
         this.anInt_4302 = 0;
         this.aClass6_4337.setAngle(1788884777 * this.rotation, (byte)0);
      }

      if(var4) {
         if(var2.anInt_4589 * 1090793739 != 0) {
            if(var5 > 0) {
               this.xRotation.method32(var2.anInt_4591 * 1769482829, 1090793739 * var2.anInt_4589, var2.anInt_4590 * -467016023, -1906355117);
            } else {
               this.xRotation.method32(-(1769482829 * var2.anInt_4591), 1090793739 * var2.anInt_4589, var2.anInt_4590 * -467016023, -2011217122);
            }
         }

         if(var2.anInt_4592 * -1625783453 != 0) {
            this.yRotation.method32(-1400271511 * var2.anInt_4594, -1625783453 * var2.anInt_4592, var2.anInt_4572 * 1012602535, -2044652864);
         }
      } else {
         if(0 != var2.anInt_4589 * 1090793739) {
            this.xRotation.method32(0, var2.anInt_4589 * 1090793739, -467016023 * var2.anInt_4590, -1558075470);
         } else {
            this.xRotation.setAngle(0, (byte)0);
         }

         if(0 != -1625783453 * var2.anInt_4592) {
            this.yRotation.method32(0, -1625783453 * var2.anInt_4592, 1012602535 * var2.anInt_4572, -2088582690);
         } else {
            this.yRotation.setAngle(0, (byte)0);
         }
      }

      return var5;
   }

   public void method3252(int[] var1, int[] var2, int var3) {
      if(this.anIntArray_4313 == null && null != var1) {
         this.anIntArray_4313 = new int[Class286.aClass592_4822.anIntArray_9802.length];
      } else if(null == var1) {
         this.anIntArray_4313 = null;
         return;
      }

      int var4;
      for(var4 = 0; var4 < this.anIntArray_4313.length; ++var4) {
         this.anIntArray_4313[var4] = -1;
      }

      for(var4 = 0; var4 < var1.length; ++var4) {
         int var5 = var2[var4];

         for(int var6 = 0; var6 < this.anIntArray_4313.length; var5 >>= 1) {
            if((var5 & 1) != 0) {
               this.anIntArray_4313[var6] = var1[var4];
            }

            ++var6;
         }
      }

   }

   public final void method3253(int var1, int var2) {
      Class234 var3 = Class301.aClass251_6005.method3287(var1, (byte)-14);

      for(Class231_Sub5 var4 = (Class231_Sub5)this.aClass512_4311.method5930((byte)-1); null != var4; var4 = (Class231_Sub5)this.aClass512_4311.method5933(-1556940858)) {
         if(var3 == var4.aClass234_8268) {
            var4.method2931(-2115880383);
            return;
         }
      }

   }

   public final void damage(int damageType, int var2, int var3, int var4, int var5, int var6, int var7) {
      boolean var8 = true;
      boolean var9 = true;

      int index;
      for(index = 0; index < Class571.aClass587_9651.anInt_9762 * 1658638923; ++index) {
         if(this.damageTimeStamps[index] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      index = -1;
      int var11 = -1;
      int var12 = 0;
      if(damageType >= 0) {
         DamageSprite var13 = Class578.damageAnimeLoader.loadSprite(damageType, -6889571);
         var11 = var13.anInt_9933 * -363959783;
         var12 = 1582752667 * var13.duration;
      }

      int damage;
      if(var9) {
         if(var11 == -1) {
            return;
         }

         index = 0;
         damage = 0;
         if(var11 == 0) {
            damage = this.damageTimeStamps[0];
         } else if(var11 == 1) {
            damage = this.damageArray[0];
         }

         for(int var14 = 1; var14 < 1658638923 * Class571.aClass587_9651.anInt_9762; ++var14) {
            if(0 == var11) {
               if(this.damageTimeStamps[var14] < damage) {
                  index = var14;
                  damage = this.damageTimeStamps[var14];
               }
            } else if(var11 == 1 && this.damageArray[var14] < damage) {
               index = var14;
               damage = this.damageArray[var14];
            }
         }

         if(var11 == 1 && damage >= var2) {
            return;
         }
      } else {
         if(var8) {
            this.aByte_4305 = 0;
         }

         for(damage = 0; damage < Class571.aClass587_9651.anInt_9762 * 1658638923; ++damage) {
            byte var16 = this.aByte_4305;
            this.aByte_4305 = (byte)((1 + this.aByte_4305) % (1658638923 * Class571.aClass587_9651.anInt_9762));
            if(this.damageTimeStamps[var16] <= var5) {
               index = var16;
               break;
            }
         }
      }

      if(index >= 0) {
         this.damageTypeIDs[index] = damageType;
         this.damageArray[index] = var2;
         this.anIntArray_4309[index] = var3;
         this.anIntArray_4310[index] = var4;
         this.damageTimeStamps[index] = var6 + var5 + var12;
      }
   }

   public final void method3255(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      Class234 var8 = Class301.aClass251_6005.method3287(var1, (byte)56);
      Class231_Sub5 var9 = null;
      Class231_Sub5 var10 = null;
      int var11 = var8.anInt_4007 * -743467269;
      int var12 = 0;

      Class231_Sub5 var13;
      for(var13 = (Class231_Sub5)this.aClass512_4311.method5930((byte)-1); null != var13; var13 = (Class231_Sub5)this.aClass512_4311.method5933(-1998004515)) {
         ++var12;
         if(var8 == var13.aClass234_8268) {
            var13.method5324(var4 + var2, var5, var6, var3, -1958583865);
            return;
         }

         if(var13.aClass234_8268.anInt_4009 * -1725712789 <= var8.anInt_4009 * -1725712789) {
            var9 = var13;
         }

         if(var13.aClass234_8268.anInt_4007 * -743467269 > var11) {
            var10 = var13;
            var11 = var13.aClass234_8268.anInt_4007 * -743467269;
         }
      }

      if(null != var10 || var12 < Class571.aClass587_9651.anInt_9751 * -786211115) {
         var13 = new Class231_Sub5(var8);
         if(null == var9) {
            this.aClass512_4311.method5927(var13, -187483669);
         } else {
            RandomAccessFileNode.method5764(var13, var9, -810053883);
         }

         var13.method5324(var4 + var2, var5, var6, var3, -790956719);
         if(var12 >= -786211115 * Class571.aClass587_9651.anInt_9751) {
            var10.method2931(-1823011059);
         }

      }
   }

   public void method3256(int var1, int var2) {
      this.anInt_4293 = var1 * 692408099;
   }

   public int method3257() {
      return this.anInt_4293 * -221357941;
   }

   void method3258(Renderer var1, Class263 var2, int var3, int var4, int var5, int var6, byte var7) {
      for(int var8 = 0; var8 < this.aClass322Array_4319.length; ++var8) {
         byte var9 = 0;
         if(var8 == 0) {
            var9 = 2;
         } else if(1 == var8) {
            var9 = 5;
         } else if(2 == var8) {
            var9 = 1;
         } else if(var8 == 3) {
            var9 = 7;
         }

         Class322 var10 = this.aClass322Array_4319[var8];
         if(-1 != -1769281411 * var10.animationID && !var10.anime.method5877((short)31374)) {
            Class567 var11 = Class75.aClass558_1422.method6164(var10.animationID * -1769281411, (byte)-44);
            int var12 = var3;
            if(0 != -1926368725 * var10.anInt_6205) {
               var12 = var3 | 5;
            }

            if(0 != 2138611973 * var10.anInt_6206) {
               var12 |= 2;
            }

            if(var10.anInt_6209 * 1651494511 >= 0) {
               var12 |= 7;
            }

            Model var13 = this.aClass165Array_4350[1 + var8] = var11.method6241(var1, var12, var10.anime, var9, 2017475676);
            if(null != var13) {
               if(var10.anInt_6209 * 1651494511 >= 0 && null != var2.viewportData && var2.viewportData[1651494511 * var10.anInt_6209] != null) {
                  int var14 = 0;
                  int var15 = 0;
                  int var16 = 0;
                  if(var2.viewportData != null && var2.viewportData[1651494511 * var10.anInt_6209] != null) {
                     var14 += var2.viewportData[1651494511 * var10.anInt_6209][0];
                     var15 += var2.viewportData[1651494511 * var10.anInt_6209][1];
                     var16 += var2.viewportData[1651494511 * var10.anInt_6209][2];
                  }

                  if(var2.anIntArrayArray_4583 != null && var2.anIntArrayArray_4583[var10.anInt_6209 * 1651494511] != null) {
                     var14 += var2.anIntArrayArray_4583[1651494511 * var10.anInt_6209][0];
                     var15 += var2.anIntArrayArray_4583[1651494511 * var10.anInt_6209][1];
                     var16 += var2.anIntArrayArray_4583[var10.anInt_6209 * 1651494511][2];
                  }

                  if(0 != var16 || var14 != 0) {
                     int var17 = var6;
                     if(null != this.anIntArray_4343 && this.anIntArray_4343[var10.anInt_6209 * 1651494511] != -1) {
                        var17 = this.anIntArray_4343[1651494511 * var10.anInt_6209];
                     }

                     int var18 = 1871796224 * var10.anInt_6205 + var17 - var6 & 16383;
                     if(0 != var18) {
                        var13.method2017(var18);
                     }

                     int var19 = Class362.cosArray[var18];
                     int var20 = Class362.sinArray[var18];
                     int var21 = var14 * var20 + var19 * var16 >> 14;
                     var16 = var20 * var16 - var14 * var19 >> 14;
                     var14 = var21;
                  }

                  var13.offset(var14, var15, var16);
               } else if(0 != -1926368725 * var10.anInt_6205) {
                  var13.method2017(var10.anInt_6205 * 1871796224);
               }

               if(0 != var10.anInt_6206 * 2138611973) {
                  var13.offset(0, -(var10.anInt_6206 * 2138611973) << 2, 0);
               }
            }
         } else {
            this.aClass165Array_4350[1 + var8] = null;
         }
      }

   }

   boolean isInterfaceOpen(int var1, int var2) {
      if(var1 == this.interfaceOpen * 1732818823) {
         return true;
      } else {
         this.headInterfaces = Class473.loadInterfaceGroup(var1, (int[])null, (RSInterfaceGroup)null, true, 1169918276);
         if(this.headInterfaces == null) {
            return false;
         } else {
            this.interfaceOpen = var1 * -379888073;
            Class620.method6630(this.headInterfaces.interfaceArray, (byte)4);
            return true;
         }
      }
   }

   RSCharacter(WorldObjects var1, int var2, Class212_Sub1 var3) {
      super(var1, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte)0);
      this.index = 1106794769;
      this.anInt_4293 = 692408099;
      this.anInt_4295 = -906919936;
      this.aBoolean_4296 = true;
      this.anInt_4344 = 0;
      this.anInt_4298 = -1095848011;
      this.anInt_4299 = 0;
      this.anInt_4334 = 0;
      this.aByte_4305 = 0;
      this.damageTypeIDs = new int[1658638923 * Class571.aClass587_9651.anInt_9762];
      this.damageArray = new int[Class571.aClass587_9651.anInt_9762 * 1658638923];
      this.damageTimeStamps = new int[Class571.aClass587_9651.anInt_9762 * 1658638923];
      this.anIntArray_4309 = new int[Class571.aClass587_9651.anInt_9762 * 1658638923];
      this.anIntArray_4310 = new int[1658638923 * Class571.aClass587_9651.anInt_9762];
      this.aClass512_4311 = new Class512();
      this.anInt_4312 = 1835832949;
      this.animationQueue = null;
      this.stance = new StanceAnimation(this, false);
      this.animation = new Class507_Sub1(this, false);
      this.anInt_4325 = 364320881;
      this.anInt_4326 = 375944533;
      this.aByte_4329 = 0;
      this.anInt_4290 = 0;
      this.anInt_4302 = 0;
      this.anInt_4340 = 1649246976;
      this.aClass6_4337 = new Class6();
      this.xRotation = new Class6();
      this.yRotation = new Class6();
      this.anInt_4331 = 0;
      this.anInt_4304 = 0;
      this.anInt_4345 = 0;
      this.anInt_4346 = 0;
      this.aBoolean_4348 = false;
      this.aBoolean_4349 = false;
      this.interfaceOpen = 379888073;
      this.newHeadInterface = -1962411561;
      this.aClass169_4355 = new Class317(this);
      this.tilePosArrayX = new int[var2];
      this.tilePosArrayY = new int[var2];
      this.aByteArray_4303 = new byte[var2];
      this.aClass165Array_4350 = new Model[5];
      this.aClass322Array_4319 = new Class322[4];

      for(int var4 = 0; var4 < 4; ++var4) {
         this.aClass322Array_4319[var4] = new Class322(this);
      }

      this.emotesPossible = new Class507_Sub1_Sub1[Class286.aClass592_4822.anIntArray_9802.length];
      this.aClass468_4315 = new Class501(var3);
   }

   void method3260(int var1, int var2, int var3, int var4, int var5, int var6) {
      GameCoord var7 = this.method6203().gameCoord;
      int var8 = this.locX + this.locX2 >> 1;
      int var9 = this.locY2 + this.locY >> 1;
      int var10 = Class362.cosArray[var1];
      int var11 = Class362.sinArray[var1];
      int var12 = -var2 / 2;
      int var13 = -var3 / 2;
      int var14 = var13 * var10 + var11 * var12 >> 14;
      int var15 = var11 * var13 - var10 * var12 >> 14;
      int var16 = Class80.method1057((int)var7.floatX + var14, var15 + (int)var7.floatZ, var8, var9, this.plane, (byte)14);
      int var17 = var2 / 2;
      int var18 = -var3 / 2;
      int var19 = var17 * var11 + var18 * var10 >> 14;
      int var20 = var11 * var18 - var10 * var17 >> 14;
      int var21 = Class80.method1057((int)var7.floatX + var19, (int)var7.floatZ + var20, var8, var9, this.plane, (byte)73);
      int var22 = -var2 / 2;
      int var23 = var3 / 2;
      int var24 = var11 * var22 + var23 * var10 >> 14;
      int var25 = var23 * var11 - var22 * var10 >> 14;
      int var26 = Class80.method1057(var24 + (int)var7.floatX, var25 + (int)var7.floatZ, var8, var9, this.plane, (byte)87);
      int var27 = var2 / 2;
      int var28 = var3 / 2;
      int var29 = var10 * var28 + var11 * var27 >> 14;
      int var30 = var11 * var28 - var27 * var10 >> 14;
      int var31 = Class80.method1057(var29 + (int)var7.floatX, var30 + (int)var7.floatZ, var8, var9, this.plane, (byte)125);
      int var32 = var16 < var21?var16:var21;
      int var33 = var26 < var31?var26:var31;
      int var34 = var21 < var31?var21:var31;
      int var35 = var16 < var26?var16:var26;
      this.anInt_4300 = ((int)(Math.atan2((double)(var32 - var33), (double)var3) * 2607.5945876176133D) & 16383) * -107904407;
      this.anInt_4354 = ((int)(Math.atan2((double)(var35 - var34), (double)var2) * 2607.5945876176133D) & 16383) * 174224847;
      int var36;
      if(0 != this.anInt_4300 * -1302581799 && 0 != var4) {
         var36 = 16384 - var4;
         if(this.anInt_4300 * -1302581799 > 8192) {
            if(-1302581799 * this.anInt_4300 < var36) {
               this.anInt_4300 = -107904407 * var36;
            }
         } else if(this.anInt_4300 * -1302581799 > var4) {
            this.anInt_4300 = -107904407 * var4;
         }
      }

      if(0 != -430673617 * this.anInt_4354 && 0 != var5) {
         var36 = 16384 - var5;
         if(-430673617 * this.anInt_4354 > 8192) {
            if(-430673617 * this.anInt_4354 < var36) {
               this.anInt_4354 = var36 * 174224847;
            }
         } else if(this.anInt_4354 * -430673617 > var5) {
            this.anInt_4354 = var5 * 174224847;
         }
      }

      this.anInt_4333 = (var31 + var16) * -729162099;
      if(var21 + var26 < 608441413 * this.anInt_4333) {
         this.anInt_4333 = (var26 + var21) * -729162099;
      }

      this.anInt_4333 = ((608441413 * this.anInt_4333 >> 1) - (int)var7.floatY) * -729162099;
   }

   public Class263 method3261(short var1) {
      int var2 = this.method3262(-1590807907);
      return var2 == -1?Class255.aClass263_4405:RandomAccessFileNode.aClass255_9018.method3343(var2, 1516291115);
   }

   abstract int method3262(int var1);

   public abstract int method3263(int var1);

   public void method3264(byte var1) {
      if(this.recentChatMessage != null && null != this.recentChatMessage.message) {
         this.recentChatMessage.anInt_6168 -= -476656477;
         if(-1150531829 * this.recentChatMessage.anInt_6168 == 0) {
            this.recentChatMessage.message = null;
         }
      }

   }

   public abstract ScreenCharText getRecentChatMessage(short var1);

   public void showChatMessage(String var1, int var2, int var3, int var4, byte var5) {
      if(this.recentChatMessage == null) {
         this.recentChatMessage = new ScreenCharText();
      }

      this.recentChatMessage.message = var1;
      this.recentChatMessage.anInt_6166 = var2 * 301332399;
      this.recentChatMessage.anInt_6167 = 1479010807 * var3;
      this.recentChatMessage.anInt_6168 = (this.recentChatMessage.anInt_6165 = 1834746919 * var4) * -1739254491;
   }

   public void method3267(int var1, byte var2) {
      if(1920792089 * this.newHeadInterface != this.interfaceOpen * 1732818823) {
         this.method3269(724565860);
      }

      this.newHeadInterface = var1 * 1962411561;
   }

   boolean method3268() {
      return 1920792089 * this.newHeadInterface == -1?false:this.isInterfaceOpen(1920792089 * this.newHeadInterface, 1254420838);
   }

   void method3269(int var1) {
      if(-1 != 1732818823 * this.interfaceOpen) {
         Class620.method6627(this.interfaceOpen * 1732818823, (byte)89);
         this.headInterfaces = null;
         this.interfaceOpen = 379888073;
      }

   }

   public void method3270(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      if(this.method3268()) {
         client.method173(this.headInterfaces, this.headInterfaces.method1435(-11840664), -1, var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   public void method3271(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      if(this.method3268()) {
         Class619.method6623(this.headInterfaces.method1435(-11840664), -1, var2, var3, var4, var5, var6, var7, var1, false, 617556995);
      } else {
         if(var1 != -1) {
            client.aBooleanArray_525[var1] = true;
         } else {
            for(int var9 = 0; var9 < 112; ++var9) {
               client.aBooleanArray_525[var9] = true;
            }
         }

      }
   }

   public void method3272(int var1, int var2, boolean var3, byte var4) {
      if(this.method3268()) {
         Class104_Sub7.method3379(this.headInterfaces.interfaceArray, -1, var1, var2, var3, -603580365);
      }
   }

   public abstract int getIndex(int var1);

   public MapPoint getMapCoord(int var1) {
      GameCoord var2 = this.method6203().gameCoord;
      MapPoint var3 = client.aClass296_348.getMapArea();
      int var4 = 1265321541 * var3.loadedMapX + ((int)var2.floatX >> 9);
      int var5 = ((int)var2.floatZ >> 9) + -1996781083 * var3.loadedMapY;
      return new MapPoint(this.plane, var4, var5);
   }

   void method3275(Renderer var1, Model[] var2, Viewport var3, boolean var4, int var5) {
      if(!var4) {
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = -1;
         int var11 = -1;
         Class86[][] var12 = new Class86[var2.length][];
         Class172[][] var13 = new Class172[var2.length][];

         for(int var14 = 0; var14 < var2.length; ++var14) {
            if(null != var2[var14]) {
               var2[var14].method2052(var3);
               var12[var14] = var2[var14].method2059();
               var13[var14] = var2[var14].method2040();
               if(null != var12[var14]) {
                  var10 = var14;
                  ++var7;
                  var6 += var12[var14].length;
               }

               if(null != var13[var14]) {
                  var11 = var14;
                  ++var9;
                  var8 += var13[var14].length;
               }
            }
         }

         if((this.aClass594_4347 == null || this.aClass594_4347.aBoolean_9817) && (var7 > 0 || var9 > 0)) {
            this.aClass594_4347 = Class594.method6440(-1025618511 * client.timer, true);
         }

         if(null != this.aClass594_4347) {
            Class86[] var18 = null;
            int var16;
            if(var7 == 1) {
               var18 = var12[var10];
            } else {
               var18 = new Class86[var6];
               int var15 = 0;

               for(var16 = 0; var16 < var2.length; ++var16) {
                  if(var12[var16] != null) {
                     System.arraycopy(var12[var16], 0, var18, var15, var12[var16].length);
                     var15 += var12[var16].length;
                  }
               }
            }

            Class172[] var19 = null;
            if(var9 == 1) {
               var19 = var13[var11];
            } else {
               var19 = new Class172[var8];
               var16 = 0;

               for(int var17 = 0; var17 < var2.length; ++var17) {
                  if(var13[var17] != null) {
                     System.arraycopy(var13[var17], 0, var19, var16, var13[var17].length);
                     var16 += var13[var17].length;
                  }
               }
            }

            this.aClass594_4347.method6438(var1, (long)(-1025618511 * client.timer), var18, var19, false);
            this.aBoolean_4348 = true;
         }
      } else if(null != this.aClass594_4347) {
         this.aClass594_4347.method6433((long)(-1025618511 * client.timer));
      }

      if(this.aClass594_4347 != null) {
         this.aClass594_4347.method6441(this.plane, this.locX, this.locX2, this.locY, this.locY2);
      }

   }

   public int getHeight() {
      Class263 var2 = this.method3261((short)-6714);
      int height;
      if(-1 != var2.anInt_4596 * 912730695) {
         height = 912730695 * var2.anInt_4596;
      } else if(-32768 == 1784526389 * this.anInt_4295) {
         height = 200;
      } else {
         height = -(1784526389 * this.anInt_4295);
      }

      Class348 var4 = this.method6203();
      int var5 = (int)var4.gameCoord.floatX >> 9;
      int var6 = (int)var4.gameCoord.floatZ >> 9;
      if(null != this.worldObjects && var5 >= 1 && var6 >= 1 && var5 <= client.aClass296_348.getMaxX((byte)-21) - 1 && var6 <= client.aClass296_348.getMaxY(922594549) - 1) {
         Class638 var7 = this.worldObjects.tiles[this.plane][var5][var6];
         if(null != var7 && null != var7.aClass563_Sub1_Sub1_10138) {
            return height + var7.aClass563_Sub1_Sub1_10138.height;
         }
      }

      return height;
   }

   public final void method3277(int var1, int var2, int var3, int var4, boolean var5, int var6, short var7) {
      Class322 var8 = this.aClass322Array_4319[var6];
      int var9 = -1769281411 * var8.animationID;
      if(var1 != -1 && -1 != var9) {
         Class567 var10;
         if(var9 == var1) {
            var10 = Class75.aClass558_1422.method6164(var1, (byte)-24);
            if(var10.aBoolean_9630 && -1632377741 * var10.animationID != -1) {
               Animation var11 = Class88.animeUnpacker.loadAnimation(var10.animationID * -1632377741);
               int var12 = -84331573 * var11.anInt_10104;
               if(var12 == 0) {
                  return;
               }

               if(var12 == 2) {
                  var8.anime.method5880(2029311066);
                  return;
               }
            }
         } else {
            var10 = Class75.aClass558_1422.method6164(var1, (byte)42);
            Class567 var14 = Class75.aClass558_1422.method6164(var9, (byte)-120);
            if(-1 != -1632377741 * var10.animationID && -1 != -1632377741 * var14.animationID) {
               Animation var16 = Class88.animeUnpacker.loadAnimation(var10.animationID * -1632377741);
               Animation var13 = Class88.animeUnpacker.loadAnimation(var14.animationID * -1632377741);
               if(var16.anInt_10113 * 459293499 < var13.anInt_10113 * 459293499) {
                  return;
               }
            }
         }
      }

      byte var15 = 0;
      if(var1 != -1 && !Class75.aClass558_1422.method6164(var1, (byte)107).aBoolean_9630) {
         var15 = 2;
      }

      if(var1 != -1 && var5) {
         var15 = 1;
      }

      var8.animationID = 1431556309 * var1;
      var8.anInt_6209 = var4 * 1913081999;
      var8.anInt_6206 = (var2 >> 16) * 263455693;
      var8.anInt_6205 = 665926787 * var3;
      var8.anime.animate(-1 != var1?Class75.aClass558_1422.method6164(var1, (byte)13).animationID * -1632377741:-1, var2 & '\uffff', var15, false, (byte)-104);
   }

   void transformModel(Model var1) {
      int var3 = this.xRotation.angle * 208910329;
      int var4 = 208910329 * this.yRotation.angle;
      if(var3 != 0 || var4 != 0) {
         int var5 = var1.method2041() / 2;
         var1.offset(0, -var5, 0);
         var1.rotateX(var3 & 16383);
         var1.rotateY(var4 & 16383);
         var1.offset(0, var5, 0);
      }

   }

   public void finalize() {
      if(null != this.aClass594_4347) {
         this.aClass594_4347.method6431();
      }

   }

   public abstract boolean method3279(short var1);

   public void method2436(int var1) {
      int var2 = (-221357941 * this.anInt_4293 - 1 << 8) + 240;
      GameCoord var3 = this.method6203().gameCoord;
      this.locX = (short)((int)var3.floatX - var2 >> 9);
      this.locY = (short)((int)var3.floatZ - var2 >> 9);
      this.locX2 = (short)((int)var3.floatX + var2 >> 9);
      this.locY2 = (short)(var2 + (int)var3.floatZ >> 9);
   }

   boolean method4721(int var1) {
      return false;
   }

   public final void method3282(int var1) {
      this.anInt_4331 = 0;
      this.anInt_4345 = 0;
   }
}
