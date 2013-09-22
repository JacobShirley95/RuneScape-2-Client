import jaggl.OpenGL;

public class TextRenderer_Sub5 extends FontRenderer {

   final OGLTexture_Sub3_Sub1 anOGLTexture_Sub3_Sub1_10718;
   final Class150 aClass150_10719;
   final OpenGLRenderer aRenderer_Sub2_10720;
   final boolean aBoolean_10721;


   void method1074(char var1, int var2, int var3, int var4, boolean var5) {
      this.aRenderer_Sub2_10720.method7012();
      this.aRenderer_Sub2_10720.setTextureRenderer(this.anOGLTexture_Sub3_Sub1_10718);
      if(!this.aBoolean_10721 && !var5) {
         this.aRenderer_Sub2_10720.setTexEnv(7681, 7681);
      } else {
         this.aRenderer_Sub2_10720.setTexEnv(7681, 8448);
         this.aRenderer_Sub2_10720.method7020(0, '\u8578', 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass150_10719.method1832(var1);
      OpenGL.glLoadIdentity();
      if(this.aBoolean_10721 || var5) {
         this.aRenderer_Sub2_10720.method7020(0, 5890, 768);
      }

   }

   TextRenderer_Sub5(OpenGLRenderer var1, RSFont var2, ImageData[] var3, boolean var4) {
      super(var1, var2);
      this.aRenderer_Sub2_10720 = var1;
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < 256; ++var6) {
         ImageData var7 = var3[var6];
         if(var7.height > var5) {
            var5 = var7.height;
         }

         if(var7.width > var5) {
            var5 = var7.width;
         }
      }

      var6 = var5 * 16;
      int var8;
      ImageData var9;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var17;
      int var18;
      if(var4) {
         byte[] var22 = new byte[var6 * var6];

         for(var8 = 0; var8 < 256; ++var8) {
            var9 = var3[var8];
            int var10 = var9.height;
            var11 = var9.width;
            var12 = var8 % 16 * var5;
            var13 = var8 / 16 * var5;
            var14 = var13 * var6 + var12;
            var15 = 0;
            byte[] var16;
            if(var9.aByteArray_10493 == null) {
               var16 = var9.data;

               for(var17 = 0; var17 < var10; ++var17) {
                  for(var18 = 0; var18 < var11; ++var18) {
                     var22[var14++] = (byte)(var16[var15++] == 0?0:-1);
                  }

                  var14 += var6 - var11;
               }
            } else {
               var16 = var9.aByteArray_10493;

               for(var17 = 0; var17 < var10; ++var17) {
                  for(var18 = 0; var18 < var11; ++var18) {
                     var22[var14++] = var16[var15++];
                  }

                  var14 += var6 - var11;
               }
            }
         }

         this.anOGLTexture_Sub3_Sub1_10718 = OGLTexture_Sub3_Sub1.method1212(var1, Class136.aClass136_2626, Class87.aClass87_1759, var6, var6, false, var22, Class136.aClass136_2626);
         this.aBoolean_10721 = true;
      } else {
         int[] var24 = new int[var6 * var6];

         for(var8 = 0; var8 < 256; ++var8) {
            var9 = var3[var8];
            int[] var28 = var9.anIntArray_10491;
            byte[] var27 = var9.aByteArray_10493;
            byte[] var30 = var9.data;
            var13 = var9.height;
            var14 = var9.width;
            var15 = var8 % 16 * var5;
            int var31 = var8 / 16 * var5;
            var17 = var31 * var6 + var15;
            var18 = 0;
            int var19;
            int var20;
            if(var27 != null) {
               for(var19 = 0; var19 < var13; ++var19) {
                  for(var20 = 0; var20 < var14; ++var20) {
                     var24[var17++] = var27[var18] << 24 | var28[var30[var18] & 255];
                     ++var18;
                  }

                  var17 += var6 - var14;
               }
            } else {
               for(var19 = 0; var19 < var13; ++var19) {
                  for(var20 = 0; var20 < var14; ++var20) {
                     byte var21;
                     if((var21 = var30[var18++]) != 0) {
                        var24[var17++] = -16777216 | var28[var21 & 255];
                     } else {
                        ++var17;
                     }
                  }

                  var17 += var6 - var14;
               }
            }
         }

         this.anOGLTexture_Sub3_Sub1_10718 = OGLTexture_Sub3_Sub1.getOGLTexture(var1, var6, var6, false, var24, 0, 0);
         this.aBoolean_10721 = false;
      }

      this.anOGLTexture_Sub3_Sub1_10718.method1852(false);
      this.aClass150_10719 = new Class150(var1, 256);
      float var23 = this.anOGLTexture_Sub3_Sub1_10718.textureX / (float)this.anOGLTexture_Sub3_Sub1_10718.textureWidth;
      float var25 = this.anOGLTexture_Sub3_Sub1_10718.textureY / (float)this.anOGLTexture_Sub3_Sub1_10718.textureHeight;

      for(int var26 = 0; var26 < 256; ++var26) {
         ImageData var29 = var3[var26];
         var11 = var29.height;
         var12 = var29.width;
         var13 = var29.y;
         var14 = var29.x;
         float var32 = (float)(var26 % 16 * var5);
         float var33 = (float)(var26 / 16 * var5);
         float var36 = var32 * var23;
         float var35 = var33 * var25;
         float var34 = (var32 + (float)var12) * var23;
         float var37 = (var33 + (float)var11) * var25;
         this.aClass150_10719.method1831(var26);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var36, this.anOGLTexture_Sub3_Sub1_10718.textureY - var35);
         OpenGL.glVertex2i(var14, var13);
         OpenGL.glTexCoord2f(var36, this.anOGLTexture_Sub3_Sub1_10718.textureY - var37);
         OpenGL.glVertex2i(var14, var13 + var11);
         OpenGL.glTexCoord2f(var34, this.anOGLTexture_Sub3_Sub1_10718.textureY - var37);
         OpenGL.glVertex2i(var14 + var12, var13 + var11);
         OpenGL.glTexCoord2f(var34, this.anOGLTexture_Sub3_Sub1_10718.textureY - var35);
         OpenGL.glVertex2i(var14 + var12, var13);
         OpenGL.glEnd();
         this.aClass150_10719.method1830();
      }

   }

