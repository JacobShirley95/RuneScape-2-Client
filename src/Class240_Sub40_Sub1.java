import jaggl.OpenGL;

public class Class240_Sub40_Sub1 extends Class240_Sub40 {

   static float aFloat_1491 = 0.25F;
   static final String aString_1492 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
   static float aFloat_1493 = 1.0F;
   static float aFloat_1494 = 1.0F;
   OGLTexture_Sub3[] anOGLTexture_Sub3Array_1495;
   static final String aString_1496 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
   int anInt_1497;
   static final String aString_1498 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n";
   Class174_Sub1_Sub2 aClass174_Sub1_Sub2_1499;
   Class174_Sub1_Sub2 aClass174_Sub1_Sub2_1500;
   OGLTexture_Sub3 anOGLTexture_Sub3_1501;
   OGLTexture_Sub3 anOGLTexture_Sub3_1502;
   Class148 aClass148_1503;
   static final int anInt_1504 = 256;
   int anInt_1505;
   int anInt_1506;
   int anInt_1507;
   Class148 aClass148_1508;
   static final String aString_1509 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
   Class148 aClass148_1510;
   Class148 aClass148_1511;


   boolean method1027() {
      return this.aRenderer_Sub2_7559.supportsFrameBuffer && this.aRenderer_Sub2_7559.supportsFragmentShader && this.aRenderer_Sub2_7559.supportsTextureFloat;
   }

   boolean method4916() {
      return this.aClass174_Sub1_Sub2_1499 != null;
   }

   Class87 method4920() {
      return Class87.aClass87_1766;
   }

   void method4924(int var1, OGLTexture_Sub3 var2, OGLTexture_Sub3 var3) {
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      int var4;
      int var5;
      if(this.anOGLTexture_Sub3Array_1495 != null) {
         this.aRenderer_Sub2_7559.method1901(this.aClass174_Sub1_Sub2_1500, 1432127650);
         var4 = Class234.method3016(this.anInt_1497, (byte)61);
         var5 = Class234.method3016(this.anInt_1505, (byte)12);

         int var6;
         for(var6 = 0; var4 > 256 || var5 > 256; ++var6) {
            OpenGL.glViewport(0, 0, var4, var5);
            this.aClass174_Sub1_Sub2_1500.method7327(0, this.anOGLTexture_Sub3Array_1495[var6].method5446(0));
            if(var6 == 0) {
               this.aRenderer_Sub2_7559.setTextureRenderer(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)this.anInt_1497, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)this.anInt_1497, (float)this.anInt_1505);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.anInt_1505);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               this.aRenderer_Sub2_7559.setTextureRenderer(this.anOGLTexture_Sub3Array_1495[var6 - 1]);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            }

            if(var4 > 256) {
               var4 >>= 1;
            }

