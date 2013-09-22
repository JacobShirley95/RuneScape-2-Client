
public abstract class Class502 {

   protected int anInt_9090 = 1594033647;
   public static final int anInt_9091 = 512;
   public static final int anInt_9092 = 32;
   public static final int anInt_9093 = 4;
   public static final int anInt_9094 = 64;
   public static final int anInt_9095 = 256;
   public static final int anInt_9096 = 4096;
   public static final int anInt_9097 = 2048;
   public static final int anInt_9098 = 16;
   protected int anInt_9099 = 810405699;
   protected int anInt_9100 = -1943272093;
   protected int anInt_9101 = -1970765167;
   public static final int anInt_9102 = 2;
   protected int flags;
   protected int anInt_9104;
   protected int setting;
   public static CacheDataUnpacker aCacheUnpacker_9106;


   public int getSetting() {
      return 1714443051 * this.setting;
   }

   static final void method5851(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapOverviewNode var3 = Class248.method3157(var2);
      if(null == var3) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1801996141 * var3.mapArea >> 14 & 16383;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.mapArea * 1801996141 & 16383;
      }

   }

   static char method5852(char var0, LanguagePack var1, int var2) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if(var0 == 199) {
            return 'C';
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if(var0 == 209 && var1 != LanguagePack.aClass526_9283) {
            return 'N';
         }

         if(var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if(var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if(221 == var0) {
            return 'Y';
         }

         if(223 == var0) {
            return 's';
         }

         if(var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if(231 == var0) {
            return 'c';
         }

         if(var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if(var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if(var0 == 241 && LanguagePack.aClass526_9283 != var1) {
            return 'n';
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if(253 == var0 || var0 == 255) {
            return 'y';
         }
      }

      return 338 == var0?'O':(339 == var0?'o':(376 == var0?'Y':var0));
   }

   public static int method5853(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if(var5 <= 127) {
            ++var3;
         } else if(var5 <= 2047) {
            var3 += 2;
         } else {
            var3 += 3;
         }
      }

      return var3;
   }
}
