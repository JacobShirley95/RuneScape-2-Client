import jagdx.IUnknown;

public abstract class Class328 implements Class72 {

   final Class87 aClass87_6350;
   final Class136 aClass136_6351;
   long aLong_6352 = 0L;
   boolean aBoolean_6353;
   final Renderer_Sub3_Sub2 aRenderer_Sub3_Sub2_6354;


   public void finalize() {
      this.method4041();
   }

   public void method4038(Class389 var1) {}

   public void method824() {
      if(this.aLong_6352 != 0L) {
         IUnknown.Release(this.aLong_6352);
         this.aLong_6352 = 0L;
      }

      this.aRenderer_Sub3_Sub2_6354.method7127(this);
   }

   long method4040() {
      return this.aLong_6352;
   }

   void method4041() {
      if(this.aLong_6352 != 0L) {
         this.aRenderer_Sub3_Sub2_6354.method951(this.aLong_6352);
         this.aLong_6352 = 0L;
      }

   }

   Class328(Renderer_Sub3_Sub2 var1, Class136 var2, Class87 var3, boolean var4, int var5) {
      this.aRenderer_Sub3_Sub2_6354 = var1;
      this.aClass136_6351 = var2;
      this.aClass87_6350 = var3;
      this.aBoolean_6353 = var4;
      this.aRenderer_Sub3_Sub2_6354.method7181(this);
   }
}
