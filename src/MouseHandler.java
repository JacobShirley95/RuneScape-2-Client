import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseHandler extends AbstractMouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener {

   int mouseY;
   static final int anInt_6367 = 2;
   static final int anInt_6368 = 4;
   int captureMouseX;
   static final int anInt_6370 = 1;
   int anInt_6371;
   NodeList captureMouseNodeList = new NodeList();
   int captureMouseY;
   NodeList mouseNodeList = new NodeList();
   int anInt_6375;
   int mouseX;
   Component targetComponent;
   boolean aBoolean_6378;
   public static FontRenderer aTextRenderer_6379;


   public synchronized void mouseMoved(MouseEvent var1) {
      this.logMouseMove(var1.getX(), var1.getY(), -886528978);
   }

   void destroy(int var1) {
      if(null != this.targetComponent) {
         this.targetComponent.removeMouseWheelListener(this);
         this.targetComponent.removeMouseMotionListener(this);
         this.targetComponent.removeMouseListener(this);
         this.targetComponent = null;
         this.anInt_6371 = 0;
         this.captureMouseY = 0;
         this.captureMouseX = 0;
         this.anInt_6375 = 0;
         this.mouseY = 0;
         this.mouseX = 0;
         this.captureMouseNodeList = null;
         this.mouseNodeList = null;
      }
   }

   void logMouseEvent(int var1, int x, int y, int mouseInfo, int var5) {
      MouseNode var6 = Class4.generateMouseNode(var1, x, y, Class373.getCurrentTime((short)20544), mouseInfo, 249283137);
      this.mouseNodeList.addNode(var6, (short)-1587);
   }

   void logMouseMove(int var1, int var2, int var3) {
      this.mouseX = -99999261 * var1;
      this.mouseY = var2 * -1353621035;
      if(this.aBoolean_6378) {
         this.logMouseEvent(-1, var1, var2, 0, 1482445951);
      }

   }

   public AbstractMouseNode method3103(int var1) {
      return (AbstractMouseNode)this.captureMouseNodeList.returnShift((byte)41);
   }

   public synchronized void captureMouse() {
      this.captureMouseX = this.mouseX * -360674187;
      this.captureMouseY = -2048198017 * this.mouseY;
      this.anInt_6371 = this.anInt_6375 * -145037847;
      NodeList var2 = this.captureMouseNodeList;
      this.captureMouseNodeList = this.mouseNodeList;
      this.mouseNodeList = var2;
      this.mouseNodeList.clear(-634559241);
   }

   public boolean method3099(short var1) {
      return (-1213400251 * this.anInt_6371 & 1) != 0;
   }

   public boolean method3106(int var1) {
      return (this.anInt_6371 * -1213400251 & 2) != 0;
   }

   void init(Component var1, byte var2) {
      this.destroy(665082802);
      this.targetComponent = var1;
      this.targetComponent.addMouseListener(this);
      this.targetComponent.addMouseMotionListener(this);
      this.targetComponent.addMouseWheelListener(this);
   }

   public int getCaptureMouseX() {
      return this.captureMouseX * -847655105;
   }

   public void method3105(int var1) {
      this.destroy(665082802);
   }

   public synchronized void mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public synchronized void mouseEntered(MouseEvent var1) {
      this.logMouseMove(var1.getX(), var1.getY(), -886528978);
   }

   public int getCaptureMouseY() {
      return -561504253 * this.captureMouseY;
   }

   MouseHandler(Component var1, boolean var2) {
      this.init(var1, (byte)-41);
      this.aBoolean_6378 = var2;
   }

   public synchronized void mouseReleased(MouseEvent var1) {
      int var2 = this.getMouseButton(var1, (byte)64);
      if(0 == (this.anInt_6375 * -763925811 & var2)) {
         var2 = this.anInt_6375 * -763925811;
      }

      if((var2 & 1) != 0) {
         this.logMouseEvent(3, var1.getX(), var1.getY(), var1.getClickCount(), -160564645);
      }

      if(0 != (var2 & 4)) {
         this.logMouseEvent(5, var1.getX(), var1.getY(), var1.getClickCount(), 242710415);
      }

      if(0 != (var2 & 2)) {
         this.logMouseEvent(4, var1.getX(), var1.getY(), var1.getClickCount(), 2007568238);
      }

      this.anInt_6375 = (-763925811 * this.anInt_6375 & ~var2) * -1882549755;
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   int getMouseButton(MouseEvent var1, byte var2) {
      return var1.getButton() == 1?(var1.isMetaDown()?4:1):(var1.getButton() == 2?2:(var1.getButton() == 3?4:0));
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      int var2 = var1.getX();
      int var3 = var1.getY();
      int var4 = var1.getWheelRotation();
      this.logMouseEvent(6, var2, var3, var4, 1559592036);
      var1.consume();
   }

   public boolean method3101(int var1) {
      return 0 != (this.anInt_6371 * -1213400251 & 4);
   }

   public synchronized void mouseDragged(MouseEvent var1) {
      this.logMouseMove(var1.getX(), var1.getY(), -886528978);
   }

   public synchronized void mousePressed(MouseEvent var1) {
      int var2 = this.getMouseButton(var1, (byte)113);
      if(1 == var2) {
         this.logMouseEvent(0, var1.getX(), var1.getY(), var1.getClickCount(), 353164888);
      } else if(var2 == 4) {
         this.logMouseEvent(2, var1.getX(), var1.getY(), var1.getClickCount(), 1977946212);
      } else if(2 == var2) {
         this.logMouseEvent(1, var1.getX(), var1.getY(), var1.getClickCount(), 1036655436);
      }

      this.anInt_6375 = (this.anInt_6375 * -763925811 | var2) * -1882549755;
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public synchronized void mouseExited(MouseEvent var1) {
      this.logMouseMove(var1.getX(), var1.getY(), -886528978);
   }
}
