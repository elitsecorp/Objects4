package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_functions {
private static supabase_functions mostCurrent = new supabase_functions();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public static elicorp.pilot.supabase._supabasedatabaseresult  _vvvvvvv0(anywheresoftware.b4a.BA _ba,String _jsonstring) throws Exception{
elicorp.pilot.supabase._supabasedatabaseresult _databaseresult = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _jroot = null;
boolean _firsttime = false;
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
anywheresoftware.b4a.objects.collections.Map _newrow = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _joinmap = null;
String _join = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _gen = null;
 //BA.debugLineNum = 78;BA.debugLine="Public Sub CreateDatabaseResult(JsonString As Stri";
 //BA.debugLineNum = 80;BA.debugLine="Dim DatabaseResult As SupabaseDatabaseResult";
_databaseresult = new elicorp.pilot.supabase._supabasedatabaseresult();
 //BA.debugLineNum = 81;BA.debugLine="DatabaseResult.Initialize";
_databaseresult.Initialize();
 //BA.debugLineNum = 82;BA.debugLine="DatabaseResult.Columns.Initialize";
_databaseresult.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 83;BA.debugLine="DatabaseResult.Rows.Initialize";
_databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 85;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 86;BA.debugLine="parser.Initialize(JsonString)";
_parser.Initialize(_jsonstring);
 //BA.debugLineNum = 87;BA.debugLine="Dim jRoot As List = parser.NextArray";
_jroot = new anywheresoftware.b4a.objects.collections.List();
_jroot = _parser.NextArray();
 //BA.debugLineNum = 89;BA.debugLine="Dim FirstTime As Boolean = True";
_firsttime = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 91;BA.debugLine="For Each coljRoot As Map In jRoot";
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group9 = _jroot;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));
 //BA.debugLineNum = 93;BA.debugLine="Dim NewRow As Map";
_newrow = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 94;BA.debugLine="NewRow.Initialize";
_newrow.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="For Each k As String In coljRoot.Keys";
{
final anywheresoftware.b4a.BA.IterableList group12 = _coljroot.Keys();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_k = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 96;BA.debugLine="If coljRoot.Get(k) Is Map Then";
if (_coljroot.Get((Object)(_k)) instanceof java.util.Map) { 
 //BA.debugLineNum = 97;BA.debugLine="Dim JoinMap As Map = coljRoot.Get(k)";
_joinmap = new anywheresoftware.b4a.objects.collections.Map();
_joinmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_coljroot.Get((Object)(_k))));
 //BA.debugLineNum = 98;BA.debugLine="For Each join As String In JoinMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group15 = _joinmap.Keys();
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_join = BA.ObjectToString(group15.Get(index15));
 //BA.debugLineNum = 99;BA.debugLine="If FirstTime = True Then DatabaseResult.Colum";
if (_firsttime==anywheresoftware.b4a.keywords.Common.True) { 
_databaseresult.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k+"."+_join),(Object)(""));};
 //BA.debugLineNum = 100;BA.debugLine="NewRow.Put(k & \".\" & join,JoinMap.Get(join))";
_newrow.Put((Object)(_k+"."+_join),_joinmap.Get((Object)(_join)));
 }
};
 }else if(_coljroot.Get((Object)(_k)) instanceof java.util.List) { 
 //BA.debugLineNum = 103;BA.debugLine="If FirstTime = True Then DatabaseResult.Column";
if (_firsttime==anywheresoftware.b4a.keywords.Common.True) { 
_databaseresult.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),(Object)(""));};
 //BA.debugLineNum = 104;BA.debugLine="Dim gen As JSONGenerator";
_gen = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 105;BA.debugLine="gen.Initialize2(coljRoot.Get(k))";
_gen.Initialize2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_coljroot.Get((Object)(_k)))));
 //BA.debugLineNum = 106;BA.debugLine="NewRow.Put(k,gen.ToString)";
_newrow.Put((Object)(_k),(Object)(_gen.ToString()));
 }else {
 //BA.debugLineNum = 108;BA.debugLine="If FirstTime = True Then DatabaseResult.Column";
if (_firsttime==anywheresoftware.b4a.keywords.Common.True) { 
_databaseresult.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),(Object)(""));};
 //BA.debugLineNum = 109;BA.debugLine="NewRow.Put(k,coljRoot.Get(k))";
_newrow.Put((Object)(_k),_coljroot.Get((Object)(_k)));
 };
 }
};
 //BA.debugLineNum = 114;BA.debugLine="DatabaseResult.Rows.Add(NewRow)";
_databaseresult.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newrow.getObject()));
 //BA.debugLineNum = 116;BA.debugLine="FirstTime = False";
