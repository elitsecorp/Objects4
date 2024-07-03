package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.bbcodeview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.bbcodeview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public elicorp.pilot.bctextengine._bcparagraphstyle _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public elicorp.pilot.bctextengine _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public elicorp.pilot.bctextengine._bcparagraph _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public elicorp.pilot.bbcodeparser._bbcodeparsedata _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xorderedmap _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public static class _internalbbviewurl{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List Lines;
public void Initialize() {
IsInitialized = true;
Lines = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 106;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 107;BA.debugLine="sv.ScrollViewContentWidth = Width";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setScrollViewContentWidth((int) (_width));
 //BA.debugLineNum = 108;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) { 
if (true) return "";};
 //BA.debugLineNum = 109;BA.debugLine="If Runs.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized()) { 
 //BA.debugLineNum = 110;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.NeedToReparseWhenResize /*boolean*/ ) { 
 //BA.debugLineNum = 111;BA.debugLine="ParseAndDraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 }else {
 //BA.debugLineNum = 113;BA.debugLine="Redraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 };
 };
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 9;BA.debugLine="Private Runs As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Public Style As BCParagraphStyle";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new elicorp.pilot.bctextengine._bcparagraphstyle();
 //BA.debugLineNum = 12;BA.debugLine="Private mTextEngine As BCTextEngine";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new elicorp.pilot.bctextengine();
 //BA.debugLineNum = 13;BA.debugLine="Private mText As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 14;BA.debugLine="Public ForegroundImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public BackgroundImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public Paragraph As BCParagraph";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new elicorp.pilot.bctextengine._bcparagraph();
 //BA.debugLineNum = 17;BA.debugLine="Private TouchPanel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public sv As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Public Padding As B4XRect";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 20;BA.debugLine="Public ParseData As BBCodeParseData";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new elicorp.pilot.bbcodeparser._bbcodeparsedata();
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
_vvvvvvvvvvvvvvvvvvvvvvvv7 = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Public LazyLoading As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 23;BA.debugLine="Private ImageViewsCache As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 24;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new elicorp.pilot.b4xorderedmap();
 //BA.debugLineNum = 25;BA.debugLine="Public ExternalRuns As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 26;BA.debugLine="Public DisableAutomaticDrawingsInLazyMode As Bool";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
 //BA.debugLineNum = 27;BA.debugLine="Type InternalBBViewURL (Lines As List)";
;
 //BA.debugLineNum = 28;BA.debugLine="Public RTL As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
 //BA.debugLineNum = 29;BA.debugLine="Private URLToLines As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 30;BA.debugLine="Public AutoUnderlineURLs As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(boolean _invisibleonly,anywheresoftware.b4a.objects.collections.List _existing,int _offset,int _height) throws Exception{
elicorp.pilot.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
 //BA.debugLineNum = 182;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
 //BA.debugLineNum = 183;BA.debugLine="For Each Line As BCTextLine In Existing";
{
final anywheresoftware.b4a.BA.IterableList group1 = _existing;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (elicorp.pilot.bctextengine._bctextline)(group1.Get(index1));
 //BA.debugLineNum = 184;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
if (_invisibleonly==__c.False || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_line,_offset,_height)==__c.False) { 
 //BA.debugLineNum = 185;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ((Object)(_line))));
 //BA.debugLineNum = 186;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
 //BA.debugLineNum = 187;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 188;BA.debugLine="ImageViewsCache.Add(xiv)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Add((Object)(_xiv.getObject()));
 //BA.debugLineNum = 189;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
if (_invisibleonly==__c.True) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ ((Object)(_line));};
 };
 }
};
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
elicorp.pilot.bctextengine._bctextline _line = null;
elicorp.pilot.bctextengine._bcunbreakabletext _un = null;
elicorp.pilot.bctextengine._bcsinglestylesection _st = null;
elicorp.pilot.bbcodeview._internalbbviewurl _extra = null;
 //BA.debugLineNum = 304;BA.debugLine="Private Sub CollectURLs";
 //BA.debugLineNum = 305;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (elicorp.pilot.bctextengine._bctextline)(group1.Get(index1));
 //BA.debugLineNum = 306;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (elicorp.pilot.bctextengine._bcunbreakabletext)(group2.Get(index2));
 //BA.debugLineNum = 307;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
{
final anywheresoftware.b4a.BA.IterableList group3 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (elicorp.pilot.bctextengine._bcsinglestylesection)(group3.Get(index3));
 //BA.debugLineNum = 308;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*elicorp.pilot.bctextengine._bctextrun*/ ))) { 
 //BA.debugLineNum = 309;BA.debugLine="Dim extra As InternalBBViewURL";
_extra = new elicorp.pilot.bbcodeview._internalbbviewurl();
 //BA.debugLineNum = 310;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.ContainsKey((Object)(_st.Run /*elicorp.pilot.bctextengine._bctextrun*/ ))==__c.False) { 
 //BA.debugLineNum = 311;BA.debugLine="extra = CreateBCURLExtraData";
_extra = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 //BA.debugLineNum = 312;BA.debugLine="URLToLines.Put(st.Run, extra)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Put((Object)(_st.Run /*elicorp.pilot.bctextengine._bctextrun*/ ),(Object)(_extra));
 }else {
 //BA.debugLineNum = 314;BA.debugLine="extra = URLToLines.Get(st.Run)";
_extra = (elicorp.pilot.bbcodeview._internalbbviewurl)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get((Object)(_st.Run /*elicorp.pilot.bctextengine._bctextrun*/ )));
 };
 //BA.debugLineNum = 316;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
