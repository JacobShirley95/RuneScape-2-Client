
public class Class65_Sub1_Sub2 extends Class65_Sub1 {

   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1363;
   final Class57 aClass57_1364;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1365;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1366;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1367;
   public final ArrayViewport anArrayViewport_1368 = new ArrayViewport();
   public final GameCoord aClass347_1369 = new GameCoord();
   public final ArrayViewport anArrayViewport_1370 = new ArrayViewport();
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1371;
   public final GameCoord aClass347_1372 = new GameCoord();
   public int anInt_1373;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1374;
   final Class356 aClass356_1375 = new Class356();
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1376;
   final Class356 aClass356_1377 = new Class356();
   public final Class356 aClass356_1378 = new Class356();
   final Class356 aClass356_1379 = new Class356();
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1380;
   public final Class356 aClass356_1381 = new Class356();
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1382;
   public final GameCoord aClass347_1383 = new GameCoord();
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1384;
   public int anInt_1385;
   final boolean aBoolean_1386;
   float aFloat_1387 = 0.0F;
   public int anInt_1388;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1389;
   public int anInt_1390;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_1391;
   public int anInt_1392;
   boolean aBoolean_1393;
   Class125 aClass125_1394;


   public Class65_Sub1_Sub2(Renderer_Sub3 var1, Class57 var2, boolean var3) throws Exception_Sub6 {
      super(var1);
      this.aClass57_1364 = var2;
      this.aBoolean_1393 = var3;
      if(var1.method7129() && var1.method7325()) {
         this.aBoolean_1386 = this.method2944("EnvMappedWater");
      } else {
         this.aBoolean_1386 = false;
      }

   }

   boolean method2933() throws Exception_Sub6 {
      if(!this.aClass57_1364.method561()) {
         return false;
      } else {
         this.aClass240_Sub50_Sub1_1365 = this.aClass133_3966.method1753("NormalSampler");
         this.aClass240_Sub50_Sub1_1366 = this.aClass133_3966.method1753("EnvMapSampler");
         this.aClass240_Sub50_Sub1_1367 = this.aClass133_3966.method1753("WVPMatrix");
         this.aClass240_Sub50_Sub1_1363 = this.aClass133_3966.method1753("TexCoordMatrix");
         this.aClass240_Sub50_Sub1_1371 = this.aClass133_3966.method1753("EyePosAndTime");
         this.aClass240_Sub50_Sub1_1384 = this.aClass133_3966.method1753("SunDirectionAndExponent");
         this.aClass240_Sub50_Sub1_1391 = this.aClass133_3966.method1753("SunColourAndWaveExponent");
         this.aClass240_Sub50_Sub1_1389 = this.aClass133_3966.method1753("WaveIntensityAndBreakWaterDepthAndOffset");
         this.aClass240_Sub50_Sub1_1380 = this.aClass133_3966.method1753("HeightFogPlane");
         this.aClass240_Sub50_Sub1_1382 = this.aClass133_3966.method1753("HeightFogColour");
         this.aClass240_Sub50_Sub1_1374 = this.aClass133_3966.method1753("DistanceFogPlane");
         this.aClass240_Sub50_Sub1_1376 = this.aClass133_3966.method1753("DistanceFogColour");
         this.aClass125_1394 = this.aClass133_3966.method1760(this.aBoolean_1393?"EnvMappedSea":"EnvMappedWater");
         this.aClass133_3966.method1734(this.aClass125_1394);
         return true;
      }
   }

   void method2935(ArrayViewport var1) {
      ArrayViewport var2 = new ArrayViewport();
      var2.method4557(this.aFloat_1387, this.aFloat_1387, 1.0F, 1.0F);
      var2.method4586(var1, var2);
      super.method2935(var2);
   }

