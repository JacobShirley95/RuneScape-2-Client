
public class MapIcon {

   public String iconTitle;
   public int id;
   public boolean aBoolean_9966 = false;
   public int anInt_9967 = 1861772291;
   public int anInt_9968;
   public int anInt_9969 = 1069334425;
   MapIconUnpacker aClass616_9970;
   public byte[] aByteArray_9971;
   public static final int anInt_9972 = 0;
   public static final int anInt_9973 = 1;
   public static final int anInt_9974 = 2;
   public int anInt_9975;
   public int anInt_9976;
   public boolean aBoolean_9977 = true;
   public int anInt_9978;
   public String[] options = new String[5];
   public String optionTitle;
   int anInt_9981 = -1072108285;
   int anInt_9982;
   int anInt_9983;
   NodeArrayList aNodeArrayList_9984;
   int anInt_9985 = -536912351;
   int anInt_9986;
   int anInt_9987;
   int anInt_9988 = -1106996243;
   public int[] anIntArray_9989;
   int anInt_9990 = -134679099;
   public int anInt_9991 = 1743654405;
   public int anInt_9992 = -332193365;
   public int anInt_9993 = Integer.MIN_VALUE;
   public int anInt_9994 = Integer.MIN_VALUE;
   public int anInt_9995;
   public int anInt_9996 = -570363701;
   public int anInt_9997 = 664597687;
   public int anInt_9998 = -1288739;
   int anInt_9999 = 1791826827;
   public int anInt_10000;
   public int[] anIntArray_10001;
   public int anInt_10002 = 0;
   public boolean aBoolean_10003 = true;
   public int anInt_10004 = -346615823;
   public int anInt_10005 = 1439711565;
   static boolean aBoolean_10006;


