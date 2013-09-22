
public class NodeListNode {

   public long id;
   public NodeListNode baseNode;
   public NodeListNode nextNode;


   public void shiftNext() {
      if(this.nextNode != null) {
         this.nextNode.baseNode = this.baseNode;
         this.baseNode.nextNode = this.nextNode;
         this.baseNode = null;
         this.nextNode = null;
      }
   }

   public boolean hasNext() {
      return null != this.nextNode;
   }

   static final void method3094(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub14_7322.method1701(-2094307763);
   }

   public static void method3095(int var0, int var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(22, (long)var0);
      var2.method597((byte)0);
   }
}
