// $ANTLR 3.5.2 org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g 2018-03-09 01:57:06
 package org.openhab.ui.habot.nlp.internal.natty.generated.en; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DateWalker extends TreeParser {
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
		"SEEK", "SEEK_BY", "SPAN", "YEAR_OF", "ZONE", "ZONE_OFFSET", "WEEK_INDEX"
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
	public static final int WEEK_INDEX=466;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public DateWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public DateWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return DateWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g"; }


	  private org.openhab.ui.habot.nlp.internal.natty.WalkerState _walkerState;
	  private java.util.Date referenceDate;

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

	  public void setReferenceDate(java.util.Date referenceDate) {
	    this.referenceDate = referenceDate;
	  }

	  public org.openhab.ui.habot.nlp.internal.natty.WalkerState getState() {
	    if(_walkerState==null) {
	      _walkerState = new org.openhab.ui.habot.nlp.internal.natty.WalkerState(referenceDate);
	    }
	    return _walkerState;
	  }



	// $ANTLR start "parse"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:44:1: parse : date_time_alternative ( recurrence )? ;
	public final void parse() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:45:3: ( date_time_alternative ( recurrence )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:45:5: date_time_alternative ( recurrence )?
			{
			pushFollow(FOLLOW_date_time_alternative_in_parse51);
			date_time_alternative();
			state._fsp--;

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:45:27: ( recurrence )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==RECURRENCE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:45:27: recurrence
					{
					pushFollow(FOLLOW_recurrence_in_parse53);
					recurrence();
					state._fsp--;

					}
					break;

			}

			}

		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parse"



	// $ANTLR start "recurrence"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:48:1: recurrence : ^( RECURRENCE ( date_time )? ) ;
	public final void recurrence() throws RecognitionException {
		 
		    _walkerState.setRecurring();
		  
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:52:3: ( ^( RECURRENCE ( date_time )? ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:52:5: ^( RECURRENCE ( date_time )? )
			{
			match(input,RECURRENCE,FOLLOW_RECURRENCE_in_recurrence77); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:52:18: ( date_time )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DATE_TIME) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:52:18: date_time
						{
						pushFollow(FOLLOW_date_time_in_recurrence79);
						date_time();
						state._fsp--;

						}
						break;

				}

				 _walkerState.captureDateTime(); 
				match(input, Token.UP, null); 
			}

			}

		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "recurrence"



	// $ANTLR start "date_time_alternative"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:55:1: date_time_alternative : ^( DATE_TIME_ALTERNATIVE ( date_time )+ ) ;
	public final void date_time_alternative() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:56:3: ( ^( DATE_TIME_ALTERNATIVE ( date_time )+ ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:56:5: ^( DATE_TIME_ALTERNATIVE ( date_time )+ )
			{
			match(input,DATE_TIME_ALTERNATIVE,FOLLOW_DATE_TIME_ALTERNATIVE_in_date_time_alternative98); 
			match(input, Token.DOWN, null); 
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:56:29: ( date_time )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DATE_TIME) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:56:29: date_time
					{
					pushFollow(FOLLOW_date_time_in_date_time_alternative100);
					date_time();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input, Token.UP, null); 

			}

		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "date_time_alternative"



	// $ANTLR start "date_time"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:59:1: date_time : ^( DATE_TIME ( date )? ( time )? ) ;
	public final void date_time() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:63:3: ( ^( DATE_TIME ( date )? ( time )? ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:63:5: ^( DATE_TIME ( date )? ( time )? )
			{
			match(input,DATE_TIME,FOLLOW_DATE_TIME_in_date_time123); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:63:17: ( date )?
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==EXPLICIT_DATE||LA4_0==RELATIVE_DATE) ) {
					alt4=1;
				}
				switch (alt4) {
					case 1 :
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:63:17: date
						{
						pushFollow(FOLLOW_date_in_date_time125);
						date();
						state._fsp--;

						}
						break;

				}

				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:63:23: ( time )?
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==EXPLICIT_TIME||LA5_0==RELATIVE_TIME) ) {
					alt5=1;
				}
				switch (alt5) {
					case 1 :
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:63:23: time
						{
						pushFollow(FOLLOW_time_in_date_time128);
						time();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			}


			    _walkerState.captureDateTime(); 
			  
		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "date_time"



	// $ANTLR start "date"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:66:1: date : ( relative_date | explicit_date );
	public final void date() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:67:3: ( relative_date | explicit_date )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RELATIVE_DATE) ) {
				alt6=1;
			}
			else if ( (LA6_0==EXPLICIT_DATE) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:67:5: relative_date
					{
					pushFollow(FOLLOW_relative_date_in_date147);
					relative_date();
					state._fsp--;

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:68:5: explicit_date
					{
					pushFollow(FOLLOW_explicit_date_in_date154);
					explicit_date();
					state._fsp--;

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
	}
	// $ANTLR end "date"



	// $ANTLR start "relative_date"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:71:1: relative_date : ^( RELATIVE_DATE ( seek )* ( explicit_seek )* ) ;
	public final void relative_date() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:72:3: ( ^( RELATIVE_DATE ( seek )* ( explicit_seek )* ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:72:5: ^( RELATIVE_DATE ( seek )* ( explicit_seek )* )
			{
			match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date170); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:72:21: ( seek )*
				loop7:
				while (true) {
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==SEEK) ) {
						alt7=1;
					}

					switch (alt7) {
					case 1 :
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:72:21: seek
						{
						pushFollow(FOLLOW_seek_in_relative_date172);
						seek();
						state._fsp--;

						}
						break;

					default :
						break loop7;
					}
				}

				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:72:27: ( explicit_seek )*
				loop8:
				while (true) {
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXPLICIT_SEEK) ) {
						alt8=1;
					}

					switch (alt8) {
					case 1 :
						// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:72:27: explicit_seek
						{
						pushFollow(FOLLOW_explicit_seek_in_relative_date175);
						explicit_seek();
						state._fsp--;

						}
						break;

					default :
						break loop8;
					}
				}

				match(input, Token.UP, null); 
			}

			}

		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relative_date"



	// $ANTLR start "week_index"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:75:1: week_index : ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ) ;
	public final void week_index() throws RecognitionException {
		CommonTree index=null;
		CommonTree day=null;

		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:76:3: ( ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:76:5: ^( WEEK_INDEX index= INT ^( DAY_OF_WEEK day= INT ) )
			{
			match(input,WEEK_INDEX,FOLLOW_WEEK_INDEX_in_week_index193); 
			match(input, Token.DOWN, null); 
			index=(CommonTree)match(input,INT,FOLLOW_INT_in_week_index197); 
			match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_week_index200); 
			match(input, Token.DOWN, null); 
			day=(CommonTree)match(input,INT,FOLLOW_INT_in_week_index204); 
			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			_walkerState.setDayOfWeekIndex((index!=null?index.getText():null), (day!=null?day.getText():null));
			}

		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "week_index"



	// $ANTLR start "explicit_date"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:80:1: explicit_date : ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? ) ;
	public final void explicit_date() throws RecognitionException {
		CommonTree month=null;
		CommonTree dom=null;
		CommonTree dow=null;
		CommonTree year=null;

		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:81:3: ( ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:81:5: ^( EXPLICIT_DATE ^( MONTH_OF_YEAR month= INT ) ^( DAY_OF_MONTH dom= INT ) ( ^( DAY_OF_WEEK dow= INT ) )? ( ^( YEAR_OF year= INT ) )? )
			{
			match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date228); 
			match(input, Token.DOWN, null); 
			match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_date231); 
			match(input, Token.DOWN, null); 
			month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date235); 
			match(input, Token.UP, null); 

			match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_date239); 
			match(input, Token.DOWN, null); 
			dom=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date243); 
			match(input, Token.UP, null); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:82:9: ( ^( DAY_OF_WEEK dow= INT ) )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==DAY_OF_WEEK) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:82:10: ^( DAY_OF_WEEK dow= INT )
					{
					match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_date257); 
					match(input, Token.DOWN, null); 
					dow=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date261); 
					match(input, Token.UP, null); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:82:35: ( ^( YEAR_OF year= INT ) )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==YEAR_OF) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:82:36: ^( YEAR_OF year= INT )
					{
					match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_date268); 
					match(input, Token.DOWN, null); 
					year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_date272); 
					match(input, Token.UP, null); 

					}
					break;

			}

			match(input, Token.UP, null); 

			_walkerState.setExplicitDate((month!=null?month.getText():null), (dom!=null?dom.getText():null), (dow!=null?dow.getText():null), (year!=null?year.getText():null));
			}

		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "explicit_date"



	// $ANTLR start "time"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:86:1: time : ( explicit_time | relative_time );
	public final void time() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:87:3: ( explicit_time | relative_time )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==EXPLICIT_TIME) ) {
				alt11=1;
			}
			else if ( (LA11_0==RELATIVE_TIME) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:87:5: explicit_time
					{
					pushFollow(FOLLOW_explicit_time_in_time297);
					explicit_time();
					state._fsp--;

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:88:5: relative_time
					{
					pushFollow(FOLLOW_relative_time_in_time303);
					relative_time();
					state._fsp--;

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
	}
	// $ANTLR end "time"



	// $ANTLR start "explicit_time"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:91:1: explicit_time : ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ( ^( MINUTES_OF_HOUR minutes= INT ) )? ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE |zone= ZONE_OFFSET )? ) ;
	public final void explicit_time() throws RecognitionException {
		CommonTree hours=null;
		CommonTree minutes=null;
		CommonTree seconds=null;
		CommonTree zone=null;
		CommonTree AM_PM1=null;

		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:92:3: ( ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ( ^( MINUTES_OF_HOUR minutes= INT ) )? ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE |zone= ZONE_OFFSET )? ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:92:5: ^( EXPLICIT_TIME ^( HOURS_OF_DAY hours= INT ) ( ^( MINUTES_OF_HOUR minutes= INT ) )? ( ^( SECONDS_OF_MINUTE seconds= INT ) )? ( AM_PM )? (zone= ZONE |zone= ZONE_OFFSET )? )
			{
			match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_explicit_time319); 
			match(input, Token.DOWN, null); 
			match(input,HOURS_OF_DAY,FOLLOW_HOURS_OF_DAY_in_explicit_time322); 
			match(input, Token.DOWN, null); 
			hours=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_time326); 
			match(input, Token.UP, null); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:92:47: ( ^( MINUTES_OF_HOUR minutes= INT ) )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==MINUTES_OF_HOUR) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:92:48: ^( MINUTES_OF_HOUR minutes= INT )
					{
					match(input,MINUTES_OF_HOUR,FOLLOW_MINUTES_OF_HOUR_in_explicit_time331); 
					match(input, Token.DOWN, null); 
					minutes=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_time335); 
					match(input, Token.UP, null); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:93:9: ( ^( SECONDS_OF_MINUTE seconds= INT ) )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==SECONDS_OF_MINUTE) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:93:10: ^( SECONDS_OF_MINUTE seconds= INT )
					{
					match(input,SECONDS_OF_MINUTE,FOLLOW_SECONDS_OF_MINUTE_in_explicit_time350); 
					match(input, Token.DOWN, null); 
					seconds=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_time354); 
					match(input, Token.UP, null); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:93:45: ( AM_PM )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==AM_PM) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:93:45: AM_PM
					{
					AM_PM1=(CommonTree)match(input,AM_PM,FOLLOW_AM_PM_in_explicit_time359); 
					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:93:52: (zone= ZONE |zone= ZONE_OFFSET )?
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ZONE) ) {
				alt15=1;
			}
			else if ( (LA15_0==ZONE_OFFSET) ) {
				alt15=2;
			}
			switch (alt15) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:93:53: zone= ZONE
					{
					zone=(CommonTree)match(input,ZONE,FOLLOW_ZONE_in_explicit_time365); 
					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:93:65: zone= ZONE_OFFSET
					{
					zone=(CommonTree)match(input,ZONE_OFFSET,FOLLOW_ZONE_OFFSET_in_explicit_time371); 
					}
					break;

			}

			match(input, Token.UP, null); 

			_walkerState.setExplicitTime((hours!=null?hours.getText():null), (minutes!=null?minutes.getText():null), (seconds!=null?seconds.getText():null), (AM_PM1!=null?AM_PM1.getText():null), (zone!=null?zone.getText():null));
			}

		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "explicit_time"



	// $ANTLR start "relative_time"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:97:1: relative_time : ^( RELATIVE_TIME seek ) ;
	public final void relative_time() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:98:3: ( ^( RELATIVE_TIME seek ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:98:5: ^( RELATIVE_TIME seek )
			{
			match(input,RELATIVE_TIME,FOLLOW_RELATIVE_TIME_in_relative_time396); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_seek_in_relative_time398);
			seek();
			state._fsp--;

			match(input, Token.UP, null); 

			}

		}

		  catch(RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relative_time"



	// $ANTLR start "seek"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:101:1: seek : ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY ( explicit_seek | relative_date )? INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) | ^( SEEK DIRECTION SEEK_BY INT HOLIDAY ) | ^( SEEK DIRECTION SEEK_BY INT SEASON ) );
	public final void seek() throws RecognitionException {
		CommonTree by=null;
		CommonTree amount=null;
		CommonTree day=null;
		CommonTree month=null;
		CommonTree DIRECTION2=null;
		CommonTree DIRECTION3=null;
		CommonTree DIRECTION4=null;
		CommonTree INT5=null;
		CommonTree SPAN6=null;
		CommonTree DIRECTION7=null;
		CommonTree INT8=null;
		CommonTree SEEK_BY9=null;
		CommonTree HOLIDAY10=null;
		CommonTree DIRECTION11=null;
		CommonTree INT12=null;
		CommonTree SEASON13=null;
		CommonTree DIRECTION14=null;
		CommonTree INT15=null;

		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:102:3: ( ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? ) | ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) ) | ^( SEEK DIRECTION SEEK_BY ( explicit_seek | relative_date )? INT SPAN ) | ^( SEEK DIRECTION SEEK_BY INT date ) | ^( SEEK DIRECTION SEEK_BY INT HOLIDAY ) | ^( SEEK DIRECTION SEEK_BY INT SEASON ) )
			int alt18=6;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==SEEK) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOWN) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==DIRECTION) ) {
						int LA18_3 = input.LA(4);
						if ( (LA18_3==SEEK_BY) ) {
							int LA18_4 = input.LA(5);
							if ( (LA18_4==INT) ) {
								switch ( input.LA(6) ) {
								case DAY_OF_WEEK:
									{
									alt18=1;
									}
									break;
								case MONTH_OF_YEAR:
									{
									alt18=2;
									}
									break;
								case HOLIDAY:
									{
									alt18=5;
									}
									break;
								case SEASON:
									{
									alt18=6;
									}
									break;
								case SPAN:
									{
									alt18=3;
									}
									break;
								case EXPLICIT_DATE:
								case RELATIVE_DATE:
									{
									alt18=4;
									}
									break;
								default:
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 18, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else if ( (LA18_4==EXPLICIT_SEEK||LA18_4==RELATIVE_DATE) ) {
								alt18=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 18, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 18, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:102:5: ^( SEEK DIRECTION by= SEEK_BY amount= INT ^( DAY_OF_WEEK day= INT ) ( date )? )
					{
					match(input,SEEK,FOLLOW_SEEK_in_seek415); 
					match(input, Token.DOWN, null); 
					DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek417); 
					by=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek421); 
					amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek425); 
					match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_seek428); 
					match(input, Token.DOWN, null); 
					day=(CommonTree)match(input,INT,FOLLOW_INT_in_seek432); 
					match(input, Token.UP, null); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:102:68: ( date )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==EXPLICIT_DATE||LA16_0==RELATIVE_DATE) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:102:68: date
							{
							pushFollow(FOLLOW_date_in_seek436);
							date();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					_walkerState.seekToDayOfWeek((DIRECTION2!=null?DIRECTION2.getText():null), (by!=null?by.getText():null), (amount!=null?amount.getText():null), (day!=null?day.getText():null));
					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:105:5: ^( SEEK DIRECTION SEEK_BY amount= INT ^( MONTH_OF_YEAR month= INT ) )
					{
					match(input,SEEK,FOLLOW_SEEK_in_seek456); 
					match(input, Token.DOWN, null); 
					DIRECTION3=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek458); 
					match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek460); 
					amount=(CommonTree)match(input,INT,FOLLOW_INT_in_seek464); 
					match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_seek467); 
					match(input, Token.DOWN, null); 
					month=(CommonTree)match(input,INT,FOLLOW_INT_in_seek471); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.seekToMonth((DIRECTION3!=null?DIRECTION3.getText():null), (amount!=null?amount.getText():null), (month!=null?month.getText():null));
					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:108:5: ^( SEEK DIRECTION SEEK_BY ( explicit_seek | relative_date )? INT SPAN )
					{
					match(input,SEEK,FOLLOW_SEEK_in_seek489); 
					match(input, Token.DOWN, null); 
					DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek491); 
					match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek493); 
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:108:30: ( explicit_seek | relative_date )?
					int alt17=3;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==EXPLICIT_SEEK) ) {
						alt17=1;
					}
					else if ( (LA17_0==RELATIVE_DATE) ) {
						alt17=2;
					}
					switch (alt17) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:108:31: explicit_seek
							{
							pushFollow(FOLLOW_explicit_seek_in_seek496);
							explicit_seek();
							state._fsp--;

							}
							break;
						case 2 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:108:47: relative_date
							{
							pushFollow(FOLLOW_relative_date_in_seek500);
							relative_date();
							state._fsp--;

							}
							break;

					}

					INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_seek504); 
					SPAN6=(CommonTree)match(input,SPAN,FOLLOW_SPAN_in_seek506); 
					match(input, Token.UP, null); 

					_walkerState.seekBySpan((DIRECTION4!=null?DIRECTION4.getText():null), (INT5!=null?INT5.getText():null), (SPAN6!=null?SPAN6.getText():null));
					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:111:5: ^( SEEK DIRECTION SEEK_BY INT date )
					{
					match(input,SEEK,FOLLOW_SEEK_in_seek523); 
					match(input, Token.DOWN, null); 
					DIRECTION7=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek525); 
					SEEK_BY9=(CommonTree)match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek527); 
					INT8=(CommonTree)match(input,INT,FOLLOW_INT_in_seek529); 
					pushFollow(FOLLOW_date_in_seek531);
					date();
					state._fsp--;

					match(input, Token.UP, null); 

					_walkerState.seekBySpan((DIRECTION7!=null?DIRECTION7.getText():null), (INT8!=null?INT8.getText():null), (SEEK_BY9!=null?SEEK_BY9.getText():null));
					}
					break;
				case 5 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:114:5: ^( SEEK DIRECTION SEEK_BY INT HOLIDAY )
					{
					match(input,SEEK,FOLLOW_SEEK_in_seek550); 
					match(input, Token.DOWN, null); 
					DIRECTION11=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek552); 
					match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek554); 
					INT12=(CommonTree)match(input,INT,FOLLOW_INT_in_seek556); 
					HOLIDAY10=(CommonTree)match(input,HOLIDAY,FOLLOW_HOLIDAY_in_seek558); 
					match(input, Token.UP, null); 

					_walkerState.seekToHoliday((HOLIDAY10!=null?HOLIDAY10.getText():null), (DIRECTION11!=null?DIRECTION11.getText():null), (INT12!=null?INT12.getText():null));
					}
					break;
				case 6 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:117:5: ^( SEEK DIRECTION SEEK_BY INT SEASON )
					{
					match(input,SEEK,FOLLOW_SEEK_in_seek577); 
					match(input, Token.DOWN, null); 
					DIRECTION14=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_seek579); 
					match(input,SEEK_BY,FOLLOW_SEEK_BY_in_seek581); 
					INT15=(CommonTree)match(input,INT,FOLLOW_INT_in_seek583); 
					SEASON13=(CommonTree)match(input,SEASON,FOLLOW_SEASON_in_seek585); 
					match(input, Token.UP, null); 

					_walkerState.seekToSeason((SEASON13!=null?SEASON13.getText():null), (DIRECTION14!=null?DIRECTION14.getText():null), (INT15!=null?INT15.getText():null));
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
	}
	// $ANTLR end "seek"



	// $ANTLR start "explicit_seek"
	// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:121:1: explicit_seek : ( ^( EXPLICIT_SEEK ^( MONTH_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_MONTH month= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK HOLIDAY ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK SEASON ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK index= INT ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK explicit_time ) );
	public final void explicit_seek() throws RecognitionException {
		CommonTree day=null;
		CommonTree month=null;
		CommonTree year=null;
		CommonTree index=null;
		CommonTree HOLIDAY16=null;
		CommonTree SEASON17=null;

		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:122:3: ( ^( EXPLICIT_SEEK ^( MONTH_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_MONTH month= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK ^( DAY_OF_YEAR day= INT ) ) | ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK HOLIDAY ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK SEASON ^( YEAR_OF year= INT ) ) | ^( EXPLICIT_SEEK index= INT ^( DAY_OF_WEEK day= INT ) ) | ^( EXPLICIT_SEEK explicit_time ) )
			int alt19=9;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==EXPLICIT_SEEK) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case MONTH_OF_YEAR:
						{
						alt19=1;
						}
						break;
					case DAY_OF_MONTH:
						{
						alt19=2;
						}
						break;
					case DAY_OF_WEEK:
						{
						alt19=3;
						}
						break;
					case DAY_OF_YEAR:
						{
						alt19=4;
						}
						break;
					case YEAR_OF:
						{
						alt19=5;
						}
						break;
					case HOLIDAY:
						{
						alt19=6;
						}
						break;
					case SEASON:
						{
						alt19=7;
						}
						break;
					case INT:
						{
						alt19=8;
						}
						break;
					case EXPLICIT_TIME:
						{
						alt19=9;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:122:5: ^( EXPLICIT_SEEK ^( MONTH_OF_YEAR day= INT ) )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek608); 
					match(input, Token.DOWN, null); 
					match(input,MONTH_OF_YEAR,FOLLOW_MONTH_OF_YEAR_in_explicit_seek611); 
					match(input, Token.DOWN, null); 
					day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek615); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.seekToMonth(">", "0", (day!=null?day.getText():null));
					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:125:5: ^( EXPLICIT_SEEK ^( DAY_OF_MONTH month= INT ) )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek635); 
					match(input, Token.DOWN, null); 
					match(input,DAY_OF_MONTH,FOLLOW_DAY_OF_MONTH_in_explicit_seek638); 
					match(input, Token.DOWN, null); 
					month=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek642); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.seekToDayOfMonth((month!=null?month.getText():null));
					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:128:5: ^( EXPLICIT_SEEK ^( DAY_OF_WEEK day= INT ) )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek662); 
					match(input, Token.DOWN, null); 
					match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_seek665); 
					match(input, Token.DOWN, null); 
					day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek669); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.seekToDayOfWeek(">", "by_week", "0", (day!=null?day.getText():null));
					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:131:5: ^( EXPLICIT_SEEK ^( DAY_OF_YEAR day= INT ) )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek689); 
					match(input, Token.DOWN, null); 
					match(input,DAY_OF_YEAR,FOLLOW_DAY_OF_YEAR_in_explicit_seek692); 
					match(input, Token.DOWN, null); 
					day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek696); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.seekToDayOfYear((day!=null?day.getText():null));
					}
					break;
				case 5 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:134:5: ^( EXPLICIT_SEEK ^( YEAR_OF year= INT ) )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek716); 
					match(input, Token.DOWN, null); 
					match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_seek719); 
					match(input, Token.DOWN, null); 
					year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek723); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.seekToYear((year!=null?year.getText():null));
					}
					break;
				case 6 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:137:5: ^( EXPLICIT_SEEK HOLIDAY ^( YEAR_OF year= INT ) )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek743); 
					match(input, Token.DOWN, null); 
					HOLIDAY16=(CommonTree)match(input,HOLIDAY,FOLLOW_HOLIDAY_in_explicit_seek745); 
					match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_seek748); 
					match(input, Token.DOWN, null); 
					year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek752); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.seekToHolidayYear((HOLIDAY16!=null?HOLIDAY16.getText():null), (year!=null?year.getText():null));
					}
					break;
				case 7 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:140:5: ^( EXPLICIT_SEEK SEASON ^( YEAR_OF year= INT ) )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek772); 
					match(input, Token.DOWN, null); 
					SEASON17=(CommonTree)match(input,SEASON,FOLLOW_SEASON_in_explicit_seek774); 
					match(input,YEAR_OF,FOLLOW_YEAR_OF_in_explicit_seek777); 
					match(input, Token.DOWN, null); 
					year=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek781); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.seekToSeasonYear((SEASON17!=null?SEASON17.getText():null), (year!=null?year.getText():null));
					}
					break;
				case 8 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:143:5: ^( EXPLICIT_SEEK index= INT ^( DAY_OF_WEEK day= INT ) )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek801); 
					match(input, Token.DOWN, null); 
					index=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek805); 
					match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_explicit_seek808); 
					match(input, Token.DOWN, null); 
					day=(CommonTree)match(input,INT,FOLLOW_INT_in_explicit_seek812); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					_walkerState.setDayOfWeekIndex((index!=null?index.getText():null), (day!=null?day.getText():null));
					}
					break;
				case 9 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateWalker.g:146:5: ^( EXPLICIT_SEEK explicit_time )
					{
					match(input,EXPLICIT_SEEK,FOLLOW_EXPLICIT_SEEK_in_explicit_seek832); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_explicit_time_in_explicit_seek834);
					explicit_time();
					state._fsp--;

					match(input, Token.UP, null); 

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
	}
	// $ANTLR end "explicit_seek"

	// Delegated rules



	public static final BitSet FOLLOW_date_time_alternative_in_parse51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_recurrence_in_parse53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECURRENCE_in_recurrence77 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_date_time_in_recurrence79 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DATE_TIME_ALTERNATIVE_in_date_time_alternative98 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_date_time_in_date_time_alternative100 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_DATE_TIME_in_date_time123 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_date_in_date_time125 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_time_in_date_time128 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_relative_date_in_date147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_explicit_date_in_date154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_seek_in_relative_date172 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_explicit_seek_in_relative_date175 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WEEK_INDEX_in_week_index193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_week_index197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_week_index200 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_week_index204 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_date231 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_date235 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_date239 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_date243 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_date257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_date261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_YEAR_OF_in_explicit_date268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_date272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_explicit_time_in_time297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relative_time_in_time303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPLICIT_TIME_in_explicit_time319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_HOURS_OF_DAY_in_explicit_time322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_time326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUTES_OF_HOUR_in_explicit_time331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_time335 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SECONDS_OF_MINUTE_in_explicit_time350 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_time354 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AM_PM_in_explicit_time359 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000030000L});
	public static final BitSet FOLLOW_ZONE_in_explicit_time365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ZONE_OFFSET_in_explicit_time371 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RELATIVE_TIME_in_relative_time396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_seek_in_relative_time398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_seek415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_seek417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_seek421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_seek425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_seek428 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_seek432 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_date_in_seek436 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_seek456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_seek458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_seek460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_seek464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_seek467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_seek471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_seek489 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_seek491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_seek493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040020000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_explicit_seek_in_seek496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_relative_date_in_seek500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_seek504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SPAN_in_seek506 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_seek523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_seek525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_seek527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_seek529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_date_in_seek531 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_seek550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_seek552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_seek554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_seek556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_HOLIDAY_in_seek558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEEK_in_seek577 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIRECTION_in_seek579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_SEEK_BY_in_seek581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_INT_in_seek583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_SEASON_in_seek585 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek608 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MONTH_OF_YEAR_in_explicit_seek611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek635 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DAY_OF_MONTH_in_explicit_seek638 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek642 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_seek665 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek669 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek689 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DAY_OF_YEAR_in_explicit_seek692 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek696 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek716 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_YEAR_OF_in_explicit_seek719 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek723 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek743 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_HOLIDAY_in_explicit_seek745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_YEAR_OF_in_explicit_seek748 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek752 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek772 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEASON_in_explicit_seek774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_YEAR_OF_in_explicit_seek777 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek781 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek801 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_DAY_OF_WEEK_in_explicit_seek808 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_explicit_seek812 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPLICIT_SEEK_in_explicit_seek832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_explicit_time_in_explicit_seek834 = new BitSet(new long[]{0x0000000000000008L});
}
