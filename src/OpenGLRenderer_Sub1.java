import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;

public final class OpenGLRenderer_Sub1 extends Renderer_Sub3 {

   NodeList aNodeList_1327 = new NodeList();
   NodeList aNodeList_1328 = new NodeList();
   NodeList aNodeList_1329 = new NodeList();
   final String aString_1330;
   NodeList aNodeList_1331 = new NodeList();
   NodeList aNodeList_1332 = new NodeList();
   final float[] aFloatArray_1333;
   NodeList aNodeList_1334 = new NodeList();
   long aLong_1335;
   final int anInt_1336;
   boolean aBoolean_1337;
   OpenGL anOpenGL_1338;
   boolean aBoolean_1339;
   int anInt_1340;
   Class295_Sub2[] aClass295_Sub2Array_1341 = new Class295_Sub2[16];
   Class295_Sub1 aClass295_Sub1_1342;
   int[] anIntArray_1343;
   boolean aBoolean_1344;
   final String aString_1345;
   final int anInt_1346;
   final int[] renderBuffers = new int[1000];
   boolean isnOGLBuffer;
   boolean aBoolean_1349;
   NodeList aNodeList_1350 = new NodeList();
   final boolean aBoolean_1351;
   final boolean aBoolean_1352;
   Class125_Sub1 aClass125_Sub1_1353;
   boolean aBoolean_1354;
   final float[] aFloatArray_1355;
   boolean aBoolean_1356;


