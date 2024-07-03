package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class insert_airport extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.insert_airport");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.insert_airport.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public elicorp.pilot.b4xfloattextfield _b4xfloattextfield1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btninsert = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _scrollview1 = null;
public elicorp.pilot.b4xfloattextfield _txt_fdm = null;
public elicorp.pilot.b4xfloattextfield _txtbriefing = null;
public elicorp.pilot.b4xfloattextfield _vvvvvvvvvvvv0 = null;
public elicorp.pilot.b4xfloattextfield _vvvvvvvvvvvvv1 = null;
public elicorp.pilot.b4xfloattextfield _txticao = null;
public elicorp.pilot.b4xfloattextfield _vvvvvvvvvvvvv2 = null;
public elicorp.pilot.supabase _vvvvvvvvv7 = null;
public elicorp.pilot.bctoast _vvvvvvvvvvv1 = null;
public elicorp.pilot.bbcodeview _vvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnairpt = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsynch = null;
public elicorp.pilot.b4xsearchtemplate _vvvvvvvvvvvvv6 = null;
public elicorp.pilot.b4xdialog _vvvvvvvvvvv7 = null;
public anywheresoftware.b4a.sql.SQL _vvvvvvvvvv1 = null;
public elicorp.pilot.b4xmainpage._airport _vvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsave = null;
public elicorp.pilot.keyvaluestore _vvvvvvvvv0 = null;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public void  _add_airport(elicorp.pilot.b4xmainpage._airport _this_airport) throws Exception{
ResumableSub_add_airport rsub = new ResumableSub_add_airport(this,_this_airport);
rsub.resume(ba, null);
}
public static class ResumableSub_add_airport extends BA.ResumableSub {
public ResumableSub_add_airport(elicorp.pilot.insert_airport parent,elicorp.pilot.b4xmainpage._airport _this_airport) {
this.parent = parent;
this._this_airport = _this_airport;
}
elicorp.pilot.insert_airport parent;
elicorp.pilot.b4xmainpage._airport _this_airport;
anywheresoftware.b4a.objects.collections.Map _nap = null;
elicorp.pilot.supabase_databaseinsert _insert = null;
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
 //BA.debugLineNum = 86;BA.debugLine="Dim nap As Map";
_nap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 87;BA.debugLine="Dim Insert As Supabase_DatabaseInsert = supa.Data";
_insert = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*elicorp.pilot.supabase_databaseinsert*/ ();
 //BA.debugLineNum = 88;BA.debugLine="Insert.From(\"Airport\")";
_insert._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseinsert*/ ("Airport");
 //BA.debugLineNum = 89;BA.debugLine="nap.Initialize()";
_nap.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="nap.Put(\"ICAO_Code\",this_airport.icao)";
_nap.Put((Object)("ICAO_Code"),(Object)(_this_airport.icao /*String*/ ));
 //BA.debugLineNum = 91;BA.debugLine="nap.Put(\"Briefing\",this_airport.briefing)";
_nap.Put((Object)("Briefing"),(Object)(_this_airport.briefing /*String*/ ));
 //BA.debugLineNum = 92;BA.debugLine="nap.Put(\"special_items\",this_airport.special_item";
_nap.Put((Object)("special_items"),(Object)(_this_airport.special_items /*String*/ ));
 //BA.debugLineNum = 93;BA.debugLine="nap.Put(\"Bulletins\",this_airport.bulletins)";
_nap.Put((Object)("Bulletins"),(Object)(_this_airport.bulletins /*String*/ ));
 //BA.debugLineNum = 94;BA.debugLine="nap.Put(\"FDM_reports\",this_airport.fdm_reports)";
_nap.Put((Object)("FDM_reports"),(Object)(_this_airport.fdm_reports /*String*/ ));
 //BA.debugLineNum = 95;BA.debugLine="Wait For (Insert.Insert(nap).Execute) Complete (R";
parent.__c.WaitFor("complete", ba, this, _insert._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseinsert*/ (_nap)._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (elicorp.pilot.supabase._supabaseerror) result[0];
;
 //BA.debugLineNum = 96;BA.debugLine="If Result.Success=True Then";
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
 //BA.debugLineNum = 97;BA.debugLine="toast.show(\"Airport Added\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Airport Added");
 //BA.debugLineNum = 98;BA.debugLine="B4XPages.MainPage.shmod.synch_aLL";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv2 /*elicorp.pilot.sharedmod*/ ._synch_all /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 //BA.debugLineNum = 99;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,this,(int) (2000));
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 //BA.debugLineNum = 100;BA.debugLine="B4XPages.ClosePage(Me)";
parent._vvvvvvvvvvvv4._vv3 /*String*/ (ba,parent);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 102;BA.debugLine="Log (Result.ErrorMessage)";
parent.__c.LogImpl("12031634",_result.ErrorMessage /*String*/ ,0);
 //BA.debugLineNum = 103;BA.debugLine="toast.show(\"Error Occured, Airport not added\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Error Occured, Airport not added");
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(elicorp.pilot.supabase._supabaseerror _result) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 37;BA.debugLine="Root = Root1";
_vvvvvvvvv5 = _root1;
 //BA.debugLineNum = 38;BA.debugLine="supa=B4XPages.MainPage.supa";
_vvvvvvvvv7 = _vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv7 /*elicorp.pilot.supabase*/ ;
 //BA.debugLineNum = 39;BA.debugLine="Root.LoadLayout(\"insert_airport\")";
_vvvvvvvvv5.LoadLayout("insert_airport",ba);
 //BA.debugLineNum = 40;BA.debugLine="B4XPages.SetTitle(Me,\"Add Airport\")";
_vvvvvvvvvvvv4._vvv3 /*String*/ (ba,this,(Object)("Add Airport"));
 //BA.debugLineNum = 41;BA.debugLine="sql1=B4XPages.MainPage.sql1";
_vvvvvvvvvv1 = _vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv1 /*anywheresoftware.b4a.sql.SQL*/ ;
 //BA.debugLineNum = 42;BA.debugLine="kvs=B4XPages.MainPage.kvs";
_vvvvvvvvv0 = _vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ;
 //BA.debugLineNum = 43;BA.debugLine="If kvs.Get(\"currentap\")=Null Then";
if (_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("currentap")== null) { 
 //BA.debugLineNum = 44;BA.debugLine="btnsave.Enabled=False";
_btnsave.setEnabled(__c.False);
 //BA.debugLineNum = 45;BA.debugLine="btnsynch.Enabled=False";
_btnsynch.setEnabled(__c.False);
 }else {
 //BA.debugLineNum = 47;BA.debugLine="airpt=kvs.Get(\"currentap\")";
_vvvvvvvvvvvvv7 = (elicorp.pilot.b4xmainpage._airport)(_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*Object*/ ("currentap"));
 //BA.debugLineNum = 48;BA.debugLine="txtBriefing.Text=airpt.briefing";
_txtbriefing._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ (_vvvvvvvvvvvvv7.briefing /*String*/ );
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.SetTitle(Me,\"Editing Airport \"& airpt.i";
_vvvvvvvvvvvv4._vvv3 /*String*/ (ba,this,(Object)("Editing Airport "+_vvvvvvvvvvvvv7.icao /*String*/ ));
 //BA.debugLineNum = 50;BA.debugLine="btnsave.Enabled=True";
_btnsave.setEnabled(__c.True);
 //BA.debugLineNum = 51;BA.debugLine="btnsynch.Enabled=True";
_btnsynch.setEnabled(__c.True);
 };
 //BA.debugLineNum = 55;BA.debugLine="toast.Initialize(Root)";
_vvvvvvvvvvv1._initialize /*String*/ (ba,_vvvvvvvvv5);
 //BA.debugLineNum = 56;BA.debugLine="dialog.Initialize(Root)";
_vvvvvvvvvvv7._initialize /*String*/ (ba,_vvvvvvvvv5);
 //BA.debugLineNum = 57;BA.debugLine="SearchTemplate.Initialize()";
_vvvvvvvvvvvvv6._initialize /*String*/ (ba);
 //BA.debugLineNum = 58;BA.debugLine="toast.Initialize(Root)";
_vvvvvvvvvvv1._initialize /*String*/ (ba,_vvvvvvvvv5);
 //BA.debugLineNum = 59;BA.debugLine="btnairpt.Enabled=False";
_btnairpt.setEnabled(__c.False);
 //BA.debugLineNum = 60;BA.debugLine="populate_searchview";
_populate_searchview();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _bbcodeview1_linkclicked(String _url) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Private Sub BBCodeView1_LinkClicked (URL As String";
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _btnaddap_click() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub btnaddap_Click";
 //BA.debugLineNum = 116;BA.debugLine="B4XPages.ShowPage(\"insert_airport\")";
_vvvvvvvvvvvv4._vvv4 /*String*/ (ba,"insert_airport");
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _btnadmin_click() throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Private Sub Btnadmin_Click";
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public void  _btnairpt_click() throws Exception{
ResumableSub_btnairpt_Click rsub = new ResumableSub_btnairpt_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnairpt_Click extends BA.ResumableSub {
public ResumableSub_btnairpt_Click(elicorp.pilot.insert_airport parent) {
this.parent = parent;
}
elicorp.pilot.insert_airport parent;
int _result = 0;
String _this_airport = "";
anywheresoftware.b4a.objects.collections.List _airportdata = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cursor1 = null;
String _query = "";
String[] _values = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 121;BA.debugLine="populate_searchview";
parent._populate_searchview();
 //BA.debugLineNum = 122;BA.debugLine="Wait For (dialog.ShowTemplate(SearchTemplate, \"\",";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._vvvvvvvvvvvvv6),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 123;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._vvvvvvvvv6.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 124;BA.debugLine="Private this_airport As String";
_this_airport = "";
 //BA.debugLineNum = 125;BA.debugLine="this_airport= SearchTemplate.SelectedItem";
_this_airport = parent._vvvvvvvvvvvvv6._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*String*/ ;
 //BA.debugLineNum = 126;BA.debugLine="Dim airportdata As List";
_airportdata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 127;BA.debugLine="airportdata.initialize";
_airportdata.Initialize();
 //BA.debugLineNum = 129;BA.debugLine="Dim cursor1 As ResultSet";
_cursor1 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 130;BA.debugLine="Dim query As String=\"select * from Airport where";
_query = "select * from Airport where  ICAO_CODE = '"+_this_airport+"'";
 //BA.debugLineNum = 131;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 133;BA.debugLine="airportdata=DBUtils.ExecuteMemoryTable(sql1,query";
_airportdata = parent._vvvvvvvvvvvv6._vvvvv6 /*anywheresoftware.b4a.objects.collections.List*/ (ba,parent._vvvvvvvvvv1,_query,(String[])(parent.__c.Null),(int) (0));
 //BA.debugLineNum = 135;BA.debugLine="values=airportdata.Get(0)";
_values = (String[])(_airportdata.Get((int) (0)));
 //BA.debugLineNum = 137;BA.debugLine="airportdata=values";
_airportdata = anywheresoftware.b4a.keywords.Common.ArrayToList(_values);
 //BA.debugLineNum = 138;BA.debugLine="Log(airportdata)";
parent.__c.LogImpl("167567634",BA.ObjectToString(_airportdata),0);
 //BA.debugLineNum = 139;BA.debugLine="airpt.id=airportdata.Get(0)";
parent._vvvvvvvvvvvvv7.id /*String*/  = BA.ObjectToString(_airportdata.Get((int) (0)));
 //BA.debugLineNum = 140;BA.debugLine="airpt.icao=airportdata.Get(1)";
parent._vvvvvvvvvvvvv7.icao /*String*/  = BA.ObjectToString(_airportdata.Get((int) (1)));
 //BA.debugLineNum = 141;BA.debugLine="airpt.briefing=airportdata.Get(2)";
parent._vvvvvvvvvvvvv7.briefing /*String*/  = BA.ObjectToString(_airportdata.Get((int) (2)));
 //BA.debugLineNum = 142;BA.debugLine="txtBriefing.Text=airpt.briefing";
parent._txtbriefing._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ (parent._vvvvvvvvvvvvv7.briefing /*String*/ );
 //BA.debugLineNum = 143;BA.debugLine="B4XPages.SetTitle(Me,\"Editing Airport \"& airpt.ic";
parent._vvvvvvvvvvvv4._vvv3 /*String*/ (ba,parent,(Object)("Editing Airport "+parent._vvvvvvvvvvvvv7.icao /*String*/ ));
 //BA.debugLineNum = 144;BA.debugLine="btnsave.Enabled=True";
parent._btnsave.setEnabled(parent.__c.True);
 //BA.debugLineNum = 145;BA.debugLine="btnsynch.Enabled=True";
parent._btnsynch.setEnabled(parent.__c.True);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnbatch_click() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Private Sub btnbatch_Click";
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _btninsert_click() throws Exception{
elicorp.pilot.b4xmainpage._airport _ap = null;
 //BA.debugLineNum = 66;BA.debugLine="Private Sub btnInsert_Click";
 //BA.debugLineNum = 68;BA.debugLine="Dim ap As airport";
_ap = new elicorp.pilot.b4xmainpage._airport();
 //BA.debugLineNum = 69;BA.debugLine="ap.icao=txtICAO.Text.Trim";
_ap.icao /*String*/  = _txticao._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ ().trim();
 //BA.debugLineNum = 70;BA.debugLine="ap.briefing=txtBriefing.Text.Trim";
_ap.briefing /*String*/  = _txtbriefing._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ ().trim();
 //BA.debugLineNum = 71;BA.debugLine="ap.special_items=\"\"";
_ap.special_items /*String*/  = "";
 //BA.debugLineNum = 72;BA.debugLine="ap.fdm_reports=txtFdm.Text.Trim";
_ap.fdm_reports /*String*/  = _vvvvvvvvvvvvv1._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ ().trim();
 //BA.debugLineNum = 73;BA.debugLine="ap.bulletins=txtBulletins.Text.trim";
_ap.bulletins /*String*/  = _vvvvvvvvvvvv0._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ ().trim();
 //BA.debugLineNum = 74;BA.debugLine="If ap.icao.Length<>4 Then";
if (_ap.icao /*String*/ .length()!=4) { 
 //BA.debugLineNum = 75;BA.debugLine="toast.show(\"You need to insert ICAO 4 Letter cod";
_vvvvvvvvvvv1._show /*void*/ ("You need to insert ICAO 4 Letter code");
 }else {
 //BA.debugLineNum = 78;BA.debugLine="add_airport(ap)";
_add_airport(_ap);
 };
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Private Sub btnsave_Click";
 //BA.debugLineNum = 156;BA.debugLine="airpt.briefing=txtBriefing.Text";
_vvvvvvvvvvvvv7.briefing /*String*/  = _txtbriefing._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*String*/ ();
 //BA.debugLineNum = 157;BA.debugLine="kvs.Put(\"currentap\",airpt)";
_vvvvvvvvv0._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ ("currentap",(Object)(_vvvvvvvvvvvvv7));
 //BA.debugLineNum = 158;BA.debugLine="toast.Show(\"Data saved on your phone\")";
_vvvvvvvvvvv1._show /*void*/ ("Data saved on your phone");
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public void  _btnsynch_click() throws Exception{
ResumableSub_btnsynch_Click rsub = new ResumableSub_btnsynch_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnsynch_Click extends BA.ResumableSub {
public ResumableSub_btnsynch_Click(elicorp.pilot.insert_airport parent) {
this.parent = parent;
}
elicorp.pilot.insert_airport parent;
elicorp.pilot.supabase_databaseupdate _update = null;
elicorp.pilot.supabase._supabasedatabaseresult _resultee = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 162;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 163;BA.debugLine="btnsynch.Enabled=False";
parent._btnsynch.setEnabled(parent.__c.False);
 //BA.debugLineNum = 164;BA.debugLine="toast.Show(\"Standby, uploading\")";
parent._vvvvvvvvvvv1._show /*void*/ ("Standby, uploading");
 //BA.debugLineNum = 166;BA.debugLine="Dim Update As Supabase_DatabaseUpdate = supa.Dat";
_update = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_databaseupdate*/ ();
 //BA.debugLineNum = 168;BA.debugLine="Update.From(\"Airport\")";
_update._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseupdate*/ ("Airport");
 //BA.debugLineNum = 171;BA.debugLine="Update.Eq(CreateMap(\"ICAO_Code\":airpt.icao))";
_update._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*elicorp.pilot.supabase_databaseupdate*/ (parent.__c.createMap(new Object[] {(Object)("ICAO_Code"),(Object)(parent._vvvvvvvvvvvvv7.icao /*String*/ )}));
 //BA.debugLineNum = 172;BA.debugLine="Update.Update(CreateMap(\"Briefing\":airpt.briefin";
_update._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*elicorp.pilot.supabase_databaseupdate*/ (parent.__c.createMap(new Object[] {(Object)("Briefing"),(Object)(parent._vvvvvvvvvvvvv7.briefing /*String*/ )}));
 //BA.debugLineNum = 174;BA.debugLine="Wait For (Update.Execute) Complete (Resultee As";
parent.__c.WaitFor("complete", ba, this, _update._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 13;
return;
case 13:
//C
this.state = 4;
_resultee = (elicorp.pilot.supabase._supabasedatabaseresult) result[0];
;
 //BA.debugLineNum = 184;BA.debugLine="If Resultee.error.Success=True Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_resultee.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ==parent.__c.True) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 185;BA.debugLine="btnsynch.Enabled=True";
parent._btnsynch.setEnabled(parent.__c.True);
 //BA.debugLineNum = 186;BA.debugLine="toast.show(\"Airport Added,  Synching main datab";
parent._vvvvvvvvvvv1._show /*void*/ ("Airport Added,  Synching main database");
 //BA.debugLineNum = 188;BA.debugLine="B4XPages.MainPage.shmod.Initialize";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv2 /*elicorp.pilot.sharedmod*/ ._initialize /*String*/ (ba);
 //BA.debugLineNum = 189;BA.debugLine="B4XPages.MainPage.shmod.synch_all";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv2 /*elicorp.pilot.sharedmod*/ ._synch_all /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 193;BA.debugLine="toast.show(\"Unable to complete action, please t";
parent._vvvvvvvvvvv1._show /*void*/ ("Unable to complete action, please try again later");
 //BA.debugLineNum = 194;BA.debugLine="btnsynch.Enabled=True";
parent._btnsynch.setEnabled(parent.__c.True);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 198;BA.debugLine="toast.Show(\"Error while updating, Error: \" & Las";
parent._vvvvvvvvvvv1._show /*void*/ ("Error while updating, Error: "+parent.__c.LastException(ba).getMessage());
 //BA.debugLineNum = 199;BA.debugLine="btnsynch.Enabled=True";
parent._btnsynch.setEnabled(parent.__c.True);
 //BA.debugLineNum = 200;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("167764263",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_vvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private B4XFloatTextField1 As B4XFloatTextField";
_b4xfloattextfield1 = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 6;BA.debugLine="Private btnInsert As B4XView";
_btninsert = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private ScrollView1 As B4XView";
_scrollview1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private txt_fdm As B4XFloatTextField";
_txt_fdm = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 9;BA.debugLine="Private txtBriefing As B4XFloatTextField";
_txtbriefing = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 10;BA.debugLine="Private txtBulletins As B4XFloatTextField";
_vvvvvvvvvvvv0 = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 11;BA.debugLine="Private txtFdm As B4XFloatTextField";
_vvvvvvvvvvvvv1 = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 12;BA.debugLine="Private txtICAO As B4XFloatTextField";
_txticao = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 13;BA.debugLine="Private txticaocode As B4XFloatTextField";
_vvvvvvvvvvvvv2 = new elicorp.pilot.b4xfloattextfield();
 //BA.debugLineNum = 14;BA.debugLine="Private supa As Supabase";
_vvvvvvvvv7 = new elicorp.pilot.supabase();
 //BA.debugLineNum = 15;BA.debugLine="Private toast As BCToast";
_vvvvvvvvvvv1 = new elicorp.pilot.bctoast();
 //BA.debugLineNum = 16;BA.debugLine="Private BBCodeView1 As BBCodeView";
_vvvvvvvvvvvvv3 = new elicorp.pilot.bbcodeview();
 //BA.debugLineNum = 17;BA.debugLine="Private btnaddap As B4XView";
_vvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private btnbatch As B4XView";
_vvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private btnairpt As B4XView";
_btnairpt = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private btnsynch As B4XView";
_btnsynch = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private SearchTemplate As B4XSearchTemplate";
_vvvvvvvvvvvvv6 = new elicorp.pilot.b4xsearchtemplate();
 //BA.debugLineNum = 22;BA.debugLine="Private dialog As B4XDialog";
_vvvvvvvvvvv7 = new elicorp.pilot.b4xdialog();
 //BA.debugLineNum = 23;BA.debugLine="Private sql1 As SQL";
_vvvvvvvvvv1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 24;BA.debugLine="Private toast As BCToast";
_vvvvvvvvvvv1 = new elicorp.pilot.bctoast();
 //BA.debugLineNum = 25;BA.debugLine="Private airpt As airport";
_vvvvvvvvvvvvv7 = new elicorp.pilot.b4xmainpage._airport();
 //BA.debugLineNum = 26;BA.debugLine="Private btnsave As B4XView";
_btnsave = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private kvs As KeyValueStore";
_vvvvvvvvv0 = new elicorp.pilot.keyvaluestore();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _populate_searchview() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="public Sub populate_searchview";
 //BA.debugLineNum = 150;BA.debugLine="SearchTemplate.SetItems(DBUtils.ExecuteList(sql1,";
_vvvvvvvvvvvvv6._vvvvvvvvvvvvvvv5 /*Object*/ (_vvvvvvvvvvvv6._vvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ (ba,_vvvvvvvvvv1,"select distinct ICAO_Code from Airport order by ICAO_code",(String[])(__c.Null),(int) (0)));
 //BA.debugLineNum = 151;BA.debugLine="btnairpt.Enabled=True";
_btnairpt.setEnabled(__c.True);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
