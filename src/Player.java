
public class Player extends RSCharacter {

   public boolean aBoolean_1458 = false;
   public String playerName;
   String aString_1460;
   public int anInt_1461 = 1953428285;
   public byte aByte_1462 = 0;
   public PlayerComposite composite;
   public int anInt_1464 = 0;
   public int currentPrayer = 1661538615;
   public int combatLevel = 0;
   public String aString_1467;
   public int anInt_1468 = -1310922515;
   public int skillLevel = 0;
   public int pkIconIndex = 574098439;
   public boolean aBoolean_1471 = false;
   public int anInt_1472;
   public int anInt_1473 = 1217479859;
   public int anInt_1474 = 767238437;
   public int anInt_1475 = 661644309;
   public boolean aBoolean_1476 = false;
   public boolean aBoolean_1477 = false;
   public int anInt_1478 = 0;
   public int anInt_1479 = -789215799;
   public int anInt_1480 = -1607630841;
   public boolean aBoolean_1481 = false;
   public int anInt_1482 = 0;
   public int anInt_1483;
   int anInt_1484;
   String aString_1485;
   public boolean aBoolean_1486 = false;


   public void method990(ByteArrayDataNode var1, byte var2, int var3) {
      this.aByte_1462 = var2;
      int var4 = -1;
      this.anInt_1482 = 0;
      int[] var5 = new int[Class286.aClass592_4822.anIntArray_9802.length];
      Class459[] var6 = new Class459[Class286.aClass592_4822.anIntArray_9802.length];
      ObjectDescriptor[] var7 = new ObjectDescriptor[Class286.aClass592_4822.anIntArray_9802.length];

      int var8;
      int var9;
      int var10;
      int var11;
      for(var8 = 0; var8 < Class286.aClass592_4822.anIntArray_9802.length; ++var8) {
         if(1 != Class286.aClass592_4822.anIntArray_9802[var8]) {
            var9 = var1.readByte(1972901343);
            if(var9 == 0) {
               var5[var8] = 0;
            } else {
               var10 = var1.readByte(790022094);
               var11 = var10 + (var9 << 8);
               if(0 == var8 && '\uffff' == var11) {
                  var4 = var1.method4493(-157074556);
                  this.anInt_1482 = var1.readByte(1401236538) * 1800160739;
                  break;
               }

               if(var11 >= 16384) {
                  var11 -= 16384;
                  var5[var8] = var11 | 1073741824;
                  var7[var8] = Class592.cacheObjectLoader.getObjectDescriptor(var11);
                  int var12 = -1411659881 * var7[var8].anInt_8505;
                  if(0 != var12) {
                     this.anInt_1482 = var12 * 1800160739;
                  }
               } else {
                  var5[var8] = var11 - 256 | Integer.MIN_VALUE;
               }
            }
         }
      }

      if(var4 == -1) {
         var8 = var1.readShort(1117563270);
         var9 = 0;

         for(var10 = 0; var10 < Class286.aClass592_4822.anIntArray_9802.length; ++var10) {
            if(0 == Class286.aClass592_4822.anIntArray_9802[var10]) {
               if((var8 & 1 << var9) != 0) {
                  var6[var10] = Class36.method302(var7[var10], var1, -1873511476);
               }

               ++var9;
            }
         }
      }

      int[] var13 = new int[10];

      for(var9 = 0; var9 < 10; ++var9) {
         var10 = var1.readByte(1274933190);
         if(PlayerComposite.aShortArrayArrayArray_9854.length < 1 || var10 < 0 || var10 >= PlayerComposite.aShortArrayArrayArray_9854[var9][0].length) {
            var10 = 0;
         }

         var13[var9] = var10;
      }

      this.anInt_1484 = var1.readShort(-510457802) * 1176616653;
      if(this.composite == null) {
         this.composite = new PlayerComposite();
      }

      var9 = 2037569583 * this.composite.anInt_9845;
      int[] var16 = this.composite.anIntArray_9848;
      this.composite.method6454(this.method3262(-1831009334), var5, var6, var13, 1 == this.aByte_1462, var4, 1729511191);
      if(var4 != var9) {
         GameCoord var15 = GameCoord.method4308(this.method6203().gameCoord);
         var15.floatX = (float)((this.tilePosArrayX[0] << 9) + (this.method3257() << 8));
         var15.floatZ = (float)((this.tilePosArrayY[0] << 9) + (this.method3257() << 8));
         this.setPos(var15);
         var15.store();
      }

      if(this.index * 50743311 == client.anInt_438 * -719726693 && var16 != null) {
         for(var11 = 0; var11 < var13.length; ++var11) {
            if(var13[var11] != var16[var11]) {
               Class592.cacheObjectLoader.method5577(-1095731838);
               break;
            }
         }
      }

      if(this.aClass594_4347 != null) {
         this.aClass594_4347.method6429();
      }

      if(this.stance.isAnimating(1182533409) && this.stance.isStationary) {
         Class263 var14 = this.method3261((short)23708);
         if(!var14.method3503(this.stance.getAnimationID(-1999517314), 2087925062)) {
            this.stance.animate(-1, 1593151072);
            this.stance.isStationary = false;
         }
      }

   }

