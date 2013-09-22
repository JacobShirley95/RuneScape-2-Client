
public class Class416 implements Class189 {

   String aString_7901;
   Class212_Sub2 aClass212_Sub2_7902;
   public Class187 aClass187_7903;
   int anInt_7904;
   int anInt_7905;
   public int anInt_7906;
   static int[] anIntArray_7907 = new int[32];


   void method5144(ByteArrayDataNode var1, boolean var2, byte var3) {
      while(true) {
         int var4 = var1.readByte(1901653009);
         if(0 == var4) {
            return;
         }

         this.method5145(var1, var4, var2, (byte)-26);
      }
   }

   void method5145(ByteArrayDataNode var1, int var2, boolean var3, byte var4) {
      Class417 var5 = (Class417)Class559.method6185(Class80.method1059((byte)0), var2, (byte)16);
      switch(var5.anInt_7927 * -1599101413) {
      case 1:
         this.anInt_7904 = var1.readByte(701492122) * -1573666681;
         this.anInt_7905 = var1.readByte(1710698726) * 374306827;
         break;
      case 4:
         int var6 = var1.readByte(902668862);
         Class283 var7 = (Class283)Class559.method6185(Class283.method3664((short)-978), var6, (byte)66);
         if(null == var7) {
            throw new IllegalStateException("");
         }

         int var8 = var1.method4493(-157074556);
         Class212_Sub1 var9 = (Class212_Sub1)this.aClass212_Sub2_7902.aMap_10907.get(var7);
         if(var9 != null) {
            this.aClass187_7903 = var9.method5503(var8, 824148490);
         } else if(!var3) {
            throw new IllegalStateException("");
         }
      case 10:
      }

   }

   public int method5146(int var1, byte var2) {
      int var3 = anIntArray_7907[this.anInt_7905 * -1538174045 - 1571358007 * this.anInt_7904];
      return var1 >> 1571358007 * this.anInt_7904 & var3;
   }

   public int method5147(int var1, int var2, byte var3) throws Exception_Sub3 {
      int var4 = anIntArray_7907[this.anInt_7905 * -1538174045 - 1571358007 * this.anInt_7904];
      if(var2 >= 0 && var2 <= var4) {
         var4 <<= this.anInt_7904 * 1571358007;
         return var1 & ~var4 | var2 << 1571358007 * this.anInt_7904 & var4;
      } else {
         throw new Exception_Sub3(this.aString_7901, var2, var4);
      }
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         anIntArray_7907[var1] = var0 - 1;
         var0 += var0;
      }

   }

   public static int getCacheFileCount(int var0) {
      if(-1335147777 * CacheFileID.cacheFileCount == -1) {
         CacheFileID[] var1 = Class1024.method2087(-48615080);

         for(int var2 = 0; var2 < var1.length; ++var2) {
            CacheFileID var3 = var1[var2];
            if(-1494442179 * var3.id > -1335147777 * CacheFileID.cacheFileCount) {
               CacheFileID.cacheFileCount = -12424765 * var3.id;
            }
         }

         CacheFileID.cacheFileCount += 1628159231;
      }

      return CacheFileID.cacheFileCount * -1335147777;
   }

   static final void method5149(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class240_Sub16 var3 = (Class240_Sub16)client.widgets.getNode((long)var2);
      if(var3 != null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method5150(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class470 var3 = Class493.aClass466_9034.method5614(var2, (byte)18);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.method5653(1516402115);
   }

   static final void method5151(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub6_7305.method1559(2092143397);
   }

   static String genRelativeColours(int var0, int var1, int var2) {
      int var3 = var1 - var0;
      return var3 < -9?Class133.addTextColour(16711680, (byte)6):(var3 < -6?Class133.addTextColour(16723968, (byte)6):(var3 < -3?Class133.addTextColour(16740352, (byte)6):(var3 < 0?Class133.addTextColour(16756736, (byte)6):(var3 > 9?Class133.addTextColour('\uff00', (byte)6):(var3 > 6?Class133.addTextColour(4259584, (byte)6):(var3 > 3?Class133.addTextColour(8453888, (byte)6):(var3 > 0?Class133.addTextColour(12648192, (byte)6):Class133.addTextColour(16776960, (byte)6))))))));
   }

   static Class240_Sub46 method5153(int var0, boolean var1, byte var2) {
      long var3 = (long)(var0 | (var1?Integer.MIN_VALUE:0));
      return (Class240_Sub46)Class240_Sub46.aNodeArrayList_7651.getNode(var3);
   }

   public static final void method5154(boolean var0, byte var1) {
      if(!var0) {
         Class133.aClass565_2603.method6224(2064299373);
         PlayerComposite.aClass530_9858.method6028(1006391427);
         Class598.aClass71_9878.method816(2071015239);
         client.aClass296_348.method3755(-2063360809).method6014(-970809111);
         Class104_Sub6.characterUnpacker.method5672((byte)1);
         Class592.cacheObjectLoader.method5573(-17848623);
         Class88.animeUnpacker.method3369(-792026419);
         Class75.aClass558_1422.method6161(564615533);
         Class603.aClass212_Sub2_9897.method7528(-131072);
         Class104_Sub14.aClass212_Sub1_Sub1_10688.method1136((byte)103);
         AbstractServerConnection.aClass212_Sub1_Sub2_4038.method1307((byte)-15);
         Class522.aClass212_Sub1_Sub2_9259.method1307((byte)34);
         Class124.aClass212_Sub1_Sub2_2349.method1307((byte)78);
         RandomAccessFileNode.aClass255_9018.method3342(-86162689);
         Class520.aClass445_9243.method5486(-1045382574);
         Class126.mapIconUnpacker.method6601(613044169);
         Class240_Sub1.aClass465_6506.method5611((byte)53);
         Class585.aClass236_9731.method3058((byte)-119);
         Class598.aClass44_9877.method408((byte)3);
         Class181.aClass450_3106.method5518((byte)1);
         AbstractKeyboardHandler.aClass457_4262.method5548(-1953769797);
         Class578.damageAnimeLoader.method6646((byte)-117);
         Class301.aClass251_6005.method3288(-1128168079);
         Class633.method6702(-2036258985);
         Class21.method127(1861972814);
         Class368.aFontUnpacker_6922.method4140(904133234);
         Class66.method679(178989111);
         if(Class554.aClass554_9529 != Class209.currentGameMode) {
            for(int var2 = 0; var2 < Class231_Sub5.aByteArrayArray_8270.length; ++var2) {
               Class231_Sub5.aByteArrayArray_8270[var2] = null;
            }

            client.anInt_299 = 0;
         }

         client.aClass296_348.method3754(-1354103525).method6376(-1970199856);
         Class591.method6408(2052771362);
         Class411.method5077(364036517);
         Class476.method5685(1697199757);
         Class113.method1457(-629298396);
         Class556.aClass627_9546.method6669(-1572794466);
         client.aClass627_329.method6669(140341336);
         Class18.aClass627_176.method6669(1527694930);
      }

      Class181.method2259((byte)-58);
      Class29.method212(1349963823);
   }
}
