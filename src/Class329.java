import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.h;

public class Class329 implements Class414 {

   int anInt_6357;
   int anInt_6358;
   final Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_6359;
   final boolean aBoolean_6360;
   final Class87 aClass87_6361;
   long aLong_6362 = 0L;


   public int method4854() {
      return this.anInt_6358;
   }

   public void method5136(int var1) {
      this.anInt_6358 = this.aClass87_6361.anInt_1764 * -151363651 * var1;
      if(this.anInt_6358 > this.anInt_6357) {
         if(this.aLong_6362 != 0L) {
            IUnknown.Release(this.aLong_6362);
         }

         int var2 = 8;
         byte var3;
         if(this.aBoolean_6360) {
            var3 = 0;
            var2 |= 512;
         } else {
            var3 = 1;
         }

         this.aLong_6362 = IDirect3DDevice.CreateIndexBuffer(this.aRenderer_Sub3_Sub2_6359.curScene, this.anInt_6358, var2, this.aClass87_6361 == Class87.aClass87_1763?101:102, var3);
         this.anInt_6357 = this.anInt_6358;
      }

   }

   public long method4851(int var1, int var2) {
      return IDirect3DIndexBuffer.Lock(this.aLong_6362, var1, var2, this.aBoolean_6360?8192:0);
   }

   public void method4852() {
      IDirect3DIndexBuffer.Unlock(this.aLong_6362);
   }

   public boolean method4853(int var1, int var2, long var3) {
      return h.method187(IDirect3DIndexBuffer.Upload(this.aLong_6362, var1, var2, this.aBoolean_6360?8192:0, var3));
   }

   public void finalize() {
      this.method4056();
   }

   public Class87 method5138() {
      return this.aClass87_6361;
   }

   void method4056() {
      if(this.aLong_6362 != 0L) {
         this.aRenderer_Sub3_Sub2_6359.method951(this.aLong_6362);
         this.aLong_6362 = 0L;
      }

      this.anInt_6357 = 0;
      this.anInt_6358 = 0;
   }

   public void method824() {
      if(this.aLong_6362 != 0L) {
         IUnknown.Release(this.aLong_6362);
         this.aLong_6362 = 0L;
      }

      this.anInt_6357 = 0;
      this.anInt_6358 = 0;
      this.aRenderer_Sub3_Sub2_6359.method7127(this);
   }

   Class329(Renderer_Sub3_Sub2 var1, Class87 var2, boolean var3) {
      this.aRenderer_Sub3_Sub2_6359 = var1;
      this.aClass87_6361 = var2;
      this.aBoolean_6360 = var3;
      this.aRenderer_Sub3_Sub2_6359.method7181(this);
   }
}
