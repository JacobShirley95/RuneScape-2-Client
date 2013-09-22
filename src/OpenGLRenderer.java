import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;

public class OpenGLRenderer extends Renderer {

   float aFloat_10275 = 0.0F;
   static final float aFloat_10276 = 0.35F;
   NodeList aNodeList_10277 = new NodeList();
   int anInt_10278;
   boolean aBoolean_10279;
   float aFloat_10280 = 1.0F;
   static final int anInt_10281 = 8;
   static final int anInt_10282 = 16;
   static final int anInt_10283 = 32;
   static final int anInt_10284 = 32993;
   static final int anInt_10285 = 5121;
   static final int anInt_10286 = 5123;
   static final int anInt_10287 = 5126;
   static final int anInt_10288 = 4;
   static final int anInt_10289 = 7;
   static final int anInt_10290 = 128;
   int anInt_10291;
   static final int anInt_10292 = -2;
   static final int anInt_10293 = 7681;
   float aFloat_10294 = -1.0F;
   static final int anInt_10295 = 260;
   Class146 aClass146_10296;
   boolean supportsMultiSample;
   float[] aFloatArray_10298 = new float[4];
   static final int anInt_10299 = 34168;
   static final int anInt_10300 = 5890;
   static final int anInt_10301 = 34167;
   static final int anInt_10302 = 34166;
   static final int anInt_10303 = 770;
   static final int anInt_10304 = 768;
   OGLBufferPointer anOGLBufferPointer_10305;
   ArrayViewport anArrayViewport_10306 = new ArrayViewport();
   NodeList aNodeList_10307 = new NodeList();
   static final int anInt_10308 = 0;
   OpenGL anOpenGL_10309;
   static final int anInt_10310 = 2;
   static final int anInt_10311 = 3;
   static final int anInt_10312 = 1;
   static final int anInt_10313 = 2;
   boolean aBoolean_10314;
   static final int anInt_10315 = 8;
   boolean aBoolean_10316 = false;
   static final int anInt_10317 = 7;
   float aFloat_10318 = 1.0F;
   int anInt_10319;
   final Class173 aClass173_10320;
   Class156 aClass156_10321;
   static final int anInt_10322 = 0;
   Class240_Sub40_Sub1 aClass240_Sub40_Sub1_10323;
   Class158 aClass158_10324 = new Class158();
   ArrayViewport anArrayViewport_10325 = new ArrayViewport();
   ArrayViewport anArrayViewport_10326 = new ArrayViewport();
   boolean aBoolean_10327;
   Class145 aClass145_10328;
   int lastCleanup;
   int anInt_10330 = 8;
   int anInt_10331;
   static final int anInt_10332 = 4;
   NativeHeap aNativeHeap_10333;
   NodeList aNodeList_10334 = new NodeList();
   int anInt_10335;
   int anInt_10336;
   Class177_Sub2 aClass177_Sub2_10337;
   static final int anInt_10338 = 1;
   int anInt_10339;
   NodeList aNodeList_10340 = new NodeList();
   NodeList aNodeList_10341 = new NodeList();
   Class105 aClass105_10342;
   NodeList aNodeList_10343 = new NodeList();
   OGLTexture_Sub3_Sub1 anOGLTexture_Sub3_Sub1_10344;
   long aLong_10345;
   static int[] anIntArray_10346 = new int[1000];
   int anInt_10347;
   int anInt_10348;
   int anInt_10349;
   int anInt_10350;
   boolean aBoolean_10351;
   boolean aBoolean_10352;
   boolean aBoolean_10353;
   int anInt_10354;
   ArrayViewport anArrayViewport_10355 = new ArrayViewport();
   ArrayViewport anArrayViewport_10356 = new ArrayViewport();
   float aFloat_10357 = -1.0F;
   ArrayViewport anArrayViewport_10358 = new ArrayViewport();
   BufferDataNode aClass240_Sub8_Sub2_10359;
   float[][] aFloatArrayArray_10360 = new float[6][4];
   boolean aBoolean_10361;
   int[] anIntArray_10362;
   float aFloat_10363;
   float aFloat_10364;
   float aFloat_10365;
   float aFloat_10366 = 0.0F;
   float aFloat_10367 = 1.0F;
   static final int anInt_10368 = 34479;
   float aFloat_10369 = -1.0F;
   Viewport aViewport_10370 = new Viewport();
   ArrayViewport anArrayViewport_10371 = new ArrayViewport();
   ArrayViewport anArrayViewport_10372 = new ArrayViewport();
   static final int anInt_10373 = 1;
   int anInt_10374;
   static final int anInt_10375 = 0;
   int anInt_10376 = 0;
   int anInt_10377 = 0;
   int anInt_10378 = 0;
   int anInt_10379 = 0;
   int anInt_10380 = 0;
   int anInt_10381 = 0;
   static final float[] aFloatArray_10382 = new float[4];
   int anInt_10383;
   int anInt_10384;
   int anInt_10385;
   static int anInt_10386 = 4;
   boolean aBoolean_10387;
   Viewport aViewport_10388 = new Viewport();
   boolean aBoolean_10389 = true;
   float[] aFloatArray_10390 = new float[16];
   float[] aFloatArray_10391 = new float[4];
   float[] aFloatArray_10392 = new float[4];
   int anInt_10393 = -1;
   float aFloat_10394 = 1.0F;
   float aFloat_10395;
   static final int anInt_10396 = -1;
   static final int anInt_10397 = 2;
   float[] aFloatArray_10398 = new float[4];
   boolean isBigEndian;
   Class240_Sub53[] aClass240_Sub53Array_10400;
   NodeList aNodeList_10401 = new NodeList();
   Class165_Sub2[] aClass165_Sub2Array_10402;
   int anInt_10403;
   static final int anInt_10404 = 34023;
   static final int anInt_10405 = 1;
   static final int anInt_10406 = 8448;
   int anInt_10407 = 3;
   int anInt_10408;
   float aFloat_10409;
   static final int anInt_10410 = 2;
   float aFloat_10411;
   float aFloat_10412;
   boolean aBoolean_10413;
   boolean aBoolean_10414;
   int anInt_10415;
   ArrayViewport anArrayViewport_10416 = new ArrayViewport();
   Class166 aClass166_10417;
   OGLBuffer anOGLBuffer_10418;
   int anInt_10419;
   Class165_Sub2[] aClass165_Sub2Array_10420;
   float aFloat_10421;
   NodeList aNodeList_10422 = new NodeList();
   int currentTexture;
   OGLTexture[] anOGLTextureArray_10424;
   OGLTexture_Sub3 anOGLTexture_Sub3_10425;
   int anInt_10426;
   static final int anInt_10427 = 55;
   String aString_10428;
   String gpuType;
   boolean aBoolean_10430;
   int anInt_10431;
   boolean aBoolean_10432;
   boolean isMac;
   int anInt_10434;
   int anInt_10435;
   boolean supportsVBuffer;
   boolean supportsFrameBuffer;
   boolean aBoolean_10438;
   boolean aBoolean_10439;
   static final int anInt_10440 = 100663296;
   boolean aBoolean_10441;
   static final int anInt_10442 = 4;
   boolean allowsVBuffer;
   boolean supports3DTextures;
   boolean supportsTextureCubeMap;
   boolean supportsSeamlessCubeMap;
   boolean supportsTextureRect;
   boolean supportsTextureFloat;
   boolean aBoolean_10449;
   boolean supportsVertexProgram;
   float[] aFloatArray_10451 = new float[4];
   boolean supportsFragmentShader;
   static final int anInt_10453 = 34165;
   final int anInt_10454;
   float aFloat_10455;
   float aFloat_10456;
   int anInt_10457;
   int anInt_10458;
   Class174_Sub1_Sub2 aClass174_Sub1_Sub2_10459;
   Viewport aViewport_10460 = new Viewport();
   OGLBufferPointer anOGLBufferPointer_10461;
   OGLBuffer anOGLBuffer_10462;
   int anInt_10463;
   static final float[] aFloatArray_10464 = new float[4];
   boolean aBoolean_10465;
   int[] anIntArray_10466;
   int[] anIntArray_10467;
   float aFloat_10468;
   final byte[] aByteArray_10469;


   void method6915() {
      int var1 = 0;

      while(!this.anOpenGL_10309.method2008()) {
         if(var1++ > 5) {
            throw new RuntimeException("");
         }

         RSInterface.method1724(1000L);
      }

   }

   int method6916() {
      int var1 = 0;
      this.aString_10428 = OpenGL.glGetString(7936).toLowerCase();
      this.gpuType = OpenGL.glGetString(7937).toLowerCase();
      if(this.aString_10428.indexOf("microsoft") != -1) {
         var1 |= 1;
      }

      if(this.aString_10428.indexOf("brian paul") != -1 || this.aString_10428.indexOf("mesa") != -1) {
         var1 |= 1;
      }

      String var2 = OpenGL.glGetString(7938);
      String[] var3 = Class136.method1799(var2.replace('.', ' '), ' ', (byte)13);
      if(var3.length >= 2) {
         try {
            int var4 = LoadProgress.method4427(var3[0], 162891749);
            int var5 = LoadProgress.method4427(var3[1], 631217193);
            this.anInt_10431 = var4 * 10 + var5;
         } catch (NumberFormatException var6) {
            var1 |= 4;
         }
      } else {
         var1 |= 4;
      }

      if(this.anInt_10431 < 12) {
         var1 |= 2;
      }

      if(!this.anOpenGL_10309.isCompatible("GL_ARB_multitexture")) {
         var1 |= 8;
      }

      if(!this.anOpenGL_10309.isCompatible("GL_ARB_texture_env_combine")) {
         var1 |= 32;
      }

      int[] var7 = new int[1];
      OpenGL.glGetIntegerv('\u84e2', var7, 0);
      this.anInt_10434 = var7[0];
      OpenGL.glGetIntegerv('\u8871', var7, 0);
      this.anInt_10331 = var7[0];
      OpenGL.glGetIntegerv('\u8872', var7, 0);
      this.anInt_10426 = var7[0];
      if(this.anInt_10434 < 2 || this.anInt_10331 < 2 || this.anInt_10426 < 2) {
         var1 |= 16;
      }

      this.isBigEndian = Stream.isLE();
      this.supportsVBuffer = this.anOpenGL_10309.isCompatible("GL_ARB_vertex_buffer_object");
      this.supportsMultiSample = this.anOpenGL_10309.isCompatible("GL_ARB_multisample");
      this.supportsVertexProgram = this.anOpenGL_10309.isCompatible("GL_ARB_vertex_program");
      this.anOpenGL_10309.isCompatible("GL_ARB_fragment_program");
      this.aBoolean_10465 = this.anOpenGL_10309.isCompatible("GL_ARB_vertex_shader");
      this.supportsFragmentShader = this.anOpenGL_10309.isCompatible("GL_ARB_fragment_shader");
      this.supports3DTextures = this.anOpenGL_10309.isCompatible("GL_EXT_texture3D");
      this.supportsTextureRect = this.anOpenGL_10309.isCompatible("GL_ARB_texture_rectangle");
      this.supportsTextureCubeMap = this.anOpenGL_10309.isCompatible("GL_ARB_texture_cube_map");
      this.supportsSeamlessCubeMap = this.anOpenGL_10309.isCompatible("GL_ARB_seamless_cube_map");
      this.supportsTextureFloat = this.anOpenGL_10309.isCompatible("GL_ARB_texture_float");
      this.aBoolean_10449 = false;
      this.supportsFrameBuffer = this.anOpenGL_10309.isCompatible("GL_EXT_framebuffer_object");
      this.aBoolean_10327 = this.anOpenGL_10309.isCompatible("GL_EXT_framebuffer_blit");
      this.aBoolean_10439 = this.anOpenGL_10309.isCompatible("GL_EXT_framebuffer_multisample");
      this.aBoolean_10441 = this.aBoolean_10327 & this.aBoolean_10439;
      this.isMac = Class288.aString_4826.startsWith("mac");
      OpenGL.glGetFloatv(2834, aFloatArray_10382, 0);
      this.aFloat_10456 = aFloatArray_10382[0];
      this.aFloat_10455 = aFloatArray_10382[1];
      return var1 != 0?var1:0;
   }

