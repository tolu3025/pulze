package n1;

import android.view.PointerIcon;
import java.util.HashMap;
import k1.m;

/* JADX INFO: renamed from: n1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1038b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap f9956c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f9957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f9958b;

    /* JADX INFO: renamed from: n1.b$a */
    class a implements m.b {
        a() {
        }

        @Override // k1.m.b
        public void a(String str) {
            C1038b.this.f9957a.setPointerIcon(C1038b.this.d(str));
        }
    }

    /* JADX INFO: renamed from: n1.b$b, reason: collision with other inner class name */
    class C0152b extends HashMap {
        C0152b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* JADX INFO: renamed from: n1.b$c */
    public interface c {
        PointerIcon b(int i3);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C1038b(c cVar, m mVar) {
        this.f9957a = cVar;
        this.f9958b = mVar;
        mVar.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointerIcon d(String str) {
        if (f9956c == null) {
            f9956c = new C0152b();
        }
        return this.f9957a.b(((Integer) f9956c.getOrDefault(str, 1000)).intValue());
    }

    public void c() {
        this.f9958b.b(null);
    }
}