   void loadIcon(ByteArrayDataNode var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt_9969 = var1.method4493(-157074556) * -1069334425;
      } else if(2 == var2) {
         this.anInt_9967 = var1.method4493(-157074556) * -1861772291;
      } else if(var2 == 3) {
         this.iconTitle = var1.method4485(-1142729587);
      } else if(4 == var2) {
         this.anInt_9968 = var1.method4479(738776218) * -128550763;
      } else if(5 == var2) {
         this.anInt_10005 = var1.method4479(738776218) * -1439711565;
      } else if(var2 == 6) {
         this.anInt_10002 = var1.readByte(-753617425) * -1090142505;
      } else {
         int var4;
         if(7 == var2) {
            var4 = var1.readByte(-438684345);
            if(0 == (var4 & 1)) {
               this.aBoolean_9977 = false;
            }

            if(2 == (var4 & 2)) {
               this.aBoolean_9966 = true;
            }
         } else if(8 == var2) {
            var1.readByte(-911428247);
         } else if(var2 == 9) {
            this.anInt_9999 = var1.readShort(120165473) * -1791826827;
            if(1531497437 * this.anInt_9999 == '\uffff') {
               this.anInt_9999 = 1791826827;
            }

            this.anInt_9985 = var1.readShort(-625634143) * 536912351;
            if('\uffff' == 1635539487 * this.anInt_9985) {
               this.anInt_9985 = -536912351;
            }

            this.anInt_9982 = var1.method4480(1260717178) * 152858297;
            this.anInt_9983 = var1.method4480(1260717178) * 1435066845;
         } else if(var2 >= 10 && var2 <= 14) {
            this.options[var2 - 10] = var1.method4485(-856004475);
         } else {
            int var5;
            if(15 == var2) {
               var4 = var1.readByte(-824347839);
               this.anIntArray_9989 = new int[2 * var4];

               for(var5 = 0; var5 < var4 * 2; ++var5) {
                  this.anIntArray_9989[var5] = var1.method4478((byte)1);
               }

               this.anInt_9995 = var1.method4480(1260717178) * 1474812445;
               var5 = var1.readByte(1975245377);
               this.anIntArray_10001 = new int[var5];

               int var6;
               for(var6 = 0; var6 < this.anIntArray_10001.length; ++var6) {
                  this.anIntArray_10001[var6] = var1.method4480(1260717178);
               }

               this.aByteArray_9971 = new byte[var4];

               for(var6 = 0; var6 < var4; ++var6) {
                  this.aByteArray_9971[var6] = var1.getByte((byte)84);
               }
            } else if(16 == var2) {
               this.aBoolean_10003 = false;
            } else if(var2 == 17) {
               this.optionTitle = var1.method4485(-1755479307);
            } else if(var2 == 18) {
               this.anInt_9981 = var1.method4493(-157074556) * 1072108285;
            } else if(var2 == 19) {
               this.anInt_10004 = var1.readShort(-282696963) * 346615823;
            } else if(20 == var2) {
               this.anInt_9988 = var1.readShort(1468474268) * 1106996243;
               if(743783963 * this.anInt_9988 == '\uffff') {
                  this.anInt_9988 = -1106996243;
               }

               this.anInt_9990 = var1.readShort(397703838) * 134679099;
               if(this.anInt_9990 * 571817715 == '\uffff') {
                  this.anInt_9990 = -134679099;
               }

               this.anInt_9986 = var1.method4480(1260717178) * 1034715077;
               this.anInt_9987 = var1.method4480(1260717178) * 805482575;
            } else if(var2 == 21) {
               this.anInt_9976 = var1.method4480(1260717178) * 560198159;
            } else if(var2 == 22) {
               this.anInt_9975 = var1.method4480(1260717178) * 830012437;
            } else if(var2 == 23) {
               this.anInt_9996 = var1.readByte(225440255) * 570363701;
               this.anInt_9997 = var1.readByte(-29412020) * -664597687;
               this.anInt_9998 = var1.readByte(-578926596) * 1288739;
            } else if(24 == var2) {
               this.anInt_9978 = var1.method4478((byte)1) * 858043957;
               this.anInt_10000 = var1.method4478((byte)1) * -489997543;
            } else if(var2 == 249) {
               var4 = var1.readByte(1402231192);
               if(this.aNodeArrayList_9984 == null) {
                  var5 = Class105.method1359(var4, (byte)125);
                  this.aNodeArrayList_9984 = new NodeArrayList(var5);
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  boolean var9 = var1.readByte(-1041997240) == 1;
                  int var7 = var1.method4479(738776218);
                  Object var8;
                  if(var9) {
                     var8 = new Class240_Sub9(var1.method4485(-619950298));
                  } else {
                     var8 = new IndexNode(var1.method4480(1260717178));
                  }

                  this.aNodeArrayList_9984.insert((NodeListNode)var8, (long)var7);
               }
            }
         }
      }

   }

   void method6593(int var1) {
      if(this.anIntArray_9989 != null) {
         for(int var2 = 0; var2 < this.anIntArray_9989.length; var2 += 2) {
            if(this.anIntArray_9989[var2] < -1001950925 * this.anInt_9991) {
               this.anInt_9991 = 403829243 * this.anIntArray_9989[var2];
            } else if(this.anIntArray_9989[var2] > this.anInt_9993 * 189282879) {
               this.anInt_9993 = -1265453633 * this.anIntArray_9989[var2];
            }

            if(this.anIntArray_9989[1 + var2] < -12505347 * this.anInt_9992) {
               this.anInt_9992 = this.anIntArray_9989[var2 + 1] * -1815290283;
            } else if(this.anIntArray_9989[1 + var2] > this.anInt_9994 * -250973399) {
               this.anInt_9994 = this.anIntArray_9989[var2 + 1] * -401221351;
            }
         }
      }

   }

   public boolean method6594(Class185 var1, Class184 var2, int var3) {
      int var5;
      if(-1 != this.anInt_9985 * 1635539487) {
         Class187 var4 = var1.method2281(Class283.aClass283_4785, this.anInt_9985 * 1635539487, -2121942494);
         var5 = var2.method2269(var4, -390483690);
      } else {
         if(this.anInt_9999 * 1531497437 == -1) {
            return true;
         }

         Class416 var7 = var1.method2280(1531497437 * this.anInt_9999, (byte)-57);
         var5 = var2.method2268(var7, -1971289679);
      }

      if(var5 >= -327731319 * this.anInt_9982 && var5 <= -1069416843 * this.anInt_9983) {
         boolean var8 = false;
         int var9;
         if(-1 != this.anInt_9990 * 571817715) {
            Class187 var6 = var1.method2281(Class283.aClass283_4785, this.anInt_9990 * 571817715, -1804555097);
            var9 = var2.method2269(var6, -390483690);
         } else {
            if(743783963 * this.anInt_9988 == -1) {
               return true;
            }

            Class416 var10 = var1.method2280(743783963 * this.anInt_9988, (byte)-62);
            var9 = var2.method2268(var10, 1128300770);
         }

         return var9 >= 630499085 * this.anInt_9986 && var9 <= this.anInt_9987 * 1358325423;
      } else {
         return false;
      }
   }

   public Sprite method6595(Renderer var1, int var2) {
      Sprite var3 = (Sprite)this.aClass616_9970.aClass627_10012.getObject((long)(this.anInt_9981 * -1215489451 | 131072 | -1555911463 * var1.rendererID << 29));
      if(null != var3) {
         return var3;
      } else {
         this.aClass616_9970.aCacheUnpacker_10010.hasData(this.anInt_9981 * -1215489451, -320050159);
         AbstractImageData var4 = ImageUtils.getImageData(this.aClass616_9970.aCacheUnpacker_10010, this.anInt_9981 * -1215489451, 0);
         if(null != var4) {
            var3 = var1.loadSprite(var4, true);
            this.aClass616_9970.aClass627_10012.insert(var3, (long)(this.anInt_9981 * -1215489451 | 131072 | -1555911463 * var1.rendererID << 29));
         }

         return var3;
      }
   }

   public int method6596(int var1, int var2, byte var3) {
      if(this.aNodeArrayList_9984 == null) {
         return var2;
      } else {
         IndexNode var4 = (IndexNode)this.aNodeArrayList_9984.getNode((long)var1);
         return null == var4?var2:523939595 * var4.cacheID;
      }
   }

   public Sprite method6597(Renderer var1, boolean var2, int var3) {
      int var4 = var2?this.anInt_9967 * -135554731:1517017943 * this.anInt_9969;
      int var5 = var4 | var1.rendererID * -1555911463 << 29;
      Sprite var6 = (Sprite)this.aClass616_9970.aClass627_10012.getObject((long)var5);
      if(var6 != null) {
         return var6;
      } else if(!this.aClass616_9970.aCacheUnpacker_10010.hasData(var4, 1687076048)) {
         return null;
      } else {
         AbstractImageData var7 = ImageUtils.getImageData(this.aClass616_9970.aCacheUnpacker_10010, var4, 0);
         if(null != var7) {
            var6 = var1.loadSprite(var7, true);
            this.aClass616_9970.aClass627_10012.insert(var6, (long)var5);
         }

         return var6;
      }
   }

   public String method6598(int var1, String var2, int var3) {
      if(null == this.aNodeArrayList_9984) {
         return var2;
      } else {
         Class240_Sub9 var4 = (Class240_Sub9)this.aNodeArrayList_9984.getNode((long)var1);
         return var4 == null?var2:(String)var4.anObject_6783;
      }
   }

   void method6599(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(661678356);
         if(0 == var3) {
            return;
         }

         this.loadIcon(var1, var3, 794004223);
      }
   }

   public static final void method6600(String var0, int var1) {
      if(!var0.equals("")) {
         ConnectionHandler var2 = Class32.method230(-2059502820);
         Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6241, var2.aClass528_3433, 1917447504);
         var3.aClass240_Sub8_Sub1_7370.putByte(Class258.method3383(var0, -736837438), 2129278115);
         var3.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-70);
         var2.addPacket(var3, 1819074055);
      }
   }
}
