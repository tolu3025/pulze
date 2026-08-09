package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC0642q;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: Y.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0458o implements Parcelable {
    public static final Parcelable.Creator<C0458o> CREATOR = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0435a f3178a;

    /* JADX INFO: renamed from: Y.o$a */
    public static class a extends Exception {
        public a(int i3) {
            super("Algorithm with COSE value " + i3 + " not supported");
        }
    }

    C0458o(InterfaceC0435a interfaceC0435a) {
        this.f3178a = (InterfaceC0435a) AbstractC0643s.k(interfaceC0435a);
    }

    public static C0458o a(int i3) throws a {
        InterfaceC0435a interfaceC0435a;
        if (i3 == B.LEGACY_RS1.c()) {
            interfaceC0435a = B.RS1;
        } else {
            B[] bArrValues = B.values();
            int length = bArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    for (EnumC0459p enumC0459p : EnumC0459p.values()) {
                        if (enumC0459p.c() == i3) {
                            interfaceC0435a = enumC0459p;
                        }
                    }
                    throw new a(i3);
                }
                B b3 = bArrValues[i4];
                if (b3.c() == i3) {
                    interfaceC0435a = b3;
                    break;
                }
                i4++;
            }
        }
        return new C0458o(interfaceC0435a);
    }

    public int b() {
        return this.f3178a.c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0458o) && this.f3178a.c() == ((C0458o) obj).f3178a.c();
    }

    public int hashCode() {
        return AbstractC0642q.c(this.f3178a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3178a.c());
    }
}
