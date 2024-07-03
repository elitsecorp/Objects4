package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class view_fdm extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.view_fdm");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.view_fdm.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsearchairport = null;
public elicorp.pilot.b4xfloattextfield _vvvvvvvvvvvvv0 = null;
public elicorp.pilot.supabase _vvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.collections.List _all_ap = null;
public elicorp.pilot.keyvaluestore _vvvvvvvvvvvvvv1 = null;
public elicorp.pilot.bctextengine _vvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.sql.SQL _vvvvvvvvvv1 = null;
public elicorp.pilot.b4xcombobox _b4xcombobox1 = null;
public elicorp.pilot.b4xsearchtemplate _vvvvvvvvvvvvv6 = null;
public elicorp.pilot.b4xdialog _vvvvvvvvvvv7 = null;
public b4a.example3.customlistview _clvap = null;
public anywheresoftware.b4a.objects.collections.List _current_fdms = null;
public com.expander.msn.expander _vvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblvw = null;
public elicorp.pilot.bctoast _vvvvvvvvvvv1 = null;
public elicorp.pilot.preferencesdialog _vvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvv5 = null;
public elicorp.pilot.b4xmainpage._airport _vvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnairport = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnfdm = null;
public elicorp.pilot.bbcodeview _codeview = null;
public elicorp.pilot.bctextengine _vvvvvvvvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xsearchtemplate _vvvvvvvvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xsearchtemplate _vvvvvvvvvvvvvvvvvv5 = null;
public elicorp.pilot.preferencesdialog _vvvvvvvvvvvvvvvvvv6 = null;
public elicorp.pilot.b4xsearchtemplate _vvvvvvvvvvvvvvvvvv7 = null;
public elicorp.pilot.preferencesdialog _vvvvvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvv3 = null;
public String[] _vvvvvvvvvvvvvvv1 = null;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 60;BA.debugLine="Root = Root1";
_vvvvvvvvv5 = _root1;
 //BA.debugLineNum = 62;BA.debugLine="Root.LoadLayout(\"view_fdm\")";
_vvvvvvvvv5.LoadLayout("view_fdm",ba);
 //BA.debugLineNum = 63;BA.debugLine="B4XPages.SetTitle(Me,\"View Fdm\")";
_vvvvvvvvvvvv4._vvv3 /*String*/ (ba,this,(Object)("View Fdm"));
 //BA.debugLineNum = 64;BA.debugLine="prefdateselect.Initialize(Root,\"Select date\",300d";
