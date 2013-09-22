import java.awt.Point;

public class RSFont {

	byte[] charSizeData;
	public int anInt_8571;
	public int fontHeight;
	public int anInt_8573;
	byte[][] aByteArrayArray_8574;
	static String[] aStringArray_8575 = new String[100];

	public int method5555(String var1, int var2, TextObjects[] var3, byte var4) {
		return this.method5563(var1, new int[] { var2 }, aStringArray_8575,
				var3, (byte) 1);
	}

	public int getCharWidth(int var1, byte var2) {
		return this.charSizeData[var1] & 255;
	}

	public int getStringWidth(String var1, TextObjects[] sprites, int var3) {
		if (null == var1) {
			return 0;
		} else {
			int ltSign = -1;
			int var5 = -1;
			int x = 0;
			int len = var1.length();

			for (int i = 0; i < len; ++i) {
				char ch = var1.charAt(i);
				if (ch == 60) {
					ltSign = i;
				} else {
					if (ch == 62 && ltSign != -1) {
						String var10 = var1.substring(ltSign + 1, i);
						ltSign = -1;
						if (var10.equals("lt")) {
							ch = 60;
						} else if (var10.equals("gt")) {
							ch = 62;
						} else if (var10.equals("nbsp")) {
							ch = 160;
						} else if (var10.equals("shy")) {
							ch = 173;
						} else if (var10.equals("times")) {
							ch = 215;
						} else if (var10.equals("euro")) {
							ch = 8364;
						} else if (var10.equals("copy")) {
							ch = 169;
						} else {
							if (!var10.equals("reg")) {
								if (var10.startsWith("img=") && sprites != null) {
									try {
										int var11 = LoadProgress.method4427(
												var10.substring(4), 20563767);
										x += sprites[var11].getFurthestX();
										var5 = -1;
									} catch (Exception var12) {
										;
									}
								}
								continue;
							}

							ch = 174;
						}
					}

					if (-1 == ltSign) {
						x += this.charSizeData[Class120.method1515(ch,
								-330265375) & 255] & 255;
						if (null != this.aByteArrayArray_8574 && -1 != var5) {
							x += this.aByteArrayArray_8574[var5][ch];
						}

						var5 = ch;
					}
				}
			}

			return x;
		}
	}

	public String method5558(String var1, int var2, TextObjects[] var3, int var4) {
		if (this.getStringWidth(var1, var3, -1914317811) <= var2) {
			return var1;
		} else {
			var2 -= this.getStringWidth("...", null, -535918112);
			int var5 = -1;
			int var6 = -1;
			int var7 = 0;
			int len = var1.length();
			String var9 = "";

			for (int var10 = 0; var10 < len; ++var10) {
				char var11 = var1.charAt(var10);
				if (60 == var11) {
					var5 = var10;
				} else {
					if (var11 == 62 && -1 != var5) {
						String var12 = var1.substring(1 + var5, var10);
						var5 = -1;
						if (var12.equals("lt")) {
							var11 = 60;
						} else if (var12.equals("gt")) {
							var11 = 62;
						} else if (var12.equals("nbsp")) {
							var11 = 160;
						} else if (var12.equals("shy")) {
							var11 = 173;
						} else if (var12.equals("times")) {
							var11 = 215;
						} else if (var12.equals("euro")) {
							var11 = 8364;
						} else if (var12.equals("copy")) {
							var11 = 169;
						} else {
							if (!var12.equals("reg")) {
								if (var12.startsWith("img=") && var3 != null) {
									try {
										int var13 = LoadProgress
												.method4427(var12.substring(4),
														-1950148933);
										var7 += var3[var13].getFurthestX();
										var6 = -1;
										if (var7 > var2) {
											return var9 + "...";
										}

										var9 = var1.substring(0, var10 + 1);
									} catch (Exception var14) {
										;
									}
								}
								continue;
							}

							var11 = 174;
						}
					}

					if (-1 == var5) {
						var7 += this.charSizeData[Class120.method1515(var11,
								699433897) & 255] & 255;
						if (this.aByteArrayArray_8574 != null && var6 != -1) {
							var7 += this.aByteArrayArray_8574[var6][var11];
						}

						var6 = var11;
						int var15 = var7;
						if (null != this.aByteArrayArray_8574) {
							var15 = var7 + this.aByteArrayArray_8574[var11][46];
						}

						if (var15 > var2) {
							return var9 + "...";
						}

						var9 = var1.substring(0, var10 + 1);
					}
				}
			}

			return var1;
		}
	}

