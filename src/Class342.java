
public final class Class342 {

   public float aFloat_6538;
   static int anInt_6539;
   static int anInt_6540;
   public float aFloat_6541;
   public float aFloat_6542;
   public float aFloat_6543;
   static Class342[] aClass342Array_6544 = new Class342[0];


   static final Class342 method4217(Class342 var0, Class342 var1) {
      Class342 var2 = method4239(var0);
      var2.method4231(var1);
      return var2;
   }

   public static Class342 method4218() {
      Class342[] var0 = aClass342Array_6544;
      synchronized(aClass342Array_6544) {
         if(anInt_6540 == 0) {
            return new Class342();
         } else {
            aClass342Array_6544[--anInt_6540].method4236();
            return aClass342Array_6544[anInt_6540];
         }
      }
   }

   static Class342 method4219(float var0, float var1, float var2, float var3) {
      Class342[] var4 = aClass342Array_6544;
      synchronized(aClass342Array_6544) {
         if(anInt_6540 == 0) {
            return new Class342(var0, var1, var2, var3);
         } else {
            aClass342Array_6544[--anInt_6540].method4234(var0, var1, var2, var3);
            return aClass342Array_6544[anInt_6540];
         }
      }
   }

   final void method4220(Class342 var1) {
      this.aFloat_6541 += var1.aFloat_6541;
      this.aFloat_6542 += var1.aFloat_6542;
      this.aFloat_6543 += var1.aFloat_6543;
      this.aFloat_6538 += var1.aFloat_6538;
   }

   public Class342() {
      this.method4236();
   }

   public Class342(float var1, float var2, float var3, float var4) {
      this.method4234(var1, var2, var3, var4);
   }

   public Class342(Class342 var1) {
      this.method4226(var1);
   }

   public Class342(float var1, float var2, float var3) {
      this.method4223(var1, var2, var3);
   }

   public void method4221(ByteArrayDataNode var1) {
      this.aFloat_6541 = var1.method4494(-822261228);
      this.aFloat_6542 = var1.method4494(-822261228);
      this.aFloat_6543 = var1.method4494(-822261228);
      this.aFloat_6538 = var1.method4494(-822261228);
   }

   public final void method4222() {
      this.aFloat_6541 = -this.aFloat_6541;
      this.aFloat_6542 = -this.aFloat_6542;
      this.aFloat_6543 = -this.aFloat_6543;
   }

   public void method4223(float var1, float var2, float var3) {
      this.method4242(0.0F, 1.0F, 0.0F, var1);
      Class342 var4 = method4218();
      var4.method4242(1.0F, 0.0F, 0.0F, var2);
      this.method4231(var4);
      var4.method4242(0.0F, 0.0F, 1.0F, var3);
      this.method4231(var4);
      var4.method4243();
   }

   final void method4224() {
      this.aFloat_6541 = -this.aFloat_6541;
      this.aFloat_6542 = -this.aFloat_6542;
      this.aFloat_6543 = -this.aFloat_6543;
      this.aFloat_6538 = -this.aFloat_6538;
   }

   public void method4225(GameCoord var1, float var2) {
      this.method4242(var1.floatX, var1.floatY, var1.floatZ, var2);
   }

   public void method4226(Class342 var1) {
      this.aFloat_6541 = var1.aFloat_6541;
      this.aFloat_6542 = var1.aFloat_6542;
      this.aFloat_6543 = var1.aFloat_6543;
      this.aFloat_6538 = var1.aFloat_6538;
   }

   final void method4227() {
      float var1 = 1.0F / method4230(this);
      this.aFloat_6541 *= var1;
      this.aFloat_6542 *= var1;
      this.aFloat_6543 *= var1;
      this.aFloat_6538 *= var1;
   }

   final float method4228(Class342 var1) {
      return this.aFloat_6541 * var1.aFloat_6541 + this.aFloat_6542 * var1.aFloat_6542 + this.aFloat_6543 * var1.aFloat_6543 + this.aFloat_6538 * var1.aFloat_6538;
   }

   static final float method4229(Class342 var0, Class342 var1) {
      return var0.method4228(var1);
   }

   static final float method4230(Class342 var0) {
      return (float)Math.sqrt((double)method4229(var0, var0));
   }

