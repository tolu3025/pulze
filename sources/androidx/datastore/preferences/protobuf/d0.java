package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class d0 {

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0492f f4064a;

        a(AbstractC0492f abstractC0492f) {
            this.f4064a = abstractC0492f;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.b
        public byte a(int i3) {
            return this.f4064a.b(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.d0.b
        public int size() {
            return this.f4064a.size();
        }
    }

    private interface b {
        byte a(int i3);

        int size();
    }

    static String a(AbstractC0492f abstractC0492f) {
        return b(new a(abstractC0492f));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i3 = 0; i3 < bVar.size(); i3++) {
            int iA = bVar.a(i3);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case V0.I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        str = "\\t";
                        break;
                    case V0.I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case V0.F.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb.append('\\');
                            sb.append((char) (((iA >>> 6) & 3) + 48));
                            sb.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(AbstractC0492f.n(str));
    }
}
