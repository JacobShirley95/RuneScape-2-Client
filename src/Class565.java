
public class Class565 {

   public int anInt_9606 = 0;
   public int anInt_9607;
   final CacheNodeArrayList aClass627_9608 = new CacheNodeArrayList(64);
   final CacheDataUnpacker aCacheUnpacker_9609;


   public Class571 method6222(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_9608;
      Class571 var4;
      synchronized(this.aClass627_9608) {
         var4 = (Class571)this.aClass627_9608.getObject((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_9609;
         byte[] var11;
         synchronized(this.aCacheUnpacker_9609) {
            var11 = this.aCacheUnpacker_9609.getDataBytes(Class124.aClass124_2280.anInt_2347 * -851327023, var1, 384509110);
         }

         var4 = new Class571();
         var4.aClass565_9635 = this;
         var4.anInt_9636 = 180842909 * var1;
         if(null != var11) {
            var4.method6263(new ByteArrayDataNode(var11), 2000104483);
         }

         var4.method6265((byte)-37);
         CacheNodeArrayList var12 = this.aClass627_9608;
         synchronized(this.aClass627_9608) {
            this.aClass627_9608.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method6223(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_9608;
      synchronized(this.aClass627_9608) {
         this.aClass627_9608.method6677(var1, -1307800624);
      }
   }

   public void method6224(int var1) {
      CacheNodeArrayList var2 = this.aClass627_9608;
      synchronized(this.aClass627_9608) {
         this.aClass627_9608.method6669(459206878);
      }
   }

   public Class565(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_9609 = var3;
      this.anInt_9607 = this.aCacheUnpacker_9609.method3575(Class124.aClass124_2280.anInt_2347 * -851327023, -2031310851) * -797595643;
   }

   public void method6225(int var1) {
      CacheNodeArrayList var2 = this.aClass627_9608;
      synchronized(this.aClass627_9608) {
         this.aClass627_9608.method6665((byte)5);
      }
   }

   static final void method6226(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      if(var3.aString_2514 == null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_2514;
      }

   }

   static final void method6227(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      LanguagePack.method5999(var2, false, -987346258);
   }

   public static Class409 method6228(ByteArrayDataNode var0, int var1) {
      Class409 var2 = Class246.method3140(var0, (short)-14354);
      int var3 = var0.method4480(1260717178);
      int var4 = var0.method4480(1260717178);
      int var5 = var0.method4493(-157074556);
      return new Class409_Sub2(var2.aClass419_7760, var2.aClass412_7761, 1684132453 * var2.anInt_7762, var2.anInt_7766 * 731209435, 1912610703 * var2.anInt_7764, var2.anInt_7765 * 1854937727, -138079065 * var2.anInt_7763, var2.anInt_7767 * 1909120553, var2.anInt_7768 * 2062892803, var3, var4, var5);
   }

   static void method6229(String var0, int var1) {
      client.aString_273 = var0;
      if(Class363.method4614(948376877) != Class224.aClass224_3843) {
         try {
            String var2 = Class481.clientApplet.getParameter(ParameterNode.aClass424_8058.parameterStringIndex);
            String var3 = Class481.clientApplet.getParameter(ParameterNode.aClass424_8039.parameterStringIndex);
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            if(var0.length() == 0) {
               var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               var4 = var4 + "; Expires=" + Class278.method3622(Class373.getCurrentTime((short)28619) + 94608000000L) + "; Max-Age=" + 94608000L;
            }

            Class480.method5703(Class481.clientApplet, "document.cookie=\"" + var4 + "\"", (byte)2);
         } catch (Throwable var5) {
            ;
         }

      }
   }

   static boolean method6230(int var0, byte var1) {
      return 44 == var0 || 45 == var0 || 46 == var0 || var0 == 47 || 48 == var0 || 49 == var0 || 50 == var0 || 51 == var0 || var0 == 52 || var0 == 53 || var0 == 15;
   }

   static final void method6231(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      boolean var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1;
      Class124.method1580(var2, var3, 1801909928);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -2050929757 * Class357.anInt_6780;
   }
}
