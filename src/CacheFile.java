import java.io.EOFException;
import java.io.IOException;

public class CacheFile {

   byte[] aByteArray_8967;
   RandomAccessFileNode rafNode;
   static final int anInt_8969 = 200000000;
   long aLong_8970 = -3755743877786459761L;
   byte[] cacheData;
   long aLong_8972;
   int anInt_8973;
   int anInt_8974 = 0;
   long index;
   long aLong_8976;
   long fileSize;
   long aLong_8978 = -4287413414651732987L;


   public void loadData(byte[] dest, int offset, int len) throws IOException {
      try {
         if(len + offset > dest.length) {
            throw new ArrayIndexOutOfBoundsException(len + offset - dest.length);
         }

         if(-1L != this.aLong_8978 * 5437340741132218163L && this.index * -8211419595859280009L >= 5437340741132218163L * this.aLong_8978 && this.index * -8211419595859280009L + (long)len <= this.aLong_8978 * 5437340741132218163L + (long)(this.anInt_8974 * 141450277)) {
            System.arraycopy(this.aByteArray_8967, (int)(-8211419595859280009L * this.index - this.aLong_8978 * 5437340741132218163L), dest, offset, len);
            this.index += (long)len * 5369038616124869191L;
            return;
         }

         long var5 = -8211419595859280009L * this.index;
         int var8 = len;
         int var9;
         if(this.index * -8211419595859280009L >= this.aLong_8970 * 5463783259551343249L && -8211419595859280009L * this.index < (long)(this.anInt_8973 * -585092051) + 5463783259551343249L * this.aLong_8970) {
            var9 = (int)((long)(-585092051 * this.anInt_8973) - (-8211419595859280009L * this.index - this.aLong_8970 * 5463783259551343249L));
            if(var9 > len) {
               var9 = len;
            }

            System.arraycopy(this.cacheData, (int)(-8211419595859280009L * this.index - this.aLong_8970 * 5463783259551343249L), dest, offset, var9);
            this.index += (long)var9 * 5369038616124869191L;
            offset += var9;
            len -= var9;
         }

         if(len > this.cacheData.length) {
            this.rafNode.seek(-8211419595859280009L * this.index);

            for(this.aLong_8972 = this.index * -6413169717991313685L; len > 0; len -= var9) {
               var9 = this.rafNode.read(dest, offset, len);
               if(-1 == var9) {
                  break;
               }

               this.aLong_8972 += -88955981175508691L * (long)var9;
               this.index += 5369038616124869191L * (long)var9;
               offset += var9;
            }
         } else if(len > 0) {
            this.method5735(-1701937454);
            var9 = len;
            if(len > -585092051 * this.anInt_8973) {
               var9 = this.anInt_8973 * -585092051;
            }

            System.arraycopy(this.cacheData, 0, dest, offset, var9);
            offset += var9;
            len -= var9;
            this.index += (long)var9 * 5369038616124869191L;
         }

         if(5437340741132218163L * this.aLong_8978 != -1L) {
            if(this.aLong_8978 * 5437340741132218163L > this.index * -8211419595859280009L && len > 0) {
               var9 = offset + (int)(this.aLong_8978 * 5437340741132218163L - this.index * -8211419595859280009L);
               if(var9 > offset + len) {
                  var9 = len + offset;
               }

               while(offset < var9) {
                  dest[offset++] = 0;
                  --len;
                  this.index += 5369038616124869191L;
               }
            }

            long var10 = -1L;
            long var12 = -1L;
            if(this.aLong_8978 * 5437340741132218163L >= var5 && this.aLong_8978 * 5437340741132218163L < (long)var8 + var5) {
               var10 = this.aLong_8978 * 5437340741132218163L;
            } else if(var5 >= this.aLong_8978 * 5437340741132218163L && var5 < this.aLong_8978 * 5437340741132218163L + (long)(this.anInt_8974 * 141450277)) {
               var10 = var5;
            }

            if(this.aLong_8978 * 5437340741132218163L + (long)(141450277 * this.anInt_8974) > var5 && (long)(141450277 * this.anInt_8974) + this.aLong_8978 * 5437340741132218163L <= (long)var8 + var5) {
               var12 = 5437340741132218163L * this.aLong_8978 + (long)(this.anInt_8974 * 141450277);
            } else if(var5 + (long)var8 > 5437340741132218163L * this.aLong_8978 && var5 + (long)var8 <= 5437340741132218163L * this.aLong_8978 + (long)(141450277 * this.anInt_8974)) {
               var12 = var5 + (long)var8;
            }

            if(var10 > -1L && var12 > var10) {
               int var14 = (int)(var12 - var10);
               System.arraycopy(this.aByteArray_8967, (int)(var10 - 5437340741132218163L * this.aLong_8978), dest, (int)(var10 - var5) + offset, var14);
               if(var12 > -8211419595859280009L * this.index) {
                  len = (int)((long)len - (var12 - this.index * -8211419595859280009L));
                  this.index = 5369038616124869191L * var12;
               }
            }
         }
      } catch (IOException var16) {
         this.aLong_8972 = 88955981175508691L;
         throw var16;
      }

      if(len > 0) {
         throw new EOFException();
      }
   }

