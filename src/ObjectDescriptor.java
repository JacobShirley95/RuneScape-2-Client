import java.util.Arrays;

public class ObjectDescriptor implements Class205 {

   CacheObjectLoader cacheObjectLoader;
   int[] anIntArray_8444;
   int anInt_8445 = -1575731072;
   static final int anInt_8446 = 6;
   public int anInt_8447 = 0;
   public static short[] aShortArray_8448 = new short[256];
   int anInt_8449 = 1218855073;
   int id;
   int anInt_8451 = 1806924715;
   int anInt_8452;
   public int anInt_8453 = 0;
   short[] aShortArray_8454;
   short[] aShortArray_8455;
   byte[] aByteArray_8456;
   short[] aShortArray_8457;
   public static final int anInt_8458 = 1;
   int anInt_8459 = 1171660017;
   int anInt_8460 = 1826717147;
   public int anInt_8461 = -1887327824;
   public int rotation = 0;
   public int anInt_8463 = 1598789731;
   public int anInt_8464 = 0;
   public static final int anInt_8465 = 0;
   public int anInt_8466 = 768959407;
   public int anInt_8467 = 0;
   public int anInt_8468 = 849703401;
   public int anInt_8469 = 867933117;
   public boolean inBank = false;
   public String[] screenOptions;
   public String[] invenOptions;
   int anInt_8473 = -1046467200;
   int[] anIntArray_8474;
   public int anInt_8475 = 1514134137;
   public int anInt_8476 = 0;
   public int anInt_8477 = -1604853115;
   int anInt_8478 = -261246985;
   short[] aShortArray_8479;
   int anInt_8480 = -1034396743;
   public int[] anIntArray_8481;
   int anInt_8482 = 0;
   int anInt_8483 = 2033256627;
   int anInt_8484 = 0;
   int anInt_8485 = 0;
   int anInt_8486 = 0;
   int anInt_8487 = 0;
   public int anInt_8488 = 0;
   int anInt_8489 = 0;
   int anInt_8490 = 1223198531;
   public static final int anInt_8491 = 2;
   int anInt_8492 = -1111982851;
   int anInt_8493 = 1080518201;
   int[] anIntArray_8494;
   int[] anIntArray_8495;
   public int anInt_8496 = -104461617;
   public int anInt_8497 = -1968331139;
   int anInt_8498 = 2064100643;
   public int anInt_8499 = 100698049;
   byte[] aByteArray_8500;
   public String name = "null";
   int anInt_8502 = 1863594368;
   int anInt_8503 = 0;
   int anInt_8504 = 0;
   public int anInt_8505 = 0;
   public boolean aBoolean_8506 = false;
   byte[] aByteArray_8507;
   public int anInt_8508 = 2081148781;
   public boolean aBoolean_8509 = false;
   public int anInt_8510 = 0;
   int anInt_8511 = -866414603;
   public int textColour;
   NodeArrayList aNodeArrayList_8513;
   static final int anInt_8514 = 5;


   int[] method5462(int[] var1, int var2, int var3) {
      int[] var4 = new int[1152];
      int var5 = 0;

      for(int var6 = 0; var6 < 32; ++var6) {
         for(int var7 = 0; var7 < 36; ++var7) {
            int var8 = var1[var5];
            if(0 == var8) {
               if(var7 > 0 && var1[var5 - 1] != 0) {
                  var8 = var2;
               } else if(var6 > 0 && 0 != var1[var5 - 36]) {
                  var8 = var2;
               } else if(var7 < 35 && 0 != var1[var5 + 1]) {
                  var8 = var2;
               } else if(var6 < 31 && var1[var5 + 36] != 0) {
                  var8 = var2;
               }
            }

            var4[var5++] = var8;
         }
      }

      return var4;
   }

