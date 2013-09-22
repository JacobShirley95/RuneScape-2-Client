
public class Class586 {

   public boolean aBoolean_9732;
   public Class617 aClass617_9733;
   public Class617 aClass617_9734;
   public Class619 aClass619_9735;
   public Class619 aClass619_9736;
   public Class619 aClass619_9737;
   public Class617 aClass617_9738;
   static int anInt_9739;
   public int dropItemTextColour;
   public int bankItemColour;
   public Class617 aClass617_9742;
   static Class110 aClass110_9743;


   public Class586(CacheDataUnpacker var1) {
      byte[] var2 = var1.method3566(Class590.aClass590_9787.anInt_9792 * 631638583, 479066601);
      this.method6358(new ByteArrayDataNode(var2), -1478141432);
   }

   void method6358(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(1525749836);
         if(0 == var3) {
            return;
         }

         if(1 == var3) {
            this.aClass617_9734 = Class126.method1627(var1, -2023706582);
         } else if(2 == var3) {
            this.aClass617_9742 = Class126.method1627(var1, -2023706582);
         } else if(3 == var3) {
            this.aClass617_9738 = Class126.method1627(var1, -2023706582);
         } else if(4 == var3) {
            this.aClass617_9733 = Class126.method1627(var1, -2023706582);
         } else if(var3 == 5) {
            this.aClass619_9736 = Class36.method304(var1, 1910063656);
         } else if(var3 == 6) {
            this.aClass619_9737 = Class36.method304(var1, 109140271);
         } else if(7 == var3) {
            this.aClass619_9735 = Class36.method304(var1, 1022005572);
         } else if(8 == var3) {
            Class126.method1627(var1, -2023706582);
         } else if(9 == var3) {
            Class126.method1627(var1, -2023706582);
         } else if(var3 == 10) {
            Class126.method1627(var1, -2023706582);
         } else if(var3 == 11) {
            this.aBoolean_9732 = true;
         } else if(12 == var3) {
            this.bankItemColour = var1.method4480(1260717178) * -1591196939;
         } else if(13 == var3) {
            this.dropItemTextColour = var1.method4480(1260717178) * -237598855;
         }
      }
   }

   static final void method6359(RSInterfaceData var0, int var1) {
      if(null != Animation.aShortArray_10128 && -995843909 * Class462.anInt_8604 < Class357.anInt_6780 * -2050929757) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Animation.aShortArray_10128[(Class462.anInt_8604 += -1040407437) * -995843909 - 1] & '\uffff';
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      }

   }

   static final void method6360(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      var0.intTypeIndex -= 1462854468;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      int var5 = var0.intTypes[var0.intTypeIndex * -831324111 + 3];
      GameCoord var6 = GameCoord.createCoord((float)var2, (float)var3, (float)var4);
      if(-1.0F == var6.floatX) {
         var6.floatX = Float.POSITIVE_INFINITY;
      }

      if(var6.floatY == -1.0F) {
         var6.floatY = Float.POSITIVE_INFINITY;
      }

      if(var6.floatZ == -1.0F) {
         var6.floatZ = Float.POSITIVE_INFINITY;
      }

      Class542.aClass43_Sub1_9475.method356(var6, -173941692);
      Class542.aClass43_Sub1_9475.method354((float)var5 / 1000.0F, -268796258);
      var6.store();
   }

   static final void method6361(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class545.method6096(var3, var4, var0, (short)18834);
   }

   static final void method6362(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      int var3 = Class104_Sub21.renderSettings.aClass540_Sub14_7309.method1701(-2071484236);
      if(var2 != var3 && Class217.anInt_3756 * -630832909 == -528571831 * Class217.anInt_3752) {
         if(!Class547.method6103(-243034353 * client.loginStage, 1121851513)) {
            if(0 == var3) {
               Class243.method3122(GraphicsDataHolder.aCacheUnpacker_9212, Class217.anInt_3752 * -528571831, 0, var2, false, (byte)-4);
               Class134.method1792(-2014216514);
               Class217.aBoolean_3748 = false;
            } else if(var2 == 0) {
               method6365((short)353);
               Class217.aBoolean_3748 = false;
            } else {
               Class326.method4015(var2, -891360126);
            }
         }

         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub14_7309, var2, 254290770);
         Class83.method1089(-912012146);
         client.aBoolean_568 = false;
      }

   }

   public static Class240_Sub27 method6363(byte var0) {
      Class240_Sub27 var1 = SoftwareRenderer.method6843((short)16384);
      var1.aClass326_7375 = null;
      var1.anInt_7371 = 0;
      var1.aClass240_Sub8_Sub1_7370 = new ByteArrayDataNode_Sub1(5000);
      return var1;
   }

   static final void method6364(RSInterfaceData var0, RSCharacter var1, int var2) {
      var0.intTypeIndex -= 1462854468;
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var5 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      boolean var6 = 1 == var0.intTypes[-831324111 * var0.intTypeIndex + 3];
      if(Class542.aClass43_Sub1_9475.method369(-831324111) != Class31.aClass31_808) {
         throw new RuntimeException();
      } else {
         Class508_Sub4 var7 = (Class508_Sub4)Class542.aClass43_Sub1_9475.method397((byte)-34);
         if(null != var1) {
            var7.method1619(var1, new GameCoord((float)var3, (float)var4, (float)var5), var6, 1586930016);
         }

      }
   }

   public static void method6365(short var0) {
      Class134.aClass240_Sub41_Sub2_2616.method448((byte)51);
      Class134.anInt_2617 = 642235515;
      ConnectionUpdate.aCacheUnpacker_119 = null;
      Class123.aClass240_Sub41_Sub2_2276 = null;
   }

   static final void method6366(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = null == client.aClass132_476?-1:client.aClass132_476.cacheID * 1278853609;
   }
}
