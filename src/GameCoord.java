
public class GameCoord {

   public float floatY;
   static int anInt_6575;
   static int anInt_6576;
   public float floatX;
   static GameCoord[] gameCoordMap;
   public float floatZ;


   public static GameCoord method4306() {
      GameCoord[] var0 = gameCoordMap;
      synchronized(gameCoordMap) {
         if(anInt_6576 == 0) {
            return new GameCoord();
         } else {
            gameCoordMap[--anInt_6576].method4311();
            return gameCoordMap[anInt_6576];
         }
      }
   }

   public static GameCoord createCoord(float var0, float var1, float var2) {
      synchronized(gameCoordMap) {
         if(anInt_6576 == 0) {
            return new GameCoord(var0, var1, var2);
         } else {
            gameCoordMap[--anInt_6576].setPos(var0, var1, var2);
            return gameCoordMap[anInt_6576];
         }
      }
   }

   public static GameCoord method4308(GameCoord var0) {
      GameCoord[] var1 = gameCoordMap;
      synchronized(gameCoordMap) {
         if(anInt_6576 == 0) {
            return new GameCoord(var0);
         } else {
            gameCoordMap[--anInt_6576].setPos(var0);
            return gameCoordMap[anInt_6576];
         }
      }
   }

   static GameCoord method4309(ByteArrayDataNode var0) {
      GameCoord[] var1 = gameCoordMap;
      synchronized(gameCoordMap) {
         if(anInt_6576 == 0) {
            return new GameCoord(var0);
         } else {
            gameCoordMap[--anInt_6576].method4335(var0);
            return gameCoordMap[anInt_6576];
         }
      }
   }

   public void store() {
      GameCoord[] var1 = gameCoordMap;
      synchronized(gameCoordMap) {
         if(anInt_6576 < anInt_6575 - 1) {
            gameCoordMap[anInt_6576++] = this;
         }

      }
   }

   public GameCoord(float var1, float var2, float var3) {
      this.floatX = var1;
      this.floatY = var2;
      this.floatZ = var3;
   }

   GameCoord(ByteArrayDataNode var1) {
      this.floatX = var1.method4494(-822261228);
      this.floatY = var1.method4494(-822261228);
      this.floatZ = var1.method4494(-822261228);
   }

   public final void method4311() {
      this.floatZ = 0.0F;
      this.floatY = 0.0F;
      this.floatX = 0.0F;
   }

   public boolean method4312(GameCoord var1) {
      return this.floatX == var1.floatX && this.floatY == var1.floatY && this.floatZ == var1.floatZ;
   }

   public final void method4313() {
      float var1 = 1.0F / this.getHyp();
      this.floatX *= var1;
      this.floatY *= var1;
      this.floatZ *= var1;
   }

   public final void method4314(GameCoord var1) {
      this.floatX += var1.floatX;
      this.floatY += var1.floatY;
      this.floatZ += var1.floatZ;
   }

   public final void method4315(GameCoord var1, float var2) {
      this.floatX += var1.floatX * var2;
      this.floatY += var1.floatY * var2;
      this.floatZ += var1.floatZ * var2;
   }

   public static final GameCoord method4316(GameCoord var0, GameCoord var1) {
      GameCoord var2 = method4308(var0);
      var2.method4314(var1);
      return var2;
   }

   public final void dist(GameCoord var1) {
      this.floatX -= var1.floatX;
      this.floatY -= var1.floatY;
      this.floatZ -= var1.floatZ;
   }

   public final void method4318(float var1, float var2, float var3) {
      this.floatX -= var1;
      this.floatY -= var2;
      this.floatZ -= var3;
   }

   public final float method4319(GameCoord var1) {
      return this.floatX * var1.floatX + this.floatY * var1.floatY + this.floatZ * var1.floatZ;
   }

   final void method4320(GameCoord var1) {
      this.setPos(this.floatY * var1.floatZ - this.floatZ * var1.floatY, this.floatZ * var1.floatX - this.floatX * var1.floatZ, this.floatX * var1.floatY - this.floatY * var1.floatX);
   }

   public static final GameCoord method4321(GameCoord var0, GameCoord var1) {
      GameCoord var2 = method4308(var0);
      var2.method4320(var1);
      return var2;
   }

   public final void method4322() {
      if(this.floatX < 0.0F) {
         this.floatX *= -1.0F;
      }

      if(this.floatY < 0.0F) {
         this.floatY *= -1.0F;
      }

      if(this.floatZ < 0.0F) {
         this.floatZ *= -1.0F;
      }

   }

