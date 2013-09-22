import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class501 implements Class468 {

   final Class355 aClass355_9087;
   Map aMap_9088;
   public static CacheDataUnpacker aCacheUnpacker_9089;


   public Class501(Class355 var1) {
      this.aClass355_9087 = var1;
   }

   public void method5618(int var1, int var2, int var3) {
      if(null == this.aMap_9088) {
         this.aMap_9088 = new HashMap();
         this.aMap_9088.put(Integer.valueOf(var1), new Class340(var1, Integer.valueOf(var2)));
      } else {
         Class340 var4 = (Class340)this.aMap_9088.get(Integer.valueOf(var1));
         if(var4 == null) {
            this.aMap_9088.put(Integer.valueOf(var1), new Class340(var1, Integer.valueOf(var2)));
         } else {
            var4.anObject_6535 = Integer.valueOf(var2);
         }
      }

   }

   public long method5632(int var1, short var2) {
      if(this.aMap_9088 != null) {
         Class340 var3 = (Class340)this.aMap_9088.get(Integer.valueOf(var1));
         if(null != var3) {
            return ((Long)var3.anObject_6535).longValue();
         }
      }

      return ((Long)this.aClass355_9087.method4452(var1, -2031385336)).longValue();
   }

   public void method5620(int var1, long var2) {
      if(this.aMap_9088 == null) {
         this.aMap_9088 = new HashMap();
         this.aMap_9088.put(Integer.valueOf(var1), new Class340(var1, Long.valueOf(var2)));
      } else {
         Class340 var4 = (Class340)this.aMap_9088.get(Integer.valueOf(var1));
         if(null == var4) {
            this.aMap_9088.put(Integer.valueOf(var1), new Class340(var1, Long.valueOf(var2)));
         } else {
            var4.anObject_6535 = Long.valueOf(var2);
         }
      }

   }

   public Object method5637(int var1, int var2) {
      if(this.aMap_9088 != null) {
         Class340 var3 = (Class340)this.aMap_9088.get(Integer.valueOf(var1));
         if(var3 != null) {
            return var3.anObject_6535;
         }
      }

      return this.aClass355_9087.method4452(var1, -1300792019);
   }

   public void method5622(int var1, Object var2, byte var3) {
      if(null == this.aMap_9088) {
         this.aMap_9088 = new HashMap();
         this.aMap_9088.put(Integer.valueOf(var1), new Class340(var1, var2));
      } else {
         Class340 var4 = (Class340)this.aMap_9088.get(Integer.valueOf(var1));
         if(var4 == null) {
            this.aMap_9088.put(Integer.valueOf(var1), new Class340(var1, var2));
         } else {
            var4.anObject_6535 = var2;
         }
      }

   }

   public void method5623(short var1) {
      if(this.aMap_9088 != null) {
         this.aMap_9088.clear();
      }

   }

   public Iterator iterator() {
      return null == this.aMap_9088?Collections.emptyList().iterator():this.aMap_9088.values().iterator();
   }

   public int method5630(int var1, int var2) {
      if(this.aMap_9088 != null) {
         Class340 var3 = (Class340)this.aMap_9088.get(Integer.valueOf(var1));
         if(var3 != null) {
            return ((Integer)var3.anObject_6535).intValue();
         }
      }

      return ((Integer)this.aClass355_9087.method4452(var1, -1478109312)).intValue();
   }

   public void method5624(int var1, int var2) {
      if(this.aMap_9088 != null) {
         this.aMap_9088.remove(Integer.valueOf(var1));
      }

   }

   public static final void method5847(String var0, byte var1) {
      if(null != ScreenCharText.aClass214Array_6170) {
         ConnectionHandler var2 = Class32.method230(-244515626);
         Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6261, var2.aClass528_3433, 1917447504);
         var3.aClass240_Sub8_Sub1_7370.putByte(Class258.method3383(var0, -557552780), 1995636274);
         var3.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-38);
         var2.addPacket(var3, 1198825665);
      }
   }

   public static boolean method5848(int var0) {
      return Class344.aBoolean_6556;
   }

   static final void method5849(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub18_7280, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1?1:0, 99160435);
      client.aClass296_348.method3789((byte)66);
      Class83.method1089(-2053561173);
      client.aBoolean_568 = false;
   }
}
