package mi2u;

import arc.graphics.*;
import arc.scene.style.*;
import arc.scene.ui.ImageButton.*;
import arc.scene.ui.TextButton.*;
import mindustry.gen.*;
import mindustry.ui.*;

import static mindustry.gen.Tex.underlineWhite;
import static mindustry.ui.Styles.*;

public class MI2UCustomUI{
    public static TextureRegionDrawable whiteuir;
    public static Drawable black1;

    public static TextButtonStyle
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

        clearLineNonet = new TextButtonStyle(flatt){{
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

}
