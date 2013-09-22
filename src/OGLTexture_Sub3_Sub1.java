public class OGLTexture_Sub3_Sub1 extends OGLTexture_Sub3 {

	final boolean aBoolean_1838;
	final int textureWidth;
	final float textureY;
	final float textureX;
	final boolean aBoolean_1842;
	final int textureHeight;

	OGLTexture_Sub3_Sub1(OpenGLRenderer var1, Class136 var2, Class87 var3,
			int var4, int var5, int var6, int var7) {
		super(var1, 3553, var2, var3, var6, var7);
		this.textureWidth = var4;
		this.textureHeight = var5;
		this.textureY = (float) var5 / (float) var7;
		this.textureX = (float) var4 / (float) var6;
		this.aBoolean_1842 = false;
		this.aBoolean_1838 = true;
		this.method5442(false, false);
	}

	static OGLTexture_Sub3_Sub1 method1212(OpenGLRenderer var0, Class136 var1,
			Class87 var2, int var3, int var4, boolean var5, byte[] var6,
			Class136 var7) {
		return !var0.aBoolean_10449
				&& (!Animator.method5897(var3, (byte) 83) || !Animator
						.method5897(var4, (byte) 14)) ? (var0.supportsTextureRect ? new OGLTexture_Sub3_Sub1(
				var0, '\u84f5', var1, var2, var3, var4, var5, var6, var7)
				: new OGLTexture_Sub3_Sub1(var0, var1, var2, var3, var4,
						Class105.method1359(var3, (byte) 127),
						Class105.method1359(var4, (byte) 126), var6, var7))
				: new OGLTexture_Sub3_Sub1(var0, 3553, var1, var2, var3, var4,
						var5, var6, var7);
	}

	static OGLTexture_Sub3_Sub1 getOpenGLTexture(OpenGLRenderer var0, int var1,
			int var2, int var3, int var4) {
		return !var0.aBoolean_10449
				&& (!Animator.method5897(var3, (byte) 102) || !Animator
						.method5897(var4, (byte) 75)) ? (var0.supportsTextureRect ? new OGLTexture_Sub3_Sub1(
				var0, '\u84f5', var1, var2, var3, var4, true)
				: new OGLTexture_Sub3_Sub1(var0, var1, var2, var3, var4,
						Class105.method1359(var3, (byte) 125),
						Class105.method1359(var4, (byte) 125), true))
				: new OGLTexture_Sub3_Sub1(var0, 3553, var1, var2, var3, var4,
						true);
	}

	OGLTexture_Sub3_Sub1(OpenGLRenderer var1, int var2, int var3, int var4,
			boolean var5, int[] var6, int var7, int var8) {
		super(var1, var2, var3, var4, var5, var6, var7, var8, true);
		this.textureWidth = var3;
		this.textureHeight = var4;
		if (this.texSubDubTexture == '\u84f5') {
			this.textureY = (float) var4;
			this.textureX = (float) var3;
			this.aBoolean_1842 = false;
		} else {
			this.textureY = 1.0F;
			this.textureX = 1.0F;
			this.aBoolean_1842 = true;
		}

		this.aBoolean_1838 = false;
	}

	OGLTexture_Sub3_Sub1(OpenGLRenderer var1, int var2, Class136 var3,
			Class87 var4, int var5, int var6, boolean var7, byte[] var8,
			Class136 var9) {
		super(var1, var2, var3, var4, var5, var6, var7, var8, var9, true);
		this.textureWidth = var5;
		this.textureHeight = var6;
		if (this.texSubDubTexture == '\u84f5') {
			this.textureY = (float) var6;
			this.textureX = (float) var5;
			this.aBoolean_1842 = false;
		} else {
			this.textureY = 1.0F;
			this.textureX = 1.0F;
			this.aBoolean_1842 = true;
		}

		this.aBoolean_1838 = false;
	}

	OGLTexture_Sub3_Sub1(OpenGLRenderer var1, int var2, Class136 var3,
			Class87 var4, int var5, int var6) {
		super(var1, var2, var3, var4, var5, var6);
		this.textureWidth = var5;
		this.textureHeight = var6;
		if (this.texSubDubTexture == '\u84f5') {
			this.textureY = (float) var6;
			this.textureX = (float) var5;
			this.aBoolean_1842 = false;
		} else {
			this.textureY = 1.0F;
			this.textureX = 1.0F;
			this.aBoolean_1842 = true;
		}

		this.aBoolean_1838 = false;
	}

	static OGLTexture_Sub3_Sub1 getOGLTexture(OpenGLRenderer var0, int var1,
			int var2, boolean var3, int[] var4, int var5, int var6) {
		return !var0.aBoolean_10449
				&& (!Animator.method5897(var1, (byte) 70) || !Animator
						.method5897(var2, (byte) 108)) ? (var0.supportsTextureRect ? new OGLTexture_Sub3_Sub1(
				var0, '\u84f5', var1, var2, var3, var4, var5, var6)
				: new OGLTexture_Sub3_Sub1(var0, var1, var2, Class105.method1359(
						var1, (byte) 124),
						Class105.method1359(var2, (byte) 126), var4))
				: new OGLTexture_Sub3_Sub1(var0, 3553, var1, var2, var3, var4,
						var5, var6);
	}

	OGLTexture_Sub3_Sub1(OpenGLRenderer var1, int var2, int var3, int var4,
			int var5, int[] var6) {
		super(var1, 3553, Class136.aClass136_2625, Class87.aClass87_1759, var4,
				var5);
		this.textureWidth = var2;
		this.textureHeight = var3;
		this.method5447(0, var5 - var3, var2, var3, var6, 0, 0, true);
		this.textureY = (float) var3 / (float) var5;
		this.textureX = (float) var2 / (float) var4;
		this.aBoolean_1842 = false;
		this.aBoolean_1838 = true;
		this.method5442(false, false);
	}

	OGLTexture_Sub3_Sub1(OpenGLRenderer var1, Class136 var2, Class87 var3,
			int var4, int var5, int var6, int var7, byte[] var8, Class136 var9) {
		super(var1, 3553, var2, var3, var6, var7);
		this.textureWidth = var4;
		this.textureHeight = var5;
		this.method5443(0, var7 - var5, var4, var5, var8, var9, 0, 0, true);
		this.textureY = (float) var5 / (float) var7;
		this.textureX = (float) var4 / (float) var6;
		this.aBoolean_1842 = false;
		this.aBoolean_1838 = true;
		this.method5442(false, false);
	}

	void method1852(boolean var1) {
		super.method1852(var1 && !this.aBoolean_1838);
	}

	OGLTexture_Sub3_Sub1(OpenGLRenderer var1, int var2, int var3, int var4,
			int var5, int var6, int var7, boolean var8) {
		super(var1, 3553, var2, var3, var6, var7);
		this.textureWidth = var4;
		this.textureHeight = var5;
		this.textureY = (float) var5 / (float) var7;
		this.textureX = (float) var4 / (float) var6;
		this.aBoolean_1842 = false;
		this.aBoolean_1838 = true;
		this.method5442(false, false);
	}

	OGLTexture_Sub3_Sub1(OpenGLRenderer var1, int var2, int var3, int var4,
			int var5, int var6, boolean var7) {
		super(var1, var2, var3, var4, var5, var6);
		this.textureWidth = var5;
		this.textureHeight = var6;
		if (this.texSubDubTexture == '\u84f5') {
			this.textureY = (float) var6;
			this.textureX = (float) var5;
			this.aBoolean_1842 = false;
		} else {
			this.textureY = 1.0F;
			this.textureX = 1.0F;
			this.aBoolean_1842 = true;
		}

		this.aBoolean_1838 = false;
	}

	static OGLTexture_Sub3_Sub1 method1216(OpenGLRenderer var0, Class136 var1,
			Class87 var2, int var3, int var4) {
		return !var0.aBoolean_10449
				&& (!Animator.method5897(var3, (byte) 55) || !Animator
						.method5897(var4, (byte) 127)) ? (var0.supportsTextureRect ? new OGLTexture_Sub3_Sub1(
				var0, '\u84f5', var1, var2, var3, var4)
				: new OGLTexture_Sub3_Sub1(var0, var1, var2, var3, var4,
						Class105.method1359(var3, (byte) 126),
						Class105.method1359(var4, (byte) 124)))
				: new OGLTexture_Sub3_Sub1(var0, 3553, var1, var2, var3, var4);
	}
}
