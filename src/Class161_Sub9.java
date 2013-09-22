import jaggl.OpenGL;

public class Class161_Sub9 extends Class161 {

   Class148 aClass148_11133;
   boolean aBoolean_11134 = false;
   static final String aString_11135 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
   boolean aBoolean_11136 = false;
   static final String aString_11137 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
   Class143 aClass143_11138;


   boolean method1883() {
      return this.aBoolean_11134;
   }

   Class161_Sub9(OpenGLRenderer var1, Class143 var2) {
      super(var1);
      this.aClass143_11138 = var2;
      if(this.aClass143_11138.anOGLTexture_Sub4_2674 != null && this.aRenderer_Sub2_2792.aBoolean_10465 && this.aRenderer_Sub2_2792.supportsFragmentShader) {
         Class151 var3 = Class151.method1833(this.aRenderer_Sub2_2792, '\u8b31', "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
         Class151 var4 = Class151.method1833(this.aRenderer_Sub2_2792, '\u8b30', "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
         this.aClass148_11133 = Class148.method1826(this.aRenderer_Sub2_2792, new Class151[]{var3, var4});
         this.aBoolean_11134 = this.aClass148_11133 != null;
      }

   }

   void method1881(boolean var1) {}

   void method1884() {
      if(this.aBoolean_11136) {
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         this.aRenderer_Sub2_2792.setTexture(0);
         this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         OpenGL.glUseProgram(0);
         this.aBoolean_11136 = false;
      }

   }

   void method1879(OGLTexture var1, int var2) {
      if(!this.aBoolean_11136) {
         this.aRenderer_Sub2_2792.setTextureRenderer(var1);
         this.aRenderer_Sub2_2792.setTextureEnv(var2);
      }

   }

   void method1880(boolean var1) {
      OGLTexture_Sub2 var2 = this.aRenderer_Sub2_2792.method6994();
      if(this.aBoolean_11134 && var2 != null) {
         float var3 = 1.0F + (1.0F - Math.abs(this.aRenderer_Sub2_2792.aFloatArray_10391[1])) * 2.0F;
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer(var2);
         this.aRenderer_Sub2_2792.setTexture(0);
         this.aRenderer_Sub2_2792.setTextureRenderer(this.aClass143_11138.anOGLTexture_Sub4_2674);
         int var4 = this.aClass148_11133.anInt_2719;
         OpenGL.glUseProgram(var4);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "normalSampler"), 0);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "envMapSampler"), 1);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "sunDir"), -this.aRenderer_Sub2_2792.aFloatArray_10391[0], -this.aRenderer_Sub2_2792.aFloatArray_10391[1], -this.aRenderer_Sub2_2792.aFloatArray_10391[2]);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var4, "sunColour"), this.aRenderer_Sub2_2792.aFloat_10394 * var3, this.aRenderer_Sub2_2792.aFloat_10318 * var3, this.aRenderer_Sub2_2792.aFloat_10280 * var3, 1.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var4, "sunExponent"), 64.0F + Math.abs(this.aRenderer_Sub2_2792.aFloatArray_10391[1]) * 928.0F);
         this.aBoolean_11136 = true;
      }

   }

   void method1882(int var1, int var2) {
      if(this.aBoolean_11136) {
         int var3 = 1 << (var1 & 3);
         float var4 = (float)(1 << (var1 >> 3 & 7)) / 32.0F;
         int var5 = var2 & '\uffff';
         float var6 = (float)(var2 >> 16 & 3) / 8.0F;
         float var7 = (float)(var2 >> 19 & 15) / 16.0F;
         float var8 = (float)(var2 >> 23 & 15) / 16.0F;
         int var9 = var2 >> 27 & 15;
         int var10 = this.aClass148_11133.anInt_2719;
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float)(var3 * this.aRenderer_Sub2_2792.lastCleanup % '\u9c40') / 40000.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float)var5);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
         OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float)var9);
      }

   }
}
