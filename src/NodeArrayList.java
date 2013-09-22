import java.util.Iterator;

public final class NodeArrayList implements Iterable {

   long lastIndex;
   NodeListNode[] nodeArray;
   int maxSize;
   NodeListNode next;
   NodeListNode current;
   int index = 0;
   public static Class212_Sub1_Sub2 aClass212_Sub1_Sub2_9205;


   public NodeListNode next() {
      NodeListNode var2;
      if(631524723 * this.index > 0 && this.nodeArray[this.index * 631524723 - 1] != this.next) {
         var2 = this.next;
         this.next = var2.baseNode;
         return var2;
      } else {
         do {
            if(631524723 * this.index >= -2036604759 * this.maxSize) {
               return null;
            }

            var2 = this.nodeArray[(this.index += 526098363) * 631524723 - 1].baseNode;
         } while(this.nodeArray[this.index * 631524723 - 1] == var2);

         this.next = var2.baseNode;
         return var2;
      }
   }

   public int size(NodeListNode[] var1) {
      int var3 = 0;

      for(int var4 = 0; var4 < this.maxSize * -2036604759; ++var4) {
         NodeListNode var5 = this.nodeArray[var4];

         for(NodeListNode var6 = var5.baseNode; var5 != var6; var6 = var6.baseNode) {
            var1[var3++] = var6;
         }
      }

      return var3;
   }

   public int size() {
      int var2 = 0;

      for(int var3 = 0; var3 < this.maxSize * -2036604759; ++var3) {
         NodeListNode var4 = this.nodeArray[var3];

         for(NodeListNode var5 = var4.baseNode; var4 != var5; var5 = var5.baseNode) {
            ++var2;
         }
      }

      return var2;
   }

   public void insert(NodeListNode var1, long index) {
      if(null != var1.nextNode) {
         var1.shiftNext();
      }

      NodeListNode pos = this.nodeArray[(int)(index & (long)(-2036604759 * this.maxSize - 1))];
      var1.nextNode = pos.nextNode;
      var1.baseNode = pos;
      var1.nextNode.baseNode = var1;
      var1.baseNode.nextNode = var1;
      var1.id = -3961580539627386977L * index;
   }

   public void method5938(int var1) {
      int var2 = 0;

      while(var2 < this.maxSize * -2036604759) {
         NodeListNode var3 = this.nodeArray[var2];

         while(true) {
            NodeListNode var4 = var3.baseNode;
            if(var4 == var3) {
               ++var2;
               break;
            }

            var4.shiftNext();
         }
      }

      this.current = null;
      this.next = null;
   }

   public NodeListNode method5939(int var1) {
      if(null == this.current) {
         return null;
      } else {
         for(NodeListNode var2 = this.nodeArray[(int)(1363276064536191985L * this.lastIndex & (long)(-2036604759 * this.maxSize - 1))]; var2 != this.current; this.current = this.current.baseNode) {
            if(this.current.id * 4058728944299054175L == 1363276064536191985L * this.lastIndex) {
               NodeListNode var3 = this.current;
               this.current = this.current.baseNode;
               return var3;
            }
         }

         this.current = null;
         return null;
      }
   }

   public NodeArrayList(int var1) {
      this.maxSize = var1 * 1590084505;
      this.nodeArray = new NodeListNode[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         NodeListNode var3 = this.nodeArray[var2] = new NodeListNode();
         var3.baseNode = var3;
         var3.nextNode = var3;
      }

   }

   public NodeListNode getNode(long index) {
      this.lastIndex = -5193204382704882415L * index;
      NodeListNode var3 = this.nodeArray[(int)(index & (long)(this.maxSize * -2036604759 - 1))];

      for(this.current = var3.baseNode; var3 != this.current; this.current = this.current.baseNode) {
         if(index == 4058728944299054175L * this.current.id) {
            NodeListNode var4 = this.current;
            this.current = this.current.baseNode;
            return var4;
         }
      }

      this.current = null;
      return null;
   }

   public Iterator iterator() {
      return new NodeListIterator(this);
   }

   public NodeListNode start() {
      this.index = 0;
      return this.next();
   }

   static final void method5943(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var2.intTypeIndex -= -1416056414;
      byte var4 = 10;
      byte[] var5 = new byte[]{(byte)var2.intTypes[-831324111 * var2.intTypeIndex]};
      byte[] var6 = new byte[]{(byte)var2.intTypes[1 + -831324111 * var2.intTypeIndex]};
      Class19.method112(var0, var4, var5, var6, var2, 191417370);
   }

