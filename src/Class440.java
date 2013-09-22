
public class Class440 {

   public Class415[] aClass415Array_8438;


   void method5457(ByteArrayDataNode var1, int var2) {
      this.aClass415Array_8438 = new Class415[var1.readByte(439408297)];
      Class408[] var3 = Class405.method5010(1630284364);

      for(int var4 = 0; var4 < this.aClass415Array_8438.length; ++var4) {
         this.aClass415Array_8438[var4] = this.method5458(var1, var3[var1.readByte(656716988)], 401881603);
      }

   }

   Class415 method5458(ByteArrayDataNode var1, Class408 var2, int var3) {
      return (Class415)(Class408.aClass408_7747 == var2?Class24.method152(var1, (short)-25172):(var2 == Class408.aClass408_7743?Class240_Sub52_Sub8.method552(var1, (byte)-109):(var2 == Class408.aClass408_7750?Class123.method1568(var1, 874008410):(Class408.aClass408_7749 == var2?Class68.method717(var1, (byte)-89):(var2 == Class408.aClass408_7748?Class283_Sub2.method5017(var1, 1048866820):(var2 == Class408.aClass408_7745?Class565.method6228(var1, 323158515):(var2 == Class408.aClass408_7746?Class573.method6281(var1, 1278853609):(Class408.aClass408_7744 == var2?Class47_Sub1.method3497(var1, 248435207):(Class408.aClass408_7751 == var2?Class66_Sub3.method3004(var1, -1487889111):(Class408.aClass408_7753 == var2?Class563_Sub1_Sub1.method251(var1, (byte)83):null))))))))));
   }

   static void method5459(byte var0) {
      Class240_Sub46.aNodeArrayList_7651.method5938(1626777429);
   }

   static final void method5460(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -978526293 * var3.scrollY;
   }
}
