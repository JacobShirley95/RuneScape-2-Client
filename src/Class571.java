
public class Class571 {

   public int anInt_9634 = 0;
   Class565 aClass565_9635;
   int anInt_9636;
   public boolean aBoolean_9637 = false;
   public int anInt_9638 = 2074545753;
   public int anInt_9639 = 1270638561;
   public int anInt_9640 = 666225137;
   public boolean aBoolean_9641 = true;
   public int anInt_9642 = 0;
   public int anInt_9643 = 166314072;
   public int anInt_9644 = -151905792;
   public int anInt_9645 = 1267037621;
   public int anInt_9646 = 1859715776;
   public boolean aBoolean_9647 = true;
   public int anInt_9648 = -1158021169;
   static final int anInt_9649 = 1190717;
   public int anInt_9650 = -914124480;
   public static Class587 aClass587_9651;
   public static int anInt_9652;
   public static Sprite aClass170_9653;


   void method6263(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(267520564);
         if(var3 == 0) {
            return;
         }

         this.method6264(var1, var3, -613962163);
      }
   }

   void method6264(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         this.anInt_9634 = Class52.method537(var1.method4479(738776218), 1840693789) * 544828475;
      } else if(var2 == 2) {
         this.anInt_9638 = var1.readByte(-858288243) * -2074545753;
      } else if(3 == var2) {
         this.anInt_9638 = var1.readShort(1836429949) * -2074545753;
         if('\uffff' == this.anInt_9638 * -533682665) {
            this.anInt_9638 = 2074545753;
         }
      } else if(var2 == 5) {
         this.aBoolean_9647 = false;
      } else if(7 == var2) {
         this.anInt_9640 = Class52.method537(var1.method4479(738776218), 1840693789) * -666225137;
      } else if(var2 == 8) {
         this.aClass565_9635.anInt_9606 = this.anInt_9636 * 966730815;
      } else if(9 == var2) {
         this.anInt_9644 = (var1.readShort(1131514507) << 2) * 402356493;
      } else if(10 == var2) {
         this.aBoolean_9641 = false;
      } else if(11 == var2) {
         this.anInt_9643 = var1.readByte(2141519918) * -516081653;
      } else if(12 == var2) {
         this.aBoolean_9637 = true;
      } else if(var2 == 13) {
         this.anInt_9645 = var1.method4479(738776218) * -1102906407;
      } else if(14 == var2) {
         this.anInt_9646 = (var1.readByte(-939021176) << 2) * 1371235339;
      } else if(16 == var2) {
         this.anInt_9639 = var1.readByte(112687130) * -1359300833;
      } else if(20 == var2) {
         this.anInt_9648 = var1.readShort(-447786678) * 1481448561;
      } else if(var2 == 21) {
         this.anInt_9642 = var1.readByte(187944209) * -661631611;
      } else if(var2 == 22) {
         this.anInt_9650 = var1.readShort(2066507607) * -416936379;
      }

   }

   void method6265(byte var1) {
      this.anInt_9643 = (this.anInt_9643 * 132486051 << 8 | 662019253 * this.anInt_9636) * -516081653;
   }

   static final void method6266(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class131.method1687(var3, var0, (byte)-127);
   }

   static final void method6267(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 586830225 * var3.anInt_2495;
   }

   static final void method6268(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      int var3 = 0;
      if(MapElements.method2924(var2, 1460772023)) {
         var3 = LoadProgress.method4427(var2, 1262020165);
      }

      Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6327, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var4.aClass240_Sub8_Sub1_7370.putIntBE(var3, 2062892803);
      client.gameConnectionHandler.addPacket(var4, 794864849);
   }

   static final void method6269(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub9_7325.method1643(-1636632172) == 1?1:0;
   }

   public static void method6270(byte var0) {
      if(Class503.aBoolean_9117) {
         if(-1389968761 * Class503.loadedServersCount < -2114902407 * Class303.minServerIndex) {
            Class503.loadedServersCount = 188616447 * Class303.minServerIndex;
         }

         while(-1389968761 * Class503.loadedServersCount < Class613.maxServers * 1422008859) {
            RSWorld var1 = Class113.getRSWorld(Class503.loadedServersCount * -1389968761, 1147093850);
            if(null != var1 && -1 == -524571829 * var1.ping) {
               if(Class503.aClass575_9116 == null) {
                  Class503.aClass575_9116 = client.serverQueue.getServer(var1.worldAddress, (short)17430);
               }

               int var2 = Class503.aClass575_9116.serverPing * 1790330371;
               if(-1 == var2) {
                  return;
               }

               var1.ping = 295372387 * var2;
               Class503.loadedServersCount += -1484889289;
               Class503.aClass575_9116 = null;
            } else {
               Class503.loadedServersCount += -1484889289;
            }
         }

      }
   }

   static final void method6271(RSInterfaceData var0, int var1) {
      if(client.aString_519 != null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = client.aString_519;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   public static void method6272(int var0, int var1) {
      Class235.anInt_4026 = var0 * 1965030567;
   }

   static final void method6273(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      var0.intTypeIndex -= -1416056414;
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      RSFont var5 = Class410.method5063(Class5.aCacheUnpacker_31, var4, 0, -1654297993);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var5.method5555(var2, var3, Class481.nameIconsSprites, (byte)113);
   }
}
