import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class470 {

   String aString_8693 = "null";
   public char aChar_8694;
   int anInt_8695 = 0;
   int anInt_8696;
   public char aChar_8697;
   Object[] anObjectArray_8698;
   Map aMap_8699;
   HashMap aHashMap_8700;


   public boolean method5648(Object var1, int var2) {
      if(16097001 * this.anInt_8695 == 0) {
         return false;
      } else {
         if(this.aHashMap_8700 == null) {
            this.method5654(139416074);
         }

         return this.aHashMap_8700.containsKey(var1);
      }
   }

   void method5649(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(286653731);
         if(0 == var3) {
            return;
         }

         this.method5650(var1, var3, (byte)-91);
      }
   }

   void method5650(ByteArrayDataNode var1, int var2, byte var3) {
      if(var2 == 1) {
         this.aChar_8697 = Class97.method1274(var1.getByte((byte)91), 2012265910);
      } else if(2 == var2) {
         this.aChar_8694 = Class97.method1274(var1.getByte((byte)102), 2010705965);
      } else if(3 == var2) {
         this.aString_8693 = var1.method4485(-1165351137);
      } else if(var2 == 4) {
         this.anInt_8696 = var1.method4480(1260717178) * -1737608787;
      } else {
         int var4;
         int var5;
         if(var2 != 5 && var2 != 6) {
            if(var2 == 7 || 8 == var2) {
               var4 = var1.readShort(425244612);
               this.anInt_8695 = var1.readShort(1447027364) * -989914791;
               this.anObjectArray_8698 = new Object[var4];

               for(var5 = 0; var5 < this.anInt_8695 * 16097001; ++var5) {
                  int var7 = var1.readShort(1692659142);
                  if(var2 == 7) {
                     this.anObjectArray_8698[var7] = var1.method4485(-449409581);
                  } else {
                     this.anObjectArray_8698[var7] = new Integer(var1.method4480(1260717178));
                  }
               }
            }
         } else {
            this.anInt_8695 = var1.readShort(1152359673) * -989914791;
            this.aMap_8699 = new HashMap(16097001 * this.anInt_8695);

            for(var4 = 0; var4 < 16097001 * this.anInt_8695; ++var4) {
               var5 = var1.method4480(1260717178);
               Object var6;
               if(var2 == 5) {
                  var6 = var1.method4485(-1433805640);
               } else {
                  var6 = new Integer(var1.method4480(1260717178));
               }

               this.aMap_8699.put(new Integer(var5), var6);
            }
         }
      }

   }

   Object method5651(int var1, int var2) {
      return null != this.anObjectArray_8698?(var1 >= 0 && var1 < this.anObjectArray_8698.length?this.anObjectArray_8698[var1]:null):(null != this.aMap_8699?this.aMap_8699.get(new Integer(var1)):null);
   }

   public int[] method5652(Object var1, byte var2) {
      if(0 == this.anInt_8695 * 16097001) {
         return null;
      } else {
         if(null == this.aHashMap_8700) {
            this.method5654(-1639734187);
         }

         return (int[])((int[])this.aHashMap_8700.get(var1));
      }
   }

   public int method5653(int var1) {
      return this.anInt_8695 * 16097001;
   }

   void method5654(int var1) {
      HashMap var2 = new HashMap();
      Object var5;
      Iterator var10;
      Entry var11;
      if(this.anObjectArray_8698 != null) {
         for(int var3 = 0; var3 < this.anObjectArray_8698.length; ++var3) {
            if(null != this.anObjectArray_8698[var3]) {
               Object var4 = this.anObjectArray_8698[var3];
               var5 = (List)var2.get(var4);
               if(null == var5) {
                  var5 = new LinkedList();
                  var2.put(var4, var5);
               }

               ((List)var5).add(new Integer(var3));
            }
         }
      } else {
         if(null == this.aMap_8699) {
            throw new IllegalStateException();
         }

         Object var6;
         for(var10 = this.aMap_8699.entrySet().iterator(); var10.hasNext(); ((List)var6).add(var11.getKey())) {
            var11 = (Entry)var10.next();
            var5 = var11.getValue();
            var6 = (List)var2.get(var5);
            if(var6 == null) {
               var6 = new LinkedList();
               var2.put(var5, var6);
            }
         }
      }

      this.aHashMap_8700 = new HashMap();

      int[] var13;
      for(var10 = var2.entrySet().iterator(); var10.hasNext(); this.aHashMap_8700.put(var11.getKey(), var13)) {
         var11 = (Entry)var10.next();
         List var12 = (List)var11.getValue();
         var13 = new int[var12.size()];
         int var7 = 0;

         Integer var9;
         for(Iterator var8 = var12.iterator(); var8.hasNext(); var13[var7++] = var9.intValue()) {
            var9 = (Integer)var8.next();
         }

         if(this.anObjectArray_8698 == null) {
            Arrays.sort(var13);
         }
      }

   }

   public int method5655(int var1, short var2) {
      Object var3 = this.method5651(var1, -580911061);
      return null == var3?1351375397 * this.anInt_8696:((Integer)var3).intValue();
   }

   public String method5656(int var1, int var2) {
      Object var3 = this.method5651(var1, 216603336);
      return var3 == null?this.aString_8693:(String)var3;
   }

   static boolean method5657(RSInterface var0, int var1) {
      Class240_Sub49 var2 = client.method174(var0);
      return var2.method4994(-597199034) > 0?true:(var2.method4996((byte)52)?true:var0.aClass132_2519 != null);
   }
}
