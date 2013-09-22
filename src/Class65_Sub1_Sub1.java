
public class Class65_Sub1_Sub1 extends Class65_Sub1 {

   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1306;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1307;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1308;
   Class125 aClass125_1309;
   public final ArrayViewport anArrayViewport_1310 = new ArrayViewport();
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1311;
   Class125 aClass125_1312;
   final float[] aFloatArray_1313 = new float[4];
   public final ArrayViewport anArrayViewport_1314 = new ArrayViewport();
   final Class57 aClass57_1315;
   final float[] aFloatArray_1316 = new float[4];
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1317;
   float aFloat_1318;
   public int anInt_1319;
   public int anInt_1320;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1321;
   public int anInt_1322;
   public int anInt_1323;


   public Class65_Sub1_Sub1(Renderer_Sub3 var1, Class57 var2) throws Exception_Sub6 {
      super(var1);
      this.aClass57_1315 = var2;
      if(this.aClass57_1315.method562() && var1.method7129()) {
         this.method2944("Waterfall");
      }

   }

   public void method718(int var1, int var2, int var3) {
      float var4 = -5.0E-4F * (float)(1 + (var1 & 3));
      float var5 = (float)(1 + (var1 >> 3 & 3)) * 5.0E-4F;
      float var6 = 0 == (var1 & 64)?4.8828125E-4F:9.765625E-4F;
      boolean var7 = 0 != (var1 & 128);
      if(var7) {
         this.aFloatArray_1316[0] = var6;
         this.aFloatArray_1316[1] = 0.0F;
         this.aFloatArray_1316[2] = 0.0F;
         this.aFloatArray_1316[3] = 0.0F;
      } else {
         this.aFloatArray_1316[0] = 0.0F;
         this.aFloatArray_1316[1] = 0.0F;
         this.aFloatArray_1316[2] = var6;
         this.aFloatArray_1316[3] = 0.0F;
      }

      this.aFloatArray_1313[0] = 0.0F;
      this.aFloatArray_1313[1] = var6;
      this.aFloatArray_1313[2] = 0.0F;
      this.aFloatArray_1313[3] = var4 * (float)this.aRenderer_Sub3_1252.anInt_10636 % 1.0F;
      if(!this.aClass57_1315.aBoolean_1095) {
         int var8 = (int)(16.0F * (float)this.aRenderer_Sub3_1252.anInt_10636 * var5);
         this.aRenderer_Sub3_1252.method7224(this.aClass57_1315.aClass384Array_1091[var8 % 16]);
      } else {
         this.aFloat_1318 = (float)((double)var5 * (double)this.aRenderer_Sub3_1252.anInt_10636 % 1.0D);
      }

   }

   public void method719(int var1) {
      if(this.aClass57_1315.aBoolean_1095) {
         this.aClass133_3966.method1734(this.aClass125_1309);
      } else {
         this.aClass133_3966.method1734(this.aClass125_1312);
      }

      this.aClass133_3966.method1726();
      if(this.aClass57_1315.aBoolean_1095) {
         this.aClass133_3966.method1747(this.aClass240_Sub50_Sub1_1311, 0, this.aClass57_1315.aClass54_1099, -2104577786);
      }

      this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_1306, this.anArrayViewport_1314, (byte)-14);
      this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_1321, this.anArrayViewport_1310, (byte)-38);
      this.aClass133_3966.method1742(this.aClass240_Sub50_Sub1_1308, new Class356(this.aFloatArray_1316[0], this.aFloatArray_1316[1], this.aFloatArray_1316[2], this.aFloatArray_1316[3]), -112497234);
      this.aClass133_3966.method1742(this.aClass240_Sub50_Sub1_1317, new Class356(this.aFloatArray_1313[0], this.aFloatArray_1313[1], this.aFloatArray_1313[2], this.aFloatArray_1313[3]), -1712806520);
      this.aClass133_3966.method1742(this.aClass240_Sub50_Sub1_1307, new Class356(this.aFloat_1318, 0.0F, 0.0F, 0.0F), -1607607289);
      this.aRenderer_Sub3_1252.method7270(Class396.aClass396_7573, -1408622483 * this.anInt_1320, -885311255 * this.anInt_1319, this.anInt_1322 * -993578077, this.anInt_1323 * -2137425711);
   }

   boolean method2933() throws Exception_Sub6 {
      this.aClass240_Sub50_Sub1_1306 = this.aClass133_3966.method1753("WorldMatrix");
      this.aClass240_Sub50_Sub1_1321 = this.aClass133_3966.method1753("WVPMatrix");
      this.aClass240_Sub50_Sub1_1308 = this.aClass133_3966.method1753("UGenerationPlane");
      this.aClass240_Sub50_Sub1_1317 = this.aClass133_3966.method1753("VGenerationPlane");
      this.aClass240_Sub50_Sub1_1307 = this.aClass133_3966.method1753("Time");
      this.aClass240_Sub50_Sub1_1311 = this.aClass133_3966.method1753("billowSampler3D");
      if(this.aClass57_1315.aBoolean_1095) {
         this.aClass125_1309 = this.aClass133_3966.method1760("Waterfall3D");
         this.aClass133_3966.method1734(this.aClass125_1309);
      } else {
         this.aClass125_1312 = this.aClass133_3966.method1760("Waterfall2D");
         this.aClass133_3966.method1734(this.aClass125_1312);
      }

      return true;
   }
}
