package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f5674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f5676c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f5674a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f5674a = Application.getProcessName();
            } else {
                int iMyPid = f5675b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f5675b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb.append("/proc/");
                        sb.append(iMyPid);
                        sb.append("/cmdline");
                        String string = sb.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String line = bufferedReader.readLine();
                        AbstractC0643s.k(line);
                        strTrim = line.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        i.a(bufferedReader2);
                        throw th;
                    }
                    i.a(bufferedReader);
                }
                f5674a = strTrim;
            }
        }
        return f5674a;
    }

    public static boolean b() {
        Boolean boolValueOf = f5676c;
        if (boolValueOf == null) {
            if (l.d()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objZza = zzj.zza(Process.class, "isIsolated", new zzi[0]);
                    Object[] objArr = new Object[0];
                    if (objZza == null) {
                        throw new zzy(zzx.zza("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objZza;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f5676c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
