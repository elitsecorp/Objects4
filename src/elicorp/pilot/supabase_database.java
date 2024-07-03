package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_database extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase_database");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase_database.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public elicorp.pilot.supabase _m_supabase = null;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private m_Supabase As Supabase";
_m_supabase = new elicorp.pilot.supabase();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_databasedelete  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
elicorp.pilot.supabase_databasedelete _databasedelete = null;
 //BA.debugLineNum = 71;BA.debugLine="Public Sub DeleteData As Supabase_DatabaseDelete";
 //BA.debugLineNum = 73;BA.debugLine="Dim DatabaseDelete As Supabase_DatabaseDelete";
_databasedelete = new elicorp.pilot.supabase_databasedelete();
 //BA.debugLineNum = 74;BA.debugLine="DatabaseDelete.Initialize(m_Supabase)";
_databasedelete._initialize /*String*/ (ba,_m_supabase);
 //BA.debugLineNum = 75;BA.debugLine="Return DatabaseDelete";
if (true) return _databasedelete;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabase _thissupabase) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(ThisSupabase As Supabase)";
 //BA.debugLineNum = 8;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_databaseinsert  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
elicorp.pilot.supabase_databaseinsert _databaseinsert = null;
 //BA.debugLineNum = 42;BA.debugLine="Public Sub InsertData As Supabase_DatabaseInsert";
 //BA.debugLineNum = 44;BA.debugLine="Dim DatabaseInsert As Supabase_DatabaseInsert";
_databaseinsert = new elicorp.pilot.supabase_databaseinsert();
 //BA.debugLineNum = 45;BA.debugLine="DatabaseInsert.Initialize(m_Supabase)";
_databaseinsert._initialize /*String*/ (ba,_m_supabase);
 //BA.debugLineNum = 46;BA.debugLine="Return DatabaseInsert";
if (true) return _databaseinsert;
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(elicorp.pilot.supabase._supabasedatabaseresult _table) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _key = "";
anywheresoftware.b4a.objects.collections.Map _row = null;
 //BA.debugLineNum = 79;BA.debugLine="Public Sub PrintTable(Table As SupabaseDatabaseRes";
 //BA.debugLineNum = 80;BA.debugLine="Log(\"Tag: \" & Table.Tag & \", Columns: \" & Table.C";
__c.LogImpl("960358657","Tag: "+BA.ObjectToString(_table.Tag /*Object*/ )+", Columns: "+BA.NumberToString(_table.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize())+", Rows: "+BA.NumberToString(_table.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
 //BA.debugLineNum = 81;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 82;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="For Each key As String In Table.Columns.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 85;BA.debugLine="sb.Append(key).Append(TAB)";
_sb.Append(_key).Append(__c.TAB);
 }
};
 //BA.debugLineNum = 88;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("960358665",_sb.ToString(),0);
 //BA.debugLineNum = 89;BA.debugLine="For Each row As Map In Table.Rows";
_row = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group8 = _table.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group8.Get(index8)));
 //BA.debugLineNum = 90;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 91;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="For Each key As String In row.Keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _row.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_key = BA.ObjectToString(group11.Get(index11));
 //BA.debugLineNum = 94;BA.debugLine="sb.Append(row.Get(key)).Append(TAB)";
_sb.Append(BA.ObjectToString(_row.Get((Object)(_key)))).Append(__c.TAB);
 }
};
 //BA.debugLineNum = 97;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("960358674",_sb.ToString(),0);
 }
};
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_databaseselect  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
elicorp.pilot.supabase_databaseselect _databaseselect = null;
 //BA.debugLineNum = 17;BA.debugLine="Public Sub SelectData As Supabase_DatabaseSelect";
 //BA.debugLineNum = 19;BA.debugLine="Dim DatabaseSelect As Supabase_DatabaseSelect";
_databaseselect = new elicorp.pilot.supabase_databaseselect();
 //BA.debugLineNum = 20;BA.debugLine="DatabaseSelect.Initialize(m_Supabase)";
_databaseselect._initialize /*String*/ (ba,_m_supabase);
 //BA.debugLineNum = 21;BA.debugLine="Return DatabaseSelect";
if (true) return _databaseselect;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_databaseupdate  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
elicorp.pilot.supabase_databaseupdate _databaseupdate = null;
 //BA.debugLineNum = 57;BA.debugLine="Public Sub UpdateData As Supabase_DatabaseUpdate";
 //BA.debugLineNum = 59;BA.debugLine="Dim DatabaseUpdate As Supabase_DatabaseUpdate";
_databaseupdate = new elicorp.pilot.supabase_databaseupdate();
 //BA.debugLineNum = 60;BA.debugLine="DatabaseUpdate.Initialize(m_Supabase)";
_databaseupdate._initialize /*String*/ (ba,_m_supabase);
 //BA.debugLineNum = 61;BA.debugLine="Return DatabaseUpdate";
if (true) return _databaseupdate;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