if (_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_line))==-1) { 
 //BA.debugLineNum = 317;BA.debugLine="extra.Lines.Add(line)";
_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 };
 };
 }
};
 }
};
 }
};
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.bbcodeview._internalbbviewurl  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
elicorp.pilot.bbcodeview._internalbbviewurl _t1 = null;
 //BA.debugLineNum = 325;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
 //BA.debugLineNum = 326;BA.debugLine="Dim t1 As InternalBBViewURL";
_t1 = new elicorp.pilot.bbcodeview._internalbbviewurl();
 //BA.debugLineNum = 327;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 328;BA.debugLine="t1.Lines.Initialize";
_t1.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 329;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.ScrollViewWrapper _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 59;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 60;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 61;BA.debugLine="Tag = mBase.Tag";
_vvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvv1.getTag();
 //BA.debugLineNum = 62;BA.debugLine="mBase.Tag = Me";
_vvvvvvvvvvvvvvvv1.setTag(this);
 //BA.debugLineNum = 68;BA.debugLine="Dim sp As ScrollView";
_sp = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 69;BA.debugLine="sp.Initialize2(50dip, \"sv\")";
_sp.Initialize2(ba,__c.DipToCurrent((int) (50)),"sv");
 //BA.debugLineNum = 75;BA.debugLine="LazyLoading = Props.GetDefault(\"LazyLoading\", Tru";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.True)));
 //BA.debugLineNum = 76;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = BA.ObjectToBoolean(_props.GetDefault((Object)("AutoUnderline"),(Object)(__c.True)));
 //BA.debugLineNum = 77;BA.debugLine="If LazyLoading Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 78;BA.debugLine="ImageViewsCache.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
 //BA.debugLineNum = 79;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvv5._vvv7 /*elicorp.pilot.b4xorderedmap*/ (ba);
 };
 //BA.debugLineNum = 81;BA.debugLine="sv = sp";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="sv.Color = mBase.Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setColor(_vvvvvvvvvvvvvvvv1.getColor());
 //BA.debugLineNum = 83;BA.debugLine="sv.ScrollViewInnerPanel.Color = mBase.Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewInnerPanel().setColor(_vvvvvvvvvvvvvvvv1.getColor());
 //BA.debugLineNum = 84;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
_vvvvvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 85;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="mText = xlbl.Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _xlbl.getText();
 //BA.debugLineNum = 87;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.DefaultColor /*int*/  = _xlbl.getTextColor();
 //BA.debugLineNum = 88;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
 //BA.debugLineNum = 89;BA.debugLine="ParseData.ViewsPanel = sv.ScrollViewInnerPanel";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewInnerPanel();
 //BA.debugLineNum = 90;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
