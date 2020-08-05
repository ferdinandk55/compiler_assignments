package inter;         // File Arith.java
import lexer.*; import symbols.*;
public class Arith extends Op {
	public Expr exprl, expr2;
	public Arith(Token tok, Expr xl, Expr x2)  {
		super(tok , null); exprl = xl; expr2 = x2;
		type = Type.max(exprl.type, expr2.type);
		if (type == null ) error( "type error");
	}
	public Expr gen() {
		return new Arith(op, exprl.reduce(), expr2.reduce());
	}
	public String toString() {
		return expr1.toString()+" "+op.toString()+" "+expr2.toString() ;
	}
}
