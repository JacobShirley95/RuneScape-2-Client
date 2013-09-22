
public abstract class Class563_Sub1_Sub5 extends Class563_Sub1 {

   public static final int anInt_3321 = 1;
   public static final int anInt_3322 = 16;
   public short aShort_3323;
   public static final int anInt_3324 = 8;
   public static final int anInt_3325 = 32;
   public static final int anInt_3326 = 4;
   public static final int anInt_3327 = 64;
   public static final int anInt_3328 = 128;
   static final int[] anIntArray_3329 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   public static final int anInt_3330 = 2;
   int anInt_3331 = 0;
   Class240_Sub53[] aClass240_Sub53Array_3332 = new Class240_Sub53[4];


   int method4725(Class240_Sub53[] var1, int var2) {
      if(this.aBoolean_9591) {
         GameCoord var3 = this.method6203().gameCoord;
         int var4 = (int)var3.floatX >> this.worldObjects.shiftAmount * 725150473;
         int var5 = (int)var3.floatZ >> 725150473 * this.worldObjects.shiftAmount;
         int var6 = 0;
         if(this.worldObjects.anInt_4521 * -1947125211 == var4) {
            ++var6;
         } else if(this.worldObjects.anInt_4521 * -1947125211 < var4) {
            var6 += 2;
         }

         if(var5 == -2026113737 * this.worldObjects.anInt_4508) {
            var6 += 3;
         } else if(this.worldObjects.anInt_4508 * -2026113737 > var5) {
            var6 += 6;
         }

         int var7 = anIntArray_3329[var6];
         if(0 == (this.aShort_3323 & var7)) {
            if(1 == this.aShort_3323 && var4 > 0) {
               --var4;
            } else if(this.aShort_3323 == 4 && var4 <= this.worldObjects.anInt_4481 * 1346434785) {
               ++var4;
            } else if(this.aShort_3323 == 8 && var5 > 0) {
               --var5;
            } else if(this.aShort_3323 == 2 && var5 <= this.worldObjects.anInt_4479 * -1775771909) {
               ++var5;
            } else if(16 == this.aShort_3323 && var4 > 0 && var5 <= this.worldObjects.anInt_4479 * -1775771909) {
               --var4;
               ++var5;
            } else if(32 == this.aShort_3323 && var4 <= this.worldObjects.anInt_4481 * 1346434785 && var5 <= this.worldObjects.anInt_4479 * -1775771909) {
               ++var4;
               ++var5;
            } else if(128 == this.aShort_3323 && var4 > 0 && var5 > 0) {
               --var4;
               --var5;
            } else {
               if(64 != this.aShort_3323 || var4 > 1346434785 * this.worldObjects.anInt_4481 || var5 <= 0) {
                  throw new RuntimeException("");
               }

               ++var4;
               --var5;
            }
         }

         this.anInt_3331 = this.method4733(var4, var5, this.aClass240_Sub53Array_3332, (byte)0) * 1570766629;
         this.aBoolean_9591 = false;
      }

      for(int var8 = 0; var8 < this.anInt_3331 * 1544815789; ++var8) {
         var1[var8] = this.aClass240_Sub53Array_3332[var8];
      }

      return this.anInt_3331 * 1544815789;
   }

   boolean method4726(int var1) {
      GameCoord var2 = this.method6203().gameCoord;
      return this.worldObjects.aBooleanArrayArray_4531[-644084065 * this.worldObjects.anInt_4498 + (((int)var2.floatX >> this.worldObjects.shiftAmount * 725150473) - -1947125211 * this.worldObjects.anInt_4521)][-644084065 * this.worldObjects.anInt_4498 + (((int)var2.floatZ >> this.worldObjects.shiftAmount * 725150473) - this.worldObjects.anInt_4508 * -2026113737)];
   }

   boolean method4734(Renderer var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      return this.worldObjects.aClass269_4485.method3541(this, this.aByte_6942, (int)var3.floatX >> this.worldObjects.shiftAmount * 725150473, (int)var3.floatZ >> this.worldObjects.shiftAmount * 725150473);
   }

   Class563_Sub1_Sub5(WorldObjects var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1);
      this.plane = (byte)var5;
      this.aByte_6942 = (byte)var6;
      this.aShort_3323 = (short)var7;
      this.setPos(new GameCoord((float)var2, (float)var3, (float)var4));

      for(int var8 = 0; var8 < 4; ++var8) {
         this.aClass240_Sub53Array_3332[var8] = null;
      }

   }
}
