import java.nio.ByteBuffer;

public class FontRenderer_Sub2 extends FontRenderer {

   final Renderer_Sub3 aRenderer_Sub3_10689;
   final Class384 aClass384_10690;
   final Class76 aClass76_10691;
   byte[] aByteArray_10692 = new byte[512];
   int anInt_10693;
   int anInt_10694;


   void method1074(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aRenderer_Sub3_10689.method7148() != Class56.aClass56_1089) {
         var2 += this.aByteArray_10692[var1 * 2];
         var3 += this.aByteArray_10692[var1 * 2 + 1];
         this.aRenderer_Sub3_10689.aClass59_10605.method573((float)var2, (float)var3, (float)(var2 + this.anInt_10694), (float)(var3 + this.anInt_10694), (float)(var1 % 16) / 16.0F * this.aClass384_10690.method4864(), (float)(var1 / 16) / 16.0F * this.aClass384_10690.method4873(), (float)(var1 % 16 + 1) / 16.0F * this.aClass384_10690.method4864(), (float)(var1 / 16 + 1) / 16.0F * this.aClass384_10690.method4873(), this.aClass384_10690, var4);
      } else {
         this.aRenderer_Sub3_10689.method7194();
         this.aRenderer_Sub3_10689.method7279(1);
         SpriteRenderer var6 = this.aRenderer_Sub3_10689.spriteRenderer;
         var6.aClass384_1262 = this.aClass384_10690;
         var6.method687(0, var4);
         float var7 = (float)this.aRenderer_Sub3_10689.method1896(108298768).method2194();
         float var8 = (float)this.aRenderer_Sub3_10689.method1896(1241892380).method2198();
         var6.anArrayViewport_1265.method4557(2.0F / var7, 2.0F / var8, 1.0F, 1.0F);
         var6.anArrayViewport_1265.data[12] = ((float)var2 + this.aRenderer_Sub3_10689.method7146()) * 2.0F / var7 - 1.0F;
         var6.anArrayViewport_1265.data[13] = ((float)var3 + this.aRenderer_Sub3_10689.method7146()) * 2.0F / var8 - 1.0F;
         var6.anArrayViewport_1265.data[14] = -1.0F;
         var6.anArrayViewport_1263.reset();
         var6.aClass76_1264 = this.aClass76_10691;
         var6.anInt_1268 = var1 * 4;
         var6.aClass379_1269 = this.aRenderer_Sub3_10689.aClass379_10495;
         var6.method688();
      }

   }

   void method1071(char var1, int var2, int var3, int var4, boolean var5, Class1024 var6, int var7, int var8) {}

   FontRenderer_Sub2(Renderer_Sub3 var1, RSFont var2, ImageData[] var3, boolean var4) {
      super(var1, var2);
      this.aRenderer_Sub3_10689 = var1;
      this.anInt_10694 = 0;

      for(int var5 = 0; var5 < 256; ++var5) {
         ImageData var6 = var3[var5];
         if(var6.height > this.anInt_10694) {
            this.anInt_10694 = var6.height;
         }

         if(var6.width > this.anInt_10694) {
            this.anInt_10694 = var6.width;
         }
      }

      this.anInt_10693 = this.anInt_10694 * 16;
      ImageData var7;
      int var8;
      int var10;
      int var11;
      int var12;
      int var13;
      int var15;
      int var16;
      int var23;
      if(var4) {
         byte[] var21 = new byte[this.anInt_10693 * this.anInt_10693];

         for(var23 = 0; var23 < 256; ++var23) {
            var7 = var3[var23];
            var8 = var7.height;
            int var9 = var7.width;
            var10 = var23 % 16 * this.anInt_10694;
            var11 = var23 / 16 * this.anInt_10694;
            var12 = var11 * this.anInt_10693 + var10;
            var13 = 0;
            byte[] var14;
            if(var7.aByteArray_10493 == null) {
               var14 = var7.data;

               for(var15 = 0; var15 < var8; ++var15) {
                  for(var16 = 0; var16 < var9; ++var16) {
                     var21[var12++] = (byte)(var14[var13++] == 0?0:-1);
                  }

                  var12 += this.anInt_10693 - var9;
               }
            } else {
               var14 = var7.aByteArray_10493;

               for(var15 = 0; var15 < var8; ++var15) {
                  for(var16 = 0; var16 < var9; ++var16) {
                     var21[var12++] = var14[var13++];
                  }

                  var12 += this.anInt_10693 - var9;
               }
            }
         }

         int[] var25 = new int[var21.length];

         for(int var24 = 0; var24 < var21.length; ++var24) {
            var25[var24] = var21[var24] << 24 | 16777215;
         }

         this.aClass384_10690 = var1.method7297(this.anInt_10693, this.anInt_10693, false, var25);
      } else {
         int[] var20 = new int[this.anInt_10693 * this.anInt_10693];

         for(var23 = 0; var23 < 256; ++var23) {
            var7 = var3[var23];
            int[] var28 = var7.anIntArray_10491;
            byte[] var29 = var7.aByteArray_10493;
            byte[] var31 = var7.data;
            var11 = var7.height;
            var12 = var7.width;
            var13 = var23 % 16 * this.anInt_10694;
            int var33 = var23 / 16 * this.anInt_10694;
            var15 = var33 * this.anInt_10693 + var13;
            var16 = 0;
            int var17;
            int var18;
            if(var29 != null) {
               for(var17 = 0; var17 < var11; ++var17) {
                  for(var18 = 0; var18 < var12; ++var18) {
                     var20[var15++] = var29[var16] << 24 | var28[var31[var16] & 255];
                     ++var16;
                  }

                  var15 += this.anInt_10693 - var12;
               }
            } else {
               for(var17 = 0; var17 < var11; ++var17) {
                  for(var18 = 0; var18 < var12; ++var18) {
                     byte var19;
                     if((var19 = var31[var16++]) != 0) {
                        var20[var15++] = -16777216 | var28[var19 & 255];
                     } else {
                        ++var15;
                     }
                  }

                  var15 += this.anInt_10693 - var12;
               }
            }
         }

         this.aClass384_10690 = var1.method7297(this.anInt_10693, this.anInt_10693, false, var20);
      }

      this.aClass384_10690.method4977(Class389.aClass389_7494);
      this.aClass76_10691 = var1.method7320(false);
      this.aClass76_10691.method981(20480, 20);
      ByteBuffer var22 = this.aRenderer_Sub3_10689.aByteBuffer_10646;
      var22.clear();
      float var26 = this.aClass384_10690.method4862((float)this.anInt_10693) / (float)this.anInt_10693;
      float var27 = this.aClass384_10690.method4865((float)this.anInt_10693) / (float)this.anInt_10693;

      ImageData var30;
      for(var8 = 0; var8 < 256; ++var8) {
         var30 = var3[var8];
         var10 = var30.height;
         var11 = var30.width;
         var12 = var30.y;
         var13 = var30.x;
         float var32 = (float)(var8 % 16 * this.anInt_10694);
         float var38 = (float)(var8 / 16 * this.anInt_10694);
         float var37 = var32 * var26;
         float var36 = var38 * var27;
         float var35 = (var32 + (float)var11) * var26;
         float var34 = (var38 + (float)var10) * var27;
         var22.putFloat((float)var13);
         var22.putFloat((float)var12);
         var22.putFloat(0.0F);
         var22.putFloat(var37);
         var22.putFloat(var36);
         var22.putFloat((float)var13);
         var22.putFloat((float)(var12 + var10));
         var22.putFloat(0.0F);
         var22.putFloat(var37);
         var22.putFloat(var34);
         var22.putFloat((float)(var13 + var11));
         var22.putFloat((float)(var12 + var10));
         var22.putFloat(0.0F);
         var22.putFloat(var35);
         var22.putFloat(var34);
         var22.putFloat((float)(var13 + var11));
         var22.putFloat((float)var12);
         var22.putFloat(0.0F);
         var22.putFloat(var35);
         var22.putFloat(var36);
      }

      this.aClass76_10691.method4853(0, var22.position(), this.aRenderer_Sub3_10689.aLong_10629);

      for(var8 = 0; var8 < 256; ++var8) {
         var30 = var3[var8];
         this.aByteArray_10692[var8 * 2] = (byte)var30.x;
         this.aByteArray_10692[var8 * 2 + 1] = (byte)var30.y;
      }

   }
}
