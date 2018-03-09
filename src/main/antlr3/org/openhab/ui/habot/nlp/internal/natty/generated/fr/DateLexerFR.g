lexer grammar DateLexerFR;

@header { package org.openhab.ui.habot.nlp.internal.natty.generated.fr; }

@members {
  private static org.slf4j.Logger _logger =
    org.slf4j.LoggerFactory.getLogger(org.openhab.ui.habot.nlp.internal.natty.generated.fr.DateLexerFR.class);

  @Override
  public void displayRecognitionError(String[] tokenNames, RecognitionException re) {
    String message = getErrorHeader(re);
    try { message += getErrorMessage(re, tokenNames); } catch(Exception e) {}
    _logger.debug(message);
  }
}

// ********** date rules ********** 

JANUARY   : 'janvier'         | 'jan' DOT?;
FEBRUARY  : 'février'         | 'fev' DOT?;
MARCH     : 'mars';
APRIL     : 'avril'           | 'avr' DOT?;
MAY       : 'mai';
JUNE      : 'juin';
JULY      : 'juillet'         | 'juil' DOT?;
AUGUST    : 'août'            | 'aout' DOT?;
SEPTEMBER : 'septembre'       | 'sept' DOT; // problem with 7 so enforce a dot
OCTOBER   : 'octobre'         | 'oct' DOT?;
NOVEMBER  : 'novembre'        | 'nov' DOT?;
DECEMBER  : 'décembre'        | 'déc' DOT?;
  
SUNDAY    : 'dimanche'  's'?  | 'dim' DOT?;
MONDAY    : 'lundi'     's'?  | 'lun' DOT?;
TUESDAY   : 'mardi'     's'?  | 'mar' DOT?;
WEDNESDAY : 'mercredi'  's'?  | 'mer' DOT?;
THURSDAY  : 'jeudi'     's'?  | 'jeu' DOT?;
FRIDAY    : 'vendredi'  's'?  | 'ven' DOT?;
SATURDAY  : 'samedi'    's'?  | 'sam' DOT?;

HOUR   : 'heure'  | 'heures'  | 'h' DOT?;
MINUTE : 'minute' | 'minutes' | 'min' DOT? | 'm' DOT?;
DAY    : 'jour'   | 'jours' ;
WEEK   : 'semaine'| 'semaines'| 'sem' DOT?;
MONTH  : 'mois';
YEAR   : 'année'  | 'annee' | 'années' | 'annees' | 'an' | 'ans';

TODAY     : 'aujourd' SINGLE_QUOTE? 'hui';
TOMORROW  : 'demain';
TONIGHT   : 'ce soir'; 
YESTERDAY : 'hier';

// ********** recurrence rules **********

EVERY : 'tous' | 'tous les' | 'toutes les';
UNTIL : 'jusqu' SINGLE_QUOTE? 'à';

// ********** time rules ********** 

AT        : 'à' | '@';
AFTER     : 'après';
// PAST      : 'dernier';
AM : 'am' | 'a.m' DOT? | 'a_m' | 'a';
PM : 'pm' | 'p.m' DOT? | 'p_m' | 'p';
T  : 't';

// MILITARY_HOUR_SUFFIX : 'h';

MIDNIGHT  : 'minuit';
NOON      : 'midi'     | 'après-midi' | 'apres-midi';
MORNING   : 'matin';
EVENING   : 'soir' | 'soirée';
NIGHT     : 'nuit'; 

// ********* numeric rules **********

INT_00 : '00';
INT_01 : '01';
INT_02 : '02';
INT_03 : '03';
INT_04 : '04';
INT_05 : '05';
INT_06 : '06';
INT_07 : '07';
INT_08 : '08';
INT_09 : '09';
INT_0  : '0';
INT_1  : '1';
INT_2  : '2';
INT_3  : '3';
INT_4  : '4';
INT_5  : '5';
INT_6  : '6';
INT_7  : '7';
INT_8  : '8';
INT_9  : '9';
INT_10 : '10';
INT_11 : '11';
INT_12 : '12';
INT_13 : '13';
INT_14 : '14';
INT_15 : '15';
INT_16 : '16';
INT_17 : '17';
INT_18 : '18';
INT_19 : '19';
INT_20 : '20';
INT_21 : '21';
INT_22 : '22';
INT_23 : '23';
INT_24 : '24';
INT_25 : '25';
INT_26 : '26';
INT_27 : '27';
INT_28 : '28';
INT_29 : '29';
INT_30 : '30';
INT_31 : '31';
INT_32 : '32';
INT_33 : '33';
INT_34 : '34';
INT_35 : '35';
INT_36 : '36';
INT_37 : '37';
INT_38 : '38';
INT_39 : '39';
INT_40 : '40';
INT_41 : '41';
INT_42 : '42';
INT_43 : '43';
INT_44 : '44';
INT_45 : '45';
INT_46 : '46';
INT_47 : '47';
INT_48 : '48';
INT_49 : '49';
INT_50 : '50';
INT_51 : '51';
INT_52 : '52';
INT_53 : '53';
INT_54 : '54';
INT_55 : '55';
INT_56 : '56';
INT_57 : '57';
INT_58 : '58';
INT_59 : '59';
INT_60 : '60';
INT_61 : '61';
INT_62 : '62';
INT_63 : '63';
INT_64 : '64';
INT_65 : '65';
INT_66 : '66';
INT_67 : '67';
INT_68 : '68';
INT_69 : '69';
INT_70 : '70';
INT_71 : '71';
INT_72 : '72';
INT_73 : '73';
INT_74 : '74';
INT_75 : '75';
INT_76 : '76';
INT_77 : '77';
INT_78 : '78';
INT_79 : '79';
INT_80 : '80';
INT_81 : '81';
INT_82 : '82';
INT_83 : '83';
INT_84 : '84';
INT_85 : '85';
INT_86 : '86';
INT_87 : '87';
INT_88 : '88';
INT_89 : '89';
INT_90 : '90';
INT_91 : '91';
INT_92 : '92';
INT_93 : '93';
INT_94 : '94';
INT_95 : '95';
INT_96 : '96';
INT_97 : '97';
INT_98 : '98';
INT_99 : '99';

