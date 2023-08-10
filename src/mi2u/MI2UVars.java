package mi2u;

import arc.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.scene.style.*;
import arc.scene.ui.*;
import arc.scene.ui.TextButton.*;
import arc.struct.*;
import arc.util.*;
import mi2u.ai.*;
import mi2u.ui.*;
import mindustry.ui.*;

public class MI2UVars{
    public static float titleButtonSize = 32f;
    public static TextButtonStyle textb = Styles.cleart, textbtoggle = Styles.flatToggleMenut;
    public static Cons<TextButton> funcSetTextb = c -> {
        c.getLabel().setAlignment(Align.center);
        c.getLabel().setWrap(false);
        c.margin(6f);
    };

    public static Drawable fadeBackground;

    public static Seq<Mindow2> mindow2s = new Seq<>();

    public static FullAI fullAI = new FullAI();

    public static MI2UI mi2ui = new MI2UI();
    public static EmojiMindow emojis = new EmojiMindow();
    public static CoreInfoMindow coreInfo = new CoreInfoMindow();
    public static LogicHelperMindow logicHelper = new LogicHelperMindow();
    public static CustomContainerMindow container = new CustomContainerMindow();
    public static MinimapMindow mindowmap = new MinimapMindow();
}