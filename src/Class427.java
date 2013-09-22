import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class427 implements Class325 {

   final int anInt_8082;
   final Class87 aClass87_8083;
   long aLong_8084;
   final int anInt_8085;
   final Class136 aClass136_8086;
   final Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_8087;


   public int method2006() {
      return this.anInt_8085;
   }

   public int method2005() {
      return this.anInt_8082;
   }

   public void finalize() {
      this.method3993();
   }

   public long method3991() {
      return this.aLong_8084;
   }

   public void method824() {
      if(this.aLong_8084 != 0L) {
         IUnknown.Release(this.aLong_8084);
         this.aLong_8084 = 0L;
      }

      this.aRenderer_Sub3_Sub2_8087.method7127(this);
   }

   public void method3993() {
      if(this.aLong_8084 != 0L) {
         this.aRenderer_Sub3_Sub2_8087.method951(this.aLong_8084);
         this.aLong_8084 = 0L;
      }

   }

   Class427(Renderer_Sub3_Sub2 var1, Class136 var2, Class87 var3, int var4, int var5, int var6) {
      this.aRenderer_Sub3_Sub2_8087 = var1;
      this.anInt_8085 = var4;
      this.anInt_8082 = var5;
      this.aClass136_8086 = var2;
      this.aClass87_8083 = var3;
      this.aLong_8084 = IDirect3DDevice.CreateRenderTarget(this.aRenderer_Sub3_Sub2_8087.curScene, var4, var5, Renderer_Sub3_Sub2.method958(this.aClass136_8086, this.aClass87_8083), 0 + var6, 0, false);
      this.aRenderer_Sub3_Sub2_8087.method7181(this);
   }
}
