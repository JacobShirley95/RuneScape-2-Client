import java.util.HashSet;
import java.util.Set;

public class Class554 implements Class551 {

   public static final Class554 aClass554_9529 = new Class554("", 0, new Class572[]{Class572.aClass572_9656});
   public static final Class554 aClass554_9530 = new Class554("", 3, new Class572[]{Class572.aClass572_9654});
   final int anInt_9531;
   public static final Class554 aClass554_9532 = new Class554("", 5, new Class572[]{Class572.aClass572_9654, Class572.aClass572_9656});
   public static final Class554 aClass554_9533 = new Class554("", 4);
   public static final Class554 aClass554_9534 = new Class554("", 2, new Class572[]{Class572.aClass572_9654, Class572.aClass572_9655});
   static final Class554 aClass554_9535 = new Class554("", 9, new Class572[]{Class572.aClass572_9654, Class572.aClass572_9655});
   public static final Class554 aClass554_9536 = new Class554("", 1, new Class572[]{Class572.aClass572_9654, Class572.aClass572_9656});
   static final Class554 aClass554_9537 = new Class554("", 11, new Class572[]{Class572.aClass572_9654});
   static final Class554 aClass554_9538 = new Class554("", 8, new Class572[]{Class572.aClass572_9654, Class572.aClass572_9656});
   public static final Class554 aClass554_9539 = new Class554("", 10, new Class572[]{Class572.aClass572_9654});
   static final Class554 aClass554_9540 = new Class554("", 6, new Class572[]{Class572.aClass572_9656});
   final Set aSet_9541 = new HashSet();


   static {
      method6137(-1045140906);
   }

   Class554(String var1, int var2) {
      this.anInt_9531 = var2 * 1739148163;
   }

   public int getLanguageID(int var1) {
      return 1934138155 * this.anInt_9531;
   }

   public boolean method6136(Class572 var1, int var2) {
      return this.aSet_9541.contains(var1);
   }

   public static Class554[] method6137(int var0) {
      return new Class554[]{aClass554_9529, aClass554_9534, aClass554_9538, aClass554_9533, aClass554_9530, aClass554_9532, aClass554_9540, aClass554_9535, aClass554_9536, aClass554_9539, aClass554_9537};
   }

   Class554(String var1, int var2, Class572[] var3) {
      this.anInt_9531 = var2 * 1739148163;
      Class572[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         Class572 var6 = var4[var5];
         this.aSet_9541.add(var6);
      }

   }

   public static void method6138(int var0, int var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8) {
      ChatMessageCache var9 = (ChatMessageCache)Class109.aMap_2042.get(Integer.valueOf(var0));
      if(var9 == null) {
         var9 = new ChatMessageCache();
         Class109.aMap_2042.put(Integer.valueOf(var0), var9);
      }

      ChatMessage var10 = var9.method1645(var0, var1, var2, var3, var4, var5, var6, var7, -231845488);
      Class109.aNodeArrayList_2041.insert(var10, (long)(581865099 * var10.anInt_7399));
      client.anInt_511 = 835536561 * client.anInt_413;
   }

   public static int method6139(int var0, byte var1) {
      double var2 = (double)(var0 >> 16 & 255) / 256.0D;
      double var4 = (double)(var0 >> 8 & 255) / 256.0D;
      double var6 = (double)(var0 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if(var8 != var10) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if(var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      int var18 = (int)(256.0D * var12);
      int var19 = (int)(256.0D * var14);
      int var20 = (int)(var16 * 256.0D);
      if(var19 < 0) {
         var19 = 0;
      } else if(var19 > 255) {
         var19 = 255;
      }

      if(var20 < 0) {
         var20 = 0;
      } else if(var20 > 255) {
         var20 = 255;
      }

      if(var20 > 243) {
         var19 >>= 4;
      } else if(var20 > 217) {
         var19 >>= 3;
      } else if(var20 > 192) {
         var19 >>= 2;
      } else if(var20 > 179) {
         var19 >>= 1;
      }

      return (var20 >> 1) + (var19 >> 5 << 7) + ((var18 & 255) >> 2 << 10);
   }

   static final void drawHintMarkers(int var0, int var1, int var2, int var3, int var4, int var5, short var6) {
      HintMarker[] var7 = client.hintMarkers;

      for(int var8 = 0; var8 < var7.length; ++var8) {
         HintMarker var9 = var7[var8];
         if(null != var9 && -2076198275 * var9.anInt_3702 == 2) {
            Class525.method5990(var9.anInt_3701 * 684685641, 1139126719 * var9.markerX, var9.markerZ * 1450308353, var9.anInt_3703 * 1528777858, -1844577525);
            if(client.calculatedPosition[0] > -1.0F && -1025618511 * client.timer % 20 < 10) {
               Sprite var10 = Class240_Sub22_Sub16.hintHeadIconsSprites[var9.spriteIndex * -611466427];
               int pixelX = (int)((float)var0 + client.calculatedPosition[0] - 12.0F);
               int pixelY = (int)((float)var1 + client.calculatedPosition[1] - 28.0F);
               var10.drawAt(pixelX, pixelY);
            }
         }
      }

   }

   static final void method6141(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class187.method2295(var3, var4, var0, -150662737);
   }

   static final void method6142(RSInterface var0, RSInterfaceData var1, byte var2) {
      int var3 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      int var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111] - 1;
      if(-28225993 * var0.anInt_2469 != 6) {
         throw new RuntimeException("");
      } else {
         NPCComposite var5 = Class104_Sub6.characterUnpacker.method5670(var0.anInt_2416 * 1007149995, -307995219);
         if(null == var0.aClass442_2594) {
            var0.aClass442_2594 = new Class442(var5, true);
         }

         var0.aClass442_2594.aLong_8440 = Class585_Sub1.method4152(2116676307) * -7074691745365666227L;
         if(var4 >= 0 && var4 < var5.anIntArray_8655.length) {
            var0.aClass442_2594.anIntArray_8439[var4] = var3;
            Class110_Sub1.method3149(var0, 675017676);
         } else {
            throw new RuntimeException("" + var4);
         }
      }
   }

   static final void method6143(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      int var4 = var3 >> 14 & 16383;
      int var5 = var3 & 16383;
      int var6 = Class66.method678(var2, var4, var5, -1940956109);
      if(var6 < 0) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var6;
      }

   }
}
