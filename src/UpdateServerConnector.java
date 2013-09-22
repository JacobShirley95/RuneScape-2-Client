import java.io.IOException;
import java.util.Iterator;

public class UpdateServerConnector extends AbstractUpdateServerConnector {

   AbstractServerConnection serverConnection;
   public static CacheDataUnpacker aCacheUnpacker_7708;


   public void closeConnection() {
      if(null != this.serverConnection) {
         this.serverConnection.close();
      }

   }

   void method3633(int var1) {
      try {
         this.serverConnection.method3067((byte)57);
      } catch (Exception var3) {
         ;
      }

      this.serverConnection = null;
      this.status += -1205668457;
      this.anInt_4748 = 1748329197;
      this.aByte_4757 = (byte)((int)(Math.random() * 255.0D + 1.0D));
   }

   public boolean method3638(byte var1) {
      int var4;
      if(null != this.serverConnection) {
         long var2 = Class373.getCurrentTime((short)32721);
         var4 = (int)(var2 - 5506324377882461429L * this.aLong_4755);
         this.aLong_4755 = 3107429886477436765L * var2;
         if(var4 > 200) {
            var4 = 200;
         }

         this.anInt_4754 += -132014653 * var4;
         if(this.anInt_4754 * -1029555477 > 30000) {
            try {
               this.serverConnection.method3067((byte)-32);
            } catch (Exception var16) {
               ;
            }

            this.serverConnection = null;
         }
      }

      if(null == this.serverConnection) {
         return this.method3640((byte)121) == 0 && this.method3632((short)9165) == 0;
      } else {
         try {
            Class240_Sub22_Sub15_Sub1 var6;
            for(var6 = (Class240_Sub22_Sub15_Sub1)this.aClass494_4750.method5772(413882805); var6 != null; var6 = (Class240_Sub22_Sub15_Sub1)this.aClass494_4750.method5771(571808279)) {
               this.aClass240_Sub8_4763.index = 0;
               this.aClass240_Sub8_4763.putByte(1, -986391575);
               this.aClass240_Sub8_4763.method4540(2950103203925786055L * var6.aLong_7278);
               this.serverConnection.method3068(this.aClass240_Sub8_4763.data, 0, this.aClass240_Sub8_4763.data.length, (byte)126);
               this.aClass494_4751.insert(var6, 782413554);
            }

            for(var6 = (Class240_Sub22_Sub15_Sub1)this.aClass494_4749.method5772(-847407562); null != var6; var6 = (Class240_Sub22_Sub15_Sub1)this.aClass494_4749.method5771(187389662)) {
               this.aClass240_Sub8_4763.index = 0;
               this.aClass240_Sub8_4763.putByte(0, 1297257293);
               this.aClass240_Sub8_4763.method4540(var6.aLong_7278 * 2950103203925786055L);
               this.serverConnection.method3068(this.aClass240_Sub8_4763.data, 0, this.aClass240_Sub8_4763.data.length, (byte)33);
               this.aClass494_4753.insert(var6, 620047660);
            }

            for(int var19 = 0; var19 < 100; ++var19) {
               int var7 = this.serverConnection.method3066((byte)-1);
               if(var7 < 0) {
                  throw new IOException();
               }

               if(var7 == 0) {
                  break;
               }

               this.anInt_4754 = 0;
               int var5;
               int var8;
               if(null == this.aClass240_Sub22_Sub15_Sub1_4745) {
                  var4 = 5 - this.aClass240_Sub8_4759.index * 964952859;
                  if(var4 > var7) {
                     var4 = var7;
                  }

                  this.serverConnection.method3064(this.aClass240_Sub8_4759.data, this.aClass240_Sub8_4759.index * 964952859, var4, (short)-27874);
                  if(0 != this.aByte_4757) {
                     for(var5 = 0; var5 < var4; ++var5) {
                        this.aClass240_Sub8_4759.data[964952859 * this.aClass240_Sub8_4759.index + var5] ^= this.aByte_4757;
                     }
                  }

                  this.aClass240_Sub8_4759.index += var4 * -2043502829;
                  if(964952859 * this.aClass240_Sub8_4759.index >= 5) {
                     this.aClass240_Sub8_4759.index = 0;
                     var5 = this.aClass240_Sub8_4759.readByte(-794659795);
                     var8 = this.aClass240_Sub8_4759.method4480(1260717178);
                     boolean var9 = 0 != (var8 & Integer.MIN_VALUE);
                     int var10 = var8 & Integer.MAX_VALUE;
                     long var11 = (long)var10 + ((long)var5 << 32);
                     Iterator var13;
                     Class240_Sub22_Sub15_Sub1 var14;
                     if(var9) {
                        var13 = this.aClass494_4753.iterator();

                        while(var13.hasNext()) {
                           var14 = (Class240_Sub22_Sub15_Sub1)var13.next();
                           if(var11 == var14.aLong_7278 * 2950103203925786055L) {
                              this.aClass240_Sub22_Sub15_Sub1_4745 = var14;
                              break;
                           }
                        }
                     } else {
                        var13 = this.aClass494_4751.iterator();

                        while(var13.hasNext()) {
                           var14 = (Class240_Sub22_Sub15_Sub1)var13.next();
                           if(var11 == var14.aLong_7278 * 2950103203925786055L) {
                              this.aClass240_Sub22_Sub15_Sub1_4745 = var14;
                              break;
                           }
                        }
                     }

                     if(null == this.aClass240_Sub22_Sub15_Sub1_4745) {
                        throw new IOException();
                     }

                     this.anInt_4762 = -320121743;
                     this.aClass240_Sub8_4759.index = 0;
                     this.aClass240_Sub8_4761.index = 0;
                  }
               } else {
                  ByteArrayDataNode var18 = this.aClass240_Sub22_Sub15_Sub1_4745.dataNode;
                  int var20;
                  if(var18 == null) {
                     var5 = 5 - 964952859 * this.aClass240_Sub8_4761.index;
                     if(var5 > var7) {
                        var5 = var7;
                     }

                     this.serverConnection.method3064(this.aClass240_Sub8_4761.data, this.aClass240_Sub8_4761.index * 964952859, var5, (short)-24780);
                     if(this.aByte_4757 != 0) {
                        for(var8 = 0; var8 < var5; ++var8) {
                           this.aClass240_Sub8_4761.data[var8 + this.aClass240_Sub8_4761.index * 964952859] ^= this.aByte_4757;
                        }
                     }

                     this.aClass240_Sub8_4761.index += -2043502829 * var5;
                     if(964952859 * this.aClass240_Sub8_4761.index >= 5) {
                        this.aClass240_Sub8_4761.index = 0;
                        var8 = this.aClass240_Sub8_4761.readByte(1079421481);
                        var20 = this.aClass240_Sub8_4761.method4480(1260717178);
                        byte var21 = 5;
                        if(0 != var8) {
                           var21 = 9;
                        }

                        var18 = this.aClass240_Sub22_Sub15_Sub1_4745.dataNode = new ByteArrayDataNode(this.aClass240_Sub22_Sub15_Sub1_4745.aByte_3236 + var21 + var20);
                        var18.putByte(var8, 580702096);
                        var18.putIntBE(var20, 2062892803);
                        this.anInt_4762 += -320121743;
                     }
                  } else {
                     var5 = var18.data.length - this.aClass240_Sub22_Sub15_Sub1_4745.aByte_3236;
                     var8 = 512 - this.anInt_4762 * 702914261;
                     if(var8 > var5 - var18.index * 964952859) {
                        var8 = var5 - var18.index * 964952859;
                     }

                     if(var8 > var7) {
                        var8 = var7;
                     }

                     this.serverConnection.method3064(var18.data, 964952859 * var18.index, var8, (short)-10029);
                     if(this.aByte_4757 != 0) {
                        for(var20 = 0; var20 < var8; ++var20) {
                           var18.data[var20 + 964952859 * var18.index] ^= this.aByte_4757;
                        }
                     }

                     var18.index += var8 * -2043502829;
                     this.anInt_4762 += -1782011267 * var8;
                     if(964952859 * var18.index == var5) {
                        this.aClass240_Sub22_Sub15_Sub1_4745.shiftNext();
                        this.aClass240_Sub22_Sub15_Sub1_4745.aBoolean_3671 = false;
                        this.aClass240_Sub22_Sub15_Sub1_4745 = null;
                     } else if(512 == this.anInt_4762 * 702914261) {
                        this.anInt_4762 = 0;
                        this.aClass240_Sub22_Sub15_Sub1_4745 = null;
                     }
                  }
               }
            }

            return true;
         } catch (IOException var17) {
            try {
               this.serverConnection.method3067((byte)-71);
            } catch (Exception var15) {
               ;
            }

            this.serverConnection = null;
            this.status += -1205668457;
            this.anInt_4748 = -798308902;
            return this.method3640((byte)32) == 0 && this.method3632((short)8475) == 0;
         }
      }
   }

