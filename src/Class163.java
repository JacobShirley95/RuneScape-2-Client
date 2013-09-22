
public class Class163 {

   int anInt_2818;
   Class183[] aClass183Array_2819;


   public Class183 method1996(int var1, byte var2) {
      return this.aClass183Array_2819[var1];
   }

   public Class163(CacheDataUnpacker var1) {
      this.anInt_2818 = var1.method3575(0, -1560647445) * -151923233;
      this.aClass183Array_2819 = new Class183[this.anInt_2818 * -66574817];

      for(int var2 = 0; var2 < -66574817 * this.anInt_2818; ++var2) {
         ByteArrayDataNode var3 = new ByteArrayDataNode(var1.getDataBytes(0, var2, -404272310));
         if(null == var3.data) {
            this.aClass183Array_2819[var2] = null;
         } else {
            try {
               Class183 var4 = new Class183();
               int var5 = var3.readByte(-262557275);
               if(0 == var5) {
                  var4.anInt_3112 = 1541323456;
               } else if(1 == var5) {
                  var4.anInt_3112 = -1212320384;
               } else if(var5 == 2) {
                  var4.anInt_3112 = 1870326528;
               } else if(var5 == 3) {
                  var4.anInt_3112 = -554314240;
               } else if(4 == var5) {
                  var4.anInt_3112 = -1108628480;
               }

               int var6 = var3.method4480(1260717178);
               if((var6 & 1) != 0) {
                  var4.anInt_3146 = var3.readShort(1392503002) * 830698707;
                  var3.readByte(518756048);
               }

               int var7;
               if(0 != (var6 & 4096)) {
                  var4.anIntArray_3147 = new int[6];
                  var4.aByteArray_3148 = new byte[6];

                  for(var7 = 0; var7 < 6; ++var7) {
                     var4.anIntArray_3147[var7] = var3.readShort(1537634479);
                     var4.aByteArray_3148[var7] = (byte)var3.readByte(1033199833);
                  }
               }

               if((var6 & 2) != 0) {
                  var3.readShort(1153795866);
                  var3.readByte(1552917302);
               }

               if((var6 & 4) != 0) {
                  var3.readShort(-353018684);
                  var3.readByte(-1037509499);
               }

               if((var6 & 8) != 0) {
                  var3.readShort(1530800491);
               }

               if((var6 & 16) != 0) {
                  var3.readShort(1916796135);
                  var3.readByte(1390953173);
               }

               if(0 != (var6 & 32)) {
                  var3.readShort(-1239020587);
                  var3.readByte(462427474);
               }

               if(0 != (var6 & 64)) {
                  var3.readShort(2017750139);
                  var3.readByte(-395143894);
               }

               if((var6 & 128) != 0) {
                  var3.readShort(1534442023);
                  var3.readByte(1594688196);
               }

               if(0 != (var6 & 256)) {
                  var3.readShort(1297651250);
                  var3.readByte(1388774971);
               }

               if(0 != (var6 & 512)) {
                  var3.readShort(47716526);
                  var3.readByte(1355937860);
               }

               if((var6 & 1024) != 0) {
                  var3.readShort(-1032293218);
                  var3.readByte(159641277);
               }

               if((var6 & 2048) != 0) {
                  var3.readShort(674056011);
                  var3.readByte(2109077807);
               }

               var7 = var3.readByte(-273825724);
               var4.aByte_3154 = (byte)(var7 & 15);
               var4.aByte_3111 = (byte)(var7 >> 4 & 15);
               int var8 = var3.method4480(1260717178);
               if((var8 & 16) != 0) {
                  var3.method4494(-822261228);
                  var3.method4494(-822261228);
               }

               if((var8 & 32) != 0) {
                  var3.method4480(1260717178);
               }

               if(0 != (var8 & 64)) {
                  var3.method4480(1260717178);
               }

               if(0 != (var8 & 128)) {
                  var3.method4480(1260717178);
               }

               if((var8 & 256) != 0) {
                  var3.method4480(1260717178);
               }

               if((var8 & 512) != 0) {
                  var3.method4480(1260717178);
               }

               var4.aBoolean_3141 = var3.readByte(352217083) == 1;
               Class559.method6185(Class585_Sub1.method4153(139785021), var3.readByte(-188228156), (byte)-35);
               Class559.method6185(Class178.method2231(293556586), var3.readByte(933466074), (byte)-22);
               var4.aClass620_3153 = (Class620)Class559.method6185(Class3.method13((byte)5), var3.readByte(-924295062), (byte)119);
               if(var4.aClass620_3153 == Class620.aClass620_10021) {
                  var3.readByte(-385331075);
               }

               int var9 = var3.readByte(1026649156);
               if((var9 & 1) != 0) {
                  var4.aByte_3145 = (byte)var3.readByte(424397146);
               }

               if(0 != (var9 & 2)) {
                  var4.aByte_3157 = (byte)var3.readByte(689823431);
               }

               if(0 != (var9 & 4)) {
                  var3.readByte(-192361414);
               }

               if(0 != (var9 & 8)) {
                  var3.readByte(-888324247);
               }

               if(var3.readByte(97961590) == 1) {
                  var4.aByte_3169 = (byte)var3.readByte(437069626);
                  var4.aByte_3170 = (byte)var3.readByte(-1093237653);
                  var4.anInt_3171 = var3.method4480(1260717178) * 882390869;
                  var4.aByte_3155 = (byte)var3.readByte(-322162034);
                  var3.readByte(-974949631);
                  var4.aByte_3143 = (byte)var3.readByte(-921911419);
                  var4.aBoolean_3152 = var3.readByte(-8646796) == 1;
                  var4.aBoolean_3174 = var3.readByte(-120264260) == 1;
                  var4.aByte_3176 = (byte)var3.readByte(1430559538);
                  var4.aByte_3165 = (byte)var3.readByte(3356314);
                  var4.aShort_3118 = (short)var3.readShort(914125953);
               }

               this.aClass183Array_2819[var2] = var4;
            } catch (Exception var10) {
               this.aClass183Array_2819[var2] = null;
            }
         }
      }

   }

