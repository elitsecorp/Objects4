package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class view_ad extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.view_ad");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.view_ad.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webvw1 = null;
public String _my_title = "";
public String _page_to_load = "";
public String _load_type = "";
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public void  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(elicorp.pilot.view_ad parent,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this._root1 = _root1;
}
elicorp.pilot.view_ad parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 17;BA.debugLine="Root = Root1";
parent._vvvvvvvvv5 = _root1;
 //BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"view_ad\")	'load the layout to Ro";
parent._vvvvvvvvv5.LoadLayout("view_ad",ba);
 //BA.debugLineNum = 19;BA.debugLine="B4XPages.SetTitle(Me,my_title)";
parent._vvvvvvvvvvvv4._vvv3 /*String*/ (ba,parent,(Object)(parent._my_title));
 //BA.debugLineNum = 20;BA.debugLine="If load_type=\"url_show\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._load_type).equals("url_show")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 21;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,this,(int) (2000));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 //BA.debugLineNum = 22;BA.debugLine="webvw1.LoadUrl(page_to_load)";
parent._webvw1.LoadUrl(parent._page_to_load);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_vvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private webvw1 As WebView";
_webvw1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public my_title As String";
_my_title = "";
 //BA.debugLineNum = 6;BA.debugLine="Public page_to_load As String";
_page_to_load = "";
 //BA.debugLineNum = 7;BA.debugLine="Public load_type As String";
_load_type = "";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public String  _load_page(String _url) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="public Sub load_page(url As String)";
 //BA.debugLineNum = 31;BA.debugLine="webvw1.LoadUrl(url)";
_webvw1.LoadUrl(_url);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public void  _show_ad() throws Exception{
ResumableSub_show_ad rsub = new ResumableSub_show_ad(this);
rsub.resume(ba, null);
}
public static class ResumableSub_show_ad extends BA.ResumableSub {
public ResumableSub_show_ad(elicorp.pilot.view_ad parent) {
this.parent = parent;
}
elicorp.pilot.view_ad parent;
String _ad_type = "";
String _ad_url = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 38;BA.debugLine="If B4XPages.MainPage.kvs.ContainsKey(\"ad_type\") T";
if (true) break;

case 1:
//if
this.state = 12;
if (parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*boolean*/ ("ad_type")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 39;BA.debugLine="Private ad_type As String=B4XPages.MainPage.kvs.";
_ad_type = BA.ObjectToString(parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("ad_type"));
 //BA.debugLineNum = 41;BA.debugLine="If ad_type=\"url_show\" Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_ad_type).equals("url_show")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 42;BA.debugLine="If B4XPages.MainPage.kvs.ContainsKey(\"ad_url\")";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*boolean*/ ("ad_url")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 43;BA.debugLine="Log(\"ad sleeping 10 min\")";
parent.__c.LogImpl("16357001","ad sleeping 10 min",0);
 //BA.debugLineNum = 44;BA.debugLine="Sleep(6000)";
parent.__c.Sleep(ba,this,(int) (6000));
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
 //BA.debugLineNum = 45;BA.debugLine="Private ad_url As String=B4XPages.MainPage.kvs";
_ad_url = BA.ObjectToString(parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*boolean*/ ("ad_url"));
 //BA.debugLineNum = 46;BA.debugLine="B4XPages.ShowPage(\"view_ad\")";
parent._vvvvvvvvvvvv4._vvv4 /*String*/ (ba,"view_ad");
 //BA.debugLineNum = 47;BA.debugLine="B4XPages.MainPage.view_ad_view.my_title=\"Notic";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._view_ad_view /*elicorp.pilot.view_ad*/ ._my_title /*String*/  = "Notice";
 //BA.debugLineNum = 48;BA.debugLine="B4XPages.MainPage.view_ad_view.page_to_load=ad";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._view_ad_view /*elicorp.pilot.view_ad*/ ._page_to_load /*String*/  = _ad_url;
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.MainPage.view_ad_view.load_type=\"url_";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._view_ad_view /*elicorp.pilot.view_ad*/ ._load_type /*String*/  = "url_show";
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
