
public class Class27_Sub2 extends Class27 {

   static final int anInt_4439 = 16;
   static final int anInt_4440 = 17;
   static final int anInt_4441 = 1;
   static final int anInt_4442 = 2;
   static final int anInt_4443 = 18;
   final int[][] anIntArrayArray_4444 = new int[19][17];
   static final int anInt_4445 = 7;
   static final int anInt_4446 = 6;
   static final int anInt_4447 = 0;
   static final int anInt_4448 = 8;
   static final int anInt_4449 = 9;
   static final int anInt_4450 = 10;
   static final int anInt_4451 = 11;
   static final int anInt_4452 = 12;
   static final int anInt_4453 = 13;
   static final int anInt_4454 = 14;
   static final int anInt_4455 = 15;
   static final int anInt_4456 = 1;
   static final int anInt_4457 = 17;
   static final int anInt_4458 = 0;
   static final int anInt_4459 = 4;
   static final int anInt_4460 = 2;
   static final int anInt_4461 = 7;
   static final int anInt_4462 = 12;
   static final int anInt_4463 = 3;
   Class133 aClass133_4464;
   static final int anInt_4465 = 19;
   final ArrayViewport anArrayViewport_4466 = new ArrayViewport();
   final Class125[] aClass125Array_4467 = new Class125[19];
   static final int anInt_4468 = 5;
   int[] anIntArray_4469;


   boolean method3389(int var1) throws Exception_Sub6 {
      this.aClass133_4464 = this.aRenderer_Sub3_763.method7130("Model");
      Class240_Sub50_Sub1 var2 = this.aClass133_4464.method1753("DiffuseSampler");
      Class240_Sub50_Sub1 var3 = this.aClass133_4464.method1753("EnvironmentSampler");
      Class240_Sub50_Sub1 var4 = this.aClass133_4464.method1753("PointLightsPosAndRadiusInv");
      Class240_Sub50_Sub1 var5 = this.aClass133_4464.method1753("PointLightsDiffuseColour");
      Class240_Sub50_Sub1 var6 = this.aClass133_4464.method1753("WVPMatrix");
      Class240_Sub50_Sub1 var7 = this.aClass133_4464.method1753("TexCoordMatrix");
      Class240_Sub50_Sub1 var8 = this.aClass133_4464.method1753("HeightFogPlane");
      Class240_Sub50_Sub1 var9 = this.aClass133_4464.method1753("HeightFogColour");
      Class240_Sub50_Sub1 var10 = this.aClass133_4464.method1753("DistanceFogPlane");
      Class240_Sub50_Sub1 var11 = this.aClass133_4464.method1753("DistanceFogColour");
      Class240_Sub50_Sub1 var12 = this.aClass133_4464.method1753("SunDir");
      Class240_Sub50_Sub1 var13 = this.aClass133_4464.method1753("SunColour");
      Class240_Sub50_Sub1 var14 = this.aClass133_4464.method1753("AntiSunColour");
      Class240_Sub50_Sub1 var15 = this.aClass133_4464.method1753("AmbientColour");
      Class240_Sub50_Sub1 var16 = this.aClass133_4464.method1753("EyePos");
      Class240_Sub50_Sub1 var17 = this.aClass133_4464.method1753("SpecularExponent");
      Class240_Sub50_Sub1 var18 = this.aClass133_4464.method1753("WorldMatrix");
      this.aClass125Array_4467[0] = this.aClass133_4464.method1760("Unlit");
      this.aClass125Array_4467[1] = this.aClass133_4464.method1760("Unlit_IgnoreAlpha");
      this.aClass125Array_4467[17] = this.aClass133_4464.method1760("UnderwaterGround");
      this.aClass125Array_4467[18] = this.aClass133_4464.method1760("UnderwaterGroundSpecular");

      int var19;
      for(var19 = 0; var19 <= 4; ++var19) {
         this.aClass125Array_4467[2 + var19] = this.aClass133_4464.method1760("Standard_" + var19 + "PointLights");
         this.aClass125Array_4467[var19 + 7] = this.aClass133_4464.method1760("Specular_" + var19 + "PointLights");
         this.aClass125Array_4467[12 + var19] = this.aClass133_4464.method1760("EnvironmentalMapping_" + var19 + "PointLights");
      }

      for(var19 = 0; var19 < 19; ++var19) {
         int var20 = this.aClass133_4464.method1732(this.aClass125Array_4467[var19], (byte)95);
         this.anIntArrayArray_4444[var19][2] = var2.method872(var20);
         this.anIntArrayArray_4444[var19][3] = var3.method872(var20);
         this.anIntArrayArray_4444[var19][1] = var4.method872(var20);
         this.anIntArrayArray_4444[var19][0] = var5.method872(var20);
         this.anIntArrayArray_4444[var19][4] = var6.method872(var20);
         this.anIntArrayArray_4444[var19][5] = var7.method872(var20);
         this.anIntArrayArray_4444[var19][7] = var8.method872(var20);
         this.anIntArrayArray_4444[var19][8] = var9.method872(var20);
         this.anIntArrayArray_4444[var19][9] = var10.method872(var20);
         this.anIntArrayArray_4444[var19][10] = var11.method872(var20);
         this.anIntArrayArray_4444[var19][11] = var12.method872(var20);
         this.anIntArrayArray_4444[var19][12] = var13.method872(var20);
         this.anIntArrayArray_4444[var19][13] = var14.method872(var20);
         this.anIntArrayArray_4444[var19][14] = var15.method872(var20);
         this.anIntArrayArray_4444[var19][6] = var16.method872(var20);
         this.anIntArrayArray_4444[var19][15] = var18.method872(var20);
         this.anIntArrayArray_4444[var19][16] = var17.method872(var20);
      }

      this.aClass133_4464.method1734(this.aClass125Array_4467[2]);
      return true;
   }

