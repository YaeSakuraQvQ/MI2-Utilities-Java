package mi2u;

import arc.func.*;
import arc.graphics.*;
import arc.scene.style.*;
import arc.scene.ui.*;
import arc.scene.ui.ImageButton.*;
import arc.scene.ui.TextButton.*;
import arc.struct.*;
import arc.util.*;
import mi2u.ai.*;
import mi2u.ui.*;
import mindustry.gen.*;
import mindustry.ui.*;

import static mindustry.gen.Tex.underlineWhite;
import static mindustry.ui.Styles.*;

public class MI2UVars{
    public static float titleButtonSize = 32f;
    public static TextureRegionDrawable whiteuir;
    public static Drawable black1;

    public static TextButtonStyle
    textb = Styles.flatt, 
    textbtoggle = Styles.flatTogglet,
    flattt,
    clearLineNonet,
    clearLineNoneTogglet;

    public static void load(){
        whiteuir = (TextureRegionDrawable)Tex.whiteui;

        black1 = whiteuir.tint(0f, 0f, 0f, 0.1f);

        flattt = new TextButtonStyle(){{
            font = Fonts.def;
            fontColor = Color.white;
            down = flatOver;
            up = black;
            over = flatOver;
            disabled = black;
            disabledFontColor = Color.gray;
        }};

        clearLineNonet = new TextButtonStyle(flattt){{
            up = none;
            over = accentDrawable;
            down = underlineWhite;
        }};

        clearLineNoneTogglet = new TextButtonStyle(fullTogglet){{
            up = none;
            over = accentDrawable;
            down = underlineWhite;
            checked = underlineWhite;
            disabledFontColor = Color.white;
        }};
    }
    public static Cons<TextButton> funcSetTextb = c -> {
        c.getLabel().setAlignment(Align.center);
        c.getLabel().setWrap(false);
        c.margin(6f);
    };

    public static Seq<Mindow2> mindow2s = new Seq<>();

    public static FullAI fullAI = new FullAI();

    public static MI2UI mi2ui = new MI2UI();
    public static EmojiMindow emojis = new EmojiMindow();
    public static CoreInfoMindow coreInfo = new CoreInfoMindow();
    public static LogicHelperMindow logicHelper = new LogicHelperMindow();
    public static CustomContainerMindow container = new CustomContainerMindow();
    public static MinimapMindow mindowmap = new MinimapMindow();
}
