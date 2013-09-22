import java.io.IOException;
import java.util.Date;

public class Class19 {

   Class19() throws Throwable {
      throw new Error();
   }

   public static void method103(boolean var0, boolean var1, byte var2) {
      if(var0) {
         Class561.anInt_9586 -= -833651027;
         if(0 == 837326117 * Class561.anInt_9586) {
            Class561.colourMap = null;
         }
      }

      if(var1) {
         Class561.anInt_9584 -= 1705301153;
         if(-1504309407 * Class561.anInt_9584 == 0) {
            Class541.anIntArray_9470 = null;
         }
      }

   }

   static final void method104(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class568.method6249(var3, var4, var0, (short)-21200);
   }

   static final void method105(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      if(var4 == RSInterface.anInt_2588 * -300174805 || -1786357215 * RSInterface.anInt_2402 == var4 || var4 == RSInterface.anInt_2547 * 1428164041 || var4 == RSInterface.anInt_2404 * 143732427) {
         var0.anInt_2429 = var4 * 1563017241;
      }
   }

   static final void method106(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, short var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1536180677) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2527 = Class133.extractInterfaceData(var4, var2, (byte)69);
      var0.aBoolean_2524 = true;
   }

   static final void method107(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      boolean var3 = 1 == var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      if(null != Class248_Sub1.aNodeArrayList_6457) {
         NodeListNode var4 = Class248_Sub1.aNodeArrayList_6457.getNode((long)var2);
         if(var4 != null && !var3) {
            var4.shiftNext();
         } else if(var4 == null && var3) {
            var4 = new NodeListNode();
            Class248_Sub1.aNodeArrayList_6457.insert(var4, (long)var2);
         }
      }

   }

   static final void method108(RSInterfaceData var0, int var1) {
      Class3.setHigh((byte)-66);
      client.aClass296_348.method3789((byte)22);
      Class83.method1089(-1990728878);
      client.aBoolean_568 = false;
   }

   public static Class225 method109(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, byte var7) {
      if((var5?Class104_Sub21.renderSettings.aClass540_Sub14_7322.method1701(-1313412486):Class104_Sub21.renderSettings.aClass540_Sub14_7320.method1701(-1698423358)) != 0 && 0 != var1 && 1967345345 * Class217.anInt_3759 < 50 && -1 != var0) {
         Class225 var8 = new Class225((byte)(var5?3:2), var0, var1, var2, var3, var4, var6, (Class563_Sub1)null);
         Class217.aClass225Array_3760[(Class217.anInt_3759 += 1198145857) * 1967345345 - 1] = var8;
         return var8;
      } else {
         return null;
      }
   }

   static final void method110(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      String var3 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6240, client.lobbyConnectionHandler.aClass528_3433, 1917447504);
      var4.aClass240_Sub8_Sub1_7370.method4463(Class258.method3383(var2, -1752674607) + Class258.method3383(var3, -639681663), -914555398);
      var4.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-50);
      var4.aClass240_Sub8_Sub1_7370.putString(var3, (byte)-29);
      client.lobbyConnectionHandler.addPacket(var4, 1560098825);
   }

   static final void method111(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(Class506.aBoolean_9125) {
         Class516[] var3 = Class326.method4017(-376718181);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1824284839 * var3[var2].anInt_9214;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -443218857 * var3[var2].anInt_9215;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method112(RSInterface var0, int var1, byte[] var2, byte[] var3, RSInterfaceData var4, int var5) {
      if(var0.aByteArrayArray_2506 == null) {
         if(var2 == null) {
            return;
         }

         var0.aByteArrayArray_2506 = new byte[11][];
         var0.aByteArrayArray_2470 = new byte[11][];
         var0.anIntArray_2508 = new int[11];
         var0.anIntArray_2545 = new int[11];
      }

      var0.aByteArrayArray_2506[var1] = var2;
      if(null != var2) {
         var0.aBoolean_2505 = true;
      } else {
         var0.aBoolean_2505 = false;

         for(int var6 = 0; var6 < var0.aByteArrayArray_2506.length; ++var6) {
            if(var0.aByteArrayArray_2506[var6] != null || var0.anIntArray_2545[var6] > 0) {
               var0.aBoolean_2505 = true;
               break;
            }
         }
      }

      var0.aByteArrayArray_2470[var1] = var3;
   }

   public static void addStringToConsole(String var0, int var1) {
      if(null == Class194.consoleStrings) {
         Class410.method5065(-111049312);
      }

      client.aCalendar_574.setTime(new Date(Class373.getCurrentTime((short)24435)));
      int var2 = client.aCalendar_574.get(11);
      int var3 = client.aCalendar_574.get(12);
      int var4 = client.aCalendar_574.get(13);
      String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
      String[] var6 = Class136.method1799(var0, '\n', (byte)123);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         for(int var8 = Class194.anInt_3370 * 499415203; var8 > 0; --var8) {
            Class194.consoleStrings[var8] = Class194.consoleStrings[var8 - 1];
         }

         Class194.consoleStrings[0] = var5 + ": " + var6[var7];
         if(null != NodeList.aFileOutputStream_9066) {
            try {
               NodeList.aFileOutputStream_9066.write(Class566.encodeStr(Class194.consoleStrings[0] + "\n", (byte)8));
            } catch (IOException var9) {
               ;
            }
         }

         if(Class194.anInt_3370 * 499415203 < Class194.consoleStrings.length - 1) {
            Class194.anInt_3370 += -1844577525;
            if(Class194.anInt_3360 * -1724145265 > 0) {
               Class194.anInt_3360 += -1588830865;
            }
         }
      }

   }
}
