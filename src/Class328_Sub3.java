import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

public class Class328_Sub3 extends Class328 implements Class384 {

   final int width;
   final int height;
   final float floatX;
   final float floatY;
   boolean aBoolean_4022;
   boolean aBoolean_4023;


   Class328_Sub3(Renderer_Sub3_Sub2 var1, int var2, int var3, boolean var4, int[] var5, int var6, int var7) {
      super(var1, Class136.aClass136_2625, Class87.aClass87_1759, var4 && var1.aBoolean_1436, var2 * var3);
      if(!this.aRenderer_Sub3_Sub2_6354.aBoolean_1432) {
         this.width = Class105.method1359(var2, (byte)127);
         this.height = Class105.method1359(var3, (byte)124);
         this.floatX = (float)var2 / (float)this.width;
         this.floatY = (float)var3 / (float)this.height;
         if(var2 != this.width || var3 != this.height) {
            var5 = this.method3037(var2, var3, this.width, this.height, var5, var6, var7);
            var6 = 0;
            var7 = this.width;
         }
      } else {
         this.width = var2;
         this.height = var3;
         this.floatX = 1.0F;
         this.floatY = 1.0F;
      }

      if(var4) {
         this.aLong_6352 = IDirect3DDevice.CreateTexture(this.aRenderer_Sub3_Sub2_6354.curScene, this.width, this.height, 0, 1024, 21, 1);
      } else {
         this.aLong_6352 = IDirect3DDevice.CreateTexture(this.aRenderer_Sub3_Sub2_6354.curScene, this.width, this.height, 1, 0, 21, 1);
      }

      if(var7 == 0) {
         var7 = this.width;
      }

      ByteBuffer var8 = this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646;
      var8.clear();
      var8.asIntBuffer().put(var5, var6, var7 * this.height);
      IDirect3DTexture.Upload(this.aLong_6352, 0, 0, 0, this.width, this.height, var7 * this.aClass136_6351.anInt_2624 * 191693721, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
   }

   Class328_Sub3(Renderer_Sub3_Sub2 var1, Class136 var2, int var3, int var4, boolean var5, byte[] var6, int var7, int var8) {
      super(var1, var2, Class87.aClass87_1759, var5 && var1.aBoolean_1436, var3 * var4);
      if(!this.aRenderer_Sub3_Sub2_6354.aBoolean_1432) {
         this.width = Class105.method1359(var3, (byte)127);
         this.height = Class105.method1359(var4, (byte)124);
         this.floatX = (float)var3 / (float)this.width;
         this.floatY = (float)var4 / (float)this.height;
         if(var3 != this.width || var4 != this.height) {
            var6 = this.method3038(var3, var4, this.width, this.height, var6, var7, var8, var2.anInt_2624 * 191693721);
            var7 = 0;
            var8 = this.width;
         }
      } else {
         this.width = var3;
         this.height = var4;
         this.floatX = 1.0F;
         this.floatY = 1.0F;
      }

      if(var5) {
         this.aLong_6352 = IDirect3DDevice.CreateTexture(this.aRenderer_Sub3_Sub2_6354.curScene, this.width, this.height, 0, 1024, Renderer_Sub3_Sub2.method958(this.aClass136_6351, Class87.aClass87_1759), 1);
      } else {
         this.aLong_6352 = IDirect3DDevice.CreateTexture(this.aRenderer_Sub3_Sub2_6354.curScene, this.width, this.height, 1, 0, Renderer_Sub3_Sub2.method958(this.aClass136_6351, Class87.aClass87_1759), 1);
      }

      if(var8 == 0) {
         var8 = this.width;
      }

      ByteBuffer var9 = this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646;
      var9.clear();
      if(this.aClass136_6351 == Class136.aClass136_2632) {
         var9.put(var6, var7, this.height * this.width / 2);
         IDirect3DTexture.Upload(this.aLong_6352, 0, 0, 0, this.width, this.height / 4, this.width / 4 * 8, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
      } else if(this.aClass136_6351 == Class136.aClass136_2633) {
         var9.put(var6, var7, this.height * this.width);
         IDirect3DTexture.Upload(this.aLong_6352, 0, 0, 0, this.width, this.height / 4, this.width / 4 * 16, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
      } else {
         var9.put(var6, var7, var8 * this.height);
         IDirect3DTexture.Upload(this.aLong_6352, 0, 0, 0, this.width, this.height, var8 * this.aClass136_6351.anInt_2624 * 191693721, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
      }

   }

   public int method4863() {
      return this.height;
   }

   public float method4865(float var1) {
      return var1 / (float)this.height;
   }

   public float method4864() {
      return this.floatX;
   }

   public float method4873() {
      return this.floatY;
   }

   long method4040() {
      return this.aLong_6352;
   }

   public void method4038(Class389 var1) {
      super.method4038(var1);
   }

   public boolean method4866() {
      return true;
   }

   public void method4867(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if(this.aClass136_6351 == Class136.aClass136_2625 && this.aClass87_6350 == Class87.aClass87_1759) {
         if(var7 == 0) {
            var7 = var3;
         }

         ByteBuffer var8 = this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646;
         var8.clear();
         var8.asIntBuffer().put(var5, var6, var7 * var4);
         IDirect3DTexture.Upload(this.aLong_6352, 0, var1, var2, var3, var4, var7 * this.aClass136_6351.anInt_2624 * 191693721, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
      } else {
         throw new RuntimeException();
      }
   }

   public void method4870(int var1, int var2, int var3, int var4, byte[] var5, Class136 var6, int var7, int var8) {
      if(this.aClass136_6351 == var6 && this.aClass87_6350 == Class87.aClass87_1759) {
         if(var8 == 0) {
            var8 = var3;
         }

         ByteBuffer var9 = this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(this.aLong_6352, 0, var1, var2, var3, var4, var8 * this.aClass136_6351.anInt_2624 * 191693721, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
      } else {
         throw new RuntimeException();
      }
   }

   public void method4976() {
      this.aRenderer_Sub3_Sub2_6354.method955(this);
   }

   public boolean method4871() {
      return false;
   }

   int[] method3037(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      int[] var8 = new int[var3 * var4];
      if(var7 == 0) {
         var7 = var1;
      }

      for(int var9 = 0; var9 < var4; ++var9) {
         int var10;
         int var11;
         if(var9 < var2) {
            var10 = var6 + var9 * var7;

            for(var11 = 0; var11 < var1; ++var11) {
               var8[var3 * var9 + var11] = var5[var10 + var11];
            }

            var11 = var5[var10 + (var1 - 1)];

            for(int var12 = var1; var12 < var3; ++var12) {
               var8[var3 * var9 + var12] = var11;
            }
         } else {
            var10 = var3 * (var2 - 1);

            for(var11 = 0; var11 < var3; ++var11) {
               var8[var3 * var9 + var11] = var8[var10 + var11];
            }
         }
      }

      return var8;
   }

   Class328_Sub3(Renderer_Sub3_Sub2 var1, Class136 var2, Class87 var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, false, var4 * var5);
      if(!this.aRenderer_Sub3_Sub2_6354.aBoolean_1432) {
         this.width = Class105.method1359(var4, (byte)125);
         this.height = Class105.method1359(var5, (byte)127);
         this.floatX = (float)var4 / (float)this.width;
         this.floatY = (float)var5 / (float)this.height;
      } else {
         this.width = var4;
         this.height = var5;
         this.floatX = 1.0F;
         this.floatY = 1.0F;
      }

      this.aLong_6352 = IDirect3DDevice.CreateTexture(this.aRenderer_Sub3_Sub2_6354.curScene, var4, var5, 0, var6, Renderer_Sub3_Sub2.method958(this.aClass136_6351, this.aClass87_6350), var7);
   }

   byte[] method3038(int var1, int var2, int var3, int var4, byte[] var5, int var6, int var7, int var8) {
      byte[] var9 = new byte[var3 * var4 * var8];
      if(var7 == 0) {
         var7 = var1 * var8;
      }

      for(int var10 = 0; var10 < var4; ++var10) {
         int var11;
         int var12;
         int var13;
         if(var10 < var2) {
            var11 = var6 + var10 * var7;

            for(var12 = 0; var12 < var1; ++var12) {
               for(var13 = 0; var13 < var8; ++var13) {
                  var9[var3 * var10 * var8 + var12 * var8 + var13] = var5[var11 + var12 * var8 + var13];
               }
            }

            byte[] var15 = new byte[var8];

            for(var13 = 0; var13 < var8; ++var13) {
               var15[var13] = var5[var11 + (var1 - 1) * var8 + var13];
            }

            for(var13 = var1; var13 < var3; ++var13) {
               for(int var14 = 0; var14 < var8; ++var14) {
                  var9[var3 * var10 * var8 + var13 * var8 + var14] = var15[var14];
               }
            }
         } else {
            var11 = var3 * (var2 - 1) * var8;

            for(var12 = 0; var12 < var3; ++var12) {
               for(var13 = 0; var13 < var8; ++var13) {
                  var9[var3 * var10 * var8 + var12 * var8 + var13] = var9[var11 + var12 * var8 + var13];
               }
            }
         }
      }

      return var9;
   }

   public void method824() {
      super.method824();
   }

   float[] method3040(int var1, int var2, int var3, int var4, float[] var5, int var6, int var7, int var8) {
      float[] var9 = new float[var3 * var4 * var8];
      if(var7 == 0) {
         var7 = var1 * var8;
      }

      for(int var10 = 0; var10 < var4; ++var10) {
         int var11;
         int var12;
         int var13;
         if(var10 < var2) {
            var11 = var6 + var10 * var7;

            for(var12 = 0; var12 < var1; ++var12) {
               for(var13 = 0; var13 < var8; ++var13) {
                  var9[var3 * var10 * var8 + var12 * var8 + var13] = var5[var11 + var12 * var8 + var13];
               }
            }

            float[] var15 = new float[var8];

            for(var13 = 0; var13 < var8; ++var13) {
               var15[var13] = var5[var11 + (var1 - 1) * var8 + var13];
            }

            for(var13 = var1; var13 < var3; ++var13) {
               for(int var14 = 0; var14 < var8; ++var14) {
                  var9[var3 * var10 * var8 + var13 * var8 + var14] = var15[var14];
               }
            }
         } else {
            var11 = var3 * (var2 - 1) * var8;

            for(var12 = 0; var12 < var3; ++var12) {
               for(var13 = 0; var13 < var8; ++var13) {
                  var9[var3 * var10 * var8 + var12 * var8 + var13] = var9[var11 + var12 * var8 + var13];
               }
            }
         }
      }

      return var9;
   }

   Class328_Sub3(Renderer_Sub3_Sub2 var1, Class136 var2, int var3, int var4, boolean var5, float[] var6, int var7, int var8) {
      super(var1, var2, Class87.aClass87_1759, var5 && var1.aBoolean_1436, var3 * var4);
      if(!this.aRenderer_Sub3_Sub2_6354.aBoolean_1432) {
         this.width = Class105.method1359(var3, (byte)125);
         this.height = Class105.method1359(var4, (byte)127);
         this.floatX = (float)var3 / (float)this.width;
         this.floatY = (float)var4 / (float)this.height;
         if(var3 != this.width || var4 != this.height) {
            var6 = this.method3040(var3, var4, this.width, this.height, var6, var7, var8, var2.anInt_2624 * 191693721);
            var7 = 0;
            var8 = this.width;
         }
      } else {
         this.width = var3;
         this.height = var4;
         this.floatX = 1.0F;
         this.floatY = 1.0F;
      }

      if(var5) {
         this.aLong_6352 = IDirect3DDevice.CreateTexture(this.aRenderer_Sub3_Sub2_6354.curScene, this.width, this.height, 0, 1024, Renderer_Sub3_Sub2.method958(this.aClass136_6351, Class87.aClass87_1767), 1);
      } else {
         this.aLong_6352 = IDirect3DDevice.CreateTexture(this.aRenderer_Sub3_Sub2_6354.curScene, this.width, this.height, 1, 0, Renderer_Sub3_Sub2.method958(this.aClass136_6351, Class87.aClass87_1767), 1);
      }

      if(var8 == 0) {
         var8 = this.width;
      }

      ByteBuffer var9 = this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646;
      var9.clear();
      var9.asFloatBuffer().put(var6, var7, var8 * this.height * this.aClass136_6351.anInt_2624 * 191693721);
      IDirect3DTexture.Upload(this.aLong_6352, 0, 0, 0, this.width, this.height, var8 * this.aClass136_6351.anInt_2624 * 191693721 * 4, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
   }

   public float method4862(float var1) {
      return var1 / (float)this.width;
   }

   public void method4872(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if(this.aClass136_6351 == Class136.aClass136_2625 && this.aClass87_6350 == Class87.aClass87_1759) {
         ByteBuffer var7 = this.aRenderer_Sub3_Sub2_6354.aByteBuffer_10646;
         var7.clear();
         IDirect3DTexture.Download(this.aLong_6352, 0, var1, var2, var3, var4, var3 * 4, 0, this.aRenderer_Sub3_Sub2_6354.aLong_10629);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public void method4869(boolean var1, boolean var2) {
      this.aBoolean_4022 = var1;
      this.aBoolean_4023 = var2;
   }

   public int method4868() {
      return this.width;
   }

   Class328_Sub3(Renderer_Sub3_Sub2 var1, Class136 var2, Class87 var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0, 1);
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