   public void method192(ArrayViewport var1) {
      this.anArrayViewport_4466.replaceWith(var1);
      this.anArrayViewport_4466.method4580(this.aRenderer_Sub3_763.anArrayViewport_10542);
   }

   public void method198() {
      this.aClass133_4464.method1734(this.aClass125Array_4467[17]);
      this.anIntArray_4469 = this.anIntArrayArray_4444[this.aClass133_4464.method1736(2108041106)];
      this.aClass133_4464.method1726();
      this.method3397(0, -547641508);
   }

   public void method196() {
      this.aClass133_4464.method1734(this.aClass125Array_4467[18]);
      this.anIntArray_4469 = this.anIntArrayArray_4444[this.aClass133_4464.method1736(1906323171)];
      this.aClass133_4464.method1726();
      this.aClass133_4464.method1759(this.anIntArray_4469[6], this.aClass347_769.floatX, this.aClass347_769.floatY, this.aClass347_769.floatZ, (byte)47);
      this.aClass133_4464.method1748(this.anIntArray_4469[16], this.aFloat_770, this.aFloat_771, 0.0F, 0.0F, 2095622831);
      this.method3397(0, -947825021);
   }

   public void method193(int var1) {
      this.aClass133_4464.method1734(this.aClass125Array_4467[var1 + 2]);
      this.anIntArray_4469 = this.anIntArrayArray_4444[this.aClass133_4464.method1736(1510651366)];
      this.aClass133_4464.method1726();
      this.method3397(var1, 161260367);
   }

   public void method194(int var1) {
      this.aClass133_4464.method1734(this.aClass125Array_4467[7 + var1]);
      this.anIntArray_4469 = this.anIntArrayArray_4444[this.aClass133_4464.method1736(1436466339)];
      this.aClass133_4464.method1726();
      this.aClass133_4464.method1759(this.anIntArray_4469[6], this.aClass347_769.floatX, this.aClass347_769.floatY, this.aClass347_769.floatZ, (byte)24);
      this.aClass133_4464.method1748(this.anIntArray_4469[16], this.aFloat_770, this.aFloat_771, 0.0F, 0.0F, 1002601664);
      this.method3397(var1, -1983925455);
   }

   public void method195(int var1) {
      this.aClass133_4464.method1734(this.aClass125Array_4467[12 + var1]);
      this.anIntArray_4469 = this.anIntArrayArray_4444[this.aClass133_4464.method1736(1485894007)];
      this.aClass133_4464.method1726();
      this.aClass133_4464.method1751(this.anIntArray_4469[15], this.anArrayViewport_780, (byte)1);
      this.aClass133_4464.method1759(this.anIntArray_4469[6], this.aClass347_769.floatX, this.aClass347_769.floatY, this.aClass347_769.floatZ, (byte)44);
      this.aClass133_4464.method1758(this.anIntArray_4469[3], 1, this.aClass398_767, (byte)0);
      this.method3397(var1, -66220569);
   }

