
public class Class239 {

   int[] anIntArray_4039;
   int anInt_4040 = 786299157;
   int anInt_4041 = -1220809773;
   Class266 aClass266_4042;
   int anInt_4043;
   static int anInt_4044;


   void method3082(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(927752481);
         if(0 == var3) {
            return;
         }

         this.method3083(var1, var3, (byte)2);
      }
   }

   void method3083(ByteArrayDataNode var1, int var2, byte var3) {
      if(1 == var2) {
         this.anInt_4041 = var1.readShort(1202770177) * 1220809773;
      } else if(2 == var2) {
         this.anIntArray_4039 = new int[var1.readByte(328271023)];

         for(int var4 = 0; var4 < this.anIntArray_4039.length; ++var4) {
            this.anIntArray_4039[var4] = var1.readShort(-1296770387);
         }
      } else if(3 == var2) {
         this.anInt_4040 = var1.readByte(1690006085) * -786299157;
      } else if(4 == var2) {
         this.aClass266_4042 = (Class266)Class559.method6185(Class100.method1290(-185789841), var1.readByte(272094989), (byte)-74);
      } else if(var2 == 5) {
         this.anInt_4043 = var1.method4493(-157074556) * -1882206713;
      } else if(6 == var2) {
         var1.method4493(-157074556);
      }

   }

   Class239() {
      this.aClass266_4042 = Class266.aClass266_4637;
      this.anInt_4043 = 1882206713;
   }

   static final void method3084(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      var0.intTypeIndex -= 1462854468;
      float var2 = (float)var0.intTypes[-831324111 * var0.intTypeIndex];
      float var3 = (float)var0.intTypes[1 + var0.intTypeIndex * -831324111];
      float var4 = (float)var0.intTypes[2 + -831324111 * var0.intTypeIndex];
      float var5 = (float)var0.intTypes[var0.intTypeIndex * -831324111 + 3] / 1000.0F;
      Class542.aClass43_Sub1_9475.method360(GameCoord.createCoord(var2, var3, var4), var5, (byte)91);
   }

   static final void method3085(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class234.method3013(var3, var4, true, 2, var0, 529029905);
   }

   public static String method3086(long var0, int var2, int var3) {
      Class544.method6092(var0);
      int var4 = Class461.aCalendar_8600.get(5);
      int var5 = Class461.aCalendar_8600.get(2);
      int var6 = Class461.aCalendar_8600.get(1);
      return var2 == 3?Class279.method3624(var0, var2, 1808873535):Integer.toString(var4 / 10) + var4 % 10 + "-" + Class461.aStringArrayArray_8601[var2][var5] + "-" + var6;
   }

   static final void method3087(long var0) {
      GameCoord var2 = Class521.myPlayer.method6203().gameCoord;
      int var3 = (int)var2.floatX + 1052057935 * client.anInt_469;
      int var4 = (int)var2.floatZ + 1635662145 * client.anInt_569;
      if(1890624197 * Class326.anInt_6334 - var3 < -2000 || Class326.anInt_6334 * 1890624197 - var3 > 2000 || -1205230297 * Class349.anInt_6617 - var4 < -2000 || Class349.anInt_6617 * -1205230297 - var4 > 2000) {
         Class326.anInt_6334 = 104107021 * var3;
         Class349.anInt_6617 = var4 * -1773307241;
      }

      int var5;
      int var6;
      if(Class326.anInt_6334 * 1890624197 != var3) {
         var5 = var3 - 1890624197 * Class326.anInt_6334;
         var6 = (int)(var0 * (long)var5 / 320L);
         if(var5 > 0) {
            if(0 == var6) {
               var6 = 1;
            } else if(var6 > var5) {
               var6 = var5;
            }
         } else if(var6 == 0) {
            var6 = -1;
         } else if(var6 < var5) {
            var6 = var5;
         }

         Class326.anInt_6334 += 104107021 * var6;
      }

      if(var4 != -1205230297 * Class349.anInt_6617) {
         var5 = var4 - Class349.anInt_6617 * -1205230297;
         var6 = (int)(var0 * (long)var5 / 320L);
         if(var5 > 0) {
            if(0 == var6) {
               var6 = 1;
            } else if(var6 > var5) {
               var6 = var5;
            }
         } else if(var6 == 0) {
            var6 = -1;
         } else if(var6 < var5) {
            var6 = var5;
         }

         Class349.anInt_6617 += -1773307241 * var6;
      }

      client.aFloat_501 += (float)var0 * client.aFloat_389 / 6.0F;
      client.aFloat_387 += client.aFloat_390 * (float)var0 / 6.0F;
      Class509.method5913((byte)16);
   }

   static InterfaceDataComposite method3088(int var0, int var1) {
      InterfaceDataComposite var2 = (InterfaceDataComposite)Class568.aClass603_9631.method6504((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class215.aCacheUnpacker_3739.getDataBytes(var0, 0, -462177047);
         if(var3 != null && var3.length > 1) {
            try {
               var2 = PlayerComposite.createInterfaceComposite(var3, 1321212181);
            } catch (Exception var5) {
               throw new RuntimeException(var5.getMessage() + " " + var0);
            }

            Class568.aClass603_9631.method6505(var2, (long)var0);
            return var2;
         } else {
            return null;
         }
      }
   }

   public static void method3089(byte var0) {
      MapElements.method2925((byte)20);
      Class46.method437(-1362619026);
      Class417.method5179((byte)24);
      Class53.method540((byte)-41);
   }

   static final void method3090(RSInterfaceData var0, int var1) {
      Class125.method1608(false, (byte)-68);
   }

   static final void method3091(RSInterfaceData var0, byte var1) {
      var0.longTypeIndex -= 2117648622;
      if(var0.aLongArray_9519[var0.longTypeIndex * 973044039] <= var0.aLongArray_9519[var0.longTypeIndex * 973044039 + 1]) {
         var0.anInt_9510 += var0.anIntArray_9518[-1756266293 * var0.anInt_9510] * -1856838429;
      }

   }
}
