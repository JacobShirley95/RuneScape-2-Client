import jaggl.OpenGL;

public class Class161_Sub4 extends Class161 {

   boolean aBoolean_10748;
   static final float aFloat_10749 = 0.0F;
   static final int anInt_10750 = 128;
   static final int anInt_10751 = 24;
   static final float aFloat_10752 = 26.0F;
   static final float aFloat_10753 = -12.0F;
   boolean aBoolean_10754 = false;
   static final char aChar_10755 = '\u0000';
   static final char aChar_10756 = '\u0001';
   Class150 aClass150_10757;
   static final int anInt_10758 = 5;
   static final int anInt_10759 = 128;
   OGLTexture_Sub2[] anOGLTexture_Sub2Array_10760;


   boolean method1883() {
      return true;
   }

   void method7404() {
      this.aClass150_10757 = new Class150(this.aRenderer_Sub2_2792, 2);
      this.aClass150_10757.method1831(0);
      this.aRenderer_Sub2_2792.setTexture(1);
      OpenGL.glTexGeni(8192, 9472, '\u8511');
      OpenGL.glTexGeni(8193, 9472, '\u8511');
      OpenGL.glTexGeni(8194, 9472, '\u8511');
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glEnable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
      OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
      OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      OpenGL.glMatrixMode(5888);
      if(!this.aBoolean_10748) {
         this.aRenderer_Sub2_2792.setTexEnv(7681, 8448);
         this.aRenderer_Sub2_2792.method7020(0, '\u8578', 768);
         this.aRenderer_Sub2_2792.setTexture(2);
         this.aRenderer_Sub2_2792.setTexEnv(260, 7681);
         this.aRenderer_Sub2_2792.method7020(0, '\u8578', 768);
         this.aRenderer_Sub2_2792.method7020(1, '\u8578', 770);
         this.aRenderer_Sub2_2792.method7055(0, '\u8577', 770);
      } else {
         this.aRenderer_Sub2_2792.setTexEnv(260, 7681);
         this.aRenderer_Sub2_2792.method7020(0, 5890, 770);
         this.aRenderer_Sub2_2792.method7055(0, '\u8577', 770);
      }

      this.aRenderer_Sub2_2792.setTexture(0);
      this.aClass150_10757.method1830();
      this.aClass150_10757.method1831(1);
      this.aRenderer_Sub2_2792.setTexture(1);
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      OpenGL.glDisable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      if(!this.aBoolean_10748) {
         this.aRenderer_Sub2_2792.setTexEnv(8448, 8448);
         this.aRenderer_Sub2_2792.method7020(0, 5890, 768);
         this.aRenderer_Sub2_2792.setTexture(2);
         this.aRenderer_Sub2_2792.setTexEnv(8448, 8448);
         this.aRenderer_Sub2_2792.method7020(0, 5890, 768);
         this.aRenderer_Sub2_2792.method7020(1, '\u8578', 768);
         this.aRenderer_Sub2_2792.method7055(0, 5890, 770);
      } else {
         this.aRenderer_Sub2_2792.setTexEnv(8448, 8448);
         this.aRenderer_Sub2_2792.method7020(0, 5890, 768);
         this.aRenderer_Sub2_2792.method7055(0, 5890, 770);
      }

      this.aRenderer_Sub2_2792.setTexture(0);
      this.aClass150_10757.method1830();
   }

   void method1880(boolean var1) {
      if(this.aClass150_10757 != null && var1) {
         if(!this.aBoolean_10748) {
            this.aRenderer_Sub2_2792.setTexture(2);
            this.aRenderer_Sub2_2792.setTextureRenderer(this.aRenderer_Sub2_2792.anOGLTexture_Sub3_10425);
            this.aRenderer_Sub2_2792.setTexture(0);
         }

         this.aClass150_10757.method1832('\u0000');
         this.aBoolean_10754 = true;
      } else {
         this.aRenderer_Sub2_2792.method7055(0, '\u8578', 770);
      }

   }