   public final void method4231(Class342 var1) {
      this.method4234(var1.aFloat_6538 * this.aFloat_6541 + var1.aFloat_6541 * this.aFloat_6538 + var1.aFloat_6542 * this.aFloat_6543 - var1.aFloat_6543 * this.aFloat_6542, var1.aFloat_6538 * this.aFloat_6542 - var1.aFloat_6541 * this.aFloat_6543 + var1.aFloat_6542 * this.aFloat_6538 + var1.aFloat_6543 * this.aFloat_6541, var1.aFloat_6538 * this.aFloat_6543 + var1.aFloat_6541 * this.aFloat_6542 - var1.aFloat_6542 * this.aFloat_6541 + var1.aFloat_6543 * this.aFloat_6538, var1.aFloat_6538 * this.aFloat_6538 - var1.aFloat_6541 * this.aFloat_6541 - var1.aFloat_6542 * this.aFloat_6542 - var1.aFloat_6543 * this.aFloat_6543);
   }

   public String toString() {
      return this.aFloat_6541 + "," + this.aFloat_6542 + "," + this.aFloat_6543 + "," + this.aFloat_6538;
   }

   public final void method4233(Class342 var1, float var2) {
      if(this.method4228(var1) < 0.0F) {
         this.method4224();
      }

      this.scale(1.0F - var2);
      Class342 var3 = method4240(var1, var2);
      this.method4220(var3);
      var3.method4243();
      this.method4227();
   }

   void method4234(float var1, float var2, float var3, float var4) {
      this.aFloat_6541 = var1;
      this.aFloat_6542 = var2;
      this.aFloat_6543 = var3;
      this.aFloat_6538 = var4;
   }

   public GameCoord method4235() {
      if(this.aFloat_6538 > 1.0F) {
         this.aFloat_6538 = 1.0F;
      } else if(this.aFloat_6538 < -1.0F) {
         this.aFloat_6538 = -1.0F;
      }

      float var1 = (float)(Math.acos((double)this.aFloat_6538) * 2.0D);
      if(var1 == 0.0F) {
         return new GameCoord(0.0F, 0.0F, 0.0F);
      } else {
         GameCoord var2 = new GameCoord(this.aFloat_6541, this.aFloat_6542, this.aFloat_6543);
         if(this.aFloat_6541 != 0.0F || this.aFloat_6542 != 0.0F || this.aFloat_6543 != 0.0F) {
            var2.method4313();
            var2.method4331(var1);
         }

         return var2;
      }
   }

   final void method4236() {
      this.aFloat_6543 = 0.0F;
      this.aFloat_6542 = 0.0F;
      this.aFloat_6541 = 0.0F;
      this.aFloat_6538 = 1.0F;
   }

   public static void method4237(int var0) {
      anInt_6539 = var0;
      aClass342Array_6544 = new Class342[var0];
      anInt_6540 = 0;
   }

   final void scale(float var1) {
      this.aFloat_6541 *= var1;
      this.aFloat_6542 *= var1;
      this.aFloat_6543 *= var1;
      this.aFloat_6538 *= var1;
   }

   public static Class342 method4239(Class342 var0) {
      Class342[] var1 = aClass342Array_6544;
      synchronized(aClass342Array_6544) {
         if(anInt_6540 == 0) {
            return new Class342(var0);
         } else {
            aClass342Array_6544[--anInt_6540].method4226(var0);
            return aClass342Array_6544[anInt_6540];
         }
      }
   }

   static {
      new Class342();
   }

   static final Class342 method4240(Class342 var0, float var1) {
      Class342 var2 = method4239(var0);
      var2.scale(var1);
      return var2;
   }

   public static final Class342 method4241(Class342 var0) {
      Class342 var1 = method4239(var0);
      var1.method4222();
      return var1;
   }

   public void method4242(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(var4 * 0.5F));
      float var6 = (float)Math.cos((double)(var4 * 0.5F));
      this.aFloat_6541 = var1 * var5;
      this.aFloat_6542 = var2 * var5;
      this.aFloat_6543 = var3 * var5;
      this.aFloat_6538 = var6;
   }

   public void method4243() {
      Class342[] var1 = aClass342Array_6544;
      synchronized(aClass342Array_6544) {
         if(anInt_6540 < anInt_6539 - 1) {
            aClass342Array_6544[anInt_6540++] = this;
         }

      }
   }
}
