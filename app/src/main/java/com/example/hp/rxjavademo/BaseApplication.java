package com.example.hp.rxjavademo;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by hp on 2018/10/31.
 */

public class BaseApplication extends Application {

   private static  Context context;
    @Override
    public void onCreate() {
        super.onCreate();

        CrashReport.initCrashReport(context, "31d1e0cbc5", false);
        Beta.autoCheckUpgrade = false;//设置不自动检查




    }


    /**
     * 获取进程号对应的进程名
     *
     * @param pid 进程号
     * @return 进程名
     */
//    private static String getProcessName(int pid) {
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
//            String processName = reader.readLine();
//            if (!TextUtils.isEmpty(processName)) {
//                processName = processName.trim();
//            }
//            return processName;
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
//        }
//        return null;
//    }
}
