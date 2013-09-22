
public class RenderSettings extends NodeListNode {

   public Class540_Sub18 aClass540_Sub18_7280;
   static final int anInt_7281 = 23;
   public static final int anInt_7282 = 245;
   public static final int anInt_7283 = 500;
   final GamePack aClass523_7284;
   final CompProfile computerProfile;
   public Class540_Sub11 aClass540_Sub11_7286;
   public Class540_Sub28 aClass540_Sub28_7287;
   public Class540_Sub27 aClass540_Sub27_7288;
   public Class540_Sub20 particlesSetting;
   public Class540_Sub25 aClass540_Sub25_7290;
   public Class540_Sub7 aClass540_Sub7_7291;
   public Class540_Sub10 aClass540_Sub10_7292;
   public Class540_Sub23 aClass540_Sub23_7293;
   public Class540_Sub15 idleAnimations;
   public Class540_Sub1 aClass540_Sub1_7295;
   public Class540_Sub29 currentToolkit;
   public Class540_Sub24 aClass540_Sub24_7297;
   public Class540_Sub13 aClass540_Sub13_7298;
   public Class540_Sub17 aClass540_Sub17_7299;
   public Class540_Sub19 aClass540_Sub19_7300;
   public Class540_Sub16 aClass540_Sub16_7301;
   public Class540_Sub24 aClass540_Sub24_7302;
   public Class540_Sub32 aClass540_Sub32_7303;
   Class540_Sub4 aClass540_Sub4_7304;
   public Class540_Sub6 aClass540_Sub6_7305;
   public Class540_Sub21 aClass540_Sub21_7306;
   public Class540_Sub3 aClass540_Sub3_7307;
   public Class540_Sub26 aClass540_Sub26_7308;
   public Class540_Sub14 aClass540_Sub14_7309;
   public Class540_Sub22 aClass540_Sub22_7310;
   public Class540_Sub13 aClass540_Sub13_7311;
   public Class540_Sub29 aClass540_Sub29_7312;
   public Class540_Sub2 aClass540_Sub2_7313;
   public Class540_Sub30 aClass540_Sub30_7314;
   public Class540_Sub27 aClass540_Sub27_7315;
   public Class540_Sub5 aClass540_Sub5_7316;
   public Class540_Sub8 aClass540_Sub8_7317;
   public Class540_Sub12 aClass540_Sub12_7318;
   static final int anInt_7319 = 29;
   public Class540_Sub14 aClass540_Sub14_7320;
   public Class540_Sub31 aClass540_Sub31_7321;
   public Class540_Sub14 aClass540_Sub14_7322;
   public Class540_Sub14 aClass540_Sub14_7323;
   public Class540_Sub14 aClass540_Sub14_7324;
   public Class540_Sub9 aClass540_Sub9_7325;
   static final int anInt_7326 = 41;


   public RenderSettings(ByteArrayDataNode var1, GamePack var2, int var3) {
      this.aClass523_7284 = var2;
      this.computerProfile = new CompProfile(-222937899 * ClientSuper.maxMemory, 9775703 * ClientSuper.availableProcessors, Class240_Sub52_Sub2.osArch.indexOf("arm") != -1, Class50.aString_1050.startsWith("win"));
      this.currentToolkit = new Class540_Sub29(var3, this);
      this.method4820(var1, 839293133);
   }

