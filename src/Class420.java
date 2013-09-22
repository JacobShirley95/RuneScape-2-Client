
public class Class420 {

   public int[] anIntArray_7966;
   public Class240_Sub22_Sub16 aClass240_Sub22_Sub16_7967;
   public int anInt_7968;


   static void method5235(RSInterfaceGroup var0, RSInterface var1, byte var2) {
      if(null != var1) {
         int var4;
         if(-1 != -1001687885 * var1.anInt_2428) {
            RSInterface var3 = var0.getChildInterface(var1.parentID * -671235497, 710573889);
            if(var3 != null) {
               if(var3.aClass132Array_2579 == var3.children) {
                  var3.children = new RSInterface[var3.aClass132Array_2579.length];
                  var3.children[var3.children.length - 1] = var1;
                  Class543.method6091(var3.aClass132Array_2579, 0, var3.children, 0, var1.anInt_2428 * -1001687885);
                  Class543.method6091(var3.aClass132Array_2579, var1.anInt_2428 * -1001687885 + 1, var3.children, -1001687885 * var1.anInt_2428, var3.aClass132Array_2579.length - -1001687885 * var1.anInt_2428 - 1);
               } else {
                  var4 = 0;

                  RSInterface[] var5;
                  for(var5 = var3.children; var4 < var5.length && var1 != var5[var4]; ++var4) {
                     ;
                  }

                  if(var4 >= var5.length) {
                     return;
                  }

                  Class543.method6091(var5, 1 + var4, var5, var4, var5.length - var4 - 1);
                  var5[var3.children.length - 1] = var1;
               }
            }
         } else {
            RSInterface[] var6 = var0.method1436(1314164320);

            for(var4 = 0; var4 < var6.length && var1 != var6[var4]; ++var4) {
               ;
            }

            if(var4 >= var6.length) {
               return;
            }

            Class543.method6091(var6, 1 + var4, var6, var4, var6.length - var4 - 1);
            var6[var6.length - 1] = var1;
         }
      }

   }

   static final void method5236(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 2142376247 * var3.itemID;
   }

   static final void method5237(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      int var3 = client.aClass301Array_286[var2].method3816(448210513);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3 == 1?1:0;
   }

   static final void method5238(RSInterfaceData var0, int var1) {
      Class332.aClass332_6413.method4108((byte)-39);
   }

   static final void method5239(RSInterfaceData var0, byte var1) {
      ScreenCharText var2 = var0.animeTarget.getRecentChatMessage((short)-7279);
      if(var2 == null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2.method3924((byte)11);
      }

   }
}
