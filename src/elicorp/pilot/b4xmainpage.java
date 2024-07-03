package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public elicorp.pilot.supabase _vvvvvvvvv7 = null;
public elicorp.pilot.insert_airport _insert_airport_view = null;
public elicorp.pilot.view_airport _view_airport_view = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnairports = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlmain = null;
public elicorp.pilot.keyvaluestore _vvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.collections.List _all_airports = null;
public elicorp.pilot.regandlogin _regandlogin_view = null;
public elicorp.pilot.view_fdm _view_fdm_view = null;
public anywheresoftware.b4a.sql.SQL _vvvvvvvvvv1 = null;
public elicorp.pilot.sharedmod _vvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnlogin = null;
public String _full_name = "";
public String _vvvvvvvvvv3 = "";
public String _vvvvvvvvvv4 = "";
public String _vvvvvvvvvv5 = "";
public String _company_id = "";
public String _vvvvvvvvvv6 = "";
public String _vvvvvvvvvv7 = "";
public String _vvvvvvvvvv0 = "";
public boolean _supa_online = false;
public elicorp.pilot.bctoast _vvvvvvvvvvv1 = null;
public elicorp.pilot.b4xcheckinternetlm _vvvvvvvvvvv2 = null;
public elicorp.pilot.view_ad _view_ad_view = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnfdm = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvv3 = null;
public elicorp.pilot.b4xdrawer _vvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsynch = null;
public b4a.example3.customlistview _vvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btndiscussion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsynch = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnadmin = null;
public elicorp.pilot.b4xdialog _vvvvvvvvvvv7 = null;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public static class _airport{
public boolean IsInitialized;
public String id;
public String icao;
public String briefing;
public String special_items;
public String bulletins;
public String fdm_reports;
public void Initialize() {
IsInitialized = true;
id = "";
icao = "";
briefing = "";
special_items = "";
bulletins = "";
fdm_reports = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(elicorp.pilot.b4xmainpage parent) {
this.parent = parent;
}
elicorp.pilot.b4xmainpage parent;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 336;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 337;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setDispl";
parent._vvvvvvvvvvvv4._vv4 /*elicorp.pilot.b4xpagesmanager*/ (ba)._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayHomeAsUpEnabled",new Object[]{(Object)(parent.__c.True)});
 //BA.debugLineNum = 338;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 339;BA.debugLine="bd.Initialize(HamburgerIcon)";
_bd.Initialize((android.graphics.Bitmap)(parent._vvvvvvvvvvv5.getObject()));
 //BA.debugLineNum = 340;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setHomeA";
parent._vvvvvvvvvvvv4._vv4 /*elicorp.pilot.b4xpagesmanager*/ (ba)._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHomeAsUpIndicator",new Object[]{(Object)(_bd.getObject())});
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(elicorp.pilot.b4xmainpage parent) {
this.parent = parent;
}
elicorp.pilot.b4xmainpage parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 319;BA.debugLine="If Main.ActionBarHomeClicked Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._vvvvvvvvvvvv1._vvvvvvvvv2 /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 320;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
parent._vvvvvvvvvvv4._setvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*boolean*/ (parent.__c.Not(parent._vvvvvvvvvvv4._getvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*boolean*/ ()));
 //BA.debugLineNum = 321;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 324;BA.debugLine="If Drawer.LeftOpen Then";

case 4:
//if
this.state = 7;
if (parent._vvvvvvvvvvv4._getvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*boolean*/ ()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 325;BA.debugLine="Drawer.LeftOpen = False";
parent._vvvvvvvvvvv4._setvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*boolean*/ (parent.__c.False);
 //BA.debugLineNum = 326;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 329;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(elicorp.pilot.b4xmainpage parent,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this._root1 = _root1;
}
elicorp.pilot.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;
String _supakey = "";
String _supaurl = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 57;BA.debugLine="Root = Root1";
parent._vvvvvvvvv5 = _root1;
 //BA.debugLineNum = 59;BA.debugLine="toast.Initialize(Root)";
parent._vvvvvvvvvvv1._initialize /*String*/ (ba,parent._vvvvvvvvv5);
 //BA.debugLineNum = 60;BA.debugLine="B4XPages.AddPage(\"insert_airport\",insert_airport_";
parent._vvvvvvvvvvvv4._vv1 /*String*/ (ba,"insert_airport",parent._insert_airport_view._initialize /*Object*/ (ba));
 //BA.debugLineNum = 61;BA.debugLine="B4XPages.AddPage(\"view_airport\",view_airport_view";
parent._vvvvvvvvvvvv4._vv1 /*String*/ (ba,"view_airport",parent._view_airport_view._initialize /*Object*/ (ba));
 //BA.debugLineNum = 62;BA.debugLine="B4XPages.AddPage(\"register_login\",regandlogin_vie";
parent._vvvvvvvvvvvv4._vv1 /*String*/ (ba,"register_login",parent._regandlogin_view._initialize /*Object*/ (ba));
 //BA.debugLineNum = 63;BA.debugLine="B4XPages.AddPage(\"view_fdm\",view_fdm_view.Initial";
parent._vvvvvvvvvvvv4._vv1 /*String*/ (ba,"view_fdm",parent._view_fdm_view._initialize /*Object*/ (ba));
 //BA.debugLineNum = 64;BA.debugLine="B4XPages.AddPage(\"view_ad\",view_ad_view.Initializ";
parent._vvvvvvvvvvvv4._vv1 /*String*/ (ba,"view_ad",parent._view_ad_view._initialize /*Object*/ (ba));
 //BA.debugLineNum = 67;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Root, 200dip)";
parent._vvvvvvvvvvv4._initialize /*String*/ (ba,parent,"Drawer",parent._vvvvvvvvv5,parent.__c.DipToCurrent((int) (200)));
 //BA.debugLineNum = 68;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"firstpage\")";
parent._vvvvvvvvvvv4._getvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("firstpage",ba);
 //BA.debugLineNum = 69;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"sidebar\")";
parent._vvvvvvvvvvv4._getvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("sidebar",ba);
 //BA.debugLineNum = 70;BA.debugLine="dialog.Initialize(Root)";
parent._vvvvvvvvvvv7._initialize /*String*/ (ba,parent._vvvvvvvvv5);
 //BA.debugLineNum = 71;BA.debugLine="HamburgerIcon = xui.LoadBitmapResize(File.DirAsse";
parent._vvvvvvvvvvv5 = parent._vvvvvvvvv6.LoadBitmapResize(parent.__c.File.getDirAssets(),"hamburger.png",parent.__c.DipToCurrent((int) (32)),parent.__c.DipToCurrent((int) (32)),parent.__c.True);
 //BA.debugLineNum = 86;BA.debugLine="shmod.Initialize()";
parent._vvvvvvvvvv2._initialize /*String*/ (ba);
 //BA.debugLineNum = 87;BA.debugLine="internet.Initialize(Root)";
parent._vvvvvvvvvvv2._initialize /*String*/ (ba,parent._vvvvvvvvv5);
 //BA.debugLineNum = 88;BA.debugLine="connect_to_sql";
parent._connect_to_sql();
 //BA.debugLineNum = 89;BA.debugLine="B4XPages.SetTitle(Me, \"Pilot Information System\")";
parent._vvvvvvvvvvvv4._vvv3 /*String*/ (ba,parent,(Object)("Pilot Information System"));
 //BA.debugLineNum = 92;BA.debugLine="If kvs.IsInitialized=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._vvvvvvvvv0.IsInitialized /*boolean*/ ()==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 94;BA.debugLine="kvs.Initialize(File.Dirinternal, \"kvs.dat\")";
parent._vvvvvvvvv0._initialize /*String*/ (ba,parent.__c.File.getDirInternal(),"kvs.dat");
 if (true) break;
;
 //BA.debugLineNum = 103;BA.debugLine="If kvs.ContainsKey(\"registered\") Then";

case 4:
//if
this.state = 9;
if (parent._vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*boolean*/ ("registered")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 104;BA.debugLine="btnlogin.Visible=False";
parent._btnlogin.setVisible(parent.__c.False);
 //BA.debugLineNum = 105;BA.debugLine="load_userdata";
parent._load_userdata();
 //BA.debugLineNum = 106;BA.debugLine="Log(phoneno)";
parent.__c.LogImpl("1720946",parent._vvvvvvvvvv4,0);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 109;BA.debugLine="B4XPages.ShowPage(\"register_login\")";
parent._vvvvvvvvvvvv4._vvv4 /*String*/ (ba,"register_login");
 //BA.debugLineNum = 110;BA.debugLine="kvs.Put(\"last_synch\",\"Never\")";
parent._vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ ("last_synch",(Object)("Never"));
 //BA.debugLineNum = 111;BA.debugLine="kvs.Put(\"admin_pass\",\"ethiopian\")";
parent._vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ ("admin_pass",(Object)("ethiopian"));
 //BA.debugLineNum = 112;BA.debugLine="btnlogin.Visible=True";
parent._btnlogin.setVisible(parent.__c.True);
 //BA.debugLineNum = 113;BA.debugLine="btnsynch_Click";
parent._btnsynch_click();
 if (true) break;
;
 //BA.debugLineNum = 117;BA.debugLine="If checkregistered <1 Then";

case 9:
//if
this.state = 12;
if (parent._vvvvvvvvv3()<1) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 118;BA.debugLine="BtnAirports.Visible=False";
parent._btnairports.setVisible(parent.__c.False);
 //BA.debugLineNum = 119;BA.debugLine="btnFdm.Visible=False";
parent._btnfdm.setVisible(parent.__c.False);
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 122;BA.debugLine="lblsynch.Text=\"Last Synchronizaton: \" & kvs.Get(\"";
parent._lblsynch.setText(BA.ObjectToCharSequence("Last Synchronizaton: "+BA.ObjectToString(parent._vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("last_synch"))));
 //BA.debugLineNum = 124;BA.debugLine="all_airports.Initialize()";
parent._all_airports.Initialize();
 //BA.debugLineNum = 125;BA.debugLine="all_airports=kvs.Get(\"airports\")";
parent._all_airports = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent._vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("airports")));
 //BA.debugLineNum = 128;BA.debugLine="Dim supakey As String=\"eyJhbGciOiJIUzI1NiIsInR5cC";
_supakey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImpyY3B5d3psbnhuaGNqeW94Y3BxIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDM1MDA2OTMsImV4cCI6MjAxOTA3NjY5M30.4mD2ZykxXG6WNEc_QPwPEA6kdhNIm97gy3XEWdj5VEU";
 //BA.debugLineNum = 129;BA.debugLine="Dim supaurl As String=\"https://jrcpywzlnxnhcjyoxc";
_supaurl = "https://jrcpywzlnxnhcjyoxcpq.supabase.co";
 //BA.debugLineNum = 130;BA.debugLine="Dim result As Boolean=False";
_result = parent.__c.False;
 //BA.debugLineNum = 138;BA.debugLine="Log(\"now here\")";
parent.__c.LogImpl("1720978","now here",0);
 //BA.debugLineNum = 139;BA.debugLine="supa.Initialize(supaurl,supakey)";
parent._vvvvvvvvv7._initialize /*String*/ (ba,_supaurl,_supakey);
 //BA.debugLineNum = 140;BA.debugLine="supa.InitializeEvents(Me,\"Supa\")";
parent._vvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*String*/ (parent,"Supa");
 //BA.debugLineNum = 142;BA.debugLine="Log(\"passed initialization\")";
parent.__c.LogImpl("1720982","passed initialization",0);
 //BA.debugLineNum = 146;BA.debugLine="Log(\"checked if logged in\")";
parent.__c.LogImpl("1720986","checked if logged in",0);
 //BA.debugLineNum = 148;BA.debugLine="supa_online=True";
parent._supa_online = parent.__c.True;
 //BA.debugLineNum = 156;BA.debugLine="Log(\"approval checked\")";
parent.__c.LogImpl("1720996","approval checked",0);
 //BA.debugLineNum = 158;BA.debugLine="wait for (B4XPages.MainPage.internet.Check(False";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvvv2 /*elicorp.pilot.b4xcheckinternetlm*/ ._vvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent.__c.False));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 159;BA.debugLine="If result= False Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_result==parent.__c.False) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 161;BA.debugLine="Log(\"no internet\")";
parent.__c.LogImpl("1721001","no internet",0);
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 165;BA.debugLine="shmod.update_settings(\"https://raw.githubuserco";
parent._vvvvvvvvvv2._update_settings /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("https://raw.githubusercontent.com/eliastsegaye/appfiles/main/fdm_settings","settings.txt");
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 173;BA.debugLine="view_ad_view.show_ad";
parent._view_ad_view._show_ad /*void*/ ();
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _result) throws Exception{
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Private Sub B4XPage_Disappear";
 //BA.debugLineNum = 346;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setHomeA";
_vvvvvvvvvvvv4._vv4 /*elicorp.pilot.b4xpagesmanager*/ (ba)._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHomeAsUpIndicator",new Object[]{(Object)(0)});
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 351;BA.debugLine="Drawer.Resize(Width, Height)";
_vvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ (_width,_height);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public void  _btnadmin_click() throws Exception{
ResumableSub_Btnadmin_Click rsub = new ResumableSub_Btnadmin_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Btnadmin_Click extends BA.ResumableSub {
public ResumableSub_Btnadmin_Click(elicorp.pilot.b4xmainpage parent) {
this.parent = parent;
}
elicorp.pilot.b4xmainpage parent;
String _pwd = "";
elicorp.pilot.b4xinputtemplate _input = null;
int _result = 0;
String _pwdi = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 408;BA.debugLine="Dim pwd As String";
_pwd = "";
 //BA.debugLineNum = 409;BA.debugLine="pwd=kvs.Get(\"admin_pass\")";
_pwd = BA.ObjectToString(parent._vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("admin_pass"));
 //BA.debugLineNum = 410;BA.debugLine="If pwd=Null Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_pwd== null) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 411;BA.debugLine="pwd=\"ethiopian\"";
_pwd = "ethiopian";
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 413;BA.debugLine="Dim input As B4XInputTemplate";
_input = new elicorp.pilot.b4xinputtemplate();
 //BA.debugLineNum = 414;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (ba);
 //BA.debugLineNum = 415;BA.debugLine="input.lblTitle.Text = \"Insert Password for Access";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Insert Password for Access"));
 //BA.debugLineNum = 417;BA.debugLine="Wait For (dialog.ShowTemplate(input, \"OK\", \"\", \"C";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 418;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 14;
if (_result==parent._vvvvvvvvv6.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 419;BA.debugLine="Dim pwdi As String= input.Text 'no need to check";
_pwdi = _input._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ ;
 //BA.debugLineNum = 420;BA.debugLine="If pwdi=pwd Then";
if (true) break;

case 8:
//if
this.state = 13;
if ((_pwdi).equals(_pwd)) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 //BA.debugLineNum = 421;BA.debugLine="B4XPages.ShowPage(\"insert_airport\")";
parent._vvvvvvvvvvvv4._vvv4 /*String*/ (ba,"insert_airport");
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 423;BA.debugLine="toast.Show(\"Wrong, try again\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Wrong, try again");
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnairports_click() throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Private Sub BtnAirports_Click";
 //BA.debugLineNum = 193;BA.debugLine="B4XPages.ShowPage(\"view_airport\")";
_vvvvvvvvvvvv4._vvv4 /*String*/ (ba,"view_airport");
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _btndiscussion_click() throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Private Sub btndiscussion_Click";
 //BA.debugLineNum = 401;BA.debugLine="xui.MsgboxAsync(\"Discussion feature will be added";
_vvvvvvvvv6.MsgboxAsync(ba,BA.ObjectToCharSequence("Discussion feature will be added in the near future!"),BA.ObjectToCharSequence("Notice"));
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return "";
}
public String  _btnfdm_click() throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Private Sub btnFdm_Click";
 //BA.debugLineNum = 308;BA.debugLine="B4XPages.ShowPage(\"view_fdm\")";
_vvvvvvvvvvvv4._vvv4 /*String*/ (ba,"view_fdm");
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_click() throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Private Sub btnlogin_Click";
 //BA.debugLineNum = 264;BA.debugLine="B4XPages.ShowPage(\"register_login\")";
_vvvvvvvvvvvv4._vvv4 /*String*/ (ba,"register_login");
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public void  _btnsynch_click() throws Exception{
ResumableSub_btnsynch_Click rsub = new ResumableSub_btnsynch_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnsynch_Click extends BA.ResumableSub {
public ResumableSub_btnsynch_Click(elicorp.pilot.b4xmainpage parent) {
this.parent = parent;
}
elicorp.pilot.b4xmainpage parent;
boolean _result = false;
String _datex = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 364;BA.debugLine="btnsynch.Enabled=False";
parent._btnsynch.setEnabled(parent.__c.False);
 //BA.debugLineNum = 365;BA.debugLine="wait for (B4XPages.MainPage.internet.Check(False)";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvvv2 /*elicorp.pilot.b4xcheckinternetlm*/ ._vvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent.__c.False));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 366;BA.debugLine="If result= False Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_result==parent.__c.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
 //BA.debugLineNum = 367;BA.debugLine="toast.Show(\"There is no internet\")";
parent._vvvvvvvvvvv1._show /*void*/ ("There is no internet");
 //BA.debugLineNum = 368;BA.debugLine="Log(\"no internet\")";
parent.__c.LogImpl("11638405","no internet",0);
 //BA.debugLineNum = 369;BA.debugLine="btnsynch.Enabled=True";
parent._btnsynch.setEnabled(parent.__c.True);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 372;BA.debugLine="wait for (check_login) complete (result As  Boole";
parent.__c.WaitFor("complete", ba, this, parent._check_login());
this.state = 18;
return;
case 18:
//C
this.state = 6;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 373;BA.debugLine="If result=False Then";
if (true) break;

case 6:
//if
this.state = 15;
if (_result==parent.__c.False) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 15;
 //BA.debugLineNum = 374;BA.debugLine="toast.show(\"failed to login\")";
parent._vvvvvvvvvvv1._show /*void*/ ("failed to login");
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 376;BA.debugLine="toast.Show(\"Synching, please wait\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Synching, please wait");
 //BA.debugLineNum = 377;BA.debugLine="wait for (shmod.synch_all) complete (result As Bo";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvv2._synch_all /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 19;
return;
case 19:
//C
this.state = 11;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 378;BA.debugLine="If result=True Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_result==parent.__c.True) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 380;BA.debugLine="Log(\"Synch completed\")";
parent.__c.LogImpl("11638417","Synch completed",0);
 //BA.debugLineNum = 381;BA.debugLine="toast.show(\"Synch Complete\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Synch Complete");
 //BA.debugLineNum = 382;BA.debugLine="btnsynch.Enabled=True";
parent._btnsynch.setEnabled(parent.__c.True);
 //BA.debugLineNum = 383;BA.debugLine="Dim datex As String";
_datex = "";
 //BA.debugLineNum = 384;BA.debugLine="DateTime.TimeFormat = \"hh:mm\"";
parent.__c.DateTime.setTimeFormat("hh:mm");
 //BA.debugLineNum = 385;BA.debugLine="DateTime.DateFormat = \"dd.MMM.yyyy\"";
parent.__c.DateTime.setDateFormat("dd.MMM.yyyy");
 //BA.debugLineNum = 386;BA.debugLine="datex = DateTime.Date(DateTime.Now) & \" at \" &";
_datex = parent.__c.DateTime.Date(parent.__c.DateTime.getNow())+" at "+parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 387;BA.debugLine="Log(datex)";
parent.__c.LogImpl("11638424",_datex,0);
 //BA.debugLineNum = 388;BA.debugLine="kvs.Put(\"last_synch\",datex)";
parent._vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ ("last_synch",(Object)(_datex));
 //BA.debugLineNum = 390;BA.debugLine="lblsynch.Text=\"Last Synchronizaton: \" & kvs.Ge";
parent._lblsynch.setText(BA.ObjectToCharSequence("Last Synchronizaton: "+BA.ObjectToString(parent._vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("last_synch"))));
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _check_login() throws Exception{
ResumableSub_check_login rsub = new ResumableSub_check_login(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_check_login extends BA.ResumableSub {
public ResumableSub_check_login(elicorp.pilot.b4xmainpage parent) {
this.parent = parent;
}
elicorp.pilot.b4xmainpage parent;
String _tmpemail = "";
String _tmppassword = "";
elicorp.pilot.supabase._supabaseuser _user = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 201;BA.debugLine="Dim tmpEmail As String = \"eliastsegaye32@gmail.co";
_tmpemail = "eliastsegaye32@gmail.com";
 //BA.debugLineNum = 202;BA.debugLine="Dim tmpPassword As String = \"adelia\"";
_tmppassword = "adelia";
 //BA.debugLineNum = 205;BA.debugLine="Log(\"position about to check login\")";
parent.__c.LogImpl("1917509","position about to check login",0);
 //BA.debugLineNum = 207;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 24;
this.catchState = 23;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 23;
 //BA.debugLineNum = 211;BA.debugLine="Wait For (supa.Auth.LogIn_EmailPassword(tmpEmail";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._login_emailpassword /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_tmpemail,_tmppassword));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_user = (elicorp.pilot.supabase._supabaseuser) result[0];
;
 //BA.debugLineNum = 213;BA.debugLine="If User.Error.Success Then";
if (true) break;

case 4:
//if
this.state = 21;
if (_user.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 21;
 //BA.debugLineNum = 215;BA.debugLine="toast.show(\"System is logged in\")";
parent._vvvvvvvvvvv1._show /*void*/ ("System is logged in");
 //BA.debugLineNum = 216;BA.debugLine="Log(\"position about to check login\")";
parent.__c.LogImpl("1917520","position about to check login",0);
 //BA.debugLineNum = 217;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 219;BA.debugLine="Wait For (supa.Auth.SignUp(tmpEmail,tmpPassword,";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_tmpemail,_tmppassword,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null))));
this.state = 26;
return;
case 26:
//C
this.state = 9;
_user = (elicorp.pilot.supabase._supabaseuser) result[0];
;
 //BA.debugLineNum = 220;BA.debugLine="If User.Error.Success Then";
if (true) break;

case 9:
//if
this.state = 20;
if (_user.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 19;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 221;BA.debugLine="Log(\"Registration in progress\" & User.Email)";
parent.__c.LogImpl("1917525","Registration in progress"+_user.Email /*String*/ ,0);
 //BA.debugLineNum = 223;BA.debugLine="Wait For (supa.Auth.LogIn_EmailPassword(tmpEmai";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_authentication*/ ()._login_emailpassword /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_tmpemail,_tmppassword));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_user = (elicorp.pilot.supabase._supabaseuser) result[0];
;
 //BA.debugLineNum = 224;BA.debugLine="If User.Error.Success Then";
if (true) break;

case 12:
//if
this.state = 17;
if (_user.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 //BA.debugLineNum = 225;BA.debugLine="toast.show(\"System logged in after 2 attempts\"";
parent._vvvvvvvvvvv1._show /*void*/ ("System logged in after 2 attempts");
 //BA.debugLineNum = 226;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 228;BA.debugLine="toast.show(\"Error: \" & User.Error.ErrorMessage";
parent._vvvvvvvvvvv1._show /*void*/ ("Error: "+_user.Error /*elicorp.pilot.supabase._supabaseerror*/ .ErrorMessage /*String*/ );
 //BA.debugLineNum = 229;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 234;BA.debugLine="toast.show(\"Login Aborted \" & User.Error.ErrorM";
parent._vvvvvvvvvvv1._show /*void*/ ("Login Aborted "+_user.Error /*elicorp.pilot.supabase._supabaseerror*/ .ErrorMessage /*String*/ );
 //BA.debugLineNum = 235;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 //BA.debugLineNum = 239;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("1917543",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 240;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public int  _vvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="public Sub checkregistered As Int";
 //BA.debugLineNum = 246;BA.debugLine="If kvs.ContainsKey(\"registered\") Then";
if (_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*boolean*/ ("registered")) { 
 //BA.debugLineNum = 247;BA.debugLine="If kvs.get(\"registered\")=True Then";
if ((_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("registered")).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 248;BA.debugLine="If kvs.get(\"approved\")=True Then";
if ((_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("approved")).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 249;BA.debugLine="Return 2";
if (true) return (int) (2);
 }else {
 //BA.debugLineNum = 251;BA.debugLine="Return 1";
if (true) return (int) (1);
 };
 }else {
 //BA.debugLineNum = 255;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
 }else {
 //BA.debugLineNum = 259;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private Root As B4XView";
_vvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 17;BA.debugLine="Public supa As Supabase";
_vvvvvvvvv7 = new elicorp.pilot.supabase();
 //BA.debugLineNum = 18;BA.debugLine="Public insert_airport_view As insert_airport";
_insert_airport_view = new elicorp.pilot.insert_airport();
 //BA.debugLineNum = 19;BA.debugLine="Public view_airport_view As view_airport";
_view_airport_view = new elicorp.pilot.view_airport();
 //BA.debugLineNum = 20;BA.debugLine="Type airport(id As String,icao As String, briefin";
;
 //BA.debugLineNum = 21;BA.debugLine="Public BtnAirports As B4XView";
_btnairports = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private pnlmain As B4XView";
_pnlmain = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Public kvs As KeyValueStore";
_vvvvvvvvv0 = new elicorp.pilot.keyvaluestore();
 //BA.debugLineNum = 24;BA.debugLine="Public all_airports As List";
_all_airports = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 25;BA.debugLine="Public regandlogin_view As regandlogin";
_regandlogin_view = new elicorp.pilot.regandlogin();
 //BA.debugLineNum = 26;BA.debugLine="Public view_fdm_view As view_fdm";
_view_fdm_view = new elicorp.pilot.view_fdm();
 //BA.debugLineNum = 27;BA.debugLine="Public sql1 As SQL";
_vvvvvvvvvv1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 28;BA.debugLine="Public shmod As sharedmod";
_vvvvvvvvvv2 = new elicorp.pilot.sharedmod();
 //BA.debugLineNum = 29;BA.debugLine="Private btnlogin As B4XView";
_btnlogin = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Public full_name, email, phoneno,password, compan";
_full_name = "";
_vvvvvvvvvv3 = "";
_vvvvvvvvvv4 = "";
_vvvvvvvvvv5 = "";
_company_id = "";
_vvvvvvvvvv6 = "";
_vvvvvvvvvv7 = "";
_vvvvvvvvvv0 = "";
 //BA.debugLineNum = 31;BA.debugLine="Public supa_online As Boolean";
_supa_online = false;
 //BA.debugLineNum = 32;BA.debugLine="Private toast As BCToast";
_vvvvvvvvvvv1 = new elicorp.pilot.bctoast();
 //BA.debugLineNum = 33;BA.debugLine="Public internet As B4XCheckInternetLM";
_vvvvvvvvvvv2 = new elicorp.pilot.b4xcheckinternetlm();
 //BA.debugLineNum = 34;BA.debugLine="Public view_ad_view As view_ad";
_view_ad_view = new elicorp.pilot.view_ad();
 //BA.debugLineNum = 38;BA.debugLine="Public btnFdm As B4XView";
_btnfdm = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private ImageView1 As B4XView";
_vvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Drawer As B4XDrawer";
_vvvvvvvvvvv4 = new elicorp.pilot.b4xdrawer();
 //BA.debugLineNum = 42;BA.debugLine="Private HamburgerIcon As B4XBitmap";
_vvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private btnsynch As Button";
_btnsynch = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private clvsidebar As CustomListView";
_vvvvvvvvvvv6 = new b4a.example3.customlistview();
 //BA.debugLineNum = 45;BA.debugLine="Private btndiscussion As B4XView";
_btndiscussion = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private lblsynch As B4XView";
_lblsynch = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Btnadmin As B4XView";
_btnadmin = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private dialog As B4XDialog";
_vvvvvvvvvvv7 = new elicorp.pilot.b4xdialog();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public boolean  _connect_to_sql() throws Exception{
String _sqlname = "";
 //BA.debugLineNum = 285;BA.debugLine="Sub connect_to_sql As Boolean";
 //BA.debugLineNum = 286;BA.debugLine="Private sqlname As String=\"datasql.db\"";
_sqlname = "datasql.db";
 //BA.debugLineNum = 287;BA.debugLine="Try:";
try { //BA.debugLineNum = 297;BA.debugLine="sql1.Initialize(File.DirInternal,sqlname,True)";
_vvvvvvvvvv1.Initialize(__c.File.getDirInternal(),_sqlname,__c.True);
 //BA.debugLineNum = 298;BA.debugLine="sql1.ExecQuerySingleResult(\"PRAGMA journal_mode =";
_vvvvvvvvvv1.ExecQuerySingleResult("PRAGMA journal_mode = delete");
 //BA.debugLineNum = 299;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 302;BA.debugLine="Log(LastException)";
__c.LogImpl("11179665",BA.ObjectToString(__c.LastException(ba)),0);
 //BA.debugLineNum = 303;BA.debugLine="Return(False)";
if (true) return (__c.False);
 };
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _load_userdata() throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="public Sub load_userdata";
 //BA.debugLineNum = 270;BA.debugLine="If checkregistered>0 Then";
if (_vvvvvvvvv3()>0) { 
 //BA.debugLineNum = 271;BA.debugLine="full_name=kvs.Get(\"full_name\")";
_full_name = BA.ObjectToString(_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("full_name"));
 //BA.debugLineNum = 272;BA.debugLine="phoneno=kvs.Get(\"phone_no\")";
_vvvvvvvvvv4 = BA.ObjectToString(_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("phone_no"));
 //BA.debugLineNum = 273;BA.debugLine="email=kvs.Get(\"email\")";
_vvvvvvvvvv3 = BA.ObjectToString(_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("email"));
 //BA.debugLineNum = 274;BA.debugLine="position=kvs.Get(\"position\")";
_vvvvvvvvvv6 = BA.ObjectToString(_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("position"));
 //BA.debugLineNum = 275;BA.debugLine="company_id=kvs.Get(\"company_id\")";
_company_id = BA.ObjectToString(_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("company_id"));
 //BA.debugLineNum = 276;BA.debugLine="role=kvs.Get(\"role\")";
_vvvvvvvvvv0 = BA.ObjectToString(_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("role"));
 //BA.debugLineNum = 277;BA.debugLine="approved=kvs.Get(\"approved\")";
_vvvvvvvvvv7 = BA.ObjectToString(_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("approved"));
 //BA.debugLineNum = 278;BA.debugLine="Log(\"approval status:\" & approved)";
__c.LogImpl("11114122","approval status:"+_vvvvvvvvvv7,0);
 //BA.debugLineNum = 279;BA.debugLine="B4XPages.SetTitle(Me, \"Welcome to PIS, \"& full_n";
_vvvvvvvvvvvv4._vvv3 /*String*/ (ba,this,(Object)("Welcome to PIS, "+_full_name.toUpperCase()));
 //BA.debugLineNum = 280;BA.debugLine="btnlogin.Visible=False";
_btnlogin.setVisible(__c.False);
 };
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return "";
}
public String  _pnlmain_longclick() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Private Sub pnlmain_LongClick";
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Sub UpdateImage";
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