   void method4820(ByteArrayDataNode var1, int var2) {
      if(var1 != null && null != var1.data) {
         int var3 = var1.readByte(-52746965);
         if(var3 < 23) {
            try {
               this.method4821(var1, var3, (short)9556);
            } catch (Exception var5) {
               this.method4828(true, -2073985764);
            }

            this.method4828(false, -2073985764);
         } else if(var3 > 29) {
            this.method4828(true, -2073985764);
         } else {
            if(var3 >= 29) {
               this.aClass540_Sub10_7292 = new Class540_Sub10(var1.readByte(1900243156), this);
            }

            this.aClass540_Sub27_7315 = new Class540_Sub27(var1.readByte(383144004), this);
            this.aClass540_Sub27_7288 = new Class540_Sub27(this.aClass540_Sub27_7315.method4256(-2111403153), this);
            this.aClass540_Sub16_7301 = new Class540_Sub16(var1.readByte(2000974237), this);
            this.aClass540_Sub25_7290 = new Class540_Sub25(var1.readByte(224040444), this);
            this.aClass540_Sub7_7291 = new Class540_Sub7(var1.readByte(1545110380), this);
            if(var3 >= 27) {
               this.aClass540_Sub28_7287 = new Class540_Sub28(var1.readByte(1499864577), this);
            }

            this.aClass540_Sub23_7293 = new Class540_Sub23(var1.readByte(863175682), this);
            this.aClass540_Sub31_7321 = new Class540_Sub31(var1.readByte(620076080), this);
            this.aClass540_Sub1_7295 = new Class540_Sub1(var1.readByte(1404136007), this);
            this.aClass540_Sub18_7280 = new Class540_Sub18(var1.readByte(307626789), this);
            this.idleAnimations = new Class540_Sub15(var1.readByte(-541396349), this);
            this.aClass540_Sub26_7308 = new Class540_Sub26(var1.readByte(611140333), this);
            this.aClass540_Sub32_7303 = new Class540_Sub32(var1.readByte(718235437), this);
            if(var3 >= 24) {
               this.aClass540_Sub19_7300 = new Class540_Sub19(var1.readByte(-950737512), this);
            }

            this.particlesSetting = new Class540_Sub20(var1.readByte(109812870), this);
            this.aClass540_Sub24_7302 = new Class540_Sub24(var1.readByte(1163818824), this);
            this.aClass540_Sub24_7297 = new Class540_Sub24(this.aClass540_Sub24_7302.method4126(1178055141), this);
            this.aClass540_Sub3_7307 = new Class540_Sub3(var1.readByte(791728073), this);
            if(var3 >= 25) {
               this.aClass540_Sub6_7305 = new Class540_Sub6(var1.readByte(-1112548598), this);
            }

            this.aClass540_Sub21_7306 = new Class540_Sub21(var1.readByte(1136525198), this);
            if(var3 <= 25) {
               var1.index += -2043502829;
            }

            this.aClass540_Sub17_7299 = new Class540_Sub17(var1.readByte(386203427), this);
            this.aClass540_Sub29_7312 = new Class540_Sub29(var1.readByte(1241663566), this);
            this.currentToolkit = new Class540_Sub29(this.aClass540_Sub29_7312.getToolkitID(), this);
            var1.readByte(-902855842);
            this.aClass540_Sub22_7310 = new Class540_Sub22(var1.readByte(-450242645), this);
            this.aClass540_Sub13_7311 = new Class540_Sub13(var1.readByte(-18961542), this);
            this.aClass540_Sub13_7298 = new Class540_Sub13(this.aClass540_Sub13_7311.method1694(783234315), this);
            this.aClass540_Sub2_7313 = new Class540_Sub2(var1.readByte(-412908950), this);
            this.aClass540_Sub30_7314 = new Class540_Sub30(var1.readByte(-389557045), this);
            this.aClass540_Sub11_7286 = new Class540_Sub11(var1.readByte(745798023), this);
            this.aClass540_Sub5_7316 = new Class540_Sub5(var1.readByte(-174823237), this);
            this.aClass540_Sub8_7317 = new Class540_Sub8(var1.readByte(586795225), this);
            if(var3 >= 26) {
               this.aClass540_Sub12_7318 = new Class540_Sub12(var1.readByte(-385153), this);
            }

            if(var3 >= 28) {
               this.aClass540_Sub4_7304 = new Class540_Sub4(var1.readByte(1071969614), this);
            }

            this.aClass540_Sub14_7320 = new Class540_Sub14(var1.readByte(2027857536), this);
            this.aClass540_Sub14_7324 = new Class540_Sub14(var1.readByte(-225494755), this);
            this.aClass540_Sub14_7322 = new Class540_Sub14(var1.readByte(-320019316), this);
            this.aClass540_Sub14_7323 = new Class540_Sub14(var1.readByte(271319480), this);
            this.aClass540_Sub14_7309 = new Class540_Sub14(var1.readByte(-393485338), this);
            this.aClass540_Sub9_7325 = new Class540_Sub9(var1.readByte(1984069374), this);
            this.method4828(false, -2073985764);
         }
      } else {
         this.method4828(true, -2073985764);
      }

      this.method4826((byte)-1);
   }

