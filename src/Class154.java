
public class Class154 {

   final int anInt_2735;
   static final int anInt_2736 = 128;
   final OpenGLRenderer aRenderer_Sub2_2737;
   final Class137 aClass137_2738;
   final int anInt_2739;
   final int anInt_2740;
   boolean aBoolean_2741 = true;
   int anInt_2742 = -1;
   static final int anInt_2743 = 7;
   Class166 aClass166_2744;
   Class157_Sub1 aClass157_Sub1_2745;
   OGLTexture_Sub3 anOGLTexture_Sub3_2746;


   void method1839(Class166 var1, int var2) {
      if(var2 != 0) {
         this.method1842();
         this.aRenderer_Sub2_2737.setTextureRenderer(this.anOGLTexture_Sub3_2746);
         this.aRenderer_Sub2_2737.method7009(var1, 4, 0, var2);
      }
   }

   void method1840() {
      this.method1839(this.aClass166_2744, this.anInt_2735);
   }

   void method1841(byte[] var1, int var2) {
      this.aClass157_Sub1_2745.method2072(5123, var1, var2 * 2);
      this.method1839(this.aClass157_Sub1_2745, var2);
   }

   Class154(OpenGLRenderer var1, Class137 var2, Class171_Sub1 var3, int var4, int var5, int var6, int var7, int var8) {
      this.aRenderer_Sub2_2737 = var1;
      this.aClass137_2738 = var2;
      this.anInt_2739 = var7;
      this.anInt_2740 = var8;
      int var9 = 1 << var6;
      int var10 = 0;
      int var11 = var4 << var6;
      int var12 = var5 << var6;

      int var14;
      int var15;
      for(int var13 = 0; var13 < var9; ++var13) {
         var14 = (var12 + var13) * var3.maxWidth * 1658489349 + var11;

         for(var15 = 0; var15 < var9; ++var15) {
            short[] var16 = var3.aShortArrayArray_10852[var14++];
            if(var16 != null) {
               var10 += var16.length;
            }
         }
      }

      this.anInt_2735 = var10;
      if(var10 > 0) {
         ByteArrayDataNode var19 = new ByteArrayDataNode(var10 * 2);
         short[] var17;
         int var18;
         int var20;
         if(this.aRenderer_Sub2_2737.isBigEndian) {
            for(var14 = 0; var14 < var9; ++var14) {
               var15 = (var12 + var14) * var3.maxWidth * 1658489349 + var11;

               for(var20 = 0; var20 < var9; ++var20) {
                  var17 = var3.aShortArrayArray_10852[var15++];
                  if(var17 != null) {
                     for(var18 = 0; var18 < var17.length; ++var18) {
                        var19.method4463(var17[var18] & '\uffff', -1946539577);
                     }
                  }
               }
            }
         } else {
            for(var14 = 0; var14 < var9; ++var14) {
               var15 = (var12 + var14) * var3.maxWidth * 1658489349 + var11;

               for(var20 = 0; var20 < var9; ++var20) {
                  var17 = var3.aShortArrayArray_10852[var15++];
                  if(var17 != null) {
                     for(var18 = 0; var18 < var17.length; ++var18) {
                        var19.method4464(var17[var18] & '\uffff', (byte)1);
                     }
                  }
               }
            }
         }

         this.aClass166_2744 = this.aRenderer_Sub2_2737.method7003(5123, var19.data, var19.index * 964952859, false);
         this.aClass157_Sub1_2745 = new Class157_Sub1(this.aRenderer_Sub2_2737, 5123, (byte[])null, 1);
      } else {
         this.anOGLTexture_Sub3_2746 = null;
      }

   }

   void method1842() {
      if(this.aBoolean_2741) {
         this.aBoolean_2741 = false;
         byte[] var1 = this.aClass137_2738.aByteArray_2640;
         byte[] var2 = this.aRenderer_Sub2_2737.aByteArray_10469;
         int var3 = 0;
         int var4 = this.aClass137_2738.anInt_2642;
         int var5 = this.anInt_2739 + this.anInt_2740 * this.aClass137_2738.anInt_2642;

         int var6;
         int var7;
         for(var6 = -128; var6 < 0; ++var6) {
            var3 = (var3 << 8) - var3;

            for(var7 = -128; var7 < 0; ++var7) {
               if(var1[var5++] != 0) {
                  ++var3;
               }
            }

            var5 += var4 - 128;
         }

         if(this.anOGLTexture_Sub3_2746 != null && this.anInt_2742 == var3) {
            this.aBoolean_2741 = false;
         } else {
            this.anInt_2742 = var3;
            var6 = 0;
            var5 = this.anInt_2739 + this.anInt_2740 * var4;

            for(var7 = -128; var7 < 0; ++var7) {
               for(int var8 = -128; var8 < 0; ++var8) {
                  if(var1[var5] != 0) {
                     var2[var6++] = 68;
                  } else {
                     int var9 = 0;
                     if(var1[var5 - 1] != 0) {
                        ++var9;
                     }

                     if(var1[var5 + 1] != 0) {
                        ++var9;
                     }

                     if(var1[var5 - var4] != 0) {
                        ++var9;
                     }

                     if(var1[var5 + var4] != 0) {
                        ++var9;
                     }

                     var2[var6++] = (byte)(17 * var9);
                  }

                  ++var5;
               }

               var5 += this.aClass137_2738.anInt_2642 - 128;
            }

            if(this.anOGLTexture_Sub3_2746 == null) {
               this.anOGLTexture_Sub3_2746 = new OGLTexture_Sub3(this.aRenderer_Sub2_2737, 3553, Class136.aClass136_2626, Class87.aClass87_1759, 128, 128, false, this.aRenderer_Sub2_2737.aByteArray_10469, Class136.aClass136_2626, false);
               this.anOGLTexture_Sub3_2746.method5442(false, false);
               this.anOGLTexture_Sub3_2746.method1852(true);
            } else {
               this.anOGLTexture_Sub3_2746.method5443(0, 0, 128, 128, this.aRenderer_Sub2_2737.aByteArray_10469, Class136.aClass136_2626, 0, 0, false);
            }

         }
      }
   }
}
