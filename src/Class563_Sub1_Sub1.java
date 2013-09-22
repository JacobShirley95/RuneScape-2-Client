
public abstract class Class563_Sub1_Sub1 extends Class563_Sub1 {

   public short height;
   int anInt_822 = 0;
   Class240_Sub53[] aClass240_Sub53Array_823 = new Class240_Sub53[4];


   int method4725(Class240_Sub53[] var1, int var2) {
      if(this.aBoolean_9591) {
         GameCoord var3 = this.method6203().gameCoord;
         this.anInt_822 = this.method4733((int)var3.floatX >> this.worldObjects.shiftAmount * 725150473, (int)var3.floatZ >> 725150473 * this.worldObjects.shiftAmount, this.aClass240_Sub53Array_823, (byte)0) * 1604749319;
         this.aBoolean_9591 = false;
      }

      for(int var4 = 0; var4 < this.anInt_822 * 451306935; ++var4) {
         var1[var4] = this.aClass240_Sub53Array_823[var4];
      }

      return 451306935 * this.anInt_822;
   }

   boolean method4726(int var1) {
      GameCoord var2 = this.method6203().gameCoord;
      return this.worldObjects.aBooleanArrayArray_4531[-644084065 * this.worldObjects.anInt_4498 + (((int)var2.floatX >> 725150473 * this.worldObjects.shiftAmount) - this.worldObjects.anInt_4521 * -1947125211)][((int)var2.floatZ >> this.worldObjects.shiftAmount * 725150473) - this.worldObjects.anInt_4508 * -2026113737 + -644084065 * this.worldObjects.anInt_4498];
   }

   boolean method4734(Renderer var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      return this.worldObjects.aClass269_4485.method3540(this.aByte_6942, (int)var3.floatX >> this.worldObjects.shiftAmount * 725150473, (int)var3.floatZ >> this.worldObjects.shiftAmount * 725150473);
   }

   Class563_Sub1_Sub1(WorldObjects var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1);
      this.plane = (byte)var5;
      this.aByte_6942 = (byte)var6;
      this.height = (short)var7;
      this.setPos(new GameCoord((float)var2, (float)var3, (float)var4));

      for(int var8 = 0; var8 < 4; ++var8) {
         this.aClass240_Sub53Array_823[var8] = null;
      }

   }

   public static Class409 method251(ByteArrayDataNode var0, byte var1) {
      Class409_Sub1 var2 = (Class409_Sub1)Class573.method6281(var0, 1278853609);
      int var3 = var0.method4478((byte)1);
      return new Class409_Sub1_Sub1(var2.aClass419_7760, var2.aClass412_7761, 1684132453 * var2.anInt_7762, 731209435 * var2.anInt_7766, var2.anInt_7764 * 1912610703, var2.anInt_7765 * 1854937727, var2.anInt_7763 * -138079065, 1909120553 * var2.anInt_7767, 2062892803 * var2.anInt_7768, -896286957 * var2.anInt_3798, var2.anInt_3795 * 722877179, 410784329 * var2.anInt_3794, var2.anInt_3797 * 1337644989, -1994119709 * var2.anInt_3799, -942380819 * var2.anInt_3796, var3);
   }
}
