
public abstract class SoftwareSprite extends Sprite {

   static int anInt_10910;
   int width;
   static int anInt_10912;
   int x;
   int y2;
   int x2;
   static int anInt_10916 = 0;
   int[] anIntArray_10917;
   static final int anInt_10918 = 4;
   static final int anInt_10919 = 8;
   static final int anInt_10920 = 12;
   int y;
   static int anInt_10922;
   static int anInt_10923;
   SoftwareRenderer renderer;
   static int anInt_10925;
   static int anInt_10926;
   static int anInt_10927;
   static int anInt_10928;
   static int anInt_10929;
   static int anInt_10930;
   static int anInt_10931;
   static int anInt_10932 = 0;
   static int anInt_10933;
   static int anInt_10934;
   static int anInt_10935;
   static int anInt_10936;
   static int anInt_10937;
   static int anInt_10938 = 0;
   static int anInt_10939 = 0;
   int height;
   static int anInt_10941 = 0;
   static int anInt_10942 = 0;
   static int anInt_10943 = 0;
   static int anInt_10944;
   static int anInt_10945 = 0;


   boolean method7539(float var1, float var2, float var3, float var4, float var5, float var6) {
      int var7 = this.x + this.width + this.x2;
      int var8 = this.y + this.height + this.y2;
      float var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      float var16;
      if(var7 != this.width || var8 != this.height) {
         var9 = (var3 - var1) / (float)var7;
         var10 = (var4 - var2) / (float)var7;
         var11 = (var5 - var1) / (float)var8;
         var12 = (var6 - var2) / (float)var8;
         var13 = var11 * (float)this.y;
         var14 = var12 * (float)this.y;
         var15 = var9 * (float)this.x;
         var16 = var10 * (float)this.x;
         float var17 = -var9 * (float)this.x2;
         float var18 = -var10 * (float)this.x2;
         float var19 = -var11 * (float)this.y2;
         float var20 = -var12 * (float)this.y2;
         var1 += var15 + var13;
         var2 += var16 + var14;
         var3 += var17 + var13;
         var4 += var18 + var14;
         var5 += var15 + var19;
         var6 += var16 + var20;
      }

      var9 = var5 + (var3 - var1);
      var10 = var4 + (var6 - var2);
      if(var1 < var3) {
         var11 = var1;
         var12 = var3;
      } else {
         var11 = var3;
         var12 = var1;
      }

      if(var5 < var11) {
         var11 = var5;
      }

      if(var9 < var11) {
         var11 = var9;
      }

      if(var5 > var12) {
         var12 = var5;
      }

      if(var9 > var12) {
         var12 = var9;
      }

      if(var2 < var4) {
         var13 = var2;
         var14 = var4;
      } else {
         var13 = var4;
         var14 = var2;
      }

      if(var6 < var13) {
         var13 = var6;
      }

      if(var10 < var13) {
         var13 = var10;
      }

      if(var6 > var14) {
         var14 = var6;
      }

      if(var10 > var14) {
         var14 = var10;
      }

      if(var11 < (float)(this.renderer.targetX * -346770183)) {
         var11 = (float)(this.renderer.targetX * -346770183);
      }

      if(var12 > (float)(this.renderer.targetY * 1163141991)) {
         var12 = (float)(this.renderer.targetY * 1163141991);
      }

      if(var13 < (float)(this.renderer.targetWidth * 759884099)) {
         var13 = (float)(this.renderer.targetWidth * 759884099);
      }

      if(var14 > (float)(this.renderer.targetHeight * 108427145)) {
         var14 = (float)(this.renderer.targetHeight * 108427145);
      }

      var12 = var11 - var12;
      if(var12 >= 0.0F) {
         return false;
      } else {
         var14 = var13 - var14;
         if(var14 >= 0.0F) {
            return false;
         } else {
            anInt_10925 = this.renderer.renderWidth * 1176497263;
            anInt_10912 = (int)((float)((int)var13 * anInt_10925) + var11);
            var15 = (var3 - var1) * (var6 - var2) - (var4 - var2) * (var5 - var1);
            var16 = (var5 - var1) * (var4 - var2) - (var6 - var2) * (var3 - var1);
            anInt_10927 = (int)((var6 - var2) * 4096.0F * (float)this.width / var15);
            anInt_10928 = (int)((var4 - var2) * 4096.0F * (float)this.height / var16);
            anInt_10929 = (int)((var5 - var1) * 4096.0F * (float)this.width / var16);
            anInt_10930 = (int)((var3 - var1) * 4096.0F * (float)this.height / var15);
            anInt_10931 = (int)(var11 * 16.0F + 8.0F - (var1 + var3 + var5 + var9) / 4.0F * 16.0F);
            anInt_10936 = (int)(var13 * 16.0F + 8.0F - (var2 + var4 + var6 + var10) / 4.0F * 16.0F);
            anInt_10933 = (this.width >> 1 << 12) + (anInt_10936 * anInt_10929 >> 4);
            anInt_10934 = (this.height >> 1 << 12) + (anInt_10936 * anInt_10930 >> 4);
            anInt_10935 = anInt_10931 * anInt_10927 >> 4;
            anInt_10910 = anInt_10931 * anInt_10928 >> 4;
            anInt_10944 = (int)var11;
            anInt_10922 = (int)var12;
            anInt_10923 = (int)var13;
            anInt_10926 = (int)var14;
            return true;
         }
      }
   }

