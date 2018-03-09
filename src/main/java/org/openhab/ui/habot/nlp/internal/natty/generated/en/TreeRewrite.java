// $ANTLR 3.5.2 org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g 2018-03-09 01:57:06
 package org.openhab.ui.habot.nlp.internal.natty.generated.en; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class TreeRewrite extends TreeRewriter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFTER", "AGO", "AKST", "AM", 
		"AN", "AND", "APRIL", "AT", "AUGUST", "AUTUMN", "BEFORE", "BEGINNING", 
		"BLACK", "CHRISTMAS", "COLON", "COLUMBUS", "COMING", "COMMA", "CST", "CURRENT", 
		"DASH", "DAY", "DECEMBER", "DIGIT", "DOT", "EARTH", "EASTER", "EIGHT", 
		"EIGHTEEN", "EIGHTEENTH", "EIGHTH", "ELECTION", "ELEVEN", "ELEVENTH", 
		"END", "EST", "EVENING", "EVERY", "FALL", "FATHER", "FEBRUARY", "FIFTEEN", 
		"FIFTEENTH", "FIFTH", "FIRST", "FIVE", "FLAG", "FOOL", "FOR", "FOUR", 
		"FOURTEEN", "FOURTEENTH", "FOURTH", "FRIDAY", "FROM", "GOOD", "GROUND", 
		"GROUNDHOG", "HALLOWEEN", "HAST", "HOG", "HOUR", "IN", "INAUGURATION", 
		"INDEPENDENCE", "INT_0", "INT_00", "INT_01", "INT_02", "INT_03", "INT_04", 
		"INT_05", "INT_06", "INT_07", "INT_08", "INT_09", "INT_1", "INT_10", "INT_11", 
		"INT_12", "INT_13", "INT_14", "INT_15", "INT_16", "INT_17", "INT_18", 
		"INT_19", "INT_2", "INT_20", "INT_21", "INT_22", "INT_23", "INT_24", "INT_25", 
		"INT_26", "INT_27", "INT_28", "INT_29", "INT_3", "INT_30", "INT_31", "INT_32", 
		"INT_33", "INT_34", "INT_35", "INT_36", "INT_37", "INT_38", "INT_39", 
		"INT_4", "INT_40", "INT_41", "INT_42", "INT_43", "INT_44", "INT_45", "INT_46", 
		"INT_47", "INT_48", "INT_49", "INT_5", "INT_50", "INT_51", "INT_52", "INT_53", 
		"INT_54", "INT_55", "INT_56", "INT_57", "INT_58", "INT_59", "INT_6", "INT_60", 
		"INT_61", "INT_62", "INT_63", "INT_64", "INT_65", "INT_66", "INT_67", 
		"INT_68", "INT_69", "INT_7", "INT_70", "INT_71", "INT_72", "INT_73", "INT_74", 
		"INT_75", "INT_76", "INT_77", "INT_78", "INT_79", "INT_8", "INT_80", "INT_81", 
		"INT_82", "INT_83", "INT_84", "INT_85", "INT_86", "INT_87", "INT_88", 
		"INT_89", "INT_9", "INT_90", "INT_91", "INT_92", "INT_93", "INT_94", "INT_95", 
		"INT_96", "INT_97", "INT_98", "INT_99", "JANUARY", "JULY", "JUNE", "KWANZAA", 
		"LABOR", "LAST", "MARCH", "MAY", "MEMORIAL", "MIDNIGHT", "MILITARY_HOUR_SUFFIX", 
		"MINUTE", "MLK", "MONDAY", "MONTH", "MORNING", "MOTHER", "MST", "ND", 
		"NEW", "NEXT", "NIGHT", "NINE", "NINETEEN", "NINETEENTH", "NINTH", "NOON", 
		"NOVEMBER", "NOW", "OCTOBER", "OF", "ON", "ONE", "OR", "PALM", "PAST", 
		"PATRICK", "PATRIOT", "PLUS", "PM", "PRESIDENT", "PST", "RD", "SAINT", 
		"SATURDAY", "SECOND", "SEPTEMBER", "SEVEN", "SEVENTEEN", "SEVENTEENTH", 
		"SEVENTH", "SINGLE_QUOTE", "SIX", "SIXTEEN", "SIXTEENTH", "SIXTH", "SLASH", 
		"SPACE", "SPRING", "ST", "START", "SUMMER", "SUNDAY", "T", "TAX", "TEN", 
		"TENTH", "TH", "THANKSGIVING", "THAT", "THE", "THIRD", "THIRTEEN", "THIRTEENTH", 
		"THIRTIETH", "THIRTY", "THIS", "THREE", "THROUGH", "THURSDAY", "TO", "TODAY", 
		"TOMORROW", "TONIGHT", "TUESDAY", "TWELFTH", "TWELVE", "TWENTIETH", "TWENTY", 
		"TWO", "UNKNOWN", "UNKNOWN_CHAR", "UNTIL", "UPCOMING", "UTC", "VALENTINE", 
		"VETERAN", "WEDNESDAY", "WEEK", "WHITE_SPACE", "WINTER", "YEAR", "YESTERDAY", 
		"AM_PM", "DATE_TIME", "DATE_TIME_ALTERNATIVE", "DAY_OF_MONTH", "DAY_OF_WEEK", 
		"DAY_OF_YEAR", "DIRECTION", "EXPLICIT_DATE", "EXPLICIT_SEEK", "EXPLICIT_TIME", 
		"HOLIDAY", "HOURS_OF_DAY", "INT", "MINUTES_OF_HOUR", "MONTH_OF_YEAR", 
		"RECURRENCE", "RELATIVE_DATE", "RELATIVE_TIME", "SEASON", "SECONDS_OF_MINUTE", 
		"SEEK", "SEEK_BY", "SPAN", "YEAR_OF", "ZONE", "ZONE_OFFSET"
	};
	public static final int EOF=-1;
	public static final int AFTER=4;
	public static final int AGO=5;
	public static final int AKST=6;
	public static final int AM=7;
	public static final int AN=8;
	public static final int AND=9;
	public static final int APRIL=10;
	public static final int AT=11;
	public static final int AUGUST=12;
	public static final int AUTUMN=13;
	public static final int BEFORE=14;
	public static final int BEGINNING=15;
	public static final int BLACK=16;
	public static final int CHRISTMAS=17;
	public static final int COLON=18;
	public static final int COLUMBUS=19;
	public static final int COMING=20;
	public static final int COMMA=21;
	public static final int CST=22;
	public static final int CURRENT=23;
	public static final int DASH=24;
	public static final int DAY=25;
	public static final int DECEMBER=26;
	public static final int DIGIT=27;
	public static final int DOT=28;
	public static final int EARTH=29;
	public static final int EASTER=30;
	public static final int EIGHT=31;
	public static final int EIGHTEEN=32;
	public static final int EIGHTEENTH=33;
	public static final int EIGHTH=34;
	public static final int ELECTION=35;
	public static final int ELEVEN=36;
	public static final int ELEVENTH=37;
	public static final int END=38;
	public static final int EST=39;
	public static final int EVENING=40;
	public static final int EVERY=41;
	public static final int FALL=42;
	public static final int FATHER=43;
	public static final int FEBRUARY=44;
	public static final int FIFTEEN=45;
	public static final int FIFTEENTH=46;
	public static final int FIFTH=47;
	public static final int FIRST=48;
	public static final int FIVE=49;
	public static final int FLAG=50;
	public static final int FOOL=51;
	public static final int FOR=52;
	public static final int FOUR=53;
	public static final int FOURTEEN=54;
	public static final int FOURTEENTH=55;
	public static final int FOURTH=56;
	public static final int FRIDAY=57;
	public static final int FROM=58;
	public static final int GOOD=59;
	public static final int GROUND=60;
	public static final int GROUNDHOG=61;
	public static final int HALLOWEEN=62;
	public static final int HAST=63;
	public static final int HOG=64;
	public static final int HOUR=65;
	public static final int IN=66;
	public static final int INAUGURATION=67;
	public static final int INDEPENDENCE=68;
	public static final int INT_0=69;
	public static final int INT_00=70;
	public static final int INT_01=71;
	public static final int INT_02=72;
	public static final int INT_03=73;
	public static final int INT_04=74;
	public static final int INT_05=75;
	public static final int INT_06=76;
	public static final int INT_07=77;
	public static final int INT_08=78;
	public static final int INT_09=79;
	public static final int INT_1=80;
	public static final int INT_10=81;
	public static final int INT_11=82;
	public static final int INT_12=83;
	public static final int INT_13=84;
	public static final int INT_14=85;
	public static final int INT_15=86;
	public static final int INT_16=87;
	public static final int INT_17=88;
	public static final int INT_18=89;
	public static final int INT_19=90;
	public static final int INT_2=91;
	public static final int INT_20=92;
	public static final int INT_21=93;
	public static final int INT_22=94;
	public static final int INT_23=95;
	public static final int INT_24=96;
	public static final int INT_25=97;
	public static final int INT_26=98;
	public static final int INT_27=99;
	public static final int INT_28=100;
	public static final int INT_29=101;
	public static final int INT_3=102;
	public static final int INT_30=103;
	public static final int INT_31=104;
	public static final int INT_32=105;
	public static final int INT_33=106;
	public static final int INT_34=107;
	public static final int INT_35=108;
	public static final int INT_36=109;
	public static final int INT_37=110;
	public static final int INT_38=111;
	public static final int INT_39=112;
	public static final int INT_4=113;
	public static final int INT_40=114;
	public static final int INT_41=115;
	public static final int INT_42=116;
	public static final int INT_43=117;
	public static final int INT_44=118;
	public static final int INT_45=119;
	public static final int INT_46=120;
	public static final int INT_47=121;
	public static final int INT_48=122;
	public static final int INT_49=123;
	public static final int INT_5=124;
	public static final int INT_50=125;
	public static final int INT_51=126;
	public static final int INT_52=127;
	public static final int INT_53=128;
	public static final int INT_54=129;
	public static final int INT_55=130;
	public static final int INT_56=131;
	public static final int INT_57=132;
	public static final int INT_58=133;
	public static final int INT_59=134;
	public static final int INT_6=135;
	public static final int INT_60=136;
	public static final int INT_61=137;
	public static final int INT_62=138;
	public static final int INT_63=139;
	public static final int INT_64=140;
	public static final int INT_65=141;
	public static final int INT_66=142;
	public static final int INT_67=143;
	public static final int INT_68=144;
	public static final int INT_69=145;
	public static final int INT_7=146;
	public static final int INT_70=147;
	public static final int INT_71=148;
	public static final int INT_72=149;
	public static final int INT_73=150;
	public static final int INT_74=151;
	public static final int INT_75=152;
	public static final int INT_76=153;
	public static final int INT_77=154;
	public static final int INT_78=155;
	public static final int INT_79=156;
	public static final int INT_8=157;
	public static final int INT_80=158;
	public static final int INT_81=159;
	public static final int INT_82=160;
	public static final int INT_83=161;
	public static final int INT_84=162;
	public static final int INT_85=163;
	public static final int INT_86=164;
	public static final int INT_87=165;
	public static final int INT_88=166;
	public static final int INT_89=167;
	public static final int INT_9=168;
	public static final int INT_90=169;
	public static final int INT_91=170;
	public static final int INT_92=171;
	public static final int INT_93=172;
	public static final int INT_94=173;
	public static final int INT_95=174;
	public static final int INT_96=175;
	public static final int INT_97=176;
	public static final int INT_98=177;
	public static final int INT_99=178;
	public static final int JANUARY=179;
	public static final int JULY=180;
	public static final int JUNE=181;
	public static final int KWANZAA=182;
	public static final int LABOR=183;
	public static final int LAST=184;
	public static final int MARCH=185;
	public static final int MAY=186;
	public static final int MEMORIAL=187;
	public static final int MIDNIGHT=188;
	public static final int MILITARY_HOUR_SUFFIX=189;
	public static final int MINUTE=190;
	public static final int MLK=191;
	public static final int MONDAY=192;
	public static final int MONTH=193;
	public static final int MORNING=194;
	public static final int MOTHER=195;
	public static final int MST=196;
	public static final int ND=197;
	public static final int NEW=198;
	public static final int NEXT=199;
	public static final int NIGHT=200;
	public static final int NINE=201;
	public static final int NINETEEN=202;
	public static final int NINETEENTH=203;
	public static final int NINTH=204;
	public static final int NOON=205;
	public static final int NOVEMBER=206;
	public static final int NOW=207;
	public static final int OCTOBER=208;
	public static final int OF=209;
	public static final int ON=210;
	public static final int ONE=211;
	public static final int OR=212;
	public static final int PALM=213;
	public static final int PAST=214;
	public static final int PATRICK=215;
	public static final int PATRIOT=216;
	public static final int PLUS=217;
	public static final int PM=218;
	public static final int PRESIDENT=219;
	public static final int PST=220;
	public static final int RD=221;
	public static final int SAINT=222;
	public static final int SATURDAY=223;
	public static final int SECOND=224;
	public static final int SEPTEMBER=225;
	public static final int SEVEN=226;
	public static final int SEVENTEEN=227;
	public static final int SEVENTEENTH=228;
	public static final int SEVENTH=229;
	public static final int SINGLE_QUOTE=230;
	public static final int SIX=231;
	public static final int SIXTEEN=232;
	public static final int SIXTEENTH=233;
	public static final int SIXTH=234;
	public static final int SLASH=235;
	public static final int SPACE=236;
	public static final int SPRING=237;
	public static final int ST=238;
	public static final int START=239;
	public static final int SUMMER=240;
	public static final int SUNDAY=241;
	public static final int T=242;
	public static final int TAX=243;
	public static final int TEN=244;
	public static final int TENTH=245;
	public static final int TH=246;
	public static final int THANKSGIVING=247;
	public static final int THAT=248;
	public static final int THE=249;
	public static final int THIRD=250;
	public static final int THIRTEEN=251;
	public static final int THIRTEENTH=252;
	public static final int THIRTIETH=253;
	public static final int THIRTY=254;
	public static final int THIS=255;
	public static final int THREE=256;
	public static final int THROUGH=257;
	public static final int THURSDAY=258;
	public static final int TO=259;
	public static final int TODAY=260;
	public static final int TOMORROW=261;
	public static final int TONIGHT=262;
	public static final int TUESDAY=263;
	public static final int TWELFTH=264;
	public static final int TWELVE=265;
	public static final int TWENTIETH=266;
	public static final int TWENTY=267;
	public static final int TWO=268;
	public static final int UNKNOWN=269;
	public static final int UNKNOWN_CHAR=270;
	public static final int UNTIL=271;
	public static final int UPCOMING=272;
	public static final int UTC=273;
	public static final int VALENTINE=274;
	public static final int VETERAN=275;
	public static final int WEDNESDAY=276;
	public static final int WEEK=277;
	public static final int WHITE_SPACE=278;
	public static final int WINTER=279;
	public static final int YEAR=280;
	public static final int YESTERDAY=281;
	public static final int AM_PM=282;
	public static final int DATE_TIME=284;
	public static final int DATE_TIME_ALTERNATIVE=285;
	public static final int DAY_OF_MONTH=286;
	public static final int DAY_OF_WEEK=287;
	public static final int DAY_OF_YEAR=288;
	public static final int DIRECTION=289;
	public static final int EXPLICIT_DATE=296;
	public static final int EXPLICIT_SEEK=297;
	public static final int EXPLICIT_TIME=298;
	public static final int HOLIDAY=308;
	public static final int HOURS_OF_DAY=309;
	public static final int INT=310;
	public static final int MINUTES_OF_HOUR=421;
	public static final int MONTH_OF_YEAR=422;
	public static final int RECURRENCE=430;
	public static final int RELATIVE_DATE=431;
	public static final int RELATIVE_TIME=432;
	public static final int SEASON=433;
	public static final int SECONDS_OF_MINUTE=435;
	public static final int SEEK=436;
	public static final int SEEK_BY=437;
	public static final int SPAN=446;
	public static final int YEAR_OF=463;
	public static final int ZONE=464;
	public static final int ZONE_OFFSET=465;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public TreeRewrite(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public TreeRewrite(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return TreeRewrite.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g"; }


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
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:32:1: topdown : ( ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN amt= INT span= SPAN ) -> ^( SEEK DIRECTION SEEK_BY $amt $span) | ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) ) -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) ) );
	@Override
	public final TreeRewrite.topdown_return topdown() throws RecognitionException {
		TreeRewrite.topdown_return retval = new TreeRewrite.topdown_return();
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:33:3: ( ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) ) -> ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) ) | ^( SEEK DIRECTION SEEK_BY INT SPAN amt= INT span= SPAN ) -> ^( SEEK DIRECTION SEEK_BY $amt $span) | ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) ) -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) ) )
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:33:5: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK INT ) ^( DAY_OF_WEEK dow= INT ) )
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
					// elements: SEEK, DAY_OF_WEEK, INT, DIRECTION, SEEK_BY, dow
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:34:10: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_WEEK $dow) )
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:34:39: ^( DAY_OF_WEEK $dow)
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:36:5: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH INT ) ^( DAY_OF_MONTH dow= INT ) )
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
					// elements: SEEK_BY, DIRECTION, SEEK, INT, dow, DAY_OF_MONTH
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:37:10: ^( SEEK DIRECTION SEEK_BY INT ^( DAY_OF_MONTH $dow) )
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:37:39: ^( DAY_OF_MONTH $dow)
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:39:5: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) ^( MONTH_OF_YEAR dow= INT ) )
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
					// elements: dow, SEEK, SEEK_BY, DIRECTION, INT, MONTH_OF_YEAR
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:40:10: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR $dow) )
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:40:39: ^( MONTH_OF_YEAR $dow)
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:42:5: ^( SEEK DIRECTION SEEK_BY INT ^( MONTH_OF_YEAR INT ) amount= INT ^( MONTH_OF_YEAR dow= INT ) )
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
					// elements: dow, SEEK, SEEK_BY, amount, MONTH_OF_YEAR, DIRECTION
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:43:10: ^( SEEK DIRECTION SEEK_BY $amount ^( MONTH_OF_YEAR $dow) )
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:43:43: ^( MONTH_OF_YEAR $dow)
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:45:5: ^( SEEK DIRECTION SEEK_BY INT SPAN amt= INT span= SPAN )
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
					// elements: SEEK_BY, DIRECTION, span, SEEK, amt
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
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:46:10: ^( SEEK DIRECTION SEEK_BY $amt $span)
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:49:5: ^( RELATIVE_DATE ^( SEEK dir= DIRECTION seekby= SEEK_BY day= INT ^( MONTH_OF_YEAR month= INT ) ) ^( EXPLICIT_SEEK amount= INT ^( DAY_OF_WEEK dow= INT ) ) ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) )
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
					// elements: SEEK, MONTH_OF_YEAR, EXPLICIT_SEEK, YEAR_OF, day, DAY_OF_WEEK, month, EXPLICIT_SEEK, dow, seekby, RELATIVE_DATE, dir, year, amount
					// token labels: amount, seekby, month, year, dir, day, dow
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
					RewriteRuleNodeStream stream_day=new RewriteRuleNodeStream(adaptor,"token day",day);
					RewriteRuleNodeStream stream_dow=new RewriteRuleNodeStream(adaptor,"token dow",dow);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 54:5: -> ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) )
					{
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:54:8: ^( RELATIVE_DATE ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) ) ^( EXPLICIT_SEEK ^( YEAR_OF $year) ) ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(
						stream_RELATIVE_DATE.nextNode()
						, root_1);
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:54:24: ^( SEEK $dir $seekby $day ^( MONTH_OF_YEAR $month) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_SEEK.nextNode()
						, root_2);
						adaptor.addChild(root_2, stream_dir.nextNode());
						adaptor.addChild(root_2, stream_seekby.nextNode());
						adaptor.addChild(root_2, stream_day.nextNode());
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:54:49: ^( MONTH_OF_YEAR $month)
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

						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:55:8: ^( EXPLICIT_SEEK ^( YEAR_OF $year) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_EXPLICIT_SEEK.nextNode()
						, root_2);
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:55:24: ^( YEAR_OF $year)
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

						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:56:8: ^( EXPLICIT_SEEK $amount ^( DAY_OF_WEEK $dow) )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(
						stream_EXPLICIT_SEEK.nextNode()
						, root_2);
						adaptor.addChild(root_2, stream_amount.nextNode());
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\TreeRewrite.g:56:32: ^( DAY_OF_WEEK $dow)
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
	public static final BitSet FOLLOW_DIRECTION_in_topdown68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_topdown72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown75 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown77 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown81 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown85 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_topdown120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_topdown126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_DAY_OF_MONTH_in_topdown129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DAY_OF_MONTH_in_topdown135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown139 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_topdown174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_topdown180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown183 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown189 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown193 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_topdown228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_topdown234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown237 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown239 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_topdown244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_topdown287 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_topdown293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SPAN_in_topdown295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_topdown299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SPAN_in_topdown303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RELATIVE_DATE_in_topdown337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEEK_in_topdown340 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_topdown344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_topdown348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_topdown352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_topdown355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown359 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_topdown370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_topdown377 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_topdown392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_YEAR_OF_in_topdown395 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_topdown399 = new BitSet(new long[]{0x0000000000000008L});
}
