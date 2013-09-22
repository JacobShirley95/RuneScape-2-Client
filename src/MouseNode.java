
public final class MouseNode extends AbstractMouseNode {

   int mouseX;
   static int maxMouseNodes;
   int mouseInfo;
   int mouseY;
   int clickType;
   long time;
   static MouseNode[] mouseNodeArray = new MouseNode[0];


   public int getClickType(int var1) {
      return this.clickType * 562871553;
   }

   public int getMouseX(byte var1) {
      return -1256013661 * this.mouseX;
   }

   public int getMouseY(int var1) {
      return 1955724583 * this.mouseY;
   }

   public int getMouseInfo() {
      return this.mouseInfo * -2107417923;
   }

   public long method4940(byte var1) {
      return this.time * 5332804938949757775L;
   }

   public void addThisNode(short var1) {
      synchronized(mouseNodeArray) {
         if(Class279.mouseNodeIndex * -2143045153 < 1582624395 * maxMouseNodes - 1) {
            mouseNodeArray[(Class279.mouseNodeIndex += 1010778655) * -2143045153 - 1] = this;
         }
      }
   }
}
