
public class Class357 implements Class487 {

   final CacheDataUnpacker aCacheUnpacker_6778;
   static String osName;
   public static int anInt_6780;


   public int method5743(int var1) {
      return this.aCacheUnpacker_6778.method3576((byte)8)?100:this.aCacheUnpacker_6778.method3592(368670512);
   }

   public Class500 method5742(int var1) {
      return Class500.aClass500_9084;
   }

   Class357(CacheDataUnpacker var1) {
      this.aCacheUnpacker_6778 = var1;
   }

   static final void method4547(int var0, int var1, int var2, int var3, Class532 var4, byte var5) {
      if(var2 >= 1 && var3 >= 1 && var2 <= client.aClass296_348.getMaxX((byte)-35) - 2 && var3 <= client.aClass296_348.getMaxY(-1141336328) - 2) {
         if(client.aClass296_348.getWorldObjects() == null) {
            return;
         }

         Class218 var6 = client.aClass296_348.method3760(-1627460703).method5405(var0, var1, var2, var3, 75166702);
         if(var6 != null) {
            if(var6 instanceof Class563_Sub1_Sub4_Sub6) {
               ((Class563_Sub1_Sub4_Sub6)var6).method5334(var4, 18976691);
            } else if(var6 instanceof Class563_Sub1_Sub1_Sub2) {
               ((Class563_Sub1_Sub1_Sub2)var6).method5207(var4, 2012180760);
            } else if(var6 instanceof Class563_Sub1_Sub5_Sub2) {
               ((Class563_Sub1_Sub5_Sub2)var6).method5244(var4, (byte)98);
            } else if(var6 instanceof Class563_Sub1_Sub3_Sub2) {
               ((Class563_Sub1_Sub3_Sub2)var6).method5358(var4, -1477850659);
            }
         }
      }

   }

   static final void method4548(RSInterfaceData var0, int var1) {
      if(Class104_Sub11.aClass68_10198 != null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
         var0.aClass68_9508 = Class104_Sub11.aClass68_10198;
         var0.aMap_9513.put(Class283.aClass283_4790, Class304.method3836(var0.aClass68_9508, -1345563752));
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static void method4549(boolean var0, byte var1) {
      Class240_Sub19 var2;
      for(var2 = (Class240_Sub19)Class240_Sub19.aNodeList_7144.getBaseNode_2((byte)72); var2 != null; var2 = (Class240_Sub19)Class240_Sub19.aNodeList_7144.getNext(-109968799)) {
         if(null != var2.aClass240_Sub41_Sub5_7170) {
            Class217.aClass240_Sub41_Sub4_3757.method531(var2.aClass240_Sub41_Sub5_7170);
            var2.aClass240_Sub41_Sub5_7170 = null;
         }

         if(var2.aClass240_Sub41_Sub5_7143 != null) {
            Class217.aClass240_Sub41_Sub4_3757.method531(var2.aClass240_Sub41_Sub5_7143);
            var2.aClass240_Sub41_Sub5_7143 = null;
         }

         var2.shiftNext();
      }

      if(var0) {
         for(var2 = (Class240_Sub19)Class240_Sub19.aNodeList_7178.getBaseNode_2((byte)121); null != var2; var2 = (Class240_Sub19)Class240_Sub19.aNodeList_7178.getNext(-342902873)) {
            if(null != var2.aClass240_Sub41_Sub5_7170) {
               Class217.aClass240_Sub41_Sub4_3757.method531(var2.aClass240_Sub41_Sub5_7170);
               var2.aClass240_Sub41_Sub5_7170 = null;
            }

            var2.shiftNext();
         }

         for(var2 = (Class240_Sub19)Class240_Sub19.aNodeArrayList_7146.start(); null != var2; var2 = (Class240_Sub19)Class240_Sub19.aNodeArrayList_7146.next()) {
            if(var2.aClass240_Sub41_Sub5_7170 != null) {
               Class217.aClass240_Sub41_Sub4_3757.method531(var2.aClass240_Sub41_Sub5_7170);
               var2.aClass240_Sub41_Sub5_7170 = null;
            }

            var2.shiftNext();
         }
      }

   }
}
