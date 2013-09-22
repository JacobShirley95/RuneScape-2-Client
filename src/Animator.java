import java.awt.Component;

public class Animator {

   int anInt_9126;
   public static final int anInt_9127 = 2;
   public static final int anInt_9128 = 0;
   Animation animation;
   int anInt_9130;
   int anInt_9131;
   int anInt_9132;
   public static final int anInt_9133 = 1;
   int anInt_9134;
   boolean aBoolean_9135 = false;
   boolean aBoolean_9136 = false;
   final Class519 aClass519_9137;
   boolean aBoolean_9138 = false;
   int anInt_9139 = 0;
   final Class519 aClass519_9140;
   public static ByteArrayDataNode aClass240_Sub8_9141;


   public final void set(Animator var1, int var2) {
      this.animation = var1.animation;
      this.aBoolean_9135 = var1.aBoolean_9135;
      this.aBoolean_9136 = var1.aBoolean_9136;
      this.anInt_9131 = var1.anInt_9131 * 1;
      this.anInt_9132 = 1 * var1.anInt_9132;
      this.anInt_9126 = var1.anInt_9126 * 1;
      this.anInt_9134 = 1 * var1.anInt_9134;
      this.anInt_9130 = 1 * var1.anInt_9130;
      this.method5895(-1014185131);
   }

   public final boolean isAnimating(int var1) {
      return this.animation != null;
   }

   public final Animation getAnimation(int var1) {
      return this.animation;
   }

   public final int getAnimationID(int var1) {
      return this.animation != null?463366109 * this.animation.id:-1;
   }

   public final void method5875(int var1, boolean var2, short var3) {
      this.animate(var1, 0, 0, var2, (byte)-100);
   }

   public final void applyToModel(Model var1, int var2, int var3) {
      if(null != this.animation) {
         if(null != this.animation.anIntArray_10120 && this.method5886(1541255039)) {
            var1.method2026(this.aClass519_9137.aClass240_Sub22_Sub9_9233, this.aClass519_9137.anInt_9231 * -1426378405, this.aClass519_9137.aClass240_Sub22_Sub9_9234, this.aClass519_9137.anInt_9235 * 63235891, this.anInt_9130 * 808430347, this.animation.anIntArray_10109[799508455 * this.anInt_9126], var2, this.animation.aBoolean_10117);
            if(this.aBoolean_9136 && null != this.animation.anIntArray_10108 && this.aClass519_9140.aBoolean_9230) {
               var1.method2026(this.aClass519_9140.aClass240_Sub22_Sub9_9233, -1426378405 * this.aClass519_9140.anInt_9231, this.aClass519_9140.aClass240_Sub22_Sub9_9234, this.aClass519_9140.anInt_9235 * 63235891, 808430347 * this.anInt_9130, this.animation.anIntArray_10109[799508455 * this.anInt_9126], var2, this.animation.aBoolean_10117);
            }
         }

      }
   }

   public final boolean method5877(short var1) {
      return 0 != this.anInt_9131 * 1006878773;
   }

   public final int method5878(int var1) {
      return this.anInt_9131 * 1006878773;
   }

   public final void method5879(int var1, byte var2) {
      this.anInt_9131 = var1 * -2000580067;
   }

   public final void method5880(int var1) {
      this.anInt_9132 = 0;
   }

   Animator(boolean var1) {
      this.aBoolean_9136 = var1;
      this.aClass519_9137 = new Class519();
      if(this.aBoolean_9136) {
         this.aClass519_9140 = new Class519();
      } else {
         this.aClass519_9140 = null;
      }

   }

   public final void method5881(byte var1) {
      this.method5882(0, -1489880794);
   }

   public final void method5882(int var1, int var2) {
      this.anInt_9126 = 0;
      this.anInt_9134 = -1930933785 * (this.animation.anIntArray_10120.length > 1?1:-1);
      this.anInt_9130 = 0;
      this.aBoolean_9135 = false;
      this.anInt_9131 = -2000580067 * var1;
      this.anInt_9132 = 0;
      if(this.animation != null & null != this.animation.anIntArray_10120) {
         this.doAnimation(this.animation, 799508455 * this.anInt_9126, -1054669385);
         this.method5895(-1938808634);
      }

   }