   void load(ByteArrayDataNode var1, int var2) {
      if(1 == var2) {
         this.anInt_8452 = var1.method4493(-157074556) * -1877239407;
      } else if(var2 == 2) {
         this.name = var1.method4485(-636547770);
      } else if(var2 == 4) {
         this.anInt_8461 = var1.readShort(-1064637686) * -335951113;
      } else if(var2 == 5) {
         this.rotation = var1.readShort(1220028916) * -1437008321;
      } else if(6 == var2) {
         this.anInt_8488 = var1.readShort(-177692319) * 129330953;
      } else if(var2 == 7) {
         this.anInt_8447 = var1.readShort(501303122) * -1785149441;
         if(this.anInt_8447 * 1311193087 > 32767) {
            this.anInt_8447 -= -939589632;
         }
      } else if(8 == var2) {
         this.anInt_8453 = var1.readShort(895412993) * 567269975;
         if(742371687 * this.anInt_8453 > 32767) {
            this.anInt_8453 -= -631832576;
         }
      } else if(var2 == 11) {
         this.anInt_8467 = 1826888065;
      } else if(12 == var2) {
         this.anInt_8469 = var1.method4480(1260717178) * 867933117;
      } else if(13 == var2) {
         this.anInt_8475 = var1.readByte(251235669) * -1514134137;
      } else if(var2 == 14) {
         this.anInt_8468 = var1.readByte(36419654) * -849703401;
      } else if(var2 == 16) {
         this.inBank = true;
      } else if(var2 == 18) {
         this.anInt_8508 = var1.readShort(146367554) * -2081148781;
      } else if(23 == var2) {
         this.anInt_8478 = var1.method4493(-157074556) * 261246985;
      } else if(24 == var2) {
         this.anInt_8451 = var1.method4493(-157074556) * -1806924715;
      } else if(25 == var2) {
         this.anInt_8480 = var1.method4493(-157074556) * 1034396743;
      } else if(var2 == 26) {
         this.anInt_8449 = var1.method4493(-157074556) * -1218855073;
      } else if(27 == var2) {
         this.anInt_8477 = var1.readByte(-192573962) * 1604853115;
      } else if(var2 >= 30 && var2 < 35) {
         this.screenOptions[var2 - 30] = var1.method4485(1442305045);
      } else if(var2 >= 35 && var2 < 40) {
         this.invenOptions[var2 - 35] = var1.method4485(-1695815900);
      } else {
         int var4;
         int var5;
         if(var2 == 40) {
            var4 = var1.readByte(1801642408);
            this.aShortArray_8454 = new short[var4];
            this.aShortArray_8455 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray_8454[var5] = (short)var1.readShort(-1154995286);
               this.aShortArray_8455[var5] = (short)var1.readShort(2129633842);
            }
         } else if(var2 == 41) {
            var4 = var1.readByte(8458894);
            this.aShortArray_8457 = new short[var4];
            this.aShortArray_8479 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray_8457[var5] = (short)var1.readShort(579551205);
               this.aShortArray_8479[var5] = (short)var1.readShort(-278788570);
            }
         } else if(42 == var2) {
            var4 = var1.readByte(1399832888);
            this.aByteArray_8456 = new byte[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aByteArray_8456[var5] = var1.getByte((byte)32);
            }
         } else if(var2 == 43) {
            this.textColour = var1.method4480(1260717178) * -934125451;
            this.aBoolean_8509 = true;
         } else {
            int var6;
            int var7;
            byte var9;
            if(44 == var2) {
               var4 = var1.readShort(1786571367);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray_8500 = new byte[var5];
               var9 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray_8500[var7] = var9++;
                  } else {
                     this.aByteArray_8500[var7] = -1;
                  }
               }
            } else if(var2 == 45) {
               var4 = var1.readShort(-130930923);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray_8507 = new byte[var5];
               var9 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray_8507[var7] = var9++;
                  } else {
                     this.aByteArray_8507[var7] = -1;
                  }
               }
            } else if(var2 == 65) {
               this.aBoolean_8506 = true;
            } else if(78 == var2) {
               this.anInt_8460 = var1.method4493(-157074556) * -1826717147;
            } else if(79 == var2) {
               this.anInt_8483 = var1.method4493(-157074556) * -2033256627;
            } else if(var2 == 90) {
               this.anInt_8490 = var1.method4493(-157074556) * -1223198531;
            } else if(91 == var2) {
               this.anInt_8492 = var1.method4493(-157074556) * 1111982851;
            } else if(var2 == 92) {
               this.anInt_8459 = var1.method4493(-157074556) * -1171660017;
            } else if(93 == var2) {
               this.anInt_8493 = var1.method4493(-157074556) * -1080518201;
            } else if(var2 == 94) {
               this.anInt_8466 = var1.readShort(-62490812) * -768959407;
            } else if(95 == var2) {
               this.anInt_8464 = var1.readShort(-93870318) * -1552897875;
            } else if(96 == var2) {
               this.anInt_8476 = var1.readByte(1340655611) * 1129968749;
            } else if(var2 == 97) {
               this.anInt_8496 = var1.readShort(1313882991) * 104461617;
            } else if(98 == var2) {
               this.anInt_8497 = var1.readShort(733861240) * 1968331139;
            } else if(var2 >= 100 && var2 < 110) {
               if(null == this.anIntArray_8494) {
                  this.anIntArray_8494 = new int[10];
                  this.anIntArray_8495 = new int[10];
               }

               this.anIntArray_8494[var2 - 100] = var1.readShort(-17014050);
               this.anIntArray_8495[var2 - 100] = var1.readShort(1162449042);
            } else if(110 == var2) {
               this.anInt_8473 = var1.readShort(1270615990) * 1568882779;
            } else if(111 == var2) {
               this.anInt_8445 = var1.readShort(1820586550) * 21244033;
            } else if(112 == var2) {
               this.anInt_8502 = var1.readShort(90527138) * -1596053405;
            } else if(var2 == 113) {
               this.anInt_8503 = var1.getByte((byte)36) * -1753230953;
            } else if(114 == var2) {
               this.anInt_8504 = var1.getByte((byte)55) * 2020702133;
            } else if(115 == var2) {
               this.anInt_8505 = var1.readByte(1539202666) * -353163225;
            } else if(var2 == 121) {
               this.anInt_8498 = var1.readShort(502647339) * -2064100643;
            } else if(var2 == 122) {
               this.anInt_8499 = var1.readShort(971758779) * -100698049;
            } else if(125 == var2) {
               this.anInt_8484 = (var1.getByte((byte)39) << 2) * -1759045323;
               this.anInt_8486 = (var1.getByte((byte)14) << 2) * -144381133;
               this.anInt_8482 = (var1.getByte((byte)98) << 2) * 1626546213;
            } else if(126 == var2) {
               this.anInt_8485 = (var1.getByte((byte)58) << 2) * 844693119;
               this.anInt_8487 = (var1.getByte((byte)51) << 2) * -478226555;
               this.anInt_8489 = (var1.getByte((byte)58) << 2) * -919494687;
            } else if(127 != var2 && var2 != 128 && 129 != var2 && var2 != 130) {
               if(132 == var2) {
                  var4 = var1.readByte(-45990698);
                  this.anIntArray_8481 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.anIntArray_8481[var5] = var1.readShort(623212625);
                  }
               } else if(var2 == 134) {
                  this.anInt_8510 = var1.readByte(766911516) * 1561381605;
               } else if(var2 == 139) {
                  this.anInt_8511 = var1.readShort(1533857526) * 866414603;
               } else if(var2 == 140) {
                  this.anInt_8463 = var1.readShort(-557478097) * -1598789731;
               } else if(var2 >= 142 && var2 < 147) {
                  if(this.anIntArray_8444 == null) {
                     this.anIntArray_8444 = new int[6];
                     Arrays.fill(this.anIntArray_8444, -1);
                  }

                  this.anIntArray_8444[var2 - 142] = var1.readShort(85151084);
               } else if(var2 >= 150 && var2 < 155) {
                  if(this.anIntArray_8474 == null) {
                     this.anIntArray_8474 = new int[5];
                     Arrays.fill(this.anIntArray_8474, -1);
                  }

                  this.anIntArray_8474[var2 - 150] = var1.readShort(532077528);
               } else if(156 != var2 && 249 == var2) {
                  var4 = var1.readByte(499626810);
                  if(null == this.aNodeArrayList_8513) {
                     var5 = Class105.method1359(var4, (byte)124);
                     this.aNodeArrayList_8513 = new NodeArrayList(var5);
                  }

                  for(var5 = 0; var5 < var4; ++var5) {
                     boolean var10 = var1.readByte(-374034097) == 1;
                     var7 = var1.method4479(738776218);
                     Object var8;
                     if(var10) {
                        var8 = new Class240_Sub9(var1.method4485(1631788937));
                     } else {
                        var8 = new IndexNode(var1.method4480(1260717178));
                     }

                     this.aNodeArrayList_8513.insert((NodeListNode)var8, (long)var7);
                  }
               }
            } else {
               var1.readByte(-1048815606);
               var1.readShort(226614149);
            }
         }
      }

   }

   public String method5464(int var1, String var2, int var3) {
      if(null == this.aNodeArrayList_8513) {
         return var2;
      } else {
         Class240_Sub9 var4 = (Class240_Sub9)this.aNodeArrayList_8513.getNode((long)var1);
         return var4 == null?var2:(String)var4.anObject_6783;
      }
   }

   void method5465(ObjectDescriptor var1, ObjectDescriptor var2, int var3) {
      this.method5481(var1, var2, (ServerString)null, (byte)1);
   }

   void method5466(ObjectDescriptor var1, ObjectDescriptor var2, int var3) {
      this.method5481(var1, var2, ServerString.aClass482_8887, (byte)1);
   }

   void method5467(int var1) {}

   public final Model method5468(Renderer var1, int var2, int var3, PlayerComposite var4, Animator var5, int var6, int var7, int var8, int var9, int var10) {
      int var11;
      if(this.anIntArray_8494 != null && var3 > 1) {
         var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if(var3 >= this.anIntArray_8495[var12] && 0 != this.anIntArray_8495[var12]) {
               var11 = this.anIntArray_8494[var12];
            }
         }

         if(var11 != -1) {
            return this.cacheObjectLoader.getObjectDescriptor(var11).method5468(var1, var2, 1, var4, var5, var6, var7, var8, var9, 1945637806);
         }
      }

      var11 = var2;
      if(var5 != null) {
         var11 = var2 | var5.getFlags((short)-20360);
      }

      CacheNodeArrayList var13 = this.cacheObjectLoader.aClass627_8593;
      Model var20;
      synchronized(this.cacheObjectLoader.aClass627_8593) {
         var20 = (Model)this.cacheObjectLoader.aClass627_8593.getObject((long)(this.id * 1791433095 | var1.rendererID * -1555911463 << 29));
      }

      if(null == var20 || var1.method1940(var20.method2015(), var11) != 0) {
         if(null != var20) {
            var11 = var1.method1941(var11, var20.method2015());
         }

         int var21 = var11;
         if(null != this.aShortArray_8457) {
            var21 = var11 | '\u8000';
         }

         if(this.aShortArray_8454 != null || null != var4) {
            var21 |= 16384;
         }

         if(128 != -1480069165 * this.anInt_8473) {
            var21 |= 1;
         }

         if(128 != 453252993 * this.anInt_8445) {
            var21 |= 2;
         }

         if(128 != this.anInt_8502 * 827169099) {
            var21 |= 4;
         }

         ModelData var14 = ModelData.createModelUnpacker(this.cacheObjectLoader.groundObjectCache, this.anInt_8452 * 731531121, 0);
         if(null == var14) {
            return null;
         }

         if(var14.anInt_1848 < 13) {
            var14.method1229(2);
         }

         var20 = var1.createModel(var14, var21, this.cacheObjectLoader.anInt_8597 * -202990569, 64 + -286278105 * this.anInt_8503, 850 + this.anInt_8504 * -337053423);
         if(-1480069165 * this.anInt_8473 != 128 || 128 != 453252993 * this.anInt_8445 || 128 != this.anInt_8502 * 827169099) {
            var20.method2012(this.anInt_8473 * -1480069165, 453252993 * this.anInt_8445, this.anInt_8502 * 827169099);
         }

         int var15;
         if(this.aShortArray_8454 != null) {
            for(var15 = 0; var15 < this.aShortArray_8454.length; ++var15) {
               if(this.aByteArray_8456 != null && var15 < this.aByteArray_8456.length) {
                  var20.method2030(this.aShortArray_8454[var15], aShortArray_8448[this.aByteArray_8456[var15] & 255]);
               } else {
                  var20.method2030(this.aShortArray_8454[var15], this.aShortArray_8455[var15]);
               }
            }
         }

         if(this.aShortArray_8457 != null) {
            for(var15 = 0; var15 < this.aShortArray_8457.length; ++var15) {
               var20.method2035(this.aShortArray_8457[var15], this.aShortArray_8479[var15]);
            }
         }

         if(var4 != null) {
            for(var15 = 0; var15 < 10; ++var15) {
               for(int var16 = 0; var16 < PlayerComposite.aShortArrayArray_9853[var15].length; ++var16) {
                  if(var4.anIntArray_9848[var15] < PlayerComposite.aShortArrayArrayArray_9854[var15][var16].length) {
                     var20.method2030(PlayerComposite.aShortArrayArray_9853[var15][var16], PlayerComposite.aShortArrayArrayArray_9854[var15][var16][var4.anIntArray_9848[var15]]);
                  }
               }
            }
         }

         var20.method2042(var11);
         CacheNodeArrayList var22 = this.cacheObjectLoader.aClass627_8593;
         synchronized(this.cacheObjectLoader.aClass627_8593) {
            this.cacheObjectLoader.aClass627_8593.insert(var20, (long)(this.id * 1791433095 | var1.rendererID * -1555911463 << 29));
         }
      }

      if(var5 != null || 0 != var9) {
         var20 = var20.copy((byte)1, var11, true);
         if(null != var5) {
            var5.applyToModel(var20, 0, -1665856599);
         }

         if(0 != var9) {
            var20.method2049(var6, var7, var8, var9);
         }
      }

      var20.method2042(var2);
      return var20;
   }

   public ObjectDescriptor method5469(int var1, int var2) {
      if(this.anIntArray_8494 != null && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if(var1 >= this.anIntArray_8495[var4] && this.anIntArray_8495[var4] != 0) {
               var3 = this.anIntArray_8494[var4];
            }
         }

         if(var3 != -1) {
            return this.cacheObjectLoader.getObjectDescriptor(var3);
         }
      }

      return this;
   }

   int[] method5470(Renderer var1, Renderer var2, int amount, int var4, int var5, boolean var6, int var7, FontRenderer var8, PlayerComposite var9, int var10) {
      ModelData var11 = ModelData.createModelUnpacker(this.cacheObjectLoader.groundObjectCache, 731531121 * this.anInt_8452, 0);
      if(var11 == null) {
         return null;
      } else {
         if(var11.anInt_1848 < 13) {
            var11.method1229(2);
         }

         int var12;
         if(null != this.aShortArray_8454) {
            for(var12 = 0; var12 < this.aShortArray_8454.length; ++var12) {
               if(null != this.aByteArray_8456 && var12 < this.aByteArray_8456.length) {
                  var11.method1226(this.aShortArray_8454[var12], aShortArray_8448[this.aByteArray_8456[var12] & 255]);
               } else {
                  var11.method1226(this.aShortArray_8454[var12], this.aShortArray_8455[var12]);
               }
            }
         }

         if(null != this.aShortArray_8457) {
            for(var12 = 0; var12 < this.aShortArray_8457.length; ++var12) {
               var11.method1217(this.aShortArray_8457[var12], this.aShortArray_8479[var12]);
            }
         }

         if(var9 != null) {
            for(var12 = 0; var12 < 10; ++var12) {
               for(int var13 = 0; var13 < PlayerComposite.aShortArrayArray_9853[var12].length; ++var13) {
                  if(var9.anIntArray_9848[var12] < PlayerComposite.aShortArrayArrayArray_9854[var12][var13].length) {
                     var11.method1226(PlayerComposite.aShortArrayArray_9853[var12][var13], PlayerComposite.aShortArrayArrayArray_9854[var12][var13][var9.anIntArray_9848[var12]]);
                  }
               }
            }
         }

         var12 = 2048;
         boolean var23 = false;
         if(128 != this.anInt_8473 * -1480069165 || 453252993 * this.anInt_8445 != 128 || 128 != 827169099 * this.anInt_8502) {
            var23 = true;
            var12 |= 7;
         }

         Model var14 = var1.createModel(var11, var12, 64, 64 + -286278105 * this.anInt_8503, 768 + this.anInt_8504 * -337053423);
         if(!var14.method2066()) {
            return null;
         } else {
            if(var23) {
               var14.method2012(this.anInt_8473 * -1480069165, this.anInt_8445 * 453252993, 827169099 * this.anInt_8502);
            }

            Sprite invSprite = null;
            if(-1 != this.anInt_8497 * 953318699) {
               invSprite = this.cacheObjectLoader.getInvSprite(var1, var2, -1561115695 * this.anInt_8496, 10, 1, 0, true, true, 0, var8, var9, -682597315);
               if(null == invSprite) {
                  return null;
               }
            } else if(-427788353 * this.anInt_8499 != -1) {
               invSprite = this.cacheObjectLoader.getInvSprite(var1, var2, 1479415157 * this.anInt_8498, amount, var4, var5, false, true, 0, var8, var9, -1802492878);
               if(null == invSprite) {
                  return null;
               }
            } else if(-1 != -722184523 * this.anInt_8463) {
               invSprite = this.cacheObjectLoader.getInvSprite(var1, var2, 656579491 * this.anInt_8511, amount, var4, var5, false, true, 0, var8, var9, -1991489885);
               if(null == invSprite) {
                  return null;
               }
            }

            int var16;
            if(var6) {
               var16 = (int)((double)(this.anInt_8461 * 657331911) * 1.5D) << 2;
            } else if(var4 == 2) {
               var16 = (int)((double)(this.anInt_8461 * 657331911) * 1.04D) << 2;
            } else {
               var16 = this.anInt_8461 * 657331911 << 2;
            }

            ArrayViewport var17 = var1.method1984();
            ArrayViewport var18 = var1.method1936();
            var18.method4563(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float)var1.method1896(-1516162444).method2194(), (float)var1.method1896(-1218517614).method2198());
            var1.method1946(var18);
            var1.method1909(0, 0, var1.method1896(-1471895786).method2194(), var1.method1896(-546336839).method2198());
            Viewport var19 = new Viewport();
            var1.setViewport(var19);
            var1.method1947(0.95F + (float)(Math.random() / 10.0D));
            var1.method1945(16777215, 0.95F + (float)(Math.random() / 10.0D), 0.95F + (float)(Math.random() / 10.0D), -50.0F, -10.0F, -50.0F);
            Viewport var20 = var1.method1979();
            var20.rotate(0.0F, 0.0F, 1.0F, Class362.toRadians(-(1433336613 * this.anInt_8464) << 3));
            var20.method4630(0.0F, 1.0F, 0.0F, Class362.toRadians(-1211969735 * this.anInt_8488 << 3));
            var20.setOffset((float)(this.anInt_8447 * 1311193087 << 2), (float)((var16 * Class362.cosArray[1098903999 * this.rotation << 3] >> 14) - var14.method2041() / 2 + (742371687 * this.anInt_8453 << 2)), (float)((742371687 * this.anInt_8453 << 2) + (Class362.sinArray[1098903999 * this.rotation << 3] * var16 >> 14)));
            var20.method4630(1.0F, 0.0F, 0.0F, Class362.toRadians(1098903999 * this.rotation << 3));
            var1.method1965(0, 0, 36, 32);
            var1.method1977(2, 0);
            var1.drawOutline(0, 0, 36, 32, 0, 0);
            var1.method1949(0, -1, 0);
            var14.method2069(var20, (Class92)null, 1);
            var1.method1946(var17);
            int[] var21 = var1.method1906(0, 0, 36, 32);
            if(var4 >= 1) {
               var21 = this.method5462(var21, -16777214, 2025172711);
               if(var4 >= 2) {
                  var21 = this.method5462(var21, -1, 2025172711);
               }
            }

            if(var5 != 0) {
               this.method5472(var21, var5, 516678811);
            }

            if(this.anInt_8499 * -427788353 != -1) {
               invSprite.drawAt(0, 0);
            } else if(-1 != -722184523 * this.anInt_8463) {
               invSprite.drawAt(0, 0);
            }

            var1.defineSprite(var21, 0, 36, 36, 32).drawAt(0, 0);
            if(-1 != 953318699 * this.anInt_8497) {
               invSprite.drawAt(0, 0);
            }

            if(var7 == 1 || 2 == var7 && (1279665793 * this.anInt_8467 == 1 || amount != 1) && amount != -1) {
               var8.renderText(Class53.getMoneyString(amount, this.cacheObjectLoader.languagePack, 1846301049), 0, 9, -256, -16777215, -1191956119);
            }

            var21 = var1.method1906(0, 0, 36, 32);

            for(int var22 = 0; var22 < var21.length; ++var22) {
               if((var21[var22] & 16777215) == 0) {
                  var21[var22] = 0;
               } else {
                  var21[var22] |= -16777216;
               }
            }

            return var21;
         }
      }
   }

   public int method5471(int var1, byte var2) {
      return this.anIntArray_8474 == null?-1:this.anIntArray_8474[var1];
   }

   void method5472(int[] var1, int var2, int var3) {
      for(int var4 = 31; var4 > 0; --var4) {
         int var5 = 36 * var4;

         for(int var6 = 35; var6 > 0; --var6) {
            if(0 == var1[var6 + var5] && var1[var5 + var6 - 1 - 36] != 0) {
               var1[var5 + var6] = var2;
            }
         }
      }

   }

   public final ModelData method5473(boolean var1, Class459 var2, int var3) {
      int var4;
      int var5;
      int var6;
      if(var1) {
         if(var2 != null && var2.anIntArray_8581 != null) {
            var4 = var2.anIntArray_8581[0];
            var5 = var2.anIntArray_8581[1];
            var6 = var2.anIntArray_8581[2];
         } else {
            var4 = this.anInt_8480 * 421053815;
            var5 = this.anInt_8449 * -1090233185;
            var6 = 102701445 * this.anInt_8483;
         }
      } else if(var2 != null && var2.anIntArray_8584 != null) {
         var4 = var2.anIntArray_8584[0];
         var5 = var2.anIntArray_8584[1];
         var6 = var2.anIntArray_8584[2];
      } else {
         var4 = -12960199 * this.anInt_8478;
         var5 = -615229187 * this.anInt_8451;
         var6 = this.anInt_8460 * 1299696045;
      }

      if(var4 == -1) {
         return null;
      } else {
         ModelData var7 = ModelData.createModelUnpacker(this.cacheObjectLoader.groundObjectCache, var4, 0);
         if(null == var7) {
            return null;
         } else {
            if(var7.anInt_1848 < 13) {
               var7.method1229(2);
            }

            if(var5 != -1) {
               ModelData var8 = ModelData.createModelUnpacker(this.cacheObjectLoader.groundObjectCache, var5, 0);
               if(var8.anInt_1848 < 13) {
                  var8.method1229(2);
               }

               if(-1 != var6) {
                  ModelData var9 = ModelData.createModelUnpacker(this.cacheObjectLoader.groundObjectCache, var6, 0);
                  if(var9.anInt_1848 < 13) {
                     var9.method1229(2);
                  }

                  ModelData[] var10 = new ModelData[]{var7, var8, var9};
                  var7 = new ModelData(var10, 3);
               } else {
                  ModelData[] var12 = new ModelData[]{var7, var8};
                  var7 = new ModelData(var12, 2);
               }
            }

            if(!var1 && (0 != -123522787 * this.anInt_8484 || 0 != this.anInt_8486 * -1813706757 || 1942223789 * this.anInt_8482 != 0)) {
               var7.offset(this.anInt_8484 * -123522787, this.anInt_8486 * -1813706757, this.anInt_8482 * 1942223789);
            }

            if(var1 && (this.anInt_8485 * 201638271 != 0 || 0 != this.anInt_8487 * 2137491789 || 0 != this.anInt_8489 * -1124670431)) {
               var7.offset(this.anInt_8485 * 201638271, 2137491789 * this.anInt_8487, -1124670431 * this.anInt_8489);
            }

            short[] var11;
            int var13;
            if(this.aShortArray_8454 != null) {
               if(var2 != null && null != var2.aShortArray_8578) {
                  var11 = var2.aShortArray_8578;
               } else {
                  var11 = this.aShortArray_8455;
               }

               for(var13 = 0; var13 < this.aShortArray_8454.length; ++var13) {
                  var7.method1226(this.aShortArray_8454[var13], var11[var13]);
               }
            }

            if(null != this.aShortArray_8457) {
               if(null != var2 && null != var2.aShortArray_8576) {
                  var11 = var2.aShortArray_8576;
               } else {
                  var11 = this.aShortArray_8479;
               }

               for(var13 = 0; var13 < this.aShortArray_8457.length; ++var13) {
                  var7.method1217(this.aShortArray_8457[var13], var11[var13]);
               }
            }

            return var7;
         }
      }
   }

   public final boolean method5474(boolean var1, Class459 var2, byte var3) {
      int var4;
      int var5;
      if(var1) {
         if(var2 != null && var2.anIntArray_8583 != null) {
            var4 = var2.anIntArray_8583[0];
            var5 = var2.anIntArray_8583[1];
         } else {
            var4 = 733970347 * this.anInt_8492;
            var5 = -730376201 * this.anInt_8493;
         }
      } else if(null != var2 && null != var2.anIntArray_8582) {
         var4 = var2.anIntArray_8582[0];
         var5 = var2.anIntArray_8582[1];
      } else {
         var4 = 359547541 * this.anInt_8490;
         var5 = this.anInt_8459 * 1009167343;
      }

      if(-1 == var4) {
         return true;
      } else {
         boolean var6 = true;
         if(!this.cacheObjectLoader.groundObjectCache.method3568(var4, 0, 771252345)) {
            var6 = false;
         }

         if(-1 != var5 && !this.cacheObjectLoader.groundObjectCache.method3568(var5, 0, -2105142866)) {
            var6 = false;
         }

         return var6;
      }
   }

   void load(ByteArrayDataNode var1) {
      while(true) {
         int var3 = var1.readByte(260696715);
         if(0 == var3) {
            return;
         }

         this.load(var1, var3);
      }
   }

   public int method5476(int var1, int var2, byte var3) {
      if(this.aNodeArrayList_8513 == null) {
         return var2;
      } else {
         IndexNode var4 = (IndexNode)this.aNodeArrayList_8513.getNode((long)var1);
         return var4 == null?var2:523939595 * var4.cacheID;
      }
   }

   public int method5477(int var1, int var2) {
      return this.anIntArray_8444 == null?-1:this.anIntArray_8444[var1];
   }

   public final ModelData getModelData(boolean var1, Class459 var2, byte var3) {
      int var4;
      int var5;
      if(var1) {
         if(var2 != null && null != var2.anIntArray_8583) {
            var4 = var2.anIntArray_8583[0];
            var5 = var2.anIntArray_8583[1];
         } else {
            var4 = 733970347 * this.anInt_8492;
            var5 = this.anInt_8493 * -730376201;
         }
      } else if(null != var2 && null != var2.anIntArray_8582) {
         var4 = var2.anIntArray_8582[0];
         var5 = var2.anIntArray_8582[1];
      } else {
         var4 = this.anInt_8490 * 359547541;
         var5 = this.anInt_8459 * 1009167343;
      }

      if(var4 == -1) {
         return null;
      } else {
         ModelData var6 = ModelData.createModelUnpacker(this.cacheObjectLoader.groundObjectCache, var4, 0);
         if(var6.anInt_1848 < 13) {
            var6.method1229(2);
         }

         if(var5 != -1) {
            ModelData var7 = ModelData.createModelUnpacker(this.cacheObjectLoader.groundObjectCache, var5, 0);
            if(var7.anInt_1848 < 13) {
               var7.method1229(2);
            }

            ModelData[] var8 = new ModelData[]{var6, var7};
            var6 = new ModelData(var8, 2);
         }

         short[] var9;
         int var10;
         if(this.aShortArray_8454 != null) {
            if(null != var2 && null != var2.aShortArray_8578) {
               var9 = var2.aShortArray_8578;
            } else {
               var9 = this.aShortArray_8455;
            }

            for(var10 = 0; var10 < this.aShortArray_8454.length; ++var10) {
               var6.method1226(this.aShortArray_8454[var10], var9[var10]);
            }
         }

         if(this.aShortArray_8457 != null) {
            if(var2 != null && null != var2.aShortArray_8576) {
               var9 = var2.aShortArray_8576;
            } else {
               var9 = this.aShortArray_8479;
            }

            for(var10 = 0; var10 < this.aShortArray_8457.length; ++var10) {
               var6.method1217(this.aShortArray_8457[var10], var9[var10]);
            }
         }

         return var6;
      }
   }

   void method5479(ObjectDescriptor var1, ObjectDescriptor var2, int var3) {
      this.method5481(var1, var2, ServerString.discardStr, (byte)1);
   }

   public final boolean method5480(boolean var1, Class459 var2, int var3) {
      int var4;
      int var5;
      int var6;
      if(var1) {
         if(null != var2 && null != var2.anIntArray_8581) {
            var4 = var2.anIntArray_8581[0];
            var5 = var2.anIntArray_8581[1];
            var6 = var2.anIntArray_8581[2];
         } else {
            var4 = 421053815 * this.anInt_8480;
            var5 = -1090233185 * this.anInt_8449;
            var6 = this.anInt_8483 * 102701445;
         }
      } else if(null != var2 && null != var2.anIntArray_8584) {
         var4 = var2.anIntArray_8584[0];
         var5 = var2.anIntArray_8584[1];
         var6 = var2.anIntArray_8584[2];
      } else {
         var4 = -12960199 * this.anInt_8478;
         var5 = this.anInt_8451 * -615229187;
         var6 = 1299696045 * this.anInt_8460;
      }

      if(var4 == -1) {
         return true;
      } else {
         boolean var7 = true;
         if(!this.cacheObjectLoader.groundObjectCache.method3568(var4, 0, -1543243530)) {
            var7 = false;
         }

         if(-1 != var5 && !this.cacheObjectLoader.groundObjectCache.method3568(var5, 0, -1922706244)) {
            var7 = false;
         }

         if(-1 != var6 && !this.cacheObjectLoader.groundObjectCache.method3568(var6, 0, -268259897)) {
            var7 = false;
         }

         return var7;
      }
   }

   void method5481(ObjectDescriptor var1, ObjectDescriptor var2, ServerString var3, byte var4) {
      this.anInt_8452 = var1.anInt_8452 * 1;
      this.anInt_8461 = 1 * var1.anInt_8461;
      this.rotation = 1 * var1.rotation;
      this.anInt_8488 = 1 * var1.anInt_8488;
      this.anInt_8464 = 1 * var1.anInt_8464;
      this.anInt_8447 = 1 * var1.anInt_8447;
      this.anInt_8453 = 1 * var1.anInt_8453;
      boolean var5 = null == var3;
      ObjectDescriptor var6 = var5?var1:var2;
      this.aShortArray_8454 = var6.aShortArray_8454;
      this.aShortArray_8455 = var6.aShortArray_8455;
      this.aByteArray_8456 = var6.aByteArray_8456;
      this.aShortArray_8457 = var6.aShortArray_8457;
      this.aShortArray_8479 = var6.aShortArray_8479;
      this.name = var2.name;
      this.inBank = var2.inBank;
      if(var5) {
         this.anInt_8469 = var2.anInt_8469 * 1;
         this.anInt_8467 = 1826888065;
      } else {
         this.anInt_8469 = 0;
         this.anInt_8467 = 1 * var2.anInt_8467;
         this.anInt_8475 = var2.anInt_8475 * 1;
         this.anInt_8468 = 1 * var2.anInt_8468;
         this.anInt_8477 = 1 * var2.anInt_8477;
         this.anInt_8478 = 1 * var2.anInt_8478;
         this.anInt_8451 = var2.anInt_8451 * 1;
         this.anInt_8460 = var2.anInt_8460 * 1;
         this.anInt_8480 = 1 * var2.anInt_8480;
         this.anInt_8449 = 1 * var2.anInt_8449;
         this.anInt_8483 = var2.anInt_8483 * 1;
         this.anInt_8484 = 1 * var2.anInt_8484;
         this.anInt_8485 = 1 * var2.anInt_8485;
         this.anInt_8486 = var2.anInt_8486 * 1;
         this.anInt_8487 = var2.anInt_8487 * 1;
         this.anInt_8482 = 1 * var2.anInt_8482;
         this.anInt_8489 = 1 * var2.anInt_8489;
         this.anInt_8490 = 1 * var2.anInt_8490;
         this.anInt_8459 = var2.anInt_8459 * 1;
         this.anInt_8492 = var2.anInt_8492 * 1;
         this.anInt_8493 = var2.anInt_8493 * 1;
         this.anInt_8466 = var2.anInt_8466 * 1;
         this.anInt_8505 = var2.anInt_8505 * 1;
         this.screenOptions = var2.screenOptions;
         this.aNodeArrayList_8513 = var2.aNodeArrayList_8513;
         this.invenOptions = new String[5];
         if(var2.invenOptions != null) {
            for(int var7 = 0; var7 < 4; ++var7) {
               this.invenOptions[var7] = var2.invenOptions[var7];
            }
         }

         this.invenOptions[4] = var3.getText(this.cacheObjectLoader.languagePack, 1757645230);
      }
   }

   static final void method5482(RSInterfaceData var0, short var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class9.method53(var3, var4, var0, (byte)-120);
   }
}
