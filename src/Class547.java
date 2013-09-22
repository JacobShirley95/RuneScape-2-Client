
public class Class547 implements Class238 {

   Renderer aRenderer_9479;


   public Object method3080(int[] var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      return this.aRenderer_9479.method1930(var1, var2, var3, var4, var5, false);
   }

   public static boolean method6103(int var0, int var1) {
      return 6 == var0 || 10 == var0 || 8 == var0;
   }

   static void method6104(int var0) {
      if(Class286.gameRenderer != null) {
         client.aClass296_348.method3787((short)-19679);
         Class300.method3814(1799846638);
         Class540_Sub21.method4048(-1935633038);
         FontRenderer_Sub1.method7080(-1552941785);
         client.aClass296_348.method3786(-2124093622);
         Class109.method1406((byte)21);
         Class416.method5154(false, (byte)13);
         LoadProgress.method4428(-144397506);
         Class494.method5780(true, -1626899059);
         Class212.method2664(-1697934822);
         Class240_Sub19.method4786(594627509);

         int var1;
         for(var1 = 0; var1 < client.aClass235Array_306.length; ++var1) {
            if(client.aClass235Array_306[var1] != null) {
               ;
            }
         }

         int var3;
         for(var1 = 0; var1 < 2048; ++var1) {
            Player var2 = client.aPlayerArray[var1];
            if(null != var2) {
               for(var3 = 0; var3 < var2.aClass165Array_4350.length; ++var3) {
                  var2.aClass165Array_4350[var3] = null;
               }
            }
         }

         for(var1 = 0; var1 < client.anInt_334 * 1910301187; ++var1) {
            NPC var4 = (NPC)client.aClass240_Sub9Array_271[var1].anObject_6783;
            if(null != var4) {
               for(var3 = 0; var3 < var4.aClass165Array_4350.length; ++var3) {
                  var4.aClass165Array_4350[var3] = null;
               }
            }
         }

         client.aNodeArrayList_277.method5938(1689295639);
         Class286.gameRenderer.method1939(-1500363801);
         Class286.gameRenderer = null;
      }

   }

   public static String method6105(String var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var0.charAt(var4);
         if(var5 == 37 && var3 > 2 + var4) {
            var5 = var0.charAt(var4 + 1);
            boolean var6 = false;
            int var7;
            if(var5 >= 48 && var5 <= 57) {
               var7 = var5 - 48;
            } else if(var5 >= 97 && var5 <= 102) {
               var7 = var5 + 10 - 97;
            } else {
               if(var5 < 65 || var5 > 70) {
                  var2.append('%');
                  continue;
               }

               var7 = var5 + 10 - 65;
            }

            var7 *= 16;
            var5 = var0.charAt(var4 + 2);
            if(var5 >= 48 && var5 <= 57) {
               var7 += var5 - 48;
            } else if(var5 >= 97 && var5 <= 102) {
               var7 += 10 + var5 - 97;
            } else {
               if(var5 < 65 || var5 > 70) {
                  var2.append('%');
                  continue;
               }

               var7 += 10 + var5 - 65;
            }

            if(0 != var7 && Class568.method6252((byte)var7, (short)155)) {
               var2.append(Class97.method1274((byte)var7, 2084658993));
            }

            var4 += 2;
         } else if(43 == var5) {
            var2.append(' ');
         } else {
            var2.append(var5);
         }
      }

      return var2.toString();
   }

   static final void method6106(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_2476 * -894621809;
   }
}
