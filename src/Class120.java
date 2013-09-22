
public class Class120 {

   Class121 aClass121_2111;
   String aString_2112;
   int anInt_2113 = -743149895;
   Class121 aClass121_2114;
   String aString_2115;
   public int[] anIntArray_2116;
   public int[] anIntArray_2117;


   void method1512(Class129 var1, int var2) {
      int var3 = var1.method1663(-1611443095);
      this.aClass121_2114 = Class563_Sub1_Sub3_Sub2.method5366(-889647675)[var3];
      int var4;
      if(Class121.aClass121_2126 == this.aClass121_2114) {
         var4 = var1.method1663(-1611443095);
         this.aClass121_2111 = Class563_Sub1_Sub3_Sub2.method5366(-927079088)[var4];
         this.anInt_2113 = var1.method1663(-1611443095) * 743149895;
      }

      this.aString_2112 = var1.method1664(1985144878);
      this.aString_2115 = var1.method1664(2068569461);
      var4 = var1.method1663(-1611443095);
      this.anIntArray_2116 = new int[var4];
      this.anIntArray_2117 = new int[var4];

      for(int var5 = 0; var5 < var4; ++var5) {
         this.anIntArray_2116[var5] = var1.method1663(-1611443095);
         this.anIntArray_2117[var5] = var1.method1663(-1611443095);
      }

   }

   static final void method1513(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      int[] var5 = Class557.extractInterfaceIntData(var4, var2, 2129971457);
      if(null != var5) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2543 = Class133.extractInterfaceData(var4, var2, (byte)92);
      var0.anIntArray_2544 = var5;
      var0.aBoolean_2524 = true;
   }

   static final void method1514(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(Class8.aString_42 != null && Class8.aString_42.equalsIgnoreCase(var2)) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static byte method1515(char var0, int var1) {
      byte var2;
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(8364 == var0) {
            var2 = -128;
         } else if(var0 == 8218) {
            var2 = -126;
         } else if(402 == var0) {
            var2 = -125;
         } else if(var0 == 8222) {
            var2 = -124;
         } else if(var0 == 8230) {
            var2 = -123;
         } else if(8224 == var0) {
            var2 = -122;
         } else if(8225 == var0) {
            var2 = -121;
         } else if(var0 == 710) {
            var2 = -120;
         } else if(8240 == var0) {
            var2 = -119;
         } else if(var0 == 352) {
            var2 = -118;
         } else if(var0 == 8249) {
            var2 = -117;
         } else if(338 == var0) {
            var2 = -116;
         } else if(var0 == 381) {
            var2 = -114;
         } else if(var0 == 8216) {
            var2 = -111;
         } else if(8217 == var0) {
            var2 = -110;
         } else if(8220 == var0) {
            var2 = -109;
         } else if(var0 == 8221) {
            var2 = -108;
         } else if(var0 == 8226) {
            var2 = -107;
         } else if(var0 == 8211) {
            var2 = -106;
         } else if(8212 == var0) {
            var2 = -105;
         } else if(732 == var0) {
            var2 = -104;
         } else if(var0 == 8482) {
            var2 = -103;
         } else if(353 == var0) {
            var2 = -102;
         } else if(var0 == 8250) {
            var2 = -101;
         } else if(339 == var0) {
            var2 = -100;
         } else if(382 == var0) {
            var2 = -98;
         } else if(376 == var0) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }

   static final boolean method1516(char var0, byte var1) {
      return var0 == 160 || 32 == var0 || var0 == 95 || var0 == 45;
   }

   public static final void method1517(String var0, int var1) {
      if(var0 != null) {
         if((-1301826725 * client.friendsCount < 200 || client.aBoolean_439) && client.friendsCount * -1301826725 < 200) {
            String var2 = Class606.method6518(var0, Class123.aClass436_2275, -1215862968);
            if(null != var2) {
               int var3;
               String var5;
               String var6;
               for(var3 = 0; var3 < client.friendsCount * -1301826725; ++var3) {
                  FriendPlayer friend = client.friendsList[var3];
                  var5 = Class606.method6518(friend.aString_51, Class123.aClass436_2275, -1215862968);
                  if(var5 != null && var5.equals(var2)) {
                     Class321.method3960(4, var0 + ServerString.alreadyOnFriendsListStr.getText(Class599.clientLanguage, -1146380073), 10182864);
                     return;
                  }

                  if(friend.aString_46 != null) {
                     var6 = Class606.method6518(friend.aString_46, Class123.aClass436_2275, -1215862968);
                     if(var6 != null && var6.equals(var2)) {
                        Class321.method3960(4, var0 + ServerString.alreadyOnFriendsListStr.getText(Class599.clientLanguage, -1092994096), 10182864);
                        return;
                     }
                  }
               }

               for(var3 = 0; var3 < client.ignoreListCount * -275736435; ++var3) {
                  IgnoredPlayer var8 = client.ignoreList[var3];
                  var5 = Class606.method6518(var8.aString_111, Class123.aClass436_2275, -1215862968);
                  if(null != var5 && var5.equals(var2)) {
                     Class321.method3960(4, ServerString.pleaseRemoveStr.getText(Class599.clientLanguage, -288998052) + var0 + ServerString.fromIgnoreListStr.getText(Class599.clientLanguage, 397238629), 10182864);
                     return;
                  }

                  if(var8.aString_112 != null) {
                     var6 = Class606.method6518(var8.aString_112, Class123.aClass436_2275, -1215862968);
                     if(var6 != null && var6.equals(var2)) {
                        Class321.method3960(4, ServerString.pleaseRemoveStr.getText(Class599.clientLanguage, -1709513784) + var0 + ServerString.fromIgnoreListStr.getText(Class599.clientLanguage, 699327591), 10182864);
                        return;
                     }
                  }
               }

               if(Class606.method6518(Class521.myPlayer.playerName, Class123.aClass436_2275, -1215862968).equals(var2)) {
                  Class321.method3960(4, ServerString.aClass482_8910.getText(Class599.clientLanguage, -664051605), 10182864);
               } else {
                  ConnectionHandler var7 = Class32.method230(-1537870423);
                  Class240_Sub27 var9 = Class47_Sub1.method3496(Class326.aClass326_6245, var7.aClass528_3433, 1917447504);
                  var9.aClass240_Sub8_Sub1_7370.putByte(Class258.method3383(var0, -745698793), 2063673679);
                  var9.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-96);
                  var7.addPacket(var9, 2090883411);
               }
            }
         } else {
            Class321.method3960(4, ServerString.aClass482_8798.getText(Class599.clientLanguage, -979262559), 10182864);
         }
      }
   }
}
