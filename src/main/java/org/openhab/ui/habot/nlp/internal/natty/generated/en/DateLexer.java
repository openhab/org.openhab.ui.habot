// $ANTLR 3.5.2 org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g 2018-03-09 01:56:55
 package org.openhab.ui.habot.nlp.internal.natty.generated.en; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DateLexer extends Lexer {
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

	  private static org.slf4j.Logger _logger =
	    org.slf4j.LoggerFactory.getLogger(org.openhab.ui.habot.nlp.internal.natty.generated.en.DateLexer.class);

	  @Override
	  public void displayRecognitionError(String[] tokenNames, RecognitionException re) {
	    String message = getErrorHeader(re);
	    try { message += getErrorMessage(re, tokenNames); } catch(Exception e) {}
	    _logger.debug(message);
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DateLexer() {} 
	public DateLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DateLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g"; }

	// $ANTLR start "JANUARY"
	public final void mJANUARY() throws RecognitionException {
		try {
			int _type = JANUARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:19:11: ( 'january' ( 's' )? | 'jan' ( DOT )? )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='j') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='a') ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2=='n') ) {
						int LA3_3 = input.LA(4);
						if ( (LA3_3=='u') ) {
							alt3=1;
						}

						else {
							alt3=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
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
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:19:13: 'january' ( 's' )?
					{
					match("january"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:19:25: ( 's' )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0=='s') ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:19:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:19:33: 'jan' ( DOT )?
					{
					match("jan"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:19:39: ( DOT )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='.') ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JANUARY"

	// $ANTLR start "FEBRUARY"
	public final void mFEBRUARY() throws RecognitionException {
		try {
			int _type = FEBRUARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:20:11: ( 'february' ( 's' )? | 'feb' ( DOT )? )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='f') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='e') ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2=='b') ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3=='r') ) {
							alt6=1;
						}

						else {
							alt6=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
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
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:20:13: 'february' ( 's' )?
					{
					match("february"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:20:25: ( 's' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='s') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:20:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:20:33: 'feb' ( DOT )?
					{
					match("feb"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:20:39: ( DOT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='.') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FEBRUARY"

	// $ANTLR start "MARCH"
	public final void mMARCH() throws RecognitionException {
		try {
			int _type = MARCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:21:11: ( 'march' ( 'es' )? | 'mar' ( DOT )? )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='m') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='a') ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2=='r') ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3=='c') ) {
							alt9=1;
						}

						else {
							alt9=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
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
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:21:13: 'march' ( 'es' )?
					{
					match("march"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:21:25: ( 'es' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:21:25: 'es'
							{
							match("es"); 

							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:21:33: 'mar' ( DOT )?
					{
					match("mar"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:21:39: ( DOT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='.') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MARCH"

	// $ANTLR start "APRIL"
	public final void mAPRIL() throws RecognitionException {
		try {
			int _type = APRIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:22:11: ( 'april' ( 's' )? | 'apr' ( DOT )? )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='a') ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='p') ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2=='r') ) {
						int LA12_3 = input.LA(4);
						if ( (LA12_3=='i') ) {
							alt12=1;
						}

						else {
							alt12=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
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
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:22:13: 'april' ( 's' )?
					{
					match("april"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:22:25: ( 's' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='s') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:22:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:22:33: 'apr' ( DOT )?
					{
					match("apr"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:22:39: ( DOT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='.') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APRIL"

	// $ANTLR start "MAY"
	public final void mMAY() throws RecognitionException {
		try {
			int _type = MAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:23:11: ( 'may' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:23:13: 'may' ( 's' )?
			{
			match("may"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:23:25: ( 's' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='s') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:23:25: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAY"

	// $ANTLR start "JUNE"
	public final void mJUNE() throws RecognitionException {
		try {
			int _type = JUNE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:24:11: ( 'june' ( 's' )? | 'jun' ( DOT )? )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='j') ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1=='u') ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2=='n') ) {
						int LA16_3 = input.LA(4);
						if ( (LA16_3=='e') ) {
							alt16=1;
						}

						else {
							alt16=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
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
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:24:13: 'june' ( 's' )?
					{
					match("june"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:24:25: ( 's' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='s') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:24:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:24:33: 'jun' ( DOT )?
					{
					match("jun"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:24:39: ( DOT )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='.') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JUNE"

	// $ANTLR start "JULY"
	public final void mJULY() throws RecognitionException {
		try {
			int _type = JULY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:25:11: ( 'july' ( 's' )? | 'jul' ( DOT )? )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='j') ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1=='u') ) {
					int LA19_2 = input.LA(3);
					if ( (LA19_2=='l') ) {
						int LA19_3 = input.LA(4);
						if ( (LA19_3=='y') ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:25:13: 'july' ( 's' )?
					{
					match("july"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:25:25: ( 's' )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='s') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:25:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:25:33: 'jul' ( DOT )?
					{
					match("jul"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:25:39: ( DOT )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0=='.') ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JULY"

	// $ANTLR start "AUGUST"
	public final void mAUGUST() throws RecognitionException {
		try {
			int _type = AUGUST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:26:11: ( 'august' ( 's' )? | 'aug' ( DOT )? )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='a') ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1=='u') ) {
					int LA22_2 = input.LA(3);
					if ( (LA22_2=='g') ) {
						int LA22_3 = input.LA(4);
						if ( (LA22_3=='u') ) {
							alt22=1;
						}

						else {
							alt22=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 2, input);
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
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:26:13: 'august' ( 's' )?
					{
					match("august"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:26:25: ( 's' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0=='s') ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:26:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:26:33: 'aug' ( DOT )?
					{
					match("aug"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:26:39: ( DOT )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0=='.') ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUGUST"

	// $ANTLR start "SEPTEMBER"
	public final void mSEPTEMBER() throws RecognitionException {
		try {
			int _type = SEPTEMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:27:11: ( 'september' ( 's' )? | 'sep' ( DOT )? | 'sept' ( DOT )? )
			int alt26=3;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='s') ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1=='e') ) {
					int LA26_2 = input.LA(3);
					if ( (LA26_2=='p') ) {
						int LA26_3 = input.LA(4);
						if ( (LA26_3=='t') ) {
							int LA26_4 = input.LA(5);
							if ( (LA26_4=='e') ) {
								alt26=1;
							}

							else {
								alt26=3;
							}

						}

						else {
							alt26=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 2, input);
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
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:27:13: 'september' ( 's' )?
					{
					match("september"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:27:25: ( 's' )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0=='s') ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:27:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:27:33: 'sep' ( DOT )?
					{
					match("sep"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:27:39: ( DOT )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='.') ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:27:46: 'sept' ( DOT )?
					{
					match("sept"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:27:53: ( DOT )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0=='.') ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEPTEMBER"

	// $ANTLR start "OCTOBER"
	public final void mOCTOBER() throws RecognitionException {
		try {
			int _type = OCTOBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:28:11: ( 'october' ( 's' )? | 'oct' ( DOT )? )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='o') ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1=='c') ) {
					int LA29_2 = input.LA(3);
					if ( (LA29_2=='t') ) {
						int LA29_3 = input.LA(4);
						if ( (LA29_3=='o') ) {
							alt29=1;
						}

						else {
							alt29=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 2, input);
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
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:28:13: 'october' ( 's' )?
					{
					match("october"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:28:25: ( 's' )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0=='s') ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:28:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:28:33: 'oct' ( DOT )?
					{
					match("oct"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:28:39: ( DOT )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0=='.') ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTOBER"

	// $ANTLR start "NOVEMBER"
	public final void mNOVEMBER() throws RecognitionException {
		try {
			int _type = NOVEMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:29:11: ( 'november' ( 's' )? | 'nov' ( DOT )? )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='n') ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1=='o') ) {
					int LA32_2 = input.LA(3);
					if ( (LA32_2=='v') ) {
						int LA32_3 = input.LA(4);
						if ( (LA32_3=='e') ) {
							alt32=1;
						}

						else {
							alt32=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 2, input);
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
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:29:13: 'november' ( 's' )?
					{
					match("november"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:29:25: ( 's' )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0=='s') ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:29:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:29:33: 'nov' ( DOT )?
					{
					match("nov"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:29:39: ( DOT )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0=='.') ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOVEMBER"

	// $ANTLR start "DECEMBER"
	public final void mDECEMBER() throws RecognitionException {
		try {
			int _type = DECEMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:30:11: ( 'december' ( 's' )? | 'dec' ( DOT )? )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0=='d') ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1=='e') ) {
					int LA35_2 = input.LA(3);
					if ( (LA35_2=='c') ) {
						int LA35_3 = input.LA(4);
						if ( (LA35_3=='e') ) {
							alt35=1;
						}

						else {
							alt35=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 2, input);
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
							new NoViableAltException("", 35, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:30:13: 'december' ( 's' )?
					{
					match("december"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:30:25: ( 's' )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0=='s') ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:30:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:30:33: 'dec' ( DOT )?
					{
					match("dec"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:30:39: ( DOT )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0=='.') ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECEMBER"

	// $ANTLR start "SUNDAY"
	public final void mSUNDAY() throws RecognitionException {
		try {
			int _type = SUNDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:32:11: ( 'sunday' ( 's' )? | 'sun' ( DOT )? | 'suns' ( DOT )? )
			int alt39=3;
			int LA39_0 = input.LA(1);
			if ( (LA39_0=='s') ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1=='u') ) {
					int LA39_2 = input.LA(3);
					if ( (LA39_2=='n') ) {
						switch ( input.LA(4) ) {
						case 'd':
							{
							alt39=1;
							}
							break;
						case 's':
							{
							alt39=3;
							}
							break;
						default:
							alt39=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 2, input);
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
							new NoViableAltException("", 39, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:32:13: 'sunday' ( 's' )?
					{
					match("sunday"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:32:25: ( 's' )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0=='s') ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:32:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:32:33: 'sun' ( DOT )?
					{
					match("sun"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:32:39: ( DOT )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0=='.') ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:32:47: 'suns' ( DOT )?
					{
					match("suns"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:32:54: ( DOT )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0=='.') ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUNDAY"

	// $ANTLR start "MONDAY"
	public final void mMONDAY() throws RecognitionException {
		try {
			int _type = MONDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:33:11: ( 'monday' ( 's' )? | 'mon' ( DOT )? | 'mons' ( DOT )? )
			int alt43=3;
			int LA43_0 = input.LA(1);
			if ( (LA43_0=='m') ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1=='o') ) {
					int LA43_2 = input.LA(3);
					if ( (LA43_2=='n') ) {
						switch ( input.LA(4) ) {
						case 'd':
							{
							alt43=1;
							}
							break;
						case 's':
							{
							alt43=3;
							}
							break;
						default:
							alt43=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 43, 2, input);
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
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:33:13: 'monday' ( 's' )?
					{
					match("monday"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:33:25: ( 's' )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0=='s') ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:33:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:33:33: 'mon' ( DOT )?
					{
					match("mon"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:33:39: ( DOT )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0=='.') ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:33:47: 'mons' ( DOT )?
					{
					match("mons"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:33:54: ( DOT )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0=='.') ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MONDAY"

	// $ANTLR start "TUESDAY"
	public final void mTUESDAY() throws RecognitionException {
		try {
			int _type = TUESDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:34:11: ( 'tuesday' ( 's' )? | 'tues' ( DOT )? | 'tue' ( DOT )? )
			int alt47=3;
			int LA47_0 = input.LA(1);
			if ( (LA47_0=='t') ) {
				int LA47_1 = input.LA(2);
				if ( (LA47_1=='u') ) {
					int LA47_2 = input.LA(3);
					if ( (LA47_2=='e') ) {
						int LA47_3 = input.LA(4);
						if ( (LA47_3=='s') ) {
							int LA47_4 = input.LA(5);
							if ( (LA47_4=='d') ) {
								alt47=1;
							}

							else {
								alt47=2;
							}

						}

						else {
							alt47=3;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 2, input);
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
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:34:13: 'tuesday' ( 's' )?
					{
					match("tuesday"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:34:25: ( 's' )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0=='s') ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:34:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:34:33: 'tues' ( DOT )?
					{
					match("tues"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:34:40: ( DOT )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0=='.') ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:34:47: 'tue' ( DOT )?
					{
					match("tue"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:34:53: ( DOT )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0=='.') ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TUESDAY"

	// $ANTLR start "WEDNESDAY"
	public final void mWEDNESDAY() throws RecognitionException {
		try {
			int _type = WEDNESDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:35:11: ( 'wednesday' ( 's' )? | 'wed' ( DOT )? | 'weds' ( DOT )? )
			int alt51=3;
			int LA51_0 = input.LA(1);
			if ( (LA51_0=='w') ) {
				int LA51_1 = input.LA(2);
				if ( (LA51_1=='e') ) {
					int LA51_2 = input.LA(3);
					if ( (LA51_2=='d') ) {
						switch ( input.LA(4) ) {
						case 'n':
							{
							alt51=1;
							}
							break;
						case 's':
							{
							alt51=3;
							}
							break;
						default:
							alt51=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 51, 2, input);
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
							new NoViableAltException("", 51, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:35:13: 'wednesday' ( 's' )?
					{
					match("wednesday"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:35:25: ( 's' )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0=='s') ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:35:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:35:33: 'wed' ( DOT )?
					{
					match("wed"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:35:39: ( DOT )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0=='.') ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:35:47: 'weds' ( DOT )?
					{
					match("weds"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:35:54: ( DOT )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0=='.') ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WEDNESDAY"

	// $ANTLR start "THURSDAY"
	public final void mTHURSDAY() throws RecognitionException {
		try {
			int _type = THURSDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:11: ( 'thursday' ( 's' )? | 'thur' ( DOT )? | 'thu' ( DOT )? | 'thus' ( DOT )? | 'thurs' ( DOT )? )
			int alt57=5;
			int LA57_0 = input.LA(1);
			if ( (LA57_0=='t') ) {
				int LA57_1 = input.LA(2);
				if ( (LA57_1=='h') ) {
					int LA57_2 = input.LA(3);
					if ( (LA57_2=='u') ) {
						switch ( input.LA(4) ) {
						case 'r':
							{
							int LA57_4 = input.LA(5);
							if ( (LA57_4=='s') ) {
								int LA57_7 = input.LA(6);
								if ( (LA57_7=='d') ) {
									alt57=1;
								}

								else {
									alt57=5;
								}

							}

							else {
								alt57=2;
							}

							}
							break;
						case 's':
							{
							alt57=4;
							}
							break;
						default:
							alt57=3;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 57, 2, input);
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
							new NoViableAltException("", 57, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:13: 'thursday' ( 's' )?
					{
					match("thursday"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:25: ( 's' )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0=='s') ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:33: 'thur' ( DOT )?
					{
					match("thur"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:40: ( DOT )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0=='.') ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:47: 'thu' ( DOT )?
					{
					match("thu"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:53: ( DOT )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0=='.') ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:62: 'thus' ( DOT )?
					{
					match("thus"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:69: ( DOT )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0=='.') ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 5 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:76: 'thurs' ( DOT )?
					{
					match("thurs"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:36:84: ( DOT )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0=='.') ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THURSDAY"

	// $ANTLR start "FRIDAY"
	public final void mFRIDAY() throws RecognitionException {
		try {
			int _type = FRIDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:37:11: ( 'friday' ( 's' )? | 'fri' ( DOT )? | 'fris' ( DOT )? )
			int alt61=3;
			int LA61_0 = input.LA(1);
			if ( (LA61_0=='f') ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1=='r') ) {
					int LA61_2 = input.LA(3);
					if ( (LA61_2=='i') ) {
						switch ( input.LA(4) ) {
						case 'd':
							{
							alt61=1;
							}
							break;
						case 's':
							{
							alt61=3;
							}
							break;
						default:
							alt61=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 61, 2, input);
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
							new NoViableAltException("", 61, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:37:13: 'friday' ( 's' )?
					{
					match("friday"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:37:25: ( 's' )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0=='s') ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:37:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:37:33: 'fri' ( DOT )?
					{
					match("fri"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:37:39: ( DOT )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0=='.') ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:37:47: 'fris' ( DOT )?
					{
					match("fris"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:37:54: ( DOT )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0=='.') ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FRIDAY"

	// $ANTLR start "SATURDAY"
	public final void mSATURDAY() throws RecognitionException {
		try {
			int _type = SATURDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:11: ( 'saturday' ( 's' )? | 'sat' ( DOT )? | 'sats' ( DOT )? | 'weekend' )
			int alt65=4;
			int LA65_0 = input.LA(1);
			if ( (LA65_0=='s') ) {
				int LA65_1 = input.LA(2);
				if ( (LA65_1=='a') ) {
					int LA65_3 = input.LA(3);
					if ( (LA65_3=='t') ) {
						switch ( input.LA(4) ) {
						case 'u':
							{
							alt65=1;
							}
							break;
						case 's':
							{
							alt65=3;
							}
							break;
						default:
							alt65=2;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 65, 3, input);
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
							new NoViableAltException("", 65, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA65_0=='w') ) {
				alt65=4;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:13: 'saturday' ( 's' )?
					{
					match("saturday"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:25: ( 's' )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0=='s') ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:33: 'sat' ( DOT )?
					{
					match("sat"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:39: ( DOT )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0=='.') ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:47: 'sats' ( DOT )?
					{
					match("sats"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:54: ( DOT )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0=='.') ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:38:62: 'weekend'
					{
					match("weekend"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SATURDAY"

	// $ANTLR start "HOUR"
	public final void mHOUR() throws RecognitionException {
		try {
			int _type = HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:40:8: ( 'hour' | 'hours' | 'hr' ( DOT )? | 'hrs' ( DOT )? )
			int alt68=4;
			int LA68_0 = input.LA(1);
			if ( (LA68_0=='h') ) {
				int LA68_1 = input.LA(2);
				if ( (LA68_1=='o') ) {
					int LA68_2 = input.LA(3);
					if ( (LA68_2=='u') ) {
						int LA68_4 = input.LA(4);
						if ( (LA68_4=='r') ) {
							int LA68_7 = input.LA(5);
							if ( (LA68_7=='s') ) {
								alt68=2;
							}

							else {
								alt68=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 68, 4, input);
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
								new NoViableAltException("", 68, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA68_1=='r') ) {
					int LA68_3 = input.LA(3);
					if ( (LA68_3=='s') ) {
						alt68=4;
					}

					else {
						alt68=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:40:10: 'hour'
					{
					match("hour"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:40:21: 'hours'
					{
					match("hours"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:40:33: 'hr' ( DOT )?
					{
					match("hr"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:40:38: ( DOT )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0=='.') ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:40:46: 'hrs' ( DOT )?
					{
					match("hrs"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:40:52: ( DOT )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0=='.') ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOUR"

	// $ANTLR start "MINUTE"
	public final void mMINUTE() throws RecognitionException {
		try {
			int _type = MINUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:41:8: ( 'minute' | 'minutes' | 'min' ( DOT )? | 'mins' ( DOT )? )
			int alt71=4;
			int LA71_0 = input.LA(1);
			if ( (LA71_0=='m') ) {
				int LA71_1 = input.LA(2);
				if ( (LA71_1=='i') ) {
					int LA71_2 = input.LA(3);
					if ( (LA71_2=='n') ) {
						switch ( input.LA(4) ) {
						case 'u':
							{
							int LA71_4 = input.LA(5);
							if ( (LA71_4=='t') ) {
								int LA71_7 = input.LA(6);
								if ( (LA71_7=='e') ) {
									int LA71_8 = input.LA(7);
									if ( (LA71_8=='s') ) {
										alt71=2;
									}

									else {
										alt71=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 71, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 71, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 's':
							{
							alt71=4;
							}
							break;
						default:
							alt71=3;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 71, 2, input);
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
							new NoViableAltException("", 71, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:41:10: 'minute'
					{
					match("minute"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:41:21: 'minutes'
					{
					match("minutes"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:41:33: 'min' ( DOT )?
					{
					match("min"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:41:39: ( DOT )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0=='.') ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:41:46: 'mins' ( DOT )?
					{
					match("mins"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:41:53: ( DOT )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0=='.') ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUTE"

	// $ANTLR start "DAY"
	public final void mDAY() throws RecognitionException {
		try {
			int _type = DAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:42:8: ( 'day' | 'days' )
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0=='d') ) {
				int LA72_1 = input.LA(2);
				if ( (LA72_1=='a') ) {
					int LA72_2 = input.LA(3);
					if ( (LA72_2=='y') ) {
						int LA72_3 = input.LA(4);
						if ( (LA72_3=='s') ) {
							alt72=2;
						}

						else {
							alt72=1;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 72, 2, input);
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
							new NoViableAltException("", 72, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}

			switch (alt72) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:42:10: 'day'
					{
					match("day"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:42:21: 'days'
					{
					match("days"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DAY"

	// $ANTLR start "WEEK"
	public final void mWEEK() throws RecognitionException {
		try {
			int _type = WEEK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:43:8: ( 'week' | 'weeks' | 'wks' ( DOT )? )
			int alt74=3;
			int LA74_0 = input.LA(1);
			if ( (LA74_0=='w') ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1=='e') ) {
					int LA74_2 = input.LA(3);
					if ( (LA74_2=='e') ) {
						int LA74_4 = input.LA(4);
						if ( (LA74_4=='k') ) {
							int LA74_5 = input.LA(5);
							if ( (LA74_5=='s') ) {
								alt74=2;
							}

							else {
								alt74=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 74, 4, input);
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
								new NoViableAltException("", 74, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA74_1=='k') ) {
					alt74=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:43:10: 'week'
					{
					match("week"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:43:21: 'weeks'
					{
					match("weeks"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:43:33: 'wks' ( DOT )?
					{
					match("wks"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:43:39: ( DOT )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0=='.') ) {
						alt73=1;
					}
					switch (alt73) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WEEK"

	// $ANTLR start "MONTH"
	public final void mMONTH() throws RecognitionException {
		try {
			int _type = MONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:44:8: ( 'month' | 'months' )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0=='m') ) {
				int LA75_1 = input.LA(2);
				if ( (LA75_1=='o') ) {
					int LA75_2 = input.LA(3);
					if ( (LA75_2=='n') ) {
						int LA75_3 = input.LA(4);
						if ( (LA75_3=='t') ) {
							int LA75_4 = input.LA(5);
							if ( (LA75_4=='h') ) {
								int LA75_5 = input.LA(6);
								if ( (LA75_5=='s') ) {
									alt75=2;
								}

								else {
									alt75=1;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 75, 4, input);
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
									new NoViableAltException("", 75, 3, input);
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
								new NoViableAltException("", 75, 2, input);
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
							new NoViableAltException("", 75, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:44:10: 'month'
					{
					match("month"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:44:21: 'months'
					{
					match("months"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MONTH"

	// $ANTLR start "YEAR"
	public final void mYEAR() throws RecognitionException {
		try {
			int _type = YEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:45:8: ( 'year' | 'year' ( SINGLE_QUOTE )? 's' | 'yrs' ( DOT )? )
			int alt78=3;
			int LA78_0 = input.LA(1);
			if ( (LA78_0=='y') ) {
				int LA78_1 = input.LA(2);
				if ( (LA78_1=='e') ) {
					int LA78_2 = input.LA(3);
					if ( (LA78_2=='a') ) {
						int LA78_4 = input.LA(4);
						if ( (LA78_4=='r') ) {
							int LA78_5 = input.LA(5);
							if ( (LA78_5=='\''||LA78_5=='s') ) {
								alt78=2;
							}

							else {
								alt78=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 78, 4, input);
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
								new NoViableAltException("", 78, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA78_1=='r') ) {
					alt78=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:45:10: 'year'
					{
					match("year"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:45:21: 'year' ( SINGLE_QUOTE )? 's'
					{
					match("year"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:45:28: ( SINGLE_QUOTE )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0=='\'') ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='\'' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					match('s'); 
					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:45:48: 'yrs' ( DOT )?
					{
					match("yrs"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:45:54: ( DOT )?
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0=='.') ) {
						alt77=1;
					}
					switch (alt77) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YEAR"

	// $ANTLR start "TODAY"
	public final void mTODAY() throws RecognitionException {
		try {
			int _type = TODAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:47:11: ( 'today' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:47:13: 'today'
			{
			match("today"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TODAY"

	// $ANTLR start "TOMORROW"
	public final void mTOMORROW() throws RecognitionException {
		try {
			int _type = TOMORROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:48:11: ( 'tomorow' | 'tomorrow' | 'tommorow' | 'tommorrow' | 'tmr' )
			int alt79=5;
			int LA79_0 = input.LA(1);
			if ( (LA79_0=='t') ) {
				int LA79_1 = input.LA(2);
				if ( (LA79_1=='o') ) {
					int LA79_2 = input.LA(3);
					if ( (LA79_2=='m') ) {
						int LA79_4 = input.LA(4);
						if ( (LA79_4=='o') ) {
							int LA79_5 = input.LA(5);
							if ( (LA79_5=='r') ) {
								int LA79_7 = input.LA(6);
								if ( (LA79_7=='o') ) {
									alt79=1;
								}
								else if ( (LA79_7=='r') ) {
									alt79=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 79, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 79, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA79_4=='m') ) {
							int LA79_6 = input.LA(5);
							if ( (LA79_6=='o') ) {
								int LA79_8 = input.LA(6);
								if ( (LA79_8=='r') ) {
									int LA79_11 = input.LA(7);
									if ( (LA79_11=='o') ) {
										alt79=3;
									}
									else if ( (LA79_11=='r') ) {
										alt79=4;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 79, 11, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 79, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 79, 6, input);
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
									new NoViableAltException("", 79, 4, input);
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
								new NoViableAltException("", 79, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA79_1=='m') ) {
					alt79=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 79, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:48:13: 'tomorow'
					{
					match("tomorow"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:48:25: 'tomorrow'
					{
					match("tomorrow"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:48:38: 'tommorow'
					{
					match("tommorow"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:48:51: 'tommorrow'
					{
					match("tommorrow"); 

					}
					break;
				case 5 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:48:65: 'tmr'
					{
					match("tmr"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOMORROW"

	// $ANTLR start "TONIGHT"
	public final void mTONIGHT() throws RecognitionException {
		try {
			int _type = TONIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:49:11: ( 'tonight' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:49:13: 'tonight'
			{
			match("tonight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TONIGHT"

	// $ANTLR start "YESTERDAY"
	public final void mYESTERDAY() throws RecognitionException {
		try {
			int _type = YESTERDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:50:11: ( 'yesterday' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:50:13: 'yesterday'
			{
			match("yesterday"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YESTERDAY"

	// $ANTLR start "EVERY"
	public final void mEVERY() throws RecognitionException {
		try {
			int _type = EVERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:54:7: ( 'every' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:54:9: 'every'
			{
			match("every"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EVERY"

	// $ANTLR start "UNTIL"
	public final void mUNTIL() throws RecognitionException {
		try {
			int _type = UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:55:7: ( 'until' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:55:9: 'until'
			{
			match("until"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNTIL"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:59:11: ( 'at' | '@' )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0=='a') ) {
				alt80=1;
			}
			else if ( (LA80_0=='@') ) {
				alt80=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:59:13: 'at'
					{
					match("at"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:59:20: '@'
					{
					match('@'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "AFTER"
	public final void mAFTER() throws RecognitionException {
		try {
			int _type = AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:60:11: ( 'after' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:60:13: 'after'
			{
			match("after"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AFTER"

	// $ANTLR start "PAST"
	public final void mPAST() throws RecognitionException {
		try {
			int _type = PAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:61:11: ( 'past' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:61:13: 'past'
			{
			match("past"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAST"

	// $ANTLR start "AM"
	public final void mAM() throws RecognitionException {
		try {
			int _type = AM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:62:4: ( 'am' | 'a.m' ( DOT )? | 'a_m' | 'a' )
			int alt82=4;
			int LA82_0 = input.LA(1);
			if ( (LA82_0=='a') ) {
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt82=1;
					}
					break;
				case '.':
					{
					alt82=2;
					}
					break;
				case '_':
					{
					alt82=3;
					}
					break;
				default:
					alt82=4;
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:62:6: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:62:13: 'a.m' ( DOT )?
					{
					match("a.m"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:62:19: ( DOT )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0=='.') ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:62:26: 'a_m'
					{
					match("a_m"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:62:34: 'a'
					{
					match('a'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AM"

	// $ANTLR start "PM"
	public final void mPM() throws RecognitionException {
		try {
			int _type = PM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:63:4: ( 'pm' | 'p.m' ( DOT )? | 'p_m' | 'p' )
			int alt84=4;
			int LA84_0 = input.LA(1);
			if ( (LA84_0=='p') ) {
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt84=1;
					}
					break;
				case '.':
					{
					alt84=2;
					}
					break;
				case '_':
					{
					alt84=3;
					}
					break;
				default:
					alt84=4;
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:63:6: 'pm'
					{
					match("pm"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:63:13: 'p.m' ( DOT )?
					{
					match("p.m"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:63:19: ( DOT )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0=='.') ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
							{
							if ( input.LA(1)=='.' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:63:26: 'p_m'
					{
					match("p_m"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:63:34: 'p'
					{
					match('p'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PM"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			int _type = T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:64:4: ( 't' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:64:6: 't'
			{
			match('t'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "MILITARY_HOUR_SUFFIX"
	public final void mMILITARY_HOUR_SUFFIX() throws RecognitionException {
		try {
			int _type = MILITARY_HOUR_SUFFIX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:66:22: ( 'h' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:66:24: 'h'
			{
			match('h'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MILITARY_HOUR_SUFFIX"

	// $ANTLR start "MIDNIGHT"
	public final void mMIDNIGHT() throws RecognitionException {
		try {
			int _type = MIDNIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:68:11: ( 'midnight' | 'mid-night' )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0=='m') ) {
				int LA85_1 = input.LA(2);
				if ( (LA85_1=='i') ) {
					int LA85_2 = input.LA(3);
					if ( (LA85_2=='d') ) {
						int LA85_3 = input.LA(4);
						if ( (LA85_3=='n') ) {
							alt85=1;
						}
						else if ( (LA85_3=='-') ) {
							alt85=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 85, 3, input);
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
								new NoViableAltException("", 85, 2, input);
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
							new NoViableAltException("", 85, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}

			switch (alt85) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:68:13: 'midnight'
					{
					match("midnight"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:68:26: 'mid-night'
					{
					match("mid-night"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIDNIGHT"

	// $ANTLR start "NOON"
	public final void mNOON() throws RecognitionException {
		try {
			int _type = NOON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:69:11: ( 'noon' | 'afternoon' | 'after-noon' )
			int alt86=3;
			int LA86_0 = input.LA(1);
			if ( (LA86_0=='n') ) {
				alt86=1;
			}
			else if ( (LA86_0=='a') ) {
				int LA86_2 = input.LA(2);
				if ( (LA86_2=='f') ) {
					int LA86_3 = input.LA(3);
					if ( (LA86_3=='t') ) {
						int LA86_4 = input.LA(4);
						if ( (LA86_4=='e') ) {
							int LA86_5 = input.LA(5);
							if ( (LA86_5=='r') ) {
								int LA86_6 = input.LA(6);
								if ( (LA86_6=='n') ) {
									alt86=2;
								}
								else if ( (LA86_6=='-') ) {
									alt86=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 86, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 86, 5, input);
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
									new NoViableAltException("", 86, 4, input);
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
								new NoViableAltException("", 86, 3, input);
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
							new NoViableAltException("", 86, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}

			switch (alt86) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:69:13: 'noon'
					{
					match("noon"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:69:26: 'afternoon'
					{
					match("afternoon"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:69:40: 'after-noon'
					{
					match("after-noon"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOON"

	// $ANTLR start "MORNING"
	public final void mMORNING() throws RecognitionException {
		try {
			int _type = MORNING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:70:11: ( 'morning' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:70:13: 'morning'
			{
			match("morning"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MORNING"

	// $ANTLR start "EVENING"
	public final void mEVENING() throws RecognitionException {
		try {
			int _type = EVENING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:71:11: ( 'evening' | 'eve' )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0=='e') ) {
				int LA87_1 = input.LA(2);
				if ( (LA87_1=='v') ) {
					int LA87_2 = input.LA(3);
					if ( (LA87_2=='e') ) {
						int LA87_3 = input.LA(4);
						if ( (LA87_3=='n') ) {
							alt87=1;
						}

						else {
							alt87=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 87, 2, input);
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
							new NoViableAltException("", 87, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:71:13: 'evening'
					{
					match("evening"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:71:25: 'eve'
					{
					match("eve"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EVENING"

	// $ANTLR start "NIGHT"
	public final void mNIGHT() throws RecognitionException {
		try {
			int _type = NIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:72:11: ( 'night' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:72:13: 'night'
			{
			match("night"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NIGHT"

	// $ANTLR start "UTC"
	public final void mUTC() throws RecognitionException {
		try {
			int _type = UTC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:74:6: ( 'utc' | 'gmt' | 'z' )
			int alt88=3;
			switch ( input.LA(1) ) {
			case 'u':
				{
				alt88=1;
				}
				break;
			case 'g':
				{
				alt88=2;
				}
				break;
			case 'z':
				{
				alt88=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:74:8: 'utc'
					{
					match("utc"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:74:17: 'gmt'
					{
					match("gmt"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:74:26: 'z'
					{
					match('z'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTC"

	// $ANTLR start "EST"
	public final void mEST() throws RecognitionException {
		try {
			int _type = EST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:75:6: ( 'est' | 'edt' | 'et' | 'eastern' )
			int alt89=4;
			int LA89_0 = input.LA(1);
			if ( (LA89_0=='e') ) {
				switch ( input.LA(2) ) {
				case 's':
					{
					alt89=1;
					}
					break;
				case 'd':
					{
					alt89=2;
					}
					break;
				case 't':
					{
					alt89=3;
					}
					break;
				case 'a':
					{
					alt89=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}

			switch (alt89) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:75:8: 'est'
					{
					match("est"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:75:17: 'edt'
					{
					match("edt"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:75:26: 'et'
					{
					match("et"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:75:34: 'eastern'
					{
					match("eastern"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EST"

	// $ANTLR start "PST"
	public final void mPST() throws RecognitionException {
		try {
			int _type = PST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:76:6: ( 'pst' | 'pdt' | 'pt' | 'pacific' )
			int alt90=4;
			int LA90_0 = input.LA(1);
			if ( (LA90_0=='p') ) {
				switch ( input.LA(2) ) {
				case 's':
					{
					alt90=1;
					}
					break;
				case 'd':
					{
					alt90=2;
					}
					break;
				case 't':
					{
					alt90=3;
					}
					break;
				case 'a':
					{
					alt90=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 90, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}

			switch (alt90) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:76:8: 'pst'
					{
					match("pst"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:76:17: 'pdt'
					{
					match("pdt"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:76:26: 'pt'
					{
					match("pt"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:76:34: 'pacific'
					{
					match("pacific"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PST"

	// $ANTLR start "CST"
	public final void mCST() throws RecognitionException {
		try {
			int _type = CST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:77:6: ( 'cst' | 'cdt' | 'ct' | 'central' )
			int alt91=4;
			int LA91_0 = input.LA(1);
			if ( (LA91_0=='c') ) {
				switch ( input.LA(2) ) {
				case 's':
					{
					alt91=1;
					}
					break;
				case 'd':
					{
					alt91=2;
					}
					break;
				case 't':
					{
					alt91=3;
					}
					break;
				case 'e':
					{
					alt91=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 91, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}

			switch (alt91) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:77:8: 'cst'
					{
					match("cst"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:77:17: 'cdt'
					{
					match("cdt"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:77:26: 'ct'
					{
					match("ct"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:77:34: 'central'
					{
					match("central"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CST"

	// $ANTLR start "MST"
	public final void mMST() throws RecognitionException {
		try {
			int _type = MST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:78:6: ( 'mst' | 'mdt' | 'mt' | 'mountain' )
			int alt92=4;
			int LA92_0 = input.LA(1);
			if ( (LA92_0=='m') ) {
				switch ( input.LA(2) ) {
				case 's':
					{
					alt92=1;
					}
					break;
				case 'd':
					{
					alt92=2;
					}
					break;
				case 't':
					{
					alt92=3;
					}
					break;
				case 'o':
					{
					alt92=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:78:8: 'mst'
					{
					match("mst"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:78:17: 'mdt'
					{
					match("mdt"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:78:26: 'mt'
					{
					match("mt"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:78:34: 'mountain'
					{
					match("mountain"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MST"

	// $ANTLR start "AKST"
	public final void mAKST() throws RecognitionException {
		try {
			int _type = AKST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:79:6: ( 'akst' | 'akdt' | 'akt' | 'alaska' )
			int alt93=4;
			int LA93_0 = input.LA(1);
			if ( (LA93_0=='a') ) {
				int LA93_1 = input.LA(2);
				if ( (LA93_1=='k') ) {
					switch ( input.LA(3) ) {
					case 's':
						{
						alt93=1;
						}
						break;
					case 'd':
						{
						alt93=2;
						}
						break;
					case 't':
						{
						alt93=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 93, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA93_1=='l') ) {
					alt93=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 93, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}

			switch (alt93) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:79:8: 'akst'
					{
					match("akst"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:79:17: 'akdt'
					{
					match("akdt"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:79:26: 'akt'
					{
					match("akt"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:79:34: 'alaska'
					{
					match("alaska"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AKST"

	// $ANTLR start "HAST"
	public final void mHAST() throws RecognitionException {
		try {
			int _type = HAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:80:6: ( 'hast' | 'hadt' | 'hat' | 'hst' | 'hawaii' )
			int alt94=5;
			int LA94_0 = input.LA(1);
			if ( (LA94_0=='h') ) {
				int LA94_1 = input.LA(2);
				if ( (LA94_1=='a') ) {
					switch ( input.LA(3) ) {
					case 's':
						{
						alt94=1;
						}
						break;
					case 'd':
						{
						alt94=2;
						}
						break;
					case 't':
						{
						alt94=3;
						}
						break;
					case 'w':
						{
						alt94=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 94, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA94_1=='s') ) {
					alt94=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 94, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}

			switch (alt94) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:80:8: 'hast'
					{
					match("hast"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:80:17: 'hadt'
					{
					match("hadt"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:80:26: 'hat'
					{
					match("hat"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:80:34: 'hst'
					{
					match("hst"); 

					}
					break;
				case 5 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:80:42: 'hawaii'
					{
					match("hawaii"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HAST"

	// $ANTLR start "INT_00"
	public final void mINT_00() throws RecognitionException {
		try {
			int _type = INT_00;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:84:8: ( '00' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:84:10: '00'
			{
			match("00"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_00"

	// $ANTLR start "INT_01"
	public final void mINT_01() throws RecognitionException {
		try {
			int _type = INT_01;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:85:8: ( '01' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:85:10: '01'
			{
			match("01"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_01"

	// $ANTLR start "INT_02"
	public final void mINT_02() throws RecognitionException {
		try {
			int _type = INT_02;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:86:8: ( '02' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:86:10: '02'
			{
			match("02"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_02"

	// $ANTLR start "INT_03"
	public final void mINT_03() throws RecognitionException {
		try {
			int _type = INT_03;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:87:8: ( '03' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:87:10: '03'
			{
			match("03"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_03"

	// $ANTLR start "INT_04"
	public final void mINT_04() throws RecognitionException {
		try {
			int _type = INT_04;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:88:8: ( '04' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:88:10: '04'
			{
			match("04"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_04"

	// $ANTLR start "INT_05"
	public final void mINT_05() throws RecognitionException {
		try {
			int _type = INT_05;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:89:8: ( '05' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:89:10: '05'
			{
			match("05"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_05"

	// $ANTLR start "INT_06"
	public final void mINT_06() throws RecognitionException {
		try {
			int _type = INT_06;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:90:8: ( '06' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:90:10: '06'
			{
			match("06"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_06"

	// $ANTLR start "INT_07"
	public final void mINT_07() throws RecognitionException {
		try {
			int _type = INT_07;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:91:8: ( '07' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:91:10: '07'
			{
			match("07"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_07"

	// $ANTLR start "INT_08"
	public final void mINT_08() throws RecognitionException {
		try {
			int _type = INT_08;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:92:8: ( '08' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:92:10: '08'
			{
			match("08"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_08"

	// $ANTLR start "INT_09"
	public final void mINT_09() throws RecognitionException {
		try {
			int _type = INT_09;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:93:8: ( '09' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:93:10: '09'
			{
			match("09"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_09"

	// $ANTLR start "INT_0"
	public final void mINT_0() throws RecognitionException {
		try {
			int _type = INT_0;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:94:8: ( '0' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:94:10: '0'
			{
			match('0'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_0"

	// $ANTLR start "INT_1"
	public final void mINT_1() throws RecognitionException {
		try {
			int _type = INT_1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:95:8: ( '1' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:95:10: '1'
			{
			match('1'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_1"

	// $ANTLR start "INT_2"
	public final void mINT_2() throws RecognitionException {
		try {
			int _type = INT_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:96:8: ( '2' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:96:10: '2'
			{
			match('2'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_2"

	// $ANTLR start "INT_3"
	public final void mINT_3() throws RecognitionException {
		try {
			int _type = INT_3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:97:8: ( '3' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:97:10: '3'
			{
			match('3'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_3"

	// $ANTLR start "INT_4"
	public final void mINT_4() throws RecognitionException {
		try {
			int _type = INT_4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:98:8: ( '4' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:98:10: '4'
			{
			match('4'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_4"

	// $ANTLR start "INT_5"
	public final void mINT_5() throws RecognitionException {
		try {
			int _type = INT_5;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:99:8: ( '5' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:99:10: '5'
			{
			match('5'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_5"

	// $ANTLR start "INT_6"
	public final void mINT_6() throws RecognitionException {
		try {
			int _type = INT_6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:100:8: ( '6' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:100:10: '6'
			{
			match('6'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_6"

	// $ANTLR start "INT_7"
	public final void mINT_7() throws RecognitionException {
		try {
			int _type = INT_7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:101:8: ( '7' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:101:10: '7'
			{
			match('7'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_7"

	// $ANTLR start "INT_8"
	public final void mINT_8() throws RecognitionException {
		try {
			int _type = INT_8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:102:8: ( '8' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:102:10: '8'
			{
			match('8'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_8"

	// $ANTLR start "INT_9"
	public final void mINT_9() throws RecognitionException {
		try {
			int _type = INT_9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:103:8: ( '9' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:103:10: '9'
			{
			match('9'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_9"

	// $ANTLR start "INT_10"
	public final void mINT_10() throws RecognitionException {
		try {
			int _type = INT_10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:104:8: ( '10' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:104:10: '10'
			{
			match("10"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_10"

	// $ANTLR start "INT_11"
	public final void mINT_11() throws RecognitionException {
		try {
			int _type = INT_11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:105:8: ( '11' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:105:10: '11'
			{
			match("11"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_11"

	// $ANTLR start "INT_12"
	public final void mINT_12() throws RecognitionException {
		try {
			int _type = INT_12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:106:8: ( '12' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:106:10: '12'
			{
			match("12"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_12"

	// $ANTLR start "INT_13"
	public final void mINT_13() throws RecognitionException {
		try {
			int _type = INT_13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:107:8: ( '13' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:107:10: '13'
			{
			match("13"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_13"

	// $ANTLR start "INT_14"
	public final void mINT_14() throws RecognitionException {
		try {
			int _type = INT_14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:108:8: ( '14' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:108:10: '14'
			{
			match("14"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_14"

	// $ANTLR start "INT_15"
	public final void mINT_15() throws RecognitionException {
		try {
			int _type = INT_15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:109:8: ( '15' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:109:10: '15'
			{
			match("15"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_15"

	// $ANTLR start "INT_16"
	public final void mINT_16() throws RecognitionException {
		try {
			int _type = INT_16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:110:8: ( '16' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:110:10: '16'
			{
			match("16"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_16"

	// $ANTLR start "INT_17"
	public final void mINT_17() throws RecognitionException {
		try {
			int _type = INT_17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:111:8: ( '17' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:111:10: '17'
			{
			match("17"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_17"

	// $ANTLR start "INT_18"
	public final void mINT_18() throws RecognitionException {
		try {
			int _type = INT_18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:112:8: ( '18' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:112:10: '18'
			{
			match("18"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_18"

	// $ANTLR start "INT_19"
	public final void mINT_19() throws RecognitionException {
		try {
			int _type = INT_19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:113:8: ( '19' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:113:10: '19'
			{
			match("19"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_19"

	// $ANTLR start "INT_20"
	public final void mINT_20() throws RecognitionException {
		try {
			int _type = INT_20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:114:8: ( '20' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:114:10: '20'
			{
			match("20"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_20"

	// $ANTLR start "INT_21"
	public final void mINT_21() throws RecognitionException {
		try {
			int _type = INT_21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:115:8: ( '21' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:115:10: '21'
			{
			match("21"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_21"

	// $ANTLR start "INT_22"
	public final void mINT_22() throws RecognitionException {
		try {
			int _type = INT_22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:116:8: ( '22' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:116:10: '22'
			{
			match("22"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_22"

	// $ANTLR start "INT_23"
	public final void mINT_23() throws RecognitionException {
		try {
			int _type = INT_23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:117:8: ( '23' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:117:10: '23'
			{
			match("23"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_23"

	// $ANTLR start "INT_24"
	public final void mINT_24() throws RecognitionException {
		try {
			int _type = INT_24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:118:8: ( '24' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:118:10: '24'
			{
			match("24"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_24"

	// $ANTLR start "INT_25"
	public final void mINT_25() throws RecognitionException {
		try {
			int _type = INT_25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:119:8: ( '25' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:119:10: '25'
			{
			match("25"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_25"

	// $ANTLR start "INT_26"
	public final void mINT_26() throws RecognitionException {
		try {
			int _type = INT_26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:120:8: ( '26' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:120:10: '26'
			{
			match("26"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_26"

	// $ANTLR start "INT_27"
	public final void mINT_27() throws RecognitionException {
		try {
			int _type = INT_27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:121:8: ( '27' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:121:10: '27'
			{
			match("27"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_27"

	// $ANTLR start "INT_28"
	public final void mINT_28() throws RecognitionException {
		try {
			int _type = INT_28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:122:8: ( '28' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:122:10: '28'
			{
			match("28"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_28"

	// $ANTLR start "INT_29"
	public final void mINT_29() throws RecognitionException {
		try {
			int _type = INT_29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:123:8: ( '29' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:123:10: '29'
			{
			match("29"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_29"

	// $ANTLR start "INT_30"
	public final void mINT_30() throws RecognitionException {
		try {
			int _type = INT_30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:124:8: ( '30' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:124:10: '30'
			{
			match("30"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_30"

	// $ANTLR start "INT_31"
	public final void mINT_31() throws RecognitionException {
		try {
			int _type = INT_31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:125:8: ( '31' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:125:10: '31'
			{
			match("31"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_31"

	// $ANTLR start "INT_32"
	public final void mINT_32() throws RecognitionException {
		try {
			int _type = INT_32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:126:8: ( '32' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:126:10: '32'
			{
			match("32"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_32"

	// $ANTLR start "INT_33"
	public final void mINT_33() throws RecognitionException {
		try {
			int _type = INT_33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:127:8: ( '33' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:127:10: '33'
			{
			match("33"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_33"

	// $ANTLR start "INT_34"
	public final void mINT_34() throws RecognitionException {
		try {
			int _type = INT_34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:128:8: ( '34' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:128:10: '34'
			{
			match("34"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_34"

	// $ANTLR start "INT_35"
	public final void mINT_35() throws RecognitionException {
		try {
			int _type = INT_35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:129:8: ( '35' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:129:10: '35'
			{
			match("35"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_35"

	// $ANTLR start "INT_36"
	public final void mINT_36() throws RecognitionException {
		try {
			int _type = INT_36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:130:8: ( '36' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:130:10: '36'
			{
			match("36"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_36"

	// $ANTLR start "INT_37"
	public final void mINT_37() throws RecognitionException {
		try {
			int _type = INT_37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:131:8: ( '37' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:131:10: '37'
			{
			match("37"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_37"

	// $ANTLR start "INT_38"
	public final void mINT_38() throws RecognitionException {
		try {
			int _type = INT_38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:132:8: ( '38' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:132:10: '38'
			{
			match("38"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_38"

	// $ANTLR start "INT_39"
	public final void mINT_39() throws RecognitionException {
		try {
			int _type = INT_39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:133:8: ( '39' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:133:10: '39'
			{
			match("39"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_39"

	// $ANTLR start "INT_40"
	public final void mINT_40() throws RecognitionException {
		try {
			int _type = INT_40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:134:8: ( '40' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:134:10: '40'
			{
			match("40"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_40"

	// $ANTLR start "INT_41"
	public final void mINT_41() throws RecognitionException {
		try {
			int _type = INT_41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:135:8: ( '41' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:135:10: '41'
			{
			match("41"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_41"

	// $ANTLR start "INT_42"
	public final void mINT_42() throws RecognitionException {
		try {
			int _type = INT_42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:136:8: ( '42' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:136:10: '42'
			{
			match("42"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_42"

	// $ANTLR start "INT_43"
	public final void mINT_43() throws RecognitionException {
		try {
			int _type = INT_43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:137:8: ( '43' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:137:10: '43'
			{
			match("43"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_43"

	// $ANTLR start "INT_44"
	public final void mINT_44() throws RecognitionException {
		try {
			int _type = INT_44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:138:8: ( '44' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:138:10: '44'
			{
			match("44"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_44"

	// $ANTLR start "INT_45"
	public final void mINT_45() throws RecognitionException {
		try {
			int _type = INT_45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:139:8: ( '45' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:139:10: '45'
			{
			match("45"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_45"

	// $ANTLR start "INT_46"
	public final void mINT_46() throws RecognitionException {
		try {
			int _type = INT_46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:140:8: ( '46' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:140:10: '46'
			{
			match("46"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_46"

	// $ANTLR start "INT_47"
	public final void mINT_47() throws RecognitionException {
		try {
			int _type = INT_47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:141:8: ( '47' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:141:10: '47'
			{
			match("47"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_47"

	// $ANTLR start "INT_48"
	public final void mINT_48() throws RecognitionException {
		try {
			int _type = INT_48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:142:8: ( '48' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:142:10: '48'
			{
			match("48"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_48"

	// $ANTLR start "INT_49"
	public final void mINT_49() throws RecognitionException {
		try {
			int _type = INT_49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:143:8: ( '49' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:143:10: '49'
			{
			match("49"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_49"

	// $ANTLR start "INT_50"
	public final void mINT_50() throws RecognitionException {
		try {
			int _type = INT_50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:144:8: ( '50' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:144:10: '50'
			{
			match("50"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_50"

	// $ANTLR start "INT_51"
	public final void mINT_51() throws RecognitionException {
		try {
			int _type = INT_51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:145:8: ( '51' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:145:10: '51'
			{
			match("51"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_51"

	// $ANTLR start "INT_52"
	public final void mINT_52() throws RecognitionException {
		try {
			int _type = INT_52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:146:8: ( '52' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:146:10: '52'
			{
			match("52"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_52"

	// $ANTLR start "INT_53"
	public final void mINT_53() throws RecognitionException {
		try {
			int _type = INT_53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:147:8: ( '53' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:147:10: '53'
			{
			match("53"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_53"

	// $ANTLR start "INT_54"
	public final void mINT_54() throws RecognitionException {
		try {
			int _type = INT_54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:148:8: ( '54' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:148:10: '54'
			{
			match("54"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_54"

	// $ANTLR start "INT_55"
	public final void mINT_55() throws RecognitionException {
		try {
			int _type = INT_55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:149:8: ( '55' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:149:10: '55'
			{
			match("55"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_55"

	// $ANTLR start "INT_56"
	public final void mINT_56() throws RecognitionException {
		try {
			int _type = INT_56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:150:8: ( '56' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:150:10: '56'
			{
			match("56"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_56"

	// $ANTLR start "INT_57"
	public final void mINT_57() throws RecognitionException {
		try {
			int _type = INT_57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:151:8: ( '57' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:151:10: '57'
			{
			match("57"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_57"

	// $ANTLR start "INT_58"
	public final void mINT_58() throws RecognitionException {
		try {
			int _type = INT_58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:152:8: ( '58' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:152:10: '58'
			{
			match("58"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_58"

	// $ANTLR start "INT_59"
	public final void mINT_59() throws RecognitionException {
		try {
			int _type = INT_59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:153:8: ( '59' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:153:10: '59'
			{
			match("59"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_59"

	// $ANTLR start "INT_60"
	public final void mINT_60() throws RecognitionException {
		try {
			int _type = INT_60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:154:8: ( '60' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:154:10: '60'
			{
			match("60"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_60"

	// $ANTLR start "INT_61"
	public final void mINT_61() throws RecognitionException {
		try {
			int _type = INT_61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:155:8: ( '61' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:155:10: '61'
			{
			match("61"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_61"

	// $ANTLR start "INT_62"
	public final void mINT_62() throws RecognitionException {
		try {
			int _type = INT_62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:156:8: ( '62' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:156:10: '62'
			{
			match("62"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_62"

	// $ANTLR start "INT_63"
	public final void mINT_63() throws RecognitionException {
		try {
			int _type = INT_63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:157:8: ( '63' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:157:10: '63'
			{
			match("63"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_63"

	// $ANTLR start "INT_64"
	public final void mINT_64() throws RecognitionException {
		try {
			int _type = INT_64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:158:8: ( '64' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:158:10: '64'
			{
			match("64"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_64"

	// $ANTLR start "INT_65"
	public final void mINT_65() throws RecognitionException {
		try {
			int _type = INT_65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:159:8: ( '65' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:159:10: '65'
			{
			match("65"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_65"

	// $ANTLR start "INT_66"
	public final void mINT_66() throws RecognitionException {
		try {
			int _type = INT_66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:160:8: ( '66' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:160:10: '66'
			{
			match("66"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_66"

	// $ANTLR start "INT_67"
	public final void mINT_67() throws RecognitionException {
		try {
			int _type = INT_67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:161:8: ( '67' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:161:10: '67'
			{
			match("67"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_67"

	// $ANTLR start "INT_68"
	public final void mINT_68() throws RecognitionException {
		try {
			int _type = INT_68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:162:8: ( '68' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:162:10: '68'
			{
			match("68"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_68"

	// $ANTLR start "INT_69"
	public final void mINT_69() throws RecognitionException {
		try {
			int _type = INT_69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:163:8: ( '69' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:163:10: '69'
			{
			match("69"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_69"

	// $ANTLR start "INT_70"
	public final void mINT_70() throws RecognitionException {
		try {
			int _type = INT_70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:164:8: ( '70' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:164:10: '70'
			{
			match("70"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_70"

	// $ANTLR start "INT_71"
	public final void mINT_71() throws RecognitionException {
		try {
			int _type = INT_71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:165:8: ( '71' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:165:10: '71'
			{
			match("71"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_71"

	// $ANTLR start "INT_72"
	public final void mINT_72() throws RecognitionException {
		try {
			int _type = INT_72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:166:8: ( '72' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:166:10: '72'
			{
			match("72"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_72"

	// $ANTLR start "INT_73"
	public final void mINT_73() throws RecognitionException {
		try {
			int _type = INT_73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:167:8: ( '73' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:167:10: '73'
			{
			match("73"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_73"

	// $ANTLR start "INT_74"
	public final void mINT_74() throws RecognitionException {
		try {
			int _type = INT_74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:168:8: ( '74' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:168:10: '74'
			{
			match("74"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_74"

	// $ANTLR start "INT_75"
	public final void mINT_75() throws RecognitionException {
		try {
			int _type = INT_75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:169:8: ( '75' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:169:10: '75'
			{
			match("75"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_75"

	// $ANTLR start "INT_76"
	public final void mINT_76() throws RecognitionException {
		try {
			int _type = INT_76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:170:8: ( '76' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:170:10: '76'
			{
			match("76"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_76"

	// $ANTLR start "INT_77"
	public final void mINT_77() throws RecognitionException {
		try {
			int _type = INT_77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:171:8: ( '77' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:171:10: '77'
			{
			match("77"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_77"

	// $ANTLR start "INT_78"
	public final void mINT_78() throws RecognitionException {
		try {
			int _type = INT_78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:172:8: ( '78' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:172:10: '78'
			{
			match("78"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_78"

	// $ANTLR start "INT_79"
	public final void mINT_79() throws RecognitionException {
		try {
			int _type = INT_79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:173:8: ( '79' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:173:10: '79'
			{
			match("79"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_79"

	// $ANTLR start "INT_80"
	public final void mINT_80() throws RecognitionException {
		try {
			int _type = INT_80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:174:8: ( '80' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:174:10: '80'
			{
			match("80"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_80"

	// $ANTLR start "INT_81"
	public final void mINT_81() throws RecognitionException {
		try {
			int _type = INT_81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:175:8: ( '81' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:175:10: '81'
			{
			match("81"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_81"

	// $ANTLR start "INT_82"
	public final void mINT_82() throws RecognitionException {
		try {
			int _type = INT_82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:176:8: ( '82' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:176:10: '82'
			{
			match("82"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_82"

	// $ANTLR start "INT_83"
	public final void mINT_83() throws RecognitionException {
		try {
			int _type = INT_83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:177:8: ( '83' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:177:10: '83'
			{
			match("83"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_83"

	// $ANTLR start "INT_84"
	public final void mINT_84() throws RecognitionException {
		try {
			int _type = INT_84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:178:8: ( '84' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:178:10: '84'
			{
			match("84"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_84"

	// $ANTLR start "INT_85"
	public final void mINT_85() throws RecognitionException {
		try {
			int _type = INT_85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:179:8: ( '85' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:179:10: '85'
			{
			match("85"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_85"

	// $ANTLR start "INT_86"
	public final void mINT_86() throws RecognitionException {
		try {
			int _type = INT_86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:180:8: ( '86' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:180:10: '86'
			{
			match("86"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_86"

	// $ANTLR start "INT_87"
	public final void mINT_87() throws RecognitionException {
		try {
			int _type = INT_87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:181:8: ( '87' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:181:10: '87'
			{
			match("87"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_87"

	// $ANTLR start "INT_88"
	public final void mINT_88() throws RecognitionException {
		try {
			int _type = INT_88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:182:8: ( '88' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:182:10: '88'
			{
			match("88"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_88"

	// $ANTLR start "INT_89"
	public final void mINT_89() throws RecognitionException {
		try {
			int _type = INT_89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:183:8: ( '89' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:183:10: '89'
			{
			match("89"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_89"

	// $ANTLR start "INT_90"
	public final void mINT_90() throws RecognitionException {
		try {
			int _type = INT_90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:184:8: ( '90' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:184:10: '90'
			{
			match("90"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_90"

	// $ANTLR start "INT_91"
	public final void mINT_91() throws RecognitionException {
		try {
			int _type = INT_91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:185:8: ( '91' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:185:10: '91'
			{
			match("91"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_91"

	// $ANTLR start "INT_92"
	public final void mINT_92() throws RecognitionException {
		try {
			int _type = INT_92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:186:8: ( '92' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:186:10: '92'
			{
			match("92"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_92"

	// $ANTLR start "INT_93"
	public final void mINT_93() throws RecognitionException {
		try {
			int _type = INT_93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:187:8: ( '93' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:187:10: '93'
			{
			match("93"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_93"

	// $ANTLR start "INT_94"
	public final void mINT_94() throws RecognitionException {
		try {
			int _type = INT_94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:188:8: ( '94' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:188:10: '94'
			{
			match("94"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_94"

	// $ANTLR start "INT_95"
	public final void mINT_95() throws RecognitionException {
		try {
			int _type = INT_95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:189:8: ( '95' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:189:10: '95'
			{
			match("95"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_95"

	// $ANTLR start "INT_96"
	public final void mINT_96() throws RecognitionException {
		try {
			int _type = INT_96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:190:8: ( '96' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:190:10: '96'
			{
			match("96"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_96"

	// $ANTLR start "INT_97"
	public final void mINT_97() throws RecognitionException {
		try {
			int _type = INT_97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:191:8: ( '97' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:191:10: '97'
			{
			match("97"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_97"

	// $ANTLR start "INT_98"
	public final void mINT_98() throws RecognitionException {
		try {
			int _type = INT_98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:192:8: ( '98' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:192:10: '98'
			{
			match("98"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_98"

	// $ANTLR start "INT_99"
	public final void mINT_99() throws RecognitionException {
		try {
			int _type = INT_99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:193:8: ( '99' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:193:10: '99'
			{
			match("99"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_99"

	// $ANTLR start "ONE"
	public final void mONE() throws RecognitionException {
		try {
			int _type = ONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:195:11: ( 'one' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:195:13: 'one'
			{
			match("one"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ONE"

	// $ANTLR start "TWO"
	public final void mTWO() throws RecognitionException {
		try {
			int _type = TWO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:196:11: ( 'two' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:196:13: 'two'
			{
			match("two"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWO"

	// $ANTLR start "THREE"
	public final void mTHREE() throws RecognitionException {
		try {
			int _type = THREE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:197:11: ( 'three' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:197:13: 'three'
			{
			match("three"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THREE"

	// $ANTLR start "FOUR"
	public final void mFOUR() throws RecognitionException {
		try {
			int _type = FOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:198:11: ( 'four' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:198:13: 'four'
			{
			match("four"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOUR"

	// $ANTLR start "FIVE"
	public final void mFIVE() throws RecognitionException {
		try {
			int _type = FIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:199:11: ( 'five' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:199:13: 'five'
			{
			match("five"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIVE"

	// $ANTLR start "SIX"
	public final void mSIX() throws RecognitionException {
		try {
			int _type = SIX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:200:11: ( 'six' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:200:13: 'six'
			{
			match("six"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIX"

	// $ANTLR start "SEVEN"
	public final void mSEVEN() throws RecognitionException {
		try {
			int _type = SEVEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:201:11: ( 'seven' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:201:13: 'seven'
			{
			match("seven"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEVEN"

	// $ANTLR start "EIGHT"
	public final void mEIGHT() throws RecognitionException {
		try {
			int _type = EIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:202:11: ( 'eight' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:202:13: 'eight'
			{
			match("eight"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EIGHT"

	// $ANTLR start "NINE"
	public final void mNINE() throws RecognitionException {
		try {
			int _type = NINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:203:11: ( 'nine' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:203:13: 'nine'
			{
			match("nine"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NINE"

	// $ANTLR start "TEN"
	public final void mTEN() throws RecognitionException {
		try {
			int _type = TEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:204:11: ( 'ten' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:204:13: 'ten'
			{
			match("ten"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEN"

	// $ANTLR start "ELEVEN"
	public final void mELEVEN() throws RecognitionException {
		try {
			int _type = ELEVEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:205:11: ( 'eleven' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:205:13: 'eleven'
			{
			match("eleven"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELEVEN"

	// $ANTLR start "TWELVE"
	public final void mTWELVE() throws RecognitionException {
		try {
			int _type = TWELVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:206:11: ( 'twelve' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:206:13: 'twelve'
			{
			match("twelve"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWELVE"

	// $ANTLR start "THIRTEEN"
	public final void mTHIRTEEN() throws RecognitionException {
		try {
			int _type = THIRTEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:207:11: ( 'thirteen' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:207:13: 'thirteen'
			{
			match("thirteen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIRTEEN"

	// $ANTLR start "FOURTEEN"
	public final void mFOURTEEN() throws RecognitionException {
		try {
			int _type = FOURTEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:208:11: ( 'fourteen' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:208:13: 'fourteen'
			{
			match("fourteen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOURTEEN"

	// $ANTLR start "FIFTEEN"
	public final void mFIFTEEN() throws RecognitionException {
		try {
			int _type = FIFTEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:209:11: ( 'fifteen' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:209:13: 'fifteen'
			{
			match("fifteen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIFTEEN"

	// $ANTLR start "SIXTEEN"
	public final void mSIXTEEN() throws RecognitionException {
		try {
			int _type = SIXTEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:210:11: ( 'sixteen' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:210:13: 'sixteen'
			{
			match("sixteen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIXTEEN"

	// $ANTLR start "SEVENTEEN"
	public final void mSEVENTEEN() throws RecognitionException {
		try {
			int _type = SEVENTEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:211:11: ( 'seventeen' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:211:13: 'seventeen'
			{
			match("seventeen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEVENTEEN"

	// $ANTLR start "EIGHTEEN"
	public final void mEIGHTEEN() throws RecognitionException {
		try {
			int _type = EIGHTEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:212:11: ( 'eighteen' | 'eightteen' )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0=='e') ) {
				int LA95_1 = input.LA(2);
				if ( (LA95_1=='i') ) {
					int LA95_2 = input.LA(3);
					if ( (LA95_2=='g') ) {
						int LA95_3 = input.LA(4);
						if ( (LA95_3=='h') ) {
							int LA95_4 = input.LA(5);
							if ( (LA95_4=='t') ) {
								int LA95_5 = input.LA(6);
								if ( (LA95_5=='e') ) {
									alt95=1;
								}
								else if ( (LA95_5=='t') ) {
									alt95=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 95, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 95, 4, input);
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
									new NoViableAltException("", 95, 3, input);
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
								new NoViableAltException("", 95, 2, input);
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
							new NoViableAltException("", 95, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:212:13: 'eighteen'
					{
					match("eighteen"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:212:26: 'eightteen'
					{
					match("eightteen"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EIGHTEEN"

	// $ANTLR start "NINETEEN"
	public final void mNINETEEN() throws RecognitionException {
		try {
			int _type = NINETEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:213:11: ( 'nineteen' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:213:13: 'nineteen'
			{
			match("nineteen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NINETEEN"

	// $ANTLR start "TWENTY"
	public final void mTWENTY() throws RecognitionException {
		try {
			int _type = TWENTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:214:11: ( 'twenty' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:214:13: 'twenty'
			{
			match("twenty"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWENTY"

	// $ANTLR start "THIRTY"
	public final void mTHIRTY() throws RecognitionException {
		try {
			int _type = THIRTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:215:11: ( 'thirty' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:215:13: 'thirty'
			{
			match("thirty"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIRTY"

	// $ANTLR start "FIRST"
	public final void mFIRST() throws RecognitionException {
		try {
			int _type = FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:217:16: ( 'first' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:217:18: 'first'
			{
			match("first"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIRST"

	// $ANTLR start "SECOND"
	public final void mSECOND() throws RecognitionException {
		try {
			int _type = SECOND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:218:16: ( 'second' | 'seconds' | 'sec' | 'secs' )
			int alt96=4;
			int LA96_0 = input.LA(1);
			if ( (LA96_0=='s') ) {
				int LA96_1 = input.LA(2);
				if ( (LA96_1=='e') ) {
					int LA96_2 = input.LA(3);
					if ( (LA96_2=='c') ) {
						switch ( input.LA(4) ) {
						case 'o':
							{
							int LA96_4 = input.LA(5);
							if ( (LA96_4=='n') ) {
								int LA96_7 = input.LA(6);
								if ( (LA96_7=='d') ) {
									int LA96_8 = input.LA(7);
									if ( (LA96_8=='s') ) {
										alt96=2;
									}

									else {
										alt96=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 96, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 96, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 's':
							{
							alt96=4;
							}
							break;
						default:
							alt96=3;
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 96, 2, input);
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
							new NoViableAltException("", 96, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}

			switch (alt96) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:218:18: 'second'
					{
					match("second"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:218:29: 'seconds'
					{
					match("seconds"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:218:41: 'sec'
					{
					match("sec"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:218:49: 'secs'
					{
					match("secs"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SECOND"

	// $ANTLR start "THIRD"
	public final void mTHIRD() throws RecognitionException {
		try {
			int _type = THIRD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:219:16: ( 'third' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:219:18: 'third'
			{
			match("third"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIRD"

	// $ANTLR start "FOURTH"
	public final void mFOURTH() throws RecognitionException {
		try {
			int _type = FOURTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:220:16: ( 'fourth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:220:18: 'fourth'
			{
			match("fourth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOURTH"

	// $ANTLR start "FIFTH"
	public final void mFIFTH() throws RecognitionException {
		try {
			int _type = FIFTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:221:16: ( 'fifth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:221:18: 'fifth'
			{
			match("fifth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIFTH"

	// $ANTLR start "SIXTH"
	public final void mSIXTH() throws RecognitionException {
		try {
			int _type = SIXTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:222:16: ( 'sixth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:222:18: 'sixth'
			{
			match("sixth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIXTH"

	// $ANTLR start "SEVENTH"
	public final void mSEVENTH() throws RecognitionException {
		try {
			int _type = SEVENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:223:16: ( 'seventh' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:223:18: 'seventh'
			{
			match("seventh"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEVENTH"

	// $ANTLR start "EIGHTH"
	public final void mEIGHTH() throws RecognitionException {
		try {
			int _type = EIGHTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:224:16: ( 'eighth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:224:18: 'eighth'
			{
			match("eighth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EIGHTH"

	// $ANTLR start "NINTH"
	public final void mNINTH() throws RecognitionException {
		try {
			int _type = NINTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:225:16: ( 'ninth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:225:18: 'ninth'
			{
			match("ninth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NINTH"

	// $ANTLR start "TENTH"
	public final void mTENTH() throws RecognitionException {
		try {
			int _type = TENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:226:16: ( 'tenth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:226:18: 'tenth'
			{
			match("tenth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TENTH"

	// $ANTLR start "ELEVENTH"
	public final void mELEVENTH() throws RecognitionException {
		try {
			int _type = ELEVENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:227:16: ( 'eleventh' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:227:18: 'eleventh'
			{
			match("eleventh"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELEVENTH"

	// $ANTLR start "TWELFTH"
	public final void mTWELFTH() throws RecognitionException {
		try {
			int _type = TWELFTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:228:16: ( 'twelfth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:228:18: 'twelfth'
			{
			match("twelfth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWELFTH"

	// $ANTLR start "THIRTEENTH"
	public final void mTHIRTEENTH() throws RecognitionException {
		try {
			int _type = THIRTEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:229:16: ( 'thirteenth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:229:18: 'thirteenth'
			{
			match("thirteenth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIRTEENTH"

	// $ANTLR start "FOURTEENTH"
	public final void mFOURTEENTH() throws RecognitionException {
		try {
			int _type = FOURTEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:230:16: ( 'fourteenth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:230:18: 'fourteenth'
			{
			match("fourteenth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOURTEENTH"

	// $ANTLR start "FIFTEENTH"
	public final void mFIFTEENTH() throws RecognitionException {
		try {
			int _type = FIFTEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:231:16: ( 'fifteenth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:231:18: 'fifteenth'
			{
			match("fifteenth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIFTEENTH"

	// $ANTLR start "SIXTEENTH"
	public final void mSIXTEENTH() throws RecognitionException {
		try {
			int _type = SIXTEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:232:16: ( 'sixteenth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:232:18: 'sixteenth'
			{
			match("sixteenth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIXTEENTH"

	// $ANTLR start "SEVENTEENTH"
	public final void mSEVENTEENTH() throws RecognitionException {
		try {
			int _type = SEVENTEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:233:16: ( 'seventeenth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:233:18: 'seventeenth'
			{
			match("seventeenth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEVENTEENTH"

	// $ANTLR start "EIGHTEENTH"
	public final void mEIGHTEENTH() throws RecognitionException {
		try {
			int _type = EIGHTEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:234:16: ( 'eighteenth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:234:18: 'eighteenth'
			{
			match("eighteenth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EIGHTEENTH"

	// $ANTLR start "NINETEENTH"
	public final void mNINETEENTH() throws RecognitionException {
		try {
			int _type = NINETEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:235:16: ( 'nineteenth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:235:18: 'nineteenth'
			{
			match("nineteenth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NINETEENTH"

	// $ANTLR start "TWENTIETH"
	public final void mTWENTIETH() throws RecognitionException {
		try {
			int _type = TWENTIETH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:236:16: ( 'twentieth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:236:18: 'twentieth'
			{
			match("twentieth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWENTIETH"

	// $ANTLR start "THIRTIETH"
	public final void mTHIRTIETH() throws RecognitionException {
		try {
			int _type = THIRTIETH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:237:16: ( 'thirtieth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:237:18: 'thirtieth'
			{
			match("thirtieth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIRTIETH"

	// $ANTLR start "ST"
	public final void mST() throws RecognitionException {
		try {
			int _type = ST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:240:4: ( 'st' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:240:6: 'st'
			{
			match("st"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ST"

	// $ANTLR start "ND"
	public final void mND() throws RecognitionException {
		try {
			int _type = ND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:241:4: ( 'nd' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:241:6: 'nd'
			{
			match("nd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ND"

	// $ANTLR start "RD"
	public final void mRD() throws RecognitionException {
		try {
			int _type = RD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:242:4: ( 'rd' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:242:6: 'rd'
			{
			match("rd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RD"

	// $ANTLR start "TH"
	public final void mTH() throws RecognitionException {
		try {
			int _type = TH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:243:4: ( 'th' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:243:6: 'th'
			{
			match("th"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TH"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:247:7: ( ':' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:247:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:248:7: ( ',' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:248:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "DASH"
	public final void mDASH() throws RecognitionException {
		try {
			int _type = DASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:249:7: ( '-' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:249:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DASH"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:250:7: ( '/' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:250:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:251:7: ( '.' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:251:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:252:7: ( '+' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:252:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "SINGLE_QUOTE"
	public final void mSINGLE_QUOTE() throws RecognitionException {
		try {
			int _type = SINGLE_QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:253:14: ( '\\'' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:253:16: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLE_QUOTE"

	// $ANTLR start "CURRENT"
	public final void mCURRENT() throws RecognitionException {
		try {
			int _type = CURRENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:255:11: ( 'current' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:255:13: 'current'
			{
			match("current"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURRENT"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:256:11: ( 'for' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:256:13: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:257:11: ( 'in' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:257:13: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "AN"
	public final void mAN() throws RecognitionException {
		try {
			int _type = AN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:258:11: ( 'an' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:258:13: 'an'
			{
			match("an"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AN"

	// $ANTLR start "THE"
	public final void mTHE() throws RecognitionException {
		try {
			int _type = THE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:259:11: ( 'the' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:259:13: 'the'
			{
			match("the"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THE"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:260:11: ( 'or' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:260:13: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:261:11: ( 'and' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:261:13: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "TO"
	public final void mTO() throws RecognitionException {
		try {
			int _type = TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:262:11: ( 'to' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:262:13: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TO"

	// $ANTLR start "THROUGH"
	public final void mTHROUGH() throws RecognitionException {
		try {
			int _type = THROUGH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:263:11: ( 'through' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:263:13: 'through'
			{
			match("through"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROUGH"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:264:11: ( 'on' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:264:13: 'on'
			{
			match("on"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "OF"
	public final void mOF() throws RecognitionException {
		try {
			int _type = OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:265:11: ( 'of' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:265:13: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OF"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:266:11: ( 'this' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:266:13: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIS"

	// $ANTLR start "THAT"
	public final void mTHAT() throws RecognitionException {
		try {
			int _type = THAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:267:11: ( 'that' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:267:13: 'that'
			{
			match("that"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THAT"

	// $ANTLR start "LAST"
	public final void mLAST() throws RecognitionException {
		try {
			int _type = LAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:268:11: ( 'last' | 'final' )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0=='l') ) {
				alt97=1;
			}
			else if ( (LA97_0=='f') ) {
				alt97=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:268:13: 'last'
					{
					match("last"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:268:22: 'final'
					{
					match("final"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAST"

	// $ANTLR start "NEXT"
	public final void mNEXT() throws RecognitionException {
		try {
			int _type = NEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:269:11: ( 'next' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:269:13: 'next'
			{
			match("next"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEXT"

	// $ANTLR start "COMING"
	public final void mCOMING() throws RecognitionException {
		try {
			int _type = COMING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:270:11: ( 'coming' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:270:13: 'coming'
			{
			match("coming"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMING"

	// $ANTLR start "UPCOMING"
	public final void mUPCOMING() throws RecognitionException {
		try {
			int _type = UPCOMING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:271:11: ( 'upcoming' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:271:13: 'upcoming'
			{
			match("upcoming"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPCOMING"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:272:11: ( 'from' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:272:13: 'from'
			{
			match("from"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "NOW"
	public final void mNOW() throws RecognitionException {
		try {
			int _type = NOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:273:11: ( 'now' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:273:13: 'now'
			{
			match("now"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOW"

	// $ANTLR start "AGO"
	public final void mAGO() throws RecognitionException {
		try {
			int _type = AGO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:274:11: ( 'ago' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:274:13: 'ago'
			{
			match("ago"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AGO"

	// $ANTLR start "BEFORE"
	public final void mBEFORE() throws RecognitionException {
		try {
			int _type = BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:275:11: ( 'before' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:275:13: 'before'
			{
			match("before"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEFORE"

	// $ANTLR start "BEGINNING"
	public final void mBEGINNING() throws RecognitionException {
		try {
			int _type = BEGINNING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:276:11: ( 'beginning' | 'begining' )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0=='b') ) {
				int LA98_1 = input.LA(2);
				if ( (LA98_1=='e') ) {
					int LA98_2 = input.LA(3);
					if ( (LA98_2=='g') ) {
						int LA98_3 = input.LA(4);
						if ( (LA98_3=='i') ) {
							int LA98_4 = input.LA(5);
							if ( (LA98_4=='n') ) {
								int LA98_5 = input.LA(6);
								if ( (LA98_5=='n') ) {
									alt98=1;
								}
								else if ( (LA98_5=='i') ) {
									alt98=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 98, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 98, 4, input);
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
									new NoViableAltException("", 98, 3, input);
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
								new NoViableAltException("", 98, 2, input);
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
							new NoViableAltException("", 98, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:276:13: 'beginning'
					{
					match("beginning"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:276:27: 'begining'
					{
					match("begining"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGINNING"

	// $ANTLR start "START"
	public final void mSTART() throws RecognitionException {
		try {
			int _type = START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:277:11: ( 'start' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:277:13: 'start'
			{
			match("start"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "START"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:278:11: ( 'end' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:278:13: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "WHITE_SPACE"
	public final void mWHITE_SPACE() throws RecognitionException {
		try {
			int _type = WHITE_SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:281:3: ( ( DOT | SPACE )+ )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:281:5: ( DOT | SPACE )+
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:281:5: ( DOT | SPACE )+
			int cnt99=0;
			loop99:
			while (true) {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( ((LA99_0 >= '\t' && LA99_0 <= '\n')||LA99_0=='\r'||LA99_0==' '||LA99_0=='.'||LA99_0=='\u00A0') ) {
					alt99=1;
				}

				switch (alt99) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)=='.'||input.LA(1)=='\u00A0' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt99 >= 1 ) break loop99;
					EarlyExitException eee = new EarlyExitException(99, input);
					throw eee;
				}
				cnt99++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITE_SPACE"

	// $ANTLR start "FOOL"
	public final void mFOOL() throws RecognitionException {
		try {
			int _type = FOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:286:14: ( 'fool' | 'fools' | 'fool' SINGLE_QUOTE 's' )
			int alt100=3;
			int LA100_0 = input.LA(1);
			if ( (LA100_0=='f') ) {
				int LA100_1 = input.LA(2);
				if ( (LA100_1=='o') ) {
					int LA100_2 = input.LA(3);
					if ( (LA100_2=='o') ) {
						int LA100_3 = input.LA(4);
						if ( (LA100_3=='l') ) {
							switch ( input.LA(5) ) {
							case 's':
								{
								alt100=2;
								}
								break;
							case '\'':
								{
								alt100=3;
								}
								break;
							default:
								alt100=1;
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 100, 3, input);
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
								new NoViableAltException("", 100, 2, input);
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
							new NoViableAltException("", 100, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:286:16: 'fool'
					{
					match("fool"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:286:25: 'fools'
					{
					match("fools"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:286:35: 'fool' SINGLE_QUOTE 's'
					{
					match("fool"); 

					mSINGLE_QUOTE(); 

					match('s'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOOL"

	// $ANTLR start "BLACK"
	public final void mBLACK() throws RecognitionException {
		try {
			int _type = BLACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:287:14: ( 'black' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:287:16: 'black'
			{
			match("black"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLACK"

	// $ANTLR start "CHRISTMAS"
	public final void mCHRISTMAS() throws RecognitionException {
		try {
			int _type = CHRISTMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:288:14: ( ( 'christmas' | 'xmas' | 'x-mas' ) ( 'es' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:288:16: ( 'christmas' | 'xmas' | 'x-mas' ) ( 'es' )?
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:288:16: ( 'christmas' | 'xmas' | 'x-mas' )
			int alt101=3;
			int LA101_0 = input.LA(1);
			if ( (LA101_0=='c') ) {
				alt101=1;
			}
			else if ( (LA101_0=='x') ) {
				int LA101_2 = input.LA(2);
				if ( (LA101_2=='m') ) {
					alt101=2;
				}
				else if ( (LA101_2=='-') ) {
					alt101=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 101, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}

			switch (alt101) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:288:17: 'christmas'
					{
					match("christmas"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:288:31: 'xmas'
					{
					match("xmas"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:288:40: 'x-mas'
					{
					match("x-mas"); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:288:49: ( 'es' )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0=='e') ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:288:49: 'es'
					{
					match("es"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHRISTMAS"

	// $ANTLR start "COLUMBUS"
	public final void mCOLUMBUS() throws RecognitionException {
		try {
			int _type = COLUMBUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:289:14: ( 'columbus' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:289:16: 'columbus'
			{
			match("columbus"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLUMBUS"

	// $ANTLR start "EARTH"
	public final void mEARTH() throws RecognitionException {
		try {
			int _type = EARTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:290:14: ( 'earth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:290:16: 'earth'
			{
			match("earth"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EARTH"

	// $ANTLR start "EASTER"
	public final void mEASTER() throws RecognitionException {
		try {
			int _type = EASTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:291:14: ( 'easter' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:291:16: 'easter'
			{
			match("easter"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EASTER"

	// $ANTLR start "FATHER"
	public final void mFATHER() throws RecognitionException {
		try {
			int _type = FATHER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:292:14: ( 'father' | 'fathers' | 'father' SINGLE_QUOTE 's' )
			int alt103=3;
			int LA103_0 = input.LA(1);
			if ( (LA103_0=='f') ) {
				int LA103_1 = input.LA(2);
				if ( (LA103_1=='a') ) {
					int LA103_2 = input.LA(3);
					if ( (LA103_2=='t') ) {
						int LA103_3 = input.LA(4);
						if ( (LA103_3=='h') ) {
							int LA103_4 = input.LA(5);
							if ( (LA103_4=='e') ) {
								int LA103_5 = input.LA(6);
								if ( (LA103_5=='r') ) {
									switch ( input.LA(7) ) {
									case 's':
										{
										alt103=2;
										}
										break;
									case '\'':
										{
										alt103=3;
										}
										break;
									default:
										alt103=1;
									}
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 103, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 103, 4, input);
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
									new NoViableAltException("", 103, 3, input);
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
								new NoViableAltException("", 103, 2, input);
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
							new NoViableAltException("", 103, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}

			switch (alt103) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:292:16: 'father'
					{
					match("father"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:292:27: 'fathers'
					{
					match("fathers"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:292:39: 'father' SINGLE_QUOTE 's'
					{
					match("father"); 

					mSINGLE_QUOTE(); 

					match('s'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FATHER"

	// $ANTLR start "FLAG"
	public final void mFLAG() throws RecognitionException {
		try {
			int _type = FLAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:293:14: ( 'flag' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:293:16: 'flag'
			{
			match("flag"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLAG"

	// $ANTLR start "GOOD"
	public final void mGOOD() throws RecognitionException {
		try {
			int _type = GOOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:294:14: ( 'good' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:294:16: 'good'
			{
			match("good"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GOOD"

	// $ANTLR start "GROUNDHOG"
	public final void mGROUNDHOG() throws RecognitionException {
		try {
			int _type = GROUNDHOG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:295:14: ( GROUND ( WHITE_SPACE )? HOG ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:295:16: GROUND ( WHITE_SPACE )? HOG ( SINGLE_QUOTE )? ( 's' )?
			{
			mGROUND(); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:295:23: ( WHITE_SPACE )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( ((LA104_0 >= '\t' && LA104_0 <= '\n')||LA104_0=='\r'||LA104_0==' '||LA104_0=='.'||LA104_0=='\u00A0') ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:295:23: WHITE_SPACE
					{
					mWHITE_SPACE(); 

					}
					break;

			}

			mHOG(); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:295:40: ( SINGLE_QUOTE )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0=='\'') ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
					{
					if ( input.LA(1)=='\'' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:295:54: ( 's' )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0=='s') ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:295:54: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUNDHOG"

	// $ANTLR start "HALLOWEEN"
	public final void mHALLOWEEN() throws RecognitionException {
		try {
			int _type = HALLOWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:296:14: ( ( 'halloween' | 'haloween' ) ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:296:16: ( 'halloween' | 'haloween' ) ( 's' )?
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:296:16: ( 'halloween' | 'haloween' )
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0=='h') ) {
				int LA107_1 = input.LA(2);
				if ( (LA107_1=='a') ) {
					int LA107_2 = input.LA(3);
					if ( (LA107_2=='l') ) {
						int LA107_3 = input.LA(4);
						if ( (LA107_3=='l') ) {
							alt107=1;
						}
						else if ( (LA107_3=='o') ) {
							alt107=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 107, 3, input);
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
								new NoViableAltException("", 107, 2, input);
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
							new NoViableAltException("", 107, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}

			switch (alt107) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:296:17: 'halloween'
					{
					match("halloween"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:296:31: 'haloween'
					{
					match("haloween"); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:296:43: ( 's' )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0=='s') ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:296:43: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HALLOWEEN"

	// $ANTLR start "INAUGURATION"
	public final void mINAUGURATION() throws RecognitionException {
		try {
			int _type = INAUGURATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:297:14: ( 'inauguration' | 'inaugaration' )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0=='i') ) {
				int LA109_1 = input.LA(2);
				if ( (LA109_1=='n') ) {
					int LA109_2 = input.LA(3);
					if ( (LA109_2=='a') ) {
						int LA109_3 = input.LA(4);
						if ( (LA109_3=='u') ) {
							int LA109_4 = input.LA(5);
							if ( (LA109_4=='g') ) {
								int LA109_5 = input.LA(6);
								if ( (LA109_5=='u') ) {
									alt109=1;
								}
								else if ( (LA109_5=='a') ) {
									alt109=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 109, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 109, 4, input);
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
									new NoViableAltException("", 109, 3, input);
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
								new NoViableAltException("", 109, 2, input);
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
							new NoViableAltException("", 109, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}

			switch (alt109) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:297:16: 'inauguration'
					{
					match("inauguration"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:297:33: 'inaugaration'
					{
					match("inaugaration"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INAUGURATION"

	// $ANTLR start "INDEPENDENCE"
	public final void mINDEPENDENCE() throws RecognitionException {
		try {
			int _type = INDEPENDENCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:298:14: ( 'independence' | 'independance' )
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0=='i') ) {
				int LA110_1 = input.LA(2);
				if ( (LA110_1=='n') ) {
					int LA110_2 = input.LA(3);
					if ( (LA110_2=='d') ) {
						int LA110_3 = input.LA(4);
						if ( (LA110_3=='e') ) {
							int LA110_4 = input.LA(5);
							if ( (LA110_4=='p') ) {
								int LA110_5 = input.LA(6);
								if ( (LA110_5=='e') ) {
									int LA110_6 = input.LA(7);
									if ( (LA110_6=='n') ) {
										int LA110_7 = input.LA(8);
										if ( (LA110_7=='d') ) {
											int LA110_8 = input.LA(9);
											if ( (LA110_8=='e') ) {
												alt110=1;
											}
											else if ( (LA110_8=='a') ) {
												alt110=2;
											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 110, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 110, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 110, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 110, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 110, 4, input);
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
									new NoViableAltException("", 110, 3, input);
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
								new NoViableAltException("", 110, 2, input);
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
							new NoViableAltException("", 110, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:298:16: 'independence'
					{
					match("independence"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:298:33: 'independance'
					{
					match("independance"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDEPENDENCE"

	// $ANTLR start "KWANZAA"
	public final void mKWANZAA() throws RecognitionException {
		try {
			int _type = KWANZAA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:299:14: ( ( 'kwanza' ( 'a' )? ) ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:299:16: ( 'kwanza' ( 'a' )? ) ( 's' )?
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:299:16: ( 'kwanza' ( 'a' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:299:17: 'kwanza' ( 'a' )?
			{
			match("kwanza"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:299:26: ( 'a' )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0=='a') ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:299:26: 'a'
					{
					match('a'); 
					}
					break;

			}

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:299:32: ( 's' )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0=='s') ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:299:32: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KWANZAA"

	// $ANTLR start "LABOR"
	public final void mLABOR() throws RecognitionException {
		try {
			int _type = LABOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:300:14: ( 'labor' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:300:16: 'labor'
			{
			match("labor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LABOR"

	// $ANTLR start "MLK"
	public final void mMLK() throws RecognitionException {
		try {
			int _type = MLK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:301:14: ( 'mlk' | 'martin' WHITE_SPACE 'luther' WHITE_SPACE 'king' ( COMMA SPACE 'jr' DOT )? )
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0=='m') ) {
				int LA114_1 = input.LA(2);
				if ( (LA114_1=='l') ) {
					alt114=1;
				}
				else if ( (LA114_1=='a') ) {
					alt114=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 114, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}

			switch (alt114) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:301:16: 'mlk'
					{
					match("mlk"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:301:24: 'martin' WHITE_SPACE 'luther' WHITE_SPACE 'king' ( COMMA SPACE 'jr' DOT )?
					{
					match("martin"); 

					mWHITE_SPACE(); 

					match("luther"); 

					mWHITE_SPACE(); 

					match("king"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:301:73: ( COMMA SPACE 'jr' DOT )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==',') ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:301:74: COMMA SPACE 'jr' DOT
							{
							mCOMMA(); 

							mSPACE(); 

							match("jr"); 

							mDOT(); 

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MLK"

	// $ANTLR start "MEMORIAL"
	public final void mMEMORIAL() throws RecognitionException {
		try {
			int _type = MEMORIAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:302:14: ( 'memorial' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:302:16: 'memorial'
			{
			match("memorial"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEMORIAL"

	// $ANTLR start "MOTHER"
	public final void mMOTHER() throws RecognitionException {
		try {
			int _type = MOTHER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:303:14: ( 'mother' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:303:16: 'mother' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("mother"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:303:25: ( SINGLE_QUOTE )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0=='\'') ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
					{
					if ( input.LA(1)=='\'' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:303:39: ( 's' )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0=='s') ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:303:39: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOTHER"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:304:14: ( 'new' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:304:16: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW"

	// $ANTLR start "PALM"
	public final void mPALM() throws RecognitionException {
		try {
			int _type = PALM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:305:14: ( 'palm' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:305:16: 'palm'
			{
			match("palm"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PALM"

	// $ANTLR start "PATRIOT"
	public final void mPATRIOT() throws RecognitionException {
		try {
			int _type = PATRIOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:306:14: ( 'patriot' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:306:16: 'patriot' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("patriot"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:306:26: ( SINGLE_QUOTE )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0=='\'') ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
					{
					if ( input.LA(1)=='\'' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:306:40: ( 's' )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0=='s') ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:306:40: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PATRIOT"

	// $ANTLR start "PRESIDENT"
	public final void mPRESIDENT() throws RecognitionException {
		try {
			int _type = PRESIDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:307:14: ( 'president' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:307:16: 'president' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("president"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:307:28: ( SINGLE_QUOTE )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0=='\'') ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
					{
					if ( input.LA(1)=='\'' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:307:42: ( 's' )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0=='s') ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:307:42: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRESIDENT"

	// $ANTLR start "PATRICK"
	public final void mPATRICK() throws RecognitionException {
		try {
			int _type = PATRICK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:14: ( ( 'patrick' | 'patty' | 'paddy' ) ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:16: ( 'patrick' | 'patty' | 'paddy' ) ( SINGLE_QUOTE )? ( 's' )?
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:16: ( 'patrick' | 'patty' | 'paddy' )
			int alt121=3;
			int LA121_0 = input.LA(1);
			if ( (LA121_0=='p') ) {
				int LA121_1 = input.LA(2);
				if ( (LA121_1=='a') ) {
					int LA121_2 = input.LA(3);
					if ( (LA121_2=='t') ) {
						int LA121_3 = input.LA(4);
						if ( (LA121_3=='r') ) {
							alt121=1;
						}
						else if ( (LA121_3=='t') ) {
							alt121=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 121, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA121_2=='d') ) {
						alt121=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 121, 2, input);
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
							new NoViableAltException("", 121, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}

			switch (alt121) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:17: 'patrick'
					{
					match("patrick"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:29: 'patty'
					{
					match("patty"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:39: 'paddy'
					{
					match("paddy"); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:48: ( SINGLE_QUOTE )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0=='\'') ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
					{
					if ( input.LA(1)=='\'' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:62: ( 's' )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0=='s') ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:308:62: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PATRICK"

	// $ANTLR start "SAINT"
	public final void mSAINT() throws RecognitionException {
		try {
			int _type = SAINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:309:14: ( 'saint' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:309:16: 'saint'
			{
			match("saint"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SAINT"

	// $ANTLR start "TAX"
	public final void mTAX() throws RecognitionException {
		try {
			int _type = TAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:310:14: ( 'tax' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:310:16: 'tax'
			{
			match("tax"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAX"

	// $ANTLR start "THANKSGIVING"
	public final void mTHANKSGIVING() throws RecognitionException {
		try {
			int _type = THANKSGIVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:311:14: ( 'thanksgiving' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:311:16: 'thanksgiving' ( 's' )?
			{
			match("thanksgiving"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:311:31: ( 's' )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0=='s') ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:311:31: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THANKSGIVING"

	// $ANTLR start "ELECTION"
	public final void mELECTION() throws RecognitionException {
		try {
			int _type = ELECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:312:14: ( 'election' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:312:16: 'election'
			{
			match("election"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELECTION"

	// $ANTLR start "VALENTINE"
	public final void mVALENTINE() throws RecognitionException {
		try {
			int _type = VALENTINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:313:14: ( 'valentine' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:313:16: 'valentine' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("valentine"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:313:28: ( SINGLE_QUOTE )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0=='\'') ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
					{
					if ( input.LA(1)=='\'' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:313:42: ( 's' )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0=='s') ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:313:42: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALENTINE"

	// $ANTLR start "VETERAN"
	public final void mVETERAN() throws RecognitionException {
		try {
			int _type = VETERAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:314:14: ( 'veteran' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:314:16: 'veteran' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("veteran"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:314:26: ( SINGLE_QUOTE )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0=='\'') ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
					{
					if ( input.LA(1)=='\'' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:314:40: ( 's' )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0=='s') ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:314:40: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VETERAN"

	// $ANTLR start "GROUND"
	public final void mGROUND() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:315:17: ( 'ground' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:315:19: 'ground'
			{
			match("ground"); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUND"

	// $ANTLR start "HOG"
	public final void mHOG() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:316:17: ( 'hog' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:316:19: 'hog'
			{
			match("hog"); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HOG"

	// $ANTLR start "WINTER"
	public final void mWINTER() throws RecognitionException {
		try {
			int _type = WINTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:320:8: ( 'winter' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:320:10: 'winter' ( 's' )?
			{
			match("winter"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:320:19: ( 's' )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0=='s') ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:320:19: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WINTER"

	// $ANTLR start "FALL"
	public final void mFALL() throws RecognitionException {
		try {
			int _type = FALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:321:8: ( 'fall' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:321:10: 'fall' ( 's' )?
			{
			match("fall"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:321:19: ( 's' )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0=='s') ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:321:19: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALL"

	// $ANTLR start "AUTUMN"
	public final void mAUTUMN() throws RecognitionException {
		try {
			int _type = AUTUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:322:8: ( 'autumn' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:322:10: 'autumn' ( 's' )?
			{
			match("autumn"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:322:19: ( 's' )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0=='s') ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:322:19: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTUMN"

	// $ANTLR start "SPRING"
	public final void mSPRING() throws RecognitionException {
		try {
			int _type = SPRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:323:8: ( 'spring' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:323:10: 'spring' ( 's' )?
			{
			match("spring"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:323:19: ( 's' )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0=='s') ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:323:19: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPRING"

	// $ANTLR start "SUMMER"
	public final void mSUMMER() throws RecognitionException {
		try {
			int _type = SUMMER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:324:8: ( 'summer' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:324:10: 'summer' ( 's' )?
			{
			match("summer"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:324:19: ( 's' )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0=='s') ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:324:19: 's'
					{
					match('s'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUMMER"

	// $ANTLR start "UNKNOWN"
	public final void mUNKNOWN() throws RecognitionException {
		try {
			int _type = UNKNOWN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:327:3: ( UNKNOWN_CHAR )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '-')||(input.LA(1) >= '/' && input.LA(1) <= '\u009F')||(input.LA(1) >= '\u00A1' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNKNOWN"

	// $ANTLR start "UNKNOWN_CHAR"
	public final void mUNKNOWN_CHAR() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:331:3: (~ ( SPACE | DOT ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '-')||(input.LA(1) >= '/' && input.LA(1) <= '\u009F')||(input.LA(1) >= '\u00A1' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNKNOWN_CHAR"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:334:16: ( '0' .. '9' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:336:16: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u00A0' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)=='\u00A0' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	@Override
	public void mTokens() throws RecognitionException {
		// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:8: ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | MINUTE | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | TONIGHT | YESTERDAY | EVERY | UNTIL | AT | AFTER | PAST | AM | PM | T | MILITARY_HOUR_SUFFIX | MIDNIGHT | NOON | MORNING | EVENING | NIGHT | UTC | EST | PST | CST | MST | AKST | HAST | INT_00 | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_0 | INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | THIRTIETH | ST | ND | RD | TH | COLON | COMMA | DASH | SLASH | DOT | PLUS | SINGLE_QUOTE | CURRENT | FOR | IN | AN | THE | OR | AND | TO | THROUGH | ON | OF | THIS | THAT | LAST | NEXT | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | BEGINNING | START | END | WHITE_SPACE | FOOL | BLACK | CHRISTMAS | COLUMBUS | EARTH | EASTER | FATHER | FLAG | GOOD | GROUNDHOG | HALLOWEEN | INAUGURATION | INDEPENDENCE | KWANZAA | LABOR | MLK | MEMORIAL | MOTHER | NEW | PALM | PATRIOT | PRESIDENT | PATRICK | SAINT | TAX | THANKSGIVING | ELECTION | VALENTINE | VETERAN | WINTER | FALL | AUTUMN | SPRING | SUMMER | UNKNOWN )
		int alt134=273;
		alt134 = dfa134.predict(input);
		switch (alt134) {
			case 1 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:10: JANUARY
				{
				mJANUARY(); 

				}
				break;
			case 2 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:18: FEBRUARY
				{
				mFEBRUARY(); 

				}
				break;
			case 3 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:27: MARCH
				{
				mMARCH(); 

				}
				break;
			case 4 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:33: APRIL
				{
				mAPRIL(); 

				}
				break;
			case 5 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:39: MAY
				{
				mMAY(); 

				}
				break;
			case 6 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:43: JUNE
				{
				mJUNE(); 

				}
				break;
			case 7 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:48: JULY
				{
				mJULY(); 

				}
				break;
			case 8 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:53: AUGUST
				{
				mAUGUST(); 

				}
				break;
			case 9 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:60: SEPTEMBER
				{
				mSEPTEMBER(); 

				}
				break;
			case 10 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:70: OCTOBER
				{
				mOCTOBER(); 

				}
				break;
			case 11 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:78: NOVEMBER
				{
				mNOVEMBER(); 

				}
				break;
			case 12 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:87: DECEMBER
				{
				mDECEMBER(); 

				}
				break;
			case 13 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:96: SUNDAY
				{
				mSUNDAY(); 

				}
				break;
			case 14 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:103: MONDAY
				{
				mMONDAY(); 

				}
				break;
			case 15 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:110: TUESDAY
				{
				mTUESDAY(); 

				}
				break;
			case 16 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:118: WEDNESDAY
				{
				mWEDNESDAY(); 

				}
				break;
			case 17 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:128: THURSDAY
				{
				mTHURSDAY(); 

				}
				break;
			case 18 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:137: FRIDAY
				{
				mFRIDAY(); 

				}
				break;
			case 19 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:144: SATURDAY
				{
				mSATURDAY(); 

				}
				break;
			case 20 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:153: HOUR
				{
				mHOUR(); 

				}
				break;
			case 21 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:158: MINUTE
				{
				mMINUTE(); 

				}
				break;
			case 22 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:165: DAY
				{
				mDAY(); 

				}
				break;
			case 23 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:169: WEEK
				{
				mWEEK(); 

				}
				break;
			case 24 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:174: MONTH
				{
				mMONTH(); 

				}
				break;
			case 25 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:180: YEAR
				{
				mYEAR(); 

				}
				break;
			case 26 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:185: TODAY
				{
				mTODAY(); 

				}
				break;
			case 27 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:191: TOMORROW
				{
				mTOMORROW(); 

				}
				break;
			case 28 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:200: TONIGHT
				{
				mTONIGHT(); 

				}
				break;
			case 29 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:208: YESTERDAY
				{
				mYESTERDAY(); 

				}
				break;
			case 30 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:218: EVERY
				{
				mEVERY(); 

				}
				break;
			case 31 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:224: UNTIL
				{
				mUNTIL(); 

				}
				break;
			case 32 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:230: AT
				{
				mAT(); 

				}
				break;
			case 33 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:233: AFTER
				{
				mAFTER(); 

				}
				break;
			case 34 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:239: PAST
				{
				mPAST(); 

				}
				break;
			case 35 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:244: AM
				{
				mAM(); 

				}
				break;
			case 36 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:247: PM
				{
				mPM(); 

				}
				break;
			case 37 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:250: T
				{
				mT(); 

				}
				break;
			case 38 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:252: MILITARY_HOUR_SUFFIX
				{
				mMILITARY_HOUR_SUFFIX(); 

				}
				break;
			case 39 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:273: MIDNIGHT
				{
				mMIDNIGHT(); 

				}
				break;
			case 40 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:282: NOON
				{
				mNOON(); 

				}
				break;
			case 41 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:287: MORNING
				{
				mMORNING(); 

				}
				break;
			case 42 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:295: EVENING
				{
				mEVENING(); 

				}
				break;
			case 43 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:303: NIGHT
				{
				mNIGHT(); 

				}
				break;
			case 44 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:309: UTC
				{
				mUTC(); 

				}
				break;
			case 45 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:313: EST
				{
				mEST(); 

				}
				break;
			case 46 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:317: PST
				{
				mPST(); 

				}
				break;
			case 47 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:321: CST
				{
				mCST(); 

				}
				break;
			case 48 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:325: MST
				{
				mMST(); 

				}
				break;
			case 49 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:329: AKST
				{
				mAKST(); 

				}
				break;
			case 50 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:334: HAST
				{
				mHAST(); 

				}
				break;
			case 51 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:339: INT_00
				{
				mINT_00(); 

				}
				break;
			case 52 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:346: INT_01
				{
				mINT_01(); 

				}
				break;
			case 53 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:353: INT_02
				{
				mINT_02(); 

				}
				break;
			case 54 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:360: INT_03
				{
				mINT_03(); 

				}
				break;
			case 55 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:367: INT_04
				{
				mINT_04(); 

				}
				break;
			case 56 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:374: INT_05
				{
				mINT_05(); 

				}
				break;
			case 57 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:381: INT_06
				{
				mINT_06(); 

				}
				break;
			case 58 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:388: INT_07
				{
				mINT_07(); 

				}
				break;
			case 59 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:395: INT_08
				{
				mINT_08(); 

				}
				break;
			case 60 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:402: INT_09
				{
				mINT_09(); 

				}
				break;
			case 61 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:409: INT_0
				{
				mINT_0(); 

				}
				break;
			case 62 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:415: INT_1
				{
				mINT_1(); 

				}
				break;
			case 63 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:421: INT_2
				{
				mINT_2(); 

				}
				break;
			case 64 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:427: INT_3
				{
				mINT_3(); 

				}
				break;
			case 65 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:433: INT_4
				{
				mINT_4(); 

				}
				break;
			case 66 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:439: INT_5
				{
				mINT_5(); 

				}
				break;
			case 67 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:445: INT_6
				{
				mINT_6(); 

				}
				break;
			case 68 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:451: INT_7
				{
				mINT_7(); 

				}
				break;
			case 69 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:457: INT_8
				{
				mINT_8(); 

				}
				break;
			case 70 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:463: INT_9
				{
				mINT_9(); 

				}
				break;
			case 71 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:469: INT_10
				{
				mINT_10(); 

				}
				break;
			case 72 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:476: INT_11
				{
				mINT_11(); 

				}
				break;
			case 73 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:483: INT_12
				{
				mINT_12(); 

				}
				break;
			case 74 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:490: INT_13
				{
				mINT_13(); 

				}
				break;
			case 75 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:497: INT_14
				{
				mINT_14(); 

				}
				break;
			case 76 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:504: INT_15
				{
				mINT_15(); 

				}
				break;
			case 77 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:511: INT_16
				{
				mINT_16(); 

				}
				break;
			case 78 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:518: INT_17
				{
				mINT_17(); 

				}
				break;
			case 79 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:525: INT_18
				{
				mINT_18(); 

				}
				break;
			case 80 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:532: INT_19
				{
				mINT_19(); 

				}
				break;
			case 81 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:539: INT_20
				{
				mINT_20(); 

				}
				break;
			case 82 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:546: INT_21
				{
				mINT_21(); 

				}
				break;
			case 83 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:553: INT_22
				{
				mINT_22(); 

				}
				break;
			case 84 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:560: INT_23
				{
				mINT_23(); 

				}
				break;
			case 85 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:567: INT_24
				{
				mINT_24(); 

				}
				break;
			case 86 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:574: INT_25
				{
				mINT_25(); 

				}
				break;
			case 87 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:581: INT_26
				{
				mINT_26(); 

				}
				break;
			case 88 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:588: INT_27
				{
				mINT_27(); 

				}
				break;
			case 89 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:595: INT_28
				{
				mINT_28(); 

				}
				break;
			case 90 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:602: INT_29
				{
				mINT_29(); 

				}
				break;
			case 91 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:609: INT_30
				{
				mINT_30(); 

				}
				break;
			case 92 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:616: INT_31
				{
				mINT_31(); 

				}
				break;
			case 93 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:623: INT_32
				{
				mINT_32(); 

				}
				break;
			case 94 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:630: INT_33
				{
				mINT_33(); 

				}
				break;
			case 95 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:637: INT_34
				{
				mINT_34(); 

				}
				break;
			case 96 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:644: INT_35
				{
				mINT_35(); 

				}
				break;
			case 97 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:651: INT_36
				{
				mINT_36(); 

				}
				break;
			case 98 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:658: INT_37
				{
				mINT_37(); 

				}
				break;
			case 99 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:665: INT_38
				{
				mINT_38(); 

				}
				break;
			case 100 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:672: INT_39
				{
				mINT_39(); 

				}
				break;
			case 101 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:679: INT_40
				{
				mINT_40(); 

				}
				break;
			case 102 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:686: INT_41
				{
				mINT_41(); 

				}
				break;
			case 103 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:693: INT_42
				{
				mINT_42(); 

				}
				break;
			case 104 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:700: INT_43
				{
				mINT_43(); 

				}
				break;
			case 105 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:707: INT_44
				{
				mINT_44(); 

				}
				break;
			case 106 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:714: INT_45
				{
				mINT_45(); 

				}
				break;
			case 107 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:721: INT_46
				{
				mINT_46(); 

				}
				break;
			case 108 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:728: INT_47
				{
				mINT_47(); 

				}
				break;
			case 109 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:735: INT_48
				{
				mINT_48(); 

				}
				break;
			case 110 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:742: INT_49
				{
				mINT_49(); 

				}
				break;
			case 111 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:749: INT_50
				{
				mINT_50(); 

				}
				break;
			case 112 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:756: INT_51
				{
				mINT_51(); 

				}
				break;
			case 113 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:763: INT_52
				{
				mINT_52(); 

				}
				break;
			case 114 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:770: INT_53
				{
				mINT_53(); 

				}
				break;
			case 115 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:777: INT_54
				{
				mINT_54(); 

				}
				break;
			case 116 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:784: INT_55
				{
				mINT_55(); 

				}
				break;
			case 117 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:791: INT_56
				{
				mINT_56(); 

				}
				break;
			case 118 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:798: INT_57
				{
				mINT_57(); 

				}
				break;
			case 119 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:805: INT_58
				{
				mINT_58(); 

				}
				break;
			case 120 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:812: INT_59
				{
				mINT_59(); 

				}
				break;
			case 121 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:819: INT_60
				{
				mINT_60(); 

				}
				break;
			case 122 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:826: INT_61
				{
				mINT_61(); 

				}
				break;
			case 123 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:833: INT_62
				{
				mINT_62(); 

				}
				break;
			case 124 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:840: INT_63
				{
				mINT_63(); 

				}
				break;
			case 125 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:847: INT_64
				{
				mINT_64(); 

				}
				break;
			case 126 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:854: INT_65
				{
				mINT_65(); 

				}
				break;
			case 127 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:861: INT_66
				{
				mINT_66(); 

				}
				break;
			case 128 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:868: INT_67
				{
				mINT_67(); 

				}
				break;
			case 129 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:875: INT_68
				{
				mINT_68(); 

				}
				break;
			case 130 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:882: INT_69
				{
				mINT_69(); 

				}
				break;
			case 131 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:889: INT_70
				{
				mINT_70(); 

				}
				break;
			case 132 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:896: INT_71
				{
				mINT_71(); 

				}
				break;
			case 133 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:903: INT_72
				{
				mINT_72(); 

				}
				break;
			case 134 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:910: INT_73
				{
				mINT_73(); 

				}
				break;
			case 135 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:917: INT_74
				{
				mINT_74(); 

				}
				break;
			case 136 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:924: INT_75
				{
				mINT_75(); 

				}
				break;
			case 137 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:931: INT_76
				{
				mINT_76(); 

				}
				break;
			case 138 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:938: INT_77
				{
				mINT_77(); 

				}
				break;
			case 139 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:945: INT_78
				{
				mINT_78(); 

				}
				break;
			case 140 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:952: INT_79
				{
				mINT_79(); 

				}
				break;
			case 141 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:959: INT_80
				{
				mINT_80(); 

				}
				break;
			case 142 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:966: INT_81
				{
				mINT_81(); 

				}
				break;
			case 143 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:973: INT_82
				{
				mINT_82(); 

				}
				break;
			case 144 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:980: INT_83
				{
				mINT_83(); 

				}
				break;
			case 145 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:987: INT_84
				{
				mINT_84(); 

				}
				break;
			case 146 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:994: INT_85
				{
				mINT_85(); 

				}
				break;
			case 147 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1001: INT_86
				{
				mINT_86(); 

				}
				break;
			case 148 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1008: INT_87
				{
				mINT_87(); 

				}
				break;
			case 149 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1015: INT_88
				{
				mINT_88(); 

				}
				break;
			case 150 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1022: INT_89
				{
				mINT_89(); 

				}
				break;
			case 151 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1029: INT_90
				{
				mINT_90(); 

				}
				break;
			case 152 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1036: INT_91
				{
				mINT_91(); 

				}
				break;
			case 153 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1043: INT_92
				{
				mINT_92(); 

				}
				break;
			case 154 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1050: INT_93
				{
				mINT_93(); 

				}
				break;
			case 155 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1057: INT_94
				{
				mINT_94(); 

				}
				break;
			case 156 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1064: INT_95
				{
				mINT_95(); 

				}
				break;
			case 157 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1071: INT_96
				{
				mINT_96(); 

				}
				break;
			case 158 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1078: INT_97
				{
				mINT_97(); 

				}
				break;
			case 159 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1085: INT_98
				{
				mINT_98(); 

				}
				break;
			case 160 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1092: INT_99
				{
				mINT_99(); 

				}
				break;
			case 161 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1099: ONE
				{
				mONE(); 

				}
				break;
			case 162 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1103: TWO
				{
				mTWO(); 

				}
				break;
			case 163 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1107: THREE
				{
				mTHREE(); 

				}
				break;
			case 164 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1113: FOUR
				{
				mFOUR(); 

				}
				break;
			case 165 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1118: FIVE
				{
				mFIVE(); 

				}
				break;
			case 166 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1123: SIX
				{
				mSIX(); 

				}
				break;
			case 167 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1127: SEVEN
				{
				mSEVEN(); 

				}
				break;
			case 168 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1133: EIGHT
				{
				mEIGHT(); 

				}
				break;
			case 169 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1139: NINE
				{
				mNINE(); 

				}
				break;
			case 170 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1144: TEN
				{
				mTEN(); 

				}
				break;
			case 171 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1148: ELEVEN
				{
				mELEVEN(); 

				}
				break;
			case 172 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1155: TWELVE
				{
				mTWELVE(); 

				}
				break;
			case 173 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1162: THIRTEEN
				{
				mTHIRTEEN(); 

				}
				break;
			case 174 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1171: FOURTEEN
				{
				mFOURTEEN(); 

				}
				break;
			case 175 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1180: FIFTEEN
				{
				mFIFTEEN(); 

				}
				break;
			case 176 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1188: SIXTEEN
				{
				mSIXTEEN(); 

				}
				break;
			case 177 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1196: SEVENTEEN
				{
				mSEVENTEEN(); 

				}
				break;
			case 178 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1206: EIGHTEEN
				{
				mEIGHTEEN(); 

				}
				break;
			case 179 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1215: NINETEEN
				{
				mNINETEEN(); 

				}
				break;
			case 180 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1224: TWENTY
				{
				mTWENTY(); 

				}
				break;
			case 181 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1231: THIRTY
				{
				mTHIRTY(); 

				}
				break;
			case 182 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1238: FIRST
				{
				mFIRST(); 

				}
				break;
			case 183 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1244: SECOND
				{
				mSECOND(); 

				}
				break;
			case 184 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1251: THIRD
				{
				mTHIRD(); 

				}
				break;
			case 185 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1257: FOURTH
				{
				mFOURTH(); 

				}
				break;
			case 186 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1264: FIFTH
				{
				mFIFTH(); 

				}
				break;
			case 187 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1270: SIXTH
				{
				mSIXTH(); 

				}
				break;
			case 188 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1276: SEVENTH
				{
				mSEVENTH(); 

				}
				break;
			case 189 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1284: EIGHTH
				{
				mEIGHTH(); 

				}
				break;
			case 190 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1291: NINTH
				{
				mNINTH(); 

				}
				break;
			case 191 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1297: TENTH
				{
				mTENTH(); 

				}
				break;
			case 192 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1303: ELEVENTH
				{
				mELEVENTH(); 

				}
				break;
			case 193 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1312: TWELFTH
				{
				mTWELFTH(); 

				}
				break;
			case 194 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1320: THIRTEENTH
				{
				mTHIRTEENTH(); 

				}
				break;
			case 195 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1331: FOURTEENTH
				{
				mFOURTEENTH(); 

				}
				break;
			case 196 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1342: FIFTEENTH
				{
				mFIFTEENTH(); 

				}
				break;
			case 197 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1352: SIXTEENTH
				{
				mSIXTEENTH(); 

				}
				break;
			case 198 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1362: SEVENTEENTH
				{
				mSEVENTEENTH(); 

				}
				break;
			case 199 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1374: EIGHTEENTH
				{
				mEIGHTEENTH(); 

				}
				break;
			case 200 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1385: NINETEENTH
				{
				mNINETEENTH(); 

				}
				break;
			case 201 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1396: TWENTIETH
				{
				mTWENTIETH(); 

				}
				break;
			case 202 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1406: THIRTIETH
				{
				mTHIRTIETH(); 

				}
				break;
			case 203 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1416: ST
				{
				mST(); 

				}
				break;
			case 204 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1419: ND
				{
				mND(); 

				}
				break;
			case 205 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1422: RD
				{
				mRD(); 

				}
				break;
			case 206 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1425: TH
				{
				mTH(); 

				}
				break;
			case 207 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1428: COLON
				{
				mCOLON(); 

				}
				break;
			case 208 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1434: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 209 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1440: DASH
				{
				mDASH(); 

				}
				break;
			case 210 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1445: SLASH
				{
				mSLASH(); 

				}
				break;
			case 211 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1451: DOT
				{
				mDOT(); 

				}
				break;
			case 212 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1455: PLUS
				{
				mPLUS(); 

				}
				break;
			case 213 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1460: SINGLE_QUOTE
				{
				mSINGLE_QUOTE(); 

				}
				break;
			case 214 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1473: CURRENT
				{
				mCURRENT(); 

				}
				break;
			case 215 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1481: FOR
				{
				mFOR(); 

				}
				break;
			case 216 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1485: IN
				{
				mIN(); 

				}
				break;
			case 217 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1488: AN
				{
				mAN(); 

				}
				break;
			case 218 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1491: THE
				{
				mTHE(); 

				}
				break;
			case 219 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1495: OR
				{
				mOR(); 

				}
				break;
			case 220 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1498: AND
				{
				mAND(); 

				}
				break;
			case 221 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1502: TO
				{
				mTO(); 

				}
				break;
			case 222 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1505: THROUGH
				{
				mTHROUGH(); 

				}
				break;
			case 223 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1513: ON
				{
				mON(); 

				}
				break;
			case 224 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1516: OF
				{
				mOF(); 

				}
				break;
			case 225 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1519: THIS
				{
				mTHIS(); 

				}
				break;
			case 226 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1524: THAT
				{
				mTHAT(); 

				}
				break;
			case 227 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1529: LAST
				{
				mLAST(); 

				}
				break;
			case 228 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1534: NEXT
				{
				mNEXT(); 

				}
				break;
			case 229 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1539: COMING
				{
				mCOMING(); 

				}
				break;
			case 230 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1546: UPCOMING
				{
				mUPCOMING(); 

				}
				break;
			case 231 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1555: FROM
				{
				mFROM(); 

				}
				break;
			case 232 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1560: NOW
				{
				mNOW(); 

				}
				break;
			case 233 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1564: AGO
				{
				mAGO(); 

				}
				break;
			case 234 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1568: BEFORE
				{
				mBEFORE(); 

				}
				break;
			case 235 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1575: BEGINNING
				{
				mBEGINNING(); 

				}
				break;
			case 236 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1585: START
				{
				mSTART(); 

				}
				break;
			case 237 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1591: END
				{
				mEND(); 

				}
				break;
			case 238 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1595: WHITE_SPACE
				{
				mWHITE_SPACE(); 

				}
				break;
			case 239 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1607: FOOL
				{
				mFOOL(); 

				}
				break;
			case 240 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1612: BLACK
				{
				mBLACK(); 

				}
				break;
			case 241 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1618: CHRISTMAS
				{
				mCHRISTMAS(); 

				}
				break;
			case 242 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1628: COLUMBUS
				{
				mCOLUMBUS(); 

				}
				break;
			case 243 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1637: EARTH
				{
				mEARTH(); 

				}
				break;
			case 244 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1643: EASTER
				{
				mEASTER(); 

				}
				break;
			case 245 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1650: FATHER
				{
				mFATHER(); 

				}
				break;
			case 246 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1657: FLAG
				{
				mFLAG(); 

				}
				break;
			case 247 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1662: GOOD
				{
				mGOOD(); 

				}
				break;
			case 248 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1667: GROUNDHOG
				{
				mGROUNDHOG(); 

				}
				break;
			case 249 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1677: HALLOWEEN
				{
				mHALLOWEEN(); 

				}
				break;
			case 250 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1687: INAUGURATION
				{
				mINAUGURATION(); 

				}
				break;
			case 251 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1700: INDEPENDENCE
				{
				mINDEPENDENCE(); 

				}
				break;
			case 252 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1713: KWANZAA
				{
				mKWANZAA(); 

				}
				break;
			case 253 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1721: LABOR
				{
				mLABOR(); 

				}
				break;
			case 254 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1727: MLK
				{
				mMLK(); 

				}
				break;
			case 255 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1731: MEMORIAL
				{
				mMEMORIAL(); 

				}
				break;
			case 256 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1740: MOTHER
				{
				mMOTHER(); 

				}
				break;
			case 257 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1747: NEW
				{
				mNEW(); 

				}
				break;
			case 258 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1751: PALM
				{
				mPALM(); 

				}
				break;
			case 259 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1756: PATRIOT
				{
				mPATRIOT(); 

				}
				break;
			case 260 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1764: PRESIDENT
				{
				mPRESIDENT(); 

				}
				break;
			case 261 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1774: PATRICK
				{
				mPATRICK(); 

				}
				break;
			case 262 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1782: SAINT
				{
				mSAINT(); 

				}
				break;
			case 263 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1788: TAX
				{
				mTAX(); 

				}
				break;
			case 264 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1792: THANKSGIVING
				{
				mTHANKSGIVING(); 

				}
				break;
			case 265 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1805: ELECTION
				{
				mELECTION(); 

				}
				break;
			case 266 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1814: VALENTINE
				{
				mVALENTINE(); 

				}
				break;
			case 267 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1824: VETERAN
				{
				mVETERAN(); 

				}
				break;
			case 268 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1832: WINTER
				{
				mWINTER(); 

				}
				break;
			case 269 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1839: FALL
				{
				mFALL(); 

				}
				break;
			case 270 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1844: AUTUMN
				{
				mAUTUMN(); 

				}
				break;
			case 271 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1851: SPRING
				{
				mSPRING(); 

				}
				break;
			case 272 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1858: SUMMER
				{
				mSUMMER(); 

				}
				break;
			case 273 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\en\\DateLexer.g:1:1865: UNKNOWN
				{
				mUNKNOWN(); 

				}
				break;

		}
	}


	protected DFA134 dfa134 = new DFA134(this);
	static final String DFA134_eotS =
		"\1\uffff\3\55\1\100\4\55\1\133\1\55\1\142\3\55\1\uffff\1\157\1\55\1\uffff"+
		"\1\55\1\u0082\1\u008d\1\u0098\1\u00a3\1\u00ae\1\u00b9\1\u00c4\1\u00cf"+
		"\1\u00da\1\u00e5\1\55\4\uffff\1\u00eb\2\uffff\3\55\1\uffff\3\55\25\uffff"+
		"\1\u010d\5\uffff\1\u0117\2\uffff\1\u0119\11\uffff\1\u0126\1\u0129\u0097"+
		"\uffff\1\u013e\23\uffff\1\u0144\1\uffff\1\u0145\20\uffff\1\u014a\26\uffff"+
		"\1\u0156\4\uffff\1\u0159\20\uffff\1\u0160\10\uffff\1\u0168\13\uffff\1"+
		"\135\13\uffff\1\u0175\1\u0177\12\uffff\1\u0183\17\uffff\1\u018d\4\uffff"+
		"\1\u0190\2\uffff\1\u0193\2\uffff\1\u0196\6\uffff\1\u019b\5\uffff\1\u019e"+
		"\1\u01a0\1\u0181\2\uffff\1\u01a3\7\uffff";
	static final String DFA134_eofS =
		"\u01a4\uffff";
	static final String DFA134_minS =
		"\1\0\3\141\1\146\1\141\1\143\1\144\2\141\1\145\1\141\1\145\1\141\1\156"+
		"\1\uffff\1\141\1\155\1\uffff\1\144\12\60\1\144\4\uffff\1\11\2\uffff\1"+
		"\156\1\141\1\145\1\uffff\1\55\1\167\1\141\2\uffff\1\154\1\uffff\1\151"+
		"\1\157\1\146\1\154\1\uffff\1\162\1\156\1\144\4\uffff\1\147\1\uffff\1\164"+
		"\2\uffff\1\144\1\uffff\1\143\1\155\1\151\1\170\1\141\2\uffff\1\145\2\uffff"+
		"\1\157\1\147\1\uffff\1\167\3\uffff\1\141\1\144\1\uffff\1\145\1\156\2\uffff"+
		"\1\144\3\uffff\1\144\2\uffff\1\141\1\uffff\1\145\1\uffff\1\162\1\147\1"+
		"\145\4\uffff\1\143\7\uffff\1\154\167\uffff\1\141\1\142\1\146\10\uffff"+
		"\1\162\3\uffff\1\164\4\uffff\1\164\1\uffff\1\164\6\uffff\1\145\3\uffff"+
		"\1\145\5\uffff\1\164\10\uffff\1\145\3\uffff\1\145\1\162\1\uffff\1\156"+
		"\5\uffff\1\154\1\164\1\uffff\1\153\2\uffff\1\162\1\164\1\uffff\1\150\1"+
		"\143\2\uffff\1\162\11\uffff\1\164\1\145\3\uffff\1\162\1\156\1\145\1\uffff"+
		"\1\164\3\uffff\1\144\3\uffff\1\146\1\164\2\uffff\1\145\2\uffff\1\145\1"+
		"\164\1\145\1\uffff\1\151\1\145\1\uffff\1\145\1\uffff\1\55\1\164\1\145"+
		"\1\uffff\1\145\1\uffff\1\145\3\uffff\1\151\1\162\1\145\1\156\1\143\1\145"+
		"\1\uffff\1\156\1\uffff\1\145\1\uffff\1\156\2\145\4\uffff\1\156\1\145\3"+
		"\uffff\1\164\1\uffff\1\156\1\164\1\145\1\uffff\1\164\2\156\1\uffff\1\156"+
		"\2\uffff\1\164\2\uffff\1\156\2\uffff\3\164\2\uffff\1\164\7\uffff";
	static final String DFA134_maxS =
		"\1\uffff\1\165\1\162\1\164\2\165\1\162\1\157\1\145\1\167\1\153\1\163\1"+
		"\162\1\166\1\164\1\uffff\1\164\1\162\1\uffff\1\165\12\71\1\144\4\uffff"+
		"\1\u00a0\2\uffff\1\156\1\141\1\154\1\uffff\1\155\1\167\1\145\2\uffff\1"+
		"\156\1\uffff\1\157\1\165\1\166\1\164\1\uffff\1\171\1\165\1\156\4\uffff"+
		"\1\164\1\uffff\1\164\2\uffff\1\144\1\uffff\1\166\1\156\1\164\1\170\1\141"+
		"\2\uffff\1\145\2\uffff\1\167\1\156\1\uffff\1\170\3\uffff\1\165\1\156\1"+
		"\uffff\1\157\1\156\2\uffff\1\145\3\uffff\1\167\2\uffff\1\163\1\uffff\1"+
		"\145\1\uffff\1\163\1\147\1\145\4\uffff\1\164\7\uffff\1\155\167\uffff\1"+
		"\144\1\163\1\147\10\uffff\1\162\3\uffff\1\164\4\uffff\1\164\1\uffff\1"+
		"\164\6\uffff\1\145\3\uffff\1\145\5\uffff\1\164\10\uffff\1\164\3\uffff"+
		"\1\157\1\163\1\uffff\1\164\5\uffff\1\156\1\164\1\uffff\1\153\2\uffff\1"+
		"\162\1\164\1\uffff\1\150\1\166\2\uffff\1\164\11\uffff\1\164\1\150\3\uffff"+
		"\1\162\1\156\1\150\1\uffff\1\164\3\uffff\1\164\3\uffff\1\166\1\164\2\uffff"+
		"\1\145\2\uffff\1\145\1\164\1\145\1\uffff\1\151\1\150\1\uffff\1\145\1\uffff"+
		"\1\156\1\164\1\145\1\uffff\1\145\1\uffff\1\171\3\uffff\1\171\1\162\1\164"+
		"\1\156\1\157\1\145\1\uffff\1\156\1\uffff\1\150\1\uffff\1\156\2\145\4\uffff"+
		"\1\156\1\145\3\uffff\1\164\1\uffff\1\156\1\164\1\145\1\uffff\1\164\2\156"+
		"\1\uffff\1\156\2\uffff\1\164\2\uffff\1\156\2\uffff\3\164\2\uffff\1\164"+
		"\7\uffff";
	static final String DFA134_acceptS =
		"\17\uffff\1\40\2\uffff\1\54\14\uffff\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1"+
		"\uffff\1\u00d4\1\u00d5\3\uffff\1\u00ee\3\uffff\1\u0111\1\1\1\uffff\1\2"+
		"\4\uffff\1\u00f6\3\uffff\1\60\1\u00fe\1\u00ff\1\4\1\uffff\1\40\1\uffff"+
		"\1\43\1\61\1\uffff\1\u00e9\5\uffff\1\u010f\1\12\1\uffff\1\u00db\1\u00e0"+
		"\2\uffff\1\u00cc\1\uffff\1\14\1\26\1\17\2\uffff\1\33\2\uffff\1\u0107\1"+
		"\45\1\uffff\1\27\1\u010c\1\24\1\uffff\1\62\1\46\1\uffff\1\31\1\uffff\1"+
		"\55\3\uffff\1\u00ed\1\37\1\54\1\u00e6\1\uffff\1\44\1\56\1\u0104\1\u00f7"+
		"\1\u00f8\1\57\1\u00d6\1\uffff\1\u00f1\1\63\1\64\1\65\1\66\1\67\1\70\1"+
		"\71\1\72\1\73\1\74\1\75\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116"+
		"\1\117\1\120\1\76\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131"+
		"\1\132\1\77\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144"+
		"\1\100\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\101"+
		"\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\102\1\171"+
		"\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\103\1\u0083"+
		"\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
		"\1\104\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
		"\1\u0095\1\u0096\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c"+
		"\1\u009d\1\u009e\1\u009f\1\u00a0\1\106\1\u00cd\1\u00cf\1\u00d0\1\u00d1"+
		"\1\u00d2\1\u00d3\1\u00d4\1\u00d5\3\uffff\1\u00f0\1\u00fc\1\u010a\1\u010b"+
		"\1\6\1\7\1\22\1\u00e7\1\uffff\1\u00d7\1\u00ef\1\u00a5\1\uffff\1\u00b6"+
		"\1\u00e3\1\u00f5\1\u010d\1\uffff\1\5\1\uffff\1\51\1\u0100\1\25\1\47\1"+
		"\10\1\u010e\1\uffff\1\u00dc\1\u00d9\1\11\1\uffff\1\u00b7\1\15\1\u0110"+
		"\1\23\1\u0106\1\uffff\1\u00ec\1\u00cb\1\u00a1\1\u00df\1\13\1\50\1\u00e8"+
		"\1\53\1\uffff\1\u00e4\1\u0101\1\21\2\uffff\1\u00da\1\uffff\1\u00ce\1\32"+
		"\1\34\1\u00dd\1\u00a2\2\uffff\1\20\1\uffff\1\u00f9\1\35\2\uffff\1\u00f3"+
		"\2\uffff\1\42\1\u0102\1\uffff\1\u0105\1\u00e5\1\u00f2\1\u00fa\1\u00fb"+
		"\1\u00d8\1\u00fd\1\u00ea\1\u00eb\2\uffff\1\3\1\16\1\30\3\uffff\1\u00a6"+
		"\1\uffff\1\u00be\1\u00a3\1\u00de\1\uffff\1\u00e1\1\u00e2\1\u0108\2\uffff"+
		"\1\u00bf\1\u00aa\1\uffff\1\36\1\52\3\uffff\1\u0109\2\uffff\1\u00a4\1\uffff"+
		"\1\u00ba\3\uffff\1\u00bb\1\uffff\1\u00a9\1\uffff\1\u00b8\1\u00ac\1\u00c1"+
		"\6\uffff\1\u00b9\1\uffff\1\41\1\uffff\1\u00a7\3\uffff\1\u00b5\1\u00ca"+
		"\1\u00b4\1\u00c9\2\uffff\1\u00b2\1\u00bd\1\u00a8\1\uffff\1\u0103\3\uffff"+
		"\1\u00bc\3\uffff\1\u00f4\1\uffff\1\u00c0\1\u00ab\1\uffff\1\u00c4\1\u00af"+
		"\1\uffff\1\u00c5\1\u00b0\3\uffff\1\u00c3\1\u00ae\1\uffff\1\u00c8\1\u00b3"+
		"\1\u00c2\1\u00ad\1\u00c7\1\u00c6\1\u00b1";
	static final String DFA134_specialS =
		"\1\0\u01a3\uffff}>";
	static final String[] DFA134_transitionS = {
			"\11\55\2\51\2\55\1\51\22\55\1\51\6\55\1\45\3\55\1\44\1\40\1\41\1\43\1"+
			"\42\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\37\5\55\1\17"+
			"\40\55\1\4\1\50\1\23\1\10\1\15\1\2\1\21\1\13\1\46\1\1\1\53\1\47\1\3\1"+
			"\7\1\6\1\20\1\55\1\36\1\5\1\11\1\16\1\54\1\12\1\52\1\14\1\22\45\55\1"+
			"\51\uff5f\55",
			"\1\56\23\uffff\1\57",
			"\1\64\3\uffff\1\60\3\uffff\1\63\2\uffff\1\65\2\uffff\1\62\2\uffff\1"+
			"\61",
			"\1\66\2\uffff\1\71\1\73\3\uffff\1\70\2\uffff\1\72\2\uffff\1\67\3\uffff"+
			"\2\71",
			"\1\77\1\103\3\uffff\2\101\1\uffff\1\102\1\uffff\1\74\3\uffff\1\76\1"+
			"\75",
			"\1\106\3\uffff\1\104\3\uffff\1\107\6\uffff\1\111\3\uffff\1\110\1\105",
			"\1\112\2\uffff\1\115\7\uffff\1\113\3\uffff\1\114",
			"\1\120\1\121\3\uffff\1\117\5\uffff\1\116",
			"\1\123\3\uffff\1\122",
			"\1\132\3\uffff\1\131\2\uffff\1\125\4\uffff\1\127\1\uffff\1\126\5\uffff"+
			"\1\124\1\uffff\1\130",
			"\1\134\3\uffff\1\136\1\uffff\1\135",
			"\1\140\15\uffff\1\137\2\uffff\1\137\1\141",
			"\1\143\14\uffff\1\144",
			"\1\147\2\uffff\1\146\4\uffff\1\150\2\uffff\1\151\1\uffff\1\152\4\uffff"+
			"\2\146\1\uffff\1\145",
			"\1\153\1\uffff\1\155\3\uffff\1\154",
			"",
			"\1\156\2\uffff\1\160\15\uffff\1\161\2\160",
			"\1\154\1\uffff\1\162\2\uffff\1\163",
			"",
			"\2\164\2\uffff\1\167\6\uffff\1\166\3\uffff\2\164\1\165",
			"\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081",
			"\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b"+
			"\1\u008c",
			"\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096"+
			"\1\u0097",
			"\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1"+
			"\1\u00a2",
			"\1\u00a4\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
			"\1\u00ad",
			"\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7"+
			"\1\u00b8",
			"\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2"+
			"\1\u00c3",
			"\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd"+
			"\1\u00ce",
			"\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8"+
			"\1\u00d9",
			"\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3"+
			"\1\u00e4",
			"\1\u00e6",
			"",
			"",
			"",
			"",
			"\2\51\2\uffff\1\51\22\uffff\1\51\15\uffff\1\51\161\uffff\1\51",
			"",
			"",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0\6\uffff\1\u00f1",
			"",
			"\1\167\77\uffff\1\167",
			"\1\u00f2",
			"\1\u00f3\3\uffff\1\u00f4",
			"",
			"",
			"\1\u00f6\1\uffff\1\u00f5",
			"",
			"\1\u00f7\5\uffff\1\u00f8",
			"\1\u00fb\2\uffff\1\u00fa\2\uffff\1\u00f9",
			"\1\u00fd\7\uffff\1\u00ff\3\uffff\1\u00fe\3\uffff\1\u00fc",
			"\1\u0101\7\uffff\1\u0100",
			"",
			"\1\u0102\6\uffff\1\u0103",
			"\1\u0104\3\uffff\1\u0105\1\uffff\1\u0106\1\71",
			"\1\u0108\11\uffff\1\u0107",
			"",
			"",
			"",
			"",
			"\1\u0109\14\uffff\1\u010a",
			"",
			"\1\u010b",
			"",
			"",
			"\1\u010c",
			"",
			"\1\u0110\14\uffff\1\u010e\5\uffff\1\u010f",
			"\1\u0112\1\u0111",
			"\1\u0114\12\uffff\1\u0113",
			"\1\u0115",
			"\1\u0116",
			"",
			"",
			"\1\u0118",
			"",
			"",
			"\1\u011b\6\uffff\1\u011a\1\u011c",
			"\1\u011d\6\uffff\1\u011e",
			"",
			"\1\u0120\1\u011f",
			"",
			"",
			"",
			"\1\u0125\3\uffff\1\u0124\3\uffff\1\u0123\10\uffff\1\u0122\2\uffff\1"+
			"\u0121",
			"\1\u0127\10\uffff\1\127\1\u0128",
			"",
			"\1\u012b\11\uffff\1\u012a",
			"\1\u012c",
			"",
			"",
			"\1\u012d\1\u012e",
			"",
			"",
			"",
			"\1\141\7\uffff\1\u012f\6\uffff\2\141\2\uffff\1\141",
			"",
			"",
			"\1\144\21\uffff\1\u0130",
			"",
			"\1\u0131",
			"",
			"\1\u0133\1\u0132",
			"\1\u0134",
			"\1\u0135",
			"",
			"",
			"",
			"",
			"\1\160\1\u0139\7\uffff\1\u0137\6\uffff\1\u0136\1\u0138",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u013b\1\u013a",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u013c\2\uffff\1\u013d",
			"\1\u013f\20\uffff\1\u00ff",
			"\1\u0140\1\u0141",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0142",
			"",
			"",
			"",
			"\1\u0143",
			"",
			"",
			"",
			"",
			"\1\72",
			"",
			"\1\u0146",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0147",
			"",
			"",
			"",
			"\1\u0148",
			"",
			"",
			"",
			"",
			"",
			"\1\u0149",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u014b\16\uffff\1\u014c",
			"",
			"",
			"",
			"\1\u014d\11\uffff\1\u014e",
			"\1\u014f\1\u0150",
			"",
			"\1\u0152\5\uffff\1\u0151",
			"",
			"",
			"",
			"",
			"",
			"\1\u0153\1\uffff\1\u0154",
			"\1\u0155",
			"",
			"\1\u0157",
			"",
			"",
			"\1\u0158",
			"\1\u015a",
			"",
			"\1\u015b",
			"\1\u015d\22\uffff\1\u015c",
			"",
			"",
			"\1\u015e\1\uffff\1\u0139",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u015f",
			"\1\u0161\2\uffff\1\u0162",
			"",
			"",
			"",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165\2\uffff\1\u0166",
			"",
			"\1\u0167",
			"",
			"",
			"",
			"\1\u016a\17\uffff\1\u0169",
			"",
			"",
			"",
			"\1\u016c\17\uffff\1\u016b",
			"\1\u016d",
			"",
			"",
			"\1\u0113",
			"",
			"",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"",
			"\1\u0171",
			"\1\u0172\2\uffff\1\u0173",
			"",
			"\1\u0174",
			"",
			"\1\u011b\100\uffff\1\u011b",
			"\1\u0176",
			"\1\u0178",
			"",
			"\1\u0179",
			"",
			"\1\u017a\3\uffff\1\u017c\17\uffff\1\u017b",
			"",
			"",
			"",
			"\1\u017e\17\uffff\1\u017d",
			"\1\u017f",
			"\1\u0180\2\uffff\1\u0182\13\uffff\1\u0181",
			"\1\u0184",
			"\1\u0139\13\uffff\1\u0185",
			"\1\u0186",
			"",
			"\1\u0187",
			"",
			"\1\u0188\2\uffff\1\u0189",
			"",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"",
			"",
			"",
			"",
			"\1\146",
			"\1\u018e",
			"",
			"",
			"",
			"\1\u018f",
			"",
			"\1\u0191",
			"\1\u0192",
			"\1\u0194",
			"",
			"\1\u0195",
			"\1\u0197",
			"\1\u0198",
			"",
			"\1\u0199",
			"",
			"",
			"\1\u019a",
			"",
			"",
			"\1\u019c",
			"",
			"",
			"\1\u019d",
			"\1\u019f",
			"\1\u01a1",
			"",
			"",
			"\1\u01a2",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA134_eot = DFA.unpackEncodedString(DFA134_eotS);
	static final short[] DFA134_eof = DFA.unpackEncodedString(DFA134_eofS);
	static final char[] DFA134_min = DFA.unpackEncodedStringToUnsignedChars(DFA134_minS);
	static final char[] DFA134_max = DFA.unpackEncodedStringToUnsignedChars(DFA134_maxS);
	static final short[] DFA134_accept = DFA.unpackEncodedString(DFA134_acceptS);
	static final short[] DFA134_special = DFA.unpackEncodedString(DFA134_specialS);
	static final short[][] DFA134_transition;

	static {
		int numStates = DFA134_transitionS.length;
		DFA134_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA134_transition[i] = DFA.unpackEncodedString(DFA134_transitionS[i]);
		}
	}

	protected class DFA134 extends DFA {

		public DFA134(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 134;
			this.eot = DFA134_eot;
			this.eof = DFA134_eof;
			this.min = DFA134_min;
			this.max = DFA134_max;
			this.accept = DFA134_accept;
			this.special = DFA134_special;
			this.transition = DFA134_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | MINUTE | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | TONIGHT | YESTERDAY | EVERY | UNTIL | AT | AFTER | PAST | AM | PM | T | MILITARY_HOUR_SUFFIX | MIDNIGHT | NOON | MORNING | EVENING | NIGHT | UTC | EST | PST | CST | MST | AKST | HAST | INT_00 | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_0 | INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | THIRTY | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | THIRTIETH | ST | ND | RD | TH | COLON | COMMA | DASH | SLASH | DOT | PLUS | SINGLE_QUOTE | CURRENT | FOR | IN | AN | THE | OR | AND | TO | THROUGH | ON | OF | THIS | THAT | LAST | NEXT | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | BEGINNING | START | END | WHITE_SPACE | FOOL | BLACK | CHRISTMAS | COLUMBUS | EARTH | EASTER | FATHER | FLAG | GOOD | GROUNDHOG | HALLOWEEN | INAUGURATION | INDEPENDENCE | KWANZAA | LABOR | MLK | MEMORIAL | MOTHER | NEW | PALM | PATRIOT | PRESIDENT | PATRICK | SAINT | TAX | THANKSGIVING | ELECTION | VALENTINE | VETERAN | WINTER | FALL | AUTUMN | SPRING | SUMMER | UNKNOWN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA134_0 = input.LA(1);
						s = -1;
						if ( (LA134_0=='j') ) {s = 1;}
						else if ( (LA134_0=='f') ) {s = 2;}
						else if ( (LA134_0=='m') ) {s = 3;}
						else if ( (LA134_0=='a') ) {s = 4;}
						else if ( (LA134_0=='s') ) {s = 5;}
						else if ( (LA134_0=='o') ) {s = 6;}
						else if ( (LA134_0=='n') ) {s = 7;}
						else if ( (LA134_0=='d') ) {s = 8;}
						else if ( (LA134_0=='t') ) {s = 9;}
						else if ( (LA134_0=='w') ) {s = 10;}
						else if ( (LA134_0=='h') ) {s = 11;}
						else if ( (LA134_0=='y') ) {s = 12;}
						else if ( (LA134_0=='e') ) {s = 13;}
						else if ( (LA134_0=='u') ) {s = 14;}
						else if ( (LA134_0=='@') ) {s = 15;}
						else if ( (LA134_0=='p') ) {s = 16;}
						else if ( (LA134_0=='g') ) {s = 17;}
						else if ( (LA134_0=='z') ) {s = 18;}
						else if ( (LA134_0=='c') ) {s = 19;}
						else if ( (LA134_0=='0') ) {s = 20;}
						else if ( (LA134_0=='1') ) {s = 21;}
						else if ( (LA134_0=='2') ) {s = 22;}
						else if ( (LA134_0=='3') ) {s = 23;}
						else if ( (LA134_0=='4') ) {s = 24;}
						else if ( (LA134_0=='5') ) {s = 25;}
						else if ( (LA134_0=='6') ) {s = 26;}
						else if ( (LA134_0=='7') ) {s = 27;}
						else if ( (LA134_0=='8') ) {s = 28;}
						else if ( (LA134_0=='9') ) {s = 29;}
						else if ( (LA134_0=='r') ) {s = 30;}
						else if ( (LA134_0==':') ) {s = 31;}
						else if ( (LA134_0==',') ) {s = 32;}
						else if ( (LA134_0=='-') ) {s = 33;}
						else if ( (LA134_0=='/') ) {s = 34;}
						else if ( (LA134_0=='.') ) {s = 35;}
						else if ( (LA134_0=='+') ) {s = 36;}
						else if ( (LA134_0=='\'') ) {s = 37;}
						else if ( (LA134_0=='i') ) {s = 38;}
						else if ( (LA134_0=='l') ) {s = 39;}
						else if ( (LA134_0=='b') ) {s = 40;}
						else if ( ((LA134_0 >= '\t' && LA134_0 <= '\n')||LA134_0=='\r'||LA134_0==' '||LA134_0=='\u00A0') ) {s = 41;}
						else if ( (LA134_0=='x') ) {s = 42;}
						else if ( (LA134_0=='k') ) {s = 43;}
						else if ( (LA134_0=='v') ) {s = 44;}
						else if ( ((LA134_0 >= '\u0000' && LA134_0 <= '\b')||(LA134_0 >= '\u000B' && LA134_0 <= '\f')||(LA134_0 >= '\u000E' && LA134_0 <= '\u001F')||(LA134_0 >= '!' && LA134_0 <= '&')||(LA134_0 >= '(' && LA134_0 <= '*')||(LA134_0 >= ';' && LA134_0 <= '?')||(LA134_0 >= 'A' && LA134_0 <= '`')||LA134_0=='q'||(LA134_0 >= '{' && LA134_0 <= '\u009F')||(LA134_0 >= '\u00A1' && LA134_0 <= '\uFFFF')) ) {s = 45;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 134, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
