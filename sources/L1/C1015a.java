package l1;

import b1.AbstractC0525b;
import java.nio.ByteBuffer;
import l1.InterfaceC1017c;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1017c f9754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f9756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1017c.InterfaceC0146c f9757d;

    /* JADX INFO: renamed from: l1.a$b */
    private final class b implements InterfaceC1017c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f9758a;

        /* JADX INFO: renamed from: l1.a$b$a, reason: collision with other inner class name */
        class C0145a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1017c.b f9760a;

            C0145a(InterfaceC1017c.b bVar) {
                this.f9760a = bVar;
            }

            @Override // l1.C1015a.e
            public void a(Object obj) {
                this.f9760a.a(C1015a.this.f9756c.a(obj));
            }
        }

        private b(d dVar) {
            this.f9758a = dVar;
        }

        @Override // l1.InterfaceC1017c.a
        public void a(ByteBuffer byteBuffer, InterfaceC1017c.b bVar) {
            try {
                this.f9758a.a(C1015a.this.f9756c.b(byteBuffer), new C0145a(bVar));
            } catch (RuntimeException e3) {
                AbstractC0525b.c("BasicMessageChannel#" + C1015a.this.f9755b, "Failed to handle message", e3);
                bVar.a(null);
            }
        }
    }

    /* JADX INFO: renamed from: l1.a$c */
    private final class c implements InterfaceC1017c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f9762a;

        private c(e eVar) {
            this.f9762a = eVar;
        }

        @Override // l1.InterfaceC1017c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f9762a.a(C1015a.this.f9756c.b(byteBuffer));
            } catch (RuntimeException e3) {
                AbstractC0525b.c("BasicMessageChannel#" + C1015a.this.f9755b, "Failed to handle message reply", e3);
            }
        }
    }

    /* JADX INFO: renamed from: l1.a$d */
    public interface d {
        void a(Object obj, e eVar);
    }

    /* JADX INFO: renamed from: l1.a$e */
    public interface e {
        void a(Object obj);
    }

    public C1015a(InterfaceC1017c interfaceC1017c, String str, i iVar) {
        this(interfaceC1017c, str, iVar, null);
    }

    public void c(Object obj) {
        d(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void d(Object obj, e eVar) {
        this.f9754a.c(this.f9755b, this.f9756c.a(obj), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l1.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l1.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l1.c$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void e(d dVar) {
        if (this.f9757d != null) {
            this.f9754a.h(this.f9755b, dVar != null ? new b(dVar) : null, this.f9757d);
        } else {
            this.f9754a.b(this.f9755b, dVar != null ? new b(dVar) : 0);
        }
    }

    public C1015a(InterfaceC1017c interfaceC1017c, String str, i iVar, InterfaceC1017c.InterfaceC0146c interfaceC0146c) {
        this.f9754a = interfaceC1017c;
        this.f9755b = str;
        this.f9756c = iVar;
        this.f9757d = interfaceC0146c;
    }
}
