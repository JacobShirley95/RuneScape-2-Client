import jaggl.OpenGL;

public abstract class Class294 implements Class403 {

   final OpenGLRenderer_Sub1 aRenderer_Sub3_Sub1_5924;
   static final int anInt_5925 = 3553;
   int texture;
   static final int anInt_5927 = 34037;
   static final int anInt_5928 = 32879;
   static final int anInt_5929 = 0;
   static final int anInt_5930 = 34067;
   Class389 aClass389_5931;
   final Class136 aClass136_5932;
   final Class87 aClass87_5933;
   boolean aBoolean_5934;
   final int textureTarget;
   final int anInt_5936;
   static final int[] textures = new int[1];


   public void method4977(Class389 var1) {
      if(this.aClass389_5931 != var1) {
         this.aClass389_5931 = var1;
         this.method3724();
      }

   }

   void method3724() {
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      if(this.aClass389_5931 == Class389.aClass389_7495) {
         OpenGL.glTexParameteri(this.textureTarget, 10241, this.aBoolean_5934?9987:9729);
         OpenGL.glTexParameteri(this.textureTarget, 10240, 9729);
      } else {
         OpenGL.glTexParameteri(this.textureTarget, 10241, this.aBoolean_5934?9984:9728);
         OpenGL.glTexParameteri(this.textureTarget, 10240, 9728);
      }

   }

