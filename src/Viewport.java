
public class Viewport {

   float aFloat_6834;
   float maxX;
   float aFloat_6836;
   float aFloat_6837;
   float aFloat_6838;
   float maxY;
   float aFloat_6840;
   float maxZ;
   float aFloat_6842;
   float offsetY;
   float offsetX;
   public static final Viewport aViewport_6845 = new Viewport();
   float offsetZ;


   public Viewport(Viewport var1) {
      this.setAs(var1);
   }

   public void setAs(Viewport var1) {
      this.maxX = var1.maxX;
      this.aFloat_6834 = var1.aFloat_6834;
      this.aFloat_6837 = var1.aFloat_6837;
      this.offsetX = var1.offsetX;
      this.aFloat_6838 = var1.aFloat_6838;
      this.maxY = var1.maxY;
      this.aFloat_6842 = var1.aFloat_6842;
      this.offsetY = var1.offsetY;
      this.aFloat_6836 = var1.aFloat_6836;
      this.aFloat_6840 = var1.aFloat_6840;
      this.maxZ = var1.maxZ;
      this.offsetZ = var1.offsetZ;
   }

   public void method4622(Class348 var1) {
      this.method4628(var1.aClass342_6586);
      this.setOffset(var1.gameCoord);
   }

   public void method4623(Class348 var1) {
      float var2 = var1.aClass342_6586.aFloat_6538 * var1.aClass342_6586.aFloat_6538;
      float var3 = var1.aClass342_6586.aFloat_6538 * var1.aClass342_6586.aFloat_6541;
      float var4 = var1.aClass342_6586.aFloat_6538 * var1.aClass342_6586.aFloat_6542;
      float var5 = var1.aClass342_6586.aFloat_6538 * var1.aClass342_6586.aFloat_6543;
      float var6 = var1.aClass342_6586.aFloat_6541 * var1.aClass342_6586.aFloat_6541;
      float var7 = var1.aClass342_6586.aFloat_6541 * var1.aClass342_6586.aFloat_6542;
      float var8 = var1.aClass342_6586.aFloat_6541 * var1.aClass342_6586.aFloat_6543;
      float var9 = var1.aClass342_6586.aFloat_6542 * var1.aClass342_6586.aFloat_6542;
      float var10 = var1.aClass342_6586.aFloat_6542 * var1.aClass342_6586.aFloat_6543;
      float var11 = var1.aClass342_6586.aFloat_6543 * var1.aClass342_6586.aFloat_6543;
      this.maxX = var6 + var2 - var11 - var9;
      this.aFloat_6838 = var7 + var5 + var7 + var5;
      this.aFloat_6836 = var8 - var4 - var4 + var8;
      this.aFloat_6834 = var7 - var5 - var5 + var7;
      this.maxY = var9 + var2 - var6 - var11;
      this.aFloat_6840 = var10 + var3 + var10 + var3;
      this.aFloat_6837 = var8 + var4 + var8 + var4;
      this.aFloat_6842 = var10 - var3 - var3 + var10;
      this.maxZ = var11 + var2 - var9 - var6;
      this.offsetX = var1.gameCoord.floatX;
      this.offsetY = var1.gameCoord.floatY;
      this.offsetZ = var1.gameCoord.floatZ;
   }

   public void method4624(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.maxX = var1;
      this.aFloat_6834 = var4;
      this.aFloat_6837 = var7;
      this.offsetX = 0.0F;
      this.aFloat_6838 = var2;
      this.maxY = var5;
      this.aFloat_6842 = var8;
      this.offsetY = 0.0F;
      this.aFloat_6836 = var3;
      this.aFloat_6840 = var6;
      this.maxZ = var9;
      this.offsetZ = 0.0F;
   }

   public void init() {
      this.offsetZ = 0.0F;
      this.offsetY = 0.0F;
      this.offsetX = 0.0F;
      this.aFloat_6842 = 0.0F;
      this.aFloat_6837 = 0.0F;
      this.aFloat_6840 = 0.0F;
      this.aFloat_6834 = 0.0F;
      this.aFloat_6836 = 0.0F;
      this.aFloat_6838 = 0.0F;
      this.maxZ = 1.0F;
      this.maxY = 1.0F;
      this.maxX = 1.0F;
   }

   public void method4626(float var1, float var2, float var3, float[] var4) {
      var1 -= this.offsetX;
      var2 -= this.offsetY;
      var3 -= this.offsetZ;
      var4[0] = (float)((int)(this.maxX * var1 + this.aFloat_6838 * var2 + this.aFloat_6836 * var3));
      var4[1] = (float)((int)(this.aFloat_6834 * var1 + this.maxY * var2 + this.aFloat_6840 * var3));
      var4[2] = (float)((int)(this.aFloat_6837 * var1 + this.aFloat_6842 * var2 + this.maxZ * var3));
   }

