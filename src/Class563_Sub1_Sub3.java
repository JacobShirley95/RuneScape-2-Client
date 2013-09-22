
public abstract class Class563_Sub1_Sub3 extends Class563_Sub1 {

   protected short aShort_3265;
   protected short aShort_3266;
   int anInt_3267 = 0;
   Class240_Sub53[] aClass240_Sub53Array_3268 = new Class240_Sub53[4];


   boolean method4726(int var1) {
      GameCoord var2 = this.method6203().gameCoord;
      return this.worldObjects.aBooleanArrayArray_4531[-644084065 * this.worldObjects.anInt_4498 + (((int)var2.floatX >> 725150473 * this.worldObjects.shiftAmount) - -1947125211 * this.worldObjects.anInt_4521)][-644084065 * this.worldObjects.anInt_4498 + (((int)var2.floatZ >> this.worldObjects.shiftAmount * 725150473) - this.worldObjects.anInt_4508 * -2026113737)];
   }

   boolean method4734(Renderer var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      return this.worldObjects.aClass269_4485.method3548(this.aByte_6942, (int)var3.floatX >> 725150473 * this.worldObjects.shiftAmount, (int)var3.floatZ >> 725150473 * this.worldObjects.shiftAmount, this.method4732(-702010940));
   }

   final void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   Class563_Sub1_Sub3(WorldObjects var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1);
      this.plane = (byte)var5;
      this.aByte_6942 = (byte)var6;
      this.aShort_3265 = (short)var7;
      this.aShort_3266 = (short)var8;
      this.setPos(new GameCoord((float)var2, (float)var3, (float)var4));

      for(int var9 = 0; var9 < 4; ++var9) {
         this.aClass240_Sub53Array_3268[var9] = null;
      }

   }

   final void method4723(int var1) {
      throw new IllegalStateException();
   }

   int method4725(Class240_Sub53[] var1, int var2) {
      if(this.aBoolean_9591) {
         GameCoord var3 = this.method6203().gameCoord;
         this.anInt_3267 = this.method4733((int)var3.floatX >> 725150473 * this.worldObjects.shiftAmount, (int)var3.floatZ >> this.worldObjects.shiftAmount * 725150473, this.aClass240_Sub53Array_3268, (byte)0) * -1425715221;
         this.aBoolean_9591 = false;
      }

      for(int var4 = 0; var4 < 1945395395 * this.anInt_3267; ++var4) {
         var1[var4] = this.aClass240_Sub53Array_3268[var4];
      }

      return 1945395395 * this.anInt_3267;
   }

   final boolean method4731(int var1) {
      return false;
   }
}
