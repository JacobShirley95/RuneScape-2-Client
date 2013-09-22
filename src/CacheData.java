import java.util.zip.CRC32;

public class CacheData extends AbstractCacheData {

   static final byte aByte_8293 = -1;
   AbstractUpdateServerConnector updateServer;
   Class370 aClass370_8295;
   Class243 aClass243_8296;
   Class372 aClass372_8297;
   Class240_Sub22_Sub15 aClass240_Sub22_Sub15_8298;
   int anInt_8299;
   byte[] aByteArray_8300;
   Class243 aClass243_8301;
   boolean aBoolean_8302;
   static final byte aByte_8303 = 0;
   static final byte aByte_8304 = 1;
   boolean initialised;
   byte[] aByteArray_8306;
   int anInt_8307 = 0;
   NodeArrayList loadedDataList = new NodeArrayList(16);
   int anInt_8309;
   static final int anInt_8310 = 1;
   boolean aBoolean_8311;
   int anInt_8312 = 0;
   boolean aBoolean_8313;
   NodeList aNodeList_8314 = new NodeList();
   static final int anInt_8315 = 2;
   long aLong_8316 = 0L;
   static final int anInt_8317 = 1000;
   static final int anInt_8318 = 0;
   static CRC32 aCRC32_8319 = new CRC32();
   int anInt_8320;
   NodeList aNodeList_8321;
   static final int anInt_8322 = 250;


   void defineCacheData(int var1, byte[] var2, int var3, int var4, int var5) {
      if(-2026939155 * this.anInt_8299 == var1 && -1398040811 * this.anInt_8320 == var3) {
         boolean var6 = true;

         for(int var7 = 0; var7 < this.aByteArray_8300.length; ++var7) {
            if(this.aByteArray_8300[var7] != var2[var7]) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return;
         }
      }

      this.anInt_8299 = -1093836571 * var1;
      this.aByteArray_8300 = var2;
      this.anInt_8320 = var3 * 904462397;
      this.aClass372_8297 = null;
      this.aClass240_Sub22_Sub15_8298 = null;
      if(!this.updateServer.method3631((byte)58)) {
         this.aClass240_Sub22_Sub15_8298 = this.updateServer.addNode(255, -183649795 * this.anInt_8309, (byte)0, true, (byte)71);
      }

   }

   public int method5380(int var1) {
      return this.method4672(-816321221) == null?(this.aClass240_Sub22_Sub15_8298 == null?0:this.aClass240_Sub22_Sub15_8298.percentLoaded((short)22977)):100;
   }

   Class372 method4672(int var1) {
      if(this.aClass372_8297 != null) {
         return this.aClass372_8297;
      } else {
         if(this.aClass240_Sub22_Sub15_8298 == null) {
            if(this.updateServer.method3631((byte)-56)) {
               return null;
            }

            this.aClass240_Sub22_Sub15_8298 = this.updateServer.addNode(255, this.anInt_8309 * -183649795, (byte)0, true, (byte)89);
         }

         if(this.aClass240_Sub22_Sub15_8298.aBoolean_3671) {
            return null;
         } else {
            byte[] var2 = this.aClass240_Sub22_Sub15_8298.getBytes(-2114952936);
            if(this.aClass240_Sub22_Sub15_8298 instanceof CacheDataNode) {
               try {
                  if(null == var2) {
                     throw new RuntimeException();
                  }

                  this.aClass372_8297 = new Class372(var2, -2026939155 * this.anInt_8299, this.aByteArray_8300);
                  if(-1398040811 * this.anInt_8320 != -140398345 * this.aClass372_8297.anInt_6946) {
                     throw new RuntimeException();
                  }
               } catch (RuntimeException var4) {
                  this.aClass372_8297 = null;
                  if(this.updateServer.method3631((byte)-44)) {
                     this.aClass240_Sub22_Sub15_8298 = null;
                  } else {
                     this.aClass240_Sub22_Sub15_8298 = this.updateServer.addNode(255, this.anInt_8309 * -183649795, (byte)0, true, (byte)-18);
                  }

                  return null;
               }
            } else {
               try {
                  if(null == var2) {
                     throw new RuntimeException();
                  }

                  this.aClass372_8297 = new Class372(var2, -2026939155 * this.anInt_8299, this.aByteArray_8300);
               } catch (RuntimeException var5) {
                  this.updateServer.method3633(-1461590632);
                  this.aClass372_8297 = null;
                  if(this.updateServer.method3631((byte)20)) {
                     this.aClass240_Sub22_Sub15_8298 = null;
                  } else {
                     this.aClass240_Sub22_Sub15_8298 = this.updateServer.addNode(255, -183649795 * this.anInt_8309, (byte)0, true, (byte)-5);
                  }

                  return null;
               }

               if(this.aClass243_8301 != null) {
                  this.aClass370_8295.createDataNode(this.anInt_8309 * -183649795, var2, this.aClass243_8301, -260585218);
               }
            }

            this.aClass240_Sub22_Sub15_8298 = null;
            if(null != this.aClass243_8296) {
               this.aByteArray_8306 = new byte[-1690688605 * this.aClass372_8297.objectsCount];
               this.anInt_8307 = 0;
            }

            return this.aClass372_8297;
         }
      }
   }

