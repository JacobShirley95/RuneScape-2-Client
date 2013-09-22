import jaclib.ping.Ping;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;

import javax.swing.JFrame;

public final class client extends ClientSuper {

	public static boolean aBoolean_270 = false;
	public static Class240_Sub9[] aClass240_Sub9Array_271 = new Class240_Sub9[1024];
	public static int anInt_272 = -476755201;
	static String aString_273 = null;
	public static int anInt_274;
	public static int anInt_275 = 0;
	public static int anInt_276 = 0;
	public static NodeArrayList aNodeArrayList_277 = new NodeArrayList(16);
	static int anInt_278 = 0;
	static int anInt_279 = -2027955285;
	public static int anInt_280 = 0;
	public static float[] calculatedPosition = new float[3];
	public static boolean aBoolean_282 = false;
	static String aString_283 = null;
	public static final Class339 aClass339_284 = new Class2();
	public static boolean aBoolean_285 = false;
	public static Class301[] aClass301Array_286;
	static int anInt_287 = 0;
	public static int anInt_288 = 0;
	static int anInt_289 = 631936515;
	static String aString_290 = null;
	public static GamePack currentGamePack = null;
	public static int loginStage = -172038467;
	static ArrayViewport anArrayViewport_293 = new ArrayViewport();
	public static int anInt_294 = 0;
	static final int anInt_295 = 100;
	static long aLong_296 = 0L;
	public static boolean aBoolean_297 = false;
	static boolean aBoolean_298 = true;
	public static int anInt_299 = 0;
	public static int timer = 0;
	static final int anInt_301 = 5439488;
	static boolean fpsToggle = false;
	static boolean aBoolean_303 = false;
	static int[] anIntArray_304 = new int[2];
	public static HintMarker[] hintMarkers = new HintMarker[9];
	public static Class235[] aClass235Array_306 = new Class235[12];
	public static boolean aBoolean_307 = false;
	static boolean aBoolean_308 = false;
	static boolean aBoolean_309 = true;
	static long aLong_310 = (long) (Math.random() * 9.999999999E9D)
			* -733692170528597265L;
	public static boolean aBoolean_311 = false;
	public static int anInt_312 = 0;
	static final int anInt_313 = 65535;
	public static boolean aBoolean_314 = false;
	static String aString_315;
	static int scrollClickCount = 0;
	static final int anInt_317 = 128;
	static boolean aBoolean_318 = false;
	static boolean aBoolean_319 = false;
	static final int anInt_320 = 78;
	public static int anInt_321 = 0;
	public static Class233[] aClass233Array_322 = new Class233[78];
	public static Color[] aColorArray_323 = new Color[] { new Color(9179409),
			new Color(3289650), new Color(3289650), new Color(3289650) };
	public static Color[] loadingColours = new Color[] { new Color(9179409),
			new Color(16777215), new Color(16726277), new Color(16726277) };
	public static Color[] aColorArray_325 = new Color[] { new Color(16777215),
			new Color(16777215), new Color(16741381), new Color(16741381) };
	public static int anInt_326 = 0;
	static int anInt_327 = 0;
	static int anInt_328 = 0;
	static CacheNodeArrayList aClass627_329 = new CacheNodeArrayList(8);
	static final int anInt_330 = 200;
	public static int anInt_331 = 527073887;
	public static NodeArrayList npcNodeList = new NodeArrayList(64);
	public static int anInt_333 = 0;
	public static int anInt_334 = 0;
	public static RSInterface aClass132_335 = null;
	public static int[] npcIndices = new int[1024];
	static int anInt_337 = 0;
	static int[] anIntArray_338 = new int[4096];
	static int anInt_339 = 0;
	static int anInt_340 = 0;
	static int[] anIntArray_341 = new int[32];
	public static final ConnectionHandler lobbyConnectionHandler = new ConnectionHandler();
	public static int anInt_343 = -602124219;
	public static final ConnectionHandler[] openConnections = new ConnectionHandler[] {
			client.gameConnectionHandler, client.lobbyConnectionHandler };
	public static int availableNPCS = 0;
	static boolean aBoolean_346 = false;
	static int[] anIntArray_347 = new int[32];
	public static Class296 aClass296_348 = new Class296(false);
	public static volatile boolean aBoolean_349 = false;
	public static Object anObject_350 = new Object();
	public static Object anObject_351 = new Object();
	public static int[] anIntArray_352 = new int[64];
	public static int anInt_353 = 0;
	public static final int[] anIntArray_354 = new int[] { 0, 0, 0, 0, 1, 1, 1,
			1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	static int[] anIntArray_355;
	public static int anInt_356 = -563825124;
	public static boolean aBoolean_357 = false;
	static int anInt_358 = -530528059;
	public static FriendPlayer[] friendsList;
	public static Class233[] aClass233Array_360 = new Class233[128];
	static int anInt_361 = 0;
	static boolean[] aBooleanArray_362 = new boolean[112];
	static final int anInt_363 = 2;
	public static int anInt_364 = 0;
	static boolean aBoolean_365 = false;
	public static int anInt_366 = 0;
	static final int anInt_367 = 4095;
	static int[] anIntArray_368 = new int[4096];
	static NodeList aNodeList_369 = new NodeList();
	static final int[] anIntArray_370 = new int[] { -1, 8192, 0, -1, 12288,
			10240, 14336, -1, 4096, 6144, 2048 };
	public static int anInt_371 = 731250983;
	static int anInt_372 = -879514930;
	static int anInt_373 = 1449477201;
	static int anInt_374 = 1041773722;
	static int anInt_375 = 0;
	static final int anInt_376 = -1845493760;
	static int anInt_377 = 0;
	static int anInt_378 = 0;
	public static NodeList mouseNodeList = new NodeList();
	static int anInt_380 = 0;
	static int anInt_381 = 2142562927;
	static int anInt_382 = 0;
	static Random aRandom_383 = new Random();
	static int anInt_384 = 0;
	public static int anInt_385 = 0;
	static int anInt_386 = 0;
	public static float aFloat_387 = 1119.0F;
	static final int anInt_388 = 301989888;
	static float aFloat_389 = 0.0F;
	static float aFloat_390 = 0.0F;
	static boolean aBoolean_391 = false;
	public static int anInt_392 = 0;
	static int targetY = 0;
	public static int anInt_394 = -729018040 + -1120729335 * client.anInt_524;
	public static boolean aBoolean_395 = true;
	static int anInt_396 = 0;
	public static IgnoredPlayer[] ignoreList;
	static int[] anIntArray_398 = new int[8];
	public static int[][][] anIntArrayArrayArray_399 = new int[2][][];
	public static int anInt_400 = 1150192039;
	static int anInt_401 = 307417034;
	static Class512 aClass512_402 = new Class512();
	public static int anInt_403 = 0;
	public static short aShort_404;
	public static int anInt_405 = 0;
	public static int anInt_406 = 0;
	static boolean aBoolean_407 = false;
	public static int anInt_408 = 1040489835;
	public static int anInt_409 = 0;
	static int[] anIntArray_410 = new int[506];
	static int[] anIntArray_411 = new int[505];
	static int anInt_412 = 0;
	public static int anInt_413 = -1152014243;
	public static short aShort_414;
	public static final int anInt_415 = 2048;
	public static RSServerQueue serverQueue = new RSServerQueue();
	static int[] anIntArray_417;
	static int crossSprite = 0;
	static boolean aBoolean_419 = false;
	static int anInt_420 = 0;
	static int[] chatMessagesY;
	public static boolean aBoolean_422 = false;
	static final int anInt_423 = 1;
	static int anInt_424 = 1665866875;
	static int[] anIntArray_425 = new int[2];
	public static RSInterface aClass132_426 = null;
	static int[] anIntArray_427 = new int[2];
	static int[] anIntArray_428 = new int[2];
	static int[] anIntArray_429 = new int[2];
	static long aLong_430 = 0L;
	static boolean aBoolean_431 = true;
	static int anInt_432 = 466833568;
	static int anInt_433 = -887950096;
	static int anInt_434 = -1686441031;
	public static int anInt_435 = -1578009647;
	static boolean aBoolean_436 = true;
	public static Player[] aPlayerArray = new Player[2048];
	public static int anInt_438 = -1563670163;
	public static boolean aBoolean_439 = false;
	static int[] anIntArray_440;
	static int anInt_441;
	static boolean aBoolean_442 = false;
	static final int anInt_443 = 0;
	public static boolean aBoolean_444 = false;
	static boolean aBoolean_445 = false;
	public static final int anInt_446 = 112;
	public static boolean aBoolean_447 = false;
	static final int anInt_448 = 8;
	static final short[] playerActions = new short[] { (short) 44, (short) 45,
			(short) 46, (short) 47, (short) 48, (short) 49, (short) 50,
			(short) 51 };
	public static int anInt_450 = 0;
	static String[] playerOptions = new String[8];
	public static boolean aBoolean_452 = false;
	static int anInt_453 = 1546393031;
	public static NodeArrayList groundItems = new NodeArrayList(64);
	static RSInterface aClass132_455 = null;
	static int anInt_456 = -115449257;
	public static Class512 aClass512_457 = new Class512();
	static int anInt_458 = 0;
	static int anInt_459 = 0;
	public static int anInt_460;
	public static int anInt_461 = 1069958275;
	public static short aShort_462;
	public static boolean aBoolean_463 = false;
	static int[] anIntArray_464;
	public static int anInt_465 = -2043299451;
	public static String selectedOption = null;
	public static String aString_467 = null;
	public static volatile int anInt_468 = 1513750931;
	static int anInt_469 = 0;
	static int anInt_470 = 0;
	static long aLong_471;
	public static int anInt_472 = 0;
	public static int anInt_473 = 0;
	public static int anInt_474 = 0;
	static boolean aBoolean_475 = false;
	public static RSInterface aClass132_476 = null;
	static Viewport gameViewport = new Viewport();
	static boolean aBoolean_478 = false;
	public static boolean aBoolean_479 = false;
	static int[] anIntArray_480 = new int[1002];
	static int anInt_481 = 0;
	public static Class264 aClass264_482;
	public static int anInt_483 = 0;
	static boolean aBoolean_484 = false;
	static int anInt_485 = 1096217961;
	static int anInt_486 = -1762451483;
	static int anInt_487 = -1328524653;
	static int anInt_488 = 0;
	static boolean aBoolean_489 = false;
	static int interactionType = 0;
	static int gameIntY = -2030978735;
	static int targetX = 0;
	static int anInt_493 = 0;
	static boolean aBoolean_494 = false;
	static boolean aBoolean_495 = false;
	static Class512 aClass512_496;
	static final int anInt_497 = 32;
	static final int anInt_498 = 31;
	public static boolean aBoolean_499 = false;
	static int anInt_500 = 0;
	public static float aFloat_501 = 0.0F;
	static final int anInt_502 = -771751936;
	static int[] anIntArray_503 = new int[32];
	public static int anInt_504 = 0;
	static int[] anIntArray_505 = new int[32];
	static int anInt_506 = 0;
	public static int anInt_507 = 0;
	static int anInt_508 = 0;
	static int[] anIntArray_509 = new int[32];
	static int anInt_510 = 0;
	public static int anInt_511 = 0;
	static int anInt_512 = 0;
	static int anInt_513 = 0;
	static String aString_514 = null;
	static int anInt_515 = 0;
	static int anInt_516 = 0;
	static int anInt_517 = 0;
	public static NodeList aNodeList_518 = new NodeList();
	public static String aString_519;
	static NodeList aNodeList_520 = new NodeList();
	static NodeArrayList aNodeArrayList_521 = new NodeArrayList(512);
	static int gameIntX = 1270389307;
	public static RSInterface aClass132_523 = null;
	public static int anInt_524 = -958123892;
	public static boolean[] aBooleanArray_525 = new boolean[112];
	static int anInt_526 = 0;
	static Rectangle[] aRectangleArray_527 = new Rectangle[112];
	static int anInt_528;
	static final int[] anIntArray_529;
	static int chatMessagesCount;
	static int maxChatMessagesVisible;
	static int[] chatMessagesX;
	static final int anInt_533 = 9633792;
	public static int anInt_534 = 0;
	static ScreenCharText[] screenChatArray;
	static final int[] anIntArray_536;
	public static final int anInt_537 = 2;
	public static int anInt_538;
	static final int anInt_539 = 100;
	static int[] anIntArray_540 = new int[252];
	static int anInt_541;
	public static String aString_542;
	static int anInt_543 = -1511465501;
	public static int anInt_544 = -93521583;
	public static int anInt_545 = 0;
	static Class7 aClass7_546;
	static final int anInt_547 = 5;
	static boolean[] aBooleanArray_548;
	public static String aString_549 = null;
	static int[] anIntArray_550;
	public static final ConnectionHandler gameConnectionHandler = new ConnectionHandler();
	static int anInt_552 = 0;
	static boolean aBoolean_553 = false;
	public static short aShort_554;
	static int anInt_555 = -691150762;
	public static short aShort_556;
	public static short aShort_557;
	public static short aShort_558;
	public static NodeArrayList widgets = new NodeArrayList(8);
	public static short aShort_560;
	static int anInt_561;
	static int anInt_562;
	public static int anInt_563;
	public static int anInt_564;
	static int anInt_565;
	public static int friendsCount;
	public static int anInt_567;
	public static boolean aBoolean_568 = true;
	static int anInt_569 = 0;
	public static NodeList aNodeList_570 = new NodeList();
	public static int ignoreListCount;
	public static boolean aBoolean_572 = true;
	static long[] aLongArray_573;
	static Calendar aCalendar_574;
	public static int anInt_575 = -1073098751;
	static int anInt_576 = 0;
	static final int anInt_577 = 1375731712;
	static final int anInt_578 = 1179648;
	static final int anInt_579 = 5373952;
	static Viewport aViewport_580 = new Viewport();
	static final int anInt_581 = 13762560;
	static boolean aBoolean_582 = false;
	static int[] anIntArray_583 = new int[32];
	static final int anInt_584 = 9568256;
	static long aLong_585;
	static final int anInt_586 = 1245184;
	public static String aString_587 = null;
	static boolean[] aBooleanArray_588 = new boolean[8];
	static final int anInt_589 = 13828096;
	static final int anInt_590 = 318767104;
	static final int anInt_591 = 1392508928;
	static final int anInt_592 = -1828716544;
	static final int anInt_593 = -754974720;
	static final int[] anIntArray_594;
	public static byte[] aByteArray_595 = null;

	final void setupGame(byte var1) {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class107.aClass132_1992 = new RSInterface();
		Class278.method3620(2119273853);
		Class528.aClass370_9305 = new Class370();
		Class91.updateServerConnection = new UpdateServerConnector();
		int[] var3 = new int[] { 20, 260 };
		int[] var4 = new int[] { 1000, 100 };
		if (null != var3 && var4 != null) {
			Class504.anIntArray_9120 = var3;
			Class548.anIntArray_9486 = new int[var3.length];
			Class548.aByteArrayArrayArray_9482 = new byte[var3.length][][];

			for (int var5 = 0; var5 < Class504.anIntArray_9120.length; ++var5) {
				Class548.aByteArrayArrayArray_9482[var5] = new byte[var4[var5]][];
			}
		} else {
			Class504.anIntArray_9120 = null;
			Class548.anIntArray_9486 = null;
			Class548.aByteArrayArrayArray_9482 = (byte[][][]) null;
		}

		GameCoord.anInt_6575 = 100;
		GameCoord.gameCoordMap = new GameCoord[100];
		GameCoord.anInt_6576 = 0;
		Class342.method4237(10);
		Class401.method4965(100, -458778048);
		Class133.method1770(100, 396969021);
		if (Class554.aClass554_9529 != Class209.currentGameMode) {
			Class231_Sub5.aByteArrayArray_8270 = new byte[50][];
		}

		Class104_Sub21.renderSettings = Class9.method50((byte) 107);
		if (Class104_Sub21.renderSettings.aClass540_Sub12_7318
				.method1679(1389970496) == 1) {
			WorldObjects.aBoolean_4477 = false;
		}

		switch (Class104_Sub21.renderSettings.aClass540_Sub8_7317
				.method1620(265594199)) {
		case 3:
			Class211.aBoolean_3668 = true;
			Class104_Sub21.renderSettings.set(
					Class104_Sub21.renderSettings.aClass540_Sub8_7317,
					0, 1406355585);
			Class274.method3603(Class486.aClass486_8992, (short) -6293);
			break;
		case 4:
			Class211.aBoolean_3667 = true;
			Class104_Sub21.renderSettings.set(
					Class104_Sub21.renderSettings.aClass540_Sub8_7317,
					0, 130614654);
			Class274.method3603(Class486.aClass486_8991, (short) -29562);
		}
		//Class209.currentGameMode = Class554.aClass554_9533;

		if (Class554.aClass554_9529 == Class209.currentGameMode) {
			Class503.aConnectionDesc_9109.hostIP = Class481.clientApplet
					.getCodeBase().getHost();
		} else if (Class209.currentGameMode.method6136(Class572.aClass572_9654,
				-636579192)) {
			Class503.aConnectionDesc_9109.hostIP = Class481.clientApplet
					.getCodeBase().getHost();
			Class503.aConnectionDesc_9109.index = Class503.aConnectionDesc_9109.id
					* 714041859 + -2114966848;
			Class503.lobbyConnectionDesc.index = Class503.lobbyConnectionDesc.id
					* 714041859 + -2114966848;
			Class503.aConnectionDesc_9109.anInt_8747 = -1638782029
					* Class503.aConnectionDesc_9109.id + -1087093648;
			Class503.lobbyConnectionDesc.anInt_8747 = -1087093648
					+ -1638782029 * Class503.lobbyConnectionDesc.id;
		} else if (Class554.aClass554_9533 == Class209.currentGameMode) {
			Class503.aConnectionDesc_9109.hostIP = Class8.localhostIP;
			Class503.lobbyConnectionDesc.hostIP = Class8.localhostIP;
			Class503.aConnectionDesc_9109.index = 714041859
					* Class503.aConnectionDesc_9109.id + -2114966848;
			Class503.lobbyConnectionDesc.index = -2114966848
					+ Class503.lobbyConnectionDesc.id * 714041859;
			Class503.aConnectionDesc_9109.anInt_8747 = -1087093648
					+ -1638782029 * Class503.aConnectionDesc_9109.id;
			Class503.lobbyConnectionDesc.anInt_8747 = -1087093648
					+ -1638782029 * Class503.lobbyConnectionDesc.id;
		}

		Class503.aConnectionDesc_9108 = Class503.aConnectionDesc_9109;
		if (currentGamePack == GamePack.runescapePack) {
			aBoolean_309 = false;
		}

		RSServer.aShortArray_9662 = Class534.aShortArray_9419 = NPCComposite.aShortArray_8607 = ObjectDescriptor.aShortArray_8448 = new short[256];

		try {
			Class1024_Sub3.aClipboard_10983 = DrawingTarget
					.getGameContainer(421071999).getToolkit()
					.getSystemClipboard();
		} catch (Exception var7) {
			;
		}

		Class223.captureKeyboardList = FriendPlayer.addKeyboardHandlerToComponent(
				Class51.clientCanvas, 568050372);
		Class53.captureMouseList = Animator.addMouseHandlerToComponent(
				Class51.clientCanvas, true, 1015360626);
		if (cacheDat2 != null) {
			LoadProgress.mainCacheLoader = new Class243(255, cacheDat2,
					cacheIDx, 1000000);
		}

		Class542.aClass43_Sub1_9475 = new Class43_Sub1(aClass7_546);

		try {
			Class542.aClass43_Sub1_9475.method387(Class46.aClass46_971,
					-511130188);
			Class542.aClass43_Sub1_9475.method352(Class116.aClass116_2086,
					false, (byte) -24);
			Class542.aClass43_Sub1_9475.method351(Class31.aClass31_807, false,
					775120310);
			Class542.aClass43_Sub1_9475.method352(Class116.aClass116_2086,
					false, (byte) -116);
			Class542.aClass43_Sub1_9475.method359(
					GameCoord.createCoord(99999.0F, 99999.0F, 99999.0F),
					(byte) -95);
			Class542.aClass43_Sub1_9475.method374(GameCoord.createCoord(
					Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,
					Float.POSITIVE_INFINITY), (byte) 8);
			Class542.aClass43_Sub1_9475.method358(
					GameCoord.createCoord(99999.0F, 99999.0F, 99999.0F),
					-1551785367);
			Class542.aClass43_Sub1_9475.method356(GameCoord.createCoord(
					Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,
					Float.POSITIVE_INFINITY), -897540418);
		} catch (Exception_Sub1 var6) {
			;
		}

		Class78.method1025(Class481.clientApplet, Class50.aString_1050,
				174750079);
		if (Class554.aClass554_9529 != Class209.currentGameMode
				&& Class554.aClass554_9539 != Class209.currentGameMode) {
			fpsToggle = true;
		}

		curLoadingString = ServerString.loadingStr.getText(
				Class599.clientLanguage, -12897042);
		Class476.aClass306_8741 = new Class306();
		(new Thread(Class476.aClass306_8741)).start();
	}

	final void method2873(byte var1) {
		if (-243034353 * loginStage != 16) {
			if (aBoolean_349) {
				Object var2 = anObject_351;
				synchronized (anObject_351) {
					anObject_351.notify();
				}

				var2 = anObject_350;
				synchronized (anObject_350) {
					try {
						anObject_350.wait();
					} catch (InterruptedException var5) {
						;
					}
				}

				aBoolean_349 = false;
			}

			timer += 1277418321;
			if (-1025618511 * timer % 1000 == 1) {
				GregorianCalendar var8 = new GregorianCalendar();
				ServerInputStream.anInt_4375 = (var8.get(11) * 600
						+ var8.get(12) * 10 + var8.get(13) / 6)
						* -1046225717;
				aRandom_383
						.setSeed((long) (ServerInputStream.anInt_4375 * -324359965));
			}

			gameConnectionHandler.method2543((byte) 3);
			lobbyConnectionHandler.method2543((byte) 3);
			this.method166(-1995810958);
			if (FontUnpacker.cacheDownload != null) {
				FontUnpacker.cacheDownload.method4772(2146528903);
			}

			Class239.method3089((byte) -29);
			Class568.method6248(-1850705594);
			Class223.captureKeyboardList.captureKeyboard(-1610585198);
			Class53.captureMouseList.captureMouse();
			if (Class286.gameRenderer != null) {
				Class286.gameRenderer.cleanup((int) Class373
						.getCurrentTime((short) 23372));
			}

			anInt_483 = 0;
			anInt_321 = 0;

			int var3;
			for (Class233 var9 = Class223.captureKeyboardList
					.method3209(-1952086201); var9 != null; var9 = Class223.captureKeyboardList
					.method3209(-1952086201)) {
				var3 = var9.method2976(2103762623);
				if (2 != var3 && 3 != var3) {
					if (0 == var3) {
						if (-268988889 * anInt_507 >= 2
								&& Class572.method6274(1785309980)
								&& var9.method2971(-16711936) == 28
								&& Class223.captureKeyboardList.method3208(82,
										1953407658)) {
							if (HintMarker.method2686(1929154679)) {
								Class344.method4268((byte) 8);
							} else {
								Class172.method2172(Class521.myPlayer
										.method1504((byte) -53), 1241228102);
							}
						}

						if (572469979 * anInt_321 < 78) {
							aClass233Array_322[572469979 * anInt_321] = var9;
							anInt_321 += 1734048083;
						}
					}
				} else {
					char var4 = var9.method2984(2137042489);
					if (Class572.method6274(1145094881)
							&& (var4 == 96 || 167 == var4 || var4 == 178)) {
						if (Class204.method2597(442241102)) {
							Class283_Sub3.method5141(1543397676);
						} else {
							DrawingTarget.method2199(420574596);
						}
					} else if (anInt_483 * 232284759 < 128) {
						aClass233Array_360[anInt_483 * 232284759] = var9;
						anInt_483 += 1107536231;
					}
				}
			}

			scrollClickCount = 0;

			for (AbstractMouseNode var10 = Class53.captureMouseList
					.method3103(-1403613564); null != var10; var10 = Class53.captureMouseList
					.method3103(-309473868)) {
				var3 = var10.getClickType(745814269);
				if (-1 == var3) {
					Class240_Sub20.method4788(var10, -1506145518);
				} else if (6 == var3) {
					scrollClickCount += var10.getMouseInfo() * 141978141;
					var10.addThisNode((short) 16383);
				} else if (Class572.method6279(var3, -1498621308)) {
					mouseNodeList.addNode(var10, (short) 9019);
					if (mouseNodeList.getSize(1279861479) > 10) {
						AbstractMouseNode var11 = (AbstractMouseNode) mouseNodeList
								.returnShift((byte) -105);
						if (null != var11) {
							var11.addThisNode((short) 16383);
						}
					}
				}
			}

			if (Class204.method2597(442241102)) {
				Class17.method91(731779859);
			}

			if (CharTask.method1348(loginStage * -243034353, 767060681)) {
				Class52.method533(-1588455206);
				Class77.method983(2088532603);
			} else if (Plane.method2164(loginStage * -243034353, (byte) 1)) {
				aClass296_348.loadGameData();
			}

			if (Class305.method3848(-243034353 * loginStage, 1248141109)
					&& !Plane.method2164(-243034353 * loginStage, (byte) 1)) {
				this.method169(706660288);
				Class231.method2932(1500157016);
				Class32.method232(-195610880);
			} else if (Class636.method6720(loginStage * -243034353, 1602865450)
					&& !Plane.method2164(loginStage * -243034353, (byte) 1)) {
				this.method169(706660288);
				Class32.method232(-2087041934);
			} else if (loginStage * -243034353 == 8) {
				Class32.method232(443012099);
			} else if (Class547.method6103(-243034353 * loginStage, 1258654595)
					&& !Plane.method2164(loginStage * -243034353, (byte) 1)) {
				Class566.method6235(-194224810);
			} else if (-243034353 * loginStage == 17
					|| loginStage * -243034353 == 7) {
				Class32.method232(1823298009);
				if (1374043613 * Class11.anInt_71 != -3
						&& Class11.anInt_71 * 1374043613 != 2
						&& Class11.anInt_71 * 1374043613 != 15) {
					if (7 == -243034353 * loginStage) {
						Class11.anInt_57 = Class11.anInt_103 * -1857753981;
						Class11.anInt_98 = -1209765899 * Class11.anInt_102;
						Class11.anInt_59 = 771333197 * Class11.anInt_71;
						if (Exception_Sub6_Sub1.aBoolean_3278) {
							Class104_Sub2.method3146(
									Class503.aConnectionDesc_9110.id
											* -1543224839,
									Class503.aConnectionDesc_9110.hostIP,
									958548877);
							gameConnectionHandler.close((byte) 8);
							Class418.method5190(17, (byte) -100);
						} else {
							Class125.method1608(Class11.aBoolean_97, (byte) -75);
						}
					} else {
						Class125.method1608(false, (byte) -88);
					}
				}
			}

			Class240_Sub33.method4886(Class286.gameRenderer, (byte) -1);
			mouseNodeList.returnShift((byte) -52);
		}
	}

	final void method2880(int var1) {
		if (16 != loginStage * -243034353) {
			long var2 = RSInterface.method1722((short) 1000) / 1000000L
					- 3076162611507255913L * aLong_296;
			aLong_296 = RSInterface.method1722((short) 1000) / 1000000L * 3717009791530358233L;
			boolean var4 = Class9.method51((byte) 33);
			if (var4 && Class217.aBoolean_3748 && null != Class15.aClass316_133) {
				Class15.aClass316_133.method3899();
			}

			if (Class225.method2844(-243034353 * loginStage, (byte) 85)) {
				if (0L != aLong_430 * 2545401177115063053L
						&& Class373.getCurrentTime((short) 9625) > 2545401177115063053L * aLong_430) {
					Class522.method5974(Class445.method5491(1917504476), -1,
							-1, false, -1489391954);
				} else if (!Class286.gameRenderer.method1891() && aBoolean_3909) {
					Class66_Sub1.method2794(269123362);
				}
			}

			int var6;
			if (Class102.aFrame_1967 == null) {
				Container var5 = DrawingTarget.getGameContainer(-1987751250);
				var6 = var5.getSize().width;
				int var7 = var5.getSize().height;
				if (var5 == ConnectionUpdate.clientFrame) {
					Insets var8 = ConnectionUpdate.clientFrame.getInsets();
					var6 -= var8.left + var8.right;
					var7 -= var8.bottom + var8.top;
				}

				if (var6 != -1364963335 * Class221.clientWidth
						|| var7 != 772194201 * clientHeight || aBoolean_311) {
					if (Class286.gameRenderer != null
							&& !Class286.gameRenderer.method1892()) {
						Class221.clientWidth = var6 * -92323255;
						clientHeight = var7 * 1202332841;
					} else {
						Class278.method3620(1595458829);
					}

					aLong_430 = (Class373.getCurrentTime((short) 2967) + 500L)
							* -5028066564971031611L;
					aBoolean_311 = false;
				}
			}

			if (Class506.aBoolean_9125 && Class102.aFrame_1967 != null
					&& !AbstractCacheData.aBoolean_6915
					&& Class225.method2844(loginStage * -243034353, (byte) 68)) {
				Class522.method5974(
						Class104_Sub21.renderSettings.aClass540_Sub13_7311
								.method1694(783234315), -1, -1, false,
						-876107843);
			}

			boolean var10 = false;
			if (aBoolean_3906) {
				aBoolean_3906 = false;
				var10 = true;
			}

			if (var10) {
				Class408.method5039(1565104148);
			}

			if (null != Class286.gameRenderer
					&& Class286.gameRenderer.method1891()
					|| Class445.method5491(1917504476) != 1) {
				Class104_Sub3.method3180(2105623373);
			}

			if (CharTask.method1348(-243034353 * loginStage, -120318053)) {
				Class563_Sub1_Sub4_Sub6.method5349(var10, (byte) -99);
			} else if (Class104_Sub23.method7401(loginStage * -243034353,
					1991434585)) {
				Class130.method1676(-2137607466);
			} else if (Class194
					.method2519(-243034353 * loginStage, -2137643026)) {
				Class130.method1676(-2137607466);
			} else if (Plane.method2164(-243034353 * loginStage, (byte) 1)) {
				if (aClass296_348.method3771((byte) -86) == Class298.aClass298_5992) {
					var6 = aClass296_348.method3743(-842817620) / 2;
					Class599.method6484(
							ServerString.loadingStr.getText(
									Class599.clientLanguage, -815512956)
									+ Class8.aString_40 + "(" + var6 + "%)",
							true, Class286.gameRenderer,
							CacheDataNode.aTextRenderer_3243,
							Class1.aRSFont_10, -346914);
				} else if (aClass296_348.method3771((byte) -88) == Class298.aClass298_5994) {
					var6 = 50 + aClass296_348.method3779(-233149586) / 2;
					Class599.method6484(
							ServerString.loadingStr.getText(
									Class599.clientLanguage, -544684355)
									+ Class8.aString_40 + "(" + var6 + "%)",
							true, Class286.gameRenderer,
							CacheDataNode.aTextRenderer_3243,
							Class1.aRSFont_10, -904899003);
				} else {
					Class599.method6484(ServerString.loadingStr.getText(
							Class599.clientLanguage, -329187441), true,
							Class286.gameRenderer,
							CacheDataNode.aTextRenderer_3243,
							Class1.aRSFont_10, -980769432);
				}
			} else if (6 == -243034353 * loginStage) {
				Class413.method5135(var2);
			} else if (17 == -243034353 * loginStage) {
				Class599.method6484(
						ServerString.connLostStr.getText(
								Class599.clientLanguage, -1175545760)
								+ Class8.aString_40
								+ ServerString.aClass482_8861.getText(
										Class599.clientLanguage, 1590243233),
						false, Class286.gameRenderer,
						CacheDataNode.aTextRenderer_3243, Class1.aRSFont_10,
						869529616);
			} else if (7 == loginStage * -243034353) {
				Class599.method6484(ServerString.pleaseWaitStr.getText(
						Class599.clientLanguage, 653326642), false,
						Class286.gameRenderer,
						CacheDataNode.aTextRenderer_3243, Class1.aRSFont_10,
						223619579);
			}

			if (3 == -83453209 * anInt_528) {
				for (var6 = 0; var6 < anInt_386 * -396228463; ++var6) {
					Rectangle var11 = aRectangleArray_527[var6];
					if (aBooleanArray_362[var6]) {
						Class286.gameRenderer.method1972(var11.x, var11.y,
								var11.width, var11.height, -65281, 890753891);
					} else {
						Class286.gameRenderer.method1972(var11.x, var11.y,
								var11.width, var11.height, -16711936,
								1272443543);
					}
				}
			}

			if (Class204.method2597(442241102)) {
				Class469.method5647(Class286.gameRenderer, (byte) 1);
			}

			if (!CharTask.method1348(loginStage * -243034353, -910475822)
					&& !Plane.method2164(loginStage * -243034353, (byte) 1)
					&& anInt_468 * 1854782309 != -1) {
				try {
					Class286.gameRenderer.method1933();
					Class286.gameRenderer.method1885((byte) -81);
				} catch (Exception_Sub7 var9) {
					CacheFileID.method1397(
							var9.getMessage() + " "
									+ this.method2883(-1598230551), var9,
							1149290048);
					switch (Class104_Sub21.renderSettings.currentToolkit
							.getToolkitID()) {
					case 3:
						Class431.method5393(var9.method1499(-1850471634),
								1343870597);
						Class462.setRenderToolkit(1, false, -1972780657);
						break;
					default:
						Class462.setRenderToolkit(0, false, -1896042180);
					}
				}
			}

			Class236.method3063(-1800398779);
			var6 = Class104_Sub21.renderSettings.aClass540_Sub11_7286
					.method1661(1628785362);
			if (var6 == 0) {
				RSInterface.method1724(15L);
			} else if (1 == var6) {
				RSInterface.method1724(10L);
			} else if (2 == var6) {
				RSInterface.method1724(5L);
			} else if (3 == var6) {
				RSInterface.method1724(2L);
			}

			if (aBoolean_307) {
				Class528.method6011(1015457703);
			}

			if (Class104_Sub21.renderSettings.aClass540_Sub8_7317
					.method1620(1271422331) == 1
					&& loginStage * -243034353 == 5
					&& anInt_468 * 1854782309 != -1) {
				Class104_Sub21.renderSettings
						.set(
								Class104_Sub21.renderSettings.aClass540_Sub8_7317,
								0, 1267456605);
				Class83.method1089(-1142782464);
			}

		}
	}

	final void method2886(int var1) {
		if (null != Class267.preferenceFileList
				&& Class267.preferenceFileList.aBoolean_11139) {
			Class34_Sub2.method2742((byte) 2);
		}

		Class46.method441((byte) -111);
		if (Class286.gameRenderer != null) {
			Class286.gameRenderer.method1939(-1500363801);
		}

		if (Class506.aBoolean_9125 && null != Class102.aFrame_1967) {
			Class39.method320(MapPoint.graphicsDataHolder, Class102.aFrame_1967,
					-1738591864);
			Class102.aFrame_1967 = null;
		}

		gameConnectionHandler.method2545((byte) 84);
		gameConnectionHandler.connectionUpdate.stop();
		lobbyConnectionHandler.method2545((byte) 94);
		lobbyConnectionHandler.connectionUpdate.stop();
		Class484.method5725(1375083315);
		Class91.updateServerConnection.method3636(1476888718);
		Class528.aClass370_9305.method4690((byte) -54);
		if (null != serverQueue) {
			serverQueue.method6195(1809734669);
			serverQueue = null;
		}

		try {
			Ping.quit();
		} catch (Throwable var4) {
			;
		}

		Class504.method5859((byte) 12);

		try {
			Class326.method4016((byte) -43);
		} catch (Exception var3) {
			;
		}

		if (aBoolean_3911) {
			Class47_Sub1.method3499(-723921353);
		}

	}

	void method166(int var1) {
		boolean var2 = Class91.updateServerConnection.method3638((byte) 1);
		if (!var2) {
			this.method167(-725701516);
		}

	}

	void method167(int var1) {
		if (1946606119 * Class91.updateServerConnection.status > 835344543 * anInt_328) {
			Class503.aConnectionDesc_9108.method5689(-35110734);
			anInt_327 = Class91.updateServerConnection.status * -1692207586
					- 925229490;
			if (anInt_327 * -977271227 > 3000) {
				anInt_327 = -1782148008;
			}

			if (Class91.updateServerConnection.status * 1946606119 >= 2
					&& -763251429 * Class91.updateServerConnection.anInt_4748 == 6) {
				this.showError("js5connect_outofdate", 723338780);
				loginStage = 1663532784;
				return;
			}

			if (Class91.updateServerConnection.status * 1946606119 >= 1
					&& 48 == -763251429
							* Class91.updateServerConnection.anInt_4748) {
				this.showError("sessionexpired", 858064589);
				loginStage = 1663532784;
				return;
			}

			if (Class91.updateServerConnection.status * 1946606119 >= 4
					&& -1 == Class91.updateServerConnection.anInt_4748
							* -763251429) {
				System.out
						.println(Class91.updateServerConnection.status * 1946606119);
				this.showError("js5crc", 1193751956);
				loginStage = 1663532784;
				return;
			}

			if (Class91.updateServerConnection.status * 1946606119 >= 4
					&& CharTask
							.method1348(loginStage * -243034353, -1573613563)) {
				if (Class91.updateServerConnection.anInt_4748 * -763251429 != 7
						&& Class91.updateServerConnection.anInt_4748
								* -763251429 != 9) {
					if (-763251429 * Class91.updateServerConnection.anInt_4748 > 0) {
						if (null == aString_514) {
							this.showError("js5connect", 1180538552);
						} else {
							this.showError("js5proxy_" + aString_514.trim(),
									1543174013);
						}
					} else {
						this.showError("js5io", 1017860787);
					}
				} else {
					this.showError("js5connect_full", 1072642820);
				}

				loginStage = 1663532784;
				return;
			}
		}

		anInt_328 = Class91.updateServerConnection.status * 1675536761;
		if (anInt_327 * -977271227 > 0) {
			anInt_327 -= -1112990579;
		} else {
			try {
				if (0 == 87046993 * anInt_294) {
					Class43.aSocket_940 = Class503.aConnectionDesc_9108
							.createSocketConnection(1238316736);
					anInt_294 += -1649545807;
				}

				if (1 == anInt_294 * 87046993) {
					Class286.aClass237_4821 = Class606.createServerConnection(
							Class43.aSocket_940, 125000, -2127647941);
					int var2 = 9 + aString_290.length();
					ByteArrayDataNode var3 = new ByteArrayDataNode(var2 + 2);
					var3.putByte(
							Class335.aClass335_6468.anInt_6478 * 311892347,
							1692354875);
					var3.putByte(var2, -876184959);
					var3.putIntBE(768, 2062892803);
					var3.putIntBE(1, 2062892803);
					var3.putString(aString_290, (byte) -77);
					Class286.aClass237_4821.method3068(var3.data, 0, 2 + var2,
							(byte) 38);
					anInt_294 += -1649545807;
					Class326.aLong_6333 = Class373
							.getCurrentTime((short) 13385)
							* -5543369383367531259L;
				}

				int var9;
				if (anInt_294 * 87046993 == 2) {
					if (Class286.aClass237_4821.method3065(1, -2060009989)) {
						byte[] var7 = new byte[1];
						var9 = Class286.aClass237_4821.method3064(var7, 0, 1,
								(short) -14669);
						if (var7[0] != 0) {
							this.method168(var9, 828830608);
							return;
						}

						anInt_294 += -1649545807;
					} else if (Class373.getCurrentTime((short) 8038)
							- Class326.aLong_6333 * 2430737006265753549L > 30000L) {
						this.method168(1001, 2134419771);
						return;
					}
				}

				if (anInt_294 * 87046993 == 3) {
					Class483[] var8 = Class483.method5718(1463379377);
					var9 = var8.length * 4;
					if (Class286.aClass237_4821.method3065(var9, -2093337512)) {
						ByteArrayDataNode var4 = new ByteArrayDataNode(var9);
						Class286.aClass237_4821.method3064(var4.data, 0,
								var4.data.length, (short) -28216);

						for (int var5 = 0; var5 < var8.length; ++var5) {
							var8[var5].method5715(var4.method4480(1260717178),
									385504537);
						}

						boolean var10 = CharTask.method1348(-243034353
								* loginStage, 624840816)
								|| Class305.method3848(-243034353 * loginStage,
										-1532281766)
								|| Class636.method6720(loginStage * -243034353,
										1700615036);
						Class91.updateServerConnection.method3634(
								Class286.aClass237_4821, !var10, 1319434060);
						Class43.aSocket_940 = null;
						Class286.aClass237_4821 = null;
						anInt_294 = 0;
					}
				}
			} catch (IOException var6) {
				this.method168(1002, -801107761);
			}

		}
	}

	void method168(int var1, int var2) {
		Class43.aSocket_940 = null;
		Class286.aClass237_4821 = null;
		anInt_294 = 0;
		Class91.updateServerConnection.status += -1205668457;
		Class91.updateServerConnection.anInt_4748 = -1748329197 * var1;
	}

	final void method169(int var1) {
		int var2;
		if (-243034353 * loginStage == 4
				&& !Class66.method680(-1057873743)
				|| -243034353 * loginStage == 2
				&& 1374043613 * Class11.anInt_71 == 42
				|| 18 == loginStage * -243034353
				&& (49 == Class11.anInt_62 * -1023105689 || -1023105689
						* Class11.anInt_62 == 52)
				|| 3 == loginStage * -243034353) {
			if (1821492367 * anInt_450 > 1) {
				anInt_450 -= 1995889263;
				anInt_517 = anInt_413 * -1424263917;
			}

			if (!Class18.optionsClosed) {
				ByteArrayDataNode.method4543((byte) 67);
			}

			if (18 != loginStage * -243034353
					|| -1023105689 * Class11.anInt_62 != 49
					&& -1023105689 * Class11.anInt_62 != 52) {
				for (var2 = 0; var2 < 100
						&& Class290_Sub1.method7524(lobbyConnectionHandler,
								(byte) -59); ++var2) {
					;
				}
			}
		}

		Class343.method4252(-657553546);
		Class507_Sub3.method1511(504454507);
		anInt_384 += 1043346163;
		Class500.method5837(-1, -1, -1649283055);
		Class71.method821((RSInterface) null, -1, -1, 755561934);
		Class107.method1385(-32050098);
		anInt_413 += -1152014243;

		for (var2 = 0; var2 < 1910301187 * anInt_334; ++var2) {
			NPC var3 = (NPC) aClass240_Sub9Array_271[var2].anObject_6783;
			if (null != var3) {
				byte var4 = var3.npcComposite.aByte_8671;
				if (0 != (var4 & 1)) {
					int var5 = var3.method3257();
					int var6;
					if ((var4 & 2) != 0 && 0 == var3.anInt_4331 * -74820059
							&& Math.random() * 1000.0D < 10.0D) {
						var6 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						int var7 = (int) Math
								.round(Math.random() * 10.0D - 5.0D);
						if (var6 != 0 || var7 != 0) {
							int var8 = var6 + var3.tilePosArrayX[0];
							int var9 = var7 + var3.tilePosArrayY[0];
							if (var8 < 0) {
								boolean var17 = false;
							} else if (var8 > aClass296_348.getMaxX((byte) -83)
									- var5 - 1) {
								var8 = aClass296_348.getMaxX((byte) -25) - var5
										- 1;
							}

							if (var9 < 0) {
								boolean var18 = false;
							} else if (var9 > aClass296_348
									.getMaxY(-1214604396) - var5 - 1) {
								var9 = aClass296_348.getMaxY(878591441) - var5
										- 1;
							}
						}
					}

					Class41.method342(var3, true, (byte) 31);
					var6 = IgnoredPlayer.method73(var3, 1976415176);
					Class486.method5739(var3, (byte) 95);
					Class172.method2174(var3,
							-1503777883 * Class411.anInt_7851,
							1279861479 * Class525.anInt_9275, var6,
							(short) 26410);
					Class494.method5778(var3,
							Class411.anInt_7851 * -1503777883, 1434510007);
					Class86.method1130(var3, -855464258);
					Class342 var16 = Class342.method4218();
					var16.method4223(Class362.toRadians(var3.aClass6_4337
							.getRotation((byte) 103)), Class362
							.toRadians(var3.yRotation
									.getRotation((byte) 24)), Class362
							.toRadians(var3.xRotation
									.getRotation((byte) 60)));
					var3.method6206(var16);
					var16.method4243();
				}
			}
		}

		if ((5 == loginStage * -243034353 || loginStage * -243034353 == 2
				|| loginStage * -243034353 == 4 || -243034353 * loginStage == 3)
				&& (!Class66.method680(-1129049524)
						|| loginStage * -243034353 == 2
						&& 42 == 1374043613 * Class11.anInt_71 || 18 == loginStage
						* -243034353
						&& (49 == Class11.anInt_62 * -1023105689 || 52 == Class11.anInt_62
								* -1023105689))
				&& !Class119.method1505((byte) 78)) {
			if (Class509.anInt_9182 * 1735950531 == 5) {
				Exception_Sub2.method1279(-343079419);
			} else {
				Class187_Sub2.method7582((short) 26052);
			}

			if (1199090811 * Class330.anInt_6406 >> 9 < 14
					|| Class330.anInt_6406 * 1199090811 >> 9 >= aClass296_348
							.getMaxX((byte) -76) - 14
					|| 1527060537 * Class373.anInt_7118 >> 9 < 14
					|| 1527060537 * Class373.anInt_7118 >> 9 >= aClass296_348
							.getMaxY(-1843489028) - 14) {
				aClass296_348.method3764(new Class297(Class305.aClass305_6025,
						(ByteArrayDataNode_Sub1) null), 1309488430);
			}
		}

		while (true) {
			Class240_Sub17 var11 = (Class240_Sub17) aNodeList_369
					.returnShift((byte) -84);
			RSInterface var12;
			RSInterface var13;
			if (var11 == null) {
				while (true) {
					var11 = (Class240_Sub17) aNodeList_520
							.returnShift((byte) 7);
					if (null == var11) {
						while (true) {
							var11 = (Class240_Sub17) aNodeList_518
									.returnShift((byte) 69);
							if (null == var11) {
								if (aClass132_523 != null) {
									DamageSprite.method6531(-2121508862);
								}

								if (0 == timer * -1025618511 % 1500) {
									Class493.method5769(1809368623);
								}

								if (4 == -243034353 * loginStage
										&& !Class66.method680(-635292656)
										|| loginStage * -243034353 == 2
										&& Class11.anInt_71 * 1374043613 == 42
										|| loginStage * -243034353 == 18
										&& (-1023105689 * Class11.anInt_62 == 49 || 52 == Class11.anInt_62
												* -1023105689)
										|| 3 == loginStage * -243034353) {
									Class520.method5969(1220718599);
								}

								Class571.method6270((byte) 5);
								if (aBoolean_346) {
									Class44.method411((byte) -10);
									aBoolean_346 = false;
								}

								if (Class267.preferenceFileList.aBoolean_11139
										&& Class267.preferenceFileList.aLong_11140
												* -7910477920617393723L < Class373
												.getCurrentTime((short) 27898) - 60000L) {
									Class34_Sub2.method2742((byte) 30);
								}

								for (Class231_Sub3 var14 = (Class231_Sub3) aClass512_496
										.method5930((byte) -1); null != var14; var14 = (Class231_Sub3) aClass512_496
										.method5933(-1474223295)) {
									if ((long) (var14.anInt_7900 * -761601043) < Class373
											.getCurrentTime((short) 26076) / 1000L - 5L) {
										if (var14.aShort_7898 > 0) {
											Class634.method6708(
													5,
													0,
													"",
													"",
													"",
													var14.aString_7899
															+ ServerString.aClass482_8908
																	.getText(
																			Class599.clientLanguage,
																			426060156),
													(byte) 43);
										}

										if (var14.aShort_7898 == 0) {
											Class634.method6708(
													5,
													0,
													"",
													"",
													"",
													var14.aString_7899
															+ ServerString.aClass482_8886
																	.getText(
																			Class599.clientLanguage,
																			-1622677256),
													(byte) 81);
										}

										var14.method2931(-1261758662);
									}
								}

								if (4 == loginStage * -243034353
										&& !Class66.method680(1550933656)
										|| loginStage * -243034353 == 2
										&& 42 == Class11.anInt_71 * 1374043613
										|| loginStage * -243034353 == 18
										&& (49 == -1023105689
												* Class11.anInt_62 || -1023105689
												* Class11.anInt_62 == 52)
										|| -243034353 * loginStage == 3) {
									if (loginStage * -243034353 != 2
											&& lobbyConnectionHandler
													.getServerConnection() == null) {
										Class125.method1608(false, (byte) -61);
										return;
									}

									if (lobbyConnectionHandler != null) {
										lobbyConnectionHandler.anInt_3447 += -92815543;
										if (lobbyConnectionHandler.anInt_3447
												* -18521351 > 50) {
											Class240_Sub27 var15 = Class47_Sub1
													.method3496(
															Class326.aClass326_6217,
															lobbyConnectionHandler.aClass528_3433,
															1917447504);
											lobbyConnectionHandler.addPacket(
													var15, 1076729119);
										}

										try {
											lobbyConnectionHandler
													.method2541((byte) -61);
										} catch (IOException var10) {
											if (loginStage * -243034353 == 2) {
												lobbyConnectionHandler
														.method2545((byte) 106);
											} else {
												Class125.method1608(false,
														(byte) -8);
											}
										}
									}
								}

								return;
							}

							var12 = var11.aClass132_6903;
							if (var12.anInt_2428 * -1001687885 >= 0) {
								var13 = RSServerQueue.getInterface(
										var12.parentID * -671235497,
										(byte) 105);
								if (var13 == null
										|| var13.aClass132Array_2579 == null
										|| var12.anInt_2428 * -1001687885 >= var13.aClass132Array_2579.length
										|| var13.aClass132Array_2579[-1001687885
												* var12.anInt_2428] != var12) {
									continue;
								}
							}

							Class411.method5074(var11, (byte) 1);
						}
					}

					var12 = var11.aClass132_6903;
					if (var12.anInt_2428 * -1001687885 >= 0) {
						var13 = RSServerQueue.getInterface(var12.parentID
								* -671235497, (byte) 105);
						if (var13 == null
								|| null == var13.aClass132Array_2579
								|| -1001687885 * var12.anInt_2428 >= var13.aClass132Array_2579.length
								|| var12 != var13.aClass132Array_2579[var12.anInt_2428
										* -1001687885]) {
							continue;
						}
					}

					Class411.method5074(var11, (byte) 1);
				}
			}

			var12 = var11.aClass132_6903;
			if (-1001687885 * var12.anInt_2428 >= 0) {
				var13 = RSServerQueue.getInterface(var12.parentID * -671235497,
						(byte) 105);
				if (null == var13
						|| null == var13.aClass132Array_2579
						|| -1001687885 * var12.anInt_2428 >= var13.aClass132Array_2579.length
						|| var12 != var13.aClass132Array_2579[-1001687885
								* var12.anInt_2428]) {
					continue;
				}
			}

			Class411.method5074(var11, (byte) 1);
		}
	}

	static final void method170() {
		int maxPlayers = Class15.availablePlayers * -688404505;
		int[] playerIndices = Class15.playersIndices;
		int idleAnimations = Class104_Sub21.renderSettings.idleAnimations
				.method1774(-191290987);
		boolean var3 = 1 == idleAnimations && maxPlayers > 200 || idleAnimations == 0 && maxPlayers > 50;

		int var4;
		int var6;
		for (var4 = 0; var4 < maxPlayers; ++var4) {
			Player var5 = aPlayerArray[playerIndices[var4]];
			if (!var5.method1001((byte) 25)) {
				var5.anInt_4299 = -51746669;
			} else if (var5.aBoolean_1476) {
				var5.anInt_4299 = -51746669;
			} else {
				var5.method2436(2116877118);
				if (var5.locX >= 0 && var5.locY >= 0
						&& var5.locX2 < aClass296_348.getMaxX((byte) -75)
						&& var5.locY2 < aClass296_348.getMaxY(872778548)) {
					var5.aBoolean_1471 = var5.stance.isStationary ? var3
							: false;
					if (var5 == Class521.myPlayer) {
						var5.anInt_4299 = 2095736979;
					} else {
						var6 = 0;
						if (!var5.aBoolean_4296) {
							++var6;
						}

						if (!var5.aClass512_4311.method5932(-2006114617)) {
							var6 += 2;
						}

						var6 += 5 - var5.method3257() << 2;
						if (!var5.aBoolean_1458 && !var5.aBoolean_1486) {
							if (0 == anInt_488 * 2013211827) {
								var6 += 32;
							} else {
								var6 += 128;
							}

							var6 += 256;
						} else {
							var6 += 512;
						}

						var5.anInt_4299 = 51746669 * (1 + var6);
					}
				} else {
					var5.anInt_4299 = -51746669;
				}
			}
		}

		for (var4 = 0; var4 < availableNPCS * 1636714459; ++var4) {
			NPC var8 = (NPC) ((Class240_Sub9) npcNodeList
					.getNode((long) npcIndices[var4])).anObject_6783;
			if (var8.method1177(2045695321)
					&& var8.npcComposite.method5600(
							Class240_Sub41_Sub3.aClass23_1024,
							Class240_Sub41_Sub3.aClass23_1024, -880271857)) {
				var8.method2436(-1292273999);
				if (var8.locX >= 0 && var8.locY >= 0
						&& var8.locX2 < aClass296_348.getMaxX((byte) -112)
						&& var8.locY2 < aClass296_348.getMaxY(-796823919)) {
					var6 = 0;
					if (!var8.aBoolean_4296) {
						++var6;
					}

					if (!var8.aClass512_4311.method5932(-2006114617)) {
						var6 += 2;
					}

					var6 += 5 - var8.method3257() << 2;
					if (0 == 2013211827 * anInt_488) {
						if (var8.npcComposite.aBoolean_8636) {
							var6 += 64;
						} else {
							var6 += 128;
						}
					} else if (1 == 2013211827 * anInt_488) {
						if (var8.npcComposite.aBoolean_8636) {
							var6 += 32;
						} else {
							var6 += 64;
						}
					}

					if (var8.npcComposite.aBoolean_8634) {
						var6 += 1024;
					} else if (!var8.npcComposite.aBoolean_8653) {
						var6 += 256;
					}

					var8.anInt_4299 = 51746669 * (var6 + 1);
				} else {
					var8.anInt_4299 = -51746669;
				}
			} else {
				var8.anInt_4299 = -51746669;
			}
		}

		for (var4 = 0; var4 < hintMarkers.length; ++var4) {
			HintMarker var9 = hintMarkers[var4];
			if (null != var9) {
				if (var9.anInt_3702 * -2076198275 == 1) {
					Class240_Sub9 var10 = (Class240_Sub9) npcNodeList
							.getNode((long) (-1369728825 * var9.markerTarget));
					if (var10 != null) {
						NPC var7 = (NPC) var10.anObject_6783;
						if (var7.anInt_4299 * -1825240475 >= 0) {
							var7.anInt_4299 += -1397004288;
						}
					}
				} else if (var9.anInt_3702 * -2076198275 == 10) {
					Player var11 = aPlayerArray[var9.markerTarget * -1369728825];
					if (null != var11 && Class521.myPlayer != var11
							&& var11.anInt_4299 * -1825240475 >= 0) {
						var11.anInt_4299 += -1397004288;
					}
				}
			}
		}

	}

	static final void method171() {
		int[][] var0 = aClass296_348.method3756(-1059482358);
		int var1 = aClass296_348.getMaxX((byte) -71);
		int var2 = aClass296_348.getMaxY(497818288);

		for (int var3 = 0; var3 < var1; ++var3) {
			int[] var4 = var0[var3];

			for (int var5 = 0; var5 < var2; ++var5) {
				var4[var5] = 0;
			}
		}

	}

	static final void method172() {
		int var0 = -688404505 * Class15.availablePlayers;
		int[] var1 = Class15.playersIndices;
		int var2;
		if (anInt_356 * 415041591 == 1) {
			var2 = Class95.aClass100Array_1894.length;
		} else {
			var2 = aBoolean_308 ? var0 : var0 + availableNPCS * 1636714459;
		}

		for (int var3 = 0; var3 < var2; ++var3) {
			Object var5;
			if (1 == 415041591 * anInt_356) {
				Class100 var4 = Class95.aClass100Array_1894[var3];
				if (!var4.aBoolean_1952) {
					continue;
				}

				var5 = var4.getTarget((byte) 62);
			} else {
				if (var3 < var0) {
					var5 = aPlayerArray[var1[var3]];
				} else {
					var5 = (RSCharacter) ((Class240_Sub9) npcNodeList
							.getNode((long) npcIndices[var3 - var0])).anObject_6783;
				}

				if (-1825240475 * ((RSCharacter) var5).anInt_4299 < 0) {
					continue;
				}
			}

			int var7 = ((RSCharacter) var5).method3257();
			GameCoord var6 = ((RSCharacter) var5).method6203().gameCoord;
			if (0 == (var7 & 1)) {
				if (0 == ((int) var6.floatX & 511)
						&& ((int) var6.floatZ & 511) == 0) {
					continue;
				}
			} else if (256 == ((int) var6.floatX & 511)
					&& 256 == ((int) var6.floatZ & 511)) {
				continue;
			}

			((RSCharacter) var5).setPosition(var6.floatX,
					(float) CompProfile.getHeight((int) var6.floatX,
							(int) var6.floatZ, ((RSCharacter) var5).plane),
					var6.floatZ);
			aClass296_348.getWorldObjects().method3455((PositionEntity) var5,
					true, 1811552668);
		}

	}

	public static final void method173(RSInterfaceGroup var0, RSInterface[] var1,
			int var2, int var3, int var4, int canvasWidth, int canvasHeight, int offsetX,
			int offsetY, int mouseX, int mouseY) {
		label960: for (int var11 = 0; var11 < var1.length; ++var11) {
			RSInterface rsInterface = var1[var11];
			if (rsInterface != null
					&& var2 == -671235497 * rsInterface.parentID) {
				int x = offsetX + rsInterface.X1 * -1500060803;
				int y = rsInterface.Y1 * 980798721 + offsetY;
				int var15;
				int width;
				int var16;
				int height;
				if (1916189739 * rsInterface.index == 2) {
					var15 = var3;
					var16 = var4;
					width = canvasWidth;
					height = canvasHeight;
				} else {
					int var19 = rsInterface.width * -533669195 + x;
					int var20 = y + rsInterface.height * 1833812087;
					if (1916189739 * rsInterface.index == 9) {
						++var19;
						++var20;
					}

					var15 = x > var3 ? x : var3;
					var16 = y > var4 ? y : var4;
					width = var19 < canvasWidth ? var19 : canvasWidth;
					height = var20 < canvasHeight ? var20 : canvasHeight;
				}

				if (1916189739 * rsInterface.index != 0
						&& !rsInterface.aBoolean_2524
						&& method174(rsInterface).anInt_7693 * -1992444447 == 0
						&& aClass132_426 != rsInterface
						&& 1592443827 * RSInterface.anInt_2576 != 691513007 * rsInterface.type
						&& 407909271 * RSInterface.anInt_2413 != 691513007 * rsInterface.type
						&& RSInterface.anInt_2536 * 221269325 != 691513007 * rsInterface.type
						&& RSInterface.anInt_2407 * -5877375 != rsInterface.type * 691513007) {
					if (var15 < width && var16 < height) {
						Class215.method2701(rsInterface, 2074194676);
					}
				} else if (!method179(rsInterface)) {
					if (aClass132_523 == rsInterface
							&& Class470.method5657(aClass132_523, -2136743988)) {
						aBoolean_582 = true;
						gameIntX = -1270389307 * x;
						gameIntY = y * 2030978735;
					}

					if (rsInterface.aBoolean_2505 || var15 < width
							&& var16 < height) {
						if (rsInterface.aBoolean_2450 && mouseX >= var15
								&& mouseY >= var16 && mouseX < width
								&& mouseY < height) {
							for (Class240_Sub17 var38 = (Class240_Sub17) aNodeList_518
									.getBaseNode_2((byte) 92); null != var38; var38 = (Class240_Sub17) aNodeList_518
									.getNext(-583808723)) {
								if (var38.aBoolean_6908) {
									var38.shiftNext();
									var38.aClass132_6903.aBoolean_2465 = false;
								}
							}

							if (-1781654217 * GameType.anInt_9191 == 0) {
								aClass132_523 = null;
								aClass132_426 = null;
							}

							anInt_493 = 0;
							Class248_Sub1.aBoolean_6448 = false;
							aBoolean_495 = false;
							if (!Class18.optionsClosed) {
								ByteArrayDataNode.method4543((byte) 53);
							}
						}

						boolean var37 = rsInterface.aBoolean_2468
								&& 1916189739 * rsInterface.index == 5
								&& rsInterface.hoverOutline * -213540263 == 0
								&& 1948781599 * rsInterface.anInt_2513 < 0
								&& -1 == 2142376247 * rsInterface.itemID
								&& rsInterface.anInt_2482 * -1190550869 == -1
								&& !rsInterface.aBoolean_2472
								&& 0 == -1111653847 * rsInterface.anInt_2437;
						boolean var41 = false;
						int moveX;
						if (mouseX >= var15 && mouseY >= var16 && mouseX < width
								&& mouseY < height) {
							if (var37) {
								Class126 var21 = rsInterface.method1712(
										Class286.gameRenderer, 1272478299);
								if (null != var21
										&& -533669195 * rsInterface.width == var21.anInt_2367
												* -1598600089
										&& rsInterface.height * 1833812087 == var21.anInt_2365 * 860389213) {
									int var22 = mouseX - x;
									int var23 = mouseY - y;
									if (var23 >= 0
											&& var23 < var21.anIntArray_2368.length) {
										moveX = var21.anIntArray_2368[var23];
										if (var22 >= moveX
												&& var22 <= moveX
														+ var21.anIntArray_2366[var23]) {
											var41 = true;
										}
									}
								} else {
									var41 = true;
								}
							} else {
								var41 = true;
							}
						}

						if (!aBoolean_463 && var41) {
							if (1019642031 * rsInterface.anInt_2533 >= 0) {
								anInt_373 = 2079837345 * rsInterface.anInt_2533;
							} else if (rsInterface.aBoolean_2450) {
								anInt_373 = 1449477201;
							}
						}

						if (!Class18.optionsClosed && var41
								&& !var0.aBoolean_2054) {
							Class206.method2620(rsInterface, mouseX - x,
									mouseY - y, -1081778248);
						}

						boolean var42 = false;
						if (Class53.captureMouseList.method3099((short) 280)
								&& var41) {
							var42 = true;
						}

						boolean clicked = false;
						AbstractMouseNode mouseNode = (AbstractMouseNode) mouseNodeList
								.getBaseNode_2((byte) 102);
						int moveY;
						int newY;
						int newX;
						if (mouseNode != null && mouseNode.getClickType(745814269) == 0
								&& mouseNode.getMouseX((byte) -73) >= var15
								&& mouseNode.getMouseY(-912219491) >= var16
								&& mouseNode.getMouseX((byte) -44) < width
								&& mouseNode.getMouseY(-598388848) < height) {
							if (var37) {
								Class126 var45 = rsInterface.method1712(
										Class286.gameRenderer, 1272478299);
								if (null != var45
										&& -1598600089 * var45.anInt_2367 == rsInterface.width
												* -533669195
										&& var45.anInt_2365 * 860389213 == rsInterface.height * 1833812087) {
									moveY = mouseNode.getMouseX((byte) 5) - x;
									newX = mouseNode.getMouseY(-120970904) - y;
									if (newX >= 0
											&& newX < var45.anIntArray_2368.length) {
										newY = var45.anIntArray_2368[newX];
										if (moveY >= newY
												&& moveY <= newY
														+ var45.anIntArray_2366[newX]) {
											clicked = true;
										}
									}
								} else {
									clicked = true;
								}
							} else {
								clicked = true;
							}
						}

						if (rsInterface.aBoolean_2505
								&& !Class204.method2597(442241102)) {
							for (moveX = 0; moveX < rsInterface.aByteArrayArray_2506.length; ++moveX) {
								boolean var43 = false;
								boolean var49 = false;
								if (rsInterface.anIntArray_2545[moveX] > 0) {
									for (newY = 0; newY < 232284759 * anInt_483; ++newY) {
										if (rsInterface.anIntArray_2545[moveX] == aClass233Array_360[newY]
												.method2984(360047496)) {
											var43 = true;
											if (rsInterface.anIntArray_2542 == null
													|| rsInterface.anIntArray_2542[moveX] <= -1025618511
															* timer) {
												var49 = true;
											}
											break;
										}
									}
								}

								if (!var43
										&& rsInterface.aByteArrayArray_2506[moveX] != null) {
									for (newY = 0; newY < rsInterface.aByteArrayArray_2506[moveX].length; ++newY) {
										if (Class223.captureKeyboardList
												.method3208(
														rsInterface.aByteArrayArray_2506[moveX][newY],
														1953407658)) {
											var43 = true;
											if (null != rsInterface.anIntArray_2542
													&& rsInterface.anIntArray_2542[moveX] > -1025618511
															* timer) {
												break;
											}

											byte var28 = rsInterface.aByteArrayArray_2470[moveX][newY];
											if (var28 == 0
													|| ((var28 & 8) == 0 || !Class223.captureKeyboardList
															.method3208(86,
																	1953407658)
															&& !Class223.captureKeyboardList
																	.method3208(
																			82,
																			1953407658)
															&& !Class223.captureKeyboardList
																	.method3208(
																			81,
																			1953407658))
													&& ((var28 & 2) == 0 || Class223.captureKeyboardList
															.method3208(86,
																	1953407658))
													&& (0 == (var28 & 1) || Class223.captureKeyboardList
															.method3208(82,
																	1953407658))
													&& ((var28 & 4) == 0 || Class223.captureKeyboardList
															.method3208(81,
																	1953407658))) {
												var49 = true;
												break;
											}
										}
									}
								}

								if (var49) {
									if (moveX < 10) {
										Class598.method6476(
												1 + moveX,
												rsInterface.cacheID * 1278853609,
												rsInterface.anInt_2428
														* -1001687885, "",
												-1898494081);
									} else if (moveX == 10) {
										Class537.method6073(1991815262);
										Class240_Sub49 var47 = method174(rsInterface);
										Class210.method2656(rsInterface,
												var47.method4993((byte) 7),
												-13045859 * var47.anInt_7701,
												(byte) -114);
										selectedOption = Class21.method131(
												rsInterface, -1470829897);
										if (null == selectedOption) {
											selectedOption = "Null";
										}

										aString_467 = rsInterface.aString_2514
												+ Class133.addTextColour(
														16777215, (byte) 6);
									}

									newY = rsInterface.anIntArray_2508[moveX];
									if (null == rsInterface.anIntArray_2542) {
										rsInterface.anIntArray_2542 = new int[rsInterface.aByteArrayArray_2506.length];
									}

									if (newY != 0) {
										rsInterface.anIntArray_2542[moveX] = newY
												+ -1025618511 * timer;
									} else {
										rsInterface.anIntArray_2542[moveX] = Integer.MAX_VALUE;
									}
								}

								if (!var43
										&& null != rsInterface.anIntArray_2542) {
									rsInterface.anIntArray_2542[moveX] = 0;
								}
							}
						}

						if (clicked) {
							Class240_Sub52_Sub11.method644(rsInterface,
									mouseNode.getMouseX((byte) -1) - x,
									mouseNode.getMouseY(-1696568808) - y,
									1861385972);
						}

						if (aClass132_523 != null
								&& aClass132_523 != rsInterface
								&& var41
								&& method174(rsInterface).method4995(
										-1430982879)) {
							aClass132_455 = rsInterface;
						}

						if (rsInterface == aClass132_426) {
							aBoolean_484 = true;
							anInt_485 = -1096217961 * x;
							anInt_486 = y * 1762451483;
							anInt_487 = aClass132_426.width * 2060742673;
							anInt_456 = -906753649 * aClass132_426.height;
						}

						if (rsInterface.aBoolean_2524
								|| rsInterface.type * 691513007 != 0) {
							Class240_Sub17 var44;
							if (var41 && -236083147 * scrollClickCount != 0
									&& rsInterface.anObjectArray_2552 != null) {
								var44 = new Class240_Sub17();
								var44.aBoolean_6908 = true;
								var44.aClass132_6903 = rsInterface;
								var44.anInt_6905 = 1341109413 * scrollClickCount;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2552;
								aNodeList_518.addNode(var44, (short) 17458);
							}

							if (null != aClass132_523) {
								clicked = false;
								var42 = false;
							} else if (Class18.optionsClosed
									|| -942072551
											* RSInterface.worldMapInterface != rsInterface.type * 691513007
									&& anInt_493 * -836263273 > 0) {
								clicked = false;
								var42 = false;
								var41 = false;
							}

							if (691513007 * rsInterface.type != 0) {
								int var55;
								if (691513007 * rsInterface.type == RSInterface.anInt_2536 * 221269325
										|| RSInterface.anInt_2407 * -5877375 == 691513007 * rsInterface.type) {
									aClass132_476 = rsInterface;
									Class584 var59 = aClass296_348.method3754(
											-951631252).method6388(1032456943);
									if (var59.method6338(-831324111) != null
											&& !Class476.aClass306_8741
													.method3850((byte) 6)) {
										var59.method6338(-831324111)
												.method3688(
														Class286.gameRenderer,
														rsInterface.height * 1833812087,
														Class104_Sub21.renderSettings.aClass540_Sub6_7305
																.method1559(1880862270),
														(byte) -123);
									}

									if (RSInterface.anInt_2536 * 221269325 == rsInterface.type * 691513007
											&& !Class18.optionsClosed
											&& mouseX >= var15
											&& mouseY >= var16
											&& mouseX < width && mouseY < height) {
										Class31.method223(
												Class286.gameRenderer, mouseX,
												mouseY, (byte) 5);

										for (Class231_Sub4 var50 = (Class231_Sub4) aClass512_402
												.method5930((byte) -1); var50 != null; var50 = (Class231_Sub4) aClass512_402
												.method5933(-1812628154)) {
											if (mouseX >= var50.anInt_8091
													* -1560289559
													&& mouseX < var50.anInt_8088
															* -47486345
													&& mouseY >= var50.anInt_8092 * 807288809
													&& mouseY < -624653941
															* var50.anInt_8094) {
												ByteArrayDataNode
														.method4543((byte) 106);
												Class16.method90(
														var50.aClass563_Sub1_Sub4_Sub4_8093,
														(byte) 94);
											}
										}
									}

									moveY = -688404505 * Class15.availablePlayers;
									int[] var57 = Class15.playersIndices;

									for (newY = 0; newY < moveY; ++newY) {
										Player var51 = aPlayerArray[var57[newY]];
										if (null != var51) {
											LoadProgress.method4425(
													Class434.aClass434_8359,
													-1, -1, var51,
													var57[newY], -390915147);
											var51.method3270(
													var15,
													var16,
													width,
													height,
													x
															- rsInterface.scrollX
															* -340277309,
													y
															- -978526293
															* rsInterface.scrollY,
													mouseX, mouseY, (byte) 36);
										}
									}

									newY = 0;

									while (true) {
										if (newY >= availableNPCS * 1636714459) {
											continue label960;
										}

										var55 = npcIndices[newY];
										Class240_Sub9 var52 = (Class240_Sub9) npcNodeList
												.getNode((long) var55);
										if (null != var52) {
											LoadProgress
													.method4425(
															Class434.aClass434_8358,
															646032317 * ((NPC) var52.anObject_6783).npcComposite.modelID,
															-1,
															(RSCharacter) var52.anObject_6783,
															var55, -1728004395);
											((RSCharacter) var52.anObject_6783)
													.method3270(
															var15,
															var16,
															width,
															height,
															x
																	- -340277309
																	* rsInterface.scrollX,
															y
																	- rsInterface.scrollY
																	* -978526293,
															mouseX, mouseY,
															(byte) 118);
										}

										++newY;
									}
								}

								if (1592443827 * RSInterface.anInt_2576 == rsInterface.type * 691513007) {
									moveX = 0;
									moveY = canvasWidth - var3;
									newX = mouseX - x;
									newY = mouseY - y;
									if (1916189739 * rsInterface.index == 5) {
										Class126 var46 = rsInterface
												.method1712(
														Class286.gameRenderer,
														1272478299);
										if (null == var46) {
											continue;
										}

										if (mouseX >= var15 && mouseY >= var16
												&& mouseX < width
												&& mouseY < height) {
											moveX = var46.anIntArray_2368[newY];
											moveY = var46.anIntArray_2366[newY];
										}
									}

									if (0 != Class192.anInt_3351 * 1049318505
											&& 3 != Class192.anInt_3351 * 1049318505
											|| Class18.optionsClosed
											|| mouseX < var15 || mouseY < var16
											|| mouseX >= width || mouseY >= height
											|| newX < moveX
											|| newX > moveY + moveX) {
										continue;
									}

									newX -= -533669195 * rsInterface.width / 2;
									newY -= 1833812087 * rsInterface.height / 2;
									if (4 == Class509.anInt_9182 * 1735950531) {
										var55 = (int) aFloat_501 & 16383;
									} else if (Class509.anInt_9182 * 1735950531 == 2) {
										var55 = (int) ((double) Class542.aClass43_Sub1_9475
												.method394(-1962301117) * 2607.5945876176133D);
									} else {
										var55 = (int) aFloat_501 + -517467801
												* anInt_378 & 16383;
									}

									int var53 = Class362.cosArray[var55];
									int var30 = Class362.sinArray[var55];
									if (4 != Class509.anInt_9182 * 1735950531) {
										var53 = (256 + anInt_380 * 1121098075)
												* var53 >> 8;
										var30 = (1121098075 * anInt_380 + 256)
												* var30 >> 8;
									}

									int var31 = var53 * newY + var30 * newX >> 14;
									int var32 = var30 * newY - var53 * newX >> 14;
									int var34;
									int var33;
									if (Class509.anInt_9182 * 1735950531 == 4) {
										var33 = (anInt_385 * -1782602441 >> 9)
												+ (var31 >> 2);
										var34 = (anInt_534 * -1112038629 >> 9)
												- (var32 >> 2);
									} else {
										int var35 = (Class521.myPlayer
												.method3257() - 1) * 256;
										GameCoord var36 = Class521.myPlayer
												.method6203().gameCoord;
										var33 = ((int) var36.floatX - var35 >> 9)
												+ (var31 >> 2);
										var34 = ((int) var36.floatZ - var35 >> 9)
												- (var32 >> 2);
									}

									if (aBoolean_463
											&& (Class286.anInt_4823 * 1458447745 & 64) != 0) {
										RSInterface var58 = DrawingTarget
												.method2201(
														2036107931 * Class283_Sub3.anInt_7897,
														-315969483 * anInt_543,
														(byte) 66);
										if (var58 != null) {
											Class343.genAndAddOption(
													selectedOption,
													" " + Class8.optionPointer,
													CacheFileID.anInt_2037
															* -1863856065,
													59,
													2142376247 * rsInterface.itemID,
													1L,
													var33,
													var34,
													true,
													false,
													(long) (rsInterface.anInt_2428
															* -1001687885 << 32 | rsInterface.cacheID * 1278853609),
													true, (byte) 58);
										} else {
											Class537.method6073(1910915893);
										}
										continue;
									}

									if (currentGamePack == GamePack.stellardawnPack) {
										Class343.genAndAddOption(
												ServerString.faceHereStr
														.getText(
																Class599.clientLanguage,
																-2036076402),
												"", -1, 60, -1, 1L, var33,
												var34, true, false, 0L, true,
												(byte) 82);
									}

									Class343.genAndAddOption(
											Class343.walkHereString, "",
											277013513 * anInt_453, 23, -1, 1L,
											var33, var34, true, false, 0L,
											true, (byte) 55);
									continue;
								}

								if (rsInterface.type * 691513007 == -942072551
										* RSInterface.worldMapInterface) {
									Class203.aClass132_3532 = rsInterface;
									if (var41) {
										Class248_Sub1.aBoolean_6448 = true;
									}

									if (clicked) {
										moveX = (int) ((double) (mouseNode
												.getMouseX((byte) -95) - x - -533669195
												* rsInterface.width / 2) * 2.0D / (double) Class248.mapZoomScaleX);
										moveY = (int) (-((double) (mouseNode
												.getMouseY(-1747378508) - y - 1833812087 * rsInterface.height / 2) * 2.0D / (double) Class248.mapZoomScaleX));
										newX = Class248.anInt_4120
												+ -1850250531
												* Class107.viewOfMapImageX
												+ moveX;
										newY = AbstractUpdateServerConnector.viewOfMapImageY
												* 1377436059
												+ moveY
												+ Class248.anInt_4124;
										MapOverviewNode var48 = Class605
												.method6516(1851902930);
										if (var48 == null) {
											continue;
										}

										int[] var29 = new int[3];
										var48.method2573(newX, newY, var29,
												(byte) 16);
										if (null != var29) {
											if (Class223.captureKeyboardList
													.method3208(82, 1953407658)
													&& -268988889 * anInt_507 > 0) {
												Class636.method6721(var29[0],
														var29[1], var29[2],
														(byte) -63);
												continue;
											}

											aBoolean_495 = true;
											Class55.anInt_1087 = var29[0]
													* -1912589365;
											Class104_Sub21.anInt_10737 = 1022672753 * var29[1];
											Class239.anInt_4044 = var29[2] * 975891627;
										}

										anInt_493 = -1445855961;
										aBoolean_494 = false;
										anInt_481 = Class53.captureMouseList
												.getCaptureMouseX() * 1633762233;
										anInt_287 = Class53.captureMouseList
												.getCaptureMouseY()
												* -1761448785;
										continue;
									}

									if (var42 && anInt_493 * -836263273 > 0) {
										if (1 == -836263273 * anInt_493
												&& (2142788233 * anInt_481 != Class53.captureMouseList
														.getCaptureMouseX() || -1094686129
														* anInt_287 != Class53.captureMouseList
														.getCaptureMouseY())) {
											Class436.anInt_8383 = Class107.viewOfMapImageX
													* -1152426095;
											Class50.anInt_1051 = -1885139447
													* AbstractUpdateServerConnector.viewOfMapImageY;
											anInt_493 = 1403255374;
										}

										if (2 == -836263273 * anInt_493) {
											aBoolean_494 = true;
											Class240_Sub11
													.method4601(
															-1062254451
																	* Class436.anInt_8383
																	+ (int) ((double) (2142788233 * anInt_481 - Class53.captureMouseList
																			.getCaptureMouseX()) * 2.0D / (double) Class248.mapZoomScaleY),
															1771567065);
											Class223.method2806(
													896531331
															* Class50.anInt_1051
															- (int) ((double) (-1094686129
																	* anInt_287 - Class53.captureMouseList
																		.getCaptureMouseY()) * 2.0D / (double) Class248.mapZoomScaleY),
													478547404);
										}
										continue;
									}

									if (anInt_493 * -836263273 > 0
											&& !aBoolean_494) {
										if ((anInt_458 * 555842189 == 1 || Class48
												.method490((byte) -61))
												&& -740020991
														* Class18.optionCount > 2) {
											CacheDataUnpacker.method3595(
													anInt_481 * 2142788233,
													anInt_287 * -1094686129,
													(short) 128);
										} else if (Class204
												.method2602(-594595518)) {
											CacheDataUnpacker.method3595(
													2142788233 * anInt_481,
													-1094686129 * anInt_287,
													(short) 128);
										}
									}

									anInt_493 = 0;
									continue;
								}

								if (rsInterface.type * 691513007 == RSInterface.anInt_2411
										* -2058031703) {
									if (var42) {
										Class490.method5751(
												Class53.captureMouseList
														.getCaptureMouseX()
														- x,
												Class53.captureMouseList
														.getCaptureMouseY()
														- y,
												rsInterface.width * -533669195,
												rsInterface.height * 1833812087,
												-2068976198);
									}
									continue;
								}

								if (RSInterface.anInt_2413 * 407909271 == 691513007 * rsInterface.type) {
									Class71.method821(rsInterface, x,
											y, 1382672152);
									continue;
								}
							}

							if (!rsInterface.aBoolean_2582 && clicked) {
								rsInterface.aBoolean_2582 = true;
								if (rsInterface.anObjectArray_2526 != null) {
									var44 = new Class240_Sub17();
									var44.aBoolean_6908 = true;
									var44.aClass132_6903 = rsInterface;
									var44.anInt_6904 = (mouseNode
											.getMouseX((byte) -28) - x)
											* -135352163;
									var44.anInt_6905 = (mouseNode
											.getMouseY(1097144481) - y)
											* -1157510991;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2526;
									aNodeList_518.addNode(var44, (short) 27114);
								}
							}

							if (rsInterface.aBoolean_2582 && var42
									&& rsInterface.anObjectArray_2527 != null) {
								var44 = new Class240_Sub17();
								var44.aBoolean_6908 = true;
								var44.aClass132_6903 = rsInterface;
								var44.anInt_6904 = (Class53.captureMouseList
										.getCaptureMouseX() - x)
										* -135352163;
								var44.anInt_6905 = (Class53.captureMouseList
										.getCaptureMouseY() - y)
										* -1157510991;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2527;
								aNodeList_518.addNode(var44, (short) -12644);
							}

							if (rsInterface.aBoolean_2582 && !var42) {
								rsInterface.aBoolean_2582 = false;
								if (rsInterface.anObjectArray_2528 != null) {
									var44 = new Class240_Sub17();
									var44.aBoolean_6908 = true;
									var44.aClass132_6903 = rsInterface;
									var44.anInt_6904 = (Class53.captureMouseList
											.getCaptureMouseX() - x)
											* -135352163;
									var44.anInt_6905 = (Class53.captureMouseList
											.getCaptureMouseY() - y)
											* -1157510991;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2528;
									aNodeList_520.addNode(var44, (short) 2300);
								}
							}

							if (var42 && rsInterface.anObjectArray_2529 != null) {
								var44 = new Class240_Sub17();
								var44.aBoolean_6908 = true;
								var44.aClass132_6903 = rsInterface;
								var44.anInt_6904 = (Class53.captureMouseList
										.getCaptureMouseX() - x)
										* -135352163;
								var44.anInt_6905 = (Class53.captureMouseList
										.getCaptureMouseY() - y)
										* -1157510991;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2529;
								aNodeList_518.addNode(var44, (short) 3922);
							}

							if (!rsInterface.aBoolean_2465 && var41) {
								rsInterface.aBoolean_2465 = true;
								if (null != rsInterface.anObjectArray_2530) {
									var44 = new Class240_Sub17();
									var44.aBoolean_6908 = true;
									var44.aClass132_6903 = rsInterface;
									var44.anInt_6904 = (Class53.captureMouseList
											.getCaptureMouseX() - x)
											* -135352163;
									var44.anInt_6905 = (Class53.captureMouseList
											.getCaptureMouseY() - y)
											* -1157510991;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2530;
									aNodeList_518.addNode(var44, (short) -9219);
								}
							}

							if (rsInterface.aBoolean_2465 && var41
									&& null != rsInterface.anObjectArray_2531) {
								var44 = new Class240_Sub17();
								var44.aBoolean_6908 = true;
								var44.aClass132_6903 = rsInterface;
								var44.anInt_6904 = (Class53.captureMouseList
										.getCaptureMouseX() - x)
										* -135352163;
								var44.anInt_6905 = (Class53.captureMouseList
										.getCaptureMouseY() - y)
										* -1157510991;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2531;
								aNodeList_518.addNode(var44, (short) -26139);
							}

							if (rsInterface.aBoolean_2465 && !var41) {
								rsInterface.aBoolean_2465 = false;
								if (null != rsInterface.anObjectArray_2532) {
									var44 = new Class240_Sub17();
									var44.aBoolean_6908 = true;
									var44.aClass132_6903 = rsInterface;
									var44.anInt_6904 = (Class53.captureMouseList
											.getCaptureMouseX() - x)
											* -135352163;
									var44.anInt_6905 = (Class53.captureMouseList
											.getCaptureMouseY() - y)
											* -1157510991;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2532;
									aNodeList_520
											.addNode(var44, (short) -13652);
								}
							}

							if (null != rsInterface.anObjectArray_2549) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2549;
								aNodeList_369.addNode(var44, (short) 3669);
							}

							Class240_Sub17 var54;
							if (rsInterface.anObjectArray_2543 != null
									&& anInt_506 * -643952161 > rsInterface.anInt_2587
											* -1940384835) {
								if (rsInterface.anIntArray_2544 != null
										&& -643952161 * anInt_506
												- rsInterface.anInt_2587
												* -1940384835 <= 32) {
									label801: for (moveX = rsInterface.anInt_2587
											* -1940384835; moveX < anInt_506
											* -643952161; ++moveX) {
										moveY = anIntArray_505[moveX & 31];

										for (newX = 0; newX < rsInterface.anIntArray_2544.length; ++newX) {
											if (moveY == rsInterface.anIntArray_2544[newX]) {
												var54 = new Class240_Sub17();
												var54.aClass132_6903 = rsInterface;
												var54.anObjectArray_6907 = rsInterface.anObjectArray_2543;
												aNodeList_518.addNode(var54,
														(short) 17397);
												break label801;
											}
										}
									}
								} else {
									var44 = new Class240_Sub17();
									var44.aClass132_6903 = rsInterface;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2543;
									aNodeList_518.addNode(var44, (short) 17135);
								}

								rsInterface.anInt_2587 = -372160565 * anInt_506;
							}

							if (null != rsInterface.anObjectArray_2406
									&& -1975842119 * anInt_508 > -1126911031
											* rsInterface.anInt_2534) {
								if (null != rsInterface.anIntArray_2546
										&& -1975842119 * anInt_508
												- -1126911031
												* rsInterface.anInt_2534 <= 32) {
									label782: for (moveX = rsInterface.anInt_2534
											* -1126911031; moveX < -1975842119
											* anInt_508; ++moveX) {
										moveY = anIntArray_583[moveX & 31];

										for (newX = 0; newX < rsInterface.anIntArray_2546.length; ++newX) {
											if (rsInterface.anIntArray_2546[newX] == moveY) {
												var54 = new Class240_Sub17();
												var54.aClass132_6903 = rsInterface;
												var54.anObjectArray_6907 = rsInterface.anObjectArray_2406;
												aNodeList_518.addNode(var54,
														(short) -20152);
												break label782;
											}
										}
									}
								} else {
									var44 = new Class240_Sub17();
									var44.aClass132_6903 = rsInterface;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2406;
									aNodeList_518.addNode(var44, (short) 13570);
								}

								rsInterface.anInt_2534 = anInt_508 * 1354479473;
							}

							if (rsInterface.anObjectArray_2539 != null
									&& anInt_500 * 691618587 > rsInterface.anInt_2584
											* -191257665) {
								if (null != rsInterface.anIntArray_2538
										&& anInt_500 * 691618587
												- rsInterface.anInt_2584
												* -191257665 <= 32) {
									label763: for (moveX = rsInterface.anInt_2584
											* -191257665; moveX < 691618587 * anInt_500; ++moveX) {
										moveY = anIntArray_347[moveX & 31];

										for (newX = 0; newX < rsInterface.anIntArray_2538.length; ++newX) {
											if (moveY == rsInterface.anIntArray_2538[newX]) {
												var54 = new Class240_Sub17();
												var54.aClass132_6903 = rsInterface;
												var54.anObjectArray_6907 = rsInterface.anObjectArray_2539;
												aNodeList_518.addNode(var54,
														(short) -1655);
												break label763;
											}
										}
									}
								} else {
									var44 = new Class240_Sub17();
									var44.aClass132_6903 = rsInterface;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2539;
									aNodeList_518.addNode(var44, (short) 21097);
								}

								rsInterface.anInt_2584 = 627541925 * anInt_500;
							}

							if (rsInterface.anObjectArray_2554 != null
									&& anInt_278 * 1494744909 > rsInterface.anInt_2585 * 2112014137) {
								if (rsInterface.anIntArray_2474 != null
										&& 1494744909 * anInt_278
												- rsInterface.anInt_2585
												* 2112014137 <= 32) {
									label744: for (moveX = rsInterface.anInt_2585 * 2112014137; moveX < 1494744909 * anInt_278; ++moveX) {
										moveY = anIntArray_341[moveX & 31];

										for (newX = 0; newX < rsInterface.anIntArray_2474.length; ++newX) {
											if (moveY == rsInterface.anIntArray_2474[newX]) {
												var54 = new Class240_Sub17();
												var54.aClass132_6903 = rsInterface;
												var54.anObjectArray_6907 = rsInterface.anObjectArray_2554;
												aNodeList_518.addNode(var54,
														(short) 3526);
												break label744;
											}
										}
									}
								} else {
									var44 = new Class240_Sub17();
									var44.aClass132_6903 = rsInterface;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2554;
									aNodeList_518.addNode(var44, (short) 12964);
								}

								rsInterface.anInt_2585 = anInt_278 * 1803961525;
							}

							if (rsInterface.anObjectArray_2548 != null
									&& anInt_361 * -816585473 > -1479957543
											* rsInterface.anInt_2455) {
								if (rsInterface.anIntArray_2566 != null
										&& anInt_361 * -816585473
												- rsInterface.anInt_2455
												* -1479957543 <= 32) {
									label725: for (moveX = rsInterface.anInt_2455
											* -1479957543; moveX < -816585473
											* anInt_361; ++moveX) {
										moveY = anIntArray_503[moveX & 31];

										for (newX = 0; newX < rsInterface.anIntArray_2566.length; ++newX) {
											if (moveY == rsInterface.anIntArray_2566[newX]) {
												var54 = new Class240_Sub17();
												var54.aClass132_6903 = rsInterface;
												var54.anObjectArray_6907 = rsInterface.anObjectArray_2548;
												aNodeList_518.addNode(var54,
														(short) 18710);
												break label725;
											}
										}
									}
								} else {
									var44 = new Class240_Sub17();
									var44.aClass132_6903 = rsInterface;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2548;
									aNodeList_518.addNode(var44, (short) 14772);
								}

								rsInterface.anInt_2455 = anInt_361 * 857620631;
							}

							if (null != rsInterface.anObjectArray_2414
									&& anInt_510 * 1004601249 > rsInterface.anInt_2589 * 1688353037) {
								if (null != rsInterface.anIntArray_2581
										&& 1004601249 * anInt_510
												- rsInterface.anInt_2589
												* 1688353037 <= 32) {
									label706: for (moveX = rsInterface.anInt_2589 * 1688353037; moveX < anInt_510 * 1004601249; ++moveX) {
										moveY = anIntArray_509[moveX & 31];

										for (newX = 0; newX < rsInterface.anIntArray_2581.length; ++newX) {
											if (rsInterface.anIntArray_2581[newX] == moveY) {
												var54 = new Class240_Sub17();
												var54.aClass132_6903 = rsInterface;
												var54.anObjectArray_6907 = rsInterface.anObjectArray_2414;
												aNodeList_518.addNode(var54,
														(short) 1350);
												break label706;
											}
										}
									}
								} else {
									var44 = new Class240_Sub17();
									var44.aClass132_6903 = rsInterface;
									var44.anObjectArray_6907 = rsInterface.anObjectArray_2414;
									aNodeList_518.addNode(var44, (short) -9201);
								}

								rsInterface.anInt_2589 = -1398271003
										* anInt_510;
							}

							if (374952581 * anInt_511 > rsInterface.anInt_2583
									* -1132722645
									&& null != rsInterface.anObjectArray_2553) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2553;
								aNodeList_518.addNode(var44, (short) -3510);
							}

							if (-2117897535 * anInt_512 > rsInterface.anInt_2583
									* -1132722645
									&& null != rsInterface.anObjectArray_2555) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2555;
								aNodeList_518.addNode(var44, (short) 4319);
							}

							if (-723794033 * anInt_513 > -1132722645
									* rsInterface.anInt_2583
									&& null != rsInterface.anObjectArray_2556) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2556;
								aNodeList_518.addNode(var44, (short) -25262);
							}

							if (1277327387 * anInt_576 > rsInterface.anInt_2583
									* -1132722645
									&& rsInterface.anObjectArray_2507 != null) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2507;
								aNodeList_518.addNode(var44, (short) -1695);
							}

							if (-876497973 * anInt_515 > -1132722645
									* rsInterface.anInt_2583
									&& null != rsInterface.anObjectArray_2558) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2558;
								aNodeList_518.addNode(var44, (short) 13276);
							}

							if (anInt_516 * -905067555 > rsInterface.anInt_2583
									* -1132722645
									&& rsInterface.anObjectArray_2560 != null) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2560;
								aNodeList_518.addNode(var44, (short) 7723);
							}