   void method3725(int var1, int var2, int var3, int[] var4) {
      if(var2 > 0 && !Animator.method5897(var2, (byte)111)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Animator.method5897(var3, (byte)95)) {
         throw new IllegalArgumentException("");
      } else if(this.aClass136_5932 != Class136.aClass136_2625) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = 0;
         int var6 = var2 < var3?var2:var3;
         int var7 = var2 >> 1;
         int var8 = var3 >> 1;
         int[] var9 = var4;
         int[] var10 = new int[var7 * var8];

         while(true) {
            OpenGL.glTexImage2Di(var1, var5, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var2, var3, 0, '\u80e1', this.aRenderer_Sub3_Sub1_5924.anInt_1336, var9, 0);
            if(var6 <= 1) {
               return;
            }

            int var11 = 0;
            int var12 = 0;
            int var13 = var12 + var2;

            for(int var14 = 0; var14 < var8; ++var14) {
               for(int var15 = 0; var15 < var7; ++var15) {
                  int var16 = var9[var12++];
                  int var17 = var9[var12++];
                  int var18 = var9[var13++];
                  int var19 = var9[var13++];
                  int var20 = var16 >> 24 & 255;
                  int var21 = var16 >> 16 & 255;
                  int var22 = var16 >> 8 & 255;
                  int var23 = var16 & 255;
                  var20 += var17 >> 24 & 255;
                  var21 += var17 >> 16 & 255;
                  var22 += var17 >> 8 & 255;
                  var23 += var17 & 255;
                  var20 += var18 >> 24 & 255;
                  var21 += var18 >> 16 & 255;
                  var22 += var18 >> 8 & 255;
                  var23 += var18 & 255;
                  var20 += var19 >> 24 & 255;
                  var21 += var19 >> 16 & 255;
                  var22 += var19 >> 8 & 255;
                  var23 += var19 & 255;
                  var10[var11++] = (var20 & 1020) << 22 | (var21 & 1020) << 14 | (var22 & 1020) << 6 | (var23 & 1020) >> 2;
               }

               var12 += var2;
               var13 += var2;
            }

            int[] var24 = var10;
            var10 = var9;
            var9 = var24;
            var2 = var7;
            var3 = var8;
            var7 >>= 1;
            var8 >>= 1;
            var6 >>= 1;
            ++var5;
         }
      }
   }

   void method3726(int var1, int var2, int var3, byte[] var4) {
      if(var2 > 0 && !Animator.method5897(var2, (byte)26)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Animator.method5897(var3, (byte)125)) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = this.aClass136_5932.anInt_2624 * 191693721;
         int var6 = 0;
         int var7 = var2 < var3?var2:var3;
         int var8 = var2 >> 1;
         int var9 = var3 >> 1;
         byte[] var10 = var4;
         byte[] var11 = new byte[var8 * var9 * var5];

         while(true) {
            OpenGL.glTexImage2Dub(var1, var6, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var2, var3, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), 5121, var10, 0);
            if(var7 <= 1) {
               return;
            }

            int var12 = var2 * var5;

            for(int var13 = 0; var13 < var5; ++var13) {
               int var14 = var13;
               int var15 = var13;
               int var16 = var13 + var12;

               for(int var17 = 0; var17 < var9; ++var17) {
                  for(int var18 = 0; var18 < var8; ++var18) {
                     byte var19 = var10[var15];
                     var15 += var5;
                     int var21 = var19 + var10[var15];
                     var15 += var5;
                     var21 += var10[var16];
                     var16 += var5;
                     var21 += var10[var16];
                     var16 += var5;
                     var11[var14] = (byte)(var21 >> 2);
                     var14 += var5;
                  }

                  var15 += var12;
                  var16 += var12;
               }
            }

            byte[] var20 = var11;
            var11 = var10;
            var10 = var20;
            var2 = var8;
            var3 = var9;
            var8 >>= 1;
            var9 >>= 1;
            var7 >>= 1;
            ++var6;
         }
      }
   }

   public void finalize() throws Throwable {
      this.method4978();
      super.finalize();
   }

   int method3727() {
      int var1 = this.aClass136_5932.anInt_2624 * 191693721 * this.aClass87_5933.anInt_1764 * -151363651 * this.anInt_5936;
      return this.aBoolean_5934?var1 * 4 / 3:var1;
   }

   public void method4976() {
      int var1 = this.aRenderer_Sub3_Sub1_5924.method7223();
      int var2 = this.aRenderer_Sub3_Sub1_5924.anIntArray_1343[var1];
      if(var2 != this.textureTarget) {
         if(var2 != 0) {
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
         }

         OpenGL.glEnable(this.textureTarget);
         this.aRenderer_Sub3_Sub1_5924.anIntArray_1343[var1] = this.textureTarget;
      }

      OpenGL.glBindTexture(this.textureTarget, this.texture);
   }

   void method3729(int var1, int var2, int var3, float[] var4) {
      if(var2 > 0 && !Animator.method5897(var2, (byte)86)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Animator.method5897(var3, (byte)126)) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = this.aClass136_5932.anInt_2624 * 191693721;
         int var6 = 0;
         int var7 = var2 < var3?var2:var3;
         int var8 = var2 >> 1;
         int var9 = var3 >> 1;
         float[] var10 = var4;
         float[] var11 = new float[var8 * var9 * var5];

         while(true) {
            OpenGL.glTexImage2Df(var1, var6, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var2, var3, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), 5126, var10, 0);
            if(var7 <= 1) {
               return;
            }

            int var12 = var2 * var5;

            for(int var13 = 0; var13 < var5; ++var13) {
               int var14 = var13;
               int var15 = var13;
               int var16 = var13 + var12;

               for(int var17 = 0; var17 < var9; ++var17) {
                  for(int var18 = 0; var18 < var8; ++var18) {
                     float var19 = var10[var15];
                     var15 += var5;
                     var19 += var10[var15];
                     var15 += var5;
                     var19 += var10[var16];
                     var16 += var5;
                     var19 += var10[var16];
                     var16 += var5;
                     var11[var14] = var19 * 0.25F;
                     var14 += var5;
                  }

                  var15 += var12;
                  var16 += var12;
               }
            }

            float[] var20 = var11;
            var11 = var10;
            var10 = var20;
            var2 = var8;
            var3 = var9;
            var8 >>= 1;
            var9 >>= 1;
            var7 >>= 1;
            ++var6;
         }
      }
   }

   void method3730(int var1) {
      this.aRenderer_Sub3_Sub1_5924.anInt_10514 -= var1;
      this.aRenderer_Sub3_Sub1_5924.anInt_10514 += this.method3727();
   }

   public void method4978() {
      if(this.texture > 0) {
         this.aRenderer_Sub3_Sub1_5924.method770(this.texture, this.method3727());
         this.texture = 0;
      }

   }

   Class294(OpenGLRenderer_Sub1 var1, int var2, Class136 var3, Class87 var4, int var5, boolean var6) {
      this.aClass389_5931 = Class389.aClass389_7495;
      this.aRenderer_Sub3_Sub1_5924 = var1;
      this.textureTarget = var2;
      this.aClass136_5932 = var3;
      this.aClass87_5933 = var4;
      this.aBoolean_5934 = var6;
      this.anInt_5936 = var5;
      OpenGL.glGenTextures(1, textures, 0);
      this.texture = textures[0];
      this.method3724();
      this.method3730(0);
   }

   boolean method3732() {
      int var1 = this.method3727();
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glGenerateMipmapEXT(this.textureTarget);
      this.aBoolean_5934 = true;
      this.method3724();
      this.method3730(var1);
      return true;
   }
}
