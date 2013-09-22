import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;

public abstract class Class254 {

   Class240_Sub4_Sub4 aClass240_Sub4_Sub4_4387;
   final byte[] aByteArray_4388;
   boolean aBoolean_4389;
   static final int anInt_4390 = 50;
   final OggPacket anOggPacket_4391;
   final OggSyncState anOggSyncState_4392;
   final NodeArrayList aNodeArrayList_4393;
   boolean aBoolean_4394;
   static final int anInt_4395 = 10;
   boolean aBoolean_4396;
   boolean aBoolean_4397;
   Class240_Sub4_Sub3 aClass240_Sub4_Sub3_4398;
   Class240_Sub4_Sub1 aClass240_Sub4_Sub1_4399;
   String aString_4400;
   final OggPage anOggPage_4401;
   static WorldMapText aClass198_4402;
   public static Sprite aSprite_4403;


   abstract int method3320(byte[] var1, int var2) throws IOException;

   Class240_Sub4 method3321(byte var1) throws IOException {
      if(this.aBoolean_4389) {
         throw new IllegalStateException();
      } else if(this.aBoolean_4396) {
         return null;
      } else {
         int var2;
         while(this.anOggSyncState_4392.pageOut(this.anOggPage_4401) <= 0) {
            var2 = this.method3320(this.aByteArray_4388, -1376591415);
            if(var2 == -1) {
               this.aBoolean_4396 = true;
               return null;
            }

            if(0 == var2) {
               return null;
            }

            if(!this.anOggSyncState_4392.write(this.aByteArray_4388, var2)) {
               throw new RuntimeException("");
            }
         }

         var2 = this.anOggPage_4401.getSerialNumber();
         if(!this.anOggPage_4401.isBOS()) {
            Class240_Sub4 var8 = (Class240_Sub4)this.aNodeArrayList_4393.getNode((long)var2);
            if(!var8.anOggStreamState_6751.pageIn(this.anOggPage_4401)) {
               throw new IllegalStateException();
            } else {
               return var8;
            }
         } else {
            OggStreamState var3 = new OggStreamState(var2);
            if(!var3.pageIn(this.anOggPage_4401)) {
               throw new IllegalStateException();
            } else if(var3.packetPeek(this.anOggPacket_4391) != 1) {
               throw new IllegalStateException();
            } else {
               Object var4;
               if(null == this.aClass240_Sub4_Sub4_4387 && this.anOggPacket_4391.isTheora()) {
                  this.aClass240_Sub4_Sub4_4387 = new Class240_Sub4_Sub4(var3);
                  var4 = this.aClass240_Sub4_Sub4_4387;
               } else if(this.aClass240_Sub4_Sub3_4398 == null && this.anOggPacket_4391.isVorbis()) {
                  this.aClass240_Sub4_Sub3_4398 = new Class240_Sub4_Sub3(var3);
                  var4 = this.aClass240_Sub4_Sub3_4398;
               } else {
                  byte[] var5 = this.anOggPacket_4391.getData();
                  StringBuilder var6 = new StringBuilder();

                  for(int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char)var5[var7]); ++var7) {
                     var6.append((char)var5[var7]);
                  }

                  String var9 = var6.toString();
                  if(var9.equals("kate")) {
                     var4 = new Class240_Sub4_Sub1(var3);
                  } else {
                     var4 = new Class240_Sub4_Sub2(var3);
                  }
               }

               this.aNodeArrayList_4393.insert((NodeListNode)var4, (long)var2);
               return (Class240_Sub4)var4;
            }
         }
      }
   }

   public void method3322(int var1) throws IOException {
      if(!this.aBoolean_4397) {
         for(; !this.aBoolean_4389; this.aBoolean_4394 = false) {
            Class240_Sub4 var2;
            if(!this.aBoolean_4394) {
               var2 = this.method3321((byte)-113);
               if(var2 == null) {
                  if(this.aBoolean_4396) {
                     this.method3325(-1068816526);
                  }

                  return;
               }

               if(var2 == null) {
                  throw new IllegalStateException();
               }

               this.aBoolean_4394 = true;
            } else {
               var2 = (Class240_Sub4)this.aNodeArrayList_4393.getNode((long)this.anOggPage_4401.getSerialNumber());
            }

            if(var2 == this.aClass240_Sub4_Sub3_4398) {
               if(this.aClass240_Sub4_Sub3_4398.method2556(2010142290) >= 50) {
                  return;
               }

               while(this.aClass240_Sub4_Sub3_4398.anOggStreamState_6751.packetOut(this.anOggPacket_4391) == 1) {
                  this.aClass240_Sub4_Sub3_4398.method4433(this.anOggPacket_4391, 223034769);
                  this.method3323((byte)69);
                  if(this.aClass240_Sub4_Sub4_4387 != null) {
                     double var3 = this.aClass240_Sub4_Sub4_4387.method2671(-708028207);

                     for(int var5 = 0; var5 < 10 && this.method3334(1533231300); ++var5) {
                        this.method3332((byte)0);
                        if(this.aBoolean_4389) {
                           return;
                        }
                     }

                     if(var3 < this.aClass240_Sub4_Sub4_4387.method2671(-708028207)) {
                        return;
                     }
                  }

                  if(this.aClass240_Sub4_Sub3_4398.method2556(-486234841) >= 50) {
                     return;
                  }
               }
            } else if(var2 instanceof Class240_Sub4_Sub1) {
               this.method3323((byte)-22);
            } else if(this.aClass240_Sub4_Sub4_4387 != var2) {
               for(; var2.anOggStreamState_6751.packetOut(this.anOggPacket_4391) == 1; var2.method4433(this.anOggPacket_4391, 177689092)) {
                  if(1 == var2.anInt_6750 * -992639099 && var2 instanceof Class240_Sub4_Sub1) {
                     this.method3330(this.aString_4400, -1082124493);
                  }
               }
            } else if(null == this.aClass240_Sub4_Sub3_4398 && !this.aBoolean_4397) {
               for(int var6 = 0; var6 < 10 && this.method3334(1605680835); ++var6) {
                  this.method3332((byte)0);
                  if(this.aBoolean_4389) {
                     return;
                  }
               }

               return;
            }
         }

      }
   }

   void method3323(byte var1) {
      for(Class240_Sub4 var2 = (Class240_Sub4)this.aNodeArrayList_4393.start(); var2 != null; var2 = (Class240_Sub4)this.aNodeArrayList_4393.next()) {
         if(var2 instanceof Class240_Sub4_Sub1) {
            Class240_Sub4_Sub1 var3 = (Class240_Sub4_Sub1)var2;

            while((var3.anInt_6750 * -992639099 <= 8 || this.method3331(972312096) > (double)var3.method281((byte)-59)) && var3.anOggStreamState_6751.packetOut(this.anOggPacket_4391) == 1) {
               var3.method4433(this.anOggPacket_4391, 1659454116);
            }
         }
      }

      this.method3330(this.aString_4400, 1534926240);
   }

   public void method3324(boolean var1, int var2) {
      if(null != this.aClass240_Sub4_Sub3_4398) {
         Class240_Sub41_Sub1 var3 = this.aClass240_Sub4_Sub3_4398.method2558(1097409395);
         if(var3 != null) {
            var3.method422(var1, -301925356);
         }
      }

      this.aBoolean_4397 = !this.aBoolean_4397;
   }

   void method3325(int var1) {
      for(Class240_Sub4 var2 = (Class240_Sub4)this.aNodeArrayList_4393.start(); var2 != null; var2 = (Class240_Sub4)this.aNodeArrayList_4393.next()) {
         if(this.aClass240_Sub4_Sub4_4387 != var2) {
            while(var2.anOggStreamState_6751.packetOut() == 1) {
               var2.method4433(this.anOggPacket_4391, -225356147);
            }
         }
      }

      if(null != this.aClass240_Sub4_Sub4_4387) {
         for(int var3 = 0; var3 < 10 && this.method3334(-419100924); ++var3) {
            if(this.aClass240_Sub4_Sub4_4387.anOggStreamState_6751.packetOut() != 1) {
               this.method3326(2108484177);
               return;
            }

            this.aClass240_Sub4_Sub4_4387.method4433(this.anOggPacket_4391, 1004809672);
         }

      }
   }

   public void method3326(int var1) {
      if(!this.aBoolean_4389) {
         for(Class240_Sub4 var2 = (Class240_Sub4)this.aNodeArrayList_4393.start(); var2 != null; var2 = (Class240_Sub4)this.aNodeArrayList_4393.next()) {
            var2.method4435(-725044714);
            var2.anOggStreamState_6751.method5440();
         }

         this.anOggPacket_4391.method5440();
         this.anOggPage_4401.method5440();
         this.anOggSyncState_4392.method5440();
         this.aBoolean_4389 = true;
      }
   }

   public Class240_Sub4_Sub4 method3327(int var1) {
      return this.aClass240_Sub4_Sub4_4387;
   }

   Class254(int var1) {
      try {
         Class183.getLibLoader(1975971811).loadLib("jagtheora", (byte)75);
      } catch (Exception_Sub5 var3) {
         throw new RuntimeException("", var3);
      }

      this.aByteArray_4388 = new byte[var1];
      this.anOggSyncState_4392 = new OggSyncState();
      this.anOggPage_4401 = new OggPage();
      this.anOggPacket_4391 = new OggPacket();
      this.aNodeArrayList_4393 = new NodeArrayList(8);
   }

   public Class240_Sub4_Sub1 method3328(int var1) {
      return this.aClass240_Sub4_Sub1_4399;
   }

   public boolean method3329(byte var1) {
      return !this.aBoolean_4389 && !this.aBoolean_4396?false:null == this.aClass240_Sub4_Sub3_4398 || this.aClass240_Sub4_Sub3_4398.method2556(2057827508) <= 0;
   }

   public void method3330(String var1, int var2) {
      this.aString_4400 = var1;
      if(null == this.aString_4400) {
         this.aClass240_Sub4_Sub1_4399 = null;
      } else {
         if(null != this.aClass240_Sub4_Sub1_4399 && !this.aString_4400.equals(this.aClass240_Sub4_Sub1_4399.method280(897723996))) {
            this.aClass240_Sub4_Sub1_4399 = null;
         }

         if(this.aClass240_Sub4_Sub1_4399 == null) {
            for(Class240_Sub4 var3 = (Class240_Sub4)this.aNodeArrayList_4393.start(); null != var3; var3 = (Class240_Sub4)this.aNodeArrayList_4393.next()) {
               if(var3 instanceof Class240_Sub4_Sub1) {
                  Class240_Sub4_Sub1 var4 = (Class240_Sub4_Sub1)var3;
                  if(this.aString_4400.equals(var4.method280(1144025228))) {
                     this.aClass240_Sub4_Sub1_4399 = var4;
                     return;
                  }
               }
            }
         }

      }
   }

   public double method3331(int var1) {
      return this.aClass240_Sub4_Sub3_4398 != null?this.aClass240_Sub4_Sub3_4398.method2555((byte)0):(this.aClass240_Sub4_Sub4_4387 != null?this.aClass240_Sub4_Sub4_4387.method2671(-708028207):0.0D);
   }

   void method3332(byte var1) throws IOException {
      while(this.aClass240_Sub4_Sub4_4387.anOggStreamState_6751.packetOut(this.anOggPacket_4391) != 1) {
         Class240_Sub4 var2 = this.method3321((byte)-44);
         if(null == var2) {
            if(this.aBoolean_4396) {
               this.method3325(1832958432);
            }

            return;
         }

         if(var2 == this.aClass240_Sub4_Sub1_4399) {
            this.method3323((byte)-89);
         }
      }

      this.aClass240_Sub4_Sub4_4387.method4433(this.anOggPacket_4391, -524470739);
   }

   public Class240_Sub4_Sub3 method3333(int var1) {
      return this.aClass240_Sub4_Sub3_4398;
   }

   boolean method3334(int var1) {
      if(this.aClass240_Sub4_Sub3_4398 != null) {
         return !this.aClass240_Sub4_Sub4_4387.method2675(-2022501928) || this.method3331(972312096) > this.aClass240_Sub4_Sub4_4387.method2671(-708028207);
      } else {
         double var2 = (double)this.aClass240_Sub4_Sub4_4387.method2672(-1544727205);
         return var2 == 0.0D || (double)Class373.getCurrentTime((short)26572) >= (double)this.aClass240_Sub4_Sub4_4387.method2670((byte)-89) + 1000.0D / var2;
      }
   }

   static final void method3335(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      Class552 var4;
      if(var0.aBoolean_9522) {
         var4 = var0.aClass552_9506;
      } else {
         var4 = var0.aClass552_9492;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3 != -1 && var4.method6122(var2, var3, 1576196587)?1:0;
   }

   static final void method3336(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 * var3;
   }

   static final void method3337(RSInterfaceData var0, int var1) {
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = ((Player)var0.animeTarget).getName(true, 82577077);
   }

   static void method3338(ByteArrayDataNode var0, int var1) {
      int var2 = var0.method4490((byte)0);
      Class508_Sub5.aClass625Array_6573 = new Class625[var2];

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         Class508_Sub5.aClass625Array_6573[var3] = new Class625();
         Class508_Sub5.aClass625Array_6573[var3].anInt_10045 = var0.method4490((byte)0) * 485398661;
         Class508_Sub5.aClass625Array_6573[var3].aString_10046 = var0.readString(1841936278);
      }

      Class303.minServerIndex = var0.method4490((byte)0) * -1542954039;
      Class613.maxServers = var0.method4490((byte)0) * 1459480595;
      Class613.serverCount = var0.method4490((byte)0) * -196386853;
      Class613.worldArray = new RSWorld[Class613.maxServers * 1422008859 - -2114902407 * Class303.minServerIndex + 1];

      for(var3 = 0; var3 < 1096385619 * Class613.serverCount; ++var3) {
         int var4 = var0.method4490((byte)0);
         RSWorld rsWorld = Class613.worldArray[var4] = new RSWorld();
         rsWorld.anInt_10030 = var0.readByte(-685028113) * -1085511011;
         rsWorld.flags = var0.method4480(1260717178) * 1691850983;
         rsWorld.serverIndex = (var4 + -2114902407 * Class303.minServerIndex) * -235294749;
         rsWorld.locAcc = var0.readString(1841936278);
         rsWorld.worldAddress = var0.readString(1841936278);
      }

      Class240_Sub22_Sub6.anInt_1236 = var0.method4480(1260717178) * -442935729;
      Class613.aBoolean_9956 = true;
   }

   static final void method3339(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class636.method6717(var3, var4, var0, (byte)-41);
   }

   static final void method3340(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class240_Sub14.method4620(var3, var0, (short)-3604);
   }

   public static void method3341(int var0, int var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(17, (long)var1 << 32 | (long)var0);
      var3.method597((byte)0);
   }
}
