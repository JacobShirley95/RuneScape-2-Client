import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

public final class Class371 {

   final AbstractQueue_Sub1 anAbstractQueue_Sub1_6931;
   final AbstractQueue_Sub1 anAbstractQueue_Sub1_6932;
   final Map aMap_6933;
   final long aLong_6934;
   final Class369 aClass369_6935;
   final int anInt_6936;


   Class371(long var1, int var3, Class369 var4) {
      this.aLong_6934 = var1 * -5837447767580988113L;
      this.anInt_6936 = -1412231609 * var3;
      this.aClass369_6935 = var4;
      if(-1 == 1771453303 * this.anInt_6936) {
         this.aMap_6933 = new HashMap(64);
         this.anAbstractQueue_Sub1_6932 = new AbstractQueue_Sub1(64);
         this.anAbstractQueue_Sub1_6931 = null;
      } else {
         if(this.aClass369_6935 == null) {
            throw new IllegalArgumentException("");
         }

         this.aMap_6933 = new HashMap(1771453303 * this.anInt_6936);
         this.anAbstractQueue_Sub1_6932 = new AbstractQueue_Sub1(1771453303 * this.anInt_6936);
         this.anAbstractQueue_Sub1_6931 = new AbstractQueue_Sub1(1771453303 * this.anInt_6936);
      }

   }

   void method4704(int var1) {
      if(-1L == -82950704447866417L * this.aLong_6934) {
         throw new IllegalStateException("");
      } else {
         long var2 = System.currentTimeMillis() - -82950704447866417L * this.aLong_6934;

         while(!this.anAbstractQueue_Sub1_6932.isEmpty()) {
            Class270 var4 = (Class270)this.anAbstractQueue_Sub1_6932.peek();
            if(var4.aLong_4680 * -1343528786218166149L >= var2) {
               return;
            }

            this.aMap_6933.remove(var4.anObject_4681);
            this.anAbstractQueue_Sub1_6932.remove(var4);
            if(this.method4707(-1536092196)) {
               this.anAbstractQueue_Sub1_6931.remove(var4);
            }
         }

      }
   }

   public Object method4705(Object var1, int var2) {
      synchronized(this) {
         if(-1L != this.aLong_6934 * -82950704447866417L) {
            this.method4704(601105545);
         }

         Class270 var4 = (Class270)this.aMap_6933.remove(var1);
         if(var4 != null) {
            this.anAbstractQueue_Sub1_6932.remove(var4);
            if(this.method4707(-1840436643)) {
               this.anAbstractQueue_Sub1_6931.remove(var4);
            }

            return var4.anObject_4679;
         } else {
            return null;
         }
      }
   }

   public Object method4706(Object var1, int var2) {
      synchronized(this) {
         if(this.aLong_6934 * -82950704447866417L != -1L) {
            this.method4704(601105545);
         }

         Class270 var4 = (Class270)this.aMap_6933.get(var1);
         if(null == var4) {
            return null;
         } else {
            this.method4708(var4, false, 901306668);
            return var4.anObject_4679;
         }
      }
   }

   boolean method4707(int var1) {
      return this.anInt_6936 * 1771453303 != -1;
   }

