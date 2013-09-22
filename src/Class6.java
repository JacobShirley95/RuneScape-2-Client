
public class Class6 {

   public int angle;
   int anInt_33;


   public boolean method32(int var1, int var2, int var3, int var4) {
      int var5 = -828931463 * this.anInt_33;
      if(var1 == 208910329 * this.angle && this.anInt_33 * -828931463 == 0) {
         return false;
      } else {
         boolean var6;
         int var7;
         if(0 == this.anInt_33 * -828931463) {
            if(var1 > this.angle * 208910329 && var1 <= var2 + 208910329 * this.angle || var1 < this.angle * 208910329 && var1 >= this.angle * 208910329 - var2) {
               this.angle = 699095625 * var1;
               return false;
            }

            var6 = true;
         } else {
            int var8;
            if(this.anInt_33 * -828931463 > 0 && var1 > 208910329 * this.angle) {
               var7 = this.anInt_33 * -828931463 * -828931463 * this.anInt_33 / (2 * var2);
               var8 = var7 + this.angle * 208910329;
               if(var8 < var1 && var8 >= 208910329 * this.angle) {
                  var6 = true;
               } else {
                  var6 = false;
               }
            } else if(this.anInt_33 * -828931463 < 0 && var1 < 208910329 * this.angle) {
               var7 = -828931463 * this.anInt_33 * this.anInt_33 * -828931463 / (2 * var2);
               var8 = this.angle * 208910329 - var7;
               if(var8 > var1 && var8 <= this.angle * 208910329) {
                  var6 = true;
               } else {
                  var6 = false;
               }
            } else {
               var6 = false;
            }
         }

         if(var6) {
            if(var1 > this.angle * 208910329) {
               this.anInt_33 += var2 * 368265161;
               if(var3 != 0 && -828931463 * this.anInt_33 > var3) {
                  this.anInt_33 = 368265161 * var3;
               }
            } else {
               this.anInt_33 -= 368265161 * var2;
               if(0 != var3 && -828931463 * this.anInt_33 < -var3) {
                  this.anInt_33 = -var3 * 368265161;
               }
            }

            if(-828931463 * this.anInt_33 != var5) {
               var7 = -828931463 * this.anInt_33 * this.anInt_33 * -828931463 / (var2 * 2);
               if(var1 > 208910329 * this.angle) {
                  if(var7 + 208910329 * this.angle > var1) {
                     this.anInt_33 = 368265161 * var5;
                  }
               } else if(var1 < this.angle * 208910329 && this.angle * 208910329 - var7 < var1) {
                  this.anInt_33 = 368265161 * var5;
               }
            }
         } else if(-828931463 * this.anInt_33 > 0) {
            this.anInt_33 -= 368265161 * var2;
            if(this.anInt_33 * -828931463 < 0) {
               this.anInt_33 = 0;
            }
         } else {
            this.anInt_33 += 368265161 * var2;
            if(-828931463 * this.anInt_33 > 0) {
               this.anInt_33 = 0;
            }
         }

         this.angle += (var5 + -828931463 * this.anInt_33 >> 1) * 699095625;
         return var6;
      }
   }

   public int getRotation(byte var1) {
      return 208910329 * this.angle & 16383;
   }

   public void fixAngle(int var1) {
      this.angle = (208910329 * this.angle & 16383) * 699095625;
   }

   public void setAngle(int var1, byte var2) {
      this.angle = 699095625 * var1;
      this.anInt_33 = 0;
   }

   public static int method36(int var0) {
      return Class52.aClass327_1072.method4024((byte)101);
   }

   static final void method37(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2469 = -208957682;
      var0.aClass442_2594 = null;
      var0.anInt_2416 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 795082499;
      if(-1001687885 * var0.anInt_2428 == -1 && !var1.aBoolean_2054) {
         Class86.method1132(1278853609 * var0.cacheID, (byte)32);
      }

   }

   static final void method38(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class285.method3678(var3, var4, var0, -1933660428);
   }

   public static void method39(int var0, int var1) {
      if(37 == var0) {
         Class248_Sub1.mapZoomScaleY = 3.0F;
      } else if(var0 == 50) {
         Class248_Sub1.mapZoomScaleY = 4.0F;
      } else if(var0 == 75) {
         Class248_Sub1.mapZoomScaleY = 6.0F;
      } else if(var0 == 100) {
         Class248_Sub1.mapZoomScaleY = 8.0F;
      } else if(var0 == 200) {
         Class248_Sub1.mapZoomScaleY = 16.0F;
      }

      Class248_Sub1.anInt_6447 = 826358349;
      Class248_Sub1.anInt_6447 = 826358349;
   }
}
