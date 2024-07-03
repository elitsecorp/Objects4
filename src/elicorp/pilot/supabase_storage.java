package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class supabase_storage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.supabase_storage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.supabase_storage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(byte[] _bytes) throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
 //BA.debugLineNum = 296;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As B4XBit";
 //BA.debugLineNum = 297;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 298;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
 //BA.debugLineNum = 300;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 301;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
 //BA.debugLineNum = 302;BA.debugLine="Return bmp";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private m_Supabase As Supabase";
_m_supabase = new elicorp.pilot.supabase();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public byte[]  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Public Sub ConvertFile2Binary(Dir As String, FileN";
 //BA.debugLineNum = 292;BA.debugLine="Return Bit.InputStreamToBytes(File.OpenInput(Dir,";
if (true) return __c.Bit.InputStreamToBytes((java.io.InputStream)(__c.File.OpenInput(_dir,_filename).getObject()));
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(String _bucketname,String _frompath,String _topath) throws Exception{
elicorp.pilot.supabase_storagefile _storagefile = null;
 //BA.debugLineNum = 239;BA.debugLine="Public Sub CopyFile(BucketName As String,FromPath";
 //BA.debugLineNum = 241;BA.debugLine="Dim StorageFile As Supabase_StorageFile";
_storagefile = new elicorp.pilot.supabase_storagefile();
 //BA.debugLineNum = 242;BA.debugLine="StorageFile.Initialize(m_Supabase,BucketName,\"Cop";
_storagefile._initialize /*String*/ (ba,_m_supabase,_bucketname,"CopyFile");
 //BA.debugLineNum = 243;BA.debugLine="StorageFile.CopyFile(FromPath,ToPath)";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*elicorp.pilot.supabase_storagefile*/ (_frompath,_topath);
 //BA.debugLineNum = 244;BA.debugLine="Return StorageFile";
if (true) return _storagefile;
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagebucket  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(String _name) throws Exception{
elicorp.pilot.supabase_storagebucket _storagebucket = null;
 //BA.debugLineNum = 27;BA.debugLine="Public Sub CreateBucket(Name As String) As Supabas";
 //BA.debugLineNum = 29;BA.debugLine="Dim StorageBucket As Supabase_StorageBucket";
_storagebucket = new elicorp.pilot.supabase_storagebucket();
 //BA.debugLineNum = 30;BA.debugLine="StorageBucket.Initialize(m_Supabase,Name,\"Create\"";
_storagebucket._initialize /*String*/ (ba,_m_supabase,_name,"Create");
 //BA.debugLineNum = 31;BA.debugLine="Return StorageBucket";
if (true) return _storagebucket;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _bucketname,String _path,int _expiresinseconds) throws Exception{
elicorp.pilot.supabase_storagefile _storagefile = null;
 //BA.debugLineNum = 279;BA.debugLine="Public Sub CreateSignedUrl(BucketName As String,Pa";
 //BA.debugLineNum = 281;BA.debugLine="Dim StorageFile As Supabase_StorageFile";
_storagefile = new elicorp.pilot.supabase_storagefile();
 //BA.debugLineNum = 282;BA.debugLine="StorageFile.Initialize(m_Supabase,BucketName,\"Cre";
_storagefile._initialize /*String*/ (ba,_m_supabase,_bucketname,"CreateSignedUrl");
 //BA.debugLineNum = 283;BA.debugLine="StorageFile.Path(Path)";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_storagefile*/ (_path);
 //BA.debugLineNum = 284;BA.debugLine="StorageFile.ExpiresInSeconds(ExpiresInSeconds)";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*elicorp.pilot.supabase_storagefile*/ (_expiresinseconds);
 //BA.debugLineNum = 285;BA.debugLine="Return StorageFile";
if (true) return _storagefile;
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagebucket  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _name) throws Exception{
elicorp.pilot.supabase_storagebucket _storagebucket = null;
 //BA.debugLineNum = 84;BA.debugLine="Public Sub DeleteBucket(Name As String) As Supabas";
 //BA.debugLineNum = 86;BA.debugLine="Dim StorageBucket As Supabase_StorageBucket";
_storagebucket = new elicorp.pilot.supabase_storagebucket();
 //BA.debugLineNum = 87;BA.debugLine="StorageBucket.Initialize(m_Supabase,Name,\"Delete\"";
_storagebucket._initialize /*String*/ (ba,_m_supabase,_name,"Delete");
 //BA.debugLineNum = 88;BA.debugLine="Return StorageBucket";
if (true) return _storagebucket;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(String _bucketname,String _path) throws Exception{
elicorp.pilot.supabase_storagefile _storagefile = null;
 //BA.debugLineNum = 142;BA.debugLine="Public Sub DownloadFile(BucketName As String,Path";
 //BA.debugLineNum = 144;BA.debugLine="Dim StorageFile As Supabase_StorageFile";
_storagefile = new elicorp.pilot.supabase_storagefile();
 //BA.debugLineNum = 145;BA.debugLine="StorageFile.Initialize(m_Supabase,BucketName,\"Dow";
_storagefile._initialize /*String*/ (ba,_m_supabase,_bucketname,"Download");
 //BA.debugLineNum = 146;BA.debugLine="StorageFile.Path(Path)";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_storagefile*/ (_path);
 //BA.debugLineNum = 147;BA.debugLine="Return StorageFile";
if (true) return _storagefile;
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(String _bucketname,String _path,Object _eventcallback,String _eventname,String _downloadpath) throws Exception{
elicorp.pilot.supabase_storagefile _storagefile = null;
 //BA.debugLineNum = 168;BA.debugLine="Public Sub DownloadFileProgress(BucketName As Stri";
 //BA.debugLineNum = 170;BA.debugLine="Dim StorageFile As Supabase_StorageFile";
_storagefile = new elicorp.pilot.supabase_storagefile();
 //BA.debugLineNum = 171;BA.debugLine="StorageFile.Initialize(m_Supabase,BucketName,\"Dow";
_storagefile._initialize /*String*/ (ba,_m_supabase,_bucketname,"DownloadProgress");
 //BA.debugLineNum = 172;BA.debugLine="StorageFile.Path(Path)";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_storagefile*/ (_path);
 //BA.debugLineNum = 173;BA.debugLine="StorageFile.Tag = CreateMap(\"EventCallback\":Event";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvv7 /*Object*/  = (Object)(__c.createMap(new Object[] {(Object)("EventCallback"),_eventcallback,(Object)("EventName"),(Object)(_eventname),(Object)("DownloadPath"),(Object)(_downloadpath)}).getObject());
 //BA.debugLineNum = 174;BA.debugLine="Return StorageFile";
if (true) return _storagefile;
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagebucket  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _name) throws Exception{
elicorp.pilot.supabase_storagebucket _storagebucket = null;
 //BA.debugLineNum = 101;BA.debugLine="Public Sub EmptyBucket(Name As String) As Supabase";
 //BA.debugLineNum = 103;BA.debugLine="Dim StorageBucket As Supabase_StorageBucket";
_storagebucket = new elicorp.pilot.supabase_storagebucket();
 //BA.debugLineNum = 104;BA.debugLine="StorageBucket.Initialize(m_Supabase,Name,\"Empty\")";
_storagebucket._initialize /*String*/ (ba,_m_supabase,_name,"Empty");
 //BA.debugLineNum = 105;BA.debugLine="Return StorageBucket";
if (true) return _storagebucket;
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagebucket  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(String _name) throws Exception{
elicorp.pilot.supabase_storagebucket _storagebucket = null;
 //BA.debugLineNum = 45;BA.debugLine="Public Sub GetBucket(Name As String) As Supabase_S";
 //BA.debugLineNum = 47;BA.debugLine="Dim StorageBucket As Supabase_StorageBucket";
_storagebucket = new elicorp.pilot.supabase_storagebucket();
 //BA.debugLineNum = 48;BA.debugLine="StorageBucket.Initialize(m_Supabase,Name,\"Select\"";
_storagebucket._initialize /*String*/ (ba,_m_supabase,_name,"Select");
 //BA.debugLineNum = 49;BA.debugLine="Return StorageBucket";
if (true) return _storagebucket;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(String _bucketname,String _path) throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Public Sub GetPublicUrl(BucketName As String,Path";
 //BA.debugLineNum = 254;BA.debugLine="Return $\"${m_Supabase.URL}/storage/v1/object/publ";
if (true) return (""+__c.SmartStringFormatter("",(Object)(_m_supabase._getvvvvvvvvvvvvvvvvvvvv6 /*String*/ ()))+"/storage/v1/object/public/"+__c.SmartStringFormatter("",(Object)(_bucketname))+"/"+__c.SmartStringFormatter("",(Object)(_path))+"");
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,elicorp.pilot.supabase _thissupabase) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(ThisSupabase As Supabase)";
 //BA.debugLineNum = 8;BA.debugLine="m_Supabase = ThisSupabase";
_m_supabase = _thissupabase;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(String _bucketname,String _frompath,String _topath) throws Exception{
elicorp.pilot.supabase_storagefile _storagefile = null;
 //BA.debugLineNum = 219;BA.debugLine="Public Sub MoveFile(BucketName As String,FromPath";
 //BA.debugLineNum = 221;BA.debugLine="Dim StorageFile As Supabase_StorageFile";
_storagefile = new elicorp.pilot.supabase_storagefile();
 //BA.debugLineNum = 222;BA.debugLine="StorageFile.Initialize(m_Supabase,BucketName,\"Mov";
_storagefile._initialize /*String*/ (ba,_m_supabase,_bucketname,"MoveFile");
 //BA.debugLineNum = 223;BA.debugLine="StorageFile.MoveFile(FromPath,ToPath)";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_storagefile*/ (_frompath,_topath);
 //BA.debugLineNum = 224;BA.debugLine="Return StorageFile";
if (true) return _storagefile;
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagebucket  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _name) throws Exception{
elicorp.pilot.supabase_storagebucket _storagebucket = null;
 //BA.debugLineNum = 66;BA.debugLine="Public Sub UpdateBucket(Name As String) As Supabas";
 //BA.debugLineNum = 68;BA.debugLine="Dim StorageBucket As Supabase_StorageBucket";
_storagebucket = new elicorp.pilot.supabase_storagebucket();
 //BA.debugLineNum = 69;BA.debugLine="StorageBucket.Initialize(m_Supabase,Name,\"Update\"";
_storagebucket._initialize /*String*/ (ba,_m_supabase,_name,"Update");
 //BA.debugLineNum = 70;BA.debugLine="Return StorageBucket";
if (true) return _storagebucket;
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _bucketname,String _path) throws Exception{
elicorp.pilot.supabase_storagefile _storagefile = null;
 //BA.debugLineNum = 189;BA.debugLine="Public Sub UpdateFile(BucketName As String,Path As";
 //BA.debugLineNum = 191;BA.debugLine="Dim StorageFile As Supabase_StorageFile";
_storagefile = new elicorp.pilot.supabase_storagefile();
 //BA.debugLineNum = 192;BA.debugLine="StorageFile.Initialize(m_Supabase,BucketName,\"Upd";
_storagefile._initialize /*String*/ (ba,_m_supabase,_bucketname,"Update");
 //BA.debugLineNum = 193;BA.debugLine="StorageFile.Path(Path)";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_storagefile*/ (_path);
 //BA.debugLineNum = 194;BA.debugLine="Return StorageFile";
if (true) return _storagefile;
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public elicorp.pilot.supabase_storagefile  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(String _bucketname,String _path) throws Exception{
elicorp.pilot.supabase_storagefile _storagefile = null;
 //BA.debugLineNum = 122;BA.debugLine="Public Sub UploadFile(BucketName As String,Path As";
 //BA.debugLineNum = 124;BA.debugLine="Dim StorageFile As Supabase_StorageFile";
_storagefile = new elicorp.pilot.supabase_storagefile();
 //BA.debugLineNum = 125;BA.debugLine="StorageFile.Initialize(m_Supabase,BucketName,\"Upl";
_storagefile._initialize /*String*/ (ba,_m_supabase,_bucketname,"Upload");
 //BA.debugLineNum = 126;BA.debugLine="StorageFile.Path(Path)";
_storagefile._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*elicorp.pilot.supabase_storagefile*/ (_path);
 //BA.debugLineNum = 127;BA.debugLine="Return StorageFile";
if (true) return _storagefile;
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