   public int getHeight() {
      return this.height;
   }

   public void exportDimensions(int[] var1) {
      var1[0] = this.x;
      var1[1] = this.y;
      var1[2] = this.x2;
      var1[3] = this.y2;
   }

   public void setDimensions(int var1, int var2, int var3, int var4) {
      this.x = var1;
      this.y = var2;
      this.x2 = var3;
      this.y2 = var4;
   }

   public int getFurthestX() {
      return this.x + this.width + this.x2;
   }

   public int getFurthestY() {
      return this.y + this.height + this.y2;
   }

   public abstract void method2142(int var1, int var2, Class1024 var3, int var4, int var5);

   abstract void method2144(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public void method2147(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(this.renderer.method6820()) {
         throw new IllegalStateException();
      } else {
         if(this.anIntArray_10917 == null) {
            this.anIntArray_10917 = new int[4];
         }

         this.renderer.method1913(this.anIntArray_10917);
         this.renderer.method1911(this.renderer.targetX * -346770183, this.renderer.targetWidth * 759884099, var1 + var3, var2 + var4);
         int var8 = this.getFurthestX();
         int var9 = this.getFurthestY();
         int var10 = (var3 + var8 - 1) / var8;
         int var11 = (var4 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var12 * var9;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.drawAt(var1 + var14 * var8, var2 + var13, var5, var6, var7);
            }
         }

         this.renderer.method1965(this.anIntArray_10917[0], this.anIntArray_10917[1], this.anIntArray_10917[2], this.anIntArray_10917[3]);
      }
   }

   void method2146(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(this.renderer.method6820()) {
         throw new IllegalStateException();
      } else if(this.method7539(var1, var2, var3, var4, var5, var6)) {
         anInt_10937 = var8;
         if(var7 != 1) {
            anInt_10938 = var8 >>> 24;
            anInt_10939 = 256 - anInt_10938;
            if(var7 == 0) {
               anInt_10932 = (var8 & 16711680) >> 16;
               anInt_10941 = (var8 & '\uff00') >> 8;
               anInt_10942 = var8 & 255;
            } else if(var7 == 2) {
               anInt_10945 = var8 >>> 24;
               anInt_10916 = 256 - anInt_10945;
               int var11 = (var8 & 16711935) * anInt_10916 & -16711936;
               int var12 = (var8 & '\uff00') * anInt_10916 & 16711680;
               anInt_10943 = (var11 | var12) >>> 8;
            }
         }

         this.method7549(var7, var9);
      }
   }

   abstract void method7549(int var1, int var2);

   void method2139(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class1024 var8, int var9, int var10) {
      if(this.renderer.method6820()) {
         throw new IllegalStateException();
      } else if(this.method7539(var1, var2, var3, var4, var5, var6)) {
         Class1024_Sub3 var11 = (Class1024_Sub3)var8;
         this.method7551(var11.anIntArray_10982, var11.anIntArray_10981, anInt_10944 - var9, -var10 - (anInt_10926 - anInt_10923));
      }
   }

   abstract void method7551(int[] var1, int[] var2, int var3, int var4);

   SoftwareSprite(SoftwareRenderer var1, int var2, int var3) {
      this.renderer = var1;
      this.width = var2;
      this.height = var3;
   }

   public int getWidth() {
      return this.width;
   }

   public abstract void drawAt(int var1, int var2, int var3, int var4, int var5);

   abstract void method7554(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13);
}
