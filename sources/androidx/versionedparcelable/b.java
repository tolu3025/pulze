package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f4901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f4902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f4905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4908k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f4902e.writeInt(-1);
        } else {
            this.f4902e.writeInt(bArr.length);
            this.f4902e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4902e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i3) {
        this.f4902e.writeInt(i3);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f4902e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f4902e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i3 = this.f4906i;
        if (i3 >= 0) {
            int i4 = this.f4901d.get(i3);
            int iDataPosition = this.f4902e.dataPosition();
            this.f4902e.setDataPosition(i4);
            this.f4902e.writeInt(iDataPosition - i4);
            this.f4902e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f4902e;
        int iDataPosition = parcel.dataPosition();
        int i3 = this.f4907j;
        if (i3 == this.f4903f) {
            i3 = this.f4904g;
        }
        return new b(parcel, iDataPosition, i3, this.f4905h + "  ", this.f4898a, this.f4899b, this.f4900c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f4902e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i3 = this.f4902e.readInt();
        if (i3 < 0) {
            return null;
        }
        byte[] bArr = new byte[i3];
        this.f4902e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4902e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i3) {
        while (this.f4907j < this.f4904g) {
            int i4 = this.f4908k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            this.f4902e.setDataPosition(this.f4907j);
            int i5 = this.f4902e.readInt();
            this.f4908k = this.f4902e.readInt();
            this.f4907j += i5;
        }
        return this.f4908k == i3;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f4902e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f4902e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f4902e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i3) {
        a();
        this.f4906i = i3;
        this.f4901d.put(i3, this.f4902e.dataPosition());
        E(0);
        E(i3);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z2) {
        this.f4902e.writeInt(z2 ? 1 : 0);
    }

    private b(Parcel parcel, int i3, int i4, String str, androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4901d = new SparseIntArray();
        this.f4906i = -1;
        this.f4908k = -1;
        this.f4902e = parcel;
        this.f4903f = i3;
        this.f4904g = i4;
        this.f4907j = i3;
        this.f4905h = str;
    }
}