_firsttime = anywheresoftware.b4a.keywords.Common.False;
 }
};
 //BA.debugLineNum = 119;BA.debugLine="Return DatabaseResult";
if (true) return _databaseresult;
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _vvvvvvvv1(anywheresoftware.b4a.BA _ba,elicorp.pilot.httpjob _j) throws Exception{
String _response = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _tmp_result = null;
 //BA.debugLineNum = 58;BA.debugLine="Public Sub GenerateResult(j As HttpJob) As Map";
 //BA.debugLineNum = 59;BA.debugLine="Dim response As String = \"\"";
_response = "";
 //BA.debugLineNum = 60;BA.debugLine="If j.Success Then";
if (_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ) { 
 //BA.debugLineNum = 61;BA.debugLine="response = j.GetString";
_response = _j._vvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ();
 }else {
 //BA.debugLineNum = 66;BA.debugLine="response = j.ErrorMessage";
_response = _j._vvvvvvvvvvvvvvvvvvvvvvvv2 /*String*/ ;
 };
 //BA.debugLineNum = 69;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 70;BA.debugLine="parser.Initialize(response)";
_parser.Initialize(_response);
 //BA.debugLineNum = 71;BA.debugLine="Dim tmp_result As Map = UnReadOnlyMap(parser.Next";
_tmp_result = new anywheresoftware.b4a.objects.collections.Map();
_tmp_result = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_ba,_parser.NextObject());
 //BA.debugLineNum = 72;BA.debugLine="tmp_result.Put(\"success\",j.Success)";
_tmp_result.Put((Object)("success"),(Object)(_j._vvvvvvvvvvvvvvvvvvvvvvv0 /*boolean*/ ));
 //BA.debugLineNum = 74;BA.debugLine="j.Release";
_j._vvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 75;BA.debugLine="Return tmp_result";
if (true) return _tmp_result;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public static int  _vvvvvvvv2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _root) throws Exception{
anywheresoftware.b4a.objects.collections.Map _error = null;
 //BA.debugLineNum = 143;BA.debugLine="Public Sub getErrorCode(root As Map) As Int";
 //BA.debugLineNum = 144;BA.debugLine="If root.ContainsKey(\"error\") Then";
if (_root.ContainsKey((Object)("error"))) { 
 //BA.debugLineNum = 145;BA.debugLine="Dim error As Map = root.Get(\"error\")";
_error = new anywheresoftware.b4a.objects.collections.Map();
_error = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("error"))));
 //BA.debugLineNum = 146;BA.debugLine="Return error.Get(\"code\")";
if (true) return (int)(BA.ObjectToNumber(_error.Get((Object)("code"))));
 };
 //BA.debugLineNum = 148;BA.debugLine="Return \"\"";
if (true) return (int)(Double.parseDouble(""));
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.collections.Map  _vvvvvvvv3(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _root) throws Exception{
anywheresoftware.b4a.objects.collections.Map _error = null;
anywheresoftware.b4a.objects.collections.List _errors = null;
anywheresoftware.b4a.objects.collections.Map _tmp_result = null;
anywheresoftware.b4a.objects.collections.Map _colerrors = null;
 //BA.debugLineNum = 163;BA.debugLine="Public Sub getErrorMap(root As Map) As Map";
 //BA.debugLineNum = 164;BA.debugLine="Dim error As Map = root.Get(\"error\")";
_error = new anywheresoftware.b4a.objects.collections.Map();
_error = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("error"))));
 //BA.debugLineNum = 165;BA.debugLine="Dim errors As List = error.Get(\"errors\")";
_errors = new anywheresoftware.b4a.objects.collections.List();
_errors = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_error.Get((Object)("errors"))));
 //BA.debugLineNum = 166;BA.debugLine="Dim tmp_result As Map : tmp_result.Initialize";
_tmp_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 166;BA.debugLine="Dim tmp_result As Map : tmp_result.Initialize";
_tmp_result.Initialize();
 //BA.debugLineNum = 168;BA.debugLine="For Each colerrors As Map In errors";
_colerrors = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _errors;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_colerrors = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group5.Get(index5)));
 //BA.debugLineNum = 169;BA.debugLine="tmp_result = CreateMap(\"reason\":colerrors.Get(\"r";
_tmp_result = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("reason"),_colerrors.Get((Object)("reason")),(Object)("domain"),_colerrors.Get((Object)("domain")),(Object)("message"),_colerrors.Get((Object)("message"))});
 }
};
 //BA.debugLineNum = 171;BA.debugLine="Return tmp_result";
