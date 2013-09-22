
public abstract class Class65_Sub1 extends Class65 {

   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3956;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3957;
   static final int anInt_3958 = 4;
   static final int anInt_3959 = 64;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3960;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3961;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3962;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3963;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3964;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3965;
   protected Class133 aClass133_3966;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3967;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3968;
   static final int anInt_3969 = 32;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3970;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3971;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3972;
   static final int anInt_3973 = 1;
   static final int anInt_3974 = 2;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3975;
   static final int anInt_3976 = 8;
   static final int anInt_3977 = 16;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3978;
   Class240_Sub50_Sub1 aClass240_Sub50_Sub1_3979;
   static final int anInt_3980 = 128;
   int anInt_3981;
   int[] anIntArray_3982;
   static final ArrayViewport anArrayViewport_3983 = new ArrayViewport();
   ArrayViewport[] anArrayViewportArray_3984;
   float[] aFloatArray_3985 = new float[3];


   abstract boolean method2933() throws Exception_Sub6;

   void method2934(int var1) {
      this.anArrayViewportArray_3984[0].reset();
      this.method2940(var1);
   }

   void method2935(ArrayViewport var1) {
      if(this.aClass133_3966 != null && this.aClass133_3966.method1728() && this.aRenderer_Sub3_1252.method7223() == 0) {
         int var2 = this.aClass133_3966.method1736(1507352263);
         if((this.anIntArray_3982[var2] & 128) != 0 && this.aClass240_Sub50_Sub1_3979 != null) {
            this.aClass133_3966.method1761(this.aClass240_Sub50_Sub1_3979, var1, -1531858295);
            this.anIntArray_3982[var2] &= -129;
         }
      }

   }

   void method2936() {
      this.method2938(this.aRenderer_Sub3_1252.aBoolean_10571);
      this.method2935(this.aRenderer_Sub3_1252.method7312());
      this.method2937();
      this.method658();
   }

   void method2937() {
      if(this.aClass133_3966 != null && this.aClass133_3966.method1728()) {
         int var1 = this.aClass133_3966.method1736(2146574912);
         int var2 = this.anIntArray_3982[var1];
         if((var2 & 1) != 0 && this.aClass240_Sub50_Sub1_3978 != null) {
            this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3978, this.aRenderer_Sub3_1252.method7222(), (byte)-100);
         }

         if((var2 & 2) != 0) {
            if(this.aClass240_Sub50_Sub1_3975 != null) {
               this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3975, this.aRenderer_Sub3_1252.method7227(), (byte)-58);
            }

            if(this.aClass240_Sub50_Sub1_3965 != null) {
               this.aFloatArray_3985[0] = 0.0F;
               this.aFloatArray_3985[1] = 0.0F;
               this.aFloatArray_3985[2] = 0.0F;
               this.aRenderer_Sub3_1252.getViewport().method4626(this.aFloatArray_3985[0], this.aFloatArray_3985[1], this.aFloatArray_3985[2], this.aFloatArray_3985);
               this.aClass133_3966.method1739(this.aClass240_Sub50_Sub1_3965, this.aFloatArray_3985[0], this.aFloatArray_3985[1], this.aFloatArray_3985[2], -1428298722);
            }
         }

