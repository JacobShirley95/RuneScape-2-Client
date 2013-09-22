import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class178_Sub1 extends Class178 {

   public boolean aBoolean_11139 = false;
   public long aLong_11140 = 5843103806619007731L;
   Class340[] aClass340Array_11141;
   boolean aBoolean_11142 = false;
   Set aSet_11143;
   long aLong_11144 = -8921140001427110651L;
   final Class374[] aClass374Array_11145;
   int anInt_11146 = 0;
   static final int anInt_11147 = 1;


   public Class178_Sub1(Class212_Sub1 var1) {
      super(var1);
      this.aClass374Array_11145 = new Class374[var1.method5497(1920339360)];

      for(int var2 = 0; var2 < var1.method5497(1539618193); ++var2) {
         this.aClass374Array_11145[var2] = var1.method5503(var2, 824148490).aClass374_3199;
      }

      this.aSet_11143 = new HashSet(var1.method5497(1701289611));
   }

   public void method7710(byte var1) {
      if(Class373.getCurrentTime((short)30867) >= this.aLong_11144 * -4758336767164563405L) {
         int var4;
         if(null == this.aClass340Array_11141) {
            if(!this.aBoolean_11142) {
               return;
            }

            this.aClass340Array_11141 = new Class340[this.aSet_11143.size()];
            int var2 = 0;

            for(Iterator var3 = this.aSet_11143.iterator(); var3.hasNext(); this.aClass340Array_11141[var2++] = new Class340(var4, this.aClass468_3082.method5637(var4, 822489028))) {
               var4 = ((Integer)var3.next()).intValue();
            }

            this.anInt_11146 = 0;
            this.aBoolean_11142 = false;
            this.aSet_11143.clear();
         }

         if(null != this.aClass340Array_11141 && this.anInt_11146 * 1877551157 < this.aClass340Array_11141.length) {
            ConnectionHandler var6 = Class32.method230(-556494929);
            if(var6.anInt_3436 * 872510671 > 1200) {
               return;
            }

            Class240_Sub27 var7 = Class47_Sub1.method3496(Class326.aClass326_6326, var6.aClass528_3433, 1917447504);
            var7.aClass240_Sub8_Sub1_7370.method4463(0, 499606400);
            var4 = 964952859 * var7.aClass240_Sub8_Sub1_7370.index;

            for(var7.aClass240_Sub8_Sub1_7370.index += -2043502829; this.anInt_11146 * 1877551157 < this.aClass340Array_11141.length; this.anInt_11146 += 2067720733) {
               Class340 var5 = this.aClass340Array_11141[1877551157 * this.anInt_11146];
               if(964952859 * var7.aClass240_Sub8_Sub1_7370.index + var6.anInt_3436 * 872510671 + NodeArrayList.aClass212_Sub1_Sub2_9205.method5499(var5, -1192233547) > 1500) {
                  break;
               }

               NodeArrayList.aClass212_Sub1_Sub2_9205.method5500(var7.aClass240_Sub8_Sub1_7370, var5, 1891094937);
            }

            var7.aClass240_Sub8_Sub1_7370.method4472(var7.aClass240_Sub8_Sub1_7370.index * 964952859 - var4, -650079845);
            if(this.anInt_11146 * 1877551157 >= this.aClass340Array_11141.length) {
               var7.aClass240_Sub8_Sub1_7370.data[var4] = 1;
            } else {
               var7.aClass240_Sub8_Sub1_7370.data[var4] = 0;
            }

            var6.addPacket(var7, 1849033017);
            this.aLong_11144 = (Class373.getCurrentTime((short)24669) + 1000L) * 8921140001427110651L;
         }

      }
   }

   public void method7711(int var1) {
      for(int var2 = 0; var2 < this.aClass374Array_11145.length; ++var2) {
         if(this.aClass374Array_11145[var2] == Class374.aClass374_7124 || this.aClass374Array_11145[var2] == Class374.aClass374_7121) {
            this.aClass468_3082.method5624(var2, -1318153658);
         }
      }

      this.aSet_11143.clear();
      this.aBoolean_11142 = false;
      this.aClass340Array_11141 = null;
      this.aLong_11144 = -8921140001427110651L;
   }

   public void method7712(int var1) {
      if(null != this.aClass340Array_11141 && 1877551157 * this.anInt_11146 >= this.aClass340Array_11141.length) {
         this.aClass340Array_11141 = null;
         this.anInt_11146 = 0;
      }

   }

   public void method2111(Class187 var1, int var2, int var3) {
      if(this.aClass374Array_11145[var1.anInt_3198 * -1982395567] == Class374.aClass374_7122) {
         this.aBoolean_11139 = true;
      } else if(this.aClass374Array_11145[-1982395567 * var1.anInt_3198] == Class374.aClass374_7121 && this.method2269(var1, -390483690) != var2) {
         this.aBoolean_11142 = true;
         this.aSet_11143.add(Integer.valueOf(-1982395567 * var1.anInt_3198));
      }

      super.method2111(var1, var2, 766182478);
   }

   public void method7714(RandomAccessFileNode var1, int var2) {
      boolean var15 = false;

      label110: {
         label109: {
            try {
               var15 = true;
               int var3 = 3;
               int var4 = 0;
               Iterator var5 = this.aClass468_3082.iterator();

               while(var5.hasNext()) {
                  Class340 var6 = (Class340)var5.next();
                  if(Class374.aClass374_7122 == this.aClass374Array_11145[var6.anInt_6534 * -488503965]) {
                     var3 += NodeArrayList.aClass212_Sub1_Sub2_9205.method5499(var6, -1192233547);
                     ++var4;
                  }
               }

               ByteArrayDataNode var21 = new ByteArrayDataNode(var3);
               var21.putByte(1, 168917890);
               var21.method4463(var4, 417154841);
               Iterator var22 = this.aClass468_3082.iterator();

               while(var22.hasNext()) {
                  Class340 var7 = (Class340)var22.next();
                  if(Class374.aClass374_7122 == this.aClass374Array_11145[var7.anInt_6534 * -488503965]) {
                     NodeArrayList.aClass212_Sub1_Sub2_9205.method5500(var21, var7, 1891094937);
                  }
               }

               var1.writeData(var21.data, 0, var21.index * 964952859, (byte)4);
               var15 = false;
               break label109;
            } catch (Exception var19) {
               var15 = false;
            } finally {
               if(var15) {
                  try {
                     var1.closeRAFile((byte)56);
                  } catch (Exception var16) {
                     ;
                  }

               }
            }

            try {
               var1.closeRAFile((byte)100);
            } catch (Exception var17) {
               ;
            }
            break label110;
         }

         try {
            var1.closeRAFile((byte)23);
         } catch (Exception var18) {
            ;
         }
      }

      this.aLong_11140 = Class373.getCurrentTime((short)25279) * -5843103806619007731L;
      this.aBoolean_11139 = false;
   }

   public void method7715(byte var1) {
      this.anInt_11146 = 0;
   }

   public void method2097(Class187 var1, Object var2, byte var3) {
      if(this.aClass374Array_11145[var1.anInt_3198 * -1982395567] == Class374.aClass374_7122) {
         this.aBoolean_11139 = true;
      } else if(Class374.aClass374_7121 == this.aClass374Array_11145[var1.anInt_3198 * -1982395567]) {
         if(var2 instanceof String) {
            String var4 = (String)var2;
            if(var4.length() > 80) {
               var2 = var4.substring(0, 80);
            }
         }

         Object var5 = this.method2117(var1, (byte)44);
         if(var2 != null && null != var5 && !var2.equals(var5)) {
            this.aBoolean_11142 = true;
            this.aSet_11143.add(Integer.valueOf(var1.anInt_3198 * -1982395567));
         } else if(var2 == null != (var5 == null)) {
            this.aBoolean_11142 = true;
            this.aSet_11143.add(Integer.valueOf(-1982395567 * var1.anInt_3198));
         }
      }

      super.method2097(var1, var2, (byte)36);
   }

   public void method7717(RandomAccessFileNode var1, byte var2) {
      boolean var21 = false;

      label241: {
         label242: {
            label259: {
               label243: {
                  label260: {
                     try {
                        var21 = true;
                        byte[] var3 = new byte[(int)var1.getFileLength(1870372516)];

                        int var5;
                        for(int var4 = 0; var4 < var3.length; var4 += var5) {
                           var5 = var1.read(var3, var4, var3.length - var4);
                           if(-1 == var5) {
                              throw new EOFException();
                           }
                        }

                        ByteArrayDataNode var31 = new ByteArrayDataNode(var3);
                        if(var31.data.length - var31.index * 964952859 < 1) {
                           var21 = false;
                           break label259;
                        }

                        int var6 = var31.readByte(903220913);
                        if(var6 >= 0) {
                           if(var6 > 1) {
                              var21 = false;
                              break label241;
                           }

                           if(var31.data.length - 964952859 * var31.index < 2) {
                              var21 = false;
                              break label242;
                           }

                           int var7 = var31.readShort(647447748);
                           if(var31.data.length - 964952859 * var31.index < var7 * 6) {
                              var21 = false;
                              break label260;
                           }

                           for(int var8 = 0; var8 < var7; ++var8) {
                              Class340 var9 = NodeArrayList.aClass212_Sub1_Sub2_9205.method5501(var31, -1423452749);
                              if(Class374.aClass374_7122 == this.aClass374Array_11145[-488503965 * var9.anInt_6534] && NodeArrayList.aClass212_Sub1_Sub2_9205.method5503(var9.anInt_6534 * -488503965, 824148490).aClass373_3197.method4745(1290182620).aClass_4774.isAssignableFrom(var9.anObject_6535.getClass())) {
                                 this.aClass468_3082.method5622(-488503965 * var9.anInt_6534, var9.anObject_6535, (byte)25);
                              }
                           }

                           var21 = false;
                           break label243;
                        }

                        var21 = false;
                        break label241;
                     } catch (Exception var29) {
                        var21 = false;
                     } finally {
                        if(var21) {
                           try {
                              var1.closeRAFile((byte)-35);
                           } catch (Exception var22) {
                              ;
                           }

                        }
                     }

                     try {
                        var1.closeRAFile((byte)-14);
                     } catch (Exception var26) {
                        ;
                     }

                     return;
                  }

                  try {
                     var1.closeRAFile((byte)21);
                  } catch (Exception var25) {
                     ;
                  }

                  return;
               }

               try {
                  var1.closeRAFile((byte)64);
               } catch (Exception var27) {
                  ;
               }

               return;
            }

            try {
               var1.closeRAFile((byte)-28);
            } catch (Exception var23) {
               ;
            }

            return;
         }

         try {
            var1.closeRAFile((byte)-12);
         } catch (Exception var24) {
            ;
         }

         return;
      }

      try {
         var1.closeRAFile((byte)15);
      } catch (Exception var28) {
         ;
      }

   }

   public void method2106(Class187 var1, long var2) {
      if(this.aClass374Array_11145[var1.anInt_3198 * -1982395567] == Class374.aClass374_7122) {
         this.aBoolean_11139 = true;
      } else if(this.aClass374Array_11145[var1.anInt_3198 * -1982395567] == Class374.aClass374_7121 && this.method2094(var1, -1933124691) != var2) {
         this.aBoolean_11142 = true;
         this.aSet_11143.add(Integer.valueOf(var1.anInt_3198 * -1982395567));
      }

      super.method2106(var1, var2);
   }

   static void method7719(int x, int y, int minX, int minY, int width, int var5, int var6, OptionListNode var7, FontRenderer var8, RSFont var9, int var10, int var11, int var12) {
      if(x > minX && x < minX + width && y > var6 - var9.anInt_8573 * 915612327 - 1 && y < var9.anInt_8571 * 2080531379 + var6 && var7.aBoolean_951) {
         var10 = var11;
      }

      int[] var13 = Class421.method5267(var7, (byte)66);
      String var14 = Class481.getOptionString(var7, 1855805269);
      if(null != var13) {
         var14 = var14 + Class5.method28(var13, -2110255169);
      }

      var8.method1073(var14, minX + 3, var6, var10, 0, client.aRandom_383, -324359965 * ServerInputStream.anInt_4375, Class20.imgNameIcons, Class90.furthestPositions, (byte)-31);
      if(var7.aBoolean_952) {
         Class530.otherLeveLSprite.drawAt(minX + 5 + var9.method5566(var14, 936874451), var6 - 915612327 * var9.anInt_8573);
      }

   }

   static final void method7720(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class401.method4966(var3, var0, 2104105052);
   }
}
