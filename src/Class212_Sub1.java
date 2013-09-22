
public abstract class Class212_Sub1 extends Class212 implements Class355 {

   protected final Class283 aClass283_8532;


   Class212_Sub1(GamePack var1, Class283 var2, LanguagePack var3, int var4) {
      super(var1, var3, var4);
      this.aClass283_8532 = var2;
   }

   public int method5497(int var1) {
      return this.anInt_3672 * 1956098531;
   }

   public Class340 method5498(ByteArrayDataNode var1, Class282 var2, int var3) {
      int var4 = var1.readShort(-350611567);
      Class340 var5 = new Class340(var4);
      Class var6 = var2.aClass_4774;
      if(Integer.class == var6) {
         var5.anObject_6535 = Integer.valueOf(var1.method4480(1260717178));
      } else if(Long.class == var6) {
         var5.anObject_6535 = Long.valueOf(var1.method4538(1385013726));
      } else if(var6 == String.class) {
         var5.anObject_6535 = var1.readString(1841936278);
      } else {
         if(!Class444.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            Class444 var7 = (Class444)var6.newInstance();
            var7.method5483(var1, (byte)46);
            var5.anObject_6535 = var7;
         } catch (InstantiationException var8) {
            ;
         } catch (IllegalAccessException var9) {
            ;
         }
      }

      Class187 var10 = this.method5503(var4, 824148490);
      return var10.method2291((short)16383) && var10.aClass373_3197.method4745(1290182620) == var2?var5:null;
   }

   public int method5499(Class340 var1, int var2) {
      byte var3 = 2;
      int var4;
      if(var1.anObject_6535 instanceof Integer) {
         var4 = var3 + 4;
      } else if(var1.anObject_6535 instanceof Long) {
         var4 = var3 + 8;
      } else if(var1.anObject_6535 instanceof String) {
         var4 = var3 + Class433.method5416((String)var1.anObject_6535, 119419778);
      } else {
         if(!(var1.anObject_6535 instanceof Class444)) {
            throw new IllegalStateException();
         }

         var4 = var3 + ((Class444)var1.anObject_6535).method5485(-1418686641);
      }

      return var4;
   }

   public void method5500(ByteArrayDataNode var1, Class340 var2, int var3) {
      var1.method4463(var2.anInt_6534 * -488503965, 1766674910);
      if(var2.anObject_6535 instanceof Integer) {
         var1.putIntBE(((Integer)var2.anObject_6535).intValue(), 2062892803);
      } else if(var2.anObject_6535 instanceof Long) {
         var1.putLong(((Long)var2.anObject_6535).longValue());
      } else if(var2.anObject_6535 instanceof String) {
         var1.method4535((String)var2.anObject_6535, -1952053789);
      } else {
         if(!(var2.anObject_6535 instanceof Class444)) {
            throw new IllegalStateException();
         }

         ((Class444)var2.anObject_6535).method5484(var1, 1089362563);
      }

   }

   public Class340 method5501(ByteArrayDataNode var1, int var2) {
      int var3 = var1.readShort(1867561776);
      Class187 var4 = this.method5503(var3, 824148490);
      if(!var4.method2291((short)11381)) {
         throw new IllegalStateException("");
      } else {
         Class340 var5 = new Class340(var3);
         Class var6 = var4.aClass373_3197.method4745(1290182620).aClass_4774;
         if(var6 == Integer.class) {
            var5.anObject_6535 = Integer.valueOf(var1.method4480(1260717178));
         } else if(Long.class == var6) {
            var5.anObject_6535 = Long.valueOf(var1.method4538(1385013726));
         } else if(var6 == String.class) {
            var5.anObject_6535 = var1.readString(1841936278);
         } else {
            if(!Class444.class.isAssignableFrom(var6)) {
               throw new IllegalStateException();
            }

            try {
               Class444 var7 = (Class444)var6.newInstance();
               var7.method5483(var1, (byte)57);
               var5.anObject_6535 = var7;
            } catch (InstantiationException var8) {
               ;
            } catch (IllegalAccessException var9) {
               ;
            }
         }

         return var5;
      }
   }

   public Object method4452(int var1, int var2) {
      Class187 var3 = this.method5503(var1, 824148490);
      return var3 != null && var3.method2291((short)16668)?var3.method2292(826064922):null;
   }

   public abstract Class187 method5503(int var1, int var2);

   static final void method5504(RSInterface var0, int var1) {
      if(691513007 * var0.type == -1030308107 * RSInterface.anInt_2586) {
         if(null == Class521.myPlayer.playerName) {
            var0.anInt_2416 = 0;
            var0.anInt_2426 = 0;
            return;
         }

         var0.anInt_2475 = -1833726210;
         var0.anInt_2476 = ((int)(Math.sin((double)(client.timer * -1025618511) / 40.0D) * 256.0D) & 2047) * 180492143;
         var0.anInt_2469 = -522394205;
         var0.anInt_2416 = client.anInt_438 * 318893009;
         var0.anInt_2426 = Class370.method4696(Class521.myPlayer.playerName, (byte)23) * -1272623937;
         StanceAnimation var2 = Class521.myPlayer.stance;
         if(var2 != null) {
            if(null == var0.aClass507_2578) {
               var0.aClass507_2578 = new Class507_Sub3();
            }

            var0.currentAnimation = var2.getAnimationID(-821785407) * 128423169;
            var0.aClass507_2578.set(var2, 742780248);
         } else {
            var0.aClass507_2578 = null;
         }
      }

   }

   public static void method5505(int var0, int var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(6, (long)var0);
      var2.method597((byte)0);
   }

   public static void method5506(int var0, int var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(9, (long)var0);
      var2.method597((byte)0);
   }
}