   public int method5382(int var1) {
      if(this.aClass372_8297 == null) {
         return 0;
      } else if(!this.aBoolean_8311) {
         return this.aClass372_8297.totalSize * 304787597;
      } else {
         NodeListNode var2 = this.aNodeList_8321.getBaseNode_2((byte)57);
         return null == var2?0:(int)(4058728944299054175L * var2.id);
      }
   }

   void method5383(byte var1) {
      if(this.aNodeList_8321 != null) {
         if(this.method4672(1924263329) != null) {
            for(NodeListNode var2 = this.aNodeList_8314.getBaseNode_2((byte)93); null != var2; var2 = this.aNodeList_8314.getNext(-1037999382)) {
               int var3 = (int)(4058728944299054175L * var2.id);
               if(var3 >= 0 && var3 < this.aClass372_8297.objectsCount * -1690688605 && 0 != this.aClass372_8297.anIntArray_6955[var3]) {
                  if(this.aByteArray_8306[var3] == 0) {
                     this.updateCache(var3, 1, -2091098868);
                  }

                  if(this.aByteArray_8306[var3] == -1) {
                     this.updateCache(var3, 2, -2144724810);
                  }

                  if(1 == this.aByteArray_8306[var3]) {
                     var2.shiftNext();
                  }
               } else {
                  var2.shiftNext();
               }
            }

         }
      }
   }

