
public class Class68 {

   public byte aByte_1275;
   boolean aBoolean_1276;
   public int[] anIntArray_1277;
   NodeArrayList aNodeArrayList_1278;
   long[] aLongArray_1279;
   boolean aBoolean_1280;
   int anInt_1281 = 0;
   public boolean aBoolean_1282;
   public byte aByte_1283;
   static final byte aByte_1284 = 126;
   public byte aByte_1285;
   public int anInt_1286;
   public String[] aStringArray_1287;
   long[] aLongArray_1288;
   public byte[] aByteArray_1289;
   int[] anIntArray_1290;
   int[] anIntArray_1291;
   int anInt_1292 = 0;
   boolean[] aBooleanArray_1293;
   long aLong_1294;
   public int anInt_1295 = -989180007;
   static final int anInt_1296 = 6;
   public int anInt_1297 = 1489020987;
   public byte aByte_1298;
   public String[] aStringArray_1299;
   public int anInt_1300;
   static final byte aByte_1301 = 127;
   public String aString_1302 = null;
   static final byte aByte_1303 = 125;
   static final byte aByte_1304 = 0;
   public static final byte aByte_1305 = -1;


   void method691(int var1, int var2) {
      if(this.aBoolean_1276) {
         if(this.aLongArray_1279 != null) {
            System.arraycopy(this.aLongArray_1279, 0, this.aLongArray_1279 = new long[var1], 0, this.anInt_1300 * -741316095);
         } else {
            this.aLongArray_1279 = new long[var1];
         }
      }

      if(this.aBoolean_1280) {
         if(this.aStringArray_1287 != null) {
            System.arraycopy(this.aStringArray_1287, 0, this.aStringArray_1287 = new String[var1], 0, -741316095 * this.anInt_1300);
         } else {
            this.aStringArray_1287 = new String[var1];
         }
      }

      if(null != this.aByteArray_1289) {
         System.arraycopy(this.aByteArray_1289, 0, this.aByteArray_1289 = new byte[var1], 0, this.anInt_1300 * -741316095);
      } else {
         this.aByteArray_1289 = new byte[var1];
      }

      if(this.anIntArray_1291 != null) {
         System.arraycopy(this.anIntArray_1291, 0, this.anIntArray_1291 = new int[var1], 0, -741316095 * this.anInt_1300);
      } else {
         this.anIntArray_1291 = new int[var1];
      }

      if(null != this.anIntArray_1277) {
         System.arraycopy(this.anIntArray_1277, 0, this.anIntArray_1277 = new int[var1], 0, this.anInt_1300 * -741316095);
      } else {
         this.anIntArray_1277 = new int[var1];
      }

      if(this.aBooleanArray_1293 != null) {
         System.arraycopy(this.aBooleanArray_1293, 0, this.aBooleanArray_1293 = new boolean[var1], 0, -741316095 * this.anInt_1300);
      } else {
         this.aBooleanArray_1293 = new boolean[var1];
      }

   }

   void method692(int var1, int var2) {
      if(this.aBoolean_1276) {
         if(null != this.aLongArray_1288) {
            System.arraycopy(this.aLongArray_1288, 0, this.aLongArray_1288 = new long[var1], 0, -297012993 * this.anInt_1286);
         } else {
            this.aLongArray_1288 = new long[var1];
         }
      }

      if(this.aBoolean_1280) {
         if(this.aStringArray_1299 != null) {
            System.arraycopy(this.aStringArray_1299, 0, this.aStringArray_1299 = new String[var1], 0, this.anInt_1286 * -297012993);
         } else {
            this.aStringArray_1299 = new String[var1];
         }
      }

   }

   public int method693(int var1, int var2, int var3, int var4) {
      int var5 = 31 == var3?-1:(1 << var3 + 1) - 1;
      return (this.anIntArray_1291[var1] & var5) >>> var2;
   }

