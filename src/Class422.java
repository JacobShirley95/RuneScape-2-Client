import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class422 implements Class425 {

   final int anInt_8013;
   final Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_8014;
   final int anInt_8015;
   final Class87 aClass87_8016;
   long aLong_8017;


   public int method2005() {
      return this.anInt_8015;
   }

   public void method5297() {
      if(this.aLong_8017 != 0L) {
         this.aRenderer_Sub3_Sub2_8014.method951(this.aLong_8017);
         this.aLong_8017 = 0L;
      }

   }

   public void method824() {
      if(this.aLong_8017 != 0L) {
         IUnknown.Release(this.aLong_8017);
         this.aLong_8017 = 0L;
      }

      this.aRenderer_Sub3_Sub2_8014.method7127(this);
   }

   public void finalize() {
      this.method5297();
   }

   public int method2006() {
      return this.anInt_8013;
   }

   Class422(Renderer_Sub3_Sub2 var1, Class87 var2, int var3, int var4, int var5) {
      this.aRenderer_Sub3_Sub2_8014 = var1;
      this.anInt_8013 = var3;
      this.anInt_8015 = var4;
      this.aClass87_8016 = var2;
      this.aLong_8017 = IDirect3DDevice.CreateDepthStencilSurface(this.aRenderer_Sub3_Sub2_8014.curScene, var3, var4, Renderer_Sub3_Sub2.method969(this.aClass87_8016), 0 + var5, 0, false);
      this.aRenderer_Sub3_Sub2_8014.method7181(this);
   }

   public long method5298() {
      return this.aLong_8017;
   }
}