   void method5384(int var1) {
      if(this.aNodeList_8321 != null) {
         if(this.method4672(1432252016) == null) {
            return;
         }

         boolean var2;
         NodeListNode var3;
         int var4;
         if(this.aBoolean_8311) {
            var2 = true;

            for(var3 = this.aNodeList_8321.getBaseNode_2((byte)28); var3 != null; var3 = this.aNodeList_8321.getNext(-1522471172)) {
               var4 = (int)(4058728944299054175L * var3.id);
               if(this.aByteArray_8306[var4] == 0) {
                  this.updateCache(var4, 1, -2105853834);
               }

               if(this.aByteArray_8306[var4] != 0) {
                  var3.shiftNext();
               } else {
                  var2 = false;
               }
            }

            while(this.anInt_8312 * 1983998907 < this.aClass372_8297.anIntArray_6955.length) {
               if(this.aClass372_8297.anIntArray_6955[this.anInt_8312 * 1983998907] == 0) {
                  this.anInt_8312 += -1076584077;
               } else {
                  if(-129983711 * this.aClass370_8295.anInt_6926 >= 250) {
                     var2 = false;
                     break;
                  }

                  if(this.aByteArray_8306[this.anInt_8312 * 1983998907] == 0) {
                     this.updateCache(this.anInt_8312 * 1983998907, 1, -2136842007);
                  }

                  if(0 == this.aByteArray_8306[this.anInt_8312 * 1983998907]) {
                     var3 = new NodeListNode();
                     var3.id = 6607250884480484901L * (long)this.anInt_8312;
                     this.aNodeList_8321.addNode(var3, (short)19740);
                     var2 = false;
                  }

                  this.anInt_8312 += -1076584077;
               }
            }

            if(var2) {
               this.aBoolean_8311 = false;
               this.anInt_8312 = 0;
            }
         } else if(this.aBoolean_8302) {
            var2 = true;

            for(var3 = this.aNodeList_8321.getBaseNode_2((byte)125); null != var3; var3 = this.aNodeList_8321.getNext(-1777195802)) {
               var4 = (int)(var3.id * 4058728944299054175L);
               if(1 != this.aByteArray_8306[var4]) {
                  this.updateCache(var4, 2, -2110987303);
               }

               if(this.aByteArray_8306[var4] == 1) {
                  var3.shiftNext();
               } else {
                  var2 = false;
               }
            }

            while(1983998907 * this.anInt_8312 < this.aClass372_8297.anIntArray_6955.length) {
               if(0 == this.aClass372_8297.anIntArray_6955[1983998907 * this.anInt_8312]) {
                  this.anInt_8312 += -1076584077;
               } else {
                  if(this.updateServer.method3630(93217772)) {
                     var2 = false;
                     break;
                  }

                  if(1 != this.aByteArray_8306[this.anInt_8312 * 1983998907]) {
                     this.updateCache(1983998907 * this.anInt_8312, 2, -2120290445);
                  }

                  if(this.aByteArray_8306[this.anInt_8312 * 1983998907] != 1) {
                     var3 = new NodeListNode();
                     var3.id = 6607250884480484901L * (long)this.anInt_8312;
                     this.aNodeList_8321.addNode(var3, (short)2800);
                     var2 = false;
                  }

                  this.anInt_8312 += -1076584077;
               }
            }

            if(var2) {
               this.aBoolean_8302 = false;
               this.anInt_8312 = 0;
            }
         } else {
            this.aNodeList_8321 = null;
         }
      }

      if(this.aBoolean_8313 && Class373.getCurrentTime((short)5022) >= -7428805617710324717L * this.aLong_8316) {
         for(Class240_Sub22_Sub15 var5 = (Class240_Sub22_Sub15)this.loadedDataList.start(); var5 != null; var5 = (Class240_Sub22_Sub15)this.loadedDataList.next()) {
            if(!var5.aBoolean_3671) {
               if(var5.aBoolean_3669) {
                  if(!var5.aBoolean_3670) {
                     throw new RuntimeException();
                  }

                  var5.shiftNext();
               } else {
                  var5.aBoolean_3669 = true;
               }
            }
         }

         this.aLong_8316 = (Class373.getCurrentTime((short)9572) + 1000L) * -1927200607730776549L;
      }

   }

   public int getTotalSize(short var1) {
      return this.aClass372_8297 == null?0:304787597 * this.aClass372_8297.totalSize;
   }

   public int method5386(int var1) {
      return 722051407 * this.anInt_8307;
   }

   public void init() {
      if(this.aClass243_8296 != null) {
         this.aBoolean_8302 = true;
         this.initialised = true;
         if(null == this.aNodeList_8321) {
            this.aNodeList_8321 = new NodeList();
         }

      }
   }

   public boolean isInit() {
      return this.initialised;
   }

   int getPercentLoaded(int var1, int var2) {
      Class240_Sub22_Sub15 var3 = (Class240_Sub22_Sub15)this.loadedDataList.getNode((long)var1);
      return null != var3?var3.percentLoaded((short)31694):0;
   }

   void method4671(int var1, byte var2) {
      if(this.aClass243_8296 != null) {
         NodeListNode var3;
         for(var3 = this.aNodeList_8314.getBaseNode_2((byte)78); var3 != null; var3 = this.aNodeList_8314.getNext(-694900860)) {
            if((long)var1 == 4058728944299054175L * var3.id) {
               return;
            }
         }

         var3 = new NodeListNode();
         var3.id = (long)var1 * -3961580539627386977L;
         this.aNodeList_8314.addNode(var3, (short)16048);
      }
   }

