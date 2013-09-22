
public class Class394 implements Class415 {

   public final int anInt_7560;


   public Class408 method5142(int var1) {
      return Class408.aClass408_7751;
   }

   Class394(int var1) {
      this.anInt_7560 = var1 * 481270085;
   }

   static final void method4927(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      LoadProgress.method4426(var3, var4, var0, 1211058878);
   }

   static final void method4928(RSInterface var0, RSInterfaceData var1, int var2) {
      var1.intTypeIndex -= -1416056414;
      int var3 = var1.intTypes[-831324111 * var1.intTypeIndex] - 1;
      int var4 = var1.intTypes[-831324111 * var1.intTypeIndex + 1];
      if(var3 >= 0 && var3 <= 9) {
         Class370.method4695(var0, var3, var4, var1, 1044451011);
      } else {
         throw new RuntimeException();
      }
   }

   static final void method4929(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      ObjectDescriptor var4 = Class592.cacheObjectLoader.getObjectDescriptor(var2);
      if(var3 >= 1 && var3 <= 5 && var4.screenOptions[var3 - 1] != null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var4.screenOptions[var3 - 1];
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   public static void method4930(int var0, String var1, int var2) {
      int var3 = Class15.availablePlayers * -688404505;
      int[] var4 = Class15.playersIndices;
      boolean var5 = false;

      for(int var6 = 0; var6 < var3; ++var6) {
         Player var7 = client.aPlayerArray[var4[var6]];
         if(var7 != null && Class521.myPlayer != var7 && null != var7.playerName && var7.playerName.equalsIgnoreCase(var1)) {
            Class326 var8 = null;
            if(1 == var0) {
               var8 = Class326.aClass326_6223;
            } else if(4 == var0) {
               var8 = Class326.aClass326_6264;
            } else if(var0 == 5) {
               var8 = Class326.aClass326_6251;
            } else if(var0 == 6) {
               var8 = Class326.aClass326_6292;
            } else if(var0 == 7) {
               var8 = Class326.aClass326_6228;
            } else if(var0 == 9) {
               var8 = Class326.aClass326_6324;
            }

            if(var8 != null) {
               Class240_Sub27 var9 = Class47_Sub1.method3496(var8, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var9.aClass240_Sub8_Sub1_7370.method4507(var4[var6], -1828074049);
               var9.aClass240_Sub8_Sub1_7370.putByte(0, 356768964);
               client.gameConnectionHandler.addPacket(var9, 1087041003);
            }

            var5 = true;
            break;
         }
      }

      if(!var5) {
         Class321.method3960(4, ServerString.unableToFindStr.getText(Class599.clientLanguage, -571776296) + var1, 10182864);
      }

   }
}