   public final boolean method5883(int var1, int var2) {
      if(null != this.animation && var1 != 0) {
         if(this.anInt_9131 * 1006878773 > 0) {
            if(this.anInt_9131 * 1006878773 >= var1) {
               this.anInt_9131 -= -2000580067 * var1;
               return false;
            }

            var1 -= this.anInt_9131 * 1006878773;
            this.anInt_9131 = 0;
            this.doAnimation(this.animation, 799508455 * this.anInt_9126, -916069973);
         }

         var1 += this.anInt_9130 * 808430347;
         boolean var3 = this.animation.aBoolean_10121 | Animation.aBoolean_10107;
         if(var1 > 100 && this.animation.anInt_10123 * -1004779231 > 0) {
            int var4;
            for(var4 = this.animation.anIntArray_10120.length - this.animation.anInt_10123 * -1004779231; this.anInt_9126 * 799508455 < var4 && var1 > this.animation.anIntArray_10109[799508455 * this.anInt_9126]; this.anInt_9126 += 744266711) {
               var1 -= this.animation.anIntArray_10109[this.anInt_9126 * 799508455];
            }

            if(this.anInt_9126 * 799508455 >= var4) {
               int var5 = 0;

               for(int var6 = var4; var6 < this.animation.anIntArray_10120.length; ++var6) {
                  var5 += this.animation.anIntArray_10109[var6];
               }

               if(0 == this.anInt_9139 * 1183329997) {
                  this.anInt_9132 += -1469325065 * (var1 / var5);
               }

               var1 %= var5;
            }

            this.anInt_9134 = 1128562801 * this.anInt_9126 + -1930933785;
            if(this.anInt_9134 * -600917545 >= this.animation.anIntArray_10120.length) {
               if(-1004779231 * this.animation.anInt_10123 == -1 && this.aBoolean_9138) {
                  this.anInt_9134 = 0;
               } else {
                  this.anInt_9134 -= this.animation.anInt_10123 * 1481139655;
               }

               if(-600917545 * this.anInt_9134 < 0 || this.anInt_9134 * -600917545 >= this.animation.anIntArray_10120.length) {
                  this.anInt_9134 = 1930933785;
               }
            }

            var3 = true;
         }

         while(var1 > this.animation.anIntArray_10109[799508455 * this.anInt_9126]) {
            var3 = true;
            var1 -= this.animation.anIntArray_10109[(this.anInt_9126 += 744266711) * 799508455 - 1];
            if(799508455 * this.anInt_9126 >= this.animation.anIntArray_10120.length) {
               if(-1 != this.animation.anInt_10123 * -1004779231 && this.anInt_9139 * 1183329997 != 2) {
                  this.anInt_9126 -= this.animation.anInt_10123 * -941333065;
                  if(this.anInt_9139 * 1183329997 == 0) {
                     this.anInt_9132 += -1469325065;
                  }
               }

               if(-1005264697 * this.anInt_9132 >= this.animation.anInt_10116 * -425063171 || 799508455 * this.anInt_9126 < 0 || 799508455 * this.anInt_9126 >= this.animation.anIntArray_10120.length) {
                  this.aBoolean_9135 = true;
                  break;
               }
            }

            this.doAnimation(this.animation, 799508455 * this.anInt_9126, -699464906);
            this.anInt_9134 = -1930933785 + this.anInt_9126 * 1128562801;
            if(this.anInt_9134 * -600917545 >= this.animation.anIntArray_10120.length) {
               if(-1 == -1004779231 * this.animation.anInt_10123 && this.aBoolean_9138) {
                  this.anInt_9134 = 0;
               } else {
                  this.anInt_9134 -= 1481139655 * this.animation.anInt_10123;
               }

               if(this.anInt_9134 * -600917545 < 0 || -600917545 * this.anInt_9134 >= this.animation.anIntArray_10120.length) {
                  this.anInt_9134 = 1930933785;
               }
            }
         }

         this.anInt_9130 = -880719709 * var1;
         if(var3) {
            this.method5895(-1453986470);
         }

         return var3;
      } else {
         return false;
      }
   }

   public final void method5884(Model var1, int var2) {
      if(this.animation.anIntArray_10120 != null && this.method5886(-509595858)) {
         var1.method2029(this.aClass519_9137.aClass240_Sub22_Sub9_9233, -1426378405 * this.aClass519_9137.anInt_9231);
         if(this.aBoolean_9136 && null != this.animation.anIntArray_10108 && this.aClass519_9140.aBoolean_9230) {
            var1.method2029(this.aClass519_9140.aClass240_Sub22_Sub9_9233, this.aClass519_9140.anInt_9231 * -1426378405);
         }
      }

   }

   void doAnimation(Animation var1, int var2, int var3) {}

   final boolean method5886(int var1) {
      if(null != this.animation) {
         boolean var2 = this.aClass519_9137.method5963(Class178.animationUnpacker, this.animation, this.anInt_9126 * 799508455, -600917545 * this.anInt_9134, this.animation.anIntArray_10120, 1667636922);
         if(var2 && this.aBoolean_9136 && this.animation.anIntArray_10108 != null) {
            this.aClass519_9140.method5963(Class178.animationUnpacker, this.animation, this.anInt_9126 * 799508455, -600917545 * this.anInt_9134, this.animation.anIntArray_10108, 265835734);
         }

         return var2;
      } else {
         return false;
      }
   }

   public final boolean method5887(int var1) {
      return this.aBoolean_9135;
   }

