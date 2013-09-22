
public class Class563_Sub1_Sub5_Sub2 extends Class563_Sub1_Sub5 implements Class218 {

   static final int[] anIntArray_7969 = new int[]{1, 2, 4, 8};
   boolean aBoolean_7970;
   Class256 aClass256_7971;
   public Class319 aClass319_7972;
   static final int[] anIntArray_7973 = new int[]{16, 32, 64, 128};
   boolean aBoolean_7974 = true;


   boolean method4721(int var1) {
      return false;
   }

   boolean method4722(byte var1) {
      return this.aBoolean_7974;
   }

   public int method4732(int var1) {
      return this.aClass319_7972.method3938((short)4431);
   }

   public int getHeight() {
      return this.aClass319_7972.method3939(2076059630);
   }

   public void method5244(Class532 var1, byte var2) {
      this.aClass319_7972.method3936(var1, (byte)47);
   }

   void method4724(Renderer var1) {
      Model var3 = this.aClass319_7972.method3940(var1, 262144, true, true, (short)731);
      if(var3 != null) {
         Viewport var4 = this.getTransform();
         Class348 var5 = this.method6203();
         int var6 = (int)var5.gameCoord.floatX >> 9;
         int var7 = (int)var5.gameCoord.floatZ >> 9;
         this.aClass319_7972.method3941(var1, var3, var4, var6, var6, var7, var7, false, 1991128452);
      }

   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Model var5 = this.aClass319_7972.method3940(var1, 131072, false, false, (short)731);
      return var5 == null?false:var5.method2050(var2, var3, this.getTransform(), false, 0);
   }

   final boolean method4731(int var1) {
      return false;
   }

   final void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   public int method2730(int var1) {
      return this.aClass319_7972.anInt_6177 * 1006390171;
   }

   public int method2718(int var1) {
      return this.aClass319_7972.anInt_6178 * -1198382895;
   }

   public Class256 method4735(Renderer var1, int var2) {
      return this.aClass256_7971;
   }

   public void method2726(int var1) {}

   final void method4723(int var1) {
      throw new IllegalStateException();
   }

   public void method2721(Renderer var1, int var2) {
      this.aClass319_7972.method3946(var1, -2055311399);
   }

   public Class563_Sub1_Sub5_Sub2(WorldObjects var1, Renderer var2, Class529 var3, Class534 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14) {
      super(var1, var7, var8, var9, var5, var6, Plane.method2166(var11, var12, 1859075793));
      this.aClass319_7972 = new Class319(var2, var3, var4, var11, var12, var6, this, var10, var13, var14);
      this.aBoolean_7970 = 166485479 * var4.anInt_9380 != 0 && !var10;
      this.method4727(1, -1906187649);
   }

   Class268 method4719(Renderer var1, int var2) {
      Model var3 = this.aClass319_7972.method3940(var1, 2048, false, true, (short)731);
      if(null == var3) {
         return null;
      } else {
         Viewport var4 = this.getTransform();
         Class348 var5 = this.method6203();
         Class268 var6 = Class104_Sub5.method3286(this.aBoolean_7970, 1976598381);
         int var7 = (int)var5.gameCoord.floatX >> 9;
         int var8 = (int)var5.gameCoord.floatZ >> 9;
         this.aClass319_7972.method3941(var1, var3, var4, var7, var7, var8, var8, true, 1991128452);
         var3.method2069(var4, this.aClass92Array_6938[0], 0);
         if(null != this.aClass319_7972.aClass594_6183) {
            Class167 var9 = this.aClass319_7972.aClass594_6183.method6434();
            var1.method1944(var9);
         }

         this.aBoolean_7974 = var3.method2058() || null != this.aClass319_7972.aClass594_6183;
         if(this.aClass256_7971 == null) {
            this.aClass256_7971 = Class240_Sub16.method4654((int)var5.gameCoord.floatX, (int)var5.gameCoord.floatY, (int)var5.gameCoord.floatZ, var3, -703713233);
         } else {
            Class187.method2298(this.aClass256_7971, (int)var5.gameCoord.floatX, (int)var5.gameCoord.floatY, (int)var5.gameCoord.floatZ, var3, (byte)-103);
         }

         return var6;
      }
   }

   public int method2723(byte var1) {
      return -1587807461 * this.aClass319_7972.anInt_6176;
   }

   public boolean method2735(byte var1) {
      return this.aClass319_7972.method3942((byte)-94);
   }

   public void method2722(Renderer var1, int var2) {
      this.aClass319_7972.method3945(var1, (byte)59);
   }

   static final void method5259(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2486 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 1009220237;
      Class110_Sub1.method3149(var0, 344159297);
      if(-1001687885 * var0.anInt_2428 == -1 && !var1.aBoolean_2054) {
         Class240_Sub22_Sub17.method5456(var0.cacheID * 1278853609, 1962891121);
      }

   }
}