if (true) return _tmp_result;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public static String  _vvvvvvvv4(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _root) throws Exception{
anywheresoftware.b4a.objects.collections.Map _error = null;
 //BA.debugLineNum = 152;BA.debugLine="Public Sub getErrorMessage(root As Map) As String";
 //BA.debugLineNum = 153;BA.debugLine="If root.ContainsKey(\"error\") Then";
if (_root.ContainsKey((Object)("error"))) { 
 //BA.debugLineNum = 154;BA.debugLine="Dim error As Map = root.Get(\"error\")";
_error = new anywheresoftware.b4a.objects.collections.Map();
_error = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("error"))));
 //BA.debugLineNum = 155;BA.debugLine="Return error.Get(\"message\")";
if (true) return BA.ObjectToString(_error.Get((Object)("message")));
 };
 //BA.debugLineNum = 157;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv5(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub GetFileExt(FileName As String) As Strin";
 //BA.debugLineNum = 55;BA.debugLine="Return FileName.SubString2(FileName.LastIndexof(\"";
if (true) return _filename.substring(_filename.lastIndexOf("."),_filename.length());
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv6(anywheresoftware.b4a.BA _ba,String _fullpath) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub GetFilename(fullpath As String) As Stri";
 //BA.debugLineNum = 31;BA.debugLine="Return fullpath.SubString(fullpath.LastIndexOf(\"/";
if (true) return _fullpath.substring((int) (_fullpath.lastIndexOf("/")+1));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv7(anywheresoftware.b4a.BA _ba,String _extension) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Public Sub GetMimeTypeByExtension(Extension As Str";
 //BA.debugLineNum = 16;BA.debugLine="Extension = Extension.Replace(\".\",\"\").ToLowerCase";
_extension = _extension.replace(".","").toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="Select Extension";
switch (BA.switchObjectToInt(_extension,"jpg","png","gif","bmp","ico","svg","webp","mp4","avi","mpeg","wmv","mov","flv","webm","mkv","mp3","wav","ogg","m4a","aac","flac","wma","aiff")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: {
 //BA.debugLineNum = 19;BA.debugLine="Return \"image/\" & Extension";
if (true) return "image/"+_extension;
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: 
case 13: 
case 14: {
 //BA.debugLineNum = 21;BA.debugLine="Return \"video/\" & Extension";
if (true) return "video/"+_extension;
 break; }
case 15: 
case 16: 
case 17: 
case 18: 
case 19: 
case 20: 
case 21: 
case 22: {
 //BA.debugLineNum = 23;BA.debugLine="Return \"audio/\" & Extension";
if (true) return "audio/"+_extension;
 break; }
default: {
 //BA.debugLineNum = 25;BA.debugLine="Log(\"SupabaseFunctions: unknown mime type\")";
anywheresoftware.b4a.keywords.Common.LogImpl("963242250","SupabaseFunctions: unknown mime type",0);
 //BA.debugLineNum = 26;BA.debugLine="Return \"\"";
if (true) return "";
 break; }
}
;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public static long  _vvvvvvvv0(anywheresoftware.b4a.BA _ba,String _datestring) throws Exception{
String _olddateformat = "";
long _result = 0L;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub ParseDateTime(DateString As String) As";
 //BA.debugLineNum = 35;BA.debugLine="If DateString = \"\" Or DateString = \"null\" Or Date";
if ((_datestring).equals("") || (_datestring).equals("null") || _datestring== null) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 36;BA.debugLine="DateString=DateString.Replace(\"T\",\" \")";
_datestring = _datestring.replace("T"," ");
 //BA.debugLineNum = 41;BA.debugLine="Dim OldDateFormat As String = DateTime.DateFormat";
_olddateformat = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 42;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 43;BA.debugLine="DateString = Regex.Split(\"\\.\",DateString)(0)";
_datestring = anywheresoftware.b4a.keywords.Common.Regex.Split("\\.",_datestring)[(int) (0)];
 //BA.debugLineNum = 44;BA.debugLine="Dim Result As Long = DateTime.DateParse(DateStrin";
_result = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_datestring);
 //BA.debugLineNum = 46;BA.debugLine="DateTime.DateFormat = OldDateFormat";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_olddateformat);
 //BA.debugLineNum = 51;BA.debugLine="Return Result";
if (true) return _result;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return 0L;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public static boolean  _vvvvvvvvv1(anywheresoftware.b4a.BA _ba,Object _target,String _targetsub,int _numbersofparameters) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Public Sub SubExists2(Target As Object,TargetSub A";
 //BA.debugLineNum = 10;BA.debugLine="Return SubExists(Target,TargetSub)";
if (true) return anywheresoftware.b4a.keywords.Common.SubExists((_ba.processBA == null ? _ba : _ba.processBA),_target,_targetsub);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="PRivate Sub UnReadOnlyMap(sourceMap As Map) As Map";
 //BA.debugLineNum = 137;BA.debugLine="Return sourceMap";
if (true) return _sourcemap;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
}