   public String method694(int var1, int var2) {
      if(null == this.aNodeArrayList_1278) {
         return null;
      } else {
         NodeListNode var3 = this.aNodeArrayList_1278.getNode((long)var1);
         return var3 != null && var3 instanceof Class240_Sub9?(String)((Class240_Sub9)var3).anObject_6783:null;
      }
   }

   void method695(long var1, String var3, int var4, int var5) {
      if(null != var3 && var3.length() == 0) {
         if(var5 != -576124732) {
            return;
         }

         var3 = null;
      }

      if(this.aBoolean_1276 != var1 > 0L) {
         throw new RuntimeException("");
      } else if(this.aBoolean_1280 != (null != var3)) {
         throw new RuntimeException("");
      } else {
         label70: {
            label79: {
               if(var1 > 0L) {
                  if(this.aLongArray_1279 == null || -741316095 * this.anInt_1300 >= this.aLongArray_1279.length) {
                     break label79;
                  }

                  if(var5 != -576124732) {
                     return;
                  }
               }

               if(var3 == null) {
                  break label70;
               }

               if(var5 != -576124732) {
                  return;
               }

               if(this.aStringArray_1287 != null && -741316095 * this.anInt_1300 < this.aStringArray_1287.length) {
                  break label70;
               }
            }

            this.method691(5 + this.anInt_1300 * -741316095, 16711935);
         }

         if(this.aLongArray_1279 != null) {
            if(var5 != -576124732) {
               return;
            }

            this.aLongArray_1279[this.anInt_1300 * -741316095] = var1;
         }

         if(null != this.aStringArray_1287) {
            this.aStringArray_1287[-741316095 * this.anInt_1300] = var3;
         }

         if(-1 == this.anInt_1297 * -212594931) {
            this.anInt_1297 = -1868109371 * this.anInt_1300;
            this.aByteArray_1289[this.anInt_1300 * -741316095] = 126;
         } else {
            this.aByteArray_1289[-741316095 * this.anInt_1300] = 0;
         }

         this.anIntArray_1291[this.anInt_1300 * -741316095] = 0;
         this.anIntArray_1277[this.anInt_1300 * -741316095] = var4;
         this.aBooleanArray_1293[-741316095 * this.anInt_1300] = false;
         this.anInt_1300 += 806589953;
         this.anIntArray_1290 = null;
      }
   }

