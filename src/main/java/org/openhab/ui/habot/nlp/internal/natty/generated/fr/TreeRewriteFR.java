// $ANTLR 3.5.2 org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g 2018-03-09 01:57:06
 package org.openhab.ui.habot.nlp.internal.natty.generated.fr; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class TreeRewriteFR extends TreeRewriter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "AGO", "AM", "AN", "AND", 
		"APRIL", "AT", "AUGUST", "BEFORE", "BEGINNING", "BLACK", "CHRISTMAS", 
		"COLON", "COLUMBUS", "COMING", "COMMA", "CURRENT", "DASH", "DAY", "DECEMBER", 
		"DIGIT", "DOT", "EARTH", "EASTER", "EIGHT", "EIGHTEEN", "EIGHTEENTH", 
		"EIGHTH", "ELECTION", "ELEVEN", "ELEVENTH", "EVENING", "EVERY", "FALL", 
		"FATHER", "FEBRUARY", "FIFTEEN", "FIFTEENTH", "FIFTH", "FIRST", "FIVE", 
		"FLAG", "FOOL", "FOR", "FOUR", "FOURTEEN", "FOURTEENTH", "FOURTH", "FRIDAY", 
		"FROM", "GOOD", "GROUND", "GROUNDHOG", "HALLOWEEN", "HOG", "HOUR", "IN", 
		"INAUGURATION", "INDEPENDENCE", "INT_0", "INT_00", "INT_01", "INT_02", 
		"INT_03", "INT_04", "INT_05", "INT_06", "INT_07", "INT_08", "INT_09", 
		"INT_1", "INT_10", "INT_11", "INT_12", "INT_13", "INT_14", "INT_15", "INT_16", 
		"INT_17", "INT_18", "INT_19", "INT_2", "INT_20", "INT_21", "INT_22", "INT_23", 
		"INT_24", "INT_25", "INT_26", "INT_27", "INT_28", "INT_29", "INT_3", "INT_30", 
		"INT_31", "INT_32", "INT_33", "INT_34", "INT_35", "INT_36", "INT_37", 
		"INT_38", "INT_39", "INT_4", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", 
		"INT_45", "INT_46", "INT_47", "INT_48", "INT_49", "INT_5", "INT_50", "INT_51", 
		"INT_52", "INT_53", "INT_54", "INT_55", "INT_56", "INT_57", "INT_58", 
		"INT_59", "INT_6", "INT_60", "INT_61", "INT_62", "INT_63", "INT_64", "INT_65", 
		"INT_66", "INT_67", "INT_68", "INT_69", "INT_7", "INT_70", "INT_71", "INT_72", 
		"INT_73", "INT_74", "INT_75", "INT_76", "INT_77", "INT_78", "INT_79", 
		"INT_8", "INT_80", "INT_81", "INT_82", "INT_83", "INT_84", "INT_85", "INT_86", 
		"INT_87", "INT_88", "INT_89", "INT_9", "INT_90", "INT_91", "INT_92", "INT_93", 
		"INT_94", "INT_95", "INT_96", "INT_97", "INT_98", "INT_99", "JANUARY", 
		"JULY", "JUNE", "KWANZAA", "LABOR", "LAST", "MARCH", "MAY", "MEMORIAL", 
		"MIDNIGHT", "MINUTE", "MLK", "MONDAY", "MONTH", "MORNING", "MOTHER", "NEW", 
		"NEXT", "NIGHT", "NINE", "NINETEEN", "NINETEENTH", "NINTH", "NOON", "NOVEMBER", 
		"NOW", "OCTOBER", "OF", "ON", "ONE", "OR", "PALM", "PATRICK", "PATRIOT", 
		"PLUS", "PM", "PRESIDENT", "RD", "SAINT", "SATURDAY", "SECOND", "SEPTEMBER", 
		"SEVEN", "SEVENTEEN", "SEVENTEENTH", "SEVENTH", "SINGLE_QUOTE", "SIX", 
		"SIXTEEN", "SIXTEENTH", "SIXTH", "SLASH", "SPACE", "SPRING", "ST", "START", 
		"SUMMER", "SUNDAY", "T", "TAX", "TEN", "TENTH", "THANKSGIVING", "THIRD", 
		"THIRTEEN", "THIRTEENTH", "THIRTIETH", "THIRTY", "THIRTYONE", "THIS", 
		"THREE", "THURSDAY", "TODAY", "TOMORROW", "TONIGHT", "TUESDAY", "TWELFTH", 
		"TWELVE", "TWENTIETH", "TWENTY", "TWENTYONE", "TWO", "UNKNOWN", "UNKNOWN_CHAR", 
		"UNTIL", "UPCOMING", "VALENTINE", "VETERAN", "WEDNESDAY", "WEEK", "WHITE_SPACE", 
		"WINTER", "YEAR", "YESTERDAY", "AKST", "AM_PM", "AUTUMN", "CST", "DATE_TIME", 
		"DATE_TIME_ALTERNATIVE", "DAY_OF_MONTH", "DAY_OF_WEEK", "DAY_OF_YEAR", 
		"DIRECTION", "END", "EST", "EXPLICIT_DATE", "EXPLICIT_SEEK", "EXPLICIT_TIME", 
		"HAST", "HOLIDAY", "HOURS_OF_DAY", "INT", "MILITARY_HOUR_SUFFIX", "MINUTES_OF_HOUR", 
		"MONTH_OF_YEAR", "MST", "ND", "PAST", "PST", "RECURRENCE", "RELATIVE_DATE", 
		"RELATIVE_TIME", "SEASON", "SECONDS_OF_MINUTE", "SEEK", "SEEK_BY", "SPAN", 
		"TH", "THAT", "THE", "THROUGH", "TO", "UTC", "YEAR_OF", "ZONE", "ZONE_OFFSET"
	};
	public static final int EOF=-1;
	public static final int AFTER=4;
	public static final int AGO=5;
	public static final int AM=6;
	public static final int AN=7;
	public static final int AND=8;
	public static final int APRIL=9;
	public static final int AT=10;
	public static final int AUGUST=11;
	public static final int BEFORE=12;
	public static final int BEGINNING=13;
	public static final int BLACK=14;
	public static final int CHRISTMAS=15;
	public static final int COLON=16;
	public static final int COLUMBUS=17;
	public static final int COMING=18;
	public static final int COMMA=19;
	public static final int CURRENT=20;
	public static final int DASH=21;
	public static final int DAY=22;
	public static final int DECEMBER=23;
	public static final int DIGIT=24;
	public static final int DOT=25;
	public static final int EARTH=26;
	public static final int EASTER=27;
	public static final int EIGHT=28;
	public static final int EIGHTEEN=29;
	public static final int EIGHTEENTH=30;
	public static final int EIGHTH=31;
	public static final int ELECTION=32;
	public static final int ELEVEN=33;
	public static final int ELEVENTH=34;
	public static final int EVENING=35;
	public static final int EVERY=36;
	public static final int FALL=37;
	public static final int FATHER=38;
	public static final int FEBRUARY=39;
	public static final int FIFTEEN=40;
	public static final int FIFTEENTH=41;
	public static final int FIFTH=42;
	public static final int FIRST=43;
	public static final int FIVE=44;
	public static final int FLAG=45;
	public static final int FOOL=46;
	public static final int FOR=47;
	public static final int FOUR=48;
	public static final int FOURTEEN=49;
	public static final int FOURTEENTH=50;
	public static final int FOURTH=51;
	public static final int FRIDAY=52;
	public static final int FROM=53;
	public static final int GOOD=54;
	public static final int GROUND=55;
	public static final int GROUNDHOG=56;
	public static final int HALLOWEEN=57;
	public static final int HOG=58;
	public static final int HOUR=59;
	public static final int IN=60;
	public static final int INAUGURATION=61;
	public static final int INDEPENDENCE=62;
	public static final int INT_0=63;
	public static final int INT_00=64;
	public static final int INT_01=65;
	public static final int INT_02=66;
	public static final int INT_03=67;
	public static final int INT_04=68;
	public static final int INT_05=69;
	public static final int INT_06=70;
	public static final int INT_07=71;
	public static final int INT_08=72;
	public static final int INT_09=73;
	public static final int INT_1=74;
	public static final int INT_10=75;
	public static final int INT_11=76;
	public static final int INT_12=77;
	public static final int INT_13=78;
	public static final int INT_14=79;
	public static final int INT_15=80;
	public static final int INT_16=81;
	public static final int INT_17=82;
	public static final int INT_18=83;
	public static final int INT_19=84;
	public static final int INT_2=85;
	public static final int INT_20=86;
	public static final int INT_21=87;
	public static final int INT_22=88;
	public static final int INT_23=89;
	public static final int INT_24=90;
	public static final int INT_25=91;
	public static final int INT_26=92;
	public static final int INT_27=93;
	public static final int INT_28=94;
	public static final int INT_29=95;
	public static final int INT_3=96;
	public static final int INT_30=97;
	public static final int INT_31=98;
	public static final int INT_32=99;
	public static final int INT_33=100;
	public static final int INT_34=101;
	public static final int INT_35=102;
	public static final int INT_36=103;
	public static final int INT_37=104;
	public static final int INT_38=105;
	public static final int INT_39=106;
	public static final int INT_4=107;
	public static final int INT_40=108;
	public static final int INT_41=109;
	public static final int INT_42=110;
	public static final int INT_43=111;
	public static final int INT_44=112;
	public static final int INT_45=113;
	public static final int INT_46=114;
	public static final int INT_47=115;
	public static final int INT_48=116;
	public static final int INT_49=117;
	public static final int INT_5=118;
	public static final int INT_50=119;
	public static final int INT_51=120;
	public static final int INT_52=121;
	public static final int INT_53=122;
	public static final int INT_54=123;
	public static final int INT_55=124;
	public static final int INT_56=125;
	public static final int INT_57=126;
	public static final int INT_58=127;
	public static final int INT_59=128;
	public static final int INT_6=129;
	public static final int INT_60=130;
	public static final int INT_61=131;
	public static final int INT_62=132;
	public static final int INT_63=133;
	public static final int INT_64=134;
	public static final int INT_65=135;
	public static final int INT_66=136;
	public static final int INT_67=137;
	public static final int INT_68=138;
	public static final int INT_69=139;
	public static final int INT_7=140;
	public static final int INT_70=141;
	public static final int INT_71=142;
	public static final int INT_72=143;
	public static final int INT_73=144;
	public static final int INT_74=145;
	public static final int INT_75=146;
	public static final int INT_76=147;
	public static final int INT_77=148;
	public static final int INT_78=149;
	public static final int INT_79=150;
	public static final int INT_8=151;
	public static final int INT_80=152;
	public static final int INT_81=153;
	public static final int INT_82=154;
	public static final int INT_83=155;
	public static final int INT_84=156;
	public static final int INT_85=157;
	public static final int INT_86=158;
	public static final int INT_87=159;
	public static final int INT_88=160;
	public static final int INT_89=161;
	public static final int INT_9=162;
	public static final int INT_90=163;
	public static final int INT_91=164;
	public static final int INT_92=165;
	public static final int INT_93=166;
	public static final int INT_94=167;
	public static final int INT_95=168;
	public static final int INT_96=169;
	public static final int INT_97=170;
	public static final int INT_98=171;
	public static final int INT_99=172;
	public static final int JANUARY=173;
	public static final int JULY=174;
	public static final int JUNE=175;
	public static final int KWANZAA=176;
	public static final int LABOR=177;
	public static final int LAST=178;
	public static final int MARCH=179;
	public static final int MAY=180;
	public static final int MEMORIAL=181;
	public static final int MIDNIGHT=182;
	public static final int MINUTE=183;
	public static final int MLK=184;
	public static final int MONDAY=185;
	public static final int MONTH=186;
	public static final int MORNING=187;
	public static final int MOTHER=188;
	public static final int NEW=189;
	public static final int NEXT=190;
	public static final int NIGHT=191;
	public static final int NINE=192;
	public static final int NINETEEN=193;
	public static final int NINETEENTH=194;
	public static final int NINTH=195;
	public static final int NOON=196;
	public static final int NOVEMBER=197;
	public static final int NOW=198;
	public static final int OCTOBER=199;
	public static final int OF=200;
	public static final int ON=201;
	public static final int ONE=202;
	public static final int OR=203;
	public static final int PALM=204;
	public static final int PATRICK=205;
	public static final int PATRIOT=206;
	public static final int PLUS=207;
	public static final int PM=208;
	public static final int PRESIDENT=209;
	public static final int RD=210;
	public static final int SAINT=211;
	public static final int SATURDAY=212;
	public static final int SECOND=213;
	public static final int SEPTEMBER=214;
	public static final int SEVEN=215;
	public static final int SEVENTEEN=216;
	public static final int SEVENTEENTH=217;
	public static final int SEVENTH=218;
	public static final int SINGLE_QUOTE=219;
	public static final int SIX=220;
	public static final int SIXTEEN=221;
	public static final int SIXTEENTH=222;
	public static final int SIXTH=223;
	public static final int SLASH=224;
	public static final int SPACE=225;
	public static final int SPRING=226;
	public static final int ST=227;
	public static final int START=228;
	public static final int SUMMER=229;
	public static final int SUNDAY=230;
	public static final int T=231;
	public static final int TAX=232;
	public static final int TEN=233;
	public static final int TENTH=234;
	public static final int THANKSGIVING=235;
	public static final int THIRD=236;
	public static final int THIRTEEN=237;
	public static final int THIRTEENTH=238;
	public static final int THIRTIETH=239;
	public static final int THIRTY=240;
	public static final int THIRTYONE=241;
	public static final int THIS=242;
	public static final int THREE=243;
	public static final int THURSDAY=244;
	public static final int TODAY=245;
	public static final int TOMORROW=246;
	public static final int TONIGHT=247;
	public static final int TUESDAY=248;
	public static final int TWELFTH=249;
	public static final int TWELVE=250;
	public static final int TWENTIETH=251;
	public static final int TWENTY=252;
	public static final int TWENTYONE=253;
	public static final int TWO=254;
	public static final int UNKNOWN=255;
	public static final int UNKNOWN_CHAR=256;
	public static final int UNTIL=257;
	public static final int UPCOMING=258;
	public static final int VALENTINE=259;
	public static final int VETERAN=260;
	public static final int WEDNESDAY=261;
	public static final int WEEK=262;
	public static final int WHITE_SPACE=263;
	public static final int WINTER=264;
	public static final int YEAR=265;
	public static final int YESTERDAY=266;
	public static final int AKST=267;
	public static final int AM_PM=268;
	public static final int AUTUMN=269;
	public static final int CST=270;
	public static final int DATE_TIME=272;
	public static final int DATE_TIME_ALTERNATIVE=273;
	public static final int DAY_OF_MONTH=274;
	public static final int DAY_OF_WEEK=275;
	public static final int DAY_OF_YEAR=276;
	public static final int DIRECTION=277;
	public static final int END=284;
	public static final int EST=285;
	public static final int EXPLICIT_DATE=286;
	public static final int EXPLICIT_SEEK=287;
	public static final int EXPLICIT_TIME=288;
	public static final int HAST=298;
	public static final int HOLIDAY=299;
	public static final int HOURS_OF_DAY=300;
	public static final int INT=301;
	public static final int MILITARY_HOUR_SUFFIX=412;
	public static final int MINUTES_OF_HOUR=413;
	public static final int MONTH_OF_YEAR=414;
	public static final int MST=415;
	public static final int ND=416;
	public static final int PAST=422;
	public static final int PST=423;
	public static final int RECURRENCE=425;
	public static final int RELATIVE_DATE=426;
	public static final int RELATIVE_TIME=427;
	public static final int SEASON=428;
	public static final int SECONDS_OF_MINUTE=430;
	public static final int SEEK=431;
	public static final int SEEK_BY=432;
	public static final int SPAN=441;
	public static final int TH=445;
	public static final int THAT=446;
	public static final int THE=447;
	public static final int THROUGH=454;
	public static final int TO=455;
	public static final int UTC=461;
	public static final int YEAR_OF=463;
	public static final int ZONE=464;
	public static final int ZONE_OFFSET=465;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public TreeRewriteFR(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public TreeRewriteFR(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return TreeRewriteFR.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g"; }


	  @Override
	  protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
	      throws RecognitionException {
	    throw new MismatchedTokenException(ttype, input);
	  }

	  @Override
	  public Object recoverFromMismatchedSet(IntStream Input, RecognitionException e, BitSet follow)
	      throws RecognitionException {
	    throw e;
	  }


	public static class topdown_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "topdown"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:32:1: topdown : ( ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN amt= INT span= SPAN ) -> ^( SEEK DIRECTION SEEK_BY $amt $span) | ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) ) -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) ) );
	@Override
	public final TreeRewriteFR.topdown_return topdown() throws RecognitionException {
		TreeRewriteFR.topdown_return retval = new TreeRewriteFR.topdown_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree dow=null;
		CommonTree amount=null;
		CommonTree amt=null;
		CommonTree span=null;
		CommonTree dir=null;
		CommonTree seekby=null;
		CommonTree day=null;
		CommonTree month=null;
		CommonTree year=null;
		CommonTree SEEK1=null;
		CommonTree DIRECTION2=null;
		CommonTree SEEK_BY3=null;
		CommonTree INT4=null;
		CommonTree DAY_OF_WEEK5=null;
		CommonTree INT6=null;
		CommonTree DAY_OF_WEEK7=null;
		CommonTree SEEK8=null;
		CommonTree DIRECTION9=null;
		CommonTree SEEK_BY10=null;
		CommonTree INT11=null;
		CommonTree DAY_OF_MONTH12=null;
		CommonTree INT13=null;
		CommonTree DAY_OF_MONTH14=null;
		CommonTree SEEK15=null;
		CommonTree DIRECTION16=null;
		CommonTree SEEK_BY17=null;
		CommonTree INT18=null;
		CommonTree MONTH_OF_YEAR19=null;
		CommonTree INT20=null;
		CommonTree MONTH_OF_YEAR21=null;
		CommonTree SEEK22=null;
		CommonTree DIRECTION23=null;
		CommonTree SEEK_BY24=null;
		CommonTree INT25=null;
		CommonTree MONTH_OF_YEAR26=null;
		CommonTree INT27=null;
		CommonTree MONTH_OF_YEAR28=null;
		CommonTree SEEK29=null;
		CommonTree DIRECTION30=null;
		CommonTree SEEK_BY31=null;
		CommonTree INT32=null;
		CommonTree SPAN33=null;
		CommonTree RELATIVE_DATE34=null;
		CommonTree SEEK35=null;
		CommonTree MONTH_OF_YEAR36=null;
		CommonTree EXPLICIT_SEEK37=null;
		CommonTree DAY_OF_WEEK38=null;
		CommonTree EXPLICIT_SEEK39=null;
		CommonTree YEAR_OF40=null;

		CommonTree dow_tree=null;
		CommonTree amount_tree=null;
		CommonTree amt_tree=null;
		CommonTree span_tree=null;
		CommonTree dir_tree=null;
		CommonTree seekby_tree=null;
		CommonTree day_tree=null;
		CommonTree month_tree=null;
		CommonTree year_tree=null;
		CommonTree SEEK1_tree=null;
		CommonTree DIRECTION2_tree=null;
		CommonTree SEEK_BY3_tree=null;
		CommonTree INT4_tree=null;
		CommonTree DAY_OF_WEEK5_tree=null;
		CommonTree INT6_tree=null;
		CommonTree DAY_OF_WEEK7_tree=null;
		CommonTree SEEK8_tree=null;
		CommonTree DIRECTION9_tree=null;
		CommonTree SEEK_BY10_tree=null;
		CommonTree INT11_tree=null;
		CommonTree DAY_OF_MONTH12_tree=null;
		CommonTree INT13_tree=null;
		CommonTree DAY_OF_MONTH14_tree=null;
		CommonTree SEEK15_tree=null;
		CommonTree DIRECTION16_tree=null;
		CommonTree SEEK_BY17_tree=null;
		CommonTree INT18_tree=null;
		CommonTree MONTH_OF_YEAR19_tree=null;
		CommonTree INT20_tree=null;
		CommonTree MONTH_OF_YEAR21_tree=null;
		CommonTree SEEK22_tree=null;
		CommonTree DIRECTION23_tree=null;
		CommonTree SEEK_BY24_tree=null;
		CommonTree INT25_tree=null;
		CommonTree MONTH_OF_YEAR26_tree=null;
		CommonTree INT27_tree=null;
		CommonTree MONTH_OF_YEAR28_tree=null;
		CommonTree SEEK29_tree=null;
		CommonTree DIRECTION30_tree=null;
		CommonTree SEEK_BY31_tree=null;
		CommonTree INT32_tree=null;
		CommonTree SPAN33_tree=null;
		CommonTree RELATIVE_DATE34_tree=null;
		CommonTree SEEK35_tree=null;
		CommonTree MONTH_OF_YEAR36_tree=null;
		CommonTree EXPLICIT_SEEK37_tree=null;
		CommonTree DAY_OF_WEEK38_tree=null;
		CommonTree EXPLICIT_SEEK39_tree=null;
		CommonTree YEAR_OF40_tree=null;
		RewriteRuleNodeStream stream_MONTH_OF_YEAR=new RewriteRuleNodeStream(adaptor,"token MONTH_OF_YEAR");
		RewriteRuleNodeStream stream_DAY_OF_MONTH=new RewriteRuleNodeStream(adaptor,"token DAY_OF_MONTH");
		RewriteRuleNodeStream stream_DIRECTION=new RewriteRuleNodeStream(adaptor,"token DIRECTION");
		RewriteRuleNodeStream stream_YEAR_OF=new RewriteRuleNodeStream(adaptor,"token YEAR_OF");
		RewriteRuleNodeStream stream_DAY_OF_WEEK=new RewriteRuleNodeStream(adaptor,"token DAY_OF_WEEK");
		RewriteRuleNodeStream stream_EXPLICIT_SEEK=new RewriteRuleNodeStream(adaptor,"token EXPLICIT_SEEK");
		RewriteRuleNodeStream stream_SPAN=new RewriteRuleNodeStream(adaptor,"token SPAN");
		RewriteRuleNodeStream stream_SEEK_BY=new RewriteRuleNodeStream(adaptor,"token SEEK_BY");
		RewriteRuleNodeStream stream_SEEK=new RewriteRuleNodeStream(adaptor,"token SEEK");
		RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
		RewriteRuleNodeStream stream_RELATIVE_DATE=new RewriteRuleNodeStream(adaptor,"token RELATIVE_DATE");

		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:33:3: ( ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN amt= INT span= SPAN ) -> ^( SEEK DIRECTION SEEK_BY $amt $span) | ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) ) -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) ) )
			int alt1=6;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SEEK) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					int LA1_3 = input.LA(3);
					if ( (LA1_3==DIRECTION) ) {
						int LA1_4 = input.LA(4);
						if ( (LA1_4==SEEK_BY) ) {
							int LA1_5 = input.LA(5);
							if ( (LA1_5==INT) ) {
								switch ( input.LA(6) ) {
								case DAY_OF_WEEK:
									{
									alt1=1;
									}
									break;
								case DAY_OF_MONTH:
									{
									alt1=2;
									}
									break;
								case MONTH_OF_YEAR:
									{
									int LA1_9 = input.LA(7);
									if ( (LA1_9==DOWN) ) {
										int LA1_11 = input.LA(8);
										if ( (LA1_11==INT) ) {
											int LA1_12 = input.LA(9);
											if ( (LA1_12==UP) ) {
												int LA1_13 = input.LA(10);
												if ( (LA1_13==MONTH_OF_YEAR) ) {
													alt1=3;
												}
												else if ( (LA1_13==INT) ) {
													alt1=4;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 1, 13, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 1, 12, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 1, 11, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 1, 9, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

									}
									break;
								case SPAN:
									{
									alt1=5;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 1, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==RELATIVE_DATE) ) {
				alt1=6;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:33:5: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					_last = (CommonTree)input.LT(1);
					SEEK1=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown66); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK.add(SEEK1);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SEEK1;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown68); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION2);

					_last = (CommonTree)input.LT(1);
					SEEK_BY3=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown70); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY3);

					_last = (CommonTree)input.LT(1);
					INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown72); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT4);

					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					DAY_OF_WEEK5=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_topdown75); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DAY_OF_WEEK.add(DAY_OF_WEEK5);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = DAY_OF_WEEK5;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					INT6=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown77); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT6);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					DAY_OF_WEEK7=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_topdown81); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DAY_OF_WEEK.add(DAY_OF_WEEK7);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = DAY_OF_WEEK7;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown85); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(dow);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: SEEK, DAY_OF_WEEK, SEEK_BY, INT, dow, DIRECTION
					// token labels: dow
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 34:7: -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) )
					{
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:34:10: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_SEEK.nextNode()
						, root_1);
						adaptor.addChild(root_1, 
						stream_DIRECTION.nextNode()
						);
						adaptor.addChild(root_1, 
						stream_SEEK_BY.nextNode()
						);
						adaptor.addChild(root_1, 
						stream_INT.nextNode()
						);
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:34:39: ^( DAY_OF_WEEK $dow)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_DAY_OF_WEEK.nextNode()
						, root_2);
						adaptor.addChild(root_2, stream_dow.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:36:5: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					_last = (CommonTree)input.LT(1);
					SEEK8=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown120); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK.add(SEEK8);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SEEK8;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					DIRECTION9=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown122); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION9);

					_last = (CommonTree)input.LT(1);
					SEEK_BY10=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown124); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY10);

					_last = (CommonTree)input.LT(1);
					INT11=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown126); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT11);

					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					DAY_OF_MONTH12=(CommonTree)match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_topdown129); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DAY_OF_MONTH.add(DAY_OF_MONTH12);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = DAY_OF_MONTH12;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					INT13=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown131); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT13);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					DAY_OF_MONTH14=(CommonTree)match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_topdown135); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DAY_OF_MONTH.add(DAY_OF_MONTH14);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = DAY_OF_MONTH14;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown139); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(dow);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: DIRECTION, dow, SEEK, SEEK_BY, INT, DAY_OF_MONTH
					// token labels: dow
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 37:7: -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) )
					{
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:37:10: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_SEEK.nextNode()
						, root_1);
						adaptor.addChild(root_1, 
						stream_DIRECTION.nextNode()
						);
						adaptor.addChild(root_1, 
						stream_SEEK_BY.nextNode()
						);
						adaptor.addChild(root_1, 
						stream_INT.nextNode()
						);
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:37:39: ^( DAY_OF_MONTH $dow)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_DAY_OF_MONTH.nextNode()
						, root_2);
						adaptor.addChild(root_2, stream_dow.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:39:5: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					_last = (CommonTree)input.LT(1);
					SEEK15=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown174); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK.add(SEEK15);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SEEK15;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					DIRECTION16=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown176); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION16);

					_last = (CommonTree)input.LT(1);
					SEEK_BY17=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown178); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY17);

					_last = (CommonTree)input.LT(1);
					INT18=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown180); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT18);

					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					MONTH_OF_YEAR19=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown183); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR19);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MONTH_OF_YEAR19;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					INT20=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown185); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT20);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					MONTH_OF_YEAR21=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown189); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR21);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MONTH_OF_YEAR21;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown193); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(dow);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: MONTH_OF_YEAR, dow, DIRECTION, SEEK, SEEK_BY, INT
					// token labels: dow
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 40:7: -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) )
					{
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:40:10: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_SEEK.nextNode()
						, root_1);
						adaptor.addChild(root_1, 
						stream_DIRECTION.nextNode()
						);
						adaptor.addChild(root_1, 
						stream_SEEK_BY.nextNode()
						);
						adaptor.addChild(root_1, 
						stream_INT.nextNode()
						);
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:40:39: ^( MONTH_OF_YEAR $dow)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_MONTH_OF_YEAR.nextNode()
						, root_2);
						adaptor.addChild(root_2, stream_dow.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:42:5: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					_last = (CommonTree)input.LT(1);
					SEEK22=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown228); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK.add(SEEK22);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SEEK22;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					DIRECTION23=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown230); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION23);

					_last = (CommonTree)input.LT(1);
					SEEK_BY24=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown232); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY24);

					_last = (CommonTree)input.LT(1);
					INT25=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown234); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT25);

					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					MONTH_OF_YEAR26=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown237); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR26);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MONTH_OF_YEAR26;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					INT27=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown239); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT27);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					amount=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown244); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(amount);

					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					MONTH_OF_YEAR28=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown247); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR28);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MONTH_OF_YEAR28;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown251); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(dow);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: SEEK_BY, dow, amount, MONTH_OF_YEAR, DIRECTION, SEEK
					// token labels: amount, dow
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_amount=new RewriteRuleNodeStream(adaptor,"token amount",amount);
					RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 43:7: -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) )
					{
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:43:10: ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_SEEK.nextNode()
						, root_1);
						adaptor.addChild(root_1, 
						stream_DIRECTION.nextNode()
						);
						adaptor.addChild(root_1, 
						stream_SEEK_BY.nextNode()
						);
						adaptor.addChild(root_1, stream_amount.nextNode());
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:43:43: ^( MONTH_OF_YEAR $dow)
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_MONTH_OF_YEAR.nextNode()
						, root_2);
						adaptor.addChild(root_2, stream_dow.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:45:5: ^( SEEK DIRECTION SEEK_BY INT SPAN amt= INT span= SPAN )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					_last = (CommonTree)input.LT(1);
					SEEK29=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown287); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK.add(SEEK29);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SEEK29;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					DIRECTION30=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown289); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DIRECTION.add(DIRECTION30);

					_last = (CommonTree)input.LT(1);
					SEEK_BY31=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown291); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK_BY.add(SEEK_BY31);

					_last = (CommonTree)input.LT(1);
					INT32=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown293); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(INT32);

					_last = (CommonTree)input.LT(1);
					SPAN33=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_topdown295); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SPAN.add(SPAN33);

					_last = (CommonTree)input.LT(1);
					amt=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown299); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(amt);

					_last = (CommonTree)input.LT(1);
					span=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_topdown303); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SPAN.add(span);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: amt, SEEK_BY, DIRECTION, span, SEEK
					// token labels: amt, span
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_amt=new RewriteRuleNodeStream(adaptor,"token amt",amt);
					RewriteRuleNodeStream stream_span=new RewriteRuleNodeStream(adaptor,"token span",span);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 46:7: -> ^( SEEK DIRECTION SEEK_BY $amt $span)
					{
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:46:10: ^( SEEK DIRECTION SEEK_BY $amt $span)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_SEEK.nextNode()
						, root_1);
						adaptor.addChild(root_1, 
						stream_DIRECTION.nextNode()
						);
						adaptor.addChild(root_1, 
						stream_SEEK_BY.nextNode()
						);
						adaptor.addChild(root_1, stream_amt.nextNode());
						adaptor.addChild(root_1, stream_span.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:49:5: ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					_last = (CommonTree)input.LT(1);
					RELATIVE_DATE34=(CommonTree)match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_topdown337); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_RELATIVE_DATE.add(RELATIVE_DATE34);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = RELATIVE_DATE34;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					SEEK35=(CommonTree)match(input,SEEK,FOLLOW_SEEK_in_topdown340); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK.add(SEEK35);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = SEEK35;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					dir=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_topdown344); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DIRECTION.add(dir);

					_last = (CommonTree)input.LT(1);
					seekby=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_topdown348); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SEEK_BY.add(seekby);

					_last = (CommonTree)input.LT(1);
					day=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown352); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(day);

					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_3 = _last;
					CommonTree _first_3 = null;
					_last = (CommonTree)input.LT(1);
					MONTH_OF_YEAR36=(CommonTree)match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_topdown355); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MONTH_OF_YEAR.add(MONTH_OF_YEAR36);

					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = MONTH_OF_YEAR36;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					month=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown359); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(month);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_3;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					EXPLICIT_SEEK37=(CommonTree)match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_topdown370); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_EXPLICIT_SEEK.add(EXPLICIT_SEEK37);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = EXPLICIT_SEEK37;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					amount=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown374); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(amount);

					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_3 = _last;
					CommonTree _first_3 = null;
					_last = (CommonTree)input.LT(1);
					DAY_OF_WEEK38=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_topdown377); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DAY_OF_WEEK.add(DAY_OF_WEEK38);

					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = DAY_OF_WEEK38;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					dow=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown381); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(dow);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_3;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_2 = _last;
					CommonTree _first_2 = null;
					_last = (CommonTree)input.LT(1);
					EXPLICIT_SEEK39=(CommonTree)match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_topdown392); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_EXPLICIT_SEEK.add(EXPLICIT_SEEK39);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = EXPLICIT_SEEK39;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_3 = _last;
					CommonTree _first_3 = null;
					_last = (CommonTree)input.LT(1);
					YEAR_OF40=(CommonTree)match(input,YEAR_OF,FOLLOW_YEAR_OF_in_topdown395); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_YEAR_OF.add(YEAR_OF40);

					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = YEAR_OF40;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					year=(CommonTree)match(input,INT,FOLLOW_INT_in_topdown399); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(year);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_3;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: dir, dow, YEAR_OF, SEEK, EXPLICIT_SEEK, day, month, amount, DAY_OF_WEEK, RELATIVE_DATE, seekby, MONTH_OF_YEAR, year, EXPLICIT_SEEK
					// token labels: amount, seekby, month, year, dir, dow, day
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_amount=new RewriteRuleNodeStream(adaptor,"token amount",amount);
					RewriteRuleNodeStream stream_seekby=new RewriteRuleNodeStream(adaptor,"token seekby",seekby);
					RewriteRuleNodeStream stream_month=new RewriteRuleNodeStream(adaptor,"token month",month);
					RewriteRuleNodeStream stream_year=new RewriteRuleNodeStream(adaptor,"token year",year);
					RewriteRuleNodeStream stream_dir=new RewriteRuleNodeStream(adaptor,"token dir",dir);
					RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
					RewriteRuleNodeStream stream_day=new RewriteRuleNodeStream(adaptor,"token day",day);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 54:5: -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) )
					{
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:54:8: ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_RELATIVE_DATE.nextNode()
						, root_1);
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:54:24: ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_SEEK.nextNode()
						, root_2);
						adaptor.addChild(root_2, stream_dir.nextNode());
						adaptor.addChild(root_2, stream_seekby.nextNode());
						adaptor.addChild(root_2, stream_day.nextNode());
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:54:49: ^( MONTH_OF_YEAR $month)
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot(
						stream_MONTH_OF_YEAR.nextNode()
						, root_3);
						adaptor.addChild(root_3, stream_month.nextNode());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:55:8: ^( EXPLICIT_SEEK ^( YEAR_OF $year) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_EXPLICIT_SEEK.nextNode()
						, root_2);
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:55:24: ^( YEAR_OF $year)
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot(
						stream_YEAR_OF.nextNode()
						, root_3);
						adaptor.addChild(root_3, stream_year.nextNode());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:56:8: ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_EXPLICIT_SEEK.nextNode()
						, root_2);
						adaptor.addChild(root_2, stream_amount.nextNode());
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\TreeRewriteFR.g:56:32: ^( DAY_OF_WEEK $dow)
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot(
						stream_DAY_OF_WEEK.nextNode()
						, root_3);
						adaptor.addChild(root_3, stream_dow.nextNode());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "topdown"

	// Delegated rules



	public static final BitSet FOLLOW_SEEK_in_topdown66 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_topdown72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown75 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown77 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown81 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown85 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_topdown120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_topdown126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_DAY_OF_MONTH_in_topdown129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DAY_OF_MONTH_in_topdown135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown139 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_topdown174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_topdown180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown183 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown189 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_topdown228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_topdown234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown237 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown239 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_topdown244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_topdown287 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_topdown293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_SPAN_in_topdown295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_topdown299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_SPAN_in_topdown303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RELATIVE_DATE_in_topdown337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEEK_in_topdown340 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_topdown352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown359 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_topdown370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown377 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_topdown392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_YEAR_OF_in_topdown395 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown399 = new BitSet(new long[]{0x0000000000000008L});
}
