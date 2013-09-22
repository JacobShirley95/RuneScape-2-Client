
public final class Class67_Sub1 extends SpriteRenderer {

   static final int anInt_4074 = 3;
   static final int anInt_4075 = 0;
   static final int anInt_4076 = 1;
   int[] anIntArray_4077;
   static final int anInt_4078 = 2;
   final Class125[] aClass125Array_4079 = new Class125[3];
   static final int anInt_4080 = 5;
   static final int anInt_4081 = 6;
   static final int anInt_4082 = 7;
   Class133 aClass133_4083;
   static final int anInt_4084 = 1;
   static final int anInt_4085 = 0;
   static final int anInt_4086 = 3;
   final int[][] anIntArrayArray_4087 = new int[3][7];
   static final int anInt_4088 = 2;
   static final int anInt_4089 = 4;
   Class356 aClass356_4090 = new Class356(1.0F, 1.0F, 1.0F, 1.0F);
   Class356 aClass356_4091 = new Class356(0.0F, 0.0F, 0.0F, 0.0F);


   boolean method3123(byte var1) throws Exception_Sub6 {
      this.aClass133_4083 = this.aRenderer_Sub3_1267.method7130("Sprite");
      Class240_Sub50_Sub1 var2 = this.aClass133_4083.method1753("WVPMatrix");
      Class240_Sub50_Sub1 var3 = this.aClass133_4083.method1753("SpriteSampler");
      Class240_Sub50_Sub1 var4 = this.aClass133_4083.method1753("MaskSampler");
      Class240_Sub50_Sub1 var5 = this.aClass133_4083.method1753("MulColour");
      Class240_Sub50_Sub1 var6 = this.aClass133_4083.method1753("AddColour");
      Class240_Sub50_Sub1 var7 = this.aClass133_4083.method1753("SpriteTexCoordMatrix");
      Class240_Sub50_Sub1 var8 = this.aClass133_4083.method1753("MaskTexCoordMatrix");
      this.aClass125Array_4079[0] = this.aClass133_4083.method1760("Normal");
      this.aClass125Array_4079[1] = this.aClass133_4083.method1760("Masked");
      this.aClass125Array_4079[2] = this.aClass133_4083.method1760("AlphaTex");

      for(int var9 = 0; var9 < 3; ++var9) {
         int var10 = this.aClass133_4083.method1732(this.aClass125Array_4079[var9], (byte)15);
         this.anIntArrayArray_4087[var9][0] = var2.method872(var10);
         this.anIntArrayArray_4087[var9][1] = var3.method872(var10);
         this.anIntArrayArray_4087[var9][2] = var4.method872(var10);
         this.anIntArrayArray_4087[var9][5] = var5.method872(var10);
         this.anIntArrayArray_4087[var9][6] = var6.method872(var10);
         this.anIntArrayArray_4087[var9][3] = var7.method872(var10);
         this.anIntArrayArray_4087[var9][4] = var8.method872(var10);
      }

      this.aClass133_4083.method1734(this.aClass125Array_4079[0]);
      return true;
   }

   void method3124(int var1) {
      this.aClass133_4083.method1758(this.anIntArray_4077[1], 0, this.aClass384_1262, (byte)0);
      this.aRenderer_Sub3_1267.method7192(this.anArrayViewport_1265);
      this.aClass133_4083.method1727(this.anIntArray_4077[0], this.anArrayViewport_1265, (byte)16);
      this.aClass133_4083.method1752(this.anIntArray_4077[3], this.anArrayViewport_1263, 339758462);
      this.aClass133_4083.method1748(this.anIntArray_4077[5], this.aClass356_4090.aFloat_6767, this.aClass356_4090.aFloat_6766, this.aClass356_4090.aFloat_6768, this.aClass356_4090.aFloat_6765, -532599038);
      this.aClass133_4083.method1748(this.anIntArray_4077[6], this.aClass356_4091.aFloat_6767, this.aClass356_4091.aFloat_6766, this.aClass356_4091.aFloat_6768, this.aClass356_4091.aFloat_6765, 452636888);
      this.aRenderer_Sub3_1267.method7251(0, this.aClass76_1264);
      this.aRenderer_Sub3_1267.method7190(this.aClass379_1269);
      this.aRenderer_Sub3_1267.method7268(Class396.aClass396_7574, this.anInt_1268, 2);
   }

   public void method688() {
      this.aClass133_4083.method1734(this.aClass125Array_4079[0]);
      this.aClass133_4083.method1726();
      this.anIntArray_4077 = this.anIntArrayArray_4087[this.aClass133_4083.method1736(2007900922)];
      this.method3124(1033130356);
   }

   public void method689() {
      this.aClass133_4083.method1734(this.aClass125Array_4079[1]);
      this.aClass133_4083.method1726();
      this.anIntArray_4077 = this.anIntArrayArray_4087[this.aClass133_4083.method1736(1367215539)];
      this.aClass133_4083.method1758(this.anIntArray_4077[2], 1, this.aClass384_1261, (byte)0);
      this.aClass133_4083.method1752(this.anIntArray_4077[4], this.anArrayViewport_1266, 339758462);
      this.method3124(1033130356);
   }

   public void method687(int var1, int var2) {
      switch(var1) {
      case 0:
         this.aClass356_4090.method4457(var2);
         this.aClass356_4091.method4457(0);
         break;
      case 1:
         this.aClass356_4090.method4457(-1);
         this.aClass356_4091.method4457(0);
         break;
      case 2:
         this.aClass356_4090.method4457(var2);
         this.aClass356_4091.method4457(0);
         break;
      case 3:
         this.aClass356_4090.method4457(16777215 | var2 & -16777216);
         this.aClass356_4091.method4457(var2 & 16777215);
         break;
      case 4:
         this.aClass356_4090.method4457(-1);
         this.aClass356_4091.method4457(var2);
         this.aClass356_4091.method4454();
      }

   }

   public Class67_Sub1(Renderer_Sub3 var1) throws Exception_Sub6 {
      super(var1);
      this.method3123((byte)8);
   }

   static final void method3128(RSInterfaceData var0, int var1) {
      if(Class542.aClass43_Sub1_9475.method370(1962524621) != Class116.aClass116_2089) {
         throw new RuntimeException();
      } else {
         Class66_Sub3 var2 = (Class66_Sub3)Class542.aClass43_Sub1_9475.method398(664084165);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)((double)var2.method3001((byte)-56) * 2607.5945876176133D) & 16383;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)((double)var2.method2996(268249827) * 2607.5945876176133D) & 16383;
      }
   }

   static final void method3129(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class116.method1485(var3, var4, var0, (short)257);
   }
}
