package main;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTVisitor;
import ANTLR.ParserTParser.*;


public class MyVisitor extends ParserTBaseVisitor<Integer> {
	private Map<String, String> variables = new HashMap<String,String>();
	private Map<String, String> constantes = new HashMap<String,String>();
	private Map<String, String> integer = new HashMap<String,String>();
	private Map<String, String> strings = new HashMap<String,String>();
	private Map<String, String> booleanos = new HashMap<String,String>();
	
	public Integer visitNumero(NumeroContext ctx) {
		
		
		for (int i ;   i < ctx.getChildCount(); i++) {
			ctx.getChild(i).toStringTree();
			Token auxToken;
			auxToken.getType();
		}
		
		
		
		
		return numero;
	}
	
	
	
	
	public Integer visitVar_decl(Var_declContext ctx) {
		String texto = ctx.texto().getText();

		if( variables.containsKey(texto) || constantes.containsKey(texto) ) {
			throw new IllegalArgumentException("Duplicate local '"+ texto + "'");
		}else {
			if (ctx.INT() != null) {
				
				integer.put(texto, null);
				variables.put(texto, null);
				
			}else if (ctx.STRING() != null) {
				
				strings.put(texto, null);
				variables.put(texto, null);
				
			}else if (ctx.BOOL() != null) {
				
				booleanos.put(texto, null);
				variables.put(texto, null);
			}else
			throw new IllegalArgumentException("Unexpected error");
		}
		
		return 0;
	}
	
	public Integer visitConst_decl(Const_declContext ctx) {
		String texto = ctx.texto().getText();

		if( variables.containsKey(texto) || constantes.containsKey(texto) ) {
			throw new IllegalArgumentException("Duplicate local '"+ texto + "'");
		}else {
			if (ctx.INT() != null) {
				
				integer.put(texto, null);
				constantes.put(texto, null);
				
			}else if (ctx.STRING() != null) {
				
				strings.put(texto, null);
				constantes.put(texto, null);
				
			}else if (ctx.BOOL() != null) {
				
				booleanos.put(texto, null);
				constantes.put(texto, null);
			}else
			throw new IllegalArgumentException("Unexpected error");
		}
		
		return 0;
	}
	
	public Integer visitInt_decl(Int_declContext ctx) {
		String texto = ctx.texto().getText();
		String numero = ctx.numero().getText();

		if( variables.containsKey(texto) || constantes.containsKey(texto) ) {
			throw new IllegalArgumentException("Duplicate local '"+ texto + "'");
		}else {
			
			integer.put(texto, numero);
			variables.put(texto, numero);
		}
		
		return 0;
	}
	
	public Integer visitVar_asignar(Var_asignarContext ctx) {
		String texto = ctx.texto().get(0).getText();
		
		if( constantes.containsKey(texto) ) {
			throw new IllegalArgumentException("Invalid assignment to const '"+ texto + "'");
		}else if ( !variables.containsKey(texto) ) {
			throw new IllegalArgumentException("'"+ texto + "' cannot be resolved to a variable");
		}else {
			if (integer.containsKey(texto)) {
				
				if (ctx.numero() != null) {
					String numero = ctx.numero().getText();
					variables.replace(texto, numero);
					integer.replace(texto, numero);
				}else if (ctx.operacion() != null) {
					
				}else {
					throw new IllegalArgumentException("Invalid assignment to integer '"+ texto + "'");
				}
				
				
			}else if (strings.containsKey(texto)) {
				
				if (ctx.texto().size() > 1) {
					String texto2 = ctx.texto().get(1).getText();
					variables.replace(texto, texto2);
					strings.replace(texto, texto2);
				}else {
					throw new IllegalArgumentException("Invalid assignment to string '"+ texto + "'");
				}
				
				
			}else if (booleanos.containsKey(texto)) {
				
				
				
			}
			
			
		}
		
		return 0;
		
	}
}

