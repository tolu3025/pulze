package c0;

import V0.I;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: renamed from: c0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0534e extends zab implements InterfaceC0535f {
    public AbstractBinderC0534e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i3, Parcel parcel, Parcel parcel2, int i4) {
        switch (i3) {
            case 3:
                zac.zad(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
            case 6:
                zac.zad(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
            default:
                return false;
            case 7:
                zac.zad(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                C0541l c0541l = (C0541l) zac.zaa(parcel, C0541l.CREATOR);
                zac.zad(parcel);
                i(c0541l);
                parcel2.writeNoException();
                return true;
            case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                zac.zad(parcel);
                parcel2.writeNoException();
                return true;
        }
    }
}