   public final void method991(ByteArrayDataNode var1, int var2) {
      var1.index = 0;
      int var3 = var1.readByte(2130324788);
      byte var4 = (byte)(var3 & 1);
      boolean var5 = this.aBoolean_1477;
      this.aBoolean_1477 = 0 != (var3 & 2);
      boolean var6 = 0 != (var3 & 4);
      int var7 = super.method3257();
      this.method3256(1 + (var3 >> 3 & 7), 59220262);
      boolean var8 = (var3 & 64) != 0;
      boolean var9 = 0 != (var3 & 128);
      GameCoord var10 = GameCoord.method4308(this.method6203().gameCoord);
      var10.floatX += (float)(this.method3257() - var7 << 8);
      var10.floatZ += (float)(this.method3257() - var7 << 8);
      this.setPos(var10);
      var10.store();
      if(var8) {
         this.aString_1460 = var1.readString(1841936278);
      } else {
         this.aString_1460 = null;
      }

      if(var9) {
         this.aString_1485 = var1.readString(1841936278);
      } else {
         this.aString_1485 = null;
      }

      this.pkIconIndex = var1.getByte((byte)63) * -574098439;
      this.currentPrayer = var1.getByte((byte)111) * -1661538615;
      this.aBoolean_1476 = var1.getByte((byte)1) == 1;
      if(Class209.currentGameMode == Class554.aClass554_9529 && client.anInt_507 * -268988889 >= 2) {
         this.aBoolean_1476 = false;
      }

      this.method990(var1, var4, -861696050);
      this.aString_1467 = var1.method4485(-1920724009);
      this.playerName = this.aString_1467;
      if(this == Class521.myPlayer) {
         Class537.aString_9452 = this.aString_1467;
      }

      this.combatLevel = var1.readByte(1951943039) * 929146623;
      if(var6) {
         this.skillLevel = var1.readShort(-524883520) * -520410735;
         if('\uffff' == this.skillLevel * 699185009) {
            this.skillLevel = 520410735;
         }

         this.anInt_1464 = this.combatLevel * 1278016099;
         this.anInt_1468 = -1310922515;
      } else {
         this.skillLevel = 0;
         this.anInt_1464 = var1.readByte(-738651306) * 799840925;
         this.anInt_1468 = var1.readByte(-233040289) * 1310922515;
         if(255 == 1519274779 * this.anInt_1468) {
            this.anInt_1468 = -1310922515;
         }
      }

      int var11 = -790407235 * this.anInt_1478;
      this.anInt_1478 = var1.readByte(1812672217) * -2089739371;
      if(0 != this.anInt_1478 * -790407235) {
         int var12 = this.anInt_1473 * 1461253509;
         int var13 = this.anInt_1474 * -545133229;
         int var14 = this.anInt_1475 * -991087421;
         int var15 = -145685525 * this.anInt_1461;
         int var16 = this.anInt_1479 * -337849209;
         this.anInt_1473 = var1.readShort(-819225144) * -1217479859;
         this.anInt_1474 = var1.readShort(1109196600) * -767238437;
         this.anInt_1475 = var1.readShort(44268936) * -661644309;
         this.anInt_1461 = var1.readShort(1221276091) * -1953428285;
         this.anInt_1479 = var1.readByte(539383396) * -356798153;
         if(this.aBoolean_1477 != var5 || var11 != -790407235 * this.anInt_1478 || var12 != 1461253509 * this.anInt_1473 || var13 != this.anInt_1474 * -545133229 || this.anInt_1475 * -991087421 != var14 || this.anInt_1461 * -145685525 != var15 || -337849209 * this.anInt_1479 != var16) {
            Class332.method4115(this, 280315826);
         }
      } else {
         Class377.method4813(this, (byte)78);
      }

   }

