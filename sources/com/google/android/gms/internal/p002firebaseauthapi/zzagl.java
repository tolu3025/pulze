package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.collection.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public final class zzagl {
    private static final Map<String, zzagk> zza = new a();
    private static final Map<String, List<WeakReference<zzagn>>> zzb = new a();

    public static String zza(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar == null) {
            throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
        }
        return zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":")) + "emulator/auth/handler";
    }

    public static String zzb(String str) {
        zzagk zzagkVar;
        String str2;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzagk zzagkVar;
        String str2;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzagk zzagkVar;
        String str2;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }

    private static String zza(String str, int i3, boolean z2) {
        StringBuilder sb;
        String str2;
        if (z2) {
            sb = new StringBuilder("http://[");
            sb.append(str);
            str2 = "]:";
        } else {
            sb = new StringBuilder("http://");
            sb.append(str);
            str2 = ":";
        }
        sb.append(str2);
        sb.append(i3);
        sb.append("/");
        return sb.toString();
    }

    public static void zza(String str, zzagn zzagnVar) {
        Map<String, List<WeakReference<zzagn>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagnVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference<>(zzagnVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(C0992f c0992f, String str, int i3) {
        String strB = c0992f.r().b();
        Map<String, zzagk> map = zza;
        synchronized (map) {
            map.put(strB, new zzagk(str, i3));
        }
        Map<String, List<WeakReference<zzagn>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(strB)) {
                    Iterator<WeakReference<zzagn>> it = map2.get(strB).iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        zzagn zzagnVar = it.next().get();
                        if (zzagnVar != null) {
                            zzagnVar.zza();
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        zza.remove(strB);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(C0992f c0992f) {
        return zza.containsKey(c0992f.r().b());
    }
}
