import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class240_Sub38 extends NodeListNode {

   Stream heapBufferStream;
   NativeHeapBuffer nOGLBuffer;
   final int anInt_7522;
   final Class171_Sub1 aClass171_Sub1_7523;
   final float aFloat_7524;
   OGLBufferPointer colourPointer;
   Class157_Sub1 aClass157_Sub1_7526;
   final OpenGLRenderer aRenderer_Sub2_7527;
   int[] anIntArray_7528;
   final Class105 aClass105_7529;


   void method4906(int var1) {
      this.nOGLBuffer = this.aRenderer_Sub2_7527.aNativeHeap_10333.createNativeHeapBuffer(var1 * 4, true);
      this.heapBufferStream = new Stream(this.nOGLBuffer);
   }

   void method4907(int var1, int var2, int var3) {
      this.anIntArray_7528[var2 * this.aClass171_Sub1_7523.maxWidth * 1658489349 + var1] |= 1 << var3;
   }

   void method4908(int var1) {
      this.heapBufferStream.method2384(var1 * 4 + 3);
      this.heapBufferStream.putByte(-1);
   }

   void method4909(int var1) {
      this.heapBufferStream.flush();
      OGLBuffer var2 = this.aRenderer_Sub2_7527.createOGLBuffer(4, this.nOGLBuffer, var1 * 4, false);
      if(var2 instanceof OGLVBuffer) {
         this.nOGLBuffer.delete();
      }

      this.colourPointer = new OGLBufferPointer(var2, 5121, 4, 0);
      this.nOGLBuffer = null;
      this.heapBufferStream = null;
   }

   void method4910(int[] var1, int var2) {
      int var3 = 0;
      BufferDataNode var4 = this.aRenderer_Sub2_7527.aClass240_Sub8_Sub2_10359;
      var4.index = 0;
      int var5;
      int var6;
      short[] var7;
      int var8;
      int var9;
      int var10;
      if(this.aRenderer_Sub2_7527.isBigEndian) {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.aClass171_Sub1_7523.aShortArrayArray_10852[var6];
            var8 = this.anIntArray_7528[var6];
            if(var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if((var8 & 1 << var9++) != 0) {
                     var4.method4463(var7[var10++] & '\uffff', 1906377509);
                     ++var3;
                     var4.method4463(var7[var10++] & '\uffff', -1547854359);
                     ++var3;
                     var4.method4463(var7[var10++] & '\uffff', -434292323);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      } else {
         for(var5 = 0; var5 < var2; ++var5) {
            var6 = var1[var5];
            var7 = this.aClass171_Sub1_7523.aShortArrayArray_10852[var6];
            var8 = this.anIntArray_7528[var6];
            if(var8 != 0 && var7 != null) {
               var9 = 0;
               var10 = 0;

               while(var10 < var7.length) {
                  if((var8 & 1 << var9++) != 0) {
                     var4.method4464(var7[var10++] & '\uffff', (byte)1);
                     ++var3;
                     var4.method4464(var7[var10++] & '\uffff', (byte)1);
                     ++var3;
                     var4.method4464(var7[var10++] & '\uffff', (byte)1);
                     ++var3;
                  } else {
                     var10 += 3;
                  }
               }
            }
         }
      }

      if(var3 > 0) {
         this.aClass157_Sub1_7526.method2072(5123, var4.data, var4.index * 964952859);
         this.aRenderer_Sub2_7527.setPointers(this.aClass171_Sub1_7523.vertexPointer, this.aClass171_Sub1_7523.normalPointer, this.colourPointer, this.aClass171_Sub1_7523.anOGLBufferPointer_10877);
         this.aRenderer_Sub2_7527.method7068(this.anInt_7522, (this.aClass171_Sub1_7523.anInt_10882 & 7) != 0, (this.aClass171_Sub1_7523.anInt_10882 & 8) != 0);
         if(this.aRenderer_Sub2_7527.aBoolean_10413) {
            this.aRenderer_Sub2_7527.method1958(Integer.MAX_VALUE, this.aClass105_7529);
         }

         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(1.0F / this.aFloat_7524, 1.0F / this.aFloat_7524, 1.0F);
         OpenGL.glMatrixMode(5888);
         this.aRenderer_Sub2_7527.setPointers(this.aClass171_Sub1_7523.vertexPointer, this.aClass171_Sub1_7523.normalPointer, this.colourPointer, this.aClass171_Sub1_7523.anOGLBufferPointer_10877);
         this.aRenderer_Sub2_7527.method7009(this.aClass157_Sub1_7526, 4, 0, var3);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
      }

   }

   Class240_Sub38(Class171_Sub1 var1, int var2, int var3, Class105 var4) {
      this.aClass171_Sub1_7523 = var1;
      this.aRenderer_Sub2_7527 = this.aClass171_Sub1_7523.aRenderer_Sub2_10854;
      this.anInt_7522 = var2;
      this.aFloat_7524 = (float)var3;
      this.aClass105_7529 = var4;
      this.anIntArray_7528 = new int[this.aClass171_Sub1_7523.maxWidth * 1658489349 * this.aClass171_Sub1_7523.maxHeight * 445373459];
      this.aClass157_Sub1_7526 = new Class157_Sub1(this.aRenderer_Sub2_7527, 5123, (byte[])null, 1);
   }

   void method4911(int var1, int var2, int var3, float var4) {
      int var6;
      int var7;
      if(this.anInt_7522 != -1) {
         Class183 var5 = this.aRenderer_Sub2_7527.aClass163_2802.method1996(this.anInt_7522, (byte)2);
         var6 = var5.aByte_3165 & 255;
         int var9;
         if(var6 != 0 && var5.aByte_3169 != 4) {
            if(var3 < 0) {
               var7 = 0;
            } else if(var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

            if(var6 == 256) {
               var2 = var7;
            } else {
               var9 = 256 - var6;
               var2 = ((var7 & 16711935) * var6 + (var2 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var2 & '\uff00') * var9 & 16711680) >> 8;
            }
         }

         var7 = var5.aByte_3176 & 255;
         if(var7 != 0) {
            var7 += 256;
            int var8 = ((var2 & 16711680) >> 16) * var7;
            if(var8 > '\uffff') {
               var8 = '\uffff';
            }

            var9 = ((var2 & '\uff00') >> 8) * var7;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            int var10 = (var2 & 255) * var7;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var2 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
         }
      }

      if(var4 != 1.0F) {
         int var11 = var2 >> 16 & 255;
         var6 = var2 >> 8 & 255;
         var7 = var2 & 255;
         var11 = (int)((float)var11 * var4);
         if(var11 < 0) {
            var11 = 0;
         } else if(var11 > 255) {
            var11 = 255;
         }

         var6 = (int)((float)var6 * var4);
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         var7 = (int)((float)var7 * var4);
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         var2 = var11 << 16 | var6 << 8 | var7;
      }

      this.heapBufferStream.method2384(var1 * 4);
      this.heapBufferStream.putByte((byte)(var2 >> 16));
      this.heapBufferStream.putByte((byte)(var2 >> 8));
      this.heapBufferStream.putByte((byte)var2);
   }
}