   public void dumpAndClose(int var1) throws IOException {
      this.dump(220372353);
      this.rafNode.closeRAFile((byte)90);
   }

   public void seek(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException();
      } else {
         this.index = 5369038616124869191L * var1;
      }
   }

   public long getFileSize(int var1) {
      return 7422150465236397601L * this.fileSize;
   }

   public void fillArray(byte[] var1, int var2) throws IOException {
      this.loadData(var1, 0, var1.length);
   }

   public CacheFile(RandomAccessFileNode var1, int var2, int var3) throws IOException {
      this.rafNode = var1;
      this.fileSize = (this.aLong_8976 = var1.getFileLength(951623088) * -8666788355337045407L) * 6407462562478721921L;
      this.cacheData = new byte[var2];
      this.aByteArray_8967 = new byte[var3];
      this.index = 0L;
   }

   public void storeData(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if((long)var3 + this.index * -8211419595859280009L > this.fileSize * 7422150465236397601L) {
            this.fileSize = (this.index * -8211419595859280009L + (long)var3) * -7484538194124565023L;
         }

         if(5437340741132218163L * this.aLong_8978 != -1L && (this.index * -8211419595859280009L < this.aLong_8978 * 5437340741132218163L || -8211419595859280009L * this.index > (long)(this.anInt_8974 * 141450277) + this.aLong_8978 * 5437340741132218163L)) {
            this.dump(-589206983);
         }

         if(-1L != 5437340741132218163L * this.aLong_8978 && (long)var3 + this.index * -8211419595859280009L > (long)this.aByteArray_8967.length + this.aLong_8978 * 5437340741132218163L) {
            int var5 = (int)((long)this.aByteArray_8967.length - (this.index * -8211419595859280009L - 5437340741132218163L * this.aLong_8978));
            System.arraycopy(var1, var2, this.aByteArray_8967, (int)(this.index * -8211419595859280009L - this.aLong_8978 * 5437340741132218163L), var5);
            this.index += (long)var5 * 5369038616124869191L;
            var2 += var5;
            var3 -= var5;
            this.anInt_8974 = this.aByteArray_8967.length * -768450643;
            this.dump(-695677819);
         }

         if(var3 <= this.aByteArray_8967.length) {
            if(var3 > 0) {
               if(this.aLong_8978 * 5437340741132218163L == -1L) {
                  this.aLong_8978 = -9112686399378686291L * this.index;
               }

               System.arraycopy(var1, var2, this.aByteArray_8967, (int)(-8211419595859280009L * this.index - 5437340741132218163L * this.aLong_8978), var3);
               this.index += 5369038616124869191L * (long)var3;
               if(this.index * -8211419595859280009L - this.aLong_8978 * 5437340741132218163L > (long)(141450277 * this.anInt_8974)) {
                  this.anInt_8974 = -768450643 * (int)(this.index * -8211419595859280009L - this.aLong_8978 * 5437340741132218163L);
               }

            }
         } else {
            if(this.aLong_8972 * -2878659861275785563L != -8211419595859280009L * this.index) {
               this.rafNode.seek(this.index * -8211419595859280009L);
               this.aLong_8972 = -6413169717991313685L * this.index;
            }

            this.rafNode.writeData(var1, var2, var3, (byte)4);
            this.aLong_8972 += -88955981175508691L * (long)var3;
            if(-2878659861275785563L * this.aLong_8972 > 580943257972074913L * this.aLong_8976) {
               this.aLong_8976 = this.aLong_8972 * -4534491334991567227L;
            }

            long var6 = -1L;
            long var8 = -1L;
            if(-8211419595859280009L * this.index >= 5463783259551343249L * this.aLong_8970 && -8211419595859280009L * this.index < (long)(-585092051 * this.anInt_8973) + this.aLong_8970 * 5463783259551343249L) {
               var6 = -8211419595859280009L * this.index;
            } else if(5463783259551343249L * this.aLong_8970 >= -8211419595859280009L * this.index && this.aLong_8970 * 5463783259551343249L < (long)var3 + this.index * -8211419595859280009L) {
               var6 = this.aLong_8970 * 5463783259551343249L;
            }

            if(-8211419595859280009L * this.index + (long)var3 > this.aLong_8970 * 5463783259551343249L && this.index * -8211419595859280009L + (long)var3 <= this.aLong_8970 * 5463783259551343249L + (long)(this.anInt_8973 * -585092051)) {
               var8 = -8211419595859280009L * this.index + (long)var3;
            } else if((long)(-585092051 * this.anInt_8973) + this.aLong_8970 * 5463783259551343249L > this.index * -8211419595859280009L && this.aLong_8970 * 5463783259551343249L + (long)(this.anInt_8973 * -585092051) <= (long)var3 + this.index * -8211419595859280009L) {
               var8 = 5463783259551343249L * this.aLong_8970 + (long)(this.anInt_8973 * -585092051);
            }

            if(var6 > -1L && var8 > var6) {
               int var10 = (int)(var8 - var6);
               System.arraycopy(var1, (int)(var6 + (long)var2 - this.index * -8211419595859280009L), this.cacheData, (int)(var6 - this.aLong_8970 * 5463783259551343249L), var10);
            }

            this.index += (long)var3 * 5369038616124869191L;
         }
      } catch (IOException var11) {
         this.aLong_8972 = 88955981175508691L;
         throw var11;
      }
   }

   void dump(int var1) throws IOException {
      if(5437340741132218163L * this.aLong_8978 != -1L) {
         if(this.aLong_8978 * 5437340741132218163L != this.aLong_8972 * -2878659861275785563L) {
            this.rafNode.seek(this.aLong_8978 * 5437340741132218163L);
            this.aLong_8972 = -940622983883862281L * this.aLong_8978;
         }

         this.rafNode.writeData(this.aByteArray_8967, 0, this.anInt_8974 * 141450277, (byte)4);
         this.aLong_8972 += (long)this.anInt_8974 * 7995988121971345281L;
         if(this.aLong_8972 * -2878659861275785563L > this.aLong_8976 * 580943257972074913L) {
            this.aLong_8976 = -4534491334991567227L * this.aLong_8972;
         }

         long var2 = -1L;
         long var4 = -1L;
         if(this.aLong_8978 * 5437340741132218163L >= 5463783259551343249L * this.aLong_8970 && this.aLong_8978 * 5437340741132218163L < 5463783259551343249L * this.aLong_8970 + (long)(-585092051 * this.anInt_8973)) {
            var2 = 5437340741132218163L * this.aLong_8978;
         } else if(5463783259551343249L * this.aLong_8970 >= 5437340741132218163L * this.aLong_8978 && 5463783259551343249L * this.aLong_8970 < (long)(this.anInt_8974 * 141450277) + 5437340741132218163L * this.aLong_8978) {
            var2 = 5463783259551343249L * this.aLong_8970;
         }

         if(this.aLong_8978 * 5437340741132218163L + (long)(141450277 * this.anInt_8974) > 5463783259551343249L * this.aLong_8970 && 5437340741132218163L * this.aLong_8978 + (long)(141450277 * this.anInt_8974) <= (long)(-585092051 * this.anInt_8973) + this.aLong_8970 * 5463783259551343249L) {
            var4 = (long)(this.anInt_8974 * 141450277) + this.aLong_8978 * 5437340741132218163L;
         } else if((long)(this.anInt_8973 * -585092051) + 5463783259551343249L * this.aLong_8970 > 5437340741132218163L * this.aLong_8978 && this.aLong_8970 * 5463783259551343249L + (long)(-585092051 * this.anInt_8973) <= this.aLong_8978 * 5437340741132218163L + (long)(this.anInt_8974 * 141450277)) {
            var4 = this.aLong_8970 * 5463783259551343249L + (long)(-585092051 * this.anInt_8973);
         }

         if(var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.aByteArray_8967, (int)(var2 - 5437340741132218163L * this.aLong_8978), this.cacheData, (int)(var2 - this.aLong_8970 * 5463783259551343249L), var6);
         }

         this.aLong_8978 = -4287413414651732987L;
         this.anInt_8974 = 0;
      }

   }

   void method5735(int var1) throws IOException {
      this.anInt_8973 = 0;
      if(this.aLong_8972 * -2878659861275785563L != this.index * -8211419595859280009L) {
         this.rafNode.seek(-8211419595859280009L * this.index);
         this.aLong_8972 = -6413169717991313685L * this.index;
      }

      int var3;
      for(this.aLong_8970 = this.index * -6963203218209589881L; -585092051 * this.anInt_8973 < this.cacheData.length; this.anInt_8973 += var3 * 303578021) {
         int var2 = this.cacheData.length - -585092051 * this.anInt_8973;
         if(var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.rafNode.read(this.cacheData, -585092051 * this.anInt_8973, var2);
         if(var3 == -1) {
            break;
         }

         this.aLong_8972 += (long)var3 * -88955981175508691L;
      }

   }

   static final void method5736(RSInterfaceData var0, byte var1) {
      Class416 var2 = (Class416)var0.composite.anObjectArray_3548[var0.anInt_9510 * -1756266293];
      Class169 var3 = (Class169)(var0.anIntArray_9518[var0.anInt_9510 * -1756266293] == 0?var0.aMap_9513.get(var2.aClass187_7903.aClass283_3201):var0.targetMap.get(var2.aClass187_7903.aClass283_3201));
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.method2268(var2, 409257201);
   }

   static final void method5737(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class394.method4928(var3, var0, 434500480);
   }
}
