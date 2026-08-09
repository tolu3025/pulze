package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import b1.AbstractC0525b;
import com.google.android.gms.common.api.a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.n;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class m extends BaseInputConnection implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f7828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k1.w f7830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f7831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EditorInfo f7832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ExtractedTextRequest f7833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CursorAnchorInfo.Builder f7835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ExtractedText f7836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputMethodManager f7837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Layout f7838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C0921a f7839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f7840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7841n;

    public interface a {
        boolean b(KeyEvent keyEvent);
    }

    public m(View view, int i3, k1.w wVar, a aVar, n nVar, EditorInfo editorInfo) {
        this(view, i3, wVar, aVar, nVar, editorInfo, new FlutterJNI());
    }

    private boolean b(int i3) {
        if (i3 == 16908319) {
            setSelection(0, this.f7831d.length());
            return true;
        }
        if (i3 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f7831d);
            int selectionEnd = Selection.getSelectionEnd(this.f7831d);
            if (selectionStart != selectionEnd) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f7828a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f7831d.subSequence(iMin, iMax)));
                this.f7831d.delete(iMin, iMax);
                setSelection(iMin, iMin);
            }
            return true;
        }
        if (i3 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f7831d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f7831d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f7828a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f7831d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i3 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f7828a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(this.f7828a.getContext());
            int iMax2 = Math.max(0, Selection.getSelectionStart(this.f7831d));
            int iMax3 = Math.max(0, Selection.getSelectionEnd(this.f7831d));
            int iMin2 = Math.min(iMax2, iMax3);
            int iMax4 = Math.max(iMax2, iMax3);
            if (iMin2 != iMax4) {
                this.f7831d.delete(iMin2, iMax4);
            }
            this.f7831d.insert(iMin2, charSequenceCoerceToText);
            int length = iMin2 + charSequenceCoerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    private CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f7835h;
        if (builder == null) {
            this.f7835h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f7835h.setSelectionRange(this.f7831d.i(), this.f7831d.h());
        int iG = this.f7831d.g();
        int iF = this.f7831d.f();
        if (iG < 0 || iF <= iG) {
            this.f7835h.setComposingText(-1, "");
        } else {
            this.f7835h.setComposingText(iG, this.f7831d.toString().subSequence(iG, iF));
        }
        return this.f7835h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f7836i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f7831d.i();
        this.f7836i.selectionEnd = this.f7831d.h();
        this.f7836i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f7831d.toString() : this.f7831d;
        return this.f7836i;
    }

    private boolean e(boolean z2, boolean z3) {
        int selectionStart = Selection.getSelectionStart(this.f7831d);
        int selectionEnd = Selection.getSelectionEnd(this.f7831d);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int iMax = z2 ? Math.max(this.f7839l.b(this.f7831d, selectionEnd), 0) : Math.min(this.f7839l.a(this.f7831d, selectionEnd), this.f7831d.length());
        if (selectionStart != selectionEnd || z3) {
            setSelection(selectionStart, iMax);
            return true;
        }
        setSelection(iMax, iMax);
        return true;
    }

    private boolean g(boolean z2, boolean z3) {
        int selectionStart = Selection.getSelectionStart(this.f7831d);
        int selectionEnd = Selection.getSelectionEnd(this.f7831d);
        boolean z4 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z3) {
            z4 = true;
        }
        beginBatchEdit();
        if (z4) {
            if (z2) {
                Selection.moveUp(this.f7831d, this.f7838k);
            } else {
                Selection.moveDown(this.f7831d, this.f7838k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f7831d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z2) {
                Selection.extendUp(this.f7831d, this.f7838k);
            } else {
                Selection.extendDown(this.f7831d, this.f7838k);
            }
            setSelection(Selection.getSelectionStart(this.f7831d), Selection.getSelectionEnd(this.f7831d));
        }
        endBatchEdit();
        return true;
    }

    private byte[] h(InputStream inputStream, int i3) {
        int i4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i3];
        while (true) {
            try {
                i4 = inputStream.read(bArr);
            } catch (IOException unused) {
                i4 = -1;
            }
            if (i4 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i4);
        }
    }

    @Override // io.flutter.plugin.editing.n.b
    public void a(boolean z2, boolean z3, boolean z4) {
        this.f7837j.updateSelection(this.f7828a, this.f7831d.i(), this.f7831d.h(), this.f7831d.g(), this.f7831d.f());
        ExtractedTextRequest extractedTextRequest = this.f7833f;
        if (extractedTextRequest != null) {
            this.f7837j.updateExtractedText(this.f7828a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f7834g) {
            this.f7837j.updateCursorAnchorInfo(this.f7828a, c());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f7831d.b();
        this.f7841n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i3) {
        return super.clearMetaKeyStates(i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f7831d.l(this);
        while (this.f7841n > 0) {
            endBatchEdit();
            this.f7841n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i3 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f7828a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                byte[] bArrH = h(inputStreamOpenInputStream, 65536);
                                HashMap map = new HashMap();
                                map.put("mimeType", mimeType);
                                map.put("data", bArrH);
                                map.put("uri", contentUri.toString());
                                this.f7830c.b(this.f7829b, map);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i3) {
        return super.commitText(charSequence, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i3, int i4) {
        if (this.f7831d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        return super.deleteSurroundingTextInCodePoints(i3, i4);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f7841n--;
        this.f7831d.d();
        return zEndBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f7832e;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f7831d);
            int selectionEnd = Selection.getSelectionEnd(this.f7831d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (iMin != iMax) {
                    this.f7831d.delete(iMin, iMax);
                }
                this.f7831d.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                int i3 = iMin + 1;
                setSelection(i3, i3);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f7831d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        boolean z2 = (i3 & 1) != 0;
        if (z2 == (this.f7833f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z2 ? "on" : "off");
            AbstractC0525b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f7833f = z2 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean zB = b(i3);
        endBatchEdit();
        return zB;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i3) {
        if (i3 == 0) {
            this.f7830c.o(this.f7829b);
        } else if (i3 == 1) {
            this.f7830c.g(this.f7829b);
        } else if (i3 == 2) {
            this.f7830c.f(this.f7829b);
        } else if (i3 == 3) {
            this.f7830c.l(this.f7829b);
        } else if (i3 == 4) {
            this.f7830c.m(this.f7829b);
        } else if (i3 == 5) {
            this.f7830c.h(this.f7829b);
        } else if (i3 != 7) {
            this.f7830c.e(this.f7829b);
        } else {
            this.f7830c.j(this.f7829b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f7830c.i(this.f7829b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i3) {
        if ((i3 & 1) != 0) {
            this.f7837j.updateCursorAnchorInfo(this.f7828a, c());
        }
        boolean z2 = (i3 & 2) != 0;
        if (z2 != this.f7834g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z2 ? "on" : "off");
            AbstractC0525b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f7834g = z2;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f7840m.b(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i3, int i4) {
        return super.setComposingRegion(i3, i4);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i3) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i3) : super.setComposingText(charSequence, i3);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i3, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i4);
        endBatchEdit();
        return selection;
    }

    public m(View view, int i3, k1.w wVar, a aVar, n nVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f7834g = false;
        this.f7836i = new ExtractedText();
        this.f7841n = 0;
        this.f7828a = view;
        this.f7829b = i3;
        this.f7830c = wVar;
        this.f7831d = nVar;
        nVar.a(this);
        this.f7832e = editorInfo;
        this.f7840m = aVar;
        this.f7839l = new C0921a(flutterJNI);
        this.f7838k = new DynamicLayout(nVar, new TextPaint(), a.e.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7837j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }
}
