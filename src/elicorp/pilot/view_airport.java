package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class view_airport extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.view_airport");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.view_airport.class).invoke(this, new Object[] {null});
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
public elicorp.pilot.bbcodeview _vvvvvvvvvvvvv3 = null;
public elicorp.pilot.bctextengine _vvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.sql.SQL _vvvvvvvvvv1 = null;
public elicorp.pilot.b4xcombobox _b4xcombobox1 = null;
public elicorp.pilot.b4xsearchtemplate _vvvvvvvvvvvvv6 = null;
public elicorp.pilot.b4xdialog _vvvvvvvvvvv7 = null;
public b4a.example3.customlistview _clvap = null;
public com.expander.msn.expander _vvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblvw = null;
public elicorp.pilot.bctoast _vvvvvvvvvvv1 = null;
public elicorp.pilot.preferencesdialog _vvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvv5 = null;
public elicorp.pilot.b4xmainpage._airport _vvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvv6 = null;
public elicorp.pilot.bbcodeview _codeview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsynch = null;
public b4a.example3.customlistview _vvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pane1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btndiscussion = null;
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
public void  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(elicorp.pilot.view_airport parent,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this._root1 = _root1;
}
elicorp.pilot.view_airport parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 59;BA.debugLine="Root = Root1";
parent._vvvvvvvvv5 = _root1;
 //BA.debugLineNum = 60;BA.debugLine="Root.LoadLayout(\"view_airport\")";
parent._vvvvvvvvv5.LoadLayout("view_airport",ba);
 //BA.debugLineNum = 61;BA.debugLine="MonthName = Array As String(\"January\", \"February\"";
parent._vvvvvvvvvvvvvvv1 = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
 //BA.debugLineNum = 67;BA.debugLine="supa=B4XPages.MainPage.supa";
parent._vvvvvvvvv7 = parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv7 /*elicorp.pilot.supabase*/ ;
 //BA.debugLineNum = 68;BA.debugLine="btnSearchAirport.Enabled=False";
parent._btnsearchairport.setEnabled(parent.__c.False);
 //BA.debugLineNum = 69;BA.debugLine="lblvw.Text=\"Please select an Airport to view brie";
parent._lblvw.setText(BA.ObjectToCharSequence("Please select an Airport to view briefing"));
 //BA.debugLineNum = 70;BA.debugLine="all_ap.Initialize";
parent._all_ap.Initialize();
 //BA.debugLineNum = 71;BA.debugLine="sql1=B4XPages.MainPage.sql1";
parent._vvvvvvvvvv1 = parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv1 /*anywheresoftware.b4a.sql.SQL*/ ;
 //BA.debugLineNum = 72;BA.debugLine="SearchTemplate.Initialize()";
parent._vvvvvvvvvvvvv6._initialize /*String*/ (ba);
 //BA.debugLineNum = 73;BA.debugLine="toast.Initialize(Root)";
parent._vvvvvvvvvvv1._initialize /*String*/ (ba,parent._vvvvvvvvv5);
 //BA.debugLineNum = 75;BA.debugLine="dialog.Initialize(Root)";
parent._vvvvvvvvvvv7._initialize /*String*/ (ba,parent._vvvvvvvvv5);
 //BA.debugLineNum = 76;BA.debugLine="Log(B4XPages.MainPage.checkregistered)";
parent.__c.LogImpl("12424854",BA.NumberToString(parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv3 /*int*/ ()),0);
 //BA.debugLineNum = 77;BA.debugLine="TextEngine.Initialize(Root)";
parent._vvvvvvvvvvvvvv2._initialize /*String*/ (ba,parent._vvvvvvvvv5);
 //BA.debugLineNum = 80;BA.debugLine="exp.Initialize(clvap)";
parent._vvvvvvvvvvvvvv3._initialize(ba,parent._clvap);
 //BA.debugLineNum = 84;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 85;BA.debugLine="btn.Initialize(\"btn\")";
_btn.Initialize(ba,"btn");
 //BA.debugLineNum = 86;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 87;BA.debugLine="Dim kv As KeyValueStore=B4XPages.MainPage.kvs";
parent._vvvvvvvvvvvvvv1 = parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ;
 //BA.debugLineNum = 89;BA.debugLine="B4XPages.SetTitle(Me, \"View Airports\")";
