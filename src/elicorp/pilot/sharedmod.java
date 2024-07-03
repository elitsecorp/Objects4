package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sharedmod extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.sharedmod");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.sharedmod.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _vvvvvvvvvvvvvvvvv0 = null;
public elicorp.pilot.supabase _vvvvvvvvv7 = null;
public elicorp.pilot.bctoast _vvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnfdm = null;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public String  _btnfdm_click() throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Private Sub btnfdm_Click";
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _check_approved() throws Exception{
ResumableSub_check_approved rsub = new ResumableSub_check_approved(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_check_approved extends BA.ResumableSub {
public ResumableSub_check_approved(elicorp.pilot.sharedmod parent) {
this.parent = parent;
}
elicorp.pilot.sharedmod parent;
elicorp.pilot.supabase_databaseselect _query = null;
elicorp.pilot.supabase._supabasedatabaseresult _databaseresult = null;
anywheresoftware.b4a.objects.collections.Map _resultmap = null;
boolean _approved = false;

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
 //BA.debugLineNum = 89;BA.debugLine="Log(\"got here\")";
parent.__c.LogImpl("14915201","got here",0);
 //BA.debugLineNum = 90;BA.debugLine="Dim Query As Supabase_DatabaseSelect = supa.Datab";
_query = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_databaseselect*/ ();
 //BA.debugLineNum = 91;BA.debugLine="Query.Columns(\"*\").From(\"userinfo\")";
_query._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_databaseselect*/ ("*")._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseselect*/ ("userinfo");
 //BA.debugLineNum = 92;BA.debugLine="Log(\"company id \" & B4XPages.MainPage.company_id)";
parent.__c.LogImpl("14915204","company id "+parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._company_id /*String*/ ,0);
 //BA.debugLineNum = 93;BA.debugLine="Query.Filter_Equal(CreateMap (\"company_id\":B4XPag";
_query._filter_equal /*elicorp.pilot.supabase_databaseselect*/ (parent.__c.createMap(new Object[] {(Object)("company_id"),(Object)(parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._company_id /*String*/ )}));
 //BA.debugLineNum = 94;BA.debugLine="Wait For (Query.Execute) Complete (DatabaseResult";
parent.__c.WaitFor("complete", ba, this, _query._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 17;
return;
case 17:
//C
this.state = 1;
_databaseresult = (elicorp.pilot.supabase._supabasedatabaseresult) result[0];
;
 //BA.debugLineNum = 95;BA.debugLine="Log(DatabaseResult)";
parent.__c.LogImpl("14915207",BA.ObjectToString(_databaseresult),0);
 //BA.debugLineNum = 96;BA.debugLine="Dim resultmap As Map";
_resultmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 97;BA.debugLine="resultmap.initialize";
_resultmap.Initialize();
 //BA.debugLineNum = 98;BA.debugLine="If DatabaseResult.Error.Success Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_databaseresult.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 99;BA.debugLine="If  DatabaseResult.Rows.Size>0 Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 100;BA.debugLine="resultmap=DatabaseResult.Rows.Get(0)";
_resultmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
 //BA.debugLineNum = 101;BA.debugLine="Log(\"approved status\" & resultmap.Get(\"approved";
parent.__c.LogImpl("14915213","approved status"+BA.ObjectToString(_resultmap.Get((Object)("approved"))),0);
 //BA.debugLineNum = 102;BA.debugLine="Dim approved As Boolean=resultmap.Get(\"approved";
_approved = BA.ObjectToBoolean(_resultmap.Get((Object)("approved")));
 //BA.debugLineNum = 103;BA.debugLine="If approved=\"true\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_approved==BA.ObjectToBoolean("true")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 104;BA.debugLine="B4XPages.MainPage.kvs.Put(\"approved\",True)";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*String*/ ("approved",(Object)(parent.__c.True));
 //BA.debugLineNum = 105;BA.debugLine="B4XPages.MainPage.load_userdata";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._load_userdata /*String*/ ();
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 108;BA.debugLine="Log(\"no results\")";
parent.__c.LogImpl("14915220","no results",0);
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 112;BA.debugLine="Log(\"Error Reading data\")";
parent.__c.LogImpl("14915224","Error Reading data",0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(elicorp.pilot.supabase._supabasedatabaseresult _databaseresult) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public sql3 As SQL 'backup db";
_vvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 4;BA.debugLine="Private supa As Supabase";
_vvvvvvvvv7 = new elicorp.pilot.supabase();
 //BA.debugLineNum = 5;BA.debugLine="supa=B4XPages.MainPage.supa";
_vvvvvvvvv7 = _vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv7 /*elicorp.pilot.supabase*/ ;
 //BA.debugLineNum = 6;BA.debugLine="Private toast As BCToast";
_vvvvvvvvvvv1 = new elicorp.pilot.bctoast();
 //BA.debugLineNum = 7;BA.debugLine="Private btnfdm As B4XView";
_btnfdm = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvv7(String _link,String _filename) throws Exception{
ResumableSub_DownloadAndSaveFile rsub = new ResumableSub_DownloadAndSaveFile(this,_link,_filename);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadAndSaveFile extends BA.ResumableSub {
public ResumableSub_DownloadAndSaveFile(elicorp.pilot.sharedmod parent,String _link,String _filename) {
this.parent = parent;
this._link = _link;
this._filename = _filename;
}
elicorp.pilot.sharedmod parent;
String _link;
String _filename;
elicorp.pilot.httpjob _j = null;
String _setting_str = "";
boolean _result = false;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

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
 //BA.debugLineNum = 278;BA.debugLine="Dim j As HttpJob";
_j = new elicorp.pilot.httpjob();
 //BA.debugLineNum = 279;BA.debugLine="Dim setting_str  As String";
_setting_str = "";
 //BA.debugLineNum = 280;BA.debugLine="wait for (B4XPages.MainPage.internet.Check(False)";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvvv2 /*elicorp.pilot.b4xcheckinternetlm*/ ._vvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent.__c.False));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 281;BA.debugLine="If result= False Then";
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
 //BA.debugLineNum = 283;BA.debugLine="Log(\"no internet\")";
parent.__c.LogImpl("15308422","no internet",0);
 //BA.debugLineNum = 285;BA.debugLine="Return \"\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(""));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 287;BA.debugLine="j.Initialize(\"\",Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 288;BA.debugLine="j.Download(Link)";
_j._vvvvvvvvvvvvvvvvvvvvv2 /*String*/ (_link);
 //BA.debugLineNum = 289;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (elicorp.pilot.httpjob) result[0];
;
 //BA.debugLineNum = 290;BA.debugLine="Log(\"downloading \" & filename)";
parent.__c.LogImpl("15308429","downloading "+_filename,0);
 //BA.debugLineNum = 291;BA.debugLine="If j.Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 297;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.D";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirInternal(),_filename,parent.__c.False);
 //BA.debugLineNum = 300;BA.debugLine="setting_str=j.GetString";
_setting_str = _j._vvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ();
 //BA.debugLineNum = 301;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._vvvvvvvvvvvvvvvvvvvvv0 /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 302;BA.debugLine="out.Close '<------ very important";
_out.Close();
 //BA.debugLineNum = 303;BA.debugLine="Log(\"success downloading file\")";
parent.__c.LogImpl("15308442","success downloading file",0);
 //BA.debugLineNum = 304;BA.debugLine="Return setting_str";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_setting_str));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 306;BA.debugLine="Return \"\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(""));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 308;BA.debugLine="j.Release";
_j._vvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(elicorp.pilot.httpjob _j) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public boolean  _swap_dbs(String _main_db,String _backup_db) throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="public Sub swap_dbs(main_db,backup_db) As Boolean";
 //BA.debugLineNum = 250;BA.debugLine="B4XPages.MainPage.sql1.Close";
_vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvv1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
 //BA.debugLineNum = 261;BA.debugLine="File.Delete(File.Dirinternal,main_db)";
__c.File.Delete(__c.File.getDirInternal(),_main_db);
 //BA.debugLineNum = 262;BA.debugLine="File.Copy(File.Dirinternal,backup_db,File.Dirinte";
__c.File.Copy(__c.File.getDirInternal(),_backup_db,__c.File.getDirInternal(),_main_db);
 //BA.debugLineNum = 263;BA.debugLine="B4XPages.MainPage.connect_to_sql";
_vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._connect_to_sql /*boolean*/ ();
 //BA.debugLineNum = 266;BA.debugLine="sql3.close";
_vvvvvvvvvvvvvvvvv0.Close();
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sync_fdm() throws Exception{
ResumableSub_sync_fdm rsub = new ResumableSub_sync_fdm(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_sync_fdm extends BA.ResumableSub {
public ResumableSub_sync_fdm(elicorp.pilot.sharedmod parent) {
this.parent = parent;
}
elicorp.pilot.sharedmod parent;
anywheresoftware.b4a.objects.collections.Map _fdmschema = null;
String _resfdm = "";
elicorp.pilot.supabase_databaseselect _fdmquery = null;
anywheresoftware.b4a.objects.collections.List _fdmlist = null;
elicorp.pilot.supabase._supabasedatabaseresult _fdmdatabaseresult = null;
boolean _resultfdm = false;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _fdmcursor = null;

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
 //BA.debugLineNum = 203;BA.debugLine="Private fdmSchema As Map";
_fdmschema = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 204;BA.debugLine="fdmSchema.Initialize()";
_fdmschema.Initialize();
 //BA.debugLineNum = 205;BA.debugLine="fdmSchema.Put(\"id\",DBUtils.DB_INTEGER)";
_fdmschema.Put((Object)("id"),(Object)(parent._vvvvvvvvvvvv6._db_integer /*String*/ ));
 //BA.debugLineNum = 206;BA.debugLine="fdmSchema.Put(\"created_at\",DBUtils.DB_INTEGER)";
_fdmschema.Put((Object)("created_at"),(Object)(parent._vvvvvvvvvvvv6._db_integer /*String*/ ));
 //BA.debugLineNum = 207;BA.debugLine="fdmSchema.Put(\"icao_code\",DBUtils.DB_TEXT)";
_fdmschema.Put((Object)("icao_code"),(Object)(parent._vvvvvvvvvvvv6._db_text /*String*/ ));
 //BA.debugLineNum = 208;BA.debugLine="fdmSchema.Put(\"iata_code\",DBUtils.DB_TEXT)";
_fdmschema.Put((Object)("iata_code"),(Object)(parent._vvvvvvvvvvvv6._db_text /*String*/ ));
 //BA.debugLineNum = 209;BA.debugLine="fdmSchema.Put(\"fdm_event\",DBUtils.DB_TEXT)";
_fdmschema.Put((Object)("fdm_event"),(Object)(parent._vvvvvvvvvvvv6._db_text /*String*/ ));
 //BA.debugLineNum = 210;BA.debugLine="fdmSchema.Put(\"frequency\",DBUtils.DB_REAL)";
_fdmschema.Put((Object)("frequency"),(Object)(parent._vvvvvvvvvvvv6._db_real /*String*/ ));
 //BA.debugLineNum = 211;BA.debugLine="fdmSchema.Put(\"year\",DBUtils.DB_INTEGER)";
_fdmschema.Put((Object)("year"),(Object)(parent._vvvvvvvvvvvv6._db_integer /*String*/ ));
 //BA.debugLineNum = 212;BA.debugLine="fdmSchema.Put(\"month\",DBUtils.DB_INTEGER)";
_fdmschema.Put((Object)("month"),(Object)(parent._vvvvvvvvvvvv6._db_integer /*String*/ ));
 //BA.debugLineNum = 213;BA.debugLine="Dim resFDM As String = DBUtils.CreateTable(sql3,";
_resfdm = parent._vvvvvvvvvvvv6._vvvv5 /*String*/ (ba,parent._vvvvvvvvvvvvvvvvv0,"FDM",_fdmschema,"");
 //BA.debugLineNum = 215;BA.debugLine="Log(\"FDM table Creation status: \" & resFDM)";
parent.__c.LogImpl("15111821","FDM table Creation status: "+_resfdm,0);
 //BA.debugLineNum = 216;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,this,(int) (2000));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 //BA.debugLineNum = 218;BA.debugLine="Dim FDMQuery As Supabase_DatabaseSelect = supa.Da";
_fdmquery = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_databaseselect*/ ();
 //BA.debugLineNum = 219;BA.debugLine="Dim fdmList As List";
_fdmlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 220;BA.debugLine="fdmList.Initialize";
_fdmlist.Initialize();
 //BA.debugLineNum = 221;BA.debugLine="FDMQuery.Columns(\"*\").From(\"FDM\")";
_fdmquery._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_databaseselect*/ ("*")._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseselect*/ ("FDM");
 //BA.debugLineNum = 224;BA.debugLine="Wait For (FDMQuery.Execute) Complete (FDMDatabase";
parent.__c.WaitFor("complete", ba, this, _fdmquery._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 12;
return;
case 12:
//C
this.state = 1;
_fdmdatabaseresult = (elicorp.pilot.supabase._supabasedatabaseresult) result[0];
;
 //BA.debugLineNum = 226;BA.debugLine="If FDMDatabaseResult.Error.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_fdmdatabaseresult.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 227;BA.debugLine="Dim resultFDM As Boolean = DBUtils.InsertMaps(sq";
_resultfdm = parent._vvvvvvvvvvvv6._vvvvvv4 /*boolean*/ (ba,parent._vvvvvvvvvvvvvvvvv0,"FDM",_fdmdatabaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 228;BA.debugLine="Log(FDMDatabaseResult.Rows.Size)";
parent.__c.LogImpl("15111834",BA.NumberToString(_fdmdatabaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
 //BA.debugLineNum = 229;BA.debugLine="Log(\"FDM table Insertion status: \" & resultFDM)";
parent.__c.LogImpl("15111835","FDM table Insertion status: "+BA.ObjectToString(_resultfdm),0);
 //BA.debugLineNum = 230;BA.debugLine="Dim FDMCursor As ResultSet";
_fdmcursor = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 232;BA.debugLine="FDMCursor = sql3.ExecQuery(\"SELECT * FROM FDM\")";
_fdmcursor = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent._vvvvvvvvvvvvvvvvv0.ExecQuery("SELECT * FROM FDM")));
 //BA.debugLineNum = 233;BA.debugLine="Do While FDMCursor.NextRow";
if (true) break;

case 4:
//do while
this.state = 7;
while (_fdmcursor.NextRow()) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
 //BA.debugLineNum = 234;BA.debugLine="Log(\"************************\")";
parent.__c.LogImpl("15111840","************************",0);
 //BA.debugLineNum = 235;BA.debugLine="Log(\"ICAO Code: \" & FDMCursor.GetString(\"icao_c";
parent.__c.LogImpl("15111841","ICAO Code: "+_fdmcursor.GetString("icao_code"),0);
 //BA.debugLineNum = 236;BA.debugLine="Log(\"FDM Event: \" & FDMCursor.GetString(\"fdm_ev";
parent.__c.LogImpl("15111842","FDM Event: "+_fdmcursor.GetString("fdm_event"),0);
 if (true) break;

case 7:
//C
this.state = 10;
;
 //BA.debugLineNum = 238;BA.debugLine="FDMCursor.Close";
_fdmcursor.Close();
 //BA.debugLineNum = 239;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 241;BA.debugLine="Log(\"Error syncing FDM data\")";
parent.__c.LogImpl("15111847","Error syncing FDM data",0);
 //BA.debugLineNum = 242;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _synch_airport() throws Exception{
ResumableSub_synch_airport rsub = new ResumableSub_synch_airport(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_synch_airport extends BA.ResumableSub {
public ResumableSub_synch_airport(elicorp.pilot.sharedmod parent) {
this.parent = parent;
}
elicorp.pilot.sharedmod parent;
anywheresoftware.b4a.objects.collections.Map _apschema = null;
String _res = "";
elicorp.pilot.supabase_databaseselect _query = null;
anywheresoftware.b4a.objects.collections.List _ap_list = null;
elicorp.pilot.supabase._supabasedatabaseresult _databaseresult = null;
boolean _resul = false;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _cursor1 = null;

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
 //BA.debugLineNum = 155;BA.debugLine="Private apschema As Map";
_apschema = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 156;BA.debugLine="apschema.Initialize()";
_apschema.Initialize();
 //BA.debugLineNum = 157;BA.debugLine="apschema.Put(\"id\",DBUtils.DB_INTEGER)";
_apschema.Put((Object)("id"),(Object)(parent._vvvvvvvvvvvv6._db_integer /*String*/ ));
 //BA.debugLineNum = 158;BA.debugLine="apschema.Put(\"ICAO_CODE\",DBUtils.DB_TEXT)";
_apschema.Put((Object)("ICAO_CODE"),(Object)(parent._vvvvvvvvvvvv6._db_text /*String*/ ));
 //BA.debugLineNum = 159;BA.debugLine="apschema.Put(\"Briefing\",DBUtils.DB_TEXT)";
_apschema.Put((Object)("Briefing"),(Object)(parent._vvvvvvvvvvvv6._db_text /*String*/ ));
 //BA.debugLineNum = 160;BA.debugLine="apschema.Put(\"Bulletins\",DBUtils.DB_TEXT)";
_apschema.Put((Object)("Bulletins"),(Object)(parent._vvvvvvvvvvvv6._db_text /*String*/ ));
 //BA.debugLineNum = 161;BA.debugLine="apschema.Put(\"FDM_reports\",DBUtils.DB_TEXT)";
_apschema.Put((Object)("FDM_reports"),(Object)(parent._vvvvvvvvvvvv6._db_text /*String*/ ));
 //BA.debugLineNum = 162;BA.debugLine="apschema.Put(\"special_items\",DBUtils.DB_TEXT)";
_apschema.Put((Object)("special_items"),(Object)(parent._vvvvvvvvvvvv6._db_text /*String*/ ));
 //BA.debugLineNum = 163;BA.debugLine="apschema.Put(\"created_at\",DBUtils.DB_INTEGER)";
_apschema.Put((Object)("created_at"),(Object)(parent._vvvvvvvvvvvv6._db_integer /*String*/ ));
 //BA.debugLineNum = 164;BA.debugLine="Dim res As String=DBUtils.CreateTable(sql3,\"Airpo";
_res = parent._vvvvvvvvvvvv6._vvvv5 /*String*/ (ba,parent._vvvvvvvvvvvvvvvvv0,"Airport",_apschema,"");
 //BA.debugLineNum = 166;BA.debugLine="Log (\"table Createion status: \" & res)";
parent.__c.LogImpl("15046284","table Createion status: "+_res,0);
 //BA.debugLineNum = 167;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,this,(int) (2000));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 //BA.debugLineNum = 169;BA.debugLine="Dim Query As Supabase_DatabaseSelect = supa.Datab";
_query = parent._vvvvvvvvv7._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 /*elicorp.pilot.supabase_database*/ ()._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*elicorp.pilot.supabase_databaseselect*/ ();
 //BA.debugLineNum = 170;BA.debugLine="Dim ap_list As List";
_ap_list = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 171;BA.debugLine="ap_list.Initialize";
_ap_list.Initialize();
 //BA.debugLineNum = 172;BA.debugLine="Query.Columns(\"*\").From(\"Airport\")";
_query._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_databaseselect*/ ("*")._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_databaseselect*/ ("Airport");
 //BA.debugLineNum = 174;BA.debugLine="Log(\"about to sync all databases\")";
parent.__c.LogImpl("15046292","about to sync all databases",0);
 //BA.debugLineNum = 175;BA.debugLine="Wait For (Query.Execute) Complete (DatabaseResult";
parent.__c.WaitFor("complete", ba, this, _query._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 12;
return;
case 12:
//C
this.state = 1;
_databaseresult = (elicorp.pilot.supabase._supabasedatabaseresult) result[0];
;
 //BA.debugLineNum = 176;BA.debugLine="If DatabaseResult.Error.Success= True Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_databaseresult.Error /*elicorp.pilot.supabase._supabaseerror*/ .Success /*boolean*/ ==parent.__c.True) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 180;BA.debugLine="Dim resul As Boolean =DBUtils.InsertMaps(sql3,\"A";
_resul = parent._vvvvvvvvvvvv6._vvvvvv4 /*boolean*/ (ba,parent._vvvvvvvvvvvvvvvvv0,"Airport",_databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ );
 //BA.debugLineNum = 183;BA.debugLine="Log (\"table Createion status: \" & resul)";
parent.__c.LogImpl("15046301","table Createion status: "+BA.ObjectToString(_resul),0);
 //BA.debugLineNum = 184;BA.debugLine="Dim Cursor1 As ResultSet";
_cursor1 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 186;BA.debugLine="Cursor1 = sql3.ExecQuery(\"SELECT * FROM Airport\"";
_cursor1 = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent._vvvvvvvvvvvvvvvvv0.ExecQuery("SELECT * FROM Airport")));
 //BA.debugLineNum = 187;BA.debugLine="Do While Cursor1.NextRow";
if (true) break;

case 4:
//do while
this.state = 7;
while (_cursor1.NextRow()) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
 //BA.debugLineNum = 190;BA.debugLine="Log(\"************************\")";
parent.__c.LogImpl("15046308","************************",0);
 //BA.debugLineNum = 191;BA.debugLine="Log(Cursor1.GetString(\"ICAO_CODE\"))";
parent.__c.LogImpl("15046309",_cursor1.GetString("ICAO_CODE"),0);
 if (true) break;

case 7:
//C
this.state = 10;
;
 //BA.debugLineNum = 194;BA.debugLine="Cursor1.Close";
_cursor1.Close();
 //BA.debugLineNum = 195;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 197;BA.debugLine="Log(\"Error syncing airports\")";
parent.__c.LogImpl("15046315","Error syncing airports",0);
 //BA.debugLineNum = 198;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _synch_all() throws Exception{
ResumableSub_synch_all rsub = new ResumableSub_synch_all(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_synch_all extends BA.ResumableSub {
public ResumableSub_synch_all(elicorp.pilot.sharedmod parent) {
this.parent = parent;
}
elicorp.pilot.sharedmod parent;
boolean _result = false;
String _sqlname = "";
boolean _x = false;
String _maindb = "";

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
 //BA.debugLineNum = 123;BA.debugLine="wait for (B4XPages.MainPage.internet.Check(False)";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvvvv2 /*elicorp.pilot.b4xcheckinternetlm*/ ._vvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent.__c.False));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Boolean) result[0];
;
 //BA.debugLineNum = 124;BA.debugLine="If result= False Then";
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
 //BA.debugLineNum = 125;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 126;BA.debugLine="Log(\"no internet\")";
parent.__c.LogImpl("14980745","no internet",0);
 //BA.debugLineNum = 127;BA.debugLine="toast.Show(\"There is no Internet, Please connect";
parent._vvvvvvvvvvv1._show /*void*/ ("There is no Internet, Please connect and try again");
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 129;BA.debugLine="Dim sqlname As String=\"backupdb.db\"";
_sqlname = "backupdb.db";
 //BA.debugLineNum = 137;BA.debugLine="If File.Exists(File.DirInternal,sqlname) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.File.Exists(parent.__c.File.getDirInternal(),_sqlname)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 138;BA.debugLine="File.Delete(File.DirInternal,sqlname)";
parent.__c.File.Delete(parent.__c.File.getDirInternal(),_sqlname);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 140;BA.debugLine="sql3.Initialize(File.DirInternal,sqlname,True)";
parent._vvvvvvvvvvvvvvvvv0.Initialize(parent.__c.File.getDirInternal(),_sqlname,parent.__c.True);
 //BA.debugLineNum = 143;BA.debugLine="wait for (sync_fdm) complete (x As Boolean)";
parent.__c.WaitFor("complete", ba, this, parent._sync_fdm());
this.state = 10;
return;
case 10:
//C
this.state = -1;
_x = (Boolean) result[0];
;
 //BA.debugLineNum = 144;BA.debugLine="wait for (synch_airport) complete (x As Boolean)";
parent.__c.WaitFor("complete", ba, this, parent._synch_airport());
this.state = 11;
return;
case 11:
//C
this.state = -1;
_x = (Boolean) result[0];
;
 //BA.debugLineNum = 147;BA.debugLine="Log(\"synched airport, swapping dbs\")";
parent.__c.LogImpl("14980766","synched airport, swapping dbs",0);
 //BA.debugLineNum = 148;BA.debugLine="Dim maindb As String=\"datasql.db\"";
_maindb = "datasql.db";
 //BA.debugLineNum = 149;BA.debugLine="swap_dbs(maindb,sqlname)";
parent._swap_dbs(_maindb,_sqlname);
 //BA.debugLineNum = 150;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update_settings(String _link,String _filename) throws Exception{
ResumableSub_update_settings rsub = new ResumableSub_update_settings(this,_link,_filename);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_update_settings extends BA.ResumableSub {
public ResumableSub_update_settings(elicorp.pilot.sharedmod parent,String _link,String _filename) {
this.parent = parent;
this._link = _link;
this._filename = _filename;
}
elicorp.pilot.sharedmod parent;
String _link;
String _filename;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
String _setting_str = "";
anywheresoftware.b4a.objects.collections.Map _app_settings = null;
String _result = "";
Object _key = null;
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;

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
 //BA.debugLineNum = 312;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 313;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 314;BA.debugLine="Dim setting_str As String";
_setting_str = "";
 //BA.debugLineNum = 315;BA.debugLine="Dim app_settings As Map";
_app_settings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 316;BA.debugLine="app_settings.initialize";
_app_settings.Initialize();
 //BA.debugLineNum = 317;BA.debugLine="m.initialize";
_m.Initialize();
 //BA.debugLineNum = 318;BA.debugLine="wait for (DownloadAndSaveFile(link,filename)) com";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvv7(_link,_filename));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_result = (String) result[0];
;
 //BA.debugLineNum = 319;BA.debugLine="If result=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 320;BA.debugLine="Log(\"Settings update failed\")";
parent.__c.LogImpl("15373961","Settings update failed",0);
 //BA.debugLineNum = 321;BA.debugLine="Return \"\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(""));return;};
 if (true) break;
;
 //BA.debugLineNum = 325;BA.debugLine="Try:";

case 4:
//try
this.state = 13;
this.catchState = 12;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 12;
 //BA.debugLineNum = 326;BA.debugLine="setting_str=result";
_setting_str = _result;
 //BA.debugLineNum = 327;BA.debugLine="Log(\"setting_string\" & setting_str)";
parent.__c.LogImpl("15373968","setting_string"+_setting_str,0);
 //BA.debugLineNum = 328;BA.debugLine="JSON.Initialize(setting_str)";
_json.Initialize(_setting_str);
 //BA.debugLineNum = 329;BA.debugLine="Log(\"json_settings\" & m)";
parent.__c.LogImpl("15373970","json_settings"+BA.ObjectToString(_m),0);
 //BA.debugLineNum = 330;BA.debugLine="m = JSON.NextObject";
_m = _json.NextObject();
 //BA.debugLineNum = 332;BA.debugLine="For Each key As Object In m.keys";
if (true) break;

case 7:
//for
this.state = 10;
group18 = _m.Keys();
index18 = 0;
groupLen18 = group18.getSize();
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if (index18 < groupLen18) {
this.state = 9;
_key = group18.Get(index18);}
if (true) break;

case 16:
//C
this.state = 15;
index18++;
if (true) break;

case 9:
//C
this.state = 16;
 //BA.debugLineNum = 333;BA.debugLine="app_settings.put(key, m.get(key))";
_app_settings.Put(_key,_m.Get(_key));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
 //BA.debugLineNum = 337;BA.debugLine="B4XPages.MainPage.kvs.PutMapAsync(app_settings)";
parent._vvvvvvvvvvvv4._vvv2 /*elicorp.pilot.b4xmainpage*/ (ba)._vvvvvvvvv0 /*elicorp.pilot.keyvaluestore*/ ._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_app_settings);
 //BA.debugLineNum = 339;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
 //BA.debugLineNum = 342;BA.debugLine="Log(\"Failed to read settings\")";
parent.__c.LogImpl("15373983","Failed to read settings",0);
 //BA.debugLineNum = 343;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
if (true) break;

case 13:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
