package sk.tuke.yajco.simpleHCL;

import sk.tuke.yajco.simpleHCL.model.parser.LALRBodyParser;
import sk.tuke.yajco.simpleHCL.model.parser.ParseException;

public class App {
    public static void main( String[] args ) throws ParseException {
        String input = "a =[4,1]";

        LALRBodyParser parser = new LALRBodyParser();
//        for(var a: parser.parse(input).getAttributes().getAttributes()){
//            System.out.println(a.getName());
//        }
    }
}
