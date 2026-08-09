package l1;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9776a = new f();

    private f() {
    }

    @Override // l1.i
    public ByteBuffer a(Object obj) {
        q qVar;
        String string;
        if (obj == null) {
            return null;
        }
        Object objA = h.a(obj);
        if (objA instanceof String) {
            qVar = q.f9796b;
            string = JSONObject.quote((String) objA);
        } else {
            qVar = q.f9796b;
            string = objA.toString();
        }
        return qVar.a(string);
    }

    @Override // l1.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(q.f9796b.b(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
