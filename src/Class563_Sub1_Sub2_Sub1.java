
public class Class563_Sub1_Sub2_Sub1 extends Class563_Sub1_Sub2 {

   public int anInt_3180;
   public int anInt_3181;
   public int anInt_3182 = -768007107;
   int anInt_3183 = 0;
   public int anInt_3184 = -748737285;
   int anInt_3185;
   public int anInt_3186 = 0;
   public int anInt_3187;
   boolean aBoolean_3188 = false;
   public int anInt_3189;
   int anInt_3190;
   int anInt_3191;
   int anInt_3192;


   public Class256 method4735(Renderer var1, int var2) {
      return null;
   }

   void method2271(short var1) {
      this.anInt_3185 = (32 + (int)(Math.random() * 4.0D)) * -214128979;
      this.anInt_3190 = (3 + (int)(Math.random() * 2.0D)) * 1532288571;
      this.anInt_3191 = (16 + (int)(Math.random() * 3.0D)) * 2016588529;
      if(Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3986(837334682) == 1) {
         this.anInt_3192 = (int)(Math.random() * 10.0D) * 201610517;
      } else {
         this.anInt_3192 = (int)(Math.random() * 20.0D) * 201610517;
      }

   }

   public int method4732(int var1) {
      return -10;
   }

   Class268 method4719(Renderer var1, int var2) {
      GameCoord var3 = GameCoord.method4308(this.method6203().gameCoord);
      Class629 var4 = this.worldObjects.method3427(this.plane, (int)var3.floatX >> 9, (int)var3.floatZ >> 9, (byte)46);
      Class563_Sub1_Sub1 var5 = this.worldObjects.method3428(this.plane, (int)var3.floatX >> 9, (int)var3.floatZ >> 9, 1898483438);
      int var6 = 0;
      if(var4 != null && var4.aClass563_Sub1_Sub4_10075.aBoolean_3294) {
         var6 = var4.aClass563_Sub1_Sub4_10075.method4732(-1159001274);
      }

      if(var5 != null && var5.height > -var6) {
         var6 = -var5.height;
      }

      if(var6 != 1526421727 * this.anInt_3186) {
         var3.floatY += (float)(var6 - this.anInt_3186 * 1526421727);
         this.setPos(var3);
         this.anInt_3186 = -1810996449 * var6;
      }

      Viewport var7 = var1.method1979();
      var7.init();
      if(0 == this.anInt_3186 * 1526421727) {
         boolean var8 = false;
         boolean var9 = false;
         boolean var10 = false;
         Plane var11 = this.worldObjects.planes[this.aByte_6942];
         int var12 = -544412783 * this.anInt_3183 << 1;
         int var14 = -var12 / 2;
         int var15 = -var12 / 2;
         int var16 = var11.getHeight(var14 + (int)var3.floatX, var15 + (int)var3.floatZ);
         int var17 = var12 / 2;
         int var18 = -var12 / 2;
         int var19 = var11.getHeight((int)var3.floatX + var17, var18 + (int)var3.floatZ);
         int var20 = -var12 / 2;
         int var21 = var12 / 2;
         int var22 = var11.getHeight((int)var3.floatX + var20, (int)var3.floatZ + var21);
         int var23 = var12 / 2;
         int var24 = var12 / 2;
         int var25 = var11.getHeight(var23 + (int)var3.floatX, var24 + (int)var3.floatZ);
         int var26 = var16 < var19?var16:var19;
         int var27 = var22 < var25?var22:var25;
         int var28 = var19 < var25?var19:var25;
         int var29 = var16 < var22?var16:var22;
         if(0 != var12) {
            int var31 = (int)(Math.atan2((double)(var26 - var27), (double)var12) * 2607.5945876176133D) & 16383;
            if(0 != var31) {
               var7.method4630(1.0F, 0.0F, 0.0F, Class362.toRadians(var31));
            }
         }

         if(0 != var12) {
            int var32 = (int)(Math.atan2((double)(var29 - var28), (double)var12) * 2607.5945876176133D) & 16383;
            if(var32 != 0) {
               var7.method4630(0.0F, 0.0F, 1.0F, Class362.toRadians(-var32));
            }
         }

         int var34 = var25 + var16;
         if(var22 + var19 < var34) {
            var34 = var19 + var22;
         }

         var34 = (var34 >> 1) - (int)var3.floatY;
         if(var34 != 0) {
            var7.setOffset(0.0F, (float)var34, 0.0F);
         }
      }

      var3.store();
      GameCoord var30 = this.method6203().gameCoord;
      var7.setOffset(var30.floatX, var30.floatY - 10.0F, var30.floatZ);
      Class268 var33 = Class104_Sub5.method3286(true, 1881543680);
      this.aBoolean_3188 = false;
      this.anInt_3183 = 0;
      Model var35;
      if(this.anInt_3184 * 1846804941 != -1) {
         var35 = Class592.cacheObjectLoader.getObjectDescriptor(this.anInt_3184 * 1846804941).method5468(var1, 526336, 1581258399 * this.anInt_3189, (PlayerComposite)null, (Animator)null, 572370213 * this.anInt_3185, this.anInt_3190 * 727468787, -91750895 * this.anInt_3191, this.anInt_3192 * 1285247549, 749165916);
         if(null != var35) {
            var35.method2069(var7, this.aClass92Array_6938[2], 0);
            this.aBoolean_3188 |= var35.method2058();
            this.anInt_3183 = var35.method2038() * 1008153969;
         }
      }

      if(-1 != 493513963 * this.anInt_3182) {
         var35 = Class592.cacheObjectLoader.getObjectDescriptor(493513963 * this.anInt_3182).method5468(var1, 526336, 964179701 * this.anInt_3180, (PlayerComposite)null, (Animator)null, 572370213 * this.anInt_3185, this.anInt_3190 * 727468787, this.anInt_3191 * -91750895, this.anInt_3192 * 1285247549, 905744675);
         if(var35 != null) {
            var35.method2069(var7, this.aClass92Array_6938[1], 0);
            this.aBoolean_3188 |= var35.method2058();
            if(var35.method2038() > this.anInt_3183 * -544412783) {
               this.anInt_3183 = var35.method2038() * 1008153969;
            }
         }
      }

      var35 = Class592.cacheObjectLoader.getObjectDescriptor(this.anInt_3187 * 1210439125).method5468(var1, 526336, this.anInt_3181 * 330662927, (PlayerComposite)null, (Animator)null, 572370213 * this.anInt_3185, this.anInt_3190 * 727468787, this.anInt_3191 * -91750895, 1285247549 * this.anInt_3192, 861792075);
      if(null != var35) {
         var35.method2069(var7, this.aClass92Array_6938[0], 0);
         this.aBoolean_3188 |= var35.method2058();
         if(var35.method2038() > this.anInt_3183 * -544412783) {
            this.anInt_3183 = var35.method2038() * 1008153969;
         }
      }

      return var33;
   }