	int getFormattedStringWidth(String var1, int[] var2, String[] var3,
			TextObjects[] sprites, boolean var5, int var6) {
		if (var1 == null) {
			return 0;
		} else {
			int var7 = 0;
			int var8 = 0;
			int var9 = -1;
			int var10 = 0;
			int var11 = 0;
			int var12 = -1;
			int var13 = -1;
			int var14 = 0;
			int var15 = var1.length();

			for (int var16 = 0; var16 < var15; ++var16) {
				int var17 = Class120.method1515(var1.charAt(var16), 1900122448) & 255;
				int width = 0;
				if (60 == var17) {
					var12 = var16;
				} else {
					int var19;
					if (-1 != var12) {
						if (62 != var17) {
							continue;
						}

						var19 = var12;
						String str = var1.substring(var12 + 1, var16);
						var12 = -1;
						if (str.equals("br")) {
							var3[var14] = var1.substring(var8, 1 + var16);
							++var14;
							if (var14 >= var3.length) {
								return 0;
							}

							var8 = var16 + 1;
							var7 = 0;
							var9 = -1;
							var13 = -1;
							continue;
						}

						if (str.equals("lt")) {
							width += this.getCharWidth(60, (byte) 23);
							if (null != this.aByteArrayArray_8574
									&& -1 != var13) {
								width += this.aByteArrayArray_8574[var13][60];
							}

							var13 = 60;
						} else if (str.equals("gt")) {
							width += this.getCharWidth(62, (byte) 25);
							if (null != this.aByteArrayArray_8574
									&& -1 != var13) {
								width += this.aByteArrayArray_8574[var13][62];
							}

							var13 = 62;
						} else if (str.equals("nbsp")) {
							width += this.getCharWidth(160, (byte) 39);
							if (null != this.aByteArrayArray_8574
									&& -1 != var13) {
								width += this.aByteArrayArray_8574[var13][160];
							}

							var13 = 160;
						} else if (str.equals("shy")) {
							width += this.getCharWidth(173, (byte) 78);
							if (this.aByteArrayArray_8574 != null
									&& var13 != -1) {
								width += this.aByteArrayArray_8574[var13][173];
							}

							var13 = 173;
						} else if (str.equals("times")) {
							width += this.getCharWidth(215, (byte) 89);
							if (this.aByteArrayArray_8574 != null
									&& -1 != var13) {
								width += this.aByteArrayArray_8574[var13][215];
							}

							var13 = 215;
						} else if (str.equals("euro")) {
							width += this.getCharWidth(8364, (byte) 32);
							if (null != this.aByteArrayArray_8574
									&& -1 != var13) {
								width += this.aByteArrayArray_8574[var13][8364];
							}

							var13 = 8364;
						} else if (str.equals("copy")) {
							width += this.getCharWidth(169, (byte) 0);
							if (null != this.aByteArrayArray_8574
									&& var13 != -1) {
								width += this.aByteArrayArray_8574[var13][169];
							}

							var13 = 169;
						} else if (str.equals("reg")) {
							width += this.getCharWidth(174, (byte) 95);
							if (null != this.aByteArrayArray_8574
									&& var13 != -1) {
								width += this.aByteArrayArray_8574[var13][174];
							}

							var13 = 174;
						} else if (str.startsWith("img=") && sprites != null) {
							try {
								int var21 = LoadProgress.method4427(
										str.substring(4), -1772297474);
								width += sprites[var21].getFurthestX();
								var13 = -1;
							} catch (Exception var22) {
								;
							}
						}

						var17 = -1;
					} else {
						var19 = var16;
						width += this.getCharWidth(var17, (byte) 122);
						if (this.aByteArrayArray_8574 != null && -1 != var13) {
							width += this.aByteArrayArray_8574[var13][var17];
						}

						var13 = var17;
					}

					if (width > 0) {
						var7 += width;
						if (var2 != null) {
							if (32 == var17) {
								var9 = var16;
								var10 = var7;
								var11 = var5 ? 1 : 0;
							}

							if (var7 > var2[var14 < var2.length ? var14
									: var2.length - 1]) {
								if (var9 >= 0) {
									var3[var14] = var1.substring(var8, var9 + 1
											- var11);
									++var14;
									if (var14 >= var3.length) {
										return 0;
									}

									var8 = 1 + var9;
									var9 = -1;
									var7 -= var10;
									var13 = -1;
								} else {
									var3[var14] = var1.substring(var8, var19);
									++var14;
									if (var14 >= var3.length) {
										return 0;
									}

									var8 = var19;
									var9 = -1;
									var7 = width;
									var13 = -1;
								}
							}

							if (var17 == 45) {
								var9 = var16;
								var10 = var7;
								var11 = 0;
							}
						}
					}
				}
			}

			if (var1.length() > var8) {
				var3[var14] = var1.substring(var8, var1.length());
				++var14;
			}

			return var14;
		}
	}