   public void rotate(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      this.maxX = var5 + var1 * var1 * (1.0F - var5);
      this.aFloat_6838 = var3 * var6 + var2 * var1 * (1.0F - var5);
      this.aFloat_6836 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      this.aFloat_6834 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      this.maxY = var5 + var2 * var2 * (1.0F - var5);
      this.aFloat_6840 = var1 * var6 + var3 * var2 * (1.0F - var5);
      this.aFloat_6837 = var2 * var6 + var1 * var3 * (1.0F - var5);
      this.aFloat_6842 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      this.maxZ = var5 + var3 * var3 * (1.0F - var5);
      this.offsetZ = 0.0F;
      this.offsetY = 0.0F;
      this.offsetX = 0.0F;
   }

   public void method4628(Class342 var1) {
      this.method4633(var1.aFloat_6541, var1.aFloat_6542, var1.aFloat_6543, var1.aFloat_6538);
   }

   public void setPos(float var1, float var2, float var3) {
      this.aFloat_6842 = 0.0F;
      this.aFloat_6837 = 0.0F;
      this.aFloat_6840 = 0.0F;
      this.aFloat_6834 = 0.0F;
      this.aFloat_6836 = 0.0F;
      this.aFloat_6838 = 0.0F;
      this.maxZ = 1.0F;
      this.maxY = 1.0F;
      this.maxX = 1.0F;
      this.offsetX = var1;
      this.offsetY = var2;
      this.offsetZ = var3;
   }

   public void method4630(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      float var7 = var5 + var1 * var1 * (1.0F - var5);
      float var8 = var3 * var6 + var2 * var1 * (1.0F - var5);
      float var9 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      float var10 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      float var11 = var5 + var2 * var2 * (1.0F - var5);
      float var12 = var1 * var6 + var3 * var2 * (1.0F - var5);
      float var13 = var2 * var6 + var1 * var3 * (1.0F - var5);
      float var14 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      float var15 = var5 + var3 * var3 * (1.0F - var5);
      float var16 = this.maxX;
      float var17 = this.aFloat_6838;
      float var18 = this.aFloat_6834;
      float var19 = this.maxY;
      float var20 = this.aFloat_6837;
      float var21 = this.aFloat_6842;
      float var22 = this.offsetX;
      float var23 = this.offsetY;
      this.maxX = var16 * var7 + var17 * var10 + this.aFloat_6836 * var13;
      this.aFloat_6838 = var16 * var8 + var17 * var11 + this.aFloat_6836 * var14;
      this.aFloat_6836 = var16 * var9 + var17 * var12 + this.aFloat_6836 * var15;
      this.aFloat_6834 = var18 * var7 + var19 * var10 + this.aFloat_6840 * var13;
      this.maxY = var18 * var8 + var19 * var11 + this.aFloat_6840 * var14;
      this.aFloat_6840 = var18 * var9 + var19 * var12 + this.aFloat_6840 * var15;
      this.aFloat_6837 = var20 * var7 + var21 * var10 + this.maxZ * var13;
      this.aFloat_6842 = var20 * var8 + var21 * var11 + this.maxZ * var14;
      this.maxZ = var20 * var9 + var21 * var12 + this.maxZ * var15;
      this.offsetX = var22 * var7 + var23 * var10 + this.offsetZ * var13;
      this.offsetY = var22 * var8 + var23 * var11 + this.offsetZ * var14;
      this.offsetZ = var22 * var9 + var23 * var12 + this.offsetZ * var15;
   }

   public void method4631(float var1, float var2, float var3) {
      this.maxX *= var1;
      this.aFloat_6834 *= var1;
      this.aFloat_6837 *= var1;
      this.offsetX *= var1;
      this.aFloat_6838 *= var2;
      this.maxY *= var2;
      this.aFloat_6842 *= var2;
      this.offsetY *= var2;
      this.aFloat_6836 *= var3;
      this.aFloat_6840 *= var3;
      this.maxZ *= var3;
      this.offsetZ *= var3;
   }

