
public class Class253 {

   static final int anInt_4379 = 16;
   static final int anInt_4380 = 2;
   static final int anInt_4381 = 8;
   static final int anInt_4382 = 1;
   static final int anInt_4383 = 63;
   static final int anInt_4384 = 62;
   public static Class68 aClass68_4385;


   Class253() throws Throwable {
      throw new Error();
   }

   static final void method3311(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1330397373 * var3.anInt_2522;
   }

   static final void method3312(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aBoolean_439?1:0;
   }

   static final void method3313(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      String var3 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(var2 == -1) {
         throw new RuntimeException();
      } else {
         Class470 var4 = Class493.aClass466_9034.method5614(var2, (byte)-60);
         if(var4.aChar_8694 != 115) {
            throw new RuntimeException();
         } else {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4.method5648(var3, 1773698747)?1:0;
         }
      }
   }

   static Class50[] method3314(int var0) {
      return new Class50[]{Class50.aClass50_1045, Class50.aClass50_1046, Class50.aClass50_1047};
   }

   public static long method3315(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      Class461.aCalendar_8602.clear();
      Class461.aCalendar_8602.set(var5, var4, var3, var2, var1, var0);
      return Class461.aCalendar_8602.getTime().getTime();
   }
}
