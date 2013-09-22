
public class Class57 {

   public Class384[] aClass384Array_1091 = null;
   static final int anInt_1092 = 128;
   public static final int anInt_1093 = 16;
   static final int anInt_1094 = 128;
   public boolean aBoolean_1095;
   public Class54 aClass54_1096 = null;
   Class54 aClass54_1097 = null;
   Class384[] aClass384Array_1098 = null;
   public Class54 aClass54_1099 = null;
   Renderer_Sub3 aRenderer_Sub3_1100;
   static Object anObject_1101;
   static Object anObject_1102;
   static Object anObject_1103;


   Class57(Renderer_Sub3 var1) {
      this.aRenderer_Sub3_1100 = var1;
      this.aBoolean_1095 = this.aRenderer_Sub3_1100.aBoolean_10655;
      if(this.aBoolean_1095 && !this.aRenderer_Sub3_1100.method7213(Class136.aClass136_2628, Class87.aClass87_1759)) {
         this.aBoolean_1095 = false;
      }

      if(this.aBoolean_1095 || this.aRenderer_Sub3_1100.method7212(Class136.aClass136_2628, Class87.aClass87_1759)) {
         method563();
         if(!this.aBoolean_1095) {
            this.aClass384Array_1098 = new Class384[16];

            int var2;
            byte[] var3;
            for(var2 = 0; var2 < 16; ++var2) {
               var3 = Class623.method6643(anObject_1101, var2 * '\u8000', '\u8000', 1453969503);
               this.aClass384Array_1098[var2] = this.aRenderer_Sub3_1100.method7215(Class136.aClass136_2628, 128, 128, true, var3);
            }

            this.aClass384Array_1091 = new Class384[16];

            for(var2 = 0; var2 < 16; ++var2) {
               var3 = Class623.method6643(anObject_1102, var2 * '\u8000', '\u8000', 1453969503);
               this.aClass384Array_1091[var2] = this.aRenderer_Sub3_1100.method7215(Class136.aClass136_2628, 128, 128, true, var3);
            }
         } else {
            byte[] var4 = Class41.method340(anObject_1101, false, (byte)70);
            this.aClass54_1097 = this.aRenderer_Sub3_1100.method7221(Class136.aClass136_2628, 128, 128, 16, true, var4);
            var4 = Class41.method340(anObject_1102, false, (byte)-30);
            this.aClass54_1099 = this.aRenderer_Sub3_1100.method7221(Class136.aClass136_2628, 128, 128, 16, true, var4);
         }

      }
   }

   public boolean method561() {
      if(!this.aRenderer_Sub3_1100.aBoolean_10655) {
         return false;
      } else {
         if(this.aClass54_1096 == null) {
            byte[] var1;
            if(anObject_1103 == null) {
               var1 = Class245.method3138(128, 128, 16, 8, new Class242_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
               anObject_1103 = Class89.method1184(var1, false, (short)19809);
            }

            var1 = Class41.method340(anObject_1103, false, (byte)38);
            byte[] var2 = new byte[var1.length * 4];
            int var3 = 0;

            for(int var4 = 0; var4 < 16; ++var4) {
               int var5 = var4 * 16384;
               int var6 = var5;

               for(int var7 = 0; var7 < 128; ++var7) {
                  int var8 = var6 + var7 * 128;
                  int var9 = var6 + (var7 - 1 & 127) * 128;
                  int var10 = var6 + (var7 + 1 & 127) * 128;

                  for(int var11 = 0; var11 < 128; ++var11) {
                     float var12 = (float)((var1[var9 + var11] & 255) - (var1[var10 + var11] & 255));
                     float var13 = (float)((var1[var8 + (var11 - 1 & 127)] & 255) - (var1[var8 + (var11 + 1 & 127)] & 255));
                     float var14 = (float)(128.0D / Math.sqrt((double)(var13 * var13 + 16384.0F + var12 * var12)));
                     var2[var3++] = (byte)((int)(var13 * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(128.0F * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(var12 * var14 + 127.0F));
                     var2[var3++] = var1[var5++];
                  }
               }
            }

            this.aClass54_1096 = this.aRenderer_Sub3_1100.method7221(Class136.aClass136_2625, 128, 128, 16, true, var2);
         }

         return this.aClass54_1096 != null;
      }
   }

   public boolean method562() {
      return this.aBoolean_1095?this.aClass54_1097 != null:this.aClass384Array_1098 != null;
   }

   static void method563() {
      byte[] var1;
      if(anObject_1101 == null) {
         Class333_Sub1_Sub1 var0 = new Class333_Sub1_Sub1();
         var1 = var0.method878(128, 128, 16);
         anObject_1101 = Class89.method1184(var1, false, (short)-11978);
      }

      if(anObject_1102 == null) {
         Class333_Sub2_Sub2 var2 = new Class333_Sub2_Sub2();
         var1 = var2.method1050(128, 128, 16);
         anObject_1102 = Class89.method1184(var1, false, (short)9436);
      }

   }
}
