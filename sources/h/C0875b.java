package h;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.app.c;
import h.C0874a;
import java.util.ArrayList;

/* JADX INFO: renamed from: h.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0875b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f7395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f7396b;

    /* JADX INFO: renamed from: h.b$a */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f7399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bundle f7400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList f7401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SparseArray f7402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f7403g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f7397a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0874a.C0128a f7398b = new C0874a.C0128a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7404h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f7405i = true;

        private void b(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            c.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f7397a.putExtras(bundle);
        }

        public C0875b a() {
            if (!this.f7397a.hasExtra("android.support.customtabs.extra.SESSION")) {
                b(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f7399c;
            if (arrayList != null) {
                this.f7397a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f7401e;
            if (arrayList2 != null) {
                this.f7397a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f7397a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f7405i);
            this.f7397a.putExtras(this.f7398b.a().a());
            Bundle bundle = this.f7403g;
            if (bundle != null) {
                this.f7397a.putExtras(bundle);
            }
            if (this.f7402f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f7402f);
                this.f7397a.putExtras(bundle2);
            }
            this.f7397a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f7404h);
            return new C0875b(this.f7397a, this.f7400d);
        }
    }

    C0875b(Intent intent, Bundle bundle) {
        this.f7395a = intent;
        this.f7396b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f7395a.setData(uri);
        androidx.core.content.a.j(context, this.f7395a, this.f7396b);
    }
}
