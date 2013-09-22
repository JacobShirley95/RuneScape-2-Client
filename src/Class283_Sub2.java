
final class Class283_Sub2 extends Class283 {

   static OptionListNode aClass240_Sub22_Sub3_7729;


   Class283_Sub2(Class124 var1, int var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4, (Class283_Sub5)null);
   }

   Object method3666(Class187 var1, int var2) {
      return Class373.aClass373_7004 == var1.aClass373_3197?Integer.valueOf(-1):var1.aClass373_3197.method4743(-186758304);
   }

   public static void method5016(int var0, int var1, int var2) {
      Class35.method273(var0, var1, -933134308);
   }

   public static Class430 method5017(ByteArrayDataNode var0, int var1) {
      int var2 = var0.method4493(-157074556);
      Class419 var3 = Class130.method1672(315620243)[var0.readByte(1391019253)];
      Class412 var4 = GamePack.method5981(-286897589)[var0.readByte(2022291662)];
      int var5 = var0.method4478((byte)1);
      int var6 = var0.method4478((byte)1);
      return new Class430(var2, var3, var4, var5, var6);
   }

   public static final int method5018(Class529 var0, byte[] var1, int x, int y, int var4, int var5, Class580 var6, Class580 var7, int var8) {
      int var9 = 0;
      ByteArrayDataNode var10 = new ByteArrayDataNode(var1);
      int var11 = -1;

      while(true) {
         int var12 = var10.method4491(-1664913340);
         if(var12 == 0) {
            return var9;
         }

         var11 += var12;
         int var13 = 0;
         boolean var14 = false;

         while(true) {
            int var15;
            if(var14) {
               var15 = var10.method4490((byte)0);
               if(0 == var15) {
                  break;
               }

               var10.readByte(757224647);
            } else {
               var15 = var10.method4490((byte)0);
               if(0 == var15) {
                  break;
               }

               var13 += var15 - 1;
               int var16 = var13 & 63;
               int var17 = var13 >> 6 & 63;
               int var18 = var10.readByte(800055322) >> 2;
               int var19 = var17 + x;
               int var20 = var16 + y;
               if(var19 > 0 && var20 > 0 && var19 < var4 - 1 && var20 < var5 - 1) {
                  Class534 var21 = var0.method6015(var11, (byte)1);
                  if(var18 != Class495.aClass495_9061.anInt_9062 * -1965975883 || Class104_Sub21.renderSettings.aClass540_Sub18_7280.method4005((byte)54) != 0 || 0 != var21.anInt_9380 * 166485479 || 1 == -69502263 * var21.anInt_9379 || var21.aBoolean_9411) {
                     if(!var21.method6056(var7, (short)-22381)) {
                        var6.anInt_9703 = 852119785 * var11;
                        ++var9;
                     }

                     var14 = true;
                  }
               }
            }
         }
      }
   }

   static final void method5019(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class552 var4;
      if(var0.aBoolean_9522) {
         var4 = var0.aClass552_9506;
      } else {
         var4 = var0.aClass552_9492;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4.method6121(var0.animeTarget.headInterfaces, var2, var3, -409506390)?1:0;
   }
}
