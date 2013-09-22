
public class RendererInfo {

   public final int vendor;
   public static final int anInt_3068 = 4318;
   public static final int anInt_3069 = 4098;
   public static final int anInt_3070 = -1;
   public static final int anInt_3071 = 32902;
   public final String renderDevice;
   public final String rendererName;
   public final int renderVersion;
   public static final int anInt_3075 = 0;
   public final long deviceVersion;
   static LoadProgress curLoadProgress;
   protected static CacheFile[] cacheFileArray;
   public static int anInt_3079;
   static int anInt_3080;


   public RendererInfo(int var1, String var2, int var3, String var4, long var5) {
      this.vendor = -1198081569 * var1;
      this.rendererName = var2;
      this.renderVersion = var3 * -1053085231;
      this.renderDevice = var4;
      this.deviceVersion = var5 * -7747099285304131949L;
   }

   static final void method2211(RSInterfaceData var0, short var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      String var4 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(var2 == 99) {
         Class19.addStringToConsole(var4, 274840397);
      } else if(98 == var2) {
         RSServer.method6291(var4, -641499215);
      } else {
         Class634.method6708(var2, var3, "", "", "", var4, (byte)102);
      }

   }

   static final void method2212(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub6_7305.method6082(var2, -175511903);
   }

   static void method2213(int var0, int var1, int var2, int var3, int var4) {
      Class240_Sub22_Sub5 var5 = Class65_Sub1_Sub2.method866(20, (long)var1 << 32 | (long)var0);
      var5.method596((byte)119);
      var5.anInt_1175 = 134353971 * var2;
      var5.anInt_1165 = var3 * -771972147;
   }
}
