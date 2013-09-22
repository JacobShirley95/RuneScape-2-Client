import jaggl.OpenGL;

public class Class177_Sub2_Sub2 extends Class177_Sub2 {

   OGLTexture_Sub2 anOGLTexture_Sub2_1976;
   final OpenGLRenderer aRenderer_Sub2_1977;
   static final int[] anIntArray_1978 = new int[4];


   OGLTexture_Sub2 method7357() {
      return this.anOGLTexture_Sub2_1976;
   }

   Class177_Sub2_Sub2(OpenGLRenderer var1, int var2) {
      this.aRenderer_Sub2_1977 = var1;
      this.anOGLTexture_Sub2_1976 = new OGLTexture_Sub2(var1, Class136.aClass136_2625, Class87.aClass87_1759, var2);
   }

   int method1350() {
      return this.anOGLTexture_Sub2_1976.anInt_8391;
   }

   boolean method1351(OGLTexture_Sub2 var1, OGLTexture_Sub2 var2, float var3) {
      boolean var4 = true;
      Class174_Sub1_Sub2 var5 = this.aRenderer_Sub2_1977.aClass174_Sub1_Sub2_10459;
      this.aRenderer_Sub2_1977.method1913(anIntArray_1978);
      this.aRenderer_Sub2_1977.method1967();
      this.aRenderer_Sub2_1977.method7011();
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glPushAttrib(2048);
      OpenGL.glViewport(0, 0, this.anOGLTexture_Sub2_1976.anInt_8391, this.anOGLTexture_Sub2_1976.anInt_8391);
      this.aRenderer_Sub2_1977.method7026(false);
      this.aRenderer_Sub2_1977.method7066(false);
      this.aRenderer_Sub2_1977.method7028(false);
      this.aRenderer_Sub2_1977.method7029(false);
      this.aRenderer_Sub2_1977.method6957(-2);
      this.aRenderer_Sub2_1977.setTexture(1);
      this.aRenderer_Sub2_1977.method7023(0.0F, 0.0F, 0.0F, var3);
      this.aRenderer_Sub2_1977.setTexEnv('\u8575', '\u8575');
      this.aRenderer_Sub2_1977.setTextureRenderer(var2);
      this.aRenderer_Sub2_1977.setTexture(0);
      this.aRenderer_Sub2_1977.setTextureEnv(1);
      this.aRenderer_Sub2_1977.setTextureRenderer(var1);
      this.aRenderer_Sub2_1977.method1901(var5, 891230084);

      for(int var6 = 0; var6 < 6; ++var6) {
         int var7 = '\u8515' + var6;
         var5.method7327(0, this.anOGLTexture_Sub2_1976.method5431(var7, 0));
         var5.method1242(0);
         if(!var5.method7330()) {
            var4 = false;
            break;
         }

         OpenGL.glBegin(7);
         switch(var7) {
         case '\u8515':
            OpenGL.glTexCoord3i('\uffff', '\ufffe', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', '\ufffe', '\ufffe');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\uffff', '\ufffe', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', '\ufffe', -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\uffff', -65534, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', -65534, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i('\uffff', -65534, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\uffff', -65534, '\ufffe');
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case '\u8516':
            OpenGL.glTexCoord3i(-65535, '\ufffe', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, '\ufffe', -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, '\ufffe', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, '\ufffe', '\ufffe');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65535, -65534, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, -65534, '\ufffe');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65535, -65534, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65535, -65534, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case '\u8517':
            OpenGL.glTexCoord3i(-65534, '\uffff', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\uffff', -65534);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\uffff', -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\uffff', -65534);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\uffff', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\uffff', '\ufffe');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, '\uffff', '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\uffff', '\ufffe');
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case '\u8518':
            OpenGL.glTexCoord3i(-65534, -65535, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65535, '\ufffe');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65535, '\ufffe');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65535, '\ufffe');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65535, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65535, -65534);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65535, -65534);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65535, -65534);
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case '\u8519':
            OpenGL.glTexCoord3i(-65534, '\ufffe', '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\ufffe', '\uffff');
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', '\ufffe', '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\ufffe', '\uffff');
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i('\ufffe', -65534, '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65534, '\uffff');
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i(-65534, -65534, '\uffff');
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65534, '\uffff');
            OpenGL.glVertex2f(0.0F, 1.0F);
            break;
         case '\u851a':
            OpenGL.glTexCoord3i('\ufffe', '\ufffe', -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', '\ufffe', -65535);
            OpenGL.glVertex2f(0.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, '\ufffe', -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, '\ufffe', -65535);
            OpenGL.glVertex2f(1.0F, 0.0F);
            OpenGL.glTexCoord3i(-65534, -65534, -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', -65534, -65534, -65535);
            OpenGL.glVertex2f(1.0F, 1.0F);
            OpenGL.glTexCoord3i('\ufffe', -65534, -65535);
            OpenGL.glMultiTexCoord3i('\u84c1', '\ufffe', -65534, -65535);
            OpenGL.glVertex2f(0.0F, 1.0F);
         }

         OpenGL.glEnd();
      }

      var5.method7327(0, (Class101)null);
      this.aRenderer_Sub2_1977.method1902(var5, 242813907);
      this.aRenderer_Sub2_1977.setTexture(1);
      this.aRenderer_Sub2_1977.setTextureRenderer((OGLTexture)null);
      this.aRenderer_Sub2_1977.setTexEnv(8448, 8448);
      this.aRenderer_Sub2_1977.setTexture(0);
      this.aRenderer_Sub2_1977.setTextureRenderer((OGLTexture)null);
      OpenGL.glPopAttrib();
      this.aRenderer_Sub2_1977.method1965(anIntArray_1978[0], anIntArray_1978[1], anIntArray_1978[2], anIntArray_1978[3]);
      if(var4 && !this.aRenderer_Sub2_1977.aBoolean_10430) {
         this.anOGLTexture_Sub2_1976.method1845();
      }

      return var4;
   }
}
