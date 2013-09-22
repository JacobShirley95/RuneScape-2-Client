import java.util.Queue;

public class Class507_Sub3 extends Animator {

   public Class507_Sub3() {
      super(true);
   }

   void doAnimation(Animation var1, int var2, int var3) {
      Class91.method1205(var1, var2, (byte)1);
   }

   public static void method1511(int var0) {
      Queue var1 = Class593.aQueue_9813;
      synchronized(Class593.aQueue_9813) {
         while(true) {
            Class240_Sub43_Sub2 var2 = (Class240_Sub43_Sub2)Class593.aQueue_9813.poll();
            if(null == var2) {
               return;
            }

            var2.addThisNode((short)16383);
         }
      }
   }
}
