
final class Class110_Sub1 extends Class110 {

   void method1410(int var1) {
      Class217.aClass321_3761 = Class217.aClass321_3746;
      Class217.aClass321_3746 = null;
   }

   static final void method3148(int var0) {
      ByteArrayDataNode_Sub1 var1 = client.gameConnectionHandler.serverDataNode;

      for(int var2 = 0; var2 < -554157539 * client.anInt_337; ++var2) {
         int var3 = client.anIntArray_540[var2];
         NPC npc = (NPC)((Class240_Sub9)client.npcNodeList.getNode((long)var3)).anObject_6783;
         var1.readShort(234882262);
         int var5 = var1.readByte(1867929388);
         if(0 != (var5 & 4)) {
            var5 += var1.readByte(1398666343) << 8;
         }

         if((var5 & 8192) != 0) {
            var5 += var1.readByte(162236871) << 16;
         }

         if((var5 & 2097152) != 0) {
            var5 += var1.readByte(-1074427820) << 24;
         }

         if((var5 & 128) != 0) {
            if(npc.npcComposite.method5601(470037160)) {
               Class338.method4194(npc, -2078852711);
            }

            npc.method1179(Class104_Sub6.characterUnpacker.method5670(var1.method4493(-157074556), -17576282), (var5 & 262144) == 0, (var5 & 1048576) == 0, 65536);
            npc.method3256(npc.npcComposite.anInt_8665 * -1792142631, 59220262);
            npc.anInt_4340 = 258100611 * (-1526252727 * npc.npcComposite.anInt_8660 << 3);
            if(npc.npcComposite.method5601(1406245998)) {
               Class34_Sub3.method2775(npc.plane, npc.tilePosArrayX[0], npc.tilePosArrayY[0], 0, (Class534)null, npc, (Player)null, -1050643154);
            }
         }

         int var6;
         int var7;
         int var8;
         Class282 var9;
         Class340 var10;
         if(0 != (var5 & 8388608)) {
            npc.aClass468_4315.method5623((short)24556);
            var1.index += 207961638;
            var6 = var1.data[(var1.index += -2043502829) * 964952859 - 1] & 255;

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var1.method4502((short)-17317);
               var9 = (Class282)Class559.method6185(Class282.method3656((byte)-127), var8, (byte)55);
               var10 = AbstractServerConnection.aClass212_Sub1_Sub2_4038.method5498(var1, var9, 793926165);
               npc.aClass468_4315.method5622(-488503965 * var10.anInt_6534, var10.anObject_6535, (byte)41);
            }
         }

         if((var5 & 64) != 0) {
            npc.anInt_1790 = var1.method4531(-316951111) * 1251502459;
            npc.anInt_1780 = var1.method4527(469508800) * -1906549919;
         }

         int var19;
         int var21;
         if(0 != (var5 & 4194304)) {
            var6 = var1.data[(var1.index += -2043502829) * 964952859 - 1] & 255;

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var1.method4462((byte)17);
               var19 = var1.method4517(1508158261);
               var21 = var1.method4522(-1293784573);
               npc.method1167(var8, var19, var21, -2031794386);
            }
         }

         if((var5 & 262144) != 0) {
            npc.name = var1.method4485(1022613521);
            if("".equals(npc.name) || npc.name.equals(npc.npcComposite.name)) {
               npc.name = npc.npcComposite.name;
            }
         }

         if((var5 & 1048576) != 0) {
            npc.anInt_1779 = var1.method4527(1128874097) * -605294817;
            if(-850211617 * npc.anInt_1779 == '\uffff') {
               npc.anInt_1779 = 801759223 * npc.npcComposite.anInt_8631;
            }
         }

         int var11;
         int[] var17;
         int[] var18;
         if((var5 & 4096) != 0) {
            var6 = var1.method4462((byte)77);
            var18 = new int[var6];
            var17 = new int[var6];

            for(var19 = 0; var19 < var6; ++var19) {
               var21 = var1.method4529(1665501587);
               if('\uc000' == (var21 & '\uc000')) {
                  var11 = var1.method4527(1372033273);
                  var18[var19] = var21 << 16 | var11;
               } else {
                  var18[var19] = var21;
               }

               var17[var19] = var1.readShort(929252023);
            }

            npc.method3252(var18, var17, 1436395076);
         }

