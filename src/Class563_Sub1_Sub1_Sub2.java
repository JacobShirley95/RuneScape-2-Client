
public class Class563_Sub1_Sub1_Sub2 extends Class563_Sub1_Sub1 implements Class218 {

   boolean aBoolean_7949 = true;
   boolean aBoolean_7950;
   public Class319 aClass319_7951;
   Class256 aClass256_7952;


   public int method4732(int var1) {
      return this.aClass319_7951.method3938((short)1453);
   }

   final void method4723(int var1) {
      throw new IllegalStateException();
   }

   boolean method4722(byte var1) {
      return this.aBoolean_7949;
   }

   public Class256 method4735(Renderer var1, int var2) {
      return this.aClass256_7952;
   }

   public void method2722(Renderer var1, int var2) {
      this.aClass319_7951.method3945(var1, (byte)69);
   }

   public int getHeight() {
      return this.aClass319_7951.method3939(2076059630);
   }

   Class268 method4719(Renderer var1, int var2) {
      Model var3 = this.aClass319_7951.method3940(var1, 2048, false, true, (short)731);
      if(null == var3) {
         return null;
      } else {
         Viewport var4 = this.getTransform();
         Class348 var5 = this.method6203();
         Class268 var6 = Class104_Sub5.method3286(this.aBoolean_7950, 2056804194);
         int var7 = (int)var5.gameCoord.floatX >> 9;
         int var8 = (int)var5.gameCoord.floatZ >> 9;
         this.aClass319_7951.method3941(var1, var3, var4, var7, var7, var8, var8, true, 1991128452);
         var3.method2069(var4, this.aClass92Array_6938[0], 0);
         if(null != this.aClass319_7951.aClass594_6183) {
            Class167 var9 = this.aClass319_7951.aClass594_6183.method6434();
            var1.method1944(var9);
         }

         this.aBoolean_7949 = var3.method2058() || this.aClass319_7951.aClass594_6183 != null;
         if(this.aClass256_7952 == null) {
            this.aClass256_7952 = Class240_Sub16.method4654((int)var5.gameCoord.floatX, (int)var5.gameCoord.floatY, (int)var5.gameCoord.floatZ, var3, -421143276);
         } else {
            Class187.method2298(this.aClass256_7952, (int)var5.gameCoord.floatX, (int)var5.gameCoord.floatY, (int)var5.gameCoord.floatZ, var3, (byte)-16);
         }

         return var6;
      }
   }

   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      Model var5 = this.aClass319_7951.method3940(var1, 131072, false, false, (short)731);
      return var5 == null?false:var5.method2050(var2, var3, this.getTransform(), false, 0);
   }

   final boolean method4731(int var1) {
      return false;
   }

   final void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   public int method2723(byte var1) {
      return -1587807461 * this.aClass319_7951.anInt_6176;
   }

   public int method2730(int var1) {
      return 1006390171 * this.aClass319_7951.anInt_6177;
   }

   public int method2718(int var1) {
      return this.aClass319_7951.anInt_6178 * -1198382895;
   }

   public void method5207(Class532 var1, int var2) {
      this.aClass319_7951.method3936(var1, (byte)93);
   }

   public boolean method2735(byte var1) {
      return this.aClass319_7951.method3942((byte)-37);
   }

   public Class563_Sub1_Sub1_Sub2(WorldObjects var1, Renderer var2, Class529 var3, Class534 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13) {
      super(var1, var7, var8, var9, var5, var6, var4.anInt_9414 * -1504446669);
      this.aClass319_7951 = new Class319(var2, var3, var4, -1965975883 * Class495.aClass495_9061.anInt_9062, var11, var6, this, var10, var12, var13);
      this.aBoolean_7950 = 166485479 * var4.anInt_9380 != 0 && !var10;
      this.method4727(1, -1014976799);
   }

   public void method2726(int var1) {}

   void method4724(Renderer var1) {
      Model var3 = this.aClass319_7951.method3940(var1, 262144, true, true, (short)731);
      if(var3 != null) {
         GameCoord var4 = this.method6203().gameCoord;
         int var5 = (int)var4.floatX >> 9;
         int var6 = (int)var4.floatZ >> 9;
         this.aClass319_7951.method3941(var1, var3, this.getTransform(), var5, var5, var6, var6, false, 1991128452);
      }

   }

   public void method2721(Renderer var1, int var2) {
      this.aClass319_7951.method3946(var1, -2055311399);
   }

   boolean method4721(int var1) {
      return false;
   }

   static final void method5213(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      int[] var5 = Class557.extractInterfaceIntData(var4, var2, 2121398298);
      if(null != var5) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2406 = Class133.extractInterfaceData(var4, var2, (byte)114);
      var0.anIntArray_2546 = var5;
      var0.aBoolean_2524 = true;
   }

   static final void method5214(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      int var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class265.method3520(var2, var3 == 1, -264337107);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -2050929757 * Class357.anInt_6780;
   }
}
