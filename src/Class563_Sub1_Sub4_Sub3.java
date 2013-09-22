
public class Class563_Sub1_Sub4_Sub3 extends PositionEntity {

   int anInt_3205 = 0;
   final int anInt_3206;
   public final int anInt_3207;
   public final int anInt_3208;
   public final int anInt_3209;
   final int anInt_3210;
   final int anInt_3211;
   final int anInt_3212;
   double aDouble_3213;
   double aDouble_3214;
   boolean aBoolean_3215 = false;
   boolean aBoolean_3216 = false;
   double aDouble_3217;
   final int anInt_3218;
   double aDouble_3219;
   double aDouble_3220;
   Class594 aClass594_3221;
   final Animator aClass507_3222;
   int anInt_3223 = 0;
   public final int anInt_3224;
   final int anInt_3225;
   final boolean aBoolean_3226;


   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      return false;
   }

   public int method4732(int var1) {
      return this.anInt_3223 * 1013707745;
   }

   public void method2318(int var1) {
      if(null != this.aClass594_3221) {
         this.aClass594_3221.method6431();
      }

   }

   public void method2319(byte var1) {
      if(!this.aBoolean_3216) {
         if(-934973229 * this.anInt_3211 != 0) {
            Object var2 = null;
            if(client.anInt_356 * 415041591 == 1) {
               var2 = Class95.aClass100Array_1894[this.anInt_3211 * -934973229 - 1].getTarget((byte)17);
            } else {
               int var3;
               if(this.anInt_3211 * -934973229 < 0) {
                  var3 = -(this.anInt_3211 * -934973229) - 1;
                  if(var3 == client.anInt_438 * -719726693) {
                     var2 = Class521.myPlayer;
                  } else {
                     var2 = client.aPlayerArray[var3];
                  }
               } else {
                  var3 = -934973229 * this.anInt_3211 - 1;
                  Class240_Sub9 var4 = (Class240_Sub9)client.npcNodeList.getNode((long)var3);
                  if(var4 != null) {
                     var2 = (RSCharacter)var4.anObject_6783;
                  }
               }
            }

            if(var2 != null) {
               GameCoord var14 = ((RSCharacter)var2).method6203().gameCoord;
               this.setPosition(var14.floatX, (float)(CompProfile.getHeight((int)var14.floatX, (int)var14.floatZ, this.plane) - 1072283195 * this.anInt_3206), var14.floatZ);
               if(this.anInt_3212 * 1788681433 >= 0) {
                  Class263 var15 = ((RSCharacter)var2).method3261((short)-853);
                  int var5 = 0;
                  int var6 = 0;
                  if(null != var15.viewportData && null != var15.viewportData[this.anInt_3212 * 1788681433]) {
                     var5 += var15.viewportData[this.anInt_3212 * 1788681433][0];
                     var6 += var15.viewportData[this.anInt_3212 * 1788681433][2];
                  }

                  if(null != var15.anIntArrayArray_4583 && null != var15.anIntArrayArray_4583[this.anInt_3212 * 1788681433]) {
                     var5 += var15.anIntArrayArray_4583[1788681433 * this.anInt_3212][0];
                     var6 += var15.anIntArrayArray_4583[this.anInt_3212 * 1788681433][2];
                  }

                  if(var5 != 0 || var6 != 0) {
                     int var7 = ((RSCharacter)var2).aClass6_4337.getRotation((byte)63);
                     int var8 = var7;
                     if(((RSCharacter)var2).anIntArray_4343 != null && -1 != ((RSCharacter)var2).anIntArray_4343[this.anInt_3212 * 1788681433]) {
                        var8 = ((RSCharacter)var2).anIntArray_4343[1788681433 * this.anInt_3212];
                     }

                     int var9 = var8 - var7 & 16383;
                     int var10 = Class362.cosArray[var9];
                     int var11 = Class362.sinArray[var9];
                     int var12 = var6 * var10 + var11 * var5 >> 14;
                     var6 = var6 * var11 - var5 * var10 >> 14;
                     GameCoord var13 = GameCoord.method4308(this.method6203().gameCoord);
                     var13.floatX += (float)var12;
                     var13.floatZ += (float)var6;
                     this.setPos(var13);
                     var13.store();
                  }
               }
            }
         }

      }
   }

   public int method2320(int var1) {
      return this.anInt_3205 * 990980119;
   }

   Model method2321(Renderer var1, int var2, int var3) {
      Class567 var4 = Class75.aClass558_1422.method6164(1371625545 * this.anInt_3218, (byte)105);
      return var4.method6241(var1, var2, this.aClass507_3222, (byte)2, 2017475676);
   }

   Class268 method4719(Renderer var1, int var2) {
      Model var3 = this.method2321(var1, 2048, -216696796);
      if(var3 == null) {
         return null;
      } else {
         Viewport var4 = this.getTransform();
         this.method2325(var1, var3, var4, -592546109);
         Class268 var5 = Class104_Sub5.method3286(false, 1802023944);
         var3.method2069(var4, this.aClass92Array_6938[0], 0);
         if(this.aClass594_3221 != null) {
            Class167 var6 = this.aClass594_3221.method6434();
            var1.method1944(var6);
         }

         this.aBoolean_3215 = var3.method2058();
         var3.method2038();
         this.anInt_3223 = var3.method2041() * 164073505;
         return var5;
      }
   }

   void method4724(Renderer var1) {
      Model var3 = this.method2321(var1, 0, -216696796);
      if(var3 != null) {
         Viewport var4 = this.getTransform();
         this.anInt_3223 = var3.method2041() * 164073505;
         var3.method2038();
         this.method2325(var1, var3, var4, -374918791);
      }
   }

   void method2436(int var1) {
      GameCoord var2 = this.method6203().gameCoord;
      this.locX = this.locX2 = (short)((int)(var2.floatX / 512.0F));
      this.locY = this.locY2 = (short)((int)(var2.floatZ / 512.0F));
   }

   void method2325(Renderer var1, Model var2, Viewport var3, int var4) {
      var2.method2052(var3);
      Class86[] var5 = var2.method2059();
      Class172[] var6 = var2.method2040();
      if((null == this.aClass594_3221 || this.aClass594_3221.aBoolean_9817) && (var5 != null || null != var6)) {
         this.aClass594_3221 = Class594.method6440(client.timer * -1025618511, true);
      }

      if(null != this.aClass594_3221) {
         this.aClass594_3221.method6438(var1, (long)(-1025618511 * client.timer), var5, var6, false);
         this.aClass594_3221.method6441(this.plane, this.locX, this.locX2, this.locY, this.locY2);
      }

   }

   public final void method2326(int var1, byte var2) {
      this.aBoolean_3216 = true;
      Class348 var3 = new Class348(this.method6203());
      var3.gameCoord.floatX = (float)((double)var3.gameCoord.floatX + (double)var1 * this.aDouble_3217);
      var3.gameCoord.floatZ = (float)((double)var3.gameCoord.floatZ + this.aDouble_3213 * (double)var1);
      if(this.aBoolean_3226) {
         var3.gameCoord.floatY = (float)(CompProfile.getHeight((int)var3.gameCoord.floatX, (int)var3.gameCoord.floatZ, this.plane) - this.anInt_3206 * 1072283195);
      } else if(this.anInt_3210 * -1903098699 != -1) {
         var3.gameCoord.floatY = (float)((double)var3.gameCoord.floatY + this.aDouble_3220 * (double)var1 + (double)var1 * this.aDouble_3219 * 0.5D * (double)var1);
         this.aDouble_3220 += (double)var1 * this.aDouble_3219;
      } else {
         var3.gameCoord.floatY = (float)((double)var3.gameCoord.floatY + (double)var1 * this.aDouble_3220);
      }

      var3.aClass342_6586.method4242(1.0F, 0.0F, 0.0F, (float)Math.atan2(this.aDouble_3220, this.aDouble_3214));
      Class342 var4 = Class342.method4218();
      var4.method4242(0.0F, 1.0F, 0.0F, (float)Math.atan2(this.aDouble_3217, this.aDouble_3213) - 3.1415927F);
      var3.aClass342_6586.method4231(var4);
      var4.method4243();
      this.method6209(var3);
      if(this.aClass507_3222.method5883(1, -423553842) && this.aClass507_3222.method5887(-899182034)) {
         this.aClass507_3222.method5881((byte)32);
      }

   }

   public Class563_Sub1_Sub4_Sub3(WorldObjects var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, int var16, int var17) {
      super(var1, var3, var4, var5, CompProfile.getHeight(var5, var6, var3) - var7, var6, var5 >> 9, var5 >> 9, var6 >> 9, var6 >> 9, false, (byte)0);
      this.anInt_3218 = var2 * 583145977;
      this.anInt_3208 = 1697987919 * var8;
      this.anInt_3209 = var9 * -767033927;
      this.anInt_3210 = 1806092701 * var10;
      this.anInt_3225 = var11 * 723284579;
      this.anInt_3211 = var12 * 837052251;
      this.anInt_3224 = 887836881 * var13;
      this.anInt_3206 = var7 * 1398041331;
      this.anInt_3207 = var14 * 340692445;
      this.aBoolean_3226 = var15;
      this.aBoolean_3216 = false;
      this.anInt_3212 = var16 * -484859031;
      this.anInt_3205 = -383348825 * var17;
      int var18 = Class75.aClass558_1422.method6164(1371625545 * this.anInt_3218, (byte)51).animationID * -1632377741;
      this.aClass507_3222 = new Class507_Sub1(this, false);
      this.aClass507_3222.animate(var18, 1593151072);
      this.method4727(1, -1738596041);
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

   public Class256 method4735(Renderer var1, int var2) {
      return null;
   }

   boolean method4721(int var1) {
      return false;
   }

   public final void method2332(int var1, int var2, int var3, int var4, int var5) {
      GameCoord var6 = GameCoord.method4308(this.method6203().gameCoord);
      if(!this.aBoolean_3216) {
         float var7 = (float)var1 - var6.floatX;
         float var8 = (float)var2 - var6.floatZ;
         float var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
         if(var9 != 0.0F) {
            var6.floatX += (float)(this.anInt_3225 * 1620418379) * var7 / var9;
            var6.floatZ += (float)(1620418379 * this.anInt_3225) * var8 / var9;
         }

         if(this.aBoolean_3226) {
            var6.floatY = (float)(CompProfile.getHeight((int)var6.floatX, (int)var6.floatZ, this.plane) - 1072283195 * this.anInt_3206);
         }

         this.setPos(var6);
      }

      double var10 = (double)(this.anInt_3209 * -299960183 + 1 - var4);
      this.aDouble_3217 = (double)((float)var1 - var6.floatX) / var10;
      this.aDouble_3213 = (double)((float)var2 - var6.floatZ) / var10;
      this.aDouble_3214 = Math.sqrt(this.aDouble_3213 * this.aDouble_3213 + this.aDouble_3217 * this.aDouble_3217);
      if(-1903098699 * this.anInt_3210 != -1) {
         if(!this.aBoolean_3216) {
            this.aDouble_3220 = -this.aDouble_3214 * Math.tan(0.02454369D * (double)(-1903098699 * this.anInt_3210));
         }

         this.aDouble_3219 = 2.0D * ((double)((float)var3 - var6.floatY) - this.aDouble_3220 * var10) / (var10 * var10);
      } else {
         this.aDouble_3220 = (double)((float)var3 - var6.floatY) / var10;
      }

      var6.store();
   }

   boolean method4722(byte var1) {
      return this.aBoolean_3215;
   }
}