   public static void method1997(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Class489.method5747(var5, var6, 100, -1729029104);
      Class217.aClass321_3746 = new Class321(var0, var1 << 9, var2 << 9, var3 << 8, var4 * 8);
   }

   static final void method1998(RSInterfaceData var0, byte var1) {
      Class187 var2 = (Class187)var0.composite.anObjectArray_3548[var0.anInt_9510 * -1756266293];
      Class169 var3 = (Class169)(0 == var0.anIntArray_9518[var0.anInt_9510 * -1756266293]?var0.aMap_9513.get(var2.aClass283_3201):var0.targetMap.get(var2.aClass283_3201));
      Class282 var4 = var2.aClass373_3197.method4745(1290182620);
      if(Class282.aClass282_4773 == var4) {
         if(Class283.aClass283_4783 == var2.aClass283_3201) {
            Class567.method6244(var2, 306700825);
         }

         var3.method2111(var2, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 1754782118);
      } else if(Class282.aClass282_4778 == var4) {
         var3.method2106(var2, var0.aLongArray_9519[(var0.longTypeIndex -= -1088659337) * 973044039]);
      } else {
         if(Class282.aClass282_4772 != var4) {
            throw new RuntimeException();
         }

         if(Class283.aClass283_4783 == var2.aClass283_3201) {
            Class446.method5493(var2, (byte)66);
         }

         var3.method2097(var2, var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783], (byte)36);
      }

   }

   public static int method1999(int var0, int var1, int var2) {
      int var3;
      for(var3 = 1; var1 > 1; var1 >>= 1) {
         if((var1 & 1) != 0) {
            var3 *= var0;
         }

         var0 *= var0;
      }

      if(var1 == 1) {
         return var0 * var3;
      } else {
         return var3;
      }
   }

   static Class240_Sub27 method2000(int var0, int var1, int var2, int var3) {
      Class240_Sub27 var4 = null;
      if(var2 == 0) {
         var4 = Class47_Sub1.method3496(Class326.aClass326_6299, client.gameConnectionHandler.aClass528_3433, 1917447504);
      }

      if(var2 == 1) {
         var4 = Class47_Sub1.method3496(Class326.aClass326_6218, client.gameConnectionHandler.aClass528_3433, 1917447504);
      }

      MapPoint var5 = client.aClass296_348.getMapArea();
      var4.aClass240_Sub8_Sub1_7370.method4463(var0 + 1265321541 * var5.loadedMapX, 862223362);
      var4.aClass240_Sub8_Sub1_7370.putShort(var5.loadedMapY * -1996781083 + var1, -800873599);
      var4.aClass240_Sub8_Sub1_7370.method4477(Class338.method4190(1126359145)?1:0, (byte)88);
      Class192.flagX = var0 * 624818685;
      Class192.flagY = -2043346881 * var1;
      Class192.flagNotPresent = false;
      Class535.method6062(1471462747);
      return var4;
   }

   static final void method2001(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(2 == client.anInt_567 * -826987519 && var2 < -1301826725 * client.friendsCount) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -986299273 * client.friendsList[var2].anInt_49;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method2002(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class240_Sub22_Sub10 var4 = Class534.aClass275_9439.method3606(var2, -637985141);
      int var5 = var4.anIntArray_3540[var3];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var5;
   }

   static final void method2003(RSInterfaceData var0, int var1) {
      Class450.method5523(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], -1, -1, false, (byte)5);
   }

   static final void method2004(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      GameCoord var3 = GameCoord.createCoord((float)var2, (float)var2, (float)var2);
      Class542.aClass43_Sub1_9475.method359(var3, (byte)-49);
      var3.store();
   }
}
