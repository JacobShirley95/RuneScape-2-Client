
public class DamageSprite {

   int anInt_9915 = -959306275;
   static final int anInt_9916 = 70;
   public static final int anInt_9917 = 0;
   public static final int anInt_9918 = 1;
   static final int anInt_9919 = 16777215;
   public int anInt_9920 = 0;
   public boolean aBoolean_9921 = false;
   public int anInt_9922 = 0;
   public int anInt_9923 = 2102527633;
   public int duration = -1915919310;
   int anInt_9925 = -2069294503;
   int anInt_9926 = -320490969;
   public int anInt_9927 = -1422213569;
   int anInt_9928 = -974466697;
   String aString_9929 = "";
   public int anInt_9930 = 0;
   public int anInt_9931 = -1322308885;
   DamageAnimeLoader aClass624_9932;
   public int anInt_9933 = -532501033;
   public static final int anInt_9934 = -1;


   public Sprite method6521(Renderer var1, byte var2) {
      if(1964698135 * this.anInt_9925 < 0) {
         return null;
      } else {
         Sprite var3 = (Sprite)this.aClass624_9932.aClass627_10040.getObject((long)(this.anInt_9925 * 1964698135));
         if(var3 == null) {
            this.method6525(var1, -1587250202);
            var3 = (Sprite)this.aClass624_9932.aClass627_10040.getObject((long)(1964698135 * this.anInt_9925));
         }

         return var3;
      }
   }