ONE       : 'un';
TWO       : 'deux';
THREE     : 'trois';
FOUR      : 'quatre';
FIVE      : 'cinq';
SIX       : 'six';
SEVEN     : 'sept';
EIGHT     : 'huit';
NINE      : 'neuf';
TEN       : 'dix';
ELEVEN    : 'onze';
TWELVE    : 'douze';
THIRTEEN  : 'treize';
FOURTEEN  : 'quatorze';
FIFTEEN   : 'quinze';
SIXTEEN   : 'seize';
SEVENTEEN : 'dix-sept' | 'dix sept';
EIGHTEEN  : 'dix-huit' | 'dix huit';
NINETEEN  : 'dix-neuf' | 'dix neuf';
TWENTY    : 'vingt';
TWENTYONE : 'vingt et un' | 'vingt-et-un';
THIRTY    : 'trente';
THIRTYONE : 'trente et un' | 'trente-et-un';

FIRST          : 'premier';
SECOND         : 'deuxième' | 'deuxieme' | 'second';
THIRD          : 'troisième' | 'troisieme';
FOURTH         : 'quatrième';
FIFTH          : 'cinquième';
SIXTH          : 'sixième';
SEVENTH        : 'septième';
EIGHTH         : 'huitième';
NINTH          : 'neuvième';
TENTH          : 'dixième';
ELEVENTH       : 'onzième';
TWELFTH        : 'douzième';
THIRTEENTH     : 'treizième';
FOURTEENTH     : 'quatorzième';
FIFTEENTH      : 'quinzième';
SIXTEENTH      : 'seizième';
SEVENTEENTH    : 'dix-septième' | 'dix septième';
EIGHTEENTH     : 'dix-huitième' | 'dix huitième';
NINETEENTH     : 'dix-neuvième' | 'dix neuvième';
TWENTIETH      : 'vingtième';
THIRTIETH      : 'trentième';

// ********** suffixes **********
ST : 'er';
RD : 'nd' | 'è' | 'ème' | 'eme';
   
// ********** common rules **********

COLON : ':';
COMMA : ',';
DASH  : '-';
SLASH : '/';
DOT   : '.';
PLUS  : '+';
SINGLE_QUOTE : '\'';

CURRENT   : 'courant';
FOR       : 'pour';
IN        : 'dans';
AN        : 'un' | 'une';
// THE       : 'le';
OR        : 'ou';
AND       : 'et';
// TO        : 'à';
ON        : 'le';
OF        : 'de';
THIS      : 'ce' | 'cette';
LAST      : 'dernier';
NEXT      : 'prochain';
COMING    : 'suivant';
UPCOMING  : 'qui vient';
FROM      : 'from';
NOW       : 'now';
AGO       : 'il y a';
BEFORE    : 'avant';
BEGINNING : 'à partir de';
START     : 'depuis';

WHITE_SPACE
  : (DOT | SPACE)+
  ;
  
// ********** holiday specific **********

FOOL         : 'fool' | 'fools' | 'fool' SINGLE_QUOTE 's';
BLACK        : 'black';
CHRISTMAS    : ('christmas' | 'xmas' | 'x-mas') 'es'?;
COLUMBUS     : 'columbus';
EARTH        : 'earth';
EASTER       : 'easter';
FATHER       : 'father' | 'fathers' | 'father' SINGLE_QUOTE 's';
FLAG         : 'flag';
GOOD         : 'good';
GROUNDHOG    : GROUND WHITE_SPACE? HOG SINGLE_QUOTE? 's'?;
HALLOWEEN    : ('halloween' | 'haloween') 's'?;
INAUGURATION : 'inauguration' | 'inaugaration';
INDEPENDENCE : 'independence' | 'independance';
KWANZAA      : ('kwanza' 'a'?) 's'?;
LABOR        : 'labor';
MLK          : 'mlk' | 'martin' WHITE_SPACE 'luther' WHITE_SPACE 'king' (COMMA SPACE 'jr' DOT)?;
MEMORIAL     : 'memorial';
MOTHER       : 'mother' SINGLE_QUOTE? 's'?;
NEW          : 'new';
PALM         : 'palm';
PATRIOT      : 'patriot' SINGLE_QUOTE? 's'?;
PRESIDENT    : 'president' SINGLE_QUOTE? 's'?;
PATRICK      : ('patrick' | 'patty' | 'paddy') SINGLE_QUOTE? 's'?;
SAINT        : 'saint';
TAX          : 'tax';
THANKSGIVING : 'thanksgiving' 's'?;
ELECTION     : 'election';
VALENTINE    : 'valentine' SINGLE_QUOTE? 's'?;
VETERAN      : 'veteran' SINGLE_QUOTE? 's'?;
fragment GROUND : 'ground';
fragment HOG    : 'hog';

// ********** season specific **********

WINTER : 'hiver' 's'?;
FALL   : 'automne'   's'?;
SPRING : 'printemps' 's'?;
SUMMER : 'été' 's'?;
  
UNKNOWN
  : UNKNOWN_CHAR
  ;
  
fragment UNKNOWN_CHAR
  : ~(SPACE | DOT)
  ;
  
fragment DIGIT : '0'..'9';
  
fragment SPACE : ' ' | '\t' | '\n' | '\r' | '\u00A0';