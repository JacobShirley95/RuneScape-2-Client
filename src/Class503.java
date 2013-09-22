
public class Class503 {

   static int anInt_9107 = 1692802629;
   public static ConnectionDesc aConnectionDesc_9108;
   public static ConnectionDesc aConnectionDesc_9109;
   public static ConnectionDesc aConnectionDesc_9110;
   public static boolean aBoolean_9111 = false;
   static ByteArrayDataNode aClass240_Sub8_9112;
   static RSWorld[] rsWorldList = new RSWorld[0];
   public static ConnectionDesc lobbyConnectionDesc;
   static int loadedServersCount = 0;
   static RSServer aClass575_9116 = null;
   public static boolean aBoolean_9117 = false;


   Class503() throws Throwable {
      throw new Error();
   }

   static void method5854(String[] var0, byte var1) {
      if(var0.length > 1) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            if(var0[var2].startsWith("pause")) {
               int var3 = 5;

               try {
                  var3 = Integer.parseInt(var0[var2].substring(6));
               } catch (Exception var5) {
                  ;
               }

               Class19.addStringToConsole("Pausing for " + var3 + " seconds...", 651012733);
               Class505.aStringArray_9123 = var0;
               Class194.anInt_3356 = (var2 + 1) * -2050923467;
               Class194.timeStamp = (Class373.getCurrentTime((short)21416) + (long)(var3 * 1000)) * 6699129404184534279L;
               return;
            }

            Class194.aString_3361 = var0[var2];
            Class604.method6514(false, (byte)-128);
         }
      } else {
         Class194.aString_3361 = Class194.aString_3361 + var0[0];
         Class194.anInt_3363 += var0[0].length() * 1782055083;
      }

   }

   static final void method5855(byte var0) {
      Class133.aClass565_2603.method6225(1297884269);
      PlayerComposite.aClass530_9858.method6026((byte)48);
      Class598.aClass71_9878.method817(1493795351);
      client.aClass296_348.method3755(-271335010).method6020(62846298);
      Class104_Sub6.characterUnpacker.method5674(-1215330270);
      Class592.cacheObjectLoader.method5580(2074906023);
      Class88.animeUnpacker.method3367(838210873);
      Class75.aClass558_1422.method6163((byte)-94);
      Class603.aClass212_Sub2_9897.method7526(917538628);
      Class104_Sub14.aClass212_Sub1_Sub1_10688.method1137(-2083219740);
      AbstractServerConnection.aClass212_Sub1_Sub2_4038.method1309(-1919105278);
      Class522.aClass212_Sub1_Sub2_9259.method1309(-1906386095);
      Class124.aClass212_Sub1_Sub2_2349.method1309(-2049564358);
      RandomAccessFileNode.aClass255_9018.method3345((byte)-31);
      Class520.aClass445_9243.method5488(-90510587);
      Class126.mapIconUnpacker.method6603((short)1519);
      Class240_Sub1.aClass465_6506.method5613(-296471849);
      Class585.aClass236_9731.method3060(1390868590);
      Class598.aClass44_9877.method409(456233589);
      Class181.aClass450_3106.method5521(602032714);
      AbstractKeyboardHandler.aClass457_4262.method5550(-2042116770);
      Class578.damageAnimeLoader.method6647(799481794);
      Class301.aClass251_6005.method3289((byte)3);
      Class593.method6425((byte)1);
      Class577.method6301(972506497);
      Class368.aFontUnpacker_6922.method4137((byte)-111);
      Class276.method3612(1087829233);
      Class25.method153(782340726);
      client.aClass627_329.method6665((byte)5);
      Class18.aClass627_176.method6665((byte)5);
      Class556.aClass627_9546.method6665((byte)5);
   }

   static final void method5856(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.aBoolean_1282?1:0;
   }

   static ByteArrayDataNode method5857(int var0) {
      ByteArrayDataNode var1 = Class104_Sub19.method7391(555623645);
      var1.putLong(0L);
      var1.putString(Class11.aString_93, (byte)-128);
      var1.putLong(Class11.aLong_91 * -1251008409103092815L);
      var1.putLong(5592818059484599311L * client.aLong_310);
      var1.method4504(Class16.aBigInteger_137, Class16.aBigInteger_135, (byte)-17);
      return var1;
   }
}
