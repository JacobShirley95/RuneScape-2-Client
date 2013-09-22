import java.util.Iterator;

public class IteratorNodeList implements Iterator {

   Class240_Sub22 next;
   Class494 aClass494_9193;
   Class240_Sub22 currentNode = null;
   public static Class574 aClass574_9195;
   public static int anInt_9196;


   void method5920(int var1) {
      this.next = this.aClass494_9193.aClass240_Sub22_9036.aClass240_Sub22_7277;
      this.currentNode = null;
   }

   public Object next() {
      Class240_Sub22 var1 = this.next;
      if(var1 == this.aClass494_9193.aClass240_Sub22_9036) {
         var1 = null;
         this.next = null;
      } else {
         this.next = var1.aClass240_Sub22_7277;
      }

      this.currentNode = var1;
      return var1;
   }

   public void remove() {
      if(this.currentNode == null) {
         throw new IllegalStateException();
      } else {
         this.currentNode.shiftNext();
         this.currentNode = null;
      }
   }

   public IteratorNodeList(Class494 var1) {
      this.aClass494_9193 = var1;
      this.next = this.aClass494_9193.aClass240_Sub22_9036.aClass240_Sub22_7277;
      this.currentNode = null;
   }

   public Class240_Sub22 method5923(int var1) {
      this.method5920(1431347826);
      return (Class240_Sub22)this.next();
   }

   public boolean hasNext() {
      return this.aClass494_9193.aClass240_Sub22_9036 != this.next;
   }

   static void showMMHintMarker(RSInterface var0, Class126 var1, int offsetX, int offsetY, int var4, int var5, int markerIndex, long var7) {
      int hyp = var4 * var4 + var5 * var5;
      if((long)hyp <= var7) {
         int index;
         if(2 == 1735950531 * Class509.anInt_9182) {
            index = (int)((double)Class542.aClass43_Sub1_9475.method394(-1962301117) * 2607.5945876176133D) + client.anInt_378 * -517467801 & 16383;
         } else if(4 == Class509.anInt_9182 * 1735950531) {
            index = (int)client.aFloat_501 & 16383;
         } else {
            index = -517467801 * client.anInt_378 + (int)client.aFloat_501 & 16383;
         }

         int cos = Class362.cosArray[index];
         int sin = Class362.sinArray[index];
         if(Class509.anInt_9182 * 1735950531 != 4) {
            cos = cos * 256 / (256 + client.anInt_380 * 1121098075);
            sin = sin * 256 / (256 + client.anInt_380 * 1121098075);
         }

         int var13 = var4 * sin + cos * var5 >> 14;
         int var14 = var5 * sin - var4 * cos >> 14;
         Sprite var15 = Class1.hintMarkerSprites[markerIndex];
         int var16 = var15.getWidth();
         int var17 = var15.getHeight();
         int var18 = -533669195 * var0.width / 2 + var13 - var16 / 2;
         int var19 = var18 + var16;
         int var20 = -var14 + var0.height * 1833812087 / 2 - var17;
         int var21 = var17 + var20;
         boolean notOnScreen;
         if(var1 != null) {
            notOnScreen = !var1.method1626(var18, var20, (byte)125) || !var1.method1626(var19, var20, (byte)77) || !var1.method1626(var18, var21, (byte)96) || !var1.method1626(var19, var21, (byte)19);
         } else {
            notOnScreen = var18 < 0 || var20 < 0 || var19 > -533669195 * var0.width || var21 > var0.height * 1833812087;
         }

         if(notOnScreen) {
            double angle = Math.atan2((double)var13, (double)var14);
            int radius = Math.min(-533669195 * var0.width / 2, var0.height * 1833812087 / 2);
            radius -= 6;
            int compassX = (int)(Math.sin(angle) * (double)radius);
            int compassY = (int)(Math.cos(angle) * (double)radius);
            Class527.mapEdgeMarker[markerIndex].rotateDraw((float)(var0.width * -533669195) / 2.0F + (float)offsetX + (float)compassX, (float)(1833812087 * var0.height) / 2.0F + (float)offsetY - (float)compassY, 4096, (int)(65535.0D * (-angle / 6.283185307179586D)));
         } else if(var1 != null) {
            var15.method2142(offsetX + var18, var20 + offsetY, var1.aClass168_2369, offsetX, offsetY);
         } else {
            var15.drawAt(var18 + offsetX, offsetY + var20);
         }

      }
   }

   static void method5926(RSInterfaceData var0, int var1) {
      var0.intTypes[var0.intTypeIndex * -831324111 - 2] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 2], -759411453).method6180(Class240_Sub41_Sub3.aClass23_1024, var0.intTypes[-831324111 * var0.intTypeIndex - 1], 1477449257)?1:0;
      var0.intTypeIndex -= -708028207;
   }
}
