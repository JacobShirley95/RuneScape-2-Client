import java.util.Iterator;

public class Class32_Sub1 extends Class32 {

   int anInt_4409 = 0;


   Class32_Sub1(CacheDataUnpacker var1, Class430_Sub1 var2) {
      super(var1, var2);
   }

   public void method813(boolean var1, int var2) {
      int var3 = this.aClass430_816.aClass419_8262.method5215(this.aClass170_817.getFurthestX(), 688709465 * client.anInt_343, (byte)-55) + -1666406649 * this.aClass430_816.anInt_8261;
      int var4 = this.aClass430_816.aClass412_8263.method5106(this.aClass170_817.getFurthestY(), client.anInt_435 * 759607001, 1700369016) + 355910967 * this.aClass430_816.anInt_8265;
      this.aClass170_817.rotateDraw((float)(var3 + this.aClass170_817.getFurthestX() / 2), (float)(var4 + this.aClass170_817.getFurthestY() / 2), 4096, -671857107 * this.anInt_4409);
      this.anInt_4409 += 449049349 * ((Class430_Sub1)this.aClass430_816).anInt_4024;
   }

   public static void method3353(int var0, byte var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(12, (long)var0);
      var2.method597((byte)0);
   }

   public static RSWorld method3354(int var0) {
      Class503.anInt_9107 = 0;
      return Class102.method1315(1470943267);
   }

   static final void method3355(int var0) {
      Iterator var1 = client.aNodeArrayList_277.iterator();

      while(var1.hasNext()) {
         Class240_Sub22_Sub6 var2 = (Class240_Sub22_Sub6)var1.next();
         Class563_Sub1_Sub4_Sub2 var3 = var2.aClass563_Sub1_Sub4_Sub2_1237;
         var3.method2240(1, -720798247);
         if(var3.method2235((byte)-82)) {
            var2.shiftNext();
            var3.method2244(-2102406406);
         }
      }

   }
}
