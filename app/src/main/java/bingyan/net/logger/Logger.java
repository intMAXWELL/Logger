package bingyan.net.logger;

import android.util.Log;

/**
 * Created by Demon on 2016/3/27.
 *
 */
public class Logger {

    private static String generateTag() {
        StackTraceElement caller = new Throwable().getStackTrace()[2];// 0:generateTag();1:Logger.d(e,i,...);2:The caller
        String callerClazzName = caller.getClassName();
        callerClazzName = caller.getClassName().substring(callerClazzName.lastIndexOf(".") + 1);
        return String.format("%s.%s.%d", callerClazzName, caller.getMethodName(), caller.getLineNumber());
    }

    public static void d(String content) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();
        Log.d(tag, content);
    }

    public static void d(String content, Throwable tr) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.d(tag, content, tr);
    }

    public static void e(String content) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.e(tag, content);
    }

    public static void e(String content, Throwable tr) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.e(tag, content, tr);
    }

    public static void i(String content) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.i(tag, content);
    }

    public static void i(String content, Throwable tr) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.i(tag, content, tr);
    }

    public static void v(String content) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.v(tag, content);
    }

    public static void v(String content, Throwable tr) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.v(tag, content, tr);
    }

    public static void w(String content) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.w(tag, content);
    }

    public static void w(String content, Throwable tr) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.w(tag, content, tr);
    }

    public static void w(Throwable tr) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.w(tag, tr);
    }

    public static void wtf(String content, Throwable tr) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.wtf(tag, content, tr);
    }

    public static void wtf(Throwable tr) {
        if (!BuildConfig.DEBUG) return;
        String tag = generateTag();

        Log.wtf(tag, tr);
    }

}
