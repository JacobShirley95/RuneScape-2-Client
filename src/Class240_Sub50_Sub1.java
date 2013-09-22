
public abstract class Class240_Sub50_Sub1 extends Class240_Sub50 {

   Class121 aClass121_1399;
   Class121 aClass121_1400;
   String aString_1401;
   int anInt_1402;
   String aString_1403;


   public abstract boolean method869(int var1);

   public Class121 method870(byte var1) {
      return this.aClass121_1399;
   }

   public int method871(short var1) {
      if(Class121.aClass121_2126 != this.aClass121_1400) {
         throw new IllegalArgumentException_Sub1(this, this.aClass121_1400.toString().toLowerCase());
      } else {
         return this.anInt_1402 * -1944804657;
      }
   }

   public abstract int method872(int var1);

   String method873(int var1) {
      return this.aString_1401;
   }

   Class240_Sub50_Sub1(Class120 var1) {
      this.aClass121_1400 = var1.aClass121_2114;
      this.aString_1401 = var1.aString_2112;
      this.aString_1403 = var1.aString_2115;
      this.anInt_1402 = var1.anInt_2113 * 727615961;
      this.aClass121_1399 = var1.aClass121_2111;
   }

   public String toString() {
      String var1 = this.aClass121_1400.toString() + " " + this.aString_1401;
      if(null != this.aString_1403 && !"".equals(this.aString_1403)) {
         var1 = var1 + " : " + this.aString_1403;
      }

      return var1;
   }

   public Class121 method875(int var1) {
      return this.aClass121_1400;
   }

   static final void method876(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      Class598.method6476(5, var2 << 16 | var3, var4, "", -1898494081);
   }
}
