
public class Class508_Sub5_Sub1 extends Class508_Sub5 {

   float method4305(float var1, float var2, float var3, int var4) {
      float var5 = var1 - this.aFloat_6572;
      if(this.aClass43_9142.method376(-1947872961).floatX == Float.POSITIVE_INFINITY) {
         var2 = this.aClass43_9142.method379(-1444549920).getHyp();
      } else {
         float var6 = var2 / this.aClass43_9142.method376(-1357926238).getHyp();
         float var7 = var2 / 2.0F * var6;
         if(var7 > var5) {
            var2 -= this.aClass43_9142.method376(230924002).getHyp() * var3;
            if(var2 < 0.0F) {
               var2 = 0.0F;
            }
         } else if(var2 < this.aClass43_9142.method379(849830199).getHyp()) {
            var2 += this.aClass43_9142.method376(-1157033489).getHyp() * var3;
            if(var2 > this.aClass43_9142.method379(2032332482).getHyp()) {
               var2 = this.aClass43_9142.method379(715852811).getHyp();
            }
         }
      }

      return var2;
   }

   void method4302(ByteArrayDataNode var1, int var2) {}

   public Class508_Sub5_Sub1(Class43 var1) {
      super(var1);
   }
}