   void method5004(byte var1) {
      if(this.serverConnection != null) {
         try {
            this.aClass240_Sub8_4763.index = 0;
            this.aClass240_Sub8_4763.putByte(6, 747348342);
            this.aClass240_Sub8_4763.method4465(3, -1407542461);
            this.aClass240_Sub8_4763.method4463(0, -540092340);
            this.serverConnection.method3068(this.aClass240_Sub8_4763.data, 0, this.aClass240_Sub8_4763.data.length, (byte)49);
         } catch (IOException var5) {
            try {
               this.serverConnection.method3067((byte)-49);
            } catch (Exception var4) {
               ;
            }

            this.serverConnection = null;
            this.status += -1205668457;
            this.anInt_4748 = -798308902;
         }

      }
   }

   public void method3635(byte var1) {
      if(this.serverConnection != null) {
         try {
            this.aClass240_Sub8_4763.index = 0;
            this.aClass240_Sub8_4763.putByte(7, 861705267);
            this.aClass240_Sub8_4763.method4540(0L);
            this.serverConnection.method3068(this.aClass240_Sub8_4763.data, 0, this.aClass240_Sub8_4763.data.length, (byte)92);
         } catch (IOException var5) {
            try {
               this.serverConnection.method3067((byte)-34);
            } catch (Exception var4) {
               ;
            }

            this.serverConnection = null;
            this.status += -1205668457;
            this.anInt_4748 = -798308902;
         }

      }
   }

