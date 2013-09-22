
public class Animation {

   public int anInt_10104 = -926829626;
   AnimationUnpacker unpacker;
   public int id;
   public static boolean aBoolean_10107 = false;
   public int[] anIntArray_10108;
   public int[] anIntArray_10109;
   public Class258 aClass258_10110;
   public int[][] anIntArrayArray_10111;
   public int anInt_10112 = -336929797;
   public int anInt_10113 = 442373567;
   public boolean aBoolean_10114 = false;
   public int anInt_10115 = 1373555711;
   public int anInt_10116 = 737177823;
   public boolean aBoolean_10117 = false;
   public int anInt_10118 = 1839353235;
   public int anInt_10119 = 1600305613;
   public int[] anIntArray_10120;
   public boolean aBoolean_10121 = false;
   public int[] anIntArray_10122;
   public int anInt_10123 = 1391822111;
   public int[] anIntArray_10124;
   public int[] anIntArray_10125;
   NodeArrayList aNodeArrayList_10126;
   public int anInt_10127 = 511754061;
   public static short[] aShortArray_10128;


   public String getName(int var1, String var2, int var3) {
      if(null == this.aNodeArrayList_10126) {
         return var2;
      } else {
         Class240_Sub9 var4 = (Class240_Sub9)this.aNodeArrayList_10126.getNode((long)var1);
         return null == var4?var2:(String)var4.anObject_6783;
      }
   }

   void load(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(1850970511);
         if(var3 == 0) {
            return;
         }

         this.method6727(var1, var3, 1217247303);
      }
   }

   void method6724(byte var1) {
      if(-1 == this.anInt_10115 * -2073113599) {
         if(this.aClass258_10110 != null && this.aClass258_10110.aBooleanArray_4434 != null) {
            this.anInt_10115 = 1547855874;
         } else {
            this.anInt_10115 = 0;
         }
      }

      if(-1 == this.anInt_10118 * 771893093) {
         if(null != this.aClass258_10110 && null != this.aClass258_10110.aBooleanArray_4434) {
            this.anInt_10118 = 616260826;
         } else {
            this.anInt_10118 = 0;
         }
      }

   }

   public boolean method6725(int var1) {
      if(this.anIntArray_10120 == null) {
         return true;
      } else {
         boolean var2 = true;
         int[] var3 = this.anIntArray_10120;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = var3[var4];
            if(this.unpacker.method3368(var5 >>> 16, (byte)-103) == null) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public int method6726(int var1, int var2, int var3) {
      if(null == this.aNodeArrayList_10126) {
         return var2;
      } else {
         IndexNode var4 = (IndexNode)this.aNodeArrayList_10126.getNode((long)var1);
         return var4 == null?var2:523939595 * var4.cacheID;
      }
   }

   void method6727(ByteArrayDataNode var1, int var2, int var3) {
      int var4;
      int var5;
      if(var2 == 1) {
         var4 = var1.readShort(-1042880719);
         this.anIntArray_10109 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray_10109[var5] = var1.readShort(1846027191);
         }

         this.anIntArray_10120 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray_10120[var5] = var1.readShort(-1214605778);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray_10120[var5] += var1.readShort(-1308522842) << 16;
         }
      } else if(var2 == 2) {
         this.anInt_10123 = var1.readShort(-636126973) * -1391822111;
      } else if(5 == var2) {
         this.anInt_10113 = var1.readByte(1847863648) * -1629512205;
      } else if(var2 == 6) {
         this.anInt_10119 = var1.readShort(1496301036) * -1600305613;
      } else if(var2 == 7) {
         this.anInt_10112 = var1.readShort(25552416) * 336929797;
      } else if(var2 == 8) {
         this.anInt_10116 = var1.readByte(1851633219) * 397897813;
      } else if(var2 == 9) {
         this.anInt_10115 = var1.readByte(1048678529) * -1373555711;
      } else if(10 == var2) {
         this.anInt_10118 = var1.readByte(1634641108) * -1839353235;
      } else if(var2 == 11) {
         this.anInt_10104 = var1.readByte(-98687661) * -463414813;
      } else if(12 == var2) {
         var4 = var1.readByte(2018835719);
         this.anIntArray_10108 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray_10108[var5] = var1.readShort(1445191213);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray_10108[var5] += var1.readShort(-291078477) << 16;
         }
      } else {
         int var7;
         if(var2 == 13) {
            var4 = var1.readShort(1290320840);
            this.anIntArrayArray_10111 = new int[var4][];

            for(var5 = 0; var5 < var4; ++var5) {
               int var6 = var1.readByte(344263784);
               if(var6 > 0) {
                  this.anIntArrayArray_10111[var5] = new int[var6];
                  this.anIntArrayArray_10111[var5][0] = var1.method4479(738776218);

                  for(var7 = 1; var7 < var6; ++var7) {
                     this.anIntArrayArray_10111[var5][var7] = var1.readShort(365532306);
                  }
               }
            }
         } else if(14 == var2) {
            this.aBoolean_10117 = true;
         } else if(15 == var2) {
            this.aBoolean_10121 = true;
         } else if(16 != var2) {
            if(var2 == 18) {
               this.aBoolean_10114 = true;
            } else if(19 == var2) {
               if(this.anIntArray_10122 == null) {
                  this.anIntArray_10122 = new int[this.anIntArrayArray_10111.length];

                  for(var4 = 0; var4 < this.anIntArrayArray_10111.length; ++var4) {
                     this.anIntArray_10122[var4] = 255;
                  }
               }

               this.anIntArray_10122[var1.readByte(895729998)] = var1.readByte(1634803300);
            } else if(20 == var2) {
               if(null == this.anIntArray_10124 || this.anIntArray_10125 == null) {
                  this.anIntArray_10124 = new int[this.anIntArrayArray_10111.length];
                  this.anIntArray_10125 = new int[this.anIntArrayArray_10111.length];

                  for(var4 = 0; var4 < this.anIntArrayArray_10111.length; ++var4) {
                     this.anIntArray_10124[var4] = 256;
                     this.anIntArray_10125[var4] = 256;
                  }
               }

               var4 = var1.readByte(163767206);
               this.anIntArray_10124[var4] = var1.readShort(-422269990);
               this.anIntArray_10125[var4] = var1.readShort(-49334703);
            } else if(var2 == 22) {
               this.anInt_10127 = var1.readByte(-584491957) * -511754061;
            } else if(var2 == 23) {
               var1.readShort(121737595);
            } else if(24 == var2) {
               var4 = var1.readShort(1075726804);
               this.aClass258_10110 = this.unpacker.aClass631_4424.method6696(var4, (byte)0);
            } else if(var2 == 249) {
               var4 = var1.readByte(942967837);
               if(null == this.aNodeArrayList_10126) {
                  var5 = Class105.method1359(var4, (byte)124);
                  this.aNodeArrayList_10126 = new NodeArrayList(var5);
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  boolean var9 = var1.readByte(-889155210) == 1;
                  var7 = var1.method4479(738776218);
                  Object var8;
                  if(var9) {
                     var8 = new Class240_Sub9(var1.method4485(-324551936));
                  } else {
                     var8 = new IndexNode(var1.method4480(1260717178));
                  }

                  this.aNodeArrayList_10126.insert((NodeListNode)var8, (long)var7);
               }
            }
         }
      }

   }

   static final void method6728(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      PlayerComposite.method6458(var3, var4, var0, -355849142);
   }
}
