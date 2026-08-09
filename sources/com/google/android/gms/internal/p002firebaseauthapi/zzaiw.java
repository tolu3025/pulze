package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzaiw {
    private List<String> zza;

    public zzaiw() {
        this(null);
    }

    public static zzaiw zza() {
        return new zzaiw(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    public zzaiw(int i3, List<String> list) {
        List<String> listEmptyList;
        if (list == null || list.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.set(i4, p.a(list.get(i4)));
            }
            listEmptyList = Collections.unmodifiableList(list);
        }
        this.zza = listEmptyList;
    }

    private zzaiw(List<String> list) {
        this.zza = new ArrayList();
    }
}
