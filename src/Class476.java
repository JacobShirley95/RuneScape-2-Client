
public class Class476 {

   char aChar_8737;
   public String aString_8738;
   public int anInt_8739;
   public boolean aBoolean_8740 = true;
   public static Class306 aClass306_8741;


   void method5679(ByteArrayDataNode var1, int var2, int var3) {
      if(var2 == 1) {
         this.aChar_8737 = Class97.method1274(var1.getByte((byte)99), 1997182414);
      } else if(2 == var2) {
         this.anInt_8739 = var1.method4480(1260717178) * -527440581;
      } else if(4 == var2) {
         this.aBoolean_8740 = false;
      } else if(5 == var2) {
         this.aString_8738 = var1.method4485(-904641120);
      }

   }

   void method5680(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(1944534763);
         if(var3 == 0) {
            return;
         }

         this.method5679(var1, var3, 992039230);
      }
   }

   public boolean method5681(int var1) {
      return 115 == this.aChar_8737;
   }

   static void method5682(int var0) {
      if(-815504715 * Class194.anInt_3362 > 0) {
         int var1 = 0;

         for(int var2 = 0; var2 < Class194.consoleStrings.length; ++var2) {
            if(Class194.consoleStrings[var2].indexOf("--> ") != -1) {
               ++var1;
               if(var1 == -815504715 * Class194.anInt_3362) {
                  Class194.aString_3361 = Class194.consoleStrings[var2].substring(Class194.consoleStrings[var2].indexOf(62) + 2);
                  break;
               }
            }
         }
      } else {
         Class194.aString_3361 = "";
      }

   }

   public static int method5683(int var0, int var1, int var2) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return var1 + (var0 & '\uff80');
   }

   public static int compareStrings(CharSequence var0, CharSequence var1, LanguagePack var2, int var3) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      char var8 = 0;
      char var9 = 0;

      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if(var6 - var8 >= var4) {
            return -1;
         }

         if(var7 - var9 >= var5) {
            return 1;
         }

         char var10;
         if(0 != var8) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         char var11;
         if(0 != var9) {
            var11 = var9;
            boolean var16 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         var8 = ChatMessage.method4856(var10, 1555533230);
         var9 = ChatMessage.method4856(var11, -976755713);
         var10 = Class502.method5852(var10, var2, 1011895872);
         var11 = Class502.method5852(var11, var2, -640129624);
         if(var10 != var11 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
            var10 = Character.toLowerCase(var10);
            var11 = Character.toLowerCase(var11);
            if(var11 != var10) {
               return Class66.method674(var10, var2, (byte)85) - Class66.method674(var11, var2, (byte)91);
            }
         }
      }

      int var19 = Math.min(var4, var5);

      char var13;
      int var17;
      for(var17 = 0; var17 < var19; ++var17) {
         if(var2 == LanguagePack.aClass526_9278) {
            var6 = var4 - 1 - var17;
            var7 = var5 - 1 - var17;
         } else {
            var7 = var17;
            var6 = var17;
         }

         char var12 = var0.charAt(var6);
         var13 = var1.charAt(var7);
         if(var13 != var12 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
            var12 = Character.toLowerCase(var12);
            var13 = Character.toLowerCase(var13);
            if(var13 != var12) {
               return Class66.method674(var12, var2, (byte)76) - Class66.method674(var13, var2, (byte)63);
            }
         }
      }

      var17 = var4 - var5;
      if(0 != var17) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var19; ++var18) {
            var13 = var0.charAt(var18);
            char var14 = var1.charAt(var18);
            if(var14 != var13) {
               return Class66.method674(var13, var2, (byte)46) - Class66.method674(var14, var2, (byte)91);
            }
         }

         return 0;
      }
   }

   public static void method5685(int var0) {
      Class411.aClass627_7812.method6669(334899240);
   }
}
