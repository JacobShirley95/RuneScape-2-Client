import java.util.HashMap;
import java.util.Map;

public class FontUnpacker {

   final int[] anIntArray_6459;
   final CacheDataUnpacker aCacheUnpacker_6460;
   final CacheNodeArrayList aClass627_6461 = new CacheNodeArrayList(20);
   final CacheDataUnpacker aCacheUnpacker_6462;
   Map aMap_6463 = null;
   public static CacheDownload cacheDownload;
   public static int anInt_6465;
   static int anInt_6466;


   public int method4130(boolean var1, int var2) {
      if(this.anIntArray_6459 == null) {
         return 0;
      } else if(!var1 && null != this.aMap_6463) {
         return 2 * this.anIntArray_6459.length;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < this.anIntArray_6459.length; ++var4) {
            int var5 = this.anIntArray_6459[var4];
            if(this.aCacheUnpacker_6460.hasData(var5, 760702816)) {
               ++var3;
            }

            if(this.aCacheUnpacker_6462.hasData(var5, 538314266)) {
               ++var3;
            }
         }

         return var3;
      }
   }

   public void method4131(Class339 var1, int var2) {
      this.aMap_6463 = new HashMap(this.anIntArray_6459.length);

      for(int var3 = 0; var3 < this.anIntArray_6459.length; ++var3) {
         int var4 = this.anIntArray_6459[var3];
         RSFont var5 = Class105.method1356(this.aCacheUnpacker_6462, var4, 1223225512);
         byte[] var6 = this.aCacheUnpacker_6460.method3566(var4, 953458532);
         Object var7 = var1.method4195(var6, var5, true, 527808927);
         this.aMap_6463.put(Integer.valueOf(var3), new Class477(var7, var5));
      }

   }

   public void method4132(int var1) {
      this.aMap_6463 = null;
   }

   public int method4133(int var1) {
      return this.method4130(false, -2025640456);
   }

   Class477 method4134(Class339 var1, int var2, boolean var3, boolean var4, int var5) {
      if(var2 == -1) {
         return null;
      } else {
         if(null != this.anIntArray_6459) {
            for(int var6 = 0; var6 < this.anIntArray_6459.length; ++var6) {
               if(this.anIntArray_6459[var6] == var2) {
                  return (Class477)this.aMap_6463.get(Integer.valueOf(var6));
               }
            }
         }

         Class477 var9 = (Class477)this.aClass627_6461.getObject((long)(var2 << 1 | (var4?1:0)));
         if(var9 != null) {
            if(var3 && null == var9.anObject_8742) {
               RSFont var10 = Class105.method1356(this.aCacheUnpacker_6462, var2, 1223225512);
               if(var10 == null) {
                  return null;
               }

               var9.anObject_8742 = var10;
            }

            return var9;
         } else {
            byte[] var7 = this.aCacheUnpacker_6460.method3566(var2, 1824320121);
            if(var7 == null) {
               return null;
            } else {
               RSFont var8 = Class105.method1356(this.aCacheUnpacker_6462, var2, 1223225512);
               if(var8 == null) {
                  return null;
               } else {
                  if(var3) {
                     var9 = new Class477(var1.method4195(var7, var8, var4, 1566671708), var8);
                  } else {
                     var9 = new Class477(var1.method4195(var7, var8, var4, -21154753), (Object)null);
                  }

                  this.aClass627_6461.insert(var9, (long)(var2 << 1 | (var4?1:0)));
                  return var9;
               }
            }
         }
      }
   }

   public RSFont method4135(Class339 var1, int var2, int var3) {
      Class477 var4 = this.method4134(var1, var2, true, true, 801038210);
      return null == var4?null:(RSFont)var4.anObject_8742;
   }

   public void method4136(int var1, int var2) {
      this.aClass627_6461.method6677(var1, -1636132486);
   }

   public void method4137(byte var1) {
      this.aClass627_6461.method6665((byte)5);
   }

   public int method4138(byte var1) {
      return null == this.anIntArray_6459?0:this.anIntArray_6459.length * 2;
   }

   public FontUnpacker(CacheDataUnpacker var1, CacheDataUnpacker var2, int[] var3) {
      this.aCacheUnpacker_6460 = var1;
      this.aCacheUnpacker_6462 = var2;
      if(null != var3) {
         this.anIntArray_6459 = var3;
      } else {
         this.anIntArray_6459 = null;
      }

   }

   public Object method4139(Class339 var1, int var2, boolean var3, boolean var4, int var5) {
      Class477 var6 = this.method4134(var1, var2, var3, var4, 56499476);
      return var6 == null?null:var6.anObject_8743;
   }

   public void method4140(int var1) {
      this.aClass627_6461.method6669(-882201002);
   }

   static final void method4141(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class374.method4758(var3, var4, var0, 335741482);
   }

   static final void method4142(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class305.method3841(var3, var4, var0, (byte)1);
   }

   static final void method4143(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1500060803 * var3.X1;
   }

   static final void method4144(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var2 < 0) {
         var2 = 0;
      }

      client.anInt_394 = (-665704711 * client.anInt_524 + var2) * 318477457;
   }

   public static int method4145(long var0) {
      Class544.method6092(var0);
      return Class461.aCalendar_8600.get(1);
   }
}
