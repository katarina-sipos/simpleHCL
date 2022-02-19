package sk.tuke.yajco.simpleHCL;

import sk.tuke.yajco.simpleHCL.model.parser.LALRBodyParser;
import sk.tuke.yajco.simpleHCL.model.parser.ParseException;


public class App {
    public static void main( String[] args ) throws ParseException {
        String input = "final a =8";

        LALRBodyParser parser = new LALRBodyParser();
        parser.parse(input);
//        for(var a: parser.parse(input).getAttributes().getAttributes()){
//            System.out.println(a.getName());
//        }
    }
}
