package d;

import I1.k;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.ext.SdkExtensions;
import c.C0529d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: d.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0812e extends AbstractC0808a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7031a = new a(null);

    /* JADX INFO: renamed from: d.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final ResolveInfo a(Context context) {
            m.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final ResolveInfo b(Context context) {
            m.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String c(InterfaceC0118e input) {
            m.e(input, "input");
            if (input instanceof c) {
                return "image/*";
            }
            if (input instanceof d) {
                return "video/*";
            }
            if (input instanceof b) {
                return null;
            }
            throw new k();
        }

        public final boolean d(Context context) {
            m.e(context, "context");
            return a(context) != null;
        }

        public final boolean e(Context context) {
            m.e(context, "context");
            return b(context) != null;
        }

        public final boolean f() {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 33) {
                return true;
            }
            return i3 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }
    }

    /* JADX INFO: renamed from: d.e$b */
    public static final class b implements InterfaceC0118e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7032a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: d.e$c */
    public static final class c implements InterfaceC0118e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f7033a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: d.e$d */
    public static final class d implements InterfaceC0118e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f7034a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: d.e$e, reason: collision with other inner class name */
    public interface InterfaceC0118e {
    }

    public static final boolean b() {
        return f7031a.f();
    }

    public Intent a(Context context, C0529d input) {
        ActivityInfo activityInfo;
        Intent intent;
        m.e(context, "context");
        m.e(input, "input");
        a aVar = f7031a;
        if (aVar.f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.c(input.a()));
            return intent2;
        }
        if (aVar.e(context)) {
            ResolveInfo resolveInfoB = aVar.b(context);
            if (resolveInfoB == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = resolveInfoB.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        } else {
            if (!aVar.d(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.c(input.a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo resolveInfoA = aVar.a(context);
            if (resolveInfoA == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = resolveInfoA.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        }
        intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent.setType(aVar.c(input.a()));
        return intent;
    }
}
