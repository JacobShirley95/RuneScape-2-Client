import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;

public class Class328_Sub1 extends Class328 implements Class54 {

   final int anInt_3894;
   final int anInt_3895;
   final int anInt_3896;


   long method4040() {
      return this.aLong_6352;
   }

   public void method4038(Class389 var1) {
      super.method4038(var1);
   }

   public void method824() {
      super.method824();
   }

   public void method4976() {
      this.aRenderer_Sub3_Sub2_6354.method924(this);
   }

   Class328_Sub1(Renderer_Sub3_Sub2 var1, Class136 var2, int var3, int var4, int var5, boolean var6, byte[] var7) {
      super(var1, var2, Class87.aClass87_1759, false, var3 * var4 * var5);
      this.anInt_3895 = var3;
      this.anInt_3894 = var4;
      this.anInt_3896 = var5;
      this.aLong_6352 = IDirect3DDevice.CreateVolumeTexture(this.aRenderer_Sub3_Sub2_6354.curScene, var3, var4, var5, 1, 0, Renderer_Sub3_Sub2.method958(var2, this.aClass87_6350), 1);
      ByteBuffer var8 = this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646;
      var8.clear();
      var8.put(var7);
      IDirect3DVolumeTexture.Upload(this.aLong_6352, 0, 0, 0, 0, this.anInt_3895, this.anInt_3894, this.anInt_3896, this.anInt_3895 * var2.anInt_2624 * 191693721, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
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
