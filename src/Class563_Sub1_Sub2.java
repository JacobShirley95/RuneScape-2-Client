
public abstract class Class563_Sub1_Sub2 extends Class563_Sub1 {

   int method4725(Class240_Sub53[] var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      return this.method4733((int)var3.floatX >> 725150473 * this.worldObjects.shiftAmount, (int)var3.floatZ >> this.worldObjects.shiftAmount * 725150473, var1, (byte)0);
   }

   boolean method4726(int var1) {
      GameCoord var2 = this.method6203().gameCoord;
      return this.worldObjects.aBooleanArrayArray_4531[((int)var2.floatX >> this.worldObjects.shiftAmount * 725150473) - this.worldObjects.anInt_4521 * -1947125211 + -644084065 * this.worldObjects.anInt_4498][-644084065 * this.worldObjects.anInt_4498 + (((int)var2.floatZ >> this.worldObjects.shiftAmount * 725150473) - this.worldObjects.anInt_4508 * -2026113737)];
   }

   final boolean method4731(int var1) {
      return false;
   }

   final void method4723(int var1) {
      throw new IllegalStateException();
   }

   final void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   boolean method4734(Renderer var1, int var2) {
      GameCoord var3 = this.method6203().gameCoord;
      Class629 var4 = this.worldObjects.method3427(this.plane, (int)var3.floatX >> 725150473 * this.worldObjects.shiftAmount, (int)var3.floatZ >> this.worldObjects.shiftAmount * 725150473, (byte)88);
      return null != var4 && var4.aClass563_Sub1_Sub4_10075.aBoolean_3294?this.worldObjects.aClass269_4485.method3548(this.plane, (int)var3.floatX >> 725150473 * this.worldObjects.shiftAmount, (int)var3.floatZ >> this.worldObjects.shiftAmount * 725150473, var4.aClass563_Sub1_Sub4_10075.method4732(-103246654) + this.method4732(-1779561493)):this.worldObjects.aClass269_4485.method3540(this.plane, (int)var3.floatX >> this.worldObjects.shiftAmount * 725150473, (int)var3.floatZ >> this.worldObjects.shiftAmount * 725150473);
   }

   Class563_Sub1_Sub2(WorldObjects var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1);
      this.plane = (byte)var5;
      this.aByte_6942 = (byte)var6;
      this.setPos(new GameCoord((float)var2, (float)var3, (float)var4));
   }

   static final void method2354(RSInterfaceData var0, int var1) {
      var0.aLongArray_9519[(var0.longTypeIndex += -1088659337) * 973044039 - 1] = ((Long)var0.composite.anObjectArray_3548[var0.anInt_9510 * -1756266293]).longValue();
   }
}
