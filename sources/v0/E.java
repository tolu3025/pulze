package V0;

import V0.C0431j;
import com.google.protobuf.AbstractC0780a;
import com.google.protobuf.AbstractC0806y;
import com.google.protobuf.C;
import com.google.protobuf.C0807z;
import com.google.protobuf.W;
import com.google.protobuf.f0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0806y implements W {
    private static final E DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile f0 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private C0431j endAt_;
    private C0807z limit_;
    private int offset_;
    private j select_;
    private C0431j startAt_;
    private h where_;
    private C.e from_ = AbstractC0806y.A();
    private C.e orderBy_ = AbstractC0806y.A();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2861a;

        static {
            int[] iArr = new int[AbstractC0806y.d.values().length];
            f2861a = iArr;
            try {
                iArr[AbstractC0806y.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2861a[AbstractC0806y.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2861a[AbstractC0806y.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2861a[AbstractC0806y.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2861a[AbstractC0806y.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2861a[AbstractC0806y.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2861a[AbstractC0806y.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends AbstractC0806y.a implements W {
        private b() {
            super(E.DEFAULT_INSTANCE);
        }

        public b A(C0431j.b bVar) {
            q();
            ((E) this.f6988b).A0((C0431j) bVar.n());
            return this;
        }

        public b B(h hVar) {
            q();
            ((E) this.f6988b).B0(hVar);
            return this;
        }

        public b w(c.a aVar) {
            q();
            ((E) this.f6988b).g0((c) aVar.n());
            return this;
        }

        public b x(i iVar) {
            q();
            ((E) this.f6988b).h0(iVar);
            return this;
        }

        public b y(C0431j.b bVar) {
            q();
            ((E) this.f6988b).y0((C0431j) bVar.n());
            return this;
        }

        public b z(C0807z.b bVar) {
            q();
            ((E) this.f6988b).z0((C0807z) bVar.n());
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends AbstractC0806y implements W {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final c DEFAULT_INSTANCE;
        private static volatile f0 PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            public a w(boolean z2) {
                q();
                ((c) this.f6988b).f0(z2);
                return this;
            }

            public a x(String str) {
                q();
                ((c) this.f6988b).g0(str);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC0806y.V(c.class, cVar);
        }

        private c() {
        }

        public static a e0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(boolean z2) {
            this.allDescendants_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        public boolean c0() {
            return this.allDescendants_;
        }

        public String d0() {
            return this.collectionId_;
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2861a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (c.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class d extends AbstractC0806y implements W {
        private static final d DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile f0 PARSER;
        private C.e filters_ = AbstractC0806y.A();
        private int op_;

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            public a w(Iterable iterable) {
                q();
                ((d) this.f6988b).c0(iterable);
                return this;
            }

            public a x(b bVar) {
                q();
                ((d) this.f6988b).i0(bVar);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        public enum b implements C.a {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final C.b f2866f = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2868a;

            class a implements C.b {
                a() {
                }
            }

            b(int i3) {
                this.f2868a = i3;
            }

            public static b e(int i3) {
                if (i3 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i3 == 1) {
                    return AND;
                }
                if (i3 != 2) {
                    return null;
                }
                return OR;
            }

            @Override // com.google.protobuf.C.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f2868a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            AbstractC0806y.V(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(Iterable iterable) {
            d0();
            AbstractC0780a.k(iterable, this.filters_);
        }

        private void d0() {
            C.e eVar = this.filters_;
            if (eVar.g()) {
                return;
            }
            this.filters_ = AbstractC0806y.L(eVar);
        }

        public static d e0() {
            return DEFAULT_INSTANCE;
        }

        public static a h0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i0(b bVar) {
            this.op_ = bVar.a();
        }

        public List f0() {
            return this.filters_;
        }

        public b g0() {
            b bVarE = b.e(this.op_);
            return bVarE == null ? b.UNRECOGNIZED : bVarE;
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2861a[dVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", h.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (d.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public enum e implements C.a {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final C.b f2873f = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2875a;

        class a implements C.b {
            a() {
            }
        }

        e(int i3) {
            this.f2875a = i3;
        }

        public static e e(int i3) {
            if (i3 == 0) {
                return DIRECTION_UNSPECIFIED;
            }
            if (i3 == 1) {
                return ASCENDING;
            }
            if (i3 != 2) {
                return null;
            }
            return DESCENDING;
        }

        @Override // com.google.protobuf.C.a
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f2875a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class f extends AbstractC0806y implements W {
        private static final f DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile f0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private g field_;
        private int op_;
        private I value_;

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(f.DEFAULT_INSTANCE);
            }

            public a w(g gVar) {
                q();
                ((f) this.f6988b).i0(gVar);
                return this;
            }

            public a x(b bVar) {
                q();
                ((f) this.f6988b).j0(bVar);
                return this;
            }

            public a y(I i3) {
                q();
                ((f) this.f6988b).k0(i3);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        public enum b implements C.a {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private static final C.b f2888s = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2890a;

            class a implements C.b {
                a() {
                }
            }

            b(int i3) {
                this.f2890a = i3;
            }

            public static b e(int i3) {
                switch (i3) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case I.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        return ARRAY_CONTAINS_ANY;
                    case I.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.C.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f2890a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            AbstractC0806y.V(f.class, fVar);
        }

        private f() {
        }

        public static f d0() {
            return DEFAULT_INSTANCE;
        }

        public static a h0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(b bVar) {
            this.op_ = bVar.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k0(I i3) {
            i3.getClass();
            this.value_ = i3;
            this.bitField0_ |= 2;
        }

        public g e0() {
            g gVar = this.field_;
            return gVar == null ? g.b0() : gVar;
        }

        public b f0() {
            b bVarE = b.e(this.op_);
            return bVarE == null ? b.UNRECOGNIZED : bVarE;
        }

        public I g0() {
            I i3 = this.value_;
            return i3 == null ? I.r0() : i3;
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2861a[dVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (f.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class g extends AbstractC0806y implements W {
        private static final g DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile f0 PARSER;
        private String fieldPath_ = "";

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(g.DEFAULT_INSTANCE);
            }

            public a w(String str) {
                q();
                ((g) this.f6988b).e0(str);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            AbstractC0806y.V(g.class, gVar);
        }

        private g() {
        }

        public static g b0() {
            return DEFAULT_INSTANCE;
        }

        public static a d0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        public String c0() {
            return this.fieldPath_;
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2861a[dVar.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (g.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class h extends AbstractC0806y implements W {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final h DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile f0 PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(h.DEFAULT_INSTANCE);
            }

            public a w(d.a aVar) {
                q();
                ((h) this.f6988b).j0((d) aVar.n());
                return this;
            }

            public a x(f.a aVar) {
                q();
                ((h) this.f6988b).k0((f) aVar.n());
                return this;
            }

            public a y(k.a aVar) {
                q();
                ((h) this.f6988b).l0((k) aVar.n());
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        public enum b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2896a;

            b(int i3) {
                this.f2896a = i3;
            }

            public static b e(int i3) {
                if (i3 == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i3 == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i3 == 2) {
                    return FIELD_FILTER;
                }
                if (i3 != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            AbstractC0806y.V(h.class, hVar);
        }

        private h() {
        }

        public static h e0() {
            return DEFAULT_INSTANCE;
        }

        public static a i0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(d dVar) {
            dVar.getClass();
            this.filterType_ = dVar;
            this.filterTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k0(f fVar) {
            fVar.getClass();
            this.filterType_ = fVar;
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l0(k kVar) {
            kVar.getClass();
            this.filterType_ = kVar;
            this.filterTypeCase_ = 3;
        }

        public d d0() {
            return this.filterTypeCase_ == 1 ? (d) this.filterType_ : d.e0();
        }

        public f f0() {
            return this.filterTypeCase_ == 2 ? (f) this.filterType_ : f.d0();
        }

        public b g0() {
            return b.e(this.filterTypeCase_);
        }

        public k h0() {
            return this.filterTypeCase_ == 3 ? (k) this.filterType_ : k.c0();
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2861a[dVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", d.class, f.class, k.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (h.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class i extends AbstractC0806y implements W {
        private static final i DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile f0 PARSER;
        private int bitField0_;
        private int direction_;
        private g field_;

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(i.DEFAULT_INSTANCE);
            }

            public a w(e eVar) {
                q();
                ((i) this.f6988b).f0(eVar);
                return this;
            }

            public a x(g gVar) {
                q();
                ((i) this.f6988b).g0(gVar);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            AbstractC0806y.V(i.class, iVar);
        }

        private i() {
        }

        public static a e0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(e eVar) {
            this.direction_ = eVar.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
            this.bitField0_ |= 1;
        }

        public e c0() {
            e eVarE = e.e(this.direction_);
            return eVarE == null ? e.UNRECOGNIZED : eVarE;
        }

        public g d0() {
            g gVar = this.field_;
            return gVar == null ? g.b0() : gVar;
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2861a[dVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (i.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class j extends AbstractC0806y implements W {
        private static final j DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile f0 PARSER;
        private C.e fields_ = AbstractC0806y.A();

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(j.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            AbstractC0806y.V(j.class, jVar);
        }

        private j() {
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2861a[dVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (j.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class k extends AbstractC0806y implements W {
        private static final k DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile f0 PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        public static final class a extends AbstractC0806y.a implements W {
            private a() {
                super(k.DEFAULT_INSTANCE);
            }

            public a w(g gVar) {
                q();
                ((k) this.f6988b).g0(gVar);
                return this;
            }

            public a x(b bVar) {
                q();
                ((k) this.f6988b).h0(bVar);
                return this;
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        public enum b implements C.a {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);


            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final C.b f2903m = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f2905a;

            class a implements C.b {
                a() {
                }
            }

            b(int i3) {
                this.f2905a = i3;
            }

            public static b e(int i3) {
                if (i3 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i3 == 2) {
                    return IS_NAN;
                }
                if (i3 == 3) {
                    return IS_NULL;
                }
                if (i3 == 4) {
                    return IS_NOT_NAN;
                }
                if (i3 != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            @Override // com.google.protobuf.C.a
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f2905a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            AbstractC0806y.V(k.class, kVar);
        }

        private k() {
        }

        public static k c0() {
            return DEFAULT_INSTANCE;
        }

        public static a f0() {
            return (a) DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(g gVar) {
            gVar.getClass();
            this.operandType_ = gVar;
            this.operandTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(b bVar) {
            this.op_ = bVar.a();
        }

        public g d0() {
            return this.operandTypeCase_ == 2 ? (g) this.operandType_ : g.b0();
        }

        public b e0() {
            b bVarE = b.e(this.op_);
            return bVarE == null ? b.UNRECOGNIZED : bVarE;
        }

        @Override // com.google.protobuf.AbstractC0806y
        protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f2861a[dVar.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f0 bVar = PARSER;
                    if (bVar == null) {
                        synchronized (k.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        E e3 = new E();
        DEFAULT_INSTANCE = e3;
        AbstractC0806y.V(E.class, e3);
    }

    private E() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(C0431j c0431j) {
        c0431j.getClass();
        this.startAt_ = c0431j;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(h hVar) {
        hVar.getClass();
        this.where_ = hVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(c cVar) {
        cVar.getClass();
        i0();
        this.from_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(i iVar) {
        iVar.getClass();
        j0();
        this.orderBy_.add(iVar);
    }

    private void i0() {
        C.e eVar = this.from_;
        if (eVar.g()) {
            return;
        }
        this.from_ = AbstractC0806y.L(eVar);
    }

    private void j0() {
        C.e eVar = this.orderBy_;
        if (eVar.g()) {
            return;
        }
        this.orderBy_ = AbstractC0806y.L(eVar);
    }

    public static E k0() {
        return DEFAULT_INSTANCE;
    }

    public static b x0() {
        return (b) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(C0431j c0431j) {
        c0431j.getClass();
        this.endAt_ = c0431j;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(C0807z c0807z) {
        c0807z.getClass();
        this.limit_ = c0807z;
        this.bitField0_ |= 16;
    }

    public C0431j l0() {
        C0431j c0431j = this.endAt_;
        return c0431j == null ? C0431j.f0() : c0431j;
    }

    public c m0(int i3) {
        return (c) this.from_.get(i3);
    }

    public int n0() {
        return this.from_.size();
    }

    public C0807z o0() {
        C0807z c0807z = this.limit_;
        return c0807z == null ? C0807z.b0() : c0807z;
    }

    public i p0(int i3) {
        return (i) this.orderBy_.get(i3);
    }

    public int q0() {
        return this.orderBy_.size();
    }

    public C0431j r0() {
        C0431j c0431j = this.startAt_;
        return c0431j == null ? C0431j.f0() : c0431j;
    }

    public h s0() {
        h hVar = this.where_;
        return hVar == null ? h.e0() : hVar;
    }

    public boolean t0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean u0() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean v0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean w0() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0806y
    protected final Object y(AbstractC0806y.d dVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f2861a[dVar.ordinal()]) {
            case 1:
                return new E();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0806y.N(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", c.class, "where_", "orderBy_", i.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f0 bVar = PARSER;
                if (bVar == null) {
                    synchronized (E.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC0806y.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
