
public class Class240_Sub41_Sub1 extends Class240_Sub41 {

   int anInt_961 = 36950784;
   static Class371 aClass371_962 = new Class371(64, Class369.aClass369_6923);
   boolean aBoolean_963;
   final NodeList aNodeList_964 = new NodeList();
   int anInt_965 = 0;
   final int anInt_966;
   int anInt_967 = -1243841792;
   int anInt_968;
   static final int anInt_969 = 100;
   boolean aBoolean_970;


   public void method417(int var1, int var2) {
      this.anInt_967 = var1 * 1656085627;
      this.anInt_961 = var1 * -1560136749;
   }

   synchronized void method4935(int var1) {
      if(!this.aBoolean_970) {
         while(true) {
            Class240_Sub11 var2 = this.method423(1844306955);
            if(var2 == null) {
               if(this.aBoolean_963) {
                  this.shiftNext();
                  aClass371_962.method4709(1702307728);
               }

               return;
            }

            if(var2.aShortArrayArray_6797[0].length - this.anInt_968 * -2091632195 > var1) {
               this.anInt_968 += -217462379 * var1;
               return;
            }

            var1 -= var2.aShortArrayArray_6797[0].length - this.anInt_968 * -2091632195;
            this.method429((short)-4461);
         }
      }
   }

   synchronized int method419(int var1) {
      return 577392825 * this.anInt_965;
   }

   Class240_Sub11 method420(int var1, double var2) {
      long var4 = (long)(this.anInt_966 * -1529744091 << 32 | var1);
      Class240_Sub11 var6 = (Class240_Sub11)aClass371_962.method4706(Long.valueOf(var4), 911554320);
      if(null != var6) {
         var6.aDouble_6798 = var2;
         aClass371_962.method4705(Long.valueOf(var4), 480415156);
      } else {
         var6 = new Class240_Sub11(new short[this.anInt_966 * -1529744091][var1], var2);
      }

      return var6;
   }

   synchronized void method421(Class240_Sub11 var1, int var2) {
      while(577392825 * this.anInt_965 >= 100) {
         this.aNodeList_964.returnShift((byte)13);
         this.anInt_965 -= 1716041097;
      }

      this.aNodeList_964.addNode(var1, (short)-7579);
      this.anInt_965 += 1716041097;
   }

   synchronized void method422(boolean var1, int var2) {
      this.aBoolean_970 = var1;
   }

   synchronized Class240_Sub11 method423(int var1) {
      return (Class240_Sub11)this.aNodeList_964.getBaseNode_2((byte)79);
   }

   int method4933() {
      return 1;
   }

   Class240_Sub41 method4931() {
      return null;
   }

   Class240_Sub41 method4936() {
      return null;
   }

   Class240_Sub41_Sub1(int var1) {
      this.anInt_966 = var1 * -471392595;
   }

   synchronized void method427(int var1) {
      this.aBoolean_963 = true;
   }

   synchronized void method4937(int[] var1, int var2, int var3) {
      if(!this.aBoolean_970) {
         if(this.method423(-655729380) == null) {
            if(this.aBoolean_963) {
               this.shiftNext();
               aClass371_962.method4709(766772069);
            }

         } else {
            int var4 = var2 + var3;
            if(Class316.aBoolean_6136) {
               var4 <<= 1;
            }

            byte var5 = 0;
            byte var6 = 0;
            if(this.anInt_966 * -1529744091 == 2) {
               var6 = 1;
            }

            while(var2 < var4) {
               Class240_Sub11 var7 = this.method423(-232619717);
               if(null == var7) {
                  return;
               }

               short[][] var8;
               for(var8 = var7.aShortArrayArray_6797; var2 < var4 && -2091632195 * this.anInt_968 < var8[0].length; this.anInt_968 += -217462379) {
                  if(Class316.aBoolean_6136) {
                     var1[var2++] = var8[var5][-2091632195 * this.anInt_968] * -1717329229 * this.anInt_967;
                     var1[var2++] = this.anInt_961 * 1072798811 * var8[var6][this.anInt_968 * -2091632195];
                  } else {
                     int var10001 = var2++;
                     var1[var10001] += var8[var5][this.anInt_968 * -2091632195] * -1717329229 * this.anInt_967 + var8[var6][-2091632195 * this.anInt_968] * 1072798811 * this.anInt_961;
                  }
               }

               if(-2091632195 * this.anInt_968 >= var8[0].length) {
                  this.method429((short)-1762);
               }
            }

         }
      }
   }

