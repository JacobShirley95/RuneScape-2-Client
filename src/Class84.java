
public class Class84 {

   public static final int[] anIntArray_1709 = new int[]{3, 7, 15};
   public static final int anInt_1710 = 16;
   public static final int anInt_1711 = 16;
   public static final int anInt_1712 = 32;
   public static final int anInt_1713 = 8191;
   public static final int anInt_1714 = 64;
   public static final int[] anIntArray_1715 = new int[]{2047, 16383, '\uffff'};
   public static final int anInt_1716 = 1023;
   public static final int anInt_1717 = 0;
   public static final int anInt_1718 = 1;
   public static final int anInt_1719 = 0;
   public static final int anInt_1720 = 2;
   public static final int anInt_1721 = 8;
   public static final int anInt_1722 = 2;


   Class84() throws Throwable {
      throw new Error();
   }

   static void method1095(RSInterfaceData var0, int var1) {
      var0.intTypes[-831324111 * var0.intTypeIndex - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 1], 686522909).anInt_9566 * -1684904799;
   }

   static void method1096(RSInterfaceGroup var0, RSInterface var1, int var2) {
      if(null != var1) {
         int var4;
         if(var1.anInt_2428 * -1001687885 != -1) {
            RSInterface var3 = var0.interfaceArray[-671235497 * var1.parentID & '\uffff'];
            if(null != var3) {
               if(var3.aClass132Array_2579 == var3.children) {
                  var3.children = new RSInterface[var3.aClass132Array_2579.length];
                  var3.children[0] = var1;
                  Class543.method6091(var3.aClass132Array_2579, 0, var3.children, 1, -1001687885 * var1.anInt_2428);
                  Class543.method6091(var3.aClass132Array_2579, 1 + var1.anInt_2428 * -1001687885, var3.children, 1 + var1.anInt_2428 * -1001687885, var3.aClass132Array_2579.length - -1001687885 * var1.anInt_2428 - 1);
               } else {
                  var4 = 0;

                  RSInterface[] var5;
                  for(var5 = var3.children; var4 < var5.length && var1 != var5[var4]; ++var4) {
                     ;
                  }

                  if(var4 >= var5.length) {
                     return;
                  }

                  Class543.method6091(var5, 0, var5, 1, var4);
                  var5[0] = var1;
               }
            }
         } else {
            RSInterface[] var6 = var0.method1436(1314164320);

            for(var4 = 0; var4 < var6.length && var6[var4] != var1; ++var4) {
               ;
            }

            if(var4 >= var6.length) {
               return;
            }

            Class543.method6091(var6, 0, var6, 1, var4);
            var6[0] = var1;
         }
      }

   }

   static final void method1097(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class228.method2905(var3, var4, var0, 1653546313);
   }

   static final void method1098(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= 638819198;
      var0.intTypeIndex -= -1416056414;
      Class111.method1418((String)var0.stringData[863838783 * var0.stringDataIndex], (String)var0.stringData[1 + var0.stringDataIndex * 863838783], var0.intTypes[var0.intTypeIndex * -831324111], var0.intTypes[-831324111 * var0.intTypeIndex + 1] == 1, -1662531791);
   }

   static void method1099(Class522 var0, byte var1) {
      Class500.aClass522_9086 = var0;
      IllegalArgumentException_Sub1.aString_3234 = null;
   }

   static final void method1100(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      if(Class24.method149(var0, (int[])null, 832769988)) {
         Class619.method6623(RSInterface.interfaceGroups[var0].method1435(-11840664), -1, var1, var2, var3, var4, var5, var6, var7, var7 < 0, -1366966205);
      } else {
         if(var7 != -1) {
            client.aBooleanArray_525[var7] = true;
         } else {
            for(int var9 = 0; var9 < 112; ++var9) {
               client.aBooleanArray_525[var9] = true;
            }
         }

      }
   }

   static final void method1101(ByteArrayDataNode_Sub1 var0, byte var1) {
      int var2 = 0;
      var0.method294((byte)13);

      int var3;
      int index;
      int var5;
      for(var3 = 0; var3 < Class15.availablePlayers * -688404505; ++var3) {
         index = Class15.playersIndices[var3];
         if(0 == (Class15.aByteArray_121[index] & 1)) {
            if(var2 > 0) {
               --var2;
               Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
            } else {
               var5 = var0.method291(1, 1832157798);
               if(var5 == 0) {
                  var2 = Class40.method325(var0, -432741920);
                  Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
               } else {
                  Class281.method3652(var0, index, (byte)1);
               }
            }
         }
      }

      var0.method292(-944893015);
      if(var2 != 0) {
         throw new RuntimeException();
      } else {
         var0.method294((byte)48);

         for(var3 = 0; var3 < -688404505 * Class15.availablePlayers; ++var3) {
            index = Class15.playersIndices[var3];
            if(0 != (Class15.aByteArray_121[index] & 1)) {
               if(var2 > 0) {
                  --var2;
                  Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
               } else {
                  var5 = var0.method291(1, 1832157798);
                  if(var5 == 0) {
                     var2 = Class40.method325(var0, -432741920);
                     Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
                  } else {
                     Class281.method3652(var0, index, (byte)1);
                  }
               }
            }
         }

         var0.method292(388930444);
         if(0 != var2) {
            throw new RuntimeException();
         } else {
            var0.method294((byte)98);

            for(var3 = 0; var3 < 527002241 * Class15.anInt_125; ++var3) {
               index = Class15.anIntArray_129[var3];
               if((Class15.aByteArray_121[index] & 1) != 0) {
                  if(var2 > 0) {
                     --var2;
                     Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
                  } else {
                     var5 = var0.method291(1, 1832157798);
                     if(0 == var5) {
                        var2 = Class40.method325(var0, -432741920);
                        Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
                     } else if(Class533.method6040(var0, index, (short)4096)) {
                        Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
                     }
                  }
               }
            }

            var0.method292(618618829);
            if(var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.method294((byte)34);

               for(var3 = 0; var3 < 527002241 * Class15.anInt_125; ++var3) {
                  index = Class15.anIntArray_129[var3];
                  if((Class15.aByteArray_121[index] & 1) == 0) {
                     if(var2 > 0) {
                        --var2;
                        Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
                     } else {
                        var5 = var0.method291(1, 1832157798);
                        if(var5 == 0) {
                           var2 = Class40.method325(var0, -432741920);
                           Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
                        } else if(Class533.method6040(var0, index, (short)4096)) {
                           Class15.aByteArray_121[index] = (byte)(Class15.aByteArray_121[index] | 2);
                        }
                     }
                  }
               }

               var0.method292(-2124782209);
               if(var2 != 0) {
                  throw new RuntimeException();
               } else {
                  Class15.availablePlayers = 0;
                  Class15.anInt_125 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     Class15.aByteArray_121[var3] = (byte)(Class15.aByteArray_121[var3] >> 1);
                     Player var6 = client.aPlayerArray[var3];
                     if(null != var6) {
                        Class15.playersIndices[(Class15.availablePlayers += -194487337) * -688404505 - 1] = var3;
                     } else {
                        Class15.anIntArray_129[(Class15.anInt_125 += 742708609) * 527002241 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }

   static final void method1102(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class568.method6246(var3, var4, var0, -1480440933);
   }
}
