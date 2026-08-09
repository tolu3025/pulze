package io.flutter.plugins.imagepicker;

import io.flutter.plugins.imagepicker.p;
import java.util.ArrayList;
import java.util.List;
import l1.C1015a;
import l1.InterfaceC1017c;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u {

    class a implements p.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f8110b;

        a(ArrayList arrayList, C1015a.e eVar) {
            this.f8109a = arrayList;
            this.f8110b = eVar;
        }

        @Override // io.flutter.plugins.imagepicker.p.j
        public void b(Throwable th) {
            this.f8110b.a(p.a(th));
        }

        @Override // io.flutter.plugins.imagepicker.p.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            this.f8109a.add(0, list);
            this.f8110b.a(this.f8109a);
        }
    }

    class b implements p.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f8112b;

        b(ArrayList arrayList, C1015a.e eVar) {
            this.f8111a = arrayList;
            this.f8112b = eVar;
        }

        @Override // io.flutter.plugins.imagepicker.p.j
        public void b(Throwable th) {
            this.f8112b.a(p.a(th));
        }

        @Override // io.flutter.plugins.imagepicker.p.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            this.f8111a.add(0, list);
            this.f8112b.a(this.f8111a);
        }
    }

    class c implements p.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1015a.e f8114b;

        c(ArrayList arrayList, C1015a.e eVar) {
            this.f8113a = arrayList;
            this.f8114b = eVar;
        }

        @Override // io.flutter.plugins.imagepicker.p.j
        public void b(Throwable th) {
            this.f8114b.a(p.a(th));
        }

        @Override // io.flutter.plugins.imagepicker.p.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            this.f8113a.add(0, list);
            this.f8114b.a(this.f8113a);
        }
    }

    public static l1.i a() {
        return p.g.f8089d;
    }

    public static /* synthetic */ void b(p.f fVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.b((p.l) arrayList.get(0), (p.h) arrayList.get(1), (p.e) arrayList.get(2), new a(new ArrayList(), eVar));
    }

    public static /* synthetic */ void c(p.f fVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.c((p.l) arrayList.get(0), (p.n) arrayList.get(1), (p.e) arrayList.get(2), new b(new ArrayList(), eVar));
    }

    public static /* synthetic */ void d(p.f fVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = (ArrayList) obj;
        fVar.a((p.i) arrayList.get(0), (p.e) arrayList.get(1), new c(new ArrayList(), eVar));
    }

    public static /* synthetic */ void e(p.f fVar, Object obj, C1015a.e eVar) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(0, fVar.d());
        } catch (Throwable th) {
            arrayList = p.a(th);
        }
        eVar.a(arrayList);
    }

    public static void f(InterfaceC1017c interfaceC1017c, final p.f fVar) {
        C1015a c1015a = new C1015a(interfaceC1017c, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages", a(), interfaceC1017c.d());
        if (fVar != null) {
            c1015a.e(new C1015a.d() { // from class: io.flutter.plugins.imagepicker.q
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    u.b(fVar, obj, eVar);
                }
            });
        } else {
            c1015a.e(null);
        }
        C1015a c1015a2 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos", a(), interfaceC1017c.d());
        if (fVar != null) {
            c1015a2.e(new C1015a.d() { // from class: io.flutter.plugins.imagepicker.r
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    u.c(fVar, obj, eVar);
                }
            });
        } else {
            c1015a2.e(null);
        }
        C1015a c1015a3 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia", a());
        if (fVar != null) {
            c1015a3.e(new C1015a.d() { // from class: io.flutter.plugins.imagepicker.s
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    u.d(fVar, obj, eVar);
                }
            });
        } else {
            c1015a3.e(null);
        }
        C1015a c1015a4 = new C1015a(interfaceC1017c, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults", a(), interfaceC1017c.d());
        if (fVar != null) {
            c1015a4.e(new C1015a.d() { // from class: io.flutter.plugins.imagepicker.t
                @Override // l1.C1015a.d
                public final void a(Object obj, C1015a.e eVar) {
                    u.e(fVar, obj, eVar);
                }
            });
        } else {
            c1015a4.e(null);
        }
    }
}
