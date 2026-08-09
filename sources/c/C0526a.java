package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0526a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f4979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f4977c = new b(null);
    public static final Parcelable.Creator<C0526a> CREATOR = new C0103a();

    /* JADX INFO: renamed from: c.a$a, reason: collision with other inner class name */
    public static final class C0103a implements Parcelable.Creator {
        C0103a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0526a createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            return new C0526a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0526a[] newArray(int i3) {
            return new C0526a[i3];
        }
    }

    /* JADX INFO: renamed from: c.a$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final String a(int i3) {
            return i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK";
        }
    }

    public C0526a(int i3, Intent intent) {
        this.f4978a = i3;
        this.f4979b = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f4977c.a(this.f4978a) + ", data=" + this.f4979b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i3) {
        m.e(dest, "dest");
        dest.writeInt(this.f4978a);
        dest.writeInt(this.f4979b == null ? 0 : 1);
        Intent intent = this.f4979b;
        if (intent != null) {
            intent.writeToParcel(dest, i3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0526a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        m.e(parcel, "parcel");
    }
}