   static void method5944(Renderer var0, Class240_Sub12 var1, MapIcon var2, byte var3) {
      Sprite var4 = var2.method6595(var0, -350388768);
      if(null != var4) {
         int var5 = var4.getWidth();
         if(var4.getHeight() > var5) {
            var5 = var4.getHeight();
         }

         byte var6 = 10;
         int var7 = -2101621525 * var1.anInt_6805;
         int var8 = 1962545839 * var1.anInt_6800;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         int var12;
         int var14;
         if(var2.iconTitle != null) {
            var9 = FriendPlayer.aRSFont_55.method5563(var2.iconTitle, (int[])null, Class248_Sub1.aStringArray_6451, (TextObjects[])null, (byte)1);

            for(var12 = 0; var12 < var9; ++var12) {
               String var13 = Class248_Sub1.aStringArray_6451[var12];
               if(var12 < var9 - 1) {
                  var13 = var13.substring(0, var13.length() - 4);
               }

               var14 = Class240_Sub22_Sub17.aClass198_8437.getRenderedWidth(var13);
               if(var14 > var10) {
                  var10 = var14;
               }
            }

            var11 = Class240_Sub22_Sub17.aClass198_8437.method2534() * var9 + Class240_Sub22_Sub17.aClass198_8437.method2533() / 2;
         }

         var12 = var1.anInt_6805 * -2101621525 + var5 / 2;
         int var21 = 1962545839 * var1.anInt_6800;
         if(var7 < var5 + Class248_Sub1.anInt_4110) {
            var7 = Class248_Sub1.anInt_4110;
            var12 = 5 + var6 + Class248_Sub1.anInt_4110 + var5 / 2 + var10 / 2;
         } else if(var7 > Class248_Sub1.anInt_4142 - var5) {
            var7 = Class248_Sub1.anInt_4142 - var5;
            var12 = Class248_Sub1.anInt_4142 - var5 / 2 - var6 - var10 / 2 - 5;
         }

         if(var8 < Class248_Sub1.anInt_4141 + var5) {
            var8 = Class248_Sub1.anInt_4141;
            var21 = var5 / 2 + Class248_Sub1.anInt_4141 + var6;
         } else if(var8 > Class248_Sub1.anInt_4134 - var5) {
            var8 = Class248_Sub1.anInt_4134 - var5;
            var21 = Class248_Sub1.anInt_4134 - var5 / 2 - var6 - var11;
         }

         var14 = (int)(Math.atan2((double)(var7 - -2101621525 * var1.anInt_6805), (double)(var8 - var1.anInt_6800 * 1962545839)) / 3.141592653589793D * 32767.0D) & '\uffff';
         var4.rotateDraw((float)var5 / 2.0F + (float)var7, (float)var8 + (float)var5 / 2.0F, 4096, var14);
         int var15 = -2;
         int var16 = -2;
         int var17 = -2;
         int var18 = -2;
         if(var2.iconTitle != null) {
            var15 = var12 - var10 / 2 - 5;
            var16 = var21;
            var17 = var15 + var10 + 10;
            var18 = var21 + Class240_Sub22_Sub17.aClass198_8437.method2534() * var9 + 3;
            if(139785021 * var2.anInt_9975 != 0) {
               var0.method1915(var15, var21, var17 - var15, var18 - var21, var2.anInt_9975 * 139785021, (byte)11);
            }

            if(0 != var2.anInt_9976 * 1764932847) {
               var0.method1972(var15, var21, var17 - var15, var18 - var21, var2.anInt_9976 * 1764932847, 1682354023);
            }

            for(int var19 = 0; var19 < var9; ++var19) {
               String var20 = Class248_Sub1.aStringArray_6451[var19];
               if(var19 < var9 - 1) {
                  var20 = var20.substring(0, var20.length() - 4);
               }

               Class240_Sub22_Sub17.aClass198_8437.method2536(var0, var20, var12, var21, -1932225859 * var2.anInt_9968, true);
               var21 += Class240_Sub22_Sub17.aClass198_8437.method2534();
            }
         }

         if(var2.anInt_9969 * 1517017943 != -1 || var2.iconTitle != null) {
            Class240_Sub33 var22 = new Class240_Sub33(var1);
            var5 >>= 1;
            var22.anInt_7473 = 162300619 * (var7 - var5);
            var22.anInt_7470 = (var5 + var7) * 239145167;
            var22.anInt_7472 = (var8 - var5) * -1806702777;
            var22.anInt_7476 = 1168931135 * (var5 + var8);
            var22.anInt_7471 = var15 * 1134347737;
            var22.anInt_7474 = var17 * 179355789;
            var22.anInt_7475 = var16 * 904545943;
            var22.anInt_7477 = -1412198869 * var18;
            IgnoredPlayer.aNodeList_114.addNode(var22, (short)-4567);
         }

      }
   }

   static final void method5945(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      Class240_Sub22_Sub16 var5 = Class525.aClass490_9274.method5748(var2, (byte)31);
      if(var5.method2682(var3, (byte)55).anInt_9665 * 1550870007 != 0) {
         throw new RuntimeException("");
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var5.method2683(var3, var4, 194578982);
      }
   }
}
