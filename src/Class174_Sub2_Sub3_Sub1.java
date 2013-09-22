import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class174_Sub2_Sub3_Sub1 extends Class174_Sub2_Sub3 {

   Image anImage_3244;
   static long aLong_3245;


   public final int method7574(int var1, int var2) {
      Graphics var3 = this.aCanvas_1912.getGraphics();
      if(var3 == null) {
         return 0;
      } else {
         var3.drawImage(this.anImage_3244, var1, var2, this.aCanvas_1912);
         return 0;
      }
   }

   Class174_Sub2_Sub3_Sub1(SoftwareRenderer var1, Canvas var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      new Rectangle();
      this.method1269((byte)4);
   }

   public void method2195() {}

   public int method7576() {
      return this.method7574(0, 0);
   }

   void method1269(byte var1) {
      super.method1269((byte)4);
      DataBufferInt var2 = new DataBufferInt(this.anIntArray_1911, this.anIntArray_1911.length);
      DirectColorModel var3 = new DirectColorModel(32, 16711680, '\uff00', 255);
      WritableRaster var4 = Raster.createWritableRaster(var3.createCompatibleSampleModel(-1851521955 * this.anInt_1913, 1039204617 * this.anInt_1914), var2, (Point)null);
      this.anImage_3244 = new BufferedImage(var3, var4, false, new Hashtable());
   }
}
