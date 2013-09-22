import jaggl.OpenGL;

public class OGLTexture_Sub2 extends OGLTexture {

   static final int anInt_8385 = 34071;
   static final int anInt_8386 = 34070;
   static final int anInt_8387 = 34073;
   static final int anInt_8388 = 34072;
   static final int anInt_8389 = 34069;
   static final int anInt_8390 = 34074;
   final int anInt_8391;


   OGLTexture_Sub2(OpenGLRenderer var1, Class136 var2, Class87 var3, int var4, boolean var5, int[][] var6) {
      super(var1, '\u8513', var2, var3, var4 * var4 * 6, var5);
      this.anInt_8391 = var4;
      this.renderer.setTextureRenderer(this);
      int var7;
      if(var5) {
         for(var7 = 0; var7 < 6; ++var7) {
            method1850('\u8515' + var7, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), var4, var4, '\u80e1', this.renderer.anInt_10454, var6[var7]);
         }
      } else {
         for(var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Di('\u8515' + var7, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), var4, var4, 0, '\u80e1', this.renderer.anInt_10454, var6[var7], 0);
         }
      }

      this.method1852(true);
   }

   OGLTexture_Sub2(OpenGLRenderer var1, Class136 var2, Class87 var3, int var4) {
      super(var1, '\u8513', var2, var3, var4 * var4 * 6, false);
      this.anInt_8391 = var4;
      this.renderer.setTextureRenderer(this);

      for(int var5 = 0; var5 < 6; ++var5) {
         OpenGL.glTexImage2Dub('\u8515' + var5, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), var4, var4, 0, OpenGLRenderer.method7046(this.aClass136_2756), 5121, (byte[])null, 0);
      }

      this.method1852(true);
   }

   Class101 method5431(int var1, int var2) {
      return new Class152(this, var1, var2);
   }

   OGLTexture_Sub2(OpenGLRenderer var1, Class136 var2, Class87 var3, int var4, boolean var5, byte[][] var6, Class136 var7) {
      super(var1, '\u8513', var2, var3, var4 * var4 * 6, var5);
      this.anInt_8391 = var4;
      this.renderer.setTextureRenderer(this);

      for(int var8 = 0; var8 < 6; ++var8) {
         OpenGL.glTexImage2Dub('\u8515' + var8, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), var4, var4, 0, OpenGLRenderer.method7046(var7), 5121, var6[var8], 0);
      }

      this.method1852(true);
   }
}
