
public class Class363 implements Class487 {

   boolean aBoolean_6831;
   final String aString_6832;


   boolean method4611(int var1) {
      return this.aBoolean_6831;
   }

   Class363(String var1) {
      this.aString_6832 = var1;
   }

   public Class500 method5742(int var1) {
      return Class500.aClass500_9085;
   }

   public int method5743(int var1) {
      if(this.aBoolean_6831) {
         return 100;
      } else {
         try {
            return Class635.clientLibExtractor.extractLib(this.aString_6832, -798397972);
         } catch (Exception_Sub4 var3) {
            Class327.method4036(Class491.aClass491_9012, var3.aString_1987, 1054537335 * var3.anInt_1986, (byte)98);
            this.aBoolean_6831 = true;
            return 100;
         }
      }
   }

   public static Class224 method4614(int var0) {
      return ClientSuper.aClass224_3901;
   }

   public static void method4615(String[] var0, short[] var1, int var2) {
      Class298.method3800(var0, var1, 0, var0.length - 1, 2044903363);
   }

   static final void method4616(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class525.aClass490_9274.method5748(var2, (byte)48).method2680(410186545);
   }

   static final void method4617(RSInterfaceData var0, byte var1) {
      Class273.method3601(137695730);
   }

   static final void method4618(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class109.method1408(var3, var4, var0, (byte)23);
   }

   static final void method4619(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      GameCoord var4 = GameCoord.createCoord((float)var2, (float)var2, (float)var2);
      if(var4.floatX == -1.0F) {
         var4.floatX = Float.POSITIVE_INFINITY;
      }

      if(-1.0F == var4.floatY) {
         var4.floatY = Float.POSITIVE_INFINITY;
      }

      if(-1.0F == var4.floatZ) {
         var4.floatZ = Float.POSITIVE_INFINITY;
      }

      Class542.aClass43_Sub1_9475.method374(var4, (byte)-28);
      Class542.aClass43_Sub1_9475.method388((float)var3 / 1000.0F, 16711935);
      var4.store();
   }
}
