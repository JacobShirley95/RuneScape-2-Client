
public class Class7 implements Class30 {

   public Class118 method217(Class114 var1, int var2, int var3) {
      if(Class114.aClass114_2077 == var1) {
         return client.aPlayerArray[var2];
      } else {
         if(Class114.aClass114_2078 == var1) {
            Class240_Sub9 var4 = (Class240_Sub9)client.npcNodeList.getNode((long)var2);
            if(null != var4) {
               return (Class118)var4.anObject_6783;
            }
         }

         return null;
      }
   }

   static void method41(byte var0) {
      if(null == Class541.anIntArray_9470) {
         Class541.anIntArray_9470 = new int[65536];
         Class561.anIntArray_9583 = new int[65536];
         double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);

         for(int var3 = 0; var3 < 65536; ++var3) {
            double var4 = (double)(var3 >> 10 & 63) / 64.0D + 0.0078125D;
            double var6 = 0.0625D + (double)(var3 >> 7 & 7) / 8.0D;
            double var8 = (double)(var3 & 127) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if(0.0D != var6) {
               double var16;
               if(var8 < 0.5D) {
                  var16 = (1.0D + var6) * var8;
               } else {
                  var16 = var6 + var8 - var8 * var6;
               }

               double var18 = 2.0D * var8 - var16;
               double var20 = var4 + 0.3333333333333333D;
               if(var20 > 1.0D) {
                  --var20;
               }

               double var24 = var4 - 0.3333333333333333D;
               if(var24 < 0.0D) {
                  ++var24;
               }

               if(6.0D * var20 < 1.0D) {
                  var10 = var20 * (var16 - var18) * 6.0D + var18;
               } else if(2.0D * var20 < 1.0D) {
                  var10 = var16;
               } else if(3.0D * var20 < 2.0D) {
                  var10 = 6.0D * (var16 - var18) * (0.6666666666666666D - var20) + var18;
               } else {
                  var10 = var18;
               }

               if(var4 * 6.0D < 1.0D) {
                  var12 = var18 + 6.0D * (var16 - var18) * var4;
               } else if(2.0D * var4 < 1.0D) {
                  var12 = var16;
               } else if(3.0D * var4 < 2.0D) {
                  var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
               } else {
                  var12 = var18;
               }

               if(var24 * 6.0D < 1.0D) {
                  var14 = var24 * (var16 - var18) * 6.0D + var18;
               } else if(2.0D * var24 < 1.0D) {
                  var14 = var16;
               } else if(var24 * 3.0D < 2.0D) {
                  var14 = var18 + 6.0D * (0.6666666666666666D - var24) * (var16 - var18);
               } else {
                  var14 = var18;
               }
            }

            var10 = Math.pow(var10, var1);
            var12 = Math.pow(var12, var1);
            var14 = Math.pow(var14, var1);
            int var26 = (int)(var10 * 256.0D);
            int var27 = (int)(256.0D * var12);
            int var28 = (int)(256.0D * var14);
            int var29 = (var27 << 8) + (var26 << 16) + var28;
            Class541.anIntArray_9470[var3] = var29 & 16777215;
            int var30 = (var27 << 8) + (var28 << 16) + var26;
            Class561.anIntArray_9583[var3] = var30;
         }

      }
   }

   static final void method42(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var2 >= 1) {
         ;
      }

      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub13_7311, var2, 1717977613);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub13_7298, var2, 2124178065);
      Class83.method1089(-880493999);
   }
}
