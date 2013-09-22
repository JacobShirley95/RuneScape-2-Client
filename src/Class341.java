
public class Class341 {

   Class365[] aClass365Array_6536 = new Class365[1];
   float[] aFloatArray_6537 = new float[2];


   public GameCoord method4210(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.aClass365Array_6536.length; ++var4) {
         var3 += this.aClass365Array_6536[var4].method4658();
         if(var1 < var3) {
            float var5 = this.aClass365Array_6536[var4].method4661(var1 - var2);
            return this.aClass365Array_6536[var4].method4657(var5);
         }

         var2 = var3;
      }

      return this.aClass365Array_6536[this.aClass365Array_6536.length - 1].method4657(1.0F);
   }

   public GameCoord method4211(float var1) {
      int var2 = (int)var1;
      return var2 < this.aClass365Array_6536.length?this.aClass365Array_6536[var2].method4657(var1 - (float)var2):this.aClass365Array_6536[this.aClass365Array_6536.length - 1].method4657(1.0F);
   }

   float method4212(float var1) {
      int var2 = (int)var1;
      if(var2 + 1 < this.aFloatArray_6537.length) {
         float var3 = this.aFloatArray_6537[var2];
         float var4 = this.aFloatArray_6537[var2 + 1];
         float var5 = var1 - (float)var2;
         return (1.0F - var5) * var3 + var5 * var4;
      } else {
         return this.aFloatArray_6537[this.aFloatArray_6537.length - 1];
      }
   }

   public Class341(ByteArrayDataNode var1) {
      int var2 = var1.method4490((byte)0);
      this.aClass365Array_6536[0] = new Class365();
      this.aClass365Array_6536[0].method4655(0, GameCoord.method4309(var1));
      this.aClass365Array_6536[0].method4655(1, GameCoord.method4309(var1));
      this.aFloatArray_6537[0] = var1.method4494(-822261228);
      GameCoord var3 = GameCoord.method4309(var1);
      GameCoord var4 = GameCoord.method4309(var1);
      GameCoord var5 = GameCoord.distBetween(var3, var4);
      var4.store();
      var5.method4314(var3);
      this.aClass365Array_6536[0].method4655(3, var3);
      this.aClass365Array_6536[0].method4655(2, var5);
      this.aFloatArray_6537[1] = var1.method4494(-822261228);

      for(int var6 = 2; var6 < var2; ++var6) {
         GameCoord var7 = GameCoord.method4309(var1);
         GameCoord var8 = GameCoord.method4309(var1);
         GameCoord var9 = GameCoord.distBetween(var7, var8);
         var8.store();
         var9.method4314(var7);
         this.method4215(var7, var9, var1.method4494(-822261228));
      }

   }

   public float method4213(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.aClass365Array_6536.length; ++var4) {
         var3 += this.aClass365Array_6536[var4].method4658();
         if(var1 < var3) {
            return this.aClass365Array_6536[var4].method4661(var1 - var2) + (float)var4;
         }

         var2 = var3;
      }

      return (float)this.aClass365Array_6536.length;
   }

   public float method4214(float var1) {
      return this.method4212(this.method4213(var1));
   }

   void method4215(GameCoord var1, GameCoord var2, float var3) {
      Class365[] var4 = new Class365[this.aClass365Array_6536.length + 1];
      System.arraycopy(this.aClass365Array_6536, 0, var4, 0, this.aClass365Array_6536.length);
      Class365 var5 = new Class365();
      Class365 var6 = this.aClass365Array_6536[this.aClass365Array_6536.length - 1];
      var5.method4655(0, var6.method4656(3));
      GameCoord var7 = GameCoord.distBetween(var6.method4656(3), var6.method4656(2));
      var5.method4655(1, GameCoord.method4316(var6.method4656(3), var7));
      var5.method4655(3, var1);
      var5.method4655(2, var2);
      var4[var4.length - 1] = var5;
      this.aClass365Array_6536 = var4;
      float[] var8 = new float[this.aFloatArray_6537.length + 1];
      System.arraycopy(this.aFloatArray_6537, 0, var8, 0, this.aFloatArray_6537.length);
      var8[var8.length - 1] = var3;
      this.aFloatArray_6537 = var8;
   }

   public float method4216() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 < this.aClass365Array_6536.length; ++var2) {
         var1 += this.aClass365Array_6536[var2].method4658();
      }

      return var1;
   }
}
