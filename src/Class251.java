import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class251 {

   final CacheNodeArrayList aClass627_4360 = new CacheNodeArrayList(64);
   final CacheDataUnpacker aCacheUnpacker_4361;
   final CacheDataUnpacker aCacheUnpacker_4362;
   CacheNodeArrayList aClass627_4363 = new CacheNodeArrayList(20);


   public Class234 method3287(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_4360;
      Class234 var4;
      synchronized(this.aClass627_4360) {
         var4 = (Class234)this.aClass627_4360.getObject((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_4361;
         byte[] var12;
         synchronized(this.aCacheUnpacker_4361) {
            var12 = this.aCacheUnpacker_4361.getDataBytes(Class124.aClass124_2277.anInt_2347 * -851327023, var1, 94825569);
         }

         var4 = new Class234();
         var4.aClass251_4008 = this;
         if(null != var12) {
            var4.method3011(new ByteArrayDataNode(var12), (byte)37);
         }

         CacheNodeArrayList var11 = this.aClass627_4360;
         synchronized(this.aClass627_4360) {
            this.aClass627_4360.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method3288(int var1) {
      CacheNodeArrayList var2 = this.aClass627_4360;
      synchronized(this.aClass627_4360) {
         this.aClass627_4360.method6669(78072533);
      }

      var2 = this.aClass627_4363;
      synchronized(this.aClass627_4363) {
         this.aClass627_4363.method6669(-509554574);
      }
   }

   public void method3289(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_4360;
      synchronized(this.aClass627_4360) {
         this.aClass627_4360.method6665((byte)5);
      }

      var2 = this.aClass627_4363;
      synchronized(this.aClass627_4363) {
         this.aClass627_4363.method6665((byte)5);
      }
   }

   public Class251(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, CacheDataUnpacker var4) {
      this.aCacheUnpacker_4362 = var4;
      this.aCacheUnpacker_4361 = var3;
      this.aCacheUnpacker_4361.method3575(-851327023 * Class124.aClass124_2277.anInt_2347, -1083127650);
   }

   public void method3290(int var1, short var2) {
      CacheNodeArrayList var3 = this.aClass627_4360;
      synchronized(this.aClass627_4360) {
         this.aClass627_4360.method6677(var1, -1653327854);
      }

      var3 = this.aClass627_4363;
      synchronized(this.aClass627_4363) {
         this.aClass627_4363.method6677(var1, -2136608016);
      }
   }

   static final void method3291(RSInterfaceData var0, byte var1) {
      if(1735950531 * Class509.anInt_9182 == 2) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)((double)Class542.aClass43_Sub1_9475.method394(-1962301117) * 2607.5945876176133D) >> 3;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)client.aFloat_501 >> 3;
      }

   }

   static final void method3292(RSInterfaceData var0, int var1) {
      Class86.setMid(420406933);
      client.aClass296_348.method3789((byte)66);
      Class83.method1089(-1703661189);
      client.aBoolean_568 = false;
   }

   public static void method3293(ByteArrayDataNode var0, int var1, int var2) {
      Class240_Sub1 var3 = new Class240_Sub1();
      var3.anInt_6498 = var0.readByte(1352458340) * -374628921;
      var3.anInt_6497 = var0.method4480(1260717178) * -32563825;
      var3.anIntArray_6501 = new int[var3.anInt_6498 * -542960649];
      var3.anIntArray_6500 = new int[var3.anInt_6498 * -542960649];
      var3.aFieldArray_6499 = new Field[var3.anInt_6498 * -542960649];
      var3.anIntArray_6502 = new int[var3.anInt_6498 * -542960649];
      var3.aMethodArray_6503 = new Method[var3.anInt_6498 * -542960649];
      var3.aByteArrayArrayArray_6504 = new byte[var3.anInt_6498 * -542960649][][];

      for(int var4 = 0; var4 < -542960649 * var3.anInt_6498; ++var4) {
         try {
            int var5 = var0.readByte(1442270934);
            String var6;
            String var7;
            int var8;
            if(var5 != 0 && var5 != 1 && 2 != var5) {
               if(3 == var5 || var5 == 4) {
                  var6 = var0.method4485(2110702449);
                  var7 = var0.method4485(177374043);
                  var8 = var0.readByte(765622779);
                  String[] var9 = new String[var8];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[var10] = var0.method4485(-112569119);
                  }

                  String var26 = var0.method4485(-729295571);
                  byte[][] var11 = new byte[var8][];
                  int var13;
                  if(3 == var5) {
                     for(int var12 = 0; var12 < var8; ++var12) {
                        var13 = var0.method4480(1260717178);
                        var11[var12] = new byte[var13];
                        var0.fillArray(var11[var12], 0, var13);
                     }
                  }

                  var3.anIntArray_6501[var4] = var5;
                  Class[] var27 = new Class[var8];

                  for(var13 = 0; var13 < var8; ++var13) {
                     var27[var13] = Class290.method3710(var9[var13], (byte)127);
                  }

                  Class var28 = Class290.method3710(var26, (byte)126);
                  if(Class290.method3710(var6, (byte)36).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = Class290.method3710(var6, (byte)89).getDeclaredMethods();
                  Method[] var15 = var14;

                  for(int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if(var17.getName().equals(var7)) {
                        Class[] var18 = var17.getParameterTypes();
                        if(var18.length == var27.length) {
                           boolean var19 = true;

                           for(int var20 = 0; var20 < var27.length; ++var20) {
                              if(var18[var20] != var27[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if(var19 && var28 == var17.getReturnType()) {
                              var3.aMethodArray_6503[var4] = var17;
                           }
                        }
                     }
                  }

                  var3.aByteArrayArrayArray_6504[var4] = var11;
               }
            } else {
               var6 = var0.method4485(-1006664880);
               var7 = var0.method4485(-1915744437);
               var8 = 0;
               if(var5 == 1) {
                  var8 = var0.method4480(1260717178);
               }

               var3.anIntArray_6501[var4] = var5;
               var3.anIntArray_6502[var4] = var8;
               if(Class290.method3710(var6, (byte)51).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var3.aFieldArray_6499[var4] = Class290.method3710(var6, (byte)10).getDeclaredField(var7);
            }
         } catch (ClassNotFoundException var21) {
            var3.anIntArray_6500[var4] = -1;
         } catch (SecurityException var22) {
            var3.anIntArray_6500[var4] = -2;
         } catch (NullPointerException var23) {
            var3.anIntArray_6500[var4] = -3;
         } catch (Exception var24) {
            var3.anIntArray_6500[var4] = -4;
         } catch (Throwable var25) {
            var3.anIntArray_6500[var4] = -5;
         }
      }

      Class462.aNodeList_8603.addNode(var3, (short)-6485);
   }

   static final void method3294(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.animeTarget.getHeight();
   }

   static final void method3295(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(-826987519 * client.anInt_567 == 2 && var2 < client.friendsCount * -1301826725) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.friendsList[var2].aBoolean_53?1:0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method3296(RSInterfaceData var0, int var1) {
      Class182.method2266((byte)-1);
   }
}
