package com.google.android.recaptcha.internal;

import J1.AbstractC0409m;
import J1.AbstractC0411o;
import J1.q;
import J1.x;
import android.content.Context;
import b2.o;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (o.p(file.getName(), this.zzb, false, 2, null)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) throws IOException {
        Y1.c cVar = new Y1.c('A', 'z');
        ArrayList arrayList = new ArrayList(q.n(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(((AbstractC0409m) it).b()));
        }
        String strG = x.G(AbstractC0411o.e(arrayList).subList(0, 8), "", null, null, 0, null, null, 62, null);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strG)));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i3];
                    if (m.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i3++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