   void method4708(Class270 var1, boolean var2, int var3) {
      if(!var2) {
         this.anAbstractQueue_Sub1_6932.remove(var1);
         if(this.method4707(-143144047) && !this.anAbstractQueue_Sub1_6931.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.aLong_4680 = System.currentTimeMillis() * -5962466391541561677L;
      if(this.method4707(1747969317)) {
         switch(this.aClass369_6935.anInt_6925 * -2028550317) {
         case 0:
            var1.aLong_4678 = var1.aLong_4680 * -6160903700986815241L;
            break;
         case 1:
            var1.aLong_4678 += -8242160853978854731L;
         }

         this.anAbstractQueue_Sub1_6931.add(var1);
      }

      this.anAbstractQueue_Sub1_6932.add(var1);
   }

   public Class371(int var1, Class369 var2) {
      this(-1L, var1, var2);
   }

   public void method4709(int var1) {
      synchronized(this) {
         this.aMap_6933.clear();
         this.anAbstractQueue_Sub1_6932.clear();
         if(this.method4707(964523905)) {
            this.anAbstractQueue_Sub1_6931.clear();
         }

      }
   }

   public Object method4710(Object var1, Object var2, int var3) {
      synchronized(this) {
         if(-1L != -82950704447866417L * this.aLong_6934) {
            this.method4704(601105545);
         }

         Class270 var5 = (Class270)this.aMap_6933.get(var1);
         if(var5 != null) {
            Object var9 = var5.anObject_4679;
            var5.anObject_4679 = var2;
            this.method4708(var5, false, 1689352820);
            return var9;
         } else {
            Class270 var6;
            if(this.method4707(-278718757) && this.aMap_6933.size() == 1771453303 * this.anInt_6936) {
               var6 = (Class270)this.anAbstractQueue_Sub1_6931.remove();
               this.aMap_6933.remove(var6.anObject_4681);
               this.anAbstractQueue_Sub1_6932.remove(var6);
            }

            var6 = new Class270(var2, var1);
            this.aMap_6933.put(var1, var6);
            this.method4708(var6, true, 2020674440);
            return null;
         }
      }
   }

   static final void method4711(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.anInt_2518 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 423434095;
   }

   static final void method4712(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.hidden?1:0;
   }

   static final void method4713(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6220, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.putByte(var2.length() + 1, -1694012433);
      var3.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-58);
      client.gameConnectionHandler.addPacket(var3, 1677834821);
   }

   static final void method4714(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6262, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.method4463(var2, -588235934);
      client.gameConnectionHandler.addPacket(var3, 1509038296);
   }

   static final void method4715(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class240_Sub41_Sub3.aClass23_1024.method136(var2, (byte)19);
   }

   static final void method4716(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2469 = -522394205;
      var0.anInt_2416 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 795082499;
      if(var0.anInt_2428 * -1001687885 == -1 && !var1.aBoolean_2054) {
         Class86.method1132(1278853609 * var0.cacheID, (byte)75);
      }

   }

   public static int method4717(int var0, int var1, int var2) {
      if(-1 == 712072065 * Class571.aClass587_9651.anInt_9746) {
         return 1;
      } else {
         if(var0 != Class104_Sub21.renderSettings.currentToolkit.getToolkitID()) {
            Class604.method6513(var0, ServerString.profilingStr.getText(Class599.clientLanguage, 527753081), true, 348599025);
            if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() != var0) {
               return -1;
            }
         }

         try {
            Dimension var3 = Class51.clientCanvas.getSize();
            Class599.method6484(ServerString.profilingStr.getText(Class599.clientLanguage, 334199948), true, Class286.gameRenderer, CacheDataNode.aTextRenderer_3243, Class1.aRSFont_10, 1701246322);
            ModelData var4 = ModelData.createModelUnpacker(Class240_Sub22_Sub1.aCacheUnpacker_801, Class571.aClass587_9651.anInt_9746 * 712072065, 0);
            long var5 = Class373.getCurrentTime((short)11094);
            Class286.gameRenderer.method1967();
            client.gameViewport.setPos(0.0F, 256.0F, 0.0F);
            Class286.gameRenderer.setViewport(client.gameViewport);
            ArrayViewport var7 = Class286.gameRenderer.method1936();
            var7.method4563((float)(var3.width / 2), (float)(var3.height / 2), 512.0F, 512.0F, (float)client.aClass296_348.method3778(-1346587948), (float)client.aClass296_348.method3780(709161939), (float)var3.width, (float)var3.height);
            Class286.gameRenderer.method1946(var7);
            Class286.gameRenderer.method1947(1.0F);
            Class286.gameRenderer.method1945(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            Model var8 = Class286.gameRenderer.createModel(var4, 2048, 64, 64, 768);
            int var9 = 0;

            label41:
            for(int var10 = 0; var10 < 500; ++var10) {
               Class286.gameRenderer.method1977(3, 0);

               for(int var11 = 15; var11 >= 0; --var11) {
                  for(int var12 = 0; var12 <= var11; ++var12) {
                     client.aViewport_580.setPos((float)((int)(((float)var12 - (float)var11 / 2.0F) * 512.0F)), 0.0F, (float)(512 * (var11 + 1)));
                     var8.method2069(client.aViewport_580, (Class92)null, 0);
                     ++var9;
                     if(Class373.getCurrentTime((short)22476) - var5 >= (long)var1) {
                        break label41;
                     }
                  }
               }
            }

            Class286.gameRenderer.method1962();
            long var13 = (long)(var9 * 1000) / (Class373.getCurrentTime((short)5745) - var5);
            Class286.gameRenderer.method1977(3, 0);
            return (int)var13;
         } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
         }
      }
   }

   static final void method4718(int var0, int var1) {
      if(Class24.method149(var0, (int[])null, 1463154347)) {
         CacheObjectLoader.method5583(RSInterface.interfaceGroups[var0].interfaceArray, -1, -2133528001);
      }
   }
}
