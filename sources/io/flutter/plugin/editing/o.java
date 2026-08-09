package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import k1.u;
import l1.k;
import m1.C1034f;

/* JADX INFO: loaded from: classes.dex */
public class o implements u.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k1.u f7856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextServicesManager f7857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SpellCheckerSession f7858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    k.d f7859d;

    public o(TextServicesManager textServicesManager, k1.u uVar) {
        this.f7857b = textServicesManager;
        this.f7856a = uVar;
        uVar.b(this);
    }

    @Override // k1.u.b
    public void a(String str, String str2, k.d dVar) {
        if (this.f7859d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
        } else {
            this.f7859d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.f7856a.b(null);
        SpellCheckerSession spellCheckerSession = this.f7858c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale localeB = C1034f.b(str);
        if (this.f7858c == null) {
            this.f7858c = this.f7857b.newSpellCheckerSession(null, localeB, this, true);
        }
        this.f7858c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f7859d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            if (sentenceSuggestionsInfo == null) {
                dVar = this.f7859d;
                arrayList = new ArrayList();
            } else {
                for (int i3 = 0; i3 < sentenceSuggestionsInfo.getSuggestionsCount(); i3++) {
                    SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i3);
                    int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                    if (suggestionsCount > 0) {
                        HashMap map = new HashMap();
                        int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i3);
                        int lengthAt = sentenceSuggestionsInfo.getLengthAt(i3) + offsetAt;
                        map.put("startIndex", Integer.valueOf(offsetAt));
                        map.put("endIndex", Integer.valueOf(lengthAt));
                        ArrayList arrayList2 = new ArrayList();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < suggestionsCount; i4++) {
                            String suggestionAt = suggestionsInfoAt.getSuggestionAt(i4);
                            if (!suggestionAt.equals("")) {
                                arrayList2.add(suggestionAt);
                                z2 = true;
                            }
                        }
                        if (z2) {
                            map.put("suggestions", arrayList2);
                            arrayList.add(map);
                        }
                    }
                }
                dVar = this.f7859d;
            }
        }
        dVar.a(arrayList);
        this.f7859d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
