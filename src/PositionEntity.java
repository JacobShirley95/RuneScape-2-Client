
public abstract class PositionEntity extends Class563_Sub1 {

   public short locX;
   public short locX2;
   public short locY;
   public short locY2;
   public boolean aBoolean_3294;
   byte aByte_3295;
   int anInt_3296 = 0;
   Class240_Sub53[] aClass240_Sub53Array_3297 = new Class240_Sub53[4];


   void method2436(int var1) {}

   boolean method4734(Renderer var1, int var2) {
      return this.worldObjects.aClass269_4485.method3542(this.aByte_6942, this.locX, this.locX2, this.locY, this.locY2, this.method4735(var1, -1794984569));
   }

   boolean method4726(int var1) {
      for(int var2 = this.locX; var2 <= this.locX2; ++var2) {
         for(int var3 = this.locY; var3 <= this.locY2; ++var3) {
            int var4 = this.worldObjects.anInt_4498 * -644084065 + (var2 - -1947125211 * this.worldObjects.anInt_4521);
            if(var4 >= 0 && var4 < this.worldObjects.aBooleanArrayArray_4531.length) {
               int var5 = this.worldObjects.anInt_4498 * -644084065 + (var3 - -2026113737 * this.worldObjects.anInt_4508);
               if(var5 >= 0 && var5 < this.worldObjects.aBooleanArrayArray_4531.length && this.worldObjects.aBooleanArrayArray_4531[var4][var5]) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   PositionEntity(WorldObjects var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, byte var12) {
      super(var1);
      this.plane = (byte)var2;
      this.aByte_6942 = (byte)var3;
      this.setPos(new GameCoord((float)var4, (float)var5, (float)var6));
      this.locX = (short)var7;
      this.locX2 = (short)var8;
      this.locY = (short)var9;
      this.locY2 = (short)var10;
      this.aBoolean_3294 = var11;
      this.aByte_3295 = var12;

      for(int var13 = 0; var13 < 4; ++var13) {
         this.aClass240_Sub53Array_3297[var13] = null;
      }

   }

   int method4725(Class240_Sub53[] var1, int var2) {
      int var3;
      if(this.aBoolean_9591) {
         this.anInt_3296 = 0;

         int var4;
         int var9;
         label119:
         for(var3 = this.locX; var3 <= this.locX2; ++var3) {
            var4 = this.locY;

            while(var4 <= this.locY2) {
               long var5 = this.worldObjects.aLongArrayArrayArray_4471[this.plane][var3][var4];
               long var7 = 0L;

               label115:
               while(true) {
                  if(var7 <= 48L) {
                     var9 = (int)(var5 >>> (int)var7 & 65535L);
                     if(var9 > 0) {
                        Class265 var10 = this.worldObjects.aClass265Array_4526[var9 - 1];

                        for(int var11 = 0; var11 < 1563543613 * this.anInt_3296; ++var11) {
                           if(var10.aClass240_Sub53_4635 == this.aClass240_Sub53Array_3297[var11]) {
                              var7 += 16L;
                              continue label115;
                           }
                        }

                        this.aClass240_Sub53Array_3297[(this.anInt_3296 += -186970347) * 1563543613 - 1] = var10.aClass240_Sub53_4635;
                        if(1563543613 * this.anInt_3296 == 4) {
                           break label119;
                        }

                        var7 += 16L;
                        continue;
                     }
                  }

                  ++var4;
                  break;
               }
            }
         }

         for(var3 = this.anInt_3296 * 1563543613; var3 < 4; ++var3) {
            this.aClass240_Sub53Array_3297[var3] = null;
         }

         if(this.aByte_3295 != 0) {
            int var12 = this.locX - this.worldObjects.anInt_4521 * -1947125211;
            int var13 = this.locY - -2026113737 * this.worldObjects.anInt_4508;
            int var14;
            short var15;
            short var19;
            if(this.aByte_3295 == 1) {
               if(var13 > var12) {
                  var19 = this.locX;
                  var4 = this.locY - 1;
                  var14 = 1 + this.locX;
                  var15 = this.locY;
               } else {
                  var19 = this.locX;
                  var4 = this.locY + 1;
                  var14 = this.locX - 1;
                  var15 = this.locY;
               }
            } else if(var13 > -var12) {
               var19 = this.locX;
               var4 = this.locY - 1;
               var14 = this.locX - 1;
               var15 = this.locY;
            } else {
               var19 = this.locX;
               var4 = 1 + this.locY;
               var14 = 1 + this.locX;
               var15 = this.locY;
            }

            label87:
            for(var9 = 0; var9 < this.anInt_3296 * 1563543613; ++var9) {
               long var16 = this.worldObjects.aLongArrayArrayArray_4471[this.plane][var19][var4];

               Class265 var18;
               do {
                  if(var16 == 0L) {
                     var16 = this.worldObjects.aLongArrayArrayArray_4471[this.plane][var14][var15];

                     while(var16 != 0L) {
                        var18 = this.worldObjects.aClass265Array_4526[(int)((var16 & 65535L) - 1L)];
                        var16 >>>= 16;
                        if(this.aClass240_Sub53Array_3297[var9] == var18.aClass240_Sub53_4635) {
                           continue label87;
                        }
                     }

                     for(int var20 = var9; var20 < 1563543613 * this.anInt_3296 - 1; ++var20) {
                        this.aClass240_Sub53Array_3297[var20] = this.aClass240_Sub53Array_3297[var20 + 1];
                     }

                     this.anInt_3296 -= -186970347;
                     break;
                  }

                  var18 = this.worldObjects.aClass265Array_4526[(int)((var16 & 65535L) - 1L)];
                  var16 >>>= 16;
               } while(var18.aClass240_Sub53_4635 != this.aClass240_Sub53Array_3297[var9]);
            }
         }

         this.aBoolean_9591 = false;
      }

      for(var3 = 0; var3 < this.anInt_3296 * 1563543613; ++var3) {
         var1[var3] = this.aClass240_Sub53Array_3297[var3];
      }

      return this.anInt_3296 * 1563543613;
   }
}
