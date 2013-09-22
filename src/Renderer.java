import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Renderer {

   public final int rendererID;
   public static final int anInt_2794 = 1;
   protected static final int anInt_2795 = 1;
   int anInt_2796 = -746211037;
   public static final int anInt_2797 = 5;
   static final int anInt_2798 = 8;
   static boolean[] aBooleanArray_2799 = new boolean[8];
   public static final int anInt_2800 = 3;
   public final Class96 aClass96_2801;
   public final Class163 aClass163_2802;
   public static final int anInt_2803 = 0;
   public static final int anInt_2804 = 1;
   public static final int anInt_2805 = 2;
   protected static final int anInt_2806 = 8;
   protected static final int anInt_2807 = 2;
   protected static final int anInt_2808 = 4;
   public static final int anInt_2809 = 2;
   protected static final int anInt_2810 = 16;
   protected static final int anInt_2811 = 32;
   static final int anInt_2812 = 4;
   protected Class174_Sub2 softwareTarget;
   public static final int anInt_2814 = 0;
   protected DrawingTarget aClass174_2815;
   protected Hashtable canvasMap = new Hashtable();
   final Class174_Sub1[] aClass174_Sub1Array_2817 = new Class174_Sub1[4];


   public final void method1885(byte var1) throws Exception_Sub7 {
      this.method1886(0, 0);
   }

   abstract void method1886(int var1, int var2) throws Exception_Sub7;

   public abstract void method1887(int var1, int var2, int var3, int var4);

   abstract void method1888();

   public abstract void cleanup(int var1);

   public void finalize() {
      this.method1939(-1500363801);
   }

   public abstract Class174_Sub1 method1890();

   public abstract boolean method1891();

   public abstract boolean method1892();

   public abstract boolean supportsTexture();

   public abstract boolean method1894();

   public void method1895(int[] var1) {
      if(this.softwareTarget != null) {
         var1[0] = this.softwareTarget.method2194();
         var1[1] = this.softwareTarget.method2198();
      } else {
         var1[1] = 0;
         var1[0] = 0;
      }

   }

   public final DrawingTarget method1896(int var1) {
      return this.aClass174_2815;
   }

   public final void addDrawingTarget(Canvas var1, int var2, int var3, byte var4) {
      if(!this.canvasMap.containsKey(var1)) {
         Class619.setIgnoreRepaint(var1, 974391207);
         this.addCanvas(var1, this.method1903(var1, var2, var3), (short)255);
      }

   }

   final void addCanvas(Canvas var1, Class174_Sub2 var2, short var3) {
      if(var2 == null) {
         throw new RuntimeException();
      } else {
         this.canvasMap.put(var1, var2);
      }
   }

   public final void method1899(Canvas var1, int var2) {
      if(this.canvasMap.containsKey(var1)) {
         Class174_Sub2 var3 = (Class174_Sub2)this.canvasMap.get(var1);
         var3.method2195();
         this.canvasMap.remove(var1);
      }

   }

   public abstract boolean method1900();

   public final void method1901(Class174_Sub1 var1, int var2) {
      if(this.anInt_2796 * 1843773813 >= 3) {
         throw new RuntimeException();
      } else {
         if(this.anInt_2796 * 1843773813 >= 0) {
            this.aClass174_Sub1Array_2817[1843773813 * this.anInt_2796].method2197();
         } else {
            this.softwareTarget.method2197();
         }

         this.aClass174_2815 = this.aClass174_Sub1Array_2817[(this.anInt_2796 += 746211037) * 1843773813] = var1;
         var1.method2196();
      }
   }

   public final void method1902(Class174_Sub1 var1, int var2) {
      if(1843773813 * this.anInt_2796 >= 0 && this.aClass174_Sub1Array_2817[this.anInt_2796 * 1843773813] == var1) {
         this.aClass174_Sub1Array_2817[(this.anInt_2796 -= 746211037) * 1843773813 + 1] = null;
         var1.method2197();
         if(this.anInt_2796 * 1843773813 >= 0) {
            this.aClass174_2815 = this.aClass174_Sub1Array_2817[1843773813 * this.anInt_2796];
            this.aClass174_Sub1Array_2817[this.anInt_2796 * 1843773813].method2196();
         } else {
            this.aClass174_2815 = this.softwareTarget;
            this.softwareTarget.method2196();
         }

      } else {
         throw new RuntimeException();
      }
   }

   abstract Class174_Sub2 method1903(Canvas var1, int var2, int var3);

   public final void method1904(int var1, int var2, int var3, int var4, int var5) {
      this.method1951(var1, var2, var3, var4, 1);
   }

   public abstract Class99 method1905(int var1, int var2, int var3);

   public abstract int[] method1906(int var1, int var2, int var3, int var4);

   public abstract void method1907();

   public abstract void method1908();

   public abstract void method1909(int var1, int var2, int var3, int var4);

   public abstract Class1024 method1910(int var1, int var2, int[] var3, int[] var4);

   public abstract void method1911(int var1, int var2, int var3, int var4);

   public void method1912(boolean var1) {}

   public abstract void method1913(int[] var1);

   public abstract void setViewport(Viewport var1);

   public final void method1915(int var1, int var2, int var3, int var4, int var5, byte var6) {
      this.drawOutline(var1, var2, var3, var4, var5, 1);
   }

   public final void method1916(int var1, int var2, int var3, int var4, short var5) {
      this.method1937(var1, var2, var3, var4, 1);
   }

   public final void method1917(int var1, int var2, int var3, int var4, byte var5) {
      this.method1922(var1, var2, var3, var4, 1);
   }

   public abstract Class99 method1918(int var1, int var2);

   public final void method1919(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method1968(var1, var2, var3, var4, var5, 1);
   }

   public abstract void method1920(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract void method1921(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

   public abstract void method1922(int var1, int var2, int var3, int var4, int var5);

   public abstract void method1923(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

   public abstract RendererInfo getRendererInfo();

   public abstract void method1925(Class177 var1);

   public abstract Class240_Sub51 method1926(int var1);

   public abstract Class101 method1927(int var1, int var2, Class136 var3, Class87 var4, int var5);

   public Sprite method1928(int var1, int var2, boolean var3, int var4) {
      return this.method1929(var1, var2, var3, false);
   }

   public abstract Sprite method1929(int var1, int var2, boolean var3, boolean var4);

   public abstract Sprite method1930(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract Sprite loadSprite(AbstractImageData var1, boolean var2);

   public abstract Sprite method1932(int var1, int var2, int var3, int var4, boolean var5);

   public void method1933() {}

   public abstract void method1934(int var1, Class1024 var2, int var3, int var4);

   public abstract FontRenderer method1935(RSFont var1, ImageData[] var2, boolean var3);

   public abstract ArrayViewport method1936();

   abstract void method1937(int var1, int var2, int var3, int var4, int var5);

   public abstract void method1938(int var1);

   public void method1939(int var1) {
      aBooleanArray_2799[this.rendererID * -1555911463] = false;
      Enumeration var2 = this.canvasMap.keys();

      while(var2.hasMoreElements()) {
         Canvas var3 = (Canvas)var2.nextElement();
         Class174_Sub2 var4 = (Class174_Sub2)this.canvasMap.get(var3);
         var4.method2195();
      }

      this.method1888();
   }

   public abstract int method1940(int var1, int var2);

   public abstract int method1941(int var1, int var2);

   public abstract Plane createPlane(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7);

   public boolean method1943(int var1) {
      return true;
   }

   public abstract void method1944(Class167 var1);

   public abstract void method1945(int var1, float var2, float var3, float var4, float var5, float var6);

   public abstract void method1946(ArrayViewport var1);

   public abstract void method1947(float var1);

   public abstract void method1948(int var1);

   public abstract void method1949(int var1, int var2, int var3);

   public Class240_Sub53 method1950(int var1, int var2, int var3, int var4, int var5, float var6) {
      return new Class240_Sub53(var1, var2, var3, var4, var5, var6);
   }

   public abstract void method1951(int var1, int var2, int var3, int var4, int var5);

   public abstract Class177 method1952(int var1);

   public abstract boolean method1953();

   public abstract void method1954(int var1, int var2, int var3, int var4, int var5, int var6, Class1024 var7, int var8, int var9);

   abstract void method1955(float var1, float var2, float var3, float var4, float var5, float var6);

   public abstract void method1956(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public abstract void method1957(int var1, Class105 var2);

   public abstract void method1958(int var1, Class105 var2);

   public abstract boolean method1959();

   public abstract void getScreenPosHidden(float var1, float var2, float var3, float[] input);

   public abstract void method1961(boolean var1);

   public abstract void method1962();

   public abstract boolean method1963();

   public abstract boolean method1964();

   public abstract void method1965(int var1, int var2, int var3, int var4);

   public abstract Viewport getViewport();

   public abstract void method1967();

   public abstract void method1968(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract boolean method1969();

   public abstract void method1970(float var1, float var2);

   public abstract void enableZBuffering(boolean var1);

   public final void method1972(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method1920(var1, var2, var3, var4, var5, 1);
   }

   public abstract void method1973();

   public abstract void method1974(int var1, int var2, int var3, int var4, int var5, int var6, Class1024 var7, int var8, int var9, int var10, int var11, int var12);

   public abstract Model createModel(ModelData var1, int var2, int var3, int var4, int var5);

   public final void method1976(Canvas var1, int var2, int var3, int var4) {
      Class174_Sub2 var5 = (Class174_Sub2)this.canvasMap.get(var1);
      if(null == var5) {
         throw new RuntimeException();
      } else {
         var5.method7575(var2, var3);
      }
   }

   public abstract void method1977(int var1, int var2);

   public abstract int method1978(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract Viewport method1979();

   public Sprite defineSprite(int[] var1, int var2, int var3, int var4, int var5) {
      return this.method1930(var1, var2, var3, var4, var5, true);
   }

   public abstract void method1981();

   public final void method1982(Canvas var1, int var2) {
      Class174_Sub2 target = (Class174_Sub2)this.canvasMap.get(var1);
      if(null == target) {
         throw new RuntimeException();
      } else if(this.anInt_2796 * 1843773813 <= 0 && this.softwareTarget == this.aClass174_2815) {
         if(null != this.aClass174_2815) {
            this.aClass174_2815.method2197();
         }

         if(this.anInt_2796 * 1843773813 < 0) {
            this.aClass174_2815 = target;
         }

         this.softwareTarget = target;
         target.method2196();
      } else {
         throw new RuntimeException();
      }
   }

   public void method1983(float var1, float var2, float var3, int var4) {
      this.method1955(var1, var2, var3, 0.0F, 1.0F, 1.0F);
   }

   public abstract ArrayViewport method1984();

   public abstract Class177 method1985(Class177 var1, Class177 var2, float var3, Class177 var4);

   public abstract void method1986(Class240_Sub51 var1);

   public abstract int getHeap();

   public abstract void drawOutline(int var1, int var2, int var3, int var4, int var5, int var6);

   public abstract boolean method1989();

   public abstract void method1990();

   public abstract void method1991(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

   Renderer(Class163 var1, Class96 var2) {
      this.aClass163_2802 = var1;
      this.aClass96_2801 = var2;
      int var3 = -1;

      for(int var4 = 0; var4 < 8; ++var4) {
         if(!aBooleanArray_2799[var4]) {
            aBooleanArray_2799[var4] = true;
            var3 = var4;
            break;
         }
      }

      if(var3 == -1) {
         throw new IllegalStateException("");
      } else {
         this.rendererID = 93000553 * var3;
      }
   }

   public abstract boolean method1992();

   public abstract void method1993(int var1, Class240_Sub53[] var2);

   public abstract int method1994();

   public abstract void getScreenPosVisible(float var1, float var2, float var3, float[] var4);
}