_vvvvvvvvvvvvvvvvvv6._initialize /*String*/ (ba,_vvvvvvvvv5,(Object)("Select date"),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
 //BA.debugLineNum = 65;BA.debugLine="prefadmin.Initialize(Root,\"Insert password for ad";
_vvvvvvvvvvvvvvvvvv0._initialize /*String*/ (ba,_vvvvvvvvv5,(Object)("Insert password for admin access"),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
 //BA.debugLineNum = 66;BA.debugLine="monthname = Array As String(\"January\", \"February\"";
_vvvvvvvvvvvvvvv1 = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
 //BA.debugLineNum = 68;BA.debugLine="current_fdms.Initialize()";
_current_fdms.Initialize();
 //BA.debugLineNum = 69;BA.debugLine="kv=B4XPages.MainPage.kvs";
_vvvvvvvvvvvvvv1 = _vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ;
 //BA.debugLineNum = 70;BA.debugLine="If kv.ContainsKey(\"isadmin\") Then";
if (_vvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*boolean*/ ("isadmin")) { 
 }else {
 };
 //BA.debugLineNum = 83;BA.debugLine="apsearchtmp.Initialize()";
_vvvvvvvvvvvvvvvvvv4._initialize /*String*/ (ba);
 //BA.debugLineNum = 84;BA.debugLine="fdmsearchtmp.Initialize()";
_vvvvvvvvvvvvvvvvvv5._initialize /*String*/ (ba);
 //BA.debugLineNum = 85;BA.debugLine="dialog.Initialize(Root)";
_vvvvvvvvvvv7._initialize /*String*/ (ba,_vvvvvvvvv5);
 //BA.debugLineNum = 86;BA.debugLine="sql1=B4XPages.MainPage.sql1";
_vvvvvvvvvv1 = _vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv1 /*anywheresoftware.b4a.sql.SQL*/ ;
 //BA.debugLineNum = 87;BA.debugLine="bceng.Initialize(Root)";
_vvvvvvvvvvvvvvvvvv3._initialize /*String*/ (ba,_vvvvvvvvv5);
 //BA.debugLineNum = 88;BA.debugLine="toast.Initialize(Root)";
_vvvvvvvvvvv1._initialize /*String*/ (ba,_vvvvvvvvv5);
 //BA.debugLineNum = 89;BA.debugLine="codeview.TextEngine=bceng";
_codeview._setvvvvvvvvvvvvvv2 /*elicorp.pilot.bctextengine*/ (_vvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 90;BA.debugLine="supa=B4XPages.MainPage.supa";
_vvvvvvvvv7 = _vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv7 /*elicorp.pilot.supabase*/ ;
 //BA.debugLineNum = 91;BA.debugLine="populate_searchdialogs";
_populate_searchdialogs();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _btnadd_click() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Private Sub btnAdd_Click";
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public void  _btnairport_click() throws Exception{
ResumableSub_btnairport_Click rsub = new ResumableSub_btnairport_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnairport_Click extends BA.ResumableSub {
public ResumableSub_btnairport_Click(elicorp.pilot.view_fdm parent) {
this.parent = parent;
}
elicorp.pilot.view_fdm parent;
int _result = 0;
String _this_ap = "";
anywheresoftware.b4a.objects.collections.List _fdmdata = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cursor1 = null;
String _query = "";
String[] _values = null;
String _outpt = "";
int _x = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 217;BA.debugLine="Wait For (dialog.ShowTemplate(apsearchtmp, \"\", \"\"";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._vvvvvvvvvvvvvvvvvv4),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 218;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result==parent._vvvvvvvvv6.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 219;BA.debugLine="Private this_ap As String";
_this_ap = "";
 //BA.debugLineNum = 220;BA.debugLine="this_ap= apsearchtmp.SelectedItem";
_this_ap = parent._vvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ;
 //BA.debugLineNum = 221;BA.debugLine="Dim fdmdata As List";
_fdmdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 222;BA.debugLine="fdmdata.initialize";
_fdmdata.Initialize();
 //BA.debugLineNum = 224;BA.debugLine="Dim cursor1 As ResultSet";
_cursor1 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 225;BA.debugLine="Dim query As String=\"select * from FDM where ica";
_query = "select * from FDM where icao_code = '"+_this_ap+"'";
 //BA.debugLineNum = 226;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 228;BA.debugLine="fdmdata=DBUtils.ExecuteMemoryTable(sql1,query,Nu";
_fdmdata = parent._vvvvvvvvvvvv6._vvvvv6 /*anywheresoftware.b4a.objects.collections.List*/ (ba,parent._vvvvvvvvvv1,_query,(String[])(parent.__c.Null),(int) (0));
 //BA.debugLineNum = 231;BA.debugLine="Dim outpt As String";
_outpt = "";
 //BA.debugLineNum = 232;BA.debugLine="For x=0 To fdmdata.Size-1";
if (true) break;

case 4:
//for
this.state = 7;
step12 = 1;
limit12 = (int) (_fdmdata.getSize()-1);
_x = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step12 > 0 && _x <= limit12) || (step12 < 0 && _x >= limit12)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_x = ((int)(0 + _x + step12)) ;
if (true) break;

case 6:
//C
this.state = 11;
 //BA.debugLineNum = 233;BA.debugLine="Log(x)";
parent.__c.LogImpl("15767186",BA.NumberToString(_x),0);
 //BA.debugLineNum = 234;BA.debugLine="values=fdmdata.Get(x)";
_values = (String[])(_fdmdata.Get(_x));
 //BA.debugLineNum = 235;BA.debugLine="outpt=outpt & prettify_fdm(values)";
_outpt = _outpt+parent._prettify_fdm(_values);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 239;BA.debugLine="Log(outpt)";
parent.__c.LogImpl("15767192",_outpt,0);
 //BA.debugLineNum = 240;BA.debugLine="codeview.text=outpt";
parent._codeview._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ (_outpt);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public void  _btnbydate_click() throws Exception{
ResumableSub_btnbydate_Click rsub = new ResumableSub_btnbydate_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnbydate_Click extends BA.ResumableSub {
public ResumableSub_btnbydate_Click(elicorp.pilot.view_fdm parent) {
this.parent = parent;
}
elicorp.pilot.view_fdm parent;
anywheresoftware.b4a.objects.collections.List _yrs = null;
anywheresoftware.b4a.objects.collections.List _monts = null;
int _result = 0;
int _thisyr = 0;
int _thismt = 0;
anywheresoftware.b4a.objects.collections.List _fdmdata = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cursor1 = null;
String _query = "";
String[] _values = null;
String _outpt = "";
int _x = 0;
int step22;
int limit22;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 301;BA.debugLine="Dim yrs, monts As List";
_yrs = new anywheresoftware.b4a.objects.collections.List();
_monts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 302;BA.debugLine="Dim options1 As Map";
parent._vvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 303;BA.debugLine="options1.initialize";
parent._vvvvvvvvvvvvvv5.Initialize();
 //BA.debugLineNum = 304;BA.debugLine="yrs.Initialize";
_yrs.Initialize();
 //BA.debugLineNum = 305;BA.debugLine="monts.Initialize";
_monts.Initialize();
 //BA.debugLineNum = 306;BA.debugLine="yrs.AddAll(Array As Int(2023,2024,2025,2026,2027,";
_yrs.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (2023),(int) (2024),(int) (2025),(int) (2026),(int) (2027),(int) (2028),(int) (2029)}));
 //BA.debugLineNum = 307;BA.debugLine="monts.AddAll(Array As Int(1,2,3,4,5,6,7,8,9,10,11";
_monts.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12)}));
 //BA.debugLineNum = 308;BA.debugLine="prefdateselect.AddOptionsItem(\"year\",\"Year\",yrs)";
