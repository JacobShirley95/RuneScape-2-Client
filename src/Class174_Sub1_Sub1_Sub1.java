import jaggl.OpenGL;

public class Class174_Sub1_Sub1_Sub1 extends Class174_Sub1_Sub1 {

   int anInt_3255;
   int anInt_3256;
   int anInt_3257;
   final Class287[] aClass287Array_3258 = new Class287[4];
   int anInt_3259;
   final OpenGLRenderer_Sub1 aRenderer_Sub3_Sub1_3260;
   static final int anInt_3261 = 16;
   Class287 aClass287_3262;
   int anInt_3263;


   public int method2194() {
      return this.anInt_3255;
   }

   public int method2198() {
      return this.anInt_3259;
   }

   public void method7327(int var1, Class101 var2) {
      int var3 = 1 << var1;
      Class287 var4 = (Class287)var2;
      if(var2 != null) {
         if(this.anInt_3263 != 0) {
            if(this.anInt_3255 != var4.method2006() || this.anInt_3259 != var4.method2005()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt_3259 = var4.method2005();
            this.anInt_3255 = var4.method2006();
            this.method1211();
         }

         this.anInt_3263 |= var3;
         this.aClass287Array_3258[var1] = var4;
      } else {
         this.anInt_3263 &= ~var3;
         this.aClass287Array_3258[var1] = null;
         if(this.anInt_3263 == 0) {
            this.anInt_3259 = 0;
            this.anInt_3255 = 0;
         }
      }

      if(this == this.aRenderer_Sub3_Sub1_3260.method1896(1018796201)) {
         this.method2397(var1);
      } else {
         this.anInt_3256 |= var3;
      }

   }

   public void method7328(Class99 var1) {
      Class287 var2 = (Class287)var1;
      if(var1 != null) {
         if(this.anInt_3263 != 0) {
            if(this.anInt_3255 != var2.method2006() || this.anInt_3259 != var2.method2005()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt_3259 = var2.method2005();
            this.anInt_3255 = var2.method2006();
            this.method1211();
         }

         this.anInt_3263 |= 16;
         this.aClass287_3262 = var2;
      } else {
         this.anInt_3263 &= -17;
         this.aClass287_3262 = null;
         if(this.anInt_3263 == 0) {
            this.anInt_3259 = 0;
            this.anInt_3255 = 0;
         }
      }

      if(this == this.aRenderer_Sub3_Sub1_3260.method1896(-956814273)) {
         this.method2394();
      } else {
         this.anInt_3256 |= 16;
      }

   }

   void method2394() {
      if(this.aClass287_3262 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.aClass287_3262.method3697('\u8d00');
      }

   }

   Class174_Sub1_Sub1_Sub1(OpenGLRenderer_Sub1 var1) {
      super(var1);
      this.aRenderer_Sub3_Sub1_3260 = var1;
      int[] var2 = new int[1];
      OpenGL.glGenFramebuffersEXT(1, var2, 0);
      this.anInt_3257 = var2[0];
   }

   public void method7329(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt_3259;
         int var10 = this.aRenderer_Sub3_Sub1_3260.method1896(-974000126).method2198();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt_3257);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   public void method2195() {
      if(this.anInt_3257 != 0) {
         this.aRenderer_Sub3_Sub1_3260.method787(this.anInt_3257);
         this.anInt_3257 = 0;
      }

   }

   void method2397(int var1) {
      Class287 var2 = this.aClass287Array_3258[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method3697('\u8ce0' + var1);
      }

   }

   public boolean method7330() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   boolean method2197() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   boolean method2196() {
      OpenGL.glBindFramebufferEXT('\u8d40', this.anInt_3257);

      for(int var1 = 0; var1 < 4; ++var1) {
         if((this.anInt_3256 & 1 << var1) != 0) {
            this.method2397(var1);
         }
      }

      if((this.anInt_3256 & 16) != 0) {
         this.method2394();
      }

      this.anInt_3256 = 0;
      return super.method2196();
   }

   public void finalize() throws Throwable {
      super.finalize();
      this.method2195();
   }
}
