import jaggl.OpenGL;

public class OGLTexture_Sub3 extends OGLTexture {

   final int anInt_8398;
   final int anInt_8399;


   OGLTexture_Sub3(OpenGLRenderer var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, Class136.aClass136_2627, Class87.aClass87_1759, var5 * var6, false);
      this.anInt_8398 = var5;
      this.anInt_8399 = var6;
      this.renderer.setTextureRenderer(this);
      DrawingTarget var7 = this.renderer.method1896(1029452643);
      if(var7 != null) {
         int var8 = var7.method2198() - (var4 + var6);
         int var9 = OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759);
         OpenGL.glCopyTexImage2D(this.texSubDubTexture, 0, var9, var3, var8, var5, var6, 0);
      }

      this.method1852(true);
   }

   OGLTexture_Sub3(OpenGLRenderer var1, int var2, int var3, int var4, boolean var5, int[] var6, int var7, int var8, boolean var9) {
      super(var1, var2, Class136.aClass136_2625, Class87.aClass87_1759, var3 * var4, var5);
      this.anInt_8398 = var3;
      this.anInt_8399 = var4;
      if(var9) {
         int[] var10 = new int[var6.length];

         for(int var11 = 0; var11 < var4; ++var11) {
            int var12 = var11 * var3;
            int var13 = (var4 - var11 - 1) * var3;

            for(int var14 = 0; var14 < var3; ++var14) {
               var10[var12++] = var6[var13++];
            }
         }

         var6 = var10;
      }

      this.renderer.setTextureRenderer(this);
      if(this.texSubDubTexture != '\u84f5' && var5 && var7 == 0 && var8 == 0) {
         method1850(this.texSubDubTexture, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), this.anInt_8398, this.anInt_8399, '\u80e1', this.renderer.anInt_10454, var6);
         this.method1846(true);
      } else {
         OpenGL.glPixelStorei(3314, var7);
         OpenGL.glTexImage2Di(this.texSubDubTexture, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), this.anInt_8398, this.anInt_8399, 0, '\u80e1', this.renderer.anInt_10454, var6, var8 * 4);
         OpenGL.glPixelStorei(3314, 0);
         this.method1846(false);
      }

      this.method1852(true);
   }

   OGLTexture_Sub3(OpenGLRenderer var1, int var2, Class136 var3, Class87 var4, int var5, int var6, boolean var7, float[] var8, Class136 var9) {
      super(var1, var2, var3, var4, var5 * var6, var7);
      this.anInt_8398 = var5;
      this.anInt_8399 = var6;
      this.renderer.setTextureRenderer(this);
      if(var7 && this.texSubDubTexture != '\u84f5') {
         method1844(var2, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), var5, var6, var9, var8);
         this.method1846(true);
      } else {
         OpenGL.glTexImage2Df(this.texSubDubTexture, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), this.anInt_8398, this.anInt_8399, 0, OpenGLRenderer.method7046(var9), 5126, var8, 0);
         this.method1846(false);
      }

      this.method1852(true);
   }

   void method5442(boolean var1, boolean var2) {
      if(this.texSubDubTexture == 3553) {
         this.renderer.setTextureRenderer(this);
         OpenGL.glTexParameteri(this.texSubDubTexture, 10242, var1?10497:'\u812f');
         OpenGL.glTexParameteri(this.texSubDubTexture, 10243, var2?10497:'\u812f');
      }

   }

   void method5443(int var1, int var2, int var3, int var4, byte[] var5, Class136 var6, int var7, int var8, boolean var9) {
      if(var8 == 0) {
         var8 = var3;
      }

      if(var9) {
         int var10 = var6.anInt_2624 * 191693721;
         int var11 = var10 * var3;
         int var12 = var10 * var8;
         byte[] var13 = new byte[var11 * var4];

         for(int var14 = 0; var14 < var4; ++var14) {
            int var15 = var14 * var11;
            int var16 = (var4 - var14 - 1) * var12 + var7;

            for(int var17 = 0; var17 < var11; ++var17) {
               var13[var15++] = var5[var16++];
            }
         }

         var5 = var13;
      }

      this.renderer.setTextureRenderer(this);
      OpenGL.glPixelStorei(3317, 1);
      if(var8 != var3) {
         OpenGL.glPixelStorei(3314, var8);
      }

      OpenGL.glTexSubImage2Dub(this.texSubDubTexture, 0, var1, this.anInt_8399 - var2 - var4, var3, var4, OpenGLRenderer.method7046(var6), 5121, var5, var7);
      if(var8 != var3) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   void method5444(int var1, int var2, int var3, int var4, int var5, int var6) {
      DrawingTarget var7 = this.renderer.method1896(934637300);
      if(var7 != null) {
         int var8 = var7.method2198() - (var6 + var4);
         this.renderer.setTextureRenderer(this);
         OpenGL.glCopyTexSubImage2D(this.texSubDubTexture, 0, var1, this.anInt_8399 - (var2 + var4), var5, var8, var3, var4);
         OpenGL.glFlush();
      }

   }

   Class99 method5445(int var1) {
      return new Class186(this, var1);
   }

   Class101 method5446(int var1) {
      return new Class186(this, var1);
   }

   OGLTexture_Sub3(OpenGLRenderer var1, int var2, Class136 var3, Class87 var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5 * var6, false);
      this.anInt_8398 = var5;
      this.anInt_8399 = var6;
      this.renderer.setTextureRenderer(this);
      OpenGL.glTexImage2Dub(this.texSubDubTexture, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), var5, var6, 0, OpenGLRenderer.method7046(this.aClass136_2756), 5121, (byte[])null, 0);
      this.method1852(true);
   }

   void method5447(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7, boolean var8) {
      if(var7 == 0) {
         var7 = var3;
      }

      if(var8) {
         int[] var9 = new int[var3 * var4];

         for(int var10 = 0; var10 < var4; ++var10) {
            int var11 = var10 * var3;
            int var12 = (var4 - var10 - 1) * var7 + var6;

            for(int var13 = 0; var13 < var3; ++var13) {
               var9[var11++] = var5[var12++];
            }
         }

         var5 = var9;
      }

      this.renderer.setTextureRenderer(this);
      if(var3 != var7) {
         OpenGL.glPixelStorei(3314, var7);
      }

      OpenGL.glTexSubImage2Di(this.texSubDubTexture, 0, var1, this.anInt_8399 - var2 - var4, var3, var4, '\u80e1', this.renderer.anInt_10454, var5, var6);
      if(var3 != var7) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   OGLTexture_Sub3(OpenGLRenderer var1, int var2, Class136 var3, Class87 var4, int var5, int var6, boolean var7, byte[] var8, Class136 var9, boolean var10) {
      super(var1, var2, var3, var4, var5 * var6, var7);
      this.anInt_8398 = var5;
      this.anInt_8399 = var6;
      if(var10) {
         byte[] var11 = new byte[var8.length];

         for(int var12 = 0; var12 < var6; ++var12) {
            int var13 = var12 * var5;
            int var14 = (var6 - var12 - 1) * var5;

            for(int var15 = 0; var15 < var5; ++var15) {
               var11[var13++] = var8[var14++];
            }
         }

         var8 = var11;
      }

      this.renderer.setTextureRenderer(this);
      OpenGL.glPixelStorei(3317, 1);
      if(var7 && this.texSubDubTexture != '\u84f5') {
         method1847(var2, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), var5, var6, var9, var8);
         this.method1846(true);
      } else {
         OpenGL.glTexImage2Dub(this.texSubDubTexture, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), this.anInt_8398, this.anInt_8399, 0, OpenGLRenderer.method7046(var9), 5121, var8, 0);
         this.method1846(false);
      }

      OpenGL.glPixelStorei(3317, 4);
      this.method1852(true);
   }
}
