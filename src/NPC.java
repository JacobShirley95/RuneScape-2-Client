
public class NPC extends RSCharacter {

   int anInt_1778;
   public int anInt_1779;
   public int anInt_1780 = 1906549919;
   public Class442 aClass442_1781;
   public static int anInt_1782 = 1353232613;
   public static int anInt_1783 = -846233693;
   public int anInt_1784 = 1529983809;
   public NPCComposite npcComposite;
   public String name;
   int[] anIntArray_1787 = new int[6];
   int[] anIntArray_1788 = new int[6];
   int anInt_1789;
   public int anInt_1790 = -1251502459;
   int anInt_1791;
   int anInt_1792;


   public NPC(WorldObjects var1, int var2) {
      super(var1, var2, AbstractServerConnection.aClass212_Sub1_Sub2_4038);
      this.method1169(69671577);
   }

   public void method1151(NPCComposite var1, int var2) {
      this.method1179(var1, true, true, 65536);
   }

   public ScreenCharText getRecentChatMessage(short var1) {
      return this.recentChatMessage != null && this.recentChatMessage.message == null?null:this.recentChatMessage;
   }

   public Class256 method4735(Renderer var1, int var2) {
      return null;
   }

   Class268 method4719(Renderer var1, int var2) {
      if(this.npcComposite != null && this.method1155(var1, 526336, 1885187570)) {
         Viewport var3 = this.getTransform();
         Class348 var4 = this.method6203();
         Viewport var5 = var1.method1979();
         int var6 = this.aClass6_4337.getRotation((byte)63);
         Class638 var7 = this.worldObjects.tiles[this.plane][(int)var4.gameCoord.floatX >> 9][(int)var4.gameCoord.floatZ >> 9];
         if(null != var7 && var7.aClass563_Sub1_Sub1_10138 != null) {
            int var8 = -1971480377 * this.anInt_4334 - var7.aClass563_Sub1_Sub1_10138.height;
            this.anInt_4334 = -839276297 * (int)((float)(this.anInt_4334 * -1971480377) - (float)var8 / 10.0F);
         } else {
            this.anInt_4334 = (int)((float)(-1971480377 * this.anInt_4334) - (float)(-1971480377 * this.anInt_4334) / 10.0F) * -839276297;
         }

         var5.setAs(var3);
         var5.setOffset(0.0F, (float)(-20 - this.anInt_4334 * -1971480377), 0.0F);
         Class263 var14 = this.method3261((short)-16669);
         NPCComposite var9 = null != this.npcComposite.anIntArray_8642?this.npcComposite.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-103):this.npcComposite;
         this.aBoolean_4349 = false;
         Class268 var10 = null;
         if(Class104_Sub21.renderSettings.aClass540_Sub21_7306.method4047(1294708759) == 1 && var9.aBoolean_8647 && var14.aBoolean_4565) {
            Animator var11 = this.animation.isAnimating(1142702834) && this.animation.method5877((short)26693)?this.animation:null;
            StanceAnimation var12 = this.stance.isAnimating(1381742082) && (!this.stance.isStationary || null == var11)?this.stance:null;
            Model var13 = NodeListIterator.method5830(var1, var6, this.anInt_4300 * -1302581799, this.anInt_4354 * -430673617, this.anInt_4333 * 608441413, -1792142631 * this.npcComposite.anInt_8665, this.aClass165Array_4350[0], this.npcComposite.aShort_8648 & '\uffff', this.npcComposite.aShort_8649 & '\uffff', this.npcComposite.aByte_8650 & 255, this.npcComposite.aByte_8635 & 255, (Animator)(null != var12?var12:var11), (byte)2);
            if(var13 != null) {
               if(null == this.aClass92Array_6938 || this.aClass92Array_6938.length < this.aClass165Array_4350.length + 1) {
                  this.method4727(this.aClass165Array_4350.length + 1, -1434041702);
               }

               var10 = Class104_Sub5.method3286(this.method1161((byte)50), 1894335453);
               this.aBoolean_4349 = true;
               var1.enableZBuffering(false);
               var13.method2069(var5, this.aClass92Array_6938[this.aClass165Array_4350.length], 0);
               var1.enableZBuffering(true);
            }
         }

         if(null == this.aClass92Array_6938 || this.aClass92Array_6938.length < this.aClass165Array_4350.length) {
            this.method4727(this.aClass165Array_4350.length, -2142768093);
         }

         if(var10 == null) {
            var10 = Class104_Sub5.method3286(this.method1161((byte)-103), 1973068169);
         }

         this.method3275(var1, this.aClass165Array_4350, var5, false, 1725800131);

         int var15;
         for(var15 = 0; var15 < this.aClass165Array_4350.length; ++var15) {
            if(this.aClass165Array_4350[var15] != null) {
               if(this.npcComposite.aBoolean_8652) {
                  this.aClass165Array_4350[var15].method2049(this.anInt_1789 * -7526319, 109601935 * this.anInt_1792, this.anInt_1791 * -1007162297, this.anInt_1778 * -1641020083);
               }

               this.aClass165Array_4350[var15].method2069(var5, this.aClass92Array_6938[var15], 0);
            } else {
               this.aClass92Array_6938[var15].aBoolean_1828 = false;
            }
         }

         if(this.aClass594_4347 != null) {
            Class167 var16 = this.aClass594_4347.method6434();
            var1.method1944(var16);
         }

         for(var15 = 0; var15 < this.aClass165Array_4350.length; ++var15) {
            if(null != this.aClass165Array_4350[var15]) {
               this.aBoolean_4349 |= this.aClass165Array_4350[var15].method2058();
            }

            this.aClass165Array_4350[var15] = null;
         }

         this.anInt_4294 = 1524346689 * client.anInt_409;
         return var10;
      } else {
         return null;
      }
   }

   boolean method1155(Renderer var1, int var2, int var3) {
      int var4 = var2;
      Class263 var5 = this.method3261((short)6982);
      Animator var6 = this.animation.isAnimating(1333995392) && !this.animation.method5877((short)10225)?this.animation:null;
      StanceAnimation var7 = this.stance.isAnimating(1910519723) && (!this.stance.isStationary || var6 == null)?this.stance:null;
      int var8 = var5.anInt_4578 * 1042996495;
      int var9 = var5.anInt_4579 * 1931940177;
      if(var8 != 0 || 0 != var9 || 0 != 1769482829 * var5.anInt_4591 || var5.anInt_4594 * -1400271511 != 0) {
         var2 |= 7;
      }

      boolean var10 = 0 != this.aByte_4329 && client.timer * -1025618511 >= this.anInt_4325 * 2016302959 && client.timer * -1025618511 < this.anInt_4326 * 1974214659;
      if(var10) {
         var2 |= 524288;
      }

      int rotation = this.aClass6_4337.getRotation((byte)43);
      Model var12 = this.aClass165Array_4350[0] = this.npcComposite.method5595(var1, var2, RandomAccessFileNode.aClass255_9018, Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, var6, var7, this.emotesPossible, this.anIntArray_4343, rotation, this.aClass442_1781, this.method3262(-1457618556), false, (byte)-29);
      if(var12 == null) {
         return false;
      } else {
         this.anInt_4295 = var12.method2041() * -1057723363;
         var12.method2038();
         this.transformModel(var12);
         if(var8 == 0 && 0 == var9) {
            this.method3260(rotation, this.method3257() << 9, this.method3257() << 9, 0, 0, -720658247);
         } else {
            this.method3260(rotation, var8, var9, var5.anInt_4559 * 915569627, var5.anInt_4566 * 1058182021, -2109250253);
            if(0 != -1302581799 * this.anInt_4300) {
               this.aClass165Array_4350[0].rotateY(this.anInt_4300 * -1302581799);
            }

            if(0 != this.anInt_4354 * -430673617) {
               this.aClass165Array_4350[0].rotateX(this.anInt_4354 * -430673617);
            }

            if(0 != 608441413 * this.anInt_4333) {
               this.aClass165Array_4350[0].offset(0, 608441413 * this.anInt_4333, 0);
            }
         }

         if(var10) {
            var12.method2049(this.aByte_4327, this.aByte_4328, this.aByte_4351, this.aByte_4329 & 255);
         }

         this.method3258(var1, var5, var4, var8, var9, rotation, (byte)-13);
         return true;
      }
   }

   public final void method1156(Class536 var1, int var2, int var3) {
      int var4 = this.tilePosArrayX[0];
      int var5 = this.tilePosArrayY[0];
      switch(var1.anInt_9449 * -1837159453) {
      case 0:
         ++var4;
         break;
      case 1:
         ++var4;
         ++var5;
         break;
      case 2:
         --var4;
         ++var5;
         break;
      case 3:
         --var4;
         break;
      case 4:
         ++var4;
         --var5;
         break;
      case 5:
         --var5;
         break;
      case 6:
         ++var5;
         break;
      case 7:
         --var4;
         --var5;
      }

      if(this.animation.isAnimating(1847602164) && this.animation.getAnimation(-536151053).anInt_10118 * 771893093 == 1) {
         this.animationQueue = null;
         this.animation.animate(-1, 1593151072);
      }

      int var6;
      for(var6 = 0; var6 < this.aClass322Array_4319.length; ++var6) {
         if(-1769281411 * this.aClass322Array_4319[var6].animationID != -1) {
            Class567 var7 = Class75.aClass558_1422.method6164(-1769281411 * this.aClass322Array_4319[var6].animationID, (byte)-109);
            if(var7.aBoolean_9630 && -1 != var7.animationID * -1632377741 && Class88.animeUnpacker.loadAnimation(-1632377741 * var7.animationID).anInt_10118 * 771893093 == 1) {
               this.aClass322Array_4319[var6].anime.animate(-1, 1593151072);
               this.aClass322Array_4319[var6].animationID = -1431556309;
            }
         }
      }

      if(this.anInt_4331 * -74820059 < this.tilePosArrayX.length - 1) {
         this.anInt_4331 += -380906067;
      }

      for(var6 = this.anInt_4331 * -74820059; var6 > 0; --var6) {
         this.tilePosArrayX[var6] = this.tilePosArrayX[var6 - 1];
         this.tilePosArrayY[var6] = this.tilePosArrayY[var6 - 1];
         this.aByteArray_4303[var6] = this.aByteArray_4303[var6 - 1];
      }

      this.tilePosArrayX[0] = var4;
      this.tilePosArrayY[0] = var5;
      this.aByteArray_4303[0] = (byte)var2;
   }

   public void method1157(int var1, int var2, int var3, boolean var4, int var5, int var6) {
      this.plane = this.aByte_6942 = (byte)var1;
      if(client.aClass296_348.method3753().method3646(var2, var3, (byte)0)) {
         ++this.aByte_6942;
      }

      if(this.animation.isAnimating(1095402699) && this.animation.getAnimation(419601933).anInt_10118 * 771893093 == 1) {
         this.animationQueue = null;
         this.animation.animate(-1, 1593151072);
      }

      int var7;
      for(var7 = 0; var7 < this.aClass322Array_4319.length; ++var7) {
         if(-1 != this.aClass322Array_4319[var7].animationID * -1769281411) {
            Class567 var8 = Class75.aClass558_1422.method6164(-1769281411 * this.aClass322Array_4319[var7].animationID, (byte)-11);
            if(var8.aBoolean_9630 && -1632377741 * var8.animationID != -1 && Class88.animeUnpacker.loadAnimation(-1632377741 * var8.animationID).anInt_10118 * 771893093 == 1) {
               this.aClass322Array_4319[var7].anime.animate(-1, 1593151072);
               this.aClass322Array_4319[var7].animationID = -1431556309;
            }
         }
      }

      if(!var4) {
         var7 = var2 - this.tilePosArrayX[0];
         int var11 = var3 - this.tilePosArrayY[0];
         if(var7 >= -8 && var7 <= 8 && var11 >= -8 && var11 <= 8) {
            if(this.anInt_4331 * -74820059 < this.tilePosArrayX.length - 1) {
               this.anInt_4331 += -380906067;
            }

            for(int var9 = this.anInt_4331 * -74820059; var9 > 0; --var9) {
               this.tilePosArrayX[var9] = this.tilePosArrayX[var9 - 1];
               this.tilePosArrayY[var9] = this.tilePosArrayY[var9 - 1];
               this.aByteArray_4303[var9] = this.aByteArray_4303[var9 - 1];
            }

            this.tilePosArrayX[0] = var2;
            this.tilePosArrayY[0] = var3;
            this.aByteArray_4303[0] = Class539.aClass539_9455.aByte_9460;
            return;
         }
      }

      this.anInt_4331 = 0;
      this.anInt_4345 = 0;
      this.anInt_4304 = 0;
      this.tilePosArrayX[0] = var2;
      this.tilePosArrayY[0] = var3;
      GameCoord var10 = GameCoord.method4308(this.method6203().gameCoord);
      var10.floatX = (float)((var5 << 8) + (this.tilePosArrayX[0] << 9));
      var10.floatZ = (float)((this.tilePosArrayY[0] << 9) + (var5 << 8));
      this.setPos(var10);
      var10.store();
      if(this.aClass594_4347 != null) {
         this.aClass594_4347.method6429();
      }

   }

   int method3262(int var1) {
      if(-1 != this.anInt_1784 * -914152641) {
         return this.anInt_1784 * -914152641;
      } else {
         if(null != this.npcComposite.anIntArray_8642) {
            NPCComposite var2 = this.npcComposite.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)20);
            if(null != var2 && var2.anInt_8608 * -164370277 != -1) {
               return -164370277 * var2.anInt_8608;
            }
         }

         return this.npcComposite.anInt_8608 * -164370277;
      }
   }

   public int method3263(int var1) {
      if(null != this.npcComposite.anIntArray_8642) {
         NPCComposite var2 = this.npcComposite.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-96);
         if(var2 != null && -1 != 68709711 * var2.anInt_8640) {
            return var2.anInt_8640 * 68709711;
         }
      }

      return this.npcComposite.anInt_8640 * 68709711;
   }

   public int getHeight() {
      if(null != this.npcComposite.anIntArray_8642) {
         NPCComposite var2 = this.npcComposite.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-34);
         if(null != var2 && -1 != var2.anInt_8664 * -1713754393) {
            return -1713754393 * var2.anInt_8664;
         }
      }

      return -1 != -1713754393 * this.npcComposite.anInt_8664?-1713754393 * this.npcComposite.anInt_8664:super.getHeight();
   }

   boolean method1161(byte var1) {
      return this.npcComposite.aBoolean_8651;
   }

   int method4730(int var1) {
      return null == this.npcComposite?0:this.npcComposite.anInt_8672 * 1957712919;
   }

   final boolean method4731(int var1) {
      return false;
   }

   final void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   final void method4723(int var1) {
      throw new IllegalStateException();
   }

   public int method1166(int var1, byte var2) {
      return this.anIntArray_1787[var1];
   }

   public NPC(WorldObjects var1) {
      super(var1, AbstractServerConnection.aClass212_Sub1_Sub2_4038);
      this.method1169(69671577);
   }

   public void method1167(int var1, int var2, int var3, int var4) {
      this.anIntArray_1787[var1] = var2;
      this.anIntArray_1788[var1] = var3;
   }

   public boolean method3279(short var1) {
      return Class571.aClass587_9651.aBoolean_9760;
   }

   void method1169(int var1) {
      this.anInt_1789 = (32 + (int)(Math.random() * 4.0D)) * 1783439537;
      this.anInt_1792 = (3 + (int)(Math.random() * 2.0D)) * 212613743;
      this.anInt_1791 = (16 + (int)(Math.random() * 3.0D)) * -448135817;
      if(Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3986(1644013590) == 1) {
         this.anInt_1778 = (int)(Math.random() * 6.0D) * -488195195;
      } else {
         this.anInt_1778 = (int)(Math.random() * 12.0D) * -488195195;
      }

   }

   public int getIndex(int var1) {
      return 1 + this.index * 50743311;
   }

   public void method1171(String var1, int var2, int var3, int var4) {
      int var5 = Class340.method4204((byte)29) * Class571.aClass587_9651.anInt_9744 * -1483491289;
      this.showChatMessage(var1, var2, var3, var5, (byte)-50);
   }

   void method4724(Renderer var1) {
      if(null != this.npcComposite) {
         if(this.aBoolean_4348 || this.method1155(var1, 0, 1188164650)) {
            Viewport var3 = var1.method1979();
            var3.setAs(this.getTransform());
            var3.setOffset(0.0F, -5.0F, 0.0F);
            this.method3275(var1, this.aClass165Array_4350, var3, this.aBoolean_4348, 1725800131);

            for(int var4 = 0; var4 < this.aClass165Array_4350.length; ++var4) {
               this.aClass165Array_4350[var4] = null;
            }

         }
      }
   }

   public Class240_Sub6 method1504(byte var1) {
      MapPoint var2 = client.aClass296_348.getMapArea();
      return Class399.method4954(this.plane, (int)this.method6203().gameCoord.floatX + -695432704 * var2.loadedMapX, -((int)this.method6203().gameCoord.floatY), (int)this.method6203().gameCoord.floatZ + -149698048 * var2.loadedMapY, (byte)-121);
   }

   public int method1174(int var1, int var2) {
      return this.anIntArray_1788[var1];
   }

   public GameCoord method1502(byte var1) {
      return GameCoord.method4306();
   }

   public Class342 method1503(byte var1) {
      Class342 var2 = Class342.method4218();
      var2.method4223(Class362.toRadians(this.aClass6_4337.angle * 208910329), 0.0F, 0.0F);
      return var2;
   }

   public final boolean method1177(int var1) {
      return null != this.npcComposite;
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      if(this.npcComposite != null && this.method1155(var1, 131072, 1850889609)) {
         Viewport var5 = this.getTransform();
         boolean var6 = false;

         int var7;
         for(var7 = 0; var7 < this.aClass165Array_4350.length; ++var7) {
            if(this.aClass165Array_4350[var7] != null) {
               boolean var10000;
               label40: {
                  if(this.npcComposite.anInt_8672 * 1957712919 <= 0) {
                     label38: {
                        if(-1 == this.npcComposite.anInt_8669 * 976007803) {
                           if(1 == this.npcComposite.anInt_8665 * -1792142631) {
                              break label38;
                           }
                        } else if(this.npcComposite.anInt_8669 * 976007803 == 1) {
                           break label38;
                        }

                        var10000 = false;
                        break label40;
                     }
                  }

                  var10000 = true;
               }

               boolean var8 = var10000;
               boolean var9 = this.aClass165Array_4350[var7].method2050(var2, var3, var5, var8, this.npcComposite.anInt_8672 * 1957712919);
               if(var9) {
                  var6 = true;
                  break;
               }
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

   public void method1179(NPCComposite var1, boolean var2, boolean var3, int var4) {
      if(var1 != this.npcComposite && Class18.optionsClosed && Class177.method2221(this.index * 50743311, 1920197993)) {
         Class602.method6502(-1194383738);
      }

      this.npcComposite = var1;
      if(this.npcComposite != null) {
         if(var2) {
            this.name = this.npcComposite.name;
         }

         if(var3) {
            this.anInt_1779 = 801759223 * this.npcComposite.anInt_8631;
         }
      }

      if(null != this.aClass594_4347) {
         this.aClass594_4347.method6429();
      }

   }
}
