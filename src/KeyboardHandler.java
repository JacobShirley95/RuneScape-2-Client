import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyboardHandler extends AbstractKeyboardHandler implements KeyListener, FocusListener {

   static int[] anIntArray_6590 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   static final int anInt_6591 = 128;
   NodeList aNodeList_6592 = new NodeList();
   static final int anInt_6593 = 112;
   boolean[] aBooleanArray_6594 = new boolean[112];
   Component aComponent_6595;
   NodeList aNodeList_6596 = new NodeList();


   public void method3210(int var1) {
      this.method4361(-1260807099);
   }

   void method4360(Component var1, int var2) {
      this.method4361(668501597);
      this.aComponent_6595 = var1;
      this.aComponent_6595.addKeyListener(this);
      this.aComponent_6595.addFocusListener(this);
   }

   void method4361(int var1) {
      if(null != this.aComponent_6595) {
         this.aComponent_6595.removeKeyListener(this);
         this.aComponent_6595.removeFocusListener(this);
         this.aComponent_6595 = null;

         for(int var2 = 0; var2 < 112; ++var2) {
            this.aBooleanArray_6594[var2] = false;
         }

         this.aNodeList_6592.clear(-536170903);
         this.aNodeList_6596.clear(-878988031);
      }
   }

   public Class233 method3209(int var1) {
      return (Class233)this.aNodeList_6592.returnShift((byte)-71);
   }

   void addNode(int var1, char var2, int var3, int var4) {
      KeyEventNode var5 = new KeyEventNode();
      var5.type = var1 * -1648695987;
      var5.fontChar = var2;
      var5.charCode = var3 * 1705485251;
      var5.time = Class373.getCurrentTime((short)3544) * 3261241776250308733L;
      this.aNodeList_6596.addNode(var5, (short)-10233);
   }

   void handleEvent(KeyEvent var1, int var2, int var3) {
      int keyCode = var1.getKeyCode();
      if(keyCode != 0) {
         if(keyCode >= 0 && keyCode < anIntArray_6590.length) {
            keyCode = anIntArray_6590[keyCode];
            if(var2 == 0 && 0 != (keyCode & 128)) {
               keyCode = 0;
            } else {
               keyCode &= -129;
            }
         } else {
            keyCode = 0;
         }
      } else {
         keyCode = 0;
      }

      if(0 != keyCode) {
         this.addNode(var2, '\uffff', keyCode, 16711680);
         var1.consume();
      }
   }

   public synchronized void keyPressed(KeyEvent var1) {
      this.handleEvent(var1, 0, -328153823);
   }

   public synchronized void keyReleased(KeyEvent var1) {
      this.handleEvent(var1, 1, -1955801447);
   }

   public synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if('\uffff' != var2 && Class535.method6061(var2, -1224847710)) {
         this.addNode(3, var2, -1, 16711680);
         var1.consume();
      }
   }

   public void focusGained(FocusEvent var1) {}

   public synchronized void focusLost(FocusEvent var1) {
      this.addNode(-1, '\u0000', 0, 16711680);
   }

   public boolean method3208(int var1, int var2) {
      return var1 >= 0 && var1 < 112?this.aBooleanArray_6594[var1]:false;
   }

   int method4371(int var1) {
      int var2 = 0;
      if(this.aBooleanArray_6594[81]) {
         var2 |= 1;
      }

      if(this.aBooleanArray_6594[82]) {
         var2 |= 4;
      }

      if(this.aBooleanArray_6594[86]) {
         var2 |= 2;
      }

      return var2;
   }

   public synchronized void captureKeyboard(int var1) {
      this.aNodeList_6592.clear(1473938424);

      for(KeyEventNode var2 = (KeyEventNode)this.aNodeList_6596.returnShift((byte)-27); null != var2; var2 = (KeyEventNode)this.aNodeList_6596.returnShift((byte)47)) {
         var2.anInt_6830 = this.method4371(1727510568) * 1671843599;
         if(0 == var2.type * 1136057221) {
            if(!this.aBooleanArray_6594[-192813845 * var2.charCode]) {
               KeyEventNode var3 = new KeyEventNode();
               var3.type = 0;
               var3.fontChar = '\uffff';
               var3.charCode = 1 * var2.charCode;
               var3.time = var2.time * 1L;
               var3.anInt_6830 = 1 * var2.anInt_6830;
               this.aNodeList_6592.addNode(var3, (short)-24877);
               this.aBooleanArray_6594[var2.charCode * -192813845] = true;
            }

            var2.type = 997575322;
            this.aNodeList_6592.addNode(var2, (short)20708);
         } else if(1 == 1136057221 * var2.type) {
            if(this.aBooleanArray_6594[-192813845 * var2.charCode]) {
               this.aNodeList_6592.addNode(var2, (short)8231);
               this.aBooleanArray_6594[-192813845 * var2.charCode] = false;
            }
         } else if(-1 == var2.type * 1136057221) {
            for(int var5 = 0; var5 < 112; ++var5) {
               if(this.aBooleanArray_6594[var5]) {
                  KeyEventNode var4 = new KeyEventNode();
                  var4.type = -1648695987;
                  var4.fontChar = '\uffff';
                  var4.charCode = var5 * 1705485251;
                  var4.time = var2.time * 1L;
                  var4.anInt_6830 = var2.anInt_6830 * 1;
                  this.aNodeList_6592.addNode(var4, (short)-7516);
                  this.aBooleanArray_6594[var5] = false;
               }
            }
         } else if(3 == 1136057221 * var2.type) {
            this.aNodeList_6592.addNode(var2, (short)-1689);
         }
      }

   }

   KeyboardHandler(Component var1) {
      IgnoredPlayer.method74(230556749);
      this.method4360(var1, 1046827128);
   }

   static final void method4373(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class167.method2079(var3, var4, var0, -747395099);
   }
}
