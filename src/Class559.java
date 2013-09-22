
public class Class559 {

   Class583 aClass583_9559;
   public String aString_9560;
   public String aString_9561;
   int[][] anIntArrayArray_9562;
   int[][] anIntArrayArray_9563;
   public int anInt_9564 = -981398319;
   public int anInt_9565 = 0;
   public int anInt_9566;
   public int[][] anIntArrayArray_9567;
   int[] anIntArray_9568;
   public int[] anIntArray_9569;
   int[] anIntArray_9570;
   public int anInt_9571;
   public int[] anIntArray_9572;
   public String[] aStringArray_9573;
   NodeArrayList aNodeArrayList_9574;
   int[] anIntArray_9575;
   public int[] anIntArray_9576;
   int[] anIntArray_9577;
   public boolean aBoolean_9578 = false;
   public String[] aStringArray_9579;
   public int anInt_9580 = 0;
   int[] anIntArray_9581;


   public boolean method6170(Class184 var1, short var2) {
      int var3;
      if(this.anIntArrayArray_9562 != null) {
         for(var3 = 0; var3 < this.anIntArrayArray_9562.length; ++var3) {
            Class187 var4 = ((Class185)var1).method2281(Class283.aClass283_4785, this.anIntArrayArray_9562[var3][0], -1927309654);
            if(var1.method2269(var4, -390483690) >= this.anIntArrayArray_9562[var3][2]) {
               return true;
            }
         }
      }

      if(this.anIntArrayArray_9563 != null) {
         for(var3 = 0; var3 < this.anIntArrayArray_9563.length; ++var3) {
            Class416 var5 = ((Class185)var1).method2280(this.anIntArrayArray_9563[var3][0], (byte)9);
            if(var1.method2268(var5, -1212488706) >= this.anIntArrayArray_9563[var3][2]) {
               return true;
            }
         }
      }

      return false;
   }