   void method1071(char var1, int var2, int var3, int var4, boolean var5, Class1024 var6, int var7, int var8) {
      Class1024_Sub1 var9 = (Class1024_Sub1)var6;
      OGLTexture_Sub3_Sub1 var10 = var9.anOGLTexture_Sub3_Sub1_10747;
      this.aRenderer_Sub2_10720.method7012();
      this.aRenderer_Sub2_10720.setTextureRenderer(this.anOGLTexture_Sub3_Sub1_10718);
      if(!this.aBoolean_10721 && !var5) {
         this.aRenderer_Sub2_10720.setTexEnv(7681, 7681);
      } else {
         this.aRenderer_Sub2_10720.setTexEnv(7681, 8448);
         this.aRenderer_Sub2_10720.method7020(0, '\u8578', 768);
      }

      this.aRenderer_Sub2_10720.setTexture(1);
      this.aRenderer_Sub2_10720.setTextureRenderer(var10);
      this.aRenderer_Sub2_10720.setTexEnv(7681, 8448);
      this.aRenderer_Sub2_10720.method7020(0, '\u8578', 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.textureX / (float)var10.textureWidth;
      float var12 = var10.textureY / (float)var10.textureHeight;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-var7) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-var8) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass150_10719.method1832(var1);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.aRenderer_Sub2_10720.method7020(0, 5890, 768);
      this.aRenderer_Sub2_10720.setTexEnv(8448, 8448);
      this.aRenderer_Sub2_10720.setTextureRenderer((OGLTexture)null);
      this.aRenderer_Sub2_10720.setTexture(0);
      if(this.aBoolean_10721 || var5) {
         this.aRenderer_Sub2_10720.method7020(0, 5890, 768);
      }

   }
}