	public int method5560(String var1, int var2, TextObjects[] var3, int var4) {
		int var5 = this.method5563(var1, new int[] { var2 }, aStringArray_8575,
				var3, (byte) 1);
		int var6 = 0;

		for (int var7 = 0; var7 < var5; ++var7) {
			int var8 = this.getStringWidth(aStringArray_8575[var7], var3,
					107281166);
			if (var8 > var6) {
				var6 = var8;
			}
		}

		return var6;
	}

	RSFont(byte[] var1) {
		ByteArrayDataNode var2 = new ByteArrayDataNode(var1);
		int var3 = var2.readByte(1878639837);
		if (0 != var3) {
			throw new RuntimeException("");
		} else {
			boolean var4 = var2.readByte(855835378) == 1;
			this.charSizeData = new byte[256];
			var2.fillArray(this.charSizeData, 0, 256);
			if (var4) {
				int[] var5 = new int[256];
				int[] var6 = new int[256];

				int var7;
				for (var7 = 0; var7 < 256; ++var7) {
					var5[var7] = var2.readByte(354731882);
				}

				for (var7 = 0; var7 < 256; ++var7) {
					var6[var7] = var2.readByte(19732505);
				}

				byte[][] var13 = new byte[256][];

				int var10;
				for (int var8 = 0; var8 < 256; ++var8) {
					var13[var8] = new byte[var5[var8]];
					byte var9 = 0;

					for (var10 = 0; var10 < var13[var8].length; ++var10) {
						var9 += var2.getByte((byte) 22);
						var13[var8][var10] = var9;
					}
				}

				byte[][] var12 = new byte[256][];

				int var14;
				for (var14 = 0; var14 < 256; ++var14) {
					var12[var14] = new byte[var5[var14]];
					byte var15 = 0;

					for (int var11 = 0; var11 < var12[var14].length; ++var11) {
						var15 += var2.getByte((byte) 98);
						var12[var14][var11] = var15;
					}
				}

				this.aByteArrayArray_8574 = new byte[256][256];

				for (var14 = 0; var14 < 256; ++var14) {
					if (32 != var14 && 160 != var14) {
						for (var10 = 0; var10 < 256; ++var10) {
							if (32 != var10 && 160 != var10) {
								this.aByteArrayArray_8574[var14][var10] = (byte) Class220
										.method2770(var13, var12, var6,
												this.charSizeData, var5,
												var14, var10, 1133346049);
							}
						}
					}
				}

				this.fontHeight = 213531795 * (var6[32] + var5[32]);
			} else {
				this.fontHeight = var2.readByte(1927588278) * 213531795;
			}

			var2.readByte(565870622);
			var2.readByte(2057303991);
			this.anInt_8573 = var2.readByte(1835111903) * 579101975;
			this.anInt_8571 = var2.readByte(1489163610) * -233503877;
		}
	}

	public int method5561(String var1, int var2, int var3, TextObjects[] var4,
			byte var5) {
		if (0 == var3) {
			var3 = -63684197 * this.fontHeight;
		}

		int var6 = this.method5563(var1, new int[] { var2 }, aStringArray_8575,
				var4, (byte) 1);
		int var7 = (var6 - 1) * var3;
		return this.anInt_8571 * 2080531379 + var7 + this.anInt_8573
				* 915612327;
	}

