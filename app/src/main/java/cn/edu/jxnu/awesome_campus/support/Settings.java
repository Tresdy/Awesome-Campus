package cn.edu.jxnu.awesome_campus.support;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Locale;

import cn.edu.jxnu.awesome_campus.InitApp;

/**
 * Created by MummyDing on 16-4-17.
 * GitHub: https://github.com/MummyDing
 * Blog: http://blog.csdn.net/mummyding
 */
public class Settings {

    public static boolean needRecreate = false;

    public static boolean isExitConfirm = true;

    public static int swipeID = 0;

    public static final String XML_NAEM = "settings";

    public static final String LANGUAGE = "language";

    public static final String EXIT_CONFIRM = "exit_confirm";

    public static final String CLEAR_CACHE = "clear_cache";

    public static final String SWIPE_BACK = "swipe_back";

    private static Settings sInstance;

    private static SharedPreferences mPrefs;

    public static Settings getsInstance(){
        if (sInstance == null){
            sInstance = new Settings(InitApp.AppContext);
        }
        return sInstance;
    }

    private Settings(Context context){
        mPrefs = context.getSharedPreferences(XML_NAEM,Context.MODE_PRIVATE);
    }

    public Settings putBoolean(String key,boolean value){
        mPrefs.edit().putBoolean(key,value).commit();
        return this;
    }

    public boolean getBoolean(String key, boolean def){
        return mPrefs.getBoolean(key,def);
    }

    public Settings putInt(String key, int value) {
        mPrefs.edit().putInt(key, value).commit();
        return this;
    }

    public int getInt(String key, int defValue) {
        return mPrefs.getInt(key, defValue);
    }

    public Settings putString(String key, String value) {
        mPrefs.edit().putString(key, value).commit();
        return this;
    }

    public String getString(String key, String defValue) {
        return mPrefs.getString(key, defValue);
    }




}
