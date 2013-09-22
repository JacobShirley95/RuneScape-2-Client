import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class426 implements Class325, Class425 {

   long aLong_8079;
   final Class328_Sub3_Sub1 aClass328_Sub3_Sub1_8080;
   final int anInt_8081;


   public int method2005() {
      return this.aClass328_Sub3_Sub1_8080.method4863();
   }

   public long method3991() {
      if(this.aLong_8079 == 0L) {
         this.aLong_8079 = IDirect3DTexture.GetSurfaceLevel(this.aClass328_Sub3_Sub1_8080.aLong_6352, this.anInt_8081);
      }

      return this.aLong_8079;
   }

   public void method824() {
      if(this.aLong_8079 != 0L) {
         IUnknown.Release(this.aLong_8079);
         this.aLong_8079 = 0L;
      }

      this.aClass328_Sub3_Sub1_8080.aRenderer_Sub3_Sub2_6354.method7127(this);
   }

   public void method3993() {
      if(this.aLong_8079 != 0L) {
         this.aClass328_Sub3_Sub1_8080.aRenderer_Sub3_Sub2_6354.method951(this.aLong_8079);
         this.aLong_8079 = 0L;
      }

   }

   public void finalize() {
      this.method3993();
   }

   Class426(Class328_Sub3_Sub1 var1, int var2) {
      this.anInt_8081 = var2;
      this.aClass328_Sub3_Sub1_8080 = var1;
      this.aClass328_Sub3_Sub1_8080.aRenderer_Sub3_Sub2_6354.method7181(this);
   }

   public int method2006() {
      return this.aClass328_Sub3_Sub1_8080.method4868();
   }

@Override
public void method5297() {
	// TODO Auto-generated method stub
	
}

@Override
public long method5298() {
	// TODO Auto-generated method stub
	return 0;
}
}
