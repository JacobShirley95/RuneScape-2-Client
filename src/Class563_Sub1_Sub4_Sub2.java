
public class Class563_Sub1_Sub4_Sub2 extends PositionEntity {

   Class594 aClass594_3084;
   int anInt_3085;
   Animator aClass507_3086;
   int anInt_3087 = 0;
   boolean aBoolean_3088 = true;
   int anInt_3089 = 0;
   int anInt_3090 = 0;


   final boolean method4731(int var1) {
      return false;
   }

   public final boolean method2235(byte var1) {
      return null == this.aClass507_3086 || this.aClass507_3086.method5887(-1907253886);
   }

   boolean method4721(int var1) {
      return false;
   }

   public int method4732(int var1) {
      return this.anInt_3087 * -1538201131;
   }

   public int method2238(byte var1) {
      return 1423559997 * this.anInt_3090;
   }

   void method2239(Renderer var1, Model var2, Viewport var3, byte var4) {
      var2.method2052(var3);
      Class86[] var5 = var2.method2059();
      Class172[] var6 = var2.method2040();
      if((null == this.aClass594_3084 || this.aClass594_3084.aBoolean_9817) && (var5 != null || null != var6)) {
         this.aClass594_3084 = Class594.method6440(client.timer * -1025618511, true);
      }

      if(null != this.aClass594_3084) {
         this.aClass594_3084.method6438(var1, (long)(-1025618511 * client.timer), var5, var6, false);
         this.aClass594_3084.method6441(this.plane, this.locX, this.locX2, this.locY, this.locY2);
      }

   }

   public final void method2240(int var1, int var2) {
      if(null != this.aClass507_3086 && !this.aClass507_3086.method5887(-1322064428)) {
         this.aClass507_3086.method5883(var1, -681838891);
      }

   }

   public final boolean method2241(byte var1) {
      return null != this.aClass507_3086 && !this.aClass507_3086.method5877((short)7281);
   }

   Model method2242(Renderer var1, int var2, int var3, byte var4) {
      Class567 var5 = Class75.aClass558_1422.method6164(var3, (byte)-74);
      Plane var6 = this.worldObjects.aClass171Array_4486[this.plane];
      Plane var7 = this.aByte_6942 < 3?this.worldObjects.aClass171Array_4486[this.aByte_6942 + 1]:null;
      GameCoord var8 = this.method6203().gameCoord;
      return this.aClass507_3086 != null && !this.aClass507_3086.method5887(-2043537600)?var5.method6242(var1, var2, true, var6, var7, (int)var8.floatX, (int)var8.floatY, (int)var8.floatZ, this.aClass507_3086, (byte)2, 1797525108):var5.method6242(var1, var2, true, var6, var7, (int)var8.floatX, (int)var8.floatY, (int)var8.floatZ, (Animator)null, (byte)2, 2108857871);
   }

   void method4724(Renderer var1) {
      Model var3 = this.method2242(var1, 0, this.anInt_3085 * 554860219, (byte)78);
      if(var3 != null) {
         this.method2239(var1, var3, this.getTransform(), (byte)0);
      }

   }

   public void method2244(int var1) {
      if(this.aClass594_3084 != null) {
         this.aClass594_3084.method6431();
      }

   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      return false;
   }

   final void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   final void method4723(int var1) {
      throw new IllegalStateException();
   }

   public Class563_Sub1_Sub4_Sub2(WorldObjects var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, boolean var14, int var15) {
      super(var1, var4, var5, var6, var7, var8, var9, var10, var11, var12, false, (byte)0);
      this.anInt_3085 = var2 * 1360467571;
      this.anInt_3089 = var13 * 431338247;
      this.anInt_3090 = var15 * 897675797;
      Class567 var16 = Class75.aClass558_1422.method6164(this.anInt_3085 * 554860219, (byte)64);
      int var17 = var16.animationID * -1632377741;
      if(var17 != -1) {
         this.aClass507_3086 = new Class507_Sub1(this, false);
         int var18 = var16.aBoolean_9630?0:2;
         if(var14) {
            var18 = 1;
         }

         this.aClass507_3086.animate(var17, var3, var18, false, (byte)-88);
      }

      this.method4727(1, -991319510);
   }

   public Class256 method4735(Renderer var1, int var2) {
      return null;
   }

   boolean method4722(byte var1) {
      return this.aBoolean_3088;
   }

   Class268 method4719(Renderer var1, int var2) {
      Model var3 = this.method2242(var1, 2048 | (0 != 58411703 * this.anInt_3089?5:0), this.anInt_3085 * 554860219, (byte)111);
      if(null == var3) {
         return null;
      } else {
         if(0 != 58411703 * this.anInt_3089) {
            var3.method2017(-631916544 * this.anInt_3089);
         }

         Viewport var4 = this.getTransform();
         this.method2239(var1, var3, var4, (byte)25);
         Class268 var5 = Class104_Sub5.method3286(false, 2079580795);
         var3.method2069(var4, this.aClass92Array_6938[0], 0);
         if(null != this.aClass594_3084) {
            Class167 var6 = this.aClass594_3084.method6434();
            var1.method1944(var6);
         }

         this.aBoolean_3088 = var3.method2058();
         this.anInt_3087 = var3.method2041() * 288687997;
         var3.method2038();
         return var5;
      }
   }
}
