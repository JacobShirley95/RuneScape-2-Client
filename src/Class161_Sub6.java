import jaggl.OpenGL;

public class Class161_Sub6 extends Class161 {

   float[] aFloatArray_10895;
   static final char aChar_10896 = '\u0000';
   static final char aChar_10897 = '\u0001';
   static final String aString_10898 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
   int anInt_10899;
   Class150 aClass150_10900;
   float aFloat_10901;
   Class153 aClass153_10902;
   final Class143 textureDecider;
   static final float[] aFloatArray_10904 = new float[4];


   boolean method1883() {
      return true;
   }

   void method7518() {
      this.aClass150_10900 = new Class150(this.aRenderer_Sub2_2792, 2);
      this.aClass150_10900.method1831(0);
      this.aRenderer_Sub2_2792.setTexture(1);
      this.aRenderer_Sub2_2792.method7022(-16777216);
      this.aRenderer_Sub2_2792.setTexEnv(260, 7681);
      this.aRenderer_Sub2_2792.method7055(0, '\u8576', 770);
      this.aRenderer_Sub2_2792.setTexture(0);
      OpenGL.glBindProgramARB('\u8620', this.aClass153_10902.anInt_2733);
      OpenGL.glEnable('\u8620');
      this.aClass150_10900.method1830();
      this.aClass150_10900.method1831(1);
      this.aRenderer_Sub2_2792.setTexture(1);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      this.aRenderer_Sub2_2792.setTextureEnv(0);
      this.aRenderer_Sub2_2792.method7055(0, 5890, 770);
      this.aRenderer_Sub2_2792.setTexture(0);
      OpenGL.glBindProgramARB('\u8620', 0);
      OpenGL.glDisable('\u8620');
      OpenGL.glDisable('\u8804');
      this.aClass150_10900.method1830();
   }

   void method1880(boolean var1) {
      if(this.aClass150_10900 != null) {
         this.aClass150_10900.method1832('\u0000');
         this.aRenderer_Sub2_2792.setTexture(1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.aRenderer_Sub2_2792.anArrayViewport_10356.data, 0);
         OpenGL.glMatrixMode(5888);
         this.aRenderer_Sub2_2792.setTexture(0);
         if(this.anInt_10899 != this.aRenderer_Sub2_2792.lastCleanup) {
            int var2 = this.aRenderer_Sub2_2792.lastCleanup % 5000 * 128 / 5000;

            for(int var3 = 0; var3 < 64; ++var3) {
               OpenGL.glProgramLocalParameter4fvARB('\u8620', var3, this.aFloatArray_10895, var2);
               var2 += 2;
            }

            if(this.textureDecider.supports3DTextures) {
               this.aFloat_10901 = (float)(this.aRenderer_Sub2_2792.lastCleanup % 4000) / 4000.0F;
            } else {
               OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }

            this.anInt_10899 = this.aRenderer_Sub2_2792.lastCleanup;
         }

      }
   }

   void method1884() {
      if(this.aClass150_10900 != null) {
         this.aClass150_10900.method1832('\u0001');
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         this.aRenderer_Sub2_2792.setTexture(0);
      }
   }

   Class161_Sub6(OpenGLRenderer var1, Class143 var2) {
      super(var1);
      this.textureDecider = var2;
      if(this.aRenderer_Sub2_2792.supportsVertexProgram && this.aRenderer_Sub2_2792.anInt_10434 >= 2) {
         this.aClass153_10902 = Class153.method1838(this.aRenderer_Sub2_2792, '\u8620', "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
         if(this.aClass153_10902 == null) {
            return;
         }

         int[][] var3 = CompProfile.method6116(64, 256, 0, 4, 4, 3, 0.4F, false, 577407584);
         int[][] var4 = CompProfile.method6116(64, 256, 8, 4, 4, 3, 0.4F, false, 155645506);
         int var5 = 0;
         this.aFloatArray_10895 = new float['\u8000'];

         for(int var6 = 0; var6 < 256; ++var6) {
            int[] var7 = var3[var6];
            int[] var8 = var4[var6];

            for(int var9 = 0; var9 < 64; ++var9) {
               this.aFloatArray_10895[var5++] = (float)var7[var9] / 4096.0F;
               this.aFloatArray_10895[var5++] = (float)var8[var9] / 4096.0F;
            }
         }

         this.method7518();
      }

   }

   void method1881(boolean var1) {}

   void method1879(OGLTexture var1, int var2) {
      this.aRenderer_Sub2_2792.setTextureRenderer(var1);
      this.aRenderer_Sub2_2792.setTextureEnv(var2);
   }

   void method1882(int var1, int var2) {
      if(this.aClass150_10900 != null) {
         this.aRenderer_Sub2_2792.setTexture(1);
         int var3;
         if((var1 & 128) == 0) {
            if((var2 & 1) == 1) {
               if(!this.textureDecider.supports3DTextures) {
                  var3 = this.aRenderer_Sub2_2792.lastCleanup % 4000 * 16 / 4000;
                  this.aRenderer_Sub2_2792.setTextureRenderer(this.textureDecider.anOGLTexture_Sub3Array_2679[var3]);
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
               } else {
                  this.aRenderer_Sub2_2792.setTextureRenderer(this.textureDecider.anOGLTexture_Sub4_2680);
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, this.aFloat_10901, 0.0F, 0.0F, 1.0F);
               }
            } else {
               if(this.textureDecider.supports3DTextures) {
                  this.aRenderer_Sub2_2792.setTextureRenderer(this.textureDecider.anOGLTexture_Sub4_2680);
               } else {
                  this.aRenderer_Sub2_2792.setTextureRenderer(this.textureDecider.anOGLTexture_Sub3Array_2679[0]);
               }

               OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
            }
         } else {
            this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         }

         this.aRenderer_Sub2_2792.setTexture(0);
         if((var1 & 64) == 0) {
            aFloatArray_10904[0] = this.aRenderer_Sub2_2792.aFloat_10421 * this.aRenderer_Sub2_2792.aFloat_10394;
            aFloatArray_10904[1] = this.aRenderer_Sub2_2792.aFloat_10421 * this.aRenderer_Sub2_2792.aFloat_10318;
            aFloatArray_10904[2] = this.aRenderer_Sub2_2792.aFloat_10421 * this.aRenderer_Sub2_2792.aFloat_10280;
            OpenGL.glProgramLocalParameter4fvARB('\u8620', 66, aFloatArray_10904, 0);
         } else {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 66, 1.0F, 1.0F, 1.0F, 1.0F);
         }

         var3 = var1 & 3;
         if(var3 == 2) {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.05F, 1.0F, 1.0F, 1.0F);
         } else if(var3 == 3) {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.1F, 1.0F, 1.0F, 1.0F);
         } else {
            OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.025F, 1.0F, 1.0F, 1.0F);
         }

      }
   }
}