   void method4724(Renderer var1) {}

   public Class563_Sub1_Sub2_Sub1(WorldObjects var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method4727(3, -1656851401);
      this.method2271((short)-27872);
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Viewport var5 = var1.method1979();
      var5.method4622(this.method6203());
      var5.setOffset(0.0F, -10.0F, 0.0F);
      Model var6 = Class592.cacheObjectLoader.getObjectDescriptor(this.anInt_3187 * 1210439125).method5468(var1, 131072, this.anInt_3181 * 330662927, (PlayerComposite)null, (Animator)null, 0, 0, 0, 0, 679046486);
      if(null != var6 && var6.method2050(var2, var3, var5, true, 0)) {
         return true;
      } else {
         if(493513963 * this.anInt_3182 != -1) {
            var6 = Class592.cacheObjectLoader.getObjectDescriptor(493513963 * this.anInt_3182).method5468(var1, 131072, this.anInt_3180 * 964179701, (PlayerComposite)null, (Animator)null, 0, 0, 0, 0, 486385157);
            if(null != var6 && var6.method2050(var2, var3, var5, true, 0)) {
               return true;
            }
         }

         if(this.anInt_3184 * 1846804941 != -1) {
            var6 = Class592.cacheObjectLoader.getObjectDescriptor(1846804941 * this.anInt_3184).method5468(var1, 131072, 1581258399 * this.anInt_3189, (PlayerComposite)null, (Animator)null, 0, 0, 0, 0, 322418271);
            if(var6 != null && var6.method2050(var2, var3, var5, true, 0)) {
               return true;
            }
         }

         return false;
      }
   }

   public int getHeight() {
      return 1526421727 * this.anInt_3186 - this.method4732(1284309458);
   }

   boolean method4722(byte var1) {
      return this.aBoolean_3188;
   }

   int method4730(int var1) {
      ObjectDescriptor var2 = Class592.cacheObjectLoader.getObjectDescriptor(1210439125 * this.anInt_3187);
      int var3 = var2.anInt_8510 * -274799891;
      ObjectDescriptor var4;
      if(this.anInt_3182 * 493513963 != -1) {
         var4 = Class592.cacheObjectLoader.getObjectDescriptor(this.anInt_3182 * 493513963);
         if(-274799891 * var4.anInt_8510 > var3) {
            var3 = var4.anInt_8510 * -274799891;
         }
      }

      if(-1 != this.anInt_3184 * 1846804941) {
         var4 = Class592.cacheObjectLoader.getObjectDescriptor(1846804941 * this.anInt_3184);
         if(var4.anInt_8510 * -274799891 > var3) {
            var3 = -274799891 * var4.anInt_8510;
         }
      }

      return var3;
   }

   boolean method4721(int var1) {
      return false;
   }
}
