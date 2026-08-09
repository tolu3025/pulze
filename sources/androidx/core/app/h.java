package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.g;
import androidx.core.graphics.drawable.IconCompat;
import c.AbstractC0527b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class h implements androidx.core.app.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f3844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g.d f3845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f3846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f3847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f3848f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f3849g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f3851i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i3, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z2) {
            return builder.setGroupSummary(z2);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z2) {
            return builder.setLocalOnly(z2);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i3) {
            return builder.setColor(i3);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i3) {
            return builder.setVisibility(i3);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAllowGeneratedReplies(z2);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i3) {
            return builder.setBadgeIconType(i3);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z2) {
            return builder.setColorized(z2);
        }

        static Notification.Builder d(Notification.Builder builder, int i3) {
            return builder.setGroupAlertBehavior(i3);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j3) {
            return builder.setTimeoutAfter(j3);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i3) {
            return builder.setSemanticAction(i3);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z2) {
            return builder.setAllowSystemGeneratedContextualActions(z2);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z2) {
            return builder.setContextual(z2);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.h$h, reason: collision with other inner class name */
    static class C0081h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAuthenticationRequired(z2);
        }

        static Notification.Builder b(Notification.Builder builder, int i3) {
            return builder.setForegroundServiceBehavior(i3);
        }
    }

    h(g.d dVar) {
        int i3;
        this.f3845c = dVar;
        Context context = dVar.f3813a;
        this.f3843a = context;
        this.f3844b = Build.VERSION.SDK_INT >= 26 ? e.a(context, dVar.f3802K) : new Notification.Builder(dVar.f3813a);
        Notification notification = dVar.f3809R;
        this.f3844b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f3821i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f3817e).setContentText(dVar.f3818f).setContentInfo(dVar.f3823k).setContentIntent(dVar.f3819g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f3820h, (notification.flags & 128) != 0).setNumber(dVar.f3824l).setProgress(dVar.f3832t, dVar.f3833u, dVar.f3834v);
        Notification.Builder builder = this.f3844b;
        IconCompat iconCompat = dVar.f3822j;
        c.b(builder, iconCompat == null ? null : iconCompat.k(context));
        this.f3844b.setSubText(dVar.f3829q).setUsesChronometer(dVar.f3827o).setPriority(dVar.f3825m);
        Iterator it = dVar.f3814b.iterator();
        while (it.hasNext()) {
            b((g.a) it.next());
        }
        Bundle bundle = dVar.f3795D;
        if (bundle != null) {
            this.f3849g.putAll(bundle);
        }
        int i4 = Build.VERSION.SDK_INT;
        this.f3846d = dVar.f3799H;
        this.f3847e = dVar.f3800I;
        this.f3844b.setShowWhen(dVar.f3826n);
        a.i(this.f3844b, dVar.f3838z);
        a.g(this.f3844b, dVar.f3835w);
        a.j(this.f3844b, dVar.f3837y);
        a.h(this.f3844b, dVar.f3836x);
        this.f3850h = dVar.f3806O;
        b.b(this.f3844b, dVar.f3794C);
        b.c(this.f3844b, dVar.f3796E);
        b.f(this.f3844b, dVar.f3797F);
        b.d(this.f3844b, dVar.f3798G);
        b.e(this.f3844b, notification.sound, notification.audioAttributes);
        List listE = i4 < 28 ? e(f(dVar.f3815c), dVar.f3812U) : dVar.f3812U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                b.a(this.f3844b, (String) it2.next());
            }
        }
        this.f3851i = dVar.f3801J;
        if (dVar.f3816d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i5 = 0; i5 < dVar.f3816d.size(); i5++) {
                bundle4.putBundle(Integer.toString(i5), i.a((g.a) dVar.f3816d.get(i5)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3849g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i6 = Build.VERSION.SDK_INT;
        Object obj = dVar.f3811T;
        if (obj != null) {
            c.c(this.f3844b, obj);
        }
        if (i6 >= 24) {
            this.f3844b.setExtras(dVar.f3795D);
            d.e(this.f3844b, dVar.f3831s);
            RemoteViews remoteViews = dVar.f3799H;
            if (remoteViews != null) {
                d.c(this.f3844b, remoteViews);
            }
            RemoteViews remoteViews2 = dVar.f3800I;
            if (remoteViews2 != null) {
                d.b(this.f3844b, remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.f3801J;
            if (remoteViews3 != null) {
                d.d(this.f3844b, remoteViews3);
            }
        }
        if (i6 >= 26) {
            e.b(this.f3844b, dVar.f3803L);
            e.e(this.f3844b, dVar.f3830r);
            e.f(this.f3844b, dVar.f3804M);
            e.g(this.f3844b, dVar.f3805N);
            e.d(this.f3844b, dVar.f3806O);
            if (dVar.f3793B) {
                e.c(this.f3844b, dVar.f3792A);
            }
            if (!TextUtils.isEmpty(dVar.f3802K)) {
                this.f3844b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i6 >= 28) {
            Iterator it3 = dVar.f3815c.iterator();
            if (it3.hasNext()) {
                AbstractC0527b.a(it3.next());
                throw null;
            }
        }
        if (i6 >= 29) {
            g.a(this.f3844b, dVar.f3808Q);
            g.b(this.f3844b, g.c.a(null));
        }
        if (i6 >= 31 && (i3 = dVar.f3807P) != 0) {
            C0081h.b(this.f3844b, i3);
        }
        if (dVar.f3810S) {
            if (this.f3845c.f3836x) {
                this.f3850h = 2;
            } else {
                this.f3850h = 1;
            }
            this.f3844b.setVibrate(null);
            this.f3844b.setSound(null);
            int i7 = notification.defaults & (-4);
            notification.defaults = i7;
            this.f3844b.setDefaults(i7);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f3845c.f3835w)) {
                    a.g(this.f3844b, "silent");
                }
                e.d(this.f3844b, this.f3850h);
            }
        }
    }

    private void b(g.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.j() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : m.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            d.a(builderA, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i3 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i3 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i3 >= 31) {
            C0081h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f3844b, a.d(builderA));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List f(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC0527b.a(it.next());
        throw null;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.f
    public Notification.Builder a() {
        return this.f3844b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        g.e eVar = this.f3845c.f3828p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews remoteViewsE = eVar != null ? eVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null || (remoteViewsE = this.f3845c.f3799H) != null) {
            notificationD.contentView = remoteViewsE;
        }
        if (eVar != null && (remoteViewsD = eVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (eVar != null && (remoteViewsF = this.f3845c.f3828p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (eVar != null && (bundleA = androidx.core.app.g.a(notificationD)) != null) {
            eVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            return this.f3844b.build();
        }
        if (i3 >= 24) {
            Notification notificationBuild = this.f3844b.build();
            if (this.f3850h != 0) {
                if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f3850h == 2) {
                    g(notificationBuild);
                }
                if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f3850h == 1) {
                    g(notificationBuild);
                }
            }
            return notificationBuild;
        }
        this.f3844b.setExtras(this.f3849g);
        Notification notificationBuild2 = this.f3844b.build();
        RemoteViews remoteViews = this.f3846d;
        if (remoteViews != null) {
            notificationBuild2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f3847e;
        if (remoteViews2 != null) {
            notificationBuild2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f3851i;
        if (remoteViews3 != null) {
            notificationBuild2.headsUpContentView = remoteViews3;
        }
        if (this.f3850h != 0) {
            if (a.f(notificationBuild2) != null && (notificationBuild2.flags & 512) != 0 && this.f3850h == 2) {
                g(notificationBuild2);
            }
            if (a.f(notificationBuild2) != null && (notificationBuild2.flags & 512) == 0 && this.f3850h == 1) {
                g(notificationBuild2);
            }
        }
        return notificationBuild2;
    }
}