   void method696(int var1, int var2) {
      if(var1 >= 0 && var1 < this.anInt_1300 * -741316095) {
         this.anInt_1300 -= 806589953;
         this.anIntArray_1290 = null;
         if(this.anInt_1300 * -741316095 == 0) {
            this.aLongArray_1279 = null;
            this.aStringArray_1287 = null;
            this.aByteArray_1289 = null;
            this.anIntArray_1291 = null;
            this.anIntArray_1277 = null;
            this.aBooleanArray_1293 = null;
            this.anInt_1297 = 1489020987;
            this.anInt_1295 = -989180007;
         } else {
            System.arraycopy(this.aByteArray_1289, var1 + 1, this.aByteArray_1289, var1, -741316095 * this.anInt_1300 - var1);
            System.arraycopy(this.anIntArray_1291, 1 + var1, this.anIntArray_1291, var1, -741316095 * this.anInt_1300 - var1);
            System.arraycopy(this.anIntArray_1277, var1 + 1, this.anIntArray_1277, var1, -741316095 * this.anInt_1300 - var1);
            System.arraycopy(this.aBooleanArray_1293, 1 + var1, this.aBooleanArray_1293, var1, this.anInt_1300 * -741316095 - var1);
            if(null != this.aLongArray_1279) {
               System.arraycopy(this.aLongArray_1279, var1 + 1, this.aLongArray_1279, var1, this.anInt_1300 * -741316095 - var1);
            }

            if(this.aStringArray_1287 != null) {
               System.arraycopy(this.aStringArray_1287, var1 + 1, this.aStringArray_1287, var1, -741316095 * this.anInt_1300 - var1);
            }

            this.method697(-735679460);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method697(int var1) {
      if(0 == this.anInt_1300 * -741316095) {
         this.anInt_1297 = 1489020987;
         this.anInt_1295 = -989180007;
      } else {
         this.anInt_1297 = 1489020987;
         this.anInt_1295 = -989180007;
         int var2 = 0;
         byte var3 = this.aByteArray_1289[0];

         for(int var4 = 1; var4 < this.anInt_1300 * -741316095; ++var4) {
            if(this.aByteArray_1289[var4] > var3) {
               if(var3 == 125) {
                  this.anInt_1295 = var2 * 989180007;
               }

               var2 = var4;
               var3 = this.aByteArray_1289[var4];
            } else if(2018143063 * this.anInt_1295 == -1 && 125 == this.aByteArray_1289[var4]) {
               this.anInt_1295 = 989180007 * var4;
            }
         }

         this.anInt_1297 = var2 * -1489020987;
         if(-1 != this.anInt_1297 * -212594931) {
            this.aByteArray_1289[-212594931 * this.anInt_1297] = 126;
         }

      }
   }

   public Long method698(int var1, short var2) {
      if(null == this.aNodeArrayList_1278) {
         return null;
      } else {
         NodeListNode var3 = this.aNodeArrayList_1278.getNode((long)var1);
         return null != var3 && var3 instanceof Class240_Sub14?new Long(-855155696853016087L * ((Class240_Sub14)var3).aLong_6833):null;
      }
   }

   void method699(int var1, int var2) {
      this.anInt_1286 -= 668143359;
      if(-297012993 * this.anInt_1286 == 0) {
         this.aLongArray_1288 = null;
         this.aStringArray_1299 = null;
      } else {
         if(null != this.aLongArray_1288) {
            System.arraycopy(this.aLongArray_1288, 1 + var1, this.aLongArray_1288, var1, -297012993 * this.anInt_1286 - var1);
         }

         if(this.aStringArray_1299 != null) {
            System.arraycopy(this.aStringArray_1299, var1 + 1, this.aStringArray_1299, var1, -297012993 * this.anInt_1286 - var1);
         }
      }

   }

   int method700(int var1, boolean var2, int var3) {
      if(var2 == this.aBooleanArray_1293[var1]) {
         return -1;
      } else {
         this.aBooleanArray_1293[var1] = var2;
         return var1;
      }
   }

   int method701(int var1, int var2, int var3, int var4, byte var5) {
      int var6 = (1 << var3) - 1;
      int var7 = 31 == var4?-1:(1 << 1 + var4) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.anIntArray_1291[var1];
      if(var2 == (var9 & var8)) {
         return -1;
      } else {
         var9 &= ~var8;
         this.anIntArray_1291[var1] = var9 | var2;
         return var1;
      }
   }

   boolean method702(int var1, int var2, int var3) {
      if(this.aNodeArrayList_1278 != null) {
         NodeListNode var4 = this.aNodeArrayList_1278.getNode((long)var1);
         if(var4 != null) {
            if(var4 instanceof IndexNode) {
               IndexNode var5 = (IndexNode)var4;
               if(523939595 * var5.cacheID == var2) {
                  return false;
               }

               var5.cacheID = 1848583331 * var2;
               return true;
            }

            var4.shiftNext();
         }
      } else {
         this.aNodeArrayList_1278 = new NodeArrayList(4);
      }

      this.aNodeArrayList_1278.insert(new IndexNode(var2), (long)var1);
      return true;
   }

   boolean method703(int var1, int var2, int var3, int var4, int var5) {
      int var6 = (1 << var3) - 1;
      int var7 = 31 == var4?-1:(1 << 1 + var4) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if(null != this.aNodeArrayList_1278) {
         NodeListNode var9 = this.aNodeArrayList_1278.getNode((long)var1);
         if(var9 != null) {
            if(var9 instanceof IndexNode) {
               IndexNode var10 = (IndexNode)var9;
               if(var2 == (var10.cacheID * 523939595 & var8)) {
                  return false;
               }

               var10.cacheID = (523939595 * var10.cacheID & ~var8) * 1848583331;
               var10.cacheID = (var10.cacheID * 523939595 | var2) * 1848583331;
               return true;
            }

            var9.shiftNext();
         }
      } else {
         this.aNodeArrayList_1278 = new NodeArrayList(4);
      }

      this.aNodeArrayList_1278.insert(new IndexNode(var2), (long)var1);
      return true;
   }

   boolean method704(int var1, long var2) {
      if(this.aNodeArrayList_1278 != null) {
         NodeListNode var4 = this.aNodeArrayList_1278.getNode((long)var1);
         if(null != var4) {
            if(var4 instanceof Class240_Sub14) {
               Class240_Sub14 var5 = (Class240_Sub14)var4;
               if(var2 == var5.aLong_6833 * -855155696853016087L) {
                  return false;
               }

               var5.aLong_6833 = var2 * 4853622503744357977L;
               return true;
            }

            var4.shiftNext();
         }
      } else {
         this.aNodeArrayList_1278 = new NodeArrayList(4);
      }

      this.aNodeArrayList_1278.insert(new Class240_Sub14(var2), (long)var1);
      return true;
   }

   boolean method705(int var1, String var2, byte var3) {
      if(var2 == null) {
         var2 = "";
      } else if(var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if(this.aNodeArrayList_1278 != null) {
         NodeListNode var4 = this.aNodeArrayList_1278.getNode((long)var1);
         if(var4 != null) {
            if(var4 instanceof Class240_Sub9) {
               Class240_Sub9 var5 = (Class240_Sub9)var4;
               if(var5.anObject_6783 instanceof String) {
                  if(var2.equals(var5.anObject_6783)) {
                     return false;
                  }

                  var5.shiftNext();
                  this.aNodeArrayList_1278.insert(new Class240_Sub9(var2), 4058728944299054175L * var5.id);
                  return true;
               }
            }

            var4.shiftNext();
         }
      } else {
         this.aNodeArrayList_1278 = new NodeArrayList(4);
      }

      this.aNodeArrayList_1278.insert(new Class240_Sub9(var2), (long)var1);
      return true;
   }

   void method706(ByteArrayDataNode var1, int var2) {
      int var3 = var1.readByte(-223801861);
      if(var3 >= 1 && var3 <= 6) {
         int var4 = var1.readByte(886448112);
         if((var4 & 1) != 0) {
            this.aBoolean_1276 = true;
         }

         if(0 != (var4 & 2)) {
            this.aBoolean_1280 = true;
         }

         if(!this.aBoolean_1276) {
            this.aLongArray_1279 = null;
            this.aLongArray_1288 = null;
         }

         if(!this.aBoolean_1280) {
            this.aStringArray_1287 = null;
            this.aStringArray_1299 = null;
         }

         this.anInt_1292 = var1.method4480(1260717178) * 181894743;
         this.anInt_1281 = var1.method4480(1260717178) * -989205709;
         if(var3 <= 3 && 0 != 247990267 * this.anInt_1281) {
            this.anInt_1281 += -667458848;
         }

         this.anInt_1300 = var1.readShort(197457328) * 806589953;
         this.anInt_1286 = var1.readByte(-52364782) * 668143359;
         this.aString_1302 = var1.method4485(1396190177);
         if(var3 >= 4) {
            var1.method4480(1260717178);
         }

         this.aBoolean_1282 = var1.readByte(-780055218) == 1;
         this.aByte_1283 = var1.getByte((byte)118);
         this.aByte_1298 = var1.getByte((byte)2);
         this.aByte_1285 = var1.getByte((byte)103);
         this.aByte_1275 = var1.getByte((byte)74);
         int var5;
         if(this.anInt_1300 * -741316095 > 0) {
            if(this.aBoolean_1276 && (this.aLongArray_1279 == null || this.aLongArray_1279.length < this.anInt_1300 * -741316095)) {
               this.aLongArray_1279 = new long[-741316095 * this.anInt_1300];
            }

            if(this.aBoolean_1280 && (null == this.aStringArray_1287 || this.aStringArray_1287.length < -741316095 * this.anInt_1300)) {
               this.aStringArray_1287 = new String[-741316095 * this.anInt_1300];
            }

            if(this.aByteArray_1289 == null || this.aByteArray_1289.length < -741316095 * this.anInt_1300) {
               this.aByteArray_1289 = new byte[this.anInt_1300 * -741316095];
            }

            if(null == this.anIntArray_1291 || this.anIntArray_1291.length < this.anInt_1300 * -741316095) {
               this.anIntArray_1291 = new int[-741316095 * this.anInt_1300];
            }

            if(null == this.anIntArray_1277 || this.anIntArray_1277.length < -741316095 * this.anInt_1300) {
               this.anIntArray_1277 = new int[-741316095 * this.anInt_1300];
            }

            if(null == this.aBooleanArray_1293 || this.aBooleanArray_1293.length < -741316095 * this.anInt_1300) {
               this.aBooleanArray_1293 = new boolean[-741316095 * this.anInt_1300];
            }

            for(var5 = 0; var5 < -741316095 * this.anInt_1300; ++var5) {
               if(this.aBoolean_1276) {
                  this.aLongArray_1279[var5] = var1.method4538(1385013726);
               }

               if(this.aBoolean_1280) {
                  this.aStringArray_1287[var5] = var1.method4523(-892050887);
               }

               this.aByteArray_1289[var5] = var1.getByte((byte)49);
               if(var3 >= 2) {
                  this.anIntArray_1291[var5] = var1.method4480(1260717178);
               }

               if(var3 >= 5) {
                  this.anIntArray_1277[var5] = var1.readShort(602523792);
               } else {
                  this.anIntArray_1277[var5] = 0;
               }

               if(var3 >= 6) {
                  this.aBooleanArray_1293[var5] = var1.readByte(1003314358) == 1;
               } else {
                  this.aBooleanArray_1293[var5] = false;
               }
            }

            this.method697(-735679460);
         }

         if(-297012993 * this.anInt_1286 > 0) {
            if(this.aBoolean_1276 && (null == this.aLongArray_1288 || this.aLongArray_1288.length < -297012993 * this.anInt_1286)) {
               this.aLongArray_1288 = new long[-297012993 * this.anInt_1286];
            }

            if(this.aBoolean_1280 && (null == this.aStringArray_1299 || this.aStringArray_1299.length < -297012993 * this.anInt_1286)) {
               this.aStringArray_1299 = new String[-297012993 * this.anInt_1286];
            }

            for(var5 = 0; var5 < -297012993 * this.anInt_1286; ++var5) {
               if(this.aBoolean_1276) {
                  this.aLongArray_1288[var5] = var1.method4538(1385013726);
               }

               if(this.aBoolean_1280) {
                  this.aStringArray_1299[var5] = var1.method4523(-892050887);
               }
            }
         }

         if(var3 >= 3) {
            var5 = var1.readShort(560470193);
            if(var5 > 0) {
               this.aNodeArrayList_1278 = new NodeArrayList(var5 < 16?Class105.method1359(var5, (byte)124):16);

               while(var5-- > 0) {
                  int var6 = var1.method4480(1260717178);
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if(var8 == 0) {
                     int var9 = var1.method4480(1260717178);
                     this.aNodeArrayList_1278.insert(new IndexNode(var9), (long)var7);
                  } else if(var8 == 1) {
                     long var10 = var1.method4538(1385013726);
                     this.aNodeArrayList_1278.insert(new Class240_Sub14(var10), (long)var7);
                  } else if(var8 == 2) {
                     String var12 = var1.method4485(-486232006);
                     this.aNodeArrayList_1278.insert(new Class240_Sub9(var12), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }

   public Integer method707(int var1, int var2) {
      if(this.aNodeArrayList_1278 == null) {
         return null;
      } else {
         NodeListNode var3 = this.aNodeArrayList_1278.getNode((long)var1);
         return null != var3 && var3 instanceof IndexNode?new Integer(((IndexNode)var3).cacheID * 523939595):null;
      }
   }

   public int[] method708(int var1) {
      if(null == this.anIntArray_1290) {
         String[] var2 = new String[this.anInt_1300 * -741316095];
         this.anIntArray_1290 = new int[-741316095 * this.anInt_1300];

         for(int var3 = 0; var3 < -741316095 * this.anInt_1300; this.anIntArray_1290[var3] = var3++) {
            var2[var3] = this.aStringArray_1287[var3];
         }

         WorldObjects.method3459(var2, this.anIntArray_1290, 151031131);
      }

      return this.anIntArray_1290;
   }

   public Class68(ByteArrayDataNode var1) {
      this.method706(var1, -867271930);
   }

   void method709(long var1, String var3, int var4) {
      if(var3 != null && var3.length() == 0) {
         var3 = null;
      }

      boolean var10000;
      if(var1 > 0L) {
         if(var4 <= 478075499) {
            return;
         }

         var10000 = true;
      } else {
         var10000 = false;
      }

      if(var10000 != this.aBoolean_1276) {
         throw new RuntimeException("");
      } else if(null != var3 != this.aBoolean_1280) {
         throw new RuntimeException("");
      } else {
         label76: {
            if(var1 <= 0L || null != this.aLongArray_1288 && this.anInt_1286 * -297012993 < this.aLongArray_1288.length) {
               if(null == var3) {
                  break label76;
               }

               if(this.aStringArray_1299 != null) {
                  if(-297012993 * this.anInt_1286 < this.aStringArray_1299.length) {
                     break label76;
                  }

                  if(var4 <= 478075499) {
                     return;
                  }
               }
            }

            this.method692(this.anInt_1286 * -297012993 + 5, 421376191);
         }

         if(this.aLongArray_1288 != null) {
            if(var4 <= 478075499) {
               return;
            }

            this.aLongArray_1288[this.anInt_1286 * -297012993] = var1;
         }

         if(null != this.aStringArray_1299) {
            this.aStringArray_1299[-297012993 * this.anInt_1286] = var3;
         }

         this.anInt_1286 += 668143359;
      }
   }

   int method710(int var1, byte var2, int var3) {
      if(126 != var2 && var2 != 127) {
         if(this.anInt_1297 * -212594931 == var1 && (-1 == 2018143063 * this.anInt_1295 || this.aByteArray_1289[2018143063 * this.anInt_1295] < 125)) {
            return -1;
         } else if(var2 == this.aByteArray_1289[var1]) {
            return -1;
         } else {
            this.aByteArray_1289[var1] = var2;
            this.method697(-735679460);
            return var1;
         }
      } else {
         return -1;
      }
   }

   public int method711(String var1, int var2) {
      if(var1 != null && var1.length() != 0) {
         for(int var3 = 0; var3 < this.anInt_1300 * -741316095; ++var3) {
            if(this.aStringArray_1287[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static void method712(byte var0) {
      Class366.anInt_6914 = 0;
      Class366.anInt_6912 = 0;
   }

   static final void method713(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class371.method4716(var3, var4, var0, 854108464);
   }

   static final void method714(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      Class4.method21(var2, -1294088421);
   }

   static final void method715(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub2_7313, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] != 0?1:0, 807978112);
      Class83.method1089(-1630200907);
   }

   static final void method716(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSWorld var3 = Class113.getRSWorld(var2, 2065828175);
      if(null != var3) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.flags * -1696859433;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.locAcc;
         Class625 var4 = var3.method4392(923859637);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4.anInt_10045 * 571842637;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var4.aString_10046;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 485515171 * var3.players;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -524571829 * var3.ping;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.worldAddress;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   public static Class430 method717(ByteArrayDataNode var0, byte var1) {
      Class430 var2 = Class283_Sub2.method5017(var0, 1048866820);
      int var3 = var0.method4484((byte)-12);
      return new Class430_Sub1(var2.anInt_8264 * -962773505, var2.aClass419_8262, var2.aClass412_8263, -1666406649 * var2.anInt_8261, 355910967 * var2.anInt_8265, var3);
   }
}