   void method6522(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(-1000411964);
         if(0 == var3) {
            return;
         }

         this.method6527(var1, var3, (short)7510);
      }
   }

   public Sprite method6523(Renderer var1, byte var2) {
      if(1922475403 * this.anInt_9915 < 0) {
         return null;
      } else {
         Sprite var3 = (Sprite)this.aClass624_9932.aClass627_10040.getObject((long)(this.anInt_9915 * 1922475403));
         if(null == var3) {
            this.method6525(var1, -1504070206);
            var3 = (Sprite)this.aClass624_9932.aClass627_10040.getObject((long)(this.anInt_9915 * 1922475403));
         }

         return var3;
      }
   }

   public Sprite method6524(Renderer var1, byte var2) {
      if(890331753 * this.anInt_9926 < 0) {
         return null;
      } else {
         Sprite var3 = (Sprite)this.aClass624_9932.aClass627_10040.getObject((long)(this.anInt_9926 * 890331753));
         if(null == var3) {
            this.method6525(var1, -1465110631);
            var3 = (Sprite)this.aClass624_9932.aClass627_10040.getObject((long)(this.anInt_9926 * 890331753));
         }

         return var3;
      }
   }

   void method6525(Renderer var1, int var2) {
      CacheDataUnpacker var3 = this.aClass624_9932.aCacheUnpacker_10041;
      AbstractImageData var4;
      if(1964698135 * this.anInt_9925 >= 0 && this.aClass624_9932.aClass627_10040.getObject((long)(1964698135 * this.anInt_9925)) == null && var3.hasData(1964698135 * this.anInt_9925, 1176739224)) {
         var4 = ImageUtils.method1794(var3, this.anInt_9925 * 1964698135);
         this.aClass624_9932.aClass627_10040.insert(var1.loadSprite(var4, true), (long)(this.anInt_9925 * 1964698135));
      }

      if(this.anInt_9926 * 890331753 >= 0 && this.aClass624_9932.aClass627_10040.getObject((long)(890331753 * this.anInt_9926)) == null && var3.hasData(this.anInt_9926 * 890331753, 306981157)) {
         var4 = ImageUtils.method1794(var3, this.anInt_9926 * 890331753);
         this.aClass624_9932.aClass627_10040.insert(var1.loadSprite(var4, true), (long)(890331753 * this.anInt_9926));
      }

      if(this.anInt_9915 * 1922475403 >= 0 && this.aClass624_9932.aClass627_10040.getObject((long)(this.anInt_9915 * 1922475403)) == null && var3.hasData(this.anInt_9915 * 1922475403, -40623277)) {
         var4 = ImageUtils.method1794(var3, 1922475403 * this.anInt_9915);
         this.aClass624_9932.aClass627_10040.insert(var1.loadSprite(var4, true), (long)(this.anInt_9915 * 1922475403));
      }

      if(this.anInt_9928 * -1524193351 >= 0 && this.aClass624_9932.aClass627_10040.getObject((long)(this.anInt_9928 * -1524193351)) == null && var3.hasData(this.anInt_9928 * -1524193351, -1006167485)) {
         var4 = ImageUtils.method1794(var3, this.anInt_9928 * -1524193351);
         this.aClass624_9932.aClass627_10040.insert(var1.loadSprite(var4, true), (long)(this.anInt_9928 * -1524193351));
      }

   }

   public String method6526(int var1, int var2) {
      String var3 = this.aString_9929;

      while(true) {
         int var4 = var3.indexOf("%1");
         if(var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + Class298.method3804(var1, false, (byte)78) + var3.substring(var4 + 2);
      }
   }

   void method6527(ByteArrayDataNode var1, int var2, short var3) {
      if(var2 == 1) {
         this.anInt_9931 = var1.method4493(-157074556) * 1322308885;
      } else if(var2 == 2) {
         this.anInt_9923 = var1.method4479(738776218) * -240256657;
         this.aBoolean_9921 = true;
      } else if(3 == var2) {
         this.anInt_9925 = var1.method4493(-157074556) * 2069294503;
      } else if(4 == var2) {
         this.anInt_9915 = var1.method4493(-157074556) * 959306275;
      } else if(var2 == 5) {
         this.anInt_9926 = var1.method4493(-157074556) * 320490969;
      } else if(var2 == 6) {
         this.anInt_9928 = var1.method4493(-157074556) * 974466697;
      } else if(7 == var2) {
         this.anInt_9922 = var1.method4478((byte)1) * -1162880733;
      } else if(var2 == 8) {
         this.aString_9929 = var1.readString(1841936278);
      } else if(var2 == 9) {
         this.duration = var1.readShort(2095380888) * -1254503789;
      } else if(10 == var2) {
         this.anInt_9930 = var1.method4478((byte)1) * -1267332271;
      } else if(11 == var2) {
         this.anInt_9927 = 0;
      } else if(12 == var2) {
         this.anInt_9933 = var1.readByte(1504069639) * 532501033;
      } else if(13 == var2) {
         this.anInt_9920 = var1.method4478((byte)1) * -1498387485;
      } else if(14 == var2) {
         this.anInt_9927 = var1.readShort(-1141673479) * 1422213569;
      }

   }

   public Sprite method6528(Renderer var1, byte var2) {
      if(this.anInt_9928 * -1524193351 < 0) {
         return null;
      } else {
         Sprite var3 = (Sprite)this.aClass624_9932.aClass627_10040.getObject((long)(this.anInt_9928 * -1524193351));
         if(null == var3) {
            this.method6525(var1, -1947084021);
            var3 = (Sprite)this.aClass624_9932.aClass627_10040.getObject((long)(-1524193351 * this.anInt_9928));
         }

         return var3;
      }
   }

   static final void method6529(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class431.method5396(var3, var4, var0, -1537793043);
   }

   static RSFont method6530(byte var0) {
      RSFont var1;
      if(Class18.aBoolean_172) {
         if(Class18.aTextRenderer_173 != null && Class433.aRSFont_8344 != null) {
            var1 = Class433.aRSFont_8344;
         } else {
            var1 = Class1.aRSFont_11;
         }
      } else {
         var1 = Class1.aRSFont_11;
      }

      Class18.anInt_144 = 1787743737 * var1.anInt_8573 + 1105385837 * var1.anInt_8571;
      return var1;
   }

   static final void method6531(int var0) {
      Class110_Sub1.method3149(client.aClass132_523, 1445107216);
      GameType.anInt_9191 += 556935303;
      if(client.aBoolean_582 && client.aBoolean_484) {
         int var1 = Class53.captureMouseList.getCaptureMouseX();
         int var2 = Class53.captureMouseList.getCaptureMouseY();
         var1 -= 2142788233 * client.anInt_481;
         var2 -= client.anInt_287 * -1094686129;
         if(var1 < 1573328167 * client.anInt_485) {
            var1 = 1573328167 * client.anInt_485;
         }

         if(var1 + -533669195 * client.aClass132_523.width > client.anInt_487 * 519726181 + 1573328167 * client.anInt_485) {
            var1 = client.anInt_485 * 1573328167 + client.anInt_487 * 519726181 - client.aClass132_523.width * -533669195;
         }

         if(var2 < client.anInt_486 * -794559981) {
            var2 = client.anInt_486 * -794559981;
         }

         if(client.aClass132_523.height * 1833812087 + var2 > 1105352345 * client.anInt_456 + -794559981 * client.anInt_486) {
            var2 = client.anInt_456 * 1105352345 + -794559981 * client.anInt_486 - client.aClass132_523.height * 1833812087;
         }

         int var3;
         int var4;
         if(Class107.aClass132_1992 == client.aClass132_426) {
            var3 = var1;
            var4 = var2;
         } else {
            var3 = var1 - 1573328167 * client.anInt_485 + client.aClass132_426.scrollX * -340277309;
            var4 = client.aClass132_426.scrollY * -978526293 + (var2 - client.anInt_486 * -794559981);
         }

         Class240_Sub17 var5;
         if(!Class53.captureMouseList.method3102(-1964212538)) {
            if(client.aBoolean_553) {
               Class537.method6073(-1073082706);
               if(null != client.aClass132_523.anObjectArray_2570) {
                  var5 = new Class240_Sub17();
                  var5.aClass132_6903 = client.aClass132_523;
                  var5.anInt_6904 = var3 * -135352163;
                  var5.anInt_6905 = var4 * -1157510991;
                  var5.aClass132_6909 = client.aClass132_455;
                  var5.anObjectArray_6907 = client.aClass132_523.anObjectArray_2570;
                  Class411.method5074(var5, (byte)1);
               }

               if(null != client.aClass132_455 && client.method175(client.aClass132_523) != null) {
                  Class601.method6497(client.aClass132_523, client.aClass132_455, -1936813758);
               }
            } else if((1 == client.anInt_458 * 555842189 || Class48.method490((byte)-97)) && Class18.optionCount * -740020991 > 2) {
               CacheDataUnpacker.method3595(-1547513587 * client.gameIntX + 2142788233 * client.anInt_481, client.anInt_287 * -1094686129 + client.gameIntY * -1846095793, (short)128);
            } else if(Class204.method2602(-561256587)) {
               CacheDataUnpacker.method3595(client.gameIntX * -1547513587 + 2142788233 * client.anInt_481, -1846095793 * client.gameIntY + client.anInt_287 * -1094686129, (short)128);
            }

            client.aClass132_523 = null;
            client.aClass132_426 = null;
         } else {
            if(-1781654217 * GameType.anInt_9191 > -364635145 * client.aClass132_523.anInt_2521) {
               int var7 = var1 - -1547513587 * client.gameIntX;
               int var6 = var2 - -1846095793 * client.gameIntY;
               if(var7 > 1772117997 * client.aClass132_523.anInt_2520 || var7 < -(1772117997 * client.aClass132_523.anInt_2520) || var6 > 1772117997 * client.aClass132_523.anInt_2520 || var6 < -(client.aClass132_523.anInt_2520 * 1772117997)) {
                  client.aBoolean_553 = true;
               }
            }

            if(null != client.aClass132_523.anObjectArray_2593 && client.aBoolean_553) {
               var5 = new Class240_Sub17();
               var5.aClass132_6903 = client.aClass132_523;
               var5.anInt_6904 = var3 * -135352163;
               var5.anInt_6905 = -1157510991 * var4;
               var5.anObjectArray_6907 = client.aClass132_523.anObjectArray_2593;
               Class411.method5074(var5, (byte)1);
            }
         }

      } else {
         if(-1781654217 * GameType.anInt_9191 > 1) {
            client.aClass132_523 = null;
            client.aClass132_426 = null;
         }

      }
   }

   static final int method6532(int var0, int var1, int var2, int var3, int var4) {
      int var5 = 65536 - Class362.sinArray[8192 * var2 / var3] >> 1;
      return (var5 * var1 >> 16) + ((65536 - var5) * var0 >> 16);
   }

   static final void method6533(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= 754826261;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      int var5 = var0.intTypes[-831324111 * var0.intTypeIndex + 3];
      int var6 = var0.intTypes[4 + var0.intTypeIndex * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 + (var6 - var4) * (var3 - var2) / (var5 - var4);
   }

   static int method6534(OptionListNode var0, RSFont var1, byte var2) {
      String var3 = Class481.getOptionString(var0, 1349736833);
      int[] var4 = Class421.method5267(var0, (byte)30);
      if(var4 != null) {
         var3 = var3 + Class5.method28(var4, 1564452917);
      }

      int var5 = var1.getStringWidth(var3, Class20.imgNameIcons, -733469538);
      if(var0.aBoolean_952) {
         var5 += Class530.otherLeveLSprite.getWidth() + 4;
      }

      return var5;
   }
}