   void method1884() {
      if(this.aBoolean_10754) {
         if(!this.aBoolean_10748) {
            this.aRenderer_Sub2_2792.setTexture(2);
            this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         }

         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         this.aRenderer_Sub2_2792.setTexture(0);
         this.aClass150_10757.method1832('\u0001');
         this.aBoolean_10754 = false;
      } else {
         this.aRenderer_Sub2_2792.method7055(0, 5890, 770);
      }

      this.aRenderer_Sub2_2792.setTexEnv(8448, 8448);
   }

   Class161_Sub4(OpenGLRenderer var1) {
      super(var1);
      if(var1.supportsTextureCubeMap) {
         byte[][] var2 = new byte[6][16384];
         byte[][] var3 = new byte[6][16384];
         byte[][] var4 = new byte[6][16384];
         int var5 = 0;
         GameCoord var6 = new GameCoord(0.0F, -1.0F, 0.0F);

         for(int var7 = 0; var7 < 128; ++var7) {
            for(int var8 = 0; var8 < 128; ++var8) {
               float var9 = 2.0F * (float)var8 / 128.0F - 1.0F;
               float var10 = 2.0F * (float)var7 / 128.0F - 1.0F;
               float var11 = (float)(1.0D / Math.sqrt((double)(var9 * var9 + 1.0F + var10 * var10)));
               var9 *= var11;
               var10 *= var11;

               for(int var12 = 0; var12 < 6; ++var12) {
                  GameCoord var13;
                  if(var12 == 0) {
                     var13 = new GameCoord(-var11, -var9, var10);
                  } else if(var12 == 1) {
                     var13 = new GameCoord(var11, var9, var10);
                  } else if(var12 == 2) {
                     var13 = new GameCoord(-var9, var10, -var11);
                  } else if(var12 == 3) {
                     var13 = new GameCoord(-var9, -var10, var11);
                  } else if(var12 == 4) {
                     var13 = new GameCoord(var9, var11, -var10);
                  } else {
                     var13 = new GameCoord(var9, -var11, var10);
                  }

                  float var14 = var13.method4319(var6);
                  var14 = Math.max(0.0F, Math.min(1.0F, var14));
                  int var15;
                  int var17;
                  int var16;
                  if(var14 > 0.0F) {
                     var15 = Math.min(255, (int)(Math.pow((double)var14, 128.0D) * 400.0D));
                     var16 = Math.min(255, (int)(Math.pow((double)var14, 24.0D) * 400.0D));
                     var17 = Math.min(255, (int)(Math.pow((double)var14, 5.0D) * 400.0D));
                  } else {
                     var17 = 0;
                     var16 = 0;
                     var15 = 0;
                  }

                  var3[var12][var5] = (byte)var15;
                  var4[var12][var5] = (byte)var16;
                  var2[var12][var5] = (byte)var17;
               }

               ++var5;
            }
         }

         this.anOGLTexture_Sub2Array_10760 = new OGLTexture_Sub2[3];
         this.anOGLTexture_Sub2Array_10760[0] = new OGLTexture_Sub2(this.aRenderer_Sub2_2792, Class136.aClass136_2626, Class87.aClass87_1759, 128, false, var3, Class136.aClass136_2626);
         this.anOGLTexture_Sub2Array_10760[1] = new OGLTexture_Sub2(this.aRenderer_Sub2_2792, Class136.aClass136_2626, Class87.aClass87_1759, 128, false, var4, Class136.aClass136_2626);
         this.anOGLTexture_Sub2Array_10760[2] = new OGLTexture_Sub2(this.aRenderer_Sub2_2792, Class136.aClass136_2626, Class87.aClass87_1759, 128, false, var2, Class136.aClass136_2626);
         this.method7404();
      }

   }

   void method1882(int var1, int var2) {
      if(this.aBoolean_10754) {
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer(this.anOGLTexture_Sub2Array_10760[var1 - 1]);
         this.aRenderer_Sub2_2792.setTexture(0);
      }

   }

   void method1881(boolean var1) {
      this.aRenderer_Sub2_2792.setTexEnv(8448, 7681);
   }

   void method1879(OGLTexture var1, int var2) {
      this.aRenderer_Sub2_2792.setTextureRenderer(var1);
      this.aRenderer_Sub2_2792.setTextureEnv(var2);
   }
}
