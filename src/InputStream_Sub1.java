import java.io.InputStream;

public class InputStream_Sub1 extends InputStream {

   public int read() {
      RSInterface.method1724(30000L);
      return -1;
   }

   static final void method1209(ByteArrayDataNode_Sub1 var0, int index, Player player, int var3, int var4) {
      byte var5 = Class539.aClass539_9457.aByte_9460;
      if((var3 & 2) != 0) {
         Class15.aByteArray_124[index] = var0.getByte((byte)28);
      }

      if(0 != (var3 & 1024)) {
         var5 = var0.getByte((byte)59);
      }

      if(0 != (var3 & 16384)) {
         player.aBoolean_1458 = var0.method4462((byte)37) == 1;
      }

      if(0 != (var3 & 2048)) {
         player.anInt_4318 = var0.getByte((byte)73) * 1384380397;
         player.anInt_4320 = var0.getByte((byte)91) * -1094048127;
         player.anInt_4330 = var0.method4524(-25913821) * 1566537373;
         player.anInt_4322 = var0.getByte((byte)13) * 120980283;
         player.anInt_4321 = (var0.readShort(903757503) + -1025618511 * client.timer) * -2124444203;
         player.anInt_4317 = (var0.readShort(-1269010967) + -1025618511 * client.timer) * 694381903;
         player.anInt_4324 = var0.readShort(146868841) * -1304479459;
         if(player.aBoolean_1481) {
            player.anInt_4318 += player.anInt_1483 * 1503048947;
            player.anInt_4320 += player.anInt_1472 * -789321941;
            player.anInt_4330 += player.anInt_1483 * 1009088579;
            player.anInt_4322 += 281509225 * player.anInt_1472;
            player.anInt_4331 = 0;
         } else {
            player.anInt_4318 += 1384380397 * player.tilePosArrayX[0];
            player.anInt_4320 += player.tilePosArrayY[0] * -1094048127;
            player.anInt_4330 += 1566537373 * player.tilePosArrayX[0];
            player.anInt_4322 += 120980283 * player.tilePosArrayY[0];
            player.anInt_4331 = -380906067;
         }

         player.anInt_4345 = 0;
      }

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      boolean var11;
      if(0 != (var3 & 4194304)) {
         var6 = var0.method4531(-1196578483);
         var7 = var0.method4518(1633730647);
         if('\uffff' == var6) {
            var6 = -1;
         }

         var8 = var0.method4462((byte)45);
         var9 = var8 & 7;
         var10 = var8 >> 3 & 15;
         if(var10 == 15) {
            var10 = -1;
         }

         var11 = (var8 >> 7 & 1) == 1;
         player.method3277(var6, var7, var9, var10, var11, 3, (short)1020);
      }

      int var18;
      if((var3 & 8) != 0) {
         var6 = var0.readByte(-681367901);
         int var12;
         if(var6 > 0) {
            for(var7 = 0; var7 < var6; ++var7) {
               var9 = -1;
               boolean var17 = true;
               var18 = -1;
               var8 = var0.method4490((byte)0);
               if(var8 == 32767) {
                  var8 = var0.method4490((byte)0);
                  var10 = var0.method4490((byte)0);
                  var9 = var0.method4490((byte)0);
                  var18 = var0.method4490((byte)0);
               } else if(var8 != 32766) {
                  var10 = var0.method4490((byte)0);
               } else {
                  var8 = -1;
                  var10 = var0.method4502((short)-5245);
               }

               var12 = var0.method4490((byte)0);
               player.damage(var8, var10, var9, var18, -1025618511 * client.timer, var12, -543300067);
            }
         }

         var7 = var0.method4501(-1965975883);
         if(var7 > 0) {
            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var0.method4490((byte)0);
               var10 = var0.method4490((byte)0);
               if(var10 != 32767) {
                  var18 = var0.method4490((byte)0);
                  var12 = var0.method4502((short)-14581);
                  int var13 = var10 > 0?var0.method4501(-1965975883):var12;
                  player.method3255(var9, -1025618511 * client.timer, var10, var18, var12, var13, (byte)-124);
               } else {
                  player.method3253(var9, 49675196);
               }
            }
         }
      }