if (_vvvvvvvvv6.SubExists(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_linkclicked",(int) (1))) { 
 //BA.debugLineNum = 91;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvv6.CreatePanel(ba,"TouchPanel");
 };
 //BA.debugLineNum = 98;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _vvvvvvvvv6.CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub DrawVisibleRegion";
 //BA.debugLineNum = 142;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) { 
if (true) return "";};
 //BA.debugLineNum = 143;BA.debugLine="UpdateVisibleRegion(sv.ScrollViewOffsetY * mTextE";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewOffsetY()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*float*/ ),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getHeight()*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*float*/ ));
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.bctextengine._bctextrun  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(float _x,float _y) throws Exception{
int _offsetx = 0;
int _offsety = 0;
elicorp.pilot.bctextengine._bcsinglestylesection _single = null;
 //BA.debugLineNum = 269;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
 //BA.debugLineNum = 270;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
{
final Object[] group1 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (5)))};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = (int)(BA.ObjectToNumber(group1[index1]));
 //BA.debugLineNum = 271;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
{
final Object[] group2 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (3))),(Object)(__c.DipToCurrent((int) (3)))};
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = (int)(BA.ObjectToNumber(group2[index2]));
 //BA.debugLineNum = 272;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
_single = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.bctextengine._bcsinglestylesection*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,(int) (_x+_offsetx),(int) (_y+_offsety));
 //BA.debugLineNum = 273;BA.debugLine="If single <> Null Then";
if (_single!= null) { 
 //BA.debugLineNum = 274;BA.debugLine="Return single.Run";
if (true) return _single.Run /*elicorp.pilot.bctextengine._bctextrun*/ ;
 };
 }
};
 }
};
 //BA.debugLineNum = 278;BA.debugLine="Return Null";
if (true) return (elicorp.pilot.bctextengine._bctextrun)(__c.Null);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 138;BA.debugLine="Return mText";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.bctextengine  _getvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
 //BA.debugLineNum = 129;BA.debugLine="Return mTextEngine";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub getViews As Map";
 //BA.debugLineNum = 52;BA.debugLine="Return ParseData.Views";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Views /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 36;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 38;BA.debugLine="ForegroundImageView = iv";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="ParseData.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="ParseData.Views.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 41;BA.debugLine="ParseData.URLs.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 42;BA.debugLine="If xui.IsB4J Then";
if (_vvvvvvvvv6.getIsB4J()) { 
 //BA.debugLineNum = 43;BA.debugLine="Padding.Initialize(5dip, 5dip, 20dip, 5dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (20))),(float) (__c.DipToCurrent((int) (5))));
 }else {
 //BA.debugLineNum = 45;BA.debugLine="Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
 };
 //BA.debugLineNum = 47;BA.debugLine="ParseData.ImageCache.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 48;BA.debugLine="URLToLines.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(elicorp.pilot.bctextengine._bctextline _line,int _offset,int _height) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
 //BA.debugLineNum = 179;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
