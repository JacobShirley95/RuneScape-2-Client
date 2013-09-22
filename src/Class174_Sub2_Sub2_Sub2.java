import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.h;
import java.awt.Canvas;

public class Class174_Sub2_Sub2_Sub2 extends Class174_Sub2_Sub2 implements Class324 {

   long aLong_7733;
   final Canvas aCanvas_7734;
   int anInt_7735;
   D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS_7736;
   long aLong_7737;
   final Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_7738;
   int anInt_7739;
   boolean aBoolean_7740 = false;
   boolean aBoolean_7741 = false;
   long aLong_7742;


   public void method3970() {
      this.method2195();
      this.aD3DPRESENT_PARAMETERS_7736 = new D3DPRESENT_PARAMETERS(this.aCanvas_7734);
      this.aD3DPRESENT_PARAMETERS_7736.aBoolean_1149 = true;
      this.aD3DPRESENT_PARAMETERS_7736.anInt_1144 = 1;
      this.aD3DPRESENT_PARAMETERS_7736.anInt_1141 = this.anInt_7735;
      this.aD3DPRESENT_PARAMETERS_7736.anInt_1142 = this.anInt_7739;
      if(this.aBoolean_7741) {
         this.aLong_7742 = IDirect3DDevice.GetSwapChain(this.aRenderer_Sub3_Sub2_7738.curScene, 0);
         this.aLong_7737 = IDirect3DSwapChain.GetBackBuffer(this.aLong_7742, 0, 0);
         this.aLong_7733 = IDirect3DDevice.GetDepthStencilSurface(this.aRenderer_Sub3_Sub2_7738.curScene);
      } else {
         if(!Renderer_Sub3_Sub2.method950(this.aRenderer_Sub3_Sub2_7738.anInt_1452, this.aRenderer_Sub3_Sub2_7738.anInt_1424, this.aRenderer_Sub3_Sub2_7738.aLong_1425, this.aRenderer_Sub3_Sub2_7738.anInt_10635, this.aD3DPRESENT_PARAMETERS_7736)) {
            throw new RuntimeException();
         }

         int var1 = this.aD3DPRESENT_PARAMETERS_7736.anInt_1151;
         this.aLong_7742 = IDirect3DDevice.CreateAdditionalSwapChain(this.aRenderer_Sub3_Sub2_7738.curScene, this.aD3DPRESENT_PARAMETERS_7736);
         this.aLong_7737 = IDirect3DSwapChain.GetBackBuffer(this.aLong_7742, 0, 0);
         this.aLong_7733 = IDirect3DDevice.CreateDepthStencilSurface(this.aRenderer_Sub3_Sub2_7738.curScene, this.anInt_7735, this.anInt_7739, var1, this.aD3DPRESENT_PARAMETERS_7736.anInt_1145, this.aD3DPRESENT_PARAMETERS_7736.anInt_1146, false);
      }

      if(this.aBoolean_7740) {
         this.method2196();
      }

   }

   public int method2194() {
      return this.anInt_7735;
   }

   Class174_Sub2_Sub2_Sub2(Renderer_Sub3_Sub2 var1, Canvas var2, int var3, int var4, boolean var5) {
      super(var1);
      this.aCanvas_7734 = var2;
      this.aRenderer_Sub3_Sub2_7738 = var1;
      this.anInt_7735 = var3;
      this.anInt_7739 = var4;
      this.aBoolean_7741 = var5;
      this.method3970();
      this.aRenderer_Sub3_Sub2_7738.method899(this);
   }

   public boolean method2196() {
      this.aBoolean_7740 = true;
      return h.method186(IDirect3DDevice.SetRenderTarget(this.aRenderer_Sub3_Sub2_7738.curScene, 0, this.aLong_7737))?false:(h.method186(IDirect3DDevice.SetDepthStencilSurface(this.aRenderer_Sub3_Sub2_7738.curScene, this.aLong_7733))?false:super.method2196());
   }

   boolean method2197() {
      this.aBoolean_7740 = false;
      return h.method187(IDirect3DDevice.SetDepthStencilSurface(this.aRenderer_Sub3_Sub2_7738.curScene, 0L));
   }

   public int method7576() {
      return IDirect3DSwapChain.Present(this.aLong_7742, 0);
   }

   void method7575(int var1, int var2) {
      this.method2195();
      this.anInt_7735 = var1;
      this.anInt_7739 = var2;
      if(this.aBoolean_7741) {
         this.aRenderer_Sub3_Sub2_7738.method890();
      }

      this.method3970();
      super.method7575(var1, var2);
   }

   public void method2195() {
      if(this.aLong_7737 != 0L) {
         IUnknown.Release(this.aLong_7737);
         this.aLong_7737 = 0L;
      }

      if(this.aLong_7733 != 0L) {
         IUnknown.Release(this.aLong_7733);
         this.aLong_7733 = 0L;
      }

      if(this.aLong_7742 != 0L) {
         IUnknown.Release(this.aLong_7742);
         this.aLong_7742 = 0L;
      }

      this.aRenderer_Sub3_Sub2_7738.method900(this);
   }

   public void finalize() throws Throwable {
      this.method5035();
      super.finalize();
   }

   public int method2198() {
      return this.anInt_7739;
   }

   void method5035() {
      if(this.aLong_7737 != 0L) {
         IUnknown.Release(this.aLong_7737);
         this.aLong_7737 = 0L;
      }

      if(this.aLong_7733 != 0L) {
         IUnknown.Release(this.aLong_7733);
         this.aLong_7733 = 0L;
      }

      if(this.aLong_7742 != 0L) {
         IUnknown.Release(this.aLong_7742);
         this.aLong_7742 = 0L;
      }

      this.aRenderer_Sub3_Sub2_7738.method900(this);
   }

   public int method7574(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.aLong_7742, 0);
   }

@Override
public void method3972() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean method3978() {
	// TODO Auto-generated method stub
	return false;
}
}
