import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Iterator;

public class NodeList implements Iterable, Collection {

   NodeListNode nextNode;
   static FileOutputStream aFileOutputStream_9066;
   public NodeListNode rootNode = new NodeListNode();
   static Class240_Sub35 aClass240_Sub35_9068;


   public void clear(int var1) {
      while(this.rootNode.baseNode != this.rootNode) {
         this.rootNode.baseNode.shiftNext();
      }
   }

   public void addNode(NodeListNode var1, short var2) {
      if(null != var1.nextNode) {
         var1.shiftNext();
      }

      var1.nextNode = this.rootNode.nextNode;
      var1.baseNode = this.rootNode;
      var1.nextNode.baseNode = var1;
      var1.baseNode.nextNode = var1;
   }

   void insertNode(NodeList var1, NodeListNode at, byte var3) {
      NodeListNode var4 = this.rootNode.nextNode;
      this.rootNode.nextNode = at.nextNode;
      at.nextNode.baseNode = this.rootNode;
      if(at != this.rootNode) {
         at.nextNode = var1.rootNode.nextNode;
         at.nextNode.baseNode = at;
         var4.baseNode = var1.rootNode;
         var1.rootNode.nextNode = var4;
      }

   }

   public void insert(NodeList var1) {
      if(this.rootNode != this.rootNode.baseNode) {
         this.insertNode(var1, this.rootNode.baseNode, (byte)85);
      }
   }

   public NodeListNode method5788(int var1) {
      return this.method5789((NodeListNode)null, -1167669638);
   }

   NodeListNode method5789(NodeListNode var1, int var2) {
      NodeListNode var3;
      if(null == var1) {
         var3 = this.rootNode.nextNode;
      } else {
         var3 = var1;
      }

      if(var3 == this.rootNode) {
         this.nextNode = null;
         return null;
      } else {
         this.nextNode = var3.nextNode;
         return var3;
      }
   }

   public NodeListNode method5790(byte var1) {
      NodeListNode var2 = this.nextNode;
      if(var2 == this.rootNode) {
         this.nextNode = null;
         return null;
      } else {
         this.nextNode = var2.nextNode;
         return var2;
      }
   }

   public int getSize(int var1) {
      int var2 = 0;

      for(NodeListNode var3 = this.rootNode.baseNode; var3 != this.rootNode; var3 = var3.baseNode) {
         ++var2;
      }

      return var2;
   }

   public boolean isEmpty(int var1) {
      return this.rootNode == this.rootNode.baseNode;
   }

   public Iterator iterator() {
      return new Class527(this);
   }

   public int size() {
      return this.getSize(1279861479);
   }

   public boolean isEmpty() {
      return this.isEmpty(1727859819);
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public NodeListNode getNext(int var1) {
      NodeListNode var2 = this.nextNode;
      if(this.rootNode == var2) {
         this.nextNode = null;
         return null;
      } else {
         this.nextNode = var2.baseNode;
         return var2;
      }
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(NodeListNode var3 = this.rootNode.baseNode; var3 != this.rootNode; var3 = var3.baseNode) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.clear(-2011724000);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public void method5806(NodeListNode var1, int var2) {
      if(var1.nextNode != null) {
         var1.shiftNext();
      }

      var1.nextNode = this.rootNode;
      var1.baseNode = this.rootNode.baseNode;
      var1.nextNode.baseNode = var1;
      var1.baseNode.nextNode = var1;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public NodeListNode returnShift(byte var1) {
      NodeListNode var2 = this.rootNode.baseNode;
      if(this.rootNode == var2) {
         return null;
      } else {
         var2.shiftNext();
         return var2;
      }
   }

   public NodeListNode getBaseNode_2(byte var1) {
      return this.getBaseNode((NodeListNode)null, 1608034178);
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean add(Object var1) {
	  addNode((NodeListNode)var1, (short)0);
      return true;
   }

   NodeListNode[] method5812(int var1) {
      NodeListNode[] var2 = new NodeListNode[this.getSize(1279861479)];
      int var3 = 0;

      for(NodeListNode var4 = this.rootNode.baseNode; this.rootNode != var4; var4 = var4.baseNode) {
         var2[var3++] = var4;
      }

      return var2;
   }

   public NodeList() {
      this.rootNode.baseNode = this.rootNode;
      this.rootNode.nextNode = this.rootNode;
   }

   NodeListNode getBaseNode(NodeListNode var1, int var2) {
      NodeListNode var3;
      if(var1 == null) {
         var3 = this.rootNode.baseNode;
      } else {
         var3 = var1;
      }

      if(this.rootNode == var3) {
         this.nextNode = null;
         return null;
      } else {
         this.nextNode = var3.baseNode;
         return var3;
      }
   }

   public Object[] toArray() {
      return this.method5812(1308889579);
   }

   static final void method5815(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class563_Sub1_Sub1_Sub2.method5213(var3, var4, var0, -295747913);
   }

   public static String method5816(OptionListNode var0, int var1) {
      if(!Class18.optionsClosed && null != var0) {
         int[] var2 = Class421.method5267(var0, (byte)53);
         return null == var2?"":Class5.method28(var2, -1088832962);
      } else {
         return "";
      }
   }

   static final void method5817(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -899518555 * Class576.anInt_9664;
   }

   public static Class577 method5818(int var0, int var1) {
      Class577[] var2 = Class41.method335(-2146237925);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         if(var0 == var2[var3].anInt_9665 * 1550870007) {
            return var2[var3];
         }
      }

      return null;
   }
}
