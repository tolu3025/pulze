package com.google.android.recaptcha.internal;

import J1.AbstractC0412p;
import J1.q;
import android.net.Uri;
import android.text.TextUtils;
import b2.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzfk {
    private final List zza;

    public zzfk() {
        this(true);
    }

    public static final boolean zzc(Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List list = this.zza;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (o.p(str, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        return (TextUtils.isEmpty(uri.toString()) || !m.a("https", uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) ? false : true;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(q.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }

    public final boolean zza(Uri uri) {
        return zze(uri) && zzd(uri.toString());
    }

    public final boolean zzb(String str) {
        Uri uri = Uri.parse(str);
        m.b(uri);
        return zze(uri) && zzd(uri.toString());
    }

    public zzfk(boolean z2) {
        this.zza = zzf(AbstractC0412p.j("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }
}
