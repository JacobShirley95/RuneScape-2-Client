import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.h;

public class Class328_Sub3_Sub1 extends Class328_Sub3 implements Class406 {

   public Class101 method5013(int var1) {
      return new Class426(this, var1);
   }

   public void method4872(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong_6352, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.aRenderer_Sub3_Sub2_6354.curScene, var3, var4, 21, 0, 0, true);
      if(h.method187(IDirect3DDevice.StretchRect(this.aRenderer_Sub3_Sub2_6354.curScene, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
         this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646.clear();
         this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public int method4868() {
      return super.method4868();
   }

   public int method4863() {
      return super.method4863();
   }

   public float method4865(float var1) {
      return super.method4865(var1);
   }

   public boolean method4866() {
      return super.method4866();
   }

   public void method4869(boolean var1, boolean var2) {
      super.method4869(var1, var2);
   }

   public void method4867(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      super.method4867(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method4870(int var1, int var2, int var3, int var4, byte[] var5, Class136 var6, int var7, int var8) {
      super.method4870(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public float method4864() {
      return super.method4864();
   }

   public float method4873() {
      return super.method4873();
   }

   public void method4038(Class389 var1) {
      super.method4038(var1);
   }

   public void method824() {
      super.method824();
   }

   public boolean method4871() {
      return super.method4871();
   }

   Class328_Sub3_Sub1(Renderer_Sub3_Sub2 var1, Class136 var2, Class87 var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5, 1025, 0);
   }

   public void method4976() {
      super.method4976();
   }

   public float method4862(float var1) {
      return super.method4862(var1);
   }
}
