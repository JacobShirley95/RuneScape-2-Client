import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class411 {

   public int anInt_7771 = 465972279;
   public static final int anInt_7772 = 1;
   public int anInt_7773;
   public short aShort_7774;
   public boolean aBoolean_7775 = true;
   public int anInt_7776;
   int anInt_7777;
   public int anInt_7778 = -1178661519;
   public short aShort_7779;
   public int anInt_7780;
   public int anInt_7781;
   public int anInt_7782 = 0;
   public int anInt_7783;
   public int[] anIntArray_7784;
   public short aShort_7785;
   static CacheDataUnpacker aCacheUnpacker_7786;
   int anInt_7787 = 1803500436;
   public short aShort_7788;
   public int anInt_7789 = 769042110;
   public int anInt_7790;
   int anInt_7791;
   public int anInt_7792;
   public int anInt_7793;
   int anInt_7794 = 877424612;
   int anInt_7795 = 302900572;
   public int anInt_7796 = -1785372993;
   public boolean aBoolean_7797 = true;
   int anInt_7798;
   public int anInt_7799;
   public int anInt_7800 = 749047737;
   public int[] anIntArray_7801;
   public int[] anIntArray_7802;
   public int[] anIntArray_7803;
   public boolean aBoolean_7804 = true;
   public static final int anInt_7805 = -1;
   public int anInt_7806;
   public int anInt_7807;
   public int anInt_7808 = 0;
   public boolean aBoolean_7809 = true;
   public int anInt_7810;
   public int anInt_7811 = 120570445;
   static CacheNodeArrayList aClass627_7812 = new CacheNodeArrayList(64);
   public int anInt_7813 = 0;
   public int anInt_7814 = -1844287730;
   public int anInt_7815 = -1039146389;
   public static final int anInt_7816 = 2;
   int anInt_7817 = 0;
   public int anInt_7818 = 0;
   public int anInt_7819 = 0;
   int anInt_7820 = 0;
   public boolean aBoolean_7821 = false;
   public boolean aBoolean_7822 = true;
   public boolean aBoolean_7823 = false;
   public boolean aBoolean_7824 = true;
   public boolean aBoolean_7825 = false;
   public boolean aBoolean_7826 = false;
   public int anInt_7827;
   int anInt_7828;
   public int anInt_7829;
   public int anInt_7830;
   int anInt_7831;
   public int anInt_7832;
   public int anInt_7833;
   int anInt_7834;
   public int anInt_7835;
   public int anInt_7836;
   public int anInt_7837;
   public int anInt_7838;
   public int anInt_7839;
   public int anInt_7840;
   public int anInt_7841 = 0;
   public int anInt_7842;
   public int anInt_7843;
   public int anInt_7844;
   public int anInt_7845;
   public int anInt_7846;
   static final int anInt_7847 = 0;
   public int anInt_7848;
   int anInt_7849 = -338787604;
   public int anInt_7850;
   static int anInt_7851;


   void method5066(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         this.aShort_7788 = (short)var1.readShort(105808265);
         this.aShort_7785 = (short)var1.readShort(459379280);
         this.aShort_7774 = (short)var1.readShort(1943986183);
         this.aShort_7779 = (short)var1.readShort(443659347);
         byte var4 = 3;
         this.aShort_7788 = (short)(this.aShort_7788 << var4);
         this.aShort_7785 = (short)(this.aShort_7785 << var4);
         this.aShort_7774 = (short)(this.aShort_7774 << var4);
         this.aShort_7779 = (short)(this.aShort_7779 << var4);
      } else if(var2 == 2) {
         var1.readByte(440795535);
      } else if(3 == var2) {
         this.anInt_7780 = var1.method4480(1260717178) * 1089360575;
         this.anInt_7781 = var1.method4480(1260717178) * 648545313;
      } else if(4 == var2) {
         this.anInt_7782 = var1.readByte(-715585678) * -1583930967;
         this.anInt_7783 = var1.getByte((byte)32) * -1867554891;
      } else if(var2 == 5) {
         this.anInt_7799 = (this.anInt_7810 = (var1.readShort(-591404480) << 12 << 2) * -2036581061) * 1964469667;
      } else if(var2 == 6) {
         this.anInt_7798 = var1.method4480(1260717178) * -1123623639;
         this.anInt_7791 = var1.method4480(1260717178) * -201446517;
      } else if(7 == var2) {
         this.anInt_7806 = var1.readShort(-830796784) * 1960295931;
         this.anInt_7792 = var1.readShort(-1220350165) * -701633817;
      } else if(8 == var2) {
         this.anInt_7843 = var1.readShort(-1217070997) * 1150282637;
         this.anInt_7790 = var1.readShort(-53780886) * 2092064193;
      } else {
         int var5;
         int var6;
         if(9 == var2) {
            var6 = var1.readByte(408332268);
            this.anIntArray_7801 = new int[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.anIntArray_7801[var5] = var1.readShort(1397801746);
            }
         } else if(10 == var2) {
            var6 = var1.readByte(1458824388);
            this.anIntArray_7803 = new int[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.anIntArray_7803[var5] = var1.readShort(624621851);
            }
         } else if(12 == var2) {
            this.anInt_7789 = var1.getByte((byte)83) * -384521055;
         } else if(13 == var2) {
            this.anInt_7814 = var1.getByte((byte)22) * -1225339783;
         } else if(14 == var2) {
            this.anInt_7808 = var1.readShort(-993938835) * 2029418569;
         } else if(15 == var2) {
            this.anInt_7796 = var1.readShort(-507319188) * 1785372993;
         } else if(var2 == 16) {
            this.aBoolean_7809 = var1.readByte(217826743) == 1;
            this.anInt_7811 = var1.readShort(142440812) * -120570445;
            this.anInt_7778 = var1.readShort(2018687518) * 1178661519;
            this.aBoolean_7797 = var1.readByte(784231123) == 1;
         } else if(var2 == 17) {
            this.anInt_7815 = var1.readShort(536176456) * 1039146389;
         } else if(var2 == 18) {
            this.anInt_7776 = var1.method4480(1260717178) * 1608195799;
         } else if(19 == var2) {
            this.anInt_7813 = var1.readByte(610287623) * -323827821;
         } else if(var2 == 20) {
            this.anInt_7794 = var1.readByte(1526344995) * -2009860383;
         } else if(21 == var2) {
            this.anInt_7795 = var1.readByte(1419041362) * -297618705;
         } else if(22 == var2) {
            this.anInt_7771 = var1.method4480(1260717178) * -465972279;
         } else if(var2 == 23) {
            this.anInt_7787 = var1.readByte(-1146365626) * 404582061;
         } else if(24 == var2) {
            this.aBoolean_7804 = false;
         } else if(25 == var2) {
            var6 = var1.readByte(-359471326);
            this.anIntArray_7802 = new int[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.anIntArray_7802[var5] = var1.readShort(1283658280);
            }
         } else if(var2 == 26) {
            this.aBoolean_7775 = false;
         } else if(var2 == 27) {
            this.anInt_7800 = (var1.readShort(-1065496551) << 12 << 2) * -749047737;
         } else if(var2 == 28) {
            this.anInt_7849 = var1.readByte(-885743651) * 1027404275;
         } else if(var2 == 29) {
            if(var1.readByte(2129563001) == 0) {
               this.anInt_7819 = (this.anInt_7820 = var1.method4478((byte)1) * 126795480) * -342950189;
            } else {
               this.anInt_7819 = var1.method4478((byte)1) * -3040248;
               this.anInt_7820 = var1.method4478((byte)1) * 126795480;
            }
         } else if(30 == var2) {
            this.aBoolean_7821 = true;
         } else if(31 == var2) {
            this.anInt_7799 = (var1.readShort(-1308227820) << 12 << 2) * -1294328943;
            this.anInt_7810 = (var1.readShort(611794124) << 12 << 2) * -2036581061;
         } else if(32 == var2) {
            this.aBoolean_7822 = false;
         } else if(var2 == 33) {
            this.aBoolean_7823 = true;
         } else if(var2 == 34) {
            this.aBoolean_7824 = false;
         } else if(35 == var2) {
            if(var1.readByte(-1066865088) == 0) {
               this.anInt_7841 = (this.anInt_7817 = var1.method4478((byte)1) * 1361561544) * 1690879177;
            } else {
               this.anInt_7841 = var1.method4478((byte)1) * 1634794504;
               this.anInt_7817 = var1.method4478((byte)1) * 1361561544;
               this.anInt_7818 = var1.readByte(-998198659) * 188539439;
            }
         } else if(36 == var2) {
            this.aBoolean_7825 = true;
         }
      }

   }

   void method5067(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(1693339600);
         if(var3 == 0) {
            return;
         }

         this.method5066(var1, var3, -1343183512);
      }
   }

   void method5068(int var1) {
      if(-778815647 * this.anInt_7789 > -2 || this.anInt_7814 * 538828233 > -2) {
         this.aBoolean_7826 = true;
      }

      this.anInt_7827 = 2092946163 * (88543001 * this.anInt_7798 >> 16 & 255);
      this.anInt_7828 = 1056880849 * (-932076509 * this.anInt_7791 >> 16 & 255);
      this.anInt_7837 = this.anInt_7828 * 169542355 - 1745748849 * this.anInt_7827;
      this.anInt_7830 = (this.anInt_7798 * 88543001 >> 8 & 255) * 658781747;
      this.anInt_7831 = (this.anInt_7791 * -932076509 >> 8 & 255) * 1419056627;
      this.anInt_7832 = 1879091023 * this.anInt_7831 - -544118257 * this.anInt_7830;
      this.anInt_7833 = (88543001 * this.anInt_7798 & 255) * 1829267127;
      this.anInt_7834 = (this.anInt_7791 * -932076509 & 255) * 700717377;
      this.anInt_7793 = this.anInt_7834 * -1884938857 - this.anInt_7833 * 939876705;
      this.anInt_7839 = 13031355 * (this.anInt_7798 * 88543001 >> 24 & 255);
      this.anInt_7777 = -2068923687 * (-932076509 * this.anInt_7791 >> 24 & 255);
      this.anInt_7838 = -1913576215 * this.anInt_7777 - this.anInt_7839 * -898295821;
      if(-1842826009 * this.anInt_7776 != 0) {
         this.anInt_7829 = 504019935 * (1754499287 * this.anInt_7792 * this.anInt_7794 * -2030318303 / 100);
         this.anInt_7840 = this.anInt_7795 * 475053071 * 1754499287 * this.anInt_7792 / 100 * -473576935;
         if(this.anInt_7829 * -1447772129 == 0) {
            this.anInt_7829 = 504019935;
         }

         this.anInt_7836 = -462135731 * (((this.anInt_7776 * -1842826009 >> 16 & 255) - (1743292011 * this.anInt_7837 / 2 + 1762694715 * this.anInt_7827) << 8) / (-1447772129 * this.anInt_7829));
         this.anInt_7842 = -221438031 * (((this.anInt_7776 * -1842826009 >> 8 & 255) - (1827779835 * this.anInt_7830 + -961240491 * this.anInt_7832 / 2) << 8) / (-1447772129 * this.anInt_7829));
         this.anInt_7850 = -191540691 * (((-1842826009 * this.anInt_7776 & 255) - (this.anInt_7833 * 1074484999 + 401394023 * this.anInt_7793 / 2) << 8) / (this.anInt_7829 * -1447772129));
         if(0 == this.anInt_7840 * -1788874199) {
            this.anInt_7840 = -473576935;
         }

         this.anInt_7844 = ((this.anInt_7776 * -1842826009 >> 24 & 255) - (this.anInt_7839 * 1415861619 + this.anInt_7838 * 243575937 / 2) << 8) / (this.anInt_7840 * -1788874199) * 2089596329;
         this.anInt_7836 += (this.anInt_7836 * 1498155653 > 0?-4:4) * -462135731;
         this.anInt_7842 += -221438031 * (this.anInt_7842 * 258459985 > 0?-4:4);
         this.anInt_7850 += -191540691 * (this.anInt_7850 * -381366875 > 0?-4:4);
         this.anInt_7844 += (-1661682023 * this.anInt_7844 > 0?-4:4) * 2089596329;
      }

      if(this.anInt_7771 * 1816835705 != -1) {
         this.anInt_7845 = 1707091237 * this.anInt_7787 * this.anInt_7792 * 1754499287 / 100 * -874413353;
         if(237408487 * this.anInt_7845 == 0) {
            this.anInt_7845 = -874413353;
         }

         this.anInt_7846 = (1816835705 * this.anInt_7771 - (this.anInt_7780 * -897180353 + (591953889 * this.anInt_7781 - this.anInt_7780 * -897180353) / 2)) / (this.anInt_7845 * 237408487) * 436135251;
      }

      if(-1 != 861550967 * this.anInt_7800) {
         this.anInt_7773 = this.anInt_7792 * 1754499287 * this.anInt_7849 * 1188892475 / 100 * -708945589;
         if(this.anInt_7773 * -63477661 == 0) {
            this.anInt_7773 = -708945589;
         }

         this.anInt_7848 = (861550967 * this.anInt_7800 - (this.anInt_7799 * -1607465615 + (this.anInt_7810 * -1827957773 - this.anInt_7799 * -1607465615) / 2)) / (this.anInt_7773 * -63477661) * 292250367;
      }

      this.anInt_7835 = this.anInt_7817 * -1036932823 - 1547686241 * this.anInt_7841;
      this.anInt_7807 = -1131228445 * this.anInt_7820 - this.anInt_7819 * 1508962737;
   }

   static Sprite method5069(byte[] var0, byte var1) {
      if(null == var0) {
         throw new RuntimeException("");
      } else {
         while(true) {
            try {
               Image var2 = Toolkit.getDefaultToolkit().createImage(var0);
               MediaTracker var3 = new MediaTracker(Class481.clientApplet);
               var3.addImage(var2, 0);
               var3.waitForAll();
               int var4 = var2.getWidth(Class481.clientApplet);
               int var5 = var2.getHeight(Class481.clientApplet);
               if(!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                  int[] var6 = new int[var5 * var4];
                  PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                  var7.grabPixels();
                  return Class286.gameRenderer.defineSprite(var6, 0, var4, var4, var5);
               }

               throw new RuntimeException("");
            } catch (InterruptedException var8) {
               ;
            }
         }
      }
   }

   static final void method5070(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.aByteArray_1289[var2];
   }

   static final void method5071(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapOverviewNode var3 = Class605.method6516(1533745793);
      if(var3 != null) {
         boolean var4 = var3.method2574(var2 >> 28 & 3, var2 >> 14 & 16383, var2 & 16383, Class556.anIntArray_9545, 276822729);
         if(var4) {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class556.anIntArray_9545[1];
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class556.anIntArray_9545[2];
         } else {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         }
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      }

   }

   public static byte[] method5072(String var0, byte var1) {
      int var2 = var0.length();
      if(0 == var2) {
         return new byte[0];
      } else {
         int var3 = 3 + var2 & -4;
         int var4 = 3 * (var3 / 4);
         if(var3 - 2 < var2 && Class212.method2666(var0.charAt(var3 - 2), (short)11587) != -1) {
            if(var3 - 1 >= var2 || Class212.method2666(var0.charAt(var3 - 1), (short)-29556) == -1) {
               --var4;
            }
         } else {
            var4 -= 2;
         }

         byte[] var5 = new byte[var4];
         Class469.method5646(var0, var5, 0, 654694724);
         return var5;
      }
   }

   static final void method5073(RSInterfaceData var0, byte var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[var0.stringDataIndex * 863838783];
      String var3 = (String)var0.stringData[1 + var0.stringDataIndex * 863838783];
      AbstractMouseHandler.method3109(var2, var3, 349159941);
   }

   public static void method5074(Class240_Sub17 var0, byte var1) {
      Class263.method3506(var0, 200000, 2049110780);
   }

   public static void method5075(int var0, int var1) {
      CacheNodeArrayList var2 = PlayerComposite.longTermPlayerCache;
      synchronized(PlayerComposite.longTermPlayerCache) {
         PlayerComposite.longTermPlayerCache.method6677(var0, -1822613096);
      }

      var2 = PlayerComposite.playerModelCache;
      synchronized(PlayerComposite.playerModelCache) {
         PlayerComposite.playerModelCache.method6677(var0, -1717420344);
      }
   }

   static final void method5076(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 586830225 * var3.anInt_2495;
   }

   static void method5077(int var0) {
      CacheNodeArrayList var1 = Class4.aClass627_29;
      synchronized(Class4.aClass627_29) {
         Class4.aClass627_29.method6669(728635722);
      }
   }

   static final void method5078(RSInterfaceData var0, int var1) {
      RSWorld var2 = Class102.method1315(1580146959);
      if(var2 != null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1592717877 * var2.serverIndex;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.flags * -1696859433;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2.locAcc;
         Class625 var3 = var2.method4392(-1044813842);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_10045 * 571842637;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_10046;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.players * 485515171;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.ping * -524571829;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2.worldAddress;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }
}
