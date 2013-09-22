import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;

public class Class240_Sub15 extends NodeListNode {

   static final int anInt_6847 = 3;
   static final int anInt_6848 = 7;
   static final int anInt_6849 = 2;
   static final int anInt_6850 = 3;
   static final int anInt_6851 = 4;
   static final int anInt_6852 = 4;
   boolean aBoolean_6853;
   static final int anInt_6854 = 1;
   static final int anInt_6855 = 2;
   static final int anInt_6856 = 3;
   int anInt_6857;
   static final int anInt_6858 = 5;
   static final int anInt_6859 = 6;
   public static final int anInt_6860 = 0;
   static final int anInt_6861 = 8;
   static final int anInt_6862 = 9;
   static final int anInt_6863 = 20;
   static final int anInt_6864 = 21;
   int anInt_6865;
   int anInt_6866;
   static final int anInt_6867 = 1;
   String aString_6868;
   static final int anInt_6869 = 2;
   static final int anInt_6870 = 23;
   String aString_6871;
   int anInt_6872;
   public int anInt_6873;
   static final int anInt_6874 = 1;
   public int anInt_6875;
   boolean aBoolean_6876;
   int anInt_6877;
   static final int anInt_6878 = 0;
   int anInt_6879;
   int anInt_6880;
   static final int anInt_6881 = 4;
   int anInt_6882;
   String aString_6883;
   String aString_6884;
   int anInt_6885;
   String aString_6886;
   int anInt_6887;
   int anInt_6888;
   static final int anInt_6889 = 22;
   static final int anInt_6890 = 7;
   public int anInt_6891;
   int anInt_6892;
   int[] anIntArray_6893 = new int[3];
   String aString_6894;
   String aString_6895;


   void method4648(int var1) {
      if(this.aString_6883.length() > 40) {
         this.aString_6883 = this.aString_6883.substring(0, 40);
      }

      if(this.aString_6884.length() > 40) {
         this.aString_6884 = this.aString_6884.substring(0, 40);
      }

      if(this.aString_6868.length() > 10) {
         this.aString_6868 = this.aString_6868.substring(0, 10);
      }

      if(this.aString_6886.length() > 10) {
         this.aString_6886 = this.aString_6886.substring(0, 10);
      }

      if(this.aString_6895.length() > 120) {
         this.aString_6895 = this.aString_6895.substring(0, 120);
      }

   }

   public void method4649(ByteArrayDataNode var1, byte var2) {
      var1.putByte(7, -452503644);
      var1.putByte(-757821121 * this.anInt_6892, 552948028);
      var1.putByte(this.aBoolean_6853?1:0, 1627597512);
      var1.putByte(-276298321 * this.anInt_6885, 20128952);
      var1.putByte(-1397475339 * this.anInt_6866, -553522144);
      var1.putByte(this.anInt_6873 * 1201203591, -1669434071);
      var1.putByte(this.anInt_6880 * 742068495, -383611552);
      var1.putByte(1272691903 * this.anInt_6875, 1553040644);
      var1.putByte(this.aBoolean_6876?1:0, 439673876);
      var1.method4463(-819332289 * this.anInt_6877, 1102723968);
      var1.putByte(this.anInt_6879 * 2064829837, -291918655);
      var1.method4465(2057037889 * this.anInt_6891, 1559570221);
      var1.method4463(this.anInt_6882 * 1813308643, 981765762);
      var1.method4535(this.aString_6883, -1963686214);
      var1.method4535(this.aString_6884, -891518989);
      var1.method4535(this.aString_6868, -1297856567);
      var1.method4535(this.aString_6886, -1824394095);
      var1.putByte(this.anInt_6888 * 505340465, -408404227);
      var1.method4463(this.anInt_6887 * 308529489, -1408054065);
      var1.method4535(this.aString_6894, -1184992427);
      var1.method4535(this.aString_6871, -1383051476);
      var1.putByte(this.anInt_6872 * 1753654707, -560983932);
      var1.putByte(1028418551 * this.anInt_6857, -1590875128);

      for(int var3 = 0; var3 < this.anIntArray_6893.length; ++var3) {
         var1.putIntBE(this.anIntArray_6893[var3], 2062892803);
      }

      var1.putIntBE(701346079 * this.anInt_6865, 2062892803);
      var1.method4535(this.aString_6895, -1449759016);
   }