parent._vvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ("year",(Object)("Year"),_yrs);
 //BA.debugLineNum = 309;BA.debugLine="prefdateselect.AddOptionsItem(\"month\",\"month\",mon";
parent._vvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ("month",(Object)("month"),_monts);
 //BA.debugLineNum = 310;BA.debugLine="Wait For (prefdateselect.ShowDialog(options1, \"Co";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._vvvvvvvvvvvvvv5,(Object)("Continue"),(Object)("Cancel")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 311;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==parent._vvvvvvvvv6.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 314;BA.debugLine="Dim thisyr As Int=options1.Get(\"year\")";
_thisyr = (int)(BA.ObjectToNumber(parent._vvvvvvvvvvvvvv5.Get((Object)("year"))));
 //BA.debugLineNum = 315;BA.debugLine="Dim thismt As Int =options1.Get(\"month\")";
_thismt = (int)(BA.ObjectToNumber(parent._vvvvvvvvvvvvvv5.Get((Object)("month"))));
 //BA.debugLineNum = 316;BA.debugLine="Dim fdmdata As List";
_fdmdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 317;BA.debugLine="fdmdata.initialize";
_fdmdata.Initialize();
 //BA.debugLineNum = 319;BA.debugLine="Dim cursor1 As ResultSet";
_cursor1 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 320;BA.debugLine="Dim query As String=\"select * from FDM where yea";
_query = "select * from FDM where year = '"+BA.NumberToString(_thisyr)+"' and month ='"+BA.NumberToString(_thismt)+"'";
 //BA.debugLineNum = 321;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 323;BA.debugLine="fdmdata=DBUtils.ExecuteMemoryTable(sql1,query,Nu";
_fdmdata = parent._vvvvvvvvvvvv6._vvvvv6 /*anywheresoftware.b4a.objects.collections.List*/ (ba,parent._vvvvvvvvvv1,_query,(String[])(parent.__c.Null),(int) (0));
 //BA.debugLineNum = 325;BA.debugLine="Dim outpt As String";
_outpt = "";
 //BA.debugLineNum = 326;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 327;BA.debugLine="For x=0 To fdmdata.Size-1";
if (true) break;

case 4:
//for
this.state = 7;
step22 = 1;
limit22 = (int) (_fdmdata.getSize()-1);
_x = (int) (0) ;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if ((step22 > 0 && _x <= limit22) || (step22 < 0 && _x >= limit22)) this.state = 6;
if (true) break;

case 13:
//C
this.state = 12;
_x = ((int)(0 + _x + step22)) ;
if (true) break;

case 6:
//C
this.state = 13;
 //BA.debugLineNum = 329;BA.debugLine="values=fdmdata.Get(x)";
_values = (String[])(_fdmdata.Get(_x));
 //BA.debugLineNum = 330;BA.debugLine="outpt=outpt & prettify_fdm(values)";
_outpt = _outpt+parent._prettify_fdm(_values);
 //BA.debugLineNum = 331;BA.debugLine="current_fdms.Add(values)";