	public Point getDrawPoint(String var1, int var2, int var3, int var4,
			TextObjects[] var5, int var6) {
		if (var4 <= 0) {
			return new Point(0, 915612327 * this.anInt_8573 + var3);
		} else {
			if (var4 > var1.length()) {
				var4 = var1.length();
			}

			if (var3 == 0) {
				var3 = this.fontHeight * -63684197;
			}

			int var7 = this.getFormattedStringWidth(var1, new int[] { var2 },
					aStringArray_8575, var5, false, 1941259377);
			int var8 = 0;

			for (int var9 = 0; var9 < var7; ++var9) {
				int var10 = aStringArray_8575[var9].length();
				if (var8 + var10 > var4 || var9 == var7 - 1
						&& var4 == var1.length()) {
					String var11 = var1.substring(var8, var4);
					if (var11.endsWith("<br>")) {
						var11 = "";
						++var9;
					}

					int var12 = this.getStringWidth(var11, var5, 217403068);
					int var13 = var9 * var3 + this.anInt_8573 * 915612327;
					return new Point(var12, var13);
				}

				var8 += var10;
			}

			return null;
		}
	}

	public int method5563(String var1, int[] var2, String[] var3,
			TextObjects[] var4, byte var5) {
		return this.getFormattedStringWidth(var1, var2, var3, var4, true,
				928455392);
	}

	public int method5564(String var1, int var2, int var3, int var4, int var5,
			TextObjects[] var6, short var7) {
		if (var3 == 0) {
			var3 = -63684197 * this.fontHeight;
		}

		int var8 = this.method5563(var1, new int[] { var2 }, aStringArray_8575,
				var6, (byte) 1);
		if (var8 == 0) {
			return 0;
		} else {
			if (var5 < 0) {
				var5 = 0;
			}

			var5 /= var3;
			if (var5 >= var8) {
				var5 = var8 - 1;
			}

			String var9 = aStringArray_8575[var5];
			int var10 = 0;
			int var11 = 0;

			int var12;
			for (var12 = 0; var12 < var4 && var10 < var9.length(); var12 = this
					.getStringWidth(var9.substring(0, var10), var6, -195540163)) {
				var11 = var12;
				++var10;
			}

			if (var10 == var9.length() && var9.endsWith("<br>")) {
				var10 -= 4;
			}

			if (var4 - var11 < var12 - var4) {
				--var10;
			}

			for (int var13 = 0; var13 < var5; ++var13) {
				var10 += aStringArray_8575[var13].length();
			}

			return var10;
		}
	}

	public int method5565(int var1, char var2, byte var3) {
		return this.aByteArrayArray_8574 != null ? this.aByteArrayArray_8574[var1][var2]
				: 0;
	}

	public int method5566(String var1, int var2) {
		return this.getStringWidth(var1, (TextObjects[]) null, 166793782);
	}

	static final void method5567(RSInterfaceData var0, RSCharacter var1, byte var2) {
		var0.intTypeIndex -= -661230153;
		int var3 = var0.intTypes[var0.intTypeIndex * -831324111];
		int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
		int var5 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
		int var6 = var0.intTypes[3 + -831324111 * var0.intTypeIndex];
		int var7 = var0.intTypes[-831324111 * var0.intTypeIndex + 4];
		boolean var8 = var0.intTypes[var0.intTypeIndex * -831324111 + 5] == 1;
		int var9 = var0.intTypes[-831324111 * var0.intTypeIndex + 6];
		if (Class542.aClass43_Sub1_9475.method370(1414107057) != Class116.aClass116_2089) {
			throw new RuntimeException();
		} else {
			Class66_Sub3 var10 = (Class66_Sub3) Class542.aClass43_Sub1_9475
					.method398(890310181);
			Class342 var11 = new Class342();
			Class342 var12 = new Class342();
			var11.method4242(
					0.0F,
					1.0F,
					0.0F,
					(float) (2.0D * 3.141592653589793D * (double) var7 / 16384.0D));
			GameCoord var13 = new GameCoord(1.0F, 0.0F, 0.0F);
			var13.method4328(var11);
			var13.invert();
			var12.method4225(
					var13,
					(float) ((double) var6 * 3.141592653589793D * 2.0D / 16384.0D));
			var11.method4231(var12);
			MapPoint var14 = client.aClass296_348.getMapArea();
			int var15 = var14.loadedMapX * 1265321541 << 9;
			int var16 = -1996781083 * var14.loadedMapY << 9;
			if (var1 != null) {
				var10.method3002(var1, new GameCoord((float) var3, (float) var4,
						(float) var5), var11, var8, var9, client.aClass296_348
						.method3760(-1609711583).anIntArrayArrayArray_7263,
						client.aClass296_348.method3753(), var15,
						var16, (byte) 18);
			}

		}
	}

	static final void method5568(RSInterfaceData var0, int var1) {
		int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
		var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class240_Sub41_Sub3.aClass23_1024
				.method134(var2, 731699118);
	}
}
