
public class Class240_Sub41_Sub4 extends Class240_Sub41 {

   int anInt_1063 = 0;
   NodeList aNodeList_1064 = new NodeList();
   NodeList aNodeList_1065 = new NodeList();
   int anInt_1066 = -1;


   public final synchronized void method521(Class240_Sub41 var1) {
      this.aNodeList_1064.method5806(var1, -1734052439);
   }

   public final synchronized void method4935(int var1) {
      do {
         if(this.anInt_1066 < 0) {
            this.method526(var1);
            return;
         }

         if(this.anInt_1063 + var1 < this.anInt_1066) {
            this.anInt_1063 += var1;
            this.method526(var1);
            return;
         }

         int var2 = this.anInt_1066 - this.anInt_1063;
         this.method526(var2);
         var1 -= var2;
         this.anInt_1063 += var2;
         this.method530();
         Class240_Sub3 var3 = (Class240_Sub3)this.aNodeList_1065.getBaseNode_2((byte)61);
         synchronized(var3) {
            int var5 = var3.method4431(this);
            if(var5 < 0) {
               var3.anInt_6749 = 0;
               this.method527(var3);
            } else {
               var3.anInt_6749 = var5;
               this.method523(var3.baseNode, var3);
            }
         }
      } while(var1 != 0);

   }

   void method523(NodeListNode var1, Class240_Sub3 var2) {
      while(var1 != this.aNodeList_1065.rootNode && ((Class240_Sub3)var1).anInt_6749 <= var2.anInt_6749) {
         var1 = var1.baseNode;
      }

      Class592.method6419(var2, var1, 1725766558);
      this.anInt_1066 = ((Class240_Sub3)this.aNodeList_1065.rootNode.baseNode).anInt_6749;
   }

   Class240_Sub41 method4936() {
      return (Class240_Sub41)this.aNodeList_1064.getBaseNode_2((byte)15);
   }

   void method525(int[] var1, int var2, int var3) {
      for(Class240_Sub41 var4 = (Class240_Sub41)this.aNodeList_1064.getBaseNode_2((byte)27); var4 != null; var4 = (Class240_Sub41)this.aNodeList_1064.getNext(-424902761)) {
         var4.method4934(var1, var2, var3);
      }

   }

   void method526(int var1) {
      for(Class240_Sub41 var2 = (Class240_Sub41)this.aNodeList_1064.getBaseNode_2((byte)33); var2 != null; var2 = (Class240_Sub41)this.aNodeList_1064.getNext(-1116548512)) {
         var2.method4935(var1);
      }

   }

   void method527(Class240_Sub3 var1) {
      var1.shiftNext();
      var1.method4432();
      NodeListNode var2 = this.aNodeList_1065.rootNode.baseNode;
      if(var2 == this.aNodeList_1065.rootNode) {
         this.anInt_1066 = -1;
      } else {
         this.anInt_1066 = ((Class240_Sub3)var2).anInt_6749;
      }

   }

   int method4933() {
      return 0;
   }

   public final synchronized void method4937(int[] var1, int var2, int var3) {
      do {
         if(this.anInt_1066 < 0) {
            this.method525(var1, var2, var3);
            return;
         }

         if(this.anInt_1063 + var3 < this.anInt_1066) {
            this.anInt_1063 += var3;
            this.method525(var1, var2, var3);
            return;
         }

         int var4 = this.anInt_1066 - this.anInt_1063;
         this.method525(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.anInt_1063 += var4;
         this.method530();
         Class240_Sub3 var5 = (Class240_Sub3)this.aNodeList_1065.getBaseNode_2((byte)109);
         synchronized(var5) {
            int var7 = var5.method4431(this);
            if(var7 < 0) {
               var5.anInt_6749 = 0;
               this.method527(var5);
            } else {
               var5.anInt_6749 = var7;
               this.method523(var5.baseNode, var5);
            }
         }
      } while(var3 != 0);

   }

   void method530() {
      if(this.anInt_1063 > 0) {
         for(Class240_Sub3 var1 = (Class240_Sub3)this.aNodeList_1065.getBaseNode_2((byte)29); var1 != null; var1 = (Class240_Sub3)this.aNodeList_1065.getNext(-723278673)) {
            var1.anInt_6749 -= this.anInt_1063;
         }

         this.anInt_1066 -= this.anInt_1063;
         this.anInt_1063 = 0;
      }

   }

   public final synchronized void method531(Class240_Sub41 var1) {
      var1.shiftNext();
   }

   Class240_Sub41 method4931() {
      return (Class240_Sub41)this.aNodeList_1064.getNext(-1660609740);
   }
}
