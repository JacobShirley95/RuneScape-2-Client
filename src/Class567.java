
public class Class567 {

   int id;
   byte[] aByteArray_9616;
   int anInt_9617;
   Class558 aClass558_9618;
   int anInt_9619 = 0;
   short[] aShortArray_9620;
   short[] aShortArray_9621;
   short[] aShortArray_9622;
   public int animationID = 2128650053;
   short[] aShortArray_9624;
   int anInt_9625 = -12563072;
   int anInt_9626 = 2114499712;
   byte[] aByteArray_9627;
   int anInt_9628 = 0;
   int anInt_9629 = 0;
   public boolean aBoolean_9630 = false;


   public final boolean method6238(short var1) {
      return 733203063 * this.anInt_9617 == -1?true:this.aClass558_9618.aCacheUnpacker_9554.method3568(this.anInt_9617 * 733203063, 0, 1424440855);
   }

   void method6239(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(659079654);
         if(var3 == 0) {
            return;
         }

         this.method6240(var1, var3, (byte)104);
      }
   }

   void method6240(ByteArrayDataNode var1, int var2, byte var3) {
      if(var2 == 1) {
         this.anInt_9617 = var1.method4493(-157074556) * 796995399;
      } else if(var2 == 2) {
         this.animationID = var1.method4493(-157074556) * -2128650053;
      } else if(var2 == 4) {
         this.anInt_9625 = var1.readShort(233161958) * 570327195;
      } else if(var2 == 5) {
         this.anInt_9626 = var1.readShort(-1297027250) * -1292103319;
      } else if(var2 == 6) {
         this.anInt_9629 = var1.readShort(542500325) * -345345787;
      } else if(var2 == 7) {
         this.anInt_9628 = var1.readByte(346624708) * -1391634671;
      } else if(var2 == 8) {
         this.anInt_9619 = var1.readByte(-384257531) * 481655619;
      } else if(var2 == 10) {
         this.aBoolean_9630 = true;
      } else {
         int var4;
         int var5;
         if(40 == var2) {
            var4 = var1.readByte(207488030);
            this.aShortArray_9624 = new short[var4];
            this.aShortArray_9620 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray_9624[var5] = (short)var1.readShort(1042239324);
               this.aShortArray_9620[var5] = (short)var1.readShort(-146295585);
            }
         } else if(41 == var2) {
            var4 = var1.readByte(-912980501);
            this.aShortArray_9621 = new short[var4];
            this.aShortArray_9622 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray_9621[var5] = (short)var1.readShort(1680571456);
               this.aShortArray_9622[var5] = (short)var1.readShort(-1054510362);
            }
         } else {
            int var6;
            int var7;
            byte var8;
            if(44 == var2) {
               var4 = var1.readShort(-593052515);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray_9627 = new byte[var5];
               var8 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray_9627[var7] = var8++;
                  } else {
                     this.aByteArray_9627[var7] = -1;
                  }
               }
            } else if(45 == var2) {
               var4 = var1.readShort(-953579333);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray_9616 = new byte[var5];
               var8 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray_9616[var7] = var8++;
                  } else {
                     this.aByteArray_9616[var7] = -1;
                  }
               }
            } else if(46 == var2) {
               ;
            }
         }
      }

   }

   public final Model method6241(Renderer var1, int var2, Animator var3, byte var4, int var5) {
      return this.method6242(var1, var2, false, (Plane)null, (Plane)null, 0, 0, 0, var3, var4, 1881518153);
   }

   public final Model method6242(Renderer var1, int var2, boolean var3, Plane var4, Plane var5, int var6, int var7, int var8, Animator var9, byte var10, int var11) {
      int var12 = var2;
      if(null != var9) {
         var12 = var2 | var9.getFlags((short)-26400);
      }

      if(this.anInt_9626 * -1901752615 != 128) {
         var12 |= 2;
      }

      if(this.anInt_9625 * -1563597421 != 128 || 0 != this.anInt_9629 * -195447859) {
         var12 |= 5;
      }

      CacheNodeArrayList var13 = this.aClass558_9618.aClass627_9553;
      Model var14;
      synchronized(this.aClass558_9618.aClass627_9553) {
         var14 = (Model)this.aClass558_9618.aClass627_9553.getObject((long)((this.id = 1417824327 * (-1178148489 * this.id | var1.rendererID * -1555911463 << 29)) * -1178148489));
      }

      if(null == var14 || var1.method1940(var14.method2015(), var12) != 0) {
         if(null != var14) {
            var12 = var1.method1941(var12, var14.method2015());
         }

         int var20 = var12;
         if(null != this.aShortArray_9624) {
            var20 = var12 | 16384;
         }

         if(this.aShortArray_9621 != null) {
            var20 |= '\u8000';
         }

         ModelData var15 = ModelData.createModelUnpacker(this.aClass558_9618.aCacheUnpacker_9554, this.anInt_9617 * 733203063, 0);
         if(null == var15) {
            return null;
         }

         if(var15.anInt_1848 < 13) {
            var15.method1229(2);
         }

         var14 = var1.createModel(var15, var20, this.aClass558_9618.anInt_9557 * 1047135475, this.anInt_9628 * -2018870799 + 64, 850 + this.anInt_9619 * 1578985835);
         int var16;
         if(this.aShortArray_9624 != null) {
            for(var16 = 0; var16 < this.aShortArray_9624.length; ++var16) {
               var14.method2030(this.aShortArray_9624[var16], this.aShortArray_9620[var16]);
            }
         }

         if(null != this.aShortArray_9621) {
            for(var16 = 0; var16 < this.aShortArray_9621.length; ++var16) {
               var14.method2035(this.aShortArray_9621[var16], this.aShortArray_9622[var16]);
            }
         }

         var14.method2042(var12);
         CacheNodeArrayList var22 = this.aClass558_9618.aClass627_9553;
         synchronized(this.aClass558_9618.aClass627_9553) {
            this.aClass558_9618.aClass627_9553.insert(var14, (long)((this.id = (-1178148489 * this.id | -1555911463 * var1.rendererID << 29) * 1417824327) * -1178148489));
         }
      }

      Model var21 = var14.copy(var10, var12, true);
      if(null != var9) {
         var9.applyToModel(var21, 0, -157344789);
      }

      if(128 != this.anInt_9625 * -1563597421 || this.anInt_9626 * -1901752615 != 128) {
         var21.method2012(-1563597421 * this.anInt_9625, -1901752615 * this.anInt_9626, this.anInt_9625 * -1563597421);
      }

      if(-195447859 * this.anInt_9629 != 0) {
         if(90 == -195447859 * this.anInt_9629) {
            var21.method2017(4096);
         }

         if(180 == -195447859 * this.anInt_9629) {
            var21.method2017(8192);
         }

         if(270 == this.anInt_9629 * -195447859) {
            var21.method2017(12288);
         }
      }

      var21.method2042(var2);
      return var21;
   }

   static final void method6243(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class450.method5522(var3, var0, 1610244876);
   }

   public static void method6244(Class187 var0, int var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(1, (long)(var0.anInt_3198 * -1982395567));
      var2.method597((byte)0);
   }

   static void method6245(int var0, int var1, int var2, int var3, int var4) {
      Class240_Sub22_Sub5 var5 = Class65_Sub1_Sub2.method866(8, (long)var0);
      var5.method596((byte)69);
      var5.anInt_1175 = var1 * 134353971;
      var5.anInt_1165 = -771972147 * var2;
      var5.anInt_1163 = 1200440971 * var3;
   }
}
