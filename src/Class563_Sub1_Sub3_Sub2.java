
public class Class563_Sub1_Sub3_Sub2 extends Class563_Sub1_Sub3 implements Class218 {

   boolean aBoolean_8276 = true;
   public Class319 aClass319_8277;
   Class256 aClass256_8278;
   boolean aBoolean_8279;


   public Class563_Sub1_Sub3_Sub2(WorldObjects var1, Renderer var2, Class529 var3, Class534 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      super(var1, var7, var8, var9, var5, var6, var11, var12);
      this.aClass319_8277 = new Class319(var2, var3, var4, var13, var14, var6, this, var10, var15, var16);
      this.aBoolean_8279 = var4.anInt_9380 * 166485479 != 0 && !var10;
      this.method4727(1, -1400378964);
   }

   boolean method4721(int var1) {
      return false;
   }

   public Class256 method4735(Renderer var1, int var2) {
      return this.aClass256_8278;
   }

   public int method4732(int var1) {
      return this.aClass319_8277.method3938((short)-15819);
   }

   public int getHeight() {
      return this.aClass319_8277.method3939(2076059630);
   }

   public int method2730(int var1) {
      return 1006390171 * this.aClass319_8277.anInt_6177;
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Model var5 = this.aClass319_8277.method3940(var1, 131072, false, false, (short)731);
      return var5 == null?false:var5.method2050(var2, var3, this.getTransform(), false, 0);
   }

   public int method2723(byte var1) {
      return -1587807461 * this.aClass319_8277.anInt_6176;
   }

   public int method2718(int var1) {
      return this.aClass319_8277.anInt_6178 * -1198382895;
   }

   public void method5358(Class532 var1, int var2) {
      this.aClass319_8277.method3936(var1, (byte)7);
   }

   public boolean method2735(byte var1) {
      return this.aClass319_8277.method3942((byte)-119);
   }

   public void method2722(Renderer var1, int var2) {
      this.aClass319_8277.method3945(var1, (byte)-81);
   }

   boolean method4722(byte var1) {
      return this.aBoolean_8276;
   }

   Class268 method4719(Renderer var1, int var2) {
      Model var3 = this.aClass319_8277.method3940(var1, 2048, false, true, (short)731);
      if(var3 == null) {
         return null;
      } else {
         Viewport var4 = var1.method1979();
         var4.setAs(this.getTransform());
         var4.setOffset((float)this.aShort_3265, 0.0F, (float)this.aShort_3266);
         Class348 var5 = this.method6203();
         Class268 var6 = Class104_Sub5.method3286(this.aBoolean_8279, 2079353051);
         int var7 = (int)var5.gameCoord.floatX >> 9;
         int var8 = (int)var5.gameCoord.floatZ >> 9;
         this.aClass319_8277.method3941(var1, var3, var4, var7, var7, var8, var8, true, 1991128452);
         var3.method2069(var4, this.aClass92Array_6938[0], 0);
         if(this.aClass319_8277.aClass594_6183 != null) {
            Class167 var9 = this.aClass319_8277.aClass594_6183.method6434();
            var1.method1944(var9);
         }

         this.aBoolean_8276 = var3.method2058() || null != this.aClass319_8277.aClass594_6183;
         if(this.aClass256_8278 == null) {
            this.aClass256_8278 = Class240_Sub16.method4654((int)var5.gameCoord.floatX, (int)var5.gameCoord.floatY, (int)var5.gameCoord.floatZ, var3, 1996897894);
         } else {
            Class187.method2298(this.aClass256_8278, (int)var5.gameCoord.floatX, (int)var5.gameCoord.floatY, (int)var5.gameCoord.floatZ, var3, (byte)-115);
         }

         return var6;
      }
   }

   void method4724(Renderer var1) {
      Model var3 = this.aClass319_8277.method3940(var1, 262144, false, true, (short)731);
      if(var3 != null) {
         Viewport var4 = this.getTransform();
         Class348 var5 = this.method6203();
         int var6 = (int)var5.gameCoord.floatX >> 9;
         int var7 = (int)var5.gameCoord.floatZ >> 9;
         this.aClass319_8277.method3941(var1, var3, var4, var6, var6, var7, var7, false, 1991128452);
      }

   }

