import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;

public class Class328_Sub2 extends Class328 implements Class398 {

   final int anInt_3935;


   public void method4976() {
      this.aRenderer_Sub3_Sub2_6354.method964(this);
   }

   public void method824() {
      super.method824();
   }

   public void method4038(Class389 var1) {
      super.method4038(var1);
   }

   Class328_Sub2(Renderer_Sub3_Sub2 var1, int var2, boolean var3, int[][] var4) {
      super(var1, Class136.aClass136_2625, Class87.aClass87_1759, var3 && var1.aBoolean_1435, var2 * var2 * 6);
      this.anInt_3935 = var2;
      if(this.aBoolean_6353) {
         this.aLong_6352 = IDirect3DDevice.CreateCubeTexture(this.aRenderer_Sub3_Sub2_6354.curScene, this.anInt_3935, 0, 1024, 21, 1);
      } else {
         this.aLong_6352 = IDirect3DDevice.CreateCubeTexture(this.aRenderer_Sub3_Sub2_6354.curScene, this.anInt_3935, 1, 0, 21, 1);
      }

      ByteBuffer var5 = this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646;

      for(int var6 = 0; var6 < 6; ++var6) {
         var5.clear();
         var5.asIntBuffer().put(var4[var6]);
         IDirect3DCubeTexture.Upload(this.aLong_6352, var6, 0, 0, 0, this.anInt_3935, this.anInt_3935, this.anInt_3935 * 4, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
      }

   }

@Override
public void method4977(Class389 var1) {
	// TODO Auto-generated method stub
	
}

@Override
public void method4978() {
	// TODO Auto-generated method stub
	
}
}
