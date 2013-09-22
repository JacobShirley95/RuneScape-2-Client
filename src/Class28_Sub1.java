
public class Class28_Sub1 extends Class28 {

   Class133 aClass133_4263;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_4264;
   final ArrayViewport anArrayViewport_4265 = new ArrayViewport();
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_4266;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_4267;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_4268;
   static int anInt_4269;


   boolean method3217(byte var1) throws Exception_Sub6 {
      this.aClass133_4263 = this.aRenderer_Sub3_794.method7130("Particle");
      this.aClass240_Sub50_Sub1_4266 = this.aClass133_4263.method1753("WVPMatrix");
      this.aClass240_Sub50_Sub1_4264 = this.aClass133_4263.method1753("DiffuseSampler");
      this.aClass240_Sub50_Sub1_4268 = this.aClass133_4263.method1753("TexCoordMatrix");
      this.aClass240_Sub50_Sub1_4267 = this.aClass133_4263.method1753("DiffuseColour");
      this.aClass133_4263.method1734(this.aClass133_4263.method1733(1046855801));
      return true;
   }

   public void method206(ArrayViewport var1) {
      this.anArrayViewport_4265.replaceWith(var1);
      this.anArrayViewport_4265.method4580(this.aRenderer_Sub3_794.anArrayViewport_10542);
   }

   public void method205() {
      this.method3220((byte)-5);
      this.aRenderer_Sub3_794.method7267();
   }

   void method3220(byte var1) {
      this.aClass133_4263.method1734(this.aClass133_4263.method1733(-1139768039));
      this.aClass133_4263.method1726();
      this.aClass133_4263.method1747(this.aClass240_Sub50_Sub1_4264, 0, this.aClass384_793, -2104577786);
      this.aClass133_4263.method1746(this.aClass240_Sub50_Sub1_4266, this.anArrayViewport_4265, (byte)-101);
      this.aClass133_4263.method1761(this.aClass240_Sub50_Sub1_4268, this.anArrayViewport_795, -2100630418);
      this.aClass133_4263.method1744(this.aClass240_Sub50_Sub1_4267, this.anInt_796, -105274051);
   }

   public Class28_Sub1(Renderer_Sub3 var1) throws Exception_Sub6 {
      super(var1);
      this.method3217((byte)24);
   }

   public void method207(int var1) {
      this.method3220((byte)-124);
      this.aRenderer_Sub3_794.method7270(Class396.aClass396_7573, 0, 4 * var1, 0, 2 * var1);
   }

   static final void method3222(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub19_7300.method4007(1336642789);
   }
}
