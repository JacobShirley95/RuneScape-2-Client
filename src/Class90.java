import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class90 {

   static final HashMap aHashMap_1820 = new HashMap();
   public static final long aLong_1821 = 1000L;
   static Map aMap_1822;
   static int[] furthestPositions;


   public static String method1190(Date var0, String var1, int var2) {
      return method1191(var0, var1, method1192(1651993099), LanguagePack.aClass526_9276, (byte)43);
   }

   static String method1191(Date var0, String var1, TimeZone var2, LanguagePack var3, byte var4) {
      if(aMap_1822 == null) {
         aMap_1822 = new HashMap(7);
         LanguagePack[] var5 = LanguagePack.method5997(-1931714265);

         for(int var6 = 0; var6 < var5.length; ++var6) {
            LanguagePack var7 = var5[var6];
            aMap_1822.put(var7, new ConcurrentLinkedQueue());
         }
      }

      ConcurrentLinkedQueue var8 = (ConcurrentLinkedQueue)aMap_1822.get(var3);
      SimpleDateFormat var9 = (SimpleDateFormat)var8.poll();
      if(null == var9) {
         var9 = new SimpleDateFormat(var1, var3.method5998((byte)-33));
      } else {
         var9.applyPattern(var1);
      }

      var9.setTimeZone(var2);
      String var10 = var9.format(var0);
      var8.add(var9);
      return var10;
   }

   static TimeZone method1192(int var0) {
      return method1193("Europe/London", (short)-26278);
   }

   static TimeZone method1193(String var0, short var1) {
      HashMap var2 = aHashMap_1820;
      synchronized(aHashMap_1820) {
         TimeZone var3 = (TimeZone)aHashMap_1820.get(var0);
         if(null == var3) {
            var3 = TimeZone.getTimeZone(var0);
            aHashMap_1820.put(var0, var3);
         }

         return var3;
      }
   }

   static {
      Calendar.getInstance(method1193("Europe/London", (short)-25113));
   }

   Class90() throws Throwable {
      throw new Error();
   }

   static void method1194(ByteArrayDataNode_Sub1 var0, int var1) {
      var0.putIntBE(Class508_Sub2.aCacheUnpacker_2121.method3564(-1716717352), 2062892803);
      var0.putIntBE(Class306.aCacheUnpacker_6037.method3564(847886679), 2062892803);
      var0.putIntBE(UpdateServerConnector.aCacheUnpacker_7708.method3564(-1695219833), 2062892803);
      var0.putIntBE(Class275.aCacheUnpacker_4725.method3564(-52255912), 2062892803);
      var0.putIntBE(Class431.aCacheUnpacker_8325.method3564(672352503), 2062892803);
      var0.putIntBE(Class293.cacheFile5Unpacker.method3564(911726149), 2062892803);
      var0.putIntBE(GraphicsDataHolder.aCacheUnpacker_9212.method3564(448993228), 2062892803);
      var0.putIntBE(Class240_Sub22_Sub1.aCacheUnpacker_801.method3564(2078804694), 2062892803);
      var0.putIntBE(Class301.mmUnpacker.method3564(305875793), 2062892803);
      var0.putIntBE(Class231_Sub5.aCacheUnpacker_8271.method3564(-775695090), 2062892803);
      var0.putIntBE(Class188.aCacheUnpacker_3204.method3564(639033612), 2062892803);
      var0.putIntBE(Class66.aCacheUnpacker_1257.method3564(-272996263), 2062892803);
      var0.putIntBE(Class215.aCacheUnpacker_3739.method3564(1150943053), 2062892803);
      var0.putIntBE(Class5.aCacheUnpacker_31.method3564(-738947953), 2062892803);
      var0.putIntBE(Class437.aCacheUnpacker_8384.method3564(-722265926), 2062892803);
      var0.putIntBE(Class361.aCacheUnpacker_6799.method3564(1896862730), 2062892803);
      var0.putIntBE(Class119.aCacheUnpacker_2110.method3564(-1233078044), 2062892803);
      var0.putIntBE(Class312.aCacheUnpacker_6101.method3564(297607860), 2062892803);
      var0.putIntBE(Class540_Sub28.aCacheUnpacker_6563.method3564(874351061), 2062892803);
      var0.putIntBE(Class585.aCacheUnpacker_9729.method3564(1898354202), 2062892803);
      var0.putIntBE(Class585.aCacheUnpacker_9730.method3564(1190994591), 2062892803);
      var0.putIntBE(Class100.aCacheUnpacker_1956.method3564(2106711673), 2062892803);
      var0.putIntBE(Class527.aCacheUnpacker_9294.method3564(1757228782), 2062892803);
      var0.putIntBE(CacheDownload.cache23Unpacker.method3564(1123358928), 2062892803);
      var0.putIntBE(Class501.aCacheUnpacker_9089.method3564(-1594392681), 2062892803);
      var0.putIntBE(Class283_Sub3.aCacheUnpacker_7896.method3564(-1501218325), 2062892803);
      var0.putIntBE(Class317.aCacheUnpacker_6164.method3564(1759155238), 2062892803);
      var0.putIntBE(Class502.aCacheUnpacker_9106.method3564(-1952048514), 2062892803);
      var0.putIntBE(Class278.aCacheUnpacker_4737.method3564(-132698764), 2062892803);
      var0.putIntBE(Class457.aCacheUnpacker_8569.method3564(-552258520), 2062892803);
      var0.putIntBE(Class39.aCacheUnpacker_867.method3564(-1429571282), 2062892803);
      var0.putIntBE(Class465.aCacheUnpacker_8678.method3564(531177354), 2062892803);
      var0.putIntBE(Class600.method6489((byte)-76), 2062892803);
      var0.putIntBE(FontRenderer.method1080(-509677085), 2062892803);
      var0.putIntBE(Class80.aCacheUnpacker_1532.method3564(418735726), 2062892803);
      var0.putIntBE(Class222.aCacheUnpacker_3821.method3564(-1651448999), 2062892803);
      var0.putIntBE(Class97.aCacheUnpacker_1925.method3564(1720365893), 2062892803);
   }

   public static int[] method1195(int var0) {
      return new int[]{Class1.p11_fullOffset * -1888224497, Class1.p12_fullOffset * -151545987, 511971595 * Class1.p13_fullOffset};
   }

   static final void method1196(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.particlesSetting, var2, 1741746096);
      Class83.method1089(-812287876);
      client.aBoolean_568 = false;
   }

   static final void method1197(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aClass301Array_286[var2].anInt_6002 * 331878277;
   }

   static final void method1198(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
   }
}
