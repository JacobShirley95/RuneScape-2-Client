
public class Class563_Sub1_Sub3_Sub1 extends Class563_Sub1_Sub3 implements Class218 {

   final byte aByte_7956;
   Model aClass165_7957;
   final byte aByte_7958;
   Class256 aClass256_7959;
   final int anInt_7960;
   boolean aBoolean_7961;
   Class529 aClass529_7962;
   final boolean aBoolean_7963;
   boolean aBoolean_7964;
   Class240_Sub22_Sub7 aClass240_Sub22_Sub7_7965;


   public int method2723(byte var1) {
      return 1187912935 * this.anInt_7960;
   }

   boolean method4721(int var1) {
      return this.aClass165_7957 != null?!this.aClass165_7957.method2051():true;
   }

   boolean method4722(byte var1) {
      return null != this.aClass165_7957?this.aClass165_7957.method2058():false;
   }

   public int method4732(int var1) {
      return this.aClass165_7957 != null?this.aClass165_7957.method2041():0;
   }

   Model method5222(Renderer var1, int var2, int var3) {
      if(null != this.aClass165_7957 && var1.method1940(this.aClass165_7957.method2015(), var2) == 0) {
         return this.aClass165_7957;
      } else {
         Class477 var4 = this.method5223(var1, var2, false, 1012291138);
         return var4 != null?(Model)var4.anObject_8743:null;
      }
   }

   Class477 method5223(Renderer var1, int var2, boolean var3, int var4) {
      Class534 var5 = this.aClass529_7962.method6015(1187912935 * this.anInt_7960, (byte)1);
      Plane var6;
      Plane var7;
      if(this.aBoolean_7963) {
         var6 = this.worldObjects.aClass171Array_4492[this.aByte_6942];
         var7 = this.worldObjects.aClass171Array_4486[0];
      } else {
         var6 = this.worldObjects.aClass171Array_4486[this.aByte_6942];
         if(this.aByte_6942 < 3) {
            var7 = this.worldObjects.aClass171Array_4486[this.aByte_6942 + 1];
         } else {
            var7 = null;
         }
      }

      GameCoord var8 = this.method6203().gameCoord;
      return var5.method6045(var1, var2, this.aByte_7956, this.aByte_7958, var6, var7, (int)var8.floatX, (int)var8.floatY, (int)var8.floatZ, var3, (Class532)null, -455972723);
   }

   public Class256 method4735(Renderer var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      if(this.aClass256_7959 == null) {
         this.aClass256_7959 = Class240_Sub16.method4654((int)var3.floatX, (int)var3.floatY, (int)var3.floatZ, this.method5222(var1, 0, -830129254), 1316911584);
      }

      return this.aClass256_7959;
   }

   Class268 method4719(Renderer var1, int var2) {
      if(null == this.aClass165_7957) {
         return null;
      } else {
         Viewport var3 = var1.method1979();
         var3.setAs(this.getTransform());
         var3.setOffset((float)this.aShort_3265, 0.0F, (float)this.aShort_3266);
         Class268 var4 = Class104_Sub5.method3286(this.aBoolean_7964, 1748898493);
         this.aClass165_7957.method2069(var3, this.aClass92Array_6938[0], 0);
         return var4;
      }
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Model var5 = this.method5222(var1, 131072, 1177912079);
      if(null != var5) {
         Viewport var6 = this.getTransform();
         return var5.method2050(var2, var3, var6, false, 0);
      } else {
         return false;
      }
   }

   public int method2730(int var1) {
      return this.aByte_7956;
   }

   public int method2718(int var1) {
      return this.aByte_7958;
   }