   Class240_Sub22_Sub15 updateCache(int var1, int var2, int var3) {
      Object var4 = (Class240_Sub22_Sub15)this.loadedDataList.getNode((long)var1);
      if(null != var4 && var2 == 0 && !((Class240_Sub22_Sub15)var4).aBoolean_3670 && ((Class240_Sub22_Sub15)var4).aBoolean_3671) {
         ((Class240_Sub22_Sub15)var4).shiftNext();
         var4 = null;
      }

      if(null == var4) {
         if(0 == var2) {
            if(this.aClass243_8296 != null && this.aByteArray_8306[var1] != -1) {
               var4 = this.aClass370_8295.method4691(var1, this.aClass243_8296, (short)25695);
            } else {
               if(this.updateServer.method3631((byte)70)) {
                  return null;
               }

               var4 = this.updateServer.addNode(-183649795 * this.anInt_8309, var1, (byte)2, true, (byte)-3);
            }
         } else if(var2 == 1) {
            if(null == this.aClass243_8296) {
               throw new RuntimeException();
            }

            var4 = this.aClass370_8295.createDataNode(var1, this.aClass243_8296, (byte)41);
         } else {
            if(2 != var2) {
               throw new RuntimeException();
            }

            if(null == this.aClass243_8296) {
               throw new RuntimeException();
            }

            if(this.aByteArray_8306[var1] != -1) {
               throw new RuntimeException();
            }

            if(this.updateServer.method3630(-1588403453)) {
               return null;
            }

            var4 = this.updateServer.addNode(this.anInt_8309 * -183649795, var1, (byte)2, false, (byte)67);
         }

         this.loadedDataList.insert((NodeListNode)var4, (long)var1);
      }

      if(((Class240_Sub22_Sub15)var4).aBoolean_3671) {
         return null;
      } else {
         byte[] var5 = ((Class240_Sub22_Sub15)var4).getBytes(-2143624568);
         int var6;
         byte[] var7;
         byte[] var8;
         int var9;
         Class240_Sub22_Sub15_Sub1 var12;
         if(var4 instanceof CacheDataNode) {
            try {
               if(var5 != null && var5.length > 2) {
                  aCRC32_8319.reset();
                  aCRC32_8319.update(var5, 0, var5.length - 2);
                  var6 = (int)aCRC32_8319.getValue();
                  if(this.aClass372_8297.checksums[var1] != var6) {
                     throw new RuntimeException();
                  } else {
                     if(this.aClass372_8297.aByteArrayArray_6953 != null && this.aClass372_8297.aByteArrayArray_6953[var1] != null) {
                        var7 = this.aClass372_8297.aByteArrayArray_6953[var1];
                        var8 = Class255.method3348(var5, 0, var5.length - 2, -113478103);

                        for(var9 = 0; var9 < 64; ++var9) {
                           if(var8[var9] != var7[var9]) {
                              throw new RuntimeException();
                           }
                        }
                     }

                     int var13 = ((var5[var5.length - 2] & 255) << 8) + (var5[var5.length - 1] & 255);
                     if(var13 != (this.aClass372_8297.anIntArray_6954[var1] & '\uffff')) {
                        throw new RuntimeException();
                     } else {
                        if(1 != this.aByteArray_8306[var1]) {
                           if(this.aByteArray_8306[var1] == 0) {
                              ;
                           }

                           this.anInt_8307 += -2037590609;
                           this.aByteArray_8306[var1] = 1;
                        }

                        if(!((Class240_Sub22_Sub15)var4).aBoolean_3670) {
                           ((Class240_Sub22_Sub15)var4).shiftNext();
                        }

                        return (Class240_Sub22_Sub15)var4;
                     }
                  }
               } else {
                  throw new RuntimeException();
               }
            } catch (Exception var10) {
               this.aByteArray_8306[var1] = -1;
               ((Class240_Sub22_Sub15)var4).shiftNext();
               if(((Class240_Sub22_Sub15)var4).aBoolean_3670 && !this.updateServer.method3631((byte)9)) {
                  var12 = this.updateServer.addNode(-183649795 * this.anInt_8309, var1, (byte)2, true, (byte)-45);
                  this.loadedDataList.insert(var12, (long)var1);
               }

               return null;
            }
         } else {
            try {
               if(var5 == null || var5.length <= 2) {
                  throw new RuntimeException();
               }

               aCRC32_8319.reset();
               aCRC32_8319.update(var5, 0, var5.length - 2);
               var6 = (int)aCRC32_8319.getValue();
               if(this.aClass372_8297.checksums[var1] != var6) {
                  throw new RuntimeException();
               }

               if(this.aClass372_8297.aByteArrayArray_6953 != null && this.aClass372_8297.aByteArrayArray_6953[var1] != null) {
                  var7 = this.aClass372_8297.aByteArrayArray_6953[var1];
                  var8 = Class255.method3348(var5, 0, var5.length - 2, -113478103);

                  for(var9 = 0; var9 < 64; ++var9) {
                     if(var8[var9] != var7[var9]) {
                        throw new RuntimeException();
                     }
                  }
               }

               this.updateServer.status = 0;
               this.updateServer.anInt_4748 = 0;
            } catch (RuntimeException var11) {
               this.updateServer.method3633(-1351173540);
               ((Class240_Sub22_Sub15)var4).shiftNext();
               if(((Class240_Sub22_Sub15)var4).aBoolean_3670 && !this.updateServer.method3631((byte)-57)) {
                  var12 = this.updateServer.addNode(this.anInt_8309 * -183649795, var1, (byte)2, true, (byte)73);
                  this.loadedDataList.insert(var12, (long)var1);
               }

               return null;
            }

            var5[var5.length - 2] = (byte)(this.aClass372_8297.anIntArray_6954[var1] >>> 8);
            var5[var5.length - 1] = (byte)this.aClass372_8297.anIntArray_6954[var1];
            if(this.aClass243_8296 != null) {
               this.aClass370_8295.createDataNode(var1, var5, this.aClass243_8296, -145343233);
               if(this.aByteArray_8306[var1] != 1) {
                  this.anInt_8307 += -2037590609;
                  this.aByteArray_8306[var1] = 1;
               }
            }

            if(!((Class240_Sub22_Sub15)var4).aBoolean_3670) {
               ((Class240_Sub22_Sub15)var4).shiftNext();
            }

            return (Class240_Sub22_Sub15)var4;
         }
      }
   }