   public void method7132(ArrayViewport var1, ArrayViewport var2, ArrayViewport var3) {
      OpenGL.glMatrixMode(5888);
      this.anArrayViewport_10527.method4586(var1, var2);
      OpenGL.glLoadMatrixf(this.anArrayViewport_10527.data, 0);
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var3.data, 0);
   }

   public Class133 method7130(String var1) {
      byte[] var2 = this.method757(var1);
      if(var2 == null) {
         return null;
      } else {
         Class113 var3 = this.method7131(var2);
         return new Class133_Sub2(this, var3);
      }
   }

   public boolean method7129() {
      return this.aBoolean_1351;
   }

   public boolean method7325() {
      return this.aBoolean_1352;
   }

   void method7287() {
      OpenGL.glDepthFunc(515);
      OpenGL.glEnable(2884);
      OpenGL.glCullFace(1029);
      OpenGL.glClearDepth(1.0F);
      OpenGL.glAlphaFunc(516, 0.0F);
      OpenGL.glPolygonMode(1028, 6914);

      for(int var1 = this.anInt_10641 - 1; var1 >= 0; --var1) {
         OpenGL.glActiveTexture('\u84c0' + var1);
         OpenGL.glTexEnvi(8960, 8704, '\u8570');
         OpenGL.glTexEnvi(8960, '\u8571', 8448);
         OpenGL.glTexEnvi(8960, '\u8582', '\u8576');
         OpenGL.glTexEnvi(8960, '\u8572', 8448);
         OpenGL.glTexEnvi(8960, '\u858a', '\u8576');
      }

      OpenGL.glTexEnvi(8960, '\u858a', '\u8578');
      OpenGL.glShadeModel(7425);
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

      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      this.anOpenGL_1338.setSwapInterval(0);
      super.method7287();
   }

   public RendererInfo getRendererInfo() {
      int var1 = -1;
      if(this.aString_1345.indexOf("nvidia") != -1) {
         var1 = 4318;
      } else if(this.aString_1345.indexOf("intel") != -1) {
         var1 = '\u8086';
      } else if(this.aString_1345.indexOf("ati") != -1) {
         var1 = 4098;
      }

      return new RendererInfo(var1, "OpenGL", this.anInt_1346, this.aString_1330, 0L);
   }

   public void method1962() {
      OpenGL.glFinish();
   }

   void method1888() {
      super.method1888();
      if(this.anOpenGL_1338 != null) {
         this.anOpenGL_1338.method2009();
         this.anOpenGL_1338.release();
         this.anOpenGL_1338 = null;
      }

   }

   public float method7146() {
      return 0.0F;
   }

   Class174_Sub2 method1903(Canvas var1, int var2, int var3) {
      return new Class174_Sub2_Sub2_Sub1(this, var1);
   }

   public Class174_Sub1 method1890() {
      return new Class174_Sub1_Sub1_Sub1(this);
   }

   public Class101 method1927(int var1, int var2, Class136 var3, Class87 var4, int var5) {
      return new Class291(this, var3, var4, var1, var2, var5);
   }

   public Class99 method1905(int var1, int var2, int var3) {
      return new Class291(this, Class136.aClass136_2629, Class87.aClass87_1762, var1, var2, var3);
   }

   public int[] method1906(int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var3 * var4];
      int var6 = this.aClass174_2815.method2198();

      for(int var7 = 0; var7 < var4; ++var7) {
         OpenGL.glReadPixelsi(var1, var6 - var2 - var7 - 1, var3, 1, '\u80e1', this.anInt_1336, var5, var7 * var3);
      }

      return var5;
   }

   public void method1977(int var1, int var2) {
      int var3 = 0;
      if((var1 & 1) != 0) {
         OpenGL.glClearColor((float)(var2 & 16711680) / 1.671168E7F, (float)(var2 & '\uff00') / 65280.0F, (float)(var2 & 255) / 255.0F, (float)(var2 >>> 24) / 255.0F);
         var3 = 16384;
      }

      if((var1 & 2) != 0) {
         this.method7200(true);
         var3 |= 256;
      }

      if((var1 & 4) != 0) {
         var3 |= 1024;
      }

      OpenGL.glClear(var3);
   }

   void method7180() {
      if(this.aClass174_2815 != null) {
         OpenGL.glViewport(this.anInt_10531 + this.anInt_10562, this.anInt_10567 + this.aClass174_2815.method2198() - this.anInt_10583 - this.anInt_10565, this.anInt_10577, this.anInt_10565);
      }

      OpenGL.glDepthRange(this.aFloat_10548, this.aFloat_10600);
   }

   void method7157() {
      if(this.aClass174_2815 != null) {
         int var1 = this.anInt_10531 + this.anInt_10528;
         int var2 = this.anInt_10567 + this.aClass174_2815.method2198() - this.anInt_10512;
         int var3 = this.anInt_10557 - this.anInt_10528;
         int var4 = this.anInt_10512 - this.anInt_10552;
         if(var3 < 0) {
            var3 = 0;
         }

         if(var4 < 0) {
            var4 = 0;
         }

         OpenGL.glScissor(var1, var2, var3, var4);
      }

   }

   void method7182() {
      if(this.aBoolean_10662) {
         OpenGL.glEnable(3089);
      } else {
         OpenGL.glDisable(3089);
      }

   }

   public Class99 method1918(int var1, int var2) {
      return new Class291(this, Class136.aClass136_2629, Class87.aClass87_1762, var1, var2);
   }

   public void method7192(ArrayViewport var1) {
      float[] var2 = var1.data;
      var2[1] = -var2[1];
      var2[5] = -var2[5];
      var2[9] = -var2[9];
      var2[13] = -var2[13];
   }

   static final int method751(Class61 var0) {
      if(var0 == Class61.aClass61_1160) {
         return 5890;
      } else if(var0 == Class61.aClass61_1158) {
         return '\u8577';
      } else if(var0 == Class61.aClass61_1159) {
         return '\u8578';
      } else if(var0 == Class61.aClass61_1157) {
         return '\u8576';
      } else {
         throw new IllegalArgumentException();
      }
   }

   void method7303() {
      if(this.aBoolean_10571 && !this.aBoolean_10573) {
         OpenGL.glEnable(2896);
      } else {
         OpenGL.glDisable(2896);
      }

   }

   void method7208() {
      this.aFloatArray_1333[0] = this.aFloat_10582 * this.aFloat_10579;
      this.aFloatArray_1333[1] = this.aFloat_10582 * this.aFloat_10580;
      this.aFloatArray_1333[2] = this.aFloat_10582 * this.aFloat_10651;
      this.aFloatArray_1333[3] = 1.0F;
      OpenGL.glLightModelfv(2899, this.aFloatArray_1333, 0);
   }

   void method7310() {
      this.aFloatArray_1333[0] = this.aFloat_10561 * this.aFloat_10579;
      this.aFloatArray_1333[1] = this.aFloat_10561 * this.aFloat_10580;
      this.aFloatArray_1333[2] = this.aFloat_10561 * this.aFloat_10651;
      this.aFloatArray_1333[3] = 1.0F;
      OpenGL.glLightfv(16384, 4609, this.aFloatArray_1333, 0);
      this.aFloatArray_1333[0] = -this.aFloat_10584 * this.aFloat_10579;
      this.aFloatArray_1333[1] = -this.aFloat_10584 * this.aFloat_10580;
      this.aFloatArray_1333[2] = -this.aFloat_10584 * this.aFloat_10651;
      this.aFloatArray_1333[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, this.aFloatArray_1333, 0);
   }

   void method7308() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.anArrayViewport_10521.data, 0);
      OpenGL.glLightfv(16384, 4611, this.aFloatArray_10574, 0);
      OpenGL.glLightfv(16385, 4611, this.aFloatArray_10513, 0);
   }

   void method7209() {
      if(this.aBoolean_10572) {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      } else {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      }

   }

   byte[] method757(String var1) {
      return this.method7326("gl", var1);
   }

   void method7211() {
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadMatrixf(this.anArrayViewport_10521.data, 0);

      int var1;
      for(var1 = 0; var1 < this.anInt_10587; ++var1) {
         Class240_Sub53 var2 = this.aClass240_Sub53Array_10504[var1];
         int var3 = var2.method5278((byte)-124);
         int var4 = 16386 + var1;
         float var5 = var2.method5279(-2106173788) / 255.0F;
         this.aFloatArray_1333[0] = (float)var2.method5274((byte)9);
         this.aFloatArray_1333[1] = (float)var2.method5275((byte)46);
         this.aFloatArray_1333[2] = (float)var2.method5276((byte)65);
         this.aFloatArray_1333[3] = 1.0F;
         OpenGL.glLightfv(var4, 4611, this.aFloatArray_1333, 0);
         this.aFloatArray_1333[0] = (float)(var3 >> 16 & 255) * var5;
         this.aFloatArray_1333[1] = (float)(var3 >> 8 & 255) * var5;
         this.aFloatArray_1333[2] = (float)(var3 & 255) * var5;
         this.aFloatArray_1333[3] = 1.0F;
         OpenGL.glLightfv(var4, 4609, this.aFloatArray_1333, 0);
         OpenGL.glLightf(var4, 4617, 1.0F / (float)(var2.method5277(-1932051005) * var2.method5277(-1932051005)));
         OpenGL.glEnable(var4);
      }

      while(var1 < this.anInt_10586) {
         OpenGL.glDisable(16386 + var1);
         ++var1;
      }

   }

   boolean method7213(Class136 var1, Class87 var2) {
      return this.aBoolean_10655;
   }

   Class384 method7217(Class136 var1, Class87 var2, int var3, int var4) {
      return this.method7292(var1, var2, var3, var4);
   }

   Class384 method7218(Class136 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      if(!this.aBoolean_1339 && (!Animator.method5897(var2, (byte)102) || !Animator.method5897(var3, (byte)49))) {
         if(this.aBoolean_1349) {
            return new Class294_Sub1(this, var1, var2, var3, var5, var6, var7);
         } else {
            Class294_Sub3 var8 = new Class294_Sub3(this, var1, Class87.aClass87_1759, Class105.method1359(var2, (byte)125), Class105.method1359(var3, (byte)125));
            var8.method4870(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new Class294_Sub3(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   Class384 method7309(Class136 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      if(!this.aBoolean_1339 && (!Animator.method5897(var2, (byte)54) || !Animator.method5897(var3, (byte)40))) {
         if(this.aBoolean_1349) {
            return new Class294_Sub1(this, var1, var2, var3, var5, var6, var7);
         } else {
            Class294_Sub3 var8 = new Class294_Sub3(this, var1, Class87.aClass87_1767, Class105.method1359(var2, (byte)127), Class105.method1359(var3, (byte)124));
            var8.method2914(0, 0, var2, var3, var5, var1, var6, var7);
            return var8;
         }
      } else {
         return new Class294_Sub3(this, var1, var2, var3, var4, var5, var6, var7);
      }
   }

   Class54 method7221(Class136 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new Class294_Sub4(this, var1, var2, var3, var4, var5, var6);
   }

   public void method7225() {
      int var1 = this.anIntArray_1343[this.anInt_10511];
      if(var1 != 0) {
         this.anIntArray_1343[this.anInt_10511] = 0;
         OpenGL.glBindTexture(var1, 0);
         OpenGL.glDisable(var1);
      }

   }

   void method7240() {
      OpenGL.glMatrixMode(5890);
      if(this.aClass404Array_10508[this.anInt_10511] != Class404.aClass404_7655) {
         OpenGL.glLoadMatrixf(this.anArrayViewportArray_10594[this.anInt_10511].method4570(this.aFloatArray_1355), 0);
      } else {
         OpenGL.glLoadIdentity();
      }

      OpenGL.glMatrixMode(5888);
   }

   void method7236() {
      OpenGL.glActiveTexture('\u84c0' + this.anInt_10511);
   }

   void method1886(int var1, int var2) throws Exception_Sub7 {
      this.softwareTarget.method7576();
      if(this.aClass96_2801 != null) {
         this.aClass96_2801.method1254(-1833796199);
      }

   }

   void method7291() {
      OpenGL.glTexEnvi(8960, '\u8572', method771(this.aClass392Array_10597[this.anInt_10511]));
   }

   final void method7231(int var1, Class61 var2, boolean var3) {
      OpenGL.glTexEnvi(8960, '\u8588' + var1, method751(var2));
      OpenGL.glTexEnvi(8960, '\u8598' + var1, var3?771:770);
   }

   final synchronized void method770(int var1, int var2) {
      IndexNode var3 = new IndexNode(var2);
      var3.id = (long)var1 * -3961580539627386977L;
      this.aNodeList_1332.addNode(var3, (short)1871);
   }

   static final int method771(Class392 var0) {
      if(var0 == Class392.aClass392_7531) {
         return 7681;
      } else if(var0 == Class392.aClass392_7530) {
         return 8448;
      } else if(var0 == Class392.aClass392_7534) {
         return '\u8575';
      } else if(var0 == Class392.aClass392_7532) {
         return 260;
      } else if(var0 == Class392.aClass392_7533) {
         return '\u84e7';
      } else {
         throw new IllegalArgumentException();
      }
   }

   void method7284(int var1) {
      OpenGL.glColorMask((var1 & 1) != 0, (var1 & 2) != 0, (var1 & 4) != 0, (var1 & 8) != 0);
   }

   void method7242() {
      if(this.aBoolean_10634) {
         OpenGL.glEnable(3008);
      } else {
         OpenGL.glDisable(3008);
      }

   }

   void method7280() {
      if(this.aBoolean_10633) {
         OpenGL.glEnable(3042);
      } else {
         OpenGL.glDisable(3042);
      }

   }

   void method7247() {
      if(this.aBoolean_10625 && this.aBoolean_10624 && this.anInt_10627 >= 0) {
         OpenGL.glEnable(2912);
      } else {
         OpenGL.glDisable(2912);
      }

   }

   void method7246() {
      this.aFloat_10494 = this.aFloat_10568 - (float)this.anInt_10628;
      this.aFloat_10614 = this.aFloat_10494 - (float)this.anInt_10627;
      if(this.aFloat_10614 < this.aFloat_10576) {
         this.aFloat_10614 = this.aFloat_10576;
      }

      if(this.aBoolean_10505) {
         OpenGL.glFogf(2915, this.aFloat_10614);
         OpenGL.glFogf(2916, this.aFloat_10494);
         this.aFloatArray_1333[0] = (float)(this.anInt_10626 & 16711680) / 1.671168E7F;
         this.aFloatArray_1333[1] = (float)(this.anInt_10626 & '\uff00') / 65280.0F;
         this.aFloatArray_1333[2] = (float)(this.anInt_10626 & 255) / 255.0F;
         OpenGL.glFogfv(2918, this.aFloatArray_1333, 0);
      }

   }

   void method7248(boolean var1) {
      if(var1) {
         OpenGL.glEnable('\u809d');
      } else {
         OpenGL.glDisable('\u809d');
      }

   }

   final Class414 method7249(boolean var1) {
      return new Class295_Sub1(this, Class87.aClass87_1763, var1);
   }

   Class379 method7250(Class402[] var1) {
      return new Class379_Sub2(var1);
   }

   public void method7251(int var1, Class76 var2) {
      this.aClass295_Sub2Array_1341[var1] = (Class295_Sub2)var2;
   }

   void method7307(Class414 var1) {
      this.aClass295_Sub1_1342 = (Class295_Sub1)var1;
      this.aClass295_Sub1_1342.method3734();
   }

   public void method7190(Class379 var1) {
      Class402[] var2 = var1.aClass402Array_7334;
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < var2.length; ++var7) {
         Class402 var8 = var2[var7];
         Class295_Sub2 var9 = this.aClass295_Sub2Array_1341[var7];
         int var10 = 0;
         int var11 = var9.method3020();
         long var12 = var9.method3740();
         var9.method3734();

         for(int var14 = 0; var14 < var8.method4971(); ++var14) {
            Class380 var15 = var8.method4970(var14);
            switch(var15.anInt_7363) {
            case 1:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(1, 5126, var11, var12 + (long)var10);
            case 2:
            case 4:
            case 7:
            case 10:
            default:
               break;
            case 3:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(2, 5126, var11, var12 + (long)var10);
               break;
            case 5:
               OpenGL.glColorPointer(4, 5121, var11, var12 + (long)var10);
               var4 = true;
               break;
            case 6:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(4, 5126, var11, var12 + (long)var10);
               break;
            case 8:
               OpenGL.glClientActiveTexture('\u84c0' + var3++);
               OpenGL.glTexCoordPointer(3, 5126, var11, var12 + (long)var10);
               break;
            case 9:
               OpenGL.glNormalPointer(5126, var11, var12 + (long)var10);
               var5 = true;
               break;
            case 11:
               OpenGL.glVertexPointer(3, 5126, var11, var12 + (long)var10);
               var6 = true;
            }

            var10 += var15.anInt_7367;
         }
      }

      if(this.aBoolean_1356 != var6) {
         if(var6) {
            OpenGL.glEnableClientState('\u8074');
         } else {
            OpenGL.glDisableClientState('\u8074');
         }

         this.aBoolean_1356 = var6;
      }

      if(this.aBoolean_1337 != var5) {
         if(var5) {
            OpenGL.glEnableClientState('\u8075');
         } else {
            OpenGL.glDisableClientState('\u8075');
         }

         this.aBoolean_1337 = var5;
      }

      if(this.aBoolean_1344 != var4) {
         if(var4) {
            OpenGL.glEnableClientState('\u8076');
         } else {
            OpenGL.glDisableClientState('\u8076');
         }

         this.aBoolean_1344 = var4;
      }

      if(this.anInt_1340 < var3) {
         for(var7 = this.anInt_1340; var7 < var3; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glEnableClientState('\u8078');
         }

         this.anInt_1340 = var3;
      } else if(this.anInt_1340 > var3) {
         for(var7 = var3; var7 < this.anInt_1340; ++var7) {
            OpenGL.glClientActiveTexture('\u84c0' + var7);
            OpenGL.glDisableClientState('\u8078');
         }

         this.anInt_1340 = var3;
      }

   }

   public final void method7268(Class396 var1, int var2, int var3) {
      byte var4;
      int var5;
      if(var1 == Class396.aClass396_7569) {
         var4 = 1;
         var5 = var3 * 2;
      } else if(var1 == Class396.aClass396_7570) {
         var4 = 3;
         var5 = var3 + 1;
      } else if(var1 == Class396.aClass396_7573) {
         var4 = 4;
         var5 = var3 * 3;
      } else if(var1 == Class396.aClass396_7574) {
         var4 = 6;
         var5 = var3 + 2;
      } else if(var1 == Class396.aClass396_7572) {
         var4 = 5;
         var5 = var3 + 2;
      } else {
         var4 = 0;
         var5 = var3;
      }

      OpenGL.glDrawArrays(var4, var2, var5);
   }

   final void method7269(Class414 var1, Class396 var2, int var3, int var4, int var5, int var6) {
      byte var7;
      int var8;
      if(var2 == Class396.aClass396_7569) {
         var7 = 1;
         var8 = var6 * 2;
      } else if(var2 == Class396.aClass396_7570) {
         var7 = 3;
         var8 = var6 + 1;
      } else if(var2 == Class396.aClass396_7573) {
         var7 = 4;
         var8 = var6 * 3;
      } else if(var2 == Class396.aClass396_7574) {
         var7 = 6;
         var8 = var6 + 2;
      } else if(var2 == Class396.aClass396_7572) {
         var7 = 5;
         var8 = var6 + 2;
      } else {
         var7 = 0;
         var8 = var6;
      }

      Class87 var9 = var1.method5138();
      Class295_Sub1 var10 = (Class295_Sub1)var1;
      var10.method3734();
      OpenGL.glDrawElements(var7, var8, method790(var9), var10.method3740() + (long)(var5 * var9.anInt_1764 * -151363651));
   }

   final synchronized void method785(int var1, int var2) {
      IndexNode var3 = new IndexNode(var2);
      var3.id = (long)var1 * -3961580539627386977L;
      this.aNodeList_1329.addNode(var3, (short)-24041);
   }

   void method7321() {
      OpenGL.glTexEnvi(8960, '\u8571', method771(this.aClass392Array_10575[this.anInt_10511]));
   }

   final synchronized void method787(int var1) {
      IndexNode var2 = new IndexNode(var1);
      this.aNodeList_1331.addNode(var2, (short)1721);
   }

   final synchronized void method788(int var1, int var2) {
      IndexNode var3 = new IndexNode(var2);
      var3.id = (long)var1 * -3961580539627386977L;
      this.aNodeList_1327.addNode(var3, (short)-14941);
   }

   final synchronized void method789(int var1) {
      NodeListNode var2 = new NodeListNode();
      var2.id = (long)var1 * -3961580539627386977L;
      this.aNodeList_1350.addNode(var2, (short)-4508);
   }

   static final int method790(Class87 var0) {
      switch(var0.anInt_1768 * 636465333) {
      case 0:
         return 5121;
      case 1:
         return 5126;
      case 2:
         return 5124;
      case 3:
      default:
         return 5121;
      case 4:
         return 5131;
      case 5:
         return 5125;
      case 6:
         return 5122;
      case 7:
         return 5123;
      case 8:
         return 5120;
      }
   }

   static int method791(Class136 var0) {
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

   static int method792(Class136 var0, Class87 var1) {
      if(var1 == Class87.aClass87_1759) {
         switch(var0.anInt_2635 * 420406933) {
         case 1:
            return '\u83f3';
         case 2:
            return 6408;
         case 3:
            return 6407;
         case 4:
         case 5:
         default:
            throw new IllegalArgumentException();
         case 6:
            return 6406;
         case 7:
            return 6410;
         case 8:
            return '\u83f1';
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

   public void method1961(boolean var1) {}

   public Class177 method1985(Class177 var1, Class177 var2, float var3, Class177 var4) {
      return var3 < 0.5F?var1:var2;
   }

   void method7290() {}

   void method7201() {
      if(this.aBoolean_10553) {
         OpenGL.glEnable(2929);
      } else {
         OpenGL.glDisable(2929);
      }

   }

   OpenGLRenderer_Sub1(OpenGL var1, Canvas var2, long var3, Class163 var5, Class96 var6, CacheDataUnpacker var7, int var8) {
      super(var5, var6, var7, var8, 1);
      new MapBuffer();
      new MapBuffer();
      this.aFloatArray_1333 = new float[4];
      this.aFloatArray_1355 = new float[16];
      int[] var9 = new int[1];

      try {
         this.anOpenGL_1338 = var1;
         this.anOpenGL_1338.method2008();
         this.aString_1345 = OpenGL.glGetString(7936).toLowerCase();
         this.aString_1330 = OpenGL.glGetString(7937).toLowerCase();
         if(this.aString_1345.indexOf("microsoft") == -1 && this.aString_1345.indexOf("brian paul") == -1 && this.aString_1345.indexOf("mesa") == -1) {
            String var10 = OpenGL.glGetString(7938);
            String[] var11 = Class136.method1799(var10.replace('.', ' '), ' ', (byte)15);
            if(var11.length >= 2) {
               int var12;
               try {
                  var12 = LoadProgress.method4427(var11[0], -177104227);
                  int var13 = LoadProgress.method4427(var11[1], -1218920901);
                  this.anInt_1346 = var12 * 10 + var13;
               } catch (NumberFormatException var20) {
                  throw new RuntimeException("");
               }

               if(this.anInt_1346 < 12) {
                  throw new RuntimeException("");
               } else {
                  OpenGL.glGetIntegerv('\u84e2', var9, 0);
                  this.anInt_10641 = var9[0];
                  if(this.anInt_10641 < 2) {
                     throw new RuntimeException("");
                  } else {
                     this.anInt_10642 = 8;
                     this.isnOGLBuffer = this.anOpenGL_1338.isCompatible("GL_ARB_vertex_buffer_object");
                     this.isMultisample = this.anOpenGL_1338.isCompatible("GL_ARB_multisample");
                     this.aBoolean_1349 = this.anOpenGL_1338.isCompatible("GL_ARB_texture_rectangle");
                     this.anOpenGL_1338.isCompatible("GL_ARB_texture_cube_map");
                     this.aBoolean_1339 = this.anOpenGL_1338.isCompatible("GL_ARB_texture_non_power_of_two");
                     this.aBoolean_10655 = true;
                     this.aBoolean_1351 = this.anOpenGL_1338.isCompatible("GL_ARB_vertex_shader");
                     this.anOpenGL_1338.isCompatible("GL_ARB_vertex_program");
                     this.aBoolean_1352 = this.anOpenGL_1338.isCompatible("GL_ARB_fragment_shader");
                     this.anOpenGL_1338.isCompatible("GL_ARB_fragment_program");
                     this.anOpenGL_1338.isCompatible("GL_EXT_framebuffer_object");
                     this.anIntArray_1343 = new int[this.anInt_10641];
                     this.aBoolean_10585 = this.anOpenGL_1338.isCompatible("GL_EXT_framebuffer_object");
                     this.aBoolean_10608 = this.anOpenGL_1338.isCompatible("GL_EXT_framebuffer_blit");
                     this.aBoolean_10645 = this.anOpenGL_1338.isCompatible("GL_EXT_framebuffer_multisample");
                     if(!this.method7129() || !this.method7325()) {
                        if(!this.anOpenGL_1338.isCompatible("GL_ARB_multitexture")) {
                           throw new RuntimeException("");
                        }

                        if(!this.anOpenGL_1338.isCompatible("GL_ARB_texture_env_combine")) {
                           throw new RuntimeException("");
                        }
                     }

                     this.anInt_1336 = Stream.isLE()?'\u8367':5121;
                     if(this.aString_1330.indexOf("radeon") != -1) {
                        var12 = 0;
                        boolean var24 = false;
                        boolean var14 = false;
                        String[] var15 = Class136.method1799(this.aString_1330.replace('/', ' '), ' ', (byte)55);

                        for(int var16 = 0; var16 < var15.length; ++var16) {
                           String var17 = var15[var16];

                           try {
                              if(var17.length() > 0) {
                                 if(var17.charAt(0) == 120 && var17.length() >= 3 && MapElements.method2924(var17.substring(1, 3), -1850914703)) {
                                    var17 = var17.substring(1);
                                    var14 = true;
                                 }

                                 if(var17.equals("hd")) {
                                    var24 = true;
                                 } else {
                                    if(var17.startsWith("hd")) {
                                       var17 = var17.substring(2);
                                       var24 = true;
                                    }

                                    if(var17.length() >= 4 && MapElements.method2924(var17.substring(0, 4), 2058133821)) {
                                       var12 = LoadProgress.method4427(var17.substring(0, 4), -1440146037);
                                       break;
                                    }
                                 }
                              }
                           } catch (Exception var21) {
                              ;
                           }
                        }

                        if(!var14 && !var24) {
                           if(var12 >= 7000 && var12 <= 7999) {
                              this.isnOGLBuffer = false;
                           }

                           if(var12 >= 7000 && var12 <= 9250) {
                              this.aBoolean_10655 = false;
                           }
                        }

                        this.aBoolean_1349 &= this.anOpenGL_1338.isCompatible("GL_ARB_half_float_pixel");
                     }

                     if(this.aString_1345.indexOf("intel") != -1) {
                        ;
                     }

                     if(this.isnOGLBuffer) {
                        try {
                           int[] var23 = new int[1];
                           OpenGL.glGenBuffersARB(1, var23, 0);
                        } catch (Throwable var19) {
                           throw new RuntimeException("");
                        }
                     }

                     this.addCanvas(var2, new Class174_Sub2_Sub2_Sub1(this, var2, var3), (short)255);
                     this.method1982(var2, 1669589891);
                     this.method7156('\u8000', false);
                     this.method7156('\u8000', false);
                  }
               }
            } else {
               throw new RuntimeException("");
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (Throwable var22) {
         var22.printStackTrace();
         this.method1939(-1500363801);
         if(var22 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var22;
         } else {
            throw new RuntimeException("");
         }
      }
   }

   void method7306(int var1) {
      if(!this.aBoolean_1354) {
         OpenGL.glPolygonMode(1028, (var1 & 2) != 0?6913:6914);
      }

   }

   Class398 method7220(int var1, boolean var2, int[][] var3) {
      return new Class294_Sub2(this, var1, var2, var3);
   }

   final synchronized void method799(long var1) {
      NodeListNode var3 = new NodeListNode();
      var3.id = var1 * -3961580539627386977L;
      this.aNodeList_1334.addNode(var3, (short)-8128);
   }

   final Class76 method7320(boolean var1) {
      return new Class295_Sub2(this, var1);
   }

   void method7243() {
      byte var1 = 0;
      byte var2 = 0;
      if(this.anInt_10663 == 0) {
         var1 = 0;
         var2 = 0;
      } else if(this.anInt_10663 == 1) {
         var1 = 1;
         var2 = 0;
      } else if(this.anInt_10663 == 2) {
         var1 = 1;
         var2 = 1;
      }

      if(this.aClass393_10632 == Class393.aClass393_7556) {
         OpenGL.glBlendFuncSeparate(770, 771, var1, var2);
      } else if(this.aClass393_10632 == Class393.aClass393_7554) {
         OpenGL.glBlendFuncSeparate(1, 1, var1, var2);
      } else if(this.aClass393_10632 == Class393.aClass393_7555) {
         OpenGL.glBlendFuncSeparate(774, 1, var1, var2);
      }

   }

   public final synchronized void cleanup(int var1) {
      int var2 = 0;
      var1 &= Integer.MAX_VALUE;

      IndexNode var3;
      while(!this.aNodeList_1329.isEmpty(1327802888)) {
         var3 = (IndexNode)this.aNodeList_1329.returnShift((byte)-23);
         this.renderBuffers[var2++] = (int)(var3.id * 4058728944299054175L);
         this.anInt_10656 -= var3.cacheID * 523939595;
         if(var2 == 1000) {
            OpenGL.glDeleteBuffersARB(var2, this.renderBuffers, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteBuffersARB(var2, this.renderBuffers, 0);
         var2 = 0;
      }

      while(!this.aNodeList_1332.isEmpty(1756300852)) {
         var3 = (IndexNode)this.aNodeList_1332.returnShift((byte)-67);
         this.renderBuffers[var2++] = (int)(var3.id * 4058728944299054175L);
         this.anInt_10514 -= var3.cacheID * 523939595;
         if(var2 == 1000) {
            OpenGL.glDeleteTextures(var2, this.renderBuffers, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteTextures(var2, this.renderBuffers, 0);
         var2 = 0;
      }

      while(!this.aNodeList_1331.isEmpty(1207871173)) {
         var3 = (IndexNode)this.aNodeList_1331.returnShift((byte)-35);
         this.renderBuffers[var2++] = var3.cacheID * 523939595;
         if(var2 == 1000) {
            OpenGL.glDeleteFramebuffersEXT(var2, this.renderBuffers, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteFramebuffersEXT(var2, this.renderBuffers, 0);
         var2 = 0;
      }

      while(!this.aNodeList_1327.isEmpty(1190051503)) {
         var3 = (IndexNode)this.aNodeList_1327.returnShift((byte)57);
         this.renderBuffers[var2++] = (int)(var3.id * 4058728944299054175L);
         this.anInt_10516 -= var3.cacheID * 523939595;
         if(var2 == 1000) {
            OpenGL.glDeleteRenderbuffersEXT(var2, this.renderBuffers, 0);
            var2 = 0;
         }
      }

      if(var2 > 0) {
         OpenGL.glDeleteRenderbuffersEXT(var2, this.renderBuffers, 0);
         boolean var5 = false;
      }

      while(!this.aNodeList_1328.isEmpty(1591586524)) {
         var3 = (IndexNode)this.aNodeList_1328.returnShift((byte)17);
         OpenGL.glDeleteLists((int)(var3.id * 4058728944299054175L), var3.cacheID * 523939595);
      }

      NodeListNode var4;
      while(!this.aNodeList_1350.isEmpty(1760824470)) {
         var4 = this.aNodeList_1350.returnShift((byte)-47);
         OpenGL.glDeleteProgram((int)(var4.id * 4058728944299054175L));
      }

      while(!this.aNodeList_1334.isEmpty(1189638751)) {
         var4 = this.aNodeList_1334.returnShift((byte)-49);
         OpenGL.glDeleteShader((int)(var4.id * 4058728944299054175L));
      }

      while(!this.aNodeList_1328.isEmpty(2026144803)) {
         var3 = (IndexNode)this.aNodeList_1328.returnShift((byte)35);
         OpenGL.glDeleteLists((int)(var3.id * 4058728944299054175L), var3.cacheID * 523939595);
      }

      if(this.getHeap() > 100663296 && Class373.getCurrentTime((short)25578) > this.aLong_1335 + 60000L) {
         System.gc();
         this.aLong_1335 = Class373.getCurrentTime((short)15915);
      }

      super.cleanup(var1);
   }

   void method7202() {
      OpenGL.glDepthMask(this.aBoolean_10566 && this.aBoolean_10555);
   }

   boolean method7212(Class136 var1, Class87 var2) {
      return true;
   }

   public final void method7270(Class396 var1, int var2, int var3, int var4, int var5) {
      byte var6;
      int var7;
      if(var1 == Class396.aClass396_7569) {
         var6 = 1;
         var7 = var5 * 2;
      } else if(var1 == Class396.aClass396_7570) {
         var6 = 3;
         var7 = var5 + 1;
      } else if(var1 == Class396.aClass396_7573) {
         var6 = 4;
         var7 = var5 * 3;
      } else if(var1 == Class396.aClass396_7574) {
         var6 = 6;
         var7 = var5 + 2;
      } else if(var1 == Class396.aClass396_7572) {
         var6 = 5;
         var7 = var5 + 2;
      } else {
         var6 = 0;
         var7 = var5;
      }

      Class87 var8 = this.aClass295_Sub1_1342.method5138();
      OpenGL.glDrawElements(var6, var7, method790(var8), this.aClass295_Sub1_1342.method3740() + (long)(var4 * var8.anInt_1764 * -151363651));
   }

   final void method7235() {
      this.aFloatArray_1333[0] = (float)(this.anInt_10598 & 16711680) / 1.671168E7F;
      this.aFloatArray_1333[1] = (float)(this.anInt_10598 & '\uff00') / 65280.0F;
      this.aFloatArray_1333[2] = (float)(this.anInt_10598 & 255) / 255.0F;
      this.aFloatArray_1333[3] = (float)(this.anInt_10598 >>> 24) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray_1333, 0);
   }

   public void method1907() {
      if(this.aClass174_2815 != null) {
         int var1 = this.aClass174_2815.method2194();
         int var2 = this.aClass174_2815.method2198();
         if(var1 > 0 || var2 > 0) {
            int var3 = this.anInt_10562;
            int var4 = this.anInt_10583;
            int var5 = this.anInt_10577;
            int var6 = this.anInt_10565;
            this.method1908();
            int var7 = this.anInt_10528;
            int var8 = this.anInt_10557;
            int var9 = this.anInt_10552;
            int var10 = this.anInt_10512;
            this.method1967();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method7193();
            this.method7244(false);
            this.method7205(false);
            this.method7304(false);
            this.method7200(false);
            this.method7224((Class403)null);
            this.method7226(1);
            this.method7279(0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, var1, var2, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1965(var7, var9, var8, var10);
            this.method1909(var3, var4, var5, var6);
         }
      }
   }

   Class406 method7292(Class136 var1, Class87 var2, int var3, int var4) {
      return (Class406)(!this.aBoolean_1339 && (!Animator.method5897(var3, (byte)55) || !Animator.method5897(var4, (byte)123))?(this.aBoolean_1349?new Class294_Sub1(this, var1, var2, var3, var4):new Class294_Sub3(this, var1, var2, Class105.method1359(var3, (byte)127), Class105.method1359(var4, (byte)125))):new Class294_Sub3(this, var1, var2, var3, var4));
   }

   Class384 method7219(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      if(!this.aBoolean_1339 && (!Animator.method5897(var1, (byte)99) || !Animator.method5897(var2, (byte)21))) {
         if(this.aBoolean_1349) {
            return new Class294_Sub1(this, var1, var2, var4, var5, var6);
         } else {
            Class294_Sub3 var7 = new Class294_Sub3(this, Class136.aClass136_2625, Class87.aClass87_1759, Class105.method1359(var1, (byte)125), Class105.method1359(var2, (byte)127));
            var7.method4867(0, 0, var1, var2, var4, var5, var6);
            return var7;
         }
      } else {
         return new Class294_Sub3(this, var1, var2, var3, var4, var5, var6);
      }
   }

   final void method7229(int var1, Class61 var2, boolean var3, boolean var4) {
      OpenGL.glTexEnvi(8960, '\u8580' + var1, method751(var2));
      if(var3) {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?771:770);
      } else {
         OpenGL.glTexEnvi(8960, '\u8590' + var1, var4?769:768);
      }

   }
}