   public void method191(boolean var1) {
      if(var1) {
         this.aClass133_4464.method1734(this.aClass125Array_4467[1]);
      } else {
         this.aClass133_4464.method1734(this.aClass125Array_4467[0]);
      }

      this.anIntArray_4469 = this.anIntArrayArray_4444[this.aClass133_4464.method1736(1542829692)];
      this.aClass133_4464.method1726();
      this.aClass133_4464.method1758(this.anIntArray_4469[2], 0, this.aClass384_762, (byte)0);
      this.aClass133_4464.method1727(this.anIntArray_4469[4], this.anArrayViewport_4466, (byte)16);
      this.aClass133_4464.method1752(this.anIntArray_4469[5], this.anArrayViewport_773, 339758462);
      this.aClass133_4464.method1748(this.anIntArray_4469[7], this.aClass356_772.aFloat_6767, this.aClass356_772.aFloat_6766, this.aClass356_772.aFloat_6768, this.aClass356_772.aFloat_6765, 57172717);
      this.aClass133_4464.method1759(this.anIntArray_4469[8], this.aClass347_781.floatX, this.aClass347_781.floatY, this.aClass347_781.floatZ, (byte)65);
      this.aClass133_4464.method1748(this.anIntArray_4469[9], this.aClass356_774.aFloat_6767, this.aClass356_774.aFloat_6766, this.aClass356_774.aFloat_6768, this.aClass356_774.aFloat_6765, -276959341);
      this.aClass133_4464.method1759(this.anIntArray_4469[10], this.aClass347_775.floatX, this.aClass347_775.floatY, this.aClass347_775.floatZ, (byte)96);
      this.aRenderer_Sub3_763.method7270(Class396.aClass396_7573, this.anInt_768, this.anInt_782, this.anInt_779, this.anInt_784);
   }

   public Class27_Sub2(Renderer_Sub3 var1) throws Exception_Sub6 {
      super(var1);
      this.method3389(-192157358);
   }

   void method3397(int var1, int var2) {
      this.aClass133_4464.method1758(this.anIntArray_4469[2], 0, this.aClass384_762, (byte)0);
      this.aClass133_4464.method1727(this.anIntArray_4469[4], this.anArrayViewport_4466, (byte)16);
      this.aClass133_4464.method1752(this.anIntArray_4469[5], this.anArrayViewport_773, 339758462);
      this.aClass133_4464.method1748(this.anIntArray_4469[7], this.aClass356_772.aFloat_6767, this.aClass356_772.aFloat_6766, this.aClass356_772.aFloat_6768, this.aClass356_772.aFloat_6765, 1925150403);
      this.aClass133_4464.method1759(this.anIntArray_4469[8], this.aClass347_781.floatX, this.aClass347_781.floatY, this.aClass347_781.floatZ, (byte)18);
      this.aClass133_4464.method1748(this.anIntArray_4469[9], this.aClass356_774.aFloat_6767, this.aClass356_774.aFloat_6766, this.aClass356_774.aFloat_6768, this.aClass356_774.aFloat_6765, -1790313801);
      this.aClass133_4464.method1759(this.anIntArray_4469[10], this.aClass347_775.floatX, this.aClass347_775.floatY, this.aClass347_775.floatZ, (byte)34);
      this.aClass133_4464.method1745(this.anIntArray_4469[11], this.aClass347_766, 2143180338);
      this.aClass133_4464.method1745(this.anIntArray_4469[12], this.aClass347_777, 931115463);
      this.aClass133_4464.method1745(this.anIntArray_4469[13], this.aClass347_778, 1039154931);
      this.aClass133_4464.method1745(this.anIntArray_4469[14], this.aClass347_776, 1616437464);
      if(var1 > 0) {
         this.aClass133_4464.method1750(this.anIntArray_4469[1], this.aFloatArray_765, 4 * var1, -2003926127);
         this.aClass133_4464.method1750(this.anIntArray_4469[0], this.aFloatArray_764, var1 * 4, -57560758);
      }

      this.aRenderer_Sub3_763.method7270(Class396.aClass396_7573, this.anInt_768, this.anInt_782, this.anInt_779, this.anInt_784);
   }

   static void method3398(RSInterfaceData var0, int var1) {
      Class559 var2 = HintMarker.aClass583_3709.method6327(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 1431679067);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = null == var2.anIntArrayArray_9567?0:var2.anIntArrayArray_9567.length;
   }
}