   byte[] method4669(int var1, int var2) {
      Class240_Sub22_Sub15 var3 = this.updateCache(var1, 0, -2084489312);
      if(null == var3) {
         return null;
      } else {
         byte[] var4 = var3.getBytes(-2082791072);
         var3.shiftNext();
         return var4;
      }
   }

   CacheData(int var1, Class243 var2, Class243 var3, AbstractUpdateServerConnector var4, Class370 var5, int var6, byte[] var7, int var8, boolean var9, int var10) {
      this.anInt_8309 = var1 * -160502955;
      this.aClass243_8296 = var2;
      if(null == this.aClass243_8296) {
         this.aBoolean_8311 = false;
      } else {
         this.aBoolean_8311 = true;
         this.aNodeList_8321 = new NodeList();
      }

      this.aClass243_8301 = var3;
      this.updateServer = var4;
      this.aClass370_8295 = var5;
      this.anInt_8299 = -1093836571 * var6;
      this.aByteArray_8300 = var7;
      this.anInt_8320 = 904462397 * var8;
      this.aBoolean_8313 = var9;
      if(null != this.aClass243_8301) {
         this.aClass240_Sub22_Sub15_8298 = this.aClass370_8295.method4691(this.anInt_8309 * -183649795, this.aClass243_8301, (short)30921);
      }

   }
}