   public void method862(byte var1) {
      this.method863(929220429);
      this.aClass133_3966.method1734(this.aClass125_1394);
      this.aClass133_3966.method1726();
      this.aClass133_3966.method1747(this.aClass240_Sub50_Sub1_1365, 0, this.aClass57_1364.aClass54_1096, -2104577786);
      this.aClass133_3966.method1747(this.aClass240_Sub50_Sub1_1366, 1, this.aRenderer_Sub3_1252.method7172(), -2104577786);
      this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_1367, this.anArrayViewport_1368, (byte)-35);
      this.aClass133_3966.method1761(this.aClass240_Sub50_Sub1_1363, this.anArrayViewport_1370, -1840579180);
      int var2 = 1 << (this.anInt_1392 * -1122338387 & 3);
      this.aClass133_3966.method1740(this.aClass240_Sub50_Sub1_1371, this.aClass347_1372.floatX, this.aClass347_1372.floatY, this.aClass347_1372.floatZ, (float)(this.aRenderer_Sub3_1252.anInt_10636 * var2 % '\u9c40') / 40000.0F, 862885482);
      this.aClass133_3966.method1742(this.aClass240_Sub50_Sub1_1384, this.aClass356_1375, 1393045655);
      this.aClass133_3966.method1742(this.aClass240_Sub50_Sub1_1391, this.aClass356_1377, -536416309);
      this.aClass133_3966.method1742(this.aClass240_Sub50_Sub1_1389, this.aClass356_1379, 114097294);
      this.aClass133_3966.method1742(this.aClass240_Sub50_Sub1_1380, this.aClass356_1381, 1589124088);
      this.aClass133_3966.method1741(this.aClass240_Sub50_Sub1_1382, this.aClass347_1383, 441052926);
      this.aClass133_3966.method1742(this.aClass240_Sub50_Sub1_1374, this.aClass356_1378, 122596759);
      this.aClass133_3966.method1741(this.aClass240_Sub50_Sub1_1376, this.aClass347_1369, -1533969549);
      this.aRenderer_Sub3_1252.method7270(Class396.aClass396_7573, this.anInt_1388 * -122687749, this.anInt_1385 * 12799317, 1272478299 * this.anInt_1390, -1177677661 * this.anInt_1373);
   }

   void method863(int var1) {
      this.aFloat_1387 = 2.4414062E-4F;
      short var2 = 256;
      float var3 = 0.3F;
      float var4 = 0.4F;
      float var5 = 0.1F;
      byte var6 = 5;
      this.anArrayViewport_1370.method4557(this.aFloat_1387, this.aFloat_1387, this.aFloat_1387, this.aFloat_1387);
      this.aClass356_1375.method4455(-this.aRenderer_Sub3_1252.aFloatArray_10574[0], -this.aRenderer_Sub3_1252.aFloatArray_10574[1], -this.aRenderer_Sub3_1252.aFloatArray_10574[2], 32.0F);
      this.aClass356_1377.method4455(this.aRenderer_Sub3_1252.aFloat_10579, this.aRenderer_Sub3_1252.aFloat_10580, this.aRenderer_Sub3_1252.aFloat_10651, (float)var6);
      this.aClass356_1379.method4455(var5, var4, (float)var2, var3);
   }

   void method2938(boolean var1) {
      float var2 = 1.0F + (1.0F - Math.abs(this.aRenderer_Sub3_1252.aFloatArray_10574[1])) * 2.0F;
      float var3 = this.aRenderer_Sub3_1252.aFloat_10561;
      this.aRenderer_Sub3_1252.aFloat_10561 *= var2;
      super.method2938(var1);
      this.aRenderer_Sub3_1252.aFloat_10561 = var3;
   }

   public boolean method865(int var1) {
      return this.aBoolean_1386;
   }

   static Class240_Sub22_Sub5 method866(int var0, long var1) {
      Class240_Sub22_Sub5 var3 = (Class240_Sub22_Sub5)Class240_Sub22_Sub5.aNodeArrayList_1188.getNode((long)var0 << 56 | var1);
      if(var3 == null) {
         var3 = new Class240_Sub22_Sub5(var0, var1);
         Class240_Sub22_Sub5.aNodeArrayList_1188.insert(var3, 4058728944299054175L * var3.id);
      }

      return var3;
   }
}
