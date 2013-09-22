import jaggl.OpenGL;

public abstract class OGLTexture {

   static final int anInt_2747 = 3552;
   boolean aBoolean_2748 = false;
   static final int anInt_2749 = 34037;
   static final int anInt_2750 = 34067;
   static final int anInt_2751 = 32879;
   static final int anInt_2752 = 3553;
   final OpenGLRenderer renderer;
   int loadedTexture;
   final int texSubDubTexture;
   final Class136 aClass136_2756;
   static final int anInt_2757 = 5121;
   boolean aBoolean_2758;
   final Class87 aClass87_2759;
   final int anInt_2760;
   static final int[] textures = new int[1];


   void unloadTextures() {
      if(this.loadedTexture > 0) {
         this.renderer.anInt_10347 -= this.method1849();
         int[] var1 = new int[]{this.loadedTexture};
         OpenGL.glDeleteTextures(1, var1, 0);
         this.loadedTexture = 0;
      }

   }

   static void method1844(int var0, int var1, int var2, int var3, Class136 var4, float[] var5) {
      if(var2 > 0 && !Animator.method5897(var2, (byte)37)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Animator.method5897(var3, (byte)85)) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = var4.anInt_2624 * 191693721;
         int var7 = 0;
         int var8 = var2 < var3?var2:var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         float[] var11 = var5;
         float[] var12 = new float[var9 * var10 * var6];

         while(true) {
            OpenGL.glTexImage2Df(var0, var7, var1, var2, var3, 0, OpenGLRenderer.method7046(var4), 5126, var11, 0);
            if(var8 <= 1) {
               return;
            }

            int var13 = var2 * var6;

            for(int var14 = 0; var14 < var6; ++var14) {
               int var15 = var14;
               int var16 = var14;
               int var17 = var14 + var13;

               for(int var18 = 0; var18 < var10; ++var18) {
                  for(int var19 = 0; var19 < var9; ++var19) {
                     float var20 = var11[var16];
                     var16 += var6;
                     var20 += var11[var16];
                     var16 += var6;
                     var20 += var11[var17];
                     var17 += var6;
                     var20 += var11[var17];
                     var17 += var6;
                     var12[var15] = var20 * 0.25F;
                     var15 += var6;
                  }

                  var16 += var13;
                  var17 += var13;
               }
            }

            float[] var21 = var12;
            var12 = var11;
            var11 = var21;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   boolean method1845() {
      if(this.renderer.supportsFrameBuffer) {
         int var1 = this.method1849();
         this.renderer.setTextureRenderer(this);
         OpenGL.glGenerateMipmapEXT(this.texSubDubTexture);
         this.aBoolean_2758 = true;
         this.method1853();
         this.method1848(var1);
         return true;
      } else {
         return false;
      }
   }

   void method1846(boolean var1) {
      if(this.aBoolean_2758 != var1) {
         int var2 = this.method1849();
         this.aBoolean_2758 = true;
         this.method1853();
         this.method1848(var2);
      }

   }

   static void method1847(int var0, int var1, int var2, int var3, Class136 var4, byte[] var5) {
      if(var2 > 0 && !Animator.method5897(var2, (byte)72)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Animator.method5897(var3, (byte)50)) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = var4.anInt_2624 * 191693721;
         int var7 = 0;
         int var8 = var2 < var3?var2:var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         byte[] var11 = var5;
         byte[] var12 = new byte[var9 * var10 * var6];

         while(true) {
            OpenGL.glTexImage2Dub(var0, var7, var1, var2, var3, 0, OpenGLRenderer.method7046(var4), 5121, var11, 0);
            if(var8 <= 1) {
               return;
            }

            int var13 = var2 * var6;

            for(int var14 = 0; var14 < var6; ++var14) {
               int var15 = var14;
               int var16 = var14;
               int var17 = var14 + var13;

               for(int var18 = 0; var18 < var10; ++var18) {
                  for(int var19 = 0; var19 < var9; ++var19) {
                     byte var20 = var11[var16];
                     var16 += var6;
                     int var22 = var20 + var11[var16];
                     var16 += var6;
                     var22 += var11[var17];
                     var17 += var6;
                     var22 += var11[var17];
                     var17 += var6;
                     var12[var15] = (byte)(var22 >> 2);
                     var15 += var6;
                  }

                  var16 += var13;
                  var17 += var13;
               }
            }

            byte[] var21 = var12;
            var12 = var11;
            var11 = var21;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   void method1848(int var1) {
      this.renderer.anInt_10347 -= var1;
      this.renderer.anInt_10347 += this.method1849();
   }

   int method1849() {
      int var1 = this.aClass136_2756.anInt_2624 * 191693721 * this.aClass87_2759.anInt_1764 * -151363651 * this.anInt_2760;
      return this.aBoolean_2758?var1 * 4 / 3:var1;
   }

   static void method1850(int var0, int var1, int var2, int var3, int var4, int var5, int[] var6) {
      if(var2 > 0 && !Animator.method5897(var2, (byte)100)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Animator.method5897(var3, (byte)22)) {
         throw new IllegalArgumentException("");
      } else if(var4 != '\u80e1') {
         throw new IllegalArgumentException("");
      } else {
         int var7 = 0;
         int var8 = var2 < var3?var2:var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         int[] var11 = var6;
         int[] var12 = new int[var9 * var10];

         while(true) {
            OpenGL.glTexImage2Di(var0, var7, var1, var2, var3, 0, var4, var5, var11, 0);
            if(var8 <= 1) {
               return;
            }

            int var13 = 0;
            int var14 = 0;
            int var15 = var14 + var2;

            for(int var16 = 0; var16 < var10; ++var16) {
               for(int var17 = 0; var17 < var9; ++var17) {
                  int var18 = var11[var14++];
                  int var19 = var11[var14++];
                  int var20 = var11[var15++];
                  int var21 = var11[var15++];
                  int var22 = var18 >> 24 & 255;
                  int var23 = var18 >> 16 & 255;
                  int var24 = var18 >> 8 & 255;
                  int var25 = var18 & 255;
                  var22 += var19 >> 24 & 255;
                  var23 += var19 >> 16 & 255;
                  var24 += var19 >> 8 & 255;
                  var25 += var19 & 255;
                  var22 += var20 >> 24 & 255;
                  var23 += var20 >> 16 & 255;
                  var24 += var20 >> 8 & 255;
                  var25 += var20 & 255;
                  var22 += var21 >> 24 & 255;
                  var23 += var21 >> 16 & 255;
                  var24 += var21 >> 8 & 255;
                  var25 += var21 & 255;
                  var12[var13++] = (var22 & 1020) << 22 | (var23 & 1020) << 14 | (var24 & 1020) << 6 | (var25 & 1020) >> 2;
               }

               var14 += var2;
               var15 += var2;
            }

            int[] var26 = var12;
            var12 = var11;
            var11 = var26;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   void method1851() {
      if(this.loadedTexture > 0) {
         this.renderer.method7035(this.loadedTexture, this.method1849());
         this.loadedTexture = 0;
      }

   }

   void method1852(boolean var1) {
      if(this.aBoolean_2748 != var1) {
         this.aBoolean_2748 = var1;
         this.method1853();
      }

   }

   public void finalize() throws Throwable {
      this.method1851();
      super.finalize();
   }

   OGLTexture(OpenGLRenderer var1, int var2, Class136 var3, Class87 var4, int var5, boolean var6) {
      this.renderer = var1;
      this.texSubDubTexture = var2;
      this.aClass136_2756 = var3;
      this.aClass87_2759 = var4;
      this.aBoolean_2758 = var6;
      this.anInt_2760 = var5;
      OpenGL.glGenTextures(1, textures, 0);
      this.loadedTexture = textures[0];
      this.method1848(0);
   }

   void method1853() {
      this.renderer.setTextureRenderer(this);
      if(this.aBoolean_2748) {
         OpenGL.glTexParameteri(this.texSubDubTexture, 10241, this.aBoolean_2758?9987:9729);
         OpenGL.glTexParameteri(this.texSubDubTexture, 10240, 9729);
      } else {
         OpenGL.glTexParameteri(this.texSubDubTexture, 10241, this.aBoolean_2758?9984:9728);
         OpenGL.glTexParameteri(this.texSubDubTexture, 10240, 9728);
      }

   }
}
