package v1;

import V0.I;
import android.content.Context;
import android.util.Log;
import g1.InterfaceC0872a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l1.InterfaceC1017c;
import v1.i;

/* JADX INFO: loaded from: classes.dex */
public class j implements InterfaceC0872a, i.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f11519c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11520a;

        static {
            int[] iArr = new int[i.b.values().length];
            f11520a = iArr;
            try {
                iArr[i.b.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11520a[i.b.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11520a[i.b.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11520a[i.b.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11520a[i.b.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11520a[i.b.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11520a[i.b.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11520a[i.b.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11520a[i.b.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11520a[i.b.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11520a[i.b.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private String h() {
        return x1.c.d(this.f11519c);
    }

    private String i() {
        return x1.c.c(this.f11519c);
    }

    private List j() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f11519c.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List k(i.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f11519c.getExternalFilesDirs(n(bVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String l() {
        File externalFilesDir = this.f11519c.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String m() {
        return this.f11519c.getCacheDir().getPath();
    }

    private String n(i.b bVar) {
        switch (a.f11520a[bVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "downloads";
            case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + bVar);
        }
    }

    private void o(InterfaceC1017c interfaceC1017c, Context context) {
        try {
            h.i(interfaceC1017c, this);
        } catch (Exception e3) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e3);
        }
        this.f11519c = context;
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b bVar) {
        o(bVar.b(), bVar.a());
    }

    @Override // v1.i.a
    public List a(i.b bVar) {
        return k(bVar);
    }

    @Override // v1.i.a
    public String b() {
        return m();
    }

    @Override // v1.i.a
    public String c() {
        return this.f11519c.getCacheDir().getPath();
    }

    @Override // v1.i.a
    public String d() {
        return i();
    }

    @Override // v1.i.a
    public List e() {
        return j();
    }

    @Override // v1.i.a
    public String f() {
        return h();
    }

    @Override // v1.i.a
    public String g() {
        return l();
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b bVar) {
        h.i(bVar.b(), null);
    }
}