      Class282 var21;
      Class340 var25;
      if(0 != (var3 & 8388608)) {
         player.aClass468_4315.method5623((short)1441);
         var0.index += 207961638;
         var6 = var0.data[(var0.index += -2043502829) * 964952859 - 1] & 255;

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var0.method4501(-1965975883);
            var21 = (Class282)Class587.method6371(Class282.class, var8, 199795592);
            var25 = Class104_Sub14.aClass212_Sub1_Sub1_10688.method5498(var0, var21, -1583260957);
            player.aClass468_4315.method5622(-488503965 * var25.anInt_6534, var25.anObject_6535, (byte)121);
         }
      }

      if((var3 & 131072) != 0) {
         var6 = var0.method4531(-774215766);
         var7 = var0.method4518(1438633766);
         if('\uffff' == var6) {
            var6 = -1;
         }

         var8 = var0.method4501(-1965975883);
         var9 = var8 & 7;
         var10 = var8 >> 3 & 15;
         if(15 == var10) {
            var10 = -1;
         }

         var11 = (var8 >> 7 & 1) == 1;
         player.method3277(var6, var7, var9, var10, var11, 2, (short)1020);
      }

      if((var3 & 64) != 0) {
         var6 = var0.method4502((short)-20328);
         byte[] var14 = new byte[var6];
         ByteArrayDataNode var16 = new ByteArrayDataNode(var14);
         var0.method4508(var14, 0, var6, (byte)0);
         Class15.aClass240_Sub8Array_126[index] = var16;
         player.method991(var16, 210689723);
      }

      if((var3 & 262144) != 0) {
         player.aBoolean_1486 = var0.method4502((short)-7179) == 1;
      }

      String var15;
      if(0 != (var3 & '\u8000')) {
         var15 = var0.method4485(-523252201);
         if(player == Class521.myPlayer) {
            Class634.method6708(2, 0, player.getName(true, 954208950), player.method997(false, 223608901), player.aString_1467, var15, (byte)118);
         }

         player.method1006(var15, 0, 0, (byte)24);
      }

      if(0 != (var3 & 1)) {
         var6 = var0.readShort(-62003730);
         if(var6 == '\uffff') {
            var6 = -1;
         }

         player.anInt_4312 = var6 * -1835832949;
      }

      if((var3 & 65536) != 0) {
         player.aByte_4327 = var0.getByte((byte)5);
         player.aByte_4328 = var0.method4505((byte)47);
         player.aByte_4351 = var0.getByte((byte)82);
         player.aByte_4329 = (byte)var0.method4502((short)-17133);
         player.anInt_4325 = (-1025618511 * client.timer + var0.method4527(981032186)) * -364320881;
         player.anInt_4326 = (-1025618511 * client.timer + var0.method4531(-419615907)) * -375944533;
      }

      if(0 != (var3 & 32)) {
         int[] var20 = new int[Class12.method70((byte)16).length];

         for(var7 = 0; var7 < Class12.method70((byte)16).length; ++var7) {
            var20[var7] = var0.method4493(-157074556);
         }

         var7 = var0.readByte(-383187930);
         Class532.method6035(player, var20, var7, false, 48063579);
      }

      if((var3 & 2097152) != 0) {
         var15 = var0.method4485(-395398739);
         var7 = var0.method4462((byte)3);
         if(0 != (var7 & 1)) {
            Class634.method6708(2, var7, player.getName(true, -1034999863), player.method997(false, -1014302640), player.aString_1467, var15, (byte)126);
         }

         player.method1006(var15, 0, 0, (byte)24);
      }

      if((var3 & 8192) != 0) {
         var6 = var0.method4531(822910364);
         var7 = var0.method4517(-1629960506);
         if('\uffff' == var6) {
            var6 = -1;
         }

         var8 = var0.method4462((byte)4);
         var9 = var8 & 7;
         var10 = var8 >> 3 & 15;
         if(15 == var10) {
            var10 = -1;
         }

         var11 = (var8 >> 7 & 1) == 1;
         player.method3277(var6, var7, var9, var10, var11, 1, (short)1020);
      }

      int[] var19;
      int[] var23;
      if(0 != (var3 & 1048576)) {
         var6 = var0.method4462((byte)120);
         var19 = new int[var6];
         var23 = new int[var6];

         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var0.method4529(1441579334);
            if('\uc000' == (var10 & '\uc000')) {
               var18 = var0.readShort(1179332901);
               var19[var9] = var10 << 16 | var18;
            } else {
               var19[var9] = var10;
            }

            var23[var9] = var0.method4527(42307261);
         }

         player.method3252(var19, var23, 2140066856);
      }

      if((var3 & 128) != 0) {
         var6 = var0.readShort(2053343612);
         var7 = var0.method4519((byte)85);
         if('\uffff' == var6) {
            var6 = -1;
         }

         var8 = var0.method4502((short)-9312);
         var9 = var8 & 7;
         var10 = var8 >> 3 & 15;
         if(var10 == 15) {
            var10 = -1;
         }

         var11 = 1 == (var8 >> 7 & 1);
         player.method3277(var6, var7, var9, var10, var11, 0, (short)1020);
      }

      if(0 != (var3 & 4096)) {
         var6 = var0.readByte(-124953626);
         var19 = new int[var6];
         var23 = new int[var6];
         int[] var22 = new int[var6];

         for(var10 = 0; var10 < var6; ++var10) {
            var19[var10] = var0.method4493(-157074556);
            var23[var10] = var0.method4501(-1965975883);
            var22[var10] = var0.method4527(1828686642);
         }

         Class278.method3621(player, var19, var23, var22, (byte)0);
      }

      if((var3 & 524288) != 0) {
         var0.index += 207961638;
         var6 = var0.data[(var0.index += -2043502829) * 964952859 - 1] & 255;

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var0.method4501(-1965975883);
            var21 = (Class282)Class587.method6371(Class282.class, var8, -1829722215);
            var25 = Class104_Sub14.aClass212_Sub1_Sub1_10688.method5498(var0, var21, -1008089182);
            player.aClass468_4315.method5622(-488503965 * var25.anInt_6534, var25.anObject_6535, (byte)66);
         }
      }

      if((var3 & 16) != 0) {
         player.anInt_1480 = var0.method4531(422827439) * 1607630841;
         if(0 == player.anInt_4331 * -74820059) {
            player.method3249(1917456969 * player.anInt_1480, -1144561297);
            player.anInt_1480 = -1607630841;
         }
      }

      if(player.aBoolean_1481) {
         if(var5 == 127) {
            player.method1011(player.anInt_1483 * -2114583457, player.anInt_1472 * 110800811, 726495336);
         } else {
            byte var24;
            if(var5 != Class539.aClass539_9457.aByte_9460) {
               var24 = var5;
            } else {
               var24 = Class15.aByteArray_124[index];
            }

            Class494.method5778(player, var24, 1111472821);
            player.method998(-2114583457 * player.anInt_1483, player.anInt_1472 * 110800811, var24, (byte)80);
         }
      }

   }
}