   void method6171(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         this.aString_9560 = var1.readString(1841936278);
      } else if(2 == var2) {
         this.aString_9561 = var1.readString(1841936278);
      } else {
         int var4;
         int var5;
         if(3 == var2) {
            var4 = var1.readByte(1122288168);
            this.anIntArrayArray_9562 = new int[var4][3];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArrayArray_9562[var5][0] = var1.readShort(1152198420);
               this.anIntArrayArray_9562[var5][1] = var1.method4480(1260717178);
               this.anIntArrayArray_9562[var5][2] = var1.method4480(1260717178);
            }
         } else if(var2 == 4) {
            var4 = var1.readByte(-832602295);
            this.anIntArrayArray_9563 = new int[var4][3];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArrayArray_9563[var5][0] = var1.readShort(1135201268);
               this.anIntArrayArray_9563[var5][1] = var1.method4480(1260717178);
               this.anIntArrayArray_9563[var5][2] = var1.method4480(1260717178);
            }
         } else if(var2 == 5) {
            var1.readShort(1177677921);
         } else if(6 == var2) {
            this.anInt_9580 = var1.readByte(6710558) * 1284257473;
         } else if(7 == var2) {
            this.anInt_9565 = var1.readByte(-938173659) * -2024047609;
         } else if(var2 == 8) {
            this.aBoolean_9578 = true;
         } else if(9 == var2) {
            this.anInt_9566 = var1.readByte(-887393241) * -333676703;
         } else if(var2 == 10) {
            var4 = var1.readByte(879023252);
            this.anIntArray_9568 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_9568[var5] = var1.method4480(1260717178);
            }
         } else if(var2 == 12) {
            var1.method4480(1260717178);
         } else if(var2 == 13) {
            var4 = var1.readByte(-691851327);
            this.anIntArray_9569 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_9569[var5] = var1.readShort(2002750250);
            }
         } else if(14 == var2) {
            var4 = var1.readByte(2026263755);
            this.anIntArrayArray_9567 = new int[var4][2];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArrayArray_9567[var5][0] = var1.readByte(-501304502);
               this.anIntArrayArray_9567[var5][1] = var1.readByte(-706824051);
            }
         } else if(var2 == 15) {
            this.anInt_9571 = var1.readShort(-119195589) * 54957541;
         } else if(17 == var2) {
            this.anInt_9564 = var1.method4493(-157074556) * 981398319;
         } else if(var2 == 18) {
            var4 = var1.readByte(1820361549);
            this.anIntArray_9572 = new int[var4];
            this.anIntArray_9581 = new int[var4];
            this.anIntArray_9570 = new int[var4];
            this.aStringArray_9573 = new String[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_9572[var5] = var1.method4480(1260717178);
               this.anIntArray_9581[var5] = var1.method4480(1260717178);
               this.anIntArray_9570[var5] = var1.method4480(1260717178);
               this.aStringArray_9573[var5] = var1.method4485(1233689453);
            }
         } else if(19 == var2) {
            var4 = var1.readByte(2084461290);
            this.anIntArray_9576 = new int[var4];
            this.anIntArray_9577 = new int[var4];
            this.anIntArray_9575 = new int[var4];
            this.aStringArray_9579 = new String[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_9576[var5] = var1.method4480(1260717178);
               this.anIntArray_9577[var5] = var1.method4480(1260717178);
               this.anIntArray_9575[var5] = var1.method4480(1260717178);
               this.aStringArray_9579[var5] = var1.method4485(-1063705725);
            }
         } else if(var2 == 249) {
            var4 = var1.readByte(1575216565);
            if(this.aNodeArrayList_9574 == null) {
               var5 = Class105.method1359(var4, (byte)126);
               this.aNodeArrayList_9574 = new NodeArrayList(var5);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               boolean var6 = var1.readByte(385837591) == 1;
               int var7 = var1.method4479(738776218);
               Object var8;
               if(var6) {
                  var8 = new Class240_Sub9(var1.method4485(-1299845372));
               } else {
                  var8 = new IndexNode(var1.method4480(1260717178));
               }

               this.aNodeArrayList_9574.insert((NodeListNode)var8, (long)var7);
            }
         }
      }

   }

   public int method6172(int var1, int var2, int var3) {
      if(null == this.aNodeArrayList_9574) {
         return var2;
      } else {
         IndexNode var4 = (IndexNode)this.aNodeArrayList_9574.getNode((long)var1);
         return null == var4?var2:523939595 * var4.cacheID;
      }
   }

   void method6173(ByteArrayDataNode var1, short var2) {
      while(true) {
         int var3 = var1.readByte(-1138529204);
         if(var3 == 0) {
            return;
         }

         this.method6171(var1, var3, -354722956);
      }
   }

   public boolean method6174(Class184 var1, byte var2) {
      int var3;
      if(null != this.anIntArrayArray_9562) {
         for(var3 = 0; var3 < this.anIntArrayArray_9562.length; ++var3) {
            Class187 var4 = ((Class185)var1).method2281(Class283.aClass283_4785, this.anIntArrayArray_9562[var3][0], -1614552204);
            if(var1.method2269(var4, -390483690) >= this.anIntArrayArray_9562[var3][1]) {
               return true;
            }
         }
      }

      if(null != this.anIntArrayArray_9563) {
         for(var3 = 0; var3 < this.anIntArrayArray_9563.length; ++var3) {
            Class416 var5 = ((Class185)var1).method2280(this.anIntArrayArray_9563[var3][0], (byte)20);
            if(var1.method2268(var5, -716701564) >= this.anIntArrayArray_9563[var3][1]) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method6175(Class184 var1, int var2) {
      if(this.aClass583_9559.method6328(var1, -2139693753) < this.anInt_9571 * 1433837549) {
         return false;
      } else {
         int var3;
         if(this.anIntArrayArray_9567 != null) {
            for(var3 = 0; var3 < this.anIntArrayArray_9567.length; ++var3) {
               if(((Class589)var1).method6395(this.anIntArrayArray_9567[var3][0], 500997698) < this.anIntArrayArray_9567[var3][1]) {
                  return false;
               }
            }
         }

         if(null != this.anIntArray_9569) {
            for(var3 = 0; var3 < this.anIntArray_9569.length; ++var3) {
               if(!this.aClass583_9559.method6327(this.anIntArray_9569[var3], 1327387204).method6170(var1, (short)-11050)) {
                  return false;
               }
            }
         }

         int var5;
         if(this.anIntArray_9572 != null) {
            for(var3 = 0; var3 < this.anIntArray_9572.length; ++var3) {
               Class187 var4 = ((Class185)var1).method2281(Class283.aClass283_4785, this.anIntArray_9572[var3], -1640892561);
               var5 = var1.method2269(var4, -390483690);
               if(var5 < this.anIntArray_9581[var3] || var5 > this.anIntArray_9570[var3]) {
                  return false;
               }
            }
         }

         if(this.anIntArray_9576 != null) {
            for(var3 = 0; var3 < this.anIntArray_9576.length; ++var3) {
               Class416 var6 = ((Class185)var1).method2280(this.anIntArray_9576[var3], (byte)-45);
               var5 = var1.method2268(var6, 20860113);
               if(var5 < this.anIntArray_9577[var3] || var5 > this.anIntArray_9575[var3]) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean method6176(Class184 var1, int var2, short var3) {
      return null != this.anIntArrayArray_9567 && var2 >= 0 && var2 < this.anIntArrayArray_9567.length?((Class589)var1).method6395(this.anIntArrayArray_9567[var2][0], 2043909759) >= this.anIntArrayArray_9567[var2][1]:false;
   }

   public boolean method6177(Class184 var1, int var2, byte var3) {
      if(this.anIntArray_9572 != null && var2 >= 0 && var2 < this.anIntArray_9572.length) {
         Class187 var4 = ((Class185)var1).method2281(Class283.aClass283_4785, this.anIntArray_9572[var2], -2087431141);
         int var5 = var1.method2269(var4, -390483690);
         return var5 >= this.anIntArray_9581[var2] && var5 <= this.anIntArray_9570[var2];
      } else {
         return false;
      }
   }

   public boolean method6178(Class184 var1, int var2, int var3) {
      if(null != this.anIntArray_9576 && var2 >= 0 && var2 < this.anIntArray_9576.length) {
         Class416 var4 = ((Class185)var1).method2280(this.anIntArray_9576[var2], (byte)10);
         int var5 = var1.method2268(var4, -1707883343);
         return var5 >= this.anIntArray_9577[var2] && var5 <= this.anIntArray_9575[var2];
      } else {
         return false;
      }
   }

   void method6179(byte var1) {
      if(this.aString_9561 == null) {
         this.aString_9561 = this.aString_9560;
      }

   }

   public boolean method6180(Class184 var1, int var2, int var3) {
      return null != this.anIntArray_9569 && var2 >= 0 && var2 < this.anIntArray_9569.length?this.aClass583_9559.method6327(this.anIntArray_9569[var2], 1443522222).method6170(var1, (short)-8042):false;
   }

   public String method6181(int var1, String var2, int var3) {
      if(null == this.aNodeArrayList_9574) {
         return var2;
      } else {
         Class240_Sub9 var4 = (Class240_Sub9)this.aNodeArrayList_9574.getNode((long)var1);
         return null == var4?var2:(String)var4.anObject_6783;
      }
   }

   public boolean method6182(Class184 var1, byte var2) {
      return this.aClass583_9559.method6328(var1, -701975100) >= 1433837549 * this.anInt_9571;
   }

   static final void method6183(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class79.method1046(var3, var4, var0, -270889423);
   }

   static final void method6184(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[var0.stringDataIndex * 863838783];
      String var3 = (String)var0.stringData[863838783 * var0.stringDataIndex + 1];
      Class434.method5418(var2, var3, 267896668);
   }

   public static Class551 method6185(Class551[] var0, int var1, byte var2) {
      Class551[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Class551 var5 = var3[var4];
         if(var1 == var5.getLanguageID(228635986)) {
            return var5;
         }
      }

      return null;
   }
}
