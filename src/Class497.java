import java.io.IOException;

public class Class497 {

   public int anInt_9069;
   public boolean aBoolean_9070 = true;
   int anInt_9071 = 0;
   public int anInt_9072;
   public boolean aBoolean_9073 = true;
   public int anInt_9074;
   public int anInt_9075;
   public int anInt_9076 = 660500992;
   public int anInt_9077 = 1414759339;


   void method5819(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         this.anInt_9071 = var1.method4479(738776218) * -642146575;
         this.method5821(this.anInt_9071 * -1938320879, 611084180);
      } else if(var2 == 2) {
         this.anInt_9077 = var1.readShort(1123395390) * -1414759339;
         if(-1182490371 * this.anInt_9077 == '\uffff') {
            this.anInt_9077 = 1414759339;
         }
      } else if(var2 == 3) {
         this.anInt_9076 = (var1.readShort(-273489855) << 2) * -460083399;
      } else if(var2 == 4) {
         this.aBoolean_9070 = false;
      } else if(var2 == 5) {
         this.aBoolean_9073 = false;
      }

   }

   void method5820(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(1966750412);
         if(0 == var3) {
            return;
         }

         this.method5819(var1, var3, -188928548);
      }
   }

   void method5821(int var1, int var2) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var5 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if(var5 < var3) {
         var9 = var5;
      }

      if(var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if(var5 > var3) {
         var11 = var5;
      }

      if(var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var9 + var11) / 2.0D;
      if(var11 != var9) {
         if(var17 < 0.5D) {
            var15 = (var11 - var9) / (var11 + var9);
         }

         if(var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if(var11 == var3) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if(var5 == var11) {
            var13 = 2.0D + (var7 - var3) / (var11 - var9);
         } else if(var11 == var7) {
            var13 = (var3 - var5) / (var11 - var9) + 4.0D;
         }
      }

      var13 /= 6.0D;
      this.anInt_9075 = (int)(var15 * 256.0D) * 580861927;
      this.anInt_9072 = 1952006905 * (int)(256.0D * var17);
      if(1874682839 * this.anInt_9075 < 0) {
         this.anInt_9075 = 0;
      } else if(1874682839 * this.anInt_9075 > 255) {
         this.anInt_9075 = 2090903321;
      }

      if(320724809 * this.anInt_9072 < 0) {
         this.anInt_9072 = 0;
      } else if(320724809 * this.anInt_9072 > 255) {
         this.anInt_9072 = -454445561;
      }

      if(var17 > 0.5D) {
         this.anInt_9069 = (int)(512.0D * var15 * (1.0D - var17)) * 742865905;
      } else {
         this.anInt_9069 = (int)(var15 * var17 * 512.0D) * 742865905;
      }

      if(608064785 * this.anInt_9069 < 1) {
         this.anInt_9069 = 742865905;
      }

      this.anInt_9074 = -750619971 * (int)((double)(608064785 * this.anInt_9069) * var13);
   }

   static Class502_Sub1 method5822(int var0) {
      Class502_Sub1 var1 = new Class502_Sub1();
      boolean var2 = false;
      boolean var3 = false;
      if(Class50.aString_1050.startsWith("win")) {
         var3 = true;
         var2 = true;
      } else {
         var2 = true;
      }

      if(Class211.aBoolean_3667) {
         var1.setFlag(16, -1114341669);
         var2 = false;
      }

      if(Class211.aBoolean_3668) {
         var1.setFlag(32, -103851667);
         var3 = false;
      }

      if(!var2 && !var3) {
         Class409_Sub2.method2802(var1, -781358558);
         return var1;
      } else {
         int var4 = -1;
         int profileInt = -1;
         if(var3) {
            try {
               Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub8_7317, 3, 1087276035);
               Class83.method1089(-1755303277);
               profileInt = Class371.method4717(3, 1000, -1554882532);
               if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() == 3) {
                  var1.setFlag(4, 231663826);
                  RendererInfo var6 = Class286.gameRenderer.getRendererInfo();
                  long var7 = var6.deviceVersion * 5162517997575409563L & 281474976710655L;
                  boolean var9;
                  switch(var6.vendor * 413942303) {
                  case 4098:
                     var9 = var7 >= 60129613779L;
                     var2 &= var9;
                     if(!var9) {
                        var1.setFlag(512, 1072603376);
                     }
                     break;
                  case 4318:
                     var9 = var7 >= 64425238954L;
                     var2 &= var9;
                     if(!var9) {
                        var1.setFlag(256, -1303902486);
                     }
                  }
               }
            } catch (Exception var11) {
               var1.setFlag(4096, -1532254443);
            }
         }

         if(var2) {
            try {
               Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub8_7317, 4, 606477102);
               Class83.method1089(-2020474925);
               var4 = Class371.method4717(1, 1000, -1507294040);
               if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() == 1) {
                  var1.setFlag(2, 793652765);
               }
            } catch (Exception var10) {
               var1.setFlag(2048, 772687495);
            }
         }

         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub8_7317, 0, 692545794);
         if(var4 == -1 && -1 == profileInt) {
            Class409_Sub2.method2802(var1, 847903673);
            return var1;
         } else {
            var1.method4700(3, profileInt, (byte)100);
            var1.method4700(1, var4, (byte)103);
            profileInt = (int)((float)profileInt * 1.3F);
            var4 = (int)((float)var4 * 1.1F);
            if(profileInt > var4) {
               Class34.method266(var1, 3, profileInt, -938420147);
            } else {
               Class34.method266(var1, 1, var4, -1267448910);
            }

            return var1;
         }
      }
   }

   static final boolean method5823(ConnectionHandler var0, int var1) throws IOException {
      AbstractServerConnection var2 = var0.getServerConnection();
      ByteArrayDataNode_Sub1 var3 = var0.serverDataNode;
      if(var2 == null) {
         return false;
      } else {
         int var5;
         if(null == var0.aClass428_3448) {
            if(var0.aBoolean_3443) {
               if(!var2.method3065(1, -2048193241)) {
                  return false;
               }

               var2.method3064(var0.serverDataNode.data, 0, 1, (short)-32564);
               var0.outBytes += 861199037;
               var0.anInt_3444 = 0;
               var0.aBoolean_3443 = false;
            }

            var3.index = 0;
            if(var3.method290(-1474535215)) {
               if(!var2.method3065(1, -2065586691)) {
                  return false;
               }

               var2.method3064(var0.serverDataNode.data, 1, 1, (short)-14081);
               var0.outBytes += 861199037;
               var0.anInt_3444 = 0;
            }

            var0.aBoolean_3443 = true;
            Class428[] var4 = Class104_Sub3.method3181(-1406011236);
            var5 = var3.method289(-1275921694);
            if(var5 < 0 || var5 >= var4.length) {
               throw new IOException(var5 + " " + var3.index * 964952859);
            }

            var0.aClass428_3448 = var4[var5];
            var0.anInt_3450 = var0.aClass428_3448.anInt_8258 * 822136603;
         }

         if(var0.anInt_3450 * 1463379377 == -1) {
            if(!var2.method3065(1, -2104218090)) {
               return false;
            }

            var2.method3064(var3.data, 0, 1, (short)-22656);
            var0.anInt_3450 = 263308113 * (var3.data[0] & 255);
            var0.outBytes += 861199037;
            var0.anInt_3444 = 0;
         }

         if(var0.anInt_3450 * 1463379377 == -2) {
            if(!var2.method3065(2, -2051848158)) {
               return false;
            }

            var2.method3064(var3.data, 0, 2, (short)-16773);
            var3.index = 0;
            var0.anInt_3450 = var3.readShort(139100529) * 263308113;
            var0.outBytes += 1722398074;
            var0.anInt_3444 = 0;
         }

         if(var0.anInt_3450 * 1463379377 > 0) {
            if(!var2.method3065(var0.anInt_3450 * 1463379377, -1992832204)) {
               return false;
            }

            var3.index = 0;
            var2.method3064(var3.data, 0, var0.anInt_3450 * 1463379377, (short)-13172);
            var0.outBytes += var0.anInt_3450 * -418591315;
            var0.anInt_3444 = 0;
         }

         var0.aClass428_3446 = var0.aClass428_3451;
         var0.aClass428_3451 = var0.aClass428_3434;
         var0.aClass428_3434 = var0.aClass428_3448;
         boolean var53;
         if(Class428.aClass428_8224 == var0.aClass428_3448) {
            var53 = var3.readByte(1303097211) == 1;
            byte[] var142 = new byte[1463379377 * var0.anInt_3450 - 1];
            var3.fillArray(var142, 0, var0.anInt_3450 * 1463379377 - 1);
            Class79.method1043(var53, var142, 916827198);
            var0.aClass428_3448 = null;
            return true;
         } else {
            int var6;
            int var7;
            int var43;
            if(Class428.aClass428_8256 == var0.aClass428_3448) {
               var43 = var3.method4501(-1965975883);
               var5 = var3.method4529(1812398568);
               var6 = var3.method4480(1260717178);
               var7 = var3.method4531(-1523090014);
               CacheObjectLoader.method5584(572568705);
               RendererInfo.method2213(var6, var43, var7, var5, 1645574350);
               var0.aClass428_3448 = null;
               return true;
            } else {
               String var44;
               if(Class428.aClass428_8250 == var0.aClass428_3448) {
                  var44 = var3.method4485(-709246294);
                  Object[] var141 = new Object[var44.length() + 1];

                  for(var6 = var44.length() - 1; var6 >= 0; --var6) {
                     if(var44.charAt(var6) == 115) {
                        var141[1 + var6] = var3.method4485(-1432124976);
                     } else {
                        var141[var6 + 1] = new Integer(var3.method4480(1260717178));
                     }
                  }

                  var141[0] = new Integer(var3.method4480(1260717178));
                  CacheObjectLoader.method5584(-423396939);
                  Class240_Sub17 var136 = new Class240_Sub17();
                  var136.anObjectArray_6907 = var141;
                  Class411.method5074(var136, (byte)1);
                  var0.aClass428_3448 = null;
                  return true;
               } else if(var0.aClass428_3448 == Class428.aClass428_8176) {
                  Class104_Sub1.anInt_4068 = var3.readByte(407748673) * 1242138963;
                  Class240_Sub51.anInt_7706 = (var3.method4524(-25913821) << 3) * 717194021;
                  RendererInfo.anInt_3080 = (var3.method4524(-25913821) << 3) * -243977653;
                  var0.aClass428_3448 = null;
                  return true;
               } else if(Class428.aClass428_8209 == var0.aClass428_3448) {
                  Class524.method5987(Class418.aClass418_7937, (byte)12);
                  var0.aClass428_3448 = null;
                  return true;
               } else if(Class428.aClass428_8116 == var0.aClass428_3448) {
                  client.anInt_460 = var3.readByte(1221604045) * 827925881;
                  client.anInt_538 = var3.readByte(1484762902) * -689069471;
                  var0.aClass428_3448 = null;
                  return true;
               } else {
                  byte var49;
                  if(var0.aClass428_3448 == Class428.aClass428_8218) {
                     var49 = var3.method4503((byte)9);
                     var5 = var3.method4527(1964531125);
                     CacheObjectLoader.method5584(-76820978);
                     Class240_Sub7_Sub1.method510(var5, var49, (byte)6);
                     var0.aClass428_3448 = null;
                     return true;
                  } else if(Class428.aClass428_8171 == var0.aClass428_3448) {
                     var43 = var3.readShort(1430232381);
                     if(var43 == '\uffff') {
                        var43 = -1;
                     }

                     var5 = var3.readByte(321795441);
                     var6 = var3.readShort(1956517985);
                     var7 = var3.readByte(-279389663);
                     Class271.method3556(var43, var5, var6, var7, true, 256, -708028207);
                     var0.aClass428_3448 = null;
                     return true;
                  } else {
                     boolean var50;
                     if(Class428.aClass428_8117 == var0.aClass428_3448) {
                        var43 = var3.readByte(1735841696);
                        var5 = var3.method4529(1792646443);
                        var50 = (var43 & 1) == 1;
                        Class206.method2622(var5, var50, (byte)77);
                        client.anIntArray_341[(client.anInt_278 += 189092229) * 1494744909 - 1 & 31] = var5;
                        var0.aClass428_3448 = null;
                        return true;
                     } else if(var0.aClass428_3448 == Class428.aClass428_8211) {
                        var44 = var3.method4485(-478160850);
                        var5 = var3.method4519((byte)26);
                        CacheObjectLoader.method5584(-1446006347);
                        Class608.method6555(var5, var44, -2067785683);
                        var0.aClass428_3448 = null;
                        return true;
                     } else if(Class428.aClass428_8179 == var0.aClass428_3448) {
                        var43 = var3.readShort(671917921);
                        Class91.method1199(var43, -336611680);
                        var0.aClass428_3448 = null;
                        return true;
                     } else if(var0.aClass428_3448 == Class428.aClass428_8236) {
                        Class524.method5987(Class418.aClass418_7935, (byte)17);
                        var0.aClass428_3448 = null;
                        return true;
                     } else if(Class428.aClass428_8154 == var0.aClass428_3448) {
                        Class524.method5987(Class418.aClass418_7939, (byte)7);
                        var0.aClass428_3448 = null;
                        return true;
                     } else {
                        ByteArrayDataNode_Sub1 var139;
                        if(var0.aClass428_3448 == Class428.aClass428_8254) {
                           var139 = new ByteArrayDataNode_Sub1(1463379377 * var0.anInt_3450);
                           System.arraycopy(var0.serverDataNode.data, var0.serverDataNode.index * 964952859, var139.data, 0, var0.anInt_3450 * 1463379377);
                           Class100.method1294(2046372947);
                           if(Class104_Sub21.renderSettings.aClass540_Sub12_7318.method1679(1389970496) == 1) {
                              Class476.aClass306_8741.method3849(new Class297(Class305.aClass305_6027, var139), -599549962);
                           } else {
                              client.aClass296_348.method3764(new Class297(Class305.aClass305_6027, var139), -1338654772);
                           }

                           var0.aClass428_3448 = null;
                           return false;
                        } else if(Class428.aClass428_8203 == var0.aClass428_3448) {
                           client.anInt_567 = -1327836159;
                           client.anInt_512 = client.anInt_413 * -490132939;
                           var0.aClass428_3448 = null;
                           return true;
                        } else if(var0.aClass428_3448 == Class428.aClass428_8141) {
                           Class251.method3293(var3, 1463379377 * var0.anInt_3450, -2103613328);
                           var0.aClass428_3448 = null;
                           return true;
                        } else if(var0.aClass428_3448 == Class428.aClass428_8198) {
                           var43 = var3.readByte(-50052783);
                           var5 = var3.method4531(-822384751);
                           Class240_Sub41_Sub3.aClass23_1024.aClass608_202.method6543(Class603.aClass212_Sub2_9897.method7527(var5, -126185843), var43, 1497827404);
                           var0.aClass428_3448 = null;
                           return true;
                        } else {
                           int var48;
                           if(var0.aClass428_3448 == Class428.aClass428_8206) {
                              var43 = var3.readShort(1192064295);
                              if('\uffff' == var43) {
                                 var43 = -1;
                              }

                              var5 = var3.readByte(868878468);
                              var6 = var3.readShort(-700227188);
                              var7 = var3.readByte(1550833519);
                              var48 = var3.readShort(-411542409);
                              Class271.method3556(var43, var5, var6, var7, false, var48, -708028207);
                              var0.aClass428_3448 = null;
                              return true;
                           } else if(var0.aClass428_3448 == Class428.aClass428_8138) {
                              Class369.method4683(-322429019);
                              var0.aClass428_3448 = null;
                              return false;
                           } else if(Class428.aClass428_8189 == var0.aClass428_3448) {
                              var43 = var3.method4517(1319822367);
                              var5 = var3.method4501(-1965975883);
                              CacheObjectLoader.method5584(-1814428969);
                              MapElements.method2926(var43, var5, 1345457186);
                              var0.aClass428_3448 = null;
                              return true;
                           } else if(Class428.aClass428_8149 == var0.aClass428_3448) {
                              for(var43 = 0; var43 < client.aPlayerArray.length; ++var43) {
                                 if(client.aPlayerArray[var43] != null) {
                                    client.aPlayerArray[var43].animationQueue = null;
                                    client.aPlayerArray[var43].animation.animate(-1, 1593151072);
                                 }
                              }

                              for(var43 = 0; var43 < 1910301187 * client.anInt_334; ++var43) {
                                 ((RSCharacter)client.aClass240_Sub9Array_271[var43].anObject_6783).animationQueue = null;
                                 ((RSCharacter)client.aClass240_Sub9Array_271[var43].anObject_6783).animation.animate(-1, 1593151072);
                              }

                              var0.aClass428_3448 = null;
                              return true;
                           } else if(Class428.aClass428_8183 == var0.aClass428_3448) {
                              var43 = var3.readByte(172175652);
                              var5 = var3.method4501(-1965975883);
                              IteratorNodeList.aClass574_9195.method6285(var5, 1051676405);
                              var6 = var3.method4519((byte)-10);
                              Class240_Sub41_Sub3.aClass23_1024.aClass591Array_205[var5].method6400(var6, 1721092463);
                              Class240_Sub41_Sub3.aClass23_1024.aClass591Array_205[var5].method6403(var43, -243034353);
                              client.anIntArray_503[(client.anInt_361 += -925689089) * -816585473 - 1 & 31] = var5;
                              var0.aClass428_3448 = null;
                              return true;
                           } else if(Class428.aClass428_8110 == var0.aClass428_3448) {
                              var43 = var3.method4501(-1965975883);
                              int[] var140 = new int[Class12.method70((byte)16).length];

                              for(var6 = 0; var6 < Class12.method70((byte)16).length; ++var6) {
                                 var140[var6] = var3.method4519((byte)-48);
                              }

                              var6 = var3.method4527(602072881);
                              Class240_Sub9 var131 = (Class240_Sub9)client.npcNodeList.getNode((long)var6);
                              if(var131 != null) {
                                 Class532.method6035((RSCharacter)var131.anObject_6783, var140, var43, true, 48063579);
                              }

                              var0.aClass428_3448 = null;
                              return true;
                           } else if(var0.aClass428_3448 == Class428.aClass428_8137) {
                              var43 = var3.method4527(2008237869);
                              var5 = var3.method4517(616664390);
                              CacheObjectLoader.method5584(-261568443);
                              Class634.method6711(var5, var43, -1928306413);
                              var0.aClass428_3448 = null;
                              return true;
                           } else if(Class428.aClass428_8156 == var0.aClass428_3448) {
                              var43 = var3.method4502((short)-23051);
                              CacheObjectLoader.method5584(-1676384999);
                              client.anInt_488 = var43 * 1209229947;
                              var0.aClass428_3448 = null;
                              return true;
                           } else {
                              String var54;
                              byte[] var57;
                              if(var0.aClass428_3448 == Class428.aClass428_8220) {
                                 var57 = new byte[var0.anInt_3450 * 1463379377];
                                 var3.method295(var57, 0, var0.anInt_3450 * 1463379377, 423063671);
                                 var54 = Class537.bytesToString(var57, 0, 1463379377 * var0.anInt_3450, 338259523);
                                 if(client.aBoolean_452) {
                                    try {
                                       Class332.aClass332_6422.method4107(new Object[]{var54}, -943995221);
                                    } catch (Throwable var42) {
                                       ;
                                    }
                                 }

                                 var0.aClass428_3448 = null;
                                 return true;
                              } else if(var0.aClass428_3448 == Class428.aClass428_8190) {
                                 Class188.method2309(-117676681);
                                 var0.aClass428_3448 = null;
                                 return true;
                              } else if(Class428.aClass428_8112 == var0.aClass428_3448) {
                                 var43 = var3.readByte(-135594488);
                                 var5 = var3.readByte(-404120358);
                                 if(var5 == 255) {
                                    var5 = -1;
                                    var43 = -1;
                                 }

                                 Class535.method6063(var5, var43, 2060530269);
                                 var0.aClass428_3448 = null;
                                 return true;
                              } else if(Class428.aClass428_8222 == var0.aClass428_3448) {
                                 var3.index += -1383504364;
                                 if(var3.method4533(709396569)) {
                                    Class15.method85(var3, 964952859 * var3.index - 28, 1265053673);
                                 }

                                 var0.aClass428_3448 = null;
                                 return true;
                              } else if(Class428.aClass428_8097 == var0.aClass428_3448) {
                                 Class286.method3694(var3, var0.anInt_3450 * 1463379377, 1911562792);
                                 var0.aClass428_3448 = null;
                                 return true;
                              } else if(Class428.aClass428_8229 == var0.aClass428_3448) {
                                 if(client.anInt_468 * 1854782309 != -1) {
                                    Class462.method5591(client.anInt_468 * 1854782309, 0, 1685123114);
                                 }

                                 var0.aClass428_3448 = null;
                                 return true;
                              } else if(Class428.aClass428_8200 == var0.aClass428_3448) {
                                 Class524.method5987(Class418.aClass418_7938, (byte)4);
                                 var0.aClass428_3448 = null;
                                 return true;
                              } else {
                                 int var9;
                                 int var10;
                                 if(var0.aClass428_3448 == Class428.aClass428_8194) {
                                    var43 = var3.method4519((byte)12);
                                    var5 = var3.method4480(1260717178);
                                    var6 = var3.method4517(-668867251);
                                    var7 = var3.method4517(-1486591164);
                                    var48 = var3.readShort(2085854583);
                                    var9 = var3.method4501(-1965975883);
                                    var10 = var3.method4517(833005869);
                                    CacheObjectLoader.method5584(977106920);
                                    Class18.method101(var10, new Class240_Sub16(var48, var9), new int[]{var6, var7, var5, var43}, false, 2076575849);
                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8174) {
                                    Class192.anInt_3351 = var3.readByte(2101551827) * -1866499111;
                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8115) {
                                    var43 = var3.method4517(-245167941);
                                    if(1555835161 * Class224.anInt_3846 != var43) {
                                       Class224.anInt_3846 = var43 * -216587479;
                                       Class203.method2587(Class434.aClass434_8363, -1, -1, 1668640949);
                                    }

                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8144) {
                                    var44 = var3.method4485(-643643850);
                                    Class66.acceptCommand(var44, false, false, -861031433);
                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8223) {
                                    Class368.method4682(false, -1970074556);
                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8148) {
                                    var139 = new ByteArrayDataNode_Sub1(1463379377 * var0.anInt_3450);
                                    System.arraycopy(var0.serverDataNode.data, 964952859 * var0.serverDataNode.index, var139.data, 0, var0.anInt_3450 * 1463379377);
                                    Class100.method1294(2104219438);
                                    if(Class104_Sub21.renderSettings.aClass540_Sub12_7318.method1679(1389970496) == 1) {
                                       Class476.aClass306_8741.method3849(new Class297(Class305.aClass305_6024, var139), -599549962);
                                    } else {
                                       client.aClass296_348.method3764(new Class297(Class305.aClass305_6024, var139), 195746326);
                                    }

                                    var0.aClass428_3448 = null;
                                    return false;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8147) {
                                    var43 = var3.method4517(796302150);
                                    var5 = var3.method4527(511690237);
                                    var6 = var3.method4529(1608193875);
                                    var7 = var3.method4529(1329762310);
                                    CacheObjectLoader.method5584(1875534120);
                                    Class567.method6245(var43, var7, var6, var5, 1793989851);
                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8158) {
                                    var53 = var3.method4502((short)-10145) == 1;
                                    var5 = var3.method4517(-805328366);
                                    if(var53 != Class305.aBoolean_6032 || var5 != FontUnpacker.anInt_6465 * -414146463) {
                                       Class305.aBoolean_6032 = var53;
                                       FontUnpacker.anInt_6465 = -1800797279 * var5;
                                       Class203.method2587(Class434.aClass434_8353, -1, -1, -1322082240);
                                    }

                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8228) {
                                    var43 = var3.method4527(330079340);
                                    var5 = var3.method4518(2074434039);
                                    CacheObjectLoader.method5584(-1242849371);
                                    Class240_Sub7_Sub1.method510(var43, var5, (byte)66);
                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(Class428.aClass428_8133 == var0.aClass428_3448) {
                                    CacheObjectLoader.method5584(-100352602);
                                    Plane.method2165(AbstractCacheData.method4679(647514803), (byte)25);
                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8140) {
                                    Class524.method5987(Class418.aClass418_7945, (byte)106);
                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8119) {
                                    RendererInfo.anInt_3080 = (var3.getByte((byte)92) << 3) * -243977653;
                                    Class104_Sub1.anInt_4068 = var3.method4502((short)-30608) * 1242138963;
                                    Class240_Sub51.anInt_7706 = (var3.method4505((byte)107) << 3) * 717194021;

                                    while(var3.index * 964952859 < 1463379377 * var0.anInt_3450) {
                                       Class418 var137 = Class618.method6615(-1865866118)[var3.readByte(1149377316)];
                                       Class524.method5987(var137, (byte)76);
                                    }

                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else if(var0.aClass428_3448 == Class428.aClass428_8123) {
                                    var43 = var3.method4519((byte)84);
                                    CacheObjectLoader.method5584(1819521822);
                                    Class240_Sub16 var138 = (Class240_Sub16)client.widgets.getNode((long)var43);
                                    if(null != var138) {
                                       Class104_Sub8.method3387(var138, true, false, (byte)-1);
                                    }

                                    if(client.aClass132_335 != null) {
                                       Class110_Sub1.method3149(client.aClass132_335, 1949784795);
                                       client.aClass132_335 = null;
                                    }

                                    var0.aClass428_3448 = null;
                                    return true;
                                 } else {
                                    int var11;
                                    if(var0.aClass428_3448 == Class428.aClass428_8172) {
                                       var43 = var3.method4518(1826567737);
                                       var5 = var3.method4519((byte)18);
                                       var6 = var3.method4480(1260717178);
                                       var7 = var3.method4480(1260717178);
                                       var48 = var3.method4529(1608442345);
                                       var9 = var3.method4502((short)-23783);
                                       CacheObjectLoader.method5584(-1653804454);
                                       if(2 == var9) {
                                          FontRenderer_Sub3.method7365(-2105490813);
                                       }

                                       int[] var99 = new int[]{var5, var43, var7, var6};
                                       client.anInt_468 = var48 * -1513750931;
                                       Class129.method1669(var48, var99, (byte)39);
                                       Class211.method2659(false, 87122072);
                                       Class240_Sub25.method4845(client.anInt_468 * 1854782309, var99, -352717657);

                                       for(var11 = 0; var11 < 112; ++var11) {
                                          client.aBooleanArray_525[var11] = true;
                                       }

                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(Class428.aClass428_8109 == var0.aClass428_3448) {
                                       client.anInt_504 = var3.readByte(-734846476) * -475127569;
                                       client.anInt_517 = -1424263917 * client.anInt_413;
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(Class428.aClass428_8221 == var0.aClass428_3448) {
                                       if(Class636.method6720(-243034353 * client.loginStage, 1923363893)) {
                                          client.anInt_450 = (int)((float)var3.readShort(-1214476561) * 2.5F) * 1995889263;
                                       } else {
                                          client.anInt_450 = var3.readShort(581345230) * -252864254;
                                       }

                                       client.anInt_517 = client.anInt_413 * -1424263917;
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(var0.aClass428_3448 == Class428.aClass428_8113) {
                                       var44 = var3.method4485(575181422);
                                       var5 = var3.readShort(1413011769);
                                       CacheObjectLoader.method5584(2108618858);
                                       Class231_Sub6.method5371(var5, var44, 2094600668);
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(var0.aClass428_3448 == Class428.aClass428_8233) {
                                       var43 = var3.readShort(357451614);
                                       client.anInt_358 = -530528059;
                                       client.anInt_544 = var43 * 93521583;
                                       client.anInt_356 = -1496610667;
                                       Class80.aCacheUnpacker_1532.hasData(client.anInt_544 * -1985343409, -1678630034);
                                       Class602.method6502(-1194383738);
                                       ByteArrayDataNode.method4543((byte)28);
                                       var5 = var3.readShort(1002624381);
                                       client.anInt_333 = var5 * 1152842935;
                                       var6 = var3.readByte(-122827655);
                                       Animator.aClass240_Sub8_9141 = new ByteArrayDataNode(var6);
                                       Animator.aClass240_Sub8_9141.putBytes(var3.data, var3.index * 964952859, var6, -144707030);
                                       var3.index += var6 * -2043502829;
                                       var0.aClass428_3448 = null;
                                       return false;
                                    } else if(Class428.aClass428_8217 == var0.aClass428_3448) {
                                       var43 = var3.readByte(-220180388);
                                       var5 = var3.readShort(1196871728);
                                       var6 = var3.method4519((byte)12);
                                       var7 = var3.readShort(639036448);
                                       CacheObjectLoader.method5584(828463854);
                                       Class240_Sub52_Sub1.method203(var6, var43, var7, var5, 1717045009);
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(Class428.aClass428_8155 == var0.aClass428_3448) {
                                       Class240_Sub41_Sub3.aClass23_1024.aClass608_202.method6544((byte)1);
                                       client.anInt_500 += -479468960;
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(var0.aClass428_3448 == Class428.aClass428_8246) {
                                       var43 = var3.method4509((byte)42);
                                       var5 = var3.method4518(1723772440);
                                       var6 = var3.method4542(1102159720);
                                       CacheObjectLoader.method5584(-300296253);
                                       Class456.method5546(var5, var6, var43, (short)-200);
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(Class428.aClass428_8199 == var0.aClass428_3448) {
                                       var43 = var3.method4480(1260717178);
                                       var5 = var3.method4518(1451549332);
                                       var6 = var3.method4531(-1826275517);
                                       CacheObjectLoader.method5584(1892873927);
                                       Class546.method6101(var5, 5, var6, var43, -541511459);
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(var0.aClass428_3448 == Class428.aClass428_8234) {
                                       var43 = var3.method4529(1881848522);
                                       if(var43 == '\uffff') {
                                          var43 = -1;
                                       }

                                       Class52.method538(var43, -1804271361);
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(Class428.aClass428_8136 == var0.aClass428_3448) {
                                       var43 = var3.method4501(-1965975883);
                                       var5 = var3.method4502((short)-21549);
                                       var6 = var3.readByte(1189606867);
                                       var7 = var3.method4462((byte)93);
                                       var48 = var3.method4529(1276035492);
                                       CacheObjectLoader.method5584(-1366758570);
                                       client.aBooleanArray_548[var5] = true;
                                       client.anIntArray_417[var5] = var7;
                                       client.anIntArray_550[var5] = var43;
                                       client.anIntArray_355[var5] = var6;
                                       client.anIntArray_464[var5] = var48;
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else if(var0.aClass428_3448 == Class428.aClass428_8230) {
                                       Class524.method5987(Class418.aClass418_7947, (byte)51);
                                       var0.aClass428_3448 = null;
                                       return true;
                                    } else {
                                       long var12;
                                       Class240_Sub49 var71;
                                       Class240_Sub49 var95;
                                       if(var0.aClass428_3448 == Class428.aClass428_8240) {
                                          var43 = var3.readShort(1811058816);
                                          if('\uffff' == var43) {
                                             var43 = -1;
                                          }

                                          var5 = var3.readShort(475669350);
                                          if(var5 == '\uffff') {
                                             var5 = -1;
                                          }

                                          var6 = var3.method4517(544848145);
                                          var7 = var3.readShort(-101366253);
                                          CacheObjectLoader.method5584(539619031);

                                          for(var48 = var43; var48 <= var5; ++var48) {
                                             var12 = (long)var48 + ((long)var6 << 32);
                                             var95 = (Class240_Sub49)client.aNodeArrayList_521.getNode(var12);
                                             if(var95 == null) {
                                                if(var48 == -1) {
                                                   var71 = new Class240_Sub49(RSServerQueue.getInterface(var6, (byte)105).aClass240_Sub49_2504.anInt_7693 * -1992444447, var7);
                                                } else {
                                                   var71 = new Class240_Sub49(0, var7);
                                                }
                                             } else {
                                                var71 = new Class240_Sub49(var95.anInt_7693 * -1992444447, var7);
                                                var95.shiftNext();
                                             }

                                             client.aNodeArrayList_521.insert(var71, var12);
                                          }

                                          var0.aClass428_3448 = null;
                                          return true;
                                       } else if(var0.aClass428_3448 == Class428.aClass428_8175) {
                                          var43 = var3.method4480(1260717178);
                                          var5 = var3.method4519((byte)84);
                                          CacheObjectLoader.method5584(854023740);
                                          Plane.method2167(var43, var5, -2134330127);
                                          var0.aClass428_3448 = null;
                                          return true;
                                       } else {
                                          int var15;
                                          int var17;
                                          int var16;
                                          int var18;
                                          int var22;
                                          int var90;
                                          boolean var115;
                                          if(Class428.aClass428_8146 == var0.aClass428_3448) {
                                             var43 = var3.readShort(1474257695);
                                             var5 = var3.method4462((byte)121);
                                             var6 = var3.method4529(2076289914);
                                             if('\uffff' == var6) {
                                                var6 = -1;
                                             }

                                             var7 = var3.readByte(1563521912);
                                             var48 = var3.method4480(1260717178);
                                             var9 = var3.readShort(-1139557517);
                                             var10 = var5 & 7;
                                             var11 = var5 >> 3 & 15;
                                             if(15 == var11) {
                                                var11 = -1;
                                             }

                                             boolean var109 = 1 == (var5 >> 7 & 1);
                                             int var114;
                                             int var121;
                                             if(0 != var48 >> 30) {
                                                MapPoint var96 = client.aClass296_348.getMapArea();
                                                var16 = var48 >> 28 & 3;
                                                var17 = (var48 >> 14 & 16383) - var96.loadedMapX * 1265321541;
                                                var18 = (var48 & 16383) - var96.loadedMapY * -1996781083;
                                                if(var17 >= 0 && var18 >= 0 && var17 < client.aClass296_348.getMaxX((byte)-67) && var18 < client.aClass296_348.getMaxY(1716587606)) {
                                                   if(var6 == -1) {
                                                      Class240_Sub22_Sub6 var116 = (Class240_Sub22_Sub6)client.aNodeArrayList_277.getNode((long)(var17 << 16 | var18));
                                                      if(null != var116) {
                                                         var116.aClass563_Sub1_Sub4_Sub2_1237.method2244(-1619882487);
                                                         var116.shiftNext();
                                                      }
                                                   } else {
                                                      var90 = 512 * var17 + 256;
                                                      var114 = 256 + 512 * var18;
                                                      var121 = var16;
                                                      if(var16 < 3 && client.aClass296_348.method3753().method3646(var17, var18, (byte)0)) {
                                                         var121 = var16 + 1;
                                                      }

                                                      Class563_Sub1_Sub4_Sub2 var102 = new Class563_Sub1_Sub4_Sub2(client.aClass296_348.getWorldObjects(), var6, var9, var16, var121, var90, CompProfile.getHeight(var90, var114, var16) - var43, var114, var17, var17, var18, var18, var10, var109, 0);
                                                      client.aNodeArrayList_277.insert(new Class240_Sub22_Sub6(var102), (long)(var17 << 16 | var18));
                                                   }
                                                }
                                             } else {
                                                Animation var103;
                                                Class567 var105;
                                                Animation var125;
                                                if(var48 >> 29 != 0) {
                                                   var15 = var48 & '\uffff';
                                                   Class240_Sub9 var104 = (Class240_Sub9)client.npcNodeList.getNode((long)var15);
                                                   if(var104 != null) {
                                                      NPC var127 = (NPC)var104.anObject_6783;
                                                      Class322 var128 = var127.aClass322Array_4319[var7];
                                                      if(var6 == '\uffff') {
                                                         var6 = -1;
                                                      }

                                                      boolean var101 = true;
                                                      var114 = var128.animationID * -1769281411;
                                                      if(-1 != var6 && -1 != var114) {
                                                         if(var114 == var6) {
                                                            var105 = Class75.aClass558_1422.method6164(var6, (byte)62);
                                                            if(var105.aBoolean_9630 && -1632377741 * var105.animationID != -1) {
                                                               var103 = Class88.animeUnpacker.loadAnimation(var105.animationID * -1632377741);
                                                               int var108 = -84331573 * var103.anInt_10104;
                                                               if(var108 != 0 && var108 != 2) {
                                                                  if(var108 == 1) {
                                                                     var101 = true;
                                                                  }
                                                               } else {
                                                                  var101 = false;
                                                               }
                                                            }
                                                         } else {
                                                            var105 = Class75.aClass558_1422.method6164(var6, (byte)64);
                                                            Class567 var106 = Class75.aClass558_1422.method6164(var114, (byte)-35);
                                                            if(-1 != var105.animationID * -1632377741 && -1 != var106.animationID * -1632377741) {
                                                               var125 = Class88.animeUnpacker.loadAnimation(-1632377741 * var105.animationID);
                                                               Animation var130 = Class88.animeUnpacker.loadAnimation(-1632377741 * var106.animationID);
                                                               if(var125.anInt_10113 * 459293499 < var130.anInt_10113 * 459293499) {
                                                                  var101 = false;
                                                               }
                                                            }
                                                         }
                                                      }

                                                      if(var101) {
                                                         var128.animationID = var6 * 1431556309;
                                                         var128.anInt_6206 = var43 * 263455693;
                                                         var128.anInt_6209 = 1913081999 * var11;
                                                         if(-1 != var6) {
                                                            var105 = Class75.aClass558_1422.method6164(var6, (byte)-68);
                                                            var22 = var105.aBoolean_9630?0:2;
                                                            if(var109) {
                                                               var22 = 1;
                                                            }

                                                            var128.anime.animate(-1632377741 * var105.animationID, var9, var22, false, (byte)-62);
                                                         } else {
                                                            var128.anime.animate(-1, 1593151072);
                                                         }
                                                      }
                                                   }
                                                } else if(0 != var48 >> 28) {
                                                   var15 = var48 & '\uffff';
                                                   Player var107;
                                                   if(var15 == client.anInt_438 * -719726693) {
                                                      var107 = Class521.myPlayer;
                                                   } else {
                                                      var107 = client.aPlayerArray[var15];
                                                   }

                                                   if(null != var107) {
                                                      Class322 var129 = var107.aClass322Array_4319[var7];
                                                      if('\uffff' == var6) {
                                                         var6 = -1;
                                                      }

                                                      var115 = true;
                                                      var90 = var129.animationID * -1769281411;
                                                      Class567 var120;
                                                      if(-1 != var6 && var90 != -1) {
                                                         if(var90 == var6) {
                                                            var120 = Class75.aClass558_1422.method6164(var6, (byte)81);
                                                            if(var120.aBoolean_9630 && -1 != -1632377741 * var120.animationID) {
                                                               Animation var126 = Class88.animeUnpacker.loadAnimation(var120.animationID * -1632377741);
                                                               var22 = -84331573 * var126.anInt_10104;
                                                               if(var22 != 0 && 2 != var22) {
                                                                  if(1 == var22) {
                                                                     var115 = true;
                                                                  }
                                                               } else {
                                                                  var115 = false;
                                                               }
                                                            }
                                                         } else {
                                                            var120 = Class75.aClass558_1422.method6164(var6, (byte)-100);
                                                            var105 = Class75.aClass558_1422.method6164(var90, (byte)-56);
                                                            if(-1 != var120.animationID * -1632377741 && -1632377741 * var105.animationID != -1) {
                                                               var103 = Class88.animeUnpacker.loadAnimation(-1632377741 * var120.animationID);
                                                               var125 = Class88.animeUnpacker.loadAnimation(var105.animationID * -1632377741);
                                                               if(459293499 * var103.anInt_10113 < var125.anInt_10113 * 459293499) {
                                                                  var115 = false;
                                                               }
                                                            }
                                                         }
                                                      }

                                                      if(var115) {
                                                         var129.animationID = var6 * 1431556309;
                                                         var129.anInt_6206 = var43 * 263455693;
                                                         var129.anInt_6209 = 1913081999 * var11;
                                                         var129.anInt_6205 = var10 * 665926787;
                                                         if(var6 != -1) {
                                                            var120 = Class75.aClass558_1422.method6164(var6, (byte)61);
                                                            var121 = var120.aBoolean_9630?0:2;
                                                            if(var109) {
                                                               var121 = 1;
                                                            }

                                                            var129.anime.animate(-1632377741 * var120.animationID, var9, var121, false, (byte)-65);
                                                         } else {
                                                            var129.anime.animate(-1, 1593151072);
                                                         }
                                                      }
                                                   }
                                                }
                                             }

                                             var0.aClass428_3448 = null;
                                             return true;
                                          } else if(var0.aClass428_3448 == Class428.aClass428_8168) {
                                             var43 = var3.method4519((byte)-56);
                                             var5 = var3.method4519((byte)-35);
                                             CacheObjectLoader.method5584(-1732512793);
                                             Class373.method4753(var43, var5, 286226398);
                                             var0.aClass428_3448 = null;
                                             return true;
                                          } else {
                                             String var58;
                                             if(Class428.aClass428_8247 == var0.aClass428_3448) {
                                                var44 = var3.method4485(-1800058702);
                                                var5 = var3.readShort(-218796353);
                                                var58 = Class525.aClass490_9274.method5748(var5, (byte)7).method2679(var3, -1645410887);
                                                Class554.method6138(19, 0, var44, var44, var44, var58, (String)null, var5, 1658852827);
                                                var0.aClass428_3448 = null;
                                                return true;
                                             } else if(Class428.aClass428_8121 == var0.aClass428_3448) {
                                                var43 = var3.method4462((byte)7);
                                                var5 = var3.readByte(-1117903001);
                                                var6 = var3.method4501(-1965975883);
                                                var7 = var3.method4531(-2022915616) << 2;
                                                var48 = var3.method4502((short)-26692);
                                                CacheObjectLoader.method5584(-477633677);
                                                Class192.method2512(var43, var6, var7, var5, var48, true, 1204559615);
                                                var0.aClass428_3448 = null;
                                                return true;
                                             } else if(var0.aClass428_3448 == Class428.aClass428_8130) {
                                                var43 = var3.readShort(1269807899);
                                                if(var43 == '\uffff') {
                                                   var43 = -1;
                                                }

                                                var5 = var3.method4519((byte)54);
                                                var6 = var3.method4480(1260717178);
                                                var7 = var3.method4529(1601673102);
                                                if(var7 == '\uffff') {
                                                   var7 = -1;
                                                }

                                                CacheObjectLoader.method5584(368820952);

                                                for(var48 = var7; var48 <= var43; ++var48) {
                                                   var12 = (long)var48 + ((long)var5 << 32);
                                                   var95 = (Class240_Sub49)client.aNodeArrayList_521.getNode(var12);
                                                   if(var95 == null) {
                                                      if(-1 == var48) {
                                                         var71 = new Class240_Sub49(var6, RSServerQueue.getInterface(var5, (byte)105).aClass240_Sub49_2504.anInt_7701 * -13045859);
                                                      } else {
                                                         var71 = new Class240_Sub49(var6, -1);
                                                      }
                                                   } else {
                                                      var71 = new Class240_Sub49(var6, var95.anInt_7701 * -13045859);
                                                      var95.shiftNext();
                                                   }

                                                   client.aNodeArrayList_521.insert(var71, var12);
                                                }

                                                var0.aClass428_3448 = null;
                                                return true;
                                             } else if(var0.aClass428_3448 == Class428.aClass428_8235) {
                                                if(Class506.aBoolean_9125 && Class102.aFrame_1967 != null) {
                                                   Class522.method5974(Class104_Sub21.renderSettings.aClass540_Sub13_7311.method1694(783234315), -1, -1, false, -1620225053);
                                                }

                                                var57 = new byte[1463379377 * var0.anInt_3450];
                                                var3.method295(var57, 0, var0.anInt_3450 * 1463379377, 423063671);
                                                var54 = Class537.bytesToString(var57, 0, 1463379377 * var0.anInt_3450, 1285002838);
                                                if(!client.aBoolean_452 || !client.method181(var54, 1, -1304381382)) {
                                                   Class167.method2082(var54, true, client.aBoolean_285, (byte)-21);
                                                }

                                                var0.aClass428_3448 = null;
                                                return true;
                                             } else if(Class428.aClass428_8126 == var0.aClass428_3448) {
                                                Class104_Sub1.anInt_4068 = var3.method4502((short)-6280) * 1242138963;
                                                Class240_Sub51.anInt_7706 = (var3.method4524(-25913821) << 3) * 717194021;
                                                RendererInfo.anInt_3080 = (var3.method4524(-25913821) << 3) * -243977653;
                                                MapPoint var132 = client.aClass296_348.getMapArea();

                                                for(Class240_Sub25 var134 = (Class240_Sub25)client.groundItems.start(); var134 != null; var134 = (Class240_Sub25)client.groundItems.next()) {
                                                   var6 = (int)(var134.id * 4058728944299054175L >> 28 & 3L);
                                                   var7 = (int)(4058728944299054175L * var134.id & 16383L);
                                                   var48 = var7 - 1265321541 * var132.loadedMapX;
                                                   var9 = (int)(var134.id * 4058728944299054175L >> 14 & 16383L);
                                                   var10 = var9 - -1996781083 * var132.loadedMapY;
                                                   if(var6 == 808166107 * Class104_Sub1.anInt_4068 && var48 >= RendererInfo.anInt_3080 * 1568180067 && var48 < 8 + RendererInfo.anInt_3080 * 1568180067 && var10 >= Class240_Sub51.anInt_7706 * -1538989907 && var10 < -1538989907 * Class240_Sub51.anInt_7706 + 8) {
                                                      var134.shiftNext();
                                                      if(var48 >= 0 && var10 >= 0 && var48 < client.aClass296_348.getMaxX((byte)-56) && var10 < client.aClass296_348.getMaxY(-734712510)) {
                                                         Class377_Sub1.method5409(808166107 * Class104_Sub1.anInt_4068, var48, var10, (byte)92);
                                                      }
                                                   }
                                                }

                                                Class240_Sub30 var135;
                                                for(var135 = (Class240_Sub30)Class240_Sub30.aNodeList_7421.getBaseNode_2((byte)21); var135 != null; var135 = (Class240_Sub30)Class240_Sub30.aNodeList_7421.getNext(-1094014423)) {
                                                   if(-1480406251 * var135.anInt_7409 >= 1568180067 * RendererInfo.anInt_3080 && var135.anInt_7409 * -1480406251 < 1568180067 * RendererInfo.anInt_3080 + 8 && var135.anInt_7422 * -1398294791 >= Class240_Sub51.anInt_7706 * -1538989907 && var135.anInt_7422 * -1398294791 < 8 + Class240_Sub51.anInt_7706 * -1538989907 && var135.anInt_7423 * -511987961 == 808166107 * Class104_Sub1.anInt_4068) {
                                                      var135.aBoolean_7420 = true;
                                                   }
                                                }

                                                for(var135 = (Class240_Sub30)Class240_Sub30.aNodeList_7408.getBaseNode_2((byte)72); var135 != null; var135 = (Class240_Sub30)Class240_Sub30.aNodeList_7408.getNext(-153113398)) {
                                                   if(-1480406251 * var135.anInt_7409 >= RendererInfo.anInt_3080 * 1568180067 && -1480406251 * var135.anInt_7409 < 1568180067 * RendererInfo.anInt_3080 + 8 && -1398294791 * var135.anInt_7422 >= -1538989907 * Class240_Sub51.anInt_7706 && var135.anInt_7422 * -1398294791 < 8 + Class240_Sub51.anInt_7706 * -1538989907 && Class104_Sub1.anInt_4068 * 808166107 == -511987961 * var135.anInt_7423) {
                                                      var135.aBoolean_7420 = true;
                                                   }
                                                }

                                                var0.aClass428_3448 = null;
                                                return true;
                                             } else {
                                                boolean var20;
                                                boolean var61;
                                                boolean var76;
                                                String var119;
                                                if(Class428.aClass428_8099 == var0.aClass428_3448) {
                                                   while(var3.index * 964952859 < var0.anInt_3450 * 1463379377) {
                                                      var53 = var3.readByte(593396612) == 1;
                                                      var54 = var3.method4485(243796102);
                                                      var58 = var3.method4485(1055240505);
                                                      var7 = var3.readShort(67293897);
                                                      var48 = var3.readByte(-193603253);
                                                      var9 = var3.readByte(767812954);
                                                      var76 = (var9 & 2) != 0;
                                                      boolean var72 = 0 != (var9 & 1);
                                                      String var89 = "";
                                                      var15 = -1;
                                                      var16 = 0;
                                                      if(var7 > 0) {
                                                         var89 = var3.method4485(-1558008986);
                                                         var15 = var3.readByte(-275692008);
                                                         var16 = var3.method4480(1260717178);
                                                      }

                                                      var119 = var3.method4485(490055802);
                                                      var18 = 0;

                                                      while(true) {
                                                         if(var18 < client.friendsCount * -1301826725) {
                                                            label1756: {
                                                               FriendPlayer var113 = client.friendsList[var18];
                                                               if(!var53) {
                                                                  if(var54.equals(var113.aString_51)) {
                                                                     if(var7 != var113.anInt_50 * -761711707) {
                                                                        var20 = true;

                                                                        for(Class231_Sub3 var112 = (Class231_Sub3)client.aClass512_496.method5930((byte)-1); var112 != null; var112 = (Class231_Sub3)client.aClass512_496.method5933(-1628176060)) {
                                                                           if(var112.aString_7899.equals(var54)) {
                                                                              if(var7 != 0 && 0 == var112.aShort_7898) {
                                                                                 var112.method2931(-834561526);
                                                                                 var20 = false;
                                                                              } else if(0 == var7 && var112.aShort_7898 != 0) {
                                                                                 var112.method2931(-1897569469);
                                                                                 var20 = false;
                                                                              }
                                                                           }
                                                                        }

                                                                        if(var20) {
                                                                           client.aClass512_496.method5931(new Class231_Sub3(var54, var7), 604944040);
                                                                        }

                                                                        var113.anInt_50 = var7 * -1737065427;
                                                                     }

                                                                     var113.aString_46 = var58;
                                                                     var113.aString_48 = var89;
                                                                     var113.anInt_49 = var48 * 2078594375;
                                                                     var113.anInt_52 = var15 * -608153043;
                                                                     var113.aBoolean_45 = var76;
                                                                     var113.aBoolean_53 = var72;
                                                                     var113.aString_47 = var119;
                                                                     var113.anInt_54 = var16 * 1735787553;
                                                                     var54 = null;
                                                                     break label1756;
                                                                  }
                                                               } else if(var58.equals(var113.aString_51)) {
                                                                  var113.aString_51 = var54;
                                                                  var113.aString_46 = var58;
                                                                  var54 = null;
                                                                  break label1756;
                                                               }

                                                               ++var18;
                                                               continue;
                                                            }
                                                         }

                                                         if(var54 != null && client.friendsCount * -1301826725 < 200) {
                                                            FriendPlayer var124 = new FriendPlayer();
                                                            client.friendsList[-1301826725 * client.friendsCount] = var124;
                                                            var124.aString_51 = var54;
                                                            var124.aString_46 = var58;
                                                            var124.anInt_50 = var7 * -1737065427;
                                                            var124.aString_48 = var89;
                                                            var124.anInt_49 = 2078594375 * var48;
                                                            var124.anInt_52 = var15 * -608153043;
                                                            var124.aBoolean_45 = var76;
                                                            var124.aBoolean_53 = var72;
                                                            var124.aString_47 = var119;
                                                            var124.anInt_54 = 1735787553 * var16;
                                                            client.friendsCount += -1088863021;
                                                         }
                                                         break;
                                                      }
                                                   }

                                                   client.anInt_567 = 1639294978;
                                                   client.anInt_512 = -490132939 * client.anInt_413;
                                                   var53 = false;
                                                   var5 = -1301826725 * client.friendsCount;

                                                   while(var5 > 0) {
                                                      var53 = true;
                                                      --var5;

                                                      for(var6 = 0; var6 < var5; ++var6) {
                                                         var61 = false;
                                                         FriendPlayer var80 = client.friendsList[var6];
                                                         FriendPlayer var93 = client.friendsList[var6 + 1];
                                                         if(var80.anInt_50 * -761711707 != Class503.aConnectionDesc_9108.id * -1543224839 && -1543224839 * Class503.aConnectionDesc_9108.id == var93.anInt_50 * -761711707) {
                                                            var61 = true;
                                                         }

                                                         if(!var61 && -761711707 * var80.anInt_50 == 0 && -761711707 * var93.anInt_50 != 0) {
                                                            var61 = true;
                                                         }

                                                         if(!var61 && !var80.aBoolean_45 && var93.aBoolean_45) {
                                                            var61 = true;
                                                         }

                                                         if(!var61 && !var80.aBoolean_53 && var93.aBoolean_53) {
                                                            var61 = true;
                                                         }

                                                         if(var61) {
                                                            FriendPlayer var92 = client.friendsList[var6];
                                                            client.friendsList[var6] = client.friendsList[1 + var6];
                                                            client.friendsList[1 + var6] = var92;
                                                            var53 = false;
                                                         }
                                                      }

                                                      if(var53) {
                                                         break;
                                                      }
                                                   }

                                                   var0.aClass428_3448 = null;
                                                   return true;
                                                } else {
                                                   String var55;
                                                   String var59;
                                                   if(Class428.aClass428_8098 == var0.aClass428_3448) {
                                                      var43 = var3.method4490((byte)0);
                                                      var5 = var3.method4480(1260717178);
                                                      var6 = var3.readByte(254621132);
                                                      var55 = "";
                                                      var59 = var55;
                                                      if(0 != (var6 & 1)) {
                                                         var55 = var3.method4485(-2001505825);
                                                         if((var6 & 2) != 0) {
                                                            var59 = var3.method4485(1042188906);
                                                         } else {
                                                            var59 = var55;
                                                         }
                                                      }

                                                      String var81 = var3.method4485(1179563440);
                                                      if(99 == var43) {
                                                         Class19.addStringToConsole(var81, 640186737);
                                                      } else if(var43 == 98) {
                                                         RSServer.method6291(var81, -641499215);
                                                      } else {
                                                         if(!var59.equals("") && Class479.method5700(var59, (byte)66)) {
                                                            var0.aClass428_3448 = null;
                                                            return true;
                                                         }

                                                         Class634.method6708(var43, var5, var55, var59, var55, var81, (byte)49);
                                                      }

                                                      var0.aClass428_3448 = null;
                                                      return true;
                                                   } else {
                                                      int var14;
                                                      boolean var77;
                                                      String var88;
                                                      if(Class428.aClass428_8096 == var0.aClass428_3448) {
                                                         var43 = var3.readShort(653604324);
                                                         Player var133;
                                                         if(var43 == -719726693 * client.anInt_438) {
                                                            var133 = Class521.myPlayer;
                                                         } else {
                                                            var133 = client.aPlayerArray[var43];
                                                         }

                                                         if(null == var133) {
                                                            var0.aClass428_3448 = null;
                                                            return true;
                                                         } else {
                                                            var6 = var3.readShort(-1015155175);
                                                            var7 = var3.readByte(340589199);
                                                            boolean var74 = (var6 & '\u8000') != 0;
                                                            if(var133.playerName != null && var133.composite != null) {
                                                               var77 = false;
                                                               if(var7 <= 1) {
                                                                  if(!var74 && (client.aBoolean_499 && !client.aBoolean_444 || client.aBoolean_447)) {
                                                                     var77 = true;
                                                                  } else if(Class479.method5700(var133.playerName, (byte)89)) {
                                                                     var77 = true;
                                                                  }
                                                               }

                                                               if(!var77) {
                                                                  var11 = -1;
                                                                  if(var74) {
                                                                     var6 &= 32767;
                                                                     Class420 var85 = Class240_Sub32.method4883(var3, 555801943);
                                                                     var11 = var85.anInt_7968 * -405493655;
                                                                     var88 = var85.aClass240_Sub22_Sub16_7967.method2679(var3, -1215586313);
                                                                  } else {
                                                                     var88 = Class86.method1129(Class506.method5869(var3, (byte)-5), 285311039);
                                                                  }

                                                                  var133.method1006(var88.trim(), var6 >> 8, var6 & 255, (byte)24);
                                                                  if(var7 >= 1) {
                                                                     var14 = var74?17:1;
                                                                  } else {
                                                                     var14 = var74?17:2;
                                                                  }

                                                                  if(var7 >= 1) {
                                                                     Class554.method6138(var14, 0, Class3.method12(var7 - 1, -1553609774) + var133.getName(true, 1767935208), Class3.method12(var7 - 1, -1553609774) + var133.method997(false, -2073264189), var133.aString_1467, var88, (String)null, var11, 304719044);
                                                                  } else {
                                                                     Class554.method6138(var14, 0, var133.getName(true, 389690930), var133.method997(false, 586313870), var133.aString_1467, var88, (String)null, var11, 1557219800);
                                                                  }
                                                               }
                                                            }

                                                            var0.aClass428_3448 = null;
                                                            return true;
                                                         }
                                                      } else {
                                                         boolean var62;
                                                         if(Class428.aClass428_8159 == var0.aClass428_3448) {
                                                            var43 = var3.method4518(1445710278);
                                                            var62 = var3.readByte(1153158397) == 1;
                                                            CacheObjectLoader.method5584(358119847);
                                                            Class599.method6485(var43, var62, -1259763528);
                                                            var0.aClass428_3448 = null;
                                                            return true;
                                                         } else if(Class428.aClass428_8169 == var0.aClass428_3448) {
                                                            Class430.aClass517_8266 = Class303.method3829(var3.readByte(1284161923), 1095803439);
                                                            var0.aClass428_3448 = null;
                                                            return true;
                                                         } else if(Class428.aClass428_8143 == var0.aClass428_3448) {
                                                            var43 = var3.method4518(1796866896);
                                                            var5 = var3.method4531(-20183892);
                                                            var6 = var3.method4480(1260717178);
                                                            CacheObjectLoader.method5584(-141969011);
                                                            Class546.method6101(var43, 3, var5, var6, -541511459);
                                                            var0.aClass428_3448 = null;
                                                            return true;
                                                         } else if(var0.aClass428_3448 == Class428.aClass428_8135) {
                                                            var43 = var3.method4480(1260717178);
                                                            var5 = var3.method4480(1260717178);
                                                            Class240_Sub27 var122 = Class47_Sub1.method3496(Class326.aClass326_6313, var0.aClass528_3433, 1917447504);
                                                            var122.aClass240_Sub8_Sub1_7370.putByte(client.fps * 2143956159, 203232712);
                                                            var122.aClass240_Sub8_Sub1_7370.method4515(var43, 480745877);
                                                            var122.aClass240_Sub8_Sub1_7370.method4515(var5, -224715733);
                                                            var0.addPacket(var122, -73305355);
                                                            var0.aClass428_3448 = null;
                                                            return true;
                                                         } else if(Class428.aClass428_8249 == var0.aClass428_3448) {
                                                            var43 = var3.method4462((byte)94);
                                                            var5 = var3.readByte(-1032824945);
                                                            var6 = var3.method4529(2058062080) << 2;
                                                            var7 = var3.readByte(-596190432);
                                                            var48 = var3.method4502((short)-15594);
                                                            CacheObjectLoader.method5584(795755714);
                                                            Class167.method2083(var7, var5, var6, var48, var43, 1282265481);
                                                            var0.aClass428_3448 = null;
                                                            return true;
                                                         } else {
                                                            byte var8;
                                                            if(Class428.aClass428_8182 == var0.aClass428_3448) {
                                                               var44 = var3.method4485(1008775642);
                                                               var50 = var3.readByte(-872086508) == 1;
                                                               if(var50) {
                                                                  var54 = var3.method4485(1027330461);
                                                               } else {
                                                                  var54 = var44;
                                                               }

                                                               var7 = var3.readShort(1408512622);
                                                               var8 = var3.getByte((byte)100);
                                                               var77 = false;
                                                               if(var8 == -128) {
                                                                  var77 = true;
                                                               }

                                                               if(var77) {
                                                                  if(0 == 1282766579 * Class298.anInt_5996) {
                                                                     var0.aClass428_3448 = null;
                                                                     return true;
                                                                  }

                                                                  var76 = false;

                                                                  for(var10 = 0; var10 < 1282766579 * Class298.anInt_5996 && (!ScreenCharText.aClass214Array_6170[var10].aString_3710.equals(var54) || var7 != 948065465 * ScreenCharText.aClass214Array_6170[var10].anInt_3713); ++var10) {
                                                                     ;
                                                                  }

                                                                  if(var10 < 1282766579 * Class298.anInt_5996) {
                                                                     while(var10 < 1282766579 * Class298.anInt_5996 - 1) {
                                                                        ScreenCharText.aClass214Array_6170[var10] = ScreenCharText.aClass214Array_6170[var10 + 1];
                                                                        ++var10;
                                                                     }

                                                                     Class298.anInt_5996 -= -196242885;
                                                                     ScreenCharText.aClass214Array_6170[Class298.anInt_5996 * 1282766579] = null;
                                                                  }
                                                               } else {
                                                                  var88 = var3.method4485(1125248256);
                                                                  Class214 var70 = new Class214();
                                                                  var70.aString_3711 = var44;
                                                                  var70.aString_3710 = var54;
                                                                  var70.aString_3715 = Class606.method6518(var70.aString_3710, Class123.aClass436_2275, -1215862968);
                                                                  var70.anInt_3713 = var7 * 708014473;
                                                                  var70.aByte_3712 = var8;
                                                                  var70.aString_3714 = var88;

                                                                  for(var14 = 1282766579 * Class298.anInt_5996 - 1; var14 >= 0; --var14) {
                                                                     var15 = ScreenCharText.aClass214Array_6170[var14].aString_3715.compareTo(var70.aString_3715);
                                                                     if(var15 == 0) {
                                                                        ScreenCharText.aClass214Array_6170[var14].anInt_3713 = 708014473 * var7;
                                                                        ScreenCharText.aClass214Array_6170[var14].aByte_3712 = var8;
                                                                        ScreenCharText.aClass214Array_6170[var14].aString_3714 = var88;
                                                                        if(var54.equals(Class521.myPlayer.playerName)) {
                                                                           Class40.aByte_880 = var8;
                                                                        }

                                                                        client.anInt_513 = client.anInt_413 * -1050299845;
                                                                        var0.aClass428_3448 = null;
                                                                        return true;
                                                                     }

                                                                     if(var15 < 0) {
                                                                        break;
                                                                     }
                                                                  }

                                                                  if(1282766579 * Class298.anInt_5996 >= ScreenCharText.aClass214Array_6170.length) {
                                                                     var0.aClass428_3448 = null;
                                                                     return true;
                                                                  }

                                                                  for(var15 = 1282766579 * Class298.anInt_5996 - 1; var15 > var14; --var15) {
                                                                     ScreenCharText.aClass214Array_6170[1 + var15] = ScreenCharText.aClass214Array_6170[var15];
                                                                  }

                                                                  if(1282766579 * Class298.anInt_5996 == 0) {
                                                                     ScreenCharText.aClass214Array_6170 = new Class214[100];
                                                                  }

                                                                  ScreenCharText.aClass214Array_6170[var14 + 1] = var70;
                                                                  Class298.anInt_5996 += -196242885;
                                                                  if(var54.equals(Class521.myPlayer.playerName)) {
                                                                     Class40.aByte_880 = var8;
                                                                  }
                                                               }

                                                               client.anInt_513 = -1050299845 * client.anInt_413;
                                                               var0.aClass428_3448 = null;
                                                               return true;
                                                            } else if(Class428.aClass428_8255 == var0.aClass428_3448) {
                                                               var43 = var3.readByte(-182091509);
                                                               var5 = var3.readShort(1002850835);
                                                               if(var5 == '\uffff') {
                                                                  var5 = -1;
                                                               }

                                                               var6 = var3.method4513(-2044814056);
                                                               Class210.method2652(var5, var6, var43, -378106990);
                                                               var0.aClass428_3448 = null;
                                                               return true;
                                                            } else if(Class428.aClass428_8134 == var0.aClass428_3448) {
                                                               Class542.aClass43_Sub1_9475.method3316(var3, var0.anInt_3450 * 1463379377, 1015522074);
                                                               var0.aClass428_3448 = null;
                                                               return true;
                                                            } else if(Class428.aClass428_8186 == var0.aClass428_3448) {
                                                               var43 = var3.readByte(-670229414);
                                                               if(var3.readByte(-1051839836) == 0) {
                                                                  client.aClass301Array_286[var43] = new Class301();
                                                               } else {
                                                                  var3.index -= -2043502829;
                                                                  client.aClass301Array_286[var43] = new Class301(var3);
                                                               }

                                                               client.anInt_516 = client.anInt_413 * 408810233;
                                                               var0.aClass428_3448 = null;
                                                               return true;
                                                            } else if(var0.aClass428_3448 == Class428.aClass428_8102) {
                                                               var43 = var3.method4518(2062260437);
                                                               var5 = var3.method4518(1723174983);
                                                               var6 = var3.method4480(1260717178);
                                                               var7 = var3.method4517(168166186);
                                                               var48 = var3.readByte(584436127);
                                                               var9 = var3.method4527(1233875346);
                                                               var10 = var3.method4529(2060720877);
                                                               var11 = var3.method4518(1834070600);
                                                               CacheObjectLoader.method5584(226811932);
                                                               Class18.method101(var6, new Class240_Sub16_Sub1(var9, var48, var10), new int[]{var11, var7, var43, var5}, false, -167769530);
                                                               var0.aClass428_3448 = null;
                                                               return true;
                                                            } else if(var0.aClass428_3448 == Class428.aClass428_8103) {
                                                               var43 = var3.method4502((short)-12471);
                                                               var5 = var43 >> 2;
                                                               var6 = var43 & 3;
                                                               var7 = client.anIntArray_354[var5];
                                                               var48 = var3.readByte(-309575880);
                                                               var9 = var3.method4480(1260717178);
                                                               var10 = var9 >> 28 & 3;
                                                               var11 = var9 >> 14 & 16383;
                                                               var14 = var9 & 16383;
                                                               var15 = var3.method4519((byte)42);
                                                               MapPoint var94 = client.aClass296_348.getMapArea();
                                                               var11 -= 1265321541 * var94.loadedMapX;
                                                               var14 -= var94.loadedMapY * -1996781083;
                                                               CacheNodeArrayList.method6681(var10, var11, var14, var7, var5, var6, var15, var48, (short)-2454);
                                                               var0.aClass428_3448 = null;
                                                               return true;
                                                            } else if(var0.aClass428_3448 == Class428.aClass428_8226) {
                                                               var43 = var3.method4462((byte)113);
                                                               var5 = var3.method4527(837479671);
                                                               if('\uffff' == var5) {
                                                                  var5 = -1;
                                                               }

                                                               var6 = var3.method4502((short)-20673);
                                                               Class489.method5747(var5, var43, var6, -964448704);
                                                               var0.aClass428_3448 = null;
                                                               return true;
                                                            } else if(Class428.aClass428_8153 == var0.aClass428_3448) {
                                                               var43 = var3.method4517(-1104044983);
                                                               var5 = var3.method4480(1260717178);
                                                               MapPoint var123 = new MapPoint(var3.method4518(1439066463));
                                                               var7 = var3.method4480(1260717178);
                                                               var48 = var3.method4531(-606377739);
                                                               var9 = var3.method4502((short)-11931);
                                                               var10 = var9 >> 2;
                                                               var11 = var9 & 3;
                                                               var14 = var3.method4518(1594332339);
                                                               var15 = var3.method4462((byte)61);
                                                               var16 = var3.method4519((byte)73);
                                                               var17 = var3.method4518(1415746013);
                                                               CacheObjectLoader.method5584(1820173766);
                                                               Class18.method101(var5, new Class240_Sub16_Sub3(var48, var15, new Class564(var123, var10, var11, var7)), new int[]{var17, var14, var43, var16}, false, -15931699);
                                                               var0.aClass428_3448 = null;
                                                               return true;
                                                            } else {
                                                               long var25;
                                                               long var27;
                                                               boolean var73;
                                                               if(var0.aClass428_3448 == Class428.aClass428_8251) {
                                                                  var53 = var3.readByte(1904828634) == 1;
                                                                  var54 = var3.method4485(-592408455);
                                                                  var58 = var54;
                                                                  if(var53) {
                                                                     var58 = var3.method4485(-2141934831);
                                                                  }

                                                                  var25 = (long)var3.readShort(1515210600);
                                                                  var12 = (long)var3.method4479(738776218);
                                                                  var11 = var3.readByte(95699572);
                                                                  var27 = (var25 << 32) + var12;
                                                                  var73 = false;
                                                                  var17 = 0;

                                                                  while(true) {
                                                                     if(var17 >= 100) {
                                                                        if(var11 <= 1) {
                                                                           if((!client.aBoolean_499 || client.aBoolean_444) && !client.aBoolean_447) {
                                                                              if(Class479.method5700(var58, (byte)34)) {
                                                                                 var73 = true;
                                                                              }
                                                                           } else {
                                                                              var73 = true;
                                                                           }
                                                                        }
                                                                        break;
                                                                     }

                                                                     if(var27 == client.aLongArray_573[var17]) {
                                                                        var73 = true;
                                                                        break;
                                                                     }

                                                                     ++var17;
                                                                  }

                                                                  if(!var73) {
                                                                     client.aLongArray_573[client.anInt_541 * -1234911955] = var27;
                                                                     client.anInt_541 = 1098488485 * ((1 + client.anInt_541 * -1234911955) % 100);
                                                                     var119 = Class86.method1129(Class506.method5869(var3, (byte)-46), 285311039);
                                                                     if(var11 >= 1) {
                                                                        Class554.method6138(7, 0, Class3.method12(var11 - 1, -1553609774) + var54, Class3.method12(var11 - 1, -1553609774) + var58, var54, var119, (String)null, -1, 691305414);
                                                                     } else {
                                                                        Class554.method6138(3, 0, var54, var58, var54, var119, (String)null, -1, 1412713445);
                                                                     }
                                                                  }

                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8122) {
                                                                  var43 = var3.method4531(-1827038618);
                                                                  var5 = var3.readShort(-609319340);
                                                                  CacheObjectLoader.method5584(-1124243699);
                                                                  Class301.method3823(var5, var43, 0, -1906849582);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8212) {
                                                                  var43 = var3.method4529(1903546887);
                                                                  CacheObjectLoader.method5584(684514596);
                                                                  Class321.method3965(var43, (byte)1);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8192 == var0.aClass428_3448) {
                                                                  Class524.method5987(Class418.aClass418_7934, (byte)97);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8185 == var0.aClass428_3448) {
                                                                  var43 = var3.method4518(1631087700);
                                                                  CacheObjectLoader.method5584(1022255027);
                                                                  Class546.method6101(var43, 3, -719726693 * client.anInt_438, 0, -541511459);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8219 == var0.aClass428_3448) {
                                                                  Class524.method5987(Class418.aClass418_7942, (byte)50);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8239 == var0.aClass428_3448) {
                                                                  var43 = var3.readShort(1130294339);
                                                                  var5 = var3.readByte(1825218178);

                                                                  for(var50 = 1 == (var5 & 1); 964952859 * var3.index < 1463379377 * var0.anInt_3450; Class43.method402(var43, var7, var48 - 1, var9, var50, -1542229008)) {
                                                                     var7 = var3.method4490((byte)0);
                                                                     var48 = var3.readShort(1726830795);
                                                                     var9 = 0;
                                                                     if(0 != var48) {
                                                                        var9 = var3.readByte(907468074);
                                                                        if(var9 == 255) {
                                                                           var9 = var3.method4480(1260717178);
                                                                        }
                                                                     }
                                                                  }

                                                                  client.anIntArray_341[(client.anInt_278 += 189092229) * 1494744909 - 1 & 31] = var43;
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8142) {
                                                                  var43 = var3.method4480(1260717178);
                                                                  var5 = var3.method4531(-1442272665);
                                                                  if(var5 == '\uffff') {
                                                                     var5 = -1;
                                                                  }

                                                                  var6 = var3.method4518(1776035950);
                                                                  CacheObjectLoader.method5584(1400185246);
                                                                  Exception_Sub6.method1480(var43, var5, var6, -1841209174);
                                                                  ObjectDescriptor var75 = Class592.cacheObjectLoader.getObjectDescriptor(var5);
                                                                  Class567.method6245(var43, 1098903999 * var75.rotation, -1211969735 * var75.anInt_8488, 657331911 * var75.anInt_8461, 1793989851);
                                                                  Class240_Sub27.method4850(var43, 1311193087 * var75.anInt_8447, 742371687 * var75.anInt_8453, var75.anInt_8464 * 1433336613, -1323733403);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8205 == var0.aClass428_3448) {
                                                                  var43 = var3.method4517(1027445297);
                                                                  var5 = var3.method4531(866333155);
                                                                  CacheObjectLoader.method5584(-528551988);
                                                                  Class505.method5867(var43, var5, 2146406461);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8162) {
                                                                  var43 = var3.method4517(-970139066);
                                                                  var5 = var3.method4531(-1386172429);
                                                                  Class240_Sub41_Sub3.aClass23_1024.aClass608_202.method6536(Class104_Sub14.aClass212_Sub1_Sub1_10688.method5503(var5, 824148490), var43, (byte)67);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8180 == var0.aClass428_3448) {
                                                                  client.anInt_515 = client.anInt_413 * -297474241;
                                                                  var53 = var3.readByte(-752084418) == 1;
                                                                  Class80 var117 = new Class80(var3);
                                                                  Class240_Sub47 var97;
                                                                  if(var53) {
                                                                     var97 = Class104_Sub11.aClass240_Sub47_10199;
                                                                  } else {
                                                                     var97 = Class545.aClass240_Sub47_9477;
                                                                  }

                                                                  var117.method1052(var97, (byte)31);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8241) {
                                                                  client.anInt_288 = var3.method4509((byte)-73) * -1729643391;
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8124) {
                                                                  if(null == Class97.aClass178_1926) {
                                                                     Class97.aClass178_1926 = new Class178(Class522.aClass212_Sub1_Sub2_9259);
                                                                  }

                                                                  Class340 var118 = Class522.aClass212_Sub1_Sub2_9259.method5501(var3, -1423452749);
                                                                  Class97.aClass178_1926.aClass468_3082.method5622(var118.anInt_6534 * -488503965, var118.anObject_6535, (byte)47);
                                                                  client.anIntArray_509[(client.anInt_510 += 444376161) * 1004601249 - 1 & 31] = -488503965 * var118.anInt_6534;
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8187 == var0.aClass428_3448) {
                                                                  Class343.walkHereString = 1463379377 * var0.anInt_3450 > 2?var3.method4485(641367350):ServerString.walkHereStr.getText(Class599.clientLanguage, -1747394508);
                                                                  client.anInt_453 = (1463379377 * var0.anInt_3450 > 0?var3.readShort(2066862027):-1) * -1546393031;
                                                                  if(277013513 * client.anInt_453 == '\uffff') {
                                                                     client.anInt_453 = 1546393031;
                                                                  }

                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8178 == var0.aClass428_3448) {
                                                                  var43 = var3.method4517(1316280179);
                                                                  var5 = var3.method4517(-1932588995);
                                                                  CacheObjectLoader.method5584(-961650059);
                                                                  Class240_Sub16 var98 = (Class240_Sub16)client.widgets.getNode((long)var5);
                                                                  Class240_Sub16 var69 = (Class240_Sub16)client.widgets.getNode((long)var43);
                                                                  if(var69 != null) {
                                                                     Class104_Sub8.method3387(var69, null == var98 || 1320796941 * var98.widgetID != 1320796941 * var69.widgetID, false, (byte)-1);
                                                                  }

                                                                  if(var98 != null) {
                                                                     var98.shiftNext();
                                                                     client.widgets.insert(var98, (long)var43);
                                                                  }

                                                                  RSInterface var68 = RSServerQueue.getInterface(var5, (byte)105);
                                                                  if(null != var68) {
                                                                     Class110_Sub1.method3149(var68, 997947248);
                                                                  }

                                                                  var68 = RSServerQueue.getInterface(var43, (byte)105);
                                                                  if(null != var68) {
                                                                     Class110_Sub1.method3149(var68, -1056600240);
                                                                     Class20.method120(RSInterface.interfaceGroups[var68.cacheID * 1278853609 >>> 16], var68, true, 1127199620);
                                                                  }

                                                                  if(-1 != 1854782309 * client.anInt_468) {
                                                                     Class462.method5591(client.anInt_468 * 1854782309, 1, 1685123114);
                                                                  }

                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8128) {
                                                                  var43 = var3.method4480(1260717178);
                                                                  GamePack.aClass9_9270 = new Class9(var43);
                                                                  Thread var110 = new Thread(GamePack.aClass9_9270);
                                                                  var110.setPriority(1);
                                                                  var110.start();
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8202) {
                                                                  Class524.method5987(Class418.aClass418_7936, (byte)89);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8208 == var0.aClass428_3448) {
                                                                  Class524.method5987(Class418.aClass418_7941, (byte)41);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8237) {
                                                                  var43 = var3.method4480(1260717178);
                                                                  var62 = var3.method4501(-1965975883) == 1;
                                                                  CacheObjectLoader.method5584(282458106);
                                                                  Class228.method2906(var43, var62, 596034215);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8197 == var0.aClass428_3448) {
                                                                  var43 = var3.readByte(454081265);
                                                                  Class520 var100 = (Class520)Class559.method6185(Class273.method3600(244328159), var43, (byte)-33);
                                                                  if(null == var100) {
                                                                     var100 = Class520.aClass520_9239;
                                                                  }

                                                                  Class564.method6220(var100, (byte)-13);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8191) {
                                                                  var43 = var3.readShort(-1284779999);
                                                                  if(var43 == '\uffff') {
                                                                     var43 = -1;
                                                                  }

                                                                  var5 = var3.readByte(474454186);
                                                                  var6 = var3.readShort(1044752297);
                                                                  var7 = var3.readByte(987212845);
                                                                  var48 = var3.readShort(-1229597569);
                                                                  Class374.method4755(var43, var5, var6, var7, var48, -952603512);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8157) {
                                                                  var43 = var3.readShort(-727544517);
                                                                  var5 = var3.method4501(-1965975883);
                                                                  CacheObjectLoader.method5584(21345196);
                                                                  Class611.method6567(var43, var5, true, 2019557882);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(var0.aClass428_3448 == Class428.aClass428_8111) {
                                                                  var43 = var3.method4518(1880257031);
                                                                  var5 = var3.method4462((byte)106);
                                                                  var6 = var3.method4462((byte)44);
                                                                  var7 = var3.method4462((byte)87);
                                                                  var48 = var3.method4518(1911201613);
                                                                  var9 = var43 >> 28;
                                                                  var10 = var43 >> 14 & 16383;
                                                                  var11 = var43 & 16383;
                                                                  Class163.method1997(var9, var10, var11, var6, var5, var48, var7, 894788147);
                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else if(Class428.aClass428_8150 == var0.aClass428_3448) {
                                                                  var43 = var3.readByte(-314017547);
                                                                  var5 = var3.method4493(-157074556);
                                                                  if(client.aClass235Array_306[var43] != null) {
                                                                     client.aClass235Array_306[var43].method3047(client.aClass296_348.getWorldObjects(), (byte)-118);
                                                                     client.aClass235Array_306[var43] = null;
                                                                  }

                                                                  if(-1 != var5) {
                                                                     client.aClass235Array_306[var43] = new Class235(Class286.gameRenderer, var3, var5);
                                                                     client.aClass235Array_306[var43].method3049(client.aClass296_348.getWorldObjects(), -831324111);
                                                                  }

                                                                  var0.aClass428_3448 = null;
                                                                  return true;
                                                               } else {
                                                                  long var29;
                                                                  long var31;
                                                                  if(var0.aClass428_3448 == Class428.aClass428_8193) {
                                                                     var53 = var3.readByte(-1104031737) == 1;
                                                                     var54 = var3.method4485(-718638395);
                                                                     var29 = (long)var3.readShort(-158635580);
                                                                     var31 = (long)var3.method4479(738776218);
                                                                     var10 = var3.readByte(-126715386);
                                                                     long var33 = var31 + (var29 << 32);
                                                                     boolean var78 = false;
                                                                     Class240_Sub47 var82 = null;
                                                                     var82 = var53?Class104_Sub11.aClass240_Sub47_10199:Class545.aClass240_Sub47_9477;
                                                                     if(var82 == null) {
                                                                        var78 = true;
                                                                     } else {
                                                                        var17 = 0;

                                                                        while(true) {
                                                                           if(var17 >= 100) {
                                                                              if(var10 <= 1) {
                                                                                 if((!client.aBoolean_499 || client.aBoolean_444) && !client.aBoolean_447) {
                                                                                    if(Class479.method5700(var54, (byte)110)) {
                                                                                       var78 = true;
                                                                                    }
                                                                                 } else {
                                                                                    var78 = true;
                                                                                 }
                                                                              }
                                                                              break;
                                                                           }

                                                                           if(var33 == client.aLongArray_573[var17]) {
                                                                              var78 = true;
                                                                              break;
                                                                           }

                                                                           ++var17;
                                                                        }
                                                                     }

                                                                     if(!var78) {
                                                                        client.aLongArray_573[-1234911955 * client.anInt_541] = var33;
                                                                        client.anInt_541 = 1098488485 * ((1 + client.anInt_541 * -1234911955) % 100);
                                                                        var119 = Class86.method1129(Class506.method5869(var3, (byte)-67), 285311039);
                                                                        var18 = var53?41:44;
                                                                        if(var10 >= 1) {
                                                                           Class554.method6138(var18, 0, Class3.method12(var10 - 1, -1553609774) + var54, Class3.method12(var10 - 1, -1553609774) + var54, var54, var119, var82.aString_7665, -1, 2067298786);
                                                                        } else {
                                                                           Class554.method6138(var18, 0, var54, var54, var54, var119, var82.aString_7665, -1, 1657323680);
                                                                        }
                                                                     }

                                                                     var0.aClass428_3448 = null;
                                                                     return true;
                                                                  } else if(var0.aClass428_3448 == Class428.aClass428_8213) {
                                                                     var43 = var3.readShort(441052074);
                                                                     var5 = var3.readShort(1006306344);
                                                                     var6 = var3.readShort(846574182);
                                                                     CacheObjectLoader.method5584(-391208156);
                                                                     if(RSInterface.interfaceGroups[var43] != null) {
                                                                        for(var7 = var5; var7 < var6; ++var7) {
                                                                           var48 = var3.method4479(738776218);
                                                                           if(var7 < RSInterface.interfaceGroups[var43].interfaceArray.length && RSInterface.interfaceGroups[var43].interfaceArray[var7] != null) {
                                                                              RSInterface.interfaceGroups[var43].interfaceArray[var7].anInt_2571 = -1889485235 * var48;
                                                                           }
                                                                        }
                                                                     }

                                                                     var0.aClass428_3448 = null;
                                                                     return true;
                                                                  } else if(var0.aClass428_3448 == Class428.aClass428_8125) {
                                                                     Class97.aClass178_1926 = new Class178(Class522.aClass212_Sub1_Sub2_9259);
                                                                     var0.aClass428_3448 = null;
                                                                     return true;
                                                                  } else if(var0.aClass428_3448 == Class428.aClass428_8114) {
                                                                     client.anInt_576 = client.anInt_413 * -1869476561;
                                                                     var53 = var3.readByte(279611335) == 1;
                                                                     Class75 var86 = new Class75(var3);
                                                                     Class68 var83;
                                                                     if(var53) {
                                                                        var83 = Class253.aClass68_4385;
                                                                     } else {
                                                                        var83 = Class104_Sub11.aClass68_10198;
                                                                     }

                                                                     var86.method879(var83, -1574491499);
                                                                     var0.aClass428_3448 = null;
                                                                     return true;
                                                                  } else if(var0.aClass428_3448 == Class428.aClass428_8195) {
                                                                     var43 = var3.readShort(1125321347);
                                                                     var54 = var3.method4485(-1070390277);
                                                                     var50 = var3.readByte(2052774496) == 1;
                                                                     Class503.aConnectionDesc_9110 = Class503.aConnectionDesc_9108;
                                                                     Exception_Sub6_Sub1.aBoolean_3278 = var50;
                                                                     Class104_Sub2.method3146(var43, var54, 135757348);
                                                                     var2 = null;
                                                                     Class418.method5190(7, (byte)-113);
                                                                     var0.aClass428_3448 = null;
                                                                     return false;
                                                                  } else if(Class428.aClass428_8106 == var0.aClass428_3448) {
                                                                     Class267.preferenceFileList.method7712(-1459831333);
                                                                     var0.aClass428_3448 = null;
                                                                     return false;
                                                                  } else {
                                                                     long var35;
                                                                     if(Class428.aClass428_8104 == var0.aClass428_3448) {
                                                                        var53 = var3.readByte(-502799561) == 1;
                                                                        var54 = var3.method4485(-1729285648);
                                                                        var58 = var54;
                                                                        if(var53) {
                                                                           var58 = var3.method4485(-228764626);
                                                                        }

                                                                        var55 = var3.method4485(1612969487);
                                                                        var31 = (long)var3.readShort(-277486084);
                                                                        var35 = (long)var3.method4479(738776218);
                                                                        var14 = var3.readByte(-752483261);
                                                                        var15 = var3.readShort(-195416100);
                                                                        long var37 = (var31 << 32) + var35;
                                                                        var115 = false;
                                                                        var90 = 0;

                                                                        while(true) {
                                                                           if(var90 >= 100) {
                                                                              if(var14 <= 1 && Class479.method5700(var58, (byte)49)) {
                                                                                 var115 = true;
                                                                              }
                                                                              break;
                                                                           }

                                                                           if(client.aLongArray_573[var90] == var37) {
                                                                              var115 = true;
                                                                              break;
                                                                           }

                                                                           ++var90;
                                                                        }

                                                                        if(!var115) {
                                                                           client.aLongArray_573[-1234911955 * client.anInt_541] = var37;
                                                                           client.anInt_541 = (1 + -1234911955 * client.anInt_541) % 100 * 1098488485;
                                                                           String var111 = Class525.aClass490_9274.method5748(var15, (byte)86).method2679(var3, 376943974);
                                                                           if(var14 >= 1) {
                                                                              Class554.method6138(20, 0, Class3.method12(var14 - 1, -1553609774) + var54, Class3.method12(var14 - 1, -1553609774) + var58, var54, var111, var55, var15, 305610563);
                                                                           } else {
                                                                              Class554.method6138(20, 0, var54, var58, var54, var111, var55, var15, 649125185);
                                                                           }
                                                                        }

                                                                        var0.aClass428_3448 = null;
                                                                        return true;
                                                                     } else if(var0.aClass428_3448 == Class428.aClass428_8204) {
                                                                        Class125.method1608(Class11.aBoolean_97, (byte)-80);
                                                                        var0.aClass428_3448 = null;
                                                                        return false;
                                                                     } else if(var0.aClass428_3448 == Class428.aClass428_8173) {
                                                                        var43 = var3.readByte(1431073386);
                                                                        Class521 var79 = (Class521)Class559.method6185(Class428.method5310(1639232892), var43, (byte)-47);
                                                                        if(null == var79) {
                                                                           var79 = Class521.aClass521_9248;
                                                                        }

                                                                        Plane.method2163(var79, (short)11606);
                                                                        var0.aClass428_3448 = null;
                                                                        return true;
                                                                     } else {
                                                                        long var39;
                                                                        boolean var84;
                                                                        String var91;
                                                                        if(var0.aClass428_3448 == Class428.aClass428_8139) {
                                                                           var53 = var3.readByte(1174775709) == 1;
                                                                           var54 = var3.method4485(-1835371644);
                                                                           var58 = var54;
                                                                           if(var53) {
                                                                              var58 = var3.method4485(-1910465064);
                                                                           }

                                                                           var25 = (long)var3.readShort(-412699381);
                                                                           var12 = (long)var3.method4479(738776218);
                                                                           var11 = var3.readByte(-487840825);
                                                                           var14 = var3.readShort(835973400);
                                                                           var39 = (var25 << 32) + var12;
                                                                           var84 = false;
                                                                           var18 = 0;

                                                                           while(true) {
                                                                              if(var18 >= 100) {
                                                                                 if(var11 <= 1 && Class479.method5700(var58, (byte)27)) {
                                                                                    var84 = true;
                                                                                 }
                                                                                 break;
                                                                              }

                                                                              if(var39 == client.aLongArray_573[var18]) {
                                                                                 var84 = true;
                                                                                 break;
                                                                              }

                                                                              ++var18;
                                                                           }

                                                                           if(!var84) {
                                                                              client.aLongArray_573[-1234911955 * client.anInt_541] = var39;
                                                                              client.anInt_541 = 1098488485 * ((1 + -1234911955 * client.anInt_541) % 100);
                                                                              var91 = Class525.aClass490_9274.method5748(var14, (byte)54).method2679(var3, -1178384659);
                                                                              if(var11 >= 1) {
                                                                                 Class554.method6138(18, 0, Class3.method12(var11 - 1, -1553609774) + var54, Class3.method12(var11 - 1, -1553609774) + var58, var54, var91, (String)null, var14, 2059061094);
                                                                              } else {
                                                                                 Class554.method6138(18, 0, var54, var58, var54, var91, (String)null, var14, 2010286948);
                                                                              }
                                                                           }

                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8131) {
                                                                           Class36.anInt_851 = var3.method4484((byte)-3) * 1444246357;
                                                                           client.aBoolean_499 = var3.readByte(318673670) == 1;
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8160 == var0.aClass428_3448) {
                                                                           var53 = var3.readByte(-903195001) == 1;
                                                                           CacheObjectLoader.method5584(47239454);
                                                                           Class349.aBoolean_6618 = var53;
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8132) {
                                                                           var43 = var3.method4527(734828561);
                                                                           CacheObjectLoader.method5584(130971723);
                                                                           Class215.method2700(var43, (byte)-28);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8184) {
                                                                           var53 = var3.readByte(-196841234) == 1;
                                                                           if(var53) {
                                                                              Plane.method2165(2, (byte)106);
                                                                           } else {
                                                                              Plane.method2165(3, (byte)38);
                                                                           }

                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8163 == var0.aClass428_3448) {
                                                                           Class524.method5987(Class418.aClass418_7944, (byte)42);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8127) {
                                                                           Class97.aClass178_1926 = null;
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8107) {
                                                                           var49 = var3.getByte((byte)75);
                                                                           Class521.myPlayer.method990(var3, var49, -861696050);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8151 == var0.aClass428_3448) {
                                                                           var43 = var3.method4527(-415968417);
                                                                           var5 = var3.method4480(1260717178);
                                                                           CacheObjectLoader.method5584(-680086119);
                                                                           CacheNodeArrayList.method6684(var5, var43, -1913125383);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8225) {
                                                                           var53 = var3.readByte(1019386573) == 1;
                                                                           var54 = var3.method4485(-1115164136);
                                                                           var58 = var54;
                                                                           if(var53) {
                                                                              var58 = var3.method4485(-98757688);
                                                                           }

                                                                           var55 = var3.method4485(-372904078);
                                                                           var31 = (long)var3.readShort(-1120010421);
                                                                           var35 = (long)var3.method4479(738776218);
                                                                           var14 = var3.readByte(93007919);
                                                                           var39 = var35 + (var31 << 32);
                                                                           var84 = false;
                                                                           var18 = 0;

                                                                           while(true) {
                                                                              if(var18 >= 100) {
                                                                                 if(var14 <= 1) {
                                                                                    if((!client.aBoolean_499 || client.aBoolean_444) && !client.aBoolean_447) {
                                                                                       if(Class479.method5700(var58, (byte)19)) {
                                                                                          var84 = true;
                                                                                       }
                                                                                    } else {
                                                                                       var84 = true;
                                                                                    }
                                                                                 }
                                                                                 break;
                                                                              }

                                                                              if(var39 == client.aLongArray_573[var18]) {
                                                                                 var84 = true;
                                                                                 break;
                                                                              }

                                                                              ++var18;
                                                                           }

                                                                           if(!var84) {
                                                                              client.aLongArray_573[-1234911955 * client.anInt_541] = var39;
                                                                              client.anInt_541 = (1 + client.anInt_541 * -1234911955) % 100 * 1098488485;
                                                                              var91 = Class86.method1129(Class506.method5869(var3, (byte)-59), 285311039);
                                                                              if(var14 >= 1) {
                                                                                 Class554.method6138(9, 0, Class3.method12(var14 - 1, -1553609774) + var54, Class3.method12(var14 - 1, -1553609774) + var58, var54, var91, var55, -1, 975310556);
                                                                              } else {
                                                                                 Class554.method6138(9, 0, var54, var58, var54, var91, var55, -1, 834468811);
                                                                              }
                                                                           }

                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8177 == var0.aClass428_3448) {
                                                                           client.anInt_513 = -1050299845 * client.anInt_413;
                                                                           if(0 == var0.anInt_3450 * 1463379377) {
                                                                              client.aString_542 = null;
                                                                              client.aString_519 = null;
                                                                              Class298.anInt_5996 = 0;
                                                                              ScreenCharText.aClass214Array_6170 = null;
                                                                              var0.aClass428_3448 = null;
                                                                              return true;
                                                                           } else {
                                                                              client.aString_519 = var3.method4485(-1079533127);
                                                                              var53 = var3.readByte(1527255224) == 1;
                                                                              if(var53) {
                                                                                 var3.method4485(900276379);
                                                                              }

                                                                              client.aString_542 = var3.method4485(-1785270934);
                                                                              Class210.aByte_3656 = var3.getByte((byte)52);
                                                                              var5 = var3.readByte(-1061071821);
                                                                              if(255 == var5) {
                                                                                 var0.aClass428_3448 = null;
                                                                                 return true;
                                                                              } else {
                                                                                 Class298.anInt_5996 = var5 * -196242885;
                                                                                 Class214[] var60 = new Class214[100];

                                                                                 for(var7 = 0; var7 < Class298.anInt_5996 * 1282766579; ++var7) {
                                                                                    var60[var7] = new Class214();
                                                                                    var60[var7].aString_3711 = var3.method4485(-1893005521);
                                                                                    var53 = var3.readByte(878236653) == 1;
                                                                                    if(var53) {
                                                                                       var60[var7].aString_3710 = var3.method4485(2008493588);
                                                                                    } else {
                                                                                       var60[var7].aString_3710 = var60[var7].aString_3711;
                                                                                    }

                                                                                    var60[var7].aString_3715 = Class606.method6518(var60[var7].aString_3710, Class123.aClass436_2275, -1215862968);
                                                                                    var60[var7].anInt_3713 = var3.readShort(935071976) * 708014473;
                                                                                    var60[var7].aByte_3712 = var3.getByte((byte)108);
                                                                                    var60[var7].aString_3714 = var3.method4485(1712097642);
                                                                                    if(var60[var7].aString_3710.equals(Class521.myPlayer.playerName)) {
                                                                                       Class40.aByte_880 = var60[var7].aByte_3712;
                                                                                    }
                                                                                 }

                                                                                 var61 = false;
                                                                                 var9 = Class298.anInt_5996 * 1282766579;

                                                                                 while(var9 > 0) {
                                                                                    var61 = true;
                                                                                    --var9;

                                                                                    for(var10 = 0; var10 < var9; ++var10) {
                                                                                       if(var60[var10].aString_3715.compareTo(var60[var10 + 1].aString_3715) > 0) {
                                                                                          Class214 var64 = var60[var10];
                                                                                          var60[var10] = var60[1 + var10];
                                                                                          var60[1 + var10] = var64;
                                                                                          var61 = false;
                                                                                       }
                                                                                    }

                                                                                    if(var61) {
                                                                                       break;
                                                                                    }
                                                                                 }

                                                                                 ScreenCharText.aClass214Array_6170 = var60;
                                                                                 var0.aClass428_3448 = null;
                                                                                 return true;
                                                                              }
                                                                           }
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8170) {
                                                                           var43 = var3.method4519((byte)35);
                                                                           var5 = var3.method4518(1859003639);
                                                                           CacheObjectLoader.method5584(414161697);
                                                                           Class546.method6101(var5, 2, var43, -1, -541511459);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8165) {
                                                                           var43 = var3.method4531(-1402061732);
                                                                           var5 = var3.method4517(1270233641);
                                                                           Class240_Sub41_Sub3.aClass23_1024.aClass608_202.method6543(Class603.aClass212_Sub2_9897.method7527(var43, 1070881887), var5, -2117673255);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8145 == var0.aClass428_3448) {
                                                                           Class125.method1608(false, (byte)-49);
                                                                           var0.aClass428_3448 = null;
                                                                           return false;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8100) {
                                                                           var44 = var3.method4485(1458252539);
                                                                           var5 = var3.method4527(530363022);
                                                                           CacheObjectLoader.method5584(1156214990);
                                                                           Class231_Sub6.method5371(var5, var44, 1243266078);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8242) {
                                                                           var43 = var3.method4517(-470633314);
                                                                           var5 = var3.method4480(1260717178);
                                                                           CacheObjectLoader.method5584(-1202911547);
                                                                           Class240_Sub44_Sub2.method318(var5, var43, 408347063);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8214) {
                                                                           client.anInt_515 = client.anInt_413 * -297474241;
                                                                           var53 = var3.readByte(428425508) == 1;
                                                                           if(1 == var0.anInt_3450 * 1463379377) {
                                                                              if(var53) {
                                                                                 Class104_Sub11.aClass240_Sub47_10199 = null;
                                                                              } else {
                                                                                 Class545.aClass240_Sub47_9477 = null;
                                                                              }

                                                                              var0.aClass428_3448 = null;
                                                                              return true;
                                                                           } else {
                                                                              if(var53) {
                                                                                 Class104_Sub11.aClass240_Sub47_10199 = new Class240_Sub47(var3);
                                                                              } else {
                                                                                 Class545.aClass240_Sub47_9477 = new Class240_Sub47(var3);
                                                                              }

                                                                              var0.aClass428_3448 = null;
                                                                              return true;
                                                                           }
                                                                        } else if(Class428.aClass428_8207 == var0.aClass428_3448) {
                                                                           Class524.method5987(Class418.aClass418_7943, (byte)115);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8232 == var0.aClass428_3448) {
                                                                           Class524.method5987(Class418.aClass418_7946, (byte)83);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8243) {
                                                                           if(Class506.aBoolean_9125 && Class102.aFrame_1967 != null) {
                                                                              Class522.method5974(Class104_Sub21.renderSettings.aClass540_Sub13_7311.method1694(783234315), -1, -1, false, -1113194133);
                                                                           }

                                                                           var57 = new byte[1463379377 * var0.anInt_3450 - 1];
                                                                           var62 = var3.readByte(79522155) == 1;
                                                                           var3.method295(var57, 0, var0.anInt_3450 * 1463379377 - 1, 423063671);
                                                                           ByteArrayDataNode var65 = new ByteArrayDataNode(var57);
                                                                           var55 = var65.method4485(-380634311);
                                                                           if(var62) {
                                                                              var59 = var65.method4485(-1164668167);
                                                                              if(var59.length() == 0) {
                                                                                 var59 = var55;
                                                                              }

                                                                              if(!client.aBoolean_452 || Class50.aString_1050.startsWith("mac") || !Class194.method2521(var55, 1, Class332.aClass332_6414.method4106((byte)24), -8552769)) {
                                                                                 Class167.method2082(var59, true, client.aBoolean_285, (byte)32);
                                                                              }
                                                                           } else {
                                                                              Class167.method2082(var55, true, client.aBoolean_285, (byte)59);
                                                                           }

                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8129 == var0.aClass428_3448) {
                                                                           client.aBoolean_436 = var3.method4462((byte)63) == 1;
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8188 == var0.aClass428_3448) {
                                                                           client.anInt_473 = var3.method4478((byte)1) * 1016246091;
                                                                           client.anInt_517 = client.anInt_413 * -1424263917;
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8201) {
                                                                           while(var3.index * 964952859 < var0.anInt_3450 * 1463379377) {
                                                                              var43 = var3.readByte(2096811116);
                                                                              var62 = 1 == (var43 & 1);
                                                                              var58 = var3.method4485(1685104714);
                                                                              var55 = var3.method4485(767573267);
                                                                              var59 = var3.method4485(923725595);
                                                                              var9 = 0;

                                                                              while(true) {
                                                                                 if(var9 < -275736435 * client.ignoreListCount) {
                                                                                    label1943: {
                                                                                       IgnoredPlayer var67 = client.ignoreList[var9];
                                                                                       if(var62) {
                                                                                          if(var55.equals(var67.aString_111)) {
                                                                                             var67.aString_111 = var58;
                                                                                             var67.aString_112 = var55;
                                                                                             var58 = null;
                                                                                             break label1943;
                                                                                          }
                                                                                       } else if(var58.equals(var67.aString_111)) {
                                                                                          var67.aString_111 = var58;
                                                                                          var67.aString_112 = var55;
                                                                                          var67.aString_113 = var59;
                                                                                          var58 = null;
                                                                                          break label1943;
                                                                                       }

                                                                                       ++var9;
                                                                                       continue;
                                                                                    }
                                                                                 }

                                                                                 if(var58 != null && -275736435 * client.ignoreListCount < 100) {
                                                                                    IgnoredPlayer var66 = new IgnoredPlayer();
                                                                                    client.ignoreList[-275736435 * client.ignoreListCount] = var66;
                                                                                    var66.aString_111 = var58;
                                                                                    var66.aString_112 = var55;
                                                                                    var66.aString_113 = var59;
                                                                                    var66.aBoolean_110 = 2 == (var43 & 2);
                                                                                    client.ignoreListCount += 242149957;
                                                                                 }
                                                                                 break;
                                                                              }
                                                                           }

                                                                           client.anInt_512 = client.anInt_413 * -490132939;
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8118 == var0.aClass428_3448) {
                                                                           client.anInt_576 = -1869476561 * client.anInt_413;
                                                                           var53 = var3.readByte(-874051513) == 1;
                                                                           if(1 == 1463379377 * var0.anInt_3450) {
                                                                              if(var53) {
                                                                                 Class253.aClass68_4385 = null;
                                                                              } else {
                                                                                 Class104_Sub11.aClass68_10198 = null;
                                                                              }

                                                                              var0.aClass428_3448 = null;
                                                                              return true;
                                                                           } else {
                                                                              if(var53) {
                                                                                 Class253.aClass68_4385 = new Class68(var3);
                                                                              } else {
                                                                                 Class104_Sub11.aClass68_10198 = new Class68(var3);
                                                                              }

                                                                              var0.aClass428_3448 = null;
                                                                              return true;
                                                                           }
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8101) {
                                                                           var43 = var3.method4519((byte)8);
                                                                           var5 = var3.method4517(376728138);
                                                                           CacheObjectLoader.method5584(1304329545);
                                                                           Class546.method6101(var43, 1, var5, -1, -541511459);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8252 == var0.aClass428_3448) {
                                                                           var43 = var3.readByte(123950167);
                                                                           Class533 var56 = (Class533)Class559.method6185(MapIconUnpacker.method6608(158998643), var43, (byte)53);
                                                                           if(var56 == null) {
                                                                              var56 = Class533.aClass533_9341;
                                                                           }

                                                                           Class107.method1390(var56, (byte)0);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8164) {
                                                                           var53 = var3.readByte(1073594017) == 1;
                                                                           var54 = var3.method4485(-204742135);
                                                                           var29 = (long)var3.readShort(1801940441);
                                                                           var31 = (long)var3.method4479(738776218);
                                                                           var10 = var3.readByte(1980749173);
                                                                           var11 = var3.readShort(1323013305);
                                                                           var27 = (var29 << 32) + var31;
                                                                           var73 = false;
                                                                           Class240_Sub47 var87 = null;
                                                                           var87 = var53?Class104_Sub11.aClass240_Sub47_10199:Class545.aClass240_Sub47_9477;
                                                                           if(null == var87) {
                                                                              var73 = true;
                                                                           } else {
                                                                              var18 = 0;

                                                                              while(true) {
                                                                                 if(var18 >= 100) {
                                                                                    if(var10 <= 1 && Class479.method5700(var54, (byte)23)) {
                                                                                       var73 = true;
                                                                                    }
                                                                                    break;
                                                                                 }

                                                                                 if(var27 == client.aLongArray_573[var18]) {
                                                                                    var73 = true;
                                                                                    break;
                                                                                 }

                                                                                 ++var18;
                                                                              }
                                                                           }

                                                                           if(!var73) {
                                                                              client.aLongArray_573[-1234911955 * client.anInt_541] = var27;
                                                                              client.anInt_541 = 1098488485 * ((1 + client.anInt_541 * -1234911955) % 100);
                                                                              var91 = Class525.aClass490_9274.method5748(var11, (byte)114).method2679(var3, -172545728);
                                                                              var90 = var53?42:45;
                                                                              if(var10 >= 1) {
                                                                                 Class554.method6138(var90, 0, Class3.method12(var10 - 1, -1553609774) + var54, Class3.method12(var10 - 1, -1553609774) + var54, var54, var91, var87.aString_7665, var11, 2133186263);
                                                                              } else {
                                                                                 Class554.method6138(var90, 0, var54, var54, var54, var91, var87.aString_7665, var11, 1830741930);
                                                                              }
                                                                           }

                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8248) {
                                                                           var0.aClass428_3448 = null;
                                                                           return false;
                                                                        } else if(Class428.aClass428_8253 == var0.aClass428_3448) {
                                                                           Class524.method5987(Class418.aClass418_7948, (byte)22);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8196) {
                                                                           Class565.method6229(var3.method4485(1009319182), 560532665);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8245 == var0.aClass428_3448) {
                                                                           var49 = var3.method4524(-25913821);
                                                                           var5 = var3.readByte(1785368341);
                                                                           CacheObjectLoader.method5584(-1535536271);
                                                                           Class283_Sub2.method5016(var49, var5, -59359861);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8244 == var0.aClass428_3448) {
                                                                           var43 = var3.method4462((byte)101);
                                                                           var5 = var3.method4518(1884062167);
                                                                           var6 = var3.readShort(-831462981);
                                                                           var7 = var3.method4519((byte)-102);
                                                                           var48 = var3.method4518(1939062548);
                                                                           var9 = var3.method4480(1260717178);
                                                                           MapPoint var63 = new MapPoint(var3.method4480(1260717178));
                                                                           var11 = var3.method4518(1406797854);
                                                                           var14 = var3.method4531(-379314936);
                                                                           CacheObjectLoader.method5584(-426146920);
                                                                           Class18.method101(var48, new Class240_Sub16_Sub2(var6, var43, new Class573(var63, var14)), new int[]{var11, var9, var5, var7}, false, 518312020);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8216 == var0.aClass428_3448) {
                                                                           var44 = var3.method4485(1543757534);
                                                                           var54 = Class86.method1129(Class506.method5869(var3, (byte)-45), 285311039);
                                                                           Class634.method6708(6, 0, var44, var44, var44, var54, (byte)49);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8108) {
                                                                           var43 = var3.readShort(-575781482);
                                                                           var5 = var3.method4531(-275247213);
                                                                           var6 = var3.method4518(2053769598);
                                                                           var7 = var3.readShort(-1183692933);
                                                                           CacheObjectLoader.method5584(726500615);
                                                                           Class546.method6101(var6, 7, var43 << 16 | var5, var7, -541511459);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8166) {
                                                                           var43 = var3.method4480(1260717178);
                                                                           var5 = var3.method4517(-1863342760);
                                                                           var6 = var3.method4531(-10800409);
                                                                           var7 = var3.method4529(2018660541);
                                                                           var48 = var3.method4502((short)-12484);
                                                                           var9 = var3.method4519((byte)-2);
                                                                           var10 = var3.method4480(1260717178);
                                                                           var11 = var3.method4480(1260717178);
                                                                           CacheObjectLoader.method5584(1452377682);
                                                                           Class18.method101(var11, new Class240_Sub16_Sub4(var7, var48, var6), new int[]{var10, var9, var5, var43}, false, -748257344);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8210) {
                                                                           CacheObjectLoader.method5584(-111646167);
                                                                           Class210.method2655(-2060694599);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8167) {
                                                                           var43 = var3.readShort(504289912);
                                                                           var5 = var3.readByte(2123454790);
                                                                           var50 = (var5 & 1) == 1;
                                                                           Class454.method5540(var43, var50, -697684517);
                                                                           var7 = var3.readShort(-606886831);

                                                                           for(var48 = 0; var48 < var7; ++var48) {
                                                                              var9 = var3.method4462((byte)21);
                                                                              if(255 == var9) {
                                                                                 var9 = var3.method4518(1478733025);
                                                                              }

                                                                              var10 = var3.method4529(1544410235);
                                                                              Class43.method402(var43, var48, var10 - 1, var9, var50, -1833943862);
                                                                           }

                                                                           client.anIntArray_341[(client.anInt_278 += 189092229) * 1494744909 - 1 & 31] = var43;
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8231 == var0.aClass428_3448) {
                                                                           var44 = var3.method4485(1969830772);
                                                                           var5 = var3.method4462((byte)58);
                                                                           var6 = var3.method4527(2034121194);
                                                                           if(var6 == '\uffff') {
                                                                              var6 = -1;
                                                                           }

                                                                           var7 = var3.method4462((byte)35);
                                                                           if(var5 >= 1 && var5 <= 8) {
                                                                              if(var44.equalsIgnoreCase("null")) {
                                                                                 var44 = null;
                                                                              }

                                                                              client.playerOptions[var5 - 1] = var44;
                                                                              client.anIntArray_398[var5 - 1] = var6;
                                                                              client.aBooleanArray_588[var5 - 1] = 0 == var7;
                                                                           }

                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8227 == var0.aClass428_3448) {
                                                                           var43 = var3.readByte(959298989);
                                                                           Class522 var47 = (Class522)Class559.method6185(Class34_Sub2.method2743((byte)41), var43, (byte)-52);
                                                                           if(var47 == null) {
                                                                              var47 = Class522.aClass522_9256;
                                                                           }

                                                                           Class84.method1099(var47, (byte)100);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8161 == var0.aClass428_3448) {
                                                                           Class368.method4682(true, -1984052363);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8152) {
                                                                           var43 = var3.readByte(825178500);
                                                                           var5 = var43 >> 5;
                                                                           var6 = var43 & 31;
                                                                           if(var6 == 0) {
                                                                              client.hintMarkers[var5] = null;
                                                                              var0.aClass428_3448 = null;
                                                                              return true;
                                                                           } else {
                                                                              HintMarker var51 = new HintMarker();
                                                                              var51.anInt_3702 = var6 * 160632533;
                                                                              var51.spriteIndex = var3.readByte(1366409694) * 147019661;
                                                                              if(-611466427 * var51.spriteIndex >= 0 && var51.spriteIndex * -611466427 < Class240_Sub22_Sub16.hintHeadIconsSprites.length) {
                                                                                 if(var51.anInt_3702 * -2076198275 != 1 && 10 != var51.anInt_3702 * -2076198275) {
                                                                                    if(var51.anInt_3702 * -2076198275 >= 2 && -2076198275 * var51.anInt_3702 <= 6) {
                                                                                       if(-2076198275 * var51.anInt_3702 == 2) {
                                                                                          var51.markerX = -750895360;
                                                                                          var51.markerZ = 923599104;
                                                                                       }

                                                                                       if(var51.anInt_3702 * -2076198275 == 3) {
                                                                                          var51.markerX = 0;
                                                                                          var51.markerZ = 923599104;
                                                                                       }

                                                                                       if(var51.anInt_3702 * -2076198275 == 4) {
                                                                                          var51.markerX = -1501790720;
                                                                                          var51.markerZ = 923599104;
                                                                                       }

                                                                                       if(5 == var51.anInt_3702 * -2076198275) {
                                                                                          var51.markerX = -750895360;
                                                                                          var51.markerZ = 0;
                                                                                       }

                                                                                       if(6 == var51.anInt_3702 * -2076198275) {
                                                                                          var51.markerX = -750895360;
                                                                                          var51.markerZ = 1847198208;
                                                                                       }

                                                                                       var51.anInt_3702 = 321265066;
                                                                                       var51.anInt_3701 = var3.readByte(-349031898) * -35469063;
                                                                                       MapPoint var52 = client.aClass296_348.getMapArea();
                                                                                       var51.markerX += (var3.readShort(-1237482262) - var52.loadedMapX * 1265321541 << 9) * 399719999;
                                                                                       var51.markerZ += (var3.readShort(1828439953) - -1996781083 * var52.loadedMapY << 9) * -1422455551;
                                                                                       var51.anInt_3703 = (var3.readByte(1661683701) << 2) * 415459777;
                                                                                       var51.anInt_3705 = var3.readShort(1479982605) * 825749927;
                                                                                    }
                                                                                 } else {
                                                                                    var51.markerTarget = var3.readShort(93299114) * 1891346679;
                                                                                    var51.anInt_3706 = var3.readShort(940570869) * -1705241247;
                                                                                    var3.index += 415923276;
                                                                                 }

                                                                                 var51.anInt_3700 = var3.method4480(1260717178) * 1213006619;
                                                                                 client.hintMarkers[var5] = var51;
                                                                              }

                                                                              var0.aClass428_3448 = null;
                                                                              return true;
                                                                           }
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8120) {
                                                                           var43 = var3.readShort(1182033515);
                                                                           byte var45 = var3.method4505((byte)40);
                                                                           Class240_Sub41_Sub3.aClass23_1024.aClass608_202.method6536(Class104_Sub14.aClass212_Sub1_Sub1_10688.method5503(var43, 824148490), var45, (byte)121);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8105 == var0.aClass428_3448) {
                                                                           var44 = var3.method4485(990941299);
                                                                           ConnectionUpdate.method79(var44, (byte)-121);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8238 == var0.aClass428_3448) {
                                                                           var43 = var3.method4480(1260717178);
                                                                           CacheObjectLoader.method5584(-364853025);
                                                                           if(var43 == -1) {
                                                                              Class571.anInt_9652 = -1694464327;
                                                                              Class102.anInt_1968 = -1061791373;
                                                                           } else {
                                                                              MapPoint var46 = client.aClass296_348.getMapArea();
                                                                              var6 = var43 >> 14 & 16383;
                                                                              var7 = var43 & 16383;
                                                                              var6 -= var46.loadedMapX * 1265321541;
                                                                              if(var6 < 0) {
                                                                                 var6 = 0;
                                                                              } else if(var6 >= client.aClass296_348.getMaxX((byte)-54)) {
                                                                                 var6 = client.aClass296_348.getMaxX((byte)-123);
                                                                              }

                                                                              var7 -= var46.loadedMapY * -1996781083;
                                                                              if(var7 < 0) {
                                                                                 var7 = 0;
                                                                              } else if(var7 >= client.aClass296_348.getMaxY(-1680564196)) {
                                                                                 var7 = client.aClass296_348.getMaxY(425897881);
                                                                              }

                                                                              Class571.anInt_9652 = ((var6 << 9) + 256) * 1694464327;
                                                                              Class102.anInt_1968 = (256 + (var7 << 9)) * 1061791373;
                                                                           }

                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(Class428.aClass428_8215 == var0.aClass428_3448) {
                                                                           var43 = var3.method4531(927678349);
                                                                           var5 = var3.readByte(1760642829);
                                                                           if(255 == var5) {
                                                                              var5 = -1;
                                                                           }

                                                                           var6 = var3.method4509((byte)34);
                                                                           var7 = var3.method4529(1314274335);
                                                                           var8 = var3.method4524(-25913821);
                                                                           var9 = var3.method4527(-277616477);
                                                                           var10 = var3.method4502((short)-12162);
                                                                           var11 = var3.method4510(791446059);
                                                                           var14 = var3.method4501(-1965975883) * 4;
                                                                           var15 = var3.method4527(1100880605);
                                                                           var16 = var3.method4527(1968452353);
                                                                           var17 = var3.readByte(429520509);
                                                                           var18 = var3.method4529(1385448797);
                                                                           byte var19 = var3.getByte((byte)37);
                                                                           var20 = (var17 & 1) != 0;
                                                                           boolean var21 = 0 != (var17 & 2);
                                                                           var22 = var21?var17 >> 2:-1;
                                                                           if(var21) {
                                                                              var10 = (byte)var10;
                                                                           } else {
                                                                              var10 *= 4;
                                                                           }

                                                                           MapPoint var23 = client.aClass296_348.getMapArea();
                                                                           int var24 = var16 - var23.loadedMapX * -1764324214;
                                                                           int var41 = var18 - var23.loadedMapY * 301405130;
                                                                           var48 = var8 + var24;
                                                                           var90 = var19 + var41;
                                                                           if(var24 >= 0 && var41 >= 0 && var24 < client.aClass296_348.getMaxX((byte)-66) * 2 && var41 < client.aClass296_348.getMaxX((byte)9) * 2 && var48 >= 0 && var90 >= 0 && var48 < client.aClass296_348.getMaxY(1874775754) * 2 && var90 < client.aClass296_348.getMaxY(47618491) * 2 && var43 != '\uffff') {
                                                                              var24 *= 256;
                                                                              var41 *= 256;
                                                                              var48 = 256 * var48;
                                                                              var90 = 256 * var90;
                                                                              var10 <<= 2;
                                                                              var14 <<= 2;
                                                                              var9 <<= 2;
                                                                              Class11.method67(var43, var11, var6, var22, var10, var14, var24, var41, var48, var90, var7, var15, var5, var9, var20, 0, (byte)80);
                                                                           }

                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else if(var0.aClass428_3448 == Class428.aClass428_8181) {
                                                                           var43 = var3.method4517(-1467412648);
                                                                           CacheObjectLoader.method5584(698236429);
                                                                           Class546.method6101(var43, 5, client.anInt_438 * -719726693, 0, -541511459);
                                                                           var0.aClass428_3448 = null;
                                                                           return true;
                                                                        } else {
                                                                           CacheFileID.method1397((null != var0.aClass428_3448?var0.aClass428_3448.anInt_8257 * 414445389:-1) + Class8.commaStr + (var0.aClass428_3451 != null?var0.aClass428_3451.anInt_8257 * 414445389:-1) + Class8.commaStr + (var0.aClass428_3446 != null?414445389 * var0.aClass428_3446.anInt_8257:-1) + " " + var0.anInt_3450 * 1463379377, new RuntimeException(), 1622440102);
                                                                           Class125.method1608(false, (byte)-54);
                                                                           return true;
                                                                        }
                                                                     }
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