   public Class256 method4735(Renderer var1, int var2) {
      return null;
   }

   public String getName(boolean var1, int var2) {
      String var3 = "";
      if(null != this.aString_1460) {
         var3 = this.aString_1460;
      }

      if(var1) {
         var3 = var3 + this.aString_1467;
      } else {
         var3 = var3 + this.playerName;
      }

      if(this.aString_1485 != null) {
         var3 = var3 + this.aString_1485;
      }

      return var3;
   }

   void showFloorArrow(Renderer var1, Viewport var2, Model var3, long var4, long var6, int var8, long var9) {
      long var11 = var4 * var4 + var6 * var6;
      if(var11 >= 262144L && var11 <= var9) {
         int angle = (int)(Math.atan2((double)var4, (double)var6) * 2607.5945876176133D - (double)this.aClass6_4337.getRotation((byte)37)) & 16383;
         Model var14 = Class306.getFloorArrowModel(var1, angle, this.anInt_4300 * -1302581799, this.anInt_4354 * -430673617, 608441413 * this.anInt_4333, var8, -1700315083);
         if(null != var14) {
            var1.enableZBuffering(false);
            var14.method2069(var2, (Class92)null, 0);
            var1.enableZBuffering(true);
         }

      }
   }

   public int method3263(int var1) {
      return -1;
   }

   int method3262(int var1) {
      return this.anInt_1484 * -1570218491;
   }

   public String method997(boolean var1, int var2) {
      return var1?this.aString_1467:this.playerName;
   }

   public final void method998(int var1, int var2, byte var3, byte var4) {
      if(this.animation.isAnimating(1802992974) && this.animation.getAnimation(60586419).anInt_10118 * 771893093 == 1) {
         this.animationQueue = null;
         this.animation.animate(-1, 1593151072);
      }

      for(int var5 = 0; var5 < this.aClass322Array_4319.length; ++var5) {
         if(-1 != this.aClass322Array_4319[var5].animationID * -1769281411) {
            Class567 var6 = Class75.aClass558_1422.method6164(this.aClass322Array_4319[var5].animationID * -1769281411, (byte)6);
            if(var6.aBoolean_9630 && -1 != -1632377741 * var6.animationID && Class88.animeUnpacker.loadAnimation(var6.animationID * -1632377741).anInt_10118 * 771893093 == 1) {
               this.aClass322Array_4319[var5].anime.animate(-1, 1593151072);
               this.aClass322Array_4319[var5].animationID = -1431556309;
            }
         }
      }

      this.anInt_1480 = -1607630841;
      if(var1 >= 0 && var1 < client.aClass296_348.getMaxX((byte)6) && var2 >= 0 && var2 < client.aClass296_348.getMaxY(2046577216)) {
         if(this.tilePosArrayX[0] >= 0 && this.tilePosArrayX[0] < client.aClass296_348.getMaxX((byte)14) && this.tilePosArrayY[0] >= 0 && this.tilePosArrayY[0] < client.aClass296_348.getMaxY(1861648897)) {
            this.method1002(var1, var2, var3, (byte)-5);
         } else {
            this.method1011(var1, var2, 2066778292);
         }
      } else {
         this.method1011(var1, var2, 2011020974);
      }

   }

