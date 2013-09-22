import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;

public class Class379_Sub1 extends Class379 {

   long aLong_3743 = 0L;
   Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_3744;


   void method2710(ByteBuffer var1, short var2, short var3, byte var4, byte var5, byte var6, byte var7) {
      var1.putShort(var2);
      var1.putShort(var3);
      var1.put(var4);
      var1.put(var5);
      var1.put(var6);
      var1.put(var7);
   }

   public void method824() {
      if(this.aLong_3743 != 0L) {
         IUnknown.Release(this.aLong_3743);
         this.aLong_3743 = 0L;
      }

      this.aRenderer_Sub3_Sub2_3744.method7127(this);
   }

   void method2712() {
      if(this.aLong_3743 != 0L) {
         this.aRenderer_Sub3_Sub2_3744.method951(this.aLong_3743);
         this.aLong_3743 = 0L;
      }

   }

   Class379_Sub1(Renderer_Sub3_Sub2 var1, Class402[] var2) {
      super(var2);
      this.aRenderer_Sub3_Sub2_3744 = var1;
      byte var3 = 0;
      ByteBuffer var4 = this.aRenderer_Sub3_Sub2_3744.aByteBuffer_10646;
      var4.clear();

      for(short var5 = 0; var5 < this.aClass402Array_7334.length; ++var5) {
         short var6 = 0;
         Class402 var7 = this.aClass402Array_7334[var5];

         for(int var8 = 0; var8 < var7.method4971(); ++var8) {
            Class380 var9 = var7.method4970(var8);
            if(var9 == Class380.aClass380_7356) {
               this.method2710(var4, var5, var6, (byte)2, (byte)0, (byte)0, (byte)0);
            } else if(var9 == Class380.aClass380_7352) {
               this.method2710(var4, var5, var6, (byte)2, (byte)0, (byte)3, (byte)0);
            } else if(var9 == Class380.aClass380_7353) {
               this.method2710(var4, var5, var6, (byte)4, (byte)0, (byte)10, (byte)0);
            } else if(var9 == Class380.aClass380_7354) {
               this.method2710(var4, var5, var6, (byte)0, (byte)0, (byte)5, var3++);
            } else if(var9 == Class380.aClass380_7355) {
               this.method2710(var4, var5, var6, (byte)1, (byte)0, (byte)5, var3++);
            } else if(var9 == Class380.aClass380_7368) {
               this.method2710(var4, var5, var6, (byte)2, (byte)0, (byte)5, var3++);
            } else if(var9 == Class380.aClass380_7357) {
               this.method2710(var4, var5, var6, (byte)3, (byte)0, (byte)5, var3++);
            }

            var6 = (short)(var6 + var9.anInt_7367);
         }
      }

      this.method2710(var4, (short)255, (short)0, (byte)17, (byte)0, (byte)0, (byte)0);
      this.aLong_3743 = IDirect3DDevice.CreateVertexDeclaration(this.aRenderer_Sub3_Sub2_3744.curScene, this.aRenderer_Sub3_Sub2_3744.aLong_10629);
      this.aRenderer_Sub3_Sub2_3744.method7181(this);
   }

   public void finalize() {
      this.method2712();
   }
}