   public Class240_Sub15(boolean var1) {
      if(var1) {
         if(Class50.aString_1050.startsWith("win")) {
            this.anInt_6892 = 1926094527;
         } else if(Class50.aString_1050.startsWith("mac")) {
            this.anInt_6892 = -442778242;
         } else if(Class50.aString_1050.startsWith("linux")) {
            this.anInt_6892 = 1483316285;
         } else {
            this.anInt_6892 = -885556484;
         }

         if(!Class240_Sub52_Sub2.osArch.startsWith("amd64") && !Class240_Sub52_Sub2.osArch.startsWith("x86_64")) {
            this.aBoolean_6853 = false;
         } else {
            this.aBoolean_6853 = true;
         }

         if(-757821121 * this.anInt_6892 == 1) {
            if(ConnectionHandler.osHome.indexOf("4.0") != -1) {
               this.anInt_6885 = -2101579441;
            } else if(ConnectionHandler.osHome.indexOf("4.1") != -1) {
               this.anInt_6885 = 91808414;
            } else if(ConnectionHandler.osHome.indexOf("4.9") != -1) {
               this.anInt_6885 = -2009771027;
            } else if(ConnectionHandler.osHome.indexOf("5.0") != -1) {
               this.anInt_6885 = 183616828;
            } else if(ConnectionHandler.osHome.indexOf("5.1") != -1) {
               this.anInt_6885 = -1917962613;
            } else if(ConnectionHandler.osHome.indexOf("5.2") != -1) {
               this.anInt_6885 = 367233656;
            } else if(ConnectionHandler.osHome.indexOf("6.0") != -1) {
               this.anInt_6885 = 275425242;
            } else if(ConnectionHandler.osHome.indexOf("6.1") != -1) {
               this.anInt_6885 = -1826154199;
            } else if(ConnectionHandler.osHome.indexOf("6.2") != -1) {
               this.anInt_6885 = -1734345785;
            }
         } else if(this.anInt_6892 * -757821121 == 2) {
            if(ConnectionHandler.osHome.indexOf("10.4") != -1) {
               this.anInt_6885 = 918084140;
            } else if(ConnectionHandler.osHome.indexOf("10.5") != -1) {
               this.anInt_6885 = -1183495301;
            } else if(ConnectionHandler.osHome.indexOf("10.6") != -1) {
               this.anInt_6885 = 1009892554;
            } else if(ConnectionHandler.osHome.indexOf("10.7") != -1) {
               this.anInt_6885 = -1091686887;
            }
         }

         if(Class111.javaVendor.toLowerCase().indexOf("sun") != -1) {
            this.anInt_6866 = -1365672867;
         } else if(Class111.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            this.anInt_6866 = 1563621562;
         } else if(Class111.javaVendor.toLowerCase().indexOf("apple") != -1) {
            this.anInt_6866 = 197948695;
         } else {
            this.anInt_6866 = -1167724172;
         }

         int var2 = 2;
         int var3 = 0;

         char var4;
         try {
            while(var2 < Class288.javaVersion.length()) {
               var4 = Class288.javaVersion.charAt(var2);
               if(var4 < 48 || var4 > 57) {
                  break;
               }

               var3 = var4 - 48 + 10 * var3;
               ++var2;
            }
         } catch (Exception var18) {
            ;
         }

         this.anInt_6873 = -368014281 * var3;
         var2 = Class288.javaVersion.indexOf(46, 2) + 1;
         var3 = 0;

         try {
            while(var2 < Class288.javaVersion.length()) {
               var4 = Class288.javaVersion.charAt(var2);
               if(var4 < 48 || var4 > 57) {
                  break;
               }

               var3 = var4 - 48 + 10 * var3;
               ++var2;
            }
         } catch (Exception var17) {
            ;
         }

         this.anInt_6880 = var3 * 210615791;
         var2 = Class288.javaVersion.indexOf(95, 4) + 1;
         var3 = 0;

         try {
            while(var2 < Class288.javaVersion.length()) {
               var4 = Class288.javaVersion.charAt(var2);
               if(var4 < 48 || var4 > 57) {
                  break;
               }

               var3 = var4 - 48 + 10 * var3;
               ++var2;
            }
         } catch (Exception var16) {
            ;
         }

         this.anInt_6875 = 902673215 * var3;
         this.aBoolean_6876 = false;
         this.anInt_6877 = 772728555 * ClientSuper.maxMemory;
         if(1201203591 * this.anInt_6873 > 3) {
            this.anInt_6879 = ClientSuper.availableProcessors * -119069581;
         } else {
            this.anInt_6879 = 0;
         }

         try {
            int[] var19 = HardwareInfo.getCPUInfo();
            if(null != var19 && var19.length == 3) {
               this.anInt_6872 = var19[0] * -591621765;
               this.anInt_6882 = var19[1] * -1868594997;
               this.anInt_6891 = -351000639 * var19[2];
            }

            int[] var5 = HardwareInfo.getRawCPUInfo();
            int var7;
            int var9;
            int var10;
            int var11;
            if(null != var5 && 0 == var5.length % 5) {
               HashMap var6 = new HashMap();

               for(var7 = 0; var7 < var5.length / 5; ++var7) {
                  int var8 = var5[5 * var7];
                  var9 = var5[1 + var7 * 5];
                  var10 = var5[5 * var7 + 2];
                  var11 = var5[3 + var7 * 5];
                  int var12 = var5[5 * var7 + 4];
                  Class481 var13 = new Class481(var8, var9, var10, var11, var12);
                  var6.put(Integer.valueOf(var8), var13);
               }

               Class481 var21 = (Class481)var6.get(Integer.valueOf(0));
               if(null != var21) {
                  ByteArrayDataNode var24 = new ByteArrayDataNode(13);
                  var24.putInt(-674581691 * var21.anInt_8759, -122824549);
                  var24.putInt(1332371135 * var21.anInt_8761, 183893570);
                  var24.putInt(-1860668355 * var21.anInt_8757, -259821068);
                  var24.index = 0;
                  this.aString_6894 = var24.method4485(-178953259);
               }

               Class481 var22 = (Class481)var6.get(Integer.valueOf(1));
               if(var22 != null) {
                  this.anInt_6865 = -1990948133 * var22.anInt_8758;
                  var9 = -674581691 * var22.anInt_8759;
                  this.anInt_6857 = (var9 >> 16 & 255) * 2060830151;
                  this.anIntArray_6893[0] = var22.anInt_8757 * -1860668355;
                  this.anIntArray_6893[1] = 1332371135 * var22.anInt_8761;
               }

               Class481 var26 = (Class481)var6.get(Integer.valueOf(-2147483647));
               if(var26 != null) {
                  this.anIntArray_6893[2] = 1332371135 * var26.anInt_8761;
               }

               ByteArrayDataNode var28 = new ByteArrayDataNode(49);

               for(var11 = -2147483646; var11 <= -2147483644; ++var11) {
                  Class481 var30 = (Class481)var6.get(Integer.valueOf(var11));
                  if(var30 != null) {
                     var28.putInt(1503476613 * var30.anInt_8758, 214907466);
                     var28.putInt(var30.anInt_8759 * -674581691, 1126610973);
                     var28.putInt(-1860668355 * var30.anInt_8757, -937632876);
                     var28.putInt(var30.anInt_8761 * 1332371135, -1938065381);
                  }
               }

               var28.index = 0;
               this.aString_6871 = var28.method4485(-1744369183);
            }

            String[][] var20 = HardwareInfo.getDXDiagDisplayDevicesProps();
            String var25;
            if(var20 != null && var20.length > 0 && null != var20[0]) {
               for(var7 = 0; var7 < var20[0].length; var7 += 2) {
                  if(var20[0][var7].equalsIgnoreCase("szDescription")) {
                     this.aString_6883 = var20[0][var7 + 1];
                  } else if(var20[0][var7].equalsIgnoreCase("szDriverDateEnglish")) {
                     var25 = var20[0][1 + var7];

                     try {
                        var9 = var25.indexOf("/");
                        var10 = var25.indexOf("/", var9 + 1);
                        this.anInt_6888 = Integer.parseInt(var25.substring(0, var9)) * 109262545;
                        this.anInt_6887 = Integer.parseInt(var25.substring(1 + var10, var25.indexOf(" ", var10))) * 827400113;
                     } catch (Exception var14) {
                        ;
                     }
                  }
               }
            }

            String[] var23 = HardwareInfo.getDXDiagSystemProps();
            if(var23 != null) {
               var25 = "";
               String var29 = "";
               String var27 = "";

               for(var11 = 0; var11 < var23.length; var11 += 2) {
                  if(var23[var11].equalsIgnoreCase("dwDirectXVersionMajor")) {
                     var25 = var23[1 + var11];
                  } else if(var23[var11].equalsIgnoreCase("dwDirectXVersionMinor")) {
                     var29 = var23[var11 + 1];
                  } else if(var23[var11].equalsIgnoreCase("dwDirectXVersionLetter")) {
                     var27 = var23[1 + var11];
                  }
               }

               this.aString_6868 = var25 + "." + var29 + var27;
            }
         } catch (Throwable var15) {
            this.anInt_6891 = 0;
         }
      }

      if(this.aString_6883 == null) {
         this.aString_6883 = "";
      }

      if(this.aString_6884 == null) {
         this.aString_6884 = "";
      }

      if(this.aString_6868 == null) {
         this.aString_6868 = "";
      }

      if(null == this.aString_6886) {
         this.aString_6886 = "";
      }

      if(this.aString_6894 == null) {
         this.aString_6894 = "";
      }

      if(null == this.aString_6871) {
         this.aString_6871 = "";
      }

      if(null == this.aString_6895) {
         this.aString_6895 = "";
      }

      this.method4648(1573424354);
   }

   public int method4650(byte var1) {
      byte var2 = 38;
      int var3 = var2 + Class433.method5416(this.aString_6883, 1192303657);
      var3 += Class433.method5416(this.aString_6884, 569475128);
      var3 += Class433.method5416(this.aString_6868, 1434122041);
      var3 += Class433.method5416(this.aString_6886, -44915156);
      var3 += Class433.method5416(this.aString_6894, 309316387);
      var3 += Class433.method5416(this.aString_6871, 818931270);
      var3 += Class433.method5416(this.aString_6895, 1125779229);
      return var3;
   }

   static final void method4651(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.parentID * -671235497;
   }

   static final void method4652(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      if(var0.intTypes[-831324111 * var0.intTypeIndex] < var0.intTypes[var0.intTypeIndex * -831324111 + 1]) {
         var0.anInt_9510 += var0.anIntArray_9518[var0.anInt_9510 * -1756266293] * -1856838429;
      }

   }
}
