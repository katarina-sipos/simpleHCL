# simpleHCL Language Model

**simpleHCL** is a language derived from the [HCL](https://github.com/hashicorp/hcl/blob/main/hclsyntax/spec.md) language.
This is the model of the language defined in the way of [YAJCo](https://github.com/kpi-tuke/yajco) annotation-based parser generator. This language model serves as an example for the language composition with YAJCo.

The **simpleHCL** grammar:

```
Body = Attribute*;
Attribute = Identifier "=" Expression;
Expression = ExprTerm;
ExprTerm = (LiteralValue |CollectionValue);
LiteralValue = (NumericLit | Boolean| Null)
Boolean = ("true" | "false" );
Null = "null";
CollectionValue = Tuple
Tuple = "[" ( (Expression ("," Expression)* ","?)?) "]";
```
