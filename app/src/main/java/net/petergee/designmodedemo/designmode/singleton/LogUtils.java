
package net.petergee.designmodedemo.designmode.singleton;

import android.util.Log;

/**
 * @author geqipeng
 * @date 2018/3/6
 */

public class LogUtils {
    private static LogUtils mLogUtils = null;

    private LogUtils() {
    }

    public static LogUtils getmLogUtils() {
        if (mLogUtils == null) {
            synchronized (LogUtils.class) {
                if (mLogUtils == null) {
                    mLogUtils = new LogUtils();
                }
            }
        }
        return mLogUtils;
    }

    public void I(String msg) {
        Log.e("TAG", msg);
    }

    public void D(String msg) {
        Log.e("TAG", msg);
    }

    public void W(String msg) {
        Log.e("TAG", msg);
    }

    public void E(String msg) {
        Log.e("TAG", msg);
    }

}
