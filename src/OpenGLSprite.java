import jaggl.OpenGL;

public class OpenGLSprite extends Sprite {

   int x = 0;
   final OpenGLRenderer aRenderer_Sub2_10887;
   OGLTexture_Sub3_Sub1 anOGLTexture_Sub3_Sub1_10888;
   int anInt_10889 = 0;
   int height = 0;
   int y = 0;
   int width = 0;
   final OGLTexture_Sub3_Sub1 anOGLTexture;
   boolean aBoolean_10894 = false;


   public int getWidth() {
      return this.anOGLTexture.textureWidth;
   }

   public int getFurthestX() {
      return this.anOGLTexture.textureWidth + this.x + this.width;
   }

   public int getFurthestY() {
      return this.anOGLTexture.textureHeight + this.y + this.height;
   }

   public Class101 method2126() {
      return this.anOGLTexture.method5446(0);
   }

   public void method2127(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.aRenderer_Sub2_10887.isMac) {
         int[] var7 = this.aRenderer_Sub2_10887.method1906(var5, var6, var3, var4);
         if(var7 != null) {
            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] |= -16777216;
            }

            this.method7508(var1, var2, var3, var4, var7, 0, var3);
         }
      } else {
         this.anOGLTexture.method5444(var1, var2, var3, var4, var5, var6);
      }

   }

   OpenGLSprite(OpenGLRenderer var1, int var2, int var3, boolean var4) {
      this.aRenderer_Sub2_10887 = var1;
      this.anOGLTexture = OGLTexture_Sub3_Sub1.method1216(var1, var4?Class136.aClass136_2625:Class136.aClass136_2627, Class87.aClass87_1759, var2, var3);
   }

   void method7504(int var1) {
      this.aRenderer_Sub2_10887.setTexture(1);
      this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture);
      this.aRenderer_Sub2_10887.setTexEnv(this.aRenderer_Sub2_10887.method7018(var1), 7681);
      this.aRenderer_Sub2_10887.method7020(1, '\u8577', 768);
      this.aRenderer_Sub2_10887.method7055(0, '\u8578', 770);
      this.aRenderer_Sub2_10887.setTexture(0);
      this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture_Sub3_Sub1_10888);
      this.aRenderer_Sub2_10887.setTexEnv('\u86af', 7681);
      this.aRenderer_Sub2_10887.method7020(1, '\u8576', 768);
      if(this.anInt_10889 == 0) {
         this.aRenderer_Sub2_10887.method7023(1.0F, 0.5F, 0.5F, 0.0F);
      } else if(this.anInt_10889 == 1) {
         this.aRenderer_Sub2_10887.method7023(0.5F, 1.0F, 0.5F, 0.0F);
      } else if(this.anInt_10889 == 2) {
         this.aRenderer_Sub2_10887.method7023(0.5F, 0.5F, 1.0F, 0.0F);
      } else if(this.anInt_10889 == 3) {
         this.aRenderer_Sub2_10887.method7023(128.5F, 128.5F, 128.5F, 0.0F);
      }

   }

   public void drawAt(int x, int y, int texMode, int colour, int var5) {
      this.anOGLTexture.method1852(false);
      this.aRenderer_Sub2_10887.method7067();
      this.aRenderer_Sub2_10887.setBlendFunc(var5);
      OpenGL.glColor4ub((byte)(colour >> 16), (byte)(colour >> 8), (byte)colour, (byte)(colour >> 24));
      x += this.x;
      y += this.y;
      if(this.anOGLTexture_Sub3_Sub1_10888 == null) {
         this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture);
         this.aRenderer_Sub2_10887.setTextureEnv(texMode);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
         OpenGL.glVertex2i(x, y);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(x, y + this.anOGLTexture.textureHeight);
         OpenGL.glTexCoord2f(this.anOGLTexture.textureX, 0.0F);
         OpenGL.glVertex2i(x + this.anOGLTexture.textureWidth, y + this.anOGLTexture.textureHeight);
         OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
         OpenGL.glVertex2i(x + this.anOGLTexture.textureWidth, y);
         OpenGL.glEnd();
      } else {
         this.method7504(texMode);
         this.anOGLTexture_Sub3_Sub1_10888.method1852(false);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.anOGLTexture.textureY);
         OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
         OpenGL.glVertex2i(x, y);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(x, y + this.anOGLTexture.textureHeight);
         OpenGL.glMultiTexCoord2f('\u84c1', this.anOGLTexture.textureX, 0.0F);
         OpenGL.glTexCoord2f(this.anOGLTexture.textureX, 0.0F);
         OpenGL.glVertex2i(x + this.anOGLTexture.textureWidth, y + this.anOGLTexture.textureHeight);
         OpenGL.glMultiTexCoord2f('\u84c1', this.anOGLTexture.textureX, this.anOGLTexture.textureY);
         OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
         OpenGL.glVertex2i(x + this.anOGLTexture.textureWidth, y);
         OpenGL.glEnd();
         this.method7515();
      }

   }

   void method2139(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class1024 var8, int var9, int var10) {
      OGLTexture_Sub3_Sub1 var11 = ((Class1024_Sub1)var8).anOGLTexture_Sub3_Sub1_10747;
      float var12;
      float var13;
      float var14;
      float var15;
      if(this.aBoolean_10894) {
         var12 = (float)this.getFurthestX();
         var13 = (float)this.getFurthestY();
         var14 = (var3 - var1) / var12;
         var15 = (var4 - var2) / var12;
         float var16 = (var5 - var1) / var13;
         float var17 = (var6 - var2) / var13;
         float var18 = var16 * (float)this.y;
         float var19 = var17 * (float)this.y;
         float var20 = var14 * (float)this.x;
         float var21 = var15 * (float)this.x;
         float var22 = -var14 * (float)this.width;
         float var23 = -var15 * (float)this.width;
         float var24 = -var16 * (float)this.height;
         float var25 = -var17 * (float)this.height;
         var1 = var1 + var20 + var18;
         var2 = var2 + var21 + var19;
         var3 = var3 + var22 + var18;
         var4 = var4 + var23 + var19;
         var5 = var5 + var20 + var24;
         var6 = var6 + var21 + var25;
      }

      var12 = var5 + (var3 - var1);
      var13 = var4 + (var6 - var2);
      this.anOGLTexture.method1852((var7 & 1) != 0);
      this.aRenderer_Sub2_10887.method7067();
      this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture);
      this.aRenderer_Sub2_10887.setTextureEnv(1);
      this.aRenderer_Sub2_10887.setTexture(1);
      this.aRenderer_Sub2_10887.setTextureRenderer(var11);
      this.aRenderer_Sub2_10887.setTexEnv(7681, 8448);
      this.aRenderer_Sub2_10887.method7020(0, '\u8578', 768);
      this.aRenderer_Sub2_10887.setBlendFunc(1);
      var14 = var11.textureX / (float)var11.textureWidth;
      var15 = var11.textureY / (float)var11.textureHeight;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, this.anOGLTexture.textureY);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var1 - (float)var9), var11.textureY - var15 * (var2 - (float)var10));
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var5 - (float)var9), var11.textureY - var15 * (var6 - (float)var10));
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glMultiTexCoord2f('\u84c0', this.anOGLTexture.textureX, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var12 - (float)var9), var11.textureY - var15 * (var13 - (float)var10));
      OpenGL.glVertex2f(var12, var13);
      OpenGL.glMultiTexCoord2f('\u84c0', this.anOGLTexture.textureX, this.anOGLTexture.textureY);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var3 - (float)var9), var11.textureY - var15 * (var4 - (float)var10));
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
      this.aRenderer_Sub2_10887.method7020(0, 5890, 768);
      this.aRenderer_Sub2_10887.setTextureEnv(0);
      this.aRenderer_Sub2_10887.setTextureRenderer((OGLTexture)null);
      this.aRenderer_Sub2_10887.setTexture(0);
   }

   public void method2142(int var1, int var2, Class1024 var3, int var4, int var5) {
      Class1024_Sub1 var6 = (Class1024_Sub1)var3;
      OGLTexture_Sub3_Sub1 var7 = var6.anOGLTexture_Sub3_Sub1_10747;
      this.anOGLTexture.method1852(false);
      this.aRenderer_Sub2_10887.method7067();
      this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture);
      this.aRenderer_Sub2_10887.setTextureEnv(1);
      this.aRenderer_Sub2_10887.setTexture(1);
      this.aRenderer_Sub2_10887.setTextureRenderer(var7);
      this.aRenderer_Sub2_10887.setTexEnv(7681, 8448);
      this.aRenderer_Sub2_10887.method7020(0, '\u8578', 768);
      this.aRenderer_Sub2_10887.setBlendFunc(1);
      var1 += this.x;
      var2 += this.y;
      int var8 = var1 + this.anOGLTexture.textureWidth;
      int var9 = var2 + this.anOGLTexture.textureHeight;
      float var10 = var7.textureX / (float)var7.textureWidth;
      float var11 = var7.textureY / (float)var7.textureHeight;
      float var12 = (float)(var1 - var4) * var10;
      float var13 = (float)(var8 - var4) * var10;
      float var14 = var7.textureY - (float)(var2 - var5) * var11;
      float var15 = var7.textureY - (float)(var9 - var5) * var11;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, this.anOGLTexture.textureY);
      OpenGL.glMultiTexCoord2f('\u84c1', var12, var14);
      OpenGL.glVertex2i(var1, var2);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var12, var15);
      OpenGL.glVertex2i(var1, var2 + this.anOGLTexture.textureHeight);
      OpenGL.glMultiTexCoord2f('\u84c0', this.anOGLTexture.textureX, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var13, var15);
      OpenGL.glVertex2i(var1 + this.anOGLTexture.textureWidth, var2 + this.anOGLTexture.textureHeight);
      OpenGL.glMultiTexCoord2f('\u84c0', this.anOGLTexture.textureX, this.anOGLTexture.textureY);
      OpenGL.glMultiTexCoord2f('\u84c1', var13, var14);
      OpenGL.glVertex2i(var1 + this.anOGLTexture.textureWidth, var2);
      OpenGL.glEnd();
      this.aRenderer_Sub2_10887.method7020(0, 5890, 768);
      this.aRenderer_Sub2_10887.setTextureEnv(0);
      this.aRenderer_Sub2_10887.setTextureRenderer((OGLTexture)null);
      this.aRenderer_Sub2_10887.setTexture(0);
   }

   void method7508(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.anOGLTexture.method5447(var1, var2, var3, var4, var5, var6, var7, true);
   }

   void method2144(int offsetX, int offsetY, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.anOGLTexture.method1852((var8 & 1) != 0);
      this.aRenderer_Sub2_10887.method7067();
      this.aRenderer_Sub2_10887.setBlendFunc(var7);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aBoolean_10894) {
         float var9 = (float)var3 / (float)this.getFurthestX();
         float var10 = (float)var4 / (float)this.getFurthestY();
         float var11 = (float)offsetX + (float)this.x * var9;
         float var12 = (float)offsetY + (float)this.y * var10;
         float var13 = var11 + (float)this.anOGLTexture.textureWidth * var9;
         float var14 = var12 + (float)this.anOGLTexture.textureHeight * var10;
         if(this.anOGLTexture_Sub3_Sub1_10888 == null) {
            this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture);
            this.aRenderer_Sub2_10887.setTextureEnv(var5);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glTexCoord2f(this.anOGLTexture.textureX, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
         } else {
            this.method7504(var5);
            this.anOGLTexture_Sub3_Sub1_10888.method1852(true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.anOGLTexture.textureY);
            OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.anOGLTexture.textureX, 0.0F);
            OpenGL.glTexCoord2f(this.anOGLTexture.textureX, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.anOGLTexture.textureX, this.anOGLTexture.textureY);
            OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
            this.method7515();
         }
      } else if(this.anOGLTexture_Sub3_Sub1_10888 == null) {
         this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture);
         this.aRenderer_Sub2_10887.setTextureEnv(var5);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
         OpenGL.glVertex2i(offsetX, offsetY);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(offsetX, offsetY + var4);
         OpenGL.glTexCoord2f(this.anOGLTexture.textureX, 0.0F);
         OpenGL.glVertex2i(offsetX + var3, offsetY + var4);
         OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
         OpenGL.glVertex2i(offsetX + var3, offsetY);
         OpenGL.glEnd();
      } else {
         this.method7504(var5);
         this.anOGLTexture_Sub3_Sub1_10888.method1852(true);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.anOGLTexture.textureY);
         OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
         OpenGL.glVertex2i(offsetX, offsetY);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(offsetX, offsetY + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.anOGLTexture.textureX, 0.0F);
         OpenGL.glTexCoord2f(this.anOGLTexture.textureX, 0.0F);
         OpenGL.glVertex2i(offsetX + var3, offsetY + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.anOGLTexture.textureX, this.anOGLTexture.textureY);
         OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
         OpenGL.glVertex2i(offsetX + var3, offsetY);
         OpenGL.glEnd();
         this.method7515();
      }

   }

   public void method2128(int var1, int var2, int var3) {
      OpenGL.glPixelTransferf(3348, 0.5F);
      OpenGL.glPixelTransferf(3349, 0.499F);
      OpenGL.glPixelTransferf(3352, 0.5F);
      OpenGL.glPixelTransferf(3353, 0.499F);
      OpenGL.glPixelTransferf(3354, 0.5F);
      OpenGL.glPixelTransferf(3355, 0.499F);
      this.anOGLTexture_Sub3_Sub1_10888 = OGLTexture_Sub3_Sub1.getOpenGLTexture(this.aRenderer_Sub2_10887, var1, var2, this.anOGLTexture.textureWidth, this.anOGLTexture.textureHeight);
      this.anInt_10889 = var3;
      OpenGL.glPixelTransferf(3348, 1.0F);
      OpenGL.glPixelTransferf(3349, 0.0F);
      OpenGL.glPixelTransferf(3352, 1.0F);
      OpenGL.glPixelTransferf(3353, 0.0F);
      OpenGL.glPixelTransferf(3354, 1.0F);
      OpenGL.glPixelTransferf(3355, 0.0F);
   }

   void method2146(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int colour, int var9, int var10) {
      float var11;
      float var12;
      if(this.aBoolean_10894) {
         var11 = (float)this.getFurthestX();
         var12 = (float)this.getFurthestY();
         float var13 = (var3 - var1) / var11;
         float var14 = (var4 - var2) / var11;
         float var15 = (var5 - var1) / var12;
         float var16 = (var6 - var2) / var12;
         float var17 = var15 * (float)this.y;
         float var18 = var16 * (float)this.y;
         float var19 = var13 * (float)this.x;
         float var20 = var14 * (float)this.x;
         float var21 = -var13 * (float)this.width;
         float var22 = -var14 * (float)this.width;
         float var23 = -var15 * (float)this.height;
         float var24 = -var16 * (float)this.height;
         var1 = var1 + var19 + var17;
         var2 = var2 + var20 + var18;
         var3 = var3 + var21 + var17;
         var4 = var4 + var22 + var18;
         var5 = var5 + var19 + var23;
         var6 = var6 + var20 + var24;
      }

      var11 = var5 + (var3 - var1);
      var12 = var4 + (var6 - var2);
      this.anOGLTexture.method1852((var10 & 1) != 0);
      this.aRenderer_Sub2_10887.method7067();
      this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture);
      this.aRenderer_Sub2_10887.setBlendFunc(var9);
      this.aRenderer_Sub2_10887.setTextureEnv(var7);
      OpenGL.glColor4ub((byte)(colour >> 16), (byte)(colour >> 8), (byte)colour, (byte)(colour >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glTexCoord2f(this.anOGLTexture.textureX, 0.0F);
      OpenGL.glVertex2f(var11, var12);
      OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
   }

   public int getHeight() {
      return this.anOGLTexture.textureHeight;
   }

   OpenGLSprite(OpenGLRenderer var1, int var2, int var3, int[] var4, int var5, int var6) {
      this.aRenderer_Sub2_10887 = var1;
      this.anOGLTexture = OGLTexture_Sub3_Sub1.getOGLTexture(var1, var2, var3, false, var4, var6, var5);
   }

   public void method2147(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 + var3;
      int var9 = var2 + var4;
      this.anOGLTexture.method1852(false);
      this.aRenderer_Sub2_10887.method7067();
      this.aRenderer_Sub2_10887.setTextureRenderer(this.anOGLTexture);
      this.aRenderer_Sub2_10887.setBlendFunc(var7);
      this.aRenderer_Sub2_10887.setTextureEnv(var5);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.anOGLTexture.aBoolean_1842 && !this.aBoolean_10894) {
         float var19 = this.anOGLTexture.textureY * (float)var4 / (float)this.anOGLTexture.textureHeight;
         float var18 = this.anOGLTexture.textureX * (float)var3 / (float)this.anOGLTexture.textureWidth;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, var19);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var9);
         OpenGL.glTexCoord2f(var18, 0.0F);
         OpenGL.glVertex2i(var8, var9);
         OpenGL.glTexCoord2f(var18, var19);
         OpenGL.glVertex2i(var8, var2);
         OpenGL.glEnd();
      } else {
         OpenGL.glPushMatrix();
         OpenGL.glTranslatef((float)this.x, (float)this.y, 0.0F);
         int var10 = this.getFurthestX();
         int var11 = this.getFurthestY();
         int var12 = var2 + this.anOGLTexture.textureHeight;
         OpenGL.glBegin(7);

         int var13;
         int var14;
         for(var13 = var2; var12 <= var9; var12 += var11) {
            var14 = var1 + this.anOGLTexture.textureWidth;

            int var15;
            for(var15 = var1; var14 <= var8; var15 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(this.anOGLTexture.textureX, 0.0F);
               OpenGL.glVertex2i(var14, var12);
               OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
               OpenGL.glVertex2i(var14, var13);
               var14 += var10;
            }

            if(var15 < var8) {
               float var16 = this.anOGLTexture.textureX * (float)(var8 - var15) / (float)this.anOGLTexture.textureWidth;
               OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(var16, 0.0F);
               OpenGL.glVertex2i(var8, var12);
               OpenGL.glTexCoord2f(var16, this.anOGLTexture.textureY);
               OpenGL.glVertex2i(var8, var13);
            }

            var13 += var11;
         }

         if(var13 < var9) {
            float var21 = this.anOGLTexture.textureY * (float)(this.anOGLTexture.textureHeight - (var9 - var13)) / (float)this.anOGLTexture.textureHeight;
            int var20 = var1 + this.anOGLTexture.textureWidth;

            for(var14 = var1; var20 <= var8; var14 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var21);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(this.anOGLTexture.textureX, var21);
               OpenGL.glVertex2i(var20, var9);
               OpenGL.glTexCoord2f(this.anOGLTexture.textureX, this.anOGLTexture.textureY);
               OpenGL.glVertex2i(var20, var13);
               var20 += var10;
            }

            if(var14 < var8) {
               float var17 = this.anOGLTexture.textureX * (float)(var8 - var14) / (float)this.anOGLTexture.textureWidth;
               OpenGL.glTexCoord2f(0.0F, this.anOGLTexture.textureY);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var21);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(var17, var21);
               OpenGL.glVertex2i(var8, var9);
               OpenGL.glTexCoord2f(var17, this.anOGLTexture.textureY);
               OpenGL.glVertex2i(var8, var13);
            }
         }

         OpenGL.glEnd();
         OpenGL.glPopMatrix();
      }

   }

   public void exportDimensions(int[] var1) {
      var1[0] = this.x;
      var1[1] = this.y;
      var1[2] = this.width;
      var1[3] = this.height;
   }

   OpenGLSprite(OpenGLRenderer var1, int var2, int var3, int var4, int var5) {
      this.aRenderer_Sub2_10887 = var1;
      this.anOGLTexture = OGLTexture_Sub3_Sub1.getOpenGLTexture(var1, var2, var3, var4, var5);
   }

   void method7515() {
      this.aRenderer_Sub2_10887.setTexture(1);
      this.aRenderer_Sub2_10887.setTextureRenderer((OGLTexture)null);
      this.aRenderer_Sub2_10887.setTexEnv(8448, 8448);
      this.aRenderer_Sub2_10887.method7020(1, '\u8578', 768);
      this.aRenderer_Sub2_10887.method7055(0, 5890, 770);
      this.aRenderer_Sub2_10887.setTexture(0);
      this.aRenderer_Sub2_10887.method7020(1, '\u8578', 768);
   }

   public void setDimensions(int var1, int var2, int var3, int var4) {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
      this.aBoolean_10894 = this.x != 0 || this.y != 0 || this.width != 0 || this.height != 0;
   }
}
