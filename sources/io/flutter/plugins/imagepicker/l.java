package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import c.C0529d;
import d.C0810c;
import d.C0812e;
import io.flutter.plugins.imagepicker.c;
import io.flutter.plugins.imagepicker.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class l implements l1.m, l1.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f8044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Activity f8045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o f8046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.flutter.plugins.imagepicker.c f8047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f8048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f8049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.flutter.plugins.imagepicker.b f8050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ExecutorService f8051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f8052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Uri f8053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f8054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f8055n;

    class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f8056a;

        a(Activity activity) {
            this.f8056a = activity;
        }

        @Override // io.flutter.plugins.imagepicker.l.h
        public boolean a() {
            return n.e(this.f8056a);
        }

        @Override // io.flutter.plugins.imagepicker.l.h
        public void b(String str, int i3) {
            androidx.core.app.a.l(this.f8056a, new String[]{str}, i3);
        }

        @Override // io.flutter.plugins.imagepicker.l.h
        public boolean c(String str) {
            return androidx.core.content.a.a(this.f8056a, str) == 0;
        }
    }

    class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f8057a;

        b(Activity activity) {
            this.f8057a = activity;
        }

        @Override // io.flutter.plugins.imagepicker.l.d
        public Uri a(String str, File file) {
            return androidx.core.content.b.h(this.f8057a, str, file);
        }

        @Override // io.flutter.plugins.imagepicker.l.d
        public void b(Uri uri, final f fVar) {
            Activity activity = this.f8057a;
            String[] strArr = new String[1];
            strArr[0] = uri != null ? uri.getPath() : "";
            MediaScannerConnection.scanFile(activity, strArr, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.m
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri2) {
                    fVar.a(str);
                }
            });
        }
    }

    public enum c {
        REAR,
        FRONT
    }

    interface d {
        Uri a(String str, File file);

        void b(Uri uri, f fVar);
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f8061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f8062b;

        public e(String str, String str2) {
            this.f8061a = str;
            this.f8062b = str2;
        }
    }

    interface f {
        void a(String str);
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.h f8064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p.n f8065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p.j f8066c;

        g(p.h hVar, p.n nVar, p.j jVar) {
            this.f8064a = hVar;
            this.f8065b = nVar;
            this.f8066c = jVar;
        }
    }

    interface h {
        boolean a();

        void b(String str, int i3);

        boolean c(String str);
    }

    public l(Activity activity, o oVar, io.flutter.plugins.imagepicker.c cVar) {
        this(activity, oVar, null, null, null, cVar, new a(activity), new b(activity), new io.flutter.plugins.imagepicker.b(), Executors.newSingleThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void H(int i3, Intent intent) {
        if (i3 != -1 || intent == null) {
            u(null);
            return;
        }
        ArrayList arrayListV = v(intent, false);
        if (arrayListV == null) {
            s("no_valid_image_uri", "Cannot find the selected image.");
        } else {
            F(arrayListV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void K(int i3, Intent intent) {
        if (i3 != -1 || intent == null) {
            u(null);
            return;
        }
        ArrayList arrayListV = v(intent, true);
        if (arrayListV == null) {
            s("no_valid_media_uri", "Cannot find the selected media.");
        } else {
            F(arrayListV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void I(int i3, Intent intent) {
        if (i3 != -1 || intent == null) {
            u(null);
            return;
        }
        ArrayList arrayListV = v(intent, false);
        if (arrayListV == null) {
            s("missing_valid_image_uri", "Cannot find at least one of the selected images.");
        } else {
            F(arrayListV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void L(int i3, Intent intent) {
        if (i3 != -1 || intent == null) {
            u(null);
            return;
        }
        ArrayList arrayListV = v(intent, false);
        if (arrayListV == null || arrayListV.size() < 1) {
            s("no_valid_video_uri", "Cannot find the selected video.");
        } else {
            u(((e) arrayListV.get(0)).f8061a);
        }
    }

    private void F(ArrayList arrayList) {
        p.h hVar;
        synchronized (this.f8055n) {
            try {
                g gVar = this.f8054m;
                hVar = gVar != null ? gVar.f8064a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        if (hVar != null) {
            while (i3 < arrayList.size()) {
                e eVar = (e) arrayList.get(i3);
                String strW = eVar.f8061a;
                String str = eVar.f8062b;
                if (str == null || !str.startsWith("video/")) {
                    strW = w(eVar.f8061a, hVar);
                }
                arrayList2.add(strW);
                i3++;
            }
        } else {
            while (i3 < arrayList.size()) {
                arrayList2.add(((e) arrayList.get(i3)).f8061a);
                i3++;
            }
        }
        t(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(String str) {
        E(str, true);
    }

    private void N(Boolean bool, int i3) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new C0810c(i3).a(this.f8045d, new C0529d.a().b(C0812e.c.f7033a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.f8045d.startActivityForResult(intent, 2346);
    }

    private void O(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new C0812e().a(this.f8045d, new C0529d.a().b(C0812e.c.f7033a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.f8045d.startActivityForResult(intent, 2342);
    }

    private void P(p.e eVar) {
        Intent intentA;
        if (eVar.d().booleanValue()) {
            intentA = eVar.b().booleanValue() ? new C0810c(n.a(eVar)).a(this.f8045d, new C0529d.a().b(C0812e.b.f7032a).a()) : new C0812e().a(this.f8045d, new C0529d.a().b(C0812e.b.f7032a).a());
        } else {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            intent.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", eVar.b());
            intentA = intent;
        }
        this.f8045d.startActivityForResult(intentA, 2347);
    }

    private void Q(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new C0812e().a(this.f8045d, new C0529d.a().b(C0812e.d.f7034a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.f8045d.startActivityForResult(intent, 2352);
    }

    private void R() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f8052k == c.FRONT) {
            b0(intent);
        }
        File fileP = p();
        this.f8053l = Uri.parse("file:" + fileP.getAbsolutePath());
        Uri uriA = this.f8049h.a(this.f8044c, fileP);
        intent.putExtra("output", uriA);
        x(intent, uriA);
        try {
            try {
                this.f8045d.startActivityForResult(intent, 2343);
            } catch (ActivityNotFoundException unused) {
                fileP.delete();
                s("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e3) {
            e3.printStackTrace();
            s("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private void S() {
        p.n nVar;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.f8055n) {
            try {
                g gVar = this.f8054m;
                nVar = gVar != null ? gVar.f8065b : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nVar != null && nVar.b() != null) {
            intent.putExtra("android.intent.extra.durationLimit", nVar.b().intValue());
        }
        if (this.f8052k == c.FRONT) {
            b0(intent);
        }
        File fileQ = q();
        this.f8053l = Uri.parse("file:" + fileQ.getAbsolutePath());
        Uri uriA = this.f8049h.a(this.f8044c, fileQ);
        intent.putExtra("output", uriA);
        x(intent, uriA);
        try {
            try {
                this.f8045d.startActivityForResult(intent, 2353);
            } catch (ActivityNotFoundException unused) {
                fileQ.delete();
                s("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e3) {
            e3.printStackTrace();
            s("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private boolean T() {
        h hVar = this.f8048g;
        if (hVar == null) {
            return false;
        }
        return hVar.a();
    }

    private static List U(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentActivities(intent, 65536);
    }

    private boolean Y(p.h hVar, p.n nVar, p.j jVar) {
        synchronized (this.f8055n) {
            try {
                if (this.f8054m != null) {
                    return false;
                }
                this.f8054m = new g(hVar, nVar, jVar);
                this.f8047f.a();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b0(Intent intent) {
        int i3 = Build.VERSION.SDK_INT;
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i3 >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    private File o(String str) {
        String string = UUID.randomUUID().toString();
        File cacheDir = this.f8045d.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(string, str, cacheDir);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    private File p() {
        return o(".jpg");
    }

    private File q() {
        return o(".mp4");
    }

    private void r(p.j jVar) {
        jVar.b(new p.d("already_active", "Image picker is already active", null));
    }

    private void s(String str, String str2) {
        p.j jVar;
        synchronized (this.f8055n) {
            try {
                g gVar = this.f8054m;
                jVar = gVar != null ? gVar.f8066c : null;
                this.f8054m = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar == null) {
            this.f8047f.f(null, str, str2);
        } else {
            jVar.b(new p.d(str, str2, null));
        }
    }

    private void t(ArrayList arrayList) {
        p.j jVar;
        synchronized (this.f8055n) {
            try {
                g gVar = this.f8054m;
                jVar = gVar != null ? gVar.f8066c : null;
                this.f8054m = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar == null) {
            this.f8047f.f(arrayList, null, null);
        } else {
            jVar.a(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str) {
        p.j jVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f8055n) {
            try {
                g gVar = this.f8054m;
                jVar = gVar != null ? gVar.f8066c : null;
                this.f8054m = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jVar != null) {
            jVar.a(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.f8047f.f(arrayList, null, null);
        }
    }

    private ArrayList v(Intent intent, boolean z2) {
        String strE;
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        if (data != null) {
            String strE2 = this.f8050i.e(this.f8045d, data);
            if (strE2 == null) {
                return null;
            }
            arrayList.add(new e(strE2, null));
        } else {
            if (intent.getClipData() == null) {
                return null;
            }
            for (int i3 = 0; i3 < intent.getClipData().getItemCount(); i3++) {
                Uri uri = intent.getClipData().getItemAt(i3).getUri();
                if (uri == null || (strE = this.f8050i.e(this.f8045d, uri)) == null) {
                    return null;
                }
                arrayList.add(new e(strE, z2 ? this.f8045d.getContentResolver().getType(uri) : null));
            }
        }
        return arrayList;
    }

    private String w(String str, p.h hVar) {
        return this.f8046e.j(str, hVar.c(), hVar.b(), hVar.d().intValue());
    }

    private void x(Intent intent, Uri uri) {
        PackageManager packageManager = this.f8045d.getPackageManager();
        Iterator it = (Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)) : U(packageManager, intent)).iterator();
        while (it.hasNext()) {
            this.f8045d.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uri, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void J(int i3) {
        if (i3 != -1) {
            u(null);
            return;
        }
        Uri uri = this.f8053l;
        d dVar = this.f8049h;
        if (uri == null) {
            uri = Uri.parse(this.f8047f.c());
        }
        dVar.b(uri, new f() { // from class: io.flutter.plugins.imagepicker.j
            @Override // io.flutter.plugins.imagepicker.l.f
            public final void a(String str) {
                this.f8042a.G(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void M(int i3) {
        if (i3 != -1) {
            u(null);
            return;
        }
        Uri uri = this.f8053l;
        d dVar = this.f8049h;
        if (uri == null) {
            uri = Uri.parse(this.f8047f.c());
        }
        dVar.b(uri, new f() { // from class: io.flutter.plugins.imagepicker.k
            @Override // io.flutter.plugins.imagepicker.l.f
            public final void a(String str) {
                this.f8043a.u(str);
            }
        });
    }

    void E(String str, boolean z2) {
        p.h hVar;
        synchronized (this.f8055n) {
            try {
                g gVar = this.f8054m;
                hVar = gVar != null ? gVar.f8064a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hVar == null) {
            u(str);
            return;
        }
        String strW = w(str, hVar);
        if (strW != null && !strW.equals(str) && z2) {
            new File(str).delete();
        }
        u(strW);
    }

    p.b V() {
        Map mapB = this.f8047f.b();
        if (mapB.isEmpty()) {
            return null;
        }
        p.b.a aVar = new p.b.a();
        p.c cVar = (p.c) mapB.get("type");
        if (cVar != null) {
            aVar.d(cVar);
        }
        aVar.b((p.a) mapB.get("error"));
        ArrayList<String> arrayList = (ArrayList) mapB.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                Double d3 = (Double) mapB.get("maxWidth");
                Double d4 = (Double) mapB.get("maxHeight");
                Integer num = (Integer) mapB.get("imageQuality");
                arrayList2.add(this.f8046e.j(str, d3, d4, num == null ? 100 : num.intValue()));
            }
            aVar.c(arrayList2);
        }
        this.f8047f.a();
        return aVar.a();
    }

    void W() {
        synchronized (this.f8055n) {
            try {
                g gVar = this.f8054m;
                if (gVar == null) {
                    return;
                }
                p.h hVar = gVar.f8064a;
                this.f8047f.g(hVar != null ? c.a.IMAGE : c.a.VIDEO);
                if (hVar != null) {
                    this.f8047f.d(hVar);
                }
                Uri uri = this.f8053l;
                if (uri != null) {
                    this.f8047f.e(uri);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void X(c cVar) {
        this.f8052k = cVar;
    }

    public void Z(p.h hVar, p.j jVar) {
        if (!Y(hVar, null, jVar)) {
            r(jVar);
        } else if (!T() || this.f8048g.c("android.permission.CAMERA")) {
            R();
        } else {
            this.f8048g.b("android.permission.CAMERA", 2345);
        }
    }

    @Override // l1.m
    public boolean a(int i3, final int i4, final Intent intent) {
        Runnable runnable;
        if (i3 == 2342) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8026a.H(i4, intent);
                }
            };
        } else if (i3 == 2343) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8032a.J(i4);
                }
            };
        } else if (i3 == 2346) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8029a.I(i4, intent);
                }
            };
        } else if (i3 == 2347) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8034a.K(i4, intent);
                }
            };
        } else if (i3 == 2352) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8037a.L(i4, intent);
                }
            };
        } else {
            if (i3 != 2353) {
                return false;
            }
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8040a.M(i4);
                }
            };
        }
        this.f8051j.execute(runnable);
        return true;
    }

    public void a0(p.n nVar, p.j jVar) {
        if (!Y(null, nVar, jVar)) {
            r(jVar);
        } else if (!T() || this.f8048g.c("android.permission.CAMERA")) {
            S();
        } else {
            this.f8048g.b("android.permission.CAMERA", 2355);
        }
    }

    @Override // l1.n
    public boolean b(int i3, String[] strArr, int[] iArr) {
        boolean z2 = iArr.length > 0 && iArr[0] == 0;
        if (i3 != 2345) {
            if (i3 != 2355) {
                return false;
            }
            if (z2) {
                S();
            }
        } else if (z2) {
            R();
        }
        if (!z2 && (i3 == 2345 || i3 == 2355)) {
            s("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    public void k(p.h hVar, boolean z2, p.j jVar) {
        if (Y(hVar, null, jVar)) {
            O(Boolean.valueOf(z2));
        } else {
            r(jVar);
        }
    }

    public void l(p.i iVar, p.e eVar, p.j jVar) {
        if (Y(iVar.b(), null, jVar)) {
            P(eVar);
        } else {
            r(jVar);
        }
    }

    public void m(p.h hVar, boolean z2, int i3, p.j jVar) {
        if (Y(hVar, null, jVar)) {
            N(Boolean.valueOf(z2), i3);
        } else {
            r(jVar);
        }
    }

    public void n(p.n nVar, boolean z2, p.j jVar) {
        if (Y(null, nVar, jVar)) {
            Q(Boolean.valueOf(z2));
        } else {
            r(jVar);
        }
    }

    l(Activity activity, o oVar, p.h hVar, p.n nVar, p.j jVar, io.flutter.plugins.imagepicker.c cVar, h hVar2, d dVar, io.flutter.plugins.imagepicker.b bVar, ExecutorService executorService) {
        this.f8055n = new Object();
        this.f8045d = activity;
        this.f8046e = oVar;
        this.f8044c = activity.getPackageName() + ".flutter.image_provider";
        if (jVar != null) {
            this.f8054m = new g(hVar, nVar, jVar);
        }
        this.f8048g = hVar2;
        this.f8049h = dVar;
        this.f8050i = bVar;
        this.f8047f = cVar;
        this.f8051j = executorService;
    }
}