   final void method4323(GameCoord var1) {
      this.floatX *= var1.floatX;
      this.floatY *= var1.floatY;
      this.floatZ *= var1.floatZ;
   }

   public static final GameCoord method4324(GameCoord var0, GameCoord var1) {
      GameCoord var2 = method4308(var0);
      var2.method4323(var1);
      return var2;
   }

   public static final GameCoord method4325(GameCoord var0, GameCoord var1) {
      GameCoord var2 = method4308(var0);
      var2.method4333(var1);
      return var2;
   }

   public static final float method4326(GameCoord var0, GameCoord var1) {
      return var0.method4319(var1);
   }

   public static final GameCoord method4327(GameCoord var0, float var1) {
      GameCoord var2 = method4308(var0);
      var2.method4331(var1);
      return var2;
   }

   public final void method4328(Class342 var1) {
      Class342 var2 = Class342.method4219(this.floatX, this.floatY, this.floatZ, 0.0F);
      Class342 var3 = Class342.method4241(var1);
      Class342 var4 = Class342.method4217(var3, var2);
      var4.method4231(var1);
      this.setPos(var4.aFloat_6541, var4.aFloat_6542, var4.aFloat_6543);
      var2.method4243();
      var3.method4243();
      var4.method4243();
   }

   public final void method4329(Viewport var1) {
      float var2 = this.floatX;
      float var3 = this.floatY;
      this.floatX = var1.maxX * var2 + var1.aFloat_6834 * var3 + var1.aFloat_6837 * this.floatZ + var1.offsetX;
      this.floatY = var1.aFloat_6838 * var2 + var1.maxY * var3 + var1.aFloat_6842 * this.floatZ + var1.offsetY;
      this.floatZ = var1.aFloat_6836 * var2 + var1.aFloat_6840 * var3 + var1.maxZ * this.floatZ + var1.offsetZ;
   }

   public final void method4330(GameCoord var1, float var2) {
      this.method4331(1.0F - var2);
      this.method4314(method4327(var1, var2));
   }

   public GameCoord(GameCoord var1) {
      this.floatX = var1.floatX;
      this.floatY = var1.floatY;
      this.floatZ = var1.floatZ;
   }

   static {
      new GameCoord(0.0F, 0.0F, 0.0F);
      gameCoordMap = new GameCoord[0];
   }

   public final void method4331(float var1) {
      this.floatX *= var1;
      this.floatY *= var1;
      this.floatZ *= var1;
   }

   public final void method4332(float var1) {
      this.floatX /= var1;
      this.floatY /= var1;
      this.floatZ /= var1;
   }

   final void method4333(GameCoord var1) {
      this.floatX /= var1.floatX;
      this.floatY /= var1.floatY;
      this.floatZ /= var1.floatZ;
   }

   public String toString() {
      return this.floatX + ", " + this.floatY + ", " + this.floatZ;
   }

   public void method4335(ByteArrayDataNode var1) {
      this.floatX = var1.method4494(-822261228);
      this.floatY = var1.method4494(-822261228);
      this.floatZ = var1.method4494(-822261228);
   }

   public void setPos(GameCoord var1) {
      this.setPos(var1.floatX, var1.floatY, var1.floatZ);
   }

   public void setPos(float var1, float var2, float var3) {
      this.floatX = var1;
      this.floatY = var2;
      this.floatZ = var3;
   }

   public final void invert() {
      this.floatX = -this.floatX;
      this.floatY = -this.floatY;
      this.floatZ = -this.floatZ;
   }

   public static void method4339(int var0) {
      anInt_6575 = var0;
      gameCoordMap = new GameCoord[var0];
      anInt_6576 = 0;
   }

   public final float getHyp() {
      return (float)Math.sqrt((double)(this.floatX * this.floatX + this.floatY * this.floatY + this.floatZ * this.floatZ));
   }

   public GameCoord() {}

   public final void method4341(Viewport var1) {
      float var2 = this.floatX;
      float var3 = this.floatY;
      this.floatX = var1.maxX * var2 + var1.aFloat_6834 * var3 + var1.aFloat_6837 * this.floatZ;
      this.floatY = var1.aFloat_6838 * var2 + var1.maxY * var3 + var1.aFloat_6842 * this.floatZ;
      this.floatZ = var1.aFloat_6836 * var2 + var1.aFloat_6840 * var3 + var1.maxZ * this.floatZ;
   }

   public static final GameCoord distBetween(GameCoord var0, GameCoord var1) {
      GameCoord var2 = method4308(var0);
      var2.dist(var1);
      return var2;
   }
}