   public final int getFlags(short var1) {
      if(this.method5886(1424153765)) {
         int var2 = 0;
         if(this.method5886(342669186)) {
            var2 |= this.aClass519_9137.anInt_9232 * -19268423;
            if(this.aBoolean_9136 && this.animation.anIntArray_10108 != null) {
               var2 |= -19268423 * this.aClass519_9140.anInt_9232;
            }
         }

         return var2;
      } else {
         return 0;
      }
   }

   public final void animate(int var1, int var2) {
      this.animate(var1, 0, 0, false, (byte)-84);
   }

   public final void method5890(Model var1, int var2, int var3, byte var4) {
      if(this.animation.anIntArray_10120 != null && this.method5886(2036747083)) {
         var1.method2027(this.aClass519_9137.aClass240_Sub22_Sub9_9233, -1426378405 * this.aClass519_9137.anInt_9231, this.aClass519_9137.aClass240_Sub22_Sub9_9234, this.aClass519_9137.anInt_9235 * 63235891, this.anInt_9130 * 808430347, this.animation.anIntArray_10109[799508455 * this.anInt_9126], var2, var3, this.animation.aBoolean_10117, (int[])null);
         if(this.aBoolean_9136 && null != this.animation.anIntArray_10108 && this.aClass519_9140.aBoolean_9230) {
            var1.method2027(this.aClass519_9140.aClass240_Sub22_Sub9_9233, -1426378405 * this.aClass519_9140.anInt_9231, this.aClass519_9140.aClass240_Sub22_Sub9_9234, 63235891 * this.aClass519_9140.anInt_9235, 808430347 * this.anInt_9130, this.animation.anIntArray_10109[799508455 * this.anInt_9126], var2, var3, this.animation.aBoolean_10117, (int[])null);
         }
      }

   }

   public final void animate(int var1, int var2, int var3, boolean var4, byte var5) {
      this.animate(var1, var2, var3, var4, false, (byte)-11);
   }

   public final boolean method5892(int var1, int var2) {
      return null == this.animation | (var1 -= 1006878773 * this.anInt_9131) <= 0?false:this.animation.aBoolean_10121 | this.anInt_9130 * 808430347 + var1 > this.animation.anIntArray_10109[this.anInt_9126 * 799508455];
   }

   final void animate(int var1, int var2, int var3, boolean var4, boolean var5, byte var6) {
      if(var1 != this.getAnimationID(749235430)) {
         if(var1 != -1) {
            if(null != this.animation && this.animation.id * 463366109 == var1) {
               if(this.animation.anInt_10104 * -84331573 == 0) {
                  return;
               }
            } else {
               this.animation = Class178.animationUnpacker.loadAnimation(var1);
            }

            this.anInt_9132 = 0;
            this.anInt_9131 = -2000580067 * var2;
            this.anInt_9139 = var3 * -500732411;
            this.aBoolean_9138 = var5;
            if(var4) {
               this.anInt_9126 = (int)(Math.random() * (double)this.animation.anIntArray_10120.length) * 744266711;
               this.anInt_9130 = (int)(Math.random() * (double)this.animation.anIntArray_10109[this.anInt_9126 * 799508455]) * -880719709;
            } else {
               this.anInt_9126 = 0;
               this.anInt_9130 = 0;
            }

            this.anInt_9134 = 1128562801 * this.anInt_9126 + -1930933785;
            if(this.anInt_9134 * -600917545 < 0 || -600917545 * this.anInt_9134 >= this.animation.anIntArray_10120.length) {
               this.anInt_9134 = 1930933785;
            }

            if(0 == this.anInt_9131 * 1006878773) {
               this.doAnimation(this.animation, this.anInt_9126 * 799508455, -1952767746);
            }

            this.aBoolean_9135 = false;
         } else {
            this.animation = null;
         }

         this.method5895(-1127483121);
      }

   }

   public final void animate(int var1, boolean var2, boolean var3, int var4) {
      this.animate(var1, 0, 0, var2, var3, (byte)-21);
   }

   final void method5895(int var1) {
      this.aClass519_9137.method5964((byte)-28);
      if(this.aBoolean_9136) {
         this.aClass519_9140.method5964((byte)17);
      }

   }

   public final void animate(int var1, int var2, int var3) {
      this.animate(var1, var2, 0, false, (byte)-90);
   }

   public static boolean method5897(int var0, byte var1) {
      return (var0 & -var0) == var0;
   }

   static final void method5898(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class111.method1423((char)var2, 447721568)?1:0;
   }

   public static AbstractMouseHandler addMouseHandlerToComponent(Component var0, boolean var1, int var2) {
      return new MouseHandler(var0, var1);
   }

   static final void method5900(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class240_Sub22_Sub16 var3 = Class525.aClass490_9274.method5748(var2, (byte)95);
      if(var3.anIntArray_3694 == null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anIntArray_3694.length;
      }

   }
}
