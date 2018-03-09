// $ANTLR 3.5.2 NumericRulesFR.g 2018-03-09 01:56:54

  package org.openhab.ui.habot.nlp.internal.natty.generated.fr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DateParserFR_NumericRulesFR extends DebugParser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public DateParserFR gDateParserFR;
	public DateParserFR gParent;


	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, true, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false
	};

	public int getRuleLevel() { return gDateParserFR.getRuleLevel(); }
	public void incRuleLevel() { gDateParserFR.incRuleLevel(); }
	public void decRuleLevel() { gDateParserFR.decRuleLevel(); }
	public DateParserFR_NumericRulesFR(TokenStream input, DebugEventListener dbg, RecognizerSharedState state, DateParserFR gDateParserFR) {
		super(input, dbg, state);
		this.gDateParserFR = gDateParserFR;
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = (DebugTreeAdaptor)adaptor; // delegator sends dbg adaptor
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return DateParserFR.tokenNames; }
	@Override public String getGrammarFileName() { return "NumericRulesFR.g"; }


	public static class int_00_to_59_mandatory_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_00_to_59_mandatory_prefix"
	// NumericRulesFR.g:14:1: int_00_to_59_mandatory_prefix : ( INT_00 | int_01_to_12 | int_13_to_23 | int_24_to_31 | int_32_to_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] ;
	public final DateParserFR_NumericRulesFR.int_00_to_59_mandatory_prefix_return int_00_to_59_mandatory_prefix() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_00_to_59_mandatory_prefix_return retval = new DateParserFR_NumericRulesFR.int_00_to_59_mandatory_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT_001=null;
		ParserRuleReturnScope int_01_to_122 =null;
		ParserRuleReturnScope int_13_to_233 =null;
		ParserRuleReturnScope int_24_to_314 =null;
		ParserRuleReturnScope int_32_to_595 =null;

		Object INT_001_tree=null;
		RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
		RewriteRuleSubtreeStream stream_int_13_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_13_to_23");
		RewriteRuleSubtreeStream stream_int_24_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_24_to_31");
		RewriteRuleSubtreeStream stream_int_32_to_59=new RewriteRuleSubtreeStream(adaptor,"rule int_32_to_59");
		RewriteRuleSubtreeStream stream_int_01_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12");

		try { dbg.enterRule(getGrammarFileName(), "int_00_to_59_mandatory_prefix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// NumericRulesFR.g:15:3: ( ( INT_00 | int_01_to_12 | int_13_to_23 | int_24_to_31 | int_32_to_59 ) -> INT[$int_00_to_59_mandatory_prefix.text] )
			dbg.enterAlt(1);

			// NumericRulesFR.g:15:5: ( INT_00 | int_01_to_12 | int_13_to_23 | int_24_to_31 | int_32_to_59 )
			{
			dbg.location(15,5);
			// NumericRulesFR.g:15:5: ( INT_00 | int_01_to_12 | int_13_to_23 | int_24_to_31 | int_32_to_59 )
			int alt1=5;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			switch ( input.LA(1) ) {
			case INT_00:
				{
				alt1=1;
				}
				break;
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
				{
				alt1=2;
				}
				break;
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
				{
				alt1=3;
				}
				break;
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
				{
				alt1=4;
				}
				break;
			case INT_32:
			case INT_33:
			case INT_34:
			case INT_35:
			case INT_36:
			case INT_37:
			case INT_38:
			case INT_39:
			case INT_40:
			case INT_41:
			case INT_42:
			case INT_43:
			case INT_44:
			case INT_45:
			case INT_46:
			case INT_47:
			case INT_48:
			case INT_49:
			case INT_50:
			case INT_51:
			case INT_52:
			case INT_53:
			case INT_54:
			case INT_55:
			case INT_56:
			case INT_57:
			case INT_58:
			case INT_59:
				{
				alt1=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:15:6: INT_00
					{
					dbg.location(15,6);
					INT_001=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix42); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT_00.add(INT_001);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:16:5: int_01_to_12
					{
					dbg.location(16,5);
					pushFollow(FOLLOW_int_01_to_12_in_int_00_to_59_mandatory_prefix48);
					int_01_to_122=int_01_to_12();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_01_to_12.add(int_01_to_122.getTree());
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// NumericRulesFR.g:17:5: int_13_to_23
					{
					dbg.location(17,5);
					pushFollow(FOLLOW_int_13_to_23_in_int_00_to_59_mandatory_prefix54);
					int_13_to_233=int_13_to_23();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_13_to_23.add(int_13_to_233.getTree());
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// NumericRulesFR.g:18:5: int_24_to_31
					{
					dbg.location(18,5);
					pushFollow(FOLLOW_int_24_to_31_in_int_00_to_59_mandatory_prefix60);
					int_24_to_314=int_24_to_31();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_24_to_31.add(int_24_to_314.getTree());
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// NumericRulesFR.g:19:5: int_32_to_59
					{
					dbg.location(19,5);
					pushFollow(FOLLOW_int_32_to_59_in_int_00_to_59_mandatory_prefix66);
					int_32_to_595=int_32_to_59();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_32_to_59.add(int_32_to_595.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 19:19: -> INT[$int_00_to_59_mandatory_prefix.text]
			{
				dbg.location(19,22);
				adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_00_to_59_mandatory_prefix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_00_to_59_mandatory_prefix"


	public static class int_00_to_99_mandatory_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_00_to_99_mandatory_prefix"
	// NumericRulesFR.g:23:1: int_00_to_99_mandatory_prefix : ( int_00_to_59_mandatory_prefix | int_60_to_99 ) -> INT[$int_00_to_99_mandatory_prefix.text] ;
	public final DateParserFR_NumericRulesFR.int_00_to_99_mandatory_prefix_return int_00_to_99_mandatory_prefix() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_00_to_99_mandatory_prefix_return retval = new DateParserFR_NumericRulesFR.int_00_to_99_mandatory_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope int_00_to_59_mandatory_prefix6 =null;
		ParserRuleReturnScope int_60_to_997 =null;

		RewriteRuleSubtreeStream stream_int_60_to_99=new RewriteRuleSubtreeStream(adaptor,"rule int_60_to_99");
		RewriteRuleSubtreeStream stream_int_00_to_59_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_59_mandatory_prefix");

		try { dbg.enterRule(getGrammarFileName(), "int_00_to_99_mandatory_prefix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// NumericRulesFR.g:24:3: ( ( int_00_to_59_mandatory_prefix | int_60_to_99 ) -> INT[$int_00_to_99_mandatory_prefix.text] )
			dbg.enterAlt(1);

			// NumericRulesFR.g:24:5: ( int_00_to_59_mandatory_prefix | int_60_to_99 )
			{
			dbg.location(24,5);
			// NumericRulesFR.g:24:5: ( int_00_to_59_mandatory_prefix | int_60_to_99 )
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= INT_00 && LA2_0 <= INT_09)||(LA2_0 >= INT_10 && LA2_0 <= INT_19)||(LA2_0 >= INT_20 && LA2_0 <= INT_29)||(LA2_0 >= INT_30 && LA2_0 <= INT_39)||(LA2_0 >= INT_40 && LA2_0 <= INT_49)||(LA2_0 >= INT_50 && LA2_0 <= INT_59)) ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= INT_60 && LA2_0 <= INT_69)||(LA2_0 >= INT_70 && LA2_0 <= INT_79)||(LA2_0 >= INT_80 && LA2_0 <= INT_89)||(LA2_0 >= INT_90 && LA2_0 <= INT_99)) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:24:6: int_00_to_59_mandatory_prefix
					{
					dbg.location(24,6);
					pushFollow(FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix89);
					int_00_to_59_mandatory_prefix6=int_00_to_59_mandatory_prefix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_00_to_59_mandatory_prefix.add(int_00_to_59_mandatory_prefix6.getTree());
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:24:38: int_60_to_99
					{
					dbg.location(24,38);
					pushFollow(FOLLOW_int_60_to_99_in_int_00_to_99_mandatory_prefix93);
					int_60_to_997=int_60_to_99();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_60_to_99.add(int_60_to_997.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 25:5: -> INT[$int_00_to_99_mandatory_prefix.text]
			{
				dbg.location(25,8);
				adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(26, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_00_to_99_mandatory_prefix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_00_to_99_mandatory_prefix"


	public static class int_01_to_12_optional_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_01_to_12_optional_prefix"
	// NumericRulesFR.g:29:1: int_01_to_12_optional_prefix : ( int_1_to_9 | int_01_to_12 ) -> INT[$int_01_to_12_optional_prefix.text] ;
	public final DateParserFR_NumericRulesFR.int_01_to_12_optional_prefix_return int_01_to_12_optional_prefix() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_01_to_12_optional_prefix_return retval = new DateParserFR_NumericRulesFR.int_01_to_12_optional_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope int_1_to_98 =null;
		ParserRuleReturnScope int_01_to_129 =null;

		RewriteRuleSubtreeStream stream_int_1_to_9=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_9");
		RewriteRuleSubtreeStream stream_int_01_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12");

		try { dbg.enterRule(getGrammarFileName(), "int_01_to_12_optional_prefix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// NumericRulesFR.g:30:3: ( ( int_1_to_9 | int_01_to_12 ) -> INT[$int_01_to_12_optional_prefix.text] )
			dbg.enterAlt(1);

			// NumericRulesFR.g:30:5: ( int_1_to_9 | int_01_to_12 )
			{
			dbg.location(30,5);
			// NumericRulesFR.g:30:5: ( int_1_to_9 | int_01_to_12 )
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==INT_1||LA3_0==INT_2||LA3_0==INT_3||LA3_0==INT_4||LA3_0==INT_5||LA3_0==INT_6||LA3_0==INT_7||LA3_0==INT_8||LA3_0==INT_9) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= INT_01 && LA3_0 <= INT_09)||(LA3_0 >= INT_10 && LA3_0 <= INT_12)) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:30:6: int_1_to_9
					{
					dbg.location(30,6);
					pushFollow(FOLLOW_int_1_to_9_in_int_01_to_12_optional_prefix120);
					int_1_to_98=int_1_to_9();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_1_to_9.add(int_1_to_98.getTree());
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:30:19: int_01_to_12
					{
					dbg.location(30,19);
					pushFollow(FOLLOW_int_01_to_12_in_int_01_to_12_optional_prefix124);
					int_01_to_129=int_01_to_12();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_01_to_12.add(int_01_to_129.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 30:33: -> INT[$int_01_to_12_optional_prefix.text]
			{
				dbg.location(30,36);
				adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_01_to_12_optional_prefix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_01_to_12_optional_prefix"


	public static class int_00_to_23_optional_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_00_to_23_optional_prefix"
	// NumericRulesFR.g:34:1: int_00_to_23_optional_prefix : ( INT_00 | INT_0 | int_1_to_9 | int_01_to_12 | int_13_to_23 ) -> INT[$int_00_to_23_optional_prefix.text] ;
	public final DateParserFR_NumericRulesFR.int_00_to_23_optional_prefix_return int_00_to_23_optional_prefix() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_00_to_23_optional_prefix_return retval = new DateParserFR_NumericRulesFR.int_00_to_23_optional_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT_0010=null;
		Token INT_011=null;
		ParserRuleReturnScope int_1_to_912 =null;
		ParserRuleReturnScope int_01_to_1213 =null;
		ParserRuleReturnScope int_13_to_2314 =null;

		Object INT_0010_tree=null;
		Object INT_011_tree=null;
		RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
		RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");
		RewriteRuleSubtreeStream stream_int_13_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_13_to_23");
		RewriteRuleSubtreeStream stream_int_1_to_9=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_9");
		RewriteRuleSubtreeStream stream_int_01_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12");

		try { dbg.enterRule(getGrammarFileName(), "int_00_to_23_optional_prefix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// NumericRulesFR.g:35:3: ( ( INT_00 | INT_0 | int_1_to_9 | int_01_to_12 | int_13_to_23 ) -> INT[$int_00_to_23_optional_prefix.text] )
			dbg.enterAlt(1);

			// NumericRulesFR.g:35:5: ( INT_00 | INT_0 | int_1_to_9 | int_01_to_12 | int_13_to_23 )
			{
			dbg.location(35,5);
			// NumericRulesFR.g:35:5: ( INT_00 | INT_0 | int_1_to_9 | int_01_to_12 | int_13_to_23 )
			int alt4=5;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			switch ( input.LA(1) ) {
			case INT_00:
				{
				alt4=1;
				}
				break;
			case INT_0:
				{
				alt4=2;
				}
				break;
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
				{
				alt4=3;
				}
				break;
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
				{
				alt4=4;
				}
				break;
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
				{
				alt4=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:35:6: INT_00
					{
					dbg.location(35,6);
					INT_0010=(Token)match(input,INT_00,FOLLOW_INT_00_in_int_00_to_23_optional_prefix147); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT_00.add(INT_0010);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:36:5: INT_0
					{
					dbg.location(36,5);
					INT_011=(Token)match(input,INT_0,FOLLOW_INT_0_in_int_00_to_23_optional_prefix154); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT_0.add(INT_011);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// NumericRulesFR.g:37:5: int_1_to_9
					{
					dbg.location(37,5);
					pushFollow(FOLLOW_int_1_to_9_in_int_00_to_23_optional_prefix160);
					int_1_to_912=int_1_to_9();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_1_to_9.add(int_1_to_912.getTree());
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// NumericRulesFR.g:38:5: int_01_to_12
					{
					dbg.location(38,5);
					pushFollow(FOLLOW_int_01_to_12_in_int_00_to_23_optional_prefix166);
					int_01_to_1213=int_01_to_12();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_01_to_12.add(int_01_to_1213.getTree());
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// NumericRulesFR.g:39:5: int_13_to_23
					{
					dbg.location(39,5);
					pushFollow(FOLLOW_int_13_to_23_in_int_00_to_23_optional_prefix172);
					int_13_to_2314=int_13_to_23();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_13_to_23.add(int_13_to_2314.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 39:19: -> INT[$int_00_to_23_optional_prefix.text]
			{
				dbg.location(39,22);
				adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(40, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_00_to_23_optional_prefix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_00_to_23_optional_prefix"


	public static class int_01_to_31_optional_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_01_to_31_optional_prefix"
	// NumericRulesFR.g:43:1: int_01_to_31_optional_prefix : ( int_01_to_12 | int_1_to_9 | int_13_to_23 | int_24_to_31 ) -> INT[$int_01_to_31_optional_prefix.text] ;
	public final DateParserFR_NumericRulesFR.int_01_to_31_optional_prefix_return int_01_to_31_optional_prefix() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_01_to_31_optional_prefix_return retval = new DateParserFR_NumericRulesFR.int_01_to_31_optional_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope int_01_to_1215 =null;
		ParserRuleReturnScope int_1_to_916 =null;
		ParserRuleReturnScope int_13_to_2317 =null;
		ParserRuleReturnScope int_24_to_3118 =null;

		RewriteRuleSubtreeStream stream_int_13_to_23=new RewriteRuleSubtreeStream(adaptor,"rule int_13_to_23");
		RewriteRuleSubtreeStream stream_int_24_to_31=new RewriteRuleSubtreeStream(adaptor,"rule int_24_to_31");
		RewriteRuleSubtreeStream stream_int_01_to_12=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_12");
		RewriteRuleSubtreeStream stream_int_1_to_9=new RewriteRuleSubtreeStream(adaptor,"rule int_1_to_9");

		try { dbg.enterRule(getGrammarFileName(), "int_01_to_31_optional_prefix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// NumericRulesFR.g:44:3: ( ( int_01_to_12 | int_1_to_9 | int_13_to_23 | int_24_to_31 ) -> INT[$int_01_to_31_optional_prefix.text] )
			dbg.enterAlt(1);

			// NumericRulesFR.g:44:5: ( int_01_to_12 | int_1_to_9 | int_13_to_23 | int_24_to_31 )
			{
			dbg.location(44,5);
			// NumericRulesFR.g:44:5: ( int_01_to_12 | int_1_to_9 | int_13_to_23 | int_24_to_31 )
			int alt5=4;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case INT_01:
			case INT_02:
			case INT_03:
			case INT_04:
			case INT_05:
			case INT_06:
			case INT_07:
			case INT_08:
			case INT_09:
			case INT_10:
			case INT_11:
			case INT_12:
				{
				alt5=1;
				}
				break;
			case INT_1:
			case INT_2:
			case INT_3:
			case INT_4:
			case INT_5:
			case INT_6:
			case INT_7:
			case INT_8:
			case INT_9:
				{
				alt5=2;
				}
				break;
			case INT_13:
			case INT_14:
			case INT_15:
			case INT_16:
			case INT_17:
			case INT_18:
			case INT_19:
			case INT_20:
			case INT_21:
			case INT_22:
			case INT_23:
				{
				alt5=3;
				}
				break;
			case INT_24:
			case INT_25:
			case INT_26:
			case INT_27:
			case INT_28:
			case INT_29:
			case INT_30:
			case INT_31:
				{
				alt5=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:44:6: int_01_to_12
					{
					dbg.location(44,6);
					pushFollow(FOLLOW_int_01_to_12_in_int_01_to_31_optional_prefix195);
					int_01_to_1215=int_01_to_12();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_01_to_12.add(int_01_to_1215.getTree());
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:45:5: int_1_to_9
					{
					dbg.location(45,5);
					pushFollow(FOLLOW_int_1_to_9_in_int_01_to_31_optional_prefix201);
					int_1_to_916=int_1_to_9();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_1_to_9.add(int_1_to_916.getTree());
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// NumericRulesFR.g:46:5: int_13_to_23
					{
					dbg.location(46,5);
					pushFollow(FOLLOW_int_13_to_23_in_int_01_to_31_optional_prefix207);
					int_13_to_2317=int_13_to_23();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_13_to_23.add(int_13_to_2317.getTree());
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// NumericRulesFR.g:47:5: int_24_to_31
					{
					dbg.location(47,5);
					pushFollow(FOLLOW_int_24_to_31_in_int_01_to_31_optional_prefix213);
					int_24_to_3118=int_24_to_31();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_int_24_to_31.add(int_24_to_3118.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 47:19: -> INT[$int_01_to_31_optional_prefix.text]
			{
				dbg.location(47,22);
				adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(48, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_01_to_31_optional_prefix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_01_to_31_optional_prefix"


	public static class int_four_digits_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_four_digits"
	// NumericRulesFR.g:51:1: int_four_digits : int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] ;
	public final DateParserFR_NumericRulesFR.int_four_digits_return int_four_digits() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_four_digits_return retval = new DateParserFR_NumericRulesFR.int_four_digits_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope int_00_to_99_mandatory_prefix19 =null;
		ParserRuleReturnScope int_00_to_99_mandatory_prefix20 =null;

		RewriteRuleSubtreeStream stream_int_00_to_99_mandatory_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_00_to_99_mandatory_prefix");

		try { dbg.enterRule(getGrammarFileName(), "int_four_digits");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// NumericRulesFR.g:52:3: ( int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix -> INT[$int_four_digits.text] )
			dbg.enterAlt(1);

			// NumericRulesFR.g:52:5: int_00_to_99_mandatory_prefix int_00_to_99_mandatory_prefix
			{
			dbg.location(52,5);
			pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits235);
			int_00_to_99_mandatory_prefix19=int_00_to_99_mandatory_prefix();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix19.getTree());dbg.location(52,35);
			pushFollow(FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits237);
			int_00_to_99_mandatory_prefix20=int_00_to_99_mandatory_prefix();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_int_00_to_99_mandatory_prefix.add(int_00_to_99_mandatory_prefix20.getTree());
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:7: -> INT[$int_four_digits.text]
			{
				dbg.location(53,10);
				adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_four_digits");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_four_digits"


	public static class spelled_or_int_01_to_31_optional_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "spelled_or_int_01_to_31_optional_prefix"
	// NumericRulesFR.g:58:1: spelled_or_int_01_to_31_optional_prefix : ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one );
	public final DateParserFR_NumericRulesFR.spelled_or_int_01_to_31_optional_prefix_return spelled_or_int_01_to_31_optional_prefix() throws RecognitionException {
		DateParserFR_NumericRulesFR.spelled_or_int_01_to_31_optional_prefix_return retval = new DateParserFR_NumericRulesFR.spelled_or_int_01_to_31_optional_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope int_01_to_31_optional_prefix21 =null;
		ParserRuleReturnScope spelled_one_to_thirty_one22 =null;


		try { dbg.enterRule(getGrammarFileName(), "spelled_or_int_01_to_31_optional_prefix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// NumericRulesFR.g:59:3: ( int_01_to_31_optional_prefix | spelled_one_to_thirty_one )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= INT_01 && LA6_0 <= INT_31)||LA6_0==INT_4||LA6_0==INT_5||LA6_0==INT_6||LA6_0==INT_7||LA6_0==INT_8||LA6_0==INT_9) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= EIGHT && LA6_0 <= EIGHTEEN)||LA6_0==ELEVEN||LA6_0==FIFTEEN||LA6_0==FIVE||(LA6_0 >= FOUR && LA6_0 <= FOURTEEN)||(LA6_0 >= NINE && LA6_0 <= NINETEEN)||LA6_0==ONE||(LA6_0 >= SEVEN && LA6_0 <= SEVENTEEN)||(LA6_0 >= SIX && LA6_0 <= SIXTEEN)||LA6_0==TEN||LA6_0==THIRTEEN||LA6_0==THIRTY||LA6_0==THREE||LA6_0==TWELVE||LA6_0==TWENTY||LA6_0==TWO) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:59:5: int_01_to_31_optional_prefix
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(59,5);
					pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix265);
					int_01_to_31_optional_prefix21=int_01_to_31_optional_prefix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, int_01_to_31_optional_prefix21.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:60:5: spelled_one_to_thirty_one
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(60,5);
					pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix271);
					spelled_one_to_thirty_one22=spelled_one_to_thirty_one();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one22.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(61, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "spelled_or_int_01_to_31_optional_prefix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "spelled_or_int_01_to_31_optional_prefix"


	public static class spelled_or_int_optional_prefix_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "spelled_or_int_optional_prefix"
	// NumericRulesFR.g:65:1: spelled_or_int_optional_prefix : ( spelled_one_to_thirty_one | ( ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( INT_0 | INT_00 | int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )? -> INT[$spelled_or_int_optional_prefix.text] ) );
	public final DateParserFR_NumericRulesFR.spelled_or_int_optional_prefix_return spelled_or_int_optional_prefix() throws RecognitionException {
		DateParserFR_NumericRulesFR.spelled_or_int_optional_prefix_return retval = new DateParserFR_NumericRulesFR.spelled_or_int_optional_prefix_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT_027=null;
		Token INT_0028=null;
		ParserRuleReturnScope spelled_one_to_thirty_one23 =null;
		ParserRuleReturnScope int_01_to_31_optional_prefix24 =null;
		ParserRuleReturnScope int_32_to_5925 =null;
		ParserRuleReturnScope int_60_to_9926 =null;
		ParserRuleReturnScope int_01_to_31_optional_prefix29 =null;
		ParserRuleReturnScope int_32_to_5930 =null;
		ParserRuleReturnScope int_60_to_9931 =null;

		Object INT_027_tree=null;
		Object INT_0028_tree=null;
		RewriteRuleTokenStream stream_INT_00=new RewriteRuleTokenStream(adaptor,"token INT_00");
		RewriteRuleTokenStream stream_INT_0=new RewriteRuleTokenStream(adaptor,"token INT_0");
		RewriteRuleSubtreeStream stream_int_60_to_99=new RewriteRuleSubtreeStream(adaptor,"rule int_60_to_99");
		RewriteRuleSubtreeStream stream_int_01_to_31_optional_prefix=new RewriteRuleSubtreeStream(adaptor,"rule int_01_to_31_optional_prefix");
		RewriteRuleSubtreeStream stream_int_32_to_59=new RewriteRuleSubtreeStream(adaptor,"rule int_32_to_59");

		try { dbg.enterRule(getGrammarFileName(), "spelled_or_int_optional_prefix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// NumericRulesFR.g:66:3: ( spelled_one_to_thirty_one | ( ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( INT_0 | INT_00 | int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )? -> INT[$spelled_or_int_optional_prefix.text] ) )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= EIGHT && LA9_0 <= EIGHTEEN)||LA9_0==ELEVEN||LA9_0==FIFTEEN||LA9_0==FIVE||(LA9_0 >= FOUR && LA9_0 <= FOURTEEN)||(LA9_0 >= NINE && LA9_0 <= NINETEEN)||LA9_0==ONE||(LA9_0 >= SEVEN && LA9_0 <= SEVENTEEN)||(LA9_0 >= SIX && LA9_0 <= SIXTEEN)||LA9_0==TEN||LA9_0==THIRTEEN||LA9_0==THIRTY||LA9_0==THREE||LA9_0==TWELVE||LA9_0==TWENTY||LA9_0==TWO) ) {
				alt9=1;
			}
			else if ( ((LA9_0 >= INT_01 && LA9_0 <= INT_99)) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:66:5: spelled_one_to_thirty_one
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(66,5);
					pushFollow(FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_optional_prefix288);
					spelled_one_to_thirty_one23=spelled_one_to_thirty_one();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, spelled_one_to_thirty_one23.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:67:5: ( ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( INT_0 | INT_00 | int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )? -> INT[$spelled_or_int_optional_prefix.text] )
					{
					dbg.location(67,5);
					// NumericRulesFR.g:67:5: ( ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( INT_0 | INT_00 | int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )? -> INT[$spelled_or_int_optional_prefix.text] )
					dbg.enterAlt(1);

					// NumericRulesFR.g:67:6: ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 ) ( INT_0 | INT_00 | int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )?
					{
					dbg.location(67,6);
					// NumericRulesFR.g:67:6: ( int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )
					int alt7=3;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					switch ( input.LA(1) ) {
					case INT_01:
					case INT_02:
					case INT_03:
					case INT_04:
					case INT_05:
					case INT_06:
					case INT_07:
					case INT_08:
					case INT_09:
					case INT_1:
					case INT_10:
					case INT_11:
					case INT_12:
					case INT_13:
					case INT_14:
					case INT_15:
					case INT_16:
					case INT_17:
					case INT_18:
					case INT_19:
					case INT_2:
					case INT_20:
					case INT_21:
					case INT_22:
					case INT_23:
					case INT_24:
					case INT_25:
					case INT_26:
					case INT_27:
					case INT_28:
					case INT_29:
					case INT_3:
					case INT_30:
					case INT_31:
					case INT_4:
					case INT_5:
					case INT_6:
					case INT_7:
					case INT_8:
					case INT_9:
						{
						alt7=1;
						}
						break;
					case INT_32:
					case INT_33:
					case INT_34:
					case INT_35:
					case INT_36:
					case INT_37:
					case INT_38:
					case INT_39:
					case INT_40:
					case INT_41:
					case INT_42:
					case INT_43:
					case INT_44:
					case INT_45:
					case INT_46:
					case INT_47:
					case INT_48:
					case INT_49:
					case INT_50:
					case INT_51:
					case INT_52:
					case INT_53:
					case INT_54:
					case INT_55:
					case INT_56:
					case INT_57:
					case INT_58:
					case INT_59:
						{
						alt7=2;
						}
						break;
					case INT_60:
					case INT_61:
					case INT_62:
					case INT_63:
					case INT_64:
					case INT_65:
					case INT_66:
					case INT_67:
					case INT_68:
					case INT_69:
					case INT_70:
					case INT_71:
					case INT_72:
					case INT_73:
					case INT_74:
					case INT_75:
					case INT_76:
					case INT_77:
					case INT_78:
					case INT_79:
					case INT_80:
					case INT_81:
					case INT_82:
					case INT_83:
					case INT_84:
					case INT_85:
					case INT_86:
					case INT_87:
					case INT_88:
					case INT_89:
					case INT_90:
					case INT_91:
					case INT_92:
					case INT_93:
					case INT_94:
					case INT_95:
					case INT_96:
					case INT_97:
					case INT_98:
					case INT_99:
						{
						alt7=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:67:7: int_01_to_31_optional_prefix
							{
							dbg.location(67,7);
							pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_optional_prefix297);
							int_01_to_31_optional_prefix24=int_01_to_31_optional_prefix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix24.getTree());
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:67:38: int_32_to_59
							{
							dbg.location(67,38);
							pushFollow(FOLLOW_int_32_to_59_in_spelled_or_int_optional_prefix301);
							int_32_to_5925=int_32_to_59();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_int_32_to_59.add(int_32_to_5925.getTree());
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// NumericRulesFR.g:67:53: int_60_to_99
							{
							dbg.location(67,53);
							pushFollow(FOLLOW_int_60_to_99_in_spelled_or_int_optional_prefix305);
							int_60_to_9926=int_60_to_99();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_int_60_to_99.add(int_60_to_9926.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(68,6);
					// NumericRulesFR.g:68:6: ( INT_0 | INT_00 | int_01_to_31_optional_prefix | int_32_to_59 | int_60_to_99 )?
					int alt8=6;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					switch ( input.LA(1) ) {
						case INT_0:
							{
							alt8=1;
							}
							break;
						case INT_00:
							{
							alt8=2;
							}
							break;
						case INT_01:
						case INT_02:
						case INT_03:
						case INT_04:
						case INT_05:
						case INT_06:
						case INT_07:
						case INT_08:
						case INT_09:
						case INT_1:
						case INT_10:
						case INT_11:
						case INT_12:
						case INT_13:
						case INT_14:
						case INT_15:
						case INT_16:
						case INT_17:
						case INT_18:
						case INT_19:
						case INT_2:
						case INT_20:
						case INT_21:
						case INT_22:
						case INT_23:
						case INT_24:
						case INT_25:
						case INT_26:
						case INT_27:
						case INT_28:
						case INT_29:
						case INT_3:
						case INT_30:
						case INT_31:
						case INT_4:
						case INT_5:
						case INT_6:
						case INT_7:
						case INT_8:
						case INT_9:
							{
							alt8=3;
							}
							break;
						case INT_32:
						case INT_33:
						case INT_34:
						case INT_35:
						case INT_36:
						case INT_37:
						case INT_38:
						case INT_39:
						case INT_40:
						case INT_41:
						case INT_42:
						case INT_43:
						case INT_44:
						case INT_45:
						case INT_46:
						case INT_47:
						case INT_48:
						case INT_49:
						case INT_50:
						case INT_51:
						case INT_52:
						case INT_53:
						case INT_54:
						case INT_55:
						case INT_56:
						case INT_57:
						case INT_58:
						case INT_59:
							{
							alt8=4;
							}
							break;
						case INT_60:
						case INT_61:
						case INT_62:
						case INT_63:
						case INT_64:
						case INT_65:
						case INT_66:
						case INT_67:
						case INT_68:
						case INT_69:
						case INT_70:
						case INT_71:
						case INT_72:
						case INT_73:
						case INT_74:
						case INT_75:
						case INT_76:
						case INT_77:
						case INT_78:
						case INT_79:
						case INT_80:
						case INT_81:
						case INT_82:
						case INT_83:
						case INT_84:
						case INT_85:
						case INT_86:
						case INT_87:
						case INT_88:
						case INT_89:
						case INT_90:
						case INT_91:
						case INT_92:
						case INT_93:
						case INT_94:
						case INT_95:
						case INT_96:
						case INT_97:
						case INT_98:
						case INT_99:
							{
							alt8=5;
							}
							break;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:68:8: INT_0
							{
							dbg.location(68,8);
							INT_027=(Token)match(input,INT_0,FOLLOW_INT_0_in_spelled_or_int_optional_prefix315); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_0.add(INT_027);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:68:16: INT_00
							{
							dbg.location(68,16);
							INT_0028=(Token)match(input,INT_00,FOLLOW_INT_00_in_spelled_or_int_optional_prefix319); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_00.add(INT_0028);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// NumericRulesFR.g:68:25: int_01_to_31_optional_prefix
							{
							dbg.location(68,25);
							pushFollow(FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_optional_prefix323);
							int_01_to_31_optional_prefix29=int_01_to_31_optional_prefix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_int_01_to_31_optional_prefix.add(int_01_to_31_optional_prefix29.getTree());
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// NumericRulesFR.g:68:56: int_32_to_59
							{
							dbg.location(68,56);
							pushFollow(FOLLOW_int_32_to_59_in_spelled_or_int_optional_prefix327);
							int_32_to_5930=int_32_to_59();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_int_32_to_59.add(int_32_to_5930.getTree());
							}
							break;
						case 5 :
							dbg.enterAlt(5);

							// NumericRulesFR.g:68:71: int_60_to_99
							{
							dbg.location(68,71);
							pushFollow(FOLLOW_int_60_to_99_in_spelled_or_int_optional_prefix331);
							int_60_to_9931=int_60_to_99();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_int_60_to_99.add(int_60_to_9931.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(8);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 70:8: -> INT[$spelled_or_int_optional_prefix.text]
					{
						dbg.location(70,11);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, input.toString(retval.start,input.LT(-1))));
					}


					retval.tree = root_0;
					}

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(71, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "spelled_or_int_optional_prefix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "spelled_or_int_optional_prefix"


	public static class spelled_one_to_thirty_one_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "spelled_one_to_thirty_one"
	// NumericRulesFR.g:74:1: spelled_one_to_thirty_one : ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | ( TWENTY WHITE_SPACE ONE )=> TWENTY WHITE_SPACE ONE -> INT[\"21\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | ( TWENTY WHITE_SPACE TWO )=> TWENTY WHITE_SPACE TWO -> INT[\"22\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | ( TWENTY WHITE_SPACE THREE )=> TWENTY WHITE_SPACE THREE -> INT[\"23\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | ( TWENTY WHITE_SPACE FOUR )=> TWENTY WHITE_SPACE FOUR -> INT[\"24\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | ( TWENTY WHITE_SPACE FIVE )=> TWENTY WHITE_SPACE FIVE -> INT[\"25\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | ( TWENTY WHITE_SPACE SIX )=> TWENTY WHITE_SPACE SIX -> INT[\"26\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | ( TWENTY WHITE_SPACE SEVEN )=> TWENTY WHITE_SPACE SEVEN -> INT[\"27\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | ( TWENTY WHITE_SPACE EIGHT )=> TWENTY WHITE_SPACE EIGHT -> INT[\"28\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | ( TWENTY WHITE_SPACE NINE )=> TWENTY WHITE_SPACE NINE -> INT[\"29\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | TWENTY -> INT[\"20\"] | ( THIRTY WHITE_SPACE ONE )=> THIRTY WHITE_SPACE ONE -> INT[\"31\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] | THIRTY -> INT[\"30\"] );
	public final DateParserFR_NumericRulesFR.spelled_one_to_thirty_one_return spelled_one_to_thirty_one() throws RecognitionException {
		DateParserFR_NumericRulesFR.spelled_one_to_thirty_one_return retval = new DateParserFR_NumericRulesFR.spelled_one_to_thirty_one_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ONE32=null;
		Token TWO33=null;
		Token THREE34=null;
		Token FOUR35=null;
		Token FIVE36=null;
		Token SIX37=null;
		Token SEVEN38=null;
		Token EIGHT39=null;
		Token NINE40=null;
		Token TEN41=null;
		Token ELEVEN42=null;
		Token TWELVE43=null;
		Token THIRTEEN44=null;
		Token FOURTEEN45=null;
		Token FIFTEEN46=null;
		Token SIXTEEN47=null;
		Token SEVENTEEN48=null;
		Token EIGHTEEN49=null;
		Token NINETEEN50=null;
		Token TWENTY51=null;
		Token WHITE_SPACE52=null;
		Token ONE53=null;
		Token TWENTY54=null;
		Token DASH55=null;
		Token ONE56=null;
		Token TWENTY57=null;
		Token WHITE_SPACE58=null;
		Token TWO59=null;
		Token TWENTY60=null;
		Token DASH61=null;
		Token TWO62=null;
		Token TWENTY63=null;
		Token WHITE_SPACE64=null;
		Token THREE65=null;
		Token TWENTY66=null;
		Token DASH67=null;
		Token THREE68=null;
		Token TWENTY69=null;
		Token WHITE_SPACE70=null;
		Token FOUR71=null;
		Token TWENTY72=null;
		Token DASH73=null;
		Token FOUR74=null;
		Token TWENTY75=null;
		Token WHITE_SPACE76=null;
		Token FIVE77=null;
		Token TWENTY78=null;
		Token DASH79=null;
		Token FIVE80=null;
		Token TWENTY81=null;
		Token WHITE_SPACE82=null;
		Token SIX83=null;
		Token TWENTY84=null;
		Token DASH85=null;
		Token SIX86=null;
		Token TWENTY87=null;
		Token WHITE_SPACE88=null;
		Token SEVEN89=null;
		Token TWENTY90=null;
		Token DASH91=null;
		Token SEVEN92=null;
		Token TWENTY93=null;
		Token WHITE_SPACE94=null;
		Token EIGHT95=null;
		Token TWENTY96=null;
		Token DASH97=null;
		Token EIGHT98=null;
		Token TWENTY99=null;
		Token WHITE_SPACE100=null;
		Token NINE101=null;
		Token TWENTY102=null;
		Token DASH103=null;
		Token NINE104=null;
		Token TWENTY105=null;
		Token THIRTY106=null;
		Token WHITE_SPACE107=null;
		Token ONE108=null;
		Token THIRTY109=null;
		Token DASH110=null;
		Token ONE111=null;
		Token THIRTY112=null;

		Object ONE32_tree=null;
		Object TWO33_tree=null;
		Object THREE34_tree=null;
		Object FOUR35_tree=null;
		Object FIVE36_tree=null;
		Object SIX37_tree=null;
		Object SEVEN38_tree=null;
		Object EIGHT39_tree=null;
		Object NINE40_tree=null;
		Object TEN41_tree=null;
		Object ELEVEN42_tree=null;
		Object TWELVE43_tree=null;
		Object THIRTEEN44_tree=null;
		Object FOURTEEN45_tree=null;
		Object FIFTEEN46_tree=null;
		Object SIXTEEN47_tree=null;
		Object SEVENTEEN48_tree=null;
		Object EIGHTEEN49_tree=null;
		Object NINETEEN50_tree=null;
		Object TWENTY51_tree=null;
		Object WHITE_SPACE52_tree=null;
		Object ONE53_tree=null;
		Object TWENTY54_tree=null;
		Object DASH55_tree=null;
		Object ONE56_tree=null;
		Object TWENTY57_tree=null;
		Object WHITE_SPACE58_tree=null;
		Object TWO59_tree=null;
		Object TWENTY60_tree=null;
		Object DASH61_tree=null;
		Object TWO62_tree=null;
		Object TWENTY63_tree=null;
		Object WHITE_SPACE64_tree=null;
		Object THREE65_tree=null;
		Object TWENTY66_tree=null;
		Object DASH67_tree=null;
		Object THREE68_tree=null;
		Object TWENTY69_tree=null;
		Object WHITE_SPACE70_tree=null;
		Object FOUR71_tree=null;
		Object TWENTY72_tree=null;
		Object DASH73_tree=null;
		Object FOUR74_tree=null;
		Object TWENTY75_tree=null;
		Object WHITE_SPACE76_tree=null;
		Object FIVE77_tree=null;
		Object TWENTY78_tree=null;
		Object DASH79_tree=null;
		Object FIVE80_tree=null;
		Object TWENTY81_tree=null;
		Object WHITE_SPACE82_tree=null;
		Object SIX83_tree=null;
		Object TWENTY84_tree=null;
		Object DASH85_tree=null;
		Object SIX86_tree=null;
		Object TWENTY87_tree=null;
		Object WHITE_SPACE88_tree=null;
		Object SEVEN89_tree=null;
		Object TWENTY90_tree=null;
		Object DASH91_tree=null;
		Object SEVEN92_tree=null;
		Object TWENTY93_tree=null;
		Object WHITE_SPACE94_tree=null;
		Object EIGHT95_tree=null;
		Object TWENTY96_tree=null;
		Object DASH97_tree=null;
		Object EIGHT98_tree=null;
		Object TWENTY99_tree=null;
		Object WHITE_SPACE100_tree=null;
		Object NINE101_tree=null;
		Object TWENTY102_tree=null;
		Object DASH103_tree=null;
		Object NINE104_tree=null;
		Object TWENTY105_tree=null;
		Object THIRTY106_tree=null;
		Object WHITE_SPACE107_tree=null;
		Object ONE108_tree=null;
		Object THIRTY109_tree=null;
		Object DASH110_tree=null;
		Object ONE111_tree=null;
		Object THIRTY112_tree=null;
		RewriteRuleTokenStream stream_EIGHT=new RewriteRuleTokenStream(adaptor,"token EIGHT");
		RewriteRuleTokenStream stream_EIGHTEEN=new RewriteRuleTokenStream(adaptor,"token EIGHTEEN");
		RewriteRuleTokenStream stream_SIX=new RewriteRuleTokenStream(adaptor,"token SIX");
		RewriteRuleTokenStream stream_ONE=new RewriteRuleTokenStream(adaptor,"token ONE");
		RewriteRuleTokenStream stream_FOUR=new RewriteRuleTokenStream(adaptor,"token FOUR");
		RewriteRuleTokenStream stream_THIRTEEN=new RewriteRuleTokenStream(adaptor,"token THIRTEEN");
		RewriteRuleTokenStream stream_SIXTEEN=new RewriteRuleTokenStream(adaptor,"token SIXTEEN");
		RewriteRuleTokenStream stream_TWO=new RewriteRuleTokenStream(adaptor,"token TWO");
		RewriteRuleTokenStream stream_DASH=new RewriteRuleTokenStream(adaptor,"token DASH");
		RewriteRuleTokenStream stream_SEVENTEEN=new RewriteRuleTokenStream(adaptor,"token SEVENTEEN");
		RewriteRuleTokenStream stream_ELEVEN=new RewriteRuleTokenStream(adaptor,"token ELEVEN");
		RewriteRuleTokenStream stream_TWENTY=new RewriteRuleTokenStream(adaptor,"token TWENTY");
		RewriteRuleTokenStream stream_FIVE=new RewriteRuleTokenStream(adaptor,"token FIVE");
		RewriteRuleTokenStream stream_THIRTY=new RewriteRuleTokenStream(adaptor,"token THIRTY");
		RewriteRuleTokenStream stream_FOURTEEN=new RewriteRuleTokenStream(adaptor,"token FOURTEEN");
		RewriteRuleTokenStream stream_NINE=new RewriteRuleTokenStream(adaptor,"token NINE");
		RewriteRuleTokenStream stream_TWELVE=new RewriteRuleTokenStream(adaptor,"token TWELVE");
		RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
		RewriteRuleTokenStream stream_FIFTEEN=new RewriteRuleTokenStream(adaptor,"token FIFTEEN");
		RewriteRuleTokenStream stream_TEN=new RewriteRuleTokenStream(adaptor,"token TEN");
		RewriteRuleTokenStream stream_NINETEEN=new RewriteRuleTokenStream(adaptor,"token NINETEEN");
		RewriteRuleTokenStream stream_THREE=new RewriteRuleTokenStream(adaptor,"token THREE");
		RewriteRuleTokenStream stream_SEVEN=new RewriteRuleTokenStream(adaptor,"token SEVEN");

		try { dbg.enterRule(getGrammarFileName(), "spelled_one_to_thirty_one");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// NumericRulesFR.g:75:3: ( ONE -> INT[\"1\"] | TWO -> INT[\"2\"] | THREE -> INT[\"3\"] | FOUR -> INT[\"4\"] | FIVE -> INT[\"5\"] | SIX -> INT[\"6\"] | SEVEN -> INT[\"7\"] | EIGHT -> INT[\"8\"] | NINE -> INT[\"9\"] | TEN -> INT[\"10\"] | ELEVEN -> INT[\"11\"] | TWELVE -> INT[\"12\"] | THIRTEEN -> INT[\"13\"] | FOURTEEN -> INT[\"14\"] | FIFTEEN -> INT[\"15\"] | SIXTEEN -> INT[\"16\"] | SEVENTEEN -> INT[\"17\"] | EIGHTEEN -> INT[\"18\"] | NINETEEN -> INT[\"19\"] | ( TWENTY WHITE_SPACE ONE )=> TWENTY WHITE_SPACE ONE -> INT[\"21\"] | TWENTY ( DASH )? ONE -> INT[\"21\"] | ( TWENTY WHITE_SPACE TWO )=> TWENTY WHITE_SPACE TWO -> INT[\"22\"] | TWENTY ( DASH )? TWO -> INT[\"22\"] | ( TWENTY WHITE_SPACE THREE )=> TWENTY WHITE_SPACE THREE -> INT[\"23\"] | TWENTY ( DASH )? THREE -> INT[\"23\"] | ( TWENTY WHITE_SPACE FOUR )=> TWENTY WHITE_SPACE FOUR -> INT[\"24\"] | TWENTY ( DASH )? FOUR -> INT[\"24\"] | ( TWENTY WHITE_SPACE FIVE )=> TWENTY WHITE_SPACE FIVE -> INT[\"25\"] | TWENTY ( DASH )? FIVE -> INT[\"25\"] | ( TWENTY WHITE_SPACE SIX )=> TWENTY WHITE_SPACE SIX -> INT[\"26\"] | TWENTY ( DASH )? SIX -> INT[\"26\"] | ( TWENTY WHITE_SPACE SEVEN )=> TWENTY WHITE_SPACE SEVEN -> INT[\"27\"] | TWENTY ( DASH )? SEVEN -> INT[\"27\"] | ( TWENTY WHITE_SPACE EIGHT )=> TWENTY WHITE_SPACE EIGHT -> INT[\"28\"] | TWENTY ( DASH )? EIGHT -> INT[\"28\"] | ( TWENTY WHITE_SPACE NINE )=> TWENTY WHITE_SPACE NINE -> INT[\"29\"] | TWENTY ( DASH )? NINE -> INT[\"29\"] | TWENTY -> INT[\"20\"] | ( THIRTY WHITE_SPACE ONE )=> THIRTY WHITE_SPACE ONE -> INT[\"31\"] | THIRTY ( DASH )? ONE -> INT[\"31\"] | THIRTY -> INT[\"30\"] )
			int alt20=41;
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			switch ( input.LA(1) ) {
			case ONE:
				{
				alt20=1;
				}
				break;
			case TWO:
				{
				alt20=2;
				}
				break;
			case THREE:
				{
				alt20=3;
				}
				break;
			case FOUR:
				{
				alt20=4;
				}
				break;
			case FIVE:
				{
				alt20=5;
				}
				break;
			case SIX:
				{
				alt20=6;
				}
				break;
			case SEVEN:
				{
				alt20=7;
				}
				break;
			case EIGHT:
				{
				alt20=8;
				}
				break;
			case NINE:
				{
				alt20=9;
				}
				break;
			case TEN:
				{
				alt20=10;
				}
				break;
			case ELEVEN:
				{
				alt20=11;
				}
				break;
			case TWELVE:
				{
				alt20=12;
				}
				break;
			case THIRTEEN:
				{
				alt20=13;
				}
				break;
			case FOURTEEN:
				{
				alt20=14;
				}
				break;
			case FIFTEEN:
				{
				alt20=15;
				}
				break;
			case SIXTEEN:
				{
				alt20=16;
				}
				break;
			case SEVENTEEN:
				{
				alt20=17;
				}
				break;
			case EIGHTEEN:
				{
				alt20=18;
				}
				break;
			case NINETEEN:
				{
				alt20=19;
				}
				break;
			case TWENTY:
				{
				switch ( input.LA(2) ) {
				case WHITE_SPACE:
					{
					switch ( input.LA(3) ) {
					case ONE:
						{
						int LA20_37 = input.LA(4);
						if ( (synpred1_NumericRulesFR()) ) {
							alt20=20;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case TWO:
						{
						int LA20_38 = input.LA(4);
						if ( (synpred2_NumericRulesFR()) ) {
							alt20=22;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case THREE:
						{
						int LA20_39 = input.LA(4);
						if ( (synpred3_NumericRulesFR()) ) {
							alt20=24;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case FOUR:
						{
						int LA20_40 = input.LA(4);
						if ( (synpred4_NumericRulesFR()) ) {
							alt20=26;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case FIVE:
						{
						int LA20_41 = input.LA(4);
						if ( (synpred5_NumericRulesFR()) ) {
							alt20=28;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case SIX:
						{
						int LA20_42 = input.LA(4);
						if ( (synpred6_NumericRulesFR()) ) {
							alt20=30;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case SEVEN:
						{
						int LA20_43 = input.LA(4);
						if ( (synpred7_NumericRulesFR()) ) {
							alt20=32;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case EIGHT:
						{
						int LA20_44 = input.LA(4);
						if ( (synpred8_NumericRulesFR()) ) {
							alt20=34;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case NINE:
						{
						int LA20_45 = input.LA(4);
						if ( (synpred9_NumericRulesFR()) ) {
							alt20=36;
						}
						else if ( (true) ) {
							alt20=38;
						}

						}
						break;
					case AND:
					case APRIL:
					case AT:
					case AUGUST:
					case BLACK:
					case CHRISTMAS:
					case COLUMBUS:
					case COMING:
					case COMMA:
					case CURRENT:
					case DASH:
					case DAY:
					case DECEMBER:
					case EARTH:
					case EASTER:
					case EIGHTEEN:
					case ELECTION:
					case ELEVEN:
					case EVENING:
					case FALL:
					case FATHER:
					case FEBRUARY:
					case FIFTEEN:
					case FLAG:
					case FOURTEEN:
					case FRIDAY:
					case GOOD:
					case GROUNDHOG:
					case HALLOWEEN:
					case HOUR:
					case IN:
					case INAUGURATION:
					case INDEPENDENCE:
					case INT_0:
					case INT_00:
					case INT_01:
					case INT_02:
					case INT_03:
					case INT_04:
					case INT_05:
					case INT_06:
					case INT_07:
					case INT_08:
					case INT_09:
					case INT_1:
					case INT_10:
					case INT_11:
					case INT_12:
					case INT_13:
					case INT_14:
					case INT_15:
					case INT_16:
					case INT_17:
					case INT_18:
					case INT_19:
					case INT_2:
					case INT_20:
					case INT_21:
					case INT_22:
					case INT_23:
					case INT_24:
					case INT_25:
					case INT_26:
					case INT_27:
					case INT_28:
					case INT_29:
					case INT_3:
					case INT_30:
					case INT_31:
					case INT_32:
					case INT_33:
					case INT_34:
					case INT_35:
					case INT_36:
					case INT_37:
					case INT_38:
					case INT_39:
					case INT_4:
					case INT_40:
					case INT_41:
					case INT_42:
					case INT_43:
					case INT_44:
					case INT_45:
					case INT_46:
					case INT_47:
					case INT_48:
					case INT_49:
					case INT_5:
					case INT_50:
					case INT_51:
					case INT_52:
					case INT_53:
					case INT_54:
					case INT_55:
					case INT_56:
					case INT_57:
					case INT_58:
					case INT_59:
					case INT_6:
					case INT_60:
					case INT_61:
					case INT_62:
					case INT_63:
					case INT_64:
					case INT_65:
					case INT_66:
					case INT_67:
					case INT_68:
					case INT_69:
					case INT_7:
					case INT_70:
					case INT_71:
					case INT_72:
					case INT_73:
					case INT_74:
					case INT_75:
					case INT_76:
					case INT_77:
					case INT_78:
					case INT_79:
					case INT_8:
					case INT_80:
					case INT_81:
					case INT_82:
					case INT_83:
					case INT_84:
					case INT_85:
					case INT_86:
					case INT_87:
					case INT_88:
					case INT_89:
					case INT_9:
					case INT_90:
					case INT_91:
					case INT_92:
					case INT_93:
					case INT_94:
					case INT_95:
					case INT_96:
					case INT_97:
					case INT_98:
					case INT_99:
					case JANUARY:
					case JULY:
					case JUNE:
					case KWANZAA:
					case LABOR:
					case LAST:
					case MARCH:
					case MAY:
					case MEMORIAL:
					case MIDNIGHT:
					case MINUTE:
					case MLK:
					case MONDAY:
					case MONTH:
					case MORNING:
					case MOTHER:
					case NEW:
					case NEXT:
					case NIGHT:
					case NINETEEN:
					case NOON:
					case NOVEMBER:
					case OCTOBER:
					case OF:
					case OR:
					case PATRIOT:
					case PRESIDENT:
					case SAINT:
					case SATURDAY:
					case SECOND:
					case SEPTEMBER:
					case SEVENTEEN:
					case SINGLE_QUOTE:
					case SIXTEEN:
					case SPRING:
					case ST:
					case SUMMER:
					case SUNDAY:
					case TAX:
					case TEN:
					case THANKSGIVING:
					case THIRTEEN:
					case THIRTY:
					case THIS:
					case THURSDAY:
					case TONIGHT:
					case TUESDAY:
					case TWELVE:
					case TWENTY:
					case UNTIL:
					case UPCOMING:
					case VALENTINE:
					case VETERAN:
					case WEDNESDAY:
					case WEEK:
					case WINTER:
					case YEAR:
					case AUTUMN:
					case PAST:
					case THE:
					case THROUGH:
					case TO:
						{
						alt20=38;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 22, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case DASH:
					{
					switch ( input.LA(3) ) {
					case ONE:
						{
						alt20=21;
						}
						break;
					case TWO:
						{
						alt20=23;
						}
						break;
					case THREE:
						{
						alt20=25;
						}
						break;
					case FOUR:
						{
						alt20=27;
						}
						break;
					case FIVE:
						{
						alt20=29;
						}
						break;
					case SIX:
						{
						alt20=31;
						}
						break;
					case SEVEN:
						{
						alt20=33;
						}
						break;
					case EIGHT:
						{
						alt20=35;
						}
						break;
					case NINE:
						{
						alt20=37;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 23, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case ONE:
					{
					alt20=21;
					}
					break;
				case TWO:
					{
					alt20=23;
					}
					break;
				case THREE:
					{
					alt20=25;
					}
					break;
				case FOUR:
					{
					alt20=27;
					}
					break;
				case FIVE:
					{
					alt20=29;
					}
					break;
				case SIX:
					{
					alt20=31;
					}
					break;
				case SEVEN:
					{
					alt20=33;
					}
					break;
				case EIGHT:
					{
					alt20=35;
					}
					break;
				case NINE:
					{
					alt20=37;
					}
					break;
				case EOF:
				case COMMA:
				case T:
					{
					alt20=38;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 20, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case THIRTY:
				{
				switch ( input.LA(2) ) {
				case WHITE_SPACE:
					{
					int LA20_34 = input.LA(3);
					if ( (LA20_34==ONE) ) {
						int LA20_46 = input.LA(4);
						if ( (synpred10_NumericRulesFR()) ) {
							alt20=39;
						}
						else if ( (true) ) {
							alt20=41;
						}

					}
					else if ( ((LA20_34 >= AND && LA20_34 <= AUGUST)||(LA20_34 >= BLACK && LA20_34 <= CHRISTMAS)||(LA20_34 >= COLUMBUS && LA20_34 <= DECEMBER)||(LA20_34 >= EARTH && LA20_34 <= EIGHTEEN)||(LA20_34 >= ELECTION && LA20_34 <= ELEVEN)||LA20_34==EVENING||(LA20_34 >= FALL && LA20_34 <= FIFTEEN)||(LA20_34 >= FIVE && LA20_34 <= FLAG)||(LA20_34 >= FOUR && LA20_34 <= FOURTEEN)||LA20_34==FRIDAY||LA20_34==GOOD||(LA20_34 >= GROUNDHOG && LA20_34 <= HALLOWEEN)||(LA20_34 >= HOUR && LA20_34 <= NINETEEN)||(LA20_34 >= NOON && LA20_34 <= NOVEMBER)||(LA20_34 >= OCTOBER && LA20_34 <= OF)||LA20_34==OR||LA20_34==PATRIOT||LA20_34==PRESIDENT||(LA20_34 >= SAINT && LA20_34 <= SEVENTEEN)||(LA20_34 >= SINGLE_QUOTE && LA20_34 <= SIXTEEN)||(LA20_34 >= SPRING && LA20_34 <= ST)||(LA20_34 >= SUMMER && LA20_34 <= SUNDAY)||(LA20_34 >= TAX && LA20_34 <= TEN)||LA20_34==THANKSGIVING||LA20_34==THIRTEEN||LA20_34==THIRTY||(LA20_34 >= THIS && LA20_34 <= THURSDAY)||(LA20_34 >= TONIGHT && LA20_34 <= TUESDAY)||LA20_34==TWELVE||LA20_34==TWENTY||LA20_34==TWO||(LA20_34 >= UNTIL && LA20_34 <= WEEK)||(LA20_34 >= WINTER && LA20_34 <= YEAR)||LA20_34==AUTUMN||LA20_34==PAST||LA20_34==THE||(LA20_34 >= THROUGH && LA20_34 <= TO)) ) {
						alt20=41;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 34, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case DASH:
				case ONE:
					{
					alt20=40;
					}
					break;
				case EOF:
				case COMMA:
				case T:
					{
					alt20=41;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 21, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:75:5: ONE
					{
					dbg.location(75,5);
					ONE32=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one368); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ONE.add(ONE32);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 75:16: -> INT[\"1\"]
					{
						dbg.location(75,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:76:5: TWO
					{
					dbg.location(76,5);
					TWO33=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one386); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWO.add(TWO33);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 76:16: -> INT[\"2\"]
					{
						dbg.location(76,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// NumericRulesFR.g:77:5: THREE
					{
					dbg.location(77,5);
					THREE34=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one404); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THREE.add(THREE34);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:16: -> INT[\"3\"]
					{
						dbg.location(77,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// NumericRulesFR.g:78:5: FOUR
					{
					dbg.location(78,5);
					FOUR35=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one420); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOUR.add(FOUR35);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:16: -> INT[\"4\"]
					{
						dbg.location(78,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// NumericRulesFR.g:79:5: FIVE
					{
					dbg.location(79,5);
					FIVE36=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one437); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIVE.add(FIVE36);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 79:16: -> INT[\"5\"]
					{
						dbg.location(79,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// NumericRulesFR.g:80:5: SIX
					{
					dbg.location(80,5);
					SIX37=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one454); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SIX.add(SIX37);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 80:16: -> INT[\"6\"]
					{
						dbg.location(80,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// NumericRulesFR.g:81:5: SEVEN
					{
					dbg.location(81,5);
					SEVEN38=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one472); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN38);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 81:16: -> INT[\"7\"]
					{
						dbg.location(81,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// NumericRulesFR.g:82:5: EIGHT
					{
					dbg.location(82,5);
					EIGHT39=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one488); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT39);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:16: -> INT[\"8\"]
					{
						dbg.location(82,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// NumericRulesFR.g:83:5: NINE
					{
					dbg.location(83,5);
					NINE40=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one504); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NINE.add(NINE40);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:16: -> INT[\"9\"]
					{
						dbg.location(83,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// NumericRulesFR.g:84:5: TEN
					{
					dbg.location(84,5);
					TEN41=(Token)match(input,TEN,FOLLOW_TEN_in_spelled_one_to_thirty_one521); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TEN.add(TEN41);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:16: -> INT[\"10\"]
					{
						dbg.location(84,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// NumericRulesFR.g:85:5: ELEVEN
					{
					dbg.location(85,5);
					ELEVEN42=(Token)match(input,ELEVEN,FOLLOW_ELEVEN_in_spelled_one_to_thirty_one539); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELEVEN.add(ELEVEN42);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 85:16: -> INT[\"11\"]
					{
						dbg.location(85,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// NumericRulesFR.g:86:5: TWELVE
					{
					dbg.location(86,5);
					TWELVE43=(Token)match(input,TWELVE,FOLLOW_TWELVE_in_spelled_one_to_thirty_one554); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWELVE.add(TWELVE43);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 86:16: -> INT[\"12\"]
					{
						dbg.location(86,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// NumericRulesFR.g:87:5: THIRTEEN
					{
					dbg.location(87,5);
					THIRTEEN44=(Token)match(input,THIRTEEN,FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one569); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THIRTEEN.add(THIRTEEN44);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 87:16: -> INT[\"13\"]
					{
						dbg.location(87,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// NumericRulesFR.g:88:5: FOURTEEN
					{
					dbg.location(88,5);
					FOURTEEN45=(Token)match(input,FOURTEEN,FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOURTEEN.add(FOURTEEN45);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 88:16: -> INT[\"14\"]
					{
						dbg.location(88,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 15 :
					dbg.enterAlt(15);

					// NumericRulesFR.g:89:5: FIFTEEN
					{
					dbg.location(89,5);
					FIFTEEN46=(Token)match(input,FIFTEEN,FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one595); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIFTEEN.add(FIFTEEN46);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:16: -> INT[\"15\"]
					{
						dbg.location(89,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 16 :
					dbg.enterAlt(16);

					// NumericRulesFR.g:90:5: SIXTEEN
					{
					dbg.location(90,5);
					SIXTEEN47=(Token)match(input,SIXTEEN,FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one609); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SIXTEEN.add(SIXTEEN47);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 90:16: -> INT[\"16\"]
					{
						dbg.location(90,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 17 :
					dbg.enterAlt(17);

					// NumericRulesFR.g:91:5: SEVENTEEN
					{
					dbg.location(91,5);
					SEVENTEEN48=(Token)match(input,SEVENTEEN,FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one623); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEVENTEEN.add(SEVENTEEN48);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 91:16: -> INT[\"17\"]
					{
						dbg.location(91,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 18 :
					dbg.enterAlt(18);

					// NumericRulesFR.g:92:5: EIGHTEEN
					{
					dbg.location(92,5);
					EIGHTEEN49=(Token)match(input,EIGHTEEN,FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EIGHTEEN.add(EIGHTEEN49);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 92:16: -> INT[\"18\"]
					{
						dbg.location(92,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 19 :
					dbg.enterAlt(19);

					// NumericRulesFR.g:93:5: NINETEEN
					{
					dbg.location(93,5);
					NINETEEN50=(Token)match(input,NINETEEN,FOLLOW_NINETEEN_in_spelled_one_to_thirty_one648); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NINETEEN.add(NINETEEN50);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 93:16: -> INT[\"19\"]
					{
						dbg.location(93,19);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 20 :
					dbg.enterAlt(20);

					// NumericRulesFR.g:94:5: ( TWENTY WHITE_SPACE ONE )=> TWENTY WHITE_SPACE ONE
					{
					dbg.location(94,34);
					TWENTY51=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one672); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY51);
					dbg.location(94,41);
					WHITE_SPACE52=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one674); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE52);
					dbg.location(94,53);
					ONE53=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one676); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ONE.add(ONE53);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:59: -> INT[\"21\"]
					{
						dbg.location(94,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 21 :
					dbg.enterAlt(21);

					// NumericRulesFR.g:95:5: TWENTY ( DASH )? ONE
					{
					dbg.location(95,5);
					TWENTY54=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one689); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY54);
					dbg.location(95,12);
					// NumericRulesFR.g:95:12: ( DASH )?
					int alt10=2;
					try { dbg.enterSubRule(10);
					try { dbg.enterDecision(10, decisionCanBacktrack[10]);

					int LA10_0 = input.LA(1);
					if ( (LA10_0==DASH) ) {
						alt10=1;
					}
					} finally {dbg.exitDecision(10);}

					switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:95:12: DASH
							{
							dbg.location(95,12);
							DASH55=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one691); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH55);

							}
							break;

					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(95,18);
					ONE56=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one694); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ONE.add(ONE56);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 95:59: -> INT[\"21\"]
					{
						dbg.location(95,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 22 :
					dbg.enterAlt(22);

					// NumericRulesFR.g:96:5: ( TWENTY WHITE_SPACE TWO )=> TWENTY WHITE_SPACE TWO
					{
					dbg.location(96,34);
					TWENTY57=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one753); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY57);
					dbg.location(96,41);
					WHITE_SPACE58=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one755); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE58);
					dbg.location(96,53);
					TWO59=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one757); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWO.add(TWO59);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 96:59: -> INT[\"22\"]
					{
						dbg.location(96,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 23 :
					dbg.enterAlt(23);

					// NumericRulesFR.g:97:5: TWENTY ( DASH )? TWO
					{
					dbg.location(97,5);
					TWENTY60=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one770); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY60);
					dbg.location(97,12);
					// NumericRulesFR.g:97:12: ( DASH )?
					int alt11=2;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					int LA11_0 = input.LA(1);
					if ( (LA11_0==DASH) ) {
						alt11=1;
					}
					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:97:12: DASH
							{
							dbg.location(97,12);
							DASH61=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one772); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH61);

							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(97,18);
					TWO62=(Token)match(input,TWO,FOLLOW_TWO_in_spelled_one_to_thirty_one775); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWO.add(TWO62);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 97:59: -> INT[\"22\"]
					{
						dbg.location(97,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 24 :
					dbg.enterAlt(24);

					// NumericRulesFR.g:98:5: ( TWENTY WHITE_SPACE THREE )=> TWENTY WHITE_SPACE THREE
					{
					dbg.location(98,34);
					TWENTY63=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one832); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY63);
					dbg.location(98,41);
					WHITE_SPACE64=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one834); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE64);
					dbg.location(98,53);
					THREE65=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one836); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THREE.add(THREE65);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 98:59: -> INT[\"23\"]
					{
						dbg.location(98,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 25 :
					dbg.enterAlt(25);

					// NumericRulesFR.g:99:5: TWENTY ( DASH )? THREE
					{
					dbg.location(99,5);
					TWENTY66=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one847); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY66);
					dbg.location(99,12);
					// NumericRulesFR.g:99:12: ( DASH )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==DASH) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:99:12: DASH
							{
							dbg.location(99,12);
							DASH67=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one849); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH67);

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(99,18);
					THREE68=(Token)match(input,THREE,FOLLOW_THREE_in_spelled_one_to_thirty_one852); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THREE.add(THREE68);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 99:59: -> INT[\"23\"]
					{
						dbg.location(99,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 26 :
					dbg.enterAlt(26);

					// NumericRulesFR.g:100:5: ( TWENTY WHITE_SPACE FOUR )=> TWENTY WHITE_SPACE FOUR
					{
					dbg.location(100,34);
					TWENTY69=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one908); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY69);
					dbg.location(100,41);
					WHITE_SPACE70=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one910); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE70);
					dbg.location(100,53);
					FOUR71=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one912); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOUR.add(FOUR71);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 100:59: -> INT[\"24\"]
					{
						dbg.location(100,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 27 :
					dbg.enterAlt(27);

					// NumericRulesFR.g:101:5: TWENTY ( DASH )? FOUR
					{
					dbg.location(101,5);
					TWENTY72=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one924); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY72);
					dbg.location(101,12);
					// NumericRulesFR.g:101:12: ( DASH )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==DASH) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:101:12: DASH
							{
							dbg.location(101,12);
							DASH73=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one926); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH73);

							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(101,18);
					FOUR74=(Token)match(input,FOUR,FOLLOW_FOUR_in_spelled_one_to_thirty_one929); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOUR.add(FOUR74);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 101:59: -> INT[\"24\"]
					{
						dbg.location(101,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 28 :
					dbg.enterAlt(28);

					// NumericRulesFR.g:102:5: ( TWENTY WHITE_SPACE FIVE )=> TWENTY WHITE_SPACE FIVE
					{
					dbg.location(102,34);
					TWENTY75=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one986); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY75);
					dbg.location(102,41);
					WHITE_SPACE76=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one988); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE76);
					dbg.location(102,53);
					FIVE77=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one990); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIVE.add(FIVE77);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 102:59: -> INT[\"25\"]
					{
						dbg.location(102,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 29 :
					dbg.enterAlt(29);

					// NumericRulesFR.g:103:5: TWENTY ( DASH )? FIVE
					{
					dbg.location(103,5);
					TWENTY78=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1002); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY78);
					dbg.location(103,12);
					// NumericRulesFR.g:103:12: ( DASH )?
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==DASH) ) {
						alt14=1;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:103:12: DASH
							{
							dbg.location(103,12);
							DASH79=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1004); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH79);

							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(103,18);
					FIVE80=(Token)match(input,FIVE,FOLLOW_FIVE_in_spelled_one_to_thirty_one1007); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIVE.add(FIVE80);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 103:59: -> INT[\"25\"]
					{
						dbg.location(103,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 30 :
					dbg.enterAlt(30);

					// NumericRulesFR.g:104:5: ( TWENTY WHITE_SPACE SIX )=> TWENTY WHITE_SPACE SIX
					{
					dbg.location(104,34);
					TWENTY81=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1065); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY81);
					dbg.location(104,41);
					WHITE_SPACE82=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1067); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE82);
					dbg.location(104,53);
					SIX83=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one1069); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SIX.add(SIX83);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 104:59: -> INT[\"26\"]
					{
						dbg.location(104,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 31 :
					dbg.enterAlt(31);

					// NumericRulesFR.g:105:5: TWENTY ( DASH )? SIX
					{
					dbg.location(105,5);
					TWENTY84=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1082); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY84);
					dbg.location(105,12);
					// NumericRulesFR.g:105:12: ( DASH )?
					int alt15=2;
					try { dbg.enterSubRule(15);
					try { dbg.enterDecision(15, decisionCanBacktrack[15]);

					int LA15_0 = input.LA(1);
					if ( (LA15_0==DASH) ) {
						alt15=1;
					}
					} finally {dbg.exitDecision(15);}

					switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:105:12: DASH
							{
							dbg.location(105,12);
							DASH85=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1084); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH85);

							}
							break;

					}
					} finally {dbg.exitSubRule(15);}
					dbg.location(105,18);
					SIX86=(Token)match(input,SIX,FOLLOW_SIX_in_spelled_one_to_thirty_one1087); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SIX.add(SIX86);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 105:59: -> INT[\"26\"]
					{
						dbg.location(105,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 32 :
					dbg.enterAlt(32);

					// NumericRulesFR.g:106:5: ( TWENTY WHITE_SPACE SEVEN )=> TWENTY WHITE_SPACE SEVEN
					{
					dbg.location(106,34);
					TWENTY87=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1144); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY87);
					dbg.location(106,41);
					WHITE_SPACE88=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1146); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE88);
					dbg.location(106,53);
					SEVEN89=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one1148); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN89);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 106:59: -> INT[\"27\"]
					{
						dbg.location(106,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 33 :
					dbg.enterAlt(33);

					// NumericRulesFR.g:107:5: TWENTY ( DASH )? SEVEN
					{
					dbg.location(107,5);
					TWENTY90=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1159); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY90);
					dbg.location(107,12);
					// NumericRulesFR.g:107:12: ( DASH )?
					int alt16=2;
					try { dbg.enterSubRule(16);
					try { dbg.enterDecision(16, decisionCanBacktrack[16]);

					int LA16_0 = input.LA(1);
					if ( (LA16_0==DASH) ) {
						alt16=1;
					}
					} finally {dbg.exitDecision(16);}

					switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:107:12: DASH
							{
							dbg.location(107,12);
							DASH91=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1161); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH91);

							}
							break;

					}
					} finally {dbg.exitSubRule(16);}
					dbg.location(107,18);
					SEVEN92=(Token)match(input,SEVEN,FOLLOW_SEVEN_in_spelled_one_to_thirty_one1164); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEVEN.add(SEVEN92);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 107:59: -> INT[\"27\"]
					{
						dbg.location(107,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 34 :
					dbg.enterAlt(34);

					// NumericRulesFR.g:108:5: ( TWENTY WHITE_SPACE EIGHT )=> TWENTY WHITE_SPACE EIGHT
					{
					dbg.location(108,34);
					TWENTY93=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1219); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY93);
					dbg.location(108,41);
					WHITE_SPACE94=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1221); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE94);
					dbg.location(108,53);
					EIGHT95=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one1223); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT95);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 108:59: -> INT[\"28\"]
					{
						dbg.location(108,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 35 :
					dbg.enterAlt(35);

					// NumericRulesFR.g:109:5: TWENTY ( DASH )? EIGHT
					{
					dbg.location(109,5);
					TWENTY96=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1234); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY96);
					dbg.location(109,12);
					// NumericRulesFR.g:109:12: ( DASH )?
					int alt17=2;
					try { dbg.enterSubRule(17);
					try { dbg.enterDecision(17, decisionCanBacktrack[17]);

					int LA17_0 = input.LA(1);
					if ( (LA17_0==DASH) ) {
						alt17=1;
					}
					} finally {dbg.exitDecision(17);}

					switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:109:12: DASH
							{
							dbg.location(109,12);
							DASH97=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1236); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH97);

							}
							break;

					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(109,18);
					EIGHT98=(Token)match(input,EIGHT,FOLLOW_EIGHT_in_spelled_one_to_thirty_one1239); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EIGHT.add(EIGHT98);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 109:59: -> INT[\"28\"]
					{
						dbg.location(109,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 36 :
					dbg.enterAlt(36);

					// NumericRulesFR.g:110:5: ( TWENTY WHITE_SPACE NINE )=> TWENTY WHITE_SPACE NINE
					{
					dbg.location(110,34);
					TWENTY99=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1295); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY99);
					dbg.location(110,41);
					WHITE_SPACE100=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1297); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE100);
					dbg.location(110,53);
					NINE101=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one1299); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NINE.add(NINE101);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 110:59: -> INT[\"29\"]
					{
						dbg.location(110,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 37 :
					dbg.enterAlt(37);

					// NumericRulesFR.g:111:5: TWENTY ( DASH )? NINE
					{
					dbg.location(111,5);
					TWENTY102=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1311); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY102);
					dbg.location(111,12);
					// NumericRulesFR.g:111:12: ( DASH )?
					int alt18=2;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					int LA18_0 = input.LA(1);
					if ( (LA18_0==DASH) ) {
						alt18=1;
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:111:12: DASH
							{
							dbg.location(111,12);
							DASH103=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1313); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH103);

							}
							break;

					}
					} finally {dbg.exitSubRule(18);}
					dbg.location(111,18);
					NINE104=(Token)match(input,NINE,FOLLOW_NINE_in_spelled_one_to_thirty_one1316); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NINE.add(NINE104);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 111:59: -> INT[\"29\"]
					{
						dbg.location(111,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 38 :
					dbg.enterAlt(38);

					// NumericRulesFR.g:112:5: TWENTY
					{
					dbg.location(112,5);
					TWENTY105=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_one_to_thirty_one1363); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY105);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 112:59: -> INT[\"20\"]
					{
						dbg.location(112,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 39 :
					dbg.enterAlt(39);

					// NumericRulesFR.g:113:5: ( THIRTY WHITE_SPACE ONE )=> THIRTY WHITE_SPACE ONE
					{
					dbg.location(113,34);
					THIRTY106=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one1432); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY106);
					dbg.location(113,41);
					WHITE_SPACE107=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1434); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE107);
					dbg.location(113,53);
					ONE108=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one1436); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ONE.add(ONE108);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 113:59: -> INT[\"31\"]
					{
						dbg.location(113,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "31"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 40 :
					dbg.enterAlt(40);

					// NumericRulesFR.g:114:5: THIRTY ( DASH )? ONE
					{
					dbg.location(114,5);
					THIRTY109=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one1449); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY109);
					dbg.location(114,12);
					// NumericRulesFR.g:114:12: ( DASH )?
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==DASH) ) {
						alt19=1;
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:114:12: DASH
							{
							dbg.location(114,12);
							DASH110=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_one_to_thirty_one1451); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DASH.add(DASH110);

							}
							break;

					}
					} finally {dbg.exitSubRule(19);}
					dbg.location(114,18);
					ONE111=(Token)match(input,ONE,FOLLOW_ONE_in_spelled_one_to_thirty_one1454); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ONE.add(ONE111);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 114:59: -> INT[\"31\"]
					{
						dbg.location(114,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "31"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 41 :
					dbg.enterAlt(41);

					// NumericRulesFR.g:115:5: THIRTY
					{
					dbg.location(115,5);
					THIRTY112=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_one_to_thirty_one1502); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY112);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 115:59: -> INT[\"30\"]
					{
						dbg.location(115,62);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(116, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "spelled_one_to_thirty_one");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "spelled_one_to_thirty_one"


	public static class spelled_first_to_thirty_first_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "spelled_first_to_thirty_first"
	// NumericRulesFR.g:119:1: spelled_first_to_thirty_first : ( ( FIRST | INT_1 ST ) -> INT[\"1\"] | ( SECOND | INT_2 ND ) -> INT[\"2\"] | ( THIRD | INT_3 RD ) -> INT[\"3\"] | ( FOURTH | INT_4 TH ) -> INT[\"4\"] | ( FIFTH | INT_5 TH ) -> INT[\"5\"] | ( SIXTH | INT_6 TH ) -> INT[\"6\"] | ( SEVENTH | INT_7 TH ) -> INT[\"7\"] | ( EIGHTH | INT_8 TH ) -> INT[\"8\"] | ( NINTH | INT_9 TH ) -> INT[\"9\"] | ( TENTH | INT_10 TH ) -> INT[\"10\"] | ( ELEVENTH | INT_11 TH ) -> INT[\"11\"] | ( TWELFTH | INT_12 TH ) -> INT[\"12\"] | ( THIRTEENTH | INT_13 TH ) -> INT[\"13\"] | ( FOURTEENTH | INT_14 TH ) -> INT[\"14\"] | ( FIFTEENTH | INT_15 TH ) -> INT[\"15\"] | ( SIXTEENTH | INT_16 TH ) -> INT[\"16\"] | ( SEVENTEENTH | INT_17 TH ) -> INT[\"17\"] | ( EIGHTEENTH | INT_18 TH ) -> INT[\"18\"] | ( NINETEENTH | INT_19 TH ) -> INT[\"19\"] | ( TWENTIETH | INT_20 TH ) -> INT[\"20\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST ) -> INT[\"21\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND ) -> INT[\"22\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD ) -> INT[\"23\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH ) -> INT[\"24\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH ) -> INT[\"25\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH ) -> INT[\"26\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH ) -> INT[\"27\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH ) -> INT[\"28\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH ) -> INT[\"29\"] | ( THIRTIETH | INT_30 TH ) -> INT[\"30\"] | ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST ) -> INT[\"31\"] );
	public final DateParserFR_NumericRulesFR.spelled_first_to_thirty_first_return spelled_first_to_thirty_first() throws RecognitionException {
		DateParserFR_NumericRulesFR.spelled_first_to_thirty_first_return retval = new DateParserFR_NumericRulesFR.spelled_first_to_thirty_first_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FIRST113=null;
		Token INT_1114=null;
		Token ST115=null;
		Token SECOND116=null;
		Token INT_2117=null;
		Token ND118=null;
		Token THIRD119=null;
		Token INT_3120=null;
		Token RD121=null;
		Token FOURTH122=null;
		Token INT_4123=null;
		Token TH124=null;
		Token FIFTH125=null;
		Token INT_5126=null;
		Token TH127=null;
		Token SIXTH128=null;
		Token INT_6129=null;
		Token TH130=null;
		Token SEVENTH131=null;
		Token INT_7132=null;
		Token TH133=null;
		Token EIGHTH134=null;
		Token INT_8135=null;
		Token TH136=null;
		Token NINTH137=null;
		Token INT_9138=null;
		Token TH139=null;
		Token TENTH140=null;
		Token INT_10141=null;
		Token TH142=null;
		Token ELEVENTH143=null;
		Token INT_11144=null;
		Token TH145=null;
		Token TWELFTH146=null;
		Token INT_12147=null;
		Token TH148=null;
		Token THIRTEENTH149=null;
		Token INT_13150=null;
		Token TH151=null;
		Token FOURTEENTH152=null;
		Token INT_14153=null;
		Token TH154=null;
		Token FIFTEENTH155=null;
		Token INT_15156=null;
		Token TH157=null;
		Token SIXTEENTH158=null;
		Token INT_16159=null;
		Token TH160=null;
		Token SEVENTEENTH161=null;
		Token INT_17162=null;
		Token TH163=null;
		Token EIGHTEENTH164=null;
		Token INT_18165=null;
		Token TH166=null;
		Token NINETEENTH167=null;
		Token INT_19168=null;
		Token TH169=null;
		Token TWENTIETH170=null;
		Token INT_20171=null;
		Token TH172=null;
		Token TWENTY173=null;
		Token DASH174=null;
		Token WHITE_SPACE175=null;
		Token FIRST176=null;
		Token INT_21177=null;
		Token ST178=null;
		Token TWENTY179=null;
		Token DASH180=null;
		Token WHITE_SPACE181=null;
		Token SECOND182=null;
		Token INT_22183=null;
		Token ND184=null;
		Token TWENTY185=null;
		Token DASH186=null;
		Token WHITE_SPACE187=null;
		Token THIRD188=null;
		Token INT_23189=null;
		Token RD190=null;
		Token TWENTY191=null;
		Token DASH192=null;
		Token WHITE_SPACE193=null;
		Token FOURTH194=null;
		Token INT_24195=null;
		Token TH196=null;
		Token TWENTY197=null;
		Token DASH198=null;
		Token WHITE_SPACE199=null;
		Token FIFTH200=null;
		Token INT_25201=null;
		Token TH202=null;
		Token TWENTY203=null;
		Token DASH204=null;
		Token WHITE_SPACE205=null;
		Token SIXTH206=null;
		Token INT_26207=null;
		Token TH208=null;
		Token TWENTY209=null;
		Token DASH210=null;
		Token WHITE_SPACE211=null;
		Token SEVENTH212=null;
		Token INT_27213=null;
		Token TH214=null;
		Token TWENTY215=null;
		Token DASH216=null;
		Token WHITE_SPACE217=null;
		Token EIGHTH218=null;
		Token INT_28219=null;
		Token TH220=null;
		Token TWENTY221=null;
		Token DASH222=null;
		Token WHITE_SPACE223=null;
		Token NINTH224=null;
		Token INT_29225=null;
		Token TH226=null;
		Token THIRTIETH227=null;
		Token INT_30228=null;
		Token TH229=null;
		Token THIRTY230=null;
		Token DASH231=null;
		Token WHITE_SPACE232=null;
		Token FIRST233=null;
		Token INT_31234=null;
		Token ST235=null;

		Object FIRST113_tree=null;
		Object INT_1114_tree=null;
		Object ST115_tree=null;
		Object SECOND116_tree=null;
		Object INT_2117_tree=null;
		Object ND118_tree=null;
		Object THIRD119_tree=null;
		Object INT_3120_tree=null;
		Object RD121_tree=null;
		Object FOURTH122_tree=null;
		Object INT_4123_tree=null;
		Object TH124_tree=null;
		Object FIFTH125_tree=null;
		Object INT_5126_tree=null;
		Object TH127_tree=null;
		Object SIXTH128_tree=null;
		Object INT_6129_tree=null;
		Object TH130_tree=null;
		Object SEVENTH131_tree=null;
		Object INT_7132_tree=null;
		Object TH133_tree=null;
		Object EIGHTH134_tree=null;
		Object INT_8135_tree=null;
		Object TH136_tree=null;
		Object NINTH137_tree=null;
		Object INT_9138_tree=null;
		Object TH139_tree=null;
		Object TENTH140_tree=null;
		Object INT_10141_tree=null;
		Object TH142_tree=null;
		Object ELEVENTH143_tree=null;
		Object INT_11144_tree=null;
		Object TH145_tree=null;
		Object TWELFTH146_tree=null;
		Object INT_12147_tree=null;
		Object TH148_tree=null;
		Object THIRTEENTH149_tree=null;
		Object INT_13150_tree=null;
		Object TH151_tree=null;
		Object FOURTEENTH152_tree=null;
		Object INT_14153_tree=null;
		Object TH154_tree=null;
		Object FIFTEENTH155_tree=null;
		Object INT_15156_tree=null;
		Object TH157_tree=null;
		Object SIXTEENTH158_tree=null;
		Object INT_16159_tree=null;
		Object TH160_tree=null;
		Object SEVENTEENTH161_tree=null;
		Object INT_17162_tree=null;
		Object TH163_tree=null;
		Object EIGHTEENTH164_tree=null;
		Object INT_18165_tree=null;
		Object TH166_tree=null;
		Object NINETEENTH167_tree=null;
		Object INT_19168_tree=null;
		Object TH169_tree=null;
		Object TWENTIETH170_tree=null;
		Object INT_20171_tree=null;
		Object TH172_tree=null;
		Object TWENTY173_tree=null;
		Object DASH174_tree=null;
		Object WHITE_SPACE175_tree=null;
		Object FIRST176_tree=null;
		Object INT_21177_tree=null;
		Object ST178_tree=null;
		Object TWENTY179_tree=null;
		Object DASH180_tree=null;
		Object WHITE_SPACE181_tree=null;
		Object SECOND182_tree=null;
		Object INT_22183_tree=null;
		Object ND184_tree=null;
		Object TWENTY185_tree=null;
		Object DASH186_tree=null;
		Object WHITE_SPACE187_tree=null;
		Object THIRD188_tree=null;
		Object INT_23189_tree=null;
		Object RD190_tree=null;
		Object TWENTY191_tree=null;
		Object DASH192_tree=null;
		Object WHITE_SPACE193_tree=null;
		Object FOURTH194_tree=null;
		Object INT_24195_tree=null;
		Object TH196_tree=null;
		Object TWENTY197_tree=null;
		Object DASH198_tree=null;
		Object WHITE_SPACE199_tree=null;
		Object FIFTH200_tree=null;
		Object INT_25201_tree=null;
		Object TH202_tree=null;
		Object TWENTY203_tree=null;
		Object DASH204_tree=null;
		Object WHITE_SPACE205_tree=null;
		Object SIXTH206_tree=null;
		Object INT_26207_tree=null;
		Object TH208_tree=null;
		Object TWENTY209_tree=null;
		Object DASH210_tree=null;
		Object WHITE_SPACE211_tree=null;
		Object SEVENTH212_tree=null;
		Object INT_27213_tree=null;
		Object TH214_tree=null;
		Object TWENTY215_tree=null;
		Object DASH216_tree=null;
		Object WHITE_SPACE217_tree=null;
		Object EIGHTH218_tree=null;
		Object INT_28219_tree=null;
		Object TH220_tree=null;
		Object TWENTY221_tree=null;
		Object DASH222_tree=null;
		Object WHITE_SPACE223_tree=null;
		Object NINTH224_tree=null;
		Object INT_29225_tree=null;
		Object TH226_tree=null;
		Object THIRTIETH227_tree=null;
		Object INT_30228_tree=null;
		Object TH229_tree=null;
		Object THIRTY230_tree=null;
		Object DASH231_tree=null;
		Object WHITE_SPACE232_tree=null;
		Object FIRST233_tree=null;
		Object INT_31234_tree=null;
		Object ST235_tree=null;
		RewriteRuleTokenStream stream_SIXTH=new RewriteRuleTokenStream(adaptor,"token SIXTH");
		RewriteRuleTokenStream stream_THIRD=new RewriteRuleTokenStream(adaptor,"token THIRD");
		RewriteRuleTokenStream stream_INT_10=new RewriteRuleTokenStream(adaptor,"token INT_10");
		RewriteRuleTokenStream stream_DASH=new RewriteRuleTokenStream(adaptor,"token DASH");
		RewriteRuleTokenStream stream_FOURTEENTH=new RewriteRuleTokenStream(adaptor,"token FOURTEENTH");
		RewriteRuleTokenStream stream_INT_15=new RewriteRuleTokenStream(adaptor,"token INT_15");
		RewriteRuleTokenStream stream_INT_16=new RewriteRuleTokenStream(adaptor,"token INT_16");
		RewriteRuleTokenStream stream_INT_17=new RewriteRuleTokenStream(adaptor,"token INT_17");
		RewriteRuleTokenStream stream_THIRTY=new RewriteRuleTokenStream(adaptor,"token THIRTY");
		RewriteRuleTokenStream stream_INT_18=new RewriteRuleTokenStream(adaptor,"token INT_18");
		RewriteRuleTokenStream stream_INT_11=new RewriteRuleTokenStream(adaptor,"token INT_11");
		RewriteRuleTokenStream stream_INT_12=new RewriteRuleTokenStream(adaptor,"token INT_12");
		RewriteRuleTokenStream stream_INT_13=new RewriteRuleTokenStream(adaptor,"token INT_13");
		RewriteRuleTokenStream stream_INT_14=new RewriteRuleTokenStream(adaptor,"token INT_14");
		RewriteRuleTokenStream stream_WHITE_SPACE=new RewriteRuleTokenStream(adaptor,"token WHITE_SPACE");
		RewriteRuleTokenStream stream_INT_19=new RewriteRuleTokenStream(adaptor,"token INT_19");
		RewriteRuleTokenStream stream_TWENTIETH=new RewriteRuleTokenStream(adaptor,"token TWENTIETH");
		RewriteRuleTokenStream stream_INT_20=new RewriteRuleTokenStream(adaptor,"token INT_20");
		RewriteRuleTokenStream stream_INT_21=new RewriteRuleTokenStream(adaptor,"token INT_21");
		RewriteRuleTokenStream stream_TWENTY=new RewriteRuleTokenStream(adaptor,"token TWENTY");
		RewriteRuleTokenStream stream_INT_26=new RewriteRuleTokenStream(adaptor,"token INT_26");
		RewriteRuleTokenStream stream_INT_27=new RewriteRuleTokenStream(adaptor,"token INT_27");
		RewriteRuleTokenStream stream_RD=new RewriteRuleTokenStream(adaptor,"token RD");
		RewriteRuleTokenStream stream_INT_28=new RewriteRuleTokenStream(adaptor,"token INT_28");
		RewriteRuleTokenStream stream_INT_29=new RewriteRuleTokenStream(adaptor,"token INT_29");
		RewriteRuleTokenStream stream_INT_22=new RewriteRuleTokenStream(adaptor,"token INT_22");
		RewriteRuleTokenStream stream_INT_23=new RewriteRuleTokenStream(adaptor,"token INT_23");
		RewriteRuleTokenStream stream_ND=new RewriteRuleTokenStream(adaptor,"token ND");
		RewriteRuleTokenStream stream_INT_24=new RewriteRuleTokenStream(adaptor,"token INT_24");
		RewriteRuleTokenStream stream_INT_25=new RewriteRuleTokenStream(adaptor,"token INT_25");
		RewriteRuleTokenStream stream_THIRTEENTH=new RewriteRuleTokenStream(adaptor,"token THIRTEENTH");
		RewriteRuleTokenStream stream_INT_30=new RewriteRuleTokenStream(adaptor,"token INT_30");
		RewriteRuleTokenStream stream_NINTH=new RewriteRuleTokenStream(adaptor,"token NINTH");
		RewriteRuleTokenStream stream_INT_31=new RewriteRuleTokenStream(adaptor,"token INT_31");
		RewriteRuleTokenStream stream_ELEVENTH=new RewriteRuleTokenStream(adaptor,"token ELEVENTH");
		RewriteRuleTokenStream stream_NINETEENTH=new RewriteRuleTokenStream(adaptor,"token NINETEENTH");
		RewriteRuleTokenStream stream_EIGHTEENTH=new RewriteRuleTokenStream(adaptor,"token EIGHTEENTH");
		RewriteRuleTokenStream stream_FIFTEENTH=new RewriteRuleTokenStream(adaptor,"token FIFTEENTH");
		RewriteRuleTokenStream stream_EIGHTH=new RewriteRuleTokenStream(adaptor,"token EIGHTH");
		RewriteRuleTokenStream stream_SIXTEENTH=new RewriteRuleTokenStream(adaptor,"token SIXTEENTH");
		RewriteRuleTokenStream stream_INT_9=new RewriteRuleTokenStream(adaptor,"token INT_9");
		RewriteRuleTokenStream stream_ST=new RewriteRuleTokenStream(adaptor,"token ST");
		RewriteRuleTokenStream stream_SEVENTH=new RewriteRuleTokenStream(adaptor,"token SEVENTH");
		RewriteRuleTokenStream stream_INT_8=new RewriteRuleTokenStream(adaptor,"token INT_8");
		RewriteRuleTokenStream stream_TWELFTH=new RewriteRuleTokenStream(adaptor,"token TWELFTH");
		RewriteRuleTokenStream stream_INT_1=new RewriteRuleTokenStream(adaptor,"token INT_1");
		RewriteRuleTokenStream stream_INT_3=new RewriteRuleTokenStream(adaptor,"token INT_3");
		RewriteRuleTokenStream stream_INT_2=new RewriteRuleTokenStream(adaptor,"token INT_2");
		RewriteRuleTokenStream stream_FIFTH=new RewriteRuleTokenStream(adaptor,"token FIFTH");
		RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");
		RewriteRuleTokenStream stream_INT_5=new RewriteRuleTokenStream(adaptor,"token INT_5");
		RewriteRuleTokenStream stream_INT_4=new RewriteRuleTokenStream(adaptor,"token INT_4");
		RewriteRuleTokenStream stream_FOURTH=new RewriteRuleTokenStream(adaptor,"token FOURTH");
		RewriteRuleTokenStream stream_INT_7=new RewriteRuleTokenStream(adaptor,"token INT_7");
		RewriteRuleTokenStream stream_INT_6=new RewriteRuleTokenStream(adaptor,"token INT_6");
		RewriteRuleTokenStream stream_TENTH=new RewriteRuleTokenStream(adaptor,"token TENTH");
		RewriteRuleTokenStream stream_SEVENTEENTH=new RewriteRuleTokenStream(adaptor,"token SEVENTEENTH");
		RewriteRuleTokenStream stream_TH=new RewriteRuleTokenStream(adaptor,"token TH");
		RewriteRuleTokenStream stream_THIRTIETH=new RewriteRuleTokenStream(adaptor,"token THIRTIETH");
		RewriteRuleTokenStream stream_SECOND=new RewriteRuleTokenStream(adaptor,"token SECOND");

		try { dbg.enterRule(getGrammarFileName(), "spelled_first_to_thirty_first");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(119, 0);

		try {
			// NumericRulesFR.g:120:3: ( ( FIRST | INT_1 ST ) -> INT[\"1\"] | ( SECOND | INT_2 ND ) -> INT[\"2\"] | ( THIRD | INT_3 RD ) -> INT[\"3\"] | ( FOURTH | INT_4 TH ) -> INT[\"4\"] | ( FIFTH | INT_5 TH ) -> INT[\"5\"] | ( SIXTH | INT_6 TH ) -> INT[\"6\"] | ( SEVENTH | INT_7 TH ) -> INT[\"7\"] | ( EIGHTH | INT_8 TH ) -> INT[\"8\"] | ( NINTH | INT_9 TH ) -> INT[\"9\"] | ( TENTH | INT_10 TH ) -> INT[\"10\"] | ( ELEVENTH | INT_11 TH ) -> INT[\"11\"] | ( TWELFTH | INT_12 TH ) -> INT[\"12\"] | ( THIRTEENTH | INT_13 TH ) -> INT[\"13\"] | ( FOURTEENTH | INT_14 TH ) -> INT[\"14\"] | ( FIFTEENTH | INT_15 TH ) -> INT[\"15\"] | ( SIXTEENTH | INT_16 TH ) -> INT[\"16\"] | ( SEVENTEENTH | INT_17 TH ) -> INT[\"17\"] | ( EIGHTEENTH | INT_18 TH ) -> INT[\"18\"] | ( NINETEENTH | INT_19 TH ) -> INT[\"19\"] | ( TWENTIETH | INT_20 TH ) -> INT[\"20\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST ) -> INT[\"21\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND ) -> INT[\"22\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD ) -> INT[\"23\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH ) -> INT[\"24\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH ) -> INT[\"25\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH ) -> INT[\"26\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH ) -> INT[\"27\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH ) -> INT[\"28\"] | ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH ) -> INT[\"29\"] | ( THIRTIETH | INT_30 TH ) -> INT[\"30\"] | ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST ) -> INT[\"31\"] )
			int alt62=31;
			try { dbg.enterDecision(62, decisionCanBacktrack[62]);

			switch ( input.LA(1) ) {
			case FIRST:
			case INT_1:
				{
				alt62=1;
				}
				break;
			case INT_2:
			case SECOND:
				{
				alt62=2;
				}
				break;
			case INT_3:
			case THIRD:
				{
				alt62=3;
				}
				break;
			case FOURTH:
			case INT_4:
				{
				alt62=4;
				}
				break;
			case FIFTH:
			case INT_5:
				{
				alt62=5;
				}
				break;
			case INT_6:
			case SIXTH:
				{
				alt62=6;
				}
				break;
			case INT_7:
			case SEVENTH:
				{
				alt62=7;
				}
				break;
			case EIGHTH:
			case INT_8:
				{
				alt62=8;
				}
				break;
			case INT_9:
			case NINTH:
				{
				alt62=9;
				}
				break;
			case INT_10:
			case TENTH:
				{
				alt62=10;
				}
				break;
			case ELEVENTH:
			case INT_11:
				{
				alt62=11;
				}
				break;
			case INT_12:
			case TWELFTH:
				{
				alt62=12;
				}
				break;
			case INT_13:
			case THIRTEENTH:
				{
				alt62=13;
				}
				break;
			case FOURTEENTH:
			case INT_14:
				{
				alt62=14;
				}
				break;
			case FIFTEENTH:
			case INT_15:
				{
				alt62=15;
				}
				break;
			case INT_16:
			case SIXTEENTH:
				{
				alt62=16;
				}
				break;
			case INT_17:
			case SEVENTEENTH:
				{
				alt62=17;
				}
				break;
			case EIGHTEENTH:
			case INT_18:
				{
				alt62=18;
				}
				break;
			case INT_19:
			case NINETEENTH:
				{
				alt62=19;
				}
				break;
			case INT_20:
			case TWENTIETH:
				{
				alt62=20;
				}
				break;
			case TWENTY:
				{
				switch ( input.LA(2) ) {
				case DASH:
					{
					switch ( input.LA(3) ) {
					case FIRST:
						{
						alt62=21;
						}
						break;
					case SECOND:
						{
						alt62=22;
						}
						break;
					case THIRD:
						{
						alt62=23;
						}
						break;
					case FOURTH:
						{
						alt62=24;
						}
						break;
					case FIFTH:
						{
						alt62=25;
						}
						break;
					case SIXTH:
						{
						alt62=26;
						}
						break;
					case SEVENTH:
						{
						alt62=27;
						}
						break;
					case EIGHTH:
						{
						alt62=28;
						}
						break;
					case NINTH:
						{
						alt62=29;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 62, 33, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case WHITE_SPACE:
					{
					switch ( input.LA(3) ) {
					case FIRST:
						{
						alt62=21;
						}
						break;
					case SECOND:
						{
						alt62=22;
						}
						break;
					case THIRD:
						{
						alt62=23;
						}
						break;
					case FOURTH:
						{
						alt62=24;
						}
						break;
					case FIFTH:
						{
						alt62=25;
						}
						break;
					case SIXTH:
						{
						alt62=26;
						}
						break;
					case SEVENTH:
						{
						alt62=27;
						}
						break;
					case EIGHTH:
						{
						alt62=28;
						}
						break;
					case NINTH:
						{
						alt62=29;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 62, 34, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case FIRST:
					{
					alt62=21;
					}
					break;
				case SECOND:
					{
					alt62=22;
					}
					break;
				case THIRD:
					{
					alt62=23;
					}
					break;
				case FOURTH:
					{
					alt62=24;
					}
					break;
				case FIFTH:
					{
					alt62=25;
					}
					break;
				case SIXTH:
					{
					alt62=26;
					}
					break;
				case SEVENTH:
					{
					alt62=27;
					}
					break;
				case EIGHTH:
					{
					alt62=28;
					}
					break;
				case NINTH:
					{
					alt62=29;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 21, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case INT_21:
				{
				alt62=21;
				}
				break;
			case INT_22:
				{
				alt62=22;
				}
				break;
			case INT_23:
				{
				alt62=23;
				}
				break;
			case INT_24:
				{
				alt62=24;
				}
				break;
			case INT_25:
				{
				alt62=25;
				}
				break;
			case INT_26:
				{
				alt62=26;
				}
				break;
			case INT_27:
				{
				alt62=27;
				}
				break;
			case INT_28:
				{
				alt62=28;
				}
				break;
			case INT_29:
				{
				alt62=29;
				}
				break;
			case INT_30:
			case THIRTIETH:
				{
				alt62=30;
				}
				break;
			case INT_31:
			case THIRTY:
				{
				alt62=31;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(62);}

			switch (alt62) {
				case 1 :
					dbg.enterAlt(1);

					// NumericRulesFR.g:120:5: ( FIRST | INT_1 ST )
					{
					dbg.location(120,5);
					// NumericRulesFR.g:120:5: ( FIRST | INT_1 ST )
					int alt21=2;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					int LA21_0 = input.LA(1);
					if ( (LA21_0==FIRST) ) {
						alt21=1;
					}
					else if ( (LA21_0==INT_1) ) {
						alt21=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:120:6: FIRST
							{
							dbg.location(120,6);
							FIRST113=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first1571); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIRST.add(FIRST113);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:120:20: INT_1 ST
							{
							dbg.location(120,20);
							INT_1114=(Token)match(input,INT_1,FOLLOW_INT_1_in_spelled_first_to_thirty_first1581); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_1.add(INT_1114);
							dbg.location(120,26);
							ST115=(Token)match(input,ST,FOLLOW_ST_in_spelled_first_to_thirty_first1583); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ST.add(ST115);

							}
							break;

					}
					} finally {dbg.exitSubRule(21);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:31: -> INT[\"1\"]
					{
						dbg.location(120,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "1"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// NumericRulesFR.g:121:5: ( SECOND | INT_2 ND )
					{
					dbg.location(121,5);
					// NumericRulesFR.g:121:5: ( SECOND | INT_2 ND )
					int alt22=2;
					try { dbg.enterSubRule(22);
					try { dbg.enterDecision(22, decisionCanBacktrack[22]);

					int LA22_0 = input.LA(1);
					if ( (LA22_0==SECOND) ) {
						alt22=1;
					}
					else if ( (LA22_0==INT_2) ) {
						alt22=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(22);}

					switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:121:6: SECOND
							{
							dbg.location(121,6);
							SECOND116=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first1597); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SECOND.add(SECOND116);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:121:20: INT_2 ND
							{
							dbg.location(121,20);
							INT_2117=(Token)match(input,INT_2,FOLLOW_INT_2_in_spelled_first_to_thirty_first1606); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_2.add(INT_2117);
							dbg.location(121,26);
							ND118=(Token)match(input,ND,FOLLOW_ND_in_spelled_first_to_thirty_first1608); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ND.add(ND118);

							}
							break;

					}
					} finally {dbg.exitSubRule(22);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 121:31: -> INT[\"2\"]
					{
						dbg.location(121,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "2"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// NumericRulesFR.g:122:5: ( THIRD | INT_3 RD )
					{
					dbg.location(122,5);
					// NumericRulesFR.g:122:5: ( THIRD | INT_3 RD )
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( (LA23_0==THIRD) ) {
						alt23=1;
					}
					else if ( (LA23_0==INT_3) ) {
						alt23=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:122:6: THIRD
							{
							dbg.location(122,6);
							THIRD119=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first1622); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_THIRD.add(THIRD119);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:122:20: INT_3 RD
							{
							dbg.location(122,20);
							INT_3120=(Token)match(input,INT_3,FOLLOW_INT_3_in_spelled_first_to_thirty_first1632); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_3.add(INT_3120);
							dbg.location(122,26);
							RD121=(Token)match(input,RD,FOLLOW_RD_in_spelled_first_to_thirty_first1634); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RD.add(RD121);

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 122:31: -> INT[\"3\"]
					{
						dbg.location(122,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "3"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// NumericRulesFR.g:123:5: ( FOURTH | INT_4 TH )
					{
					dbg.location(123,5);
					// NumericRulesFR.g:123:5: ( FOURTH | INT_4 TH )
					int alt24=2;
					try { dbg.enterSubRule(24);
					try { dbg.enterDecision(24, decisionCanBacktrack[24]);

					int LA24_0 = input.LA(1);
					if ( (LA24_0==FOURTH) ) {
						alt24=1;
					}
					else if ( (LA24_0==INT_4) ) {
						alt24=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(24);}

					switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:123:6: FOURTH
							{
							dbg.location(123,6);
							FOURTH122=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first1648); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH122);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:123:20: INT_4 TH
							{
							dbg.location(123,20);
							INT_4123=(Token)match(input,INT_4,FOLLOW_INT_4_in_spelled_first_to_thirty_first1657); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_4.add(INT_4123);
							dbg.location(123,26);
							TH124=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1659); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH124);

							}
							break;

					}
					} finally {dbg.exitSubRule(24);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 123:31: -> INT[\"4\"]
					{
						dbg.location(123,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "4"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// NumericRulesFR.g:124:5: ( FIFTH | INT_5 TH )
					{
					dbg.location(124,5);
					// NumericRulesFR.g:124:5: ( FIFTH | INT_5 TH )
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==FIFTH) ) {
						alt25=1;
					}
					else if ( (LA25_0==INT_5) ) {
						alt25=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:124:6: FIFTH
							{
							dbg.location(124,6);
							FIFTH125=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first1673); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH125);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:124:20: INT_5 TH
							{
							dbg.location(124,20);
							INT_5126=(Token)match(input,INT_5,FOLLOW_INT_5_in_spelled_first_to_thirty_first1683); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_5.add(INT_5126);
							dbg.location(124,26);
							TH127=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1685); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH127);

							}
							break;

					}
					} finally {dbg.exitSubRule(25);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 124:31: -> INT[\"5\"]
					{
						dbg.location(124,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "5"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// NumericRulesFR.g:125:5: ( SIXTH | INT_6 TH )
					{
					dbg.location(125,5);
					// NumericRulesFR.g:125:5: ( SIXTH | INT_6 TH )
					int alt26=2;
					try { dbg.enterSubRule(26);
					try { dbg.enterDecision(26, decisionCanBacktrack[26]);

					int LA26_0 = input.LA(1);
					if ( (LA26_0==SIXTH) ) {
						alt26=1;
					}
					else if ( (LA26_0==INT_6) ) {
						alt26=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(26);}

					switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:125:6: SIXTH
							{
							dbg.location(125,6);
							SIXTH128=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first1699); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH128);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:125:20: INT_6 TH
							{
							dbg.location(125,20);
							INT_6129=(Token)match(input,INT_6,FOLLOW_INT_6_in_spelled_first_to_thirty_first1709); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_6.add(INT_6129);
							dbg.location(125,26);
							TH130=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1711); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH130);

							}
							break;

					}
					} finally {dbg.exitSubRule(26);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 125:31: -> INT[\"6\"]
					{
						dbg.location(125,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "6"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// NumericRulesFR.g:126:5: ( SEVENTH | INT_7 TH )
					{
					dbg.location(126,5);
					// NumericRulesFR.g:126:5: ( SEVENTH | INT_7 TH )
					int alt27=2;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					int LA27_0 = input.LA(1);
					if ( (LA27_0==SEVENTH) ) {
						alt27=1;
					}
					else if ( (LA27_0==INT_7) ) {
						alt27=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:126:6: SEVENTH
							{
							dbg.location(126,6);
							SEVENTH131=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first1725); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH131);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:126:20: INT_7 TH
							{
							dbg.location(126,20);
							INT_7132=(Token)match(input,INT_7,FOLLOW_INT_7_in_spelled_first_to_thirty_first1733); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_7.add(INT_7132);
							dbg.location(126,26);
							TH133=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1735); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH133);

							}
							break;

					}
					} finally {dbg.exitSubRule(27);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 126:31: -> INT[\"7\"]
					{
						dbg.location(126,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "7"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// NumericRulesFR.g:127:5: ( EIGHTH | INT_8 TH )
					{
					dbg.location(127,5);
					// NumericRulesFR.g:127:5: ( EIGHTH | INT_8 TH )
					int alt28=2;
					try { dbg.enterSubRule(28);
					try { dbg.enterDecision(28, decisionCanBacktrack[28]);

					int LA28_0 = input.LA(1);
					if ( (LA28_0==EIGHTH) ) {
						alt28=1;
					}
					else if ( (LA28_0==INT_8) ) {
						alt28=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(28);}

					switch (alt28) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:127:6: EIGHTH
							{
							dbg.location(127,6);
							EIGHTH134=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first1749); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH134);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:127:20: INT_8 TH
							{
							dbg.location(127,20);
							INT_8135=(Token)match(input,INT_8,FOLLOW_INT_8_in_spelled_first_to_thirty_first1758); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_8.add(INT_8135);
							dbg.location(127,26);
							TH136=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1760); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH136);

							}
							break;

					}
					} finally {dbg.exitSubRule(28);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 127:31: -> INT[\"8\"]
					{
						dbg.location(127,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "8"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// NumericRulesFR.g:128:5: ( NINTH | INT_9 TH )
					{
					dbg.location(128,5);
					// NumericRulesFR.g:128:5: ( NINTH | INT_9 TH )
					int alt29=2;
					try { dbg.enterSubRule(29);
					try { dbg.enterDecision(29, decisionCanBacktrack[29]);

					int LA29_0 = input.LA(1);
					if ( (LA29_0==NINTH) ) {
						alt29=1;
					}
					else if ( (LA29_0==INT_9) ) {
						alt29=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(29);}

					switch (alt29) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:128:6: NINTH
							{
							dbg.location(128,6);
							NINTH137=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first1774); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NINTH.add(NINTH137);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:128:20: INT_9 TH
							{
							dbg.location(128,20);
							INT_9138=(Token)match(input,INT_9,FOLLOW_INT_9_in_spelled_first_to_thirty_first1784); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_9.add(INT_9138);
							dbg.location(128,26);
							TH139=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1786); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH139);

							}
							break;

					}
					} finally {dbg.exitSubRule(29);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 128:31: -> INT[\"9\"]
					{
						dbg.location(128,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "9"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// NumericRulesFR.g:129:5: ( TENTH | INT_10 TH )
					{
					dbg.location(129,5);
					// NumericRulesFR.g:129:5: ( TENTH | INT_10 TH )
					int alt30=2;
					try { dbg.enterSubRule(30);
					try { dbg.enterDecision(30, decisionCanBacktrack[30]);

					int LA30_0 = input.LA(1);
					if ( (LA30_0==TENTH) ) {
						alt30=1;
					}
					else if ( (LA30_0==INT_10) ) {
						alt30=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(30);}

					switch (alt30) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:129:6: TENTH
							{
							dbg.location(129,6);
							TENTH140=(Token)match(input,TENTH,FOLLOW_TENTH_in_spelled_first_to_thirty_first1800); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TENTH.add(TENTH140);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:129:20: INT_10 TH
							{
							dbg.location(129,20);
							INT_10141=(Token)match(input,INT_10,FOLLOW_INT_10_in_spelled_first_to_thirty_first1810); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_10.add(INT_10141);
							dbg.location(129,27);
							TH142=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1812); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH142);

							}
							break;

					}
					} finally {dbg.exitSubRule(30);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 129:31: -> INT[\"10\"]
					{
						dbg.location(129,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "10"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// NumericRulesFR.g:130:5: ( ELEVENTH | INT_11 TH )
					{
					dbg.location(130,5);
					// NumericRulesFR.g:130:5: ( ELEVENTH | INT_11 TH )
					int alt31=2;
					try { dbg.enterSubRule(31);
					try { dbg.enterDecision(31, decisionCanBacktrack[31]);

					int LA31_0 = input.LA(1);
					if ( (LA31_0==ELEVENTH) ) {
						alt31=1;
					}
					else if ( (LA31_0==INT_11) ) {
						alt31=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(31);}

					switch (alt31) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:130:6: ELEVENTH
							{
							dbg.location(130,6);
							ELEVENTH143=(Token)match(input,ELEVENTH,FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first1825); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ELEVENTH.add(ELEVENTH143);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:130:20: INT_11 TH
							{
							dbg.location(130,20);
							INT_11144=(Token)match(input,INT_11,FOLLOW_INT_11_in_spelled_first_to_thirty_first1832); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_11.add(INT_11144);
							dbg.location(130,27);
							TH145=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1834); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH145);

							}
							break;

					}
					} finally {dbg.exitSubRule(31);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 130:31: -> INT[\"11\"]
					{
						dbg.location(130,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "11"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// NumericRulesFR.g:131:5: ( TWELFTH | INT_12 TH )
					{
					dbg.location(131,5);
					// NumericRulesFR.g:131:5: ( TWELFTH | INT_12 TH )
					int alt32=2;
					try { dbg.enterSubRule(32);
					try { dbg.enterDecision(32, decisionCanBacktrack[32]);

					int LA32_0 = input.LA(1);
					if ( (LA32_0==TWELFTH) ) {
						alt32=1;
					}
					else if ( (LA32_0==INT_12) ) {
						alt32=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(32);}

					switch (alt32) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:131:6: TWELFTH
							{
							dbg.location(131,6);
							TWELFTH146=(Token)match(input,TWELFTH,FOLLOW_TWELFTH_in_spelled_first_to_thirty_first1847); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWELFTH.add(TWELFTH146);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:131:20: INT_12 TH
							{
							dbg.location(131,20);
							INT_12147=(Token)match(input,INT_12,FOLLOW_INT_12_in_spelled_first_to_thirty_first1855); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_12.add(INT_12147);
							dbg.location(131,27);
							TH148=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1857); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH148);

							}
							break;

					}
					} finally {dbg.exitSubRule(32);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 131:31: -> INT[\"12\"]
					{
						dbg.location(131,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "12"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// NumericRulesFR.g:132:5: ( THIRTEENTH | INT_13 TH )
					{
					dbg.location(132,5);
					// NumericRulesFR.g:132:5: ( THIRTEENTH | INT_13 TH )
					int alt33=2;
					try { dbg.enterSubRule(33);
					try { dbg.enterDecision(33, decisionCanBacktrack[33]);

					int LA33_0 = input.LA(1);
					if ( (LA33_0==THIRTEENTH) ) {
						alt33=1;
					}
					else if ( (LA33_0==INT_13) ) {
						alt33=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(33);}

					switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:132:6: THIRTEENTH
							{
							dbg.location(132,6);
							THIRTEENTH149=(Token)match(input,THIRTEENTH,FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first1870); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_THIRTEENTH.add(THIRTEENTH149);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:132:20: INT_13 TH
							{
							dbg.location(132,20);
							INT_13150=(Token)match(input,INT_13,FOLLOW_INT_13_in_spelled_first_to_thirty_first1875); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_13.add(INT_13150);
							dbg.location(132,27);
							TH151=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1877); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH151);

							}
							break;

					}
					} finally {dbg.exitSubRule(33);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 132:31: -> INT[\"13\"]
					{
						dbg.location(132,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "13"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// NumericRulesFR.g:133:5: ( FOURTEENTH | INT_14 TH )
					{
					dbg.location(133,5);
					// NumericRulesFR.g:133:5: ( FOURTEENTH | INT_14 TH )
					int alt34=2;
					try { dbg.enterSubRule(34);
					try { dbg.enterDecision(34, decisionCanBacktrack[34]);

					int LA34_0 = input.LA(1);
					if ( (LA34_0==FOURTEENTH) ) {
						alt34=1;
					}
					else if ( (LA34_0==INT_14) ) {
						alt34=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(34);}

					switch (alt34) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:133:6: FOURTEENTH
							{
							dbg.location(133,6);
							FOURTEENTH152=(Token)match(input,FOURTEENTH,FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first1890); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FOURTEENTH.add(FOURTEENTH152);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:133:20: INT_14 TH
							{
							dbg.location(133,20);
							INT_14153=(Token)match(input,INT_14,FOLLOW_INT_14_in_spelled_first_to_thirty_first1895); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_14.add(INT_14153);
							dbg.location(133,27);
							TH154=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1897); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH154);

							}
							break;

					}
					} finally {dbg.exitSubRule(34);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:31: -> INT[\"14\"]
					{
						dbg.location(133,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "14"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 15 :
					dbg.enterAlt(15);

					// NumericRulesFR.g:134:5: ( FIFTEENTH | INT_15 TH )
					{
					dbg.location(134,5);
					// NumericRulesFR.g:134:5: ( FIFTEENTH | INT_15 TH )
					int alt35=2;
					try { dbg.enterSubRule(35);
					try { dbg.enterDecision(35, decisionCanBacktrack[35]);

					int LA35_0 = input.LA(1);
					if ( (LA35_0==FIFTEENTH) ) {
						alt35=1;
					}
					else if ( (LA35_0==INT_15) ) {
						alt35=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(35);}

					switch (alt35) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:134:6: FIFTEENTH
							{
							dbg.location(134,6);
							FIFTEENTH155=(Token)match(input,FIFTEENTH,FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first1910); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIFTEENTH.add(FIFTEENTH155);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:134:20: INT_15 TH
							{
							dbg.location(134,20);
							INT_15156=(Token)match(input,INT_15,FOLLOW_INT_15_in_spelled_first_to_thirty_first1916); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_15.add(INT_15156);
							dbg.location(134,27);
							TH157=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1918); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH157);

							}
							break;

					}
					} finally {dbg.exitSubRule(35);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:31: -> INT[\"15\"]
					{
						dbg.location(134,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "15"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 16 :
					dbg.enterAlt(16);

					// NumericRulesFR.g:135:5: ( SIXTEENTH | INT_16 TH )
					{
					dbg.location(135,5);
					// NumericRulesFR.g:135:5: ( SIXTEENTH | INT_16 TH )
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( (LA36_0==SIXTEENTH) ) {
						alt36=1;
					}
					else if ( (LA36_0==INT_16) ) {
						alt36=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:135:6: SIXTEENTH
							{
							dbg.location(135,6);
							SIXTEENTH158=(Token)match(input,SIXTEENTH,FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first1931); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SIXTEENTH.add(SIXTEENTH158);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:135:20: INT_16 TH
							{
							dbg.location(135,20);
							INT_16159=(Token)match(input,INT_16,FOLLOW_INT_16_in_spelled_first_to_thirty_first1937); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_16.add(INT_16159);
							dbg.location(135,27);
							TH160=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1939); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH160);

							}
							break;

					}
					} finally {dbg.exitSubRule(36);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:31: -> INT[\"16\"]
					{
						dbg.location(135,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "16"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 17 :
					dbg.enterAlt(17);

					// NumericRulesFR.g:136:5: ( SEVENTEENTH | INT_17 TH )
					{
					dbg.location(136,5);
					// NumericRulesFR.g:136:5: ( SEVENTEENTH | INT_17 TH )
					int alt37=2;
					try { dbg.enterSubRule(37);
					try { dbg.enterDecision(37, decisionCanBacktrack[37]);

					int LA37_0 = input.LA(1);
					if ( (LA37_0==SEVENTEENTH) ) {
						alt37=1;
					}
					else if ( (LA37_0==INT_17) ) {
						alt37=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(37);}

					switch (alt37) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:136:6: SEVENTEENTH
							{
							dbg.location(136,6);
							SEVENTEENTH161=(Token)match(input,SEVENTEENTH,FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first1952); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEVENTEENTH.add(SEVENTEENTH161);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:136:20: INT_17 TH
							{
							dbg.location(136,20);
							INT_17162=(Token)match(input,INT_17,FOLLOW_INT_17_in_spelled_first_to_thirty_first1956); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_17.add(INT_17162);
							dbg.location(136,27);
							TH163=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1958); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH163);

							}
							break;

					}
					} finally {dbg.exitSubRule(37);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 136:31: -> INT[\"17\"]
					{
						dbg.location(136,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "17"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 18 :
					dbg.enterAlt(18);

					// NumericRulesFR.g:137:5: ( EIGHTEENTH | INT_18 TH )
					{
					dbg.location(137,5);
					// NumericRulesFR.g:137:5: ( EIGHTEENTH | INT_18 TH )
					int alt38=2;
					try { dbg.enterSubRule(38);
					try { dbg.enterDecision(38, decisionCanBacktrack[38]);

					int LA38_0 = input.LA(1);
					if ( (LA38_0==EIGHTEENTH) ) {
						alt38=1;
					}
					else if ( (LA38_0==INT_18) ) {
						alt38=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(38);}

					switch (alt38) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:137:6: EIGHTEENTH
							{
							dbg.location(137,6);
							EIGHTEENTH164=(Token)match(input,EIGHTEENTH,FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first1971); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_EIGHTEENTH.add(EIGHTEENTH164);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:137:20: INT_18 TH
							{
							dbg.location(137,20);
							INT_18165=(Token)match(input,INT_18,FOLLOW_INT_18_in_spelled_first_to_thirty_first1976); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_18.add(INT_18165);
							dbg.location(137,27);
							TH166=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1978); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH166);

							}
							break;

					}
					} finally {dbg.exitSubRule(38);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 137:31: -> INT[\"18\"]
					{
						dbg.location(137,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "18"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 19 :
					dbg.enterAlt(19);

					// NumericRulesFR.g:138:5: ( NINETEENTH | INT_19 TH )
					{
					dbg.location(138,5);
					// NumericRulesFR.g:138:5: ( NINETEENTH | INT_19 TH )
					int alt39=2;
					try { dbg.enterSubRule(39);
					try { dbg.enterDecision(39, decisionCanBacktrack[39]);

					int LA39_0 = input.LA(1);
					if ( (LA39_0==NINETEENTH) ) {
						alt39=1;
					}
					else if ( (LA39_0==INT_19) ) {
						alt39=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(39);}

					switch (alt39) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:138:6: NINETEENTH
							{
							dbg.location(138,6);
							NINETEENTH167=(Token)match(input,NINETEENTH,FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first1991); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NINETEENTH.add(NINETEENTH167);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:138:20: INT_19 TH
							{
							dbg.location(138,20);
							INT_19168=(Token)match(input,INT_19,FOLLOW_INT_19_in_spelled_first_to_thirty_first1996); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_19.add(INT_19168);
							dbg.location(138,27);
							TH169=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first1998); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH169);

							}
							break;

					}
					} finally {dbg.exitSubRule(39);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 138:31: -> INT[\"19\"]
					{
						dbg.location(138,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "19"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 20 :
					dbg.enterAlt(20);

					// NumericRulesFR.g:139:5: ( TWENTIETH | INT_20 TH )
					{
					dbg.location(139,5);
					// NumericRulesFR.g:139:5: ( TWENTIETH | INT_20 TH )
					int alt40=2;
					try { dbg.enterSubRule(40);
					try { dbg.enterDecision(40, decisionCanBacktrack[40]);

					int LA40_0 = input.LA(1);
					if ( (LA40_0==TWENTIETH) ) {
						alt40=1;
					}
					else if ( (LA40_0==INT_20) ) {
						alt40=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(40);}

					switch (alt40) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:139:6: TWENTIETH
							{
							dbg.location(139,6);
							TWENTIETH170=(Token)match(input,TWENTIETH,FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first2011); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTIETH.add(TWENTIETH170);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:139:20: INT_20 TH
							{
							dbg.location(139,20);
							INT_20171=(Token)match(input,INT_20,FOLLOW_INT_20_in_spelled_first_to_thirty_first2017); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_20.add(INT_20171);
							dbg.location(139,27);
							TH172=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2019); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH172);

							}
							break;

					}
					} finally {dbg.exitSubRule(40);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 139:31: -> INT[\"20\"]
					{
						dbg.location(139,34);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "20"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 21 :
					dbg.enterAlt(21);

					// NumericRulesFR.g:140:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST )
					{
					dbg.location(140,5);
					// NumericRulesFR.g:140:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FIRST ) | INT_21 ST )
					int alt42=2;
					try { dbg.enterSubRule(42);
					try { dbg.enterDecision(42, decisionCanBacktrack[42]);

					int LA42_0 = input.LA(1);
					if ( (LA42_0==TWENTY) ) {
						alt42=1;
					}
					else if ( (LA42_0==INT_21) ) {
						alt42=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(42);}

					switch (alt42) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:140:6: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
							{
							dbg.location(140,6);
							// NumericRulesFR.g:140:6: ( TWENTY ( DASH | WHITE_SPACE )? FIRST )
							dbg.enterAlt(1);

							// NumericRulesFR.g:140:7: TWENTY ( DASH | WHITE_SPACE )? FIRST
							{
							dbg.location(140,7);
							TWENTY173=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2033); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY173);
							dbg.location(140,14);
							// NumericRulesFR.g:140:14: ( DASH | WHITE_SPACE )?
							int alt41=3;
							try { dbg.enterSubRule(41);
							try { dbg.enterDecision(41, decisionCanBacktrack[41]);

							int LA41_0 = input.LA(1);
							if ( (LA41_0==DASH) ) {
								alt41=1;
							}
							else if ( (LA41_0==WHITE_SPACE) ) {
								alt41=2;
							}
							} finally {dbg.exitDecision(41);}

							switch (alt41) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:140:15: DASH
									{
									dbg.location(140,15);
									DASH174=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2036); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH174);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:140:22: WHITE_SPACE
									{
									dbg.location(140,22);
									WHITE_SPACE175=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2040); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE175);

									}
									break;

							}
							} finally {dbg.exitSubRule(41);}
							dbg.location(140,36);
							FIRST176=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first2044); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIRST.add(FIRST176);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:140:47: INT_21 ST
							{
							dbg.location(140,47);
							INT_21177=(Token)match(input,INT_21,FOLLOW_INT_21_in_spelled_first_to_thirty_first2051); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_21.add(INT_21177);
							dbg.location(140,54);
							ST178=(Token)match(input,ST,FOLLOW_ST_in_spelled_first_to_thirty_first2053); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ST.add(ST178);

							}
							break;

					}
					} finally {dbg.exitSubRule(42);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:58: -> INT[\"21\"]
					{
						dbg.location(140,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "21"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 22 :
					dbg.enterAlt(22);

					// NumericRulesFR.g:141:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND )
					{
					dbg.location(141,5);
					// NumericRulesFR.g:141:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SECOND ) | INT_22 ND )
					int alt44=2;
					try { dbg.enterSubRule(44);
					try { dbg.enterDecision(44, decisionCanBacktrack[44]);

					int LA44_0 = input.LA(1);
					if ( (LA44_0==TWENTY) ) {
						alt44=1;
					}
					else if ( (LA44_0==INT_22) ) {
						alt44=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(44);}

					switch (alt44) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:141:6: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
							{
							dbg.location(141,6);
							// NumericRulesFR.g:141:6: ( TWENTY ( DASH | WHITE_SPACE )? SECOND )
							dbg.enterAlt(1);

							// NumericRulesFR.g:141:7: TWENTY ( DASH | WHITE_SPACE )? SECOND
							{
							dbg.location(141,7);
							TWENTY179=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2067); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY179);
							dbg.location(141,14);
							// NumericRulesFR.g:141:14: ( DASH | WHITE_SPACE )?
							int alt43=3;
							try { dbg.enterSubRule(43);
							try { dbg.enterDecision(43, decisionCanBacktrack[43]);

							int LA43_0 = input.LA(1);
							if ( (LA43_0==DASH) ) {
								alt43=1;
							}
							else if ( (LA43_0==WHITE_SPACE) ) {
								alt43=2;
							}
							} finally {dbg.exitDecision(43);}

							switch (alt43) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:141:15: DASH
									{
									dbg.location(141,15);
									DASH180=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2070); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH180);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:141:22: WHITE_SPACE
									{
									dbg.location(141,22);
									WHITE_SPACE181=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2074); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE181);

									}
									break;

							}
							} finally {dbg.exitSubRule(43);}
							dbg.location(141,36);
							SECOND182=(Token)match(input,SECOND,FOLLOW_SECOND_in_spelled_first_to_thirty_first2078); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SECOND.add(SECOND182);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:141:47: INT_22 ND
							{
							dbg.location(141,47);
							INT_22183=(Token)match(input,INT_22,FOLLOW_INT_22_in_spelled_first_to_thirty_first2084); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_22.add(INT_22183);
							dbg.location(141,54);
							ND184=(Token)match(input,ND,FOLLOW_ND_in_spelled_first_to_thirty_first2086); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ND.add(ND184);

							}
							break;

					}
					} finally {dbg.exitSubRule(44);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 141:58: -> INT[\"22\"]
					{
						dbg.location(141,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "22"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 23 :
					dbg.enterAlt(23);

					// NumericRulesFR.g:142:5: ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD )
					{
					dbg.location(142,5);
					// NumericRulesFR.g:142:5: ( ( TWENTY ( DASH | WHITE_SPACE )? THIRD ) | INT_23 RD )
					int alt46=2;
					try { dbg.enterSubRule(46);
					try { dbg.enterDecision(46, decisionCanBacktrack[46]);

					int LA46_0 = input.LA(1);
					if ( (LA46_0==TWENTY) ) {
						alt46=1;
					}
					else if ( (LA46_0==INT_23) ) {
						alt46=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 46, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(46);}

					switch (alt46) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:142:6: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
							{
							dbg.location(142,6);
							// NumericRulesFR.g:142:6: ( TWENTY ( DASH | WHITE_SPACE )? THIRD )
							dbg.enterAlt(1);

							// NumericRulesFR.g:142:7: TWENTY ( DASH | WHITE_SPACE )? THIRD
							{
							dbg.location(142,7);
							TWENTY185=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2100); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY185);
							dbg.location(142,14);
							// NumericRulesFR.g:142:14: ( DASH | WHITE_SPACE )?
							int alt45=3;
							try { dbg.enterSubRule(45);
							try { dbg.enterDecision(45, decisionCanBacktrack[45]);

							int LA45_0 = input.LA(1);
							if ( (LA45_0==DASH) ) {
								alt45=1;
							}
							else if ( (LA45_0==WHITE_SPACE) ) {
								alt45=2;
							}
							} finally {dbg.exitDecision(45);}

							switch (alt45) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:142:15: DASH
									{
									dbg.location(142,15);
									DASH186=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2103); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH186);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:142:22: WHITE_SPACE
									{
									dbg.location(142,22);
									WHITE_SPACE187=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2107); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE187);

									}
									break;

							}
							} finally {dbg.exitSubRule(45);}
							dbg.location(142,36);
							THIRD188=(Token)match(input,THIRD,FOLLOW_THIRD_in_spelled_first_to_thirty_first2111); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_THIRD.add(THIRD188);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:142:47: INT_23 RD
							{
							dbg.location(142,47);
							INT_23189=(Token)match(input,INT_23,FOLLOW_INT_23_in_spelled_first_to_thirty_first2118); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_23.add(INT_23189);
							dbg.location(142,54);
							RD190=(Token)match(input,RD,FOLLOW_RD_in_spelled_first_to_thirty_first2120); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RD.add(RD190);

							}
							break;

					}
					} finally {dbg.exitSubRule(46);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 142:58: -> INT[\"23\"]
					{
						dbg.location(142,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "23"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 24 :
					dbg.enterAlt(24);

					// NumericRulesFR.g:143:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH )
					{
					dbg.location(143,5);
					// NumericRulesFR.g:143:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FOURTH ) | INT_24 TH )
					int alt48=2;
					try { dbg.enterSubRule(48);
					try { dbg.enterDecision(48, decisionCanBacktrack[48]);

					int LA48_0 = input.LA(1);
					if ( (LA48_0==TWENTY) ) {
						alt48=1;
					}
					else if ( (LA48_0==INT_24) ) {
						alt48=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(48);}

					switch (alt48) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:143:6: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
							{
							dbg.location(143,6);
							// NumericRulesFR.g:143:6: ( TWENTY ( DASH | WHITE_SPACE )? FOURTH )
							dbg.enterAlt(1);

							// NumericRulesFR.g:143:7: TWENTY ( DASH | WHITE_SPACE )? FOURTH
							{
							dbg.location(143,7);
							TWENTY191=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2134); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY191);
							dbg.location(143,14);
							// NumericRulesFR.g:143:14: ( DASH | WHITE_SPACE )?
							int alt47=3;
							try { dbg.enterSubRule(47);
							try { dbg.enterDecision(47, decisionCanBacktrack[47]);

							int LA47_0 = input.LA(1);
							if ( (LA47_0==DASH) ) {
								alt47=1;
							}
							else if ( (LA47_0==WHITE_SPACE) ) {
								alt47=2;
							}
							} finally {dbg.exitDecision(47);}

							switch (alt47) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:143:15: DASH
									{
									dbg.location(143,15);
									DASH192=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2137); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH192);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:143:22: WHITE_SPACE
									{
									dbg.location(143,22);
									WHITE_SPACE193=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2141); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE193);

									}
									break;

							}
							} finally {dbg.exitSubRule(47);}
							dbg.location(143,36);
							FOURTH194=(Token)match(input,FOURTH,FOLLOW_FOURTH_in_spelled_first_to_thirty_first2145); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FOURTH.add(FOURTH194);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:143:47: INT_24 TH
							{
							dbg.location(143,47);
							INT_24195=(Token)match(input,INT_24,FOLLOW_INT_24_in_spelled_first_to_thirty_first2151); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_24.add(INT_24195);
							dbg.location(143,54);
							TH196=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2153); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH196);

							}
							break;

					}
					} finally {dbg.exitSubRule(48);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 143:58: -> INT[\"24\"]
					{
						dbg.location(143,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "24"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 25 :
					dbg.enterAlt(25);

					// NumericRulesFR.g:144:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH )
					{
					dbg.location(144,5);
					// NumericRulesFR.g:144:5: ( ( TWENTY ( DASH | WHITE_SPACE )? FIFTH ) | INT_25 TH )
					int alt50=2;
					try { dbg.enterSubRule(50);
					try { dbg.enterDecision(50, decisionCanBacktrack[50]);

					int LA50_0 = input.LA(1);
					if ( (LA50_0==TWENTY) ) {
						alt50=1;
					}
					else if ( (LA50_0==INT_25) ) {
						alt50=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(50);}

					switch (alt50) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:144:6: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
							{
							dbg.location(144,6);
							// NumericRulesFR.g:144:6: ( TWENTY ( DASH | WHITE_SPACE )? FIFTH )
							dbg.enterAlt(1);

							// NumericRulesFR.g:144:7: TWENTY ( DASH | WHITE_SPACE )? FIFTH
							{
							dbg.location(144,7);
							TWENTY197=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2167); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY197);
							dbg.location(144,14);
							// NumericRulesFR.g:144:14: ( DASH | WHITE_SPACE )?
							int alt49=3;
							try { dbg.enterSubRule(49);
							try { dbg.enterDecision(49, decisionCanBacktrack[49]);

							int LA49_0 = input.LA(1);
							if ( (LA49_0==DASH) ) {
								alt49=1;
							}
							else if ( (LA49_0==WHITE_SPACE) ) {
								alt49=2;
							}
							} finally {dbg.exitDecision(49);}

							switch (alt49) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:144:15: DASH
									{
									dbg.location(144,15);
									DASH198=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2170); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH198);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:144:22: WHITE_SPACE
									{
									dbg.location(144,22);
									WHITE_SPACE199=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2174); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE199);

									}
									break;

							}
							} finally {dbg.exitSubRule(49);}
							dbg.location(144,36);
							FIFTH200=(Token)match(input,FIFTH,FOLLOW_FIFTH_in_spelled_first_to_thirty_first2178); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIFTH.add(FIFTH200);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:144:47: INT_25 TH
							{
							dbg.location(144,47);
							INT_25201=(Token)match(input,INT_25,FOLLOW_INT_25_in_spelled_first_to_thirty_first2185); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_25.add(INT_25201);
							dbg.location(144,54);
							TH202=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2187); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH202);

							}
							break;

					}
					} finally {dbg.exitSubRule(50);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 144:58: -> INT[\"25\"]
					{
						dbg.location(144,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "25"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 26 :
					dbg.enterAlt(26);

					// NumericRulesFR.g:145:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH )
					{
					dbg.location(145,5);
					// NumericRulesFR.g:145:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SIXTH ) | INT_26 TH )
					int alt52=2;
					try { dbg.enterSubRule(52);
					try { dbg.enterDecision(52, decisionCanBacktrack[52]);

					int LA52_0 = input.LA(1);
					if ( (LA52_0==TWENTY) ) {
						alt52=1;
					}
					else if ( (LA52_0==INT_26) ) {
						alt52=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 52, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(52);}

					switch (alt52) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:145:6: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
							{
							dbg.location(145,6);
							// NumericRulesFR.g:145:6: ( TWENTY ( DASH | WHITE_SPACE )? SIXTH )
							dbg.enterAlt(1);

							// NumericRulesFR.g:145:7: TWENTY ( DASH | WHITE_SPACE )? SIXTH
							{
							dbg.location(145,7);
							TWENTY203=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2201); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY203);
							dbg.location(145,14);
							// NumericRulesFR.g:145:14: ( DASH | WHITE_SPACE )?
							int alt51=3;
							try { dbg.enterSubRule(51);
							try { dbg.enterDecision(51, decisionCanBacktrack[51]);

							int LA51_0 = input.LA(1);
							if ( (LA51_0==DASH) ) {
								alt51=1;
							}
							else if ( (LA51_0==WHITE_SPACE) ) {
								alt51=2;
							}
							} finally {dbg.exitDecision(51);}

							switch (alt51) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:145:15: DASH
									{
									dbg.location(145,15);
									DASH204=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2204); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH204);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:145:22: WHITE_SPACE
									{
									dbg.location(145,22);
									WHITE_SPACE205=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2208); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE205);

									}
									break;

							}
							} finally {dbg.exitSubRule(51);}
							dbg.location(145,36);
							SIXTH206=(Token)match(input,SIXTH,FOLLOW_SIXTH_in_spelled_first_to_thirty_first2212); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SIXTH.add(SIXTH206);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:145:47: INT_26 TH
							{
							dbg.location(145,47);
							INT_26207=(Token)match(input,INT_26,FOLLOW_INT_26_in_spelled_first_to_thirty_first2219); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_26.add(INT_26207);
							dbg.location(145,54);
							TH208=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2221); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH208);

							}
							break;

					}
					} finally {dbg.exitSubRule(52);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 145:58: -> INT[\"26\"]
					{
						dbg.location(145,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "26"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 27 :
					dbg.enterAlt(27);

					// NumericRulesFR.g:146:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH )
					{
					dbg.location(146,5);
					// NumericRulesFR.g:146:5: ( ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH ) | INT_27 TH )
					int alt54=2;
					try { dbg.enterSubRule(54);
					try { dbg.enterDecision(54, decisionCanBacktrack[54]);

					int LA54_0 = input.LA(1);
					if ( (LA54_0==TWENTY) ) {
						alt54=1;
					}
					else if ( (LA54_0==INT_27) ) {
						alt54=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 54, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(54);}

					switch (alt54) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:146:6: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
							{
							dbg.location(146,6);
							// NumericRulesFR.g:146:6: ( TWENTY ( DASH | WHITE_SPACE )? SEVENTH )
							dbg.enterAlt(1);

							// NumericRulesFR.g:146:7: TWENTY ( DASH | WHITE_SPACE )? SEVENTH
							{
							dbg.location(146,7);
							TWENTY209=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2235); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY209);
							dbg.location(146,14);
							// NumericRulesFR.g:146:14: ( DASH | WHITE_SPACE )?
							int alt53=3;
							try { dbg.enterSubRule(53);
							try { dbg.enterDecision(53, decisionCanBacktrack[53]);

							int LA53_0 = input.LA(1);
							if ( (LA53_0==DASH) ) {
								alt53=1;
							}
							else if ( (LA53_0==WHITE_SPACE) ) {
								alt53=2;
							}
							} finally {dbg.exitDecision(53);}

							switch (alt53) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:146:15: DASH
									{
									dbg.location(146,15);
									DASH210=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2238); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH210);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:146:22: WHITE_SPACE
									{
									dbg.location(146,22);
									WHITE_SPACE211=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2242); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE211);

									}
									break;

							}
							} finally {dbg.exitSubRule(53);}
							dbg.location(146,36);
							SEVENTH212=(Token)match(input,SEVENTH,FOLLOW_SEVENTH_in_spelled_first_to_thirty_first2246); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEVENTH.add(SEVENTH212);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:146:47: INT_27 TH
							{
							dbg.location(146,47);
							INT_27213=(Token)match(input,INT_27,FOLLOW_INT_27_in_spelled_first_to_thirty_first2251); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_27.add(INT_27213);
							dbg.location(146,54);
							TH214=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2253); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH214);

							}
							break;

					}
					} finally {dbg.exitSubRule(54);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 146:58: -> INT[\"27\"]
					{
						dbg.location(146,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "27"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 28 :
					dbg.enterAlt(28);

					// NumericRulesFR.g:147:5: ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH )
					{
					dbg.location(147,5);
					// NumericRulesFR.g:147:5: ( ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH ) | INT_28 TH )
					int alt56=2;
					try { dbg.enterSubRule(56);
					try { dbg.enterDecision(56, decisionCanBacktrack[56]);

					int LA56_0 = input.LA(1);
					if ( (LA56_0==TWENTY) ) {
						alt56=1;
					}
					else if ( (LA56_0==INT_28) ) {
						alt56=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 56, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(56);}

					switch (alt56) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:147:6: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
							{
							dbg.location(147,6);
							// NumericRulesFR.g:147:6: ( TWENTY ( DASH | WHITE_SPACE )? EIGHTH )
							dbg.enterAlt(1);

							// NumericRulesFR.g:147:7: TWENTY ( DASH | WHITE_SPACE )? EIGHTH
							{
							dbg.location(147,7);
							TWENTY215=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2267); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY215);
							dbg.location(147,14);
							// NumericRulesFR.g:147:14: ( DASH | WHITE_SPACE )?
							int alt55=3;
							try { dbg.enterSubRule(55);
							try { dbg.enterDecision(55, decisionCanBacktrack[55]);

							int LA55_0 = input.LA(1);
							if ( (LA55_0==DASH) ) {
								alt55=1;
							}
							else if ( (LA55_0==WHITE_SPACE) ) {
								alt55=2;
							}
							} finally {dbg.exitDecision(55);}

							switch (alt55) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:147:15: DASH
									{
									dbg.location(147,15);
									DASH216=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2270); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH216);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:147:22: WHITE_SPACE
									{
									dbg.location(147,22);
									WHITE_SPACE217=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2274); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE217);

									}
									break;

							}
							} finally {dbg.exitSubRule(55);}
							dbg.location(147,36);
							EIGHTH218=(Token)match(input,EIGHTH,FOLLOW_EIGHTH_in_spelled_first_to_thirty_first2278); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_EIGHTH.add(EIGHTH218);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:147:47: INT_28 TH
							{
							dbg.location(147,47);
							INT_28219=(Token)match(input,INT_28,FOLLOW_INT_28_in_spelled_first_to_thirty_first2284); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_28.add(INT_28219);
							dbg.location(147,54);
							TH220=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2286); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH220);

							}
							break;

					}
					} finally {dbg.exitSubRule(56);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 147:58: -> INT[\"28\"]
					{
						dbg.location(147,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "28"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 29 :
					dbg.enterAlt(29);

					// NumericRulesFR.g:148:5: ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH )
					{
					dbg.location(148,5);
					// NumericRulesFR.g:148:5: ( ( TWENTY ( DASH | WHITE_SPACE )? NINTH ) | INT_29 TH )
					int alt58=2;
					try { dbg.enterSubRule(58);
					try { dbg.enterDecision(58, decisionCanBacktrack[58]);

					int LA58_0 = input.LA(1);
					if ( (LA58_0==TWENTY) ) {
						alt58=1;
					}
					else if ( (LA58_0==INT_29) ) {
						alt58=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(58);}

					switch (alt58) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:148:6: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
							{
							dbg.location(148,6);
							// NumericRulesFR.g:148:6: ( TWENTY ( DASH | WHITE_SPACE )? NINTH )
							dbg.enterAlt(1);

							// NumericRulesFR.g:148:7: TWENTY ( DASH | WHITE_SPACE )? NINTH
							{
							dbg.location(148,7);
							TWENTY221=(Token)match(input,TWENTY,FOLLOW_TWENTY_in_spelled_first_to_thirty_first2300); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TWENTY.add(TWENTY221);
							dbg.location(148,14);
							// NumericRulesFR.g:148:14: ( DASH | WHITE_SPACE )?
							int alt57=3;
							try { dbg.enterSubRule(57);
							try { dbg.enterDecision(57, decisionCanBacktrack[57]);

							int LA57_0 = input.LA(1);
							if ( (LA57_0==DASH) ) {
								alt57=1;
							}
							else if ( (LA57_0==WHITE_SPACE) ) {
								alt57=2;
							}
							} finally {dbg.exitDecision(57);}

							switch (alt57) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:148:15: DASH
									{
									dbg.location(148,15);
									DASH222=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2303); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH222);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:148:22: WHITE_SPACE
									{
									dbg.location(148,22);
									WHITE_SPACE223=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2307); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE223);

									}
									break;

							}
							} finally {dbg.exitSubRule(57);}
							dbg.location(148,36);
							NINTH224=(Token)match(input,NINTH,FOLLOW_NINTH_in_spelled_first_to_thirty_first2311); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NINTH.add(NINTH224);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:148:47: INT_29 TH
							{
							dbg.location(148,47);
							INT_29225=(Token)match(input,INT_29,FOLLOW_INT_29_in_spelled_first_to_thirty_first2318); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_29.add(INT_29225);
							dbg.location(148,54);
							TH226=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2320); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH226);

							}
							break;

					}
					} finally {dbg.exitSubRule(58);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 148:58: -> INT[\"29\"]
					{
						dbg.location(148,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "29"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 30 :
					dbg.enterAlt(30);

					// NumericRulesFR.g:149:5: ( THIRTIETH | INT_30 TH )
					{
					dbg.location(149,5);
					// NumericRulesFR.g:149:5: ( THIRTIETH | INT_30 TH )
					int alt59=2;
					try { dbg.enterSubRule(59);
					try { dbg.enterDecision(59, decisionCanBacktrack[59]);

					int LA59_0 = input.LA(1);
					if ( (LA59_0==THIRTIETH) ) {
						alt59=1;
					}
					else if ( (LA59_0==INT_30) ) {
						alt59=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(59);}

					switch (alt59) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:149:6: THIRTIETH
							{
							dbg.location(149,6);
							THIRTIETH227=(Token)match(input,THIRTIETH,FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first2333); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_THIRTIETH.add(THIRTIETH227);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:149:18: INT_30 TH
							{
							dbg.location(149,18);
							INT_30228=(Token)match(input,INT_30,FOLLOW_INT_30_in_spelled_first_to_thirty_first2337); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_30.add(INT_30228);
							dbg.location(149,25);
							TH229=(Token)match(input,TH,FOLLOW_TH_in_spelled_first_to_thirty_first2339); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_TH.add(TH229);

							}
							break;

					}
					} finally {dbg.exitSubRule(59);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 149:58: -> INT[\"30\"]
					{
						dbg.location(149,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "30"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 31 :
					dbg.enterAlt(31);

					// NumericRulesFR.g:150:5: ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST )
					{
					dbg.location(150,5);
					// NumericRulesFR.g:150:5: ( ( THIRTY ( DASH | WHITE_SPACE )? FIRST ) | INT_31 ST )
					int alt61=2;
					try { dbg.enterSubRule(61);
					try { dbg.enterDecision(61, decisionCanBacktrack[61]);

					int LA61_0 = input.LA(1);
					if ( (LA61_0==THIRTY) ) {
						alt61=1;
					}
					else if ( (LA61_0==INT_31) ) {
						alt61=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 61, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(61);}

					switch (alt61) {
						case 1 :
							dbg.enterAlt(1);

							// NumericRulesFR.g:150:6: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
							{
							dbg.location(150,6);
							// NumericRulesFR.g:150:6: ( THIRTY ( DASH | WHITE_SPACE )? FIRST )
							dbg.enterAlt(1);

							// NumericRulesFR.g:150:7: THIRTY ( DASH | WHITE_SPACE )? FIRST
							{
							dbg.location(150,7);
							THIRTY230=(Token)match(input,THIRTY,FOLLOW_THIRTY_in_spelled_first_to_thirty_first2382); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_THIRTY.add(THIRTY230);
							dbg.location(150,14);
							// NumericRulesFR.g:150:14: ( DASH | WHITE_SPACE )?
							int alt60=3;
							try { dbg.enterSubRule(60);
							try { dbg.enterDecision(60, decisionCanBacktrack[60]);

							int LA60_0 = input.LA(1);
							if ( (LA60_0==DASH) ) {
								alt60=1;
							}
							else if ( (LA60_0==WHITE_SPACE) ) {
								alt60=2;
							}
							} finally {dbg.exitDecision(60);}

							switch (alt60) {
								case 1 :
									dbg.enterAlt(1);

									// NumericRulesFR.g:150:15: DASH
									{
									dbg.location(150,15);
									DASH231=(Token)match(input,DASH,FOLLOW_DASH_in_spelled_first_to_thirty_first2385); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_DASH.add(DASH231);

									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// NumericRulesFR.g:150:22: WHITE_SPACE
									{
									dbg.location(150,22);
									WHITE_SPACE232=(Token)match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2389); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WHITE_SPACE.add(WHITE_SPACE232);

									}
									break;

							}
							} finally {dbg.exitSubRule(60);}
							dbg.location(150,36);
							FIRST233=(Token)match(input,FIRST,FOLLOW_FIRST_in_spelled_first_to_thirty_first2393); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FIRST.add(FIRST233);

							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// NumericRulesFR.g:150:47: INT_31 ST
							{
							dbg.location(150,47);
							INT_31234=(Token)match(input,INT_31,FOLLOW_INT_31_in_spelled_first_to_thirty_first2400); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_INT_31.add(INT_31234);
							dbg.location(150,54);
							ST235=(Token)match(input,ST,FOLLOW_ST_in_spelled_first_to_thirty_first2402); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ST.add(ST235);

							}
							break;

					}
					} finally {dbg.exitSubRule(61);}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 150:58: -> INT[\"31\"]
					{
						dbg.location(150,61);
						adaptor.addChild(root_0, (Object)adaptor.create(INT, "31"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(151, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "spelled_first_to_thirty_first");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "spelled_first_to_thirty_first"


	public static class int_60_to_99_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_60_to_99"
	// NumericRulesFR.g:153:1: int_60_to_99 : ( INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 );
	public final DateParserFR_NumericRulesFR.int_60_to_99_return int_60_to_99() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_60_to_99_return retval = new DateParserFR_NumericRulesFR.int_60_to_99_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set236=null;

		Object set236_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "int_60_to_99");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(153, 0);

		try {
			// NumericRulesFR.g:154:3: ( INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 )
			dbg.enterAlt(1);

			// NumericRulesFR.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(154,3);
			set236=input.LT(1);
			if ( (input.LA(1) >= INT_60 && input.LA(1) <= INT_69)||(input.LA(1) >= INT_70 && input.LA(1) <= INT_79)||(input.LA(1) >= INT_80 && input.LA(1) <= INT_89)||(input.LA(1) >= INT_90 && input.LA(1) <= INT_99) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set236));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(159, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_60_to_99");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_60_to_99"


	public static class int_32_to_59_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_32_to_59"
	// NumericRulesFR.g:161:1: int_32_to_59 : ( INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 );
	public final DateParserFR_NumericRulesFR.int_32_to_59_return int_32_to_59() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_32_to_59_return retval = new DateParserFR_NumericRulesFR.int_32_to_59_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set237=null;

		Object set237_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "int_32_to_59");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(161, 0);

		try {
			// NumericRulesFR.g:162:3: ( INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 )
			dbg.enterAlt(1);

			// NumericRulesFR.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(162,3);
			set237=input.LT(1);
			if ( (input.LA(1) >= INT_32 && input.LA(1) <= INT_39)||(input.LA(1) >= INT_40 && input.LA(1) <= INT_49)||(input.LA(1) >= INT_50 && input.LA(1) <= INT_59) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set237));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(166, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_32_to_59");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_32_to_59"


	public static class int_24_to_31_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_24_to_31"
	// NumericRulesFR.g:168:1: int_24_to_31 : ( INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 );
	public final DateParserFR_NumericRulesFR.int_24_to_31_return int_24_to_31() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_24_to_31_return retval = new DateParserFR_NumericRulesFR.int_24_to_31_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set238=null;

		Object set238_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "int_24_to_31");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(168, 0);

		try {
			// NumericRulesFR.g:169:3: ( INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 )
			dbg.enterAlt(1);

			// NumericRulesFR.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(169,3);
			set238=input.LT(1);
			if ( (input.LA(1) >= INT_24 && input.LA(1) <= INT_29)||(input.LA(1) >= INT_30 && input.LA(1) <= INT_31) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set238));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(170, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_24_to_31");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_24_to_31"


	public static class int_13_to_23_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_13_to_23"
	// NumericRulesFR.g:172:1: int_13_to_23 : ( INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 );
	public final DateParserFR_NumericRulesFR.int_13_to_23_return int_13_to_23() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_13_to_23_return retval = new DateParserFR_NumericRulesFR.int_13_to_23_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set239=null;

		Object set239_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "int_13_to_23");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(172, 0);

		try {
			// NumericRulesFR.g:173:3: ( INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 )
			dbg.enterAlt(1);

			// NumericRulesFR.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(173,3);
			set239=input.LT(1);
			if ( (input.LA(1) >= INT_13 && input.LA(1) <= INT_19)||(input.LA(1) >= INT_20 && input.LA(1) <= INT_23) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set239));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(175, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_13_to_23");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_13_to_23"


	public static class int_01_to_12_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_01_to_12"
	// NumericRulesFR.g:177:1: int_01_to_12 : ( INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_10 | INT_11 | INT_12 );
	public final DateParserFR_NumericRulesFR.int_01_to_12_return int_01_to_12() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_01_to_12_return retval = new DateParserFR_NumericRulesFR.int_01_to_12_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set240=null;

		Object set240_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "int_01_to_12");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(177, 0);

		try {
			// NumericRulesFR.g:178:3: ( INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_10 | INT_11 | INT_12 )
			dbg.enterAlt(1);

			// NumericRulesFR.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(178,3);
			set240=input.LT(1);
			if ( (input.LA(1) >= INT_01 && input.LA(1) <= INT_09)||(input.LA(1) >= INT_10 && input.LA(1) <= INT_12) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set240));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(180, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_01_to_12");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_01_to_12"


	public static class int_1_to_9_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_1_to_9"
	// NumericRulesFR.g:182:1: int_1_to_9 : ( INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 );
	public final DateParserFR_NumericRulesFR.int_1_to_9_return int_1_to_9() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_1_to_9_return retval = new DateParserFR_NumericRulesFR.int_1_to_9_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set241=null;

		Object set241_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "int_1_to_9");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(182, 0);

		try {
			// NumericRulesFR.g:183:3: ( INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 )
			dbg.enterAlt(1);

			// NumericRulesFR.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(183,3);
			set241=input.LT(1);
			if ( input.LA(1)==INT_1||input.LA(1)==INT_2||input.LA(1)==INT_3||input.LA(1)==INT_4||input.LA(1)==INT_5||input.LA(1)==INT_6||input.LA(1)==INT_7||input.LA(1)==INT_8||input.LA(1)==INT_9 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set241));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(184, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_1_to_9");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_1_to_9"


	public static class int_1_to_5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_1_to_5"
	// NumericRulesFR.g:186:1: int_1_to_5 : ( INT_1 | INT_2 | INT_3 | INT_4 | INT_5 );
	public final DateParserFR_NumericRulesFR.int_1_to_5_return int_1_to_5() throws RecognitionException {
		DateParserFR_NumericRulesFR.int_1_to_5_return retval = new DateParserFR_NumericRulesFR.int_1_to_5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set242=null;

		Object set242_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "int_1_to_5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(186, 0);

		try {
			// NumericRulesFR.g:187:3: ( INT_1 | INT_2 | INT_3 | INT_4 | INT_5 )
			dbg.enterAlt(1);

			// NumericRulesFR.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(187,3);
			set242=input.LT(1);
			if ( input.LA(1)==INT_1||input.LA(1)==INT_2||input.LA(1)==INT_3||input.LA(1)==INT_4||input.LA(1)==INT_5 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set242));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(188, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_1_to_5");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "int_1_to_5"

	// $ANTLR start synpred1_NumericRulesFR
	public final void synpred1_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:94:5: ( TWENTY WHITE_SPACE ONE )
		dbg.enterAlt(1);

		// NumericRulesFR.g:94:6: TWENTY WHITE_SPACE ONE
		{
		dbg.location(94,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred1_NumericRulesFR662); if (state.failed) return;
		dbg.location(94,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred1_NumericRulesFR664); if (state.failed) return;
		dbg.location(94,25);
		match(input,ONE,FOLLOW_ONE_in_synpred1_NumericRulesFR666); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_NumericRulesFR

	// $ANTLR start synpred2_NumericRulesFR
	public final void synpred2_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:96:5: ( TWENTY WHITE_SPACE TWO )
		dbg.enterAlt(1);

		// NumericRulesFR.g:96:6: TWENTY WHITE_SPACE TWO
		{
		dbg.location(96,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred2_NumericRulesFR743); if (state.failed) return;
		dbg.location(96,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred2_NumericRulesFR745); if (state.failed) return;
		dbg.location(96,25);
		match(input,TWO,FOLLOW_TWO_in_synpred2_NumericRulesFR747); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_NumericRulesFR

	// $ANTLR start synpred3_NumericRulesFR
	public final void synpred3_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:98:5: ( TWENTY WHITE_SPACE THREE )
		dbg.enterAlt(1);

		// NumericRulesFR.g:98:6: TWENTY WHITE_SPACE THREE
		{
		dbg.location(98,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred3_NumericRulesFR824); if (state.failed) return;
		dbg.location(98,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred3_NumericRulesFR826); if (state.failed) return;
		dbg.location(98,25);
		match(input,THREE,FOLLOW_THREE_in_synpred3_NumericRulesFR828); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_NumericRulesFR

	// $ANTLR start synpred4_NumericRulesFR
	public final void synpred4_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:100:5: ( TWENTY WHITE_SPACE FOUR )
		dbg.enterAlt(1);

		// NumericRulesFR.g:100:6: TWENTY WHITE_SPACE FOUR
		{
		dbg.location(100,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred4_NumericRulesFR899); if (state.failed) return;
		dbg.location(100,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred4_NumericRulesFR901); if (state.failed) return;
		dbg.location(100,25);
		match(input,FOUR,FOLLOW_FOUR_in_synpred4_NumericRulesFR903); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_NumericRulesFR

	// $ANTLR start synpred5_NumericRulesFR
	public final void synpred5_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:102:5: ( TWENTY WHITE_SPACE FIVE )
		dbg.enterAlt(1);

		// NumericRulesFR.g:102:6: TWENTY WHITE_SPACE FIVE
		{
		dbg.location(102,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred5_NumericRulesFR977); if (state.failed) return;
		dbg.location(102,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred5_NumericRulesFR979); if (state.failed) return;
		dbg.location(102,25);
		match(input,FIVE,FOLLOW_FIVE_in_synpred5_NumericRulesFR981); if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_NumericRulesFR

	// $ANTLR start synpred6_NumericRulesFR
	public final void synpred6_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:104:5: ( TWENTY WHITE_SPACE SIX )
		dbg.enterAlt(1);

		// NumericRulesFR.g:104:6: TWENTY WHITE_SPACE SIX
		{
		dbg.location(104,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred6_NumericRulesFR1055); if (state.failed) return;
		dbg.location(104,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred6_NumericRulesFR1057); if (state.failed) return;
		dbg.location(104,25);
		match(input,SIX,FOLLOW_SIX_in_synpred6_NumericRulesFR1059); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_NumericRulesFR

	// $ANTLR start synpred7_NumericRulesFR
	public final void synpred7_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:106:5: ( TWENTY WHITE_SPACE SEVEN )
		dbg.enterAlt(1);

		// NumericRulesFR.g:106:6: TWENTY WHITE_SPACE SEVEN
		{
		dbg.location(106,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred7_NumericRulesFR1136); if (state.failed) return;
		dbg.location(106,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred7_NumericRulesFR1138); if (state.failed) return;
		dbg.location(106,25);
		match(input,SEVEN,FOLLOW_SEVEN_in_synpred7_NumericRulesFR1140); if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_NumericRulesFR

	// $ANTLR start synpred8_NumericRulesFR
	public final void synpred8_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:108:5: ( TWENTY WHITE_SPACE EIGHT )
		dbg.enterAlt(1);

		// NumericRulesFR.g:108:6: TWENTY WHITE_SPACE EIGHT
		{
		dbg.location(108,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred8_NumericRulesFR1211); if (state.failed) return;
		dbg.location(108,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred8_NumericRulesFR1213); if (state.failed) return;
		dbg.location(108,25);
		match(input,EIGHT,FOLLOW_EIGHT_in_synpred8_NumericRulesFR1215); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_NumericRulesFR

	// $ANTLR start synpred9_NumericRulesFR
	public final void synpred9_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:110:5: ( TWENTY WHITE_SPACE NINE )
		dbg.enterAlt(1);

		// NumericRulesFR.g:110:6: TWENTY WHITE_SPACE NINE
		{
		dbg.location(110,6);
		match(input,TWENTY,FOLLOW_TWENTY_in_synpred9_NumericRulesFR1286); if (state.failed) return;
		dbg.location(110,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred9_NumericRulesFR1288); if (state.failed) return;
		dbg.location(110,25);
		match(input,NINE,FOLLOW_NINE_in_synpred9_NumericRulesFR1290); if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_NumericRulesFR

	// $ANTLR start synpred10_NumericRulesFR
	public final void synpred10_NumericRulesFR_fragment() throws RecognitionException {
		// NumericRulesFR.g:113:5: ( THIRTY WHITE_SPACE ONE )
		dbg.enterAlt(1);

		// NumericRulesFR.g:113:6: THIRTY WHITE_SPACE ONE
		{
		dbg.location(113,6);
		match(input,THIRTY,FOLLOW_THIRTY_in_synpred10_NumericRulesFR1422); if (state.failed) return;
		dbg.location(113,13);
		match(input,WHITE_SPACE,FOLLOW_WHITE_SPACE_in_synpred10_NumericRulesFR1424); if (state.failed) return;
		dbg.location(113,25);
		match(input,ONE,FOLLOW_ONE_in_synpred10_NumericRulesFR1426); if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_NumericRulesFR

	// Delegated rules

	public final boolean synpred8_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred8_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred7_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred1_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred4_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred3_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred10_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred2_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred5_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred6_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_NumericRulesFR() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred9_NumericRulesFR_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_INT_00_in_int_00_to_59_mandatory_prefix42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_12_in_int_00_to_59_mandatory_prefix48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_13_to_23_in_int_00_to_59_mandatory_prefix54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_24_to_31_in_int_00_to_59_mandatory_prefix60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_32_to_59_in_int_00_to_59_mandatory_prefix66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_00_to_59_mandatory_prefix_in_int_00_to_99_mandatory_prefix89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_60_to_99_in_int_00_to_99_mandatory_prefix93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_1_to_9_in_int_01_to_12_optional_prefix120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_12_in_int_01_to_12_optional_prefix124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_00_in_int_00_to_23_optional_prefix147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_0_in_int_00_to_23_optional_prefix154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_1_to_9_in_int_00_to_23_optional_prefix160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_12_in_int_00_to_23_optional_prefix166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_13_to_23_in_int_00_to_23_optional_prefix172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_12_in_int_01_to_31_optional_prefix195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_1_to_9_in_int_01_to_31_optional_prefix201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_13_to_23_in_int_01_to_31_optional_prefix207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_24_to_31_in_int_01_to_31_optional_prefix213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits235 = new BitSet(new long[]{0x0000000000000000L,0xFFBFF7FEFFDFFBFFL,0x00001FFBFF7FEFFDL});
	public static final BitSet FOLLOW_int_00_to_99_mandatory_prefix_in_int_four_digits237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_01_to_31_optional_prefix265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_01_to_31_optional_prefix271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_spelled_one_to_thirty_one_in_spelled_or_int_optional_prefix288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_optional_prefix297 = new BitSet(new long[]{0x8000000000000002L,0xFFFFFFFFFFFFFFFFL,0x00001FFFFFFFFFFFL});
	public static final BitSet FOLLOW_int_32_to_59_in_spelled_or_int_optional_prefix301 = new BitSet(new long[]{0x8000000000000002L,0xFFFFFFFFFFFFFFFFL,0x00001FFFFFFFFFFFL});
	public static final BitSet FOLLOW_int_60_to_99_in_spelled_or_int_optional_prefix305 = new BitSet(new long[]{0x8000000000000002L,0xFFFFFFFFFFFFFFFFL,0x00001FFFFFFFFFFFL});
	public static final BitSet FOLLOW_INT_0_in_spelled_or_int_optional_prefix315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_00_in_spelled_or_int_optional_prefix319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_01_to_31_optional_prefix_in_spelled_or_int_optional_prefix323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_32_to_59_in_spelled_or_int_optional_prefix327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_int_60_to_99_in_spelled_or_int_optional_prefix331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEN_in_spelled_one_to_thirty_one521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELEVEN_in_spelled_one_to_thirty_one539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWELVE_in_spelled_one_to_thirty_one554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRTEEN_in_spelled_one_to_thirty_one569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOURTEEN_in_spelled_one_to_thirty_one582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIFTEEN_in_spelled_one_to_thirty_one595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIXTEEN_in_spelled_one_to_thirty_one609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEVENTEEN_in_spelled_one_to_thirty_one623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EIGHTEEN_in_spelled_one_to_thirty_one635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NINETEEN_in_spelled_one_to_thirty_one648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one689 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one770 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_TWO_in_spelled_one_to_thirty_one775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one847 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_THREE_in_spelled_one_to_thirty_one852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one910 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one924 = new BitSet(new long[]{0x0001000000200000L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one926 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_FOUR_in_spelled_one_to_thirty_one929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one988 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1002 = new BitSet(new long[]{0x0000100000200000L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1004 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_FIVE_in_spelled_one_to_thirty_one1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1082 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SIX_in_spelled_one_to_thirty_one1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1159 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_SEVEN_in_spelled_one_to_thirty_one1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1221 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1234 = new BitSet(new long[]{0x0000000010200000L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1236 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EIGHT_in_spelled_one_to_thirty_one1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1311 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_NINE_in_spelled_one_to_thirty_one1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_one_to_thirty_one1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one1432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_one_to_thirty_one1434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one1449 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_DASH_in_spelled_one_to_thirty_one1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ONE_in_spelled_one_to_thirty_one1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRTY_in_spelled_one_to_thirty_one1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_1_in_spelled_first_to_thirty_first1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_ST_in_spelled_first_to_thirty_first1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_2_in_spelled_first_to_thirty_first1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_ND_in_spelled_first_to_thirty_first1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_3_in_spelled_first_to_thirty_first1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RD_in_spelled_first_to_thirty_first1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first1648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_4_in_spelled_first_to_thirty_first1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first1673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_5_in_spelled_first_to_thirty_first1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_6_in_spelled_first_to_thirty_first1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_7_in_spelled_first_to_thirty_first1733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first1749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_8_in_spelled_first_to_thirty_first1758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_9_in_spelled_first_to_thirty_first1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TENTH_in_spelled_first_to_thirty_first1800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_10_in_spelled_first_to_thirty_first1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELEVENTH_in_spelled_first_to_thirty_first1825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_11_in_spelled_first_to_thirty_first1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWELFTH_in_spelled_first_to_thirty_first1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_12_in_spelled_first_to_thirty_first1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRTEENTH_in_spelled_first_to_thirty_first1870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_13_in_spelled_first_to_thirty_first1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOURTEENTH_in_spelled_first_to_thirty_first1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_14_in_spelled_first_to_thirty_first1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIFTEENTH_in_spelled_first_to_thirty_first1910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_15_in_spelled_first_to_thirty_first1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIXTEENTH_in_spelled_first_to_thirty_first1931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_16_in_spelled_first_to_thirty_first1937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEVENTEENTH_in_spelled_first_to_thirty_first1952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_17_in_spelled_first_to_thirty_first1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EIGHTEENTH_in_spelled_first_to_thirty_first1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_18_in_spelled_first_to_thirty_first1976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NINETEENTH_in_spelled_first_to_thirty_first1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_19_in_spelled_first_to_thirty_first1996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first1998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTIETH_in_spelled_first_to_thirty_first2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_20_in_spelled_first_to_thirty_first2017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2033 = new BitSet(new long[]{0x0000080000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2036 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2040 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first2044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_21_in_spelled_first_to_thirty_first2051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_ST_in_spelled_first_to_thirty_first2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2067 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SECOND_in_spelled_first_to_thirty_first2078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_22_in_spelled_first_to_thirty_first2084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_ND_in_spelled_first_to_thirty_first2086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2100 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_THIRD_in_spelled_first_to_thirty_first2111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_23_in_spelled_first_to_thirty_first2118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RD_in_spelled_first_to_thirty_first2120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2134 = new BitSet(new long[]{0x0008000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2137 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2141 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_FOURTH_in_spelled_first_to_thirty_first2145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_24_in_spelled_first_to_thirty_first2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2167 = new BitSet(new long[]{0x0000040000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2170 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2174 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_FIFTH_in_spelled_first_to_thirty_first2178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_25_in_spelled_first_to_thirty_first2185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2201 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_SIXTH_in_spelled_first_to_thirty_first2212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_26_in_spelled_first_to_thirty_first2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2235 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEVENTH_in_spelled_first_to_thirty_first2246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_27_in_spelled_first_to_thirty_first2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2267 = new BitSet(new long[]{0x0000000080200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2270 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2274 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_EIGHTH_in_spelled_first_to_thirty_first2278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_28_in_spelled_first_to_thirty_first2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_spelled_first_to_thirty_first2300 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_NINTH_in_spelled_first_to_thirty_first2311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_29_in_spelled_first_to_thirty_first2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRTIETH_in_spelled_first_to_thirty_first2333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_30_in_spelled_first_to_thirty_first2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_TH_in_spelled_first_to_thirty_first2339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRTY_in_spelled_first_to_thirty_first2382 = new BitSet(new long[]{0x0000080000200000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_DASH_in_spelled_first_to_thirty_first2385 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_spelled_first_to_thirty_first2389 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_FIRST_in_spelled_first_to_thirty_first2393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_31_in_spelled_first_to_thirty_first2400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_ST_in_spelled_first_to_thirty_first2402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred1_NumericRulesFR662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred1_NumericRulesFR664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ONE_in_synpred1_NumericRulesFR666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred2_NumericRulesFR743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred2_NumericRulesFR745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_TWO_in_synpred2_NumericRulesFR747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred3_NumericRulesFR824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred3_NumericRulesFR826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_THREE_in_synpred3_NumericRulesFR828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred4_NumericRulesFR899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred4_NumericRulesFR901 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_FOUR_in_synpred4_NumericRulesFR903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred5_NumericRulesFR977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred5_NumericRulesFR979 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_FIVE_in_synpred5_NumericRulesFR981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred6_NumericRulesFR1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred6_NumericRulesFR1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_SIX_in_synpred6_NumericRulesFR1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred7_NumericRulesFR1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred7_NumericRulesFR1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_SEVEN_in_synpred7_NumericRulesFR1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred8_NumericRulesFR1211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred8_NumericRulesFR1213 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_EIGHT_in_synpred8_NumericRulesFR1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TWENTY_in_synpred9_NumericRulesFR1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred9_NumericRulesFR1288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_NINE_in_synpred9_NumericRulesFR1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIRTY_in_synpred10_NumericRulesFR1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_WHITE_SPACE_in_synpred10_NumericRulesFR1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ONE_in_synpred10_NumericRulesFR1426 = new BitSet(new long[]{0x0000000000000002L});
}
