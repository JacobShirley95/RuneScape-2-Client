import java.awt.Container;

public abstract class DrawingTarget {

   public abstract int method2194();

   public abstract void method2195();

   abstract boolean method2196();

   abstract boolean method2197();

   public abstract int method2198();

   static void method2199(int var0) {
      if(Class572.method6274(-1350426531)) {
         if(null == Class194.consoleStrings) {
            Class410.method5065(-111049312);
         }

         Class194.aBoolean_3365 = true;
         Class194.anInt_3364 = 0;
      }

   }

   public static Container getGameContainer(int var0) {
      return (Container)(Class102.aFrame_1967 != null?Class102.aFrame_1967:(null != ConnectionUpdate.clientFrame?ConnectionUpdate.clientFrame:Class481.clientApplet));
   }

   public static RSInterface method2201(int var0, int var1, byte var2) {
      RSInterface var3 = RSServerQueue.getInterface(var0, (byte)105);
      return var1 == -1?var3:(null != var3 && null != var3.aClass132Array_2579 && var1 < var3.aClass132Array_2579.length?var3.aClass132Array_2579[var1]:null);
   }

   static void method2202(Renderer var0, byte[][][] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if(var9 != 0 && var2 != 0) {
         if(var9 == 9) {
            var9 = 1;
            var10 = 1 + var10 & 3;
         }

         if(10 == var9) {
            var9 = 1;
            var10 = var10 + 3 & 3;
         }

         if(11 == var9) {
            var9 = 8;
            var10 = 3 + var10 & 3;
         }

         var0.method1991(var3, var4, var7, var8, var5, var6, var1[var9 - 1][var10], var2, var11);
      }
   }

   public static Class401 method2203(int var0, int var1) {
      Class401 var2 = (Class401)Class401.aClass627_7624.getObject((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class401.aCacheUnpacker_7623.getDataBytes(1, var0, 297442182);
         var2 = new Class401();
         var2.anInt_7633 = var0 * -1060437049;
         if(null != var3) {
            var2.method4963(new ByteArrayDataNode(var3), (byte)31);
         }

         var2.method4961((byte)47);
         if(2 == -1754227241 * var2.anInt_7626 && Class401.aNodeArrayList_7612.getNode((long)var0) == null) {
            Class401.aNodeArrayList_7612.insert(new IndexNode(-1157388943 * Class401.anInt_7625), (long)var0);
            Class401.aClass401Array_7620[(Class401.anInt_7625 += 2022865809) * -1157388943 - 1] = var2;
         }

         Class401.aClass627_7624.insert(var2, (long)var0);
         return var2;
      }
   }

   static void method2204(int var0) {
      Class192.anInt_3351 = 0;
      Class192.anInt_3345 = 1094626891;
      Class192.flagX = -624818685;
      Class192.flagY = 2043346881;
   }

   static final void method2205(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class599.method6481(var3, var0, -1201118147);
   }
}
