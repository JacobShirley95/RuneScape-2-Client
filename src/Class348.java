
public class Class348 {

   public GameCoord gameCoord = new GameCoord();
   public Class342 aClass342_6586 = new Class342();


   public Class348(Class348 var1) {
      this.method4348(var1);
   }

   public void method4348(Class348 var1) {
      this.aClass342_6586.method4226(var1.aClass342_6586);
      this.gameCoord.setPos(var1.gameCoord);
   }

   public final void method4349() {
      this.aClass342_6586.method4222();
      this.gameCoord.invert();
      this.gameCoord.method4328(this.aClass342_6586);
   }

   public final void method4350(Class348 var1) {
      this.aClass342_6586.method4231(var1.aClass342_6586);
      this.gameCoord.method4328(var1.aClass342_6586);
      this.gameCoord.method4314(var1.gameCoord);
   }

   public String toString() {
      return "[" + this.aClass342_6586.toString() + "|" + this.gameCoord.toString() + "]";
   }

   public Class348() {}
}