   public void method4632(int var1, int var2, int var3, float var4, float var5, float var6) {
      if(var1 != 0) {
         float var7 = Class360.aFloatArray_6795[var1 & 16383];
         float var8 = Class360.aFloatArray_6796[var1 & 16383];
         this.maxZ = 1.0F;
         this.aFloat_6842 = 0.0F;
         this.aFloat_6837 = 0.0F;
         this.aFloat_6840 = 0.0F;
         this.aFloat_6836 = 0.0F;
         this.maxX = 2.0F * var7 * (float)var2;
         this.maxY = 2.0F * var7 * (float)var3;
         this.aFloat_6838 = 2.0F * var8 * (float)var2;
         this.aFloat_6834 = -2.0F * var8 * (float)var3;
         this.offsetX = (float)(2 * var2) * (0.5F * var8 - 0.5F * var7) + var4;
         this.offsetY = (float)(2 * var3) * (-0.5F * var8 - 0.5F * var7) + var5;
         this.offsetZ = var6;
      } else {
         this.aFloat_6842 = 0.0F;
         this.aFloat_6837 = 0.0F;
         this.aFloat_6840 = 0.0F;
         this.aFloat_6834 = 0.0F;
         this.aFloat_6836 = 0.0F;
         this.aFloat_6838 = 0.0F;
         this.maxX = (float)(2 * var2);
         this.maxY = (float)(2 * var3);
         this.maxZ = 1.0F;
         this.offsetX = var4 - (float)var2;
         this.offsetY = var5 - (float)var3;
         this.offsetZ = var6;
      }

   }

   void method4633(float var1, float var2, float var3, float var4) {
      float var5 = var1 * var1;
      float var6 = var1 * var2;
      float var7 = var1 * var3;
      float var8 = var1 * var4;
      float var9 = var2 * var2;
      float var10 = var2 * var3;
      float var11 = var2 * var4;
      float var12 = var3 * var3;
      float var13 = var3 * var4;
      this.maxX = 1.0F - 2.0F * (var9 + var12);
      this.aFloat_6834 = 2.0F * (var6 - var13);
      this.aFloat_6837 = 2.0F * (var7 + var11);
      this.aFloat_6838 = 2.0F * (var6 + var13);
      this.maxY = 1.0F - 2.0F * (var5 + var12);
      this.aFloat_6842 = 2.0F * (var10 - var8);
      this.aFloat_6836 = 2.0F * (var7 - var11);
      this.aFloat_6840 = 2.0F * (var10 + var8);
      this.maxZ = 1.0F - 2.0F * (var5 + var9);
      this.offsetZ = 0.0F;
      this.offsetY = 0.0F;
      this.offsetX = 0.0F;
   }

   public void method4634(Viewport var1, Viewport var2) {
      this.maxX = var1.maxX * var2.maxX + var1.aFloat_6838 * var2.aFloat_6834 + var1.aFloat_6836 * var2.aFloat_6837;
      this.aFloat_6838 = var1.maxX * var2.aFloat_6838 + var1.aFloat_6838 * var2.maxY + var1.aFloat_6836 * var2.aFloat_6842;
      this.aFloat_6836 = var1.maxX * var2.aFloat_6836 + var1.aFloat_6838 * var2.aFloat_6840 + var1.aFloat_6836 * var2.maxZ;
      this.aFloat_6834 = var1.aFloat_6834 * var2.maxX + var1.maxY * var2.aFloat_6834 + var1.aFloat_6840 * var2.aFloat_6837;
      this.maxY = var1.aFloat_6834 * var2.aFloat_6838 + var1.maxY * var2.maxY + var1.aFloat_6840 * var2.aFloat_6842;
      this.aFloat_6840 = var1.aFloat_6834 * var2.aFloat_6836 + var1.maxY * var2.aFloat_6840 + var1.aFloat_6840 * var2.maxZ;
      this.aFloat_6837 = var1.aFloat_6837 * var2.maxX + var1.aFloat_6842 * var2.aFloat_6834 + var1.maxZ * var2.aFloat_6837;
      this.aFloat_6842 = var1.aFloat_6837 * var2.aFloat_6838 + var1.aFloat_6842 * var2.maxY + var1.maxZ * var2.aFloat_6842;
      this.maxZ = var1.aFloat_6837 * var2.aFloat_6836 + var1.aFloat_6842 * var2.aFloat_6840 + var1.maxZ * var2.maxZ;
      this.offsetX = var1.offsetX * var2.maxX + var1.offsetY * var2.aFloat_6834 + var1.offsetZ * var2.aFloat_6837 + var2.offsetX;
      this.offsetY = var1.offsetX * var2.aFloat_6838 + var1.offsetY * var2.maxY + var1.offsetZ * var2.aFloat_6842 + var2.offsetY;
      this.offsetZ = var1.offsetX * var2.aFloat_6836 + var1.offsetY * var2.aFloat_6840 + var1.offsetZ * var2.maxZ + var2.offsetZ;
   }

