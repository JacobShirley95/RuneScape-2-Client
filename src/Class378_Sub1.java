
public class Class378_Sub1 extends Class378 {

   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3847;
   public static float aFloat_3848 = 0.25F;
   public static float aFloat_3849 = 1.0F;
   static final int anInt_3850 = 256;
   Class133 aClass133_3851;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3852;
   Class125 aClass125_3853;
   Class125 aClass125_3854;
   public static float aFloat_3855 = 1.0F;
   Class125 aClass125_3856;
   Class125 aClass125_3857;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3858;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3859;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3860;
   boolean aBoolean_3861;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3862;
   public static float aFloat_3863 = 1.0F;
   Class125 aClass125_3864;


   boolean method2833() {
      return this.aRenderer_Sub3_7331.aBoolean_10585 && this.aRenderer_Sub3_7331.method7325();
   }

   public Class378_Sub1(Renderer_Sub3 var1) {
      super(var1);
   }

   int method4840() {
      return 4;
   }

   boolean method4835() {
      return this.aBoolean_3861;
   }

   void method4839(int var1) {
      this.aClass133_3851.method1764();
   }

   void method4844(int var1, Class174_Sub1 var2, Class384 var3, Class99 var4, Class384 var5) {
      float var6 = this.aRenderer_Sub3_7331.method7146();
      float var7 = (float)var2.method2194();
      float var8 = (float)var2.method2198();
      Class384 var9 = var3;
      float var10 = var6 * 2.0F / var7;
      float var11 = -var6 * 2.0F / var8;
      float[] var12 = new float[]{-1.0F + var10, 1.0F + var11, 0.0F, 0.0F, -1.0F + var10, -3.0F + var11, 0.0F, 2.0F, 3.0F + var10, 1.0F + var11, 2.0F, 0.0F};
      int var13 = (int)var7;
      int var14 = (int)var8;
      int var15 = var13;
      int var16 = var14;
      if(var1 == 0) {
         var13 = 256;
         var14 = 256;
         this.aClass133_3851.method1734(this.aClass125_3854);
         this.aClass133_3851.method1726();
      } else if(var1 == 1) {
         var13 = 256;
         var14 = 256;
         var15 = var13;
         var16 = var14;
         this.aClass133_3851.method1734(this.aClass125_3864);
         this.aClass133_3851.method1726();
         this.aClass133_3851.method1725(this.aClass240_Sub50_Sub1_3847, aFloat_3863 / var7, 0.0F, -1539628260);
      } else if(var1 == 2) {
         var13 = 256;
         var14 = 256;
         var15 = var13;
         var16 = var14;
         this.aClass133_3851.method1734(this.aClass125_3864);
         this.aClass133_3851.method1726();
         this.aClass133_3851.method1725(this.aClass240_Sub50_Sub1_3847, 0.0F, aFloat_3863 / var8, -1312178418);
      } else if(var1 == 3) {
         this.aClass133_3851.method1734(this.aClass125_3856);
         var9 = var5;
         this.aClass133_3851.method1747(this.aClass240_Sub50_Sub1_3859, 1, var3, -2104577786);
         this.aClass133_3851.method1726();
      }

      float var17 = (float)var13 / var7;
      float var18 = (float)var14 / var8;
      float var19 = (float)var15 / var7;
      float var20 = (float)var16 / var8;
      var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
      var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
      var12[10] *= var19;
      var12[7] *= var20;
      this.aClass133_3851.method1743(this.aClass240_Sub50_Sub1_3852, var12, -1937024004);
      this.aClass133_3851.method1747(this.aClass240_Sub50_Sub1_3858, 0, var9, -2104577786);
      this.aClass133_3851.method1740(this.aClass240_Sub50_Sub1_3860, aFloat_3855, aFloat_3848, aFloat_3849, 0.0F, 991785004);
      this.aClass133_3851.method1740(this.aClass240_Sub50_Sub1_3862, 0.0F, 0.0F, 256.0F / var7, 256.0F / var8, -134063928);
      this.aRenderer_Sub3_7331.method1909(0, 0, var13, var14);
      this.aRenderer_Sub3_7331.method1965(0, 0, var13, var14);
   }

   int method4841() {
      return 1;
   }

   void method4837() {}

   void method4834(int var1, int var2) {}

   boolean method4843() {
      if(this.method2833()) {
         this.aClass133_3851 = this.aRenderer_Sub3_7331.method7130("FilterBloom");
         if(this.aClass133_3851 == null) {
            return false;
         } else {
            try {
               this.aClass240_Sub50_Sub1_3858 = this.aClass133_3851.method1753("sceneTex");
               this.aClass240_Sub50_Sub1_3859 = this.aClass133_3851.method1753("bloomTex1");
               this.aClass240_Sub50_Sub1_3860 = this.aClass133_3851.method1753("params");
               this.aClass240_Sub50_Sub1_3847 = this.aClass133_3851.method1753("sampleSize");
               this.aClass240_Sub50_Sub1_3862 = this.aClass133_3851.method1753("pixelOffsetAndBloomScale");
               this.aClass240_Sub50_Sub1_3852 = this.aClass133_3851.method1753("PosAndTexCoords");
               this.aClass133_3851.method1760("test");
               this.aClass125_3853 = this.aClass133_3851.method1760("techFullscreenTri");
               this.aClass125_3854 = this.aClass133_3851.method1760("brightpass");
               this.aClass125_3864 = this.aClass133_3851.method1760("blur");
               this.aClass125_3856 = this.aClass133_3851.method1760("composite");
               this.aClass125_3857 = this.aClass133_3851.method1760("techDefault");
            } catch (Exception_Sub6_Sub1 var2) {
               return false;
            } catch (Exception_Sub6_Sub2 var3) {
               return false;
            }

            if(!this.aClass125_3853.method1588()) {
               return false;
            } else if(!this.aClass125_3854.method1588()) {
               return false;
            } else if(!this.aClass125_3864.method1588()) {
               return false;
            } else if(!this.aClass125_3856.method1588()) {
               return false;
            } else if(!this.aClass125_3857.method1588()) {
               return false;
            } else {
               this.aBoolean_3861 = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }
}
