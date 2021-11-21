// $ANTLR 3.5.2 MyGrammar.g 2020-03-22 21:45:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MyGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int COND=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int STRING=7;
	public static final int WS=8;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MyGrammarLexer() {} 
	public MyGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MyGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "MyGrammar.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:2:6: ( '(' )
			// MyGrammar.g:2:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:3:7: ( ')' )
			// MyGrammar.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:4:7: ( '+' )
			// MyGrammar.g:4:9: '+'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:5:7: ( ',' )
			// MyGrammar.g:5:9: ','
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:6:7: ( ':' )
			// MyGrammar.g:6:9: ':'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:7:7: ( '=' )
			// MyGrammar.g:7:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:8:7: ( '[' )
			// MyGrammar.g:8:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:9:7: ( ']' )
			// MyGrammar.g:9:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:10:7: ( 'and' )
			// MyGrammar.g:10:9: 'and'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:11:7: ( 'for' )
			// MyGrammar.g:11:9: 'for'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:12:7: ( 'if' )
			// MyGrammar.g:12:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:13:7: ( 'in' )
			// MyGrammar.g:13:9: 'in'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:14:7: ( 'not' )
			// MyGrammar.g:14:9: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:15:7: ( 'or' )
			// MyGrammar.g:15:9: 'or'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:16:7: ( 'print' )
			// MyGrammar.g:16:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:50:4: ( ( '-' )? ( '0' .. '9' )+ )
			// MyGrammar.g:50:5: ( '-' )? ( '0' .. '9' )+
			{
			// MyGrammar.g:50:5: ( '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// MyGrammar.g:50:6: '-'
					{
					match('-'); 
					}
					break;

			}

			// MyGrammar.g:50:11: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// MyGrammar.g:
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
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:51:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\_' )* )
			// MyGrammar.g:51:4: ( 'a' .. 'z' | 'A' .. 'Z' | '\\_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// MyGrammar.g:51:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// MyGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:52:7: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\\'' )
			// MyGrammar.g:52:8: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* '\\''
			{
			match('\''); 
			// MyGrammar.g:52:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// MyGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop4;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:53:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// MyGrammar.g:53:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// MyGrammar.g:53:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// MyGrammar.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COND"
	public final void mCOND() throws RecognitionException {
		try {
			int _type = COND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// MyGrammar.g:54:5: ( ( '>' | '<' | '>=' | '<=' | '==' | '!=' ) )
			// MyGrammar.g:54:6: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
			{
			// MyGrammar.g:54:6: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
			int alt6=6;
			switch ( input.LA(1) ) {
			case '>':
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='=') ) {
					alt6=3;
				}

				else {
					alt6=1;
				}

				}
				break;
			case '<':
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2=='=') ) {
					alt6=4;
				}

				else {
					alt6=2;
				}

				}
				break;
			case '=':
				{
				alt6=5;
				}
				break;
			case '!':
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// MyGrammar.g:54:7: '>'
					{
					match('>'); 
					}
					break;
				case 2 :
					// MyGrammar.g:54:11: '<'
					{
					match('<'); 
					}
					break;
				case 3 :
					// MyGrammar.g:54:15: '>='
					{
					match(">="); 

					}
					break;
				case 4 :
					// MyGrammar.g:54:20: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// MyGrammar.g:54:25: '=='
					{
					match("=="); 

					}
					break;
				case 6 :
					// MyGrammar.g:54:30: '!='
					{
					match("!="); 

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
	// $ANTLR end "COND"

	@Override
	public void mTokens() throws RecognitionException {
		// MyGrammar.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | INT | ID | STRING | WS | COND )
		int alt7=20;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt7=1;
			}
			break;
		case ')':
			{
			alt7=2;
			}
			break;
		case '+':
			{
			alt7=3;
			}
			break;
		case ',':
			{
			alt7=4;
			}
			break;
		case ':':
			{
			alt7=5;
			}
			break;
		case '=':
			{
			int LA7_6 = input.LA(2);
			if ( (LA7_6=='=') ) {
				alt7=20;
			}

			else {
				alt7=6;
			}

			}
			break;
		case '[':
			{
			alt7=7;
			}
			break;
		case ']':
			{
			alt7=8;
			}
			break;
		case 'a':
			{
			int LA7_9 = input.LA(2);
			if ( (LA7_9=='n') ) {
				int LA7_21 = input.LA(3);
				if ( (LA7_21=='d') ) {
					int LA7_28 = input.LA(4);
					if ( ((LA7_28 >= '0' && LA7_28 <= '9')||(LA7_28 >= 'A' && LA7_28 <= 'Z')||LA7_28=='_'||(LA7_28 >= 'a' && LA7_28 <= 'z')) ) {
						alt7=17;
					}

					else {
						alt7=9;
					}

				}

				else {
					alt7=17;
				}

			}

			else {
				alt7=17;
			}

			}
			break;
		case 'f':
			{
			int LA7_10 = input.LA(2);
			if ( (LA7_10=='o') ) {
				int LA7_22 = input.LA(3);
				if ( (LA7_22=='r') ) {
					int LA7_29 = input.LA(4);
					if ( ((LA7_29 >= '0' && LA7_29 <= '9')||(LA7_29 >= 'A' && LA7_29 <= 'Z')||LA7_29=='_'||(LA7_29 >= 'a' && LA7_29 <= 'z')) ) {
						alt7=17;
					}

					else {
						alt7=10;
					}

				}

				else {
					alt7=17;
				}

			}

			else {
				alt7=17;
			}

			}
			break;
		case 'i':
			{
			switch ( input.LA(2) ) {
			case 'f':
				{
				int LA7_23 = input.LA(3);
				if ( ((LA7_23 >= '0' && LA7_23 <= '9')||(LA7_23 >= 'A' && LA7_23 <= 'Z')||LA7_23=='_'||(LA7_23 >= 'a' && LA7_23 <= 'z')) ) {
					alt7=17;
				}

				else {
					alt7=11;
				}

				}
				break;
			case 'n':
				{
				int LA7_24 = input.LA(3);
				if ( ((LA7_24 >= '0' && LA7_24 <= '9')||(LA7_24 >= 'A' && LA7_24 <= 'Z')||LA7_24=='_'||(LA7_24 >= 'a' && LA7_24 <= 'z')) ) {
					alt7=17;
				}

				else {
					alt7=12;
				}

				}
				break;
			default:
				alt7=17;
			}
			}
			break;
		case 'n':
			{
			int LA7_12 = input.LA(2);
			if ( (LA7_12=='o') ) {
				int LA7_25 = input.LA(3);
				if ( (LA7_25=='t') ) {
					int LA7_32 = input.LA(4);
					if ( ((LA7_32 >= '0' && LA7_32 <= '9')||(LA7_32 >= 'A' && LA7_32 <= 'Z')||LA7_32=='_'||(LA7_32 >= 'a' && LA7_32 <= 'z')) ) {
						alt7=17;
					}

					else {
						alt7=13;
					}

				}

				else {
					alt7=17;
				}

			}

			else {
				alt7=17;
			}

			}
			break;
		case 'o':
			{
			int LA7_13 = input.LA(2);
			if ( (LA7_13=='r') ) {
				int LA7_26 = input.LA(3);
				if ( ((LA7_26 >= '0' && LA7_26 <= '9')||(LA7_26 >= 'A' && LA7_26 <= 'Z')||LA7_26=='_'||(LA7_26 >= 'a' && LA7_26 <= 'z')) ) {
					alt7=17;
				}

				else {
					alt7=14;
				}

			}

			else {
				alt7=17;
			}

			}
			break;
		case 'p':
			{
			int LA7_14 = input.LA(2);
			if ( (LA7_14=='r') ) {
				int LA7_27 = input.LA(3);
				if ( (LA7_27=='i') ) {
					int LA7_34 = input.LA(4);
					if ( (LA7_34=='n') ) {
						int LA7_38 = input.LA(5);
						if ( (LA7_38=='t') ) {
							int LA7_39 = input.LA(6);
							if ( ((LA7_39 >= '0' && LA7_39 <= '9')||(LA7_39 >= 'A' && LA7_39 <= 'Z')||LA7_39=='_'||(LA7_39 >= 'a' && LA7_39 <= 'z')) ) {
								alt7=17;
							}

							else {
								alt7=15;
							}

						}

						else {
							alt7=17;
						}

					}

					else {
						alt7=17;
					}

				}

				else {
					alt7=17;
				}

			}

			else {
				alt7=17;
			}

			}
			break;
		case '-':
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt7=16;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt7=17;
			}
			break;
		case '\'':
			{
			alt7=18;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt7=19;
			}
			break;
		case '!':
		case '<':
		case '>':
			{
			alt7=20;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// MyGrammar.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// MyGrammar.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// MyGrammar.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// MyGrammar.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// MyGrammar.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// MyGrammar.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// MyGrammar.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// MyGrammar.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// MyGrammar.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// MyGrammar.g:1:63: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// MyGrammar.g:1:69: T__19
				{
				mT__19(); 

				}
				break;
			case 12 :
				// MyGrammar.g:1:75: T__20
				{
				mT__20(); 

				}
				break;
			case 13 :
				// MyGrammar.g:1:81: T__21
				{
				mT__21(); 

				}
				break;
			case 14 :
				// MyGrammar.g:1:87: T__22
				{
				mT__22(); 

				}
				break;
			case 15 :
				// MyGrammar.g:1:93: T__23
				{
				mT__23(); 

				}
				break;
			case 16 :
				// MyGrammar.g:1:99: INT
				{
				mINT(); 

				}
				break;
			case 17 :
				// MyGrammar.g:1:103: ID
				{
				mID(); 

				}
				break;
			case 18 :
				// MyGrammar.g:1:106: STRING
				{
				mSTRING(); 

				}
				break;
			case 19 :
				// MyGrammar.g:1:113: WS
				{
				mWS(); 

				}
				break;
			case 20 :
				// MyGrammar.g:1:116: COND
				{
				mCOND(); 

				}
				break;

		}
	}



}
