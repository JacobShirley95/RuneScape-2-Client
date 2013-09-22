import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {

   Component aComponent_3269;


   public final void update(Graphics var1) {
      this.aComponent_3269.update(var1);
   }

   Canvas_Sub1(Component var1) {
      this.aComponent_3269 = var1;
   }

   public final void paint(Graphics var1) {
      this.aComponent_3269.paint(var1);
   }
}