            if(var5 > 256) {
               var5 >>= 1;
            }
         }

         this.aRenderer_Sub2_7559.method1902(this.aClass174_Sub1_Sub2_1500, 1335859965);
         this.aRenderer_Sub2_7559.setTextureRenderer(this.anOGLTexture_Sub3Array_1495[var6 - 1]);
         this.aRenderer_Sub2_7559.method1901(this.aClass174_Sub1_Sub2_1499, 1820311756);
         this.aClass174_Sub1_Sub2_1499.method1242(0);
         OpenGL.glViewport(0, 0, 256, 256);
         int var7 = this.aClass148_1510.anInt_2719;
         OpenGL.glUseProgram(var7);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var7, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var7, "params"), aFloat_1494, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         this.aRenderer_Sub2_7559.setTextureRenderer(var2);
         this.aRenderer_Sub2_7559.method1901(this.aClass174_Sub1_Sub2_1499, 687143576);
         this.aClass174_Sub1_Sub2_1499.method1242(0);
         OpenGL.glViewport(0, 0, 256, 256);
         var4 = this.aClass148_1511.anInt_2719;
         OpenGL.glUseProgram(var4);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "params"), aFloat_1494, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)this.anInt_1497, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)this.anInt_1497, (float)this.anInt_1505);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)this.anInt_1505);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      this.aClass174_Sub1_Sub2_1499.method1242(1);
      this.aRenderer_Sub2_7559.setTextureRenderer(this.anOGLTexture_Sub3_1501);
      var4 = this.aClass148_1503.anInt_2719;
      OpenGL.glUseProgram(var4);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      this.aClass174_Sub1_Sub2_1499.method1242(0);
      this.aRenderer_Sub2_7559.setTextureRenderer(this.anOGLTexture_Sub3_1502);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      this.aRenderer_Sub2_7559.method1902(this.aClass174_Sub1_Sub2_1499, 2124695490);
      var5 = this.aClass148_1508.anInt_2719;
      OpenGL.glUseProgram(var5);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var5, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var5, "params"), aFloat_1491, aFloat_1493, 0.0F);
      this.aRenderer_Sub2_7559.setTexture(1);
      this.aRenderer_Sub2_7559.setTextureRenderer(this.anOGLTexture_Sub3_1501);
      this.aRenderer_Sub2_7559.setTexture(0);
      this.aRenderer_Sub2_7559.setTextureRenderer(var2);
   }

   boolean method4917() {
      if(this.aRenderer_Sub2_7559.supportsFrameBuffer && this.aRenderer_Sub2_7559.supportsFragmentShader && this.aRenderer_Sub2_7559.supportsTextureFloat) {
         this.aClass174_Sub1_Sub2_1499 = new Class174_Sub1_Sub2(this.aRenderer_Sub2_7559);
         this.anOGLTexture_Sub3_1501 = new OGLTexture_Sub3(this.aRenderer_Sub2_7559, 3553, Class136.aClass136_2625, Class87.aClass87_1766, 256, 256);
         this.anOGLTexture_Sub3_1501.method5442(false, false);
         this.anOGLTexture_Sub3_1502 = new OGLTexture_Sub3(this.aRenderer_Sub2_7559, 3553, Class136.aClass136_2625, Class87.aClass87_1766, 256, 256);
         this.anOGLTexture_Sub3_1502.method5442(false, false);
         this.aRenderer_Sub2_7559.method1901(this.aClass174_Sub1_Sub2_1499, 1404062410);
         this.aClass174_Sub1_Sub2_1499.method7327(0, this.anOGLTexture_Sub3_1501.method5446(0));
         this.aClass174_Sub1_Sub2_1499.method7327(1, this.anOGLTexture_Sub3_1502.method5446(0));
         this.aClass174_Sub1_Sub2_1499.method1242(0);
         if(!this.aClass174_Sub1_Sub2_1499.method7330()) {
            this.aRenderer_Sub2_7559.method1902(this.aClass174_Sub1_Sub2_1499, -26075776);
            return false;
         } else {
            this.aRenderer_Sub2_7559.method1902(this.aClass174_Sub1_Sub2_1499, 1516271808);
            this.aClass148_1511 = Class148.method1826(this.aRenderer_Sub2_7559, new Class151[]{Class151.method1833(this.aRenderer_Sub2_7559, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.aClass148_1510 = Class148.method1826(this.aRenderer_Sub2_7559, new Class151[]{Class151.method1833(this.aRenderer_Sub2_7559, '\u8b30', "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")});
            this.aClass148_1508 = Class148.method1826(this.aRenderer_Sub2_7559, new Class151[]{Class151.method1833(this.aRenderer_Sub2_7559, '\u8b30', "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")});
            this.aClass148_1503 = Class148.method1826(this.aRenderer_Sub2_7559, new Class151[]{Class151.method1833(this.aRenderer_Sub2_7559, '\u8b30', "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")});
            return this.aClass148_1510 != null && this.aClass148_1511 != null && this.aClass148_1508 != null && this.aClass148_1503 != null;
         }
      } else {
         return false;
      }
   }

   Class240_Sub40_Sub1(OpenGLRenderer var1) {
      super(var1);
   }

   void method4919(int var1, int var2) {
      this.anInt_1497 = var1;
      this.anInt_1505 = var2;
      int var3 = Class234.method3016(this.anInt_1497, (byte)50);
      int var4 = Class234.method3016(this.anInt_1505, (byte)40);
      if(this.anInt_1506 != var3 || this.anInt_1507 != var4) {
         int var5;
         if(this.anOGLTexture_Sub3Array_1495 != null) {
            for(var5 = 0; var5 < this.anOGLTexture_Sub3Array_1495.length; ++var5) {
               this.anOGLTexture_Sub3Array_1495[var5].unloadTextures();
            }

            this.anOGLTexture_Sub3Array_1495 = null;
         }

         if(var3 <= 256 && var4 <= 256) {
            this.aClass174_Sub1_Sub2_1500 = null;
         } else {
            var5 = var3;
            int var6 = var4;

            int var7;
            for(var7 = 0; var5 > 256 || var6 > 256; ++var7) {
               if(var5 > 256) {
                  var5 >>= 1;
               }

               if(var6 > 256) {
                  var6 >>= 1;
               }
            }

            if(this.aClass174_Sub1_Sub2_1500 == null) {
               this.aClass174_Sub1_Sub2_1500 = new Class174_Sub1_Sub2(this.aRenderer_Sub2_7559);
            }

            this.anOGLTexture_Sub3Array_1495 = new OGLTexture_Sub3[var7];
            var5 = var3;
            var6 = var4;
            var7 = 0;

            while(var5 > 256 || var6 > 256) {
               this.anOGLTexture_Sub3Array_1495[var7++] = new OGLTexture_Sub3(this.aRenderer_Sub2_7559, 3553, Class136.aClass136_2625, Class87.aClass87_1766, var5, var6);
               if(var5 > 256) {
                  var5 >>= 1;
               }

               if(var6 > 256) {
                  var6 >>= 1;
               }
            }
         }

         this.anInt_1506 = var3;
         this.anInt_1507 = var4;
      }

   }

   void method4918(int var1) {
      OpenGL.glUseProgram(0);
      this.aRenderer_Sub2_7559.setTexture(1);
      this.aRenderer_Sub2_7559.setTextureRenderer((OGLTexture)null);
      this.aRenderer_Sub2_7559.setTexture(0);
   }

   void method4922() {
      this.anInt_1507 = -1;
      this.anInt_1506 = -1;
      this.aClass174_Sub1_Sub2_1500 = null;
      this.anOGLTexture_Sub3Array_1495 = null;
      this.aClass174_Sub1_Sub2_1499 = null;
      this.anOGLTexture_Sub3_1501 = null;
      this.anOGLTexture_Sub3_1502 = null;
      this.aClass148_1511 = null;
      this.aClass148_1510 = null;
      this.aClass148_1508 = null;
      this.aClass148_1503 = null;
   }
}
