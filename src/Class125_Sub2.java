import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class125_Sub2 extends Class125 {

   long aLong_4538;
   static final int anInt_4539 = 1;
   final boolean[] aBooleanArray_4540;
   static final float[] aFloatArray_4541 = new float[16];
   long aLong_4542;
   Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_4543;
   byte[] aByteArray_4544;
   byte[] aByteArray_4545;
   static final int anInt_4546 = 0;
   Class133_Sub1 aClass133_Sub1_4547;
   final float[][] aFloatArrayArray_4548;
   boolean aBoolean_4549;


   void method1594(int var1, float[] var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = (var1 & '\uffff') * 4;
      System.arraycopy(var2, 0, this.aFloatArrayArray_4548[var4], var5, var3);
      this.aBooleanArray_4540[var4] = true;
   }

   void method1589(Class240_Sub50_Sub1 var1, float var2) {
      int var3 = ((Class240_Sub50_Sub1_Sub1)var1).method2379();
      int var4 = ((Class240_Sub50_Sub1_Sub1)var1).method2381();
      if(var1.method875(-85227650) != Class121.aClass121_2172 && var1.method875(-1333341842) != Class121.aClass121_2194) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            var3 *= 4;
            this.aFloatArrayArray_4548[0][var3] = var2;
            this.aBooleanArray_4540[0] = true;
         }

         if(var4 >= 0) {
            var4 *= 4;
            this.aFloatArrayArray_4548[1][var4] = var2;
            this.aBooleanArray_4540[1] = true;
         }

      }
   }

   void method1590(Class240_Sub50_Sub1 var1, float var2, float var3) {
      int var4 = ((Class240_Sub50_Sub1_Sub1)var1).method2379();
      int var5 = ((Class240_Sub50_Sub1_Sub1)var1).method2381();
      if(var1.method875(-1846988272) != Class121.aClass121_2154) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var4 >= 0) {
            var4 *= 4;
            this.aFloatArrayArray_4548[0][var4 + 0] = var2;
            this.aFloatArrayArray_4548[0][var4 + 1] = var3;
            this.aBooleanArray_4540[0] = true;
         }

         if(var5 >= 0) {
            var5 *= 4;
            this.aFloatArrayArray_4548[1][var5 + 0] = var2;
            this.aFloatArrayArray_4548[1][var5 + 1] = var3;
            this.aBooleanArray_4540[1] = true;
         }

      }
   }

   void method1591(Class240_Sub50_Sub1 var1, float var2, float var3, float var4) {
      int var5 = ((Class240_Sub50_Sub1_Sub1)var1).method2379();
      int var6 = ((Class240_Sub50_Sub1_Sub1)var1).method2381();
      if(var1.method875(-612187795) != Class121.aClass121_2239) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var5 >= 0) {
            var5 *= 4;
            this.aFloatArrayArray_4548[0][var5 + 0] = var2;
            this.aFloatArrayArray_4548[0][var5 + 1] = var3;
            this.aFloatArrayArray_4548[0][var5 + 2] = var4;
            this.aBooleanArray_4540[0] = true;
         }

         if(var6 >= 0) {
            var6 *= 4;
            this.aFloatArrayArray_4548[1][var6 + 0] = var2;
            this.aFloatArrayArray_4548[1][var6 + 1] = var3;
            this.aFloatArrayArray_4548[1][var6 + 2] = var4;
            this.aBooleanArray_4540[1] = true;
         }

      }
   }

   void method1602(Class240_Sub50_Sub1 var1, ArrayViewport var2) {
      int var3 = ((Class240_Sub50_Sub1_Sub1)var1).method2379();
      int var4 = ((Class240_Sub50_Sub1_Sub1)var1).method2381();
      if(var1.method875(-796316417) != Class121.aClass121_2165) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            this.method3478(var3, var2.method4575(aFloatArray_4541), 8);
         }

         if(var4 >= 0) {
            this.method3479(var4, var2.method4575(aFloatArray_4541), 8);
         }

      }
   }

   void method1597(int var1, ArrayViewport var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method4571(aFloatArray_4541), 0, this.aFloatArrayArray_4548[var3], var4, 12);
      this.aBooleanArray_4540[var3] = true;
   }

   void method1595(Class240_Sub50_Sub1 var1, int var2, Class403 var3) {
      this.aRenderer_Sub3_Sub2_4543.method7313(var2);
      this.aRenderer_Sub3_Sub2_4543.method7224(var3);
   }

   void method1600(int var1, float var2, float var3, float var4) {
      int var5 = var1 >> 16;
      int var6 = (var1 & '\uffff') * 4;
      this.aFloatArrayArray_4548[var5][var6] = var2;
      this.aFloatArrayArray_4548[var5][var6 + 1] = var3;
      this.aFloatArrayArray_4548[var5][var6 + 2] = var4;
      this.aBooleanArray_4540[var5] = true;
   }

   void method1592(Class240_Sub50_Sub1 var1, float var2, float var3, float var4, float var5) {
      int var6 = ((Class240_Sub50_Sub1_Sub1)var1).method2379();
      int var7 = ((Class240_Sub50_Sub1_Sub1)var1).method2381();
      if(var1.method875(-917628731) != Class121.aClass121_2151) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var6 >= 0) {
            var6 *= 4;
            this.aFloatArrayArray_4548[0][var6 + 0] = var2;
            this.aFloatArrayArray_4548[0][var6 + 1] = var3;
            this.aFloatArrayArray_4548[0][var6 + 2] = var4;
            this.aFloatArrayArray_4548[0][var6 + 3] = var5;
            this.aBooleanArray_4540[0] = true;
         }

         if(var7 >= 0) {
            var7 *= 4;
            this.aFloatArrayArray_4548[1][var7 + 0] = var2;
            this.aFloatArrayArray_4548[1][var7 + 1] = var3;
            this.aFloatArrayArray_4548[1][var7 + 2] = var4;
            this.aFloatArrayArray_4548[1][var7 + 3] = var5;
            this.aBooleanArray_4540[1] = true;
         }

      }
   }

   void method1598(int var1, ArrayViewport var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method4571(aFloatArray_4541), 0, this.aFloatArrayArray_4548[var3], var4, 16);
      this.aBooleanArray_4540[var3] = true;
   }

   final void method3478(int var1, float[] var2, int var3) {
      Class543.method6090(var2, 0, this.aFloatArrayArray_4548[0], var1 * 4, var3);
      this.aBooleanArray_4540[0] = true;
   }

   final void method3479(int var1, float[] var2, int var3) {
      Class543.method6090(var2, 0, this.aFloatArrayArray_4548[1], var1 * 4, var3);
      this.aBooleanArray_4540[1] = true;
   }

   void method3480() {
      int var1;
      if(this.aBooleanArray_4540[0]) {
         for(var1 = 0; var1 < this.aFloatArrayArray_4548[0].length; ++var1) {
            this.aRenderer_Sub3_Sub2_4543.anUnsafe_10510.putFloat(this.aRenderer_Sub3_Sub2_4543.aLong_10629 + (long)(var1 * 4), this.aFloatArrayArray_4548[0][var1]);
         }

         IDirect3DDevice.SetVertexShaderConstantF(this.aRenderer_Sub3_Sub2_4543.curScene, 0, this.aRenderer_Sub3_Sub2_4543.aLong_10629, this.aFloatArrayArray_4548[0].length / 4);
         this.aBooleanArray_4540[0] = false;
      }

      if(this.aBooleanArray_4540[1]) {
         for(var1 = 0; var1 < this.aFloatArrayArray_4548[1].length; ++var1) {
            this.aRenderer_Sub3_Sub2_4543.anUnsafe_10510.putFloat(this.aRenderer_Sub3_Sub2_4543.aLong_10629 + (long)(var1 * 4), this.aFloatArrayArray_4548[1][var1]);
         }

         IDirect3DDevice.SetPixelShaderConstantF(this.aRenderer_Sub3_Sub2_4543.curScene, 0, this.aRenderer_Sub3_Sub2_4543.aLong_10629, this.aFloatArrayArray_4548[1].length / 4);
         this.aBooleanArray_4540[1] = false;
      }

   }

   public void method824() {
      if(this.aLong_4538 != 0L) {
         IUnknown.Release(this.aLong_4538);
         this.aLong_4538 = 0L;
      }

      if(this.aLong_4542 != 0L) {
         IUnknown.Release(this.aLong_4542);
         this.aLong_4542 = 0L;
      }

      this.aRenderer_Sub3_Sub2_4543.method7127(this);
   }

   void method3482() {
      if(this.aLong_4538 != 0L) {
         this.aRenderer_Sub3_Sub2_4543.method951(this.aLong_4538);
         this.aLong_4538 = 0L;
      }

      if(this.aLong_4542 != 0L) {
         this.aRenderer_Sub3_Sub2_4543.method951(this.aLong_4542);
         this.aLong_4542 = 0L;
      }

   }

   public void finalize() {
      this.method3482();
   }

   void method1593(Class240_Sub50_Sub1 var1, float[] var2, int var3) {
      int var4 = ((Class240_Sub50_Sub1_Sub1)var1).method2379();
      int var5 = ((Class240_Sub50_Sub1_Sub1)var1).method2381();
      if(var1.method875(-712115790) != Class121.aClass121_2126) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var4 >= 0) {
            this.method3478(var4, var2, var3);
         }

         if(var5 >= 0) {
            this.method3479(var5, var2, var3);
         }

      }
   }

   void method1599(int var1, int var2, Class403 var3) {
      this.aRenderer_Sub3_Sub2_4543.method7313(var2);
      this.aRenderer_Sub3_Sub2_4543.method7224(var3);
   }

   public boolean method1588() {
      if(this.aBoolean_4549) {
         return true;
      } else {
         this.aLong_4538 = this.aByteArray_4544 == null?0L:IDirect3DDevice.CreateVertexShader(this.aRenderer_Sub3_Sub2_4543.curScene, this.aByteArray_4544);
         this.aLong_4542 = this.aByteArray_4545 == null?0L:IDirect3DDevice.CreatePixelShader(this.aRenderer_Sub3_Sub2_4543.curScene, this.aByteArray_4545);
         if(this.aLong_4538 == 0L && this.aLong_4542 == 0L) {
            return false;
         } else {
            int var1 = -1;

            int var2;
            for(var2 = 0; var2 < this.aClass133_Sub1_4547.method1730(-1015577058); ++var2) {
               if(this.aClass133_Sub1_4547.method1731(var2, -217255013) == this) {
                  var1 = var2;
                  break;
               }
            }

            var2 = this.aClass133_Sub1_4547.method1756(72865380);
            int var3 = this.aClass133_Sub1_4547.method1754((byte)-28);

            int var4;
            Class240_Sub50_Sub1 var5;
            for(var4 = 0; var4 < var2; ++var4) {
               var5 = this.aClass133_Sub1_4547.method1757(var4, (byte)102);
               var5.method869(var1);
            }

            for(var4 = 0; var4 < var3; ++var4) {
               var5 = this.aClass133_Sub1_4547.method1755(var4, (byte)3);
               var5.method869(var1);
            }

            var4 = 0;
            int var12 = 0;
            int var6 = this.aClass133_Sub1_4547.method1732(this, (byte)109);

            for(int var7 = 0; var7 < var2 + var3; ++var7) {
               Class240_Sub50_Sub1_Sub1 var8 = (Class240_Sub50_Sub1_Sub1)(var7 < var2?this.aClass133_Sub1_4547.method1757(var7, (byte)102):this.aClass133_Sub1_4547.method1755(var7 - var2, (byte)-52));
               Class121 var9 = var8.method875(-1567263040);
               int var10 = 1;
               if(var9 == Class121.aClass121_2126) {
                  var9 = var8.method870((byte)8);
                  var10 = var8.method871((short)23383);
               }

               switch(var9.anInt_2198 * -1963942023) {
               case 8:
               case 41:
               case 68:
               case 113:
                  var10 *= 3;
                  break;
               case 23:
               case 39:
               case 49:
               case 94:
                  var10 *= 2;
                  break;
               case 40:
               case 61:
               case 78:
               case 80:
                  var10 *= 4;
               case 42:
               case 106:
               case 110:
               case 114:
                  break;
               default:
                  var10 = 0;
               }

               int var11;
               if(var8.anIntArray_3247[var6] >= 0) {
                  var11 = var8.anIntArray_3247[var6] + var10;
                  if(var4 < var11) {
                     var4 = var11;
                  }
               }

               if(var8.anIntArray_3246[var6] >= 0) {
                  var11 = var8.anIntArray_3246[var6] + var10;
                  if(var12 < var11) {
                     var12 = var11;
                  }
               }
            }

            this.aFloatArrayArray_4548[0] = new float[var4 * 4];
            this.aFloatArrayArray_4548[1] = new float[var12 * 4];
            this.aBoolean_4549 = true;
            return true;
         }
      }
   }

   void method1603(int var1, ArrayViewport var2) {
      int var3 = var1 >> 16;
      int var4 = (var1 & '\uffff') * 4;
      System.arraycopy(var2.method4575(aFloatArray_4541), 0, this.aFloatArrayArray_4548[var3], var4, 8);
      this.aBooleanArray_4540[var3] = true;
   }

   Class125_Sub2(Renderer_Sub3_Sub2 var1, Class89 var2) {
      this.aBoolean_4549 = false;
      this.aFloatArrayArray_4548 = new float[2][];
      this.aBooleanArray_4540 = new boolean[2];
      this.aString_2351 = var2.aString_1802;
      if(var2.aString_1800 != null) {
         this.aString_2350 = var2.aString_1800;
         this.aByteArray_4544 = var1.method939(this.aString_2350);
      }

      if(var2.aString_1801 != null) {
         this.aString_2352 = var2.aString_1801;
         this.aByteArray_4545 = var1.method939(this.aString_2352);
      }

      var1.method7181(this);
   }

   Class125_Sub2(Renderer_Sub3_Sub2 var1, Class133_Sub1 var2, Class89 var3) {
      this(var1, var3);
      this.aRenderer_Sub3_Sub2_4543 = var1;
      this.aClass133_Sub1_4547 = var2;
   }

   void method1596(int var1, float var2, float var3, float var4, float var5) {
      int var6 = var1 >> 16;
      int var7 = (var1 & '\uffff') * 4;
      this.aFloatArrayArray_4548[var6][var7] = var2;
      this.aFloatArrayArray_4548[var6][var7 + 1] = var3;
      this.aFloatArrayArray_4548[var6][var7 + 2] = var4;
      this.aFloatArrayArray_4548[var6][var7 + 3] = var5;
      this.aBooleanArray_4540[var6] = true;
   }

   void method1587(Class240_Sub50_Sub1 var1, ArrayViewport var2) {
      int var3 = ((Class240_Sub50_Sub1_Sub1)var1).method2379();
      int var4 = ((Class240_Sub50_Sub1_Sub1)var1).method2381();
      if(var1.method875(-204003270) != Class121.aClass121_2168) {
         throw new IllegalArgumentException_Sub1(var1, "");
      } else {
         if(var3 >= 0) {
            this.method3478(var3, var2.method4571(aFloatArray_4541), 16);
         }

         if(var4 >= 0) {
            this.method3479(var4, var2.method4571(aFloatArray_4541), 16);
         }

      }
   }
}
