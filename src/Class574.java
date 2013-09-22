import java.awt.Frame;
import java.util.Iterator;
import java.util.LinkedList;

public class Class574 implements Iterable {

   Class598[] aClass598Array_9659;


   public Class598 method6285(int var1, int var2) {
      return this.aClass598Array_9659[var1];
   }

   void method6286(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(935260710);
         if(0 == var3) {
            return;
         }

         if(var3 == 1) {
            int var4 = var1.readByte(527041199);
            int var5 = 0;
            LinkedList var6 = new LinkedList();

            for(int var7 = 0; var7 < var4; ++var7) {
               int var8 = var1.readByte(182303561);
               int var9 = var1.readShort(1683979208);
               int var10 = var1.readByte(1464789640);
               boolean var11 = 0 != (var10 & 1);
               int var12 = 0;
               if(0 != (var10 & 2)) {
                  var12 = var1.readByte(615366431);
               }

               boolean var13 = var1.readByte(-78436307) == 1;
               var6.add(new Class598(var8, var9, var11, var13, var12));
               if(var8 > var5) {
                  var5 = var8;
               }
            }

            this.aClass598Array_9659 = new Class598[var5 + 1];

            Class598 var15;
            for(Iterator var14 = var6.iterator(); var14.hasNext(); this.aClass598Array_9659[var15.method6470(-1641421589)] = var15) {
               var15 = (Class598)var14.next();
            }
         }
      }
   }

   public int method6287(int var1) {
      return this.aClass598Array_9659.length;
   }

   public Class574(CacheDataUnpacker var1) {
      byte[] var2 = var1.method3566(Class590.aClass590_9786.anInt_9792 * 631638583, 237661909);
      if(null == var2) {
         this.aClass598Array_9659 = new Class598[0];
      } else {
         this.method6286(new ByteArrayDataNode(var2), (byte)112);
      }
   }

   public Iterator iterator() {
      return new Class581(this.aClass598Array_9659);
   }

   public static Frame method6289(GraphicsDataHolder var0, int var1, int var2, int var3, int var4, int var5) {
      if(0 == var3) {
         Class516[] var6 = Class577.method6302(var0, -1873643319);
         if(var6 == null) {
            return null;
         }

         boolean var7 = false;

         for(int var8 = 0; var8 < var6.length; ++var8) {
            if(var6[var8].anInt_9214 * 1824284839 == var1 && var2 == var6[var8].anInt_9215 * -443218857 && (var4 == 0 || 1595152323 * var6[var8].anInt_9216 == var4) && (!var7 || 821041339 * var6[var8].anInt_9213 > var3)) {
               var3 = 821041339 * var6[var8].anInt_9213;
               var7 = true;
            }
         }

         if(!var7) {
            return null;
         }
      }

      Frame var9 = new Frame("Jagex Full Screen");
      var9.setResizable(false);
      var0.method5947(var9, var1, var2, var3, var4, (byte)-68);
      return var9;
   }
}
