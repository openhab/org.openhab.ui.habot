// $ANTLR 3.5.2 org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g 2018-03-09 01:56:39
 package org.openhab.ui.habot.nlp.internal.natty.generated.fr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DateLexerFR extends Lexer {
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

	  private static org.slf4j.Logger _logger =
	    org.slf4j.LoggerFactory.getLogger(org.openhab.ui.habot.nlp.internal.natty.generated.fr.DateLexerFR.class);

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

	public DateLexerFR() {} 
	public DateLexerFR(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DateLexerFR(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g"; }

	// $ANTLR start "JANUARY"
	public final void mJANUARY() throws RecognitionException {
		try {
			int _type = JANUARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:19:11: ( 'janvier' | 'jan' ( DOT )? )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='j') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='a') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='n') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='v') ) {
							alt2=1;
						}

						else {
							alt2=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
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
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:19:13: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:19:33: 'jan' ( DOT )?
					{
					match("jan"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:19:39: ( DOT )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0=='.') ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:20:11: ( 'février' | 'fev' ( DOT )? )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='f') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='\u00E9') ) {
					alt4=1;
				}
				else if ( (LA4_1=='e') ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:20:13: 'février'
					{
					match("février"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:20:33: 'fev' ( DOT )?
					{
					match("fev"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:20:39: ( DOT )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='.') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:21:11: ( 'mars' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:21:13: 'mars'
			{
			match("mars"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:22:11: ( 'avril' | 'avr' ( DOT )? )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='a') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='v') ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2=='r') ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3=='i') ) {
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:22:13: 'avril'
					{
					match("avril"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:22:33: 'avr' ( DOT )?
					{
					match("avr"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:22:39: ( DOT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='.') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:23:11: ( 'mai' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:23:13: 'mai'
			{
			match("mai"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:24:11: ( 'juin' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:24:13: 'juin'
			{
			match("juin"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:25:11: ( 'juillet' | 'juil' ( DOT )? )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='j') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='u') ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2=='i') ) {
						int LA8_3 = input.LA(4);
						if ( (LA8_3=='l') ) {
							int LA8_4 = input.LA(5);
							if ( (LA8_4=='l') ) {
								alt8=1;
							}

							else {
								alt8=2;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 3, input);
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
								new NoViableAltException("", 8, 2, input);
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
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:25:13: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:25:33: 'juil' ( DOT )?
					{
					match("juil"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:25:40: ( DOT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='.') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:26:11: ( 'août' | 'aout' ( DOT )? )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='a') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='o') ) {
					int LA10_2 = input.LA(3);
					if ( (LA10_2=='\u00FB') ) {
						alt10=1;
					}
					else if ( (LA10_2=='u') ) {
						alt10=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
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
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:26:13: 'août'
					{
					match("août"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:26:33: 'aout' ( DOT )?
					{
					match("aout"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:26:40: ( DOT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='.') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:27:11: ( 'septembre' | 'sept' DOT )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='s') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='e') ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2=='p') ) {
						int LA11_3 = input.LA(4);
						if ( (LA11_3=='t') ) {
							int LA11_4 = input.LA(5);
							if ( (LA11_4=='e') ) {
								alt11=1;
							}
							else if ( (LA11_4=='.') ) {
								alt11=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 4, input);
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
									new NoViableAltException("", 11, 3, input);
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
								new NoViableAltException("", 11, 2, input);
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
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:27:13: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:27:33: 'sept' DOT
					{
					match("sept"); 

					mDOT(); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:28:11: ( 'octobre' | 'oct' ( DOT )? )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='o') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='c') ) {
					int LA13_2 = input.LA(3);
					if ( (LA13_2=='t') ) {
						int LA13_3 = input.LA(4);
						if ( (LA13_3=='o') ) {
							alt13=1;
						}

						else {
							alt13=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 13, 2, input);
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
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:28:13: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:28:33: 'oct' ( DOT )?
					{
					match("oct"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:28:39: ( DOT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='.') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:29:11: ( 'novembre' | 'nov' ( DOT )? )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='n') ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1=='o') ) {
					int LA15_2 = input.LA(3);
					if ( (LA15_2=='v') ) {
						int LA15_3 = input.LA(4);
						if ( (LA15_3=='e') ) {
							alt15=1;
						}

						else {
							alt15=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 15, 2, input);
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
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:29:13: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:29:33: 'nov' ( DOT )?
					{
					match("nov"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:29:39: ( DOT )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='.') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:30:11: ( 'décembre' | 'déc' ( DOT )? )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='d') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='\u00E9') ) {
					int LA17_2 = input.LA(3);
					if ( (LA17_2=='c') ) {
						int LA17_3 = input.LA(4);
						if ( (LA17_3=='e') ) {
							alt17=1;
						}

						else {
							alt17=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 2, input);
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
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:30:13: 'décembre'
					{
					match("décembre"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:30:33: 'déc' ( DOT )?
					{
					match("déc"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:30:39: ( DOT )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='.') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:32:11: ( 'dimanche' ( 's' )? | 'dim' ( DOT )? )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='d') ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1=='i') ) {
					int LA20_2 = input.LA(3);
					if ( (LA20_2=='m') ) {
						int LA20_3 = input.LA(4);
						if ( (LA20_3=='a') ) {
							alt20=1;
						}

						else {
							alt20=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 2, input);
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
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:32:13: 'dimanche' ( 's' )?
					{
					match("dimanche"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:32:25: ( 's' )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0=='s') ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:32:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:32:33: 'dim' ( DOT )?
					{
					match("dim"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:32:39: ( DOT )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='.') ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:33:11: ( 'lundi' ( 's' )? | 'lun' ( DOT )? )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='l') ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1=='u') ) {
					int LA23_2 = input.LA(3);
					if ( (LA23_2=='n') ) {
						int LA23_3 = input.LA(4);
						if ( (LA23_3=='d') ) {
							alt23=1;
						}

						else {
							alt23=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 23, 2, input);
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
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:33:13: 'lundi' ( 's' )?
					{
					match("lundi"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:33:25: ( 's' )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0=='s') ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:33:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:33:33: 'lun' ( DOT )?
					{
					match("lun"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:33:39: ( DOT )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0=='.') ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:34:11: ( 'mardi' ( 's' )? | 'mar' ( DOT )? )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='m') ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1=='a') ) {
					int LA26_2 = input.LA(3);
					if ( (LA26_2=='r') ) {
						int LA26_3 = input.LA(4);
						if ( (LA26_3=='d') ) {
							alt26=1;
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:34:13: 'mardi' ( 's' )?
					{
					match("mardi"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:34:25: ( 's' )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='s') ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:34:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:34:33: 'mar' ( DOT )?
					{
					match("mar"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:34:39: ( DOT )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0=='.') ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:35:11: ( 'mercredi' ( 's' )? | 'mer' ( DOT )? )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='m') ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1=='e') ) {
					int LA29_2 = input.LA(3);
					if ( (LA29_2=='r') ) {
						int LA29_3 = input.LA(4);
						if ( (LA29_3=='c') ) {
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:35:13: 'mercredi' ( 's' )?
					{
					match("mercredi"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:35:25: ( 's' )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0=='s') ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:35:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:35:33: 'mer' ( DOT )?
					{
					match("mer"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:35:39: ( DOT )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0=='.') ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:36:11: ( 'jeudi' ( 's' )? | 'jeu' ( DOT )? )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='j') ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1=='e') ) {
					int LA32_2 = input.LA(3);
					if ( (LA32_2=='u') ) {
						int LA32_3 = input.LA(4);
						if ( (LA32_3=='d') ) {
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:36:13: 'jeudi' ( 's' )?
					{
					match("jeudi"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:36:25: ( 's' )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0=='s') ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:36:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:36:33: 'jeu' ( DOT )?
					{
					match("jeu"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:36:39: ( DOT )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0=='.') ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:37:11: ( 'vendredi' ( 's' )? | 'ven' ( DOT )? )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0=='v') ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1=='e') ) {
					int LA35_2 = input.LA(3);
					if ( (LA35_2=='n') ) {
						int LA35_3 = input.LA(4);
						if ( (LA35_3=='d') ) {
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:37:13: 'vendredi' ( 's' )?
					{
					match("vendredi"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:37:25: ( 's' )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0=='s') ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:37:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:37:33: 'ven' ( DOT )?
					{
					match("ven"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:37:39: ( DOT )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0=='.') ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:38:11: ( 'samedi' ( 's' )? | 'sam' ( DOT )? )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0=='s') ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1=='a') ) {
					int LA38_2 = input.LA(3);
					if ( (LA38_2=='m') ) {
						int LA38_3 = input.LA(4);
						if ( (LA38_3=='e') ) {
							alt38=1;
						}

						else {
							alt38=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 2, input);
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
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:38:13: 'samedi' ( 's' )?
					{
					match("samedi"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:38:25: ( 's' )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0=='s') ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:38:25: 's'
							{
							match('s'); 
							}
							break;

					}

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:38:33: 'sam' ( DOT )?
					{
					match("sam"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:38:39: ( DOT )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0=='.') ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
	// $ANTLR end "SATURDAY"

	// $ANTLR start "HOUR"
	public final void mHOUR() throws RecognitionException {
		try {
			int _type = HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:40:8: ( 'heure' | 'heures' | 'h' ( DOT )? )
			int alt40=3;
			int LA40_0 = input.LA(1);
			if ( (LA40_0=='h') ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1=='e') ) {
					int LA40_2 = input.LA(3);
					if ( (LA40_2=='u') ) {
						int LA40_4 = input.LA(4);
						if ( (LA40_4=='r') ) {
							int LA40_5 = input.LA(5);
							if ( (LA40_5=='e') ) {
								int LA40_6 = input.LA(6);
								if ( (LA40_6=='s') ) {
									alt40=2;
								}

								else {
									alt40=1;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 40, 5, input);
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
									new NoViableAltException("", 40, 4, input);
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
								new NoViableAltException("", 40, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					alt40=3;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:40:10: 'heure'
					{
					match("heure"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:40:21: 'heures'
					{
					match("heures"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:40:33: 'h' ( DOT )?
					{
					match('h'); 
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:40:37: ( DOT )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0=='.') ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:41:8: ( 'minute' | 'minutes' | 'min' ( DOT )? | 'm' ( DOT )? )
			int alt43=4;
			int LA43_0 = input.LA(1);
			if ( (LA43_0=='m') ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1=='i') ) {
					int LA43_2 = input.LA(3);
					if ( (LA43_2=='n') ) {
						int LA43_4 = input.LA(4);
						if ( (LA43_4=='u') ) {
							int LA43_5 = input.LA(5);
							if ( (LA43_5=='t') ) {
								int LA43_7 = input.LA(6);
								if ( (LA43_7=='e') ) {
									int LA43_8 = input.LA(7);
									if ( (LA43_8=='s') ) {
										alt43=2;
									}

									else {
										alt43=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 43, 7, input);
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
										new NoViableAltException("", 43, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							alt43=3;
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
					alt43=4;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:41:10: 'minute'
					{
					match("minute"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:41:21: 'minutes'
					{
					match("minutes"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:41:33: 'min' ( DOT )?
					{
					match("min"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:41:39: ( DOT )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0=='.') ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:41:46: 'm' ( DOT )?
					{
					match('m'); 
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:41:50: ( DOT )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0=='.') ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:42:8: ( 'jour' | 'jours' )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0=='j') ) {
				int LA44_1 = input.LA(2);
				if ( (LA44_1=='o') ) {
					int LA44_2 = input.LA(3);
					if ( (LA44_2=='u') ) {
						int LA44_3 = input.LA(4);
						if ( (LA44_3=='r') ) {
							int LA44_4 = input.LA(5);
							if ( (LA44_4=='s') ) {
								alt44=2;
							}

							else {
								alt44=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 44, 3, input);
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
								new NoViableAltException("", 44, 2, input);
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
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:42:10: 'jour'
					{
					match("jour"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:42:21: 'jours'
					{
					match("jours"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:43:8: ( 'semaine' | 'semaines' | 'sem' ( DOT )? )
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='s') ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1=='e') ) {
					int LA46_2 = input.LA(3);
					if ( (LA46_2=='m') ) {
						int LA46_3 = input.LA(4);
						if ( (LA46_3=='a') ) {
							int LA46_4 = input.LA(5);
							if ( (LA46_4=='i') ) {
								int LA46_6 = input.LA(6);
								if ( (LA46_6=='n') ) {
									int LA46_7 = input.LA(7);
									if ( (LA46_7=='e') ) {
										int LA46_8 = input.LA(8);
										if ( (LA46_8=='s') ) {
											alt46=2;
										}

										else {
											alt46=1;
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 46, 7, input);
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
											new NoViableAltException("", 46, 6, input);
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
										new NoViableAltException("", 46, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							alt46=3;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 2, input);
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
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:43:10: 'semaine'
					{
					match("semaine"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:43:21: 'semaines'
					{
					match("semaines"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:43:33: 'sem' ( DOT )?
					{
					match("sem"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:43:39: ( DOT )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0=='.') ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:44:8: ( 'mois' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:44:10: 'mois'
			{
			match("mois"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:45:8: ( 'année' | 'annee' | 'années' | 'annees' | 'an' | 'ans' )
			int alt47=6;
			int LA47_0 = input.LA(1);
			if ( (LA47_0=='a') ) {
				int LA47_1 = input.LA(2);
				if ( (LA47_1=='n') ) {
					switch ( input.LA(3) ) {
					case 'n':
						{
						int LA47_3 = input.LA(4);
						if ( (LA47_3=='\u00E9') ) {
							int LA47_6 = input.LA(5);
							if ( (LA47_6=='e') ) {
								int LA47_8 = input.LA(6);
								if ( (LA47_8=='s') ) {
									alt47=3;
								}

								else {
									alt47=1;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 47, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA47_3=='e') ) {
							int LA47_7 = input.LA(5);
							if ( (LA47_7=='e') ) {
								int LA47_9 = input.LA(6);
								if ( (LA47_9=='s') ) {
									alt47=4;
								}

								else {
									alt47=2;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 47, 7, input);
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
									new NoViableAltException("", 47, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 's':
						{
						alt47=6;
						}
						break;
					default:
						alt47=5;
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:45:10: 'année'
					{
					match("année"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:45:21: 'annee'
					{
					match("annee"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:45:31: 'années'
					{
					match("années"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:45:42: 'annees'
					{
					match("annees"); 

					}
					break;
				case 5 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:45:53: 'an'
					{
					match("an"); 

					}
					break;
				case 6 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:45:60: 'ans'
					{
					match("ans"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:47:11: ( 'aujourd' ( SINGLE_QUOTE )? 'hui' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:47:13: 'aujourd' ( SINGLE_QUOTE )? 'hui'
			{
			match("aujourd"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:47:23: ( SINGLE_QUOTE )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0=='\'') ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			match("hui"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:48:11: ( 'demain' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:48:13: 'demain'
			{
			match("demain"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:49:11: ( 'ce soir' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:49:13: 'ce soir'
			{
			match("ce soir"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:50:11: ( 'hier' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:50:13: 'hier'
			{
			match("hier"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:54:7: ( 'tous' | 'tous les' | 'toutes les' )
			int alt49=3;
			int LA49_0 = input.LA(1);
			if ( (LA49_0=='t') ) {
				int LA49_1 = input.LA(2);
				if ( (LA49_1=='o') ) {
					int LA49_2 = input.LA(3);
					if ( (LA49_2=='u') ) {
						int LA49_3 = input.LA(4);
						if ( (LA49_3=='s') ) {
							int LA49_4 = input.LA(5);
							if ( (LA49_4==' ') ) {
								alt49=2;
							}

							else {
								alt49=1;
							}

						}
						else if ( (LA49_3=='t') ) {
							alt49=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 49, 3, input);
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
								new NoViableAltException("", 49, 2, input);
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
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:54:9: 'tous'
					{
					match("tous"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:54:18: 'tous les'
					{
					match("tous les"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:54:31: 'toutes les'
					{
					match("toutes les"); 

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
	// $ANTLR end "EVERY"

	// $ANTLR start "UNTIL"
	public final void mUNTIL() throws RecognitionException {
		try {
			int _type = UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:55:7: ( 'jusqu' ( SINGLE_QUOTE )? 'à' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:55:9: 'jusqu' ( SINGLE_QUOTE )? 'à'
			{
			match("jusqu"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:55:17: ( SINGLE_QUOTE )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0=='\'') ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			match('\u00E0'); 
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:59:11: ( 'à' | '@' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
			{
			if ( input.LA(1)=='@'||input.LA(1)=='\u00E0' ) {
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
	// $ANTLR end "AT"

	// $ANTLR start "AFTER"
	public final void mAFTER() throws RecognitionException {
		try {
			int _type = AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:60:11: ( 'après' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:60:13: 'après'
			{
			match("après"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AFTER"

	// $ANTLR start "AM"
	public final void mAM() throws RecognitionException {
		try {
			int _type = AM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:62:4: ( 'am' | 'a.m' ( DOT )? | 'a_m' | 'a' )
			int alt52=4;
			int LA52_0 = input.LA(1);
			if ( (LA52_0=='a') ) {
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt52=1;
					}
					break;
				case '.':
					{
					alt52=2;
					}
					break;
				case '_':
					{
					alt52=3;
					}
					break;
				default:
					alt52=4;
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:62:6: 'am'
					{
					match("am"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:62:13: 'a.m' ( DOT )?
					{
					match("a.m"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:62:19: ( DOT )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0=='.') ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:62:26: 'a_m'
					{
					match("a_m"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:62:34: 'a'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:63:4: ( 'pm' | 'p.m' ( DOT )? | 'p_m' | 'p' )
			int alt54=4;
			int LA54_0 = input.LA(1);
			if ( (LA54_0=='p') ) {
				switch ( input.LA(2) ) {
				case 'm':
					{
					alt54=1;
					}
					break;
				case '.':
					{
					alt54=2;
					}
					break;
				case '_':
					{
					alt54=3;
					}
					break;
				default:
					alt54=4;
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:63:6: 'pm'
					{
					match("pm"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:63:13: 'p.m' ( DOT )?
					{
					match("p.m"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:63:19: ( DOT )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0=='.') ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:63:26: 'p_m'
					{
					match("p_m"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:63:34: 'p'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:64:4: ( 't' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:64:6: 't'
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

	// $ANTLR start "MIDNIGHT"
	public final void mMIDNIGHT() throws RecognitionException {
		try {
			int _type = MIDNIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:68:11: ( 'minuit' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:68:13: 'minuit'
			{
			match("minuit"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:69:11: ( 'midi' | 'après-midi' | 'apres-midi' )
			int alt55=3;
			int LA55_0 = input.LA(1);
			if ( (LA55_0=='m') ) {
				alt55=1;
			}
			else if ( (LA55_0=='a') ) {
				int LA55_2 = input.LA(2);
				if ( (LA55_2=='p') ) {
					int LA55_3 = input.LA(3);
					if ( (LA55_3=='r') ) {
						int LA55_4 = input.LA(4);
						if ( (LA55_4=='\u00E8') ) {
							alt55=2;
						}
						else if ( (LA55_4=='e') ) {
							alt55=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 55, 4, input);
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
								new NoViableAltException("", 55, 3, input);
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
							new NoViableAltException("", 55, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:69:13: 'midi'
					{
					match("midi"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:69:26: 'après-midi'
					{
					match("après-midi"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:69:41: 'apres-midi'
					{
					match("apres-midi"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:70:11: ( 'matin' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:70:13: 'matin'
			{
			match("matin"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:71:11: ( 'soir' | 'soirée' )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0=='s') ) {
				int LA56_1 = input.LA(2);
				if ( (LA56_1=='o') ) {
					int LA56_2 = input.LA(3);
					if ( (LA56_2=='i') ) {
						int LA56_3 = input.LA(4);
						if ( (LA56_3=='r') ) {
							int LA56_4 = input.LA(5);
							if ( (LA56_4=='\u00E9') ) {
								alt56=2;
							}

							else {
								alt56=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 56, 3, input);
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
								new NoViableAltException("", 56, 2, input);
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
							new NoViableAltException("", 56, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:71:13: 'soir'
					{
					match("soir"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:71:22: 'soirée'
					{
					match("soirée"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:72:11: ( 'nuit' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:72:13: 'nuit'
			{
			match("nuit"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NIGHT"

	// $ANTLR start "INT_00"
	public final void mINT_00() throws RecognitionException {
		try {
			int _type = INT_00;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:76:8: ( '00' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:76:10: '00'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:77:8: ( '01' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:77:10: '01'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:78:8: ( '02' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:78:10: '02'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:79:8: ( '03' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:79:10: '03'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:80:8: ( '04' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:80:10: '04'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:81:8: ( '05' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:81:10: '05'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:82:8: ( '06' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:82:10: '06'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:83:8: ( '07' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:83:10: '07'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:84:8: ( '08' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:84:10: '08'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:85:8: ( '09' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:85:10: '09'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:86:8: ( '0' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:86:10: '0'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:87:8: ( '1' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:87:10: '1'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:88:8: ( '2' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:88:10: '2'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:89:8: ( '3' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:89:10: '3'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:90:8: ( '4' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:90:10: '4'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:91:8: ( '5' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:91:10: '5'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:92:8: ( '6' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:92:10: '6'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:93:8: ( '7' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:93:10: '7'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:94:8: ( '8' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:94:10: '8'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:95:8: ( '9' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:95:10: '9'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:96:8: ( '10' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:96:10: '10'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:97:8: ( '11' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:97:10: '11'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:98:8: ( '12' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:98:10: '12'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:99:8: ( '13' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:99:10: '13'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:100:8: ( '14' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:100:10: '14'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:101:8: ( '15' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:101:10: '15'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:102:8: ( '16' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:102:10: '16'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:103:8: ( '17' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:103:10: '17'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:104:8: ( '18' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:104:10: '18'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:105:8: ( '19' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:105:10: '19'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:106:8: ( '20' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:106:10: '20'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:107:8: ( '21' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:107:10: '21'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:108:8: ( '22' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:108:10: '22'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:109:8: ( '23' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:109:10: '23'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:110:8: ( '24' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:110:10: '24'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:111:8: ( '25' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:111:10: '25'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:112:8: ( '26' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:112:10: '26'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:113:8: ( '27' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:113:10: '27'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:114:8: ( '28' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:114:10: '28'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:115:8: ( '29' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:115:10: '29'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:116:8: ( '30' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:116:10: '30'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:117:8: ( '31' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:117:10: '31'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:118:8: ( '32' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:118:10: '32'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:119:8: ( '33' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:119:10: '33'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:120:8: ( '34' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:120:10: '34'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:121:8: ( '35' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:121:10: '35'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:122:8: ( '36' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:122:10: '36'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:123:8: ( '37' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:123:10: '37'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:124:8: ( '38' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:124:10: '38'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:125:8: ( '39' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:125:10: '39'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:126:8: ( '40' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:126:10: '40'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:127:8: ( '41' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:127:10: '41'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:128:8: ( '42' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:128:10: '42'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:129:8: ( '43' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:129:10: '43'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:130:8: ( '44' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:130:10: '44'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:131:8: ( '45' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:131:10: '45'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:132:8: ( '46' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:132:10: '46'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:133:8: ( '47' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:133:10: '47'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:134:8: ( '48' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:134:10: '48'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:135:8: ( '49' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:135:10: '49'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:136:8: ( '50' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:136:10: '50'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:137:8: ( '51' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:137:10: '51'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:138:8: ( '52' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:138:10: '52'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:139:8: ( '53' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:139:10: '53'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:140:8: ( '54' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:140:10: '54'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:141:8: ( '55' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:141:10: '55'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:142:8: ( '56' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:142:10: '56'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:143:8: ( '57' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:143:10: '57'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:144:8: ( '58' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:144:10: '58'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:145:8: ( '59' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:145:10: '59'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:146:8: ( '60' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:146:10: '60'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:147:8: ( '61' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:147:10: '61'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:148:8: ( '62' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:148:10: '62'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:149:8: ( '63' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:149:10: '63'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:150:8: ( '64' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:150:10: '64'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:151:8: ( '65' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:151:10: '65'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:152:8: ( '66' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:152:10: '66'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:153:8: ( '67' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:153:10: '67'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:154:8: ( '68' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:154:10: '68'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:155:8: ( '69' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:155:10: '69'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:156:8: ( '70' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:156:10: '70'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:157:8: ( '71' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:157:10: '71'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:158:8: ( '72' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:158:10: '72'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:159:8: ( '73' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:159:10: '73'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:160:8: ( '74' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:160:10: '74'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:161:8: ( '75' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:161:10: '75'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:162:8: ( '76' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:162:10: '76'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:163:8: ( '77' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:163:10: '77'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:164:8: ( '78' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:164:10: '78'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:165:8: ( '79' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:165:10: '79'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:166:8: ( '80' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:166:10: '80'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:167:8: ( '81' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:167:10: '81'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:168:8: ( '82' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:168:10: '82'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:169:8: ( '83' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:169:10: '83'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:170:8: ( '84' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:170:10: '84'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:171:8: ( '85' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:171:10: '85'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:172:8: ( '86' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:172:10: '86'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:173:8: ( '87' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:173:10: '87'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:174:8: ( '88' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:174:10: '88'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:175:8: ( '89' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:175:10: '89'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:176:8: ( '90' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:176:10: '90'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:177:8: ( '91' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:177:10: '91'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:178:8: ( '92' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:178:10: '92'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:179:8: ( '93' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:179:10: '93'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:180:8: ( '94' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:180:10: '94'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:181:8: ( '95' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:181:10: '95'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:182:8: ( '96' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:182:10: '96'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:183:8: ( '97' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:183:10: '97'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:184:8: ( '98' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:184:10: '98'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:185:8: ( '99' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:185:10: '99'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:187:11: ( 'un' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:187:13: 'un'
			{
			match("un"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:188:11: ( 'deux' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:188:13: 'deux'
			{
			match("deux"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:189:11: ( 'trois' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:189:13: 'trois'
			{
			match("trois"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:190:11: ( 'quatre' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:190:13: 'quatre'
			{
			match("quatre"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:191:11: ( 'cinq' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:191:13: 'cinq'
			{
			match("cinq"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:192:11: ( 'six' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:192:13: 'six'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:193:11: ( 'sept' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:193:13: 'sept'
			{
			match("sept"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:194:11: ( 'huit' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:194:13: 'huit'
			{
			match("huit"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:195:11: ( 'neuf' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:195:13: 'neuf'
			{
			match("neuf"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:196:11: ( 'dix' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:196:13: 'dix'
			{
			match("dix"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:197:11: ( 'onze' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:197:13: 'onze'
			{
			match("onze"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:198:11: ( 'douze' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:198:13: 'douze'
			{
			match("douze"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:199:11: ( 'treize' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:199:13: 'treize'
			{
			match("treize"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:200:11: ( 'quatorze' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:200:13: 'quatorze'
			{
			match("quatorze"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:201:11: ( 'quinze' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:201:13: 'quinze'
			{
			match("quinze"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:202:11: ( 'seize' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:202:13: 'seize'
			{
			match("seize"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:203:11: ( 'dix-sept' | 'dix sept' )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0=='d') ) {
				int LA57_1 = input.LA(2);
				if ( (LA57_1=='i') ) {
					int LA57_2 = input.LA(3);
					if ( (LA57_2=='x') ) {
						int LA57_3 = input.LA(4);
						if ( (LA57_3=='-') ) {
							alt57=1;
						}
						else if ( (LA57_3==' ') ) {
							alt57=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 57, 3, input);
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:203:13: 'dix-sept'
					{
					match("dix-sept"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:203:26: 'dix sept'
					{
					match("dix sept"); 

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
	// $ANTLR end "SEVENTEEN"

	// $ANTLR start "EIGHTEEN"
	public final void mEIGHTEEN() throws RecognitionException {
		try {
			int _type = EIGHTEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:204:11: ( 'dix-huit' | 'dix huit' )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0=='d') ) {
				int LA58_1 = input.LA(2);
				if ( (LA58_1=='i') ) {
					int LA58_2 = input.LA(3);
					if ( (LA58_2=='x') ) {
						int LA58_3 = input.LA(4);
						if ( (LA58_3=='-') ) {
							alt58=1;
						}
						else if ( (LA58_3==' ') ) {
							alt58=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 58, 3, input);
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
								new NoViableAltException("", 58, 2, input);
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
							new NoViableAltException("", 58, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:204:13: 'dix-huit'
					{
					match("dix-huit"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:204:26: 'dix huit'
					{
					match("dix huit"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:205:11: ( 'dix-neuf' | 'dix neuf' )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0=='d') ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1=='i') ) {
					int LA59_2 = input.LA(3);
					if ( (LA59_2=='x') ) {
						int LA59_3 = input.LA(4);
						if ( (LA59_3=='-') ) {
							alt59=1;
						}
						else if ( (LA59_3==' ') ) {
							alt59=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 59, 3, input);
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
								new NoViableAltException("", 59, 2, input);
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
							new NoViableAltException("", 59, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:205:13: 'dix-neuf'
					{
					match("dix-neuf"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:205:26: 'dix neuf'
					{
					match("dix neuf"); 

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
	// $ANTLR end "NINETEEN"

	// $ANTLR start "TWENTY"
	public final void mTWENTY() throws RecognitionException {
		try {
			int _type = TWENTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:206:11: ( 'vingt' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:206:13: 'vingt'
			{
			match("vingt"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWENTY"

	// $ANTLR start "TWENTYONE"
	public final void mTWENTYONE() throws RecognitionException {
		try {
			int _type = TWENTYONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:207:11: ( 'vingt et un' | 'vingt-et-un' )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0=='v') ) {
				int LA60_1 = input.LA(2);
				if ( (LA60_1=='i') ) {
					int LA60_2 = input.LA(3);
					if ( (LA60_2=='n') ) {
						int LA60_3 = input.LA(4);
						if ( (LA60_3=='g') ) {
							int LA60_4 = input.LA(5);
							if ( (LA60_4=='t') ) {
								int LA60_5 = input.LA(6);
								if ( (LA60_5==' ') ) {
									alt60=1;
								}
								else if ( (LA60_5=='-') ) {
									alt60=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 60, 5, input);
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
										new NoViableAltException("", 60, 4, input);
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
									new NoViableAltException("", 60, 3, input);
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
								new NoViableAltException("", 60, 2, input);
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
							new NoViableAltException("", 60, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:207:13: 'vingt et un'
					{
					match("vingt et un"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:207:29: 'vingt-et-un'
					{
					match("vingt-et-un"); 

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
	// $ANTLR end "TWENTYONE"

	// $ANTLR start "THIRTY"
	public final void mTHIRTY() throws RecognitionException {
		try {
			int _type = THIRTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:208:11: ( 'trente' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:208:13: 'trente'
			{
			match("trente"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIRTY"

	// $ANTLR start "THIRTYONE"
	public final void mTHIRTYONE() throws RecognitionException {
		try {
			int _type = THIRTYONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:209:11: ( 'trente et un' | 'trente-et-un' )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0=='t') ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1=='r') ) {
					int LA61_2 = input.LA(3);
					if ( (LA61_2=='e') ) {
						int LA61_3 = input.LA(4);
						if ( (LA61_3=='n') ) {
							int LA61_4 = input.LA(5);
							if ( (LA61_4=='t') ) {
								int LA61_5 = input.LA(6);
								if ( (LA61_5=='e') ) {
									int LA61_6 = input.LA(7);
									if ( (LA61_6==' ') ) {
										alt61=1;
									}
									else if ( (LA61_6=='-') ) {
										alt61=2;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 61, 6, input);
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
											new NoViableAltException("", 61, 5, input);
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
										new NoViableAltException("", 61, 4, input);
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
									new NoViableAltException("", 61, 3, input);
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:209:13: 'trente et un'
					{
					match("trente et un"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:209:30: 'trente-et-un'
					{
					match("trente-et-un"); 

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
	// $ANTLR end "THIRTYONE"

	// $ANTLR start "FIRST"
	public final void mFIRST() throws RecognitionException {
		try {
			int _type = FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:211:16: ( 'premier' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:211:18: 'premier'
			{
			match("premier"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:212:16: ( 'deuxième' | 'deuxieme' | 'second' )
			int alt62=3;
			int LA62_0 = input.LA(1);
			if ( (LA62_0=='d') ) {
				int LA62_1 = input.LA(2);
				if ( (LA62_1=='e') ) {
					int LA62_3 = input.LA(3);
					if ( (LA62_3=='u') ) {
						int LA62_4 = input.LA(4);
						if ( (LA62_4=='x') ) {
							int LA62_5 = input.LA(5);
							if ( (LA62_5=='i') ) {
								int LA62_6 = input.LA(6);
								if ( (LA62_6=='\u00E8') ) {
									alt62=1;
								}
								else if ( (LA62_6=='e') ) {
									alt62=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 62, 6, input);
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
										new NoViableAltException("", 62, 5, input);
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
									new NoViableAltException("", 62, 4, input);
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
								new NoViableAltException("", 62, 3, input);
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
							new NoViableAltException("", 62, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA62_0=='s') ) {
				alt62=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:212:18: 'deuxième'
					{
					match("deuxième"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:212:31: 'deuxieme'
					{
					match("deuxieme"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:212:44: 'second'
					{
					match("second"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:213:16: ( 'troisième' | 'troisieme' )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0=='t') ) {
				int LA63_1 = input.LA(2);
				if ( (LA63_1=='r') ) {
					int LA63_2 = input.LA(3);
					if ( (LA63_2=='o') ) {
						int LA63_3 = input.LA(4);
						if ( (LA63_3=='i') ) {
							int LA63_4 = input.LA(5);
							if ( (LA63_4=='s') ) {
								int LA63_5 = input.LA(6);
								if ( (LA63_5=='i') ) {
									int LA63_6 = input.LA(7);
									if ( (LA63_6=='\u00E8') ) {
										alt63=1;
									}
									else if ( (LA63_6=='e') ) {
										alt63=2;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 63, 6, input);
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
											new NoViableAltException("", 63, 5, input);
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
										new NoViableAltException("", 63, 4, input);
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
									new NoViableAltException("", 63, 3, input);
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
								new NoViableAltException("", 63, 2, input);
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
							new NoViableAltException("", 63, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:213:18: 'troisième'
					{
					match("troisième"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:213:32: 'troisieme'
					{
					match("troisieme"); 

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
	// $ANTLR end "THIRD"

	// $ANTLR start "FOURTH"
	public final void mFOURTH() throws RecognitionException {
		try {
			int _type = FOURTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:214:16: ( 'quatrième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:214:18: 'quatrième'
			{
			match("quatrième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:215:16: ( 'cinquième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:215:18: 'cinquième'
			{
			match("cinquième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:216:16: ( 'sixième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:216:18: 'sixième'
			{
			match("sixième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:217:16: ( 'septième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:217:18: 'septième'
			{
			match("septième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:218:16: ( 'huitième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:218:18: 'huitième'
			{
			match("huitième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:219:16: ( 'neuvième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:219:18: 'neuvième'
			{
			match("neuvième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:220:16: ( 'dixième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:220:18: 'dixième'
			{
			match("dixième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:221:16: ( 'onzième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:221:18: 'onzième'
			{
			match("onzième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:222:16: ( 'douzième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:222:18: 'douzième'
			{
			match("douzième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:223:16: ( 'treizième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:223:18: 'treizième'
			{
			match("treizième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:224:16: ( 'quatorzième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:224:18: 'quatorzième'
			{
			match("quatorzième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:225:16: ( 'quinzième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:225:18: 'quinzième'
			{
			match("quinzième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:226:16: ( 'seizième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:226:18: 'seizième'
			{
			match("seizième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:227:16: ( 'dix-septième' | 'dix septième' )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0=='d') ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1=='i') ) {
					int LA64_2 = input.LA(3);
					if ( (LA64_2=='x') ) {
						int LA64_3 = input.LA(4);
						if ( (LA64_3=='-') ) {
							alt64=1;
						}
						else if ( (LA64_3==' ') ) {
							alt64=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 64, 3, input);
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
								new NoViableAltException("", 64, 2, input);
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
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:227:18: 'dix-septième'
					{
					match("dix-septième"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:227:35: 'dix septième'
					{
					match("dix septième"); 

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
	// $ANTLR end "SEVENTEENTH"

	// $ANTLR start "EIGHTEENTH"
	public final void mEIGHTEENTH() throws RecognitionException {
		try {
			int _type = EIGHTEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:228:16: ( 'dix-huitième' | 'dix huitième' )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0=='d') ) {
				int LA65_1 = input.LA(2);
				if ( (LA65_1=='i') ) {
					int LA65_2 = input.LA(3);
					if ( (LA65_2=='x') ) {
						int LA65_3 = input.LA(4);
						if ( (LA65_3=='-') ) {
							alt65=1;
						}
						else if ( (LA65_3==' ') ) {
							alt65=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 65, 2, input);
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:228:18: 'dix-huitième'
					{
					match("dix-huitième"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:228:35: 'dix huitième'
					{
					match("dix huitième"); 

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
	// $ANTLR end "EIGHTEENTH"

	// $ANTLR start "NINETEENTH"
	public final void mNINETEENTH() throws RecognitionException {
		try {
			int _type = NINETEENTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:229:16: ( 'dix-neuvième' | 'dix neuvième' )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0=='d') ) {
				int LA66_1 = input.LA(2);
				if ( (LA66_1=='i') ) {
					int LA66_2 = input.LA(3);
					if ( (LA66_2=='x') ) {
						int LA66_3 = input.LA(4);
						if ( (LA66_3=='-') ) {
							alt66=1;
						}
						else if ( (LA66_3==' ') ) {
							alt66=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 66, 3, input);
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
								new NoViableAltException("", 66, 2, input);
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
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:229:18: 'dix-neuvième'
					{
					match("dix-neuvième"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:229:35: 'dix neuvième'
					{
					match("dix neuvième"); 

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
	// $ANTLR end "NINETEENTH"

	// $ANTLR start "TWENTIETH"
	public final void mTWENTIETH() throws RecognitionException {
		try {
			int _type = TWENTIETH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:230:16: ( 'vingtième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:230:18: 'vingtième'
			{
			match("vingtième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:231:16: ( 'trentième' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:231:18: 'trentième'
			{
			match("trentième"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:234:4: ( 'er' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:234:6: 'er'
			{
			match("er"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ST"

	// $ANTLR start "RD"
	public final void mRD() throws RecognitionException {
		try {
			int _type = RD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:235:4: ( 'nd' | 'è' | 'ème' | 'eme' )
			int alt67=4;
			switch ( input.LA(1) ) {
			case 'n':
				{
				alt67=1;
				}
				break;
			case '\u00E8':
				{
				int LA67_2 = input.LA(2);
				if ( (LA67_2=='m') ) {
					alt67=3;
				}

				else {
					alt67=2;
				}

				}
				break;
			case 'e':
				{
				alt67=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:235:6: 'nd'
					{
					match("nd"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:235:13: 'è'
					{
					match('\u00E8'); 
					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:235:19: 'ème'
					{
					match("ème"); 

					}
					break;
				case 4 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:235:27: 'eme'
					{
					match("eme"); 

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
	// $ANTLR end "RD"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:239:7: ( ':' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:239:9: ':'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:240:7: ( ',' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:240:9: ','
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:241:7: ( '-' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:241:9: '-'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:242:7: ( '/' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:242:9: '/'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:243:7: ( '.' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:243:9: '.'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:244:7: ( '+' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:244:9: '+'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:245:14: ( '\\'' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:245:16: '\\''
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:247:11: ( 'courant' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:247:13: 'courant'
			{
			match("courant"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:248:11: ( 'pour' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:248:13: 'pour'
			{
			match("pour"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:249:11: ( 'dans' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:249:13: 'dans'
			{
			match("dans"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:250:11: ( 'un' | 'une' )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0=='u') ) {
				int LA68_1 = input.LA(2);
				if ( (LA68_1=='n') ) {
					int LA68_2 = input.LA(3);
					if ( (LA68_2=='e') ) {
						alt68=2;
					}

					else {
						alt68=1;
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:250:13: 'un'
					{
					match("un"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:250:20: 'une'
					{
					match("une"); 

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
	// $ANTLR end "AN"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:252:11: ( 'ou' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:252:13: 'ou'
			{
			match("ou"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:253:11: ( 'et' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:253:13: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:255:11: ( 'le' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:255:13: 'le'
			{
			match("le"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:256:11: ( 'de' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:256:13: 'de'
			{
			match("de"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:257:11: ( 'ce' | 'cette' )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0=='c') ) {
				int LA69_1 = input.LA(2);
				if ( (LA69_1=='e') ) {
					int LA69_2 = input.LA(3);
					if ( (LA69_2=='t') ) {
						alt69=2;
					}

					else {
						alt69=1;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 69, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:257:13: 'ce'
					{
					match("ce"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:257:20: 'cette'
					{
					match("cette"); 

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
	// $ANTLR end "THIS"

	// $ANTLR start "LAST"
	public final void mLAST() throws RecognitionException {
		try {
			int _type = LAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:258:11: ( 'dernier' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:258:13: 'dernier'
			{
			match("dernier"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:259:11: ( 'prochain' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:259:13: 'prochain'
			{
			match("prochain"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:260:11: ( 'suivant' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:260:13: 'suivant'
			{
			match("suivant"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:261:11: ( 'qui vient' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:261:13: 'qui vient'
			{
			match("qui vient"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:262:11: ( 'from' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:262:13: 'from'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:263:11: ( 'now' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:263:13: 'now'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:264:11: ( 'il y a' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:264:13: 'il y a'
			{
			match("il y a"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:265:11: ( 'avant' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:265:13: 'avant'
			{
			match("avant"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:266:11: ( 'à partir de' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:266:13: 'à partir de'
			{
			match("à partir de"); 

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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:267:11: ( 'depuis' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:267:13: 'depuis'
			{
			match("depuis"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "START"

	// $ANTLR start "WHITE_SPACE"
	public final void mWHITE_SPACE() throws RecognitionException {
		try {
			int _type = WHITE_SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:270:3: ( ( DOT | SPACE )+ )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:270:5: ( DOT | SPACE )+
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:270:5: ( DOT | SPACE )+
			int cnt70=0;
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( ((LA70_0 >= '\t' && LA70_0 <= '\n')||LA70_0=='\r'||LA70_0==' '||LA70_0=='.'||LA70_0=='\u00A0') ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
					if ( cnt70 >= 1 ) break loop70;
					EarlyExitException eee = new EarlyExitException(70, input);
					throw eee;
				}
				cnt70++;
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:275:14: ( 'fool' | 'fools' | 'fool' SINGLE_QUOTE 's' )
			int alt71=3;
			int LA71_0 = input.LA(1);
			if ( (LA71_0=='f') ) {
				int LA71_1 = input.LA(2);
				if ( (LA71_1=='o') ) {
					int LA71_2 = input.LA(3);
					if ( (LA71_2=='o') ) {
						int LA71_3 = input.LA(4);
						if ( (LA71_3=='l') ) {
							switch ( input.LA(5) ) {
							case 's':
								{
								alt71=2;
								}
								break;
							case '\'':
								{
								alt71=3;
								}
								break;
							default:
								alt71=1;
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 71, 3, input);
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:275:16: 'fool'
					{
					match("fool"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:275:25: 'fools'
					{
					match("fools"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:275:35: 'fool' SINGLE_QUOTE 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:276:14: ( 'black' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:276:16: 'black'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:277:14: ( ( 'christmas' | 'xmas' | 'x-mas' ) ( 'es' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:277:16: ( 'christmas' | 'xmas' | 'x-mas' ) ( 'es' )?
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:277:16: ( 'christmas' | 'xmas' | 'x-mas' )
			int alt72=3;
			int LA72_0 = input.LA(1);
			if ( (LA72_0=='c') ) {
				alt72=1;
			}
			else if ( (LA72_0=='x') ) {
				int LA72_2 = input.LA(2);
				if ( (LA72_2=='m') ) {
					alt72=2;
				}
				else if ( (LA72_2=='-') ) {
					alt72=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 2, input);
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:277:17: 'christmas'
					{
					match("christmas"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:277:31: 'xmas'
					{
					match("xmas"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:277:40: 'x-mas'
					{
					match("x-mas"); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:277:49: ( 'es' )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0=='e') ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:277:49: 'es'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:278:14: ( 'columbus' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:278:16: 'columbus'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:279:14: ( 'earth' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:279:16: 'earth'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:280:14: ( 'easter' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:280:16: 'easter'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:281:14: ( 'father' | 'fathers' | 'father' SINGLE_QUOTE 's' )
			int alt74=3;
			int LA74_0 = input.LA(1);
			if ( (LA74_0=='f') ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1=='a') ) {
					int LA74_2 = input.LA(3);
					if ( (LA74_2=='t') ) {
						int LA74_3 = input.LA(4);
						if ( (LA74_3=='h') ) {
							int LA74_4 = input.LA(5);
							if ( (LA74_4=='e') ) {
								int LA74_5 = input.LA(6);
								if ( (LA74_5=='r') ) {
									switch ( input.LA(7) ) {
									case 's':
										{
										alt74=2;
										}
										break;
									case '\'':
										{
										alt74=3;
										}
										break;
									default:
										alt74=1;
									}
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 74, 5, input);
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 74, 3, input);
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:281:16: 'father'
					{
					match("father"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:281:27: 'fathers'
					{
					match("fathers"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:281:39: 'father' SINGLE_QUOTE 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:282:14: ( 'flag' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:282:16: 'flag'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:283:14: ( 'good' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:283:16: 'good'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:284:14: ( GROUND ( WHITE_SPACE )? HOG ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:284:16: GROUND ( WHITE_SPACE )? HOG ( SINGLE_QUOTE )? ( 's' )?
			{
			mGROUND(); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:284:23: ( WHITE_SPACE )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( ((LA75_0 >= '\t' && LA75_0 <= '\n')||LA75_0=='\r'||LA75_0==' '||LA75_0=='.'||LA75_0=='\u00A0') ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:284:23: WHITE_SPACE
					{
					mWHITE_SPACE(); 

					}
					break;

			}

			mHOG(); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:284:40: ( SINGLE_QUOTE )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0=='\'') ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:284:54: ( 's' )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0=='s') ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:284:54: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:285:14: ( ( 'halloween' | 'haloween' ) ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:285:16: ( 'halloween' | 'haloween' ) ( 's' )?
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:285:16: ( 'halloween' | 'haloween' )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0=='h') ) {
				int LA78_1 = input.LA(2);
				if ( (LA78_1=='a') ) {
					int LA78_2 = input.LA(3);
					if ( (LA78_2=='l') ) {
						int LA78_3 = input.LA(4);
						if ( (LA78_3=='l') ) {
							alt78=1;
						}
						else if ( (LA78_3=='o') ) {
							alt78=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 78, 3, input);
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:285:17: 'halloween'
					{
					match("halloween"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:285:31: 'haloween'
					{
					match("haloween"); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:285:43: ( 's' )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0=='s') ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:285:43: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:286:14: ( 'inauguration' | 'inaugaration' )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0=='i') ) {
				int LA80_1 = input.LA(2);
				if ( (LA80_1=='n') ) {
					int LA80_2 = input.LA(3);
					if ( (LA80_2=='a') ) {
						int LA80_3 = input.LA(4);
						if ( (LA80_3=='u') ) {
							int LA80_4 = input.LA(5);
							if ( (LA80_4=='g') ) {
								int LA80_5 = input.LA(6);
								if ( (LA80_5=='u') ) {
									alt80=1;
								}
								else if ( (LA80_5=='a') ) {
									alt80=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 80, 5, input);
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
										new NoViableAltException("", 80, 4, input);
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
									new NoViableAltException("", 80, 3, input);
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
								new NoViableAltException("", 80, 2, input);
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
							new NoViableAltException("", 80, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:286:16: 'inauguration'
					{
					match("inauguration"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:286:33: 'inaugaration'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:287:14: ( 'independence' | 'independance' )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0=='i') ) {
				int LA81_1 = input.LA(2);
				if ( (LA81_1=='n') ) {
					int LA81_2 = input.LA(3);
					if ( (LA81_2=='d') ) {
						int LA81_3 = input.LA(4);
						if ( (LA81_3=='e') ) {
							int LA81_4 = input.LA(5);
							if ( (LA81_4=='p') ) {
								int LA81_5 = input.LA(6);
								if ( (LA81_5=='e') ) {
									int LA81_6 = input.LA(7);
									if ( (LA81_6=='n') ) {
										int LA81_7 = input.LA(8);
										if ( (LA81_7=='d') ) {
											int LA81_8 = input.LA(9);
											if ( (LA81_8=='e') ) {
												alt81=1;
											}
											else if ( (LA81_8=='a') ) {
												alt81=2;
											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 81, 8, input);
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
													new NoViableAltException("", 81, 7, input);
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
												new NoViableAltException("", 81, 6, input);
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
											new NoViableAltException("", 81, 5, input);
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
										new NoViableAltException("", 81, 4, input);
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
									new NoViableAltException("", 81, 3, input);
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
								new NoViableAltException("", 81, 2, input);
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
							new NoViableAltException("", 81, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:287:16: 'independence'
					{
					match("independence"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:287:33: 'independance'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:288:14: ( ( 'kwanza' ( 'a' )? ) ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:288:16: ( 'kwanza' ( 'a' )? ) ( 's' )?
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:288:16: ( 'kwanza' ( 'a' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:288:17: 'kwanza' ( 'a' )?
			{
			match("kwanza"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:288:26: ( 'a' )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0=='a') ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:288:26: 'a'
					{
					match('a'); 
					}
					break;

			}

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:288:32: ( 's' )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0=='s') ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:288:32: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:289:14: ( 'labor' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:289:16: 'labor'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:290:14: ( 'mlk' | 'martin' WHITE_SPACE 'luther' WHITE_SPACE 'king' ( COMMA SPACE 'jr' DOT )? )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0=='m') ) {
				int LA85_1 = input.LA(2);
				if ( (LA85_1=='l') ) {
					alt85=1;
				}
				else if ( (LA85_1=='a') ) {
					alt85=2;
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:290:16: 'mlk'
					{
					match("mlk"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:290:24: 'martin' WHITE_SPACE 'luther' WHITE_SPACE 'king' ( COMMA SPACE 'jr' DOT )?
					{
					match("martin"); 

					mWHITE_SPACE(); 

					match("luther"); 

					mWHITE_SPACE(); 

					match("king"); 

					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:290:73: ( COMMA SPACE 'jr' DOT )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==',') ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:290:74: COMMA SPACE 'jr' DOT
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:291:14: ( 'memorial' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:291:16: 'memorial'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:292:14: ( 'mother' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:292:16: 'mother' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("mother"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:292:25: ( SINGLE_QUOTE )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0=='\'') ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:292:39: ( 's' )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0=='s') ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:292:39: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:293:14: ( 'new' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:293:16: 'new'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:294:14: ( 'palm' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:294:16: 'palm'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:295:14: ( 'patriot' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:295:16: 'patriot' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("patriot"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:295:26: ( SINGLE_QUOTE )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0=='\'') ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:295:40: ( 's' )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0=='s') ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:295:40: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:296:14: ( 'president' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:296:16: 'president' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("president"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:296:28: ( SINGLE_QUOTE )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0=='\'') ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:296:42: ( 's' )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0=='s') ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:296:42: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:14: ( ( 'patrick' | 'patty' | 'paddy' ) ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:16: ( 'patrick' | 'patty' | 'paddy' ) ( SINGLE_QUOTE )? ( 's' )?
			{
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:16: ( 'patrick' | 'patty' | 'paddy' )
			int alt92=3;
			int LA92_0 = input.LA(1);
			if ( (LA92_0=='p') ) {
				int LA92_1 = input.LA(2);
				if ( (LA92_1=='a') ) {
					int LA92_2 = input.LA(3);
					if ( (LA92_2=='t') ) {
						int LA92_3 = input.LA(4);
						if ( (LA92_3=='r') ) {
							alt92=1;
						}
						else if ( (LA92_3=='t') ) {
							alt92=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 92, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA92_2=='d') ) {
						alt92=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 92, 2, input);
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
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:17: 'patrick'
					{
					match("patrick"); 

					}
					break;
				case 2 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:29: 'patty'
					{
					match("patty"); 

					}
					break;
				case 3 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:39: 'paddy'
					{
					match("paddy"); 

					}
					break;

			}

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:48: ( SINGLE_QUOTE )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0=='\'') ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:62: ( 's' )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0=='s') ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:297:62: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:298:14: ( 'saint' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:298:16: 'saint'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:299:14: ( 'tax' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:299:16: 'tax'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:300:14: ( 'thanksgiving' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:300:16: 'thanksgiving' ( 's' )?
			{
			match("thanksgiving"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:300:31: ( 's' )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0=='s') ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:300:31: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:301:14: ( 'election' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:301:16: 'election'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:302:14: ( 'valentine' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:302:16: 'valentine' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("valentine"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:302:28: ( SINGLE_QUOTE )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0=='\'') ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:302:42: ( 's' )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0=='s') ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:302:42: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:303:14: ( 'veteran' ( SINGLE_QUOTE )? ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:303:16: 'veteran' ( SINGLE_QUOTE )? ( 's' )?
			{
			match("veteran"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:303:26: ( SINGLE_QUOTE )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0=='\'') ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:303:40: ( 's' )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0=='s') ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:303:40: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:304:17: ( 'ground' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:304:19: 'ground'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:305:17: ( 'hog' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:305:19: 'hog'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:309:8: ( 'hiver' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:309:10: 'hiver' ( 's' )?
			{
			match("hiver"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:309:18: ( 's' )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0=='s') ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:309:18: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:310:8: ( 'automne' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:310:10: 'automne' ( 's' )?
			{
			match("automne"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:310:22: ( 's' )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0=='s') ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:310:22: 's'
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

	// $ANTLR start "SPRING"
	public final void mSPRING() throws RecognitionException {
		try {
			int _type = SPRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:311:8: ( 'printemps' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:311:10: 'printemps' ( 's' )?
			{
			match("printemps"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:311:22: ( 's' )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0=='s') ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:311:22: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:312:8: ( 'été' ( 's' )? )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:312:10: 'été' ( 's' )?
			{
			match("été"); 

			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:312:16: ( 's' )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0=='s') ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:312:16: 's'
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:315:3: ( UNKNOWN_CHAR )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:319:3: (~ ( SPACE | DOT ) )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:322:16: ( '0' .. '9' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:324:16: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u00A0' )
			// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:
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
		// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:8: ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | MINUTE | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | TONIGHT | YESTERDAY | EVERY | UNTIL | AT | AFTER | AM | PM | T | MIDNIGHT | NOON | MORNING | EVENING | NIGHT | INT_00 | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_0 | INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | TWENTYONE | THIRTY | THIRTYONE | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | THIRTIETH | ST | RD | COLON | COMMA | DASH | SLASH | DOT | PLUS | SINGLE_QUOTE | CURRENT | FOR | IN | AN | OR | AND | ON | OF | THIS | LAST | NEXT | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | BEGINNING | START | WHITE_SPACE | FOOL | BLACK | CHRISTMAS | COLUMBUS | EARTH | EASTER | FATHER | FLAG | GOOD | GROUNDHOG | HALLOWEEN | INAUGURATION | INDEPENDENCE | KWANZAA | LABOR | MLK | MEMORIAL | MOTHER | NEW | PALM | PATRIOT | PRESIDENT | PATRICK | SAINT | TAX | THANKSGIVING | ELECTION | VALENTINE | VETERAN | WINTER | FALL | SPRING | SUMMER | UNKNOWN )
		int alt104=258;
		alt104 = dfa104.predict(input);
		switch (alt104) {
			case 1 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:10: JANUARY
				{
				mJANUARY(); 

				}
				break;
			case 2 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:18: FEBRUARY
				{
				mFEBRUARY(); 

				}
				break;
			case 3 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:27: MARCH
				{
				mMARCH(); 

				}
				break;
			case 4 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:33: APRIL
				{
				mAPRIL(); 

				}
				break;
			case 5 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:39: MAY
				{
				mMAY(); 

				}
				break;
			case 6 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:43: JUNE
				{
				mJUNE(); 

				}
				break;
			case 7 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:48: JULY
				{
				mJULY(); 

				}
				break;
			case 8 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:53: AUGUST
				{
				mAUGUST(); 

				}
				break;
			case 9 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:60: SEPTEMBER
				{
				mSEPTEMBER(); 

				}
				break;
			case 10 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:70: OCTOBER
				{
				mOCTOBER(); 

				}
				break;
			case 11 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:78: NOVEMBER
				{
				mNOVEMBER(); 

				}
				break;
			case 12 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:87: DECEMBER
				{
				mDECEMBER(); 

				}
				break;
			case 13 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:96: SUNDAY
				{
				mSUNDAY(); 

				}
				break;
			case 14 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:103: MONDAY
				{
				mMONDAY(); 

				}
				break;
			case 15 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:110: TUESDAY
				{
				mTUESDAY(); 

				}
				break;
			case 16 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:118: WEDNESDAY
				{
				mWEDNESDAY(); 

				}
				break;
			case 17 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:128: THURSDAY
				{
				mTHURSDAY(); 

				}
				break;
			case 18 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:137: FRIDAY
				{
				mFRIDAY(); 

				}
				break;
			case 19 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:144: SATURDAY
				{
				mSATURDAY(); 

				}
				break;
			case 20 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:153: HOUR
				{
				mHOUR(); 

				}
				break;
			case 21 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:158: MINUTE
				{
				mMINUTE(); 

				}
				break;
			case 22 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:165: DAY
				{
				mDAY(); 

				}
				break;
			case 23 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:169: WEEK
				{
				mWEEK(); 

				}
				break;
			case 24 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:174: MONTH
				{
				mMONTH(); 

				}
				break;
			case 25 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:180: YEAR
				{
				mYEAR(); 

				}
				break;
			case 26 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:185: TODAY
				{
				mTODAY(); 

				}
				break;
			case 27 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:191: TOMORROW
				{
				mTOMORROW(); 

				}
				break;
			case 28 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:200: TONIGHT
				{
				mTONIGHT(); 

				}
				break;
			case 29 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:208: YESTERDAY
				{
				mYESTERDAY(); 

				}
				break;
			case 30 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:218: EVERY
				{
				mEVERY(); 

				}
				break;
			case 31 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:224: UNTIL
				{
				mUNTIL(); 

				}
				break;
			case 32 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:230: AT
				{
				mAT(); 

				}
				break;
			case 33 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:233: AFTER
				{
				mAFTER(); 

				}
				break;
			case 34 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:239: AM
				{
				mAM(); 

				}
				break;
			case 35 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:242: PM
				{
				mPM(); 

				}
				break;
			case 36 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:245: T
				{
				mT(); 

				}
				break;
			case 37 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:247: MIDNIGHT
				{
				mMIDNIGHT(); 

				}
				break;
			case 38 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:256: NOON
				{
				mNOON(); 

				}
				break;
			case 39 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:261: MORNING
				{
				mMORNING(); 

				}
				break;
			case 40 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:269: EVENING
				{
				mEVENING(); 

				}
				break;
			case 41 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:277: NIGHT
				{
				mNIGHT(); 

				}
				break;
			case 42 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:283: INT_00
				{
				mINT_00(); 

				}
				break;
			case 43 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:290: INT_01
				{
				mINT_01(); 

				}
				break;
			case 44 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:297: INT_02
				{
				mINT_02(); 

				}
				break;
			case 45 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:304: INT_03
				{
				mINT_03(); 

				}
				break;
			case 46 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:311: INT_04
				{
				mINT_04(); 

				}
				break;
			case 47 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:318: INT_05
				{
				mINT_05(); 

				}
				break;
			case 48 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:325: INT_06
				{
				mINT_06(); 

				}
				break;
			case 49 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:332: INT_07
				{
				mINT_07(); 

				}
				break;
			case 50 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:339: INT_08
				{
				mINT_08(); 

				}
				break;
			case 51 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:346: INT_09
				{
				mINT_09(); 

				}
				break;
			case 52 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:353: INT_0
				{
				mINT_0(); 

				}
				break;
			case 53 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:359: INT_1
				{
				mINT_1(); 

				}
				break;
			case 54 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:365: INT_2
				{
				mINT_2(); 

				}
				break;
			case 55 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:371: INT_3
				{
				mINT_3(); 

				}
				break;
			case 56 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:377: INT_4
				{
				mINT_4(); 

				}
				break;
			case 57 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:383: INT_5
				{
				mINT_5(); 

				}
				break;
			case 58 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:389: INT_6
				{
				mINT_6(); 

				}
				break;
			case 59 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:395: INT_7
				{
				mINT_7(); 

				}
				break;
			case 60 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:401: INT_8
				{
				mINT_8(); 

				}
				break;
			case 61 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:407: INT_9
				{
				mINT_9(); 

				}
				break;
			case 62 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:413: INT_10
				{
				mINT_10(); 

				}
				break;
			case 63 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:420: INT_11
				{
				mINT_11(); 

				}
				break;
			case 64 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:427: INT_12
				{
				mINT_12(); 

				}
				break;
			case 65 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:434: INT_13
				{
				mINT_13(); 

				}
				break;
			case 66 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:441: INT_14
				{
				mINT_14(); 

				}
				break;
			case 67 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:448: INT_15
				{
				mINT_15(); 

				}
				break;
			case 68 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:455: INT_16
				{
				mINT_16(); 

				}
				break;
			case 69 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:462: INT_17
				{
				mINT_17(); 

				}
				break;
			case 70 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:469: INT_18
				{
				mINT_18(); 

				}
				break;
			case 71 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:476: INT_19
				{
				mINT_19(); 

				}
				break;
			case 72 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:483: INT_20
				{
				mINT_20(); 

				}
				break;
			case 73 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:490: INT_21
				{
				mINT_21(); 

				}
				break;
			case 74 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:497: INT_22
				{
				mINT_22(); 

				}
				break;
			case 75 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:504: INT_23
				{
				mINT_23(); 

				}
				break;
			case 76 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:511: INT_24
				{
				mINT_24(); 

				}
				break;
			case 77 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:518: INT_25
				{
				mINT_25(); 

				}
				break;
			case 78 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:525: INT_26
				{
				mINT_26(); 

				}
				break;
			case 79 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:532: INT_27
				{
				mINT_27(); 

				}
				break;
			case 80 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:539: INT_28
				{
				mINT_28(); 

				}
				break;
			case 81 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:546: INT_29
				{
				mINT_29(); 

				}
				break;
			case 82 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:553: INT_30
				{
				mINT_30(); 

				}
				break;
			case 83 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:560: INT_31
				{
				mINT_31(); 

				}
				break;
			case 84 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:567: INT_32
				{
				mINT_32(); 

				}
				break;
			case 85 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:574: INT_33
				{
				mINT_33(); 

				}
				break;
			case 86 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:581: INT_34
				{
				mINT_34(); 

				}
				break;
			case 87 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:588: INT_35
				{
				mINT_35(); 

				}
				break;
			case 88 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:595: INT_36
				{
				mINT_36(); 

				}
				break;
			case 89 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:602: INT_37
				{
				mINT_37(); 

				}
				break;
			case 90 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:609: INT_38
				{
				mINT_38(); 

				}
				break;
			case 91 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:616: INT_39
				{
				mINT_39(); 

				}
				break;
			case 92 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:623: INT_40
				{
				mINT_40(); 

				}
				break;
			case 93 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:630: INT_41
				{
				mINT_41(); 

				}
				break;
			case 94 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:637: INT_42
				{
				mINT_42(); 

				}
				break;
			case 95 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:644: INT_43
				{
				mINT_43(); 

				}
				break;
			case 96 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:651: INT_44
				{
				mINT_44(); 

				}
				break;
			case 97 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:658: INT_45
				{
				mINT_45(); 

				}
				break;
			case 98 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:665: INT_46
				{
				mINT_46(); 

				}
				break;
			case 99 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:672: INT_47
				{
				mINT_47(); 

				}
				break;
			case 100 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:679: INT_48
				{
				mINT_48(); 

				}
				break;
			case 101 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:686: INT_49
				{
				mINT_49(); 

				}
				break;
			case 102 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:693: INT_50
				{
				mINT_50(); 

				}
				break;
			case 103 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:700: INT_51
				{
				mINT_51(); 

				}
				break;
			case 104 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:707: INT_52
				{
				mINT_52(); 

				}
				break;
			case 105 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:714: INT_53
				{
				mINT_53(); 

				}
				break;
			case 106 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:721: INT_54
				{
				mINT_54(); 

				}
				break;
			case 107 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:728: INT_55
				{
				mINT_55(); 

				}
				break;
			case 108 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:735: INT_56
				{
				mINT_56(); 

				}
				break;
			case 109 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:742: INT_57
				{
				mINT_57(); 

				}
				break;
			case 110 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:749: INT_58
				{
				mINT_58(); 

				}
				break;
			case 111 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:756: INT_59
				{
				mINT_59(); 

				}
				break;
			case 112 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:763: INT_60
				{
				mINT_60(); 

				}
				break;
			case 113 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:770: INT_61
				{
				mINT_61(); 

				}
				break;
			case 114 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:777: INT_62
				{
				mINT_62(); 

				}
				break;
			case 115 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:784: INT_63
				{
				mINT_63(); 

				}
				break;
			case 116 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:791: INT_64
				{
				mINT_64(); 

				}
				break;
			case 117 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:798: INT_65
				{
				mINT_65(); 

				}
				break;
			case 118 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:805: INT_66
				{
				mINT_66(); 

				}
				break;
			case 119 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:812: INT_67
				{
				mINT_67(); 

				}
				break;
			case 120 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:819: INT_68
				{
				mINT_68(); 

				}
				break;
			case 121 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:826: INT_69
				{
				mINT_69(); 

				}
				break;
			case 122 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:833: INT_70
				{
				mINT_70(); 

				}
				break;
			case 123 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:840: INT_71
				{
				mINT_71(); 

				}
				break;
			case 124 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:847: INT_72
				{
				mINT_72(); 

				}
				break;
			case 125 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:854: INT_73
				{
				mINT_73(); 

				}
				break;
			case 126 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:861: INT_74
				{
				mINT_74(); 

				}
				break;
			case 127 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:868: INT_75
				{
				mINT_75(); 

				}
				break;
			case 128 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:875: INT_76
				{
				mINT_76(); 

				}
				break;
			case 129 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:882: INT_77
				{
				mINT_77(); 

				}
				break;
			case 130 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:889: INT_78
				{
				mINT_78(); 

				}
				break;
			case 131 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:896: INT_79
				{
				mINT_79(); 

				}
				break;
			case 132 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:903: INT_80
				{
				mINT_80(); 

				}
				break;
			case 133 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:910: INT_81
				{
				mINT_81(); 

				}
				break;
			case 134 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:917: INT_82
				{
				mINT_82(); 

				}
				break;
			case 135 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:924: INT_83
				{
				mINT_83(); 

				}
				break;
			case 136 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:931: INT_84
				{
				mINT_84(); 

				}
				break;
			case 137 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:938: INT_85
				{
				mINT_85(); 

				}
				break;
			case 138 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:945: INT_86
				{
				mINT_86(); 

				}
				break;
			case 139 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:952: INT_87
				{
				mINT_87(); 

				}
				break;
			case 140 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:959: INT_88
				{
				mINT_88(); 

				}
				break;
			case 141 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:966: INT_89
				{
				mINT_89(); 

				}
				break;
			case 142 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:973: INT_90
				{
				mINT_90(); 

				}
				break;
			case 143 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:980: INT_91
				{
				mINT_91(); 

				}
				break;
			case 144 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:987: INT_92
				{
				mINT_92(); 

				}
				break;
			case 145 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:994: INT_93
				{
				mINT_93(); 

				}
				break;
			case 146 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1001: INT_94
				{
				mINT_94(); 

				}
				break;
			case 147 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1008: INT_95
				{
				mINT_95(); 

				}
				break;
			case 148 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1015: INT_96
				{
				mINT_96(); 

				}
				break;
			case 149 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1022: INT_97
				{
				mINT_97(); 

				}
				break;
			case 150 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1029: INT_98
				{
				mINT_98(); 

				}
				break;
			case 151 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1036: INT_99
				{
				mINT_99(); 

				}
				break;
			case 152 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1043: ONE
				{
				mONE(); 

				}
				break;
			case 153 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1047: TWO
				{
				mTWO(); 

				}
				break;
			case 154 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1051: THREE
				{
				mTHREE(); 

				}
				break;
			case 155 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1057: FOUR
				{
				mFOUR(); 

				}
				break;
			case 156 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1062: FIVE
				{
				mFIVE(); 

				}
				break;
			case 157 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1067: SIX
				{
				mSIX(); 

				}
				break;
			case 158 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1071: SEVEN
				{
				mSEVEN(); 

				}
				break;
			case 159 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1077: EIGHT
				{
				mEIGHT(); 

				}
				break;
			case 160 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1083: NINE
				{
				mNINE(); 

				}
				break;
			case 161 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1088: TEN
				{
				mTEN(); 

				}
				break;
			case 162 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1092: ELEVEN
				{
				mELEVEN(); 

				}
				break;
			case 163 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1099: TWELVE
				{
				mTWELVE(); 

				}
				break;
			case 164 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1106: THIRTEEN
				{
				mTHIRTEEN(); 

				}
				break;
			case 165 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1115: FOURTEEN
				{
				mFOURTEEN(); 

				}
				break;
			case 166 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1124: FIFTEEN
				{
				mFIFTEEN(); 

				}
				break;
			case 167 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1132: SIXTEEN
				{
				mSIXTEEN(); 

				}
				break;
			case 168 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1140: SEVENTEEN
				{
				mSEVENTEEN(); 

				}
				break;
			case 169 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1150: EIGHTEEN
				{
				mEIGHTEEN(); 

				}
				break;
			case 170 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1159: NINETEEN
				{
				mNINETEEN(); 

				}
				break;
			case 171 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1168: TWENTY
				{
				mTWENTY(); 

				}
				break;
			case 172 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1175: TWENTYONE
				{
				mTWENTYONE(); 

				}
				break;
			case 173 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1185: THIRTY
				{
				mTHIRTY(); 

				}
				break;
			case 174 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1192: THIRTYONE
				{
				mTHIRTYONE(); 

				}
				break;
			case 175 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1202: FIRST
				{
				mFIRST(); 

				}
				break;
			case 176 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1208: SECOND
				{
				mSECOND(); 

				}
				break;
			case 177 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1215: THIRD
				{
				mTHIRD(); 

				}
				break;
			case 178 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1221: FOURTH
				{
				mFOURTH(); 

				}
				break;
			case 179 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1228: FIFTH
				{
				mFIFTH(); 

				}
				break;
			case 180 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1234: SIXTH
				{
				mSIXTH(); 

				}
				break;
			case 181 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1240: SEVENTH
				{
				mSEVENTH(); 

				}
				break;
			case 182 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1248: EIGHTH
				{
				mEIGHTH(); 

				}
				break;
			case 183 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1255: NINTH
				{
				mNINTH(); 

				}
				break;
			case 184 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1261: TENTH
				{
				mTENTH(); 

				}
				break;
			case 185 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1267: ELEVENTH
				{
				mELEVENTH(); 

				}
				break;
			case 186 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1276: TWELFTH
				{
				mTWELFTH(); 

				}
				break;
			case 187 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1284: THIRTEENTH
				{
				mTHIRTEENTH(); 

				}
				break;
			case 188 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1295: FOURTEENTH
				{
				mFOURTEENTH(); 

				}
				break;
			case 189 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1306: FIFTEENTH
				{
				mFIFTEENTH(); 

				}
				break;
			case 190 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1316: SIXTEENTH
				{
				mSIXTEENTH(); 

				}
				break;
			case 191 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1326: SEVENTEENTH
				{
				mSEVENTEENTH(); 

				}
				break;
			case 192 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1338: EIGHTEENTH
				{
				mEIGHTEENTH(); 

				}
				break;
			case 193 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1349: NINETEENTH
				{
				mNINETEENTH(); 

				}
				break;
			case 194 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1360: TWENTIETH
				{
				mTWENTIETH(); 

				}
				break;
			case 195 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1370: THIRTIETH
				{
				mTHIRTIETH(); 

				}
				break;
			case 196 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1380: ST
				{
				mST(); 

				}
				break;
			case 197 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1383: RD
				{
				mRD(); 

				}
				break;
			case 198 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1386: COLON
				{
				mCOLON(); 

				}
				break;
			case 199 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1392: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 200 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1398: DASH
				{
				mDASH(); 

				}
				break;
			case 201 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1403: SLASH
				{
				mSLASH(); 

				}
				break;
			case 202 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1409: DOT
				{
				mDOT(); 

				}
				break;
			case 203 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1413: PLUS
				{
				mPLUS(); 

				}
				break;
			case 204 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1418: SINGLE_QUOTE
				{
				mSINGLE_QUOTE(); 

				}
				break;
			case 205 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1431: CURRENT
				{
				mCURRENT(); 

				}
				break;
			case 206 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1439: FOR
				{
				mFOR(); 

				}
				break;
			case 207 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1443: IN
				{
				mIN(); 

				}
				break;
			case 208 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1446: AN
				{
				mAN(); 

				}
				break;
			case 209 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1449: OR
				{
				mOR(); 

				}
				break;
			case 210 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1452: AND
				{
				mAND(); 

				}
				break;
			case 211 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1456: ON
				{
				mON(); 

				}
				break;
			case 212 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1459: OF
				{
				mOF(); 

				}
				break;
			case 213 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1462: THIS
				{
				mTHIS(); 

				}
				break;
			case 214 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1467: LAST
				{
				mLAST(); 

				}
				break;
			case 215 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1472: NEXT
				{
				mNEXT(); 

				}
				break;
			case 216 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1477: COMING
				{
				mCOMING(); 

				}
				break;
			case 217 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1484: UPCOMING
				{
				mUPCOMING(); 

				}
				break;
			case 218 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1493: FROM
				{
				mFROM(); 

				}
				break;
			case 219 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1498: NOW
				{
				mNOW(); 

				}
				break;
			case 220 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1502: AGO
				{
				mAGO(); 

				}
				break;
			case 221 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1506: BEFORE
				{
				mBEFORE(); 

				}
				break;
			case 222 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1513: BEGINNING
				{
				mBEGINNING(); 

				}
				break;
			case 223 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1523: START
				{
				mSTART(); 

				}
				break;
			case 224 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1529: WHITE_SPACE
				{
				mWHITE_SPACE(); 

				}
				break;
			case 225 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1541: FOOL
				{
				mFOOL(); 

				}
				break;
			case 226 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1546: BLACK
				{
				mBLACK(); 

				}
				break;
			case 227 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1552: CHRISTMAS
				{
				mCHRISTMAS(); 

				}
				break;
			case 228 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1562: COLUMBUS
				{
				mCOLUMBUS(); 

				}
				break;
			case 229 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1571: EARTH
				{
				mEARTH(); 

				}
				break;
			case 230 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1577: EASTER
				{
				mEASTER(); 

				}
				break;
			case 231 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1584: FATHER
				{
				mFATHER(); 

				}
				break;
			case 232 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1591: FLAG
				{
				mFLAG(); 

				}
				break;
			case 233 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1596: GOOD
				{
				mGOOD(); 

				}
				break;
			case 234 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1601: GROUNDHOG
				{
				mGROUNDHOG(); 

				}
				break;
			case 235 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1611: HALLOWEEN
				{
				mHALLOWEEN(); 

				}
				break;
			case 236 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1621: INAUGURATION
				{
				mINAUGURATION(); 

				}
				break;
			case 237 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1634: INDEPENDENCE
				{
				mINDEPENDENCE(); 

				}
				break;
			case 238 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1647: KWANZAA
				{
				mKWANZAA(); 

				}
				break;
			case 239 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1655: LABOR
				{
				mLABOR(); 

				}
				break;
			case 240 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1661: MLK
				{
				mMLK(); 

				}
				break;
			case 241 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1665: MEMORIAL
				{
				mMEMORIAL(); 

				}
				break;
			case 242 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1674: MOTHER
				{
				mMOTHER(); 

				}
				break;
			case 243 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1681: NEW
				{
				mNEW(); 

				}
				break;
			case 244 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1685: PALM
				{
				mPALM(); 

				}
				break;
			case 245 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1690: PATRIOT
				{
				mPATRIOT(); 

				}
				break;
			case 246 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1698: PRESIDENT
				{
				mPRESIDENT(); 

				}
				break;
			case 247 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1708: PATRICK
				{
				mPATRICK(); 

				}
				break;
			case 248 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1716: SAINT
				{
				mSAINT(); 

				}
				break;
			case 249 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1722: TAX
				{
				mTAX(); 

				}
				break;
			case 250 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1726: THANKSGIVING
				{
				mTHANKSGIVING(); 

				}
				break;
			case 251 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1739: ELECTION
				{
				mELECTION(); 

				}
				break;
			case 252 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1748: VALENTINE
				{
				mVALENTINE(); 

				}
				break;
			case 253 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1758: VETERAN
				{
				mVETERAN(); 

				}
				break;
			case 254 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1766: WINTER
				{
				mWINTER(); 

				}
				break;
			case 255 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1773: FALL
				{
				mFALL(); 

				}
				break;
			case 256 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1778: SPRING
				{
				mSPRING(); 

				}
				break;
			case 257 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1785: SUMMER
				{
				mSUMMER(); 

				}
				break;
			case 258 :
				// org\\openhab\\ui\\habot\\nlp\\internal\\natty\\generated\\fr\\DateLexerFR.g:1:1792: UNKNOWN
				{
				mUNKNOWN(); 

				}
				break;

		}
	}


	protected DFA104 dfa104 = new DFA104(this);
	static final String DFA104_eotS =
		"\1\uffff\2\55\1\74\1\102\6\55\1\132\1\55\1\146\1\150\1\151\1\167\1\u0082"+
		"\1\u008d\1\u0098\1\u00a3\1\u00ae\1\u00b9\1\u00c4\1\u00cf\1\u00da\3\55"+
		"\5\uffff\1\u00e5\2\uffff\1\55\2\uffff\5\55\44\uffff\1\u0111\14\uffff\1"+
		"\u011a\174\uffff\1\u0127\25\uffff\1\u0131\4\uffff\1\74\16\uffff\1\u0137"+
		"\6\uffff\1\u013f\47\uffff\1\u0152\13\uffff\1\u015b\2\uffff\1\u0160\1\u0162"+
		"\12\uffff\1\u016a\16\uffff\1\u0173\4\uffff\1\u0175\24\uffff\1\u0187\20"+
		"\uffff\1\u0192\1\u0194\2\uffff\1\u0192\1\u0194\6\uffff";
	static final String DFA104_eofS =
		"\u0195\uffff";
	static final String DFA104_minS =
		"\1\0\3\141\1\156\1\141\1\143\1\144\4\141\1\145\1\141\1\40\1\141\12\60"+
		"\1\156\1\165\1\141\5\uffff\1\11\2\uffff\1\154\2\uffff\1\154\1\55\1\157"+
		"\1\167\1\164\2\uffff\1\151\7\uffff\1\151\1\155\1\144\1\151\2\uffff\1\141"+
		"\2\uffff\1\152\1\162\1\uffff\1\143\1\151\1\uffff\1\170\2\uffff\1\172\1"+
		"\uffff\1\166\1\uffff\1\165\2\uffff\2\155\1\165\4\uffff\2\156\2\uffff\1"+
		"\145\1\151\1\uffff\1\40\1\156\1\154\2\uffff\1\145\6\uffff\1\145\1\uffff"+
		"\1\144\156\uffff\1\145\1\141\2\uffff\1\162\11\uffff\1\141\5\uffff\1\154"+
		"\1\uffff\1\163\4\uffff\1\165\7\uffff\1\145\1\164\1\uffff\1\172\3\uffff"+
		"\1\151\1\145\2\uffff\1\146\2\uffff\1\40\1\uffff\1\170\3\uffff\1\172\2"+
		"\uffff\1\147\2\uffff\1\164\2\uffff\1\161\2\uffff\2\151\1\155\3\uffff\1"+
		"\162\3\uffff\1\164\1\40\10\uffff\1\151\1\163\1\56\1\145\6\uffff\2\150"+
		"\2\uffff\1\151\1\145\1\164\1\151\1\165\1\163\1\172\1\164\2\uffff\1\151"+
		"\1\157\1\172\2\uffff\1\55\5\uffff\1\145\1\165\2\145\1\165\1\145\3\uffff"+
		"\1\40\4\uffff\1\151\2\145\1\143\1\145\1\162\1\145\1\uffff\1\160\1\151"+
		"\1\165\1\160\1\151\1\165\7\uffff\1\40\4\uffff\1\172\2\uffff\2\164\1\146"+
		"\2\164\1\146\2\uffff\1\145\2\151\2\uffff\2\151\6\uffff";
	static final String DFA104_maxS =
		"\1\uffff\1\165\1\u00e9\1\157\1\166\3\165\1\u00e9\1\165\1\151\1\165\1\157"+
		"\1\162\1\40\1\162\12\71\1\156\1\165\1\164\5\uffff\1\u00a0\2\uffff\1\156"+
		"\2\uffff\1\154\1\155\1\162\1\167\1\164\2\uffff\1\163\7\uffff\1\164\1\162"+
		"\1\156\1\164\2\uffff\1\162\2\uffff\1\164\1\162\1\uffff\1\160\1\155\1\uffff"+
		"\1\170\2\uffff\1\172\1\uffff\1\167\1\uffff\1\167\2\uffff\1\170\2\165\4"+
		"\uffff\1\164\1\156\2\uffff\1\166\1\151\1\uffff\1\40\1\156\1\165\2\uffff"+
		"\1\157\6\uffff\1\157\1\uffff\1\164\156\uffff\1\145\1\151\2\uffff\1\163"+
		"\11\uffff\1\144\5\uffff\1\156\1\uffff\1\164\4\uffff\1\165\7\uffff\1\u00e8"+
		"\1\164\1\uffff\1\172\3\uffff\2\151\2\uffff\1\166\2\uffff\1\151\1\uffff"+
		"\1\170\3\uffff\1\172\2\uffff\1\147\2\uffff\1\164\2\uffff\1\161\2\uffff"+
		"\1\151\1\156\1\163\3\uffff\1\164\3\uffff\1\164\1\156\10\uffff\1\164\1"+
		"\163\2\151\6\uffff\2\163\2\uffff\2\151\1\164\1\151\1\165\1\163\1\172\1"+
		"\164\2\uffff\1\151\1\162\1\172\2\uffff\1\55\5\uffff\1\145\1\165\2\145"+
		"\1\165\1\145\3\uffff\1\151\4\uffff\3\151\1\157\1\151\1\162\1\151\1\uffff"+
		"\1\160\1\151\1\165\1\160\1\151\1\165\7\uffff\1\55\4\uffff\1\172\2\uffff"+
		"\2\164\1\166\2\164\1\166\2\uffff\3\151\2\uffff\2\151\6\uffff";
	static final String DFA104_acceptS =
		"\35\uffff\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\uffff\1\u00cb\1\u00cc"+
		"\1\uffff\1\40\1\u00e0\5\uffff\1\u0102\1\1\1\uffff\1\21\1\26\1\2\1\u00da"+
		"\1\u00e1\1\u00e7\1\u00e8\4\uffff\1\u00f0\1\25\1\uffff\1\10\1\31\2\uffff"+
		"\1\42\2\uffff\1\50\1\uffff\1\u00d8\1\12\1\uffff\1\u00d1\1\uffff\1\51\1"+
		"\uffff\1\u00c5\1\14\3\uffff\1\u00cf\1\16\1\u00d3\1\u00ef\2\uffff\1\u00fc"+
		"\1\24\2\uffff\1\u00eb\3\uffff\1\u00e3\1\36\1\uffff\1\u00f9\1\u00fa\1\44"+
		"\1\u00de\1\40\1\43\1\uffff\1\u00ce\1\uffff\1\52\1\53\1\54\1\55\1\56\1"+
		"\57\1\60\1\61\1\62\1\63\1\64\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1"+
		"\105\1\106\1\107\1\65\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
		"\1\120\1\121\1\66\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132"+
		"\1\133\1\67\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145"+
		"\1\70\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1\71"+
		"\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\72\1\172"+
		"\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\73\1"+
		"\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
		"\1\u008d\1\74\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
		"\1\u0095\1\u0096\1\u0097\1\75\2\uffff\1\u00c4\1\u00d2\1\uffff\1\u00fb"+
		"\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00dc\1\uffff"+
		"\1\u00e2\1\u00e9\1\u00ea\1\u00ee\1\u0101\1\uffff\1\37\1\uffff\1\5\1\47"+
		"\1\20\1\u00f1\1\uffff\1\46\1\30\1\u00f2\1\4\1\u00dd\1\32\1\u00ff\2\uffff"+
		"\1\27\1\uffff\1\u00b0\1\23\1\u00f8\2\uffff\1\13\1\u00db\1\uffff\1\u00f3"+
		"\1\15\1\uffff\1\33\1\uffff\1\u00d6\1\u00df\1\u00d4\1\uffff\1\22\1\u00fd"+
		"\1\uffff\1\35\1\u00fe\1\uffff\1\34\1\u00d5\1\uffff\1\u00cd\1\u00e4\3\uffff"+
		"\1\u00d7\1\u0100\1\u00f4\1\uffff\1\u00f7\1\u00d0\1\u0098\2\uffff\1\u00e5"+
		"\1\u00e6\1\u00ec\1\u00ed\1\6\1\7\1\3\1\17\4\uffff\1\u00b4\1\u009d\1\u00a2"+
		"\1\u00b9\1\u00a0\1\u00b7\2\uffff\1\u00b8\1\u00a1\10\uffff\1\u00af\1\u00f6"+
		"\3\uffff\1\u00d9\1\45\1\uffff\1\11\1\u00b5\1\u009e\1\u00a7\1\u00be\6\uffff"+
		"\1\u0099\1\u00a3\1\u00ba\1\uffff\1\u00b6\1\u009f\1\u00b3\1\u009c\7\uffff"+
		"\1\41\6\uffff\1\u00ac\1\u00c2\1\u00ab\1\u00b1\1\u009a\1\u00a4\1\u00bb"+
		"\1\uffff\1\u00c3\1\u00f5\1\u009b\1\u00b2\1\uffff\1\u00a6\1\u00bd\6\uffff"+
		"\1\u00ae\1\u00ad\3\uffff\1\u00aa\1\u00c1\2\uffff\1\u00a5\1\u00bc\1\u00bf"+
		"\1\u00a8\1\u00c0\1\u00a9";
	static final String DFA104_specialS =
		"\1\0\u0194\uffff}>";
	static final String[] DFA104_transitionS = {
			"\11\55\2\47\2\55\1\47\22\55\1\47\6\55\1\44\3\55\1\43\1\37\1\40\1\42\1"+
			"\41\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\36\5\55\1\46"+
			"\40\55\1\4\1\50\1\14\1\10\1\34\1\2\1\52\1\13\1\45\1\1\1\53\1\11\1\3\1"+
			"\7\1\6\1\17\1\33\1\55\1\5\1\15\1\32\1\12\1\55\1\51\47\55\1\47\77\55\1"+
			"\16\7\55\1\35\1\54\uff16\55",
			"\1\56\3\uffff\1\60\11\uffff\1\61\5\uffff\1\57",
			"\1\65\3\uffff\1\62\6\uffff\1\66\2\uffff\1\64\2\uffff\1\63\166\uffff"+
			"\1\62",
			"\1\67\3\uffff\1\70\3\uffff\1\71\2\uffff\1\73\2\uffff\1\72",
			"\1\77\1\76\1\101\4\uffff\1\100\1\75",
			"\1\104\3\uffff\1\103\3\uffff\1\106\5\uffff\1\105\5\uffff\1\107",
			"\1\110\12\uffff\1\111\6\uffff\1\112",
			"\1\116\1\115\11\uffff\1\113\5\uffff\1\114",
			"\1\123\3\uffff\1\121\3\uffff\1\120\5\uffff\1\122\171\uffff\1\117",
			"\1\126\3\uffff\1\125\17\uffff\1\124",
			"\1\131\3\uffff\1\127\3\uffff\1\130",
			"\1\135\7\uffff\1\133\13\uffff\1\134",
			"\1\136\2\uffff\1\141\1\137\5\uffff\1\140",
			"\1\144\6\uffff\1\145\6\uffff\1\142\2\uffff\1\143",
			"\1\147",
			"\1\154\15\uffff\1\153\2\uffff\1\152",
			"\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166",
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
			"\1\u00db",
			"\1\u00dc",
			"\1\u00df\12\uffff\1\u00e0\1\116\4\uffff\1\u00dd\1\uffff\1\u00de",
			"",
			"",
			"",
			"",
			"",
			"\2\47\2\uffff\1\47\22\uffff\1\47\15\uffff\1\47\161\uffff\1\47",
			"",
			"",
			"\1\u00e8\1\uffff\1\u00e9",
			"",
			"",
			"\1\u00ea",
			"\1\141\77\uffff\1\141",
			"\1\u00eb\2\uffff\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"",
			"",
			"\1\u00ef\11\uffff\1\u00f0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f2\10\uffff\1\u00f1\1\uffff\1\u00f3",
			"\1\u00f5\4\uffff\1\u00f4",
			"\1\u00f7\11\uffff\1\u00f6",
			"\1\u00f8\12\uffff\1\u00f9",
			"",
			"",
			"\1\u00fb\20\uffff\1\u00fa",
			"",
			"",
			"\1\u00fc\11\uffff\1\u00fd",
			"\1\u00fe",
			"",
			"\1\u0102\5\uffff\1\u0101\3\uffff\1\u0100\2\uffff\1\u00ff",
			"\1\u0104\3\uffff\1\u0103",
			"",
			"\1\u0105",
			"",
			"",
			"\1\u0106",
			"",
			"\1\u0107\1\u0108",
			"",
			"\1\u0109\1\uffff\1\u010a",
			"",
			"",
			"\1\u010b\12\uffff\1\u010c",
			"\1\u010d\2\uffff\1\u0110\1\uffff\1\u010f\2\uffff\1\u010e",
			"\1\u0112",
			"",
			"",
			"",
			"",
			"\1\u0113\5\uffff\1\u0114",
			"\1\u0115",
			"",
			"",
			"\1\u0116\20\uffff\1\u0117",
			"\1\u0118",
			"",
			"\1\u0119",
			"\1\u011b",
			"\1\u011d\10\uffff\1\u011c",
			"",
			"",
			"\1\u011f\11\uffff\1\u011e",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0120\3\uffff\1\u0122\5\uffff\1\u0121",
			"",
			"\1\u0125\7\uffff\1\u0123\7\uffff\1\u0124",
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
			"\1\u0126",
			"\1\u0128\7\uffff\1\u0129",
			"",
			"",
			"\1\u012a\1\u012b",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u012c\2\uffff\1\u012d",
			"",
			"",
			"",
			"",
			"",
			"\1\u012f\1\uffff\1\u012e",
			"",
			"\1\u0130\1\73",
			"",
			"",
			"",
			"",
			"\1\u0132",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f7\u0082\uffff\1\u0133",
			"\1\u0134",
			"",
			"\1\u0135",
			"",
			"",
			"",
			"\1\u0136",
			"\1\u0138\3\uffff\1\u0139",
			"",
			"",
			"\1\u013a\17\uffff\1\u013b",
			"",
			"",
			"\1\u013d\14\uffff\1\u013c\73\uffff\1\u013e",
			"",
			"\1\u0140",
			"",
			"",
			"",
			"\1\u0141",
			"",
			"",
			"\1\u0142",
			"",
			"",
			"\1\u0143",
			"",
			"",
			"\1\u0144",
			"",
			"",
			"\1\u0145",
			"\1\u0146\4\uffff\1\u0147",
			"\1\u0148\5\uffff\1\u0149",
			"",
			"",
			"",
			"\1\u014a\1\uffff\1\u0125",
			"",
			"",
			"",
			"\1\u014b",
			"\1\u014d\115\uffff\1\u014c",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u014e\12\uffff\1\74",
			"\1\u014f",
			"\1\u0150\66\uffff\1\u0150\3\uffff\1\u0151",
			"\1\u0153\3\uffff\1\u0154",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0156\5\uffff\1\u0157\4\uffff\1\u0155",
			"\1\u0159\5\uffff\1\u015a\4\uffff\1\u0158",
			"",
			"",
			"\1\u0102",
			"\1\u015c\3\uffff\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0161",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"",
			"",
			"\1\u0166",
			"\1\u0168\2\uffff\1\u0167",
			"\1\u0169",
			"",
			"",
			"\1\u00f7",
			"",
			"",
			"",
			"",
			"",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"",
			"",
			"",
			"\1\u0171\14\uffff\1\u0171\73\uffff\1\u0172",
			"",
			"",
			"",
			"",
			"\1\u0174",
			"\1\u0176\3\uffff\1\u0177",
			"\1\u0178\3\uffff\1\u0179",
			"\1\u0125\13\uffff\1\u017a",
			"\1\u017b\3\uffff\1\u017c",
			"\1\u017d",
			"\1\u017e\3\uffff\1\u017f",
			"",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0186\14\uffff\1\u0186",
			"",
			"",
			"",
			"",
			"\1\u0188",
			"",
			"",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b\17\uffff\1\u018c",
			"\1\u018d",
			"\1\u018e",
			"\1\u018b\17\uffff\1\u018c",
			"",
			"",
			"\1\u018f\3\uffff\1\u0190",
			"\1\u0191",
			"\1\u0193",
			"",
			"",
			"\1\u0191",
			"\1\u0193",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
	static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
	static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
	static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
	static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
	static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
	static final short[][] DFA104_transition;

	static {
		int numStates = DFA104_transitionS.length;
		DFA104_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
		}
	}

	protected class DFA104 extends DFA {

		public DFA104(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 104;
			this.eot = DFA104_eot;
			this.eof = DFA104_eof;
			this.min = DFA104_min;
			this.max = DFA104_max;
			this.accept = DFA104_accept;
			this.special = DFA104_special;
			this.transition = DFA104_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( JANUARY | FEBRUARY | MARCH | APRIL | MAY | JUNE | JULY | AUGUST | SEPTEMBER | OCTOBER | NOVEMBER | DECEMBER | SUNDAY | MONDAY | TUESDAY | WEDNESDAY | THURSDAY | FRIDAY | SATURDAY | HOUR | MINUTE | DAY | WEEK | MONTH | YEAR | TODAY | TOMORROW | TONIGHT | YESTERDAY | EVERY | UNTIL | AT | AFTER | AM | PM | T | MIDNIGHT | NOON | MORNING | EVENING | NIGHT | INT_00 | INT_01 | INT_02 | INT_03 | INT_04 | INT_05 | INT_06 | INT_07 | INT_08 | INT_09 | INT_0 | INT_1 | INT_2 | INT_3 | INT_4 | INT_5 | INT_6 | INT_7 | INT_8 | INT_9 | INT_10 | INT_11 | INT_12 | INT_13 | INT_14 | INT_15 | INT_16 | INT_17 | INT_18 | INT_19 | INT_20 | INT_21 | INT_22 | INT_23 | INT_24 | INT_25 | INT_26 | INT_27 | INT_28 | INT_29 | INT_30 | INT_31 | INT_32 | INT_33 | INT_34 | INT_35 | INT_36 | INT_37 | INT_38 | INT_39 | INT_40 | INT_41 | INT_42 | INT_43 | INT_44 | INT_45 | INT_46 | INT_47 | INT_48 | INT_49 | INT_50 | INT_51 | INT_52 | INT_53 | INT_54 | INT_55 | INT_56 | INT_57 | INT_58 | INT_59 | INT_60 | INT_61 | INT_62 | INT_63 | INT_64 | INT_65 | INT_66 | INT_67 | INT_68 | INT_69 | INT_70 | INT_71 | INT_72 | INT_73 | INT_74 | INT_75 | INT_76 | INT_77 | INT_78 | INT_79 | INT_80 | INT_81 | INT_82 | INT_83 | INT_84 | INT_85 | INT_86 | INT_87 | INT_88 | INT_89 | INT_90 | INT_91 | INT_92 | INT_93 | INT_94 | INT_95 | INT_96 | INT_97 | INT_98 | INT_99 | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | TEN | ELEVEN | TWELVE | THIRTEEN | FOURTEEN | FIFTEEN | SIXTEEN | SEVENTEEN | EIGHTEEN | NINETEEN | TWENTY | TWENTYONE | THIRTY | THIRTYONE | FIRST | SECOND | THIRD | FOURTH | FIFTH | SIXTH | SEVENTH | EIGHTH | NINTH | TENTH | ELEVENTH | TWELFTH | THIRTEENTH | FOURTEENTH | FIFTEENTH | SIXTEENTH | SEVENTEENTH | EIGHTEENTH | NINETEENTH | TWENTIETH | THIRTIETH | ST | RD | COLON | COMMA | DASH | SLASH | DOT | PLUS | SINGLE_QUOTE | CURRENT | FOR | IN | AN | OR | AND | ON | OF | THIS | LAST | NEXT | COMING | UPCOMING | FROM | NOW | AGO | BEFORE | BEGINNING | START | WHITE_SPACE | FOOL | BLACK | CHRISTMAS | COLUMBUS | EARTH | EASTER | FATHER | FLAG | GOOD | GROUNDHOG | HALLOWEEN | INAUGURATION | INDEPENDENCE | KWANZAA | LABOR | MLK | MEMORIAL | MOTHER | NEW | PALM | PATRIOT | PRESIDENT | PATRICK | SAINT | TAX | THANKSGIVING | ELECTION | VALENTINE | VETERAN | WINTER | FALL | SPRING | SUMMER | UNKNOWN );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA104_0 = input.LA(1);
						s = -1;
						if ( (LA104_0=='j') ) {s = 1;}
						else if ( (LA104_0=='f') ) {s = 2;}
						else if ( (LA104_0=='m') ) {s = 3;}
						else if ( (LA104_0=='a') ) {s = 4;}
						else if ( (LA104_0=='s') ) {s = 5;}
						else if ( (LA104_0=='o') ) {s = 6;}
						else if ( (LA104_0=='n') ) {s = 7;}
						else if ( (LA104_0=='d') ) {s = 8;}
						else if ( (LA104_0=='l') ) {s = 9;}
						else if ( (LA104_0=='v') ) {s = 10;}
						else if ( (LA104_0=='h') ) {s = 11;}
						else if ( (LA104_0=='c') ) {s = 12;}
						else if ( (LA104_0=='t') ) {s = 13;}
						else if ( (LA104_0=='\u00E0') ) {s = 14;}
						else if ( (LA104_0=='p') ) {s = 15;}
						else if ( (LA104_0=='0') ) {s = 16;}
						else if ( (LA104_0=='1') ) {s = 17;}
						else if ( (LA104_0=='2') ) {s = 18;}
						else if ( (LA104_0=='3') ) {s = 19;}
						else if ( (LA104_0=='4') ) {s = 20;}
						else if ( (LA104_0=='5') ) {s = 21;}
						else if ( (LA104_0=='6') ) {s = 22;}
						else if ( (LA104_0=='7') ) {s = 23;}
						else if ( (LA104_0=='8') ) {s = 24;}
						else if ( (LA104_0=='9') ) {s = 25;}
						else if ( (LA104_0=='u') ) {s = 26;}
						else if ( (LA104_0=='q') ) {s = 27;}
						else if ( (LA104_0=='e') ) {s = 28;}
						else if ( (LA104_0=='\u00E8') ) {s = 29;}
						else if ( (LA104_0==':') ) {s = 30;}
						else if ( (LA104_0==',') ) {s = 31;}
						else if ( (LA104_0=='-') ) {s = 32;}
						else if ( (LA104_0=='/') ) {s = 33;}
						else if ( (LA104_0=='.') ) {s = 34;}
						else if ( (LA104_0=='+') ) {s = 35;}
						else if ( (LA104_0=='\'') ) {s = 36;}
						else if ( (LA104_0=='i') ) {s = 37;}
						else if ( (LA104_0=='@') ) {s = 38;}
						else if ( ((LA104_0 >= '\t' && LA104_0 <= '\n')||LA104_0=='\r'||LA104_0==' '||LA104_0=='\u00A0') ) {s = 39;}
						else if ( (LA104_0=='b') ) {s = 40;}
						else if ( (LA104_0=='x') ) {s = 41;}
						else if ( (LA104_0=='g') ) {s = 42;}
						else if ( (LA104_0=='k') ) {s = 43;}
						else if ( (LA104_0=='\u00E9') ) {s = 44;}
						else if ( ((LA104_0 >= '\u0000' && LA104_0 <= '\b')||(LA104_0 >= '\u000B' && LA104_0 <= '\f')||(LA104_0 >= '\u000E' && LA104_0 <= '\u001F')||(LA104_0 >= '!' && LA104_0 <= '&')||(LA104_0 >= '(' && LA104_0 <= '*')||(LA104_0 >= ';' && LA104_0 <= '?')||(LA104_0 >= 'A' && LA104_0 <= '`')||LA104_0=='r'||LA104_0=='w'||(LA104_0 >= 'y' && LA104_0 <= '\u009F')||(LA104_0 >= '\u00A1' && LA104_0 <= '\u00DF')||(LA104_0 >= '\u00E1' && LA104_0 <= '\u00E7')||(LA104_0 >= '\u00EA' && LA104_0 <= '\uFFFF')) ) {s = 45;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 104, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
