package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class regandlogin extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.regandlogin");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.regandlogin.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public elicorp.pilot.preferencesdialog _vvvvvvvvvvvvvv4 = null;
public elicorp.pilot.preferencesdialog _vvvvvvvvvvvvvvvvv6 = null;
public elicorp.pilot.supabase _vvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvv5 = null;
public elicorp.pilot.bctoast _vvvvvvvvvvv1 = null;
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
public ResumableSub_B4XPage_Created(elicorp.pilot.regandlogin parent,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this._root1 = _root1;
}
elicorp.pilot.regandlogin parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;
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
 //BA.debugLineNum = 17;BA.debugLine="Root = Root1";
parent._vvvvvvvvv5 = _root1;
 //BA.debugLineNum = 18;BA.debugLine="toast.Initialize(Root)";
parent._vvvvvvvvvvv1._initialize /*String*/ (ba,parent._vvvvvvvvv5);
 //BA.debugLineNum = 20;BA.debugLine="B4XPages.SetTitle(Me, \"Login and Signup\")";
parent._vvvvvvvvvvvv4._vvv3 /*String*/ (ba,parent,(Object)("Login and Signup"));
 //BA.debugLineNum = 21;BA.debugLine="supa=B4XPages.MainPage.supa";
parent._vvvvvvvvv7 = parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv7 /*elicorp.pilot.supabase*/ ;
 //BA.debugLineNum = 24;BA.debugLine="Log(\"clikd\")";
parent.__c.LogImpl("14587528","clikd",0);
 //BA.debugLineNum = 25;BA.debugLine="options1.Initialize()";
parent._vvvvvvvvvvvvvv5.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="prefdialog.Initialize(Root, \"Preferences Dialog\",";
parent._vvvvvvvvvvvvvv4._initialize /*String*/ (ba,parent._vvvvvvvvv5,(Object)("Preferences Dialog"),parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (400)));
 //BA.debugLineNum = 27;BA.debugLine="prefdialog2.Initialize(Root, \"Preferences Dialog\"";
parent._vvvvvvvvvvvvvvvvv6._initialize /*String*/ (ba,parent._vvvvvvvvv5,(Object)("Preferences Dialog"),parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (300)));
 //BA.debugLineNum = 29;BA.debugLine="prefdialog.SetEventsListener(Me, \"PrefDialog\")";
parent._vvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (parent,"PrefDialog");
 //BA.debugLineNum = 30;BA.debugLine="prefdialog2.SetEventsListener(Me, \"PrefDialog\")";
parent._vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ (parent,"PrefDialog");
 //BA.debugLineNum = 32;BA.debugLine="wait for (B4XPages.MainPage.check_login) complete";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._check_login /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 33;BA.debugLine="If result=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 34;BA.debugLine="toast.Show(\"Unable to login\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Unable to login");
 //BA.debugLineNum = 35;BA.debugLine="B4XPages.ClosePage(Me)";
