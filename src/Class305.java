
public class Class305 {

   boolean aBoolean_6022;
   public static final Class305 aClass305_6023 = new Class305(true, false);
   public static final Class305 aClass305_6024 = new Class305(false, false);
   public static final Class305 aClass305_6025 = new Class305(false, false);
   static final Class305 aClass305_6026 = new Class305(true, false);
   public static final Class305 aClass305_6027 = new Class305(true, false);
   public static final Class305 aClass305_6028 = new Class305(false, false);
   static final Class305 aClass305_6029 = new Class305(true, true);
   boolean aBoolean_6030;
   static final Class305 aClass305_6031 = new Class305(true, true);
   public static boolean aBoolean_6032;


   Class305(boolean var1, boolean var2) {
      this.aBoolean_6030 = var1;
      this.aBoolean_6022 = var2;
   }

   boolean method3839(int var1) {
      return this.aBoolean_6030;
   }

   public boolean method3840(int var1) {
      return this.aBoolean_6022;
   }

   static final void method3841(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1871892239) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2572 = Class133.extractInterfaceData(var4, var2, (byte)53);
      var0.aBoolean_2524 = true;
   }

   static final void method3842(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.title;
   }

   static final void method3843(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      Class18.method101(var2, new Class240_Sub16(var3, 3), (int[])null, true, 421886660);
   }

   static final void method3844(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1020203353 * client.anInt_275;
   }

   static final void method3845(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(2 == -826987519 * client.anInt_567 && var2 < client.friendsCount * -1301826725) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.friendsList[var2].anInt_50 * -761711707;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method3846(RSInterfaceData var0, int var1) {
      var0.intTypes[var0.intTypeIndex * -831324111 - 1] = var0.aClass68_9508.method708(-1748406029)[var0.intTypes[-831324111 * var0.intTypeIndex - 1]];
   }

   static final void method3847(RSInterfaceData var0, int var1) {
      boolean var2 = true;
      String var3 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(client.aBoolean_452) {
         try {
            Object var4 = Class332.aClass332_6424.method4107(new Object[]{var3}, -1412447011);
            if(null != var4) {
               var2 = ((Boolean)var4).booleanValue();
            }
         } catch (Throwable var5) {
            ;
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2?1:0;
   }

   public static boolean method3848(int var0, int var1) {
      return 5 == var0 || var0 == 13 || var0 == 18 || 9 == var0 || 3 == var0 || 0 == var0 || 12 == var0;
   }
}
