
final class Class127 implements Class42 {

   public long method347(String var1, int var2) {
      return Class630.method6693(var1, (byte)42);
   }

   static final void method1634(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.aBoolean_2574 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      Class110_Sub1.method3149(var0, 1075612194);
   }

   static final void method1635(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      int var4 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      --var4;
      if(null != var3.options && var4 < var3.options.length && var3.options[var4] != null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.options[var4];
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   static final void method1636(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      if(Class506.aBoolean_9125) {
         Class522.method5974(3, var2, var3, false, -1857205224);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class102.aFrame_1967 != null?1:0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method1637(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub17_7299.method6082(var2, 1839681151);
   }

   static final void method1638(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      int var3 = Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-970739849);
      if(var2 != var3) {
         if(Class547.method6103(client.loginStage * -243034353, -611725879)) {
            if(var3 == 0 && -528571831 * Class217.anInt_3752 != -1) {
               Class243.method3122(GraphicsDataHolder.aCacheUnpacker_9212, Class217.anInt_3752 * -528571831, 0, var2, false, (byte)-108);
               Class134.method1792(347103932);
               Class217.aBoolean_3748 = false;
            } else if(var2 == 0) {
               Class586.method6365((short)353);
               Class217.aBoolean_3748 = false;
            } else {
               Class326.method4015(var2, 123191206);
            }
         }

         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub14_7323, var2, 1597809797);
         Class83.method1089(-843030287);
         client.aBoolean_568 = false;
      }

   }

   static final void method1639(RSInterfaceData var0, short var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1977925755 * Class11.anInt_106;
   }
}
