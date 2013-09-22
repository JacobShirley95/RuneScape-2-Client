import java.util.Iterator;

public class Class527 implements Iterator {

   NodeList aNodeList_9290;
   static boolean[] loadedInterfaces;
   NodeListNode current = null;
   NodeListNode next;
   public static CacheDataUnpacker aCacheUnpacker_9294;
   static Sprite[] mapEdgeMarker;


   public boolean hasNext() {
      return this.next != this.aNodeList_9290.rootNode;
   }

   public void method6001(NodeList var1, int var2) {
      this.aNodeList_9290 = var1;
      this.next = this.aNodeList_9290.rootNode.baseNode;
      this.current = null;
   }

   void method6002(int var1) {
      this.next = this.aNodeList_9290.rootNode.baseNode;
      this.current = null;
   }

   public void remove() {
      if(this.current == null) {
         throw new IllegalStateException();
      } else {
         this.current.shiftNext();
         this.current = null;
      }
   }

   public Object next() {
      NodeListNode var1 = this.next;
      if(var1 == this.aNodeList_9290.rootNode) {
         var1 = null;
         this.next = null;
      } else {
         this.next = var1.baseNode;
      }

      this.current = var1;
      return var1;
   }

   public NodeListNode method6005(int var1) {
      this.method6002(-968716869);
      return (NodeListNode)this.next();
   }

   public Class527(NodeList var1) {
      this.aNodeList_9290 = var1;
      this.next = this.aNodeList_9290.rootNode.baseNode;
      this.current = null;
   }

   static final void method6006(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class633.method6704(var3, var4, var0, (byte)94);
   }
}
