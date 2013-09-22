
public final class Class133_Sub1 extends Class133 {

   boolean aBoolean_4376;
   Class125_Sub2 aClass125_Sub2_4377;
   final Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_4378;


   Class125 method1729(Renderer_Sub3 var1, Class89 var2) {
      return new Class125_Sub2((Renderer_Sub3_Sub2)var1, this, var2);
   }

   public boolean method1734(Class125 var1) {
      if(this.aClass125_Sub2_4377 == var1) {
         return true;
      } else if(!var1.method1588()) {
         return false;
      } else {
         this.aClass125_Sub2_4377 = (Class125_Sub2)var1;
         this.anInt_2600 = this.method1732(var1, (byte)50) * 299379563;
         if(this.anInt_2600 * -1962301117 == -1) {
            throw new IllegalArgumentException();
         } else {
            if(this.aBoolean_4376) {
               this.aRenderer_Sub3_Sub2_4378.method908(this.aClass125_Sub2_4377.aLong_4538);
               this.aRenderer_Sub3_Sub2_4378.method909(this.aClass125_Sub2_4377.aLong_4542);
               this.aRenderer_Sub3_Sub2_4378.aClass125_Sub2_1441 = this.aClass125_Sub2_4377;
            }

            return true;
         }
      }
   }

   Class240_Sub50_Sub1 method1737(Class120 var1) {
      return new Class240_Sub50_Sub1_Sub1(this, var1);
   }

   public void method1764() {
      this.aRenderer_Sub3_Sub2_4378.method908(0L);
      this.aRenderer_Sub3_Sub2_4378.method909(0L);
      this.aBoolean_4376 = false;
      this.aRenderer_Sub3_Sub2_4378.aClass125_Sub2_1441 = null;
      this.aRenderer_Sub3_Sub2_4378.method7313(1);
      this.aRenderer_Sub3_Sub2_4378.method7224((Class403)null);
      this.aRenderer_Sub3_Sub2_4378.method7313(0);
      this.aRenderer_Sub3_Sub2_4378.method7224((Class403)null);
   }

   public void method1726() {
      if(this.aClass125_Sub2_4377 == null) {
         throw new RuntimeException_Sub2();
      } else {
         this.aRenderer_Sub3_Sub2_4378.method908(this.aClass125_Sub2_4377.aLong_4538);
         this.aRenderer_Sub3_Sub2_4378.method909(this.aClass125_Sub2_4377.aLong_4542);
         this.aRenderer_Sub3_Sub2_4378.aClass125_Sub2_1441 = this.aClass125_Sub2_4377;
         this.aBoolean_4376 = true;
      }
   }

   public boolean method1728() {
      return this.aRenderer_Sub3_Sub2_4378.aClass125_Sub2_1441 == this.aClass125_Sub2_4377;
   }

   Class133_Sub1(Renderer_Sub3_Sub2 var1, Class113 var2) {
      super(var1, var2);
      this.aRenderer_Sub3_Sub2_4378 = var1;
      this.aBoolean_4376 = false;
   }
}
