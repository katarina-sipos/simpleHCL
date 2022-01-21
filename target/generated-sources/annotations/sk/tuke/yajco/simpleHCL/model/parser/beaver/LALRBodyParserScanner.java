package sk.tuke.yajco.simpleHCL.model.parser.beaver;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import yajco.lexer.LexerException;
import yajco.lexer.Lexer;
import yajco.lexer.Token;
import beaver.Symbol;
import beaver.Scanner;
import sk.tuke.yajco.simpleHCL.model.parser.beaver.LALRBodyParser.Terminals;

public class LALRBodyParserScanner extends Scanner {
    private static final LinkedHashMap<Integer, Pattern> tokens = new LinkedHashMap<Integer, Pattern>();
    private static final List<Pattern> skips = new ArrayList<Pattern>();

    private final Lexer lexer;

    static {
        tokens.put((int) Terminals.SYMBOL_44, Pattern.compile("[,]"));
        tokens.put((int) Terminals.SYMBOL_93, Pattern.compile("[]]"));
        tokens.put((int) Terminals.SYMBOL_61, Pattern.compile("[=]"));
        tokens.put((int) Terminals.SYMBOL_91, Pattern.compile("\\["));

        tokens.put((int) Terminals.bool, Pattern.compile("(true)|(false)"));
        tokens.put((int) Terminals.null_value, Pattern.compile("null"));
        tokens.put((int) Terminals.number, Pattern.compile("[0-9]+"));
        tokens.put((int) Terminals.name, Pattern.compile("[a-z]+[A-Za-z0-9]*"));

        skips.add(Pattern.compile("\\s"));
    }

    public LALRBodyParserScanner(String input) {
        this.lexer = new Lexer(input, tokens, skips);
    }

    @Override
    public Symbol nextToken() throws IOException, Scanner.Exception {
        try {
            Token token = this.lexer.nextToken();
            if (token.isEOF()) {
                return new Symbol(Terminals.EOF, this.lexer.getLine(), this.lexer.getColumn());
            } else {
                int line = token.getRange().getStart().getLine();
                int column = token.getRange().getStart().getColumn();
                int length = token.getRange().getEnd().getIndex() - token.getRange().getStart().getIndex() + 1;
                return new Symbol((short) token.getType(), line, column, length, token.getText());
            }
        } catch (LexerException e) {
            Scanner.Exception exception = new Scanner.Exception(
                this.lexer.getLine(), this.lexer.getColumn(), e.getMessage());
            // Beaver sa pokusa o error recovering, a preto je nutne, aby sme preskocili dany nespravny znak, pretoze ak
            // sa tak neucini, tak vznikne nekonecny cyklus a vypisy na konzolu s danou chybou
            this.lexer.consumeInput(1);
            throw exception;
        }
    }
}
