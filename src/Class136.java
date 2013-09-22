
public class Class136 {

   public final int anInt_2624;
   public static final Class136 aClass136_2625 = new Class136(2, 4);
   public static final Class136 aClass136_2626 = new Class136(6, 1);
   public static final Class136 aClass136_2627 = new Class136(3, 3);
   public static final Class136 aClass136_2628 = new Class136(7, 2);
   public static final Class136 aClass136_2629 = new Class136(5, 1);
   static final Class136 aClass136_2630 = new Class136(0, 3);
   public static final Class136 aClass136_2631 = new Class136(9, 1);
   public static final Class136 aClass136_2632 = new Class136(8, 1);
   public static final Class136 aClass136_2633 = new Class136(1, 1);
   static final Class136 aClass136_2634 = new Class136(4, 4);
   public final int anInt_2635;


   Class136(int var1, int var2) {
      this.anInt_2635 = 564376765 * var1;
      this.anInt_2624 = 1186046121 * var2;
   }

   static final void method1798(RSInterfaceData var0, byte var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub3_7307, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 299990214);
      Class83.method1089(-2008317500);
      client.aBoolean_311 = true;
   }

   public static String[] method1799(String var0, char var1, byte var2) {
      int var3 = Class104_Sub11.method6846(var0, var1, -785789214);
      String[] var4 = new String[1 + var3];
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < var3; ++var7) {
         int var8;
         for(var8 = var6; var0.charAt(var8) != var1; ++var8) {
            ;
         }

         var4[var5++] = var0.substring(var6, var8);
         var6 = var8 + 1;
      }

      var4[var3] = var0.substring(var6);
      return var4;
   }

   static final void method1800(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      String var3 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(client.loginStage * -243034353 == 4 && !Class66.method680(-1755189505)) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub2.method3146(var2, var3, 1619522975)?1:0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method1801(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class537.method6072(var3, var4, var0, 1612237363);
   }
}
