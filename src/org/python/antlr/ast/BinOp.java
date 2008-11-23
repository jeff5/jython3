// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.python.antlr.ListWrapper;
import org.python.core.PyInteger;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class BinOp extends exprType {
    private exprType left;
    public exprType getInternalLeft() {
        return left;
    }
    public Object getLeft() {
        return left;
    }
    public void setLeft(Object left) {
        if (left instanceof exprType) {
            this.left = (exprType)left;
        } else if (left instanceof Integer) {
            this.left = new Num(new PyInteger((Integer)left));
        }
    }


    private operatorType op;
    public operatorType getInternalOp() {
        return op;
    }
    public Object getOp() {
        return op;
    }
    public void setOp(Object op) {
        this.op = (operatorType)op;
    }

    private exprType right;
    public exprType getInternalRight() {
        return right;
    }
    public Object getRight() {
        return right;
    }
    public void setRight(Object right) {
        if (right instanceof exprType) {
            this.right = (exprType)right;
        } else if (right instanceof Integer) {
            this.right = new Num(new PyInteger((Integer)right));
        }
    }

    private final static String[] fields = new String[] {"left", "op", "right"};
    public String[] get_fields() { return fields; }

    public BinOp(exprType left, operatorType op, exprType right) {
        this.left = left;
        addChild(left);
        this.op = op;
        this.right = right;
        addChild(right);
    }

    public BinOp() {
    }

    public BinOp(Object left, operatorType op, Object right) {
        setLeft(left);
        setOp(op);
        setRight(right);
    }

    public BinOp(Token token, exprType left, operatorType op, exprType right) {
        super(token);
        this.left = left;
        addChild(left);
        this.op = op;
        this.right = right;
        addChild(right);
    }

    public BinOp(Integer ttype, Token token, exprType left, operatorType op,
    exprType right) {
        super(ttype, token);
        this.left = left;
        addChild(left);
        this.op = op;
        this.right = right;
        addChild(right);
    }

    public BinOp(PythonTree tree, exprType left, operatorType op, exprType
    right) {
        super(tree);
        this.left = left;
        addChild(left);
        this.op = op;
        this.right = right;
        addChild(right);
    }

    public String toString() {
        return "BinOp";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("BinOp(");
        sb.append("left=");
        sb.append(dumpThis(left));
        sb.append(",");
        sb.append("op=");
        sb.append(dumpThis(op));
        sb.append(",");
        sb.append("right=");
        sb.append(dumpThis(right));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitBinOp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (left != null)
            left.accept(visitor);
        if (right != null)
            right.accept(visitor);
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