   public void method4635(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.maxX * var1 + this.aFloat_6834 * var2 + this.aFloat_6837 * var3 + this.offsetX;
      var4[1] = this.aFloat_6838 * var1 + this.maxY * var2 + this.aFloat_6842 * var3 + this.offsetY;
      var4[2] = this.aFloat_6836 * var1 + this.aFloat_6840 * var2 + this.maxZ * var3 + this.offsetZ;
   }

   public void method4636(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var4 - var1;
      float var11 = var5 - var2;
      float var12 = var6 - var3;
      float var13 = var8 * var12 - var9 * var11;
      float var14 = var9 * var10 - var7 * var12;
      float var15 = var7 * var11 - var8 * var10;
      float var16 = (float)(1.0D / Math.sqrt((double)(var13 * var13 + var14 * var14 + var15 * var15)));
      float var17 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + var12 * var12)));
      this.maxX = var13 * var16;
      this.aFloat_6834 = var14 * var16;
      this.aFloat_6837 = var15 * var16;
      this.aFloat_6836 = var10 * var17;
      this.aFloat_6840 = var11 * var17;
      this.maxZ = var12 * var17;
      this.aFloat_6838 = this.aFloat_6840 * this.aFloat_6837 - this.maxZ * this.aFloat_6834;
      this.maxY = this.maxZ * this.maxX - this.aFloat_6836 * this.aFloat_6837;
      this.aFloat_6842 = this.aFloat_6836 * this.aFloat_6834 - this.aFloat_6840 * this.maxX;
      this.offsetX = -(var1 * this.maxX + var2 * this.aFloat_6834 + var3 * this.aFloat_6837);
      this.offsetY = -(var1 * this.aFloat_6838 + var2 * this.maxY + var3 * this.aFloat_6842);
      this.offsetZ = -(var1 * this.aFloat_6836 + var2 * this.aFloat_6840 + var3 * this.maxZ);
   }

   public void method4637(float[] var1) {
      float var2 = var1[0] - this.offsetX;
      float var3 = var1[1] - this.offsetY;
      float var4 = var1[2] - this.offsetZ;
      var1[0] = (float)((int)(this.maxX * var2 + this.aFloat_6838 * var3 + this.aFloat_6836 * var4));
      var1[1] = (float)((int)(this.aFloat_6834 * var2 + this.maxY * var3 + this.aFloat_6840 * var4));
      var1[2] = (float)((int)(this.aFloat_6837 * var2 + this.aFloat_6842 * var3 + this.maxZ * var4));
   }

   public void method4638(float[] var1) {
      float var2 = var1[0];
      float var3 = var1[1];
      float var4 = var1[2];
      var1[0] = this.maxX * var2 + this.aFloat_6838 * var3 + this.aFloat_6836 * var4;
      var1[1] = this.aFloat_6834 * var2 + this.maxY * var3 + this.aFloat_6840 * var4;
      var1[2] = this.aFloat_6837 * var2 + this.aFloat_6842 * var3 + this.maxZ * var4;
   }

   public float[] method4639(float[] var1) {
      var1[0] = this.maxX;
      var1[1] = this.aFloat_6838;
      var1[2] = this.aFloat_6836;
      var1[3] = this.aFloat_6834;
      var1[4] = this.maxY;
      var1[5] = this.aFloat_6840;
      var1[6] = this.aFloat_6837;
      var1[7] = this.aFloat_6842;
      var1[8] = this.maxZ;
      return var1;
   }

   public String toString() {
      return this.maxX + "," + this.aFloat_6834 + "," + this.aFloat_6837 + "," + this.offsetX + " - " + this.aFloat_6838 + "," + this.maxY + "," + this.aFloat_6842 + "," + this.offsetY + " - " + this.aFloat_6836 + "," + this.aFloat_6840 + "," + this.maxZ + "," + this.offsetZ;
   }

   public void method4641(Viewport var1) {
      float var2 = this.maxX;
      float var3 = this.aFloat_6838;
      float var4 = this.aFloat_6834;
      float var5 = this.maxY;
      float var6 = this.aFloat_6837;
      float var7 = this.aFloat_6842;
      float var8 = this.offsetX;
      float var9 = this.offsetY;
      float var10 = this.aFloat_6836;
      float var11 = this.aFloat_6840;
      float var12 = this.maxZ;
      float var13 = this.offsetZ;
      this.maxX = var2 * var1.maxX + var3 * var1.aFloat_6834 + var10 * var1.aFloat_6837;
      this.aFloat_6838 = var2 * var1.aFloat_6838 + var3 * var1.maxY + var10 * var1.aFloat_6842;
      this.aFloat_6836 = var2 * var1.aFloat_6836 + var3 * var1.aFloat_6840 + var10 * var1.maxZ;
      this.aFloat_6834 = var4 * var1.maxX + var5 * var1.aFloat_6834 + var11 * var1.aFloat_6837;
      this.maxY = var4 * var1.aFloat_6838 + var5 * var1.maxY + var11 * var1.aFloat_6842;
      this.aFloat_6840 = var4 * var1.aFloat_6836 + var5 * var1.aFloat_6840 + var11 * var1.maxZ;
      this.aFloat_6837 = var6 * var1.maxX + var7 * var1.aFloat_6834 + var12 * var1.aFloat_6837;
      this.aFloat_6842 = var6 * var1.aFloat_6838 + var7 * var1.maxY + var12 * var1.aFloat_6842;
      this.maxZ = var6 * var1.aFloat_6836 + var7 * var1.aFloat_6840 + var12 * var1.maxZ;
      this.offsetX = var8 * var1.maxX + var9 * var1.aFloat_6834 + var13 * var1.aFloat_6837 + var1.offsetX;
      this.offsetY = var8 * var1.aFloat_6838 + var9 * var1.maxY + var13 * var1.aFloat_6842 + var1.offsetY;
      this.offsetZ = var8 * var1.aFloat_6836 + var9 * var1.aFloat_6840 + var13 * var1.maxZ + var1.offsetZ;
   }

   public void method4642() {
      float var1 = this.offsetX;
      float var2 = this.offsetY;
      float var3 = this.aFloat_6834;
      this.aFloat_6834 = this.aFloat_6838;
      this.aFloat_6838 = var3;
      float var4 = this.aFloat_6837;
      this.aFloat_6837 = this.aFloat_6836;
      this.aFloat_6836 = var4;
      float var5 = this.aFloat_6842;
      this.aFloat_6842 = this.aFloat_6840;
      this.aFloat_6840 = var5;
      this.offsetX = -(var1 * this.maxX + var2 * this.aFloat_6834 + this.offsetZ * this.aFloat_6837);
      this.offsetY = -(var1 * this.aFloat_6838 + var2 * this.maxY + this.offsetZ * this.aFloat_6842);
      this.offsetZ = -(var1 * this.aFloat_6836 + var2 * this.aFloat_6840 + this.offsetZ * this.maxZ);
   }

   public void method4643(Viewport var1) {
      if(var1 == this) {
         this.method4642();
      } else {
         this.maxX = var1.maxX;
         this.aFloat_6834 = var1.aFloat_6838;
         this.aFloat_6837 = var1.aFloat_6836;
         this.aFloat_6838 = var1.aFloat_6834;
         this.maxY = var1.maxY;
         this.aFloat_6842 = var1.aFloat_6840;
         this.aFloat_6836 = var1.aFloat_6837;
         this.aFloat_6840 = var1.aFloat_6842;
         this.maxZ = var1.maxZ;
         this.offsetX = -(var1.offsetX * this.maxX + var1.offsetY * this.aFloat_6834 + var1.offsetZ * this.aFloat_6837);
         this.offsetY = -(var1.offsetX * this.aFloat_6838 + var1.offsetY * this.maxY + var1.offsetZ * this.aFloat_6842);
         this.offsetZ = -(var1.offsetX * this.aFloat_6836 + var1.offsetY * this.aFloat_6840 + var1.offsetZ * this.maxZ);
      }

   }

   public float[] method4644(float[] var1) {
      var1[0] = this.offsetX;
      var1[1] = this.offsetY;
      var1[2] = this.offsetZ;
      return var1;
   }

   public void setOffset(GameCoord var1) {
      this.setOffset(var1.floatX, var1.floatY, var1.floatZ);
   }

   public void setOffset(float var1, float var2, float var3) {
      this.offsetX += var1;
      this.offsetY += var2;
      this.offsetZ += var3;
   }

   public Viewport() {
      this.init();
   }

   public void method4647(float var1, float var2, float var3) {
      this.maxX = var1;
      this.aFloat_6834 = 0.0F;
      this.aFloat_6837 = 0.0F;
      this.offsetX = 0.0F;
      this.aFloat_6838 = 0.0F;
      this.maxY = var2;
      this.aFloat_6842 = 0.0F;
      this.offsetY = 0.0F;
      this.aFloat_6836 = 0.0F;
      this.aFloat_6840 = 0.0F;
      this.maxZ = var3;
      this.offsetZ = 0.0F;
   }
}
