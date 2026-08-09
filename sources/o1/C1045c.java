package o1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import g1.InterfaceC0872a;
import h1.InterfaceC0881a;
import h1.InterfaceC0883c;
import java.util.HashMap;
import java.util.Map;
import k1.r;
import l1.k;
import l1.m;

/* JADX INFO: renamed from: o1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1045c implements InterfaceC0872a, InterfaceC0881a, m, r.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f9966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PackageManager f9967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0883c f9968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f9969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f9970g = new HashMap();

    public C1045c(r rVar) {
        this.f9966c = rVar;
        this.f9967d = rVar.f9619b;
        rVar.b(this);
    }

    private void d() {
        this.f9969f = new HashMap();
        int i3 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (ResolveInfo resolveInfo : i3 >= 33 ? this.f9967d.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : this.f9967d.queryIntentActivities(type, 0)) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.f9967d).toString();
            this.f9969f.put(str, resolveInfo);
        }
    }

    @Override // h1.InterfaceC0881a
    public void C() {
        this.f9968e.g(this);
        this.f9968e = null;
    }

    @Override // l1.m
    public boolean a(int i3, int i4, Intent intent) {
        if (!this.f9970g.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        ((k.d) this.f9970g.remove(Integer.valueOf(i3))).a(i4 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // k1.r.b
    public Map b() {
        if (this.f9969f == null) {
            d();
        }
        HashMap map = new HashMap();
        for (String str : this.f9969f.keySet()) {
            map.put(str, ((ResolveInfo) this.f9969f.get(str)).loadLabel(this.f9967d).toString());
        }
        return map;
    }

    @Override // k1.r.b
    public void c(String str, String str2, boolean z2, k.d dVar) {
        if (this.f9968e == null) {
            dVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map map = this.f9969f;
        if (map == null) {
            dVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            dVar.b("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = dVar.hashCode();
        this.f9970g.put(Integer.valueOf(iHashCode), dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        this.f9968e.d().startActivityForResult(intent, iHashCode);
    }

    @Override // h1.InterfaceC0881a
    public void f(InterfaceC0883c interfaceC0883c) {
        this.f9968e = interfaceC0883c;
        interfaceC0883c.e(this);
    }

    @Override // h1.InterfaceC0881a
    public void g(InterfaceC0883c interfaceC0883c) {
        this.f9968e = interfaceC0883c;
        interfaceC0883c.e(this);
    }

    @Override // h1.InterfaceC0881a
    public void j() {
        this.f9968e.g(this);
        this.f9968e = null;
    }

    @Override // g1.InterfaceC0872a
    public void A(InterfaceC0872a.b bVar) {
    }

    @Override // g1.InterfaceC0872a
    public void y(InterfaceC0872a.b bVar) {
    }
}
