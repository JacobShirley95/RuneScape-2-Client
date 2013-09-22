
public class OGLBufferPointer {

   byte offset;
   byte size;
   short type;
   OGLBuffer buffer;


   OGLBufferPointer(OGLBuffer var1, int var2, int var3, int var4) {
      this.buffer = var1;
      this.type = (short)var2;
      this.size = (byte)var3;
      this.offset = (byte)var4;
   }
}
