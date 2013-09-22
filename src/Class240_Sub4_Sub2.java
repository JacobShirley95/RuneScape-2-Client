import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Class240_Sub4_Sub2 extends Class240_Sub4 {

   void method4434(OggPacket var1, int var2) {}

   void method4435(int var1) {}

   Class240_Sub4_Sub2(OggStreamState var1) {
      super(var1);
   }

   public static byte[][][] method284(int var0, int var1) {
      byte[][][] var2 = new byte[8][4][];
      int var3 = var0;
      int var4 = var0;
      byte[] var5 = new byte[var0 * var0];
      int var6 = 0;

      int var7;
      int var8;
      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var4; ++var8) {
            if(var8 <= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][1] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][3] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var6 >= 0 && var6 < var5.length) {
               if(var8 >= var7 << 1) {
                  var5[var6] = -1;
               }

               ++var6;
            } else {
               ++var6;
            }
         }
      }

      var2[1][1] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][3] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][0] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][3] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][2] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][3] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][1] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 << 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][3] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var3 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var7 <= var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var3 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][2] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var7 >= var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][3] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][0] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][2] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 <= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][3] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][1] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][2] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var8 >= var7 - var4 / 2) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][3] = var5;
      return var2;
   }

   static void putNPCSOnMM(Renderer var0, int var1, int var2, RSInterface var3, Class1024 var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < 1636714459 * client.availableNPCS; ++var8) {
         Class240_Sub9 var9 = (Class240_Sub9)client.npcNodeList.getNode((long)client.npcIndices[var8]);
         if(null != var9) {
            NPC var10 = (NPC)var9.anObject_6783;
            if(var10.method1177(611265129) && Class521.myPlayer.plane == var10.plane) {
               NPCComposite var11 = var10.npcComposite;
               if(null != var11 && var11.anIntArray_8642 != null) {
                  var11 = var11.method5599(Class240_Sub41_Sub3.aClass23_1024, Class240_Sub41_Sub3.aClass23_1024, (byte)17);
               }

               if(var11 != null && var11.aBoolean_8630 && var11.aBoolean_8651) {
                  GameCoord var12 = var10.method6203().gameCoord;
                  int var13 = (int)var12.floatX / 128 - var1 / 128;
                  int var14 = (int)var12.floatZ / 128 - var2 / 128;
                  if(var11.anInt_8645 * 1520197321 != -1) {
                     Class373.method4752(var0, var4, var3, var5, var6, var13, var14, 1520197321 * var11.anInt_8645, -994880938);
                  } else {
                     FontRenderer_Sub3.putOnMM(var3, var4, var5, var6, var13, var14, Class438.mapDotSprites[1]);
                  }
               }
            }
         }
      }

   }
}
