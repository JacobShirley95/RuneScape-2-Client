
public class Class240_Sub44_Sub3 extends Class240_Sub44 {

   int anInt_881;
   byte aByte_882;
   int anInt_883;
   String aString_884;
   // $FF: synthetic field
   final Class80 aClass80_885;


   void method4968(ByteArrayDataNode var1, int var2) {
      this.anInt_883 = var1.readShort(529371460) * -73785679;
      this.aByte_882 = var1.getByte((byte)37);
      this.anInt_881 = var1.readShort(-841034135) * -311429485;
      var1.method4538(1385013726);
      this.aString_884 = var1.method4485(1337405991);
   }

   void method4967(Class240_Sub47 var1, int var2) {
      Class37 var3 = var1.aClass37Array_7661[this.anInt_883 * -1816696239];
      var3.aByte_855 = this.aByte_882;
      var3.anInt_854 = -1041210229 * this.anInt_881;
      var3.aString_853 = this.aString_884;
   }

   Class240_Sub44_Sub3(Class80 var1) {
      this.aClass80_885 = var1;
      this.anInt_883 = 73785679;
   }

   static Class240_Sub22_Sub5 method329(int var0) {
      Class240_Sub22_Sub5 var1 = (Class240_Sub22_Sub5)Class240_Sub22_Sub5.aClass494_1186.method5772(1583256858);
      if(var1 != null) {
         var1.shiftNext();
         var1.shiftNext();
         return var1;
      } else {
         do {
            var1 = (Class240_Sub22_Sub5)Class240_Sub22_Sub5.aClass494_1187.method5772(-1232974105);
            if(var1 == null) {
               return null;
            }

            if(var1.method594(-1865240470) > Class373.getCurrentTime((short)5639)) {
               return null;
            }

            var1.shiftNext();
            var1.shiftNext();
         } while(0L == (2950103203925786055L * var1.aLong_7278 & Long.MIN_VALUE));

         return var1;
      }
   }

   static final void method330(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= 1462854468;
      Class271.method3556(var0.intTypes[-831324111 * var0.intTypeIndex], var0.intTypes[1 + var0.intTypeIndex * -831324111], var0.intTypes[2 + -831324111 * var0.intTypeIndex], var0.intTypes[-831324111 * var0.intTypeIndex + 3], true, 256, -708028207);
   }
}