if (true) return _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_offset && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_offset+_height;
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(elicorp.pilot.bctextengine._bctextrun _run) throws Exception{
elicorp.pilot.bctextengine._bctextrun _r = null;
elicorp.pilot.bbcodeview._internalbbviewurl _extra = null;
elicorp.pilot.bctextengine._bctextline _line = null;
 //BA.debugLineNum = 281;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
 //BA.debugLineNum = 291;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_r = (elicorp.pilot.bctextengine._bctextrun)(group1.Get(index1));
 //BA.debugLineNum = 292;BA.debugLine="If r.Underline <> (r = Run) Then";
if (_r.Underline /*boolean*/ !=((_r).equals(_run))) { 
 //BA.debugLineNum = 293;BA.debugLine="r.Underline = r = Run";
_r.Underline /*boolean*/  = (_r).equals(_run);
 //BA.debugLineNum = 294;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
_extra = (elicorp.pilot.bbcodeview._internalbbviewurl)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Get((Object)(_r)));
 //BA.debugLineNum = 295;BA.debugLine="For Each line As BCTextLine In extra.Lines";
{
final anywheresoftware.b4a.BA.IterableList group5 = _extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_line = (elicorp.pilot.bctextengine._bctextline)(group5.Get(index5));
 //BA.debugLineNum = 296;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*boolean*/ ((Object)(_line))) { 
 //BA.debugLineNum = 297;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ (_line,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ((Object)(_line)))),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
anywheresoftware.b4a.objects.collections.List _pe = null;
 //BA.debugLineNum = 195;BA.debugLine="Public Sub ParseAndDraw";
 //BA.debugLineNum = 196;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.NeedToReparseWhenResize /*boolean*/  = __c.False;
 //BA.debugLineNum = 197;BA.debugLine="ParseData.Text = mText";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Text /*String*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 198;BA.debugLine="ParseData.URLs.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
 //BA.debugLineNum = 199;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Width /*int*/  = (int) ((_vvvvvvvvvvvvvvvv1.getWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getLeft()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getRight()));
 //BA.debugLineNum = 200;BA.debugLine="If RTL Then mTextEngine.RTLAware = True";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*boolean*/  = __c.True;};
 //BA.debugLineNum = 201;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*elicorp.pilot.bbcodeparser*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.objects.collections.List*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 202;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewInnerPanel().RemoveAllViews();
 //BA.debugLineNum = 203;BA.debugLine="If TouchPanel.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IsInitialized()) { 
 //BA.debugLineNum = 204;BA.debugLine="sv.ScrollViewInnerPanel.AddView(TouchPanel, 0, 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewInnerPanel().AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
 //BA.debugLineNum = 206;BA.debugLine="sv.ScrollViewInnerPanel.AddView(ForegroundImageVi";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewInnerPanel().AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 207;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized() && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getSize()>0) { 
 //BA.debugLineNum = 208;BA.debugLine="Runs = ExternalRuns";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
 }else {
 //BA.debugLineNum = 210;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*elicorp.pilot.bbcodeparser*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.objects.collections.List*/ (_pe,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 };
 //BA.debugLineNum = 213;BA.debugLine="Redraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Public Sub Redraw";
 //BA.debugLineNum = 217;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.bctextengine._bcparagraphstyle*/ ();
 //BA.debugLineNum = 218;BA.debugLine="Style.Padding = Padding";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 219;BA.debugLine="Style.MaxWidth = mBase.Width";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.MaxWidth /*int*/  = _vvvvvvvvvvvvvvvv1.getWidth();
 //BA.debugLineNum = 220;BA.debugLine="Style.ResizeHeightAutomatically = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.ResizeHeightAutomatically /*boolean*/  = __c.True;
 //BA.debugLineNum = 221;BA.debugLine="Style.RTL = RTL";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.RTL /*boolean*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 222;BA.debugLine="URLToLines.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Clear();
 //BA.debugLineNum = 223;BA.debugLine="If LazyLoading Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 224;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Ke";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(__c.False,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.objects.collections.List*/ (),(int) (0),(int) (0));
 //BA.debugLineNum = 225;BA.debugLine="UsedImageViews.Clear";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ ();
 //BA.debugLineNum = 226;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Ru";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*elicorp.pilot.bctextengine._bcparagraph*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 227;BA.debugLine="ForegroundImageView.SetLayoutAnimated(0, Style.P";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.SetLayoutAnimated((int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewContentWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewContentHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
 //BA.debugLineNum = 228;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
 //BA.debugLineNum = 229;BA.debugLine="CollectURLs";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 };
 //BA.debugLineNum = 231;BA.debugLine="DrawVisibleRegion";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 }else {
 //BA.debugLineNum = 233;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, Fo";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvv4 /*elicorp.pilot.bctextengine._bcparagraph*/ (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 };
 //BA.debugLineNum = 235;BA.debugLine="If TouchPanel.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IsInitialized()) { 
 //BA.debugLineNum = 236;BA.debugLine="TouchPanel.SetLayoutAnimated(0, ForegroundImageV";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getLeft(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getHeight());
 };
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _t) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Public Sub setText(t As String)";
 //BA.debugLineNum = 133;BA.debugLine="mText = t";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _t;
 //BA.debugLineNum = 134;BA.debugLine="ParseAndDraw";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvv2(elicorp.pilot.bctextengine _b) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
 //BA.debugLineNum = 119;BA.debugLine="mTextEngine = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _b;
 //BA.debugLineNum = 123;BA.debugLine="If mText <> \"\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3).equals("") == false) { 
 //BA.debugLineNum = 124;BA.debugLine="setText(mText)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 };
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub setViews (m As Map)";
 //BA.debugLineNum = 56;BA.debugLine="ParseData.Views = m";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Views /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(int _position) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
 //BA.debugLineNum = 340;BA.debugLine="If LazyLoading Then DrawVisibleRegion";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();};
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(int _action,float _x,float _y) throws Exception{
elicorp.pilot.bctextengine._bctextrun _run = null;
String _url = "";
 //BA.debugLineNum = 240;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
 //BA.debugLineNum = 241;BA.debugLine="Dim run As BCTextRun = Null";
_run = (elicorp.pilot.bctextengine._bctextrun)(__c.Null);
 //BA.debugLineNum = 242;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getSize()>0 || _action==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 243;BA.debugLine="run = FindTouchedRun(X, Y)";
_run = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_x,_y);
 };
 //BA.debugLineNum = 245;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
