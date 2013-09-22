import java.util.Locale;

public class LanguagePack implements Class551 {

   public static final LanguagePack aClass526_9276 = new LanguagePack("EN", "en", "English", Class554.aClass554_9529, 0, "GB");
   public static final LanguagePack aClass526_9277 = new LanguagePack("DE", "de", "German", Class554.aClass554_9529, 1, "DE");
   public static final LanguagePack aClass526_9278 = new LanguagePack("FR", "fr", "French", Class554.aClass554_9529, 2, "FR");
   final String aString_9279;
   static final LanguagePack aClass526_9280 = new LanguagePack("NL", "nl", "Dutch", Class554.aClass554_9530, 4, "NL");
   public static final LanguagePack aClass526_9281 = new LanguagePack("PT", "pt", "Portuguese", Class554.aClass554_9529, 3, "BR");
   public static final LanguagePack aClass526_9282 = new LanguagePack("ES_MX", "es-mx", "Spanish (Latin American)", Class554.aClass554_9530, 6, "MX");
   public static final LanguagePack aClass526_9283 = new LanguagePack("ES", "es", "Spanish", Class554.aClass554_9530, 5, "ES");
   public static final int anInt_9284 = 7;
   final String getLocaleName;
   public final int languageID;
   final Locale aLocale_9287;
   static final LanguagePack[] aClass526Array_9288;
   static int anInt_9289;


   static final void method5992(RSInterfaceData var0, short var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class240_Sub16 var4 = (Class240_Sub16)client.widgets.getNode((long)var2);
      if(var4 != null && var3 == var4.widgetID * 1320796941) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public String getLocaleName(int var1) {
      return this.getLocaleName;
   }

   public int getLanguageID(int var1) {
      return this.languageID * -1663699585;
   }

   public static LanguagePack selectLanguage(int var0, int var1) {
      return var0 >= 0 && var0 < aClass526Array_9288.length?aClass526Array_9288[var0]:null;
   }

   public String toString() {
      return this.getLocaleName(-1633276375).toLowerCase(Locale.ENGLISH);
   }

   static {
      LanguagePack[] var0 = method5997(-195454209);
      aClass526Array_9288 = new LanguagePack[var0.length];
      LanguagePack[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         LanguagePack var3 = var1[var2];
         if(aClass526Array_9288[var3.languageID * -1663699585] != null) {
            throw new IllegalStateException();
         }

         aClass526Array_9288[var3.languageID * -1663699585] = var3;
      }

   }

   public static LanguagePack[] method5997(int var0) {
      return new LanguagePack[]{aClass526_9281, aClass526_9280, aClass526_9276, aClass526_9282, aClass526_9283, aClass526_9277, aClass526_9278};
   }

   LanguagePack(String var1, String var2, String var3, Class554 var4, int var5, String var6) {
      this.aString_9279 = var1;
      this.getLocaleName = var2;
      this.languageID = -430192001 * var5;
      if(null != var6) {
         this.aLocale_9287 = new Locale(var2.substring(0, 2), var6);
      } else {
         this.aLocale_9287 = new Locale(var2.substring(0, 2));
      }

   }

   public Locale method5998(byte var1) {
      return this.aLocale_9287;
   }

   public static final void method5999(String var0, boolean var1, int var2) {
      if(var0 != null) {
         if(client.ignoreListCount * -275736435 >= 100) {
            Class321.method3960(4, ServerString.aClass482_8879.getText(Class599.clientLanguage, -1548707411), 10182864);
         } else {
            String var3 = Class606.method6518(var0, Class123.aClass436_2275, -1215862968);
            if(null != var3) {
               int var4;
               String var6;
               String var7;
               for(var4 = 0; var4 < client.ignoreListCount * -275736435; ++var4) {
                  IgnoredPlayer ignoredPlayer = client.ignoreList[var4];
                  var6 = Class606.method6518(ignoredPlayer.aString_111, Class123.aClass436_2275, -1215862968);
                  if(null != var6 && var6.equals(var3)) {
                     Class321.method3960(4, var0 + ServerString.aClass482_8909.getText(Class599.clientLanguage, 1071779307), 10182864);
                     return;
                  }

                  if(null != ignoredPlayer.aString_112) {
                     var7 = Class606.method6518(ignoredPlayer.aString_112, Class123.aClass436_2275, -1215862968);
                     if(var7 != null && var7.equals(var3)) {
                        Class321.method3960(4, var0 + ServerString.aClass482_8909.getText(Class599.clientLanguage, -827801047), 10182864);
                        return;
                     }
                  }
               }

               for(var4 = 0; var4 < client.friendsCount * -1301826725; ++var4) {
                  FriendPlayer var9 = client.friendsList[var4];
                  var6 = Class606.method6518(var9.aString_51, Class123.aClass436_2275, -1215862968);
                  if(var6 != null && var6.equals(var3)) {
                     Class321.method3960(4, ServerString.aClass482_8915.getText(Class599.clientLanguage, -1567016324) + var0 + ServerString.aClass482_8885.getText(Class599.clientLanguage, -261074438), 10182864);
                     return;
                  }

                  if(null != var9.aString_46) {
                     var7 = Class606.method6518(var9.aString_46, Class123.aClass436_2275, -1215862968);
                     if(null != var7 && var7.equals(var3)) {
                        Class321.method3960(4, ServerString.aClass482_8915.getText(Class599.clientLanguage, -1677792068) + var0 + ServerString.aClass482_8885.getText(Class599.clientLanguage, -195310817), 10182864);
                        return;
                     }
                  }
               }

               if(Class606.method6518(Class521.myPlayer.playerName, Class123.aClass436_2275, -1215862968).equals(var3)) {
                  Class321.method3960(4, ServerString.aClass482_8911.getText(Class599.clientLanguage, 950524100), 10182864);
               } else {
                  ConnectionHandler var8 = Class32.method230(-1921946329);
                  Class240_Sub27 var10 = Class47_Sub1.method3496(Class326.aClass326_6237, var8.aClass528_3433, 1917447504);
                  var10.aClass240_Sub8_Sub1_7370.putByte(Class258.method3383(var0, -1657299682) + 1, -358269439);
                  var10.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-75);
                  var10.aClass240_Sub8_Sub1_7370.putByte(var1?1:0, 1829546165);
                  var8.addPacket(var10, 673784925);
               }
            }
         }
      }
   }
}
