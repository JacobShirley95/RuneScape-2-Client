import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.h;

public class Class174_Sub1_Sub1_Sub2 extends Class174_Sub1_Sub1 {

   final Class325[] aClass325Array_3299 = new Class325[4];
   int anInt_3300;
   int anInt_3301;
   final Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_3302;
   static final int anInt_3303 = 16;
   int anInt_3304;
   Class425 aClass425_3305 = null;
   boolean aBoolean_3306;


   public int method2194() {
      return this.anInt_3301;
   }

   boolean method2196() {
      for(int var1 = 0; var1 < 4; ++var1) {
         Class325 var2 = this.aClass325Array_3299[var1];
         if(var2 != null) {
            long var3 = var2.method3991();
            this.method2450(var1, var3);
         }
      }

      if(this.aClass425_3305 != null) {
         this.method2443(this.aClass425_3305.method5298());
      }

      this.aBoolean_3306 = true;
      return super.method2196();
   }

   public void method7327(int var1, Class101 var2) {
      int var3 = 1 << var1;
      Class325 var4 = (Class325)var2;
      if(var2 != null) {
         if(this.anInt_3300 != 0) {
            if(this.anInt_3301 != var4.method2006() || this.anInt_3304 != var4.method2005()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt_3304 = var4.method2005();
            this.anInt_3301 = var4.method2006();
            this.method1211();
         }

         this.anInt_3300 |= var3;
         this.aClass325Array_3299[var1] = var4;
         if(this.aBoolean_3306) {
            this.method2450(var1, var4.method3991());
         }
      } else {
         this.anInt_3300 &= ~var3;
         this.aClass325Array_3299[var1] = null;
         if(this.aBoolean_3306) {
            this.method2450(var1, 0L);
         }

         if(this.anInt_3300 == 0) {
            this.anInt_3304 = 0;
            this.anInt_3301 = 0;
         }
      }

   }

   Class174_Sub1_Sub1_Sub2(Renderer_Sub3_Sub2 var1) {
      super(var1);
      this.aRenderer_Sub3_Sub2_3302 = var1;
   }

   boolean method2443(long var1) {
      return h.method187(IDirect3DDevice.SetDepthStencilSurface(this.aRenderer_Sub3_Sub2_3302.curScene, var1));
   }

   public boolean method7330() {
      return this.aClass325Array_3299[0] != null;
   }

   public void finalize() throws Throwable {
      this.method2448();
      super.finalize();
   }

   boolean method2197() {
      for(int var1 = 1; var1 < 4; ++var1) {
         Class325 var2 = this.aClass325Array_3299[var1];
         if(var2 != null) {
            this.method2450(var1, 0L);
         }
      }

      if(this.aClass425_3305 != null) {
         this.method2443(0L);
      }

      this.aBoolean_3306 = false;
      return true;
   }

   public void method7329(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7) {
         long var9 = IDirect3DDevice.GetRenderTarget(this.aRenderer_Sub3_Sub2_3302.curScene, 0);
         IDirect3DDevice.StretchRect(this.aRenderer_Sub3_Sub2_3302.curScene, this.aClass325Array_3299[0].method3991(), var1, var2, var3, var4, var9, var5, var6, var3, var4, 0);
         IUnknown.Release(var9);
      }

   }

   public void method2195() {
      if(this.aClass425_3305 != null) {
         this.aClass425_3305.method824();
      }

      for(int var1 = 0; var1 < this.aClass325Array_3299.length; ++var1) {
         if(this.aClass325Array_3299[var1] != null) {
            this.aClass325Array_3299[var1].method824();
         }
      }

   }

   void method2448() {
      if(this.aClass425_3305 != null) {
         this.aClass425_3305.method5297();
      }

      for(int var1 = 0; var1 < this.aClass325Array_3299.length; ++var1) {
         if(this.aClass325Array_3299[var1] != null) {
            this.aClass325Array_3299[var1].method3993();
         }
      }

   }

   public int method2198() {
      return this.anInt_3304;
   }

   boolean method2450(int var1, long var2) {
      return h.method187(IDirect3DDevice.SetRenderTarget(this.aRenderer_Sub3_Sub2_3302.curScene, var1, var2));
   }

   public void method7328(Class99 var1) {
      Class425 var2 = (Class425)var1;
      if(var1 != null) {
         if(this.anInt_3300 != 0) {
            if(this.anInt_3301 != var2.method2006() || this.anInt_3304 != var2.method2005()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt_3304 = var2.method2005();
            this.anInt_3301 = var2.method2006();
            this.method1211();
         }

         this.anInt_3300 |= 16;
         this.aClass425_3305 = var2;
         if(this.aBoolean_3306) {
            this.method2443(var2.method5298());
         }
      } else {
         this.anInt_3300 &= -17;
         this.aClass425_3305 = null;
         if(this.aBoolean_3306) {
            this.method2443(0L);
         }

         if(this.anInt_3300 == 0) {
            this.anInt_3304 = 0;
            this.anInt_3301 = 0;
         }
      }

   }
}