   synchronized void method429(short var1) {
      Class240_Sub11 var2 = this.method423(-1083865732);
      if(null != var2) {
         var2.shiftNext();
         this.anInt_968 = 0;
         this.anInt_965 -= 1716041097;
         aClass371_962.method4710(Long.valueOf(var2.method4600(-922033450)), var2, 119378012);
      }
   }

   synchronized double method430(byte var1) {
      if(577392825 * this.anInt_965 < 1) {
         return -1.0D;
      } else {
         Class240_Sub11 var2 = (Class240_Sub11)this.aNodeList_964.getBaseNode_2((byte)22);
         return null == var2?-1.0D:var2.aDouble_6798 - (double)((float)var2.aShortArrayArray_6797[0].length / (float)Class316.anInt_6135);
      }
   }

   static boolean method431(int var0, byte var1) {
      return var0 != 18 && 19 != var0 && var0 != 20 && var0 != 21 && var0 != 22 && 1004 != var0?17 == var0:true;
   }

   static final void method432(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class11.anInt_71 * 1374043613;
   }

   static final void method433(RSInterfaceData var0, int var1) {}

   static void method434(RSInterface var0, int var1, int var2, int var3) {
      if(var0.aByte_2431 == 0) {
         var0.X1 = 62641411 * var0.anInt_2451;
      } else if(1 == var0.aByte_2431) {
         var0.X1 = 1986194901 * ((var1 - var0.width * -533669195) / 2 + 576367479 * var0.anInt_2451);
      } else if(var0.aByte_2431 == 2) {
         var0.X1 = (var1 - var0.width * -533669195 - 576367479 * var0.anInt_2451) * 1986194901;
      } else if(3 == var0.aByte_2431) {
         var0.X1 = 1986194901 * (576367479 * var0.anInt_2451 * var1 >> 14);
      } else if(4 == var0.aByte_2431) {
         var0.X1 = ((var0.anInt_2451 * 576367479 * var1 >> 14) + (var1 - var0.width * -533669195) / 2) * 1986194901;
      } else {
         var0.X1 = (var1 - -533669195 * var0.width - (var0.anInt_2451 * 576367479 * var1 >> 14)) * 1986194901;
      }

      if(var0.aByte_2477 == 0) {
         var0.Y1 = var0.anInt_2446 * 79300867;
      } else if(1 == var0.aByte_2477) {
         var0.Y1 = (-900698109 * var0.anInt_2446 + (var2 - var0.height * 1833812087) / 2) * -156028159;
      } else if(var0.aByte_2477 == 2) {
         var0.Y1 = -156028159 * (var2 - var0.height * 1833812087 - -900698109 * var0.anInt_2446);
      } else if(3 == var0.aByte_2477) {
         var0.Y1 = (var2 * -900698109 * var0.anInt_2446 >> 14) * -156028159;
      } else if(var0.aByte_2477 == 4) {
         var0.Y1 = ((var2 - 1833812087 * var0.height) / 2 + (var2 * -900698109 * var0.anInt_2446 >> 14)) * -156028159;
      } else {
         var0.Y1 = (var2 - var0.height * 1833812087 - (var2 * var0.anInt_2446 * -900698109 >> 14)) * -156028159;
      }

      if(client.aBoolean_365 && (client.method174(var0).anInt_7693 * -1992444447 != 0 || 1916189739 * var0.index == 0)) {
         if(var0.X1 * -1500060803 < 0) {
            var0.X1 = 0;
         } else if(-533669195 * var0.width + -1500060803 * var0.X1 > var1) {
            var0.X1 = (var1 - var0.width * -533669195) * 1986194901;
         }

         if(var0.Y1 * 980798721 < 0) {
            var0.Y1 = 0;
         } else if(var0.height * 1833812087 + 980798721 * var0.Y1 > var2) {
            var0.Y1 = -156028159 * (var2 - 1833812087 * var0.height);
         }
      }

   }

   static void method435(RSInterfaceData var0, int var1) {
      var0.intTypes[-831324111 * var0.intTypeIndex - 2] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 2], -933751874).method6177(Class240_Sub41_Sub3.aClass23_1024, var0.intTypes[-831324111 * var0.intTypeIndex - 1], (byte)24)?1:0;
      var0.intTypeIndex -= -708028207;
   }
}
