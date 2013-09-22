import java.awt.Canvas;
import java.awt.Dimension;

public class AnimationUnpacker {

   static Class316 aClass316_4423;
   final Class631 aClass631_4424;
   final CacheNodeArrayList aClass627_4425 = new CacheNodeArrayList(64);
   final CacheNodeArrayList aClass627_4426 = new CacheNodeArrayList(100);
   final CacheDataUnpacker aCacheUnpacker_4427;


   public Animation loadAnimation(int var1) {
      CacheNodeArrayList var3 = this.aClass627_4425;
      Animation var4;
      synchronized(this.aClass627_4425) {
         var4 = (Animation)this.aClass627_4425.getObject((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_4427;
         byte[] var11;
         synchronized(this.aCacheUnpacker_4427) {
            var11 = this.aCacheUnpacker_4427.getDataBytes(Class124.aClass124_2288.method1575(var1, 1227797744), Class124.aClass124_2288.method1573(var1, (byte)25), -1134659858);
         }

         var4 = new Animation();
         var4.id = var1 * 1272981621;
         var4.unpacker = this;
         if(var11 != null) {
            var4.load(new ByteArrayDataNode(var11), 1363168198);
         }

         var4.method6724((byte)0);
         CacheNodeArrayList var12 = this.aClass627_4425;
         synchronized(this.aClass627_4425) {
            this.aClass627_4425.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public AnimationUnpacker(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, CacheDataUnpacker var4, CacheDataUnpacker var5, Class631 var6) {
      this.aCacheUnpacker_4427 = var3;
      this.aClass631_4424 = var6;
      if(null != this.aCacheUnpacker_4427) {
         int var7 = this.aCacheUnpacker_4427.method3581((short)-22045) - 1;
         Class124.aClass124_2288.method1574(851936843);
         this.aCacheUnpacker_4427.method3575(var7, -1103212818);
      }

      InterfaceID.method3705(var4, var5, 2, -1473413245);
   }

   public void method3366(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_4425;
      synchronized(this.aClass627_4425) {
         this.aClass627_4425.method6677(var1, -1872253948);
      }

      var3 = this.aClass627_4426;
      synchronized(this.aClass627_4426) {
         this.aClass627_4426.method6677(var1, -1745771783);
      }
   }

   public void method3367(int var1) {
      CacheNodeArrayList var2 = this.aClass627_4425;
      synchronized(this.aClass627_4425) {
         this.aClass627_4425.method6665((byte)5);
      }

      var2 = this.aClass627_4426;
      synchronized(this.aClass627_4426) {
         this.aClass627_4426.method6665((byte)5);
      }
   }

   public Class240_Sub22_Sub9 method3368(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_4426;
      synchronized(this.aClass627_4426) {
         Class240_Sub22_Sub9 var4 = (Class240_Sub22_Sub9)this.aClass627_4426.getObject((long)var1);
         if(null == var4) {
            var4 = new Class240_Sub22_Sub9(var1);
            this.aClass627_4426.insert(var4, (long)var1);
         }

         return !var4.method2580((byte)1)?null:var4;
      }
   }

   public void method3369(int var1) {
      CacheNodeArrayList var2 = this.aClass627_4425;
      synchronized(this.aClass627_4425) {
         this.aClass627_4425.method6669(707337330);
      }

      var2 = this.aClass627_4426;
      synchronized(this.aClass627_4426) {
         this.aClass627_4426.method6669(-563573336);
      }
   }

   static final void method3370(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      if(var0.intTypes[-831324111 * var0.intTypeIndex] <= var0.intTypes[var0.intTypeIndex * -831324111 + 1]) {
         var0.anInt_9510 += var0.anIntArray_9518[var0.anInt_9510 * -1756266293] * -1856838429;
      }

   }

   static final void method3371(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class2.method6(var3, var4, var0, (byte)76);
   }

   static final void method3372(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      AbstractServerConnection.method3077(var3, var4, var0, (byte)16);
   }

   static final void method3373(RSInterfaceData var0, int var1) {
      client.aBoolean_314 = true;
      Class545.method6097(889979652);
   }

   static final void method3374(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 209984425 * Class273.anInt_4712;
   }

   public static Renderer getRenderer(int var0, Canvas canvas, Class163 var2, Class96 var3, CacheDataUnpacker var4, int var5, short var6) {
      int width = 0;
      int height = 0;
      if(null != canvas) {
         Dimension var9 = canvas.getSize();
         width = var9.width;
         height = var9.height;
      }

      return Class46.getRenderer(var0, canvas, var2, var3, var4, var5, width, height, (byte)1);
   }
}
