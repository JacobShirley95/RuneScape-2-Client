import jaggl.OpenGL;

public class Class145 {

   Class148 aClass148_2693;
   final OpenGLRenderer aRenderer_Sub2_2694;
   static final String aString_2695 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";


   boolean method1816(OGL3DTexture var1, OGL3DTexture var2, float var3) {
      if(!this.method1817()) {
         return false;
      } else {
         Class174_Sub1_Sub2 var4 = this.aRenderer_Sub2_2694.aClass174_Sub1_Sub2_10459;
         Class240_Sub22_Sub18 var5 = new Class240_Sub22_Sub18(this.aRenderer_Sub2_2694, Class136.aClass136_2625, Class87.aClass87_1759, var1.anInt_8530, var1.anInt_8529);
         boolean var6 = false;
         this.aRenderer_Sub2_2694.method1901(var4, -626386132);
         var4.method7327(0, var5);
         if(var4.method7330()) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, var1.anInt_8530, var1.anInt_8529);
            OpenGL.glUseProgram(this.aClass148_2693.anInt_2719);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass148_2693.anInt_2719, "heightMap"), 0);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass148_2693.anInt_2719, "rcpRelief"), 1.0F / var3);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass148_2693.anInt_2719, "sampleSize"), 1.0F / (float)var2.anInt_8530, 1.0F / (float)var2.anInt_8529);

            for(int var7 = 0; var7 < var1.depth; ++var7) {
               float var8 = (float)var7 / (float)var1.depth;
               this.aRenderer_Sub2_2694.setTextureRenderer(var2);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord3f(0.0F, 0.0F, var8);
               OpenGL.glVertex2f(0.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 0.0F, var8);
               OpenGL.glVertex2f(1.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 1.0F, var8);
               OpenGL.glVertex2f(1.0F, 1.0F);
               OpenGL.glTexCoord3f(0.0F, 1.0F, var8);
               OpenGL.glVertex2f(0.0F, 1.0F);
               OpenGL.glEnd();
               var1.copyTexture(0, 0, var7, var1.anInt_8530, var1.anInt_8529, 0, 0);
            }

            OpenGL.glUseProgram(0);
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var6 = true;
         }

         var4.method7327(0, (Class101)null);
         this.aRenderer_Sub2_2694.method1902(var4, 2111790197);
         return var6;
      }
   }

   boolean method1817() {
      if(this.aRenderer_Sub2_2694.supportsFrameBuffer && this.aRenderer_Sub2_2694.supportsFragmentShader && this.aClass148_2693 == null) {
         Class151 var1 = Class151.method1833(this.aRenderer_Sub2_2694, '\u8b30', "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
         if(var1 != null) {
            this.aClass148_2693 = Class148.method1826(this.aRenderer_Sub2_2694, new Class151[]{var1});
         }
      }

      return this.aClass148_2693 != null;
   }

   Class145(OpenGLRenderer var1) {
      this.aRenderer_Sub2_2694 = var1;
   }
}
