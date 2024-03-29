package lib.defines;

import lib.element.ElementSprite;

public interface SpriteDefines
{
	int BG_BELAKANG		= 0;
	int BG_TENGAH		= BG_BELAKANG + 1;
	int BG_DEPAN		= BG_TENGAH +1;
	int BG_FLOOR_DEPAN	= BG_DEPAN +1;
	int BG_POHON		= BG_FLOOR_DEPAN + 1;
	int BG_SEMAK		= BG_POHON + 1;
	int POINTER			= BG_SEMAK +1;
	int BIG_ROCK		= POINTER + 1;
	int SMALL_ROCK		= BIG_ROCK + 1;
	int HOLE			= SMALL_ROCK + 1;
	int TREE			= HOLE + 1;
	int MENU			= TREE + 1;
	int BUTTON_MENU		= MENU +1;
	int SPLASH			= BUTTON_MENU +1;
	int LOADINGBAR		= SPLASH +1;
	int BG_REPORT		= LOADINGBAR +1;
	int PLAY_BUTTON		= BG_REPORT +1;
	int PLAY_PUSH		= PLAY_BUTTON +1;
	int POCKET_BUTTON	= PLAY_PUSH +1;
	int POCKET_PUSH		= POCKET_BUTTON +1;
	int QUIT_BUTTON		= POCKET_PUSH +1;
	int QUIT_PUSH		= QUIT_BUTTON +1;
	
	/*
	 * Batu besar : 115x161
	 * Batu kecil : 80x55
	 * Pohon jatuh : 207x81
	 * Lebar lubang : 107
	 * */
	
	int backgroundHeight 	= GameEngineConfiguration.masterHeight;
	int backgroundWidth 	= GameEngineConfiguration.masterWidth;	
	
	int HEIGHTBUTTON		= 10;
	int WEIGHTBUTTON		= 10;
	
	int HEIGHTPUSHBUTTON	= (80/100) * HEIGHTBUTTON;
	int WEIGHTPUSHBUTTON	= (80/100) * WEIGHTBUTTON;
	
	public final static ElementSprite CONTAINER[] = 
	{
		//background define
		new ElementSprite(backgroundWidth, backgroundHeight, "gfx/gameplay/background/bg_belakang.png"),
		new ElementSprite(backgroundWidth, backgroundHeight, "gfx/gameplay/background/bg_tengah.png"),
		new ElementSprite(backgroundWidth, backgroundHeight, "gfx/gameplay/background/bg_depan.png"),
		new ElementSprite("gfx/gameplay/background/bg_floor_depan.png"),
		//object define
		new ElementSprite(250, 400, "gfx/gameplay/object/bg_pohon.png"),
		new ElementSprite(300, 200, "gfx/gameplay/object/bg_semak.png"),
		//define pointer
		new ElementSprite( 60, 106, "gfx/gameplay/player/pointer.png"),
		//obstacle define
		new ElementSprite(115, 161, "gfx/gameplay/obstacle/BATU BESAR.png"),
		new ElementSprite(80, 55, "gfx/gameplay/obstacle/BATU KECIL.png"),
		new ElementSprite("gfx/gameplay/obstacle/LOBANG.png"),
		new ElementSprite(207, 81, "gfx/gameplay/obstacle/POHON AMBRUK.png"),
		//menu define
		new ElementSprite("gfx/gameplay/menu/menu.png"),
		new ElementSprite( 55, 40,"gfx/gameplay/menu/button_menu.png"),
		//splash define
		new ElementSprite(backgroundWidth, backgroundHeight, "gfx/loading/splash.png"),
		new ElementSprite("gfx/loading/loading_bar.png"),
		//report define
		new ElementSprite(600, 300, "gfx/gameplay/report/bg_report.png"),
		new ElementSprite(69, 69, "gfx/gameplay/report/play_button.png"),
		new ElementSprite(65, 65, "gfx/gameplay/report/play_push.png"),
		new ElementSprite(69, 69, "gfx/gameplay/report/pocket_button.png"),
		new ElementSprite(65, 65, "gfx/gameplay/report/pocket_push.png"),
		new ElementSprite(69, 69, "gfx/gameplay/report/quit_button.png"),
		new ElementSprite(65, 65,  "gfx/gameplay/report/quit_push.png"),
	};
}