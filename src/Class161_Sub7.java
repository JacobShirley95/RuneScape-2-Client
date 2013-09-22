import jaggl.OpenGL;

public class Class161_Sub7 extends Class161 {

   Class148 aClass148_11120;
   static final String aString_11121 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
   static final String aString_11122 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
   boolean aBoolean_11123 = false;
   boolean aBoolean_11124 = false;
   Class143 aClass143_11125;


   boolean method1883() {
      return this.aBoolean_11124;
   }

   void method1881(boolean var1) {}

   void method1879(OGLTexture var1, int var2) {
      if(!this.aBoolean_11123) {
         this.aRenderer_Sub2_2792.setTextureRenderer(var1);
         this.aRenderer_Sub2_2792.setTextureEnv(var2);
      }

   }

   void method1884() {
      if(this.aBoolean_11123) {
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         this.aRenderer_Sub2_2792.setTexture(0);
         this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         OpenGL.glUseProgram(0);
         this.aBoolean_11123 = false;
      }

   }

   Class161_Sub7(OpenGLRenderer var1, Class143 var2) {
      super(var1);
      this.aClass143_11125 = var2;
      if(this.aClass143_11125.anOGLTexture_Sub4_2674 != null && this.aRenderer_Sub2_2792.aBoolean_10465 && this.aRenderer_Sub2_2792.supportsFragmentShader) {
         Class151 var3 = Class151.method1833(this.aRenderer_Sub2_2792, '\u8b31', "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
         Class151 var4 = Class151.method1833(this.aRenderer_Sub2_2792, '\u8b30', "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
         this.aClass148_11120 = Class148.method1826(this.aRenderer_Sub2_2792, new Class151[]{var3, var4});
         this.aBoolean_11124 = this.aClass148_11120 != null;
      }

   }

   void method1880(boolean var1) {
      OGLTexture_Sub2 var2 = this.aRenderer_Sub2_2792.method6994();
      if(this.aBoolean_11124 && var2 != null) {
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer(var2);
         this.aRenderer_Sub2_2792.setTexture(0);
         this.aRenderer_Sub2_2792.setTextureRenderer(this.aClass143_11125.anOGLTexture_Sub4_2674);
         int var3 = this.aClass148_11120.anInt_2719;
         OpenGL.glUseProgram(var3);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "normalSampler"), 0);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "envMapSampler"), 1);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var3, "sunDir"), -this.aRenderer_Sub2_2792.aFloatArray_10391[0], -this.aRenderer_Sub2_2792.aFloatArray_10391[1], -this.aRenderer_Sub2_2792.aFloatArray_10391[2]);
         OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var3, "sunColour"), this.aRenderer_Sub2_2792.aFloat_10394, this.aRenderer_Sub2_2792.aFloat_10318, this.aRenderer_Sub2_2792.aFloat_10280, 1.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var3, "sunExponent"), 96.0F + Math.abs(this.aRenderer_Sub2_2792.aFloatArray_10391[1]) * 928.0F);
         this.aBoolean_11123 = true;
      }

   }

   void method1882(int var1, int var2) {
      if(this.aBoolean_11123) {
         int var3 = 1 << (var1 & 3);
         float var4 = (float)(1 << (var1 >> 3 & 7)) / 32.0F;
         int var5 = var2 & '\uffff';
         float var6 = (float)(var2 >> 16 & 3) / 8.0F;
         int var7 = this.aClass148_11120.anInt_2719;
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "time"), (float)(var3 * this.aRenderer_Sub2_2792.lastCleanup % '\u9c40') / 40000.0F);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "scale"), var4);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterDepth"), (float)var5);
         OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterOffset"), var6);
      }

   }
}
