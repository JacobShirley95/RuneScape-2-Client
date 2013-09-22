
public class Class592 {

   public int[] anIntArray_9799;
   public int anInt_9800 = -1347085101;
   static final int anInt_9801 = 2;
   public int[] anIntArray_9802;
   public int[] anIntArray_9803;
   public int anInt_9804 = 1798375585;
   public static final int anInt_9805 = 1;
   public static final int anInt_9806 = 0;
   public static CacheObjectLoader cacheObjectLoader;


   public Class592(CacheDataUnpacker var1) {
      byte[] var2 = var1.method3566(Class590.aClass590_9791.anInt_9792 * 631638583, 1746139999);
      this.method6413(new ByteArrayDataNode(var2), (byte)20);
      if(null == this.anIntArray_9802) {
         throw new RuntimeException("");
      }
   }

   void method6413(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(1926568392);
         if(var3 == 0) {
            return;
         }

         int var4;
         if(var3 == 1) {
            var4 = var1.readByte(1081153309);
            this.anIntArray_9802 = new int[var4];

            for(int var5 = 0; var5 < this.anIntArray_9802.length; ++var5) {
               this.anIntArray_9802[var5] = var1.readByte(323394224);
               if(0 != this.anIntArray_9802[var5] && this.anIntArray_9802[var5] == 2) {
                  ;
               }
            }
         } else if(3 == var3) {
            this.anInt_9804 = var1.readByte(-139400124) * -1798375585;
         } else if(var3 == 4) {
            this.anInt_9800 = var1.readByte(-491490778) * 1347085101;
         } else if(var3 == 5) {
            this.anIntArray_9799 = new int[var1.readByte(-1084669404)];

            for(var4 = 0; var4 < this.anIntArray_9799.length; ++var4) {
               this.anIntArray_9799[var4] = var1.readByte(1467844207);
            }
         } else if(var3 == 6) {
            this.anIntArray_9803 = new int[var1.readByte(706353431)];

            for(var4 = 0; var4 < this.anIntArray_9803.length; ++var4) {
               this.anIntArray_9803[var4] = var1.readByte(-815696817);
            }
         }
      }
   }

   static final void method6414(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapOverviewNode var3 = Class605.method6516(1734327474);
      if(null != var3) {
         boolean var4 = var3.method2574(var2 >> 28 & 3, var2 >> 14 & 16383, var2 & 16383, Class556.anIntArray_9545, 540920809);
         if(var4) {
            Class418.method5191(Class556.anIntArray_9545[1], Class556.anIntArray_9545[2], 555965946);
         }
      }

   }

   static final void method6415(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(null != Class248_Sub1.aNodeArrayList_6444) {
         NodeListNode var3 = Class248_Sub1.aNodeArrayList_6444.getNode((long)var2);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = null != var3?1:0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method6416(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class36.anInt_851 * -1571622403;
   }

   static final void method6417(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub18_7280.method4003(65536)?1:0;
   }

   static final void method6418(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      Class494 var4 = Class248.method3173(var2 >> 14 & 16383, var2 & 16383);
      boolean var5 = false;

      for(MapOverviewNode var6 = (MapOverviewNode)var4.method5772(-1682703686); var6 != null; var6 = (MapOverviewNode)var4.method5771(288229525)) {
         if(var3 == var6.anInt_3514 * 1587104365) {
            var5 = true;
            break;
         }
      }

      if(var5) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static void method6419(NodeListNode var0, NodeListNode var1, int var2) {
      if(null != var0.nextNode) {
         var0.shiftNext();
      }

      var0.nextNode = var1.nextNode;
      var0.baseNode = var1;
      var0.nextNode.baseNode = var0;
      var0.baseNode.nextNode = var0;
   }

   static final void method6420(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class240_Sub19.method4784(var2, -2093650670);
   }

   static final void method6421(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      var0.intTypeIndex -= 1462854468;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      int var5 = var0.intTypes[3 + -831324111 * var0.intTypeIndex];
      GameCoord var6 = GameCoord.createCoord((float)var2, (float)var3, (float)var4);
      if(-1.0F == var6.floatX) {
         var6.floatX = Float.POSITIVE_INFINITY;
      }

      if(-1.0F == var6.floatY) {
         var6.floatY = Float.POSITIVE_INFINITY;
      }

      if(-1.0F == var6.floatZ) {
         var6.floatZ = Float.POSITIVE_INFINITY;
      }

      Class542.aClass43_Sub1_9475.method374(var6, (byte)-18);
      Class542.aClass43_Sub1_9475.method388((float)var5 / 1000.0F, 16711935);
      var6.store();
   }

   static GameType[] method6422(int var0) {
      return new GameType[]{GameType.aClass510_9184, GameType.aClass510_9185, GameType.aClass510_9188, GameType.aClass510_9187, GameType.aClass510_9186};
   }
}