   final void method4723(int var1) {
      throw new IllegalStateException();
   }

   boolean method1000(Renderer var1, int flags, int var3) {
      int var4 = flags;
      Class263 var5 = this.method3261((short)20058);
      Animator animation = this.animation.isAnimating(1359058294) && !this.animation.method5877((short)17817)?this.animation:null;
      StanceAnimation stance = this.stance.isAnimating(1630038772) && !this.aBoolean_1471 && (!this.stance.isStationary || animation == null)?this.stance:null;
      int var8 = var5.anInt_4578 * 1042996495;
      int var9 = 1931940177 * var5.anInt_4579;
      if(var8 != 0 || 0 != var9 || var5.anInt_4591 * 1769482829 != 0 || 0 != -1400271511 * var5.anInt_4594) {
         flags |= 7;
      }

      int rotation = this.aClass6_4337.getRotation((byte)87);
      boolean var11 = 0 != this.aByte_4329 && -1025618511 * client.timer >= 2016302959 * this.anInt_4325 && client.timer * -1025618511 < 1974214659 * this.anInt_4326;
      if(var11) {
         flags |= 524288;
      }

      Model model = this.aClass165Array_4350[0] = this.composite.getModel(var1, flags, RandomAccessFileNode.aClass255_9018, Class598.aClass71_9878, Class104_Sub6.characterUnpacker, Class592.cacheObjectLoader, Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, animation, stance, this.emotesPossible, this.anIntArray_4343, rotation, true, Class286.aClass592_4822, -189024801);
      int var13 = Class240_Sub22_Sub10.method2608((byte)0);
      if(ClientSuper.maxMemory * -222937899 < 96 && var13 > 50) {
         Class481.method5708((byte)66);
      }

      if(Class209.currentGameMode != Class554.aClass554_9529 && var13 < 50) {
         int var14;
         for(var14 = 50 - var13; var14 > 1813833963 * client.anInt_299; client.anInt_299 += 1338671043) {
            Class231_Sub5.aByteArrayArray_8270[client.anInt_299 * 1813833963] = new byte[102400];
         }

         while(var14 < client.anInt_299 * 1813833963) {
            client.anInt_299 -= 1338671043;
            Class231_Sub5.aByteArrayArray_8270[client.anInt_299 * 1813833963] = null;
         }
      } else if(Class209.currentGameMode != Class554.aClass554_9529) {
         Class231_Sub5.aByteArrayArray_8270 = new byte[50][];
         client.anInt_299 = 0;
      }

      if(null == model) {
         return false;
      } else {
         this.anInt_4295 = model.method2041() * -1057723363;
         model.method2038();
         this.transformModel(model);
         if(var8 == 0 && 0 == var9) {
            this.method3260(rotation, this.method3257() << 9, this.method3257() << 9, 0, 0, 902611534);
         } else {
            this.method3260(rotation, var8, var9, var5.anInt_4559 * 915569627, 1058182021 * var5.anInt_4566, -1595455024);
            if(-1302581799 * this.anInt_4300 != 0) {
               model.rotateY(this.anInt_4300 * -1302581799);
            }

            if(this.anInt_4354 * -430673617 != 0) {
               model.rotateX(-430673617 * this.anInt_4354);
            }

            if(0 != 608441413 * this.anInt_4333) {
               model.offset(0, 608441413 * this.anInt_4333, 0);
            }
         }

         if(var11) {
            model.method2049(this.aByte_4327, this.aByte_4328, this.aByte_4351, this.aByte_4329 & 255);
         }

         if(!this.aBoolean_1471) {
            this.method3258(var1, var5, var4, var8, var9, rotation, (byte)-79);
         }

         return true;
      }
   }