   public void method2721(Renderer var1, int var2) {
      Class240_Sub22_Sub7 var3 = null;
      if(this.aClass240_Sub22_Sub7_7965 == null && this.aBoolean_7961) {
         Class477 var4 = this.method5223(var1, 262144, true, 1012291138);
         var3 = (Class240_Sub22_Sub7)(var4 != null?var4.anObject_8742:null);
      } else {
         var3 = this.aClass240_Sub22_Sub7_7965;
         this.aClass240_Sub22_Sub7_7965 = null;
      }

      GameCoord var5 = this.method6203().gameCoord;
      if(null != var3) {
         this.worldObjects.method3436(var3, this.aByte_6942, (int)var5.floatX, (int)var5.floatZ, (boolean[])null, 901821875);
      }

   }

   public boolean method2735(byte var1) {
      return this.aBoolean_7961;
   }

   void method4724(Renderer var1) {}

   public Class563_Sub1_Sub3_Sub1(WorldObjects var1, Renderer var2, Class529 var3, Class534 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14) {
      super(var1, var7, var8, var9, var5, var6, var11, var12);
      this.aClass529_7962 = var3;
      this.anInt_7960 = var4.anInt_9367 * -115009083;
      this.aBoolean_7963 = var10;
      this.aByte_7958 = (byte)var14;
      this.aByte_7956 = (byte)var13;
      this.aBoolean_7964 = var4.anInt_9380 * 166485479 != 0 && !var10;
      this.aBoolean_7961 = var2.method1964() && var4.aBoolean_9429 && !this.aBoolean_7963 && Class104_Sub21.renderSettings.aClass540_Sub32_7303.method4388(1544628294) != 0;
      int var15 = 2048;
      if(var4.aBoolean_9437) {
         var15 |= 524288;
      }

      Class477 var16 = this.method5223(var2, var15, this.aBoolean_7961, 1012291138);
      if(null != var16) {
         this.aClass165_7957 = (Model)var16.anObject_8743;
         this.aClass240_Sub22_Sub7_7965 = (Class240_Sub22_Sub7)var16.anObject_8742;
         if(var4.aBoolean_9437) {
            this.aClass165_7957 = this.aClass165_7957.copy((byte)0, var15, false);
            if(var4.aBoolean_9437) {
               Class303 var17 = client.aClass296_348.method3748(-1512135883);
               this.aClass165_7957.method2049(-662619837 * var17.anInt_6013, var17.anInt_6011 * -1437615063, var17.anInt_6012 * -1107082823, var17.anInt_6010 * -706421525);
            }
         }
      }

      this.method4727(1, -1201027342);
   }

   public void method2722(Renderer var1, int var2) {
      Class240_Sub22_Sub7 var3 = null;
      if(this.aClass240_Sub22_Sub7_7965 == null && this.aBoolean_7961) {
         Class477 var4 = this.method5223(var1, 262144, true, 1012291138);
         var3 = (Class240_Sub22_Sub7)(null != var4?var4.anObject_8742:null);
      } else {
         var3 = this.aClass240_Sub22_Sub7_7965;
         this.aClass240_Sub22_Sub7_7965 = null;
      }

      GameCoord var5 = this.method6203().gameCoord;
      if(null != var3) {
         this.worldObjects.method3415(var3, this.aByte_6942, (int)var5.floatX, (int)var5.floatZ, (boolean[])null, (byte)-19);
      }

   }

   public void method2726(int var1) {
      if(this.aClass165_7957 != null) {
         this.aClass165_7957.method2016();
      }

   }

   static final void method5234(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      if(var0.currentAnimation * 135359233 != var4) {
         if(var4 != -1) {
            if(var0.aClass507_2578 == null) {
               var0.aClass507_2578 = new Class507_Sub3();
            }

            var0.aClass507_2578.animate(var4, 1593151072);
         } else {
            var0.aClass507_2578 = null;
         }

         var0.currentAnimation = 128423169 * var4;
         Class110_Sub1.method3149(var0, -14204849);
      }

      if(-1 == var0.anInt_2428 * -1001687885 && !var1.aBoolean_2054) {
         Class240_Sub44_Sub4.method333(1278853609 * var0.cacheID, (byte)86);
      }

   }
}
