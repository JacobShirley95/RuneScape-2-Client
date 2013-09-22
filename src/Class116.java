
public class Class116 {

   public final int anInt_2085;
   public static final Class116 aClass116_2086 = new Class116(0, false);
   static final Class116 aClass116_2087 = new Class116(2, true);
   static final Class116 aClass116_2088 = new Class116(3, true);
   public static final Class116 aClass116_2089 = new Class116(1, false);
   final boolean aBoolean_2090;


   public boolean method1484(int var1) {
      return this.aBoolean_2090;
   }

   Class116(int var1, boolean var2) {
      this.anInt_2085 = var1 * 1557573439;
      this.aBoolean_2090 = var2;
   }

   static final void method1485(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, short var3) {
      var2.intTypeIndex -= 1462854468;
      var0.anInt_2436 = 444043751 * var2.intTypes[var2.intTypeIndex * -831324111];
      var0.anInt_2438 = var2.intTypes[var2.intTypeIndex * -831324111 + 1] * 674110025;
      var0.anInt_2415 = 0;
      var0.anInt_2483 = 0;
      int var4 = var2.intTypes[2 + var2.intTypeIndex * -831324111];
      if(var4 < 0) {
         var4 = 0;
      } else if(var4 > 4) {
         var4 = 4;
      }

      int var5 = var2.intTypes[3 + -831324111 * var2.intTypeIndex];
      if(var5 < 0) {
         var5 = 0;
      } else if(var5 > 4) {
         var5 = 4;
      }

      var0.aByte_2433 = (byte)var4;
      var0.aByte_2498 = (byte)var5;
      Class110_Sub1.method3149(var0, 429843832);
      Class174_Sub2.method7577(var1, var0, -1442760527);
      if(0 == 1916189739 * var0.index) {
         Class20.method120(var1, var0, false, -997601248);
      }

   }

   static final void method1486(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class377.method4814(var3, var4, var0, -297669338);
   }

   static final void method1487(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class592.cacheObjectLoader.getObjectDescriptor(var2).anInt_8475 * -1551593417;
   }

   static final void method1488(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      Class476 var4 = Class240_Sub1.aClass465_6506.method5610(var3, -734720878);
      if(var4.method5681(-1655209656)) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class592.cacheObjectLoader.getObjectDescriptor(var2).method5464(var3, var4.aString_8738, 1548994794);
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class592.cacheObjectLoader.getObjectDescriptor(var2).method5476(var3, var4.anInt_8739 * -80630797, (byte)-37);
      }

   }

   static final void method1489(RSInterfaceData var0, int var1) {
      if(Class542.aClass43_Sub1_9475.method370(-281078064) == aClass116_2089 && Class542.aClass43_Sub1_9475.method369(-831324111) == Class31.aClass31_808) {
         GameCoord var2 = ((Class66_Sub3)Class542.aClass43_Sub1_9475.method398(521374031)).method2995((byte)-37);
         GameCoord var3 = ((Class508_Sub4)Class542.aClass43_Sub1_9475.method397((byte)-92)).method1616(-391696516);
         GameCoord var4 = GameCoord.method4308(var2);
         var4.dist(var3);
         float var5 = ParameterNode.method5292(var4.floatX, var4.floatZ, (byte)81);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(2607.5945876176133D * (double)var5) & 16383;
      } else {
         throw new RuntimeException();
      }
   }

   static final void method1490(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      int var4 = var0.intTypes[2 + var0.intTypeIndex * -831324111];
      String var5 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(-1 == var3) {
         throw new RuntimeException();
      } else {
         Class470 var6 = Class493.aClass466_9034.method5614(var3, (byte)101);
         if(var6.aChar_8697 != var2) {
            throw new RuntimeException();
         } else if(115 != var6.aChar_8694) {
            throw new RuntimeException();
         } else {
            int[] var7 = var6.method5652(var5, (byte)-32);
            if(var4 >= 0 && null != var7 && var7.length > var4) {
               var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var7[var4];
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   static final void method1491(RSInterfaceData var0, int var1) {
      if(Class430.aClass517_8266 == null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class430.aClass517_8266.anInt_9221 * 1581295263;
      }

   }

   public static RuntimeException_Sub3 method1492(Throwable var0, String var1) {
      RuntimeException_Sub3 var2;
      if(var0 instanceof RuntimeException_Sub3) {
         var2 = (RuntimeException_Sub3)var0;
         var2.aString_3273 = var2.aString_3273 + ' ' + var1;
      } else {
         var2 = new RuntimeException_Sub3(var0, var1);
      }

      return var2;
   }
}
