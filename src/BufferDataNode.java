import jaclib.memory.Stream;

public class BufferDataNode extends ByteArrayDataNode {

   void putFloatBE(float var1) {
      int var2 = Stream.floatToRawIntBits(var1);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var2 >> 24);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var2 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var2 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var2;
   }

   BufferDataNode(int var1) {
      super(var1);
   }

   void putFloatLE(float var1) {
      int var2 = Stream.floatToRawIntBits(var1);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var2;
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var2 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var2 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var2 >> 24);
   }
}
