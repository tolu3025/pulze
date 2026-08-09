package q0;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.internal.p002firebaseauthapi.zzahy;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import com.google.firebase.auth.C0666a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static com.google.firebase.auth.J a(zzahy zzahyVar) {
        if (zzahyVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahyVar.zze())) {
            return new com.google.firebase.auth.U(zzahyVar.zzd(), zzahyVar.zzc(), zzahyVar.zza(), AbstractC0643s.e(zzahyVar.zze()));
        }
        if (zzahyVar.zzb() != null) {
            return new C0666a0(zzahyVar.zzd(), zzahyVar.zzc(), zzahyVar.zza(), (zzaiz) AbstractC0643s.l(zzahyVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.firebase.auth.J jA = a((zzahy) it.next());
            if (jA != null) {
                arrayList.add(jA);
            }
        }
        return arrayList;
    }
}