   void method4821(ByteArrayDataNode var1, int var2, short var3) {
      this.aClass540_Sub25_7290 = new Class540_Sub25(var1.readByte(-175318796), this);
      var1.index += -2043502829;
      this.aClass540_Sub24_7302 = new Class540_Sub24(var1.readByte(1872203866) + 1, this);
      this.aClass540_Sub18_7280 = new Class540_Sub18(var1.readByte(-318528426), this);
      var1.index += -2043502829;
      this.idleAnimations = new Class540_Sub15(var1.readByte(670493306), this);
      this.aClass540_Sub23_7293 = new Class540_Sub23(var1.readByte(408960480), this);
      var1.readByte(600701194);
      this.aClass540_Sub21_7306 = new Class540_Sub21(var1.readByte(100737054), this);
      int var4 = var1.readByte(-1037259289);
      int var5 = 0;
      if(var2 >= 17) {
         var5 = var1.readByte(-955315523);
      }

      this.aClass540_Sub32_7303 = new Class540_Sub32(var4 > var5?var4:var5, this);
      boolean var6 = true;
      boolean var7 = true;
      if(var2 >= 2) {
         var6 = var1.readByte(1546801036) == 1;
         if(var2 >= 17) {
            var7 = var1.readByte(7788383) == 1;
         }
      } else {
         var6 = var1.readByte(1277315962) == 1;
         var1.readByte(2123679807);
      }

      this.aClass540_Sub26_7308 = new Class540_Sub26(var6 | var7?1:0, this);
      this.aClass540_Sub22_7310 = new Class540_Sub22(var1.readByte(1094600745), this);
      this.aClass540_Sub31_7321 = new Class540_Sub31(var1.readByte(1507017298), this);
      this.aClass540_Sub27_7315 = new Class540_Sub27(var1.readByte(-572473929), this);
      this.aClass540_Sub9_7325 = new Class540_Sub9(var1.readByte(456397520), this);
      this.aClass540_Sub14_7320 = new Class540_Sub14(var1.readByte(369511418), this);
      if(var2 >= 20) {
         this.aClass540_Sub14_7322 = new Class540_Sub14(var1.readByte(103599863), this);
      } else {
         this.aClass540_Sub14_7322 = new Class540_Sub14(this.aClass540_Sub14_7320.method1701(-1211090138), this);
      }

      this.aClass540_Sub14_7323 = new Class540_Sub14(var1.readByte(-646706111), this);
      this.aClass540_Sub14_7324 = new Class540_Sub14(var1.readByte(1793730616), this);
      if(var2 >= 21) {
         this.aClass540_Sub14_7309 = new Class540_Sub14(var1.readByte(15363991), this);
      } else {
         this.aClass540_Sub14_7309 = new Class540_Sub14(this.aClass540_Sub14_7323.method1701(-1925414284), this);
      }

      if(var2 >= 1) {
         var1.readShort(-297507830);
         var1.readShort(632326328);
      }

      if(var2 >= 3 && var2 < 6) {
         var1.readByte(982158336);
      }

      if(var2 >= 4) {
         this.particlesSetting = new Class540_Sub20(var1.readByte(1363080573), this);
      }

      var1.method4480(1260717178);
      if(var2 >= 6) {
         this.aClass540_Sub13_7311 = new Class540_Sub13(var1.readByte(205189667), this);
      }

      if(var2 >= 7) {
         this.aClass540_Sub8_7317 = new Class540_Sub8(var1.readByte(-767635327), this);
      }

      if(var2 >= 8) {
         var1.readByte(1129601366);
      }

      if(var2 >= 9) {
         this.aClass540_Sub7_7291 = new Class540_Sub7(var1.readByte(362462639), this);
      }

      if(var2 >= 10) {
         this.aClass540_Sub16_7301 = new Class540_Sub16(var1.readByte(-772125781), this);
      }

      if(var2 >= 11) {
         this.aClass540_Sub2_7313 = new Class540_Sub2(var1.readByte(1757087654), this);
      }

      if(var2 >= 12) {
         this.idleAnimations = new Class540_Sub15(var1.readByte(233866535), this);
      }

      if(var2 >= 13) {
         this.aClass540_Sub1_7295 = new Class540_Sub1(var1.readByte(1397402770), this);
      }

      if(var2 >= 14) {
         this.aClass540_Sub29_7312 = new Class540_Sub29(var1.readByte(917988242), this);
      }

      if(var2 >= 15) {
         this.aClass540_Sub11_7286 = new Class540_Sub11(var1.readByte(-644505493), this);
      }

      if(var2 >= 16) {
         this.aClass540_Sub17_7299 = new Class540_Sub17(var1.readByte(662057224), this);
      }

      if(var2 >= 18) {
         this.aClass540_Sub30_7314 = new Class540_Sub30(var1.readByte(786709344), this);
      }

      if(var2 >= 19) {
         this.aClass540_Sub3_7307 = new Class540_Sub3(var1.readByte(1999472034), this);
      }

      if(var2 >= 22) {
         this.aClass540_Sub5_7316 = new Class540_Sub5(var1.readByte(1342037338), this);
      }

   }

