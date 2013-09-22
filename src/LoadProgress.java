
public class LoadProgress {

   static final LoadProgress aClass351_6720 = new LoadProgress(6, ServerString.checkForUpdatesStr, ServerString.checkForUpdatesStr, 5, 98, true, true);
   final int percent;
   static final LoadProgress aClass351_6722 = new LoadProgress(0, ServerString.checkForUpdatesStr, 2);
   static final LoadProgress aClass351_6723 = new LoadProgress(17, ServerString.fetchUpdatesStr, 100);
   static final LoadProgress aClass351_6724 = new LoadProgress(16, ServerString.fetchUpdatesStr, 100);
   static final LoadProgress aClass351_6725 = new LoadProgress(5, ServerString.checkForUpdatesStr, ServerString.checkForUpdatesStr, 4, 5);
   static final LoadProgress aClass351_6726 = new LoadProgress(7, ServerString.checkForUpdatesStr, 99);
   static final LoadProgress aClass351_6727 = new LoadProgress(12, ServerString.fetchUpdatesStr, ServerString.fetchUpdatesStr, 96, 97);
   static final LoadProgress aClass351_6728 = new LoadProgress(8, ServerString.checkForUpdatesStr, 100);
   static final LoadProgress aClass351_6729 = new LoadProgress(9, ServerString.fetchUpdatesStr, ServerString.fetchUpdatesStr, 0, 92, true, true);
   static final LoadProgress aClass351_6730 = new LoadProgress(10, ServerString.fetchUpdatesStr, ServerString.fetchUpdatesStr, 92, 93);
   static final LoadProgress aClass351_6731 = new LoadProgress(11, ServerString.fetchUpdatesStr, ServerString.fetchUpdatesStr, 94, 95);
   static final LoadProgress aClass351_6732 = new LoadProgress(3, ServerString.checkForUpdatesStr, ServerString.checkForUpdatesStr, 3, 4);
   static final LoadProgress aClass351_6733 = new LoadProgress(13, ServerString.fetchUpdatesStr, 97);
   static final LoadProgress aClass351_6734 = new LoadProgress(2, ServerString.checkForUpdatesStr, 3);
   static final LoadProgress aClass351_6735 = new LoadProgress(15, ServerString.fetchUpdatesStr, 100);
   static final LoadProgress aClass351_6736 = new LoadProgress(14, ServerString.fetchUpdatesStr, 97);
   static final LoadProgress aClass351_6737 = new LoadProgress(4, ServerString.checkForUpdatesStr, 4);
   public final int anInt6738;
   final ServerString aClass482_6739;
   final ServerString aClass482_6740;
   static final LoadProgress aClass351_6741 = new LoadProgress(1, ServerString.checkForUpdatesStr, ServerString.checkForUpdatesStr, 2, 3);
   final int anInt_6742;
   final boolean aBoolean_6743;
   final boolean aBoolean_6744;
   static int anInt_6745;
   static String[] jagexCacheFiles;
   static Class243 mainCacheLoader;


   LoadProgress(int var1, ServerString var2, int var3) {
      this(var1, var2, var2, var3, var3, true, false);
   }