   void method6917() {
      this.anOGLTextureArray_10424 = new OGLTexture[this.anInt_10434];
      this.anOGLTexture_Sub3_10425 = new OGLTexture_Sub3(this, 3553, Class136.aClass136_2625, Class87.aClass87_1759, 1, 1);
      new OGLTexture_Sub3(this, 3553, Class136.aClass136_2625, Class87.aClass87_1759, 1, 1);
      new OGLTexture_Sub3(this, 3553, Class136.aClass136_2625, Class87.aClass87_1759, 1, 1);

      for(int var1 = 0; var1 < 7; ++var1) {
         this.aClass165_Sub2Array_10420[var1] = new Class165_Sub2(this);
         this.aClass165_Sub2Array_10402[var1] = new Class165_Sub2(this);
      }

      if(this.supportsFrameBuffer) {
         this.aClass174_Sub1_Sub2_10459 = new Class174_Sub1_Sub2(this);
         new Class174_Sub1_Sub2(this);
      }

   }

   void method6918() {
      this.method6957(-2);

      for(int var1 = this.anInt_10434 - 1; var1 >= 0; --var1) {
         this.setTexture(var1);
         this.setTextureRenderer((OGLTexture)null);
         OpenGL.glTexEnvi(8960, 8704, '\u8570');
      }

      this.setTexEnv(8448, 8448);
      this.method7020(2, '\u8578', 770);
      this.method7025();
      this.anInt_10348 = 1;
      OpenGL.glEnable(3042);
      OpenGL.glBlendFunc(770, 771);
      this.anInt_10349 = 1;
      OpenGL.glEnable(3008);
      OpenGL.glAlphaFunc(516, 0.0F);
      this.aBoolean_10351 = true;
      OpenGL.glColorMask(true, true, true, true);
      this.aBoolean_10361 = true;
      this.method7026(true);
      this.method7066(true);
      this.method7028(true);
      this.method7029(true);
      this.method1970(0.0F, 1.0F);
      this.method7011();
      this.anOpenGL_10309.setSwapInterval(0);
      OpenGL.glShadeModel(7425);
      OpenGL.glClearDepth(1.0F);
      OpenGL.glDepthFunc(515);
      OpenGL.glPolygonMode(1028, 6914);
      OpenGL.glEnable(2884);
      OpenGL.glCullFace(1029);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var2 = 0; var2 < 8; ++var2) {
         int var3 = 16384 + var2;
         OpenGL.glLightfv(var3, 4608, var4, 0);
         OpenGL.glLightf(var3, 4615, 0.0F);
         OpenGL.glLightf(var3, 4616, 0.0F);
      }

      OpenGL.glEnable(16384);
      OpenGL.glEnable(16385);
      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      if(this.supportsSeamlessCubeMap) {
         OpenGL.glEnable('\u884f');
      }

