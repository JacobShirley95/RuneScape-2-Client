import java.util.LinkedList;

public class Class306 implements Runnable {

   LinkedList aLinkedList_6033 = new LinkedList();
   Class296 aClass296_6034 = new Class296(true);
   volatile boolean aBoolean_6035 = false;
   static Class316 aClass316_6036;
   public static CacheDataUnpacker aCacheUnpacker_6037;


   public void method3849(Class297 var1, int var2) {
      LinkedList var3 = this.aLinkedList_6033;
      synchronized(this.aLinkedList_6033) {
         this.aLinkedList_6033.add(var1);
         this.aLinkedList_6033.notify();
      }
   }

   public boolean method3850(byte var1) {
      return this.aBoolean_6035;
   }

   public Class296 method3851(byte var1) {
      return this.aClass296_6034;
   }

   void method3852(Class296 var1, int var2) {
      this.aClass296_6034 = var1;
   }

   public void run() {
      this.method3853(-533194375);
   }

   void method3853(int var1) {
      Class297 var2 = null;
      LinkedList var3 = this.aLinkedList_6033;
      synchronized(this.aLinkedList_6033) {
         try {
            this.aLinkedList_6033.wait();
         } catch (InterruptedException var13) {
            ;
         }

         var2 = (Class297)this.aLinkedList_6033.pollFirst();
      }

      try {
         if(var2 != null) {
            this.aBoolean_6035 = true;
            this.method3855(var2, (byte)14);
         }
      } catch (Exception var11) {
         ;
      } finally {
         this.aBoolean_6035 = false;
      }

   }

   public void method3854(Class529 var1, int var2) {
      this.aClass296_6034.method3788(var1, (byte)16);
   }

   void method3855(Class297 var1, byte var2) {
      if(var1.aClass305_5991 == Class305.aClass305_6028) {
         this.aClass296_6034.method3789((byte)33);
      } else {
         this.aClass296_6034.method3764(var1, -172137324);
      }

      for(boolean var3 = this.aClass296_6034.loadGameData(); !var3; var3 = this.aClass296_6034.loadGameData()) {
         ;
      }

      this.aClass296_6034.method3770(1796449475);
      client.aClass296_348.method3770(1783726426);
   }

   public static Model getFloorArrowModel(Renderer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = (long)var5;
      Model var9 = (Model)HintMarker.modelNodeArrayList.getObject(var7);
      short var10 = 2055;
      if(var9 == null) {
         ModelData var11 = ModelData.createModelUnpacker(Class240_Sub22_Sub1.aCacheUnpacker_801, var5, 0);
         if(var11 == null) {
            return null;
         }

         if(var11.anInt_1848 < 13) {
            var11.method1229(2);
         }

         var9 = var0.createModel(var11, var10, -1742824997 * HintMarker.anInt_3708, 64, 768);
         HintMarker.modelNodeArrayList.insert(var9, var7);
      }

      var9 = var9.copy((byte)6, var10, true);
      if(0 != var1) {
         var9.method2017(var1);
      }

      if(var2 != 0) {
         var9.rotateY(var2);
      }

      if(var3 != 0) {
         var9.rotateX(var3);
      }

      if(0 != var4) {
         var9.offset(0, var4, 0);
      }

      return var9;
   }

   static final void method3857(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1485255305) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2563 = Class133.extractInterfaceData(var4, var2, (byte)11);
      var0.aBoolean_2524 = true;
   }
}
