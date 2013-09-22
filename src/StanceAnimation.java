
public class StanceAnimation extends Animator {

   public boolean isStationary = false;
   RSCharacter character;


   void doAnimation(Animation var1, int var2, int var3) {
      if(!this.isStationary || !this.character.animation.isAnimating(1489083741) || this.character.animation.method5877((short)25050)) {
         Class281.method3653(var1, var2, this.character, 1218870332);
      }

   }

   StanceAnimation(RSCharacter var1, boolean var2) {
      super(var2);
      this.character = var1;
   }
}