   public ByteArrayDataNode compileRenderSettings(int var1) {
      ByteArrayDataNode var2 = new ByteArrayDataNode(41);
      var2.putByte(29, 997249178);
      var2.putByte(this.aClass540_Sub10_7292.method1653(-594341511), 1290910479);
      var2.putByte(this.aClass540_Sub27_7315.method4256(-2033162889), -488372544);
      var2.putByte(this.aClass540_Sub16_7301.method1783(-1051615135), 1267449533);
      var2.putByte(this.aClass540_Sub25_7290.method4178((byte)-71), 1881699989);
      var2.putByte(this.aClass540_Sub7_7291.method1586(1779309497), 479727982);
      var2.putByte(this.aClass540_Sub28_7287.method4269(1958056475), -1771715837);
      var2.putByte(this.aClass540_Sub23_7293.method4100(-1644110481), 1633427634);
      var2.putByte(this.aClass540_Sub31_7321.method4379(-831324111), -1700243802);
      var2.putByte(this.aClass540_Sub1_7295.method1402((byte)-7), -708657123);
      var2.putByte(this.aClass540_Sub18_7280.method4005((byte)-23), -287740484);
      var2.putByte(this.idleAnimations.method1774(-1435162166), 1235427662);
      var2.putByte(this.aClass540_Sub26_7308.method4199(-233159109), -721341837);
      var2.putByte(this.aClass540_Sub32_7303.method4388(1482064611), -218934901);
      var2.putByte(this.aClass540_Sub19_7300.method4007(828970184), 1447832589);
      var2.putByte(this.particlesSetting.method4022(689774491), 1379072380);
      var2.putByte(this.aClass540_Sub24_7302.method4126(1884049489), -1450060692);
      var2.putByte(this.aClass540_Sub3_7307.method1431((byte)0), -557133355);
      var2.putByte(this.aClass540_Sub6_7305.method1559(2068647264), 482906365);
      var2.putByte(this.aClass540_Sub21_7306.method4047(-126944801), -55297875);
      var2.putByte(this.aClass540_Sub17_7299.method3986(1148271278), -956103781);
      var2.putByte(this.aClass540_Sub29_7312.getToolkitID(), -1724248926);
      var2.putByte(0, 695031938);
      var2.putByte(this.aClass540_Sub22_7310.method4061(1860000878), -456117904);
      var2.putByte(this.aClass540_Sub13_7311.method1694(783234315), 666893221);
      var2.putByte(this.aClass540_Sub2_7313.method1427(-146104779), -1119939452);
      var2.putByte(this.aClass540_Sub30_7314.method4346(1199090811), 415013941);
      var2.putByte(this.aClass540_Sub11_7286.method1661(-345161208), 100498268);
      var2.putByte(this.aClass540_Sub5_7316.method1554(-1456251565), 1098955747);
      var2.putByte(this.aClass540_Sub8_7317.method1620(883389857), -1435545014);
      var2.putByte(this.aClass540_Sub12_7318.method1679(1389970496), -524737036);
      var2.putByte(this.aClass540_Sub4_7304.method1451((byte)4), -1691495087);
      var2.putByte(this.aClass540_Sub14_7320.method1701(-1397055916), 80752731);
      var2.putByte(this.aClass540_Sub14_7324.method1701(-1537181900), -1346015625);
      var2.putByte(this.aClass540_Sub14_7322.method1701(-1925198433), -7403094);
      var2.putByte(this.aClass540_Sub14_7323.method1701(-1153306178), -425084597);
      var2.putByte(this.aClass540_Sub14_7309.method1701(-1879140478), 424292733);
      var2.putByte(this.aClass540_Sub9_7325.method1643(-1636632172), 1583758188);
      return var2;
   }

   public void set(Setting var1, int var2, int var3) {
      var1.method6080(var2, (byte)23);
      this.method4826((byte)-1);
   }

   public void method4824(Class540_Sub29 var1, boolean var2, int var3) {
      var1.method4283(var2, (byte)-49);
      this.method4826((byte)-1);
   }

   public GamePack method4825(int var1) {
      return this.aClass523_7284;
   }

