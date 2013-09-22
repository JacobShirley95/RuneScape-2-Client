import java.util.Iterator;

public class Class263 {

   public int anInt_4553 = -1334107885;
   public int anInt_4554 = -1722655525;
   public int[] anIntArray_4555 = null;
   public int[] anIntArray_4556 = null;
   int anInt_4557 = 0;
   public int anInt_4558 = -622045389;
   public int anInt_4559 = 0;
   public int anInt_4560 = 11685267;
   public int anInt_4561 = 619711787;
   public int anInt_4562 = -1497428509;
   public int anInt_4563 = 730899259;
   public int anInt_4564 = -836673591;
   public boolean aBoolean_4565 = true;
   public int anInt_4566 = 0;
   public int anInt_4567 = 1072796781;
   public int anInt_4568 = 1144120499;
   public int anInt_4569 = 1213059637;
   public int anInt_4570 = -1123118573;
   public int anInt_4571 = 876652741;
   public int anInt_4572 = 0;
   public int anInt_4573 = -648438397;
   Class255 aClass255_4574;
   public int anInt_4575 = 1561925111;
   public int anInt_4576 = -478622883;
   public int anInt_4577 = 1683584537;
   public int anInt_4578 = 0;
   public int anInt_4579 = 0;
   public int anInt_4580 = -2066682811;
   public int anInt_4581 = -1601160075;
   public int[][] viewportData;
   public int[][] anIntArrayArray_4583;
   public int anInt_4584 = -833258727;
   public int[] anIntArray_4585;
   public int[] anIntArray_4586;
   public int anInt_4587 = 0;
   public int anInt_4588 = 0;
   public int anInt_4589 = 0;
   public int anInt_4590 = 0;
   public int anInt_4591 = 0;
   public int anInt_4592 = 0;
   public int anInt_4593 = -409865529;
   public int anInt_4594 = 0;
   public int anInt_4595 = -2047277689;
   public int anInt_4596 = 1706205321;
   Viewport[] aViewportArray_4597;


