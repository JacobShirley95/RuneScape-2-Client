
public class Class321 {

   int anInt_6200;
   int anInt_6201;
   int anInt_6202;
   int anInt_6203;
   int anInt_6204;


   Class321(int var1, int var2, int var3, int var4, int var5) {
      this.anInt_6200 = var2 * -1470861345;
      this.anInt_6201 = var3 * 653966371;
      this.anInt_6202 = 800210041 * var4;
      this.anInt_6203 = var5 * -933602419;
      this.anInt_6204 = 456164677 * this.anInt_6203 - this.anInt_6202 * 633490377;
   }

   public static void method3960(int var0, String var1, int var2) {
      Class634.method6708(var0, 0, "", "", "", var1, (byte)54);
   }

   static final void method3961(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 972244665 * var3.anInt_2454;
   }

   static final void method3962(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -661230153;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex] << 1;
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      int var5 = var0.intTypes[3 + -831324111 * var0.intTypeIndex];
      int var6 = var0.intTypes[-831324111 * var0.intTypeIndex + 4];
      int var7 = var0.intTypes[5 + var0.intTypeIndex * -831324111];
      int var8 = var0.intTypes[var0.intTypeIndex * -831324111 + 6];
      if(var2 >= 0 && var2 < 2 && client.anIntArrayArrayArray_399[var2] != null && var3 >= 0 && var3 < client.anIntArrayArrayArray_399[var2].length) {
         client.anIntArrayArrayArray_399[var2][var3] = new int[]{(var4 >> 14 & 16383) << 9, var5 << 2, (var4 & 16383) << 9, var8};
         client.anIntArrayArrayArray_399[var2][var3 + 1] = new int[]{(var6 >> 14 & 16383) << 9, var7 << 2, (var6 & 16383) << 9};
      }

   }

   static final void method3963(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub27_7315, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], -441806661);
      Class83.method1089(-1670868335);
   }

   static int method3964(NPC var0, int var1) {
      NPCComposite var2 = var0.npcComposite;
      if(null != var2.anIntArray_8642) {
         var2 = var2.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)-119);
         if(var2 == null) {
            return -1;
         }
      }

      int var3 = -1342364935 * var2.anInt_8666;
      Class263 var4 = var0.method3261((short)11827);
      int var5 = var0.stance.getAnimationID(-788115381);
      if(-1 != var5 && !var0.stance.isStationary) {
         if(var5 != var4.anInt_4564 * -424471161 && var4.anInt_4576 * -1174724853 != var5 && var5 != var4.anInt_4561 * -1278757251 && var5 != var4.anInt_4553 * 1034825445) {
            if(var5 == 69768581 * var4.anInt_4568 || var5 == 9421325 * var4.anInt_4563 || var5 == var4.anInt_4569 * 1655148515 || 613044169 * var4.anInt_4595 == var5) {
               var3 = var2.anInt_8673 * -1550124475;
            }
         } else {
            var3 = var2.anInt_8658 * -67160797;
         }
      } else {
         var3 = 809085243 * var2.anInt_8606;
      }

      return var3;
   }

   public static void method3965(int var0, byte var1) {
      Class240_Sub5 var2 = (Class240_Sub5)Class524.aNodeArrayList_9273.getNode((long)var0);
      if(var2 != null) {
         var2.aBoolean_6759 = !var2.aBoolean_6759;
         var2.aClass254_Sub1_6754.method3324(var2.aBoolean_6759, -1216903177);
      }

   }
}