   void method4826(byte var1) {
      this.aClass540_Sub10_7292.method1650(1360393087);
      this.aClass540_Sub27_7315.method4259((byte)68);
      this.aClass540_Sub27_7288.method4259((byte)-58);
      this.aClass540_Sub16_7301.method1782(1149613635);
      this.aClass540_Sub25_7290.method4175((byte)-116);
      this.aClass540_Sub7_7291.method1582(-1955034293);
      this.aClass540_Sub28_7287.method4273(2105604052);
      this.aClass540_Sub23_7293.method4096((byte)-57);
      this.aClass540_Sub31_7321.method4377((short)19830);
      this.aClass540_Sub1_7295.method1404(1786825560);
      this.aClass540_Sub18_7280.method4001(1130320170);
      this.idleAnimations.method1771(-2059850394);
      this.aClass540_Sub26_7308.method4196((byte)-102);
      this.aClass540_Sub32_7303.method4389(1820010035);
      this.aClass540_Sub19_7300.method4011(1113966989);
      this.particlesSetting.method4021((byte)6);
      this.aClass540_Sub24_7302.method4127(240738788);
      this.aClass540_Sub24_7297.method4127(1156768604);
      this.aClass540_Sub3_7307.method1433(317512905);
      this.aClass540_Sub6_7305.method1556((byte)100);
      this.aClass540_Sub21_7306.method4043(1778645535);
      this.aClass540_Sub17_7299.method3981(-971423430);
      this.aClass540_Sub29_7312.method4278((byte)-71);
      this.currentToolkit.method4278((byte)-11);
      this.aClass540_Sub22_7310.method4058((byte)-116);
      this.aClass540_Sub13_7311.method1692((byte)-14);
      this.aClass540_Sub13_7298.method1692((byte)-54);
      this.aClass540_Sub2_7313.method1424(-1480353994);
      this.aClass540_Sub30_7314.method4344(614358543);
      this.aClass540_Sub11_7286.method1658((byte)30);
      this.aClass540_Sub5_7316.method1551(1856322021);
      this.aClass540_Sub8_7317.method1621(372190613);
      this.aClass540_Sub12_7318.method1677(-1167625466);
      this.aClass540_Sub4_7304.method1448(2022664786);
      this.aClass540_Sub14_7320.method1698(-1715612515);
      this.aClass540_Sub14_7324.method1698(-2001912733);
      this.aClass540_Sub14_7322.method1698(1618514048);
      this.aClass540_Sub14_7323.method1698(-351948616);
      this.aClass540_Sub14_7309.method1698(1955320915);
      this.aClass540_Sub9_7325.method1641((byte)-37);
   }

   public RenderSettings(GamePack var1, int var2) {
      this.aClass523_7284 = var1;
      this.computerProfile = new CompProfile(-222937899 * ClientSuper.maxMemory, ClientSuper.availableProcessors * 9775703, Class240_Sub52_Sub2.osArch.toLowerCase().indexOf("arm") != -1, Class50.aString_1050.startsWith("win"));
      this.currentToolkit = new Class540_Sub29(var2, this);
      this.method4828(true, -2073985764);
   }

   public CompProfile method4827(byte var1) {
      return this.computerProfile;
   }

   void method4828(boolean param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   static void method4829(int var0) {
      if(-1850250531 * Class107.viewOfMapImageX < 0) {
         Class107.viewOfMapImageX = 0;
         Class248_Sub1.anInt_6446 = -1082544505;
         Class248_Sub1.anInt_6447 = 826358349;
      }

      if(-1850250531 * Class107.viewOfMapImageX > Class248_Sub1.maxMapTilesX) {
         Class107.viewOfMapImageX = Class248_Sub1.maxMapTilesX * 745782645;
         Class248_Sub1.anInt_6446 = -1082544505;
         Class248_Sub1.anInt_6447 = 826358349;
      }

      if(AbstractUpdateServerConnector.viewOfMapImageY * 1377436059 < 0) {
         AbstractUpdateServerConnector.viewOfMapImageY = 0;
         Class248_Sub1.anInt_6446 = -1082544505;
         Class248_Sub1.anInt_6447 = 826358349;
      }

      if(1377436059 * AbstractUpdateServerConnector.viewOfMapImageY > Class248_Sub1.maxMapTilesY) {
         AbstractUpdateServerConnector.viewOfMapImageY = Class248_Sub1.maxMapTilesY * -394363757;
         Class248_Sub1.anInt_6446 = -1082544505;
         Class248_Sub1.anInt_6447 = 826358349;
      }

   }

   static final void method4830(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      DamageAnimeLoader.method6650(var3, var4, var0, -1398294791);
   }
}