							if (anInt_517 * 419668951 > rsInterface.anInt_2583
									* -1132722645
									&& null != rsInterface.interfaceData) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.interfaceData;
								aNodeList_518.addNode(var44, (short) 21265);
							}

							rsInterface.anInt_2583 = anInt_413 * -1811388833;
							if (null != rsInterface.anObjectArray_2541) {
								for (moveX = 0; moveX < 232284759 * anInt_483; ++moveX) {
									Class240_Sub17 var56 = new Class240_Sub17();
									var56.aClass132_6903 = rsInterface;
									var56.anInt_6901 = aClass233Array_360[moveX]
											.method2971(-16711936) * -381034743;
									var56.anInt_6902 = aClass233Array_360[moveX]
											.method2984(1576456714) * 691756649;
									var56.anObjectArray_6907 = rsInterface.anObjectArray_2541;
									aNodeList_518.addNode(var56, (short) 25285);
								}
							}

							if (aBoolean_407
									&& null != rsInterface.anObjectArray_2563) {
								var44 = new Class240_Sub17();
								var44.aClass132_6903 = rsInterface;
								var44.anObjectArray_6907 = rsInterface.anObjectArray_2563;
								aNodeList_518.addNode(var44, (short) 2552);
							}
						}

						if (5 == rsInterface.index * 1916189739
								&& rsInterface.anInt_2513 * 1948781599 != -1) {
							rsInterface
									.method1709(Class585.aClass236_9731,
											Class598.aClass44_9877, 677573914)
									.method3688(
											Class286.gameRenderer,
											1833812087 * rsInterface.height,
											Class104_Sub21.renderSettings.aClass540_Sub6_7305
													.method1559(1966296895),
											(byte) -70);
						}

						Class215.method2701(rsInterface, 1174347574);
						if (0 == rsInterface.index * 1916189739) {
							method173(var0, var1,
									1278853609 * rsInterface.cacheID, var15,
									var16, width, height, x
											- rsInterface.scrollX
											* -340277309, y
											- rsInterface.scrollY
											* -978526293, mouseX, mouseY);
							if (rsInterface.children != null) {
								method173(var0,
										rsInterface.children,
										rsInterface.cacheID * 1278853609,
										var15, var16, width, height, x
												- -340277309
												* rsInterface.scrollX, y
												- -978526293
												* rsInterface.scrollY, mouseX,
										mouseY);
							}

							Class240_Sub16 var60 = (Class240_Sub16) widgets
									.getNode((long) (rsInterface.cacheID * 1278853609));
							if (var60 != null) {
								if (currentGamePack == GamePack.runescapePack
										&& 0 == 270505159 * var60.anInt_6897
										&& !Class18.optionsClosed && var41
										&& !aBoolean_365) {
									ByteArrayDataNode.method4543((byte) 91);
								}

								AbstractCacheData.method4676(var60,
										1320796941 * var60.widgetID, var15,
										var16, width, height, x - -340277309
												* rsInterface.scrollX, y
												- rsInterface.scrollY
												* -978526293, mouseX, mouseY,
										(byte) 16);
							}
						}
					}
				}
			}
		}

	}

	public static Class240_Sub49 method174(RSInterface var0) {
		Class240_Sub49 var1 = (Class240_Sub49) aNodeArrayList_521
				.getNode((long) (-1001687885 * var0.anInt_2428)
						+ ((long) (1278853609 * var0.cacheID) << 32));
		return var1 != null ? var1 : var0.aClass240_Sub49_2504;
	}

	static RSInterface method175(RSInterface var0) {
		Class240_Sub49 var1 = method174(var0);
		if (var1.method4996((byte) 86)) {
			return Class107.aClass132_1992;
		} else {
			int var2 = var1.method4994(-1394684433);
			if (0 == var2) {
				return null;
			} else {
				for (int var3 = 0; var3 < var2; ++var3) {
					var0 = Class322.method3967(Class240_Sub22_Sub4.method592(
							1278853609 * var0.cacheID, 66273112), var0,
							-993751756);
					if (var0 == null) {
						return Class107.aClass132_1992;
					}
				}

				return var0;
			}
		}
	}

	static {
		for (int var0 = 0; var0 < 112; ++var0) {
			aRectangleArray_527[var0] = new Rectangle();
		}

		anInt_528 = 0;
		anIntArray_529 = new int[4];
		chatMessagesCount = 0;
		maxChatMessagesVisible = 1026339138;
		chatMessagesX = new int[maxChatMessagesVisible * 1119990587];
		chatMessagesY = new int[maxChatMessagesVisible * 1119990587];
		anIntArray_440 = new int[maxChatMessagesVisible * 1119990587];
		screenChatArray = new ScreenCharText[1119990587 * maxChatMessagesVisible];
		anIntArray_536 = new int[] { 16776960, 16711680, '\uff00', '\uffff',
				16711935, 16777215 };
		anInt_460 = 0;
		anInt_538 = 0;
		aLongArray_573 = new long[100];
		anInt_541 = 0;
		aString_542 = null;
		aString_519 = null;
		aClass301Array_286 = new Class301[6];
		anInt_441 = 0;
		aClass7_546 = new Class7();
		aBooleanArray_548 = new boolean[5];
		anIntArray_417 = new int[5];
		anIntArray_550 = new int[5];
		anIntArray_355 = new int[5];
		anIntArray_464 = new int[5];
		aShort_414 = 256;
		aShort_554 = 205;
		aShort_404 = 256;
		aShort_556 = 320;
		aShort_557 = 1;
		aShort_558 = 32767;
		aShort_462 = 1;
		aShort_560 = 32767;
		anInt_561 = 0;
		anInt_562 = 0;
		anInt_563 = 0;
		anInt_564 = 0;
		anInt_565 = 0;
		friendsCount = 0;
		anInt_567 = 0;
		friendsList = new FriendPlayer[200];
		aClass512_496 = new Class512();
		ignoreListCount = 0;
		ignoreList = new IgnoredPlayer[100];
		aCalendar_574 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		aClass264_482 = new Class5();
		aLong_585 = -5460585108702965381L;
		aLong_471 = -7359738182693077975L;
		anIntArray_594 = new int[4];
	}

	static final void method176() {
		anInt_412 = 0;

		for (int var0 = 0; var0 < availableNPCS * 1636714459; ++var0) {
			NPC var1 = (NPC) ((Class240_Sub9) npcNodeList
					.getNode((long) npcIndices[var0])).anObject_6783;
			if (var1.aBoolean_4296 && var1.method3263(1335784010) != -1) {
				int var2 = (var1.method3257() - 1) * 256 + 252;
				GameCoord var3 = var1.method6203().gameCoord;
				int var4 = (int) var3.floatX - var2 >> 9;
				int var5 = (int) var3.floatZ - var2 >> 9;
				RSCharacter var6 = ItemProfile.method5532(var1.plane, var4,
						var5, 731678778);
				if (var6 != null) {
					int var7 = var6.index * 50743311;
					if (var6 instanceof NPC) {
						var7 += 2048;
					}

					if (0 == var6.anInt_4344 * 313863401
							&& var6.method3263(1327945980) != -1) {
						anIntArray_410[-1311811361 * anInt_412] = var7;
						anIntArray_411[anInt_412 * -1311811361] = var7;
						anInt_412 += -1707449569;
						var6.anInt_4344 += 2089708377;
					}

					anIntArray_410[-1311811361 * anInt_412] = var7;
					anIntArray_411[anInt_412 * -1311811361] = var1.index * 50743311 + 2048;
					anInt_412 += -1707449569;
					var6.anInt_4344 += 2089708377;
				}
			}
		}

		Exception_Sub3.method1361(anIntArray_411, anIntArray_410, 0, anInt_412
				* -1311811361 - 1, (byte) 48);
	}

	static final void method177(int var0) {
		int var1 = -688404505 * Class15.availablePlayers;
		int[] var2 = Class15.playersIndices;
		int[][] var3 = aClass296_348.method3756(-2060673200);
		int[][] var4 = aClass296_348.method3757((byte) -4);
		int var5;
		if (415041591 * anInt_356 == 1) {
			var5 = Class95.aClass100Array_1894.length;
		} else {
			var5 = aBoolean_308 ? var1 : var1 + availableNPCS * 1636714459;
		}

		for (int var6 = 0; var6 < var5; ++var6) {
			Object var8;
			if (1 == 415041591 * anInt_356) {
				Class100 var7 = Class95.aClass100Array_1894[var6];
				if (!var7.aBoolean_1952) {
					continue;
				}

				var8 = var7.getTarget((byte) 72);
			} else {
				if (var6 < var1) {
					var8 = aPlayerArray[var2[var6]];
				} else {
					var8 = (RSCharacter) ((Class240_Sub9) npcNodeList
							.getNode((long) npcIndices[var6 - var1])).anObject_6783;
				}

				if (var0 != ((RSCharacter) var8).plane) {
					continue;
				}

				if (-1825240475 * ((RSCharacter) var8).anInt_4299 < 0) {
					((RSCharacter) var8).aBoolean_4296 = false;
					continue;
				}
			}

			((RSCharacter) var8).anInt_4344 = 0;
			int var17 = ((RSCharacter) var8).method3257();
			GameCoord var9 = ((RSCharacter) var8).method6203().gameCoord;
			if (0 == (var17 & 1)) {
				if (0 != ((int) var9.floatX & 511)
						|| 0 != ((int) var9.floatZ & 511)) {
					((RSCharacter) var8).aBoolean_4296 = false;
					continue;
				}
			} else if (256 != ((int) var9.floatX & 511)
					|| ((int) var9.floatZ & 511) != 256) {
				((RSCharacter) var8).aBoolean_4296 = false;
				continue;
			}

			if (415041591 * anInt_356 != 1) {
				int var10;
				int var11;
				if (var17 == 1) {
					var10 = (int) var9.floatX >> 9;
					var11 = (int) var9.floatZ >> 9;
					if (var3[var10][var11] != -1825240475
							* ((RSCharacter) var8).anInt_4299) {
						((RSCharacter) var8).aBoolean_4296 = true;
						continue;
					}

					if (var4[var10][var11] > 1) {
						--var4[var10][var11];
						((RSCharacter) var8).aBoolean_4296 = true;
						continue;
					}
				} else {
					var10 = 256 * (var17 - 1) + 252;
					var11 = (int) var9.floatX - var10 >> 9;
					int var12 = (int) var9.floatZ - var10 >> 9;
					int var13 = (int) var9.floatX + var10 >> 9;
					int var14 = var10 + (int) var9.floatZ >> 9;
					if (!GamePack.method5984(var3, var4, -1825240475
							* ((RSCharacter) var8).anInt_4299, var11, var12,
							var13, var14, 437533992)) {
						for (int var15 = var11; var15 <= var13; ++var15) {
							for (int var16 = var12; var16 <= var14; ++var16) {
								if (((RSCharacter) var8).anInt_4299
										* -1825240475 == var3[var15][var16]) {
									--var4[var15][var16];
								}
							}
						}

						((RSCharacter) var8).aBoolean_4296 = true;
						continue;
					}
				}
			}

			((RSCharacter) var8).aBoolean_4296 = false;
			((RSCharacter) var8).setPosition(var9.floatX,
					(float) CompProfile.getHeight((int) var9.floatX,
							(int) var9.floatZ, ((RSCharacter) var8).plane),
					var9.floatZ);
			aClass296_348.getWorldObjects().method3455((PositionEntity) var8,
					true, 1872676247);
		}

	}

	static final void method178(int var0) {
		int var1 = Class15.availablePlayers * -688404505;
		int[] var2 = Class15.playersIndices;
		int[][] var3 = aClass296_348.method3756(-755461968);
		int[][] var4 = aClass296_348.method3757((byte) -17);
		int var5;
		if (1 == anInt_356 * 415041591) {
			var5 = Class95.aClass100Array_1894.length;
		} else {
			var5 = availableNPCS * 1636714459 + var1;
		}

		for (int var6 = 0; var6 < var5; ++var6) {
			Object var8;
			if (415041591 * anInt_356 == 1) {
				Class100 var7 = Class95.aClass100Array_1894[var6];
				if (!var7.aBoolean_1952) {
					continue;
				}

				var8 = var7.getTarget((byte) 98);
			} else {
				if (var6 < var1) {
					var8 = aPlayerArray[var2[var6]];
				} else {
					var8 = (RSCharacter) ((Class240_Sub9) npcNodeList
							.getNode((long) npcIndices[var6 - var1])).anObject_6783;
				}

				if (var0 != ((RSCharacter) var8).plane
						|| ((RSCharacter) var8).anInt_4299 * -1825240475 < 0) {
					continue;
				}
			}

			int var17 = ((RSCharacter) var8).method3257();
			GameCoord var9 = ((RSCharacter) var8).method6203().gameCoord;
			if ((var17 & 1) == 0) {
				if (((int) var9.floatX & 511) != 0
						|| ((int) var9.floatZ & 511) != 0) {
					continue;
				}
			} else if (((int) var9.floatX & 511) != 256
					|| ((int) var9.floatZ & 511) != 256) {
				continue;
			}

			int var10;
			int var11;
			if (1 == var17) {
				var10 = (int) var9.floatX >> 9;
				var11 = (int) var9.floatZ >> 9;
				if (-1825240475 * ((RSCharacter) var8).anInt_4299 > var3[var10][var11]) {
					var3[var10][var11] = ((RSCharacter) var8).anInt_4299
							* -1825240475;
					var4[var10][var11] = 1;
				} else if (((RSCharacter) var8).anInt_4299 * -1825240475 == var3[var10][var11]) {
					++var4[var10][var11];
				}
			} else {
				var10 = 256 * (var17 - 1) + 60;
				var11 = (int) var9.floatX - var10 >> 9;
				int var12 = (int) var9.floatZ - var10 >> 9;
				int var13 = (int) var9.floatX + var10 >> 9;
				int var14 = var10 + (int) var9.floatZ >> 9;

				for (int var15 = var11; var15 <= var13; ++var15) {
					for (int var16 = var12; var16 <= var14; ++var16) {
						if (((RSCharacter) var8).anInt_4299 * -1825240475 > var3[var15][var16]) {
							var3[var15][var16] = ((RSCharacter) var8).anInt_4299
									* -1825240475;
							var4[var15][var16] = 1;
						} else if (var3[var15][var16] == -1825240475
								* ((RSCharacter) var8).anInt_4299) {
							++var4[var15][var16];
						}
					}
				}
			}
		}

	}

	static boolean method179(RSInterface var0) {
		if (aBoolean_365) {
			if (method174(var0).anInt_7693 * -1992444447 != 0) {
				return false;
			}

			if (0 == 1916189739 * var0.index) {
				return false;
			}
		}

		return var0.hidden;
	}

	public final void init() {
		if (this.isRightHost((short) 4954)) {
			String var1 = "";
			ParameterNode[] var2 = ItemProfile
					.constructParameterNodes(-1278498341);

			for (int var3 = 0; var3 < var2.length; ++var3) {
				ParameterNode var4 = var2[var3];
				String var5 = Class481.clientApplet
						.getParameter(var4.parameterStringIndex);
				if (null != var5) {
					switch (Integer.parseInt(var4.parameterStringIndex)) {
					case 1:
						var1 = var5;
						break;
					case 2:
						currentGamePack = Class261.method3491(
								Integer.parseInt(var5), (byte) 14);
						if (GamePack.runescapePack == currentGamePack) {
							Class123.aClass436_2275 = Class436.aClass436_8380;
						} else {
							Class123.aClass436_2275 = Class436.aClass436_8379;
						}
						break;
					case 3:
						if (var5.equalsIgnoreCase(Class8.aString_35)) {
							aBoolean_419 = true;
						} else {
							aBoolean_419 = false;
						}
						break;
					case 4:
						if (var5.equals(Class8.aString_35)) {
							aBoolean_314 = true;
						} else {
							aBoolean_314 = false;
						}
						break;
					case 5:
						Class209.currentGameMode = (Class554) Class559
								.method6185(Class554.method6137(-1045140906),
										Integer.parseInt(var5), (byte) 34);
						if (Class554.aClass554_9533 == Class209.currentGameMode) {
							Class209.currentGameMode = Class554.aClass554_9530;
						} else if (!Class209.currentGameMode.method6136(
								Class572.aClass572_9654, 2100847766)
								&& Class209.currentGameMode != Class554.aClass554_9529) {
							Class209.currentGameMode = Class554.aClass554_9529;
						}
						break;
					case 6:
						Class228_Sub2.aString_7871 = var5;
						break;
					case 7:
						if (var5.equalsIgnoreCase(Class8.aString_35)) {
							aBoolean_452 = true;
						} else {
							aBoolean_452 = false;
						}
						break;
					case 8:
						anInt_275 = Integer.parseInt(var5) * 1575364329;
						break;
					case 9:
						if (var5.equalsIgnoreCase(Class8.aString_35)) {
							aBoolean_285 = true;
						} else {
							aBoolean_285 = false;
						}
						break;
					case 10:
						if (var5.equals(Class8.aString_35)) {
							aBoolean_479 = true;
						} else {
							aBoolean_479 = false;
						}
						break;
					case 11:
						anInt_289 = Integer.parseInt(var5) * -631936515;
						break;
					case 12:
						if (Class503.lobbyConnectionDesc == null) {
							Class503.lobbyConnectionDesc = new ConnectionDesc();
						}

						Class503.lobbyConnectionDesc.id = Integer
								.parseInt(var5) * -1268862903;
						break;
					case 13:
						aString_273 = var5;
						break;
					case 14:
						anInt_276 = Integer.parseInt(var5) * -1353431685;
						if (anInt_276 * 435081651 < 0
								|| 435081651 * anInt_276 >= aColorArray_323.length) {
							anInt_276 = 0;
						}
						break;
					case 15:
						Class174_Sub2.anInt_10979 = Integer.parseInt(var5)
								* -1639011263;
						break;
					case 16:
						Class503.aConnectionDesc_9109 = new ConnectionDesc();
						Class503.aConnectionDesc_9109.id = Integer
								.parseInt(var5) * -1268862903;
					case 17:
					case 27:
					case 33:
					case 37:
						break;
					case 18:
						Class50.aString_1052 = var5;
						break;
					case 19:
					default:
						CacheFileID.method1397("", new RuntimeException(),
								1969405216);
						break;
					case 20:
						anInt_326 = Integer.parseInt(var5) * -1109619291;
						break;
					case 21:
						if (var5.equalsIgnoreCase(Class8.aString_35)) {
							;
						}
						break;
					case 22:
						Class8.aString_42 = var5;
						break;
					case 23:
						aString_283 = var5;
						if (aString_283.length() > 100) {
							aString_283 = null;
						}
						break;
					case 24:
						if (var5.equalsIgnoreCase(Class8.aString_35)) {
							aBoolean_318 = true;
						} else {
							aBoolean_318 = false;
						}
						break;
					case 25:
						aString_290 = var5;
						break;
					case 26:
						Class49.currentGameType = Class104_Sub14.method7356(
								Integer.parseInt(var5), -1084233432);
						if (GameType.aClass510_9184 != Class49.currentGameType
								&& GameType.aClass510_9188 != Class49.currentGameType
								&& Class49.currentGameType != GameType.aClass510_9185
								&& Class49.currentGameType != GameType.aClass510_9186) {
							Class49.currentGameType = GameType.aClass510_9186;
						}
						break;
					case 28:
						anInt_274 = Integer.parseInt(var5) * 861893201;
						break;
					case 29:
						aString_587 = var5;
						break;
					case 30:
						if (var5.equalsIgnoreCase(Class8.aString_35)) {
							aBoolean_439 = true;
						}
						break;
					case 31:
						anInt_280 = Integer.parseInt(var5) * 205763987;
						break;
					case 32:
						aString_549 = var5;
						break;
					case 34:
						Class599.clientLanguage = LanguagePack.selectLanguage(
								Integer.parseInt(var5), -22020745);
						break;
					case 35:
						if (var5.equalsIgnoreCase(Class8.aString_35)) {
							aBoolean_319 = true;
						} else {
							aBoolean_319 = false;
						}
						break;
					case 36:
						if (null == Class503.lobbyConnectionDesc) {
							Class503.lobbyConnectionDesc = new ConnectionDesc();
						}

						Class503.lobbyConnectionDesc.hostIP = var5;
						break;
					case 38:
						if (null != var5) {
							aByteArray_595 = Class411.method5072(
									Class547.method6105(var5, 2107500237),
									(byte) 70);
							if (aByteArray_595.length < 16) {
								aByteArray_595 = null;
							}
						}
					}
				}
			}

			if (null == aString_273) {
				aString_273 = "";
			}

			GameDataHolder var6 = new GameDataHolder(anInt_343 * 688709465,
					759607001 * anInt_435, anInt_432 * -112505267,
					45254575 * anInt_433, currentGamePack.gameName);
			DamageAnimeLoader.gameClient = this;
			String var7 = Class49.currentGameType.runtype;
			int var8 = 1990054249 * Class49.currentGameType.id + 32;
			if (!var1.equals("")) {
				var7 = var7 + "_" + var1;
				var8 = 0;
			}

			this.method2856(var6, currentGamePack.gameID, var7, var8,
					Class416.getCacheFileCount(1658488452), 768, 1,
					aBoolean_419, 2141598419);
		}
	}

	public String method2883(int var1) {
		String var2 = " ";

		try {
			MapPoint var3 = aClass296_348.getMapArea();
			var2 = var2 + var3.loadedMapX * 1265321541 + Class8.commaStr
					+ var3.loadedMapY * -1996781083 + Class8.commaStr
					+ aClass296_348.getMaxX((byte) -65) + Class8.commaStr
					+ aClass296_348.getMaxY(-1046889086) + " ";
			if (null != Class521.myPlayer) {
				var2 = var2
						+ CacheFileID.anInt_2036
						* -763239015
						+ Class8.commaStr
						+ (Class521.myPlayer.tilePosArrayX[0] + var3.loadedMapX * 1265321541)
						+ Class8.commaStr
						+ (Class521.myPlayer.tilePosArrayY[0] + -1996781083
								* var3.loadedMapY) + " ";
			} else {
				var2 = var2 + CacheFileID.anInt_2036 * -763239015
						+ Class8.commaStr + -763239015 * CacheFileID.anInt_2036
						+ Class8.commaStr + -763239015 * CacheFileID.anInt_2036
						+ Class8.commaStr + " ";
			}

			var2 = var2
					+ Class104_Sub21.renderSettings.currentToolkit
							.getToolkitID()
					+ " "
					+ Class104_Sub21.renderSettings.aClass540_Sub27_7315
							.method4256(-2075078080) + " "
					+ Class445.method5491(1917504476) + " " + 1111410531
					* Class29.canvasWidth + Class8.commaStr + -75607525
					* Class597.canvasHeight + " ";
			var2 = var2
					+ Class104_Sub21.renderSettings.aClass540_Sub26_7308
							.method4199(508421023) + " ";
			var2 = var2
					+ Class104_Sub21.renderSettings.aClass540_Sub32_7303
							.method4388(-1458190617) + " ";
			var2 = var2
					+ Class104_Sub21.renderSettings.aClass540_Sub22_7310
							.method4061(808449442) + " ";
			var2 = var2
					+ Class104_Sub21.renderSettings.aClass540_Sub17_7299
							.method3986(1071102745) + " ";
			var2 = var2
					+ Class104_Sub21.renderSettings.aClass540_Sub16_7301
							.method1783(-1779494549) + " ";
			var2 = var2 + "0 ";
			var2 = var2 + -222937899 * maxMemory + " ";
			var2 = var2 + loginStage * -243034353 + " ";
			if (Class494.aClass240_Sub15_9037 != null) {
				var2 = var2 + 2057037889
						* Class494.aClass240_Sub15_9037.anInt_6891;
			} else {
				var2 = var2 + -1;
			}

			var2 = var2 + " ";
			if (null != aString_290) {
				var2 = var2 + aString_290;
			} else {
				var2 = var2 + Class8.commaStr;
			}
		} catch (Throwable var4) {
			;
		}

		return var2;
	}

	public static boolean method181(String var0, int var1, int var2) {
		return Class194.method2521(var0, var1, "openjs", -851403013);
	}

	public static void method182(int var0) {
		Class91.method1200(920602084);
		Class593.aClass585_Sub1_9812.method6352(-1785321659);
		Class593.aClass585_Sub2_9808.method6352(-1785321659);
		Class240_Sub27 var1;
		int var2;
		if (572469979 * anInt_321 > 0) {
			var1 = Class47_Sub1.method3496(Class326.aClass326_6242,
					gameConnectionHandler.aClass528_3433, 1917447504);
			var1.aClass240_Sub8_Sub1_7370.method4463(anInt_321 * -2005087380,
					1155742042);

			for (var2 = 0; var2 < anInt_321 * 572469979; ++var2) {
				Class233 var3 = aClass233Array_322[var2];
				long var4 = var3.method2970((byte) -22) - 4827713395991697589L
						* Class593.aLong_9809;
				if (var4 > 16777215L) {
					var4 = 16777215L;
				}

				Class593.aLong_9809 = var3.method2970((byte) -8)
						* -5336192216723270243L;
				var1.aClass240_Sub8_Sub1_7370.putByte(
						var3.method2971(-16711936), 1767008795);
				var1.aClass240_Sub8_Sub1_7370
						.method4465((int) var4, 1823385068);
			}

			gameConnectionHandler.addPacket(var1, 633512403);
		}

		if (Class593.anInt_9810 * -584324491 > 0) {
			Class593.anInt_9810 -= -1844505123;
		}

		if (aBoolean_395 && -584324491 * Class593.anInt_9810 <= 0) {
			Class593.anInt_9810 = 1764603204;
			aBoolean_395 = false;
			var1 = Class47_Sub1.method3496(Class326.aClass326_6253,
					gameConnectionHandler.aClass528_3433, 1917447504);
			var1.aClass240_Sub8_Sub1_7370.putShort((int) aFloat_387 >> 3,
					-1293902253);
			var1.aClass240_Sub8_Sub1_7370.putShort((int) aFloat_501 >> 3,
					-1852515607);
			gameConnectionHandler.addPacket(var1, 385511090);
		}

		if (AbstractCacheData.aBoolean_6915 != Class593.aBoolean_9811) {
			Class593.aBoolean_9811 = AbstractCacheData.aBoolean_6915;
			var1 = Class47_Sub1.method3496(Class326.aClass326_6277,
					gameConnectionHandler.aClass528_3433, 1917447504);
			var1.aClass240_Sub8_Sub1_7370.putByte(
					AbstractCacheData.aBoolean_6915 ? 1 : 0, 1734640187);
			gameConnectionHandler.addPacket(var1, 1496169300);
		}

		if (!aBoolean_568) {
			var1 = Class47_Sub1.method3496(Class326.aClass326_6256,
					gameConnectionHandler.aClass528_3433, 1917447504);
			var1.aClass240_Sub8_Sub1_7370.putByte(0, 1985837895);
			var2 = 964952859 * var1.aClass240_Sub8_Sub1_7370.index;
			ByteArrayDataNode var6 = Class104_Sub21.renderSettings
					.compileRenderSettings(851284816);
			var1.aClass240_Sub8_Sub1_7370.putBytes(var6.data, 0,
					var6.index * 964952859, -144707030);
			var1.aClass240_Sub8_Sub1_7370.method4521(964952859
					* var1.aClass240_Sub8_Sub1_7370.index - var2, -907432342);
			gameConnectionHandler.addPacket(var1, 385998069);
			aBoolean_568 = true;
		}

	}

	static final void method183(RSInterface var0, RSInterfaceGroup var1,
			RSInterfaceData var2, int var3) {
		var0.anInt_2448 = var2.intTypes[(var2.intTypeIndex -= -708028207)
				* -831324111] * 28449137;
		var0.anInt_2447 = var2.intTypes[(var2.intTypeIndex -= -708028207)
				* -831324111]
				* -968444331;
	}

	public static void main(String[] args) {
		client clientObj = new client();
		JFrame jf = new JFrame("RuneScape");
		Applet app = new Rs2Applet(clientObj);
		app.init();
		app.start();
		jf.add(app);
		jf.setVisible(true);
		jf.setPreferredSize(new Dimension(765, 553));
		jf.setSize(new Dimension(765, 553));
	}

}
