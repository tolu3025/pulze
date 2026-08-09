package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f4581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList f4582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b[] f4583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f4584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f4585e;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i3) {
            return new k[i3];
        }
    }

    public k() {
        this.f4584d = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeTypedList(this.f4581a);
        parcel.writeStringList(this.f4582b);
        parcel.writeTypedArray(this.f4583c, i3);
        parcel.writeString(this.f4584d);
        parcel.writeInt(this.f4585e);
    }

    public k(Parcel parcel) {
        this.f4584d = null;
        this.f4581a = parcel.createTypedArrayList(m.CREATOR);
        this.f4582b = parcel.createStringArrayList();
        this.f4583c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f4584d = parcel.readString();
        this.f4585e = parcel.readInt();
    }
}