      this.anInt_10291 = -1;
      this.anInt_10393 = -1;
      this.method1908();
      this.method1967();
   }

   public RendererInfo getRendererInfo() {
      int var1 = -1;
      if(this.aString_10428.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if(this.aString_10428.indexOf("intel") != -1) {
         var1 = '\u8086';
      } else if(this.aString_10428.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new RendererInfo(var1, "OpenGL", this.anInt_10431, this.gpuType, 0L);
   }

   void method1886(int var1, int var2) throws Exception_Sub7 {
      try {
         this.softwareTarget.method7576();
      } catch (Exception var4) {
         ;
      }

      if(this.aClass96_2801 != null) {
         this.aClass96_2801.method1254(-1736202523);
      }

   }

   public void method1962() {
      OpenGL.glFinish();
   }

   void method1888() {
      for(NodeListNode var1 = this.aNodeList_10334.getBaseNode_2((byte)48); var1 != null; var1 = this.aNodeList_10334.getNext(-1980811962)) {
         ((Class240_Sub51_Sub2)var1).method1147();
      }

      if(this.aClass146_10296 != null) {
         this.aClass146_10296.method1824();
      }

      if(this.aBoolean_10316) {
         Class19.method103(false, true, (byte)1);
         this.aBoolean_10316 = false;
      }

   }

   final void method6923(float[] var1) {
      float[] var2 = new float[16];
      System.arraycopy(var1, 0, var2, 0, 16);
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var2, 0);
      OpenGL.glMatrixMode(5888);
   }

   public boolean method1891() {
      return true;
   }

   public boolean supportsTexture() {
      return this.aClass240_Sub40_Sub1_10323 != null && (this.anInt_10319 <= 1 || this.aBoolean_10441);
   }

   public boolean method1959() {
      return true;
   }

   public boolean method1964() {
      return true;
   }

   public boolean method1963() {
      return this.supportsMultiSample && (!this.method1989() || this.aBoolean_10441);
   }

   public boolean method1969() {
      return true;
   }

   public void method1986(Class240_Sub51 var1) {
      this.aNativeHeap_10333 = ((Class240_Sub51_Sub2)var1).aNativeHeap_1773;
      if(this.anOGLBuffer_10462 == null) {
         BufferDataNode var2 = new BufferDataNode(80);
         if(this.isBigEndian) {
            var2.putFloatBE(-1.0F);
            var2.putFloatBE(-1.0F);
            var2.putFloatBE(0.0F);
            var2.putFloatBE(0.0F);
            var2.putFloatBE(0.0F);
            var2.putFloatBE(-1.0F);
            var2.putFloatBE(1.0F);
            var2.putFloatBE(0.0F);
            var2.putFloatBE(0.0F);
            var2.putFloatBE(1.0F);
            var2.putFloatBE(1.0F);
            var2.putFloatBE(1.0F);
            var2.putFloatBE(0.0F);
            var2.putFloatBE(1.0F);
            var2.putFloatBE(1.0F);
            var2.putFloatBE(1.0F);
            var2.putFloatBE(-1.0F);
            var2.putFloatBE(0.0F);
            var2.putFloatBE(1.0F);
            var2.putFloatBE(0.0F);
         } else {
            var2.putFloatLE(-1.0F);
            var2.putFloatLE(-1.0F);
            var2.putFloatLE(0.0F);
            var2.putFloatLE(0.0F);
            var2.putFloatLE(0.0F);
            var2.putFloatLE(-1.0F);
            var2.putFloatLE(1.0F);
            var2.putFloatLE(0.0F);
            var2.putFloatLE(0.0F);
            var2.putFloatLE(1.0F);
            var2.putFloatLE(1.0F);
            var2.putFloatLE(1.0F);
            var2.putFloatLE(0.0F);
            var2.putFloatLE(1.0F);
            var2.putFloatLE(1.0F);
            var2.putFloatLE(1.0F);
            var2.putFloatLE(-1.0F);
            var2.putFloatLE(0.0F);
            var2.putFloatLE(1.0F);
            var2.putFloatLE(0.0F);
         }

         this.anOGLBuffer_10462 = this.createOGLBuffer(20, var2.data, var2.index * 964952859, false);
         this.anOGLBufferPointer_10305 = new OGLBufferPointer(this.anOGLBuffer_10462, 5126, 3, 0);
         this.anOGLBufferPointer_10461 = new OGLBufferPointer(this.anOGLBuffer_10462, 5126, 2, 12);
         this.aClass158_10324.method1858(this);
      }

   }

   public boolean method1900() {
      return true;
   }

   public boolean method1894() {
      return false;
   }

   public final void method1949(int var1, int var2, int var3) {
      if(this.anInt_10291 != var1 || this.anInt_10457 != var2 || this.anInt_10408 != var3) {
         this.anInt_10291 = var1;
         this.anInt_10457 = var2;
         this.anInt_10408 = var3;
         this.method7014();
         this.method6989();
      }

   }

   void method6934() {
      int var1 = this.aClass174_2815.method2194();
      int var2 = this.aClass174_2815.method2198();
      this.anArrayViewport_10358.method4587(0.0F, (float)var1, 0.0F, (float)var2, -1.0F, 1.0F);
      this.method1908();
      this.method7011();
      this.method1967();
   }

   public int[] method1906(int var1, int var2, int var3, int var4) {
      if(this.aClass174_2815 == null) {
         return null;
      } else {
         int[] var5 = new int[var3 * var4];
         int var6 = this.aClass174_2815.method2198();

         for(int var7 = 0; var7 < var4; ++var7) {
            OpenGL.glReadPixelsi(var1, var6 - var2 - var7 - 1, var3, 1, '\u80e1', this.anInt_10454, var5, var7 * var3);
         }

         return var5;
      }
   }

   public void method1907() {
      if(this.aBoolean_10279 && this.aClass174_2815 != null) {
         int var1 = this.anInt_10378;
         int var2 = this.anInt_10379;
         int var3 = this.anInt_10376;
         int var4 = this.anInt_10377;
         this.method1967();
         int var5 = this.anInt_10339;
         int var6 = this.anInt_10383;
         int var7 = this.anInt_10278;
         int var8 = this.anInt_10385;
         this.method1908();
         OpenGL.glReadBuffer(1028);
         OpenGL.glDrawBuffer(1029);
         this.method7011();
         this.method7026(false);
         this.method7066(false);
         this.method7028(false);
         this.method7029(false);
         this.setTextureRenderer((OGLTexture)null);
         this.method6957(-2);
         this.setTextureEnv(1);
         this.setBlendFunc(0);
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         OpenGL.glRasterPos2i(0, 0);
         OpenGL.glCopyPixels(0, 0, this.aClass174_2815.method2194(), this.aClass174_2815.method2198(), 6144);
         OpenGL.glFlush();
         OpenGL.glReadBuffer(1029);
         OpenGL.glDrawBuffer(1029);
         this.method1965(var1, var3, var2, var4);
         this.method1909(var5, var6, var7, var8);
      }
   }

   public void method1920(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)var1 + 0.35F;
      float var8 = (float)var2 + 0.35F;
      float var9 = var7 + (float)var3 - 1.0F;
      float var10 = var8 + (float)var4 - 1.0F;
      this.method7057();
      this.setBlendFunc(var6);
      OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
      if(this.supportsMultiSample) {
         OpenGL.glDisable('\u809d');
      }

      OpenGL.glBegin(2);
      OpenGL.glVertex2f(var7, var8);
      OpenGL.glVertex2f(var7, var10);
      OpenGL.glVertex2f(var9, var10);
      OpenGL.glVertex2f(var9, var8);
      OpenGL.glEnd();
      if(this.supportsMultiSample) {
         OpenGL.glEnable('\u809d');
      }

   }

   public final void method1945(int var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = this.anInt_10393 != var1;
      if(var7 || this.aFloat_10357 != var2 || this.aFloat_10294 != var3) {
         this.anInt_10393 = var1;
         this.aFloat_10357 = var2;
         this.aFloat_10294 = var3;
         if(var7) {
            this.aFloat_10394 = (float)(this.anInt_10393 & 16711680) / 1.671168E7F;
            this.aFloat_10318 = (float)(this.anInt_10393 & '\uff00') / 65280.0F;
            this.aFloat_10280 = (float)(this.anInt_10393 & 255) / 255.0F;
            this.method6986();
         }

         this.method6987();
      }

      if(this.aFloatArray_10451[0] != var4 || this.aFloatArray_10451[1] != var5 || this.aFloatArray_10451[2] != var6) {
         this.aFloatArray_10451[0] = var4;
         this.aFloatArray_10451[1] = var5;
         this.aFloatArray_10451[2] = var6;
         this.aFloatArray_10398[0] = -var4;
         this.aFloatArray_10398[1] = -var5;
         this.aFloatArray_10398[2] = -var6;
         float var8 = (float)(1.0D / Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6)));
         this.aFloatArray_10391[0] = var4 * var8;
         this.aFloatArray_10391[1] = var5 * var8;
         this.aFloatArray_10391[2] = var6 * var8;
         this.aFloatArray_10392[0] = -this.aFloatArray_10391[0];
         this.aFloatArray_10392[1] = -this.aFloatArray_10391[1];
         this.aFloatArray_10392[2] = -this.aFloatArray_10391[2];
         this.method6988();
         this.anInt_10403 = (int)(var4 * 256.0F / var5);
         this.anInt_10435 = (int)(var6 * 256.0F / var5);
      }

   }

   void method1937(int var1, int var2, int var3, int var4, int var5) {
      if(var3 < 0) {
         var3 = -var3;
      }

      if(var1 + var3 >= this.anInt_10378 && var1 - var3 <= this.anInt_10379 && var2 + var3 >= this.anInt_10376 && var2 - var3 <= this.anInt_10377) {
         this.method7057();
         this.setBlendFunc(var5);
         OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
         float var6 = (float)var1 + 0.35F;
         float var7 = (float)var2 + 0.35F;
         int var8 = var3 << 1;
         if((float)var8 < this.aFloat_10456) {
            OpenGL.glBegin(7);
            OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
            OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
            OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
            OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
            OpenGL.glEnd();
         } else {
            if((float)var8 <= this.aFloat_10455) {
               OpenGL.glEnable(2832);
               OpenGL.glPointSize((float)var8);
               OpenGL.glBegin(0);
               OpenGL.glVertex2f(var6, var7);
               OpenGL.glEnd();
               OpenGL.glDisable(2832);
            } else {
               OpenGL.glBegin(6);
               OpenGL.glVertex2f(var6, var7);
               int var9 = 262144 / (6 * var3);
               if(var9 <= 64) {
                  var9 = 64;
               } else if(var9 > 512) {
                  var9 = 512;
               }

               var9 = Class234.method3016(var9, (byte)63);
               OpenGL.glVertex2f(var6 + (float)var3, var7);

               for(int var10 = 16384 - var9; var10 > 0; var10 -= var9) {
                  OpenGL.glVertex2f(var6 + Class147.aFloatArray_2717[var10] * (float)var3, var7 + Class147.aFloatArray_2718[var10] * (float)var3);
               }

               OpenGL.glVertex2f(var6 + (float)var3, var7);
               OpenGL.glEnd();
            }

         }
      }
   }

   public void method1951(int var1, int var2, int var3, int var4, int var5) {
      this.method7057();
      this.setBlendFunc(var5);
      float var6 = (float)var1 + 0.35F;
      float var7 = (float)var2 + 0.35F;
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glVertex2f(var6, var7);
      OpenGL.glVertex2f(var6, var7 + (float)var3);
      OpenGL.glEnd();
   }

   public void method1968(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method7057();
      this.setBlendFunc(var6);
      float var7 = (float)var3 - (float)var1;
      float var8 = (float)var4 - (float)var2;
      if(var7 == 0.0F && var8 == 0.0F) {
         var7 = 1.0F;
      } else {
         float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
         var7 *= var9;
         var8 *= var9;
      }

      OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glVertex2f((float)var1 + 0.35F, (float)var2 + 0.35F);
      OpenGL.glVertex2f((float)var3 + var7 + 0.35F, (float)var4 + var8 + 0.35F);
      OpenGL.glEnd();
   }

   public void method1923(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var1 != var3 || var2 != var4) {
         this.method7057();
         this.setBlendFunc(var6);
         float var10 = (float)var3 - (float)var1;
         float var11 = (float)var4 - (float)var2;
         float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11)));
         var10 *= var12;
         var11 *= var12;
         OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
         var9 %= var8 + var7;
         float var13 = var10 * (float)var7;
         float var14 = var11 * (float)var7;
         float var15 = 0.0F;
         float var16 = 0.0F;
         float var17 = var13;
         float var18 = var14;
         if(var9 > var7) {
            var15 = var10 * (float)(var7 + var8 - var9);
            var16 = var11 * (float)(var7 + var8 - var9);
         } else {
            var17 = var10 * (float)(var7 - var9);
            var18 = var11 * (float)(var7 - var9);
         }

         float var19 = (float)var1 + 0.35F + var15;
         float var20 = (float)var2 + 0.35F + var16;
         float var21 = var10 * (float)var8;
         float var22 = var11 * (float)var8;

         while(true) {
            if(var3 > var1) {
               if(var19 > (float)var3 + 0.35F) {
                  break;
               }

               if(var19 + var17 > (float)var3) {
                  var17 = (float)var3 - var19;
               }
            } else {
               if(var19 < (float)var3 + 0.35F) {
                  break;
               }

               if(var19 + var17 < (float)var3) {
                  var17 = (float)var3 - var19;
               }
            }

            if(var4 > var2) {
               if(var20 > (float)var4 + 0.35F) {
                  break;
               }

               if(var20 + var18 > (float)var4) {
                  var18 = (float)var4 - var20;
               }
            } else {
               if(var20 < (float)var4 + 0.35F) {
                  break;
               }

               if(var20 + var18 < (float)var4) {
                  var18 = (float)var4 - var20;
               }
            }

            OpenGL.glBegin(1);
            OpenGL.glVertex2f(var19, var20);
            OpenGL.glVertex2f(var19 + var17, var20 + var18);
            OpenGL.glEnd();
            var19 += var21 + var17;
            var20 += var22 + var18;
            var17 = var13;
            var18 = var14;
         }

      }
   }

   public void method1954(int var1, int var2, int var3, int var4, int var5, int var6, Class1024 var7, int var8, int var9) {
      Class1024_Sub1 var10 = (Class1024_Sub1)var7;
      OGLTexture_Sub3_Sub1 var11 = var10.anOGLTexture_Sub3_Sub1_10747;
      this.method7067();
      this.setTextureRenderer(var10.anOGLTexture_Sub3_Sub1_10747);
      this.setBlendFunc(var6);
      this.setTexEnv(7681, 8448);
      this.method7020(0, '\u8577', 768);
      float var12 = var11.textureX / (float)var11.textureWidth;
      float var13 = var11.textureY / (float)var11.textureHeight;
      float var14 = (float)var3 - (float)var1;
      float var15 = (float)var4 - (float)var2;
      float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
      var14 *= var16;
      var15 *= var16;
      OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glTexCoord2f(var12 * (float)(var1 - var8), var13 * (float)(var2 - var9));
      OpenGL.glVertex2f((float)var1 + 0.35F, (float)var2 + 0.35F);
      OpenGL.glTexCoord2f(var12 * (float)(var3 - var8), var13 * (float)(var4 - var9));
      OpenGL.glVertex2f((float)var3 + var14 + 0.35F, (float)var4 + var15 + 0.35F);
      OpenGL.glEnd();
      this.method7020(0, 5890, 768);
   }

   public void method1974(int var1, int var2, int var3, int var4, int var5, int var6, Class1024 var7, int var8, int var9, int var10, int var11, int var12) {
      if(var1 != var3 || var2 != var4) {
         Class1024_Sub1 var13 = (Class1024_Sub1)var7;
         OGLTexture_Sub3_Sub1 var14 = var13.anOGLTexture_Sub3_Sub1_10747;
         this.method7067();
         this.setTextureRenderer(var13.anOGLTexture_Sub3_Sub1_10747);
         this.setBlendFunc(var6);
         this.setTexEnv(7681, 8448);
         this.method7020(0, '\u8577', 768);
         float var15 = var14.textureX / (float)var14.textureWidth;
         float var16 = var14.textureY / (float)var14.textureHeight;
         float var17 = (float)var3 - (float)var1;
         float var18 = (float)var4 - (float)var2;
         float var19 = (float)(1.0D / Math.sqrt((double)(var17 * var17 + var18 * var18)));
         var17 *= var19;
         var18 *= var19;
         OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
         var12 %= var11 + var10;
         float var20 = var17 * (float)var10;
         float var21 = var18 * (float)var10;
         float var22 = 0.0F;
         float var23 = 0.0F;
         float var24 = var20;
         float var25 = var21;
         if(var12 > var10) {
            var22 = var17 * (float)(var10 + var11 - var12);
            var23 = var18 * (float)(var10 + var11 - var12);
         } else {
            var24 = var17 * (float)(var10 - var12);
            var25 = var18 * (float)(var10 - var12);
         }

         float var26 = (float)var1 + 0.35F + var22;
         float var27 = (float)var2 + 0.35F + var23;
         float var28 = var17 * (float)var11;
         float var29 = var18 * (float)var11;

         while(true) {
            if(var3 > var1) {
               if(var26 > (float)var3 + 0.35F) {
                  break;
               }

               if(var26 + var24 > (float)var3) {
                  var24 = (float)var3 - var26;
               }
            } else {
               if(var26 < (float)var3 + 0.35F) {
                  break;
               }

               if(var26 + var24 < (float)var3) {
                  var24 = (float)var3 - var26;
               }
            }

            if(var4 > var2) {
               if(var27 > (float)var4 + 0.35F) {
                  break;
               }

               if(var27 + var25 > (float)var4) {
                  var25 = (float)var4 - var27;
               }
            } else {
               if(var27 < (float)var4 + 0.35F) {
                  break;
               }

               if(var27 + var25 < (float)var4) {
                  var25 = (float)var4 - var27;
               }
            }

            OpenGL.glBegin(1);
            OpenGL.glTexCoord2f(var15 * (var26 - (float)var8), var16 * (var27 - (float)var9));
            OpenGL.glVertex2f(var26, var27);
            OpenGL.glTexCoord2f(var15 * (var26 + var24 - (float)var8), var16 * (var27 + var25 - (float)var9));
            OpenGL.glVertex2f(var26 + var24, var27 + var25);
            OpenGL.glEnd();
            var26 += var28 + var24;
            var27 += var29 + var25;
            var24 = var20;
            var25 = var21;
         }

         this.method7020(0, 5890, 768);
      }
   }

   public void method1956(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      OpenGL.glLineWidth((float)var6);
      this.method1968(var1, var2, var3, var4, var5, var7);
      OpenGL.glLineWidth(1.0F);
   }

   public void getScreenPosVisible(float var1, float var2, float var3, float[] var4) {
      float var5 = this.anArrayViewport_10306.data[14] + this.anArrayViewport_10306.data[2] * var1 + this.anArrayViewport_10306.data[6] * var2 + this.anArrayViewport_10306.data[10] * var3;
      float var6 = this.anArrayViewport_10306.data[15] + this.anArrayViewport_10306.data[3] * var1 + this.anArrayViewport_10306.data[7] * var2 + this.anArrayViewport_10306.data[11] * var3;
      if(var5 >= -var6 && var5 <= var6) {
         float var7 = this.anArrayViewport_10306.data[12] + this.anArrayViewport_10306.data[0] * var1 + this.anArrayViewport_10306.data[4] * var2 + this.anArrayViewport_10306.data[8] * var3;
         if(var7 >= -var6 && var7 <= var6) {
            float var8 = this.anArrayViewport_10306.data[13] + this.anArrayViewport_10306.data[1] * var1 + this.anArrayViewport_10306.data[5] * var2 + this.anArrayViewport_10306.data[9] * var3;
            if(var8 >= -var6 && var8 <= var6) {
               float var9 = this.anArrayViewport_10355.data[14] + this.anArrayViewport_10355.data[2] * var1 + this.anArrayViewport_10355.data[6] * var2 + this.anArrayViewport_10355.data[10] * var3;
               var4[0] = this.aFloat_10395 + this.aFloat_10363 * var7 / var6;
               var4[1] = this.aFloat_10364 + this.aFloat_10365 * var8 / var6;
               var4[2] = var9;
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }
   }

   public int method1978(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = this.anArrayViewport_10306.data[14] + this.anArrayViewport_10306.data[2] * (float)var1 + this.anArrayViewport_10306.data[6] * (float)var2 + this.anArrayViewport_10306.data[10] * (float)var3;
      float var9 = this.anArrayViewport_10306.data[14] + this.anArrayViewport_10306.data[2] * (float)var4 + this.anArrayViewport_10306.data[6] * (float)var5 + this.anArrayViewport_10306.data[10] * (float)var6;
      float var10 = this.anArrayViewport_10306.data[15] + this.anArrayViewport_10306.data[3] * (float)var1 + this.anArrayViewport_10306.data[7] * (float)var2 + this.anArrayViewport_10306.data[11] * (float)var3;
      float var11 = this.anArrayViewport_10306.data[15] + this.anArrayViewport_10306.data[3] * (float)var4 + this.anArrayViewport_10306.data[7] * (float)var5 + this.anArrayViewport_10306.data[11] * (float)var6;
      if(var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if(var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.anArrayViewport_10306.data[12] + this.anArrayViewport_10306.data[0] * (float)var1 + this.anArrayViewport_10306.data[4] * (float)var2 + this.anArrayViewport_10306.data[8] * (float)var3;
      float var13 = this.anArrayViewport_10306.data[12] + this.anArrayViewport_10306.data[0] * (float)var4 + this.anArrayViewport_10306.data[4] * (float)var5 + this.anArrayViewport_10306.data[8] * (float)var6;
      if(var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if(var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = this.anArrayViewport_10306.data[13] + this.anArrayViewport_10306.data[1] * (float)var1 + this.anArrayViewport_10306.data[5] * (float)var2 + this.anArrayViewport_10306.data[9] * (float)var3;
      float var15 = this.anArrayViewport_10306.data[13] + this.anArrayViewport_10306.data[1] * (float)var4 + this.anArrayViewport_10306.data[5] * (float)var5 + this.anArrayViewport_10306.data[9] * (float)var6;
      if(var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if(var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   public Class240_Sub51 method1926(int var1) {
      Class240_Sub51_Sub2 var2 = new Class240_Sub51_Sub2(var1);
      this.aNodeList_10334.addNode(var2, (short)10751);
      return var2;
   }

   public final synchronized void cleanup(int var1) {
      int var2 = 0;
      var1 &= Integer.MAX_VALUE;

      IndexNode var3;
      while(!this.aNodeList_10307.isEmpty(1943471165)) {
         var3 = (IndexNode)this.aNodeList_10307.returnShift((byte)64);
         anIntArray_10346[var2++] = (int)(var3.id * 4058728944299054175L);
         this.anInt_10336 -= var3.cacheID * 523939595;
         if(var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, anIntArray_10346, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, anIntArray_10346, 0);
         var2 = 0;
      }

      while(!this.aNodeList_10340.isEmpty(1381540946)) {
         var3 = (IndexNode)this.aNodeList_10340.returnShift((byte)-48);
         anIntArray_10346[var2++] = (int)(var3.id * 4058728944299054175L);
         this.anInt_10347 -= var3.cacheID * 523939595;
         if(var2 == 1000) {
            OpenGL.glDeleteTextures(var2, anIntArray_10346, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteTextures(var2, anIntArray_10346, 0);
         var2 = 0;
      }

      while(!this.aNodeList_10341.isEmpty(1692874162)) {
         var3 = (IndexNode)this.aNodeList_10341.returnShift((byte)-24);
         anIntArray_10346[var2++] = var3.cacheID * 523939595;
         if(var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, anIntArray_10346, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, anIntArray_10346, 0);
         var2 = 0;
      }

      while(!this.aNodeList_10422.isEmpty(1416237660)) {
         var3 = (IndexNode)this.aNodeList_10422.returnShift((byte)-8);
         anIntArray_10346[var2++] = (int)(var3.id * 4058728944299054175L);
         this.anInt_10384 -= var3.cacheID * 523939595;
         if(var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, anIntArray_10346, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, anIntArray_10346, 0);
         boolean var5 = false;
      }

      while(!this.aNodeList_10277.isEmpty(2099223368)) {
         var3 = (IndexNode)this.aNodeList_10277.returnShift((byte)-30);
         OpenGL.glDeleteLists((int)(var3.id * 4058728944299054175L), var3.cacheID * 523939595);
      }

      NodeListNode var4;
      while(!this.aNodeList_10343.isEmpty(1657395429)) {
         var4 = this.aNodeList_10343.returnShift((byte)-48);
         OpenGL.glDeleteProgramARB((int)(var4.id * 4058728944299054175L));
      }

      while(!this.aNodeList_10401.isEmpty(1943003674)) {
         var4 = this.aNodeList_10401.returnShift((byte)-84);
         OpenGL.glDeleteShader((int)(var4.id * 4058728944299054175L));
      }

      while(!this.aNodeList_10277.isEmpty(1918491969)) {
         var3 = (IndexNode)this.aNodeList_10277.returnShift((byte)48);
         OpenGL.glDeleteLists((int)(var3.id * 4058728944299054175L), var3.cacheID * 523939595);
      }

      this.aClass173_10320.method2179();
      if(this.getHeap() > 100663296 && Class373.getCurrentTime((short)24999) > this.aLong_10345 + 60000L) {
         System.gc();
         this.aLong_10345 = Class373.getCurrentTime((short)8624);
      }

      this.lastCleanup = var1;
   }

   public Sprite method1930(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return new OpenGLSprite(this, var4, var5, var1, var2, var3);
   }

   public Sprite method1932(int var1, int var2, int var3, int var4, boolean var5) {
      return new OpenGLSprite(this, var1, var2, var3, var4);
   }

   public Class1024 method1910(int var1, int var2, int[] var3, int[] var4) {
      return Class1024_Sub1.createBlankImage(this, var1, var2, var3, var4);
   }

   public void method1938(int var1) {}

   public Model createModel(ModelData var1, int var2, int var3, int var4, int var5) {
      return new Class165_Sub2(this, var1, var2, var4, var5, var3);
   }

   public int method1940(int var1, int var2) {
      return var1 & var2 ^ var2;
   }

   public int method1941(int var1, int var2) {
      return var1 | var2;
   }

   final void method6957(int var1) {
      this.method7015(var1, true);
   }

   public final void method1887(int var1, int var2, int var3, int var4) {
      this.aClass146_10296.method1819(var1, var2, var3, var4);
   }

   public Viewport method1979() {
      return this.aViewport_10388;
   }

   public void method1958(int var1, Class105 var2) {
      if(!this.aBoolean_10413) {
         throw new RuntimeException("");
      } else {
         this.anInt_10415 = var1;
         this.aClass105_10342 = var2;
         if(this.aBoolean_10414) {
            this.aClass156_10321.aClass161_Sub5_2768.method7422();
            this.aClass156_10321.aClass161_Sub5_2768.method7418();
         }

      }
   }

   public void method1981() {
      this.aBoolean_10413 = false;
   }

   public void method1993(int var1, Class240_Sub53[] var2) {
      for(int var3 = 0; var3 < var1; ++var3) {
         this.aClass240_Sub53Array_10400[var3] = var2[var3];
      }

      this.anInt_10354 = var1;
      if(this.anInt_10374 != 1) {
         this.method7053();
      }

   }

   public final ArrayViewport method1984() {
      return new ArrayViewport(this.anArrayViewport_10416);
   }

   public void method1970(float var1, float var2) {
      this.aFloat_10366 = var1;
      this.aFloat_10367 = var2;
      this.method6971();
   }

   public final void method1913(int[] var1) {
      var1[0] = this.anInt_10378;
      var1[1] = this.anInt_10376;
      var1[2] = this.anInt_10379;
      var1[3] = this.anInt_10377;
   }

   public final void method1967() {
      if(this.aClass174_2815 != null) {
         this.anInt_10378 = 0;
         this.anInt_10376 = 0;
         this.anInt_10379 = this.aClass174_2815.method2194();
         this.anInt_10377 = this.aClass174_2815.method2198();
         OpenGL.glDisable(3089);
      }
   }

   public final void method1965(int var1, int var2, int var3, int var4) {
      if(this.aClass174_2815 != null) {
         if(var1 < 0) {
            var1 = 0;
         }

         if(var3 > this.aClass174_2815.method2194()) {
            var3 = this.aClass174_2815.method2194();
         }

         if(var2 < 0) {
            var2 = 0;
         }

         if(var4 > this.aClass174_2815.method2198()) {
            var4 = this.aClass174_2815.method2198();
         }

         this.anInt_10378 = var1;
         this.anInt_10376 = var2;
         this.anInt_10379 = var3;
         this.anInt_10377 = var4;
         OpenGL.glEnable(3089);
         this.method6972();
      }
   }

   public final void method1911(int var1, int var2, int var3, int var4) {
      if(this.anInt_10378 < var1) {
         this.anInt_10378 = var1;
      }

      if(this.anInt_10379 > var3) {
         this.anInt_10379 = var3;
      }

      if(this.anInt_10376 < var2) {
         this.anInt_10376 = var2;
      }

      if(this.anInt_10377 > var4) {
         this.anInt_10377 = var4;
      }

      OpenGL.glEnable(3089);
      this.method6972();
   }

   final void method6969(int var1, int var2) {
      this.anInt_10380 = var1;
      this.anInt_10381 = var2;
      this.method6970();
      this.method6972();
   }

   final void method6970() {
      if(this.aClass174_2815 != null) {
         int var1;
         int var2;
         int var3;
         int var4;
         if(this.anInt_10374 == 2) {
            var1 = this.anInt_10339;
            var2 = this.anInt_10383;
            var3 = this.anInt_10278;
            var4 = this.anInt_10385;
         } else {
            var1 = 0;
            var2 = 0;
            var3 = this.aClass174_2815.method2194();
            var4 = this.aClass174_2815.method2198();
         }

         if(var3 < 1) {
            var3 = 1;
         }

         if(var4 < 1) {
            var4 = 1;
         }

         OpenGL.glViewport(this.anInt_10380 + var1, this.anInt_10381 + this.aClass174_2815.method2198() - var2 - var4, var3, var4);
         this.aFloat_10363 = (float)this.anInt_10278 / 2.0F;
         this.aFloat_10365 = (float)this.anInt_10385 / 2.0F;
         this.aFloat_10395 = (float)this.anInt_10339 + this.aFloat_10363;
         this.aFloat_10364 = (float)this.anInt_10383 + this.aFloat_10365;
      }

   }

   final void method6971() {
      if(this.anInt_10374 == 2) {
         OpenGL.glDepthRange(this.aFloat_10366, this.aFloat_10367);
      } else {
         OpenGL.glDepthRange(0.0F, 1.0F);
      }

   }

   final void method6972() {
      if(this.aClass174_2815 != null && this.anInt_10378 < this.anInt_10379 && this.anInt_10376 < this.anInt_10377) {
         OpenGL.glScissor(this.anInt_10380 + this.anInt_10378, this.anInt_10381 + this.aClass174_2815.method2198() - this.anInt_10377, this.anInt_10379 - this.anInt_10378, this.anInt_10377 - this.anInt_10376);
      } else {
         OpenGL.glScissor(0, 0, 0, 0);
      }

   }

   final void method6973() {
      OpenGL.glPushMatrix();
   }

   final void method6974(ArrayViewport var1) {
      OpenGL.glLoadMatrixf(var1.data, 0);
   }

   final void method6975() {
      OpenGL.glPopMatrix();
   }

   public final void setViewport(Viewport var1) {
      this.aViewport_10460.setAs(var1);
      this.anArrayViewport_10355.setViewport(this.aViewport_10460);
      this.aViewport_10370.setAs(var1);
      this.aViewport_10370.method4642();
      this.anArrayViewport_10356.setViewport(this.aViewport_10370);
      this.method6980();
      if(this.anInt_10374 != 1) {
         this.method7040();
      }

   }

   public Viewport getViewport() {
      return new Viewport(this.aViewport_10460);
   }

   final void method6978() {
      if(this.anInt_10374 != 2) {
         this.anInt_10374 = 2;
         this.method6923(this.anArrayViewport_10416.data);
         this.method7040();
         this.method6970();
         this.method6971();
         this.anInt_10350 &= -8;
      }

   }

   final void method6979() {
      this.aFloat_10369 = this.anArrayViewport_10416.method4565();
      this.aFloat_10275 = this.anArrayViewport_10416.method4564();
      this.method7014();
      if(this.anInt_10374 == 2) {
         this.method6923(this.anArrayViewport_10416.data);
      } else if(this.anInt_10374 == 1) {
         this.method6923(this.anArrayViewport_10358.data);
      }

   }

   final void method6980() {
      this.anArrayViewport_10306.replaceWith(this.anArrayViewport_10355);
      this.anArrayViewport_10306.method4580(this.anArrayViewport_10416);
      this.anArrayViewport_10306.method4584(this.aFloatArrayArray_10360[0]);
      this.anArrayViewport_10306.method4582(this.aFloatArrayArray_10360[1]);
      this.anArrayViewport_10306.method4583(this.aFloatArrayArray_10360[2]);
      this.anArrayViewport_10306.method4567(this.aFloatArrayArray_10360[3]);
      this.anArrayViewport_10306.method4568(this.aFloatArrayArray_10360[4]);
      this.anArrayViewport_10306.method4553(this.aFloatArrayArray_10360[5]);
   }

   public int method1994() {
      return 4;
   }

   final void method6982(boolean var1) {
      if(var1 != this.aBoolean_10438) {
         this.aBoolean_10438 = var1;
         this.method7027();
      }

   }

   void method6983() {
      this.method6934();
   }

   public final void method1946(ArrayViewport var1) {
      this.anArrayViewport_10416.replaceWith(var1);
      this.method6980();
      this.method6979();
   }

   final void method6985(float var1, float var2) {
      this.aFloat_10411 = var1;
      this.aFloat_10412 = var2;
      this.method7014();
   }

   void method6986() {
      aFloatArray_10382[0] = this.aFloat_10421 * this.aFloat_10394;
      aFloatArray_10382[1] = this.aFloat_10421 * this.aFloat_10318;
      aFloatArray_10382[2] = this.aFloat_10421 * this.aFloat_10280;
      aFloatArray_10382[3] = 1.0F;
      OpenGL.glLightModelfv(2899, aFloatArray_10382, 0);
   }

   void method6987() {
      aFloatArray_10382[0] = this.aFloat_10357 * this.aFloat_10394;
      aFloatArray_10382[1] = this.aFloat_10357 * this.aFloat_10318;
      aFloatArray_10382[2] = this.aFloat_10357 * this.aFloat_10280;
      aFloatArray_10382[3] = 1.0F;
      OpenGL.glLightfv(16384, 4609, aFloatArray_10382, 0);
      aFloatArray_10382[0] = -this.aFloat_10294 * this.aFloat_10394;
      aFloatArray_10382[1] = -this.aFloat_10294 * this.aFloat_10318;
      aFloatArray_10382[2] = -this.aFloat_10294 * this.aFloat_10280;
      aFloatArray_10382[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, aFloatArray_10382, 0);
   }

   void method6988() {
      OpenGL.glLightfv(16384, 4611, this.aFloatArray_10391, 0);
      OpenGL.glLightfv(16385, 4611, this.aFloatArray_10392, 0);
   }

   void method6989() {
      if(this.aBoolean_10314 && this.anInt_10457 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   public void method1908() {
      this.anInt_10339 = 0;
      this.anInt_10383 = 0;
      this.anInt_10278 = this.aClass174_2815.method2194();
      this.anInt_10385 = this.aClass174_2815.method2198();
      this.method6970();
   }

   public Class177 method1952(int var1) {
      return this.supportsTextureCubeMap?new Class177_Sub2_Sub1(this, var1):null;
   }

   public Class177 method1985(Class177 var1, Class177 var2, float var3, Class177 var4) {
      if(var1 != null && var2 != null && this.supportsTextureCubeMap && this.supportsFrameBuffer) {
         Class177_Sub2_Sub2 var5 = null;
         Class177_Sub2 var6 = (Class177_Sub2)var1;
         Class177_Sub2 var7 = (Class177_Sub2)var2;
         OGLTexture_Sub2 var8 = var6.method7357();
         OGLTexture_Sub2 var9 = var7.method7357();
         if(var8 != null && var9 != null) {
            int var10 = var8.anInt_8391 > var9.anInt_8391?var8.anInt_8391:var9.anInt_8391;
            if(var1 != var4 && var2 != var4 && var4 instanceof Class177_Sub2_Sub2) {
               Class177_Sub2_Sub2 var11 = (Class177_Sub2_Sub2)var4;
               if(var11.method1350() == var10) {
                  var5 = var11;
               }
            }

            if(var5 == null) {
               var5 = new Class177_Sub2_Sub2(this, var10);
            }

            if(var5.method1351(var8, var9, var3)) {
               return var5;
            }
         }
      }

      return var3 < 0.5F?var1:var2;
   }

   public final void method1925(Class177 var1) {
      this.aClass177_Sub2_10337 = (Class177_Sub2)var1;
   }

   final OGLTexture_Sub2 method6994() {
      return this.aClass177_Sub2_10337 != null?this.aClass177_Sub2_10337.method7357():null;
   }

   public final boolean method1953() {
      if(this.aClass240_Sub40_Sub1_10323 != null) {
         if(!this.aClass240_Sub40_Sub1_10323.method4923()) {
            if(!this.aClass146_10296.method1821(this.aClass240_Sub40_Sub1_10323)) {
               return false;
            }

            this.aClass173_10320.method2180();
         }

         return true;
      } else {
         return false;
      }
   }

   public final void method1990() {
      if(this.aClass240_Sub40_Sub1_10323 != null && this.aClass240_Sub40_Sub1_10323.method4923()) {
         this.aClass146_10296.method1822(this.aClass240_Sub40_Sub1_10323);
         this.aClass173_10320.method2180();
      }

   }

   public final boolean method1989() {
      return this.aClass240_Sub40_Sub1_10323 != null && this.aClass240_Sub40_Sub1_10323.method4923();
   }

   public void method1991(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
      float var10;
      float var11;
      if(this.anOGLTexture_Sub3_Sub1_10344 != null && this.anOGLTexture_Sub3_Sub1_10344.anInt_8398 >= var3 && this.anOGLTexture_Sub3_Sub1_10344.anInt_8399 >= var4) {
         this.anOGLTexture_Sub3_Sub1_10344.method5443(0, 0, var3, var4, var7, Class136.aClass136_2626, 0, 0, false);
         var10 = this.anOGLTexture_Sub3_Sub1_10344.textureY * (float)var4 / (float)this.anOGLTexture_Sub3_Sub1_10344.anInt_8399;
         var11 = this.anOGLTexture_Sub3_Sub1_10344.textureX * (float)var3 / (float)this.anOGLTexture_Sub3_Sub1_10344.anInt_8398;
      } else {
         this.anOGLTexture_Sub3_Sub1_10344 = OGLTexture_Sub3_Sub1.method1212(this, Class136.aClass136_2626, Class87.aClass87_1759, var3, var4, false, var7, Class136.aClass136_2626);
         this.anOGLTexture_Sub3_Sub1_10344.method5442(false, false);
         var10 = this.anOGLTexture_Sub3_Sub1_10344.textureY;
         var11 = this.anOGLTexture_Sub3_Sub1_10344.textureX;
      }

      this.method7067();
      this.setTextureRenderer(this.anOGLTexture_Sub3_Sub1_10344);
      this.setBlendFunc(var9);
      OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
      this.method7022(var6);
      this.setTexEnv('\u8575', '\u8575');
      this.method7020(0, '\u8576', 768);
      this.method7020(2, 5890, 770);
      this.method7055(0, '\u8576', 770);
      this.method7055(2, 5890, 770);
      float var12 = (float)var1;
      float var13 = (float)var2;
      float var14 = var12 + (float)var3;
      float var15 = var13 + (float)var4;
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var12, var13);
      OpenGL.glTexCoord2f(0.0F, var11);
      OpenGL.glVertex2f(var12, var15);
      OpenGL.glTexCoord2f(var10, var11);
      OpenGL.glVertex2f(var14, var15);
      OpenGL.glTexCoord2f(var10, 0.0F);
      OpenGL.glVertex2f(var14, var13);
      OpenGL.glEnd();
      this.method7020(0, 5890, 768);
      this.method7020(2, '\u8576', 770);
      this.method7055(0, 5890, 770);
      this.method7055(2, '\u8576', 770);
   }

   public final void method1973() {
      this.aClass146_10296.method1820();
   }

   public Class174_Sub1 method1890() {
      return new Class174_Sub1_Sub2(this);
   }

   public Class99 method1905(int var1, int var2, int var3) {
      return new Class240_Sub22_Sub18(this, Class136.aClass136_2629, Class87.aClass87_1762, var1, var2, var3);
   }

   public Class101 method1927(int var1, int var2, Class136 var3, Class87 var4, int var5) {
      return new Class240_Sub22_Sub18(this, var3, var4, var1, var2, var5);
   }

   final Class166 method7003(int var1, byte[] var2, int var3, boolean var4) {
      return (Class166)(this.supportsVBuffer && (!var4 || this.allowsVBuffer)?new Class141_Sub2(this, var1, var2, var3, var4):new Class157_Sub1(this, var1, var2, var3));
   }

   final OGLBuffer createOGLBuffer(int var1, byte[] var2, int var3, boolean var4) {
      return (OGLBuffer)(this.supportsVBuffer && (!var4 || this.allowsVBuffer)?new OGLVBuffer(this, var1, var2, var3, var4):new Class157_Sub2(this, var1, var2, var3));
   }

   final OGLBuffer createOGLBuffer(int var1, Buffer var2, int var3, boolean var4) {
      return (OGLBuffer)(this.supportsVBuffer && (!var4 || this.allowsVBuffer)?new OGLVBuffer(this, var1, var2, var3, var4):new Class157_Sub2(this, var1, var2));
   }

   final void bindBuffer(OGLBuffer var1) {
      if(this.anOGLBuffer_10418 != var1) {
         if(this.supportsVBuffer) {
            OpenGL.glBindBufferARB('\u8892', var1.method1868());
         }

         this.anOGLBuffer_10418 = var1;
      }

   }

   final void method7007(Class166 var1) {
      if(this.aClass166_10417 != var1) {
         if(this.supportsVBuffer) {
            OpenGL.glBindBufferARB('\u8893', var1.method2071());
         }

         this.aClass166_10417 = var1;
      }

   }

   final void method7008(int var1, int var2, int var3) {
      OpenGL.glDrawArrays(var1, var2, var3);
   }

   final void method7009(Class166 var1, int var2, int var3, int var4) {
      this.method7007(var1);
      OpenGL.glDrawElements(var2, var4, 5123, var1.getAddress() + (long)(var3 * 2));
   }

   public boolean method1892() {
      return true;
   }

   final void method7011() {
      if(this.anInt_10374 != 0) {
         this.anInt_10374 = 0;
         this.method6970();
         this.method6971();
         this.anInt_10350 &= -16;
      }

   }

   final void method7012() {
      if(this.anInt_10350 != 4) {
         this.method7048();
         this.method7026(false);
         this.method7066(false);
         this.method7028(false);
         this.method7029(false);
         this.method6957(-2);
         this.setBlendFunc(1);
         this.anInt_10350 = 4;
      }

   }

   final void method7013() {
      if(this.anInt_10350 != 8) {
         this.method6978();
         this.method7026(true);
         this.method7028(true);
         this.method7029(true);
         this.setBlendFunc(1);
         this.anInt_10350 = 8;
      }

   }

   void method7014() {
      this.aFloat_10468 = this.aFloat_10369 - (float)this.anInt_10408 - this.aFloat_10412;
      this.aFloat_10409 = this.aFloat_10468 - (float)this.anInt_10457 * this.aFloat_10411;
      if(this.aFloat_10409 < this.aFloat_10275) {
         this.aFloat_10409 = this.aFloat_10275;
      }

      OpenGL.glFogf(2915, this.aFloat_10409);
      OpenGL.glFogf(2916, this.aFloat_10468);
      aFloatArray_10382[0] = (float)(this.anInt_10291 & 16711680) / 1.671168E7F;
      aFloatArray_10382[1] = (float)(this.anInt_10291 & '\uff00') / 65280.0F;
      aFloatArray_10382[2] = (float)(this.anInt_10291 & 255) / 255.0F;
      OpenGL.glFogfv(2918, aFloatArray_10382, 0);
   }

   final void method7015(int var1, boolean var2) {
      this.method7068(var1, var2, true);
   }

   final void setTextureRenderer(OGLTexture var1) {
      OGLTexture var2 = this.anOGLTextureArray_10424[this.currentTexture];
      if(var2 != var1) {
         if(var1 != null) {
            if(var2 != null) {
               if(var1.texSubDubTexture != var2.texSubDubTexture) {
                  OpenGL.glDisable(var2.texSubDubTexture);
                  OpenGL.glEnable(var1.texSubDubTexture);
               }
            } else {
               OpenGL.glEnable(var1.texSubDubTexture);
            }

            OpenGL.glBindTexture(var1.texSubDubTexture, var1.loadedTexture);
         } else {
            OpenGL.glDisable(var2.texSubDubTexture);
         }

         this.anOGLTextureArray_10424[this.currentTexture] = var1;
      }

      this.anInt_10350 &= -2;
   }

   final void setTextureEnv(int var1) {
      if(var1 == 1) {
         this.setTexEnv(7681, 7681);
      } else if(var1 == 0) {
         this.setTexEnv(8448, 8448);
      } else if(var1 == 2) {
         this.setTexEnv('\u8575', 7681);
      } else if(var1 == 3) {
         this.setTexEnv(260, 8448);
      } else if(var1 == 4) {
         this.setTexEnv('\u84e7', '\u84e7');
      }

   }

   final int method7018(int var1) {
      if(var1 == 1) {
         return 7681;
      } else if(var1 == 0) {
         return 8448;
      } else if(var1 == 2) {
         return '\u8575';
      } else if(var1 == 3) {
         return 260;
      } else if(var1 == 4) {
         return '\u84e7';
      } else {
         throw new IllegalArgumentException();
      }
   }

   final void setTexEnv(int var1, int var2) {
      if(this.currentTexture == 0) {
         boolean var3 = false;
         if(this.anInt_10335 != var1) {
            OpenGL.glTexEnvi(8960, '\u8571', var1);
            this.anInt_10335 = var1;
            var3 = true;
         }

         if(this.anInt_10463 != var2) {
            OpenGL.glTexEnvi(8960, '\u8572', var2);
            this.anInt_10463 = var2;
            var3 = true;
         }

         if(var3) {
            this.anInt_10350 &= -14;
         }
      } else {
         OpenGL.glTexEnvi(8960, '\u8571', var1);
         OpenGL.glTexEnvi(8960, '\u8572', var2);
      }

   }

   final void method7020(int var1, int var2, int var3) {
      OpenGL.glTexEnvi(8960, '\u8580' + var1, var2);
      OpenGL.glTexEnvi(8960, '\u8590' + var1, var3);
   }

   public void method1909(int var1, int var2, int var3, int var4) {
      this.anInt_10339 = var1;
      this.anInt_10383 = var2;
      this.anInt_10278 = var3;
      this.anInt_10385 = var4;
      this.method6970();
   }

   final void method7022(int var1) {
      aFloatArray_10382[0] = (float)(var1 & 16711680) / 1.671168E7F;
      aFloatArray_10382[1] = (float)(var1 & '\uff00') / 65280.0F;
      aFloatArray_10382[2] = (float)(var1 & 255) / 255.0F;
      aFloatArray_10382[3] = (float)(var1 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, aFloatArray_10382, 0);
   }

   final void method7023(float var1, float var2, float var3, float var4) {
      aFloatArray_10382[0] = var1;
      aFloatArray_10382[1] = var2;
      aFloatArray_10382[2] = var3;
      aFloatArray_10382[3] = var4;
      OpenGL.glTexEnvfv(8960, 8705, aFloatArray_10382, 0);
   }

   final void method7024(float var1, float var2, float var3) {
      OpenGL.glMatrixMode(5890);
      if(this.aBoolean_10432) {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glTranslatef(var1, var2, var3);
      OpenGL.glMatrixMode(5888);
      this.aBoolean_10432 = true;
   }

   final void method7025() {
      if(this.aBoolean_10432) {
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         this.aBoolean_10432 = false;
      }

   }

   final void method7026(boolean var1) {
      if(var1 != this.aBoolean_10314) {
         this.aBoolean_10314 = var1;
         this.method6989();
         this.anInt_10350 &= -16;
      }

   }

   void method7027() {
      if(this.aBoolean_10387 && !this.aBoolean_10438) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   final void method7028(boolean var1) {
      if(var1 != this.aBoolean_10352) {
         if(var1) {
            OpenGL.glEnable(2929);
         } else {
            OpenGL.glDisable(2929);
         }

         this.aBoolean_10352 = var1;
         this.anInt_10350 &= -16;
      }

   }

   final void method7029(boolean var1) {
      if(var1 != this.aBoolean_10353) {
         this.aBoolean_10353 = var1;
         this.method7030();
         this.anInt_10350 &= -16;
      }

   }

   final void method7030() {
      OpenGL.glDepthMask(this.aBoolean_10353 && this.aBoolean_10389);
   }

   final void setBlendFunc(int var1) {
      if(this.anInt_10348 != var1) {
         byte var2;
         boolean var3;
         boolean var4;
         if(var1 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
         } else if(var1 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
         } else if(var1 == 128) {
            var2 = 3;
            var3 = true;
            var4 = true;
         } else {
            var2 = 0;
            var3 = true;
            var4 = false;
         }

         if(var3 != this.aBoolean_10361) {
            OpenGL.glColorMask(var3, var3, var3, true);
            this.aBoolean_10361 = var3;
         }

         if(var4 != this.aBoolean_10351) {
            if(var4) {
               OpenGL.glEnable(3008);
            } else {
               OpenGL.glDisable(3008);
            }

            this.aBoolean_10351 = var4;
         }

         if(var2 != this.anInt_10349) {
            if(var2 == 1) {
               OpenGL.glEnable(3042);
               OpenGL.glBlendFunc(770, 771);
            } else if(var2 == 2) {
               OpenGL.glEnable(3042);
               OpenGL.glBlendFunc(1, 1);
            } else if(var2 == 3) {
               OpenGL.glEnable(3042);
               OpenGL.glBlendFunc(774, 1);
            } else {
               OpenGL.glDisable(3042);
            }

            this.anInt_10349 = var2;
         }

         this.anInt_10348 = var1;
         this.anInt_10350 &= -13;
      }

   }

   public final int getHeap() {
      return this.anInt_10336 + this.anInt_10347 + this.anInt_10384;
   }

   public void method1934(int var1, Class1024 var2, int var3, int var4) {
      Class1024_Sub1 var5 = (Class1024_Sub1)var2;
      OGLTexture_Sub3_Sub1 var6 = var5.anOGLTexture_Sub3_Sub1_10747;
      this.method7067();
      this.setTextureRenderer(var5.anOGLTexture_Sub3_Sub1_10747);
      this.setBlendFunc(1);
      this.setTexEnv(7681, 8448);
      this.method7020(0, '\u8577', 768);
      float var7 = var6.textureX / (float)var6.textureWidth;
      float var8 = var6.textureY / (float)var6.textureHeight;
      OpenGL.glColor4ub((byte)(var1 >> 16), (byte)(var1 >> 8), (byte)var1, (byte)(var1 >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(var7 * (float)(this.anInt_10378 - var3), var8 * (float)(this.anInt_10376 - var4));
      OpenGL.glVertex2i(this.anInt_10378, this.anInt_10376);
      OpenGL.glTexCoord2f(var7 * (float)(this.anInt_10378 - var3), var8 * (float)(this.anInt_10377 - var4));
      OpenGL.glVertex2i(this.anInt_10378, this.anInt_10377);
      OpenGL.glTexCoord2f(var7 * (float)(this.anInt_10379 - var3), var8 * (float)(this.anInt_10377 - var4));
      OpenGL.glVertex2i(this.anInt_10379, this.anInt_10377);
      OpenGL.glTexCoord2f(var7 * (float)(this.anInt_10379 - var3), var8 * (float)(this.anInt_10376 - var4));
      OpenGL.glVertex2i(this.anInt_10379, this.anInt_10376);
      OpenGL.glEnd();
      this.method7020(0, 5890, 768);
   }

   final synchronized void method7034(int var1, int var2) {
      IndexNode var3 = new IndexNode(var2);
      var3.id = (long)var1 * -3961580539627386977L;
      this.aNodeList_10307.addNode(var3, (short)-19252);
   }

   final synchronized void method7035(int var1, int var2) {
      IndexNode var3 = new IndexNode(var2);
      var3.id = (long)var1 * -3961580539627386977L;
      this.aNodeList_10340.addNode(var3, (short)26367);
   }

   final void method7036(ArrayViewport var1) {
      OpenGL.glPushMatrix();
      OpenGL.glMultMatrixf(var1.data, 0);
   }

   final synchronized void method7037(int var1) {
      NodeListNode var2 = new NodeListNode();
      var2.id = (long)var1 * -3961580539627386977L;
      this.aNodeList_10343.addNode(var2, (short)-7630);
   }

   public Sprite method1929(int var1, int var2, boolean var3, boolean var4) {
      return new OpenGLSprite(this, var1, var2, var3);
   }

   static int method7039(Class136 var0, Class87 var1) {
      if(var1 == Class87.aClass87_1759) {
         switch(var0.anInt_2635 * 420406933) {
         case 2:
            return 6408;
         case 3:
            return 6407;
         case 4:
         case 5:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 6:
            return 6406;
         case 7:
            return 6410;
         case 9:
            return 6409;
         }
      } else if(var1 == Class87.aClass87_1763) {
         switch(var0.anInt_2635 * 420406933) {
         case 2:
            return '\u805b';
         case 3:
            return '\u8054';
         case 4:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 5:
            return '\u81a5';
         case 6:
            return '\u803e';
         case 7:
            return '\u8d7b';
         case 9:
            return '\u8042';
         }
      } else if(var1 == Class87.aClass87_1762) {
         switch(var0.anInt_2635 * 420406933) {
         case 5:
            return '\u81a6';
         default:
            throw new IllegalArgumentException();
         }
      } else if(var1 == Class87.aClass87_1766) {
         switch(var0.anInt_2635 * 420406933) {
         case 2:
            return '\u881a';
         case 3:
            return '\u881b';
         case 4:
         case 5:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 6:
            return '\u881c';
         case 7:
            return '\u881f';
         case 9:
            return '\u881e';
         }
      } else if(var1 == Class87.aClass87_1767) {
         switch(var0.anInt_2635 * 420406933) {
         case 2:
            return '\u8814';
         case 3:
            return '\u8815';
         case 4:
         case 5:
         case 8:
         default:
            throw new IllegalArgumentException();
         case 6:
            return '\u8816';
         case 7:
            return '\u8819';
         case 9:
            return '\u8818';
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   final void method7040() {
      OpenGL.glLoadIdentity();
      OpenGL.glMultMatrixf(this.anArrayViewport_10355.data, 0);
      if(this.aBoolean_10414) {
         this.aClass156_10321.aClass161_Sub5_2768.method7422();
      }

      this.method6988();
      this.method7053();
   }

   public Class99 method1918(int var1, int var2) {
      return new Class240_Sub22_Sub18(this, Class136.aClass136_2629, Class87.aClass87_1762, var1, var2);
   }

   public void method1961(boolean var1) {}

   public void method1944(Class167 var1) {
      this.aClass158_10324.method1859(this, var1);
   }

   public Plane createPlane(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new Class171_Sub1(this, var6, var7, var1, var2, var3, var4, var5);
   }

   public void method1921(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      this.method7057();
      this.setBlendFunc(var13);
      OpenGL.glBegin(4);
      OpenGL.glColor4ub((byte)(var10 >> 16), (byte)(var10 >> 8), (byte)var10, (byte)(var10 >> 24));
      OpenGL.glVertex3f((float)var1 + 0.35F, (float)var2 + 0.35F, var3);
      OpenGL.glColor4ub((byte)(var11 >> 16), (byte)(var11 >> 8), (byte)var11, (byte)(var11 >> 24));
      OpenGL.glVertex3f((float)var4 + 0.35F, (float)var5 + 0.35F, var6);
      OpenGL.glColor4ub((byte)(var12 >> 16), (byte)(var12 >> 8), (byte)var12, (byte)(var12 >> 24));
      OpenGL.glVertex3f((float)var7 + 0.35F, (float)var8 + 0.35F, var9);
      OpenGL.glEnd();
   }

   static int method7046(Class136 var0) {
      switch(var0.anInt_2635 * 420406933) {
      case 2:
         return 6408;
      case 3:
         return 6407;
      case 4:
      case 8:
      default:
         throw new IllegalStateException();
      case 5:
         return 6402;
      case 6:
         return 6406;
      case 7:
         return 6410;
      case 9:
         return 6409;
      }
   }

   final void method1955(float var1, float var2, float var3, float var4, float var5, float var6) {
      Class240_Sub40_Sub1.aFloat_1494 = var1;
      Class240_Sub40_Sub1.aFloat_1493 = var2;
      Class240_Sub40_Sub1.aFloat_1491 = var3;
   }

   final void method7048() {
      if(this.anInt_10374 != 1) {
         this.anInt_10374 = 1;
         this.method6979();
         this.method6970();
         this.method6971();
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         this.anInt_10350 &= -9;
      }

   }

   OpenGLRenderer(Canvas var1, Class163 var2, Class96 var3, int var4) {
      super(var2, var3);
      this.aClass240_Sub53Array_10400 = new Class240_Sub53[anInt_10386];
      this.anInt_10291 = -1;
      this.anInt_10457 = -1;
      this.anInt_10408 = 0;
      this.aFloat_10411 = 1.0F;
      this.aFloat_10412 = 0.0F;
      this.aBoolean_10414 = false;
      this.anInt_10335 = 8448;
      this.anInt_10463 = 8448;
      this.aFloat_10455 = -1.0F;
      this.aFloat_10456 = -1.0F;
      this.aClass165_Sub2Array_10420 = new Class165_Sub2[7];
      this.aClass165_Sub2Array_10402 = new Class165_Sub2[7];
      this.aClass240_Sub8_Sub2_10359 = new BufferDataNode(8192);
      this.anIntArray_10466 = new int[1];
      this.anIntArray_10467 = new int[1];
      this.anIntArray_10362 = new int[1];
      this.aByteArray_10469 = new byte[16384];

      try {
         this.anInt_10319 = var4;
         Class183.getLibLoader(1691021661).loadLib("jaclib", (byte)88);
         Class183.getLibLoader(-33373741).loadLib("jaggl", (byte)32);
         this.anOpenGL_10309 = new OpenGL();
         long var5 = this.anOpenGL_10309.init(var1, 8, 8, 8, 24, 0, this.anInt_10319);
         if(var5 == 0L) {
            throw new RuntimeException("");
         } else {
            this.method6915();
            int var7 = this.method6916();
            if(var7 != 0) {
               throw new RuntimeException("");
            } else {
               this.anInt_10454 = this.isBigEndian?'\u8367':5121;
               if(this.gpuType.indexOf("radeon") != -1) {
                  int var8 = 0;
                  boolean var9 = false;
                  boolean var10 = false;
                  String[] var11 = Class136.method1799(this.gpuType.replace('/', ' '), ' ', (byte)18);

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     String var13 = var11[var12];

                     try {
                        if(var13.length() > 0) {
                           if(var13.charAt(0) == 120 && var13.length() >= 3 && MapElements.method2924(var13.substring(1, 3), 2032627272)) {
                              var13 = var13.substring(1);
                              var10 = true;
                           }

                           if(var13.equals("hd")) {
                              var9 = true;
                           } else {
                              if(var13.startsWith("hd")) {
                                 var13 = var13.substring(2);
                                 var9 = true;
                              }

                              if(var13.length() >= 4 && MapElements.method2924(var13.substring(0, 4), 2099241676)) {
                                 var8 = LoadProgress.method4427(var13.substring(0, 4), 229417214);
                                 break;
                              }
                           }
                        }
                     } catch (Exception var17) {
                        ;
                     }
                  }

                  if(!var10 && !var9) {
                     if(var8 >= 7000 && var8 <= 7999) {
                        this.supportsVBuffer = false;
                     }

                     if(var8 >= 7000 && var8 <= 9250) {
                        this.supports3DTextures = false;
                     }
                  }

                  if(!var9 || var8 < 4000) {
                     this.supportsTextureFloat = false;
                  }

                  this.supportsTextureRect &= this.anOpenGL_10309.isCompatible("GL_ARB_half_float_pixel");
                  this.allowsVBuffer = this.supportsVBuffer;
                  this.aBoolean_10430 = true;
               }

               if(this.aString_10428.indexOf("intel") != -1) {
                  this.supportsFrameBuffer = false;
               }

               this.aBoolean_10279 = !this.aString_10428.equals("s3 graphics");
               if(this.supportsVBuffer) {
                  try {
                     int[] var19 = new int[1];
                     OpenGL.glGenBuffersARB(1, var19, 0);
                  } catch (Throwable var16) {
                     throw new RuntimeException("");
                  }
               }

               Class86.method1127(false, true, (byte)-91);
               this.aBoolean_10316 = true;
               this.aClass173_10320 = new Class173(this, this.aClass96_2801);
               this.method6917();
               this.aClass145_10328 = new Class145(this);
               this.aClass146_10296 = new Class146(this);
               if(this.aClass146_10296.method1818()) {
                  this.aClass240_Sub40_Sub1_10323 = new Class240_Sub40_Sub1(this);
                  if(!this.aClass240_Sub40_Sub1_10323.method1027()) {
                     this.aClass240_Sub40_Sub1_10323.method4922();
                     this.aClass240_Sub40_Sub1_10323 = null;
                  }
               }

               this.addCanvas(var1, new Class174_Sub2_Sub1(this, var1, var5), (short)255);
               this.method1982(var1, 2038114085);
               this.aClass156_10321 = new Class156(this);
               this.method6918();
               this.method1907();
            }
         }
      } catch (Throwable var18) {
         var18.printStackTrace();
         this.method1939(-1500363801);
         if(var18 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var18;
         } else {
            throw new RuntimeException("");
         }
      }
   }

   public void enableZBuffering(boolean var1) {
      this.aBoolean_10389 = var1;
      this.method7030();
   }

   public ArrayViewport method1936() {
      return this.anArrayViewport_10325;
   }

   final void setTexture(int var1) {
      if(this.currentTexture != var1) {
         OpenGL.glActiveTexture('\u84c0' + var1);
         this.currentTexture = var1;
      }
   }

   public boolean method1992() {
      return true;
   }

   void method7053() {
      int var1;
      for(var1 = 0; var1 < this.anInt_10354; ++var1) {
         Class240_Sub53 var2 = this.aClass240_Sub53Array_10400[var1];
         int var3 = 16386 + var1;
         aFloatArray_10464[0] = (float)var2.method5274((byte)37);
         aFloatArray_10464[1] = (float)var2.method5275((byte)97);
         aFloatArray_10464[2] = (float)var2.method5276((byte)31);
         aFloatArray_10464[3] = 1.0F;
         OpenGL.glLightfv(var3, 4611, aFloatArray_10464, 0);
         int var4 = var2.method5278((byte)-120);
         float var5 = var2.method5279(-2073735422) / 255.0F;
         aFloatArray_10464[0] = (float)(var4 >> 16 & 255) * var5;
         aFloatArray_10464[1] = (float)(var4 >> 8 & 255) * var5;
         aFloatArray_10464[2] = (float)(var4 & 255) * var5;
         OpenGL.glLightfv(var3, 4609, aFloatArray_10464, 0);
         OpenGL.glLightf(var3, 4617, 1.0F / (float)(var2.method5277(-1932051005) * var2.method5277(-1932051005)));
         OpenGL.glEnable(var3);
      }

      while(var1 < this.anInt_10458) {
         OpenGL.glDisable(16386 + var1);
         ++var1;
      }

      this.anInt_10458 = this.anInt_10354;
   }

   final synchronized void method7054(long var1) {
      NodeListNode var3 = new NodeListNode();
      var3.id = var1 * -3961580539627386977L;
      this.aNodeList_10401.addNode(var3, (short)13649);
   }

   final void method7055(int var1, int var2, int var3) {
      OpenGL.glTexEnvi(8960, '\u8588' + var1, var2);
      OpenGL.glTexEnvi(8960, '\u8598' + var1, var3);
   }

   public Sprite loadSprite(AbstractImageData var1, boolean var2) {
      int[] var3 = var1.getPixelData(false);
      Sprite var4 = this.defineSprite(var3, 0, var1.getWidth(), var1.getWidth(), var1.getHeight());
      var4.setDimensions(var1.method1368(), var1.method1366(), var1.method1379(), var1.method1367());
      return var4;
   }

   final void method7057() {
      if(this.anInt_10350 != 1) {
         this.method7048();
         this.method7026(false);
         this.method7066(false);
         this.method7028(false);
         this.method7029(false);
         this.setTextureRenderer((OGLTexture)null);
         this.method6957(-2);
         this.setTextureEnv(1);
         this.anInt_10350 = 1;
      }

   }

   final void setPointers(OGLBufferPointer var1, OGLBufferPointer var2, OGLBufferPointer var3, OGLBufferPointer var4) {
      if(var1 != null) {
         this.bindBuffer(var1.buffer);
         OpenGL.glVertexPointer(var1.size, var1.type, this.anOGLBuffer_10418.getStride(), this.anOGLBuffer_10418.getAddress() + (long)var1.offset);
         OpenGL.glEnableClientState('\u8074');
      } else {
         OpenGL.glDisableClientState('\u8074');
      }

      if(var2 != null) {
         this.bindBuffer(var2.buffer);
         OpenGL.glNormalPointer(var2.type, this.anOGLBuffer_10418.getStride(), this.anOGLBuffer_10418.getAddress() + (long)var2.offset);
         OpenGL.glEnableClientState('\u8075');
      } else {
         OpenGL.glDisableClientState('\u8075');
      }

      if(var3 != null) {
         this.bindBuffer(var3.buffer);
         OpenGL.glColorPointer(var3.size, var3.type, this.anOGLBuffer_10418.getStride(), this.anOGLBuffer_10418.getAddress() + (long)var3.offset);
         OpenGL.glEnableClientState('\u8076');
      } else {
         OpenGL.glDisableClientState('\u8076');
      }

      if(var4 != null) {
         this.bindBuffer(var4.buffer);
         OpenGL.glTexCoordPointer(var4.size, var4.type, this.anOGLBuffer_10418.getStride(), this.anOGLBuffer_10418.getAddress() + (long)var4.offset);
         OpenGL.glEnableClientState('\u8078');
      } else {
         OpenGL.glDisableClientState('\u8078');
      }

   }

   Class174_Sub2 method1903(Canvas var1, int var2, int var3) {
      return new Class174_Sub2_Sub1(this, var1);
   }

   boolean method7060() {
      return this.aClass156_10321.method1854(3);
   }

   public final void method1948(int var1) {
      for(this.anInt_10407 = 0; var1 > 1; var1 >>= 1) {
         ++this.anInt_10407;
      }

      this.anInt_10330 = 1 << this.anInt_10407;
   }

   final synchronized void method7062(int var1, int var2) {
      IndexNode var3 = new IndexNode(var2);
      var3.id = (long)var1 * -3961580539627386977L;
      this.aNodeList_10422.addNode(var3, (short)-5680);
   }

   public void drawOutline(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)var1 + 0.35F;
      float var8 = (float)var2 + 0.35F;
      float var9 = var7 + (float)var3;
      float var10 = var8 + (float)var4;
      this.method7057();
      this.setBlendFunc(var6);
      OpenGL.glColor4ub((byte)(var5 >> 16), (byte)(var5 >> 8), (byte)var5, (byte)(var5 >> 24));
      if(this.supportsMultiSample) {
         OpenGL.glDisable('\u809d');
      }

      OpenGL.glBegin(7);
      OpenGL.glVertex2f(var7, var8);
      OpenGL.glVertex2f(var7, var10);
      OpenGL.glVertex2f(var9, var10);
      OpenGL.glVertex2f(var9, var8);
      OpenGL.glEnd();
      if(this.supportsMultiSample) {
         OpenGL.glEnable('\u809d');
      }

   }

   public final void method1947(float var1) {
      if(this.aFloat_10421 != var1) {
         this.aFloat_10421 = var1;
         this.method6986();
      }

   }

   public void method1977(int var1, int var2) {
      int var3 = 0;
      if((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if((var1 & 2) != 0) {
         this.method7029(true);
         var3 |= 256;
      }

      if((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   final void method7066(boolean var1) {
      if(var1 != this.aBoolean_10387) {
         this.aBoolean_10387 = var1;
         this.method7027();
         this.anInt_10350 &= -8;
      }

   }

   final void method7067() {
      if(this.anInt_10350 != 2) {
         this.method7048();
         this.method7026(false);
         this.method7066(false);
         this.method7028(false);
         this.method7029(false);
         this.method6957(-2);
         this.anInt_10350 = 2;
      }

   }

   final void method7068(int var1, boolean var2, boolean var3) {
      if(var1 != this.anInt_10419 || this.aBoolean_10414 != this.aBoolean_10413) {
         OGLTexture_Sub3 var4 = null;
         byte var5 = 0;
         byte var6 = 0;
         int var7 = 0;
         int var8 = this.aBoolean_10413?3:0;
         if(var1 >= 0) {
            Class183 var9 = this.aClass163_2802.method1996(var1, (byte)2);
            if(var9.anInt_3146 * -534969509 != -1) {
               var4 = this.aClass173_10320.method2177(var9);
               if(var9.aByte_3145 == 0 && var9.aByte_3157 == 0) {
                  this.method7025();
               } else {
                  this.method7024((float)(this.lastCleanup % 128000) / 1000.0F * (float)var9.aByte_3145 / 64.0F % 1.0F, (float)(this.lastCleanup % 128000) / 1000.0F * (float)var9.aByte_3157 / 64.0F % 1.0F, 0.0F);
               }

               if(!this.aBoolean_10413) {
                  var6 = var9.aByte_3170;
                  var7 = var9.anInt_3171 * -1145434627;
                  var8 = var9.aByte_3169;
               }

               var5 = var9.aByte_3155;
            } else {
               this.method7025();
            }
         } else {
            this.method7025();
         }

         this.aClass156_10321.method1856(var8, var6, var7, var2, var3);
         if(!this.aClass156_10321.method1855(var4, var5)) {
            this.setTextureRenderer(var4);
            this.setTextureEnv(var5);
         }

         this.aBoolean_10414 = this.aBoolean_10413;
         this.anInt_10419 = var1;
      }

      this.anInt_10350 &= -8;
   }

   public void method1922(int var1, int var2, int var3, int var4, int var5) {
      this.method7057();
      this.setBlendFunc(var5);
      float var6 = (float)var1 + 0.35F;
      float var7 = (float)var2 + 0.35F;
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glBegin(1);
      OpenGL.glVertex2f(var6, var7);
      OpenGL.glVertex2f(var6 + (float)var3, var7);
      OpenGL.glEnd();
   }

   public void getScreenPosHidden(float var1, float var2, float var3, float[] var4) {
      float var5 = this.anArrayViewport_10306.data[15] + this.anArrayViewport_10306.data[3] * var1 + this.anArrayViewport_10306.data[7] * var2 + this.anArrayViewport_10306.data[11] * var3;
      float var6 = this.anArrayViewport_10306.data[12] + this.anArrayViewport_10306.data[0] * var1 + this.anArrayViewport_10306.data[4] * var2 + this.anArrayViewport_10306.data[8] * var3;
      float var7 = this.anArrayViewport_10306.data[13] + this.anArrayViewport_10306.data[1] * var1 + this.anArrayViewport_10306.data[5] * var2 + this.anArrayViewport_10306.data[9] * var3;
      float var8 = this.anArrayViewport_10355.data[14] + this.anArrayViewport_10355.data[2] * var1 + this.anArrayViewport_10355.data[6] * var2 + this.anArrayViewport_10355.data[10] * var3;
      var4[0] = this.aFloat_10395 + this.aFloat_10363 * var6 / var5;
      var4[1] = this.aFloat_10364 + this.aFloat_10365 * var7 / var5;
      var4[2] = var8;
   }

   public void method1957(int var1, Class105 var2) {
      this.anInt_10415 = var1;
      this.aClass105_10342 = var2;
      this.aBoolean_10413 = true;
   }

   final synchronized void method7072(int var1) {
      IndexNode var2 = new IndexNode(var1);
      this.aNodeList_10341.addNode(var2, (short)-15194);
   }

   public FontRenderer method1935(RSFont var1, ImageData[] var2, boolean var3) {
      return new TextRenderer_Sub5(this, var1, var2, var3);
   }
}