   public void method2726(int var1) {}

   public void method2721(Renderer var1, int var2) {
      this.aClass319_8277.method3946(var1, -2055311399);
   }

   static Class121[] method5366(int var0) {
      return new Class121[]{Class121.aClass121_2210, Class121.aClass121_2125, Class121.aClass121_2126, Class121.aClass121_2127, Class121.aClass121_2128, Class121.aClass121_2129, Class121.aClass121_2130, Class121.aClass121_2131, Class121.aClass121_2132, Class121.aClass121_2133, Class121.aClass121_2164, Class121.aClass121_2135, Class121.aClass121_2249, Class121.aClass121_2137, Class121.aClass121_2221, Class121.aClass121_2160, Class121.aClass121_2140, Class121.aClass121_2222, Class121.aClass121_2142, Class121.aClass121_2230, Class121.aClass121_2182, Class121.aClass121_2145, Class121.aClass121_2146, Class121.aClass121_2147, Class121.aClass121_2172, Class121.aClass121_2154, Class121.aClass121_2239, Class121.aClass121_2151, Class121.aClass121_2152, Class121.aClass121_2153, Class121.aClass121_2138, Class121.aClass121_2155, Class121.aClass121_2215, Class121.aClass121_2157, Class121.aClass121_2158, Class121.aClass121_2159, Class121.aClass121_2199, Class121.aClass121_2163, Class121.aClass121_2167, Class121.aClass121_2196, Class121.aClass121_2187, Class121.aClass121_2165, Class121.aClass121_2224, Class121.aClass121_2168, Class121.aClass121_2240, Class121.aClass121_2169, Class121.aClass121_2170, Class121.aClass121_2171, Class121.aClass121_2162, Class121.aClass121_2173, Class121.aClass121_2141, Class121.aClass121_2175, Class121.aClass121_2176, Class121.aClass121_2177, Class121.aClass121_2178, Class121.aClass121_2179, Class121.aClass121_2180, Class121.aClass121_2181, Class121.aClass121_2225, Class121.aClass121_2183, Class121.aClass121_2233, Class121.aClass121_2136, Class121.aClass121_2186, Class121.aClass121_2185, Class121.aClass121_2188, Class121.aClass121_2134, Class121.aClass121_2190, Class121.aClass121_2191, Class121.aClass121_2192, Class121.aClass121_2193, Class121.aClass121_2194, Class121.aClass121_2195, Class121.aClass121_2246, Class121.aClass121_2197, Class121.aClass121_2226, Class121.aClass121_2156, Class121.aClass121_2200, Class121.aClass121_2201, Class121.aClass121_2202, Class121.aClass121_2203, Class121.aClass121_2204, Class121.aClass121_2205, Class121.aClass121_2206, Class121.aClass121_2207, Class121.aClass121_2244, Class121.aClass121_2209, Class121.aClass121_2208, Class121.aClass121_2211, Class121.aClass121_2139, Class121.aClass121_2213, Class121.aClass121_2214, Class121.aClass121_2237, Class121.aClass121_2143, Class121.aClass121_2217, Class121.aClass121_2241, Class121.aClass121_2219, Class121.aClass121_2220, Class121.aClass121_2166, Class121.aClass121_2124, Class121.aClass121_2223, Class121.aClass121_2150, Class121.aClass121_2144, Class121.aClass121_2189, Class121.aClass121_2227, Class121.aClass121_2228, Class121.aClass121_2229, Class121.aClass121_2216, Class121.aClass121_2231, Class121.aClass121_2232, Class121.aClass121_2149, Class121.aClass121_2234, Class121.aClass121_2235, Class121.aClass121_2236, Class121.aClass121_2148, Class121.aClass121_2238, Class121.aClass121_2161, Class121.aClass121_2212, Class121.aClass121_2174, Class121.aClass121_2242, Class121.aClass121_2243, Class121.aClass121_2245, Class121.aClass121_2184, Class121.aClass121_2218, Class121.aClass121_2247, Class121.aClass121_2248};
   }

   static final void method5367(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -3108883 * Class231_Sub4.anInt_8095;
   }
}