   public void method3636(int var1) {
      if(null != this.serverConnection) {
         this.serverConnection.method3067((byte)110);
      }

   }

   public void method3639(boolean var1, int var2) {
      if(this.serverConnection != null) {
         try {
            this.aClass240_Sub8_4763.index = 0;
            this.aClass240_Sub8_4763.putByte(var1?2:3, -344724184);
            this.aClass240_Sub8_4763.method4540(0L);
            this.serverConnection.method3068(this.aClass240_Sub8_4763.data, 0, this.aClass240_Sub8_4763.data.length, (byte)64);
         } catch (IOException var6) {
            try {
               this.serverConnection.method3067((byte)-68);
            } catch (Exception var5) {
               ;
            }

            this.serverConnection = null;
            this.status += -1205668457;
            this.anInt_4748 = -798308902;
         }

      }
   }

   public void method3634(Object var1, boolean var2, int var3) {
      if(null != this.serverConnection) {
         try {
            this.serverConnection.method3067((byte)-75);
         } catch (Exception var8) {
            ;
         }

         this.serverConnection = null;
      }

      this.serverConnection = (AbstractServerConnection)var1;
      this.method5004((byte)-115);
      this.method3639(var2, 1911592382);
      this.aClass240_Sub8_4759.index = 0;
      this.aClass240_Sub8_4761.index = 0;
      this.aClass240_Sub22_Sub15_Sub1_4745 = null;

      while(true) {
         Class240_Sub22_Sub15_Sub1 var4 = (Class240_Sub22_Sub15_Sub1)this.aClass494_4751.method5776(-1344838058);
         if(var4 == null) {
            while(true) {
               var4 = (Class240_Sub22_Sub15_Sub1)this.aClass494_4753.method5776(289289237);
               if(var4 == null) {
                  if(0 != this.aByte_4757) {
                     try {
                        this.aClass240_Sub8_4763.index = 0;
                        this.aClass240_Sub8_4763.putByte(4, -406358022);
                        this.aClass240_Sub8_4763.putByte(this.aByte_4757, 2094448151);
                        this.aClass240_Sub8_4763.putIntBE(0, 2062892803);
                        this.serverConnection.method3068(this.aClass240_Sub8_4763.data, 0, this.aClass240_Sub8_4763.data.length, (byte)100);
                     } catch (IOException var7) {
                        try {
                           this.serverConnection.method3067((byte)-49);
                        } catch (Exception var6) {
                           ;
                        }

                        this.serverConnection = null;
                        this.status += -1205668457;
                        this.anInt_4748 = -798308902;
                     }
                  }

                  this.anInt_4754 = 0;
                  this.aLong_4755 = Class373.getCurrentTime((short)17796) * 3107429886477436765L;
                  return;
               }

               var4.dataNode = null;
               this.aClass494_4749.insert(var4, 365507264);
            }
         }

         var4.dataNode = null;
         this.aClass494_4750.insert(var4, 516920910);
      }
   }

   public static int rgbToColour(int var0, int var1, int var2) {
      int var4 = 255 - var2;
      var1 = (var2 * (var1 & 16711935) & -16711936 | (var1 & '\uff00') * var2 & 16711680) >>> 8;
      return var1 + ((var4 * (var0 & 16711935) & -16711936 | (var0 & '\uff00') * var4 & 16711680) >>> 8);
   }
}
