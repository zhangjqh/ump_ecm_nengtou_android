package wa.android.oaas;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 夏森海
 * 16/5/11
 */
public class WPSMenuViewDisableList  {
    public enum Names {

        VT_MENU_FILE,
        VT_MENU_VIEW,
        VT_MENU_EDIT,
        VT_MENU_INSERT,
        VT_MENU_REVIEW,
        VT_MENU_PEN,
        VT_MENU_FONT,
        VT_MENU_PARAGRAPH,
        VT_MENU_STYLE,
        VT_MENU_TABLE,
        VT_MENU_SHAPE,
        VT_FILE_SAVE,
        VT_FILE_SAVEAS,
        VT_FILE_SHARE,
        VT_FILE_ENCRYPT,
        VT_FILE_PRINT,
        VT_FILE_FILEINFO,
        VT_VIEW_READER,
        VT_VIEW_PAGELAYOUT,
        VT_VIEW_WEBLAYOUT,
        VT_VIEW_FIND,
        VT_VIEW_ALLBOOKBARKS,
        VT_WORDCOUNT,
        VT_VIEW_READINGSETTINGS,
        VT_EDIT_COPY,
        VT_EDIT_CUT,
        VT_EDIT_PASTE,
        VT_EDIT_FONT,
        VT_EDIT_PARAGRAPH,
        VT_EDIT_BULLETS,
        VT_EDIT_STYLE,
        VT_EDIT_PAGEBACKGROUND,
        VT_EDIT_PAGESETUP,
        VT_INSERT_PICTURE,
        VT_INSERT_TABLE,
        VT_INSERT_SHAPE,
        VT_COMMENT,
        VT_INSERT_PAGEBREAK,
        VT_INSERT_HEADERFOOTER,
        VT_INSERT_FIELD,
        VT_INSERT_PAGENUMBER,
        VT_INSERT_HYPERLINK,
        VT_INSERT_BOOKMARK,
        VT_INSERT_TEXTBOX,
        VT_INSERT_DATETIME,
        VT_INSERT_EVERNOTE,
        VT_REVIEW_SPELLCHECK,
        VT_REVIEW_COMMENTREVISE,
        VT_REVIEW_SHOW,
        VT_REVIEW_ENTERREVISEMODE,
        VT_REVIEW_EXITREVISEMODE,
        VT_REVIEW_ACCEPTALLREVISIONS,
        VT_REVIEW_REJECTALLREVISIONS,
        VT_REVIEW_MODIFY_USERNAME,
        VT_PEN_BYFINGER,
        VT_PEN_PEN,
        VT_PEN_HIGHLIGHTER,
        VT_PEN_ERASER,
        VT_PEN_COLOR,
        VT_PEN_THICKNESS
    }

    public boolean VT_MENU_FILE = false;
    public boolean VT_MENU_VIEW = false;
    public boolean VT_MENU_EDIT = false;
    public boolean VT_MENU_INSERT = false;
    public boolean VT_MENU_REVIEW = false;
    public boolean VT_MENU_PEN = false;
    public boolean VT_MENU_FONT = false;
    public boolean VT_MENU_PARAGRAPH = false;
    public boolean VT_MENU_STYLE = false;
    public boolean VT_MENU_TABLE = false;
    public boolean VT_MENU_SHAPE = false;
    public boolean VT_FILE_SAVE = false;
    public boolean VT_FILE_SAVEAS = false;
    public boolean VT_FILE_SHARE = false;
    public boolean VT_FILE_ENCRYPT = false;
    public boolean VT_FILE_PRINT = false;
    public boolean VT_FILE_FILEINFO = false;
    public boolean VT_VIEW_READER = false;
    public boolean VT_VIEW_PAGELAYOUT = false;
    public boolean VT_VIEW_WEBLAYOUT = false;
    public boolean VT_VIEW_FIND = false;
    public boolean VT_VIEW_ALLBOOKBARKS = false;
    public boolean VT_WORDCOUNT = false;
    public boolean VT_VIEW_READINGSETTINGS = false;
    public boolean VT_EDIT_COPY = false;
    public boolean VT_EDIT_CUT = false;
    public boolean VT_EDIT_PASTE = false;
    public boolean VT_EDIT_FONT = false;
    public boolean VT_EDIT_PARAGRAPH = false;
    public boolean VT_EDIT_BULLETS = false;
    public boolean VT_EDIT_STYLE = false;
    public boolean VT_EDIT_PAGEBACKGROUND = false;
    public boolean VT_EDIT_PAGESETUP = false;
    public boolean VT_INSERT_PICTURE = false;
    public boolean VT_INSERT_TABLE = false;
    public boolean VT_INSERT_SHAPE = false;
    public boolean VT_COMMENT = false;
    public boolean VT_INSERT_PAGEBREAK = false;
    public boolean VT_INSERT_HEADERFOOTER = false;
    public boolean VT_INSERT_FIELD = false;
    public boolean VT_INSERT_PAGENUMBER = false;
    public boolean VT_INSERT_HYPERLINK = false;
    public boolean VT_INSERT_BOOKMARK = false;
    public boolean VT_INSERT_TEXTBOX = false;
    public boolean VT_INSERT_DATETIME = false;
    public boolean VT_INSERT_EVERNOTE = false;
    public boolean VT_REVIEW_SPELLCHECK = false;
    public boolean VT_REVIEW_COMMENTREVISE = false;
    public boolean VT_REVIEW_SHOW = false;
    public boolean VT_REVIEW_ENTERREVISEMODE = false;
    public boolean VT_REVIEW_EXITREVISEMODE = false;
    public boolean VT_REVIEW_ACCEPTALLREVISIONS = false;
    public boolean VT_REVIEW_REJECTALLREVISIONS = false;
    public boolean VT_REVIEW_MODIFY_USERNAME = false;
    public boolean VT_PEN_BYFINGER = false;
    public boolean VT_PEN_PEN = false;
    public boolean VT_PEN_HIGHLIGHTER = false;
    public boolean VT_PEN_ERASER = false;
    public boolean VT_PEN_COLOR = false;
    public boolean VT_PEN_THICKNESS = false;


    public WPSMenuViewDisableList() {
    }

    public interface Itr {
        void callback(WPSMenuViewDisableList entry, String name, boolean value);
    }

    public void mapEntries(Itr itr) {
        for (Names ns : Names.values()) {
            String name = ns.name();
            try {
                itr.callback(this, name, getClass().getField(name).getBoolean(this));
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