         if((var5 & 524288) != 0) {
            var1.index += 207961638;
            var6 = var1.data[(var1.index += -2043502829) * 964952859 - 1] & 255;

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var1.method4501(-1965975883);
               var9 = (Class282)Class559.method6185(Class282.method3656((byte)-44), var8, (byte)43);
               var10 = AbstractServerConnection.aClass212_Sub1_Sub2_4038.method5498(var1, var9, -1325097144);
               npc.aClass468_4315.method5622(var10.anInt_6534 * -488503965, var10.anObject_6535, (byte)43);
            }
         }

         if(0 != (var5 & 2048)) {
            npc.anInt_1784 = var1.readShort(-1138888067) * -1529983809;
            if(npc.anInt_1784 * -914152641 == '\uffff') {
               npc.anInt_1784 = 1529983809;
            }
         }

         if((var5 & 16) != 0) {
            int[] var16 = new int[Class12.method70((byte)16).length];

            for(var7 = 0; var7 < Class12.method70((byte)16).length; ++var7) {
               var16[var7] = var1.method4493(-157074556);
            }

            var7 = var1.method4502((short)-23777);
            Class532.method6035(npc, var16, var7, true, 48063579);
         }

         if(0 != (var5 & 32)) {
            npc.anInt_4312 = var1.method4531(-1123516399) * -1835832949;
            if(npc.anInt_4312 * 1994913315 == '\uffff') {
               npc.anInt_4312 = 1835832949;
            }
         }

         boolean var20;
         if(0 != (var5 & '\u8000')) {
            var6 = var1.readShort(-521171148);
            var7 = var1.method4480(1260717178);
            if(var6 == '\uffff') {
               var6 = -1;
            }

            var8 = var1.method4502((short)-15405);
            var19 = var8 & 7;
            var21 = var8 >> 3 & 15;
            if(var21 == 15) {
               var21 = -1;
            }

            var20 = (var8 >> 7 & 1) == 1;
            npc.method3277(var6, var7, var19, var21, var20, 1, (short)1020);
         }

         if((var5 & 16384) != 0) {
            npc.anInt_4318 = var1.getByte((byte)79) * 1384380397;
            npc.anInt_4320 = var1.method4503((byte)-58) * -1094048127;
            npc.anInt_4330 = var1.method4524(-25913821) * 1566537373;
            npc.anInt_4322 = var1.method4503((byte)-83) * 120980283;
            npc.anInt_4321 = (var1.method4529(1689056903) + client.timer * -1025618511) * -2124444203;
            npc.anInt_4317 = (var1.method4529(1340104825) + -1025618511 * client.timer) * 694381903;
            npc.anInt_4324 = var1.readShort(-93182323) * -1304479459;
            npc.anInt_4318 += 1384380397 * npc.tilePosArrayX[0];
            npc.anInt_4320 += npc.tilePosArrayY[0] * -1094048127;
            npc.anInt_4330 += 1566537373 * npc.tilePosArrayX[0];
            npc.anInt_4322 += 120980283 * npc.tilePosArrayY[0];
            npc.anInt_4331 = -380906067;
            npc.anInt_4345 = 0;
         }

         int var12;
         int var13;
         if(0 != (var5 & 2)) {
            var6 = var1.method4501(-1965975883);
            if(var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var19 = -1;
                  boolean var22 = true;
                  var11 = -1;
                  var8 = var1.method4490((byte)0);
                  if(32767 == var8) {
                     var8 = var1.method4490((byte)0);
                     var21 = var1.method4490((byte)0);
                     var19 = var1.method4490((byte)0);
                     var11 = var1.method4490((byte)0);
                  } else if(var8 != 32766) {
                     var21 = var1.method4490((byte)0);
                  } else {
                     var8 = -1;
                     var21 = var1.method4462((byte)26);
                  }

                  var12 = var1.method4490((byte)0);
                  npc.damage(var8, var21, var19, var11, -1025618511 * client.timer, var12, 1672176257);
               }
            }

            var7 = var1.method4462((byte)55);
            if(var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var19 = var1.method4490((byte)0);
                  var21 = var1.method4490((byte)0);
                  if(var21 != 32767) {
                     var11 = var1.method4490((byte)0);
                     var12 = var1.method4501(-1965975883);
                     var13 = var21 > 0?var1.method4462((byte)42):var12;
                     npc.method3255(var19, -1025618511 * client.timer, var21, var11, var12, var13, (byte)-69);
                  } else {
                     npc.method3253(var19, 49675196);
                  }
               }
            }
         }

         if((var5 & 8) != 0) {
            npc.method1171(var1.method4485(431161326), 0, 0, 1773827960);
         }

         long var14;
         short[] var25;
         int[] var27;
         short[] var26;
         if(0 != (var5 & 65536)) {
            var6 = npc.npcComposite.anIntArray_8641.length;
            var7 = 0;
            if(npc.npcComposite.aShortArray_8617 != null) {
               var7 = npc.npcComposite.aShortArray_8617.length;
            }

            byte var23 = 0;
            if(npc.npcComposite.aShortArray_8620 != null) {
               var7 = npc.npcComposite.aShortArray_8620.length;
            }

            var19 = var1.method4501(-1965975883);
            if((var19 & 1) != 1) {
               var1.index += 207961638;
               var27 = null;
               if(2 == (var19 & 2)) {
                  var27 = new int[var6];

                  for(var11 = 0; var11 < var6; ++var11) {
                     var27[var11] = var1.method4493(-157074556);
                  }
               }

               var25 = null;
               if(4 == (var19 & 4)) {
                  var25 = new short[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var25[var12] = (short)var1.readShort(17476787);
                  }
               }

               var26 = null;
               if(8 == (var19 & 8)) {
                  var26 = new short[var23];

                  for(var13 = 0; var13 < var23; ++var13) {
                     var26[var13] = (short)var1.method4531(-1516887177);
                  }
               }

               var14 = (long)((NPC.anInt_1783 += -846233693) * -1143165941 - 1);
               new Class442(var14, var27, var25, var26);
            }
         }

         if(0 != (var5 & 1024)) {
            var6 = npc.npcComposite.anIntArray_8655.length;
            var7 = 0;
            if(null != npc.npcComposite.aShortArray_8617) {
               var7 = npc.npcComposite.aShortArray_8617.length;
            }

            var8 = 0;
            if(npc.npcComposite.aShortArray_8620 != null) {
               var8 = npc.npcComposite.aShortArray_8620.length;
            }

            var19 = var1.readByte(-1034700858);
            if((var19 & 1) == 1) {
               npc.aClass442_1781 = null;
            } else {
               var1.index += 207961638;
               var27 = null;
               if(2 == (var19 & 2)) {
                  var27 = new int[var6];

                  for(var11 = 0; var11 < var6; ++var11) {
                     var27[var11] = var1.method4493(-157074556);
                  }
               }

               var25 = null;
               if(4 == (var19 & 4)) {
                  var25 = new short[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var25[var12] = (short)var1.method4527(1776195911);
                  }
               }

               var26 = null;
               if((var19 & 8) == 8) {
                  var26 = new short[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var26[var13] = (short)var1.method4527(295201499);
                  }
               }

               var14 = (long)((NPC.anInt_1782 += 1353232613) * 1078693101 - 1);
               npc.aClass442_1781 = new Class442(var14, var27, var25, var26);
            }
         }

         if((var5 & 131072) != 0) {
            npc.aByte_4327 = var1.getByte((byte)77);
            npc.aByte_4328 = var1.method4505((byte)30);
            npc.aByte_4351 = var1.method4524(-25913821);
            npc.aByte_4329 = (byte)var1.method4502((short)-21006);
            npc.anInt_4325 = (-1025618511 * client.timer + var1.method4531(6753442)) * -364320881;
            npc.anInt_4326 = (-1025618511 * client.timer + var1.readShort(335226681)) * -375944533;
         }

         if(0 != (var5 & 16777216)) {
            var6 = var1.method4531(-70913135);
            var7 = var1.method4517(-407006159);
            if(var6 == '\uffff') {
               var6 = -1;
            }

            var8 = var1.readByte(1697940386);
            var19 = var8 & 7;
            var21 = var8 >> 3 & 15;
            if(var21 == 15) {
               var21 = -1;
            }

            var20 = 1 == (var8 >> 7 & 1);
            npc.method3277(var6, var7, var19, var21, var20, 2, (short)1020);
         }

         if(0 != (var5 & 33554432)) {
            var6 = var1.method4527(790280648);
            var7 = var1.method4519((byte)2);
            if('\uffff' == var6) {
               var6 = -1;
            }

            var8 = var1.method4462((byte)55);
            var19 = var8 & 7;
            var21 = var8 >> 3 & 15;
            if(15 == var21) {
               var21 = -1;
            }

            var20 = (var8 >> 7 & 1) == 1;
            npc.method3277(var6, var7, var19, var21, var20, 3, (short)1020);
         }

         if(0 != (var5 & 512)) {
            var6 = var1.method4502((short)-28338);
            var18 = new int[var6];
            var17 = new int[var6];
            int[] var24 = new int[var6];

            for(var21 = 0; var21 < var6; ++var21) {
               var11 = var1.method4493(-157074556);
               var18[var21] = var11;
               var17[var21] = var1.method4502((short)-28740);
               var24[var21] = var1.method4527(1552354142);
            }

            Class278.method3621(npc, var18, var17, var24, (byte)0);
         }

         if((var5 & 1) != 0) {
            var6 = var1.readShort(1309211141);
            var7 = var1.method4517(-825664993);
            if(var6 == '\uffff') {
               var6 = -1;
            }

            var8 = var1.readByte(-303815225);
            var19 = var8 & 7;
            var21 = var8 >> 3 & 15;
            if(15 == var21) {
               var21 = -1;
            }

            var20 = 1 == (var8 >> 7 & 1);
            npc.method3277(var6, var7, var19, var21, var20, 0, (short)1020);
         }
      }

   }

   public static void method3149(RSInterface var0, int var1) {
      if(client.anInt_555 * 1368240509 == 2094020073 * var0.anInt_2591) {
         client.aBooleanArray_525[-1927071795 * var0.anInt_2590] = true;
      }

   }

   static final void method3150(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class599.method6480(var3, var4, var0, 1712613019);
   }
}
