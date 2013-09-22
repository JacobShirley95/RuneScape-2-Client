import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class79 implements Class205 {

   short[] aShortArray_1512;
   int[] anIntArray_1513;
   short[] aShortArray_1514;
   int[] anIntArray_1515 = new int[]{-1, -1, -1, -1, -1};
   short[] aShortArray_1516;
   public static final int[] anIntArray_1517 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   byte[] aByteArray_1518;
   byte[] aByteArray_1519;
   short[] aShortArray_1520;
   public static final int[] anIntArray_1521 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   Class71 aClass71_1522;


   void method1035(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(-1142844072);
         if(0 == var3) {
            return;
         }

         this.method1040(var1, var3, -1493982489);
      }
   }

   public ModelData method1036(byte var1) {
      if(null == this.anIntArray_1513) {
         return null;
      } else {
         ModelData[] var2 = new ModelData[this.anIntArray_1513.length];
         CacheDataUnpacker var3 = this.aClass71_1522.aCacheUnpacker_1360;
         int var4;
         synchronized(this.aClass71_1522.aCacheUnpacker_1360) {
            var4 = 0;

            while(true) {
               if(var4 >= this.anIntArray_1513.length) {
                  break;
               }

               var2[var4] = ModelData.createModelUnpacker(this.aClass71_1522.aCacheUnpacker_1360, this.anIntArray_1513[var4], 0);
               ++var4;
            }
         }

         for(int var7 = 0; var7 < this.anIntArray_1513.length; ++var7) {
            if(var2[var7].anInt_1848 < 13) {
               var2[var7].method1229(2);
            }
         }

         ModelData var8;
         if(var2.length == 1) {
            var8 = var2[0];
         } else {
            var8 = new ModelData(var2, var2.length);
         }

         if(var8 == null) {
            return null;
         } else {
            if(this.aShortArray_1512 != null) {
               for(var4 = 0; var4 < this.aShortArray_1512.length; ++var4) {
                  var8.method1226(this.aShortArray_1512[var4], this.aShortArray_1520[var4]);
               }
            }

            if(this.aShortArray_1516 != null) {
               for(var4 = 0; var4 < this.aShortArray_1516.length; ++var4) {
                  var8.method1217(this.aShortArray_1516[var4], this.aShortArray_1514[var4]);
               }
            }

            return var8;
         }
      }
   }

   public boolean method1037(int var1) {
      boolean var2 = true;
      CacheDataUnpacker var3 = this.aClass71_1522.aCacheUnpacker_1360;
      synchronized(this.aClass71_1522.aCacheUnpacker_1360) {
         for(int var4 = 0; var4 < 5; ++var4) {
            if(this.anIntArray_1515[var4] != -1 && !this.aClass71_1522.aCacheUnpacker_1360.method3568(this.anIntArray_1515[var4], 0, 986035639)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public boolean method1038(int var1) {
      if(this.anIntArray_1513 == null) {
         return true;
      } else {
         boolean var2 = true;
         CacheDataUnpacker var3 = this.aClass71_1522.aCacheUnpacker_1360;
         synchronized(this.aClass71_1522.aCacheUnpacker_1360) {
            for(int var4 = 0; var4 < this.anIntArray_1513.length; ++var4) {
               if(!this.aClass71_1522.aCacheUnpacker_1360.method3568(this.anIntArray_1513[var4], 0, 1660655321)) {
                  var2 = false;
               }
            }

            return var2;
         }
      }
   }

   public ModelData method1039(short var1) {
      ModelData[] var2 = new ModelData[5];
      int var3 = 0;
      CacheDataUnpacker var4 = this.aClass71_1522.aCacheUnpacker_1360;
      int var5;
      synchronized(this.aClass71_1522.aCacheUnpacker_1360) {
         var5 = 0;

         while(true) {
            if(var5 >= 5) {
               break;
            }

            if(-1 != this.anIntArray_1515[var5]) {
               var2[var3++] = ModelData.createModelUnpacker(this.aClass71_1522.aCacheUnpacker_1360, this.anIntArray_1515[var5], 0);
            }

            ++var5;
         }
      }

      for(int var8 = 0; var8 < 5; ++var8) {
         if(var2[var8] != null && var2[var8].anInt_1848 < 13) {
            var2[var8].method1229(2);
         }
      }

      ModelData var9 = new ModelData(var2, var3);
      if(this.aShortArray_1512 != null) {
         for(var5 = 0; var5 < this.aShortArray_1512.length; ++var5) {
            var9.method1226(this.aShortArray_1512[var5], this.aShortArray_1520[var5]);
         }
      }

      if(null != this.aShortArray_1516) {
         for(var5 = 0; var5 < this.aShortArray_1516.length; ++var5) {
            var9.method1217(this.aShortArray_1516[var5], this.aShortArray_1514[var5]);
         }
      }

      return var9;
   }

   void method1040(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         var1.readByte(-927639689);
      } else {
         int var4;
         int var5;
         if(2 == var2) {
            var4 = var1.readByte(-413488367);
            this.anIntArray_1513 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_1513[var5] = var1.method4493(-157074556);
            }
         } else if(3 != var2) {
            if(var2 == 40) {
               var4 = var1.readByte(-927398134);
               this.aShortArray_1512 = new short[var4];
               this.aShortArray_1520 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.aShortArray_1512[var5] = (short)var1.readShort(315572062);
                  this.aShortArray_1520[var5] = (short)var1.readShort(-1052225023);
               }
            } else if(var2 == 41) {
               var4 = var1.readByte(1631254995);
               this.aShortArray_1516 = new short[var4];
               this.aShortArray_1514 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.aShortArray_1516[var5] = (short)var1.readShort(-256704973);
                  this.aShortArray_1514[var5] = (short)var1.readShort(1004258544);
               }
            } else {
               int var6;
               int var7;
               byte var8;
               if(var2 == 44) {
                  var4 = var1.readShort(-811316017);
                  var5 = 0;

                  for(var6 = var4; var6 > 0; var6 >>= 1) {
                     ++var5;
                  }

                  this.aByteArray_1518 = new byte[var5];
                  var8 = 0;

                  for(var7 = 0; var7 < var5; ++var7) {
                     if((var4 & 1 << var7) > 0) {
                        this.aByteArray_1518[var7] = var8++;
                     } else {
                        this.aByteArray_1518[var7] = -1;
                     }
                  }
               } else if(var2 == 45) {
                  var4 = var1.readShort(-1224201500);
                  var5 = 0;

                  for(var6 = var4; var6 > 0; var6 >>= 1) {
                     ++var5;
                  }

                  this.aByteArray_1519 = new byte[var5];
                  var8 = 0;

                  for(var7 = 0; var7 < var5; ++var7) {
                     if((var4 & 1 << var7) > 0) {
                        this.aByteArray_1519[var7] = var8++;
                     } else {
                        this.aByteArray_1519[var7] = -1;
                     }
                  }
               } else if(var2 >= 60 && var2 < 70) {
                  this.anIntArray_1515[var2 - 60] = var1.method4493(-157074556);
               }
            }
         }
      }

   }

   public static void method1041(String var0, int var1) {
      if(client.loginStage * -243034353 == 3) {
         Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6295, client.lobbyConnectionHandler.aClass528_3433, 1917447504);
         var2.aClass240_Sub8_Sub1_7370.putByte(0, 444556347);
         int var3 = var2.aClass240_Sub8_Sub1_7370.index * 964952859;
         var2.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-79);
         var2.aClass240_Sub8_Sub1_7370.index += -1419617915;
         var2.aClass240_Sub8_Sub1_7370.method4496(Class3.anIntArray_27, var3, var2.aClass240_Sub8_Sub1_7370.index * 964952859, -763494346);
         var2.aClass240_Sub8_Sub1_7370.method4521(var2.aClass240_Sub8_Sub1_7370.index * 964952859 - var3, -907432342);
         client.lobbyConnectionHandler.addPacket(var2, 1782393568);
         Class3.aClass521_22 = Class521.aClass521_9251;
      }
   }

   static final void method1042(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 < var3?var2:var3;
   }

   public static void method1043(boolean var0, byte[] var1, int var2) {
      if(Class503.aClass240_Sub8_9112 == null) {
         Class503.aClass240_Sub8_9112 = new ByteArrayDataNode(20000);
      }

      Class503.aClass240_Sub8_9112.putBytes(var1, 0, var1.length, -144707030);
      if(var0) {
         Class40.method326(Class503.aClass240_Sub8_9112.data, (byte)-80);
         Class503.rsWorldList = new RSWorld[Class613.serverCount * 1096385619];
         int var3 = 0;

         for(int var4 = -2114902407 * Class303.minServerIndex; var4 <= 1422008859 * Class613.maxServers; ++var4) {
            RSWorld var5 = Class113.getRSWorld(var4, -1246666704);
            if(null != var5) {
               Class503.rsWorldList[var3++] = var5;
            }
         }

         Class503.aBoolean_9111 = false;
         Class104_Sub19.aLong_10724 = Class373.getCurrentTime((short)26237) * 5624753264787177529L;
         Class503.aClass240_Sub8_9112 = null;
      }

   }

   static void method1044(File var0, byte[] var1, int var2, byte var3) throws IOException {
      DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(var0)));

      try {
         var4.readFully(var1, 0, var2);
      } catch (EOFException var6) {
         ;
      }

      var4.close();
   }

   static final void method1045(int var0) {
      Class100.method1294(2088673054);
      client.aClass296_348.method3761(-907643342);

      int var1;
      for(var1 = 0; var1 < client.hintMarkers.length; ++var1) {
         client.hintMarkers[var1] = null;
      }

      for(var1 = 0; var1 < client.aClass235Array_306.length; ++var1) {
         client.aClass235Array_306[var1] = null;
      }

      Class87.method1139(-1201297196);

      for(var1 = 0; var1 < 2048; ++var1) {
         client.aPlayerArray[var1] = null;
      }

      client.availableNPCS = 0;
      client.npcNodeList.method5938(1466064933);
      client.anInt_334 = 0;
      client.groundItems.method5938(2068558608);
      Plane.method2165(AbstractCacheData.method4679(647514803), (byte)106);
      client.anInt_526 = 0;
      Class240_Sub41_Sub3.aClass23_1024.aClass608_202.method6544((byte)1);
      Class104_Sub11.aClass68_10198 = null;
      Class253.aClass68_4385 = null;
      Class545.aClass240_Sub47_9477 = null;
      Class104_Sub11.aClass240_Sub47_10199 = null;
      Class113.currentServer = null;
      Class568.aLong_9632 = 0L;
      Class602.method6502(-1194383738);
      ByteArrayDataNode.method4543((byte)11);
   }

   static final void method1046(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1919527290) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2507 = Class133.extractInterfaceData(var4, var2, (byte)77);
      var0.aBoolean_2524 = true;
   }

   static final void method1047(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class319.method3948(var3, var4, var0, (byte)16);
   }

   static void method1048(Viewport var0, ArrayViewport var1, int var2, int var3, byte var4) {
      if(null == Class18.anArrayViewport_169) {
         Class18.anArrayViewport_169 = new ArrayViewport(var1);
      } else {
         Class18.anArrayViewport_169.replaceWith(var1);
      }

      Class18.aViewport_180.setAs(var0);
      Class18.anInt_167 = var2 * 79324761;
      Class18.anInt_141 = var3 * -742728571;
   }
}