   void method3500(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(613988563);
         if(var3 == 0) {
            return;
         }

         this.method3505(var1, var3, (byte)1);
      }
   }

   public int[] method3501(int var1) {
      NodeArrayList var2 = new NodeArrayList(16);
      Class224.method2832(this.anInt_4570 * 2042492901, var2, 1232390481);
      int[] var3;
      int var4;
      if(this.anIntArray_4555 != null) {
         var3 = this.anIntArray_4555;

         for(var4 = 0; var4 < var3.length; ++var4) {
            int var5 = var3[var4];
            Class224.method2832(var5, var2, -1167047476);
         }
      }

      Class224.method2832(31753221 * this.anInt_4558, var2, 1247196505);
      Class224.method2832(772391085 * this.anInt_4554, var2, 1054313152);
      Class224.method2832(-1500371099 * this.anInt_4560, var2, 1646338664);
      Class224.method2832(2124311195 * this.anInt_4567, var2, 6686085);
      Class224.method2832(-94412747 * this.anInt_4562, var2, -614796451);
      Class224.method2832(this.anInt_4584 * -892055849, var2, -132359485);
      Class224.method2832(-424471161 * this.anInt_4564, var2, -559038676);
      Class224.method2832(this.anInt_4576 * -1174724853, var2, -841111359);
      Class224.method2832(1034825445 * this.anInt_4553, var2, 1902346205);
      Class224.method2832(-1278757251 * this.anInt_4561, var2, -177772871);
      Class224.method2832(this.anInt_4568 * 69768581, var2, 563321237);
      Class224.method2832(9421325 * this.anInt_4563, var2, 1813275690);
      Class224.method2832(613044169 * this.anInt_4595, var2, 1400844882);
      Class224.method2832(this.anInt_4569 * 1655148515, var2, 1953692934);
      Class224.method2832(this.anInt_4571 * -868521485, var2, 1339911836);
      Class224.method2832(this.anInt_4573 * -705714475, var2, 1113789996);
      Class224.method2832(this.anInt_4580 * -934758029, var2, -934301530);
      Class224.method2832(703579193 * this.anInt_4575, var2, 781540505);
      Class224.method2832(-899593181 * this.anInt_4581, var2, 1514706518);
      Class224.method2832(971798999 * this.anInt_4577, var2, -509767337);
      var3 = new int[var2.size()];
      var4 = 0;

      NodeListNode var6;
      for(Iterator var7 = var2.iterator(); var7.hasNext(); var3[var4++] = (int)(4058728944299054175L * var6.id)) {
         var6 = (NodeListNode)var7.next();
      }

      return var3;
   }

   public int method3502(byte var1) {
      if(2042492901 * this.anInt_4570 != -1) {
         return 2042492901 * this.anInt_4570;
      } else if(null == this.anIntArray_4555) {
         return -1;
      } else {
         int var2 = (int)(Math.random() * (double)(this.anInt_4557 * 110471103));

         int var3;
         for(var3 = 0; var2 >= this.anIntArray_4556[var3]; ++var3) {
            var2 -= this.anIntArray_4556[var3];
         }

         return this.anIntArray_4555[var3];
      }
   }

   public boolean method3503(int var1, int var2) {
      if(-1 == var1) {
         return false;
      } else if(var1 == 2042492901 * this.anInt_4570) {
         return true;
      } else {
         if(this.anIntArray_4555 != null) {
            for(int var3 = 0; var3 < this.anIntArray_4555.length; ++var3) {
               if(var1 == this.anIntArray_4555[var3]) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public Viewport[] genViewports(byte var1) {
      if(this.aViewportArray_4597 != null) {
         return this.aViewportArray_4597;
      } else if(null == this.viewportData) {
         return null;
      } else {
         this.aViewportArray_4597 = new Viewport[this.viewportData.length];

         for(int var2 = 0; var2 < this.viewportData.length; ++var2) {
            int xOff = 0;
            int yOff = 0;
            int zOff = 0;
            int xRotation = 0;
            int yRotation = 0;
            int zRotation = 0;
            if(this.viewportData[var2] != null) {
               xOff = this.viewportData[var2][0];
               yOff = this.viewportData[var2][1];
               zOff = this.viewportData[var2][2];
               xRotation = this.viewportData[var2][3] << 3;
               yRotation = this.viewportData[var2][4] << 3;
               zRotation = this.viewportData[var2][5] << 3;
            }

            if(0 != xOff || 0 != yOff || zOff != 0 || xRotation != 0 || yRotation != 0 || zRotation != 0) {
               Viewport viewport = this.aViewportArray_4597[var2] = new Viewport();
               if(0 != zRotation) {
                  viewport.method4630(0.0F, 0.0F, 1.0F, Class362.toRadians(zRotation));
               }

               if(xRotation != 0) {
                  viewport.method4630(1.0F, 0.0F, 0.0F, Class362.toRadians(xRotation));
               }

               if(yRotation != 0) {
                  viewport.method4630(0.0F, 1.0F, 0.0F, Class362.toRadians(yRotation));
               }

               viewport.setOffset((float)xOff, (float)yOff, (float)zOff);
            }
         }

         return this.aViewportArray_4597;
      }
   }

   void method3505(ByteArrayDataNode var1, int var2, byte var3) {
      if(var2 == 1) {
         this.anInt_4570 = var1.method4493(-157074556) * 1123118573;
         this.anInt_4560 = var1.method4493(-157074556) * -11685267;
      } else if(2 == var2) {
         this.anInt_4568 = var1.method4493(-157074556) * -1144120499;
      } else if(3 == var2) {
         this.anInt_4563 = var1.method4493(-157074556) * -730899259;
      } else if(4 == var2) {
         this.anInt_4595 = var1.method4493(-157074556) * 2047277689;
      } else if(var2 == 5) {
         this.anInt_4569 = var1.method4493(-157074556) * -1213059637;
      } else if(var2 == 6) {
         this.anInt_4564 = var1.method4493(-157074556) * 836673591;
      } else if(var2 == 7) {
         this.anInt_4576 = var1.method4493(-157074556) * 478622883;
      } else if(var2 == 8) {
         this.anInt_4553 = var1.method4493(-157074556) * 1334107885;
      } else if(var2 == 9) {
         this.anInt_4561 = var1.method4493(-157074556) * -619711787;
      } else if(var2 == 26) {
         this.anInt_4578 = (short)(var1.readByte(1780763697) * 4) * -1625787921;
         this.anInt_4579 = (short)(var1.readByte(-369487595) * 4) * -19736655;
      } else {
         int var4;
         int var5;
         if(27 == var2) {
            if(this.viewportData == null) {
               this.viewportData = new int[this.aClass255_4574.aClass592_4407.anIntArray_9802.length][];
            }

            var4 = var1.readByte(1518521444);
            this.viewportData[var4] = new int[6];

            for(var5 = 0; var5 < 6; ++var5) {
               this.viewportData[var4][var5] = var1.method4478((byte)1);
            }
         } else if(28 == var2) {
            var4 = var1.readByte(500589766);
            this.anIntArray_4586 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_4586[var5] = var1.readByte(-221001980);
               if(this.anIntArray_4586[var5] == 255) {
                  this.anIntArray_4586[var5] = -1;
               }
            }
         } else if(var2 == 29) {
            this.anInt_4587 = var1.readByte(1675972807) * 663165211;
         } else if(30 == var2) {
            this.anInt_4588 = var1.readShort(1516644931) * 548387663;
         } else if(31 == var2) {
            this.anInt_4589 = var1.readByte(-942239326) * 501617315;
         } else if(var2 == 32) {
            this.anInt_4590 = var1.readShort(255511114) * 766778777;
         } else if(var2 == 33) {
            this.anInt_4591 = var1.method4478((byte)1) * -762241403;
         } else if(var2 == 34) {
            this.anInt_4592 = var1.readByte(1581096239) * -645065141;
         } else if(35 == var2) {
            this.anInt_4572 = var1.readShort(219518348) * -770887401;
         } else if(var2 == 36) {
            this.anInt_4594 = var1.method4478((byte)1) * 1448071897;
         } else if(37 == var2) {
            this.anInt_4593 = var1.readByte(2070805024) * 409865529;
         } else if(38 == var2) {
            this.anInt_4558 = var1.method4493(-157074556) * 622045389;
         } else if(39 == var2) {
            this.anInt_4554 = var1.method4493(-157074556) * 1722655525;
         } else if(var2 == 40) {
            this.anInt_4567 = var1.method4493(-157074556) * -1072796781;
         } else if(41 == var2) {
            this.anInt_4562 = var1.method4493(-157074556) * 1497428509;
         } else if(var2 == 42) {
            this.anInt_4584 = var1.method4493(-157074556) * 833258727;
         } else if(43 == var2) {
            var1.readShort(-649985660);
         } else if(var2 == 44) {
            var1.readShort(499130862);
         } else if(var2 == 45) {
            this.anInt_4596 = var1.readShort(-1226770477) * -1706205321;
         } else if(var2 == 46) {
            this.anInt_4571 = var1.method4493(-157074556) * -876652741;
         } else if(47 == var2) {
            this.anInt_4573 = var1.method4493(-157074556) * 648438397;
         } else if(48 == var2) {
            this.anInt_4580 = var1.method4493(-157074556) * 2066682811;
         } else if(var2 == 49) {
            this.anInt_4575 = var1.method4493(-157074556) * -1561925111;
         } else if(var2 == 50) {
            this.anInt_4581 = var1.method4493(-157074556) * 1601160075;
         } else if(51 == var2) {
            this.anInt_4577 = var1.method4493(-157074556) * -1683584537;
         } else if(52 == var2) {
            var4 = var1.readByte(-43496814);
            this.anIntArray_4555 = new int[var4];
            this.anIntArray_4556 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_4555[var5] = var1.method4493(-157074556);
               int var6 = var1.readByte(587148877);
               this.anIntArray_4556[var5] = var6;
               this.anInt_4557 += -1518188481 * var6;
            }
         } else if(53 == var2) {
            this.aBoolean_4565 = false;
         } else if(var2 == 54) {
            this.anInt_4559 = (var1.readByte(327150872) << 6) * -1697052589;
            this.anInt_4566 = (var1.readByte(-878926186) << 6) * -967676595;
         } else if(55 == var2) {
            if(null == this.anIntArray_4585) {
               this.anIntArray_4585 = new int[this.aClass255_4574.aClass592_4407.anIntArray_9802.length];
            }

            var4 = var1.readByte(109356651);
            this.anIntArray_4585[var4] = var1.readShort(-830079396);
         } else if(var2 == 56) {
            if(null == this.anIntArrayArray_4583) {
               this.anIntArrayArray_4583 = new int[this.aClass255_4574.aClass592_4407.anIntArray_9802.length][];
            }

            var4 = var1.readByte(1919460129);
            this.anIntArrayArray_4583[var4] = new int[3];

            for(var5 = 0; var5 < 3; ++var5) {
               this.anIntArrayArray_4583[var4][var5] = var1.method4478((byte)1);
            }
         }
      }

   }

   static void method3506(Class240_Sub17 var0, int var1, int var2) {
      Object[] var3 = var0.anObjectArray_6907;
      int var4 = ((Integer)var3[0]).intValue();
      InterfaceDataComposite var5 = Class239.method3088(var4, -1921534765);
      if(var5 != null) {
         RSInterfaceData var6 = Class261.getInterfaceData();
         var6.mouseData = new int[-891126915 * var5.anInt_3549];
         int var7 = 0;
         var6.objectData = new String[var5.anInt_3550 * 1306035847];
         int var8 = 0;
         var6.aLongArray_9494 = new long[var5.anInt_3551 * -636665659];
         int var9 = 0;

         for(int var10 = 1; var10 < var3.length; ++var10) {
            if(var3[var10] instanceof Integer) {
               int var11 = ((Integer)var3[var10]).intValue();
               if(-2147483647 == var11) {
                  var11 = var0.anInt_6904 * -2010294859;
               }

               if(-2147483646 == var11) {
                  var11 = 2001174609 * var0.anInt_6905;
               }

               if(var11 == -2147483645) {
                  var11 = var0.aClass132_6903 != null?1278853609 * var0.aClass132_6903.cacheID:-1;
               }

               if(-2147483644 == var11) {
                  var11 = 979024709 * var0.anInt_6906;
               }

               if(-2147483643 == var11) {
                  var11 = var0.aClass132_6903 != null?var0.aClass132_6903.anInt_2428 * -1001687885:-1;
               }

               if(-2147483642 == var11) {
                  var11 = var0.aClass132_6909 != null?var0.aClass132_6909.cacheID * 1278853609:-1;
               }

               if(-2147483641 == var11) {
                  var11 = null != var0.aClass132_6909?-1001687885 * var0.aClass132_6909.anInt_2428:-1;
               }

               if(var11 == -2147483640) {
                  var11 = 1203855161 * var0.anInt_6901;
               }

               if(-2147483639 == var11) {
                  var11 = var0.anInt_6902 * 589828569;
               }

               var6.mouseData[var7++] = var11;
            } else if(var3[var10] instanceof String) {
               String var14 = (String)var3[var10];
               if(var14.equals("event_opbase")) {
                  var14 = var0.aString_6910;
               }

               var6.objectData[var8++] = var14;
            } else if(var3[var10] instanceof Long) {
               long var12 = ((Long)var3[var10]).longValue();
               var6.aLongArray_9494[var9++] = var12;
            }
         }

         var6.anInt_9493 = -1939204345 * var0.anInt_6911;
         Class273.method3597(var5, var1, var6, -1863654172);
      }
   }

   static final void method3507(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= -1189254851;
      Class231_Sub6.method5368((String)var0.stringData[863838783 * var0.stringDataIndex], (String)var0.stringData[1 + 863838783 * var0.stringDataIndex], (String)var0.stringData[2 + 863838783 * var0.stringDataIndex], var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1, true, -1614016548);
   }

   static final void method3508(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         ;
      }

   }

   public static void method3509(int var0, int var1) {
      RSInterface.spriteCache.method6677(var0, -1609797331);
      RSInterface.aClass627_2423.method6677(var0, -1114875103);
      RSInterface.aClass627_2412.method6677(var0, -1788091914);
      RSInterface.aClass627_2422.method6677(var0, -1360949429);
   }
}
