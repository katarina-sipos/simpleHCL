@Parser(
        mainNode = "sk.tuke.yajco.simpleHCL.model.Body",
        skips = {@Skip("\\s")},
        tokens = {
                @TokenDef(name = "name", regexp = "[a-z]+[A-Za-z0-9]*"),
                @TokenDef(name = "bool", regexp = "(true)|(false)"),
                @TokenDef(name = "null_value", regexp = "null"),
                @TokenDef(name = "number", regexp = "[0-9]+")
        }
//        options = {@Option(name = "yajco.generateTools", value = "prettyprinter")}
)
package sk.tuke.yajco.simpleHCL.model;

import yajco.annotation.config.Parser;
import yajco.annotation.config.Skip;
import yajco.annotation.config.TokenDef;