   public final boolean method1001(byte var1) {
      return null != this.composite;
   }

   final void method1002(int var1, int var2, byte var3, byte var4) {
      if(this.anInt_4331 * -74820059 < this.tilePosArrayX.length - 1) {
         this.anInt_4331 += -380906067;
      }

      for(int var5 = this.anInt_4331 * -74820059; var5 > 0; --var5) {
         this.tilePosArrayX[var5] = this.tilePosArrayX[var5 - 1];
         this.tilePosArrayY[var5] = this.tilePosArrayY[var5 - 1];
         this.aByteArray_4303[var5] = this.aByteArray_4303[var5 - 1];
      }

      this.tilePosArrayX[0] = var1;
      this.tilePosArrayY[0] = var2;
      this.aByteArray_4303[0] = var3;
   }

   public Player(WorldObjects var1, int var2) {
      super(var1, var2, Class104_Sub14.aClass212_Sub1_Sub1_10688);
   }

   public GameCoord method1502(byte var1) {
      return GameCoord.method4306();
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      if(null != this.composite && this.method1000(var1, 131072, -1919708969)) {
         Viewport var5 = this.getTransform();
         boolean var6 = false;

         int var7;
         for(var7 = 0; var7 < this.aClass165Array_4350.length; ++var7) {
            if(null != this.aClass165Array_4350[var7] && this.aClass165Array_4350[var7].method2050(var2, var3, var5, true, 0)) {
               var6 = true;
               break;
            }
         }

         for(var7 = 0; var7 < this.aClass165Array_4350.length; ++var7) {
            this.aClass165Array_4350[var7] = null;
         }

         return var6;
      } else {
         return false;
      }
   }

   public boolean method3279(short var1) {
      return Class571.aClass587_9651.aBoolean_9754;
   }

   public Player(WorldObjects var1) {
      super(var1, Class104_Sub14.aClass212_Sub1_Sub1_10688);
   }

   public void method1006(String var1, int var2, int var3, byte var4) {
      this.showChatMessage(var1, var2, var3, Class340.method4204((byte)34) * Class571.aClass587_9651.anInt_9763 * -2144924241, (byte)-123);
   }

   public Class240_Sub6 method1504(byte var1) {
      MapPoint var2 = client.aClass296_348.getMapArea();
      return Class399.method4954(this.plane, (int)this.method6203().gameCoord.floatX + -695432704 * var2.loadedMapX, -((int)this.method6203().gameCoord.floatY), (int)this.method6203().gameCoord.floatZ + var2.loadedMapY * -149698048, (byte)-29);
   }

   public int method3257() {
      return null != this.composite && 2037569583 * this.composite.anInt_9845 != -1?Class104_Sub6.characterUnpacker.method5670(2037569583 * this.composite.anInt_9845, 1087810761).anInt_8665 * -1792142631:super.method3257();
   }

   public int getIndex(int var1) {
      return -(50743311 * this.index) - 1;
   }

   public Class342 method1503(byte var1) {
      Class342 var2 = Class342.method4218();
      var2.method4223(Class362.toRadians(this.aClass6_4337.angle * 208910329), 0.0F, 0.0F);
      return var2;
   }

   public void method1011(int var1, int var2, int var3) {
      this.anInt_4331 = 0;
      this.anInt_4345 = 0;
      this.anInt_4304 = 0;
      this.tilePosArrayX[0] = var1;
      this.tilePosArrayY[0] = var2;
      int var4 = this.method3257();
      GameCoord var5 = GameCoord.method4308(this.method6203().gameCoord);
      var5.floatX = (float)(256 * var4 + this.tilePosArrayX[0] * 512);
      var5.floatZ = (float)(256 * var4 + 512 * this.tilePosArrayY[0]);
      this.setPos(var5);
      var5.store();
      if(Class521.myPlayer == this) {
         client.aClass296_348.method3754(-467435226).method6383((byte)-18);
      }

      if(null != this.aClass594_4347) {
         this.aClass594_4347.method6429();
      }

   }