   LoadProgress(int var1, ServerString var2, ServerString var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, true, false);
   }

   LoadProgress(int var1, ServerString var2, ServerString var3, int var4, int var5, boolean var6, boolean var7) {
      this.anInt6738 = 512666443 * var1;
      this.aClass482_6739 = var2;
      this.aClass482_6740 = var3;
      this.percent = -2090011167 * var4;
      this.anInt_6742 = -1569340821 * var5;
      this.aBoolean_6743 = var6;
      this.aBoolean_6744 = var7;
   }

   static LoadProgress[] method4423(byte var0) {
      return new LoadProgress[]{aClass351_6722, aClass351_6741, aClass351_6734, aClass351_6732, aClass351_6737, aClass351_6725, aClass351_6720, aClass351_6726, aClass351_6728, aClass351_6729, aClass351_6730, aClass351_6731, aClass351_6727, aClass351_6733, aClass351_6736, aClass351_6735, aClass351_6724, aClass351_6723};
   }

   static void method4424(Renderer var0, int var1) {
      if(Class18.optionsClosed) {
         Class580.method6317(var0, (byte)77);
      } else {
         AbstractCacheData.renderUptext(var0, -2099358827);
      }

   }

   public static void method4425(Class434 var0, int var1, int var2, RSCharacter var3, int var4, int var5) {
      RSInterfaceData var6 = Class261.getInterfaceData();
      var6.animeTarget = var3;
      var6.anInt_9516 = 1017610205 * var4;
      Class240_Sub52_Sub10.method585(var0, var1, var2, var6, 1835313145);
      var6.animeTarget = null;
      var6.anInt_9516 = -1017610205;
   }

   static final void method4426(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      boolean var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      if(var0.hidden != var4) {
         var0.hidden = var4;
         Class110_Sub1.method3149(var0, 1318282705);
      }

      if(-1001687885 * var0.anInt_2428 == -1 && !var1.aBoolean_2054) {
         Class598.method6478(1278853609 * var0.cacheID, 647335586);
      }

   }

   public static int method4427(CharSequence var0, int var1) {
      return Class469.method5643(var0, 10, true, 1704672326);
   }

   static void method4428(int var0) {
      Class585.aTextRenderer_9728 = null;
      CacheDataNode.aTextRenderer_3243 = null;
      MouseHandler.aTextRenderer_6379 = null;
      Class1.headPKIcons = null;
      Class540_Sub13.prayIconSprites = null;
      Class240_Sub22_Sub16.hintHeadIconsSprites = null;
      Class1.hintMarkerSprites = null;
      Class609.flagSprites = null;
      Class1.crossSprites = null;
      Class438.mapDotSprites = null;
      Class481.nameIconsSprites = null;
      Class240_Sub52_Sub1.compassSprite = null;
      Class530.otherLeveLSprite = null;
      Class527.mapEdgeMarker = null;
   }

   static int method4429(byte var0) {
      int var1;
      if(Class104_Sub21.renderSettings.aClass540_Sub8_7317.method1620(2043453173) == 0) {
         for(var1 = 0; var1 < 232284759 * client.anInt_483; ++var1) {
            if(client.aClass233Array_360[var1].method2984(-154385567) == 115 || client.aClass233Array_360[var1].method2984(1502630181) == 83) {
               Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub8_7317, 1, 322385638);
               client.aBoolean_282 = true;
               Class274.method3603(Class486.aClass486_8981, (short)-26927);
               break;
            }
         }
      }

      if(aClass351_6722 == RendererInfo.curLoadProgress) {
         if(FontUnpacker.cacheDownload == null) {
            FontUnpacker.cacheDownload = new CacheDownload(Class91.updateServerConnection, Class528.aClass370_9305, Class16.aBigInteger_136, Class16.aBigInteger_134);
         }

         if(!FontUnpacker.cacheDownload.updateCache()) {
            return 0;
         }

         Class479.method5698(0, (String)null, true, -1654567156);
         Class474.aBoolean_8726 = !Class557.method6158((short)19068);
         Class433.aCacheDataUnpacker_8343 = Class587.getCacheDataUnpacker(Class474.aBoolean_8726?CacheFileID.aClass108_2028:CacheFileID.aClass108_2026, false, 1, true, true, (byte)6);
         Class228.aCacheUnpacker_3936 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2027, false, 1, true, true, (byte)-60);
         Class5.aCacheUnpacker_31 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2007, false, 1, true, true, (byte)-68);
      }

      int var2;
      boolean var8;
      if(aClass351_6741 == RendererInfo.curLoadProgress) {
         var8 = Class228.aCacheUnpacker_3936.method3576((byte)8);
         var2 = Class300.cacheDataArray[CacheFileID.aClass108_2027.getID()].method5380(2044270128);
         var2 += Class300.cacheDataArray[Class474.aBoolean_8726?CacheFileID.aClass108_2028.getID():CacheFileID.aClass108_2026.getID()].method5380(2053570025);
         var2 += Class300.cacheDataArray[CacheFileID.aClass108_2007.getID()].method5380(2028720192);
         var2 += var8?100:Class228.aCacheUnpacker_3936.method3592(-908787633);
         if(var2 != 400) {
            return var2 / 4;
         }

         Class344.anInt_6560 = Class433.aCacheDataUnpacker_8343.method3564(-449330219) * -660612545;
         Class601.anInt_9882 = Class228.aCacheUnpacker_3936.method3564(1003734073) * -408456199;
         Class240_Sub19.method4787(Class433.aCacheDataUnpacker_8343, (byte)89);
         int var3 = Class104_Sub21.renderSettings.aClass540_Sub5_7316.method1554(-1334680069);
         Class203.aClass449_3530 = new Class449(client.currentGamePack, Class599.clientLanguage, Class228.aCacheUnpacker_3936);
         Class446[] var4 = Class203.aClass449_3530.method5515(var3, 1797876110);
         if(0 == var4.length) {
            var4 = Class203.aClass449_3530.method5515(0, 1746611398);
         }

         Class55 var5 = new Class55(Class433.aCacheDataUnpacker_8343, Class5.aCacheUnpacker_31);
         if(var4.length > 0) {
            Class344.aClass345Array_6558 = new Class345[var4.length];

            for(int var6 = 0; var6 < Class344.aClass345Array_6558.length; ++var6) {
               Class344.aClass345Array_6558[var6] = new Class343(Class203.aClass449_3530.method5514(var4[var6].anInt_8522 * 1858285427, 1879570605), -648292387 * var4[var6].anInt_8523, 1784664007 * var4[var6].anInt_8524, var5);
            }
         }
      }

      if(aClass351_6734 == RendererInfo.curLoadProgress) {
         Class368.aFontUnpacker_6922 = new FontUnpacker(Class433.aCacheDataUnpacker_8343, Class5.aCacheUnpacker_31, Class90.method1195(402940787));
      }

      if(aClass351_6732 == RendererInfo.curLoadProgress) {
         var1 = Class368.aFontUnpacker_6922.method4133(-297021870);
         var2 = Class368.aFontUnpacker_6922.method4138((byte)-8);
         if(var1 < var2) {
            return var1 * 100 / var2;
         }
      }

      if(aClass351_6737 == RendererInfo.curLoadProgress) {
         if(Class344.aClass345Array_6558 != null && Class344.aClass345Array_6558.length > 0) {
            if(Class344.aClass345Array_6558[0].method4289(1696650423) < 100) {
               return 0;
            }

            if(Class344.aClass345Array_6558.length > 1 && Class203.aClass449_3530.method5516(377871504) && Class344.aClass345Array_6558[1].method4289(1816772385) < 100) {
               return 0;
            }
         }

         Class368.aFontUnpacker_6922.method4131(client.aClass339_284, -883974002);
         Class20.method122(Class286.gameRenderer, 1122999243);
         Class418.method5190(15, (byte)-42);
      }

      if(RendererInfo.curLoadProgress == aClass351_6725) {
         Class301.mmUnpacker = Class587.getCacheDataUnpacker(CacheFileID.cacheFileId8, false, 1, false, true, (byte)50);
         Class508_Sub2.aCacheUnpacker_2121 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_1994, false, 1, false, true, (byte)-59);
         Class306.aCacheUnpacker_6037 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_1995, false, 1, false, true, (byte)46);
         UpdateServerConnector.aCacheUnpacker_7708 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2016, false, 1, true, true, (byte)27);
         Class275.aCacheUnpacker_4725 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2023, false, 1, true, true, (byte)-4);
         Class431.aCacheUnpacker_8325 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_1997, false, 1, false, true, (byte)-52);
         Class293.cacheFile5Unpacker = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2010, true, 1, false, true, (byte)5);
         GraphicsDataHolder.aCacheUnpacker_9212 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2000, true, 1, false, true, (byte)3);
         Class240_Sub22_Sub1.aCacheUnpacker_801 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2001, false, 1, false, true, (byte)58);
         Class231_Sub5.aCacheUnpacker_8271 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2003, true, 1, false, true, (byte)-80);
         Class97.aCacheUnpacker_1925 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2031, true, 1, false, true, (byte)-18);
         Class188.aCacheUnpacker_3204 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2021, false, 1, false, true, (byte)-94);
         Class66.aCacheUnpacker_1257 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2005, false, 1, false, true, (byte)-13);
         Class215.aCacheUnpacker_3739 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2006, false, 1, true, true, (byte)-38);
         Class437.aCacheUnpacker_8384 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2008, false, 1, false, false, (byte)-77);
         Class361.aCacheUnpacker_6799 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2009, false, 1, false, true, (byte)15);
         Class119.aCacheUnpacker_2110 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2033, false, 1, true, true, (byte)-41);
         Class312.aCacheUnpacker_6101 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2002, false, 1, true, true, (byte)-1);
         Class540_Sub28.aCacheUnpacker_6563 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2012, false, 1, true, true, (byte)-72);
         Class585.aCacheUnpacker_9729 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2013, false, 1, true, true, (byte)-15);
         Class585.aCacheUnpacker_9730 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2014, false, 1, true, true, (byte)4);
         Class100.aCacheUnpacker_1956 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2015, false, 1, true, true, (byte)-5);
         Class527.aCacheUnpacker_9294 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2017, false, 1, true, true, (byte)-24);
         CacheDownload.cache23Unpacker = Class587.getCacheDataUnpacker(CacheFileID.cache23ID, true, 1, false, true, (byte)30);
         Class501.aCacheUnpacker_9089 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2011, false, 1, true, true, (byte)29);
         Class283_Sub3.aCacheUnpacker_7896 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2004, false, 1, true, true, (byte)-32);
         Class317.aCacheUnpacker_6164 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_1998, true, 1, true, true, (byte)-47);
         Class502.aCacheUnpacker_9106 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2020, false, 1, true, true, (byte)-97);
         Class278.aCacheUnpacker_4737 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2022, true, 1, true, true, (byte)-42);
         Class457.aCacheUnpacker_8569 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2025, false, 1, true, true, (byte)-73);
         Class80.aCacheUnpacker_1532 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2029, true, 1, false, true, (byte)-52);
         Class39.aCacheUnpacker_867 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2019, true, 1, false, true, (byte)-28);
         Class465.aCacheUnpacker_8678 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_1996, true, 1, true, true, (byte)16);
         Class222.aCacheUnpacker_3821 = Class587.getCacheDataUnpacker(CacheFileID.aClass108_2030, true, 2, false, true, (byte)-24);
      }

      if(RendererInfo.curLoadProgress == aClass351_6720) {
         var1 = 0;

         for(var2 = 0; var2 < Class300.cacheDataArray.length; ++var2) {
            if(null != Class300.cacheDataArray[var2]) {
               var1 += Class300.cacheDataArray[var2].method5380(2133291956) * Class344.anIntArray_6557[var2] / 100;
            }
         }

         if(var1 != 100) {
            if(Class344.anInt_6562 * -482920783 < 0) {
               Class344.anInt_6562 = 586371665 * var1;
            }

            return (var1 - Class344.anInt_6562 * -482920783) * 100 / (100 - -482920783 * Class344.anInt_6562);
         }

         CacheNodeArrayList.getSpriteOffsets(Class301.mmUnpacker, -281918944);
         Class368.aFontUnpacker_6922 = new FontUnpacker(Class301.mmUnpacker, Class5.aCacheUnpacker_31, Class90.method1195(1724438724));
      }

      if(aClass351_6726 == RendererInfo.curLoadProgress) {
         byte[] var9 = Class278.aCacheUnpacker_4737.method3566(Class590.aClass590_9789.anInt_9792 * 631638583, 1185741177);
         if(var9 == null) {
            return 0;
         }

         Class423.method5283(var9, 1038971746);
         Class113.method1456(816847018);
         Class418.method5190(1, (byte)-46);
      }

      if(RendererInfo.curLoadProgress == aClass351_6728 && Class635.clientLibExtractor == null) {
         Class635.clientLibExtractor = new LibraryUnpacker(Class39.aCacheUnpacker_867);
         Class38.method315(Class635.clientLibExtractor, -1144552261);
      }

      if(aClass351_6729 == RendererInfo.curLoadProgress) {
         var1 = Class373.method4746(-1507257464);
         if(var1 < 100) {
            return var1;
         }

         Class89.method1187(Class278.aCacheUnpacker_4737.method3566(Class590.aClass590_9784.anInt_9792 * 631638583, 524944518), 1555926789);
         Class571.aClass587_9651 = new Class587(Class278.aCacheUnpacker_4737);
         PlayerComposite.aShortArrayArray_9853 = Class571.aClass587_9651.aShortArrayArray_9758;
         PlayerComposite.aShortArrayArrayArray_9854 = Class571.aClass587_9651.aShortArrayArrayArray_9759;
         if(-1 != Class571.aClass587_9651.anInt_9764 * -647282733 && -1 != Class571.aClass587_9651.anInt_9765 * -1170896527) {
            client.anInt_343 = Class571.aClass587_9651.anInt_9764 * 906297099;
            client.anInt_435 = -712982439 * Class571.aClass587_9651.anInt_9765;
         }

         Class286.aClass592_4822 = new Class592(Class278.aCacheUnpacker_4737);
         IteratorNodeList.aClass574_9195 = new Class574(Class278.aCacheUnpacker_4737);
         Class268.aClass586_4646 = new Class586(Class278.aCacheUnpacker_4737);
         Class560.aClass599_9582 = new Class599(Class278.aCacheUnpacker_4737);
      }

      if(RendererInfo.curLoadProgress == aClass351_6730) {
         if(-1 != Class571.aClass587_9651.anInt_9746 * 712072065 && !Class240_Sub22_Sub1.aCacheUnpacker_801.method3568(712072065 * Class571.aClass587_9651.anInt_9746, 0, 1771478537)) {
            return 99;
         }

         FontRenderer_Sub3.aClass163_10701 = new Class163(Class317.aCacheUnpacker_6164);
         RSInterfaceGroup.aClass96_2057 = new Class188(Class231_Sub5.aCacheUnpacker_8271, Class97.aCacheUnpacker_1925);
         Class240_Sub1.aClass465_6506 = new Class465(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         RandomAccessFileNode.aClass255_9018 = new Class255(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, Class286.aClass592_4822);
         AbstractKeyboardHandler.aClass457_4262 = new Class457(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, Class301.mmUnpacker);
         Class493.aClass466_9034 = new Class466(client.currentGamePack, Class599.clientLanguage, Class312.aCacheUnpacker_6101);
         Class133.aClass565_2603 = new Class565(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         PlayerComposite.aClass530_9858 = new Class530(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class578.damageAnimeLoader = new DamageAnimeLoader(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, Class301.mmUnpacker);
         Class301.aClass251_6005 = new Class251(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, Class301.mmUnpacker);
         Class598.aClass71_9878 = new Class71(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, Class240_Sub22_Sub1.aCacheUnpacker_801);
         Class45.aClass432_960 = new Class432(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class181.aClass450_3106 = new Class450(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class535.aClass529_9441 = new Class529(client.currentGamePack, Class599.clientLanguage, true, Class119.aCacheUnpacker_2110, Class240_Sub22_Sub1.aCacheUnpacker_801);
         client.aClass296_348.method3788(Class535.aClass529_9441, (byte)16);
         Class476.aClass306_8741.method3854(new Class529(client.currentGamePack, Class599.clientLanguage, true, Class119.aCacheUnpacker_2110, Class240_Sub22_Sub1.aCacheUnpacker_801), 1654797710);
         Class126.mapIconUnpacker = new MapIconUnpacker(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, Class301.mmUnpacker);
         Class520.aClass445_9243 = new Class445(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, Class301.mmUnpacker);
         Class104_Sub6.characterUnpacker = new NPCUnpacker(client.currentGamePack, Class599.clientLanguage, true, Class540_Sub28.aCacheUnpacker_6563, Class240_Sub22_Sub1.aCacheUnpacker_801);
         Class592.cacheObjectLoader = new CacheObjectLoader(client.currentGamePack, Class599.clientLanguage, true, Class240_Sub1.aClass465_6506, Class585.aCacheUnpacker_9729, Class240_Sub22_Sub1.aCacheUnpacker_801);
         HintMarker.aClass583_3709 = new Class583(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, true);
         Class1.aClass631_16 = new Class631(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class88.animeUnpacker = new AnimationUnpacker(client.currentGamePack, Class599.clientLanguage, Class585.aCacheUnpacker_9730, Class508_Sub2.aCacheUnpacker_2121, Class306.aCacheUnpacker_6037, Class1.aClass631_16);
         Class585.aClass236_9731 = new Class236(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class598.aClass44_9877 = new Class44(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class75.aClass558_1422 = new Class558(client.currentGamePack, Class599.clientLanguage, Class100.aCacheUnpacker_1956, Class240_Sub22_Sub1.aCacheUnpacker_801);
         Class204.aClass455_3536 = new Class455(client.currentGamePack, Class599.clientLanguage, Class527.aCacheUnpacker_9294, true);
         NodeArrayList.aClass212_Sub1_Sub2_9205 = new Class212_Sub1_Sub2(client.currentGamePack, Class283.aClass283_4783, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class104_Sub14.aClass212_Sub1_Sub1_10688 = new Class212_Sub1_Sub1(client.currentGamePack, Class283.aClass283_4785, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         AbstractServerConnection.aClass212_Sub1_Sub2_4038 = new Class212_Sub1_Sub2(client.currentGamePack, Class283.aClass283_4781, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class522.aClass212_Sub1_Sub2_9259 = new Class212_Sub1_Sub2(client.currentGamePack, Class283.aClass283_4786, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class124.aClass212_Sub1_Sub2_2349 = new Class212_Sub1_Sub2(client.currentGamePack, Class283.aClass283_4790, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708);
         Class508_Sub1.aMap_2060 = Class87.method1144(new Class212_Sub1[]{NodeArrayList.aClass212_Sub1_Sub2_9205, Class104_Sub14.aClass212_Sub1_Sub1_10688, AbstractServerConnection.aClass212_Sub1_Sub2_4038, Class522.aClass212_Sub1_Sub2_9259, Class124.aClass212_Sub1_Sub2_2349}, (byte)55);
         Class603.aClass212_Sub2_9897 = new Class212_Sub2(client.currentGamePack, Class599.clientLanguage, UpdateServerConnector.aCacheUnpacker_7708, Class508_Sub1.aMap_2060);
         Class167.aClass185_3028 = new Class361();
         Setting.method6084(Class275.aCacheUnpacker_4725, Class240_Sub22_Sub1.aCacheUnpacker_801, Class301.mmUnpacker, Class5.aCacheUnpacker_31, 725952319);
         Class89.method1183(Class457.aCacheUnpacker_8569, (byte)-42);
         Class534.aClass275_9439 = new Class275(Class599.clientLanguage, Class501.aCacheUnpacker_9089, Class283_Sub3.aCacheUnpacker_7896);
         Class525.aClass490_9274 = new Class490(Class599.clientLanguage, Class501.aCacheUnpacker_9089, Class283_Sub3.aCacheUnpacker_7896, new Class410());
         Class240_Sub41_Sub3.aClass23_1024 = new Class23(Class104_Sub14.aClass212_Sub1_Sub1_10688, Class603.aClass212_Sub2_9897, IteratorNodeList.aClass574_9195.method6287(688830807));
         Class481.method5706(-834672780);
         Class319.method3953(Class88.animeUnpacker, 1920772105);
         Class32.method229(Class502.aCacheUnpacker_9106, 216863442);
         Class438.method5438(Class240_Sub22_Sub1.aCacheUnpacker_801, FontRenderer_Sub3.aClass163_10701, RSInterfaceGroup.aClass96_2057, (byte)54);
         Class48 var11 = new Class48(Class188.aCacheUnpacker_3204.method3583("huffman", "", (byte)-23));
         Class418.method5189(var11, 1529132405);
         ClientSuper.aClass228_3899 = Class506.method5870(-492801821);
         Class494.aClass240_Sub15_9037 = new Class240_Sub15(true);
      }

      if(aClass351_6731 == RendererInfo.curLoadProgress) {
         var1 = Class5.method29(Class301.mmUnpacker, 705186115) + Class368.aFontUnpacker_6922.method4130(true, -1956176655);
         var2 = Class221.method2782(74313582) + Class368.aFontUnpacker_6922.method4138((byte)-26);
         if(var1 < var2) {
            return var1 * 100 / var2;
         }
      }

      if(RendererInfo.curLoadProgress == aClass351_6727) {
         Class248.method3154(CacheDownload.cache23Unpacker, Class133.aClass565_2603, PlayerComposite.aClass530_9858, client.aClass296_348.method3755(1126731405), Class126.mapIconUnpacker, Class520.aClass445_9243, Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024);
      }

      if(RendererInfo.curLoadProgress == aClass351_6733) {
         Class267.preferenceFileList = new Class178_Sub1(NodeArrayList.aClass212_Sub1_Sub2_9205);
         Class31.method219(2047931076);
         Class293.cacheFile5Unpacker.method3578(false, true, -327899209);
         GraphicsDataHolder.aCacheUnpacker_9212.method3578(true, true, -327899209);
         Class301.mmUnpacker.method3578(true, true, -327899209);
         Class5.aCacheUnpacker_31.method3578(true, true, -327899209);
         Class188.aCacheUnpacker_3204.method3578(true, true, -327899209);
         client.aBoolean_307 = true;
      }

      if(RendererInfo.curLoadProgress == aClass351_6736) {
         if(!Class24.method149(Class571.aClass587_9651.anInt_9755 * 2137738939, (int[])null, 1493497923)) {
            return 0;
         }

         var8 = true;

         for(var2 = 0; var2 < RSInterface.interfaceGroups[2137738939 * Class571.aClass587_9651.anInt_9755].interfaceArray.length; ++var2) {
            RSInterface var10 = RSInterface.interfaceGroups[Class571.aClass587_9651.anInt_9755 * 2137738939].interfaceArray[var2];
            if(1916189739 * var10.index == 5 && var10.imageID * 1900159845 != -1 && !Class301.mmUnpacker.method3568(1900159845 * var10.imageID, 0, 517792412)) {
               var8 = false;
            }
         }

         if(!var8) {
            return 0;
         }
      }

      if(aClass351_6735 == RendererInfo.curLoadProgress) {
         Class271.method3558(true, (short)-2632);
      }

      if(aClass351_6724 == RendererInfo.curLoadProgress) {
         Class52.aClass327_1072.method4025((byte)-2);

         try {
            Class542.aThread_9472.join();
         } catch (InterruptedException var7) {
            return 0;
         }

         Class52.aClass327_1072 = null;
         Class542.aThread_9472 = null;
         Class433.aCacheDataUnpacker_8343 = null;
         Class228.aCacheUnpacker_3936 = null;
         Class203.aClass449_3530 = null;
         Class344.aClass345Array_6558 = null;
         Class286.method3695((short)16447);
         client.aBoolean_422 = Class104_Sub21.renderSettings.aClass540_Sub8_7317.method1620(766289227) == 1;
         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub8_7317, 1, -142837228);
         if(client.aBoolean_422) {
            Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, 0, -193576973);
         } else if(Class104_Sub21.renderSettings.aClass540_Sub29_7312.aBoolean_6564 && Class494.aClass240_Sub15_9037.anInt_6891 * 2057037889 < 512 && 2057037889 * Class494.aClass240_Sub15_9037.anInt_6891 != 0) {
            Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, 0, 1216112517);
         }

         Class83.method1089(-1253582632);
         if(client.aBoolean_422) {
            Class462.setRenderToolkit(0, false, -2009620717);
            if(!client.aBoolean_282) {
               Class274.method3603(Class486.aClass486_8988, (short)-26006);
            }
         } else {
            Class462.setRenderToolkit(Class104_Sub21.renderSettings.aClass540_Sub29_7312.getToolkitID(), false, -1932158862);
            if(Class104_Sub21.renderSettings.aClass540_Sub29_7312.getToolkitID() == 0) {
               Class274.method3603(Class486.aClass486_8984, (short)-5787);
            }
         }

         Class522.method5974(Class104_Sub21.renderSettings.aClass540_Sub13_7311.method1694(783234315), -1, -1, false, -1739261782);
         Class368.aFontUnpacker_6922.method4131(client.aClass339_284, -883974002);
         Class20.method122(Class286.gameRenderer, 1746526230);
         Class240_Sub30.loadSprites(Class286.gameRenderer, Class301.mmUnpacker);
         Class215.setTextImgs(Class481.nameIconsSprites);
      }

      return Class282.method3658(-802660083);
   }

   static final void method4430(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub27_7288.method4256(-2090659302);
   }
}
