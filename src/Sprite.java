
public abstract class Sprite implements TextObjects {

   public abstract void exportDimensions(int[] var1);

   public abstract int getFurthestX();

   public abstract int getHeight();

   public abstract int getFurthestY();

   public abstract Class101 method2126();

   public abstract void method2127(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method2128(int var1, int var2, int var3);

   public abstract void drawAt(int var1, int var2, int var3, int var4, int var5);

   public final void method2130(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method2144(var1, var2, var3, var4, var5, var6, var7, 1);
   }

   public final void method2131(int var1, int var2, int var3, int var4) {
      this.method2147(var1, var2, var3, var4, 1, -1, 1);
   }

   public final void method2132(float var1, float var2, int var3, int var4, Class1024 var5, int var6, int var7) {
      this.method2135(var1, var2, (float)this.getFurthestX() / 2.0F, (float)this.getFurthestY() / 2.0F, var3, var4, var5, var6, var7);
   }

   public final void rotateDraw(float originX, float originY, int var3, int var4) {
      this.method2140(originX, originY, (float)this.getFurthestX() / 2.0F, (float)this.getFurthestY() / 2.0F, var3, var4, 1, -1, 1);
   }

   public final void drawWithOutline(float var1, float var2, int var3, int var4, int var5, int var6, int var7) {
      this.method2140(var1, var2, (float)this.getFurthestX() / 2.0F, (float)this.getFurthestY() / 2.0F, var3, var4, var5, var6, var7);
   }

   public final void method2135(float var1, float var2, float var3, float var4, int var5, int var6, Class1024 var7, int var8, int var9) {
      if(var5 != 0) {
         double var10 = (double)(var6 & '\uffff') * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)var5;
         float var13 = (float)Math.cos(var10) * (float)var5;
         float var14 = (-var3 * var13 + -var4 * var12) / 4096.0F + var1;
         float var15 = (-(-var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var16 = (((float)this.getFurthestX() - var3) * var13 + -var4 * var12) / 4096.0F + var1;
         float var17 = (-((float)this.getFurthestX() - var3) * var12 + -var4 * var13) / 4096.0F + var2;
         float var18 = (-var3 * var13 + ((float)this.getFurthestY() - var4) * var12) / 4096.0F + var1;
         float var19 = (-(-var3) * var12 + ((float)this.getFurthestY() - var4) * var13) / 4096.0F + var2;
         this.method2138(var14, var15, var16, var17, var18, var19, var7, var8, var9);
      }
   }

   public abstract int getWidth();

   public abstract void setDimensions(int var1, int var2, int var3, int var4);

   final void method2138(float var1, float var2, float var3, float var4, float var5, float var6, Class1024 var7, int var8, int var9) {
      this.method2139(var1, var2, var3, var4, var5, var6, 1, var7, var8, var9);
   }

   abstract void method2139(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class1024 var8, int var9, int var10);

   public final void method2140(float originX, float originY, float midX, float midY, int radius, int var6, int var7, int var8, int var9) {
      if(radius != 0) {
         double var10 = (double)(var6 & '\uffff') * 9.587379924285257E-5D;
         float sinX = (float)Math.sin(var10) * (float)radius;
         float cosY = (float)Math.cos(var10) * (float)radius;
         float var14 = (-midX * cosY + -midY * sinX) / 4096.0F + originX;
         float var15 = (-(-midX) * sinX + -midY * cosY) / 4096.0F + originY;
         float var16 = (((float)this.getFurthestX() - midX) * cosY + -midY * sinX) / 4096.0F + originX;
         float var17 = (-((float)this.getFurthestX() - midX) * sinX + -midY * cosY) / 4096.0F + originY;
         float var18 = (-midX * cosY + ((float)this.getFurthestY() - midY) * sinX) / 4096.0F + originX;
         float var19 = (-(-midX) * sinX + ((float)this.getFurthestY() - midY) * cosY) / 4096.0F + originY;
         this.method2143(var14, var15, var16, var17, var18, var19, var7, var8, var9);
      }
   }

   public final void drawAt(int var1, int var2) {
      this.drawAt(var1, var2, 1, -1, 1);
   }

   public abstract void method2142(int var1, int var2, Class1024 var3, int var4, int var5);

   public final void method2143(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9) {
      this.method2146(var1, var2, var3, var4, var5, var6, var7, var8, var9, 1);
   }

   abstract void method2144(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public final void method2145(int var1, int var2, int var3, int var4) {
      this.method2144(var1, var2, var3, var4, 1, -1, 1, 1);
   }

   abstract void method2146(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

   public abstract void method2147(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public final void method2148(float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var5 != 0 && var6 != 0) {
         double var11 = (double)(var7 & '\uffff') * 9.587379924285257E-5D;
         float var13 = (float)Math.sin(var11) * (float)var6;
         float var14 = (float)Math.cos(var11) * (float)var6;
         float var15 = (float)Math.sin(var11) * (float)var5;
         float var16 = (float)Math.cos(var11) * (float)var5;
         float var17 = (-var3 * var16 + -var4 * var13) / 4096.0F + var1;
         float var18 = (-(-var3) * var15 + -var4 * var14) / 4096.0F + var2;
         float var19 = (((float)this.getFurthestX() - var3) * var16 + -var4 * var13) / 4096.0F + var1;
         float var20 = (-((float)this.getFurthestX() - var3) * var15 + -var4 * var14) / 4096.0F + var2;
         float var21 = (-var3 * var16 + ((float)this.getFurthestY() - var4) * var13) / 4096.0F + var1;
         float var22 = (-(-var3) * var15 + ((float)this.getFurthestY() - var4) * var14) / 4096.0F + var2;
         this.method2143(var17, var18, var19, var20, var21, var22, var8, var9, var10);
      }
   }

}