   Class268 method4719(Renderer renderer, int var2) {
      if(null != this.composite && this.method1000(renderer, 2048, -1919708969)) {
         Viewport var3 = renderer.method1979();
         Viewport var4 = this.getTransform();
         Class348 var5 = this.method6203();
         int var6 = this.aClass6_4337.getRotation((byte)89);
         Class638 somethingXY = this.worldObjects.tiles[this.plane][(int)var5.gameCoord.floatX >> 9][(int)var5.gameCoord.floatZ >> 9];
         if(null != somethingXY && somethingXY.aClass563_Sub1_Sub1_10138 != null) {
            int var8 = -1971480377 * this.anInt_4334 - somethingXY.aClass563_Sub1_Sub1_10138.height;
            this.anInt_4334 = -839276297 * (int)((float)(this.anInt_4334 * -1971480377) - (float)var8 / 10.0F);
         } else {
            this.anInt_4334 = (int)((float)(-1971480377 * this.anInt_4334) - (float)(-1971480377 * this.anInt_4334) / 10.0F) * -839276297;
         }

         var3.setAs(var4);
         var3.setOffset(0.0F, (float)(-20 - this.anInt_4334 * -1971480377), 0.0F);
         Class268 var22 = null;
         this.aBoolean_4349 = false;
         if(Class104_Sub21.renderSettings.aClass540_Sub21_7306.method4047(1071549407) == 1) {
            Class263 var9 = this.method3261((short)-26326);
            if(var9.aBoolean_4565 && (this.composite.anInt_9845 * 2037569583 == -1 || Class104_Sub6.characterUnpacker.method5670(2037569583 * this.composite.anInt_9845, 56915535).aBoolean_8647)) {
               Animator var10 = this.animation.isAnimating(1492791202) && this.animation.method5877((short)12522)?this.animation:null;
               StanceAnimation var11 = this.stance.isAnimating(1583331940) && (!this.stance.isStationary || null == var10)?this.stance:null;
               Model var12 = NodeListIterator.method5830(renderer, var6, this.anInt_4300 * -1302581799, -430673617 * this.anInt_4354, this.anInt_4333 * 608441413, 1, this.aClass165Array_4350[0], 0, 0, 160, 240, (Animator)(null != var11?var11:var10), (byte)2);
               if(var12 != null) {
                  if(this.aClass92Array_6938 == null || this.aClass92Array_6938.length < this.aClass165Array_4350.length + 1) {
                     this.method4727(this.aClass165Array_4350.length + 1, -1295215359);
                  }

                  var22 = Class104_Sub5.method3286(true, 1945829594);
                  this.aBoolean_4349 = true;
                  renderer.enableZBuffering(false);
                  var12.method2069(var3, this.aClass92Array_6938[this.aClass165Array_4350.length], 0);
                  renderer.enableZBuffering(true);
               }
            }
         }

         int var23;
         if(this == Class521.myPlayer) {
            for(var23 = client.hintMarkers.length - 1; var23 >= 0; --var23) {
               HintMarker var25 = client.hintMarkers[var23];
               if(null != var25 && -1 != var25.anInt_3700 * -1027498221) {
                  int var14;
                  if(1 == -2076198275 * var25.anInt_3702) {
                     Class240_Sub9 var24 = (Class240_Sub9)client.npcNodeList.getNode((long)(var25.markerTarget * -1369728825));
                     if(null != var24) {
                        NPC var27 = (NPC)var24.anObject_6783;
                        GameCoord var13 = GameCoord.distBetween(var27.method6203().gameCoord, Class521.myPlayer.method6203().gameCoord);
                        var14 = (int)var13.floatX;
                        int var15 = (int)var13.floatZ;
                        this.showFloorArrow(renderer, var3, this.aClass165Array_4350[0], (long)var14, (long)var15, var25.anInt_3700 * -1027498221, 92160000L);
                     }
                  }

                  if(-2076198275 * var25.anInt_3702 == 2) {
                     GameCoord var29 = Class521.myPlayer.method6203().gameCoord;
                     long var16 = (long)(var25.markerX * 1139126719 - (int)var29.floatX);
                     long var18 = (long)(var25.markerZ * 1450308353 - (int)var29.floatZ);
                     long var20 = (long)(var25.anInt_3705 * -77486569 << 9);
                     var20 *= var20;
                     this.showFloorArrow(renderer, var3, this.aClass165Array_4350[0], var16, var18, var25.anInt_3700 * -1027498221, var20);
                  }

                  if(10 == -2076198275 * var25.anInt_3702 && -1369728825 * var25.markerTarget >= 0 && var25.markerTarget * -1369728825 < client.aPlayerArray.length) {
                     Player var30 = client.aPlayerArray[var25.markerTarget * -1369728825];
                     if(var30 != null) {
                        GameCoord var28 = GameCoord.distBetween(var30.method6203().gameCoord, Class521.myPlayer.method6203().gameCoord);
                        int var31 = (int)var28.floatX;
                        var14 = (int)var28.floatZ;
                        this.showFloorArrow(renderer, var3, this.aClass165Array_4350[0], (long)var31, (long)var14, -1027498221 * var25.anInt_3700, 92160000L);
                     }
                  }
               }
            }
         }

         var3.setAs(var4);
         var3.setOffset(0.0F, (float)(-5 - -1971480377 * this.anInt_4334), 0.0F);
         if(this.aClass92Array_6938 == null || this.aClass92Array_6938.length < this.aClass165Array_4350.length) {
            this.method4727(this.aClass165Array_4350.length, -1317156077);
         }

         if(null == var22) {
            var22 = Class104_Sub5.method3286(true, 1757810670);
         }

         this.method3275(renderer, this.aClass165Array_4350, var3, false, 1725800131);

         for(var23 = 0; var23 < this.aClass165Array_4350.length; ++var23) {
            if(null != this.aClass165Array_4350[var23]) {
               this.aClass165Array_4350[var23].method2069(var3, this.aClass92Array_6938[var23], Class521.myPlayer == this?1:0);
            } else {
               this.aClass92Array_6938[var23].aBoolean_1828 = false;
            }
         }

         if(null != this.aClass594_4347) {
            Class167 var26 = this.aClass594_4347.method6434();
            renderer.method1944(var26);
         }

         for(var23 = 0; var23 < this.aClass165Array_4350.length; ++var23) {
            if(null != this.aClass165Array_4350[var23]) {
               this.aBoolean_4349 |= this.aClass165Array_4350[var23].method2058();
            }

            this.aClass165Array_4350[var23] = null;
         }

         this.anInt_4294 = 1524346689 * client.anInt_409;
         return var22;
      } else {
         return null;
      }
   }

   void method4724(Renderer var1) {
      if(this.composite != null) {
         if(this.aBoolean_4348 || this.method1000(var1, 0, -1919708969)) {
            Viewport var3 = var1.method1979();
            var3.method4622(this.method6203());
            var3.setOffset(0.0F, -5.0F, 0.0F);
            this.method3275(var1, this.aClass165Array_4350, var3, this.aBoolean_4348, 1725800131);

            for(int var4 = 0; var4 < this.aClass165Array_4350.length; ++var4) {
               this.aClass165Array_4350[var4] = null;
            }

         }
      }
   }

   public ScreenCharText getRecentChatMessage(short var1) {
      if(null != this.recentChatMessage) {
         if(this.recentChatMessage.message == null) {
            return null;
         }

         if(0 == -531811127 * client.anInt_460 || client.anInt_460 * -531811127 == 3 || client.anInt_460 * -531811127 == 1 && Class600.method6493(this.playerName, 501283170)) {
            return this.recentChatMessage;
         }
      }

      return null;
   }

   final void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   final boolean method4731(int var1) {
      return false;
   }
}
