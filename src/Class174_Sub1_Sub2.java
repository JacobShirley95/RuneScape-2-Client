import jaggl.OpenGL;

public class Class174_Sub1_Sub2 extends Class174_Sub1 {

   int anInt_1902;
   final OpenGLRenderer aRenderer_Sub2_1903;
   Class149 aClass149_1904;
   int anInt_1905;
   int anInt_1906;
   int anInt_1907;
   int anInt_1908;
   static final int anInt_1909 = 16;
   final Class149[] aClass149Array_1910 = new Class149[4];


   public int method2194() {
      return this.anInt_1905;
   }

   public int method2198() {
      return this.anInt_1902;
   }

   public void method7327(int var1, Class101 var2) {
      int var3 = 1 << var1;
      Class149 var4 = (Class149)var2;
      if(var2 != null) {
         if((this.anInt_1907 | var3) != var3) {
            if(this.anInt_1905 != var4.method2006() || this.anInt_1902 != var4.method2005()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt_1902 = var4.method2005();
            this.anInt_1905 = var4.method2006();
            if(this == this.aRenderer_Sub2_1903.method1896(-1725311964)) {
               this.aRenderer_Sub2_1903.method6934();
            }
         }

         this.anInt_1907 |= var3;
         this.aClass149Array_1910[var1] = var4;
      } else {
         this.anInt_1907 &= ~var3;
         this.aClass149Array_1910[var1] = null;
         if(this.anInt_1907 == 0) {
            this.anInt_1902 = 0;
            this.anInt_1905 = 0;
         }
      }

      if(this == this.aRenderer_Sub2_1903.method1896(465485642)) {
         this.method1248(var1);
      } else {
         this.anInt_1908 |= var3;
      }

   }

   public void method7328(Class99 var1) {
      Class149 var2 = (Class149)var1;
      if(var1 != null) {
         if((this.anInt_1907 | 16) != 16) {
            if(this.anInt_1905 != var2.method2006() || this.anInt_1902 != var2.method2005()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt_1902 = var2.method2005();
            this.anInt_1905 = var2.method2006();
            if(this == this.aRenderer_Sub2_1903.method1896(1610707648)) {
               this.aRenderer_Sub2_1903.method6934();
            }
         }

         this.anInt_1907 |= 16;
         this.aClass149_1904 = var2;
      } else {
         this.anInt_1907 &= -17;
         this.aClass149_1904 = null;
         if(this.anInt_1907 == 0) {
            this.anInt_1902 = 0;
            this.anInt_1905 = 0;
         }
      }

      if(this == this.aRenderer_Sub2_1903.method1896(-1023431990)) {
         this.method1243();
      } else {
         this.anInt_1908 |= 16;
      }

   }

   void method1242(int var1) {
      OpenGL.glDrawBuffer('\u8ce0' + var1);
   }

   void method1243() {
      if(this.aClass149_1904 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.aClass149_1904.method1827('\u8d00');
      }

   }

   public boolean method7330() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   boolean method2196() {
      OpenGL.glBindFramebufferEXT('\u8d40', this.anInt_1906);

      for(int var1 = 0; var1 < 4; ++var1) {
         if((this.anInt_1908 & 1 << var1) != 0) {
            this.method1248(var1);
         }
      }

      if((this.anInt_1908 & 16) != 0) {
         this.method1243();
      }

      this.anInt_1908 = 0;
      this.aRenderer_Sub2_1903.method6983();
      return true;
   }

   boolean method2197() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   public void method2195() {
      if(this.anInt_1906 != 0) {
         this.aRenderer_Sub2_1903.method7072(this.anInt_1906);
         this.anInt_1906 = 0;
      }

   }

   void method1248(int var1) {
      Class149 var2 = this.aClass149Array_1910[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method1827('\u8ce0' + var1);
      }

   }

   Class174_Sub1_Sub2(OpenGLRenderer var1) {
      if(!var1.supportsFrameBuffer) {
         throw new IllegalStateException("");
      } else {
         this.aRenderer_Sub2_1903 = var1;
         int[] var2 = new int[1];
         OpenGL.glGenFramebuffersEXT(1, var2, 0);
         this.anInt_1906 = var2[0];
      }
   }

   public void finalize() throws Throwable {
      super.finalize();
      this.method2195();
   }

   public void method7329(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt_1902;
         int var10 = this.aRenderer_Sub2_1903.method1896(-1706518207).method2198();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt_1906);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }
}
