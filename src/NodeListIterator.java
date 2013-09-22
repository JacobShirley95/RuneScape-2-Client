import java.util.Iterator;

public class NodeListIterator implements Iterator {

   NodeListNode current = null;
   NodeListNode next;
   int index;
   NodeArrayList aNodeArrayList_9081;


   public void remove() {
      if(this.current == null) {
         throw new IllegalStateException();
      } else {
         this.current.shiftNext();
         this.current = null;
      }
   }

   void reset() {
      this.next = this.aNodeArrayList_9081.nodeArray[0].baseNode;
      this.index = 1634983235;
      this.current = null;
   }

   public Object next() {
      NodeListNode var1;
      if(this.aNodeArrayList_9081.nodeArray[this.index * -2052024469 - 1] != this.next) {
         var1 = this.next;
         this.next = var1.baseNode;
         this.current = var1;
         return var1;
      } else {
         do {
            if(this.index * -2052024469 >= this.aNodeArrayList_9081.maxSize * -2036604759) {
               return null;
            }

            var1 = this.aNodeArrayList_9081.nodeArray[(this.index += 1634983235) * -2052024469 - 1].baseNode;
         } while(this.aNodeArrayList_9081.nodeArray[this.index * -2052024469 - 1] == var1);

         this.next = var1.baseNode;
         this.current = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if(this.next != this.aNodeArrayList_9081.nodeArray[-2052024469 * this.index - 1]) {
         return true;
      } else {
         while(-2052024469 * this.index < -2036604759 * this.aNodeArrayList_9081.maxSize) {
            if(this.aNodeArrayList_9081.nodeArray[(this.index += 1634983235) * -2052024469 - 1].baseNode != this.aNodeArrayList_9081.nodeArray[this.index * -2052024469 - 1]) {
               this.next = this.aNodeArrayList_9081.nodeArray[this.index * -2052024469 - 1].baseNode;
               return true;
            }

            this.next = this.aNodeArrayList_9081.nodeArray[-2052024469 * this.index - 1];
         }

         return false;
      }
   }

   public NodeListNode getFirst() {
      this.reset();
      return (NodeListNode)this.next();
   }

   public NodeListIterator(NodeArrayList var1) {
      this.aNodeArrayList_9081 = var1;
      this.reset();
   }

   static final void method5829(RSInterfaceData var0, byte var1) {
      if(client.aString_542 != null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1282766579 * Class298.anInt_5996;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static Model method5830(Renderer var0, int var1, int var2, int var3, int var4, int var5, Model var6, int var7, int var8, int var9, int var10, Animator var11, byte var12) {
      if(var6 == null) {
         return null;
      } else {
         int var13 = 2055;
         if(var11 != null) {
            var13 |= var11.getFlags((short)5809);
            var13 &= -513;
         }

         long var14 = ((long)var7 << 32) + (long)(var5 + (var9 << 16) + (var10 << 24)) + ((long)var8 << 48);
         CacheNodeArrayList var16 = Class4.aClass627_29;
         Model var17;
         synchronized(Class4.aClass627_29) {
            var17 = (Model)Class4.aClass627_29.getObject(var14);
         }

         if(null == var17 || var0.method1940(var17.method2015(), var13) != 0) {
            if(var17 != null) {
               var13 = var0.method1941(var13, var17.method2015());
            }

            byte var33;
            if(var5 == 1) {
               var33 = 9;
            } else if(var5 == 2) {
               var33 = 12;
            } else if(3 == var5) {
               var33 = 15;
            } else if(var5 == 4) {
               var33 = 18;
            } else {
               var33 = 21;
            }

            byte var18 = 3;
            int[] var19 = new int[]{64, 96, 128};
            ModelData var20 = new ModelData(var18 * var33 + 1, 2 * var18 * var33 - var33, 0);
            int var21 = var20.method1220(0, 0, 0);
            int[][] var22 = new int[var18][var33];

            int var23;
            int var25;
            int var24;
            int var28;
            for(var23 = 0; var23 < var18; ++var23) {
               var24 = var19[var23];
               var25 = var19[var23];

               for(int var26 = 0; var26 < var33; ++var26) {
                  int var27 = (var26 << 14) / var33;
                  var28 = Class362.cosArray[var27] * var24 >> 14;
                  int var29 = Class362.sinArray[var27] * var25 >> 14;
                  var22[var23][var26] = var20.method1220(var28, 0, var29);
               }
            }

            for(var23 = 0; var23 < var18; ++var23) {
               var24 = (256 * var23 + 128) / var18;
               var25 = 256 - var24;
               byte var39 = (byte)(var9 * var25 + var24 * var10 >> 8);
               short var40 = (short)((var25 * (var7 & 127) + var24 * (var8 & 127) & 32512) + (var25 * (var7 & '\ufc00') + var24 * (var8 & '\ufc00') & 16515072) + (var25 * (var7 & 896) + var24 * (var8 & 896) & 229376) >> 8);

               for(var28 = 0; var28 < var33; ++var28) {
                  if(0 == var23) {
                     var20.method1223(var21, var22[0][(1 + var28) % var33], var22[0][var28], (byte)1, (byte)-1, var40, var39, (short)-1);
                  } else {
                     var20.method1223(var22[var23 - 1][var28], var22[var23 - 1][(var28 + 1) % var33], var22[var23][(1 + var28) % var33], (byte)1, (byte)-1, var40, var39, (short)-1);
                     var20.method1223(var22[var23 - 1][var28], var22[var23][(var28 + 1) % var33], var22[var23][var28], (byte)1, (byte)-1, var40, var39, (short)-1);
                  }
               }
            }

            var17 = var0.createModel(var20, var13, Class4.anInt_28 * 480335271, 64, 768);
            CacheNodeArrayList var38 = Class4.aClass627_29;
            synchronized(Class4.aClass627_29) {
               Class4.aClass627_29.insert(var17, var14);
            }
         }

         int var35 = var6.method2039();
         int var36 = var6.method2022();
         int var34 = var6.method2065();
         int var37 = var6.method2043();
         if(null != var11) {
            var17 = var17.copy((byte)3, var13, true);
            var17.method2012(var36 - var35 >> 1, 128, var37 - var34 >> 1);
            var17.offset(var35 + var36 >> 1, 0, var34 + var37 >> 1);
            var11.method5884(var17, 1312732656);
         } else {
            var17 = var17.copy((byte)3, var13, true);
            var17.method2012(var36 - var35 >> 1, 128, var37 - var34 >> 1);
            var17.offset(var35 + var36 >> 1, 0, var34 + var37 >> 1);
         }

         if(0 != var2) {
            var17.rotateY(var2);
         }

         if(var3 != 0) {
            var17.rotateX(var3);
         }

         if(0 != var4) {
            var17.offset(0, var4, 0);
         }

         return var17;
      }
   }
}
