package d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.provider.MediaStore;
import c.C0529d;
import d.C0812e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: d.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0810c extends AbstractC0808a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7029b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7030a;

    /* JADX INFO: renamed from: d.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public C0810c(int i3) {
        this.f7030a = i3;
        if (i3 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1".toString());
        }
    }

    public Intent a(Context context, C0529d input) {
        m.e(context, "context");
        m.e(input, "input");
        C0812e.a aVar = C0812e.f7031a;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(input.a()));
            if (this.f7030a > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f7030a);
            return intent;
        }
        if (aVar.e(context)) {
            ResolveInfo resolveInfoB = aVar.b(context);
            if (resolveInfoB == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo = resolveInfoB.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.c(input.a()));
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", this.f7030a);
            return intent2;
        }
        if (aVar.d(context)) {
            ResolveInfo resolveInfoA = aVar.a(context);
            if (resolveInfoA == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo2 = resolveInfoA.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f7030a);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(aVar.c(input.a()));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }
}