         if((var2 & 16) != 0 && this.aClass240_Sub50_Sub1_3962 != null) {
            this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3962, this.aRenderer_Sub3_1252.method7276(), (byte)-38);
         }

         if((var2 & 8) != 0 && this.aClass240_Sub50_Sub1_3961 != null) {
            this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3961, this.aRenderer_Sub3_1252.method7183(), (byte)-13);
         }

         if((var2 & 4) != 0 && this.aClass240_Sub50_Sub1_3960 != null) {
            this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3960, this.aRenderer_Sub3_1252.method7294(), (byte)-62);
         }

         if((var2 & 32) != 0 && this.aClass240_Sub50_Sub1_3963 != null) {
            anArrayViewport_3983.method4586(this.aRenderer_Sub3_1252.method7276(), this.aRenderer_Sub3_1252.method7294());
            this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3963, anArrayViewport_3983, (byte)-101);
         }

         if((var2 & 64) != 0 && this.aClass240_Sub50_Sub1_3964 != null) {
            anArrayViewport_3983.method4586(this.aRenderer_Sub3_1252.method7227(), this.aRenderer_Sub3_1252.method7294());
            this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3964, anArrayViewport_3983, (byte)-101);
         }

         if(this.aRenderer_Sub3_1252.method7223() == 0 && (this.anIntArray_3982[var1] & 128) != 0 && this.aClass240_Sub50_Sub1_3979 != null) {
            this.aClass133_3966.method1761(this.aClass240_Sub50_Sub1_3979, this.aRenderer_Sub3_1252.method7312(), -1959541173);
            this.anIntArray_3982[var1] &= -129;
         }

         this.anIntArray_3982[var1] = 0;
      }

   }

   void method2938(boolean var1) {
      if(this.aClass133_3966 != null && this.aClass133_3966.method1728()) {
         if(this.aClass240_Sub50_Sub1_3968 != null) {
            this.aClass133_3966.method1739(this.aClass240_Sub50_Sub1_3968, this.aRenderer_Sub3_1252.aFloat_10579 * this.aRenderer_Sub3_1252.aFloat_10582, this.aRenderer_Sub3_1252.aFloat_10580 * this.aRenderer_Sub3_1252.aFloat_10582, this.aRenderer_Sub3_1252.aFloat_10651 * this.aRenderer_Sub3_1252.aFloat_10582, -1428298722);
         }

         if(this.aClass240_Sub50_Sub1_3956 != null) {
            this.aClass133_3966.method1739(this.aClass240_Sub50_Sub1_3956, this.aRenderer_Sub3_1252.aFloatArray_10574[0], this.aRenderer_Sub3_1252.aFloatArray_10574[1], this.aRenderer_Sub3_1252.aFloatArray_10574[2], -1428298722);
         }

         if(this.aClass240_Sub50_Sub1_3970 != null) {
            this.aClass133_3966.method1739(this.aClass240_Sub50_Sub1_3970, this.aRenderer_Sub3_1252.aFloat_10579 * this.aRenderer_Sub3_1252.aFloat_10561, this.aRenderer_Sub3_1252.aFloat_10580 * this.aRenderer_Sub3_1252.aFloat_10561, this.aRenderer_Sub3_1252.aFloat_10651 * this.aRenderer_Sub3_1252.aFloat_10561, -1428298722);
         }

         if(this.aClass240_Sub50_Sub1_3971 != null) {
            this.aClass133_3966.method1739(this.aClass240_Sub50_Sub1_3971, -this.aRenderer_Sub3_1252.aFloat_10579 * this.aRenderer_Sub3_1252.aFloat_10584, -this.aRenderer_Sub3_1252.aFloat_10580 * this.aRenderer_Sub3_1252.aFloat_10584, -this.aRenderer_Sub3_1252.aFloat_10651 * this.aRenderer_Sub3_1252.aFloat_10584, -1428298722);
         }

         if(this.aClass240_Sub50_Sub1_3972 != null) {
            this.aClass133_3966.method1738(this.aClass240_Sub50_Sub1_3972, 64.0F + Math.abs(this.aRenderer_Sub3_1252.aFloatArray_10574[1]) * 928.0F, 969002563);
         }
      }

   }

   void method658() {}

   void method2940(int var1) {
      for(int var2 = 0; var2 < this.anInt_3981; ++var2) {
         this.anIntArray_3982[var2] |= 128 << var1;
      }

   }

   void method2941(Viewport var1) {
      ArrayViewport var2 = this.aRenderer_Sub3_1252.anArrayViewport_10527;
      var2.setViewport(var1);
      int var3 = this.aClass133_3966.method1736(1410911488);
      if(this.aClass240_Sub50_Sub1_3978 != null) {
         this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3978, var2, (byte)-6);
         this.anIntArray_3982[var3] &= -2;
      }

      if(this.aClass240_Sub50_Sub1_3962 != null) {
         anArrayViewport_3983.method4586(var2, this.aRenderer_Sub3_1252.method7227());
         this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3962, anArrayViewport_3983, (byte)-50);
         this.anIntArray_3982[var3] &= -17;
      }

      if(this.aClass240_Sub50_Sub1_3963 != null) {
         anArrayViewport_3983.method4586(var2, this.aRenderer_Sub3_1252.method7133());
         this.aClass133_3966.method1746(this.aClass240_Sub50_Sub1_3963, anArrayViewport_3983, (byte)-19);
         this.anIntArray_3982[var3] &= -33;
      }

      this.method2946(var3, var1);
      this.method2945(var3, var1);
   }

   void method656() {
      this.aClass133_3966.method1726();
      this.anIntArray_3982[this.aClass133_3966.method1736(1609344298)] = -1;
      this.method2934(0);
      this.method2936();
   }

   void method660() {
      if(this.aClass133_3966 != null) {
         this.aClass133_3966.method1764();
      }

   }

   Class65_Sub1(Renderer_Sub3 var1) {
      super(var1);
      new Viewport();
      this.anArrayViewportArray_3984 = new ArrayViewport[this.aRenderer_Sub3_1252.anInt_10641];

      for(int var2 = 0; var2 < this.aRenderer_Sub3_1252.anInt_10641; ++var2) {
         this.anArrayViewportArray_3984[var2] = new ArrayViewport();
      }

   }

   boolean method2944(String var1) throws Exception_Sub6 {
      this.aClass133_3966 = this.aRenderer_Sub3_1252.method7130(var1);
      if(this.aClass133_3966 == null) {
         throw new Exception_Sub6("");
      } else {
         this.aClass240_Sub50_Sub1_3979 = this.aClass133_3966.method1763("textureMatrix", 1057646377);
         this.aClass240_Sub50_Sub1_3978 = this.aClass133_3966.method1763("modelMatrix", 1057646377);
         this.aClass240_Sub50_Sub1_3975 = this.aClass133_3966.method1763("viewMatrix", 1057646377);
         this.aClass240_Sub50_Sub1_3960 = this.aClass133_3966.method1763("projectionMatrix", 1057646377);
         this.aClass240_Sub50_Sub1_3962 = this.aClass133_3966.method1763("modelViewMatrix", 1057646377);
         this.aClass240_Sub50_Sub1_3963 = this.aClass133_3966.method1763("modelViewProjectionMatrix", 1057646377);
         this.aClass240_Sub50_Sub1_3964 = this.aClass133_3966.method1763("viewProjectionMatrix", 1057646377);
         this.aClass240_Sub50_Sub1_3968 = this.aClass133_3966.method1763("ambientColour", 1057646377);
         this.aClass240_Sub50_Sub1_3956 = this.aClass133_3966.method1763("sunDirection", 1057646377);
         this.aClass240_Sub50_Sub1_3970 = this.aClass133_3966.method1763("sunColour", 1057646377);
         this.aClass240_Sub50_Sub1_3971 = this.aClass133_3966.method1763("antiSunColour", 1057646377);
         this.aClass240_Sub50_Sub1_3972 = this.aClass133_3966.method1763("sunExponent", 1057646377);
         this.aClass240_Sub50_Sub1_3965 = this.aClass133_3966.method1763("eyePosition", 1057646377);
         this.aClass240_Sub50_Sub1_3957 = this.aClass133_3966.method1763("eyePositionOS", 1057646377);
         this.aClass240_Sub50_Sub1_3967 = this.aClass133_3966.method1763("sunDirectionOS", 1057646377);
         if(!this.method2933()) {
            this.aClass133_3966 = null;
            this.aClass240_Sub50_Sub1_3979 = null;
            this.aClass240_Sub50_Sub1_3978 = null;
            this.aClass240_Sub50_Sub1_3975 = null;
            this.aClass240_Sub50_Sub1_3960 = null;
            this.aClass240_Sub50_Sub1_3962 = null;
            this.aClass240_Sub50_Sub1_3963 = null;
            this.aClass240_Sub50_Sub1_3964 = null;
            this.aClass240_Sub50_Sub1_3968 = null;
            this.aClass240_Sub50_Sub1_3956 = null;
            this.aClass240_Sub50_Sub1_3970 = null;
            this.aClass240_Sub50_Sub1_3971 = null;
            this.aClass240_Sub50_Sub1_3972 = null;
            this.aClass240_Sub50_Sub1_3965 = null;
            this.aClass240_Sub50_Sub1_3957 = null;
            this.aClass240_Sub50_Sub1_3967 = null;
            return false;
         } else {
            if(this.aClass133_3966.method1735(-1506676023) == null) {
               Class125 var2 = this.aClass133_3966.method1733(1210151384);
               if(var2 == null) {
                  throw new Exception_Sub6(this.aClass133_3966.method1749((byte)-104) + "");
               }

               this.aClass133_3966.method1734(var2);
            }

            this.anInt_3981 = this.aClass133_3966.method1730(-887463573);
            this.anIntArray_3982 = new int[this.anInt_3981];
            return true;
         }
      }
   }

   void method2945(int var1, Viewport var2) {
      if(this.aClass240_Sub50_Sub1_3967 != null) {
         float[] var3 = new float[]{this.aRenderer_Sub3_1252.aFloatArray_10574[0], this.aRenderer_Sub3_1252.aFloatArray_10574[1], this.aRenderer_Sub3_1252.aFloatArray_10574[2]};
         var2.method4638(var3);
         this.aClass133_3966.method1739(this.aClass240_Sub50_Sub1_3967, var3[0], var3[1], var3[2], -1428298722);
      }

   }

   void method2946(int var1, Viewport var2) {
      if(this.aClass240_Sub50_Sub1_3957 != null) {
         ArrayViewport var3 = this.aRenderer_Sub3_1252.method7183();
         float[] var4 = new float[]{var3.data[12], var3.data[13], var3.data[14]};
         float[] var5 = new float[]{0.0F, 0.0F, 0.0F};
         var3.method4559(var5);
         float[] var6 = new float[]{0.0F, 0.0F, 0.0F};
         this.aRenderer_Sub3_1252.getViewport().method4635(0.0F, 0.0F, 0.0F, var6);
         var2.method4637(var4);
         this.aClass133_3966.method1739(this.aClass240_Sub50_Sub1_3957, var4[0], var4[1], var4[2], -1428298722);
      }

   }

   void method659() {
      this.method2941(Viewport.aViewport_6845);
   }
}