parent._current_fdms.Add((Object)(_values));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 //BA.debugLineNum = 335;BA.debugLine="Log(outpt)";
parent.__c.LogImpl("16029349",_outpt,0);
 //BA.debugLineNum = 336;BA.debugLine="codeview.text=outpt";
parent._codeview._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ (_outpt);
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 339;BA.debugLine="toast.show(\"error occured\")";
parent._vvvvvvvvvvv1._show /*void*/ ("error occured");
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _btnfdm_click() throws Exception{
ResumableSub_btnfdm_Click rsub = new ResumableSub_btnfdm_Click(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_btnfdm_Click extends BA.ResumableSub {
public ResumableSub_btnfdm_Click(elicorp.pilot.view_fdm parent) {
this.parent = parent;
}
elicorp.pilot.view_fdm parent;
int _result = 0;
String _this_fdm = "";
anywheresoftware.b4a.objects.collections.List _fdmdata = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cursor1 = null;
String _query = "";
String[] _values = null;
String _outpt = "";
int _x = 0;
int step14;
int limit14;

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
 //BA.debugLineNum = 181;BA.debugLine="populate_searchdialogs";
parent._populate_searchdialogs();
 //BA.debugLineNum = 182;BA.debugLine="Wait For (dialog.ShowTemplate(fdmsearchtmp, \"\", \"";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._vvvvvvvvvvvvvvvvvv5),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 183;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result==parent._vvvvvvvvv6.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 184;BA.debugLine="Private this_fdm As String";
_this_fdm = "";
 //BA.debugLineNum = 185;BA.debugLine="this_fdm= fdmsearchtmp.SelectedItem";
_this_fdm = parent._vvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ;
 //BA.debugLineNum = 186;BA.debugLine="Dim fdmdata As List";
_fdmdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 187;BA.debugLine="fdmdata.initialize";
_fdmdata.Initialize();
 //BA.debugLineNum = 189;BA.debugLine="Dim cursor1 As ResultSet";
_cursor1 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 190;BA.debugLine="Dim query As String=\"select * from FDM where fdm_";
_query = "select * from FDM where fdm_event = '"+_this_fdm+"'";
 //BA.debugLineNum = 191;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 193;BA.debugLine="fdmdata=DBUtils.ExecuteMemoryTable(sql1,query,Nul";
_fdmdata = parent._vvvvvvvvvvvv6._vvvvv6 /*anywheresoftware.b4a.objects.collections.List*/ (ba,parent._vvvvvvvvvv1,_query,(String[])(parent.__c.Null),(int) (0));
 //BA.debugLineNum = 195;BA.debugLine="Dim outpt As String";
_outpt = "";
 //BA.debugLineNum = 196;BA.debugLine="Dim x As Int=0";
_x = (int) (0);
 //BA.debugLineNum = 197;BA.debugLine="For x=0 To fdmdata.Size-1";
if (true) break;

case 4:
//for
this.state = 7;
step14 = 1;
limit14 = (int) (_fdmdata.getSize()-1);
_x = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step14 > 0 && _x <= limit14) || (step14 < 0 && _x >= limit14)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_x = ((int)(0 + _x + step14)) ;
if (true) break;

case 6:
//C
this.state = 11;
 //BA.debugLineNum = 198;BA.debugLine="Log(x)";
parent.__c.LogImpl("15701652",BA.NumberToString(_x),0);
 //BA.debugLineNum = 199;BA.debugLine="values=fdmdata.Get(x)";
_values = (String[])(_fdmdata.Get(_x));
 //BA.debugLineNum = 200;BA.debugLine="outpt=outpt & prettify_fdm(values)";
_outpt = _outpt+parent._prettify_fdm(_values);
 //BA.debugLineNum = 202;BA.debugLine="current_fdms.Add(values)";
parent._current_fdms.Add((Object)(_values));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 206;BA.debugLine="Log(outpt)";
parent.__c.LogImpl("15701660",_outpt,0);
 //BA.debugLineNum = 207;BA.debugLine="codeview.text=outpt";
parent._codeview._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ (_outpt);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Private Root As B4XView 'ignore";
_vvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Public btnSearchAirport As B4XView";
_btnsearchairport = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private editairport As B4XFloatTextField";
_vvvvvvvvvvvvv0 = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 8;BA.debugLine="Private supa As Supabase";
_vvvvvvvvv7 = new elicorp.pilot.supabase();
 //BA.debugLineNum = 16;BA.debugLine="Private all_ap As  List";
_all_ap = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="Private kv As KeyValueStore";
_vvvvvvvvvvvvvv1 = new elicorp.pilot.keyvaluestore();
 //BA.debugLineNum = 19;BA.debugLine="Private TextEngine As BCTextEngine";
_vvvvvvvvvvvvvv2 = new elicorp.pilot.bctextengine();
 //BA.debugLineNum = 20;BA.debugLine="Private sql1 As SQL";
_vvvvvvvvvv1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 21;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new elicorp.pilot.b4xcombobox();
 //BA.debugLineNum = 23;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
_vvvvvvvvvvvvv6 = new elicorp.pilot.b4xsearchtemplate();
 //BA.debugLineNum = 24;BA.debugLine="Dim dialog As B4XDialog";
_vvvvvvvvvvv7 = new elicorp.pilot.b4xdialog();
 //BA.debugLineNum = 25;BA.debugLine="Private clvap As CustomListView";
_clvap = new b4a.example3.customlistview();
 //BA.debugLineNum = 26;BA.debugLine="Private current_fdms As List";
_current_fdms = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="Private exp As Expander";
_vvvvvvvvvvvvvv3 = new com.expander.msn.expander();
 //BA.debugLineNum = 30;BA.debugLine="Private lblvw As B4XView";
_lblvw = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private toast As BCToast";
_vvvvvvvvvvv1 = new elicorp.pilot.bctoast();
 //BA.debugLineNum = 32;BA.debugLine="Private prefdialog As PreferencesDialog";
_vvvvvvvvvvvvvv4 = new elicorp.pilot.preferencesdialog();
 //BA.debugLineNum = 33;BA.debugLine="Private options1 As Map";
_vvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 34;BA.debugLine="Private airpt As airport";
_vvvvvvvvvvvvv7 = new elicorp.pilot.b4xmainpage._airport();
 //BA.debugLineNum = 35;BA.debugLine="Private btnedit As B4XView";
_vvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private btnAdd As B4XView";
_vvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private btnairport As B4XView";
_btnairport = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private btnfdm As B4XView";
_btnfdm = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private codeview As BBCodeView";
_codeview = new elicorp.pilot.bbcodeview();
 //BA.debugLineNum = 40;BA.debugLine="Private bceng As BCTextEngine";
_vvvvvvvvvvvvvvvvvv3 = new elicorp.pilot.bctextengine();
 //BA.debugLineNum = 41;BA.debugLine="Private apsearchtmp As B4XSearchTemplate";
_vvvvvvvvvvvvvvvvvv4 = new elicorp.pilot.b4xsearchtemplate();
 //BA.debugLineNum = 42;BA.debugLine="Private fdmsearchtmp As B4XSearchTemplate";
_vvvvvvvvvvvvvvvvvv5 = new elicorp.pilot.b4xsearchtemplate();
 //BA.debugLineNum = 43;BA.debugLine="Private prefdateselect As PreferencesDialog";
_vvvvvvvvvvvvvvvvvv6 = new elicorp.pilot.preferencesdialog();
 //BA.debugLineNum = 44;BA.debugLine="Private kv As KeyValueStore";
_vvvvvvvvvvvvvv1 = new elicorp.pilot.keyvaluestore();
 //BA.debugLineNum = 45;BA.debugLine="Private adminsearchtmp As B4XSearchTemplate";
_vvvvvvvvvvvvvvvvvv7 = new elicorp.pilot.b4xsearchtemplate();
 //BA.debugLineNum = 46;BA.debugLine="Private prefadmin As PreferencesDialog";
_vvvvvvvvvvvvvvvvvv0 = new elicorp.pilot.preferencesdialog();
 //BA.debugLineNum = 47;BA.debugLine="Private btnbydate As B4XView";
_vvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private Deleteall As B4XView";
_vvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private btnamadmin As B4XView";
_vvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private monthname() As String";
_vvvvvvvvvvvvvvv1 = new String[(int) (0)];
java.util.Arrays.fill(_vvvvvvvvvvvvvvv1,"");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _vvvvvvvvvvvvvvvvvv1(anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,String _column) throws Exception{
anywheresoftware.b4a.objects.collections.List _lstfinal = null;
anywheresoftware.b4a.objects.collections.List _tmplist = null;
Object _r = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 255;BA.debugLine="Public Sub ExecuteMaps(Sql As SQL,Query As String,";
 //BA.debugLineNum = 256;BA.debugLine="Dim lstFinal As List";
_lstfinal = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 257;BA.debugLine="lstFinal.Initialize()";
_lstfinal.Initialize();
 //BA.debugLineNum = 258;BA.debugLine="Dim tmpList As List = DBUtils.ExecuteList(Sql,Que";
_tmplist = new anywheresoftware.b4a.objects.collections.List();
_tmplist = _vvvvvvvvvvvv6._vvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (ba,_sql,_query,_stringargs,_limit);
 //BA.debugLineNum = 259;BA.debugLine="For Each r In tmpList";
{
final anywheresoftware.b4a.BA.IterableList group4 = _tmplist;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_r = group4.Get(index4);
 //BA.debugLineNum = 260;BA.debugLine="Dim m As Map = DBUtils.Executemap(Sql,Query,Stri";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _vvvvvvvvvvvv6._vvvvv5 /*anywheresoftware.b4a.objects.collections.Map*/ (ba,_sql,_query,_stringargs);
 //BA.debugLineNum = 261;BA.debugLine="lstFinal.Add(m)";
_lstfinal.Add((Object)(_m.getObject()));
 }
};
 //BA.debugLineNum = 263;BA.debugLine="Return lstFinal";
if (true) return _lstfinal;
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 54;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _populate_searchdialogs() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Sub populate_searchdialogs";
 //BA.debugLineNum = 250;BA.debugLine="fdmsearchtmp.SetItems(DBUtils.ExecuteList(sql1,\"s";
_vvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvv5 /*Object*/ (_vvvvvvvvvvvv6._vvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (ba,_vvvvvvvvvv1,"select distinct fdm_event from FDM",(String[])(__c.Null),(int) (0)));
 //BA.debugLineNum = 251;BA.debugLine="apsearchtmp.SetItems(DBUtils.ExecuteList(sql1,\"se";
_vvvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvvv5 /*Object*/ (_vvvvvvvvvvvv6._vvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (ba,_vvvvvvvvvv1,"select distinct icao_code from FDM order by icao_code",(String[])(__c.Null),(int) (0)));
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public String  _prettify_fdm(String[] _fdm) throws Exception{
String _info = "";
 //BA.debugLineNum = 266;BA.debugLine="Sub prettify_fdm(fdm() As String) As String";
 //BA.debugLineNum = 268;BA.debugLine="Dim info As String";
_info = "";
 //BA.debugLineNum = 279;BA.debugLine="info=$\"[TextSize=20]FDM Event Information[/TextSi";
_info = ("[TextSize=20]FDM Event Information[/TextSize] "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+" ");
 //BA.debugLineNum = 282;BA.debugLine="info=info & $\"[b]ICAO CODE[/b]: ${fdm(2)} ${CRLF";
_info = _info+("[b]ICAO CODE[/b]: "+__c.SmartStringFormatter("",(Object)(_fdm[(int) (2)]))+" "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+" ");
 //BA.debugLineNum = 284;BA.debugLine="info=info & $\"[b]Event Name[/b]: ${fdm(4)} ${CRLF";
_info = _info+("[b]Event Name[/b]: "+__c.SmartStringFormatter("",(Object)(_fdm[(int) (4)]))+" "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+" ");
 //BA.debugLineNum = 285;BA.debugLine="info=info & $\"[b]Rate[/b]: ${fdm(5)}% ${CRLF & CR";
_info = _info+("[b]Rate[/b]: "+__c.SmartStringFormatter("",(Object)(_fdm[(int) (5)]))+"% "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+" ");
 //BA.debugLineNum = 287;BA.debugLine="info=info & $\"[b]Month[/b]: ${monthname(fdm(7)-1)";
_info = _info+("[b]Month[/b]: "+__c.SmartStringFormatter("",(Object)(_vvvvvvvvvvvvvvv1[(int) ((double)(Double.parseDouble(_fdm[(int) (7)]))-1)]))+" "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+" ");
 //BA.debugLineNum = 288;BA.debugLine="info=info & $\"[b]Year[/b]: ${fdm(6)} ${CRLF & CRL";
_info = _info+("[b]Year[/b]: "+__c.SmartStringFormatter("",(Object)(_fdm[(int) (6)]))+" "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+" ");
 //BA.debugLineNum = 289;BA.debugLine="info =info & $\"__________________________________";
_info = _info+("_____________________________________________________"+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+"");
 //BA.debugLineNum = 291;BA.debugLine="Return info";
if (true) return _info;
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
