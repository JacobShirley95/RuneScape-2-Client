
public class Class240_Sub14 extends NodeListNode {

   public long aLong_6833;


   public Class240_Sub14(long var1) {
      this.aLong_6833 = var1 * 4853622503744357977L;
   }

   static final void method4620(RSInterface var0, RSInterfaceData var1, short var2) {
      int var3 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      int var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111] - 1;
      int var5 = var4;
      if(6 != -28225993 * var0.anInt_2469 && 2 != var0.anInt_2469 * -28225993) {
         throw new RuntimeException("");
      } else {
         NPCComposite var6 = Class104_Sub6.characterUnpacker.method5670(1007149995 * var0.anInt_2416, 857015629);
         if(null == var0.aClass442_2594) {
            var0.aClass442_2594 = new Class442(var6, 6 == -28225993 * var0.anInt_2469);
         }

         var0.aClass442_2594.aLong_8440 = Class585_Sub1.method4152(1745121548) * -7074691745365666227L;
         if(var6.aByteArray_8611 != null) {
            if(var4 < 0 || var4 >= var6.aByteArray_8611.length) {
               throw new RuntimeException("");
            }

            var5 = var6.aByteArray_8611[var4];
         }

         if(var6.aShortArray_8620 != null && var5 >= 0 && var5 < var6.aShortArray_8620.length) {
            var0.aClass442_2594.aShortArray_8442[var5] = (short)var3;
            Class110_Sub1.method3149(var0, -40836379);
         } else {
            throw new RuntimeException("");
         }
      }
   }
}