parent._vvvvvvvvvvvv4._vv3 /*String*/ (ba,parent);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 38;BA.debugLine="Root.LoadLayout(\"signuplogin\")";
parent._vvvvvvvvv5.LoadLayout("signuplogin",ba);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _result) throws Exception{
}
public void  _btnlogin_click() throws Exception{
ResumableSub_btnlogin_Click rsub = new ResumableSub_btnlogin_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnlogin_Click extends BA.ResumableSub {
public ResumableSub_btnlogin_Click(elicorp.pilot.regandlogin parent) {
this.parent = parent;
}
elicorp.pilot.regandlogin parent;
int _result = 0;
boolean _resu = false;
elicorp.pilot.supabase_databaseselect _query = null;
String _email = "";
String _password = "";
elicorp.pilot.supabase._supabasedatabaseresult _databaseresult = null;
anywheresoftware.b4a.objects.collections.Map _resultmap = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 83;BA.debugLine="prefdialog2.LoadFromJson(File.ReadString(File.Dir";
parent._vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ (parent.__c.File.ReadString(parent.__c.File.getDirAssets(),"login.json"));
 //BA.debugLineNum = 84;BA.debugLine="prefdialog2.Title=\"Login\"";
parent._vvvvvvvvvvvvvvvvv6._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*Object*/ ((Object)("Login"));
 //BA.debugLineNum = 85;BA.debugLine="Wait For (prefdialog2.ShowDialog(options1, \"Login";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._vvvvvvvvvvvvvv5,(Object)("Login"),(Object)("Cancel")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 86;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==parent._vvvvvvvvv6.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 87;BA.debugLine="wait for (B4XPages.MainPage.internet.Check(True)";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvvv2 /*elicorp.pilot.b4xcheckinternetlm*/ ._vvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent.__c.True));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_resu = (Boolean) result[0];
;
 //BA.debugLineNum = 88;BA.debugLine="If Resu=False	 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_resu==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 89;BA.debugLine="toast.Show(\"Please connect to internet and try";
parent._vvvvvvvvvvv1._show /*void*/ ("Please connect to internet and try again");
 //BA.debugLineNum = 90;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 93;BA.debugLine="Dim Query As Supabase_DatabaseSelect = supa.Data";
_query = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_databaseselect*/ ();
 //BA.debugLineNum = 94;BA.debugLine="Query.Columns(\"*\").From(\"userinfo\")";
_query._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_databaseselect*/ ("*")._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseselect*/ ("userinfo");
 //BA.debugLineNum = 95;BA.debugLine="Dim email As String=options1.Get(\"email\")";
_email = BA.ObjectToString(parent._vvvvvvvvvvvvvv5.Get((Object)("email")));
 //BA.debugLineNum = 96;BA.debugLine="Dim password As String=options1.Get(\"password\")";
_password = BA.ObjectToString(parent._vvvvvvvvvvvvvv5.Get((Object)("password")));
 //BA.debugLineNum = 97;BA.debugLine="Query.Filter_Equal(CreateMap (\"email\":email,\"pas";
_query._filter_equal /*elicorp.pilot.supabase_databaseselect*/ (parent.__c.createMap(new Object[] {(Object)("email"),(Object)(_email),(Object)("password"),(Object)(_password)}));
 //BA.debugLineNum = 98;BA.debugLine="Wait For (Query.Execute) Complete (DatabaseResul";
parent.__c.WaitFor("complete", ba, this, _query._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 17;
return;
case 17:
//C
this.state = 8;
_databaseresult = (elicorp.pilot.supabase._supabasedatabaseresult) result[0];
;
 //BA.debugLineNum = 99;BA.debugLine="Dim resultmap As Map";
_resultmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 100;BA.debugLine="resultmap.initialize";
_resultmap.Initialize();
 //BA.debugLineNum = 101;BA.debugLine="If DatabaseResult.Error.Success And DatabaseResu";
if (true) break;

case 8:
//if
this.state = 13;
if (_databaseresult.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/  && _databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 //BA.debugLineNum = 102;BA.debugLine="resultmap=DatabaseResult.Rows.Get(0)";
_resultmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 103;BA.debugLine="resultmap.Put(\"registered\",True)";
_resultmap.Put((Object)("registered"),(Object)(parent.__c.True));
 //BA.debugLineNum = 104;BA.debugLine="B4XPages.MainPage.kvs.PutMapAsync(resultmap)";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_resultmap);
 //BA.debugLineNum = 105;BA.debugLine="Log(resultmap)";
parent.__c.LogImpl("14718616",BA.ObjectToString(_resultmap),0);
 //BA.debugLineNum = 106;BA.debugLine="B4XPages.MainPage.load_userdata";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._load_userdata /*String*/ ();
 //BA.debugLineNum = 108;BA.debugLine="toast.show(\"You have been Logged in, you may us";
parent._vvvvvvvvvvv1._show /*void*/ ("You have been Logged in, you may use the app now");
 //BA.debugLineNum = 109;BA.debugLine="B4XPages.MainPage.btnFdm.Visible=True";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._btnfdm /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 //BA.debugLineNum = 110;BA.debugLine="B4XPages.MainPage.BtnAirports.Visible=True";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._btnairports /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 //BA.debugLineNum = 111;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 18;
return;
case 18:
//C
this.state = 13;
;
 //BA.debugLineNum = 112;BA.debugLine="B4XPages.ClosePage(Me)";
parent._vvvvvvvvvvvv4._vv3 /*String*/ (ba,parent);
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 114;BA.debugLine="Log(\"Error Reading data\")";
parent.__c.LogImpl("14718625","Error Reading data",0);
 //BA.debugLineNum = 115;BA.debugLine="toast.show(\"Unable to login, Please try again w";
parent._vvvvvvvvvvv1._show /*void*/ ("Unable to login, Please try again with correct credentials, or contact support");
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
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnsignup_click() throws Exception{
ResumableSub_btnsignup_Click rsub = new ResumableSub_btnsignup_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnsignup_Click extends BA.ResumableSub {
public ResumableSub_btnsignup_Click(elicorp.pilot.regandlogin parent) {
this.parent = parent;
}
elicorp.pilot.regandlogin parent;
int _result = 0;
boolean _resu = false;
elicorp.pilot.supabase_databaseinsert _insert = null;
elicorp.pilot.supabase._supabasedatabaseresult _resulte = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 44;BA.debugLine="prefdialog.LoadFromJson(File.ReadString(File.DirA";
parent._vvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ (parent.__c.File.ReadString(parent.__c.File.getDirAssets(),"register.json"));
 //BA.debugLineNum = 45;BA.debugLine="prefdialog2.Title=\"Signup\"";
parent._vvvvvvvvvvvvvvvvv6._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*Object*/ ((Object)("Signup"));
 //BA.debugLineNum = 46;BA.debugLine="Wait For (prefdialog.ShowDialog(options1, \"Sign U";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._vvvvvvvvvvvvvv5,(Object)("Sign Up"),(Object)("Cancel")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 47;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==parent._vvvvvvvvv6.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 49;BA.debugLine="wait for (B4XPages.MainPage.internet.Check(False";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvvv2 /*elicorp.pilot.b4xcheckinternetlm*/ ._vvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent.__c.False));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_resu = (Boolean) result[0];
;
 //BA.debugLineNum = 50;BA.debugLine="If Resu=False	 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_resu==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 51;BA.debugLine="toast.Show(\"Please connect to internet and try";
parent._vvvvvvvvvvv1._show /*void*/ ("Please connect to internet and try again");
 //BA.debugLineNum = 52;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 54;BA.debugLine="Dim Insert As Supabase_DatabaseInsert = supa.Dat";
_insert = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*elicorp.pilot.supabase_databaseinsert*/ ();
 //BA.debugLineNum = 55;BA.debugLine="Insert.From(\"userinfo\")";
_insert._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseinsert*/ ("userinfo");
 //BA.debugLineNum = 61;BA.debugLine="options1.Put(\"approved\",False)";
parent._vvvvvvvvvvvvvv5.Put((Object)("approved"),(Object)(parent.__c.False));
 //BA.debugLineNum = 62;BA.debugLine="Wait For (Insert.Insert(options1).Execute) Compl";
parent.__c.WaitFor("complete", ba, this, _insert._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseinsert*/ (parent._vvvvvvvvvvvvvv5)._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 17;
return;
case 17:
//C
this.state = 8;
_resulte = (elicorp.pilot.supabase._supabasedatabaseresult) result[0];
;
 //BA.debugLineNum = 64;BA.debugLine="If Resulte.error.Success=True Then";
if (true) break;

case 8:
//if
this.state = 13;
if (_resulte.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ==parent.__c.True) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 //BA.debugLineNum = 65;BA.debugLine="options1.Put(\"registered\",True)";
parent._vvvvvvvvvvvvvv5.Put((Object)("registered"),(Object)(parent.__c.True));
 //BA.debugLineNum = 66;BA.debugLine="B4XPages.MainPage.kvs.PutMapAsync(options1)";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._vvvvvvvvvvvvvv5);
 //BA.debugLineNum = 67;BA.debugLine="B4XPages.MainPage.load_userdata";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._load_userdata /*String*/ ();
 //BA.debugLineNum = 68;BA.debugLine="B4XPages.MainPage.btnFdm.Visible=True";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._btnfdm /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 //BA.debugLineNum = 69;BA.debugLine="B4XPages.MainPage.BtnAirports.Visible=True";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._btnairports /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 //BA.debugLineNum = 70;BA.debugLine="toast.show(\"You have been Signed Up, Please wai";
parent._vvvvvvvvvvv1._show /*void*/ ("You have been Signed Up, Please wait until you are approved!");
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 73;BA.debugLine="Log (Resulte.error.ErrorMessage)";
parent.__c.LogImpl("14653086",_resulte.Error /*elicorp.pilot.supabase._supabaseerror*/ .ErrorMessage /*String*/ ,0);
 //BA.debugLineNum = 74;BA.debugLine="toast.show(\"We were unable to Sign you up, plea";
parent._vvvvvvvvvvv1._show /*void*/ ("We were unable to Sign you up, please try again later");
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 76;BA.debugLine="B4XPages.ClosePage(Me)";
parent._vvvvvvvvvvvv4._vv3 /*String*/ (ba,parent);
 //BA.debugLineNum = 77;BA.debugLine="Log(options1)";
parent.__c.LogImpl("14653090",BA.ObjectToString(parent._vvvvvvvvvvvvvv5),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Private prefdialog,prefdialog2 As PreferencesDial";
_vvvvvvvvvvvvvv4 = new elicorp.pilot.preferencesdialog();
_vvvvvvvvvvvvvvvvv6 = new elicorp.pilot.preferencesdialog();
 //BA.debugLineNum = 5;BA.debugLine="Private supa As Supabase";
_vvvvvvvvv7 = new elicorp.pilot.supabase();
 //BA.debugLineNum = 6;BA.debugLine="Private options1 As Map";
_vvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Private toast As BCToast";
_vvvvvvvvvvv1 = new elicorp.pilot.bctoast();
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
