package elicorp.pilot;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class minisearchview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "elicorp.pilot.minisearchview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", elicorp.pilot.minisearchview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvv6 = null;
public b4a.example3.customlistview _clv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _textfield = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvv3 = null;
public int _min_limit = 0;
public int _max_limit = 0;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvv3 = 0;
public int _state_empty = 0;
public int _state_need_to_clear = 0;
public int _state_good = 0;
public int _vvvvvvvvvvvvvvvvv4 = 0;
public float _vvvvvvvvvvvvvvvvv5 = 0f;
public b4a.example.dateutils _vvvvvvvvvvv0 = null;
public elicorp.pilot.main _vvvvvvvvvvvv1 = null;
public elicorp.pilot.starter _vvvvvvvvvvvv2 = null;
public elicorp.pilot.httputils2service _vvvvvvvvvvvv3 = null;
public elicorp.pilot.b4xpages _vvvvvvvvvvvv4 = null;
public elicorp.pilot.b4xcollections _vvvvvvvvvvvv5 = null;
public elicorp.pilot.dbutils _vvvvvvvvvvvv6 = null;
public elicorp.pilot.xuiviewsutils _vvvvvvvvvvvv7 = null;
public elicorp.pilot.supabase_functions _supabase_functions = null;
public static class _msvitemdata{
public boolean IsInitialized;
public int State;
public anywheresoftware.b4a.objects.B4XCanvas cvs;
public String Item;
public void Initialize() {
IsInitialized = true;
State = 0;
cvs = new anywheresoftware.b4a.objects.B4XCanvas();
Item = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _vvvvvvvvvvvvvvv2(anywheresoftware.b4a.objects.collections.List _li,String _full) throws Exception{
int _i = 0;
String _item = "";
int _x = 0;
int _textwidth = 0;
int _width = 0;
elicorp.pilot.minisearchview._msvitemdata _m = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 118;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
 //BA.debugLineNum = 119;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 120;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 121;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
 //BA.debugLineNum = 122;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
 //BA.debugLineNum = 123;BA.debugLine="If x = -1 Then Continue";
if (_x==-1) { 
if (true) continue;};
 //BA.debugLineNum = 124;BA.debugLine="ListCounter = ListCounter + 1";
_vvvvvvvvvvvvvvvvv4 = (int) (_vvvvvvvvvvvvvvvvv4+1);
 //BA.debugLineNum = 126;BA.debugLine="Dim TextWidth As Int = MeasurementCanvas.Measure";
_textwidth = (int) (_vvvvvvvvvvvvvvvv4.MeasureText(_item,_vvvvvvvvvvvvvvvv5).getWidth());
 //BA.debugLineNum = 127;BA.debugLine="Dim Width As Int = TextWidth + Gap * 2";
_width = (int) (_textwidth+_vvvvvvvvvvvvvvvvv3*2);
 //BA.debugLineNum = 128;BA.debugLine="If CLV.Size > ListCounter Then";
if (_clv._getsize()>_vvvvvvvvvvvvvvvvv4) { 
 //BA.debugLineNum = 130;BA.debugLine="Dim m As MSVItemData = CLV.GetValue(ListCounter";
_m = (elicorp.pilot.minisearchview._msvitemdata)(_clv._getvalue(_vvvvvvvvvvvvvvvvv4));
 //BA.debugLineNum = 131;BA.debugLine="If m.State = STATE_GOOD Or m.State = STATE_NEED";
if (_m.State /*int*/ ==_state_good || _m.State /*int*/ ==_state_need_to_clear) { 
_m.State /*int*/  = _state_need_to_clear;};
 //BA.debugLineNum = 132;BA.debugLine="m.Item = item";
_m.Item /*String*/  = _item;
 //BA.debugLineNum = 133;BA.debugLine="If Width <> CLV.GetPanel(ListCounter).Width The";
if (_width!=_clv._getpanel(_vvvvvvvvvvvvvvvvv4).getWidth()) { 
 //BA.debugLineNum = 134;BA.debugLine="CLV.ResizeItem(ListCounter, Width)";
_clv._resizeitem(_vvvvvvvvvvvvvvvvv4,_width);
 };
 //BA.debugLineNum = 136;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 138;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 139;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width , CLV.sv.Heig";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_clv._sv.getHeight());
 //BA.debugLineNum = 140;BA.debugLine="CLV.Add(p, CreateMSVItem(item))";
_clv._add(_p,(Object)(_vvvvvvvvvvvvvvv3(_item)));
 }
};
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
String _s = "";
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _scrollbarsize = 0;
 //BA.debugLineNum = 63;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 65;BA.debugLine="If CLV.IsInitialized = False Then Return";
if (_clv.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 66;BA.debugLine="SpaceWidth = MeasurementCanvas.MeasureText(\"X X\",";
_vvvvvvvvvvvvvvvvv5 = (float) (_vvvvvvvvvvvvvvvv4.MeasureText("X X",_vvvvvvvvvvvvvvvv5).getWidth()-2*_vvvvvvvvvvvvvvvv4.MeasureText("X",_vvvvvvvvvvvvvvvv5).getWidth());
 //BA.debugLineNum = 67;BA.debugLine="Dim s As String = \"abcDEFGM\"";
_s = "abcDEFGM";
 //BA.debugLineNum = 68;BA.debugLine="Dim r As B4XRect = MeasurementCanvas.MeasureText(";
_r = _vvvvvvvvvvvvvvvv4.MeasureText(_s,_vvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 69;BA.debugLine="ItemsHeight = r.Height + 20dip";
_vvvvvvvvvvvvvvvv6 = (int) (_r.getHeight()+__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 70;BA.debugLine="BaseLine = ItemsHeight / 2 - r.Height / 2 - r.Top";
_vvvvvvvvvvvvvvvv7 = (int) (_vvvvvvvvvvvvvvvv6/(double)2-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 71;BA.debugLine="Dim ScrollBarSize As Int";
_scrollbarsize = 0;
 //BA.debugLineNum = 72;BA.debugLine="If xui.IsB4J Then ScrollBarSize = 20dip Else Scro";
if (_vvvvvvvvv6.getIsB4J()) { 
_scrollbarsize = __c.DipToCurrent((int) (20));}
else {
_scrollbarsize = __c.DipToCurrent((int) (2));};
 //BA.debugLineNum = 73;BA.debugLine="CLV.GetBase.Height = ItemsHeight + ScrollBarSize";
_clv._getbase().setHeight((int) (_vvvvvvvvvvvvvvvv6+_scrollbarsize));
 //BA.debugLineNum = 74;BA.debugLine="If xui.IsB4A Then";
if (_vvvvvvvvv6.getIsB4A()) { 
 //BA.debugLineNum = 75;BA.debugLine="CLV.Base_Resize(CLV.GetBase.Width, CLV.GetBase.H";
_clv._base_resize(_clv._getbase().getWidth(),_clv._getbase().getHeight());
 };
 //BA.debugLineNum = 77;BA.debugLine="TextField.SetLayoutAnimated(0, 0, CLV.GetBase.Hei";
_textfield.SetLayoutAnimated((int) (0),(int) (0),_clv._getbase().getHeight(),_textfield.getWidth(),(int) (_height-_clv._getbase().getHeight()));
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As B4XView 'ignore";
_vvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private CLV As CustomListView";
_clv = new b4a.example3.customlistview();
 //BA.debugLineNum = 12;BA.debugLine="Public TextField As B4XView";
_textfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private prefixList As Map";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Private substringList As Map";
_vvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 15;BA.debugLine="Private MIN_LIMIT = 2 As Int 'minimum";
_min_limit = (int) (2);
 //BA.debugLineNum = 16;BA.debugLine="Private MAX_LIMIT = 4 As Int 'doesn't limit the w";
_max_limit = (int) (4);
 //BA.debugLineNum = 17;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
_vvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 18;BA.debugLine="Private fnt As B4XFont";
_vvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 19;BA.debugLine="Private ItemsHeight As Int";
_vvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private BaseLine As Int";
_vvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private ItemsBackgroundColor As Int";
_vvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 22;BA.debugLine="Private ItemsTextColor As Int";
_vvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 23;BA.debugLine="Private ItemsHighlightedTextColor As Int";
_vvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 24;BA.debugLine="Private Gap As Int = 7dip";
_vvvvvvvvvvvvvvvvv3 = __c.DipToCurrent((int) (7));
 //BA.debugLineNum = 25;BA.debugLine="Type MSVItemData (State As Int, cvs As B4XCanvas,";
;
 //BA.debugLineNum = 26;BA.debugLine="Private STATE_EMPTY = 0, STATE_NEED_TO_CLEAR = 1,";
_state_empty = (int) (0);
_state_need_to_clear = (int) (1);
_state_good = (int) (2);
 //BA.debugLineNum = 27;BA.debugLine="Private ListCounter As Int";
_vvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 28;BA.debugLine="Private SpaceWidth As Float 'ignore";
_vvvvvvvvvvvvvvvvv5 = 0f;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public void  _clv_itemclick(int _index,Object _value) throws Exception{
ResumableSub_CLV_ItemClick rsub = new ResumableSub_CLV_ItemClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_CLV_ItemClick extends BA.ResumableSub {
public ResumableSub_CLV_ItemClick(elicorp.pilot.minisearchview parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
elicorp.pilot.minisearchview parent;
int _index;
Object _value;
elicorp.pilot.minisearchview._msvitemdata _m = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 81;BA.debugLine="Dim m As MSVItemData = Value";
_m = (elicorp.pilot.minisearchview._msvitemdata)(_value);
 //BA.debugLineNum = 82;BA.debugLine="TextField.Text = m.Item";
parent._textfield.setText(BA.ObjectToCharSequence(_m.Item /*String*/ ));
 //BA.debugLineNum = 83;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 93;BA.debugLine="CLV.GetBase.Visible = False";
parent._clv._getbase().setVisible(parent.__c.False);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _clv_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
String _full = "";
int _centery = 0;
int _i = 0;
elicorp.pilot.minisearchview._msvitemdata _msv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _item = "";
int _x = 0;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2 = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _roundrect = null;
float _offset = 0f;
String _s = "";
 //BA.debugLineNum = 153;BA.debugLine="Private Sub CLV_VisibleRangeChanged (FirstIndex As";
 //BA.debugLineNum = 154;BA.debugLine="Dim full As String = TextField.Text.ToLowerCase";
_full = _textfield.getText().toLowerCase();
 //BA.debugLineNum = 155;BA.debugLine="If full.Length = 0 Then Return";
if (_full.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 156;BA.debugLine="Dim CenterY As Int = ItemsHeight / 2";
_centery = (int) (_vvvvvvvvvvvvvvvv6/(double)2);
 //BA.debugLineNum = 157;BA.debugLine="For i = FirstIndex To Min(CLV.Size - 1, LastIndex";
{
final int step4 = 1;
final int limit4 = (int) (__c.Min(_clv._getsize()-1,_lastindex));
_i = _firstindex ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 158;BA.debugLine="Dim msv As MSVItemData = CLV.GetValue(i)";
_msv = (elicorp.pilot.minisearchview._msvitemdata)(_clv._getvalue(_i));
 //BA.debugLineNum = 159;BA.debugLine="If msv.State = STATE_GOOD Then Continue";
if (_msv.State /*int*/ ==_state_good) { 
if (true) continue;};
 //BA.debugLineNum = 160;BA.debugLine="Dim p As B4XView = CLV.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _clv._getpanel(_i);
 //BA.debugLineNum = 162;BA.debugLine="Dim item As String = msv.Item";
_item = _msv.Item /*String*/ ;
 //BA.debugLineNum = 163;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
 //BA.debugLineNum = 164;BA.debugLine="If x = -1 Then Continue";
if (_x==-1) { 
if (true) continue;};
 //BA.debugLineNum = 165;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 166;BA.debugLine="If msv.State = STATE_NEED_TO_CLEAR Then";
if (_msv.State /*int*/ ==_state_need_to_clear) { 
 //BA.debugLineNum = 167;BA.debugLine="cvs = msv.cvs";
_cvs = _msv.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ ;
 //BA.debugLineNum = 168;BA.debugLine="If cvs.TargetRect.Width <> p.Width Then";
if (_cvs.getTargetRect().getWidth()!=_p.getWidth()) { 
 //BA.debugLineNum = 169;BA.debugLine="cvs.Resize(p.Width, p.Height)";
_cvs.Resize((float) (_p.getWidth()),(float) (_p.getHeight()));
 };
 //BA.debugLineNum = 171;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_cvs.ClearRect(_cvs.getTargetRect());
 }else {
 //BA.debugLineNum = 173;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
 //BA.debugLineNum = 174;BA.debugLine="msv.cvs = cvs";
_msv.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/  = _cvs;
 };
 //BA.debugLineNum = 176;BA.debugLine="msv.State = STATE_GOOD";
_msv.State /*int*/  = _state_good;
 //BA.debugLineNum = 177;BA.debugLine="Dim r2 As B4XRect";
_r2 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 178;BA.debugLine="Dim RoundRect As B4XPath";
_roundrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 179;BA.debugLine="r2.Initialize(0, CenterY - ItemsHeight / 2, p.Wi";
_r2.Initialize((float) (0),(float) (_centery-_vvvvvvvvvvvvvvvv6/(double)2),(float) (_p.getWidth()),(float) (_centery+_vvvvvvvvvvvvvvvv6/(double)2));
 //BA.debugLineNum = 180;BA.debugLine="RoundRect.InitializeRoundedRect(r2, 20dip)";
_roundrect.InitializeRoundedRect(_r2,(float) (__c.DipToCurrent((int) (20))));
 //BA.debugLineNum = 181;BA.debugLine="cvs.DrawPath(RoundRect, ItemsBackgroundColor, Tr";
_cvs.DrawPath(_roundrect,_vvvvvvvvvvvvvvvv0,__c.True,(float) (0));
 //BA.debugLineNum = 182;BA.debugLine="Dim offset As Float = Gap";
_offset = (float) (_vvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 183;BA.debugLine="If x > 0 Then";
if (_x>0) { 
 //BA.debugLineNum = 184;BA.debugLine="Dim s As String = item.SubString2(0, x)";
_s = _item.substring((int) (0),_x);
 //BA.debugLineNum = 185;BA.debugLine="offset = offset + DrawText(cvs, s, offset, Item";
_offset = (float) (_offset+_vvvvvvvvvvvvvvv4(_cvs,_s,_offset,_vvvvvvvvvvvvvvvvv1));
 //BA.debugLineNum = 186;BA.debugLine="offset = offset + MeasurementCanvas.MeasureText";
_offset = (float) (_offset+_vvvvvvvvvvvvvvvv4.MeasureText(_s,_vvvvvvvvvvvvvvvv5).getWidth()+_vvvvvvvvvvvvvvv6(_item.substring((int) (_x-1),(int) (_x+1))));
 };
 //BA.debugLineNum = 188;BA.debugLine="Dim s As String = item.SubString2(x, x + full.Le";
_s = _item.substring(_x,(int) (_x+_full.length()));
 //BA.debugLineNum = 189;BA.debugLine="offset = offset + DrawText(cvs, s, Round(offset)";
_offset = (float) (_offset+_vvvvvvvvvvvvvvv4(_cvs,_s,(float) (__c.Round(_offset)),_vvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 190;BA.debugLine="offset = offset + MeasurementCanvas.MeasureText(";
_offset = (float) (_offset+_vvvvvvvvvvvvvvvv4.MeasureText(_s,_vvvvvvvvvvvvvvvv5).getWidth());
 //BA.debugLineNum = 191;BA.debugLine="If x + full.Length < item.Length Then";
if (_x+_full.length()<_item.length()) { 
 //BA.debugLineNum = 192;BA.debugLine="offset = Round(offset + SpaceBetweenTwoLetters(";
_offset = (float) (__c.Round(_offset+_vvvvvvvvvvvvvvv6(_item.substring((int) (_x+_full.length()-1),(int) (_x+_full.length()+1)))));
 //BA.debugLineNum = 193;BA.debugLine="Dim s As String = item.SubString(x + full.Lengt";
_s = _item.substring((int) (_x+_full.length()));
 //BA.debugLineNum = 194;BA.debugLine="DrawText(cvs, s, offset, ItemsTextColor)";
_vvvvvvvvvvvvvvv4(_cvs,_s,_offset,_vvvvvvvvvvvvvvvvv1);
 };
 //BA.debugLineNum = 196;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
 }
};
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public elicorp.pilot.minisearchview._msvitemdata  _vvvvvvvvvvvvvvv3(String _item) throws Exception{
elicorp.pilot.minisearchview._msvitemdata _m = null;
 //BA.debugLineNum = 145;BA.debugLine="Private Sub CreateMSVItem(item As String) As MSVIt";
 //BA.debugLineNum = 146;BA.debugLine="Dim m As MSVItemData";
_m = new elicorp.pilot.minisearchview._msvitemdata();
 //BA.debugLineNum = 147;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 148;BA.debugLine="m.State = STATE_EMPTY";
_m.State /*int*/  = _state_empty;
 //BA.debugLineNum = 149;BA.debugLine="m.Item = item";
_m.Item /*String*/  = _item;
 //BA.debugLineNum = 150;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public void  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(this,_base,_lbl,_props);
rsub.resume(ba, null);
}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(elicorp.pilot.minisearchview parent,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) {
this.parent = parent;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
}
elicorp.pilot.minisearchview parent;
Object _base;
anywheresoftware.b4a.objects.LabelWrapper _lbl;
anywheresoftware.b4a.objects.collections.Map _props;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 42;BA.debugLine="mBase = Base";
parent._vvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 43;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="fnt = xlbl.Font";
parent._vvvvvvvvvvvvvvvv5 = _xlbl.getFont();
 //BA.debugLineNum = 45;BA.debugLine="ItemsBackgroundColor = xui.PaintOrColorToColor(Pr";
parent._vvvvvvvvvvvvvvvv0 = parent._vvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("ItemsBackgroundColor")));
 //BA.debugLineNum = 46;BA.debugLine="ItemsTextColor = xui.PaintOrColorToColor(Props.Ge";
parent._vvvvvvvvvvvvvvvvv1 = parent._vvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("ItemsTextColor")));
 //BA.debugLineNum = 47;BA.debugLine="ItemsHighlightedTextColor = xui.PaintOrColorToCol";
parent._vvvvvvvvvvvvvvvvv2 = parent._vvvvvvvvv6.PaintOrColorToColor(_props.Get((Object)("ItemsHighlightedTextColor")));
 //BA.debugLineNum = 48;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 49;BA.debugLine="mBase.LoadLayout(\"MiniSearchView\")";
parent._vvvvvvvvvvvvvvvv1.LoadLayout("MiniSearchView",ba);
 //BA.debugLineNum = 51;BA.debugLine="Dim jo As JavaObject = TextField";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent._textfield.getObject()));
 //BA.debugLineNum = 52;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array As Object(268";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(268435456)});
 //BA.debugLineNum = 54;BA.debugLine="CLV.GetBase.Visible = False";
parent._clv._getbase().setVisible(parent.__c.False);
 //BA.debugLineNum = 55;BA.debugLine="CLV.GetBase.SetColorAndBorder(xui.Color_Transpare";
parent._clv._getbase().SetColorAndBorder(parent._vvvvvvvvv6.Color_Transparent,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 56;BA.debugLine="CLV.sv.SetColorAndBorder(xui.Color_Transparent, 0";
parent._clv._sv.SetColorAndBorder(parent._vvvvvvvvv6.Color_Transparent,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 58;BA.debugLine="TextField.Font = xlbl.Font";
parent._textfield.setFont(_xlbl.getFont());
 //BA.debugLineNum = 59;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
parent._base_resize(parent._vvvvvvvvvvvvvvvv1.getWidth(),parent._vvvvvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public float  _vvvvvvvvvvvvvvv4(anywheresoftware.b4a.objects.B4XCanvas _cvs,String _text,float _offset,int _clr) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Private Sub DrawText(cvs As B4XCanvas, text As Str";
 //BA.debugLineNum = 202;BA.debugLine="cvs.DrawText(text, offset, BaseLine, fnt, clr, \"L";
_cvs.DrawText(ba,_text,_offset,(float) (_vvvvvvvvvvvvvvvv7),_vvvvvvvvvvvvvvvv5,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 203;BA.debugLine="Return 0";
if (true) return (float) (0);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 32;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 33;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 34;BA.debugLine="prefixList.Initialize";
_vvvvvvvvvvvvvvvv2.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="substringList.Initialize";
_vvvvvvvvvvvvvvvv3.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvv6.CreatePanel(ba,"");
 //BA.debugLineNum = 37;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 38;BA.debugLine="MeasurementCanvas.Initialize(p)";
_vvvvvvvvvvvvvvvv4.Initialize(_p);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public Object  _vvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
long _starttime = 0L;
anywheresoftware.b4a.objects.collections.Map _noduplicates = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
String _item = "";
int _start = 0;
int _count = 0;
String _str = "";
 //BA.debugLineNum = 245;BA.debugLine="Public Sub SetItems(Items As List) As Object";
 //BA.debugLineNum = 246;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
 //BA.debugLineNum = 247;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
 //BA.debugLineNum = 248;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 249;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
 //BA.debugLineNum = 250;BA.debugLine="prefixList.Clear";
_vvvvvvvvvvvvvvvv2.Clear();
 //BA.debugLineNum = 251;BA.debugLine="substringList.Clear";
_vvvvvvvvvvvvvvvv3.Clear();
 //BA.debugLineNum = 252;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 253;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 254;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 255;BA.debugLine="Dim item As String";
_item = "";
 //BA.debugLineNum = 256;BA.debugLine="item = Items.Get(i)";
_item = BA.ObjectToString(_items.Get(_i));
 //BA.debugLineNum = 257;BA.debugLine="item = item.ToLowerCase";
_item = _item.toLowerCase();
 //BA.debugLineNum = 258;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
 //BA.debugLineNum = 259;BA.debugLine="For start = 0 To item.Length";
{
final int step14 = 1;
final int limit14 = _item.length();
_start = (int) (0) ;
for (;_start <= limit14 ;_start = _start + step14 ) {
 //BA.debugLineNum = 260;BA.debugLine="Dim count As Int = MIN_LIMIT";
_count = _min_limit;
 //BA.debugLineNum = 261;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=_max_limit && _start+_count<=_item.length()) {
 //BA.debugLineNum = 262;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 263;BA.debugLine="str = item.SubString2(start, start + count)";
_str = _item.substring(_start,(int) (_start+_count));
 //BA.debugLineNum = 264;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
 //BA.debugLineNum = 265;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
 //BA.debugLineNum = 266;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = _vvvvvvvvvvvvvvvv2;}
else {
_m = _vvvvvvvvvvvvvvvv3;};
 //BA.debugLineNum = 267;BA.debugLine="li = m.Get(str)";
_li = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)(_str))));
 //BA.debugLineNum = 268;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 269;BA.debugLine="li.Initialize";
_li.Initialize();
 //BA.debugLineNum = 270;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
 //BA.debugLineNum = 272;BA.debugLine="li.Add(Items.Get(i)) 'Preserve the original c";
_li.Add(_items.Get(_i));
 };
 //BA.debugLineNum = 274;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
 //BA.debugLineNum = 278;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.LogImpl("14390945","Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)",0);
 //BA.debugLineNum = 279;BA.debugLine="Return Array As Object(prefixList, substringList)";
if (true) return (Object)(new Object[]{(Object)(_vvvvvvvvvvvvvvvv2.getObject()),(Object)(_vvvvvvvvvvvvvvvv3.getObject())});
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public float  _vvvvvvvvvvvvvvv6(String _s) throws Exception{
float _res = 0f;
 //BA.debugLineNum = 225;BA.debugLine="Private Sub SpaceBetweenTwoLetters(s As String) As";
 //BA.debugLineNum = 226;BA.debugLine="s = s.Replace(\" \", \"x\")";
_s = _s.replace(" ","x");
 //BA.debugLineNum = 227;BA.debugLine="Dim res As Float = MeasurementCanvas.MeasureText(";
_res = (float) (_vvvvvvvvvvvvvvvv4.MeasureText(_s,_vvvvvvvvvvvvvvvv5).getWidth()-_vvvvvvvvvvvvvvvv4.MeasureText(BA.ObjectToString(_s.charAt((int) (0))),_vvvvvvvvvvvvvvvv5).getWidth()-_vvvvvvvvvvvvvvvv4.MeasureText(BA.ObjectToString(_s.charAt((int) (1))),_vvvvvvvvvvvvvvvv5).getWidth());
 //BA.debugLineNum = 229;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return 0f;
}
public String  _textfield_action() throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Private Sub TextField_Action";
 //BA.debugLineNum = 237;BA.debugLine="If CLV.GetBase.Visible And CLV.Size > 0 Then";
if (_clv._getbase().getVisible() && _clv._getsize()>0) { 
 //BA.debugLineNum = 238;BA.debugLine="CLV_ItemClick(0, CLV.GetValue(0))";
_clv_itemclick((int) (0),_clv._getvalue((int) (0)));
 };
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _textfield_enterpressed() throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Private Sub TextField_EnterPressed";
 //BA.debugLineNum = 233;BA.debugLine="TextField_Action";
_textfield_action();
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public String  _textfield_textchanged(String _old,String _new) throws Exception{
String _str1 = "";
String _str2 = "";
int _i2 = 0;
 //BA.debugLineNum = 96;BA.debugLine="Private Sub TextField_TextChanged (Old As String,";
 //BA.debugLineNum = 97;BA.debugLine="If New.Length < MIN_LIMIT Then";
if (_new.length()<_min_limit) { 
 //BA.debugLineNum = 98;BA.debugLine="CLV.GetBase.Visible = False";
_clv._getbase().setVisible(__c.False);
 //BA.debugLineNum = 99;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 101;BA.debugLine="If CLV.GetBase.Visible = False Then CLV.GetBase.V";
if (_clv._getbase().getVisible()==__c.False) { 
_clv._getbase().setVisible(__c.True);};
 //BA.debugLineNum = 102;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
 //BA.debugLineNum = 103;BA.debugLine="str1 = New.ToLowerCase";
_str1 = _new.toLowerCase();
 //BA.debugLineNum = 104;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>_max_limit) { 
 //BA.debugLineNum = 105;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),_max_limit);
 }else {
 //BA.debugLineNum = 107;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
 //BA.debugLineNum = 109;BA.debugLine="ListCounter = -1";
_vvvvvvvvvvvvvvvvv4 = (int) (-1);
 //BA.debugLineNum = 110;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
_vvvvvvvvvvvvvvv2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vvvvvvvvvvvvvvvv2.Get((Object)(_str2)))),_str1);
 //BA.debugLineNum = 111;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
_vvvvvvvvvvvvvvv2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_vvvvvvvvvvvvvvvv3.Get((Object)(_str2)))),_str1);
 //BA.debugLineNum = 112;BA.debugLine="For i2 = CLV.Size - 1 To ListCounter + 1 Step -1";
{
final int step16 = -1;
final int limit16 = (int) (_vvvvvvvvvvvvvvvvv4+1);
_i2 = (int) (_clv._getsize()-1) ;
for (;_i2 >= limit16 ;_i2 = _i2 + step16 ) {
 //BA.debugLineNum = 113;BA.debugLine="CLV.RemoveAt(i2)";
_clv._removeat(_i2);
 }
};
 //BA.debugLineNum = 115;BA.debugLine="CLV.Refresh";
_clv._refresh();
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