if (_run!= null && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_run))) { 
 //BA.debugLineNum = 246;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 247;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
_url = BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_run)));
 //BA.debugLineNum = 248;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvv7+"_LinkClicked",(Object)(_url));
 //BA.debugLineNum = 249;BA.debugLine="MarkURL(Null)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((elicorp.pilot.bctextengine._bctextrun)(__c.Null));
 }else if((_vvvvvvvvv6.getIsB4i() && _action==4) || (_vvvvvvvvv6.getIsB4A() && _action==3)) { 
 //BA.debugLineNum = 251;BA.debugLine="MarkURL(Null)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((elicorp.pilot.bctextengine._bctextrun)(__c.Null));
 }else {
 //BA.debugLineNum = 254;BA.debugLine="MarkURL(run)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_run);
 };
 //BA.debugLineNum = 256;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 258;BA.debugLine="MarkURL(Null)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1((elicorp.pilot.bctextengine._bctextrun)(__c.Null));
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(int _offsety,int _height) throws Exception{
boolean _foundfirst = false;
anywheresoftware.b4a.objects.collections.List _existing = null;
elicorp.pilot.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 147;BA.debugLine="Public Sub UpdateVisibleRegion (OffsetY As Int, He";
 //BA.debugLineNum = 148;BA.debugLine="Dim foundFirst As Boolean";
_foundfirst = false;
 //BA.debugLineNum = 149;BA.debugLine="Dim Existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 150;BA.debugLine="Existing.Initialize";
_existing.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
_existing.AddAll(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.objects.collections.List*/ ());
 //BA.debugLineNum = 152;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(__c.True,_existing,_offsety,_height);
 //BA.debugLineNum = 153;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_line = (elicorp.pilot.bctextengine._bctextline)(group6.Get(index6));
 //BA.debugLineNum = 154;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_line,_offsety,_height)) { 
 //BA.debugLineNum = 155;BA.debugLine="foundFirst = True";
_foundfirst = __c.True;
 //BA.debugLineNum = 156;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*boolean*/ ((Object)(_line))) { 
 //BA.debugLineNum = 157;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 159;BA.debugLine="Dim xiv As B4XView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 160;BA.debugLine="If ImageViewsCache.Size = 0 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getSize()==0) { 
 //BA.debugLineNum = 161;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 162;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 163;BA.debugLine="xiv = iv";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 }else {
 //BA.debugLineNum = 165;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getSize()-1))));
 //BA.debugLineNum = 166;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.RemoveAt((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getSize()-1));
 };
 //BA.debugLineNum = 168;BA.debugLine="sv.ScrollViewInnerPanel.AddView(xiv, 0, 0, 0, 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getScrollViewInnerPanel().AddView((android.view.View)(_xiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 169;BA.debugLine="xiv.SendToBack";
_xiv.SendToBack();
 //BA.debugLineNum = 170;BA.debugLine="mTextEngine.DrawSingleLine(Line, xiv, Paragraph";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ (_line,_xiv,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 171;BA.debugLine="UsedImageViews.Put(Line, xiv)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ ((Object)(_line),(Object)(_xiv.getObject()));
 }else {
 //BA.debugLineNum = 173;BA.debugLine="If foundFirst Then Exit";
if (_foundfirst) { 
if (true) break;};
 };
 }
};
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SETTEXTENGINE"))
	return _setvvvvvvvvvvvvvv2((elicorp.pilot.bctextengine) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
