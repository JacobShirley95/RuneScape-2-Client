import jaggl.OpenGL;
import java.awt.Canvas;

public class Class307 {

   Class307() throws Throwable {
      throw new Error();
   }

   public static Renderer getOpenGLRenderer(Canvas var0, Class163 var1, Class96 var2, CacheDataUnpacker var3, int var4) {
      try {
         Renderer_Sub3.method7281();
         Class183.getLibLoader(1467100904).loadLib("jaggl", (byte)113);
         Class619.setIgnoreRepaint(var0, 277439103);
         OpenGL var5 = new OpenGL();
         long var6 = var5.init(var0, 8, 8, 8, 24, 0, var4);
         if(var6 == 0L) {
            throw new RuntimeException("");
         } else {
            OpenGLRenderer_Sub1 var8 = new OpenGLRenderer_Sub1(var5, var0, var6, var1, var2, var3, var4);
            var8.init();
            return var8;
         }
      } catch (RuntimeException var9) {
         throw var9;
      } catch (Throwable var10) {
         throw new RuntimeException("");
      }
   }
}
