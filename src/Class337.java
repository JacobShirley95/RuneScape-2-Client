import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.h;

public class Class337 implements Class76 {

   long aLong_6491 = 0L;
   int anInt_6492;
   int anInt_6493;
   final Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_6494;
   final boolean aBoolean_6495;
   byte aByte_6496;


   public int method4854() {
      return this.anInt_6493;
   }

   public boolean method981(int var1, int var2) {
      this.anInt_6493 = var1;
      this.aByte_6496 = (byte)var2;
      if(this.anInt_6493 > this.anInt_6492) {
         int var3 = 8;
         byte var4;
         if(this.aBoolean_6495) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if(this.aLong_6491 != 0L) {
            IUnknown.Release(this.aLong_6491);
         }

         this.aLong_6491 = IDirect3DDevice.CreatenOGLBuffer(this.aRenderer_Sub3_Sub2_6494.curScene, this.anInt_6493, var3, 0, var4);
         this.anInt_6492 = this.anInt_6493;
      }

      return this.aLong_6491 != 0L;
   }

   public boolean method4853(int var1, int var2, long var3) {
      return h.method187(IDirect3DVertexBuffer.Upload(this.aLong_6491, var1, var2, this.aBoolean_6495?8192:0, var3));
   }

   public void method824() {
      if(this.aLong_6491 != 0L) {
         IUnknown.Release(this.aLong_6491);
         this.aLong_6491 = 0L;
      }

      this.anInt_6492 = 0;
      this.anInt_6493 = 0;
      this.aRenderer_Sub3_Sub2_6494.method7127(this);
   }

   void method4171() {
      if(this.aLong_6491 != 0L) {
         this.aRenderer_Sub3_Sub2_6494.method951(this.aLong_6491);
         this.aLong_6491 = 0L;
         this.anInt_6492 = 0;
         this.anInt_6493 = 0;
      }

   }

   public void finalize() {
      this.method4171();
   }

   public long method4851(int var1, int var2) {
      return IDirect3DVertexBuffer.Lock(this.aLong_6491, var1, var2, this.aBoolean_6495?8192:0);
   }

   int method4173() {
      return this.aByte_6496;
   }

   public void method4852() {
      IDirect3DVertexBuffer.Unlock(this.aLong_6491);
   }

   Class337(Renderer_Sub3_Sub2 var1, boolean var2) {
      this.aRenderer_Sub3_Sub2_6494 = var1;
      this.aBoolean_6495 = var2;
      this.aRenderer_Sub3_Sub2_6494.method7181(this);
   }
}
