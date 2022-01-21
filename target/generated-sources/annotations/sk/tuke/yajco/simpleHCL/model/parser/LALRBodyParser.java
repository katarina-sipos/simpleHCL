package sk.tuke.yajco.simpleHCL.model.parser;

import sk.tuke.yajco.simpleHCL.model.parser.beaver.LALRBodyParserScanner;

public class LALRBodyParser implements yajco.generator.parsergen.Parser<sk.tuke.yajco.simpleHCL.model.Body, ParseException> {
    private static sk.tuke.yajco.simpleHCL.model.parser.beaver.LALRBodyParser parser;

    @Override
    public sk.tuke.yajco.simpleHCL.model.Body parse(String input) throws ParseException {
        LALRBodyParserScanner scanner = new LALRBodyParserScanner(input);
        if (parser == null) {
            parser = new sk.tuke.yajco.simpleHCL.model.parser.beaver.LALRBodyParser();
        }

        try {
            yajco.ReferenceResolver referenceResolver = yajco.ReferenceResolver.createInstance();
            sk.tuke.yajco.simpleHCL.model.Body root = ((sk.tuke.yajco.simpleHCL.model.parser.beaver.SymbolWrapper<sk.tuke.yajco.simpleHCL.model.Body>) parser.parse(scanner)).getWrappedObject();
            referenceResolver.resolveReferences();
            return root;
        } catch (java.io.IOException e) {
            throw new ParseException("Problem parsing source code ", e);
        } catch (sk.tuke.yajco.simpleHCL.model.parser.beaver.LALRBodyParser.Exception e) {
            throw new ParseException("Problem parsing source code ", e);
        }
    }

    @Override
    public sk.tuke.yajco.simpleHCL.model.Body parse(java.io.Reader reader) throws ParseException {
        try {
            return parse(readAsString(reader));
        } catch(java.io.IOException e) {
            throw new ParseException("Problem reading input file", e);
        }
    }

    private String readAsString(java.io.Reader r) throws java.io.IOException {
        StringBuilder sb = new StringBuilder();
        java.io.BufferedReader br = new java.io.BufferedReader(r);
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        return sb.toString();
    }
}