parent._vvvvvvvvvvvv4._vvv3 /*String*/ (ba,parent,(Object)("View Airports"));
 //BA.debugLineNum = 96;BA.debugLine="populate_searchview";
parent._populate_searchview();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _bbcodeview1_linkclicked(String _url) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Private Sub BBCodeView1_LinkClicked (URL As String";
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public String  _btnaddap_click() throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Private Sub btnaddap_Click";
 //BA.debugLineNum = 310;BA.debugLine="B4XPages.ShowPage(\"insert_airport\")";
_vvvvvvvvvvvv4._vvv4 /*String*/ (ba,"insert_airport");
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return "";
}
public String  _btnbatch_click() throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Private Sub btnbatch_Click";
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return "";
}
public void  _btndelete_click() throws Exception{
ResumableSub_btndelete_Click rsub = new ResumableSub_btndelete_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btndelete_Click extends BA.ResumableSub {
public ResumableSub_btndelete_Click(elicorp.pilot.view_airport parent) {
this.parent = parent;
}
elicorp.pilot.view_airport parent;
elicorp.pilot.supabase_databasedelete _delete = null;
elicorp.pilot.supabase._supabaseerror _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 381;BA.debugLine="Dim Delete As Supabase_DatabaseDelete = supa.Data";
_delete = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_databasedelete*/ ();
 //BA.debugLineNum = 382;BA.debugLine="Delete.From(\"Airport\")";
_delete._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databasedelete*/ ("Airport");
 //BA.debugLineNum = 383;BA.debugLine="Delete.Eq(CreateMap(\"ICAO_Code\":airpt.icao))";
_delete._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*elicorp.pilot.supabase_databasedelete*/ (parent.__c.createMap(new Object[] {(Object)("ICAO_Code"),(Object)(parent._vvvvvvvvvvvvv7.icao /*String*/ )}));
 //BA.debugLineNum = 384;BA.debugLine="Wait For (Delete.Execute) Complete (Result As Sup";
parent.__c.WaitFor("complete", ba, this, _delete._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (elicorp.pilot.supabase._supabaseerror) result[0];
;
 //BA.debugLineNum = 385;BA.debugLine="If Result.Success=True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result.Success /*boolean*/ ==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 386;BA.debugLine="toast.Show(\"Deleted \" & airpt.icao)";
parent._vvvvvvvvvvv1._show /*void*/ ("Deleted "+parent._vvvvvvvvvvvvv7.icao /*String*/ );
 //BA.debugLineNum = 387;BA.debugLine="B4XPages.MainPage.shmod.synch_all";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv2 /*elicorp.pilot.sharedmod*/ ._synch_all /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 389;BA.debugLine="toast.Show(\"Delete Failed\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Delete Failed");
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(elicorp.pilot.supabase._supabaseerror _result) throws Exception{
}
public String  _btnedit_click() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Private Sub btnedit_Click";
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public void  _btnsearchairport_click() throws Exception{
ResumableSub_btnSearchAirport_Click rsub = new ResumableSub_btnSearchAirport_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSearchAirport_Click extends BA.ResumableSub {
public ResumableSub_btnSearchAirport_Click(elicorp.pilot.view_airport parent) {
this.parent = parent;
}
elicorp.pilot.view_airport parent;
int _result = 0;
String _this_airport = "";
anywheresoftware.b4a.objects.collections.List _airportdata = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cursor1 = null;
String _query = "";
String[] _values = null;
anywheresoftware.b4a.objects.collections.List _fdms = null;
String _bultxt = "";
int _x = 0;
String[] _thisfdm = null;
int step28;
int limit28;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 112;BA.debugLine="populate_searchview";
parent._populate_searchview();
 //BA.debugLineNum = 113;BA.debugLine="Wait For (dialog.ShowTemplate(SearchTemplate, \"\",";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._vvvvvvvvvvvvv6),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 18;
return;
case 18:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 114;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 17;
if (_result==parent._vvvvvvvvv6.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 16;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 115;BA.debugLine="Private this_airport As String";
_this_airport = "";
 //BA.debugLineNum = 116;BA.debugLine="this_airport= SearchTemplate.SelectedItem";
_this_airport = parent._vvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ;
 //BA.debugLineNum = 117;BA.debugLine="Dim airportdata As List";
_airportdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 118;BA.debugLine="airportdata.initialize";
_airportdata.Initialize();
 //BA.debugLineNum = 120;BA.debugLine="Dim cursor1 As ResultSet";
_cursor1 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 121;BA.debugLine="Dim query As String=\"select * from Airport where";
_query = "select * from Airport where  ICAO_CODE = '"+_this_airport+"'";
 //BA.debugLineNum = 122;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 123;BA.debugLine="airportdata=DBUtils.ExecuteMemoryTable(sql1,quer";
_airportdata = parent._vvvvvvvvvvvv6._vvvvv6 /*anywheresoftware.b4a.objects.collections.List*/ (ba,parent._vvvvvvvvvv1,_query,(String[])(parent.__c.Null),(int) (0));
 //BA.debugLineNum = 125;BA.debugLine="values=airportdata.Get(0)";
_values = (String[])(_airportdata.Get((int) (0)));
 //BA.debugLineNum = 127;BA.debugLine="airportdata=values";
_airportdata = anywheresoftware.b4a.keywords.Common.ArrayToList(_values);
 //BA.debugLineNum = 128;BA.debugLine="Log(airportdata)";
parent.__c.LogImpl("12555921",BA.ObjectToString(_airportdata),0);
 //BA.debugLineNum = 129;BA.debugLine="airpt.id=airportdata.Get(0)";
parent._vvvvvvvvvvvvv7.id /*String*/  = BA.ObjectToString(_airportdata.Get((int) (0)));
 //BA.debugLineNum = 130;BA.debugLine="airpt.icao=airportdata.Get(1)";
parent._vvvvvvvvvvvvv7.icao /*String*/  = BA.ObjectToString(_airportdata.Get((int) (1)));
 //BA.debugLineNum = 131;BA.debugLine="airpt.bulletins=airportdata.Get(5)";
parent._vvvvvvvvvvvvv7.bulletins /*String*/  = BA.ObjectToString(_airportdata.Get((int) (5)));
 //BA.debugLineNum = 132;BA.debugLine="airpt.fdm_reports=airportdata.Get(4)";
parent._vvvvvvvvvvvvv7.fdm_reports /*String*/  = BA.ObjectToString(_airportdata.Get((int) (4)));
 //BA.debugLineNum = 133;BA.debugLine="airpt.briefing=airportdata.Get(2)";
parent._vvvvvvvvvvvvv7.briefing /*String*/  = BA.ObjectToString(_airportdata.Get((int) (2)));
 //BA.debugLineNum = 134;BA.debugLine="airpt.special_items=airportdata.Get(5)";
parent._vvvvvvvvvvvvv7.special_items /*String*/  = BA.ObjectToString(_airportdata.Get((int) (5)));
 //BA.debugLineNum = 137;BA.debugLine="Dim fdms As List";
_fdms = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 138;BA.debugLine="fdms.initialize";
_fdms.Initialize();
 //BA.debugLineNum = 139;BA.debugLine="Dim query As String=\"select * from FDM where ica";
_query = "select * from FDM where icao_code = '"+parent._vvvvvvvvvvvvv7.icao /*String*/ +"'";
 //BA.debugLineNum = 140;BA.debugLine="Log(query)";
parent.__c.LogImpl("12555933",_query,0);
 //BA.debugLineNum = 141;BA.debugLine="fdms=DBUtils.ExecuteMemoryTable(sql1,query,Null,";
_fdms = parent._vvvvvvvvvvvv6._vvvvv6 /*anywheresoftware.b4a.objects.collections.List*/ (ba,parent._vvvvvvvvvv1,_query,(String[])(parent.__c.Null),(int) (0));
 //BA.debugLineNum = 142;BA.debugLine="Log(fdms)";
parent.__c.LogImpl("12555935",BA.ObjectToString(_fdms),0);
 //BA.debugLineNum = 143;BA.debugLine="Dim bultxt As String";
_bultxt = "";
 //BA.debugLineNum = 144;BA.debugLine="For x =0 To fdms.Size-1";
if (true) break;

case 4:
//for
this.state = 7;
step28 = 1;
limit28 = (int) (_fdms.getSize()-1);
_x = (int) (0) ;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 7;
if ((step28 > 0 && _x <= limit28) || (step28 < 0 && _x >= limit28)) this.state = 6;
if (true) break;

case 20:
//C
this.state = 19;
_x = ((int)(0 + _x + step28)) ;
if (true) break;

case 6:
//C
this.state = 20;
 //BA.debugLineNum = 145;BA.debugLine="Dim thisfdm() As String";
_thisfdm = new String[(int) (0)];
java.util.Arrays.fill(_thisfdm,"");
 //BA.debugLineNum = 147;BA.debugLine="thisfdm=fdms.Get(x)";
_thisfdm = (String[])(_fdms.Get(_x));
 //BA.debugLineNum = 148;BA.debugLine="bultxt=bultxt & thisfdm(4) & \" on \" & MonthName";
_bultxt = _bultxt+_thisfdm[(int) (4)]+" on "+parent._vvvvvvvvvvvvvvv1[(int) ((double)(Double.parseDouble(_thisfdm[(int) (7)]))-1)]+", "+_thisfdm[(int) (6)]+parent.__c.CRLF;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 150;BA.debugLine="airpt.fdm_reports=bultxt";
parent._vvvvvvvvvvvvv7.fdm_reports /*String*/  = _bultxt;
 //BA.debugLineNum = 160;BA.debugLine="clvap.Clear";
parent._clvap._clear();
 //BA.debugLineNum = 161;BA.debugLine="exp.Additem(\"Briefing\", airpt.briefing,50dip,0)";
parent._vvvvvvvvvvvvvv3._v5((Object)("Briefing"),(Object)(parent._vvvvvvvvvvvvv7.briefing /*String*/ ),parent.__c.DipToCurrent((int) (50)),(int) (0));
 //BA.debugLineNum = 162;BA.debugLine="If airpt.special_items=\"\" Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((parent._vvvvvvvvvvvvv7.special_items /*String*/ ).equals("")) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 163;BA.debugLine="airpt.special_items=\"-\"";
parent._vvvvvvvvvvvvv7.special_items /*String*/  = "-";
 if (true) break;
;
 //BA.debugLineNum = 165;BA.debugLine="If airpt.fdm_reports=\"\" Then";

case 11:
//if
this.state = 14;
if ((parent._vvvvvvvvvvvvv7.fdm_reports /*String*/ ).equals("")) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 166;BA.debugLine="airpt.fdm_reports=\"-\"";
parent._vvvvvvvvvvvvv7.fdm_reports /*String*/  = "-";
 if (true) break;

case 14:
//C
this.state = 17;
;
 //BA.debugLineNum = 168;BA.debugLine="exp.Additem(\"Special Items\", airpt.special_item";
parent._vvvvvvvvvvvvvv3._v5((Object)("Special Items"),(Object)(parent._vvvvvvvvvvvvv7.special_items /*String*/ ),parent.__c.DipToCurrent((int) (50)),(int) (0));
 //BA.debugLineNum = 170;BA.debugLine="exp.Additem(\"FDM Reports\", airpt.fdm_reports,50";
parent._vvvvvvvvvvvvvv3._v5((Object)("FDM Reports"),(Object)(parent._vvvvvvvvvvvvv7.fdm_reports /*String*/ ),parent.__c.DipToCurrent((int) (50)),(int) (0));
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 184;BA.debugLine="toast.Show(\"no results to display\")";
parent._vvvvvvvvvvv1._show /*void*/ ("no results to display");
 if (true) break;

case 17:
//C
this.state = -1;
;
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsearchairport_longclick() throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Private Sub btnSearchAirport_LongClick";
 //BA.debugLineNum = 223;BA.debugLine="get_airports";
_get_airports();
 //BA.debugLineNum = 224;BA.debugLine="populate_searchview";
_populate_searchview();
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public String  _btnsynch_click() throws Exception{
 //BA.debugLineNum = 396;BA.debugLine="Private Sub btnsynch_Click";
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_vvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Public btnSearchAirport As B4XView";
_btnsearchairport = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private editairport As B4XFloatTextField";
_vvvvvvvvvvvvv0 = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 6;BA.debugLine="Private supa As Supabase";
_vvvvvvvvv7 = new elicorp.pilot.supabase();
 //BA.debugLineNum = 11;BA.debugLine="Private all_ap As  List";
_all_ap = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private kv As KeyValueStore";
_vvvvvvvvvvvvvv1 = new elicorp.pilot.keyvaluestore();
 //BA.debugLineNum = 13;BA.debugLine="Private BBCodeView1 As BBCodeView";
_vvvvvvvvvvvvv3 = new elicorp.pilot.bbcodeview();
 //BA.debugLineNum = 14;BA.debugLine="Private TextEngine As BCTextEngine";
_vvvvvvvvvvvvvv2 = new elicorp.pilot.bctextengine();
 //BA.debugLineNum = 15;BA.debugLine="Private sql1 As SQL";
_vvvvvvvvvv1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 16;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new elicorp.pilot.b4xcombobox();
 //BA.debugLineNum = 17;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
_vvvvvvvvvvvvv6 = new elicorp.pilot.b4xsearchtemplate();
 //BA.debugLineNum = 18;BA.debugLine="Dim dialog As B4XDialog";
_vvvvvvvvvvv7 = new elicorp.pilot.b4xdialog();
 //BA.debugLineNum = 19;BA.debugLine="Private clvap As CustomListView";
_clvap = new b4a.example3.customlistview();
 //BA.debugLineNum = 21;BA.debugLine="Private exp As Expander";
_vvvvvvvvvvvvvv3 = new com.expander.msn.expander();
 //BA.debugLineNum = 23;BA.debugLine="Private lblvw As B4XView";
_lblvw = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private toast As BCToast";
_vvvvvvvvvvv1 = new elicorp.pilot.bctoast();
 //BA.debugLineNum = 25;BA.debugLine="Private prefdialog As PreferencesDialog";
_vvvvvvvvvvvvvv4 = new elicorp.pilot.preferencesdialog();
 //BA.debugLineNum = 26;BA.debugLine="Private options1 As Map";
_vvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="Private airpt As airport";
_vvvvvvvvvvvvv7 = new elicorp.pilot.b4xmainpage._airport();
 //BA.debugLineNum = 28;BA.debugLine="Private btnedit As B4XView";
_vvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private codeview As BBCodeView";
_codeview = new elicorp.pilot.bbcodeview();
 //BA.debugLineNum = 30;BA.debugLine="Private btnaddap As B4XView";
_vvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private btnbatch As B4XView";
_vvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private btndelete As B4XView";
_vvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private btnsynch As B4XView";
_btnsynch = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private clvsidebar As CustomListView";
_vvvvvvvvvvv6 = new b4a.example3.customlistview();
 //BA.debugLineNum = 40;BA.debugLine="Private Pane1 As B4XView";
_pane1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private btnAbout As B4XView";
_vvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private btndiscussion As B4XView";
_btndiscussion = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private  MonthName() As String";
_vvvvvvvvvvvvvvv1 = new String[(int) (0)];
java.util.Arrays.fill(_vvvvvvvvvvvvvvv1,"");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _clvap_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub clvap_ItemClick (index As Int, Value As Object";
 //BA.debugLineNum = 233;BA.debugLine="exp.ToggleItem(index)";
_vvvvvvvvvvvvvv3._vvv1(_index);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public String  _excel_ready(boolean _success) throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub Excel_Ready (Success As Boolean)";
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return "";
}
public String  _get_airports() throws Exception{
Object _x = null;
 //BA.debugLineNum = 192;BA.debugLine="public Sub get_airports";
 //BA.debugLineNum = 193;BA.debugLine="all_ap=DBUtils.ExecuteList(sql1,\"select * from Ai";
_all_ap = _vvvvvvvvvvvv6._vvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (ba,_vvvvvvvvvv1,"select * from Airport",(String[])(__c.Null),(int) (300));
 //BA.debugLineNum = 194;BA.debugLine="Log(all_ap)";
__c.LogImpl("12621442",BA.ObjectToString(_all_ap),0);
 //BA.debugLineNum = 195;BA.debugLine="For Each x In all_ap";
{
final anywheresoftware.b4a.BA.IterableList group3 = _all_ap;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_x = group3.Get(index3);
 //BA.debugLineNum = 196;BA.debugLine="Log(x)";
__c.LogImpl("12621444",BA.ObjectToString(_x),0);
 }
};
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 49;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _lblvw_click() throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Private Sub lblvw_Click";
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _load_file(String _f) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="private Sub load_file(f)";
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return "";
}
public String  _populate_searchview() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="public Sub populate_searchview";
 //BA.debugLineNum = 105;BA.debugLine="SearchTemplate.SetItems(DBUtils.ExecuteList(sql1,";
_vvvvvvvvvvvvv6._vvvvvvvvvvvvvvv5 /*Object*/ (_vvvvvvvvvvvv6._vvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (ba,_vvvvvvvvvv1,"select distinct ICAO_Code from Airport order by ICAO_code",(String[])(__c.Null),(int) (0)));
 //BA.debugLineNum = 106;BA.debugLine="btnSearchAirport.Enabled=True";
_btnsearchairport.setEnabled(__c.True);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _prettify_ap(elicorp.pilot.b4xmainpage._airport _ap) throws Exception{
String _info = "";
 //BA.debugLineNum = 212;BA.debugLine="Sub prettify_ap(ap As airport) As String";
 //BA.debugLineNum = 214;BA.debugLine="Dim info As String";
_info = "";
 //BA.debugLineNum = 215;BA.debugLine="info=$\"[TextSize=20]Information For Airport [b] $";
_info = ("[TextSize=20]Information For Airport [b] "+__c.SmartStringFormatter("",(Object)(_ap.icao /*String*/ ))+" [/b][/TextSize] "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+"  [TextSize=20][u]Briefing[/u][/TextSize]  "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+"");
 //BA.debugLineNum = 216;BA.debugLine="info=info & ap.briefing & $\"${CRLF & CRLF} [TextS";
_info = _info+_ap.briefing /*String*/ +(""+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+" [TextSize=20] [u]Bulletins[/u][/TextSize]  "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+" "+__c.SmartStringFormatter("",(Object)(_ap.bulletins /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+"  ");
 //BA.debugLineNum = 217;BA.debugLine="info=info &  $\"[TextSize=20][u]FDM Reports[/U][/T";
_info = _info+("[TextSize=20][u]FDM Reports[/U][/TextSize] 	 "+__c.SmartStringFormatter("",(Object)(__c.CRLF+__c.CRLF))+"  "+__c.SmartStringFormatter("",(Object)(_ap.fdm_reports /*String*/ ))+"");
 //BA.debugLineNum = 218;BA.debugLine="Log(info)";
__c.LogImpl("12686982",_info,0);
 //BA.debugLineNum = 219;BA.debugLine="Return info";
if (true) return _info;
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update_remote_fdm(anywheresoftware.b4a.objects.collections.List _fdms) throws Exception{
ResumableSub_update_remote_fdm rsub = new ResumableSub_update_remote_fdm(this,_fdms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_update_remote_fdm extends BA.ResumableSub {
public ResumableSub_update_remote_fdm(elicorp.pilot.view_airport parent,anywheresoftware.b4a.objects.collections.List _fdms) {
this.parent = parent;
this._fdms = _fdms;
}
elicorp.pilot.view_airport parent;
anywheresoftware.b4a.objects.collections.List _fdms;
anywheresoftware.b4a.objects.collections.List _fdm_maps = null;
int _x = 0;
anywheresoftware.b4a.objects.collections.List _row = null;
int _inter = 0;
elicorp.pilot.supabase_databaseinsert _insert = null;
anywheresoftware.b4a.objects.collections.List _lst_bulkinsert = null;
elicorp.pilot.supabase._supabasedatabaseresult _result = null;
int step4;
int limit4;

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
 //BA.debugLineNum = 342;BA.debugLine="Dim fdm_maps As List";
_fdm_maps = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 343;BA.debugLine="Log (fdms)";
parent.__c.LogImpl("13342340",BA.ObjectToString(_fdms),0);
 //BA.debugLineNum = 344;BA.debugLine="fdm_maps.initialize";
_fdm_maps.Initialize();
 //BA.debugLineNum = 348;BA.debugLine="For x=0 To fdms.Size-1";
if (true) break;

case 1:
//for
this.state = 4;
step4 = 1;
limit4 = (int) (_fdms.getSize()-1);
_x = (int) (0) ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 4;
if ((step4 > 0 && _x <= limit4) || (step4 < 0 && _x >= limit4)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_x = ((int)(0 + _x + step4)) ;
if (true) break;

case 3:
//C
this.state = 12;
 //BA.debugLineNum = 349;BA.debugLine="Dim row As List";
_row = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 350;BA.debugLine="row.Initialize";
_row.Initialize();
 //BA.debugLineNum = 351;BA.debugLine="row=fdms.Get(x)";
_row = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_fdms.Get(_x)));
 //BA.debugLineNum = 352;BA.debugLine="Dim inter As Int";
_inter = 0;
 //BA.debugLineNum = 353;BA.debugLine="Dim options1 As Map";
parent._vvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 354;BA.debugLine="options1.initialize";
parent._vvvvvvvvvvvvvv5.Initialize();
 //BA.debugLineNum = 355;BA.debugLine="Log(\"row_data\" & row.get(3))";
parent.__c.LogImpl("13342352","row_data"+BA.ObjectToString(_row.Get((int) (3))),0);
 //BA.debugLineNum = 356;BA.debugLine="options1.Put(\"ICAO_Code\",row.Get(0))";
parent._vvvvvvvvvvvvvv5.Put((Object)("ICAO_Code"),_row.Get((int) (0)));
 //BA.debugLineNum = 357;BA.debugLine="options1.Put(\"Briefing\",row.Get(1))";
parent._vvvvvvvvvvvvvv5.Put((Object)("Briefing"),_row.Get((int) (1)));
 //BA.debugLineNum = 358;BA.debugLine="options1.Put(\"FDM_reports\",row.Get(2))";
parent._vvvvvvvvvvvvvv5.Put((Object)("FDM_reports"),_row.Get((int) (2)));
 //BA.debugLineNum = 359;BA.debugLine="options1.Put(\"special_items\",row.Get(3))";
parent._vvvvvvvvvvvvvv5.Put((Object)("special_items"),_row.Get((int) (3)));
 //BA.debugLineNum = 360;BA.debugLine="Log(options1)";
parent.__c.LogImpl("13342357",BA.ObjectToString(parent._vvvvvvvvvvvvvv5),0);
 //BA.debugLineNum = 362;BA.debugLine="fdm_maps.Add(options1)";
_fdm_maps.Add((Object)(parent._vvvvvvvvvvvvvv5.getObject()));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 365;BA.debugLine="Dim Insert As Supabase_DatabaseInsert =supa.Datab";
_insert = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*elicorp.pilot.supabase_databaseinsert*/ ();
 //BA.debugLineNum = 366;BA.debugLine="Insert.From(\"Airport\")";
_insert._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseinsert*/ ("Airport");
 //BA.debugLineNum = 367;BA.debugLine="Dim lst_BulkInsert As List";
_lst_bulkinsert = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 368;BA.debugLine="lst_BulkInsert.Initialize";
_lst_bulkinsert.Initialize();
 //BA.debugLineNum = 369;BA.debugLine="Wait For (Insert.InsertBulk(fdm_maps).Execute) Co";
parent.__c.WaitFor("complete", ba, this, _insert._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*elicorp.pilot.supabase_databaseinsert*/ (_fdm_maps)._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 13;
return;
case 13:
//C
this.state = 5;
_result = (elicorp.pilot.supabase._supabasedatabaseresult) result[0];
;
 //BA.debugLineNum = 370;BA.debugLine="If Result.error.Success=True Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_result.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ==parent.__c.True) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 371;BA.debugLine="B4XPages.MainPage.shmod.synch_all";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv2 /*elicorp.pilot.sharedmod*/ ._synch_all /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 //BA.debugLineNum = 372;BA.debugLine="toast.Show(\"Airport has been Added\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Airport has been Added");
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 374;BA.debugLine="toast.Show(\"Fault has occured, unable to load FD";
parent._vvvvvvvvvvv1._show /*void*/ ("Fault has occured, unable to load FDM");
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
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
