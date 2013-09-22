
public abstract class Class563_Sub1 extends Class563 {

   Class563_Sub1 aClass563_Sub1_6937;
   public Class92[] aClass92Array_6938;
   public byte plane;
   public WorldObjects worldObjects;
   int zIndex;
   public byte aByte_6942;


   abstract Class268 method4719(Renderer var1, int var2);

   abstract void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7);

   abstract boolean method4721(int var1);

   abstract boolean method4722(byte var1);

   abstract void method4723(int var1);

   abstract void method4724(Renderer var1);

   abstract int method4725(Class240_Sub53[] var1, int var2);

   abstract boolean method4726(int var1);

   void method4727(int var1, int var2) {
      this.aClass92Array_6938 = new Class92[var1];

      for(int var3 = 0; var3 < this.aClass92Array_6938.length; ++var3) {
         this.aClass92Array_6938[var3] = new Class92();
      }

   }

   public int getHeight() {
      return -this.method4732(-1743583966);
   }

   abstract boolean method4729(Renderer var1, int var2, int var3, byte var4);

   int method4730(int var1) {
      return 0;
   }

   abstract boolean method4731(int var1);

   public abstract int method4732(int var1);

   int method4733(int var1, int var2, Class240_Sub53[] var3, byte var4) {
      long var5 = this.worldObjects.aLongArrayArrayArray_4471[this.plane][var1][var2];
      long var7 = 0L;

      int var9;
      int var10;
      for(var9 = 0; var7 <= 48L; var7 += 16L) {
         var10 = (int)(var5 >> (int)var7 & 65535L);
         if(var10 <= 0) {
            break;
         }

         var3[var9++] = this.worldObjects.aClass265Array_4526[var10 - 1].aClass240_Sub53_4635;
      }

      for(var10 = var9; var10 < 4; ++var10) {
         var3[var10] = null;
      }

      return var9;
   }

   abstract boolean method4734(Renderer var1, int var2);

   Class563_Sub1(WorldObjects var1) {
      this.worldObjects = var1;
   }

   public abstract Class256 method4735(Renderer var1, int var2);
}
