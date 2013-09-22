import jaggl.OpenGL;

public class Class133_Sub2 extends Class133 {

   int anInt_4410;
   Class125_Sub1 aClass125_Sub1_4411;
   final OpenGLRenderer_Sub1 aRenderer_Sub3_Sub1_4412;


   Class125 method1729(Renderer_Sub3 var1, Class89 var2) {
      return new Class125_Sub1((OpenGLRenderer_Sub1)var1, this, var2);
   }

   public boolean method1728() {
      return this.aRenderer_Sub3_Sub1_4412.aClass125_Sub1_1353 == this.aClass125_Sub1_4411;
   }

   Class240_Sub50_Sub1 method1737(Class120 var1) {
      return new Class240_Sub50_Sub1_Sub2(this, var1);
   }

   public void method1726() {
      if(this.aRenderer_Sub3_Sub1_4412.aClass125_Sub1_1353 != this.aClass125_Sub1_4411) {
         if(this.aClass125_Sub1_4411 == null) {
            throw new RuntimeException_Sub2();
         } else {
            OpenGL.glUseProgram(this.anInt_4410);
            this.aRenderer_Sub3_Sub1_4412.aClass125_Sub1_1353 = this.aClass125_Sub1_4411;
         }
      }
   }

   public boolean method1734(Class125 var1) {
      if(this.aClass125_Sub1_4411 == var1) {
         return true;
      } else if(!var1.method1588()) {
         return false;
      } else {
         boolean var2 = this.method1728();
         this.aClass125_Sub1_4411 = (Class125_Sub1)var1;
         this.anInt_2600 = this.method1732(var1, (byte)51) * 299379563;
         if(this.anInt_2600 * -1962301117 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.anInt_4410 = this.aClass125_Sub1_4411.glProgramID;
            if(var2) {
               OpenGL.glUseProgram(this.anInt_4410);
               this.aRenderer_Sub3_Sub1_4412.aClass125_Sub1_1353 = this.aClass125_Sub1_4411;
            }

            return true;
         }
      }
   }

   public void finalize() throws Throwable {
      this.method1762();
      super.finalize();
   }

   void method1762() {
      for(int var1 = 0; var1 < this.method1730(-1956843955); ++var1) {
         ((Class125_Sub1)this.method1731(var1, 726234190)).method824();
      }

      super.method1762();
   }

   public void method1764() {}

   Class133_Sub2(OpenGLRenderer_Sub1 var1, Class113 var2) {
      super(var1, var2);
      this.aRenderer_Sub3_Sub1_4412 = var1;
   }
}
